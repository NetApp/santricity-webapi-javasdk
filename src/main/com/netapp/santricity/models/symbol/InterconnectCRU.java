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
 * InterconnectCRU
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class InterconnectCRU   {
  
    private String interconnectCRURef;


  /**
   * The operational status of the interconnect CRU
   */
  public enum StatusEnum {
    optimal("optimal"),
    failed("failed"),
    removed("removed"),
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

    private Long manufacturerDate;

    private String vendorName;

    private String vendorPN;

    private String vendorSN;

    private String fruType;

    private Boolean readyToRemove;

    private RTRAttributes rtrAttributes;

    private RepairPolicy repairPolicy;

  
  /**
   * The reference for this physical interconnect CRU
   **/
  public InterconnectCRU interconnectCRURef(String interconnectCRURef) {
    this.interconnectCRURef = interconnectCRURef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for this physical interconnect CRU")
  @JsonProperty("interconnectCRURef")
  public String getInterconnectCRURef() {
    return interconnectCRURef;
  }
  
  public void setInterconnectCRURef(String interconnectCRURef) {
    this.interconnectCRURef = interconnectCRURef;
  }

  
  /**
   * The operational status of the interconnect CRU
   **/
  public InterconnectCRU status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status of the interconnect CRU")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The physical location of the interconnect CRU. The parent reference in Location identifies the tray containing the CRU, and the position field is always one.
   **/
  public InterconnectCRU physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the interconnect CRU. The parent reference in Location identifies the tray containing the CRU, and the position field is always one.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * VPD Manufacture Date
   **/
  public InterconnectCRU manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "VPD Manufacture Date")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   * The VPD vendor name
   **/
  public InterconnectCRU vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The VPD vendor name")
  @JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  
  /**
   * The VPD part number
   **/
  public InterconnectCRU vendorPN(String vendorPN) {
    this.vendorPN = vendorPN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The VPD part number")
  @JsonProperty("vendorPN")
  public String getVendorPN() {
    return vendorPN;
  }
  
  public void setVendorPN(String vendorPN) {
    this.vendorPN = vendorPN;
  }

  
  /**
   * The VPD serial number
   **/
  public InterconnectCRU vendorSN(String vendorSN) {
    this.vendorSN = vendorSN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The VPD serial number")
  @JsonProperty("vendorSN")
  public String getVendorSN() {
    return vendorSN;
  }
  
  public void setVendorSN(String vendorSN) {
    this.vendorSN = vendorSN;
  }

  
  /**
   * The VPD field replaceable unit type
   **/
  public InterconnectCRU fruType(String fruType) {
    this.fruType = fruType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The VPD field replaceable unit type")
  @JsonProperty("fruType")
  public String getFruType() {
    return fruType;
  }
  
  public void setFruType(String fruType) {
    this.fruType = fruType;
  }

  
  /**
   * When set to True, it means that the component is ready to remove (and the Ready to Remove indicator will be turned on). This field is deprecated. The rtrAttributes field should be used instead.
   **/
  public InterconnectCRU readyToRemove(Boolean readyToRemove) {
    this.readyToRemove = readyToRemove;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When set to True, it means that the component is ready to remove (and the Ready to Remove indicator will be turned on). This field is deprecated. The rtrAttributes field should be used instead.")
  @JsonProperty("readyToRemove")
  public Boolean getReadyToRemove() {
    return readyToRemove;
  }
  
  public void setReadyToRemove(Boolean readyToRemove) {
    this.readyToRemove = readyToRemove;
  }

  
  /**
   * The CRU type of the interconnect CRU plus its ready-to-remove attributes, which are based on the CRU type.
   **/
  public InterconnectCRU rtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The CRU type of the interconnect CRU plus its ready-to-remove attributes, which are based on the CRU type.")
  @JsonProperty("rtrAttributes")
  public RTRAttributes getRtrAttributes() {
    return rtrAttributes;
  }
  
  public void setRtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
  }

  
  /**
   * The repair policy for the interconnect CRU component.
   **/
  public InterconnectCRU repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the interconnect CRU component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterconnectCRU interconnectCRU = (InterconnectCRU) o;
    return Objects.equals(this.interconnectCRURef, interconnectCRU.interconnectCRURef) &&
        Objects.equals(this.status, interconnectCRU.status) &&
        Objects.equals(this.physicalLocation, interconnectCRU.physicalLocation) &&
        Objects.equals(this.manufacturerDate, interconnectCRU.manufacturerDate) &&
        Objects.equals(this.vendorName, interconnectCRU.vendorName) &&
        Objects.equals(this.vendorPN, interconnectCRU.vendorPN) &&
        Objects.equals(this.vendorSN, interconnectCRU.vendorSN) &&
        Objects.equals(this.fruType, interconnectCRU.fruType) &&
        Objects.equals(this.readyToRemove, interconnectCRU.readyToRemove) &&
        Objects.equals(this.rtrAttributes, interconnectCRU.rtrAttributes) &&
        Objects.equals(this.repairPolicy, interconnectCRU.repairPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interconnectCRURef, status, physicalLocation, manufacturerDate, vendorName, vendorPN, vendorSN, fruType, readyToRemove, rtrAttributes, repairPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterconnectCRU {\n");
    
    sb.append("    interconnectCRURef: ").append(toIndentedString(interconnectCRURef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorPN: ").append(toIndentedString(vendorPN)).append("\n");
    sb.append("    vendorSN: ").append(toIndentedString(vendorSN)).append("\n");
    sb.append("    fruType: ").append(toIndentedString(fruType)).append("\n");
    sb.append("    readyToRemove: ").append(toIndentedString(readyToRemove)).append("\n");
    sb.append("    rtrAttributes: ").append(toIndentedString(rtrAttributes)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
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

