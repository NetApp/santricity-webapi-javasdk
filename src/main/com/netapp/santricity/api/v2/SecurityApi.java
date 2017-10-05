/**************************************************************************************************************************************************************
 *  The Clear BSD License
 *
 *   Copyright (c) – 2016, NetApp, Inc. All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without modification, are permitted (subject to the limitations in the disclaimer below) provided that the following conditions are met:
 *
 *   * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 *   * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *   * Neither the name of NetApp, Inc. nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *
 *   NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *************************************************************************************************************************************************************/

package com.netapp.santricity.api.v2;

import com.netapp.santricity.ApiException;
import com.netapp.santricity.ApiClient;
import com.netapp.santricity.Configuration;
import com.netapp.santricity.models.v2.*;
import com.netapp.santricity.models.symbol.*;
import com.netapp.santricity.models.utils.*;
import com.netapp.santricity.Pair;
import com.netapp.santricity.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.ws.rs.core.GenericType;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class SecurityApi {
  private ApiClient apiClient;

  public SecurityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SecurityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Export a full disk encryption key 
   * Mode: Both Embedded and Proxy. The response type of this method is a file stream. Use secure pass phrase for additional security instead of pass phrase.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param passPhrase Pass phrase (optional)
   * @param fileName File name (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportFDEKey(String systemId, String passPhrase, String fileName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling exportFDEKey");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/security-key/export".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "passPhrase", passPhrase));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));
    

    

    

    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieves the specified certificate file
   * This API is designed to return a file. It will only return a content-type of application/json in cases where the file retrieval did not succeed.&lt;br&gt; This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param certificateType Type of certificate being retrieved (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getExternalKeyServerCertificate(String systemId, String certificateType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getExternalKeyServerCertificate");
    }
    
    // verify the required parameter 'certificateType' is set
    if (certificateType == null) {
      throw new ApiException(400, "Missing the required parameter 'certificateType' when calling getExternalKeyServerCertificate");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/external-key-server/certificate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "certificateType", certificateType));
    

    

    

    final String[] localVarAccepts = {
      "application/octet-stream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieves the details for the certificate files on the system as well as the associated Key Management Server IP and port.
   * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return X509ExternalCertInfo
   * @throws ApiException if fails to make API call
   */
  public X509ExternalCertInfo getExternalKeyServerDetails(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getExternalKeyServerDetails");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/external-key-server".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<X509ExternalCertInfo> localVarReturnType = new GenericType<X509ExternalCertInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Import a full disk encryption key
   * Mode: Both Embedded and Proxy. Use secure pass phrase for additional security instead of pass phrase.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param passPhrase Pass phrase (optional)
   * @param keyfile file (optional)
   * @param securePassPhrase Secure pass phrase (optional)
   * @throws ApiException if fails to make API call
   */
  public void importFDEKey(String systemId, String passPhrase, File keyfile, String securePassPhrase) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling importFDEKey");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/security-key/import".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "passPhrase", passPhrase));
    

    

    if (keyfile != null)
      localVarFormParams.put("keyfile", keyfile);
    if (securePassPhrase != null)
      localVarFormParams.put("securePassPhrase", securePassPhrase);
    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Request a certificate signing request for a client side certificate used to validate with the external key server 
   * This will return the ID for the file (for use with other endpoints) and a URL (can be used directly).&lt;br&gt;This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return PrivateFileInfo
   * @throws ApiException if fails to make API call
   */
  public PrivateFileInfo newExternalKeyServerCSR(String systemId, ExternalKeyManagerCSR body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newExternalKeyServerCSR");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/external-key-server/certificate/csr".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<PrivateFileInfo> localVarReturnType = new GenericType<PrivateFileInfo>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create or change a full disk encryption key
   * Mode: Both Embedded and Proxy. The result of this method is the creation of a new key file. Retrieve with the /file/{filename} endpoint.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return SecureVolumeKeyResponse
   * @throws ApiException if fails to make API call
   */
  public SecureVolumeKeyResponse newFDEKey(String systemId, SecureVolumeKeyRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newFDEKey");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/security-key".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<SecureVolumeKeyResponse> localVarReturnType = new GenericType<SecureVolumeKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Removes the specified certificate type
   * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param certificateType Type of certificate being removed (required)
   * @throws ApiException if fails to make API call
   */
  public void removeExternalKeyServerCertificate(String systemId, String certificateType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeExternalKeyServerCertificate");
    }
    
    // verify the required parameter 'certificateType' is set
    if (certificateType == null) {
      throw new ApiException(400, "Missing the required parameter 'certificateType' when calling removeExternalKeyServerCertificate");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/external-key-server/certificate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "certificateType", certificateType));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Sets (enables/updates) the key server information
   * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void setExternalKeyServer(String systemId, EnableExternalKeyServerRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling setExternalKeyServer");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/external-key-server".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Enables, disables or changes the external security key on the storage system
   * If the ekmsOption field is set to enable, the storage array will communicate with the KMS server to obtain a security key and install it on the storage system.  In order for this to be successful, the following things must first occur:&lt;br&gt;&lt;br&gt;1. The KMS server IP and port must be set&lt;br&gt;2. A CSR must be generated and uploaded to the KMS server to retrieve the client certificate&lt;br&gt;3. Both the client and server certificates need to be installed on the storage system&lt;br&gt;&lt;br&gt;If the ekmsOption field is set to disable and external key management is currently enabled, the storage array will switch to internal key management and a new security key will be generated on the storage system.&lt;br&gt;&lt;br&gt;If the ekmsOption is set to changeKey and external key management is currently enabled, a new security key will be generated on the storage system to replace the existing key.&lt;br&gt;&lt;br&gt;This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return SecureVolumeExternalKeyResponse
   * @throws ApiException if fails to make API call
   */
  public SecureVolumeExternalKeyResponse setExternalKeyServerKey(String systemId, EnableDisableEkmsRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling setExternalKeyServerKey");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/external-key-server/security-key".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<SecureVolumeExternalKeyResponse> localVarReturnType = new GenericType<SecureVolumeExternalKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Verify the storage system is able to communicate with the KMS server
   * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return EKMSCommunicationResponse
   * @throws ApiException if fails to make API call
   */
  public EKMSCommunicationResponse testExternalKeyServer(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling testExternalKeyServer");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/external-key-server/test".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<EKMSCommunicationResponse> localVarReturnType = new GenericType<EKMSCommunicationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Install a KMS Certificate or a certificate in a chain
   * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param certificateType Type of certificate being installed (required)
   * @param file certificate file (optional)
   * @throws ApiException if fails to make API call
   */
  public void uploadExternalKeyServerCertificate(String systemId, String certificateType, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling uploadExternalKeyServerCertificate");
    }
    
    // verify the required parameter 'certificateType' is set
    if (certificateType == null) {
      throw new ApiException(400, "Missing the required parameter 'certificateType' when calling uploadExternalKeyServerCertificate");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/external-key-server/certificate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "certificateType", certificateType));
    

    

    if (file != null)
      localVarFormParams.put("file", file);
    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Validate a full disk encryption key
   * Mode: Both Embedded and Proxy. Use secure pass phrase for additional security instead of pass phrase.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param keyfile file (required)
   * @param passPhrase Pass phrase (optional)
   * @param securePassPhrase Secure pass phrase (optional)
   * @throws ApiException if fails to make API call
   */
  public void validateFDEKey(String systemId, File keyfile, String passPhrase, String securePassPhrase) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling validateFDEKey");
    }
    
    // verify the required parameter 'keyfile' is set
    if (keyfile == null) {
      throw new ApiException(400, "Missing the required parameter 'keyfile' when calling validateFDEKey");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/security-key/validate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "passPhrase", passPhrase));
    

    

    if (keyfile != null)
      localVarFormParams.put("keyfile", keyfile);
    if (securePassPhrase != null)
      localVarFormParams.put("securePassPhrase", securePassPhrase);
    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
