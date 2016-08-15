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
 * CacheBackupDevice
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class CacheBackupDevice   {
  
    private String backupDeviceRef;

    private Integer backupDeviceControllerSlot;

    private String parentController;


  /**
   * The type of the backup device ( e.g., USB flash drive).
   */
  public enum BackupDeviceTypeEnum {
    unknown("unknown"),
    usbFlash("usbFlash"),
    sdFlash("sdFlash"),
    sataFlash("sataFlash"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    BackupDeviceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private BackupDeviceTypeEnum backupDeviceType;


  /**
   * The status of the backup device
   */
  public enum BackupDeviceStatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    failed("failed"),
    removed("removed"),
    writeProtected("writeProtected"),
    incompatible("incompatible"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    BackupDeviceStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private BackupDeviceStatusEnum backupDeviceStatus;

    private CacheBackupDeviceVpd backupDeviceVpd;

    private Integer backupDeviceCapacity;

    private RepairPolicy repairPolicy;

    private Location physicalLocation;

    private String id;

  
  /**
   * The SYMbol reference that identifies the instance of the device
   **/
  public CacheBackupDevice backupDeviceRef(String backupDeviceRef) {
    this.backupDeviceRef = backupDeviceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SYMbol reference that identifies the instance of the device")
  @JsonProperty("backupDeviceRef")
  public String getBackupDeviceRef() {
    return backupDeviceRef;
  }
  
  public void setBackupDeviceRef(String backupDeviceRef) {
    this.backupDeviceRef = backupDeviceRef;
  }

  
  /**
   * The number of the slot on the controller where the backup device resides. Cache backup device slots are numbered starting at one, independent of other types of slots (e.g., host board slots) on the controller. Note that this field is targeted for deletion in SYMbol rev. 85b.
   **/
  public CacheBackupDevice backupDeviceControllerSlot(Integer backupDeviceControllerSlot) {
    this.backupDeviceControllerSlot = backupDeviceControllerSlot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the slot on the controller where the backup device resides. Cache backup device slots are numbered starting at one, independent of other types of slots (e.g., host board slots) on the controller. Note that this field is targeted for deletion in SYMbol rev. 85b.")
  @JsonProperty("backupDeviceControllerSlot")
  public Integer getBackupDeviceControllerSlot() {
    return backupDeviceControllerSlot;
  }
  
  public void setBackupDeviceControllerSlot(Integer backupDeviceControllerSlot) {
    this.backupDeviceControllerSlot = backupDeviceControllerSlot;
  }

  
  /**
   * A reference to the controller where the backup device resides. Note that this field is targeted for deletion in SYMbol rev. 85b.
   **/
  public CacheBackupDevice parentController(String parentController) {
    this.parentController = parentController;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the controller where the backup device resides. Note that this field is targeted for deletion in SYMbol rev. 85b.")
  @JsonProperty("parentController")
  public String getParentController() {
    return parentController;
  }
  
  public void setParentController(String parentController) {
    this.parentController = parentController;
  }

  
  /**
   * The type of the backup device ( e.g., USB flash drive).
   **/
  public CacheBackupDevice backupDeviceType(BackupDeviceTypeEnum backupDeviceType) {
    this.backupDeviceType = backupDeviceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the backup device ( e.g., USB flash drive).")
  @JsonProperty("backupDeviceType")
  public BackupDeviceTypeEnum getBackupDeviceType() {
    return backupDeviceType;
  }
  
  public void setBackupDeviceType(BackupDeviceTypeEnum backupDeviceType) {
    this.backupDeviceType = backupDeviceType;
  }

  
  /**
   * The status of the backup device
   **/
  public CacheBackupDevice backupDeviceStatus(BackupDeviceStatusEnum backupDeviceStatus) {
    this.backupDeviceStatus = backupDeviceStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the backup device")
  @JsonProperty("backupDeviceStatus")
  public BackupDeviceStatusEnum getBackupDeviceStatus() {
    return backupDeviceStatus;
  }
  
  public void setBackupDeviceStatus(BackupDeviceStatusEnum backupDeviceStatus) {
    this.backupDeviceStatus = backupDeviceStatus;
  }

  
  /**
   * Vital product data for the backup device.
   **/
  public CacheBackupDevice backupDeviceVpd(CacheBackupDeviceVpd backupDeviceVpd) {
    this.backupDeviceVpd = backupDeviceVpd;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Vital product data for the backup device.")
  @JsonProperty("backupDeviceVpd")
  public CacheBackupDeviceVpd getBackupDeviceVpd() {
    return backupDeviceVpd;
  }
  
  public void setBackupDeviceVpd(CacheBackupDeviceVpd backupDeviceVpd) {
    this.backupDeviceVpd = backupDeviceVpd;
  }

  
  /**
   * The capacity of backup device, expressed in megabytes.
   **/
  public CacheBackupDevice backupDeviceCapacity(Integer backupDeviceCapacity) {
    this.backupDeviceCapacity = backupDeviceCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity of backup device, expressed in megabytes.")
  @JsonProperty("backupDeviceCapacity")
  public Integer getBackupDeviceCapacity() {
    return backupDeviceCapacity;
  }
  
  public void setBackupDeviceCapacity(Integer backupDeviceCapacity) {
    this.backupDeviceCapacity = backupDeviceCapacity;
  }

  
  /**
   * The repair policy for the cache backup device component.
   **/
  public CacheBackupDevice repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the cache backup device component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   * The physical location of the cache backup device. The parent field of Location is set to the controller where the device physically resides, and the position field is the parent-relative/like-component-relative slot number of the device, starting at one.
   **/
  public CacheBackupDevice physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the cache backup device. The parent field of Location is set to the controller where the device physically resides, and the position field is the parent-relative/like-component-relative slot number of the device, starting at one.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   **/
  public CacheBackupDevice id(String id) {
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
    CacheBackupDevice cacheBackupDevice = (CacheBackupDevice) o;
    return Objects.equals(this.backupDeviceRef, cacheBackupDevice.backupDeviceRef) &&
        Objects.equals(this.backupDeviceControllerSlot, cacheBackupDevice.backupDeviceControllerSlot) &&
        Objects.equals(this.parentController, cacheBackupDevice.parentController) &&
        Objects.equals(this.backupDeviceType, cacheBackupDevice.backupDeviceType) &&
        Objects.equals(this.backupDeviceStatus, cacheBackupDevice.backupDeviceStatus) &&
        Objects.equals(this.backupDeviceVpd, cacheBackupDevice.backupDeviceVpd) &&
        Objects.equals(this.backupDeviceCapacity, cacheBackupDevice.backupDeviceCapacity) &&
        Objects.equals(this.repairPolicy, cacheBackupDevice.repairPolicy) &&
        Objects.equals(this.physicalLocation, cacheBackupDevice.physicalLocation) &&
        Objects.equals(this.id, cacheBackupDevice.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupDeviceRef, backupDeviceControllerSlot, parentController, backupDeviceType, backupDeviceStatus, backupDeviceVpd, backupDeviceCapacity, repairPolicy, physicalLocation, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheBackupDevice {\n");
    
    sb.append("    backupDeviceRef: ").append(toIndentedString(backupDeviceRef)).append("\n");
    sb.append("    backupDeviceControllerSlot: ").append(toIndentedString(backupDeviceControllerSlot)).append("\n");
    sb.append("    parentController: ").append(toIndentedString(parentController)).append("\n");
    sb.append("    backupDeviceType: ").append(toIndentedString(backupDeviceType)).append("\n");
    sb.append("    backupDeviceStatus: ").append(toIndentedString(backupDeviceStatus)).append("\n");
    sb.append("    backupDeviceVpd: ").append(toIndentedString(backupDeviceVpd)).append("\n");
    sb.append("    backupDeviceCapacity: ").append(toIndentedString(backupDeviceCapacity)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
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

