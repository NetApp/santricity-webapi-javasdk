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
 * CreateConsistencyGroupSnapshotViewRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class CreateConsistencyGroupSnapshotViewRequest   {
  
    private String name;

    private String repositoryPoolId;

    private String pitId;

    private Long pitSequenceNumber;


  /**
   * The access mode determines whether or not a repository volume should be created.
   */
  public enum AccessModeEnum {
    modeUnknown("modeUnknown"),
    readWrite("readWrite"),
    readOnly("readOnly"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    AccessModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AccessModeEnum accessMode;

    private Double repositoryPercent;

    private Boolean scanMedia;

    private Boolean validateParity;

  
  /**
   **/
  public CreateConsistencyGroupSnapshotViewRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The reference to the pool that will be used for the repository creation.
   **/
  public CreateConsistencyGroupSnapshotViewRequest repositoryPoolId(String repositoryPoolId) {
    this.repositoryPoolId = repositoryPoolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference to the pool that will be used for the repository creation.")
  @JsonProperty("repositoryPoolId")
  public String getRepositoryPoolId() {
    return repositoryPoolId;
  }
  
  public void setRepositoryPoolId(String repositoryPoolId) {
    this.repositoryPoolId = repositoryPoolId;
  }

  
  /**
   * The id of the PIT to create a View for. Either the pitSequenceNumber or a pitId is required.
   **/
  public CreateConsistencyGroupSnapshotViewRequest pitId(String pitId) {
    this.pitId = pitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the PIT to create a View for. Either the pitSequenceNumber or a pitId is required.")
  @JsonProperty("pitId")
  public String getPitId() {
    return pitId;
  }
  
  public void setPitId(String pitId) {
    this.pitId = pitId;
  }

  
  /**
   * The sequence number of the PITs to create Views for. Either the pitSequenceNumber or a pitId is required.
   **/
  public CreateConsistencyGroupSnapshotViewRequest pitSequenceNumber(Long pitSequenceNumber) {
    this.pitSequenceNumber = pitSequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sequence number of the PITs to create Views for. Either the pitSequenceNumber or a pitId is required.")
  @JsonProperty("pitSequenceNumber")
  public Long getPitSequenceNumber() {
    return pitSequenceNumber;
  }
  
  public void setPitSequenceNumber(Long pitSequenceNumber) {
    this.pitSequenceNumber = pitSequenceNumber;
  }

  
  /**
   * The access mode determines whether or not a repository volume should be created.
   **/
  public CreateConsistencyGroupSnapshotViewRequest accessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The access mode determines whether or not a repository volume should be created.")
  @JsonProperty("accessMode")
  public AccessModeEnum getAccessMode() {
    return accessMode;
  }
  
  public void setAccessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
  }

  
  /**
   **/
  public CreateConsistencyGroupSnapshotViewRequest repositoryPercent(Double repositoryPercent) {
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
  public CreateConsistencyGroupSnapshotViewRequest scanMedia(Boolean scanMedia) {
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
  public CreateConsistencyGroupSnapshotViewRequest validateParity(Boolean validateParity) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConsistencyGroupSnapshotViewRequest createConsistencyGroupSnapshotViewRequest = (CreateConsistencyGroupSnapshotViewRequest) o;
    return Objects.equals(this.name, createConsistencyGroupSnapshotViewRequest.name) &&
        Objects.equals(this.repositoryPoolId, createConsistencyGroupSnapshotViewRequest.repositoryPoolId) &&
        Objects.equals(this.pitId, createConsistencyGroupSnapshotViewRequest.pitId) &&
        Objects.equals(this.pitSequenceNumber, createConsistencyGroupSnapshotViewRequest.pitSequenceNumber) &&
        Objects.equals(this.accessMode, createConsistencyGroupSnapshotViewRequest.accessMode) &&
        Objects.equals(this.repositoryPercent, createConsistencyGroupSnapshotViewRequest.repositoryPercent) &&
        Objects.equals(this.scanMedia, createConsistencyGroupSnapshotViewRequest.scanMedia) &&
        Objects.equals(this.validateParity, createConsistencyGroupSnapshotViewRequest.validateParity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, repositoryPoolId, pitId, pitSequenceNumber, accessMode, repositoryPercent, scanMedia, validateParity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConsistencyGroupSnapshotViewRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repositoryPoolId: ").append(toIndentedString(repositoryPoolId)).append("\n");
    sb.append("    pitId: ").append(toIndentedString(pitId)).append("\n");
    sb.append("    pitSequenceNumber: ").append(toIndentedString(pitSequenceNumber)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    repositoryPercent: ").append(toIndentedString(repositoryPercent)).append("\n");
    sb.append("    scanMedia: ").append(toIndentedString(scanMedia)).append("\n");
    sb.append("    validateParity: ").append(toIndentedString(validateParity)).append("\n");
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

