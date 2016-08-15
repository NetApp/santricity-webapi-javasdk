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
 * Provides summary information for the physical components of the storage system.
 */
@ApiModel(description = "Provides summary information for the physical components of the storage system.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class HardwareInventoryResponse   {
  
    private List<DriveEx> drives;

    private List<IBInterfacePort> ibPorts;

    private List<IScsiInterfacePort> iscsiPorts;

    private List<FibreInterfacePort> fibrePorts;

    private List<SasInterfacePort> sasPorts;

    private List<SasExpander> sasExpanders;

    private List<ChannelPort> channelPorts;

    private List<TrayEx> trays;

    private List<Drawer> drawers;

    private List<Controller> controllers;

    private List<BatteryEx> batteries;

    private List<Fan> fans;

    private List<HostBoard> hostBoards;

    private List<PowerSupply> powerSupplies;

    private String nvsramVersion;

    private List<CacheMemoryDimm> cacheMemoryDimms;

    private List<CacheBackupDevice> cacheBackupDevices;

    private List<SupportCRU> supportCRUs;

    private List<Esm> esms;

    private List<Sfp> sfps;

    private List<ThermalSensor> thermalSensors;

  
  /**
   * A list of the disk drives in the storage system.
   **/
  public HardwareInventoryResponse drives(List<DriveEx> drives) {
    this.drives = drives;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the disk drives in the storage system.")
  @JsonProperty("drives")
  public List<DriveEx> getDrives() {
    return drives;
  }
  
  public void setDrives(List<DriveEx> drives) {
    this.drives = drives;
  }

  
  /**
   * IB Ports
   **/
  public HardwareInventoryResponse ibPorts(List<IBInterfacePort> ibPorts) {
    this.ibPorts = ibPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IB Ports")
  @JsonProperty("ibPorts")
  public List<IBInterfacePort> getIbPorts() {
    return ibPorts;
  }
  
  public void setIbPorts(List<IBInterfacePort> ibPorts) {
    this.ibPorts = ibPorts;
  }

  
  /**
   * ISCSI Port
   **/
  public HardwareInventoryResponse iscsiPorts(List<IScsiInterfacePort> iscsiPorts) {
    this.iscsiPorts = iscsiPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ISCSI Port")
  @JsonProperty("iscsiPorts")
  public List<IScsiInterfacePort> getIscsiPorts() {
    return iscsiPorts;
  }
  
  public void setIscsiPorts(List<IScsiInterfacePort> iscsiPorts) {
    this.iscsiPorts = iscsiPorts;
  }

  
  /**
   * Fibre Ports
   **/
  public HardwareInventoryResponse fibrePorts(List<FibreInterfacePort> fibrePorts) {
    this.fibrePorts = fibrePorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Fibre Ports")
  @JsonProperty("fibrePorts")
  public List<FibreInterfacePort> getFibrePorts() {
    return fibrePorts;
  }
  
  public void setFibrePorts(List<FibreInterfacePort> fibrePorts) {
    this.fibrePorts = fibrePorts;
  }

  
  /**
   * SAS Ports
   **/
  public HardwareInventoryResponse sasPorts(List<SasInterfacePort> sasPorts) {
    this.sasPorts = sasPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "SAS Ports")
  @JsonProperty("sasPorts")
  public List<SasInterfacePort> getSasPorts() {
    return sasPorts;
  }
  
  public void setSasPorts(List<SasInterfacePort> sasPorts) {
    this.sasPorts = sasPorts;
  }

  
  /**
   * SAS Expanders
   **/
  public HardwareInventoryResponse sasExpanders(List<SasExpander> sasExpanders) {
    this.sasExpanders = sasExpanders;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "SAS Expanders")
  @JsonProperty("sasExpanders")
  public List<SasExpander> getSasExpanders() {
    return sasExpanders;
  }
  
  public void setSasExpanders(List<SasExpander> sasExpanders) {
    this.sasExpanders = sasExpanders;
  }

  
  /**
   * Channel Ports
   **/
  public HardwareInventoryResponse channelPorts(List<ChannelPort> channelPorts) {
    this.channelPorts = channelPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Channel Ports")
  @JsonProperty("channelPorts")
  public List<ChannelPort> getChannelPorts() {
    return channelPorts;
  }
  
  public void setChannelPorts(List<ChannelPort> channelPorts) {
    this.channelPorts = channelPorts;
  }

  
  /**
   * A list of the disk trays in the storage system.
   **/
  public HardwareInventoryResponse trays(List<TrayEx> trays) {
    this.trays = trays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the disk trays in the storage system.")
  @JsonProperty("trays")
  public List<TrayEx> getTrays() {
    return trays;
  }
  
  public void setTrays(List<TrayEx> trays) {
    this.trays = trays;
  }

  
  /**
   * A list of the disk drawers
   **/
  public HardwareInventoryResponse drawers(List<Drawer> drawers) {
    this.drawers = drawers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the disk drawers")
  @JsonProperty("drawers")
  public List<Drawer> getDrawers() {
    return drawers;
  }
  
  public void setDrawers(List<Drawer> drawers) {
    this.drawers = drawers;
  }

  
  /**
   * A list of the controllers in the storage system.
   **/
  public HardwareInventoryResponse controllers(List<Controller> controllers) {
    this.controllers = controllers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the controllers in the storage system.")
  @JsonProperty("controllers")
  public List<Controller> getControllers() {
    return controllers;
  }
  
  public void setControllers(List<Controller> controllers) {
    this.controllers = controllers;
  }

  
  /**
   * A list of the batteries in the storage system.
   **/
  public HardwareInventoryResponse batteries(List<BatteryEx> batteries) {
    this.batteries = batteries;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the batteries in the storage system.")
  @JsonProperty("batteries")
  public List<BatteryEx> getBatteries() {
    return batteries;
  }
  
  public void setBatteries(List<BatteryEx> batteries) {
    this.batteries = batteries;
  }

  
  /**
   * A list of the fans in the storage system.
   **/
  public HardwareInventoryResponse fans(List<Fan> fans) {
    this.fans = fans;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the fans in the storage system.")
  @JsonProperty("fans")
  public List<Fan> getFans() {
    return fans;
  }
  
  public void setFans(List<Fan> fans) {
    this.fans = fans;
  }

  
  /**
   * A list of the host interface cards in the storage system.
   **/
  public HardwareInventoryResponse hostBoards(List<HostBoard> hostBoards) {
    this.hostBoards = hostBoards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the host interface cards in the storage system.")
  @JsonProperty("hostBoards")
  public List<HostBoard> getHostBoards() {
    return hostBoards;
  }
  
  public void setHostBoards(List<HostBoard> hostBoards) {
    this.hostBoards = hostBoards;
  }

  
  /**
   * A list of the power supplies in the storage system.
   **/
  public HardwareInventoryResponse powerSupplies(List<PowerSupply> powerSupplies) {
    this.powerSupplies = powerSupplies;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the power supplies in the storage system.")
  @JsonProperty("powerSupplies")
  public List<PowerSupply> getPowerSupplies() {
    return powerSupplies;
  }
  
  public void setPowerSupplies(List<PowerSupply> powerSupplies) {
    this.powerSupplies = powerSupplies;
  }

  
  /**
   * The version of NVSRAM settings installed on the storage system.
   **/
  public HardwareInventoryResponse nvsramVersion(String nvsramVersion) {
    this.nvsramVersion = nvsramVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version of NVSRAM settings installed on the storage system.")
  @JsonProperty("nvsramVersion")
  public String getNvsramVersion() {
    return nvsramVersion;
  }
  
  public void setNvsramVersion(String nvsramVersion) {
    this.nvsramVersion = nvsramVersion;
  }

  
  /**
   * The list of processor memory DIMMs installed on the storage system.
   **/
  public HardwareInventoryResponse cacheMemoryDimms(List<CacheMemoryDimm> cacheMemoryDimms) {
    this.cacheMemoryDimms = cacheMemoryDimms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of processor memory DIMMs installed on the storage system.")
  @JsonProperty("cacheMemoryDimms")
  public List<CacheMemoryDimm> getCacheMemoryDimms() {
    return cacheMemoryDimms;
  }
  
  public void setCacheMemoryDimms(List<CacheMemoryDimm> cacheMemoryDimms) {
    this.cacheMemoryDimms = cacheMemoryDimms;
  }

  
  /**
   * The list of cache backup modules installed on the storage system.
   **/
  public HardwareInventoryResponse cacheBackupDevices(List<CacheBackupDevice> cacheBackupDevices) {
    this.cacheBackupDevices = cacheBackupDevices;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of cache backup modules installed on the storage system.")
  @JsonProperty("cacheBackupDevices")
  public List<CacheBackupDevice> getCacheBackupDevices() {
    return cacheBackupDevices;
  }
  
  public void setCacheBackupDevices(List<CacheBackupDevice> cacheBackupDevices) {
    this.cacheBackupDevices = cacheBackupDevices;
  }

  
  /**
   * A list of the support CRUs in the storage system.
   **/
  public HardwareInventoryResponse supportCRUs(List<SupportCRU> supportCRUs) {
    this.supportCRUs = supportCRUs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the support CRUs in the storage system.")
  @JsonProperty("supportCRUs")
  public List<SupportCRU> getSupportCRUs() {
    return supportCRUs;
  }
  
  public void setSupportCRUs(List<SupportCRU> supportCRUs) {
    this.supportCRUs = supportCRUs;
  }

  
  /**
   * A list of the ESMs in the storage system.
   **/
  public HardwareInventoryResponse esms(List<Esm> esms) {
    this.esms = esms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the ESMs in the storage system.")
  @JsonProperty("esms")
  public List<Esm> getEsms() {
    return esms;
  }
  
  public void setEsms(List<Esm> esms) {
    this.esms = esms;
  }

  
  /**
   * A list of the SFPs in the storage system.
   **/
  public HardwareInventoryResponse sfps(List<Sfp> sfps) {
    this.sfps = sfps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the SFPs in the storage system.")
  @JsonProperty("sfps")
  public List<Sfp> getSfps() {
    return sfps;
  }
  
  public void setSfps(List<Sfp> sfps) {
    this.sfps = sfps;
  }

  
  /**
   * A list of the thermal sensors in the storage system.
   **/
  public HardwareInventoryResponse thermalSensors(List<ThermalSensor> thermalSensors) {
    this.thermalSensors = thermalSensors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the thermal sensors in the storage system.")
  @JsonProperty("thermalSensors")
  public List<ThermalSensor> getThermalSensors() {
    return thermalSensors;
  }
  
  public void setThermalSensors(List<ThermalSensor> thermalSensors) {
    this.thermalSensors = thermalSensors;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HardwareInventoryResponse hardwareInventoryResponse = (HardwareInventoryResponse) o;
    return Objects.equals(this.drives, hardwareInventoryResponse.drives) &&
        Objects.equals(this.ibPorts, hardwareInventoryResponse.ibPorts) &&
        Objects.equals(this.iscsiPorts, hardwareInventoryResponse.iscsiPorts) &&
        Objects.equals(this.fibrePorts, hardwareInventoryResponse.fibrePorts) &&
        Objects.equals(this.sasPorts, hardwareInventoryResponse.sasPorts) &&
        Objects.equals(this.sasExpanders, hardwareInventoryResponse.sasExpanders) &&
        Objects.equals(this.channelPorts, hardwareInventoryResponse.channelPorts) &&
        Objects.equals(this.trays, hardwareInventoryResponse.trays) &&
        Objects.equals(this.drawers, hardwareInventoryResponse.drawers) &&
        Objects.equals(this.controllers, hardwareInventoryResponse.controllers) &&
        Objects.equals(this.batteries, hardwareInventoryResponse.batteries) &&
        Objects.equals(this.fans, hardwareInventoryResponse.fans) &&
        Objects.equals(this.hostBoards, hardwareInventoryResponse.hostBoards) &&
        Objects.equals(this.powerSupplies, hardwareInventoryResponse.powerSupplies) &&
        Objects.equals(this.nvsramVersion, hardwareInventoryResponse.nvsramVersion) &&
        Objects.equals(this.cacheMemoryDimms, hardwareInventoryResponse.cacheMemoryDimms) &&
        Objects.equals(this.cacheBackupDevices, hardwareInventoryResponse.cacheBackupDevices) &&
        Objects.equals(this.supportCRUs, hardwareInventoryResponse.supportCRUs) &&
        Objects.equals(this.esms, hardwareInventoryResponse.esms) &&
        Objects.equals(this.sfps, hardwareInventoryResponse.sfps) &&
        Objects.equals(this.thermalSensors, hardwareInventoryResponse.thermalSensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drives, ibPorts, iscsiPorts, fibrePorts, sasPorts, sasExpanders, channelPorts, trays, drawers, controllers, batteries, fans, hostBoards, powerSupplies, nvsramVersion, cacheMemoryDimms, cacheBackupDevices, supportCRUs, esms, sfps, thermalSensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HardwareInventoryResponse {\n");
    
    sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
    sb.append("    ibPorts: ").append(toIndentedString(ibPorts)).append("\n");
    sb.append("    iscsiPorts: ").append(toIndentedString(iscsiPorts)).append("\n");
    sb.append("    fibrePorts: ").append(toIndentedString(fibrePorts)).append("\n");
    sb.append("    sasPorts: ").append(toIndentedString(sasPorts)).append("\n");
    sb.append("    sasExpanders: ").append(toIndentedString(sasExpanders)).append("\n");
    sb.append("    channelPorts: ").append(toIndentedString(channelPorts)).append("\n");
    sb.append("    trays: ").append(toIndentedString(trays)).append("\n");
    sb.append("    drawers: ").append(toIndentedString(drawers)).append("\n");
    sb.append("    controllers: ").append(toIndentedString(controllers)).append("\n");
    sb.append("    batteries: ").append(toIndentedString(batteries)).append("\n");
    sb.append("    fans: ").append(toIndentedString(fans)).append("\n");
    sb.append("    hostBoards: ").append(toIndentedString(hostBoards)).append("\n");
    sb.append("    powerSupplies: ").append(toIndentedString(powerSupplies)).append("\n");
    sb.append("    nvsramVersion: ").append(toIndentedString(nvsramVersion)).append("\n");
    sb.append("    cacheMemoryDimms: ").append(toIndentedString(cacheMemoryDimms)).append("\n");
    sb.append("    cacheBackupDevices: ").append(toIndentedString(cacheBackupDevices)).append("\n");
    sb.append("    supportCRUs: ").append(toIndentedString(supportCRUs)).append("\n");
    sb.append("    esms: ").append(toIndentedString(esms)).append("\n");
    sb.append("    sfps: ").append(toIndentedString(sfps)).append("\n");
    sb.append("    thermalSensors: ").append(toIndentedString(thermalSensors)).append("\n");
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

