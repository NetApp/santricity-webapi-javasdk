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
public class GApi {
  private ApiClient apiClient;

  public GApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Allows a client to fetch a set of entries that have the alertable, needs attention, or collect support bundle flag set from the array&#39;s MEL for analysis or display.
   * Documented return codes: ok, error. 
   * @param systemId  (required)
   * @param body The range of MEL entries. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return MelEntryList
   * @throws ApiException if fails to make API call
   */
  public MelEntryList symbolGetAlertableMelEntries(String systemId, MelExtent body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetAlertableMelEntries");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetAlertableMelEntries");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getAlertableMelEntries".replaceAll("\\{format\\}","json")
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

    
    GenericType<MelEntryList> localVarReturnType = new GenericType<MelEntryList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to get the current Autosupport status values.
   * Documented return codes: ok, notImplemented. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return AsupStatusReturned
   * @throws ApiException if fails to make API call
   */
  public AsupStatusReturned symbolGetAsupStatus(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetAsupStatus");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getAsupStatus".replaceAll("\\{format\\}","json")
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

    
    GenericType<AsupStatusReturned> localVarReturnType = new GenericType<AsupStatusReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns information on the connections established to a remote array for an existing AsyncMirrorGroup. This will return connection information for both controllers.
   * Documented return codes: ok, notImplemented. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ScsiRemoteConnectionsReturned
   * @throws ApiException if fails to make API call
   */
  public ScsiRemoteConnectionsReturned symbolGetAsyncMirrorGroupRemoteConnections(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetAsyncMirrorGroupRemoteConnections");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetAsyncMirrorGroupRemoteConnections");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getAsyncMirrorGroupRemoteConnections".replaceAll("\\{format\\}","json")
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

    
    GenericType<ScsiRemoteConnectionsReturned> localVarReturnType = new GenericType<ScsiRemoteConnectionsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will return sync progress information for Async Mirror Groups and their associated members. Calls to this procedure are valid even when a sync is not running.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A list of Asynchronous Mirror Group references. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return AsyncMirrorGroupSyncProgressListReturned
   * @throws ApiException if fails to make API call
   */
  public AsyncMirrorGroupSyncProgressListReturned symbolGetAsyncMirrorGroupSyncProgress(String systemId, AsyncMirrorGroupRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetAsyncMirrorGroupSyncProgress");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetAsyncMirrorGroupSyncProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getAsyncMirrorGroupSyncProgress".replaceAll("\\{format\\}","json")
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

    
    GenericType<AsyncMirrorGroupSyncProgressListReturned> localVarReturnType = new GenericType<AsyncMirrorGroupSyncProgressListReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will return repository utilization information for async mirror members.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A list of Asynchronous Mirror Group member references. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return AsyncMirrorRepositoryUtilizationListReturned
   * @throws ApiException if fails to make API call
   */
  public AsyncMirrorRepositoryUtilizationListReturned symbolGetAsyncMirrorRepositoryUtilization(String systemId, AsyncMirrorGroupMemberRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetAsyncMirrorRepositoryUtilization");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetAsyncMirrorRepositoryUtilization");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getAsyncMirrorRepositoryUtilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<AsyncMirrorRepositoryUtilizationListReturned> localVarReturnType = new GenericType<AsyncMirrorRepositoryUtilizationListReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will return synchronization time statistics for a list of mirror members.
   * Documented return codes: ok, notImplemented. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return AsyncMirrorSyncStatisticsListReturned
   * @throws ApiException if fails to make API call
   */
  public AsyncMirrorSyncStatisticsListReturned symbolGetAsyncMirrorSyncStatistics(String systemId, AsyncMirrorSyncStatisticsRequestDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetAsyncMirrorSyncStatistics");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetAsyncMirrorSyncStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getAsyncMirrorSyncStatistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<AsyncMirrorSyncStatisticsListReturned> localVarReturnType = new GenericType<AsyncMirrorSyncStatisticsListReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure automatically gets the configuration candidates.
   * Documented return codes: ok, illegalParam, noHeap, driveNotExist, internalError, invalidSegmentsize, raid6FeatureUnsupported, raid6FeatureDisabled. 
   * @param systemId  (required)
   * @param body This object contains a list of automatic configuration templates. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return AutoConfigCandidateList
   * @throws ApiException if fails to make API call
   */
  public AutoConfigCandidateList symbolGetAutoConfigCandidates(String systemId, AutoConfigTemplateList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetAutoConfigCandidates");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetAutoConfigCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getAutoConfigCandidates".replaceAll("\\{format\\}","json")
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

    
    GenericType<AutoConfigCandidateList> localVarReturnType = new GenericType<AutoConfigCandidateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieves the status of a running, interrupted, or completed base controller diagnostic test.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FruDiagReturn
   * @throws ApiException if fails to make API call
   */
  public FruDiagReturn symbolGetBaseControllerDiagnosticStatus(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetBaseControllerDiagnosticStatus");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getBaseControllerDiagnosticStatus".replaceAll("\\{format\\}","json")
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
   * Retrieves the status of a running, interrupted, or completed cache backup device diagnostic test.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FruDiagReturn
   * @throws ApiException if fails to make API call
   */
  public FruDiagReturn symbolGetCacheBackupDeviceDiagnosticStatus(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetCacheBackupDeviceDiagnosticStatus");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getCacheBackupDeviceDiagnosticStatus".replaceAll("\\{format\\}","json")
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
   * Retrieves the status of a running, interrupted, or completed cache memory diagnostic test.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FruDiagReturn
   * @throws ApiException if fails to make API call
   */
  public FruDiagReturn symbolGetCacheMemoryDiagnosticStatus(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetCacheMemoryDiagnosticStatus");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getCacheMemoryDiagnosticStatus".replaceAll("\\{format\\}","json")
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
   * This procedure is used by clients to query the controller for indications of state changes that have occurred and which would necessitate that the client refresh its view of the storage array&#39;s state. If no state changes need to be reported, the controller will generally hold this request, without responding, for up to the amount of time specified in the argument. If, at any time during the hold period, a state change occurs, the controller will return immediately with the new configuration generation number and/or MEL sequence number. By using this hanging poll approach, the amount of traffic between the client and the server is reduced to an insignificant level, and yet near-immediate notification of changes is still possible.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A ChangeQueryDescriptor object that identifies the caller&#39;s current understanding of the storage array&#39;s state, along with an indication of the maximum hold time for this request. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ChangeState
   * @throws ApiException if fails to make API call
   */
  public ChangeState symbolGetChangeState(String systemId, ChangeQueryDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetChangeState");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetChangeState");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getChangeState".replaceAll("\\{format\\}","json")
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

    
    GenericType<ChangeState> localVarReturnType = new GenericType<ChangeState>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure reports the results of drive channel fault isolation diagnostic tests that were initiated by the startChannelDIagnostics procedure.
   * Documented return codes: ok, channelDiagsRunning, channelDiagsResultsPartial, channelDiagsResultsNotAvailable. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ChannelDiagResultsReturned
   * @throws ApiException if fails to make API call
   */
  public ChannelDiagResultsReturned symbolGetChannelDiagnosticsResults(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetChannelDiagnosticsResults");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getChannelDiagnosticsResults".replaceAll("\\{format\\}","json")
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

    
    GenericType<ChannelDiagResultsReturned> localVarReturnType = new GenericType<ChannelDiagResultsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedures returns the performance limitation values for a host cluster. Those values include the limits on the IOPs and throughput (MB/s). The number of IOPs impacted by the performance limits is also returned.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body This procedure takes a cluster reference as an input parameter. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ClusterPerformanceLimitationValuesReturned
   * @throws ApiException if fails to make API call
   */
  public ClusterPerformanceLimitationValuesReturned symbolGetClusterPerformanceLimitationValues(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetClusterPerformanceLimitationValues");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetClusterPerformanceLimitationValues");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getClusterPerformanceLimitationValues".replaceAll("\\{format\\}","json")
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

    
    GenericType<ClusterPerformanceLimitationValuesReturned> localVarReturnType = new GenericType<ClusterPerformanceLimitationValuesReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure replaces the deprecated stateCapture procedure. It returns a single \&quot;chunk\&quot; of debug information and must be used in a series of like calls in order to retrieve the complete set of debug information.
   * Documented return codes: ok, illegalParam, tryAlternate, noSuchDebugChunk, debugInfoConfigChanged. 
   * @param systemId  (required)
   * @param body A DebugInfoExtent structure containing three pieces of information: a reference to the controller that is to return the data, a \&quot;handle\&quot; identifying a single mutually-consistent set of chunks, and a chunk number that identifies the specific chunk to be returned. On the request for the initial chunk (chunk zero), the handle is not significant. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DebugInfoReturned
   * @throws ApiException if fails to make API call
   */
  public DebugInfoReturned symbolGetControllerDebugInformation(String systemId, DebugInfoExtent body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetControllerDebugInformation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetControllerDebugInformation");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getControllerDebugInformation".replaceAll("\\{format\\}","json")
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

    
    GenericType<DebugInfoReturned> localVarReturnType = new GenericType<DebugInfoReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used by clients to query the referenced controller for up-to-date information about its host-side I/O interfaces. Since this interface information is highly volatile, the object graph data contains only a point-in-time snapshot of the interface data. This procedure can be used to obtain current information that may not be reflected in the most recent object graph.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IOInterfaceTypeDataList
   * @throws ApiException if fails to make API call
   */
  public IOInterfaceTypeDataList symbolGetControllerHostInterfaces(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetControllerHostInterfaces");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getControllerHostInterfaces".replaceAll("\\{format\\}","json")
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

    
    GenericType<IOInterfaceTypeDataList> localVarReturnType = new GenericType<IOInterfaceTypeDataList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * NOTE: object graph data may not be the most recent.
   * Documented return codes: ok, tryAlternate. 
   * @param systemId  (required)
   * @param body A reference to the controller for which the I/O interface information is desired. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ControllerHostIoInterfacesReturned
   * @throws ApiException if fails to make API call
   */
  public ControllerHostIoInterfacesReturned symbolGetControllerHostIoInterfaces(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetControllerHostIoInterfaces");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetControllerHostIoInterfaces");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getControllerHostIoInterfaces".replaceAll("\\{format\\}","json")
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

    
    GenericType<ControllerHostIoInterfacesReturned> localVarReturnType = new GenericType<ControllerHostIoInterfacesReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure allows a client to fetch the data that resides within a designated region of the controller&#39;s NVSRAM. Note that the NVSRAM data is obtained only from the controller to which this request is directed.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body An NVSRAMRegionId value that identifies the region whose data is to be retrieved. The caller is allowed to specify that all NVSRAM regions be obtained, if desired. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return NVSRAMRegionList
   * @throws ApiException if fails to make API call
   */
  public NVSRAMRegionList symbolGetControllerNVSRAM(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetControllerNVSRAM");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetControllerNVSRAM");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getControllerNVSRAM".replaceAll("\\{format\\}","json")
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

    
    GenericType<NVSRAMRegionList> localVarReturnType = new GenericType<NVSRAMRegionList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure gets the internal clock from the controllers. The time is expressed in seconds since midnight (GMT) on 1/1/1970.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ControllerTime
   * @throws ApiException if fails to make API call
   */
  public ControllerTime symbolGetControllerTime(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetControllerTime");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getControllerTime".replaceAll("\\{format\\}","json")
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

    
    GenericType<ControllerTime> localVarReturnType = new GenericType<ControllerTime>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure allows a client to fetch a set of entries with a priority value of EVENT_PRIORITY_CRITICAL from the storage array&#39;s Major Event Log for analysis or display. If there are less critical MEL events than MEL_MAX_XFER_COUNT, all the critical events will be displayed on the first call. If the client receives a number of critical MEL events that is equal to MEL_MAX_XFER_COUNT, then the user must increment the first sequence number to be the highest sequence number in the list of entries returned and repeat the procedure. This process must be repeated until the number of entries returned is less than MEL_MAX_XFER_COUNT.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A MelExtent object that provides the sequence number of the first and last MEL entries to be retrieved. All critical entries between these two numbers (inclusive) will be transferred to the caller as the result of the operation. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return MelEntryList
   * @throws ApiException if fails to make API call
   */
  public MelEntryList symbolGetCriticalMelEntries(String systemId, MelExtent body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetCriticalMelEntries");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetCriticalMelEntries");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getCriticalMelEntries".replaceAll("\\{format\\}","json")
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

    
    GenericType<MelEntryList> localVarReturnType = new GenericType<MelEntryList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Returns a structure containing information about the controller if it is locked down.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return LockDownInfoReturned
   * @throws ApiException if fails to make API call
   */
  public LockDownInfoReturned symbolGetCtlLockDownInfo(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetCtlLockDownInfo");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getCtlLockDownInfo".replaceAll("\\{format\\}","json")
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

    
    GenericType<LockDownInfoReturned> localVarReturnType = new GenericType<LockDownInfoReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns up to two groups of statistical counters, one per controller, bundled together. A counter group is a set of related statistical counters, accumulated over a period of time, along with the associated base time.
   * Documented return codes: ok, error, illegalParam, invalidRequest. 
   * @param systemId  (required)
   * @param body A CumulativeStatisticsDescriptor structure describing the statistics of interest. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return CumulativeStatisticsBundleReturned
   * @throws ApiException if fails to make API call
   */
  public CumulativeStatisticsBundleReturned symbolGetCumulativeStatisticsBundle(String systemId, CumulativeStatisticsDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetCumulativeStatisticsBundle");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetCumulativeStatisticsBundle");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getCumulativeStatisticsBundle".replaceAll("\\{format\\}","json")
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

    
    GenericType<CumulativeStatisticsBundleReturned> localVarReturnType = new GenericType<CumulativeStatisticsBundleReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to request a list of bundles of statistical data. The argument describes the statistics being requested.
   * Documented return codes: ok, error, illegalParam, invalidRequest. 
   * @param systemId  (required)
   * @param body An object containing all of the required elements for the procedure. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return CumulativeStatisticsBundleListReturned
   * @throws ApiException if fails to make API call
   */
  public CumulativeStatisticsBundleListReturned symbolGetCumulativeStatisticsBundles(String systemId, CumulativeStatisticsListDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetCumulativeStatisticsBundles");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetCumulativeStatisticsBundles");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getCumulativeStatisticsBundles".replaceAll("\\{format\\}","json")
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

    
    GenericType<CumulativeStatisticsBundleListReturned> localVarReturnType = new GenericType<CumulativeStatisticsBundleListReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to request the information about a DPL core dump. The parameter is a DPL Core Dump Tag. The value of the tag is unique for each core dump and may be obtained from the DPLCoreDumpData structure in StorageArray.
   * Documented return codes: ok, dplCoreDumpInvalidTag. 
   * @param systemId  (required)
   * @param body The integer value of the dplCoreDumpTag for which you are requesting information. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DPLCoreDumpInfoReturn
   * @throws ApiException if fails to make API call
   */
  public DPLCoreDumpInfoReturn symbolGetDPLCoreDumpInformation(String systemId, Integer body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDPLCoreDumpInformation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetDPLCoreDumpInformation");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDPLCoreDumpInformation".replaceAll("\\{format\\}","json")
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

    
    GenericType<DPLCoreDumpInfoReturn> localVarReturnType = new GenericType<DPLCoreDumpInfoReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure gets a list of volumes encroaching the requested Dacstore area.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A number representing the size of a Dacstore in bytes. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return AbstractVolRefList
   * @throws ApiException if fails to make API call
   */
  public AbstractVolRefList symbolGetDacstoreIncompatibleVolumes(String systemId, Long body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDacstoreIncompatibleVolumes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetDacstoreIncompatibleVolumes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDacstoreIncompatibleVolumes".replaceAll("\\{format\\}","json")
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

    
    GenericType<AbstractVolRefList> localVarReturnType = new GenericType<AbstractVolRefList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to retrieve stable store database metadata.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DatabaseMetadataReturned
   * @throws ApiException if fails to make API call
   */
  public DatabaseMetadataReturned symbolGetDatabaseMetadata(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDatabaseMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDatabaseMetadata".replaceAll("\\{format\\}","json")
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

    
    GenericType<DatabaseMetadataReturned> localVarReturnType = new GenericType<DatabaseMetadataReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure allows a client to retrieve diagnostic information from the storage array&#39;s diagnostic data capture. The client must specify a correct tag and appropriate chunk number. In case of failure, the client must either (1) retry the current chunk number or (2) discard any partially-received log data and retry from the first chunk number (which is one - zero is not a valid chunk number).
   * Documented return codes: ok, illegalParam, ddcUnavail, invalidDdcTag. 
   * @param systemId  (required)
   * @param body A DdcExtent structure specifying the chunk to be retrieved. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DdcLogDataReturned
   * @throws ApiException if fails to make API call
   */
  public DdcLogDataReturned symbolGetDdcLog(String systemId, DdcExtent body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDdcLog");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetDdcLog");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDdcLog".replaceAll("\\{format\\}","json")
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

    
    GenericType<DdcLogDataReturned> localVarReturnType = new GenericType<DdcLogDataReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This returns up to two groups of discrete time series statistics, one per controller
   * Documented return codes: ok, error, illegalParam, invalidRequest. 
   * @param systemId  (required)
   * @param body A StatStreamId object that identifies the discrete time series statistics to return. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DiscreteTimeSeriesBundleReturned
   * @throws ApiException if fails to make API call
   */
  public DiscreteTimeSeriesBundleReturned symbolGetDiscreteTimeSeriesBundle(String systemId, Integer body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDiscreteTimeSeriesBundle");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetDiscreteTimeSeriesBundle");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDiscreteTimeSeriesBundle".replaceAll("\\{format\\}","json")
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

    
    GenericType<DiscreteTimeSeriesBundleReturned> localVarReturnType = new GenericType<DiscreteTimeSeriesBundleReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of drive sets that are candidates for use in expanding the given Disk Pool.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A reference to the Disk Pool to be expanded. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ExpansionCandidatesReturned
   * @throws ApiException if fails to make API call
   */
  public ExpansionCandidatesReturned symbolGetDiskPoolExpansionCandidates(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDiskPoolExpansionCandidates");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetDiskPoolExpansionCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDiskPoolExpansionCandidates".replaceAll("\\{format\\}","json")
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

    
    GenericType<ExpansionCandidatesReturned> localVarReturnType = new GenericType<ExpansionCandidatesReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will return the maximum Reserved Drive Count possible on a disk pool.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A reference to the Disk Pool for which you want the maximum reserved drive count. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DiskPoolMaxReservedDriveCountReturn
   * @throws ApiException if fails to make API call
   */
  public DiskPoolMaxReservedDriveCountReturn symbolGetDiskPoolMaxReservedDriveCount(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDiskPoolMaxReservedDriveCount");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetDiskPoolMaxReservedDriveCount");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDiskPoolMaxReservedDriveCount".replaceAll("\\{format\\}","json")
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

    
    GenericType<DiskPoolMaxReservedDriveCountReturn> localVarReturnType = new GenericType<DiskPoolMaxReservedDriveCountReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure calculates the maximum number of drives that can be removed from a disk pool.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DiskPoolReductionDriveCountReturn
   * @throws ApiException if fails to make API call
   */
  public DiskPoolReductionDriveCountReturn symbolGetDiskPoolReductionDriveCount(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDiskPoolReductionDriveCount");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetDiskPoolReductionDriveCount");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDiskPoolReductionDriveCount".replaceAll("\\{format\\}","json")
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

    
    GenericType<DiskPoolReductionDriveCountReturn> localVarReturnType = new GenericType<DiskPoolReductionDriveCountReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure gets statistical information about all of the drive channels.
   * Documented return codes: ok, error, noHeap. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DriveChannelList
   * @throws ApiException if fails to make API call
   */
  public DriveChannelList symbolGetDriveChannelStatistics(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDriveChannelStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDriveChannelStatistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<DriveChannelList> localVarReturnType = new GenericType<DriveChannelList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure gets the progress of the firmware download.
   * Documented return codes: ok, error, illegalParam, noHeap, tryAlternate, invalidRequest, cacheSyncFailure, downloadInProgress, missingData, quiescenceFailed, allFailed, partialOk. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DriveFirmwareStatus
   * @throws ApiException if fails to make API call
   */
  public DriveFirmwareStatus symbolGetDriveFirmwareDownloadProgress(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDriveFirmwareDownloadProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDriveFirmwareDownloadProgress".replaceAll("\\{format\\}","json")
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

    
    GenericType<DriveFirmwareStatus> localVarReturnType = new GenericType<DriveFirmwareStatus>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure gets the drive&#39;s log sense pages.
   * Documented return codes: ok, noHeap, internalError, invalidDriveref. 
   * @param systemId  (required)
   * @param body This object contains information identifying all drives that are affected by this operation. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DriveLogData
   * @throws ApiException if fails to make API call
   */
  public DriveLogData symbolGetDriveLogData(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDriveLogData");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetDriveLogData");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDriveLogData".replaceAll("\\{format\\}","json")
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

    
    GenericType<DriveLogData> localVarReturnType = new GenericType<DriveLogData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure retrieves temperature data for drives in the storage array.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return DriveTemperatureReturned
   * @throws ApiException if fails to make API call
   */
  public DriveTemperatureReturned symbolGetDriveTemperatures(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetDriveTemperatures");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getDriveTemperatures".replaceAll("\\{format\\}","json")
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

    
    GenericType<DriveTemperatureReturned> localVarReturnType = new GenericType<DriveTemperatureReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will retrieve state capture information from controller and expansion enclosures, including DCMs, if any. Send the command to both controllers if the tray is an RBOD.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body The ref corresponding to the enclosure for which the data is requested. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithOpaqueData
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithOpaqueData symbolGetEnclosureStateCaptureData(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetEnclosureStateCaptureData");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetEnclosureStateCaptureData");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getEnclosureStateCaptureData".replaceAll("\\{format\\}","json")
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

    
    GenericType<ReturnCodeWithOpaqueData> localVarReturnType = new GenericType<ReturnCodeWithOpaqueData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure retrieves temperature data for each thermal sensor in each enclosure in the storage array.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return TrayTemperatureReturned
   * @throws ApiException if fails to make API call
   */
  public TrayTemperatureReturned symbolGetEnclosureTemperatures(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetEnclosureTemperatures");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getEnclosureTemperatures".replaceAll("\\{format\\}","json")
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

    
    GenericType<TrayTemperatureReturned> localVarReturnType = new GenericType<TrayTemperatureReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to request Energy Star data from all power supplies.
   * Documented return codes: ok, unsupportedEsmRequest. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return EnergyStarDataReturn
   * @throws ApiException if fails to make API call
   */
  public EnergyStarDataReturn symbolGetEnergyStarData(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetEnergyStarData");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getEnergyStarData".replaceAll("\\{format\\}","json")
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

    
    GenericType<EnergyStarDataReturn> localVarReturnType = new GenericType<EnergyStarDataReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns the InfiniBand statistics, which consists of start-of-day-relative interface statistics and baseline-relative statistics. It supersedes the deprecated getIbStatistics () routine.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return EnhancedIbStatisticsReturned
   * @throws ApiException if fails to make API call
   */
  public EnhancedIbStatisticsReturned symbolGetEnhancedIbStatistics(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetEnhancedIbStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getEnhancedIbStatistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<EnhancedIbStatisticsReturned> localVarReturnType = new GenericType<EnhancedIbStatisticsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure gets the log data for the indicated environmental card.
   * Documented return codes: ok, noHeap, internalError, invalidEsmref. 
   * @param systemId  (required)
   * @param body The argument is a component reference indicating the environmental card which is to have its log data returned. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return EnvCardLogDataReturned
   * @throws ApiException if fails to make API call
   */
  public EnvCardLogDataReturned symbolGetEnvCardLogData(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetEnvCardLogData");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetEnvCardLogData");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getEnvCardLogData".replaceAll("\\{format\\}","json")
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

    
    GenericType<EnvCardLogDataReturned> localVarReturnType = new GenericType<EnvCardLogDataReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of volume group export dependencies for the identified volume group. The returned list consists of the input volume group&#39;s immediate export dependencies only. The procedure does not return transitive dependencies. It is up to the caller to create the complete dependency graph through successive calls to this procedure.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A SYMbol VolumeGroupRef identifying the volume group for which export dependencies are to be reported. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ExportDependenciesReturned
   * @throws ApiException if fails to make API call
   */
  public ExportDependenciesReturned symbolGetExportDependencies(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetExportDependencies");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetExportDependencies");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getExportDependencies".replaceAll("\\{format\\}","json")
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

    
    GenericType<ExportDependenciesReturned> localVarReturnType = new GenericType<ExportDependenciesReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure retrieves analytics data from the last capture period. It returns the cache hits for various sizes of flash cache.
   * Documented return codes: ok, error, illegalParam, internalError, invalidVolumeref, notFlashcacheVol, flashcacheInvalidAnalyticsState. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FlashCacheAnalyticsReturned
   * @throws ApiException if fails to make API call
   */
  public FlashCacheAnalyticsReturned symbolGetFlashCacheAnalytics(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetFlashCacheAnalytics");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetFlashCacheAnalytics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getFlashCacheAnalytics".replaceAll("\\{format\\}","json")
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

    
    GenericType<FlashCacheAnalyticsReturned> localVarReturnType = new GenericType<FlashCacheAnalyticsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to retrieve flash cache statistics.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FlashCacheStatisticsReturned
   * @throws ApiException if fails to make API call
   */
  public FlashCacheStatisticsReturned symbolGetFlashCacheStatistics(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetFlashCacheStatistics");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetFlashCacheStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getFlashCacheStatistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<FlashCacheStatisticsReturned> localVarReturnType = new GenericType<FlashCacheStatisticsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns up to two groups of histogram statistics, one per controller,
   * Documented return codes: ok, error, illegalParam, invalidRequest. 
   * @param systemId  (required)
   * @param body A StatStreamId object that identifies the histogram statistics to return. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return HistogramBundleReturned
   * @throws ApiException if fails to make API call
   */
  public HistogramBundleReturned symbolGetHistogramBundle(String systemId, Integer body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetHistogramBundle");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetHistogramBundle");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getHistogramBundle".replaceAll("\\{format\\}","json")
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

    
    GenericType<HistogramBundleReturned> localVarReturnType = new GenericType<HistogramBundleReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieves the status of a running, interrupted, or completed host card diagnostic test.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FruDiagReturn
   * @throws ApiException if fails to make API call
   */
  public FruDiagReturn symbolGetHostCardDiagnosticStatus(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetHostCardDiagnosticStatus");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getHostCardDiagnosticStatus".replaceAll("\\{format\\}","json")
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
   * This procedure allows the Host Specific NVSRAM region to be read to obtain information for a specific host.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body An NVSRAMRegionIDAndHostIndex object that specifies the region ID (in this case 0xF2) and the host index for a specific host. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return NVSRAMRegionList
   * @throws ApiException if fails to make API call
   */
  public NVSRAMRegionList symbolGetHostSpecificNVSRAM(String systemId, NVSRAMRegionIdAndHostIndex body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetHostSpecificNVSRAM");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetHostSpecificNVSRAM");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getHostSpecificNVSRAM".replaceAll("\\{format\\}","json")
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

    
    GenericType<NVSRAMRegionList> localVarReturnType = new GenericType<NVSRAMRegionList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of hot spare candidates with the volume groups that they potentially cover.
   * Documented return codes: ok, noHeap, internalError. 
   * @param systemId  (required)
   * @param body This object contains information describing the physical drive types supported. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return HotSpareCandidateList
   * @throws ApiException if fails to make API call
   */
  public HotSpareCandidateList symbolGetHotSpareCandidates(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetHotSpareCandidates");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetHotSpareCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getHotSpareCandidates".replaceAll("\\{format\\}","json")
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

    
    GenericType<HotSpareCandidateList> localVarReturnType = new GenericType<HotSpareCandidateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of all hot spare drives and their volume groups.
   * Documented return codes: ok, noHeap, volumeNotExist. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return HotSpareCoverageList
   * @throws ApiException if fails to make API call
   */
  public HotSpareCoverageList symbolGetHotSpareCoverage(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetHotSpareCoverage");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getHotSpareCoverage".replaceAll("\\{format\\}","json")
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

    
    GenericType<HotSpareCoverageList> localVarReturnType = new GenericType<HotSpareCoverageList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to request information about an IOC Dump. The parameter is an IOC Dump Tag. The value of the tag is unique for each dump and may be obtained from the IOCDumpData structure in StorageArray.
   * Documented return codes: ok, iocDumpInvalidTag. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IOCDumpInfoReturn
   * @throws ApiException if fails to make API call
   */
  public IOCDumpInfoReturn symbolGetIOCDumpInformation(String systemId, Integer body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetIOCDumpInformation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetIOCDumpInformation");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getIOCDumpInformation".replaceAll("\\{format\\}","json")
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

    
    GenericType<IOCDumpInfoReturn> localVarReturnType = new GenericType<IOCDumpInfoReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns attribute information for each InfiniBand I/O controller that is part of the Infiniband I/O Unit. An InfiniBand I/O Controller is a logical entity defined in the InfiniBand Architecture. It does not correlate one-to-one with a storage array controller
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IbIocAttributesReturned
   * @throws ApiException if fails to make API call
   */
  public IbIocAttributesReturned symbolGetIbIocAttributes(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetIbIocAttributes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getIbIocAttributes".replaceAll("\\{format\\}","json")
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

    
    GenericType<IbIocAttributesReturned> localVarReturnType = new GenericType<IbIocAttributesReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a group of InfiniBand port partition tables, one table for each InfiniBand port of the Infiniband I/O Unit (i.e., storage array).
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IbPortPartitionTablesReturned
   * @throws ApiException if fails to make API call
   */
  public IbPortPartitionTablesReturned symbolGetIbPortPartitionTables(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetIbPortPartitionTables");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getIbPortPartitionTables".replaceAll("\\{format\\}","json")
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

    
    GenericType<IbPortPartitionTablesReturned> localVarReturnType = new GenericType<IbPortPartitionTablesReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns various items of information about InfiniBand RDMA channels that are presently active in the Infiniband I/O Unit (i.e., storage array).
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IbRdmaChannelsReturned
   * @throws ApiException if fails to make API call
   */
  public IbRdmaChannelsReturned symbolGetIbRdmaChannels(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetIbRdmaChannels");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getIbRdmaChannels".replaceAll("\\{format\\}","json")
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

    
    GenericType<IbRdmaChannelsReturned> localVarReturnType = new GenericType<IbRdmaChannelsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns the InfiniBand statistics, which consist of start-of-day-relative interface statistics, baseline-relative interface statistics, target channel adapter statistics, and RDMA channel statistics.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IbStatisticsReturned
   * @throws ApiException if fails to make API call
   */
  public IbStatisticsReturned symbolGetIbStatistics(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetIbStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getIbStatistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<IbStatisticsReturned> localVarReturnType = new GenericType<IbStatisticsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of volume group import dependencies for the identified volume group. The reported information identifies the types of dependencies that exist for the volume group. It is necessary for this procedure to spin up the drives in the volume group so that their configuration databases can be read. An error is returned if the volume group is not in the exported or forced state.
   * Documented return codes: ok, volumeGroupStateNotValid, driveSpinUpError. 
   * @param systemId  (required)
   * @param body A SYMbol VolumeGroupRef identifying the volume group for which import dependencies are to be reported. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ImportDependenciesReturned
   * @throws ApiException if fails to make API call
   */
  public ImportDependenciesReturned symbolGetImportDependencies(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetImportDependencies");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetImportDependencies");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getImportDependencies".replaceAll("\\{format\\}","json")
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

    
    GenericType<ImportDependenciesReturned> localVarReturnType = new GenericType<ImportDependenciesReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will perform diagnostic tests on all channels of a given iSCSI HIC. These diagnostics are dependent on the PHY used on a particular HIC, so they may not be available on all ports of the controller.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body Information used to start iSCSI cable diagnostics. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IscsiCableDiagnosticsReturn
   * @throws ApiException if fails to make API call
   */
  public IscsiCableDiagnosticsReturn symbolGetIscsiCopperCableDiagnostics(String systemId, IscsiCableDiagnosticsDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetIscsiCopperCableDiagnostics");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetIscsiCopperCableDiagnostics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getIscsiCopperCableDiagnostics".replaceAll("\\{format\\}","json")
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

    
    GenericType<IscsiCableDiagnosticsReturn> localVarReturnType = new GenericType<IscsiCableDiagnosticsReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns the default values for negotiable settings for sessions and connections. These represent the storage array&#39;s starting point for negotiations.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IscsiNegotiationDefaultsReturned
   * @throws ApiException if fails to make API call
   */
  public IscsiNegotiationDefaultsReturned symbolGetIscsiNegotiationDefaults(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetIscsiNegotiationDefaults");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getIscsiNegotiationDefaults".replaceAll("\\{format\\}","json")
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

    
    GenericType<IscsiNegotiationDefaultsReturned> localVarReturnType = new GenericType<IscsiNegotiationDefaultsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns data about active iSCSI sessions.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A GetIscsiSessionsFilter object that indicates that either all or a subset of the session data should be returned. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IscsiSessionsReturned
   * @throws ApiException if fails to make API call
   */
  public IscsiSessionsReturned symbolGetIscsiSessions(String systemId, GetIscsiSessionsFilter body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetIscsiSessions");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetIscsiSessions");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getIscsiSessions".replaceAll("\\{format\\}","json")
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

    
    GenericType<IscsiSessionsReturned> localVarReturnType = new GenericType<IscsiSessionsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns iSCSI statistical data collected by the storage array. The caller may request either the \&quot;raw\&quot; counts, which are relative to controller start-of-day, or baseline-relative counters, which are relative to the baseline which was last set using the setIscsiStatisticsBaselilne procedure. If the user has not set a baseline since controller start-of-day, then the time at start-of-day is the default baseline time.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body An IscsiStatisticsReportType object that indicates if the reported statistics should be the raw or baseline-relative counters. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return IscsiStatisticsReturned
   * @throws ApiException if fails to make API call
   */
  public IscsiStatisticsReturned symbolGetIscsiStatistics(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetIscsiStatistics");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetIscsiStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getIscsiStatistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<IscsiStatisticsReturned> localVarReturnType = new GenericType<IscsiStatisticsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of LUN mappings that apply to the object identified by the argument SYMbolRef.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body The SYMbolRef value of the entity for which applicable LUN mappings are to be returned. For example, to find all LUN mappings that apply to a particular Cluster object, the associated ClusterRef would be used as the argument. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return LUNMappings
   * @throws ApiException if fails to make API call
   */
  public LUNMappings symbolGetLUNMappings(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetLUNMappings");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetLUNMappings");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getLUNMappings".replaceAll("\\{format\\}","json")
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

    
    GenericType<LUNMappings> localVarReturnType = new GenericType<LUNMappings>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will report progress on each actively running long-lived operation.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return LongLivedOpsProgressReturn
   * @throws ApiException if fails to make API call
   */
  public LongLivedOpsProgressReturn symbolGetLongLivedOpsProgress(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetLongLivedOpsProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getLongLivedOpsProgress".replaceAll("\\{format\\}","json")
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

    
    GenericType<LongLivedOpsProgressReturn> localVarReturnType = new GenericType<LongLivedOpsProgressReturn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure allows a client to fetch a set of entries from the storage array&#39;s Major Event Log for analysis or display. Note that the MEL_MAX_XFER_COUNT constant specifies that maximum number of entries that can be requested in one operation. If more entries are needed, the client must fetch them iteratively, ensuring that no single request exceeds the transfer limit.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A MelExtent object that provides the sequence number of the first and last MEL entries to be retrieved. All entries between these two numbers (inclusive) will be transferred to the caller as a result of this operation. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return MelEntryList
   * @throws ApiException if fails to make API call
   */
  public MelEntryList symbolGetMelEntries(String systemId, MelExtent body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetMelEntries");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetMelEntries");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getMelEntries".replaceAll("\\{format\\}","json")
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

    
    GenericType<MelEntryList> localVarReturnType = new GenericType<MelEntryList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to determine the head and tail sequence numbers of entries in the storage array&#39;s Major Event Log. The client can use these values to manage controlled fetching of log entries.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return MelExtent
   * @throws ApiException if fails to make API call
   */
  public MelExtent symbolGetMelExtent(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetMelExtent");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getMelExtent".replaceAll("\\{format\\}","json")
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

    
    GenericType<MelExtent> localVarReturnType = new GenericType<MelExtent>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns the amount of storage required for a metadata volume.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body The metadata volume type e.g. remote volume mirror metadata. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer symbolGetMetadataVolumeCapacity(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetMetadataVolumeCapacity");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetMetadataVolumeCapacity");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getMetadataVolumeCapacity".replaceAll("\\{format\\}","json")
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

    
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure causes all configuration and state information to be returned to the requester. The information is conveyed in the form of an object graph. The ObjectBundle object contains a set of all known logical and physical components. The reference values within these objects can be analyzed to determine the interrelationships and linkages between the key objects, and thus to establish the true graph-oriented image of the storage array state.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ObjectBundle
   * @throws ApiException if fails to make API call
   */
  public ObjectBundle symbolGetObjectGraph(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetObjectGraph");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getObjectGraph".replaceAll("\\{format\\}","json")
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

    
    GenericType<ObjectBundle> localVarReturnType = new GenericType<ObjectBundle>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will return repository utilization information for PiT groups.
   * Documented return codes: ok, invalidPitGroupRef. 
   * @param systemId  (required)
   * @param body A list of PiT groups for which to return repository utilization. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return PITGroupRepositoryUtilizationListReturned
   * @throws ApiException if fails to make API call
   */
  public PITGroupRepositoryUtilizationListReturned symbolGetPITGroupRepositoryUtilization(String systemId, PITGroupRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetPITGroupRepositoryUtilization");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetPITGroupRepositoryUtilization");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getPITGroupRepositoryUtilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<PITGroupRepositoryUtilizationListReturned> localVarReturnType = new GenericType<PITGroupRepositoryUtilizationListReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will return repository utilization information for PiT Views.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A list of PiT Views for which to return repository utilization. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return PITViewRepositoryUtilizationListReturned
   * @throws ApiException if fails to make API call
   */
  public PITViewRepositoryUtilizationListReturned symbolGetPITViewRepositoryUtilization(String systemId, PITViewRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetPITViewRepositoryUtilization");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetPITViewRepositoryUtilization");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getPITViewRepositoryUtilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<PITViewRepositoryUtilizationListReturned> localVarReturnType = new GenericType<PITViewRepositoryUtilizationListReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of persistent registrations on the array.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return PRegistrationList
   * @throws ApiException if fails to make API call
   */
  public PRegistrationList symbolGetPRegistrations(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetPRegistrations");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getPRegistrations".replaceAll("\\{format\\}","json")
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

    
    GenericType<PRegistrationList> localVarReturnType = new GenericType<PRegistrationList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of the persistent registrations for the specified volume.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body The AbstractVolRef object for the specific volume. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return PRegistrationList
   * @throws ApiException if fails to make API call
   */
  public PRegistrationList symbolGetPRegistrationsForVolume(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetPRegistrationsForVolume");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetPRegistrationsForVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getPRegistrationsForVolume".replaceAll("\\{format\\}","json")
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

    
    GenericType<PRegistrationList> localVarReturnType = new GenericType<PRegistrationList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used to check the progress of a power supply firmware update operation.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return PSUFirmwareUpdateStatus
   * @throws ApiException if fails to make API call
   */
  public PSUFirmwareUpdateStatus symbolGetPSUFirmwareUpdateProgress(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetPSUFirmwareUpdateProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getPSUFirmwareUpdateProgress".replaceAll("\\{format\\}","json")
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

    
    GenericType<PSUFirmwareUpdateStatus> localVarReturnType = new GenericType<PSUFirmwareUpdateStatus>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns an indication of the progress of an explicit parity check operation on a particular volume. This procedure is deprecated. The scanVolume procedure should be used instead.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body The AbstractVolRef value for the volume whose parity check operation is being queried. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer symbolGetParityCheckProgress(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetParityCheckProgress");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetParityCheckProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getParityCheckProgress".replaceAll("\\{format\\}","json")
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

    
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * Documented return codes: ok, noHeap, internalError. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return CheckedPendingHostListReturned
   * @throws ApiException if fails to make API call
   */
  public CheckedPendingHostListReturned symbolGetPendingHosts(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetPendingHosts");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getPendingHosts".replaceAll("\\{format\\}","json")
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

    
    GenericType<CheckedPendingHostListReturned> localVarReturnType = new GenericType<CheckedPendingHostListReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the list of persistent registrations on the array OBSOLETE: Any call to getPersistantReservations will get a return status indicating the command is obsolete. Please use the new command getPRegistrations.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return PersistentRegistrationList
   * @throws ApiException if fails to make API call
   */
  public PersistentRegistrationList symbolGetPersistentRegistrations(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetPersistentRegistrations");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getPersistentRegistrations".replaceAll("\\{format\\}","json")
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

    
    GenericType<PersistentRegistrationList> localVarReturnType = new GenericType<PersistentRegistrationList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the persistent registrations for the specified volume. The list will contain no more than one PersistentRegistration element. OBSOLETE: Any call to getPersistantReservationsForVolume will get a return status indicating the command is obsolete. Please use the new commands getPRegistrationsForVolume.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return PersistentRegistrationList
   * @throws ApiException if fails to make API call
   */
  public PersistentRegistrationList symbolGetPersistentRegistrationsForVolume(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetPersistentRegistrationsForVolume");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetPersistentRegistrationsForVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getPersistentRegistrationsForVolume".replaceAll("\\{format\\}","json")
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

    
    GenericType<PersistentRegistrationList> localVarReturnType = new GenericType<PersistentRegistrationList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure retrieves a list of product capabilities supported by the array.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ProductCapabilityList
   * @throws ApiException if fails to make API call
   */
  public ProductCapabilityList symbolGetProductCapabilities(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetProductCapabilities");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getProductCapabilities".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProductCapabilityList> localVarReturnType = new GenericType<ProductCapabilityList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns the Read Link Status information.
   * Documented return codes: ok, dstNotFibre. 
   * @param systemId  (required)
   * @param body A RLS Command Descriptor that provides the type of RLS command. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return RLSResults
   * @throws ApiException if fails to make API call
   */
  public RLSResults symbolGetReadLinkStatus(String systemId, RLSCommandDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetReadLinkStatus");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetReadLinkStatus");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getReadLinkStatus".replaceAll("\\{format\\}","json")
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

    
    GenericType<RLSResults> localVarReturnType = new GenericType<RLSResults>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used by clients to obtain information about all component or logic failures on the storage array that require some form of recovery action.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return FailureTypeList
   * @throws ApiException if fails to make API call
   */
  public FailureTypeList symbolGetRecoveryFailureList(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetRecoveryFailureList");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getRecoveryFailureList".replaceAll("\\{format\\}","json")
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

    
    GenericType<FailureTypeList> localVarReturnType = new GenericType<FailureTypeList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns information on the available connections between two arrays. This can be used prior to creation of an AsyncMirrorGroup to determine if there are wiring or other connection configuration issues between the two arrays. A call to this procedure acts like a ping test between the arrays and returns back information on the connections that succeed. This must be issued to each controller independently and should be called in fibre channel environments after activation of fibre channel remote mirroring.
   * Documented return codes: ok, notImplemented. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ScsiRemoteConnectionsReturned
   * @throws ApiException if fails to make API call
   */
  public ScsiRemoteConnectionsReturned symbolGetRemoteConnections(String systemId, InitiatorTargetInitialProperties body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetRemoteConnections");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetRemoteConnections");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getRemoteConnections".replaceAll("\\{format\\}","json")
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

    
    GenericType<ScsiRemoteConnectionsReturned> localVarReturnType = new GenericType<ScsiRemoteConnectionsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used by clients to obtain information about the utilization of the repository volume for selected snapshots.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A list of snapshot volume reference values. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return RepositoryUtilizationList
   * @throws ApiException if fails to make API call
   */
  public RepositoryUtilizationList symbolGetRepositoryUtilization(String systemId, SnapshotRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetRepositoryUtilization");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetRepositoryUtilization");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getRepositoryUtilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<RepositoryUtilizationList> localVarReturnType = new GenericType<RepositoryUtilizationList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns an object that contains high-level status information about the storage array as a whole.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return SAData
   * @throws ApiException if fails to make API call
   */
  public SAData symbolGetSAData(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetSAData");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getSAData".replaceAll("\\{format\\}","json")
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

    
    GenericType<SAData> localVarReturnType = new GenericType<SAData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieves a storage array port. OBSOLETE: Any call to getSAPort will get a return status indicating the command is obsolete. No alternative procedure is available.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ReturnCodeWithRef
   * @throws ApiException if fails to make API call
   */
  public ReturnCodeWithRef symbolGetSAPort(String systemId, SAPortGetDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetSAPort");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetSAPort");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getSAPort".replaceAll("\\{format\\}","json")
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
   * This procedure is used to retrieve the digest of the view array password and its associated salt value which are saved in the array by the setViewPassword procedure. If the view array password isn&#39;t set, the procedure returns a random salt value and the digest of the salt value message.
   * Documented return codes: ok, adminPasswordNotSet. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return SAViewPasswordDigestReturned
   * @throws ApiException if fails to make API call
   */
  public SAViewPasswordDigestReturned symbolGetSAViewPasswordDigest(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetSAViewPasswordDigest");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getSAViewPasswordDigest".replaceAll("\\{format\\}","json")
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

    
    GenericType<SAViewPasswordDigestReturned> localVarReturnType = new GenericType<SAViewPasswordDigestReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns the SAS PHY error statistics for all SAS devices in the storage array.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return SasStatisticsReturned
   * @throws ApiException if fails to make API call
   */
  public SasStatisticsReturned symbolGetSasErrorStatistics(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetSasErrorStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getSasErrorStatistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<SasStatisticsReturned> localVarReturnType = new GenericType<SasStatisticsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns SOC error statistics.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A SOC command descriptor that indicates the devices for which statistics should be returned. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return SocStatisticsReturned
   * @throws ApiException if fails to make API call
   */
  public SocStatisticsReturned symbolGetSocErrorStatistics(String systemId, SocCommandDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetSocErrorStatistics");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetSocErrorStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getSocErrorStatistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<SocStatisticsReturned> localVarReturnType = new GenericType<SocStatisticsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns the default values for system attributes.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return SystemAttributeDefaultsReturned
   * @throws ApiException if fails to make API call
   */
  public SystemAttributeDefaultsReturned symbolGetSystemAttributeDefaults(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetSystemAttributeDefaults");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getSystemAttributeDefaults".replaceAll("\\{format\\}","json")
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

    
    GenericType<SystemAttributeDefaultsReturned> localVarReturnType = new GenericType<SystemAttributeDefaultsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will retrieve a thin volume&#39;s Expandable Repository Volume consumed capacity.
   * Documented return codes: ok, noHeap, invalidVolumeref, alternateRequiredForOperation, illegalVolume. 
   * @param systemId  (required)
   * @param body A reference to the thin volume for which you want the consumed capacity. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ThinVolumeConsumedCapacityReturned
   * @throws ApiException if fails to make API call
   */
  public ThinVolumeConsumedCapacityReturned symbolGetThinVolumeConsumedCapacity(String systemId, ThinVolumeRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetThinVolumeConsumedCapacity");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetThinVolumeConsumedCapacity");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getThinVolumeConsumedCapacity".replaceAll("\\{format\\}","json")
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

    
    GenericType<ThinVolumeConsumedCapacityReturned> localVarReturnType = new GenericType<ThinVolumeConsumedCapacityReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure will retrieve a thin volume&#39;s repository expansion history.
   * Documented return codes: ok, illegalParam, invalidVolumeref. 
   * @param systemId  (required)
   * @param body A reference to the thin volume for which you want the repository expansion history. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ThinVolumeRepositoryExpansionHistoryListReturned
   * @throws ApiException if fails to make API call
   */
  public ThinVolumeRepositoryExpansionHistoryListReturned symbolGetThinVolumeExpansionHistory(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetThinVolumeExpansionHistory");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetThinVolumeExpansionHistory");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getThinVolumeExpansionHistory".replaceAll("\\{format\\}","json")
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

    
    GenericType<ThinVolumeRepositoryExpansionHistoryListReturned> localVarReturnType = new GenericType<ThinVolumeRepositoryExpansionHistoryListReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of initiators that have been detected by the storage array, but which are not configured into the storage array topology. An initiator is considered unconfigured if it is not associated with a host.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return UnconfiguredInitiatorsReturned
   * @throws ApiException if fails to make API call
   */
  public UnconfiguredInitiatorsReturned symbolGetUnconfiguredInitiators(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetUnconfiguredInitiators");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getUnconfiguredInitiators".replaceAll("\\{format\\}","json")
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

    
    GenericType<UnconfiguredInitiatorsReturned> localVarReturnType = new GenericType<UnconfiguredInitiatorsReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns information about host ports whose world-wide names are known to the controller, but which have not been defined as full HostPort objects via the SYMbol interface. Note that you only need to send the request to one of the controllers, and that the same list of unlabeled host ports are returned, regardless of which controller receives the request. This procedure does not apply to iSCSI. The getUnconfiguredInitiators procedure should be used instead.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String symbolGetUnlabeledHostPorts(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetUnlabeledHostPorts");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getUnlabeledHostPorts".replaceAll("\\{format\\}","json")
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
   * This procedure returns an indication of the extent to which a long-running operation on a volume has completed. The set of supported long-running operations is defined by the VolumeAction enumeration. This procedure can also be called for a snapshot volume. The set of supported long-running operations for snapshot volumes is defined by the SnapshotAction enumeration.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body The value of the AbstractVolRef for the volume whose long-running operation is being queried. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return VolumeActionProgress
   * @throws ApiException if fails to make API call
   */
  public VolumeActionProgress symbolGetVolumeActionProgress(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetVolumeActionProgress");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetVolumeActionProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getVolumeActionProgress".replaceAll("\\{format\\}","json")
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

    
    GenericType<VolumeActionProgress> localVarReturnType = new GenericType<VolumeActionProgress>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of volume candidates that can be used in an ensuing volume creation request.
   * Documented return codes: error, invalidSecurity, noFdeDrives, volumeGroupSecure. 
   * @param systemId  (required)
   * @param body A VolumeCandidateRequest descriptor that specifies the type of volume candidates to be returned to the caller. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return VolumeCandidateList
   * @throws ApiException if fails to make API call
   */
  public VolumeCandidateList symbolGetVolumeCandidates(String systemId, VolumeCandidateRequest body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetVolumeCandidates");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetVolumeCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getVolumeCandidates".replaceAll("\\{format\\}","json")
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

    
    GenericType<VolumeCandidateList> localVarReturnType = new GenericType<VolumeCandidateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of volume source candidates for creating a volume copy.
   * Documented return codes: ok, illegalParam, noHeap, tryAlternate, iconFailure, maxVolumeCopysExceeded, volcopyFeatureDisabled. 
   * @param systemId  (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return VolumeCopyCandidateList
   * @throws ApiException if fails to make API call
   */
  public VolumeCopyCandidateList symbolGetVolumeCopySourceCandidates(String systemId, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetVolumeCopySourceCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getVolumeCopySourceCandidates".replaceAll("\\{format\\}","json")
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

    
    GenericType<VolumeCopyCandidateList> localVarReturnType = new GenericType<VolumeCopyCandidateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of volume target candidates for creating a volume copy.
   * Documented return codes: ok, illegalParam, noHeap, tryAlternate, iconFailure, maxVolumeCopysExceeded, volcopyFeatureDisabled. 
   * @param systemId  (required)
   * @param body An AbstractVolRef descriptor that specifies the source volume for which the target candidates are requested (i.e. the source volume in the candidate copy relationship\u2026 the SYMbol client is requesting valid target volumes to use with this source volume). (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return VolumeCopyCandidateList
   * @throws ApiException if fails to make API call
   */
  public VolumeCopyCandidateList symbolGetVolumeCopyTargetCandidates(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetVolumeCopyTargetCandidates");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetVolumeCopyTargetCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getVolumeCopyTargetCandidates".replaceAll("\\{format\\}","json")
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

    
    GenericType<VolumeCopyCandidateList> localVarReturnType = new GenericType<VolumeCopyCandidateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * The firmware prioritizes the properties of candidates for constructing the return list, subject to the volume group having a given property in the first place. The prioritization and ordering of the list is as follows:
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A reference to the volume group to which the candidates are to apply. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return ExpansionCandidatesReturned
   * @throws ApiException if fails to make API call
   */
  public ExpansionCandidatesReturned symbolGetVolumeGroupExpansionCandidates(String systemId, String body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetVolumeGroupExpansionCandidates");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetVolumeGroupExpansionCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getVolumeGroupExpansionCandidates".replaceAll("\\{format\\}","json")
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

    
    GenericType<ExpansionCandidatesReturned> localVarReturnType = new GenericType<ExpansionCandidatesReturned>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure returns a list of mirror volume candidates that can be used in an ensuing mirror volume creation request.
   * Documented return codes: ok, illegalParam, noHeap, internalError, invalidVolumeref, ghostVolume, metadataVolNonexistent, rvmFeatureDisabled, maxMirrorsExceeded, invalidMirrorCandidateVol, noValidMirrorCandidate, remoteMaxMirrorsExceeded, remoteRvmFeatureDisabled, remoteMetadataVolNonexistent, rvmVersionMismatch, rvmRemoteArrayError, rvmCommunicationError. 
   * @param systemId  (required)
   * @param body A MirrorVolumeCandidateRequest descriptor that specifies the type of mirror volume candidates to be returned to the caller. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return MirrorVolumeCandidateList
   * @throws ApiException if fails to make API call
   */
  public MirrorVolumeCandidateList symbolGetVolumeListForMirroring(String systemId, MirrorCandidateDescriptor body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetVolumeListForMirroring");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetVolumeListForMirroring");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getVolumeListForMirroring".replaceAll("\\{format\\}","json")
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

    
    GenericType<MirrorVolumeCandidateList> localVarReturnType = new GenericType<MirrorVolumeCandidateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * This procedure is used by the client to retrieve performance monitoring data for one or more volumes.
   * Documented return codes: ok. 
   * @param systemId  (required)
   * @param body A list of AbstractVolRef values of the volumes for which the caller wishes to obtain performance monitoring information. (required)
   * @param controller Controller selection (optional, default to auto)
   * @param verboseErrorResponse  (optional, default to true)
   * @return VolumePerformanceList
   * @throws ApiException if fails to make API call
   */
  public VolumePerformanceList symbolGetVolumePerformance(String systemId, AbstractVolRefList body, String controller, Boolean verboseErrorResponse) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling symbolGetVolumePerformance");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling symbolGetVolumePerformance");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/symbol/getVolumePerformance".replaceAll("\\{format\\}","json")
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

    
    GenericType<VolumePerformanceList> localVarReturnType = new GenericType<VolumePerformanceList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
