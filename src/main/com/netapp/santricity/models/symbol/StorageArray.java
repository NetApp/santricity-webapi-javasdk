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
 * StorageArray
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class StorageArray   {
  
    private SAData saData;

    private SAIdentifier safeId;

    private SACache cache;

    private AccessVolume accessVolume;

    private FeatureParams featureParameters;

    private Integer mediaScanPeriod;


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

    private List<PremiumFeature> premiumFeatures;

    private TrayPositionList trayPositionList;

    private List<String> hostPortType;

    private List<HostSpecificValues> hostSpecificVals;

    private List<CompatibleFirmware> compatibility;

    private List<VolumeUsageHint> usageHints;

    private Integer definedPartitionCount;

    private Integer defaultHostPortTypeIndex;

    private String remoteAccessID;

    private Boolean remoteMirroringActive;

    private Integer volXferAlertDelayPeriod;

    private String reserved1;

    private String reserved2;

    private StagedFirmware stagedFirmware;

    private UnreadableSectors unreadableSectors;

    private List<DriveChannel> driveChannels;

    private List<DriveChannelPort> portLocations;

    private Integer ddcTag;

    private FeatureBundle featureBundle;

    private List<FeatureState> featureState;

    private List<ChannelPort> channelPortLocations;

    private IscsiEntityData iscsiEntityData;

    private List<String> hostType;

    private Integer defaultHostTypeIndex;

    private Integer rvmControllerHostChannel;

    private SmartBatteryData smartBatteryData;

    private Boolean invalidSystemConfig;

    private Boolean securityLockKey;

    private String lockKeyIDRef;

    private SyslogConfiguration syslogConfiguration;

    private Boolean securityExternalKmsEnable;

    private Integer newKeySequence;


  /**
   * The controller's current key status. If external key management not enabled, set to EXTERNAL_KMS_KEY_STATUS_OK.
   */
  public enum SecurityExternalKmsKeyStatusEnum {
    ok("ok"),
    keyNeeded("keyNeeded"),
    newKeyNeeded("newKeyNeeded"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SecurityExternalKmsKeyStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SecurityExternalKmsKeyStatusEnum securityExternalKmsKeyStatus;

    private List<String> lockKeyNeededList;

    private DPLCoreDumpData dplCoreDumpData;


  /**
   * Indicator of whether fibre channel remote mirroring has been enabled, and if so, whether it is enabled for use by legacy (synchronous) mirroring or ARVM. If this is set to something other than FC_MIRROR_STATE_DISABLED or FC_MIRROR_STATE_UNKNOWN, then the rvmControllerHostChannel field can be used to determine the particular host channel reserved for remote mirroring.
   */
  public enum FcRVMStateEnum {
    unknown("unknown"),
    disabled("disabled"),
    enabledLegacyRvm("enabledLegacyRvm"),
    enabledArvm("enabledArvm"),
    enabledAll("enabledAll"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FcRVMStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FcRVMStateEnum fcRVMState;

    private Boolean asupEnabled;

    private Boolean asupOnDemandEnabled;

    private Boolean asupRemoteDiagsEnabled;

    private IOCDumpData iocDumpData;

    private Boolean driveChannelPortDisabled;

    private Boolean directExpansionPortInUse;

    private Boolean highResolutionStatisticsEnabled;

    private Boolean autoLoadBalancingEnabled;

    private Boolean vaaienabled;

    private Boolean odxenabled;

  
  /**
   * General information and characteristics of the storage array.
   **/
  public StorageArray saData(SAData saData) {
    this.saData = saData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "General information and characteristics of the storage array.")
  @JsonProperty("saData")
  public SAData getSaData() {
    return saData;
  }
  
  public void setSaData(SAData saData) {
    this.saData = saData;
  }

  
  /**
   * This field contains a unique identifier maintained by SAFE for use by storage management software. Storage management software uses this data to enable SAFE features and perform Feature Bundle migration.
   **/
  public StorageArray safeId(SAIdentifier safeId) {
    this.safeId = safeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains a unique identifier maintained by SAFE for use by storage management software. Storage management software uses this data to enable SAFE features and perform Feature Bundle migration.")
  @JsonProperty("safeId")
  public SAIdentifier getSafeId() {
    return safeId;
  }
  
  public void setSafeId(SAIdentifier safeId) {
    this.safeId = safeId;
  }

  
  /**
   * Information about cache settings that apply to the storage array as a whole.
   **/
  public StorageArray cache(SACache cache) {
    this.cache = cache;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about cache settings that apply to the storage array as a whole.")
  @JsonProperty("cache")
  public SACache getCache() {
    return cache;
  }
  
  public void setCache(SACache cache) {
    this.cache = cache;
  }

  
  /**
   * Information about the access volume that is used to convey configuration commands (via the UTM protocol) to the controllers within the storage array.
   **/
  public StorageArray accessVolume(AccessVolume accessVolume) {
    this.accessVolume = accessVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the access volume that is used to convey configuration commands (via the UTM protocol) to the controllers within the storage array.")
  @JsonProperty("accessVolume")
  public AccessVolume getAccessVolume() {
    return accessVolume;
  }
  
  public void setAccessVolume(AccessVolume accessVolume) {
    this.accessVolume = accessVolume;
  }

  
  /**
   * An object that provides information about the parameters and limits of certain functions that are supported by the controllers that reside within the storage array.
   **/
  public StorageArray featureParameters(FeatureParams featureParameters) {
    this.featureParameters = featureParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An object that provides information about the parameters and limits of certain functions that are supported by the controllers that reside within the storage array.")
  @JsonProperty("featureParameters")
  public FeatureParams getFeatureParameters() {
    return featureParameters;
  }
  
  public void setFeatureParameters(FeatureParams featureParameters) {
    this.featureParameters = featureParameters;
  }

  
  /**
   * The current value of the media scan period parameter for the storage array. This value indicates the number of days over which a complete scan of the media will occur. The array controller(s) will attempt to achieve this configured period on a best-effort basis, but certain operational factors may cause slight deviations from the configured value.
   **/
  public StorageArray mediaScanPeriod(Integer mediaScanPeriod) {
    this.mediaScanPeriod = mediaScanPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current value of the media scan period parameter for the storage array. This value indicates the number of days over which a complete scan of the media will occur. The array controller(s) will attempt to achieve this configured period on a best-effort basis, but certain operational factors may cause slight deviations from the configured value.")
  @JsonProperty("mediaScanPeriod")
  public Integer getMediaScanPeriod() {
    return mediaScanPeriod;
  }
  
  public void setMediaScanPeriod(Integer mediaScanPeriod) {
    this.mediaScanPeriod = mediaScanPeriod;
  }

  
  /**
   * A variable-length array that provides an enumeration of the high-level capabilities that are supported by the controllers that reside within the storage array.
   **/
  public StorageArray capabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array that provides an enumeration of the high-level capabilities that are supported by the controllers that reside within the storage array.")
  @JsonProperty("capabilities")
  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }
  
  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }

  
  /**
   * An object that provides information about the premium features that are currently enabled. This field is deprecated. The featureBundle and featureState fields can be used in its place to obtain information about how features are defined and the state they are in.
   **/
  public StorageArray premiumFeatures(List<PremiumFeature> premiumFeatures) {
    this.premiumFeatures = premiumFeatures;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An object that provides information about the premium features that are currently enabled. This field is deprecated. The featureBundle and featureState fields can be used in its place to obtain information about how features are defined and the state they are in.")
  @JsonProperty("premiumFeatures")
  public List<PremiumFeature> getPremiumFeatures() {
    return premiumFeatures;
  }
  
  public void setPremiumFeatures(List<PremiumFeature> premiumFeatures) {
    this.premiumFeatures = premiumFeatures;
  }

  
  /**
   * A list of tray positions that provides information to the client of the SYMbol interface about the relative physical positions of the trays (i.e. enclosures) that comprise the storage array. In the current implementation of the SYMbol interface, the client is responsible for providing this information to the controller for long-term storage, and also for retrieving it from the controller via this object. That is, the controller does not initially contain a valid tray position list; in fact, the default is an empty list. The client is responsible for obtaining any pertinent information about tray positions via an appropriate external mechanism, and then informing the controller about it via the setSATrayPositions procedure. Once this is done, the controller will always return the position information as part of the StorageArray object.
   **/
  public StorageArray trayPositionList(TrayPositionList trayPositionList) {
    this.trayPositionList = trayPositionList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of tray positions that provides information to the client of the SYMbol interface about the relative physical positions of the trays (i.e. enclosures) that comprise the storage array. In the current implementation of the SYMbol interface, the client is responsible for providing this information to the controller for long-term storage, and also for retrieving it from the controller via this object. That is, the controller does not initially contain a valid tray position list; in fact, the default is an empty list. The client is responsible for obtaining any pertinent information about tray positions via an appropriate external mechanism, and then informing the controller about it via the setSATrayPositions procedure. Once this is done, the controller will always return the position information as part of the StorageArray object.")
  @JsonProperty("trayPositionList")
  public TrayPositionList getTrayPositionList() {
    return trayPositionList;
  }
  
  public void setTrayPositionList(TrayPositionList trayPositionList) {
    this.trayPositionList = trayPositionList;
  }

  
  /**
   * This variable-length array has label values that provide descriptive strings for each supported index value that can appear in the HostPort object and its associated elements.
   **/
  public StorageArray hostPortType(List<String> hostPortType) {
    this.hostPortType = hostPortType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This variable-length array has label values that provide descriptive strings for each supported index value that can appear in the HostPort object and its associated elements.")
  @JsonProperty("hostPortType")
  public List<String> getHostPortType() {
    return hostPortType;
  }
  
  public void setHostPortType(List<String> hostPortType) {
    this.hostPortType = hostPortType;
  }

  
  /**
   * The values from the heterogeneous host regions. Each element in this array corresponds to a type in the hostPortType array, and the ordering of the types in this array matches that of the hostPortType array, i.e., hostPortType[i] is equal to hostSpecificVals[i].hostPortType.
   **/
  public StorageArray hostSpecificVals(List<HostSpecificValues> hostSpecificVals) {
    this.hostSpecificVals = hostSpecificVals;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The values from the heterogeneous host regions. Each element in this array corresponds to a type in the hostPortType array, and the ordering of the types in this array matches that of the hostPortType array, i.e., hostPortType[i] is equal to hostSpecificVals[i].hostPortType.")
  @JsonProperty("hostSpecificVals")
  public List<HostSpecificValues> getHostSpecificVals() {
    return hostSpecificVals;
  }
  
  public void setHostSpecificVals(List<HostSpecificValues> hostSpecificVals) {
    this.hostSpecificVals = hostSpecificVals;
  }

  
  /**
   * A variable-length array of firmware compatibility specifiers. These values generally identify certain levels of firmware that are allowed for downgrading the current storage array firmware.
   **/
  public StorageArray compatibility(List<CompatibleFirmware> compatibility) {
    this.compatibility = compatibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of firmware compatibility specifiers. These values generally identify certain levels of firmware that are allowed for downgrading the current storage array firmware.")
  @JsonProperty("compatibility")
  public List<CompatibleFirmware> getCompatibility() {
    return compatibility;
  }
  
  public void setCompatibility(List<CompatibleFirmware> compatibility) {
    this.compatibility = compatibility;
  }

  
  /**
   * The recommended usage parameter combinations.
   **/
  public StorageArray usageHints(List<VolumeUsageHint> usageHints) {
    this.usageHints = usageHints;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recommended usage parameter combinations.")
  @JsonProperty("usageHints")
  public List<VolumeUsageHint> getUsageHints() {
    return usageHints;
  }
  
  public void setUsageHints(List<VolumeUsageHint> usageHints) {
    this.usageHints = usageHints;
  }

  
  /**
   * The number of partitions calculated from the user's current mappings.
   **/
  public StorageArray definedPartitionCount(Integer definedPartitionCount) {
    this.definedPartitionCount = definedPartitionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of partitions calculated from the user's current mappings.")
  @JsonProperty("definedPartitionCount")
  public Integer getDefinedPartitionCount() {
    return definedPartitionCount;
  }
  
  public void setDefinedPartitionCount(Integer definedPartitionCount) {
    this.definedPartitionCount = definedPartitionCount;
  }

  
  /**
   * The Host Port Type Index to use for undefined and newly created host ports. The defaultHostPortTypeIndex can only be set if Storage Partitions are disabled through the SYMbol Interface.
   **/
  public StorageArray defaultHostPortTypeIndex(Integer defaultHostPortTypeIndex) {
    this.defaultHostPortTypeIndex = defaultHostPortTypeIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Host Port Type Index to use for undefined and newly created host ports. The defaultHostPortTypeIndex can only be set if Storage Partitions are disabled through the SYMbol Interface.")
  @JsonProperty("defaultHostPortTypeIndex")
  public Integer getDefaultHostPortTypeIndex() {
    return defaultHostPortTypeIndex;
  }
  
  public void setDefaultHostPortTypeIndex(Integer defaultHostPortTypeIndex) {
    this.defaultHostPortTypeIndex = defaultHostPortTypeIndex;
  }

  
  /**
   * Array-specific ID used for remote device discovery.
   **/
  public StorageArray remoteAccessID(String remoteAccessID) {
    this.remoteAccessID = remoteAccessID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Array-specific ID used for remote device discovery.")
  @JsonProperty("remoteAccessID")
  public String getRemoteAccessID() {
    return remoteAccessID;
  }
  
  public void setRemoteAccessID(String remoteAccessID) {
    this.remoteAccessID = remoteAccessID;
  }

  
  /**
   * True if RVM is activated.
   **/
  public StorageArray remoteMirroringActive(Boolean remoteMirroringActive) {
    this.remoteMirroringActive = remoteMirroringActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if RVM is activated.")
  @JsonProperty("remoteMirroringActive")
  public Boolean getRemoteMirroringActive() {
    return remoteMirroringActive;
  }
  
  public void setRemoteMirroringActive(Boolean remoteMirroringActive) {
    this.remoteMirroringActive = remoteMirroringActive;
  }

  
  /**
   * Volume transfer alert delay period.
   **/
  public StorageArray volXferAlertDelayPeriod(Integer volXferAlertDelayPeriod) {
    this.volXferAlertDelayPeriod = volXferAlertDelayPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Volume transfer alert delay period.")
  @JsonProperty("volXferAlertDelayPeriod")
  public Integer getVolXferAlertDelayPeriod() {
    return volXferAlertDelayPeriod;
  }
  
  public void setVolXferAlertDelayPeriod(Integer volXferAlertDelayPeriod) {
    this.volXferAlertDelayPeriod = volXferAlertDelayPeriod;
  }

  
  /**
   **/
  public StorageArray reserved1(String reserved1) {
    this.reserved1 = reserved1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved1")
  public String getReserved1() {
    return reserved1;
  }
  
  public void setReserved1(String reserved1) {
    this.reserved1 = reserved1;
  }

  
  /**
   **/
  public StorageArray reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  
  /**
   * Information on possible staged controller firmware.
   **/
  public StorageArray stagedFirmware(StagedFirmware stagedFirmware) {
    this.stagedFirmware = stagedFirmware;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information on possible staged controller firmware.")
  @JsonProperty("stagedFirmware")
  public StagedFirmware getStagedFirmware() {
    return stagedFirmware;
  }
  
  public void setStagedFirmware(StagedFirmware stagedFirmware) {
    this.stagedFirmware = stagedFirmware;
  }

  
  /**
   * Storage array unreadable sector count and max limit.
   **/
  public StorageArray unreadableSectors(UnreadableSectors unreadableSectors) {
    this.unreadableSectors = unreadableSectors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Storage array unreadable sector count and max limit.")
  @JsonProperty("unreadableSectors")
  public UnreadableSectors getUnreadableSectors() {
    return unreadableSectors;
  }
  
  public void setUnreadableSectors(UnreadableSectors unreadableSectors) {
    this.unreadableSectors = unreadableSectors;
  }

  
  /**
   * A list of drive channel structures.
   **/
  public StorageArray driveChannels(List<DriveChannel> driveChannels) {
    this.driveChannels = driveChannels;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of drive channel structures.")
  @JsonProperty("driveChannels")
  public List<DriveChannel> getDriveChannels() {
    return driveChannels;
  }
  
  public void setDriveChannels(List<DriveChannel> driveChannels) {
    this.driveChannels = driveChannels;
  }

  
  /**
   * A list of drive channel port locations.
   **/
  public StorageArray portLocations(List<DriveChannelPort> portLocations) {
    this.portLocations = portLocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of drive channel port locations.")
  @JsonProperty("portLocations")
  public List<DriveChannelPort> getPortLocations() {
    return portLocations;
  }
  
  public void setPortLocations(List<DriveChannelPort> portLocations) {
    this.portLocations = portLocations;
  }

  
  /**
   * The tag value to be used in retrieving DDC log data. A value of DDC_NULL_TAG indicates there is no DDC log data to retrieve.
   **/
  public StorageArray ddcTag(Integer ddcTag) {
    this.ddcTag = ddcTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The tag value to be used in retrieving DDC log data. A value of DDC_NULL_TAG indicates there is no DDC log data to retrieve.")
  @JsonProperty("ddcTag")
  public Integer getDdcTag() {
    return ddcTag;
  }
  
  public void setDdcTag(Integer ddcTag) {
    this.ddcTag = ddcTag;
  }

  
  /**
   * A structure describing the features and feature limits that are associated with this storage array product.
   **/
  public StorageArray featureBundle(FeatureBundle featureBundle) {
    this.featureBundle = featureBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A structure describing the features and feature limits that are associated with this storage array product.")
  @JsonProperty("featureBundle")
  public FeatureBundle getFeatureBundle() {
    return featureBundle;
  }
  
  public void setFeatureBundle(FeatureBundle featureBundle) {
    this.featureBundle = featureBundle;
  }

  
  /**
   * An array describing the current state of the array feature set - one element in the array per feature. This array is used by host software to track feature licensing compliance. It is populated with all supported features having both a feature ID and a capability code, regardless of their enabled or compliance state. Features that are not supported because of gold key restrictions or because there is no way to enable them (i.e., both SHIPPED_ENABLED and KEY_ENABLED are false) are not in the list.
   **/
  public StorageArray featureState(List<FeatureState> featureState) {
    this.featureState = featureState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array describing the current state of the array feature set - one element in the array per feature. This array is used by host software to track feature licensing compliance. It is populated with all supported features having both a feature ID and a capability code, regardless of their enabled or compliance state. Features that are not supported because of gold key restrictions or because there is no way to enable them (i.e., both SHIPPED_ENABLED and KEY_ENABLED are false) are not in the list.")
  @JsonProperty("featureState")
  public List<FeatureState> getFeatureState() {
    return featureState;
  }
  
  public void setFeatureState(List<FeatureState> featureState) {
    this.featureState = featureState;
  }

  
  /**
   * A list of all channel ports in the storage array, including host channel ports, drive channel ports, and ESM channel ports.
   **/
  public StorageArray channelPortLocations(List<ChannelPort> channelPortLocations) {
    this.channelPortLocations = channelPortLocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of all channel ports in the storage array, including host channel ports, drive channel ports, and ESM channel ports.")
  @JsonProperty("channelPortLocations")
  public List<ChannelPort> getChannelPortLocations() {
    return channelPortLocations;
  }
  
  public void setChannelPortLocations(List<ChannelPort> channelPortLocations) {
    this.channelPortLocations = channelPortLocations;
  }

  
  /**
   * Information about the storage array pertaining to its role as an iSCSI entity.
   **/
  public StorageArray iscsiEntityData(IscsiEntityData iscsiEntityData) {
    this.iscsiEntityData = iscsiEntityData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the storage array pertaining to its role as an iSCSI entity.")
  @JsonProperty("iscsiEntityData")
  public IscsiEntityData getIscsiEntityData() {
    return iscsiEntityData;
  }
  
  public void setIscsiEntityData(IscsiEntityData iscsiEntityData) {
    this.iscsiEntityData = iscsiEntityData;
  }

  
  /**
   * This variable-length array has label values that provide descriptive strings for each supported index value that can appear in the Host object. Zero-length strings are allowed and indicate that the associated host-specific NVSRAM regions have been cleared. This field should be used in place of the deprecated hostPortType field.
   **/
  public StorageArray hostType(List<String> hostType) {
    this.hostType = hostType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This variable-length array has label values that provide descriptive strings for each supported index value that can appear in the Host object. Zero-length strings are allowed and indicate that the associated host-specific NVSRAM regions have been cleared. This field should be used in place of the deprecated hostPortType field.")
  @JsonProperty("hostType")
  public List<String> getHostType() {
    return hostType;
  }
  
  public void setHostType(List<String> hostType) {
    this.hostType = hostType;
  }

  
  /**
   * The Host Type Index to use for undefined and newly created host ports.
   **/
  public StorageArray defaultHostTypeIndex(Integer defaultHostTypeIndex) {
    this.defaultHostTypeIndex = defaultHostTypeIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Host Type Index to use for undefined and newly created host ports.")
  @JsonProperty("defaultHostTypeIndex")
  public Integer getDefaultHostTypeIndex() {
    return defaultHostTypeIndex;
  }
  
  public void setDefaultHostTypeIndex(Integer defaultHostTypeIndex) {
    this.defaultHostTypeIndex = defaultHostTypeIndex;
  }

  
  /**
   * The number (in the range 1 through n, where n is the number of host ports on an individual controller) of the controller host channel that the firmware uses for remote volume mirroring. This field is set to zero when the data is unavailable or not applicable, including when the RVM feature is disabled,
   **/
  public StorageArray rvmControllerHostChannel(Integer rvmControllerHostChannel) {
    this.rvmControllerHostChannel = rvmControllerHostChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number (in the range 1 through n, where n is the number of host ports on an individual controller) of the controller host channel that the firmware uses for remote volume mirroring. This field is set to zero when the data is unavailable or not applicable, including when the RVM feature is disabled,")
  @JsonProperty("rvmControllerHostChannel")
  public Integer getRvmControllerHostChannel() {
    return rvmControllerHostChannel;
  }
  
  public void setRvmControllerHostChannel(Integer rvmControllerHostChannel) {
    this.rvmControllerHostChannel = rvmControllerHostChannel;
  }

  
  /**
   * sub-structure of StorageArray contains info relating to smart battery configuration. Meaningful if the smartBatteryTechnology field in the featureParameters sub-structure is set to true. Moved to the Battery object instead to support per-battery reporting
   **/
  public StorageArray smartBatteryData(SmartBatteryData smartBatteryData) {
    this.smartBatteryData = smartBatteryData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "sub-structure of StorageArray contains info relating to smart battery configuration. Meaningful if the smartBatteryTechnology field in the featureParameters sub-structure is set to true. Moved to the Battery object instead to support per-battery reporting")
  @JsonProperty("smartBatteryData")
  public SmartBatteryData getSmartBatteryData() {
    return smartBatteryData;
  }
  
  public void setSmartBatteryData(SmartBatteryData smartBatteryData) {
    this.smartBatteryData = smartBatteryData;
  }

  
  /**
   * True if the storage array has an invalid system configuration; otherwise false.
   **/
  public StorageArray invalidSystemConfig(Boolean invalidSystemConfig) {
    this.invalidSystemConfig = invalidSystemConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the storage array has an invalid system configuration; otherwise false.")
  @JsonProperty("invalidSystemConfig")
  public Boolean getInvalidSystemConfig() {
    return invalidSystemConfig;
  }
  
  public void setInvalidSystemConfig(Boolean invalidSystemConfig) {
    this.invalidSystemConfig = invalidSystemConfig;
  }

  
  /**
   * A boolean which describes the current state of the lock key. True if the array lock key has been set, otherwise false.
   **/
  public StorageArray securityLockKey(Boolean securityLockKey) {
    this.securityLockKey = securityLockKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A boolean which describes the current state of the lock key. True if the array lock key has been set, otherwise false.")
  @JsonProperty("securityLockKey")
  public Boolean getSecurityLockKey() {
    return securityLockKey;
  }
  
  public void setSecurityLockKey(Boolean securityLockKey) {
    this.securityLockKey = securityLockKey;
  }

  
  /**
   * The lock key ID for the storage array.
   **/
  public StorageArray lockKeyIDRef(String lockKeyIDRef) {
    this.lockKeyIDRef = lockKeyIDRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The lock key ID for the storage array.")
  @JsonProperty("lockKeyIDRef")
  public String getLockKeyIDRef() {
    return lockKeyIDRef;
  }
  
  public void setLockKeyIDRef(String lockKeyIDRef) {
    this.lockKeyIDRef = lockKeyIDRef;
  }

  
  /**
   * This field contains the configuration information used by the storage array for writing MEL events to a syslog server.
   **/
  public StorageArray syslogConfiguration(SyslogConfiguration syslogConfiguration) {
    this.syslogConfiguration = syslogConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the configuration information used by the storage array for writing MEL events to a syslog server.")
  @JsonProperty("syslogConfiguration")
  public SyslogConfiguration getSyslogConfiguration() {
    return syslogConfiguration;
  }
  
  public void setSyslogConfiguration(SyslogConfiguration syslogConfiguration) {
    this.syslogConfiguration = syslogConfiguration;
  }

  
  /**
   * True if external key management is in effect and false if controller is using local key management.
   **/
  public StorageArray securityExternalKmsEnable(Boolean securityExternalKmsEnable) {
    this.securityExternalKmsEnable = securityExternalKmsEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if external key management is in effect and false if controller is using local key management.")
  @JsonProperty("securityExternalKmsEnable")
  public Boolean getSecurityExternalKmsEnable() {
    return securityExternalKmsEnable;
  }
  
  public void setSecurityExternalKmsEnable(Boolean securityExternalKmsEnable) {
    this.securityExternalKmsEnable = securityExternalKmsEnable;
  }

  
  /**
   * Sequence number used to serialize installNewKey requests from multiple proxy key management SYMbol servers.
   **/
  public StorageArray newKeySequence(Integer newKeySequence) {
    this.newKeySequence = newKeySequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sequence number used to serialize installNewKey requests from multiple proxy key management SYMbol servers.")
  @JsonProperty("newKeySequence")
  public Integer getNewKeySequence() {
    return newKeySequence;
  }
  
  public void setNewKeySequence(Integer newKeySequence) {
    this.newKeySequence = newKeySequence;
  }

  
  /**
   * The controller's current key status. If external key management not enabled, set to EXTERNAL_KMS_KEY_STATUS_OK.
   **/
  public StorageArray securityExternalKmsKeyStatus(SecurityExternalKmsKeyStatusEnum securityExternalKmsKeyStatus) {
    this.securityExternalKmsKeyStatus = securityExternalKmsKeyStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller's current key status. If external key management not enabled, set to EXTERNAL_KMS_KEY_STATUS_OK.")
  @JsonProperty("securityExternalKmsKeyStatus")
  public SecurityExternalKmsKeyStatusEnum getSecurityExternalKmsKeyStatus() {
    return securityExternalKmsKeyStatus;
  }
  
  public void setSecurityExternalKmsKeyStatus(SecurityExternalKmsKeyStatusEnum securityExternalKmsKeyStatus) {
    this.securityExternalKmsKeyStatus = securityExternalKmsKeyStatus;
  }

  
  /**
   * Contains the lock key IDs of keys needed by the array controller.
   **/
  public StorageArray lockKeyNeededList(List<String> lockKeyNeededList) {
    this.lockKeyNeededList = lockKeyNeededList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains the lock key IDs of keys needed by the array controller.")
  @JsonProperty("lockKeyNeededList")
  public List<String> getLockKeyNeededList() {
    return lockKeyNeededList;
  }
  
  public void setLockKeyNeededList(List<String> lockKeyNeededList) {
    this.lockKeyNeededList = lockKeyNeededList;
  }

  
  /**
   * Information about a core dump in controller memory, if one exists.
   **/
  public StorageArray dplCoreDumpData(DPLCoreDumpData dplCoreDumpData) {
    this.dplCoreDumpData = dplCoreDumpData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about a core dump in controller memory, if one exists.")
  @JsonProperty("dplCoreDumpData")
  public DPLCoreDumpData getDplCoreDumpData() {
    return dplCoreDumpData;
  }
  
  public void setDplCoreDumpData(DPLCoreDumpData dplCoreDumpData) {
    this.dplCoreDumpData = dplCoreDumpData;
  }

  
  /**
   * Indicator of whether fibre channel remote mirroring has been enabled, and if so, whether it is enabled for use by legacy (synchronous) mirroring or ARVM. If this is set to something other than FC_MIRROR_STATE_DISABLED or FC_MIRROR_STATE_UNKNOWN, then the rvmControllerHostChannel field can be used to determine the particular host channel reserved for remote mirroring.
   **/
  public StorageArray fcRVMState(FcRVMStateEnum fcRVMState) {
    this.fcRVMState = fcRVMState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicator of whether fibre channel remote mirroring has been enabled, and if so, whether it is enabled for use by legacy (synchronous) mirroring or ARVM. If this is set to something other than FC_MIRROR_STATE_DISABLED or FC_MIRROR_STATE_UNKNOWN, then the rvmControllerHostChannel field can be used to determine the particular host channel reserved for remote mirroring.")
  @JsonProperty("fcRVMState")
  public FcRVMStateEnum getFcRVMState() {
    return fcRVMState;
  }
  
  public void setFcRVMState(FcRVMStateEnum fcRVMState) {
    this.fcRVMState = fcRVMState;
  }

  
  /**
   * True if Autosupport is enabled.
   **/
  public StorageArray asupEnabled(Boolean asupEnabled) {
    this.asupEnabled = asupEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if Autosupport is enabled.")
  @JsonProperty("asupEnabled")
  public Boolean getAsupEnabled() {
    return asupEnabled;
  }
  
  public void setAsupEnabled(Boolean asupEnabled) {
    this.asupEnabled = asupEnabled;
  }

  
  /**
   * True if Autosupport On Demand is enabled.
   **/
  public StorageArray asupOnDemandEnabled(Boolean asupOnDemandEnabled) {
    this.asupOnDemandEnabled = asupOnDemandEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if Autosupport On Demand is enabled.")
  @JsonProperty("asupOnDemandEnabled")
  public Boolean getAsupOnDemandEnabled() {
    return asupOnDemandEnabled;
  }
  
  public void setAsupOnDemandEnabled(Boolean asupOnDemandEnabled) {
    this.asupOnDemandEnabled = asupOnDemandEnabled;
  }

  
  /**
   * True if Autosupport On Demand Remote Diagnostics is enabled.
   **/
  public StorageArray asupRemoteDiagsEnabled(Boolean asupRemoteDiagsEnabled) {
    this.asupRemoteDiagsEnabled = asupRemoteDiagsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if Autosupport On Demand Remote Diagnostics is enabled.")
  @JsonProperty("asupRemoteDiagsEnabled")
  public Boolean getAsupRemoteDiagsEnabled() {
    return asupRemoteDiagsEnabled;
  }
  
  public void setAsupRemoteDiagsEnabled(Boolean asupRemoteDiagsEnabled) {
    this.asupRemoteDiagsEnabled = asupRemoteDiagsEnabled;
  }

  
  /**
   * Information about an IOC Dump in controller memory, if one exists.
   **/
  public StorageArray iocDumpData(IOCDumpData iocDumpData) {
    this.iocDumpData = iocDumpData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about an IOC Dump in controller memory, if one exists.")
  @JsonProperty("iocDumpData")
  public IOCDumpData getIocDumpData() {
    return iocDumpData;
  }
  
  public void setIocDumpData(IOCDumpData iocDumpData) {
    this.iocDumpData = iocDumpData;
  }

  
  /**
   * True if one or more drive channel ports have been disabled by the controllers to protect against faulty expansion cabling. This could have been necessitated by a miswire condition or by a bad expansion cable. Check the Recovery Events for an indication of which connection(s) have been disabled and correct the cabling as required.
   **/
  public StorageArray driveChannelPortDisabled(Boolean driveChannelPortDisabled) {
    this.driveChannelPortDisabled = driveChannelPortDisabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if one or more drive channel ports have been disabled by the controllers to protect against faulty expansion cabling. This could have been necessitated by a miswire condition or by a bad expansion cable. Check the Recovery Events for an indication of which connection(s) have been disabled and correct the cabling as required.")
  @JsonProperty("driveChannelPortDisabled")
  public Boolean getDriveChannelPortDisabled() {
    return driveChannelPortDisabled;
  }
  
  public void setDriveChannelPortDisabled(Boolean driveChannelPortDisabled) {
    this.driveChannelPortDisabled = driveChannelPortDisabled;
  }

  
  /**
   * This boolean is true if direct expansion ports are in use by the controllers.
   **/
  public StorageArray directExpansionPortInUse(Boolean directExpansionPortInUse) {
    this.directExpansionPortInUse = directExpansionPortInUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This boolean is true if direct expansion ports are in use by the controllers.")
  @JsonProperty("directExpansionPortInUse")
  public Boolean getDirectExpansionPortInUse() {
    return directExpansionPortInUse;
  }
  
  public void setDirectExpansionPortInUse(Boolean directExpansionPortInUse) {
    this.directExpansionPortInUse = directExpansionPortInUse;
  }

  
  /**
   * Cumulative Performance stats high resolution indicator
   **/
  public StorageArray highResolutionStatisticsEnabled(Boolean highResolutionStatisticsEnabled) {
    this.highResolutionStatisticsEnabled = highResolutionStatisticsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Cumulative Performance stats high resolution indicator")
  @JsonProperty("highResolutionStatisticsEnabled")
  public Boolean getHighResolutionStatisticsEnabled() {
    return highResolutionStatisticsEnabled;
  }
  
  public void setHighResolutionStatisticsEnabled(Boolean highResolutionStatisticsEnabled) {
    this.highResolutionStatisticsEnabled = highResolutionStatisticsEnabled;
  }

  
  /**
   * Auto Load Balancing is user-enabled on this array
   **/
  public StorageArray autoLoadBalancingEnabled(Boolean autoLoadBalancingEnabled) {
    this.autoLoadBalancingEnabled = autoLoadBalancingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Auto Load Balancing is user-enabled on this array")
  @JsonProperty("autoLoadBalancingEnabled")
  public Boolean getAutoLoadBalancingEnabled() {
    return autoLoadBalancingEnabled;
  }
  
  public void setAutoLoadBalancingEnabled(Boolean autoLoadBalancingEnabled) {
    this.autoLoadBalancingEnabled = autoLoadBalancingEnabled;
  }

  
  /**
   **/
  public StorageArray vaaienabled(Boolean vaaienabled) {
    this.vaaienabled = vaaienabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vaaienabled")
  public Boolean getVaaienabled() {
    return vaaienabled;
  }
  
  public void setVaaienabled(Boolean vaaienabled) {
    this.vaaienabled = vaaienabled;
  }

  
  /**
   **/
  public StorageArray odxenabled(Boolean odxenabled) {
    this.odxenabled = odxenabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("odxenabled")
  public Boolean getOdxenabled() {
    return odxenabled;
  }
  
  public void setOdxenabled(Boolean odxenabled) {
    this.odxenabled = odxenabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageArray storageArray = (StorageArray) o;
    return Objects.equals(this.saData, storageArray.saData) &&
        Objects.equals(this.safeId, storageArray.safeId) &&
        Objects.equals(this.cache, storageArray.cache) &&
        Objects.equals(this.accessVolume, storageArray.accessVolume) &&
        Objects.equals(this.featureParameters, storageArray.featureParameters) &&
        Objects.equals(this.mediaScanPeriod, storageArray.mediaScanPeriod) &&
        Objects.equals(this.capabilities, storageArray.capabilities) &&
        Objects.equals(this.premiumFeatures, storageArray.premiumFeatures) &&
        Objects.equals(this.trayPositionList, storageArray.trayPositionList) &&
        Objects.equals(this.hostPortType, storageArray.hostPortType) &&
        Objects.equals(this.hostSpecificVals, storageArray.hostSpecificVals) &&
        Objects.equals(this.compatibility, storageArray.compatibility) &&
        Objects.equals(this.usageHints, storageArray.usageHints) &&
        Objects.equals(this.definedPartitionCount, storageArray.definedPartitionCount) &&
        Objects.equals(this.defaultHostPortTypeIndex, storageArray.defaultHostPortTypeIndex) &&
        Objects.equals(this.remoteAccessID, storageArray.remoteAccessID) &&
        Objects.equals(this.remoteMirroringActive, storageArray.remoteMirroringActive) &&
        Objects.equals(this.volXferAlertDelayPeriod, storageArray.volXferAlertDelayPeriod) &&
        Objects.equals(this.reserved1, storageArray.reserved1) &&
        Objects.equals(this.reserved2, storageArray.reserved2) &&
        Objects.equals(this.stagedFirmware, storageArray.stagedFirmware) &&
        Objects.equals(this.unreadableSectors, storageArray.unreadableSectors) &&
        Objects.equals(this.driveChannels, storageArray.driveChannels) &&
        Objects.equals(this.portLocations, storageArray.portLocations) &&
        Objects.equals(this.ddcTag, storageArray.ddcTag) &&
        Objects.equals(this.featureBundle, storageArray.featureBundle) &&
        Objects.equals(this.featureState, storageArray.featureState) &&
        Objects.equals(this.channelPortLocations, storageArray.channelPortLocations) &&
        Objects.equals(this.iscsiEntityData, storageArray.iscsiEntityData) &&
        Objects.equals(this.hostType, storageArray.hostType) &&
        Objects.equals(this.defaultHostTypeIndex, storageArray.defaultHostTypeIndex) &&
        Objects.equals(this.rvmControllerHostChannel, storageArray.rvmControllerHostChannel) &&
        Objects.equals(this.smartBatteryData, storageArray.smartBatteryData) &&
        Objects.equals(this.invalidSystemConfig, storageArray.invalidSystemConfig) &&
        Objects.equals(this.securityLockKey, storageArray.securityLockKey) &&
        Objects.equals(this.lockKeyIDRef, storageArray.lockKeyIDRef) &&
        Objects.equals(this.syslogConfiguration, storageArray.syslogConfiguration) &&
        Objects.equals(this.securityExternalKmsEnable, storageArray.securityExternalKmsEnable) &&
        Objects.equals(this.newKeySequence, storageArray.newKeySequence) &&
        Objects.equals(this.securityExternalKmsKeyStatus, storageArray.securityExternalKmsKeyStatus) &&
        Objects.equals(this.lockKeyNeededList, storageArray.lockKeyNeededList) &&
        Objects.equals(this.dplCoreDumpData, storageArray.dplCoreDumpData) &&
        Objects.equals(this.fcRVMState, storageArray.fcRVMState) &&
        Objects.equals(this.asupEnabled, storageArray.asupEnabled) &&
        Objects.equals(this.asupOnDemandEnabled, storageArray.asupOnDemandEnabled) &&
        Objects.equals(this.asupRemoteDiagsEnabled, storageArray.asupRemoteDiagsEnabled) &&
        Objects.equals(this.iocDumpData, storageArray.iocDumpData) &&
        Objects.equals(this.driveChannelPortDisabled, storageArray.driveChannelPortDisabled) &&
        Objects.equals(this.directExpansionPortInUse, storageArray.directExpansionPortInUse) &&
        Objects.equals(this.highResolutionStatisticsEnabled, storageArray.highResolutionStatisticsEnabled) &&
        Objects.equals(this.autoLoadBalancingEnabled, storageArray.autoLoadBalancingEnabled) &&
        Objects.equals(this.vaaienabled, storageArray.vaaienabled) &&
        Objects.equals(this.odxenabled, storageArray.odxenabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saData, safeId, cache, accessVolume, featureParameters, mediaScanPeriod, capabilities, premiumFeatures, trayPositionList, hostPortType, hostSpecificVals, compatibility, usageHints, definedPartitionCount, defaultHostPortTypeIndex, remoteAccessID, remoteMirroringActive, volXferAlertDelayPeriod, reserved1, reserved2, stagedFirmware, unreadableSectors, driveChannels, portLocations, ddcTag, featureBundle, featureState, channelPortLocations, iscsiEntityData, hostType, defaultHostTypeIndex, rvmControllerHostChannel, smartBatteryData, invalidSystemConfig, securityLockKey, lockKeyIDRef, syslogConfiguration, securityExternalKmsEnable, newKeySequence, securityExternalKmsKeyStatus, lockKeyNeededList, dplCoreDumpData, fcRVMState, asupEnabled, asupOnDemandEnabled, asupRemoteDiagsEnabled, iocDumpData, driveChannelPortDisabled, directExpansionPortInUse, highResolutionStatisticsEnabled, autoLoadBalancingEnabled, vaaienabled, odxenabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageArray {\n");
    
    sb.append("    saData: ").append(toIndentedString(saData)).append("\n");
    sb.append("    safeId: ").append(toIndentedString(safeId)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    accessVolume: ").append(toIndentedString(accessVolume)).append("\n");
    sb.append("    featureParameters: ").append(toIndentedString(featureParameters)).append("\n");
    sb.append("    mediaScanPeriod: ").append(toIndentedString(mediaScanPeriod)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    premiumFeatures: ").append(toIndentedString(premiumFeatures)).append("\n");
    sb.append("    trayPositionList: ").append(toIndentedString(trayPositionList)).append("\n");
    sb.append("    hostPortType: ").append(toIndentedString(hostPortType)).append("\n");
    sb.append("    hostSpecificVals: ").append(toIndentedString(hostSpecificVals)).append("\n");
    sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
    sb.append("    usageHints: ").append(toIndentedString(usageHints)).append("\n");
    sb.append("    definedPartitionCount: ").append(toIndentedString(definedPartitionCount)).append("\n");
    sb.append("    defaultHostPortTypeIndex: ").append(toIndentedString(defaultHostPortTypeIndex)).append("\n");
    sb.append("    remoteAccessID: ").append(toIndentedString(remoteAccessID)).append("\n");
    sb.append("    remoteMirroringActive: ").append(toIndentedString(remoteMirroringActive)).append("\n");
    sb.append("    volXferAlertDelayPeriod: ").append(toIndentedString(volXferAlertDelayPeriod)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    stagedFirmware: ").append(toIndentedString(stagedFirmware)).append("\n");
    sb.append("    unreadableSectors: ").append(toIndentedString(unreadableSectors)).append("\n");
    sb.append("    driveChannels: ").append(toIndentedString(driveChannels)).append("\n");
    sb.append("    portLocations: ").append(toIndentedString(portLocations)).append("\n");
    sb.append("    ddcTag: ").append(toIndentedString(ddcTag)).append("\n");
    sb.append("    featureBundle: ").append(toIndentedString(featureBundle)).append("\n");
    sb.append("    featureState: ").append(toIndentedString(featureState)).append("\n");
    sb.append("    channelPortLocations: ").append(toIndentedString(channelPortLocations)).append("\n");
    sb.append("    iscsiEntityData: ").append(toIndentedString(iscsiEntityData)).append("\n");
    sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
    sb.append("    defaultHostTypeIndex: ").append(toIndentedString(defaultHostTypeIndex)).append("\n");
    sb.append("    rvmControllerHostChannel: ").append(toIndentedString(rvmControllerHostChannel)).append("\n");
    sb.append("    smartBatteryData: ").append(toIndentedString(smartBatteryData)).append("\n");
    sb.append("    invalidSystemConfig: ").append(toIndentedString(invalidSystemConfig)).append("\n");
    sb.append("    securityLockKey: ").append(toIndentedString(securityLockKey)).append("\n");
    sb.append("    lockKeyIDRef: ").append(toIndentedString(lockKeyIDRef)).append("\n");
    sb.append("    syslogConfiguration: ").append(toIndentedString(syslogConfiguration)).append("\n");
    sb.append("    securityExternalKmsEnable: ").append(toIndentedString(securityExternalKmsEnable)).append("\n");
    sb.append("    newKeySequence: ").append(toIndentedString(newKeySequence)).append("\n");
    sb.append("    securityExternalKmsKeyStatus: ").append(toIndentedString(securityExternalKmsKeyStatus)).append("\n");
    sb.append("    lockKeyNeededList: ").append(toIndentedString(lockKeyNeededList)).append("\n");
    sb.append("    dplCoreDumpData: ").append(toIndentedString(dplCoreDumpData)).append("\n");
    sb.append("    fcRVMState: ").append(toIndentedString(fcRVMState)).append("\n");
    sb.append("    asupEnabled: ").append(toIndentedString(asupEnabled)).append("\n");
    sb.append("    asupOnDemandEnabled: ").append(toIndentedString(asupOnDemandEnabled)).append("\n");
    sb.append("    asupRemoteDiagsEnabled: ").append(toIndentedString(asupRemoteDiagsEnabled)).append("\n");
    sb.append("    iocDumpData: ").append(toIndentedString(iocDumpData)).append("\n");
    sb.append("    driveChannelPortDisabled: ").append(toIndentedString(driveChannelPortDisabled)).append("\n");
    sb.append("    directExpansionPortInUse: ").append(toIndentedString(directExpansionPortInUse)).append("\n");
    sb.append("    highResolutionStatisticsEnabled: ").append(toIndentedString(highResolutionStatisticsEnabled)).append("\n");
    sb.append("    autoLoadBalancingEnabled: ").append(toIndentedString(autoLoadBalancingEnabled)).append("\n");
    sb.append("    vaaienabled: ").append(toIndentedString(vaaienabled)).append("\n");
    sb.append("    odxenabled: ").append(toIndentedString(odxenabled)).append("\n");
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

