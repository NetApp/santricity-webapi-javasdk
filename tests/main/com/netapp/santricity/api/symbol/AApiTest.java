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
* API tests for AApi
*/
public class AApiTest {
    private final AApi api = new AApi();
    
    /**
     * This procedure activates the collection of a set of statistics known as a \&quot;discrete time series\&quot; (discrete time) on each control of the array. A discrete time is a time-ordered sequence of observations of a single statistic, sampled at regular intervals.
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolActivateDiscreteTimeSeriesTest() throws ApiException {
        
        String systemId = null;
        
        DiscreteTimeSeriesDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        StatStreamIdReturned response = api.symbolActivateDiscreteTimeSeries(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will enable mirroring over Fibre Channel (setup dedicated channel).
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolActivateFibreChannelCheckPointBasedAsyncMirroringTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolActivateFibreChannelCheckPointBasedAsyncMirroring(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure activates a type of statistics stream known as a histogram on each controller of the array. A histogram is a set of observations of a single statistic, organized into categories based on user criteria, with observation counts per category identified.
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolActivateHistogramTest() throws ApiException {
        
        String systemId = null;
        
        HistogramDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        StatStreamIdReturned response = api.symbolActivateHistogram(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Activates an inactive host port.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolActivateHostPortTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolActivateHostPort(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Activates inactive iSCSI initiator.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolActivateInitiatorTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolActivateInitiator(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Activate Remote Mirroring
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, iconFailure, metadataVolNonexistent, rvmFeatureDisabled, maxMirrorsExceeded, rvmFibreError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolActivateMirroringTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolActivateMirroring(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Activate staged controller firmware
     *
     * Documented return codes: ok, error, busy, illegalParam, invalidRequest, voltransferError, downloadInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolActivateStagedControllerFirmwareTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolActivateStagedControllerFirmware(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will add a member to an Async Mirror Group on the primary array. This is step 1 of the add member process.
     *
     * Documented return codes: ok, invalidProtection, arvmGroupDoesNotExist, arvmGroupNotPrimary, arvmVolumeAlreadyInMirrorRelationship, arvmMemberLimitExceeded, incompatibleRepositorySecurity, arvmOrphanGroup, arvmRemoteMaxMirrorsPerArrayExceeded, remoteMaxTotalMirrorsPerArrayExceeded, remoteNoHeap, remoteInternalError, arvmRemoteGroupNotSecondary, arvmRemoteGroupDoesNotExist, remoteInvalidProtection, remoteDatabaseError, arvmRemoteThinNotSupported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAddAsyncMirrorGroupPrimaryMemberTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupAddPrimaryMemberDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAddAsyncMirrorGroupPrimaryMember(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will add a member to an Async Mirror Group on the secondary array. This is step 2 of the add member process.
     *
     * Documented return codes: ok, invalidProtection, invalidIncompleteMemberRef, arvmGroupNotSecondary, arvmInvalidMirrorState, arvmVolumeAlreadyInMirrorRelationship, incompatibleRepositorySecurity, incompatibleSecondarySecurity, arvmInvalidSecondaryCapacity, arvmOrphanGroup, remoteInternalError, remoteRvmSpmError, arvmRemoteMirrorMemberDoesNotExist, arvmRemoteGroupDoesNotExist, remoteDatabaseError, arvmIncorrectVolumeType, arvmThinVolInitError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAddAsyncMirrorGroupSecondaryMemberTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupAddSecondaryMemberDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAddAsyncMirrorGroupSecondaryMember(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure reconfigures the flash cache volume group to add additional drives.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotUnassigned, internalError, invalidVolumegroupref, invalidDriveref, invalidExpansionList, driveNotOptimal, duplicateDrives, numdrivesGroup, capacityConstrained, invalidDriveState, notFlashcacheVol, flashcacheDeleted, flashcacheMaxCapacityExceeded, flashcacheFailed, flashcacheDegradedState. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAddDrivesToFlashCacheTest() throws ApiException {
        
        String systemId = null;
        
        FlashCacheReconfigureDrivesDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAddDrivesToFlashCache(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will add a new member to a PiT consistency group (create a new PiT group for the member volume to add and add that PiT group to the consistency group). Returns the ref of the new PiT group created and added to the PCG.
     *
     * Documented return codes: ok, invalidProtection, invalidConcatVolMemberLabel, concatVolMemberTooSmall, maxConsistencyGroupMembersExceeded, consistencyGroupArvmBindingConflict, incompatibleRepositorySecurity, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAddPITConsistencyGroupMemberTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupAddMemberDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRefList response = api.symbolAddPITConsistencyGroupMember(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the controller to store some or all of the information contained in the PendingHost argument. The information is simply stored and made available for later retrieval (see getPendingHosts procedure); it is not incorporated into the configured topology, and it is not persisted to disk. If the controller determines that the pending definition is an exact match of configured topology elements, it does not store it. It bears pointing out that, for iSCSI, multiple ports belonging to the same initiator may be present in the pending host information - when this happens, the controller creates only a single initiator, no matter how many ports for that initiator are presented. No authentication is performed on this command.
     *
     * Documented return codes: ok, noHeap, internalError, invalidHosttypeString, invalidProtocol. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAddPendingHostTest() throws ApiException {
        
        String systemId = null;
        
        PendingHost body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAddPendingHost(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to add a known SNMP community string. SNMP GET/SET requests are only allowed for known communities.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAddSNMPCommunityTest() throws ApiException {
        
        String systemId = null;
        
        SNMPCommunityAddDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRefList response = api.symbolAddSNMPCommunity(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to add an SNMP trap destination.
     *
     * Documented return codes: ok, snmpIncompatibleIpv4Address, snmpIncompatibleIpv6Address. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAddSNMPTrapDestinationTest() throws ApiException {
        
        String systemId = null;
        
        SNMPTrapDestinationAddDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRefList response = api.symbolAddSNMPTrapDestination(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure caused the storage array to \&quot;adopt\&quot; all foreign drives that are eligible to be adopted. Adoption means accepting or incorporating elements of a foreign drive&#39;s configuration database into that of the recipient array. It must be possible for the storage array to match the adoption-candidate drives with ones that are currently being tracked as \&quot;not present.\&quot; In addition, several other technical criteria must be met in order for the adoption to succeed.
     *
     * Documented return codes: ok, error, noDrivesAdopted, someDrivesAdopted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAdoptAllDrivesTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAdoptAllDrives(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure caused the storage array to \&quot;adopt\&quot; a foreign drive that is eligible to be adopted. Adoption means accepting or incorporating elements of a foreign drive&#39;s configuration database into that of the recipient array. It must be possible for the storage array to match the adoption-candidate drive with one that is currently being tracked as \&quot;not present.\&quot; In addition, several other technical criteria must be met in order for the adoption to succeed.
     *
     * Documented return codes: ok, error. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAdoptDriveTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAdoptDrive(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will run an analysis on the metadata contained in a copy-on-write repository to identify possible causes for failure.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAnalyzeCopyOnWriteRepositoryTest() throws ApiException {
        
        String systemId = null;
        
        CoWRepositoryAnalysisRequest body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        CoWRepositoryAnalysisResultsReturned response = api.symbolAnalyzeCopyOnWriteRepository(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the storage array to be migrated from one feature bundle definition to another, as specified in the BundleKey argument.
     *
     * Documented return codes: error, illegalParam, tryAlternate, internalError, invalidSafeId, controllerInServiceMode, databaseError, invalidBundleKey. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolApplyBundleKeyTest() throws ApiException {
        
        String systemId = null;
        
        BundleKey body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolApplyBundleKey(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to instruct the controller to transfer ownership of a disk pool and its associated volumes to another controller.
     *
     * Documented return codes: ok, noHeap, notDualActive, tryAlternate, internalError, invalidRequest, iconFailure, cacheSyncFailure, invalidControllerref, invalidVolumegroupref, modesenseError, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAssignDiskPoolOwnershipTest() throws ApiException {
        
        String systemId = null;
        
        VolumeGroupOwnershipUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAssignDiskPoolOwnership(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the controller to automatically assign the specified number of drives as hot spares, in addition to any previously assigned hot spares.
     *
     * Documented return codes: ok, illegalParam, noHeap, noSparesAssigned, someSparesAssigned, tryAlternate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAssignDrivesAsHotSparesTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAssignDrivesAsHotSpares(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Instructs the SYMbol Server&#39;s controller to create hot spare drives out of the given drives.
     *
     * Documented return codes: ok, illegalParam, noHeap, noSparesAssigned, someSparesAssigned, tryAlternate, sparesSmallUnassigned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAssignSpecificDrivesAsHotSparesTest() throws ApiException {
        
        String systemId = null;
        
        DriveRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAssignSpecificDrivesAsHotSpares(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Instructs the SYMbol Server&#39;s controller to transfer ownership of a volume group and its associated volumes to another controller.
     *
     * Documented return codes: ok, noHeap, notDualActive, tryAlternate, internalError, invalidRequest, iconFailure, cacheSyncFailure, invalidControllerref, invalidVolumegroupref, modesenseError, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAssignVolumeGroupOwnershipTest() throws ApiException {
        
        String systemId = null;
        
        VolumeGroupOwnershipUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAssignVolumeGroupOwnership(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Instructs the SYMbol Server&#39;s controller to transfer ownership of a volume to another controller.
     *
     * Documented return codes: ok, illegalParam, noHeap, notDualActive, tryAlternate, internalError, invalidControllerref, invalidVolumeref, modesenseError, ghostVolume, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAssignVolumeOwnershipTest() throws ApiException {
        
        String systemId = null;
        
        VolumeOwnershipUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAssignVolumeOwnership(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Automatically assign hot spares
     *
     * Documented return codes: ok, noHeap, noSparesAssigned, someSparesAssigned, noSparesNeeded. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAutoAssignHotSparesTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAutoAssignHotSpares(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure requests an on-demand volume ownership redistribution for load balancing purposes.
     *
     * Documented return codes: ok, autoLoadBalanceUserDisabled, autoLoadBalanceInsufficientStatistics. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAutoLoadBalanceRequestTest() throws ApiException {
        
        String systemId = null;
        
        AutoLoadBalanceRequestDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAutoLoadBalanceRequest(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Tells the controller to automatically configure the Storage Array.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolAutoSAConfigurationTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolAutoSAConfiguration(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
