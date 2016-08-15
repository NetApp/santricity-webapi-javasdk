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
 * HLVolumeBundle
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class HLVolumeBundle   {
  
    private List<SnapshotVolume> snapshotVol;

    private List<MirrorProxyVolume> mirrorVol;

    private List<MetadataVolume> metadataVol;

    private List<RemoteVolume> remoteVol;

    private List<VolumeCopy> volumeCopy;

    private List<PITGroup> pitGroup;

    private List<PIT> pit;

    private List<PITView> pitView;

    private List<PITConsistencyGroup> pitConsistencyGroup;

    private List<ConcatVolume> concatVolume;

    private List<ConcatVolumeMember> concatVolMember;

    private List<PITConsistencyGroupView> pitConsistencyGroupView;

    private List<ThinVolume> thinVolume;

    private List<AsyncMirrorGroup> asyncMirrorGroup;

    private List<AsyncMirrorGroupMember> asyncMirrorGroupMember;

    private List<AsyncMirrorGroupIncompleteMember> asyncMirrorGroupIncompleteMember;

  
  /**
   * An array of SnapshotVolume objects.
   **/
  public HLVolumeBundle snapshotVol(List<SnapshotVolume> snapshotVol) {
    this.snapshotVol = snapshotVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of SnapshotVolume objects.")
  @JsonProperty("snapshotVol")
  public List<SnapshotVolume> getSnapshotVol() {
    return snapshotVol;
  }
  
  public void setSnapshotVol(List<SnapshotVolume> snapshotVol) {
    this.snapshotVol = snapshotVol;
  }

  
  /**
   * An array of MirrorProxyVolume objects.
   **/
  public HLVolumeBundle mirrorVol(List<MirrorProxyVolume> mirrorVol) {
    this.mirrorVol = mirrorVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of MirrorProxyVolume objects.")
  @JsonProperty("mirrorVol")
  public List<MirrorProxyVolume> getMirrorVol() {
    return mirrorVol;
  }
  
  public void setMirrorVol(List<MirrorProxyVolume> mirrorVol) {
    this.mirrorVol = mirrorVol;
  }

  
  /**
   * An array of MetadataVolume objects.
   **/
  public HLVolumeBundle metadataVol(List<MetadataVolume> metadataVol) {
    this.metadataVol = metadataVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of MetadataVolume objects.")
  @JsonProperty("metadataVol")
  public List<MetadataVolume> getMetadataVol() {
    return metadataVol;
  }
  
  public void setMetadataVol(List<MetadataVolume> metadataVol) {
    this.metadataVol = metadataVol;
  }

  
  /**
   * An array of RemoteVolume objects.
   **/
  public HLVolumeBundle remoteVol(List<RemoteVolume> remoteVol) {
    this.remoteVol = remoteVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of RemoteVolume objects.")
  @JsonProperty("remoteVol")
  public List<RemoteVolume> getRemoteVol() {
    return remoteVol;
  }
  
  public void setRemoteVol(List<RemoteVolume> remoteVol) {
    this.remoteVol = remoteVol;
  }

  
  /**
   * An array of VolumeCopy objects.
   **/
  public HLVolumeBundle volumeCopy(List<VolumeCopy> volumeCopy) {
    this.volumeCopy = volumeCopy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of VolumeCopy objects.")
  @JsonProperty("volumeCopy")
  public List<VolumeCopy> getVolumeCopy() {
    return volumeCopy;
  }
  
  public void setVolumeCopy(List<VolumeCopy> volumeCopy) {
    this.volumeCopy = volumeCopy;
  }

  
  /**
   * An array of PITGroup objects.
   **/
  public HLVolumeBundle pitGroup(List<PITGroup> pitGroup) {
    this.pitGroup = pitGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of PITGroup objects.")
  @JsonProperty("pitGroup")
  public List<PITGroup> getPitGroup() {
    return pitGroup;
  }
  
  public void setPitGroup(List<PITGroup> pitGroup) {
    this.pitGroup = pitGroup;
  }

  
  /**
   * An array of PiT objects.
   **/
  public HLVolumeBundle pit(List<PIT> pit) {
    this.pit = pit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of PiT objects.")
  @JsonProperty("pit")
  public List<PIT> getPit() {
    return pit;
  }
  
  public void setPit(List<PIT> pit) {
    this.pit = pit;
  }

  
  /**
   * An array of PITView objects.
   **/
  public HLVolumeBundle pitView(List<PITView> pitView) {
    this.pitView = pitView;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of PITView objects.")
  @JsonProperty("pitView")
  public List<PITView> getPitView() {
    return pitView;
  }
  
  public void setPitView(List<PITView> pitView) {
    this.pitView = pitView;
  }

  
  /**
   * An array of PITConsistencyGroup objects.
   **/
  public HLVolumeBundle pitConsistencyGroup(List<PITConsistencyGroup> pitConsistencyGroup) {
    this.pitConsistencyGroup = pitConsistencyGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of PITConsistencyGroup objects.")
  @JsonProperty("pitConsistencyGroup")
  public List<PITConsistencyGroup> getPitConsistencyGroup() {
    return pitConsistencyGroup;
  }
  
  public void setPitConsistencyGroup(List<PITConsistencyGroup> pitConsistencyGroup) {
    this.pitConsistencyGroup = pitConsistencyGroup;
  }

  
  /**
   * An array of ConcatVolume objects.
   **/
  public HLVolumeBundle concatVolume(List<ConcatVolume> concatVolume) {
    this.concatVolume = concatVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of ConcatVolume objects.")
  @JsonProperty("concatVolume")
  public List<ConcatVolume> getConcatVolume() {
    return concatVolume;
  }
  
  public void setConcatVolume(List<ConcatVolume> concatVolume) {
    this.concatVolume = concatVolume;
  }

  
  /**
   * An array of ConcatVolumeMember objects.
   **/
  public HLVolumeBundle concatVolMember(List<ConcatVolumeMember> concatVolMember) {
    this.concatVolMember = concatVolMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of ConcatVolumeMember objects.")
  @JsonProperty("concatVolMember")
  public List<ConcatVolumeMember> getConcatVolMember() {
    return concatVolMember;
  }
  
  public void setConcatVolMember(List<ConcatVolumeMember> concatVolMember) {
    this.concatVolMember = concatVolMember;
  }

  
  /**
   * An array of PITConsistencyGroupView objects.
   **/
  public HLVolumeBundle pitConsistencyGroupView(List<PITConsistencyGroupView> pitConsistencyGroupView) {
    this.pitConsistencyGroupView = pitConsistencyGroupView;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of PITConsistencyGroupView objects.")
  @JsonProperty("pitConsistencyGroupView")
  public List<PITConsistencyGroupView> getPitConsistencyGroupView() {
    return pitConsistencyGroupView;
  }
  
  public void setPitConsistencyGroupView(List<PITConsistencyGroupView> pitConsistencyGroupView) {
    this.pitConsistencyGroupView = pitConsistencyGroupView;
  }

  
  /**
   * An array of ThinVolume objects.
   **/
  public HLVolumeBundle thinVolume(List<ThinVolume> thinVolume) {
    this.thinVolume = thinVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of ThinVolume objects.")
  @JsonProperty("thinVolume")
  public List<ThinVolume> getThinVolume() {
    return thinVolume;
  }
  
  public void setThinVolume(List<ThinVolume> thinVolume) {
    this.thinVolume = thinVolume;
  }

  
  /**
   * Async Mirror Groups.
   **/
  public HLVolumeBundle asyncMirrorGroup(List<AsyncMirrorGroup> asyncMirrorGroup) {
    this.asyncMirrorGroup = asyncMirrorGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Async Mirror Groups.")
  @JsonProperty("asyncMirrorGroup")
  public List<AsyncMirrorGroup> getAsyncMirrorGroup() {
    return asyncMirrorGroup;
  }
  
  public void setAsyncMirrorGroup(List<AsyncMirrorGroup> asyncMirrorGroup) {
    this.asyncMirrorGroup = asyncMirrorGroup;
  }

  
  /**
   * Async Mirror Group Members.
   **/
  public HLVolumeBundle asyncMirrorGroupMember(List<AsyncMirrorGroupMember> asyncMirrorGroupMember) {
    this.asyncMirrorGroupMember = asyncMirrorGroupMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Async Mirror Group Members.")
  @JsonProperty("asyncMirrorGroupMember")
  public List<AsyncMirrorGroupMember> getAsyncMirrorGroupMember() {
    return asyncMirrorGroupMember;
  }
  
  public void setAsyncMirrorGroupMember(List<AsyncMirrorGroupMember> asyncMirrorGroupMember) {
    this.asyncMirrorGroupMember = asyncMirrorGroupMember;
  }

  
  /**
   * \"Incomplete\" Async Mirror Group Members.
   **/
  public HLVolumeBundle asyncMirrorGroupIncompleteMember(List<AsyncMirrorGroupIncompleteMember> asyncMirrorGroupIncompleteMember) {
    this.asyncMirrorGroupIncompleteMember = asyncMirrorGroupIncompleteMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "\"Incomplete\" Async Mirror Group Members.")
  @JsonProperty("asyncMirrorGroupIncompleteMember")
  public List<AsyncMirrorGroupIncompleteMember> getAsyncMirrorGroupIncompleteMember() {
    return asyncMirrorGroupIncompleteMember;
  }
  
  public void setAsyncMirrorGroupIncompleteMember(List<AsyncMirrorGroupIncompleteMember> asyncMirrorGroupIncompleteMember) {
    this.asyncMirrorGroupIncompleteMember = asyncMirrorGroupIncompleteMember;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HLVolumeBundle hLVolumeBundle = (HLVolumeBundle) o;
    return Objects.equals(this.snapshotVol, hLVolumeBundle.snapshotVol) &&
        Objects.equals(this.mirrorVol, hLVolumeBundle.mirrorVol) &&
        Objects.equals(this.metadataVol, hLVolumeBundle.metadataVol) &&
        Objects.equals(this.remoteVol, hLVolumeBundle.remoteVol) &&
        Objects.equals(this.volumeCopy, hLVolumeBundle.volumeCopy) &&
        Objects.equals(this.pitGroup, hLVolumeBundle.pitGroup) &&
        Objects.equals(this.pit, hLVolumeBundle.pit) &&
        Objects.equals(this.pitView, hLVolumeBundle.pitView) &&
        Objects.equals(this.pitConsistencyGroup, hLVolumeBundle.pitConsistencyGroup) &&
        Objects.equals(this.concatVolume, hLVolumeBundle.concatVolume) &&
        Objects.equals(this.concatVolMember, hLVolumeBundle.concatVolMember) &&
        Objects.equals(this.pitConsistencyGroupView, hLVolumeBundle.pitConsistencyGroupView) &&
        Objects.equals(this.thinVolume, hLVolumeBundle.thinVolume) &&
        Objects.equals(this.asyncMirrorGroup, hLVolumeBundle.asyncMirrorGroup) &&
        Objects.equals(this.asyncMirrorGroupMember, hLVolumeBundle.asyncMirrorGroupMember) &&
        Objects.equals(this.asyncMirrorGroupIncompleteMember, hLVolumeBundle.asyncMirrorGroupIncompleteMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotVol, mirrorVol, metadataVol, remoteVol, volumeCopy, pitGroup, pit, pitView, pitConsistencyGroup, concatVolume, concatVolMember, pitConsistencyGroupView, thinVolume, asyncMirrorGroup, asyncMirrorGroupMember, asyncMirrorGroupIncompleteMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HLVolumeBundle {\n");
    
    sb.append("    snapshotVol: ").append(toIndentedString(snapshotVol)).append("\n");
    sb.append("    mirrorVol: ").append(toIndentedString(mirrorVol)).append("\n");
    sb.append("    metadataVol: ").append(toIndentedString(metadataVol)).append("\n");
    sb.append("    remoteVol: ").append(toIndentedString(remoteVol)).append("\n");
    sb.append("    volumeCopy: ").append(toIndentedString(volumeCopy)).append("\n");
    sb.append("    pitGroup: ").append(toIndentedString(pitGroup)).append("\n");
    sb.append("    pit: ").append(toIndentedString(pit)).append("\n");
    sb.append("    pitView: ").append(toIndentedString(pitView)).append("\n");
    sb.append("    pitConsistencyGroup: ").append(toIndentedString(pitConsistencyGroup)).append("\n");
    sb.append("    concatVolume: ").append(toIndentedString(concatVolume)).append("\n");
    sb.append("    concatVolMember: ").append(toIndentedString(concatVolMember)).append("\n");
    sb.append("    pitConsistencyGroupView: ").append(toIndentedString(pitConsistencyGroupView)).append("\n");
    sb.append("    thinVolume: ").append(toIndentedString(thinVolume)).append("\n");
    sb.append("    asyncMirrorGroup: ").append(toIndentedString(asyncMirrorGroup)).append("\n");
    sb.append("    asyncMirrorGroupMember: ").append(toIndentedString(asyncMirrorGroupMember)).append("\n");
    sb.append("    asyncMirrorGroupIncompleteMember: ").append(toIndentedString(asyncMirrorGroupIncompleteMember)).append("\n");
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

