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
 * VolumeEx
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class VolumeEx   {
  
    private Boolean offline;

    private Boolean extremeProtection;

    private Integer volumeHandle;


  /**
   * The RAID level for which this volume is configured.
   */
  public enum RaidLevelEnum {
    raidUnsupported("raidUnsupported"),
    raidAll("raidAll"),
    raid0("raid0"),
    raid1("raid1"),
    raid3("raid3"),
    raid5("raid5"),
    raid6("raid6"),
    raidDiskPool("raidDiskPool"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RaidLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RaidLevelEnum raidLevel;

    private Long sectorOffset;

    private String worldWideName;

    private String label;

    private Integer blkSize;

    private Long capacity;

    private Integer reconPriority;

    private Integer segmentSize;


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

    private VolumeCache cache;

    private VolumeMediaScanParams mediaScan;

    private String volumeRef;


  /**
   * The current operational state of the volume.
   */
  public enum StatusEnum {
    optimal("optimal"),
    degraded("degraded"),
    failed("failed"),
    impaired("impaired"),
    creating("creating"),
    deleting("deleting"),
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

    private String volumeGroupRef;

    private String currentManager;

    private String preferredManager;

    private VolumePerms perms;

    private Integer mgmtClientAttribute;

    private Boolean dssPreallocEnabled;

    private Integer dssMaxSegmentSize;

    private Boolean preReadRedundancyCheckEnabled;

    private Boolean protectionInformationCapable;


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

    private Integer repairedBlockCount;


  /**
   * Gets or Sets volumeUse
   */
  public enum VolumeUseEnum {
    standardVolume("standardVolume"),
    repositoryVolume("repositoryVolume"),
    mirrorTargetVolume("mirrorTargetVolume"),
    mirrorSourceVolume("mirrorSourceVolume"),
    concatVolume("concatVolume"),
    freeRepositoryVolume("freeRepositoryVolume"),
    asyncMirrorSourceVolume("asyncMirrorSourceVolume"),
    asyncMirrorTargetVolume("asyncMirrorTargetVolume");
;
    private String value;

    VolumeUseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private VolumeUseEnum volumeUse;

    private Boolean volumeFull;

    private Boolean volumeCopyTarget;

    private Boolean volumeCopySource;

    private Boolean pitBaseVolume;

    private Boolean asyncMirrorTarget;

    private Boolean asyncMirrorSource;

    private Boolean remoteMirrorSource;

    private Boolean remoteMirrorTarget;

    private Boolean diskPool;

    private Boolean flashCached;

    private Long increasingBy;

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

    private Long totalSizeInBytes;

    private String currentControllerId;

    private VolumeCache cacheSettings;

    private Boolean thinProvisioned;

    private List<LUNMapping> listOfMappings;

    private Boolean mapped;

    private String preferredControllerId;

    private Boolean onlineVolumeCopy;

    private String name;

    private String id;

  
  /**
   * An indication of whether the volume is currently offline.
   **/
  public VolumeEx offline(Boolean offline) {
    this.offline = offline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether the volume is currently offline.")
  @JsonProperty("offline")
  public Boolean getOffline() {
    return offline;
  }
  
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   * An indication of whether the volume is configured for extreme protection. Such configurations generally call for extensive consistency checks and parity validations with each I/O request to the volume.
   **/
  public VolumeEx extremeProtection(Boolean extremeProtection) {
    this.extremeProtection = extremeProtection;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether the volume is configured for extreme protection. Such configurations generally call for extensive consistency checks and parity validations with each I/O request to the volume.")
  @JsonProperty("extremeProtection")
  public Boolean getExtremeProtection() {
    return extremeProtection;
  }
  
  public void setExtremeProtection(Boolean extremeProtection) {
    this.extremeProtection = extremeProtection;
  }

  
  /**
   * The internal identifier value associated with this volume. When the Storage Partitions feature is NOT present, this value represents the logical unit number (LUN) that is used to access the volume via the host I/O path. If the Storage Partitions feature IS enabled, this field has no external meaning.
   **/
  public VolumeEx volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The internal identifier value associated with this volume. When the Storage Partitions feature is NOT present, this value represents the logical unit number (LUN) that is used to access the volume via the host I/O path. If the Storage Partitions feature IS enabled, this field has no external meaning.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * The RAID level for which this volume is configured.
   **/
  public VolumeEx raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The RAID level for which this volume is configured.")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * The sector offset of this volume within its volume group. This value is provided only to allow the client application to determine the relative positions of multiple volumes within a given volume group. No other assumptions or computations should be made with this value.
   **/
  public VolumeEx sectorOffset(Long sectorOffset) {
    this.sectorOffset = sectorOffset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sector offset of this volume within its volume group. This value is provided only to allow the client application to determine the relative positions of multiple volumes within a given volume group. No other assumptions or computations should be made with this value.")
  @JsonProperty("sectorOffset")
  public Long getSectorOffset() {
    return sectorOffset;
  }
  
  public void setSectorOffset(Long sectorOffset) {
    this.sectorOffset = sectorOffset;
  }

  
  /**
   * A variable-length opaque field that provides the volume's worldwide unique identification value.
   **/
  public VolumeEx worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length opaque field that provides the volume's worldwide unique identification value.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The user-assigned symbol label associated with the volume.
   **/
  public VolumeEx label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned symbol label associated with the volume.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The block size (in bytes) of the volume.
   **/
  public VolumeEx blkSize(Integer blkSize) {
    this.blkSize = blkSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The block size (in bytes) of the volume.")
  @JsonProperty("blkSize")
  public Integer getBlkSize() {
    return blkSize;
  }
  
  public void setBlkSize(Integer blkSize) {
    this.blkSize = blkSize;
  }

  
  /**
   * The capacity (in bytes) of the volume.
   **/
  public VolumeEx capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity (in bytes) of the volume.")
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }
  
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  
  /**
   * The reconstruction priority value for the volume. This value is in the range 0-4, with 0 indicating that reconstruction is favored over any I/O, and 4 indicating that reconstruction should be performed with minimal impact to I/O. Intermediate values indicate various levels of compromise between these two extremes.
   **/
  public VolumeEx reconPriority(Integer reconPriority) {
    this.reconPriority = reconPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reconstruction priority value for the volume. This value is in the range 0-4, with 0 indicating that reconstruction is favored over any I/O, and 4 indicating that reconstruction should be performed with minimal impact to I/O. Intermediate values indicate various levels of compromise between these two extremes.")
  @JsonProperty("reconPriority")
  public Integer getReconPriority() {
    return reconPriority;
  }
  
  public void setReconPriority(Integer reconPriority) {
    this.reconPriority = reconPriority;
  }

  
  /**
   * The segment size (in bytes) of the volume. The segment size is, for the most part, an indication of the stripe depth used to lay out the volume's block addresses.
   **/
  public VolumeEx segmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The segment size (in bytes) of the volume. The segment size is, for the most part, an indication of the stripe depth used to lay out the volume's block addresses.")
  @JsonProperty("segmentSize")
  public Integer getSegmentSize() {
    return segmentSize;
  }
  
  public void setSegmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
  }

  
  /**
   * An indication of what current long-running activity, if any, is currently in progress on the volume.
   **/
  public VolumeEx action(ActionEnum action) {
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
   * The volume-specific caching parameters currently in effect for the volume.
   **/
  public VolumeEx cache(VolumeCache cache) {
    this.cache = cache;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume-specific caching parameters currently in effect for the volume.")
  @JsonProperty("cache")
  public VolumeCache getCache() {
    return cache;
  }
  
  public void setCache(VolumeCache cache) {
    this.cache = cache;
  }

  
  /**
   * The volume-specific media scan settings currently in effect for the volume.
   **/
  public VolumeEx mediaScan(VolumeMediaScanParams mediaScan) {
    this.mediaScan = mediaScan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume-specific media scan settings currently in effect for the volume.")
  @JsonProperty("mediaScan")
  public VolumeMediaScanParams getMediaScan() {
    return mediaScan;
  }
  
  public void setMediaScan(VolumeMediaScanParams mediaScan) {
    this.mediaScan = mediaScan;
  }

  
  /**
   * The unique identification value for this volume. Other objects may use this reference value to refer to the volume.
   **/
  public VolumeEx volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value for this volume. Other objects may use this reference value to refer to the volume.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * The current operational state of the volume.
   **/
  public VolumeEx status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current operational state of the volume.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The volume group reference value of the volume group on which this volume resides.
   **/
  public VolumeEx volumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume group reference value of the volume group on which this volume resides.")
  @JsonProperty("volumeGroupRef")
  public String getVolumeGroupRef() {
    return volumeGroupRef;
  }
  
  public void setVolumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
  }

  
  /**
   * The reference value of the controller that currently owns (i.e. manages) this volume. In non-AVT (Auto Volume Transfer) mode, host I/O access to the blocks in this volume is permitted only through the controller that is the current manager. In AVT mode, an I/O access to the controller that is not the current manager causes it to automatically become the current manager.
   **/
  public VolumeEx currentManager(String currentManager) {
    this.currentManager = currentManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value of the controller that currently owns (i.e. manages) this volume. In non-AVT (Auto Volume Transfer) mode, host I/O access to the blocks in this volume is permitted only through the controller that is the current manager. In AVT mode, an I/O access to the controller that is not the current manager causes it to automatically become the current manager.")
  @JsonProperty("currentManager")
  public String getCurrentManager() {
    return currentManager;
  }
  
  public void setCurrentManager(String currentManager) {
    this.currentManager = currentManager;
  }

  
  /**
   * The reference value of the controller that is the preferred manager of the volume. The preferred manager is tracked independent of the current manager, since the current manager may be switched dynamically as a result of host-base multi-path transitions. Later, when the error conditions that cause a multi-path transition have been corrected it is still possible to determine the preferred manager and switch ownership back to it.
   **/
  public VolumeEx preferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value of the controller that is the preferred manager of the volume. The preferred manager is tracked independent of the current manager, since the current manager may be switched dynamically as a result of host-base multi-path transitions. Later, when the error conditions that cause a multi-path transition have been corrected it is still possible to determine the preferred manager and switch ownership back to it.")
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
  public VolumeEx perms(VolumePerms perms) {
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
  public VolumeEx mgmtClientAttribute(Integer mgmtClientAttribute) {
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
   * True if dynamic segment sizing pre-allocation is enabled for the volume.
   **/
  public VolumeEx dssPreallocEnabled(Boolean dssPreallocEnabled) {
    this.dssPreallocEnabled = dssPreallocEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if dynamic segment sizing pre-allocation is enabled for the volume.")
  @JsonProperty("dssPreallocEnabled")
  public Boolean getDssPreallocEnabled() {
    return dssPreallocEnabled;
  }
  
  public void setDssPreallocEnabled(Boolean dssPreallocEnabled) {
    this.dssPreallocEnabled = dssPreallocEnabled;
  }

  
  /**
   * The maximum segment size (in bytes) that this volume could assume with the dynamic segment sizing feature. This field is only meaningful if dssPreallocEnabled is true.
   **/
  public VolumeEx dssMaxSegmentSize(Integer dssMaxSegmentSize) {
    this.dssMaxSegmentSize = dssMaxSegmentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum segment size (in bytes) that this volume could assume with the dynamic segment sizing feature. This field is only meaningful if dssPreallocEnabled is true.")
  @JsonProperty("dssMaxSegmentSize")
  public Integer getDssMaxSegmentSize() {
    return dssMaxSegmentSize;
  }
  
  public void setDssMaxSegmentSize(Integer dssMaxSegmentSize) {
    this.dssMaxSegmentSize = dssMaxSegmentSize;
  }

  
  /**
   * If set to true, then the storage controller will, on READ operations, verify the consistency of RAID redundancy data for the stripe(s) containing the READ data.
   **/
  public VolumeEx preReadRedundancyCheckEnabled(Boolean preReadRedundancyCheckEnabled) {
    this.preReadRedundancyCheckEnabled = preReadRedundancyCheckEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If set to true, then the storage controller will, on READ operations, verify the consistency of RAID redundancy data for the stripe(s) containing the READ data.")
  @JsonProperty("preReadRedundancyCheckEnabled")
  public Boolean getPreReadRedundancyCheckEnabled() {
    return preReadRedundancyCheckEnabled;
  }
  
  public void setPreReadRedundancyCheckEnabled(Boolean preReadRedundancyCheckEnabled) {
    this.preReadRedundancyCheckEnabled = preReadRedundancyCheckEnabled;
  }

  
  /**
   * This field is no longer used.
   **/
  public VolumeEx protectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is no longer used.")
  @JsonProperty("protectionInformationCapable")
  public Boolean getProtectionInformationCapable() {
    return protectionInformationCapable;
  }
  
  public void setProtectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
  }

  
  /**
   * The protection type of the volume.
   **/
  public VolumeEx protectionType(ProtectionTypeEnum protectionType) {
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
  public VolumeEx applicationTagOwned(Boolean applicationTagOwned) {
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
   * This element contains a count of the number of blocks in the volume that have had data assurance errors repaired.
   **/
  public VolumeEx repairedBlockCount(Integer repairedBlockCount) {
    this.repairedBlockCount = repairedBlockCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This element contains a count of the number of blocks in the volume that have had data assurance errors repaired.")
  @JsonProperty("repairedBlockCount")
  public Integer getRepairedBlockCount() {
    return repairedBlockCount;
  }
  
  public void setRepairedBlockCount(Integer repairedBlockCount) {
    this.repairedBlockCount = repairedBlockCount;
  }

  
  /**
   **/
  public VolumeEx volumeUse(VolumeUseEnum volumeUse) {
    this.volumeUse = volumeUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumeUse")
  public VolumeUseEnum getVolumeUse() {
    return volumeUse;
  }
  
  public void setVolumeUse(VolumeUseEnum volumeUse) {
    this.volumeUse = volumeUse;
  }

  
  /**
   **/
  public VolumeEx volumeFull(Boolean volumeFull) {
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
   * This value is true if the volume is currently the target of a volume copy pair.
   **/
  public VolumeEx volumeCopyTarget(Boolean volumeCopyTarget) {
    this.volumeCopyTarget = volumeCopyTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This value is true if the volume is currently the target of a volume copy pair.")
  @JsonProperty("volumeCopyTarget")
  public Boolean getVolumeCopyTarget() {
    return volumeCopyTarget;
  }
  
  public void setVolumeCopyTarget(Boolean volumeCopyTarget) {
    this.volumeCopyTarget = volumeCopyTarget;
  }

  
  /**
   * This value is true if the volume is currently the source in a volume copy pair.
   **/
  public VolumeEx volumeCopySource(Boolean volumeCopySource) {
    this.volumeCopySource = volumeCopySource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This value is true if the volume is currently the source in a volume copy pair.")
  @JsonProperty("volumeCopySource")
  public Boolean getVolumeCopySource() {
    return volumeCopySource;
  }
  
  public void setVolumeCopySource(Boolean volumeCopySource) {
    this.volumeCopySource = volumeCopySource;
  }

  
  /**
   **/
  public VolumeEx pitBaseVolume(Boolean pitBaseVolume) {
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
   * This value is true if the volume is currently the target in an Asynchronous Mirror relationship.
   **/
  public VolumeEx asyncMirrorTarget(Boolean asyncMirrorTarget) {
    this.asyncMirrorTarget = asyncMirrorTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This value is true if the volume is currently the target in an Asynchronous Mirror relationship.")
  @JsonProperty("asyncMirrorTarget")
  public Boolean getAsyncMirrorTarget() {
    return asyncMirrorTarget;
  }
  
  public void setAsyncMirrorTarget(Boolean asyncMirrorTarget) {
    this.asyncMirrorTarget = asyncMirrorTarget;
  }

  
  /**
   * This value is true if the volume is currently the source in an Asynchronous Mirror relationship.
   **/
  public VolumeEx asyncMirrorSource(Boolean asyncMirrorSource) {
    this.asyncMirrorSource = asyncMirrorSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This value is true if the volume is currently the source in an Asynchronous Mirror relationship.")
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
  public VolumeEx remoteMirrorSource(Boolean remoteMirrorSource) {
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
  public VolumeEx remoteMirrorTarget(Boolean remoteMirrorTarget) {
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
   * True if the volume was defined on a DiskPool.
   **/
  public VolumeEx diskPool(Boolean diskPool) {
    this.diskPool = diskPool;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the volume was defined on a DiskPool.")
  @JsonProperty("diskPool")
  public Boolean getDiskPool() {
    return diskPool;
  }
  
  public void setDiskPool(Boolean diskPool) {
    this.diskPool = diskPool;
  }

  
  /**
   * True if this volume is added to a flashCache.
   **/
  public VolumeEx flashCached(Boolean flashCached) {
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
   * If a Dynamic Volume Expansion (DVE) is in progress, the total capacity the volume is being increased by, otherwise zero.
   **/
  public VolumeEx increasingBy(Long increasingBy) {
    this.increasingBy = increasingBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If a Dynamic Volume Expansion (DVE) is in progress, the total capacity the volume is being increased by, otherwise zero.")
  @JsonProperty("increasingBy")
  public Long getIncreasingBy() {
    return increasingBy;
  }
  
  public void setIncreasingBy(Long increasingBy) {
    this.increasingBy = increasingBy;
  }

  
  /**
   * Metadata associated with the volume
   **/
  public VolumeEx metadata(List<VolumeMetadataItem> metadata) {
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
  public VolumeEx dataAssurance(Boolean dataAssurance) {
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
  public VolumeEx objectType(ObjectTypeEnum objectType) {
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
  public VolumeEx wwn(String wwn) {
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
  public VolumeEx totalSizeInBytes(Long totalSizeInBytes) {
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
  public VolumeEx currentControllerId(String currentControllerId) {
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
   * The volume-specific caching parameters currently in effect for the volume.
   **/
  public VolumeEx cacheSettings(VolumeCache cacheSettings) {
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
  public VolumeEx thinProvisioned(Boolean thinProvisioned) {
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
  public VolumeEx listOfMappings(List<LUNMapping> listOfMappings) {
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
  public VolumeEx mapped(Boolean mapped) {
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
  public VolumeEx preferredControllerId(String preferredControllerId) {
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
  public VolumeEx onlineVolumeCopy(Boolean onlineVolumeCopy) {
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
  public VolumeEx name(String name) {
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
  public VolumeEx id(String id) {
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
    VolumeEx volumeEx = (VolumeEx) o;
    return Objects.equals(this.offline, volumeEx.offline) &&
        Objects.equals(this.extremeProtection, volumeEx.extremeProtection) &&
        Objects.equals(this.volumeHandle, volumeEx.volumeHandle) &&
        Objects.equals(this.raidLevel, volumeEx.raidLevel) &&
        Objects.equals(this.sectorOffset, volumeEx.sectorOffset) &&
        Objects.equals(this.worldWideName, volumeEx.worldWideName) &&
        Objects.equals(this.label, volumeEx.label) &&
        Objects.equals(this.blkSize, volumeEx.blkSize) &&
        Objects.equals(this.capacity, volumeEx.capacity) &&
        Objects.equals(this.reconPriority, volumeEx.reconPriority) &&
        Objects.equals(this.segmentSize, volumeEx.segmentSize) &&
        Objects.equals(this.action, volumeEx.action) &&
        Objects.equals(this.cache, volumeEx.cache) &&
        Objects.equals(this.mediaScan, volumeEx.mediaScan) &&
        Objects.equals(this.volumeRef, volumeEx.volumeRef) &&
        Objects.equals(this.status, volumeEx.status) &&
        Objects.equals(this.volumeGroupRef, volumeEx.volumeGroupRef) &&
        Objects.equals(this.currentManager, volumeEx.currentManager) &&
        Objects.equals(this.preferredManager, volumeEx.preferredManager) &&
        Objects.equals(this.perms, volumeEx.perms) &&
        Objects.equals(this.mgmtClientAttribute, volumeEx.mgmtClientAttribute) &&
        Objects.equals(this.dssPreallocEnabled, volumeEx.dssPreallocEnabled) &&
        Objects.equals(this.dssMaxSegmentSize, volumeEx.dssMaxSegmentSize) &&
        Objects.equals(this.preReadRedundancyCheckEnabled, volumeEx.preReadRedundancyCheckEnabled) &&
        Objects.equals(this.protectionInformationCapable, volumeEx.protectionInformationCapable) &&
        Objects.equals(this.protectionType, volumeEx.protectionType) &&
        Objects.equals(this.applicationTagOwned, volumeEx.applicationTagOwned) &&
        Objects.equals(this.repairedBlockCount, volumeEx.repairedBlockCount) &&
        Objects.equals(this.volumeUse, volumeEx.volumeUse) &&
        Objects.equals(this.volumeFull, volumeEx.volumeFull) &&
        Objects.equals(this.volumeCopyTarget, volumeEx.volumeCopyTarget) &&
        Objects.equals(this.volumeCopySource, volumeEx.volumeCopySource) &&
        Objects.equals(this.pitBaseVolume, volumeEx.pitBaseVolume) &&
        Objects.equals(this.asyncMirrorTarget, volumeEx.asyncMirrorTarget) &&
        Objects.equals(this.asyncMirrorSource, volumeEx.asyncMirrorSource) &&
        Objects.equals(this.remoteMirrorSource, volumeEx.remoteMirrorSource) &&
        Objects.equals(this.remoteMirrorTarget, volumeEx.remoteMirrorTarget) &&
        Objects.equals(this.diskPool, volumeEx.diskPool) &&
        Objects.equals(this.flashCached, volumeEx.flashCached) &&
        Objects.equals(this.increasingBy, volumeEx.increasingBy) &&
        Objects.equals(this.metadata, volumeEx.metadata) &&
        Objects.equals(this.dataAssurance, volumeEx.dataAssurance) &&
        Objects.equals(this.objectType, volumeEx.objectType) &&
        Objects.equals(this.wwn, volumeEx.wwn) &&
        Objects.equals(this.totalSizeInBytes, volumeEx.totalSizeInBytes) &&
        Objects.equals(this.currentControllerId, volumeEx.currentControllerId) &&
        Objects.equals(this.cacheSettings, volumeEx.cacheSettings) &&
        Objects.equals(this.thinProvisioned, volumeEx.thinProvisioned) &&
        Objects.equals(this.listOfMappings, volumeEx.listOfMappings) &&
        Objects.equals(this.mapped, volumeEx.mapped) &&
        Objects.equals(this.preferredControllerId, volumeEx.preferredControllerId) &&
        Objects.equals(this.onlineVolumeCopy, volumeEx.onlineVolumeCopy) &&
        Objects.equals(this.name, volumeEx.name) &&
        Objects.equals(this.id, volumeEx.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offline, extremeProtection, volumeHandle, raidLevel, sectorOffset, worldWideName, label, blkSize, capacity, reconPriority, segmentSize, action, cache, mediaScan, volumeRef, status, volumeGroupRef, currentManager, preferredManager, perms, mgmtClientAttribute, dssPreallocEnabled, dssMaxSegmentSize, preReadRedundancyCheckEnabled, protectionInformationCapable, protectionType, applicationTagOwned, repairedBlockCount, volumeUse, volumeFull, volumeCopyTarget, volumeCopySource, pitBaseVolume, asyncMirrorTarget, asyncMirrorSource, remoteMirrorSource, remoteMirrorTarget, diskPool, flashCached, increasingBy, metadata, dataAssurance, objectType, wwn, totalSizeInBytes, currentControllerId, cacheSettings, thinProvisioned, listOfMappings, mapped, preferredControllerId, onlineVolumeCopy, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeEx {\n");
    
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    extremeProtection: ").append(toIndentedString(extremeProtection)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    sectorOffset: ").append(toIndentedString(sectorOffset)).append("\n");
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    blkSize: ").append(toIndentedString(blkSize)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    reconPriority: ").append(toIndentedString(reconPriority)).append("\n");
    sb.append("    segmentSize: ").append(toIndentedString(segmentSize)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    mediaScan: ").append(toIndentedString(mediaScan)).append("\n");
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    volumeGroupRef: ").append(toIndentedString(volumeGroupRef)).append("\n");
    sb.append("    currentManager: ").append(toIndentedString(currentManager)).append("\n");
    sb.append("    preferredManager: ").append(toIndentedString(preferredManager)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    mgmtClientAttribute: ").append(toIndentedString(mgmtClientAttribute)).append("\n");
    sb.append("    dssPreallocEnabled: ").append(toIndentedString(dssPreallocEnabled)).append("\n");
    sb.append("    dssMaxSegmentSize: ").append(toIndentedString(dssMaxSegmentSize)).append("\n");
    sb.append("    preReadRedundancyCheckEnabled: ").append(toIndentedString(preReadRedundancyCheckEnabled)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    applicationTagOwned: ").append(toIndentedString(applicationTagOwned)).append("\n");
    sb.append("    repairedBlockCount: ").append(toIndentedString(repairedBlockCount)).append("\n");
    sb.append("    volumeUse: ").append(toIndentedString(volumeUse)).append("\n");
    sb.append("    volumeFull: ").append(toIndentedString(volumeFull)).append("\n");
    sb.append("    volumeCopyTarget: ").append(toIndentedString(volumeCopyTarget)).append("\n");
    sb.append("    volumeCopySource: ").append(toIndentedString(volumeCopySource)).append("\n");
    sb.append("    pitBaseVolume: ").append(toIndentedString(pitBaseVolume)).append("\n");
    sb.append("    asyncMirrorTarget: ").append(toIndentedString(asyncMirrorTarget)).append("\n");
    sb.append("    asyncMirrorSource: ").append(toIndentedString(asyncMirrorSource)).append("\n");
    sb.append("    remoteMirrorSource: ").append(toIndentedString(remoteMirrorSource)).append("\n");
    sb.append("    remoteMirrorTarget: ").append(toIndentedString(remoteMirrorTarget)).append("\n");
    sb.append("    diskPool: ").append(toIndentedString(diskPool)).append("\n");
    sb.append("    flashCached: ").append(toIndentedString(flashCached)).append("\n");
    sb.append("    increasingBy: ").append(toIndentedString(increasingBy)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dataAssurance: ").append(toIndentedString(dataAssurance)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    totalSizeInBytes: ").append(toIndentedString(totalSizeInBytes)).append("\n");
    sb.append("    currentControllerId: ").append(toIndentedString(currentControllerId)).append("\n");
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

