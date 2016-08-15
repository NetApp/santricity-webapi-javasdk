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
 * DiscreteTimeSeriesDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DiscreteTimeSeriesDescriptor   {
  
    private ObjectReference objectRef;


  /**
   * The type of statistic to observe in the activated stream.
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

  
  /**
   * A reference to the storage array object (e.g., volume, drive, ets.) to observe.
   **/
  public DiscreteTimeSeriesDescriptor objectRef(ObjectReference objectRef) {
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
   * The type of statistic to observe in the activated stream.
   **/
  public DiscreteTimeSeriesDescriptor streamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of statistic to observe in the activated stream.")
  @JsonProperty("streamType")
  public StreamTypeEnum getStreamType() {
    return streamType;
  }
  
  public void setStreamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
  }

  
  /**
   * The amount of time, expressed in seconds, to spend recording observations. If the discrete time series is not retrieved by the client before the end of the duration, the stream wraps around, i.e., observations will be overwritten.
   **/
  public DiscreteTimeSeriesDescriptor duration(Integer duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of time, expressed in seconds, to spend recording observations. If the discrete time series is not retrieved by the client before the end of the duration, the stream wraps around, i.e., observations will be overwritten.")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscreteTimeSeriesDescriptor discreteTimeSeriesDescriptor = (DiscreteTimeSeriesDescriptor) o;
    return Objects.equals(this.objectRef, discreteTimeSeriesDescriptor.objectRef) &&
        Objects.equals(this.streamType, discreteTimeSeriesDescriptor.streamType) &&
        Objects.equals(this.duration, discreteTimeSeriesDescriptor.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectRef, streamType, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscreteTimeSeriesDescriptor {\n");
    
    sb.append("    objectRef: ").append(toIndentedString(objectRef)).append("\n");
    sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

