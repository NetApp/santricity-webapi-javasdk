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


package com.netapp.santricity.models.v2;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.netapp.santricity.models.v2.*;
import com.netapp.santricity.models.symbol.*;
import com.netapp.santricity.models.utils.*;
import com.netapp.santricity.Pair;
import com.netapp.santricity.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.util.Date;
import java.util.Objects;


/**
 * Structure that contains information about an LDAP Domain
 */
@ApiModel(description = "Structure that contains information about an LDAP Domain")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class LdapDomain   {
  
    private String id;

    private BindLookupUser bindLookupUser;

    private List<String> groupAttributes;

    private String ldapUrl;

    private List<String> names;

    private List<GroupMapping> roleMapCollection;

    private String searchBase;

    private String userAttribute;

  
  /**
   * Unique ID linked to this domain
   **/
  public LdapDomain id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID linked to this domain")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * If needed, you can configure a specific user to use when looking up the group membership for users. Typically, you would configure this whenever regular users might lack reader permissions to view their own group membership. The bind user information must be specified as a full DN.
   **/
  public LdapDomain bindLookupUser(BindLookupUser bindLookupUser) {
    this.bindLookupUser = bindLookupUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If needed, you can configure a specific user to use when looking up the group membership for users. Typically, you would configure this whenever regular users might lack reader permissions to view their own group membership. The bind user information must be specified as a full DN.")
  @JsonProperty("bindLookupUser")
  public BindLookupUser getBindLookupUser() {
    return bindLookupUser;
  }
  
  public void setBindLookupUser(BindLookupUser bindLookupUser) {
    this.bindLookupUser = bindLookupUser;
  }

  
  /**
   * A list of group attributes on the user that will be searched to for group to role mapping
   **/
  public LdapDomain groupAttributes(List<String> groupAttributes) {
    this.groupAttributes = groupAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of group attributes on the user that will be searched to for group to role mapping")
  @JsonProperty("groupAttributes")
  public List<String> getGroupAttributes() {
    return groupAttributes;
  }
  
  public void setGroupAttributes(List<String> groupAttributes) {
    this.groupAttributes = groupAttributes;
  }

  
  /**
   * The LDAP URL entry must be specified as either ldap or ldaps protocol and contain the IP address. In addition, the port for the LDAP URL must be specified (typically 389 for ldap and 636 for ldaps).
   **/
  public LdapDomain ldapUrl(String ldapUrl) {
    this.ldapUrl = ldapUrl;
    return this;
  }
  
  @ApiModelProperty(example = "ldaps://ldap.example.com:636", required = true, value = "The LDAP URL entry must be specified as either ldap or ldaps protocol and contain the IP address. In addition, the port for the LDAP URL must be specified (typically 389 for ldap and 636 for ldaps).")
  @JsonProperty("ldapUrl")
  public String getLdapUrl() {
    return ldapUrl;
  }
  
  public void setLdapUrl(String ldapUrl) {
    this.ldapUrl = ldapUrl;
  }

  
  /**
   * Each domain will have one ormultiple names and it is presumed the name will match the DNS domain for the LDAP server but it is not required. Domains can be named anything as long as they are valid DNS names.
   **/
  public LdapDomain names(List<String> names) {
    this.names = names;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Each domain will have one ormultiple names and it is presumed the name will match the DNS domain for the LDAP server but it is not required. Domains can be named anything as long as they are valid DNS names.")
  @JsonProperty("names")
  public List<String> getNames() {
    return names;
  }
  
  public void setNames(List<String> names) {
    this.names = names;
  }

  
  /**
   * A list of regular expression patterns to match to the user's group attributes to match to roles. (TODO: NEED TO FIX FOR A MAPPING TYPE)
   **/
  public LdapDomain roleMapCollection(List<GroupMapping> roleMapCollection) {
    this.roleMapCollection = roleMapCollection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of regular expression patterns to match to the user's group attributes to match to roles. (TODO: NEED TO FIX FOR A MAPPING TYPE)")
  @JsonProperty("roleMapCollection")
  public List<GroupMapping> getRoleMapCollection() {
    return roleMapCollection;
  }
  
  public void setRoleMapCollection(List<GroupMapping> roleMapCollection) {
    this.roleMapCollection = roleMapCollection;
  }

  
  /**
   * The search base is used to find group memberships of the user. The search base is the DN in the directory of a container object of users. The filter base is used to find the user object within this container. After the user object is located, any associated group membership is identified.
   **/
  public LdapDomain searchBase(String searchBase) {
    this.searchBase = searchBase;
    return this;
  }
  
  @ApiModelProperty(example = "ou=users,dc=example,dc=com", value = "The search base is used to find group memberships of the user. The search base is the DN in the directory of a container object of users. The filter base is used to find the user object within this container. After the user object is located, any associated group membership is identified.")
  @JsonProperty("searchBase")
  public String getSearchBase() {
    return searchBase;
  }
  
  public void setSearchBase(String searchBase) {
    this.searchBase = searchBase;
  }

  
  /**
   * The user attribute is used match the username supplied to an object on the server
   **/
  public LdapDomain userAttribute(String userAttribute) {
    this.userAttribute = userAttribute;
    return this;
  }
  
  @ApiModelProperty(example = "sAMAccountName", value = "The user attribute is used match the username supplied to an object on the server")
  @JsonProperty("userAttribute")
  public String getUserAttribute() {
    return userAttribute;
  }
  
  public void setUserAttribute(String userAttribute) {
    this.userAttribute = userAttribute;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapDomain ldapDomain = (LdapDomain) o;
    return Objects.equals(this.id, ldapDomain.id) &&
        Objects.equals(this.bindLookupUser, ldapDomain.bindLookupUser) &&
        Objects.equals(this.groupAttributes, ldapDomain.groupAttributes) &&
        Objects.equals(this.ldapUrl, ldapDomain.ldapUrl) &&
        Objects.equals(this.names, ldapDomain.names) &&
        Objects.equals(this.roleMapCollection, ldapDomain.roleMapCollection) &&
        Objects.equals(this.searchBase, ldapDomain.searchBase) &&
        Objects.equals(this.userAttribute, ldapDomain.userAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bindLookupUser, groupAttributes, ldapUrl, names, roleMapCollection, searchBase, userAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapDomain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bindLookupUser: ").append(toIndentedString(bindLookupUser)).append("\n");
    sb.append("    groupAttributes: ").append(toIndentedString(groupAttributes)).append("\n");
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    roleMapCollection: ").append(toIndentedString(roleMapCollection)).append("\n");
    sb.append("    searchBase: ").append(toIndentedString(searchBase)).append("\n");
    sb.append("    userAttribute: ").append(toIndentedString(userAttribute)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

