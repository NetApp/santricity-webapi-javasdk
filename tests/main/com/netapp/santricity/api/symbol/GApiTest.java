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
* API tests for GApi
*/
public class GApiTest {
    private final GApi api = new GApi();
    
    /**
     * Generates a Key Management Server (KMS) Client Certificate Signing Request (CSR) that needs to be signed by a Certificate Authority (CA). The resulting signed certificate or client certificate is installed on the storage array for authenticating with the KMIP server.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGenerateCertificateSigningRequestTest() throws ApiException {
        
        String systemId = null;
        
        KMSClientCSRDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        KMSCertificateFileReturn response = api.symbolGenerateCertificateSigningRequest(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Allows a client to fetch a set of entries that have the alertable, needs attention, or collect support bundle flag set from the array&#39;s MEL for analysis or display.
     *
     * Documented return codes: ok, error. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetAlertableMelEntriesTest() throws ApiException {
        
        String systemId = null;
        
        MelExtent body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        MelEntryList response = api.symbolGetAlertableMelEntries(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to get the current Autosupport status values.
     *
     * Documented return codes: ok, notImplemented. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetAsupStatusTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AsupStatusReturned response = api.symbolGetAsupStatus(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns information on the connections established to a remote array for an existing AsyncMirrorGroup. This will return connection information for both controllers.
     *
     * Documented return codes: ok, notImplemented. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetAsyncMirrorGroupRemoteConnectionsTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ScsiRemoteConnectionsReturned response = api.symbolGetAsyncMirrorGroupRemoteConnections(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will return sync progress information for Async Mirror Groups and their associated members. Calls to this procedure are valid even when a sync is not running.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetAsyncMirrorGroupSyncProgressTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AsyncMirrorGroupSyncProgressListReturned response = api.symbolGetAsyncMirrorGroupSyncProgress(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will return repository utilization information for async mirror members.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetAsyncMirrorRepositoryUtilizationTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupMemberRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AsyncMirrorRepositoryUtilizationListReturned response = api.symbolGetAsyncMirrorRepositoryUtilization(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will return synchronization time statistics for a list of mirror members.
     *
     * Documented return codes: ok, notImplemented. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetAsyncMirrorSyncStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorSyncStatisticsRequestDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AsyncMirrorSyncStatisticsListReturned response = api.symbolGetAsyncMirrorSyncStatistics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure automatically gets the configuration candidates.
     *
     * Documented return codes: ok, illegalParam, noHeap, driveNotExist, internalError, invalidSegmentsize, raid6FeatureUnsupported, raid6FeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetAutoConfigCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        AutoConfigTemplateList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AutoConfigCandidateList response = api.symbolGetAutoConfigCandidates(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieves the status of a running, interrupted, or completed base controller diagnostic test.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetBaseControllerDiagnosticStatusTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FruDiagReturn response = api.symbolGetBaseControllerDiagnosticStatus(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieves the status of a running, interrupted, or completed cache backup device diagnostic test.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetCacheBackupDeviceDiagnosticStatusTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FruDiagReturn response = api.symbolGetCacheBackupDeviceDiagnosticStatus(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieves the status of a running, interrupted, or completed cache memory diagnostic test.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetCacheMemoryDiagnosticStatusTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FruDiagReturn response = api.symbolGetCacheMemoryDiagnosticStatus(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used by clients to query the controller for indications of state changes that have occurred and which would necessitate that the client refresh its view of the storage array&#39;s state. If no state changes need to be reported, the controller will generally hold this request, without responding, for up to the amount of time specified in the argument. If, at any time during the hold period, a state change occurs, the controller will return immediately with the new configuration generation number and/or MEL sequence number. By using this hanging poll approach, the amount of traffic between the client and the server is reduced to an insignificant level, and yet near-immediate notification of changes is still possible.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetChangeStateTest() throws ApiException {
        
        String systemId = null;
        
        ChangeQueryDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ChangeState response = api.symbolGetChangeState(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure reports the results of drive channel fault isolation diagnostic tests that were initiated by the startChannelDIagnostics procedure.
     *
     * Documented return codes: ok, channelDiagsRunning, channelDiagsResultsPartial, channelDiagsResultsNotAvailable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetChannelDiagnosticsResultsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ChannelDiagResultsReturned response = api.symbolGetChannelDiagnosticsResults(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedures returns the performance limitation values for a host cluster. Those values include the limits on the IOPs and throughput (MB/s). The number of IOPs impacted by the performance limits is also returned.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetClusterPerformanceLimitationValuesTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ClusterPerformanceLimitationValuesReturned response = api.symbolGetClusterPerformanceLimitationValues(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure replaces the deprecated stateCapture procedure. It returns a single \&quot;chunk\&quot; of debug information and must be used in a series of like calls in order to retrieve the complete set of debug information.
     *
     * Documented return codes: ok, illegalParam, tryAlternate, noSuchDebugChunk, debugInfoConfigChanged. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetControllerDebugInformationTest() throws ApiException {
        
        String systemId = null;
        
        DebugInfoExtent body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DebugInfoReturned response = api.symbolGetControllerDebugInformation(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used by clients to query the referenced controller for up-to-date information about its host-side I/O interfaces. Since this interface information is highly volatile, the object graph data contains only a point-in-time snapshot of the interface data. This procedure can be used to obtain current information that may not be reflected in the most recent object graph.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetControllerHostInterfacesTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IOInterfaceTypeDataList response = api.symbolGetControllerHostInterfaces(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * NOTE: object graph data may not be the most recent.
     *
     * Documented return codes: ok, tryAlternate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetControllerHostIoInterfacesTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ControllerHostIoInterfacesReturned response = api.symbolGetControllerHostIoInterfaces(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure allows a client to fetch the data that resides within a designated region of the controller&#39;s NVSRAM. Note that the NVSRAM data is obtained only from the controller to which this request is directed.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetControllerNVSRAMTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        NVSRAMRegionList response = api.symbolGetControllerNVSRAM(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure gets the internal clock from the controllers. The time is expressed in seconds since midnight (GMT) on 1/1/1970.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetControllerTimeTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ControllerTime response = api.symbolGetControllerTime(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure allows a client to fetch a set of entries with a priority value of EVENT_PRIORITY_CRITICAL from the storage array&#39;s Major Event Log for analysis or display. If there are less critical MEL events than MEL_MAX_XFER_COUNT, all the critical events will be displayed on the first call. If the client receives a number of critical MEL events that is equal to MEL_MAX_XFER_COUNT, then the user must increment the first sequence number to be the highest sequence number in the list of entries returned and repeat the procedure. This process must be repeated until the number of entries returned is less than MEL_MAX_XFER_COUNT.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetCriticalMelEntriesTest() throws ApiException {
        
        String systemId = null;
        
        MelExtent body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        MelEntryList response = api.symbolGetCriticalMelEntries(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Returns a structure containing information about the controller if it is locked down.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetCtlLockDownInfoTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        LockDownInfoReturned response = api.symbolGetCtlLockDownInfo(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns up to two groups of statistical counters, one per controller, bundled together. A counter group is a set of related statistical counters, accumulated over a period of time, along with the associated base time.
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetCumulativeStatisticsBundleTest() throws ApiException {
        
        String systemId = null;
        
        CumulativeStatisticsDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        CumulativeStatisticsBundleReturned response = api.symbolGetCumulativeStatisticsBundle(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to request a list of bundles of statistical data. The argument describes the statistics being requested.
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetCumulativeStatisticsBundlesTest() throws ApiException {
        
        String systemId = null;
        
        CumulativeStatisticsListDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        CumulativeStatisticsBundleListReturned response = api.symbolGetCumulativeStatisticsBundles(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure collects the wear life statistic information for the requested devices and returns this up to date information.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetCurrentSSDWearLifeStatsTest() throws ApiException {
        
        String systemId = null;
        
        CurrentSSDWearLifeStatsDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        CurrentSSDWearLifeStatsResults response = api.symbolGetCurrentSSDWearLifeStats(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to request the information about a DPL core dump. The parameter is a DPL Core Dump Tag. The value of the tag is unique for each core dump and may be obtained from the DPLCoreDumpData structure in StorageArray.
     *
     * Documented return codes: ok, dplCoreDumpInvalidTag. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDPLCoreDumpInformationTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DPLCoreDumpInfoReturn response = api.symbolGetDPLCoreDumpInformation(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure gets a list of volumes encroaching the requested Dacstore area.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDacstoreIncompatibleVolumesTest() throws ApiException {
        
        String systemId = null;
        
        Long body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        AbstractVolRefList response = api.symbolGetDacstoreIncompatibleVolumes(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to retrieve stable store database metadata.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDatabaseMetadataTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DatabaseMetadataReturned response = api.symbolGetDatabaseMetadata(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure allows a client to retrieve diagnostic information from the storage array&#39;s diagnostic data capture. The client must specify a correct tag and appropriate chunk number. In case of failure, the client must either (1) retry the current chunk number or (2) discard any partially-received log data and retry from the first chunk number (which is one - zero is not a valid chunk number).
     *
     * Documented return codes: ok, illegalParam, ddcUnavail, invalidDdcTag. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDdcLogTest() throws ApiException {
        
        String systemId = null;
        
        DdcExtent body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DdcLogDataReturned response = api.symbolGetDdcLog(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This returns up to two groups of discrete time series statistics, one per controller
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDiscreteTimeSeriesBundleTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DiscreteTimeSeriesBundleReturned response = api.symbolGetDiscreteTimeSeriesBundle(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of drive sets that are candidates for use in expanding the given Disk Pool.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDiskPoolExpansionCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ExpansionCandidatesReturned response = api.symbolGetDiskPoolExpansionCandidates(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will return the maximum Reserved Drive Count possible on a disk pool.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDiskPoolMaxReservedDriveCountTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DiskPoolMaxReservedDriveCountReturn response = api.symbolGetDiskPoolMaxReservedDriveCount(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure calculates the maximum number of drives that can be removed from a disk pool.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDiskPoolReductionDriveCountTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DiskPoolReductionDriveCountReturn response = api.symbolGetDiskPoolReductionDriveCount(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure gets statistical information about all of the drive channels.
     *
     * Documented return codes: ok, error, noHeap. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDriveChannelStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DriveChannelList response = api.symbolGetDriveChannelStatistics(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure gets the progress of the firmware download.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, tryAlternate, invalidRequest, cacheSyncFailure, downloadInProgress, missingData, quiescenceFailed, allFailed, partialOk. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDriveFirmwareDownloadProgressTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DriveFirmwareStatus response = api.symbolGetDriveFirmwareDownloadProgress(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure gets the drive&#39;s log sense pages.
     *
     * Documented return codes: ok, noHeap, internalError, invalidDriveref. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDriveLogDataTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DriveLogData response = api.symbolGetDriveLogData(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure retrieves temperature data for drives in the storage array.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetDriveTemperaturesTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        DriveTemperatureReturned response = api.symbolGetDriveTemperatures(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will retrieve state capture information from controller and expansion enclosures, including DCMs, if any. Send the command to both controllers if the tray is an RBOD.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetEnclosureStateCaptureDataTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithOpaqueData response = api.symbolGetEnclosureStateCaptureData(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure retrieves temperature data for each thermal sensor in each enclosure in the storage array.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetEnclosureTemperaturesTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        TrayTemperatureReturned response = api.symbolGetEnclosureTemperatures(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to request Energy Star data from all power supplies.
     *
     * Documented return codes: ok, unsupportedEsmRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetEnergyStarDataTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        EnergyStarDataReturn response = api.symbolGetEnergyStarData(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the InfiniBand statistics, which consists of start-of-day-relative interface statistics and baseline-relative statistics. It supersedes the deprecated getIbStatistics () routine.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetEnhancedIbStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        EnhancedIbStatisticsReturned response = api.symbolGetEnhancedIbStatistics(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure gets the log data for the indicated environmental card.
     *
     * Documented return codes: ok, noHeap, internalError, invalidEsmref. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetEnvCardLogDataTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        EnvCardLogDataReturned response = api.symbolGetEnvCardLogData(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of volume group export dependencies for the identified volume group. The returned list consists of the input volume group&#39;s immediate export dependencies only. The procedure does not return transitive dependencies. It is up to the caller to create the complete dependency graph through successive calls to this procedure.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetExportDependenciesTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ExportDependenciesReturned response = api.symbolGetExportDependencies(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure retrieves analytics data from the last capture period. It returns the cache hits for various sizes of flash cache.
     *
     * Documented return codes: ok, error, illegalParam, internalError, invalidVolumeref, notFlashcacheVol, flashcacheInvalidAnalyticsState. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetFlashCacheAnalyticsTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FlashCacheAnalyticsReturned response = api.symbolGetFlashCacheAnalytics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to retrieve flash cache statistics.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetFlashCacheStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FlashCacheStatisticsReturned response = api.symbolGetFlashCacheStatistics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns up to two groups of histogram statistics, one per controller,
     *
     * Documented return codes: ok, error, illegalParam, invalidRequest. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetHistogramBundleTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        HistogramBundleReturned response = api.symbolGetHistogramBundle(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieves the status of a running, interrupted, or completed host card diagnostic test.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetHostCardDiagnosticStatusTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FruDiagReturn response = api.symbolGetHostCardDiagnosticStatus(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure allows the Host Specific NVSRAM region to be read to obtain information for a specific host.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetHostSpecificNVSRAMTest() throws ApiException {
        
        String systemId = null;
        
        NVSRAMRegionIdAndHostIndex body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        NVSRAMRegionList response = api.symbolGetHostSpecificNVSRAM(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of hot spare candidates with the volume groups that they potentially cover.
     *
     * Documented return codes: ok, noHeap, internalError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetHotSpareCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        HotSpareCandidateList response = api.symbolGetHotSpareCandidates(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of all hot spare drives and their volume groups.
     *
     * Documented return codes: ok, noHeap, volumeNotExist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetHotSpareCoverageTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        HotSpareCoverageList response = api.symbolGetHotSpareCoverage(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to request information about an IOC Dump. The parameter is an IOC Dump Tag. The value of the tag is unique for each dump and may be obtained from the IOCDumpData structure in StorageArray.
     *
     * Documented return codes: ok, iocDumpInvalidTag. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetIOCDumpInformationTest() throws ApiException {
        
        String systemId = null;
        
        Integer body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IOCDumpInfoReturn response = api.symbolGetIOCDumpInformation(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns attribute information for each InfiniBand I/O controller that is part of the Infiniband I/O Unit. An InfiniBand I/O Controller is a logical entity defined in the InfiniBand Architecture. It does not correlate one-to-one with a storage array controller
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetIbIocAttributesTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IbIocAttributesReturned response = api.symbolGetIbIocAttributes(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a group of InfiniBand port partition tables, one table for each InfiniBand port of the Infiniband I/O Unit (i.e., storage array).
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetIbPortPartitionTablesTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IbPortPartitionTablesReturned response = api.symbolGetIbPortPartitionTables(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns various items of information about InfiniBand RDMA channels that are presently active in the Infiniband I/O Unit (i.e., storage array).
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetIbRdmaChannelsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IbRdmaChannelsReturned response = api.symbolGetIbRdmaChannels(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the InfiniBand statistics, which consist of start-of-day-relative interface statistics, baseline-relative interface statistics, target channel adapter statistics, and RDMA channel statistics.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetIbStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IbStatisticsReturned response = api.symbolGetIbStatistics(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of volume group import dependencies for the identified volume group. The reported information identifies the types of dependencies that exist for the volume group. It is necessary for this procedure to spin up the drives in the volume group so that their configuration databases can be read. An error is returned if the volume group is not in the exported or forced state.
     *
     * Documented return codes: ok, volumeGroupStateNotValid, driveSpinUpError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetImportDependenciesTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ImportDependenciesReturned response = api.symbolGetImportDependencies(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will perform diagnostic tests on all channels of a given iSCSI HIC. These diagnostics are dependent on the PHY used on a particular HIC, so they may not be available on all ports of the controller.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetIscsiCopperCableDiagnosticsTest() throws ApiException {
        
        String systemId = null;
        
        IscsiCableDiagnosticsDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IscsiCableDiagnosticsReturn response = api.symbolGetIscsiCopperCableDiagnostics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the default values for negotiable settings for sessions and connections. These represent the storage array&#39;s starting point for negotiations.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetIscsiNegotiationDefaultsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IscsiNegotiationDefaultsReturned response = api.symbolGetIscsiNegotiationDefaults(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns data about active iSCSI sessions.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetIscsiSessionsTest() throws ApiException {
        
        String systemId = null;
        
        GetIscsiSessionsFilter body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IscsiSessionsReturned response = api.symbolGetIscsiSessions(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns iSCSI statistical data collected by the storage array. The caller may request either the \&quot;raw\&quot; counts, which are relative to controller start-of-day, or baseline-relative counters, which are relative to the baseline which was last set using the setIscsiStatisticsBaselilne procedure. If the user has not set a baseline since controller start-of-day, then the time at start-of-day is the default baseline time.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetIscsiStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        IscsiStatisticsReturned response = api.symbolGetIscsiStatistics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of LUN mappings that apply to the object identified by the argument SYMbolRef.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetLUNMappingsTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        LUNMappings response = api.symbolGetLUNMappings(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will report progress on each actively running long-lived operation.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetLongLivedOpsProgressTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        LongLivedOpsProgressReturn response = api.symbolGetLongLivedOpsProgress(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure allows a client to fetch a set of entries from the storage array&#39;s Major Event Log for analysis or display. Note that the MEL_MAX_XFER_COUNT constant specifies that maximum number of entries that can be requested in one operation. If more entries are needed, the client must fetch them iteratively, ensuring that no single request exceeds the transfer limit.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetMelEntriesTest() throws ApiException {
        
        String systemId = null;
        
        MelExtent body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        MelEntryList response = api.symbolGetMelEntries(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to determine the head and tail sequence numbers of entries in the storage array&#39;s Major Event Log. The client can use these values to manage controlled fetching of log entries.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetMelExtentTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        MelExtent response = api.symbolGetMelExtent(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the amount of storage required for a metadata volume.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetMetadataVolumeCapacityTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        Integer response = api.symbolGetMetadataVolumeCapacity(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the NVMeoF statistics, which consist of start-of-day-relative interface/queue statistics and baseline-relative interface/queue statistics.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetNVMeoFStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        NVMeoFStatisticsReturned response = api.symbolGetNVMeoFStatistics(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure causes all configuration and state information to be returned to the requester. The information is conveyed in the form of an object graph. The ObjectBundle object contains a set of all known logical and physical components. The reference values within these objects can be analyzed to determine the interrelationships and linkages between the key objects, and thus to establish the true graph-oriented image of the storage array state.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetObjectGraphTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ObjectBundle response = api.symbolGetObjectGraph(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will return repository utilization information for PiT groups.
     *
     * Documented return codes: ok, invalidPitGroupRef. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetPITGroupRepositoryUtilizationTest() throws ApiException {
        
        String systemId = null;
        
        PITGroupRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        PITGroupRepositoryUtilizationListReturned response = api.symbolGetPITGroupRepositoryUtilization(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will return repository utilization information for PiT Views.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetPITViewRepositoryUtilizationTest() throws ApiException {
        
        String systemId = null;
        
        PITViewRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        PITViewRepositoryUtilizationListReturned response = api.symbolGetPITViewRepositoryUtilization(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of persistent registrations on the array.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetPRegistrationsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        PRegistrationList response = api.symbolGetPRegistrations(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of the persistent registrations for the specified volume.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetPRegistrationsForVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        PRegistrationList response = api.symbolGetPRegistrationsForVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to check the progress of a power supply firmware update operation.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetPSUFirmwareUpdateProgressTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        PSUFirmwareUpdateStatus response = api.symbolGetPSUFirmwareUpdateProgress(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns an indication of the progress of an explicit parity check operation on a particular volume. This procedure is deprecated. The scanVolume procedure should be used instead.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetParityCheckProgressTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        Integer response = api.symbolGetParityCheckProgress(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * 
     *
     * Documented return codes: ok, noHeap, internalError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetPendingHostsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        CheckedPendingHostListReturned response = api.symbolGetPendingHosts(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of persistent registrations on the array OBSOLETE: Any call to getPersistantReservations will get a return status indicating the command is obsolete. Please use the new command getPRegistrations.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetPersistentRegistrationsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        PersistentRegistrationList response = api.symbolGetPersistentRegistrations(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the persistent registrations for the specified volume. The list will contain no more than one PersistentRegistration element. OBSOLETE: Any call to getPersistantReservationsForVolume will get a return status indicating the command is obsolete. Please use the new commands getPRegistrationsForVolume.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetPersistentRegistrationsForVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        PersistentRegistrationList response = api.symbolGetPersistentRegistrationsForVolume(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure retrieves a list of product capabilities supported by the array.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetProductCapabilitiesTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ProductCapabilityList response = api.symbolGetProductCapabilities(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the Read Link Status information.
     *
     * Documented return codes: ok, dstNotFibre. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetReadLinkStatusTest() throws ApiException {
        
        String systemId = null;
        
        RLSCommandDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        RLSResults response = api.symbolGetReadLinkStatus(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used by clients to obtain information about all component or logic failures on the storage array that require some form of recovery action.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetRecoveryFailureListTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        FailureTypeList response = api.symbolGetRecoveryFailureList(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns information on the available connections between two arrays. This can be used prior to creation of an AsyncMirrorGroup to determine if there are wiring or other connection configuration issues between the two arrays. A call to this procedure acts like a ping test between the arrays and returns back information on the connections that succeed. This must be issued to each controller independently and should be called in fibre channel environments after activation of fibre channel remote mirroring.
     *
     * Documented return codes: ok, notImplemented. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetRemoteConnectionsTest() throws ApiException {
        
        String systemId = null;
        
        InitiatorTargetInitialProperties body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ScsiRemoteConnectionsReturned response = api.symbolGetRemoteConnections(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used by clients to obtain information about the utilization of the repository volume for selected snapshots.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetRepositoryUtilizationTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        RepositoryUtilizationList response = api.symbolGetRepositoryUtilization(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns an object that contains high-level status information about the storage array as a whole.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetSADataTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        SAData response = api.symbolGetSAData(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieves a storage array port. OBSOLETE: Any call to getSAPort will get a return status indicating the command is obsolete. No alternative procedure is available.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetSAPortTest() throws ApiException {
        
        String systemId = null;
        
        SAPortGetDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ReturnCodeWithRef response = api.symbolGetSAPort(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to retrieve the digest of the view array password and its associated salt value which are saved in the array by the setViewPassword procedure. If the view array password isn&#39;t set, the procedure returns a random salt value and the digest of the salt value message.
     *
     * Documented return codes: ok, adminPasswordNotSet. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetSAViewPasswordDigestTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        SAViewPasswordDigestReturned response = api.symbolGetSAViewPasswordDigest(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to retrieve the information collected by a SSD Block Allocation Scan. The requested devices and type of scan is set by the startSSDBlockAllocationScan procedure.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetSSDBlockAllocationScanStatusTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        SSDBlockAllocationScanStatusResults response = api.symbolGetSSDBlockAllocationScanStatus(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the SAS PHY error statistics for all SAS devices in the storage array.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetSasErrorStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        SasStatisticsReturned response = api.symbolGetSasErrorStatistics(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns SOC error statistics.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetSocErrorStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        SocCommandDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        SocStatisticsReturned response = api.symbolGetSocErrorStatistics(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns the default values for system attributes.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetSystemAttributeDefaultsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        SystemAttributeDefaultsReturned response = api.symbolGetSystemAttributeDefaults(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will retrieve a thin volume&#39;s Expandable Repository Volume consumed capacity.
     *
     * Documented return codes: ok, noHeap, invalidVolumeref, alternateRequiredForOperation, illegalVolume. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetThinVolumeConsumedCapacityTest() throws ApiException {
        
        String systemId = null;
        
        ThinVolumeRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ThinVolumeConsumedCapacityReturned response = api.symbolGetThinVolumeConsumedCapacity(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure will retrieve a thin volume&#39;s repository expansion history.
     *
     * Documented return codes: ok, illegalParam, invalidVolumeref. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetThinVolumeExpansionHistoryTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ThinVolumeRepositoryExpansionHistoryListReturned response = api.symbolGetThinVolumeExpansionHistory(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of initiators that have been detected by the storage array, but which are not configured into the storage array topology. An initiator is considered unconfigured if it is not associated with a host.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetUnconfiguredInitiatorsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        UnconfiguredInitiatorsReturned response = api.symbolGetUnconfiguredInitiators(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns information about host ports whose world-wide names are known to the controller, but which have not been defined as full HostPort objects via the SYMbol interface. Note that you only need to send the request to one of the controllers, and that the same list of unlabeled host ports are returned, regardless of which controller receives the request. This procedure does not apply to iSCSI. The getUnconfiguredInitiators procedure should be used instead.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetUnlabeledHostPortsTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolGetUnlabeledHostPorts(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns an indication of the extent to which a long-running operation on a volume has completed. The set of supported long-running operations is defined by the VolumeAction enumeration. This procedure can also be called for a snapshot volume. The set of supported long-running operations for snapshot volumes is defined by the SnapshotAction enumeration.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetVolumeActionProgressTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        VolumeActionProgress response = api.symbolGetVolumeActionProgress(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of volume candidates that can be used in an ensuing volume creation request.
     *
     * Documented return codes: error, invalidSecurity, noFdeDrives, volumeGroupSecure. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetVolumeCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        VolumeCandidateRequest body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        VolumeCandidateList response = api.symbolGetVolumeCandidates(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of volume source candidates for creating a volume copy.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, iconFailure, maxVolumeCopysExceeded, volcopyFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetVolumeCopySourceCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        VolumeCopyCandidateList response = api.symbolGetVolumeCopySourceCandidates(systemId, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of volume target candidates for creating a volume copy.
     *
     * Documented return codes: ok, illegalParam, noHeap, tryAlternate, iconFailure, maxVolumeCopysExceeded, volcopyFeatureDisabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetVolumeCopyTargetCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        VolumeCopyCandidateList response = api.symbolGetVolumeCopyTargetCandidates(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * The firmware prioritizes the properties of candidates for constructing the return list, subject to the volume group having a given property in the first place. The prioritization and ordering of the list is as follows:
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetVolumeGroupExpansionCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        ExpansionCandidatesReturned response = api.symbolGetVolumeGroupExpansionCandidates(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure returns a list of mirror volume candidates that can be used in an ensuing mirror volume creation request.
     *
     * Documented return codes: ok, illegalParam, noHeap, internalError, invalidVolumeref, ghostVolume, metadataVolNonexistent, rvmFeatureDisabled, maxMirrorsExceeded, invalidMirrorCandidateVol, noValidMirrorCandidate, remoteMaxMirrorsExceeded, remoteRvmFeatureDisabled, remoteMetadataVolNonexistent, rvmVersionMismatch, rvmRemoteArrayError, rvmCommunicationError. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetVolumeListForMirroringTest() throws ApiException {
        
        String systemId = null;
        
        MirrorCandidateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        MirrorVolumeCandidateList response = api.symbolGetVolumeListForMirroring(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used by the client to retrieve performance monitoring data for one or more volumes.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolGetVolumePerformanceTest() throws ApiException {
        
        String systemId = null;
        
        AbstractVolRefList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        VolumePerformanceList response = api.symbolGetVolumePerformance(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
