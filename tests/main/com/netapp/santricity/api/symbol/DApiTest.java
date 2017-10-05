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
* API tests for DApi
*/
public class DApiTest {
    private final DApi api = new DApi();
    
    /**
     * This procedure deactivates the discrete time series statistical streams
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeactivateDiscreteTimeSeriesTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeactivateDiscreteTimeSeries(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will disable mirroring over Fibre Channel (freeing up dedicated channel).
     *
     * Documented return codes: ok, arvmAsyncMirrorGroupPresent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeactivateFibreChannelCheckPointBasedAsyncMirroringTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeactivateFibreChannelCheckPointBasedAsyncMirroring(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure deactivates a histogram statistics set, given a stream ID.
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeactivateHistogramTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeactivateHistogram(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Deactivate Remote Mirroring
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, internalError, iconFailure, mirrorsPresent, rvmFibreError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeactivateMirroringTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeactivateMirroring(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the drives specified by the argument to be deassigned as hot spares. They will be returned to the pool of unassigned drives, and thus be added to the unconfigured capacity pool of the storage array. Note that a hot spare drive cannot be deassigned if it is currently in use, sparing for a failed drive.
     *
     * Documented return codes: ok, illegalParam, tryAlternate, noSparesDeassigned, someSparesDeassigned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeassignDrivesAsHotSparesTest() throws ApiException {
        
        String systemId = null;
        
        DriveRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeassignDrivesAsHotSpares(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will delete an Async Mirror Group (AMG).
     *
     * Documented return codes: ok, arvmGroupDoesNotExist, arvmGroupNotEmpty, remoteInternalError, remoteDatabaseError, arvmRemoteGroupNotEmpty, remoteTryAlternate, arvmOnlyLocalAmgDeleted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteAsyncMirrorGroupTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupDeletionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteAsyncMirrorGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to clean up a mirror \&quot;place holder.\&quot;
     *
     * Documented return codes: ok, invalidIncompleteMemberRef, arvmGroupNotSecondary, remoteInternalError, arvmRemoteMirrorMemberDoesNotExist, arvmRemoteGroupDoesNotExist, remoteDatabaseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteAsyncMirrorGroupIncompleteMemberTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteAsyncMirrorGroupIncompleteMember(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will delete a PiT in one or more members of a consistency group.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteCGPITTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupPITDeletionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteCGPIT(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the Cluster object identified by the argument value to be deleted from the Storage Partitions configuration.
     *
     * Documented return codes: ok, partNodeNonexistent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteClusterTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteCluster(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to delete a disk pool and all volumes in that pool.
     *
     * Documented return codes: ok, diskPoolNotEmpty. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteDiskPoolTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteDiskPool(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure deletes the High Level Volume, the RAID Volumes on the SSD, and disables flash caching on any associated user volumes.
     *
     * Documented return codes: ok, error, noHeap, internalError, invalidVolumeref, notFlashcacheVol, flashcacheDeleted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteFlashCacheTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteFlashCache(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the Host object identified by the argument value to be deleted from the Storage Partitions configuration.
     *
     * Documented return codes: ok, partNodeNonexistent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteHostTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteHost(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the HostPort object identified by the argument value to be deleted from the Storage Partitions configuration.
     *
     * Documented return codes: ok, partNodeNonexistent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteHostPortTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteHostPort(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure deletes an initiator object.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteInitiatorTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteInitiator(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure removes from the array the specified key-value tags. It is an error to remove in-use key-value tags.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteKeyValueTagTest() throws ApiException {
        
        String systemId = null;
        
        KeyValueTagRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteKeyValueTag(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure removes from the specified volumes all references to specific Key-Value tags.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteKeyValueTagMappingTest() throws ApiException {
        
        String systemId = null;
        
        KeyValueTagMappingDeletionDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteKeyValueTagMapping(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the LUNMapping object identified by the argument value to be deleted from the Storage Partitions configuration.
     *
     * Documented return codes: ok, partNodeNonexistent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteLUNMappingTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteLUNMapping(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure deletes a range of (i.e. one or more) specified MgmtCleintRecords.
     *
     * Documented return codes: ok, noHeap, volumeNotExist, databaseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteMgmtClientRecordsTest() throws ApiException {
        
        String systemId = null;
        
        MgmtClientRecordDeleteDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteMgmtClientRecords(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will delete one or more PiTs.
     *
     * Documented return codes: ok, rollbackInProgress, invalidPitRef, notOldestPit, pitInConsistencyGroup. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeletePITTest() throws ApiException {
        
        String systemId = null;
        
        PITRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeletePIT(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will delete an existing PiT consistency group, all of the child PiT groups and their PiTs and associated ERVs. All associated views are stopped.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeletePITConsistencyGroupTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupDeletionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeletePITConsistencyGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will delete the specified PITConsistencyGroupView.
     *
     * Documented return codes: ok, operationFailedVolumeCopyClone. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeletePITConsistencyGroupViewTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupViewDeletionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeletePITConsistencyGroupView(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will delete a PiT Group.
     *
     * Documented return codes: ok, rollbackInProgress, invalidPitGroupRef, pitGroupInConsistencyGroup, operationFailedVolumeCopyClone. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeletePITGroupTest() throws ApiException {
        
        String systemId = null;
        
        PITGroupDeletionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeletePITGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will delete an existing PiT View.
     *
     * Documented return codes: ok, operationFailedVolumeCopyClone. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeletePITViewTest() throws ApiException {
        
        String systemId = null;
        
        PITViewDeletionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeletePITView(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Removes all SAPorts from an SAPortGroup, and deletes the group. OBSOLETE: Any call to deleteSAPortGroup will get a return status indicating the command is obsolete. No alternative procedure is available.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteSAPortGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteSAPortGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will delete a list of schedules.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteScheduleListTest() throws ApiException {
        
        String systemId = null;
        
        ScheduleRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteScheduleList(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Deletes the snapshot volume identified by the input argument. All data on the volume is lost and all resources associated with maintaining the snapshot are released.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteSnapshot(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to delete a Thin Volume. The procedure has been deprecated for deleting RAID Volumes - it has been replaced by the procedure deleteVolumeFromGroup.
     *
     * Documented return codes: ok, illegalParam, noHeap, volumeReconfiguring, reservationConflict, internalError, volumeFormatting, invalidVolumeref, volumeOffline, repositoryOffline, repositoryReconfiguring, rollbackInProgress, repositoryMissing, volumeHasMirrorRelationship, volumeInUse. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure deletes the volume referenced by the input argument. The procedure allows the caller to specify which behavior is desired for the case of deleting the last volume in the volume group - either delete or retain the volume group.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteVolumeFromGroupTest() throws ApiException {
        
        String systemId = null;
        
        VolumeDeletionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteVolumeFromGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete VolumeGroup and all Volumes in that group
     *
     * Documented return codes: ok, volumeInUse. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteVolumeGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteVolumeGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure removes the specified application awareness workloads. It is not an error to remove in-use (association mapped) workloads. All association mappings for the workload are removed including any KeyValueTag mappings. The actual KeyValueTag records are not deleted.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteWorkloadTest() throws ApiException {
        
        String systemId = null;
        
        WorkloadRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteWorkload(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure deletes the specified workload to volume mappings.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDeleteWorkloadVolumeMappingTest() throws ApiException {
        
        String systemId = null;
        
        WorkloadVolumeDeleteMappingDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDeleteWorkloadVolumeMapping(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to disable Autosupport.
     *
     * Documented return codes: ok, notImplemented. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDisableASUPTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDisableASUP(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Disables external KMS.
     *
     * Documented return codes: ok, externalKmsNotEnabled, cannotDisableNoKey, externalKmsDisabledNoKey. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDisableExternalKMSTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        WrappedLockKeyReturn response = api.symbolDisableExternalKMS(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Disable a single add-on(optional feature
     *
     * Documented return codes: ok, error, invalidSafeCapability, disableNotPermitted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDisableFeatureTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDisableFeature(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure disables a feature.
     *
     * Documented return codes: uninitialized, ok, error, illegalParam, noHeap, disableNotPermitted, disableEvaluationFeatureNotPermitted, invalidFeatureref. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDisableFeatureByRefTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDisableFeatureByRef(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure deletes the proxy and turns off flash cache volume attributes on the referenced user volume.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeNotExist, internalError, invalidVolumeref, notFlashcacheVol, flashcacheDeleted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDisableFlashCacheVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDisableFlashCacheVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will disable (stop) the indicated snapshot volume.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, internalError, invalidVolumeref, snapNotAvailable, notDisabled, repositoryOffline, ghostVolume, repositoryMissing, repositoryFailed, baseVolumeFailed, baseVolumeOffline. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDisableSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDisableSnapshot(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will disable (stop) each snapshot volume identified in the argument list. Validation checks for necessary snapshot-disable preconditions are performed prior to disabling any snapshot; if any of the requested snapshots do not meet the preconditions to be disabled, the entire command will be failed and no snapshots will be disabled. If command validation succeeds for all snapshots in the list, but one or more of the snapshots in the list fails to be disabled, the entire command will be failed and no snapshots will be disabled. Requests to disable an already-disabled Snapshot will be treated as no-ops and will be considered successful.
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, invalidVolumeref, snapNotAvailable, notDisabled, repositoryOffline, ghostVolume, repositoryMissing, repositoryFailed, baseVolumeFailed, baseVolumeOffline. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDisableSnapshotCollectionTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDisableSnapshotCollection(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Disables protection information (PI) usage for the specified volume.
     *
     * Documented return codes: ok, volumeHasSnapshotRelationship, volumeHasMirrorRelationship, volumeHasVolcopyRelationship. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDisableVolumeProtectionInformationTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolDisableVolumeProtectionInformation(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Returns a DiscoveryResponse object that identifies the storage arrays and controllers known to the RPC server that handles this request. Response also indicates if RPC server is RAID controller or SYMbol RPC UTM agent.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolDiscoverControllersTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DiscoveryResponse response = api.symbolDiscoverControllers(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
