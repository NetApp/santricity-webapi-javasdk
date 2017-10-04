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
 * UserVolume
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class UserVolume   {
  
    private List<VolumeMetadataItem> metadata;

    private String volumeGroupRef;

    private Integer segmentSize;

    private VolumeMediaScanParams mediaScan;

    private Integer blkSize;


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

    private Boolean diskPool;

    private VolumeCache cacheSettings;

    private Boolean flashCached;

    private Boolean thinProvisioned;

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

    private List<LUNMapping> listOfMappings;

    private Boolean mapped;

    private String preferredControllerId;

    private String name;

    private String id;

  
  /**
   **/
  public UserVolume metadata(List<VolumeMetadataItem> metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public List<VolumeMetadataItem> getMetadata() {
    return metadata;
  }
  
  public void setMetadata(List<VolumeMetadataItem> metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  public UserVolume volumeGroupRef(String volumeGroupRef) {
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
  public UserVolume segmentSize(Integer segmentSize) {
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
  public UserVolume mediaScan(VolumeMediaScanParams mediaScan) {
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
   **/
  public UserVolume blkSize(Integer blkSize) {
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
  public UserVolume protectionType(ProtectionTypeEnum protectionType) {
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
   **/
  public UserVolume diskPool(Boolean diskPool) {
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
  public UserVolume cacheSettings(VolumeCache cacheSettings) {
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
  public UserVolume flashCached(Boolean flashCached) {
    this.flashCached = flashCached;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flashCached")
  public Boolean getFlashCached() {
    return flashCached;
  }
  
  public void setFlashCached(Boolean flashCached) {
    this.flashCached = flashCached;
  }

  
  /**
   **/
  public UserVolume thinProvisioned(Boolean thinProvisioned) {
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
  public UserVolume dataAssurance(Boolean dataAssurance) {
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
  public UserVolume objectType(ObjectTypeEnum objectType) {
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
  public UserVolume wwn(String wwn) {
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
  public UserVolume totalSizeInBytes(Long totalSizeInBytes) {
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
  public UserVolume currentControllerId(String currentControllerId) {
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
  public UserVolume listOfMappings(List<LUNMapping> listOfMappings) {
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
  public UserVolume mapped(Boolean mapped) {
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
  public UserVolume preferredControllerId(String preferredControllerId) {
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
  public UserVolume name(String name) {
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
  public UserVolume id(String id) {
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
    UserVolume userVolume = (UserVolume) o;
    return Objects.equals(this.metadata, userVolume.metadata) &&
        Objects.equals(this.volumeGroupRef, userVolume.volumeGroupRef) &&
        Objects.equals(this.segmentSize, userVolume.segmentSize) &&
        Objects.equals(this.mediaScan, userVolume.mediaScan) &&
        Objects.equals(this.blkSize, userVolume.blkSize) &&
        Objects.equals(this.protectionType, userVolume.protectionType) &&
        Objects.equals(this.diskPool, userVolume.diskPool) &&
        Objects.equals(this.cacheSettings, userVolume.cacheSettings) &&
        Objects.equals(this.flashCached, userVolume.flashCached) &&
        Objects.equals(this.thinProvisioned, userVolume.thinProvisioned) &&
        Objects.equals(this.dataAssurance, userVolume.dataAssurance) &&
        Objects.equals(this.objectType, userVolume.objectType) &&
        Objects.equals(this.wwn, userVolume.wwn) &&
        Objects.equals(this.totalSizeInBytes, userVolume.totalSizeInBytes) &&
        Objects.equals(this.currentControllerId, userVolume.currentControllerId) &&
        Objects.equals(this.listOfMappings, userVolume.listOfMappings) &&
        Objects.equals(this.mapped, userVolume.mapped) &&
        Objects.equals(this.preferredControllerId, userVolume.preferredControllerId) &&
        Objects.equals(this.name, userVolume.name) &&
        Objects.equals(this.id, userVolume.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, volumeGroupRef, segmentSize, mediaScan, blkSize, protectionType, diskPool, cacheSettings, flashCached, thinProvisioned, dataAssurance, objectType, wwn, totalSizeInBytes, currentControllerId, listOfMappings, mapped, preferredControllerId, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVolume {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    volumeGroupRef: ").append(toIndentedString(volumeGroupRef)).append("\n");
    sb.append("    segmentSize: ").append(toIndentedString(segmentSize)).append("\n");
    sb.append("    mediaScan: ").append(toIndentedString(mediaScan)).append("\n");
    sb.append("    blkSize: ").append(toIndentedString(blkSize)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    diskPool: ").append(toIndentedString(diskPool)).append("\n");
    sb.append("    cacheSettings: ").append(toIndentedString(cacheSettings)).append("\n");
    sb.append("    flashCached: ").append(toIndentedString(flashCached)).append("\n");
    sb.append("    thinProvisioned: ").append(toIndentedString(thinProvisioned)).append("\n");
    sb.append("    dataAssurance: ").append(toIndentedString(dataAssurance)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    totalSizeInBytes: ").append(toIndentedString(totalSizeInBytes)).append("\n");
    sb.append("    currentControllerId: ").append(toIndentedString(currentControllerId)).append("\n");
    sb.append("    listOfMappings: ").append(toIndentedString(listOfMappings)).append("\n");
    sb.append("    mapped: ").append(toIndentedString(mapped)).append("\n");
    sb.append("    preferredControllerId: ").append(toIndentedString(preferredControllerId)).append("\n");
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

