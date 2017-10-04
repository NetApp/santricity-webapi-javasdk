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
 * HistogramDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class HistogramDescriptor   {
  
    private ObjectReference objectRef;


  /**
   * The type of statistic to observe in the activated streams.
   */
  public enum StreamTypeEnum {
    acpu0("acpu0"),
    acpu1("acpu1"),
    ciqr("ciqr"),
    diqr("diqr"),
    dirt("dirt"),
    hirt("hirt"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StreamTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StreamTypeEnum streamType;

    private Integer duration;

    private Long lowestValue;

    private Long lowestRange;


  /**
   * The type of scale to use for the histogram.
   */
  public enum ScaleTypeEnum {
    linear("linear"),
    logBase2("logBase2"),
    logBase10("logBase10"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ScaleTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ScaleTypeEnum scaleType;

    private Integer numCategories;

  
  /**
   * A reference to the storage array object (e.g., volume, drive, ets.) to observe.
   **/
  public HistogramDescriptor objectRef(ObjectReference objectRef) {
    this.objectRef = objectRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the storage array object (e.g., volume, drive, ets.) to observe.")
  @JsonProperty("objectRef")
  public ObjectReference getObjectRef() {
    return objectRef;
  }
  
  public void setObjectRef(ObjectReference objectRef) {
    this.objectRef = objectRef;
  }

  
  /**
   * The type of statistic to observe in the activated streams.
   **/
  public HistogramDescriptor streamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of statistic to observe in the activated streams.")
  @JsonProperty("streamType")
  public StreamTypeEnum getStreamType() {
    return streamType;
  }
  
  public void setStreamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
  }

  
  /**
   * The amount of time, expressed in seconds, to spend recording observations. If the discrete time series is not retrieved by the client before the end of the duration, the stream wraps around, i.e., observations will be overwritten
   **/
  public HistogramDescriptor duration(Integer duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of time, expressed in seconds, to spend recording observations. If the discrete time series is not retrieved by the client before the end of the duration, the stream wraps around, i.e., observations will be overwritten")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * The lowest value of interest for the stream.
   **/
  public HistogramDescriptor lowestValue(Long lowestValue) {
    this.lowestValue = lowestValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The lowest value of interest for the stream.")
  @JsonProperty("lowestValue")
  public Long getLowestValue() {
    return lowestValue;
  }
  
  public void setLowestValue(Long lowestValue) {
    this.lowestValue = lowestValue;
  }

  
  /**
   * The number of values in the first category.
   **/
  public HistogramDescriptor lowestRange(Long lowestRange) {
    this.lowestRange = lowestRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of values in the first category.")
  @JsonProperty("lowestRange")
  public Long getLowestRange() {
    return lowestRange;
  }
  
  public void setLowestRange(Long lowestRange) {
    this.lowestRange = lowestRange;
  }

  
  /**
   * The type of scale to use for the histogram.
   **/
  public HistogramDescriptor scaleType(ScaleTypeEnum scaleType) {
    this.scaleType = scaleType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of scale to use for the histogram.")
  @JsonProperty("scaleType")
  public ScaleTypeEnum getScaleType() {
    return scaleType;
  }
  
  public void setScaleType(ScaleTypeEnum scaleType) {
    this.scaleType = scaleType;
  }

  
  /**
   * The number of categories in the histogram.
   **/
  public HistogramDescriptor numCategories(Integer numCategories) {
    this.numCategories = numCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of categories in the histogram.")
  @JsonProperty("numCategories")
  public Integer getNumCategories() {
    return numCategories;
  }
  
  public void setNumCategories(Integer numCategories) {
    this.numCategories = numCategories;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistogramDescriptor histogramDescriptor = (HistogramDescriptor) o;
    return Objects.equals(this.objectRef, histogramDescriptor.objectRef) &&
        Objects.equals(this.streamType, histogramDescriptor.streamType) &&
        Objects.equals(this.duration, histogramDescriptor.duration) &&
        Objects.equals(this.lowestValue, histogramDescriptor.lowestValue) &&
        Objects.equals(this.lowestRange, histogramDescriptor.lowestRange) &&
        Objects.equals(this.scaleType, histogramDescriptor.scaleType) &&
        Objects.equals(this.numCategories, histogramDescriptor.numCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectRef, streamType, duration, lowestValue, lowestRange, scaleType, numCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistogramDescriptor {\n");
    
    sb.append("    objectRef: ").append(toIndentedString(objectRef)).append("\n");
    sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    lowestValue: ").append(toIndentedString(lowestValue)).append("\n");
    sb.append("    lowestRange: ").append(toIndentedString(lowestRange)).append("\n");
    sb.append("    scaleType: ").append(toIndentedString(scaleType)).append("\n");
    sb.append("    numCategories: ").append(toIndentedString(numCategories)).append("\n");
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

