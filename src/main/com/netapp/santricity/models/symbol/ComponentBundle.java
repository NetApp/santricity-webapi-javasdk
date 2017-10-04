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
 * ComponentBundle
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ComponentBundle   {
  
    private List<Fan> fan;

    private List<Battery> battery;

    private List<PowerSupply> powerSupply;

    private List<ThermalSensor> thermalSensor;

    private List<Esm> esm;

    private List<Ups> ups;

    private List<Minihub> minihub;

    private List<Gbic> gbic;

    private List<Sfp> sfp;

    private List<InterconnectCRU> interconnectCRU;

    private List<SupportCRU> supportCRU;

    private List<Alarm> alarm;

    private List<HostBoard> hostBoard;

    private List<SasExpander> sasExpander;

    private List<CacheBackupDevice> cacheBackupDevice;

    private List<CacheMemoryDimm> cacheMemoryDimm;

    private List<ProcessorMemoryDimm> processorMemoryDimm;

    private List<Drawer> drawer;

  
  /**
   * The fan component.
   **/
  public ComponentBundle fan(List<Fan> fan) {
    this.fan = fan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The fan component.")
  @JsonProperty("fan")
  public List<Fan> getFan() {
    return fan;
  }
  
  public void setFan(List<Fan> fan) {
    this.fan = fan;
  }

  
  /**
   * The battery component.
   **/
  public ComponentBundle battery(List<Battery> battery) {
    this.battery = battery;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The battery component.")
  @JsonProperty("battery")
  public List<Battery> getBattery() {
    return battery;
  }
  
  public void setBattery(List<Battery> battery) {
    this.battery = battery;
  }

  
  /**
   * The power supply component.
   **/
  public ComponentBundle powerSupply(List<PowerSupply> powerSupply) {
    this.powerSupply = powerSupply;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The power supply component.")
  @JsonProperty("powerSupply")
  public List<PowerSupply> getPowerSupply() {
    return powerSupply;
  }
  
  public void setPowerSupply(List<PowerSupply> powerSupply) {
    this.powerSupply = powerSupply;
  }

  
  /**
   * The thermal sensor component.
   **/
  public ComponentBundle thermalSensor(List<ThermalSensor> thermalSensor) {
    this.thermalSensor = thermalSensor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The thermal sensor component.")
  @JsonProperty("thermalSensor")
  public List<ThermalSensor> getThermalSensor() {
    return thermalSensor;
  }
  
  public void setThermalSensor(List<ThermalSensor> thermalSensor) {
    this.thermalSensor = thermalSensor;
  }

  
  /**
   * The ESM component.
   **/
  public ComponentBundle esm(List<Esm> esm) {
    this.esm = esm;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ESM component.")
  @JsonProperty("esm")
  public List<Esm> getEsm() {
    return esm;
  }
  
  public void setEsm(List<Esm> esm) {
    this.esm = esm;
  }

  
  /**
   * The UPS component.
   **/
  public ComponentBundle ups(List<Ups> ups) {
    this.ups = ups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The UPS component.")
  @JsonProperty("ups")
  public List<Ups> getUps() {
    return ups;
  }
  
  public void setUps(List<Ups> ups) {
    this.ups = ups;
  }

  
  /**
   * The minihub component.
   **/
  public ComponentBundle minihub(List<Minihub> minihub) {
    this.minihub = minihub;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minihub component.")
  @JsonProperty("minihub")
  public List<Minihub> getMinihub() {
    return minihub;
  }
  
  public void setMinihub(List<Minihub> minihub) {
    this.minihub = minihub;
  }

  
  /**
   * The GBIC component.
   **/
  public ComponentBundle gbic(List<Gbic> gbic) {
    this.gbic = gbic;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The GBIC component.")
  @JsonProperty("gbic")
  public List<Gbic> getGbic() {
    return gbic;
  }
  
  public void setGbic(List<Gbic> gbic) {
    this.gbic = gbic;
  }

  
  /**
   * The SFP component.
   **/
  public ComponentBundle sfp(List<Sfp> sfp) {
    this.sfp = sfp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SFP component.")
  @JsonProperty("sfp")
  public List<Sfp> getSfp() {
    return sfp;
  }
  
  public void setSfp(List<Sfp> sfp) {
    this.sfp = sfp;
  }

  
  /**
   * The interconnect CRU.
   **/
  public ComponentBundle interconnectCRU(List<InterconnectCRU> interconnectCRU) {
    this.interconnectCRU = interconnectCRU;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The interconnect CRU.")
  @JsonProperty("interconnectCRU")
  public List<InterconnectCRU> getInterconnectCRU() {
    return interconnectCRU;
  }
  
  public void setInterconnectCRU(List<InterconnectCRU> interconnectCRU) {
    this.interconnectCRU = interconnectCRU;
  }

  
  /**
   * The Support CRU.
   **/
  public ComponentBundle supportCRU(List<SupportCRU> supportCRU) {
    this.supportCRU = supportCRU;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Support CRU.")
  @JsonProperty("supportCRU")
  public List<SupportCRU> getSupportCRU() {
    return supportCRU;
  }
  
  public void setSupportCRU(List<SupportCRU> supportCRU) {
    this.supportCRU = supportCRU;
  }

  
  /**
   * The alarm.
   **/
  public ComponentBundle alarm(List<Alarm> alarm) {
    this.alarm = alarm;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The alarm.")
  @JsonProperty("alarm")
  public List<Alarm> getAlarm() {
    return alarm;
  }
  
  public void setAlarm(List<Alarm> alarm) {
    this.alarm = alarm;
  }

  
  /**
   * The host board.
   **/
  public ComponentBundle hostBoard(List<HostBoard> hostBoard) {
    this.hostBoard = hostBoard;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host board.")
  @JsonProperty("hostBoard")
  public List<HostBoard> getHostBoard() {
    return hostBoard;
  }
  
  public void setHostBoard(List<HostBoard> hostBoard) {
    this.hostBoard = hostBoard;
  }

  
  /**
   * The SAS expanders.
   **/
  public ComponentBundle sasExpander(List<SasExpander> sasExpander) {
    this.sasExpander = sasExpander;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SAS expanders.")
  @JsonProperty("sasExpander")
  public List<SasExpander> getSasExpander() {
    return sasExpander;
  }
  
  public void setSasExpander(List<SasExpander> sasExpander) {
    this.sasExpander = sasExpander;
  }

  
  /**
   * The cache backup devices.
   **/
  public ComponentBundle cacheBackupDevice(List<CacheBackupDevice> cacheBackupDevice) {
    this.cacheBackupDevice = cacheBackupDevice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cache backup devices.")
  @JsonProperty("cacheBackupDevice")
  public List<CacheBackupDevice> getCacheBackupDevice() {
    return cacheBackupDevice;
  }
  
  public void setCacheBackupDevice(List<CacheBackupDevice> cacheBackupDevice) {
    this.cacheBackupDevice = cacheBackupDevice;
  }

  
  /**
   * List of field replaceable cache memory DIMM modules.
   **/
  public ComponentBundle cacheMemoryDimm(List<CacheMemoryDimm> cacheMemoryDimm) {
    this.cacheMemoryDimm = cacheMemoryDimm;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of field replaceable cache memory DIMM modules.")
  @JsonProperty("cacheMemoryDimm")
  public List<CacheMemoryDimm> getCacheMemoryDimm() {
    return cacheMemoryDimm;
  }
  
  public void setCacheMemoryDimm(List<CacheMemoryDimm> cacheMemoryDimm) {
    this.cacheMemoryDimm = cacheMemoryDimm;
  }

  
  /**
   * List of field replaceable processor memory DIMMs.
   **/
  public ComponentBundle processorMemoryDimm(List<ProcessorMemoryDimm> processorMemoryDimm) {
    this.processorMemoryDimm = processorMemoryDimm;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of field replaceable processor memory DIMMs.")
  @JsonProperty("processorMemoryDimm")
  public List<ProcessorMemoryDimm> getProcessorMemoryDimm() {
    return processorMemoryDimm;
  }
  
  public void setProcessorMemoryDimm(List<ProcessorMemoryDimm> processorMemoryDimm) {
    this.processorMemoryDimm = processorMemoryDimm;
  }

  
  /**
   * List of drawers.
   **/
  public ComponentBundle drawer(List<Drawer> drawer) {
    this.drawer = drawer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of drawers.")
  @JsonProperty("drawer")
  public List<Drawer> getDrawer() {
    return drawer;
  }
  
  public void setDrawer(List<Drawer> drawer) {
    this.drawer = drawer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentBundle componentBundle = (ComponentBundle) o;
    return Objects.equals(this.fan, componentBundle.fan) &&
        Objects.equals(this.battery, componentBundle.battery) &&
        Objects.equals(this.powerSupply, componentBundle.powerSupply) &&
        Objects.equals(this.thermalSensor, componentBundle.thermalSensor) &&
        Objects.equals(this.esm, componentBundle.esm) &&
        Objects.equals(this.ups, componentBundle.ups) &&
        Objects.equals(this.minihub, componentBundle.minihub) &&
        Objects.equals(this.gbic, componentBundle.gbic) &&
        Objects.equals(this.sfp, componentBundle.sfp) &&
        Objects.equals(this.interconnectCRU, componentBundle.interconnectCRU) &&
        Objects.equals(this.supportCRU, componentBundle.supportCRU) &&
        Objects.equals(this.alarm, componentBundle.alarm) &&
        Objects.equals(this.hostBoard, componentBundle.hostBoard) &&
        Objects.equals(this.sasExpander, componentBundle.sasExpander) &&
        Objects.equals(this.cacheBackupDevice, componentBundle.cacheBackupDevice) &&
        Objects.equals(this.cacheMemoryDimm, componentBundle.cacheMemoryDimm) &&
        Objects.equals(this.processorMemoryDimm, componentBundle.processorMemoryDimm) &&
        Objects.equals(this.drawer, componentBundle.drawer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fan, battery, powerSupply, thermalSensor, esm, ups, minihub, gbic, sfp, interconnectCRU, supportCRU, alarm, hostBoard, sasExpander, cacheBackupDevice, cacheMemoryDimm, processorMemoryDimm, drawer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentBundle {\n");
    
    sb.append("    fan: ").append(toIndentedString(fan)).append("\n");
    sb.append("    battery: ").append(toIndentedString(battery)).append("\n");
    sb.append("    powerSupply: ").append(toIndentedString(powerSupply)).append("\n");
    sb.append("    thermalSensor: ").append(toIndentedString(thermalSensor)).append("\n");
    sb.append("    esm: ").append(toIndentedString(esm)).append("\n");
    sb.append("    ups: ").append(toIndentedString(ups)).append("\n");
    sb.append("    minihub: ").append(toIndentedString(minihub)).append("\n");
    sb.append("    gbic: ").append(toIndentedString(gbic)).append("\n");
    sb.append("    sfp: ").append(toIndentedString(sfp)).append("\n");
    sb.append("    interconnectCRU: ").append(toIndentedString(interconnectCRU)).append("\n");
    sb.append("    supportCRU: ").append(toIndentedString(supportCRU)).append("\n");
    sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
    sb.append("    hostBoard: ").append(toIndentedString(hostBoard)).append("\n");
    sb.append("    sasExpander: ").append(toIndentedString(sasExpander)).append("\n");
    sb.append("    cacheBackupDevice: ").append(toIndentedString(cacheBackupDevice)).append("\n");
    sb.append("    cacheMemoryDimm: ").append(toIndentedString(cacheMemoryDimm)).append("\n");
    sb.append("    processorMemoryDimm: ").append(toIndentedString(processorMemoryDimm)).append("\n");
    sb.append("    drawer: ").append(toIndentedString(drawer)).append("\n");
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

