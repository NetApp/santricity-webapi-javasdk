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
 * Basic information for X509 External certificates stored in the system.
 */
@ApiModel(description = "Basic information for X509 External certificates stored in the system.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class X509ExternalCertInfo   {
  
    private NetworkAddress kmsAddress;

    private Integer kmsPort;


  /**
   * Gets or Sets clientKmsType
   */
  public enum ClientKmsTypeEnum {
    certificateFileTypeUnknown("certificateFileTypeUnknown"),
    clientCertificate("clientCertificate"),
    serverCertificate("serverCertificate"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ClientKmsTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ClientKmsTypeEnum clientKmsType;

    private String clientSubjectDN;

    private String clientIssuerDN;

    private Date clientStart;

    private Date clientExpire;


  /**
   * Gets or Sets serverKmsType
   */
  public enum ServerKmsTypeEnum {
    certificateFileTypeUnknown("certificateFileTypeUnknown"),
    clientCertificate("clientCertificate"),
    serverCertificate("serverCertificate"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ServerKmsTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ServerKmsTypeEnum serverKmsType;

    private String serverSubjectDN;

    private String serverIssuerDN;

    private Date serverStart;

    private Date serverExpire;

  
  /**
   **/
  public X509ExternalCertInfo kmsAddress(NetworkAddress kmsAddress) {
    this.kmsAddress = kmsAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("kmsAddress")
  public NetworkAddress getKmsAddress() {
    return kmsAddress;
  }
  
  public void setKmsAddress(NetworkAddress kmsAddress) {
    this.kmsAddress = kmsAddress;
  }

  
  /**
   **/
  public X509ExternalCertInfo kmsPort(Integer kmsPort) {
    this.kmsPort = kmsPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("kmsPort")
  public Integer getKmsPort() {
    return kmsPort;
  }
  
  public void setKmsPort(Integer kmsPort) {
    this.kmsPort = kmsPort;
  }

  
  /**
   **/
  public X509ExternalCertInfo clientKmsType(ClientKmsTypeEnum clientKmsType) {
    this.clientKmsType = clientKmsType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clientKmsType")
  public ClientKmsTypeEnum getClientKmsType() {
    return clientKmsType;
  }
  
  public void setClientKmsType(ClientKmsTypeEnum clientKmsType) {
    this.clientKmsType = clientKmsType;
  }

  
  /**
   **/
  public X509ExternalCertInfo clientSubjectDN(String clientSubjectDN) {
    this.clientSubjectDN = clientSubjectDN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clientSubjectDN")
  public String getClientSubjectDN() {
    return clientSubjectDN;
  }
  
  public void setClientSubjectDN(String clientSubjectDN) {
    this.clientSubjectDN = clientSubjectDN;
  }

  
  /**
   **/
  public X509ExternalCertInfo clientIssuerDN(String clientIssuerDN) {
    this.clientIssuerDN = clientIssuerDN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clientIssuerDN")
  public String getClientIssuerDN() {
    return clientIssuerDN;
  }
  
  public void setClientIssuerDN(String clientIssuerDN) {
    this.clientIssuerDN = clientIssuerDN;
  }

  
  /**
   **/
  public X509ExternalCertInfo clientStart(Date clientStart) {
    this.clientStart = clientStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clientStart")
  public Date getClientStart() {
    return clientStart;
  }
  
  public void setClientStart(Date clientStart) {
    this.clientStart = clientStart;
  }

  
  /**
   **/
  public X509ExternalCertInfo clientExpire(Date clientExpire) {
    this.clientExpire = clientExpire;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clientExpire")
  public Date getClientExpire() {
    return clientExpire;
  }
  
  public void setClientExpire(Date clientExpire) {
    this.clientExpire = clientExpire;
  }

  
  /**
   **/
  public X509ExternalCertInfo serverKmsType(ServerKmsTypeEnum serverKmsType) {
    this.serverKmsType = serverKmsType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serverKmsType")
  public ServerKmsTypeEnum getServerKmsType() {
    return serverKmsType;
  }
  
  public void setServerKmsType(ServerKmsTypeEnum serverKmsType) {
    this.serverKmsType = serverKmsType;
  }

  
  /**
   **/
  public X509ExternalCertInfo serverSubjectDN(String serverSubjectDN) {
    this.serverSubjectDN = serverSubjectDN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serverSubjectDN")
  public String getServerSubjectDN() {
    return serverSubjectDN;
  }
  
  public void setServerSubjectDN(String serverSubjectDN) {
    this.serverSubjectDN = serverSubjectDN;
  }

  
  /**
   **/
  public X509ExternalCertInfo serverIssuerDN(String serverIssuerDN) {
    this.serverIssuerDN = serverIssuerDN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serverIssuerDN")
  public String getServerIssuerDN() {
    return serverIssuerDN;
  }
  
  public void setServerIssuerDN(String serverIssuerDN) {
    this.serverIssuerDN = serverIssuerDN;
  }

  
  /**
   **/
  public X509ExternalCertInfo serverStart(Date serverStart) {
    this.serverStart = serverStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serverStart")
  public Date getServerStart() {
    return serverStart;
  }
  
  public void setServerStart(Date serverStart) {
    this.serverStart = serverStart;
  }

  
  /**
   **/
  public X509ExternalCertInfo serverExpire(Date serverExpire) {
    this.serverExpire = serverExpire;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serverExpire")
  public Date getServerExpire() {
    return serverExpire;
  }
  
  public void setServerExpire(Date serverExpire) {
    this.serverExpire = serverExpire;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    X509ExternalCertInfo x509ExternalCertInfo = (X509ExternalCertInfo) o;
    return Objects.equals(this.kmsAddress, x509ExternalCertInfo.kmsAddress) &&
        Objects.equals(this.kmsPort, x509ExternalCertInfo.kmsPort) &&
        Objects.equals(this.clientKmsType, x509ExternalCertInfo.clientKmsType) &&
        Objects.equals(this.clientSubjectDN, x509ExternalCertInfo.clientSubjectDN) &&
        Objects.equals(this.clientIssuerDN, x509ExternalCertInfo.clientIssuerDN) &&
        Objects.equals(this.clientStart, x509ExternalCertInfo.clientStart) &&
        Objects.equals(this.clientExpire, x509ExternalCertInfo.clientExpire) &&
        Objects.equals(this.serverKmsType, x509ExternalCertInfo.serverKmsType) &&
        Objects.equals(this.serverSubjectDN, x509ExternalCertInfo.serverSubjectDN) &&
        Objects.equals(this.serverIssuerDN, x509ExternalCertInfo.serverIssuerDN) &&
        Objects.equals(this.serverStart, x509ExternalCertInfo.serverStart) &&
        Objects.equals(this.serverExpire, x509ExternalCertInfo.serverExpire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kmsAddress, kmsPort, clientKmsType, clientSubjectDN, clientIssuerDN, clientStart, clientExpire, serverKmsType, serverSubjectDN, serverIssuerDN, serverStart, serverExpire);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class X509ExternalCertInfo {\n");
    
    sb.append("    kmsAddress: ").append(toIndentedString(kmsAddress)).append("\n");
    sb.append("    kmsPort: ").append(toIndentedString(kmsPort)).append("\n");
    sb.append("    clientKmsType: ").append(toIndentedString(clientKmsType)).append("\n");
    sb.append("    clientSubjectDN: ").append(toIndentedString(clientSubjectDN)).append("\n");
    sb.append("    clientIssuerDN: ").append(toIndentedString(clientIssuerDN)).append("\n");
    sb.append("    clientStart: ").append(toIndentedString(clientStart)).append("\n");
    sb.append("    clientExpire: ").append(toIndentedString(clientExpire)).append("\n");
    sb.append("    serverKmsType: ").append(toIndentedString(serverKmsType)).append("\n");
    sb.append("    serverSubjectDN: ").append(toIndentedString(serverSubjectDN)).append("\n");
    sb.append("    serverIssuerDN: ").append(toIndentedString(serverIssuerDN)).append("\n");
    sb.append("    serverStart: ").append(toIndentedString(serverStart)).append("\n");
    sb.append("    serverExpire: ").append(toIndentedString(serverExpire)).append("\n");
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

