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


package com.netapp.santricity.models.v2;

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
 * The collection of statistics averaged over a time range.
 */
@ApiModel(description = "The collection of statistics averaged over a time range.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class AverageAnalysedStatsResponse   {
  
    private List<AverageAnalysedVolumeStats> volumeStats;

    private List<AverageAnalysedDriveStats> diskStats;

    private List<AverageAnalysedControllerStats> controllerStats;

    private List<AverageAnalysedInterfaceStats> interfaceStats;

    private List<AverageAnalysedSystemStats> systemStats;

    private List<AverageAnalysedPoolStats> poolStats;

    private List<AverageAnalysedWorkloadStats> workloadStats;

    private List<AverageAnalysedApplicationStats> applicationStats;

  
  /**
   **/
  public AverageAnalysedStatsResponse volumeStats(List<AverageAnalysedVolumeStats> volumeStats) {
    this.volumeStats = volumeStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeStats")
  public List<AverageAnalysedVolumeStats> getVolumeStats() {
    return volumeStats;
  }
  
  public void setVolumeStats(List<AverageAnalysedVolumeStats> volumeStats) {
    this.volumeStats = volumeStats;
  }

  
  /**
   **/
  public AverageAnalysedStatsResponse diskStats(List<AverageAnalysedDriveStats> diskStats) {
    this.diskStats = diskStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("diskStats")
  public List<AverageAnalysedDriveStats> getDiskStats() {
    return diskStats;
  }
  
  public void setDiskStats(List<AverageAnalysedDriveStats> diskStats) {
    this.diskStats = diskStats;
  }

  
  /**
   **/
  public AverageAnalysedStatsResponse controllerStats(List<AverageAnalysedControllerStats> controllerStats) {
    this.controllerStats = controllerStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("controllerStats")
  public List<AverageAnalysedControllerStats> getControllerStats() {
    return controllerStats;
  }
  
  public void setControllerStats(List<AverageAnalysedControllerStats> controllerStats) {
    this.controllerStats = controllerStats;
  }

  
  /**
   **/
  public AverageAnalysedStatsResponse interfaceStats(List<AverageAnalysedInterfaceStats> interfaceStats) {
    this.interfaceStats = interfaceStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("interfaceStats")
  public List<AverageAnalysedInterfaceStats> getInterfaceStats() {
    return interfaceStats;
  }
  
  public void setInterfaceStats(List<AverageAnalysedInterfaceStats> interfaceStats) {
    this.interfaceStats = interfaceStats;
  }

  
  /**
   **/
  public AverageAnalysedStatsResponse systemStats(List<AverageAnalysedSystemStats> systemStats) {
    this.systemStats = systemStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("systemStats")
  public List<AverageAnalysedSystemStats> getSystemStats() {
    return systemStats;
  }
  
  public void setSystemStats(List<AverageAnalysedSystemStats> systemStats) {
    this.systemStats = systemStats;
  }

  
  /**
   **/
  public AverageAnalysedStatsResponse poolStats(List<AverageAnalysedPoolStats> poolStats) {
    this.poolStats = poolStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("poolStats")
  public List<AverageAnalysedPoolStats> getPoolStats() {
    return poolStats;
  }
  
  public void setPoolStats(List<AverageAnalysedPoolStats> poolStats) {
    this.poolStats = poolStats;
  }

  
  /**
   **/
  public AverageAnalysedStatsResponse workloadStats(List<AverageAnalysedWorkloadStats> workloadStats) {
    this.workloadStats = workloadStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("workloadStats")
  public List<AverageAnalysedWorkloadStats> getWorkloadStats() {
    return workloadStats;
  }
  
  public void setWorkloadStats(List<AverageAnalysedWorkloadStats> workloadStats) {
    this.workloadStats = workloadStats;
  }

  
  /**
   **/
  public AverageAnalysedStatsResponse applicationStats(List<AverageAnalysedApplicationStats> applicationStats) {
    this.applicationStats = applicationStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("applicationStats")
  public List<AverageAnalysedApplicationStats> getApplicationStats() {
    return applicationStats;
  }
  
  public void setApplicationStats(List<AverageAnalysedApplicationStats> applicationStats) {
    this.applicationStats = applicationStats;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AverageAnalysedStatsResponse averageAnalysedStatsResponse = (AverageAnalysedStatsResponse) o;
    return Objects.equals(this.volumeStats, averageAnalysedStatsResponse.volumeStats) &&
        Objects.equals(this.diskStats, averageAnalysedStatsResponse.diskStats) &&
        Objects.equals(this.controllerStats, averageAnalysedStatsResponse.controllerStats) &&
        Objects.equals(this.interfaceStats, averageAnalysedStatsResponse.interfaceStats) &&
        Objects.equals(this.systemStats, averageAnalysedStatsResponse.systemStats) &&
        Objects.equals(this.poolStats, averageAnalysedStatsResponse.poolStats) &&
        Objects.equals(this.workloadStats, averageAnalysedStatsResponse.workloadStats) &&
        Objects.equals(this.applicationStats, averageAnalysedStatsResponse.applicationStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeStats, diskStats, controllerStats, interfaceStats, systemStats, poolStats, workloadStats, applicationStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AverageAnalysedStatsResponse {\n");
    
    sb.append("    volumeStats: ").append(toIndentedString(volumeStats)).append("\n");
    sb.append("    diskStats: ").append(toIndentedString(diskStats)).append("\n");
    sb.append("    controllerStats: ").append(toIndentedString(controllerStats)).append("\n");
    sb.append("    interfaceStats: ").append(toIndentedString(interfaceStats)).append("\n");
    sb.append("    systemStats: ").append(toIndentedString(systemStats)).append("\n");
    sb.append("    poolStats: ").append(toIndentedString(poolStats)).append("\n");
    sb.append("    workloadStats: ").append(toIndentedString(workloadStats)).append("\n");
    sb.append("    applicationStats: ").append(toIndentedString(applicationStats)).append("\n");
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

