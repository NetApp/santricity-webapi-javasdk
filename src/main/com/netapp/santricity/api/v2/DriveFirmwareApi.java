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

@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DriveFirmwareApi {
  private ApiClient apiClient;

  public DriveFirmwareApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DriveFirmwareApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Cancel the on going update operations.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelDriveFirmwareUpdate(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling cancelDriveFirmwareUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/firmware/drives".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Retrieve list of files in the drive firmware directory
   * Mode: Both Embedded and Proxy. 
   * @return List<FileInfo>
   * @throws ApiException if fails to make API call
   */
  public List<FileInfo> getAllDriveFirmwareFiles() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/files/drive".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<FileInfo>> localVarReturnType = new GenericType<List<FileInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Performs a mini health check and fetchs firmware to drive associations
   * Mode: Both Embedded and Proxy. This is used to determine which drives are compatible with with firmware files that have been previously uploaded.The information returned about the drives also indicates if it can be updated online.This action also performs a mini health check to help determine if there are any storage system conditions that would prevent a firmware update to proceed.
   * @param systemId The id of the storage-system (required)
   * @return DriveFirmwareCompatibilityResponse
   * @throws ApiException if fails to make API call
   */
  public DriveFirmwareCompatibilityResponse getDriveFirmwareCompatabilityCheck(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getDriveFirmwareCompatabilityCheck");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/firmware/drives".replaceAll("\\{format\\}","json")
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

    
    GenericType<DriveFirmwareCompatibilityResponse> localVarReturnType = new GenericType<DriveFirmwareCompatibilityResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Gets a file from the drive firmware directory 
   * Mode: Both Embedded and Proxy. The response type of this method is a file stream.
   * @param filename The name of the file (required)
   * @param autoDelete Automatically remove the file after the retrieval completes (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getDriveFirmwareFile(String filename, Boolean autoDelete) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filename' is set
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getDriveFirmwareFile");
    }
    
    // create path and map variables
    String localVarPath = "/files/drive/{filename}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "filename" + "\\}", apiClient.escapeString(filename.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto-delete", autoDelete));
    

    

    

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
   * Get the status of the on going update operations.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return DriveFirmwareStatus
   * @throws ApiException if fails to make API call
   */
  public DriveFirmwareStatus getDriveFirmwareUpdateStatus(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getDriveFirmwareUpdateStatus");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/firmware/drives/state".replaceAll("\\{format\\}","json")
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

    
    GenericType<DriveFirmwareStatus> localVarReturnType = new GenericType<DriveFirmwareStatus>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Deletes a drive firmware file 
   * Mode: Both Embedded and Proxy. 
   * @param filename The name of the file to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void removeDriveFirmwareFile(String filename) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filename' is set
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling removeDriveFirmwareFile");
    }
    
    // create path and map variables
    String localVarPath = "/files/drive/{filename}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "filename" + "\\}", apiClient.escapeString(filename.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Initiate a drive firmware update
   * Mode: Both Embedded and Proxy. The firmware files to be used for the update should be uploaded previously.When the update has been successfully initiated, the firmware files that were uploaded and used in the update will be automatically removedIf there are files uploaded but not used by the update, they not be immediately removed but may be culled later if they remain unused.
   * @param systemId The id of the storage-system (required)
   * @param body Data for which drives to update. (required)
   * @param onlineUpdate Perform the update with the drives online. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String startDriveFirmwareUpdate(String systemId, List<DriveFirmwareUpdateEntry> body, Boolean onlineUpdate) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling startDriveFirmwareUpdate");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling startDriveFirmwareUpdate");
    }
    
    // verify the required parameter 'onlineUpdate' is set
    if (onlineUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'onlineUpdate' when calling startDriveFirmwareUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/firmware/drives/initiate-upgrade".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlineUpdate", onlineUpdate));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Upload a drive firmware file
   * Mode: Both Embedded and Proxy. Firmware file is uploaded to staging area and referenced in other drive firmware operations. If your multipart form has non-file data, it will be ignored and only the files handled.
   * @param file drive firmware file (optional)
   * @return List<FileInfo>
   * @throws ApiException if fails to make API call
   */
  public List<FileInfo> uploadDriveFirmwareFile(File file) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/files/drive".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

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

    
    GenericType<List<FileInfo>> localVarReturnType = new GenericType<List<FileInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
