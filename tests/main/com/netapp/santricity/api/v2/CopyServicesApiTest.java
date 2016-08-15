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
* API tests for CopyServicesApi
*/
public class CopyServicesApiTest {
    private final CopyServicesApi api = new CopyServicesApi();
    
    /**
     * Convert a ReadOnly Snapshot Volume to ReadWrite mode
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertSnapshotVolumeToReadWriteTest() throws ApiException {
        
        String systemId = null;
        
        String viewId = null;
        
        SnapshotVolumeModeConversionRequest body = null;
        
        try{
        PitViewEx response = api.convertSnapshotVolumeToReadWrite(systemId, viewId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Expand a Concat Repository Volume by providing an expansion candidate.
     *
     * Mode: Both Embedded and Proxy. An expansion candidate of type \&quot;expansion\&quot; is only valid for ThinVolume repositories. ThinVolume repositories are likewise also limited to a single repository member, which prevents use of the \&quot;existingVol\&quot; and \&quot;newVol\&quot; expansion types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expandConcatVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        ConcatVolumeExpansionRequest body = null;
        
        try{
        ConcatRepositoryVolume response = api.expandConcatVolume(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the list of Concat Repository Volumes.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConcatRepositoryVolumesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<ConcatRepositoryVolume> response = api.getAllConcatRepositoryVolumes(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a list of all consistency group members
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConsistencyGroupMembersTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<PITCGMember> response = api.getAllConsistencyGroupMembers(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get ConsistencyGroup members
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConsistencyGroupMembersListTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        try{
        List<PITCGMember> response = api.getAllConsistencyGroupMembersList(systemId, cgId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a list of all consistency group snapshot views
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConsistencyGroupSnapshotViewsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<PITConsistencyGroupView> response = api.getAllConsistencyGroupSnapshotViews(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Snapshot views associated with the ConsistencyGroup
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConsistencyGroupSnapshotViewsListTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        try{
        List<PITConsistencyGroupView> response = api.getAllConsistencyGroupSnapshotViewsList(systemId, cgId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Snapshots associated with the ConsistencyGroup
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConsistencyGroupSnapshotsTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        try{
        List<Snapshot> response = api.getAllConsistencyGroupSnapshots(systemId, cgId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all consistency groups
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConsistencyGroupsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<PITConsistencyGroup> response = api.getAllConsistencyGroups(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get progress of all copy pairs
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCopyPairProgressTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<VolumeCopyProgress> response = api.getAllCopyPairProgress(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the repository usage statistics for all Legacy Snapshots.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLegacySnapshotRepoStatsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<RepositoryUtilization> response = api.getAllLegacySnapshotRepoStats(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Legacy Snapshots
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLegacySnapshotsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<LegacySnapshotEx> response = api.getAllLegacySnapshots(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the repository usage statistics for all SnapshotGroups.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSnapshotGroupRepoStatsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<PITGroupRepositoryUtilization> response = api.getAllSnapshotGroupRepoStats(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all Snapshot Groups
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSnapshotGroupsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<SnapshotGroup> response = api.getAllSnapshotGroups(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all Snapshot Schedules
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSnapshotSchedulesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<ScheduleInstance> response = api.getAllSnapshotSchedules(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the repository usage statistics for all SnapshotVolumes.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSnapshotVolumeRepoStatsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<PITViewRepositoryUtilization> response = api.getAllSnapshotVolumeRepoStats(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all Snapshot Volumes
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSnapshotVolumes_Test() throws ApiException {
        
        String systemId = null;
        
        try{
        List<PitViewEx> response = api.getAllSnapshotVolumes_(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all Snapshots
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSnapshotsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<Snapshot> response = api.getAllSnapshots(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of volume copy pairs
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllVolumeCopyPairsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<VolumeCopyPair> response = api.getAllVolumeCopyPairs(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a specific Concat Repository Volume.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConcatRepositoryVolumesTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        ConcatRepositoryVolume response = api.getConcatRepositoryVolumes(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Request a list of ConcatVolumeCandidates for a single base volume.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConcatVolumeCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        CVCandidateSelectionRequest body = null;
        
        try{
        List<CVCandidateResponse> response = api.getConcatVolumeCandidates(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get consistency group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsistencyGroupTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        PITConsistencyGroup response = api.getConsistencyGroup(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get ConsistencyGroup member
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsistencyGroupMembersTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        String volumeRef = null;
        
        try{
        PITCGMember response = api.getConsistencyGroupMembers(systemId, cgId, volumeRef);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a Snapshot view associated with the ConsistencyGroup
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsistencyGroupSnapshotViewTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        String viewId = null;
        
        try{
        PITConsistencyGroupView response = api.getConsistencyGroupSnapshotView(systemId, cgId, viewId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the underlying SnapshotVolumes associated with the PITConsistencyGroupView
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsistencyGroupSnapshotVolumesTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        String viewId = null;
        
        try{
        List<PitViewEx> response = api.getConsistencyGroupSnapshotVolumes(systemId, cgId, viewId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a set of Snapshots by sequenceNumber
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsistencyGroupSnapshotsTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        Long sequenceNumber = null;
        
        try{
        List<Snapshot> response = api.getConsistencyGroupSnapshots(systemId, cgId, sequenceNumber);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get progress of a copy pair
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCopyPairProgressTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        VolumeCopyProgress response = api.getCopyPairProgress(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Legacy Snapshot
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLegacySnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        LegacySnapshotEx response = api.getLegacySnapshot(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the repository usage statistics for a single Legacy Snapshot.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLegacySnapshotRepoStatsTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        RepositoryUtilization response = api.getLegacySnapshotRepoStats(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Request the best ConcatVolumeCandidate for multiple base volumes.
     *
     * Mode: Both Embedded and Proxy. If no candidate can be found for a particular base volume, a response with null Candidate will be returned in the list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMultipleConcatVolumeCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        CVCandidateMultipleSelectionRequest body = null;
        
        try{
        List<CVCandidateResponse> response = api.getMultipleConcatVolumeCandidates(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a Snapshot Volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        Snapshot response = api.getSnapshot(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a Snapshot Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotGroupTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        SnapshotGroup response = api.getSnapshotGroup(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the repository usage statistics for a single SnapshotGroup.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotGroupRepoStatsTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        PITGroupRepositoryUtilization response = api.getSnapshotGroupRepoStats(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a Snapshot Schedule
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotScheduleTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        ScheduleInstance response = api.getSnapshotSchedule(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a Snapshot Volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        PitViewEx response = api.getSnapshotVolume(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the repository usage statistics for a single SnapshotVolume.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotVolumeRepoStatsTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        PITViewRepositoryUtilization response = api.getSnapshotVolumeRepoStats(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a volume copy pair
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVolumeCopyPairTest() throws ApiException {
        
        String systemId = null;
        
        String vcId = null;
        
        try{
        VolumeCopyPair response = api.getVolumeCopyPair(systemId, vcId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create consistency group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConsistencyGroupTest() throws ApiException {
        
        String systemId = null;
        
        ConsistencyGroupCreateRequest body = null;
        
        try{
        PITConsistencyGroup response = api.newConsistencyGroup(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Add ConsistencyGroup member
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConsistencyGroupMemberTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        AddConsistencyGroupMemberRequest body = null;
        
        try{
        PITCGMember response = api.newConsistencyGroupMember(systemId, cgId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create ConsistencyGroup snapshot
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConsistencyGroupSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        CreateConsistencyGroupSnapshotRequest body = null;
        
        try{
        List<Snapshot> response = api.newConsistencyGroupSnapshot(systemId, cgId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create Snapshot Views from a ConsistencyGroup Snapshot
     *
     * Mode: Both Embedded and Proxy. A pitId or a pitSequenceNumber can be provided to this endpoint in order to create a snapshotView. If a pitId is provided, only a single view will be created. If a pitSequenceNumber is provided, a snapshotView will be created for each Snapshot associated with the sequenceNumber.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConsistencyGroupSnapshotViewTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        CreateConsistencyGroupSnapshotViewRequest body = null;
        
        try{
        PITConsistencyGroupView response = api.newConsistencyGroupSnapshotView(systemId, cgId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create Snapshot Views from a ConsistencyGroup Snapshot
     *
     * Mode: Both Embedded and Proxy. This endpoint provides more granularity and customization in creating a view than the non-batch endpoint. For each snapshot that you wish for a view to be created of, a CGSnapshotViewRequest must be provided that defines the parameters (including a repository candidate, if necessary [See repositories/concat]). Each Snapshot provided MUST be under the same pitSequenceNumber.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConsistencyGroupSnapshotViewDetailedTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        CreateCGSnapshotViewManualRequest body = null;
        
        try{
        PITConsistencyGroupView response = api.newConsistencyGroupSnapshotViewDetailed(systemId, cgId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create Legacy Snapshot
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newLegacySnapshotTest() throws ApiException {
        
        String systemId = null;
        
        LegacySnapshotCreateRequest body = null;
        
        try{
        LegacySnapshotEx response = api.newLegacySnapshot(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Add multiple ConsistencyGroup members at once
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newMultipleConsistencyGroupMembersTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        AddBatchCGMembersRequest body = null;
        
        try{
        List<PITCGMember> response = api.newMultipleConsistencyGroupMembers(systemId, cgId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a Snapshot
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotCreateRequest body = null;
        
        try{
        Snapshot response = api.newSnapshot(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a Snapshot Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newSnapshotGroupTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotGroupCreateRequest body = null;
        
        try{
        SnapshotGroup response = api.newSnapshotGroup(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a Snapshot Volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newSnapshotVolumeTest() throws ApiException {
        
        String systemId = null;
        
        SnapshotViewCreateRequest body = null;
        
        try{
        PitViewEx response = api.newSnapshotVolume(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a new volume copy pair
     *
     * Mode: Both Embedded and Proxy. Establish a new volume copy pair by providing a source and a target volume. The target volume must be of greater or equal size to the source.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newVolumeCopyPairTest() throws ApiException {
        
        String systemId = null;
        
        VolumeCopyCreateRequest body = null;
        
        try{
        VolumeCopyPair response = api.newVolumeCopyPair(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete consistency group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeConsistencyGroupTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeConsistencyGroup(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove ConsistencyGroup member
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeConsistencyGroupMemberTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        String volumeRef = null;
        
        Boolean retainRepositories = null;
        
        try{
        api.removeConsistencyGroupMember(systemId, cgId, volumeRef, retainRepositories);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove ConsistencyGroup snapshot
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeConsistencyGroupSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        Long sequenceNumber = null;
        
        try{
        api.removeConsistencyGroupSnapshot(systemId, cgId, sequenceNumber);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete an existing Snapshot View
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeConsistencyGroupSnapshotViewTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        String viewId = null;
        
        try{
        api.removeConsistencyGroupSnapshotView(systemId, cgId, viewId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a Legacy Snapshot
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeLegacySnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeLegacySnapshot(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a Snapshot Volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeSnapshot(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a Snapshot Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSnapshotGroupTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeSnapshotGroup(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a Snapshot Volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSnapshotVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeSnapshotVolume(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove a volume copy pair
     *
     * Mode: Both Embedded and Proxy. Online volume copies, or copies based on snapshots, require multiple operations to delete all repository volumes (if enabled). If there is a service interruption, it is possible that all repository volumes will not be deleted.These repository volumes can be retrieved using the volumes resource, and will be marked with a volumeUse of &#39;freeRepositoryVolume&#39;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeVolumeCopyPairTest() throws ApiException {
        
        String systemId = null;
        
        String vcId = null;
        
        Boolean retainRepositories = null;
        
        try{
        api.removeVolumeCopyPair(systemId, vcId, retainRepositories);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Rollback a ConsistencyGroup snapshot
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rollbackConsistencyGroupSnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String cgId = null;
        
        Long sequenceNumber = null;
        
        try{
        api.rollbackConsistencyGroupSnapshot(systemId, cgId, sequenceNumber);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update consistency group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConsistencyGroupTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        ConsistencyGroupUpdateRequest body = null;
        
        try{
        PITConsistencyGroup response = api.updateConsistencyGroup(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Start/Stop a copy pair operation
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCopyPairOperationTest() throws ApiException {
        
        String systemId = null;
        
        String ids = null;
        
        String control = null;
        
        try{
        List<VolumeCopyProgress> response = api.updateCopyPairOperation(systemId, ids, control);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update a Legacy Snapshot
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLegacySnapshotTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        LegacySnapshotUpdateRequest body = null;
        
        try{
        LegacySnapshotEx response = api.updateLegacySnapshot(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update a Snapshot Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSnapshotGroupTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        SnapshotGroupUpdateRequest body = null;
        
        try{
        SnapshotGroup response = api.updateSnapshotGroup(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update a Snapshot Volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSnapshotVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        SnapshotViewUpdateRequest body = null;
        
        try{
        PitViewEx response = api.updateSnapshotVolume(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update parameters of a volume copy pair
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVolumeCopyPairParametersTest() throws ApiException {
        
        String systemId = null;
        
        String vcId = null;
        
        VolumeCopyUpdateRequest body = null;
        
        try{
        VolumeCopyPair response = api.updateVolumeCopyPairParameters(systemId, vcId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
