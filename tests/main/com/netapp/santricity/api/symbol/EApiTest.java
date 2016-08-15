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
* API tests for EApi
*/
public class EApiTest {
    private final EApi api = new EApi();
    
    /**
     * This procedure is used to enable Autosupport.
     *
     * Documented return codes: ok, notImplemented. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolEnableASUPTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolEnableASUP(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Enables external KMS.
     *
     * Documented return codes: ok, externalKmsEnabled, externalKmsFailed, externalKmsNotCompliant, externalKmsTimeout. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolEnableExternalKMSTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        WrappedLockKeyReturn response = api.symbolEnableExternalKMS(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the \&quot;premium\&quot; features identified in the feature keys of the argument to be enabled.
     *
     * Documented return codes: ok, error, invalidSafeId, invalidSafeKey, invalidSafeCapability, invalidSafeVersion, perfTierSafeUpgradeDisabled, safeControllerNotSubjectToRaid6, premiumFeatureLimitExceedsMaximum, previouslyEnabledForEval, featureNotKeyable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolEnableFeatureTest() throws ApiException {
        
        String systemId = null;
        
        FeatureKey body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolEnableFeature(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Used to start an evaluation of a specified feature using the duration specified for the sub-model ID in the FBDT.
     *
     * Documented return codes: ok, noHeap, invalidSafeCapability, previouslyEnabledForEval, evalNotSupported, invalidCapability. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolEnableFeatureEvaluationTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolEnableFeatureEvaluation(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure creates a flash cache proxy linked to the referenced user RAID Volume and the flash cache High Level Volume. The flash cache attribute on the RAID Volume will be turned on.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeNotExist, volumeReconfiguring, tryAlternate, internalError, volumeFormatting, invalidVolumeref, volumeOffline, notFlashcacheVol, flashcacheDeleted, flashCacheInvalidBaseVol. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolEnableFlashCacheVolumeTest() throws ApiException {
        
        String systemId = null;
        
        VolumeFlashCacheDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolEnableFlashCacheVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure establishes a volume copy.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, internalError, iconFailure, invalidCopyPriority, copyIncompatibleSource, copyIncompatibleTarget, copyGhostSource, copyGhostTarget, copyInvalidSourceRef, copyInvalidTargetRef, copyInvalidSourceState, copyInvalidTargetState, copySourceReconfig, copyTargetReconfig, copyTargetTooSmall, copyTargetLimit, maxVolumeCopysExceeded, copySourceReservation, copySourceFormat, copyTargetFormat, volcopyFeatureDisabled, copySourceZeroCapacity, copyApptagMismatch. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolEstablishVolumeCopyTest() throws ApiException {
        
        String systemId = null;
        
        VolumeCopyCreationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolEstablishVolumeCopy(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will return the amount of repository capacity necessary to perform a rollback operation.
     *
     * Documented return codes: ok, invalidPitRef. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolEstimatePITRollbackRepositoryUtilizationTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        PITGroupRollbackUtilizationEstimateReturned response = api.symbolEstimatePITRollbackRepositoryUtilization(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will expand a concatenated volume by adding another member RAID volume. Returns the ref for the new ConcatVolMember added.
     *
     * Documented return codes: ok, invalidProtection, invalidConcatVolMemberLabel, concatVolMemberTooSmall, concatMemberLimitExceeded, invalidMemberVol, memberVolMapped, invalidMemberVolState, incompatibleMemberVol, concatVolumeFailed, cannotExpandConcatMember, repositoryFull, insufficientExpansionSpace, invalidExpansionSize, incompatibleRepositorySecurity. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolExpandConcatVolumeTest() throws ApiException {
        
        String systemId = null;
        
        ConcatVolumeExpansionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolExpandConcatVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will expand a thin volume&#39;s virtual capacity. It does not affect the repository volume&#39;s capacity.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, tryAlternate, internalError, invalidVolumeref, illegalVolume, invalidVirtualCapacity. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolExpandThinVolumeVirtualCapacityTest() throws ApiException {
        
        String systemId = null;
        
        ThinVolumeExpansionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolExpandThinVolumeVirtualCapacity(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the WrappedLockKeyReturn union for the array.The WrappedLockKeyReturn contains the WrappedLockKey structure for the array it was exported from.
     *
     * No return codes have been documented for this API!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolExportLockKeyTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        WrappedLockKeyReturn response = api.symbolExportLockKey(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure places the identified volume group in an \&quot;exported\&quot; state so that its drives may be removed and installed into another array.
     *
     * Documented return codes: ok, volumeGroupHasHotspare, volumeGroupReconfiguring, volumeGroupReconstructing, volumeGroupNotComplete, volumeGroupHasFailedDrives, volumeGroupHasNonOptimalVols, volumeGroupHasMirrorRelationship, volumeGroupHasVolcopyRelationship, volumeGroupHasMirroringMetadata, volumeGroupHasMappedVols, volumeGroupHasReservations, volumeGroupHasIncompatibleDacstores, volumeLimitExceeded, volumeGroupHasUnknownRaidLevel, volumeGroupHasUnsupportedRaidLevel, volumeGroupHasCloneOpportunity, volumeGroupHasInsufficientDrives, volumeGroupHasFailedVols, volumeGroupHasSnapshotRelationship, noNativeSstor, volumeInitializing, exportingDrivesDatabaseResynchronizing, exportingDrivesDatabaseFailed, volumeGroupHasArvmRelationship, volumeGroupHasPitgroupRelationship, volumeGroupHasPitviewRelationship, volumeGroupHasConcatRelationship. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolExportVolumeGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolExportVolumeGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Used to re-key the array with a new lock key.
     *
     * Documented return codes: ok, externalKmsFailed, externalKmsNotEnabled, externalKmsNotCompliant, externalKmsTimeout. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolExternalKMSReKeyTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        WrappedLockKeyReturn response = api.symbolExternalKMSReKey(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
