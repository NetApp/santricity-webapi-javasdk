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
* API tests for DiagnosticsApi
*/
public class DiagnosticsApiTest {
    private final DiagnosticsApi api = new DiagnosticsApi();
    
    /**
     * Retrieve the device Alerts configuration
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlertConfigurationTest() throws ApiException {
        
        String systemId = null;
        
        try{
        DeviceAlertConfiguration response = api.getAlertConfiguration(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the core dump information
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCoreDumpInformationTest() throws ApiException {
        
        String systemId = null;
        
        try{
        DPLCoreDumpData response = api.getCoreDumpInformation(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Return various data about the managed device for diagnostic or display purposes.
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceDiagnosticDataTest() throws ApiException {
        
        String systemId = null;
        
        DiagnosticDataRequest dataRequest = null;
        
        try{
        DeviceDataResponse response = api.getDeviceDiagnosticData(systemId, dataRequest);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get list of failures
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFailuresTest() throws ApiException {
        
        String systemId = null;
        
        Boolean details = null;
        
        try{
        List<FailureData> response = api.getFailures(systemId, details);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the status of a pending data retrieval request
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportDataRetrievalRequestStatusTest() throws ApiException {
        
        String systemId = null;
        
        Long requestId = null;
        
        try{
        SupportDataResponse response = api.getSupportDataRetrievalRequestStatus(systemId, requestId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the syslog configuration
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSyslogConfigurationTest() throws ApiException {
        
        String systemId = null;
        
        try{
        AlertSyslogConfiguration response = api.getSyslogConfiguration(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update the syslog configuration
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setSyslogConfigurationTest() throws ApiException {
        
        String systemId = null;
        
        AlertSyslogConfiguration body = null;
        
        try{
        AlertSyslogConfiguration response = api.setSyslogConfiguration(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Initiate a support data retrieval request
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startSupportDataRetrievalRequestTest() throws ApiException {
        
        String systemId = null;
        
        SupportDataRequest body = null;
        
        try{
        InitialAsyncResponse response = api.startSupportDataRetrievalRequest(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Initiate a test email using the array alert settings
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testAlertEmailTest() throws ApiException {
        
        String systemId = null;
        
        try{
        DeviceAlertTestResponse response = api.testAlertEmail(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Initiate sending test syslog messages using the syslog settings
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testSyslogSendTest() throws ApiException {
        
        String systemId = null;
        
        try{
        AlertSyslogResponse response = api.testSyslogSend(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update the device Alerts configuration
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAlertConfigurationTest() throws ApiException {
        
        String systemId = null;
        
        DeviceAlertConfiguration updateRequest = null;
        
        try{
        DeviceAlertConfiguration response = api.updateAlertConfiguration(systemId, updateRequest);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
