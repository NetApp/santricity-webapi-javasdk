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
 * HostEx
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class HostEx   {
  
    private String hostRef;

    private String clusterRef;

    private String label;

    private Boolean isSAControlled;

    private Boolean confirmLUNMappingCreation;

    private Integer hostTypeIndex;

    private Boolean protectionInformationCapableAccessMethod;

    private Boolean isLargeBlockFormatHost;

    private List<HostPort> ports;

    private List<Initiator> initiators;

    private List<HostSidePort> hostSidePorts;

    private String id;

    private String name;

  
  /**
   * The unique identification value for this object. Other objects may use this reference value to refer to the host.
   **/
  public HostEx hostRef(String hostRef) {
    this.hostRef = hostRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value for this object. Other objects may use this reference value to refer to the host.")
  @JsonProperty("hostRef")
  public String getHostRef() {
    return hostRef;
  }
  
  public void setHostRef(String hostRef) {
    this.hostRef = hostRef;
  }

  
  /**
   * The cluster reference value of the cluster in which this host resides. A NULL reference value indicates that the host has not been assigned to a cluster.
   **/
  public HostEx clusterRef(String clusterRef) {
    this.clusterRef = clusterRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cluster reference value of the cluster in which this host resides. A NULL reference value indicates that the host has not been assigned to a cluster.")
  @JsonProperty("clusterRef")
  public String getClusterRef() {
    return clusterRef;
  }
  
  public void setClusterRef(String clusterRef) {
    this.clusterRef = clusterRef;
  }

  
  /**
   * The user-assigned, descriptive label string for the host.
   **/
  public HostEx label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned, descriptive label string for the host.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * If true, indicates that I/O accesses from this host are subject to the storage array's default LUN-to-volume mappings. If false, indicates that I/O accesses from the host are subject to host-specific or cluster-specific LUN-to-volume mappings.
   **/
  public HostEx isSAControlled(Boolean isSAControlled) {
    this.isSAControlled = isSAControlled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, indicates that I/O accesses from this host are subject to the storage array's default LUN-to-volume mappings. If false, indicates that I/O accesses from the host are subject to host-specific or cluster-specific LUN-to-volume mappings.")
  @JsonProperty("isSAControlled")
  public Boolean getIsSAControlled() {
    return isSAControlled;
  }
  
  public void setIsSAControlled(Boolean isSAControlled) {
    this.isSAControlled = isSAControlled;
  }

  
  /**
   * If true, indicates that creation of LUN-to-volume mappings should require careful confirmation from the end-user, since such a mapping will alter the volume access rights of other hosts, in addition to this one.
   **/
  public HostEx confirmLUNMappingCreation(Boolean confirmLUNMappingCreation) {
    this.confirmLUNMappingCreation = confirmLUNMappingCreation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, indicates that creation of LUN-to-volume mappings should require careful confirmation from the end-user, since such a mapping will alter the volume access rights of other hosts, in addition to this one.")
  @JsonProperty("confirmLUNMappingCreation")
  public Boolean getConfirmLUNMappingCreation() {
    return confirmLUNMappingCreation;
  }
  
  public void setConfirmLUNMappingCreation(Boolean confirmLUNMappingCreation) {
    this.confirmLUNMappingCreation = confirmLUNMappingCreation;
  }

  
  /**
   * An integer index indicating the type of host.
   **/
  public HostEx hostTypeIndex(Integer hostTypeIndex) {
    this.hostTypeIndex = hostTypeIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An integer index indicating the type of host.")
  @JsonProperty("hostTypeIndex")
  public Integer getHostTypeIndex() {
    return hostTypeIndex;
  }
  
  public void setHostTypeIndex(Integer hostTypeIndex) {
    this.hostTypeIndex = hostTypeIndex;
  }

  
  /**
   * This field is true if the host has a PI capable access method.
   **/
  public HostEx protectionInformationCapableAccessMethod(Boolean protectionInformationCapableAccessMethod) {
    this.protectionInformationCapableAccessMethod = protectionInformationCapableAccessMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is true if the host has a PI capable access method.")
  @JsonProperty("protectionInformationCapableAccessMethod")
  public Boolean getProtectionInformationCapableAccessMethod() {
    return protectionInformationCapableAccessMethod;
  }
  
  public void setProtectionInformationCapableAccessMethod(Boolean protectionInformationCapableAccessMethod) {
    this.protectionInformationCapableAccessMethod = protectionInformationCapableAccessMethod;
  }

  
  /**
   * If true, the host is capable of supporting large block formats.
   **/
  public HostEx isLargeBlockFormatHost(Boolean isLargeBlockFormatHost) {
    this.isLargeBlockFormatHost = isLargeBlockFormatHost;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the host is capable of supporting large block formats.")
  @JsonProperty("isLargeBlockFormatHost")
  public Boolean getIsLargeBlockFormatHost() {
    return isLargeBlockFormatHost;
  }
  
  public void setIsLargeBlockFormatHost(Boolean isLargeBlockFormatHost) {
    this.isLargeBlockFormatHost = isLargeBlockFormatHost;
  }

  
  /**
   **/
  public HostEx ports(List<HostPort> ports) {
    this.ports = ports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ports")
  public List<HostPort> getPorts() {
    return ports;
  }
  
  public void setPorts(List<HostPort> ports) {
    this.ports = ports;
  }

  
  /**
   **/
  public HostEx initiators(List<Initiator> initiators) {
    this.initiators = initiators;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiators")
  public List<Initiator> getInitiators() {
    return initiators;
  }
  
  public void setInitiators(List<Initiator> initiators) {
    this.initiators = initiators;
  }

  
  /**
   **/
  public HostEx hostSidePorts(List<HostSidePort> hostSidePorts) {
    this.hostSidePorts = hostSidePorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hostSidePorts")
  public List<HostSidePort> getHostSidePorts() {
    return hostSidePorts;
  }
  
  public void setHostSidePorts(List<HostSidePort> hostSidePorts) {
    this.hostSidePorts = hostSidePorts;
  }

  
  /**
   **/
  public HostEx id(String id) {
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

  
  /**
   **/
  public HostEx name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostEx hostEx = (HostEx) o;
    return Objects.equals(this.hostRef, hostEx.hostRef) &&
        Objects.equals(this.clusterRef, hostEx.clusterRef) &&
        Objects.equals(this.label, hostEx.label) &&
        Objects.equals(this.isSAControlled, hostEx.isSAControlled) &&
        Objects.equals(this.confirmLUNMappingCreation, hostEx.confirmLUNMappingCreation) &&
        Objects.equals(this.hostTypeIndex, hostEx.hostTypeIndex) &&
        Objects.equals(this.protectionInformationCapableAccessMethod, hostEx.protectionInformationCapableAccessMethod) &&
        Objects.equals(this.isLargeBlockFormatHost, hostEx.isLargeBlockFormatHost) &&
        Objects.equals(this.ports, hostEx.ports) &&
        Objects.equals(this.initiators, hostEx.initiators) &&
        Objects.equals(this.hostSidePorts, hostEx.hostSidePorts) &&
        Objects.equals(this.id, hostEx.id) &&
        Objects.equals(this.name, hostEx.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostRef, clusterRef, label, isSAControlled, confirmLUNMappingCreation, hostTypeIndex, protectionInformationCapableAccessMethod, isLargeBlockFormatHost, ports, initiators, hostSidePorts, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostEx {\n");
    
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
    sb.append("    clusterRef: ").append(toIndentedString(clusterRef)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    isSAControlled: ").append(toIndentedString(isSAControlled)).append("\n");
    sb.append("    confirmLUNMappingCreation: ").append(toIndentedString(confirmLUNMappingCreation)).append("\n");
    sb.append("    hostTypeIndex: ").append(toIndentedString(hostTypeIndex)).append("\n");
    sb.append("    protectionInformationCapableAccessMethod: ").append(toIndentedString(protectionInformationCapableAccessMethod)).append("\n");
    sb.append("    isLargeBlockFormatHost: ").append(toIndentedString(isLargeBlockFormatHost)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    initiators: ").append(toIndentedString(initiators)).append("\n");
    sb.append("    hostSidePorts: ").append(toIndentedString(hostSidePorts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

