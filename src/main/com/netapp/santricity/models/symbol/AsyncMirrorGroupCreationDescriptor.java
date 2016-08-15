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
 * AsyncMirrorGroupCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AsyncMirrorGroupCreationDescriptor   {
  
    private AsyncMirrorGroupMirrorConnectionDescriptor connectionDescriptor;

    private String groupLabel;

    private Integer syncIntervalMinutes;

    private Integer syncCompletionTimeAlertThresholdMinutes;

    private Integer recoveryPointAgeAlertThresholdMinutes;

    private Integer repositoryUtilizationWarnThreshold;

    private RemoteArrayAuthenticator remotePassword;

  
  /**
   * A reference to an existing Remote Target or candidate information to create a new Remote Target.
   **/
  public AsyncMirrorGroupCreationDescriptor connectionDescriptor(AsyncMirrorGroupMirrorConnectionDescriptor connectionDescriptor) {
    this.connectionDescriptor = connectionDescriptor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to an existing Remote Target or candidate information to create a new Remote Target.")
  @JsonProperty("connectionDescriptor")
  public AsyncMirrorGroupMirrorConnectionDescriptor getConnectionDescriptor() {
    return connectionDescriptor;
  }
  
  public void setConnectionDescriptor(AsyncMirrorGroupMirrorConnectionDescriptor connectionDescriptor) {
    this.connectionDescriptor = connectionDescriptor;
  }

  
  /**
   * A user defined label for the new mirror group.
   **/
  public AsyncMirrorGroupCreationDescriptor groupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A user defined label for the new mirror group.")
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
  public AsyncMirrorGroupCreationDescriptor syncIntervalMinutes(Integer syncIntervalMinutes) {
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
  public AsyncMirrorGroupCreationDescriptor syncCompletionTimeAlertThresholdMinutes(Integer syncCompletionTimeAlertThresholdMinutes) {
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
   * The recovery point age objective (in minutes). The user is notified via needs-attention when the age of the last good recovery point exceeds this value.
   **/
  public AsyncMirrorGroupCreationDescriptor recoveryPointAgeAlertThresholdMinutes(Integer recoveryPointAgeAlertThresholdMinutes) {
    this.recoveryPointAgeAlertThresholdMinutes = recoveryPointAgeAlertThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recovery point age objective (in minutes). The user is notified via needs-attention when the age of the last good recovery point exceeds this value.")
  @JsonProperty("recoveryPointAgeAlertThresholdMinutes")
  public Integer getRecoveryPointAgeAlertThresholdMinutes() {
    return recoveryPointAgeAlertThresholdMinutes;
  }
  
  public void setRecoveryPointAgeAlertThresholdMinutes(Integer recoveryPointAgeAlertThresholdMinutes) {
    this.recoveryPointAgeAlertThresholdMinutes = recoveryPointAgeAlertThresholdMinutes;
  }

  
  /**
   * The repository utilization warning threshold (0-100 percent). A needs attention condition will be generated if the percent of repository capacity currently utilized exceeds this threshold.
   **/
  public AsyncMirrorGroupCreationDescriptor repositoryUtilizationWarnThreshold(Integer repositoryUtilizationWarnThreshold) {
    this.repositoryUtilizationWarnThreshold = repositoryUtilizationWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold (0-100 percent). A needs attention condition will be generated if the percent of repository capacity currently utilized exceeds this threshold.")
  @JsonProperty("repositoryUtilizationWarnThreshold")
  public Integer getRepositoryUtilizationWarnThreshold() {
    return repositoryUtilizationWarnThreshold;
  }
  
  public void setRepositoryUtilizationWarnThreshold(Integer repositoryUtilizationWarnThreshold) {
    this.repositoryUtilizationWarnThreshold = repositoryUtilizationWarnThreshold;
  }

  
  /**
   * The password for remote array. This is required to make sure the SYMbol client has authenticated the users access privileges to both the primary and secondary array.
   **/
  public AsyncMirrorGroupCreationDescriptor remotePassword(RemoteArrayAuthenticator remotePassword) {
    this.remotePassword = remotePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The password for remote array. This is required to make sure the SYMbol client has authenticated the users access privileges to both the primary and secondary array.")
  @JsonProperty("remotePassword")
  public RemoteArrayAuthenticator getRemotePassword() {
    return remotePassword;
  }
  
  public void setRemotePassword(RemoteArrayAuthenticator remotePassword) {
    this.remotePassword = remotePassword;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupCreationDescriptor asyncMirrorGroupCreationDescriptor = (AsyncMirrorGroupCreationDescriptor) o;
    return Objects.equals(this.connectionDescriptor, asyncMirrorGroupCreationDescriptor.connectionDescriptor) &&
        Objects.equals(this.groupLabel, asyncMirrorGroupCreationDescriptor.groupLabel) &&
        Objects.equals(this.syncIntervalMinutes, asyncMirrorGroupCreationDescriptor.syncIntervalMinutes) &&
        Objects.equals(this.syncCompletionTimeAlertThresholdMinutes, asyncMirrorGroupCreationDescriptor.syncCompletionTimeAlertThresholdMinutes) &&
        Objects.equals(this.recoveryPointAgeAlertThresholdMinutes, asyncMirrorGroupCreationDescriptor.recoveryPointAgeAlertThresholdMinutes) &&
        Objects.equals(this.repositoryUtilizationWarnThreshold, asyncMirrorGroupCreationDescriptor.repositoryUtilizationWarnThreshold) &&
        Objects.equals(this.remotePassword, asyncMirrorGroupCreationDescriptor.remotePassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionDescriptor, groupLabel, syncIntervalMinutes, syncCompletionTimeAlertThresholdMinutes, recoveryPointAgeAlertThresholdMinutes, repositoryUtilizationWarnThreshold, remotePassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupCreationDescriptor {\n");
    
    sb.append("    connectionDescriptor: ").append(toIndentedString(connectionDescriptor)).append("\n");
    sb.append("    groupLabel: ").append(toIndentedString(groupLabel)).append("\n");
    sb.append("    syncIntervalMinutes: ").append(toIndentedString(syncIntervalMinutes)).append("\n");
    sb.append("    syncCompletionTimeAlertThresholdMinutes: ").append(toIndentedString(syncCompletionTimeAlertThresholdMinutes)).append("\n");
    sb.append("    recoveryPointAgeAlertThresholdMinutes: ").append(toIndentedString(recoveryPointAgeAlertThresholdMinutes)).append("\n");
    sb.append("    repositoryUtilizationWarnThreshold: ").append(toIndentedString(repositoryUtilizationWarnThreshold)).append("\n");
    sb.append("    remotePassword: ").append(toIndentedString(remotePassword)).append("\n");
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

