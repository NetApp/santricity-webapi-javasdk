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


package com.netapp.santricity.samples;

import com.netapp.santricity.ApiClient;
import com.netapp.santricity.ApiException;
import com.netapp.santricity.api.symbol.GApi;
import com.netapp.santricity.api.v2.StorageSystemsApi;
import com.netapp.santricity.models.symbol.SAData;
import com.netapp.santricity.models.v2.StorageSystemCreateRequest;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * Sample code illustrates SDK usage for gathering the needs attention condition
 * Typically used in conjunction with the failure list api
 */
public class GetNeedsAttention {
    public static void main(String args[]) {
        ApiClient apiClient = new ApiClient();
        /**
         * Configure the ApiClient with the Santricity proxy URL & set proper credentials
         */
        apiClient.setBasePath("http://localhost:8080/devmgr/v2");
        apiClient.setUsername("rw");
        apiClient.setPassword("rw");

        /**
         * Add a storage system to the proxy
         */
        String sysId = "config1";
        StorageSystemsApi ssApi = new StorageSystemsApi(apiClient);
        StorageSystemCreateRequest ssCreatReq = new StorageSystemCreateRequest();
        List<String> ctrlAddrs = new ArrayList<String>();
        ctrlAddrs.add("<Ctrl A IP Address>");
        ctrlAddrs.add("<Ctrl B IP Address>");
        ssCreatReq.setControllerAddresses(ctrlAddrs);
        ssCreatReq.setId(sysId);

        try {
            ssApi.newStorageSystem(ssCreatReq);
            sleep(1000);                 //1000 milliseconds is one second.
            GApi symApi = new GApi(apiClient);
            SAData saData = symApi.symbolGetSAData(sysId, "auto", false);
            System.out.println("Is Needs Attention? : "+ saData.getNeedsAttention());
        } catch (ApiException apiExp) {
            System.out.println("An exception occurred. Please check error: \n " + apiExp.getMessage());
        } catch (InterruptedException ex) {
            currentThread().interrupt();
        }
    }
}
