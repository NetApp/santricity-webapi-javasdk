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
* API tests for SApi
*/
public class SApiTest {
    private final SApi api = new SApi();
    
    /**
     * This procedure causes a scan of the specified volume over the specified extent. The scan stops on any media or parity error encountered and reports the error. The procedure can also be used to repair media errors and parity errors.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, invalidVolumeref, volumeOffline, volumeNotOptimal, parityScanFailed, parityRepairFailed, mediaRepairFailed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolScanVolumeTest() throws ApiException {
        
        String systemId = null;
        
        VolumeScanDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ParityScanResponse response = api.symbolScanVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure converts the specified disk pool to a secure volume group.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSecureDiskPoolTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSecureDiskPool(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure converts the specified volume group to a secure volume group.
     *
     * Documented return codes: ok, notImplemented, invalidVolumegroupref, volsInVgUsingNonSecureCapableFlashcache, volsInVgUsingSecureDisabledFlashcache. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSecureVolumeGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSecureVolumeGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sends chunks to the parallel drive firmware download process.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, invalidRequest, invalidOffset, overrun, invalidChunksize, invalidSetid, validationError, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSendDriveFirmwareTest() throws ApiException {
        
        String systemId = null;
        
        DriveFirmwareChunkDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSendDriveFirmware(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the allowed alarm controls.
     *
     * Documented return codes: ok, error, illegalParam. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetAlarmTest() throws ApiException {
        
        String systemId = null;
        
        AlarmUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetAlarm(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to set the current Autosupport status values.
     *
     * Documented return codes: ok, notImplemented. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetAsupStatusTest() throws ApiException {
        
        String systemId = null;
        
        AsupStatus body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetAsupStatus(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will change the parameters of an Async Mirror Group.
     *
     * Documented return codes: ok, invalidWarnThreshold, arvmGroupUserLabelExists, arvmGroupHasIncompleteMember, invalidSyncPriority, invalidRecoveryPointAlertThreshold, invalidSyncAlertThreshold, arvmOrphanGroup, arvmOrphanMember, arvmInvalidSyncInterval, remoteInternalError, arvmRemoteGroupUserLabelExists, arvmRemoteGroupDoesNotExist, remoteDatabaseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetAsyncMirrorGroupParamsTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetAsyncMirrorGroupParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure enables or disables the auto load balancing capability on this array.
     *
     * Documented return codes: ok, noHeap, databaseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetAutoLoadBalancingTest() throws ApiException {
        
        String systemId = null;
        
        AutoLoadBalancingControlDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetAutoLoadBalancing(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the allowable options for the auto resynchronization.
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, iconFailure, invalidVolumeref, ghostVolume, invalidMirrorvol, rvmVersionMismatch, rvmOperNotAllowedOnSec. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetAutoResyncTest() throws ApiException {
        
        String systemId = null;
        
        MirrorAutoResyncDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetAutoResync(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the battery parameters for the given battery.
     *
     * Documented return codes: ok, illegalParam, noHeap, volumeNotExist, tryAlternate, internalError, noVolumes. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetBatteryParamsTest() throws ApiException {
        
        String systemId = null;
        
        BatteryParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetBatteryParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure allows checking of protection information of cache mirroring to be enabled or disabled, if this feature is supported. There is a capability enumeration that indicates whether or not this feature is supported.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetCacheMirroringProtectionInformationTest() throws ApiException {
        
        String systemId = null;
        
        CacheMirroringProtectionInformationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetCacheMirroringProtectionInformation(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure allows the user to limit the performance of a host cluster. The limitations that can be set are throughput (MB/s) and IOPs.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetClusterPerformanceLimitationValuesTest() throws ApiException {
        
        String systemId = null;
        
        ClusterPerformanceLimitationValuesDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetClusterPerformanceLimitationValues(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to modify a portion of the controller&#39;s NVSRAM. Note that the NVSRAM data is changed only on the controller to which this request is directed.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, nvramError, invalidRegionid. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetControllerNVSRAMTest() throws ApiException {
        
        String systemId = null;
        
        NVSRAMUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetControllerNVSRAM(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure places a controller in Service Mode. It replaces the obsolete setControllerToPassive procedure. The command is serviced by the controller opposite to controllerRef.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, modesenseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetControllerServiceModeTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetControllerServiceMode(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure allows the client to set the clock of the controller to the specified value. Note that the clock value is only set on the controller to which this request is directed. If the client wishes to set the clock value on each controller, then an independent request of this form should be directed to each controller.
     *
     * Documented return codes: ok, illegalParam. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetControllerTimeTest() throws ApiException {
        
        String systemId = null;
        
        Long body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetControllerTime(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the specified controller to be transitioned into the active state. If the controller was previously active, no visible changes will occur as a result of this operation. If it was previously passive or in service mode, it will be made active. After this transition occurs, it will be possible to assign ownership of volume groups to the controller so that it may participate in standard I/O operations.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, internalError, invalidRequest, iconFailure, cacheSyncFailure, invalidControllerref, modesenseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetControllerToActiveTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetControllerToActive(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure marks the specified controller as being failed. Furthermore, the alternate of the specified controller will force the failed controller into a reset state (if possible).
     *
     * Documented return codes: ok, error, illegalParam, noHeap, tryAlternate, internalError, invalidRequest, iconFailure, cacheSyncFailure, invalidControllerref, modesenseError, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetControllerToFailedTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetControllerToFailed(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the specified controller&#39;s state to be set to optimal. If the controller was previously in the failed state, it will be reactivated. If necessary, the alternate controller will also remove any forced reset signal being applied to the specified controller.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, internalError, invalidRequest, iconFailure, cacheSyncFailure, invalidControllerref, modesenseError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetControllerToOptimalTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetControllerToOptimal(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the specified controller to be transitioned to the passive state. All volume groups owned by the controller will be transitioned to the alternate controller, which remains in the active state.
     *
     * Documented return codes: obsolete. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetControllerToPassiveTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetControllerToPassive(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will set the Disk Pool Reconstruction and Background Operation priorities.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDiskPoolPriorityTest() throws ApiException {
        
        String systemId = null;
        
        DiskPoolPriorityUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDiskPoolPriority(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will set the Disk Pool Reserved Drive Count value.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDiskPoolReservedDriveCountTest() throws ApiException {
        
        String systemId = null;
        
        DiskPoolReservedDriveCountUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDiskPoolReservedDriveCount(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will set the Disk Pool Utilization Threshold values.
     *
     * Documented return codes: ok, invalidCriticalThreshold. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDiskPoolThresholdTest() throws ApiException {
        
        String systemId = null;
        
        DiskPoolThresholdUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDiskPoolThreshold(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure forces the Disk Pool to a complete (optimal) state. This may be necessary if a drive is missing and the drive is not going to be replaced.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDiskPoolToCompleteTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDiskPoolToComplete(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to set the user assigned label for the disk pool.
     *
     * Documented return codes: ok, illegalParam. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDiskPoolUserLabelTest() throws ApiException {
        
        String systemId = null;
        
        VolumeGroupLabelUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDiskPoolUserLabel(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the drive channel state to either degraded or optimal.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDriveChannelStateTest() throws ApiException {
        
        String systemId = null;
        
        DriveChannelStateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDriveChannelState(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to set the Physical Security ID for a drive. The PSID is required in order to set a FIPS drive back to factory settings if the previous PSID is lost. In that case, the drive must be set back to factory settings in order to be used.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDrivePhysicalSecurityIDTest() throws ApiException {
        
        String systemId = null;
        
        DrivePhysicalSecurityIdDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDrivePhysicalSecurityID(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure set the interval in minutes between automatic polls of drive temperatures. For interval &gt; 0, automatic polling is enabled at the specified interval. For interval == 0, automatic polling is disabled. Each polling event will update the driveTemperature field in each Drive structure in the ObjectBundle.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDriveTemperaturePollingIntervalTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDriveTemperaturePollingInterval(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure marks the specified drive as being failed. In general, this will also impact the operational state of the volume group to which the drive is assigned, plus all volumes defined on that volume group. The precise impact on the states of these other objects may vary, as it depends on the RAID level of the volumes, as well as the states of the other drives in the volume group.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotExist, tryAlternate, invalidDriveref, databaseError, invalidDriveState, takeRecoveryActionsFirst. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDriveToFailedTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDriveToFailed(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure forces the specified drive to the optimal state, including clearing the PFA condition for the drive, if any. Returning the drive to optimal may cause volumes on the associated volume group to be returned to the optimal state as well. This is a potentially dangerous operation, since a failed drive is usually accompanied by some form of parity inconsistency. Forcing a drive from the failed state to the optimal state may disrupt the controller&#39;s normal methods of providing availability in a degraded state, and may thus result in corrupted data being returned on ensuing data transfers to the host system.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, background, invalidDriveref, invalidDriveState. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetDriveToOptimalTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetDriveToOptimal(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Sets parameters necessary to communicate with an external key management server.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetExternalKMSParametersTest() throws ApiException {
        
        String systemId = null;
        
        ExternalKMSParametersSetDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetExternalKMSParameters(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the parameters on a given flash cache.
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, flashcacheInvalidConfigType, notFlashcacheVol, flashcacheDeleted, flashcacheFailed, flashcacheDegradedState. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetFlashCacheParamsTest() throws ApiException {
        
        String systemId = null;
        
        FlashCacheParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetFlashCacheParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to get the state of a function, enable or disable the function, or revert the function back to its default value.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetFunctionStateTest() throws ApiException {
        
        String systemId = null;
        
        FunctionStateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FunctionStateReturned response = api.symbolSetFunctionState(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure enables or disables high resolution statistics gathering.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetHighResolutionSamplingTest() throws ApiException {
        
        String systemId = null;
        
        HighResolutionRequestDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        HighResolutionReturned response = api.symbolSetHighResolutionSampling(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure updates the I/O interface parameters for the controller to which the request is directed.
     *
     * Documented return codes: ok, error, noHeap, tryAlternate, nvramError, invalidControllerref, invalidFibreid. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetHostInterfaceParamsTest() throws ApiException {
        
        String systemId = null;
        
        InterfaceUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetHostInterfaceParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets selected HostPort properties, as specified by the input argument. It is a replacement for the deprecated moveHostPort, renameHostPort.
     *
     * Documented return codes: ok, requestFailedDueToPiRestrictions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetHostPortPropertiesTest() throws ApiException {
        
        String systemId = null;
        
        HostPortPropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetHostPortProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Changes the \&quot;host port type\&quot; attribute of a given HostPort object. Changing an individual host port type will cause all host port types to be changed if SPM is not enabled. This procedure does not apply to iSCSI; for iSCSI, the host type is set at the host level.
     *
     * Documented return codes: ok, illegalParam, partNodeNonexistent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetHostPortTypeTest() throws ApiException {
        
        String systemId = null;
        
        HostPortTypeUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetHostPortType(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets selected HostPorts attributes, as specified by the input argument. It is meant to operate on a group of ports, for example all the ports on a host interface card or base board.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetHostPortsAttributesTest() throws ApiException {
        
        String systemId = null;
        
        HostPortsAttributesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetHostPortsAttributes(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets selected host properties as indicated by the input argument. It is a replacement for the deprecated moveHost, renameHost.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetHostPropertiesTest() throws ApiException {
        
        String systemId = null;
        
        HostPropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetHostProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure updates the NVSRAM for the Host Specific region.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, nvramError, invalidRegionid, invalidHostTypeIndex. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetHostSpecificNVSRAMTest() throws ApiException {
        
        String systemId = null;
        
        HostSpecificNVSRAMUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetHostSpecificNVSRAM(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure, from the client&#39;s perspective, resets the InfiniBand baselined statistical counters to zero. It is a logical reset in the sense that the raw counts maintained in hardware and firmware are not actually reset; instead the firmware makes a snapshot of the current counter values and uses that to report deltas in counts when the statistics are fetched. The new baseline time is applied to both controllers, so that their counts are in sync with one another. If one controller resets without the other resetting, the counters become effectively out of sync and the client is made aware of this fact by the timestamp data reported along with the statistics.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetIbStatisticsBaselineTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetIbStatisticsBaseline(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets selected Initiator properties as indicated by the input argument.
     *
     * Documented return codes: ok, invalidAuthMethod, invalidSecret, secretAlreadyInUse, requestFailedDueToPiRestrictions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetInitiatorPropertiesTest() throws ApiException {
        
        String systemId = null;
        
        InitiatorPropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetInitiatorProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets selected iSCSI entity properties for the storage array as indicated by the input argument.
     *
     * Documented return codes: ok, isnsDhcpNotSupported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetIscsiEntityPropertiesTest() throws ApiException {
        
        String systemId = null;
        
        IscsiEntityPropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetIscsiEntityProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets selected properties of a controller iSCSI interface, as indicated by the input argument.
     *
     * Documented return codes: ok, invalidInterfaceref, duplicateIscsiIpAddress, portSpeedConflict. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetIscsiInterfacePropertiesTest() throws ApiException {
        
        String systemId = null;
        
        IscsiInterfacePropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetIscsiInterfaceProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure, from the client&#39;s perspective, resets the iSCSI statistical counters to zero. It is a logical reset in the sense that the raw counts maintained in hardware and firmware are not actually reset; instead the firmware makes a snapshot of the current counter values and uses that to report deltas in counts when the statistics are fetched. The new baseline time is applied to both controllers, so that their counts are in sync with one another. If one controller resets without the other resetting, the counters become effectively out of sync and the client is made aware of this fact by the timestamp data reported along with the statistics.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetIscsiStatisticsBaselineTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetIscsiStatisticsBaseline(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure persists the association between the Key-Value tags and the Volumes (or Workloads). This procedure is used both for creating the initial mappings and to update. Each execution will remove any existing mappings and replace them with the mappings defined within the argument list.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetKeyValueTagMappingTest() throws ApiException {
        
        String systemId = null;
        
        KeyValueTagMappingSetDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetKeyValueTagMapping(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used in conjunction with the createLockKey procedure. This request may be issued to change the existing array lock key or to set an array lock key after a database adoption. The procedure commits the lock key generated by the createLockKey procedure to the drives and to the controllers.
     *
     * Documented return codes: ok, volumeNotOptimal, driveSecurityEnabledFailed, lockkeyFailed, noFdeDrives, keyDoesNotExist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetLockKeyTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetLockKey(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the properties of a NVMe over Fabrics Host Interface port.
     *
     * Documented return codes: ok, invalidInterfaceref, invalidIpAddress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetNVMeHostInterfacePropertiesTest() throws ApiException {
        
        String systemId = null;
        
        NVMeInterfacePropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetNVMeHostInterfaceProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure, from the client&#39;s perspective, resets the NVMe over Fabrics baselined statistical counters to zero. It is a logical reset in the sense that the raw counts maintained in hardware and firmware are not actually reset; instead the firmware makes a snapshot of the current counter values and uses that to report deltas in counts when the statistics are fetched. The new baseline time is applied to both storage controllers, so that their counts are in sync with one another. If one storage controller resets without the other resetting, the counters become effectively out of sync and the client is made aware of this fact by the timestamp data reported along with the statistics.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetNVMeoFStatisticsBaselineTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetNVMeoFStatisticsBaseline(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure updates the network parameters.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, background. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetNetworkParametersTest() throws ApiException {
        
        String systemId = null;
        
        EthernetParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetNetworkParameters(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will modify the attributes of a PiT consistency group.
     *
     * Documented return codes: ok, invalidRollbackPriority, invalidWarnThreshold, invalidPitConsistencyGroupLabel, invalidPitAutoDeleteLimit, invalidPitRepositoryFullPolicy, attributeFixedByArvm, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetPITConsistencyGroupParamsTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetPITConsistencyGroupParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure changes the user-settable parameters on a PITConsistencyGroupView.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetPITConsistencyGroupViewParamsTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupViewParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetPITConsistencyGroupViewParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will update the changeable parameters of a PiT Group.
     *
     * Documented return codes: ok, invalidBasevol, invalidRollbackPriority, invalidWarnThreshold, baseVolumeFailed, invalidPitGroupLabel, invalidPitAutoDeleteLimit, invalidPitRepositoryFullPolicy, invalidPitGroupRef, pitGroupInConsistencyGroup, attributeFixedByArvm, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetPITGroupParamsTest() throws ApiException {
        
        String systemId = null;
        
        PITGroupParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetPITGroupParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will change the attributes of an existing PiT View.
     *
     * Documented return codes: ok, invalidWarnThreshold, pitViewInConsistencyGroup, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetPITViewParamsTest() throws ApiException {
        
        String systemId = null;
        
        PITViewParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetPITViewParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the RLS baseline for all devices. The baseline is used to indicate the difference in error counts from when the baseline was established and the time at which the RLS data is requested.
     *
     * Documented return codes: ok, dstNotFibre. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetRLSBaselineTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetRLSBaseline(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the selected remote target properties as indicated by the input arguments.
     *
     * Documented return codes: ok, invalidAuthMethod, invalidSecret, secretAlreadyInUse. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetRemoteTargetPropertiesTest() throws ApiException {
        
        String systemId = null;
        
        InitiatorTargetPropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetRemoteTargetProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure allows rlogin to the controller to be enabled or disabled.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, background. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetRloginCapabilityTest() throws ApiException {
        
        String systemId = null;
        
        RloginUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetRloginCapability(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure updates the cache parameters that are maintained on a per-array basis, across all controllers in the array.
     *
     * Documented return codes: ok, illegalParam, noHeap, volumeNotExist, volumeReconfiguring, tryAlternate, internalError, invalidCacheblksize, invalidFlushThreshold, invalidFlushAmount, noVolumes, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSACacheParamsTest() throws ApiException {
        
        String systemId = null;
        
        SACacheParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSACacheParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the target media scan period for background media scans to the value specified by the caller. The period is specified in units of days, and governs the approximate time required for a complete media scan of all volumes and drives in the system. The allowed period values can be determined by checking the appropriate fields of the FeatureParameters object for the storage array.
     *
     * Documented return codes: ok, error, illegalParam, tryAlternate, invalidScanperiod, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSAMediaScanPeriodTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSAMediaScanPeriod(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used by the client to request that the controller store (in nonvolatile storage) a TrayPositionList object that provides information about the relative physical positions of the storage array&#39;s trays within their enclosing rack(s) or container(s).
     *
     * Documented return codes: ok, error, illegalParam, noHeap, invalidTrayposLength. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSATrayPositionsTest() throws ApiException {
        
        String systemId = null;
        
        TrayPositionList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSATrayPositions(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used by a client to modify the user-assigned label for the storage array. The label value is stored in non-volatile storage and returned to the client as part of the SAInfo object.
     *
     * Documented return codes: ok, error, illegalParam, invalidLabel. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSAUserLabelTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSAUserLabel(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to set the initial view array password or change an existing view array password.
     *
     * Documented return codes: ok, authFailPassword, adminPasswordNotSet. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSAViewPasswordTest() throws ApiException {
        
        String systemId = null;
        
        EncryptedPassword body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSAViewPassword(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to modify an existing SNMP community.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSNMPCommunityParamsTest() throws ApiException {
        
        String systemId = null;
        
        SNMPCommunityParamsUpdateDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSNMPCommunityParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to set values of user-settable SNMP system variables.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSNMPSystemVariablesTest() throws ApiException {
        
        String systemId = null;
        
        SNMPSystemVariablesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSNMPSystemVariables(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to modify an existing SNMP trap destination.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSNMPTrapDestinationParamsTest() throws ApiException {
        
        String systemId = null;
        
        SNMPTrapDestinationParamsUpdateDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSNMPTrapDestinationParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to enable and disable Simplex mode.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, notImplemented, internalError, iconFailure, mirrorsPresent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSimplexModeTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSimplexMode(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to set various snapshot parameters including the repository warning threshold, the repository full policy, and the rollback operation priority.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, internalError, invalidVolumeref, snapNotAvailable, ghostVolume, invalidRollbackPriority, invalidWarnThreshold. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetSnapshotParamsTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetSnapshotParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets selected properties for the storage array that is the recipient of the call.
     *
     * Documented return codes: ok, illegalParam. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetStorageArrayPropertiesTest() throws ApiException {
        
        String systemId = null;
        
        StorageArrayPropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetStorageArrayProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets selected Target properties as indicated by the input argument.
     *
     * Documented return codes: ok, invalidAuthMethod, invalidSecret, secretAlreadyInUse. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetTargetPropertiesTest() throws ApiException {
        
        String systemId = null;
        
        TargetPropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetTargetProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will set a thin volume&#39;s capacity threshold warning level.
     *
     * Documented return codes: ok, internalError, invalidVolumeref, invalidWarnThreshold, illegalVolume, thresholdBelowUsedCapacity, thinVolumeParametersCannotBeModified. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetThinVolumeCapacityThresholdTest() throws ApiException {
        
        String systemId = null;
        
        ThinVolumeThresholdUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetThinVolumeCapacityThreshold(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will set a thin volume&#39;s repository volume expansion policy.
     *
     * Documented return codes: ok, internalError, invalidVolumeref, illegalVolume, invalidExpansionPolicy, thinVolumeParametersCannotBeModified. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetThinVolumeExpansionPolicyTest() throws ApiException {
        
        String systemId = null;
        
        ThinVolumeExpansionPolicyUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetThinVolumeExpansionPolicy(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will set a thin volume&#39;s provisioned capacity quota. This is the maximum value to which a thin volume&#39;s repository can grow.
     *
     * Documented return codes: ok, tryAlternate, internalError, invalidVolumeref, illegalVolume, invalidProvisionedCapacityQuota, invalidExpansionPolicy, invalidExpansionOperation, thinVolumeParametersCannotBeModified. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetThinVolumeProvisionedCapacityQuotaTest() throws ApiException {
        
        String systemId = null;
        
        ThinVolumeCapacityQuotaUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetThinVolumeProvisionedCapacityQuota(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure changes the reporting policy of a thin volume. The reporting policy controls how a thin volume is reported to the host on the SCSI interface, i.e., as a thin volume that supports unmap commands or as a thick volume.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetThinVolumeReportingPolicyTest() throws ApiException {
        
        String systemId = null;
        
        ThinVolumeReportingPolicyUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetThinVolumeReportingPolicy(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets arbitrary \&quot;attribute data\&quot; for a specified tray enclosure. Only the attributes specified in the argument are affected by this operation. The old data in an affected attribute is completely overwritten by the new attribute data.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, invalidRequest, invalidRequestForEnclosure. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetTrayAttributesTest() throws ApiException {
        
        String systemId = null;
        
        TrayAttributeUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetTrayAttributes(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to set the delay period before a volume transfer alert is issued.
     *
     * Documented return codes: ok, error, illegalParam. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolXferAlertDelayPeriodTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolXferAlertDelayPeriod(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure updates the caching parameters for a particular volume as specified in the argument structure.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeNotExist, volumeReconfiguring, tryAlternate, internalError, invalidRequest, volumeFormatting, invalidVolumeref, volumeOffline, invalidCacheModifier, invalidReadahead, ghostVolume, cacheParametersNotChangeable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumeCacheParamsTest() throws ApiException {
        
        String systemId = null;
        
        VolumeCacheParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolumeCacheParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure modifies the parameters of a volume copy.
     *
     * Documented return codes: ok, illegalParam, noHeap, volumeNotExist, internalError, invalidCopyPriority, invalidVolumecopyref, copyChangeFailed, copyGhostTarget, copyTargetReservation. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumeCopyParamsTest() throws ApiException {
        
        String systemId = null;
        
        VolumeCopyParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolumeCopyParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure marks a volume group offline. When this operation completes, all volumes in the volume group will be inaccessible for I/O operations. The drives that comprise the volume group can be removed from the storage array and, if desired, inserted into a different storage array.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotUnassigned, volumeReconfiguring, tryAlternate, invalidRequest, invalidVolumeref, driveNotOptimal, driveRemoved, duplicateDrives, numdrivesAdditional, numdrivesGroup. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumeGroupToOfflineTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolumeGroupToOffline(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure marks a volume group online. It is typically used when the drives assigned to a volume group have been transported from one storage array to another. After the last such drive has been inserted into the new storage array, it is necessary to manually mark the volume group online. When this operation completes, assuming the drives are all functioning properly, the volumes defined in the volume group will become accessible for I/O operations.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotUnassigned, volumeReconfiguring, tryAlternate, invalidRequest, invalidVolumeref, driveNotOptimal, duplicateDrives, numdrivesAdditional, numdrivesGroup. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumeGroupToOnlineTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolumeGroupToOnline(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Sets the user assigned label for the volume group specified in the VolumeGroupLabelUpdate structure.
     *
     * Documented return codes: ok, illegalParam. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumeGroupUserLabelTest() throws ApiException {
        
        String systemId = null;
        
        VolumeGroupLabelUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolumeGroupUserLabel(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Places the set of volumes online.
     *
     * Documented return codes: ok, noHeap, volumeNotExist, internalError, invalidVolumeref, volumeNotOptimal. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumeListOnlineTest() throws ApiException {
        
        String systemId = null;
        
        AbstractVolRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        VolumeListReturned response = api.symbolSetVolumeListOnline(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure sets the media scan parameters for a particular volume. Each volume can be configured to either participate in media scans or not. Furthermore, if a volume is configured to participate, it can be further configured so that parity validation either occurs during the media scan or is skipped. The client uses this procedure to set these configuration options on a per-volume basis.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, tryAlternate, invalidVolumeref, volumeOffline, ghostVolume, ssdMediaScanNotAllowed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumeMediaScanParamsTest() throws ApiException {
        
        String systemId = null;
        
        VolumeMediaScanParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolumeMediaScanParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure updates various parameters (outside of cache-related parameters) for a particular volume as specified in the argument structure.
     *
     * Documented return codes: ok, illegalParam, noHeap, volumeNotExist, tryAlternate, invalidRequest, invalidVolumeref, volumeOffline, invalidReconpriority, ghostVolume. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumeParamsTest() throws ApiException {
        
        String systemId = null;
        
        VolumeParamsUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolumeParams(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used for setting new values of certain volume properties. It supports setting some properties while leaving others unchanged.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeNotExist, tryAlternate, internalError, invalidVolumeref, volumeOffline, volumeNotOptimal, invalidReconpriority, volumeNotConfigurable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumePropertiesTest() throws ApiException {
        
        String systemId = null;
        
        VolumePropertiesUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolumeProperties(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used by a client to modify the user-assigned label for a volume. The label value is stored in non-volatile storage and returned to the client as part of the Volume or SnapshotVolume object when the client requests this information from the controller.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, tryAlternate, invalidVolumeref, volumeOffline, invalidLabel, ghostVolume, volumeNotConfigurable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSetVolumeUserLabelTest() throws ApiException {
        
        String systemId = null;
        
        VolumeLabelUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSetVolumeUserLabel(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Starts a base controller diagnostic test on the controller.
     *
     * Documented return codes: ok, illegalParam, diagInProgress, ctrlNotInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartBaseControllerDiagnosticTest() throws ApiException {
        
        String systemId = null;
        
        FruDiagDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartBaseControllerDiagnostic(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will initiate a rollback on a specified PiT on all members of a consistency group (all members that have the specified PiT may not necessarily be all of them).
     *
     * Documented return codes: ok, repositoryOffline, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartCGRollbackTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupRollbackStartDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartCGRollback(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Starts a cache backup device diagnostic test on the controller
     *
     * Documented return codes: ok, illegalParam, diagInProgress, ctrlNotInServiceMode, cacheBackupDevNotExist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartCacheBackupDeviceDiagnosticTest() throws ApiException {
        
        String systemId = null;
        
        FruDiagDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartCacheBackupDeviceDiagnostic(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Starts a cache memory diagnostic test on the controller
     *
     * Documented return codes: ok, illegalParam, diagInProgress, ctrlNotInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartCacheMemoryDiagnosticTest() throws ApiException {
        
        String systemId = null;
        
        FruDiagDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartCacheMemoryDiagnostic(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure initiates a drive channel fault isolation diagnostic test. It returns a status code immediately and the requested tests proceed asynchronously. Any SYMbol request, other than getChannelDiagnosticsResults, cancelChannelDiagnostics, bindToController, and getSAData that is received while the test is running is rejected immediately. Since some SYMbol procedures do not provide a return code, the method of indicating the request rejection is specialized and entails the following: The RPC header that is returned to the client will consist of an RPC response of type \&quot;reply message.\&quot; The reply will have a general status of \&quot;accepted,\&quot; indicating the request was accepted by the controller for processing. The specific \&quot;accepted request status\&quot; value will be 0x80000001, which is an indication that the request could not be processed due to a diagnostic activity.
     *
     * Documented return codes: ok, invalidRequest, channelDiagsLockErr, channelDiagsNotQuiesced, channelDiagsAltCommFailed, channelDiagsChanSetupFailed, channelDiagsDeviceBypassFailed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartChannelDiagnosticsTest() throws ApiException {
        
        String systemId = null;
        
        ChannelDiagnosticDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartChannelDiagnostics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes visual indicators to be activated on the specified channel. The indicators will remain active until the stopIdentification procedure is invoked.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, noChannel. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartChannelIdentificationTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartChannelIdentification(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure initiates a long-running operation to expand the capacity of a Disk Pool by adding one or more drives to it.
     *
     * Documented return codes: ok, exceedDiskPoolCapacity, exceedMaxVolumeCapacity. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartDiskPoolExpansionTest() throws ApiException {
        
        String systemId = null;
        
        DiskPoolExpansionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartDiskPoolExpansion(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure initiates a long-running operation to reduce the capacity of a Disk Pool by removing one or more drives from it.
     *
     * Documented return codes: ok, drivesNotAvailableForRemoval. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartDiskPoolReductionTest() throws ApiException {
        
        String systemId = null;
        
        DiskPoolReductionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartDiskPoolReduction(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure starts the parallel drive firmware download process.
     *
     * Documented return codes: ok, error, busy, illegalParam, noHeap, downloadNotPermitted, spawnError, downloadInProgress, sodInProgress, invalidDrives, invalidSetsize. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartDriveFirmwareDownloadTest() throws ApiException {
        
        String systemId = null;
        
        DriveFirmwareDownload body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DriveFirmwareStatus response = api.symbolStartDriveFirmwareDownload(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes visual indicators to be activated on the physical drives specified in the argument list to allow an end-user to visually identify the drives. The indicators will remain active until the stopIdentification procedure is invoked.
     *
     * Documented return codes: ok, error, illegalParam, noHeap. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartDriveIdentificationTest() throws ApiException {
        
        String systemId = null;
        
        DriveRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartDriveIdentification(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure initiates the reconstruction of a failed drive in a degraded RAID volume. The procedure returns once the reconstruction has started. If the indicated failed drive has an integrated hot spare serving in its place, then this procedure will initiate the copyback from the hot spare to the failed drive.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeReconfiguring, tryAlternate, invalidRequest, invalidDriveref, invalidRaidlevel, reconstructionInProgress, copybackInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartDriveReconstructionTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartDriveReconstruction(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure starts collecting analytics data for flash cache. It resets analytics counters and begins capturing cache data.
     *
     * Documented return codes: ok, error, illegalParam, internalError, invalidVolumeref, notFlashcacheVol. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartFlashCacheAnalyticsTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartFlashCacheAnalytics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Starts a host card diagnostic test on the controller
     *
     * Documented return codes: ok, illegalParam, diagInProgress, ctrlNotInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartHostCardDiagnosticTest() throws ApiException {
        
        String systemId = null;
        
        FruDiagDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartHostCardDiagnostic(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will initiate a rollback on a specified list of PiTs. Note that this list could be a subset of a set of consistency group PiTs.
     *
     * Documented return codes: ok, repositoryOffline, invalidPitRef, pitGroupsFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartPITRollbackTest() throws ApiException {
        
        String systemId = null;
        
        PITRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartPITRollback(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the success of starting statistic data collection.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartPerformanceMonitorTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartPerformanceMonitor(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * starts a raw data restore operation.
     *
     * Documented return codes: ok, busy, noHeap, tryAlternate, rawdataTransferBadType, rawdataTransferAlreadyStarted, rawdataTransferReadError, rawdataTransferNoDrives, rawdataTransferInvalidImage, dbmDbSourceUnavailable, dbmRestoreSourceMismatch. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartRawDataRestoreTest() throws ApiException {
        
        String systemId = null;
        
        RawDataRestoreStartDesc body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        RawDataRestoreResult response = api.symbolStartRawDataRestore(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure starts a raw data retrieval operation.
     *
     * Documented return codes: ok, busy, noHeap, invalidControllerref, rawdataTransferBadType, rawdataTransferAlreadyStarted, rawdataTransferNoDrives, dqRetrieveNothingToTransfer, dplCoreDumpInvalidTag, coredumpBackupInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartRawDataRetrieveTest() throws ApiException {
        
        String systemId = null;
        
        RawDataRetrieveStartDesc body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        RawDataRetrieveStartResult response = api.symbolStartRawDataRetrieve(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes visual indicators to be activated on the physical storage array unit to allow an end-user to visually identify the storage array. The indicators will remain active until the stopIdentification procedure is invoked.
     *
     * Documented return codes: ok, noHeap. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartSAIdentificationTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartSAIdentification(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure starts a slow background scan of the free or both free and allocated blocks for the requested devices. Background scan is long running and can be checked using the getSSDBlockAllocationScanStatus procedure.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartSSDBlockAllocationScanTest() throws ApiException {
        
        String systemId = null;
        
        StartSSDBlockAllocationScanDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartSSDBlockAllocationScan(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to initiate a snapshot rollback (to base) on one or more snapshots.
     *
     * Documented return codes: ok, rollbackStartFailure. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartSnapshotRollbackTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartSnapshotRollback(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure starts the synchronization process on a mirror.
     *
     * Documented return codes: ok, illegalParam, volumeNotExist, tryAlternate, internalError, invalidVolumeref, ghostVolume, invalidMirrorvol, mirrorVolNotPrimary. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartSyncMirrorTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartSyncMirror(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes visual indicators to be activated on the physical storage array unit to allow an end-user to visually identify the trays. The indicators will remain active until the stopIdentification procedure is invoked.
     *
     * Documented return codes: ok, invalidTrayref. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartTrayIdentificationTest() throws ApiException {
        
        String systemId = null;
        
        TrayRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartTrayIdentification(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure takes as its input a VolumeCopyRef and causes a copy operation to be initiated from the beginning of the Source volume. A failure status is returned if the Source and Target volumes do not meet compatibility requirements.
     *
     * Documented return codes: ok, illegalParam, noHeap, volumeNotExist, tryAlternate, internalError, iconFailure, invalidVolumecopyref, copyActive, copyIncompatibleSource, copyIncompatibleTarget, copyGhostSource, copyGhostTarget, copyInvalidSourceState, copyInvalidTargetState, copySourceReconfig, copyTargetReconfig, copyTargetTooSmall, copyTargetLimit, copySourceReservation, copySourceFormat, copyTargetFormat, copyStartFailed, copySourceZeroCapacity, copyApptagMismatch. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartVolumeCopyTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartVolumeCopy(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure checks to make sure the additional capacity is available and then starts a DVE or DCE/DVE operation.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotUnassigned, volumeReconfiguring, tryAlternate, internalError, invalidRequest, volumeFormatting, invalidVolumeref, invalidDriveref, volumeOffline, volumeNotOptimal, invalidExpansionList, driveNotOptimal, duplicateDrives, numdrivesAdditional, numdrivesGroup, driveTooSmall, ghostVolume, cannotReconfigure, drivesDacstoresOverlap, volumeHasAsyncMirror, insufficientCache. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartVolumeExpansionTest() throws ApiException {
        
        String systemId = null;
        
        VolumeExpansionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartVolumeExpansion(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes the specified volume to be formatted. All data that is currently present on the volume will be irretrievably lost as a result of this operation. Once a format operation starts, the volume&#39;s action field will be changed to VOL_ACTION_INITIALIZING; the getVolumeActionProgress procedure can then be used to monitor the progress of the operation. Volume format operations are typically required only when reviving a volume that has been marked failed for some reason. Newly-created volumes need not be explicitly formatted using this procedure.
     *
     * Documented return codes: ok, busy, illegalParam, noHeap, volumeNotExist, volumeReconfiguring, tryAlternate, reservationConflict, internalError, invalidRequest, invalidVolumeref, volumeOffline, ghostVolume, cannotFormatVolume. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartVolumeFormatTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartVolumeFormat(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure initiates a long-running operation to defragment a volume group by shifting the physical storage location of each volume in the volume group to eliminate any free extents that reside between defined volumes. Note that all volumes remain fully accessible and online during this transition. While the operation is in progress, the client can make calls to the getVolumeActionProgress procedure to determine how much progress has been made in completing the operation for each affected volume. The end result of a volume group defragment operation is that free extents that existed between defined volumes will be eliminated, and a single large free extent (if any) will appear at the end of the volume group.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotUnassigned, volumeReconfiguring, tryAlternate, invalidRequest, volumeFormatting, invalidVolumegroupref, volumeOffline, volumeNotOptimal, driveNotOptimal, duplicateDrives, numdrivesAdditional, numdrivesGroup, driveTooSmall, cannotReconfigure, drivesDacstoresOverlap, reconfigLogSpaceError, insufficientCache. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartVolumeGroupDefragTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartVolumeGroupDefrag(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure initiates a long-running operation to expand the capacity of a volume group by adding one or more drives to it. An expansion of this form requires that the controller transparently move the data of existing volumes within the volume group; volumes remain fully accessible and online during this transition. While the operation is in progress, the client can make calls to the getVolumeActionProgress procedure to determine how much progress has been made in completing the operation for each affected volume. The end result of a volume group expansion is the appearance of a new (or enlarged) free extent at the end of the volume group. The free extent can then be used to create new volumes as desired by the user.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotUnassigned, volumeReconfiguring, tryAlternate, invalidRequest, volumeFormatting, invalidVolumegroupref, invalidDriveref, volumeOffline, volumeNotOptimal, invalidExpansionList, driveNotOptimal, duplicateDrives, numdrivesAdditional, numdrivesGroup, driveTooSmall, cannotReconfigure, drivesDacstoresOverlap, volumeHasAsyncMirror, reconfigLogSpaceError, insufficientCache. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartVolumeGroupExpansionTest() throws ApiException {
        
        String systemId = null;
        
        VolumeGroupExpansionDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartVolumeGroupExpansion(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Initiates an explicit parity check operation. This is a background task that verifies the correctness of all parity/redundancy data for the volume. Only one such operation may be active at any time on a given controller. After initiating the operation with this procedure, the operation&#39;s progress can be checked via the getParityCheckProgress procedure. This procedure is deprecated. The scanVolume procedure should be used instead.
     *
     * Documented return codes: ok, noHeap, tryAlternate, background, invalidVolumeref, volumeOffline, volumeNotOptimal, invalidRaidlevel, parityScanInProgress, ghostVolume. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartVolumeParityCheckTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartVolumeParityCheck(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure initiates a long-running operation to change the RAID level of a volume group (and thus all volumes in the volume group) from one supported value to another. While the operation is in progress, the client can make calls to the getVolumeActionProgress procedure to determine how much progress has been made in completing the operation for each affected volume.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, driveNotUnassigned, volumeReconfiguring, tryAlternate, invalidRequest, volumeFormatting, invalidVolumegroupref, volumeOffline, invalidRaidlevel, driveNotOptimal, duplicateDrives, numdrivesAdditional, numdrivesGroup, cannotReconfigure, drivesDacstoresOverlap, insufficientCache. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartVolumeRAIDMigrationTest() throws ApiException {
        
        String systemId = null;
        
        VolumeRAIDMigrationDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartVolumeRAIDMigration(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure initiates a long-running operation to change the segment size (i.e. stripe depth) of a volume from one supported value to another. While the operation is in progress, the client can make calls to the getVolumeActionProgress procedure to determine how much progress has been made in completing the operation.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeReconfiguring, tryAlternate, reservationConflict, invalidRequest, volumeFormatting, invalidVolumeref, volumeOffline, invalidSegmentsize, ghostVolume, cannotReconfigure, drivesDacstoresOverlap, insufficientCache. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStartVolumeSegmentSizingTest() throws ApiException {
        
        String systemId = null;
        
        VolumeSegmentSizingDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStartVolumeSegmentSizing(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to capture current controller conditions as specified by the function being passed through the variable string input.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStateCaptureTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithOpaqueData response = api.symbolStateCapture(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure cancels a running channel diagnostic test sequence that was initiated by the startChannelDiagnostics procedure. It is possible to retrieve the (partial) results of a canceled test by calling getChannelDiagnosticsResults.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStopChannelDiagnosticsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStopChannelDiagnostics(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure stops the parallel drive firmware download process.
     *
     * Documented return codes: ok, error, illegalParam, tryAlternate, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStopDriveFirmwareDownloadTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStopDriveFirmwareDownload(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure stops the collection of analytics data for flash cache. It disables the collection of cache hits.
     *
     * Documented return codes: ok, error, illegalParam, internalError, invalidVolumeref, notFlashcacheVol. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStopFlashCacheAnalyticsTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStopFlashCacheAnalytics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure cancels the effects of any prior startDriveIdentification, startSAIdentification, startChannelIdentification and/or startTrayIdentification operations by deactivating all visual indicators.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStopIdentificationTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStopIdentification(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure forcibly terminates an iSCSI session.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStopIscsiSessionTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStopIscsiSession(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will stop the specified PITConsistencyGroupView (and thus all of its associated member views).
     *
     * Documented return codes: ok, operationFailedVolumeCopyClone. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStopPITConsistencyGroupViewTest() throws ApiException {
        
        String systemId = null;
        
        PITConsistencyGroupViewStopDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStopPITConsistencyGroupView(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will stop an existing PiT View.
     *
     * Documented return codes: ok, operationFailedVolumeCopyClone. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStopPITViewTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStopPITView(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the success of stopping statistic data collection.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStopPerformanceMonitorTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStopPerformanceMonitor(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure halts the active copy.
     *
     * Documented return codes: ok, illegalParam, noHeap, volumeNotExist, tryAlternate, internalError, invalidVolumecopyref, copyInactive, copyStopFailed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolStopVolumeCopyTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolStopVolumeCopy(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will suspend an Async Mirror Group.
     *
     * Documented return codes: ok, arvmGroupDoesNotExist, arvmRecoveryPointDeletionRequired, arvmGroupNotPrimary, arvmMemberFailed, arvmSuspendFailure, arvmOrphanGroup, remoteInternalError, arvmRemoteGroupDoesNotExist, remoteDatabaseError, arvmRemoteSuspendFailure. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSuspendAsyncMirrorGroupTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupSuspendDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AsyncMirrorGroupActionResult response = api.symbolSuspendAsyncMirrorGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure suspends the communications for all mirrors in a Write Consistency group with a specified group number.
     *
     * Documented return codes: ok, noHeap, internalError, iconFailure, rvmQuiescenceInProgress, legacyRvmAsyncModeUnsupported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSuspendConsistencyGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSuspendConsistencyGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure suspends caching on the specified flash cache.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeNotExist, internalError, invalidVolumeref, flashcacheAlreadySuspended, notFlashcacheVol, flashcacheDeleted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSuspendFlashCacheTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSuspendFlashCache(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure suspends the communication between a mirror pair.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, internalError, iconFailure, invalidVolumeref, ghostVolume, invalidMirrorvol, rvmVersionMismatch, rvmOperNotAllowedOnSec, mirrorAlreadySuspended. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSuspendMirrorTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSuspendMirror(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure suspends the communication between all mirrored pairs specified in the MirrorVolumeList.
     *
     * Documented return codes: ok, noHeap, internalError, iconFailure, rvmQuiescenceInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSuspendMirrorListTest() throws ApiException {
        
        String systemId = null;
        
        MirrorVolumeList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolSuspendMirrorList(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will start a manual resynchronization on an Async Mirror Group.
     *
     * Documented return codes: ok, arvmGroupDoesNotExist, arvmRecoveryPointDeletionRequired, arvmGroupNotPrimary, arvmSynchronizeFailure, arvmInvalidAmgRequestWhileSuspended, arvmManualSyncAlreadyInProgress, arvmManualSyncRetryTooSoon, arvmOrphanGroup, remoteInternalError, arvmRemoteGroupDoesNotExist, remoteDatabaseError, arvmRemoteSynchronizeFailure, arvmExpansionSynchronizationInProgress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolSynchronizeAsyncMirrorGroupTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupSynchronizeDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AsyncMirrorGroupActionResult response = api.symbolSynchronizeAsyncMirrorGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
