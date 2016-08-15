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
 * DriveEx
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DriveEx   {
  
    private Boolean offline;

    private Boolean hotSpare;

    private Boolean invalidDriveData;

    private Boolean available;

    private Boolean pfa;

    private String driveRef;


  /**
   * An indication of the current status of the drive. This field is valid for missing drives.
   */
  public enum StatusEnum {
    optimal("optimal"),
    failed("failed"),
    replaced("replaced"),
    bypassed("bypassed"),
    unresponsive("unresponsive"),
    removed("removed"),
    incompatible("incompatible"),
    dataRelocation("dataRelocation"),
    preFailCopy("preFailCopy"),
    preFailCopyPending("preFailCopyPending"),
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


  /**
   * An indication of the reason for the current status of the drive. This field is most useful when the current status is something other than optimal; it identifies the event that caused the status to change to its current value. This field is valid for missing drives.
   */
  public enum CauseEnum {
    none("none"),
    userOp("userOp"),
    writeOp("writeOp"),
    uncertified("uncertified"),
    speedMismatch("speedMismatch"),
    bypassUnknown("bypassUnknown"),
    wrongDriveType("wrongDriveType"),
    incompatibleUprevDacstore("incompatibleUprevDacstore"),
    incompatibleDownrevDacstore("incompatibleDownrevDacstore"),
    incompatibleInternalError("incompatibleInternalError"),
    incompatibleSectorSizeMismatch("incompatibleSectorSizeMismatch"),
    incompatibleNativeVgRefersToForeignDrive("incompatibleNativeVgRefersToForeignDrive"),
    incompatibleForeignVgRefersToNativeDrive("incompatibleForeignVgRefersToNativeDrive"),
    incompatibleNativeVgForeignDriveMutualRef("incompatibleNativeVgForeignDriveMutualRef"),
    incompatibleVgCloned("incompatibleVgCloned"),
    incompatibleForeignDriveInconsistent("incompatibleForeignDriveInconsistent"),
    incompatibleVgHasDrivePartOfMultipleVgs("incompatibleVgHasDrivePartOfMultipleVgs"),
    incompatibleForeignDriveHasInconsistentRole("incompatibleForeignDriveHasInconsistentRole"),
    incompatibleVgDrivePartOfMultipleVgs("incompatibleVgDrivePartOfMultipleVgs"),
    incompatibleFailedLegacyDrive("incompatibleFailedLegacyDrive"),
    incompatibleDdfOtherVendor("incompatibleDdfOtherVendor"),
    incompatibleDbAdoptionFailure("incompatibleDbAdoptionFailure"),
    locked("locked"),
    insufficientDriveCapacity("insufficientDriveCapacity"),
    supercapacitorFailure("supercapacitorFailure"),
    unsupportedProtocolConnection("unsupportedProtocolConnection"),
    unsupportedCapacity("unsupportedCapacity"),
    invalidLockKeyPresented("invalidLockKeyPresented"),
    incompatiblePiType("incompatiblePiType"),
    incompatibleDatabaseValidationFailure("incompatibleDatabaseValidationFailure"),
    incompatibleUnsupportedInterposerFwVersion("incompatibleUnsupportedInterposerFwVersion"),
    incompatibleSataDriveSctUnsupported("incompatibleSataDriveSctUnsupported"),
    incompatibleModelNumberUnsupported("incompatibleModelNumberUnsupported"),
    incompatibleAlignmentForEmulationDrive("incompatibleAlignmentForEmulationDrive"),
    srcRelocation("srcRelocation"),
    dstRelocation("dstRelocation"),
    incompatibleDriveMetadataUnusable("incompatibleDriveMetadataUnusable"),
    pfa("pfa"),
    spfa("spfa"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CauseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CauseEnum cause;

    private DriveTypeData interfaceType;

    private Location physicalLocation;

    private String manufacturer;

    private Long manufacturerDate;

    private String productID;

    private String serialNumber;

    private String softwareVersion;

    private Integer blkSize;

    private Long usableCapacity;

    private Long rawCapacity;

    private String worldWideName;

    private String currentVolumeGroupRef;

    private String sparedForDriveRef;

    private String mirrorDrive;

    private Boolean nonRedundantAccess;

    private Integer workingChannel;

    private Integer volumeGroupIndex;


  /**
   * The speed of the drive. Will be unknown for a SCSI drive.
   */
  public enum CurrentSpeedEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CurrentSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentSpeedEnum currentSpeed;


  /**
   * The maximum speed of the drive. Currently not used.
   */
  public enum MaxSpeedEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MaxSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MaxSpeedEnum maxSpeed;

    private Boolean uncertified;

    private Boolean hasDegradedChannel;

    private List<Integer> degradedChannels;


  /**
   * The physical drive type.
   */
  public enum PhyDriveTypeEnum {
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

    PhyDriveTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PhyDriveTypeEnum phyDriveType;

    private Integer spindleSpeed;

    private RTRAttributes rtrAttributes;

    private String reserved;

    private PhysicalDriveTypeData phyDriveTypeData;


  /**
   * The reason a PFA condition has been raised for this drive.
   */
  public enum PfaReasonEnum {
    unknown("unknown"),
    none("none"),
    driveReported("driveReported"),
    synthesized("synthesized"),
    ssdEndOfLife("ssdEndOfLife"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PfaReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PfaReasonEnum pfaReason;

    private List<ObjectReference> bypassSource;

    private RepairPolicy repairPolicy;

    private Boolean fdeCapable;

    private Boolean fdeEnabled;

    private Boolean fdeLocked;

    private String lockKeyID;

    private SSDWearLife ssdWearLife;


  /**
   * This field is set to the drive media type of the drive.
   */
  public enum DriveMediaTypeEnum {
    all("all"),
    unknown("unknown"),
    hdd("hdd"),
    ssd("ssd"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DriveMediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DriveMediaTypeEnum driveMediaType;

    private String fpgaVersion;

    private ProtectionInformationCapabilities protectionInformationCapabilities;

    private Boolean protectionInformationCapable;


  /**
   * Field is no longer used.
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

    private Boolean interposerPresent;

    private String interposerRef;

    private Integer currentCommandAgingTimeout;

    private Integer defaultCommandAgingTimeout;

    private DriveTemperature driveTemperature;

    private Integer blkSizePhysical;

    private Long lowestAlignedLBA;

    private Boolean removed;

    private Boolean locateInProgress;

    private Boolean fipsCapable;

    private String firmwareVersion;

    private String lockKeyIDValue;

    private String id;

  
  /**
   * True if the drive is in the offline state, false otherwise. This field is valid for missing drives.
   **/
  public DriveEx offline(Boolean offline) {
    this.offline = offline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the drive is in the offline state, false otherwise. This field is valid for missing drives.")
  @JsonProperty("offline")
  public Boolean getOffline() {
    return offline;
  }
  
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   * True if the drive has been designated as a hot spare; false otherwise. This field is valid for missing drives.
   **/
  public DriveEx hotSpare(Boolean hotSpare) {
    this.hotSpare = hotSpare;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the drive has been designated as a hot spare; false otherwise. This field is valid for missing drives.")
  @JsonProperty("hotSpare")
  public Boolean getHotSpare() {
    return hotSpare;
  }
  
  public void setHotSpare(Boolean hotSpare) {
    this.hotSpare = hotSpare;
  }

  
  /**
   * True if no drive information (serial #, capacity, etc.) can be obtained. This field is always true for missing drives.
   **/
  public DriveEx invalidDriveData(Boolean invalidDriveData) {
    this.invalidDriveData = invalidDriveData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if no drive information (serial #, capacity, etc.) can be obtained. This field is always true for missing drives.")
  @JsonProperty("invalidDriveData")
  public Boolean getInvalidDriveData() {
    return invalidDriveData;
  }
  
  public void setInvalidDriveData(Boolean invalidDriveData) {
    this.invalidDriveData = invalidDriveData;
  }

  
  /**
   * True if the drive is available for use in creating a new volume group; false otherwise. This field is valid for missing drives.
   **/
  public DriveEx available(Boolean available) {
    this.available = available;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the drive is available for use in creating a new volume group; false otherwise. This field is valid for missing drives.")
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }
  
  public void setAvailable(Boolean available) {
    this.available = available;
  }

  
  /**
   * True if the drive is drive Predicted Failure analysis predicts a drive failure. This field is valid for missing drives.
   **/
  public DriveEx pfa(Boolean pfa) {
    this.pfa = pfa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the drive is drive Predicted Failure analysis predicts a drive failure. This field is valid for missing drives.")
  @JsonProperty("pfa")
  public Boolean getPfa() {
    return pfa;
  }
  
  public void setPfa(Boolean pfa) {
    this.pfa = pfa;
  }

  
  /**
   * The identifier value for this drive. Other objects may use this reference value to refer to the drive. This field is valid for missing drives.
   **/
  public DriveEx driveRef(String driveRef) {
    this.driveRef = driveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier value for this drive. Other objects may use this reference value to refer to the drive. This field is valid for missing drives.")
  @JsonProperty("driveRef")
  public String getDriveRef() {
    return driveRef;
  }
  
  public void setDriveRef(String driveRef) {
    this.driveRef = driveRef;
  }

  
  /**
   * An indication of the current status of the drive. This field is valid for missing drives.
   **/
  public DriveEx status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of the current status of the drive. This field is valid for missing drives.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * An indication of the reason for the current status of the drive. This field is most useful when the current status is something other than optimal; it identifies the event that caused the status to change to its current value. This field is valid for missing drives.
   **/
  public DriveEx cause(CauseEnum cause) {
    this.cause = cause;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of the reason for the current status of the drive. This field is most useful when the current status is something other than optimal; it identifies the event that caused the status to change to its current value. This field is valid for missing drives.")
  @JsonProperty("cause")
  public CauseEnum getCause() {
    return cause;
  }
  
  public void setCause(CauseEnum cause) {
    this.cause = cause;
  }

  
  /**
   * Information about the I/O interface between the controller and the drive. For example, for a SCSI-attached drive, this field will contain information about the drive's channel and SCSI ID values. For other interface types, different data will be available in this field.
   **/
  public DriveEx interfaceType(DriveTypeData interfaceType) {
    this.interfaceType = interfaceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the I/O interface between the controller and the drive. For example, for a SCSI-attached drive, this field will contain information about the drive's channel and SCSI ID values. For other interface types, different data will be available in this field.")
  @JsonProperty("interfaceType")
  public DriveTypeData getInterfaceType() {
    return interfaceType;
  }
  
  public void setInterfaceType(DriveTypeData interfaceType) {
    this.interfaceType = interfaceType;
  }

  
  /**
   * The physical location of the drive. Beginning with the Allegheny release, the parent reference in Location identifies the tray or drawer containing the drive, and the position field is the parent-relative/like-component relative slot number of the drive, starting at 1. For missing drives this field contains the last known location.
   **/
  public DriveEx physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the drive. Beginning with the Allegheny release, the parent reference in Location identifies the tray or drawer containing the drive, and the position field is the parent-relative/like-component relative slot number of the drive, starting at 1. For missing drives this field contains the last known location.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * The variable-length ASCII text string that identifies the drive manufacturer. Note that this information is not returned for most Serial ATA (SATA) drives.
   **/
  public DriveEx manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string that identifies the drive manufacturer. Note that this information is not returned for most Serial ATA (SATA) drives.")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * The date of manufacture of the drive, represented in seconds since midnight GMT on January 1, 1970. Note that this information is not returned for most Serial ATA (SATA) drives.
   **/
  public DriveEx manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date of manufacture of the drive, represented in seconds since midnight GMT on January 1, 1970. Note that this information is not returned for most Serial ATA (SATA) drives.")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   * The variable-length ASCII text string that identifies the product by name, as assigned by the manufacturer.
   **/
  public DriveEx productID(String productID) {
    this.productID = productID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string that identifies the product by name, as assigned by the manufacturer.")
  @JsonProperty("productID")
  public String getProductID() {
    return productID;
  }
  
  public void setProductID(String productID) {
    this.productID = productID;
  }

  
  /**
   * The variable-length ASCII text string for the serial number of the drive.
   **/
  public DriveEx serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string for the serial number of the drive.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * This data is a variable-length ASCII text string. If an interposer is present in front of SATA drives, the string identifies the version of the interposer package. In this case, the SATA drive firmware version can be found in the physicalDriveTypeData field. If an interposer is not present (always the case for Fibre Channel drives) this field describes the drive firmware version.
   **/
  public DriveEx softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable-length ASCII text string. If an interposer is present in front of SATA drives, the string identifies the version of the interposer package. In this case, the SATA drive firmware version can be found in the physicalDriveTypeData field. If an interposer is not present (always the case for Fibre Channel drives) this field describes the drive firmware version.")
  @JsonProperty("softwareVersion")
  public String getSoftwareVersion() {
    return softwareVersion;
  }
  
  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  
  /**
   * The block (i.e. sector) size used by the drive, represented in bytes. This field is valid for missing drives.
   **/
  public DriveEx blkSize(Integer blkSize) {
    this.blkSize = blkSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The block (i.e. sector) size used by the drive, represented in bytes. This field is valid for missing drives.")
  @JsonProperty("blkSize")
  public Integer getBlkSize() {
    return blkSize;
  }
  
  public void setBlkSize(Integer blkSize) {
    this.blkSize = blkSize;
  }

  
  /**
   * The usable capacity of the drive, in bytes, after accounting for any space that is reserved for use by the array controller for overhead information. This field is valid for missing drives.
   **/
  public DriveEx usableCapacity(Long usableCapacity) {
    this.usableCapacity = usableCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The usable capacity of the drive, in bytes, after accounting for any space that is reserved for use by the array controller for overhead information. This field is valid for missing drives.")
  @JsonProperty("usableCapacity")
  public Long getUsableCapacity() {
    return usableCapacity;
  }
  
  public void setUsableCapacity(Long usableCapacity) {
    this.usableCapacity = usableCapacity;
  }

  
  /**
   * The raw capacity of the drive, in bytes. This field is valid for missing drives.
   **/
  public DriveEx rawCapacity(Long rawCapacity) {
    this.rawCapacity = rawCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The raw capacity of the drive, in bytes. This field is valid for missing drives.")
  @JsonProperty("rawCapacity")
  public Long getRawCapacity() {
    return rawCapacity;
  }
  
  public void setRawCapacity(Long rawCapacity) {
    this.rawCapacity = rawCapacity;
  }

  
  /**
   * A variable-length, opaque field that contains the drive's world-wide name, or globally unique identifier value. This field is valid for missing drives.
   **/
  public DriveEx worldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length, opaque field that contains the drive's world-wide name, or globally unique identifier value. This field is valid for missing drives.")
  @JsonProperty("worldWideName")
  public String getWorldWideName() {
    return worldWideName;
  }
  
  public void setWorldWideName(String worldWideName) {
    this.worldWideName = worldWideName;
  }

  
  /**
   * The reference value of the volume group, disk pool, or flash cache to which this drive is currently assigned. If a hot spare drive is actively sparing for a failed drive, this field will identify the volume group, disk pool, or flash cache that is using the hot spare drive. If the drive is not currently assigned, or is an idle hot spare, the reference value will be null. This field is valid for missing drives.
   **/
  public DriveEx currentVolumeGroupRef(String currentVolumeGroupRef) {
    this.currentVolumeGroupRef = currentVolumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value of the volume group, disk pool, or flash cache to which this drive is currently assigned. If a hot spare drive is actively sparing for a failed drive, this field will identify the volume group, disk pool, or flash cache that is using the hot spare drive. If the drive is not currently assigned, or is an idle hot spare, the reference value will be null. This field is valid for missing drives.")
  @JsonProperty("currentVolumeGroupRef")
  public String getCurrentVolumeGroupRef() {
    return currentVolumeGroupRef;
  }
  
  public void setCurrentVolumeGroupRef(String currentVolumeGroupRef) {
    this.currentVolumeGroupRef = currentVolumeGroupRef;
  }

  
  /**
   * The reference value of the drive for which this drive is acting as a hot spare. This field is only used if the Drive object represents a global hot spare that is actively sparing for a failed drive. This field is valid for missing drives.
   **/
  public DriveEx sparedForDriveRef(String sparedForDriveRef) {
    this.sparedForDriveRef = sparedForDriveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value of the drive for which this drive is acting as a hot spare. This field is only used if the Drive object represents a global hot spare that is actively sparing for a failed drive. This field is valid for missing drives.")
  @JsonProperty("sparedForDriveRef")
  public String getSparedForDriveRef() {
    return sparedForDriveRef;
  }
  
  public void setSparedForDriveRef(String sparedForDriveRef) {
    this.sparedForDriveRef = sparedForDriveRef;
  }

  
  /**
   * This field is only used if the Drive object represents a drive that is part of a RAID-1 volume group. It identifies the drive that is tied to this one for RAID-1 mirroring operations. This field is valid for missing drives.
   **/
  public DriveEx mirrorDrive(String mirrorDrive) {
    this.mirrorDrive = mirrorDrive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is only used if the Drive object represents a drive that is part of a RAID-1 volume group. It identifies the drive that is tied to this one for RAID-1 mirroring operations. This field is valid for missing drives.")
  @JsonProperty("mirrorDrive")
  public String getMirrorDrive() {
    return mirrorDrive;
  }
  
  public void setMirrorDrive(String mirrorDrive) {
    this.mirrorDrive = mirrorDrive;
  }

  
  /**
   * True if the drive does not have redundant access.
   **/
  public DriveEx nonRedundantAccess(Boolean nonRedundantAccess) {
    this.nonRedundantAccess = nonRedundantAccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the drive does not have redundant access.")
  @JsonProperty("nonRedundantAccess")
  public Boolean getNonRedundantAccess() {
    return nonRedundantAccess;
  }
  
  public void setNonRedundantAccess(Boolean nonRedundantAccess) {
    this.nonRedundantAccess = nonRedundantAccess;
  }

  
  /**
   * The channel to the tray that is still operational (if nonRedundantAccess is True).
   **/
  public DriveEx workingChannel(Integer workingChannel) {
    this.workingChannel = workingChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel to the tray that is still operational (if nonRedundantAccess is True).")
  @JsonProperty("workingChannel")
  public Integer getWorkingChannel() {
    return workingChannel;
  }
  
  public void setWorkingChannel(Integer workingChannel) {
    this.workingChannel = workingChannel;
  }

  
  /**
   * The volume group index. This is the zero-relative position of the drive with respect to the stripe-ordering for the volume group. A value of -1 indicates that the drive does not belong to any group. This field is valid for missing drives.
   **/
  public DriveEx volumeGroupIndex(Integer volumeGroupIndex) {
    this.volumeGroupIndex = volumeGroupIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume group index. This is the zero-relative position of the drive with respect to the stripe-ordering for the volume group. A value of -1 indicates that the drive does not belong to any group. This field is valid for missing drives.")
  @JsonProperty("volumeGroupIndex")
  public Integer getVolumeGroupIndex() {
    return volumeGroupIndex;
  }
  
  public void setVolumeGroupIndex(Integer volumeGroupIndex) {
    this.volumeGroupIndex = volumeGroupIndex;
  }

  
  /**
   * The speed of the drive. Will be unknown for a SCSI drive.
   **/
  public DriveEx currentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The speed of the drive. Will be unknown for a SCSI drive.")
  @JsonProperty("currentSpeed")
  public CurrentSpeedEnum getCurrentSpeed() {
    return currentSpeed;
  }
  
  public void setCurrentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  
  /**
   * The maximum speed of the drive. Currently not used.
   **/
  public DriveEx maxSpeed(MaxSpeedEnum maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum speed of the drive. Currently not used.")
  @JsonProperty("maxSpeed")
  public MaxSpeedEnum getMaxSpeed() {
    return maxSpeed;
  }
  
  public void setMaxSpeed(MaxSpeedEnum maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  
  /**
   * True, if the drive has the DR_UNCERTIFIED flag set. This field is valid for missing drives.
   **/
  public DriveEx uncertified(Boolean uncertified) {
    this.uncertified = uncertified;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if the drive has the DR_UNCERTIFIED flag set. This field is valid for missing drives.")
  @JsonProperty("uncertified")
  public Boolean getUncertified() {
    return uncertified;
  }
  
  public void setUncertified(Boolean uncertified) {
    this.uncertified = uncertified;
  }

  
  /**
   * True, if a path to this drive is degraded.
   **/
  public DriveEx hasDegradedChannel(Boolean hasDegradedChannel) {
    this.hasDegradedChannel = hasDegradedChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if a path to this drive is degraded.")
  @JsonProperty("hasDegradedChannel")
  public Boolean getHasDegradedChannel() {
    return hasDegradedChannel;
  }
  
  public void setHasDegradedChannel(Boolean hasDegradedChannel) {
    this.hasDegradedChannel = hasDegradedChannel;
  }

  
  /**
   * The IDs of degraded channels.
   **/
  public DriveEx degradedChannels(List<Integer> degradedChannels) {
    this.degradedChannels = degradedChannels;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of degraded channels.")
  @JsonProperty("degradedChannels")
  public List<Integer> getDegradedChannels() {
    return degradedChannels;
  }
  
  public void setDegradedChannels(List<Integer> degradedChannels) {
    this.degradedChannels = degradedChannels;
  }

  
  /**
   * The physical drive type.
   **/
  public DriveEx phyDriveType(PhyDriveTypeEnum phyDriveType) {
    this.phyDriveType = phyDriveType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical drive type.")
  @JsonProperty("phyDriveType")
  public PhyDriveTypeEnum getPhyDriveType() {
    return phyDriveType;
  }
  
  public void setPhyDriveType(PhyDriveTypeEnum phyDriveType) {
    this.phyDriveType = phyDriveType;
  }

  
  /**
   * The drive reported spindle speed. Solid State Disk (SSD) drives report zero.
   **/
  public DriveEx spindleSpeed(Integer spindleSpeed) {
    this.spindleSpeed = spindleSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The drive reported spindle speed. Solid State Disk (SSD) drives report zero.")
  @JsonProperty("spindleSpeed")
  public Integer getSpindleSpeed() {
    return spindleSpeed;
  }
  
  public void setSpindleSpeed(Integer spindleSpeed) {
    this.spindleSpeed = spindleSpeed;
  }

  
  /**
   * The CRU type of the drive plus its ready-to-remove attributes, which are based on the CRU type.
   **/
  public DriveEx rtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The CRU type of the drive plus its ready-to-remove attributes, which are based on the CRU type.")
  @JsonProperty("rtrAttributes")
  public RTRAttributes getRtrAttributes() {
    return rtrAttributes;
  }
  
  public void setRtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
  }

  
  /**
   * reserved.
   **/
  public DriveEx reserved(String reserved) {
    this.reserved = reserved;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "reserved.")
  @JsonProperty("reserved")
  public String getReserved() {
    return reserved;
  }
  
  public void setReserved(String reserved) {
    this.reserved = reserved;
  }

  
  /**
   * Information specific to a physical drive type.
   **/
  public DriveEx phyDriveTypeData(PhysicalDriveTypeData phyDriveTypeData) {
    this.phyDriveTypeData = phyDriveTypeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information specific to a physical drive type.")
  @JsonProperty("phyDriveTypeData")
  public PhysicalDriveTypeData getPhyDriveTypeData() {
    return phyDriveTypeData;
  }
  
  public void setPhyDriveTypeData(PhysicalDriveTypeData phyDriveTypeData) {
    this.phyDriveTypeData = phyDriveTypeData;
  }

  
  /**
   * The reason a PFA condition has been raised for this drive.
   **/
  public DriveEx pfaReason(PfaReasonEnum pfaReason) {
    this.pfaReason = pfaReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reason a PFA condition has been raised for this drive.")
  @JsonProperty("pfaReason")
  public PfaReasonEnum getPfaReason() {
    return pfaReason;
  }
  
  public void setPfaReason(PfaReasonEnum pfaReason) {
    this.pfaReason = pfaReason;
  }

  
  /**
   * A list of object references where each reference identifies the source of a drive bypass condition. Possible referenced objects include the drive itself, a controller, or the ESM(s). When the bypass source is a controller or the drive, the list will typically hold just one reference; when the bypass source is the ESM(s), the list can hold up to two references, indicating either one or both ESMs. The list normally holds valid data whenever the drive is in the bypassed state (DRIVE_STAT_BYPASSED) , however it may be empty if the source of the bypass is unknown. It is also possible for the list to hold valid data when the drive is optimal, if only one ESM has bypassed the drive.
   **/
  public DriveEx bypassSource(List<ObjectReference> bypassSource) {
    this.bypassSource = bypassSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of object references where each reference identifies the source of a drive bypass condition. Possible referenced objects include the drive itself, a controller, or the ESM(s). When the bypass source is a controller or the drive, the list will typically hold just one reference; when the bypass source is the ESM(s), the list can hold up to two references, indicating either one or both ESMs. The list normally holds valid data whenever the drive is in the bypassed state (DRIVE_STAT_BYPASSED) , however it may be empty if the source of the bypass is unknown. It is also possible for the list to hold valid data when the drive is optimal, if only one ESM has bypassed the drive.")
  @JsonProperty("bypassSource")
  public List<ObjectReference> getBypassSource() {
    return bypassSource;
  }
  
  public void setBypassSource(List<ObjectReference> bypassSource) {
    this.bypassSource = bypassSource;
  }

  
  /**
   * This field contains the repair policy for the Drive.
   **/
  public DriveEx repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the repair policy for the Drive.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   * True if the drive supports FDE, false otherwise
   **/
  public DriveEx fdeCapable(Boolean fdeCapable) {
    this.fdeCapable = fdeCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the drive supports FDE, false otherwise")
  @JsonProperty("fdeCapable")
  public Boolean getFdeCapable() {
    return fdeCapable;
  }
  
  public void setFdeCapable(Boolean fdeCapable) {
    this.fdeCapable = fdeCapable;
  }

  
  /**
   * true if drive security is enabled; false if disabled
   **/
  public DriveEx fdeEnabled(Boolean fdeEnabled) {
    this.fdeEnabled = fdeEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "true if drive security is enabled; false if disabled")
  @JsonProperty("fdeEnabled")
  public Boolean getFdeEnabled() {
    return fdeEnabled;
  }
  
  public void setFdeEnabled(Boolean fdeEnabled) {
    this.fdeEnabled = fdeEnabled;
  }

  
  /**
   * True if the drive is locked, false if the drive is unlocked
   **/
  public DriveEx fdeLocked(Boolean fdeLocked) {
    this.fdeLocked = fdeLocked;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the drive is locked, false if the drive is unlocked")
  @JsonProperty("fdeLocked")
  public Boolean getFdeLocked() {
    return fdeLocked;
  }
  
  public void setFdeLocked(Boolean fdeLocked) {
    this.fdeLocked = fdeLocked;
  }

  
  /**
   * The lock key ID as read from the drive.
   **/
  public DriveEx lockKeyID(String lockKeyID) {
    this.lockKeyID = lockKeyID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The lock key ID as read from the drive.")
  @JsonProperty("lockKeyID")
  public String getLockKeyID() {
    return lockKeyID;
  }
  
  public void setLockKeyID(String lockKeyID) {
    this.lockKeyID = lockKeyID;
  }

  
  /**
   * Contains wear life data for the SSD drive.
   **/
  public DriveEx ssdWearLife(SSDWearLife ssdWearLife) {
    this.ssdWearLife = ssdWearLife;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains wear life data for the SSD drive.")
  @JsonProperty("ssdWearLife")
  public SSDWearLife getSsdWearLife() {
    return ssdWearLife;
  }
  
  public void setSsdWearLife(SSDWearLife ssdWearLife) {
    this.ssdWearLife = ssdWearLife;
  }

  
  /**
   * This field is set to the drive media type of the drive.
   **/
  public DriveEx driveMediaType(DriveMediaTypeEnum driveMediaType) {
    this.driveMediaType = driveMediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is set to the drive media type of the drive.")
  @JsonProperty("driveMediaType")
  public DriveMediaTypeEnum getDriveMediaType() {
    return driveMediaType;
  }
  
  public void setDriveMediaType(DriveMediaTypeEnum driveMediaType) {
    this.driveMediaType = driveMediaType;
  }

  
  /**
   * This data is a variable-length ASCII text string that identifies the version of the FPGA package.
   **/
  public DriveEx fpgaVersion(String fpgaVersion) {
    this.fpgaVersion = fpgaVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable-length ASCII text string that identifies the version of the FPGA package.")
  @JsonProperty("fpgaVersion")
  public String getFpgaVersion() {
    return fpgaVersion;
  }
  
  public void setFpgaVersion(String fpgaVersion) {
    this.fpgaVersion = fpgaVersion;
  }

  
  /**
   * This structure contains a protectionInformationCapable field which is set to true when the drive is formatted to support type 2 protection with a 512-byte logical block size, or if the drive is a type 0 drive formatted with a 520-byte logical block size. It also contains a field that is set to the protection type provided for the drive.
   **/
  public DriveEx protectionInformationCapabilities(ProtectionInformationCapabilities protectionInformationCapabilities) {
    this.protectionInformationCapabilities = protectionInformationCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure contains a protectionInformationCapable field which is set to true when the drive is formatted to support type 2 protection with a 512-byte logical block size, or if the drive is a type 0 drive formatted with a 520-byte logical block size. It also contains a field that is set to the protection type provided for the drive.")
  @JsonProperty("protectionInformationCapabilities")
  public ProtectionInformationCapabilities getProtectionInformationCapabilities() {
    return protectionInformationCapabilities;
  }
  
  public void setProtectionInformationCapabilities(ProtectionInformationCapabilities protectionInformationCapabilities) {
    this.protectionInformationCapabilities = protectionInformationCapabilities;
  }

  
  /**
   * Field is no longer used.
   **/
  public DriveEx protectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Field is no longer used.")
  @JsonProperty("protectionInformationCapable")
  public Boolean getProtectionInformationCapable() {
    return protectionInformationCapable;
  }
  
  public void setProtectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
  }

  
  /**
   * Field is no longer used.
   **/
  public DriveEx protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Field is no longer used.")
  @JsonProperty("protectionType")
  public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }
  
  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  
  /**
   * A value of true for this property means the drive is behind an interposer.
   **/
  public DriveEx interposerPresent(Boolean interposerPresent) {
    this.interposerPresent = interposerPresent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A value of true for this property means the drive is behind an interposer.")
  @JsonProperty("interposerPresent")
  public Boolean getInterposerPresent() {
    return interposerPresent;
  }
  
  public void setInterposerPresent(Boolean interposerPresent) {
    this.interposerPresent = interposerPresent;
  }

  
  /**
   * The drive interposer identifier. This field is valid only if the interposerPresent field is set to True.
   **/
  public DriveEx interposerRef(String interposerRef) {
    this.interposerRef = interposerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The drive interposer identifier. This field is valid only if the interposerPresent field is set to True.")
  @JsonProperty("interposerRef")
  public String getInterposerRef() {
    return interposerRef;
  }
  
  public void setInterposerRef(String interposerRef) {
    this.interposerRef = interposerRef;
  }

  
  /**
   * The current command aging timeout value in hundreds of milliseconds. If this value is 0 the default command aging timeout value will be used, otherwise this value overrides the default value.
   **/
  public DriveEx currentCommandAgingTimeout(Integer currentCommandAgingTimeout) {
    this.currentCommandAgingTimeout = currentCommandAgingTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current command aging timeout value in hundreds of milliseconds. If this value is 0 the default command aging timeout value will be used, otherwise this value overrides the default value.")
  @JsonProperty("currentCommandAgingTimeout")
  public Integer getCurrentCommandAgingTimeout() {
    return currentCommandAgingTimeout;
  }
  
  public void setCurrentCommandAgingTimeout(Integer currentCommandAgingTimeout) {
    this.currentCommandAgingTimeout = currentCommandAgingTimeout;
  }

  
  /**
   * The default command aging timeout value in hundreds of milliseconds as specified by the drive. If this value is 0, the drive command aging timeout cannot be changed.
   **/
  public DriveEx defaultCommandAgingTimeout(Integer defaultCommandAgingTimeout) {
    this.defaultCommandAgingTimeout = defaultCommandAgingTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The default command aging timeout value in hundreds of milliseconds as specified by the drive. If this value is 0, the drive command aging timeout cannot be changed.")
  @JsonProperty("defaultCommandAgingTimeout")
  public Integer getDefaultCommandAgingTimeout() {
    return defaultCommandAgingTimeout;
  }
  
  public void setDefaultCommandAgingTimeout(Integer defaultCommandAgingTimeout) {
    this.defaultCommandAgingTimeout = defaultCommandAgingTimeout;
  }

  
  /**
   * Drive temperature data.
   **/
  public DriveEx driveTemperature(DriveTemperature driveTemperature) {
    this.driveTemperature = driveTemperature;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Drive temperature data.")
  @JsonProperty("driveTemperature")
  public DriveTemperature getDriveTemperature() {
    return driveTemperature;
  }
  
  public void setDriveTemperature(DriveTemperature driveTemperature) {
    this.driveTemperature = driveTemperature;
  }

  
  /**
   * The physical block (i.e., sector) size for the drive, represented in bytes. This field is valid for missing drives.
   **/
  public DriveEx blkSizePhysical(Integer blkSizePhysical) {
    this.blkSizePhysical = blkSizePhysical;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical block (i.e., sector) size for the drive, represented in bytes. This field is valid for missing drives.")
  @JsonProperty("blkSizePhysical")
  public Integer getBlkSizePhysical() {
    return blkSizePhysical;
  }
  
  public void setBlkSizePhysical(Integer blkSizePhysical) {
    this.blkSizePhysical = blkSizePhysical;
  }

  
  /**
   * The lowest aligned LBA for the physical sector. Typically this will be 0, but could be non-zero for emulation drives where LBA 0 starts at some logical sector offset within the physical sector.
   **/
  public DriveEx lowestAlignedLBA(Long lowestAlignedLBA) {
    this.lowestAlignedLBA = lowestAlignedLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The lowest aligned LBA for the physical sector. Typically this will be 0, but could be non-zero for emulation drives where LBA 0 starts at some logical sector offset within the physical sector.")
  @JsonProperty("lowestAlignedLBA")
  public Long getLowestAlignedLBA() {
    return lowestAlignedLBA;
  }
  
  public void setLowestAlignedLBA(Long lowestAlignedLBA) {
    this.lowestAlignedLBA = lowestAlignedLBA;
  }

  
  /**
   * True if the drive is in the process of being removed from the volume group. Only applies to Disk Pools
   **/
  public DriveEx removed(Boolean removed) {
    this.removed = removed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the drive is in the process of being removed from the volume group. Only applies to Disk Pools")
  @JsonProperty("removed")
  public Boolean getRemoved() {
    return removed;
  }
  
  public void setRemoved(Boolean removed) {
    this.removed = removed;
  }

  
  /**
   * Indicates that a locate operation for the device is currently active. The device will show a visual indication to aid an operator in locating the drive.
   **/
  public DriveEx locateInProgress(Boolean locateInProgress) {
    this.locateInProgress = locateInProgress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates that a locate operation for the device is currently active. The device will show a visual indication to aid an operator in locating the drive.")
  @JsonProperty("locateInProgress")
  public Boolean getLocateInProgress() {
    return locateInProgress;
  }
  
  public void setLocateInProgress(Boolean locateInProgress) {
    this.locateInProgress = locateInProgress;
  }

  
  /**
   * This flag is true if the drive supports FIPS (Federal Information Processing Standard). FIPS 140-2 specification.
   **/
  public DriveEx fipsCapable(Boolean fipsCapable) {
    this.fipsCapable = fipsCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This flag is true if the drive supports FIPS (Federal Information Processing Standard). FIPS 140-2 specification.")
  @JsonProperty("fipsCapable")
  public Boolean getFipsCapable() {
    return fipsCapable;
  }
  
  public void setFipsCapable(Boolean fipsCapable) {
    this.fipsCapable = fipsCapable;
  }

  
  /**
   **/
  public DriveEx firmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firmwareVersion")
  public String getFirmwareVersion() {
    return firmwareVersion;
  }
  
  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  
  /**
   **/
  public DriveEx lockKeyIDValue(String lockKeyIDValue) {
    this.lockKeyIDValue = lockKeyIDValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockKeyIDValue")
  public String getLockKeyIDValue() {
    return lockKeyIDValue;
  }
  
  public void setLockKeyIDValue(String lockKeyIDValue) {
    this.lockKeyIDValue = lockKeyIDValue;
  }

  
  /**
   **/
  public DriveEx id(String id) {
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
    DriveEx driveEx = (DriveEx) o;
    return Objects.equals(this.offline, driveEx.offline) &&
        Objects.equals(this.hotSpare, driveEx.hotSpare) &&
        Objects.equals(this.invalidDriveData, driveEx.invalidDriveData) &&
        Objects.equals(this.available, driveEx.available) &&
        Objects.equals(this.pfa, driveEx.pfa) &&
        Objects.equals(this.driveRef, driveEx.driveRef) &&
        Objects.equals(this.status, driveEx.status) &&
        Objects.equals(this.cause, driveEx.cause) &&
        Objects.equals(this.interfaceType, driveEx.interfaceType) &&
        Objects.equals(this.physicalLocation, driveEx.physicalLocation) &&
        Objects.equals(this.manufacturer, driveEx.manufacturer) &&
        Objects.equals(this.manufacturerDate, driveEx.manufacturerDate) &&
        Objects.equals(this.productID, driveEx.productID) &&
        Objects.equals(this.serialNumber, driveEx.serialNumber) &&
        Objects.equals(this.softwareVersion, driveEx.softwareVersion) &&
        Objects.equals(this.blkSize, driveEx.blkSize) &&
        Objects.equals(this.usableCapacity, driveEx.usableCapacity) &&
        Objects.equals(this.rawCapacity, driveEx.rawCapacity) &&
        Objects.equals(this.worldWideName, driveEx.worldWideName) &&
        Objects.equals(this.currentVolumeGroupRef, driveEx.currentVolumeGroupRef) &&
        Objects.equals(this.sparedForDriveRef, driveEx.sparedForDriveRef) &&
        Objects.equals(this.mirrorDrive, driveEx.mirrorDrive) &&
        Objects.equals(this.nonRedundantAccess, driveEx.nonRedundantAccess) &&
        Objects.equals(this.workingChannel, driveEx.workingChannel) &&
        Objects.equals(this.volumeGroupIndex, driveEx.volumeGroupIndex) &&
        Objects.equals(this.currentSpeed, driveEx.currentSpeed) &&
        Objects.equals(this.maxSpeed, driveEx.maxSpeed) &&
        Objects.equals(this.uncertified, driveEx.uncertified) &&
        Objects.equals(this.hasDegradedChannel, driveEx.hasDegradedChannel) &&
        Objects.equals(this.degradedChannels, driveEx.degradedChannels) &&
        Objects.equals(this.phyDriveType, driveEx.phyDriveType) &&
        Objects.equals(this.spindleSpeed, driveEx.spindleSpeed) &&
        Objects.equals(this.rtrAttributes, driveEx.rtrAttributes) &&
        Objects.equals(this.reserved, driveEx.reserved) &&
        Objects.equals(this.phyDriveTypeData, driveEx.phyDriveTypeData) &&
        Objects.equals(this.pfaReason, driveEx.pfaReason) &&
        Objects.equals(this.bypassSource, driveEx.bypassSource) &&
        Objects.equals(this.repairPolicy, driveEx.repairPolicy) &&
        Objects.equals(this.fdeCapable, driveEx.fdeCapable) &&
        Objects.equals(this.fdeEnabled, driveEx.fdeEnabled) &&
        Objects.equals(this.fdeLocked, driveEx.fdeLocked) &&
        Objects.equals(this.lockKeyID, driveEx.lockKeyID) &&
        Objects.equals(this.ssdWearLife, driveEx.ssdWearLife) &&
        Objects.equals(this.driveMediaType, driveEx.driveMediaType) &&
        Objects.equals(this.fpgaVersion, driveEx.fpgaVersion) &&
        Objects.equals(this.protectionInformationCapabilities, driveEx.protectionInformationCapabilities) &&
        Objects.equals(this.protectionInformationCapable, driveEx.protectionInformationCapable) &&
        Objects.equals(this.protectionType, driveEx.protectionType) &&
        Objects.equals(this.interposerPresent, driveEx.interposerPresent) &&
        Objects.equals(this.interposerRef, driveEx.interposerRef) &&
        Objects.equals(this.currentCommandAgingTimeout, driveEx.currentCommandAgingTimeout) &&
        Objects.equals(this.defaultCommandAgingTimeout, driveEx.defaultCommandAgingTimeout) &&
        Objects.equals(this.driveTemperature, driveEx.driveTemperature) &&
        Objects.equals(this.blkSizePhysical, driveEx.blkSizePhysical) &&
        Objects.equals(this.lowestAlignedLBA, driveEx.lowestAlignedLBA) &&
        Objects.equals(this.removed, driveEx.removed) &&
        Objects.equals(this.locateInProgress, driveEx.locateInProgress) &&
        Objects.equals(this.fipsCapable, driveEx.fipsCapable) &&
        Objects.equals(this.firmwareVersion, driveEx.firmwareVersion) &&
        Objects.equals(this.lockKeyIDValue, driveEx.lockKeyIDValue) &&
        Objects.equals(this.id, driveEx.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offline, hotSpare, invalidDriveData, available, pfa, driveRef, status, cause, interfaceType, physicalLocation, manufacturer, manufacturerDate, productID, serialNumber, softwareVersion, blkSize, usableCapacity, rawCapacity, worldWideName, currentVolumeGroupRef, sparedForDriveRef, mirrorDrive, nonRedundantAccess, workingChannel, volumeGroupIndex, currentSpeed, maxSpeed, uncertified, hasDegradedChannel, degradedChannels, phyDriveType, spindleSpeed, rtrAttributes, reserved, phyDriveTypeData, pfaReason, bypassSource, repairPolicy, fdeCapable, fdeEnabled, fdeLocked, lockKeyID, ssdWearLife, driveMediaType, fpgaVersion, protectionInformationCapabilities, protectionInformationCapable, protectionType, interposerPresent, interposerRef, currentCommandAgingTimeout, defaultCommandAgingTimeout, driveTemperature, blkSizePhysical, lowestAlignedLBA, removed, locateInProgress, fipsCapable, firmwareVersion, lockKeyIDValue, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveEx {\n");
    
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    hotSpare: ").append(toIndentedString(hotSpare)).append("\n");
    sb.append("    invalidDriveData: ").append(toIndentedString(invalidDriveData)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    pfa: ").append(toIndentedString(pfa)).append("\n");
    sb.append("    driveRef: ").append(toIndentedString(driveRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    blkSize: ").append(toIndentedString(blkSize)).append("\n");
    sb.append("    usableCapacity: ").append(toIndentedString(usableCapacity)).append("\n");
    sb.append("    rawCapacity: ").append(toIndentedString(rawCapacity)).append("\n");
    sb.append("    worldWideName: ").append(toIndentedString(worldWideName)).append("\n");
    sb.append("    currentVolumeGroupRef: ").append(toIndentedString(currentVolumeGroupRef)).append("\n");
    sb.append("    sparedForDriveRef: ").append(toIndentedString(sparedForDriveRef)).append("\n");
    sb.append("    mirrorDrive: ").append(toIndentedString(mirrorDrive)).append("\n");
    sb.append("    nonRedundantAccess: ").append(toIndentedString(nonRedundantAccess)).append("\n");
    sb.append("    workingChannel: ").append(toIndentedString(workingChannel)).append("\n");
    sb.append("    volumeGroupIndex: ").append(toIndentedString(volumeGroupIndex)).append("\n");
    sb.append("    currentSpeed: ").append(toIndentedString(currentSpeed)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    uncertified: ").append(toIndentedString(uncertified)).append("\n");
    sb.append("    hasDegradedChannel: ").append(toIndentedString(hasDegradedChannel)).append("\n");
    sb.append("    degradedChannels: ").append(toIndentedString(degradedChannels)).append("\n");
    sb.append("    phyDriveType: ").append(toIndentedString(phyDriveType)).append("\n");
    sb.append("    spindleSpeed: ").append(toIndentedString(spindleSpeed)).append("\n");
    sb.append("    rtrAttributes: ").append(toIndentedString(rtrAttributes)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    phyDriveTypeData: ").append(toIndentedString(phyDriveTypeData)).append("\n");
    sb.append("    pfaReason: ").append(toIndentedString(pfaReason)).append("\n");
    sb.append("    bypassSource: ").append(toIndentedString(bypassSource)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
    sb.append("    fdeCapable: ").append(toIndentedString(fdeCapable)).append("\n");
    sb.append("    fdeEnabled: ").append(toIndentedString(fdeEnabled)).append("\n");
    sb.append("    fdeLocked: ").append(toIndentedString(fdeLocked)).append("\n");
    sb.append("    lockKeyID: ").append(toIndentedString(lockKeyID)).append("\n");
    sb.append("    ssdWearLife: ").append(toIndentedString(ssdWearLife)).append("\n");
    sb.append("    driveMediaType: ").append(toIndentedString(driveMediaType)).append("\n");
    sb.append("    fpgaVersion: ").append(toIndentedString(fpgaVersion)).append("\n");
    sb.append("    protectionInformationCapabilities: ").append(toIndentedString(protectionInformationCapabilities)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    interposerPresent: ").append(toIndentedString(interposerPresent)).append("\n");
    sb.append("    interposerRef: ").append(toIndentedString(interposerRef)).append("\n");
    sb.append("    currentCommandAgingTimeout: ").append(toIndentedString(currentCommandAgingTimeout)).append("\n");
    sb.append("    defaultCommandAgingTimeout: ").append(toIndentedString(defaultCommandAgingTimeout)).append("\n");
    sb.append("    driveTemperature: ").append(toIndentedString(driveTemperature)).append("\n");
    sb.append("    blkSizePhysical: ").append(toIndentedString(blkSizePhysical)).append("\n");
    sb.append("    lowestAlignedLBA: ").append(toIndentedString(lowestAlignedLBA)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    locateInProgress: ").append(toIndentedString(locateInProgress)).append("\n");
    sb.append("    fipsCapable: ").append(toIndentedString(fipsCapable)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    lockKeyIDValue: ").append(toIndentedString(lockKeyIDValue)).append("\n");
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

