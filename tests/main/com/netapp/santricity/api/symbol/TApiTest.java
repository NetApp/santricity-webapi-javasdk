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
* API tests for TApi
*/
public class TApiTest {
    private final TApi api = new TApi();
    
    /**
     * This procedure is used to initiate an Async Mirror Group link connectivity test.
     *
     * Documented return codes: ok, arvmConnectivityTestNetworkError, arvmConnectivityTestRemoteTimeout, arvmConnectivityTestLoginFailure, arvmConnectivityTestNameServiceError, arvmConnectivityTestTurError, arvmConnectivityTestMissingRemoteAmg, arvmConnectivityTestAmgMemberMismatch, arvmConnectivityTestTimeoutExceeded, remoteNoHeap, arvmRemoteGroupDoesNotExist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolTestAsyncMirrorGroupConnectivityTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupConnectivityTestDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AsyncMirrorGroupConnectivityTestResultsReturned response = api.symbolTestAsyncMirrorGroupConnectivity(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to test SNMP trap destinations (generate test trap).
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolTestSNMPTrapDestinationTest() throws ApiException {
        
        String systemId = null;
        
        SNMPTrapDestinationTestDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolTestSNMPTrapDestination(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to manually trigger a DPL Core Dump.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolTriggerDPLCoreDumpOnDemandTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DPLCoreDumpOnDemandReturn response = api.symbolTriggerDPLCoreDumpOnDemand(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to manually trigger an IOC Dump on the specified channel.
     *
     * Documented return codes: ok, iocDumpInProgress, iocRestoreInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolTriggerIOCDumpOnDemandTest() throws ApiException {
        
        String systemId = null;
        
        ChannelLocation body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IOCDumpOnDemandReturn response = api.symbolTriggerIOCDumpOnDemand(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will trim a concatenated volume by removing one or more member RAID volumes. Note this can only be done in cases where the ConcatVolume is not being used (definition of \&quot;used\&quot; depends on parent object usage).
     *
     * Documented return codes: ok, invalidTrimCount, volumeInUse. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolTrimConcatVolumeTest() throws ApiException {
        
        String systemId = null;
        
        ConcatVolumeTrimDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolTrimConcatVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * A procedure that provides a means to tunnel HTTP calls through the UTM Lun. The HTTP call is executed against the embedded web server.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolTunnelHttpCallTest() throws ApiException {
        
        String systemId = null;
        
        SymbolTunnelRequest body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        SymbolTunnelReply response = api.symbolTunnelHttpCall(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
