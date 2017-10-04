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
public class MirroringApi {
  private ApiClient apiClient;

  public MirroringApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MirroringApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Begin synchronization of an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void beginSynchronizationAMG(String systemId, String id, AsyncMirrorGroupSyncRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling beginSynchronizationAMG");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling beginSynchronizationAMG");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{id}/sync".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Complete an incomplete Async Mirror relationship
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param incompleteMirrorId  (required)
   * @param body  (optional)
   * @return AmgMember
   * @throws ApiException if fails to make API call
   */
  public AmgMember completeIncompleteAMG(String systemId, String incompleteMirrorId, AsyncMirrorGroupMemberCompletionRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling completeIncompleteAMG");
    }
    
    // verify the required parameter 'incompleteMirrorId' is set
    if (incompleteMirrorId == null) {
      throw new ApiException(400, "Missing the required parameter 'incompleteMirrorId' when calling completeIncompleteAMG");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/incomplete-pairs/{incompleteMirrorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "incompleteMirrorId" + "\\}", apiClient.escapeString(incompleteMirrorId.toString()));

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

    
    GenericType<AmgMember> localVarReturnType = new GenericType<AmgMember>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a specific Async Mirror Group Member
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return AmgMember
   * @throws ApiException if fails to make API call
   */
  public AmgMember getAMGMember(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAMGMember");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAMGMember");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/pairs/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<AmgMember> localVarReturnType = new GenericType<AmgMember>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve a member volume associated with an AMG
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param mirrorId  (required)
   * @param id  (required)
   * @return AmgMember
   * @throws ApiException if fails to make API call
   */
  public AmgMember getAMGMemberVolume(String systemId, String mirrorId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAMGMemberVolume");
    }
    
    // verify the required parameter 'mirrorId' is set
    if (mirrorId == null) {
      throw new ApiException(400, "Missing the required parameter 'mirrorId' when calling getAMGMemberVolume");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAMGMemberVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{mirror-id}/pairs/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "mirror-id" + "\\}", apiClient.escapeString(mirrorId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<AmgMember> localVarReturnType = new GenericType<AmgMember>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve sync progress of an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param mirrorGroupId  (required)
   * @return AsyncMirrorGroupSyncProgress
   * @throws ApiException if fails to make API call
   */
  public AsyncMirrorGroupSyncProgress getAMGSyncProgress(String systemId, String mirrorGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAMGSyncProgress");
    }
    
    // verify the required parameter 'mirrorGroupId' is set
    if (mirrorGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'mirrorGroupId' when calling getAMGSyncProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{mirrorGroupId}/progress".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "mirrorGroupId" + "\\}", apiClient.escapeString(mirrorGroupId.toString()));

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

    
    GenericType<AsyncMirrorGroupSyncProgress> localVarReturnType = new GenericType<AsyncMirrorGroupSyncProgress>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the member volumes associated with an AMG
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param mirrorId  (required)
   * @return List<AmgMember>
   * @throws ApiException if fails to make API call
   */
  public List<AmgMember> getAllAMGMemberVolumes(String systemId, String mirrorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllAMGMemberVolumes");
    }
    
    // verify the required parameter 'mirrorId' is set
    if (mirrorId == null) {
      throw new ApiException(400, "Missing the required parameter 'mirrorId' when calling getAllAMGMemberVolumes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{mirror-id}/pairs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "mirror-id" + "\\}", apiClient.escapeString(mirrorId.toString()));

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

    
    GenericType<List<AmgMember>> localVarReturnType = new GenericType<List<AmgMember>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all Async Mirror Group Members
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<AmgMember>
   * @throws ApiException if fails to make API call
   */
  public List<AmgMember> getAllAMGMembers(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllAMGMembers");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/pairs".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<AmgMember>> localVarReturnType = new GenericType<List<AmgMember>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the sync progress of all Async Mirror Groups at once
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<AsyncMirrorGroupSyncProgress>
   * @throws ApiException if fails to make API call
   */
  public List<AsyncMirrorGroupSyncProgress> getAllAMGSyncProgress(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllAMGSyncProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/progress".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<AsyncMirrorGroupSyncProgress>> localVarReturnType = new GenericType<List<AsyncMirrorGroupSyncProgress>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the repository usage statistics for all AmgMembers.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<AsyncMirrorRepositoryUtilization>
   * @throws ApiException if fails to make API call
   */
  public List<AsyncMirrorRepositoryUtilization> getAllAmgMemberRepositoryStats(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllAmgMemberRepositoryStats");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/pairs/repository-utilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<AsyncMirrorRepositoryUtilization>> localVarReturnType = new GenericType<List<AsyncMirrorRepositoryUtilization>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Async Mirror Groups
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<Amg>
   * @throws ApiException if fails to make API call
   */
  public List<Amg> getAllAsyncMirrorGroups(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllAsyncMirrorGroups");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<Amg>> localVarReturnType = new GenericType<List<Amg>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Remote Volume Mirrors
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<RemoteMirrorPair>
   * @throws ApiException if fails to make API call
   */
  public List<RemoteMirrorPair> getAllRemoteVolumeMirrors(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllRemoteVolumeMirrors");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/remote-mirror-pairs".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<RemoteMirrorPair>> localVarReturnType = new GenericType<List<RemoteMirrorPair>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the repository usage statistics for a single AmgMember.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return AsyncMirrorRepositoryUtilization
   * @throws ApiException if fails to make API call
   */
  public AsyncMirrorRepositoryUtilization getAmgMemberRepositoryStats(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAmgMemberRepositoryStats");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAmgMemberRepositoryStats");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/pairs/{id}/repository-utilization".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<AsyncMirrorRepositoryUtilization> localVarReturnType = new GenericType<AsyncMirrorRepositoryUtilization>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return Amg
   * @throws ApiException if fails to make API call
   */
  public Amg getAsyncMirrorGroup(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAsyncMirrorGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAsyncMirrorGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<Amg> localVarReturnType = new GenericType<Amg>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a list of storage-systems that support Asynchronous Mirroring
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param compatibleOnly Only return storage-systems supporting async mirroring that compatible with the target storage-system. (optional, default to false)
   * @return List<RemoteCandidate>
   * @throws ApiException if fails to make API call
   */
  public List<RemoteCandidate> getAsyncMirrorStorageSystemList(String systemId, Boolean compatibleOnly) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAsyncMirrorStorageSystemList");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/arvm-arrays".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "compatibleOnly", compatibleOnly));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<RemoteCandidate>> localVarReturnType = new GenericType<List<RemoteCandidate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Async Mirror Group relationships that have not yet been completed
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<AmgIncompleteMember>
   * @throws ApiException if fails to make API call
   */
  public List<AmgIncompleteMember> getIncompleteAMG(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getIncompleteAMG");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/incomplete-pairs".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<AmgIncompleteMember>> localVarReturnType = new GenericType<List<AmgIncompleteMember>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Async Mirror Group relationships that have not yet been completed
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param mirrorId  (required)
   * @return List<AmgIncompleteMember>
   * @throws ApiException if fails to make API call
   */
  public List<AmgIncompleteMember> getIncompleteAMGMirrorID(String systemId, String mirrorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getIncompleteAMGMirrorID");
    }
    
    // verify the required parameter 'mirrorId' is set
    if (mirrorId == null) {
      throw new ApiException(400, "Missing the required parameter 'mirrorId' when calling getIncompleteAMGMirrorID");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/incomplete-pairs/{mirror-id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "mirrorId" + "\\}", apiClient.escapeString(mirrorId.toString()));

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

    
    GenericType<List<AmgIncompleteMember>> localVarReturnType = new GenericType<List<AmgIncompleteMember>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the current remote StorageDevice mirroring connections for an Amg
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param mirrorGroupId  (required)
   * @return AsyncMirrorConnectionsResponse
   * @throws ApiException if fails to make API call
   */
  public AsyncMirrorConnectionsResponse getRemoteAmgMirrorConnections(String systemId, String mirrorGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRemoteAmgMirrorConnections");
    }
    
    // verify the required parameter 'mirrorGroupId' is set
    if (mirrorGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'mirrorGroupId' when calling getRemoteAmgMirrorConnections");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{mirrorGroupId}/connections".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "mirrorGroupId" + "\\}", apiClient.escapeString(mirrorGroupId.toString()));

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

    
    GenericType<AsyncMirrorConnectionsResponse> localVarReturnType = new GenericType<AsyncMirrorConnectionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the current remote StorageDevice mirroring connections
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<AsyncMirrorConnectionsResponse>
   * @throws ApiException if fails to make API call
   */
  public List<AsyncMirrorConnectionsResponse> getRemoteMirrorConnections(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRemoteMirrorConnections");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/connections".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<AsyncMirrorConnectionsResponse>> localVarReturnType = new GenericType<List<AsyncMirrorConnectionsResponse>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Remote Volume Mirror
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return RemoteMirrorPair
   * @throws ApiException if fails to make API call
   */
  public RemoteMirrorPair getRemoteVolumeMirror(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRemoteVolumeMirror");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRemoteVolumeMirror");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/remote-mirror-pairs/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<RemoteMirrorPair> localVarReturnType = new GenericType<RemoteMirrorPair>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve potential mirror candidates for a volume
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param volumeId  (required)
   * @return List<RemoteMirrorCandidate>
   * @throws ApiException if fails to make API call
   */
  public List<RemoteMirrorCandidate> getRemoteVolumeMirrorCandidates(String systemId, String volumeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRemoteVolumeMirrorCandidates");
    }
    
    // verify the required parameter 'volumeId' is set
    if (volumeId == null) {
      throw new ApiException(400, "Missing the required parameter 'volumeId' when calling getRemoteVolumeMirrorCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/remote-mirror-pairs/remote-mirror-target-candidates/{volumeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "volumeId" + "\\}", apiClient.escapeString(volumeId.toString()));

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

    
    GenericType<List<RemoteMirrorCandidate>> localVarReturnType = new GenericType<List<RemoteMirrorCandidate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Remote Mirror synchronization status
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return JobProgress
   * @throws ApiException if fails to make API call
   */
  public JobProgress getRemoteVolumeMirrorSyncProcess(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRemoteVolumeMirrorSyncProcess");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRemoteVolumeMirrorSyncProcess");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/remote-mirror-pairs/mirror-sync-progress/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<JobProgress> localVarReturnType = new GenericType<JobProgress>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add a new member to an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param mirrorId  (required)
   * @param body  (optional)
   * @return AmgMember
   * @throws ApiException if fails to make API call
   */
  public AmgMember newAMGMember(String systemId, String mirrorId, AsyncMirrorGroupMemberCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newAMGMember");
    }
    
    // verify the required parameter 'mirrorId' is set
    if (mirrorId == null) {
      throw new ApiException(400, "Missing the required parameter 'mirrorId' when calling newAMGMember");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{mirror-id}/pairs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "mirror-id" + "\\}", apiClient.escapeString(mirrorId.toString()));

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

    
    GenericType<AmgMember> localVarReturnType = new GenericType<AmgMember>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return Amg
   * @throws ApiException if fails to make API call
   */
  public Amg newAsyncMirrorGroup(String systemId, AsyncMirrorGroupCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newAsyncMirrorGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors".replaceAll("\\{format\\}","json")
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

    
    GenericType<Amg> localVarReturnType = new GenericType<Amg>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create Remote Volume Mirror
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return RemoteMirrorPair
   * @throws ApiException if fails to make API call
   */
  public RemoteMirrorPair newRemoteVolumeMirror(String systemId, RemoteVolumeMirrorCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newRemoteVolumeMirror");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/remote-mirror-pairs".replaceAll("\\{format\\}","json")
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

    
    GenericType<RemoteMirrorPair> localVarReturnType = new GenericType<RemoteMirrorPair>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Remove a member from an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param mirrorId  (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeAMGMember(String systemId, String mirrorId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeAMGMember");
    }
    
    // verify the required parameter 'mirrorId' is set
    if (mirrorId == null) {
      throw new ApiException(400, "Missing the required parameter 'mirrorId' when calling removeAMGMember");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeAMGMember");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{mirror-id}/pairs/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "mirror-id" + "\\}", apiClient.escapeString(mirrorId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Delete an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeAsyncMirrorGroup(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeAsyncMirrorGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeAsyncMirrorGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Remove an Async Mirror relationship that has not been completed
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param incompleteMirrorId  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeIncompleteAsyncMirrorRelationship(String systemId, String incompleteMirrorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeIncompleteAsyncMirrorRelationship");
    }
    
    // verify the required parameter 'incompleteMirrorId' is set
    if (incompleteMirrorId == null) {
      throw new ApiException(400, "Missing the required parameter 'incompleteMirrorId' when calling removeIncompleteAsyncMirrorRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/incomplete-pairs/{incompleteMirrorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "incompleteMirrorId" + "\\}", apiClient.escapeString(incompleteMirrorId.toString()));

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
   * Remove a Remote Volume Mirror
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeRemoteVolumeMirror(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeRemoteVolumeMirror");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeRemoteVolumeMirror");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/remote-mirror-pairs/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Resume synchronization of an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param deleteRecoveryPointIfNecessary  (optional, default to true)
   * @throws ApiException if fails to make API call
   */
  public void resumeSynchronizationAMG(String systemId, String id, Boolean deleteRecoveryPointIfNecessary) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling resumeSynchronizationAMG");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling resumeSynchronizationAMG");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{id}/resume".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleteRecoveryPointIfNecessary", deleteRecoveryPointIfNecessary));
    

    

    

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
   * Suspend synchronization of an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void suspendSynchronizationAMG(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling suspendSynchronizationAMG");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling suspendSynchronizationAMG");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{id}/suspend".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Test connectivity of an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @return List<AsyncCommunicationData>
   * @throws ApiException if fails to make API call
   */
  public List<AsyncCommunicationData> testConnectivityAMG(String systemId, String id, AsyncMirrorGroupConnectivityTestRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling testConnectivityAMG");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling testConnectivityAMG");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{id}/test".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<List<AsyncCommunicationData>> localVarReturnType = new GenericType<List<AsyncCommunicationData>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Test Remote Mirror Communication
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return RemoteCommunicationData
   * @throws ApiException if fails to make API call
   */
  public RemoteCommunicationData testRemoteVolumeMirrorCommunication(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling testRemoteVolumeMirrorCommunication");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling testRemoteVolumeMirrorCommunication");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/remote-mirror-pairs/test-remote-mirror-communication/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<RemoteCommunicationData> localVarReturnType = new GenericType<RemoteCommunicationData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an Async Mirror Group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @return Amg
   * @throws ApiException if fails to make API call
   */
  public Amg updateAsyncMirrorGroup(String systemId, String id, AsyncMirrorGroupUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateAsyncMirrorGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAsyncMirrorGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<Amg> localVarReturnType = new GenericType<Amg>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update the mirror role of an Async Mirror Group.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateMirrorRoleAMG(String systemId, String id, AsyncMirrorGroupRoleUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateMirrorRoleAMG");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateMirrorRoleAMG");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/async-mirrors/{id}/role".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Update a Remote Volume Mirror
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @return RemoteMirrorPair
   * @throws ApiException if fails to make API call
   */
  public RemoteMirrorPair updateRemoteVolumeMirror(String systemId, String id, RemoteVolumeMirrorUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateRemoteVolumeMirror");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateRemoteVolumeMirror");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/remote-mirror-pairs/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<RemoteMirrorPair> localVarReturnType = new GenericType<RemoteMirrorPair>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
