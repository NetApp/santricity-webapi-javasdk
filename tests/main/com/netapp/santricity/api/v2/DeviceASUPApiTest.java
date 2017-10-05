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
* API tests for DeviceASUPApi
*/
public class DeviceASUPApiTest {
    private final DeviceASUPApi api = new DeviceASUPApi();
    
    /**
     * Retrieve the device ASUP configuration
     *
     * Mode: Embedded only.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getASUPConfigurationTest() throws ApiException {
        
        try{
        DeviceAsupResponse response = api.getASUPConfiguration();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve ASUP information for all storage devices
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getASUPInformationTest() throws ApiException {
        
        try{
        List<DeviceAsupDevice> response = api.getASUPInformation();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Gets an ASUP transmission log file 
     *
     * Mode: Embedded only. The response type of this method is a file stream.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getASUPTransmissionLogFileTest() throws ApiException {
        
        String filename = null;
        
        try{
        File response = api.getASUPTransmissionLogFile(filename);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve a list of ASUP transimission log files
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllASUPTransmissionLogFilesTest() throws ApiException {
        
        try{
        List<FileInfo> response = api.getAllASUPTransmissionLogFiles();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update the device ASUP configuration
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateASUPConfigurationTest() throws ApiException {
        
        DeviceAsupUpdateRequest body = null;
        
        try{
        DeviceAsupResponse response = api.updateASUPConfiguration(body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Verify a device ASUP configuration
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyASUPConfigurationTest() throws ApiException {
        
        DeviceAsupVerifyRequest body = null;
        
        try{
        DeviceAsupVerifyResponse response = api.verifyASUPConfiguration(body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
