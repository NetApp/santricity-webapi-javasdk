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
 * InternetProtocolV6Data
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class InternetProtocolV6Data   {
  
    private List<IpV6AddressData> ipv6LocalAddresses;

    private List<IpV6AddressData> ipv6RoutableAddresses;

    private IpV6AddressData ipv6PortRouterAddress;


  /**
   * The method by which the IPV6 address information is configured for the endpoint.
   */
  public enum Ipv6AddressConfigMethodEnum {
    configStatic("configStatic"),
    configStateless("configStateless"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    Ipv6AddressConfigMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private Ipv6AddressConfigMethodEnum ipv6AddressConfigMethod;

    private SettingControl ipv6OutboundPacketPriority;

    private SettingControl ipv6VlanId;

    private Integer ipv6HopLimit;

    private Integer ipv6NdReachableTime;

    private Integer ipv6NdRetransmitTime;

    private Integer ipv6NdStaleTimeout;

    private Integer ipv6DuplicateAddressDetectionAttempts;

  
  /**
   * The set of IPV6 local addresses that have been assigned to the iSCSI Ethernet port.
   **/
  public InternetProtocolV6Data ipv6LocalAddresses(List<IpV6AddressData> ipv6LocalAddresses) {
    this.ipv6LocalAddresses = ipv6LocalAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of IPV6 local addresses that have been assigned to the iSCSI Ethernet port.")
  @JsonProperty("ipv6LocalAddresses")
  public List<IpV6AddressData> getIpv6LocalAddresses() {
    return ipv6LocalAddresses;
  }
  
  public void setIpv6LocalAddresses(List<IpV6AddressData> ipv6LocalAddresses) {
    this.ipv6LocalAddresses = ipv6LocalAddresses;
  }

  
  /**
   * The set of IPV6 routable addresses that have been assigned to the iSCSI Ethernet port
   **/
  public InternetProtocolV6Data ipv6RoutableAddresses(List<IpV6AddressData> ipv6RoutableAddresses) {
    this.ipv6RoutableAddresses = ipv6RoutableAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of IPV6 routable addresses that have been assigned to the iSCSI Ethernet port")
  @JsonProperty("ipv6RoutableAddresses")
  public List<IpV6AddressData> getIpv6RoutableAddresses() {
    return ipv6RoutableAddresses;
  }
  
  public void setIpv6RoutableAddresses(List<IpV6AddressData> ipv6RoutableAddresses) {
    this.ipv6RoutableAddresses = ipv6RoutableAddresses;
  }

  
  /**
   * The IPV6 address of the port router.
   **/
  public InternetProtocolV6Data ipv6PortRouterAddress(IpV6AddressData ipv6PortRouterAddress) {
    this.ipv6PortRouterAddress = ipv6PortRouterAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV6 address of the port router.")
  @JsonProperty("ipv6PortRouterAddress")
  public IpV6AddressData getIpv6PortRouterAddress() {
    return ipv6PortRouterAddress;
  }
  
  public void setIpv6PortRouterAddress(IpV6AddressData ipv6PortRouterAddress) {
    this.ipv6PortRouterAddress = ipv6PortRouterAddress;
  }

  
  /**
   * The method by which the IPV6 address information is configured for the endpoint.
   **/
  public InternetProtocolV6Data ipv6AddressConfigMethod(Ipv6AddressConfigMethodEnum ipv6AddressConfigMethod) {
    this.ipv6AddressConfigMethod = ipv6AddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The method by which the IPV6 address information is configured for the endpoint.")
  @JsonProperty("ipv6AddressConfigMethod")
  public Ipv6AddressConfigMethodEnum getIpv6AddressConfigMethod() {
    return ipv6AddressConfigMethod;
  }
  
  public void setIpv6AddressConfigMethod(Ipv6AddressConfigMethodEnum ipv6AddressConfigMethod) {
    this.ipv6AddressConfigMethod = ipv6AddressConfigMethod;
  }

  
  /**
   * Settings that govern the priority to associate with outbound IPV6 packets sent over the interface
   **/
  public InternetProtocolV6Data ipv6OutboundPacketPriority(SettingControl ipv6OutboundPacketPriority) {
    this.ipv6OutboundPacketPriority = ipv6OutboundPacketPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings that govern the priority to associate with outbound IPV6 packets sent over the interface")
  @JsonProperty("ipv6OutboundPacketPriority")
  public SettingControl getIpv6OutboundPacketPriority() {
    return ipv6OutboundPacketPriority;
  }
  
  public void setIpv6OutboundPacketPriority(SettingControl ipv6OutboundPacketPriority) {
    this.ipv6OutboundPacketPriority = ipv6OutboundPacketPriority;
  }

  
  /**
   * Settings that govern the value of the IPV6 VLAN identifier for the interface. VLAN identifiers are in the range 1 through 4094.
   **/
  public InternetProtocolV6Data ipv6VlanId(SettingControl ipv6VlanId) {
    this.ipv6VlanId = ipv6VlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings that govern the value of the IPV6 VLAN identifier for the interface. VLAN identifiers are in the range 1 through 4094.")
  @JsonProperty("ipv6VlanId")
  public SettingControl getIpv6VlanId() {
    return ipv6VlanId;
  }
  
  public void setIpv6VlanId(SettingControl ipv6VlanId) {
    this.ipv6VlanId = ipv6VlanId;
  }

  
  /**
   * The hop limit to use in IPV6 packets sent over the interface.
   **/
  public InternetProtocolV6Data ipv6HopLimit(Integer ipv6HopLimit) {
    this.ipv6HopLimit = ipv6HopLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The hop limit to use in IPV6 packets sent over the interface.")
  @JsonProperty("ipv6HopLimit")
  public Integer getIpv6HopLimit() {
    return ipv6HopLimit;
  }
  
  public void setIpv6HopLimit(Integer ipv6HopLimit) {
    this.ipv6HopLimit = ipv6HopLimit;
  }

  
  /**
   * A \"neighbor discovery\" parameter - the amount of time in milliseconds, within which a neighbor is assumed to be reachable.
   **/
  public InternetProtocolV6Data ipv6NdReachableTime(Integer ipv6NdReachableTime) {
    this.ipv6NdReachableTime = ipv6NdReachableTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A \"neighbor discovery\" parameter - the amount of time in milliseconds, within which a neighbor is assumed to be reachable.")
  @JsonProperty("ipv6NdReachableTime")
  public Integer getIpv6NdReachableTime() {
    return ipv6NdReachableTime;
  }
  
  public void setIpv6NdReachableTime(Integer ipv6NdReachableTime) {
    this.ipv6NdReachableTime = ipv6NdReachableTime;
  }

  
  /**
   * A \"neighbor discovery\" parameter - the number of milliseconds between neighbor solicitation probes.
   **/
  public InternetProtocolV6Data ipv6NdRetransmitTime(Integer ipv6NdRetransmitTime) {
    this.ipv6NdRetransmitTime = ipv6NdRetransmitTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A \"neighbor discovery\" parameter - the number of milliseconds between neighbor solicitation probes.")
  @JsonProperty("ipv6NdRetransmitTime")
  public Integer getIpv6NdRetransmitTime() {
    return ipv6NdRetransmitTime;
  }
  
  public void setIpv6NdRetransmitTime(Integer ipv6NdRetransmitTime) {
    this.ipv6NdRetransmitTime = ipv6NdRetransmitTime;
  }

  
  /**
   * A \"neighbor discovery\" parameter - the time in milliseconds after which information for a neighbor that cannot be verified as reachable will be considered \"stale.\"
   **/
  public InternetProtocolV6Data ipv6NdStaleTimeout(Integer ipv6NdStaleTimeout) {
    this.ipv6NdStaleTimeout = ipv6NdStaleTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A \"neighbor discovery\" parameter - the time in milliseconds after which information for a neighbor that cannot be verified as reachable will be considered \"stale.\"")
  @JsonProperty("ipv6NdStaleTimeout")
  public Integer getIpv6NdStaleTimeout() {
    return ipv6NdStaleTimeout;
  }
  
  public void setIpv6NdStaleTimeout(Integer ipv6NdStaleTimeout) {
    this.ipv6NdStaleTimeout = ipv6NdStaleTimeout;
  }

  
  /**
   * The number of neighbor-solicitation messages to send in trying to determine IP address uniqueness.
   **/
  public InternetProtocolV6Data ipv6DuplicateAddressDetectionAttempts(Integer ipv6DuplicateAddressDetectionAttempts) {
    this.ipv6DuplicateAddressDetectionAttempts = ipv6DuplicateAddressDetectionAttempts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of neighbor-solicitation messages to send in trying to determine IP address uniqueness.")
  @JsonProperty("ipv6DuplicateAddressDetectionAttempts")
  public Integer getIpv6DuplicateAddressDetectionAttempts() {
    return ipv6DuplicateAddressDetectionAttempts;
  }
  
  public void setIpv6DuplicateAddressDetectionAttempts(Integer ipv6DuplicateAddressDetectionAttempts) {
    this.ipv6DuplicateAddressDetectionAttempts = ipv6DuplicateAddressDetectionAttempts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternetProtocolV6Data internetProtocolV6Data = (InternetProtocolV6Data) o;
    return Objects.equals(this.ipv6LocalAddresses, internetProtocolV6Data.ipv6LocalAddresses) &&
        Objects.equals(this.ipv6RoutableAddresses, internetProtocolV6Data.ipv6RoutableAddresses) &&
        Objects.equals(this.ipv6PortRouterAddress, internetProtocolV6Data.ipv6PortRouterAddress) &&
        Objects.equals(this.ipv6AddressConfigMethod, internetProtocolV6Data.ipv6AddressConfigMethod) &&
        Objects.equals(this.ipv6OutboundPacketPriority, internetProtocolV6Data.ipv6OutboundPacketPriority) &&
        Objects.equals(this.ipv6VlanId, internetProtocolV6Data.ipv6VlanId) &&
        Objects.equals(this.ipv6HopLimit, internetProtocolV6Data.ipv6HopLimit) &&
        Objects.equals(this.ipv6NdReachableTime, internetProtocolV6Data.ipv6NdReachableTime) &&
        Objects.equals(this.ipv6NdRetransmitTime, internetProtocolV6Data.ipv6NdRetransmitTime) &&
        Objects.equals(this.ipv6NdStaleTimeout, internetProtocolV6Data.ipv6NdStaleTimeout) &&
        Objects.equals(this.ipv6DuplicateAddressDetectionAttempts, internetProtocolV6Data.ipv6DuplicateAddressDetectionAttempts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv6LocalAddresses, ipv6RoutableAddresses, ipv6PortRouterAddress, ipv6AddressConfigMethod, ipv6OutboundPacketPriority, ipv6VlanId, ipv6HopLimit, ipv6NdReachableTime, ipv6NdRetransmitTime, ipv6NdStaleTimeout, ipv6DuplicateAddressDetectionAttempts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternetProtocolV6Data {\n");
    
    sb.append("    ipv6LocalAddresses: ").append(toIndentedString(ipv6LocalAddresses)).append("\n");
    sb.append("    ipv6RoutableAddresses: ").append(toIndentedString(ipv6RoutableAddresses)).append("\n");
    sb.append("    ipv6PortRouterAddress: ").append(toIndentedString(ipv6PortRouterAddress)).append("\n");
    sb.append("    ipv6AddressConfigMethod: ").append(toIndentedString(ipv6AddressConfigMethod)).append("\n");
    sb.append("    ipv6OutboundPacketPriority: ").append(toIndentedString(ipv6OutboundPacketPriority)).append("\n");
    sb.append("    ipv6VlanId: ").append(toIndentedString(ipv6VlanId)).append("\n");
    sb.append("    ipv6HopLimit: ").append(toIndentedString(ipv6HopLimit)).append("\n");
    sb.append("    ipv6NdReachableTime: ").append(toIndentedString(ipv6NdReachableTime)).append("\n");
    sb.append("    ipv6NdRetransmitTime: ").append(toIndentedString(ipv6NdRetransmitTime)).append("\n");
    sb.append("    ipv6NdStaleTimeout: ").append(toIndentedString(ipv6NdStaleTimeout)).append("\n");
    sb.append("    ipv6DuplicateAddressDetectionAttempts: ").append(toIndentedString(ipv6DuplicateAddressDetectionAttempts)).append("\n");
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

