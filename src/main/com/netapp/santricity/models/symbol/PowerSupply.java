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
 * PowerSupply
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PowerSupply   {
  
    private String powerSupplyRef;


  /**
   * The operation status of the power supply.
   */
  public enum StatusEnum {
    optimal("optimal"),
    failed("failed"),
    removed("removed"),
    unknown("unknown"),
    noinput("noinput"),
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

    private String partNumber;

    private String serialNumber;

    private String vendorName;

    private Long manufacturerDate;

    private String fruType;

    private String reserved1;

    private String reserved2;

    private RTRAttributes rtrAttributes;

    private RepairPolicy repairPolicy;

    private String firmwareRevision;

    private Integer manufacturingDeviceCode;

    private String id;

  
  /**
   * The physical location of the power supply. The parent reference in Location identifies the tray or CRU that physically houses the power supply, and the position field is the parent-relative/like-component relative number of the power supply, starting at one.
   **/
  public PowerSupply powerSupplyRef(String powerSupplyRef) {
    this.powerSupplyRef = powerSupplyRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the power supply. The parent reference in Location identifies the tray or CRU that physically houses the power supply, and the position field is the parent-relative/like-component relative number of the power supply, starting at one.")
  @JsonProperty("powerSupplyRef")
  public String getPowerSupplyRef() {
    return powerSupplyRef;
  }
  
  public void setPowerSupplyRef(String powerSupplyRef) {
    this.powerSupplyRef = powerSupplyRef;
  }

  
  /**
   * The operation status of the power supply.
   **/
  public PowerSupply status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operation status of the power supply.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The physical location of the power supply. Note that the tray reference identifies the enclosure containing the power supply. For non-XBB controller enclosures, the slot information does not apply. For XBB controller enclosures, the slot information is an ordinal identifier (a value of 1 means the first (left) power supply and a value of 2 means the second (right) power supply).
   **/
  public PowerSupply physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the power supply. Note that the tray reference identifies the enclosure containing the power supply. For non-XBB controller enclosures, the slot information does not apply. For XBB controller enclosures, the slot information is an ordinal identifier (a value of 1 means the first (left) power supply and a value of 2 means the second (right) power supply).")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * The part number of the power supply from VPD data.
   **/
  public PowerSupply partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The part number of the power supply from VPD data.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * The serial number of the power supply.
   **/
  public PowerSupply serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The serial number of the power supply.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * The name of the manufacturer of the power supply.
   **/
  public PowerSupply vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the manufacturer of the power supply.")
  @JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  
  /**
   * The date the power supply was manufactured.
   **/
  public PowerSupply manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the power supply was manufactured.")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   * The field replaceable unit type of the power supply.
   **/
  public PowerSupply fruType(String fruType) {
    this.fruType = fruType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The field replaceable unit type of the power supply.")
  @JsonProperty("fruType")
  public String getFruType() {
    return fruType;
  }
  
  public void setFruType(String fruType) {
    this.fruType = fruType;
  }

  
  /**
   **/
  public PowerSupply reserved1(String reserved1) {
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
  public PowerSupply reserved2(String reserved2) {
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
   * The CRU type of the power supply plus its ready-to-remove attributes, which are based on the CRU type
   **/
  public PowerSupply rtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The CRU type of the power supply plus its ready-to-remove attributes, which are based on the CRU type")
  @JsonProperty("rtrAttributes")
  public RTRAttributes getRtrAttributes() {
    return rtrAttributes;
  }
  
  public void setRtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
  }

  
  /**
   * The repair policy for the power supply component.
   **/
  public PowerSupply repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the power supply component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   * An ASCII character string that identifies the version of the firmware.
   **/
  public PowerSupply firmwareRevision(String firmwareRevision) {
    this.firmwareRevision = firmwareRevision;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII character string that identifies the version of the firmware.")
  @JsonProperty("firmwareRevision")
  public String getFirmwareRevision() {
    return firmwareRevision;
  }
  
  public void setFirmwareRevision(String firmwareRevision) {
    this.firmwareRevision = firmwareRevision;
  }

  
  /**
   * An integer value that specifies the Manufacturing Device Code.
   **/
  public PowerSupply manufacturingDeviceCode(Integer manufacturingDeviceCode) {
    this.manufacturingDeviceCode = manufacturingDeviceCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An integer value that specifies the Manufacturing Device Code.")
  @JsonProperty("manufacturingDeviceCode")
  public Integer getManufacturingDeviceCode() {
    return manufacturingDeviceCode;
  }
  
  public void setManufacturingDeviceCode(Integer manufacturingDeviceCode) {
    this.manufacturingDeviceCode = manufacturingDeviceCode;
  }

  
  /**
   **/
  public PowerSupply id(String id) {
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
    PowerSupply powerSupply = (PowerSupply) o;
    return Objects.equals(this.powerSupplyRef, powerSupply.powerSupplyRef) &&
        Objects.equals(this.status, powerSupply.status) &&
        Objects.equals(this.physicalLocation, powerSupply.physicalLocation) &&
        Objects.equals(this.partNumber, powerSupply.partNumber) &&
        Objects.equals(this.serialNumber, powerSupply.serialNumber) &&
        Objects.equals(this.vendorName, powerSupply.vendorName) &&
        Objects.equals(this.manufacturerDate, powerSupply.manufacturerDate) &&
        Objects.equals(this.fruType, powerSupply.fruType) &&
        Objects.equals(this.reserved1, powerSupply.reserved1) &&
        Objects.equals(this.reserved2, powerSupply.reserved2) &&
        Objects.equals(this.rtrAttributes, powerSupply.rtrAttributes) &&
        Objects.equals(this.repairPolicy, powerSupply.repairPolicy) &&
        Objects.equals(this.firmwareRevision, powerSupply.firmwareRevision) &&
        Objects.equals(this.manufacturingDeviceCode, powerSupply.manufacturingDeviceCode) &&
        Objects.equals(this.id, powerSupply.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerSupplyRef, status, physicalLocation, partNumber, serialNumber, vendorName, manufacturerDate, fruType, reserved1, reserved2, rtrAttributes, repairPolicy, firmwareRevision, manufacturingDeviceCode, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerSupply {\n");
    
    sb.append("    powerSupplyRef: ").append(toIndentedString(powerSupplyRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    fruType: ").append(toIndentedString(fruType)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    rtrAttributes: ").append(toIndentedString(rtrAttributes)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
    sb.append("    firmwareRevision: ").append(toIndentedString(firmwareRevision)).append("\n");
    sb.append("    manufacturingDeviceCode: ").append(toIndentedString(manufacturingDeviceCode)).append("\n");
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

