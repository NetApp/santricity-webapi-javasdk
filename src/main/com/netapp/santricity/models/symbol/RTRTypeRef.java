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
 * RTRTypeRef
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class RTRTypeRef   {
  

  /**
   * This enumeration is used to determine the type of a given component.
   */
  public enum RtrTypeEnum {
    unknown("unknown"),
    interconnect("interconnect"),
    supportCru("supportCru"),
    controller("controller"),
    battery("battery"),
    drive("drive"),
    esm("esm"),
    fan("fan"),
    powerSupply("powerSupply"),
    minihub("minihub"),
    alarm("alarm"),
    thermalSensor("thermalSensor"),
    drawer("drawer"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RtrTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RtrTypeEnum rtrType;

    private String batteryRef;

    private String controllerRef;

    private String driveRef;

    private String esmRef;

    private String fanRef;

    private String interconnectRef;

    private String minihubRef;

    private String powerSupplyRef;

    private String supportCruRef;

  
  /**
   * This enumeration is used to determine the type of a given component.
   **/
  public RTRTypeRef rtrType(RtrTypeEnum rtrType) {
    this.rtrType = rtrType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration is used to determine the type of a given component.")
  @JsonProperty("rtrType")
  public RtrTypeEnum getRtrType() {
    return rtrType;
  }
  
  public void setRtrType(RtrTypeEnum rtrType) {
    this.rtrType = rtrType;
  }

  
  /**
   * This field is present only if the RTRType is RTR_TYPE_BATTERY.
   **/
  public RTRTypeRef batteryRef(String batteryRef) {
    this.batteryRef = batteryRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RTRType is RTR_TYPE_BATTERY.")
  @JsonProperty("batteryRef")
  public String getBatteryRef() {
    return batteryRef;
  }
  
  public void setBatteryRef(String batteryRef) {
    this.batteryRef = batteryRef;
  }

  
  /**
   * This field is present only if the RTRType is RTR_TYPE_CONTROLLER.
   **/
  public RTRTypeRef controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RTRType is RTR_TYPE_CONTROLLER.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * This field is present only if the RTRType is RTR_TYPE_DRIVE.
   **/
  public RTRTypeRef driveRef(String driveRef) {
    this.driveRef = driveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RTRType is RTR_TYPE_DRIVE.")
  @JsonProperty("driveRef")
  public String getDriveRef() {
    return driveRef;
  }
  
  public void setDriveRef(String driveRef) {
    this.driveRef = driveRef;
  }

  
  /**
   * This field is present only if the RTRType is RTR_TYPE_ESM.
   **/
  public RTRTypeRef esmRef(String esmRef) {
    this.esmRef = esmRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RTRType is RTR_TYPE_ESM.")
  @JsonProperty("esmRef")
  public String getEsmRef() {
    return esmRef;
  }
  
  public void setEsmRef(String esmRef) {
    this.esmRef = esmRef;
  }

  
  /**
   * This field is present only if the RTRType is RTR_TYPE_FAN.
   **/
  public RTRTypeRef fanRef(String fanRef) {
    this.fanRef = fanRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RTRType is RTR_TYPE_FAN.")
  @JsonProperty("fanRef")
  public String getFanRef() {
    return fanRef;
  }
  
  public void setFanRef(String fanRef) {
    this.fanRef = fanRef;
  }

  
  /**
   * This field is present only if the RTRType is RTR_TYPE_INTERCONNECT.
   **/
  public RTRTypeRef interconnectRef(String interconnectRef) {
    this.interconnectRef = interconnectRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RTRType is RTR_TYPE_INTERCONNECT.")
  @JsonProperty("interconnectRef")
  public String getInterconnectRef() {
    return interconnectRef;
  }
  
  public void setInterconnectRef(String interconnectRef) {
    this.interconnectRef = interconnectRef;
  }

  
  /**
   * This field is present only if the RTRType is RTR_TYPE_MINIHUB.
   **/
  public RTRTypeRef minihubRef(String minihubRef) {
    this.minihubRef = minihubRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RTRType is RTR_TYPE_MINIHUB.")
  @JsonProperty("minihubRef")
  public String getMinihubRef() {
    return minihubRef;
  }
  
  public void setMinihubRef(String minihubRef) {
    this.minihubRef = minihubRef;
  }

  
  /**
   * This field is present only if the RTRType is RTR_TYPE_POWER_SUPPLY.
   **/
  public RTRTypeRef powerSupplyRef(String powerSupplyRef) {
    this.powerSupplyRef = powerSupplyRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RTRType is RTR_TYPE_POWER_SUPPLY.")
  @JsonProperty("powerSupplyRef")
  public String getPowerSupplyRef() {
    return powerSupplyRef;
  }
  
  public void setPowerSupplyRef(String powerSupplyRef) {
    this.powerSupplyRef = powerSupplyRef;
  }

  
  /**
   * This field is present only if the RTRType is RTR_TYPE_SUPPORT_CRU.
   **/
  public RTRTypeRef supportCruRef(String supportCruRef) {
    this.supportCruRef = supportCruRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RTRType is RTR_TYPE_SUPPORT_CRU.")
  @JsonProperty("supportCruRef")
  public String getSupportCruRef() {
    return supportCruRef;
  }
  
  public void setSupportCruRef(String supportCruRef) {
    this.supportCruRef = supportCruRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTRTypeRef rTRTypeRef = (RTRTypeRef) o;
    return Objects.equals(this.rtrType, rTRTypeRef.rtrType) &&
        Objects.equals(this.batteryRef, rTRTypeRef.batteryRef) &&
        Objects.equals(this.controllerRef, rTRTypeRef.controllerRef) &&
        Objects.equals(this.driveRef, rTRTypeRef.driveRef) &&
        Objects.equals(this.esmRef, rTRTypeRef.esmRef) &&
        Objects.equals(this.fanRef, rTRTypeRef.fanRef) &&
        Objects.equals(this.interconnectRef, rTRTypeRef.interconnectRef) &&
        Objects.equals(this.minihubRef, rTRTypeRef.minihubRef) &&
        Objects.equals(this.powerSupplyRef, rTRTypeRef.powerSupplyRef) &&
        Objects.equals(this.supportCruRef, rTRTypeRef.supportCruRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtrType, batteryRef, controllerRef, driveRef, esmRef, fanRef, interconnectRef, minihubRef, powerSupplyRef, supportCruRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTRTypeRef {\n");
    
    sb.append("    rtrType: ").append(toIndentedString(rtrType)).append("\n");
    sb.append("    batteryRef: ").append(toIndentedString(batteryRef)).append("\n");
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    driveRef: ").append(toIndentedString(driveRef)).append("\n");
    sb.append("    esmRef: ").append(toIndentedString(esmRef)).append("\n");
    sb.append("    fanRef: ").append(toIndentedString(fanRef)).append("\n");
    sb.append("    interconnectRef: ").append(toIndentedString(interconnectRef)).append("\n");
    sb.append("    minihubRef: ").append(toIndentedString(minihubRef)).append("\n");
    sb.append("    powerSupplyRef: ").append(toIndentedString(powerSupplyRef)).append("\n");
    sb.append("    supportCruRef: ").append(toIndentedString(supportCruRef)).append("\n");
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

