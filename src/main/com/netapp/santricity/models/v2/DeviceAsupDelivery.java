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
 * DeviceAsupDelivery
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DeviceAsupDelivery   {
  

  /**
   * ASUP delivery method
   */
  public enum MethodEnum {
    https("https"),
    http("http"),
    smtp("smtp");
;
    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MethodEnum method;


  /**
   * ASUP routing type
   */
  public enum RoutingTypeEnum {
    none("none"),
    direct("direct"),
    proxyServer("proxyServer"),
    proxyScript("proxyScript");
;
    private String value;

    RoutingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RoutingTypeEnum routingType;

    private String proxyHost;

    private Integer proxyPort;

    private String proxyUserName;

    private String proxyPassword;

    private String proxyScript;

    private String mailRelayServer;

    private String mailSenderAddress;

  
  /**
   * ASUP delivery method
   **/
  public DeviceAsupDelivery method(MethodEnum method) {
    this.method = method;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ASUP delivery method")
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }
  
  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  
  /**
   * ASUP routing type
   **/
  public DeviceAsupDelivery routingType(RoutingTypeEnum routingType) {
    this.routingType = routingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP routing type")
  @JsonProperty("routingType")
  public RoutingTypeEnum getRoutingType() {
    return routingType;
  }
  
  public void setRoutingType(RoutingTypeEnum routingType) {
    this.routingType = routingType;
  }

  
  /**
   * ASUP proxy host
   **/
  public DeviceAsupDelivery proxyHost(String proxyHost) {
    this.proxyHost = proxyHost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP proxy host")
  @JsonProperty("proxyHost")
  public String getProxyHost() {
    return proxyHost;
  }
  
  public void setProxyHost(String proxyHost) {
    this.proxyHost = proxyHost;
  }

  
  /**
   * ASUP proxy port
   **/
  public DeviceAsupDelivery proxyPort(Integer proxyPort) {
    this.proxyPort = proxyPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP proxy port")
  @JsonProperty("proxyPort")
  public Integer getProxyPort() {
    return proxyPort;
  }
  
  public void setProxyPort(Integer proxyPort) {
    this.proxyPort = proxyPort;
  }

  
  /**
   * ASUP proxy user name
   **/
  public DeviceAsupDelivery proxyUserName(String proxyUserName) {
    this.proxyUserName = proxyUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP proxy user name")
  @JsonProperty("proxyUserName")
  public String getProxyUserName() {
    return proxyUserName;
  }
  
  public void setProxyUserName(String proxyUserName) {
    this.proxyUserName = proxyUserName;
  }

  
  /**
   * ASUP proxy password
   **/
  public DeviceAsupDelivery proxyPassword(String proxyPassword) {
    this.proxyPassword = proxyPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP proxy password")
  @JsonProperty("proxyPassword")
  public String getProxyPassword() {
    return proxyPassword;
  }
  
  public void setProxyPassword(String proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  
  /**
   * ASUP proxy PAC script
   **/
  public DeviceAsupDelivery proxyScript(String proxyScript) {
    this.proxyScript = proxyScript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP proxy PAC script")
  @JsonProperty("proxyScript")
  public String getProxyScript() {
    return proxyScript;
  }
  
  public void setProxyScript(String proxyScript) {
    this.proxyScript = proxyScript;
  }

  
  /**
   * ASUP e-mail relay server
   **/
  public DeviceAsupDelivery mailRelayServer(String mailRelayServer) {
    this.mailRelayServer = mailRelayServer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP e-mail relay server")
  @JsonProperty("mailRelayServer")
  public String getMailRelayServer() {
    return mailRelayServer;
  }
  
  public void setMailRelayServer(String mailRelayServer) {
    this.mailRelayServer = mailRelayServer;
  }

  
  /**
   * ASUP e-mail sender address
   **/
  public DeviceAsupDelivery mailSenderAddress(String mailSenderAddress) {
    this.mailSenderAddress = mailSenderAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP e-mail sender address")
  @JsonProperty("mailSenderAddress")
  public String getMailSenderAddress() {
    return mailSenderAddress;
  }
  
  public void setMailSenderAddress(String mailSenderAddress) {
    this.mailSenderAddress = mailSenderAddress;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAsupDelivery deviceAsupDelivery = (DeviceAsupDelivery) o;
    return Objects.equals(this.method, deviceAsupDelivery.method) &&
        Objects.equals(this.routingType, deviceAsupDelivery.routingType) &&
        Objects.equals(this.proxyHost, deviceAsupDelivery.proxyHost) &&
        Objects.equals(this.proxyPort, deviceAsupDelivery.proxyPort) &&
        Objects.equals(this.proxyUserName, deviceAsupDelivery.proxyUserName) &&
        Objects.equals(this.proxyPassword, deviceAsupDelivery.proxyPassword) &&
        Objects.equals(this.proxyScript, deviceAsupDelivery.proxyScript) &&
        Objects.equals(this.mailRelayServer, deviceAsupDelivery.mailRelayServer) &&
        Objects.equals(this.mailSenderAddress, deviceAsupDelivery.mailSenderAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, routingType, proxyHost, proxyPort, proxyUserName, proxyPassword, proxyScript, mailRelayServer, mailSenderAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAsupDelivery {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    routingType: ").append(toIndentedString(routingType)).append("\n");
    sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
    sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
    sb.append("    proxyUserName: ").append(toIndentedString(proxyUserName)).append("\n");
    sb.append("    proxyPassword: ").append(toIndentedString(proxyPassword)).append("\n");
    sb.append("    proxyScript: ").append(toIndentedString(proxyScript)).append("\n");
    sb.append("    mailRelayServer: ").append(toIndentedString(mailRelayServer)).append("\n");
    sb.append("    mailSenderAddress: ").append(toIndentedString(mailSenderAddress)).append("\n");
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

