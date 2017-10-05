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
 * DriveChannelPort
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DriveChannelPort   {
  
    private String portRef;

    private Integer channel;


  /**
   * The type of port (XBB/expansion/internal).
   */
  public enum PortTypeEnum {
    portUnknown("portUnknown"),
    port1("port1"),
    port2("port2"),
    port3("port3"),
    port4("port4"),
    port12("port12"),
    port34("port34"),
    port7("port7"),
    minihubInout("minihubInout"),
    expansionOnly("expansionOnly"),
    expansionAndInternal("expansionAndInternal"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PortTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PortTypeEnum portType;

    private DriveChannelParent parentType;

  
  /**
   * A reference to the drive channel port.
   **/
  public DriveChannelPort portRef(String portRef) {
    this.portRef = portRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the drive channel port.")
  @JsonProperty("portRef")
  public String getPortRef() {
    return portRef;
  }
  
  public void setPortRef(String portRef) {
    this.portRef = portRef;
  }

  
  /**
   * The Fibre Channel number of the port.
   **/
  public DriveChannelPort channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Fibre Channel number of the port.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The type of port (XBB/expansion/internal).
   **/
  public DriveChannelPort portType(PortTypeEnum portType) {
    this.portType = portType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of port (XBB/expansion/internal).")
  @JsonProperty("portType")
  public PortTypeEnum getPortType() {
    return portType;
  }
  
  public void setPortType(PortTypeEnum portType) {
    this.portType = portType;
  }

  
  /**
   * The parent type (minihub/controller).
   **/
  public DriveChannelPort parentType(DriveChannelParent parentType) {
    this.parentType = parentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The parent type (minihub/controller).")
  @JsonProperty("parentType")
  public DriveChannelParent getParentType() {
    return parentType;
  }
  
  public void setParentType(DriveChannelParent parentType) {
    this.parentType = parentType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveChannelPort driveChannelPort = (DriveChannelPort) o;
    return Objects.equals(this.portRef, driveChannelPort.portRef) &&
        Objects.equals(this.channel, driveChannelPort.channel) &&
        Objects.equals(this.portType, driveChannelPort.portType) &&
        Objects.equals(this.parentType, driveChannelPort.parentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portRef, channel, portType, parentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveChannelPort {\n");
    
    sb.append("    portRef: ").append(toIndentedString(portRef)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
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

