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


package com.netapp.santricity.models.symbol;

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
 * KMSClientCSRDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class KMSClientCSRDescriptor   {
  
    private String commonName;

    private String organizationName;

    private String organizationalUnitName;

    private String localityName;

    private String stateProvinceName;

    private String countryName;

  
  /**
   * Common Name (eg, your name or your server's host name)
   **/
  public KMSClientCSRDescriptor commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Common Name (eg, your name or your server's host name)")
  @JsonProperty("commonName")
  public String getCommonName() {
    return commonName;
  }
  
  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  
  /**
   * Organization Name (eg, company)
   **/
  public KMSClientCSRDescriptor organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Organization Name (eg, company)")
  @JsonProperty("organizationName")
  public String getOrganizationName() {
    return organizationName;
  }
  
  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  
  /**
   * Organizational Unit Name (eg, section)
   **/
  public KMSClientCSRDescriptor organizationalUnitName(String organizationalUnitName) {
    this.organizationalUnitName = organizationalUnitName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Organizational Unit Name (eg, section)")
  @JsonProperty("organizationalUnitName")
  public String getOrganizationalUnitName() {
    return organizationalUnitName;
  }
  
  public void setOrganizationalUnitName(String organizationalUnitName) {
    this.organizationalUnitName = organizationalUnitName;
  }

  
  /**
   * Locality Name (eg, city)
   **/
  public KMSClientCSRDescriptor localityName(String localityName) {
    this.localityName = localityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Locality Name (eg, city)")
  @JsonProperty("localityName")
  public String getLocalityName() {
    return localityName;
  }
  
  public void setLocalityName(String localityName) {
    this.localityName = localityName;
  }

  
  /**
   * State or Province Name (full name)
   **/
  public KMSClientCSRDescriptor stateProvinceName(String stateProvinceName) {
    this.stateProvinceName = stateProvinceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "State or Province Name (full name)")
  @JsonProperty("stateProvinceName")
  public String getStateProvinceName() {
    return stateProvinceName;
  }
  
  public void setStateProvinceName(String stateProvinceName) {
    this.stateProvinceName = stateProvinceName;
  }

  
  /**
   * Country Name (2 letter code)
   **/
  public KMSClientCSRDescriptor countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Country Name (2 letter code)")
  @JsonProperty("countryName")
  public String getCountryName() {
    return countryName;
  }
  
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KMSClientCSRDescriptor kMSClientCSRDescriptor = (KMSClientCSRDescriptor) o;
    return Objects.equals(this.commonName, kMSClientCSRDescriptor.commonName) &&
        Objects.equals(this.organizationName, kMSClientCSRDescriptor.organizationName) &&
        Objects.equals(this.organizationalUnitName, kMSClientCSRDescriptor.organizationalUnitName) &&
        Objects.equals(this.localityName, kMSClientCSRDescriptor.localityName) &&
        Objects.equals(this.stateProvinceName, kMSClientCSRDescriptor.stateProvinceName) &&
        Objects.equals(this.countryName, kMSClientCSRDescriptor.countryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, organizationName, organizationalUnitName, localityName, stateProvinceName, countryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KMSClientCSRDescriptor {\n");
    
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    organizationalUnitName: ").append(toIndentedString(organizationalUnitName)).append("\n");
    sb.append("    localityName: ").append(toIndentedString(localityName)).append("\n");
    sb.append("    stateProvinceName: ").append(toIndentedString(stateProvinceName)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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

