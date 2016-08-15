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
 * AsyncMirrorGroupLinkBandwidthTestResults
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AsyncMirrorGroupLinkBandwidthTestResults   {
  
    private AsyncMirrorGroupLinkLatencyTestResults latencyMeasures;

    private Long minBandwidthBitsPerSecond;

    private Long maxBandwidthBitsPerSecond;

    private Long avgBandwidthBitsPerSecond;

    private Long negotiatedLinkSpeedBitsPerSecond;

  
  /**
   * The bandwidth test also returns latency values since latency numbers are measured in order to factor them out of the bandwidth calculations.
   **/
  public AsyncMirrorGroupLinkBandwidthTestResults latencyMeasures(AsyncMirrorGroupLinkLatencyTestResults latencyMeasures) {
    this.latencyMeasures = latencyMeasures;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The bandwidth test also returns latency values since latency numbers are measured in order to factor them out of the bandwidth calculations.")
  @JsonProperty("latencyMeasures")
  public AsyncMirrorGroupLinkLatencyTestResults getLatencyMeasures() {
    return latencyMeasures;
  }
  
  public void setLatencyMeasures(AsyncMirrorGroupLinkLatencyTestResults latencyMeasures) {
    this.latencyMeasures = latencyMeasures;
  }

  
  /**
   * The minimum bandwidth measured in bits per second.
   **/
  public AsyncMirrorGroupLinkBandwidthTestResults minBandwidthBitsPerSecond(Long minBandwidthBitsPerSecond) {
    this.minBandwidthBitsPerSecond = minBandwidthBitsPerSecond;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum bandwidth measured in bits per second.")
  @JsonProperty("minBandwidthBitsPerSecond")
  public Long getMinBandwidthBitsPerSecond() {
    return minBandwidthBitsPerSecond;
  }
  
  public void setMinBandwidthBitsPerSecond(Long minBandwidthBitsPerSecond) {
    this.minBandwidthBitsPerSecond = minBandwidthBitsPerSecond;
  }

  
  /**
   * The maximum bandwidth measured in bits per second.
   **/
  public AsyncMirrorGroupLinkBandwidthTestResults maxBandwidthBitsPerSecond(Long maxBandwidthBitsPerSecond) {
    this.maxBandwidthBitsPerSecond = maxBandwidthBitsPerSecond;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum bandwidth measured in bits per second.")
  @JsonProperty("maxBandwidthBitsPerSecond")
  public Long getMaxBandwidthBitsPerSecond() {
    return maxBandwidthBitsPerSecond;
  }
  
  public void setMaxBandwidthBitsPerSecond(Long maxBandwidthBitsPerSecond) {
    this.maxBandwidthBitsPerSecond = maxBandwidthBitsPerSecond;
  }

  
  /**
   * The average bandwidth measured in bits per second.
   **/
  public AsyncMirrorGroupLinkBandwidthTestResults avgBandwidthBitsPerSecond(Long avgBandwidthBitsPerSecond) {
    this.avgBandwidthBitsPerSecond = avgBandwidthBitsPerSecond;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The average bandwidth measured in bits per second.")
  @JsonProperty("avgBandwidthBitsPerSecond")
  public Long getAvgBandwidthBitsPerSecond() {
    return avgBandwidthBitsPerSecond;
  }
  
  public void setAvgBandwidthBitsPerSecond(Long avgBandwidthBitsPerSecond) {
    this.avgBandwidthBitsPerSecond = avgBandwidthBitsPerSecond;
  }

  
  /**
   * The negotiated link speed measured in bits per second.
   **/
  public AsyncMirrorGroupLinkBandwidthTestResults negotiatedLinkSpeedBitsPerSecond(Long negotiatedLinkSpeedBitsPerSecond) {
    this.negotiatedLinkSpeedBitsPerSecond = negotiatedLinkSpeedBitsPerSecond;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The negotiated link speed measured in bits per second.")
  @JsonProperty("negotiatedLinkSpeedBitsPerSecond")
  public Long getNegotiatedLinkSpeedBitsPerSecond() {
    return negotiatedLinkSpeedBitsPerSecond;
  }
  
  public void setNegotiatedLinkSpeedBitsPerSecond(Long negotiatedLinkSpeedBitsPerSecond) {
    this.negotiatedLinkSpeedBitsPerSecond = negotiatedLinkSpeedBitsPerSecond;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupLinkBandwidthTestResults asyncMirrorGroupLinkBandwidthTestResults = (AsyncMirrorGroupLinkBandwidthTestResults) o;
    return Objects.equals(this.latencyMeasures, asyncMirrorGroupLinkBandwidthTestResults.latencyMeasures) &&
        Objects.equals(this.minBandwidthBitsPerSecond, asyncMirrorGroupLinkBandwidthTestResults.minBandwidthBitsPerSecond) &&
        Objects.equals(this.maxBandwidthBitsPerSecond, asyncMirrorGroupLinkBandwidthTestResults.maxBandwidthBitsPerSecond) &&
        Objects.equals(this.avgBandwidthBitsPerSecond, asyncMirrorGroupLinkBandwidthTestResults.avgBandwidthBitsPerSecond) &&
        Objects.equals(this.negotiatedLinkSpeedBitsPerSecond, asyncMirrorGroupLinkBandwidthTestResults.negotiatedLinkSpeedBitsPerSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latencyMeasures, minBandwidthBitsPerSecond, maxBandwidthBitsPerSecond, avgBandwidthBitsPerSecond, negotiatedLinkSpeedBitsPerSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupLinkBandwidthTestResults {\n");
    
    sb.append("    latencyMeasures: ").append(toIndentedString(latencyMeasures)).append("\n");
    sb.append("    minBandwidthBitsPerSecond: ").append(toIndentedString(minBandwidthBitsPerSecond)).append("\n");
    sb.append("    maxBandwidthBitsPerSecond: ").append(toIndentedString(maxBandwidthBitsPerSecond)).append("\n");
    sb.append("    avgBandwidthBitsPerSecond: ").append(toIndentedString(avgBandwidthBitsPerSecond)).append("\n");
    sb.append("    negotiatedLinkSpeedBitsPerSecond: ").append(toIndentedString(negotiatedLinkSpeedBitsPerSecond)).append("\n");
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

