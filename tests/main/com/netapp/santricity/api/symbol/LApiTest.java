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


package com.netapp.santricity.api.symbol;

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
* API tests for LApi
*/
public class LApiTest {
    private final LApi api = new LApi();
    
    /**
     * To indicate the end of the iterative download sequence, call this procedure with a zero-length segment size. When the controller receives this end indicator, the controller writes the accumulated firmware image to stable storage (typically flash memory). The controller responds to this procedure call with the appropriate return code, delays for a short period, and then reboots to load and execute the new firmware.
     *
     * Documented return codes: ok, error, busy, illegalParam, noHeap, invalidFile, imageTransferred, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, downloadNotPermitted, spawnError, voltransferError, invalidDlstate, cacheconfigError, downloadInProgress, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolLoadControllerFirmwareTest() throws ApiException {
        
        String systemId = null;
        
        FirmwareUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolLoadControllerFirmware(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Used to download some or all of a new firmware image file to a controller when the authentication password is unavailable.
     *
     * Documented return codes: ok, error, busy, illegalParam, noHeap, invalidFile, imageTransferred, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, downloadNotPermitted, spawnError, voltransferError, invalidDlstate, cacheconfigError, downloadInProgress, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolLoadControllerFirmwareNoPasswordTest() throws ApiException {
        
        String systemId = null;
        
        FirmwareUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolLoadControllerFirmwareNoPassword(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * To indicate the end of the iterative download sequence, call this procedure with a zero-length segment size. When the controller receives this end indicator, the controller writes the accumulated firmware image to stable storage (typically flash memory). The controller responds to this procedure call with the appropriate return code, delays for a short period, and then reboots to load and execute the new firmware.
     *
     * Documented return codes: ok, error, busy, illegalParam, noHeap, invalidFile, imageTransferred, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, downloadNotPermitted, spawnError, voltransferError, invalidDlstate, cacheconfigError, downloadInProgress, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolLoadControllerFirmwareOnLockdownTest() throws ApiException {
        
        String systemId = null;
        
        FirmwareUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolLoadControllerFirmwareOnLockdown(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * To indicate the end of the iterative download sequence, call this procedure with a zero-length segment size. When the controller receives this end indicator, the controller writes the accumulated NVSRAM image to stable storage (typically flash memory). The controller responds to this procedure call with the appropriate return code, delays for a short period, and then reboots to load and execute the new NVSRAM.
     *
     * Documented return codes: ok, error, busy, illegalParam, noHeap, invalidFile, flashError, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, downloadNotPermitted, spawnError, downloadInProgress, utmConflict, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolLoadControllerNVSRAMTest() throws ApiException {
        
        String systemId = null;
        
        FirmwareUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolLoadControllerNVSRAM(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to download a NVSRAM image file to a controller when the duplex setting gets erroneously inserted into a Native SATA array. In such a situation, none of the native SATA drives will be recognized by the firmware since the IOC will be set to enable the STP (SATA) layer only if the setting is Simplex. The Recovery Action in such a scenario is to download new NVSRAM using this command and boot with it.
     *
     * Documented return codes: ok, error, illegalParam, imageTransferred, fileTooLarge, invalidChunksize, downloadInProgress, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolLoadControllerNVSRAMNoPasswordTest() throws ApiException {
        
        String systemId = null;
        
        FirmwareUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolLoadControllerNVSRAMNoPassword(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Downloads a portion of a new firmware image to a drive in the SYMbol Server. loadDriveFirmware OBSOLETED by implementation of parallel drive firmware download
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolLoadDriveFirmwareTest() throws ApiException {
        
        String systemId = null;
        
        DriveFirmwareUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolLoadDriveFirmware(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to download some or all of a new firmware image to the ESM cards in a tray. The argument object specifies tray where the ESMs are located, the size of the firmware segment being downloaded, and the offset of the segment within the overall firmware image. Downloads are accomplished using an iterative approach, where the overall image is segmented and each segment transferred to the controller via a call to this procedure. To indicate the end of the iterative download sequence, this procedure should be called with a zero-length segment size. When this end indicator is received by the controller, the accumulated firmware image will be written to the ESM cards.
     *
     * Documented return codes: ok, error, busy, noHeap, tryAlternate, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, spawnError, cacheconfigError, downloadInProgress, esmDownloadFailed, esmPartialUpdate, controllerInServiceMode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolLoadESMFirmwareTest() throws ApiException {
        
        String systemId = null;
        
        ESMFirmwareUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolLoadESMFirmware(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to download a new firmware image to the ESM cards in a tray. This procedure is identical in behavior to loadESMFirmware. with respect to interpretation of the argument and performing the download process. It differs from that command with respect to certain pre-validation checks it performs. In particular, it requires that an ESM firmware mismatch condition exist on the indicated tray before it will proceed with the download.
     *
     * Documented return codes: ok, error, busy, noHeap, tryAlternate, fileTooLarge, invalidOffset, overrun, invalidChunksize, invalidTotalsize, spawnError, cacheconfigError, downloadInProgress, esmDownloadFailed, esmPartialUpdate, controllerInServiceMode, requiredConditionNotPresent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolLoadEsmFirmwareOnMismatchTest() throws ApiException {
        
        String systemId = null;
        
        ESMFirmwareUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolLoadEsmFirmwareOnMismatch(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure is used to download factory default information to a controller or expansion enclosure.
     *
     * Documented return codes: ok, error, factoryDefaultDownloadFailed, errorWritingToEeprom, factoryDefaultPartialUpdate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolLoadFactoryDefaultsTest() throws ApiException {
        
        String systemId = null;
        
        FactoryDefaultsDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolLoadFactoryDefaults(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
