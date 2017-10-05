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
 * VolumePerms
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumePerms   {
  
    private Boolean mapToLUN;

    private Boolean snapShot;

    private Boolean format;

    private Boolean reconfigure;

    private Boolean mirrorPrimary;

    private Boolean mirrorSecondary;

    private Boolean copySource;

    private Boolean copyTarget;

    private Boolean readable;

    private Boolean writable;

    private Boolean rollback;

    private Boolean mirrorSync;

    private Boolean newImage;

    private Boolean allowDVE;

    private Boolean allowDSS;

    private Boolean concatVolumeMember;

    private Boolean flashReadCache;

    private Boolean asyncMirrorPrimary;

    private Boolean asyncMirrorSecondary;

    private Boolean pitGroup;

    private Boolean cacheParametersChangeable;

    private Boolean allowThinManualExpansion;

    private Boolean allowThinGrowthParametersChange;

  
  /**
   * Can this volume be mapped to a LUN
   **/
  public VolumePerms mapToLUN(Boolean mapToLUN) {
    this.mapToLUN = mapToLUN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Can this volume be mapped to a LUN")
  @JsonProperty("mapToLUN")
  public Boolean getMapToLUN() {
    return mapToLUN;
  }
  
  public void setMapToLUN(Boolean mapToLUN) {
    this.mapToLUN = mapToLUN;
  }

  
  /**
   * This is true if the volume can have a snapshot.
   **/
  public VolumePerms snapShot(Boolean snapShot) {
    this.snapShot = snapShot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is true if the volume can have a snapshot.")
  @JsonProperty("snapShot")
  public Boolean getSnapShot() {
    return snapShot;
  }
  
  public void setSnapShot(Boolean snapShot) {
    this.snapShot = snapShot;
  }

  
  /**
   * This is true if the volume can be formatted.
   **/
  public VolumePerms format(Boolean format) {
    this.format = format;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is true if the volume can be formatted.")
  @JsonProperty("format")
  public Boolean getFormat() {
    return format;
  }
  
  public void setFormat(Boolean format) {
    this.format = format;
  }

  
  /**
   * This is true if the volume can be reconfigured (DVE, DCE, DRM, etc.).
   **/
  public VolumePerms reconfigure(Boolean reconfigure) {
    this.reconfigure = reconfigure;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is true if the volume can be reconfigured (DVE, DCE, DRM, etc.).")
  @JsonProperty("reconfigure")
  public Boolean getReconfigure() {
    return reconfigure;
  }
  
  public void setReconfigure(Boolean reconfigure) {
    this.reconfigure = reconfigure;
  }

  
  /**
   * This is true if the volume can be a primary mirror.
   **/
  public VolumePerms mirrorPrimary(Boolean mirrorPrimary) {
    this.mirrorPrimary = mirrorPrimary;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is true if the volume can be a primary mirror.")
  @JsonProperty("mirrorPrimary")
  public Boolean getMirrorPrimary() {
    return mirrorPrimary;
  }
  
  public void setMirrorPrimary(Boolean mirrorPrimary) {
    this.mirrorPrimary = mirrorPrimary;
  }

  
  /**
   * This is true if the volume can be a secondary mirror.
   **/
  public VolumePerms mirrorSecondary(Boolean mirrorSecondary) {
    this.mirrorSecondary = mirrorSecondary;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is true if the volume can be a secondary mirror.")
  @JsonProperty("mirrorSecondary")
  public Boolean getMirrorSecondary() {
    return mirrorSecondary;
  }
  
  public void setMirrorSecondary(Boolean mirrorSecondary) {
    this.mirrorSecondary = mirrorSecondary;
  }

  
  /**
   * This is true if the volume can be the source for a copy.
   **/
  public VolumePerms copySource(Boolean copySource) {
    this.copySource = copySource;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is true if the volume can be the source for a copy.")
  @JsonProperty("copySource")
  public Boolean getCopySource() {
    return copySource;
  }
  
  public void setCopySource(Boolean copySource) {
    this.copySource = copySource;
  }

  
  /**
   * This is true if the volume can be the target for a copy.
   **/
  public VolumePerms copyTarget(Boolean copyTarget) {
    this.copyTarget = copyTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is true if the volume can be the target for a copy.")
  @JsonProperty("copyTarget")
  public Boolean getCopyTarget() {
    return copyTarget;
  }
  
  public void setCopyTarget(Boolean copyTarget) {
    this.copyTarget = copyTarget;
  }

  
  /**
   * This is true if the volume can be read by a host.
   **/
  public VolumePerms readable(Boolean readable) {
    this.readable = readable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is true if the volume can be read by a host.")
  @JsonProperty("readable")
  public Boolean getReadable() {
    return readable;
  }
  
  public void setReadable(Boolean readable) {
    this.readable = readable;
  }

  
  /**
   * Can this volume be written by a host
   **/
  public VolumePerms writable(Boolean writable) {
    this.writable = writable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Can this volume be written by a host")
  @JsonProperty("writable")
  public Boolean getWritable() {
    return writable;
  }
  
  public void setWritable(Boolean writable) {
    this.writable = writable;
  }

  
  /**
   * Set to true if a snapshot rollback can be applied to this volume.
   **/
  public VolumePerms rollback(Boolean rollback) {
    this.rollback = rollback;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if a snapshot rollback can be applied to this volume.")
  @JsonProperty("rollback")
  public Boolean getRollback() {
    return rollback;
  }
  
  public void setRollback(Boolean rollback) {
    this.rollback = rollback;
  }

  
  /**
   * Set to true if a remote volume mirror can actively synchronize this volume's data
   **/
  public VolumePerms mirrorSync(Boolean mirrorSync) {
    this.mirrorSync = mirrorSync;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if a remote volume mirror can actively synchronize this volume's data")
  @JsonProperty("mirrorSync")
  public Boolean getMirrorSync() {
    return mirrorSync;
  }
  
  public void setMirrorSync(Boolean mirrorSync) {
    this.mirrorSync = mirrorSync;
  }

  
  /**
   * Set to true when a new point-in-time image can be taken of this volume, either by creating a new snapshot or re-creating an existing snapshot.
   **/
  public VolumePerms newImage(Boolean newImage) {
    this.newImage = newImage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true when a new point-in-time image can be taken of this volume, either by creating a new snapshot or re-creating an existing snapshot.")
  @JsonProperty("newImage")
  public Boolean getNewImage() {
    return newImage;
  }
  
  public void setNewImage(Boolean newImage) {
    this.newImage = newImage;
  }

  
  /**
   * If true, this volume can be expanded via DVE. If false, this will still allow general reconfigures (providing the 'reconfigure' field is true), but disallow DVE specifically.
   **/
  public VolumePerms allowDVE(Boolean allowDVE) {
    this.allowDVE = allowDVE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, this volume can be expanded via DVE. If false, this will still allow general reconfigures (providing the 'reconfigure' field is true), but disallow DVE specifically.")
  @JsonProperty("allowDVE")
  public Boolean getAllowDVE() {
    return allowDVE;
  }
  
  public void setAllowDVE(Boolean allowDVE) {
    this.allowDVE = allowDVE;
  }

  
  /**
   * If true, this volume can undergo a segment size change (DSS). If false, this will still allow general reconfigures (providing the 'reconfigure' field is true), but disallow DSS specifically.
   **/
  public VolumePerms allowDSS(Boolean allowDSS) {
    this.allowDSS = allowDSS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, this volume can undergo a segment size change (DSS). If false, this will still allow general reconfigures (providing the 'reconfigure' field is true), but disallow DSS specifically.")
  @JsonProperty("allowDSS")
  public Boolean getAllowDSS() {
    return allowDSS;
  }
  
  public void setAllowDSS(Boolean allowDSS) {
    this.allowDSS = allowDSS;
  }

  
  /**
   * If true, this volume can be a member of a ConcatVolume.
   **/
  public VolumePerms concatVolumeMember(Boolean concatVolumeMember) {
    this.concatVolumeMember = concatVolumeMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, this volume can be a member of a ConcatVolume.")
  @JsonProperty("concatVolumeMember")
  public Boolean getConcatVolumeMember() {
    return concatVolumeMember;
  }
  
  public void setConcatVolumeMember(Boolean concatVolumeMember) {
    this.concatVolumeMember = concatVolumeMember;
  }

  
  /**
   * If true, this volume can have flash read cache enabled.
   **/
  public VolumePerms flashReadCache(Boolean flashReadCache) {
    this.flashReadCache = flashReadCache;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, this volume can have flash read cache enabled.")
  @JsonProperty("flashReadCache")
  public Boolean getFlashReadCache() {
    return flashReadCache;
  }
  
  public void setFlashReadCache(Boolean flashReadCache) {
    this.flashReadCache = flashReadCache;
  }

  
  /**
   * If true, this volume can be an Async RVM primary.
   **/
  public VolumePerms asyncMirrorPrimary(Boolean asyncMirrorPrimary) {
    this.asyncMirrorPrimary = asyncMirrorPrimary;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, this volume can be an Async RVM primary.")
  @JsonProperty("asyncMirrorPrimary")
  public Boolean getAsyncMirrorPrimary() {
    return asyncMirrorPrimary;
  }
  
  public void setAsyncMirrorPrimary(Boolean asyncMirrorPrimary) {
    this.asyncMirrorPrimary = asyncMirrorPrimary;
  }

  
  /**
   * If true, this volume can be an Async RVM primary.
   **/
  public VolumePerms asyncMirrorSecondary(Boolean asyncMirrorSecondary) {
    this.asyncMirrorSecondary = asyncMirrorSecondary;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, this volume can be an Async RVM primary.")
  @JsonProperty("asyncMirrorSecondary")
  public Boolean getAsyncMirrorSecondary() {
    return asyncMirrorSecondary;
  }
  
  public void setAsyncMirrorSecondary(Boolean asyncMirrorSecondary) {
    this.asyncMirrorSecondary = asyncMirrorSecondary;
  }

  
  /**
   * If true, a PiT group can be created on this volume.
   **/
  public VolumePerms pitGroup(Boolean pitGroup) {
    this.pitGroup = pitGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, a PiT group can be created on this volume.")
  @JsonProperty("pitGroup")
  public Boolean getPitGroup() {
    return pitGroup;
  }
  
  public void setPitGroup(Boolean pitGroup) {
    this.pitGroup = pitGroup;
  }

  
  /**
   * If true, cache parameters may be changed on this volume.
   **/
  public VolumePerms cacheParametersChangeable(Boolean cacheParametersChangeable) {
    this.cacheParametersChangeable = cacheParametersChangeable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, cache parameters may be changed on this volume.")
  @JsonProperty("cacheParametersChangeable")
  public Boolean getCacheParametersChangeable() {
    return cacheParametersChangeable;
  }
  
  public void setCacheParametersChangeable(Boolean cacheParametersChangeable) {
    this.cacheParametersChangeable = cacheParametersChangeable;
  }

  
  /**
   * If true, changes to manual mode while the thin volume is in an Asynchronous Mirror Group (AMG) are allowed.
   **/
  public VolumePerms allowThinManualExpansion(Boolean allowThinManualExpansion) {
    this.allowThinManualExpansion = allowThinManualExpansion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, changes to manual mode while the thin volume is in an Asynchronous Mirror Group (AMG) are allowed.")
  @JsonProperty("allowThinManualExpansion")
  public Boolean getAllowThinManualExpansion() {
    return allowThinManualExpansion;
  }
  
  public void setAllowThinManualExpansion(Boolean allowThinManualExpansion) {
    this.allowThinManualExpansion = allowThinManualExpansion;
  }

  
  /**
   * If true, changes to the growth parameters (quota or warning threshold values) while the thin volume is in an Asynchronous Mirror Group (AMG) are allowed.
   **/
  public VolumePerms allowThinGrowthParametersChange(Boolean allowThinGrowthParametersChange) {
    this.allowThinGrowthParametersChange = allowThinGrowthParametersChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, changes to the growth parameters (quota or warning threshold values) while the thin volume is in an Asynchronous Mirror Group (AMG) are allowed.")
  @JsonProperty("allowThinGrowthParametersChange")
  public Boolean getAllowThinGrowthParametersChange() {
    return allowThinGrowthParametersChange;
  }
  
  public void setAllowThinGrowthParametersChange(Boolean allowThinGrowthParametersChange) {
    this.allowThinGrowthParametersChange = allowThinGrowthParametersChange;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumePerms volumePerms = (VolumePerms) o;
    return Objects.equals(this.mapToLUN, volumePerms.mapToLUN) &&
        Objects.equals(this.snapShot, volumePerms.snapShot) &&
        Objects.equals(this.format, volumePerms.format) &&
        Objects.equals(this.reconfigure, volumePerms.reconfigure) &&
        Objects.equals(this.mirrorPrimary, volumePerms.mirrorPrimary) &&
        Objects.equals(this.mirrorSecondary, volumePerms.mirrorSecondary) &&
        Objects.equals(this.copySource, volumePerms.copySource) &&
        Objects.equals(this.copyTarget, volumePerms.copyTarget) &&
        Objects.equals(this.readable, volumePerms.readable) &&
        Objects.equals(this.writable, volumePerms.writable) &&
        Objects.equals(this.rollback, volumePerms.rollback) &&
        Objects.equals(this.mirrorSync, volumePerms.mirrorSync) &&
        Objects.equals(this.newImage, volumePerms.newImage) &&
        Objects.equals(this.allowDVE, volumePerms.allowDVE) &&
        Objects.equals(this.allowDSS, volumePerms.allowDSS) &&
        Objects.equals(this.concatVolumeMember, volumePerms.concatVolumeMember) &&
        Objects.equals(this.flashReadCache, volumePerms.flashReadCache) &&
        Objects.equals(this.asyncMirrorPrimary, volumePerms.asyncMirrorPrimary) &&
        Objects.equals(this.asyncMirrorSecondary, volumePerms.asyncMirrorSecondary) &&
        Objects.equals(this.pitGroup, volumePerms.pitGroup) &&
        Objects.equals(this.cacheParametersChangeable, volumePerms.cacheParametersChangeable) &&
        Objects.equals(this.allowThinManualExpansion, volumePerms.allowThinManualExpansion) &&
        Objects.equals(this.allowThinGrowthParametersChange, volumePerms.allowThinGrowthParametersChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapToLUN, snapShot, format, reconfigure, mirrorPrimary, mirrorSecondary, copySource, copyTarget, readable, writable, rollback, mirrorSync, newImage, allowDVE, allowDSS, concatVolumeMember, flashReadCache, asyncMirrorPrimary, asyncMirrorSecondary, pitGroup, cacheParametersChangeable, allowThinManualExpansion, allowThinGrowthParametersChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumePerms {\n");
    
    sb.append("    mapToLUN: ").append(toIndentedString(mapToLUN)).append("\n");
    sb.append("    snapShot: ").append(toIndentedString(snapShot)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    reconfigure: ").append(toIndentedString(reconfigure)).append("\n");
    sb.append("    mirrorPrimary: ").append(toIndentedString(mirrorPrimary)).append("\n");
    sb.append("    mirrorSecondary: ").append(toIndentedString(mirrorSecondary)).append("\n");
    sb.append("    copySource: ").append(toIndentedString(copySource)).append("\n");
    sb.append("    copyTarget: ").append(toIndentedString(copyTarget)).append("\n");
    sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
    sb.append("    writable: ").append(toIndentedString(writable)).append("\n");
    sb.append("    rollback: ").append(toIndentedString(rollback)).append("\n");
    sb.append("    mirrorSync: ").append(toIndentedString(mirrorSync)).append("\n");
    sb.append("    newImage: ").append(toIndentedString(newImage)).append("\n");
    sb.append("    allowDVE: ").append(toIndentedString(allowDVE)).append("\n");
    sb.append("    allowDSS: ").append(toIndentedString(allowDSS)).append("\n");
    sb.append("    concatVolumeMember: ").append(toIndentedString(concatVolumeMember)).append("\n");
    sb.append("    flashReadCache: ").append(toIndentedString(flashReadCache)).append("\n");
    sb.append("    asyncMirrorPrimary: ").append(toIndentedString(asyncMirrorPrimary)).append("\n");
    sb.append("    asyncMirrorSecondary: ").append(toIndentedString(asyncMirrorSecondary)).append("\n");
    sb.append("    pitGroup: ").append(toIndentedString(pitGroup)).append("\n");
    sb.append("    cacheParametersChangeable: ").append(toIndentedString(cacheParametersChangeable)).append("\n");
    sb.append("    allowThinManualExpansion: ").append(toIndentedString(allowThinManualExpansion)).append("\n");
    sb.append("    allowThinGrowthParametersChange: ").append(toIndentedString(allowThinGrowthParametersChange)).append("\n");
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

