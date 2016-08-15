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
* API tests for VolumesApi
*/
public class VolumesApiTest {
    private final VolumesApi api = new VolumesApi();
    
    /**
     * Perform a RAID type migration on a storage pool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeRAIDTypeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        RaidMigrationRequest body = null;
        
        try{
        VolumeGroupEx response = api.changeRAIDType(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Expand the capacity of a StoragePool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expandStoragePoolCapacityTest() throws ApiException {
        
        String systemId = null;
        
        String poolId = null;
        
        StoragePoolExpansionRequest body = null;
        
        try{
        VolumeGroupEx response = api.expandStoragePoolCapacity(systemId, poolId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Expand a ThinVolume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expandThinVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        ThinVolumeExpansionRequest body = null;
        
        try{
        ThinVolumeEx response = api.expandThinVolume(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * @deprecated NOTE: This method has been DEPRECATED
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expandThinVolumeCapacityOldTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        ThinVolumeExpansionRequest body = null;
        
        try{
        api.expandThinVolumeCapacityOld(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Export a full disk encryption key 
     *
     * Mode: Both Embedded and Proxy. The response type of this method is a file stream. Use secure pass phrase for additional security instead of pass phrase.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportFDEKeyTest() throws ApiException {
        
        String systemId = null;
        
        String passPhrase = null;
        
        String fileName = null;
        
        try{
        File response = api.exportFDEKey(systemId, passPhrase, fileName);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the access volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessVolumeTest() throws ApiException {
        
        String systemId = null;
        
        try{
        AccessVolumeEx response = api.getAccessVolume(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the list of LunMappings
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLunMappingsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<LUNMapping> response = api.getAllLunMappings(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a list of all mappable objects
     *
     * Mode: Both Embedded and Proxy. Provides a simplified way to discover the type of mappable object from an id/reference.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMappableObjectsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<MappableObject> response = api.getAllMappableObjects(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get list of storage pools
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStoragePoolsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<VolumeGroupEx> response = api.getAllStoragePools(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of ThinVolumes
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllThinVolumesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<ThinVolumeEx> response = api.getAllThinVolumes(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of volumes
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllVolumesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<VolumeEx> response = api.getAllVolumes(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve a LunMapping
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLunMappingTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        LUNMapping response = api.getLunMapping(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a specific mappable object
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMappableObjectTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        MappableObject response = api.getMappableObject(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a storage pool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        VolumeGroupEx response = api.getStoragePool(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve a list of expansion candidates for a StoragePool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolExpansionCandidatesTest() throws ApiException {
        
        String systemId = null;
        
        String poolId = null;
        
        try{
        List<VolumeGroupExpansionCandidate> response = api.getStoragePoolExpansionCandidates(systemId, poolId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Check the progress of a long-running action on a storage pool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolProgressTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        List<OperationProgress> response = api.getStoragePoolProgress(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get maximum number of drives that can be removed from a StoragePool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolRemovableDrivesTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        RemovableDriveResponse response = api.getStoragePoolRemovableDrives(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a ThinVolume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getThinVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        ThinVolumeEx response = api.getThinVolume(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * @deprecated NOTE: This method has been DEPRECATED
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getThinVolume2Test() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.getThinVolume2(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * @deprecated NOTE: This method has been DEPRECATED
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getThinVolumes2Test() throws ApiException {
        
        String systemId = null;
        
        try{
        api.getThinVolumes2(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a specific volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        VolumeEx response = api.getVolume(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the volume expansion progress
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVolumeExpansionProgressTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        VolumeActionProgressResponse response = api.getVolumeExpansionProgress(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * @deprecated NOTE: This method has been DEPRECATED
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVolumeExpansionProgress2Test() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.getVolumeExpansionProgress2(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Import a full disk encryption key
     *
     * Mode: Both Embedded and Proxy. Use secure pass phrase for additional security instead of pass phrase.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importFDEKeyTest() throws ApiException {
        
        String systemId = null;
        
        String passPhrase = null;
        
        File keyfile = null;
        
        String securePassPhrase = null;
        
        try{
        api.importFDEKey(systemId, passPhrase, keyfile, securePassPhrase);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Initialize a ThinVolume
     *
     * Mode: Both Embedded and Proxy. Reinitialize the target thin volume, wiping out all existing data!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeThinVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String thinVolumeId = null;
        
        try{
        ThinVolumeEx response = api.initializeThinVolume(systemId, thinVolumeId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Initialize a volume
     *
     * Mode: Both Embedded and Proxy. This procedure causes the specified volume to be re-initialized. All data that is currently present on the volume will be irretrievably lost as a result of this operation. Once a format operation starts, the volume&#39;s action field will be changed to &#39;initializing&#39;; the getVolumeActionProgress procedure can then be used to monitor the progress of the operation. Volume format operations are typically required only when reviving a volume that has been marked failed for some reason. Newly-created volumes need not be explicitly formatted using this procedure.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String volumeId = null;
        
        try{
        VolumeEx response = api.initializeVolume(systemId, volumeId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Move a LunMapping to a different host or host group
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveLunMappingTest() throws ApiException {
        
        String systemId = null;
        
        String mappingId = null;
        
        VolumeMappingMoveRequest body = null;
        
        try{
        LUNMapping response = api.moveLunMapping(systemId, mappingId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create or change a full disk encryption key
     *
     * Mode: Both Embedded and Proxy. The result of this method is the creation of a new key file. Retrieve with the /file/{filename} endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newFDEKeyTest() throws ApiException {
        
        String systemId = null;
        
        SecureVolumeKeyRequest body = null;
        
        try{
        SecureVolumeKeyResponse response = api.newFDEKey(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a new LunMapping
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newLunMappingTest() throws ApiException {
        
        String systemId = null;
        
        VolumeMappingCreateRequest body = null;
        
        try{
        LUNMapping response = api.newLunMapping(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a storage pool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newStoragePoolTest() throws ApiException {
        
        String systemId = null;
        
        StoragePoolCreateRequest body = null;
        
        try{
        VolumeGroupEx response = api.newStoragePool(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a ThinVolume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newThinVolumeTest() throws ApiException {
        
        String systemId = null;
        
        ThinVolumeCreateRequest body = null;
        
        try{
        ThinVolumeEx response = api.newThinVolume(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a new volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newVolumeTest() throws ApiException {
        
        String systemId = null;
        
        VolumeCreateRequest body = null;
        
        try{
        VolumeEx response = api.newVolume(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove a LunMapping
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeLunMappingTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeLunMapping(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a storage pool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeStoragePoolTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        Boolean deleteVolumes = null;
        
        try{
        api.removeStoragePool(systemId, id, deleteVolumes);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Reduce the number of drives of a StoragePool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeStoragePoolDriveTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        DiskPoolReductionRequest body = null;
        
        try{
        VolumeGroupEx response = api.removeStoragePoolDrive(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a ThinVolume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeThinVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeThinVolume(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeVolume(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Start the volume expansion
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startVolumeExpansionTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        VolumeExpansionRequest body = null;
        
        try{
        VolumeActionProgressResponse response = api.startVolumeExpansion(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * @deprecated NOTE: This method has been DEPRECATED
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startVolumeExpansion2Test() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        VolumeExpansionRequest body = null;
        
        try{
        api.startVolumeExpansion2(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update a storage pool
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStoragePoolTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        StoragePoolUpdateRequest request = null;
        
        try{
        VolumeGroupEx response = api.updateStoragePool(systemId, id, request);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update a ThinVolume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateThinVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        ThinVolumeUpdateRequest body = null;
        
        try{
        ThinVolumeEx response = api.updateThinVolume(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update volume parameters
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        VolumeUpdateRequest body = null;
        
        try{
        VolumeEx response = api.updateVolume(systemId, id, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Validate a full disk encryption key
     *
     * Mode: Both Embedded and Proxy. Use secure pass phrase for additional security instead of pass phrase.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateFDEKeyTest() throws ApiException {
        
        String systemId = null;
        
        File keyfile = null;
        
        String passPhrase = null;
        
        String securePassPhrase = null;
        
        try{
        api.validateFDEKey(systemId, keyfile, passPhrase, securePassPhrase);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
