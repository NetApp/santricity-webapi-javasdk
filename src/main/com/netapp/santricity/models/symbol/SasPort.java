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
 * SasPort
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SasPort   {
  
    private SasPortProviderDevice parent;

    private SasAttachedDevice attachedDevice;


  /**
   * The state of the SAS port.
   */
  public enum StateEnum {
    unknown("unknown"),
    optimal("optimal"),
    degraded("degraded"),
    failed("failed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StateEnum state;


  /**
   * The type of miswire involving this port (or \"none\").
   */
  public enum MiswireTypeEnum {
    none("none"),
    topology("topology"),
    ctlrHostPort("ctlrHostPort"),
    ctlrDrivePortToHost("ctlrDrivePortToHost"),
    esm("esm"),
    ctlrDrivePortToEndDevice("ctlrDrivePortToEndDevice"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MiswireTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MiswireTypeEnum miswireType;

    private String channelPortRef;

    private List<SasPhy> sasPhys;

    private SasPortTypeData portTypeData;


  /**
   * The SAS port connection mode.
   */
  public enum PortModeEnum {
    unknown("unknown"),
    internal("internal"),
    externalIn("externalIn"),
    externalOut("externalOut"),
    endDevice("endDevice"),
    open("open"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PortModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PortModeEnum portMode;

    private Integer domainNumber;

    private String attachedChannelPortRef;

    private Integer discoveryStatus;

  
  /**
   * The device on which the port resides.
   **/
  public SasPort parent(SasPortProviderDevice parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The device on which the port resides.")
  @JsonProperty("parent")
  public SasPortProviderDevice getParent() {
    return parent;
  }
  
  public void setParent(SasPortProviderDevice parent) {
    this.parent = parent;
  }

  
  /**
   * An indication of what device is attached to this port.
   **/
  public SasPort attachedDevice(SasAttachedDevice attachedDevice) {
    this.attachedDevice = attachedDevice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of what device is attached to this port.")
  @JsonProperty("attachedDevice")
  public SasAttachedDevice getAttachedDevice() {
    return attachedDevice;
  }
  
  public void setAttachedDevice(SasAttachedDevice attachedDevice) {
    this.attachedDevice = attachedDevice;
  }

  
  /**
   * The state of the SAS port.
   **/
  public SasPort state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the SAS port.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The type of miswire involving this port (or \"none\").
   **/
  public SasPort miswireType(MiswireTypeEnum miswireType) {
    this.miswireType = miswireType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of miswire involving this port (or \"none\").")
  @JsonProperty("miswireType")
  public MiswireTypeEnum getMiswireType() {
    return miswireType;
  }
  
  public void setMiswireType(MiswireTypeEnum miswireType) {
    this.miswireType = miswireType;
  }

  
  /**
   * A reference to the channel port object identifying the external connector associated with this port. If the port is not associated with an external connector, then this field is set to a null SYMbol ref.
   **/
  public SasPort channelPortRef(String channelPortRef) {
    this.channelPortRef = channelPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the channel port object identifying the external connector associated with this port. If the port is not associated with an external connector, then this field is set to a null SYMbol ref.")
  @JsonProperty("channelPortRef")
  public String getChannelPortRef() {
    return channelPortRef;
  }
  
  public void setChannelPortRef(String channelPortRef) {
    this.channelPortRef = channelPortRef;
  }

  
  /**
   * A list of PHYs associated with this port.
   **/
  public SasPort sasPhys(List<SasPhy> sasPhys) {
    this.sasPhys = sasPhys;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of PHYs associated with this port.")
  @JsonProperty("sasPhys")
  public List<SasPhy> getSasPhys() {
    return sasPhys;
  }
  
  public void setSasPhys(List<SasPhy> sasPhys) {
    this.sasPhys = sasPhys;
  }

  
  /**
   * Information about a SAS port that is type-dependent.
   **/
  public SasPort portTypeData(SasPortTypeData portTypeData) {
    this.portTypeData = portTypeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about a SAS port that is type-dependent.")
  @JsonProperty("portTypeData")
  public SasPortTypeData getPortTypeData() {
    return portTypeData;
  }
  
  public void setPortTypeData(SasPortTypeData portTypeData) {
    this.portTypeData = portTypeData;
  }

  
  /**
   * The SAS port connection mode.
   **/
  public SasPort portMode(PortModeEnum portMode) {
    this.portMode = portMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SAS port connection mode.")
  @JsonProperty("portMode")
  public PortModeEnum getPortMode() {
    return portMode;
  }
  
  public void setPortMode(PortModeEnum portMode) {
    this.portMode = portMode;
  }

  
  /**
   * The domain number identifies which SAS domain this element is a part of. Domain numbers are arbitrarily assigned by the firmware and are consistent on a per controller basis -- but not across controllers. So, the contents of domains will be consistent across controllers but the number identifying a particular domain may not be.
   **/
  public SasPort domainNumber(Integer domainNumber) {
    this.domainNumber = domainNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The domain number identifies which SAS domain this element is a part of. Domain numbers are arbitrarily assigned by the firmware and are consistent on a per controller basis -- but not across controllers. So, the contents of domains will be consistent across controllers but the number identifying a particular domain may not be.")
  @JsonProperty("domainNumber")
  public Integer getDomainNumber() {
    return domainNumber;
  }
  
  public void setDomainNumber(Integer domainNumber) {
    this.domainNumber = domainNumber;
  }

  
  /**
   * This ref identifies the connector on the attached device for a drive channel who's external port is connected to another device.
   **/
  public SasPort attachedChannelPortRef(String attachedChannelPortRef) {
    this.attachedChannelPortRef = attachedChannelPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This ref identifies the connector on the attached device for a drive channel who's external port is connected to another device.")
  @JsonProperty("attachedChannelPortRef")
  public String getAttachedChannelPortRef() {
    return attachedChannelPortRef;
  }
  
  public void setAttachedChannelPortRef(String attachedChannelPortRef) {
    this.attachedChannelPortRef = attachedChannelPortRef;
  }

  
  /**
   * This element contains the status of the SAS discovery - the status is a bit field and could indicate a successful discovery or could indicate one or more failure conditions (indicated by one or more error flags being set).
   **/
  public SasPort discoveryStatus(Integer discoveryStatus) {
    this.discoveryStatus = discoveryStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This element contains the status of the SAS discovery - the status is a bit field and could indicate a successful discovery or could indicate one or more failure conditions (indicated by one or more error flags being set).")
  @JsonProperty("discoveryStatus")
  public Integer getDiscoveryStatus() {
    return discoveryStatus;
  }
  
  public void setDiscoveryStatus(Integer discoveryStatus) {
    this.discoveryStatus = discoveryStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasPort sasPort = (SasPort) o;
    return Objects.equals(this.parent, sasPort.parent) &&
        Objects.equals(this.attachedDevice, sasPort.attachedDevice) &&
        Objects.equals(this.state, sasPort.state) &&
        Objects.equals(this.miswireType, sasPort.miswireType) &&
        Objects.equals(this.channelPortRef, sasPort.channelPortRef) &&
        Objects.equals(this.sasPhys, sasPort.sasPhys) &&
        Objects.equals(this.portTypeData, sasPort.portTypeData) &&
        Objects.equals(this.portMode, sasPort.portMode) &&
        Objects.equals(this.domainNumber, sasPort.domainNumber) &&
        Objects.equals(this.attachedChannelPortRef, sasPort.attachedChannelPortRef) &&
        Objects.equals(this.discoveryStatus, sasPort.discoveryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, attachedDevice, state, miswireType, channelPortRef, sasPhys, portTypeData, portMode, domainNumber, attachedChannelPortRef, discoveryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasPort {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    attachedDevice: ").append(toIndentedString(attachedDevice)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    miswireType: ").append(toIndentedString(miswireType)).append("\n");
    sb.append("    channelPortRef: ").append(toIndentedString(channelPortRef)).append("\n");
    sb.append("    sasPhys: ").append(toIndentedString(sasPhys)).append("\n");
    sb.append("    portTypeData: ").append(toIndentedString(portTypeData)).append("\n");
    sb.append("    portMode: ").append(toIndentedString(portMode)).append("\n");
    sb.append("    domainNumber: ").append(toIndentedString(domainNumber)).append("\n");
    sb.append("    attachedChannelPortRef: ").append(toIndentedString(attachedChannelPortRef)).append("\n");
    sb.append("    discoveryStatus: ").append(toIndentedString(discoveryStatus)).append("\n");
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

