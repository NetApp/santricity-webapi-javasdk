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
 * Updates the Host data.
 */
@ApiModel(description = "Updates the Host data.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class HostUpdateRequest   {
  
    private String name;

    private String groupId;

    private List<HostPortCreateRequest> ports;

    private List<HostPortUpdateRequest> portsToUpdate;

    private List<String> portsToRemove;

    private HostType hostType;

  
  /**
   * The user-label to assign to the host (optional).
   **/
  public HostUpdateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user-label to assign to the host (optional).")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The host group identifier.
   **/
  public HostUpdateRequest groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The host group identifier.")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * A list of host ports to create.
   **/
  public HostUpdateRequest ports(List<HostPortCreateRequest> ports) {
    this.ports = ports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of host ports to create.")
  @JsonProperty("ports")
  public List<HostPortCreateRequest> getPorts() {
    return ports;
  }
  
  public void setPorts(List<HostPortCreateRequest> ports) {
    this.ports = ports;
  }

  
  /**
   * A list of host ports to update.
   **/
  public HostUpdateRequest portsToUpdate(List<HostPortUpdateRequest> portsToUpdate) {
    this.portsToUpdate = portsToUpdate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of host ports to update.")
  @JsonProperty("portsToUpdate")
  public List<HostPortUpdateRequest> getPortsToUpdate() {
    return portsToUpdate;
  }
  
  public void setPortsToUpdate(List<HostPortUpdateRequest> portsToUpdate) {
    this.portsToUpdate = portsToUpdate;
  }

  
  /**
   * A list of HostPorts to delete.
   **/
  public HostUpdateRequest portsToRemove(List<String> portsToRemove) {
    this.portsToRemove = portsToRemove;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of HostPorts to delete.")
  @JsonProperty("portsToRemove")
  public List<String> getPortsToRemove() {
    return portsToRemove;
  }
  
  public void setPortsToRemove(List<String> portsToRemove) {
    this.portsToRemove = portsToRemove;
  }

  
  /**
   * The host type string as returned from /host-types.
   **/
  public HostUpdateRequest hostType(HostType hostType) {
    this.hostType = hostType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The host type string as returned from /host-types.")
  @JsonProperty("hostType")
  public HostType getHostType() {
    return hostType;
  }
  
  public void setHostType(HostType hostType) {
    this.hostType = hostType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostUpdateRequest hostUpdateRequest = (HostUpdateRequest) o;
    return Objects.equals(this.name, hostUpdateRequest.name) &&
        Objects.equals(this.groupId, hostUpdateRequest.groupId) &&
        Objects.equals(this.ports, hostUpdateRequest.ports) &&
        Objects.equals(this.portsToUpdate, hostUpdateRequest.portsToUpdate) &&
        Objects.equals(this.portsToRemove, hostUpdateRequest.portsToRemove) &&
        Objects.equals(this.hostType, hostUpdateRequest.hostType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, groupId, ports, portsToUpdate, portsToRemove, hostType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    portsToUpdate: ").append(toIndentedString(portsToUpdate)).append("\n");
    sb.append("    portsToRemove: ").append(toIndentedString(portsToRemove)).append("\n");
    sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
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

