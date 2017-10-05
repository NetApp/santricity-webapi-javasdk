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
 * RLSCommandDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class RLSCommandDescriptor   {
  

  /**
   * This enumeration defines the commands for Read Link Status.
   */
  public enum CommandEnum {
    all("all"),
    channels("channels"),
    devices("devices"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CommandEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CommandEnum command;

    private List<Integer> channels;

    private RLSDevices devices;

  
  /**
   * This enumeration defines the commands for Read Link Status.
   **/
  public RLSCommandDescriptor command(CommandEnum command) {
    this.command = command;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration defines the commands for Read Link Status.")
  @JsonProperty("command")
  public CommandEnum getCommand() {
    return command;
  }
  
  public void setCommand(CommandEnum command) {
    this.command = command;
  }

  
  /**
   * This field is present only if the command value is RLS_GET_CHANNELS. It contains detailed information about the channels.
   **/
  public RLSCommandDescriptor channels(List<Integer> channels) {
    this.channels = channels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the command value is RLS_GET_CHANNELS. It contains detailed information about the channels.")
  @JsonProperty("channels")
  public List<Integer> getChannels() {
    return channels;
  }
  
  public void setChannels(List<Integer> channels) {
    this.channels = channels;
  }

  
  /**
   * This field is present only if the command value is RLS_GET_DEVICES. It contains detailed information about the devices.
   **/
  public RLSCommandDescriptor devices(RLSDevices devices) {
    this.devices = devices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the command value is RLS_GET_DEVICES. It contains detailed information about the devices.")
  @JsonProperty("devices")
  public RLSDevices getDevices() {
    return devices;
  }
  
  public void setDevices(RLSDevices devices) {
    this.devices = devices;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RLSCommandDescriptor rLSCommandDescriptor = (RLSCommandDescriptor) o;
    return Objects.equals(this.command, rLSCommandDescriptor.command) &&
        Objects.equals(this.channels, rLSCommandDescriptor.channels) &&
        Objects.equals(this.devices, rLSCommandDescriptor.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, channels, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RLSCommandDescriptor {\n");
    
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

