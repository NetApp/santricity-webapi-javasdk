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
 * EnhancedIbBaselinedStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class EnhancedIbBaselinedStatistics   {
  
    private StatisticalTimeData timeData;

    private List<EnhancedIbInterfaceStatistics> ibInterfaceStatisticsRaw;

    private List<EnhancedIbInterfaceStatistics> ibInterfaceStatisticsRel;

  
  /**
   * The time at which the baseline was established.
   **/
  public EnhancedIbBaselinedStatistics timeData(StatisticalTimeData timeData) {
    this.timeData = timeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time at which the baseline was established.")
  @JsonProperty("timeData")
  public StatisticalTimeData getTimeData() {
    return timeData;
  }
  
  public void setTimeData(StatisticalTimeData timeData) {
    this.timeData = timeData;
  }

  
  /**
   * Contains \"raw\" IB host interface statistics. (1) Note that these raw values are reset to zero on a controller reboot so the counters will contain values accumulated since the last controller reboot. The one exception to this rule is when the Infiniband (IB) subnet manager running in the IB fabric resets a counter, usually as a result of a manual command issued from a host. (2) Note that the raw counters may reach a hardware limited maximum value in which case they will not accumulate any more until reset by the subnet manager or if the controller reboots. If the counter reaches its maximum value, the StatisticQualifier element for the statistic will indicate STAT_INVALID_STUCK and the value will reflect the max value. (3) Note that raw statistics that are not supported by that particular type of IB hardware will return a qualifier of STAT_NOT SUPPORTED.
   **/
  public EnhancedIbBaselinedStatistics ibInterfaceStatisticsRaw(List<EnhancedIbInterfaceStatistics> ibInterfaceStatisticsRaw) {
    this.ibInterfaceStatisticsRaw = ibInterfaceStatisticsRaw;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains \"raw\" IB host interface statistics. (1) Note that these raw values are reset to zero on a controller reboot so the counters will contain values accumulated since the last controller reboot. The one exception to this rule is when the Infiniband (IB) subnet manager running in the IB fabric resets a counter, usually as a result of a manual command issued from a host. (2) Note that the raw counters may reach a hardware limited maximum value in which case they will not accumulate any more until reset by the subnet manager or if the controller reboots. If the counter reaches its maximum value, the StatisticQualifier element for the statistic will indicate STAT_INVALID_STUCK and the value will reflect the max value. (3) Note that raw statistics that are not supported by that particular type of IB hardware will return a qualifier of STAT_NOT SUPPORTED.")
  @JsonProperty("ibInterfaceStatisticsRaw")
  public List<EnhancedIbInterfaceStatistics> getIbInterfaceStatisticsRaw() {
    return ibInterfaceStatisticsRaw;
  }
  
  public void setIbInterfaceStatisticsRaw(List<EnhancedIbInterfaceStatistics> ibInterfaceStatisticsRaw) {
    this.ibInterfaceStatisticsRaw = ibInterfaceStatisticsRaw;
  }

  
  /**
   * Contains \"rel\" IB host interface statistics. \"Rel\" is the difference between the raw counters (see IbInterfaceStatisticsRaw) and the value of the counters at the time setIserStatisticsBaseline() or setIbStatisticsBaseline() was invoked. (1) A controller reboot sets the baseline timestamp for counters for that controller to the time of the (re)boot with counter values all set to zero. (2) The subnet manager resetting a counter may cause the \"rel\" difference to be negative, in which case the counter's associated \"value\" attribute will be negative and the StatisticQualifier element will indicate STAT_INVALID_EXTERNAL_RESET. (3) Note that if the associated raw counter is set to STAT_INVALID_STUCK then the rel counter will also be set to STAT_INVALID_STUCK. (4) If the associated raw counter is set to STAT_NOT_SUPPORTED then the rel counter will be set to STAT_NOT_SUPPORTED.
   **/
  public EnhancedIbBaselinedStatistics ibInterfaceStatisticsRel(List<EnhancedIbInterfaceStatistics> ibInterfaceStatisticsRel) {
    this.ibInterfaceStatisticsRel = ibInterfaceStatisticsRel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains \"rel\" IB host interface statistics. \"Rel\" is the difference between the raw counters (see IbInterfaceStatisticsRaw) and the value of the counters at the time setIserStatisticsBaseline() or setIbStatisticsBaseline() was invoked. (1) A controller reboot sets the baseline timestamp for counters for that controller to the time of the (re)boot with counter values all set to zero. (2) The subnet manager resetting a counter may cause the \"rel\" difference to be negative, in which case the counter's associated \"value\" attribute will be negative and the StatisticQualifier element will indicate STAT_INVALID_EXTERNAL_RESET. (3) Note that if the associated raw counter is set to STAT_INVALID_STUCK then the rel counter will also be set to STAT_INVALID_STUCK. (4) If the associated raw counter is set to STAT_NOT_SUPPORTED then the rel counter will be set to STAT_NOT_SUPPORTED.")
  @JsonProperty("ibInterfaceStatisticsRel")
  public List<EnhancedIbInterfaceStatistics> getIbInterfaceStatisticsRel() {
    return ibInterfaceStatisticsRel;
  }
  
  public void setIbInterfaceStatisticsRel(List<EnhancedIbInterfaceStatistics> ibInterfaceStatisticsRel) {
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
    EnhancedIbBaselinedStatistics enhancedIbBaselinedStatistics = (EnhancedIbBaselinedStatistics) o;
    return Objects.equals(this.timeData, enhancedIbBaselinedStatistics.timeData) &&
        Objects.equals(this.ibInterfaceStatisticsRaw, enhancedIbBaselinedStatistics.ibInterfaceStatisticsRaw) &&
        Objects.equals(this.ibInterfaceStatisticsRel, enhancedIbBaselinedStatistics.ibInterfaceStatisticsRel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeData, ibInterfaceStatisticsRaw, ibInterfaceStatisticsRel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedIbBaselinedStatistics {\n");
    
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

