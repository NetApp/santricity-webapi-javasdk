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
 * CounterGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class CounterGroup   {
  

  /**
   * This enumeration type identifies the different types of counter group statistics that are provided by the controller firmware.
   */
  public enum GroupTypeEnum {
    drive("drive"),
    implementation("implementation"),
    io("io"),
    volume("volume"),
    controller("controller"),
    iointerface("iointerface"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    GroupTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private GroupTypeEnum groupType;

    private DriveCounterGroup drvCounterGroup;

    private ImplementationCounterGroup implCounterGroup;

    private IoCounterGroup ioCounterGroup;

    private VolumeCounterGroup volCounterGroup;

    private ControllerCounterGroup controllerCounterGroup;

    private InterfaceCounterGroup interfaceCounterGroup;

  
  /**
   * This enumeration type identifies the different types of counter group statistics that are provided by the controller firmware.
   **/
  public CounterGroup groupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration type identifies the different types of counter group statistics that are provided by the controller firmware.")
  @JsonProperty("groupType")
  public GroupTypeEnum getGroupType() {
    return groupType;
  }
  
  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  
  /**
   * Drive-related statistical counters. This field is only present if groupType is equal to COUNTER_GROUP_DRIVE.
   **/
  public CounterGroup drvCounterGroup(DriveCounterGroup drvCounterGroup) {
    this.drvCounterGroup = drvCounterGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Drive-related statistical counters. This field is only present if groupType is equal to COUNTER_GROUP_DRIVE.")
  @JsonProperty("drvCounterGroup")
  public DriveCounterGroup getDrvCounterGroup() {
    return drvCounterGroup;
  }
  
  public void setDrvCounterGroup(DriveCounterGroup drvCounterGroup) {
    this.drvCounterGroup = drvCounterGroup;
  }

  
  /**
   * RAID-implementation-related statistical counters. This field is only present if groupType is equal to COUNTER_GROUP_IMPLEMENTATION.
   **/
  public CounterGroup implCounterGroup(ImplementationCounterGroup implCounterGroup) {
    this.implCounterGroup = implCounterGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "RAID-implementation-related statistical counters. This field is only present if groupType is equal to COUNTER_GROUP_IMPLEMENTATION.")
  @JsonProperty("implCounterGroup")
  public ImplementationCounterGroup getImplCounterGroup() {
    return implCounterGroup;
  }
  
  public void setImplCounterGroup(ImplementationCounterGroup implCounterGroup) {
    this.implCounterGroup = implCounterGroup;
  }

  
  /**
   * I/O-operation-related statistical counters. This field is only present if the groupType is equal to COUNTER_GROUP_IO
   **/
  public CounterGroup ioCounterGroup(IoCounterGroup ioCounterGroup) {
    this.ioCounterGroup = ioCounterGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "I/O-operation-related statistical counters. This field is only present if the groupType is equal to COUNTER_GROUP_IO")
  @JsonProperty("ioCounterGroup")
  public IoCounterGroup getIoCounterGroup() {
    return ioCounterGroup;
  }
  
  public void setIoCounterGroup(IoCounterGroup ioCounterGroup) {
    this.ioCounterGroup = ioCounterGroup;
  }

  
  /**
   * Volume-related statistical counters. This field is only present if groupType is equal to COUNTER_GROUP_VOLUME.
   **/
  public CounterGroup volCounterGroup(VolumeCounterGroup volCounterGroup) {
    this.volCounterGroup = volCounterGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Volume-related statistical counters. This field is only present if groupType is equal to COUNTER_GROUP_VOLUME.")
  @JsonProperty("volCounterGroup")
  public VolumeCounterGroup getVolCounterGroup() {
    return volCounterGroup;
  }
  
  public void setVolCounterGroup(VolumeCounterGroup volCounterGroup) {
    this.volCounterGroup = volCounterGroup;
  }

  
  /**
   * The ControllerCounterGroup tracks statistics at the controller level and are not specific to a volume, interface or drive. These fields include the CPU utilization, total numbers of reads, writes, and non-read/write commands, and cache mirroring statistics. The ObjectReference must be a ControllerRef.
   **/
  public CounterGroup controllerCounterGroup(ControllerCounterGroup controllerCounterGroup) {
    this.controllerCounterGroup = controllerCounterGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ControllerCounterGroup tracks statistics at the controller level and are not specific to a volume, interface or drive. These fields include the CPU utilization, total numbers of reads, writes, and non-read/write commands, and cache mirroring statistics. The ObjectReference must be a ControllerRef.")
  @JsonProperty("controllerCounterGroup")
  public ControllerCounterGroup getControllerCounterGroup() {
    return controllerCounterGroup;
  }
  
  public void setControllerCounterGroup(ControllerCounterGroup controllerCounterGroup) {
    this.controllerCounterGroup = controllerCounterGroup;
  }

  
  /**
   * The InterfaceCounterGroup tracks statistics on a per channel level. This group reports the type of channel, its channel number, and the read, write and other operation counters. It also reports queue depth statistics.
   **/
  public CounterGroup interfaceCounterGroup(InterfaceCounterGroup interfaceCounterGroup) {
    this.interfaceCounterGroup = interfaceCounterGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The InterfaceCounterGroup tracks statistics on a per channel level. This group reports the type of channel, its channel number, and the read, write and other operation counters. It also reports queue depth statistics.")
  @JsonProperty("interfaceCounterGroup")
  public InterfaceCounterGroup getInterfaceCounterGroup() {
    return interfaceCounterGroup;
  }
  
  public void setInterfaceCounterGroup(InterfaceCounterGroup interfaceCounterGroup) {
    this.interfaceCounterGroup = interfaceCounterGroup;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterGroup counterGroup = (CounterGroup) o;
    return Objects.equals(this.groupType, counterGroup.groupType) &&
        Objects.equals(this.drvCounterGroup, counterGroup.drvCounterGroup) &&
        Objects.equals(this.implCounterGroup, counterGroup.implCounterGroup) &&
        Objects.equals(this.ioCounterGroup, counterGroup.ioCounterGroup) &&
        Objects.equals(this.volCounterGroup, counterGroup.volCounterGroup) &&
        Objects.equals(this.controllerCounterGroup, counterGroup.controllerCounterGroup) &&
        Objects.equals(this.interfaceCounterGroup, counterGroup.interfaceCounterGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupType, drvCounterGroup, implCounterGroup, ioCounterGroup, volCounterGroup, controllerCounterGroup, interfaceCounterGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterGroup {\n");
    
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    drvCounterGroup: ").append(toIndentedString(drvCounterGroup)).append("\n");
    sb.append("    implCounterGroup: ").append(toIndentedString(implCounterGroup)).append("\n");
    sb.append("    ioCounterGroup: ").append(toIndentedString(ioCounterGroup)).append("\n");
    sb.append("    volCounterGroup: ").append(toIndentedString(volCounterGroup)).append("\n");
    sb.append("    controllerCounterGroup: ").append(toIndentedString(controllerCounterGroup)).append("\n");
    sb.append("    interfaceCounterGroup: ").append(toIndentedString(interfaceCounterGroup)).append("\n");
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

