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
* API tests for AdministrationApi
*/
public class AdministrationApiTest {
    private final AdministrationApi api = new AdministrationApi();
    
    /**
     * Retrieves an x509 certificate signing request 
     *
     * Mode: Both Embedded and Proxy. The response type of this method is a file stream.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCertificateSigningRequestTest() throws ApiException {
        
        String filename = null;
        
        try{
        File response = api.getCertificateSigningRequest(filename);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Return a secure random token of 16 bytes
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClientTokenTest() throws ApiException {
        
        try{
        String response = api.getClientToken();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve the local users and if their password is set
     *
     * Mode: Embedded only
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmbeddedLocalUsersTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<EmbeddedLocalUserResponse> response = api.getEmbeddedLocalUsers(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve local users information.
     *
     * Mode: Embedded only
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmbeddedLocalUsersInfoTest() throws ApiException {
        
        String systemId = null;
        
        try{
        EmbeddedLocalUserInfoResponse response = api.getEmbeddedLocalUsersInfo(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * GET the SSL Configuration 
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSSLConfigurationTest() throws ApiException {
        
        try{
        SSLCertConfiguration response = api.getSSLConfiguration();
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve if the SYMbol port is enabled
     *
     * Mode: Embedded.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSymbolPortEnabledTest() throws ApiException {
        
        String systemId = null;
        
        try{
        SymbolPortResponse response = api.getSymbolPortEnabled(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Gets the list of known trusted certificate authorities
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrustedCertificateAuthoritiesTest() throws ApiException {
        
        Boolean useTruststore = null;
        
        try{
        List<X509CertInfo> response = api.getTrustedCertificateAuthorities(useTruststore);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Asynchonously Reloads SSL Configuration. When this call returns, the reload has been requested
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reloadSSLConfigurationTest() throws ApiException {
        
        Boolean reloadBoth = null;
        
        try{
        api.reloadSSLConfiguration(reloadBoth);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Deletes the CA with the given aliass
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeCATest() throws ApiException {
        
        String alias = null;
        
        Boolean useTruststore = null;
        
        try{
        api.removeCA(alias, useTruststore);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Resets the webserver back to a self-singed certificate, removes all previously uploaded certificates from the keystore and Asynchronously reloads the SSL configuration.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetsSSLConfigurationTest() throws ApiException {
        
        Boolean reloadSSL = null;
        
        try{
        api.resetsSSLConfiguration(reloadSSL);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Set the password for local users
     *
     * Mode: Embedded only
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setEmbeddedLocalUsersTest() throws ApiException {
        
        String systemId = null;
        
        EmbeddedLocalUserRequest body = null;
        
        try{
        api.setEmbeddedLocalUsers(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Set the SSL Configuration causing a regeneration of the SSL Certificate.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setSSLConfigurationTest() throws ApiException {
        
        SSLCertConfiguration body = null;
        
        try{
        api.setSSLConfiguration(body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Set if the SYMbol port is enabled
     *
     * Mode: Embedded.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setSymbolPortEnabledTest() throws ApiException {
        
        String systemId = null;
        
        SymbolPortRequest body = null;
        
        try{
        api.setSymbolPortEnabled(systemId, body);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Upload the root/intermediate certificates from a certificate authority that signed the certificate used for this server
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadCACertificateTest() throws ApiException {
        
        Boolean useTruststore = null;
        
        String alias = null;
        
        File file = null;
        
        try{
        api.uploadCACertificate(useTruststore, alias, file);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Upload a previously exported certificate signing request
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadCertificateSigningRequestTest() throws ApiException {
        
        File file = null;
        
        try{
        List<FileInfo> response = api.uploadCertificateSigningRequest(file);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
