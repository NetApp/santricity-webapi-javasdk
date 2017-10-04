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
 * DiskPoolCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DiskPoolCreationDescriptor   {
  
    private VolumeCandidate candidate;

    private String label;

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

  
  /**
   * This field must contain a Volume candidate that was returned by getVolumeCandidates.
   **/
  public DiskPoolCreationDescriptor candidate(VolumeCandidate candidate) {
    this.candidate = candidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field must contain a Volume candidate that was returned by getVolumeCandidates.")
  @JsonProperty("candidate")
  public VolumeCandidate getCandidate() {
    return candidate;
  }
  
  public void setCandidate(VolumeCandidate candidate) {
    this.candidate = candidate;
  }

  
  /**
   * The label string for the new Volume Group.
   **/
  public DiskPoolCreationDescriptor label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The label string for the new Volume Group.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The pool utilization warning capacity as a percentage of the total user configurable capacity. A MEL event is generated when the configured capacity exceeds the specified level of the configurable capacity.
   **/
  public DiskPoolCreationDescriptor poolUtilizationWarningThreshold(Integer poolUtilizationWarningThreshold) {
    this.poolUtilizationWarningThreshold = poolUtilizationWarningThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The pool utilization warning capacity as a percentage of the total user configurable capacity. A MEL event is generated when the configured capacity exceeds the specified level of the configurable capacity.")
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
  public DiskPoolCreationDescriptor poolUtilizationCriticalThreshold(Integer poolUtilizationCriticalThreshold) {
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
  public DiskPoolCreationDescriptor degradedReconstructPriority(DegradedReconstructPriorityEnum degradedReconstructPriority) {
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
  public DiskPoolCreationDescriptor criticalReconstructPriority(CriticalReconstructPriorityEnum criticalReconstructPriority) {
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
  public DiskPoolCreationDescriptor backgroundOperationPriority(BackgroundOperationPriorityEnum backgroundOperationPriority) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskPoolCreationDescriptor diskPoolCreationDescriptor = (DiskPoolCreationDescriptor) o;
    return Objects.equals(this.candidate, diskPoolCreationDescriptor.candidate) &&
        Objects.equals(this.label, diskPoolCreationDescriptor.label) &&
        Objects.equals(this.poolUtilizationWarningThreshold, diskPoolCreationDescriptor.poolUtilizationWarningThreshold) &&
        Objects.equals(this.poolUtilizationCriticalThreshold, diskPoolCreationDescriptor.poolUtilizationCriticalThreshold) &&
        Objects.equals(this.degradedReconstructPriority, diskPoolCreationDescriptor.degradedReconstructPriority) &&
        Objects.equals(this.criticalReconstructPriority, diskPoolCreationDescriptor.criticalReconstructPriority) &&
        Objects.equals(this.backgroundOperationPriority, diskPoolCreationDescriptor.backgroundOperationPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidate, label, poolUtilizationWarningThreshold, poolUtilizationCriticalThreshold, degradedReconstructPriority, criticalReconstructPriority, backgroundOperationPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskPoolCreationDescriptor {\n");
    
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    poolUtilizationWarningThreshold: ").append(toIndentedString(poolUtilizationWarningThreshold)).append("\n");
    sb.append("    poolUtilizationCriticalThreshold: ").append(toIndentedString(poolUtilizationCriticalThreshold)).append("\n");
    sb.append("    degradedReconstructPriority: ").append(toIndentedString(degradedReconstructPriority)).append("\n");
    sb.append("    criticalReconstructPriority: ").append(toIndentedString(criticalReconstructPriority)).append("\n");
    sb.append("    backgroundOperationPriority: ").append(toIndentedString(backgroundOperationPriority)).append("\n");
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

