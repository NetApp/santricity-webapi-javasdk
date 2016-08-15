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
import com.netapp.santricity.api.v2.StorageSystemsApi;
import com.netapp.santricity.models.v2.AlertSyslogConfiguration;
import com.netapp.santricity.models.v2.AlertSyslogResponse;
import com.netapp.santricity.models.v2.AlertSyslogServer;
import com.netapp.santricity.models.v2.StorageSystemCreateRequest;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * Sample code illustrates SDK usage for configuring & test syslog receivers
 */
public class SysLogReceivers {
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
            sleep(1000);                 //1000 milliseconds is one seconds

            DiagnosticsApi diag = new DiagnosticsApi(apiClient);
            AlertSyslogConfiguration alerts = new AlertSyslogConfiguration();
            sleep(1000);

            /**
             * Configure Syslog Receivers
             */
            List<AlertSyslogServer> servers = new ArrayList<AlertSyslogServer>();
            AlertSyslogServer server = new AlertSyslogServer();
            server.setServerName("syslog.test.org"); //example syslog server name
            server.setPortNumber(666); // example syslog port
            servers.add(server);
            alerts.setSyslogReceivers(servers);
            sleep(1000);

            /**
             * Gather information on configured SyslogReceivers
             */
            List<AlertSyslogServer> confServes = alerts.getSyslogReceivers();
            sleep(1000);
            for(AlertSyslogServer serv : confServes) {
                System.out.println("Syslog Receiver name: "+serv.getServerName());
                System.out.println("Syslog Receiver port: "+serv.getPortNumber());
            }

            /**
             * Test syslog configuration
             */
            AlertSyslogResponse resp = diag.testSyslogSend(sysId);
            System.out.println(resp.getResponse().name());

        } catch (ApiException apiExp) {
            System.out.println("An exception occurred. Please check error: \n " + apiExp.getMessage());
        } catch (InterruptedException ex) {
            currentThread().interrupt();
        }
    }
}
