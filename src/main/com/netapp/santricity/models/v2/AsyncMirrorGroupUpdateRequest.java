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
 * AsyncMirrorGroupUpdateRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AsyncMirrorGroupUpdateRequest   {
  
    private String name;

    private Integer syncIntervalMinutes;

    private Integer recoveryWarnThresholdMinutes;

    private Integer repoUtilizationWarnThreshold;

    private Integer syncWarnThresholdMinutes;

  
  /**
   **/
  public AsyncMirrorGroupUpdateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Sync interval (minutes)
   **/
  public AsyncMirrorGroupUpdateRequest syncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sync interval (minutes)")
  @JsonProperty("syncIntervalMinutes")
  public Integer getSyncIntervalMinutes() {
    return syncIntervalMinutes;
  }
  
  public void setSyncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
  }

  
  /**
   * Recovery point warning threshold (minutes)
   **/
  public AsyncMirrorGroupUpdateRequest recoveryWarnThresholdMinutes(Integer recoveryWarnThresholdMinutes) {
    this.recoveryWarnThresholdMinutes = recoveryWarnThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recovery point warning threshold (minutes)")
  @JsonProperty("recoveryWarnThresholdMinutes")
  public Integer getRecoveryWarnThresholdMinutes() {
    return recoveryWarnThresholdMinutes;
  }
  
  public void setRecoveryWarnThresholdMinutes(Integer recoveryWarnThresholdMinutes) {
    this.recoveryWarnThresholdMinutes = recoveryWarnThresholdMinutes;
  }

  
  /**
   * Recovery point warning threshold (percentage)
   **/
  public AsyncMirrorGroupUpdateRequest repoUtilizationWarnThreshold(Integer repoUtilizationWarnThreshold) {
    this.repoUtilizationWarnThreshold = repoUtilizationWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recovery point warning threshold (percentage)")
  @JsonProperty("repoUtilizationWarnThreshold")
  public Integer getRepoUtilizationWarnThreshold() {
    return repoUtilizationWarnThreshold;
  }
  
  public void setRepoUtilizationWarnThreshold(Integer repoUtilizationWarnThreshold) {
    this.repoUtilizationWarnThreshold = repoUtilizationWarnThreshold;
  }

  
  /**
   **/
  public AsyncMirrorGroupUpdateRequest syncWarnThresholdMinutes(Integer syncWarnThresholdMinutes) {
    this.syncWarnThresholdMinutes = syncWarnThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("syncWarnThresholdMinutes")
  public Integer getSyncWarnThresholdMinutes() {
    return syncWarnThresholdMinutes;
  }
  
  public void setSyncWarnThresholdMinutes(Integer syncWarnThresholdMinutes) {
    this.syncWarnThresholdMinutes = syncWarnThresholdMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupUpdateRequest asyncMirrorGroupUpdateRequest = (AsyncMirrorGroupUpdateRequest) o;
    return Objects.equals(this.name, asyncMirrorGroupUpdateRequest.name) &&
        Objects.equals(this.syncIntervalMinutes, asyncMirrorGroupUpdateRequest.syncIntervalMinutes) &&
        Objects.equals(this.recoveryWarnThresholdMinutes, asyncMirrorGroupUpdateRequest.recoveryWarnThresholdMinutes) &&
        Objects.equals(this.repoUtilizationWarnThreshold, asyncMirrorGroupUpdateRequest.repoUtilizationWarnThreshold) &&
        Objects.equals(this.syncWarnThresholdMinutes, asyncMirrorGroupUpdateRequest.syncWarnThresholdMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, syncIntervalMinutes, recoveryWarnThresholdMinutes, repoUtilizationWarnThreshold, syncWarnThresholdMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    syncIntervalMinutes: ").append(toIndentedString(syncIntervalMinutes)).append("\n");
    sb.append("    recoveryWarnThresholdMinutes: ").append(toIndentedString(recoveryWarnThresholdMinutes)).append("\n");
    sb.append("    repoUtilizationWarnThreshold: ").append(toIndentedString(repoUtilizationWarnThreshold)).append("\n");
    sb.append("    syncWarnThresholdMinutes: ").append(toIndentedString(syncWarnThresholdMinutes)).append("\n");
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

