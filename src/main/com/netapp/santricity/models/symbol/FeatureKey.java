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
 * FeatureKey
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class FeatureKey   {
  
    private Integer keyVersion;


  /**
   * The capability code for the feature that is to be enabled by this key.
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

    private SAIdentifier saId;

    private String digest;

    private Integer limit;

    private Integer duration;

    private String keyId;

    private Integer supportedFeatureBundleId;

  
  /**
   * An internal indication of the version of the feature key.
   **/
  public FeatureKey keyVersion(Integer keyVersion) {
    this.keyVersion = keyVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An internal indication of the version of the feature key.")
  @JsonProperty("keyVersion")
  public Integer getKeyVersion() {
    return keyVersion;
  }
  
  public void setKeyVersion(Integer keyVersion) {
    this.keyVersion = keyVersion;
  }

  
  /**
   * The capability code for the feature that is to be enabled by this key.
   **/
  public FeatureKey capability(CapabilityEnum capability) {
    this.capability = capability;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capability code for the feature that is to be enabled by this key.")
  @JsonProperty("capability")
  public CapabilityEnum getCapability() {
    return capability;
  }
  
  public void setCapability(CapabilityEnum capability) {
    this.capability = capability;
  }

  
  /**
   * This field contains a unique identifier maintained by SAFE for use by storage management software. Storage management software uses this data to enable SAFE features and perform Feature Bundle migration.
   **/
  public FeatureKey saId(SAIdentifier saId) {
    this.saId = saId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains a unique identifier maintained by SAFE for use by storage management software. Storage management software uses this data to enable SAFE features and perform Feature Bundle migration.")
  @JsonProperty("saId")
  public SAIdentifier getSaId() {
    return saId;
  }
  
  public void setSaId(SAIdentifier saId) {
    this.saId = saId;
  }

  
  /**
   * A computed message digest that verifies the authenticity of this feature key.
   **/
  public FeatureKey digest(String digest) {
    this.digest = digest;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A computed message digest that verifies the authenticity of this feature key.")
  @JsonProperty("digest")
  public String getDigest() {
    return digest;
  }
  
  public void setDigest(String digest) {
    this.digest = digest;
  }

  
  /**
   * The numeric limit for this specific feature. A zero value for a limit indicates a feature that is fully enabled and does not support tiers such as RAID 6.
   **/
  public FeatureKey limit(Integer limit) {
    this.limit = limit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The numeric limit for this specific feature. A zero value for a limit indicates a feature that is fully enabled and does not support tiers such as RAID 6.")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  
  /**
   * The duration before this feature is expired. An evaluation period is specified in days. A zero value for an evaluation period indicates a permanent license that has been purchased.
   **/
  public FeatureKey duration(Integer duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The duration before this feature is expired. An evaluation period is specified in days. A zero value for an evaluation period indicates a permanent license that has been purchased.")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * For an additive license this will be the Key ID.
   **/
  public FeatureKey keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "For an additive license this will be the Key ID.")
  @JsonProperty("keyId")
  public String getKeyId() {
    return keyId;
  }
  
  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  
  /**
   * The supported Feature Bundle ID. When not in use this value will be zero.
   **/
  public FeatureKey supportedFeatureBundleId(Integer supportedFeatureBundleId) {
    this.supportedFeatureBundleId = supportedFeatureBundleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The supported Feature Bundle ID. When not in use this value will be zero.")
  @JsonProperty("supportedFeatureBundleId")
  public Integer getSupportedFeatureBundleId() {
    return supportedFeatureBundleId;
  }
  
  public void setSupportedFeatureBundleId(Integer supportedFeatureBundleId) {
    this.supportedFeatureBundleId = supportedFeatureBundleId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureKey featureKey = (FeatureKey) o;
    return Objects.equals(this.keyVersion, featureKey.keyVersion) &&
        Objects.equals(this.capability, featureKey.capability) &&
        Objects.equals(this.saId, featureKey.saId) &&
        Objects.equals(this.digest, featureKey.digest) &&
        Objects.equals(this.limit, featureKey.limit) &&
        Objects.equals(this.duration, featureKey.duration) &&
        Objects.equals(this.keyId, featureKey.keyId) &&
        Objects.equals(this.supportedFeatureBundleId, featureKey.supportedFeatureBundleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyVersion, capability, saId, digest, limit, duration, keyId, supportedFeatureBundleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureKey {\n");
    
    sb.append("    keyVersion: ").append(toIndentedString(keyVersion)).append("\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    saId: ").append(toIndentedString(saId)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    supportedFeatureBundleId: ").append(toIndentedString(supportedFeatureBundleId)).append("\n");
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

