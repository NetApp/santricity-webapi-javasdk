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
 * Volume
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class Volume   {
  
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

    private String name;

    private String id;

  
  /**
   * An indication of whether the volume is currently offline.
   **/
  public Volume offline(Boolean offline) {
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
  public Volume extremeProtection(Boolean extremeProtection) {
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
  public Volume volumeHandle(Integer volumeHandle) {
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
  public Volume raidLevel(RaidLevelEnum raidLevel) {
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
  public Volume sectorOffset(Long sectorOffset) {
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
  public Volume worldWideName(String worldWideName) {
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
  public Volume label(String label) {
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
  public Volume blkSize(Integer blkSize) {
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
  public Volume capacity(Long capacity) {
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
  public Volume reconPriority(Integer reconPriority) {
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
  public Volume segmentSize(Integer segmentSize) {
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
  public Volume action(ActionEnum action) {
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
  public Volume cache(VolumeCache cache) {
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
  public Volume mediaScan(VolumeMediaScanParams mediaScan) {
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
  public Volume volumeRef(String volumeRef) {
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
  public Volume status(StatusEnum status) {
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
  public Volume volumeGroupRef(String volumeGroupRef) {
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
  public Volume currentManager(String currentManager) {
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
  public Volume preferredManager(String preferredManager) {
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
  public Volume perms(VolumePerms perms) {
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
  public Volume mgmtClientAttribute(Integer mgmtClientAttribute) {
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
  public Volume dssPreallocEnabled(Boolean dssPreallocEnabled) {
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
  public Volume dssMaxSegmentSize(Integer dssMaxSegmentSize) {
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
  public Volume preReadRedundancyCheckEnabled(Boolean preReadRedundancyCheckEnabled) {
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
  public Volume protectionInformationCapable(Boolean protectionInformationCapable) {
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
  public Volume protectionType(ProtectionTypeEnum protectionType) {
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
  public Volume applicationTagOwned(Boolean applicationTagOwned) {
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
  public Volume repairedBlockCount(Integer repairedBlockCount) {
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
  public Volume name(String name) {
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
  public Volume id(String id) {
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
    Volume volume = (Volume) o;
    return Objects.equals(this.offline, volume.offline) &&
        Objects.equals(this.extremeProtection, volume.extremeProtection) &&
        Objects.equals(this.volumeHandle, volume.volumeHandle) &&
        Objects.equals(this.raidLevel, volume.raidLevel) &&
        Objects.equals(this.sectorOffset, volume.sectorOffset) &&
        Objects.equals(this.worldWideName, volume.worldWideName) &&
        Objects.equals(this.label, volume.label) &&
        Objects.equals(this.blkSize, volume.blkSize) &&
        Objects.equals(this.capacity, volume.capacity) &&
        Objects.equals(this.reconPriority, volume.reconPriority) &&
        Objects.equals(this.segmentSize, volume.segmentSize) &&
        Objects.equals(this.action, volume.action) &&
        Objects.equals(this.cache, volume.cache) &&
        Objects.equals(this.mediaScan, volume.mediaScan) &&
        Objects.equals(this.volumeRef, volume.volumeRef) &&
        Objects.equals(this.status, volume.status) &&
        Objects.equals(this.volumeGroupRef, volume.volumeGroupRef) &&
        Objects.equals(this.currentManager, volume.currentManager) &&
        Objects.equals(this.preferredManager, volume.preferredManager) &&
        Objects.equals(this.perms, volume.perms) &&
        Objects.equals(this.mgmtClientAttribute, volume.mgmtClientAttribute) &&
        Objects.equals(this.dssPreallocEnabled, volume.dssPreallocEnabled) &&
        Objects.equals(this.dssMaxSegmentSize, volume.dssMaxSegmentSize) &&
        Objects.equals(this.preReadRedundancyCheckEnabled, volume.preReadRedundancyCheckEnabled) &&
        Objects.equals(this.protectionInformationCapable, volume.protectionInformationCapable) &&
        Objects.equals(this.protectionType, volume.protectionType) &&
        Objects.equals(this.applicationTagOwned, volume.applicationTagOwned) &&
        Objects.equals(this.repairedBlockCount, volume.repairedBlockCount) &&
        Objects.equals(this.name, volume.name) &&
        Objects.equals(this.id, volume.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offline, extremeProtection, volumeHandle, raidLevel, sectorOffset, worldWideName, label, blkSize, capacity, reconPriority, segmentSize, action, cache, mediaScan, volumeRef, status, volumeGroupRef, currentManager, preferredManager, perms, mgmtClientAttribute, dssPreallocEnabled, dssMaxSegmentSize, preReadRedundancyCheckEnabled, protectionInformationCapable, protectionType, applicationTagOwned, repairedBlockCount, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Volume {\n");
    
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

