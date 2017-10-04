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
 * AsyncMirrorGroupSyncProgress
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class AsyncMirrorGroupSyncProgress   {
  
    private Integer groupPercentComplete;

    private Integer groupTimeToCompletion;

    private Long groupSyncBytes;

    private String groupRef;

    private List<AsyncMirrorGroupMemberSyncProgress> memberProgress;

    private Long groupTrackingBytes;

  
  /**
   * Completion percentage for the operation across the entire group. If synchronization is not currently running this value will be equal to PERCENT_COMPLETE_OP_NOT_RUNNING.
   **/
  public AsyncMirrorGroupSyncProgress groupPercentComplete(Integer groupPercentComplete) {
    this.groupPercentComplete = groupPercentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Completion percentage for the operation across the entire group. If synchronization is not currently running this value will be equal to PERCENT_COMPLETE_OP_NOT_RUNNING.")
  @JsonProperty("groupPercentComplete")
  public Integer getGroupPercentComplete() {
    return groupPercentComplete;
  }
  
  public void setGroupPercentComplete(Integer groupPercentComplete) {
    this.groupPercentComplete = groupPercentComplete;
  }

  
  /**
   * Estimated time to completion in minutes for all members in the group that are undergoing synchronization. If the time is not known this value will be equal to TIME_TO_COMPLETION_UNKNOWN.
   **/
  public AsyncMirrorGroupSyncProgress groupTimeToCompletion(Integer groupTimeToCompletion) {
    this.groupTimeToCompletion = groupTimeToCompletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Estimated time to completion in minutes for all members in the group that are undergoing synchronization. If the time is not known this value will be equal to TIME_TO_COMPLETION_UNKNOWN.")
  @JsonProperty("groupTimeToCompletion")
  public Integer getGroupTimeToCompletion() {
    return groupTimeToCompletion;
  }
  
  public void setGroupTimeToCompletion(Integer groupTimeToCompletion) {
    this.groupTimeToCompletion = groupTimeToCompletion;
  }

  
  /**
   * Amount of data that needs to be synchronized for the entire group.
   **/
  public AsyncMirrorGroupSyncProgress groupSyncBytes(Long groupSyncBytes) {
    this.groupSyncBytes = groupSyncBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Amount of data that needs to be synchronized for the entire group.")
  @JsonProperty("groupSyncBytes")
  public Long getGroupSyncBytes() {
    return groupSyncBytes;
  }
  
  public void setGroupSyncBytes(Long groupSyncBytes) {
    this.groupSyncBytes = groupSyncBytes;
  }

  
  /**
   * Reference to the async mirror group.
   **/
  public AsyncMirrorGroupSyncProgress groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to the async mirror group.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * List of progress information for each mirror group member.
   **/
  public AsyncMirrorGroupSyncProgress memberProgress(List<AsyncMirrorGroupMemberSyncProgress> memberProgress) {
    this.memberProgress = memberProgress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of progress information for each mirror group member.")
  @JsonProperty("memberProgress")
  public List<AsyncMirrorGroupMemberSyncProgress> getMemberProgress() {
    return memberProgress;
  }
  
  public void setMemberProgress(List<AsyncMirrorGroupMemberSyncProgress> memberProgress) {
    this.memberProgress = memberProgress;
  }

  
  /**
   * The amount of data (in bytes) marked as unsynchronized in the tracking delta logs for the entire group.
   **/
  public AsyncMirrorGroupSyncProgress groupTrackingBytes(Long groupTrackingBytes) {
    this.groupTrackingBytes = groupTrackingBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of data (in bytes) marked as unsynchronized in the tracking delta logs for the entire group.")
  @JsonProperty("groupTrackingBytes")
  public Long getGroupTrackingBytes() {
    return groupTrackingBytes;
  }
  
  public void setGroupTrackingBytes(Long groupTrackingBytes) {
    this.groupTrackingBytes = groupTrackingBytes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupSyncProgress asyncMirrorGroupSyncProgress = (AsyncMirrorGroupSyncProgress) o;
    return Objects.equals(this.groupPercentComplete, asyncMirrorGroupSyncProgress.groupPercentComplete) &&
        Objects.equals(this.groupTimeToCompletion, asyncMirrorGroupSyncProgress.groupTimeToCompletion) &&
        Objects.equals(this.groupSyncBytes, asyncMirrorGroupSyncProgress.groupSyncBytes) &&
        Objects.equals(this.groupRef, asyncMirrorGroupSyncProgress.groupRef) &&
        Objects.equals(this.memberProgress, asyncMirrorGroupSyncProgress.memberProgress) &&
        Objects.equals(this.groupTrackingBytes, asyncMirrorGroupSyncProgress.groupTrackingBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupPercentComplete, groupTimeToCompletion, groupSyncBytes, groupRef, memberProgress, groupTrackingBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupSyncProgress {\n");
    
    sb.append("    groupPercentComplete: ").append(toIndentedString(groupPercentComplete)).append("\n");
    sb.append("    groupTimeToCompletion: ").append(toIndentedString(groupTimeToCompletion)).append("\n");
    sb.append("    groupSyncBytes: ").append(toIndentedString(groupSyncBytes)).append("\n");
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    memberProgress: ").append(toIndentedString(memberProgress)).append("\n");
    sb.append("    groupTrackingBytes: ").append(toIndentedString(groupTrackingBytes)).append("\n");
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

