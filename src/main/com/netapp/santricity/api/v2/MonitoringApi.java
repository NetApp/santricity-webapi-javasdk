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
public class MonitoringApi {
  private ApiClient apiClient;

  public MonitoringApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MonitoringApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Clear MelEvents
   * Mode: Both Embedded and Proxy. Gives the user the ability to clear the event cache and the EventLog directly on the StorageDevice.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param clearCache  (optional, default to false)
   * @param resetMel Reset the EventLog on the StorageDevice (optional, default to true)
   * @throws ApiException if fails to make API call
   */
  public void clearMelEvents(String systemId, Boolean clearCache, Boolean resetMel) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling clearMelEvents");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/mel-events".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clearCache", clearCache));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resetMel", resetMel));
    

    

    

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
   * Delete specified subset or all audit log messages.
   * Mode: Embedded only.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param retentionCount Number of records to preserve within the log (optional)
   * @param endDate Ending record date to delete (optional)
   * @param clearAll Clear all records (optional)
   * @return AuditLogDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public AuditLogDeleteResponse deleteAuditLogMessages(String systemId, Integer retentionCount, Long endDate, Boolean clearAll) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling deleteAuditLogMessages");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/audit-log".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "retentionCount", retentionCount));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clearAll", clearAll));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<AuditLogDeleteResponse> localVarReturnType = new GenericType<AuditLogDeleteResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all global status events
   * Mode: Both Embedded and Proxy. 
   * @param lastKnown The sequence number of the last event you have received (optional, default to -1)
   * @param wait seconds to wait for a new event (optional, default to 30)
   * @return List<Event>
   * @throws ApiException if fails to make API call
   */
  public List<Event> getAllGlobalStatusEvents(Long lastKnown, Integer wait) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/events".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastKnown", lastKnown));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wait", wait));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<Event>> localVarReturnType = new GenericType<List<Event>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the list of status Events for the StorageDevice
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param lastKnown  (optional, default to -1)
   * @param wait Amount of time to wait for a new event (optional, default to 30)
   * @return List<Event>
   * @throws ApiException if fails to make API call
   */
  public List<Event> getAllStorageDeviceStatusEvents(String systemId, Long lastKnown, Integer wait) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAllStorageDeviceStatusEvents");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/events".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastKnown", lastKnown));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wait", wait));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<Event>> localVarReturnType = new GenericType<List<Event>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the current audit log configuration.
   * Mode: Both Embedded only.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return AuditLogConfiguration
   * @throws ApiException if fails to make API call
   */
  public AuditLogConfiguration getAuditLogConfig(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAuditLogConfig");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/audit-log/config".replaceAll("\\{format\\}","json")
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

    
    GenericType<AuditLogConfiguration> localVarReturnType = new GenericType<AuditLogConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get audit log metadata.
   * Mode: Both Embedded only.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @return AuditLogInfoResponse
   * @throws ApiException if fails to make API call
   */
  public AuditLogInfoResponse getAuditLogInfo(String systemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAuditLogInfo");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/audit-log/info".replaceAll("\\{format\\}","json")
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

    
    GenericType<AuditLogInfoResponse> localVarReturnType = new GenericType<AuditLogInfoResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a list of audit log messages.
   * Mode: Both Embedded only.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param startRecordOrdinal Starting record ordinal (optional)
   * @param endingRecordOrdinal Ending record ordinal (optional)
   * @param beginDate Beginning date (optional)
   * @param endDate Ending date (optional)
   * @param file Return CSV file (optional, default to false)
   * @return AuditLogGetResponse
   * @throws ApiException if fails to make API call
   */
  public AuditLogGetResponse getAuditLogMessages(String systemId, Integer startRecordOrdinal, Integer endingRecordOrdinal, Long beginDate, Long endDate, Boolean file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getAuditLogMessages");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/audit-log".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRecordOrdinal", startRecordOrdinal));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endingRecordOrdinal", endingRecordOrdinal));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "file", file));
    

    

    

    final String[] localVarAccepts = {
      "application/octet-stream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<AuditLogGetResponse> localVarReturnType = new GenericType<AuditLogGetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Check the oldest and newest available events
   * Mode: Both Embedded and Proxy. 
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param cacheOnly Only retrieve events currently in the cache (optional, default to false)
   * @return MelExtent
   * @throws ApiException if fails to make API call
   */
  public MelExtent getEventAvailability(String systemId, Boolean cacheOnly) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getEventAvailability");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/mel-events/available".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cacheOnly", cacheOnly));
    

    

    

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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a list of log messages for a component.
   * Mode: Embedded only.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param loggerType LoggerType to retrieve records for (optional, default to cfwUpgradeLogger)
   * @param startRecord Starting record number (optional, default to 0)
   * @param endingRecord Ending record number (optional, default to 50)
   * @return LoggerRecordResponse
   * @throws ApiException if fails to make API call
   */
  public LoggerRecordResponse getLogMessages(String systemId, String loggerType, Integer startRecord, Integer endingRecord) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getLogMessages");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/service-logs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loggerType", loggerType));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRecord", startRecord));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endingRecord", endingRecord));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<LoggerRecordResponse> localVarReturnType = new GenericType<LoggerRecordResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve MelEvents
   * Mode: Both Embedded and Proxy. This operation may take a substantial amount of time to return large numbers of events. In this case, the client may timeout. In this case, either the number of events to be retrieved should be reduced and multiple requests made, or the client-side timeout should be increased.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param startSequenceNumber  (optional, default to -1)
   * @param count Maximum number to retrieve (optional, default to 100)
   * @param critical Only retrieve events classified as critical (optional, default to false)
   * @param includeDebug Whether or not to retrieve debug entries (optional, default to false)
   * @return List<MelEntryEx>
   * @throws ApiException if fails to make API call
   */
  public List<MelEntryEx> getMelEvents(String systemId, Integer startSequenceNumber, Integer count, Boolean critical, Boolean includeDebug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling getMelEvents");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/mel-events".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "system-id" + "\\}", apiClient.escapeString(systemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startSequenceNumber", startSequenceNumber));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "critical", critical));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeDebug", includeDebug));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    
    GenericType<List<MelEntryEx>> localVarReturnType = new GenericType<List<MelEntryEx>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Updates the audit long configuration.
   * Mode: Both Embedded only.
   * @param systemId The unique identifier of the storage-system. This may be the id or the WWN. (required)
   * @param body  (optional)
   * @return AuditLogConfiguration
   * @throws ApiException if fails to make API call
   */
  public AuditLogConfiguration updateAuditLogConfig(String systemId, AuditLogConfiguration body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'systemId' is set
    if (systemId == null) {
      throw new ApiException(400, "Missing the required parameter 'systemId' when calling updateAuditLogConfig");
    }
    
    // create path and map variables
    String localVarPath = "/storage-systems/{system-id}/audit-log/config".replaceAll("\\{format\\}","json")
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

    
    GenericType<AuditLogConfiguration> localVarReturnType = new GenericType<AuditLogConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
