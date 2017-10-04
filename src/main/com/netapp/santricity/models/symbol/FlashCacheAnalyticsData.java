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
 * FlashCacheAnalyticsData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class FlashCacheAnalyticsData   {
  
    private Long startTime;

    private Long stopTime;

    private List<FlashCacheAnalyticsItem> analytics;

    private FlashCacheAnalyticsItem realCacheAnalytics;

  
  /**
   * The time analytics started being collected in seconds since January 1, 1970.
   **/
  public FlashCacheAnalyticsData startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time analytics started being collected in seconds since January 1, 1970.")
  @JsonProperty("startTime")
  public Long getStartTime() {
    return startTime;
  }
  
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The time analytics stopped being collected in seconds since January 1, 1970.
   **/
  public FlashCacheAnalyticsData stopTime(Long stopTime) {
    this.stopTime = stopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time analytics stopped being collected in seconds since January 1, 1970.")
  @JsonProperty("stopTime")
  public Long getStopTime() {
    return stopTime;
  }
  
  public void setStopTime(Long stopTime) {
    this.stopTime = stopTime;
  }

  
  /**
   * A list of analytics items containing data for various sizes of flash cache.
   **/
  public FlashCacheAnalyticsData analytics(List<FlashCacheAnalyticsItem> analytics) {
    this.analytics = analytics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of analytics items containing data for various sizes of flash cache.")
  @JsonProperty("analytics")
  public List<FlashCacheAnalyticsItem> getAnalytics() {
    return analytics;
  }
  
  public void setAnalytics(List<FlashCacheAnalyticsItem> analytics) {
    this.analytics = analytics;
  }

  
  /**
   * Real statistics for the current cache size.
   **/
  public FlashCacheAnalyticsData realCacheAnalytics(FlashCacheAnalyticsItem realCacheAnalytics) {
    this.realCacheAnalytics = realCacheAnalytics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Real statistics for the current cache size.")
  @JsonProperty("realCacheAnalytics")
  public FlashCacheAnalyticsItem getRealCacheAnalytics() {
    return realCacheAnalytics;
  }
  
  public void setRealCacheAnalytics(FlashCacheAnalyticsItem realCacheAnalytics) {
    this.realCacheAnalytics = realCacheAnalytics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlashCacheAnalyticsData flashCacheAnalyticsData = (FlashCacheAnalyticsData) o;
    return Objects.equals(this.startTime, flashCacheAnalyticsData.startTime) &&
        Objects.equals(this.stopTime, flashCacheAnalyticsData.stopTime) &&
        Objects.equals(this.analytics, flashCacheAnalyticsData.analytics) &&
        Objects.equals(this.realCacheAnalytics, flashCacheAnalyticsData.realCacheAnalytics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime, analytics, realCacheAnalytics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashCacheAnalyticsData {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    analytics: ").append(toIndentedString(analytics)).append("\n");
    sb.append("    realCacheAnalytics: ").append(toIndentedString(realCacheAnalytics)).append("\n");
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

