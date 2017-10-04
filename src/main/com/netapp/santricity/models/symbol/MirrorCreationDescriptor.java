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
 * MirrorCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class MirrorCreationDescriptor   {
  
    private String baseVolume;

    private String remoteNodeWWN;

    private String remoteVolWWN;


  /**
   * Synchronization priority for mirrors.
   */
  public enum SyncPriorityEnum {
    priority0("priority0"),
    priority1("priority1"),
    priority2("priority2"),
    priority3("priority3"),
    priority4("priority4"),
    unknown("unknown"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SyncPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SyncPriorityEnum syncPriority;

    private RemoteMirrorAuthenticator remotePassword;


  /**
   * Mirror write mode for the pair.
   */
  public enum WriteModeEnum {
    synchronousMode("synchronousMode"),
    asynchronousMode("asynchronousMode"),
    consistentAsyncMode("consistentAsyncMode"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    WriteModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private WriteModeEnum writeMode;

    private Boolean autoResyncFlag;

    private String consistencyGroupRef;

    private ScsiNodeName remoteNodeName;

  
  /**
   * The local base volume to mirror from.
   **/
  public MirrorCreationDescriptor baseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The local base volume to mirror from.")
  @JsonProperty("baseVolume")
  public String getBaseVolume() {
    return baseVolume;
  }
  
  public void setBaseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
  }

  
  /**
   * This field is deprecated. It will continue to be supported if remoteNodeName is NULL (IOInterfaceType == IO_IF_NOT_IMPLEMENTED). This will allow continued compatibility with clients still using this field.
   **/
  public MirrorCreationDescriptor remoteNodeWWN(String remoteNodeWWN) {
    this.remoteNodeWWN = remoteNodeWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is deprecated. It will continue to be supported if remoteNodeName is NULL (IOInterfaceType == IO_IF_NOT_IMPLEMENTED). This will allow continued compatibility with clients still using this field.")
  @JsonProperty("remoteNodeWWN")
  public String getRemoteNodeWWN() {
    return remoteNodeWWN;
  }
  
  public void setRemoteNodeWWN(String remoteNodeWWN) {
    this.remoteNodeWWN = remoteNodeWWN;
  }

  
  /**
   * Remote volume WWN.
   **/
  public MirrorCreationDescriptor remoteVolWWN(String remoteVolWWN) {
    this.remoteVolWWN = remoteVolWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Remote volume WWN.")
  @JsonProperty("remoteVolWWN")
  public String getRemoteVolWWN() {
    return remoteVolWWN;
  }
  
  public void setRemoteVolWWN(String remoteVolWWN) {
    this.remoteVolWWN = remoteVolWWN;
  }

  
  /**
   * Synchronization priority for mirrors.
   **/
  public MirrorCreationDescriptor syncPriority(SyncPriorityEnum syncPriority) {
    this.syncPriority = syncPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Synchronization priority for mirrors.")
  @JsonProperty("syncPriority")
  public SyncPriorityEnum getSyncPriority() {
    return syncPriority;
  }
  
  public void setSyncPriority(SyncPriorityEnum syncPriority) {
    this.syncPriority = syncPriority;
  }

  
  /**
   * The password of the remote array.
   **/
  public MirrorCreationDescriptor remotePassword(RemoteMirrorAuthenticator remotePassword) {
    this.remotePassword = remotePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The password of the remote array.")
  @JsonProperty("remotePassword")
  public RemoteMirrorAuthenticator getRemotePassword() {
    return remotePassword;
  }
  
  public void setRemotePassword(RemoteMirrorAuthenticator remotePassword) {
    this.remotePassword = remotePassword;
  }

  
  /**
   * Mirror write mode for the pair.
   **/
  public MirrorCreationDescriptor writeMode(WriteModeEnum writeMode) {
    this.writeMode = writeMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Mirror write mode for the pair.")
  @JsonProperty("writeMode")
  public WriteModeEnum getWriteMode() {
    return writeMode;
  }
  
  public void setWriteMode(WriteModeEnum writeMode) {
    this.writeMode = writeMode;
  }

  
  /**
   * Indicator for whether automatic resynchronization is allowed for this mirror.
   **/
  public MirrorCreationDescriptor autoResyncFlag(Boolean autoResyncFlag) {
    this.autoResyncFlag = autoResyncFlag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicator for whether automatic resynchronization is allowed for this mirror.")
  @JsonProperty("autoResyncFlag")
  public Boolean getAutoResyncFlag() {
    return autoResyncFlag;
  }
  
  public void setAutoResyncFlag(Boolean autoResyncFlag) {
    this.autoResyncFlag = autoResyncFlag;
  }

  
  /**
   * Write consistency group reference. NULL = not in group.
   **/
  public MirrorCreationDescriptor consistencyGroupRef(String consistencyGroupRef) {
    this.consistencyGroupRef = consistencyGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Write consistency group reference. NULL = not in group.")
  @JsonProperty("consistencyGroupRef")
  public String getConsistencyGroupRef() {
    return consistencyGroupRef;
  }
  
  public void setConsistencyGroupRef(String consistencyGroupRef) {
    this.consistencyGroupRef = consistencyGroupRef;
  }

  
  /**
   * The name of the RemoteVolume.
   **/
  public MirrorCreationDescriptor remoteNodeName(ScsiNodeName remoteNodeName) {
    this.remoteNodeName = remoteNodeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the RemoteVolume.")
  @JsonProperty("remoteNodeName")
  public ScsiNodeName getRemoteNodeName() {
    return remoteNodeName;
  }
  
  public void setRemoteNodeName(ScsiNodeName remoteNodeName) {
    this.remoteNodeName = remoteNodeName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MirrorCreationDescriptor mirrorCreationDescriptor = (MirrorCreationDescriptor) o;
    return Objects.equals(this.baseVolume, mirrorCreationDescriptor.baseVolume) &&
        Objects.equals(this.remoteNodeWWN, mirrorCreationDescriptor.remoteNodeWWN) &&
        Objects.equals(this.remoteVolWWN, mirrorCreationDescriptor.remoteVolWWN) &&
        Objects.equals(this.syncPriority, mirrorCreationDescriptor.syncPriority) &&
        Objects.equals(this.remotePassword, mirrorCreationDescriptor.remotePassword) &&
        Objects.equals(this.writeMode, mirrorCreationDescriptor.writeMode) &&
        Objects.equals(this.autoResyncFlag, mirrorCreationDescriptor.autoResyncFlag) &&
        Objects.equals(this.consistencyGroupRef, mirrorCreationDescriptor.consistencyGroupRef) &&
        Objects.equals(this.remoteNodeName, mirrorCreationDescriptor.remoteNodeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseVolume, remoteNodeWWN, remoteVolWWN, syncPriority, remotePassword, writeMode, autoResyncFlag, consistencyGroupRef, remoteNodeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MirrorCreationDescriptor {\n");
    
    sb.append("    baseVolume: ").append(toIndentedString(baseVolume)).append("\n");
    sb.append("    remoteNodeWWN: ").append(toIndentedString(remoteNodeWWN)).append("\n");
    sb.append("    remoteVolWWN: ").append(toIndentedString(remoteVolWWN)).append("\n");
    sb.append("    syncPriority: ").append(toIndentedString(syncPriority)).append("\n");
    sb.append("    remotePassword: ").append(toIndentedString(remotePassword)).append("\n");
    sb.append("    writeMode: ").append(toIndentedString(writeMode)).append("\n");
    sb.append("    autoResyncFlag: ").append(toIndentedString(autoResyncFlag)).append("\n");
    sb.append("    consistencyGroupRef: ").append(toIndentedString(consistencyGroupRef)).append("\n");
    sb.append("    remoteNodeName: ").append(toIndentedString(remoteNodeName)).append("\n");
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

