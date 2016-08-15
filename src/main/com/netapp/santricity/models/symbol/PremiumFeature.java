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
 * PremiumFeature
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PremiumFeature   {
  

  /**
   * This field will contain the value of the premium feature being described.
   */
  public enum CapabilityEnum {
    none("none"),
    sharedVolume("sharedVolume"),
    storagePoolsTo4("storagePoolsTo4"),
    mixedRaidlevel("mixedRaidlevel"),
    autoCodeSync("autoCodeSync"),
    autoLunTransfer("autoLunTransfer"),
    subLunsAllowed("subLunsAllowed"),
    storagePoolsTo8("storagePoolsTo8"),
    storagePoolsTo2("storagePoolsTo2"),
    storagePoolsToMax("storagePoolsToMax"),
    storagePoolsTo64("storagePoolsTo64"),
    storagePoolsTo16("storagePoolsTo16"),
    snapshots("snapshots"),
    remoteMirroring("remoteMirroring"),
    volumeCopy("volumeCopy"),
    stagedDownload("stagedDownload"),
    mixedDriveTypes("mixedDriveTypes"),
    goldKey("goldKey"),
    driveTrayExpansion("driveTrayExpansion"),
    bundleMigration("bundleMigration"),
    storagePoolsTo128("storagePoolsTo128"),
    storagePoolsTo256("storagePoolsTo256"),
    raid6("raid6"),
    performanceTier("performanceTier"),
    storagePoolsTo32("storagePoolsTo32"),
    storagePoolsTo96("storagePoolsTo96"),
    storagePoolsTo192("storagePoolsTo192"),
    storagePoolsTo512("storagePoolsTo512"),
    remoteMirrorsTo16("remoteMirrorsTo16"),
    remoteMirrorsTo32("remoteMirrorsTo32"),
    remoteMirrorsTo64("remoteMirrorsTo64"),
    remoteMirrorsTo128("remoteMirrorsTo128"),
    snapshotsPerVolTo4("snapshotsPerVolTo4"),
    snapshotsPerVolTo8("snapshotsPerVolTo8"),
    snapshotsPerVolTo16("snapshotsPerVolTo16"),
    snapshotsPerVolTo2("snapshotsPerVolTo2"),
    secureVolume("secureVolume"),
    protectionInformation("protectionInformation"),
    ssdSupport("ssdSupport"),
    driveSlotLimitTo112("driveSlotLimitTo112"),
    driveSlotLimitTo120("driveSlotLimitTo120"),
    driveSlotLimitTo256("driveSlotLimitTo256"),
    driveSlotLimitTo448("driveSlotLimitTo448"),
    driveSlotLimitTo480("driveSlotLimitTo480"),
    driveSlotLimitToMax("driveSlotLimitToMax"),
    driveSlotLimit("driveSlotLimit"),
    driveSlotLimitTo12("driveSlotLimitTo12"),
    driveSlotLimitTo16("driveSlotLimitTo16"),
    driveSlotLimitTo24("driveSlotLimitTo24"),
    driveSlotLimitTo32("driveSlotLimitTo32"),
    driveSlotLimitTo48("driveSlotLimitTo48"),
    driveSlotLimitTo60("driveSlotLimitTo60"),
    driveSlotLimitTo64("driveSlotLimitTo64"),
    driveSlotLimitTo72("driveSlotLimitTo72"),
    driveSlotLimitTo96("driveSlotLimitTo96"),
    driveSlotLimitTo128("driveSlotLimitTo128"),
    driveSlotLimitTo136("driveSlotLimitTo136"),
    driveSlotLimitTo144("driveSlotLimitTo144"),
    driveSlotLimitTo180("driveSlotLimitTo180"),
    driveSlotLimitTo192("driveSlotLimitTo192"),
    driveSlotLimitTo272("driveSlotLimitTo272"),
    fdeProxyKeyManagement("fdeProxyKeyManagement"),
    remoteMirrorsTo8("remoteMirrorsTo8"),
    driveSlotLimitTo384("driveSlotLimitTo384"),
    driveSlotLimitTo300("driveSlotLimitTo300"),
    driveSlotLimitTo360("driveSlotLimitTo360"),
    flashReadCache("flashReadCache"),
    storagePoolsType2("storagePoolsType2"),
    remoteMirroringType2("remoteMirroringType2"),
    totalNumberOfArvmMirrorsPerArray("totalNumberOfArvmMirrorsPerArray"),
    totalNumberOfPitsPerArray("totalNumberOfPitsPerArray"),
    totalNumberOfThinVolumesPerArray("totalNumberOfThinVolumesPerArray"),
    driveSlotLimitTo240("driveSlotLimitTo240"),
    snapshotsType2("snapshotsType2"),
    targetPortLunMapping("targetPortLunMapping"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CapabilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CapabilityEnum capability;

    private Boolean isEnabled;

    private Boolean isCompliant;

    private Boolean isWithinLimits;


  /**
   * This field contains the value of the feature ID associated with the feature.
   */
  public enum FeatureIdEnum {
    volumesPerPartition("volumesPerPartition"),
    totalNumberOfVolumes("totalNumberOfVolumes"),
    storagePartitions("storagePartitions"),
    snapshot("snapshot"),
    volumeCopy("volumeCopy"),
    remoteMirroring("remoteMirroring"),
    driveTrayExpansion("driveTrayExpansion"),
    mixedDriveTypes("mixedDriveTypes"),
    mgmtApplication("mgmtApplication"),
    supportedDrives("supportedDrives"),
    supportedDriveTrays("supportedDriveTrays"),
    performanceTier("performanceTier"),
    totalNumberOfSnapshots("totalNumberOfSnapshots"),
    totalNumberOfVolCopies("totalNumberOfVolCopies"),
    goldKey("goldKey"),
    snapshotsPerVolume("snapshotsPerVolume"),
    totalNumberOfMirrors("totalNumberOfMirrors"),
    raid6("raid6"),
    stateCapture("stateCapture"),
    sataStrLen("sataStrLen"),
    secureVolume("secureVolume"),
    protectionInformation("protectionInformation"),
    solidStateDisk("solidStateDisk"),
    driveSlotLimit("driveSlotLimit"),
    fdeProxyKeyManagement("fdeProxyKeyManagement"),
    supportedInterposer("supportedInterposer"),
    vendorSupportedDrives("vendorSupportedDrives"),
    flashReadCache("flashReadCache"),
    totalNumberOfAsyncMirrorGroups("totalNumberOfAsyncMirrorGroups"),
    totalNumberOfAsyncMirrorsPerGroup("totalNumberOfAsyncMirrorsPerGroup"),
    totalNumberOfArvmMirrorsPerArray("totalNumberOfArvmMirrorsPerArray"),
    totalNumberOfPitsPerArray("totalNumberOfPitsPerArray"),
    pitGroupsPerVolume("pitGroupsPerVolume"),
    totalNumberOfPitGroups("totalNumberOfPitGroups"),
    pitsPerPitGroup("pitsPerPitGroup"),
    memberVolsPerPitConsistencyGroup("memberVolsPerPitConsistencyGroup"),
    totalNumberOfPitConsistencyGroups("totalNumberOfPitConsistencyGroups"),
    totalNumberOfPitViews("totalNumberOfPitViews"),
    totalNumberOfThinVolumesPerArray("totalNumberOfThinVolumesPerArray"),
    nativeSataDriveSupport("nativeSataDriveSupport"),
    solidStateDiskLimit("solidStateDiskLimit"),
    totalNumberOfRemoteMirrorsPerArray("totalNumberOfRemoteMirrorsPerArray"),
    asup("asup"),
    ectSelector("ectSelector"),
    embeddedSnmpOid("embeddedSnmpOid"),
    asupOnDemand("asupOnDemand"),
    dacstoreCompatId("dacstoreCompatId"),
    samoaHicProtocol("samoaHicProtocol"),
    targetPortLunMapping("targetPortLunMapping"),
    hildaBaseboardProtocol("hildaBaseboardProtocol"),
    denali2Protocol("denali2Protocol"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FeatureIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FeatureIdEnum featureId;

  
  /**
   * This field will contain the value of the premium feature being described.
   **/
  public PremiumFeature capability(CapabilityEnum capability) {
    this.capability = capability;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field will contain the value of the premium feature being described.")
  @JsonProperty("capability")
  public CapabilityEnum getCapability() {
    return capability;
  }
  
  public void setCapability(CapabilityEnum capability) {
    this.capability = capability;
  }

  
  /**
   * A true value in this field indicates that the feature is enabled (regardless of compliance)
   **/
  public PremiumFeature isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true value in this field indicates that the feature is enabled (regardless of compliance)")
  @JsonProperty("isEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }
  
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  
  /**
   * A true value in this field indicates that the feature has been purchased (in compliance). A false value indicates that the feature has not been purchased. The user will receive warning messages indicating that they are not in compliance. The warning message will continue until the feature is purchased or the feature is disabled.
   **/
  public PremiumFeature isCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true value in this field indicates that the feature has been purchased (in compliance). A false value indicates that the feature has not been purchased. The user will receive warning messages indicating that they are not in compliance. The warning message will continue until the feature is purchased or the feature is disabled.")
  @JsonProperty("isCompliant")
  public Boolean getIsCompliant() {
    return isCompliant;
  }
  
  public void setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
  }

  
  /**
   * A true value in this field indicates that the feature has been purchased and the subsystem configuration does not exceed the feature options specified at purchase. A false value in this field indicates that the feature has been purchased but new subsystem configuration has caused the user to exceed the feature options that were purchased. The user will receive warning messages indicating that they are no longer in compliance. The user can change the subsystem configuration so that it is in compliance with feature options or the user can purchase additional feature options so that the subsystem is again in compliance. The warning messages will continue until the feature is again in compliance or is disabled.
   **/
  public PremiumFeature isWithinLimits(Boolean isWithinLimits) {
    this.isWithinLimits = isWithinLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true value in this field indicates that the feature has been purchased and the subsystem configuration does not exceed the feature options specified at purchase. A false value in this field indicates that the feature has been purchased but new subsystem configuration has caused the user to exceed the feature options that were purchased. The user will receive warning messages indicating that they are no longer in compliance. The user can change the subsystem configuration so that it is in compliance with feature options or the user can purchase additional feature options so that the subsystem is again in compliance. The warning messages will continue until the feature is again in compliance or is disabled.")
  @JsonProperty("isWithinLimits")
  public Boolean getIsWithinLimits() {
    return isWithinLimits;
  }
  
  public void setIsWithinLimits(Boolean isWithinLimits) {
    this.isWithinLimits = isWithinLimits;
  }

  
  /**
   * This field contains the value of the feature ID associated with the feature.
   **/
  public PremiumFeature featureId(FeatureIdEnum featureId) {
    this.featureId = featureId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the value of the feature ID associated with the feature.")
  @JsonProperty("featureId")
  public FeatureIdEnum getFeatureId() {
    return featureId;
  }
  
  public void setFeatureId(FeatureIdEnum featureId) {
    this.featureId = featureId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumFeature premiumFeature = (PremiumFeature) o;
    return Objects.equals(this.capability, premiumFeature.capability) &&
        Objects.equals(this.isEnabled, premiumFeature.isEnabled) &&
        Objects.equals(this.isCompliant, premiumFeature.isCompliant) &&
        Objects.equals(this.isWithinLimits, premiumFeature.isWithinLimits) &&
        Objects.equals(this.featureId, premiumFeature.featureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, isEnabled, isCompliant, isWithinLimits, featureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumFeature {\n");
    
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isCompliant: ").append(toIndentedString(isCompliant)).append("\n");
    sb.append("    isWithinLimits: ").append(toIndentedString(isWithinLimits)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
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

