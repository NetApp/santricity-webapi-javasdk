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
 * DiskPoolDefaultAttributes
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DiskPoolDefaultAttributes   {
  
    private Integer poolUtilizationWarningThreshold;

    private Integer poolUtilizationCriticalThreshold;


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

    private Long maxVolumeSizeInMegabytes;

    private Integer maxDCEDriveCount;

    private Long reposGranularity;

    private Long maxTotalDiskPoolSupportInMegabytes;

    private Long maxVolumeSynchronousCreationInMegabytes;

    private Integer maxDCRDriveCount;

    private Integer minimumDriveCount;

  
  /**
   * The pool utilization warning threshold as a percentage of the total user configurable capacity. A MEL event is generated when the configured capacity exceeds the specified level of the configurable capacity.
   **/
  public DiskPoolDefaultAttributes poolUtilizationWarningThreshold(Integer poolUtilizationWarningThreshold) {
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
  public DiskPoolDefaultAttributes poolUtilizationCriticalThreshold(Integer poolUtilizationCriticalThreshold) {
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
   * One failed drive degraded reconstruction priority.
   **/
  public DiskPoolDefaultAttributes degradedReconstructPriority(DegradedReconstructPriorityEnum degradedReconstructPriority) {
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
  public DiskPoolDefaultAttributes criticalReconstructPriority(CriticalReconstructPriorityEnum criticalReconstructPriority) {
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
  public DiskPoolDefaultAttributes backgroundOperationPriority(BackgroundOperationPriorityEnum backgroundOperationPriority) {
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
   * The maximum volume size (in megabytes) for disk pools.
   **/
  public DiskPoolDefaultAttributes maxVolumeSizeInMegabytes(Long maxVolumeSizeInMegabytes) {
    this.maxVolumeSizeInMegabytes = maxVolumeSizeInMegabytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum volume size (in megabytes) for disk pools.")
  @JsonProperty("maxVolumeSizeInMegabytes")
  public Long getMaxVolumeSizeInMegabytes() {
    return maxVolumeSizeInMegabytes;
  }
  
  public void setMaxVolumeSizeInMegabytes(Long maxVolumeSizeInMegabytes) {
    this.maxVolumeSizeInMegabytes = maxVolumeSizeInMegabytes;
  }

  
  /**
   * The maximum number of drives that can be used for Dynamic Capacity Expansion (DCE).
   **/
  public DiskPoolDefaultAttributes maxDCEDriveCount(Integer maxDCEDriveCount) {
    this.maxDCEDriveCount = maxDCEDriveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of drives that can be used for Dynamic Capacity Expansion (DCE).")
  @JsonProperty("maxDCEDriveCount")
  public Integer getMaxDCEDriveCount() {
    return maxDCEDriveCount;
  }
  
  public void setMaxDCEDriveCount(Integer maxDCEDriveCount) {
    this.maxDCEDriveCount = maxDCEDriveCount;
  }

  
  /**
   * The granularity (in bytes) of the volume capacity values that are allowed for any repository member volume allocated from disk pools.
   **/
  public DiskPoolDefaultAttributes reposGranularity(Long reposGranularity) {
    this.reposGranularity = reposGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The granularity (in bytes) of the volume capacity values that are allowed for any repository member volume allocated from disk pools.")
  @JsonProperty("reposGranularity")
  public Long getReposGranularity() {
    return reposGranularity;
  }
  
  public void setReposGranularity(Long reposGranularity) {
    this.reposGranularity = reposGranularity;
  }

  
  /**
   * The maximum total size for all disk pools.
   **/
  public DiskPoolDefaultAttributes maxTotalDiskPoolSupportInMegabytes(Long maxTotalDiskPoolSupportInMegabytes) {
    this.maxTotalDiskPoolSupportInMegabytes = maxTotalDiskPoolSupportInMegabytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum total size for all disk pools.")
  @JsonProperty("maxTotalDiskPoolSupportInMegabytes")
  public Long getMaxTotalDiskPoolSupportInMegabytes() {
    return maxTotalDiskPoolSupportInMegabytes;
  }
  
  public void setMaxTotalDiskPoolSupportInMegabytes(Long maxTotalDiskPoolSupportInMegabytes) {
    this.maxTotalDiskPoolSupportInMegabytes = maxTotalDiskPoolSupportInMegabytes;
  }

  
  /**
   * Volumes with a capacity this size or smaller are created synchronously (i.e. the volume definition is complete when the SYMbol command completes). Larger volumes are completed as a background operation. The state of the volume after the SYMbol command completes is \"creating\" until the background operation completes.
   **/
  public DiskPoolDefaultAttributes maxVolumeSynchronousCreationInMegabytes(Long maxVolumeSynchronousCreationInMegabytes) {
    this.maxVolumeSynchronousCreationInMegabytes = maxVolumeSynchronousCreationInMegabytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Volumes with a capacity this size or smaller are created synchronously (i.e. the volume definition is complete when the SYMbol command completes). Larger volumes are completed as a background operation. The state of the volume after the SYMbol command completes is \"creating\" until the background operation completes.")
  @JsonProperty("maxVolumeSynchronousCreationInMegabytes")
  public Long getMaxVolumeSynchronousCreationInMegabytes() {
    return maxVolumeSynchronousCreationInMegabytes;
  }
  
  public void setMaxVolumeSynchronousCreationInMegabytes(Long maxVolumeSynchronousCreationInMegabytes) {
    this.maxVolumeSynchronousCreationInMegabytes = maxVolumeSynchronousCreationInMegabytes;
  }

  
  /**
   * This element contains the maximum number of drives that can be removed in a Disk Capacity Reduction (DCR) operation.
   **/
  public DiskPoolDefaultAttributes maxDCRDriveCount(Integer maxDCRDriveCount) {
    this.maxDCRDriveCount = maxDCRDriveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This element contains the maximum number of drives that can be removed in a Disk Capacity Reduction (DCR) operation.")
  @JsonProperty("maxDCRDriveCount")
  public Integer getMaxDCRDriveCount() {
    return maxDCRDriveCount;
  }
  
  public void setMaxDCRDriveCount(Integer maxDCRDriveCount) {
    this.maxDCRDriveCount = maxDCRDriveCount;
  }

  
  /**
   * Minimum drive count required for defining a disk pool
   **/
  public DiskPoolDefaultAttributes minimumDriveCount(Integer minimumDriveCount) {
    this.minimumDriveCount = minimumDriveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum drive count required for defining a disk pool")
  @JsonProperty("minimumDriveCount")
  public Integer getMinimumDriveCount() {
    return minimumDriveCount;
  }
  
  public void setMinimumDriveCount(Integer minimumDriveCount) {
    this.minimumDriveCount = minimumDriveCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskPoolDefaultAttributes diskPoolDefaultAttributes = (DiskPoolDefaultAttributes) o;
    return Objects.equals(this.poolUtilizationWarningThreshold, diskPoolDefaultAttributes.poolUtilizationWarningThreshold) &&
        Objects.equals(this.poolUtilizationCriticalThreshold, diskPoolDefaultAttributes.poolUtilizationCriticalThreshold) &&
        Objects.equals(this.degradedReconstructPriority, diskPoolDefaultAttributes.degradedReconstructPriority) &&
        Objects.equals(this.criticalReconstructPriority, diskPoolDefaultAttributes.criticalReconstructPriority) &&
        Objects.equals(this.backgroundOperationPriority, diskPoolDefaultAttributes.backgroundOperationPriority) &&
        Objects.equals(this.maxVolumeSizeInMegabytes, diskPoolDefaultAttributes.maxVolumeSizeInMegabytes) &&
        Objects.equals(this.maxDCEDriveCount, diskPoolDefaultAttributes.maxDCEDriveCount) &&
        Objects.equals(this.reposGranularity, diskPoolDefaultAttributes.reposGranularity) &&
        Objects.equals(this.maxTotalDiskPoolSupportInMegabytes, diskPoolDefaultAttributes.maxTotalDiskPoolSupportInMegabytes) &&
        Objects.equals(this.maxVolumeSynchronousCreationInMegabytes, diskPoolDefaultAttributes.maxVolumeSynchronousCreationInMegabytes) &&
        Objects.equals(this.maxDCRDriveCount, diskPoolDefaultAttributes.maxDCRDriveCount) &&
        Objects.equals(this.minimumDriveCount, diskPoolDefaultAttributes.minimumDriveCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolUtilizationWarningThreshold, poolUtilizationCriticalThreshold, degradedReconstructPriority, criticalReconstructPriority, backgroundOperationPriority, maxVolumeSizeInMegabytes, maxDCEDriveCount, reposGranularity, maxTotalDiskPoolSupportInMegabytes, maxVolumeSynchronousCreationInMegabytes, maxDCRDriveCount, minimumDriveCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskPoolDefaultAttributes {\n");
    
    sb.append("    poolUtilizationWarningThreshold: ").append(toIndentedString(poolUtilizationWarningThreshold)).append("\n");
    sb.append("    poolUtilizationCriticalThreshold: ").append(toIndentedString(poolUtilizationCriticalThreshold)).append("\n");
    sb.append("    degradedReconstructPriority: ").append(toIndentedString(degradedReconstructPriority)).append("\n");
    sb.append("    criticalReconstructPriority: ").append(toIndentedString(criticalReconstructPriority)).append("\n");
    sb.append("    backgroundOperationPriority: ").append(toIndentedString(backgroundOperationPriority)).append("\n");
    sb.append("    maxVolumeSizeInMegabytes: ").append(toIndentedString(maxVolumeSizeInMegabytes)).append("\n");
    sb.append("    maxDCEDriveCount: ").append(toIndentedString(maxDCEDriveCount)).append("\n");
    sb.append("    reposGranularity: ").append(toIndentedString(reposGranularity)).append("\n");
    sb.append("    maxTotalDiskPoolSupportInMegabytes: ").append(toIndentedString(maxTotalDiskPoolSupportInMegabytes)).append("\n");
    sb.append("    maxVolumeSynchronousCreationInMegabytes: ").append(toIndentedString(maxVolumeSynchronousCreationInMegabytes)).append("\n");
    sb.append("    maxDCRDriveCount: ").append(toIndentedString(maxDCRDriveCount)).append("\n");
    sb.append("    minimumDriveCount: ").append(toIndentedString(minimumDriveCount)).append("\n");
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

