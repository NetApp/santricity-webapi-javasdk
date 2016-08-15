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
public class FirmwareApi {
  private ApiClient apiClient;

  public FirmwareApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FirmwareApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Activate staged controller firmware
   * Mode: Proxy only. Activate Controller Firmware that was previous staged for a later upgrade operation. This operation will begin activation of the uploaded package.
   * @param systemId The id of the storage-system (required)
   * @param body  (optional)
   * @return CfwUpgradeResponse
   * @throws ApiException if fails to make API call
   */
  public CfwUpgradeResponse activateStagedControllerFirmware(String systemId, CfwActivationRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling activateStagedControllerFirmware");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/cfw-upgrade/activate".replaceAll("\\{format\\}","json")
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

    
    GenericType<CfwUpgradeResponse> localVarReturnType = new GenericType<CfwUpgradeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Activates a previously staged Firmware
   * Mode: Embedded only. 
   * @throws ApiException if fails to make API call
   */
  public void activateStagedFirmware() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware/activate".replaceAll("\\{format\\}","json");

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
   * Begin a firmware compatibility check operation
   * Mode: Proxy only. This endpoint allows a user to request all firmware and nvsram files that are compatible with a StorageSystem, or list of StorageSystems.
   * @param body  (optional)
   * @return FirmwareCompatibilityResponse
   * @throws ApiException if fails to make API call
   */
  public FirmwareCompatibilityResponse beginCompatibilityCheck(FirmwareCompatibilityRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/firmware/compatibility-check".replaceAll("\\{format\\}","json");

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

    
    GenericType<FirmwareCompatibilityResponse> localVarReturnType = new GenericType<FirmwareCompatibilityResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Cancel a firmware compatibility check operation
   * Mode: Proxy only. 
   * @throws ApiException if fails to make API call
   */
  public void cancelCompatibilityCheck() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/firmware/compatibility-check".replaceAll("\\{format\\}","json");

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
   * Cancel a running health check
   * Mode: Both Embedded and Proxy. This operation may take some time to cancel, as pending operations must be completed first.
   * @throws ApiException if fails to make API call
   */
  public void cancelHealthCheck() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/health-check".replaceAll("\\{format\\}","json");

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
   * Performs a compatibility check on a controller firmware bundle. Speed up process by sending only first 8KB of file.
   * Mode: Embedded only. 
   * @param systemId  (required)
   * @param file  (optional)
   * @throws ApiException if fails to make API call
   */
  public void checkEmbeddedFirmwareBundleCompatibility(String systemId, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling checkEmbeddedFirmwareBundleCompatibility");
    }
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware/{system-id}/bundle-compatibility-check".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Performs a compatibility check on a NVSRAM file.
   * Mode: Embedded only. 
   * @param systemId  (required)
   * @param file  (optional)
   * @throws ApiException if fails to make API call
   */
  public void checkEmbeddedNVSRAMCompatibility(String systemId, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling checkEmbeddedNVSRAMCompatibility");
    }
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware/{system-id}/nvsram-compatibility-check".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Clear staged firmware details on the array
   * Mode: Proxy only. Clear staged firmware details on the storage array
   * @param systemId The id of the storage-system (required)
   * @throws ApiException if fails to make API call
   */
  public void clearStagedFirmware(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling clearStagedFirmware");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/cfw-upgrade/staged".replaceAll("\\{format\\}","json")
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
   * Get the list of firmware files
   * Mode: Proxy only. 
   * @return List<CFWPackageMetadata>
   * @throws ApiException if fails to make API call
   */
  public List<CFWPackageMetadata> getAllFirmwareFiles() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/firmware/cfw-files".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<CFWPackageMetadata>> localVarReturnType = new GenericType<List<CFWPackageMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Request status of a firmware compatibility check operation
   * Mode: Proxy only. 
   * @param requestId Retrieve result of a previously submitted request. (optional)
   * @return FirmwareCompatibilityResponse
   * @throws ApiException if fails to make API call
   */
  public FirmwareCompatibilityResponse getCompatibilityCheckResults(Long requestId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/firmware/compatibility-check".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestId", requestId));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<FirmwareCompatibilityResponse> localVarReturnType = new GenericType<FirmwareCompatibilityResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve status of a Controller Firmware upgrade operation
   * Mode: Proxy only. Retrieve the status of a running controller firmware or nvsram upgrade operation.
   * @param systemId The id of the storage-system (required)
   * @return CfwUpgradeResponse
   * @throws ApiException if fails to make API call
   */
  public CfwUpgradeResponse getControllerFirmwareUpgradeStatus(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getControllerFirmwareUpgradeStatus");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/cfw-upgrade".replaceAll("\\{format\\}","json")
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

    
    GenericType<CfwUpgradeResponse> localVarReturnType = new GenericType<CfwUpgradeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get last successful firmware updgrade timestamps and firmware upgrade logs
   * Mode: Embedded only. 
   * @param cfwUpgrade Controller Firmware Upgrade (optional)
   * @param iomUpgrade IOM Firmware Upgrade (optional)
   * @param driveUpgrade Drive Firmware Upgrade (optional)
   * @param includeLogs Include firmware log  (optional)
   * @return EmbeddedFirmwareResponse
   * @throws ApiException if fails to make API call
   */
  public EmbeddedFirmwareResponse getEmbeddedFirmwareInformation(Boolean cfwUpgrade, Boolean iomUpgrade, Boolean driveUpgrade, Boolean includeLogs) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cfwUpgrade", cfwUpgrade));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "iomUpgrade", iomUpgrade));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "driveUpgrade", driveUpgrade));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeLogs", includeLogs));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<EmbeddedFirmwareResponse> localVarReturnType = new GenericType<EmbeddedFirmwareResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve details on the current firmware
   * Mode: Embedded only. Retrieve the list of code modules and versions of the firmware on the storage array.
   * @param systemId  (required)
   * @return CurrentFirmwareResponse
   * @throws ApiException if fails to make API call
   */
  public CurrentFirmwareResponse getFirmwareDetails(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getFirmwareDetails");
    }
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware/{system-id}/versions".replaceAll("\\{format\\}","json")
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

    
    GenericType<CurrentFirmwareResponse> localVarReturnType = new GenericType<CurrentFirmwareResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a specific firmware file
   * Mode: Proxy only. 
   * @param filename  (required)
   * @return CFWPackageMetadata
   * @throws ApiException if fails to make API call
   */
  public CFWPackageMetadata getFirmwareFile(String filename) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filename' is set
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling getFirmwareFile");
    }
    
