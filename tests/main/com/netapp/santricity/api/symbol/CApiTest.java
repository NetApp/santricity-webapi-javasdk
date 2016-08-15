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
* API tests for CApi
*/
public class CApiTest {
    private final CApi api = new CApi();
    
    /**
     * Calculates the volume&#39;s maximum capacity after a DVE operation
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCalculateDVECapacityTest() throws ApiException {
        
        String systemId = null;
        
        VolumeExpansionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        Long response = api.symbolCalculateDVECapacity(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to cancel an Async Mirror Group role change operation.
     *
     * Documented return codes: ok, remoteInternalError, arvmRemoteGroupDoesNotExist, remoteDatabaseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelAsyncMirrorGroupRoleChangeTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupRoleChangeCancelDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelAsyncMirrorGroupRoleChange(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Cancels a running base controller diagnostic test and returns the test status.
     *
     * Documented return codes: ok, authFailParam, diagNotRunning. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelBaseControllerDiagnosticTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FruDiagReturn response = api.symbolCancelBaseControllerDiagnostic(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Cancels a running cache backup device diagnostic test and returns the test status.
     *
     * Documented return codes: ok, authFailParam, diagNotRunning. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelCacheBackupDeviceDiagnosticTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FruDiagReturn response = api.symbolCancelCacheBackupDeviceDiagnostic(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Cancels a running cache memory diagnostic test and returns the test status.
     *
     * Documented return codes: ok, authFailParam, diagNotRunning. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelCacheMemoryDiagnosticTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FruDiagReturn response = api.symbolCancelCacheMemoryDiagnostic(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to cancel stable store database recovery.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelDatabaseRecoveryModeTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelDatabaseRecoveryMode(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This command cancels an evacuation on the referenced drive.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, tryAlternate, internalError, invalidDriveref, noEvacFound. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelEvacuationTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelEvacuation(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Cancels a running host card diagnostic test and returns the test status
     *
     * Documented return codes: ok, authFailParam, diagNotRunning. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelHostCardDiagnosticTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FruDiagReturn response = api.symbolCancelHostCardDiagnostic(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure indicates to the storage array firmware that the client does not want to proceed with a volume group import operation, and therefore the firmware may spin down the drives that were spun up by the get- ImportDependencies procedure.
     *
     * Documented return codes: ok, volumeGroupStateNotValid. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelImportTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelImport(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will cancel a rollback on the specified PiT.
     *
     * Documented return codes: ok, repositoryOffline, invalidPitRef. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelPITRollbackTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelPITRollback(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure cancels a Pending PiT Creation for a PiT Consistency Group.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelPendingCGPITCreationTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelPendingCGPITCreation(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure cancels a Pending PiT Creation for a PiT Group. This returns the pending PiT creation state back to \&quot;none\&quot; from either \&quot;waiting\&quot; or \&quot;failed\&quot;.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelPendingPITCreationTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelPendingPITCreation(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure cancels a raw data restore operation.
     *
     * Documented return codes: ok, rawdataTransferNotStarted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelRawDataRestoreTest() throws ApiException {
        
        String systemId = null;
        
        RawDataTransferCancelDesc body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelRawDataRestore(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure cancels a raw data retrieve operation.
     *
     * Documented return codes: ok, rawdataTransferNotStarted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelRawDataRetrieveTest() throws ApiException {
        
        String systemId = null;
        
        RawDataTransferCancelDesc body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelRawDataRetrieve(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to cancel a snapshot rollback operation.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCancelSnapshotRollbackTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCancelSnapshotRollback(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will change roles on an Async Mirror Group.
     *
     * Documented return codes: ok, rollbackInProgress, arvmGroupHasIncompleteMember, arvmOrphanGroup, remoteInternalError, arvmRemoteGroupNotSecondary, arvmRemoteGroupDoesNotExist, remoteDatabaseError, arvmExpansionSynchronizationInProgress, arvmRoleChangePending, arvmRoleChangeInProgress, arvmMemberStopped. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolChangeAsyncMirrorGroupRoleTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupRoleChangeDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolChangeAsyncMirrorGroupRole(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Change mirror write mode
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, iconFailure, invalidVolumeref, ghostVolume, invalidMirrorvol, rvmVersionMismatch, rvmOperNotAllowedOnSec, legacyRvmAsyncModeUnsupported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolChangeMirrorWriteModeTest() throws ApiException {
        
        String systemId = null;
        
        MirrorWriteModeDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolChangeMirrorWriteMode(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Change MirrorProxy Synchronization Priority
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, iconFailure, invalidVolumeref, ghostVolume, invalidMirrorvol. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolChangeSynchronizationPriorityTest() throws ApiException {
        
        String systemId = null;
        
        MirrorSyncPriorityDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolChangeSynchronizationPriority(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will clear a recovery failure posted for a given Async Mirror Group (AMG). Since some AMG needs attention / recovery failure conditions are \&quot;sticky\&quot; the user has to acknowledge the condition before it is cleared.
     *
     * Documented return codes: ok, arvmOrphanGroup, arvmOrphanMember, faultConditionStillExists. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearAsyncMirrorGroupFaultIndicationTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupFaultIndicationClearDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearAsyncMirrorGroupFaultIndication(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will clear a recovery failure posted for a given Async Mirror Group member. Since some mirror member needs attention / recovery failure conditions are \&quot;sticky\&quot; the user has to acknowledge the condition before it is cleared.
     *
     * Documented return codes: ok, faultConditionStillExists. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearAsyncMirrorGroupMemberFaultIndicationTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupMemberFaultIndicationClearDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearAsyncMirrorGroupMemberFaultIndication(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to clear the flag indicating that a DPL core dump needs to be retrieved without offloading it. Otherwise, the available DPL core dump will remain in controller memory until overwritten by a new DPL core dump.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearDPLCoreDumpNeedsRetrievedTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearDPLCoreDumpNeedsRetrieved(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure clears the Needs Attention signifying the availability of diagnostic data. The client must specify a correct tag. This procedure does not clears the DDC logs in the controller.
     *
     * Documented return codes: ok, ddcUnavail, invalidDdcTag. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearDdcNeedsAttentionTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearDdcNeedsAttention(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Clear the drive channel cumulative statistic information
     *
     * Documented return codes: ok, error. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearDriveChannelStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearDriveChannelStatistics(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure clears registrations and reservations for specific volumes. A UNIT ATTENTION, RESERVATIONS PREEMPTED condition is established for the former registrants.
     *
     * Documented return codes: ok, noHeap, regDeleteFailed, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearPersistentRegistrationsTest() throws ApiException {
        
        String systemId = null;
        
        AbstractVolRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearPersistentRegistrations(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Causes the entire configuration of the storage array to be cleared to an initial state.
     *
     * Documented return codes: ok, error, volumeReconfiguring, tryAlternate, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearSAConfigurationTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearSAConfiguration(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Clears SAS PHY error statistics for SAS I/O controller and expander devices in the array
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearSasErrorStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearSasErrorStatistics(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Set SOC error statistics baseline information
     *
     * Documented return codes: ok, tryAlternate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearSocErrorStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearSocErrorStatistics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Clears all the unreadable sectors for the given Volume
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, invalidVolumeref, volumeOffline, usmClearFailed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolClearUnreadableSectorsTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolClearUnreadableSectors(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Sending an RVM Communication Check command
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, invalidVolumeref, ghostVolume, rvmCommStatRecoveredTimeout, rvmCommStatRecoveredDelay, rvmCommStatNotReady, rvmCommStatTimeout, rvmCommStatChannelFailure, rvmCommStatNetworkFailure, rvmCommStatDeviceMissing, rvmCommStatLoginRejected, rvmCommStatLoginFailure, rvmCommStatInvNumSamplesReqd, rvmQuiescenceInProgress, rvmInvalidRemotevol. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCommunicationCheckTest() throws ApiException {
        
        String systemId = null;
        
        RemoteCommunicationCheckDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        RemoteCommunicationCheckSampleList response = api.symbolCommunicationCheck(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is subject to SYMbol authentication.
     *
     * Documented return codes: ok, noHeap, internalError, hosttypeConflict, portConflict, invalidHosttypeString, invalidProtocol, portRemoved, initiatorConflict, initiatorRemoved. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolConfigurePendingHostTest() throws ApiException {
        
        String systemId = null;
        
        PendingHost body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolConfigurePendingHost(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is called once to restore each chunk of data, after first calling a startRawDataRestore to notify the controller that it needs to prepare for the restore. On the first call to this procedure, a return code of RETCODE_RAWDATA_TRANSFER_PREPARING indicates that the controller has not completed the preparation, and the first call should be retried. Upon successful completion of the first call (RETCODE_OK), subsequent calls should be made to transfer additional chunks of data, incrementing the sequence number by one for each call.
     *
     * Documented return codes: ok, invalidFile, flashError, invalidTotalsize, rawdataTransferNotStarted, rawdataTransferPreparing, rawdataTransferReadError, rawdataTransferInvalidImage, rawdataTransferCrcError, dbmRestoreWriteError, rawdataBadSeqNum, dbmDbSourceUnavailable, dbmRestoreSourceMismatch. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolContinueRawDataRestoreTest() throws ApiException {
        
        String systemId = null;
        
        RawDataRestoreContinueDesc body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        RawDataRestoreResult response = api.symbolContinueRawDataRestore(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is called for each chunk of raw data to be transferred to the host. The first call must be preceded by a call to startRawDataRetrieve().
     *
     * Documented return codes: ok, noHeap, invalidFile, flashError, invalidControllerref, invalidTotalsize, rawdataTransferBadType, rawdataTransferNotStarted, rawdataTransferReadError, rawdataBadSeqNum, rawdataTransferUserCancelled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolContinueRawDataRetrieveTest() throws ApiException {
        
        String systemId = null;
        
        RawDataRetrieveContinueDesc body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        RawDataRetrieveResult response = api.symbolContinueRawDataRetrieve(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will convert a read-only view to a read-write view.
     *
     * Documented return codes: ok, viewStopped. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolConvertReadOnlyPITViewToReadWriteTest() throws ApiException {
        
        String systemId = null;
        
        PITViewRWConversionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolConvertReadOnlyPITViewToReadWrite(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will convert all snapshots of a given base volume to PiT groups.
     *
     * Documented return codes: ok, notDisabled, volumeHasVolcopyRelationship, snapConversionTooManySnaps, snapConversionMissingLabel. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolConvertSnapshotsToPITGroupsTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotConversionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolConvertSnapshotsToPITGroups(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure triggers the copy of an assigned volume group drive to a standby hot spare. Upon successful completion of the copy, the assigned drive is failed and the hot spare becomes an active drive in the volume group, sparing for the failed drive.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, tryAlternate, internalError, invalidDriveref, invalidRaidlevel, driveNotOptimal, noVolumes, volumeGroupNotExist, volumeGroupReconfiguring, volumeGroupStateNotValid, volumeGroupNotConfigurable, invalidDriveState, volumeGroupReconstructing, volumeGroupUndergoingCopyback, volumeGroupHasNonOptimalVols, drivesNotAvailableForRemoval, evacInProgress, noHotspareAvailable, driveServiceInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCopyDriveThenFailTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCopyDriveThenFail(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This command will trigger an evacuation from an assigned volume group drive to an unassigned drive and replace the original drive in the volume group with the new one.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, tryAlternate, internalError, invalidDriveref, invalidRaidlevel, driveNotOptimal, noVolumes, volumeGroupNotExist, volumeGroupReconfiguring, volumeGroupStateNotValid, volumeGroupNotConfigurable, invalidDriveState, volumeGroupReconstructing, volumeGroupUndergoingCopyback, volumeGroupHasNonOptimalVols, drivesNotAvailableForRemoval, evacInProgress, driveServiceInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCopyDriveThenReplaceTest() throws ApiException {
        
        String systemId = null;
        
        CopyThenReplaceDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCopyDriveThenReplace(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure creates a new host port having the attributes specified in the input argument. It is a replacement for the deprecated createHostPort procedure.
     *
     * Documented return codes: ok, noHeap, partDupId, partLabelInvalid, partNodeNonexistent, requestFailedDueToPiRestrictions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateAHostPortTest() throws ApiException {
        
        String systemId = null;
        
        HostPortCreateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        InstanceReturned response = api.symbolCreateAHostPort(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will create an Async Mirror Group (AMG).
     *
     * Documented return codes: ok, invalidWarnThreshold, arvmGroupUserLabelExists, remoteTargetNotFound, arvmFeatureDeactivated, mirrorProtocolMismatch, invalidSyncPriority, invalidRecoveryPointAlertThreshold, invalidSyncAlertThreshold, remoteArvmFeatureDeactivated, remoteArvmFeatureDisabled, arvmRemoteMaxAsyncMirrorGroupsExceeded, arvmInvalidSyncInterval, remoteNoHeap, remoteInternalError, arvmRemoteGroupUserLabelExists, remoteDatabaseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateAsyncMirrorGroupTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateAsyncMirrorGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create automatic configuration
     *
     * Documented return codes: tryAlternate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateAutoConfigTest() throws ApiException {
        
        String systemId = null;
        
        AutoConfigCandidateList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateAutoConfig(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will create a new PiT in a consistency group (a PiT of all members in the group).
     *
     * Documented return codes: ok, pitCreatePending, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateCGPITTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRefList response = api.symbolCreateCGPIT(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes a new Cluster object to be created and assigned the specified label. After creating a cluster, hosts can be added to it, mappings established, etc.
     *
     * Documented return codes: ok, noHeap, partDupId, partLabelInvalid. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateClusterTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolCreateCluster(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to create an empty disk pool.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, internalError, invalidLabel, prohibitedByMdtRestrictions, invalidDriveState, raid6FeatureUnsupported, raid6FeatureDisabled, invalidSecurity, noFdeDrives, invalidCriticalThreshold, exceedDiskPoolLimit, exceedDiskPoolCapacity, exceedMaxVolumeCapacity. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateDiskPoolTest() throws ApiException {
        
        String systemId = null;
        
        DiskPoolCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateDiskPool(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure creates a Volume Group and two RAID Volumes to be used for flash cache. Uses the VolumeCandidate for the RAID Volume creation and assigns labels as given. The capacity in the VolumeCandidate is split between the two RAID Volumes. A High Level Volume is also created to reference the RAID Volumes.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, driveNotUnassigned, internalError, invalidLabel, maxVolumesExceeded, numVolumesGroup, driveTypeMismatch, flashcacheAlreadyExists, flashcacheFeatureDisabled, flashcacheMaxCapacityExceeded, flashcacheMaxLimitExceeded, flashCacheFdeEnablementDisallowed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateFlashCacheTest() throws ApiException {
        
        String systemId = null;
        
        FlashCacheCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateFlashCache(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure creates a zero size FlashCache for performing analytics. It creates a flashcache with no repository to allow collection of projected cache hits during I/O.
     *
     * Documented return codes: ok, error, illegalParam, internalError, invalidLabel, flashcacheAlreadyExists. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateFlashCacheAnalyticsTest() throws ApiException {
        
        String systemId = null;
        
        FlashCacheAnalyticsCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateFlashCacheAnalytics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes a new Host object to be created using the parameters in the creation descriptor argument. After creating a host, host ports can be added to it, mappings established, etc.
     *
     * Documented return codes: ok, noHeap, partDupId, partLabelInvalid, partNodeNonexistent, partLunCollision. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateHostTest() throws ApiException {
        
        String systemId = null;
        
        HostCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolCreateHost(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes a new HostPort object to be created using the parameters in the creation descriptor argument. After creating a host, host ports can be added to it, mappings established, etc. This procedure does not work for iSCSI.
     *
     * Documented return codes: ok, noHeap, partDupId, partLabelInvalid, partNodeNonexistent, requestFailedDueToPiRestrictions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateHostPortTest() throws ApiException {
        
        String systemId = null;
        
        HostPortCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolCreateHostPort(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure creates a new initiator object.
     *
     * Documented return codes: ok, requestFailedDueToPiRestrictions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateInitiatorTest() throws ApiException {
        
        String systemId = null;
        
        InitiatorCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        InstanceReturned response = api.symbolCreateInitiator(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is utilized to add new key-value tags to the persistent memory so they can be used for application awareness.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateKeyValueTagTest() throws ApiException {
        
        String systemId = null;
        
        KeyValueTagCreationDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRefList response = api.symbolCreateKeyValueTag(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes a new LUNMapping object to be created using the parameters in the creation descriptor argument. Once this mapping is created, it provides a new LUN-to-volume mapping for I/O accesses from the specified entities to a given volume.
     *
     * Documented return codes: ok, noHeap, partVolumeNonexistent, partLunCollision, partMappingNonexistent, partNoHostports, partIsUtmLun, tooManyPartitions, ghostVolume, cannotMapVolume, partPiIncapable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateLUNMappingTest() throws ApiException {
        
        String systemId = null;
        
        LUNMappingCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolCreateLUNMapping(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure creates a new lock key for the array, but does not commit the key to the drives. There must be at least one FDE capable drive present on the array.
     *
     * Documented return codes: ok, noFdeDrives, rekeyInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateLockKeyTest() throws ApiException {
        
        String systemId = null;
        
        KeyIDInfo body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        WrappedLockKeyReturn response = api.symbolCreateLockKey(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a metadata volume
     *
     * Documented return codes: raid6FeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateMetadataVolumeTest() throws ApiException {
        
        String systemId = null;
        
        MetadataVolCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateMetadataVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a Mirror
     *
     * Documented return codes: ok, illegalParam, noHeap, volumeNotExist, tryAlternate, internalError, iconFailure, invalidVolumeref, ghostVolume, metadataVolNonexistent, rvmFeatureDisabled, maxMirrorsExceeded, invalidMirrorCandidateVol, remoteMaxMirrorsExceeded, remoteRvmFeatureDisabled, remoteMetadataVolNonexistent, remoteInvalidCfgGen, rvmSpmError, remoteAuthFailPassword, rvmVersionMismatch, rvmRemoteArrayError, rvmCommunicationError, mirrorProtocolMismatch, remoteMaxTotalMirrorsPerArrayExceeded, legacyRvmAsyncModeUnsupported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateMirrorTest() throws ApiException {
        
        String systemId = null;
        
        MirrorCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateMirror(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will create a new PiT in one or more existing PiT Group(s). Max list size is 64 PiT Groups.
     *
     * Documented return codes: ok, invalidPitGroupRef, maxPitsPerGroupExceeded, maxPitsExceeded, pitGroupInConsistencyGroup, alternateRequiredForOperation, pitCreatePending, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreatePITTest() throws ApiException {
        
        String systemId = null;
        
        PITGroupRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRefList response = api.symbolCreatePIT(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will create a new PiT consistency group.
     *
     * Documented return codes: ok, invalidRollbackPriority, invalidWarnThreshold, invalidPitConsistencyGroupLabel, invalidPitAutoDeleteLimit, invalidPitRepositoryFullPolicy, maxConsistencyGroupsExceeded, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreatePITConsistencyGroupTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolCreatePITConsistencyGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will create a View on the specified PiTs in a Consistency Group.
     *
     * Documented return codes: ok, incompatibleMemberVol, alternateRequiredForOperation, mustSpecifyExistingVolumes, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreatePITConsistencyGroupViewTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupViewCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolCreatePITConsistencyGroupView(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will create a new PiT Group.
     *
     * Documented return codes: ok, invalidBasevol, invalidRollbackPriority, invalidWarnThreshold, baseVolumeFailed, invalidProtection, invalidPitGroupLabel, invalidPitAutoDeleteLimit, invalidPitRepositoryFullPolicy, invalidConcatVolMemberLabel, concatVolMemberTooSmall, maxPitGroupsPerBaseExceeded, maxPitGroupsExceeded, incompatibleMemberVol, incompatibleRepositorySecurity, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreatePITGroupTest() throws ApiException {
        
        String systemId = null;
        
        PITGroupCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolCreatePITGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will create a new PiT View.
     *
     * Documented return codes: ok, invalidWarnThreshold, invalidProtection, invalidConcatVolMemberLabel, concatVolMemberTooSmall, invalidPitRef, maxViewsPerPitExceeded, maxViewsExceeded, maxMappableVolumesExceeded, pitInConsistencyGroup, incompatibleMemberVol, incompatibleRepositorySecurity, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreatePITViewTest() throws ApiException {
        
        String systemId = null;
        
        PITViewCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolCreatePITView(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Creates a new SAPortGroup &amp; returns its ref. If a group by that name already exists, returns its ref.. OBSOLETE: Any call to createSAPortGroup will get a return status indicating the command is obsolete. No alternative procedure is available.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateSAPortGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolCreateSAPortGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to create a list of schedules.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateScheduleListTest() throws ApiException {
        
        String systemId = null;
        
        ScheduleCreationDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRefList response = api.symbolCreateScheduleList(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a snapshot volume of a given base.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, driveNotUnassigned, tryAlternate, maxVolumesExceeded, partitionsDisabled, maxSnapsPerBaseExceeded, maxSnapsExceeded, invalidBasevol, snapshotFeatureDisabled, numVolumesGroup, ghostVolume, invalidRepositoryLabel, invalidSnapLabel, invalidWarnThreshold, repositoryTooSmall, baseVolumeFailed, baseVolumeOffline, baseVolumeFormatting, raid6FeatureUnsupported, raid6FeatureDisabled, invalidProtection. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateSnapshot(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure creates a new Thin Provisioned Volume.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeNotExist, internalError, invalidVolumeref, invalidLabel, maxVolumesExceeded, invalidWarnThreshold, repositoryTooSmall, invalidConcatVolMemberLabel, illegalVolume, invalidRepositoryCapacity, invalidProvisionedCapacityQuota, invalidExpansionPolicy, invalidVirtualCapacity, maxThinVolumesExceeded. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateThinVolumeTest() throws ApiException {
        
        String systemId = null;
        
        ThinVolumeCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateThinVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes a new volume to be created based on parameters provided by the caller in the argument structure. Note that a key parameter is a VolumeCandidate object that was previously returned by the controller as the result of a getVolumeCandidates operation. The user must select one such candidate, and then supply further information about the desired attributes of the volume when calling this procedure.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, driveNotUnassigned, tryAlternate, invalidSegmentsize, invalidLabel, maxVolumesExceeded, cannotFormatVolume, controllerInServiceMode, volumeGroupReconstructing, volumeGroupUndergoingCopyback, raid6FeatureUnsupported, raid6FeatureDisabled, invalidSecurity, noFdeDrives, volumeGroupSecure. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateVolumeTest() throws ApiException {
        
        String systemId = null;
        
        VolumeCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create an empty VolumeGroup
     *
     * Documented return codes: ok, invalidSecurity, noFdeDrives. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateVolumeGroupTest() throws ApiException {
        
        String systemId = null;
        
        VolumeGroupCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateVolumeGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is utilized to add new application awareness workloads to persistent memory. The workload objects are created but do not as yet have Key-Value Tags associated to them. That requires calling the setKeyValueTagMapping procedure.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateWorkloadTest() throws ApiException {
        
        String systemId = null;
        
        WorkloadCreationDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRefList response = api.symbolCreateWorkload(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure creates the mappings between the list of workloads and volumes specified by the input descriptor.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolCreateWorkloadVolumeMappingTest() throws ApiException {
        
        String systemId = null;
        
        WorkloadVolumeCreateMappingDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolCreateWorkloadVolumeMapping(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
