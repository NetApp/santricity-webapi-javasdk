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
 * SocLocation
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SocLocation   {
  

  /**
   * The channel type.
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

    private Integer channel;

    private Integer soc;

    private Integer port;

    private Integer controllerSlot;

  
  /**
   * The channel type.
   **/
  public SocLocation channelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel type.")
  @JsonProperty("channelType")
  public ChannelTypeEnum getChannelType() {
    return channelType;
  }
  
  public void setChannelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
  }

  
  /**
   * The channel type.
   **/
  public SocLocation channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel type.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The SOC index, 0-based.
   **/
  public SocLocation soc(Integer soc) {
    this.soc = soc;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SOC index, 0-based.")
  @JsonProperty("soc")
  public Integer getSoc() {
    return soc;
  }
  
  public void setSoc(Integer soc) {
    this.soc = soc;
  }

  
  /**
   * The port number, 1-based
   **/
  public SocLocation port(Integer port) {
    this.port = port;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The port number, 1-based")
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }
  
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * The controller slot number, 1 or 2
   **/
  public SocLocation controllerSlot(Integer controllerSlot) {
    this.controllerSlot = controllerSlot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller slot number, 1 or 2")
  @JsonProperty("controllerSlot")
  public Integer getControllerSlot() {
    return controllerSlot;
  }
  
  public void setControllerSlot(Integer controllerSlot) {
    this.controllerSlot = controllerSlot;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocLocation socLocation = (SocLocation) o;
    return Objects.equals(this.channelType, socLocation.channelType) &&
        Objects.equals(this.channel, socLocation.channel) &&
        Objects.equals(this.soc, socLocation.soc) &&
        Objects.equals(this.port, socLocation.port) &&
        Objects.equals(this.controllerSlot, socLocation.controllerSlot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, channel, soc, port, controllerSlot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocLocation {\n");
    
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    controllerSlot: ").append(toIndentedString(controllerSlot)).append("\n");
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

