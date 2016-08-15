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
public class MappingApi {
  private ApiClient apiClient;

  public MappingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MappingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all HostGroups
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<HostGroup>
   * @throws ApiException if fails to make API call
   */
  public List<HostGroup> getAllHostGroups(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllHostGroups");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-groups".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<HostGroup>> localVarReturnType = new GenericType<List<HostGroup>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all HostTypes
   * Mode: Both Embedded and Proxy. DEPRECATED: See /host-types
   * @param systemId The id of the storage-system (required)
   * @return List<HostType>
   * @throws ApiException if fails to make API call
   */
  public List<HostType> getAllHostPortTypes(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllHostPortTypes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-port-types".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<HostType>> localVarReturnType = new GenericType<List<HostType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the list of HostTypes
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<HostTypeValues>
   * @throws ApiException if fails to make API call
   */
  public List<HostTypeValues> getAllHostTypeValues(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllHostTypeValues");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-type-values".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<HostTypeValues>> localVarReturnType = new GenericType<List<HostTypeValues>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all HostTypes
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<HostType>
   * @throws ApiException if fails to make API call
   */
  public List<HostType> getAllHostTypes(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllHostTypes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-types".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<HostType>> localVarReturnType = new GenericType<List<HostType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all Hosts
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<HostEx>
   * @throws ApiException if fails to make API call
   */
  public List<HostEx> getAllHosts(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllHosts");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/hosts".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<HostEx>> localVarReturnType = new GenericType<List<HostEx>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a Host
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param id Get a Host (required)
   * @return HostEx
   * @throws ApiException if fails to make API call
   */
  public HostEx getHost(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getHost");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getHost");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/hosts/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<HostEx> localVarReturnType = new GenericType<HostEx>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a HostGroup
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param id Get a HostGroup (required)
   * @return HostGroup
   * @throws ApiException if fails to make API call
   */
  public HostGroup getHostGroup(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getHostGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getHostGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-groups/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<HostGroup> localVarReturnType = new GenericType<HostGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a HostType
   * Mode: Both Embedded and Proxy. DEPRECATED: See /host-types
   * @param systemId The id of the storage-system (required)
   * @param id  (required)
   * @return HostType
   * @throws ApiException if fails to make API call
   */
  public HostType getHostPortType(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getHostPortType");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getHostPortType");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-port-types/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<HostType> localVarReturnType = new GenericType<HostType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a HostType
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param id Het a HostType (required)
   * @return HostType
   * @throws ApiException if fails to make API call
   */
  public HostType getHostType(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getHostType");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getHostType");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-types/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<HostType> localVarReturnType = new GenericType<HostType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the list of HostTypes
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param index \&quot;The value of the index for the desired host type value. This value corresponds to the index attribute of the HostTypeValues model\&quot; (required)
   * @return HostTypeValues
   * @throws ApiException if fails to make API call
   */
  public HostTypeValues getHostTypeValues(String systemId, Integer index) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getHostTypeValues");
    }
    
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling getHostTypeValues");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-type-values/{index}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

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

    
    GenericType<HostTypeValues> localVarReturnType = new GenericType<HostTypeValues>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the list of unassociated HostPorts
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<UnassociatedHostPort>
   * @throws ApiException if fails to make API call
   */
  public List<UnassociatedHostPort> getUnassociatedHostPorts(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getUnassociatedHostPorts");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/unassociated-host-ports".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<UnassociatedHostPort>> localVarReturnType = new GenericType<List<UnassociatedHostPort>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Move a Host under a different HostGroup
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param hostId The id of an existing host entry configured on the specified array (required)
   * @param body  (optional)
   * @return HostEx
   * @throws ApiException if fails to make API call
   */
  public HostEx moveHost(String systemId, String hostId, HostMoveRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling moveHost");
    }
    
    // verify the required parameter 'hostId' is set
    if (hostId == null) {
      throw new ApiException(400, "Missing the required parameter 'hostId' when calling moveHost");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/hosts/{hostId}/move".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "hostId" + "\\}", apiClient.escapeString(hostId.toString()));

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

    
    GenericType<HostEx> localVarReturnType = new GenericType<HostEx>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new Host
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param body  (optional)
   * @return Host
   * @throws ApiException if fails to make API call
   */
  public Host newHost(String systemId, HostCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newHost");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/hosts".replaceAll("\\{format\\}","json")
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

    
    GenericType<Host> localVarReturnType = new GenericType<Host>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a HostGroup
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param body  (optional)
   * @return HostGroup
   * @throws ApiException if fails to make API call
   */
  public HostGroup newHostGroup(String systemId, HostGroupCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling newHostGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-groups".replaceAll("\\{format\\}","json")
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

    
    GenericType<HostGroup> localVarReturnType = new GenericType<HostGroup>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a Host
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param id Delete a Host (required)
   * @throws ApiException if fails to make API call
   */
  public void removeHost(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeHost");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeHost");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/hosts/{id}".replaceAll("\\{format\\}","json")
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
   * Delete a HostGroup
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param id Delete a HostGroup (required)
   * @throws ApiException if fails to make API call
   */
  public void removeHostGroup(String systemId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling removeHostGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeHostGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-groups/{id}".replaceAll("\\{format\\}","json")
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
   * Set default HostType
   * Mode: Both Embedded and Proxy. DEPRECATED: See /host-types
   * @param systemId The id of the storage-system (required)
   * @param body  (optional)
   * @return HostType
   * @throws ApiException if fails to make API call
   */
  public HostType setHostPortTypeDefault(String systemId, SingleNumberValue body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling setHostPortTypeDefault");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-port-types".replaceAll("\\{format\\}","json")
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

    
    GenericType<HostType> localVarReturnType = new GenericType<HostType>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Set default HostType
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param body  (optional)
   * @return HostType
   * @throws ApiException if fails to make API call
   */
  public HostType setHostTypeDefault(String systemId, SingleNumberValue body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling setHostTypeDefault");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-types".replaceAll("\\{format\\}","json")
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

    
    GenericType<HostType> localVarReturnType = new GenericType<HostType>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update the parameters of a Host
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param id Update the parameters of a Host (required)
   * @param body  (optional)
   * @return HostEx
   * @throws ApiException if fails to make API call
   */
  public HostEx updateHost(String systemId, String id, HostUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateHost");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateHost");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/hosts/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<HostEx> localVarReturnType = new GenericType<HostEx>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a HostGroup
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param id Update a HostGroup (required)
   * @param body  (optional)
   * @return HostGroup
   * @throws ApiException if fails to make API call
   */
  public HostGroup updateHostGroup(String systemId, String id, HostGroupUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateHostGroup");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateHostGroup");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/host-groups/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<HostGroup> localVarReturnType = new GenericType<HostGroup>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
