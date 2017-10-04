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
 * RLSData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class RLSData   {
  
    private RLSDevice device;

    private Integer channel;

    private Integer loopMapIndex;

    private RLSCount rlsCount;

    private Long baselineTime;

    private Boolean valid;

  
  /**
   * The SYMbol reference value that uniquely identifies this device.
   **/
  public RLSData device(RLSDevice device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SYMbol reference value that uniquely identifies this device.")
  @JsonProperty("device")
  public RLSDevice getDevice() {
    return device;
  }
  
  public void setDevice(RLSDevice device) {
    this.device = device;
  }

  
  /**
   * The channel the device is on.
   **/
  public RLSData channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel the device is on.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The position in the fibre loop map the device is located at.
   **/
  public RLSData loopMapIndex(Integer loopMapIndex) {
    this.loopMapIndex = loopMapIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The position in the fibre loop map the device is located at.")
  @JsonProperty("loopMapIndex")
  public Integer getLoopMapIndex() {
    return loopMapIndex;
  }
  
  public void setLoopMapIndex(Integer loopMapIndex) {
    this.loopMapIndex = loopMapIndex;
  }

  
  /**
   * The RLS count for this device.
   **/
  public RLSData rlsCount(RLSCount rlsCount) {
    this.rlsCount = rlsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The RLS count for this device.")
  @JsonProperty("rlsCount")
  public RLSCount getRlsCount() {
    return rlsCount;
  }
  
  public void setRlsCount(RLSCount rlsCount) {
    this.rlsCount = rlsCount;
  }

  
  /**
   * The baseline time for this device, expressed as seconds since midnight GMT on January 1, 1970.
   **/
  public RLSData baselineTime(Long baselineTime) {
    this.baselineTime = baselineTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The baseline time for this device, expressed as seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("baselineTime")
  public Long getBaselineTime() {
    return baselineTime;
  }
  
  public void setBaselineTime(Long baselineTime) {
    this.baselineTime = baselineTime;
  }

  
  /**
   * Set to true if the RSL Data is valid for the device.
   **/
  public RLSData valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if the RSL Data is valid for the device.")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RLSData rLSData = (RLSData) o;
    return Objects.equals(this.device, rLSData.device) &&
        Objects.equals(this.channel, rLSData.channel) &&
        Objects.equals(this.loopMapIndex, rLSData.loopMapIndex) &&
        Objects.equals(this.rlsCount, rLSData.rlsCount) &&
        Objects.equals(this.baselineTime, rLSData.baselineTime) &&
        Objects.equals(this.valid, rLSData.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, channel, loopMapIndex, rlsCount, baselineTime, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RLSData {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    loopMapIndex: ").append(toIndentedString(loopMapIndex)).append("\n");
    sb.append("    rlsCount: ").append(toIndentedString(rlsCount)).append("\n");
    sb.append("    baselineTime: ").append(toIndentedString(baselineTime)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

