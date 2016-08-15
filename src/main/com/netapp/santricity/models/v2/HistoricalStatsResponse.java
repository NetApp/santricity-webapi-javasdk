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
 * The collection of stats that are returned from a call to get historical statistics  Each list is sorted by capture timetsamp (earlier to later).
 */
@ApiModel(description = "The collection of stats that are returned from a call to get historical statistics  Each list is sorted by capture timetsamp (earlier to later).")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class HistoricalStatsResponse   {
  
    private List<AnalysedVolumeStatistics> volumeStats;

    private List<AnalysedControllerStatistics> controllerStats;

    private List<AnalysedStorageSystemStatistics> systemStats;

    private List<AnalyzedInterfaceStatistics> interfaceStats;

    private List<AnalysedDiskStatistics> diskStats;

    private List<AnalyzedPoolStatistics> poolStats;

    private List<AnalyzedWorkloadStatistics> workloadStats;

    private List<AnalyzedApplicationStatistics> applicationStats;

    private List<AnalysedVolumeStatistics> volumes;

  
  /**
   **/
  public HistoricalStatsResponse volumeStats(List<AnalysedVolumeStatistics> volumeStats) {
    this.volumeStats = volumeStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeStats")
  public List<AnalysedVolumeStatistics> getVolumeStats() {
    return volumeStats;
  }
  
  public void setVolumeStats(List<AnalysedVolumeStatistics> volumeStats) {
    this.volumeStats = volumeStats;
  }

  
  /**
   **/
  public HistoricalStatsResponse controllerStats(List<AnalysedControllerStatistics> controllerStats) {
    this.controllerStats = controllerStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("controllerStats")
  public List<AnalysedControllerStatistics> getControllerStats() {
    return controllerStats;
  }
  
  public void setControllerStats(List<AnalysedControllerStatistics> controllerStats) {
    this.controllerStats = controllerStats;
  }

  
  /**
   **/
  public HistoricalStatsResponse systemStats(List<AnalysedStorageSystemStatistics> systemStats) {
    this.systemStats = systemStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("systemStats")
  public List<AnalysedStorageSystemStatistics> getSystemStats() {
    return systemStats;
  }
  
  public void setSystemStats(List<AnalysedStorageSystemStatistics> systemStats) {
    this.systemStats = systemStats;
  }

  
  /**
   **/
  public HistoricalStatsResponse interfaceStats(List<AnalyzedInterfaceStatistics> interfaceStats) {
    this.interfaceStats = interfaceStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("interfaceStats")
  public List<AnalyzedInterfaceStatistics> getInterfaceStats() {
    return interfaceStats;
  }
  
  public void setInterfaceStats(List<AnalyzedInterfaceStatistics> interfaceStats) {
    this.interfaceStats = interfaceStats;
  }

  
  /**
   **/
  public HistoricalStatsResponse diskStats(List<AnalysedDiskStatistics> diskStats) {
    this.diskStats = diskStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("diskStats")
  public List<AnalysedDiskStatistics> getDiskStats() {
    return diskStats;
  }
  
  public void setDiskStats(List<AnalysedDiskStatistics> diskStats) {
    this.diskStats = diskStats;
  }

  
  /**
   **/
  public HistoricalStatsResponse poolStats(List<AnalyzedPoolStatistics> poolStats) {
    this.poolStats = poolStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("poolStats")
  public List<AnalyzedPoolStatistics> getPoolStats() {
    return poolStats;
  }
  
  public void setPoolStats(List<AnalyzedPoolStatistics> poolStats) {
    this.poolStats = poolStats;
  }

  
  /**
   **/
  public HistoricalStatsResponse workloadStats(List<AnalyzedWorkloadStatistics> workloadStats) {
    this.workloadStats = workloadStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("workloadStats")
  public List<AnalyzedWorkloadStatistics> getWorkloadStats() {
    return workloadStats;
  }
  
  public void setWorkloadStats(List<AnalyzedWorkloadStatistics> workloadStats) {
    this.workloadStats = workloadStats;
  }

  
  /**
   **/
  public HistoricalStatsResponse applicationStats(List<AnalyzedApplicationStatistics> applicationStats) {
    this.applicationStats = applicationStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("applicationStats")
  public List<AnalyzedApplicationStatistics> getApplicationStats() {
    return applicationStats;
  }
  
  public void setApplicationStats(List<AnalyzedApplicationStatistics> applicationStats) {
    this.applicationStats = applicationStats;
  }

  
  /**
   **/
  public HistoricalStatsResponse volumes(List<AnalysedVolumeStatistics> volumes) {
    this.volumes = volumes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumes")
  public List<AnalysedVolumeStatistics> getVolumes() {
    return volumes;
  }
  
  public void setVolumes(List<AnalysedVolumeStatistics> volumes) {
    this.volumes = volumes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalStatsResponse historicalStatsResponse = (HistoricalStatsResponse) o;
    return Objects.equals(this.volumeStats, historicalStatsResponse.volumeStats) &&
        Objects.equals(this.controllerStats, historicalStatsResponse.controllerStats) &&
        Objects.equals(this.systemStats, historicalStatsResponse.systemStats) &&
        Objects.equals(this.interfaceStats, historicalStatsResponse.interfaceStats) &&
        Objects.equals(this.diskStats, historicalStatsResponse.diskStats) &&
        Objects.equals(this.poolStats, historicalStatsResponse.poolStats) &&
        Objects.equals(this.workloadStats, historicalStatsResponse.workloadStats) &&
        Objects.equals(this.applicationStats, historicalStatsResponse.applicationStats) &&
        Objects.equals(this.volumes, historicalStatsResponse.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeStats, controllerStats, systemStats, interfaceStats, diskStats, poolStats, workloadStats, applicationStats, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalStatsResponse {\n");
    
    sb.append("    volumeStats: ").append(toIndentedString(volumeStats)).append("\n");
    sb.append("    controllerStats: ").append(toIndentedString(controllerStats)).append("\n");
    sb.append("    systemStats: ").append(toIndentedString(systemStats)).append("\n");
    sb.append("    interfaceStats: ").append(toIndentedString(interfaceStats)).append("\n");
    sb.append("    diskStats: ").append(toIndentedString(diskStats)).append("\n");
    sb.append("    poolStats: ").append(toIndentedString(poolStats)).append("\n");
    sb.append("    workloadStats: ").append(toIndentedString(workloadStats)).append("\n");
    sb.append("    applicationStats: ").append(toIndentedString(applicationStats)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

