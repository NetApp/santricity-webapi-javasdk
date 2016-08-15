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
 * VolumeCopyPair
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class VolumeCopyPair   {
  
    private String worldWideName;

    private Integer volcopyHandle;

    private String volcopyRef;


  /**
   * Indicates status of copy.
   */
  public enum StatusEnum {
    inProgress("inProgress"),
    complete("complete"),
    halted("halted"),
    failed("failed"),
    pending("pending"),
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

    private String sourceVolume;

    private String targetVolume;

    private String currentManager;

    private Boolean idleTargetWriteProt;

    private Long copyCompleteTime;

    private Long copyStartTime;


  /**
   * Importance of copy operation.
   */
  public enum CopyPriorityEnum {
    priority0("priority0"),
    priority1("priority1"),
    priority2("priority2"),
    priority3("priority3"),
    priority4("priority4"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CopyPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CopyPriorityEnum copyPriority;

    private String reserved1;

    private Boolean cloneCopy;

    private String pgRef;

    private String baseSourceVolumeId;

    private String id;

    private Boolean onlineCopy;

  
  /**
   * The World Wide Name of the volume copy.
   **/
  public VolumeCopyPair worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The World Wide Name of the volume copy.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The Volume Copy ID(ssid of proxy).
   **/
  public VolumeCopyPair volcopyHandle(Integer volcopyHandle) {
    this.volcopyHandle = volcopyHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Volume Copy ID(ssid of proxy).")
  @JsonProperty("volcopyHandle")
  public Integer getVolcopyHandle() {
    return volcopyHandle;
  }
  
  public void setVolcopyHandle(Integer volcopyHandle) {
    this.volcopyHandle = volcopyHandle;
  }

  
  /**
   * Reference (key) for copy.
   **/
  public VolumeCopyPair volcopyRef(String volcopyRef) {
    this.volcopyRef = volcopyRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference (key) for copy.")
  @JsonProperty("volcopyRef")
  public String getVolcopyRef() {
    return volcopyRef;
  }
  
  public void setVolcopyRef(String volcopyRef) {
    this.volcopyRef = volcopyRef;
  }

  
  /**
   * Indicates status of copy.
   **/
  public VolumeCopyPair status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates status of copy.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Source volume reference.
   **/
  public VolumeCopyPair sourceVolume(String sourceVolume) {
    this.sourceVolume = sourceVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Source volume reference.")
  @JsonProperty("sourceVolume")
  public String getSourceVolume() {
    return sourceVolume;
  }
  
  public void setSourceVolume(String sourceVolume) {
    this.sourceVolume = sourceVolume;
  }

  
  /**
   * Target volume reference.
   **/
  public VolumeCopyPair targetVolume(String targetVolume) {
    this.targetVolume = targetVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Target volume reference.")
  @JsonProperty("targetVolume")
  public String getTargetVolume() {
    return targetVolume;
  }
  
  public void setTargetVolume(String targetVolume) {
    this.targetVolume = targetVolume;
  }

  
  /**
   * Current owner of copy.
   **/
  public VolumeCopyPair currentManager(String currentManager) {
    this.currentManager = currentManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Current owner of copy.")
  @JsonProperty("currentManager")
  public String getCurrentManager() {
    return currentManager;
  }
  
  public void setCurrentManager(String currentManager) {
    this.currentManager = currentManager;
  }

  
  /**
   * Apply write protection to target volume when copy is idle (true/false).
   **/
  public VolumeCopyPair idleTargetWriteProt(Boolean idleTargetWriteProt) {
    this.idleTargetWriteProt = idleTargetWriteProt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apply write protection to target volume when copy is idle (true/false).")
  @JsonProperty("idleTargetWriteProt")
  public Boolean getIdleTargetWriteProt() {
    return idleTargetWriteProt;
  }
  
  public void setIdleTargetWriteProt(Boolean idleTargetWriteProt) {
    this.idleTargetWriteProt = idleTargetWriteProt;
  }

  
  /**
   * Time copy operation completed.
   **/
  public VolumeCopyPair copyCompleteTime(Long copyCompleteTime) {
    this.copyCompleteTime = copyCompleteTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time copy operation completed.")
  @JsonProperty("copyCompleteTime")
  public Long getCopyCompleteTime() {
    return copyCompleteTime;
  }
  
  public void setCopyCompleteTime(Long copyCompleteTime) {
    this.copyCompleteTime = copyCompleteTime;
  }

  
  /**
   * Time copy operation began.
   **/
  public VolumeCopyPair copyStartTime(Long copyStartTime) {
    this.copyStartTime = copyStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time copy operation began.")
  @JsonProperty("copyStartTime")
  public Long getCopyStartTime() {
    return copyStartTime;
  }
  
  public void setCopyStartTime(Long copyStartTime) {
    this.copyStartTime = copyStartTime;
  }

  
  /**
   * Importance of copy operation.
   **/
  public VolumeCopyPair copyPriority(CopyPriorityEnum copyPriority) {
    this.copyPriority = copyPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Importance of copy operation.")
  @JsonProperty("copyPriority")
  public CopyPriorityEnum getCopyPriority() {
    return copyPriority;
  }
  
  public void setCopyPriority(CopyPriorityEnum copyPriority) {
    this.copyPriority = copyPriority;
  }

  
  /**
   **/
  public VolumeCopyPair reserved1(String reserved1) {
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
   * The volume copy is a clone.
   **/
  public VolumeCopyPair cloneCopy(Boolean cloneCopy) {
    this.cloneCopy = cloneCopy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume copy is a clone.")
  @JsonProperty("cloneCopy")
  public Boolean getCloneCopy() {
    return cloneCopy;
  }
  
  public void setCloneCopy(Boolean cloneCopy) {
    this.cloneCopy = cloneCopy;
  }

  
  /**
   * For clones based on PiT Groups, this will identify the PiT Group.
   **/
  public VolumeCopyPair pgRef(String pgRef) {
    this.pgRef = pgRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "For clones based on PiT Groups, this will identify the PiT Group.")
  @JsonProperty("pgRef")
  public String getPgRef() {
    return pgRef;
  }
  
  public void setPgRef(String pgRef) {
    this.pgRef = pgRef;
  }

  
  /**
   * The source's base volume identifier (the same as the sourceVolume in the case of an offline copy). 
   **/
  public VolumeCopyPair baseSourceVolumeId(String baseSourceVolumeId) {
    this.baseSourceVolumeId = baseSourceVolumeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source's base volume identifier (the same as the sourceVolume in the case of an offline copy). ")
  @JsonProperty("baseSourceVolumeId")
  public String getBaseSourceVolumeId() {
    return baseSourceVolumeId;
  }
  
  public void setBaseSourceVolumeId(String baseSourceVolumeId) {
    this.baseSourceVolumeId = baseSourceVolumeId;
  }

  
  /**
   **/
  public VolumeCopyPair id(String id) {
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
  public VolumeCopyPair onlineCopy(Boolean onlineCopy) {
    this.onlineCopy = onlineCopy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onlineCopy")
  public Boolean getOnlineCopy() {
    return onlineCopy;
  }
  
  public void setOnlineCopy(Boolean onlineCopy) {
    this.onlineCopy = onlineCopy;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCopyPair volumeCopyPair = (VolumeCopyPair) o;
    return Objects.equals(this.worldWideName, volumeCopyPair.worldWideName) &&
        Objects.equals(this.volcopyHandle, volumeCopyPair.volcopyHandle) &&
        Objects.equals(this.volcopyRef, volumeCopyPair.volcopyRef) &&
        Objects.equals(this.status, volumeCopyPair.status) &&
        Objects.equals(this.sourceVolume, volumeCopyPair.sourceVolume) &&
        Objects.equals(this.targetVolume, volumeCopyPair.targetVolume) &&
        Objects.equals(this.currentManager, volumeCopyPair.currentManager) &&
        Objects.equals(this.idleTargetWriteProt, volumeCopyPair.idleTargetWriteProt) &&
        Objects.equals(this.copyCompleteTime, volumeCopyPair.copyCompleteTime) &&
        Objects.equals(this.copyStartTime, volumeCopyPair.copyStartTime) &&
        Objects.equals(this.copyPriority, volumeCopyPair.copyPriority) &&
        Objects.equals(this.reserved1, volumeCopyPair.reserved1) &&
        Objects.equals(this.cloneCopy, volumeCopyPair.cloneCopy) &&
        Objects.equals(this.pgRef, volumeCopyPair.pgRef) &&
        Objects.equals(this.baseSourceVolumeId, volumeCopyPair.baseSourceVolumeId) &&
        Objects.equals(this.id, volumeCopyPair.id) &&
        Objects.equals(this.onlineCopy, volumeCopyPair.onlineCopy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worldWideName, volcopyHandle, volcopyRef, status, sourceVolume, targetVolume, currentManager, idleTargetWriteProt, copyCompleteTime, copyStartTime, copyPriority, reserved1, cloneCopy, pgRef, baseSourceVolumeId, id, onlineCopy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCopyPair {\n");
    
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    volcopyHandle: ").append(toIndentedString(volcopyHandle)).append("\n");
    sb.append("    volcopyRef: ").append(toIndentedString(volcopyRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sourceVolume: ").append(toIndentedString(sourceVolume)).append("\n");
    sb.append("    targetVolume: ").append(toIndentedString(targetVolume)).append("\n");
    sb.append("    currentManager: ").append(toIndentedString(currentManager)).append("\n");
    sb.append("    idleTargetWriteProt: ").append(toIndentedString(idleTargetWriteProt)).append("\n");
    sb.append("    copyCompleteTime: ").append(toIndentedString(copyCompleteTime)).append("\n");
    sb.append("    copyStartTime: ").append(toIndentedString(copyStartTime)).append("\n");
    sb.append("    copyPriority: ").append(toIndentedString(copyPriority)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    cloneCopy: ").append(toIndentedString(cloneCopy)).append("\n");
    sb.append("    pgRef: ").append(toIndentedString(pgRef)).append("\n");
    sb.append("    baseSourceVolumeId: ").append(toIndentedString(baseSourceVolumeId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    onlineCopy: ").append(toIndentedString(onlineCopy)).append("\n");
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

