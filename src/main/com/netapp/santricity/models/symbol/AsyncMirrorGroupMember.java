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
 * AsyncMirrorGroupMember
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class AsyncMirrorGroupMember   {
  
    private String memberRef;

    private String mirrorGroup;

    private String localVolume;

    private String remoteVolume;


  /**
   * The state of this mirror relationship (as known by this array).
   */
  public enum MemberStateEnum {
    unknown("unknown"),
    initialSync("initialSync"),
    optimal("optimal"),
    failed("failed"),
    incomplete("incomplete"),
    orphan("orphan"),
    stopped("stopped"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MemberStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MemberStateEnum memberState;

    private Long lastRecoveryPointTime;

    private Boolean overUtilizationWarnThreshold;

    private Long mirroredLocalCapacity;

    private String repositoryVolume;

    private String worldWideName;

    private Integer volumeHandle;

    private Boolean repositoryFull;

    private String id;

  
  /**
   * The reference (key) for the group member.
   **/
  public AsyncMirrorGroupMember memberRef(String memberRef) {
    this.memberRef = memberRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for the group member.")
  @JsonProperty("memberRef")
  public String getMemberRef() {
    return memberRef;
  }
  
  public void setMemberRef(String memberRef) {
    this.memberRef = memberRef;
  }

  
  /**
   * The AMG with which this member is associated.
   **/
  public AsyncMirrorGroupMember mirrorGroup(String mirrorGroup) {
    this.mirrorGroup = mirrorGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The AMG with which this member is associated.")
  @JsonProperty("mirrorGroup")
  public String getMirrorGroup() {
    return mirrorGroup;
  }
  
  public void setMirrorGroup(String mirrorGroup) {
    this.mirrorGroup = mirrorGroup;
  }

  
  /**
   * The local volume for this mirror. This is the volume being mirrored if the AMG role is primary, otherwise this is the target of mirror synchronization.
   **/
  public AsyncMirrorGroupMember localVolume(String localVolume) {
    this.localVolume = localVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The local volume for this mirror. This is the volume being mirrored if the AMG role is primary, otherwise this is the target of mirror synchronization.")
  @JsonProperty("localVolume")
  public String getLocalVolume() {
    return localVolume;
  }
  
  public void setLocalVolume(String localVolume) {
    this.localVolume = localVolume;
  }

  
  /**
   * The remote volume. This is the target of mirror synchronization on the remote array if the AMG role is primary, otherwise this is the volume on the remote array that is being mirrored.
   **/
  public AsyncMirrorGroupMember remoteVolume(String remoteVolume) {
    this.remoteVolume = remoteVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The remote volume. This is the target of mirror synchronization on the remote array if the AMG role is primary, otherwise this is the volume on the remote array that is being mirrored.")
  @JsonProperty("remoteVolume")
  public String getRemoteVolume() {
    return remoteVolume;
  }
  
  public void setRemoteVolume(String remoteVolume) {
    this.remoteVolume = remoteVolume;
  }

  
  /**
   * The state of this mirror relationship (as known by this array).
   **/
  public AsyncMirrorGroupMember memberState(MemberStateEnum memberState) {
    this.memberState = memberState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of this mirror relationship (as known by this array).")
  @JsonProperty("memberState")
  public MemberStateEnum getMemberState() {
    return memberState;
  }
  
  public void setMemberState(MemberStateEnum memberState) {
    this.memberState = memberState;
  }

  
  /**
   * The timestamp, represented in seconds since midnight GMT on January 1, 1970, of the last recovery point PiT on secondary. If no recovery point image exists, the value of this field will be ARVM_NO_RECOVERY_POINT_TIMESTAMP.
   **/
  public AsyncMirrorGroupMember lastRecoveryPointTime(Long lastRecoveryPointTime) {
    this.lastRecoveryPointTime = lastRecoveryPointTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp, represented in seconds since midnight GMT on January 1, 1970, of the last recovery point PiT on secondary. If no recovery point image exists, the value of this field will be ARVM_NO_RECOVERY_POINT_TIMESTAMP.")
  @JsonProperty("lastRecoveryPointTime")
  public Long getLastRecoveryPointTime() {
    return lastRecoveryPointTime;
  }
  
  public void setLastRecoveryPointTime(Long lastRecoveryPointTime) {
    this.lastRecoveryPointTime = lastRecoveryPointTime;
  }

  
  /**
   * If true, the repository capacity utilized is over the warning threshold.
   **/
  public AsyncMirrorGroupMember overUtilizationWarnThreshold(Boolean overUtilizationWarnThreshold) {
    this.overUtilizationWarnThreshold = overUtilizationWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the repository capacity utilized is over the warning threshold.")
  @JsonProperty("overUtilizationWarnThreshold")
  public Boolean getOverUtilizationWarnThreshold() {
    return overUtilizationWarnThreshold;
  }
  
  public void setOverUtilizationWarnThreshold(Boolean overUtilizationWarnThreshold) {
    this.overUtilizationWarnThreshold = overUtilizationWarnThreshold;
  }

  
  /**
   * The current local volume capacity that is being mirrored. This will be less than the actual local volume capacity if we have not yet reached a point where the next PiT can be taken and delta-logs resized (and until that point the expanded local capacity will not be opened up to host writes).
   **/
  public AsyncMirrorGroupMember mirroredLocalCapacity(Long mirroredLocalCapacity) {
    this.mirroredLocalCapacity = mirroredLocalCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current local volume capacity that is being mirrored. This will be less than the actual local volume capacity if we have not yet reached a point where the next PiT can be taken and delta-logs resized (and until that point the expanded local capacity will not be opened up to host writes).")
  @JsonProperty("mirroredLocalCapacity")
  public Long getMirroredLocalCapacity() {
    return mirroredLocalCapacity;
  }
  
  public void setMirroredLocalCapacity(Long mirroredLocalCapacity) {
    this.mirroredLocalCapacity = mirroredLocalCapacity;
  }

  
  /**
   * The metadata volume (Copy-on-Write / DeltaLog Repository) for this mirror.
   **/
  public AsyncMirrorGroupMember repositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metadata volume (Copy-on-Write / DeltaLog Repository) for this mirror.")
  @JsonProperty("repositoryVolume")
  public String getRepositoryVolume() {
    return repositoryVolume;
  }
  
  public void setRepositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
  }

  
  /**
   * The WWN of the async mirror proxy.
   **/
  public AsyncMirrorGroupMember worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the async mirror proxy.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The SSID of the async mirror proxy.
   **/
  public AsyncMirrorGroupMember volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SSID of the async mirror proxy.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * If true, the repository is full (100% of available capacity utilized).
   **/
  public AsyncMirrorGroupMember repositoryFull(Boolean repositoryFull) {
    this.repositoryFull = repositoryFull;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the repository is full (100% of available capacity utilized).")
  @JsonProperty("repositoryFull")
  public Boolean getRepositoryFull() {
    return repositoryFull;
  }
  
  public void setRepositoryFull(Boolean repositoryFull) {
    this.repositoryFull = repositoryFull;
  }

  
  /**
   **/
  public AsyncMirrorGroupMember id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupMember asyncMirrorGroupMember = (AsyncMirrorGroupMember) o;
    return Objects.equals(this.memberRef, asyncMirrorGroupMember.memberRef) &&
        Objects.equals(this.mirrorGroup, asyncMirrorGroupMember.mirrorGroup) &&
        Objects.equals(this.localVolume, asyncMirrorGroupMember.localVolume) &&
        Objects.equals(this.remoteVolume, asyncMirrorGroupMember.remoteVolume) &&
        Objects.equals(this.memberState, asyncMirrorGroupMember.memberState) &&
        Objects.equals(this.lastRecoveryPointTime, asyncMirrorGroupMember.lastRecoveryPointTime) &&
        Objects.equals(this.overUtilizationWarnThreshold, asyncMirrorGroupMember.overUtilizationWarnThreshold) &&
        Objects.equals(this.mirroredLocalCapacity, asyncMirrorGroupMember.mirroredLocalCapacity) &&
        Objects.equals(this.repositoryVolume, asyncMirrorGroupMember.repositoryVolume) &&
        Objects.equals(this.worldWideName, asyncMirrorGroupMember.worldWideName) &&
        Objects.equals(this.volumeHandle, asyncMirrorGroupMember.volumeHandle) &&
        Objects.equals(this.repositoryFull, asyncMirrorGroupMember.repositoryFull) &&
        Objects.equals(this.id, asyncMirrorGroupMember.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberRef, mirrorGroup, localVolume, remoteVolume, memberState, lastRecoveryPointTime, overUtilizationWarnThreshold, mirroredLocalCapacity, repositoryVolume, worldWideName, volumeHandle, repositoryFull, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupMember {\n");
    
    sb.append("    memberRef: ").append(toIndentedString(memberRef)).append("\n");
    sb.append("    mirrorGroup: ").append(toIndentedString(mirrorGroup)).append("\n");
    sb.append("    localVolume: ").append(toIndentedString(localVolume)).append("\n");
    sb.append("    remoteVolume: ").append(toIndentedString(remoteVolume)).append("\n");
    sb.append("    memberState: ").append(toIndentedString(memberState)).append("\n");
    sb.append("    lastRecoveryPointTime: ").append(toIndentedString(lastRecoveryPointTime)).append("\n");
    sb.append("    overUtilizationWarnThreshold: ").append(toIndentedString(overUtilizationWarnThreshold)).append("\n");
    sb.append("    mirroredLocalCapacity: ").append(toIndentedString(mirroredLocalCapacity)).append("\n");
    sb.append("    repositoryVolume: ").append(toIndentedString(repositoryVolume)).append("\n");
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    repositoryFull: ").append(toIndentedString(repositoryFull)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

