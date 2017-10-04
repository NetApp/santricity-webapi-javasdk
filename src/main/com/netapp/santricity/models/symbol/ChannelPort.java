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
 * ChannelPort
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ChannelPort   {
  
    private String portRef;

    private ChannelPortParent portParent;

    private Integer portNumber;

    private Integer channel;


  /**
   * The type of the associated channel - either host-side or drive-side.
   */
  public enum ChannelTypeEnum {
    hostside("hostside"),
    driveside("driveside"),
    management("management"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ChannelTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ChannelTypeEnum channelType;

    private Location physicalLocation;

    private Boolean isTrunkActive;

    private String id;

  
  /**
   * A reference to this channel port.
   **/
  public ChannelPort portRef(String portRef) {
    this.portRef = portRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to this channel port.")
  @JsonProperty("portRef")
  public String getPortRef() {
    return portRef;
  }
  
  public void setPortRef(String portRef) {
    this.portRef = portRef;
  }

  
  /**
   * The parent of the channel port object (minihub, controller, or ESM).
   **/
  public ChannelPort portParent(ChannelPortParent portParent) {
    this.portParent = portParent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The parent of the channel port object (minihub, controller, or ESM).")
  @JsonProperty("portParent")
  public ChannelPortParent getPortParent() {
    return portParent;
  }
  
  public void setPortParent(ChannelPortParent portParent) {
    this.portParent = portParent;
  }

  
  /**
   * The identifying number assigned to this channel port. The range for port numbers is 1..n. If the port number cannot be determined, this field is set to zero.
   **/
  public ChannelPort portNumber(Integer portNumber) {
    this.portNumber = portNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifying number assigned to this channel port. The range for port numbers is 1..n. If the port number cannot be determined, this field is set to zero.")
  @JsonProperty("portNumber")
  public Integer getPortNumber() {
    return portNumber;
  }
  
  public void setPortNumber(Integer portNumber) {
    this.portNumber = portNumber;
  }

  
  /**
   * The number of the associated channel.
   **/
  public ChannelPort channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the associated channel.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The type of the associated channel - either host-side or drive-side.
   **/
  public ChannelPort channelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the associated channel - either host-side or drive-side.")
  @JsonProperty("channelType")
  public ChannelTypeEnum getChannelType() {
    return channelType;
  }
  
  public void setChannelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
  }

  
  /**
   * The physical location of the channel port. The parent reference in Location identifies the physical CRU where the port is located, and the position field is the parent-relative/like-port relative number of the port, starting at 1.
   **/
  public ChannelPort physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the channel port. The parent reference in Location identifies the physical CRU where the port is located, and the position field is the parent-relative/like-port relative number of the port, starting at 1.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * This field is true if a trunk connection has been established and is being maintained on this controller or ESM channel port. This field is always false if the channel port is on a controller or ESM that does not have a Fibre Channel I/O interface type, or if the channel port is associated with a host-side channel.
   **/
  public ChannelPort isTrunkActive(Boolean isTrunkActive) {
    this.isTrunkActive = isTrunkActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is true if a trunk connection has been established and is being maintained on this controller or ESM channel port. This field is always false if the channel port is on a controller or ESM that does not have a Fibre Channel I/O interface type, or if the channel port is associated with a host-side channel.")
  @JsonProperty("isTrunkActive")
  public Boolean getIsTrunkActive() {
    return isTrunkActive;
  }
  
  public void setIsTrunkActive(Boolean isTrunkActive) {
    this.isTrunkActive = isTrunkActive;
  }

  
  /**
   **/
  public ChannelPort id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelPort channelPort = (ChannelPort) o;
    return Objects.equals(this.portRef, channelPort.portRef) &&
        Objects.equals(this.portParent, channelPort.portParent) &&
        Objects.equals(this.portNumber, channelPort.portNumber) &&
        Objects.equals(this.channel, channelPort.channel) &&
        Objects.equals(this.channelType, channelPort.channelType) &&
        Objects.equals(this.physicalLocation, channelPort.physicalLocation) &&
        Objects.equals(this.isTrunkActive, channelPort.isTrunkActive) &&
        Objects.equals(this.id, channelPort.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portRef, portParent, portNumber, channel, channelType, physicalLocation, isTrunkActive, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelPort {\n");
    
    sb.append("    portRef: ").append(toIndentedString(portRef)).append("\n");
    sb.append("    portParent: ").append(toIndentedString(portParent)).append("\n");
    sb.append("    portNumber: ").append(toIndentedString(portNumber)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    isTrunkActive: ").append(toIndentedString(isTrunkActive)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

