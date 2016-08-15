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
* API tests for WorkloadsApi
*/
public class WorkloadsApiTest {
    private final WorkloadsApi api = new WorkloadsApi();
    
    /**
     * Create a copy of an existing workload
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyWorkloadTest() throws ApiException {
        
        String systemId = null;
        
        String workloadId = null;
        
        WorkloadCopyRequest data = null;
        
        try{
        WorkloadModel response = api.copyWorkload(systemId, workloadId, data);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all defined workloads
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDefinedWorkloadsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<WorkloadModel> response = api.getAllDefinedWorkloads(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a given defined workload
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDefinedWorkloadsTest() throws ApiException {
        
        String systemId = null;
        
        String workloadId = null;
        
        try{
        WorkloadModel response = api.getDefinedWorkloads(systemId, workloadId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create a workload
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newWorkloadTest() throws ApiException {
        
        String systemId = null;
        
        WorkloadCreateRequest data = null;
        
        try{
        WorkloadModel response = api.newWorkload(systemId, data);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Delete a workload
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeWorkloadTest() throws ApiException {
        
        String systemId = null;
        
        String workloadId = null;
        
        try{
        api.removeWorkload(systemId, workloadId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Modify an existing workload
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkloadTest() throws ApiException {
        
        String systemId = null;
        
        String workloadId = null;
        
        WorkloadUpdateRequest data = null;
        
        try{
        WorkloadModel response = api.updateWorkload(systemId, workloadId, data);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
