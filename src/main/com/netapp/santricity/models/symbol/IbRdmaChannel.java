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
 * IbRdmaChannel
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IbRdmaChannel   {
  
    private IbRdmaChannelEndpoints endpoints;

    private Integer maximumRdmaMessageSize;

    private Integer pathMaximumTransmissionUnit;

    private Integer maximumQueueDepth;


  /**
   * The current state of this RDMA channel.
   */
  public enum ChannelStateEnum {
    uninitialized("uninitialized"),
    connecting("connecting"),
    connected("connected"),
    disconnecting("disconnecting"),
    disconnected("disconnected"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ChannelStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ChannelStateEnum channelState;

  
  /**
   * This field identifies the RDMA channel by identifying its initiator and target endpoints.
   **/
  public IbRdmaChannel endpoints(IbRdmaChannelEndpoints endpoints) {
    this.endpoints = endpoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field identifies the RDMA channel by identifying its initiator and target endpoints.")
  @JsonProperty("endpoints")
  public IbRdmaChannelEndpoints getEndpoints() {
    return endpoints;
  }
  
  public void setEndpoints(IbRdmaChannelEndpoints endpoints) {
    this.endpoints = endpoints;
  }

  
  /**
   * The maximum supported RDMA message size or this RDMA channel.
   **/
  public IbRdmaChannel maximumRdmaMessageSize(Integer maximumRdmaMessageSize) {
    this.maximumRdmaMessageSize = maximumRdmaMessageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum supported RDMA message size or this RDMA channel.")
  @JsonProperty("maximumRdmaMessageSize")
  public Integer getMaximumRdmaMessageSize() {
    return maximumRdmaMessageSize;
  }
  
  public void setMaximumRdmaMessageSize(Integer maximumRdmaMessageSize) {
    this.maximumRdmaMessageSize = maximumRdmaMessageSize;
  }

  
  /**
   * The maximum supported transmission unit for the path associated with the RDMA channel.
   **/
  public IbRdmaChannel pathMaximumTransmissionUnit(Integer pathMaximumTransmissionUnit) {
    this.pathMaximumTransmissionUnit = pathMaximumTransmissionUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum supported transmission unit for the path associated with the RDMA channel.")
  @JsonProperty("pathMaximumTransmissionUnit")
  public Integer getPathMaximumTransmissionUnit() {
    return pathMaximumTransmissionUnit;
  }
  
  public void setPathMaximumTransmissionUnit(Integer pathMaximumTransmissionUnit) {
    this.pathMaximumTransmissionUnit = pathMaximumTransmissionUnit;
  }

  
  /**
   * The maximum supported queue depth for this RDMA channel.
   **/
  public IbRdmaChannel maximumQueueDepth(Integer maximumQueueDepth) {
    this.maximumQueueDepth = maximumQueueDepth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum supported queue depth for this RDMA channel.")
  @JsonProperty("maximumQueueDepth")
  public Integer getMaximumQueueDepth() {
    return maximumQueueDepth;
  }
  
  public void setMaximumQueueDepth(Integer maximumQueueDepth) {
    this.maximumQueueDepth = maximumQueueDepth;
  }

  
  /**
   * The current state of this RDMA channel.
   **/
  public IbRdmaChannel channelState(ChannelStateEnum channelState) {
    this.channelState = channelState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current state of this RDMA channel.")
  @JsonProperty("channelState")
  public ChannelStateEnum getChannelState() {
    return channelState;
  }
  
  public void setChannelState(ChannelStateEnum channelState) {
    this.channelState = channelState;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbRdmaChannel ibRdmaChannel = (IbRdmaChannel) o;
    return Objects.equals(this.endpoints, ibRdmaChannel.endpoints) &&
        Objects.equals(this.maximumRdmaMessageSize, ibRdmaChannel.maximumRdmaMessageSize) &&
        Objects.equals(this.pathMaximumTransmissionUnit, ibRdmaChannel.pathMaximumTransmissionUnit) &&
        Objects.equals(this.maximumQueueDepth, ibRdmaChannel.maximumQueueDepth) &&
        Objects.equals(this.channelState, ibRdmaChannel.channelState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, maximumRdmaMessageSize, pathMaximumTransmissionUnit, maximumQueueDepth, channelState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbRdmaChannel {\n");
    
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    maximumRdmaMessageSize: ").append(toIndentedString(maximumRdmaMessageSize)).append("\n");
    sb.append("    pathMaximumTransmissionUnit: ").append(toIndentedString(pathMaximumTransmissionUnit)).append("\n");
    sb.append("    maximumQueueDepth: ").append(toIndentedString(maximumQueueDepth)).append("\n");
    sb.append("    channelState: ").append(toIndentedString(channelState)).append("\n");
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

