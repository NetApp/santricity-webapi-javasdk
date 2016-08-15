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
import com.netapp.santricity.api.v2.DiagnosticsApi;
import com.netapp.santricity.models.v2.SupportDataRequest;
import com.netapp.santricity.models.v2.InitialAsyncResponse;
import com.netapp.santricity.models.v2.SupportDataResponse;
import com.netapp.santricity.api.v2.FileManagementApi;

import java.io.File;
import java.lang.Boolean;
import java.lang.InterruptedException;
import java.lang.Thread;
import static java.lang.Thread.*;


/**
 * Sample code illustrates SDK usage for fetching support bundle on E2800 array
 */
public class SupportBundle {
    public static void main(String args[]) {
        ApiClient apiClient = new ApiClient();
        // Set the systemID of the array configured on the proxy.
        // For embedded API on E2800 controllers the systemId is "1".
        // Configure each of these variables appropriately for your environment
        String systemId = "1";
        String proxyURL = "http://localhost:8080/devmgr/v2";
        String username = "rw";
        String password = "rw";
        //String proxyURL = "https://10.113.76.55:8443/devmgr/v2";
        /**
         * Configure the ApiClient with the Santricity proxy URL & set proper credentials
         */
        apiClient.setBasePath(proxyURL);
        apiClient.setUsername(username);
        apiClient.setPassword(password);
        //Disable SSL certificate verification
       // apiClient.disableSSLVerification();
        System.out.println("Generating support bundle for system " + systemId + " on proxy " + proxyURL + ".");
        /**
         * Create the Diagnostics API object to use the methods to trigger the
         * support bundle creation and check it's progress so we know when we
         * can download the bundle.
         */
        DiagnosticsApi apiDiagnostics = new DiagnosticsApi(apiClient);
        SupportDataRequest supportRequest = new SupportDataRequest();
        supportRequest.setType(com.netapp.santricity.models.v2.SupportDataRequest.TypeEnum.supportBundle);
        supportRequest.setFilename("sample-bundle");
        File localFile = null;
        /**
         * The API calls may throw an APIException, so we need to handle that.
         */
        try{
            /**
             * Send the command to generate a new support bundle.
             */
            InitialAsyncResponse initResponse;
            initResponse = apiDiagnostics.startSupportDataRetrievalRequest(systemId, supportRequest);
            /**
             * Now let's periodically check on the status of the support bundle
             * to see if it's ready to download.
             */
            Boolean bundleReady = false;
            SupportDataResponse statusResponse = null;
            System.out.println("Checking the status of the bundle creation.  Note this may take a few minutes and progress may appear to be slow at times.");
            while (!bundleReady){
                statusResponse = apiDiagnostics.getSupportDataRetrievalRequestStatus(systemId, initResponse.getRequestId());
                bundleReady = statusResponse.getProgress().getComplete();
                System.out.println("Bundle completion status: " + statusResponse.getProgress().getPercentage().toString());
                Thread.sleep(10000);
            }
            /**
             * Now the support bundle is in the file management "scratch" area.
             * Just retrieve the file from that area by name.
             */
            FileManagementApi fileApi = new FileManagementApi(apiClient);
            localFile = fileApi.getFileFromScratchDir(statusResponse.getFilename(),true);
        }catch (ApiException ae){
            System.out.println("An exception occurred. Please check error: \n " + ae.getMessage());
        }catch (InterruptedException e){
            currentThread().interrupt();
        } finally {
            if(localFile != null){
                System.out.println("The support bundle was saved as " + localFile.toString());
            }else {
                System.out.println("There was a problem and the support bundle was not saved.");
            }
        }

    }

}