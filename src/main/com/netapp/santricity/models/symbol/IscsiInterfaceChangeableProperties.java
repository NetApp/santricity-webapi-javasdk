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
 * IscsiInterfaceChangeableProperties
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IscsiInterfaceChangeableProperties   {
  
    private List<Integer> tcpListenPort;

    private List<String> ipv4Address;

    private List<String> ipv4SubnetMask;

    private List<String> ipv4GatewayAddress;


  /**
   * Gets or Sets ipv4AddressConfigMethod
   */
  public enum Ipv4AddressConfigMethodEnum {
    configDhcp("configDhcp"),
    configStatic("configStatic"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    Ipv4AddressConfigMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<Ipv4AddressConfigMethodEnum> ipv4AddressConfigMethod;

    private List<Integer> maximumFramePayloadSize;

    private List<SettingControl> ipv4VlanId;

    private List<SettingControl> ipv4OutboundPacketPriority;

    private List<Boolean> ipv4Enabled;

    private List<Boolean> ipv6Enabled;

    private List<IpV6AddressDataBundle> ipv6LocalAddresses;

    private List<IpV6AddressDataBundle> ipv6RoutableAddresses;

    private List<IpV6AddressData> ipv6PortRouterAddress;


  /**
   * Gets or Sets ipv6AddressConfigMethod
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

    private List<Ipv6AddressConfigMethodEnum> ipv6AddressConfigMethod;

    private List<SettingControl> ipv6OutboundPacketPriority;

    private List<SettingControl> ipv6VlanId;

    private List<Integer> ipv6HopLimit;

    private List<Integer> ipv6NdReachableTime;

    private List<Integer> ipv6NdRetransmitTime;

    private List<Integer> ipv6NdStaleTimeout;

    private List<Integer> ipv6DuplicateAddressDetectionAttempts;


  /**
   * Gets or Sets maximumInterfaceSpeed
   */
  public enum MaximumInterfaceSpeedEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    speed25gig("speed25gig"),
    speed32gig("speed32gig"),
    speed100gig("speed100gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MaximumInterfaceSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<MaximumInterfaceSpeedEnum> maximumInterfaceSpeed;

  
  /**
   * The tcp port number on which to listen for incoming connections.
   **/
  public IscsiInterfaceChangeableProperties tcpListenPort(List<Integer> tcpListenPort) {
    this.tcpListenPort = tcpListenPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The tcp port number on which to listen for incoming connections.")
  @JsonProperty("tcpListenPort")
  public List<Integer> getTcpListenPort() {
    return tcpListenPort;
  }
  
  public void setTcpListenPort(List<Integer> tcpListenPort) {
    this.tcpListenPort = tcpListenPort;
  }

  
  /**
   * The IPV4 address for the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv4Address(List<String> ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV4 address for the interface.")
  @JsonProperty("ipv4Address")
  public List<String> getIpv4Address() {
    return ipv4Address;
  }
  
  public void setIpv4Address(List<String> ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  
  /**
   * The IPV4 subnet mask for the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv4SubnetMask(List<String> ipv4SubnetMask) {
    this.ipv4SubnetMask = ipv4SubnetMask;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV4 subnet mask for the interface.")
  @JsonProperty("ipv4SubnetMask")
  public List<String> getIpv4SubnetMask() {
    return ipv4SubnetMask;
  }
  
  public void setIpv4SubnetMask(List<String> ipv4SubnetMask) {
    this.ipv4SubnetMask = ipv4SubnetMask;
  }

  
  /**
   * The gateway IPV4 address for the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv4GatewayAddress(List<String> ipv4GatewayAddress) {
    this.ipv4GatewayAddress = ipv4GatewayAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The gateway IPV4 address for the interface.")
  @JsonProperty("ipv4GatewayAddress")
  public List<String> getIpv4GatewayAddress() {
    return ipv4GatewayAddress;
  }
  
  public void setIpv4GatewayAddress(List<String> ipv4GatewayAddress) {
    this.ipv4GatewayAddress = ipv4GatewayAddress;
  }

  
  /**
   * The IPV4 configuration method for the interface. The method is either by static setting of the IP address (IPV4_CONFIG_STATIC) or by use of the dynamic host configuration protocol (IPV4_CONFIG_DHCP). Whenever there is a transition of the configuration method from IPV4_CONFIG_STATIC to IPV4_CONFIG_DHCP, the storage array performs the equivalent of a refreshIscsiDhcpParameters operation.
   **/
  public IscsiInterfaceChangeableProperties ipv4AddressConfigMethod(List<Ipv4AddressConfigMethodEnum> ipv4AddressConfigMethod) {
    this.ipv4AddressConfigMethod = ipv4AddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV4 configuration method for the interface. The method is either by static setting of the IP address (IPV4_CONFIG_STATIC) or by use of the dynamic host configuration protocol (IPV4_CONFIG_DHCP). Whenever there is a transition of the configuration method from IPV4_CONFIG_STATIC to IPV4_CONFIG_DHCP, the storage array performs the equivalent of a refreshIscsiDhcpParameters operation.")
  @JsonProperty("ipv4AddressConfigMethod")
  public List<Ipv4AddressConfigMethodEnum> getIpv4AddressConfigMethod() {
    return ipv4AddressConfigMethod;
  }
  
  public void setIpv4AddressConfigMethod(List<Ipv4AddressConfigMethodEnum> ipv4AddressConfigMethod) {
    this.ipv4AddressConfigMethod = ipv4AddressConfigMethod;
  }

  
  /**
   * The maximum size of the payload section in an Ethernet frame.
   **/
  public IscsiInterfaceChangeableProperties maximumFramePayloadSize(List<Integer> maximumFramePayloadSize) {
    this.maximumFramePayloadSize = maximumFramePayloadSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum size of the payload section in an Ethernet frame.")
  @JsonProperty("maximumFramePayloadSize")
  public List<Integer> getMaximumFramePayloadSize() {
    return maximumFramePayloadSize;
  }
  
  public void setMaximumFramePayloadSize(List<Integer> maximumFramePayloadSize) {
    this.maximumFramePayloadSize = maximumFramePayloadSize;
  }

  
  /**
   * Settings that govern the value of the IPV4 VLAN identifier for the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv4VlanId(List<SettingControl> ipv4VlanId) {
    this.ipv4VlanId = ipv4VlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings that govern the value of the IPV4 VLAN identifier for the interface.")
  @JsonProperty("ipv4VlanId")
  public List<SettingControl> getIpv4VlanId() {
    return ipv4VlanId;
  }
  
  public void setIpv4VlanId(List<SettingControl> ipv4VlanId) {
    this.ipv4VlanId = ipv4VlanId;
  }

  
  /**
   * Settings that govern the priority to associate with outbound IPV4 packets sent over the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv4OutboundPacketPriority(List<SettingControl> ipv4OutboundPacketPriority) {
    this.ipv4OutboundPacketPriority = ipv4OutboundPacketPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings that govern the priority to associate with outbound IPV4 packets sent over the interface.")
  @JsonProperty("ipv4OutboundPacketPriority")
  public List<SettingControl> getIpv4OutboundPacketPriority() {
    return ipv4OutboundPacketPriority;
  }
  
  public void setIpv4OutboundPacketPriority(List<SettingControl> ipv4OutboundPacketPriority) {
    this.ipv4OutboundPacketPriority = ipv4OutboundPacketPriority;
  }

  
  /**
   * A boolean which, if set to true, indicates that IPV4 addressing should be enabled for the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv4Enabled(List<Boolean> ipv4Enabled) {
    this.ipv4Enabled = ipv4Enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A boolean which, if set to true, indicates that IPV4 addressing should be enabled for the interface.")
  @JsonProperty("ipv4Enabled")
  public List<Boolean> getIpv4Enabled() {
    return ipv4Enabled;
  }
  
  public void setIpv4Enabled(List<Boolean> ipv4Enabled) {
    this.ipv4Enabled = ipv4Enabled;
  }

  
  /**
   * A boolean which, if set to true, indicates that IPV6 addressing should be enabled for the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv6Enabled(List<Boolean> ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A boolean which, if set to true, indicates that IPV6 addressing should be enabled for the interface.")
  @JsonProperty("ipv6Enabled")
  public List<Boolean> getIpv6Enabled() {
    return ipv6Enabled;
  }
  
  public void setIpv6Enabled(List<Boolean> ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }

  
  /**
   * The set of IPV6 local addresses that are to be assigned to the interface. This set completely replaces the previous set.
   **/
  public IscsiInterfaceChangeableProperties ipv6LocalAddresses(List<IpV6AddressDataBundle> ipv6LocalAddresses) {
    this.ipv6LocalAddresses = ipv6LocalAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of IPV6 local addresses that are to be assigned to the interface. This set completely replaces the previous set.")
  @JsonProperty("ipv6LocalAddresses")
  public List<IpV6AddressDataBundle> getIpv6LocalAddresses() {
    return ipv6LocalAddresses;
  }
  
  public void setIpv6LocalAddresses(List<IpV6AddressDataBundle> ipv6LocalAddresses) {
    this.ipv6LocalAddresses = ipv6LocalAddresses;
  }

  
  /**
   * The set of IPV6 routable addresses that are to be assigned to the interface. This set completely replaces the previous set.
   **/
  public IscsiInterfaceChangeableProperties ipv6RoutableAddresses(List<IpV6AddressDataBundle> ipv6RoutableAddresses) {
    this.ipv6RoutableAddresses = ipv6RoutableAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of IPV6 routable addresses that are to be assigned to the interface. This set completely replaces the previous set.")
  @JsonProperty("ipv6RoutableAddresses")
  public List<IpV6AddressDataBundle> getIpv6RoutableAddresses() {
    return ipv6RoutableAddresses;
  }
  
  public void setIpv6RoutableAddresses(List<IpV6AddressDataBundle> ipv6RoutableAddresses) {
    this.ipv6RoutableAddresses = ipv6RoutableAddresses;
  }

  
  /**
   * The address to set for the IPV6 port router.
   **/
  public IscsiInterfaceChangeableProperties ipv6PortRouterAddress(List<IpV6AddressData> ipv6PortRouterAddress) {
    this.ipv6PortRouterAddress = ipv6PortRouterAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The address to set for the IPV6 port router.")
  @JsonProperty("ipv6PortRouterAddress")
  public List<IpV6AddressData> getIpv6PortRouterAddress() {
    return ipv6PortRouterAddress;
  }
  
  public void setIpv6PortRouterAddress(List<IpV6AddressData> ipv6PortRouterAddress) {
    this.ipv6PortRouterAddress = ipv6PortRouterAddress;
  }

  
  /**
   * The method to use in configuring IPV6 addresses for the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv6AddressConfigMethod(List<Ipv6AddressConfigMethodEnum> ipv6AddressConfigMethod) {
    this.ipv6AddressConfigMethod = ipv6AddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The method to use in configuring IPV6 addresses for the interface.")
  @JsonProperty("ipv6AddressConfigMethod")
  public List<Ipv6AddressConfigMethodEnum> getIpv6AddressConfigMethod() {
    return ipv6AddressConfigMethod;
  }
  
  public void setIpv6AddressConfigMethod(List<Ipv6AddressConfigMethodEnum> ipv6AddressConfigMethod) {
    this.ipv6AddressConfigMethod = ipv6AddressConfigMethod;
  }

  
  /**
   * Settings that govern priority assignment for packets sent over the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv6OutboundPacketPriority(List<SettingControl> ipv6OutboundPacketPriority) {
    this.ipv6OutboundPacketPriority = ipv6OutboundPacketPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings that govern priority assignment for packets sent over the interface.")
  @JsonProperty("ipv6OutboundPacketPriority")
  public List<SettingControl> getIpv6OutboundPacketPriority() {
    return ipv6OutboundPacketPriority;
  }
  
  public void setIpv6OutboundPacketPriority(List<SettingControl> ipv6OutboundPacketPriority) {
    this.ipv6OutboundPacketPriority = ipv6OutboundPacketPriority;
  }

  
  /**
   * Settings that govern VLAN identifier assignment for packets sent over the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv6VlanId(List<SettingControl> ipv6VlanId) {
    this.ipv6VlanId = ipv6VlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings that govern VLAN identifier assignment for packets sent over the interface.")
  @JsonProperty("ipv6VlanId")
  public List<SettingControl> getIpv6VlanId() {
    return ipv6VlanId;
  }
  
  public void setIpv6VlanId(List<SettingControl> ipv6VlanId) {
    this.ipv6VlanId = ipv6VlanId;
  }

  
  /**
   * The hop limit to use in IPV6 packets sent over the interface.
   **/
  public IscsiInterfaceChangeableProperties ipv6HopLimit(List<Integer> ipv6HopLimit) {
    this.ipv6HopLimit = ipv6HopLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The hop limit to use in IPV6 packets sent over the interface.")
  @JsonProperty("ipv6HopLimit")
  public List<Integer> getIpv6HopLimit() {
    return ipv6HopLimit;
  }
  
  public void setIpv6HopLimit(List<Integer> ipv6HopLimit) {
    this.ipv6HopLimit = ipv6HopLimit;
  }

  
  /**
   * The amount of time in milliseconds, within which a neighbor is assumed to be reachable
   **/
  public IscsiInterfaceChangeableProperties ipv6NdReachableTime(List<Integer> ipv6NdReachableTime) {
    this.ipv6NdReachableTime = ipv6NdReachableTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of time in milliseconds, within which a neighbor is assumed to be reachable")
  @JsonProperty("ipv6NdReachableTime")
  public List<Integer> getIpv6NdReachableTime() {
    return ipv6NdReachableTime;
  }
  
  public void setIpv6NdReachableTime(List<Integer> ipv6NdReachableTime) {
    this.ipv6NdReachableTime = ipv6NdReachableTime;
  }

  
  /**
   * The number of milliseconds between neighbor solicitation probes.
   **/
  public IscsiInterfaceChangeableProperties ipv6NdRetransmitTime(List<Integer> ipv6NdRetransmitTime) {
    this.ipv6NdRetransmitTime = ipv6NdRetransmitTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of milliseconds between neighbor solicitation probes.")
  @JsonProperty("ipv6NdRetransmitTime")
  public List<Integer> getIpv6NdRetransmitTime() {
    return ipv6NdRetransmitTime;
  }
  
  public void setIpv6NdRetransmitTime(List<Integer> ipv6NdRetransmitTime) {
    this.ipv6NdRetransmitTime = ipv6NdRetransmitTime;
  }

  
  /**
   * The time in milliseconds after which information for a neighbor that cannot be verified as reachable will be considered \"stale.
   **/
  public IscsiInterfaceChangeableProperties ipv6NdStaleTimeout(List<Integer> ipv6NdStaleTimeout) {
    this.ipv6NdStaleTimeout = ipv6NdStaleTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time in milliseconds after which information for a neighbor that cannot be verified as reachable will be considered \"stale.")
  @JsonProperty("ipv6NdStaleTimeout")
  public List<Integer> getIpv6NdStaleTimeout() {
    return ipv6NdStaleTimeout;
  }
  
  public void setIpv6NdStaleTimeout(List<Integer> ipv6NdStaleTimeout) {
    this.ipv6NdStaleTimeout = ipv6NdStaleTimeout;
  }

  
  /**
   * The number of neighbor-solicitation messages to send in trying to determine IP address uniqueness.
   **/
  public IscsiInterfaceChangeableProperties ipv6DuplicateAddressDetectionAttempts(List<Integer> ipv6DuplicateAddressDetectionAttempts) {
    this.ipv6DuplicateAddressDetectionAttempts = ipv6DuplicateAddressDetectionAttempts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of neighbor-solicitation messages to send in trying to determine IP address uniqueness.")
  @JsonProperty("ipv6DuplicateAddressDetectionAttempts")
  public List<Integer> getIpv6DuplicateAddressDetectionAttempts() {
    return ipv6DuplicateAddressDetectionAttempts;
  }
  
  public void setIpv6DuplicateAddressDetectionAttempts(List<Integer> ipv6DuplicateAddressDetectionAttempts) {
    this.ipv6DuplicateAddressDetectionAttempts = ipv6DuplicateAddressDetectionAttempts;
  }

  
  /**
   * This field is used to set the maximum interface speed. If autoconfiguration is supported (see the autoconfigSupport field in the EthernetInterfaceData structure), the value in this field is ignored.
   **/
  public IscsiInterfaceChangeableProperties maximumInterfaceSpeed(List<MaximumInterfaceSpeedEnum> maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is used to set the maximum interface speed. If autoconfiguration is supported (see the autoconfigSupport field in the EthernetInterfaceData structure), the value in this field is ignored.")
  @JsonProperty("maximumInterfaceSpeed")
  public List<MaximumInterfaceSpeedEnum> getMaximumInterfaceSpeed() {
    return maximumInterfaceSpeed;
  }
  
  public void setMaximumInterfaceSpeed(List<MaximumInterfaceSpeedEnum> maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiInterfaceChangeableProperties iscsiInterfaceChangeableProperties = (IscsiInterfaceChangeableProperties) o;
    return Objects.equals(this.tcpListenPort, iscsiInterfaceChangeableProperties.tcpListenPort) &&
        Objects.equals(this.ipv4Address, iscsiInterfaceChangeableProperties.ipv4Address) &&
        Objects.equals(this.ipv4SubnetMask, iscsiInterfaceChangeableProperties.ipv4SubnetMask) &&
        Objects.equals(this.ipv4GatewayAddress, iscsiInterfaceChangeableProperties.ipv4GatewayAddress) &&
        Objects.equals(this.ipv4AddressConfigMethod, iscsiInterfaceChangeableProperties.ipv4AddressConfigMethod) &&
        Objects.equals(this.maximumFramePayloadSize, iscsiInterfaceChangeableProperties.maximumFramePayloadSize) &&
        Objects.equals(this.ipv4VlanId, iscsiInterfaceChangeableProperties.ipv4VlanId) &&
        Objects.equals(this.ipv4OutboundPacketPriority, iscsiInterfaceChangeableProperties.ipv4OutboundPacketPriority) &&
        Objects.equals(this.ipv4Enabled, iscsiInterfaceChangeableProperties.ipv4Enabled) &&
        Objects.equals(this.ipv6Enabled, iscsiInterfaceChangeableProperties.ipv6Enabled) &&
        Objects.equals(this.ipv6LocalAddresses, iscsiInterfaceChangeableProperties.ipv6LocalAddresses) &&
        Objects.equals(this.ipv6RoutableAddresses, iscsiInterfaceChangeableProperties.ipv6RoutableAddresses) &&
        Objects.equals(this.ipv6PortRouterAddress, iscsiInterfaceChangeableProperties.ipv6PortRouterAddress) &&
        Objects.equals(this.ipv6AddressConfigMethod, iscsiInterfaceChangeableProperties.ipv6AddressConfigMethod) &&
        Objects.equals(this.ipv6OutboundPacketPriority, iscsiInterfaceChangeableProperties.ipv6OutboundPacketPriority) &&
        Objects.equals(this.ipv6VlanId, iscsiInterfaceChangeableProperties.ipv6VlanId) &&
        Objects.equals(this.ipv6HopLimit, iscsiInterfaceChangeableProperties.ipv6HopLimit) &&
        Objects.equals(this.ipv6NdReachableTime, iscsiInterfaceChangeableProperties.ipv6NdReachableTime) &&
        Objects.equals(this.ipv6NdRetransmitTime, iscsiInterfaceChangeableProperties.ipv6NdRetransmitTime) &&
        Objects.equals(this.ipv6NdStaleTimeout, iscsiInterfaceChangeableProperties.ipv6NdStaleTimeout) &&
        Objects.equals(this.ipv6DuplicateAddressDetectionAttempts, iscsiInterfaceChangeableProperties.ipv6DuplicateAddressDetectionAttempts) &&
        Objects.equals(this.maximumInterfaceSpeed, iscsiInterfaceChangeableProperties.maximumInterfaceSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcpListenPort, ipv4Address, ipv4SubnetMask, ipv4GatewayAddress, ipv4AddressConfigMethod, maximumFramePayloadSize, ipv4VlanId, ipv4OutboundPacketPriority, ipv4Enabled, ipv6Enabled, ipv6LocalAddresses, ipv6RoutableAddresses, ipv6PortRouterAddress, ipv6AddressConfigMethod, ipv6OutboundPacketPriority, ipv6VlanId, ipv6HopLimit, ipv6NdReachableTime, ipv6NdRetransmitTime, ipv6NdStaleTimeout, ipv6DuplicateAddressDetectionAttempts, maximumInterfaceSpeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiInterfaceChangeableProperties {\n");
    
    sb.append("    tcpListenPort: ").append(toIndentedString(tcpListenPort)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv4SubnetMask: ").append(toIndentedString(ipv4SubnetMask)).append("\n");
    sb.append("    ipv4GatewayAddress: ").append(toIndentedString(ipv4GatewayAddress)).append("\n");
    sb.append("    ipv4AddressConfigMethod: ").append(toIndentedString(ipv4AddressConfigMethod)).append("\n");
    sb.append("    maximumFramePayloadSize: ").append(toIndentedString(maximumFramePayloadSize)).append("\n");
    sb.append("    ipv4VlanId: ").append(toIndentedString(ipv4VlanId)).append("\n");
    sb.append("    ipv4OutboundPacketPriority: ").append(toIndentedString(ipv4OutboundPacketPriority)).append("\n");
    sb.append("    ipv4Enabled: ").append(toIndentedString(ipv4Enabled)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
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
    sb.append("    maximumInterfaceSpeed: ").append(toIndentedString(maximumInterfaceSpeed)).append("\n");
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

