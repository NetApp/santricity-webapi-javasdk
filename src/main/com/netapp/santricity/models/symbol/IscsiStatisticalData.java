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
 * IscsiStatisticalData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IscsiStatisticalData   {
  
    private String controller;

    private StatisticalTimeData timeData;

    private IscsiInterfaceStatistics iscsiInterfaceStatistics;

    private List<IscsiTargetStatistics> iscsiTargetStatistics;

    private List<IscsiInitiatorStatistics> iscsiInitiatorStatistics;

  
  /**
   * A reference to the controller that collected these statistics.
   **/
  public IscsiStatisticalData controller(String controller) {
    this.controller = controller;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the controller that collected these statistics.")
  @JsonProperty("controller")
  public String getController() {
    return controller;
  }
  
  public void setController(String controller) {
    this.controller = controller;
  }

  
  /**
   * The time data associated with this set of statistics.
   **/
  public IscsiStatisticalData timeData(StatisticalTimeData timeData) {
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
   * iSCSI statistical data that pertain to the iSCSI interfaces for this controller. Each sub-structure of IscsiInterfaceStatistics has data identifying the iSCSI interface(s) with which the statistics are associated. Note that the data in any of the sub-structures may be associated with multiple interfaces. See the section on the IscsiInterfaceStatistics structure.
   **/
  public IscsiStatisticalData iscsiInterfaceStatistics(IscsiInterfaceStatistics iscsiInterfaceStatistics) {
    this.iscsiInterfaceStatistics = iscsiInterfaceStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "iSCSI statistical data that pertain to the iSCSI interfaces for this controller. Each sub-structure of IscsiInterfaceStatistics has data identifying the iSCSI interface(s) with which the statistics are associated. Note that the data in any of the sub-structures may be associated with multiple interfaces. See the section on the IscsiInterfaceStatistics structure.")
  @JsonProperty("iscsiInterfaceStatistics")
  public IscsiInterfaceStatistics getIscsiInterfaceStatistics() {
    return iscsiInterfaceStatistics;
  }
  
  public void setIscsiInterfaceStatistics(IscsiInterfaceStatistics iscsiInterfaceStatistics) {
    this.iscsiInterfaceStatistics = iscsiInterfaceStatistics;
  }

  
  /**
   * iSCSI statistical data that pertain to the iSCSI targets. Each element of the array contains the statistics for one target that was collected by this controller. The counters from the two controllers, for a given target, must be added together by the client if a combined total for the target is desired.
   **/
  public IscsiStatisticalData iscsiTargetStatistics(List<IscsiTargetStatistics> iscsiTargetStatistics) {
    this.iscsiTargetStatistics = iscsiTargetStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "iSCSI statistical data that pertain to the iSCSI targets. Each element of the array contains the statistics for one target that was collected by this controller. The counters from the two controllers, for a given target, must be added together by the client if a combined total for the target is desired.")
  @JsonProperty("iscsiTargetStatistics")
  public List<IscsiTargetStatistics> getIscsiTargetStatistics() {
    return iscsiTargetStatistics;
  }
  
  public void setIscsiTargetStatistics(List<IscsiTargetStatistics> iscsiTargetStatistics) {
    this.iscsiTargetStatistics = iscsiTargetStatistics;
  }

  
  /**
   * iSCSI statistical data that pertain to the iSCSI initiator. Each element of the array contains the statistics for one initiator that was collected by this controller. The counters from the two controllers, for a given initiator, must be added together by the client if a combined total for the initiator is desired.
   **/
  public IscsiStatisticalData iscsiInitiatorStatistics(List<IscsiInitiatorStatistics> iscsiInitiatorStatistics) {
    this.iscsiInitiatorStatistics = iscsiInitiatorStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "iSCSI statistical data that pertain to the iSCSI initiator. Each element of the array contains the statistics for one initiator that was collected by this controller. The counters from the two controllers, for a given initiator, must be added together by the client if a combined total for the initiator is desired.")
  @JsonProperty("iscsiInitiatorStatistics")
  public List<IscsiInitiatorStatistics> getIscsiInitiatorStatistics() {
    return iscsiInitiatorStatistics;
  }
  
  public void setIscsiInitiatorStatistics(List<IscsiInitiatorStatistics> iscsiInitiatorStatistics) {
    this.iscsiInitiatorStatistics = iscsiInitiatorStatistics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiStatisticalData iscsiStatisticalData = (IscsiStatisticalData) o;
    return Objects.equals(this.controller, iscsiStatisticalData.controller) &&
        Objects.equals(this.timeData, iscsiStatisticalData.timeData) &&
        Objects.equals(this.iscsiInterfaceStatistics, iscsiStatisticalData.iscsiInterfaceStatistics) &&
        Objects.equals(this.iscsiTargetStatistics, iscsiStatisticalData.iscsiTargetStatistics) &&
        Objects.equals(this.iscsiInitiatorStatistics, iscsiStatisticalData.iscsiInitiatorStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controller, timeData, iscsiInterfaceStatistics, iscsiTargetStatistics, iscsiInitiatorStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiStatisticalData {\n");
    
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    timeData: ").append(toIndentedString(timeData)).append("\n");
    sb.append("    iscsiInterfaceStatistics: ").append(toIndentedString(iscsiInterfaceStatistics)).append("\n");
    sb.append("    iscsiTargetStatistics: ").append(toIndentedString(iscsiTargetStatistics)).append("\n");
    sb.append("    iscsiInitiatorStatistics: ").append(toIndentedString(iscsiInitiatorStatistics)).append("\n");
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

