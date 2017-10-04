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
 * NVMeoFInterfaceStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class NVMeoFInterfaceStatistics   {
  
    private String interfaceRef;

    private Integer totalControllerCount;

    private Long keepAliveTimeouts;

    private Long maxIoQueuesConnectFailures;

    private Long maxControllerConnectFailures;

    private Long nvmeControllerResets;

    private Long nvmeControllerShutdowns;

    private NVMeoFQueueStatistics adminQueueStatistics;

    private NVMeoFQueueStatistics ioQueueStatistics;

  
  /**
   * The reference to the interface object.
   **/
  public NVMeoFInterfaceStatistics interfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference to the interface object.")
  @JsonProperty("interfaceRef")
  public String getInterfaceRef() {
    return interfaceRef;
  }
  
  public void setInterfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
  }

  
  /**
   * The number of NVMe controllers (i.e., I_T_Nexuses in SCSI terminology) over this interface.
   **/
  public NVMeoFInterfaceStatistics totalControllerCount(Integer totalControllerCount) {
    this.totalControllerCount = totalControllerCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of NVMe controllers (i.e., I_T_Nexuses in SCSI terminology) over this interface.")
  @JsonProperty("totalControllerCount")
  public Integer getTotalControllerCount() {
    return totalControllerCount;
  }
  
  public void setTotalControllerCount(Integer totalControllerCount) {
    this.totalControllerCount = totalControllerCount;
  }

  
  /**
   * The number of Keep Alive Timeouts that have occurred on this NVMe over Fabrics interface.
   **/
  public NVMeoFInterfaceStatistics keepAliveTimeouts(Long keepAliveTimeouts) {
    this.keepAliveTimeouts = keepAliveTimeouts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of Keep Alive Timeouts that have occurred on this NVMe over Fabrics interface.")
  @JsonProperty("keepAliveTimeouts")
  public Long getKeepAliveTimeouts() {
    return keepAliveTimeouts;
  }
  
  public void setKeepAliveTimeouts(Long keepAliveTimeouts) {
    this.keepAliveTimeouts = keepAliveTimeouts;
  }

  
  /**
   * The maximum number of I/O Queue Connect Failures that have occurred on this NVMe over Fabrics interface.
   **/
  public NVMeoFInterfaceStatistics maxIoQueuesConnectFailures(Long maxIoQueuesConnectFailures) {
    this.maxIoQueuesConnectFailures = maxIoQueuesConnectFailures;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of I/O Queue Connect Failures that have occurred on this NVMe over Fabrics interface.")
  @JsonProperty("maxIoQueuesConnectFailures")
  public Long getMaxIoQueuesConnectFailures() {
    return maxIoQueuesConnectFailures;
  }
  
  public void setMaxIoQueuesConnectFailures(Long maxIoQueuesConnectFailures) {
    this.maxIoQueuesConnectFailures = maxIoQueuesConnectFailures;
  }

  
  /**
   * The maximum number of NVMe Controller Connect Failures that have occurred on this NVMe over Fabrics interface.
   **/
  public NVMeoFInterfaceStatistics maxControllerConnectFailures(Long maxControllerConnectFailures) {
    this.maxControllerConnectFailures = maxControllerConnectFailures;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of NVMe Controller Connect Failures that have occurred on this NVMe over Fabrics interface.")
  @JsonProperty("maxControllerConnectFailures")
  public Long getMaxControllerConnectFailures() {
    return maxControllerConnectFailures;
  }
  
  public void setMaxControllerConnectFailures(Long maxControllerConnectFailures) {
    this.maxControllerConnectFailures = maxControllerConnectFailures;
  }

  
  /**
   * The number of NVM Controller Resets that have occurred on this NVMe over Fabrics interface.
   **/
  public NVMeoFInterfaceStatistics nvmeControllerResets(Long nvmeControllerResets) {
    this.nvmeControllerResets = nvmeControllerResets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of NVM Controller Resets that have occurred on this NVMe over Fabrics interface.")
  @JsonProperty("nvmeControllerResets")
  public Long getNvmeControllerResets() {
    return nvmeControllerResets;
  }
  
  public void setNvmeControllerResets(Long nvmeControllerResets) {
    this.nvmeControllerResets = nvmeControllerResets;
  }

  
  /**
   * The number of NVM Controller Shutdowns that have occurred on this NVMe over Fabrics interface.
   **/
  public NVMeoFInterfaceStatistics nvmeControllerShutdowns(Long nvmeControllerShutdowns) {
    this.nvmeControllerShutdowns = nvmeControllerShutdowns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of NVM Controller Shutdowns that have occurred on this NVMe over Fabrics interface.")
  @JsonProperty("nvmeControllerShutdowns")
  public Long getNvmeControllerShutdowns() {
    return nvmeControllerShutdowns;
  }
  
  public void setNvmeControllerShutdowns(Long nvmeControllerShutdowns) {
    this.nvmeControllerShutdowns = nvmeControllerShutdowns;
  }

  
  /**
   * This structure describes the NVMe over Fabrics queue statistics for the Admin Queue.
   **/
  public NVMeoFInterfaceStatistics adminQueueStatistics(NVMeoFQueueStatistics adminQueueStatistics) {
    this.adminQueueStatistics = adminQueueStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure describes the NVMe over Fabrics queue statistics for the Admin Queue.")
  @JsonProperty("adminQueueStatistics")
  public NVMeoFQueueStatistics getAdminQueueStatistics() {
    return adminQueueStatistics;
  }
  
  public void setAdminQueueStatistics(NVMeoFQueueStatistics adminQueueStatistics) {
    this.adminQueueStatistics = adminQueueStatistics;
  }

  
  /**
   * This structure describes the NVMe over Fabrics queue statistics for the I/O Queues.
   **/
  public NVMeoFInterfaceStatistics ioQueueStatistics(NVMeoFQueueStatistics ioQueueStatistics) {
    this.ioQueueStatistics = ioQueueStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure describes the NVMe over Fabrics queue statistics for the I/O Queues.")
  @JsonProperty("ioQueueStatistics")
  public NVMeoFQueueStatistics getIoQueueStatistics() {
    return ioQueueStatistics;
  }
  
  public void setIoQueueStatistics(NVMeoFQueueStatistics ioQueueStatistics) {
    this.ioQueueStatistics = ioQueueStatistics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NVMeoFInterfaceStatistics nVMeoFInterfaceStatistics = (NVMeoFInterfaceStatistics) o;
    return Objects.equals(this.interfaceRef, nVMeoFInterfaceStatistics.interfaceRef) &&
        Objects.equals(this.totalControllerCount, nVMeoFInterfaceStatistics.totalControllerCount) &&
        Objects.equals(this.keepAliveTimeouts, nVMeoFInterfaceStatistics.keepAliveTimeouts) &&
        Objects.equals(this.maxIoQueuesConnectFailures, nVMeoFInterfaceStatistics.maxIoQueuesConnectFailures) &&
        Objects.equals(this.maxControllerConnectFailures, nVMeoFInterfaceStatistics.maxControllerConnectFailures) &&
        Objects.equals(this.nvmeControllerResets, nVMeoFInterfaceStatistics.nvmeControllerResets) &&
        Objects.equals(this.nvmeControllerShutdowns, nVMeoFInterfaceStatistics.nvmeControllerShutdowns) &&
        Objects.equals(this.adminQueueStatistics, nVMeoFInterfaceStatistics.adminQueueStatistics) &&
        Objects.equals(this.ioQueueStatistics, nVMeoFInterfaceStatistics.ioQueueStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceRef, totalControllerCount, keepAliveTimeouts, maxIoQueuesConnectFailures, maxControllerConnectFailures, nvmeControllerResets, nvmeControllerShutdowns, adminQueueStatistics, ioQueueStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NVMeoFInterfaceStatistics {\n");
    
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    totalControllerCount: ").append(toIndentedString(totalControllerCount)).append("\n");
    sb.append("    keepAliveTimeouts: ").append(toIndentedString(keepAliveTimeouts)).append("\n");
    sb.append("    maxIoQueuesConnectFailures: ").append(toIndentedString(maxIoQueuesConnectFailures)).append("\n");
    sb.append("    maxControllerConnectFailures: ").append(toIndentedString(maxControllerConnectFailures)).append("\n");
    sb.append("    nvmeControllerResets: ").append(toIndentedString(nvmeControllerResets)).append("\n");
    sb.append("    nvmeControllerShutdowns: ").append(toIndentedString(nvmeControllerShutdowns)).append("\n");
    sb.append("    adminQueueStatistics: ").append(toIndentedString(adminQueueStatistics)).append("\n");
    sb.append("    ioQueueStatistics: ").append(toIndentedString(ioQueueStatistics)).append("\n");
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

