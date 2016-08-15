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
 * Creates new Remote Volume Mirror
 */
@ApiModel(description = "Creates new Remote Volume Mirror")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class RemoteVolumeMirrorCreateRequest   {
  
    private String srcVolID;

    private String tgtVolWWN;

    private String remoteArrayId;

    private Integer copyType;

    private Integer priority;

    private Boolean autoResync;

  
  /**
   * Remote Volume Mirror source volume ID.
   **/
  public RemoteVolumeMirrorCreateRequest srcVolID(String srcVolID) {
    this.srcVolID = srcVolID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Remote Volume Mirror source volume ID.")
  @JsonProperty("srcVolID")
  public String getSrcVolID() {
    return srcVolID;
  }
  
  public void setSrcVolID(String srcVolID) {
    this.srcVolID = srcVolID;
  }

  
  /**
   **/
  public RemoteVolumeMirrorCreateRequest tgtVolWWN(String tgtVolWWN) {
    this.tgtVolWWN = tgtVolWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("tgtVolWWN")
  public String getTgtVolWWN() {
    return tgtVolWWN;
  }
  
  public void setTgtVolWWN(String tgtVolWWN) {
    this.tgtVolWWN = tgtVolWWN;
  }

  
  /**
   **/
  public RemoteVolumeMirrorCreateRequest remoteArrayId(String remoteArrayId) {
    this.remoteArrayId = remoteArrayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("remoteArrayId")
  public String getRemoteArrayId() {
    return remoteArrayId;
  }
  
  public void setRemoteArrayId(String remoteArrayId) {
    this.remoteArrayId = remoteArrayId;
  }

  
  /**
   **/
  public RemoteVolumeMirrorCreateRequest copyType(Integer copyType) {
    this.copyType = copyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("copyType")
  public Integer getCopyType() {
    return copyType;
  }
  
  public void setCopyType(Integer copyType) {
    this.copyType = copyType;
  }

  
  /**
   **/
  public RemoteVolumeMirrorCreateRequest priority(Integer priority) {
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
  public RemoteVolumeMirrorCreateRequest autoResync(Boolean autoResync) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteVolumeMirrorCreateRequest remoteVolumeMirrorCreateRequest = (RemoteVolumeMirrorCreateRequest) o;
    return Objects.equals(this.srcVolID, remoteVolumeMirrorCreateRequest.srcVolID) &&
        Objects.equals(this.tgtVolWWN, remoteVolumeMirrorCreateRequest.tgtVolWWN) &&
        Objects.equals(this.remoteArrayId, remoteVolumeMirrorCreateRequest.remoteArrayId) &&
        Objects.equals(this.copyType, remoteVolumeMirrorCreateRequest.copyType) &&
        Objects.equals(this.priority, remoteVolumeMirrorCreateRequest.priority) &&
        Objects.equals(this.autoResync, remoteVolumeMirrorCreateRequest.autoResync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcVolID, tgtVolWWN, remoteArrayId, copyType, priority, autoResync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteVolumeMirrorCreateRequest {\n");
    
    sb.append("    srcVolID: ").append(toIndentedString(srcVolID)).append("\n");
    sb.append("    tgtVolWWN: ").append(toIndentedString(tgtVolWWN)).append("\n");
    sb.append("    remoteArrayId: ").append(toIndentedString(remoteArrayId)).append("\n");
    sb.append("    copyType: ").append(toIndentedString(copyType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

