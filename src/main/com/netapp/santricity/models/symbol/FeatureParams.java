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
 * FeatureParams
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FeatureParams   {
  
    private Integer maxHotSpares;

    private List<Integer> cacheBlockSizes;

    private Integer maxDCEDrives;

    private Integer maxReadAheadMultiplier;

    private Integer minMediaScanPeriod;

    private Integer maxMediaScanPeriod;

    private List<Integer> supportedSegSizes;

    private Integer numStandardSegSizes;


  /**
   * Gets or Sets segTransitions
   */
  public enum SegTransitionsEnum {
    transitionHalf("transitionHalf"),
    transitionDouble("transitionDouble"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SegTransitionsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SegTransitionsEnum> segTransitions;

    private Integer mappableLUNCount;

    private Integer maxPartitionCount;

    private Integer maxMappingsPerVolume;

    private Integer maxVolumes;

    private Integer maxSnapshots;

    private Integer maxSnapshotsPerBase;

    private Integer minRepositorySize;

    private Integer maxMirrors;

    private Integer maxVolCopys;

    private Integer maxConcurrentBackgroundCopys;

    private Integer maxUtmLunValue;

    private String reserved1;

    private String reserved2;

    private Boolean batteryNotInConfiguration;


  /**
   * Gets or Sets supportedDriveTypes
   */
  public enum SupportedDriveTypesEnum {
    all("all"),
    scsi("scsi"),
    fibre("fibre"),
    sata("sata"),
    pata("pata"),
    fibre520b("fibre520b"),
    sas("sas"),
    unknown("unknown"),
    sas4k("sas4k"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SupportedDriveTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SupportedDriveTypesEnum> supportedDriveTypes;

    private Integer currentMaxMirrors;

    private Integer maxVolumesPerGroup;

    private Integer maxDriveDownloadFiles;

    private Integer maxMgmtClientRecords;

    private Integer maxMgmtClientRecordSize;


  /**
   * Indicates whether the system is Simplex or Duplex.
   */
  public enum RedundancyModeEnum {
    unknown("unknown"),
    duplex("duplex"),
    simplex("simplex"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RedundancyModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RedundancyModeEnum redundancyMode;

    private Integer maxExpansionDriveTrays;


  /**
   * Gets or Sets supportedAuthMethods
   */
  public enum SupportedAuthMethodsEnum {
    none("none"),
    chap("chap"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SupportedAuthMethodsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SupportedAuthMethodsEnum> supportedAuthMethods;

    private Integer maxIscsiIpv6LocalAddressesPerPort;

    private Integer maxIscsiIpv6RoutableAddressesPerPort;

    private Integer absoluteMaxDssSegmentSize;

    private Boolean smartBatteryTechnology;

    private Boolean writeCachingEnabledDuringLearnCycle;

    private Integer maxSSDsSupported;

    private Boolean ssdInterfaceTypeMixingSupported;

    private Integer maxDriveSlots;


  /**
   * Gets or Sets supportedProtectionTypes
   */
  public enum SupportedProtectionTypesEnum {
    type0Protection("type0Protection"),
    type1Protection("type1Protection"),
    type2Protection("type2Protection"),
    type3Protection("type3Protection"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SupportedProtectionTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SupportedProtectionTypesEnum> supportedProtectionTypes;


  /**
   * Gets or Sets supportedEventPriorities
   */
  public enum SupportedEventPrioritiesEnum {
    priorityDefault("priorityDefault"),
    priorityCritical("priorityCritical"),
    priorityInfo("priorityInfo"),
    priorityEmergency("priorityEmergency"),
    priorityAlert("priorityAlert"),
    priorityError("priorityError"),
    priorityWarning("priorityWarning"),
    priorityNotice("priorityNotice"),
    priorityDebug("priorityDebug"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SupportedEventPrioritiesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SupportedEventPrioritiesEnum> supportedEventPriorities;

    private Long maxFlashCacheSize;

    private Integer defaultMediaScanPeriod;

  
  /**
   * The maximum number of hot spare drives that can be assigned. If the value in this field is '0xFFFFFFFF' it means there is no limit to the number of hot spares.
   **/
  public FeatureParams maxHotSpares(Integer maxHotSpares) {
    this.maxHotSpares = maxHotSpares;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of hot spare drives that can be assigned. If the value in this field is '0xFFFFFFFF' it means there is no limit to the number of hot spares.")
  @JsonProperty("maxHotSpares")
  public Integer getMaxHotSpares() {
    return maxHotSpares;
  }
  
  public void setMaxHotSpares(Integer maxHotSpares) {
    this.maxHotSpares = maxHotSpares;
  }

  
  /**
   * A variable-length array in which each element specifies one of the supported cache block sizes that can be set on the controller. Cache block sizes are reported in bytes.
   **/
  public FeatureParams cacheBlockSizes(List<Integer> cacheBlockSizes) {
    this.cacheBlockSizes = cacheBlockSizes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array in which each element specifies one of the supported cache block sizes that can be set on the controller. Cache block sizes are reported in bytes.")
  @JsonProperty("cacheBlockSizes")
  public List<Integer> getCacheBlockSizes() {
    return cacheBlockSizes;
  }
  
  public void setCacheBlockSizes(List<Integer> cacheBlockSizes) {
    this.cacheBlockSizes = cacheBlockSizes;
  }

  
  /**
   * The maximum number of drives that can be added, in a given operation, to an existing volume group to expand the capacity of the volume group.
   **/
  public FeatureParams maxDCEDrives(Integer maxDCEDrives) {
    this.maxDCEDrives = maxDCEDrives;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of drives that can be added, in a given operation, to an existing volume group to expand the capacity of the volume group.")
  @JsonProperty("maxDCEDrives")
  public Integer getMaxDCEDrives() {
    return maxDCEDrives;
  }
  
  public void setMaxDCEDrives(Integer maxDCEDrives) {
    this.maxDCEDrives = maxDCEDrives;
  }

  
  /**
   * The maximum multiplier value that can be specified when configuring cache the read-ahead parameter for a volume. (Realize, however, that the volume read-ahead parameter is no longer treated as a quantify, but as a simple on (non-zero) / off (zero) indicator.
   **/
  public FeatureParams maxReadAheadMultiplier(Integer maxReadAheadMultiplier) {
    this.maxReadAheadMultiplier = maxReadAheadMultiplier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum multiplier value that can be specified when configuring cache the read-ahead parameter for a volume. (Realize, however, that the volume read-ahead parameter is no longer treated as a quantify, but as a simple on (non-zero) / off (zero) indicator.")
  @JsonProperty("maxReadAheadMultiplier")
  public Integer getMaxReadAheadMultiplier() {
    return maxReadAheadMultiplier;
  }
  
  public void setMaxReadAheadMultiplier(Integer maxReadAheadMultiplier) {
    this.maxReadAheadMultiplier = maxReadAheadMultiplier;
  }

  
  /**
   * The minimum supported period over which a complete media scan can be set to occur (measured in days).
   **/
  public FeatureParams minMediaScanPeriod(Integer minMediaScanPeriod) {
    this.minMediaScanPeriod = minMediaScanPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum supported period over which a complete media scan can be set to occur (measured in days).")
  @JsonProperty("minMediaScanPeriod")
  public Integer getMinMediaScanPeriod() {
    return minMediaScanPeriod;
  }
  
  public void setMinMediaScanPeriod(Integer minMediaScanPeriod) {
    this.minMediaScanPeriod = minMediaScanPeriod;
  }

  
  /**
   * The maximum supported period over which a complete media scan can be set to occur (measured in days).
   **/
  public FeatureParams maxMediaScanPeriod(Integer maxMediaScanPeriod) {
    this.maxMediaScanPeriod = maxMediaScanPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum supported period over which a complete media scan can be set to occur (measured in days).")
  @JsonProperty("maxMediaScanPeriod")
  public Integer getMaxMediaScanPeriod() {
    return maxMediaScanPeriod;
  }
  
  public void setMaxMediaScanPeriod(Integer maxMediaScanPeriod) {
    this.maxMediaScanPeriod = maxMediaScanPeriod;
  }

  
  /**
   * A variable-length array in which each element specifies one of the supported segment size values, in bytes. This array should be consulted prior to attempting to create a volume modify a volume's segment size via the startVolumeSegmentSizing procedure.
   **/
  public FeatureParams supportedSegSizes(List<Integer> supportedSegSizes) {
    this.supportedSegSizes = supportedSegSizes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array in which each element specifies one of the supported segment size values, in bytes. This array should be consulted prior to attempting to create a volume modify a volume's segment size via the startVolumeSegmentSizing procedure.")
  @JsonProperty("supportedSegSizes")
  public List<Integer> getSupportedSegSizes() {
    return supportedSegSizes;
  }
  
  public void setSupportedSegSizes(List<Integer> supportedSegSizes) {
    this.supportedSegSizes = supportedSegSizes;
  }

  
  /**
   * The number of standard segment size values (at beginning of list).
   **/
  public FeatureParams numStandardSegSizes(Integer numStandardSegSizes) {
    this.numStandardSegSizes = numStandardSegSizes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of standard segment size values (at beginning of list).")
  @JsonProperty("numStandardSegSizes")
  public Integer getNumStandardSegSizes() {
    return numStandardSegSizes;
  }
  
  public void setNumStandardSegSizes(Integer numStandardSegSizes) {
    this.numStandardSegSizes = numStandardSegSizes;
  }

  
  /**
   * A variable-length array in which each element specifies one of the supported segment size transition options. The user of the SYMbol interface should consult this list to determine a valid new segment size for a volume before attempting to use the startVolumeSegmentSizing procedure.
   **/
  public FeatureParams segTransitions(List<SegTransitionsEnum> segTransitions) {
    this.segTransitions = segTransitions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array in which each element specifies one of the supported segment size transition options. The user of the SYMbol interface should consult this list to determine a valid new segment size for a volume before attempting to use the startVolumeSegmentSizing procedure.")
  @JsonProperty("segTransitions")
  public List<SegTransitionsEnum> getSegTransitions() {
    return segTransitions;
  }
  
  public void setSegTransitions(List<SegTransitionsEnum> segTransitions) {
    this.segTransitions = segTransitions;
  }

  
  /**
   * The maximum number of LUN addresses that are available for volume mapping operations. The range of supported LUN values is thus 0 through mappableLUNCoun-1.
   **/
  public FeatureParams mappableLUNCount(Integer mappableLUNCount) {
    this.mappableLUNCount = mappableLUNCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of LUN addresses that are available for volume mapping operations. The range of supported LUN values is thus 0 through mappableLUNCoun-1.")
  @JsonProperty("mappableLUNCount")
  public Integer getMappableLUNCount() {
    return mappableLUNCount;
  }
  
  public void setMappableLUNCount(Integer mappableLUNCount) {
    this.mappableLUNCount = mappableLUNCount;
  }

  
  /**
   * The number of partitions supported by the controller.
   **/
  public FeatureParams maxPartitionCount(Integer maxPartitionCount) {
    this.maxPartitionCount = maxPartitionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of partitions supported by the controller.")
  @JsonProperty("maxPartitionCount")
  public Integer getMaxPartitionCount() {
    return maxPartitionCount;
  }
  
  public void setMaxPartitionCount(Integer maxPartitionCount) {
    this.maxPartitionCount = maxPartitionCount;
  }

  
  /**
   * The number of mappings allowed per volume.
   **/
  public FeatureParams maxMappingsPerVolume(Integer maxMappingsPerVolume) {
    this.maxMappingsPerVolume = maxMappingsPerVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of mappings allowed per volume.")
  @JsonProperty("maxMappingsPerVolume")
  public Integer getMaxMappingsPerVolume() {
    return maxMappingsPerVolume;
  }
  
  public void setMaxMappingsPerVolume(Integer maxMappingsPerVolume) {
    this.maxMappingsPerVolume = maxMappingsPerVolume;
  }

  
  /**
   * The maximum number of standard volumes allowed per array.
   **/
  public FeatureParams maxVolumes(Integer maxVolumes) {
    this.maxVolumes = maxVolumes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of standard volumes allowed per array.")
  @JsonProperty("maxVolumes")
  public Integer getMaxVolumes() {
    return maxVolumes;
  }
  
  public void setMaxVolumes(Integer maxVolumes) {
    this.maxVolumes = maxVolumes;
  }

  
  /**
   * The maximum number of snapshot volumes allowed per array.
   **/
  public FeatureParams maxSnapshots(Integer maxSnapshots) {
    this.maxSnapshots = maxSnapshots;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of snapshot volumes allowed per array.")
  @JsonProperty("maxSnapshots")
  public Integer getMaxSnapshots() {
    return maxSnapshots;
  }
  
  public void setMaxSnapshots(Integer maxSnapshots) {
    this.maxSnapshots = maxSnapshots;
  }

  
  /**
   * The maximum number of snapshots allowed on any given base volume.
   **/
  public FeatureParams maxSnapshotsPerBase(Integer maxSnapshotsPerBase) {
    this.maxSnapshotsPerBase = maxSnapshotsPerBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of snapshots allowed on any given base volume.")
  @JsonProperty("maxSnapshotsPerBase")
  public Integer getMaxSnapshotsPerBase() {
    return maxSnapshotsPerBase;
  }
  
  public void setMaxSnapshotsPerBase(Integer maxSnapshotsPerBase) {
    this.maxSnapshotsPerBase = maxSnapshotsPerBase;
  }

  
  /**
   * The minimum size of a repository volume in bytes.
   **/
  public FeatureParams minRepositorySize(Integer minRepositorySize) {
    this.minRepositorySize = minRepositorySize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum size of a repository volume in bytes.")
  @JsonProperty("minRepositorySize")
  public Integer getMinRepositorySize() {
    return minRepositorySize;
  }
  
  public void setMinRepositorySize(Integer minRepositorySize) {
    this.minRepositorySize = minRepositorySize;
  }

  
  /**
   * The maximum number of mirrored volumes allowed per array assuming full size repositories.
   **/
  public FeatureParams maxMirrors(Integer maxMirrors) {
    this.maxMirrors = maxMirrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of mirrored volumes allowed per array assuming full size repositories.")
  @JsonProperty("maxMirrors")
  public Integer getMaxMirrors() {
    return maxMirrors;
  }
  
  public void setMaxMirrors(Integer maxMirrors) {
    this.maxMirrors = maxMirrors;
  }

  
  /**
   * The maximum number of volume copies allowed per array.
   **/
  public FeatureParams maxVolCopys(Integer maxVolCopys) {
    this.maxVolCopys = maxVolCopys;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of volume copies allowed per array.")
  @JsonProperty("maxVolCopys")
  public Integer getMaxVolCopys() {
    return maxVolCopys;
  }
  
  public void setMaxVolCopys(Integer maxVolCopys) {
    this.maxVolCopys = maxVolCopys;
  }

  
  /**
   * The maximum number of background copies that can be active at any one time. This maximum number applies to the entire array, not just one controller.
   **/
  public FeatureParams maxConcurrentBackgroundCopys(Integer maxConcurrentBackgroundCopys) {
    this.maxConcurrentBackgroundCopys = maxConcurrentBackgroundCopys;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of background copies that can be active at any one time. This maximum number applies to the entire array, not just one controller.")
  @JsonProperty("maxConcurrentBackgroundCopys")
  public Integer getMaxConcurrentBackgroundCopys() {
    return maxConcurrentBackgroundCopys;
  }
  
  public void setMaxConcurrentBackgroundCopys(Integer maxConcurrentBackgroundCopys) {
    this.maxConcurrentBackgroundCopys = maxConcurrentBackgroundCopys;
  }

  
  /**
   * The maximum value a UTM LUN can be set to.
   **/
  public FeatureParams maxUtmLunValue(Integer maxUtmLunValue) {
    this.maxUtmLunValue = maxUtmLunValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum value a UTM LUN can be set to.")
  @JsonProperty("maxUtmLunValue")
  public Integer getMaxUtmLunValue() {
    return maxUtmLunValue;
  }
  
  public void setMaxUtmLunValue(Integer maxUtmLunValue) {
    this.maxUtmLunValue = maxUtmLunValue;
  }

  
  /**
   **/
  public FeatureParams reserved1(String reserved1) {
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
  public FeatureParams reserved2(String reserved2) {
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
   * The NVSRAM setting for optional controller battery.
   **/
  public FeatureParams batteryNotInConfiguration(Boolean batteryNotInConfiguration) {
    this.batteryNotInConfiguration = batteryNotInConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The NVSRAM setting for optional controller battery.")
  @JsonProperty("battery_not_in_configuration")
  public Boolean getBatteryNotInConfiguration() {
    return batteryNotInConfiguration;
  }
  
  public void setBatteryNotInConfiguration(Boolean batteryNotInConfiguration) {
    this.batteryNotInConfiguration = batteryNotInConfiguration;
  }

  
  /**
   * A list of supported drive types.
   **/
  public FeatureParams supportedDriveTypes(List<SupportedDriveTypesEnum> supportedDriveTypes) {
    this.supportedDriveTypes = supportedDriveTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of supported drive types.")
  @JsonProperty("supportedDriveTypes")
  public List<SupportedDriveTypesEnum> getSupportedDriveTypes() {
    return supportedDriveTypes;
  }
  
  public void setSupportedDriveTypes(List<SupportedDriveTypesEnum> supportedDriveTypes) {
    this.supportedDriveTypes = supportedDriveTypes;
  }

  
  /**
   * The maximum number of mirrored volumes allowed per array for existing repositories.
   **/
  public FeatureParams currentMaxMirrors(Integer currentMaxMirrors) {
    this.currentMaxMirrors = currentMaxMirrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of mirrored volumes allowed per array for existing repositories.")
  @JsonProperty("currentMaxMirrors")
  public Integer getCurrentMaxMirrors() {
    return currentMaxMirrors;
  }
  
  public void setCurrentMaxMirrors(Integer currentMaxMirrors) {
    this.currentMaxMirrors = currentMaxMirrors;
  }

  
  /**
   * The maximum number of volumes allowed per volume group.
   **/
  public FeatureParams maxVolumesPerGroup(Integer maxVolumesPerGroup) {
    this.maxVolumesPerGroup = maxVolumesPerGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of volumes allowed per volume group.")
  @JsonProperty("maxVolumesPerGroup")
  public Integer getMaxVolumesPerGroup() {
    return maxVolumesPerGroup;
  }
  
  public void setMaxVolumesPerGroup(Integer maxVolumesPerGroup) {
    this.maxVolumesPerGroup = maxVolumesPerGroup;
  }

  
  /**
   * The maximum number of drive download files permitted.
   **/
  public FeatureParams maxDriveDownloadFiles(Integer maxDriveDownloadFiles) {
    this.maxDriveDownloadFiles = maxDriveDownloadFiles;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of drive download files permitted.")
  @JsonProperty("maxDriveDownloadFiles")
  public Integer getMaxDriveDownloadFiles() {
    return maxDriveDownloadFiles;
  }
  
  public void setMaxDriveDownloadFiles(Integer maxDriveDownloadFiles) {
    this.maxDriveDownloadFiles = maxDriveDownloadFiles;
  }

  
  /**
   * The maximum number of records allowed in the client data storage area.
   **/
  public FeatureParams maxMgmtClientRecords(Integer maxMgmtClientRecords) {
    this.maxMgmtClientRecords = maxMgmtClientRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of records allowed in the client data storage area.")
  @JsonProperty("maxMgmtClientRecords")
  public Integer getMaxMgmtClientRecords() {
    return maxMgmtClientRecords;
  }
  
  public void setMaxMgmtClientRecords(Integer maxMgmtClientRecords) {
    this.maxMgmtClientRecords = maxMgmtClientRecords;
  }

  
  /**
   * The maximum record size of a client data record.
   **/
  public FeatureParams maxMgmtClientRecordSize(Integer maxMgmtClientRecordSize) {
    this.maxMgmtClientRecordSize = maxMgmtClientRecordSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum record size of a client data record.")
  @JsonProperty("maxMgmtClientRecordSize")
  public Integer getMaxMgmtClientRecordSize() {
    return maxMgmtClientRecordSize;
  }
  
  public void setMaxMgmtClientRecordSize(Integer maxMgmtClientRecordSize) {
    this.maxMgmtClientRecordSize = maxMgmtClientRecordSize;
  }

  
  /**
   * Indicates whether the system is Simplex or Duplex.
   **/
  public FeatureParams redundancyMode(RedundancyModeEnum redundancyMode) {
    this.redundancyMode = redundancyMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether the system is Simplex or Duplex.")
  @JsonProperty("redundancyMode")
  public RedundancyModeEnum getRedundancyMode() {
    return redundancyMode;
  }
  
  public void setRedundancyMode(RedundancyModeEnum redundancyMode) {
    this.redundancyMode = redundancyMode;
  }

  
  /**
   * The maximum number of expansion drive trays allowed for this storage array.
   **/
  public FeatureParams maxExpansionDriveTrays(Integer maxExpansionDriveTrays) {
    this.maxExpansionDriveTrays = maxExpansionDriveTrays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of expansion drive trays allowed for this storage array.")
  @JsonProperty("maxExpansionDriveTrays")
  public Integer getMaxExpansionDriveTrays() {
    return maxExpansionDriveTrays;
  }
  
  public void setMaxExpansionDriveTrays(Integer maxExpansionDriveTrays) {
    this.maxExpansionDriveTrays = maxExpansionDriveTrays;
  }

  
  /**
   * The iSCSI authentication methods supported by the storage array.
   **/
  public FeatureParams supportedAuthMethods(List<SupportedAuthMethodsEnum> supportedAuthMethods) {
    this.supportedAuthMethods = supportedAuthMethods;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The iSCSI authentication methods supported by the storage array.")
  @JsonProperty("supportedAuthMethods")
  public List<SupportedAuthMethodsEnum> getSupportedAuthMethods() {
    return supportedAuthMethods;
  }
  
  public void setSupportedAuthMethods(List<SupportedAuthMethodsEnum> supportedAuthMethods) {
    this.supportedAuthMethods = supportedAuthMethods;
  }

  
  /**
   * Max number of iSCSI IPV6 local addresses
   **/
  public FeatureParams maxIscsiIpv6LocalAddressesPerPort(Integer maxIscsiIpv6LocalAddressesPerPort) {
    this.maxIscsiIpv6LocalAddressesPerPort = maxIscsiIpv6LocalAddressesPerPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max number of iSCSI IPV6 local addresses")
  @JsonProperty("maxIscsiIpv6LocalAddressesPerPort")
  public Integer getMaxIscsiIpv6LocalAddressesPerPort() {
    return maxIscsiIpv6LocalAddressesPerPort;
  }
  
  public void setMaxIscsiIpv6LocalAddressesPerPort(Integer maxIscsiIpv6LocalAddressesPerPort) {
    this.maxIscsiIpv6LocalAddressesPerPort = maxIscsiIpv6LocalAddressesPerPort;
  }

  
  /**
   * Max number of iSCSI IPV6 routable addresses
   **/
  public FeatureParams maxIscsiIpv6RoutableAddressesPerPort(Integer maxIscsiIpv6RoutableAddressesPerPort) {
    this.maxIscsiIpv6RoutableAddressesPerPort = maxIscsiIpv6RoutableAddressesPerPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max number of iSCSI IPV6 routable addresses")
  @JsonProperty("maxIscsiIpv6RoutableAddressesPerPort")
  public Integer getMaxIscsiIpv6RoutableAddressesPerPort() {
    return maxIscsiIpv6RoutableAddressesPerPort;
  }
  
  public void setMaxIscsiIpv6RoutableAddressesPerPort(Integer maxIscsiIpv6RoutableAddressesPerPort) {
    this.maxIscsiIpv6RoutableAddressesPerPort = maxIscsiIpv6RoutableAddressesPerPort;
  }

  
  /**
   * The global upper bound, expressed in bytes, on the new segment size that may be requested on the startVolumeSegmentSizing procedure.
   **/
  public FeatureParams absoluteMaxDssSegmentSize(Integer absoluteMaxDssSegmentSize) {
    this.absoluteMaxDssSegmentSize = absoluteMaxDssSegmentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The global upper bound, expressed in bytes, on the new segment size that may be requested on the startVolumeSegmentSizing procedure.")
  @JsonProperty("absoluteMaxDssSegmentSize")
  public Integer getAbsoluteMaxDssSegmentSize() {
    return absoluteMaxDssSegmentSize;
  }
  
  public void setAbsoluteMaxDssSegmentSize(Integer absoluteMaxDssSegmentSize) {
    this.absoluteMaxDssSegmentSize = absoluteMaxDssSegmentSize;
  }

  
  /**
   * This field is set to true if the storage array uses smart battery technology, and false otherwise.
   **/
  public FeatureParams smartBatteryTechnology(Boolean smartBatteryTechnology) {
    this.smartBatteryTechnology = smartBatteryTechnology;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is set to true if the storage array uses smart battery technology, and false otherwise.")
  @JsonProperty("smartBatteryTechnology")
  public Boolean getSmartBatteryTechnology() {
    return smartBatteryTechnology;
  }
  
  public void setSmartBatteryTechnology(Boolean smartBatteryTechnology) {
    this.smartBatteryTechnology = smartBatteryTechnology;
  }

  
  /**
   * This field, which is only applicable if smartBatteryTechnology is true, is set to true if the charge level on a smart battery unit is expected to remain above the minimum level needed to support write caching.
   **/
  public FeatureParams writeCachingEnabledDuringLearnCycle(Boolean writeCachingEnabledDuringLearnCycle) {
    this.writeCachingEnabledDuringLearnCycle = writeCachingEnabledDuringLearnCycle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field, which is only applicable if smartBatteryTechnology is true, is set to true if the charge level on a smart battery unit is expected to remain above the minimum level needed to support write caching.")
  @JsonProperty("writeCachingEnabledDuringLearnCycle")
  public Boolean getWriteCachingEnabledDuringLearnCycle() {
    return writeCachingEnabledDuringLearnCycle;
  }
  
  public void setWriteCachingEnabledDuringLearnCycle(Boolean writeCachingEnabledDuringLearnCycle) {
    this.writeCachingEnabledDuringLearnCycle = writeCachingEnabledDuringLearnCycle;
  }

  
  /**
   * The maximum number of SSDs supported on the array. If SSDs are not supported this value is 0.
   **/
  public FeatureParams maxSSDsSupported(Integer maxSSDsSupported) {
    this.maxSSDsSupported = maxSSDsSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of SSDs supported on the array. If SSDs are not supported this value is 0.")
  @JsonProperty("maxSSDsSupported")
  public Integer getMaxSSDsSupported() {
    return maxSSDsSupported;
  }
  
  public void setMaxSSDsSupported(Integer maxSSDsSupported) {
    this.maxSSDsSupported = maxSSDsSupported;
  }

  
  /**
   * True if different SSD interface types (e.g. Fibre Channel, SAS) can be used in the same volume group.
   **/
  public FeatureParams ssdInterfaceTypeMixingSupported(Boolean ssdInterfaceTypeMixingSupported) {
    this.ssdInterfaceTypeMixingSupported = ssdInterfaceTypeMixingSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if different SSD interface types (e.g. Fibre Channel, SAS) can be used in the same volume group.")
  @JsonProperty("ssdInterfaceTypeMixingSupported")
  public Boolean getSsdInterfaceTypeMixingSupported() {
    return ssdInterfaceTypeMixingSupported;
  }
  
  public void setSsdInterfaceTypeMixingSupported(Boolean ssdInterfaceTypeMixingSupported) {
    this.ssdInterfaceTypeMixingSupported = ssdInterfaceTypeMixingSupported;
  }

  
  /**
   * The maximum number of drive slots supported on the array.
   **/
  public FeatureParams maxDriveSlots(Integer maxDriveSlots) {
    this.maxDriveSlots = maxDriveSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of drive slots supported on the array.")
  @JsonProperty("maxDriveSlots")
  public Integer getMaxDriveSlots() {
    return maxDriveSlots;
  }
  
  public void setMaxDriveSlots(Integer maxDriveSlots) {
    this.maxDriveSlots = maxDriveSlots;
  }

  
  /**
   * The protection types supported by the storage array.
   **/
  public FeatureParams supportedProtectionTypes(List<SupportedProtectionTypesEnum> supportedProtectionTypes) {
    this.supportedProtectionTypes = supportedProtectionTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The protection types supported by the storage array.")
  @JsonProperty("supportedProtectionTypes")
  public List<SupportedProtectionTypesEnum> getSupportedProtectionTypes() {
    return supportedProtectionTypes;
  }
  
  public void setSupportedProtectionTypes(List<SupportedProtectionTypesEnum> supportedProtectionTypes) {
    this.supportedProtectionTypes = supportedProtectionTypes;
  }

  
  /**
   * An array listing the MEL event priorities that are configured for use in the current controller firmware build.
   **/
  public FeatureParams supportedEventPriorities(List<SupportedEventPrioritiesEnum> supportedEventPriorities) {
    this.supportedEventPriorities = supportedEventPriorities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array listing the MEL event priorities that are configured for use in the current controller firmware build.")
  @JsonProperty("supportedEventPriorities")
  public List<SupportedEventPrioritiesEnum> getSupportedEventPriorities() {
    return supportedEventPriorities;
  }
  
  public void setSupportedEventPriorities(List<SupportedEventPrioritiesEnum> supportedEventPriorities) {
    this.supportedEventPriorities = supportedEventPriorities;
  }

  
  /**
   * The maximum flash cache repository size measured in bytes.
   **/
  public FeatureParams maxFlashCacheSize(Long maxFlashCacheSize) {
    this.maxFlashCacheSize = maxFlashCacheSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum flash cache repository size measured in bytes.")
  @JsonProperty("maxFlashCacheSize")
  public Long getMaxFlashCacheSize() {
    return maxFlashCacheSize;
  }
  
  public void setMaxFlashCacheSize(Long maxFlashCacheSize) {
    this.maxFlashCacheSize = maxFlashCacheSize;
  }

  
  /**
   * The default media scan period stored in the controller's NVSRAM. Units are days.
   **/
  public FeatureParams defaultMediaScanPeriod(Integer defaultMediaScanPeriod) {
    this.defaultMediaScanPeriod = defaultMediaScanPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The default media scan period stored in the controller's NVSRAM. Units are days.")
  @JsonProperty("defaultMediaScanPeriod")
  public Integer getDefaultMediaScanPeriod() {
    return defaultMediaScanPeriod;
  }
  
  public void setDefaultMediaScanPeriod(Integer defaultMediaScanPeriod) {
    this.defaultMediaScanPeriod = defaultMediaScanPeriod;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureParams featureParams = (FeatureParams) o;
    return Objects.equals(this.maxHotSpares, featureParams.maxHotSpares) &&
        Objects.equals(this.cacheBlockSizes, featureParams.cacheBlockSizes) &&
        Objects.equals(this.maxDCEDrives, featureParams.maxDCEDrives) &&
        Objects.equals(this.maxReadAheadMultiplier, featureParams.maxReadAheadMultiplier) &&
        Objects.equals(this.minMediaScanPeriod, featureParams.minMediaScanPeriod) &&
        Objects.equals(this.maxMediaScanPeriod, featureParams.maxMediaScanPeriod) &&
        Objects.equals(this.supportedSegSizes, featureParams.supportedSegSizes) &&
        Objects.equals(this.numStandardSegSizes, featureParams.numStandardSegSizes) &&
        Objects.equals(this.segTransitions, featureParams.segTransitions) &&
        Objects.equals(this.mappableLUNCount, featureParams.mappableLUNCount) &&
        Objects.equals(this.maxPartitionCount, featureParams.maxPartitionCount) &&
        Objects.equals(this.maxMappingsPerVolume, featureParams.maxMappingsPerVolume) &&
        Objects.equals(this.maxVolumes, featureParams.maxVolumes) &&
        Objects.equals(this.maxSnapshots, featureParams.maxSnapshots) &&
        Objects.equals(this.maxSnapshotsPerBase, featureParams.maxSnapshotsPerBase) &&
        Objects.equals(this.minRepositorySize, featureParams.minRepositorySize) &&
        Objects.equals(this.maxMirrors, featureParams.maxMirrors) &&
        Objects.equals(this.maxVolCopys, featureParams.maxVolCopys) &&
        Objects.equals(this.maxConcurrentBackgroundCopys, featureParams.maxConcurrentBackgroundCopys) &&
        Objects.equals(this.maxUtmLunValue, featureParams.maxUtmLunValue) &&
        Objects.equals(this.reserved1, featureParams.reserved1) &&
        Objects.equals(this.reserved2, featureParams.reserved2) &&
        Objects.equals(this.batteryNotInConfiguration, featureParams.batteryNotInConfiguration) &&
        Objects.equals(this.supportedDriveTypes, featureParams.supportedDriveTypes) &&
        Objects.equals(this.currentMaxMirrors, featureParams.currentMaxMirrors) &&
        Objects.equals(this.maxVolumesPerGroup, featureParams.maxVolumesPerGroup) &&
        Objects.equals(this.maxDriveDownloadFiles, featureParams.maxDriveDownloadFiles) &&
        Objects.equals(this.maxMgmtClientRecords, featureParams.maxMgmtClientRecords) &&
        Objects.equals(this.maxMgmtClientRecordSize, featureParams.maxMgmtClientRecordSize) &&
        Objects.equals(this.redundancyMode, featureParams.redundancyMode) &&
        Objects.equals(this.maxExpansionDriveTrays, featureParams.maxExpansionDriveTrays) &&
        Objects.equals(this.supportedAuthMethods, featureParams.supportedAuthMethods) &&
        Objects.equals(this.maxIscsiIpv6LocalAddressesPerPort, featureParams.maxIscsiIpv6LocalAddressesPerPort) &&
        Objects.equals(this.maxIscsiIpv6RoutableAddressesPerPort, featureParams.maxIscsiIpv6RoutableAddressesPerPort) &&
        Objects.equals(this.absoluteMaxDssSegmentSize, featureParams.absoluteMaxDssSegmentSize) &&
        Objects.equals(this.smartBatteryTechnology, featureParams.smartBatteryTechnology) &&
        Objects.equals(this.writeCachingEnabledDuringLearnCycle, featureParams.writeCachingEnabledDuringLearnCycle) &&
        Objects.equals(this.maxSSDsSupported, featureParams.maxSSDsSupported) &&
        Objects.equals(this.ssdInterfaceTypeMixingSupported, featureParams.ssdInterfaceTypeMixingSupported) &&
        Objects.equals(this.maxDriveSlots, featureParams.maxDriveSlots) &&
        Objects.equals(this.supportedProtectionTypes, featureParams.supportedProtectionTypes) &&
        Objects.equals(this.supportedEventPriorities, featureParams.supportedEventPriorities) &&
        Objects.equals(this.maxFlashCacheSize, featureParams.maxFlashCacheSize) &&
        Objects.equals(this.defaultMediaScanPeriod, featureParams.defaultMediaScanPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHotSpares, cacheBlockSizes, maxDCEDrives, maxReadAheadMultiplier, minMediaScanPeriod, maxMediaScanPeriod, supportedSegSizes, numStandardSegSizes, segTransitions, mappableLUNCount, maxPartitionCount, maxMappingsPerVolume, maxVolumes, maxSnapshots, maxSnapshotsPerBase, minRepositorySize, maxMirrors, maxVolCopys, maxConcurrentBackgroundCopys, maxUtmLunValue, reserved1, reserved2, batteryNotInConfiguration, supportedDriveTypes, currentMaxMirrors, maxVolumesPerGroup, maxDriveDownloadFiles, maxMgmtClientRecords, maxMgmtClientRecordSize, redundancyMode, maxExpansionDriveTrays, supportedAuthMethods, maxIscsiIpv6LocalAddressesPerPort, maxIscsiIpv6RoutableAddressesPerPort, absoluteMaxDssSegmentSize, smartBatteryTechnology, writeCachingEnabledDuringLearnCycle, maxSSDsSupported, ssdInterfaceTypeMixingSupported, maxDriveSlots, supportedProtectionTypes, supportedEventPriorities, maxFlashCacheSize, defaultMediaScanPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureParams {\n");
    
    sb.append("    maxHotSpares: ").append(toIndentedString(maxHotSpares)).append("\n");
    sb.append("    cacheBlockSizes: ").append(toIndentedString(cacheBlockSizes)).append("\n");
    sb.append("    maxDCEDrives: ").append(toIndentedString(maxDCEDrives)).append("\n");
    sb.append("    maxReadAheadMultiplier: ").append(toIndentedString(maxReadAheadMultiplier)).append("\n");
    sb.append("    minMediaScanPeriod: ").append(toIndentedString(minMediaScanPeriod)).append("\n");
    sb.append("    maxMediaScanPeriod: ").append(toIndentedString(maxMediaScanPeriod)).append("\n");
    sb.append("    supportedSegSizes: ").append(toIndentedString(supportedSegSizes)).append("\n");
    sb.append("    numStandardSegSizes: ").append(toIndentedString(numStandardSegSizes)).append("\n");
    sb.append("    segTransitions: ").append(toIndentedString(segTransitions)).append("\n");
    sb.append("    mappableLUNCount: ").append(toIndentedString(mappableLUNCount)).append("\n");
    sb.append("    maxPartitionCount: ").append(toIndentedString(maxPartitionCount)).append("\n");
    sb.append("    maxMappingsPerVolume: ").append(toIndentedString(maxMappingsPerVolume)).append("\n");
    sb.append("    maxVolumes: ").append(toIndentedString(maxVolumes)).append("\n");
    sb.append("    maxSnapshots: ").append(toIndentedString(maxSnapshots)).append("\n");
    sb.append("    maxSnapshotsPerBase: ").append(toIndentedString(maxSnapshotsPerBase)).append("\n");
    sb.append("    minRepositorySize: ").append(toIndentedString(minRepositorySize)).append("\n");
    sb.append("    maxMirrors: ").append(toIndentedString(maxMirrors)).append("\n");
    sb.append("    maxVolCopys: ").append(toIndentedString(maxVolCopys)).append("\n");
    sb.append("    maxConcurrentBackgroundCopys: ").append(toIndentedString(maxConcurrentBackgroundCopys)).append("\n");
    sb.append("    maxUtmLunValue: ").append(toIndentedString(maxUtmLunValue)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    batteryNotInConfiguration: ").append(toIndentedString(batteryNotInConfiguration)).append("\n");
    sb.append("    supportedDriveTypes: ").append(toIndentedString(supportedDriveTypes)).append("\n");
    sb.append("    currentMaxMirrors: ").append(toIndentedString(currentMaxMirrors)).append("\n");
    sb.append("    maxVolumesPerGroup: ").append(toIndentedString(maxVolumesPerGroup)).append("\n");
    sb.append("    maxDriveDownloadFiles: ").append(toIndentedString(maxDriveDownloadFiles)).append("\n");
    sb.append("    maxMgmtClientRecords: ").append(toIndentedString(maxMgmtClientRecords)).append("\n");
    sb.append("    maxMgmtClientRecordSize: ").append(toIndentedString(maxMgmtClientRecordSize)).append("\n");
    sb.append("    redundancyMode: ").append(toIndentedString(redundancyMode)).append("\n");
    sb.append("    maxExpansionDriveTrays: ").append(toIndentedString(maxExpansionDriveTrays)).append("\n");
    sb.append("    supportedAuthMethods: ").append(toIndentedString(supportedAuthMethods)).append("\n");
    sb.append("    maxIscsiIpv6LocalAddressesPerPort: ").append(toIndentedString(maxIscsiIpv6LocalAddressesPerPort)).append("\n");
    sb.append("    maxIscsiIpv6RoutableAddressesPerPort: ").append(toIndentedString(maxIscsiIpv6RoutableAddressesPerPort)).append("\n");
    sb.append("    absoluteMaxDssSegmentSize: ").append(toIndentedString(absoluteMaxDssSegmentSize)).append("\n");
    sb.append("    smartBatteryTechnology: ").append(toIndentedString(smartBatteryTechnology)).append("\n");
    sb.append("    writeCachingEnabledDuringLearnCycle: ").append(toIndentedString(writeCachingEnabledDuringLearnCycle)).append("\n");
    sb.append("    maxSSDsSupported: ").append(toIndentedString(maxSSDsSupported)).append("\n");
    sb.append("    ssdInterfaceTypeMixingSupported: ").append(toIndentedString(ssdInterfaceTypeMixingSupported)).append("\n");
    sb.append("    maxDriveSlots: ").append(toIndentedString(maxDriveSlots)).append("\n");
    sb.append("    supportedProtectionTypes: ").append(toIndentedString(supportedProtectionTypes)).append("\n");
    sb.append("    supportedEventPriorities: ").append(toIndentedString(supportedEventPriorities)).append("\n");
    sb.append("    maxFlashCacheSize: ").append(toIndentedString(maxFlashCacheSize)).append("\n");
    sb.append("    defaultMediaScanPeriod: ").append(toIndentedString(defaultMediaScanPeriod)).append("\n");
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

