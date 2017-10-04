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
 * DiskPoolVolumeCandidateData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DiskPoolVolumeCandidateData   {
  
    private Integer reconstructionReservedDriveCount;

    private Long reconstructionReservedAmt;

    private Long unusableCapacity;

  
  /**
   * The number of drives reserved for reconstruction of failed drives.
   **/
  public DiskPoolVolumeCandidateData reconstructionReservedDriveCount(Integer reconstructionReservedDriveCount) {
    this.reconstructionReservedDriveCount = reconstructionReservedDriveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of drives reserved for reconstruction of failed drives.")
  @JsonProperty("reconstructionReservedDriveCount")
  public Integer getReconstructionReservedDriveCount() {
    return reconstructionReservedDriveCount;
  }
  
  public void setReconstructionReservedDriveCount(Integer reconstructionReservedDriveCount) {
    this.reconstructionReservedDriveCount = reconstructionReservedDriveCount;
  }

  
  /**
   * The pool capacity reserved to hold rebuild data (in bytes). This value is calculated from the reconstructionReservedDriveCount.
   **/
  public DiskPoolVolumeCandidateData reconstructionReservedAmt(Long reconstructionReservedAmt) {
    this.reconstructionReservedAmt = reconstructionReservedAmt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The pool capacity reserved to hold rebuild data (in bytes). This value is calculated from the reconstructionReservedDriveCount.")
  @JsonProperty("reconstructionReservedAmt")
  public Long getReconstructionReservedAmt() {
    return reconstructionReservedAmt;
  }
  
  public void setReconstructionReservedAmt(Long reconstructionReservedAmt) {
    this.reconstructionReservedAmt = reconstructionReservedAmt;
  }

  
  /**
   * This value identifies how much capacity (in bytes) is being wasted due to a mix of drive sizes. This value will be zero as long as the pool consists of like drive sizes.
   **/
  public DiskPoolVolumeCandidateData unusableCapacity(Long unusableCapacity) {
    this.unusableCapacity = unusableCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value identifies how much capacity (in bytes) is being wasted due to a mix of drive sizes. This value will be zero as long as the pool consists of like drive sizes.")
  @JsonProperty("unusableCapacity")
  public Long getUnusableCapacity() {
    return unusableCapacity;
  }
  
  public void setUnusableCapacity(Long unusableCapacity) {
    this.unusableCapacity = unusableCapacity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskPoolVolumeCandidateData diskPoolVolumeCandidateData = (DiskPoolVolumeCandidateData) o;
    return Objects.equals(this.reconstructionReservedDriveCount, diskPoolVolumeCandidateData.reconstructionReservedDriveCount) &&
        Objects.equals(this.reconstructionReservedAmt, diskPoolVolumeCandidateData.reconstructionReservedAmt) &&
        Objects.equals(this.unusableCapacity, diskPoolVolumeCandidateData.unusableCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reconstructionReservedDriveCount, reconstructionReservedAmt, unusableCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskPoolVolumeCandidateData {\n");
    
    sb.append("    reconstructionReservedDriveCount: ").append(toIndentedString(reconstructionReservedDriveCount)).append("\n");
    sb.append("    reconstructionReservedAmt: ").append(toIndentedString(reconstructionReservedAmt)).append("\n");
    sb.append("    unusableCapacity: ").append(toIndentedString(unusableCapacity)).append("\n");
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

