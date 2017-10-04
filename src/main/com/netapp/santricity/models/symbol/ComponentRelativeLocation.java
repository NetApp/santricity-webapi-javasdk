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
 * ComponentRelativeLocation
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ComponentRelativeLocation   {
  

  /**
   * The type of component.
   */
  public enum ComponentTypeEnum {
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

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ComponentTypeEnum componentType;

    private Integer trayId;

    private Integer relativePosition;

    private Integer parentSize;

    private List<ParentRelativeLocation> parent;

    private String componentLabel;

  
  /**
   * The type of component.
   **/
  public ComponentRelativeLocation componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of component.")
  @JsonProperty("componentType")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }
  
  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  
  /**
   * The tray ID of the tray containing the component.
   **/
  public ComponentRelativeLocation trayId(Integer trayId) {
    this.trayId = trayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The tray ID of the tray containing the component.")
  @JsonProperty("trayId")
  public Integer getTrayId() {
    return trayId;
  }
  
  public void setTrayId(Integer trayId) {
    this.trayId = trayId;
  }

  
  /**
   * The relative position within the component's parent.
   **/
  public ComponentRelativeLocation relativePosition(Integer relativePosition) {
    this.relativePosition = relativePosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The relative position within the component's parent.")
  @JsonProperty("relativePosition")
  public Integer getRelativePosition() {
    return relativePosition;
  }
  
  public void setRelativePosition(Integer relativePosition) {
    this.relativePosition = relativePosition;
  }

  
  /**
   * The size of the parent array that follows.
   **/
  public ComponentRelativeLocation parentSize(Integer parentSize) {
    this.parentSize = parentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the parent array that follows.")
  @JsonProperty("parentSize")
  public Integer getParentSize() {
    return parentSize;
  }
  
  public void setParentSize(Integer parentSize) {
    this.parentSize = parentSize;
  }

  
  /**
   * This is an array containing additional parent-relative location information. The first element in the array will contain the parent's component type and its relative position within it's parent.
   **/
  public ComponentRelativeLocation parent(List<ParentRelativeLocation> parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is an array containing additional parent-relative location information. The first element in the array will contain the parent's component type and its relative position within it's parent.")
  @JsonProperty("parent")
  public List<ParentRelativeLocation> getParent() {
    return parent;
  }
  
  public void setParent(List<ParentRelativeLocation> parent) {
    this.parent = parent;
  }

  
  /**
   * Contains the label of the component.
   **/
  public ComponentRelativeLocation componentLabel(String componentLabel) {
    this.componentLabel = componentLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains the label of the component.")
  @JsonProperty("componentLabel")
  public String getComponentLabel() {
    return componentLabel;
  }
  
  public void setComponentLabel(String componentLabel) {
    this.componentLabel = componentLabel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentRelativeLocation componentRelativeLocation = (ComponentRelativeLocation) o;
    return Objects.equals(this.componentType, componentRelativeLocation.componentType) &&
        Objects.equals(this.trayId, componentRelativeLocation.trayId) &&
        Objects.equals(this.relativePosition, componentRelativeLocation.relativePosition) &&
        Objects.equals(this.parentSize, componentRelativeLocation.parentSize) &&
        Objects.equals(this.parent, componentRelativeLocation.parent) &&
        Objects.equals(this.componentLabel, componentRelativeLocation.componentLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentType, trayId, relativePosition, parentSize, parent, componentLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentRelativeLocation {\n");
    
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    trayId: ").append(toIndentedString(trayId)).append("\n");
    sb.append("    relativePosition: ").append(toIndentedString(relativePosition)).append("\n");
    sb.append("    parentSize: ").append(toIndentedString(parentSize)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    componentLabel: ").append(toIndentedString(componentLabel)).append("\n");
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

