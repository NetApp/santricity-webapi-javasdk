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
* API tests for FApi
*/
public class FApiTest {
    private final FApi api = new FApi();
    
    /**
     * This procedure will perform an immediate fail-back of volume current ownership to the preferred owner.
     *
     * Documented return codes: ok, noHeap. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolFailBackVolumeOwnershipTest() throws ApiException {
        
        String systemId = null;
        
        VolumeOwnershipFailBackRequestDescriptor body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolFailBackVolumeOwnership(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure attempts to revive the given disk pool.
     *
     * Documented return codes: ok. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolForceDiskPoolToOptimalTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolForceDiskPoolToOptimal(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This procedure applies to a volume group for which successful migration of drives from the source array to the target array could not be completed due to hardware errors. It causes the identified volume group to move to a state called the \&quot;forced\&quot; state, from which it is still permissible to perform an import operation on the volume group.
     *
     * Documented return codes: ok, volumeGroupHasHotspare, volumeGroupReconfiguring, volumeGroupReconstructing, volumeGroupHasFailedDrives, volumeGroupHasNonOptimalVols, volumeGroupHasMirrorRelationship, volumeGroupHasVolcopyRelationship, volumeGroupHasMirroringMetadata, volumeGroupHasMappedVols, volumeGroupHasReservations, volumeGroupHasIncompatibleDacstores, volumeLimitExceeded, volumeGroupHasUnknownRaidLevel, volumeGroupHasUnsupportedRaidLevel, volumeGroupHasCloneOpportunity, volumeGroupHasInsufficientDrives, volumeGroupHasFailedVols, volumeGroupNotContingent, legacyVg, vgNotForceable, driveSpinUpError, volumeGroupHasIncompatibleDrive. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolForceVolumeGroupTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolForceVolumeGroup(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * This is a potentially dangerous operation, since it causes data to be made available to the I/O host even though that data may have become corrupted due to device failures that occurred in the past.
     *
     * Documented return codes: ok, error, illegalParam, noHeap, volumeReconfiguring, tryAlternate, background, invalidVolumegroupref. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void symbolForceVolumeGroupToOptimalTest() throws ApiException {
        
        String systemId = null;
        
        String body = null;
        
        String controller = null;
        
        Boolean verboseErrorResponse = null;
        
        try{
        String response = api.symbolForceVolumeGroupToOptimal(systemId, body, controller, verboseErrorResponse);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
