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
 * Provides information about the storage array in its role as \&quot;iSCSI entity.\&quot;
 */
@ApiModel(description = "Provides information about the storage array in its role as \"iSCSI entity.\"")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class IscsiEntityResponse   {
  
    private Boolean icmpPingResponseEnabled;

    private Boolean unnamedDiscoverySessionsEnabled;

    private Integer isnsServerTcpListenPort;

    private String ipv4IsnsServerAddress;

    private String ipv6IsnsServerAddress;

    private Boolean isnsServerRegistrationEnabled;

    private Boolean hostPortsConfiguredDHCP;


  /**
   * Gets or Sets ipv4IsnsServerAddressConfigMethod
   */
  public enum Ipv4IsnsServerAddressConfigMethodEnum {
    configDhcp("configDhcp"),
    configStatic("configStatic"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    Ipv4IsnsServerAddressConfigMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private Ipv4IsnsServerAddressConfigMethodEnum ipv4IsnsServerAddressConfigMethod;


  /**
   * Gets or Sets ipv6IsnsServerAddressConfigMethod
   */
  public enum Ipv6IsnsServerAddressConfigMethodEnum {
    configStatic("configStatic"),
    configStateless("configStateless"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    Ipv6IsnsServerAddressConfigMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private Ipv6IsnsServerAddressConfigMethodEnum ipv6IsnsServerAddressConfigMethod;


  /**
   * Gets or Sets isnsRegistrationState
   */
  public enum IsnsRegistrationStateEnum {
    disabled("disabled"),
    locatingServer("locatingServer"),
    connectingToServer("connectingToServer"),
    completed("completed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    IsnsRegistrationStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private IsnsRegistrationStateEnum isnsRegistrationState;

  
  /**
   **/
  public IscsiEntityResponse icmpPingResponseEnabled(Boolean icmpPingResponseEnabled) {
    this.icmpPingResponseEnabled = icmpPingResponseEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("icmpPingResponseEnabled")
  public Boolean getIcmpPingResponseEnabled() {
    return icmpPingResponseEnabled;
  }
  
  public void setIcmpPingResponseEnabled(Boolean icmpPingResponseEnabled) {
    this.icmpPingResponseEnabled = icmpPingResponseEnabled;
  }

  
  /**
   **/
  public IscsiEntityResponse unnamedDiscoverySessionsEnabled(Boolean unnamedDiscoverySessionsEnabled) {
    this.unnamedDiscoverySessionsEnabled = unnamedDiscoverySessionsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unnamedDiscoverySessionsEnabled")
  public Boolean getUnnamedDiscoverySessionsEnabled() {
    return unnamedDiscoverySessionsEnabled;
  }
  
  public void setUnnamedDiscoverySessionsEnabled(Boolean unnamedDiscoverySessionsEnabled) {
    this.unnamedDiscoverySessionsEnabled = unnamedDiscoverySessionsEnabled;
  }

  
  /**
   **/
  public IscsiEntityResponse isnsServerTcpListenPort(Integer isnsServerTcpListenPort) {
    this.isnsServerTcpListenPort = isnsServerTcpListenPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isnsServerTcpListenPort")
  public Integer getIsnsServerTcpListenPort() {
    return isnsServerTcpListenPort;
  }
  
  public void setIsnsServerTcpListenPort(Integer isnsServerTcpListenPort) {
    this.isnsServerTcpListenPort = isnsServerTcpListenPort;
  }

  
  /**
   **/
  public IscsiEntityResponse ipv4IsnsServerAddress(String ipv4IsnsServerAddress) {
    this.ipv4IsnsServerAddress = ipv4IsnsServerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipv4IsnsServerAddress")
  public String getIpv4IsnsServerAddress() {
    return ipv4IsnsServerAddress;
  }
  
  public void setIpv4IsnsServerAddress(String ipv4IsnsServerAddress) {
    this.ipv4IsnsServerAddress = ipv4IsnsServerAddress;
  }

  
  /**
   **/
  public IscsiEntityResponse ipv6IsnsServerAddress(String ipv6IsnsServerAddress) {
    this.ipv6IsnsServerAddress = ipv6IsnsServerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipv6IsnsServerAddress")
  public String getIpv6IsnsServerAddress() {
    return ipv6IsnsServerAddress;
  }
  
  public void setIpv6IsnsServerAddress(String ipv6IsnsServerAddress) {
    this.ipv6IsnsServerAddress = ipv6IsnsServerAddress;
  }

  
  /**
   **/
  public IscsiEntityResponse isnsServerRegistrationEnabled(Boolean isnsServerRegistrationEnabled) {
    this.isnsServerRegistrationEnabled = isnsServerRegistrationEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isnsServerRegistrationEnabled")
  public Boolean getIsnsServerRegistrationEnabled() {
    return isnsServerRegistrationEnabled;
  }
  
  public void setIsnsServerRegistrationEnabled(Boolean isnsServerRegistrationEnabled) {
    this.isnsServerRegistrationEnabled = isnsServerRegistrationEnabled;
  }

  
  /**
   **/
  public IscsiEntityResponse hostPortsConfiguredDHCP(Boolean hostPortsConfiguredDHCP) {
    this.hostPortsConfiguredDHCP = hostPortsConfiguredDHCP;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hostPortsConfiguredDHCP")
  public Boolean getHostPortsConfiguredDHCP() {
    return hostPortsConfiguredDHCP;
  }
  
  public void setHostPortsConfiguredDHCP(Boolean hostPortsConfiguredDHCP) {
    this.hostPortsConfiguredDHCP = hostPortsConfiguredDHCP;
  }

  
  /**
   **/
  public IscsiEntityResponse ipv4IsnsServerAddressConfigMethod(Ipv4IsnsServerAddressConfigMethodEnum ipv4IsnsServerAddressConfigMethod) {
    this.ipv4IsnsServerAddressConfigMethod = ipv4IsnsServerAddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipv4IsnsServerAddressConfigMethod")
  public Ipv4IsnsServerAddressConfigMethodEnum getIpv4IsnsServerAddressConfigMethod() {
    return ipv4IsnsServerAddressConfigMethod;
  }
  
  public void setIpv4IsnsServerAddressConfigMethod(Ipv4IsnsServerAddressConfigMethodEnum ipv4IsnsServerAddressConfigMethod) {
    this.ipv4IsnsServerAddressConfigMethod = ipv4IsnsServerAddressConfigMethod;
  }

  
  /**
   **/
  public IscsiEntityResponse ipv6IsnsServerAddressConfigMethod(Ipv6IsnsServerAddressConfigMethodEnum ipv6IsnsServerAddressConfigMethod) {
    this.ipv6IsnsServerAddressConfigMethod = ipv6IsnsServerAddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipv6IsnsServerAddressConfigMethod")
  public Ipv6IsnsServerAddressConfigMethodEnum getIpv6IsnsServerAddressConfigMethod() {
    return ipv6IsnsServerAddressConfigMethod;
  }
  
  public void setIpv6IsnsServerAddressConfigMethod(Ipv6IsnsServerAddressConfigMethodEnum ipv6IsnsServerAddressConfigMethod) {
    this.ipv6IsnsServerAddressConfigMethod = ipv6IsnsServerAddressConfigMethod;
  }

  
  /**
   **/
  public IscsiEntityResponse isnsRegistrationState(IsnsRegistrationStateEnum isnsRegistrationState) {
    this.isnsRegistrationState = isnsRegistrationState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isnsRegistrationState")
  public IsnsRegistrationStateEnum getIsnsRegistrationState() {
    return isnsRegistrationState;
  }
  
  public void setIsnsRegistrationState(IsnsRegistrationStateEnum isnsRegistrationState) {
    this.isnsRegistrationState = isnsRegistrationState;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiEntityResponse iscsiEntityResponse = (IscsiEntityResponse) o;
    return Objects.equals(this.icmpPingResponseEnabled, iscsiEntityResponse.icmpPingResponseEnabled) &&
        Objects.equals(this.unnamedDiscoverySessionsEnabled, iscsiEntityResponse.unnamedDiscoverySessionsEnabled) &&
        Objects.equals(this.isnsServerTcpListenPort, iscsiEntityResponse.isnsServerTcpListenPort) &&
        Objects.equals(this.ipv4IsnsServerAddress, iscsiEntityResponse.ipv4IsnsServerAddress) &&
        Objects.equals(this.ipv6IsnsServerAddress, iscsiEntityResponse.ipv6IsnsServerAddress) &&
        Objects.equals(this.isnsServerRegistrationEnabled, iscsiEntityResponse.isnsServerRegistrationEnabled) &&
        Objects.equals(this.hostPortsConfiguredDHCP, iscsiEntityResponse.hostPortsConfiguredDHCP) &&
        Objects.equals(this.ipv4IsnsServerAddressConfigMethod, iscsiEntityResponse.ipv4IsnsServerAddressConfigMethod) &&
        Objects.equals(this.ipv6IsnsServerAddressConfigMethod, iscsiEntityResponse.ipv6IsnsServerAddressConfigMethod) &&
        Objects.equals(this.isnsRegistrationState, iscsiEntityResponse.isnsRegistrationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icmpPingResponseEnabled, unnamedDiscoverySessionsEnabled, isnsServerTcpListenPort, ipv4IsnsServerAddress, ipv6IsnsServerAddress, isnsServerRegistrationEnabled, hostPortsConfiguredDHCP, ipv4IsnsServerAddressConfigMethod, ipv6IsnsServerAddressConfigMethod, isnsRegistrationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiEntityResponse {\n");
    
    sb.append("    icmpPingResponseEnabled: ").append(toIndentedString(icmpPingResponseEnabled)).append("\n");
    sb.append("    unnamedDiscoverySessionsEnabled: ").append(toIndentedString(unnamedDiscoverySessionsEnabled)).append("\n");
    sb.append("    isnsServerTcpListenPort: ").append(toIndentedString(isnsServerTcpListenPort)).append("\n");
    sb.append("    ipv4IsnsServerAddress: ").append(toIndentedString(ipv4IsnsServerAddress)).append("\n");
    sb.append("    ipv6IsnsServerAddress: ").append(toIndentedString(ipv6IsnsServerAddress)).append("\n");
    sb.append("    isnsServerRegistrationEnabled: ").append(toIndentedString(isnsServerRegistrationEnabled)).append("\n");
    sb.append("    hostPortsConfiguredDHCP: ").append(toIndentedString(hostPortsConfiguredDHCP)).append("\n");
    sb.append("    ipv4IsnsServerAddressConfigMethod: ").append(toIndentedString(ipv4IsnsServerAddressConfigMethod)).append("\n");
    sb.append("    ipv6IsnsServerAddressConfigMethod: ").append(toIndentedString(ipv6IsnsServerAddressConfigMethod)).append("\n");
    sb.append("    isnsRegistrationState: ").append(toIndentedString(isnsRegistrationState)).append("\n");
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

