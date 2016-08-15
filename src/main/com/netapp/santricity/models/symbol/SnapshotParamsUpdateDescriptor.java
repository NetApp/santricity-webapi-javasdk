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
 * SnapshotParamsUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SnapshotParamsUpdateDescriptor   {
  
    private String snapRef;

    private Integer warnThreshold;

    private Long extentStart;

    private Long extentSize;


  /**
   * The policy concerning what will happen when the repository is full.
   */
  public enum RepFullPolicyEnum {
    failwrites("failwrites"),
    failsnap("failsnap"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RepFullPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RepFullPolicyEnum repFullPolicy;

    private Integer rollbackPriority;

  
  /**
   * The snapshot volume to be updated.
   **/
  public SnapshotParamsUpdateDescriptor snapRef(String snapRef) {
    this.snapRef = snapRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The snapshot volume to be updated.")
  @JsonProperty("snapRef")
  public String getSnapRef() {
    return snapRef;
  }
  
  public void setSnapRef(String snapRef) {
    this.snapRef = snapRef;
  }

  
  /**
   * The repository utilization warning threshold.
   **/
  public SnapshotParamsUpdateDescriptor warnThreshold(Integer warnThreshold) {
    this.warnThreshold = warnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold.")
  @JsonProperty("warnThreshold")
  public Integer getWarnThreshold() {
    return warnThreshold;
  }
  
  public void setWarnThreshold(Integer warnThreshold) {
    this.warnThreshold = warnThreshold;
  }

  
  /**
   * The start position of the extent in the base volume (bytes). Not used in this release of software.
   **/
  public SnapshotParamsUpdateDescriptor extentStart(Long extentStart) {
    this.extentStart = extentStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start position of the extent in the base volume (bytes). Not used in this release of software.")
  @JsonProperty("extentStart")
  public Long getExtentStart() {
    return extentStart;
  }
  
  public void setExtentStart(Long extentStart) {
    this.extentStart = extentStart;
  }

  
  /**
   * The size of the extent in bytes. Not used in this release of software.
   **/
  public SnapshotParamsUpdateDescriptor extentSize(Long extentSize) {
    this.extentSize = extentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the extent in bytes. Not used in this release of software.")
  @JsonProperty("extentSize")
  public Long getExtentSize() {
    return extentSize;
  }
  
  public void setExtentSize(Long extentSize) {
    this.extentSize = extentSize;
  }

  
  /**
   * The policy concerning what will happen when the repository is full.
   **/
  public SnapshotParamsUpdateDescriptor repFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The policy concerning what will happen when the repository is full.")
  @JsonProperty("repFullPolicy")
  public RepFullPolicyEnum getRepFullPolicy() {
    return repFullPolicy;
  }
  
  public void setRepFullPolicy(RepFullPolicyEnum repFullPolicy) {
    this.repFullPolicy = repFullPolicy;
  }

  
  /**
   * The importance of the rollback operation.
   **/
  public SnapshotParamsUpdateDescriptor rollbackPriority(Integer rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The importance of the rollback operation.")
  @JsonProperty("rollbackPriority")
  public Integer getRollbackPriority() {
    return rollbackPriority;
  }
  
  public void setRollbackPriority(Integer rollbackPriority) {
    this.rollbackPriority = rollbackPriority;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotParamsUpdateDescriptor snapshotParamsUpdateDescriptor = (SnapshotParamsUpdateDescriptor) o;
    return Objects.equals(this.snapRef, snapshotParamsUpdateDescriptor.snapRef) &&
        Objects.equals(this.warnThreshold, snapshotParamsUpdateDescriptor.warnThreshold) &&
        Objects.equals(this.extentStart, snapshotParamsUpdateDescriptor.extentStart) &&
        Objects.equals(this.extentSize, snapshotParamsUpdateDescriptor.extentSize) &&
        Objects.equals(this.repFullPolicy, snapshotParamsUpdateDescriptor.repFullPolicy) &&
        Objects.equals(this.rollbackPriority, snapshotParamsUpdateDescriptor.rollbackPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapRef, warnThreshold, extentStart, extentSize, repFullPolicy, rollbackPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotParamsUpdateDescriptor {\n");
    
    sb.append("    snapRef: ").append(toIndentedString(snapRef)).append("\n");
    sb.append("    warnThreshold: ").append(toIndentedString(warnThreshold)).append("\n");
    sb.append("    extentStart: ").append(toIndentedString(extentStart)).append("\n");
    sb.append("    extentSize: ").append(toIndentedString(extentSize)).append("\n");
    sb.append("    repFullPolicy: ").append(toIndentedString(repFullPolicy)).append("\n");
    sb.append("    rollbackPriority: ").append(toIndentedString(rollbackPriority)).append("\n");
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

