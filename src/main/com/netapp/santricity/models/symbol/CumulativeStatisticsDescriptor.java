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
 * CumulativeStatisticsDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class CumulativeStatisticsDescriptor   {
  
    private ObjectReference objectRef;


  /**
   * The type of counter group to be returned.
   */
  public enum GroupTypeEnum {
    drive("drive"),
    implementation("implementation"),
    io("io"),
    volume("volume"),
    controller("controller"),
    iointerface("iointerface"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    GroupTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private GroupTypeEnum groupType;


  /**
   * Location of counter group data to be returned.
   */
  public enum DataLocationEnum {
    unknown("unknown"),
    saved("saved"),
    active("active"),
    all("all"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DataLocationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DataLocationEnum dataLocation;


  /**
   * Identifies if the resolution is low or high.
   */
  public enum StatisticsResolutionEnum {
    low("low"),
    high("high"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatisticsResolutionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatisticsResolutionEnum statisticsResolution;

  
  /**
   * A reference to the storage array object (e.g., volume, drive, ets.) for which counters are to be returned.
   **/
  public CumulativeStatisticsDescriptor objectRef(ObjectReference objectRef) {
    this.objectRef = objectRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the storage array object (e.g., volume, drive, ets.) for which counters are to be returned.")
  @JsonProperty("objectRef")
  public ObjectReference getObjectRef() {
    return objectRef;
  }
  
  public void setObjectRef(ObjectReference objectRef) {
    this.objectRef = objectRef;
  }

  
  /**
   * The type of counter group to be returned.
   **/
  public CumulativeStatisticsDescriptor groupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of counter group to be returned.")
  @JsonProperty("groupType")
  public GroupTypeEnum getGroupType() {
    return groupType;
  }
  
  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  
  /**
   * Location of counter group data to be returned.
   **/
  public CumulativeStatisticsDescriptor dataLocation(DataLocationEnum dataLocation) {
    this.dataLocation = dataLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Location of counter group data to be returned.")
  @JsonProperty("dataLocation")
  public DataLocationEnum getDataLocation() {
    return dataLocation;
  }
  
  public void setDataLocation(DataLocationEnum dataLocation) {
    this.dataLocation = dataLocation;
  }

  
  /**
   * Identifies if the resolution is low or high.
   **/
  public CumulativeStatisticsDescriptor statisticsResolution(StatisticsResolutionEnum statisticsResolution) {
    this.statisticsResolution = statisticsResolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifies if the resolution is low or high.")
  @JsonProperty("statisticsResolution")
  public StatisticsResolutionEnum getStatisticsResolution() {
    return statisticsResolution;
  }
  
  public void setStatisticsResolution(StatisticsResolutionEnum statisticsResolution) {
    this.statisticsResolution = statisticsResolution;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CumulativeStatisticsDescriptor cumulativeStatisticsDescriptor = (CumulativeStatisticsDescriptor) o;
    return Objects.equals(this.objectRef, cumulativeStatisticsDescriptor.objectRef) &&
        Objects.equals(this.groupType, cumulativeStatisticsDescriptor.groupType) &&
        Objects.equals(this.dataLocation, cumulativeStatisticsDescriptor.dataLocation) &&
        Objects.equals(this.statisticsResolution, cumulativeStatisticsDescriptor.statisticsResolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectRef, groupType, dataLocation, statisticsResolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CumulativeStatisticsDescriptor {\n");
    
    sb.append("    objectRef: ").append(toIndentedString(objectRef)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    dataLocation: ").append(toIndentedString(dataLocation)).append("\n");
    sb.append("    statisticsResolution: ").append(toIndentedString(statisticsResolution)).append("\n");
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

