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
* API tests for SecurityApi
*/
public class SecurityApiTest {
    private final SecurityApi api = new SecurityApi();
    
    /**
     * Export a full disk encryption key 
     *
     * Mode: Both Embedded and Proxy. The response type of this method is a file stream. Use secure pass phrase for additional security instead of pass phrase.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportFDEKeyTest() throws ApiException {
        
        String systemId = null;
        
        String passPhrase = null;
        
        String fileName = null;
        
        try{
        File response = api.exportFDEKey(systemId, passPhrase, fileName);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieves the specified certificate file
     *
     * This API is designed to return a file. It will only return a content-type of application/json in cases where the file retrieval did not succeed.&lt;br&gt; This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalKeyServerCertificateTest() throws ApiException {
        
        String systemId = null;
        
        String certificateType = null;
        
        try{
        File response = api.getExternalKeyServerCertificate(systemId, certificateType);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieves the details for the certificate files on the system as well as the associated Key Management Server IP and port.
     *
     * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalKeyServerDetailsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        X509ExternalCertInfo response = api.getExternalKeyServerDetails(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Import a full disk encryption key
     *
     * Mode: Both Embedded and Proxy. Use secure pass phrase for additional security instead of pass phrase.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importFDEKeyTest() throws ApiException {
        
        String systemId = null;
        
        String passPhrase = null;
        
        File keyfile = null;
        
        String securePassPhrase = null;
        
        try{
        api.importFDEKey(systemId, passPhrase, keyfile, securePassPhrase);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Request a certificate signing request for a client side certificate used to validate with the external key server 
     *
     * This will return the ID for the file (for use with other endpoints) and a URL (can be used directly).&lt;br&gt;This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newExternalKeyServerCSRTest() throws ApiException {
        
        String systemId = null;
        
        ExternalKeyManagerCSR body = null;
        
        try{
        PrivateFileInfo response = api.newExternalKeyServerCSR(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Create or change a full disk encryption key
     *
     * Mode: Both Embedded and Proxy. The result of this method is the creation of a new key file. Retrieve with the /file/{filename} endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newFDEKeyTest() throws ApiException {
        
        String systemId = null;
        
        SecureVolumeKeyRequest body = null;
        
        try{
        SecureVolumeKeyResponse response = api.newFDEKey(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Removes the specified certificate type
     *
     * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeExternalKeyServerCertificateTest() throws ApiException {
        
        String systemId = null;
        
        String certificateType = null;
        
        try{
        api.removeExternalKeyServerCertificate(systemId, certificateType);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Sets (enables/updates) the key server information
     *
     * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalKeyServerTest() throws ApiException {
        
        String systemId = null;
        
        EnableExternalKeyServerRequest body = null;
        
        try{
        api.setExternalKeyServer(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Enables, disables or changes the external security key on the storage system
     *
     * If the ekmsOption field is set to enable, the storage array will communicate with the KMS server to obtain a security key and install it on the storage system.  In order for this to be successful, the following things must first occur:&lt;br&gt;&lt;br&gt;1. The KMS server IP and port must be set&lt;br&gt;2. A CSR must be generated and uploaded to the KMS server to retrieve the client certificate&lt;br&gt;3. Both the client and server certificates need to be installed on the storage system&lt;br&gt;&lt;br&gt;If the ekmsOption field is set to disable and external key management is currently enabled, the storage array will switch to internal key management and a new security key will be generated on the storage system.&lt;br&gt;&lt;br&gt;If the ekmsOption is set to changeKey and external key management is currently enabled, a new security key will be generated on the storage system to replace the existing key.&lt;br&gt;&lt;br&gt;This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalKeyServerKeyTest() throws ApiException {
        
        String systemId = null;
        
        EnableDisableEkmsRequest body = null;
        
        try{
        SecureVolumeExternalKeyResponse response = api.setExternalKeyServerKey(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Verify the storage system is able to communicate with the KMS server
     *
     * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testExternalKeyServerTest() throws ApiException {
        
        String systemId = null;
        
        try{
        EKMSCommunicationResponse response = api.testExternalKeyServer(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Install a KMS Certificate or a certificate in a chain
     *
     * This endpoint will only work on firmware versions 08.40.xx.xx and later.  At this time, it is only supported on 28xx and 5700 controllers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadExternalKeyServerCertificateTest() throws ApiException {
        
        String systemId = null;
        
        String certificateType = null;
        
        File file = null;
        
        try{
        api.uploadExternalKeyServerCertificate(systemId, certificateType, file);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Validate a full disk encryption key
     *
     * Mode: Both Embedded and Proxy. Use secure pass phrase for additional security instead of pass phrase.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateFDEKeyTest() throws ApiException {
        
        String systemId = null;
        
        File keyfile = null;
        
        String passPhrase = null;
        
        String securePassPhrase = null;
        
        try{
        api.validateFDEKey(systemId, keyfile, passPhrase, securePassPhrase);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
