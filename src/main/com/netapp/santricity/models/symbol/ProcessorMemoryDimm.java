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
 * ProcessorMemoryDimm
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ProcessorMemoryDimm   {
  
    private String processorMemoryDimmRef;

    private String parentController;

    private Integer dimmControllerSlot;


  /**
   * The operational status of the DIMM.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    empty("empty"),
    failed("failed"),
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

    private Integer capacityInMegabytes;

    private String serialNumber;

    private String partNumber;

    private String oemPartNumber;

    private String manufacturerPartNumber;

    private String manufacturer;

    private Long manufactureDate;

    private RepairPolicy repairPolicy;

    private Location physicalLocation;

    private String revisionCode;

  
  /**
   * The SYMbol reference value that uniquely identifies an instance of a cache memory DIMM object.
   **/
  public ProcessorMemoryDimm processorMemoryDimmRef(String processorMemoryDimmRef) {
    this.processorMemoryDimmRef = processorMemoryDimmRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SYMbol reference value that uniquely identifies an instance of a cache memory DIMM object.")
  @JsonProperty("processorMemoryDimmRef")
  public String getProcessorMemoryDimmRef() {
    return processorMemoryDimmRef;
  }
  
  public void setProcessorMemoryDimmRef(String processorMemoryDimmRef) {
    this.processorMemoryDimmRef = processorMemoryDimmRef;
  }

  
  /**
   * The SYMbol reference of the DIMM's parent controller.
   **/
  public ProcessorMemoryDimm parentController(String parentController) {
    this.parentController = parentController;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SYMbol reference of the DIMM's parent controller.")
  @JsonProperty("parentController")
  public String getParentController() {
    return parentController;
  }
  
  public void setParentController(String parentController) {
    this.parentController = parentController;
  }

  
  /**
   * The controller-relative slot number of the DIMM, where \"1\" is the first slot number.
   **/
  public ProcessorMemoryDimm dimmControllerSlot(Integer dimmControllerSlot) {
    this.dimmControllerSlot = dimmControllerSlot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller-relative slot number of the DIMM, where \"1\" is the first slot number.")
  @JsonProperty("dimmControllerSlot")
  public Integer getDimmControllerSlot() {
    return dimmControllerSlot;
  }
  
  public void setDimmControllerSlot(Integer dimmControllerSlot) {
    this.dimmControllerSlot = dimmControllerSlot;
  }

  
  /**
   * The operational status of the DIMM.
   **/
  public ProcessorMemoryDimm status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status of the DIMM.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The capacity of the DIMM expressed in megabytes.
   **/
  public ProcessorMemoryDimm capacityInMegabytes(Integer capacityInMegabytes) {
    this.capacityInMegabytes = capacityInMegabytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity of the DIMM expressed in megabytes.")
  @JsonProperty("capacityInMegabytes")
  public Integer getCapacityInMegabytes() {
    return capacityInMegabytes;
  }
  
  public void setCapacityInMegabytes(Integer capacityInMegabytes) {
    this.capacityInMegabytes = capacityInMegabytes;
  }

  
  /**
   * The serial number of the DIMM.
   **/
  public ProcessorMemoryDimm serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The serial number of the DIMM.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * The LSI Logic part number of the DIMM.
   **/
  public ProcessorMemoryDimm partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The LSI Logic part number of the DIMM.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * The OEM part number of the DIMM.
   **/
  public ProcessorMemoryDimm oemPartNumber(String oemPartNumber) {
    this.oemPartNumber = oemPartNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The OEM part number of the DIMM.")
  @JsonProperty("oemPartNumber")
  public String getOemPartNumber() {
    return oemPartNumber;
  }
  
  public void setOemPartNumber(String oemPartNumber) {
    this.oemPartNumber = oemPartNumber;
  }

  
  /**
   * The manufacturer part number of the DIMM.
   **/
  public ProcessorMemoryDimm manufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The manufacturer part number of the DIMM.")
  @JsonProperty("manufacturerPartNumber")
  public String getManufacturerPartNumber() {
    return manufacturerPartNumber;
  }
  
  public void setManufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
  }

  
  /**
   * The manufacturer part number of the DIMM.
   **/
  public ProcessorMemoryDimm manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The manufacturer part number of the DIMM.")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * The manufacture date of the DIMM
   **/
  public ProcessorMemoryDimm manufactureDate(Long manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The manufacture date of the DIMM")
  @JsonProperty("manufactureDate")
  public Long getManufactureDate() {
    return manufactureDate;
  }
  
  public void setManufactureDate(Long manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  
  /**
   * The repair policy for the processor memory DIMM component.
   **/
  public ProcessorMemoryDimm repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the processor memory DIMM component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   * The physical location of the processor memory DIMM. The parent field of Location is set to the controller where the DIMM physically resides, and the position field is the parent-relative/like-component-relative slot number of the DIMM, starting at one.
   **/
  public ProcessorMemoryDimm physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the processor memory DIMM. The parent field of Location is set to the controller where the DIMM physically resides, and the position field is the parent-relative/like-component-relative slot number of the DIMM, starting at one.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * The module revision code of the DIMM.
   **/
  public ProcessorMemoryDimm revisionCode(String revisionCode) {
    this.revisionCode = revisionCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The module revision code of the DIMM.")
  @JsonProperty("revisionCode")
  public String getRevisionCode() {
    return revisionCode;
  }
  
  public void setRevisionCode(String revisionCode) {
    this.revisionCode = revisionCode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorMemoryDimm processorMemoryDimm = (ProcessorMemoryDimm) o;
    return Objects.equals(this.processorMemoryDimmRef, processorMemoryDimm.processorMemoryDimmRef) &&
        Objects.equals(this.parentController, processorMemoryDimm.parentController) &&
        Objects.equals(this.dimmControllerSlot, processorMemoryDimm.dimmControllerSlot) &&
        Objects.equals(this.status, processorMemoryDimm.status) &&
        Objects.equals(this.capacityInMegabytes, processorMemoryDimm.capacityInMegabytes) &&
        Objects.equals(this.serialNumber, processorMemoryDimm.serialNumber) &&
        Objects.equals(this.partNumber, processorMemoryDimm.partNumber) &&
        Objects.equals(this.oemPartNumber, processorMemoryDimm.oemPartNumber) &&
        Objects.equals(this.manufacturerPartNumber, processorMemoryDimm.manufacturerPartNumber) &&
        Objects.equals(this.manufacturer, processorMemoryDimm.manufacturer) &&
        Objects.equals(this.manufactureDate, processorMemoryDimm.manufactureDate) &&
        Objects.equals(this.repairPolicy, processorMemoryDimm.repairPolicy) &&
        Objects.equals(this.physicalLocation, processorMemoryDimm.physicalLocation) &&
        Objects.equals(this.revisionCode, processorMemoryDimm.revisionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorMemoryDimmRef, parentController, dimmControllerSlot, status, capacityInMegabytes, serialNumber, partNumber, oemPartNumber, manufacturerPartNumber, manufacturer, manufactureDate, repairPolicy, physicalLocation, revisionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorMemoryDimm {\n");
    
    sb.append("    processorMemoryDimmRef: ").append(toIndentedString(processorMemoryDimmRef)).append("\n");
    sb.append("    parentController: ").append(toIndentedString(parentController)).append("\n");
    sb.append("    dimmControllerSlot: ").append(toIndentedString(dimmControllerSlot)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    capacityInMegabytes: ").append(toIndentedString(capacityInMegabytes)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    oemPartNumber: ").append(toIndentedString(oemPartNumber)).append("\n");
    sb.append("    manufacturerPartNumber: ").append(toIndentedString(manufacturerPartNumber)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufactureDate: ").append(toIndentedString(manufactureDate)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    revisionCode: ").append(toIndentedString(revisionCode)).append("\n");
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

