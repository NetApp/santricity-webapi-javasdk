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
 * AsyncMirrorGroupMemberCreateRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AsyncMirrorGroupMemberCreateRequest   {
  
    private String primaryPoolId;

    private String secondaryPoolId;

    private String primaryVolumeRef;

    private String secondaryVolumeRef;

    private ConcatVolumeCandidate primaryRepositoryCandidate;

    private ConcatVolumeCandidate secondaryRepositoryCandidate;

    private Boolean scanMedia;

    private Boolean validateRepositoryParity;

    private Double percentCapacity;

    private Double secondaryPercentCapacity;

  
  /**
   * Storage pool on the source StorageSystem to create the mirrored pair repository volume on. This defaults to the pool that the primaryVolume belongs to.
   **/
  public AsyncMirrorGroupMemberCreateRequest primaryPoolId(String primaryPoolId) {
    this.primaryPoolId = primaryPoolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Storage pool on the source StorageSystem to create the mirrored pair repository volume on. This defaults to the pool that the primaryVolume belongs to.")
  @JsonProperty("primaryPoolId")
  public String getPrimaryPoolId() {
    return primaryPoolId;
  }
  
  public void setPrimaryPoolId(String primaryPoolId) {
    this.primaryPoolId = primaryPoolId;
  }

  
  /**
   * Storage pool on the target StorageSystem to create the mirrored pair repository volume on. This defaults to the pool that the secondaryVolume belongs to.
   **/
  public AsyncMirrorGroupMemberCreateRequest secondaryPoolId(String secondaryPoolId) {
    this.secondaryPoolId = secondaryPoolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Storage pool on the target StorageSystem to create the mirrored pair repository volume on. This defaults to the pool that the secondaryVolume belongs to.")
  @JsonProperty("secondaryPoolId")
  public String getSecondaryPoolId() {
    return secondaryPoolId;
  }
  
  public void setSecondaryPoolId(String secondaryPoolId) {
    this.secondaryPoolId = secondaryPoolId;
  }

  
  /**
   **/
  public AsyncMirrorGroupMemberCreateRequest primaryVolumeRef(String primaryVolumeRef) {
    this.primaryVolumeRef = primaryVolumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("primaryVolumeRef")
  public String getPrimaryVolumeRef() {
    return primaryVolumeRef;
  }
  
  public void setPrimaryVolumeRef(String primaryVolumeRef) {
    this.primaryVolumeRef = primaryVolumeRef;
  }

  
  /**
   **/
  public AsyncMirrorGroupMemberCreateRequest secondaryVolumeRef(String secondaryVolumeRef) {
    this.secondaryVolumeRef = secondaryVolumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("secondaryVolumeRef")
  public String getSecondaryVolumeRef() {
    return secondaryVolumeRef;
  }
  
  public void setSecondaryVolumeRef(String secondaryVolumeRef) {
    this.secondaryVolumeRef = secondaryVolumeRef;
  }

  
  /**
   * Allows a repository candidate to be manually specified for use in the creation. By default, the best candidate will be selected.
   **/
  public AsyncMirrorGroupMemberCreateRequest primaryRepositoryCandidate(ConcatVolumeCandidate primaryRepositoryCandidate) {
    this.primaryRepositoryCandidate = primaryRepositoryCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allows a repository candidate to be manually specified for use in the creation. By default, the best candidate will be selected.")
  @JsonProperty("primaryRepositoryCandidate")
  public ConcatVolumeCandidate getPrimaryRepositoryCandidate() {
    return primaryRepositoryCandidate;
  }
  
  public void setPrimaryRepositoryCandidate(ConcatVolumeCandidate primaryRepositoryCandidate) {
    this.primaryRepositoryCandidate = primaryRepositoryCandidate;
  }

  
  /**
   * Allows a repository candidate to be manually specified for use in the creation. By default, the best candidate will be selected.
   **/
  public AsyncMirrorGroupMemberCreateRequest secondaryRepositoryCandidate(ConcatVolumeCandidate secondaryRepositoryCandidate) {
    this.secondaryRepositoryCandidate = secondaryRepositoryCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allows a repository candidate to be manually specified for use in the creation. By default, the best candidate will be selected.")
  @JsonProperty("secondaryRepositoryCandidate")
  public ConcatVolumeCandidate getSecondaryRepositoryCandidate() {
    return secondaryRepositoryCandidate;
  }
  
  public void setSecondaryRepositoryCandidate(ConcatVolumeCandidate secondaryRepositoryCandidate) {
    this.secondaryRepositoryCandidate = secondaryRepositoryCandidate;
  }

  
  /**
   **/
  public AsyncMirrorGroupMemberCreateRequest scanMedia(Boolean scanMedia) {
    this.scanMedia = scanMedia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scanMedia")
  public Boolean getScanMedia() {
    return scanMedia;
  }
  
  public void setScanMedia(Boolean scanMedia) {
    this.scanMedia = scanMedia;
  }

  
  /**
   **/
  public AsyncMirrorGroupMemberCreateRequest validateRepositoryParity(Boolean validateRepositoryParity) {
    this.validateRepositoryParity = validateRepositoryParity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("validateRepositoryParity")
  public Boolean getValidateRepositoryParity() {
    return validateRepositoryParity;
  }
  
  public void setValidateRepositoryParity(Boolean validateRepositoryParity) {
    this.validateRepositoryParity = validateRepositoryParity;
  }

  
  /**
   * Percentage of the capacity of the primary volume to use for the repository capacity.
   **/
  public AsyncMirrorGroupMemberCreateRequest percentCapacity(Double percentCapacity) {
    this.percentCapacity = percentCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of the capacity of the primary volume to use for the repository capacity.")
  @JsonProperty("percentCapacity")
  public Double getPercentCapacity() {
    return percentCapacity;
  }
  
  public void setPercentCapacity(Double percentCapacity) {
    this.percentCapacity = percentCapacity;
  }

  
  /**
   * Percentage of the capacity of the secondary volume to use for the repository capacity. Defaults to percentCapacity.
   **/
  public AsyncMirrorGroupMemberCreateRequest secondaryPercentCapacity(Double secondaryPercentCapacity) {
    this.secondaryPercentCapacity = secondaryPercentCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of the capacity of the secondary volume to use for the repository capacity. Defaults to percentCapacity.")
  @JsonProperty("secondaryPercentCapacity")
  public Double getSecondaryPercentCapacity() {
    return secondaryPercentCapacity;
  }
  
  public void setSecondaryPercentCapacity(Double secondaryPercentCapacity) {
    this.secondaryPercentCapacity = secondaryPercentCapacity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupMemberCreateRequest asyncMirrorGroupMemberCreateRequest = (AsyncMirrorGroupMemberCreateRequest) o;
    return Objects.equals(this.primaryPoolId, asyncMirrorGroupMemberCreateRequest.primaryPoolId) &&
        Objects.equals(this.secondaryPoolId, asyncMirrorGroupMemberCreateRequest.secondaryPoolId) &&
        Objects.equals(this.primaryVolumeRef, asyncMirrorGroupMemberCreateRequest.primaryVolumeRef) &&
        Objects.equals(this.secondaryVolumeRef, asyncMirrorGroupMemberCreateRequest.secondaryVolumeRef) &&
        Objects.equals(this.primaryRepositoryCandidate, asyncMirrorGroupMemberCreateRequest.primaryRepositoryCandidate) &&
        Objects.equals(this.secondaryRepositoryCandidate, asyncMirrorGroupMemberCreateRequest.secondaryRepositoryCandidate) &&
        Objects.equals(this.scanMedia, asyncMirrorGroupMemberCreateRequest.scanMedia) &&
        Objects.equals(this.validateRepositoryParity, asyncMirrorGroupMemberCreateRequest.validateRepositoryParity) &&
        Objects.equals(this.percentCapacity, asyncMirrorGroupMemberCreateRequest.percentCapacity) &&
        Objects.equals(this.secondaryPercentCapacity, asyncMirrorGroupMemberCreateRequest.secondaryPercentCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryPoolId, secondaryPoolId, primaryVolumeRef, secondaryVolumeRef, primaryRepositoryCandidate, secondaryRepositoryCandidate, scanMedia, validateRepositoryParity, percentCapacity, secondaryPercentCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupMemberCreateRequest {\n");
    
    sb.append("    primaryPoolId: ").append(toIndentedString(primaryPoolId)).append("\n");
    sb.append("    secondaryPoolId: ").append(toIndentedString(secondaryPoolId)).append("\n");
    sb.append("    primaryVolumeRef: ").append(toIndentedString(primaryVolumeRef)).append("\n");
    sb.append("    secondaryVolumeRef: ").append(toIndentedString(secondaryVolumeRef)).append("\n");
    sb.append("    primaryRepositoryCandidate: ").append(toIndentedString(primaryRepositoryCandidate)).append("\n");
    sb.append("    secondaryRepositoryCandidate: ").append(toIndentedString(secondaryRepositoryCandidate)).append("\n");
    sb.append("    scanMedia: ").append(toIndentedString(scanMedia)).append("\n");
    sb.append("    validateRepositoryParity: ").append(toIndentedString(validateRepositoryParity)).append("\n");
    sb.append("    percentCapacity: ").append(toIndentedString(percentCapacity)).append("\n");
    sb.append("    secondaryPercentCapacity: ").append(toIndentedString(secondaryPercentCapacity)).append("\n");
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

