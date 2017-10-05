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
import com.netapp.santricity.models.symbol.*;
import com.netapp.santricity.models.utils.*;
import com.netapp.santricity.models.v2.*;
import static org.testng.AssertJUnit.*;
import org.testng.annotations.*;
import org.testng.Assert.*;
import org.testng.Reporter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.util.Date;
import java.util.Objects;


/**
* API tests for MonitoringApi
*/
public class MonitoringApiTest {
    private final MonitoringApi api = new MonitoringApi();
    
    /**
     * Clear MelEvents
     *
     * Mode: Both Embedded and Proxy. Gives the user the ability to clear the event cache and the EventLog directly on the StorageDevice.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearMelEventsTest() throws ApiException {
        
        String systemId = null;
        
        Boolean clearCache = null;
        
        Boolean resetMel = null;
        
        try{
        api.clearMelEvents(systemId, clearCache, resetMel);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete specified subset or all audit log messages.
     *
     * Mode: Embedded only.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAuditLogMessagesTest() throws ApiException {
        
        String systemId = null;
        
        Integer retentionCount = null;
        
        Long endDate = null;
        
        Boolean clearAll = null;
        
        try{
        AuditLogDeleteResponse response = api.deleteAuditLogMessages(systemId, retentionCount, endDate, clearAll);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all global status events
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllGlobalStatusEventsTest() throws ApiException {
        
        Long lastKnown = null;
        
        Integer wait = null;
        
        try{
        List<Event> response = api.getAllGlobalStatusEvents(lastKnown, wait);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of status Events for the StorageDevice
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStorageDeviceStatusEventsTest() throws ApiException {
        
        String systemId = null;
        
        Long lastKnown = null;
        
        Integer wait = null;
        
        try{
        List<Event> response = api.getAllStorageDeviceStatusEvents(systemId, lastKnown, wait);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the current audit log configuration.
     *
     * Mode: Both Embedded only.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditLogConfigTest() throws ApiException {
        
        String systemId = null;
        
        try{
        AuditLogConfiguration response = api.getAuditLogConfig(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get audit log metadata.
     *
     * Mode: Both Embedded only.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditLogInfoTest() throws ApiException {
        
        String systemId = null;
        
        try{
        AuditLogInfoResponse response = api.getAuditLogInfo(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a list of audit log messages.
     *
     * Mode: Both Embedded only.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditLogMessagesTest() throws ApiException {
        
        String systemId = null;
        
        Integer startRecordOrdinal = null;
        
        Integer endingRecordOrdinal = null;
        
        Long beginDate = null;
        
        Long endDate = null;
        
        Boolean file = null;
        
        try{
        AuditLogGetResponse response = api.getAuditLogMessages(systemId, startRecordOrdinal, endingRecordOrdinal, beginDate, endDate, file);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Check the oldest and newest available events
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventAvailabilityTest() throws ApiException {
        
        String systemId = null;
        
        Boolean cacheOnly = null;
        
        try{
        MelExtent response = api.getEventAvailability(systemId, cacheOnly);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a list of log messages for a component.
     *
     * Mode: Embedded only.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogMessagesTest() throws ApiException {
        
        String systemId = null;
        
        String loggerType = null;
        
        Integer startRecord = null;
        
        Integer endingRecord = null;
        
        try{
        LoggerRecordResponse response = api.getLogMessages(systemId, loggerType, startRecord, endingRecord);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve MelEvents
     *
     * Mode: Both Embedded and Proxy. This operation may take a substantial amount of time to return large numbers of events. In this case, the client may timeout. In this case, either the number of events to be retrieved should be reduced and multiple requests made, or the client-side timeout should be increased.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMelEventsTest() throws ApiException {
        
        String systemId = null;
        
        Integer startSequenceNumber = null;
        
        Integer count = null;
        
        Boolean critical = null;
        
        Boolean includeDebug = null;
        
        try{
        List<MelEntryEx> response = api.getMelEvents(systemId, startSequenceNumber, count, critical, includeDebug);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Updates the audit long configuration.
     *
     * Mode: Both Embedded only.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAuditLogConfigTest() throws ApiException {
        
        String systemId = null;
        
        AuditLogConfiguration body = null;
        
        try{
        AuditLogConfiguration response = api.updateAuditLogConfig(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
