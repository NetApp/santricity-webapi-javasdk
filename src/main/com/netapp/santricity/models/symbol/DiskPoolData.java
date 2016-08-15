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
 * DiskPoolData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DiskPoolData   {
  
    private Integer reconstructionReservedDriveCount;

    private Long reconstructionReservedAmt;

    private Integer reconstructionReservedDriveCountCurrent;

    private Integer poolUtilizationWarningThreshold;

    private Integer poolUtilizationCriticalThreshold;


  /**
   * The Disk pool state set based on state of the threshold.
   */
  public enum PoolUtilizationStateEnum {
    utilizationInvalid("utilizationInvalid"),
    utilizationOptimal("utilizationOptimal"),
    utilizationWarning("utilizationWarning"),
    utilizationCritical("utilizationCritical"),
    capacityDepleted("capacityDepleted"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PoolUtilizationStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PoolUtilizationStateEnum poolUtilizationState;

    private Long unusableCapacity;


  /**
   * One failed drive degraded reconstruction priority.
   */
  public enum DegradedReconstructPriorityEnum {
    invalid("invalid"),
    lowest("lowest"),
    low("low"),
    medium("medium"),
    high("high"),
    highest("highest"),
    useDefault("useDefault"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DegradedReconstructPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DegradedReconstructPriorityEnum degradedReconstructPriority;


  /**
   * Two failed drive reconstruction critical priority.
   */
  public enum CriticalReconstructPriorityEnum {
    invalid("invalid"),
    lowest("lowest"),
    low("low"),
    medium("medium"),
    high("high"),
    highest("highest"),
    useDefault("useDefault"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CriticalReconstructPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CriticalReconstructPriorityEnum criticalReconstructPriority;


  /**
   * Priority of other background operations (DVE,DCE,DCR, and IAF).
   */
  public enum BackgroundOperationPriorityEnum {
    invalid("invalid"),
    lowest("lowest"),
    low("low"),
    medium("medium"),
    high("high"),
    highest("highest"),
    useDefault("useDefault"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    BackgroundOperationPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private BackgroundOperationPriorityEnum backgroundOperationPriority;

    private Long allocGranularity;

  
  /**
   * The number of drives reserved for reconstruction of failed drives.
   **/
  public DiskPoolData reconstructionReservedDriveCount(Integer reconstructionReservedDriveCount) {
    this.reconstructionReservedDriveCount = reconstructionReservedDriveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of drives reserved for reconstruction of failed drives.")
  @JsonProperty("reconstructionReservedDriveCount")
  public Integer getReconstructionReservedDriveCount() {
    return reconstructionReservedDriveCount;
  }
  
  public void setReconstructionReservedDriveCount(Integer reconstructionReservedDriveCount) {
    this.reconstructionReservedDriveCount = reconstructionReservedDriveCount;
  }

  
  /**
   * The pool capacity reserved to hold rebuild data (in bytes). This value is calculated from the reconstructionReservedDriveCount.
   **/
  public DiskPoolData reconstructionReservedAmt(Long reconstructionReservedAmt) {
    this.reconstructionReservedAmt = reconstructionReservedAmt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The pool capacity reserved to hold rebuild data (in bytes). This value is calculated from the reconstructionReservedDriveCount.")
  @JsonProperty("reconstructionReservedAmt")
  public Long getReconstructionReservedAmt() {
    return reconstructionReservedAmt;
  }
  
  public void setReconstructionReservedAmt(Long reconstructionReservedAmt) {
    this.reconstructionReservedAmt = reconstructionReservedAmt;
  }

  
  /**
   * The reserved capacity that is currently available to hold rebuilt data (dynamic). If all of the reserved capacity is available, then this value will equal the reconstructionReservedDriveCount.
   **/
  public DiskPoolData reconstructionReservedDriveCountCurrent(Integer reconstructionReservedDriveCountCurrent) {
    this.reconstructionReservedDriveCountCurrent = reconstructionReservedDriveCountCurrent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reserved capacity that is currently available to hold rebuilt data (dynamic). If all of the reserved capacity is available, then this value will equal the reconstructionReservedDriveCount.")
  @JsonProperty("reconstructionReservedDriveCountCurrent")
  public Integer getReconstructionReservedDriveCountCurrent() {
    return reconstructionReservedDriveCountCurrent;
  }
  
  public void setReconstructionReservedDriveCountCurrent(Integer reconstructionReservedDriveCountCurrent) {
    this.reconstructionReservedDriveCountCurrent = reconstructionReservedDriveCountCurrent;
  }

  
  /**
   * The pool utilization warning threshold as a percentage of the total user configurable capacity. A MEL event is generated when the configured capacity exceeds the specified level of the configurable capacity.
   **/
  public DiskPoolData poolUtilizationWarningThreshold(Integer poolUtilizationWarningThreshold) {
    this.poolUtilizationWarningThreshold = poolUtilizationWarningThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The pool utilization warning threshold as a percentage of the total user configurable capacity. A MEL event is generated when the configured capacity exceeds the specified level of the configurable capacity.")
  @JsonProperty("poolUtilizationWarningThreshold")
  public Integer getPoolUtilizationWarningThreshold() {
    return poolUtilizationWarningThreshold;
  }
  
  public void setPoolUtilizationWarningThreshold(Integer poolUtilizationWarningThreshold) {
    this.poolUtilizationWarningThreshold = poolUtilizationWarningThreshold;
  }

  
  /**
   * The pool utilization critical threshold as a percentage of the total user configurable capacity. A MEL event is generated when the configured capacity exceeds the specified level of the configurable capacity.
   **/
  public DiskPoolData poolUtilizationCriticalThreshold(Integer poolUtilizationCriticalThreshold) {
    this.poolUtilizationCriticalThreshold = poolUtilizationCriticalThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The pool utilization critical threshold as a percentage of the total user configurable capacity. A MEL event is generated when the configured capacity exceeds the specified level of the configurable capacity.")
  @JsonProperty("poolUtilizationCriticalThreshold")
  public Integer getPoolUtilizationCriticalThreshold() {
    return poolUtilizationCriticalThreshold;
  }
  
  public void setPoolUtilizationCriticalThreshold(Integer poolUtilizationCriticalThreshold) {
    this.poolUtilizationCriticalThreshold = poolUtilizationCriticalThreshold;
  }

  
  /**
   * The Disk pool state set based on state of the threshold.
   **/
  public DiskPoolData poolUtilizationState(PoolUtilizationStateEnum poolUtilizationState) {
    this.poolUtilizationState = poolUtilizationState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Disk pool state set based on state of the threshold.")
  @JsonProperty("poolUtilizationState")
  public PoolUtilizationStateEnum getPoolUtilizationState() {
    return poolUtilizationState;
  }
  
  public void setPoolUtilizationState(PoolUtilizationStateEnum poolUtilizationState) {
    this.poolUtilizationState = poolUtilizationState;
  }

  
  /**
   * This value identifies how much capacity (in bytes) is being wasted due to a mix of drive sizes. This value will be zero as long as the pool consists of like drive sizes.
   **/
  public DiskPoolData unusableCapacity(Long unusableCapacity) {
    this.unusableCapacity = unusableCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value identifies how much capacity (in bytes) is being wasted due to a mix of drive sizes. This value will be zero as long as the pool consists of like drive sizes.")
  @JsonProperty("unusableCapacity")
  public Long getUnusableCapacity() {
    return unusableCapacity;
  }
  
  public void setUnusableCapacity(Long unusableCapacity) {
    this.unusableCapacity = unusableCapacity;
  }

  
  /**
   * One failed drive degraded reconstruction priority.
   **/
  public DiskPoolData degradedReconstructPriority(DegradedReconstructPriorityEnum degradedReconstructPriority) {
    this.degradedReconstructPriority = degradedReconstructPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "One failed drive degraded reconstruction priority.")
  @JsonProperty("degradedReconstructPriority")
  public DegradedReconstructPriorityEnum getDegradedReconstructPriority() {
    return degradedReconstructPriority;
  }
  
  public void setDegradedReconstructPriority(DegradedReconstructPriorityEnum degradedReconstructPriority) {
    this.degradedReconstructPriority = degradedReconstructPriority;
  }

  
  /**
   * Two failed drive reconstruction critical priority.
   **/
  public DiskPoolData criticalReconstructPriority(CriticalReconstructPriorityEnum criticalReconstructPriority) {
    this.criticalReconstructPriority = criticalReconstructPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Two failed drive reconstruction critical priority.")
  @JsonProperty("criticalReconstructPriority")
  public CriticalReconstructPriorityEnum getCriticalReconstructPriority() {
    return criticalReconstructPriority;
  }
  
  public void setCriticalReconstructPriority(CriticalReconstructPriorityEnum criticalReconstructPriority) {
    this.criticalReconstructPriority = criticalReconstructPriority;
  }

  
  /**
   * Priority of other background operations (DVE,DCE,DCR, and IAF).
   **/
  public DiskPoolData backgroundOperationPriority(BackgroundOperationPriorityEnum backgroundOperationPriority) {
    this.backgroundOperationPriority = backgroundOperationPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Priority of other background operations (DVE,DCE,DCR, and IAF).")
  @JsonProperty("backgroundOperationPriority")
  public BackgroundOperationPriorityEnum getBackgroundOperationPriority() {
    return backgroundOperationPriority;
  }
  
  public void setBackgroundOperationPriority(BackgroundOperationPriorityEnum backgroundOperationPriority) {
    this.backgroundOperationPriority = backgroundOperationPriority;
  }

  
  /**
   * The allocation granularity (in bytes) for volumes in a disk pool.
   **/
  public DiskPoolData allocGranularity(Long allocGranularity) {
    this.allocGranularity = allocGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The allocation granularity (in bytes) for volumes in a disk pool.")
  @JsonProperty("allocGranularity")
  public Long getAllocGranularity() {
    return allocGranularity;
  }
  
  public void setAllocGranularity(Long allocGranularity) {
    this.allocGranularity = allocGranularity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskPoolData diskPoolData = (DiskPoolData) o;
    return Objects.equals(this.reconstructionReservedDriveCount, diskPoolData.reconstructionReservedDriveCount) &&
        Objects.equals(this.reconstructionReservedAmt, diskPoolData.reconstructionReservedAmt) &&
        Objects.equals(this.reconstructionReservedDriveCountCurrent, diskPoolData.reconstructionReservedDriveCountCurrent) &&
        Objects.equals(this.poolUtilizationWarningThreshold, diskPoolData.poolUtilizationWarningThreshold) &&
        Objects.equals(this.poolUtilizationCriticalThreshold, diskPoolData.poolUtilizationCriticalThreshold) &&
        Objects.equals(this.poolUtilizationState, diskPoolData.poolUtilizationState) &&
        Objects.equals(this.unusableCapacity, diskPoolData.unusableCapacity) &&
        Objects.equals(this.degradedReconstructPriority, diskPoolData.degradedReconstructPriority) &&
        Objects.equals(this.criticalReconstructPriority, diskPoolData.criticalReconstructPriority) &&
        Objects.equals(this.backgroundOperationPriority, diskPoolData.backgroundOperationPriority) &&
        Objects.equals(this.allocGranularity, diskPoolData.allocGranularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reconstructionReservedDriveCount, reconstructionReservedAmt, reconstructionReservedDriveCountCurrent, poolUtilizationWarningThreshold, poolUtilizationCriticalThreshold, poolUtilizationState, unusableCapacity, degradedReconstructPriority, criticalReconstructPriority, backgroundOperationPriority, allocGranularity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskPoolData {\n");
    
    sb.append("    reconstructionReservedDriveCount: ").append(toIndentedString(reconstructionReservedDriveCount)).append("\n");
    sb.append("    reconstructionReservedAmt: ").append(toIndentedString(reconstructionReservedAmt)).append("\n");
    sb.append("    reconstructionReservedDriveCountCurrent: ").append(toIndentedString(reconstructionReservedDriveCountCurrent)).append("\n");
    sb.append("    poolUtilizationWarningThreshold: ").append(toIndentedString(poolUtilizationWarningThreshold)).append("\n");
    sb.append("    poolUtilizationCriticalThreshold: ").append(toIndentedString(poolUtilizationCriticalThreshold)).append("\n");
    sb.append("    poolUtilizationState: ").append(toIndentedString(poolUtilizationState)).append("\n");
    sb.append("    unusableCapacity: ").append(toIndentedString(unusableCapacity)).append("\n");
    sb.append("    degradedReconstructPriority: ").append(toIndentedString(degradedReconstructPriority)).append("\n");
    sb.append("    criticalReconstructPriority: ").append(toIndentedString(criticalReconstructPriority)).append("\n");
    sb.append("    backgroundOperationPriority: ").append(toIndentedString(backgroundOperationPriority)).append("\n");
    sb.append("    allocGranularity: ").append(toIndentedString(allocGranularity)).append("\n");
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

