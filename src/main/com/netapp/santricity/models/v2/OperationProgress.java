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
 * OperationProgress
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class OperationProgress   {
  
    private String volumeRef;


  /**
   * Gets or Sets currentAction
   */
  public enum CurrentActionEnum {
    none("none"),
    copyback("copyback"),
    initializing("initializing"),
    reconstructing("reconstructing"),
    remappingDce("remappingDce"),
    remappingDrm("remappingDrm"),
    remappingDcedrm("remappingDcedrm"),
    remappingDseg("remappingDseg"),
    remappingDve("remappingDve"),
    remappingDcedve("remappingDcedve"),
    remappingInternal("remappingInternal"),
    remappingDefrag("remappingDefrag"),
    formatting("formatting"),
    synchronizing("synchronizing"),
    parityScan("parityScan"),
    volumeCopy("volumeCopy"),
    snapshotRollback("snapshotRollback"),
    pitRollback("pitRollback"),
    asyncMirrorGroupInitialSync("asyncMirrorGroupInitialSync"),
    reconstructingCritical("reconstructingCritical"),
    rebalancing("rebalancing"),
    copyThenFail("copyThenFail"),
    copyThenFailPending("copyThenFailPending"),
    copyThenReplace("copyThenReplace"),
    copyThenReplaceAndFail("copyThenReplaceAndFail"),
    thinDefrag("thinDefrag"),
    creating("creating"),
    deleting("deleting"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CurrentActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentActionEnum currentAction;

    private Integer progressPercentage;

    private Integer estimatedTimeToCompletion;

  
  /**
   **/
  public OperationProgress volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   **/
  public OperationProgress currentAction(CurrentActionEnum currentAction) {
    this.currentAction = currentAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("currentAction")
  public CurrentActionEnum getCurrentAction() {
    return currentAction;
  }
  
  public void setCurrentAction(CurrentActionEnum currentAction) {
    this.currentAction = currentAction;
  }

  
  /**
   **/
  public OperationProgress progressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("progressPercentage")
  public Integer getProgressPercentage() {
    return progressPercentage;
  }
  
  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  
  /**
   **/
  public OperationProgress estimatedTimeToCompletion(Integer estimatedTimeToCompletion) {
    this.estimatedTimeToCompletion = estimatedTimeToCompletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("estimatedTimeToCompletion")
  public Integer getEstimatedTimeToCompletion() {
    return estimatedTimeToCompletion;
  }
  
  public void setEstimatedTimeToCompletion(Integer estimatedTimeToCompletion) {
    this.estimatedTimeToCompletion = estimatedTimeToCompletion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationProgress operationProgress = (OperationProgress) o;
    return Objects.equals(this.volumeRef, operationProgress.volumeRef) &&
        Objects.equals(this.currentAction, operationProgress.currentAction) &&
        Objects.equals(this.progressPercentage, operationProgress.progressPercentage) &&
        Objects.equals(this.estimatedTimeToCompletion, operationProgress.estimatedTimeToCompletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeRef, currentAction, progressPercentage, estimatedTimeToCompletion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationProgress {\n");
    
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    currentAction: ").append(toIndentedString(currentAction)).append("\n");
    sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
    sb.append("    estimatedTimeToCompletion: ").append(toIndentedString(estimatedTimeToCompletion)).append("\n");
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

