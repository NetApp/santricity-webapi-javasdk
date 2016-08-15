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
 * Drawer
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class Drawer   {
  
    private String drawerRef;

    private Boolean isOpen;


  /**
   * This field contains the drawer status.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    failed("failed"),
    opened("opened"),
    removed("removed"),
    degraded("degraded"),
    invalid("invalid"),
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

    private RepairPolicy repairPolicy;

    private String softwareVersion;

    private String partNumber;

    private String serialNumber;

    private String vendorName;

    private Long manufactureDate;

    private String fruType;

    private String drawerType;

    private String id;

  
  /**
   * The component reference associated with the drawer.
   **/
  public Drawer drawerRef(String drawerRef) {
    this.drawerRef = drawerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The component reference associated with the drawer.")
  @JsonProperty("drawerRef")
  public String getDrawerRef() {
    return drawerRef;
  }
  
  public void setDrawerRef(String drawerRef) {
    this.drawerRef = drawerRef;
  }

  
  /**
   * This value is set to true when the drawer is open; otherwise it is set to false.
   **/
  public Drawer isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value is set to true when the drawer is open; otherwise it is set to false.")
  @JsonProperty("isOpen")
  public Boolean getIsOpen() {
    return isOpen;
  }
  
  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }

  
  /**
   * This field contains the drawer status.
   **/
  public Drawer status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the drawer status.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * This field contains the drawer location. This will be a tray reference to the tray containing the drawer.
   **/
  public Drawer physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the drawer location. This will be a tray reference to the tray containing the drawer.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * This field contains the repair policy for the drawer component.
   **/
  public Drawer repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the repair policy for the drawer component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   * This data is a variable length ASCII text string. It contains the firmware version for the DCM (Drawer Control and Monitor) chip on the drawer component.
   **/
  public Drawer softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string. It contains the firmware version for the DCM (Drawer Control and Monitor) chip on the drawer component.")
  @JsonProperty("softwareVersion")
  public String getSoftwareVersion() {
    return softwareVersion;
  }
  
  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  
  /**
   * This data is a variable length ASCII text string. It contains the DCM (Drawer Control and Monitor) chip part number on the drawer component. This part number is from VPD data.
   **/
  public Drawer partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string. It contains the DCM (Drawer Control and Monitor) chip part number on the drawer component. This part number is from VPD data.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * This data is a variable length ASCII text string. It contains the DCM (Drawer Control and Monitor) chip serial number on the drawer component. This serial number is from VPD data.
   **/
  public Drawer serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string. It contains the DCM (Drawer Control and Monitor) chip serial number on the drawer component. This serial number is from VPD data.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * This data is a variable length ASCII text string. It contains the DCM (Drawer Control and Monitor) chip manufacturer name, obtained from VPD data.
   **/
  public Drawer vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string. It contains the DCM (Drawer Control and Monitor) chip manufacturer name, obtained from VPD data.")
  @JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  
  /**
   * This data is a variable length ASCII text string. It contains the DCM (Drawer Control and Monitor) manufacture date, obtained from VPD data.
   **/
  public Drawer manufactureDate(Long manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string. It contains the DCM (Drawer Control and Monitor) manufacture date, obtained from VPD data.")
  @JsonProperty("manufactureDate")
  public Long getManufactureDate() {
    return manufactureDate;
  }
  
  public void setManufactureDate(Long manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  
  /**
   * This data is a variable length ASCII text string. It contains the Field Replaceable Unit (FRU) type, obtained from VPD data.
   **/
  public Drawer fruType(String fruType) {
    this.fruType = fruType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string. It contains the Field Replaceable Unit (FRU) type, obtained from VPD data.")
  @JsonProperty("fruType")
  public String getFruType() {
    return fruType;
  }
  
  public void setFruType(String fruType) {
    this.fruType = fruType;
  }

  
  /**
   * This data is a variable length ASCII text string describing the type of drawer.
   **/
  public Drawer drawerType(String drawerType) {
    this.drawerType = drawerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string describing the type of drawer.")
  @JsonProperty("drawerType")
  public String getDrawerType() {
    return drawerType;
  }
  
  public void setDrawerType(String drawerType) {
    this.drawerType = drawerType;
  }

  
  /**
   **/
  public Drawer id(String id) {
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
    Drawer drawer = (Drawer) o;
    return Objects.equals(this.drawerRef, drawer.drawerRef) &&
        Objects.equals(this.isOpen, drawer.isOpen) &&
        Objects.equals(this.status, drawer.status) &&
        Objects.equals(this.physicalLocation, drawer.physicalLocation) &&
        Objects.equals(this.repairPolicy, drawer.repairPolicy) &&
        Objects.equals(this.softwareVersion, drawer.softwareVersion) &&
        Objects.equals(this.partNumber, drawer.partNumber) &&
        Objects.equals(this.serialNumber, drawer.serialNumber) &&
        Objects.equals(this.vendorName, drawer.vendorName) &&
        Objects.equals(this.manufactureDate, drawer.manufactureDate) &&
        Objects.equals(this.fruType, drawer.fruType) &&
        Objects.equals(this.drawerType, drawer.drawerType) &&
        Objects.equals(this.id, drawer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drawerRef, isOpen, status, physicalLocation, repairPolicy, softwareVersion, partNumber, serialNumber, vendorName, manufactureDate, fruType, drawerType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drawer {\n");
    
    sb.append("    drawerRef: ").append(toIndentedString(drawerRef)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    manufactureDate: ").append(toIndentedString(manufactureDate)).append("\n");
    sb.append("    fruType: ").append(toIndentedString(fruType)).append("\n");
    sb.append("    drawerType: ").append(toIndentedString(drawerType)).append("\n");
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

