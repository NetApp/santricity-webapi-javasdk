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
* API tests for MirroringApi
*/
public class MirroringApiTest {
    private final MirroringApi api = new MirroringApi();
    
    /**
     * Begin synchronization of an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void beginSynchronizationAMGTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        AsyncMirrorGroupSyncRequest body = null;
        
        try{
        api.beginSynchronizationAMG(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Complete an incomplete Async Mirror relationship
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeIncompleteAMGTest() throws ApiException {
        
        String systemId = null;
        
        String incompleteMirrorId = null;
        
        AsyncMirrorGroupMemberCompletionRequest body = null;
        
        try{
        AmgMember response = api.completeIncompleteAMG(systemId, incompleteMirrorId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a specific Async Mirror Group Member
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAMGMemberTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        AmgMember response = api.getAMGMember(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve a member volume associated with an AMG
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAMGMemberVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String mirrorId = null;
        
        String id = null;
        
        try{
        AmgMember response = api.getAMGMemberVolume(systemId, mirrorId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve sync progress of an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAMGSyncProgressTest() throws ApiException {
        
        String systemId = null;
        
        String mirrorGroupId = null;
        
        try{
        AsyncMirrorGroupSyncProgress response = api.getAMGSyncProgress(systemId, mirrorGroupId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the member volumes associated with an AMG
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAMGMemberVolumesTest() throws ApiException {
        
        String systemId = null;
        
        String mirrorId = null;
        
        try{
        List<AmgMember> response = api.getAllAMGMemberVolumes(systemId, mirrorId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all Async Mirror Group Members
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAMGMembersTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<AmgMember> response = api.getAllAMGMembers(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the sync progress of all Async Mirror Groups at once
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAMGSyncProgressTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<AsyncMirrorGroupSyncProgress> response = api.getAllAMGSyncProgress(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the repository usage statistics for all AmgMembers.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAmgMemberRepositoryStatsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<AsyncMirrorRepositoryUtilization> response = api.getAllAmgMemberRepositoryStats(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Async Mirror Groups
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAsyncMirrorGroupsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<Amg> response = api.getAllAsyncMirrorGroups(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Remote Volume Mirrors
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRemoteVolumeMirrorsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<RemoteMirrorPair> response = api.getAllRemoteVolumeMirrors(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the repository usage statistics for a single AmgMember.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAmgMemberRepositoryStatsTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        AsyncMirrorRepositoryUtilization response = api.getAmgMemberRepositoryStats(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAsyncMirrorGroupTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        Amg response = api.getAsyncMirrorGroup(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a list of storage-systems that support Asynchronous Mirroring
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAsyncMirrorStorageSystemListTest() throws ApiException {
        
        String systemId = null;
        
        Boolean compatibleOnly = null;
        
        try{
        List<RemoteCandidate> response = api.getAsyncMirrorStorageSystemList(systemId, compatibleOnly);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Async Mirror Group relationships that have not yet been completed
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncompleteAMGTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<AmgIncompleteMember> response = api.getIncompleteAMG(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Async Mirror Group relationships that have not yet been completed
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncompleteAMGMirrorIDTest() throws ApiException {
        
        String systemId = null;
        
        String mirrorId = null;
        
        try{
        List<AmgIncompleteMember> response = api.getIncompleteAMGMirrorID(systemId, mirrorId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the current remote StorageDevice mirroring connections for an Amg
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteAmgMirrorConnectionsTest() throws ApiException {
        
        String systemId = null;
        
        String mirrorGroupId = null;
        
        try{
        AsyncMirrorConnectionsResponse response = api.getRemoteAmgMirrorConnections(systemId, mirrorGroupId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the current remote StorageDevice mirroring connections
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteMirrorConnectionsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<AsyncMirrorConnectionsResponse> response = api.getRemoteMirrorConnections(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Remote Volume Mirror
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteVolumeMirrorTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        RemoteMirrorPair response = api.getRemoteVolumeMirror(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve potential mirror candidates for a volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteVolumeMirrorCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        String volumeId = null;
        
        try{
        List<RemoteMirrorCandidate> response = api.getRemoteVolumeMirrorCandidates(systemId, volumeId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Remote Mirror synchronization status
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteVolumeMirrorSyncProcessTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        JobProgress response = api.getRemoteVolumeMirrorSyncProcess(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Add a new member to an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newAMGMemberTest() throws ApiException {
        
        String systemId = null;
        
        String mirrorId = null;
        
        AsyncMirrorGroupMemberCreateRequest body = null;
        
        try{
        AmgMember response = api.newAMGMember(systemId, mirrorId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newAsyncMirrorGroupTest() throws ApiException {
        
        String systemId = null;
        
        AsyncMirrorGroupCreateRequest body = null;
        
        try{
        Amg response = api.newAsyncMirrorGroup(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create Remote Volume Mirror
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newRemoteVolumeMirrorTest() throws ApiException {
        
        String systemId = null;
        
        RemoteVolumeMirrorCreateRequest body = null;
        
        try{
        RemoteMirrorPair response = api.newRemoteVolumeMirror(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove a member from an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAMGMemberTest() throws ApiException {
        
        String systemId = null;
        
        String mirrorId = null;
        
        String id = null;
        
        try{
        api.removeAMGMember(systemId, mirrorId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAsyncMirrorGroupTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeAsyncMirrorGroup(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove an Async Mirror relationship that has not been completed
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeIncompleteAsyncMirrorRelationshipTest() throws ApiException {
        
        String systemId = null;
        
        String incompleteMirrorId = null;
        
        try{
        api.removeIncompleteAsyncMirrorRelationship(systemId, incompleteMirrorId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove a Remote Volume Mirror
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeRemoteVolumeMirrorTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeRemoteVolumeMirror(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Resume synchronization of an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resumeSynchronizationAMGTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        Boolean deleteRecoveryPointIfNecessary = null;
        
        try{
        api.resumeSynchronizationAMG(systemId, id, deleteRecoveryPointIfNecessary);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Suspend synchronization of an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suspendSynchronizationAMGTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.suspendSynchronizationAMG(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Test connectivity of an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testConnectivityAMGTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        AsyncMirrorGroupConnectivityTestRequest body = null;
        
        try{
        List<AsyncCommunicationData> response = api.testConnectivityAMG(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Test Remote Mirror Communication
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testRemoteVolumeMirrorCommunicationTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        RemoteCommunicationData response = api.testRemoteVolumeMirrorCommunication(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update an Async Mirror Group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAsyncMirrorGroupTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        AsyncMirrorGroupUpdateRequest body = null;
        
        try{
        Amg response = api.updateAsyncMirrorGroup(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update the mirror role of an Async Mirror Group.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMirrorRoleAMGTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        AsyncMirrorGroupRoleUpdateRequest body = null;
        
        try{
        api.updateMirrorRoleAMG(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update a Remote Volume Mirror
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteVolumeMirrorTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        RemoteVolumeMirrorUpdateRequest body = null;
        
        try{
        RemoteMirrorPair response = api.updateRemoteVolumeMirror(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
