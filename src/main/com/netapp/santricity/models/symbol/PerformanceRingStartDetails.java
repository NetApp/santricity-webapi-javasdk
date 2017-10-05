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
 * PerformanceRingStartDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PerformanceRingStartDetails   {
  

  /**
   * This field is the output format for the ring buffer data retrieval.
   */
  public enum PerfRingTypeEnum {
    summary("summary"),
    channel("channel"),
    latency("latency"),
    drive("drive"),
    all("all"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PerfRingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PerfRingTypeEnum perfRingType;

    private Integer numberOfSeconds;

    private Integer numberOfMinutes;

    private Boolean onlyUnreadData;

  
  /**
   * This field is the output format for the ring buffer data retrieval.
   **/
  public PerformanceRingStartDetails perfRingType(PerfRingTypeEnum perfRingType) {
    this.perfRingType = perfRingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is the output format for the ring buffer data retrieval.")
  @JsonProperty("perfRingType")
  public PerfRingTypeEnum getPerfRingType() {
    return perfRingType;
  }
  
  public void setPerfRingType(PerfRingTypeEnum perfRingType) {
    this.perfRingType = perfRingType;
  }

  
  /**
   * The total number of seconds to retrieve, up to 2048, 0 indicates all available, -1 indicates to skip any returning data.
   **/
  public PerformanceRingStartDetails numberOfSeconds(Integer numberOfSeconds) {
    this.numberOfSeconds = numberOfSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of seconds to retrieve, up to 2048, 0 indicates all available, -1 indicates to skip any returning data.")
  @JsonProperty("numberOfSeconds")
  public Integer getNumberOfSeconds() {
    return numberOfSeconds;
  }
  
  public void setNumberOfSeconds(Integer numberOfSeconds) {
    this.numberOfSeconds = numberOfSeconds;
  }

  
  /**
   * The total number of minutes to retrieve, up to 2048, 0 indicates all available, -1 indicates to skip any returning data.
   **/
  public PerformanceRingStartDetails numberOfMinutes(Integer numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of minutes to retrieve, up to 2048, 0 indicates all available, -1 indicates to skip any returning data.")
  @JsonProperty("numberOfMinutes")
  public Integer getNumberOfMinutes() {
    return numberOfMinutes;
  }
  
  public void setNumberOfMinutes(Integer numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
  }

  
  /**
   * This field is used with a value of all available, once the data is read a flag is set in the ringBuffer structure to indicate that the data has been read via SYMbol. When combined with a numberOfSeconds or numberOfMinutes is 0 it returns only data previously not sent via SYMbol. When numberOfSeconds or numberOfMinutes are anything other than -1 or 0 the field is ignored.
   **/
  public PerformanceRingStartDetails onlyUnreadData(Boolean onlyUnreadData) {
    this.onlyUnreadData = onlyUnreadData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is used with a value of all available, once the data is read a flag is set in the ringBuffer structure to indicate that the data has been read via SYMbol. When combined with a numberOfSeconds or numberOfMinutes is 0 it returns only data previously not sent via SYMbol. When numberOfSeconds or numberOfMinutes are anything other than -1 or 0 the field is ignored.")
  @JsonProperty("onlyUnreadData")
  public Boolean getOnlyUnreadData() {
    return onlyUnreadData;
  }
  
  public void setOnlyUnreadData(Boolean onlyUnreadData) {
    this.onlyUnreadData = onlyUnreadData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceRingStartDetails performanceRingStartDetails = (PerformanceRingStartDetails) o;
    return Objects.equals(this.perfRingType, performanceRingStartDetails.perfRingType) &&
        Objects.equals(this.numberOfSeconds, performanceRingStartDetails.numberOfSeconds) &&
        Objects.equals(this.numberOfMinutes, performanceRingStartDetails.numberOfMinutes) &&
        Objects.equals(this.onlyUnreadData, performanceRingStartDetails.onlyUnreadData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perfRingType, numberOfSeconds, numberOfMinutes, onlyUnreadData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceRingStartDetails {\n");
    
    sb.append("    perfRingType: ").append(toIndentedString(perfRingType)).append("\n");
    sb.append("    numberOfSeconds: ").append(toIndentedString(numberOfSeconds)).append("\n");
    sb.append("    numberOfMinutes: ").append(toIndentedString(numberOfMinutes)).append("\n");
    sb.append("    onlyUnreadData: ").append(toIndentedString(onlyUnreadData)).append("\n");
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

