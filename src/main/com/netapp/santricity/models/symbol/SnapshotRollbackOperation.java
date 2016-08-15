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
 * SnapshotRollbackOperation
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SnapshotRollbackOperation   {
  
    private String snapshotRef;

    private Boolean pending;

    private Integer percentComplete;

    private Integer timeToCompletion;

  
  /**
   * Reference to the snapshot.
   **/
  public SnapshotRollbackOperation snapshotRef(String snapshotRef) {
    this.snapshotRef = snapshotRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to the snapshot.")
  @JsonProperty("snapshotRef")
  public String getSnapshotRef() {
    return snapshotRef;
  }
  
  public void setSnapshotRef(String snapshotRef) {
    this.snapshotRef = snapshotRef;
  }

  
  /**
   * If true, the operation has not started.
   **/
  public SnapshotRollbackOperation pending(Boolean pending) {
    this.pending = pending;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the operation has not started.")
  @JsonProperty("pending")
  public Boolean getPending() {
    return pending;
  }
  
  public void setPending(Boolean pending) {
    this.pending = pending;
  }

  
  /**
   * Completion percentage for the operation. If the operation is not currently running this value will be equal to PERCENT_COMPLETE_OP_NOT_RUNNING.
   **/
  public SnapshotRollbackOperation percentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Completion percentage for the operation. If the operation is not currently running this value will be equal to PERCENT_COMPLETE_OP_NOT_RUNNING.")
  @JsonProperty("percentComplete")
  public Integer getPercentComplete() {
    return percentComplete;
  }
  
  public void setPercentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
  }

  
  /**
   * Estimated time to completion in minutes. If the time is not known this value will be equal to TIME_TO_COMPLETION_UNKNOWN.
   **/
  public SnapshotRollbackOperation timeToCompletion(Integer timeToCompletion) {
    this.timeToCompletion = timeToCompletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Estimated time to completion in minutes. If the time is not known this value will be equal to TIME_TO_COMPLETION_UNKNOWN.")
  @JsonProperty("timeToCompletion")
  public Integer getTimeToCompletion() {
    return timeToCompletion;
  }
  
  public void setTimeToCompletion(Integer timeToCompletion) {
    this.timeToCompletion = timeToCompletion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotRollbackOperation snapshotRollbackOperation = (SnapshotRollbackOperation) o;
    return Objects.equals(this.snapshotRef, snapshotRollbackOperation.snapshotRef) &&
        Objects.equals(this.pending, snapshotRollbackOperation.pending) &&
        Objects.equals(this.percentComplete, snapshotRollbackOperation.percentComplete) &&
        Objects.equals(this.timeToCompletion, snapshotRollbackOperation.timeToCompletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotRef, pending, percentComplete, timeToCompletion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotRollbackOperation {\n");
    
    sb.append("    snapshotRef: ").append(toIndentedString(snapshotRef)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    timeToCompletion: ").append(toIndentedString(timeToCompletion)).append("\n");
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

