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
 * Updates the RemoteVolumeMirror Data.
 */
@ApiModel(description = "Updates the RemoteVolumeMirror Data.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class RemoteVolumeMirrorUpdateRequest   {
  
    private String ref;

    private String baseVolumeId;

    private String remoteVolumeId;

    private Integer role;


  /**
   * Remote Volume Mirror update type request.
   */
  public enum UpdateTypeEnum {
    suspend("suspend"),
    resume("resume"),
    resync("resync"),
    roleChange("roleChange"),
    updateParams("updateParams");
;
    private String value;

    UpdateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private UpdateTypeEnum updateType;

    private Integer priority;

    private Integer writeMode;

    private Boolean autoResync;

  
  /**
   * Remote Volume Mirror Ref.
   **/
  public RemoteVolumeMirrorUpdateRequest ref(String ref) {
    this.ref = ref;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Remote Volume Mirror Ref.")
  @JsonProperty("ref")
  public String getRef() {
    return ref;
  }
  
  public void setRef(String ref) {
    this.ref = ref;
  }

  
  /**
   * Remote Volume Mirror base volume.
   **/
  public RemoteVolumeMirrorUpdateRequest baseVolumeId(String baseVolumeId) {
    this.baseVolumeId = baseVolumeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Remote Volume Mirror base volume.")
  @JsonProperty("baseVolumeId")
  public String getBaseVolumeId() {
    return baseVolumeId;
  }
  
  public void setBaseVolumeId(String baseVolumeId) {
    this.baseVolumeId = baseVolumeId;
  }

  
  /**
   * Remote Volume Mirror remote volume.
   **/
  public RemoteVolumeMirrorUpdateRequest remoteVolumeId(String remoteVolumeId) {
    this.remoteVolumeId = remoteVolumeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Remote Volume Mirror remote volume.")
  @JsonProperty("remoteVolumeId")
  public String getRemoteVolumeId() {
    return remoteVolumeId;
  }
  
  public void setRemoteVolumeId(String remoteVolumeId) {
    this.remoteVolumeId = remoteVolumeId;
  }

  
  /**
   * Remote Volume Mirror role. 0, set role to primary.  1, set role to secondary
   **/
  public RemoteVolumeMirrorUpdateRequest role(Integer role) {
    this.role = role;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Remote Volume Mirror role. 0, set role to primary.  1, set role to secondary")
  @JsonProperty("role")
  public Integer getRole() {
    return role;
  }
  
  public void setRole(Integer role) {
    this.role = role;
  }

  
  /**
   * Remote Volume Mirror update type request.
   **/
  public RemoteVolumeMirrorUpdateRequest updateType(UpdateTypeEnum updateType) {
    this.updateType = updateType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Remote Volume Mirror update type request.")
  @JsonProperty("updateType")
  public UpdateTypeEnum getUpdateType() {
    return updateType;
  }
  
  public void setUpdateType(UpdateTypeEnum updateType) {
    this.updateType = updateType;
  }

  
  /**
   **/
  public RemoteVolumeMirrorUpdateRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   **/
  public RemoteVolumeMirrorUpdateRequest writeMode(Integer writeMode) {
    this.writeMode = writeMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("writeMode")
  public Integer getWriteMode() {
    return writeMode;
  }
  
  public void setWriteMode(Integer writeMode) {
    this.writeMode = writeMode;
  }

  
  /**
   **/
  public RemoteVolumeMirrorUpdateRequest autoResync(Boolean autoResync) {
    this.autoResync = autoResync;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("autoResync")
  public Boolean getAutoResync() {
    return autoResync;
  }
  
  public void setAutoResync(Boolean autoResync) {
    this.autoResync = autoResync;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteVolumeMirrorUpdateRequest remoteVolumeMirrorUpdateRequest = (RemoteVolumeMirrorUpdateRequest) o;
    return Objects.equals(this.ref, remoteVolumeMirrorUpdateRequest.ref) &&
        Objects.equals(this.baseVolumeId, remoteVolumeMirrorUpdateRequest.baseVolumeId) &&
        Objects.equals(this.remoteVolumeId, remoteVolumeMirrorUpdateRequest.remoteVolumeId) &&
        Objects.equals(this.role, remoteVolumeMirrorUpdateRequest.role) &&
        Objects.equals(this.updateType, remoteVolumeMirrorUpdateRequest.updateType) &&
        Objects.equals(this.priority, remoteVolumeMirrorUpdateRequest.priority) &&
        Objects.equals(this.writeMode, remoteVolumeMirrorUpdateRequest.writeMode) &&
        Objects.equals(this.autoResync, remoteVolumeMirrorUpdateRequest.autoResync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, baseVolumeId, remoteVolumeId, role, updateType, priority, writeMode, autoResync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteVolumeMirrorUpdateRequest {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    baseVolumeId: ").append(toIndentedString(baseVolumeId)).append("\n");
    sb.append("    remoteVolumeId: ").append(toIndentedString(remoteVolumeId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    writeMode: ").append(toIndentedString(writeMode)).append("\n");
    sb.append("    autoResync: ").append(toIndentedString(autoResync)).append("\n");
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

