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
 * EthernetInterface
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class EthernetInterface   {
  
    private String interfaceName;

    private Integer channel;

    private Integer speed;

    private Integer ip;

    private String alias;

    private String macAddr;

    private Integer gatewayIp;

    private Integer subnetMask;

    private Boolean bootpUsed;

    private Boolean rloginEnabled;

    private String reserved1;

    private Boolean setupError;

    private String reserved2;

    private String interfaceRef;


  /**
   * The status of the network link for this interface.
   */
  public enum LinkStatusEnum {
    none("none"),
    up("up"),
    down("down"),
    failed("failed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    LinkStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LinkStatusEnum linkStatus;

    private Boolean ipv4Enabled;

    private String ipv4Address;

    private String ipv4SubnetMask;


  /**
   * The method by which the IPV4 address information is configured.
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

    private Ipv4AddressConfigMethodEnum ipv4AddressConfigMethod;

    private Boolean ipv6Enabled;

    private IpV6AddressData ipv6LocalAddress;

    private IpV6AddressData ipv6PortStaticRoutableAddress;

    private List<IpV6AddressData> ipv6PortRoutableAddresses;


  /**
   * The method by which the IPV6 address information is configured for the interface.
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

    private Boolean fullDuplex;


  /**
   * Gets or Sets supportedSpeedSettings
   */
  public enum SupportedSpeedSettingsEnum {
    speedNone("speedNone"),
    speedAutoNegotiated("speedAutoNegotiated"),
    speed10MbitHalfDuplex("speed10MbitHalfDuplex"),
    speed10MbitFullDuplex("speed10MbitFullDuplex"),
    speed100MbitHalfDuplex("speed100MbitHalfDuplex"),
    speed100MbitFullDuplex("speed100MbitFullDuplex"),
    speed1000MbitHalfDuplex("speed1000MbitHalfDuplex"),
    speed1000MbitFullDuplex("speed1000MbitFullDuplex"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SupportedSpeedSettingsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SupportedSpeedSettingsEnum> supportedSpeedSettings;


  /**
   * Configured setting for the interface.
   */
  public enum ConfiguredSpeedSettingEnum {
    speedNone("speedNone"),
    speedAutoNegotiated("speedAutoNegotiated"),
    speed10MbitHalfDuplex("speed10MbitHalfDuplex"),
    speed10MbitFullDuplex("speed10MbitFullDuplex"),
    speed100MbitHalfDuplex("speed100MbitHalfDuplex"),
    speed100MbitFullDuplex("speed100MbitFullDuplex"),
    speed1000MbitHalfDuplex("speed1000MbitHalfDuplex"),
    speed1000MbitFullDuplex("speed1000MbitFullDuplex"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ConfiguredSpeedSettingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ConfiguredSpeedSettingEnum configuredSpeedSetting;


  /**
   * Current speed of the interface.
   */
  public enum CurrentSpeedEnum {
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

    CurrentSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentSpeedEnum currentSpeed;

    private Location physicalLocation;

  
  /**
   * Name of the Ethernet port, as reported by the controller.
   **/
  public EthernetInterface interfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the Ethernet port, as reported by the controller.")
  @JsonProperty("interfaceName")
  public String getInterfaceName() {
    return interfaceName;
  }
  
  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }

  
  /**
   * The channel number of this Ethernet interface.
   **/
  public EthernetInterface channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel number of this Ethernet interface.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The speed of the interface, as currently configured, in Mbit/sec.
   **/
  public EthernetInterface speed(Integer speed) {
    this.speed = speed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The speed of the interface, as currently configured, in Mbit/sec.")
  @JsonProperty("speed")
  public Integer getSpeed() {
    return speed;
  }
  
  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  
  /**
   * The 32-bit IP protocol address assigned to the interface.
   **/
  public EthernetInterface ip(Integer ip) {
    this.ip = ip;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The 32-bit IP protocol address assigned to the interface.")
  @JsonProperty("ip")
  public Integer getIp() {
    return ip;
  }
  
  public void setIp(Integer ip) {
    this.ip = ip;
  }

  
  /**
   * An ASCII string that identifies the alias name for the interface; this name is presumed to be associated with the IP protocol address.
   **/
  public EthernetInterface alias(String alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII string that identifies the alias name for the interface; this name is presumed to be associated with the IP protocol address.")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  
  public void setAlias(String alias) {
    this.alias = alias;
  }

  
  /**
   * An ASCII string representation of the globally-unique 48-bit MAC address assigned to the Ethernet interface.
   **/
  public EthernetInterface macAddr(String macAddr) {
    this.macAddr = macAddr;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII string representation of the globally-unique 48-bit MAC address assigned to the Ethernet interface.")
  @JsonProperty("macAddr")
  public String getMacAddr() {
    return macAddr;
  }
  
  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  
  /**
   * IP address of the gateway.
   **/
  public EthernetInterface gatewayIp(Integer gatewayIp) {
    this.gatewayIp = gatewayIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IP address of the gateway.")
  @JsonProperty("gatewayIp")
  public Integer getGatewayIp() {
    return gatewayIp;
  }
  
  public void setGatewayIp(Integer gatewayIp) {
    this.gatewayIp = gatewayIp;
  }

  
  /**
   * Network subnet mask.
   **/
  public EthernetInterface subnetMask(Integer subnetMask) {
    this.subnetMask = subnetMask;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Network subnet mask.")
  @JsonProperty("subnetMask")
  public Integer getSubnetMask() {
    return subnetMask;
  }
  
  public void setSubnetMask(Integer subnetMask) {
    this.subnetMask = subnetMask;
  }

  
  /**
   * Bootpserver used to get network parameters.
   **/
  public EthernetInterface bootpUsed(Boolean bootpUsed) {
    this.bootpUsed = bootpUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bootpserver used to get network parameters.")
  @JsonProperty("bootpUsed")
  public Boolean getBootpUsed() {
    return bootpUsed;
  }
  
  public void setBootpUsed(Boolean bootpUsed) {
    this.bootpUsed = bootpUsed;
  }

  
  /**
   * True if rlogin sessions are allowed.
   **/
  public EthernetInterface rloginEnabled(Boolean rloginEnabled) {
    this.rloginEnabled = rloginEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if rlogin sessions are allowed.")
  @JsonProperty("rloginEnabled")
  public Boolean getRloginEnabled() {
    return rloginEnabled;
  }
  
  public void setRloginEnabled(Boolean rloginEnabled) {
    this.rloginEnabled = rloginEnabled;
  }

  
  /**
   **/
  public EthernetInterface reserved1(String reserved1) {
    this.reserved1 = reserved1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved1")
  public String getReserved1() {
    return reserved1;
  }
  
  public void setReserved1(String reserved1) {
    this.reserved1 = reserved1;
  }

  
  /**
   * Set to true if there is a configuration error.
   **/
  public EthernetInterface setupError(Boolean setupError) {
    this.setupError = setupError;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if there is a configuration error.")
  @JsonProperty("setupError")
  public Boolean getSetupError() {
    return setupError;
  }
  
  public void setSetupError(Boolean setupError) {
    this.setupError = setupError;
  }

  
  /**
   **/
  public EthernetInterface reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  
  /**
   * The unique identifier for a given instance of this structure.
   **/
  public EthernetInterface interfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier for a given instance of this structure.")
  @JsonProperty("interfaceRef")
  public String getInterfaceRef() {
    return interfaceRef;
  }
  
  public void setInterfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
  }

  
  /**
   * The status of the network link for this interface.
   **/
  public EthernetInterface linkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the network link for this interface.")
  @JsonProperty("linkStatus")
  public LinkStatusEnum getLinkStatus() {
    return linkStatus;
  }
  
  public void setLinkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
  }

  
  /**
   * True if IPV4 is enabled for this interface; otherwise false.
   **/
  public EthernetInterface ipv4Enabled(Boolean ipv4Enabled) {
    this.ipv4Enabled = ipv4Enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if IPV4 is enabled for this interface; otherwise false.")
  @JsonProperty("ipv4Enabled")
  public Boolean getIpv4Enabled() {
    return ipv4Enabled;
  }
  
  public void setIpv4Enabled(Boolean ipv4Enabled) {
    this.ipv4Enabled = ipv4Enabled;
  }

  
  /**
   * The IPV4 address for the interface.
   **/
  public EthernetInterface ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV4 address for the interface.")
  @JsonProperty("ipv4Address")
  public String getIpv4Address() {
    return ipv4Address;
  }
  
  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  
  /**
   * The IPV4 subnet mask for the interface.
   **/
  public EthernetInterface ipv4SubnetMask(String ipv4SubnetMask) {
    this.ipv4SubnetMask = ipv4SubnetMask;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV4 subnet mask for the interface.")
  @JsonProperty("ipv4SubnetMask")
  public String getIpv4SubnetMask() {
    return ipv4SubnetMask;
  }
  
  public void setIpv4SubnetMask(String ipv4SubnetMask) {
    this.ipv4SubnetMask = ipv4SubnetMask;
  }

  
  /**
   * The method by which the IPV4 address information is configured.
   **/
  public EthernetInterface ipv4AddressConfigMethod(Ipv4AddressConfigMethodEnum ipv4AddressConfigMethod) {
    this.ipv4AddressConfigMethod = ipv4AddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The method by which the IPV4 address information is configured.")
  @JsonProperty("ipv4AddressConfigMethod")
  public Ipv4AddressConfigMethodEnum getIpv4AddressConfigMethod() {
    return ipv4AddressConfigMethod;
  }
  
  public void setIpv4AddressConfigMethod(Ipv4AddressConfigMethodEnum ipv4AddressConfigMethod) {
    this.ipv4AddressConfigMethod = ipv4AddressConfigMethod;
  }

  
  /**
   * True if IPV6 is enabled for this interface; otherwise false.
   **/
  public EthernetInterface ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if IPV6 is enabled for this interface; otherwise false.")
  @JsonProperty("ipv6Enabled")
  public Boolean getIpv6Enabled() {
    return ipv6Enabled;
  }
  
  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }

  
  /**
   * The IPV6 local address for the interface and associated data.
   **/
  public EthernetInterface ipv6LocalAddress(IpV6AddressData ipv6LocalAddress) {
    this.ipv6LocalAddress = ipv6LocalAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV6 local address for the interface and associated data.")
  @JsonProperty("ipv6LocalAddress")
  public IpV6AddressData getIpv6LocalAddress() {
    return ipv6LocalAddress;
  }
  
  public void setIpv6LocalAddress(IpV6AddressData ipv6LocalAddress) {
    this.ipv6LocalAddress = ipv6LocalAddress;
  }

  
  /**
   * The IPV6 static routable address for the interface and associated data.
   **/
  public EthernetInterface ipv6PortStaticRoutableAddress(IpV6AddressData ipv6PortStaticRoutableAddress) {
    this.ipv6PortStaticRoutableAddress = ipv6PortStaticRoutableAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV6 static routable address for the interface and associated data.")
  @JsonProperty("ipv6PortStaticRoutableAddress")
  public IpV6AddressData getIpv6PortStaticRoutableAddress() {
    return ipv6PortStaticRoutableAddress;
  }
  
  public void setIpv6PortStaticRoutableAddress(IpV6AddressData ipv6PortStaticRoutableAddress) {
    this.ipv6PortStaticRoutableAddress = ipv6PortStaticRoutableAddress;
  }

  
  /**
   * The set of IPV6 port routable addresses for the interface.
   **/
  public EthernetInterface ipv6PortRoutableAddresses(List<IpV6AddressData> ipv6PortRoutableAddresses) {
    this.ipv6PortRoutableAddresses = ipv6PortRoutableAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of IPV6 port routable addresses for the interface.")
  @JsonProperty("ipv6PortRoutableAddresses")
  public List<IpV6AddressData> getIpv6PortRoutableAddresses() {
    return ipv6PortRoutableAddresses;
  }
  
  public void setIpv6PortRoutableAddresses(List<IpV6AddressData> ipv6PortRoutableAddresses) {
    this.ipv6PortRoutableAddresses = ipv6PortRoutableAddresses;
  }

  
  /**
   * The method by which the IPV6 address information is configured for the interface.
   **/
  public EthernetInterface ipv6AddressConfigMethod(Ipv6AddressConfigMethodEnum ipv6AddressConfigMethod) {
    this.ipv6AddressConfigMethod = ipv6AddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The method by which the IPV6 address information is configured for the interface.")
  @JsonProperty("ipv6AddressConfigMethod")
  public Ipv6AddressConfigMethodEnum getIpv6AddressConfigMethod() {
    return ipv6AddressConfigMethod;
  }
  
  public void setIpv6AddressConfigMethod(Ipv6AddressConfigMethodEnum ipv6AddressConfigMethod) {
    this.ipv6AddressConfigMethod = ipv6AddressConfigMethod;
  }

  
  /**
   * If set to true, the interface is operating in full duplex mode; otherwise, it is operating in half-duplex mode.
   **/
  public EthernetInterface fullDuplex(Boolean fullDuplex) {
    this.fullDuplex = fullDuplex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If set to true, the interface is operating in full duplex mode; otherwise, it is operating in half-duplex mode.")
  @JsonProperty("fullDuplex")
  public Boolean getFullDuplex() {
    return fullDuplex;
  }
  
  public void setFullDuplex(Boolean fullDuplex) {
    this.fullDuplex = fullDuplex;
  }

  
  /**
   * Support speed setting for interface
   **/
  public EthernetInterface supportedSpeedSettings(List<SupportedSpeedSettingsEnum> supportedSpeedSettings) {
    this.supportedSpeedSettings = supportedSpeedSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Support speed setting for interface")
  @JsonProperty("supportedSpeedSettings")
  public List<SupportedSpeedSettingsEnum> getSupportedSpeedSettings() {
    return supportedSpeedSettings;
  }
  
  public void setSupportedSpeedSettings(List<SupportedSpeedSettingsEnum> supportedSpeedSettings) {
    this.supportedSpeedSettings = supportedSpeedSettings;
  }

  
  /**
   * Configured setting for the interface.
   **/
  public EthernetInterface configuredSpeedSetting(ConfiguredSpeedSettingEnum configuredSpeedSetting) {
    this.configuredSpeedSetting = configuredSpeedSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configured setting for the interface.")
  @JsonProperty("configuredSpeedSetting")
  public ConfiguredSpeedSettingEnum getConfiguredSpeedSetting() {
    return configuredSpeedSetting;
  }
  
  public void setConfiguredSpeedSetting(ConfiguredSpeedSettingEnum configuredSpeedSetting) {
    this.configuredSpeedSetting = configuredSpeedSetting;
  }

  
  /**
   * Current speed of the interface.
   **/
  public EthernetInterface currentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Current speed of the interface.")
  @JsonProperty("currentSpeed")
  public CurrentSpeedEnum getCurrentSpeed() {
    return currentSpeed;
  }
  
  public void setCurrentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  
  /**
   * The physical location of the Ethernet interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st ethernet interface relative to the parent,\" \"2nd ethernet interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.
   **/
  public EthernetInterface physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the Ethernet interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st ethernet interface relative to the parent,\" \"2nd ethernet interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthernetInterface ethernetInterface = (EthernetInterface) o;
    return Objects.equals(this.interfaceName, ethernetInterface.interfaceName) &&
        Objects.equals(this.channel, ethernetInterface.channel) &&
        Objects.equals(this.speed, ethernetInterface.speed) &&
        Objects.equals(this.ip, ethernetInterface.ip) &&
        Objects.equals(this.alias, ethernetInterface.alias) &&
        Objects.equals(this.macAddr, ethernetInterface.macAddr) &&
        Objects.equals(this.gatewayIp, ethernetInterface.gatewayIp) &&
        Objects.equals(this.subnetMask, ethernetInterface.subnetMask) &&
        Objects.equals(this.bootpUsed, ethernetInterface.bootpUsed) &&
        Objects.equals(this.rloginEnabled, ethernetInterface.rloginEnabled) &&
        Objects.equals(this.reserved1, ethernetInterface.reserved1) &&
        Objects.equals(this.setupError, ethernetInterface.setupError) &&
        Objects.equals(this.reserved2, ethernetInterface.reserved2) &&
        Objects.equals(this.interfaceRef, ethernetInterface.interfaceRef) &&
        Objects.equals(this.linkStatus, ethernetInterface.linkStatus) &&
        Objects.equals(this.ipv4Enabled, ethernetInterface.ipv4Enabled) &&
        Objects.equals(this.ipv4Address, ethernetInterface.ipv4Address) &&
        Objects.equals(this.ipv4SubnetMask, ethernetInterface.ipv4SubnetMask) &&
        Objects.equals(this.ipv4AddressConfigMethod, ethernetInterface.ipv4AddressConfigMethod) &&
        Objects.equals(this.ipv6Enabled, ethernetInterface.ipv6Enabled) &&
        Objects.equals(this.ipv6LocalAddress, ethernetInterface.ipv6LocalAddress) &&
        Objects.equals(this.ipv6PortStaticRoutableAddress, ethernetInterface.ipv6PortStaticRoutableAddress) &&
        Objects.equals(this.ipv6PortRoutableAddresses, ethernetInterface.ipv6PortRoutableAddresses) &&
        Objects.equals(this.ipv6AddressConfigMethod, ethernetInterface.ipv6AddressConfigMethod) &&
        Objects.equals(this.fullDuplex, ethernetInterface.fullDuplex) &&
        Objects.equals(this.supportedSpeedSettings, ethernetInterface.supportedSpeedSettings) &&
        Objects.equals(this.configuredSpeedSetting, ethernetInterface.configuredSpeedSetting) &&
        Objects.equals(this.currentSpeed, ethernetInterface.currentSpeed) &&
        Objects.equals(this.physicalLocation, ethernetInterface.physicalLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceName, channel, speed, ip, alias, macAddr, gatewayIp, subnetMask, bootpUsed, rloginEnabled, reserved1, setupError, reserved2, interfaceRef, linkStatus, ipv4Enabled, ipv4Address, ipv4SubnetMask, ipv4AddressConfigMethod, ipv6Enabled, ipv6LocalAddress, ipv6PortStaticRoutableAddress, ipv6PortRoutableAddresses, ipv6AddressConfigMethod, fullDuplex, supportedSpeedSettings, configuredSpeedSetting, currentSpeed, physicalLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthernetInterface {\n");
    
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    bootpUsed: ").append(toIndentedString(bootpUsed)).append("\n");
    sb.append("    rloginEnabled: ").append(toIndentedString(rloginEnabled)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    setupError: ").append(toIndentedString(setupError)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
    sb.append("    ipv4Enabled: ").append(toIndentedString(ipv4Enabled)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv4SubnetMask: ").append(toIndentedString(ipv4SubnetMask)).append("\n");
    sb.append("    ipv4AddressConfigMethod: ").append(toIndentedString(ipv4AddressConfigMethod)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    ipv6LocalAddress: ").append(toIndentedString(ipv6LocalAddress)).append("\n");
    sb.append("    ipv6PortStaticRoutableAddress: ").append(toIndentedString(ipv6PortStaticRoutableAddress)).append("\n");
    sb.append("    ipv6PortRoutableAddresses: ").append(toIndentedString(ipv6PortRoutableAddresses)).append("\n");
    sb.append("    ipv6AddressConfigMethod: ").append(toIndentedString(ipv6AddressConfigMethod)).append("\n");
    sb.append("    fullDuplex: ").append(toIndentedString(fullDuplex)).append("\n");
    sb.append("    supportedSpeedSettings: ").append(toIndentedString(supportedSpeedSettings)).append("\n");
    sb.append("    configuredSpeedSetting: ").append(toIndentedString(configuredSpeedSetting)).append("\n");
    sb.append("    currentSpeed: ").append(toIndentedString(currentSpeed)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
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

