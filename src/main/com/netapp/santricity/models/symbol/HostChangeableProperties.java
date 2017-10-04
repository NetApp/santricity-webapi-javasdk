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
 * HostChangeableProperties
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class HostChangeableProperties   {
  
    private List<Integer> hostTypeIndex;

    private List<String> label;

    private List<String> clusterRef;

  
  /**
   * The index value indicating the type of host. This value is used to reference the appropriate entry in the hostPortType field of the associated StorageArray object.
   **/
  public HostChangeableProperties hostTypeIndex(List<Integer> hostTypeIndex) {
    this.hostTypeIndex = hostTypeIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The index value indicating the type of host. This value is used to reference the appropriate entry in the hostPortType field of the associated StorageArray object.")
  @JsonProperty("hostTypeIndex")
  public List<Integer> getHostTypeIndex() {
    return hostTypeIndex;
  }
  
  public void setHostTypeIndex(List<Integer> hostTypeIndex) {
    this.hostTypeIndex = hostTypeIndex;
  }

  
  /**
   * The user-assigned, descriptive label string for the host.
   **/
  public HostChangeableProperties label(List<String> label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned, descriptive label string for the host.")
  @JsonProperty("label")
  public List<String> getLabel() {
    return label;
  }
  
  public void setLabel(List<String> label) {
    this.label = label;
  }

  
  /**
   * The cluster reference value of the cluster in which this host resides. A null reference (binary zeros) means that the host should not be attached to any cluster.
   **/
  public HostChangeableProperties clusterRef(List<String> clusterRef) {
    this.clusterRef = clusterRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cluster reference value of the cluster in which this host resides. A null reference (binary zeros) means that the host should not be attached to any cluster.")
  @JsonProperty("clusterRef")
  public List<String> getClusterRef() {
    return clusterRef;
  }
  
  public void setClusterRef(List<String> clusterRef) {
    this.clusterRef = clusterRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostChangeableProperties hostChangeableProperties = (HostChangeableProperties) o;
    return Objects.equals(this.hostTypeIndex, hostChangeableProperties.hostTypeIndex) &&
        Objects.equals(this.label, hostChangeableProperties.label) &&
        Objects.equals(this.clusterRef, hostChangeableProperties.clusterRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostTypeIndex, label, clusterRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostChangeableProperties {\n");
    
    sb.append("    hostTypeIndex: ").append(toIndentedString(hostTypeIndex)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    clusterRef: ").append(toIndentedString(clusterRef)).append("\n");
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

