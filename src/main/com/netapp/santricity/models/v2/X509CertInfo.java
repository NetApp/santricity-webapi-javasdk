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
 * Basic information for X509 Certs stored in the system.
 */
@ApiModel(description = "Basic information for X509 Certs stored in the system.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class X509CertInfo   {
  
    private String alias;

    private String subjectDN;

    private String issuerDN;

    private Date start;

    private Date expire;

    private Boolean truststore;

    private Boolean isUserInstalled;

    private Boolean isKeyEntry;

  
  /**
   **/
  public X509CertInfo alias(String alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  
  public void setAlias(String alias) {
    this.alias = alias;
  }

  
  /**
   **/
  public X509CertInfo subjectDN(String subjectDN) {
    this.subjectDN = subjectDN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subjectDN")
  public String getSubjectDN() {
    return subjectDN;
  }
  
  public void setSubjectDN(String subjectDN) {
    this.subjectDN = subjectDN;
  }

  
  /**
   **/
  public X509CertInfo issuerDN(String issuerDN) {
    this.issuerDN = issuerDN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("issuerDN")
  public String getIssuerDN() {
    return issuerDN;
  }
  
  public void setIssuerDN(String issuerDN) {
    this.issuerDN = issuerDN;
  }

  
  /**
   **/
  public X509CertInfo start(Date start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }
  
  public void setStart(Date start) {
    this.start = start;
  }

  
  /**
   **/
  public X509CertInfo expire(Date expire) {
    this.expire = expire;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expire")
  public Date getExpire() {
    return expire;
  }
  
  public void setExpire(Date expire) {
    this.expire = expire;
  }

  
  /**
   **/
  public X509CertInfo truststore(Boolean truststore) {
    this.truststore = truststore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("truststore")
  public Boolean getTruststore() {
    return truststore;
  }
  
  public void setTruststore(Boolean truststore) {
    this.truststore = truststore;
  }

  
  /**
   **/
  public X509CertInfo isUserInstalled(Boolean isUserInstalled) {
    this.isUserInstalled = isUserInstalled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isUserInstalled")
  public Boolean getIsUserInstalled() {
    return isUserInstalled;
  }
  
  public void setIsUserInstalled(Boolean isUserInstalled) {
    this.isUserInstalled = isUserInstalled;
  }

  
  /**
   **/
  public X509CertInfo isKeyEntry(Boolean isKeyEntry) {
    this.isKeyEntry = isKeyEntry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isKeyEntry")
  public Boolean getIsKeyEntry() {
    return isKeyEntry;
  }
  
  public void setIsKeyEntry(Boolean isKeyEntry) {
    this.isKeyEntry = isKeyEntry;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    X509CertInfo x509CertInfo = (X509CertInfo) o;
    return Objects.equals(this.alias, x509CertInfo.alias) &&
        Objects.equals(this.subjectDN, x509CertInfo.subjectDN) &&
        Objects.equals(this.issuerDN, x509CertInfo.issuerDN) &&
        Objects.equals(this.start, x509CertInfo.start) &&
        Objects.equals(this.expire, x509CertInfo.expire) &&
        Objects.equals(this.truststore, x509CertInfo.truststore) &&
        Objects.equals(this.isUserInstalled, x509CertInfo.isUserInstalled) &&
        Objects.equals(this.isKeyEntry, x509CertInfo.isKeyEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, subjectDN, issuerDN, start, expire, truststore, isUserInstalled, isKeyEntry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class X509CertInfo {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    subjectDN: ").append(toIndentedString(subjectDN)).append("\n");
    sb.append("    issuerDN: ").append(toIndentedString(issuerDN)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
    sb.append("    truststore: ").append(toIndentedString(truststore)).append("\n");
    sb.append("    isUserInstalled: ").append(toIndentedString(isUserInstalled)).append("\n");
    sb.append("    isKeyEntry: ").append(toIndentedString(isKeyEntry)).append("\n");
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

