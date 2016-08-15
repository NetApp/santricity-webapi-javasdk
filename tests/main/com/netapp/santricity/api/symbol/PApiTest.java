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
* API tests for PApi
*/
public class PApiTest {
    private final PApi api = new PApi();
    
    /**
     * This procedure simply verifies that the controller is responsive and is operating properly.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolPingControllerTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolPingController(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to power cycle an individual physical drive.
     *
     * Documented return codes: ok, driveNotUnassigned, volumeReconfiguring, volumeNotOptimal, downloadInProgress, parityScanInProgress, volumeGroupNotComplete, dpcVolumeGroupNotRedundant, dpcVolumeNotInitialized, dpcExclusiveOperationActive, dpcFormatActive, dpcUnreadableSectorsPresent, dpcPowerCycleAlreadyInProgress, dpcEnclosureHardwareUnsupported, dpcEnclosureFwDownlevel. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolPowerCyclePhysicalDriveTest() throws ApiException {
        
        String systemId = null;
        
        PowerCyclePhysicalDriveDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        PowerCyclePhysicalDriveDataReturn response = api.symbolPowerCyclePhysicalDrive(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This command provides a programmatic means of powering off a storage array The operation is performed as gracefully as possible. Once this command is received, all open sockets, except for those that have in-process commands, are closed, meaning that any new SYMbol commands attempted will receive an RPC error. SYMbol commands that are in-process when this command is received are allowed to continue execution. In-process SYMbol commands in the \&quot;active\&quot; category are guaranteed to complete; In-process commands in the \&quot;passive\&quot; category may complete, but there is no guarantee. This command returns and reports status just prior to the actual power down event. Authentication is required for this command.
     *
     * Documented return codes: ok, noHeap, background, cacheSyncFailure, quiescenceFailed, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolPowerDownArrayTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolPowerDownArray(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
