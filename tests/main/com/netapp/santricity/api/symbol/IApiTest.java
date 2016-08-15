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
* API tests for IApi
*/
public class IApiTest {
    private final IApi api = new IApi();
    
    /**
     * This procedure allows a security locked drive to be unlocked. An archived, wrapped and encrypted lock key is imported into the array. In response, the controller attempts to unlock all security-locked drives that have a matching lock key ID. The imported lock key and lock key id become the new array lock key and lock key ID.
     *
     * Documented return codes: ok, notImplemented, noLockedDrives, invalidBlob, unlockFailed, noKeySet. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolImportLockKeyTest() throws ApiException {
        
        String systemId = null;
        
        LockKeyBlob body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolImportLockKey(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the identified volume group to be imported, which move it from either the \&quot;exported\&quot; state or the \&quot;forced\&quot; state to the \&quot;complete\&quot; state in which it is fully operable and available for use. Note that \&quot;higher-level\&quot; volumes (SnapshotVolume, MetadataVolume, VolumeCopy, and MirrorProxyVolume) - but not their underlying RAID volumes - are removed as part of the import.
     *
     * Documented return codes: ok, volumeGroupHasHotspare, volumeGroupReconfiguring, volumeGroupReconstructing, volumeGroupNotComplete, volumeGroupHasFailedDrives, volumeGroupHasNonOptimalVols, volumeGroupHasMirrorRelationship, volumeGroupHasVolcopyRelationship, volumeGroupHasMirroringMetadata, volumeGroupHasMappedVols, volumeGroupHasReservations, volumeGroupHasIncompatibleDacstores, volumeLimitExceeded, volumeGroupHasUnknownRaidLevel, volumeGroupHasUnsupportedRaidLevel, volumeGroupHasCloneOpportunity, volumeGroupHasInsufficientDrives, volumeGroupHasFailedVols, driveSpinUpError, volumeGroupHasIncompatibleDrive, volumeGroupVolumeEncroachesOnDacstore, volumeGroupImportInProgress, drivesNeedToBeSpunUp, noNativeSstor. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolImportVolumeGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolImportVolumeGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the specified drive object to be initialized for use in the system. All data on the drive is irretrievably lost as a result of this operation. Only offline drives or drives whose status is DRIVE_STAT_INCOMPATIBLE are candidates for initialization. This procedure implicitly transitions the drive to the online state.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, tryAlternate, invalidDriveref. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolInitializeDriveTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolInitializeDrive(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Passes an existing lock key for the array and unlocks the disks.
     *
     * Documented return codes: ok, invalidBlob. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolInstallLockKeyTest() throws ApiException {
        
        String systemId = null;
        
        WrappedLockKeyList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolInstallLockKey(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Passes a new lock key for the array and commits the key to the disks.
     *
     * Documented return codes: ok, invalidBlob, externalKmsNotEnabled, keyNotNeeded, keyInvalidSequence, externalKmsNotCompliant, invalidLockKeyId. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolInstallNewLockKeyTest() throws ApiException {
        
        String systemId = null;
        
        NewLockKey body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolInstallNewLockKey(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure invalidates the staged controller firmware.
     *
     * Documented return codes: ok, error, illegalParam, downloadInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolInvalidateStagedControllerFirmwareTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolInvalidateStagedControllerFirmware(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure executes the inter-controller discrete line diagnostics test.
     *
     * Documented return codes: ok, error, dltNotCompleted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolIssueDiscreteLinesTestTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolIssueDiscreteLinesTest(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to start the Runtime Diagnostics.
     *
     * Documented return codes: ok, illegalParam, tryAlternate, diagReadFailure, diagWriteFailure, diagLoopbackError, diagTimeout, diagInProgress, diagNoAlt, diagIconSendErr, diagInitErr, diagModeErr, diagInvalidTestId, diagDriveErr, diagLockErr, diagConfigErr, diagNoCacheMem, diagNotQuiesced, diagUtmNotEnabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolIssueRuntimeDiagnosticsTest() throws ApiException {
        
        String systemId = null;
        
        RuntimeDiagDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        RuntimeDiagResults response = api.symbolIssueRuntimeDiagnostics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
