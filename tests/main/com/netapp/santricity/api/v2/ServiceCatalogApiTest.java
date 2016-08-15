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
* API tests for ServiceCatalogApi
*/
public class ServiceCatalogApiTest {
    private final ServiceCatalogApi api = new ServiceCatalogApi();
    
    /**
     * Retrieve the list of pools 
     *
     * Mode: Both Embedded and Proxy. Retrieve the list of pools and their service quality features. The list is sorted in descending order by the largest block of freeSpace that each has available.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllPoolsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<PoolQosResponse> response = api.getAllPools(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the list of volumes
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSSCVolumesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<UserVolume> response = api.getAllSSCVolumes(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve a pool by name or ID
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPoolTest() throws ApiException {
        
        String systemId = null;
        
        String poolId = null;
        
        try{
        PoolQosResponse response = api.getPool(systemId, poolId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve a volume by id or label
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSSCVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String volumeId = null;
        
        try{
        UserVolume response = api.getSSCVolume(systemId, volumeId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Define a new volume and configure its QOS parameters 
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newSSCVolumeTest() throws ApiException {
        
        String systemId = null;
        
        SscVolumeCreateRequest body = null;
        
        try{
        UserVolume response = api.newSSCVolume(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a volume by id or label
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSSCVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String volumeId = null;
        
        try{
        api.removeSSCVolume(systemId, volumeId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Update an existing volume
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSSCVolumeTest() throws ApiException {
        
        String systemId = null;
        
        String volumeId = null;
        
        SscVolumeUpdateRequest body = null;
        
        try{
        UserVolume response = api.updateSSCVolume(systemId, volumeId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
