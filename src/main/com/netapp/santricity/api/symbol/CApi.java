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
public class CApi {
  private ApiClient apiClient;

  public CApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Calculates the volume&#39;s maximum capacity after a DVE operation
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body This object contains information used for a DVE or DCE/DVE combination. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long symbolCalculateDVECapacity(String systemId, VolumeExpansionDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCalculateDVECapacity");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCalculateDVECapacity");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/calculateDVECapacity".replaceAll("\\{format\\}","json")
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

    
    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to cancel an Async Mirror Group role change operation.
   * Documented return codes: ok, remoteInternalError, arvmRemoteGroupDoesNotExist, remoteDatabaseError. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelAsyncMirrorGroupRoleChange(String systemId, AsyncMirrorGroupRoleChangeCancelDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelAsyncMirrorGroupRoleChange");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCancelAsyncMirrorGroupRoleChange");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelAsyncMirrorGroupRoleChange".replaceAll("\\{format\\}","json")
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
   * Cancels a running base controller diagnostic test and returns the test status.
   * Documented return codes: ok, authFailParam, diagNotRunning. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FruDiagReturn
   * @throws ApiException if fails to make API call
   */
  public FruDiagReturn symbolCancelBaseControllerDiagnostic(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelBaseControllerDiagnostic");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelBaseControllerDiagnostic".replaceAll("\\{format\\}","json")
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

    
    GenericType<FruDiagReturn> localVarReturnType = new GenericType<FruDiagReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Cancels a running cache backup device diagnostic test and returns the test status.
   * Documented return codes: ok, authFailParam, diagNotRunning. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FruDiagReturn
   * @throws ApiException if fails to make API call
   */
  public FruDiagReturn symbolCancelCacheBackupDeviceDiagnostic(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelCacheBackupDeviceDiagnostic");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelCacheBackupDeviceDiagnostic".replaceAll("\\{format\\}","json")
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

    
    GenericType<FruDiagReturn> localVarReturnType = new GenericType<FruDiagReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Cancels a running cache memory diagnostic test and returns the test status.
   * Documented return codes: ok, authFailParam, diagNotRunning. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FruDiagReturn
   * @throws ApiException if fails to make API call
   */
  public FruDiagReturn symbolCancelCacheMemoryDiagnostic(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelCacheMemoryDiagnostic");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelCacheMemoryDiagnostic".replaceAll("\\{format\\}","json")
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

    
    GenericType<FruDiagReturn> localVarReturnType = new GenericType<FruDiagReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to cancel stable store database recovery.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelDatabaseRecoveryMode(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelDatabaseRecoveryMode");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelDatabaseRecoveryMode".replaceAll("\\{format\\}","json")
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
   * This command cancels an evacuation on the referenced drive.
   * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, tryAlternate, internalError, invalidDriveref, noEvacFound. 
   * @param systemId  (required)
   * @param body The drive on which to cancel an evacuation. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelEvacuation(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelEvacuation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCancelEvacuation");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelEvacuation".replaceAll("\\{format\\}","json")
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
   * Cancels a running host card diagnostic test and returns the test status
   * Documented return codes: ok, authFailParam, diagNotRunning. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FruDiagReturn
   * @throws ApiException if fails to make API call
   */
  public FruDiagReturn symbolCancelHostCardDiagnostic(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelHostCardDiagnostic");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelHostCardDiagnostic".replaceAll("\\{format\\}","json")
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

    
    GenericType<FruDiagReturn> localVarReturnType = new GenericType<FruDiagReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure indicates to the storage array firmware that the client does not want to proceed with a volume group import operation, and therefore the firmware may spin down the drives that were spun up by the get- ImportDependencies procedure.
   * Documented return codes: ok, volumeGroupStateNotValid. 
   * @param systemId  (required)
   * @param body A reference to the volume group for which the import is to be canceled. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelImport(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelImport");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCancelImport");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelImport".replaceAll("\\{format\\}","json")
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
   * This procedure will cancel a rollback on the specified PiT.
   * Documented return codes: ok, repositoryOffline, invalidPitRef. 
   * @param systemId  (required)
   * @param body A reference to the PiT rollback to be canceled. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelPITRollback(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelPITRollback");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCancelPITRollback");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelPITRollback".replaceAll("\\{format\\}","json")
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
   * This procedure cancels a Pending PiT Creation for a PiT Consistency Group.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A reference to the PiT Consistency Group for which you want to cancel a pending creation. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelPendingCGPITCreation(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelPendingCGPITCreation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCancelPendingCGPITCreation");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelPendingCGPITCreation".replaceAll("\\{format\\}","json")
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
   * This procedure cancels a Pending PiT Creation for a PiT Group. This returns the pending PiT creation state back to \&quot;none\&quot; from either \&quot;waiting\&quot; or \&quot;failed\&quot;.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A reference to the PiT Group for which you want to cancel a pending creation. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelPendingPITCreation(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelPendingPITCreation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCancelPendingPITCreation");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelPendingPITCreation".replaceAll("\\{format\\}","json")
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
   * This procedure cancels a raw data restore operation.
   * Documented return codes: ok, rawdataTransferNotStarted. 
   * @param systemId  (required)
   * @param body The transfer type and controller reference. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelRawDataRestore(String systemId, RawDataTransferCancelDesc body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelRawDataRestore");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCancelRawDataRestore");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelRawDataRestore".replaceAll("\\{format\\}","json")
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
   * This procedure cancels a raw data retrieve operation.
   * Documented return codes: ok, rawdataTransferNotStarted. 
   * @param systemId  (required)
   * @param body The raw data transfer type and controller reference. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelRawDataRetrieve(String systemId, RawDataTransferCancelDesc body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelRawDataRetrieve");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCancelRawDataRetrieve");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelRawDataRetrieve".replaceAll("\\{format\\}","json")
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
   * This procedure is used to cancel a snapshot rollback operation.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A reference to the snapshot on which to cancel the rollback. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCancelSnapshotRollback(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCancelSnapshotRollback");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCancelSnapshotRollback");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/cancelSnapshotRollback".replaceAll("\\{format\\}","json")
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
   * This procedure will change roles on an Async Mirror Group.
   * Documented return codes: ok, rollbackInProgress, arvmGroupHasIncompleteMember, arvmOrphanGroup, remoteInternalError, arvmRemoteGroupNotSecondary, arvmRemoteGroupDoesNotExist, remoteDatabaseError, arvmExpansionSynchronizationInProgress, arvmRoleChangePending, arvmRoleChangeInProgress, arvmMemberStopped. 
   * @param systemId  (required)
   * @param body A reference to the Asynchronous Mirror Group on which to change roles and some change attributes. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolChangeAsyncMirrorGroupRole(String systemId, AsyncMirrorGroupRoleChangeDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolChangeAsyncMirrorGroupRole");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolChangeAsyncMirrorGroupRole");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/changeAsyncMirrorGroupRole".replaceAll("\\{format\\}","json")
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
   * Change mirror write mode
   * Documented return codes: ok, illegalParam, noHeap, internalError, iconFailure, invalidVolumeref, ghostVolume, invalidMirrorvol, rvmVersionMismatch, rvmOperNotAllowedOnSec, legacyRvmAsyncModeUnsupported. 
   * @param systemId  (required)
   * @param body This object contains information used for changing the mirror write mode. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolChangeMirrorWriteMode(String systemId, MirrorWriteModeDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolChangeMirrorWriteMode");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolChangeMirrorWriteMode");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/changeMirrorWriteMode".replaceAll("\\{format\\}","json")
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
   * Change MirrorProxy Synchronization Priority
   * Documented return codes: ok, illegalParam, noHeap, internalError, iconFailure, invalidVolumeref, ghostVolume, invalidMirrorvol. 
   * @param systemId  (required)
   * @param body This object contains information used for changing the synchronization priority level for a mirror volume. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolChangeSynchronizationPriority(String systemId, MirrorSyncPriorityDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolChangeSynchronizationPriority");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolChangeSynchronizationPriority");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/changeSynchronizationPriority".replaceAll("\\{format\\}","json")
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
   * This procedure will clear a recovery failure posted for a given Async Mirror Group (AMG). Since some AMG needs attention / recovery failure conditions are \&quot;sticky\&quot; the user has to acknowledge the condition before it is cleared.
   * Documented return codes: ok, arvmOrphanGroup, arvmOrphanMember, faultConditionStillExists. 
   * @param systemId  (required)
   * @param body A reference to the Asynchronous Mirror Group with the condition to acknowledge/clear and the type of indication to clear. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearAsyncMirrorGroupFaultIndication(String systemId, AsyncMirrorGroupFaultIndicationClearDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearAsyncMirrorGroupFaultIndication");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolClearAsyncMirrorGroupFaultIndication");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearAsyncMirrorGroupFaultIndication".replaceAll("\\{format\\}","json")
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
   * This procedure will clear a recovery failure posted for a given Async Mirror Group member. Since some mirror member needs attention / recovery failure conditions are \&quot;sticky\&quot; the user has to acknowledge the condition before it is cleared.
   * Documented return codes: ok, faultConditionStillExists. 
   * @param systemId  (required)
   * @param body A reference to the Asynchronous Mirror Group member with the condition to acknowledge/clear and the type of indication to clear. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearAsyncMirrorGroupMemberFaultIndication(String systemId, AsyncMirrorGroupMemberFaultIndicationClearDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearAsyncMirrorGroupMemberFaultIndication");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolClearAsyncMirrorGroupMemberFaultIndication");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearAsyncMirrorGroupMemberFaultIndication".replaceAll("\\{format\\}","json")
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
   * This procedure is used to clear the flag indicating that a DPL core dump needs to be retrieved without offloading it. Otherwise, the available DPL core dump will remain in controller memory until overwritten by a new DPL core dump.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearDPLCoreDumpNeedsRetrieved(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearDPLCoreDumpNeedsRetrieved");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearDPLCoreDumpNeedsRetrieved".replaceAll("\\{format\\}","json")
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
   * This procedure clears the Needs Attention signifying the availability of diagnostic data. The client must specify a correct tag. This procedure does not clears the DDC logs in the controller.
   * Documented return codes: ok, ddcUnavail, invalidDdcTag. 
   * @param systemId  (required)
   * @param body A DdcTag value identifying the DDC data set that triggered the Needs Attention. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearDdcNeedsAttention(String systemId, Integer body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearDdcNeedsAttention");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolClearDdcNeedsAttention");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearDdcNeedsAttention".replaceAll("\\{format\\}","json")
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
   * Clear the drive channel cumulative statistic information
   * Documented return codes: ok, error. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearDriveChannelStatistics(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearDriveChannelStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearDriveChannelStatistics".replaceAll("\\{format\\}","json")
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
   * This procedure clears registrations and reservations for specific volumes. A UNIT ATTENTION, RESERVATIONS PREEMPTED condition is established for the former registrants.
   * Documented return codes: ok, noHeap, regDeleteFailed, controllerInServiceMode. 
   * @param systemId  (required)
   * @param body The list AbstractVolRefList of volumes to be cleared. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearPersistentRegistrations(String systemId, AbstractVolRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearPersistentRegistrations");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolClearPersistentRegistrations");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearPersistentRegistrations".replaceAll("\\{format\\}","json")
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
   * Causes the entire configuration of the storage array to be cleared to an initial state.
   * Documented return codes: ok, error, volumeReconfiguring, tryAlternate, controllerInServiceMode. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearSAConfiguration(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearSAConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearSAConfiguration".replaceAll("\\{format\\}","json")
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
   * Clears SAS PHY error statistics for SAS I/O controller and expander devices in the array
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearSasErrorStatistics(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearSasErrorStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearSasErrorStatistics".replaceAll("\\{format\\}","json")
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
   * Set SOC error statistics baseline information
   * Documented return codes: ok, tryAlternate. 
   * @param systemId  (required)
   * @param body A reference to the controller for which statistics are to be cleared on all accessible SOC devices. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearSocErrorStatistics(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearSocErrorStatistics");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolClearSocErrorStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearSocErrorStatistics".replaceAll("\\{format\\}","json")
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
   * Clears all the unreadable sectors for the given Volume
   * Documented return codes: ok, illegalParam, noHeap, tryAlternate, invalidVolumeref, volumeOffline, usmClearFailed. 
   * @param systemId  (required)
   * @param body This object contains information for the specific volume. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolClearUnreadableSectors(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolClearUnreadableSectors");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolClearUnreadableSectors");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/clearUnreadableSectors".replaceAll("\\{format\\}","json")
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
   * Sending an RVM Communication Check command
   * Documented return codes: ok, illegalParam, noHeap, internalError, invalidVolumeref, ghostVolume, rvmCommStatRecoveredTimeout, rvmCommStatRecoveredDelay, rvmCommStatNotReady, rvmCommStatTimeout, rvmCommStatChannelFailure, rvmCommStatNetworkFailure, rvmCommStatDeviceMissing, rvmCommStatLoginRejected, rvmCommStatLoginFailure, rvmCommStatInvNumSamplesReqd, rvmQuiescenceInProgress, rvmInvalidRemotevol. 
   * @param systemId  (required)
   * @param body This object performs a user requested communication check for a remote volume. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return RemoteCommunicationCheckSampleList
   * @throws ApiException if fails to make API call
   */
  public RemoteCommunicationCheckSampleList symbolCommunicationCheck(String systemId, RemoteCommunicationCheckDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCommunicationCheck");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCommunicationCheck");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/communicationCheck".replaceAll("\\{format\\}","json")
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

    
    GenericType<RemoteCommunicationCheckSampleList> localVarReturnType = new GenericType<RemoteCommunicationCheckSampleList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is subject to SYMbol authentication.
   * Documented return codes: ok, noHeap, internalError, hosttypeConflict, portConflict, invalidHosttypeString, invalidProtocol, portRemoved, initiatorConflict, initiatorRemoved. 
   * @param systemId  (required)
   * @param body A PendngHost structure describing a host and its related objects. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolConfigurePendingHost(String systemId, PendingHost body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolConfigurePendingHost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolConfigurePendingHost");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/configurePendingHost".replaceAll("\\{format\\}","json")
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
   * This procedure is called once to restore each chunk of data, after first calling a startRawDataRestore to notify the controller that it needs to prepare for the restore. On the first call to this procedure, a return code of RETCODE_RAWDATA_TRANSFER_PREPARING indicates that the controller has not completed the preparation, and the first call should be retried. Upon successful completion of the first call (RETCODE_OK), subsequent calls should be made to transfer additional chunks of data, incrementing the sequence number by one for each call.
   * Documented return codes: ok, invalidFile, flashError, invalidTotalsize, rawdataTransferNotStarted, rawdataTransferPreparing, rawdataTransferReadError, rawdataTransferInvalidImage, rawdataTransferCrcError, dbmRestoreWriteError, rawdataBadSeqNum, dbmDbSourceUnavailable, dbmRestoreSourceMismatch. 
   * @param systemId  (required)
   * @param body The controller ref, type of transfer, final sequence number of the transfer, the sequence number of the chunk currently being delivered, and the restore details for the chunk. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return RawDataRestoreResult
   * @throws ApiException if fails to make API call
   */
  public RawDataRestoreResult symbolContinueRawDataRestore(String systemId, RawDataRestoreContinueDesc body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolContinueRawDataRestore");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolContinueRawDataRestore");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/continueRawDataRestore".replaceAll("\\{format\\}","json")
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

    
    GenericType<RawDataRestoreResult> localVarReturnType = new GenericType<RawDataRestoreResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is called for each chunk of raw data to be transferred to the host. The first call must be preceded by a call to startRawDataRetrieve().
   * Documented return codes: ok, noHeap, invalidFile, flashError, invalidControllerref, invalidTotalsize, rawdataTransferBadType, rawdataTransferNotStarted, rawdataTransferReadError, rawdataBadSeqNum, rawdataTransferUserCancelled. 
   * @param systemId  (required)
   * @param body The controller ref, raw data transfer type and the sequence number for this chunk. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return RawDataRetrieveResult
   * @throws ApiException if fails to make API call
   */
  public RawDataRetrieveResult symbolContinueRawDataRetrieve(String systemId, RawDataRetrieveContinueDesc body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolContinueRawDataRetrieve");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolContinueRawDataRetrieve");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/continueRawDataRetrieve".replaceAll("\\{format\\}","json")
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

    
    GenericType<RawDataRetrieveResult> localVarReturnType = new GenericType<RawDataRetrieveResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will convert a read-only view to a read-write view.
   * Documented return codes: ok, viewStopped. 
   * @param systemId  (required)
   * @param body Descriptor to PiT View to be converted. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolConvertReadOnlyPITViewToReadWrite(String systemId, PITViewRWConversionDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolConvertReadOnlyPITViewToReadWrite");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolConvertReadOnlyPITViewToReadWrite");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/convertReadOnlyPITViewToReadWrite".replaceAll("\\{format\\}","json")
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
   * This procedure will convert all snapshots of a given base volume to PiT groups.
   * Documented return codes: ok, notDisabled, volumeHasVolcopyRelationship, snapConversionTooManySnaps, snapConversionMissingLabel. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolConvertSnapshotsToPITGroups(String systemId, SnapshotConversionDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolConvertSnapshotsToPITGroups");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolConvertSnapshotsToPITGroups");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/convertSnapshotsToPITGroups".replaceAll("\\{format\\}","json")
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
   * This procedure triggers the copy of an assigned volume group drive to a standby hot spare. Upon successful completion of the copy, the assigned drive is failed and the hot spare becomes an active drive in the volume group, sparing for the failed drive.
   * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, tryAlternate, internalError, invalidDriveref, invalidRaidlevel, driveNotOptimal, noVolumes, volumeGroupNotExist, volumeGroupReconfiguring, volumeGroupStateNotValid, volumeGroupNotConfigurable, invalidDriveState, volumeGroupReconstructing, volumeGroupUndergoingCopyback, volumeGroupHasNonOptimalVols, drivesNotAvailableForRemoval, evacInProgress, noHotspareAvailable, driveServiceInProgress. 
   * @param systemId  (required)
   * @param body The drive on which to perform the operation. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCopyDriveThenFail(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCopyDriveThenFail");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCopyDriveThenFail");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/copyDriveThenFail".replaceAll("\\{format\\}","json")
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
   * This command will trigger an evacuation from an assigned volume group drive to an unassigned drive and replace the original drive in the volume group with the new one.
   * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, tryAlternate, internalError, invalidDriveref, invalidRaidlevel, driveNotOptimal, noVolumes, volumeGroupNotExist, volumeGroupReconfiguring, volumeGroupStateNotValid, volumeGroupNotConfigurable, invalidDriveState, volumeGroupReconstructing, volumeGroupUndergoingCopyback, volumeGroupHasNonOptimalVols, drivesNotAvailableForRemoval, evacInProgress, driveServiceInProgress. 
   * @param systemId  (required)
   * @param body Indicates both the drive to replace and the replacement drive. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCopyDriveThenReplace(String systemId, CopyThenReplaceDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCopyDriveThenReplace");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCopyDriveThenReplace");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/copyDriveThenReplace".replaceAll("\\{format\\}","json")
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
   * This procedure creates a new host port having the attributes specified in the input argument. It is a replacement for the deprecated createHostPort procedure.
   * Documented return codes: ok, noHeap, partDupId, partLabelInvalid, partNodeNonexistent, requestFailedDueToPiRestrictions. 
   * @param systemId  (required)
   * @param body A HostPortCreateDescriptor object containing a set of attributes to assign to the new host port. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return InstanceReturned
   * @throws ApiException if fails to make API call
   */
  public InstanceReturned symbolCreateAHostPort(String systemId, HostPortCreateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateAHostPort");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateAHostPort");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createAHostPort".replaceAll("\\{format\\}","json")
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

    
    GenericType<InstanceReturned> localVarReturnType = new GenericType<InstanceReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will create an Async Mirror Group (AMG).
   * Documented return codes: ok, invalidWarnThreshold, arvmGroupUserLabelExists, remoteTargetNotFound, arvmFeatureDeactivated, mirrorProtocolMismatch, invalidSyncPriority, invalidRecoveryPointAlertThreshold, invalidSyncAlertThreshold, remoteArvmFeatureDeactivated, remoteArvmFeatureDisabled, arvmRemoteMaxAsyncMirrorGroupsExceeded, arvmInvalidSyncInterval, remoteNoHeap, remoteInternalError, arvmRemoteGroupUserLabelExists, remoteDatabaseError. 
   * @param systemId  (required)
   * @param body An object that contains all of the required attributes for the new mirror group. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateAsyncMirrorGroup(String systemId, AsyncMirrorGroupCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateAsyncMirrorGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateAsyncMirrorGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createAsyncMirrorGroup".replaceAll("\\{format\\}","json")
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
   * Create automatic configuration
   * Documented return codes: tryAlternate. 
   * @param systemId  (required)
   * @param body This object contains a list of automatic configuration templates. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateAutoConfig(String systemId, AutoConfigCandidateList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateAutoConfig");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateAutoConfig");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createAutoConfig".replaceAll("\\{format\\}","json")
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
   * This procedure will create a new PiT in a consistency group (a PiT of all members in the group).
   * Documented return codes: ok, pitCreatePending, pitGroupsFeatureDisabled. 
   * @param systemId  (required)
   * @param body Reference to consistency group. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRefList
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRefList symbolCreateCGPIT(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateCGPIT");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateCGPIT");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createCGPIT".replaceAll("\\{format\\}","json")
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
   * This procedure causes a new Cluster object to be created and assigned the specified label. After creating a cluster, hosts can be added to it, mappings established, etc.
   * Documented return codes: ok, noHeap, partDupId, partLabelInvalid. 
   * @param systemId  (required)
   * @param body The user-assigned label to be used for the new cluster. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolCreateCluster(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateCluster");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateCluster");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createCluster".replaceAll("\\{format\\}","json")
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
   * This procedure is used to create an empty disk pool.
   * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, internalError, invalidLabel, prohibitedByMdtRestrictions, invalidDriveState, raid6FeatureUnsupported, raid6FeatureDisabled, invalidSecurity, noFdeDrives, invalidCriticalThreshold, exceedDiskPoolLimit, exceedDiskPoolCapacity, exceedMaxVolumeCapacity. 
   * @param systemId  (required)
   * @param body Information about the intended disk pool. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateDiskPool(String systemId, DiskPoolCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateDiskPool");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateDiskPool");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createDiskPool".replaceAll("\\{format\\}","json")
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
   * This procedure creates a Volume Group and two RAID Volumes to be used for flash cache. Uses the VolumeCandidate for the RAID Volume creation and assigns labels as given. The capacity in the VolumeCandidate is split between the two RAID Volumes. A High Level Volume is also created to reference the RAID Volumes.
   * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, driveNotUnassigned, internalError, invalidLabel, maxVolumesExceeded, numVolumesGroup, driveTypeMismatch, flashcacheAlreadyExists, flashcacheFeatureDisabled, flashcacheMaxCapacityExceeded, flashcacheMaxLimitExceeded, flashCacheFdeEnablementDisallowed. 
   * @param systemId  (required)
   * @param body The attributes for creation of a flash cache object. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateFlashCache(String systemId, FlashCacheCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateFlashCache");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateFlashCache");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createFlashCache".replaceAll("\\{format\\}","json")
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
   * This procedure creates a zero size FlashCache for performing analytics. It creates a flashcache with no repository to allow collection of projected cache hits during I/O.
   * Documented return codes: ok, error, illegalParam, internalError, invalidLabel, flashcacheAlreadyExists. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateFlashCacheAnalytics(String systemId, FlashCacheAnalyticsCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateFlashCacheAnalytics");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateFlashCacheAnalytics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createFlashCacheAnalytics".replaceAll("\\{format\\}","json")
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
   * This procedure causes a new Host object to be created using the parameters in the creation descriptor argument. After creating a host, host ports can be added to it, mappings established, etc.
   * Documented return codes: ok, noHeap, partDupId, partLabelInvalid, partNodeNonexistent, partLunCollision. 
   * @param systemId  (required)
   * @param body A HostCreationDescriptor object that contains all required attributes for the new Host object. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolCreateHost(String systemId, HostCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateHost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateHost");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createHost".replaceAll("\\{format\\}","json")
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
   * This procedure causes a new HostPort object to be created using the parameters in the creation descriptor argument. After creating a host, host ports can be added to it, mappings established, etc. This procedure does not work for iSCSI.
   * Documented return codes: ok, noHeap, partDupId, partLabelInvalid, partNodeNonexistent, requestFailedDueToPiRestrictions. 
   * @param systemId  (required)
   * @param body A HostPortCreationDescriptor object that contains all required attributes for the new HostPort object. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolCreateHostPort(String systemId, HostPortCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateHostPort");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateHostPort");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createHostPort".replaceAll("\\{format\\}","json")
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
   * This procedure creates a new initiator object.
   * Documented return codes: ok, requestFailedDueToPiRestrictions. 
   * @param systemId  (required)
   * @param body An InitiatorCreationDescriptor object that contains all required properties for the new Initiator object. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return InstanceReturned
   * @throws ApiException if fails to make API call
   */
  public InstanceReturned symbolCreateInitiator(String systemId, InitiatorCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateInitiator");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateInitiator");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createInitiator".replaceAll("\\{format\\}","json")
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

    
    GenericType<InstanceReturned> localVarReturnType = new GenericType<InstanceReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is utilized to add new key-value tags to the persistent memory so they can be used for application awareness.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body The input is an array of key-value descriptors. The content of each is two opaque, fixed length byte arrays. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRefList
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRefList symbolCreateKeyValueTag(String systemId, KeyValueTagCreationDescriptorList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateKeyValueTag");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateKeyValueTag");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createKeyValueTag".replaceAll("\\{format\\}","json")
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
   * This procedure causes a new LUNMapping object to be created using the parameters in the creation descriptor argument. Once this mapping is created, it provides a new LUN-to-volume mapping for I/O accesses from the specified entities to a given volume.
   * Documented return codes: ok, noHeap, partVolumeNonexistent, partLunCollision, partMappingNonexistent, partNoHostports, partIsUtmLun, tooManyPartitions, ghostVolume, cannotMapVolume, partPiIncapable. 
   * @param systemId  (required)
   * @param body A LUNMappingCreationDescriptor object that contains all required attributes for the new LUNMapping object. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolCreateLUNMapping(String systemId, LUNMappingCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateLUNMapping");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateLUNMapping");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createLUNMapping".replaceAll("\\{format\\}","json")
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
   * This procedure creates a new lock key for the array, but does not commit the key to the drives. There must be at least one FDE capable drive present on the array.
   * Documented return codes: ok, noFdeDrives, rekeyInProgress. 
   * @param systemId  (required)
   * @param body This is used to generate the WrappedLockKey that this procedure returns. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return WrappedLockKeyReturn
   * @throws ApiException if fails to make API call
   */
  public WrappedLockKeyReturn symbolCreateLockKey(String systemId, KeyIDInfo body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateLockKey");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateLockKey");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createLockKey".replaceAll("\\{format\\}","json")
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
   * Create a metadata volume
   * Documented return codes: raid6FeatureDisabled. 
   * @param systemId  (required)
   * @param body A MetadataVolCreationDescriptor object that contains all required attributes for the new MetadataVolume object. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateMetadataVolume(String systemId, MetadataVolCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateMetadataVolume");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateMetadataVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createMetadataVolume".replaceAll("\\{format\\}","json")
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
   * Create a Mirror
   * Documented return codes: ok, illegalParam, noHeap, volumeNotExist, tryAlternate, internalError, iconFailure, invalidVolumeref, ghostVolume, metadataVolNonexistent, rvmFeatureDisabled, maxMirrorsExceeded, invalidMirrorCandidateVol, remoteMaxMirrorsExceeded, remoteRvmFeatureDisabled, remoteMetadataVolNonexistent, remoteInvalidCfgGen, rvmSpmError, remoteAuthFailPassword, rvmVersionMismatch, rvmRemoteArrayError, rvmCommunicationError, mirrorProtocolMismatch, remoteMaxTotalMirrorsPerArrayExceeded, legacyRvmAsyncModeUnsupported. 
   * @param systemId  (required)
   * @param body A MirrorCreationDescriptor object that contains all required attributes for the new Mirror Volume object. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateMirror(String systemId, MirrorCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateMirror");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateMirror");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createMirror".replaceAll("\\{format\\}","json")
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
   * This procedure will create a new PiT in one or more existing PiT Group(s). Max list size is 64 PiT Groups.
   * Documented return codes: ok, invalidPitGroupRef, maxPitsPerGroupExceeded, maxPitsExceeded, pitGroupInConsistencyGroup, alternateRequiredForOperation, pitCreatePending, pitGroupsFeatureDisabled. 
   * @param systemId  (required)
   * @param body Structure containing a list of PiT groups. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRefList
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRefList symbolCreatePIT(String systemId, PITGroupRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreatePIT");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreatePIT");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createPIT".replaceAll("\\{format\\}","json")
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
   * This procedure will create a new PiT consistency group.
   * Documented return codes: ok, invalidRollbackPriority, invalidWarnThreshold, invalidPitConsistencyGroupLabel, invalidPitAutoDeleteLimit, invalidPitRepositoryFullPolicy, maxConsistencyGroupsExceeded, pitGroupsFeatureDisabled. 
   * @param systemId  (required)
   * @param body Descriptor for the consistency group to be created. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolCreatePITConsistencyGroup(String systemId, PITConsistencyGroupCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreatePITConsistencyGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreatePITConsistencyGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createPITConsistencyGroup".replaceAll("\\{format\\}","json")
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
   * This procedure will create a View on the specified PiTs in a Consistency Group.
   * Documented return codes: ok, incompatibleMemberVol, alternateRequiredForOperation, mustSpecifyExistingVolumes, pitGroupsFeatureDisabled. 
   * @param systemId  (required)
   * @param body An object containing all of the attributes required to create a PiT Consistency Group View. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolCreatePITConsistencyGroupView(String systemId, PITConsistencyGroupViewCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreatePITConsistencyGroupView");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreatePITConsistencyGroupView");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createPITConsistencyGroupView".replaceAll("\\{format\\}","json")
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
   * This procedure will create a new PiT Group.
   * Documented return codes: ok, invalidBasevol, invalidRollbackPriority, invalidWarnThreshold, baseVolumeFailed, invalidProtection, invalidPitGroupLabel, invalidPitAutoDeleteLimit, invalidPitRepositoryFullPolicy, invalidConcatVolMemberLabel, concatVolMemberTooSmall, maxPitGroupsPerBaseExceeded, maxPitGroupsExceeded, incompatibleMemberVol, incompatibleRepositorySecurity, pitGroupsFeatureDisabled. 
   * @param systemId  (required)
   * @param body Structure containing Pit group creation data. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolCreatePITGroup(String systemId, PITGroupCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreatePITGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreatePITGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createPITGroup".replaceAll("\\{format\\}","json")
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
   * This procedure will create a new PiT View.
   * Documented return codes: ok, invalidWarnThreshold, invalidProtection, invalidConcatVolMemberLabel, concatVolMemberTooSmall, invalidPitRef, maxViewsPerPitExceeded, maxViewsExceeded, maxMappableVolumesExceeded, pitInConsistencyGroup, incompatibleMemberVol, incompatibleRepositorySecurity, pitGroupsFeatureDisabled. 
   * @param systemId  (required)
   * @param body Structure containing information about the PiT View to create. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolCreatePITView(String systemId, PITViewCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreatePITView");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreatePITView");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createPITView".replaceAll("\\{format\\}","json")
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
   * Creates a new SAPortGroup &amp; returns its ref. If a group by that name already exists, returns its ref.. OBSOLETE: Any call to createSAPortGroup will get a return status indicating the command is obsolete. No alternative procedure is available.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolCreateSAPortGroup(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateSAPortGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateSAPortGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createSAPortGroup".replaceAll("\\{format\\}","json")
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
   * This procedure is used to create a list of schedules.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A list of schedule creation descriptors. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRefList
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRefList symbolCreateScheduleList(String systemId, ScheduleCreationDescriptorList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateScheduleList");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateScheduleList");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createScheduleList".replaceAll("\\{format\\}","json")
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
   * Create a snapshot volume of a given base.
   * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, driveNotUnassigned, tryAlternate, maxVolumesExceeded, partitionsDisabled, maxSnapsPerBaseExceeded, maxSnapsExceeded, invalidBasevol, snapshotFeatureDisabled, numVolumesGroup, ghostVolume, invalidRepositoryLabel, invalidSnapLabel, invalidWarnThreshold, repositoryTooSmall, baseVolumeFailed, baseVolumeOffline, baseVolumeFormatting, raid6FeatureUnsupported, raid6FeatureDisabled, invalidProtection. 
   * @param systemId  (required)
   * @param body This object contains information about how a new snapshot volume is to be created including the size of the repository, the repository utilization warning threshold and the REPOSITORY full policy. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateSnapshot(String systemId, SnapshotCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateSnapshot");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateSnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createSnapshot".replaceAll("\\{format\\}","json")
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
   * This procedure creates a new Thin Provisioned Volume.
   * Documented return codes: ok, error, illegalParam, noHeap, volumeNotExist, internalError, invalidVolumeref, invalidLabel, maxVolumesExceeded, invalidWarnThreshold, repositoryTooSmall, invalidConcatVolMemberLabel, illegalVolume, invalidRepositoryCapacity, invalidProvisionedCapacityQuota, invalidExpansionPolicy, invalidVirtualCapacity, maxThinVolumesExceeded. 
   * @param systemId  (required)
   * @param body An object containing all of the required attributes for a Thin Provisioned Volume. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateThinVolume(String systemId, ThinVolumeCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateThinVolume");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateThinVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createThinVolume".replaceAll("\\{format\\}","json")
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
   * This procedure causes a new volume to be created based on parameters provided by the caller in the argument structure. Note that a key parameter is a VolumeCandidate object that was previously returned by the controller as the result of a getVolumeCandidates operation. The user must select one such candidate, and then supply further information about the desired attributes of the volume when calling this procedure.
   * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, driveNotUnassigned, tryAlternate, invalidSegmentsize, invalidLabel, maxVolumesExceeded, cannotFormatVolume, controllerInServiceMode, volumeGroupReconstructing, volumeGroupUndergoingCopyback, raid6FeatureUnsupported, raid6FeatureDisabled, invalidSecurity, noFdeDrives, volumeGroupSecure. 
   * @param systemId  (required)
   * @param body A VolumeCreationDescriptor object that provides attributes and properties of the volume to be created. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateVolume(String systemId, VolumeCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateVolume");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createVolume".replaceAll("\\{format\\}","json")
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
   * Create an empty VolumeGroup
   * Documented return codes: ok, invalidSecurity, noFdeDrives. 
   * @param systemId  (required)
   * @param body A VolumeGroupCreationDescriptor structure containing the volume group creation parameters. The information about the volume group drive composition, RAID level, etc. is conveyed in an embedded VolumeCandidate structure. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateVolumeGroup(String systemId, VolumeGroupCreationDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateVolumeGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateVolumeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createVolumeGroup".replaceAll("\\{format\\}","json")
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
   * This procedure is utilized to add new application awareness workloads to persistent memory. The workload objects are created but do not as yet have Key-Value Tags associated to them. That requires calling the setKeyValueTagMapping procedure.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A list of the WorkloadCreationDescriptors used as an input to the createWorkload procedure. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRefList
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRefList symbolCreateWorkload(String systemId, WorkloadCreationDescriptorList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateWorkload");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateWorkload");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createWorkload".replaceAll("\\{format\\}","json")
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
   * This procedure creates the mappings between the list of workloads and volumes specified by the input descriptor.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body The input descriptor is a list of workload and volume pairs, each pair is to be mapped. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolCreateWorkloadVolumeMapping(String systemId, WorkloadVolumeCreateMappingDescriptorList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolCreateWorkloadVolumeMapping");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolCreateWorkloadVolumeMapping");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/createWorkloadVolumeMapping".replaceAll("\\{format\\}","json")
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
