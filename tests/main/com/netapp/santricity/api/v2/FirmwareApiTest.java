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
* API tests for FirmwareApi
*/
public class FirmwareApiTest {
    private final FirmwareApi api = new FirmwareApi();
    
    /**
     * Activate staged controller firmware
     *
     * Mode: Proxy only. Activate Controller Firmware that was previous staged for a later upgrade operation. This operation will begin activation of the uploaded package.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activateStagedControllerFirmwareTest() throws ApiException {
        
        String systemId = null;
        
        CfwActivationRequest body = null;
        
        try{
        CfwUpgradeResponse response = api.activateStagedControllerFirmware(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Activates previously staged firmware.
     *
     * Mode: Embedded only. A successful activation will shut the web server down which may result in the request to timeout, be canceled, or return with a 503 Service Unavailable before the success response could be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activateStagedFirmwareTest() throws ApiException {
        
        try{
        api.activateStagedFirmware();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Begin a firmware compatibility check operation
     *
     * Mode: Proxy only. This endpoint allows a user to request all firmware and nvsram files that are compatible with a StorageSystem, or list of StorageSystems.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void beginCompatibilityCheckTest() throws ApiException {
        
        FirmwareCompatibilityRequest body = null;
        
        try{
        FirmwareCompatibilityResponse response = api.beginCompatibilityCheck(body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Cancel a firmware compatibility check operation
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelCompatibilityCheckTest() throws ApiException {
        
        try{
        api.cancelCompatibilityCheck();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Cancel a running health check
     *
     * Mode: Both Embedded and Proxy. This operation may take some time to cancel, as pending operations must be completed first.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelHealthCheckTest() throws ApiException {
        
        try{
        api.cancelHealthCheck();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Performs a compatibility check on a controller firmware bundle. Speed up process by sending only first 8KB of file.
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkEmbeddedFirmwareBundleCompatibilityTest() throws ApiException {
        
        String systemId = null;
        
        File file = null;
        
        try{
        EmbeddedCompatibilityCheckResponse response = api.checkEmbeddedFirmwareBundleCompatibility(systemId, file);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Performs a compatibility check on a NVSRAM file.
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkEmbeddedNVSRAMCompatibilityTest() throws ApiException {
        
        String systemId = null;
        
        File file = null;
        
        try{
        EmbeddedCompatibilityCheckResponse response = api.checkEmbeddedNVSRAMCompatibility(systemId, file);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Clear staged firmware details on the array
     *
     * Mode: Proxy only. Clear staged firmware details on the storage array
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearStagedFirmwareTest() throws ApiException {
        
        String systemId = null;
        
        try{
        api.clearStagedFirmware(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of firmware files
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFirmwareFilesTest() throws ApiException {
        
        try{
        List<CFWPackageMetadata> response = api.getAllFirmwareFiles();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Request status of a firmware compatibility check operation
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompatibilityCheckResultsTest() throws ApiException {
        
        Long requestId = null;
        
        try{
        FirmwareCompatibilityResponse response = api.getCompatibilityCheckResults(requestId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve status of a Controller Firmware upgrade operation
     *
     * Mode: Proxy only. Retrieve the status of a running controller firmware or nvsram upgrade operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerFirmwareUpgradeStatusTest() throws ApiException {
        
        String systemId = null;
        
        try{
        CfwUpgradeResponse response = api.getControllerFirmwareUpgradeStatus(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get last successful firmware upgrade timestamps and firmware upgrade logs
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmbeddedFirmwareInformationTest() throws ApiException {
        
        Boolean cfwUpgrade = null;
        
        Boolean iomUpgrade = null;
        
        Boolean driveUpgrade = null;
        
        Boolean nvsramUpgrade = null;
        
        Boolean includeLogs = null;
        
        try{
        EmbeddedFirmwareResponse response = api.getEmbeddedFirmwareInformation(cfwUpgrade, iomUpgrade, driveUpgrade, nvsramUpgrade, includeLogs);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve details on the current firmware
     *
     * Mode: Embedded only. Retrieve the list of code modules and versions of the firmware on the storage array.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFirmwareDetailsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        CurrentFirmwareResponse response = api.getFirmwareDetails(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a specific firmware file
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFirmwareFileTest() throws ApiException {
        
        String filename = null;
        
        try{
        CFWPackageMetadata response = api.getFirmwareFile(filename);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get health check status
     *
     * This endpoint should be utilized to retrieve the results of the health check. There are multiple parts to the health check process. If a critical portion fails, the entire check will be set to failed. If an invalid password is detected or a controller cannot be contacted, the check will return without completing additional unnecessary steps.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHealthCheckStatusTest() throws ApiException {
        
        Long requestId = null;
        
        try{
        HealthCheckResponse response = api.getHealthCheckStatus(requestId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get IOM service information
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIOMServiceInformationTest() throws ApiException {
        
        try{
        IomServiceInfoResponse response = api.getIOMServiceInformation();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve details on the staged firmware
     *
     * Mode: Embedded only. Retrieve the list of code modules and versions of the firmware staged on the storage array.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStagedControllerFirmwareDetailsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        StagedFirmwareResponse response = api.getStagedControllerFirmwareDetails(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve details on the staged firmware
     *
     * Mode: Proxy only. Retrieve the list of code modules and versions of the firmware staged on the storage array.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStagedFirmwareDetailsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        StagedFirmwareResponse response = api.getStagedFirmwareDetails(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete an uploaded firmware file
     *
     * Mode: Proxy only. Delete an uploaded firmware file by providing the filename. If the file is locked the file will be scheduled for deletion on service shutdown.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFirmwareFileTest() throws ApiException {
        
        String filename = null;
        
        try{
        api.removeFirmwareFile(filename);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Clear staged firmware details on the array
     *
     * Mode: Embedded only. Clear staged firmware details on the storage array
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeStagedFirmwareTest() throws ApiException {
        
        String systemId = null;
        
        try{
        api.removeStagedFirmware(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Initiate a Controller Firmware upgrade operation
     *
     * Mode: Proxy only. Start a controller firmware or nvsram upgrade operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startControllerFirmwareUpgradeTest() throws ApiException {
        
        String systemId = null;
        
        CfwUpgradeRequest body = null;
        
        try{
        InitialAsyncResponse response = api.startControllerFirmwareUpgrade(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Begin a health check
     *
     * Mode: Both Embedded and Proxy. The health checks are designed to test whether or not a StorageSystem is stable enough to safely allow a firmware upgrade operation to proceed. They can also be used in a generic fashion to probe a large number of StorageSystems for issues requiring attention.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startHealthCheckTest() throws ApiException {
        
        HealthCheckRequest body = null;
        
        try{
        InitialAsyncResponse response = api.startHealthCheck(body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Updates the IOM service configuration
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIOMServiceInformationTest() throws ApiException {
        
        IomServiceUpdateRequest body = null;
        
        try{
        api.updateIOMServiceInformation(body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Upload a firmware file.
     *
     * Mode: Embedded only. Upload endpoint for firmware that is not staged but directly loaded to the controller. This endpoint only applies when running embedded, not as a proxy.. File can be named the veosimage or the nvsramimage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadEmbeddedFirmwareFileTest() throws ApiException {
        
        Boolean staged = null;
        
        Boolean nvsram = null;
        
        File nvsramfile = null;
        
        File dlpfile = null;
        
        try{
        api.uploadEmbeddedFirmwareFile(staged, nvsram, nvsramfile, dlpfile);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Upload a firmware file.
     *
     * Mode: Proxy only. The firmware file will be uploaded to the server and will be available for firmware upgrade operations. It is recommended to keep the file names the same as they were named by the company. Some file types require this and will fail of renamed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFirmwareFileTest() throws ApiException {
        
        File firmwareFile = null;
        
        Boolean validate = null;
        
        try{
        FileInfo response = api.uploadFirmwareFile(firmwareFile, validate);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Upload a nvsram file.
     *
     * Mode: Embedded only. Upload endpoint for nvsram to download to the controller. Controllers will reboot when operation completes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadNVSRAMFileTest() throws ApiException {
        
        String systemId = null;
        
        File nvsramimage = null;
        
        try{
        api.uploadNVSRAMFile(systemId, nvsramimage);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
