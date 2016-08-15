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
 * A representation of an asynchronous mirroring relationship between a local and remote volume.
 */
@ApiModel(description = "A representation of an asynchronous mirroring relationship between a local and remote volume.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class AmgMember   {
  
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

    private String localVolumeName;

    private String remoteVolumeName;

    private RemoteVolume remoteVolumeInfo;

    private String remoteTargetWwn;

    private String remoteTargetName;

    private String remoteTargetId;

    private Long totalSizeInBytes;

    private VolumeMediaScanParams mediaScan;

    private String id;

  
  /**
   * The reference (key) for the group member.
   **/
  public AmgMember memberRef(String memberRef) {
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
  public AmgMember mirrorGroup(String mirrorGroup) {
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
  public AmgMember localVolume(String localVolume) {
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
  public AmgMember remoteVolume(String remoteVolume) {
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
  public AmgMember memberState(MemberStateEnum memberState) {
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
  public AmgMember lastRecoveryPointTime(Long lastRecoveryPointTime) {
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
  public AmgMember overUtilizationWarnThreshold(Boolean overUtilizationWarnThreshold) {
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
  public AmgMember mirroredLocalCapacity(Long mirroredLocalCapacity) {
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
  public AmgMember repositoryVolume(String repositoryVolume) {
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
  public AmgMember worldWideName(String worldWideName) {
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
  public AmgMember volumeHandle(Integer volumeHandle) {
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
  public AmgMember repositoryFull(Boolean repositoryFull) {
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
   * The label of the source volume on the local StorageSystem.
   **/
  public AmgMember localVolumeName(String localVolumeName) {
    this.localVolumeName = localVolumeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The label of the source volume on the local StorageSystem.")
  @JsonProperty("localVolumeName")
  public String getLocalVolumeName() {
    return localVolumeName;
  }
  
  public void setLocalVolumeName(String localVolumeName) {
    this.localVolumeName = localVolumeName;
  }

  
  /**
   * The label of the remote target volume.
   **/
  public AmgMember remoteVolumeName(String remoteVolumeName) {
    this.remoteVolumeName = remoteVolumeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The label of the remote target volume.")
  @JsonProperty("remoteVolumeName")
  public String getRemoteVolumeName() {
    return remoteVolumeName;
  }
  
  public void setRemoteVolumeName(String remoteVolumeName) {
    this.remoteVolumeName = remoteVolumeName;
  }

  
  /**
   * Detailed information on the remote volume.
   **/
  public AmgMember remoteVolumeInfo(RemoteVolume remoteVolumeInfo) {
    this.remoteVolumeInfo = remoteVolumeInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed information on the remote volume.")
  @JsonProperty("remoteVolumeInfo")
  public RemoteVolume getRemoteVolumeInfo() {
    return remoteVolumeInfo;
  }
  
  public void setRemoteVolumeInfo(RemoteVolume remoteVolumeInfo) {
    this.remoteVolumeInfo = remoteVolumeInfo;
  }

  
  /**
   * The WWN of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created.
   **/
  public AmgMember remoteTargetWwn(String remoteTargetWwn) {
    this.remoteTargetWwn = remoteTargetWwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The WWN of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created.")
  @JsonProperty("remoteTargetWwn")
  public String getRemoteTargetWwn() {
    return remoteTargetWwn;
  }
  
  public void setRemoteTargetWwn(String remoteTargetWwn) {
    this.remoteTargetWwn = remoteTargetWwn;
  }

  
  /**
   * The user label of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created, and will not be available in embedded mode.
   **/
  public AmgMember remoteTargetName(String remoteTargetName) {
    this.remoteTargetName = remoteTargetName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user label of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created, and will not be available in embedded mode.")
  @JsonProperty("remoteTargetName")
  public String getRemoteTargetName() {
    return remoteTargetName;
  }
  
  public void setRemoteTargetName(String remoteTargetName) {
    this.remoteTargetName = remoteTargetName;
  }

  
  /**
   * The id of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created, and will not be available in embedded mode.
   **/
  public AmgMember remoteTargetId(String remoteTargetId) {
    this.remoteTargetId = remoteTargetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created, and will not be available in embedded mode.")
  @JsonProperty("remoteTargetId")
  public String getRemoteTargetId() {
    return remoteTargetId;
  }
  
  public void setRemoteTargetId(String remoteTargetId) {
    this.remoteTargetId = remoteTargetId;
  }

  
  /**
   * The capacity of the underlying repository volume in bytes.
   **/
  public AmgMember totalSizeInBytes(Long totalSizeInBytes) {
    this.totalSizeInBytes = totalSizeInBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The capacity of the underlying repository volume in bytes.")
  @JsonProperty("totalSizeInBytes")
  public Long getTotalSizeInBytes() {
    return totalSizeInBytes;
  }
  
  public void setTotalSizeInBytes(Long totalSizeInBytes) {
    this.totalSizeInBytes = totalSizeInBytes;
  }

  
  /**
   * The volume-specific media scan settings currently in effect for the repository volume.
   **/
  public AmgMember mediaScan(VolumeMediaScanParams mediaScan) {
    this.mediaScan = mediaScan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The volume-specific media scan settings currently in effect for the repository volume.")
  @JsonProperty("mediaScan")
  public VolumeMediaScanParams getMediaScan() {
    return mediaScan;
  }
  
  public void setMediaScan(VolumeMediaScanParams mediaScan) {
    this.mediaScan = mediaScan;
  }

  
  /**
   **/
  public AmgMember id(String id) {
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
    AmgMember amgMember = (AmgMember) o;
    return Objects.equals(this.memberRef, amgMember.memberRef) &&
        Objects.equals(this.mirrorGroup, amgMember.mirrorGroup) &&
        Objects.equals(this.localVolume, amgMember.localVolume) &&
        Objects.equals(this.remoteVolume, amgMember.remoteVolume) &&
        Objects.equals(this.memberState, amgMember.memberState) &&
        Objects.equals(this.lastRecoveryPointTime, amgMember.lastRecoveryPointTime) &&
        Objects.equals(this.overUtilizationWarnThreshold, amgMember.overUtilizationWarnThreshold) &&
        Objects.equals(this.mirroredLocalCapacity, amgMember.mirroredLocalCapacity) &&
        Objects.equals(this.repositoryVolume, amgMember.repositoryVolume) &&
        Objects.equals(this.worldWideName, amgMember.worldWideName) &&
        Objects.equals(this.volumeHandle, amgMember.volumeHandle) &&
        Objects.equals(this.repositoryFull, amgMember.repositoryFull) &&
        Objects.equals(this.localVolumeName, amgMember.localVolumeName) &&
        Objects.equals(this.remoteVolumeName, amgMember.remoteVolumeName) &&
        Objects.equals(this.remoteVolumeInfo, amgMember.remoteVolumeInfo) &&
        Objects.equals(this.remoteTargetWwn, amgMember.remoteTargetWwn) &&
        Objects.equals(this.remoteTargetName, amgMember.remoteTargetName) &&
        Objects.equals(this.remoteTargetId, amgMember.remoteTargetId) &&
        Objects.equals(this.totalSizeInBytes, amgMember.totalSizeInBytes) &&
        Objects.equals(this.mediaScan, amgMember.mediaScan) &&
        Objects.equals(this.id, amgMember.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberRef, mirrorGroup, localVolume, remoteVolume, memberState, lastRecoveryPointTime, overUtilizationWarnThreshold, mirroredLocalCapacity, repositoryVolume, worldWideName, volumeHandle, repositoryFull, localVolumeName, remoteVolumeName, remoteVolumeInfo, remoteTargetWwn, remoteTargetName, remoteTargetId, totalSizeInBytes, mediaScan, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmgMember {\n");
    
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
    sb.append("    localVolumeName: ").append(toIndentedString(localVolumeName)).append("\n");
    sb.append("    remoteVolumeName: ").append(toIndentedString(remoteVolumeName)).append("\n");
    sb.append("    remoteVolumeInfo: ").append(toIndentedString(remoteVolumeInfo)).append("\n");
    sb.append("    remoteTargetWwn: ").append(toIndentedString(remoteTargetWwn)).append("\n");
    sb.append("    remoteTargetName: ").append(toIndentedString(remoteTargetName)).append("\n");
    sb.append("    remoteTargetId: ").append(toIndentedString(remoteTargetId)).append("\n");
    sb.append("    totalSizeInBytes: ").append(toIndentedString(totalSizeInBytes)).append("\n");
    sb.append("    mediaScan: ").append(toIndentedString(mediaScan)).append("\n");
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

