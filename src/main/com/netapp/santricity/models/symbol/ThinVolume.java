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
 * ThinVolume
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ThinVolume   {
  
    private Integer volumeHandle;

    private String worldWideName;

    private String label;

    private Integer allocationGranularity;

    private Long capacity;

    private Integer reconPriority;

    private String volumeRef;


  /**
   * The operational status of the volume.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    full("full"),
    overThresh("overThresh"),
    failed("failed"),
    initializing("initializing"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;

    private String repositoryRef;

    private String currentManager;

    private String preferredManager;

    private VolumePerms perms;

    private Integer mgmtClientAttribute;

    private Boolean preReadRedundancyCheckEnabled;


  /**
   * The protection type of the volume.
   */
  public enum ProtectionTypeEnum {
    type0Protection("type0Protection"),
    type1Protection("type1Protection"),
    type2Protection("type2Protection"),
    type3Protection("type3Protection"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ProtectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ProtectionTypeEnum protectionType;

    private Boolean applicationTagOwned;

    private Long maxVirtualCapacity;

    private Long initialProvisionedCapacity;

    private Long currentProvisionedCapacity;

    private Long provisionedCapacityQuota;

    private Integer growthAlertThreshold;


  /**
   * The automatic Expandable Repository Volume expansion policy.
   */
  public enum ExpansionPolicyEnum {
    unknown("unknown"),
    manual("manual"),
    automatic("automatic"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ExpansionPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ExpansionPolicyEnum expansionPolicy;

    private VolumeCache volumeCache;

    private Boolean offline;


  /**
   * Indicates how the thin volume is reported on the SCSI interface.
   */
  public enum ReportingPolicyEnum {
    unknown("unknown"),
    asThick("asThick"),
    asThin("asThin"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ReportingPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ReportingPolicyEnum reportingPolicy;

    private String id;

  
  /**
   * The volumeHandle (SSID) for this volume.
   **/
  public ThinVolume volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volumeHandle (SSID) for this volume.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * The World wide name of the volume.
   **/
  public ThinVolume worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The World wide name of the volume.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The name of the volume.
   **/
  public ThinVolume label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the volume.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The allocation cluster size for the Expandable Repository Volume.
   **/
  public ThinVolume allocationGranularity(Integer allocationGranularity) {
    this.allocationGranularity = allocationGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The allocation cluster size for the Expandable Repository Volume.")
  @JsonProperty("allocationGranularity")
  public Integer getAllocationGranularity() {
    return allocationGranularity;
  }
  
  public void setAllocationGranularity(Integer allocationGranularity) {
    this.allocationGranularity = allocationGranularity;
  }

  
  /**
   * The virtual capacity of the volume in bytes.
   **/
  public ThinVolume capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The virtual capacity of the volume in bytes.")
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }
  
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  
  /**
   * Importance of fixing the volume if failed (0-4).
   **/
  public ThinVolume reconPriority(Integer reconPriority) {
    this.reconPriority = reconPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Importance of fixing the volume if failed (0-4).")
  @JsonProperty("reconPriority")
  public Integer getReconPriority() {
    return reconPriority;
  }
  
  public void setReconPriority(Integer reconPriority) {
    this.reconPriority = reconPriority;
  }

  
  /**
   * The reference (key) for this volume.
   **/
  public ThinVolume volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for this volume.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * The operational status of the volume.
   **/
  public ThinVolume status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status of the volume.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The Expandable Repository Volume underlying this Thin Volume.
   **/
  public ThinVolume repositoryRef(String repositoryRef) {
    this.repositoryRef = repositoryRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Expandable Repository Volume underlying this Thin Volume.")
  @JsonProperty("repositoryRef")
  public String getRepositoryRef() {
    return repositoryRef;
  }
  
  public void setRepositoryRef(String repositoryRef) {
    this.repositoryRef = repositoryRef;
  }

  
  /**
   * The controller that currently manages the volume.
   **/
  public ThinVolume currentManager(String currentManager) {
    this.currentManager = currentManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that currently manages the volume.")
  @JsonProperty("currentManager")
  public String getCurrentManager() {
    return currentManager;
  }
  
  public void setCurrentManager(String currentManager) {
    this.currentManager = currentManager;
  }

  
  /**
   * The controller that should manage the volume.
   **/
  public ThinVolume preferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that should manage the volume.")
  @JsonProperty("preferredManager")
  public String getPreferredManager() {
    return preferredManager;
  }
  
  public void setPreferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
  }

  
  /**
   * Operations allowed on this volume.
   **/
  public ThinVolume perms(VolumePerms perms) {
    this.perms = perms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Operations allowed on this volume.")
  @JsonProperty("perms")
  public VolumePerms getPerms() {
    return perms;
  }
  
  public void setPerms(VolumePerms perms) {
    this.perms = perms;
  }

  
  /**
   * For use by management client.
   **/
  public ThinVolume mgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "For use by management client.")
  @JsonProperty("mgmtClientAttribute")
  public Integer getMgmtClientAttribute() {
    return mgmtClientAttribute;
  }
  
  public void setMgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
  }

  
  /**
   * If true, verify RAID redundancy on read operations.
   **/
  public ThinVolume preReadRedundancyCheckEnabled(Boolean preReadRedundancyCheckEnabled) {
    this.preReadRedundancyCheckEnabled = preReadRedundancyCheckEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, verify RAID redundancy on read operations.")
  @JsonProperty("preReadRedundancyCheckEnabled")
  public Boolean getPreReadRedundancyCheckEnabled() {
    return preReadRedundancyCheckEnabled;
  }
  
  public void setPreReadRedundancyCheckEnabled(Boolean preReadRedundancyCheckEnabled) {
    this.preReadRedundancyCheckEnabled = preReadRedundancyCheckEnabled;
  }

  
  /**
   * The protection type of the volume.
   **/
  public ThinVolume protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The protection type of the volume.")
  @JsonProperty("protectionType")
  public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }
  
  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  
  /**
   * True if application tag is owned by the storage array.
   **/
  public ThinVolume applicationTagOwned(Boolean applicationTagOwned) {
    this.applicationTagOwned = applicationTagOwned;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if application tag is owned by the storage array.")
  @JsonProperty("applicationTagOwned")
  public Boolean getApplicationTagOwned() {
    return applicationTagOwned;
  }
  
  public void setApplicationTagOwned(Boolean applicationTagOwned) {
    this.applicationTagOwned = applicationTagOwned;
  }

  
  /**
   * The maximum virtual capacity to which this thin volume can grow (in bytes).
   **/
  public ThinVolume maxVirtualCapacity(Long maxVirtualCapacity) {
    this.maxVirtualCapacity = maxVirtualCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum virtual capacity to which this thin volume can grow (in bytes).")
  @JsonProperty("maxVirtualCapacity")
  public Long getMaxVirtualCapacity() {
    return maxVirtualCapacity;
  }
  
  public void setMaxVirtualCapacity(Long maxVirtualCapacity) {
    this.maxVirtualCapacity = maxVirtualCapacity;
  }

  
  /**
   * The initial provisioned capacity for the Expandable Repository Volume for this thin volume (in bytes).
   **/
  public ThinVolume initialProvisionedCapacity(Long initialProvisionedCapacity) {
    this.initialProvisionedCapacity = initialProvisionedCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The initial provisioned capacity for the Expandable Repository Volume for this thin volume (in bytes).")
  @JsonProperty("initialProvisionedCapacity")
  public Long getInitialProvisionedCapacity() {
    return initialProvisionedCapacity;
  }
  
  public void setInitialProvisionedCapacity(Long initialProvisionedCapacity) {
    this.initialProvisionedCapacity = initialProvisionedCapacity;
  }

  
  /**
   * The current provisioned capacity of the Expandable Repository Volume (in bytes).
   **/
  public ThinVolume currentProvisionedCapacity(Long currentProvisionedCapacity) {
    this.currentProvisionedCapacity = currentProvisionedCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current provisioned capacity of the Expandable Repository Volume (in bytes).")
  @JsonProperty("currentProvisionedCapacity")
  public Long getCurrentProvisionedCapacity() {
    return currentProvisionedCapacity;
  }
  
  public void setCurrentProvisionedCapacity(Long currentProvisionedCapacity) {
    this.currentProvisionedCapacity = currentProvisionedCapacity;
  }

  
  /**
   * The maximum capacity of the Expandable Repository Volume (in bytes).
   **/
  public ThinVolume provisionedCapacityQuota(Long provisionedCapacityQuota) {
    this.provisionedCapacityQuota = provisionedCapacityQuota;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum capacity of the Expandable Repository Volume (in bytes).")
  @JsonProperty("provisionedCapacityQuota")
  public Long getProvisionedCapacityQuota() {
    return provisionedCapacityQuota;
  }
  
  public void setProvisionedCapacityQuota(Long provisionedCapacityQuota) {
    this.provisionedCapacityQuota = provisionedCapacityQuota;
  }

  
  /**
   * The percent value at which an alert is generated.
   **/
  public ThinVolume growthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The percent value at which an alert is generated.")
  @JsonProperty("growthAlertThreshold")
  public Integer getGrowthAlertThreshold() {
    return growthAlertThreshold;
  }
  
  public void setGrowthAlertThreshold(Integer growthAlertThreshold) {
    this.growthAlertThreshold = growthAlertThreshold;
  }

  
  /**
   * The automatic Expandable Repository Volume expansion policy.
   **/
  public ThinVolume expansionPolicy(ExpansionPolicyEnum expansionPolicy) {
    this.expansionPolicy = expansionPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The automatic Expandable Repository Volume expansion policy.")
  @JsonProperty("expansionPolicy")
  public ExpansionPolicyEnum getExpansionPolicy() {
    return expansionPolicy;
  }
  
  public void setExpansionPolicy(ExpansionPolicyEnum expansionPolicy) {
    this.expansionPolicy = expansionPolicy;
  }

  
  /**
   * The cache parameters of the underlying repository.
   **/
  public ThinVolume volumeCache(VolumeCache volumeCache) {
    this.volumeCache = volumeCache;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cache parameters of the underlying repository.")
  @JsonProperty("volumeCache")
  public VolumeCache getVolumeCache() {
    return volumeCache;
  }
  
  public void setVolumeCache(VolumeCache volumeCache) {
    this.volumeCache = volumeCache;
  }

  
  /**
   * The thin volume is offline due to the associated repository volume state.
   **/
  public ThinVolume offline(Boolean offline) {
    this.offline = offline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The thin volume is offline due to the associated repository volume state.")
  @JsonProperty("offline")
  public Boolean getOffline() {
    return offline;
  }
  
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   * Indicates how the thin volume is reported on the SCSI interface.
   **/
  public ThinVolume reportingPolicy(ReportingPolicyEnum reportingPolicy) {
    this.reportingPolicy = reportingPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates how the thin volume is reported on the SCSI interface.")
  @JsonProperty("reportingPolicy")
  public ReportingPolicyEnum getReportingPolicy() {
    return reportingPolicy;
  }
  
  public void setReportingPolicy(ReportingPolicyEnum reportingPolicy) {
    this.reportingPolicy = reportingPolicy;
  }

  
  /**
   **/
  public ThinVolume id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThinVolume thinVolume = (ThinVolume) o;
    return Objects.equals(this.volumeHandle, thinVolume.volumeHandle) &&
        Objects.equals(this.worldWideName, thinVolume.worldWideName) &&
        Objects.equals(this.label, thinVolume.label) &&
        Objects.equals(this.allocationGranularity, thinVolume.allocationGranularity) &&
        Objects.equals(this.capacity, thinVolume.capacity) &&
        Objects.equals(this.reconPriority, thinVolume.reconPriority) &&
        Objects.equals(this.volumeRef, thinVolume.volumeRef) &&
        Objects.equals(this.status, thinVolume.status) &&
        Objects.equals(this.repositoryRef, thinVolume.repositoryRef) &&
        Objects.equals(this.currentManager, thinVolume.currentManager) &&
        Objects.equals(this.preferredManager, thinVolume.preferredManager) &&
        Objects.equals(this.perms, thinVolume.perms) &&
        Objects.equals(this.mgmtClientAttribute, thinVolume.mgmtClientAttribute) &&
        Objects.equals(this.preReadRedundancyCheckEnabled, thinVolume.preReadRedundancyCheckEnabled) &&
        Objects.equals(this.protectionType, thinVolume.protectionType) &&
        Objects.equals(this.applicationTagOwned, thinVolume.applicationTagOwned) &&
        Objects.equals(this.maxVirtualCapacity, thinVolume.maxVirtualCapacity) &&
        Objects.equals(this.initialProvisionedCapacity, thinVolume.initialProvisionedCapacity) &&
        Objects.equals(this.currentProvisionedCapacity, thinVolume.currentProvisionedCapacity) &&
        Objects.equals(this.provisionedCapacityQuota, thinVolume.provisionedCapacityQuota) &&
        Objects.equals(this.growthAlertThreshold, thinVolume.growthAlertThreshold) &&
        Objects.equals(this.expansionPolicy, thinVolume.expansionPolicy) &&
        Objects.equals(this.volumeCache, thinVolume.volumeCache) &&
        Objects.equals(this.offline, thinVolume.offline) &&
        Objects.equals(this.reportingPolicy, thinVolume.reportingPolicy) &&
        Objects.equals(this.id, thinVolume.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeHandle, worldWideName, label, allocationGranularity, capacity, reconPriority, volumeRef, status, repositoryRef, currentManager, preferredManager, perms, mgmtClientAttribute, preReadRedundancyCheckEnabled, protectionType, applicationTagOwned, maxVirtualCapacity, initialProvisionedCapacity, currentProvisionedCapacity, provisionedCapacityQuota, growthAlertThreshold, expansionPolicy, volumeCache, offline, reportingPolicy, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinVolume {\n");
    
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    allocationGranularity: ").append(toIndentedString(allocationGranularity)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    reconPriority: ").append(toIndentedString(reconPriority)).append("\n");
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    repositoryRef: ").append(toIndentedString(repositoryRef)).append("\n");
    sb.append("    currentManager: ").append(toIndentedString(currentManager)).append("\n");
    sb.append("    preferredManager: ").append(toIndentedString(preferredManager)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    mgmtClientAttribute: ").append(toIndentedString(mgmtClientAttribute)).append("\n");
    sb.append("    preReadRedundancyCheckEnabled: ").append(toIndentedString(preReadRedundancyCheckEnabled)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    applicationTagOwned: ").append(toIndentedString(applicationTagOwned)).append("\n");
    sb.append("    maxVirtualCapacity: ").append(toIndentedString(maxVirtualCapacity)).append("\n");
    sb.append("    initialProvisionedCapacity: ").append(toIndentedString(initialProvisionedCapacity)).append("\n");
    sb.append("    currentProvisionedCapacity: ").append(toIndentedString(currentProvisionedCapacity)).append("\n");
    sb.append("    provisionedCapacityQuota: ").append(toIndentedString(provisionedCapacityQuota)).append("\n");
    sb.append("    growthAlertThreshold: ").append(toIndentedString(growthAlertThreshold)).append("\n");
    sb.append("    expansionPolicy: ").append(toIndentedString(expansionPolicy)).append("\n");
    sb.append("    volumeCache: ").append(toIndentedString(volumeCache)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    reportingPolicy: ").append(toIndentedString(reportingPolicy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

