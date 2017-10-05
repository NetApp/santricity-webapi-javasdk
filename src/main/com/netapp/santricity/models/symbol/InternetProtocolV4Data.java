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
 * InternetProtocolV4Data
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class InternetProtocolV4Data   {
  
    private String ipv4Address;


  /**
   * IPV4 configuration method for the endpoint; always STATIC for iSER interfaces.
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

    private SettingControl ipv4OutboundPacketPriority;

    private SettingControl ipv4VlanId;

    private IpV4AddressData ipv4AddressData;

  
  /**
   * The various IPV4 address-related elements (IP address, gateway IP address, and subnet mask), along with the state of their configuration.
   **/
  public InternetProtocolV4Data ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The various IPV4 address-related elements (IP address, gateway IP address, and subnet mask), along with the state of their configuration.")
  @JsonProperty("ipv4Address")
  public String getIpv4Address() {
    return ipv4Address;
  }
  
  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  
  /**
   * IPV4 configuration method for the endpoint; always STATIC for iSER interfaces.
   **/
  public InternetProtocolV4Data ipv4AddressConfigMethod(Ipv4AddressConfigMethodEnum ipv4AddressConfigMethod) {
    this.ipv4AddressConfigMethod = ipv4AddressConfigMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IPV4 configuration method for the endpoint; always STATIC for iSER interfaces.")
  @JsonProperty("ipv4AddressConfigMethod")
  public Ipv4AddressConfigMethodEnum getIpv4AddressConfigMethod() {
    return ipv4AddressConfigMethod;
  }
  
  public void setIpv4AddressConfigMethod(Ipv4AddressConfigMethodEnum ipv4AddressConfigMethod) {
    this.ipv4AddressConfigMethod = ipv4AddressConfigMethod;
  }

  
  /**
   * Priority associate with outbound IPV4 packets; always disabled for iSER interfaces.
   **/
  public InternetProtocolV4Data ipv4OutboundPacketPriority(SettingControl ipv4OutboundPacketPriority) {
    this.ipv4OutboundPacketPriority = ipv4OutboundPacketPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Priority associate with outbound IPV4 packets; always disabled for iSER interfaces.")
  @JsonProperty("ipv4OutboundPacketPriority")
  public SettingControl getIpv4OutboundPacketPriority() {
    return ipv4OutboundPacketPriority;
  }
  
  public void setIpv4OutboundPacketPriority(SettingControl ipv4OutboundPacketPriority) {
    this.ipv4OutboundPacketPriority = ipv4OutboundPacketPriority;
  }

  
  /**
   * Value of IPV4 VLAN id for the interface; always disabled for iSER interfaces.
   **/
  public InternetProtocolV4Data ipv4VlanId(SettingControl ipv4VlanId) {
    this.ipv4VlanId = ipv4VlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value of IPV4 VLAN id for the interface; always disabled for iSER interfaces.")
  @JsonProperty("ipv4VlanId")
  public SettingControl getIpv4VlanId() {
    return ipv4VlanId;
  }
  
  public void setIpv4VlanId(SettingControl ipv4VlanId) {
    this.ipv4VlanId = ipv4VlanId;
  }

  
  /**
   * The various IPV4 address-related elements (IP address, gateway IP address, and subnet mask), along with the state of their configuration.
   **/
  public InternetProtocolV4Data ipv4AddressData(IpV4AddressData ipv4AddressData) {
    this.ipv4AddressData = ipv4AddressData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The various IPV4 address-related elements (IP address, gateway IP address, and subnet mask), along with the state of their configuration.")
  @JsonProperty("ipv4AddressData")
  public IpV4AddressData getIpv4AddressData() {
    return ipv4AddressData;
  }
  
  public void setIpv4AddressData(IpV4AddressData ipv4AddressData) {
    this.ipv4AddressData = ipv4AddressData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternetProtocolV4Data internetProtocolV4Data = (InternetProtocolV4Data) o;
    return Objects.equals(this.ipv4Address, internetProtocolV4Data.ipv4Address) &&
        Objects.equals(this.ipv4AddressConfigMethod, internetProtocolV4Data.ipv4AddressConfigMethod) &&
        Objects.equals(this.ipv4OutboundPacketPriority, internetProtocolV4Data.ipv4OutboundPacketPriority) &&
        Objects.equals(this.ipv4VlanId, internetProtocolV4Data.ipv4VlanId) &&
        Objects.equals(this.ipv4AddressData, internetProtocolV4Data.ipv4AddressData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Address, ipv4AddressConfigMethod, ipv4OutboundPacketPriority, ipv4VlanId, ipv4AddressData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternetProtocolV4Data {\n");
    
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv4AddressConfigMethod: ").append(toIndentedString(ipv4AddressConfigMethod)).append("\n");
    sb.append("    ipv4OutboundPacketPriority: ").append(toIndentedString(ipv4OutboundPacketPriority)).append("\n");
    sb.append("    ipv4VlanId: ").append(toIndentedString(ipv4VlanId)).append("\n");
    sb.append("    ipv4AddressData: ").append(toIndentedString(ipv4AddressData)).append("\n");
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

