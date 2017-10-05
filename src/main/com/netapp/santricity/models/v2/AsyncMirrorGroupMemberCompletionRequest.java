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
 * AsyncMirrorGroupMemberCompletionRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AsyncMirrorGroupMemberCompletionRequest   {
  
    private String secondaryPoolId;

    private String secondaryVolumeRef;

    private Boolean scanMedia;

    private Boolean validateRepositoryParity;

    private Double secondaryPercentCapacity;

    private ConcatVolumeCandidate secondaryRepositoryCandidate;

  
  /**
   * Storage pool on the target StorageSystem to create the mirrored pair repository volume on. This defaults to the pool that the secondaryVolume belongs to.
   **/
  public AsyncMirrorGroupMemberCompletionRequest secondaryPoolId(String secondaryPoolId) {
    this.secondaryPoolId = secondaryPoolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Storage pool on the target StorageSystem to create the mirrored pair repository volume on. This defaults to the pool that the secondaryVolume belongs to.")
  @JsonProperty("secondaryPoolId")
  public String getSecondaryPoolId() {
    return secondaryPoolId;
  }
  
  public void setSecondaryPoolId(String secondaryPoolId) {
    this.secondaryPoolId = secondaryPoolId;
  }

  
  /**
   **/
  public AsyncMirrorGroupMemberCompletionRequest secondaryVolumeRef(String secondaryVolumeRef) {
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
   **/
  public AsyncMirrorGroupMemberCompletionRequest scanMedia(Boolean scanMedia) {
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
  public AsyncMirrorGroupMemberCompletionRequest validateRepositoryParity(Boolean validateRepositoryParity) {
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
   * Percentage of the capacity of the secondary volume to use for the repository capacity.
   **/
  public AsyncMirrorGroupMemberCompletionRequest secondaryPercentCapacity(Double secondaryPercentCapacity) {
    this.secondaryPercentCapacity = secondaryPercentCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of the capacity of the secondary volume to use for the repository capacity.")
  @JsonProperty("secondaryPercentCapacity")
  public Double getSecondaryPercentCapacity() {
    return secondaryPercentCapacity;
  }
  
  public void setSecondaryPercentCapacity(Double secondaryPercentCapacity) {
    this.secondaryPercentCapacity = secondaryPercentCapacity;
  }

  
  /**
   * Allows a repository candidate to be manually specified for use in the creation. By default, the best candidate will be selected.
   **/
  public AsyncMirrorGroupMemberCompletionRequest secondaryRepositoryCandidate(ConcatVolumeCandidate secondaryRepositoryCandidate) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupMemberCompletionRequest asyncMirrorGroupMemberCompletionRequest = (AsyncMirrorGroupMemberCompletionRequest) o;
    return Objects.equals(this.secondaryPoolId, asyncMirrorGroupMemberCompletionRequest.secondaryPoolId) &&
        Objects.equals(this.secondaryVolumeRef, asyncMirrorGroupMemberCompletionRequest.secondaryVolumeRef) &&
        Objects.equals(this.scanMedia, asyncMirrorGroupMemberCompletionRequest.scanMedia) &&
        Objects.equals(this.validateRepositoryParity, asyncMirrorGroupMemberCompletionRequest.validateRepositoryParity) &&
        Objects.equals(this.secondaryPercentCapacity, asyncMirrorGroupMemberCompletionRequest.secondaryPercentCapacity) &&
        Objects.equals(this.secondaryRepositoryCandidate, asyncMirrorGroupMemberCompletionRequest.secondaryRepositoryCandidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secondaryPoolId, secondaryVolumeRef, scanMedia, validateRepositoryParity, secondaryPercentCapacity, secondaryRepositoryCandidate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupMemberCompletionRequest {\n");
    
    sb.append("    secondaryPoolId: ").append(toIndentedString(secondaryPoolId)).append("\n");
    sb.append("    secondaryVolumeRef: ").append(toIndentedString(secondaryVolumeRef)).append("\n");
    sb.append("    scanMedia: ").append(toIndentedString(scanMedia)).append("\n");
    sb.append("    validateRepositoryParity: ").append(toIndentedString(validateRepositoryParity)).append("\n");
    sb.append("    secondaryPercentCapacity: ").append(toIndentedString(secondaryPercentCapacity)).append("\n");
    sb.append("    secondaryRepositoryCandidate: ").append(toIndentedString(secondaryRepositoryCandidate)).append("\n");
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

