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
 * Controller
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class Controller   {
  
    private Boolean active;

    private Boolean quiesced;


  /**
   * An indication of the current status of the controller.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    failed("failed"),
    removed("removed"),
    rpaParErr("rpaParErr"),
    serviceMode("serviceMode"),
    suspended("suspended"),
    degraded("degraded"),
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

    private String controllerRef;

    private Location physicalLocation;

    private String manufacturer;

    private Long manufacturerDate;

    private String appVersion;

    private String bootVersion;

    private String productID;

    private String productRevLevel;

    private String serialNumber;

    private String boardID;

    private Integer cacheMemorySize;

    private Integer processorMemorySize;

    private List<IOInterfaceTypeData> hostInterfaces;

    private List<IOInterfaceTypeData> driveInterfaces;

    private List<NetInterfaceTypeData> netInterfaces;

    private List<InventoryItem> inventory;

    private String reserved1;

    private String reserved2;

    private String hostBoardID;

    private Integer physicalCacheMemorySize;

    private Boolean readyToRemove;

    private String boardSubmodelID;

    private Boolean submodelSupported;

    private String oemPartNumber;

    private String partNumber;

    private RTRAttributes rtrAttributes;

    private Long bootTime;

    private String modelName;

    private ControllerNetworkSettings networkSettings;

    private RepairPolicy repairPolicy;

    private Integer flashCacheMemorySize;

    private CtrlIOCDumpData ctrlIocDumpData;

    private Boolean locateInProgress;

    private Boolean hasTrayIdentityIndicator;


  /**
   * Indicates the error mode in which the controller is operating. A value of 0 indicates the controller is not operating in an error mode.
   */
  public enum ControllerErrorModeEnum {
    notInErrorMode("notInErrorMode"),
    unknown("unknown"),
    t10PiServiceMode("t10PiServiceMode"),
    t10PiLockdown("t10PiLockdown"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ControllerErrorModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ControllerErrorModeEnum controllerErrorMode;

    private List<VersionDescriptor> codeVersions;

    private String id;

  
  /**
   * True if the controller is in active mode; false otherwise.
   **/
  public Controller active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the controller is in active mode; false otherwise.")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * True if the controller is quiesced.
   **/
  public Controller quiesced(Boolean quiesced) {
    this.quiesced = quiesced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the controller is quiesced.")
  @JsonProperty("quiesced")
  public Boolean getQuiesced() {
    return quiesced;
  }
  
  public void setQuiesced(Boolean quiesced) {
    this.quiesced = quiesced;
  }

  
  /**
   * An indication of the current status of the controller.
   **/
  public Controller status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of the current status of the controller.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The identifier value for this controller. Other objects may use this reference value to refer to the controller.
   **/
  public Controller controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier value for this controller. Other objects may use this reference value to refer to the controller.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * The physical location of the controller. The parent reference in Location identifies the tray that physically houses the controller, and the position field is the parent-relative/like-component relative slot number of the controller, starting at one.
   **/
  public Controller physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the controller. The parent reference in Location identifies the tray that physically houses the controller, and the position field is the parent-relative/like-component relative slot number of the controller, starting at one.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * The variable-length ASCII text string that identifies the controller manufacturer.
   **/
  public Controller manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string that identifies the controller manufacturer.")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * The date of manufacture of the controller, represented in seconds since midnight GMT on January 1, 1970.
   **/
  public Controller manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date of manufacture of the controller, represented in seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   * The version identification string for the application code that is running on the controller.
   **/
  public Controller appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version identification string for the application code that is running on the controller.")
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  
  /**
   * The version identification string for the boot code that is running on the controller.
   **/
  public Controller bootVersion(String bootVersion) {
    this.bootVersion = bootVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version identification string for the boot code that is running on the controller.")
  @JsonProperty("bootVersion")
  public String getBootVersion() {
    return bootVersion;
  }
  
  public void setBootVersion(String bootVersion) {
    this.bootVersion = bootVersion;
  }

  
  /**
   * The variable-length ASCII text string that identifies the product by name, as assigned by the manufacturer.
   **/
  public Controller productID(String productID) {
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
   * The product revision level.
   **/
  public Controller productRevLevel(String productRevLevel) {
    this.productRevLevel = productRevLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The product revision level.")
  @JsonProperty("productRevLevel")
  public String getProductRevLevel() {
    return productRevLevel;
  }
  
  public void setProductRevLevel(String productRevLevel) {
    this.productRevLevel = productRevLevel;
  }

  
  /**
   * The variable-length ASCII text string for the serial number of the controller.
   **/
  public Controller serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string for the serial number of the controller.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * The variable-length ASCII text string that represents the board identifier (i.e. board type) of the controller.
   **/
  public Controller boardID(String boardID) {
    this.boardID = boardID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string that represents the board identifier (i.e. board type) of the controller.")
  @JsonProperty("boardID")
  public String getBoardID() {
    return boardID;
  }
  
  public void setBoardID(String boardID) {
    this.boardID = boardID;
  }

  
  /**
   * The memory size, in MB, that will be used by the controller as cache memory.
   **/
  public Controller cacheMemorySize(Integer cacheMemorySize) {
    this.cacheMemorySize = cacheMemorySize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The memory size, in MB, that will be used by the controller as cache memory.")
  @JsonProperty("cacheMemorySize")
  public Integer getCacheMemorySize() {
    return cacheMemorySize;
  }
  
  public void setCacheMemorySize(Integer cacheMemorySize) {
    this.cacheMemorySize = cacheMemorySize;
  }

  
  /**
   * The size of the controller's CPU memory, in MB.
   **/
  public Controller processorMemorySize(Integer processorMemorySize) {
    this.processorMemorySize = processorMemorySize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the controller's CPU memory, in MB.")
  @JsonProperty("processorMemorySize")
  public Integer getProcessorMemorySize() {
    return processorMemorySize;
  }
  
  public void setProcessorMemorySize(Integer processorMemorySize) {
    this.processorMemorySize = processorMemorySize;
  }

  
  /**
   * An array containing one entry for each host-side I/O interface that is present on the controller. A \"host interface\" is the controller's means of accessing the host I/O channel; each host interface has a one-to-one relationship to a host channel. Although this array is indexed starting at zero, host channels in SYMbol are numbered starting at one. Host channels are numbered one through n per controller, without regard to different channel I/O protocols. Note that an interface may be physically present, but disabled for the particular controller model - in such a case, the corresponding channel is skipped over in the channel numbering.
   **/
  public Controller hostInterfaces(List<IOInterfaceTypeData> hostInterfaces) {
    this.hostInterfaces = hostInterfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array containing one entry for each host-side I/O interface that is present on the controller. A \"host interface\" is the controller's means of accessing the host I/O channel; each host interface has a one-to-one relationship to a host channel. Although this array is indexed starting at zero, host channels in SYMbol are numbered starting at one. Host channels are numbered one through n per controller, without regard to different channel I/O protocols. Note that an interface may be physically present, but disabled for the particular controller model - in such a case, the corresponding channel is skipped over in the channel numbering.")
  @JsonProperty("hostInterfaces")
  public List<IOInterfaceTypeData> getHostInterfaces() {
    return hostInterfaces;
  }
  
  public void setHostInterfaces(List<IOInterfaceTypeData> hostInterfaces) {
    this.hostInterfaces = hostInterfaces;
  }

  
  /**
   * An array containing one entry for each drive-side I/O interface that is present on the controller. A \"drive interface\" is the controller's means of accessing the drive I/O channel. On the drive side, each channel is associated with two interfaces, one on each controller, giving each controller access to the same set of drive channels. Although this array is indexed starting at zero, drive channels can be numbered one through n, per storage array (not per controller).
   **/
  public Controller driveInterfaces(List<IOInterfaceTypeData> driveInterfaces) {
    this.driveInterfaces = driveInterfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array containing one entry for each drive-side I/O interface that is present on the controller. A \"drive interface\" is the controller's means of accessing the drive I/O channel. On the drive side, each channel is associated with two interfaces, one on each controller, giving each controller access to the same set of drive channels. Although this array is indexed starting at zero, drive channels can be numbered one through n, per storage array (not per controller).")
  @JsonProperty("driveInterfaces")
  public List<IOInterfaceTypeData> getDriveInterfaces() {
    return driveInterfaces;
  }
  
  public void setDriveInterfaces(List<IOInterfaceTypeData> driveInterfaces) {
    this.driveInterfaces = driveInterfaces;
  }

  
  /**
   * An array containing one entry for each network interface that is present on the controller.
   **/
  public Controller netInterfaces(List<NetInterfaceTypeData> netInterfaces) {
    this.netInterfaces = netInterfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array containing one entry for each network interface that is present on the controller.")
  @JsonProperty("netInterfaces")
  public List<NetInterfaceTypeData> getNetInterfaces() {
    return netInterfaces;
  }
  
  public void setNetInterfaces(List<NetInterfaceTypeData> netInterfaces) {
    this.netInterfaces = netInterfaces;
  }

  
  /**
   * This array of structures is deprecated.
   **/
  public Controller inventory(List<InventoryItem> inventory) {
    this.inventory = inventory;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This array of structures is deprecated.")
  @JsonProperty("inventory")
  public List<InventoryItem> getInventory() {
    return inventory;
  }
  
  public void setInventory(List<InventoryItem> inventory) {
    this.inventory = inventory;
  }

  
  /**
   **/
  public Controller reserved1(String reserved1) {
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
  public Controller reserved2(String reserved2) {
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
   * The board ID of the controller's host card. This field is deprecated. The hostBoardId field in the HostBoard structure should be used instead.
   **/
  public Controller hostBoardID(String hostBoardID) {
    this.hostBoardID = hostBoardID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The board ID of the controller's host card. This field is deprecated. The hostBoardId field in the HostBoard structure should be used instead.")
  @JsonProperty("hostBoardID")
  public String getHostBoardID() {
    return hostBoardID;
  }
  
  public void setHostBoardID(String hostBoardID) {
    this.hostBoardID = hostBoardID;
  }

  
  /**
   * The physical cache memory size in MB
   **/
  public Controller physicalCacheMemorySize(Integer physicalCacheMemorySize) {
    this.physicalCacheMemorySize = physicalCacheMemorySize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical cache memory size in MB")
  @JsonProperty("physicalCacheMemorySize")
  public Integer getPhysicalCacheMemorySize() {
    return physicalCacheMemorySize;
  }
  
  public void setPhysicalCacheMemorySize(Integer physicalCacheMemorySize) {
    this.physicalCacheMemorySize = physicalCacheMemorySize;
  }

  
  /**
   * This is set to True if the component is ready to remove (and the Ready To Remove LED is on). This field is deprecated. The rtrAttributes field should be used instead.
   **/
  public Controller readyToRemove(Boolean readyToRemove) {
    this.readyToRemove = readyToRemove;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is set to True if the component is ready to remove (and the Ready To Remove LED is on). This field is deprecated. The rtrAttributes field should be used instead.")
  @JsonProperty("readyToRemove")
  public Boolean getReadyToRemove() {
    return readyToRemove;
  }
  
  public void setReadyToRemove(Boolean readyToRemove) {
    this.readyToRemove = readyToRemove;
  }

  
  /**
   * The board sub-model ID of the controller card
   **/
  public Controller boardSubmodelID(String boardSubmodelID) {
    this.boardSubmodelID = boardSubmodelID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The board sub-model ID of the controller card")
  @JsonProperty("boardSubmodelID")
  public String getBoardSubmodelID() {
    return boardSubmodelID;
  }
  
  public void setBoardSubmodelID(String boardSubmodelID) {
    this.boardSubmodelID = boardSubmodelID;
  }

  
  /**
   * Set to true if the sub-model feature is supported
   **/
  public Controller submodelSupported(Boolean submodelSupported) {
    this.submodelSupported = submodelSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if the sub-model feature is supported")
  @JsonProperty("submodelSupported")
  public Boolean getSubmodelSupported() {
    return submodelSupported;
  }
  
  public void setSubmodelSupported(Boolean submodelSupported) {
    this.submodelSupported = submodelSupported;
  }

  
  /**
   * The OEM-specified part number of the controller canister
   **/
  public Controller oemPartNumber(String oemPartNumber) {
    this.oemPartNumber = oemPartNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The OEM-specified part number of the controller canister")
  @JsonProperty("oemPartNumber")
  public String getOemPartNumber() {
    return oemPartNumber;
  }
  
  public void setOemPartNumber(String oemPartNumber) {
    this.oemPartNumber = oemPartNumber;
  }

  
  /**
   * The part number of the controller board itself.
   **/
  public Controller partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The part number of the controller board itself.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * The CRU type of the controller plus its ready-to-remove attributes, which are based on the CRU type.
   **/
  public Controller rtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The CRU type of the controller plus its ready-to-remove attributes, which are based on the CRU type.")
  @JsonProperty("rtrAttributes")
  public RTRAttributes getRtrAttributes() {
    return rtrAttributes;
  }
  
  public void setRtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
  }

  
  /**
   * The timestamp value for the time at which the controller last booted. Note that this value may be different for the other controller in the storage array. This value is defined as the number of seconds since midnight GMT on January 1, 1970.
   **/
  public Controller bootTime(Long bootTime) {
    this.bootTime = bootTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp value for the time at which the controller last booted. Note that this value may be different for the other controller in the storage array. This value is defined as the number of seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("bootTime")
  public Long getBootTime() {
    return bootTime;
  }
  
  public void setBootTime(Long bootTime) {
    this.bootTime = bootTime;
  }

  
  /**
   * The model name associated with the controller. A model name is an identifier that is associated with each unique combination of base controller board and host interface card(s).
   **/
  public Controller modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The model name associated with the controller. A model name is an identifier that is associated with each unique combination of base controller board and host interface card(s).")
  @JsonProperty("modelName")
  public String getModelName() {
    return modelName;
  }
  
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  
  /**
   * A collection of network-related settings that apply to this controller.
   **/
  public Controller networkSettings(ControllerNetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A collection of network-related settings that apply to this controller.")
  @JsonProperty("networkSettings")
  public ControllerNetworkSettings getNetworkSettings() {
    return networkSettings;
  }
  
  public void setNetworkSettings(ControllerNetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
  }

  
  /**
   * The repair policy for the controller.
   **/
  public Controller repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the controller.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   * The total flash cache memory size (in GB) currently in use on the controller.
   **/
  public Controller flashCacheMemorySize(Integer flashCacheMemorySize) {
    this.flashCacheMemorySize = flashCacheMemorySize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total flash cache memory size (in GB) currently in use on the controller.")
  @JsonProperty("flashCacheMemorySize")
  public Integer getFlashCacheMemorySize() {
    return flashCacheMemorySize;
  }
  
  public void setFlashCacheMemorySize(Integer flashCacheMemorySize) {
    this.flashCacheMemorySize = flashCacheMemorySize;
  }

  
  /**
   * This structure contains information regarding the state of an IOC data dump -- if it needs to be retrieved, and the tag and timestamp of the dump.
   **/
  public Controller ctrlIocDumpData(CtrlIOCDumpData ctrlIocDumpData) {
    this.ctrlIocDumpData = ctrlIocDumpData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure contains information regarding the state of an IOC data dump -- if it needs to be retrieved, and the tag and timestamp of the dump.")
  @JsonProperty("ctrlIocDumpData")
  public CtrlIOCDumpData getCtrlIocDumpData() {
    return ctrlIocDumpData;
  }
  
  public void setCtrlIocDumpData(CtrlIOCDumpData ctrlIocDumpData) {
    this.ctrlIocDumpData = ctrlIocDumpData;
  }

  
  /**
   * Indicates that a locate operation for the device is currently active. The device will show a visual indication to aid an operator in locating the tray.
   **/
  public Controller locateInProgress(Boolean locateInProgress) {
    this.locateInProgress = locateInProgress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates that a locate operation for the device is currently active. The device will show a visual indication to aid an operator in locating the tray.")
  @JsonProperty("locateInProgress")
  public Boolean getLocateInProgress() {
    return locateInProgress;
  }
  
  public void setLocateInProgress(Boolean locateInProgress) {
    this.locateInProgress = locateInProgress;
  }

  
  /**
   * The device contains 7-segment indicators used to display the Tray Identity.
   **/
  public Controller hasTrayIdentityIndicator(Boolean hasTrayIdentityIndicator) {
    this.hasTrayIdentityIndicator = hasTrayIdentityIndicator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The device contains 7-segment indicators used to display the Tray Identity.")
  @JsonProperty("hasTrayIdentityIndicator")
  public Boolean getHasTrayIdentityIndicator() {
    return hasTrayIdentityIndicator;
  }
  
  public void setHasTrayIdentityIndicator(Boolean hasTrayIdentityIndicator) {
    this.hasTrayIdentityIndicator = hasTrayIdentityIndicator;
  }

  
  /**
   * Indicates the error mode in which the controller is operating. A value of 0 indicates the controller is not operating in an error mode.
   **/
  public Controller controllerErrorMode(ControllerErrorModeEnum controllerErrorMode) {
    this.controllerErrorMode = controllerErrorMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the error mode in which the controller is operating. A value of 0 indicates the controller is not operating in an error mode.")
  @JsonProperty("controllerErrorMode")
  public ControllerErrorModeEnum getControllerErrorMode() {
    return controllerErrorMode;
  }
  
  public void setControllerErrorMode(ControllerErrorModeEnum controllerErrorMode) {
    this.controllerErrorMode = controllerErrorMode;
  }

  
  /**
   * Version descriptors for loaded code modules
   **/
  public Controller codeVersions(List<VersionDescriptor> codeVersions) {
    this.codeVersions = codeVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version descriptors for loaded code modules")
  @JsonProperty("codeVersions")
  public List<VersionDescriptor> getCodeVersions() {
    return codeVersions;
  }
  
  public void setCodeVersions(List<VersionDescriptor> codeVersions) {
    this.codeVersions = codeVersions;
  }

  
  /**
   **/
  public Controller id(String id) {
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
    Controller controller = (Controller) o;
    return Objects.equals(this.active, controller.active) &&
        Objects.equals(this.quiesced, controller.quiesced) &&
        Objects.equals(this.status, controller.status) &&
        Objects.equals(this.controllerRef, controller.controllerRef) &&
        Objects.equals(this.physicalLocation, controller.physicalLocation) &&
        Objects.equals(this.manufacturer, controller.manufacturer) &&
        Objects.equals(this.manufacturerDate, controller.manufacturerDate) &&
        Objects.equals(this.appVersion, controller.appVersion) &&
        Objects.equals(this.bootVersion, controller.bootVersion) &&
        Objects.equals(this.productID, controller.productID) &&
        Objects.equals(this.productRevLevel, controller.productRevLevel) &&
        Objects.equals(this.serialNumber, controller.serialNumber) &&
        Objects.equals(this.boardID, controller.boardID) &&
        Objects.equals(this.cacheMemorySize, controller.cacheMemorySize) &&
        Objects.equals(this.processorMemorySize, controller.processorMemorySize) &&
        Objects.equals(this.hostInterfaces, controller.hostInterfaces) &&
        Objects.equals(this.driveInterfaces, controller.driveInterfaces) &&
        Objects.equals(this.netInterfaces, controller.netInterfaces) &&
        Objects.equals(this.inventory, controller.inventory) &&
        Objects.equals(this.reserved1, controller.reserved1) &&
        Objects.equals(this.reserved2, controller.reserved2) &&
        Objects.equals(this.hostBoardID, controller.hostBoardID) &&
        Objects.equals(this.physicalCacheMemorySize, controller.physicalCacheMemorySize) &&
        Objects.equals(this.readyToRemove, controller.readyToRemove) &&
        Objects.equals(this.boardSubmodelID, controller.boardSubmodelID) &&
        Objects.equals(this.submodelSupported, controller.submodelSupported) &&
        Objects.equals(this.oemPartNumber, controller.oemPartNumber) &&
        Objects.equals(this.partNumber, controller.partNumber) &&
        Objects.equals(this.rtrAttributes, controller.rtrAttributes) &&
        Objects.equals(this.bootTime, controller.bootTime) &&
        Objects.equals(this.modelName, controller.modelName) &&
        Objects.equals(this.networkSettings, controller.networkSettings) &&
        Objects.equals(this.repairPolicy, controller.repairPolicy) &&
        Objects.equals(this.flashCacheMemorySize, controller.flashCacheMemorySize) &&
        Objects.equals(this.ctrlIocDumpData, controller.ctrlIocDumpData) &&
        Objects.equals(this.locateInProgress, controller.locateInProgress) &&
        Objects.equals(this.hasTrayIdentityIndicator, controller.hasTrayIdentityIndicator) &&
        Objects.equals(this.controllerErrorMode, controller.controllerErrorMode) &&
        Objects.equals(this.codeVersions, controller.codeVersions) &&
        Objects.equals(this.id, controller.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, quiesced, status, controllerRef, physicalLocation, manufacturer, manufacturerDate, appVersion, bootVersion, productID, productRevLevel, serialNumber, boardID, cacheMemorySize, processorMemorySize, hostInterfaces, driveInterfaces, netInterfaces, inventory, reserved1, reserved2, hostBoardID, physicalCacheMemorySize, readyToRemove, boardSubmodelID, submodelSupported, oemPartNumber, partNumber, rtrAttributes, bootTime, modelName, networkSettings, repairPolicy, flashCacheMemorySize, ctrlIocDumpData, locateInProgress, hasTrayIdentityIndicator, controllerErrorMode, codeVersions, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Controller {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    quiesced: ").append(toIndentedString(quiesced)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    bootVersion: ").append(toIndentedString(bootVersion)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    productRevLevel: ").append(toIndentedString(productRevLevel)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    boardID: ").append(toIndentedString(boardID)).append("\n");
    sb.append("    cacheMemorySize: ").append(toIndentedString(cacheMemorySize)).append("\n");
    sb.append("    processorMemorySize: ").append(toIndentedString(processorMemorySize)).append("\n");
    sb.append("    hostInterfaces: ").append(toIndentedString(hostInterfaces)).append("\n");
    sb.append("    driveInterfaces: ").append(toIndentedString(driveInterfaces)).append("\n");
    sb.append("    netInterfaces: ").append(toIndentedString(netInterfaces)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    hostBoardID: ").append(toIndentedString(hostBoardID)).append("\n");
    sb.append("    physicalCacheMemorySize: ").append(toIndentedString(physicalCacheMemorySize)).append("\n");
    sb.append("    readyToRemove: ").append(toIndentedString(readyToRemove)).append("\n");
    sb.append("    boardSubmodelID: ").append(toIndentedString(boardSubmodelID)).append("\n");
    sb.append("    submodelSupported: ").append(toIndentedString(submodelSupported)).append("\n");
    sb.append("    oemPartNumber: ").append(toIndentedString(oemPartNumber)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    rtrAttributes: ").append(toIndentedString(rtrAttributes)).append("\n");
    sb.append("    bootTime: ").append(toIndentedString(bootTime)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    networkSettings: ").append(toIndentedString(networkSettings)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
    sb.append("    flashCacheMemorySize: ").append(toIndentedString(flashCacheMemorySize)).append("\n");
    sb.append("    ctrlIocDumpData: ").append(toIndentedString(ctrlIocDumpData)).append("\n");
    sb.append("    locateInProgress: ").append(toIndentedString(locateInProgress)).append("\n");
    sb.append("    hasTrayIdentityIndicator: ").append(toIndentedString(hasTrayIdentityIndicator)).append("\n");
    sb.append("    controllerErrorMode: ").append(toIndentedString(controllerErrorMode)).append("\n");
    sb.append("    codeVersions: ").append(toIndentedString(codeVersions)).append("\n");
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

