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
 * ComponentLocation
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ComponentLocation   {
  

  /**
   * This enumeration object is used to specify the different component types that can be associated with entries in the Major Event Log.
   */
  public enum EventComponentTypeEnum {
    unknown("unknown"),
    drive("drive"),
    powerSply("powerSply"),
    fan("fan"),
    minihub("minihub"),
    tempSensor("tempSensor"),
    channel("channel"),
    esm("esm"),
    controller("controller"),
    battery("battery"),
    enclosure("enclosure"),
    ups("ups"),
    chip("chip"),
    volume("volume"),
    volumeGrp("volumeGrp"),
    portCru("portCru"),
    interconnectCru("interconnectCru"),
    supportCru("supportCru"),
    alarm("alarm"),
    channelPort("channelPort"),
    sfpPort("sfpPort"),
    hostBoard("hostBoard"),
    newFormat("newFormat"),
    ctlrSfp("ctlrSfp"),
    ctlrSoc("ctlrSoc"),
    initiator("initiator"),
    target("target"),
    isnsServer("isnsServer"),
    hostIoCard("hostIoCard"),
    cacheBackupDevice("cacheBackupDevice"),
    cacheMemDimm("cacheMemDimm"),
    host("host"),
    hostPort("hostPort"),
    drawer("drawer"),
    relative("relative"),
    schedule("schedule"),
    asyncMirrorGroup("asyncMirrorGroup"),
    diskPool("diskPool"),
    pit("pit"),
    pitConsistencyGroup("pitConsistencyGroup"),
    cgpit("cgpit"),
    cgview("cgview"),
    flashCache("flashCache"),
    snmpCommunity("snmpCommunity"),
    snmpTrapDestination("snmpTrapDestination"),
    fcTarget("fcTarget"),
    blankOne("blankOne"),
    blankTwo("blankTwo"),
    fanOnlyCru("fanOnlyCru"),
    psuCru("psuCru"),
    nvmeInitiator("nvmeInitiator"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    EventComponentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private EventComponentTypeEnum eventComponentType;

    private TraySlot alarmLocation;

    private Integer batteryTray;

    private CacheBackupDeviceLocation cacheBackupDeviceLocation;

    private CacheMemoryDimmLocation cacheMemoryDimmLocation;

    private ChannelLocation channelLoc;

    private Integer channelPort;

    private TraySlot chipLoc;

    private TraySlot controllerLoc;

    private ControllerSfpLocation ctlrSfpLocation;

    private SocLocation socLocation;

    private TraySlot driveLoc;

    private Integer enclosureTray;

    private Integer esmTray;

    private Integer fanTray;

    private HostIoCardLocation hostIoCardLocation;

    private InitiatorLocation initiatorLocation;

    private TraySlot interconnectCruLocation;

    private IsnsServerLocation isnsServerLocation;

    private MinihubLocation minihubLoc;

    private Integer portCruTray;

    private Integer powerSupplyTray;

    private TraySlot sfpLocation;

    private TraySlot supportCruLocation;

    private TargetLocation targetLocation;

    private Integer tempSensorTray;

    private String label;

    private Integer groupNumber;

    private String hostLocation;

    private HostPortLocation hostPortLocation;

    private TraySlot drawerLocation;

    private ComponentRelativeLocation componentRelativeLocation;

    private String schedule;

    private Integer diskPool;

    private String asyncMirrorGroup;

    private String pitLabel;

    private String cgLabel;

    private String cgPitLabel;

    private String cgViewLabel;

    private String flashCacheLabel;

    private String communityNameString;

    private String destinationIpAddress;

    private FibreChannelTargetLocation fcTargetLocation;

    private TraySlot fanCruLocation;

    private TraySlot powerSupplyCruLocation;

    private InitiatorLocation nvmeInitiatorLocation;

  
  /**
   * This enumeration object is used to specify the different component types that can be associated with entries in the Major Event Log.
   **/
  public ComponentLocation eventComponentType(EventComponentTypeEnum eventComponentType) {
    this.eventComponentType = eventComponentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to specify the different component types that can be associated with entries in the Major Event Log.")
  @JsonProperty("eventComponentType")
  public EventComponentTypeEnum getEventComponentType() {
    return eventComponentType;
  }
  
  public void setEventComponentType(EventComponentTypeEnum eventComponentType) {
    this.eventComponentType = eventComponentType;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_ALARM.
   **/
  public ComponentLocation alarmLocation(TraySlot alarmLocation) {
    this.alarmLocation = alarmLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_ALARM.")
  @JsonProperty("alarmLocation")
  public TraySlot getAlarmLocation() {
    return alarmLocation;
  }
  
  public void setAlarmLocation(TraySlot alarmLocation) {
    this.alarmLocation = alarmLocation;
  }

  
  /**
   * The tray ID of the tray containing the battery for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_BATTERY.
   **/
  public ComponentLocation batteryTray(Integer batteryTray) {
    this.batteryTray = batteryTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tray ID of the tray containing the battery for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_BATTERY.")
  @JsonProperty("batteryTray")
  public Integer getBatteryTray() {
    return batteryTray;
  }
  
  public void setBatteryTray(Integer batteryTray) {
    this.batteryTray = batteryTray;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal toEVENT_COMP_TYPE_CACHE_BACKUP_DEVICE. It identifies the location of the cache backup device to which the event applies.
   **/
  public ComponentLocation cacheBackupDeviceLocation(CacheBackupDeviceLocation cacheBackupDeviceLocation) {
    this.cacheBackupDeviceLocation = cacheBackupDeviceLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal toEVENT_COMP_TYPE_CACHE_BACKUP_DEVICE. It identifies the location of the cache backup device to which the event applies.")
  @JsonProperty("cacheBackupDeviceLocation")
  public CacheBackupDeviceLocation getCacheBackupDeviceLocation() {
    return cacheBackupDeviceLocation;
  }
  
  public void setCacheBackupDeviceLocation(CacheBackupDeviceLocation cacheBackupDeviceLocation) {
    this.cacheBackupDeviceLocation = cacheBackupDeviceLocation;
  }

  
  /**
   * This field is only valid when the eventComponentType value is equal to EVENT_COMP_TYPE_CACHE_MEM_DIMM. It identifies the location of the cache memory DIMM to which the event applies.
   **/
  public ComponentLocation cacheMemoryDimmLocation(CacheMemoryDimmLocation cacheMemoryDimmLocation) {
    this.cacheMemoryDimmLocation = cacheMemoryDimmLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType value is equal to EVENT_COMP_TYPE_CACHE_MEM_DIMM. It identifies the location of the cache memory DIMM to which the event applies.")
  @JsonProperty("cacheMemoryDimmLocation")
  public CacheMemoryDimmLocation getCacheMemoryDimmLocation() {
    return cacheMemoryDimmLocation;
  }
  
  public void setCacheMemoryDimmLocation(CacheMemoryDimmLocation cacheMemoryDimmLocation) {
    this.cacheMemoryDimmLocation = cacheMemoryDimmLocation;
  }

  
  /**
   * The location of the channel. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CHANNEL.
   **/
  public ComponentLocation channelLoc(ChannelLocation channelLoc) {
    this.channelLoc = channelLoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The location of the channel. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CHANNEL.")
  @JsonProperty("channelLoc")
  public ChannelLocation getChannelLoc() {
    return channelLoc;
  }
  
  public void setChannelLoc(ChannelLocation channelLoc) {
    this.channelLoc = channelLoc;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CHANNEL_PORT.
   **/
  public ComponentLocation channelPort(Integer channelPort) {
    this.channelPort = channelPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CHANNEL_PORT.")
  @JsonProperty("channelPort")
  public Integer getChannelPort() {
    return channelPort;
  }
  
  public void setChannelPort(Integer channelPort) {
    this.channelPort = channelPort;
  }

  
  /**
   * The physical location of the controller that owns the chip for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CHIP.
   **/
  public ComponentLocation chipLoc(TraySlot chipLoc) {
    this.chipLoc = chipLoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The physical location of the controller that owns the chip for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CHIP.")
  @JsonProperty("chipLoc")
  public TraySlot getChipLoc() {
    return chipLoc;
  }
  
  public void setChipLoc(TraySlot chipLoc) {
    this.chipLoc = chipLoc;
  }

  
  /**
   * The physical location of the controller for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CONTROLLER.
   **/
  public ComponentLocation controllerLoc(TraySlot controllerLoc) {
    this.controllerLoc = controllerLoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The physical location of the controller for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CONTROLLER.")
  @JsonProperty("controllerLoc")
  public TraySlot getControllerLoc() {
    return controllerLoc;
  }
  
  public void setControllerLoc(TraySlot controllerLoc) {
    this.controllerLoc = controllerLoc;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CTLR_SFP.
   **/
  public ComponentLocation ctlrSfpLocation(ControllerSfpLocation ctlrSfpLocation) {
    this.ctlrSfpLocation = ctlrSfpLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CTLR_SFP.")
  @JsonProperty("ctlrSfpLocation")
  public ControllerSfpLocation getCtlrSfpLocation() {
    return ctlrSfpLocation;
  }
  
  public void setCtlrSfpLocation(ControllerSfpLocation ctlrSfpLocation) {
    this.ctlrSfpLocation = ctlrSfpLocation;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CTLR_SOC.
   **/
  public ComponentLocation socLocation(SocLocation socLocation) {
    this.socLocation = socLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_CTLR_SOC.")
  @JsonProperty("socLocation")
  public SocLocation getSocLocation() {
    return socLocation;
  }
  
  public void setSocLocation(SocLocation socLocation) {
    this.socLocation = socLocation;
  }

  
  /**
   * The physical location of the drive for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_DRIVE.
   **/
  public ComponentLocation driveLoc(TraySlot driveLoc) {
    this.driveLoc = driveLoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The physical location of the drive for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_DRIVE.")
  @JsonProperty("driveLoc")
  public TraySlot getDriveLoc() {
    return driveLoc;
  }
  
  public void setDriveLoc(TraySlot driveLoc) {
    this.driveLoc = driveLoc;
  }

  
  /**
   * The tray ID of the tray for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_ENCLOSURE.
   **/
  public ComponentLocation enclosureTray(Integer enclosureTray) {
    this.enclosureTray = enclosureTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tray ID of the tray for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_ENCLOSURE.")
  @JsonProperty("enclosureTray")
  public Integer getEnclosureTray() {
    return enclosureTray;
  }
  
  public void setEnclosureTray(Integer enclosureTray) {
    this.enclosureTray = enclosureTray;
  }

  
  /**
   * The tray ID of the tray containing the ESM card for which the MEL entry was generated. This field is not used and is considered deprecated. Instead the ESM tray/slot location is given by the ExtendedComponentLocation field.
   **/
  public ComponentLocation esmTray(Integer esmTray) {
    this.esmTray = esmTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tray ID of the tray containing the ESM card for which the MEL entry was generated. This field is not used and is considered deprecated. Instead the ESM tray/slot location is given by the ExtendedComponentLocation field.")
  @JsonProperty("esmTray")
  public Integer getEsmTray() {
    return esmTray;
  }
  
  public void setEsmTray(Integer esmTray) {
    this.esmTray = esmTray;
  }

  
  /**
   * The tray ID of the tray containing the fan for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_FAN.
   **/
  public ComponentLocation fanTray(Integer fanTray) {
    this.fanTray = fanTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tray ID of the tray containing the fan for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_FAN.")
  @JsonProperty("fanTray")
  public Integer getFanTray() {
    return fanTray;
  }
  
  public void setFanTray(Integer fanTray) {
    this.fanTray = fanTray;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_HOST_IO_CARD. It identifies the location of the host I/O card to which the event applies.
   **/
  public ComponentLocation hostIoCardLocation(HostIoCardLocation hostIoCardLocation) {
    this.hostIoCardLocation = hostIoCardLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_HOST_IO_CARD. It identifies the location of the host I/O card to which the event applies.")
  @JsonProperty("hostIoCardLocation")
  public HostIoCardLocation getHostIoCardLocation() {
    return hostIoCardLocation;
  }
  
  public void setHostIoCardLocation(HostIoCardLocation hostIoCardLocation) {
    this.hostIoCardLocation = hostIoCardLocation;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_INITIATOR. It identifies the iSCSI initiator to which the event applies.
   **/
  public ComponentLocation initiatorLocation(InitiatorLocation initiatorLocation) {
    this.initiatorLocation = initiatorLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_INITIATOR. It identifies the iSCSI initiator to which the event applies.")
  @JsonProperty("initiatorLocation")
  public InitiatorLocation getInitiatorLocation() {
    return initiatorLocation;
  }
  
  public void setInitiatorLocation(InitiatorLocation initiatorLocation) {
    this.initiatorLocation = initiatorLocation;
  }

  
  /**
   * No information is returned
   **/
  public ComponentLocation interconnectCruLocation(TraySlot interconnectCruLocation) {
    this.interconnectCruLocation = interconnectCruLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "No information is returned")
  @JsonProperty("interconnectCruLocation")
  public TraySlot getInterconnectCruLocation() {
    return interconnectCruLocation;
  }
  
  public void setInterconnectCruLocation(TraySlot interconnectCruLocation) {
    this.interconnectCruLocation = interconnectCruLocation;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_ISNS_SERVER. It identifies the iSNS server to which the event applies.
   **/
  public ComponentLocation isnsServerLocation(IsnsServerLocation isnsServerLocation) {
    this.isnsServerLocation = isnsServerLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_ISNS_SERVER. It identifies the iSNS server to which the event applies.")
  @JsonProperty("isnsServerLocation")
  public IsnsServerLocation getIsnsServerLocation() {
    return isnsServerLocation;
  }
  
  public void setIsnsServerLocation(IsnsServerLocation isnsServerLocation) {
    this.isnsServerLocation = isnsServerLocation;
  }

  
  /**
   * The location of the minihub. This filed is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_MINIHUB.
   **/
  public ComponentLocation minihubLoc(MinihubLocation minihubLoc) {
    this.minihubLoc = minihubLoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The location of the minihub. This filed is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_MINIHUB.")
  @JsonProperty("minihubLoc")
  public MinihubLocation getMinihubLoc() {
    return minihubLoc;
  }
  
  public void setMinihubLoc(MinihubLocation minihubLoc) {
    this.minihubLoc = minihubLoc;
  }

  
  /**
   * The tray ID of the tray containing the Fibre Channel port CRU for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_PORT_CRU. This field is deprecated.
   **/
  public ComponentLocation portCruTray(Integer portCruTray) {
    this.portCruTray = portCruTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tray ID of the tray containing the Fibre Channel port CRU for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_PORT_CRU. This field is deprecated.")
  @JsonProperty("portCruTray")
  public Integer getPortCruTray() {
    return portCruTray;
  }
  
  public void setPortCruTray(Integer portCruTray) {
    this.portCruTray = portCruTray;
  }

  
  /**
   * The tray ID of the tray containing the power supply for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_POWER_SPLY.
   **/
  public ComponentLocation powerSupplyTray(Integer powerSupplyTray) {
    this.powerSupplyTray = powerSupplyTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tray ID of the tray containing the power supply for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_POWER_SPLY.")
  @JsonProperty("powerSupplyTray")
  public Integer getPowerSupplyTray() {
    return powerSupplyTray;
  }
  
  public void setPowerSupplyTray(Integer powerSupplyTray) {
    this.powerSupplyTray = powerSupplyTray;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_SFP_PORT.
   **/
  public ComponentLocation sfpLocation(TraySlot sfpLocation) {
    this.sfpLocation = sfpLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_SFP_PORT.")
  @JsonProperty("sfpLocation")
  public TraySlot getSfpLocation() {
    return sfpLocation;
  }
  
  public void setSfpLocation(TraySlot sfpLocation) {
    this.sfpLocation = sfpLocation;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_SUPPORT_CRU.
   **/
  public ComponentLocation supportCruLocation(TraySlot supportCruLocation) {
    this.supportCruLocation = supportCruLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_SUPPORT_CRU.")
  @JsonProperty("supportCruLocation")
  public TraySlot getSupportCruLocation() {
    return supportCruLocation;
  }
  
  public void setSupportCruLocation(TraySlot supportCruLocation) {
    this.supportCruLocation = supportCruLocation;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_TARGET. It identifies the iSCSI target to which the event applies.
   **/
  public ComponentLocation targetLocation(TargetLocation targetLocation) {
    this.targetLocation = targetLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_TARGET. It identifies the iSCSI target to which the event applies.")
  @JsonProperty("targetLocation")
  public TargetLocation getTargetLocation() {
    return targetLocation;
  }
  
  public void setTargetLocation(TargetLocation targetLocation) {
    this.targetLocation = targetLocation;
  }

  
  /**
   * The tray ID of the tray containing the temperature sensor for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_TEMP_SENSOR.
   **/
  public ComponentLocation tempSensorTray(Integer tempSensorTray) {
    this.tempSensorTray = tempSensorTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tray ID of the tray containing the temperature sensor for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_TEMP_SENSOR.")
  @JsonProperty("tempSensorTray")
  public Integer getTempSensorTray() {
    return tempSensorTray;
  }
  
  public void setTempSensorTray(Integer tempSensorTray) {
    this.tempSensorTray = tempSensorTray;
  }

  
  /**
   * The user-assigned label of the volume for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_VOLUME
   **/
  public ComponentLocation label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user-assigned label of the volume for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_VOLUME")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The volume group sequence number of the volume group for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_VOLUME_GRP.
   **/
  public ComponentLocation groupNumber(Integer groupNumber) {
    this.groupNumber = groupNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The volume group sequence number of the volume group for which the MEL entry was generated. This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_VOLUME_GRP.")
  @JsonProperty("groupNumber")
  public Integer getGroupNumber() {
    return groupNumber;
  }
  
  public void setGroupNumber(Integer groupNumber) {
    this.groupNumber = groupNumber;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_HOST. It is the user-assigned label of the host for which the MEL entry is reporting a problem.
   **/
  public ComponentLocation hostLocation(String hostLocation) {
    this.hostLocation = hostLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_HOST. It is the user-assigned label of the host for which the MEL entry is reporting a problem.")
  @JsonProperty("hostLocation")
  public String getHostLocation() {
    return hostLocation;
  }
  
  public void setHostLocation(String hostLocation) {
    this.hostLocation = hostLocation;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_HOST_PORT. It identifies the host port to which the event applies.
   **/
  public ComponentLocation hostPortLocation(HostPortLocation hostPortLocation) {
    this.hostPortLocation = hostPortLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_HOST_PORT. It identifies the host port to which the event applies.")
  @JsonProperty("hostPortLocation")
  public HostPortLocation getHostPortLocation() {
    return hostPortLocation;
  }
  
  public void setHostPortLocation(HostPortLocation hostPortLocation) {
    this.hostPortLocation = hostPortLocation;
  }

  
  /**
   * The physical location of the drawer for which the MEL event was generated. This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_DRAWER.
   **/
  public ComponentLocation drawerLocation(TraySlot drawerLocation) {
    this.drawerLocation = drawerLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The physical location of the drawer for which the MEL event was generated. This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_DRAWER.")
  @JsonProperty("drawerLocation")
  public TraySlot getDrawerLocation() {
    return drawerLocation;
  }
  
  public void setDrawerLocation(TraySlot drawerLocation) {
    this.drawerLocation = drawerLocation;
  }

  
  /**
   * The component type and location are described in this field. This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_RELATIVE.
   **/
  public ComponentLocation componentRelativeLocation(ComponentRelativeLocation componentRelativeLocation) {
    this.componentRelativeLocation = componentRelativeLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The component type and location are described in this field. This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_RELATIVE.")
  @JsonProperty("componentRelativeLocation")
  public ComponentRelativeLocation getComponentRelativeLocation() {
    return componentRelativeLocation;
  }
  
  public void setComponentRelativeLocation(ComponentRelativeLocation componentRelativeLocation) {
    this.componentRelativeLocation = componentRelativeLocation;
  }

  
  /**
   * The user-assigned label of the schedule. This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_SCHEDULE.
   **/
  public ComponentLocation schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user-assigned label of the schedule. This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_SCHEDULE.")
  @JsonProperty("schedule")
  public String getSchedule() {
    return schedule;
  }
  
  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_DISK_POOL.
   **/
  public ComponentLocation diskPool(Integer diskPool) {
    this.diskPool = diskPool;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_DISK_POOL.")
  @JsonProperty("diskPool")
  public Integer getDiskPool() {
    return diskPool;
  }
  
  public void setDiskPool(Integer diskPool) {
    this.diskPool = diskPool;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_ASYNC_MIRROR_GROUP.
   **/
  public ComponentLocation asyncMirrorGroup(String asyncMirrorGroup) {
    this.asyncMirrorGroup = asyncMirrorGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_ASYNC_MIRROR_GROUP.")
  @JsonProperty("asyncMirrorGroup")
  public String getAsyncMirrorGroup() {
    return asyncMirrorGroup;
  }
  
  public void setAsyncMirrorGroup(String asyncMirrorGroup) {
    this.asyncMirrorGroup = asyncMirrorGroup;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_PIT. Note that events for PITs also include extended component location information beyond just the associated PiT Group label (PITs themselves are identified by a combination of the label of the associated PiT Group plus a sequence number).
   **/
  public ComponentLocation pitLabel(String pitLabel) {
    this.pitLabel = pitLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_PIT. Note that events for PITs also include extended component location information beyond just the associated PiT Group label (PITs themselves are identified by a combination of the label of the associated PiT Group plus a sequence number).")
  @JsonProperty("pitLabel")
  public String getPitLabel() {
    return pitLabel;
  }
  
  public void setPitLabel(String pitLabel) {
    this.pitLabel = pitLabel;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_PIT_CONSISTENCY_GROUP.
   **/
  public ComponentLocation cgLabel(String cgLabel) {
    this.cgLabel = cgLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_PIT_CONSISTENCY_GROUP.")
  @JsonProperty("cgLabel")
  public String getCgLabel() {
    return cgLabel;
  }
  
  public void setCgLabel(String cgLabel) {
    this.cgLabel = cgLabel;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_CGPIT. Note that events for CGPITs also include extended component location information beyond just the associated CG label (CGPITs themselves are identified by a combination of the label of the associated Consistency Group plus a sequence number).
   **/
  public ComponentLocation cgPitLabel(String cgPitLabel) {
    this.cgPitLabel = cgPitLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_CGPIT. Note that events for CGPITs also include extended component location information beyond just the associated CG label (CGPITs themselves are identified by a combination of the label of the associated Consistency Group plus a sequence number).")
  @JsonProperty("cgPitLabel")
  public String getCgPitLabel() {
    return cgPitLabel;
  }
  
  public void setCgPitLabel(String cgPitLabel) {
    this.cgPitLabel = cgPitLabel;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_CGVIEW.
   **/
  public ComponentLocation cgViewLabel(String cgViewLabel) {
    this.cgViewLabel = cgViewLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_CGVIEW.")
  @JsonProperty("cgViewLabel")
  public String getCgViewLabel() {
    return cgViewLabel;
  }
  
  public void setCgViewLabel(String cgViewLabel) {
    this.cgViewLabel = cgViewLabel;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_FLASH_CACHE. It identifies the flash cache device to which this event applies.
   **/
  public ComponentLocation flashCacheLabel(String flashCacheLabel) {
    this.flashCacheLabel = flashCacheLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_FLASH_CACHE. It identifies the flash cache device to which this event applies.")
  @JsonProperty("flashCacheLabel")
  public String getFlashCacheLabel() {
    return flashCacheLabel;
  }
  
  public void setFlashCacheLabel(String flashCacheLabel) {
    this.flashCacheLabel = flashCacheLabel;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_SNMP_COMMUNITY. The community name string can contain up to 31 characters.
   **/
  public ComponentLocation communityNameString(String communityNameString) {
    this.communityNameString = communityNameString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_SNMP_COMMUNITY. The community name string can contain up to 31 characters.")
  @JsonProperty("communityNameString")
  public String getCommunityNameString() {
    return communityNameString;
  }
  
  public void setCommunityNameString(String communityNameString) {
    this.communityNameString = communityNameString;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_SNMP_TRAP_DESTINATION. It contains an ASCII representation of the destination address (the maximum number of characters is 40 for IPV6, 15 characters for IPV4.
   **/
  public ComponentLocation destinationIpAddress(String destinationIpAddress) {
    this.destinationIpAddress = destinationIpAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_SNMP_TRAP_DESTINATION. It contains an ASCII representation of the destination address (the maximum number of characters is 40 for IPV6, 15 characters for IPV4.")
  @JsonProperty("destinationIpAddress")
  public String getDestinationIpAddress() {
    return destinationIpAddress;
  }
  
  public void setDestinationIpAddress(String destinationIpAddress) {
    this.destinationIpAddress = destinationIpAddress;
  }

  
  /**
   * This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_FC_TARGET. It contains location data that is an 8-byte binary SCSI name.
   **/
  public ComponentLocation fcTargetLocation(FibreChannelTargetLocation fcTargetLocation) {
    this.fcTargetLocation = fcTargetLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when the eventComponentType field is equal to EVENT_COMP_TYPE_FC_TARGET. It contains location data that is an 8-byte binary SCSI name.")
  @JsonProperty("fcTargetLocation")
  public FibreChannelTargetLocation getFcTargetLocation() {
    return fcTargetLocation;
  }
  
  public void setFcTargetLocation(FibreChannelTargetLocation fcTargetLocation) {
    this.fcTargetLocation = fcTargetLocation;
  }

  
  /**
   * Location information for fan CRU.
   **/
  public ComponentLocation fanCruLocation(TraySlot fanCruLocation) {
    this.fanCruLocation = fanCruLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Location information for fan CRU.")
  @JsonProperty("fanCruLocation")
  public TraySlot getFanCruLocation() {
    return fanCruLocation;
  }
  
  public void setFanCruLocation(TraySlot fanCruLocation) {
    this.fanCruLocation = fanCruLocation;
  }

  
  /**
   * Power supply CRU location.
   **/
  public ComponentLocation powerSupplyCruLocation(TraySlot powerSupplyCruLocation) {
    this.powerSupplyCruLocation = powerSupplyCruLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Power supply CRU location.")
  @JsonProperty("powerSupplyCruLocation")
  public TraySlot getPowerSupplyCruLocation() {
    return powerSupplyCruLocation;
  }
  
  public void setPowerSupplyCruLocation(TraySlot powerSupplyCruLocation) {
    this.powerSupplyCruLocation = powerSupplyCruLocation;
  }

  
  /**
   * This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_NVME_INITIATOR. It identifies the NVMe initiator to which the event applies.
   **/
  public ComponentLocation nvmeInitiatorLocation(InitiatorLocation nvmeInitiatorLocation) {
    this.nvmeInitiatorLocation = nvmeInitiatorLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is valid only when the eventComponentType value is equal to EVENT_COMP_TYPE_NVME_INITIATOR. It identifies the NVMe initiator to which the event applies.")
  @JsonProperty("nvmeInitiatorLocation")
  public InitiatorLocation getNvmeInitiatorLocation() {
    return nvmeInitiatorLocation;
  }
  
  public void setNvmeInitiatorLocation(InitiatorLocation nvmeInitiatorLocation) {
    this.nvmeInitiatorLocation = nvmeInitiatorLocation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentLocation componentLocation = (ComponentLocation) o;
    return Objects.equals(this.eventComponentType, componentLocation.eventComponentType) &&
        Objects.equals(this.alarmLocation, componentLocation.alarmLocation) &&
        Objects.equals(this.batteryTray, componentLocation.batteryTray) &&
        Objects.equals(this.cacheBackupDeviceLocation, componentLocation.cacheBackupDeviceLocation) &&
        Objects.equals(this.cacheMemoryDimmLocation, componentLocation.cacheMemoryDimmLocation) &&
        Objects.equals(this.channelLoc, componentLocation.channelLoc) &&
        Objects.equals(this.channelPort, componentLocation.channelPort) &&
        Objects.equals(this.chipLoc, componentLocation.chipLoc) &&
        Objects.equals(this.controllerLoc, componentLocation.controllerLoc) &&
        Objects.equals(this.ctlrSfpLocation, componentLocation.ctlrSfpLocation) &&
        Objects.equals(this.socLocation, componentLocation.socLocation) &&
        Objects.equals(this.driveLoc, componentLocation.driveLoc) &&
        Objects.equals(this.enclosureTray, componentLocation.enclosureTray) &&
        Objects.equals(this.esmTray, componentLocation.esmTray) &&
        Objects.equals(this.fanTray, componentLocation.fanTray) &&
        Objects.equals(this.hostIoCardLocation, componentLocation.hostIoCardLocation) &&
        Objects.equals(this.initiatorLocation, componentLocation.initiatorLocation) &&
        Objects.equals(this.interconnectCruLocation, componentLocation.interconnectCruLocation) &&
        Objects.equals(this.isnsServerLocation, componentLocation.isnsServerLocation) &&
        Objects.equals(this.minihubLoc, componentLocation.minihubLoc) &&
        Objects.equals(this.portCruTray, componentLocation.portCruTray) &&
        Objects.equals(this.powerSupplyTray, componentLocation.powerSupplyTray) &&
        Objects.equals(this.sfpLocation, componentLocation.sfpLocation) &&
        Objects.equals(this.supportCruLocation, componentLocation.supportCruLocation) &&
        Objects.equals(this.targetLocation, componentLocation.targetLocation) &&
        Objects.equals(this.tempSensorTray, componentLocation.tempSensorTray) &&
        Objects.equals(this.label, componentLocation.label) &&
        Objects.equals(this.groupNumber, componentLocation.groupNumber) &&
        Objects.equals(this.hostLocation, componentLocation.hostLocation) &&
        Objects.equals(this.hostPortLocation, componentLocation.hostPortLocation) &&
        Objects.equals(this.drawerLocation, componentLocation.drawerLocation) &&
        Objects.equals(this.componentRelativeLocation, componentLocation.componentRelativeLocation) &&
        Objects.equals(this.schedule, componentLocation.schedule) &&
        Objects.equals(this.diskPool, componentLocation.diskPool) &&
        Objects.equals(this.asyncMirrorGroup, componentLocation.asyncMirrorGroup) &&
        Objects.equals(this.pitLabel, componentLocation.pitLabel) &&
        Objects.equals(this.cgLabel, componentLocation.cgLabel) &&
        Objects.equals(this.cgPitLabel, componentLocation.cgPitLabel) &&
        Objects.equals(this.cgViewLabel, componentLocation.cgViewLabel) &&
        Objects.equals(this.flashCacheLabel, componentLocation.flashCacheLabel) &&
        Objects.equals(this.communityNameString, componentLocation.communityNameString) &&
        Objects.equals(this.destinationIpAddress, componentLocation.destinationIpAddress) &&
        Objects.equals(this.fcTargetLocation, componentLocation.fcTargetLocation) &&
        Objects.equals(this.fanCruLocation, componentLocation.fanCruLocation) &&
        Objects.equals(this.powerSupplyCruLocation, componentLocation.powerSupplyCruLocation) &&
        Objects.equals(this.nvmeInitiatorLocation, componentLocation.nvmeInitiatorLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventComponentType, alarmLocation, batteryTray, cacheBackupDeviceLocation, cacheMemoryDimmLocation, channelLoc, channelPort, chipLoc, controllerLoc, ctlrSfpLocation, socLocation, driveLoc, enclosureTray, esmTray, fanTray, hostIoCardLocation, initiatorLocation, interconnectCruLocation, isnsServerLocation, minihubLoc, portCruTray, powerSupplyTray, sfpLocation, supportCruLocation, targetLocation, tempSensorTray, label, groupNumber, hostLocation, hostPortLocation, drawerLocation, componentRelativeLocation, schedule, diskPool, asyncMirrorGroup, pitLabel, cgLabel, cgPitLabel, cgViewLabel, flashCacheLabel, communityNameString, destinationIpAddress, fcTargetLocation, fanCruLocation, powerSupplyCruLocation, nvmeInitiatorLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentLocation {\n");
    
    sb.append("    eventComponentType: ").append(toIndentedString(eventComponentType)).append("\n");
    sb.append("    alarmLocation: ").append(toIndentedString(alarmLocation)).append("\n");
    sb.append("    batteryTray: ").append(toIndentedString(batteryTray)).append("\n");
    sb.append("    cacheBackupDeviceLocation: ").append(toIndentedString(cacheBackupDeviceLocation)).append("\n");
    sb.append("    cacheMemoryDimmLocation: ").append(toIndentedString(cacheMemoryDimmLocation)).append("\n");
    sb.append("    channelLoc: ").append(toIndentedString(channelLoc)).append("\n");
    sb.append("    channelPort: ").append(toIndentedString(channelPort)).append("\n");
    sb.append("    chipLoc: ").append(toIndentedString(chipLoc)).append("\n");
    sb.append("    controllerLoc: ").append(toIndentedString(controllerLoc)).append("\n");
    sb.append("    ctlrSfpLocation: ").append(toIndentedString(ctlrSfpLocation)).append("\n");
    sb.append("    socLocation: ").append(toIndentedString(socLocation)).append("\n");
    sb.append("    driveLoc: ").append(toIndentedString(driveLoc)).append("\n");
    sb.append("    enclosureTray: ").append(toIndentedString(enclosureTray)).append("\n");
    sb.append("    esmTray: ").append(toIndentedString(esmTray)).append("\n");
    sb.append("    fanTray: ").append(toIndentedString(fanTray)).append("\n");
    sb.append("    hostIoCardLocation: ").append(toIndentedString(hostIoCardLocation)).append("\n");
    sb.append("    initiatorLocation: ").append(toIndentedString(initiatorLocation)).append("\n");
    sb.append("    interconnectCruLocation: ").append(toIndentedString(interconnectCruLocation)).append("\n");
    sb.append("    isnsServerLocation: ").append(toIndentedString(isnsServerLocation)).append("\n");
    sb.append("    minihubLoc: ").append(toIndentedString(minihubLoc)).append("\n");
    sb.append("    portCruTray: ").append(toIndentedString(portCruTray)).append("\n");
    sb.append("    powerSupplyTray: ").append(toIndentedString(powerSupplyTray)).append("\n");
    sb.append("    sfpLocation: ").append(toIndentedString(sfpLocation)).append("\n");
    sb.append("    supportCruLocation: ").append(toIndentedString(supportCruLocation)).append("\n");
    sb.append("    targetLocation: ").append(toIndentedString(targetLocation)).append("\n");
    sb.append("    tempSensorTray: ").append(toIndentedString(tempSensorTray)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    groupNumber: ").append(toIndentedString(groupNumber)).append("\n");
    sb.append("    hostLocation: ").append(toIndentedString(hostLocation)).append("\n");
    sb.append("    hostPortLocation: ").append(toIndentedString(hostPortLocation)).append("\n");
    sb.append("    drawerLocation: ").append(toIndentedString(drawerLocation)).append("\n");
    sb.append("    componentRelativeLocation: ").append(toIndentedString(componentRelativeLocation)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    diskPool: ").append(toIndentedString(diskPool)).append("\n");
    sb.append("    asyncMirrorGroup: ").append(toIndentedString(asyncMirrorGroup)).append("\n");
    sb.append("    pitLabel: ").append(toIndentedString(pitLabel)).append("\n");
    sb.append("    cgLabel: ").append(toIndentedString(cgLabel)).append("\n");
    sb.append("    cgPitLabel: ").append(toIndentedString(cgPitLabel)).append("\n");
    sb.append("    cgViewLabel: ").append(toIndentedString(cgViewLabel)).append("\n");
    sb.append("    flashCacheLabel: ").append(toIndentedString(flashCacheLabel)).append("\n");
    sb.append("    communityNameString: ").append(toIndentedString(communityNameString)).append("\n");
    sb.append("    destinationIpAddress: ").append(toIndentedString(destinationIpAddress)).append("\n");
    sb.append("    fcTargetLocation: ").append(toIndentedString(fcTargetLocation)).append("\n");
    sb.append("    fanCruLocation: ").append(toIndentedString(fanCruLocation)).append("\n");
    sb.append("    powerSupplyCruLocation: ").append(toIndentedString(powerSupplyCruLocation)).append("\n");
    sb.append("    nvmeInitiatorLocation: ").append(toIndentedString(nvmeInitiatorLocation)).append("\n");
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

