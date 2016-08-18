
# NetApp SANtricity Client Library - Java SDK

[![Build Status](http://10.113.1.247:8080/buildStatus/icon?job=Java SDK)](http://10.113.1.247:8080/job/Java SDK)
##Requirements

 The SANtricity Java SDK client library requires an installation of [Apache Maven](https://maven.apache.org/).


##Installation

The Java SDK client library must be installed to your local Maven repository.

To install the Java SDK, perform the following command: ``mvn install``

Optionally, you can deploy the Java SDK installation to a remote Maven repository.

To deploy the Java SDK installation remotely, configure the settings of the repository and perform the following command: ``mvn deploy``


###Dependencies


####Maven Users

The following dependency must be added to your project's POM:

```xml
<dependency>
	<groupId>com.netapp.santricity</groupId>
	<artifactId>santricity-java-client</artifactId>
	<version>1.0</version>
	<scope>compile</scope>
</dependency>
```

####Gradle Users

The following groovy dependency must be added to your project's build file:

```groovy
compile "com.netapp.santricity:santricity-java-client:1.0"
```

####All Other Users

First, enter the following command to generate the JAR file:	mvn package

Next, manually install the following JAR files:

 * target/santricity-java-client-1.0.jar
 * target/lib/\*.jar


###Getting started

 Once installation is complete, enter the following command to get started using the
 Java SDK:

```java
import com.netapp.santricity.ApiClient;
import com.netapp.santricity.ApiException;
import com.netapp.santricity.api.v2.StorageSystemsApi;
import com.netapp.santricity.models.v2.*;
import com.netapp.santricity.api.v2.DiagnosticsApi;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * Sample code illustrates SDK usage for gathering failure list
 */
public class FailureList {
	public static void main(String[] args) {
		ApiClient apiClient = new ApiClient();
		/**
		 * Configure the ApiClient with the Santricity proxy URL & set proper credentials
		 */
		 apiClient.setBasePath("http://localhost:8080/devmgr/v2");
		 apiClient.setUsername("rw");
		 apiClient.setPassword("rw");

		/**
		 * Add a storage system to the proxy
		 */
		 String sysId = "config1";
		 StorageSystemsApi ssApi = new StorageSystemsApi(apiClient);
		 StorageSystemCreateRequest ssCreatReq = new StorageSystemCreateRequest();
		 List<String> ctrlAddrs = new ArrayList<String>();
		 ctrlAddrs.add("<Ctrl A IP Address>");
		 ctrlAddrs.add("<Ctrl B IP Address>");
		 ssCreatReq.setControllerAddresses(ctrlAddrs);
		 ssCreatReq.setId(sysId);

		 try {
			 ssApi.newStorageSystem(ssCreatReq);
			 sleep(1000);                 // one second
			 /**
			  * Get List of failure events
			  */
			 DiagnosticsApi diag = new DiagnosticsApi(apiClient);
			 sleep(1000);                 // one second
			 List<FailureData> failureList = diag.getFailures(sysId, false);
			 for (FailureData failData : failureList) {
				 System.out.println("Failure name: " + failData.getFailureType().name());
	         }
		 } catch (ApiException apiExp) {
			 System.out.println("An exception occurred. Please check error: \n " + apiExp.getMessage());
		 } catch (InterruptedException ex) {
			 currentThread().interrupt();
	     }
	}
}
```

###Configuring Java to trust REST API Self Signed Certificates

If you need to use the default self-signed certificate, perform the following steps
to permit the Java application to trust the certificate for the REST API.

1.	From a browser, navigate to the API documentation using HTTPS (e.g., https://hostname.foo.com:8443/devmgr/docs)

2.	Export the certificate to a file.

	**NOTE:** Export to the default DER encoding is acceptable.

3.	Use the keytool command to import the certificate to the cacerts file for your jvm.

		**Example:**
		```
		cd C:\Program Files\Java\jdk1.8.0_65
		jre\bin\keytool.exe -import -trustcacerts -keystore jre\lib\security\cacerts -alias rest-host-cert -file rest-host.cer
		```

	**NOTE:** You must enter the password for the keystore. By default, the password is ``changeit``.


###Using HTTPS with the Java SDK

The Java SDK is compatible with SSL. The SDK utilizes the default Java keystore for trusted
certificates. As a result, you can install the appropriate CA certificate in the default
Java keystore. The default Java CA certificate store is located at ``$JAVA_HOME/jre/lib/security/cacerts``.

If needed, SSL host verification can be disabled with the ApiClient object's ``disableSSLVerification()`` method.


####Enabling SSL Connections

 To use an SSL connection with the Java SDK, simply use the appropriate HTTPS URL for
 the target REST API server. Ensure to specify the HTTPS protocol and appropriate port
 for the encrypted connection.

```java
apiClient apiClient = new ApiClient();
apiClient.setBasePath("https://127.0.0.1:8443/devmgr/v2");
```


####Certificate Management

The trusted root certificates for the Java SDK are managed using the Java keystore
integrated with the Java JVM. This same keystore is used to run the application
utilizing the SDK. If you need to import a certificate to utilize SSL with HTTPs
connection to the REST server, you must import the certificate to the Java keystore.


#####Importing a certificate

You will need to import a certificate to the Java keystore if any of the following
conditions apply:

*	The REST API service (proxy or embedded) is using a self-signed certificate. This
 	is the default state "out-of-box".
 	*	In this case, the self-signed certificate is imported.
*	The REST API service (proxy or embedded) is using a signed certificate by an
 	untrusted Certificate Authority (CA).
 	*	This might be the case if you signed the certificate with your own CA or an enterprise CA was used to sign the certificate.
 	*	In this case, the root CA certificate is imported.

		**Example of importing a certificate using the Java keytool**

			```
			cd C:\Program Files\Java\jdk1.8.0_65
			jre\bin\keytool.exe -import -trustcacerts -keystore jre\lib\security\cacerts -alias rest-host-cert -file rest-host.cer
			```


####Disabling SSL Host Verification

**NOTE:**	Disabling SSL host verification can be a security risk and is not recommended.
			However, this information is being provided for certain use cases where the
			security implications are understood and acceptable.

Disabling SSL host verification can be used as a workaround to importing an untrusted
certificate from the REST API server to the client system. This will permit the use of
the HTTPS URL and encryption without requiring the full level of trust.

**Example of disabling SSL Host Verification**

```java
apiClient apiClient = new ApiClient();
apiClient.setBasePath("https://127.0.0.1:8443/devmgr/v2");
apiClient.disableSSLVerification()
```


####Reference Exception

*	Connections to a proxy with the default self-signed certificate with correct
 	hostname but no certificate installed

 	```
	API Exception for self-signed cert without cert installed
	```

*	Connections to proxy with self-signed certificate with mis-matched hostname

	```
	API Exception for self-signed cert when name doesn't match
	```
