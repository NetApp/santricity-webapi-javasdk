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
 * PitViewEx
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class PitViewEx   {
  
    private String viewRef;

    private String worldWideName;

    private String baseVol;

    private String basePIT;

    private Boolean boundToPIT;


  /**
   * The view access mode.
   */
  public enum AccessModeEnum {
    modeUnknown("modeUnknown"),
    readWrite("readWrite"),
    readOnly("readOnly"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    AccessModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AccessModeEnum accessMode;

    private String label;


  /**
   * The view status.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    stopped("stopped"),
    failed("failed"),
    overThreshold("overThreshold"),
    full("full"),
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

    private String currentManager;

    private String preferredManager;

    private String repositoryVolume;

    private Integer fullWarnThreshold;

    private Long viewTime;

    private Long viewSequenceNumber;

    private VolumePerms perms;

    private Integer volumeHandle;

    private Integer clusterSize;

    private Long maxRepositoryCapacity;

    private Long unusableRepositoryCapacity;

    private PITViewMembership membership;

    private Integer mgmtClientAttribute;

    private Boolean offline;

    private Boolean volumeFull;

    private Long repositoryCapacity;

    private Long baseVolumeCapacity;

    private Long totalSizeInBytes;

    private String consistencyGroupId;

    private Boolean volumeCopyTarget;

    private Boolean cloneCopy;

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

    private String preferredControllerId;

    private Boolean onlineVolumeCopy;

  
  /**
   * The reference (key) for this view.
   **/
  public PitViewEx viewRef(String viewRef) {
    this.viewRef = viewRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for this view.")
  @JsonProperty("viewRef")
  public String getViewRef() {
    return viewRef;
  }
  
  public void setViewRef(String viewRef) {
    this.viewRef = viewRef;
  }

  
  /**
   * The WWN of the view.
   **/
  public PitViewEx worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the view.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * A reference to the base volume with which this view is associated.
   **/
  public PitViewEx baseVol(String baseVol) {
    this.baseVol = baseVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the base volume with which this view is associated.")
  @JsonProperty("baseVol")
  public String getBaseVol() {
    return baseVol;
  }
  
  public void setBaseVol(String baseVol) {
    this.baseVol = baseVol;
  }

  
  /**
   * A reference to the particular PiT of the base for which this view applies. This field is only valid if the boundToPIT field is true.
   **/
  public PitViewEx basePIT(String basePIT) {
    this.basePIT = basePIT;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the particular PiT of the base for which this view applies. This field is only valid if the boundToPIT field is true.")
  @JsonProperty("basePIT")
  public String getBasePIT() {
    return basePIT;
  }
  
  public void setBasePIT(String basePIT) {
    this.basePIT = basePIT;
  }

  
  /**
   * If true, this flag indicates that the basePIT field is a valid reference to an associated PIT. If false, the view is disassociated from the PiT so the basePIT reference is invalid.
   **/
  public PitViewEx boundToPIT(Boolean boundToPIT) {
    this.boundToPIT = boundToPIT;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, this flag indicates that the basePIT field is a valid reference to an associated PIT. If false, the view is disassociated from the PiT so the basePIT reference is invalid.")
  @JsonProperty("boundToPIT")
  public Boolean getBoundToPIT() {
    return boundToPIT;
  }
  
  public void setBoundToPIT(Boolean boundToPIT) {
    this.boundToPIT = boundToPIT;
  }

  
  /**
   * The view access mode.
   **/
  public PitViewEx accessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The view access mode.")
  @JsonProperty("accessMode")
  public AccessModeEnum getAccessMode() {
    return accessMode;
  }
  
  public void setAccessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
  }

  
  /**
   * The name of the view.
   **/
  public PitViewEx label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the view.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The view status.
   **/
  public PitViewEx status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The view status.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The current owner of the view.
   **/
  public PitViewEx currentManager(String currentManager) {
    this.currentManager = currentManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current owner of the view.")
  @JsonProperty("currentManager")
  public String getCurrentManager() {
    return currentManager;
  }
  
  public void setCurrentManager(String currentManager) {
    this.currentManager = currentManager;
  }

  
  /**
   * The preferred owner of the view.
   **/
  public PitViewEx preferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The preferred owner of the view.")
  @JsonProperty("preferredManager")
  public String getPreferredManager() {
    return preferredManager;
  }
  
  public void setPreferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
  }

  
  /**
   * The copy-on-write repository for this view.
   **/
  public PitViewEx repositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The copy-on-write repository for this view.")
  @JsonProperty("repositoryVolume")
  public String getRepositoryVolume() {
    return repositoryVolume;
  }
  
  public void setRepositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
  }

  
  /**
   * The repository utilization warning threshold percentage.
   **/
  public PitViewEx fullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold percentage.")
  @JsonProperty("fullWarnThreshold")
  public Integer getFullWarnThreshold() {
    return fullWarnThreshold;
  }
  
  public void setFullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
  }

  
  /**
   * The controller-time (measured in seconds since January 1, 1970) when view was created or re-attached to another PiT.
   **/
  public PitViewEx viewTime(Long viewTime) {
    this.viewTime = viewTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller-time (measured in seconds since January 1, 1970) when view was created or re-attached to another PiT.")
  @JsonProperty("viewTime")
  public Long getViewTime() {
    return viewTime;
  }
  
  public void setViewTime(Long viewTime) {
    this.viewTime = viewTime;
  }

  
  /**
   * Sequence number. This is a monotonically increasing sequence value that can be used to determine related views when the view was created as part of a consistency group operation.
   **/
  public PitViewEx viewSequenceNumber(Long viewSequenceNumber) {
    this.viewSequenceNumber = viewSequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sequence number. This is a monotonically increasing sequence value that can be used to determine related views when the view was created as part of a consistency group operation.")
  @JsonProperty("viewSequenceNumber")
  public Long getViewSequenceNumber() {
    return viewSequenceNumber;
  }
  
  public void setViewSequenceNumber(Long viewSequenceNumber) {
    this.viewSequenceNumber = viewSequenceNumber;
  }

  
  /**
   * The permissions for the view.
   **/
  public PitViewEx perms(VolumePerms perms) {
    this.perms = perms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The permissions for the view.")
  @JsonProperty("perms")
  public VolumePerms getPerms() {
    return perms;
  }
  
  public void setPerms(VolumePerms perms) {
    this.perms = perms;
  }

  
  /**
   * The volume ssid. This is provided primarily for debug purposes.
   **/
  public PitViewEx volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume ssid. This is provided primarily for debug purposes.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * The cluster size in bytes.
   **/
  public PitViewEx clusterSize(Integer clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cluster size in bytes.")
  @JsonProperty("clusterSize")
  public Integer getClusterSize() {
    return clusterSize;
  }
  
  public void setClusterSize(Integer clusterSize) {
    this.clusterSize = clusterSize;
  }

  
  /**
   * The maximum allowable repository size in bytes based on current cluster size.
   **/
  public PitViewEx maxRepositoryCapacity(Long maxRepositoryCapacity) {
    this.maxRepositoryCapacity = maxRepositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum allowable repository size in bytes based on current cluster size.")
  @JsonProperty("maxRepositoryCapacity")
  public Long getMaxRepositoryCapacity() {
    return maxRepositoryCapacity;
  }
  
  public void setMaxRepositoryCapacity(Long maxRepositoryCapacity) {
    this.maxRepositoryCapacity = maxRepositoryCapacity;
  }

  
  /**
   * The amount of repository capacity in bytes that is unusable due to limited addressability of the current cluster size.
   **/
  public PitViewEx unusableRepositoryCapacity(Long unusableRepositoryCapacity) {
    this.unusableRepositoryCapacity = unusableRepositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of repository capacity in bytes that is unusable due to limited addressability of the current cluster size.")
  @JsonProperty("unusableRepositoryCapacity")
  public Long getUnusableRepositoryCapacity() {
    return unusableRepositoryCapacity;
  }
  
  public void setUnusableRepositoryCapacity(Long unusableRepositoryCapacity) {
    this.unusableRepositoryCapacity = unusableRepositoryCapacity;
  }

  
  /**
   * This view's relationship (if any) to a Consistency Group View.
   **/
  public PitViewEx membership(PITViewMembership membership) {
    this.membership = membership;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This view's relationship (if any) to a Consistency Group View.")
  @JsonProperty("membership")
  public PITViewMembership getMembership() {
    return membership;
  }
  
  public void setMembership(PITViewMembership membership) {
    this.membership = membership;
  }

  
  /**
   * The management client attribute.
   **/
  public PitViewEx mgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management client attribute.")
  @JsonProperty("mgmtClientAttribute")
  public Integer getMgmtClientAttribute() {
    return mgmtClientAttribute;
  }
  
  public void setMgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
  }

  
  /**
   * The view is offline due to the associated repository volume state.
   **/
  public PitViewEx offline(Boolean offline) {
    this.offline = offline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The view is offline due to the associated repository volume state.")
  @JsonProperty("offline")
  public Boolean getOffline() {
    return offline;
  }
  
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   **/
  public PitViewEx volumeFull(Boolean volumeFull) {
    this.volumeFull = volumeFull;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumeFull")
  public Boolean getVolumeFull() {
    return volumeFull;
  }
  
  public void setVolumeFull(Boolean volumeFull) {
    this.volumeFull = volumeFull;
  }

  
  /**
   **/
  public PitViewEx repositoryCapacity(Long repositoryCapacity) {
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
  public PitViewEx baseVolumeCapacity(Long baseVolumeCapacity) {
    this.baseVolumeCapacity = baseVolumeCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("baseVolumeCapacity")
  public Long getBaseVolumeCapacity() {
    return baseVolumeCapacity;
  }
  
  public void setBaseVolumeCapacity(Long baseVolumeCapacity) {
    this.baseVolumeCapacity = baseVolumeCapacity;
  }

  
  /**
   **/
  public PitViewEx totalSizeInBytes(Long totalSizeInBytes) {
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
  public PitViewEx consistencyGroupId(String consistencyGroupId) {
    this.consistencyGroupId = consistencyGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("consistencyGroupId")
  public String getConsistencyGroupId() {
    return consistencyGroupId;
  }
  
  public void setConsistencyGroupId(String consistencyGroupId) {
    this.consistencyGroupId = consistencyGroupId;
  }

  
  /**
   **/
  public PitViewEx volumeCopyTarget(Boolean volumeCopyTarget) {
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
  public PitViewEx cloneCopy(Boolean cloneCopy) {
    this.cloneCopy = cloneCopy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cloneCopy")
  public Boolean getCloneCopy() {
    return cloneCopy;
  }
  
  public void setCloneCopy(Boolean cloneCopy) {
    this.cloneCopy = cloneCopy;
  }

  
  /**
   **/
  public PitViewEx volumeCopySource(Boolean volumeCopySource) {
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
  public PitViewEx pitBaseVolume(Boolean pitBaseVolume) {
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
  public PitViewEx asyncMirrorTarget(Boolean asyncMirrorTarget) {
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
  public PitViewEx asyncMirrorSource(Boolean asyncMirrorSource) {
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
  public PitViewEx protectionType(ProtectionTypeEnum protectionType) {
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
  public PitViewEx remoteMirrorSource(Boolean remoteMirrorSource) {
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
  public PitViewEx remoteMirrorTarget(Boolean remoteMirrorTarget) {
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
  public PitViewEx objectType(ObjectTypeEnum objectType) {
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
  public PitViewEx name(String name) {
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
  public PitViewEx id(String id) {
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
  public PitViewEx wwn(String wwn) {
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
  public PitViewEx listOfMappings(List<LUNMapping> listOfMappings) {
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
  public PitViewEx mapped(Boolean mapped) {
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
  public PitViewEx currentControllerId(String currentControllerId) {
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
  public PitViewEx preferredControllerId(String preferredControllerId) {
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
  public PitViewEx onlineVolumeCopy(Boolean onlineVolumeCopy) {
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
    PitViewEx pitViewEx = (PitViewEx) o;
    return Objects.equals(this.viewRef, pitViewEx.viewRef) &&
        Objects.equals(this.worldWideName, pitViewEx.worldWideName) &&
        Objects.equals(this.baseVol, pitViewEx.baseVol) &&
        Objects.equals(this.basePIT, pitViewEx.basePIT) &&
        Objects.equals(this.boundToPIT, pitViewEx.boundToPIT) &&
        Objects.equals(this.accessMode, pitViewEx.accessMode) &&
        Objects.equals(this.label, pitViewEx.label) &&
        Objects.equals(this.status, pitViewEx.status) &&
        Objects.equals(this.currentManager, pitViewEx.currentManager) &&
        Objects.equals(this.preferredManager, pitViewEx.preferredManager) &&
        Objects.equals(this.repositoryVolume, pitViewEx.repositoryVolume) &&
        Objects.equals(this.fullWarnThreshold, pitViewEx.fullWarnThreshold) &&
        Objects.equals(this.viewTime, pitViewEx.viewTime) &&
        Objects.equals(this.viewSequenceNumber, pitViewEx.viewSequenceNumber) &&
        Objects.equals(this.perms, pitViewEx.perms) &&
        Objects.equals(this.volumeHandle, pitViewEx.volumeHandle) &&
        Objects.equals(this.clusterSize, pitViewEx.clusterSize) &&
        Objects.equals(this.maxRepositoryCapacity, pitViewEx.maxRepositoryCapacity) &&
        Objects.equals(this.unusableRepositoryCapacity, pitViewEx.unusableRepositoryCapacity) &&
        Objects.equals(this.membership, pitViewEx.membership) &&
        Objects.equals(this.mgmtClientAttribute, pitViewEx.mgmtClientAttribute) &&
        Objects.equals(this.offline, pitViewEx.offline) &&
        Objects.equals(this.volumeFull, pitViewEx.volumeFull) &&
        Objects.equals(this.repositoryCapacity, pitViewEx.repositoryCapacity) &&
        Objects.equals(this.baseVolumeCapacity, pitViewEx.baseVolumeCapacity) &&
        Objects.equals(this.totalSizeInBytes, pitViewEx.totalSizeInBytes) &&
        Objects.equals(this.consistencyGroupId, pitViewEx.consistencyGroupId) &&
        Objects.equals(this.volumeCopyTarget, pitViewEx.volumeCopyTarget) &&
        Objects.equals(this.cloneCopy, pitViewEx.cloneCopy) &&
        Objects.equals(this.volumeCopySource, pitViewEx.volumeCopySource) &&
        Objects.equals(this.pitBaseVolume, pitViewEx.pitBaseVolume) &&
        Objects.equals(this.asyncMirrorTarget, pitViewEx.asyncMirrorTarget) &&
        Objects.equals(this.asyncMirrorSource, pitViewEx.asyncMirrorSource) &&
        Objects.equals(this.protectionType, pitViewEx.protectionType) &&
        Objects.equals(this.remoteMirrorSource, pitViewEx.remoteMirrorSource) &&
        Objects.equals(this.remoteMirrorTarget, pitViewEx.remoteMirrorTarget) &&
        Objects.equals(this.objectType, pitViewEx.objectType) &&
        Objects.equals(this.name, pitViewEx.name) &&
        Objects.equals(this.id, pitViewEx.id) &&
        Objects.equals(this.wwn, pitViewEx.wwn) &&
        Objects.equals(this.listOfMappings, pitViewEx.listOfMappings) &&
        Objects.equals(this.mapped, pitViewEx.mapped) &&
        Objects.equals(this.currentControllerId, pitViewEx.currentControllerId) &&
        Objects.equals(this.preferredControllerId, pitViewEx.preferredControllerId) &&
        Objects.equals(this.onlineVolumeCopy, pitViewEx.onlineVolumeCopy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewRef, worldWideName, baseVol, basePIT, boundToPIT, accessMode, label, status, currentManager, preferredManager, repositoryVolume, fullWarnThreshold, viewTime, viewSequenceNumber, perms, volumeHandle, clusterSize, maxRepositoryCapacity, unusableRepositoryCapacity, membership, mgmtClientAttribute, offline, volumeFull, repositoryCapacity, baseVolumeCapacity, totalSizeInBytes, consistencyGroupId, volumeCopyTarget, cloneCopy, volumeCopySource, pitBaseVolume, asyncMirrorTarget, asyncMirrorSource, protectionType, remoteMirrorSource, remoteMirrorTarget, objectType, name, id, wwn, listOfMappings, mapped, currentControllerId, preferredControllerId, onlineVolumeCopy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PitViewEx {\n");
    
    sb.append("    viewRef: ").append(toIndentedString(viewRef)).append("\n");
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    baseVol: ").append(toIndentedString(baseVol)).append("\n");
    sb.append("    basePIT: ").append(toIndentedString(basePIT)).append("\n");
    sb.append("    boundToPIT: ").append(toIndentedString(boundToPIT)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currentManager: ").append(toIndentedString(currentManager)).append("\n");
    sb.append("    preferredManager: ").append(toIndentedString(preferredManager)).append("\n");
    sb.append("    repositoryVolume: ").append(toIndentedString(repositoryVolume)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    viewTime: ").append(toIndentedString(viewTime)).append("\n");
    sb.append("    viewSequenceNumber: ").append(toIndentedString(viewSequenceNumber)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
    sb.append("    maxRepositoryCapacity: ").append(toIndentedString(maxRepositoryCapacity)).append("\n");
    sb.append("    unusableRepositoryCapacity: ").append(toIndentedString(unusableRepositoryCapacity)).append("\n");
    sb.append("    membership: ").append(toIndentedString(membership)).append("\n");
    sb.append("    mgmtClientAttribute: ").append(toIndentedString(mgmtClientAttribute)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    volumeFull: ").append(toIndentedString(volumeFull)).append("\n");
    sb.append("    repositoryCapacity: ").append(toIndentedString(repositoryCapacity)).append("\n");
    sb.append("    baseVolumeCapacity: ").append(toIndentedString(baseVolumeCapacity)).append("\n");
    sb.append("    totalSizeInBytes: ").append(toIndentedString(totalSizeInBytes)).append("\n");
    sb.append("    consistencyGroupId: ").append(toIndentedString(consistencyGroupId)).append("\n");
    sb.append("    volumeCopyTarget: ").append(toIndentedString(volumeCopyTarget)).append("\n");
    sb.append("    cloneCopy: ").append(toIndentedString(cloneCopy)).append("\n");
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
    sb.append("    preferredControllerId: ").append(toIndentedString(preferredControllerId)).append("\n");
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

