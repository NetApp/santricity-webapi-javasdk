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
public class CopyServicesApi {
  private ApiClient apiClient;

  public CopyServicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CopyServicesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Convert a ReadOnly Snapshot Volume to ReadWrite mode
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param viewId  (required)
   * @param body  (optional)
   * @return PitViewEx
   * @throws ApiException if fails to make API call
   */
  public PitViewEx convertSnapshotVolumeToReadWrite(String systemId, String viewId, SnapshotVolumeModeConversionRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling convertSnapshotVolumeToReadWrite");
    }
    
    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      throw new ApiException(400, "Missing the required parameter 'viewId' when calling convertSnapshotVolumeToReadWrite");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-volumes/{viewId}/convertReadOnly".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "viewId" + "\\}", apiClient.escapeString(viewId.toString()));

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

    
    GenericType<PitViewEx> localVarReturnType = new GenericType<PitViewEx>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Expand a Concat Repository Volume by providing an expansion candidate.
   * Mode: Both Embedded and Proxy. An expansion candidate of type \&quot;expansion\&quot; is only valid for ThinVolume repositories. ThinVolume repositories are likewise also limited to a single repository member, which prevents use of the \&quot;existingVol\&quot; and \&quot;newVol\&quot; expansion types.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @return ConcatRepositoryVolume
   * @throws ApiException if fails to make API call
   */
  public ConcatRepositoryVolume expandConcatVolume(String systemId, String id, ConcatVolumeExpansionRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling expandConcatVolume");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling expandConcatVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/repositories/concat/{id}/expand".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConcatRepositoryVolume> localVarReturnType = new GenericType<ConcatRepositoryVolume>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the list of Concat Repository Volumes.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<ConcatRepositoryVolume>
   * @throws ApiException if fails to make API call
   */
  public List<ConcatRepositoryVolume> getAllConcatRepositoryVolumes(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllConcatRepositoryVolumes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/repositories/concat".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ConcatRepositoryVolume>> localVarReturnType = new GenericType<List<ConcatRepositoryVolume>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a list of all consistency group members
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<PITCGMember>
   * @throws ApiException if fails to make API call
   */
  public List<PITCGMember> getAllConsistencyGroupMembers(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllConsistencyGroupMembers");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/member-volumes".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<PITCGMember>> localVarReturnType = new GenericType<List<PITCGMember>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get ConsistencyGroup members
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @return List<PITCGMember>
   * @throws ApiException if fails to make API call
   */
  public List<PITCGMember> getAllConsistencyGroupMembersList(String systemId, String cgId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllConsistencyGroupMembersList");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling getAllConsistencyGroupMembersList");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/member-volumes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()));

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

    
    GenericType<List<PITCGMember>> localVarReturnType = new GenericType<List<PITCGMember>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a list of all consistency group snapshot views
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<PITConsistencyGroupView>
   * @throws ApiException if fails to make API call
   */
  public List<PITConsistencyGroupView> getAllConsistencyGroupSnapshotViews(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllConsistencyGroupSnapshotViews");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/views".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<PITConsistencyGroupView>> localVarReturnType = new GenericType<List<PITConsistencyGroupView>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Snapshot views associated with the ConsistencyGroup
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @return List<PITConsistencyGroupView>
   * @throws ApiException if fails to make API call
   */
  public List<PITConsistencyGroupView> getAllConsistencyGroupSnapshotViewsList(String systemId, String cgId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllConsistencyGroupSnapshotViewsList");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling getAllConsistencyGroupSnapshotViewsList");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/views".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()));

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

    
    GenericType<List<PITConsistencyGroupView>> localVarReturnType = new GenericType<List<PITConsistencyGroupView>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Snapshots associated with the ConsistencyGroup
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @return List<Snapshot>
   * @throws ApiException if fails to make API call
   */
  public List<Snapshot> getAllConsistencyGroupSnapshots(String systemId, String cgId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllConsistencyGroupSnapshots");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling getAllConsistencyGroupSnapshots");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/snapshots".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()));

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

    
    GenericType<List<Snapshot>> localVarReturnType = new GenericType<List<Snapshot>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all consistency groups
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<PITConsistencyGroup>
   * @throws ApiException if fails to make API call
   */
  public List<PITConsistencyGroup> getAllConsistencyGroups(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllConsistencyGroups");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<PITConsistencyGroup>> localVarReturnType = new GenericType<List<PITConsistencyGroup>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get progress of all copy pairs
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<VolumeCopyProgress>
   * @throws ApiException if fails to make API call
   */
  public List<VolumeCopyProgress> getAllCopyPairProgress(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllCopyPairProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-copy-jobs-control".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<VolumeCopyProgress>> localVarReturnType = new GenericType<List<VolumeCopyProgress>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the repository usage statistics for all Legacy Snapshots.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<RepositoryUtilization>
   * @throws ApiException if fails to make API call
   */
  public List<RepositoryUtilization> getAllLegacySnapshotRepoStats(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllLegacySnapshotRepoStats");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/legacy-snapshots/repository-utilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<RepositoryUtilization>> localVarReturnType = new GenericType<List<RepositoryUtilization>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Legacy Snapshots
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<LegacySnapshotEx>
   * @throws ApiException if fails to make API call
   */
  public List<LegacySnapshotEx> getAllLegacySnapshots(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllLegacySnapshots");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/legacy-snapshots".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<LegacySnapshotEx>> localVarReturnType = new GenericType<List<LegacySnapshotEx>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the repository usage statistics for all SnapshotGroups.
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<PITGroupRepositoryUtilization>
   * @throws ApiException if fails to make API call
   */
  public List<PITGroupRepositoryUtilization> getAllSnapshotGroupRepoStats(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllSnapshotGroupRepoStats");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-groups/repository-utilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<PITGroupRepositoryUtilization>> localVarReturnType = new GenericType<List<PITGroupRepositoryUtilization>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all Snapshot Groups
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<SnapshotGroup>
   * @throws ApiException if fails to make API call
   */
  public List<SnapshotGroup> getAllSnapshotGroups(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllSnapshotGroups");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-groups".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<SnapshotGroup>> localVarReturnType = new GenericType<List<SnapshotGroup>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all Snapshot Schedules
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<ScheduleInstance>
   * @throws ApiException if fails to make API call
   */
  public List<ScheduleInstance> getAllSnapshotSchedules(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllSnapshotSchedules");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-schedules".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ScheduleInstance>> localVarReturnType = new GenericType<List<ScheduleInstance>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the repository usage statistics for all SnapshotVolumes.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<PITViewRepositoryUtilization>
   * @throws ApiException if fails to make API call
   */
  public List<PITViewRepositoryUtilization> getAllSnapshotVolumeRepoStats(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllSnapshotVolumeRepoStats");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-volumes/repository-utilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<PITViewRepositoryUtilization>> localVarReturnType = new GenericType<List<PITViewRepositoryUtilization>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all Snapshot Volumes
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<PitViewEx>
   * @throws ApiException if fails to make API call
   */
  public List<PitViewEx> getAllSnapshotVolumes_(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllSnapshotVolumes_");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-volumes".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<PitViewEx>> localVarReturnType = new GenericType<List<PitViewEx>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all Snapshots
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<Snapshot>
   * @throws ApiException if fails to make API call
   */
  public List<Snapshot> getAllSnapshots(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllSnapshots");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-images".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<Snapshot>> localVarReturnType = new GenericType<List<Snapshot>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the list of volume copy pairs
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return List<VolumeCopyPair>
   * @throws ApiException if fails to make API call
   */
  public List<VolumeCopyPair> getAllVolumeCopyPairs(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllVolumeCopyPairs");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-copy-jobs".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<VolumeCopyPair>> localVarReturnType = new GenericType<List<VolumeCopyPair>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a specific Concat Repository Volume.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return ConcatRepositoryVolume
   * @throws ApiException if fails to make API call
   */
  public ConcatRepositoryVolume getConcatRepositoryVolumes(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getConcatRepositoryVolumes");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getConcatRepositoryVolumes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/repositories/concat/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConcatRepositoryVolume> localVarReturnType = new GenericType<ConcatRepositoryVolume>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Request a list of ConcatVolumeCandidates for a single base volume.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return List<CVCandidateResponse>
   * @throws ApiException if fails to make API call
   */
  public List<CVCandidateResponse> getConcatVolumeCandidates(String systemId, CVCandidateSelectionRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getConcatVolumeCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/repositories/concat/single".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<CVCandidateResponse>> localVarReturnType = new GenericType<List<CVCandidateResponse>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get consistency group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return PITConsistencyGroup
   * @throws ApiException if fails to make API call
   */
  public PITConsistencyGroup getConsistencyGroup(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getConsistencyGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getConsistencyGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PITConsistencyGroup> localVarReturnType = new GenericType<PITConsistencyGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get ConsistencyGroup member
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param volumeRef  (required)
   * @return PITCGMember
   * @throws ApiException if fails to make API call
   */
  public PITCGMember getConsistencyGroupMembers(String systemId, String cgId, String volumeRef) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getConsistencyGroupMembers");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling getConsistencyGroupMembers");
    }
    
    // verify the required parameter 'volumeRef' is set
    if (volumeRef == null) {
      throw new ApiException(400, "Missing the required parameter 'volumeRef' when calling getConsistencyGroupMembers");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/member-volumes/{volumeRef}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()))
      .replaceAll("\\{" + "volumeRef" + "\\}", apiClient.escapeString(volumeRef.toString()));

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

    
    GenericType<PITCGMember> localVarReturnType = new GenericType<PITCGMember>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a Snapshot view associated with the ConsistencyGroup
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param viewId  (required)
   * @return PITConsistencyGroupView
   * @throws ApiException if fails to make API call
   */
  public PITConsistencyGroupView getConsistencyGroupSnapshotView(String systemId, String cgId, String viewId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getConsistencyGroupSnapshotView");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling getConsistencyGroupSnapshotView");
    }
    
    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      throw new ApiException(400, "Missing the required parameter 'viewId' when calling getConsistencyGroupSnapshotView");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/views/{viewId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()))
      .replaceAll("\\{" + "viewId" + "\\}", apiClient.escapeString(viewId.toString()));

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

    
    GenericType<PITConsistencyGroupView> localVarReturnType = new GenericType<PITConsistencyGroupView>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the underlying SnapshotVolumes associated with the PITConsistencyGroupView
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param viewId  (required)
   * @return List<PitViewEx>
   * @throws ApiException if fails to make API call
   */
  public List<PitViewEx> getConsistencyGroupSnapshotVolumes(String systemId, String cgId, String viewId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getConsistencyGroupSnapshotVolumes");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling getConsistencyGroupSnapshotVolumes");
    }
    
    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      throw new ApiException(400, "Missing the required parameter 'viewId' when calling getConsistencyGroupSnapshotVolumes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/views/{viewId}/views".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()))
      .replaceAll("\\{" + "viewId" + "\\}", apiClient.escapeString(viewId.toString()));

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

    
    GenericType<List<PitViewEx>> localVarReturnType = new GenericType<List<PitViewEx>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a set of Snapshots by sequenceNumber
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param sequenceNumber  (required)
   * @return List<Snapshot>
   * @throws ApiException if fails to make API call
   */
  public List<Snapshot> getConsistencyGroupSnapshots(String systemId, String cgId, Long sequenceNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getConsistencyGroupSnapshots");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling getConsistencyGroupSnapshots");
    }
    
    // verify the required parameter 'sequenceNumber' is set
    if (sequenceNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'sequenceNumber' when calling getConsistencyGroupSnapshots");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/snapshots/{sequenceNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()))
      .replaceAll("\\{" + "sequenceNumber" + "\\}", apiClient.escapeString(sequenceNumber.toString()));

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

    
    GenericType<List<Snapshot>> localVarReturnType = new GenericType<List<Snapshot>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get progress of a copy pair
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return VolumeCopyProgress
   * @throws ApiException if fails to make API call
   */
  public VolumeCopyProgress getCopyPairProgress(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getCopyPairProgress");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCopyPairProgress");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-copy-jobs-control/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<VolumeCopyProgress> localVarReturnType = new GenericType<VolumeCopyProgress>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Legacy Snapshot
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return LegacySnapshotEx
   * @throws ApiException if fails to make API call
   */
  public LegacySnapshotEx getLegacySnapshot(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getLegacySnapshot");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getLegacySnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/legacy-snapshots/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<LegacySnapshotEx> localVarReturnType = new GenericType<LegacySnapshotEx>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the repository usage statistics for a single Legacy Snapshot.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return RepositoryUtilization
   * @throws ApiException if fails to make API call
   */
  public RepositoryUtilization getLegacySnapshotRepoStats(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getLegacySnapshotRepoStats");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getLegacySnapshotRepoStats");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/legacy-snapshots/{id}/repository-utilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<RepositoryUtilization> localVarReturnType = new GenericType<RepositoryUtilization>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Request the best ConcatVolumeCandidate for multiple base volumes.
   * Mode: Both Embedded and Proxy. If no candidate can be found for a particular base volume, a response with null Candidate will be returned in the list.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return List<CVCandidateResponse>
   * @throws ApiException if fails to make API call
   */
  public List<CVCandidateResponse> getMultipleConcatVolumeCandidates(String systemId, CVCandidateMultipleSelectionRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getMultipleConcatVolumeCandidates");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/repositories/concat/multiple".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<CVCandidateResponse>> localVarReturnType = new GenericType<List<CVCandidateResponse>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a Snapshot Volume
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return Snapshot
   * @throws ApiException if fails to make API call
   */
  public Snapshot getSnapshot(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getSnapshot");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-images/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<Snapshot> localVarReturnType = new GenericType<Snapshot>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a Snapshot Group
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return SnapshotGroup
   * @throws ApiException if fails to make API call
   */
  public SnapshotGroup getSnapshotGroup(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getSnapshotGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSnapshotGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-groups/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<SnapshotGroup> localVarReturnType = new GenericType<SnapshotGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the repository usage statistics for a single SnapshotGroup.
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return PITGroupRepositoryUtilization
   * @throws ApiException if fails to make API call
   */
  public PITGroupRepositoryUtilization getSnapshotGroupRepoStats(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getSnapshotGroupRepoStats");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSnapshotGroupRepoStats");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-groups/{id}/repository-utilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<PITGroupRepositoryUtilization> localVarReturnType = new GenericType<PITGroupRepositoryUtilization>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a Snapshot Schedule
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return ScheduleInstance
   * @throws ApiException if fails to make API call
   */
  public ScheduleInstance getSnapshotSchedule(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getSnapshotSchedule");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSnapshotSchedule");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-schedules/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ScheduleInstance> localVarReturnType = new GenericType<ScheduleInstance>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a Snapshot Volume
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return PitViewEx
   * @throws ApiException if fails to make API call
   */
  public PitViewEx getSnapshotVolume(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getSnapshotVolume");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSnapshotVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-volumes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PitViewEx> localVarReturnType = new GenericType<PitViewEx>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the repository usage statistics for a single SnapshotVolume.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @return PITViewRepositoryUtilization
   * @throws ApiException if fails to make API call
   */
  public PITViewRepositoryUtilization getSnapshotVolumeRepoStats(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getSnapshotVolumeRepoStats");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSnapshotVolumeRepoStats");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-volumes/{id}/repository-utilization".replaceAll("\\{format\\}","json")
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

    
    GenericType<PITViewRepositoryUtilization> localVarReturnType = new GenericType<PITViewRepositoryUtilization>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a volume copy pair
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param vcId  (required)
   * @return VolumeCopyPair
   * @throws ApiException if fails to make API call
   */
  public VolumeCopyPair getVolumeCopyPair(String systemId, String vcId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getVolumeCopyPair");
    }
    
    // verify the required parameter 'vcId' is set
    if (vcId == null) {
      throw new ApiException(400, "Missing the required parameter 'vcId' when calling getVolumeCopyPair");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-copy-jobs/{vcId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "vcId" + "\\}", apiClient.escapeString(vcId.toString()));

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

    
    GenericType<VolumeCopyPair> localVarReturnType = new GenericType<VolumeCopyPair>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create consistency group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return PITConsistencyGroup
   * @throws ApiException if fails to make API call
   */
  public PITConsistencyGroup newConsistencyGroup(String systemId, ConsistencyGroupCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newConsistencyGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups".replaceAll("\\{format\\}","json")
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

    
    GenericType<PITConsistencyGroup> localVarReturnType = new GenericType<PITConsistencyGroup>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add ConsistencyGroup member
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param body  (optional)
   * @return PITCGMember
   * @throws ApiException if fails to make API call
   */
  public PITCGMember newConsistencyGroupMember(String systemId, String cgId, AddConsistencyGroupMemberRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newConsistencyGroupMember");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling newConsistencyGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/member-volumes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()));

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

    
    GenericType<PITCGMember> localVarReturnType = new GenericType<PITCGMember>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create ConsistencyGroup snapshot
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param body  (optional)
   * @return List<Snapshot>
   * @throws ApiException if fails to make API call
   */
  public List<Snapshot> newConsistencyGroupSnapshot(String systemId, String cgId, CreateConsistencyGroupSnapshotRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newConsistencyGroupSnapshot");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling newConsistencyGroupSnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/snapshots".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()));

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

    
    GenericType<List<Snapshot>> localVarReturnType = new GenericType<List<Snapshot>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create Snapshot Views from a ConsistencyGroup Snapshot
   * Mode: Both Embedded and Proxy. A pitId or a pitSequenceNumber can be provided to this endpoint in order to create a snapshotView. If a pitId is provided, only a single view will be created. If a pitSequenceNumber is provided, a snapshotView will be created for each Snapshot associated with the sequenceNumber.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param body  (optional)
   * @return PITConsistencyGroupView
   * @throws ApiException if fails to make API call
   */
  public PITConsistencyGroupView newConsistencyGroupSnapshotView(String systemId, String cgId, CreateConsistencyGroupSnapshotViewRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newConsistencyGroupSnapshotView");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling newConsistencyGroupSnapshotView");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/views".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()));

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

    
    GenericType<PITConsistencyGroupView> localVarReturnType = new GenericType<PITConsistencyGroupView>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create Snapshot Views from a ConsistencyGroup Snapshot
   * Mode: Both Embedded and Proxy. This endpoint provides more granularity and customization in creating a view than the non-batch endpoint. For each snapshot that you wish for a view to be created of, a CGSnapshotViewRequest must be provided that defines the parameters (including a repository candidate, if necessary [See repositories/concat]). Each Snapshot provided MUST be under the same pitSequenceNumber.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param body  (optional)
   * @return PITConsistencyGroupView
   * @throws ApiException if fails to make API call
   */
  public PITConsistencyGroupView newConsistencyGroupSnapshotViewDetailed(String systemId, String cgId, CreateCGSnapshotViewManualRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newConsistencyGroupSnapshotViewDetailed");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling newConsistencyGroupSnapshotViewDetailed");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/views/batch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()));

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

    
    GenericType<PITConsistencyGroupView> localVarReturnType = new GenericType<PITConsistencyGroupView>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create Legacy Snapshot
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return LegacySnapshotEx
   * @throws ApiException if fails to make API call
   */
  public LegacySnapshotEx newLegacySnapshot(String systemId, LegacySnapshotCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newLegacySnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/legacy-snapshots".replaceAll("\\{format\\}","json")
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

    
    GenericType<LegacySnapshotEx> localVarReturnType = new GenericType<LegacySnapshotEx>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add multiple ConsistencyGroup members at once
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param body  (optional)
   * @return List<PITCGMember>
   * @throws ApiException if fails to make API call
   */
  public List<PITCGMember> newMultipleConsistencyGroupMembers(String systemId, String cgId, AddBatchCGMembersRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newMultipleConsistencyGroupMembers");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling newMultipleConsistencyGroupMembers");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/member-volumes/batch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()));

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

    
    GenericType<List<PITCGMember>> localVarReturnType = new GenericType<List<PITCGMember>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a Snapshot
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return Snapshot
   * @throws ApiException if fails to make API call
   */
  public Snapshot newSnapshot(String systemId, SnapshotCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newSnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-images".replaceAll("\\{format\\}","json")
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

    
    GenericType<Snapshot> localVarReturnType = new GenericType<Snapshot>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a Snapshot Group
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return SnapshotGroup
   * @throws ApiException if fails to make API call
   */
  public SnapshotGroup newSnapshotGroup(String systemId, SnapshotGroupCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newSnapshotGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-groups".replaceAll("\\{format\\}","json")
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

    
    GenericType<SnapshotGroup> localVarReturnType = new GenericType<SnapshotGroup>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a Snapshot Volume
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return PitViewEx
   * @throws ApiException if fails to make API call
   */
  public PitViewEx newSnapshotVolume(String systemId, SnapshotViewCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newSnapshotVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-volumes".replaceAll("\\{format\\}","json")
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

    
    GenericType<PitViewEx> localVarReturnType = new GenericType<PitViewEx>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new volume copy pair
   * Mode: Both Embedded and Proxy. Establish a new volume copy pair by providing a source and a target volume. The target volume must be of greater or equal size to the source.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return VolumeCopyPair
   * @throws ApiException if fails to make API call
   */
  public VolumeCopyPair newVolumeCopyPair(String systemId, VolumeCopyCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newVolumeCopyPair");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-copy-jobs".replaceAll("\\{format\\}","json")
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

    
    GenericType<VolumeCopyPair> localVarReturnType = new GenericType<VolumeCopyPair>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete consistency group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeConsistencyGroup(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeConsistencyGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeConsistencyGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{id}".replaceAll("\\{format\\}","json")
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
   * Remove ConsistencyGroup member
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param volumeRef  (required)
   * @param retainRepositories  (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void removeConsistencyGroupMember(String systemId, String cgId, String volumeRef, Boolean retainRepositories) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeConsistencyGroupMember");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling removeConsistencyGroupMember");
    }
    
    // verify the required parameter 'volumeRef' is set
    if (volumeRef == null) {
      throw new ApiException(400, "Missing the required parameter 'volumeRef' when calling removeConsistencyGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/member-volumes/{volumeRef}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()))
      .replaceAll("\\{" + "volumeRef" + "\\}", apiClient.escapeString(volumeRef.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "retainRepositories", retainRepositories));
    

    

    

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
   * Remove ConsistencyGroup snapshot
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param sequenceNumber  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeConsistencyGroupSnapshot(String systemId, String cgId, Long sequenceNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeConsistencyGroupSnapshot");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling removeConsistencyGroupSnapshot");
    }
    
    // verify the required parameter 'sequenceNumber' is set
    if (sequenceNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'sequenceNumber' when calling removeConsistencyGroupSnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/snapshots/{sequenceNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()))
      .replaceAll("\\{" + "sequenceNumber" + "\\}", apiClient.escapeString(sequenceNumber.toString()));

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
   * Delete an existing Snapshot View
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param viewId  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeConsistencyGroupSnapshotView(String systemId, String cgId, String viewId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeConsistencyGroupSnapshotView");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling removeConsistencyGroupSnapshotView");
    }
    
    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      throw new ApiException(400, "Missing the required parameter 'viewId' when calling removeConsistencyGroupSnapshotView");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/views/{viewId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()))
      .replaceAll("\\{" + "viewId" + "\\}", apiClient.escapeString(viewId.toString()));

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
   * Delete a Legacy Snapshot
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeLegacySnapshot(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeLegacySnapshot");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeLegacySnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/legacy-snapshots/{id}".replaceAll("\\{format\\}","json")
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
   * Delete a Snapshot Volume
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeSnapshot(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeSnapshot");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeSnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-images/{id}".replaceAll("\\{format\\}","json")
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
   * Delete a Snapshot Group
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeSnapshotGroup(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeSnapshotGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeSnapshotGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-groups/{id}".replaceAll("\\{format\\}","json")
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
   * Delete a Snapshot Volume
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeSnapshotVolume(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeSnapshotVolume");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeSnapshotVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-volumes/{id}".replaceAll("\\{format\\}","json")
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
   * Remove a volume copy pair
   * Mode: Both Embedded and Proxy. Online volume copies, or copies based on snapshots, require multiple operations to delete all repository volumes (if enabled). If there is a service interruption, it is possible that all repository volumes will not be deleted.These repository volumes can be retrieved using the volumes resource, and will be marked with a volumeUse of &#39;freeRepositoryVolume&#39;. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param vcId  (required)
   * @param retainRepositories  (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void removeVolumeCopyPair(String systemId, String vcId, Boolean retainRepositories) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeVolumeCopyPair");
    }
    
    // verify the required parameter 'vcId' is set
    if (vcId == null) {
      throw new ApiException(400, "Missing the required parameter 'vcId' when calling removeVolumeCopyPair");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-copy-jobs/{vcId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "vcId" + "\\}", apiClient.escapeString(vcId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "retainRepositories", retainRepositories));
    

    

    

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
   * Rollback a ConsistencyGroup snapshot
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cgId  (required)
   * @param sequenceNumber  (required)
   * @throws ApiException if fails to make API call
   */
  public void rollbackConsistencyGroupSnapshot(String systemId, String cgId, Long sequenceNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling rollbackConsistencyGroupSnapshot");
    }
    
    // verify the required parameter 'cgId' is set
    if (cgId == null) {
      throw new ApiException(400, "Missing the required parameter 'cgId' when calling rollbackConsistencyGroupSnapshot");
    }
    
    // verify the required parameter 'sequenceNumber' is set
    if (sequenceNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'sequenceNumber' when calling rollbackConsistencyGroupSnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{cg-id}/snapshots/{sequenceNumber}/rollback".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "cg-id" + "\\}", apiClient.escapeString(cgId.toString()))
      .replaceAll("\\{" + "sequenceNumber" + "\\}", apiClient.escapeString(sequenceNumber.toString()));

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
   * Update consistency group
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @return PITConsistencyGroup
   * @throws ApiException if fails to make API call
   */
  public PITConsistencyGroup updateConsistencyGroup(String systemId, String id, ConsistencyGroupUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateConsistencyGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateConsistencyGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/consistency-groups/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PITConsistencyGroup> localVarReturnType = new GenericType<PITConsistencyGroup>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Start/Stop a copy pair operation
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param ids A comma separated list of id&#39;s (required)
   * @param control control (required)
   * @return List<VolumeCopyProgress>
   * @throws ApiException if fails to make API call
   */
  public List<VolumeCopyProgress> updateCopyPairOperation(String systemId, String ids, String control) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateCopyPairOperation");
    }
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling updateCopyPairOperation");
    }
    
    // verify the required parameter 'control' is set
    if (control == null) {
      throw new ApiException(400, "Missing the required parameter 'control' when calling updateCopyPairOperation");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-copy-jobs-control/{ids}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "ids" + "\\}", apiClient.escapeString(ids.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "control", control));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<VolumeCopyProgress>> localVarReturnType = new GenericType<List<VolumeCopyProgress>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a Legacy Snapshot
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @return LegacySnapshotEx
   * @throws ApiException if fails to make API call
   */
  public LegacySnapshotEx updateLegacySnapshot(String systemId, String id, LegacySnapshotUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateLegacySnapshot");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateLegacySnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/legacy-snapshots/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<LegacySnapshotEx> localVarReturnType = new GenericType<LegacySnapshotEx>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a Snapshot Group
   * 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @return SnapshotGroup
   * @throws ApiException if fails to make API call
   */
  public SnapshotGroup updateSnapshotGroup(String systemId, String id, SnapshotGroupUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateSnapshotGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateSnapshotGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-groups/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<SnapshotGroup> localVarReturnType = new GenericType<SnapshotGroup>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a Snapshot Volume
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param id  (required)
   * @param body  (optional)
   * @return PitViewEx
   * @throws ApiException if fails to make API call
   */
  public PitViewEx updateSnapshotVolume(String systemId, String id, SnapshotViewUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateSnapshotVolume");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateSnapshotVolume");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/snapshot-volumes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PitViewEx> localVarReturnType = new GenericType<PitViewEx>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update parameters of a volume copy pair
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param vcId  (required)
   * @param body  (optional)
   * @return VolumeCopyPair
   * @throws ApiException if fails to make API call
   */
  public VolumeCopyPair updateVolumeCopyPairParameters(String systemId, String vcId, VolumeCopyUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateVolumeCopyPairParameters");
    }
    
    // verify the required parameter 'vcId' is set
    if (vcId == null) {
      throw new ApiException(400, "Missing the required parameter 'vcId' when calling updateVolumeCopyPairParameters");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-copy-jobs/{vcId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "vcId" + "\\}", apiClient.escapeString(vcId.toString()));

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

    
    GenericType<VolumeCopyPair> localVarReturnType = new GenericType<VolumeCopyPair>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
