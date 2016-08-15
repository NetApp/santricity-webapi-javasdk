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
* API tests for DriveFirmwareApi
*/
public class DriveFirmwareApiTest {
    private final DriveFirmwareApi api = new DriveFirmwareApi();
    
    /**
     * Cancel the on going update operations.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelDriveFirmwareUpdateTest() throws ApiException {
        
        String systemId = null;
        
        try{
        api.cancelDriveFirmwareUpdate(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve list of files in the drive firmware directory
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDriveFirmwareFilesTest() throws ApiException {
        
        try{
        List<FileInfo> response = api.getAllDriveFirmwareFiles();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Performs a mini health check and fetchs firmware to drive associations
     *
     * Mode: Both Embedded and Proxy. This is used to determine which drives are compatible with with firmware files that have been previously uploaded.The information returned about the drives also indicates if it can be updated online.This action also performs a mini health check to help determine if there are any storage system conditions that would prevent a firmware update to proceed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriveFirmwareCompatabilityCheckTest() throws ApiException {
        
        String systemId = null;
        
        try{
        DriveFirmwareCompatibilityResponse response = api.getDriveFirmwareCompatabilityCheck(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Gets a file from the drive firmware directory 
     *
     * Mode: Both Embedded and Proxy. The response type of this method is a file stream.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriveFirmwareFileTest() throws ApiException {
        
        String filename = null;
        
        Boolean autoDelete = null;
        
        try{
        File response = api.getDriveFirmwareFile(filename, autoDelete);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the status of the on going update operations.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriveFirmwareUpdateStatusTest() throws ApiException {
        
        String systemId = null;
        
        try{
        DriveFirmwareStatus response = api.getDriveFirmwareUpdateStatus(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Deletes a drive firmware file 
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeDriveFirmwareFileTest() throws ApiException {
        
        String filename = null;
        
        try{
        api.removeDriveFirmwareFile(filename);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Initiate a drive firmware update
     *
     * Mode: Both Embedded and Proxy. The firmware files to be used for the update should be uploaded previously.When the update has been successfully initiated, the firmware files that were uploaded and used in the update will be automatically removedIf there are files uploaded but not used by the update, they not be immediately removed but may be culled later if they remain unused.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startDriveFirmwareUpdateTest() throws ApiException {
        
        String systemId = null;
        
        List<DriveFirmwareUpdateEntry> body = null;
        
        Boolean onlineUpdate = null;
        
        try{
        String response = api.startDriveFirmwareUpdate(systemId, body, onlineUpdate);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Upload a drive firmware file
     *
     * Mode: Both Embedded and Proxy. Firmware file is uploaded to staging area and referenced in other drive firmware operations. If your multipart form has non-file data, it will be ignored and only the files handled.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadDriveFirmwareFileTest() throws ApiException {
        
        File file = null;
        
        try{
        List<FileInfo> response = api.uploadDriveFirmwareFile(file);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
