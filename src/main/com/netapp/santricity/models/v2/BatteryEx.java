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
 * BatteryEx
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class BatteryEx   {
  
    private String batteryRef;


  /**
   * The operational status of the battery.
   */
  public enum StatusEnum {
    optimal("optimal"),
    fullCharging("fullCharging"),
    nearExpiration("nearExpiration"),
    failed("failed"),
    removed("removed"),
    unknown("unknown"),
    notInConfig("notInConfig"),
    configMismatch("configMismatch"),
    learning("learning"),
    overtemp("overtemp"),
    expired("expired"),
    maintenanceCharging("maintenanceCharging"),
    replacementRequired("replacementRequired"),
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

    private Integer batteryAge;

    private Integer batteryLifeRemaining;

    private BatteryTypeData batteryTypeData;

    private String reserved1;

    private String reserved2;

    private Long manufacturerDate;

    private String vendorName;

    private String vendorPN;

    private String vendorSN;

    private String fruType;

    private RTRAttributes rtrAttributes;

    private RepairPolicy repairPolicy;

    private Boolean batteryCanExpire;

    private Boolean automaticAgeReset;

    private SmartBatteryData learnCycleData;

    private SmartBatteryData smartBatteryData;

    private String id;

  
  /**
   * The reference for this battery.
   **/
  public BatteryEx batteryRef(String batteryRef) {
    this.batteryRef = batteryRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for this battery.")
  @JsonProperty("batteryRef")
  public String getBatteryRef() {
    return batteryRef;
  }
  
  public void setBatteryRef(String batteryRef) {
    this.batteryRef = batteryRef;
  }

  
  /**
   * The operational status of the battery.
   **/
  public BatteryEx status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status of the battery.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The physical location of the battery. The parent reference in Location identifies the CRU that physically houses the battery, and the position field is the parent-relative/like-component relative slot number of the battery, starting at one.
   **/
  public BatteryEx physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the battery. The parent reference in Location identifies the CRU that physically houses the battery, and the position field is the parent-relative/like-component relative slot number of the battery, starting at one.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * Current battery age, in days.
   **/
  public BatteryEx batteryAge(Integer batteryAge) {
    this.batteryAge = batteryAge;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Current battery age, in days.")
  @JsonProperty("batteryAge")
  public Integer getBatteryAge() {
    return batteryAge;
  }
  
  public void setBatteryAge(Integer batteryAge) {
    this.batteryAge = batteryAge;
  }

  
  /**
   * Days of battery life remaining. A value of -1 indicates that the battery life expiration age has been set to 0xFF in NVSRAM, disabling cache battery expiration event notification.
   **/
  public BatteryEx batteryLifeRemaining(Integer batteryLifeRemaining) {
    this.batteryLifeRemaining = batteryLifeRemaining;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Days of battery life remaining. A value of -1 indicates that the battery life expiration age has been set to 0xFF in NVSRAM, disabling cache battery expiration event notification.")
  @JsonProperty("batteryLifeRemaining")
  public Integer getBatteryLifeRemaining() {
    return batteryLifeRemaining;
  }
  
  public void setBatteryLifeRemaining(Integer batteryLifeRemaining) {
    this.batteryLifeRemaining = batteryLifeRemaining;
  }

  
  /**
   * Used to determine the scope of the battery.
   **/
  public BatteryEx batteryTypeData(BatteryTypeData batteryTypeData) {
    this.batteryTypeData = batteryTypeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Used to determine the scope of the battery.")
  @JsonProperty("batteryTypeData")
  public BatteryTypeData getBatteryTypeData() {
    return batteryTypeData;
  }
  
  public void setBatteryTypeData(BatteryTypeData batteryTypeData) {
    this.batteryTypeData = batteryTypeData;
  }

  
  /**
   **/
  public BatteryEx reserved1(String reserved1) {
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
  public BatteryEx reserved2(String reserved2) {
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
   * VPD manufacture date.
   **/
  public BatteryEx manufacturerDate(Long manufacturerDate) {
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
  public BatteryEx vendorName(String vendorName) {
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
  public BatteryEx vendorPN(String vendorPN) {
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
  public BatteryEx vendorSN(String vendorSN) {
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
  public BatteryEx fruType(String fruType) {
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
   * The CRU type of the battery plus its ready-to-remove attributes, which are based on the CRU type.
   **/
  public BatteryEx rtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The CRU type of the battery plus its ready-to-remove attributes, which are based on the CRU type.")
  @JsonProperty("rtrAttributes")
  public RTRAttributes getRtrAttributes() {
    return rtrAttributes;
  }
  
  public void setRtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
  }

  
  /**
   * The repair policy for the battery component.
   **/
  public BatteryEx repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the battery component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   * This boolean field is set to true when cache battery expired event notification is enabled.
   **/
  public BatteryEx batteryCanExpire(Boolean batteryCanExpire) {
    this.batteryCanExpire = batteryCanExpire;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This boolean field is set to true when cache battery expired event notification is enabled.")
  @JsonProperty("batteryCanExpire")
  public Boolean getBatteryCanExpire() {
    return batteryCanExpire;
  }
  
  public void setBatteryCanExpire(Boolean batteryCanExpire) {
    this.batteryCanExpire = batteryCanExpire;
  }

  
  /**
   * This boolean field is set to true when the batteryCanExpire field in this structure is set to false and when the controller tracks the battery serial number.
   **/
  public BatteryEx automaticAgeReset(Boolean automaticAgeReset) {
    this.automaticAgeReset = automaticAgeReset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This boolean field is set to true when the batteryCanExpire field in this structure is set to false and when the controller tracks the battery serial number.")
  @JsonProperty("automaticAgeReset")
  public Boolean getAutomaticAgeReset() {
    return automaticAgeReset;
  }
  
  public void setAutomaticAgeReset(Boolean automaticAgeReset) {
    this.automaticAgeReset = automaticAgeReset;
  }

  
  /**
   * Contains details about the learn cycle for this battery
   **/
  public BatteryEx learnCycleData(SmartBatteryData learnCycleData) {
    this.learnCycleData = learnCycleData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains details about the learn cycle for this battery")
  @JsonProperty("learnCycleData")
  public SmartBatteryData getLearnCycleData() {
    return learnCycleData;
  }
  
  public void setLearnCycleData(SmartBatteryData learnCycleData) {
    this.learnCycleData = learnCycleData;
  }

  
  /**
   **/
  public BatteryEx smartBatteryData(SmartBatteryData smartBatteryData) {
    this.smartBatteryData = smartBatteryData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("smartBatteryData")
  public SmartBatteryData getSmartBatteryData() {
    return smartBatteryData;
  }
  
  public void setSmartBatteryData(SmartBatteryData smartBatteryData) {
    this.smartBatteryData = smartBatteryData;
  }

  
  /**
   **/
  public BatteryEx id(String id) {
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
    BatteryEx batteryEx = (BatteryEx) o;
    return Objects.equals(this.batteryRef, batteryEx.batteryRef) &&
        Objects.equals(this.status, batteryEx.status) &&
        Objects.equals(this.physicalLocation, batteryEx.physicalLocation) &&
        Objects.equals(this.batteryAge, batteryEx.batteryAge) &&
        Objects.equals(this.batteryLifeRemaining, batteryEx.batteryLifeRemaining) &&
        Objects.equals(this.batteryTypeData, batteryEx.batteryTypeData) &&
        Objects.equals(this.reserved1, batteryEx.reserved1) &&
        Objects.equals(this.reserved2, batteryEx.reserved2) &&
        Objects.equals(this.manufacturerDate, batteryEx.manufacturerDate) &&
        Objects.equals(this.vendorName, batteryEx.vendorName) &&
        Objects.equals(this.vendorPN, batteryEx.vendorPN) &&
        Objects.equals(this.vendorSN, batteryEx.vendorSN) &&
        Objects.equals(this.fruType, batteryEx.fruType) &&
        Objects.equals(this.rtrAttributes, batteryEx.rtrAttributes) &&
        Objects.equals(this.repairPolicy, batteryEx.repairPolicy) &&
        Objects.equals(this.batteryCanExpire, batteryEx.batteryCanExpire) &&
        Objects.equals(this.automaticAgeReset, batteryEx.automaticAgeReset) &&
        Objects.equals(this.learnCycleData, batteryEx.learnCycleData) &&
        Objects.equals(this.smartBatteryData, batteryEx.smartBatteryData) &&
        Objects.equals(this.id, batteryEx.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryRef, status, physicalLocation, batteryAge, batteryLifeRemaining, batteryTypeData, reserved1, reserved2, manufacturerDate, vendorName, vendorPN, vendorSN, fruType, rtrAttributes, repairPolicy, batteryCanExpire, automaticAgeReset, learnCycleData, smartBatteryData, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatteryEx {\n");
    
    sb.append("    batteryRef: ").append(toIndentedString(batteryRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    batteryAge: ").append(toIndentedString(batteryAge)).append("\n");
    sb.append("    batteryLifeRemaining: ").append(toIndentedString(batteryLifeRemaining)).append("\n");
    sb.append("    batteryTypeData: ").append(toIndentedString(batteryTypeData)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorPN: ").append(toIndentedString(vendorPN)).append("\n");
    sb.append("    vendorSN: ").append(toIndentedString(vendorSN)).append("\n");
    sb.append("    fruType: ").append(toIndentedString(fruType)).append("\n");
    sb.append("    rtrAttributes: ").append(toIndentedString(rtrAttributes)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
    sb.append("    batteryCanExpire: ").append(toIndentedString(batteryCanExpire)).append("\n");
    sb.append("    automaticAgeReset: ").append(toIndentedString(automaticAgeReset)).append("\n");
    sb.append("    learnCycleData: ").append(toIndentedString(learnCycleData)).append("\n");
    sb.append("    smartBatteryData: ").append(toIndentedString(smartBatteryData)).append("\n");
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

