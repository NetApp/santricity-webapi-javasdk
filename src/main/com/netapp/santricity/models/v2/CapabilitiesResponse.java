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
 * Information on StorageSystem capabilities, features, and limits.
 */
@ApiModel(description = "Information on StorageSystem capabilities, features, and limits.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class CapabilitiesResponse   {
  
    private FeatureBundle featureBundle;


  /**
   * Gets or Sets capabilities
   */
  public enum CapabilitiesEnum {
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

    CapabilitiesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<CapabilitiesEnum> capabilities;


  /**
   * Gets or Sets productCapabilities
   */
  public enum ProductCapabilitiesEnum {
    capabilityNone("capabilityNone"),
    capabilityCacheBackup("capabilityCacheBackup"),
    capabilityCoreIscsi("capabilityCoreIscsi"),
    capabilityDap520b("capabilityDap520b"),
    capabilityDualPortedSata("capabilityDualPortedSata"),
    capabilityFdeDriveSupport("capabilityFdeDriveSupport"),
    capabilityFieldRepCacheMem("capabilityFieldRepCacheMem"),
    capabilityGbEthMgmtPort("capabilityGbEthMgmtPort"),
    capabilityInfinibandSupport("capabilityInfinibandSupport"),
    capabilityIpv6MgmtPortIpv6("capabilityIpv6MgmtPortIpv6"),
    capabilityIscsiIpv6("capabilityIscsiIpv6"),
    capabilitySasSupport("capabilitySasSupport"),
    capabilitySimplex("capabilitySimplex"),
    capabilitySmartBatteryMgmt("capabilitySmartBatteryMgmt"),
    capabilityCal6141("capabilityCal6141"),
    capabilityCal6334("capabilityCal6334"),
    capabilityCfgDbAdoption("capabilityCfgDbAdoption"),
    capabilityCtrlLockdown("capabilityCtrlLockdown"),
    capabilityCtrlStateCapture("capabilityCtrlStateCapture"),
    capabilityDiagDataCapture("capabilityDiagDataCapture"),
    capabilityDriveDataRelocation("capabilityDriveDataRelocation"),
    capabilityDriveEnclosureMiswires("capabilityDriveEnclosureMiswires"),
    capabilityDriveMgmt("capabilityDriveMgmt"),
    capabilityDriveMixWithinTray("capabilityDriveMixWithinTray"),
    capabilityDrvChannelDiags("capabilityDrvChannelDiags"),
    capabilityFeatureBundles("capabilityFeatureBundles"),
    capabilityHostContextAgent("capabilityHostContextAgent"),
    capabilityImmediateHostTopology("capabilityImmediateHostTopology"),
    capabilityOnlineDrvFwDwnld("capabilityOnlineDrvFwDwnld"),
    capabilityParentRelativeLocation("capabilityParentRelativeLocation"),
    capabilityParentRelativeStatus("capabilityParentRelativeStatus"),
    capabilityPompanoSupport("capabilityPompanoSupport"),
    capabilityRaid6("capabilityRaid6"),
    capabilitySocStatistics("capabilitySocStatistics"),
    capabilitySupportsVirtualization("capabilitySupportsVirtualization"),
    capabilityT10("capabilityT10"),
    capabilityInfusion("capabilityInfusion"),
    capabilityDriveLimitManagement("capabilityDriveLimitManagement"),
    capabilitySfpPlus("capabilitySfpPlus"),
    capabilityIscsi10gbHostCard("capabilityIscsi10gbHostCard"),
    capabilityEnhancedLun0Support("capabilityEnhancedLun0Support"),
    capabilityEnhancedFormatUnitSupport("capabilityEnhancedFormatUnitSupport"),
    capabilityDriveSideTrunkSupport("capabilityDriveSideTrunkSupport"),
    capabilitySsdSupport("capabilitySsdSupport"),
    capabilityBaseControllerDiags("capabilityBaseControllerDiags"),
    capabilityCacheMemoryDiags("capabilityCacheMemoryDiags"),
    capabilityDriveSlotLimit("capabilityDriveSlotLimit"),
    capabilityFdeProxyKeyMgmt("capabilityFdeProxyKeyMgmt"),
    capabilityIosSupport("capabilityIosSupport"),
    capabilityLockout2tbDrives("capabilityLockout2tbDrives"),
    capabilityParentRelativeMel("capabilityParentRelativeMel"),
    capabilityRaid6PrereadRedCheck("capabilityRaid6PrereadRedCheck"),
    capabilitySataDriveLockout("capabilitySataDriveLockout"),
    capabilitySyslogMsgs("capabilitySyslogMsgs"),
    capabilityWembleyEnclosure("capabilityWembleyEnclosure"),
    capabilityCacheBackupDeviceDiags("capabilityCacheBackupDeviceDiags"),
    capabilityHicDiags("capabilityHicDiags"),
    capabilitySetTrayAttributes("capabilitySetTrayAttributes"),
    capabilityIscsiTarget("capabilityIscsiTarget"),
    capabilityIscsiInitiator("capabilityIscsiInitiator"),
    capabilityPsuFirmwareUpdate("capabilityPsuFirmwareUpdate"),
    capabilityDplCoreDump("capabilityDplCoreDump"),
    capabilityDiskPools("capabilityDiskPools"),
    capabilityAsupSupport("capabilityAsupSupport"),
    capabilityEmbeddedSnmpAgent("capabilityEmbeddedSnmpAgent"),
    capabilityFtdcTraceHistory("capabilityFtdcTraceHistory"),
    capabilityAdvancedFormatSupport("capabilityAdvancedFormatSupport"),
    capability4knativeAdvancedFormatSupport("capability4knativeAdvancedFormatSupport"),
    capabilityAsupOnDemandSupport("capabilityAsupOnDemandSupport"),
    capabilityIocDump("capabilityIocDump"),
    capabilityDrivePowerCycle("capabilityDrivePowerCycle"),
    capabilityLowAndHighSampling("capabilityLowAndHighSampling"),
    capabilityAutoLoadBalancing("capabilityAutoLoadBalancing"),
    capabilityWlcLogging("capabilityWlcLogging"),
    capabilityFipsDriveSupport("capabilityFipsDriveSupport"),
    capabilityApplicationAwareness("capabilityApplicationAwareness"),
    capabilityEmbeddedEkms("capabilityEmbeddedEkms"),
    capabilityCacheMirroringProtectionInformation("capabilityCacheMirroringProtectionInformation"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ProductCapabilitiesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<ProductCapabilitiesEnum> productCapabilities;

    private List<FeatureState> featureStates;

    private StorageSystemAttributes storageSystemAttributes;

    private FeatureParams featureParameters;

  
  /**
   **/
  public CapabilitiesResponse featureBundle(FeatureBundle featureBundle) {
    this.featureBundle = featureBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("featureBundle")
  public FeatureBundle getFeatureBundle() {
    return featureBundle;
  }
  
  public void setFeatureBundle(FeatureBundle featureBundle) {
    this.featureBundle = featureBundle;
  }

  
  /**
   **/
  public CapabilitiesResponse capabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("capabilities")
  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }
  
  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }

  
  /**
   **/
  public CapabilitiesResponse productCapabilities(List<ProductCapabilitiesEnum> productCapabilities) {
    this.productCapabilities = productCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("productCapabilities")
  public List<ProductCapabilitiesEnum> getProductCapabilities() {
    return productCapabilities;
  }
  
  public void setProductCapabilities(List<ProductCapabilitiesEnum> productCapabilities) {
    this.productCapabilities = productCapabilities;
  }

  
  /**
   **/
  public CapabilitiesResponse featureStates(List<FeatureState> featureStates) {
    this.featureStates = featureStates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("featureStates")
  public List<FeatureState> getFeatureStates() {
    return featureStates;
  }
  
  public void setFeatureStates(List<FeatureState> featureStates) {
    this.featureStates = featureStates;
  }

  
  /**
   * Configuration parameters, constants, and other useful information for clients that may vary between storage-systems.
   **/
  public CapabilitiesResponse storageSystemAttributes(StorageSystemAttributes storageSystemAttributes) {
    this.storageSystemAttributes = storageSystemAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configuration parameters, constants, and other useful information for clients that may vary between storage-systems.")
  @JsonProperty("storageSystemAttributes")
  public StorageSystemAttributes getStorageSystemAttributes() {
    return storageSystemAttributes;
  }
  
  public void setStorageSystemAttributes(StorageSystemAttributes storageSystemAttributes) {
    this.storageSystemAttributes = storageSystemAttributes;
  }

  
  /**
   **/
  public CapabilitiesResponse featureParameters(FeatureParams featureParameters) {
    this.featureParameters = featureParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("featureParameters")
  public FeatureParams getFeatureParameters() {
    return featureParameters;
  }
  
  public void setFeatureParameters(FeatureParams featureParameters) {
    this.featureParameters = featureParameters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapabilitiesResponse capabilitiesResponse = (CapabilitiesResponse) o;
    return Objects.equals(this.featureBundle, capabilitiesResponse.featureBundle) &&
        Objects.equals(this.capabilities, capabilitiesResponse.capabilities) &&
        Objects.equals(this.productCapabilities, capabilitiesResponse.productCapabilities) &&
        Objects.equals(this.featureStates, capabilitiesResponse.featureStates) &&
        Objects.equals(this.storageSystemAttributes, capabilitiesResponse.storageSystemAttributes) &&
        Objects.equals(this.featureParameters, capabilitiesResponse.featureParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureBundle, capabilities, productCapabilities, featureStates, storageSystemAttributes, featureParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilitiesResponse {\n");
    
    sb.append("    featureBundle: ").append(toIndentedString(featureBundle)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    productCapabilities: ").append(toIndentedString(productCapabilities)).append("\n");
    sb.append("    featureStates: ").append(toIndentedString(featureStates)).append("\n");
    sb.append("    storageSystemAttributes: ").append(toIndentedString(storageSystemAttributes)).append("\n");
    sb.append("    featureParameters: ").append(toIndentedString(featureParameters)).append("\n");
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

