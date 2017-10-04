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
 * MinihubLocation
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class MinihubLocation   {
  

  /**
   * Information returned is based on the minihub type.
   */
  public enum MinihubTypeEnum {
    hostside("hostside"),
    driveside("driveside"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MinihubTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MinihubTypeEnum minihubType;

    private Integer channel;

    private Integer controllerSlot;

    private Integer tray;

  
  /**
   * Information returned is based on the minihub type.
   **/
  public MinihubLocation minihubType(MinihubTypeEnum minihubType) {
    this.minihubType = minihubType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information returned is based on the minihub type.")
  @JsonProperty("minihubType")
  public MinihubTypeEnum getMinihubType() {
    return minihubType;
  }
  
  public void setMinihubType(MinihubTypeEnum minihubType) {
    this.minihubType = minihubType;
  }

  
  /**
   * The channel number that this minihub is associated with.
   **/
  public MinihubLocation channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel number that this minihub is associated with.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * Controller number 1 if in top slot. Controller number 2 if in bottom slot.
   **/
  public MinihubLocation controllerSlot(Integer controllerSlot) {
    this.controllerSlot = controllerSlot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Controller number 1 if in top slot. Controller number 2 if in bottom slot.")
  @JsonProperty("controllerSlot")
  public Integer getControllerSlot() {
    return controllerSlot;
  }
  
  public void setControllerSlot(Integer controllerSlot) {
    this.controllerSlot = controllerSlot;
  }

  
  /**
   * Tray ID number. This field is not used and is considered deprecated.
   **/
  public MinihubLocation tray(Integer tray) {
    this.tray = tray;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Tray ID number. This field is not used and is considered deprecated.")
  @JsonProperty("tray")
  public Integer getTray() {
    return tray;
  }
  
  public void setTray(Integer tray) {
    this.tray = tray;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinihubLocation minihubLocation = (MinihubLocation) o;
    return Objects.equals(this.minihubType, minihubLocation.minihubType) &&
        Objects.equals(this.channel, minihubLocation.channel) &&
        Objects.equals(this.controllerSlot, minihubLocation.controllerSlot) &&
        Objects.equals(this.tray, minihubLocation.tray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minihubType, channel, controllerSlot, tray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinihubLocation {\n");
    
    sb.append("    minihubType: ").append(toIndentedString(minihubType)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    controllerSlot: ").append(toIndentedString(controllerSlot)).append("\n");
    sb.append("    tray: ").append(toIndentedString(tray)).append("\n");
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

