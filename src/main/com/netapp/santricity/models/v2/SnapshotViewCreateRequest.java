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
 * Creates a Snapshot (PiT) View.
 */
@ApiModel(description = "Creates a Snapshot (PiT) View.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class SnapshotViewCreateRequest   {
  
    private String snapshotImageId;

    private Integer fullThreshold;

    private String name;


  /**
   * The snapshot volume access mode.
   */
  public enum ViewModeEnum {
    modeUnknown("modeUnknown"),
    readWrite("readWrite"),
    readOnly("readOnly"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ViewModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ViewModeEnum viewMode;

    private Double repositoryPercentage;

    private String repositoryPoolId;

    private ConcatVolumeCandidate repositoryCandidate;

  
  /**
   * The identifier of the snapshot image used to create the new snapshot volume.
   **/
  public SnapshotViewCreateRequest snapshotImageId(String snapshotImageId) {
    this.snapshotImageId = snapshotImageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the snapshot image used to create the new snapshot volume.")
  @JsonProperty("snapshotImageId")
  public String getSnapshotImageId() {
    return snapshotImageId;
  }
  
  public void setSnapshotImageId(String snapshotImageId) {
    this.snapshotImageId = snapshotImageId;
  }

  
  /**
   * The repository utilization warning threshold percentage.
   **/
  public SnapshotViewCreateRequest fullThreshold(Integer fullThreshold) {
    this.fullThreshold = fullThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The repository utilization warning threshold percentage.")
  @JsonProperty("fullThreshold")
  public Integer getFullThreshold() {
    return fullThreshold;
  }
  
  public void setFullThreshold(Integer fullThreshold) {
    this.fullThreshold = fullThreshold;
  }

  
  /**
   * The name of the new snapshot volume.
   **/
  public SnapshotViewCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the new snapshot volume.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The snapshot volume access mode.
   **/
  public SnapshotViewCreateRequest viewMode(ViewModeEnum viewMode) {
    this.viewMode = viewMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The snapshot volume access mode.")
  @JsonProperty("viewMode")
  public ViewModeEnum getViewMode() {
    return viewMode;
  }
  
  public void setViewMode(ViewModeEnum viewMode) {
    this.viewMode = viewMode;
  }

  
  /**
   * The size of the view in relation to the size of the base volume.
   **/
  public SnapshotViewCreateRequest repositoryPercentage(Double repositoryPercentage) {
    this.repositoryPercentage = repositoryPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The size of the view in relation to the size of the base volume.")
  @JsonProperty("repositoryPercentage")
  public Double getRepositoryPercentage() {
    return repositoryPercentage;
  }
  
  public void setRepositoryPercentage(Double repositoryPercentage) {
    this.repositoryPercentage = repositoryPercentage;
  }

  
  /**
   * The identifier  of the storage pool on which to allocate the repository volume. Ignored if a repositoryCandidate is provided.
   **/
  public SnapshotViewCreateRequest repositoryPoolId(String repositoryPoolId) {
    this.repositoryPoolId = repositoryPoolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier  of the storage pool on which to allocate the repository volume. Ignored if a repositoryCandidate is provided.")
  @JsonProperty("repositoryPoolId")
  public String getRepositoryPoolId() {
    return repositoryPoolId;
  }
  
  public void setRepositoryPoolId(String repositoryPoolId) {
    this.repositoryPoolId = repositoryPoolId;
  }

  
  /**
   * Allows a repository candidate to be manually specified for use in the creation. By default, the best candidate will be selected.
   **/
  public SnapshotViewCreateRequest repositoryCandidate(ConcatVolumeCandidate repositoryCandidate) {
    this.repositoryCandidate = repositoryCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allows a repository candidate to be manually specified for use in the creation. By default, the best candidate will be selected.")
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
    SnapshotViewCreateRequest snapshotViewCreateRequest = (SnapshotViewCreateRequest) o;
    return Objects.equals(this.snapshotImageId, snapshotViewCreateRequest.snapshotImageId) &&
        Objects.equals(this.fullThreshold, snapshotViewCreateRequest.fullThreshold) &&
        Objects.equals(this.name, snapshotViewCreateRequest.name) &&
        Objects.equals(this.viewMode, snapshotViewCreateRequest.viewMode) &&
        Objects.equals(this.repositoryPercentage, snapshotViewCreateRequest.repositoryPercentage) &&
        Objects.equals(this.repositoryPoolId, snapshotViewCreateRequest.repositoryPoolId) &&
        Objects.equals(this.repositoryCandidate, snapshotViewCreateRequest.repositoryCandidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotImageId, fullThreshold, name, viewMode, repositoryPercentage, repositoryPoolId, repositoryCandidate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotViewCreateRequest {\n");
    
    sb.append("    snapshotImageId: ").append(toIndentedString(snapshotImageId)).append("\n");
    sb.append("    fullThreshold: ").append(toIndentedString(fullThreshold)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    viewMode: ").append(toIndentedString(viewMode)).append("\n");
    sb.append("    repositoryPercentage: ").append(toIndentedString(repositoryPercentage)).append("\n");
    sb.append("    repositoryPoolId: ").append(toIndentedString(repositoryPoolId)).append("\n");
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

