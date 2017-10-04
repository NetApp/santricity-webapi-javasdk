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
* API tests for LDAPApi
*/
public class LDAPApiTest {
    private final LDAPApi api = new LDAPApi();
    
    /**
     * Retrieve the LDAP configuration
     *
     * Mode: Embedded Only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLdapConfigurationTest() throws ApiException {
        
        String systemId = null;
        
        try{
        LdapConfiguration response = api.getLdapConfiguration(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Retrieve a specific LDAP domain configuration
     *
     * Mode: Embedded Only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLdapDomainTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        LdapDomain response = api.getLdapDomain(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the user&#39;s current roles and list of role permissions.
     *
     * Mode: Both Embedded and Proxy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRolePermissionsTest() throws ApiException {
        
        String systemId = null;
        
        Boolean allUsers = null;
        
        try{
        RolesResponse response = api.getRolePermissions(systemId, allUsers);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Adds an LDAP domain to the existing configuration
     *
     * Mode: Embedded Only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newLdapDomainTest() throws ApiException {
        
        String systemId = null;
        
        LdapDomain body = null;
        
        Boolean skipTest = null;
        
        try{
        LdapConfiguration response = api.newLdapDomain(systemId, body, skipTest);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Deletes the specified domain from the LDAP configuration
     *
     * Mode: Embedded Only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeLdapDomainTest() throws ApiException {
        
        String systemId = null;
        
        String id = null;
        
        try{
        api.removeLdapDomain(systemId, id);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Sets the LDAP configuration for a single or multiple domains. Warning: This will remove previous configurations
     *
     * Mode: Embedded Only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setLdapConfigurationTest() throws ApiException {
        
        String systemId = null;
        
        LdapConfiguration body = null;
        
        Boolean skipTest = null;
        
        try{
        LdapConfiguration response = api.setLdapConfiguration(systemId, body, skipTest);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Tests current LDAP configuration. If no bind user is defined only a communication test will be performed
     *
     * Mode: Embedded Only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testLdapTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<LdapDomainTestResponse> response = api.testLdap(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Updates LDAP configuration for a single domain
     *
     * Mode: Embedded Only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLdapDomainTest() throws ApiException {
        
        String systemId = null;
        
        String domainId = null;
        
        LdapDomain body = null;
        
        Boolean skipTest = null;
        
        try{
        LdapConfiguration response = api.updateLdapDomain(systemId, domainId, body, skipTest);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
