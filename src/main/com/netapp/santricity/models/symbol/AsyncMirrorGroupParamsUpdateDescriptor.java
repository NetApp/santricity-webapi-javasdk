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
 * AsyncMirrorGroupParamsUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AsyncMirrorGroupParamsUpdateDescriptor   {
  
    private String groupLabel;

    private Integer syncIntervalMinutes;

    private Integer syncCompletionTimeAlertThresholdMinutes;

    private Integer recoveryPointAgeAlertThresholdMinutes;

    private Integer repositoryUtilizationWarnThreshold;

    private String groupRef;

  
  /**
   * The user defined label for the mirror group.
   **/
  public AsyncMirrorGroupParamsUpdateDescriptor groupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user defined label for the mirror group.")
  @JsonProperty("groupLabel")
  public String getGroupLabel() {
    return groupLabel;
  }
  
  public void setGroupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
  }

  
  /**
   * The synchronization interval (in minutes).
   **/
  public AsyncMirrorGroupParamsUpdateDescriptor syncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The synchronization interval (in minutes).")
  @JsonProperty("syncIntervalMinutes")
  public Integer getSyncIntervalMinutes() {
    return syncIntervalMinutes;
  }
  
  public void setSyncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
  }

  
  /**
   * The threshold (in minutes) for notifying the user that periodic synchronization has taken too long to complete.
   **/
  public AsyncMirrorGroupParamsUpdateDescriptor syncCompletionTimeAlertThresholdMinutes(Integer syncCompletionTimeAlertThresholdMinutes) {
    this.syncCompletionTimeAlertThresholdMinutes = syncCompletionTimeAlertThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The threshold (in minutes) for notifying the user that periodic synchronization has taken too long to complete.")
  @JsonProperty("syncCompletionTimeAlertThresholdMinutes")
  public Integer getSyncCompletionTimeAlertThresholdMinutes() {
    return syncCompletionTimeAlertThresholdMinutes;
  }
  
  public void setSyncCompletionTimeAlertThresholdMinutes(Integer syncCompletionTimeAlertThresholdMinutes) {
    this.syncCompletionTimeAlertThresholdMinutes = syncCompletionTimeAlertThresholdMinutes;
  }

  
  /**
   * The recovery point age objective (in minutes). The user is notified via needs-attention when age of last good recovery point exceeds this value.
   **/
  public AsyncMirrorGroupParamsUpdateDescriptor recoveryPointAgeAlertThresholdMinutes(Integer recoveryPointAgeAlertThresholdMinutes) {
    this.recoveryPointAgeAlertThresholdMinutes = recoveryPointAgeAlertThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recovery point age objective (in minutes). The user is notified via needs-attention when age of last good recovery point exceeds this value.")
  @JsonProperty("recoveryPointAgeAlertThresholdMinutes")
  public Integer getRecoveryPointAgeAlertThresholdMinutes() {
    return recoveryPointAgeAlertThresholdMinutes;
  }
  
  public void setRecoveryPointAgeAlertThresholdMinutes(Integer recoveryPointAgeAlertThresholdMinutes) {
    this.recoveryPointAgeAlertThresholdMinutes = recoveryPointAgeAlertThresholdMinutes;
  }

  
  /**
   * The repository utilization warning threshold (0-100 percent). A needs attention condition will be generated if percent of repository capacity currently utilized exceeds this threshold.
   **/
  public AsyncMirrorGroupParamsUpdateDescriptor repositoryUtilizationWarnThreshold(Integer repositoryUtilizationWarnThreshold) {
    this.repositoryUtilizationWarnThreshold = repositoryUtilizationWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold (0-100 percent). A needs attention condition will be generated if percent of repository capacity currently utilized exceeds this threshold.")
  @JsonProperty("repositoryUtilizationWarnThreshold")
  public Integer getRepositoryUtilizationWarnThreshold() {
    return repositoryUtilizationWarnThreshold;
  }
  
  public void setRepositoryUtilizationWarnThreshold(Integer repositoryUtilizationWarnThreshold) {
    this.repositoryUtilizationWarnThreshold = repositoryUtilizationWarnThreshold;
  }

  
  /**
   * A reference to the Async Mirror Group whose parameters are being updated.
   **/
  public AsyncMirrorGroupParamsUpdateDescriptor groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the Async Mirror Group whose parameters are being updated.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupParamsUpdateDescriptor asyncMirrorGroupParamsUpdateDescriptor = (AsyncMirrorGroupParamsUpdateDescriptor) o;
    return Objects.equals(this.groupLabel, asyncMirrorGroupParamsUpdateDescriptor.groupLabel) &&
        Objects.equals(this.syncIntervalMinutes, asyncMirrorGroupParamsUpdateDescriptor.syncIntervalMinutes) &&
        Objects.equals(this.syncCompletionTimeAlertThresholdMinutes, asyncMirrorGroupParamsUpdateDescriptor.syncCompletionTimeAlertThresholdMinutes) &&
        Objects.equals(this.recoveryPointAgeAlertThresholdMinutes, asyncMirrorGroupParamsUpdateDescriptor.recoveryPointAgeAlertThresholdMinutes) &&
        Objects.equals(this.repositoryUtilizationWarnThreshold, asyncMirrorGroupParamsUpdateDescriptor.repositoryUtilizationWarnThreshold) &&
        Objects.equals(this.groupRef, asyncMirrorGroupParamsUpdateDescriptor.groupRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupLabel, syncIntervalMinutes, syncCompletionTimeAlertThresholdMinutes, recoveryPointAgeAlertThresholdMinutes, repositoryUtilizationWarnThreshold, groupRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupParamsUpdateDescriptor {\n");
    
    sb.append("    groupLabel: ").append(toIndentedString(groupLabel)).append("\n");
    sb.append("    syncIntervalMinutes: ").append(toIndentedString(syncIntervalMinutes)).append("\n");
    sb.append("    syncCompletionTimeAlertThresholdMinutes: ").append(toIndentedString(syncCompletionTimeAlertThresholdMinutes)).append("\n");
    sb.append("    recoveryPointAgeAlertThresholdMinutes: ").append(toIndentedString(recoveryPointAgeAlertThresholdMinutes)).append("\n");
    sb.append("    repositoryUtilizationWarnThreshold: ").append(toIndentedString(repositoryUtilizationWarnThreshold)).append("\n");
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
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

