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
 * DriveChannel
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DriveChannel   {
  
    private Integer channel;


  /**
   * The operational state of the channel.
   */
  public enum StateEnum {
    optimal("optimal"),
    degraded("degraded"),
    hwFailed("hwFailed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StateEnum state;


  /**
   * The reason the channel was degraded.
   */
  public enum ReasonEnum {
    none("none"),
    thresholdExceeded("thresholdExceeded"),
    adminRequest("adminRequest"),
    socNotOperational("socNotOperational"),
    socEepromFailure("socEepromFailure"),
    clearHwFailure("clearHwFailure"),
    controllerAction("controllerAction"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ReasonEnum reason;

    private String degradingController;

    private DriveChannelStatistics statsControllerA;

    private DriveChannelStatistics statsControllerB;

  
  /**
   * The channel number.
   **/
  public DriveChannel channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel number.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The operational state of the channel.
   **/
  public DriveChannel state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational state of the channel.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The reason the channel was degraded.
   **/
  public DriveChannel reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reason the channel was degraded.")
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }
  
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  
  /**
   * If auto degraded, the degraded controller.
   **/
  public DriveChannel degradingController(String degradingController) {
    this.degradingController = degradingController;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If auto degraded, the degraded controller.")
  @JsonProperty("degradingController")
  public String getDegradingController() {
    return degradingController;
  }
  
  public void setDegradingController(String degradingController) {
    this.degradingController = degradingController;
  }

  
  /**
   * The statistics for Controller A.
   **/
  public DriveChannel statsControllerA(DriveChannelStatistics statsControllerA) {
    this.statsControllerA = statsControllerA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The statistics for Controller A.")
  @JsonProperty("statsControllerA")
  public DriveChannelStatistics getStatsControllerA() {
    return statsControllerA;
  }
  
  public void setStatsControllerA(DriveChannelStatistics statsControllerA) {
    this.statsControllerA = statsControllerA;
  }

  
  /**
   * The statistics for Controller B.
   **/
  public DriveChannel statsControllerB(DriveChannelStatistics statsControllerB) {
    this.statsControllerB = statsControllerB;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The statistics for Controller B.")
  @JsonProperty("statsControllerB")
  public DriveChannelStatistics getStatsControllerB() {
    return statsControllerB;
  }
  
  public void setStatsControllerB(DriveChannelStatistics statsControllerB) {
    this.statsControllerB = statsControllerB;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveChannel driveChannel = (DriveChannel) o;
    return Objects.equals(this.channel, driveChannel.channel) &&
        Objects.equals(this.state, driveChannel.state) &&
        Objects.equals(this.reason, driveChannel.reason) &&
        Objects.equals(this.degradingController, driveChannel.degradingController) &&
        Objects.equals(this.statsControllerA, driveChannel.statsControllerA) &&
        Objects.equals(this.statsControllerB, driveChannel.statsControllerB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, state, reason, degradingController, statsControllerA, statsControllerB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveChannel {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    degradingController: ").append(toIndentedString(degradingController)).append("\n");
    sb.append("    statsControllerA: ").append(toIndentedString(statsControllerA)).append("\n");
    sb.append("    statsControllerB: ").append(toIndentedString(statsControllerB)).append("\n");
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

