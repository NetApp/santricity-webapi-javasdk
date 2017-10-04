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
 * CumulativeStatisticsBundle
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class CumulativeStatisticsBundle   {
  
    private Long observationTime;

    private ObjectReference objectRef;

    private List<CounterGroup> counterGroup;

    private Long bundleStartTime;

    private Long bundleEndTime;

    private Boolean areMoreStatsAvailable;

  
  /**
   * The time that the statistics bundle was retrieved. Time is the number of seconds since midnight, January 1, 1970.
   **/
  public CumulativeStatisticsBundle observationTime(Long observationTime) {
    this.observationTime = observationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time that the statistics bundle was retrieved. Time is the number of seconds since midnight, January 1, 1970.")
  @JsonProperty("observationTime")
  public Long getObservationTime() {
    return observationTime;
  }
  
  public void setObservationTime(Long observationTime) {
    this.observationTime = observationTime;
  }

  
  /**
   * A reference to the object to which the statistics bundle applies.
   **/
  public CumulativeStatisticsBundle objectRef(ObjectReference objectRef) {
    this.objectRef = objectRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the object to which the statistics bundle applies.")
  @JsonProperty("objectRef")
  public ObjectReference getObjectRef() {
    return objectRef;
  }
  
  public void setObjectRef(ObjectReference objectRef) {
    this.objectRef = objectRef;
  }

  
  /**
   * An array of counter groups, one group per controller.
   **/
  public CumulativeStatisticsBundle counterGroup(List<CounterGroup> counterGroup) {
    this.counterGroup = counterGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of counter groups, one group per controller.")
  @JsonProperty("counterGroup")
  public List<CounterGroup> getCounterGroup() {
    return counterGroup;
  }
  
  public void setCounterGroup(List<CounterGroup> counterGroup) {
    this.counterGroup = counterGroup;
  }

  
  /**
   * The end time of the accrued samples within this stats bundle. Time is the number of seconds since midnight, January 1, 1970.
   **/
  public CumulativeStatisticsBundle bundleStartTime(Long bundleStartTime) {
    this.bundleStartTime = bundleStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end time of the accrued samples within this stats bundle. Time is the number of seconds since midnight, January 1, 1970.")
  @JsonProperty("bundleStartTime")
  public Long getBundleStartTime() {
    return bundleStartTime;
  }
  
  public void setBundleStartTime(Long bundleStartTime) {
    this.bundleStartTime = bundleStartTime;
  }

  
  /**
   * The end time of the accrued samples within this stats bundle. Time is the number of seconds since bundleStartTime.
   **/
  public CumulativeStatisticsBundle bundleEndTime(Long bundleEndTime) {
    this.bundleEndTime = bundleEndTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end time of the accrued samples within this stats bundle. Time is the number of seconds since bundleStartTime.")
  @JsonProperty("bundleEndTime")
  public Long getBundleEndTime() {
    return bundleEndTime;
  }
  
  public void setBundleEndTime(Long bundleEndTime) {
    this.bundleEndTime = bundleEndTime;
  }

  
  /**
   * When True, indicates more stats data available beyond the specified observation time in controller memory.
   **/
  public CumulativeStatisticsBundle areMoreStatsAvailable(Boolean areMoreStatsAvailable) {
    this.areMoreStatsAvailable = areMoreStatsAvailable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When True, indicates more stats data available beyond the specified observation time in controller memory.")
  @JsonProperty("areMoreStatsAvailable")
  public Boolean getAreMoreStatsAvailable() {
    return areMoreStatsAvailable;
  }
  
  public void setAreMoreStatsAvailable(Boolean areMoreStatsAvailable) {
    this.areMoreStatsAvailable = areMoreStatsAvailable;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CumulativeStatisticsBundle cumulativeStatisticsBundle = (CumulativeStatisticsBundle) o;
    return Objects.equals(this.observationTime, cumulativeStatisticsBundle.observationTime) &&
        Objects.equals(this.objectRef, cumulativeStatisticsBundle.objectRef) &&
        Objects.equals(this.counterGroup, cumulativeStatisticsBundle.counterGroup) &&
        Objects.equals(this.bundleStartTime, cumulativeStatisticsBundle.bundleStartTime) &&
        Objects.equals(this.bundleEndTime, cumulativeStatisticsBundle.bundleEndTime) &&
        Objects.equals(this.areMoreStatsAvailable, cumulativeStatisticsBundle.areMoreStatsAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observationTime, objectRef, counterGroup, bundleStartTime, bundleEndTime, areMoreStatsAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CumulativeStatisticsBundle {\n");
    
    sb.append("    observationTime: ").append(toIndentedString(observationTime)).append("\n");
    sb.append("    objectRef: ").append(toIndentedString(objectRef)).append("\n");
    sb.append("    counterGroup: ").append(toIndentedString(counterGroup)).append("\n");
    sb.append("    bundleStartTime: ").append(toIndentedString(bundleStartTime)).append("\n");
    sb.append("    bundleEndTime: ").append(toIndentedString(bundleEndTime)).append("\n");
    sb.append("    areMoreStatsAvailable: ").append(toIndentedString(areMoreStatsAvailable)).append("\n");
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

