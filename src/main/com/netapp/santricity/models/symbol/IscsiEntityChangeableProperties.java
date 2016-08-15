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
 * IscsiEntityChangeableProperties
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IscsiEntityChangeableProperties   {
  
    private List<Boolean> icmpPingResponseEnabled;

    private List<Boolean> unnamedDiscoverySessionsEnabled;

    private List<Integer> isnsServerTcpListenPort;


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

    private List<Ipv4IsnsServerAddressConfigMethodEnum> ipv4IsnsServerAddressConfigMethod;

    private List<String> ipv4IsnsServerAddress;

    private List<String> ipv6IsnsServerAddress;

    private List<Boolean> isnsServerRegistrationEnabled;

  
  /**
   * The setting for enabling or disabling the ICMP (Internet Control Message Protocol) ping messages.
   **/
  public IscsiEntityChangeableProperties icmpPingResponseEnabled(List<Boolean> icmpPingResponseEnabled) {
    this.icmpPingResponseEnabled = icmpPingResponseEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The setting for enabling or disabling the ICMP (Internet Control Message Protocol) ping messages.")
  @JsonProperty("icmpPingResponseEnabled")
  public List<Boolean> getIcmpPingResponseEnabled() {
    return icmpPingResponseEnabled;
  }
  
  public void setIcmpPingResponseEnabled(List<Boolean> icmpPingResponseEnabled) {
    this.icmpPingResponseEnabled = icmpPingResponseEnabled;
  }

  
  /**
   * The setting for enabling or disabling unnamed discovery sessions.
   **/
  public IscsiEntityChangeableProperties unnamedDiscoverySessionsEnabled(List<Boolean> unnamedDiscoverySessionsEnabled) {
    this.unnamedDiscoverySessionsEnabled = unnamedDiscoverySessionsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The setting for enabling or disabling unnamed discovery sessions.")
  @JsonProperty("unnamedDiscoverySessionsEnabled")
  public List<Boolean> getUnnamedDiscoverySessionsEnabled() {
    return unnamedDiscoverySessionsEnabled;
  }
  
  public void setUnnamedDiscoverySessionsEnabled(List<Boolean> unnamedDiscoverySessionsEnabled) {
    this.unnamedDiscoverySessionsEnabled = unnamedDiscoverySessionsEnabled;
  }

  
  /**
   * The number of the TCP port on which the iSNS server listens for incoming connections.
   **/
  public IscsiEntityChangeableProperties isnsServerTcpListenPort(List<Integer> isnsServerTcpListenPort) {
    this.isnsServerTcpListenPort = isnsServerTcpListenPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the TCP port on which the iSNS server listens for incoming connections.")
  @JsonProperty("isnsServerTcpListenPort")
  public List<Integer> getIsnsServerTcpListenPort() {
    return isnsServerTcpListenPort;
  }
  
  public void setIsnsServerTcpListenPort(List<Integer> isnsServerTcpListenPort) {
    this.isnsServerTcpListenPort = isnsServerTcpListenPort;
  }

  
  /**
   * The IPV4 configuration method to use for determining the IP address of the iSNS server. Whenever there is a transition of the configuration method from IPV4_CONFIG_STATIC to IPV4_CONFIG_DHCP, the storage array performs the equivalent of a refreshIsnsServerLocation operation.
   **/
  public IscsiEntityChangeableProperties ipv4IsnsServerAddressConfigMethod(List<Ipv4IsnsServerAddressConfigMethodEnum> ipv4IsnsServerAddressConfigMethod) {
    this.ipv4IsnsServerAddressConfigMethod = ipv4IsnsServerAddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV4 configuration method to use for determining the IP address of the iSNS server. Whenever there is a transition of the configuration method from IPV4_CONFIG_STATIC to IPV4_CONFIG_DHCP, the storage array performs the equivalent of a refreshIsnsServerLocation operation.")
  @JsonProperty("ipv4IsnsServerAddressConfigMethod")
  public List<Ipv4IsnsServerAddressConfigMethodEnum> getIpv4IsnsServerAddressConfigMethod() {
    return ipv4IsnsServerAddressConfigMethod;
  }
  
  public void setIpv4IsnsServerAddressConfigMethod(List<Ipv4IsnsServerAddressConfigMethodEnum> ipv4IsnsServerAddressConfigMethod) {
    this.ipv4IsnsServerAddressConfigMethod = ipv4IsnsServerAddressConfigMethod;
  }

  
  /**
   * The IPV4 configuration method to use for determining the IP address of the iSNS server. Whenever there is a transition of the configuration method from IPV4_CONFIG_STATIC to IPV4_CONFIG_DHCP, the storage array performs the equivalent of a refreshIsnsServerLocation operation.
   **/
  public IscsiEntityChangeableProperties ipv4IsnsServerAddress(List<String> ipv4IsnsServerAddress) {
    this.ipv4IsnsServerAddress = ipv4IsnsServerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV4 configuration method to use for determining the IP address of the iSNS server. Whenever there is a transition of the configuration method from IPV4_CONFIG_STATIC to IPV4_CONFIG_DHCP, the storage array performs the equivalent of a refreshIsnsServerLocation operation.")
  @JsonProperty("ipv4IsnsServerAddress")
  public List<String> getIpv4IsnsServerAddress() {
    return ipv4IsnsServerAddress;
  }
  
  public void setIpv4IsnsServerAddress(List<String> ipv4IsnsServerAddress) {
    this.ipv4IsnsServerAddress = ipv4IsnsServerAddress;
  }

  
  /**
   * The IPV6 address of the iSNS server.
   **/
  public IscsiEntityChangeableProperties ipv6IsnsServerAddress(List<String> ipv6IsnsServerAddress) {
    this.ipv6IsnsServerAddress = ipv6IsnsServerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV6 address of the iSNS server.")
  @JsonProperty("ipv6IsnsServerAddress")
  public List<String> getIpv6IsnsServerAddress() {
    return ipv6IsnsServerAddress;
  }
  
  public void setIpv6IsnsServerAddress(List<String> ipv6IsnsServerAddress) {
    this.ipv6IsnsServerAddress = ipv6IsnsServerAddress;
  }

  
  /**
   * The setting is for enabling or disabling storage array registration with the iSNS server.
   **/
  public IscsiEntityChangeableProperties isnsServerRegistrationEnabled(List<Boolean> isnsServerRegistrationEnabled) {
    this.isnsServerRegistrationEnabled = isnsServerRegistrationEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The setting is for enabling or disabling storage array registration with the iSNS server.")
  @JsonProperty("isnsServerRegistrationEnabled")
  public List<Boolean> getIsnsServerRegistrationEnabled() {
    return isnsServerRegistrationEnabled;
  }
  
  public void setIsnsServerRegistrationEnabled(List<Boolean> isnsServerRegistrationEnabled) {
    this.isnsServerRegistrationEnabled = isnsServerRegistrationEnabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiEntityChangeableProperties iscsiEntityChangeableProperties = (IscsiEntityChangeableProperties) o;
    return Objects.equals(this.icmpPingResponseEnabled, iscsiEntityChangeableProperties.icmpPingResponseEnabled) &&
        Objects.equals(this.unnamedDiscoverySessionsEnabled, iscsiEntityChangeableProperties.unnamedDiscoverySessionsEnabled) &&
        Objects.equals(this.isnsServerTcpListenPort, iscsiEntityChangeableProperties.isnsServerTcpListenPort) &&
        Objects.equals(this.ipv4IsnsServerAddressConfigMethod, iscsiEntityChangeableProperties.ipv4IsnsServerAddressConfigMethod) &&
        Objects.equals(this.ipv4IsnsServerAddress, iscsiEntityChangeableProperties.ipv4IsnsServerAddress) &&
        Objects.equals(this.ipv6IsnsServerAddress, iscsiEntityChangeableProperties.ipv6IsnsServerAddress) &&
        Objects.equals(this.isnsServerRegistrationEnabled, iscsiEntityChangeableProperties.isnsServerRegistrationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icmpPingResponseEnabled, unnamedDiscoverySessionsEnabled, isnsServerTcpListenPort, ipv4IsnsServerAddressConfigMethod, ipv4IsnsServerAddress, ipv6IsnsServerAddress, isnsServerRegistrationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiEntityChangeableProperties {\n");
    
    sb.append("    icmpPingResponseEnabled: ").append(toIndentedString(icmpPingResponseEnabled)).append("\n");
    sb.append("    unnamedDiscoverySessionsEnabled: ").append(toIndentedString(unnamedDiscoverySessionsEnabled)).append("\n");
    sb.append("    isnsServerTcpListenPort: ").append(toIndentedString(isnsServerTcpListenPort)).append("\n");
    sb.append("    ipv4IsnsServerAddressConfigMethod: ").append(toIndentedString(ipv4IsnsServerAddressConfigMethod)).append("\n");
    sb.append("    ipv4IsnsServerAddress: ").append(toIndentedString(ipv4IsnsServerAddress)).append("\n");
    sb.append("    ipv6IsnsServerAddress: ").append(toIndentedString(ipv6IsnsServerAddress)).append("\n");
    sb.append("    isnsServerRegistrationEnabled: ").append(toIndentedString(isnsServerRegistrationEnabled)).append("\n");
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

