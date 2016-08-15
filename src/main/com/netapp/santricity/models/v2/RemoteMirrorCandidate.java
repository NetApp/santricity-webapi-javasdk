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
 * RemoteMirrorCandidate
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class RemoteMirrorCandidate   {
  
    private VolumeEx sourceVolume;

    private List<VolumeEx> targetVolumes;

    private String targetArrayName;

    private String targetArrayId;

  
  /**
   **/
  public RemoteMirrorCandidate sourceVolume(VolumeEx sourceVolume) {
    this.sourceVolume = sourceVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceVolume")
  public VolumeEx getSourceVolume() {
    return sourceVolume;
  }
  
  public void setSourceVolume(VolumeEx sourceVolume) {
    this.sourceVolume = sourceVolume;
  }

  
  /**
   **/
  public RemoteMirrorCandidate targetVolumes(List<VolumeEx> targetVolumes) {
    this.targetVolumes = targetVolumes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("targetVolumes")
  public List<VolumeEx> getTargetVolumes() {
    return targetVolumes;
  }
  
  public void setTargetVolumes(List<VolumeEx> targetVolumes) {
    this.targetVolumes = targetVolumes;
  }

  
  /**
   **/
  public RemoteMirrorCandidate targetArrayName(String targetArrayName) {
    this.targetArrayName = targetArrayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("targetArrayName")
  public String getTargetArrayName() {
    return targetArrayName;
  }
  
  public void setTargetArrayName(String targetArrayName) {
    this.targetArrayName = targetArrayName;
  }

  
  /**
   **/
  public RemoteMirrorCandidate targetArrayId(String targetArrayId) {
    this.targetArrayId = targetArrayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("targetArrayId")
  public String getTargetArrayId() {
    return targetArrayId;
  }
  
  public void setTargetArrayId(String targetArrayId) {
    this.targetArrayId = targetArrayId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteMirrorCandidate remoteMirrorCandidate = (RemoteMirrorCandidate) o;
    return Objects.equals(this.sourceVolume, remoteMirrorCandidate.sourceVolume) &&
        Objects.equals(this.targetVolumes, remoteMirrorCandidate.targetVolumes) &&
        Objects.equals(this.targetArrayName, remoteMirrorCandidate.targetArrayName) &&
        Objects.equals(this.targetArrayId, remoteMirrorCandidate.targetArrayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceVolume, targetVolumes, targetArrayName, targetArrayId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteMirrorCandidate {\n");
    
    sb.append("    sourceVolume: ").append(toIndentedString(sourceVolume)).append("\n");
    sb.append("    targetVolumes: ").append(toIndentedString(targetVolumes)).append("\n");
    sb.append("    targetArrayName: ").append(toIndentedString(targetArrayName)).append("\n");
    sb.append("    targetArrayId: ").append(toIndentedString(targetArrayId)).append("\n");
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

