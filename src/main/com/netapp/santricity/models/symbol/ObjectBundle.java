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
 * ObjectBundle
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ObjectBundle   {
  
    private Long configGeneration;

    private StorageArray sa;

    private List<Tray> tray;

    private ComponentBundle componentBundle;

    private List<Controller> controller;

    private List<Drive> drive;

    private List<VolumeGroup> volumeGroup;

    private List<Volume> volume;

    private List<FreeExtent> freeExtent;

    private List<DVEVolume> dveVol;

    private StoragePoolBundle storagePoolBundle;

    private HLVolumeBundle highLevelVolBundle;

    private GhostVolBundle ghostVolBundle;

    private ConsistencyGroupBundle consistencyGroupBundle;

    private List<IoInterface> ioInterface;

    private List<NetworkInterface> networkInterface;

    private List<LockKeyID> lockKeyIDs;

    private List<Interposer> interposer;

    private List<IoInterfaceHicMap> ioInterfaceHicMap;

    private List<ScheduleInstance> schedule;

    private List<RemoteArray> remoteArray;

    private FlashCacheBundle flashCacheBundle;

    private SNMPAgentBundle snmpBundle;

    private ApplicationAwarenessBundle applicationAwarenessBundle;

  
  /**
   * The configuration generation number that was in effect at the time this object bundle was constructed by the controller. The client can use this value to determine if it currently holds the latest version of the object graph.
   **/
  public ObjectBundle configGeneration(Long configGeneration) {
    this.configGeneration = configGeneration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The configuration generation number that was in effect at the time this object bundle was constructed by the controller. The client can use this value to determine if it currently holds the latest version of the object graph.")
  @JsonProperty("configGeneration")
  public Long getConfigGeneration() {
    return configGeneration;
  }
  
  public void setConfigGeneration(Long configGeneration) {
    this.configGeneration = configGeneration;
  }

  
  /**
   * A StorageArray object that contains base information about the storage array as a whole.
   **/
  public ObjectBundle sa(StorageArray sa) {
    this.sa = sa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A StorageArray object that contains base information about the storage array as a whole.")
  @JsonProperty("sa")
  public StorageArray getSa() {
    return sa;
  }
  
  public void setSa(StorageArray sa) {
    this.sa = sa;
  }

  
  /**
   * A variable-length array of Tray structures. This array contains one element for each tray object that exists within the storage array.
   **/
  public ObjectBundle tray(List<Tray> tray) {
    this.tray = tray;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of Tray structures. This array contains one element for each tray object that exists within the storage array.")
  @JsonProperty("tray")
  public List<Tray> getTray() {
    return tray;
  }
  
  public void setTray(List<Tray> tray) {
    this.tray = tray;
  }

  
  /**
   * A variable-length array of Component structures. This array contains one element for each physical component object that exists within the storage array.
   **/
  public ObjectBundle componentBundle(ComponentBundle componentBundle) {
    this.componentBundle = componentBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of Component structures. This array contains one element for each physical component object that exists within the storage array.")
  @JsonProperty("componentBundle")
  public ComponentBundle getComponentBundle() {
    return componentBundle;
  }
  
  public void setComponentBundle(ComponentBundle componentBundle) {
    this.componentBundle = componentBundle;
  }

  
  /**
   * A variable-length array of Controller structures. This array contains one element for each RAID controller object that exists within the storage array.
   **/
  public ObjectBundle controller(List<Controller> controller) {
    this.controller = controller;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of Controller structures. This array contains one element for each RAID controller object that exists within the storage array.")
  @JsonProperty("controller")
  public List<Controller> getController() {
    return controller;
  }
  
  public void setController(List<Controller> controller) {
    this.controller = controller;
  }

  
  /**
   * A variable-length array of Drive structures. This array contains one element for each physical disk drive object that exists within the storage array.
   **/
  public ObjectBundle drive(List<Drive> drive) {
    this.drive = drive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of Drive structures. This array contains one element for each physical disk drive object that exists within the storage array.")
  @JsonProperty("drive")
  public List<Drive> getDrive() {
    return drive;
  }
  
  public void setDrive(List<Drive> drive) {
    this.drive = drive;
  }

  
  /**
   * A variable-length array of VolumeGroup structures. This array contains one element for each volume group object that exists within the storage array.
   **/
  public ObjectBundle volumeGroup(List<VolumeGroup> volumeGroup) {
    this.volumeGroup = volumeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of VolumeGroup structures. This array contains one element for each volume group object that exists within the storage array.")
  @JsonProperty("volumeGroup")
  public List<VolumeGroup> getVolumeGroup() {
    return volumeGroup;
  }
  
  public void setVolumeGroup(List<VolumeGroup> volumeGroup) {
    this.volumeGroup = volumeGroup;
  }

  
  /**
   * A variable-length array of VolumeGroup structures. This array contains one element for each volume group object that exists within the storage array.
   **/
  public ObjectBundle volume(List<Volume> volume) {
    this.volume = volume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of VolumeGroup structures. This array contains one element for each volume group object that exists within the storage array.")
  @JsonProperty("volume")
  public List<Volume> getVolume() {
    return volume;
  }
  
  public void setVolume(List<Volume> volume) {
    this.volume = volume;
  }

  
  /**
   * A variable-length array of FreeExtent structures. This array contains one element for each free extent object that exists within the storage array.
   **/
  public ObjectBundle freeExtent(List<FreeExtent> freeExtent) {
    this.freeExtent = freeExtent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of FreeExtent structures. This array contains one element for each free extent object that exists within the storage array.")
  @JsonProperty("freeExtent")
  public List<FreeExtent> getFreeExtent() {
    return freeExtent;
  }
  
  public void setFreeExtent(List<FreeExtent> freeExtent) {
    this.freeExtent = freeExtent;
  }

  
  /**
   * A variable-length array of DVE structures. This array contains one element for each volume being expanded.
   **/
  public ObjectBundle dveVol(List<DVEVolume> dveVol) {
    this.dveVol = dveVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of DVE structures. This array contains one element for each volume being expanded.")
  @JsonProperty("dveVol")
  public List<DVEVolume> getDveVol() {
    return dveVol;
  }
  
  public void setDveVol(List<DVEVolume> dveVol) {
    this.dveVol = dveVol;
  }

  
  /**
   * An embedded object bundle that contains all configuration information relative to the \"Storage Partitions\" feature.
   **/
  public ObjectBundle storagePoolBundle(StoragePoolBundle storagePoolBundle) {
    this.storagePoolBundle = storagePoolBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An embedded object bundle that contains all configuration information relative to the \"Storage Partitions\" feature.")
  @JsonProperty("storagePoolBundle")
  public StoragePoolBundle getStoragePoolBundle() {
    return storagePoolBundle;
  }
  
  public void setStoragePoolBundle(StoragePoolBundle storagePoolBundle) {
    this.storagePoolBundle = storagePoolBundle;
  }

  
  /**
   * An embedded object bundle that contains all the information relative to the Higher-Level Volumes.
   **/
  public ObjectBundle highLevelVolBundle(HLVolumeBundle highLevelVolBundle) {
    this.highLevelVolBundle = highLevelVolBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An embedded object bundle that contains all the information relative to the Higher-Level Volumes.")
  @JsonProperty("highLevelVolBundle")
  public HLVolumeBundle getHighLevelVolBundle() {
    return highLevelVolBundle;
  }
  
  public void setHighLevelVolBundle(HLVolumeBundle highLevelVolBundle) {
    this.highLevelVolBundle = highLevelVolBundle;
  }

  
  /**
   * An embedded object bundle that contains all the information relative to missing volumes.
   **/
  public ObjectBundle ghostVolBundle(GhostVolBundle ghostVolBundle) {
    this.ghostVolBundle = ghostVolBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An embedded object bundle that contains all the information relative to missing volumes.")
  @JsonProperty("ghostVolBundle")
  public GhostVolBundle getGhostVolBundle() {
    return ghostVolBundle;
  }
  
  public void setGhostVolBundle(GhostVolBundle ghostVolBundle) {
    this.ghostVolBundle = ghostVolBundle;
  }

  
  /**
   * Write consistency group bundle.
   **/
  public ObjectBundle consistencyGroupBundle(ConsistencyGroupBundle consistencyGroupBundle) {
    this.consistencyGroupBundle = consistencyGroupBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Write consistency group bundle.")
  @JsonProperty("consistencyGroupBundle")
  public ConsistencyGroupBundle getConsistencyGroupBundle() {
    return consistencyGroupBundle;
  }
  
  public void setConsistencyGroupBundle(ConsistencyGroupBundle consistencyGroupBundle) {
    this.consistencyGroupBundle = consistencyGroupBundle;
  }

  
  /**
   * A variable-length array of IoInterface structures. This array contains one element for each I/O interface object that exists within the storage array
   **/
  public ObjectBundle ioInterface(List<IoInterface> ioInterface) {
    this.ioInterface = ioInterface;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of IoInterface structures. This array contains one element for each I/O interface object that exists within the storage array")
  @JsonProperty("ioInterface")
  public List<IoInterface> getIoInterface() {
    return ioInterface;
  }
  
  public void setIoInterface(List<IoInterface> ioInterface) {
    this.ioInterface = ioInterface;
  }

  
  /**
   * A variable-length array of NetworkInterface structures. This array contains one element for each network interface object that exists within the storage array
   **/
  public ObjectBundle networkInterface(List<NetworkInterface> networkInterface) {
    this.networkInterface = networkInterface;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array of NetworkInterface structures. This array contains one element for each network interface object that exists within the storage array")
  @JsonProperty("networkInterface")
  public List<NetworkInterface> getNetworkInterface() {
    return networkInterface;
  }
  
  public void setNetworkInterface(List<NetworkInterface> networkInterface) {
    this.networkInterface = networkInterface;
  }

  
  /**
   * A variable length array of LockKeyID structures. Contains lock key information for the array.
   **/
  public ObjectBundle lockKeyIDs(List<LockKeyID> lockKeyIDs) {
    this.lockKeyIDs = lockKeyIDs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable length array of LockKeyID structures. Contains lock key information for the array.")
  @JsonProperty("lockKeyIDs")
  public List<LockKeyID> getLockKeyIDs() {
    return lockKeyIDs;
  }
  
  public void setLockKeyIDs(List<LockKeyID> lockKeyIDs) {
    this.lockKeyIDs = lockKeyIDs;
  }

  
  /**
   * A variable length array of drive interposer data. An entry will appear in this array only if the interposerPresent field in the corresponding Drive structure is set to True.
   **/
  public ObjectBundle interposer(List<Interposer> interposer) {
    this.interposer = interposer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable length array of drive interposer data. An entry will appear in this array only if the interposerPresent field in the corresponding Drive structure is set to True.")
  @JsonProperty("interposer")
  public List<Interposer> getInterposer() {
    return interposer;
  }
  
  public void setInterposer(List<Interposer> interposer) {
    this.interposer = interposer;
  }

  
  /**
   * This is a list of structures that provides a mapping from I/O interfaces to their associated HICs.
   **/
  public ObjectBundle ioInterfaceHicMap(List<IoInterfaceHicMap> ioInterfaceHicMap) {
    this.ioInterfaceHicMap = ioInterfaceHicMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is a list of structures that provides a mapping from I/O interfaces to their associated HICs.")
  @JsonProperty("ioInterfaceHicMap")
  public List<IoInterfaceHicMap> getIoInterfaceHicMap() {
    return ioInterfaceHicMap;
  }
  
  public void setIoInterfaceHicMap(List<IoInterfaceHicMap> ioInterfaceHicMap) {
    this.ioInterfaceHicMap = ioInterfaceHicMap;
  }

  
  /**
   * A list of current schedules.
   **/
  public ObjectBundle schedule(List<ScheduleInstance> schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of current schedules.")
  @JsonProperty("schedule")
  public List<ScheduleInstance> getSchedule() {
    return schedule;
  }
  
  public void setSchedule(List<ScheduleInstance> schedule) {
    this.schedule = schedule;
  }

  
  /**
   * This is a list of remote arrays which this array has visibility to for monitoring.
   **/
  public ObjectBundle remoteArray(List<RemoteArray> remoteArray) {
    this.remoteArray = remoteArray;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is a list of remote arrays which this array has visibility to for monitoring.")
  @JsonProperty("remoteArray")
  public List<RemoteArray> getRemoteArray() {
    return remoteArray;
  }
  
  public void setRemoteArray(List<RemoteArray> remoteArray) {
    this.remoteArray = remoteArray;
  }

  
  /**
   * An embedded object bundle that contains all of the information related to flash cache objects.
   **/
  public ObjectBundle flashCacheBundle(FlashCacheBundle flashCacheBundle) {
    this.flashCacheBundle = flashCacheBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An embedded object bundle that contains all of the information related to flash cache objects.")
  @JsonProperty("flashCacheBundle")
  public FlashCacheBundle getFlashCacheBundle() {
    return flashCacheBundle;
  }
  
  public void setFlashCacheBundle(FlashCacheBundle flashCacheBundle) {
    this.flashCacheBundle = flashCacheBundle;
  }

  
  /**
   * SNMP-related objects
   **/
  public ObjectBundle snmpBundle(SNMPAgentBundle snmpBundle) {
    this.snmpBundle = snmpBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "SNMP-related objects")
  @JsonProperty("snmpBundle")
  public SNMPAgentBundle getSnmpBundle() {
    return snmpBundle;
  }
  
  public void setSnmpBundle(SNMPAgentBundle snmpBundle) {
    this.snmpBundle = snmpBundle;
  }

  
  /**
   * This reports the key-value pairs and their references, and the mappings between Volumes and these key-value pairs. The data is used by the application and is opaque to the CFW.
   **/
  public ObjectBundle applicationAwarenessBundle(ApplicationAwarenessBundle applicationAwarenessBundle) {
    this.applicationAwarenessBundle = applicationAwarenessBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This reports the key-value pairs and their references, and the mappings between Volumes and these key-value pairs. The data is used by the application and is opaque to the CFW.")
  @JsonProperty("applicationAwarenessBundle")
  public ApplicationAwarenessBundle getApplicationAwarenessBundle() {
    return applicationAwarenessBundle;
  }
  
  public void setApplicationAwarenessBundle(ApplicationAwarenessBundle applicationAwarenessBundle) {
    this.applicationAwarenessBundle = applicationAwarenessBundle;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectBundle objectBundle = (ObjectBundle) o;
    return Objects.equals(this.configGeneration, objectBundle.configGeneration) &&
        Objects.equals(this.sa, objectBundle.sa) &&
        Objects.equals(this.tray, objectBundle.tray) &&
        Objects.equals(this.componentBundle, objectBundle.componentBundle) &&
        Objects.equals(this.controller, objectBundle.controller) &&
        Objects.equals(this.drive, objectBundle.drive) &&
        Objects.equals(this.volumeGroup, objectBundle.volumeGroup) &&
        Objects.equals(this.volume, objectBundle.volume) &&
        Objects.equals(this.freeExtent, objectBundle.freeExtent) &&
        Objects.equals(this.dveVol, objectBundle.dveVol) &&
        Objects.equals(this.storagePoolBundle, objectBundle.storagePoolBundle) &&
        Objects.equals(this.highLevelVolBundle, objectBundle.highLevelVolBundle) &&
        Objects.equals(this.ghostVolBundle, objectBundle.ghostVolBundle) &&
        Objects.equals(this.consistencyGroupBundle, objectBundle.consistencyGroupBundle) &&
        Objects.equals(this.ioInterface, objectBundle.ioInterface) &&
        Objects.equals(this.networkInterface, objectBundle.networkInterface) &&
        Objects.equals(this.lockKeyIDs, objectBundle.lockKeyIDs) &&
        Objects.equals(this.interposer, objectBundle.interposer) &&
        Objects.equals(this.ioInterfaceHicMap, objectBundle.ioInterfaceHicMap) &&
        Objects.equals(this.schedule, objectBundle.schedule) &&
        Objects.equals(this.remoteArray, objectBundle.remoteArray) &&
        Objects.equals(this.flashCacheBundle, objectBundle.flashCacheBundle) &&
        Objects.equals(this.snmpBundle, objectBundle.snmpBundle) &&
        Objects.equals(this.applicationAwarenessBundle, objectBundle.applicationAwarenessBundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configGeneration, sa, tray, componentBundle, controller, drive, volumeGroup, volume, freeExtent, dveVol, storagePoolBundle, highLevelVolBundle, ghostVolBundle, consistencyGroupBundle, ioInterface, networkInterface, lockKeyIDs, interposer, ioInterfaceHicMap, schedule, remoteArray, flashCacheBundle, snmpBundle, applicationAwarenessBundle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectBundle {\n");
    
    sb.append("    configGeneration: ").append(toIndentedString(configGeneration)).append("\n");
    sb.append("    sa: ").append(toIndentedString(sa)).append("\n");
    sb.append("    tray: ").append(toIndentedString(tray)).append("\n");
    sb.append("    componentBundle: ").append(toIndentedString(componentBundle)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
    sb.append("    volumeGroup: ").append(toIndentedString(volumeGroup)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    freeExtent: ").append(toIndentedString(freeExtent)).append("\n");
    sb.append("    dveVol: ").append(toIndentedString(dveVol)).append("\n");
    sb.append("    storagePoolBundle: ").append(toIndentedString(storagePoolBundle)).append("\n");
    sb.append("    highLevelVolBundle: ").append(toIndentedString(highLevelVolBundle)).append("\n");
    sb.append("    ghostVolBundle: ").append(toIndentedString(ghostVolBundle)).append("\n");
    sb.append("    consistencyGroupBundle: ").append(toIndentedString(consistencyGroupBundle)).append("\n");
    sb.append("    ioInterface: ").append(toIndentedString(ioInterface)).append("\n");
    sb.append("    networkInterface: ").append(toIndentedString(networkInterface)).append("\n");
    sb.append("    lockKeyIDs: ").append(toIndentedString(lockKeyIDs)).append("\n");
    sb.append("    interposer: ").append(toIndentedString(interposer)).append("\n");
    sb.append("    ioInterfaceHicMap: ").append(toIndentedString(ioInterfaceHicMap)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    remoteArray: ").append(toIndentedString(remoteArray)).append("\n");
    sb.append("    flashCacheBundle: ").append(toIndentedString(flashCacheBundle)).append("\n");
    sb.append("    snmpBundle: ").append(toIndentedString(snmpBundle)).append("\n");
    sb.append("    applicationAwarenessBundle: ").append(toIndentedString(applicationAwarenessBundle)).append("\n");
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

