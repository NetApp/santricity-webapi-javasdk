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
 * FirmwareUpgradeHealthCheckResult
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class FirmwareUpgradeHealthCheckResult   {
  
    private String storageDeviceId;

    private String storageDeviceName;

    private String storageDeviceWWN;

    private Long processingTimeMS;

    private Boolean rerun;

    private StorageDeviceHealthCheck storageDeviceAccessible;

    private SpmDatabaseHealthCheck spmDatabaseVerification;

    private ConfigurationDbValidationCheck configurationDatabaseCheck;

    private ObjectGraphSyncCheck objectGraphSyncCheck;

    private StorageDeviceHealthCheck volumeGroupsComplete;

    private StorageDeviceHealthCheck controllerStatusOptimal;

    private StorageDeviceHealthCheck hotSparesInUse;

    private StorageDeviceHealthCheck missingVolumes;

    private StorageDeviceHealthCheck driveCheck;

    private ExclusiveOperationCheck exclusiveOperations;

    private StorageDeviceHealthCheck failedDrivesPresent;

    private StorageDeviceHealthCheck validPasswordSet;

    private MelEventHealthCheck melCheck;

    private Boolean successful;

  
  /**
   **/
  public FirmwareUpgradeHealthCheckResult storageDeviceId(String storageDeviceId) {
    this.storageDeviceId = storageDeviceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageDeviceId")
  public String getStorageDeviceId() {
    return storageDeviceId;
  }
  
  public void setStorageDeviceId(String storageDeviceId) {
    this.storageDeviceId = storageDeviceId;
  }

  
  /**
   **/
  public FirmwareUpgradeHealthCheckResult storageDeviceName(String storageDeviceName) {
    this.storageDeviceName = storageDeviceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageDeviceName")
  public String getStorageDeviceName() {
    return storageDeviceName;
  }
  
  public void setStorageDeviceName(String storageDeviceName) {
    this.storageDeviceName = storageDeviceName;
  }

  
  /**
   **/
  public FirmwareUpgradeHealthCheckResult storageDeviceWWN(String storageDeviceWWN) {
    this.storageDeviceWWN = storageDeviceWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageDeviceWWN")
  public String getStorageDeviceWWN() {
    return storageDeviceWWN;
  }
  
  public void setStorageDeviceWWN(String storageDeviceWWN) {
    this.storageDeviceWWN = storageDeviceWWN;
  }

  
  /**
   **/
  public FirmwareUpgradeHealthCheckResult processingTimeMS(Long processingTimeMS) {
    this.processingTimeMS = processingTimeMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("processingTimeMS")
  public Long getProcessingTimeMS() {
    return processingTimeMS;
  }
  
  public void setProcessingTimeMS(Long processingTimeMS) {
    this.processingTimeMS = processingTimeMS;
  }

  
  /**
   * Info about test run for internal use
   **/
  public FirmwareUpgradeHealthCheckResult rerun(Boolean rerun) {
    this.rerun = rerun;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Info about test run for internal use")
  @JsonProperty("rerun")
  public Boolean getRerun() {
    return rerun;
  }
  
  public void setRerun(Boolean rerun) {
    this.rerun = rerun;
  }

  
  /**
   * Verify the storage-system is contactable.
   **/
  public FirmwareUpgradeHealthCheckResult storageDeviceAccessible(StorageDeviceHealthCheck storageDeviceAccessible) {
    this.storageDeviceAccessible = storageDeviceAccessible;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Verify the storage-system is contactable.")
  @JsonProperty("storageDeviceAccessible")
  public StorageDeviceHealthCheck getStorageDeviceAccessible() {
    return storageDeviceAccessible;
  }
  
  public void setStorageDeviceAccessible(StorageDeviceHealthCheck storageDeviceAccessible) {
    this.storageDeviceAccessible = storageDeviceAccessible;
  }

  
  /**
   * Validate a database internal to the controller.
   **/
  public FirmwareUpgradeHealthCheckResult spmDatabaseVerification(SpmDatabaseHealthCheck spmDatabaseVerification) {
    this.spmDatabaseVerification = spmDatabaseVerification;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Validate a database internal to the controller.")
  @JsonProperty("spmDatabaseVerification")
  public SpmDatabaseHealthCheck getSpmDatabaseVerification() {
    return spmDatabaseVerification;
  }
  
  public void setSpmDatabaseVerification(SpmDatabaseHealthCheck spmDatabaseVerification) {
    this.spmDatabaseVerification = spmDatabaseVerification;
  }

  
  /**
   * Validate a database internal to the controller.
   **/
  public FirmwareUpgradeHealthCheckResult configurationDatabaseCheck(ConfigurationDbValidationCheck configurationDatabaseCheck) {
    this.configurationDatabaseCheck = configurationDatabaseCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Validate a database internal to the controller.")
  @JsonProperty("configurationDatabaseCheck")
  public ConfigurationDbValidationCheck getConfigurationDatabaseCheck() {
    return configurationDatabaseCheck;
  }
  
  public void setConfigurationDatabaseCheck(ConfigurationDbValidationCheck configurationDatabaseCheck) {
    this.configurationDatabaseCheck = configurationDatabaseCheck;
  }

  
  /**
   * Verify that ObjectGraph data is synchronized between the two controllers.
   **/
  public FirmwareUpgradeHealthCheckResult objectGraphSyncCheck(ObjectGraphSyncCheck objectGraphSyncCheck) {
    this.objectGraphSyncCheck = objectGraphSyncCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Verify that ObjectGraph data is synchronized between the two controllers.")
  @JsonProperty("objectGraphSyncCheck")
  public ObjectGraphSyncCheck getObjectGraphSyncCheck() {
    return objectGraphSyncCheck;
  }
  
  public void setObjectGraphSyncCheck(ObjectGraphSyncCheck objectGraphSyncCheck) {
    this.objectGraphSyncCheck = objectGraphSyncCheck;
  }

  
  /**
   * Verify there are no volume groups that are not in a full state of redundancy.
   **/
  public FirmwareUpgradeHealthCheckResult volumeGroupsComplete(StorageDeviceHealthCheck volumeGroupsComplete) {
    this.volumeGroupsComplete = volumeGroupsComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Verify there are no volume groups that are not in a full state of redundancy.")
  @JsonProperty("volumeGroupsComplete")
  public StorageDeviceHealthCheck getVolumeGroupsComplete() {
    return volumeGroupsComplete;
  }
  
  public void setVolumeGroupsComplete(StorageDeviceHealthCheck volumeGroupsComplete) {
    this.volumeGroupsComplete = volumeGroupsComplete;
  }

  
  /**
   * Verify the state of both controllers is optimal.
   **/
  public FirmwareUpgradeHealthCheckResult controllerStatusOptimal(StorageDeviceHealthCheck controllerStatusOptimal) {
    this.controllerStatusOptimal = controllerStatusOptimal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Verify the state of both controllers is optimal.")
  @JsonProperty("controllerStatusOptimal")
  public StorageDeviceHealthCheck getControllerStatusOptimal() {
    return controllerStatusOptimal;
  }
  
  public void setControllerStatusOptimal(StorageDeviceHealthCheck controllerStatusOptimal) {
    this.controllerStatusOptimal = controllerStatusOptimal;
  }

  
  /**
   * Verify that hot spares are not in use (due to drives in a non-optimal state).
   **/
  public FirmwareUpgradeHealthCheckResult hotSparesInUse(StorageDeviceHealthCheck hotSparesInUse) {
    this.hotSparesInUse = hotSparesInUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Verify that hot spares are not in use (due to drives in a non-optimal state).")
  @JsonProperty("hotSparesInUse")
  public StorageDeviceHealthCheck getHotSparesInUse() {
    return hotSparesInUse;
  }
  
  public void setHotSparesInUse(StorageDeviceHealthCheck hotSparesInUse) {
    this.hotSparesInUse = hotSparesInUse;
  }

  
  /**
   * Verify that there are no missing drives/volume-groups.
   **/
  public FirmwareUpgradeHealthCheckResult missingVolumes(StorageDeviceHealthCheck missingVolumes) {
    this.missingVolumes = missingVolumes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Verify that there are no missing drives/volume-groups.")
  @JsonProperty("missingVolumes")
  public StorageDeviceHealthCheck getMissingVolumes() {
    return missingVolumes;
  }
  
  public void setMissingVolumes(StorageDeviceHealthCheck missingVolumes) {
    this.missingVolumes = missingVolumes;
  }

  
  /**
   * Verify that at least one optimal drive is present
   **/
  public FirmwareUpgradeHealthCheckResult driveCheck(StorageDeviceHealthCheck driveCheck) {
    this.driveCheck = driveCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Verify that at least one optimal drive is present")
  @JsonProperty("driveCheck")
  public StorageDeviceHealthCheck getDriveCheck() {
    return driveCheck;
  }
  
  public void setDriveCheck(StorageDeviceHealthCheck driveCheck) {
    this.driveCheck = driveCheck;
  }

  
  /**
   * An upgrade operation cannot proceed if an exclusive operation is in progress on a volume. Examples: volume expansion, RAID type migration.
   **/
  public FirmwareUpgradeHealthCheckResult exclusiveOperations(ExclusiveOperationCheck exclusiveOperations) {
    this.exclusiveOperations = exclusiveOperations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An upgrade operation cannot proceed if an exclusive operation is in progress on a volume. Examples: volume expansion, RAID type migration.")
  @JsonProperty("exclusiveOperations")
  public ExclusiveOperationCheck getExclusiveOperations() {
    return exclusiveOperations;
  }
  
  public void setExclusiveOperations(ExclusiveOperationCheck exclusiveOperations) {
    this.exclusiveOperations = exclusiveOperations;
  }

  
  /**
   **/
  public FirmwareUpgradeHealthCheckResult failedDrivesPresent(StorageDeviceHealthCheck failedDrivesPresent) {
    this.failedDrivesPresent = failedDrivesPresent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("failedDrivesPresent")
  public StorageDeviceHealthCheck getFailedDrivesPresent() {
    return failedDrivesPresent;
  }
  
  public void setFailedDrivesPresent(StorageDeviceHealthCheck failedDrivesPresent) {
    this.failedDrivesPresent = failedDrivesPresent;
  }

  
  /**
   **/
  public FirmwareUpgradeHealthCheckResult validPasswordSet(StorageDeviceHealthCheck validPasswordSet) {
    this.validPasswordSet = validPasswordSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("validPasswordSet")
  public StorageDeviceHealthCheck getValidPasswordSet() {
    return validPasswordSet;
  }
  
  public void setValidPasswordSet(StorageDeviceHealthCheck validPasswordSet) {
    this.validPasswordSet = validPasswordSet;
  }

  
  /**
   **/
  public FirmwareUpgradeHealthCheckResult melCheck(MelEventHealthCheck melCheck) {
    this.melCheck = melCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("melCheck")
  public MelEventHealthCheck getMelCheck() {
    return melCheck;
  }
  
  public void setMelCheck(MelEventHealthCheck melCheck) {
    this.melCheck = melCheck;
  }

  
  /**
   **/
  public FirmwareUpgradeHealthCheckResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("successful")
  public Boolean getSuccessful() {
    return successful;
  }
  
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareUpgradeHealthCheckResult firmwareUpgradeHealthCheckResult = (FirmwareUpgradeHealthCheckResult) o;
    return Objects.equals(this.storageDeviceId, firmwareUpgradeHealthCheckResult.storageDeviceId) &&
        Objects.equals(this.storageDeviceName, firmwareUpgradeHealthCheckResult.storageDeviceName) &&
        Objects.equals(this.storageDeviceWWN, firmwareUpgradeHealthCheckResult.storageDeviceWWN) &&
        Objects.equals(this.processingTimeMS, firmwareUpgradeHealthCheckResult.processingTimeMS) &&
        Objects.equals(this.rerun, firmwareUpgradeHealthCheckResult.rerun) &&
        Objects.equals(this.storageDeviceAccessible, firmwareUpgradeHealthCheckResult.storageDeviceAccessible) &&
        Objects.equals(this.spmDatabaseVerification, firmwareUpgradeHealthCheckResult.spmDatabaseVerification) &&
        Objects.equals(this.configurationDatabaseCheck, firmwareUpgradeHealthCheckResult.configurationDatabaseCheck) &&
        Objects.equals(this.objectGraphSyncCheck, firmwareUpgradeHealthCheckResult.objectGraphSyncCheck) &&
        Objects.equals(this.volumeGroupsComplete, firmwareUpgradeHealthCheckResult.volumeGroupsComplete) &&
        Objects.equals(this.controllerStatusOptimal, firmwareUpgradeHealthCheckResult.controllerStatusOptimal) &&
        Objects.equals(this.hotSparesInUse, firmwareUpgradeHealthCheckResult.hotSparesInUse) &&
        Objects.equals(this.missingVolumes, firmwareUpgradeHealthCheckResult.missingVolumes) &&
        Objects.equals(this.driveCheck, firmwareUpgradeHealthCheckResult.driveCheck) &&
        Objects.equals(this.exclusiveOperations, firmwareUpgradeHealthCheckResult.exclusiveOperations) &&
        Objects.equals(this.failedDrivesPresent, firmwareUpgradeHealthCheckResult.failedDrivesPresent) &&
        Objects.equals(this.validPasswordSet, firmwareUpgradeHealthCheckResult.validPasswordSet) &&
        Objects.equals(this.melCheck, firmwareUpgradeHealthCheckResult.melCheck) &&
        Objects.equals(this.successful, firmwareUpgradeHealthCheckResult.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageDeviceId, storageDeviceName, storageDeviceWWN, processingTimeMS, rerun, storageDeviceAccessible, spmDatabaseVerification, configurationDatabaseCheck, objectGraphSyncCheck, volumeGroupsComplete, controllerStatusOptimal, hotSparesInUse, missingVolumes, driveCheck, exclusiveOperations, failedDrivesPresent, validPasswordSet, melCheck, successful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareUpgradeHealthCheckResult {\n");
    
    sb.append("    storageDeviceId: ").append(toIndentedString(storageDeviceId)).append("\n");
    sb.append("    storageDeviceName: ").append(toIndentedString(storageDeviceName)).append("\n");
    sb.append("    storageDeviceWWN: ").append(toIndentedString(storageDeviceWWN)).append("\n");
    sb.append("    processingTimeMS: ").append(toIndentedString(processingTimeMS)).append("\n");
    sb.append("    rerun: ").append(toIndentedString(rerun)).append("\n");
    sb.append("    storageDeviceAccessible: ").append(toIndentedString(storageDeviceAccessible)).append("\n");
    sb.append("    spmDatabaseVerification: ").append(toIndentedString(spmDatabaseVerification)).append("\n");
    sb.append("    configurationDatabaseCheck: ").append(toIndentedString(configurationDatabaseCheck)).append("\n");
    sb.append("    objectGraphSyncCheck: ").append(toIndentedString(objectGraphSyncCheck)).append("\n");
    sb.append("    volumeGroupsComplete: ").append(toIndentedString(volumeGroupsComplete)).append("\n");
    sb.append("    controllerStatusOptimal: ").append(toIndentedString(controllerStatusOptimal)).append("\n");
    sb.append("    hotSparesInUse: ").append(toIndentedString(hotSparesInUse)).append("\n");
    sb.append("    missingVolumes: ").append(toIndentedString(missingVolumes)).append("\n");
    sb.append("    driveCheck: ").append(toIndentedString(driveCheck)).append("\n");
    sb.append("    exclusiveOperations: ").append(toIndentedString(exclusiveOperations)).append("\n");
    sb.append("    failedDrivesPresent: ").append(toIndentedString(failedDrivesPresent)).append("\n");
    sb.append("    validPasswordSet: ").append(toIndentedString(validPasswordSet)).append("\n");
    sb.append("    melCheck: ").append(toIndentedString(melCheck)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

