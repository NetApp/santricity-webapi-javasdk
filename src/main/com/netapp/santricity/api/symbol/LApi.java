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

package com.netapp.santricity.api.symbol;

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

@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class LApi {
  private ApiClient apiClient;

  public LApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * To indicate the end of the iterative download sequence, call this procedure with a zero-length segment size. When the controller receives this end indicator, the controller writes the accumulated firmware image to stable storage (typically flash memory). The controller responds to this procedure call with the appropriate return code, delays for a short period, and then reboots to load and execute the new firmware.
   * Documented return codes: ok, error, busy, illegalParam, noHeap, invalidFile, imageTransferred, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, downloadNotPermitted, spawnError, voltransferError, invalidDlstate, cacheconfigError, downloadInProgress, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body A FirmwareUpdateDescriptor object that indicates, among other things, the offset and size of the firmware segment being transferred. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolLoadControllerFirmware(String systemId, FirmwareUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolLoadControllerFirmware");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolLoadControllerFirmware");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/loadControllerFirmware".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "controller", controller));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verboseErrorResponse", verboseErrorResponse));
    

    

    

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
   * Used to download some or all of a new firmware image file to a controller when the authentication password is unavailable.
   * Documented return codes: ok, error, busy, illegalParam, noHeap, invalidFile, imageTransferred, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, downloadNotPermitted, spawnError, voltransferError, invalidDlstate, cacheconfigError, downloadInProgress, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolLoadControllerFirmwareNoPassword(String systemId, FirmwareUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolLoadControllerFirmwareNoPassword");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolLoadControllerFirmwareNoPassword");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/loadControllerFirmwareNoPassword".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "controller", controller));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verboseErrorResponse", verboseErrorResponse));
    

    

    

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
   * To indicate the end of the iterative download sequence, call this procedure with a zero-length segment size. When the controller receives this end indicator, the controller writes the accumulated firmware image to stable storage (typically flash memory). The controller responds to this procedure call with the appropriate return code, delays for a short period, and then reboots to load and execute the new firmware.
   * Documented return codes: ok, error, busy, illegalParam, noHeap, invalidFile, imageTransferred, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, downloadNotPermitted, spawnError, voltransferError, invalidDlstate, cacheconfigError, downloadInProgress, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body A FirmwareUpdateDescriptor object that indicates, among other things, the offset and size of the firmware segment being transferred. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolLoadControllerFirmwareOnLockdown(String systemId, FirmwareUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolLoadControllerFirmwareOnLockdown");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolLoadControllerFirmwareOnLockdown");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/loadControllerFirmwareOnLockdown".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "controller", controller));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verboseErrorResponse", verboseErrorResponse));
    

    

    

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
   * To indicate the end of the iterative download sequence, call this procedure with a zero-length segment size. When the controller receives this end indicator, the controller writes the accumulated NVSRAM image to stable storage (typically flash memory). The controller responds to this procedure call with the appropriate return code, delays for a short period, and then reboots to load and execute the new NVSRAM.
   * Documented return codes: ok, error, busy, illegalParam, noHeap, invalidFile, flashError, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, downloadNotPermitted, spawnError, downloadInProgress, utmConflict, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body A FirmwareUpdateDescriptor object that specifies the size and content of the NVSRAM data to be loaded by the controller. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolLoadControllerNVSRAM(String systemId, FirmwareUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolLoadControllerNVSRAM");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolLoadControllerNVSRAM");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/loadControllerNVSRAM".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "controller", controller));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verboseErrorResponse", verboseErrorResponse));
    

    

    

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
   * This procedure is used to download a NVSRAM image file to a controller when the duplex setting gets erroneously inserted into a Native SATA array. In such a situation, none of the native SATA drives will be recognized by the firmware since the IOC will be set to enable the STP (SATA) layer only if the setting is Simplex. The Recovery Action in such a scenario is to download new NVSRAM using this command and boot with it.
   * Documented return codes: ok, error, illegalParam, imageTransferred, fileTooLarge, invalidChunksize, downloadInProgress, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolLoadControllerNVSRAMNoPassword(String systemId, FirmwareUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolLoadControllerNVSRAMNoPassword");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolLoadControllerNVSRAMNoPassword");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/loadControllerNVSRAMNoPassword".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "controller", controller));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verboseErrorResponse", verboseErrorResponse));
    

    

    

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
   * Downloads a portion of a new firmware image to a drive in the SYMbol Server. loadDriveFirmware OBSOLETED by implementation of parallel drive firmware download
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolLoadDriveFirmware(String systemId, DriveFirmwareUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolLoadDriveFirmware");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolLoadDriveFirmware");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/loadDriveFirmware".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "controller", controller));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verboseErrorResponse", verboseErrorResponse));
    

    

    

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
   * This procedure is used to download some or all of a new firmware image to the ESM cards in a tray. The argument object specifies tray where the ESMs are located, the size of the firmware segment being downloaded, and the offset of the segment within the overall firmware image. Downloads are accomplished using an iterative approach, where the overall image is segmented and each segment transferred to the controller via a call to this procedure. To indicate the end of the iterative download sequence, this procedure should be called with a zero-length segment size. When this end indicator is received by the controller, the accumulated firmware image will be written to the ESM cards.
   * Documented return codes: ok, error, busy, noHeap, tryAlternate, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, spawnError, cacheconfigError, downloadInProgress, esmDownloadFailed, esmPartialUpdate, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body An ESMFirmwareUpdateDescriptor object that indicates the tray to receive the firmware, the offset and size of the firmware segment being transferred. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolLoadESMFirmware(String systemId, ESMFirmwareUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolLoadESMFirmware");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolLoadESMFirmware");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/loadESMFirmware".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "controller", controller));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verboseErrorResponse", verboseErrorResponse));
    

    

    

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
   * This procedure is used to download a new firmware image to the ESM cards in a tray. This procedure is identical in behavior to loadESMFirmware. with respect to interpretation of the argument and performing the download process. It differs from that command with respect to certain pre-validation checks it performs. In particular, it requires that an ESM firmware mismatch condition exist on the indicated tray before it will proceed with the download.
   * Documented return codes: ok, error, busy, noHeap, tryAlternate, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, spawnError, cacheconfigError, downloadInProgress, esmDownloadFailed, esmPartialUpdate, controllerInServiceMode, requiredConditionNotPresent. 
   * @param systemId  (required)
   * @param body An ESMFirmwareUpdateDescriptor object that indicates the tray to receive the firmware, the offset and size of the firmware segment being transferred. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolLoadEsmFirmwareOnMismatch(String systemId, ESMFirmwareUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolLoadEsmFirmwareOnMismatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolLoadEsmFirmwareOnMismatch");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/loadEsmFirmwareOnMismatch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "controller", controller));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verboseErrorResponse", verboseErrorResponse));
    

    

    

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
   * This procedure is used to download factory default information to a controller or expansion enclosure.
   * Documented return codes: ok, error, factoryDefaultDownloadFailed, errorWritingToEeprom, factoryDefaultPartialUpdate. 
   * @param systemId  (required)
   * @param body The factory default data. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolLoadFactoryDefaults(String systemId, FactoryDefaultsDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolLoadFactoryDefaults");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolLoadFactoryDefaults");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/loadFactoryDefaults".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "controller", controller));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verboseErrorResponse", verboseErrorResponse));
    

    

    

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
  
}
