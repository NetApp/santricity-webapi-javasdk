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
 * MetadataVolume
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class MetadataVolume   {
  
    private String metadataVolRef;


  /**
   * This object specifies the metadata volume type.
   */
  public enum MetadataVolTypeEnum {
    allMdatTypes("allMdatTypes"),
    remoteMirror("remoteMirror"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MetadataVolTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MetadataVolTypeEnum metadataVolType;

    private String associatedVolume;

    private String preferredManager;

    private VolumePerms perms;

    private Boolean offline;

    private String reserved1;

  
  /**
   * This object identifies the metadata volume.
   **/
  public MetadataVolume metadataVolRef(String metadataVolRef) {
    this.metadataVolRef = metadataVolRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This object identifies the metadata volume.")
  @JsonProperty("metadataVolRef")
  public String getMetadataVolRef() {
    return metadataVolRef;
  }
  
  public void setMetadataVolRef(String metadataVolRef) {
    this.metadataVolRef = metadataVolRef;
  }

  
  /**
   * This object specifies the metadata volume type.
   **/
  public MetadataVolume metadataVolType(MetadataVolTypeEnum metadataVolType) {
    this.metadataVolType = metadataVolType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This object specifies the metadata volume type.")
  @JsonProperty("metadataVolType")
  public MetadataVolTypeEnum getMetadataVolType() {
    return metadataVolType;
  }
  
  public void setMetadataVolType(MetadataVolTypeEnum metadataVolType) {
    this.metadataVolType = metadataVolType;
  }

  
  /**
   * Volume that contains data
   **/
  public MetadataVolume associatedVolume(String associatedVolume) {
    this.associatedVolume = associatedVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Volume that contains data")
  @JsonProperty("associatedVolume")
  public String getAssociatedVolume() {
    return associatedVolume;
  }
  
  public void setAssociatedVolume(String associatedVolume) {
    this.associatedVolume = associatedVolume;
  }

  
  /**
   * The controller that created the metadata volume.
   **/
  public MetadataVolume preferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that created the metadata volume.")
  @JsonProperty("preferredManager")
  public String getPreferredManager() {
    return preferredManager;
  }
  
  public void setPreferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
  }

  
  /**
   * The permissions allowed.
   **/
  public MetadataVolume perms(VolumePerms perms) {
    this.perms = perms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The permissions allowed.")
  @JsonProperty("perms")
  public VolumePerms getPerms() {
    return perms;
  }
  
  public void setPerms(VolumePerms perms) {
    this.perms = perms;
  }

  
  /**
   * True, if the volume is offline.
   **/
  public MetadataVolume offline(Boolean offline) {
    this.offline = offline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if the volume is offline.")
  @JsonProperty("offline")
  public Boolean getOffline() {
    return offline;
  }
  
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   **/
  public MetadataVolume reserved1(String reserved1) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataVolume metadataVolume = (MetadataVolume) o;
    return Objects.equals(this.metadataVolRef, metadataVolume.metadataVolRef) &&
        Objects.equals(this.metadataVolType, metadataVolume.metadataVolType) &&
        Objects.equals(this.associatedVolume, metadataVolume.associatedVolume) &&
        Objects.equals(this.preferredManager, metadataVolume.preferredManager) &&
        Objects.equals(this.perms, metadataVolume.perms) &&
        Objects.equals(this.offline, metadataVolume.offline) &&
        Objects.equals(this.reserved1, metadataVolume.reserved1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataVolRef, metadataVolType, associatedVolume, preferredManager, perms, offline, reserved1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataVolume {\n");
    
    sb.append("    metadataVolRef: ").append(toIndentedString(metadataVolRef)).append("\n");
    sb.append("    metadataVolType: ").append(toIndentedString(metadataVolType)).append("\n");
    sb.append("    associatedVolume: ").append(toIndentedString(associatedVolume)).append("\n");
    sb.append("    preferredManager: ").append(toIndentedString(preferredManager)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
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

