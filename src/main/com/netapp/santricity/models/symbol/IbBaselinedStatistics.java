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
 * IbBaselinedStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IbBaselinedStatistics   {
  
    private StatisticalTimeData timeData;

    private List<IbInterfaceStatistics> ibInterfaceStatisticsRaw;

    private List<IbInterfaceStatistics> ibInterfaceStatisticsRel;

  
  /**
   * The time data associated with this set of statistics.
   **/
  public IbBaselinedStatistics timeData(StatisticalTimeData timeData) {
    this.timeData = timeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time data associated with this set of statistics.")
  @JsonProperty("timeData")
  public StatisticalTimeData getTimeData() {
    return timeData;
  }
  
  public void setTimeData(StatisticalTimeData timeData) {
    this.timeData = timeData;
  }

  
  /**
   * An array of structures containing \"raw\" (i.e., baseline = controller start-of-day) InfiniBand host interface statistics, one structure per InfiniBand interface.
   **/
  public IbBaselinedStatistics ibInterfaceStatisticsRaw(List<IbInterfaceStatistics> ibInterfaceStatisticsRaw) {
    this.ibInterfaceStatisticsRaw = ibInterfaceStatisticsRaw;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of structures containing \"raw\" (i.e., baseline = controller start-of-day) InfiniBand host interface statistics, one structure per InfiniBand interface.")
  @JsonProperty("ibInterfaceStatisticsRaw")
  public List<IbInterfaceStatistics> getIbInterfaceStatisticsRaw() {
    return ibInterfaceStatisticsRaw;
  }
  
  public void setIbInterfaceStatisticsRaw(List<IbInterfaceStatistics> ibInterfaceStatisticsRaw) {
    this.ibInterfaceStatisticsRaw = ibInterfaceStatisticsRaw;
  }

  
  /**
   * An array of structures containing \"relative\" (i.e., baseline = user pre-set baseline) InfiniBand host interface statistics, one structure per InfiniBand interface.
   **/
  public IbBaselinedStatistics ibInterfaceStatisticsRel(List<IbInterfaceStatistics> ibInterfaceStatisticsRel) {
    this.ibInterfaceStatisticsRel = ibInterfaceStatisticsRel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of structures containing \"relative\" (i.e., baseline = user pre-set baseline) InfiniBand host interface statistics, one structure per InfiniBand interface.")
  @JsonProperty("ibInterfaceStatisticsRel")
  public List<IbInterfaceStatistics> getIbInterfaceStatisticsRel() {
    return ibInterfaceStatisticsRel;
  }
  
  public void setIbInterfaceStatisticsRel(List<IbInterfaceStatistics> ibInterfaceStatisticsRel) {
    this.ibInterfaceStatisticsRel = ibInterfaceStatisticsRel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbBaselinedStatistics ibBaselinedStatistics = (IbBaselinedStatistics) o;
    return Objects.equals(this.timeData, ibBaselinedStatistics.timeData) &&
        Objects.equals(this.ibInterfaceStatisticsRaw, ibBaselinedStatistics.ibInterfaceStatisticsRaw) &&
        Objects.equals(this.ibInterfaceStatisticsRel, ibBaselinedStatistics.ibInterfaceStatisticsRel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeData, ibInterfaceStatisticsRaw, ibInterfaceStatisticsRel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbBaselinedStatistics {\n");
    
    sb.append("    timeData: ").append(toIndentedString(timeData)).append("\n");
    sb.append("    ibInterfaceStatisticsRaw: ").append(toIndentedString(ibInterfaceStatisticsRaw)).append("\n");
    sb.append("    ibInterfaceStatisticsRel: ").append(toIndentedString(ibInterfaceStatisticsRel)).append("\n");
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

