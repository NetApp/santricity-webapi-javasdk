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

@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class EApi {
  private ApiClient apiClient;

  public EApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * This procedure is used to enable Autosupport.
   * Documented return codes: ok, notImplemented. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolEnableASUP(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolEnableASUP");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/enableASUP".replaceAll("\\{format\\}","json")
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
   * Enables external KMS.
   * Documented return codes: ok, externalKmsEnabled, externalKmsFailed, externalKmsNotCompliant, externalKmsTimeout. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return WrappedLockKeyReturn
   * @throws ApiException if fails to make API call
   */
  public WrappedLockKeyReturn symbolEnableExternalKMS(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolEnableExternalKMS");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolEnableExternalKMS");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/enableExternalKMS".replaceAll("\\{format\\}","json")
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

    
    GenericType<WrappedLockKeyReturn> localVarReturnType = new GenericType<WrappedLockKeyReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure causes the \&quot;premium\&quot; features identified in the feature keys of the argument to be enabled.
   * Documented return codes: ok, error, invalidSafeId, invalidSafeKey, invalidSafeCapability, invalidSafeVersion, perfTierSafeUpgradeDisabled, safeControllerNotSubjectToRaid6, premiumFeatureLimitExceedsMaximum, previouslyEnabledForEval, featureNotKeyable. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body A key for the \&quot;premium\&quot; feature to be enabled. This key must be obtained from an authorized source in order to be accepted by the array controller. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolEnableFeature(String systemId, FeatureKey body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolEnableFeature");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolEnableFeature");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/enableFeature".replaceAll("\\{format\\}","json")
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
   * Used to start an evaluation of a specified feature using the duration specified for the sub-model ID in the FBDT.
   * Documented return codes: ok, noHeap, invalidSafeCapability, previouslyEnabledForEval, evalNotSupported, invalidCapability. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolEnableFeatureEvaluation(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolEnableFeatureEvaluation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolEnableFeatureEvaluation");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/enableFeatureEvaluation".replaceAll("\\{format\\}","json")
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
   * This procedure creates a flash cache proxy linked to the referenced user RAID Volume and the flash cache High Level Volume. The flash cache attribute on the RAID Volume will be turned on.
   * Documented return codes: ok, error, illegalParam, noHeap, volumeNotExist, volumeReconfiguring, tryAlternate, internalError, volumeFormatting, invalidVolumeref, volumeOffline, notFlashcacheVol, flashcacheDeleted, flashCacheInvalidBaseVol. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body A reference to the user volume to link to the flash cache proxy, and a reference to the flash cache volume. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolEnableFlashCacheVolume(String systemId, VolumeFlashCacheDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolEnableFlashCacheVolume");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolEnableFlashCacheVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/enableFlashCacheVolume".replaceAll("\\{format\\}","json")
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
   * This procedure establishes a volume copy.
   * Documented return codes: ok, illegalParam, noHeap, tryAlternate, internalError, iconFailure, invalidCopyPriority, copyIncompatibleSource, copyIncompatibleTarget, copyGhostSource, copyGhostTarget, copyInvalidSourceRef, copyInvalidTargetRef, copyInvalidSourceState, copyInvalidTargetState, copySourceReconfig, copyTargetReconfig, copyTargetTooSmall, copyTargetLimit, maxVolumeCopysExceeded, copySourceReservation, copySourceFormat, copyTargetFormat, volcopyFeatureDisabled, copySourceZeroCapacity, copyApptagMismatch. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body The VolumeCopyCreationDescriptor for the volume copy. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolEstablishVolumeCopy(String systemId, VolumeCopyCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolEstablishVolumeCopy");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolEstablishVolumeCopy");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/establishVolumeCopy".replaceAll("\\{format\\}","json")
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

    
    GenericType<ReturnCodeWithRef> localVarReturnType = new GenericType<ReturnCodeWithRef>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will return the amount of repository capacity necessary to perform a rollback operation.
   * Documented return codes: ok, invalidPitRef. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body A reference to a PiT (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return PITGroupRollbackUtilizationEstimateReturned
   * @throws ApiException if fails to make API call
   */
  public PITGroupRollbackUtilizationEstimateReturned symbolEstimatePITRollbackRepositoryUtilization(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolEstimatePITRollbackRepositoryUtilization");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolEstimatePITRollbackRepositoryUtilization");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/estimatePITRollbackRepositoryUtilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<PITGroupRollbackUtilizationEstimateReturned> localVarReturnType = new GenericType<PITGroupRollbackUtilizationEstimateReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will expand a concatenated volume by adding another member RAID volume. Returns the ref for the new ConcatVolMember added.
   * Documented return codes: ok, invalidProtection, invalidConcatVolMemberLabel, concatVolMemberTooSmall, concatMemberLimitExceeded, invalidMemberVol, memberVolMapped, invalidMemberVolState, incompatibleMemberVol, concatVolumeFailed, cannotExpandConcatMember, repositoryFull, insufficientExpansionSpace, invalidExpansionSize, incompatibleRepositorySecurity. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body A descriptor of the concat volume to be expanded. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolExpandConcatVolume(String systemId, ConcatVolumeExpansionDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolExpandConcatVolume");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolExpandConcatVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/expandConcatVolume".replaceAll("\\{format\\}","json")
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

    
    GenericType<ReturnCodeWithRef> localVarReturnType = new GenericType<ReturnCodeWithRef>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will expand a thin volume&#39;s virtual capacity. It does not affect the repository volume&#39;s capacity.
   * Documented return codes: ok, error, illegalParam, noHeap, tryAlternate, internalError, invalidVolumeref, illegalVolume, invalidVirtualCapacity. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body An object containing all of the attributes necessary to expand a thin volume&#39;s virtual capacity. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolExpandThinVolumeVirtualCapacity(String systemId, ThinVolumeExpansionDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolExpandThinVolumeVirtualCapacity");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolExpandThinVolumeVirtualCapacity");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/expandThinVolumeVirtualCapacity".replaceAll("\\{format\\}","json")
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
   * This procedure returns the WrappedLockKeyReturn union for the array.The WrappedLockKeyReturn contains the WrappedLockKey structure for the array it was exported from.
   * No return codes have been documented for this API!
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body The wrapped pass phrase used to encrypt the lock key. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return WrappedLockKeyReturn
   * @throws ApiException if fails to make API call
   */
  public WrappedLockKeyReturn symbolExportLockKey(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolExportLockKey");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolExportLockKey");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/exportLockKey".replaceAll("\\{format\\}","json")
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

    
    GenericType<WrappedLockKeyReturn> localVarReturnType = new GenericType<WrappedLockKeyReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure places the identified volume group in an \&quot;exported\&quot; state so that its drives may be removed and installed into another array.
   * Documented return codes: ok, volumeGroupHasHotspare, volumeGroupReconfiguring, volumeGroupReconstructing, volumeGroupNotComplete, volumeGroupHasFailedDrives, volumeGroupHasNonOptimalVols, volumeGroupHasMirrorRelationship, volumeGroupHasVolcopyRelationship, volumeGroupHasMirroringMetadata, volumeGroupHasMappedVols, volumeGroupHasReservations, volumeGroupHasIncompatibleDacstores, volumeLimitExceeded, volumeGroupHasUnknownRaidLevel, volumeGroupHasUnsupportedRaidLevel, volumeGroupHasCloneOpportunity, volumeGroupHasInsufficientDrives, volumeGroupHasFailedVols, volumeGroupHasSnapshotRelationship, noNativeSstor, volumeInitializing, exportingDrivesDatabaseResynchronizing, exportingDrivesDatabaseFailed, volumeGroupHasArvmRelationship, volumeGroupHasPitgroupRelationship, volumeGroupHasPitviewRelationship, volumeGroupHasConcatRelationship. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body A SYMbol VolumeGroupRef identifying the volume group to export. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolExportVolumeGroup(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolExportVolumeGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolExportVolumeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/exportVolumeGroup".replaceAll("\\{format\\}","json")
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
   * Used to re-key the array with a new lock key.
   * Documented return codes: ok, externalKmsFailed, externalKmsNotEnabled, externalKmsNotCompliant, externalKmsTimeout. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body The wrapped pass phrase used to encrypt the lock key. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return WrappedLockKeyReturn
   * @throws ApiException if fails to make API call
   */
  public WrappedLockKeyReturn symbolExternalKMSReKey(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolExternalKMSReKey");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolExternalKMSReKey");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/externalKMSReKey".replaceAll("\\{format\\}","json")
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

    
    GenericType<WrappedLockKeyReturn> localVarReturnType = new GenericType<WrappedLockKeyReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
