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
* API tests for StorageSystemsApi
*/
public class StorageSystemsApiTest {
    private final StorageSystemsApi api = new StorageSystemsApi();
    
    /**
     * Cancel discovery operation
     *
     * Proxy Only. Cancel a running discovery operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelDiscoveryOperationTest() throws ApiException {
        
        try{
        api.cancelDiscoveryOperation();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Configure the ethernet management connections on a controller
     *
     * Mode: Both Embedded and Proxy. Update the ethernet management connection configuration. &lt;br&gt; This operation can lead to an inaccessible controller if performed incorrectly or if incorrect ip addresses, gateway addresses, etc, are provided. Configuration is performed by connecting to the alternate controller, so it must be accessible for the operation to succeed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configureEthernetInterfacesTest() throws ApiException {
        
        String systemId = null;
        
        ManagementConfigurationRequest body = null;
        
        try{
        ManagementInterface response = api.configureEthernetInterfaces(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Discover StorageDevices on the network
     *
     * Mode: Proxy only. Initiate a discovery operation on a range of IP addresses. Retrieve the results using a GET.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void discoverStorageDevicesTest() throws ApiException {
        
        DiscoveryStartRequest body = null;
        
        try{
        DiscoverResponse response = api.discoverStorageDevices(body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Enable a feature pack.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableFeaturePackTest() throws ApiException {
        
        String systemId = null;
        
        File keyFile = null;
        
        try{
        api.enableFeaturePack(systemId, keyFile);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Enable a premium feature.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enablePremiumFeatureTest() throws ApiException {
        
        String systemId = null;
        
        File keyFile = null;
        
        try{
        api.enablePremiumFeature(systemId, keyFile);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all Folders
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFoldersTest() throws ApiException {
        
        try{
        List<Folder> response = api.getAllFolders();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get list of storage-systems
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStorageSystemsTest() throws ApiException {
        
        try{
        List<StorageSystemResponse> response = api.getAllStorageSystems();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get discovery results
     *
     * Mode: Proxy only. Retrieve the results of a discovery operation on a range of IP addresses. Recent previous results can be retrieved using their requestId.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDiscoveryResultsTest() throws ApiException {
        
        Long requestId = null;
        
        try{
        DiscoverResponse response = api.getDiscoveryResults(requestId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list of ethernet interfaces
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEthernetInterfacesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<ManagementInterface> response = api.getEthernetInterfaces(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve one or more elements from the ObjectGraph using an XPath expression.
     *
     * Mode: Both Embedded and Proxy. This method is used to query the ObjectGraph for one or more elements. &lt;br/&gt; &lt;b&gt;Examples:&lt;/b&gt; &lt;br/&gt; &lt;ul&gt;&lt;li&gt;Retrieve the list of drives: /drive &lt;/li&gt; &lt;li&gt;Locate all instances of an attribute called \&quot;id\&quot;: //id &lt;/li&gt; &lt;li&gt;Find a thinVolume with an id of \&quot;1\&quot;: /highLevelVolBundle/thinVolume[id=\&quot;1\&quot;]&lt;/li&gt;&lt;li&gt;Find all thin volumes and volumes inefficiently: //volume | //thinVolume&lt;/li&gt;&lt;li&gt;Get the NSVRAM version from saData: /sa/saData/nvsramVersion&lt;/li&gt;&lt;/ul&gt;&lt;b&gt;References: &lt;/b&gt; http://www.w3schools.com/xsl/xpath_intro.asp
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilteredObjectGraphTest() throws ApiException {
        
        String systemId = null;
        
        String query = null;
        
        try{
        List<Object> response = api.getFilteredObjectGraph(systemId, query);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a Folder
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFolderTest() throws ApiException {
        
        String folderId = null;
        
        try{
        Folder response = api.getFolder(folderId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve information about the storage system lockdown status.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLockdownStatusResponseTest() throws ApiException {
        
        String systemId = null;
        
        try{
        LockdownStatusResponse response = api.getLockdownStatusResponse(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the ObjectGraph, which contains all configuration details for the storage-system.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getObjectGraphTest() throws ApiException {
        
        String systemId = null;
        
        try{
        ObjectBundle response = api.getObjectGraph(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the password status of the StorageDevice
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPasswordStatusTest() throws ApiException {
        
        String systemId = null;
        
        try{
        PasswordStatusResponse response = api.getPasswordStatus(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get StorageDevices associated with a Folder
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStorageDeviceWithFolderTest() throws ApiException {
        
        String folderId = null;
        
        try{
        List<String> response = api.getStorageDeviceWithFolder(folderId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a specific storage-system
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStorageSystemTest() throws ApiException {
        
        String systemId = null;
        
        try{
        StorageSystemResponse response = api.getStorageSystem(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get StorageDevice capabilities.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStorageSystemCapabilitiesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        CapabilitiesResponse response = api.getStorageSystemCapabilities(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a Folder
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newFolderTest() throws ApiException {
        
        FolderCreateRequest body = null;
        
        try{
        Folder response = api.newFolder(body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Add a storage-system
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newStorageSystemTest() throws ApiException {
        
        StorageSystemCreateRequest body = null;
        
        try{
        AddStorageSystemReturn response = api.newStorageSystem(body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove all feature packs.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFeaturePackTest() throws ApiException {
        
        String systemId = null;
        
        try{
        api.removeFeaturePack(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a Folder
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFolderTest() throws ApiException {
        
        String folderId = null;
        
        try{
        CallResponse response = api.removeFolder(folderId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove a premium feature.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removePremiumFeatureTest() throws ApiException {
        
        String systemId = null;
        
        String capability = null;
        
        try{
        api.removePremiumFeature(systemId, capability);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Remove one or more storage-systems. The path is a comma seperated list of IDs
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeStorageSystemTest() throws ApiException {
        
        String systemId = null;
        
        try{
        api.removeStorageSystem(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Set the password of the StorageDevice
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPasswordTest() throws ApiException {
        
        String systemId = null;
        
        PasswordSetRequest body = null;
        
        try{
        api.setPassword(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update a Folder
     *
     * Mode: Proxy only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFolderTest() throws ApiException {
        
        String folderId = null;
        
        FolderUpdateRequest body = null;
        
        try{
        Folder response = api.updateFolder(folderId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Set the name of the StorageDevice
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStorageDeviceNameTest() throws ApiException {
        
        String systemId = null;
        
        StorageSystemConfigUpdateRequest body = null;
        
        try{
        StorageSystemConfigResponse response = api.updateStorageDeviceName(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update a storage-system
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStorageSystemTest() throws ApiException {
        
        String systemId = null;
        
        StorageSystemUpdateRequest updateRequest = null;
        
        try{
        StorageSystemResponse response = api.updateStorageSystem(systemId, updateRequest);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Validate the stored password for a storage-system
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateStorageSystemPasswordTest() throws ApiException {
        
        String systemId = null;
        
        try{
        api.validateStorageSystemPassword(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
