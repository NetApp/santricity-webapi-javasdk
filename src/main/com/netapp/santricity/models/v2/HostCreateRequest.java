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
 * Creates a Host in the Storage System
 */
@ApiModel(description = "Creates a Host in the Storage System")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class HostCreateRequest   {
  
    private String name;

    private HostType hostType;

    private String groupId;

    private List<HostPortCreateRequest> ports;

  
  /**
   * The user-label to assign to the new host.
   **/
  public HostCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-label to assign to the new host.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The host type string as returned from /host-types.
   **/
  public HostCreateRequest hostType(HostType hostType) {
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

  
  /**
   * The host group identifier (optional).
   **/
  public HostCreateRequest groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The host group identifier (optional).")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * A list of host ports (optional).
   **/
  public HostCreateRequest ports(List<HostPortCreateRequest> ports) {
    this.ports = ports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of host ports (optional).")
  @JsonProperty("ports")
  public List<HostPortCreateRequest> getPorts() {
    return ports;
  }
  
  public void setPorts(List<HostPortCreateRequest> ports) {
    this.ports = ports;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostCreateRequest hostCreateRequest = (HostCreateRequest) o;
    return Objects.equals(this.name, hostCreateRequest.name) &&
        Objects.equals(this.hostType, hostCreateRequest.hostType) &&
        Objects.equals(this.groupId, hostCreateRequest.groupId) &&
        Objects.equals(this.ports, hostCreateRequest.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hostType, groupId, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

