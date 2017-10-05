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
 * PITView
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PITView   {
  
    private String viewRef;

    private String worldWideName;

    private String baseVol;

    private String basePIT;

    private Boolean boundToPIT;


  /**
   * The view access mode.
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

    private String label;


  /**
   * The view status.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    stopped("stopped"),
    failed("failed"),
    overThreshold("overThreshold"),
    full("full"),
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

    private String currentManager;

    private String preferredManager;

    private String repositoryVolume;

    private Integer fullWarnThreshold;

    private Long viewTime;

    private Long viewSequenceNumber;

    private VolumePerms perms;

    private Integer volumeHandle;

    private Integer clusterSize;

    private Long maxRepositoryCapacity;

    private Long unusableRepositoryCapacity;

    private PITViewMembership membership;

    private Integer mgmtClientAttribute;

    private Boolean offline;

    private String name;

    private String id;

  
  /**
   * The reference (key) for this view.
   **/
  public PITView viewRef(String viewRef) {
    this.viewRef = viewRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for this view.")
  @JsonProperty("viewRef")
  public String getViewRef() {
    return viewRef;
  }
  
  public void setViewRef(String viewRef) {
    this.viewRef = viewRef;
  }

  
  /**
   * The WWN of the view.
   **/
  public PITView worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the view.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * A reference to the base volume with which this view is associated.
   **/
  public PITView baseVol(String baseVol) {
    this.baseVol = baseVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the base volume with which this view is associated.")
  @JsonProperty("baseVol")
  public String getBaseVol() {
    return baseVol;
  }
  
  public void setBaseVol(String baseVol) {
    this.baseVol = baseVol;
  }

  
  /**
   * A reference to the particular PiT of the base for which this view applies. This field is only valid if the boundToPIT field is true.
   **/
  public PITView basePIT(String basePIT) {
    this.basePIT = basePIT;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the particular PiT of the base for which this view applies. This field is only valid if the boundToPIT field is true.")
  @JsonProperty("basePIT")
  public String getBasePIT() {
    return basePIT;
  }
  
  public void setBasePIT(String basePIT) {
    this.basePIT = basePIT;
  }

  
  /**
   * If true, this flag indicates that the basePIT field is a valid reference to an associated PIT. If false, the view is disassociated from the PiT so the basePIT reference is invalid.
   **/
  public PITView boundToPIT(Boolean boundToPIT) {
    this.boundToPIT = boundToPIT;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, this flag indicates that the basePIT field is a valid reference to an associated PIT. If false, the view is disassociated from the PiT so the basePIT reference is invalid.")
  @JsonProperty("boundToPIT")
  public Boolean getBoundToPIT() {
    return boundToPIT;
  }
  
  public void setBoundToPIT(Boolean boundToPIT) {
    this.boundToPIT = boundToPIT;
  }

  
  /**
   * The view access mode.
   **/
  public PITView accessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The view access mode.")
  @JsonProperty("accessMode")
  public AccessModeEnum getAccessMode() {
    return accessMode;
  }
  
  public void setAccessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
  }

  
  /**
   * The name of the view.
   **/
  public PITView label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the view.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The view status.
   **/
  public PITView status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The view status.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The current owner of the view.
   **/
  public PITView currentManager(String currentManager) {
    this.currentManager = currentManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current owner of the view.")
  @JsonProperty("currentManager")
  public String getCurrentManager() {
    return currentManager;
  }
  
  public void setCurrentManager(String currentManager) {
    this.currentManager = currentManager;
  }

  
  /**
   * The preferred owner of the view.
   **/
  public PITView preferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The preferred owner of the view.")
  @JsonProperty("preferredManager")
  public String getPreferredManager() {
    return preferredManager;
  }
  
  public void setPreferredManager(String preferredManager) {
    this.preferredManager = preferredManager;
  }

  
  /**
   * The copy-on-write repository for this view.
   **/
  public PITView repositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The copy-on-write repository for this view.")
  @JsonProperty("repositoryVolume")
  public String getRepositoryVolume() {
    return repositoryVolume;
  }
  
  public void setRepositoryVolume(String repositoryVolume) {
    this.repositoryVolume = repositoryVolume;
  }

  
  /**
   * The repository utilization warning threshold percentage.
   **/
  public PITView fullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold percentage.")
  @JsonProperty("fullWarnThreshold")
  public Integer getFullWarnThreshold() {
    return fullWarnThreshold;
  }
  
  public void setFullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
  }

  
  /**
   * The controller-time (measured in seconds since January 1, 1970) when view was created or re-attached to another PiT.
   **/
  public PITView viewTime(Long viewTime) {
    this.viewTime = viewTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller-time (measured in seconds since January 1, 1970) when view was created or re-attached to another PiT.")
  @JsonProperty("viewTime")
  public Long getViewTime() {
    return viewTime;
  }
  
  public void setViewTime(Long viewTime) {
    this.viewTime = viewTime;
  }

  
  /**
   * Sequence number. This is a monotonically increasing sequence value that can be used to determine related views when the view was created as part of a consistency group operation.
   **/
  public PITView viewSequenceNumber(Long viewSequenceNumber) {
    this.viewSequenceNumber = viewSequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sequence number. This is a monotonically increasing sequence value that can be used to determine related views when the view was created as part of a consistency group operation.")
  @JsonProperty("viewSequenceNumber")
  public Long getViewSequenceNumber() {
    return viewSequenceNumber;
  }
  
  public void setViewSequenceNumber(Long viewSequenceNumber) {
    this.viewSequenceNumber = viewSequenceNumber;
  }

  
  /**
   * The permissions for the view.
   **/
  public PITView perms(VolumePerms perms) {
    this.perms = perms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The permissions for the view.")
  @JsonProperty("perms")
  public VolumePerms getPerms() {
    return perms;
  }
  
  public void setPerms(VolumePerms perms) {
    this.perms = perms;
  }

  
  /**
   * The volume ssid. This is provided primarily for debug purposes.
   **/
  public PITView volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume ssid. This is provided primarily for debug purposes.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * The cluster size in bytes.
   **/
  public PITView clusterSize(Integer clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cluster size in bytes.")
  @JsonProperty("clusterSize")
  public Integer getClusterSize() {
    return clusterSize;
  }
  
  public void setClusterSize(Integer clusterSize) {
    this.clusterSize = clusterSize;
  }

  
  /**
   * The maximum allowable repository size in bytes based on current cluster size.
   **/
  public PITView maxRepositoryCapacity(Long maxRepositoryCapacity) {
    this.maxRepositoryCapacity = maxRepositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum allowable repository size in bytes based on current cluster size.")
  @JsonProperty("maxRepositoryCapacity")
  public Long getMaxRepositoryCapacity() {
    return maxRepositoryCapacity;
  }
  
  public void setMaxRepositoryCapacity(Long maxRepositoryCapacity) {
    this.maxRepositoryCapacity = maxRepositoryCapacity;
  }

  
  /**
   * The amount of repository capacity in bytes that is unusable due to limited addressability of the current cluster size.
   **/
  public PITView unusableRepositoryCapacity(Long unusableRepositoryCapacity) {
    this.unusableRepositoryCapacity = unusableRepositoryCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of repository capacity in bytes that is unusable due to limited addressability of the current cluster size.")
  @JsonProperty("unusableRepositoryCapacity")
  public Long getUnusableRepositoryCapacity() {
    return unusableRepositoryCapacity;
  }
  
  public void setUnusableRepositoryCapacity(Long unusableRepositoryCapacity) {
    this.unusableRepositoryCapacity = unusableRepositoryCapacity;
  }

  
  /**
   * This view's relationship (if any) to a Consistency Group View.
   **/
  public PITView membership(PITViewMembership membership) {
    this.membership = membership;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This view's relationship (if any) to a Consistency Group View.")
  @JsonProperty("membership")
  public PITViewMembership getMembership() {
    return membership;
  }
  
  public void setMembership(PITViewMembership membership) {
    this.membership = membership;
  }

  
  /**
   * The management client attribute.
   **/
  public PITView mgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management client attribute.")
  @JsonProperty("mgmtClientAttribute")
  public Integer getMgmtClientAttribute() {
    return mgmtClientAttribute;
  }
  
  public void setMgmtClientAttribute(Integer mgmtClientAttribute) {
    this.mgmtClientAttribute = mgmtClientAttribute;
  }

  
  /**
   * The view is offline due to the associated repository volume state.
   **/
  public PITView offline(Boolean offline) {
    this.offline = offline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The view is offline due to the associated repository volume state.")
  @JsonProperty("offline")
  public Boolean getOffline() {
    return offline;
  }
  
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   **/
  public PITView name(String name) {
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
   **/
  public PITView id(String id) {
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
    PITView pITView = (PITView) o;
    return Objects.equals(this.viewRef, pITView.viewRef) &&
        Objects.equals(this.worldWideName, pITView.worldWideName) &&
        Objects.equals(this.baseVol, pITView.baseVol) &&
        Objects.equals(this.basePIT, pITView.basePIT) &&
        Objects.equals(this.boundToPIT, pITView.boundToPIT) &&
        Objects.equals(this.accessMode, pITView.accessMode) &&
        Objects.equals(this.label, pITView.label) &&
        Objects.equals(this.status, pITView.status) &&
        Objects.equals(this.currentManager, pITView.currentManager) &&
        Objects.equals(this.preferredManager, pITView.preferredManager) &&
        Objects.equals(this.repositoryVolume, pITView.repositoryVolume) &&
        Objects.equals(this.fullWarnThreshold, pITView.fullWarnThreshold) &&
        Objects.equals(this.viewTime, pITView.viewTime) &&
        Objects.equals(this.viewSequenceNumber, pITView.viewSequenceNumber) &&
        Objects.equals(this.perms, pITView.perms) &&
        Objects.equals(this.volumeHandle, pITView.volumeHandle) &&
        Objects.equals(this.clusterSize, pITView.clusterSize) &&
        Objects.equals(this.maxRepositoryCapacity, pITView.maxRepositoryCapacity) &&
        Objects.equals(this.unusableRepositoryCapacity, pITView.unusableRepositoryCapacity) &&
        Objects.equals(this.membership, pITView.membership) &&
        Objects.equals(this.mgmtClientAttribute, pITView.mgmtClientAttribute) &&
        Objects.equals(this.offline, pITView.offline) &&
        Objects.equals(this.name, pITView.name) &&
        Objects.equals(this.id, pITView.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewRef, worldWideName, baseVol, basePIT, boundToPIT, accessMode, label, status, currentManager, preferredManager, repositoryVolume, fullWarnThreshold, viewTime, viewSequenceNumber, perms, volumeHandle, clusterSize, maxRepositoryCapacity, unusableRepositoryCapacity, membership, mgmtClientAttribute, offline, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITView {\n");
    
    sb.append("    viewRef: ").append(toIndentedString(viewRef)).append("\n");
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    baseVol: ").append(toIndentedString(baseVol)).append("\n");
    sb.append("    basePIT: ").append(toIndentedString(basePIT)).append("\n");
    sb.append("    boundToPIT: ").append(toIndentedString(boundToPIT)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currentManager: ").append(toIndentedString(currentManager)).append("\n");
    sb.append("    preferredManager: ").append(toIndentedString(preferredManager)).append("\n");
    sb.append("    repositoryVolume: ").append(toIndentedString(repositoryVolume)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
    sb.append("    viewTime: ").append(toIndentedString(viewTime)).append("\n");
    sb.append("    viewSequenceNumber: ").append(toIndentedString(viewSequenceNumber)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
    sb.append("    maxRepositoryCapacity: ").append(toIndentedString(maxRepositoryCapacity)).append("\n");
    sb.append("    unusableRepositoryCapacity: ").append(toIndentedString(unusableRepositoryCapacity)).append("\n");
    sb.append("    membership: ").append(toIndentedString(membership)).append("\n");
    sb.append("    mgmtClientAttribute: ").append(toIndentedString(mgmtClientAttribute)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

