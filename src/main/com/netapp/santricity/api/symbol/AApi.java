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
public class AApi {
  private ApiClient apiClient;

  public AApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * This procedure activates the collection of a set of statistics known as a \&quot;discrete time series\&quot; (discrete time) on each control of the array. A discrete time is a time-ordered sequence of observations of a single statistic, sampled at regular intervals.
   * Documented return codes: ok, error, illegalParam, invalidRequest. 
   * @param systemId  (required)
   * @param body A DiscreteTimeSeriesDescriptor structure containing the arguments for the procedure call. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return StatStreamIdReturned
   * @throws ApiException if fails to make API call
   */
  public StatStreamIdReturned symbolActivateDiscreteTimeSeries(String systemId, DiscreteTimeSeriesDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolActivateDiscreteTimeSeries");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolActivateDiscreteTimeSeries");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/activateDiscreteTimeSeries".replaceAll("\\{format\\}","json")
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

    
    GenericType<StatStreamIdReturned> localVarReturnType = new GenericType<StatStreamIdReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will enable mirroring over Fibre Channel (setup dedicated channel).
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolActivateFibreChannelCheckPointBasedAsyncMirroring(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolActivateFibreChannelCheckPointBasedAsyncMirroring");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/activateFibreChannelCheckPointBasedAsyncMirroring".replaceAll("\\{format\\}","json")
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
   * This procedure activates a type of statistics stream known as a histogram on each controller of the array. A histogram is a set of observations of a single statistic, organized into categories based on user criteria, with observation counts per category identified.
   * Documented return codes: ok, error, illegalParam, invalidRequest. 
   * @param systemId  (required)
   * @param body A HistogramDescriptor structure containing the arguments for the procedure call. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return StatStreamIdReturned
   * @throws ApiException if fails to make API call
   */
  public StatStreamIdReturned symbolActivateHistogram(String systemId, HistogramDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolActivateHistogram");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolActivateHistogram");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/activateHistogram".replaceAll("\\{format\\}","json")
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

    
    GenericType<StatStreamIdReturned> localVarReturnType = new GenericType<StatStreamIdReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Activates an inactive host port.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolActivateHostPort(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolActivateHostPort");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolActivateHostPort");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/activateHostPort".replaceAll("\\{format\\}","json")
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
   * Activates inactive iSCSI initiator.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolActivateInitiator(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolActivateInitiator");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolActivateInitiator");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/activateInitiator".replaceAll("\\{format\\}","json")
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
   * Activate Remote Mirroring
   * Documented return codes: ok, illegalParam, noHeap, internalError, iconFailure, metadataVolNonexistent, rvmFeatureDisabled, maxMirrorsExceeded, rvmFibreError. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolActivateMirroring(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolActivateMirroring");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/activateMirroring".replaceAll("\\{format\\}","json")
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
   * Activate staged controller firmware
   * Documented return codes: ok, error, busy, illegalParam, invalidRequest, voltransferError, downloadInProgress. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolActivateStagedControllerFirmware(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolActivateStagedControllerFirmware");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/activateStagedControllerFirmware".replaceAll("\\{format\\}","json")
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
   * This procedure will add a member to an Async Mirror Group on the primary array. This is step 1 of the add member process.
   * Documented return codes: ok, invalidProtection, arvmGroupDoesNotExist, arvmGroupNotPrimary, arvmVolumeAlreadyInMirrorRelationship, arvmMemberLimitExceeded, incompatibleRepositorySecurity, arvmOrphanGroup, arvmRemoteMaxMirrorsPerArrayExceeded, remoteMaxTotalMirrorsPerArrayExceeded, remoteNoHeap, remoteInternalError, arvmRemoteGroupNotSecondary, arvmRemoteGroupDoesNotExist, remoteInvalidProtection, remoteDatabaseError, arvmRemoteThinNotSupported. 
   * @param systemId  (required)
   * @param body An object containing all of the attributes required to add a member to an Asynchronous Mirror Group on the primary array. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAddAsyncMirrorGroupPrimaryMember(String systemId, AsyncMirrorGroupAddPrimaryMemberDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAddAsyncMirrorGroupPrimaryMember");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAddAsyncMirrorGroupPrimaryMember");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/addAsyncMirrorGroupPrimaryMember".replaceAll("\\{format\\}","json")
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
   * This procedure will add a member to an Async Mirror Group on the secondary array. This is step 2 of the add member process.
   * Documented return codes: ok, invalidProtection, invalidIncompleteMemberRef, arvmGroupNotSecondary, arvmInvalidMirrorState, arvmVolumeAlreadyInMirrorRelationship, incompatibleRepositorySecurity, incompatibleSecondarySecurity, arvmInvalidSecondaryCapacity, arvmOrphanGroup, remoteInternalError, remoteRvmSpmError, arvmRemoteMirrorMemberDoesNotExist, arvmRemoteGroupDoesNotExist, remoteDatabaseError, arvmIncorrectVolumeType, arvmThinVolInitError. 
   * @param systemId  (required)
   * @param body An object containing all of the attributes required to add a member to an Asynchronous Mirror Group on the secondary array. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAddAsyncMirrorGroupSecondaryMember(String systemId, AsyncMirrorGroupAddSecondaryMemberDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAddAsyncMirrorGroupSecondaryMember");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAddAsyncMirrorGroupSecondaryMember");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/addAsyncMirrorGroupSecondaryMember".replaceAll("\\{format\\}","json")
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
   * This procedure reconfigures the flash cache volume group to add additional drives.
   * Documented return codes: ok, error, illegalParam, noHeap, driveNotUnassigned, internalError, invalidVolumegroupref, invalidDriveref, invalidExpansionList, driveNotOptimal, duplicateDrives, numdrivesGroup, capacityConstrained, invalidDriveState, notFlashcacheVol, flashcacheDeleted, flashcacheMaxCapacityExceeded, flashcacheFailed, flashcacheDegradedState. 
   * @param systemId  (required)
   * @param body A FlashCacheReconfigureDrivesDescriptor object that identifies the volume group to be expanded, plus the drive or drives to be added to the volume group. All drives specified for this operation must be in the unassigned state initially. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAddDrivesToFlashCache(String systemId, FlashCacheReconfigureDrivesDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAddDrivesToFlashCache");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAddDrivesToFlashCache");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/addDrivesToFlashCache".replaceAll("\\{format\\}","json")
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
   * This procedure will add a new member to a PiT consistency group (create a new PiT group for the member volume to add and add that PiT group to the consistency group). Returns the ref of the new PiT group created and added to the PCG.
   * Documented return codes: ok, invalidProtection, invalidConcatVolMemberLabel, concatVolMemberTooSmall, maxConsistencyGroupMembersExceeded, consistencyGroupArvmBindingConflict, incompatibleRepositorySecurity, pitGroupsFeatureDisabled. 
   * @param systemId  (required)
   * @param body Descriptor for the consistency group member to be added. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRefList
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRefList symbolAddPITConsistencyGroupMember(String systemId, PITConsistencyGroupAddMemberDescriptorList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAddPITConsistencyGroupMember");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAddPITConsistencyGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/addPITConsistencyGroupMember".replaceAll("\\{format\\}","json")
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

    
    GenericType<ReturnCodeWithRefList> localVarReturnType = new GenericType<ReturnCodeWithRefList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure causes the controller to store some or all of the information contained in the PendingHost argument. The information is simply stored and made available for later retrieval (see getPendingHosts procedure); it is not incorporated into the configured topology, and it is not persisted to disk. If the controller determines that the pending definition is an exact match of configured topology elements, it does not store it. It bears pointing out that, for iSCSI, multiple ports belonging to the same initiator may be present in the pending host information - when this happens, the controller creates only a single initiator, no matter how many ports for that initiator are presented. No authentication is performed on this command.
   * Documented return codes: ok, noHeap, internalError, invalidHosttypeString, invalidProtocol. 
   * @param systemId  (required)
   * @param body A PendingHost structure that describes the host to be added to the pending topology. It is not considered an error for the PendingHost structure to have a zero-length host label. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAddPendingHost(String systemId, PendingHost body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAddPendingHost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAddPendingHost");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/addPendingHost".replaceAll("\\{format\\}","json")
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
   * This procedure is used to add a known SNMP community string. SNMP GET/SET requests are only allowed for known communities.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRefList
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRefList symbolAddSNMPCommunity(String systemId, SNMPCommunityAddDescriptorList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAddSNMPCommunity");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAddSNMPCommunity");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/addSNMPCommunity".replaceAll("\\{format\\}","json")
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

    
    GenericType<ReturnCodeWithRefList> localVarReturnType = new GenericType<ReturnCodeWithRefList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to add an SNMP trap destination.
   * Documented return codes: ok, snmpIncompatibleIpv4Address, snmpIncompatibleIpv6Address. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRefList
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRefList symbolAddSNMPTrapDestination(String systemId, SNMPTrapDestinationAddDescriptorList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAddSNMPTrapDestination");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAddSNMPTrapDestination");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/addSNMPTrapDestination".replaceAll("\\{format\\}","json")
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

    
    GenericType<ReturnCodeWithRefList> localVarReturnType = new GenericType<ReturnCodeWithRefList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure caused the storage array to \&quot;adopt\&quot; all foreign drives that are eligible to be adopted. Adoption means accepting or incorporating elements of a foreign drive&#39;s configuration database into that of the recipient array. It must be possible for the storage array to match the adoption-candidate drives with ones that are currently being tracked as \&quot;not present.\&quot; In addition, several other technical criteria must be met in order for the adoption to succeed.
   * Documented return codes: ok, error, noDrivesAdopted, someDrivesAdopted. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAdoptAllDrives(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAdoptAllDrives");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/adoptAllDrives".replaceAll("\\{format\\}","json")
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
   * This procedure caused the storage array to \&quot;adopt\&quot; a foreign drive that is eligible to be adopted. Adoption means accepting or incorporating elements of a foreign drive&#39;s configuration database into that of the recipient array. It must be possible for the storage array to match the adoption-candidate drive with one that is currently being tracked as \&quot;not present.\&quot; In addition, several other technical criteria must be met in order for the adoption to succeed.
   * Documented return codes: ok, error. 
   * @param systemId  (required)
   * @param body A SYMbol reference to the drive that is to be adopted. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAdoptDrive(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAdoptDrive");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAdoptDrive");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/adoptDrive".replaceAll("\\{format\\}","json")
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
   * This procedure will run an analysis on the metadata contained in a copy-on-write repository to identify possible causes for failure.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return CoWRepositoryAnalysisResultsReturned
   * @throws ApiException if fails to make API call
   */
  public CoWRepositoryAnalysisResultsReturned symbolAnalyzeCopyOnWriteRepository(String systemId, CoWRepositoryAnalysisRequest body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAnalyzeCopyOnWriteRepository");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAnalyzeCopyOnWriteRepository");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/analyzeCopyOnWriteRepository".replaceAll("\\{format\\}","json")
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

    
    GenericType<CoWRepositoryAnalysisResultsReturned> localVarReturnType = new GenericType<CoWRepositoryAnalysisResultsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure causes the storage array to be migrated from one feature bundle definition to another, as specified in the BundleKey argument.
   * Documented return codes: error, illegalParam, tryAlternate, internalError, invalidSafeId, controllerInServiceMode, databaseError, invalidBundleKey. 
   * @param systemId  (required)
   * @param body A key that defines and enables the bundle migration. This key must be obtained from an authorized source in order to be accepted by the array controller. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolApplyBundleKey(String systemId, BundleKey body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolApplyBundleKey");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolApplyBundleKey");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/applyBundleKey".replaceAll("\\{format\\}","json")
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
   * This procedure is used to instruct the controller to transfer ownership of a disk pool and its associated volumes to another controller.
   * Documented return codes: ok, noHeap, notDualActive, tryAlternate, internalError, invalidRequest, iconFailure, cacheSyncFailure, invalidControllerref, invalidVolumegroupref, modesenseError, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body A descriptor that specifies the volume group being modified, and the controller that is to take ownership of the volume group, and thus all volumes defined on the volume group. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAssignDiskPoolOwnership(String systemId, VolumeGroupOwnershipUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAssignDiskPoolOwnership");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAssignDiskPoolOwnership");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/assignDiskPoolOwnership".replaceAll("\\{format\\}","json")
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
   * This procedure causes the controller to automatically assign the specified number of drives as hot spares, in addition to any previously assigned hot spares.
   * Documented return codes: ok, illegalParam, noHeap, noSparesAssigned, someSparesAssigned, tryAlternate. 
   * @param systemId  (required)
   * @param body The number of new hot spare drives to be added to the array&#39;s pool of hot spares. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAssignDrivesAsHotSpares(String systemId, Integer body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAssignDrivesAsHotSpares");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAssignDrivesAsHotSpares");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/assignDrivesAsHotSpares".replaceAll("\\{format\\}","json")
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
   * Instructs the SYMbol Server&#39;s controller to create hot spare drives out of the given drives.
   * Documented return codes: ok, illegalParam, noHeap, noSparesAssigned, someSparesAssigned, tryAlternate, sparesSmallUnassigned. 
   * @param systemId  (required)
   * @param body A list of drive reference values, which identifies the drives to be assigned as hot spares. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAssignSpecificDrivesAsHotSpares(String systemId, DriveRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAssignSpecificDrivesAsHotSpares");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAssignSpecificDrivesAsHotSpares");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/assignSpecificDrivesAsHotSpares".replaceAll("\\{format\\}","json")
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
   * Instructs the SYMbol Server&#39;s controller to transfer ownership of a volume group and its associated volumes to another controller.
   * Documented return codes: ok, noHeap, notDualActive, tryAlternate, internalError, invalidRequest, iconFailure, cacheSyncFailure, invalidControllerref, invalidVolumegroupref, modesenseError, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body A descriptor that specifies the volume group being modified, and the controller that is to take ownership of the volume group, and thus all volumes defined on the volume group. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAssignVolumeGroupOwnership(String systemId, VolumeGroupOwnershipUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAssignVolumeGroupOwnership");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAssignVolumeGroupOwnership");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/assignVolumeGroupOwnership".replaceAll("\\{format\\}","json")
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
   * Instructs the SYMbol Server&#39;s controller to transfer ownership of a volume to another controller.
   * Documented return codes: ok, illegalParam, noHeap, notDualActive, tryAlternate, internalError, invalidControllerref, invalidVolumeref, modesenseError, ghostVolume, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body A descriptor that specifies the volume being modified and the controller that is to take ownership of the volume. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAssignVolumeOwnership(String systemId, VolumeOwnershipUpdateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAssignVolumeOwnership");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAssignVolumeOwnership");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/assignVolumeOwnership".replaceAll("\\{format\\}","json")
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
   * Automatically assign hot spares
   * Documented return codes: ok, noHeap, noSparesAssigned, someSparesAssigned, noSparesNeeded. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAutoAssignHotSpares(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAutoAssignHotSpares");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/autoAssignHotSpares".replaceAll("\\{format\\}","json")
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
   * This procedure requests an on-demand volume ownership redistribution for load balancing purposes.
   * Documented return codes: ok, autoLoadBalanceUserDisabled, autoLoadBalanceInsufficientStatistics. 
   * @param systemId  (required)
   * @param body Request descriptor specifying details of the load balance request. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAutoLoadBalanceRequest(String systemId, AutoLoadBalanceRequestDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAutoLoadBalanceRequest");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolAutoLoadBalanceRequest");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/autoLoadBalanceRequest".replaceAll("\\{format\\}","json")
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
   * Tells the controller to automatically configure the Storage Array.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolAutoSAConfiguration(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolAutoSAConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/autoSAConfiguration".replaceAll("\\{format\\}","json")
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
