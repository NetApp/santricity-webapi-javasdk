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
 * HostBoard
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class HostBoard   {
  
    private String parentController;

    private String partNumber;

    private String serialNumber;

    private String vendorName;

    private Long manufacturerDate;

    private String fruType;

    private String hostBoardId;


  /**
   * The host board's status.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    needsAttention("needsAttention"),
    notPresent("notPresent"),
    degraded("degraded"),
    failed("failed"),
    diagInProgress("diagInProgress"),
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
   * The host board's type.
   */
  public enum TypeEnum {
    typeUnknown("typeUnknown"),
    type4portFc("type4portFc"),
    type20portSwitchedFc("type20portSwitchedFc"),
    type1portSas("type1portSas"),
    type2portFc("type2portFc"),
    type2portIscsi("type2portIscsi"),
    type2portSas("type2portSas"),
    type2portIb("type2portIb"),
    type8portFc("type8portFc"),
    type4portIscsi("type4portIscsi"),
    type4portSas("type4portSas"),
    type4portSasGlacier("type4portSasGlacier"),
    type2portFcIscsiSamoa("type2portFcIscsiSamoa"),
    type4portFcIscsiSamoa("type4portFcIscsiSamoa"),
    type2portIscsiZion("type2portIscsiZion"),
    type2portSasAcadia("type2portSasAcadia"),
    type4portSasAcadia("type4portSasAcadia"),
    type2portIbDenali("type2portIbDenali"),
    type2portFcSamoa("type2portFcSamoa"),
    type4portFcSamoa("type4portFcSamoa"),
    type2portIscsiSamoa("type2portIscsiSamoa"),
    type4portIscsiSamoa("type4portIscsiSamoa"),
    type4portSas3("type4portSas3"),
    type2portIb100gb("type2portIb100gb"),
    type4portEthernet25gb("type4portEthernet25gb"),
    type4portFc32gb("type4portFc32gb"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TypeEnum type;

    private String hostBoardRef;

    private Integer numberOfPorts;

    private HostBoardTypeData hbTypeData;

    private String oemPartNumber;

    private Integer hostBoardControllerSlot;

    private RepairPolicy repairPolicy;

    private Location physicalLocation;

    private String id;

  
  /**
   * The controller associated with the host board.
   **/
  public HostBoard parentController(String parentController) {
    this.parentController = parentController;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller associated with the host board.")
  @JsonProperty("parentController")
  public String getParentController() {
    return parentController;
  }
  
  public void setParentController(String parentController) {
    this.parentController = parentController;
  }

  
  /**
   * The host board's part number, from VPD.
   **/
  public HostBoard partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host board's part number, from VPD.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * The host board's serial number, from VPD.
   **/
  public HostBoard serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host board's serial number, from VPD.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * The host board's vendor name, from VPD.
   **/
  public HostBoard vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host board's vendor name, from VPD.")
  @JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  
  /**
   * The host board's date of manufacture, from VPD.
   **/
  public HostBoard manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host board's date of manufacture, from VPD.")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   * The field replaceable unit type string, from VPD.
   **/
  public HostBoard fruType(String fruType) {
    this.fruType = fruType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The field replaceable unit type string, from VPD.")
  @JsonProperty("fruType")
  public String getFruType() {
    return fruType;
  }
  
  public void setFruType(String fruType) {
    this.fruType = fruType;
  }

  
  /**
   * The board ID of the controller's host card.
   **/
  public HostBoard hostBoardId(String hostBoardId) {
    this.hostBoardId = hostBoardId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The board ID of the controller's host card.")
  @JsonProperty("hostBoardId")
  public String getHostBoardId() {
    return hostBoardId;
  }
  
  public void setHostBoardId(String hostBoardId) {
    this.hostBoardId = hostBoardId;
  }

  
  /**
   * The host board's status.
   **/
  public HostBoard status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host board's status.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The host board's type.
   **/
  public HostBoard type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host board's type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The reference for this physical host board.
   **/
  public HostBoard hostBoardRef(String hostBoardRef) {
    this.hostBoardRef = hostBoardRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for this physical host board.")
  @JsonProperty("hostBoardRef")
  public String getHostBoardRef() {
    return hostBoardRef;
  }
  
  public void setHostBoardRef(String hostBoardRef) {
    this.hostBoardRef = hostBoardRef;
  }

  
  /**
   * The number of ports provided by the host board.
   **/
  public HostBoard numberOfPorts(Integer numberOfPorts) {
    this.numberOfPorts = numberOfPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of ports provided by the host board.")
  @JsonProperty("numberOfPorts")
  public Integer getNumberOfPorts() {
    return numberOfPorts;
  }
  
  public void setNumberOfPorts(Integer numberOfPorts) {
    this.numberOfPorts = numberOfPorts;
  }

  
  /**
   * Data that is specific to the type of host board.
   **/
  public HostBoard hbTypeData(HostBoardTypeData hbTypeData) {
    this.hbTypeData = hbTypeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Data that is specific to the type of host board.")
  @JsonProperty("hbTypeData")
  public HostBoardTypeData getHbTypeData() {
    return hbTypeData;
  }
  
  public void setHbTypeData(HostBoardTypeData hbTypeData) {
    this.hbTypeData = hbTypeData;
  }

  
  /**
   * The OEM part number of the host board.
   **/
  public HostBoard oemPartNumber(String oemPartNumber) {
    this.oemPartNumber = oemPartNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The OEM part number of the host board.")
  @JsonProperty("oemPartNumber")
  public String getOemPartNumber() {
    return oemPartNumber;
  }
  
  public void setOemPartNumber(String oemPartNumber) {
    this.oemPartNumber = oemPartNumber;
  }

  
  /**
   * The number of the slot on the controller where the host board resides. Host board slots are numbered starting at one, independent of other types of slots (e.g., cache backup device slots) on the controller.
   **/
  public HostBoard hostBoardControllerSlot(Integer hostBoardControllerSlot) {
    this.hostBoardControllerSlot = hostBoardControllerSlot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the slot on the controller where the host board resides. Host board slots are numbered starting at one, independent of other types of slots (e.g., cache backup device slots) on the controller.")
  @JsonProperty("hostBoardControllerSlot")
  public Integer getHostBoardControllerSlot() {
    return hostBoardControllerSlot;
  }
  
  public void setHostBoardControllerSlot(Integer hostBoardControllerSlot) {
    this.hostBoardControllerSlot = hostBoardControllerSlot;
  }

  
  /**
   * The repair policy for the host board component.
   **/
  public HostBoard repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the host board component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   * The physical location of the host board. The parent reference in Location identifies the controller where the host board is physically located, and the position field is the parent-relative/like-component relative slot number of the host card, starting at 1.
   **/
  public HostBoard physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the host board. The parent reference in Location identifies the controller where the host board is physically located, and the position field is the parent-relative/like-component relative slot number of the host card, starting at 1.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   **/
  public HostBoard id(String id) {
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
    HostBoard hostBoard = (HostBoard) o;
    return Objects.equals(this.parentController, hostBoard.parentController) &&
        Objects.equals(this.partNumber, hostBoard.partNumber) &&
        Objects.equals(this.serialNumber, hostBoard.serialNumber) &&
        Objects.equals(this.vendorName, hostBoard.vendorName) &&
        Objects.equals(this.manufacturerDate, hostBoard.manufacturerDate) &&
        Objects.equals(this.fruType, hostBoard.fruType) &&
        Objects.equals(this.hostBoardId, hostBoard.hostBoardId) &&
        Objects.equals(this.status, hostBoard.status) &&
        Objects.equals(this.type, hostBoard.type) &&
        Objects.equals(this.hostBoardRef, hostBoard.hostBoardRef) &&
        Objects.equals(this.numberOfPorts, hostBoard.numberOfPorts) &&
        Objects.equals(this.hbTypeData, hostBoard.hbTypeData) &&
        Objects.equals(this.oemPartNumber, hostBoard.oemPartNumber) &&
        Objects.equals(this.hostBoardControllerSlot, hostBoard.hostBoardControllerSlot) &&
        Objects.equals(this.repairPolicy, hostBoard.repairPolicy) &&
        Objects.equals(this.physicalLocation, hostBoard.physicalLocation) &&
        Objects.equals(this.id, hostBoard.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentController, partNumber, serialNumber, vendorName, manufacturerDate, fruType, hostBoardId, status, type, hostBoardRef, numberOfPorts, hbTypeData, oemPartNumber, hostBoardControllerSlot, repairPolicy, physicalLocation, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostBoard {\n");
    
    sb.append("    parentController: ").append(toIndentedString(parentController)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    fruType: ").append(toIndentedString(fruType)).append("\n");
    sb.append("    hostBoardId: ").append(toIndentedString(hostBoardId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hostBoardRef: ").append(toIndentedString(hostBoardRef)).append("\n");
    sb.append("    numberOfPorts: ").append(toIndentedString(numberOfPorts)).append("\n");
    sb.append("    hbTypeData: ").append(toIndentedString(hbTypeData)).append("\n");
    sb.append("    oemPartNumber: ").append(toIndentedString(oemPartNumber)).append("\n");
    sb.append("    hostBoardControllerSlot: ").append(toIndentedString(hostBoardControllerSlot)).append("\n");
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

