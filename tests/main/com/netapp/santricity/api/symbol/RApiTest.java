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
* API tests for RApi
*/
public class RApiTest {
    private final RApi api = new RApi();
    
    /**
     * This procedure reads a range of (i.e. one or more) MgmtClient Record objects.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolReadMgmtClientRecordsTest() throws ApiException {
        
        String systemId = null;
        
        MgmtClientRecordReadDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        MgmtClientRecordReadResult response = api.symbolReadMgmtClientRecords(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of the known unreadable sectors for the system.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolReadUnreadableSectorDatabaseTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        UnreadableSectorTableInfo response = api.symbolReadUnreadableSectorDatabase(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to recover a stopped or failed Async Mirror Group Member.
     *
     * Documented return codes: arvmRecoveryPointDeletionRequired, arvmOnlyPrimaryMemberRemoved, arvmOnlySecondaryMemberRemoved, arvmOrphanGroup, volumeNotAvailable, volumeHasUnreadableSectors, remoteInternalError, arvmRemoteMirrorMemberDoesNotExist, remoteDatabaseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRecoverAsyncMirrorGroupMemberTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRecoverAsyncMirrorGroupMember(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to recover a stopped or failed asynchronous mirror group member.
     *
     * Documented return codes: ok, arvmRecoveryPointDeletionRequired, arvmOnlyPrimaryMemberRemoved, arvmOnlySecondaryMemberRemoved, arvmOrphanGroup, volumeNotAvailable, volumeHasUnreadableSectors, remoteInternalError, arvmRemoteMirrorMemberDoesNotExist, remoteDatabaseError, arvmThinVolInitError, arvmRemoteThinVolInitError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRecoverAsyncMirrorGroupMemberDeleteRecoveryPointTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupRecoverDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRecoverAsyncMirrorGroupMemberDeleteRecoveryPoint(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to tell the controller that corrective action has been taken to recover from a mis-wire condition. The controller will re-enable any SAS Ports that were disabled when a mis-wire was detected.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRecoverFromMiswireTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRecoverFromMiswire(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure creates a volume using the parameters of a volume that previously existed. Since no data or parity initialization is performed on the volume, the prior data is preserved resulting in a volume that is identical to the previous volume.
     *
     * Documented return codes: maxVolumesExceeded, raid6FeatureUnsupported, raid6FeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRecoverVolumeTest() throws ApiException {
        
        String systemId = null;
        
        RecoverVolumeDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRecoverVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure restarts a snapshot volume that was previously created. The snapshot must have been previously disabled for this procedure to succeed.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, internalError, invalidVolumeref, snapNotAvailable, notDisabled, snapshotFeatureDisabled, repositoryOffline, ghostVolume, repositoryMissing, repositoryFailed, baseVolumeFailed, baseVolumeOffline, basevolSizeChanged. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRecreateSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRecreateSnapshot(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * During snapshot recreation, all affected volumes (snapshots, base, and repository) will be appropriately quiesced; I/O will be resumed to all affected volumes once all snapshots have been successfully restarted.
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, invalidVolumeref, snapNotAvailable, notDisabled, snapshotFeatureDisabled, repositoryOffline, ghostVolume, repositoryMissing, repositoryFailed, baseVolumeFailed, baseVolumeOffline, basevolSizeChanged. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRecreateSnapshotCollectionTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRecreateSnapshotCollection(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure performs a refresh of the DHCP parameters for the iSCSI interface specified by the input argument. The affected parameters are port IP address, subnet mask, and gateway IP address.
     *
     * Documented return codes: ok, manualConfigModeSet. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRefreshIscsiDhcpParametersTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRefreshIscsiDhcpParameters(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the storage array to refresh its idea of the network address information for the iSNS server
     *
     * Documented return codes: background, manualConfigModeSet. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRefreshIsnsServerLocationTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRefreshIsnsServerLocation(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the referenced thin volume to be reinitialized to have no content.
     *
     * Documented return codes: ok, illegalParam, tryAlternate, notImplemented, internalError, invalidVolumeref, repositoryTooSmall, invalidConcatVolMemberLabel, illegalVolume, invalidRepositoryCapacity, invalidProvisionedCapacityQuota, invalidReinitAction, invalidReinitCapacity. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolReinitializeThinVolumeTest() throws ApiException {
        
        String systemId = null;
        
        ThinVolumeReinitializeDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolReinitializeThinVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure attempts to release a previously acquired Customer Support Bundle (CSB) lock once the CSB retrieval is complete. If the provided lock key matches the current value of the lock, the lock is released and the procedure returns success. If the lock key does not match the current value of the lock or if the lock is not active, the procedure returns an error.
     *
     * Documented return codes: ok, csbReleaseFailedNoLock, csbReleaseFailedInvalidKey. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolReleaseSupportDataTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolReleaseSupportData(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will remove a member from an Async Mirror Group.
     *
     * Documented return codes: ok, arvmGroupDoesNotExist, arvmMirrorMemberDoesNotExist, remoteInternalError, arvmRemoteMirrorMemberDoesNotExist, remoteDatabaseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRemoveAsyncMirrorGroupMemberTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupRemoveMemberDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRemoveAsyncMirrorGroupMember(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Removes all bundle keys that have been applied to change feature bundles.
     *
     * Documented return codes: ok, error, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRemoveBundleKeysTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRemoveBundleKeys(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure reconfigures the flash cache volume group to remove drives.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, internalError, invalidDriveref, duplicateDrives, invalidDriveState, notFlashcacheVol, flashcacheDeleted, flashcacheFailed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRemoveDrivesFromFlashCacheTest() throws ApiException {
        
        String systemId = null;
        
        FlashCacheReconfigureDrivesDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRemoveDrivesFromFlashCache(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Deletes a mirror volume.
     *
     * Documented return codes: ok, illegalParam, volumeNotExist, internalError, iconFailure, invalidVolumeref, ghostVolume, invalidMirrorvol, onlyLocalMirrorDeleted, rvmSpmError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRemoveMirrorTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRemoveMirror(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will remove a member from a PiT consistency group.
     *
     * Documented return codes: ok, invalidPitGroupRef. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRemovePITConsistencyGroupMemberTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupRemoveMemberDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRemovePITConsistencyGroupMember(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to remove a previous configured SNMP community from the list of known community strings.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRemoveSNMPCommunityTest() throws ApiException {
        
        String systemId = null;
        
        SNMPCommunityRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRemoveSNMPCommunity(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to remove a previously configured SNMP trap destination.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRemoveSNMPTrapDestinationTest() throws ApiException {
        
        String systemId = null;
        
        SNMPTrapDestinationRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRemoveSNMPTrapDestination(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Removes a volume copy.
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, invalidVolumeref, ghostVolume. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRemoveVolumeCopyTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRemoveVolumeCopy(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure changes the user-assigned label for a Cluster object.
     *
     * Documented return codes: ok, partDupId, partLabelInvalid, partNodeNonexistent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRenameClusterTest() throws ApiException {
        
        String systemId = null;
        
        SYMbolRefWithUAL body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRenameCluster(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure changes the user-assigned label for a Host object.
     *
     * Documented return codes: ok, partDupId, partLabelInvalid, partNodeNonexistent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRenameHostTest() throws ApiException {
        
        String systemId = null;
        
        SYMbolRefWithUAL body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRenameHost(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure changes the user-assigned label for a HostPort object.
     *
     * Documented return codes: ok, partDupId, partNodeNonexistent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRenameHostPortTest() throws ApiException {
        
        String systemId = null;
        
        HostPortRenameDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRenameHostPort(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes a drive, A, that is not part of a volume group to replace a drive, B, that is part of a volume group. The end result is that the volume group drive composition is redefined to include A, and exclude B. The only candidate drives for being replaced are those that belong to a volume group and are either not-present or are failed. The only candidate drives for replacing a drive are those that are either unassigned or are a fully-integrated hot spare.
     *
     * Documented return codes: ok, driveTypeMismatch. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolReplaceDriveTest() throws ApiException {
        
        String systemId = null;
        
        DriveReplacementDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolReplaceDrive(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure resets each drive&#39;s lock key to a new, random value and disables each drive&#39;s security system.
     *
     * Documented return codes: ok, illegalParam, notImplemented. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolReprovisionDriveTest() throws ApiException {
        
        String systemId = null;
        
        DriveRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolReprovisionDrive(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure turns the Ready to Remove indicator light on or off or puts the Ready to Remove indicator into automatic mode, for the component specified in the RTRUpdateDescriptor.
     *
     * Documented return codes: ok, error, illegalParam, downloadInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRequestRemovalTest() throws ApiException {
        
        String systemId = null;
        
        RTRUpdateDescription body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRequestRemoval(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure turns the Ready to Remove indicator light on or off or puts the Ready to Remove indicator into automatic mode, for the component specified in the RTRUpdateDescriptor. This procedure is deprecated. The requestRemoval procedure should be used instead.
     *
     * Documented return codes: ok, error, illegalParam, downloadInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRequestToRemoveTest() throws ApiException {
        
        String systemId = null;
        
        RTRUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRequestToRemove(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure attempts to acquire the Customer Support Bundle lock. If the lock is successfully acquired the procedure returns success and the lock key. If another client owns the lock a failure indication is returned along with an integer indicating the suggested number of seconds to wait before retrying the reservation.
     *
     * Documented return codes: ok, csbReserveFailed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolReserveSupportDataTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReserveSupportDataReturned response = api.symbolReserveSupportData(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will reset (clear) synchronization time statistics for a list of mirror members.
     *
     * Documented return codes: ok, notImplemented. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResetAsyncMirrorSyncStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorSyncStatisticsResetDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResetAsyncMirrorSyncStatistics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure requests a reboot of the given controller.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, tryAlternate, invalidRequest, invalidControllerref, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResetControllerTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResetController(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets all cumulative statistics on each controller back to zero and sets a new base time equal to the current time.
     *
     * Documented return codes: ok, error, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResetCumulativeStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResetCumulativeStatistics(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure resets the related discrete time series statistical streams on both controller, i.e., it sets the number of observations for the series back to zero.
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResetDiscreteTimeSeriesTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResetDiscreteTimeSeries(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure resets the related histograms both controllers, i.e., it sets the number of entries in each category and all observation tallies back to zero.
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResetHistogramTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResetHistogram(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure clears all entries from the Major Events Log.
     *
     * Documented return codes: ok, tryAlternate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResetMelTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResetMel(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure provides a way to clear the storage array configuration without bringing it all the way back to its initial state. Core security and identification may be retained, if desired.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResetSAConfigurationTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResetSAConfiguration(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will restart a Consistency Group View (restart all of its associated member Views).
     *
     * Documented return codes: ok, invalidPitForView. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRestartPITConsistencyGroupViewTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupViewRestartDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRestartPITConsistencyGroupView(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will restart a PiT View.
     *
     * Documented return codes: ok, invalidPitForView. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRestartPITViewTest() throws ApiException {
        
        String systemId = null;
        
        PITViewRestartDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRestartPITView(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Resume an Async Mirror Group.
     *
     * Documented return codes: ok, arvmGroupDoesNotExist, arvmRecoveryPointDeletionRequired, arvmGroupNotPrimary, arvmGroupNotSuspended, arvmResumeFailure, arvmGroupHasIncompleteMember, remoteInternalError, arvmRemoteGroupDoesNotExist, remoteDatabaseError, arvmRemoteResumeFailure. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResumeAsyncMirrorGroupTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupResumeDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AsyncMirrorGroupActionResult response = api.symbolResumeAsyncMirrorGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure resumes the communication for all mirrors in a Write Consistency group with a specified group number.
     *
     * Documented return codes: ok, noHeap, internalError, iconFailure, legacyRvmAsyncModeUnsupported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResumeConsistencyGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResumeConsistencyGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure resumes a previously suspended flash cache.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeNotExist, internalError, invalidVolumeref, flashcacheNotSuspended, notFlashcacheVol, flashcacheDeleted, flashcacheFailed, flashcacheDegradedState. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResumeFlashCacheTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResumeFlashCache(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure resumes the communication between a mirror pair.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, internalError, iconFailure, invalidVolumeref, ghostVolume, invalidMirrorvol, rvmVersionMismatch, rvmOperNotAllowedOnSec. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResumeMirrorTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResumeMirror(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure resumes the communication between all mirrored pairs specified in the MirrorVolumeList.
     *
     * Documented return codes: ok, noHeap, internalError, iconFailure. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResumeMirrorListTest() throws ApiException {
        
        String systemId = null;
        
        MirrorVolumeList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResumeMirrorList(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will resume a paused rollback on the specified PiT.
     *
     * Documented return codes: ok, repositoryOffline, invalidPitRef, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResumePITRollbackTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResumePITRollback(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to resume suspended snapshot rollback operations.
     *
     * Documented return codes: ok, rollbackStartFailure. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolResumeSnapshotRollbackTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolResumeSnapshotRollback(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure revives a failed PiT Group.
     *
     * Documented return codes: ok, repositoryOffline, rollbackInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRevivePITGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRevivePITGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure revives a failed PiT View.
     *
     * Documented return codes: ok, repositoryOffline. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRevivePITViewTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRevivePITView(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure changes the role of the mirror volume.
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, invalidVolumeref, ghostVolume, invalidMirrorvol, localRoleChangeFailed, remoteRoleChangeFailed, localRoleChangeSuccessful, localRoleChangedNotForced, remoteRoleChangedLocalFailed, rvmVersionMismatch, rvmRemoteArrayError, rvmCommunicationError, secNotPromoteable, priNotDemoteable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolRoleChangeTest() throws ApiException {
        
        String systemId = null;
        
        MirrorRoleChangeDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolRoleChange(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
