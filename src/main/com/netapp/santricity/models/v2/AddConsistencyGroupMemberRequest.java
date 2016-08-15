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
 * Add consistency group member volume
 */
@ApiModel(description = "Add consistency group member volume")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class AddConsistencyGroupMemberRequest   {
  
    private String volumeId;

    private String repositoryPoolId;

    private Boolean scanMedia;

    private Boolean validateParity;

    private Double repositoryPercent;

    private ConcatVolumeCandidate repositoryCandidate;

  
  /**
   * The member volume ref
   **/
  public AddConsistencyGroupMemberRequest volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The member volume ref")
  @JsonProperty("volumeId")
  public String getVolumeId() {
    return volumeId;
  }
  
  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  
  /**
   * The repository volume pool
   **/
  public AddConsistencyGroupMemberRequest repositoryPoolId(String repositoryPoolId) {
    this.repositoryPoolId = repositoryPoolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The repository volume pool")
  @JsonProperty("repositoryPoolId")
  public String getRepositoryPoolId() {
    return repositoryPoolId;
  }
  
  public void setRepositoryPoolId(String repositoryPoolId) {
    this.repositoryPoolId = repositoryPoolId;
  }

  
  /**
   **/
  public AddConsistencyGroupMemberRequest scanMedia(Boolean scanMedia) {
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
  public AddConsistencyGroupMemberRequest validateParity(Boolean validateParity) {
    this.validateParity = validateParity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("validateParity")
  public Boolean getValidateParity() {
    return validateParity;
  }
  
  public void setValidateParity(Boolean validateParity) {
    this.validateParity = validateParity;
  }

  
  /**
   **/
  public AddConsistencyGroupMemberRequest repositoryPercent(Double repositoryPercent) {
    this.repositoryPercent = repositoryPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("repositoryPercent")
  public Double getRepositoryPercent() {
    return repositoryPercent;
  }
  
  public void setRepositoryPercent(Double repositoryPercent) {
    this.repositoryPercent = repositoryPercent;
  }

  
  /**
   **/
  public AddConsistencyGroupMemberRequest repositoryCandidate(ConcatVolumeCandidate repositoryCandidate) {
    this.repositoryCandidate = repositoryCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("repositoryCandidate")
  public ConcatVolumeCandidate getRepositoryCandidate() {
    return repositoryCandidate;
  }
  
  public void setRepositoryCandidate(ConcatVolumeCandidate repositoryCandidate) {
    this.repositoryCandidate = repositoryCandidate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddConsistencyGroupMemberRequest addConsistencyGroupMemberRequest = (AddConsistencyGroupMemberRequest) o;
    return Objects.equals(this.volumeId, addConsistencyGroupMemberRequest.volumeId) &&
        Objects.equals(this.repositoryPoolId, addConsistencyGroupMemberRequest.repositoryPoolId) &&
        Objects.equals(this.scanMedia, addConsistencyGroupMemberRequest.scanMedia) &&
        Objects.equals(this.validateParity, addConsistencyGroupMemberRequest.validateParity) &&
        Objects.equals(this.repositoryPercent, addConsistencyGroupMemberRequest.repositoryPercent) &&
        Objects.equals(this.repositoryCandidate, addConsistencyGroupMemberRequest.repositoryCandidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeId, repositoryPoolId, scanMedia, validateParity, repositoryPercent, repositoryCandidate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddConsistencyGroupMemberRequest {\n");
    
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    repositoryPoolId: ").append(toIndentedString(repositoryPoolId)).append("\n");
    sb.append("    scanMedia: ").append(toIndentedString(scanMedia)).append("\n");
    sb.append("    validateParity: ").append(toIndentedString(validateParity)).append("\n");
    sb.append("    repositoryPercent: ").append(toIndentedString(repositoryPercent)).append("\n");
    sb.append("    repositoryCandidate: ").append(toIndentedString(repositoryCandidate)).append("\n");
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

