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
public class StatisticsApi {
  private ApiClient apiClient;

  public StatisticsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StatisticsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all analysed controller statistics
   * Mode: Embedded only. 
   * @param systemId The id of the storage-system (required)
   * @return List<AnalysedControllerStatistics>
   * @throws ApiException if fails to make API call
   */
  public List<AnalysedControllerStatistics> getAllAnalysedControllerStatistics(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllAnalysedControllerStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/analysed-controller-statistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<AnalysedControllerStatistics>> localVarReturnType = new GenericType<List<AnalysedControllerStatistics>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all analysed disk statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<AnalysedDiskStatistics>
   * @throws ApiException if fails to make API call
   */
  public List<AnalysedDiskStatistics> getAllAnalysedDriveStatistics(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllAnalysedDriveStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/analysed-drive-statistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<AnalysedDiskStatistics>> localVarReturnType = new GenericType<List<AnalysedDiskStatistics>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all analysed controller statistics
   * Mode: Embedded only. 
   * @param systemId The id of the storage-system (required)
   * @return List<AnalyzedInterfaceStatistics>
   * @throws ApiException if fails to make API call
   */
  public List<AnalyzedInterfaceStatistics> getAllAnalysedInterfaceStatistics(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllAnalysedInterfaceStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/analysed-interface-statistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<AnalyzedInterfaceStatistics>> localVarReturnType = new GenericType<List<AnalyzedInterfaceStatistics>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all analysed volume statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param idlist A comma separated list of volume ids (required)
   * @return List<AnalysedVolumeStatistics>
   * @throws ApiException if fails to make API call
   */
  public List<AnalysedVolumeStatistics> getAllAnalysedVolumeStatistics(String systemId, String idlist) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllAnalysedVolumeStatistics");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getAllAnalysedVolumeStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/analysed-volume-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

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

    
    GenericType<List<AnalysedVolumeStatistics>> localVarReturnType = new GenericType<List<AnalysedVolumeStatistics>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get historical performance raw statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param type Statistics type (optional)
   * @param start start time in milliseconds since the epoch (optional)
   * @param end end time in milliseconds since the epoch (optional)
   * @param length Length of time in ms. (optional)
   * @return RawStatsResponse
   * @throws ApiException if fails to make API call
   */
  public RawStatsResponse getAllHistoricalRawPerformanceStatistics(String systemId, String type, Long start, Long end, Long length) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllHistoricalRawPerformanceStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/historical-statistics/raw".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "length", length));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<RawStatsResponse> localVarReturnType = new GenericType<RawStatsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get Live performance statistics
   * Mode: Embedded only. 
   * @param systemId The id of the storage-system (required)
   * @param type Statistics type (optional)
   * @return RawStatsResponse
   * @throws ApiException if fails to make API call
   */
  public RawStatsResponse getAllLivePerformanceStatistics(String systemId, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllLivePerformanceStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/live-statistics".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<RawStatsResponse> localVarReturnType = new GenericType<RawStatsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get raw disk statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param usecache  (optional, default to true)
   * @return List<DiskIOStats>
   * @throws ApiException if fails to make API call
   */
  public List<DiskIOStats> getAllRawDiskStatistics(String systemId, Boolean usecache) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllRawDiskStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/drive-statistics".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usecache", usecache));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<DiskIOStats>> localVarReturnType = new GenericType<List<DiskIOStats>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get raw volume statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param usecache  (optional, default to true)
   * @return List<VolumeIOStats>
   * @throws ApiException if fails to make API call
   */
  public List<VolumeIOStats> getAllRawVolumeStatistics(String systemId, Boolean usecache) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllRawVolumeStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-statistics".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usecache", usecache));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<VolumeIOStats>> localVarReturnType = new GenericType<List<VolumeIOStats>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a subset of analysed controller statistics
   * Mode: Embedded only. 
   * @param systemId The id of the storage-system (required)
   * @param idlist A comma separated list of controller id&#39;s (required)
   * @return List<AnalysedControllerStatistics>
   * @throws ApiException if fails to make API call
   */
  public List<AnalysedControllerStatistics> getAnalysedControllerStatistics(String systemId, List<String> idlist) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAnalysedControllerStatistics");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getAnalysedControllerStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/analysed-controller-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

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

    
    GenericType<List<AnalysedControllerStatistics>> localVarReturnType = new GenericType<List<AnalysedControllerStatistics>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a subset of analysed disk statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param idlist A comma separated list of disk ids (required)
   * @return List<AnalysedDiskStatistics>
   * @throws ApiException if fails to make API call
   */
  public List<AnalysedDiskStatistics> getAnalysedDriveStatistics(String systemId, List<String> idlist) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAnalysedDriveStatistics");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getAnalysedDriveStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/analysed-drive-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

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

    
    GenericType<List<AnalysedDiskStatistics>> localVarReturnType = new GenericType<List<AnalysedDiskStatistics>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a subset of the analysed volume statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<AnalysedVolumeStatistics>
   * @throws ApiException if fails to make API call
   */
  public List<AnalysedVolumeStatistics> getAnalysedVolumeStatistics(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAnalysedVolumeStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/analysed-volume-statistics".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<AnalysedVolumeStatistics>> localVarReturnType = new GenericType<List<AnalysedVolumeStatistics>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a subset of analysed controller statistics
   * Mode: Embedded only. 
   * @param systemId The id of the storage-system (required)
   * @param idlist A comma separated list of interface id&#39;s (required)
   * @return List<AnalyzedInterfaceStatistics>
   * @throws ApiException if fails to make API call
   */
  public List<AnalyzedInterfaceStatistics> getAnalyzedInterfaceStats(String systemId, List<String> idlist) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAnalyzedInterfaceStats");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getAnalyzedInterfaceStats");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/analysed-interface-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

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

    
    GenericType<List<AnalyzedInterfaceStatistics>> localVarReturnType = new GenericType<List<AnalyzedInterfaceStatistics>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the list supported average analyzed statistics types
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getAverageAnalyzedStatisticsTypes(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAverageAnalyzedStatisticsTypes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/historical-statistics/supported-types/average".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get historical performance statistics averaged over a time range.
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param type Statistics type (optional)
   * @param length Length of time in ms. (optional)
   * @return AverageAnalysedStatsResponse
   * @throws ApiException if fails to make API call
   */
  public AverageAnalysedStatsResponse getAveragedHistoricalPerformanceStatistics(String systemId, String type, Long length) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAveragedHistoricalPerformanceStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/historical-statistics/average".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "length", length));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<AverageAnalysedStatsResponse> localVarReturnType = new GenericType<AverageAnalysedStatsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get historical performance statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param type Statistics type (optional)
   * @param start start time in milliseconds since the epoch (optional)
   * @param end end time in milliseconds since the epoch (optional)
   * @return HistoricalStatsResponse
   * @throws ApiException if fails to make API call
   */
  public HistoricalStatsResponse getHistoricalPerformanceStatistics(String systemId, String type, Long start, Long end) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getHistoricalPerformanceStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/historical-statistics".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<HistoricalStatsResponse> localVarReturnType = new GenericType<HistoricalStatsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get selected historical performance raw statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param idlist A comma separated list of object ids (required)
   * @param type Statistics type (optional)
   * @param start start time in milliseconds since the epoch (optional)
   * @param end end time in milliseconds since the epoch (optional)
   * @param length Length of time in ms. (optional)
   * @return RawStatsResponse
   * @throws ApiException if fails to make API call
   */
  public RawStatsResponse getHistoricalRawPerformanceStatistics(String systemId, List<String> idlist, String type, Long start, Long end, Long length) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getHistoricalRawPerformanceStatistics");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getHistoricalRawPerformanceStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/historical-statistics/raw/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "length", length));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<RawStatsResponse> localVarReturnType = new GenericType<RawStatsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get selected Live performance statistics
   * Mode: Embedded only. 
   * @param systemId The id of the storage-system (required)
   * @param idlist A comma separated list of object ids (required)
   * @param type Statistics type (optional)
   * @return RawStatsResponse
   * @throws ApiException if fails to make API call
   */
  public RawStatsResponse getLivePerformanceStatistics(String systemId, List<String> idlist, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getLivePerformanceStatistics");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getLivePerformanceStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/live-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<RawStatsResponse> localVarReturnType = new GenericType<RawStatsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get raw controller statistics
   * Mode: Embedded only. 
   * @param systemId  (required)
   * @param usecache  (optional, default to true)
   * @return List<ControllerStats>
   * @throws ApiException if fails to make API call
   */
  public List<ControllerStats> getRawControllerStatistics(String systemId, Boolean usecache) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRawControllerStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/controller-statistics".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usecache", usecache));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<ControllerStats>> localVarReturnType = new GenericType<List<ControllerStats>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get raw controller statistics
   * Mode: Embedded only. 
   * @param systemId  (required)
   * @param idlist A comma separated list of controller id&#39;s (required)
   * @param usecache  (optional, default to true)
   * @return List<ControllerStats>
   * @throws ApiException if fails to make API call
   */
  public List<ControllerStats> getRawControllerStatisticsUsingList(String systemId, List<String> idlist, Boolean usecache) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRawControllerStatisticsUsingList");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getRawControllerStatisticsUsingList");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/controller-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usecache", usecache));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<ControllerStats>> localVarReturnType = new GenericType<List<ControllerStats>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a subset of the raw disk statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param idlist A comma separated list of disk ids (required)
   * @param usecache  (optional, default to true)
   * @return List<DiskIOStats>
   * @throws ApiException if fails to make API call
   */
  public List<DiskIOStats> getRawDiskStatistics(String systemId, List<String> idlist, Boolean usecache) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRawDiskStatistics");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getRawDiskStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/drive-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usecache", usecache));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<DiskIOStats>> localVarReturnType = new GenericType<List<DiskIOStats>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get raw interface statistics
   * Mode: Embedded only. 
   * @param systemId  (required)
   * @param usecache  (optional, default to true)
   * @return List<InterfaceStats>
   * @throws ApiException if fails to make API call
   */
  public List<InterfaceStats> getRawInterfaceStatistics(String systemId, Boolean usecache) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRawInterfaceStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/interface-statistics".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usecache", usecache));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<InterfaceStats>> localVarReturnType = new GenericType<List<InterfaceStats>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get raw controller statistics
   * Mode: Embedded only. 
   * @param systemId  (required)
   * @param idlist A comma separated list of controller id&#39;s (required)
   * @param usecache  (optional, default to true)
   * @return List<InterfaceStats>
   * @throws ApiException if fails to make API call
   */
  public List<InterfaceStats> getRawInterfaceStatisticsWithList(String systemId, List<String> idlist, Boolean usecache) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRawInterfaceStatisticsWithList");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getRawInterfaceStatisticsWithList");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/interface-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usecache", usecache));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<InterfaceStats>> localVarReturnType = new GenericType<List<InterfaceStats>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the list supported raw statistics types
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getRawStatisticsTypes(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRawStatisticsTypes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/historical-statistics/supported-types/raw".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get raw volume statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param idlist A comma separated list of volume ids (required)
   * @param usecache  (optional, default to true)
   * @return List<VolumeIOStats>
   * @throws ApiException if fails to make API call
   */
  public List<VolumeIOStats> getRawVolumeStatistics(String systemId, List<String> idlist, Boolean usecache) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getRawVolumeStatistics");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getRawVolumeStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/volume-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usecache", usecache));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<VolumeIOStats>> localVarReturnType = new GenericType<List<VolumeIOStats>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get selected historical performance statistics
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @param idlist A comma separated list of object ids (required)
   * @param type Statistics type (optional)
   * @param start start time in milliseconds since the epoch (optional)
   * @param end end time in milliseconds since the epoch (optional)
   * @return HistoricalStatsResponse
   * @throws ApiException if fails to make API call
   */
  public HistoricalStatsResponse getSelectedHistoricalPerformanceStatistics(String systemId, List<String> idlist, String type, Long start, Long end) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getSelectedHistoricalPerformanceStatistics");
    }
    
    // verify the required parameter 'idlist' is set
    if (idlist == null) {
      throw new ApiException(400, "Missing the required parameter 'idlist' when calling getSelectedHistoricalPerformanceStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/historical-statistics/{idlist}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()))
      .replaceAll("\\{" + "idlist" + "\\}", apiClient.escapeString(idlist.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<HistoricalStatsResponse> localVarReturnType = new GenericType<HistoricalStatsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the list supported statistics types
   * Mode: Both Embedded and Proxy. 
   * @param systemId The id of the storage-system (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getSupportedStatisticsTypes(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getSupportedStatisticsTypes");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/historical-statistics/supported-types".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
