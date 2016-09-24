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

package com.netapp.eseries.samples;

import com.netapp.santricity.ApiClient;
import com.netapp.santricity.ApiException;
import com.netapp.santricity.api.symbol.SApi;
import com.netapp.santricity.api.v2.HardwareApi;
import com.netapp.santricity.api.v2.MappingApi;
import com.netapp.santricity.api.v2.StorageSystemsApi;
import com.netapp.santricity.api.v2.VolumesApi;
import com.netapp.santricity.models.v2.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used to setup the demos for Insight 2016
 */
public class InsightSetup {

    public static final String ARRAY_ID = "2";

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        /**
         * Configure the ApiClient with the Santricity proxy URL & set proper credentials
         */
        apiClient.setBasePath("http://localhost/devmgr/v2");
        apiClient.setUsername("rw");
        apiClient.setPassword("rw");


        try {

            addStorageSystem(apiClient);
            Thread.sleep(5000);//sleep a bit because the add is async
            addPool(apiClient);
            addHost(apiClient);
            failADrive(apiClient);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Fails the first drive not in use
     * @param apiClient
     * @throws Exception
     */
    private static void failADrive(ApiClient apiClient) throws Exception {
        HardwareApi hardwareApi = new HardwareApi(apiClient);
        List<DriveEx> allDrives = hardwareApi.getAllDrives(ARRAY_ID);
        DriveEx drive = null;
        for (DriveEx d : allDrives) {
            if (d.getVolumeGroupIndex() == -1) {
                drive = d;
                break;
            }
        }
        SApi api = new SApi(apiClient);
        String status = api.symbolSetDriveToFailed(ARRAY_ID, drive.getId(), "auto", true);
        System.out.println(status);

    }

    /**
     * Adds a host and some ports
     *
     * @param apiClient
     * @throws Exception
     */
    private static void addHost(ApiClient apiClient) throws Exception {
        MappingApi mapAPI = new MappingApi(apiClient);
        List<UnassociatedHostPort> unassociatedHostPorts = mapAPI.getUnassociatedHostPorts(ARRAY_ID);
        List<HostType> allHostTypes = mapAPI.getAllHostTypes(ARRAY_ID);
        HostType type = null;
        for (HostType t : allHostTypes) {
            if (t.getName().toLowerCase().indexOf("sas") != -1) {
                System.out.println(t.getName());
                type = t;
                break;
            }
        }
        System.out.println(type.getName());
        HostCreateRequest req = new HostCreateRequest();
        req.setName("host-a");
        req.setHostType(type);

        UnassociatedHostPort port = unassociatedHostPorts.get(0);
        HostPortCreateRequest.TypeEnum portType = HostPortCreateRequest.TypeEnum.valueOf(port.getType().name());
        HostPortCreateRequest portReq = new HostPortCreateRequest();
        portReq.setLabel("port-1");
        portReq.setType(portType);
        portReq.setPort(port.getAddress());
        List<HostPortCreateRequest> ports = new ArrayList<>();
        ports.add(portReq);
        req.setPorts(ports);
        mapAPI.newHost(ARRAY_ID, req);
    }

    /**
     * Makes a simple raid 0 pool out of the first few drives
     * @param apiClient
     * @throws Exception
     */
    private static void addPool(ApiClient apiClient) throws Exception {
        HardwareApi hardwareApi = new HardwareApi(apiClient);
        List<DriveEx> allDrives = hardwareApi.getAllDrives(ARRAY_ID);
        VolumesApi api = new VolumesApi(apiClient);
        StoragePoolCreateRequest req = new StoragePoolCreateRequest();
        req.setEraseSecuredDrives(false);
        req.setName("pool-1");
        List<String> driveIds = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            driveIds.add(allDrives.get(i).getId());
        }
        req.setDiskDriveIds(driveIds);
        req.setRaidLevel(StoragePoolCreateRequest.RaidLevelEnum.raid0);
        api.newStoragePool(ARRAY_ID, req);
    }

    /**
     * Removes the storage system for the given ID if its in use and add in localhost sim
     * @param apiClient
     */
    private static void addStorageSystem(ApiClient apiClient) {
        /**
         * Add a storage system to the proxy
         */
        StorageSystemsApi storageSystemAPI = new StorageSystemsApi(apiClient);
        try {
            storageSystemAPI.removeStorageSystem(ARRAY_ID);
        } catch (ApiException e) {
            //ignore
            // e.printStackTrace();
        }
        StorageSystemCreateRequest ssCreatReq = new StorageSystemCreateRequest();
        List<String> ctrlAddrs = new ArrayList<>();
        ctrlAddrs.add("127.0.0.1");
        ssCreatReq.setControllerAddresses(ctrlAddrs);
        ssCreatReq.setId(ARRAY_ID);
        try {
            storageSystemAPI.newStorageSystem(ssCreatReq);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
