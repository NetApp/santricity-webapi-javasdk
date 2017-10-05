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
 * Asynchronous Mirror Group
 */
@ApiModel(description = "Asynchronous Mirror Group")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class Amg   {
  
    private String groupRef;

    private String worldWideName;

    private String label;


  /**
   * The Mirror Group State. This is determined primarily by the presence or lack of a recovery point.
   */
  public enum GroupStateEnum {
    unknown("unknown"),
    initialSync("initialSync"),
    optimal("optimal"),
    degraded("degraded"),
    rpFailed("rpFailed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    GroupStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private GroupStateEnum groupState;


  /**
   * The current role of this (local) array with respect to this mirror group.
   */
  public enum LocalRoleEnum {
    unknown("unknown"),
    primary("primary"),
    secondary("secondary"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    LocalRoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LocalRoleEnum localRole;


  /**
   * The current role of the peer (remote) array with respect to this mirror group.
   */
  public enum RemoteRoleEnum {
    unknown("unknown"),
    primary("primary"),
    secondary("secondary"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RemoteRoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RemoteRoleEnum remoteRole;


  /**
   * This field indicates the current state of the role change process. This may be an extended condition due to the data sync needed for an orderly role change or the recovery point rollback needed for a no-sync or forced role change.
   */
  public enum RoleChangeProgressEnum {
    unknown("unknown"),
    none("none"),
    pending("pending"),
    inProgress("inProgress"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RoleChangeProgressEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RoleChangeProgressEnum roleChangeProgress;

    private Integer syncIntervalMinutes;

    private Integer syncCompletionTimeAlertThresholdMinutes;

    private Integer recoveryPointAgeAlertThresholdMinutes;

    private Integer repositoryUtilizationWarnThreshold;

    private String mirrorChannelRemoteTarget;


  /**
   * Current synchronization activity.
   */
  public enum SyncActivityEnum {
    unknown("unknown"),
    idle("idle"),
    active("active"),
    paused("paused"),
    userSuspended("userSuspended"),
    internallySuspended("internallySuspended"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SyncActivityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SyncActivityEnum syncActivity;

    private Boolean orphanGroup;


  /**
   * The connection type used to create this mirror group.
   */
  public enum ConnectionTypeEnum {
    notImplemented("notImplemented"),
    scsi("scsi"),
    fc("fc"),
    sata("sata"),
    sas("sas"),
    iscsi("iscsi"),
    ib("ib"),
    fcoe("fcoe"),
    nvmeof("nvmeof"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ConnectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ConnectionTypeEnum connectionType;

    private String remoteTargetWwn;

    private String remoteTargetName;

    private String remoteTargetId;

    private RemoteTarget remoteTarget;

    private String id;

  
  /**
   * The reference (key) for the mirror group.
   **/
  public Amg groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for the mirror group.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * The world wide name of the mirror group. This can be used to identify the AMG pair on both arrays. The AsyncMirrorGroupRef is not guaranteed to be unique across multiple arrays.
   **/
  public Amg worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The world wide name of the mirror group. This can be used to identify the AMG pair on both arrays. The AsyncMirrorGroupRef is not guaranteed to be unique across multiple arrays.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The user assigned name for the mirror group.
   **/
  public Amg label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned name for the mirror group.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The Mirror Group State. This is determined primarily by the presence or lack of a recovery point.
   **/
  public Amg groupState(GroupStateEnum groupState) {
    this.groupState = groupState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Mirror Group State. This is determined primarily by the presence or lack of a recovery point.")
  @JsonProperty("groupState")
  public GroupStateEnum getGroupState() {
    return groupState;
  }
  
  public void setGroupState(GroupStateEnum groupState) {
    this.groupState = groupState;
  }

  
  /**
   * The current role of this (local) array with respect to this mirror group.
   **/
  public Amg localRole(LocalRoleEnum localRole) {
    this.localRole = localRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current role of this (local) array with respect to this mirror group.")
  @JsonProperty("localRole")
  public LocalRoleEnum getLocalRole() {
    return localRole;
  }
  
  public void setLocalRole(LocalRoleEnum localRole) {
    this.localRole = localRole;
  }

  
  /**
   * The current role of the peer (remote) array with respect to this mirror group.
   **/
  public Amg remoteRole(RemoteRoleEnum remoteRole) {
    this.remoteRole = remoteRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current role of the peer (remote) array with respect to this mirror group.")
  @JsonProperty("remoteRole")
  public RemoteRoleEnum getRemoteRole() {
    return remoteRole;
  }
  
  public void setRemoteRole(RemoteRoleEnum remoteRole) {
    this.remoteRole = remoteRole;
  }

  
  /**
   * This field indicates the current state of the role change process. This may be an extended condition due to the data sync needed for an orderly role change or the recovery point rollback needed for a no-sync or forced role change.
   **/
  public Amg roleChangeProgress(RoleChangeProgressEnum roleChangeProgress) {
    this.roleChangeProgress = roleChangeProgress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field indicates the current state of the role change process. This may be an extended condition due to the data sync needed for an orderly role change or the recovery point rollback needed for a no-sync or forced role change.")
  @JsonProperty("roleChangeProgress")
  public RoleChangeProgressEnum getRoleChangeProgress() {
    return roleChangeProgress;
  }
  
  public void setRoleChangeProgress(RoleChangeProgressEnum roleChangeProgress) {
    this.roleChangeProgress = roleChangeProgress;
  }

  
  /**
   * The time in minutes between starting points of periodic synchronization intervals. A value of ARVM_MANUAL_SYNC_INTERVAL indicates synchronization intervals are manually started by the user.
   **/
  public Amg syncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time in minutes between starting points of periodic synchronization intervals. A value of ARVM_MANUAL_SYNC_INTERVAL indicates synchronization intervals are manually started by the user.")
  @JsonProperty("syncIntervalMinutes")
  public Integer getSyncIntervalMinutes() {
    return syncIntervalMinutes;
  }
  
  public void setSyncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
  }

  
  /**
   * The threshold (in minutes) for notifying the user that periodic synchronization has taken too long to complete. A value of ARVM_SYNC_COMPLETION_TIME_THRESHOLD_NONE indicates no threshold is set.
   **/
  public Amg syncCompletionTimeAlertThresholdMinutes(Integer syncCompletionTimeAlertThresholdMinutes) {
    this.syncCompletionTimeAlertThresholdMinutes = syncCompletionTimeAlertThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The threshold (in minutes) for notifying the user that periodic synchronization has taken too long to complete. A value of ARVM_SYNC_COMPLETION_TIME_THRESHOLD_NONE indicates no threshold is set.")
  @JsonProperty("syncCompletionTimeAlertThresholdMinutes")
  public Integer getSyncCompletionTimeAlertThresholdMinutes() {
    return syncCompletionTimeAlertThresholdMinutes;
  }
  
  public void setSyncCompletionTimeAlertThresholdMinutes(Integer syncCompletionTimeAlertThresholdMinutes) {
    this.syncCompletionTimeAlertThresholdMinutes = syncCompletionTimeAlertThresholdMinutes;
  }

  
  /**
   * The recovery point age objective (in minutes). The user is notified via needs-attention when the age of the last good recovery point exceeds this value. A value of ARVM_RECOVERY_POINT_AGE_THRESHOLD_NONE indicates no threshold is set.
   **/
  public Amg recoveryPointAgeAlertThresholdMinutes(Integer recoveryPointAgeAlertThresholdMinutes) {
    this.recoveryPointAgeAlertThresholdMinutes = recoveryPointAgeAlertThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recovery point age objective (in minutes). The user is notified via needs-attention when the age of the last good recovery point exceeds this value. A value of ARVM_RECOVERY_POINT_AGE_THRESHOLD_NONE indicates no threshold is set.")
  @JsonProperty("recoveryPointAgeAlertThresholdMinutes")
  public Integer getRecoveryPointAgeAlertThresholdMinutes() {
    return recoveryPointAgeAlertThresholdMinutes;
  }
  
  public void setRecoveryPointAgeAlertThresholdMinutes(Integer recoveryPointAgeAlertThresholdMinutes) {
    this.recoveryPointAgeAlertThresholdMinutes = recoveryPointAgeAlertThresholdMinutes;
  }

  
  /**
   * The repository utilization warning threshold (0-100 percent). A needs attention condition will be generated if the percent of the repository capacity currently utilized exceeds this threshold.
   **/
  public Amg repositoryUtilizationWarnThreshold(Integer repositoryUtilizationWarnThreshold) {
    this.repositoryUtilizationWarnThreshold = repositoryUtilizationWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold (0-100 percent). A needs attention condition will be generated if the percent of the repository capacity currently utilized exceeds this threshold.")
  @JsonProperty("repositoryUtilizationWarnThreshold")
  public Integer getRepositoryUtilizationWarnThreshold() {
    return repositoryUtilizationWarnThreshold;
  }
  
  public void setRepositoryUtilizationWarnThreshold(Integer repositoryUtilizationWarnThreshold) {
    this.repositoryUtilizationWarnThreshold = repositoryUtilizationWarnThreshold;
  }

  
  /**
   * The path to the remote array to be used by this AMG (a reference to the associated RemoteTarget).
   **/
  public Amg mirrorChannelRemoteTarget(String mirrorChannelRemoteTarget) {
    this.mirrorChannelRemoteTarget = mirrorChannelRemoteTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The path to the remote array to be used by this AMG (a reference to the associated RemoteTarget).")
  @JsonProperty("mirrorChannelRemoteTarget")
  public String getMirrorChannelRemoteTarget() {
    return mirrorChannelRemoteTarget;
  }
  
  public void setMirrorChannelRemoteTarget(String mirrorChannelRemoteTarget) {
    this.mirrorChannelRemoteTarget = mirrorChannelRemoteTarget;
  }

  
  /**
   * Current synchronization activity.
   **/
  public Amg syncActivity(SyncActivityEnum syncActivity) {
    this.syncActivity = syncActivity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Current synchronization activity.")
  @JsonProperty("syncActivity")
  public SyncActivityEnum getSyncActivity() {
    return syncActivity;
  }
  
  public void setSyncActivity(SyncActivityEnum syncActivity) {
    this.syncActivity = syncActivity;
  }

  
  /**
   * If true, the mirror group is an orphan.
   **/
  public Amg orphanGroup(Boolean orphanGroup) {
    this.orphanGroup = orphanGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the mirror group is an orphan.")
  @JsonProperty("orphanGroup")
  public Boolean getOrphanGroup() {
    return orphanGroup;
  }
  
  public void setOrphanGroup(Boolean orphanGroup) {
    this.orphanGroup = orphanGroup;
  }

  
  /**
   * The connection type used to create this mirror group.
   **/
  public Amg connectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The connection type used to create this mirror group.")
  @JsonProperty("connectionType")
  public ConnectionTypeEnum getConnectionType() {
    return connectionType;
  }
  
  public void setConnectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
  }

  
  /**
   * The WWN of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created.
   **/
  public Amg remoteTargetWwn(String remoteTargetWwn) {
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
  public Amg remoteTargetName(String remoteTargetName) {
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
  public Amg remoteTargetId(String remoteTargetId) {
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
   * The connection information for the remote StorageSystem.
   **/
  public Amg remoteTarget(RemoteTarget remoteTarget) {
    this.remoteTarget = remoteTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The connection information for the remote StorageSystem.")
  @JsonProperty("remoteTarget")
  public RemoteTarget getRemoteTarget() {
    return remoteTarget;
  }
  
  public void setRemoteTarget(RemoteTarget remoteTarget) {
    this.remoteTarget = remoteTarget;
  }

  
  /**
   **/
  public Amg id(String id) {
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
    Amg amg = (Amg) o;
    return Objects.equals(this.groupRef, amg.groupRef) &&
        Objects.equals(this.worldWideName, amg.worldWideName) &&
        Objects.equals(this.label, amg.label) &&
        Objects.equals(this.groupState, amg.groupState) &&
        Objects.equals(this.localRole, amg.localRole) &&
        Objects.equals(this.remoteRole, amg.remoteRole) &&
        Objects.equals(this.roleChangeProgress, amg.roleChangeProgress) &&
        Objects.equals(this.syncIntervalMinutes, amg.syncIntervalMinutes) &&
        Objects.equals(this.syncCompletionTimeAlertThresholdMinutes, amg.syncCompletionTimeAlertThresholdMinutes) &&
        Objects.equals(this.recoveryPointAgeAlertThresholdMinutes, amg.recoveryPointAgeAlertThresholdMinutes) &&
        Objects.equals(this.repositoryUtilizationWarnThreshold, amg.repositoryUtilizationWarnThreshold) &&
        Objects.equals(this.mirrorChannelRemoteTarget, amg.mirrorChannelRemoteTarget) &&
        Objects.equals(this.syncActivity, amg.syncActivity) &&
        Objects.equals(this.orphanGroup, amg.orphanGroup) &&
        Objects.equals(this.connectionType, amg.connectionType) &&
        Objects.equals(this.remoteTargetWwn, amg.remoteTargetWwn) &&
        Objects.equals(this.remoteTargetName, amg.remoteTargetName) &&
        Objects.equals(this.remoteTargetId, amg.remoteTargetId) &&
        Objects.equals(this.remoteTarget, amg.remoteTarget) &&
        Objects.equals(this.id, amg.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRef, worldWideName, label, groupState, localRole, remoteRole, roleChangeProgress, syncIntervalMinutes, syncCompletionTimeAlertThresholdMinutes, recoveryPointAgeAlertThresholdMinutes, repositoryUtilizationWarnThreshold, mirrorChannelRemoteTarget, syncActivity, orphanGroup, connectionType, remoteTargetWwn, remoteTargetName, remoteTargetId, remoteTarget, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amg {\n");
    
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    groupState: ").append(toIndentedString(groupState)).append("\n");
    sb.append("    localRole: ").append(toIndentedString(localRole)).append("\n");
    sb.append("    remoteRole: ").append(toIndentedString(remoteRole)).append("\n");
    sb.append("    roleChangeProgress: ").append(toIndentedString(roleChangeProgress)).append("\n");
    sb.append("    syncIntervalMinutes: ").append(toIndentedString(syncIntervalMinutes)).append("\n");
    sb.append("    syncCompletionTimeAlertThresholdMinutes: ").append(toIndentedString(syncCompletionTimeAlertThresholdMinutes)).append("\n");
    sb.append("    recoveryPointAgeAlertThresholdMinutes: ").append(toIndentedString(recoveryPointAgeAlertThresholdMinutes)).append("\n");
    sb.append("    repositoryUtilizationWarnThreshold: ").append(toIndentedString(repositoryUtilizationWarnThreshold)).append("\n");
    sb.append("    mirrorChannelRemoteTarget: ").append(toIndentedString(mirrorChannelRemoteTarget)).append("\n");
    sb.append("    syncActivity: ").append(toIndentedString(syncActivity)).append("\n");
    sb.append("    orphanGroup: ").append(toIndentedString(orphanGroup)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    remoteTargetWwn: ").append(toIndentedString(remoteTargetWwn)).append("\n");
    sb.append("    remoteTargetName: ").append(toIndentedString(remoteTargetName)).append("\n");
    sb.append("    remoteTargetId: ").append(toIndentedString(remoteTargetId)).append("\n");
    sb.append("    remoteTarget: ").append(toIndentedString(remoteTarget)).append("\n");
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

