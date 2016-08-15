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
 * LegacySnapshotEx
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class LegacySnapshotEx   {
  
    private String worldWideName;

    private String snapshotRef;

    private String label;


  /**
   * Indicates status of the snapshot.
   */
  public enum StatusEnum {
    active("active"),
    failed("failed"),
    disabled("disabled"),
    offline("offline"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;


  /**
   * Long running action.
   */
  public enum ActionEnum {
    none("none"),
    rollback("rollback"),
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

    private String currentManager;

    private String baseVolume;

    private String repositoryVolume;

    private Integer fullWarnThreshold;

    private Boolean overWarnThreshold;

    private Boolean repositoryFull;


  /**
   * Indication of the volume behavior when the repository is full.
   */
  public enum RepFullPolicyEnum {
    failwrites("failwrites"),
    failsnap("failsnap"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RepFullPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RepFullPolicyEnum repFullPolicy;

    private Integer rollbackPriority;

    private Long extentStart;

    private Long extentSize;

    private Long snapshotTime;

    private VolumePerms perms;

    private Boolean childrenInactive;

    private Integer volumeHandle;

    private Integer mgmtClientAttribute;


  /**
   * Status of current action being performed on snapshot.
   */
  public enum RollbackStatusEnum {
    none("none"),
    inProgress("inProgress"),
    pending("pending"),
    paused("paused"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RollbackStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RollbackStatusEnum rollbackStatus;

    private Long baseVolumeSizeInBytes;

    private Long totalSizeInBytes;

    private String preferredControllerId;

    private Long repositoryCapacity;

    private Boolean volumeCopyTarget;

    private Boolean volumeCopySource;

    private Boolean pitBaseVolume;

    private Boolean asyncMirrorTarget;

    private Boolean asyncMirrorSource;


  /**
   * Gets or Sets protectionType
   */
  public enum ProtectionTypeEnum {
    type0Protection("type0Protection"),
    type1Protection("type1Protection"),
    type2Protection("type2Protection"),
    type3Protection("type3Protection"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ProtectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ProtectionTypeEnum protectionType;

    private Boolean remoteMirrorSource;

    private Boolean remoteMirrorTarget;


  /**
   * Gets or Sets objectType
   */
  public enum ObjectTypeEnum {
    volume("volume"),
    pool("pool"),
    host("host"),
    lunMapping("lunMapping"),
    hostGroup("hostGroup"),
    thinVolume("thinVolume"),
    drive("drive"),
    volumeCopy("volumeCopy"),
    pit("pit"),
    pitView("pitView"),
    snapshotGroup("snapshotGroup"),
    snapshot("snapshot"),
    accessVolume("accessVolume"),
    legacySnapshot("legacySnapshot"),
    hostType("hostType"),
    metadataTag("metadataTag"),
    managementUrl("managementUrl"),
    folder("folder"),
    asyncMirrorGroup("asyncMirrorGroup"),
    asyncMirrorGroupMember("asyncMirrorGroupMember"),
    asyncMirrorGroupIncompleteMember("asyncMirrorGroupIncompleteMember"),
    consistencyGroup("consistencyGroup"),
    consistencyGroupView("consistencyGroupView"),
    fan("fan"),
    battery("battery"),
    storageSystem("storageSystem"),
    controller("controller"),
    powerSupply("powerSupply"),
    minihub("minihub"),
    esm("esm"),
    drawer("drawer"),
    hostBoard("hostBoard"),
    interconnectCRU("interconnectCRU"),
    cacheBackupDevice("cacheBackupDevice"),
    tray("tray"),
    supportCRU("supportCRU"),
    hostPort("hostPort"),
    initiator("initiator"),
    snapshotSchedule("snapshotSchedule"),
    thermalSensor("thermalSensor"),
    sfp("sfp"),
    flashCache("flashCache"),
    featureAttribute("featureAttribute"),
    featureState("featureState"),
    lockKeyId("lockKeyId"),
    remoteVolume("remoteVolume"),
    mirrorVolume("mirrorVolume"),
    vaultMirrorVolume("vaultMirrorVolume"),
    vaultMirrorGroup("vaultMirrorGroup"),
    metadataVolume("metadataVolume"),
    sasPort("sasPort"),
    sasExpander("sasExpander"),
    channelPort("channelPort"),
    speedNegError("speedNegError"),
    snmpAgentBundle("snmpAgentBundle"),
    stagedFirmware("stagedFirmware"),
    workload("workload");
;
    private String value;

    ObjectTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ObjectTypeEnum objectType;

    private String name;

    private String id;

    private String wwn;

    private List<LUNMapping> listOfMappings;

    private Boolean mapped;

    private String currentControllerId;

    private Boolean onlineVolumeCopy;

  
  /**
   * The World Wide Name of the snapshot.
   **/
  public LegacySnapshotEx worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The World Wide Name of the snapshot.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * Reference (key) for the snapshot volume.
   **/
  public LegacySnapshotEx snapshotRef(String snapshotRef) {
    this.snapshotRef = snapshotRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference (key) for the snapshot volume.")
  @JsonProperty("snapshotRef")
  public String getSnapshotRef() {
    return snapshotRef;
  }
  
  public void setSnapshotRef(String snapshotRef) {
    this.snapshotRef = snapshotRef;
  }

  
  /**
   * Name of the snapshot.
   **/
  public LegacySnapshotEx label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the snapshot.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Indicates status of the snapshot.
   **/
  public LegacySnapshotEx status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates status of the snapshot.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Long running action.
   **/
  public LegacySnapshotEx action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Long running action.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * Current owner of the snapshot.
   **/
  public LegacySnapshotEx currentManager(String currentManager) {
    this.currentManager = currentManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Current owner of the snapshot.")
  @JsonProperty("currentManager")
  public String getCurrentManager() {
    return currentManager;
  }
  
  public void setCurrentManager(String currentManager) {
    this.currentManager = currentManager;
  }

  
  /**
   * Base volume for this snapshot.
   **/
  public LegacySnapshotEx baseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Base volume for this snapshot.")
  @JsonProperty("baseVolume")
  public String getBaseVolume() {
    return baseVolume;
  }
  
  public void setBaseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
  }

  
  /**
   * Repository volume for this snapshot.
   **/
  public LegacySnapshotEx repositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Repository volume for this snapshot.")
  @JsonProperty("repositoryVolume")
  public String getRepositoryVolume() {
    return repositoryVolume;
  }
  
  public void setRepositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
  }

  
  /**
   * Repository utilization warning threshold.
   **/
  public LegacySnapshotEx fullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Repository utilization warning threshold.")
  @JsonProperty("fullWarnThreshold")
  public Integer getFullWarnThreshold() {
    return fullWarnThreshold;
  }
  
  public void setFullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
  }

  
  /**
   * True if the repository utilization is over the warning threshold.
   **/
  public LegacySnapshotEx overWarnThreshold(Boolean overWarnThreshold) {
    this.overWarnThreshold = overWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the repository utilization is over the warning threshold.")
  @JsonProperty("overWarnThreshold")
  public Boolean getOverWarnThreshold() {
    return overWarnThreshold;
  }
  
  public void setOverWarnThreshold(Boolean overWarnThreshold) {
    this.overWarnThreshold = overWarnThreshold;
  }

  
  /**
   * True, if the repository is full.
   **/
  public LegacySnapshotEx repositoryFull(Boolean repositoryFull) {
    this.repositoryFull = repositoryFull;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if the repository is full.")
  @JsonProperty("repositoryFull")
  public Boolean getRepositoryFull() {
    return repositoryFull;
  }
  
  public void setRepositoryFull(Boolean repositoryFull) {
    this.repositoryFull = repositoryFull;
  }

  
  /**
   * Indication of the volume behavior when the repository is full.
   **/
  public LegacySnapshotEx repFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indication of the volume behavior when the repository is full.")
  @JsonProperty("repFullPolicy")
  public RepFullPolicyEnum getRepFullPolicy() {
    return repFullPolicy;
  }
  
  public void setRepFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
  }

  
  /**
   * The importance of the rollback operation (0-4). Not used in this release of software.
   **/
  public LegacySnapshotEx rollbackPriority(Integer rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The importance of the rollback operation (0-4). Not used in this release of software.")
  @JsonProperty("rollbackPriority")
  public Integer getRollbackPriority() {
    return rollbackPriority;
  }
  
  public void setRollbackPriority(Integer rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
  }

  
  /**
   * The start position of the extent in the base volume (bytes). Not used in this release of software.
   **/
  public LegacySnapshotEx extentStart(Long extentStart) {
    this.extentStart = extentStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start position of the extent in the base volume (bytes). Not used in this release of software.")
  @JsonProperty("extentStart")
  public Long getExtentStart() {
    return extentStart;
  }
  
  public void setExtentStart(Long extentStart) {
    this.extentStart = extentStart;
  }

  
  /**
   * The size of the extent in bytes. Not used in this release of software.
   **/
  public LegacySnapshotEx extentSize(Long extentSize) {
    this.extentSize = extentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the extent in bytes. Not used in this release of software.")
  @JsonProperty("extentSize")
  public Long getExtentSize() {
    return extentSize;
  }
  
  public void setExtentSize(Long extentSize) {
    this.extentSize = extentSize;
  }

  
  /**
   * The controller time when the snapshot was created.
   **/
  public LegacySnapshotEx snapshotTime(Long snapshotTime) {
    this.snapshotTime = snapshotTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller time when the snapshot was created.")
  @JsonProperty("snapshotTime")
  public Long getSnapshotTime() {
    return snapshotTime;
  }
  
  public void setSnapshotTime(Long snapshotTime) {
    this.snapshotTime = snapshotTime;
  }

  
  /**
   * Permissions allowed on volume.
   **/
  public LegacySnapshotEx perms(VolumePerms perms) {
    this.perms = perms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Permissions allowed on volume.")
  @JsonProperty("perms")
  public VolumePerms getPerms() {
    return perms;
  }
  
  public void setPerms(VolumePerms perms) {
    this.perms = perms;
  }

  
  /**
   * True if all child volumes are offline or failed. Child volumes are the base volume and the REPOSITORY volume.
   **/
  public LegacySnapshotEx childrenInactive(Boolean childrenInactive) {
    this.childrenInactive = childrenInactive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if all child volumes are offline or failed. Child volumes are the base volume and the REPOSITORY volume.")
  @JsonProperty("childrenInactive")
  public Boolean getChildrenInactive() {
    return childrenInactive;
  }
  
  public void setChildrenInactive(Boolean childrenInactive) {
    this.childrenInactive = childrenInactive;
  }

  
  /**
   * Volume SSID.
   **/
  public LegacySnapshotEx volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Volume SSID.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * For use by management client.
   **/
  public LegacySnapshotEx mgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "For use by management client.")
  @JsonProperty("mgmtClientAttribute")
  public Integer getMgmtClientAttribute() {
    return mgmtClientAttribute;
  }
  
  public void setMgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
  }

  
  /**
   * Status of current action being performed on snapshot.
   **/
  public LegacySnapshotEx rollbackStatus(RollbackStatusEnum rollbackStatus) {
    this.rollbackStatus = rollbackStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status of current action being performed on snapshot.")
  @JsonProperty("rollbackStatus")
  public RollbackStatusEnum getRollbackStatus() {
    return rollbackStatus;
  }
  
  public void setRollbackStatus(RollbackStatusEnum rollbackStatus) {
    this.rollbackStatus = rollbackStatus;
  }

  
  /**
   **/
  public LegacySnapshotEx baseVolumeSizeInBytes(Long baseVolumeSizeInBytes) {
    this.baseVolumeSizeInBytes = baseVolumeSizeInBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("baseVolumeSizeInBytes")
  public Long getBaseVolumeSizeInBytes() {
    return baseVolumeSizeInBytes;
  }
  
  public void setBaseVolumeSizeInBytes(Long baseVolumeSizeInBytes) {
    this.baseVolumeSizeInBytes = baseVolumeSizeInBytes;
  }

  
  /**
   **/
  public LegacySnapshotEx totalSizeInBytes(Long totalSizeInBytes) {
    this.totalSizeInBytes = totalSizeInBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalSizeInBytes")
  public Long getTotalSizeInBytes() {
    return totalSizeInBytes;
  }
  
  public void setTotalSizeInBytes(Long totalSizeInBytes) {
    this.totalSizeInBytes = totalSizeInBytes;
  }

  
  /**
   **/
  public LegacySnapshotEx preferredControllerId(String preferredControllerId) {
    this.preferredControllerId = preferredControllerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("preferredControllerId")
  public String getPreferredControllerId() {
    return preferredControllerId;
  }
  
  public void setPreferredControllerId(String preferredControllerId) {
    this.preferredControllerId = preferredControllerId;
  }

  
  /**
   **/
  public LegacySnapshotEx repositoryCapacity(Long repositoryCapacity) {
    this.repositoryCapacity = repositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("repositoryCapacity")
  public Long getRepositoryCapacity() {
    return repositoryCapacity;
  }
  
  public void setRepositoryCapacity(Long repositoryCapacity) {
    this.repositoryCapacity = repositoryCapacity;
  }

  
  /**
   **/
  public LegacySnapshotEx volumeCopyTarget(Boolean volumeCopyTarget) {
    this.volumeCopyTarget = volumeCopyTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumeCopyTarget")
  public Boolean getVolumeCopyTarget() {
    return volumeCopyTarget;
  }
  
  public void setVolumeCopyTarget(Boolean volumeCopyTarget) {
    this.volumeCopyTarget = volumeCopyTarget;
  }

  
  /**
   **/
  public LegacySnapshotEx volumeCopySource(Boolean volumeCopySource) {
    this.volumeCopySource = volumeCopySource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumeCopySource")
  public Boolean getVolumeCopySource() {
    return volumeCopySource;
  }
  
  public void setVolumeCopySource(Boolean volumeCopySource) {
    this.volumeCopySource = volumeCopySource;
  }

  
  /**
   **/
  public LegacySnapshotEx pitBaseVolume(Boolean pitBaseVolume) {
    this.pitBaseVolume = pitBaseVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pitBaseVolume")
  public Boolean getPitBaseVolume() {
    return pitBaseVolume;
  }
  
  public void setPitBaseVolume(Boolean pitBaseVolume) {
    this.pitBaseVolume = pitBaseVolume;
  }

  
  /**
   * True if the volume is a target in an Asynchronous Mirror relationship.
   **/
  public LegacySnapshotEx asyncMirrorTarget(Boolean asyncMirrorTarget) {
    this.asyncMirrorTarget = asyncMirrorTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the volume is a target in an Asynchronous Mirror relationship.")
  @JsonProperty("asyncMirrorTarget")
  public Boolean getAsyncMirrorTarget() {
    return asyncMirrorTarget;
  }
  
  public void setAsyncMirrorTarget(Boolean asyncMirrorTarget) {
    this.asyncMirrorTarget = asyncMirrorTarget;
  }

  
  /**
   * True if the volume is a source in an Asynchronous Mirror relationship.
   **/
  public LegacySnapshotEx asyncMirrorSource(Boolean asyncMirrorSource) {
    this.asyncMirrorSource = asyncMirrorSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the volume is a source in an Asynchronous Mirror relationship.")
  @JsonProperty("asyncMirrorSource")
  public Boolean getAsyncMirrorSource() {
    return asyncMirrorSource;
  }
  
  public void setAsyncMirrorSource(Boolean asyncMirrorSource) {
    this.asyncMirrorSource = asyncMirrorSource;
  }

  
  /**
   **/
  public LegacySnapshotEx protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("protectionType")
  public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }
  
  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  
  /**
   * True if the volume is a source (primary), in an Remote Volume Mirror relationship.
   **/
  public LegacySnapshotEx remoteMirrorSource(Boolean remoteMirrorSource) {
    this.remoteMirrorSource = remoteMirrorSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the volume is a source (primary), in an Remote Volume Mirror relationship.")
  @JsonProperty("remoteMirrorSource")
  public Boolean getRemoteMirrorSource() {
    return remoteMirrorSource;
  }
  
  public void setRemoteMirrorSource(Boolean remoteMirrorSource) {
    this.remoteMirrorSource = remoteMirrorSource;
  }

  
  /**
   * True if the volume is a target (secondary), in an Remote Volume Mirror relationship.
   **/
  public LegacySnapshotEx remoteMirrorTarget(Boolean remoteMirrorTarget) {
    this.remoteMirrorTarget = remoteMirrorTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the volume is a target (secondary), in an Remote Volume Mirror relationship.")
  @JsonProperty("remoteMirrorTarget")
  public Boolean getRemoteMirrorTarget() {
    return remoteMirrorTarget;
  }
  
  public void setRemoteMirrorTarget(Boolean remoteMirrorTarget) {
    this.remoteMirrorTarget = remoteMirrorTarget;
  }

  
  /**
   **/
  public LegacySnapshotEx objectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("objectType")
  public ObjectTypeEnum getObjectType() {
    return objectType;
  }
  
  public void setObjectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
  }

  
  /**
   **/
  public LegacySnapshotEx name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public LegacySnapshotEx id(String id) {
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

  
  /**
   **/
  public LegacySnapshotEx wwn(String wwn) {
    this.wwn = wwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wwn")
  public String getWwn() {
    return wwn;
  }
  
  public void setWwn(String wwn) {
    this.wwn = wwn;
  }

  
  /**
   **/
  public LegacySnapshotEx listOfMappings(List<LUNMapping> listOfMappings) {
    this.listOfMappings = listOfMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("listOfMappings")
  public List<LUNMapping> getListOfMappings() {
    return listOfMappings;
  }
  
  public void setListOfMappings(List<LUNMapping> listOfMappings) {
    this.listOfMappings = listOfMappings;
  }

  
  /**
   **/
  public LegacySnapshotEx mapped(Boolean mapped) {
    this.mapped = mapped;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("mapped")
  public Boolean getMapped() {
    return mapped;
  }
  
  public void setMapped(Boolean mapped) {
    this.mapped = mapped;
  }

  
  /**
   **/
  public LegacySnapshotEx currentControllerId(String currentControllerId) {
    this.currentControllerId = currentControllerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentControllerId")
  public String getCurrentControllerId() {
    return currentControllerId;
  }
  
  public void setCurrentControllerId(String currentControllerId) {
    this.currentControllerId = currentControllerId;
  }

  
  /**
   **/
  public LegacySnapshotEx onlineVolumeCopy(Boolean onlineVolumeCopy) {
    this.onlineVolumeCopy = onlineVolumeCopy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onlineVolumeCopy")
  public Boolean getOnlineVolumeCopy() {
    return onlineVolumeCopy;
  }
  
  public void setOnlineVolumeCopy(Boolean onlineVolumeCopy) {
    this.onlineVolumeCopy = onlineVolumeCopy;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacySnapshotEx legacySnapshotEx = (LegacySnapshotEx) o;
    return Objects.equals(this.worldWideName, legacySnapshotEx.worldWideName) &&
        Objects.equals(this.snapshotRef, legacySnapshotEx.snapshotRef) &&
        Objects.equals(this.label, legacySnapshotEx.label) &&
        Objects.equals(this.status, legacySnapshotEx.status) &&
        Objects.equals(this.action, legacySnapshotEx.action) &&
        Objects.equals(this.currentManager, legacySnapshotEx.currentManager) &&
        Objects.equals(this.baseVolume, legacySnapshotEx.baseVolume) &&
        Objects.equals(this.repositoryVolume, legacySnapshotEx.repositoryVolume) &&
        Objects.equals(this.fullWarnThreshold, legacySnapshotEx.fullWarnThreshold) &&
        Objects.equals(this.overWarnThreshold, legacySnapshotEx.overWarnThreshold) &&
        Objects.equals(this.repositoryFull, legacySnapshotEx.repositoryFull) &&
        Objects.equals(this.repFullPolicy, legacySnapshotEx.repFullPolicy) &&
        Objects.equals(this.rollbackPriority, legacySnapshotEx.rollbackPriority) &&
        Objects.equals(this.extentStart, legacySnapshotEx.extentStart) &&
        Objects.equals(this.extentSize, legacySnapshotEx.extentSize) &&
        Objects.equals(this.snapshotTime, legacySnapshotEx.snapshotTime) &&
        Objects.equals(this.perms, legacySnapshotEx.perms) &&
        Objects.equals(this.childrenInactive, legacySnapshotEx.childrenInactive) &&
        Objects.equals(this.volumeHandle, legacySnapshotEx.volumeHandle) &&
        Objects.equals(this.mgmtClientAttribute, legacySnapshotEx.mgmtClientAttribute) &&
        Objects.equals(this.rollbackStatus, legacySnapshotEx.rollbackStatus) &&
        Objects.equals(this.baseVolumeSizeInBytes, legacySnapshotEx.baseVolumeSizeInBytes) &&
        Objects.equals(this.totalSizeInBytes, legacySnapshotEx.totalSizeInBytes) &&
        Objects.equals(this.preferredControllerId, legacySnapshotEx.preferredControllerId) &&
        Objects.equals(this.repositoryCapacity, legacySnapshotEx.repositoryCapacity) &&
        Objects.equals(this.volumeCopyTarget, legacySnapshotEx.volumeCopyTarget) &&
        Objects.equals(this.volumeCopySource, legacySnapshotEx.volumeCopySource) &&
        Objects.equals(this.pitBaseVolume, legacySnapshotEx.pitBaseVolume) &&
        Objects.equals(this.asyncMirrorTarget, legacySnapshotEx.asyncMirrorTarget) &&
        Objects.equals(this.asyncMirrorSource, legacySnapshotEx.asyncMirrorSource) &&
        Objects.equals(this.protectionType, legacySnapshotEx.protectionType) &&
        Objects.equals(this.remoteMirrorSource, legacySnapshotEx.remoteMirrorSource) &&
        Objects.equals(this.remoteMirrorTarget, legacySnapshotEx.remoteMirrorTarget) &&
        Objects.equals(this.objectType, legacySnapshotEx.objectType) &&
        Objects.equals(this.name, legacySnapshotEx.name) &&
        Objects.equals(this.id, legacySnapshotEx.id) &&
        Objects.equals(this.wwn, legacySnapshotEx.wwn) &&
        Objects.equals(this.listOfMappings, legacySnapshotEx.listOfMappings) &&
        Objects.equals(this.mapped, legacySnapshotEx.mapped) &&
        Objects.equals(this.currentControllerId, legacySnapshotEx.currentControllerId) &&
        Objects.equals(this.onlineVolumeCopy, legacySnapshotEx.onlineVolumeCopy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worldWideName, snapshotRef, label, status, action, currentManager, baseVolume, repositoryVolume, fullWarnThreshold, overWarnThreshold, repositoryFull, repFullPolicy, rollbackPriority, extentStart, extentSize, snapshotTime, perms, childrenInactive, volumeHandle, mgmtClientAttribute, rollbackStatus, baseVolumeSizeInBytes, totalSizeInBytes, preferredControllerId, repositoryCapacity, volumeCopyTarget, volumeCopySource, pitBaseVolume, asyncMirrorTarget, asyncMirrorSource, protectionType, remoteMirrorSource, remoteMirrorTarget, objectType, name, id, wwn, listOfMappings, mapped, currentControllerId, onlineVolumeCopy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacySnapshotEx {\n");
    
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    snapshotRef: ").append(toIndentedString(snapshotRef)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    currentManager: ").append(toIndentedString(currentManager)).append("\n");
    sb.append("    baseVolume: ").append(toIndentedString(baseVolume)).append("\n");
    sb.append("    repositoryVolume: ").append(toIndentedString(repositoryVolume)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    overWarnThreshold: ").append(toIndentedString(overWarnThreshold)).append("\n");
    sb.append("    repositoryFull: ").append(toIndentedString(repositoryFull)).append("\n");
    sb.append("    repFullPolicy: ").append(toIndentedString(repFullPolicy)).append("\n");
    sb.append("    rollbackPriority: ").append(toIndentedString(rollbackPriority)).append("\n");
    sb.append("    extentStart: ").append(toIndentedString(extentStart)).append("\n");
    sb.append("    extentSize: ").append(toIndentedString(extentSize)).append("\n");
    sb.append("    snapshotTime: ").append(toIndentedString(snapshotTime)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    childrenInactive: ").append(toIndentedString(childrenInactive)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    mgmtClientAttribute: ").append(toIndentedString(mgmtClientAttribute)).append("\n");
    sb.append("    rollbackStatus: ").append(toIndentedString(rollbackStatus)).append("\n");
    sb.append("    baseVolumeSizeInBytes: ").append(toIndentedString(baseVolumeSizeInBytes)).append("\n");
    sb.append("    totalSizeInBytes: ").append(toIndentedString(totalSizeInBytes)).append("\n");
    sb.append("    preferredControllerId: ").append(toIndentedString(preferredControllerId)).append("\n");
    sb.append("    repositoryCapacity: ").append(toIndentedString(repositoryCapacity)).append("\n");
    sb.append("    volumeCopyTarget: ").append(toIndentedString(volumeCopyTarget)).append("\n");
    sb.append("    volumeCopySource: ").append(toIndentedString(volumeCopySource)).append("\n");
    sb.append("    pitBaseVolume: ").append(toIndentedString(pitBaseVolume)).append("\n");
    sb.append("    asyncMirrorTarget: ").append(toIndentedString(asyncMirrorTarget)).append("\n");
    sb.append("    asyncMirrorSource: ").append(toIndentedString(asyncMirrorSource)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    remoteMirrorSource: ").append(toIndentedString(remoteMirrorSource)).append("\n");
    sb.append("    remoteMirrorTarget: ").append(toIndentedString(remoteMirrorTarget)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    listOfMappings: ").append(toIndentedString(listOfMappings)).append("\n");
    sb.append("    mapped: ").append(toIndentedString(mapped)).append("\n");
    sb.append("    currentControllerId: ").append(toIndentedString(currentControllerId)).append("\n");
    sb.append("    onlineVolumeCopy: ").append(toIndentedString(onlineVolumeCopy)).append("\n");
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

