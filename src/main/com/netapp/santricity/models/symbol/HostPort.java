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
 * HostPort
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class HostPort   {
  
    private String hostPortRef;

    private String hostPortName;

    private String label;

    private String hostRef;

    private Integer hostPortTypeIndex;

    private Boolean isSAControlled;

    private Boolean confirmLUNMappingCreation;

    private SCSIInitiatorPortId portId;

    private Boolean portInactive;

    private String id;

  
  /**
   * The unique identification value for this object. Other objects may use this reference value to refer to the host port.
   **/
  public HostPort hostPortRef(String hostPortRef) {
    this.hostPortRef = hostPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value for this object. Other objects may use this reference value to refer to the host port.")
  @JsonProperty("hostPortRef")
  public String getHostPortRef() {
    return hostPortRef;
  }
  
  public void setHostPortRef(String hostPortRef) {
    this.hostPortRef = hostPortRef;
  }

  
  /**
   * The unique, externally-defined identifier for this object. For example, for a Fibre Channel host port, this field contains the value of the Fibre Channel world-wide name for the port.
   **/
  public HostPort hostPortName(String hostPortName) {
    this.hostPortName = hostPortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique, externally-defined identifier for this object. For example, for a Fibre Channel host port, this field contains the value of the Fibre Channel world-wide name for the port.")
  @JsonProperty("hostPortName")
  public String getHostPortName() {
    return hostPortName;
  }
  
  public void setHostPortName(String hostPortName) {
    this.hostPortName = hostPortName;
  }

  
  /**
   * The user-assigned, descriptive label string for the host port.
   **/
  public HostPort label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned, descriptive label string for the host port.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The host reference value of the host in which this port resides.
   **/
  public HostPort hostRef(String hostRef) {
    this.hostRef = hostRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host reference value of the host in which this port resides.")
  @JsonProperty("hostRef")
  public String getHostRef() {
    return hostRef;
  }
  
  public void setHostRef(String hostRef) {
    this.hostRef = hostRef;
  }

  
  /**
   * An index value that indicates the type of host port. This value is used to reference the appropriate entry in the hostPortType field of the associated StorageArray object.
   **/
  public HostPort hostPortTypeIndex(Integer hostPortTypeIndex) {
    this.hostPortTypeIndex = hostPortTypeIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An index value that indicates the type of host port. This value is used to reference the appropriate entry in the hostPortType field of the associated StorageArray object.")
  @JsonProperty("hostPortTypeIndex")
  public Integer getHostPortTypeIndex() {
    return hostPortTypeIndex;
  }
  
  public void setHostPortTypeIndex(Integer hostPortTypeIndex) {
    this.hostPortTypeIndex = hostPortTypeIndex;
  }

  
  /**
   * If true, indicates that I/O accesses from this host port are subject to the storage array's default LUN-to-volume mappings. If false, indicates that I/O accesses from the host port are subject to host-specific or cluster-specific LUN-to-volume mappings.
   **/
  public HostPort isSAControlled(Boolean isSAControlled) {
    this.isSAControlled = isSAControlled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, indicates that I/O accesses from this host port are subject to the storage array's default LUN-to-volume mappings. If false, indicates that I/O accesses from the host port are subject to host-specific or cluster-specific LUN-to-volume mappings.")
  @JsonProperty("isSAControlled")
  public Boolean getIsSAControlled() {
    return isSAControlled;
  }
  
  public void setIsSAControlled(Boolean isSAControlled) {
    this.isSAControlled = isSAControlled;
  }

  
  /**
   * If true, indicates that creation of LUN-to-volume mappings should require careful confirmation from the end-user, since such a mapping will alter the volume access rights of other host ports, in addition to this one.
   **/
  public HostPort confirmLUNMappingCreation(Boolean confirmLUNMappingCreation) {
    this.confirmLUNMappingCreation = confirmLUNMappingCreation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, indicates that creation of LUN-to-volume mappings should require careful confirmation from the end-user, since such a mapping will alter the volume access rights of other host ports, in addition to this one.")
  @JsonProperty("confirmLUNMappingCreation")
  public Boolean getConfirmLUNMappingCreation() {
    return confirmLUNMappingCreation;
  }
  
  public void setConfirmLUNMappingCreation(Boolean confirmLUNMappingCreation) {
    this.confirmLUNMappingCreation = confirmLUNMappingCreation;
  }

  
  /**
   * The I/O-protocol-based unique port identifier. This field replaces the deprecated hostPortName field.
   **/
  public HostPort portId(SCSIInitiatorPortId portId) {
    this.portId = portId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The I/O-protocol-based unique port identifier. This field replaces the deprecated hostPortName field.")
  @JsonProperty("portId")
  public SCSIInitiatorPortId getPortId() {
    return portId;
  }
  
  public void setPortId(SCSIInitiatorPortId portId) {
    this.portId = portId;
  }

  
  /**
   * The host port has been marked inactive
   **/
  public HostPort portInactive(Boolean portInactive) {
    this.portInactive = portInactive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host port has been marked inactive")
  @JsonProperty("portInactive")
  public Boolean getPortInactive() {
    return portInactive;
  }
  
  public void setPortInactive(Boolean portInactive) {
    this.portInactive = portInactive;
  }

  
  /**
   **/
  public HostPort id(String id) {
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
    HostPort hostPort = (HostPort) o;
    return Objects.equals(this.hostPortRef, hostPort.hostPortRef) &&
        Objects.equals(this.hostPortName, hostPort.hostPortName) &&
        Objects.equals(this.label, hostPort.label) &&
        Objects.equals(this.hostRef, hostPort.hostRef) &&
        Objects.equals(this.hostPortTypeIndex, hostPort.hostPortTypeIndex) &&
        Objects.equals(this.isSAControlled, hostPort.isSAControlled) &&
        Objects.equals(this.confirmLUNMappingCreation, hostPort.confirmLUNMappingCreation) &&
        Objects.equals(this.portId, hostPort.portId) &&
        Objects.equals(this.portInactive, hostPort.portInactive) &&
        Objects.equals(this.id, hostPort.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostPortRef, hostPortName, label, hostRef, hostPortTypeIndex, isSAControlled, confirmLUNMappingCreation, portId, portInactive, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostPort {\n");
    
    sb.append("    hostPortRef: ").append(toIndentedString(hostPortRef)).append("\n");
    sb.append("    hostPortName: ").append(toIndentedString(hostPortName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
    sb.append("    hostPortTypeIndex: ").append(toIndentedString(hostPortTypeIndex)).append("\n");
    sb.append("    isSAControlled: ").append(toIndentedString(isSAControlled)).append("\n");
    sb.append("    confirmLUNMappingCreation: ").append(toIndentedString(confirmLUNMappingCreation)).append("\n");
    sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
    sb.append("    portInactive: ").append(toIndentedString(portInactive)).append("\n");
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

