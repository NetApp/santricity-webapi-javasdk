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
* API tests for MApi
*/
public class MApiTest {
    private final MApi api = new MApi();
    
    /**
     * This procedure is used to modify a list of schedules.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolModifyScheduleListTest() throws ApiException {
        
        String systemId = null;
        
        ScheduleUpdateDescriptorList body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolModifyScheduleList(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Changes the Storage Partitions configuration for a Host object by modifying the host&#39;s cluster assignment.
     *
     * Documented return codes: ok, partNodeNonexistent, partLunCollision, requestFailedDueToPiRestrictions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolMoveHostTest() throws ApiException {
        
        String systemId = null;
        
        SYMbolRefPair body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolMoveHost(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Changes the Storage Partitions configuration for a HostPort object by modifying the port&#39;s host assignment. This procedure does not apply for iSCSI .
     *
     * Documented return codes: ok, partNodeNonexistent, partLunCollision, requestFailedDueToPiRestrictions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolMoveHostPortTest() throws ApiException {
        
        String systemId = null;
        
        SYMbolRefPair body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolMoveHostPort(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Move a LUN mapping.
     *
     * Documented return codes: ok, partNodeNonexistent, partLunCollision, partMappingNonexistent, partNoHostports, partIsUtmLun, tooManyPartitions, partPiIncapable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolMoveLUNMappingTest() throws ApiException {
        
        String systemId = null;
        
        LUNMappingUpdateDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolMoveLUNMapping(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Removes the SA Port &#39;itemRef&#39; from any SA Port Group that it might be in, &amp; moves it to the group &#39;containerRef&#39;. If this leaves the previous SAPortGroup empty, the previous SAPortGroup is deleted. OBSOLETE: Any call to moveSAPort will get a return status indicating the command is obsolete. No alternative procedure is available.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolMoveSAPortTest() throws ApiException {
        
        String systemId = null;
        
        SYMbolRefPair body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolMoveSAPort(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
