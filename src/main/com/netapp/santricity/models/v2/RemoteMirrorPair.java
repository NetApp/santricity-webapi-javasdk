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
 * RemoteMirrorPair
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class RemoteMirrorPair   {
  
    private VolumeEx base;

    private VolumeEx target;

    private String baseArray;

    private String targetArray;

    private String id;

    private Date lastStartTime;

    private Date lastCompleteTime;

    private Integer state;

    private Integer priority;

    private Integer writeMode;

    private Boolean autoResync;

    private Boolean featureActive;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
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
   * Gets or Sets baseStatus
   */
  public enum BaseStatusEnum {
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

    BaseStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private BaseStatusEnum baseStatus;


  /**
   * Gets or Sets targetStatus
   */
  public enum TargetStatusEnum {
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

    TargetStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TargetStatusEnum targetStatus;

  
  /**
   **/
  public RemoteMirrorPair base(VolumeEx base) {
    this.base = base;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("base")
  public VolumeEx getBase() {
    return base;
  }
  
  public void setBase(VolumeEx base) {
    this.base = base;
  }

  
  /**
   **/
  public RemoteMirrorPair target(VolumeEx target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("target")
  public VolumeEx getTarget() {
    return target;
  }
  
  public void setTarget(VolumeEx target) {
    this.target = target;
  }

  
  /**
   **/
  public RemoteMirrorPair baseArray(String baseArray) {
    this.baseArray = baseArray;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("baseArray")
  public String getBaseArray() {
    return baseArray;
  }
  
  public void setBaseArray(String baseArray) {
    this.baseArray = baseArray;
  }

  
  /**
   **/
  public RemoteMirrorPair targetArray(String targetArray) {
    this.targetArray = targetArray;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("targetArray")
  public String getTargetArray() {
    return targetArray;
  }
  
  public void setTargetArray(String targetArray) {
    this.targetArray = targetArray;
  }

  
  /**
   **/
  public RemoteMirrorPair id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public RemoteMirrorPair lastStartTime(Date lastStartTime) {
    this.lastStartTime = lastStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lastStartTime")
  public Date getLastStartTime() {
    return lastStartTime;
  }
  
  public void setLastStartTime(Date lastStartTime) {
    this.lastStartTime = lastStartTime;
  }

  
  /**
   **/
  public RemoteMirrorPair lastCompleteTime(Date lastCompleteTime) {
    this.lastCompleteTime = lastCompleteTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lastCompleteTime")
  public Date getLastCompleteTime() {
    return lastCompleteTime;
  }
  
  public void setLastCompleteTime(Date lastCompleteTime) {
    this.lastCompleteTime = lastCompleteTime;
  }

  
  /**
   **/
  public RemoteMirrorPair state(Integer state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("state")
  public Integer getState() {
    return state;
  }
  
  public void setState(Integer state) {
    this.state = state;
  }

  
  /**
   **/
  public RemoteMirrorPair priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   **/
  public RemoteMirrorPair writeMode(Integer writeMode) {
    this.writeMode = writeMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("writeMode")
  public Integer getWriteMode() {
    return writeMode;
  }
  
  public void setWriteMode(Integer writeMode) {
    this.writeMode = writeMode;
  }

  
  /**
   **/
  public RemoteMirrorPair autoResync(Boolean autoResync) {
    this.autoResync = autoResync;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("autoResync")
  public Boolean getAutoResync() {
    return autoResync;
  }
  
  public void setAutoResync(Boolean autoResync) {
    this.autoResync = autoResync;
  }

  
  /**
   **/
  public RemoteMirrorPair featureActive(Boolean featureActive) {
    this.featureActive = featureActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("featureActive")
  public Boolean getFeatureActive() {
    return featureActive;
  }
  
  public void setFeatureActive(Boolean featureActive) {
    this.featureActive = featureActive;
  }

  
  /**
   **/
  public RemoteMirrorPair status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public RemoteMirrorPair baseStatus(BaseStatusEnum baseStatus) {
    this.baseStatus = baseStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("baseStatus")
  public BaseStatusEnum getBaseStatus() {
    return baseStatus;
  }
  
  public void setBaseStatus(BaseStatusEnum baseStatus) {
    this.baseStatus = baseStatus;
  }

  
  /**
   **/
  public RemoteMirrorPair targetStatus(TargetStatusEnum targetStatus) {
    this.targetStatus = targetStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("targetStatus")
  public TargetStatusEnum getTargetStatus() {
    return targetStatus;
  }
  
  public void setTargetStatus(TargetStatusEnum targetStatus) {
    this.targetStatus = targetStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteMirrorPair remoteMirrorPair = (RemoteMirrorPair) o;
    return Objects.equals(this.base, remoteMirrorPair.base) &&
        Objects.equals(this.target, remoteMirrorPair.target) &&
        Objects.equals(this.baseArray, remoteMirrorPair.baseArray) &&
        Objects.equals(this.targetArray, remoteMirrorPair.targetArray) &&
        Objects.equals(this.id, remoteMirrorPair.id) &&
        Objects.equals(this.lastStartTime, remoteMirrorPair.lastStartTime) &&
        Objects.equals(this.lastCompleteTime, remoteMirrorPair.lastCompleteTime) &&
        Objects.equals(this.state, remoteMirrorPair.state) &&
        Objects.equals(this.priority, remoteMirrorPair.priority) &&
        Objects.equals(this.writeMode, remoteMirrorPair.writeMode) &&
        Objects.equals(this.autoResync, remoteMirrorPair.autoResync) &&
        Objects.equals(this.featureActive, remoteMirrorPair.featureActive) &&
        Objects.equals(this.status, remoteMirrorPair.status) &&
        Objects.equals(this.baseStatus, remoteMirrorPair.baseStatus) &&
        Objects.equals(this.targetStatus, remoteMirrorPair.targetStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, target, baseArray, targetArray, id, lastStartTime, lastCompleteTime, state, priority, writeMode, autoResync, featureActive, status, baseStatus, targetStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteMirrorPair {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    baseArray: ").append(toIndentedString(baseArray)).append("\n");
    sb.append("    targetArray: ").append(toIndentedString(targetArray)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastStartTime: ").append(toIndentedString(lastStartTime)).append("\n");
    sb.append("    lastCompleteTime: ").append(toIndentedString(lastCompleteTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    writeMode: ").append(toIndentedString(writeMode)).append("\n");
    sb.append("    autoResync: ").append(toIndentedString(autoResync)).append("\n");
    sb.append("    featureActive: ").append(toIndentedString(featureActive)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    baseStatus: ").append(toIndentedString(baseStatus)).append("\n");
    sb.append("    targetStatus: ").append(toIndentedString(targetStatus)).append("\n");
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

