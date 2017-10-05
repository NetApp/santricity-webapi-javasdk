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
 * VolumeGroupOperation
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumeGroupOperation   {
  
    private String volumeGroupRef;

    private Integer groupPercentComplete;

    private Integer groupTimeToCompletion;

    private String volumeRef;

    private Integer volumePercentComplete;

    private Integer volumeTimeToCompletion;

  
  /**
   * Reference to the volume group.
   **/
  public VolumeGroupOperation volumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to the volume group.")
  @JsonProperty("volumeGroupRef")
  public String getVolumeGroupRef() {
    return volumeGroupRef;
  }
  
  public void setVolumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
  }

  
  /**
   * Completion percentage for volume group. If the operation is not currently running this value will be equal to PERCENT_COMPLETE_OP_NOT_RUNNING.
   **/
  public VolumeGroupOperation groupPercentComplete(Integer groupPercentComplete) {
    this.groupPercentComplete = groupPercentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Completion percentage for volume group. If the operation is not currently running this value will be equal to PERCENT_COMPLETE_OP_NOT_RUNNING.")
  @JsonProperty("groupPercentComplete")
  public Integer getGroupPercentComplete() {
    return groupPercentComplete;
  }
  
  public void setGroupPercentComplete(Integer groupPercentComplete) {
    this.groupPercentComplete = groupPercentComplete;
  }

  
  /**
   * Estimated time in minutes to complete the volume group. If the time is not known this value will be equal to TIME_TO_COMPLETION_UNKNOWN.
   **/
  public VolumeGroupOperation groupTimeToCompletion(Integer groupTimeToCompletion) {
    this.groupTimeToCompletion = groupTimeToCompletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Estimated time in minutes to complete the volume group. If the time is not known this value will be equal to TIME_TO_COMPLETION_UNKNOWN.")
  @JsonProperty("groupTimeToCompletion")
  public Integer getGroupTimeToCompletion() {
    return groupTimeToCompletion;
  }
  
  public void setGroupTimeToCompletion(Integer groupTimeToCompletion) {
    this.groupTimeToCompletion = groupTimeToCompletion;
  }

  
  /**
   * Reference to the volume currently being processed.
   **/
  public VolumeGroupOperation volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to the volume currently being processed.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * Completion percentage for volume currently being processed. If the operation is not currently running this value will be equal to PERCENT_COMPLETE_OP_NOT_RUNNING.
   **/
  public VolumeGroupOperation volumePercentComplete(Integer volumePercentComplete) {
    this.volumePercentComplete = volumePercentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Completion percentage for volume currently being processed. If the operation is not currently running this value will be equal to PERCENT_COMPLETE_OP_NOT_RUNNING.")
  @JsonProperty("volumePercentComplete")
  public Integer getVolumePercentComplete() {
    return volumePercentComplete;
  }
  
  public void setVolumePercentComplete(Integer volumePercentComplete) {
    this.volumePercentComplete = volumePercentComplete;
  }

  
  /**
   * Estimated time in minutes to complete the volume currently being processed. If the time is not known this value will be equal to TIME_TO_COMPLETION_UNKNOWN.
   **/
  public VolumeGroupOperation volumeTimeToCompletion(Integer volumeTimeToCompletion) {
    this.volumeTimeToCompletion = volumeTimeToCompletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Estimated time in minutes to complete the volume currently being processed. If the time is not known this value will be equal to TIME_TO_COMPLETION_UNKNOWN.")
  @JsonProperty("volumeTimeToCompletion")
  public Integer getVolumeTimeToCompletion() {
    return volumeTimeToCompletion;
  }
  
  public void setVolumeTimeToCompletion(Integer volumeTimeToCompletion) {
    this.volumeTimeToCompletion = volumeTimeToCompletion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeGroupOperation volumeGroupOperation = (VolumeGroupOperation) o;
    return Objects.equals(this.volumeGroupRef, volumeGroupOperation.volumeGroupRef) &&
        Objects.equals(this.groupPercentComplete, volumeGroupOperation.groupPercentComplete) &&
        Objects.equals(this.groupTimeToCompletion, volumeGroupOperation.groupTimeToCompletion) &&
        Objects.equals(this.volumeRef, volumeGroupOperation.volumeRef) &&
        Objects.equals(this.volumePercentComplete, volumeGroupOperation.volumePercentComplete) &&
        Objects.equals(this.volumeTimeToCompletion, volumeGroupOperation.volumeTimeToCompletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeGroupRef, groupPercentComplete, groupTimeToCompletion, volumeRef, volumePercentComplete, volumeTimeToCompletion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeGroupOperation {\n");
    
    sb.append("    volumeGroupRef: ").append(toIndentedString(volumeGroupRef)).append("\n");
    sb.append("    groupPercentComplete: ").append(toIndentedString(groupPercentComplete)).append("\n");
    sb.append("    groupTimeToCompletion: ").append(toIndentedString(groupTimeToCompletion)).append("\n");
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    volumePercentComplete: ").append(toIndentedString(volumePercentComplete)).append("\n");
    sb.append("    volumeTimeToCompletion: ").append(toIndentedString(volumeTimeToCompletion)).append("\n");
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

