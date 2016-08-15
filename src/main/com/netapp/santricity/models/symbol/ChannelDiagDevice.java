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
 * ChannelDiagDevice
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ChannelDiagDevice   {
  

  /**
   * This enumeration type identifies the types of channel devices on which drive channel fault isolation diagnostics can be run.
   */
  public enum DeviceTypeEnum {
    all("all"),
    controller("controller"),
    drive("drive"),
    esm("esm"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DeviceTypeEnum deviceType;

    private String controller;

    private String drive;

    private String esm;

  
  /**
   * This enumeration type identifies the types of channel devices on which drive channel fault isolation diagnostics can be run.
   **/
  public ChannelDiagDevice deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration type identifies the types of channel devices on which drive channel fault isolation diagnostics can be run.")
  @JsonProperty("deviceType")
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }
  
  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  
  /**
   * A reference to an instance of a Controller. This field is only valid if deviceType is equal to CHANNEL_DIAG_DEVICE_CONTROLLER.
   **/
  public ChannelDiagDevice controller(String controller) {
    this.controller = controller;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to an instance of a Controller. This field is only valid if deviceType is equal to CHANNEL_DIAG_DEVICE_CONTROLLER.")
  @JsonProperty("controller")
  public String getController() {
    return controller;
  }
  
  public void setController(String controller) {
    this.controller = controller;
  }

  
  /**
   * A reference to an instance of a Drive. This field is only valid if deviceType is equal to CHANNEL_DIAG_DEVICE_DRIVE.
   **/
  public ChannelDiagDevice drive(String drive) {
    this.drive = drive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to an instance of a Drive. This field is only valid if deviceType is equal to CHANNEL_DIAG_DEVICE_DRIVE.")
  @JsonProperty("drive")
  public String getDrive() {
    return drive;
  }
  
  public void setDrive(String drive) {
    this.drive = drive;
  }

  
  /**
   * A reference to an instance of an Esm. This field is only valid if deviceType is equal to CHANNEL_DIAG_DEVICE_ESM.
   **/
  public ChannelDiagDevice esm(String esm) {
    this.esm = esm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to an instance of an Esm. This field is only valid if deviceType is equal to CHANNEL_DIAG_DEVICE_ESM.")
  @JsonProperty("esm")
  public String getEsm() {
    return esm;
  }
  
  public void setEsm(String esm) {
    this.esm = esm;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDiagDevice channelDiagDevice = (ChannelDiagDevice) o;
    return Objects.equals(this.deviceType, channelDiagDevice.deviceType) &&
        Objects.equals(this.controller, channelDiagDevice.controller) &&
        Objects.equals(this.drive, channelDiagDevice.drive) &&
        Objects.equals(this.esm, channelDiagDevice.esm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType, controller, drive, esm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDiagDevice {\n");
    
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
    sb.append("    esm: ").append(toIndentedString(esm)).append("\n");
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

