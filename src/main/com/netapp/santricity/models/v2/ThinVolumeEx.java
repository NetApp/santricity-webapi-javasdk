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
 * ThinVolumeEx
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ThinVolumeEx   {
  
    private Integer volumeHandle;

    private String worldWideName;

    private String label;

    private Integer allocationGranularity;

    private Long capacity;

    private Integer reconPriority;

    private String volumeRef;


  /**
   * The operational status of the volume.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    full("full"),
    overThresh("overThresh"),
    failed("failed"),
    initializing("initializing"),
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

    private String repositoryRef;

    private String currentManager;

    private String preferredManager;

    private VolumePerms perms;

    private Integer mgmtClientAttribute;

    private Boolean preReadRedundancyCheckEnabled;


  /**
   * The protection type of the volume.
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

    private Boolean applicationTagOwned;

    private Long maxVirtualCapacity;

    private Long initialProvisionedCapacity;

    private Long currentProvisionedCapacity;

    private Long provisionedCapacityQuota;

    private Integer growthAlertThreshold;


  /**
   * The automatic Expandable Repository Volume expansion policy.
   */
  public enum ExpansionPolicyEnum {
    unknown("unknown"),
    manual("manual"),
    automatic("automatic"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ExpansionPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ExpansionPolicyEnum expansionPolicy;

    private VolumeCache volumeCache;

    private Boolean offline;


  /**
   * Indicates how the thin volume is reported on the SCSI interface.
   */
  public enum ReportingPolicyEnum {
    unknown("unknown"),
    asThick("asThick"),
    asThin("asThin"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ReportingPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ReportingPolicyEnum reportingPolicy;

    private Boolean volumeFull;

    private String volumeGroupRef;

    private Integer blkSize;

    private String storageVolumeRef;

    private Boolean volumeCopyTarget;

    private Boolean volumeCopySource;

    private Boolean pitBaseVolume;

    private Boolean asyncMirrorTarget;

    private Boolean asyncMirrorSource;

    private Boolean remoteMirrorSource;

    private Boolean remoteMirrorTarget;

    private Boolean flashCached;

    private VolumeMediaScanParams mediaScan;

    private List<VolumeMetadataItem> metadata;

    private Boolean dataAssurance;


  /**
   * Gets or Sets objectType
   */
  public enum ObjectTypeEnum {
    unknown("unknown"),
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

    private String wwn;

    private Integer segmentSize;

    private Long totalSizeInBytes;

    private String currentControllerId;

    private Boolean diskPool;

    private VolumeCache cacheSettings;

    private Boolean thinProvisioned;

    private List<LUNMapping> listOfMappings;

    private Boolean mapped;

    private String preferredControllerId;

    private Boolean onlineVolumeCopy;

    private String name;

    private String id;

  
  /**
   * The volumeHandle (SSID) for this volume.
   **/
  public ThinVolumeEx volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volumeHandle (SSID) for this volume.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * The World wide name of the volume.
   **/
  public ThinVolumeEx worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The World wide name of the volume.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The name of the volume.
   **/
  public ThinVolumeEx label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the volume.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The allocation cluster size for the Expandable Repository Volume.
   **/
  public ThinVolumeEx allocationGranularity(Integer allocationGranularity) {
    this.allocationGranularity = allocationGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The allocation cluster size for the Expandable Repository Volume.")
  @JsonProperty("allocationGranularity")
  public Integer getAllocationGranularity() {
    return allocationGranularity;
  }
  
  public void setAllocationGranularity(Integer allocationGranularity) {
    this.allocationGranularity = allocationGranularity;
  }

  
  /**
   * The virtual capacity of the volume in bytes.
   **/
  public ThinVolumeEx capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The virtual capacity of the volume in bytes.")
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }
  
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  
  /**
   * Importance of fixing the volume if failed (0-4).
   **/
  public ThinVolumeEx reconPriority(Integer reconPriority) {
    this.reconPriority = reconPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Importance of fixing the volume if failed (0-4).")
  @JsonProperty("reconPriority")
  public Integer getReconPriority() {
    return reconPriority;
  }
  
  public void setReconPriority(Integer reconPriority) {
    this.reconPriority = reconPriority;
  }

  
  /**
   * The reference (key) for this volume.
   **/
  public ThinVolumeEx volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for this volume.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * The operational status of the volume.
   **/
  public ThinVolumeEx status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status of the volume.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The Expandable Repository Volume underlying this Thin Volume.
   **/
  public ThinVolumeEx repositoryRef(String repositoryRef) {
    this.repositoryRef = repositoryRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Expandable Repository Volume underlying this Thin Volume.")
  @JsonProperty("repositoryRef")
  public String getRepositoryRef() {
    return repositoryRef;
  }
  
  public void setRepositoryRef(String repositoryRef) {
    this.repositoryRef = repositoryRef;
  }

  
  /**
   * The controller that currently manages the volume.
   **/
  public ThinVolumeEx currentManager(String currentManager) {
    this.currentManager = currentManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that currently manages the volume.")
  @JsonProperty("currentManager")
  public String getCurrentManager() {
    return currentManager;
  }
  
  public void setCurrentManager(String currentManager) {
    this.currentManager = currentManager;
  }

  
  /**
   * The controller that should manage the volume.
   **/
  public ThinVolumeEx preferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that should manage the volume.")
  @JsonProperty("preferredManager")
  public String getPreferredManager() {
    return preferredManager;
  }
  
  public void setPreferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
  }

  
  /**
   * Operations allowed on this volume.
   **/
  public ThinVolumeEx perms(VolumePerms perms) {
    this.perms = perms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Operations allowed on this volume.")
  @JsonProperty("perms")
  public VolumePerms getPerms() {
    return perms;
  }
  
  public void setPerms(VolumePerms perms) {
    this.perms = perms;
  }

  
  /**
   * For use by management client.
   **/
  public ThinVolumeEx mgmtClientAttribute(Integer mgmtClientAttribute) {
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
   * If true, verify RAID redundancy on read operations.
   **/
  public ThinVolumeEx preReadRedundancyCheckEnabled(Boolean preReadRedundancyCheckEnabled) {
    this.preReadRedundancyCheckEnabled = preReadRedundancyCheckEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, verify RAID redundancy on read operations.")
  @JsonProperty("preReadRedundancyCheckEnabled")
  public Boolean getPreReadRedundancyCheckEnabled() {
    return preReadRedundancyCheckEnabled;
  }
  
  public void setPreReadRedundancyCheckEnabled(Boolean preReadRedundancyCheckEnabled) {
    this.preReadRedundancyCheckEnabled = preReadRedundancyCheckEnabled;
  }

  
  /**
   * The protection type of the volume.
   **/
  public ThinVolumeEx protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The protection type of the volume.")
  @JsonProperty("protectionType")
  public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }
  
  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  
  /**
   * True if application tag is owned by the storage array.
   **/
  public ThinVolumeEx applicationTagOwned(Boolean applicationTagOwned) {
    this.applicationTagOwned = applicationTagOwned;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if application tag is owned by the storage array.")
  @JsonProperty("applicationTagOwned")
  public Boolean getApplicationTagOwned() {
    return applicationTagOwned;
  }
  
  public void setApplicationTagOwned(Boolean applicationTagOwned) {
    this.applicationTagOwned = applicationTagOwned;
  }

  
  /**
   * The maximum virtual capacity to which this thin volume can grow (in bytes).
   **/
  public ThinVolumeEx maxVirtualCapacity(Long maxVirtualCapacity) {
    this.maxVirtualCapacity = maxVirtualCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum virtual capacity to which this thin volume can grow (in bytes).")
  @JsonProperty("maxVirtualCapacity")
  public Long getMaxVirtualCapacity() {
    return maxVirtualCapacity;
  }
  
  public void setMaxVirtualCapacity(Long maxVirtualCapacity) {
    this.maxVirtualCapacity = maxVirtualCapacity;
  }

  
  /**
   * The initial provisioned capacity for the Expandable Repository Volume for this thin volume (in bytes).
   **/
  public ThinVolumeEx initialProvisionedCapacity(Long initialProvisionedCapacity) {
    this.initialProvisionedCapacity = initialProvisionedCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The initial provisioned capacity for the Expandable Repository Volume for this thin volume (in bytes).")
  @JsonProperty("initialProvisionedCapacity")
  public Long getInitialProvisionedCapacity() {
    return initialProvisionedCapacity;
  }
  
  public void setInitialProvisionedCapacity(Long initialProvisionedCapacity) {
    this.initialProvisionedCapacity = initialProvisionedCapacity;
  }

  
  /**
   * The current provisioned capacity of the Expandable Repository Volume (in bytes).
   **/
  public ThinVolumeEx currentProvisionedCapacity(Long currentProvisionedCapacity) {
    this.currentProvisionedCapacity = currentProvisionedCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current provisioned capacity of the Expandable Repository Volume (in bytes).")
  @JsonProperty("currentProvisionedCapacity")
  public Long getCurrentProvisionedCapacity() {
    return currentProvisionedCapacity;
  }
  
  public void setCurrentProvisionedCapacity(Long currentProvisionedCapacity) {
    this.currentProvisionedCapacity = currentProvisionedCapacity;
  }

  
  /**
   * The maximum capacity of the Expandable Repository Volume (in bytes).
   **/
  public ThinVolumeEx provisionedCapacityQuota(Long provisionedCapacityQuota) {
    this.provisionedCapacityQuota = provisionedCapacityQuota;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum capacity of the Expandable Repository Volume (in bytes).")
  @JsonProperty("provisionedCapacityQuota")
  public Long getProvisionedCapacityQuota() {
    return provisionedCapacityQuota;
  }
  
  public void setProvisionedCapacityQuota(Long provisionedCapacityQuota) {
    this.provisionedCapacityQuota = provisionedCapacityQuota;
  }

  
  /**
   * The percent value at which an alert is generated.
   **/
  public ThinVolumeEx growthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The percent value at which an alert is generated.")
  @JsonProperty("growthAlertThreshold")
  public Integer getGrowthAlertThreshold() {
    return growthAlertThreshold;
  }
  
  public void setGrowthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
  }

  
  /**
   * The automatic Expandable Repository Volume expansion policy.
   **/
  public ThinVolumeEx expansionPolicy(ExpansionPolicyEnum expansionPolicy) {
    this.expansionPolicy = expansionPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The automatic Expandable Repository Volume expansion policy.")
  @JsonProperty("expansionPolicy")
  public ExpansionPolicyEnum getExpansionPolicy() {
    return expansionPolicy;
  }
  
  public void setExpansionPolicy(ExpansionPolicyEnum expansionPolicy) {
    this.expansionPolicy = expansionPolicy;
  }

  
  /**
   * The cache parameters of the underlying repository.
   **/
  public ThinVolumeEx volumeCache(VolumeCache volumeCache) {
    this.volumeCache = volumeCache;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cache parameters of the underlying repository.")
  @JsonProperty("volumeCache")
  public VolumeCache getVolumeCache() {
    return volumeCache;
  }
  
  public void setVolumeCache(VolumeCache volumeCache) {
    this.volumeCache = volumeCache;
  }

  
  /**
   * The thin volume is offline due to the associated repository volume state.
   **/
  public ThinVolumeEx offline(Boolean offline) {
    this.offline = offline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The thin volume is offline due to the associated repository volume state.")
  @JsonProperty("offline")
  public Boolean getOffline() {
    return offline;
  }
  
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   * Indicates how the thin volume is reported on the SCSI interface.
   **/
  public ThinVolumeEx reportingPolicy(ReportingPolicyEnum reportingPolicy) {
    this.reportingPolicy = reportingPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates how the thin volume is reported on the SCSI interface.")
  @JsonProperty("reportingPolicy")
  public ReportingPolicyEnum getReportingPolicy() {
    return reportingPolicy;
  }
  
  public void setReportingPolicy(ReportingPolicyEnum reportingPolicy) {
    this.reportingPolicy = reportingPolicy;
  }

  
  /**
   **/
  public ThinVolumeEx volumeFull(Boolean volumeFull) {
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
  public ThinVolumeEx volumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumeGroupRef")
  public String getVolumeGroupRef() {
    return volumeGroupRef;
  }
  
  public void setVolumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
  }

  
  /**
   **/
  public ThinVolumeEx blkSize(Integer blkSize) {
    this.blkSize = blkSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blkSize")
  public Integer getBlkSize() {
    return blkSize;
  }
  
  public void setBlkSize(Integer blkSize) {
    this.blkSize = blkSize;
  }

  
  /**
   **/
  public ThinVolumeEx storageVolumeRef(String storageVolumeRef) {
    this.storageVolumeRef = storageVolumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("storageVolumeRef")
  public String getStorageVolumeRef() {
    return storageVolumeRef;
  }
  
  public void setStorageVolumeRef(String storageVolumeRef) {
    this.storageVolumeRef = storageVolumeRef;
  }

  
  /**
   **/
  public ThinVolumeEx volumeCopyTarget(Boolean volumeCopyTarget) {
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
  public ThinVolumeEx volumeCopySource(Boolean volumeCopySource) {
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
  public ThinVolumeEx pitBaseVolume(Boolean pitBaseVolume) {
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
  public ThinVolumeEx asyncMirrorTarget(Boolean asyncMirrorTarget) {
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
  public ThinVolumeEx asyncMirrorSource(Boolean asyncMirrorSource) {
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
   * True if the volume is a source (primary), in an Remote Volume Mirror relationship.
   **/
  public ThinVolumeEx remoteMirrorSource(Boolean remoteMirrorSource) {
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
  public ThinVolumeEx remoteMirrorTarget(Boolean remoteMirrorTarget) {
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
   * True if this volume is added to a flashCache.
   **/
  public ThinVolumeEx flashCached(Boolean flashCached) {
    this.flashCached = flashCached;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this volume is added to a flashCache.")
  @JsonProperty("flashCached")
  public Boolean getFlashCached() {
    return flashCached;
  }
  
  public void setFlashCached(Boolean flashCached) {
    this.flashCached = flashCached;
  }

  
  /**
   **/
  public ThinVolumeEx mediaScan(VolumeMediaScanParams mediaScan) {
    this.mediaScan = mediaScan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaScan")
  public VolumeMediaScanParams getMediaScan() {
    return mediaScan;
  }
  
  public void setMediaScan(VolumeMediaScanParams mediaScan) {
    this.mediaScan = mediaScan;
  }

  
  /**
   * Metadata associated with the volume
   **/
  public ThinVolumeEx metadata(List<VolumeMetadataItem> metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata associated with the volume")
  @JsonProperty("metadata")
  public List<VolumeMetadataItem> getMetadata() {
    return metadata;
  }
  
  public void setMetadata(List<VolumeMetadataItem> metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  public ThinVolumeEx dataAssurance(Boolean dataAssurance) {
    this.dataAssurance = dataAssurance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataAssurance")
  public Boolean getDataAssurance() {
    return dataAssurance;
  }
  
  public void setDataAssurance(Boolean dataAssurance) {
    this.dataAssurance = dataAssurance;
  }

  
  /**
   **/
  public ThinVolumeEx objectType(ObjectTypeEnum objectType) {
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
  public ThinVolumeEx wwn(String wwn) {
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
  public ThinVolumeEx segmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segmentSize")
  public Integer getSegmentSize() {
    return segmentSize;
  }
  
  public void setSegmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
  }

  
  /**
   **/
  public ThinVolumeEx totalSizeInBytes(Long totalSizeInBytes) {
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
  public ThinVolumeEx currentControllerId(String currentControllerId) {
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
  public ThinVolumeEx diskPool(Boolean diskPool) {
    this.diskPool = diskPool;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("diskPool")
  public Boolean getDiskPool() {
    return diskPool;
  }
  
  public void setDiskPool(Boolean diskPool) {
    this.diskPool = diskPool;
  }

  
  /**
   * The volume-specific caching parameters currently in effect for the volume.
   **/
  public ThinVolumeEx cacheSettings(VolumeCache cacheSettings) {
    this.cacheSettings = cacheSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume-specific caching parameters currently in effect for the volume.")
  @JsonProperty("cacheSettings")
  public VolumeCache getCacheSettings() {
    return cacheSettings;
  }
  
  public void setCacheSettings(VolumeCache cacheSettings) {
    this.cacheSettings = cacheSettings;
  }

  
  /**
   **/
  public ThinVolumeEx thinProvisioned(Boolean thinProvisioned) {
    this.thinProvisioned = thinProvisioned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thinProvisioned")
  public Boolean getThinProvisioned() {
    return thinProvisioned;
  }
  
  public void setThinProvisioned(Boolean thinProvisioned) {
    this.thinProvisioned = thinProvisioned;
  }

  
  /**
   **/
  public ThinVolumeEx listOfMappings(List<LUNMapping> listOfMappings) {
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
  public ThinVolumeEx mapped(Boolean mapped) {
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
  public ThinVolumeEx preferredControllerId(String preferredControllerId) {
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
  public ThinVolumeEx onlineVolumeCopy(Boolean onlineVolumeCopy) {
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

  
  /**
   **/
  public ThinVolumeEx name(String name) {
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
  public ThinVolumeEx id(String id) {
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
    ThinVolumeEx thinVolumeEx = (ThinVolumeEx) o;
    return Objects.equals(this.volumeHandle, thinVolumeEx.volumeHandle) &&
        Objects.equals(this.worldWideName, thinVolumeEx.worldWideName) &&
        Objects.equals(this.label, thinVolumeEx.label) &&
        Objects.equals(this.allocationGranularity, thinVolumeEx.allocationGranularity) &&
        Objects.equals(this.capacity, thinVolumeEx.capacity) &&
        Objects.equals(this.reconPriority, thinVolumeEx.reconPriority) &&
        Objects.equals(this.volumeRef, thinVolumeEx.volumeRef) &&
        Objects.equals(this.status, thinVolumeEx.status) &&
        Objects.equals(this.repositoryRef, thinVolumeEx.repositoryRef) &&
        Objects.equals(this.currentManager, thinVolumeEx.currentManager) &&
        Objects.equals(this.preferredManager, thinVolumeEx.preferredManager) &&
        Objects.equals(this.perms, thinVolumeEx.perms) &&
        Objects.equals(this.mgmtClientAttribute, thinVolumeEx.mgmtClientAttribute) &&
        Objects.equals(this.preReadRedundancyCheckEnabled, thinVolumeEx.preReadRedundancyCheckEnabled) &&
        Objects.equals(this.protectionType, thinVolumeEx.protectionType) &&
        Objects.equals(this.applicationTagOwned, thinVolumeEx.applicationTagOwned) &&
        Objects.equals(this.maxVirtualCapacity, thinVolumeEx.maxVirtualCapacity) &&
        Objects.equals(this.initialProvisionedCapacity, thinVolumeEx.initialProvisionedCapacity) &&
        Objects.equals(this.currentProvisionedCapacity, thinVolumeEx.currentProvisionedCapacity) &&
        Objects.equals(this.provisionedCapacityQuota, thinVolumeEx.provisionedCapacityQuota) &&
        Objects.equals(this.growthAlertThreshold, thinVolumeEx.growthAlertThreshold) &&
        Objects.equals(this.expansionPolicy, thinVolumeEx.expansionPolicy) &&
        Objects.equals(this.volumeCache, thinVolumeEx.volumeCache) &&
        Objects.equals(this.offline, thinVolumeEx.offline) &&
        Objects.equals(this.reportingPolicy, thinVolumeEx.reportingPolicy) &&
        Objects.equals(this.volumeFull, thinVolumeEx.volumeFull) &&
        Objects.equals(this.volumeGroupRef, thinVolumeEx.volumeGroupRef) &&
        Objects.equals(this.blkSize, thinVolumeEx.blkSize) &&
        Objects.equals(this.storageVolumeRef, thinVolumeEx.storageVolumeRef) &&
        Objects.equals(this.volumeCopyTarget, thinVolumeEx.volumeCopyTarget) &&
        Objects.equals(this.volumeCopySource, thinVolumeEx.volumeCopySource) &&
        Objects.equals(this.pitBaseVolume, thinVolumeEx.pitBaseVolume) &&
        Objects.equals(this.asyncMirrorTarget, thinVolumeEx.asyncMirrorTarget) &&
        Objects.equals(this.asyncMirrorSource, thinVolumeEx.asyncMirrorSource) &&
        Objects.equals(this.remoteMirrorSource, thinVolumeEx.remoteMirrorSource) &&
        Objects.equals(this.remoteMirrorTarget, thinVolumeEx.remoteMirrorTarget) &&
        Objects.equals(this.flashCached, thinVolumeEx.flashCached) &&
        Objects.equals(this.mediaScan, thinVolumeEx.mediaScan) &&
        Objects.equals(this.metadata, thinVolumeEx.metadata) &&
        Objects.equals(this.dataAssurance, thinVolumeEx.dataAssurance) &&
        Objects.equals(this.objectType, thinVolumeEx.objectType) &&
        Objects.equals(this.wwn, thinVolumeEx.wwn) &&
        Objects.equals(this.segmentSize, thinVolumeEx.segmentSize) &&
        Objects.equals(this.totalSizeInBytes, thinVolumeEx.totalSizeInBytes) &&
        Objects.equals(this.currentControllerId, thinVolumeEx.currentControllerId) &&
        Objects.equals(this.diskPool, thinVolumeEx.diskPool) &&
        Objects.equals(this.cacheSettings, thinVolumeEx.cacheSettings) &&
        Objects.equals(this.thinProvisioned, thinVolumeEx.thinProvisioned) &&
        Objects.equals(this.listOfMappings, thinVolumeEx.listOfMappings) &&
        Objects.equals(this.mapped, thinVolumeEx.mapped) &&
        Objects.equals(this.preferredControllerId, thinVolumeEx.preferredControllerId) &&
        Objects.equals(this.onlineVolumeCopy, thinVolumeEx.onlineVolumeCopy) &&
        Objects.equals(this.name, thinVolumeEx.name) &&
        Objects.equals(this.id, thinVolumeEx.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeHandle, worldWideName, label, allocationGranularity, capacity, reconPriority, volumeRef, status, repositoryRef, currentManager, preferredManager, perms, mgmtClientAttribute, preReadRedundancyCheckEnabled, protectionType, applicationTagOwned, maxVirtualCapacity, initialProvisionedCapacity, currentProvisionedCapacity, provisionedCapacityQuota, growthAlertThreshold, expansionPolicy, volumeCache, offline, reportingPolicy, volumeFull, volumeGroupRef, blkSize, storageVolumeRef, volumeCopyTarget, volumeCopySource, pitBaseVolume, asyncMirrorTarget, asyncMirrorSource, remoteMirrorSource, remoteMirrorTarget, flashCached, mediaScan, metadata, dataAssurance, objectType, wwn, segmentSize, totalSizeInBytes, currentControllerId, diskPool, cacheSettings, thinProvisioned, listOfMappings, mapped, preferredControllerId, onlineVolumeCopy, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinVolumeEx {\n");
    
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    allocationGranularity: ").append(toIndentedString(allocationGranularity)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    reconPriority: ").append(toIndentedString(reconPriority)).append("\n");
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    repositoryRef: ").append(toIndentedString(repositoryRef)).append("\n");
    sb.append("    currentManager: ").append(toIndentedString(currentManager)).append("\n");
    sb.append("    preferredManager: ").append(toIndentedString(preferredManager)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    mgmtClientAttribute: ").append(toIndentedString(mgmtClientAttribute)).append("\n");
    sb.append("    preReadRedundancyCheckEnabled: ").append(toIndentedString(preReadRedundancyCheckEnabled)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    applicationTagOwned: ").append(toIndentedString(applicationTagOwned)).append("\n");
    sb.append("    maxVirtualCapacity: ").append(toIndentedString(maxVirtualCapacity)).append("\n");
    sb.append("    initialProvisionedCapacity: ").append(toIndentedString(initialProvisionedCapacity)).append("\n");
    sb.append("    currentProvisionedCapacity: ").append(toIndentedString(currentProvisionedCapacity)).append("\n");
    sb.append("    provisionedCapacityQuota: ").append(toIndentedString(provisionedCapacityQuota)).append("\n");
    sb.append("    growthAlertThreshold: ").append(toIndentedString(growthAlertThreshold)).append("\n");
    sb.append("    expansionPolicy: ").append(toIndentedString(expansionPolicy)).append("\n");
    sb.append("    volumeCache: ").append(toIndentedString(volumeCache)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    reportingPolicy: ").append(toIndentedString(reportingPolicy)).append("\n");
    sb.append("    volumeFull: ").append(toIndentedString(volumeFull)).append("\n");
    sb.append("    volumeGroupRef: ").append(toIndentedString(volumeGroupRef)).append("\n");
    sb.append("    blkSize: ").append(toIndentedString(blkSize)).append("\n");
    sb.append("    storageVolumeRef: ").append(toIndentedString(storageVolumeRef)).append("\n");
    sb.append("    volumeCopyTarget: ").append(toIndentedString(volumeCopyTarget)).append("\n");
    sb.append("    volumeCopySource: ").append(toIndentedString(volumeCopySource)).append("\n");
    sb.append("    pitBaseVolume: ").append(toIndentedString(pitBaseVolume)).append("\n");
    sb.append("    asyncMirrorTarget: ").append(toIndentedString(asyncMirrorTarget)).append("\n");
    sb.append("    asyncMirrorSource: ").append(toIndentedString(asyncMirrorSource)).append("\n");
    sb.append("    remoteMirrorSource: ").append(toIndentedString(remoteMirrorSource)).append("\n");
    sb.append("    remoteMirrorTarget: ").append(toIndentedString(remoteMirrorTarget)).append("\n");
    sb.append("    flashCached: ").append(toIndentedString(flashCached)).append("\n");
    sb.append("    mediaScan: ").append(toIndentedString(mediaScan)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dataAssurance: ").append(toIndentedString(dataAssurance)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    segmentSize: ").append(toIndentedString(segmentSize)).append("\n");
    sb.append("    totalSizeInBytes: ").append(toIndentedString(totalSizeInBytes)).append("\n");
    sb.append("    currentControllerId: ").append(toIndentedString(currentControllerId)).append("\n");
    sb.append("    diskPool: ").append(toIndentedString(diskPool)).append("\n");
    sb.append("    cacheSettings: ").append(toIndentedString(cacheSettings)).append("\n");
    sb.append("    thinProvisioned: ").append(toIndentedString(thinProvisioned)).append("\n");
    sb.append("    listOfMappings: ").append(toIndentedString(listOfMappings)).append("\n");
    sb.append("    mapped: ").append(toIndentedString(mapped)).append("\n");
    sb.append("    preferredControllerId: ").append(toIndentedString(preferredControllerId)).append("\n");
    sb.append("    onlineVolumeCopy: ").append(toIndentedString(onlineVolumeCopy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

