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
 * A Storage System is a collection of both physical components and logical  components. Physical components include disk drives, controllers, fans, and other hardware.  The physical disk drives are grouped into Storage Pools. The storage capacity of these Storage  Pools is provisioned into logical Volumes.
 */
@ApiModel(description = "A Storage System is a collection of both physical components and logical  components. Physical components include disk drives, controllers, fans, and other hardware.  The physical disk drives are grouped into Storage Pools. The storage capacity of these Storage  Pools is provisioned into logical Volumes.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class StorageSystemResponse   {
  
    private String id;

    private String name;

    private String wwn;


  /**
   * Gets or Sets passwordStatus
   */
  public enum PasswordStatusEnum {
    unknown("unknown"),
    invalid("invalid"),
    valid("valid");
;
    private String value;

    PasswordStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PasswordStatusEnum passwordStatus;

    private Boolean passwordSet;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    neverContacted("neverContacted"),
    offline("offline"),
    optimal("optimal"),
    needsAttn("needsAttn"),
    removed("removed"),
    newDevice("newDevice"),
    lockDown("lockDown");
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

    private String ip1;

    private String ip2;

    private Integer driveCount;

    private Integer trayCount;

    private Boolean traceEnabled;

    private String types;

    private String model;

    private List<KeyValue> metaTags;

    private Long hotSpareSize;

    private Long usedPoolSpace;

    private Long freePoolSpace;

    private Long unconfiguredSpace;


  /**
   * Gets or Sets driveTypes
   */
  public enum DriveTypesEnum {
    scsi("scsi"),
    fibre("fibre"),
    unknown("unknown"),
    sas("sas"),
    sata("sata"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DriveTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<DriveTypesEnum> driveTypes;

    private Integer hostSpareCountInStandby;

    private Integer hotSpareCount;

    private Integer hostSparesUsed;

    private Date bootTime;

    private String fwVersion;

    private String appVersion;

    private String bootVersion;

    private String nvsramVersion;

    private String chassisSerialNumber;

    private AccessVolumeEx accessVolume;

    private Map<String, Long> unconfiguredSpaceByDriveType;

    private Integer mediaScanPeriod;

    private Boolean driveChannelPortDisabled;

    private Boolean recoveryModeEnabled;

    private Boolean autoLoadBalancingEnabled;

    private Boolean remoteMirroringEnabled;


  /**
   * The remote mirroring state on this StorageDevice
   */
  public enum FcRemoteMirroringStateEnum {
    unknown("unknown"),
    disabled("disabled"),
    enabledLegacyRvm("enabledLegacyRvm"),
    enabledArvm("enabledArvm"),
    enabledAll("enabledAll"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FcRemoteMirroringStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FcRemoteMirroringStateEnum fcRemoteMirroringState;

    private Boolean asupEnabled;

    private Boolean securityKeyEnabled;

    private Date lastContacted;

    private Integer definedPartitionCount;

    private Boolean simplexModeEnabled;

    private String freePoolSpaceAsString;

    private String hotSpareSizeAsString;

    private String unconfiguredSpaceAsStrings;

    private String usedPoolSpaceAsString;

  
  /**
   **/
  public StorageSystemResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public StorageSystemResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public StorageSystemResponse wwn(String wwn) {
    this.wwn = wwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("wwn")
  public String getWwn() {
    return wwn;
  }
  
  public void setWwn(String wwn) {
    this.wwn = wwn;
  }

  
  /**
   **/
  public StorageSystemResponse passwordStatus(PasswordStatusEnum passwordStatus) {
    this.passwordStatus = passwordStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("passwordStatus")
  public PasswordStatusEnum getPasswordStatus() {
    return passwordStatus;
  }
  
  public void setPasswordStatus(PasswordStatusEnum passwordStatus) {
    this.passwordStatus = passwordStatus;
  }

  
  /**
   **/
  public StorageSystemResponse passwordSet(Boolean passwordSet) {
    this.passwordSet = passwordSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("passwordSet")
  public Boolean getPasswordSet() {
    return passwordSet;
  }
  
  public void setPasswordSet(Boolean passwordSet) {
    this.passwordSet = passwordSet;
  }

  
  /**
   **/
  public StorageSystemResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public StorageSystemResponse ip1(String ip1) {
    this.ip1 = ip1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ip1")
  public String getIp1() {
    return ip1;
  }
  
  public void setIp1(String ip1) {
    this.ip1 = ip1;
  }

  
  /**
   **/
  public StorageSystemResponse ip2(String ip2) {
    this.ip2 = ip2;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ip2")
  public String getIp2() {
    return ip2;
  }
  
  public void setIp2(String ip2) {
    this.ip2 = ip2;
  }

  
  /**
   **/
  public StorageSystemResponse driveCount(Integer driveCount) {
    this.driveCount = driveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("driveCount")
  public Integer getDriveCount() {
    return driveCount;
  }
  
  public void setDriveCount(Integer driveCount) {
    this.driveCount = driveCount;
  }

  
  /**
   **/
  public StorageSystemResponse trayCount(Integer trayCount) {
    this.trayCount = trayCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("trayCount")
  public Integer getTrayCount() {
    return trayCount;
  }
  
  public void setTrayCount(Integer trayCount) {
    this.trayCount = trayCount;
  }

  
  /**
   **/
  public StorageSystemResponse traceEnabled(Boolean traceEnabled) {
    this.traceEnabled = traceEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("traceEnabled")
  public Boolean getTraceEnabled() {
    return traceEnabled;
  }
  
  public void setTraceEnabled(Boolean traceEnabled) {
    this.traceEnabled = traceEnabled;
  }

  
  /**
   **/
  public StorageSystemResponse types(String types) {
    this.types = types;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("types")
  public String getTypes() {
    return types;
  }
  
  public void setTypes(String types) {
    this.types = types;
  }

  
  /**
   **/
  public StorageSystemResponse model(String model) {
    this.model = model;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   **/
  public StorageSystemResponse metaTags(List<KeyValue> metaTags) {
    this.metaTags = metaTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("metaTags")
  public List<KeyValue> getMetaTags() {
    return metaTags;
  }
  
  public void setMetaTags(List<KeyValue> metaTags) {
    this.metaTags = metaTags;
  }

  
  /**
   **/
  public StorageSystemResponse hotSpareSize(Long hotSpareSize) {
    this.hotSpareSize = hotSpareSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("hotSpareSize")
  public Long getHotSpareSize() {
    return hotSpareSize;
  }
  
  public void setHotSpareSize(Long hotSpareSize) {
    this.hotSpareSize = hotSpareSize;
  }

  
  /**
   **/
  public StorageSystemResponse usedPoolSpace(Long usedPoolSpace) {
    this.usedPoolSpace = usedPoolSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("usedPoolSpace")
  public Long getUsedPoolSpace() {
    return usedPoolSpace;
  }
  
  public void setUsedPoolSpace(Long usedPoolSpace) {
    this.usedPoolSpace = usedPoolSpace;
  }

  
  /**
   **/
  public StorageSystemResponse freePoolSpace(Long freePoolSpace) {
    this.freePoolSpace = freePoolSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("freePoolSpace")
  public Long getFreePoolSpace() {
    return freePoolSpace;
  }
  
  public void setFreePoolSpace(Long freePoolSpace) {
    this.freePoolSpace = freePoolSpace;
  }

  
  /**
   **/
  public StorageSystemResponse unconfiguredSpace(Long unconfiguredSpace) {
    this.unconfiguredSpace = unconfiguredSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("unconfiguredSpace")
  public Long getUnconfiguredSpace() {
    return unconfiguredSpace;
  }
  
  public void setUnconfiguredSpace(Long unconfiguredSpace) {
    this.unconfiguredSpace = unconfiguredSpace;
  }

  
  /**
   **/
  public StorageSystemResponse driveTypes(List<DriveTypesEnum> driveTypes) {
    this.driveTypes = driveTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("driveTypes")
  public List<DriveTypesEnum> getDriveTypes() {
    return driveTypes;
  }
  
  public void setDriveTypes(List<DriveTypesEnum> driveTypes) {
    this.driveTypes = driveTypes;
  }

  
  /**
   **/
  public StorageSystemResponse hostSpareCountInStandby(Integer hostSpareCountInStandby) {
    this.hostSpareCountInStandby = hostSpareCountInStandby;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("hostSpareCountInStandby")
  public Integer getHostSpareCountInStandby() {
    return hostSpareCountInStandby;
  }
  
  public void setHostSpareCountInStandby(Integer hostSpareCountInStandby) {
    this.hostSpareCountInStandby = hostSpareCountInStandby;
  }

  
  /**
   **/
  public StorageSystemResponse hotSpareCount(Integer hotSpareCount) {
    this.hotSpareCount = hotSpareCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("hotSpareCount")
  public Integer getHotSpareCount() {
    return hotSpareCount;
  }
  
  public void setHotSpareCount(Integer hotSpareCount) {
    this.hotSpareCount = hotSpareCount;
  }

  
  /**
   **/
  public StorageSystemResponse hostSparesUsed(Integer hostSparesUsed) {
    this.hostSparesUsed = hostSparesUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("hostSparesUsed")
  public Integer getHostSparesUsed() {
    return hostSparesUsed;
  }
  
  public void setHostSparesUsed(Integer hostSparesUsed) {
    this.hostSparesUsed = hostSparesUsed;
  }

  
  /**
   **/
  public StorageSystemResponse bootTime(Date bootTime) {
    this.bootTime = bootTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("bootTime")
  public Date getBootTime() {
    return bootTime;
  }
  
  public void setBootTime(Date bootTime) {
    this.bootTime = bootTime;
  }

  
  /**
   **/
  public StorageSystemResponse fwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fwVersion")
  public String getFwVersion() {
    return fwVersion;
  }
  
  public void setFwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
  }

  
  /**
   **/
  public StorageSystemResponse appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  
  /**
   **/
  public StorageSystemResponse bootVersion(String bootVersion) {
    this.bootVersion = bootVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("bootVersion")
  public String getBootVersion() {
    return bootVersion;
  }
  
  public void setBootVersion(String bootVersion) {
    this.bootVersion = bootVersion;
  }

  
  /**
   **/
  public StorageSystemResponse nvsramVersion(String nvsramVersion) {
    this.nvsramVersion = nvsramVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("nvsramVersion")
  public String getNvsramVersion() {
    return nvsramVersion;
  }
  
  public void setNvsramVersion(String nvsramVersion) {
    this.nvsramVersion = nvsramVersion;
  }

  
  /**
   **/
  public StorageSystemResponse chassisSerialNumber(String chassisSerialNumber) {
    this.chassisSerialNumber = chassisSerialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("chassisSerialNumber")
  public String getChassisSerialNumber() {
    return chassisSerialNumber;
  }
  
  public void setChassisSerialNumber(String chassisSerialNumber) {
    this.chassisSerialNumber = chassisSerialNumber;
  }

  
  /**
   **/
  public StorageSystemResponse accessVolume(AccessVolumeEx accessVolume) {
    this.accessVolume = accessVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("accessVolume")
  public AccessVolumeEx getAccessVolume() {
    return accessVolume;
  }
  
  public void setAccessVolume(AccessVolumeEx accessVolume) {
    this.accessVolume = accessVolume;
  }

  
  /**
   **/
  public StorageSystemResponse unconfiguredSpaceByDriveType(Map<String, Long> unconfiguredSpaceByDriveType) {
    this.unconfiguredSpaceByDriveType = unconfiguredSpaceByDriveType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("unconfiguredSpaceByDriveType")
  public Map<String, Long> getUnconfiguredSpaceByDriveType() {
    return unconfiguredSpaceByDriveType;
  }
  
  public void setUnconfiguredSpaceByDriveType(Map<String, Long> unconfiguredSpaceByDriveType) {
    this.unconfiguredSpaceByDriveType = unconfiguredSpaceByDriveType;
  }

  
  /**
   **/
  public StorageSystemResponse mediaScanPeriod(Integer mediaScanPeriod) {
    this.mediaScanPeriod = mediaScanPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("mediaScanPeriod")
  public Integer getMediaScanPeriod() {
    return mediaScanPeriod;
  }
  
  public void setMediaScanPeriod(Integer mediaScanPeriod) {
    this.mediaScanPeriod = mediaScanPeriod;
  }

  
  /**
   * True if one or more drive channel ports have been disabled by the controllers to protect against faulty expansion cabling.
   **/
  public StorageSystemResponse driveChannelPortDisabled(Boolean driveChannelPortDisabled) {
    this.driveChannelPortDisabled = driveChannelPortDisabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if one or more drive channel ports have been disabled by the controllers to protect against faulty expansion cabling.")
  @JsonProperty("driveChannelPortDisabled")
  public Boolean getDriveChannelPortDisabled() {
    return driveChannelPortDisabled;
  }
  
  public void setDriveChannelPortDisabled(Boolean driveChannelPortDisabled) {
    this.driveChannelPortDisabled = driveChannelPortDisabled;
  }

  
  /**
   * True if recovery mode is enabled on the array.
   **/
  public StorageSystemResponse recoveryModeEnabled(Boolean recoveryModeEnabled) {
    this.recoveryModeEnabled = recoveryModeEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if recovery mode is enabled on the array.")
  @JsonProperty("recoveryModeEnabled")
  public Boolean getRecoveryModeEnabled() {
    return recoveryModeEnabled;
  }
  
  public void setRecoveryModeEnabled(Boolean recoveryModeEnabled) {
    this.recoveryModeEnabled = recoveryModeEnabled;
  }

  
  /**
   * True if auto load balance is enabled on the array.
   **/
  public StorageSystemResponse autoLoadBalancingEnabled(Boolean autoLoadBalancingEnabled) {
    this.autoLoadBalancingEnabled = autoLoadBalancingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if auto load balance is enabled on the array.")
  @JsonProperty("autoLoadBalancingEnabled")
  public Boolean getAutoLoadBalancingEnabled() {
    return autoLoadBalancingEnabled;
  }
  
  public void setAutoLoadBalancingEnabled(Boolean autoLoadBalancingEnabled) {
    this.autoLoadBalancingEnabled = autoLoadBalancingEnabled;
  }

  
  /**
   * Can Remote Volume Mirrors be created on this StorageDevice?
   **/
  public StorageSystemResponse remoteMirroringEnabled(Boolean remoteMirroringEnabled) {
    this.remoteMirroringEnabled = remoteMirroringEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Can Remote Volume Mirrors be created on this StorageDevice?")
  @JsonProperty("remoteMirroringEnabled")
  public Boolean getRemoteMirroringEnabled() {
    return remoteMirroringEnabled;
  }
  
  public void setRemoteMirroringEnabled(Boolean remoteMirroringEnabled) {
    this.remoteMirroringEnabled = remoteMirroringEnabled;
  }

  
  /**
   * The remote mirroring state on this StorageDevice
   **/
  public StorageSystemResponse fcRemoteMirroringState(FcRemoteMirroringStateEnum fcRemoteMirroringState) {
    this.fcRemoteMirroringState = fcRemoteMirroringState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The remote mirroring state on this StorageDevice")
  @JsonProperty("fcRemoteMirroringState")
  public FcRemoteMirroringStateEnum getFcRemoteMirroringState() {
    return fcRemoteMirroringState;
  }
  
  public void setFcRemoteMirroringState(FcRemoteMirroringStateEnum fcRemoteMirroringState) {
    this.fcRemoteMirroringState = fcRemoteMirroringState;
  }

  
  /**
   * True if ASUP is enabled for this StorageDevice
   **/
  public StorageSystemResponse asupEnabled(Boolean asupEnabled) {
    this.asupEnabled = asupEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if ASUP is enabled for this StorageDevice")
  @JsonProperty("asupEnabled")
  public Boolean getAsupEnabled() {
    return asupEnabled;
  }
  
  public void setAsupEnabled(Boolean asupEnabled) {
    this.asupEnabled = asupEnabled;
  }

  
  /**
   **/
  public StorageSystemResponse securityKeyEnabled(Boolean securityKeyEnabled) {
    this.securityKeyEnabled = securityKeyEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("securityKeyEnabled")
  public Boolean getSecurityKeyEnabled() {
    return securityKeyEnabled;
  }
  
  public void setSecurityKeyEnabled(Boolean securityKeyEnabled) {
    this.securityKeyEnabled = securityKeyEnabled;
  }

  
  /**
   * The last time that the device was considered accessible.
   **/
  public StorageSystemResponse lastContacted(Date lastContacted) {
    this.lastContacted = lastContacted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last time that the device was considered accessible.")
  @JsonProperty("lastContacted")
  public Date getLastContacted() {
    return lastContacted;
  }
  
  public void setLastContacted(Date lastContacted) {
    this.lastContacted = lastContacted;
  }

  
  /**
   * The number of partitions calculated from the user's current mappings.
   **/
  public StorageSystemResponse definedPartitionCount(Integer definedPartitionCount) {
    this.definedPartitionCount = definedPartitionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of partitions calculated from the user's current mappings.")
  @JsonProperty("definedPartitionCount")
  public Integer getDefinedPartitionCount() {
    return definedPartitionCount;
  }
  
  public void setDefinedPartitionCount(Integer definedPartitionCount) {
    this.definedPartitionCount = definedPartitionCount;
  }

  
  /**
   * True if the redundancy mode of the system is simplex.
   **/
  public StorageSystemResponse simplexModeEnabled(Boolean simplexModeEnabled) {
    this.simplexModeEnabled = simplexModeEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the redundancy mode of the system is simplex.")
  @JsonProperty("simplexModeEnabled")
  public Boolean getSimplexModeEnabled() {
    return simplexModeEnabled;
  }
  
  public void setSimplexModeEnabled(Boolean simplexModeEnabled) {
    this.simplexModeEnabled = simplexModeEnabled;
  }

  
  /**
   **/
  public StorageSystemResponse freePoolSpaceAsString(String freePoolSpaceAsString) {
    this.freePoolSpaceAsString = freePoolSpaceAsString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freePoolSpaceAsString")
  public String getFreePoolSpaceAsString() {
    return freePoolSpaceAsString;
  }
  
  public void setFreePoolSpaceAsString(String freePoolSpaceAsString) {
    this.freePoolSpaceAsString = freePoolSpaceAsString;
  }

  
  /**
   **/
  public StorageSystemResponse hotSpareSizeAsString(String hotSpareSizeAsString) {
    this.hotSpareSizeAsString = hotSpareSizeAsString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hotSpareSizeAsString")
  public String getHotSpareSizeAsString() {
    return hotSpareSizeAsString;
  }
  
  public void setHotSpareSizeAsString(String hotSpareSizeAsString) {
    this.hotSpareSizeAsString = hotSpareSizeAsString;
  }

  
  /**
   **/
  public StorageSystemResponse unconfiguredSpaceAsStrings(String unconfiguredSpaceAsStrings) {
    this.unconfiguredSpaceAsStrings = unconfiguredSpaceAsStrings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unconfiguredSpaceAsStrings")
  public String getUnconfiguredSpaceAsStrings() {
    return unconfiguredSpaceAsStrings;
  }
  
  public void setUnconfiguredSpaceAsStrings(String unconfiguredSpaceAsStrings) {
    this.unconfiguredSpaceAsStrings = unconfiguredSpaceAsStrings;
  }

  
  /**
   **/
  public StorageSystemResponse usedPoolSpaceAsString(String usedPoolSpaceAsString) {
    this.usedPoolSpaceAsString = usedPoolSpaceAsString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("usedPoolSpaceAsString")
  public String getUsedPoolSpaceAsString() {
    return usedPoolSpaceAsString;
  }
  
  public void setUsedPoolSpaceAsString(String usedPoolSpaceAsString) {
    this.usedPoolSpaceAsString = usedPoolSpaceAsString;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageSystemResponse storageSystemResponse = (StorageSystemResponse) o;
    return Objects.equals(this.id, storageSystemResponse.id) &&
        Objects.equals(this.name, storageSystemResponse.name) &&
        Objects.equals(this.wwn, storageSystemResponse.wwn) &&
        Objects.equals(this.passwordStatus, storageSystemResponse.passwordStatus) &&
        Objects.equals(this.passwordSet, storageSystemResponse.passwordSet) &&
        Objects.equals(this.status, storageSystemResponse.status) &&
        Objects.equals(this.ip1, storageSystemResponse.ip1) &&
        Objects.equals(this.ip2, storageSystemResponse.ip2) &&
        Objects.equals(this.driveCount, storageSystemResponse.driveCount) &&
        Objects.equals(this.trayCount, storageSystemResponse.trayCount) &&
        Objects.equals(this.traceEnabled, storageSystemResponse.traceEnabled) &&
        Objects.equals(this.types, storageSystemResponse.types) &&
        Objects.equals(this.model, storageSystemResponse.model) &&
        Objects.equals(this.metaTags, storageSystemResponse.metaTags) &&
        Objects.equals(this.hotSpareSize, storageSystemResponse.hotSpareSize) &&
        Objects.equals(this.usedPoolSpace, storageSystemResponse.usedPoolSpace) &&
        Objects.equals(this.freePoolSpace, storageSystemResponse.freePoolSpace) &&
        Objects.equals(this.unconfiguredSpace, storageSystemResponse.unconfiguredSpace) &&
        Objects.equals(this.driveTypes, storageSystemResponse.driveTypes) &&
        Objects.equals(this.hostSpareCountInStandby, storageSystemResponse.hostSpareCountInStandby) &&
        Objects.equals(this.hotSpareCount, storageSystemResponse.hotSpareCount) &&
        Objects.equals(this.hostSparesUsed, storageSystemResponse.hostSparesUsed) &&
        Objects.equals(this.bootTime, storageSystemResponse.bootTime) &&
        Objects.equals(this.fwVersion, storageSystemResponse.fwVersion) &&
        Objects.equals(this.appVersion, storageSystemResponse.appVersion) &&
        Objects.equals(this.bootVersion, storageSystemResponse.bootVersion) &&
        Objects.equals(this.nvsramVersion, storageSystemResponse.nvsramVersion) &&
        Objects.equals(this.chassisSerialNumber, storageSystemResponse.chassisSerialNumber) &&
        Objects.equals(this.accessVolume, storageSystemResponse.accessVolume) &&
        Objects.equals(this.unconfiguredSpaceByDriveType, storageSystemResponse.unconfiguredSpaceByDriveType) &&
        Objects.equals(this.mediaScanPeriod, storageSystemResponse.mediaScanPeriod) &&
        Objects.equals(this.driveChannelPortDisabled, storageSystemResponse.driveChannelPortDisabled) &&
        Objects.equals(this.recoveryModeEnabled, storageSystemResponse.recoveryModeEnabled) &&
        Objects.equals(this.autoLoadBalancingEnabled, storageSystemResponse.autoLoadBalancingEnabled) &&
        Objects.equals(this.remoteMirroringEnabled, storageSystemResponse.remoteMirroringEnabled) &&
        Objects.equals(this.fcRemoteMirroringState, storageSystemResponse.fcRemoteMirroringState) &&
        Objects.equals(this.asupEnabled, storageSystemResponse.asupEnabled) &&
        Objects.equals(this.securityKeyEnabled, storageSystemResponse.securityKeyEnabled) &&
        Objects.equals(this.lastContacted, storageSystemResponse.lastContacted) &&
        Objects.equals(this.definedPartitionCount, storageSystemResponse.definedPartitionCount) &&
        Objects.equals(this.simplexModeEnabled, storageSystemResponse.simplexModeEnabled) &&
        Objects.equals(this.freePoolSpaceAsString, storageSystemResponse.freePoolSpaceAsString) &&
        Objects.equals(this.hotSpareSizeAsString, storageSystemResponse.hotSpareSizeAsString) &&
        Objects.equals(this.unconfiguredSpaceAsStrings, storageSystemResponse.unconfiguredSpaceAsStrings) &&
        Objects.equals(this.usedPoolSpaceAsString, storageSystemResponse.usedPoolSpaceAsString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, wwn, passwordStatus, passwordSet, status, ip1, ip2, driveCount, trayCount, traceEnabled, types, model, metaTags, hotSpareSize, usedPoolSpace, freePoolSpace, unconfiguredSpace, driveTypes, hostSpareCountInStandby, hotSpareCount, hostSparesUsed, bootTime, fwVersion, appVersion, bootVersion, nvsramVersion, chassisSerialNumber, accessVolume, unconfiguredSpaceByDriveType, mediaScanPeriod, driveChannelPortDisabled, recoveryModeEnabled, autoLoadBalancingEnabled, remoteMirroringEnabled, fcRemoteMirroringState, asupEnabled, securityKeyEnabled, lastContacted, definedPartitionCount, simplexModeEnabled, freePoolSpaceAsString, hotSpareSizeAsString, unconfiguredSpaceAsStrings, usedPoolSpaceAsString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageSystemResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    passwordStatus: ").append(toIndentedString(passwordStatus)).append("\n");
    sb.append("    passwordSet: ").append(toIndentedString(passwordSet)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ip1: ").append(toIndentedString(ip1)).append("\n");
    sb.append("    ip2: ").append(toIndentedString(ip2)).append("\n");
    sb.append("    driveCount: ").append(toIndentedString(driveCount)).append("\n");
    sb.append("    trayCount: ").append(toIndentedString(trayCount)).append("\n");
    sb.append("    traceEnabled: ").append(toIndentedString(traceEnabled)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    metaTags: ").append(toIndentedString(metaTags)).append("\n");
    sb.append("    hotSpareSize: ").append(toIndentedString(hotSpareSize)).append("\n");
    sb.append("    usedPoolSpace: ").append(toIndentedString(usedPoolSpace)).append("\n");
    sb.append("    freePoolSpace: ").append(toIndentedString(freePoolSpace)).append("\n");
    sb.append("    unconfiguredSpace: ").append(toIndentedString(unconfiguredSpace)).append("\n");
    sb.append("    driveTypes: ").append(toIndentedString(driveTypes)).append("\n");
    sb.append("    hostSpareCountInStandby: ").append(toIndentedString(hostSpareCountInStandby)).append("\n");
    sb.append("    hotSpareCount: ").append(toIndentedString(hotSpareCount)).append("\n");
    sb.append("    hostSparesUsed: ").append(toIndentedString(hostSparesUsed)).append("\n");
    sb.append("    bootTime: ").append(toIndentedString(bootTime)).append("\n");
    sb.append("    fwVersion: ").append(toIndentedString(fwVersion)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    bootVersion: ").append(toIndentedString(bootVersion)).append("\n");
    sb.append("    nvsramVersion: ").append(toIndentedString(nvsramVersion)).append("\n");
    sb.append("    chassisSerialNumber: ").append(toIndentedString(chassisSerialNumber)).append("\n");
    sb.append("    accessVolume: ").append(toIndentedString(accessVolume)).append("\n");
    sb.append("    unconfiguredSpaceByDriveType: ").append(toIndentedString(unconfiguredSpaceByDriveType)).append("\n");
    sb.append("    mediaScanPeriod: ").append(toIndentedString(mediaScanPeriod)).append("\n");
    sb.append("    driveChannelPortDisabled: ").append(toIndentedString(driveChannelPortDisabled)).append("\n");
    sb.append("    recoveryModeEnabled: ").append(toIndentedString(recoveryModeEnabled)).append("\n");
    sb.append("    autoLoadBalancingEnabled: ").append(toIndentedString(autoLoadBalancingEnabled)).append("\n");
    sb.append("    remoteMirroringEnabled: ").append(toIndentedString(remoteMirroringEnabled)).append("\n");
    sb.append("    fcRemoteMirroringState: ").append(toIndentedString(fcRemoteMirroringState)).append("\n");
    sb.append("    asupEnabled: ").append(toIndentedString(asupEnabled)).append("\n");
    sb.append("    securityKeyEnabled: ").append(toIndentedString(securityKeyEnabled)).append("\n");
    sb.append("    lastContacted: ").append(toIndentedString(lastContacted)).append("\n");
    sb.append("    definedPartitionCount: ").append(toIndentedString(definedPartitionCount)).append("\n");
    sb.append("    simplexModeEnabled: ").append(toIndentedString(simplexModeEnabled)).append("\n");
    sb.append("    freePoolSpaceAsString: ").append(toIndentedString(freePoolSpaceAsString)).append("\n");
    sb.append("    hotSpareSizeAsString: ").append(toIndentedString(hotSpareSizeAsString)).append("\n");
    sb.append("    unconfiguredSpaceAsStrings: ").append(toIndentedString(unconfiguredSpaceAsStrings)).append("\n");
    sb.append("    usedPoolSpaceAsString: ").append(toIndentedString(usedPoolSpaceAsString)).append("\n");
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

