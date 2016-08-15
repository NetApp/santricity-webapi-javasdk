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
 * Creates an async mirror group (issued to the array with the primary role).
 */
@ApiModel(description = "Creates an async mirror group (issued to the array with the primary role).")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class AsyncMirrorGroupCreateRequest   {
  
    private String name;

    private String secondaryArrayId;

    private Integer syncIntervalMinutes;

    private Boolean manualSync;

    private Integer recoveryWarnThresholdMinutes;

    private Integer repoUtilizationWarnThreshold;


  /**
   * The intended protocol to use if both Fibre and iSCSI are available.
   */
  public enum InterfaceTypeEnum {
    fibre("fibre"),
    iscsi("iscsi");
;
    private String value;

    InterfaceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private InterfaceTypeEnum interfaceType;

    private Integer syncWarnThresholdMinutes;

  
  /**
   * The user-label to assign to the new async mirror group.
   **/
  public AsyncMirrorGroupCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-label to assign to the new async mirror group.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The id of the secondary array.
   **/
  public AsyncMirrorGroupCreateRequest secondaryArrayId(String secondaryArrayId) {
    this.secondaryArrayId = secondaryArrayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the secondary array.")
  @JsonProperty("secondaryArrayId")
  public String getSecondaryArrayId() {
    return secondaryArrayId;
  }
  
  public void setSecondaryArrayId(String secondaryArrayId) {
    this.secondaryArrayId = secondaryArrayId;
  }

  
  /**
   * Sync interval in (minutes)
   **/
  public AsyncMirrorGroupCreateRequest syncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sync interval in (minutes)")
  @JsonProperty("syncIntervalMinutes")
  public Integer getSyncIntervalMinutes() {
    return syncIntervalMinutes;
  }
  
  public void setSyncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
  }

  
  /**
   * Set the synchronization method to manual, causing other synchronization values to be ignored.
   **/
  public AsyncMirrorGroupCreateRequest manualSync(Boolean manualSync) {
    this.manualSync = manualSync;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set the synchronization method to manual, causing other synchronization values to be ignored.")
  @JsonProperty("manualSync")
  public Boolean getManualSync() {
    return manualSync;
  }
  
  public void setManualSync(Boolean manualSync) {
    this.manualSync = manualSync;
  }

  
  /**
   * Recovery point warning threshold (minutes). The user will be warned when the age of the last good failures point exceeds this value
   **/
  public AsyncMirrorGroupCreateRequest recoveryWarnThresholdMinutes(Integer recoveryWarnThresholdMinutes) {
    this.recoveryWarnThresholdMinutes = recoveryWarnThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recovery point warning threshold (minutes). The user will be warned when the age of the last good failures point exceeds this value")
  @JsonProperty("recoveryWarnThresholdMinutes")
  public Integer getRecoveryWarnThresholdMinutes() {
    return recoveryWarnThresholdMinutes;
  }
  
  public void setRecoveryWarnThresholdMinutes(Integer recoveryWarnThresholdMinutes) {
    this.recoveryWarnThresholdMinutes = recoveryWarnThresholdMinutes;
  }

  
  /**
   * Recovery point warning threshold (percentage)
   * minimum: 0.0
   * maximum: 100.0
   **/
  public AsyncMirrorGroupCreateRequest repoUtilizationWarnThreshold(Integer repoUtilizationWarnThreshold) {
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
   * The intended protocol to use if both Fibre and iSCSI are available.
   **/
  public AsyncMirrorGroupCreateRequest interfaceType(InterfaceTypeEnum interfaceType) {
    this.interfaceType = interfaceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intended protocol to use if both Fibre and iSCSI are available.")
  @JsonProperty("interfaceType")
  public InterfaceTypeEnum getInterfaceType() {
    return interfaceType;
  }
  
  public void setInterfaceType(InterfaceTypeEnum interfaceType) {
    this.interfaceType = interfaceType;
  }

  
  /**
   * The threshold (in minutes) for notifying the user that periodic synchronization has taken too long to complete.
   **/
  public AsyncMirrorGroupCreateRequest syncWarnThresholdMinutes(Integer syncWarnThresholdMinutes) {
    this.syncWarnThresholdMinutes = syncWarnThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The threshold (in minutes) for notifying the user that periodic synchronization has taken too long to complete.")
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
    AsyncMirrorGroupCreateRequest asyncMirrorGroupCreateRequest = (AsyncMirrorGroupCreateRequest) o;
    return Objects.equals(this.name, asyncMirrorGroupCreateRequest.name) &&
        Objects.equals(this.secondaryArrayId, asyncMirrorGroupCreateRequest.secondaryArrayId) &&
        Objects.equals(this.syncIntervalMinutes, asyncMirrorGroupCreateRequest.syncIntervalMinutes) &&
        Objects.equals(this.manualSync, asyncMirrorGroupCreateRequest.manualSync) &&
        Objects.equals(this.recoveryWarnThresholdMinutes, asyncMirrorGroupCreateRequest.recoveryWarnThresholdMinutes) &&
        Objects.equals(this.repoUtilizationWarnThreshold, asyncMirrorGroupCreateRequest.repoUtilizationWarnThreshold) &&
        Objects.equals(this.interfaceType, asyncMirrorGroupCreateRequest.interfaceType) &&
        Objects.equals(this.syncWarnThresholdMinutes, asyncMirrorGroupCreateRequest.syncWarnThresholdMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, secondaryArrayId, syncIntervalMinutes, manualSync, recoveryWarnThresholdMinutes, repoUtilizationWarnThreshold, interfaceType, syncWarnThresholdMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryArrayId: ").append(toIndentedString(secondaryArrayId)).append("\n");
    sb.append("    syncIntervalMinutes: ").append(toIndentedString(syncIntervalMinutes)).append("\n");
    sb.append("    manualSync: ").append(toIndentedString(manualSync)).append("\n");
    sb.append("    recoveryWarnThresholdMinutes: ").append(toIndentedString(recoveryWarnThresholdMinutes)).append("\n");
    sb.append("    repoUtilizationWarnThreshold: ").append(toIndentedString(repoUtilizationWarnThreshold)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
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

