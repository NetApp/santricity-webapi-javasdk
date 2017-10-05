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
 * ManagementConfigurationRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ManagementConfigurationRequest   {
  
    private String controllerRef;

    private Boolean enableRemoteAccess;

    private String ipv4GatewayAddress;

    private String ipv6GatewayAddress;

    private String ipv6StaticRoutableAddress;

    private String interfaceRef;

    private String interfaceName;

    private Boolean ipv4Enabled;

    private String ipv4Address;

    private String ipv4SubnetMask;


  /**
   * Setting that determines how the 'ipv4' address is configured. Required if ipv4 is enabled.
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

    private String ipv6LocalAddress;


  /**
   * The method by which the 'ipv6' address information is configured for the interface.
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


  /**
   * The configured speed setting for the Ethernet interface.
   */
  public enum SpeedSettingEnum {
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

    SpeedSettingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SpeedSettingEnum speedSetting;

    private DnsAcquisitionDescriptor dnsAcquisitionDescriptor;

    private NtpAcquisitionDescriptor ntpAcquisitionDescriptor;

  
  /**
   **/
  public ManagementConfigurationRequest controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * If set to true, the controller is enabled for establishment of a remote access session. Depending on the controller platform, the method for remote access could be rlogin or telnet
   **/
  public ManagementConfigurationRequest enableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If set to true, the controller is enabled for establishment of a remote access session. Depending on the controller platform, the method for remote access could be rlogin or telnet")
  @JsonProperty("enableRemoteAccess")
  public Boolean getEnableRemoteAccess() {
    return enableRemoteAccess;
  }
  
  public void setEnableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
  }

  
  /**
   * Manually specify the address of the gateway.
   **/
  public ManagementConfigurationRequest ipv4GatewayAddress(String ipv4GatewayAddress) {
    this.ipv4GatewayAddress = ipv4GatewayAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Manually specify the address of the gateway.")
  @JsonProperty("ipv4GatewayAddress")
  public String getIpv4GatewayAddress() {
    return ipv4GatewayAddress;
  }
  
  public void setIpv4GatewayAddress(String ipv4GatewayAddress) {
    this.ipv4GatewayAddress = ipv4GatewayAddress;
  }

  
  /**
   **/
  public ManagementConfigurationRequest ipv6GatewayAddress(String ipv6GatewayAddress) {
    this.ipv6GatewayAddress = ipv6GatewayAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipv6GatewayAddress")
  public String getIpv6GatewayAddress() {
    return ipv6GatewayAddress;
  }
  
  public void setIpv6GatewayAddress(String ipv6GatewayAddress) {
    this.ipv6GatewayAddress = ipv6GatewayAddress;
  }

  
  /**
   **/
  public ManagementConfigurationRequest ipv6StaticRoutableAddress(String ipv6StaticRoutableAddress) {
    this.ipv6StaticRoutableAddress = ipv6StaticRoutableAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipv6StaticRoutableAddress")
  public String getIpv6StaticRoutableAddress() {
    return ipv6StaticRoutableAddress;
  }
  
  public void setIpv6StaticRoutableAddress(String ipv6StaticRoutableAddress) {
    this.ipv6StaticRoutableAddress = ipv6StaticRoutableAddress;
  }

  
  /**
   * Reference to the Ethernet interface to configure
   **/
  public ManagementConfigurationRequest interfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to the Ethernet interface to configure")
  @JsonProperty("interfaceRef")
  public String getInterfaceRef() {
    return interfaceRef;
  }
  
  public void setInterfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
  }

  
  /**
   * Name of Ethernet port
   **/
  public ManagementConfigurationRequest interfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of Ethernet port")
  @JsonProperty("interfaceName")
  public String getInterfaceName() {
    return interfaceName;
  }
  
  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }

  
  /**
   * True if 'ipv4' is to be enabled for this interface; otherwise false.
   **/
  public ManagementConfigurationRequest ipv4Enabled(Boolean ipv4Enabled) {
    this.ipv4Enabled = ipv4Enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if 'ipv4' is to be enabled for this interface; otherwise false.")
  @JsonProperty("ipv4Enabled")
  public Boolean getIpv4Enabled() {
    return ipv4Enabled;
  }
  
  public void setIpv4Enabled(Boolean ipv4Enabled) {
    this.ipv4Enabled = ipv4Enabled;
  }

  
  /**
   * The 'ipv4' address for the interface. Required for static configuration.
   **/
  public ManagementConfigurationRequest ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The 'ipv4' address for the interface. Required for static configuration.")
  @JsonProperty("ipv4Address")
  public String getIpv4Address() {
    return ipv4Address;
  }
  
  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  
  /**
   * The 'ipv4' subnet mask for the interface. Required for static configuration.
   **/
  public ManagementConfigurationRequest ipv4SubnetMask(String ipv4SubnetMask) {
    this.ipv4SubnetMask = ipv4SubnetMask;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The 'ipv4' subnet mask for the interface. Required for static configuration.")
  @JsonProperty("ipv4SubnetMask")
  public String getIpv4SubnetMask() {
    return ipv4SubnetMask;
  }
  
  public void setIpv4SubnetMask(String ipv4SubnetMask) {
    this.ipv4SubnetMask = ipv4SubnetMask;
  }

  
  /**
   * Setting that determines how the 'ipv4' address is configured. Required if ipv4 is enabled.
   **/
  public ManagementConfigurationRequest ipv4AddressConfigMethod(Ipv4AddressConfigMethodEnum ipv4AddressConfigMethod) {
    this.ipv4AddressConfigMethod = ipv4AddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting that determines how the 'ipv4' address is configured. Required if ipv4 is enabled.")
  @JsonProperty("ipv4AddressConfigMethod")
  public Ipv4AddressConfigMethodEnum getIpv4AddressConfigMethod() {
    return ipv4AddressConfigMethod;
  }
  
  public void setIpv4AddressConfigMethod(Ipv4AddressConfigMethodEnum ipv4AddressConfigMethod) {
    this.ipv4AddressConfigMethod = ipv4AddressConfigMethod;
  }

  
  /**
   * True if 'ipv6' is to be enabled for this interface; otherwise false.
   **/
  public ManagementConfigurationRequest ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if 'ipv6' is to be enabled for this interface; otherwise false.")
  @JsonProperty("ipv6Enabled")
  public Boolean getIpv6Enabled() {
    return ipv6Enabled;
  }
  
  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }

  
  /**
   * The 'ipv6' local address for the interface. 
   **/
  public ManagementConfigurationRequest ipv6LocalAddress(String ipv6LocalAddress) {
    this.ipv6LocalAddress = ipv6LocalAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The 'ipv6' local address for the interface. ")
  @JsonProperty("ipv6LocalAddress")
  public String getIpv6LocalAddress() {
    return ipv6LocalAddress;
  }
  
  public void setIpv6LocalAddress(String ipv6LocalAddress) {
    this.ipv6LocalAddress = ipv6LocalAddress;
  }

  
  /**
   * The method by which the 'ipv6' address information is configured for the interface.
   **/
  public ManagementConfigurationRequest ipv6AddressConfigMethod(Ipv6AddressConfigMethodEnum ipv6AddressConfigMethod) {
    this.ipv6AddressConfigMethod = ipv6AddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The method by which the 'ipv6' address information is configured for the interface.")
  @JsonProperty("ipv6AddressConfigMethod")
  public Ipv6AddressConfigMethodEnum getIpv6AddressConfigMethod() {
    return ipv6AddressConfigMethod;
  }
  
  public void setIpv6AddressConfigMethod(Ipv6AddressConfigMethodEnum ipv6AddressConfigMethod) {
    this.ipv6AddressConfigMethod = ipv6AddressConfigMethod;
  }

  
  /**
   * The configured speed setting for the Ethernet interface.
   **/
  public ManagementConfigurationRequest speedSetting(SpeedSettingEnum speedSetting) {
    this.speedSetting = speedSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configured speed setting for the Ethernet interface.")
  @JsonProperty("speedSetting")
  public SpeedSettingEnum getSpeedSetting() {
    return speedSetting;
  }
  
  public void setSpeedSetting(SpeedSettingEnum speedSetting) {
    this.speedSetting = speedSetting;
  }

  
  /**
   * The configuration for the DNS on this management interface
   **/
  public ManagementConfigurationRequest dnsAcquisitionDescriptor(DnsAcquisitionDescriptor dnsAcquisitionDescriptor) {
    this.dnsAcquisitionDescriptor = dnsAcquisitionDescriptor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration for the DNS on this management interface")
  @JsonProperty("dnsAcquisitionDescriptor")
  public DnsAcquisitionDescriptor getDnsAcquisitionDescriptor() {
    return dnsAcquisitionDescriptor;
  }
  
  public void setDnsAcquisitionDescriptor(DnsAcquisitionDescriptor dnsAcquisitionDescriptor) {
    this.dnsAcquisitionDescriptor = dnsAcquisitionDescriptor;
  }

  
  /**
   * The configuration for the NTP on this management interface
   **/
  public ManagementConfigurationRequest ntpAcquisitionDescriptor(NtpAcquisitionDescriptor ntpAcquisitionDescriptor) {
    this.ntpAcquisitionDescriptor = ntpAcquisitionDescriptor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration for the NTP on this management interface")
  @JsonProperty("ntpAcquisitionDescriptor")
  public NtpAcquisitionDescriptor getNtpAcquisitionDescriptor() {
    return ntpAcquisitionDescriptor;
  }
  
  public void setNtpAcquisitionDescriptor(NtpAcquisitionDescriptor ntpAcquisitionDescriptor) {
    this.ntpAcquisitionDescriptor = ntpAcquisitionDescriptor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementConfigurationRequest managementConfigurationRequest = (ManagementConfigurationRequest) o;
    return Objects.equals(this.controllerRef, managementConfigurationRequest.controllerRef) &&
        Objects.equals(this.enableRemoteAccess, managementConfigurationRequest.enableRemoteAccess) &&
        Objects.equals(this.ipv4GatewayAddress, managementConfigurationRequest.ipv4GatewayAddress) &&
        Objects.equals(this.ipv6GatewayAddress, managementConfigurationRequest.ipv6GatewayAddress) &&
        Objects.equals(this.ipv6StaticRoutableAddress, managementConfigurationRequest.ipv6StaticRoutableAddress) &&
        Objects.equals(this.interfaceRef, managementConfigurationRequest.interfaceRef) &&
        Objects.equals(this.interfaceName, managementConfigurationRequest.interfaceName) &&
        Objects.equals(this.ipv4Enabled, managementConfigurationRequest.ipv4Enabled) &&
        Objects.equals(this.ipv4Address, managementConfigurationRequest.ipv4Address) &&
        Objects.equals(this.ipv4SubnetMask, managementConfigurationRequest.ipv4SubnetMask) &&
        Objects.equals(this.ipv4AddressConfigMethod, managementConfigurationRequest.ipv4AddressConfigMethod) &&
        Objects.equals(this.ipv6Enabled, managementConfigurationRequest.ipv6Enabled) &&
        Objects.equals(this.ipv6LocalAddress, managementConfigurationRequest.ipv6LocalAddress) &&
        Objects.equals(this.ipv6AddressConfigMethod, managementConfigurationRequest.ipv6AddressConfigMethod) &&
        Objects.equals(this.speedSetting, managementConfigurationRequest.speedSetting) &&
        Objects.equals(this.dnsAcquisitionDescriptor, managementConfigurationRequest.dnsAcquisitionDescriptor) &&
        Objects.equals(this.ntpAcquisitionDescriptor, managementConfigurationRequest.ntpAcquisitionDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, enableRemoteAccess, ipv4GatewayAddress, ipv6GatewayAddress, ipv6StaticRoutableAddress, interfaceRef, interfaceName, ipv4Enabled, ipv4Address, ipv4SubnetMask, ipv4AddressConfigMethod, ipv6Enabled, ipv6LocalAddress, ipv6AddressConfigMethod, speedSetting, dnsAcquisitionDescriptor, ntpAcquisitionDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementConfigurationRequest {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    enableRemoteAccess: ").append(toIndentedString(enableRemoteAccess)).append("\n");
    sb.append("    ipv4GatewayAddress: ").append(toIndentedString(ipv4GatewayAddress)).append("\n");
    sb.append("    ipv6GatewayAddress: ").append(toIndentedString(ipv6GatewayAddress)).append("\n");
    sb.append("    ipv6StaticRoutableAddress: ").append(toIndentedString(ipv6StaticRoutableAddress)).append("\n");
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    ipv4Enabled: ").append(toIndentedString(ipv4Enabled)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv4SubnetMask: ").append(toIndentedString(ipv4SubnetMask)).append("\n");
    sb.append("    ipv4AddressConfigMethod: ").append(toIndentedString(ipv4AddressConfigMethod)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    ipv6LocalAddress: ").append(toIndentedString(ipv6LocalAddress)).append("\n");
    sb.append("    ipv6AddressConfigMethod: ").append(toIndentedString(ipv6AddressConfigMethod)).append("\n");
    sb.append("    speedSetting: ").append(toIndentedString(speedSetting)).append("\n");
    sb.append("    dnsAcquisitionDescriptor: ").append(toIndentedString(dnsAcquisitionDescriptor)).append("\n");
    sb.append("    ntpAcquisitionDescriptor: ").append(toIndentedString(ntpAcquisitionDescriptor)).append("\n");
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

