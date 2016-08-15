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
 * HostPortChangeableProperties
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class HostPortChangeableProperties   {
  
    private List<String> hostPortName;

    private List<String> label;

    private List<String> hostRef;

  
  /**
   * The unique, externally-defined identifier for this object. For example, for a Fibre Channel host port, this field contains the value of the Fibre Channel world-wide name for the port.
   **/
  public HostPortChangeableProperties hostPortName(List<String> hostPortName) {
    this.hostPortName = hostPortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique, externally-defined identifier for this object. For example, for a Fibre Channel host port, this field contains the value of the Fibre Channel world-wide name for the port.")
  @JsonProperty("hostPortName")
  public List<String> getHostPortName() {
    return hostPortName;
  }
  
  public void setHostPortName(List<String> hostPortName) {
    this.hostPortName = hostPortName;
  }

  
  /**
   * The user-assigned, descriptive label string for the host port.
   **/
  public HostPortChangeableProperties label(List<String> label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned, descriptive label string for the host port.")
  @JsonProperty("label")
  public List<String> getLabel() {
    return label;
  }
  
  public void setLabel(List<String> label) {
    this.label = label;
  }

  
  /**
   * The host reference value of the host in which this port resides.
   **/
  public HostPortChangeableProperties hostRef(List<String> hostRef) {
    this.hostRef = hostRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host reference value of the host in which this port resides.")
  @JsonProperty("hostRef")
  public List<String> getHostRef() {
    return hostRef;
  }
  
  public void setHostRef(List<String> hostRef) {
    this.hostRef = hostRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostPortChangeableProperties hostPortChangeableProperties = (HostPortChangeableProperties) o;
    return Objects.equals(this.hostPortName, hostPortChangeableProperties.hostPortName) &&
        Objects.equals(this.label, hostPortChangeableProperties.label) &&
        Objects.equals(this.hostRef, hostPortChangeableProperties.hostRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostPortName, label, hostRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostPortChangeableProperties {\n");
    
    sb.append("    hostPortName: ").append(toIndentedString(hostPortName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
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

