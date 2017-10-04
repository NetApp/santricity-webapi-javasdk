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
 * This class describes the input for a Certificate Signing Request needed to create a client side certificate for External Key Manager integration
 */
@ApiModel(description = "This class describes the input for a Certificate Signing Request needed to create a client side certificate for External Key Manager integration")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ExternalKeyManagerCSR   {
  
    private String commonName;

    private String organizationName;

    private String organizationalUnitName;

    private String localityName;

    private String stateProvinceName;

    private String countryName;

  
  /**
   * Typically pre-populated with the storage array name
   **/
  public ExternalKeyManagerCSR commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Typically pre-populated with the storage array name")
  @JsonProperty("commonName")
  public String getCommonName() {
    return commonName;
  }
  
  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  
  /**
   * The full legal name of the organization
   **/
  public ExternalKeyManagerCSR organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The full legal name of the organization")
  @JsonProperty("organizationName")
  public String getOrganizationName() {
    return organizationName;
  }
  
  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  
  /**
   * The division of the organization handling the certificate
   **/
  public ExternalKeyManagerCSR organizationalUnitName(String organizationalUnitName) {
    this.organizationalUnitName = organizationalUnitName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division of the organization handling the certificate")
  @JsonProperty("organizationalUnitName")
  public String getOrganizationalUnitName() {
    return organizationalUnitName;
  }
  
  public void setOrganizationalUnitName(String organizationalUnitName) {
    this.organizationalUnitName = organizationalUnitName;
  }

  
  /**
   * City or Locality for the organization
   **/
  public ExternalKeyManagerCSR localityName(String localityName) {
    this.localityName = localityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "City or Locality for the organization")
  @JsonProperty("localityName")
  public String getLocalityName() {
    return localityName;
  }
  
  public void setLocalityName(String localityName) {
    this.localityName = localityName;
  }

  
  /**
   * The full name of the state or province for the organization
   **/
  public ExternalKeyManagerCSR stateProvinceName(String stateProvinceName) {
    this.stateProvinceName = stateProvinceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The full name of the state or province for the organization")
  @JsonProperty("stateProvinceName")
  public String getStateProvinceName() {
    return stateProvinceName;
  }
  
  public void setStateProvinceName(String stateProvinceName) {
    this.stateProvinceName = stateProvinceName;
  }

  
  /**
   * The two letter country ISO code for the organization
   **/
  public ExternalKeyManagerCSR countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The two letter country ISO code for the organization")
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
    ExternalKeyManagerCSR externalKeyManagerCSR = (ExternalKeyManagerCSR) o;
    return Objects.equals(this.commonName, externalKeyManagerCSR.commonName) &&
        Objects.equals(this.organizationName, externalKeyManagerCSR.organizationName) &&
        Objects.equals(this.organizationalUnitName, externalKeyManagerCSR.organizationalUnitName) &&
        Objects.equals(this.localityName, externalKeyManagerCSR.localityName) &&
        Objects.equals(this.stateProvinceName, externalKeyManagerCSR.stateProvinceName) &&
        Objects.equals(this.countryName, externalKeyManagerCSR.countryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, organizationName, organizationalUnitName, localityName, stateProvinceName, countryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalKeyManagerCSR {\n");
    
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

