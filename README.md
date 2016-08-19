
# NetApp SANtricity WebAPI - Java SDK

##Requirements

 The NetApp SANtricity WebAPI - Java SDK client library requires an installation of [Apache Maven](https://maven.apache.org/).


##Installation

The NetApp SANtricity WebAPI - Java SDK client library must be installed to your local Maven repository.

To install the NetApp SANtricity WebAPI - Java SDK, perform the following command: ``mvn install``

Optionally, you can deploy the NetApp SANtricity WebAPI - Java SDK installation to a remote Maven repository.

To deploy the NetApp SANtricity WebAPI - Java SDK installation remotely, configure the settings of the repository and perform the following command: ``mvn deploy``


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
 NetApp SANtricity WebAPI - Java SDK:

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
