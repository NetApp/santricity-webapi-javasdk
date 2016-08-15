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
import com.netapp.santricity.models.v2.DeviceAlertConfiguration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * Sample code illustrates SDK usage for configuring alets on one or more E2800
 */
public class DeviceAlerts {
    public static void main(String args[]) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File("samples/main/com/netapp/santricity/samples/alerts_cfg.txt"));
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                if(line.contains("#")) continue; //Skip the 1st header line
                String [] cfg = line.split(",");
                configureAlerts(cfg[0], cfg[1], cfg[2]);
            }
            scanner.close();
        } catch (FileNotFoundException exp) {
            exp.printStackTrace();
        }


    }

    public static void configureAlerts(String proxy, String username, String pwd ) {
        ApiClient apiClient = new ApiClient();
        // Set the systemID of the array configured on the proxy.
        // For embedded API on E2800 controllers the systemId is "1".
        // Configure each of these variables appropriately for your environment
        String systemId = "1";
        String proxyURL = "http://"+ proxy + "/devmgr/v2";
        //String proxyURL = "https://10.113.76.55:8443/devmgr/v2";
        /**
         * Configure the ApiClient with the Santricity proxy URL & set proper credentials
         */
        apiClient.setBasePath(proxyURL);
        apiClient.setUsername(username);
        apiClient.setPassword(pwd);
        //Disable SSL certificate verification
        //apiClient.disableSSLVerification();

        try {
            DiagnosticsApi alertsApi = new DiagnosticsApi(apiClient);
            sleep(1000);
            DeviceAlertConfiguration alertCfg = alertsApi.getAlertConfiguration(systemId);
            System.out.println("Alerts configuration...");
            sleep(1000);
            System.out.println(alertCfg.getEmailSenderAddress() + " " + alertCfg.getEmailServerAddress()
                    + " " + alertCfg.getAlertingEnabled() + " " + alertCfg.getAdditionalContactInformation());

            sleep(1000);
            alertCfg.setEmailSenderAddress("testemail@netapp.com"); //setting a dummy email address
            alertsApi.updateAlertConfiguration(systemId, alertCfg); // update the alert config
            sleep(1000);
        } catch (ApiException apiExp) {
            apiExp.printStackTrace();
        } catch(InterruptedException inExp) {
            inExp.printStackTrace();
        }
    }
}
