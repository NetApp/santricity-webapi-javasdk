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
 * Esm
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class Esm   {
  
    private String esmRef;


  /**
   * The operational status for this ESM.
   */
  public enum StatusEnum {
    optimal("optimal"),
    failed("failed"),
    removed("removed"),
    unknown("unknown"),
    unsupported("unsupported"),
    uncertified("uncertified"),
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

    private Location physicalLocation;

    private Boolean nonRedundantAccess;

    private String partNumber;

    private String serialNumber;

    private Long manufacturerDate;

    private String manufacturer;

    private String fruType;

    private String softwareVersion;

    private ESMInterfaceTypeData esmInterfaceData;

    private String productID;

    private Integer workingChannel;


  /**
   * The current speed of the ESM.
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
    speed25gig("speed25gig"),
    speed32gig("speed32gig"),
    speed100gig("speed100gig"),
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
   * The maximum speed of the ESM.
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
    speed25gig("speed25gig"),
    speed32gig("speed32gig"),
    speed100gig("speed100gig"),
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

    private String reserved1;

    private String reserved2;

    private FibreESMAddress fibreEsm;

    private RTRAttributes rtrAttributes;

    private EsmInterfaceAttributes esmInterfaceAttributes;

    private String boardId;

    private EsmFactoryDefaultsVersionData factoryDefaultsData;

    private RepairPolicy repairPolicy;

    private Boolean isTrunkCapable;

    private Boolean trunkMiswire;

    private Boolean locateInProgress;

    private Boolean hasTrayIdentityIndicator;


  /**
   * Type of ESM or IOM.
   */
  public enum EsmTypeEnum {
    unidentified("unidentified"),
    badger("badger"),
    devil("devil"),
    cyclone("cyclone"),
    polecat("polecat"),
    otter("otter"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    EsmTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private EsmTypeEnum esmType;

    private String id;

  
  /**
   * The reference for this physical ESM.
   **/
  public Esm esmRef(String esmRef) {
    this.esmRef = esmRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for this physical ESM.")
  @JsonProperty("esmRef")
  public String getEsmRef() {
    return esmRef;
  }
  
  public void setEsmRef(String esmRef) {
    this.esmRef = esmRef;
  }

  
  /**
   * The operational status for this ESM.
   **/
  public Esm status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status for this ESM.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The physical location of the ESM. The parent reference in Location identifies the tray containing the ESM, and the position field is the parent-relative/like-component relative slot number of the ESM, starting at 1.
   **/
  public Esm physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the ESM. The parent reference in Location identifies the tray containing the ESM, and the position field is the parent-relative/like-component relative slot number of the ESM, starting at 1.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * True if the ESM does not have redundant access.
   **/
  public Esm nonRedundantAccess(Boolean nonRedundantAccess) {
    this.nonRedundantAccess = nonRedundantAccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the ESM does not have redundant access.")
  @JsonProperty("nonRedundantAccess")
  public Boolean getNonRedundantAccess() {
    return nonRedundantAccess;
  }
  
  public void setNonRedundantAccess(Boolean nonRedundantAccess) {
    this.nonRedundantAccess = nonRedundantAccess;
  }

  
  /**
   * The part number of the ESM.
   **/
  public Esm partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The part number of the ESM.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * The serial number of the ESM.
   **/
  public Esm serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The serial number of the ESM.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * The date the ESM was manufactured.
   **/
  public Esm manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the ESM was manufactured.")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   * The date the ESM was manufactured.
   **/
  public Esm manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the ESM was manufactured.")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * The field replaceable unit type of the ESM.
   **/
  public Esm fruType(String fruType) {
    this.fruType = fruType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The field replaceable unit type of the ESM.")
  @JsonProperty("fruType")
  public String getFruType() {
    return fruType;
  }
  
  public void setFruType(String fruType) {
    this.fruType = fruType;
  }

  
  /**
   * The firmware version of the ESM.
   **/
  public Esm softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The firmware version of the ESM.")
  @JsonProperty("softwareVersion")
  public String getSoftwareVersion() {
    return softwareVersion;
  }
  
  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  
  /**
   * The interface type information for the ESM. This field is now deprecated. The field esmInterfaceAttributes should be used instead.
   **/
  public Esm esmInterfaceData(ESMInterfaceTypeData esmInterfaceData) {
    this.esmInterfaceData = esmInterfaceData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The interface type information for the ESM. This field is now deprecated. The field esmInterfaceAttributes should be used instead.")
  @JsonProperty("esmInterfaceData")
  public ESMInterfaceTypeData getEsmInterfaceData() {
    return esmInterfaceData;
  }
  
  public void setEsmInterfaceData(ESMInterfaceTypeData esmInterfaceData) {
    this.esmInterfaceData = esmInterfaceData;
  }

  
  /**
   * The product identifier of the ESM.
   **/
  public Esm productID(String productID) {
    this.productID = productID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The product identifier of the ESM.")
  @JsonProperty("productID")
  public String getProductID() {
    return productID;
  }
  
  public void setProductID(String productID) {
    this.productID = productID;
  }

  
  /**
   * The channel to the tray that is still operational (if nonRedundantAccess is True).
   **/
  public Esm workingChannel(Integer workingChannel) {
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
   * The current speed of the ESM.
   **/
  public Esm currentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current speed of the ESM.")
  @JsonProperty("currentSpeed")
  public CurrentSpeedEnum getCurrentSpeed() {
    return currentSpeed;
  }
  
  public void setCurrentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  
  /**
   * The maximum speed of the ESM.
   **/
  public Esm maxSpeed(MaxSpeedEnum maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum speed of the ESM.")
  @JsonProperty("maxSpeed")
  public MaxSpeedEnum getMaxSpeed() {
    return maxSpeed;
  }
  
  public void setMaxSpeed(MaxSpeedEnum maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  
  /**
   **/
  public Esm reserved1(String reserved1) {
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
  public Esm reserved2(String reserved2) {
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
   * The Fibre Channel information for the ESM. This field is deprecated. The field fibreEsmAddress located within esmInterfaceAttributes should be used instead.
   **/
  public Esm fibreEsm(FibreESMAddress fibreEsm) {
    this.fibreEsm = fibreEsm;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Fibre Channel information for the ESM. This field is deprecated. The field fibreEsmAddress located within esmInterfaceAttributes should be used instead.")
  @JsonProperty("fibreEsm")
  public FibreESMAddress getFibreEsm() {
    return fibreEsm;
  }
  
  public void setFibreEsm(FibreESMAddress fibreEsm) {
    this.fibreEsm = fibreEsm;
  }

  
  /**
   * The CRU type of the ESM plus its ready-to-remove attributes, which are based on the CRU type.
   **/
  public Esm rtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The CRU type of the ESM plus its ready-to-remove attributes, which are based on the CRU type.")
  @JsonProperty("rtrAttributes")
  public RTRAttributes getRtrAttributes() {
    return rtrAttributes;
  }
  
  public void setRtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
  }

  
  /**
   * Attributes that are specific to the ESM's I/O interface type.
   **/
  public Esm esmInterfaceAttributes(EsmInterfaceAttributes esmInterfaceAttributes) {
    this.esmInterfaceAttributes = esmInterfaceAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Attributes that are specific to the ESM's I/O interface type.")
  @JsonProperty("esmInterfaceAttributes")
  public EsmInterfaceAttributes getEsmInterfaceAttributes() {
    return esmInterfaceAttributes;
  }
  
  public void setEsmInterfaceAttributes(EsmInterfaceAttributes esmInterfaceAttributes) {
    this.esmInterfaceAttributes = esmInterfaceAttributes;
  }

  
  /**
   * The board ID of the ESM card.
   **/
  public Esm boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The board ID of the ESM card.")
  @JsonProperty("boardId")
  public String getBoardId() {
    return boardId;
  }
  
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  
  /**
   * This field contains information about the version of the ESM's factory default settings.
   **/
  public Esm factoryDefaultsData(EsmFactoryDefaultsVersionData factoryDefaultsData) {
    this.factoryDefaultsData = factoryDefaultsData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains information about the version of the ESM's factory default settings.")
  @JsonProperty("factoryDefaultsData")
  public EsmFactoryDefaultsVersionData getFactoryDefaultsData() {
    return factoryDefaultsData;
  }
  
  public void setFactoryDefaultsData(EsmFactoryDefaultsVersionData factoryDefaultsData) {
    this.factoryDefaultsData = factoryDefaultsData;
  }

  
  /**
   * The repair policy for the ESM component.
   **/
  public Esm repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the ESM component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   * True when ESM is trunk capable.
   **/
  public Esm isTrunkCapable(Boolean isTrunkCapable) {
    this.isTrunkCapable = isTrunkCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True when ESM is trunk capable.")
  @JsonProperty("isTrunkCapable")
  public Boolean getIsTrunkCapable() {
    return isTrunkCapable;
  }
  
  public void setIsTrunkCapable(Boolean isTrunkCapable) {
    this.isTrunkCapable = isTrunkCapable;
  }

  
  /**
   * True only when ESM is trunk capable and cabled incorrectly, or not trunk capable but connected in trunk mode.
   **/
  public Esm trunkMiswire(Boolean trunkMiswire) {
    this.trunkMiswire = trunkMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True only when ESM is trunk capable and cabled incorrectly, or not trunk capable but connected in trunk mode.")
  @JsonProperty("trunkMiswire")
  public Boolean getTrunkMiswire() {
    return trunkMiswire;
  }
  
  public void setTrunkMiswire(Boolean trunkMiswire) {
    this.trunkMiswire = trunkMiswire;
  }

  
  /**
   * Indicates that a locate operation for the device is currently active. The device will show a visual indication to aid an operator in locating the device.
   **/
  public Esm locateInProgress(Boolean locateInProgress) {
    this.locateInProgress = locateInProgress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates that a locate operation for the device is currently active. The device will show a visual indication to aid an operator in locating the device.")
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
  public Esm hasTrayIdentityIndicator(Boolean hasTrayIdentityIndicator) {
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
   * Type of ESM or IOM.
   **/
  public Esm esmType(EsmTypeEnum esmType) {
    this.esmType = esmType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of ESM or IOM.")
  @JsonProperty("esmType")
  public EsmTypeEnum getEsmType() {
    return esmType;
  }
  
  public void setEsmType(EsmTypeEnum esmType) {
    this.esmType = esmType;
  }

  
  /**
   **/
  public Esm id(String id) {
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
    Esm esm = (Esm) o;
    return Objects.equals(this.esmRef, esm.esmRef) &&
        Objects.equals(this.status, esm.status) &&
        Objects.equals(this.physicalLocation, esm.physicalLocation) &&
        Objects.equals(this.nonRedundantAccess, esm.nonRedundantAccess) &&
        Objects.equals(this.partNumber, esm.partNumber) &&
        Objects.equals(this.serialNumber, esm.serialNumber) &&
        Objects.equals(this.manufacturerDate, esm.manufacturerDate) &&
        Objects.equals(this.manufacturer, esm.manufacturer) &&
        Objects.equals(this.fruType, esm.fruType) &&
        Objects.equals(this.softwareVersion, esm.softwareVersion) &&
        Objects.equals(this.esmInterfaceData, esm.esmInterfaceData) &&
        Objects.equals(this.productID, esm.productID) &&
        Objects.equals(this.workingChannel, esm.workingChannel) &&
        Objects.equals(this.currentSpeed, esm.currentSpeed) &&
        Objects.equals(this.maxSpeed, esm.maxSpeed) &&
        Objects.equals(this.reserved1, esm.reserved1) &&
        Objects.equals(this.reserved2, esm.reserved2) &&
        Objects.equals(this.fibreEsm, esm.fibreEsm) &&
        Objects.equals(this.rtrAttributes, esm.rtrAttributes) &&
        Objects.equals(this.esmInterfaceAttributes, esm.esmInterfaceAttributes) &&
        Objects.equals(this.boardId, esm.boardId) &&
        Objects.equals(this.factoryDefaultsData, esm.factoryDefaultsData) &&
        Objects.equals(this.repairPolicy, esm.repairPolicy) &&
        Objects.equals(this.isTrunkCapable, esm.isTrunkCapable) &&
        Objects.equals(this.trunkMiswire, esm.trunkMiswire) &&
        Objects.equals(this.locateInProgress, esm.locateInProgress) &&
        Objects.equals(this.hasTrayIdentityIndicator, esm.hasTrayIdentityIndicator) &&
        Objects.equals(this.esmType, esm.esmType) &&
        Objects.equals(this.id, esm.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esmRef, status, physicalLocation, nonRedundantAccess, partNumber, serialNumber, manufacturerDate, manufacturer, fruType, softwareVersion, esmInterfaceData, productID, workingChannel, currentSpeed, maxSpeed, reserved1, reserved2, fibreEsm, rtrAttributes, esmInterfaceAttributes, boardId, factoryDefaultsData, repairPolicy, isTrunkCapable, trunkMiswire, locateInProgress, hasTrayIdentityIndicator, esmType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Esm {\n");
    
    sb.append("    esmRef: ").append(toIndentedString(esmRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    nonRedundantAccess: ").append(toIndentedString(nonRedundantAccess)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    fruType: ").append(toIndentedString(fruType)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    esmInterfaceData: ").append(toIndentedString(esmInterfaceData)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    workingChannel: ").append(toIndentedString(workingChannel)).append("\n");
    sb.append("    currentSpeed: ").append(toIndentedString(currentSpeed)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    fibreEsm: ").append(toIndentedString(fibreEsm)).append("\n");
    sb.append("    rtrAttributes: ").append(toIndentedString(rtrAttributes)).append("\n");
    sb.append("    esmInterfaceAttributes: ").append(toIndentedString(esmInterfaceAttributes)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    factoryDefaultsData: ").append(toIndentedString(factoryDefaultsData)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
    sb.append("    isTrunkCapable: ").append(toIndentedString(isTrunkCapable)).append("\n");
    sb.append("    trunkMiswire: ").append(toIndentedString(trunkMiswire)).append("\n");
    sb.append("    locateInProgress: ").append(toIndentedString(locateInProgress)).append("\n");
    sb.append("    hasTrayIdentityIndicator: ").append(toIndentedString(hasTrayIdentityIndicator)).append("\n");
    sb.append("    esmType: ").append(toIndentedString(esmType)).append("\n");
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

