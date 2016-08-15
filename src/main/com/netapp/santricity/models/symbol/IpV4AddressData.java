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
 * IpV4AddressData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IpV4AddressData   {
  

  /**
   * Configuration state for the various address elements; always IP_CONFIG_STATE_CONFIGURED for iSER interfaces.
   */
  public enum ConfigStateEnum {
    unconfigured("unconfigured"),
    acquiring("acquiring"),
    configured("configured"),
    invalid("invalid"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ConfigStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ConfigStateEnum configState;

    private String ipv4Address;

    private String ipv4SubnetMask;

    private String ipv4GatewayAddress;

  
  /**
   * Configuration state for the various address elements; always IP_CONFIG_STATE_CONFIGURED for iSER interfaces.
   **/
  public IpV4AddressData configState(ConfigStateEnum configState) {
    this.configState = configState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configuration state for the various address elements; always IP_CONFIG_STATE_CONFIGURED for iSER interfaces.")
  @JsonProperty("configState")
  public ConfigStateEnum getConfigState() {
    return configState;
  }
  
  public void setConfigState(ConfigStateEnum configState) {
    this.configState = configState;
  }

  
  /**
   * The IPV4 address associated with the endpoint.
   **/
  public IpV4AddressData ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV4 address associated with the endpoint.")
  @JsonProperty("ipv4Address")
  public String getIpv4Address() {
    return ipv4Address;
  }
  
  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  
  /**
   * IPV4 subnet mask associated w/ the endpoint; used for iSER interfaces.
   **/
  public IpV4AddressData ipv4SubnetMask(String ipv4SubnetMask) {
    this.ipv4SubnetMask = ipv4SubnetMask;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IPV4 subnet mask associated w/ the endpoint; used for iSER interfaces.")
  @JsonProperty("ipv4SubnetMask")
  public String getIpv4SubnetMask() {
    return ipv4SubnetMask;
  }
  
  public void setIpv4SubnetMask(String ipv4SubnetMask) {
    this.ipv4SubnetMask = ipv4SubnetMask;
  }

  
  /**
   * IPV4 gateway address associated w/ the endpoint; used for iSER interfaces.
   **/
  public IpV4AddressData ipv4GatewayAddress(String ipv4GatewayAddress) {
    this.ipv4GatewayAddress = ipv4GatewayAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IPV4 gateway address associated w/ the endpoint; used for iSER interfaces.")
  @JsonProperty("ipv4GatewayAddress")
  public String getIpv4GatewayAddress() {
    return ipv4GatewayAddress;
  }
  
  public void setIpv4GatewayAddress(String ipv4GatewayAddress) {
    this.ipv4GatewayAddress = ipv4GatewayAddress;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpV4AddressData ipV4AddressData = (IpV4AddressData) o;
    return Objects.equals(this.configState, ipV4AddressData.configState) &&
        Objects.equals(this.ipv4Address, ipV4AddressData.ipv4Address) &&
        Objects.equals(this.ipv4SubnetMask, ipV4AddressData.ipv4SubnetMask) &&
        Objects.equals(this.ipv4GatewayAddress, ipV4AddressData.ipv4GatewayAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configState, ipv4Address, ipv4SubnetMask, ipv4GatewayAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpV4AddressData {\n");
    
    sb.append("    configState: ").append(toIndentedString(configState)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv4SubnetMask: ").append(toIndentedString(ipv4SubnetMask)).append("\n");
    sb.append("    ipv4GatewayAddress: ").append(toIndentedString(ipv4GatewayAddress)).append("\n");
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

