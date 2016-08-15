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
 * ChannelDiagnosticDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ChannelDiagnosticDescriptor   {
  
    private String controller;

    private Integer driveChannel;

    private List<ChannelDiagDevice> devices;

    private Integer maxTimeInterval;

    private ChannelDiagTypeParams diagParams;

  
  /**
   * A reference indicating the controller that is to perform the test.
   **/
  public ChannelDiagnosticDescriptor controller(String controller) {
    this.controller = controller;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference indicating the controller that is to perform the test.")
  @JsonProperty("controller")
  public String getController() {
    return controller;
  }
  
  public void setController(String controller) {
    this.controller = controller;
  }

  
  /**
   * The number of the drive channel to test.
   **/
  public ChannelDiagnosticDescriptor driveChannel(Integer driveChannel) {
    this.driveChannel = driveChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the drive channel to test.")
  @JsonProperty("driveChannel")
  public Integer getDriveChannel() {
    return driveChannel;
  }
  
  public void setDriveChannel(Integer driveChannel) {
    this.driveChannel = driveChannel;
  }

  
  /**
   * A variable-length array of values, each value indicating a device on the referenced channel to be included in the test. To specify \"all devices,\" all that is needed is a single instance of ChannelDiagDevice with deviceType set to CHANNEL_DEVICE_ALL.
   **/
  public ChannelDiagnosticDescriptor devices(List<ChannelDiagDevice> devices) {
    this.devices = devices;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of values, each value indicating a device on the referenced channel to be included in the test. To specify \"all devices,\" all that is needed is a single instance of ChannelDiagDevice with deviceType set to CHANNEL_DEVICE_ALL.")
  @JsonProperty("devices")
  public List<ChannelDiagDevice> getDevices() {
    return devices;
  }
  
  public void setDevices(List<ChannelDiagDevice> devices) {
    this.devices = devices;
  }

  
  /**
   * The maximum number of seconds the test is allowed to run before it is forcibly terminated.
   **/
  public ChannelDiagnosticDescriptor maxTimeInterval(Integer maxTimeInterval) {
    this.maxTimeInterval = maxTimeInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of seconds the test is allowed to run before it is forcibly terminated.")
  @JsonProperty("maxTimeInterval")
  public Integer getMaxTimeInterval() {
    return maxTimeInterval;
  }
  
  public void setMaxTimeInterval(Integer maxTimeInterval) {
    this.maxTimeInterval = maxTimeInterval;
  }

  
  /**
   * A sub-structure indicating both the type of diagnostic test to perform and the associated test-type-dependent parameters.
   **/
  public ChannelDiagnosticDescriptor diagParams(ChannelDiagTypeParams diagParams) {
    this.diagParams = diagParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A sub-structure indicating both the type of diagnostic test to perform and the associated test-type-dependent parameters.")
  @JsonProperty("diagParams")
  public ChannelDiagTypeParams getDiagParams() {
    return diagParams;
  }
  
  public void setDiagParams(ChannelDiagTypeParams diagParams) {
    this.diagParams = diagParams;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDiagnosticDescriptor channelDiagnosticDescriptor = (ChannelDiagnosticDescriptor) o;
    return Objects.equals(this.controller, channelDiagnosticDescriptor.controller) &&
        Objects.equals(this.driveChannel, channelDiagnosticDescriptor.driveChannel) &&
        Objects.equals(this.devices, channelDiagnosticDescriptor.devices) &&
        Objects.equals(this.maxTimeInterval, channelDiagnosticDescriptor.maxTimeInterval) &&
        Objects.equals(this.diagParams, channelDiagnosticDescriptor.diagParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controller, driveChannel, devices, maxTimeInterval, diagParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDiagnosticDescriptor {\n");
    
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    driveChannel: ").append(toIndentedString(driveChannel)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    maxTimeInterval: ").append(toIndentedString(maxTimeInterval)).append("\n");
    sb.append("    diagParams: ").append(toIndentedString(diagParams)).append("\n");
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

