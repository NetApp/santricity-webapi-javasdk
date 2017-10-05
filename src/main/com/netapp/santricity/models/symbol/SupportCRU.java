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
 * SupportCRU
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SupportCRU   {
  
    private String supportCRURef;


  /**
   * The operational status of the support CRU.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    failed("failed"),
    removed("removed"),
    noinput("noinput"),
    incorrectConfig("incorrectConfig"),
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


  /**
   * Gets or Sets configuredComponents
   */
  public enum ConfiguredComponentsEnum {
    unknown("unknown"),
    fan("fan"),
    battery("battery"),
    powerSupply("powerSupply"),
    thermalSensor("thermalSensor"),
    esm("esm"),
    ups("ups"),
    minihub("minihub"),
    gbic("gbic"),
    sfp("sfp"),
    interconnectCru("interconnectCru"),
    supportCru("supportCru"),
    alarm("alarm"),
    hostboard("hostboard"),
    icSasExpander("icSasExpander"),
    hostIoCard("hostIoCard"),
    cacheBackupDevice("cacheBackupDevice"),
    cacheMemDimm("cacheMemDimm"),
    procMemDimm("procMemDimm"),
    channelPort("channelPort"),
    drive("drive"),
    controller("controller"),
    ethernetInterface("ethernetInterface"),
    fibreInterface("fibreInterface"),
    ibInterface("ibInterface"),
    iscsiInterface("iscsiInterface"),
    sasInterface("sasInterface"),
    tray("tray"),
    storageArray("storageArray"),
    drawer("drawer"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ConfiguredComponentsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<ConfiguredComponentsEnum> configuredComponents;


  /**
   * The type of this support CRU (e.g., \"power-fan\" or \"battery\")
   */
  public enum TypeEnum {
    unknown("unknown"),
    powerFan("powerFan"),
    battery("battery"),
    fan("fan"),
    powerSupply("powerSupply"),
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

    private RepairPolicy repairPolicy;

    private String id;

  
  /**
   * The reference for this physical support CRU.
   **/
  public SupportCRU supportCRURef(String supportCRURef) {
    this.supportCRURef = supportCRURef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for this physical support CRU.")
  @JsonProperty("supportCRURef")
  public String getSupportCRURef() {
    return supportCRURef;
  }
  
  public void setSupportCRURef(String supportCRURef) {
    this.supportCRURef = supportCRURef;
  }

  
  /**
   * The operational status of the support CRU.
   **/
  public SupportCRU status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status of the support CRU.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The physical location of the support CRU. The parent reference in Location identifies the tray containing the CRU, and the position field is the parent-relative/like-component relative slot number of the CRU, starting at one.
   **/
  public SupportCRU physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the support CRU. The parent reference in Location identifies the tray containing the CRU, and the position field is the parent-relative/like-component relative slot number of the CRU, starting at one.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * VPD manufacture date.
   **/
  public SupportCRU manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "VPD manufacture date.")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   * VPD vendor name.
   **/
  public SupportCRU vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "VPD vendor name.")
  @JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  
  /**
   * VPD part number.
   **/
  public SupportCRU vendorPN(String vendorPN) {
    this.vendorPN = vendorPN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "VPD part number.")
  @JsonProperty("vendorPN")
  public String getVendorPN() {
    return vendorPN;
  }
  
  public void setVendorPN(String vendorPN) {
    this.vendorPN = vendorPN;
  }

  
  /**
   * VPD serial number.
   **/
  public SupportCRU vendorSN(String vendorSN) {
    this.vendorSN = vendorSN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "VPD serial number.")
  @JsonProperty("vendorSN")
  public String getVendorSN() {
    return vendorSN;
  }
  
  public void setVendorSN(String vendorSN) {
    this.vendorSN = vendorSN;
  }

  
  /**
   * VPD field replaceable unit type.
   **/
  public SupportCRU fruType(String fruType) {
    this.fruType = fruType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "VPD field replaceable unit type.")
  @JsonProperty("fruType")
  public String getFruType() {
    return fruType;
  }
  
  public void setFruType(String fruType) {
    this.fruType = fruType;
  }

  
  /**
   * When set to True, the component is ready to remove (and the Ready to Remove indicator light is turned on). This field is deprecated. The rtrAttributes field should be used instead.
   **/
  public SupportCRU readyToRemove(Boolean readyToRemove) {
    this.readyToRemove = readyToRemove;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When set to True, the component is ready to remove (and the Ready to Remove indicator light is turned on). This field is deprecated. The rtrAttributes field should be used instead.")
  @JsonProperty("readyToRemove")
  public Boolean getReadyToRemove() {
    return readyToRemove;
  }
  
  public void setReadyToRemove(Boolean readyToRemove) {
    this.readyToRemove = readyToRemove;
  }

  
  /**
   * The CRU type of the support CRU plus its ready-to-remove attributes, which are based on the CRU type.
   **/
  public SupportCRU rtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The CRU type of the support CRU plus its ready-to-remove attributes, which are based on the CRU type.")
  @JsonProperty("rtrAttributes")
  public RTRAttributes getRtrAttributes() {
    return rtrAttributes;
  }
  
  public void setRtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
  }

  
  /**
   * A variable-length list of the types of components that occupy the support CRU.
   **/
  public SupportCRU configuredComponents(List<ConfiguredComponentsEnum> configuredComponents) {
    this.configuredComponents = configuredComponents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length list of the types of components that occupy the support CRU.")
  @JsonProperty("configuredComponents")
  public List<ConfiguredComponentsEnum> getConfiguredComponents() {
    return configuredComponents;
  }
  
  public void setConfiguredComponents(List<ConfiguredComponentsEnum> configuredComponents) {
    this.configuredComponents = configuredComponents;
  }

  
  /**
   * The type of this support CRU (e.g., \"power-fan\" or \"battery\")
   **/
  public SupportCRU type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of this support CRU (e.g., \"power-fan\" or \"battery\")")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The repair policy for the support CRU component.
   **/
  public SupportCRU repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the support CRU component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   **/
  public SupportCRU id(String id) {
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
    SupportCRU supportCRU = (SupportCRU) o;
    return Objects.equals(this.supportCRURef, supportCRU.supportCRURef) &&
        Objects.equals(this.status, supportCRU.status) &&
        Objects.equals(this.physicalLocation, supportCRU.physicalLocation) &&
        Objects.equals(this.manufacturerDate, supportCRU.manufacturerDate) &&
        Objects.equals(this.vendorName, supportCRU.vendorName) &&
        Objects.equals(this.vendorPN, supportCRU.vendorPN) &&
        Objects.equals(this.vendorSN, supportCRU.vendorSN) &&
        Objects.equals(this.fruType, supportCRU.fruType) &&
        Objects.equals(this.readyToRemove, supportCRU.readyToRemove) &&
        Objects.equals(this.rtrAttributes, supportCRU.rtrAttributes) &&
        Objects.equals(this.configuredComponents, supportCRU.configuredComponents) &&
        Objects.equals(this.type, supportCRU.type) &&
        Objects.equals(this.repairPolicy, supportCRU.repairPolicy) &&
        Objects.equals(this.id, supportCRU.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportCRURef, status, physicalLocation, manufacturerDate, vendorName, vendorPN, vendorSN, fruType, readyToRemove, rtrAttributes, configuredComponents, type, repairPolicy, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCRU {\n");
    
    sb.append("    supportCRURef: ").append(toIndentedString(supportCRURef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorPN: ").append(toIndentedString(vendorPN)).append("\n");
    sb.append("    vendorSN: ").append(toIndentedString(vendorSN)).append("\n");
    sb.append("    fruType: ").append(toIndentedString(fruType)).append("\n");
    sb.append("    readyToRemove: ").append(toIndentedString(readyToRemove)).append("\n");
    sb.append("    rtrAttributes: ").append(toIndentedString(rtrAttributes)).append("\n");
    sb.append("    configuredComponents: ").append(toIndentedString(configuredComponents)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
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