    // create path and map variables
    String localVarPath = "/firmware/cfw-files/{filename}".replaceAll("\\{format\\}","json")
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

    
    GenericType<CFWPackageMetadata> localVarReturnType = new GenericType<CFWPackageMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get health check status
   * Mode: Both Embedded and Proxy. 
   * @param requestId Retrieve result of a previously submitted request. (optional)
   * @return HealthCheckResponse
   * @throws ApiException if fails to make API call
   */
  public HealthCheckResponse getHealthCheckStatus(Long requestId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/health-check".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestId", requestId));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<HealthCheckResponse> localVarReturnType = new GenericType<HealthCheckResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get IOM service information
   * Mode: Embedded only. 
   * @return IomServiceInfoResponse
   * @throws ApiException if fails to make API call
   */
  public IomServiceInfoResponse getIOMServiceInformation() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware/iom/service".replaceAll("\\{format\\}","json");

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

    
    GenericType<IomServiceInfoResponse> localVarReturnType = new GenericType<IomServiceInfoResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve details on the staged firmware
   * Mode: Embedded only. Retrieve the list of code modules and versions of the firmware staged on the storage array.
   * @param systemId  (required)
   * @return StagedFirmwareResponse
   * @throws ApiException if fails to make API call
   */
  public StagedFirmwareResponse getStagedControllerFirmwareDetails(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getStagedControllerFirmwareDetails");
    }
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware/{system-id}/staged".replaceAll("\\{format\\}","json")
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

    
    GenericType<StagedFirmwareResponse> localVarReturnType = new GenericType<StagedFirmwareResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve details on the staged firmware
   * Mode: Proxy only. Retrieve the list of code modules and versions of the firmware staged on the storage array.
   * @param systemId The id of the storage-system (required)
   * @return StagedFirmwareResponse
   * @throws ApiException if fails to make API call
   */
  public StagedFirmwareResponse getStagedFirmwareDetails(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getStagedFirmwareDetails");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/cfw-upgrade/staged".replaceAll("\\{format\\}","json")
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

    
    GenericType<StagedFirmwareResponse> localVarReturnType = new GenericType<StagedFirmwareResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete an uploaded firmware file
   * Mode: Proxy only. Delete an uploaded firmware file by providing the filename. If the file is locked the file will be scheduled for deletion on service shutdown.
   * @param filename  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeFirmwareFile(String filename) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filename' is set
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling removeFirmwareFile");
    }
    
    // create path and map variables
    String localVarPath = "/firmware/upload/{filename}".replaceAll("\\{format\\}","json")
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
   * Clear staged firmware details on the array
   * Mode: Embedded only. Clear staged firmware details on the storage array
   * @param systemId  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeStagedFirmware(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeStagedFirmware");
    }
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware/{system-id}/staged".replaceAll("\\{format\\}","json")
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
   * Initiate a Controller Firmware upgrade operation
   * Mode: Proxy only. Start a controller firmware or nvsram upgrade operation.
   * @param systemId The id of the storage-system (required)
   * @param body  (optional)
   * @return InitialAsyncResponse
   * @throws ApiException if fails to make API call
   */
  public InitialAsyncResponse startControllerFirmwareUpgrade(String systemId, CfwUpgradeRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling startControllerFirmwareUpgrade");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/cfw-upgrade".replaceAll("\\{format\\}","json")
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

    
    GenericType<InitialAsyncResponse> localVarReturnType = new GenericType<InitialAsyncResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Begin a health check
   * Mode: Both Embedded and Proxy. The health checks are designed to test whether or not a StorageSystem is stable enough to safely allow a firmware upgrade operation to proceed. They can also be used in a generic fashion to probe a large number of StorageSystems for issues requiring attention.
   * @param body  (optional)
   * @return InitialAsyncResponse
   * @throws ApiException if fails to make API call
   */
  public InitialAsyncResponse startHealthCheck(HealthCheckRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/health-check".replaceAll("\\{format\\}","json");

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

    
    GenericType<InitialAsyncResponse> localVarReturnType = new GenericType<InitialAsyncResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Updates the IOM service configuration
   * Mode: Embedded only. 
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateIOMServiceInformation(IomServiceUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware/iom/service".replaceAll("\\{format\\}","json");

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
   * Upload a firmware file.
   * Mode: Embedded only. Upload endpoint for firmware that is not staged but directly loaded to the controller. This endpoint only applies when running embedded, not as a proxy.. File can be named the veosimage or the nvsramimage
   * @param staged set to true to indicate  to stage (optional)
   * @param nvsram set to true to NVSRAM is included, and if so it must be first.  If this is true and a DLP file is included, it must be  first.  If not,  an error is generated (optional)
   * @param nvsramfile  (optional)
   * @param dlpfile  (optional)
   * @throws ApiException if fails to make API call
   */
  public void uploadEmbeddedFirmwareFile(Boolean staged, Boolean nvsram, File nvsramfile, File dlpfile) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "staged", staged));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nvsram", nvsram));
    

    

    if (nvsramfile != null)
      localVarFormParams.put("nvsramfile", nvsramfile);
    if (dlpfile != null)
      localVarFormParams.put("dlpfile", dlpfile);
    

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
   * Upload a firmware file.
   * Mode: Proxy only. The firmware file will be uploaded to the server and will be available for firmware upgrade operations. It is recommended to keep the file names the same as they were named by the company. Some file types require this and will fail of renamed
   * @param firmwareFile The firmware file (required)
   * @param validate Validate firmware file (optional, default to true)
   * @return FileInfo
   * @throws ApiException if fails to make API call
   */
  public FileInfo uploadFirmwareFile(File firmwareFile, Boolean validate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'firmwareFile' is set
    if (firmwareFile == null) {
      throw new ApiException(400, "Missing the required parameter 'firmwareFile' when calling uploadFirmwareFile");
    }
    
    // create path and map variables
    String localVarPath = "/firmware/upload".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "validate", validate));
    

    

    if (firmwareFile != null)
      localVarFormParams.put("firmwareFile", firmwareFile);
    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<FileInfo> localVarReturnType = new GenericType<FileInfo>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Upload a nvsram file.
   * Mode: Embedded only. Upload endpoint for nvsram to download to the controller.
   * @param systemId  (required)
   * @param nvsramimage  (optional)
   * @throws ApiException if fails to make API call
   */
  public void uploadNVSRAMFile(String systemId, File nvsramimage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling uploadNVSRAMFile");
    }
    
    // create path and map variables
    String localVarPath = "/firmware/embedded-firmware/{system-id}/nvsram".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    if (nvsramimage != null)
      localVarFormParams.put("nvsramimage", nvsramimage);
    

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
