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
 * MirrorProxyVolume
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class MirrorProxyVolume   {
  
    private String worldWideName;

    private String mirrorProxyRef;

    private Integer volumeHandle;


  /**
   * The status of the local mirror volume.
   */
  public enum LocalMirrorStatusEnum {
    optimal("optimal"),
    unsynchronized("unsynchronized"),
    synchronizing("synchronizing"),
    notready("notready"),
    suspended("suspended"),
    failed("failed"),
    failedsuspended("failedsuspended"),
    degradedSynchronizing("degradedSynchronizing"),
    degradedUnsynchronized("degradedUnsynchronized"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    LocalMirrorStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LocalMirrorStatusEnum localMirrorStatus;


  /**
   * The status of the remote mirror volume.
   */
  public enum RemoteMirrorStatusEnum {
    optimal("optimal"),
    unsynchronized("unsynchronized"),
    synchronizing("synchronizing"),
    notready("notready"),
    suspended("suspended"),
    failed("failed"),
    failedsuspended("failedsuspended"),
    degradedSynchronizing("degradedSynchronizing"),
    degradedUnsynchronized("degradedUnsynchronized"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RemoteMirrorStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RemoteMirrorStatusEnum remoteMirrorStatus;


  /**
   * The role of the local mirror volume.
   */
  public enum LocalRoleEnum {
    primary("primary"),
    secondary("secondary"),
    invalid("invalid"),
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
   * The role of the remote mirror volume.
   */
  public enum RemoteRoleEnum {
    primary("primary"),
    secondary("secondary"),
    invalid("invalid"),
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
   * The synchronization priority for the local mirror volume.
   */
  public enum LocalPriorityEnum {
    priority0("priority0"),
    priority1("priority1"),
    priority2("priority2"),
    priority3("priority3"),
    priority4("priority4"),
    unknown("unknown"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    LocalPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LocalPriorityEnum localPriority;


  /**
   * The synchronization priority for the remote mirror volume.
   */
  public enum PeerPriorityEnum {
    priority0("priority0"),
    priority1("priority1"),
    priority2("priority2"),
    priority3("priority3"),
    priority4("priority4"),
    unknown("unknown"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PeerPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PeerPriorityEnum peerPriority;

    private Long usableCapacity;

    private String currentManager;

    private String baseVolume;

    private String remoteVolRef;


  /**
   * An indication of what current long-running activity, if any, is currently in progress on the volume.
   */
  public enum ActionEnum {
    none("none"),
    copyback("copyback"),
    initializing("initializing"),
    reconstructing("reconstructing"),
    remappingDce("remappingDce"),
    remappingDrm("remappingDrm"),
    remappingDcedrm("remappingDcedrm"),
    remappingDseg("remappingDseg"),
    remappingDve("remappingDve"),
    remappingDcedve("remappingDcedve"),
    remappingInternal("remappingInternal"),
    remappingDefrag("remappingDefrag"),
    formatting("formatting"),
    synchronizing("synchronizing"),
    parityScan("parityScan"),
    volumeCopy("volumeCopy"),
    snapshotRollback("snapshotRollback"),
    pitRollback("pitRollback"),
    asyncMirrorGroupInitialSync("asyncMirrorGroupInitialSync"),
    reconstructingCritical("reconstructingCritical"),
    rebalancing("rebalancing"),
    copyThenFail("copyThenFail"),
    copyThenFailPending("copyThenFailPending"),
    copyThenReplace("copyThenReplace"),
    copyThenReplaceAndFail("copyThenReplaceAndFail"),
    thinDefrag("thinDefrag"),
    creating("creating"),
    deleting("deleting"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ActionEnum action;

    private String reserved1;

    private String reserved2;


  /**
   * The local mirror volume's write mode.
   */
  public enum LocalWriteModeEnum {
    synchronousMode("synchronousMode"),
    asynchronousMode("asynchronousMode"),
    consistentAsyncMode("consistentAsyncMode"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    LocalWriteModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LocalWriteModeEnum localWriteMode;

    private Boolean autoResync;

    private String consistencyGroupRef;

  
  /**
   * The WWN of the local mirror volume.
   **/
  public MirrorProxyVolume worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the local mirror volume.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The reference to the local mirror volume.
   **/
  public MirrorProxyVolume mirrorProxyRef(String mirrorProxyRef) {
    this.mirrorProxyRef = mirrorProxyRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference to the local mirror volume.")
  @JsonProperty("mirrorProxyRef")
  public String getMirrorProxyRef() {
    return mirrorProxyRef;
  }
  
  public void setMirrorProxyRef(String mirrorProxyRef) {
    this.mirrorProxyRef = mirrorProxyRef;
  }

  
  /**
   * The ssid of the local mirror volume.
   **/
  public MirrorProxyVolume volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ssid of the local mirror volume.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * The status of the local mirror volume.
   **/
  public MirrorProxyVolume localMirrorStatus(LocalMirrorStatusEnum localMirrorStatus) {
    this.localMirrorStatus = localMirrorStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the local mirror volume.")
  @JsonProperty("localMirrorStatus")
  public LocalMirrorStatusEnum getLocalMirrorStatus() {
    return localMirrorStatus;
  }
  
  public void setLocalMirrorStatus(LocalMirrorStatusEnum localMirrorStatus) {
    this.localMirrorStatus = localMirrorStatus;
  }

  
  /**
   * The status of the remote mirror volume.
   **/
  public MirrorProxyVolume remoteMirrorStatus(RemoteMirrorStatusEnum remoteMirrorStatus) {
    this.remoteMirrorStatus = remoteMirrorStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the remote mirror volume.")
  @JsonProperty("remoteMirrorStatus")
  public RemoteMirrorStatusEnum getRemoteMirrorStatus() {
    return remoteMirrorStatus;
  }
  
  public void setRemoteMirrorStatus(RemoteMirrorStatusEnum remoteMirrorStatus) {
    this.remoteMirrorStatus = remoteMirrorStatus;
  }

  
  /**
   * The role of the local mirror volume.
   **/
  public MirrorProxyVolume localRole(LocalRoleEnum localRole) {
    this.localRole = localRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The role of the local mirror volume.")
  @JsonProperty("localRole")
  public LocalRoleEnum getLocalRole() {
    return localRole;
  }
  
  public void setLocalRole(LocalRoleEnum localRole) {
    this.localRole = localRole;
  }

  
  /**
   * The role of the remote mirror volume.
   **/
  public MirrorProxyVolume remoteRole(RemoteRoleEnum remoteRole) {
    this.remoteRole = remoteRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The role of the remote mirror volume.")
  @JsonProperty("remoteRole")
  public RemoteRoleEnum getRemoteRole() {
    return remoteRole;
  }
  
  public void setRemoteRole(RemoteRoleEnum remoteRole) {
    this.remoteRole = remoteRole;
  }

  
  /**
   * The synchronization priority for the local mirror volume.
   **/
  public MirrorProxyVolume localPriority(LocalPriorityEnum localPriority) {
    this.localPriority = localPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The synchronization priority for the local mirror volume.")
  @JsonProperty("localPriority")
  public LocalPriorityEnum getLocalPriority() {
    return localPriority;
  }
  
  public void setLocalPriority(LocalPriorityEnum localPriority) {
    this.localPriority = localPriority;
  }

  
  /**
   * The synchronization priority for the remote mirror volume.
   **/
  public MirrorProxyVolume peerPriority(PeerPriorityEnum peerPriority) {
    this.peerPriority = peerPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The synchronization priority for the remote mirror volume.")
  @JsonProperty("peerPriority")
  public PeerPriorityEnum getPeerPriority() {
    return peerPriority;
  }
  
  public void setPeerPriority(PeerPriorityEnum peerPriority) {
    this.peerPriority = peerPriority;
  }

  
  /**
   * The amount of capacity being used by the mirror.
   **/
  public MirrorProxyVolume usableCapacity(Long usableCapacity) {
    this.usableCapacity = usableCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of capacity being used by the mirror.")
  @JsonProperty("usableCapacity")
  public Long getUsableCapacity() {
    return usableCapacity;
  }
  
  public void setUsableCapacity(Long usableCapacity) {
    this.usableCapacity = usableCapacity;
  }

  
  /**
   * The controller reference that owns the local mirror volume.
   **/
  public MirrorProxyVolume currentManager(String currentManager) {
    this.currentManager = currentManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller reference that owns the local mirror volume.")
  @JsonProperty("currentManager")
  public String getCurrentManager() {
    return currentManager;
  }
  
  public void setCurrentManager(String currentManager) {
    this.currentManager = currentManager;
  }

  
  /**
   * The reference to the base volume of the local mirror.
   **/
  public MirrorProxyVolume baseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference to the base volume of the local mirror.")
  @JsonProperty("baseVolume")
  public String getBaseVolume() {
    return baseVolume;
  }
  
  public void setBaseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
  }

  
  /**
   * The reference to the remote volume.
   **/
  public MirrorProxyVolume remoteVolRef(String remoteVolRef) {
    this.remoteVolRef = remoteVolRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference to the remote volume.")
  @JsonProperty("remoteVolRef")
  public String getRemoteVolRef() {
    return remoteVolRef;
  }
  
  public void setRemoteVolRef(String remoteVolRef) {
    this.remoteVolRef = remoteVolRef;
  }

  
  /**
   * An indication of what current long-running activity, if any, is currently in progress on the volume.
   **/
  public MirrorProxyVolume action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of what current long-running activity, if any, is currently in progress on the volume.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   **/
  public MirrorProxyVolume reserved1(String reserved1) {
    this.reserved1 = reserved1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved1")
  public String getReserved1() {
    return reserved1;
  }
  
  public void setReserved1(String reserved1) {
    this.reserved1 = reserved1;
  }

  
  /**
   **/
  public MirrorProxyVolume reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  
  /**
   * The local mirror volume's write mode.
   **/
  public MirrorProxyVolume localWriteMode(LocalWriteModeEnum localWriteMode) {
    this.localWriteMode = localWriteMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The local mirror volume's write mode.")
  @JsonProperty("localWriteMode")
  public LocalWriteModeEnum getLocalWriteMode() {
    return localWriteMode;
  }
  
  public void setLocalWriteMode(LocalWriteModeEnum localWriteMode) {
    this.localWriteMode = localWriteMode;
  }

  
  /**
   * Indicates whether auto resynchronization is allowed.
   **/
  public MirrorProxyVolume autoResync(Boolean autoResync) {
    this.autoResync = autoResync;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether auto resynchronization is allowed.")
  @JsonProperty("autoResync")
  public Boolean getAutoResync() {
    return autoResync;
  }
  
  public void setAutoResync(Boolean autoResync) {
    this.autoResync = autoResync;
  }

  
  /**
   * The write consistency group reference.
   **/
  public MirrorProxyVolume consistencyGroupRef(String consistencyGroupRef) {
    this.consistencyGroupRef = consistencyGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The write consistency group reference.")
  @JsonProperty("consistencyGroupRef")
  public String getConsistencyGroupRef() {
    return consistencyGroupRef;
  }
  
  public void setConsistencyGroupRef(String consistencyGroupRef) {
    this.consistencyGroupRef = consistencyGroupRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MirrorProxyVolume mirrorProxyVolume = (MirrorProxyVolume) o;
    return Objects.equals(this.worldWideName, mirrorProxyVolume.worldWideName) &&
        Objects.equals(this.mirrorProxyRef, mirrorProxyVolume.mirrorProxyRef) &&
        Objects.equals(this.volumeHandle, mirrorProxyVolume.volumeHandle) &&
        Objects.equals(this.localMirrorStatus, mirrorProxyVolume.localMirrorStatus) &&
        Objects.equals(this.remoteMirrorStatus, mirrorProxyVolume.remoteMirrorStatus) &&
        Objects.equals(this.localRole, mirrorProxyVolume.localRole) &&
        Objects.equals(this.remoteRole, mirrorProxyVolume.remoteRole) &&
        Objects.equals(this.localPriority, mirrorProxyVolume.localPriority) &&
        Objects.equals(this.peerPriority, mirrorProxyVolume.peerPriority) &&
        Objects.equals(this.usableCapacity, mirrorProxyVolume.usableCapacity) &&
        Objects.equals(this.currentManager, mirrorProxyVolume.currentManager) &&
        Objects.equals(this.baseVolume, mirrorProxyVolume.baseVolume) &&
        Objects.equals(this.remoteVolRef, mirrorProxyVolume.remoteVolRef) &&
        Objects.equals(this.action, mirrorProxyVolume.action) &&
        Objects.equals(this.reserved1, mirrorProxyVolume.reserved1) &&
        Objects.equals(this.reserved2, mirrorProxyVolume.reserved2) &&
        Objects.equals(this.localWriteMode, mirrorProxyVolume.localWriteMode) &&
        Objects.equals(this.autoResync, mirrorProxyVolume.autoResync) &&
        Objects.equals(this.consistencyGroupRef, mirrorProxyVolume.consistencyGroupRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worldWideName, mirrorProxyRef, volumeHandle, localMirrorStatus, remoteMirrorStatus, localRole, remoteRole, localPriority, peerPriority, usableCapacity, currentManager, baseVolume, remoteVolRef, action, reserved1, reserved2, localWriteMode, autoResync, consistencyGroupRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MirrorProxyVolume {\n");
    
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    mirrorProxyRef: ").append(toIndentedString(mirrorProxyRef)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    localMirrorStatus: ").append(toIndentedString(localMirrorStatus)).append("\n");
    sb.append("    remoteMirrorStatus: ").append(toIndentedString(remoteMirrorStatus)).append("\n");
    sb.append("    localRole: ").append(toIndentedString(localRole)).append("\n");
    sb.append("    remoteRole: ").append(toIndentedString(remoteRole)).append("\n");
    sb.append("    localPriority: ").append(toIndentedString(localPriority)).append("\n");
    sb.append("    peerPriority: ").append(toIndentedString(peerPriority)).append("\n");
    sb.append("    usableCapacity: ").append(toIndentedString(usableCapacity)).append("\n");
    sb.append("    currentManager: ").append(toIndentedString(currentManager)).append("\n");
    sb.append("    baseVolume: ").append(toIndentedString(baseVolume)).append("\n");
    sb.append("    remoteVolRef: ").append(toIndentedString(remoteVolRef)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    localWriteMode: ").append(toIndentedString(localWriteMode)).append("\n");
    sb.append("    autoResync: ").append(toIndentedString(autoResync)).append("\n");
    sb.append("    consistencyGroupRef: ").append(toIndentedString(consistencyGroupRef)).append("\n");
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

