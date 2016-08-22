
# NetApp SANtricity WebAPI - Java SDK


##Installation

Our build scripts requires [Apache Maven](https://maven.apache.org/) for pulling down the dependencies from Maven Central and compiling the source. 
Instead, if you would like to use a different build system please check the [Dependency List](####DependencyList) below to download the appropriate ones. 

The NetApp SANtricity WebAPI - Java SDK client library must be installed to your local Maven repository.

To install the NetApp SANtricity WebAPI - Java SDK, perform the following command: ``mvn install``

Optionally, you can deploy the NetApp SANtricity WebAPI - Java SDK installation to a remote Maven repository.

To deploy the NetApp SANtricity WebAPI - Java SDK installation remotely, configure the settings of the repository and perform the following command: ``mvn deploy``


###Dependencies

####DependencyList
Used and declared dependencies

<table class="bodyTable">

<tbody>

<tr class="a">

<td>**GroupId**</td>

<td>**ArtifactId**</td>

<td>**Version**</td>

<td>**Scope**</td>

<td>**Classifier**</td>

<td>**Type**</td>

<td>**Optional**</td>

</tr>

<tr class="b">

<td>io.swagger</td>

<td>swagger-annotations</td>

<td>1.5.8</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

<tr class="a">

<td>org.glassfish.jersey.core</td>

<td>jersey-client</td>

<td>2.23</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

<tr class="b">

<td>org.glassfish.jersey.media</td>

<td>jersey-media-multipart</td>

<td>2.23</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

<tr class="a">

<td>org.glassfish.jersey.media</td>

<td>jersey-media-json-jackson</td>

<td>2.23</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

<tr class="b">

<td>org.glassfish.jersey.core</td>

<td>jersey-common</td>

<td>2.23</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

<tr class="a">

<td>com.fasterxml.jackson.core</td>

<td>jackson-annotations</td>

<td>2.7.0</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

<tr class="b">

<td>com.fasterxml.jackson.core</td>

<td>jackson-databind</td>

<td>2.7.0</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

<tr class="a">

<td>com.fasterxml.jackson.datatype</td>

<td>jackson-datatype-joda</td>

<td>2.1.5</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

<tr class="b">

<td>javax.ws.rs</td>

<td>javax.ws.rs-api</td>

<td>2.0.1</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

<tr class="a">

<td>com.brsanthu</td>

<td>migbase64</td>

<td>2.2</td>

<td>compile</td>

<td>jar</td>

<td>false</td>

</tr>

</tbody>

</table>



####Maven Users

The following dependency must be added to your project's POM:
Note: This is not yet uploaded to Maven Central yet and hence not avalialbe, we will remove this message after it has been posted to Maven Central. 
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

Here's an example for using the NetApp SANtricity WebAPI - Java SDK:

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
