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
* API tests for HardwareApi
*/
public class HardwareApiTest {
    private final HardwareApi api = new HardwareApi();
    
    /**
     * Cancel any active hardware identification
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelHardwareIdentificationTest() throws ApiException {
        
        String systemId = null;
        
        try{
        api.cancelHardwareIdentification(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of controllers
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllControllersTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<Controller> response = api.getAllControllers(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of drives
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDrivesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<DriveEx> response = api.getAllDrives(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a controller
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerTest() throws ApiException {
        
        String systemId = null;
        
        String controllerId = null;
        
        try{
        Controller response = api.getController(systemId, controllerId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a drive
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriveTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        DriveEx response = api.getDrive(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get connectivity information for drive trays
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriveConnectionInfoTest() throws ApiException {
        
        String systemId = null;
        
        try{
        EsmPortConnectionResponse response = api.getDriveConnectionInfo(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get hardware information
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHardwareInformationTest() throws ApiException {
        
        String systemId = null;
        
        try{
        HardwareInventoryResponse response = api.getHardwareInformation(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the iSCSI Entity data
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getISCSIDataTest() throws ApiException {
        
        String systemId = null;
        
        try{
        IscsiEntityResponse response = api.getISCSIData(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the iSCSI Target
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getISCSITargetTest() throws ApiException {
        
        String systemId = null;
        
        try{
        Target response = api.getISCSITarget(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of unreadable sectors
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnreadableSectorsListTest() throws ApiException {
        
        String systemId = null;
        
        try{
        UnreadableSectorResponse response = api.getUnreadableSectorsList(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Select drives for storage-pool creation
     *
     * Mode: Both Embedded and Proxy. Retrieve a list of drives based on provided selection criteria. If the number of drives you have selected is not available based on the request parameters, an empty list is returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void selectDrivesTest() throws ApiException {
        
        String systemId = null;
        
        DriveSelectionRequest body = null;
        
        try{
        List<DriveEx> response = api.selectDrives(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Start hardware identification
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startHardwareIdentificationTest() throws ApiException {
        
        String systemId = null;
        
        IdentificationRequest body = null;
        
        try{
        api.startHardwareIdentification(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update iSCSI Entity data
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateISCSIDataTest() throws ApiException {
        
        String systemId = null;
        
        IscsiEntityUpdateRequest body = null;
        
        try{
        IscsiEntityResponse response = api.updateISCSIData(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update the iSCSI Target
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateISCSITargetTest() throws ApiException {
        
        String systemId = null;
        
        IscsiTargetUpdateRequest body = null;
        
        try{
        IscsiTargetResponse response = api.updateISCSITarget(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
