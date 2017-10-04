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
 * HostPortMutableProperties
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class HostPortMutableProperties   {
  
    private List<String> label;

    private List<String> hostRef;

    private List<SCSIInitiatorPortId> portId;

  
  /**
   * Either an empty field (length indicator = 0) signifying no change, or the new value of the user-assigned label for the port.r
   **/
  public HostPortMutableProperties label(List<String> label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Either an empty field (length indicator = 0) signifying no change, or the new value of the user-assigned label for the port.r")
  @JsonProperty("label")
  public List<String> getLabel() {
    return label;
  }
  
  public void setLabel(List<String> label) {
    this.label = label;
  }

  
  /**
   * Either an empty field (length indicator = 0) signifying no change, or the new value of the hostRef field used to associate the port with a host.
   **/
  public HostPortMutableProperties hostRef(List<String> hostRef) {
    this.hostRef = hostRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Either an empty field (length indicator = 0) signifying no change, or the new value of the hostRef field used to associate the port with a host.")
  @JsonProperty("hostRef")
  public List<String> getHostRef() {
    return hostRef;
  }
  
  public void setHostRef(List<String> hostRef) {
    this.hostRef = hostRef;
  }

  
  /**
   * Either an empty field (length indicator = 0) signifying no change, or the new value of the I/O-protocol-based unique port identifier
   **/
  public HostPortMutableProperties portId(List<SCSIInitiatorPortId> portId) {
    this.portId = portId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Either an empty field (length indicator = 0) signifying no change, or the new value of the I/O-protocol-based unique port identifier")
  @JsonProperty("portId")
  public List<SCSIInitiatorPortId> getPortId() {
    return portId;
  }
  
  public void setPortId(List<SCSIInitiatorPortId> portId) {
    this.portId = portId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostPortMutableProperties hostPortMutableProperties = (HostPortMutableProperties) o;
    return Objects.equals(this.label, hostPortMutableProperties.label) &&
        Objects.equals(this.hostRef, hostPortMutableProperties.hostRef) &&
        Objects.equals(this.portId, hostPortMutableProperties.portId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, hostRef, portId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostPortMutableProperties {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
    sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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

