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
 * RemoteVolume
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RemoteVolume   {
  
    private String worldWideName;

    private String remoteVolRef;

    private String manager;

    private SAIdentifier remoteArrayId;

    private String remoteNodeWWN;

    private String remoteVolWWN;

    private String remoteVolUserLabel;


  /**
   * The state of the current remote volume.
   */
  public enum RemoteVolStateEnum {
    optimal("optimal"),
    noLun("noLun"),
    noArray("noArray"),
    noFabric("noFabric"),
    initializing("initializing"),
    wwnChangeFailed("wwnChangeFailed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RemoteVolStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RemoteVolStateEnum remoteVolState;

    private Long remoteVolCapacity;

    private Integer volumeHandle;

    private VolumePerms perms;

    private String reserved1;

    private String reserved2;

    private ScsiNodeName remoteNodeName;


  /**
   * The security type of the volume on the remote array. Note this may be SECURITY_TYPE_UNKNOWN if connection to remote array is down.
   */
  public enum RemoteVolSecurityTypeEnum {
    unknown("unknown"),
    none("none"),
    capable("capable"),
    enabled("enabled"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RemoteVolSecurityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RemoteVolSecurityTypeEnum remoteVolSecurityType;

  
  /**
   * The WWN of the remote volume.
   **/
  public RemoteVolume worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the remote volume.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The identifier of the remote volume.
   **/
  public RemoteVolume remoteVolRef(String remoteVolRef) {
    this.remoteVolRef = remoteVolRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the remote volume.")
  @JsonProperty("remoteVolRef")
  public String getRemoteVolRef() {
    return remoteVolRef;
  }
  
  public void setRemoteVolRef(String remoteVolRef) {
    this.remoteVolRef = remoteVolRef;
  }

  
  /**
   * The controller that owns the remote volume.
   **/
  public RemoteVolume manager(String manager) {
    this.manager = manager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that owns the remote volume.")
  @JsonProperty("manager")
  public String getManager() {
    return manager;
  }
  
  public void setManager(String manager) {
    this.manager = manager;
  }

  
  /**
   * The identifier of the remote array.
   **/
  public RemoteVolume remoteArrayId(SAIdentifier remoteArrayId) {
    this.remoteArrayId = remoteArrayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the remote array.")
  @JsonProperty("remoteArrayId")
  public SAIdentifier getRemoteArrayId() {
    return remoteArrayId;
  }
  
  public void setRemoteArrayId(SAIdentifier remoteArrayId) {
    this.remoteArrayId = remoteArrayId;
  }

  
  /**
   * This field is deprecated. It will continue to be supported if remoteNodeName is NULL (IOInterfaceType == IO_IF_NOT_IMPLEMENTED). This will allow continued compatibility with clients still using this field.
   **/
  public RemoteVolume remoteNodeWWN(String remoteNodeWWN) {
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
   * The WWN of the volume on the remote array.
   **/
  public RemoteVolume remoteVolWWN(String remoteVolWWN) {
    this.remoteVolWWN = remoteVolWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the volume on the remote array.")
  @JsonProperty("remoteVolWWN")
  public String getRemoteVolWWN() {
    return remoteVolWWN;
  }
  
  public void setRemoteVolWWN(String remoteVolWWN) {
    this.remoteVolWWN = remoteVolWWN;
  }

  
  /**
   * The user assigned label of the remote volume.
   **/
  public RemoteVolume remoteVolUserLabel(String remoteVolUserLabel) {
    this.remoteVolUserLabel = remoteVolUserLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned label of the remote volume.")
  @JsonProperty("remoteVolUserLabel")
  public String getRemoteVolUserLabel() {
    return remoteVolUserLabel;
  }
  
  public void setRemoteVolUserLabel(String remoteVolUserLabel) {
    this.remoteVolUserLabel = remoteVolUserLabel;
  }

  
  /**
   * The state of the current remote volume.
   **/
  public RemoteVolume remoteVolState(RemoteVolStateEnum remoteVolState) {
    this.remoteVolState = remoteVolState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the current remote volume.")
  @JsonProperty("remoteVolState")
  public RemoteVolStateEnum getRemoteVolState() {
    return remoteVolState;
  }
  
  public void setRemoteVolState(RemoteVolStateEnum remoteVolState) {
    this.remoteVolState = remoteVolState;
  }

  
  /**
   * The actual capacity of the volume on the remote array.
   **/
  public RemoteVolume remoteVolCapacity(Long remoteVolCapacity) {
    this.remoteVolCapacity = remoteVolCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The actual capacity of the volume on the remote array.")
  @JsonProperty("remoteVolCapacity")
  public Long getRemoteVolCapacity() {
    return remoteVolCapacity;
  }
  
  public void setRemoteVolCapacity(Long remoteVolCapacity) {
    this.remoteVolCapacity = remoteVolCapacity;
  }

  
  /**
   * The SSID of the remote volume.
   **/
  public RemoteVolume volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SSID of the remote volume.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * The permissions of the volume.
   **/
  public RemoteVolume perms(VolumePerms perms) {
    this.perms = perms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The permissions of the volume.")
  @JsonProperty("perms")
  public VolumePerms getPerms() {
    return perms;
  }
  
  public void setPerms(VolumePerms perms) {
    this.perms = perms;
  }

  
  /**
   **/
  public RemoteVolume reserved1(String reserved1) {
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
   **/
  public RemoteVolume reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  
  /**
   * The name of the RemoteVolume.
   **/
  public RemoteVolume remoteNodeName(ScsiNodeName remoteNodeName) {
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

  
  /**
   * The security type of the volume on the remote array. Note this may be SECURITY_TYPE_UNKNOWN if connection to remote array is down.
   **/
  public RemoteVolume remoteVolSecurityType(RemoteVolSecurityTypeEnum remoteVolSecurityType) {
    this.remoteVolSecurityType = remoteVolSecurityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The security type of the volume on the remote array. Note this may be SECURITY_TYPE_UNKNOWN if connection to remote array is down.")
  @JsonProperty("remoteVolSecurityType")
  public RemoteVolSecurityTypeEnum getRemoteVolSecurityType() {
    return remoteVolSecurityType;
  }
  
  public void setRemoteVolSecurityType(RemoteVolSecurityTypeEnum remoteVolSecurityType) {
    this.remoteVolSecurityType = remoteVolSecurityType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteVolume remoteVolume = (RemoteVolume) o;
    return Objects.equals(this.worldWideName, remoteVolume.worldWideName) &&
        Objects.equals(this.remoteVolRef, remoteVolume.remoteVolRef) &&
        Objects.equals(this.manager, remoteVolume.manager) &&
        Objects.equals(this.remoteArrayId, remoteVolume.remoteArrayId) &&
        Objects.equals(this.remoteNodeWWN, remoteVolume.remoteNodeWWN) &&
        Objects.equals(this.remoteVolWWN, remoteVolume.remoteVolWWN) &&
        Objects.equals(this.remoteVolUserLabel, remoteVolume.remoteVolUserLabel) &&
        Objects.equals(this.remoteVolState, remoteVolume.remoteVolState) &&
        Objects.equals(this.remoteVolCapacity, remoteVolume.remoteVolCapacity) &&
        Objects.equals(this.volumeHandle, remoteVolume.volumeHandle) &&
        Objects.equals(this.perms, remoteVolume.perms) &&
        Objects.equals(this.reserved1, remoteVolume.reserved1) &&
        Objects.equals(this.reserved2, remoteVolume.reserved2) &&
        Objects.equals(this.remoteNodeName, remoteVolume.remoteNodeName) &&
        Objects.equals(this.remoteVolSecurityType, remoteVolume.remoteVolSecurityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worldWideName, remoteVolRef, manager, remoteArrayId, remoteNodeWWN, remoteVolWWN, remoteVolUserLabel, remoteVolState, remoteVolCapacity, volumeHandle, perms, reserved1, reserved2, remoteNodeName, remoteVolSecurityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteVolume {\n");
    
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    remoteVolRef: ").append(toIndentedString(remoteVolRef)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    remoteArrayId: ").append(toIndentedString(remoteArrayId)).append("\n");
    sb.append("    remoteNodeWWN: ").append(toIndentedString(remoteNodeWWN)).append("\n");
    sb.append("    remoteVolWWN: ").append(toIndentedString(remoteVolWWN)).append("\n");
    sb.append("    remoteVolUserLabel: ").append(toIndentedString(remoteVolUserLabel)).append("\n");
    sb.append("    remoteVolState: ").append(toIndentedString(remoteVolState)).append("\n");
    sb.append("    remoteVolCapacity: ").append(toIndentedString(remoteVolCapacity)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    remoteNodeName: ").append(toIndentedString(remoteNodeName)).append("\n");
    sb.append("    remoteVolSecurityType: ").append(toIndentedString(remoteVolSecurityType)).append("\n");
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

