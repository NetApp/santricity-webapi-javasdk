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
 * ConcatRepositoryVolume
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class ConcatRepositoryVolume   {
  
    private String concatVolRef;


  /**
   * The status/state of the concatenated volume. This will be the worst status among the member volumes.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    degraded("degraded"),
    failed("failed"),
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

    private Integer memberCount;

    private Long aggregateCapacity;

    private VolumeMediaScanParams mediaScanParams;

    private Integer volumeHandle;

    private VolumePerms allowedOperations;

    private List<String> memberRefs;


  /**
   * Gets or Sets baseObjectType
   */
  public enum BaseObjectTypeEnum {
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

    BaseObjectTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private BaseObjectTypeEnum baseObjectType;

    private String baseObjectId;

    private String id;

  
  /**
   * A reference (key) for ConcatVolume.
   **/
  public ConcatRepositoryVolume concatVolRef(String concatVolRef) {
    this.concatVolRef = concatVolRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference (key) for ConcatVolume.")
  @JsonProperty("concatVolRef")
  public String getConcatVolRef() {
    return concatVolRef;
  }
  
  public void setConcatVolRef(String concatVolRef) {
    this.concatVolRef = concatVolRef;
  }

  
  /**
   * The status/state of the concatenated volume. This will be the worst status among the member volumes.
   **/
  public ConcatRepositoryVolume status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status/state of the concatenated volume. This will be the worst status among the member volumes.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The number of actual storage volumes comprising this volume. Note that this is just for convenience, this information can be derived from member objects.
   **/
  public ConcatRepositoryVolume memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of actual storage volumes comprising this volume. Note that this is just for convenience, this information can be derived from member objects.")
  @JsonProperty("memberCount")
  public Integer getMemberCount() {
    return memberCount;
  }
  
  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  
  /**
   * The aggregate capacity in bytes of all member volumes.
   **/
  public ConcatRepositoryVolume aggregateCapacity(Long aggregateCapacity) {
    this.aggregateCapacity = aggregateCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The aggregate capacity in bytes of all member volumes.")
  @JsonProperty("aggregateCapacity")
  public Long getAggregateCapacity() {
    return aggregateCapacity;
  }
  
  public void setAggregateCapacity(Long aggregateCapacity) {
    this.aggregateCapacity = aggregateCapacity;
  }

  
  /**
   * Media scan parameters.
   **/
  public ConcatRepositoryVolume mediaScanParams(VolumeMediaScanParams mediaScanParams) {
    this.mediaScanParams = mediaScanParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Media scan parameters.")
  @JsonProperty("mediaScanParams")
  public VolumeMediaScanParams getMediaScanParams() {
    return mediaScanParams;
  }
  
  public void setMediaScanParams(VolumeMediaScanParams mediaScanParams) {
    this.mediaScanParams = mediaScanParams;
  }

  
  /**
   * The volume ssid. This is provided primarily for debug purposes.
   **/
  public ConcatRepositoryVolume volumeHandle(Integer volumeHandle) {
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
   * Operations allowed on the ConcatVolume. This can be used if ConcatVolume is ever exposed as a host-addressable volume to specify whether the volume is host-mappable or not (repository volumes would never be mappable).
   **/
  public ConcatRepositoryVolume allowedOperations(VolumePerms allowedOperations) {
    this.allowedOperations = allowedOperations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Operations allowed on the ConcatVolume. This can be used if ConcatVolume is ever exposed as a host-addressable volume to specify whether the volume is host-mappable or not (repository volumes would never be mappable).")
  @JsonProperty("allowedOperations")
  public VolumePerms getAllowedOperations() {
    return allowedOperations;
  }
  
  public void setAllowedOperations(VolumePerms allowedOperations) {
    this.allowedOperations = allowedOperations;
  }

  
  /**
   **/
  public ConcatRepositoryVolume memberRefs(List<String> memberRefs) {
    this.memberRefs = memberRefs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("memberRefs")
  public List<String> getMemberRefs() {
    return memberRefs;
  }
  
  public void setMemberRefs(List<String> memberRefs) {
    this.memberRefs = memberRefs;
  }

  
  /**
   **/
  public ConcatRepositoryVolume baseObjectType(BaseObjectTypeEnum baseObjectType) {
    this.baseObjectType = baseObjectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("baseObjectType")
  public BaseObjectTypeEnum getBaseObjectType() {
    return baseObjectType;
  }
  
  public void setBaseObjectType(BaseObjectTypeEnum baseObjectType) {
    this.baseObjectType = baseObjectType;
  }

  
  /**
   **/
  public ConcatRepositoryVolume baseObjectId(String baseObjectId) {
    this.baseObjectId = baseObjectId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("baseObjectId")
  public String getBaseObjectId() {
    return baseObjectId;
  }
  
  public void setBaseObjectId(String baseObjectId) {
    this.baseObjectId = baseObjectId;
  }

  
  /**
   **/
  public ConcatRepositoryVolume id(String id) {
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
    ConcatRepositoryVolume concatRepositoryVolume = (ConcatRepositoryVolume) o;
    return Objects.equals(this.concatVolRef, concatRepositoryVolume.concatVolRef) &&
        Objects.equals(this.status, concatRepositoryVolume.status) &&
        Objects.equals(this.memberCount, concatRepositoryVolume.memberCount) &&
        Objects.equals(this.aggregateCapacity, concatRepositoryVolume.aggregateCapacity) &&
        Objects.equals(this.mediaScanParams, concatRepositoryVolume.mediaScanParams) &&
        Objects.equals(this.volumeHandle, concatRepositoryVolume.volumeHandle) &&
        Objects.equals(this.allowedOperations, concatRepositoryVolume.allowedOperations) &&
        Objects.equals(this.memberRefs, concatRepositoryVolume.memberRefs) &&
        Objects.equals(this.baseObjectType, concatRepositoryVolume.baseObjectType) &&
        Objects.equals(this.baseObjectId, concatRepositoryVolume.baseObjectId) &&
        Objects.equals(this.id, concatRepositoryVolume.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concatVolRef, status, memberCount, aggregateCapacity, mediaScanParams, volumeHandle, allowedOperations, memberRefs, baseObjectType, baseObjectId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatRepositoryVolume {\n");
    
    sb.append("    concatVolRef: ").append(toIndentedString(concatVolRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    aggregateCapacity: ").append(toIndentedString(aggregateCapacity)).append("\n");
    sb.append("    mediaScanParams: ").append(toIndentedString(mediaScanParams)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    allowedOperations: ").append(toIndentedString(allowedOperations)).append("\n");
    sb.append("    memberRefs: ").append(toIndentedString(memberRefs)).append("\n");
    sb.append("    baseObjectType: ").append(toIndentedString(baseObjectType)).append("\n");
    sb.append("    baseObjectId: ").append(toIndentedString(baseObjectId)).append("\n");
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

