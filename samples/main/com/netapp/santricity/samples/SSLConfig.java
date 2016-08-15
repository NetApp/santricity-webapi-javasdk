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
import com.netapp.santricity.api.v2.AdministrationApi;
import com.netapp.santricity.api.v2.StorageSystemsApi;
import com.netapp.santricity.models.v2.SSLCertConfiguration;
import com.netapp.santricity.models.v2.StorageSystemCreateRequest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * Sample code illustrates SDK usage for getting SSL configuration and uploading a CA Certificate.
 * NOTE: In oder for this to work right, either a valid CA certificate or a self-signed certificate needs to be uploaded
 * on to the server and Java trust store. Please refer the SANtricity REST API User guide section JAVA SDK on how to
 * setup HTTPS settings.
 */
public class SSLConfig {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        /**
         * Configure the ApiClient with the Santricity proxy HTTPS URL & set proper credentials
         */
        apiClient.setBasePath("https://localhost:8443/devmgr/v2");
        apiClient.setUsername("admin");
        apiClient.setPassword("admin");

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
            sleep(1000);                 // one second
            AdministrationApi adminApi = new AdministrationApi(apiClient);
            SSLCertConfiguration sslCertConfig = adminApi.getSSLConfiguration();
            sleep(1000);                 // one second
            System.out.println("DN : " + sslCertConfig.getDn());
            /**
             * Upload a valid CA Certificate
             */
            File caCertificate = new File("C:\\tmp\\ca.cert.pem");
            adminApi.uploadCACertificate(caCertificate);
        } catch (ApiException apiExp) {
            System.out.println("An exception occurred. Please check error: \n " + apiExp.getMessage());
        } catch (InterruptedException ex) {
            currentThread().interrupt();
        }
    }
}
