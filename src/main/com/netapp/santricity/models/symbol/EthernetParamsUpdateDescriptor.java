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
 * EthernetParamsUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class EthernetParamsUpdateDescriptor   {
  
    private String controllerRef;

    private String interfaceName;

    private Integer channel;

    private Integer ip;

    private Integer gatewayIp;

    private Integer subnetMask;

  
  /**
   * The intended target of this command.
   **/
  public EthernetParamsUpdateDescriptor controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The intended target of this command.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * Name of Ethernet port, as reported by bootWare.
   **/
  public EthernetParamsUpdateDescriptor interfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of Ethernet port, as reported by bootWare.")
  @JsonProperty("interfaceName")
  public String getInterfaceName() {
    return interfaceName;
  }
  
  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }

  
  /**
   * The channel number of this interface.
   **/
  public EthernetParamsUpdateDescriptor channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel number of this interface.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * IP address of the controller. 0 - use bootp.
   **/
  public EthernetParamsUpdateDescriptor ip(Integer ip) {
    this.ip = ip;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IP address of the controller. 0 - use bootp.")
  @JsonProperty("ip")
  public Integer getIp() {
    return ip;
  }
  
  public void setIp(Integer ip) {
    this.ip = ip;
  }

  
  /**
   * IP address of the gateway.
   **/
  public EthernetParamsUpdateDescriptor gatewayIp(Integer gatewayIp) {
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
  public EthernetParamsUpdateDescriptor subnetMask(Integer subnetMask) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthernetParamsUpdateDescriptor ethernetParamsUpdateDescriptor = (EthernetParamsUpdateDescriptor) o;
    return Objects.equals(this.controllerRef, ethernetParamsUpdateDescriptor.controllerRef) &&
        Objects.equals(this.interfaceName, ethernetParamsUpdateDescriptor.interfaceName) &&
        Objects.equals(this.channel, ethernetParamsUpdateDescriptor.channel) &&
        Objects.equals(this.ip, ethernetParamsUpdateDescriptor.ip) &&
        Objects.equals(this.gatewayIp, ethernetParamsUpdateDescriptor.gatewayIp) &&
        Objects.equals(this.subnetMask, ethernetParamsUpdateDescriptor.subnetMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, interfaceName, channel, ip, gatewayIp, subnetMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthernetParamsUpdateDescriptor {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
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

