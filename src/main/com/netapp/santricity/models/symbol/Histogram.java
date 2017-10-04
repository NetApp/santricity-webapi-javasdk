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
 * Histogram
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class Histogram   {
  
    private String controllerRef;

    private HistogramSummary belowRange;

    private HistogramSummary inRange;

    private HistogramSummary aboveRange;

    private List<Long> frequencyTable;

  
  /**
   * A reference to the controller that provided the statistics.
   **/
  public Histogram controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the controller that provided the statistics.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * A summary of below-range, unrecorded values.
   **/
  public Histogram belowRange(HistogramSummary belowRange) {
    this.belowRange = belowRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A summary of below-range, unrecorded values.")
  @JsonProperty("belowRange")
  public HistogramSummary getBelowRange() {
    return belowRange;
  }
  
  public void setBelowRange(HistogramSummary belowRange) {
    this.belowRange = belowRange;
  }

  
  /**
   * A summary of recorded values.
   **/
  public Histogram inRange(HistogramSummary inRange) {
    this.inRange = inRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A summary of recorded values.")
  @JsonProperty("inRange")
  public HistogramSummary getInRange() {
    return inRange;
  }
  
  public void setInRange(HistogramSummary inRange) {
    this.inRange = inRange;
  }

  
  /**
   * A summary of above-range, unrecorded values.
   **/
  public Histogram aboveRange(HistogramSummary aboveRange) {
    this.aboveRange = aboveRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A summary of above-range, unrecorded values.")
  @JsonProperty("aboveRange")
  public HistogramSummary getAboveRange() {
    return aboveRange;
  }
  
  public void setAboveRange(HistogramSummary aboveRange) {
    this.aboveRange = aboveRange;
  }

  
  /**
   * An array of counter values, one counter per histogram category.
   **/
  public Histogram frequencyTable(List<Long> frequencyTable) {
    this.frequencyTable = frequencyTable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of counter values, one counter per histogram category.")
  @JsonProperty("frequencyTable")
  public List<Long> getFrequencyTable() {
    return frequencyTable;
  }
  
  public void setFrequencyTable(List<Long> frequencyTable) {
    this.frequencyTable = frequencyTable;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Histogram histogram = (Histogram) o;
    return Objects.equals(this.controllerRef, histogram.controllerRef) &&
        Objects.equals(this.belowRange, histogram.belowRange) &&
        Objects.equals(this.inRange, histogram.inRange) &&
        Objects.equals(this.aboveRange, histogram.aboveRange) &&
        Objects.equals(this.frequencyTable, histogram.frequencyTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, belowRange, inRange, aboveRange, frequencyTable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Histogram {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    belowRange: ").append(toIndentedString(belowRange)).append("\n");
    sb.append("    inRange: ").append(toIndentedString(inRange)).append("\n");
    sb.append("    aboveRange: ").append(toIndentedString(aboveRange)).append("\n");
    sb.append("    frequencyTable: ").append(toIndentedString(frequencyTable)).append("\n");
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

