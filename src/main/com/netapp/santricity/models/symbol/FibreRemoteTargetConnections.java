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
 * FibreRemoteTargetConnections
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class FibreRemoteTargetConnections   {
  
    private String remoteNodeWWN;

    private List<String> associatedSwitchPorts;

    private List<FibrePortLogin> connectedRemoteTargetPorts;

  
  /**
   * Remote node name.
   **/
  public FibreRemoteTargetConnections remoteNodeWWN(String remoteNodeWWN) {
    this.remoteNodeWWN = remoteNodeWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Remote node name.")
  @JsonProperty("remoteNodeWWN")
  public String getRemoteNodeWWN() {
    return remoteNodeWWN;
  }
  
  public void setRemoteNodeWWN(String remoteNodeWWN) {
    this.remoteNodeWWN = remoteNodeWWN;
  }

  
  /**
   * Associated (visible) switch ports.
   **/
  public FibreRemoteTargetConnections associatedSwitchPorts(List<String> associatedSwitchPorts) {
    this.associatedSwitchPorts = associatedSwitchPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Associated (visible) switch ports.")
  @JsonProperty("associatedSwitchPorts")
  public List<String> getAssociatedSwitchPorts() {
    return associatedSwitchPorts;
  }
  
  public void setAssociatedSwitchPorts(List<String> associatedSwitchPorts) {
    this.associatedSwitchPorts = associatedSwitchPorts;
  }

  
  /**
   * Connected remote target ports.
   **/
  public FibreRemoteTargetConnections connectedRemoteTargetPorts(List<FibrePortLogin> connectedRemoteTargetPorts) {
    this.connectedRemoteTargetPorts = connectedRemoteTargetPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Connected remote target ports.")
  @JsonProperty("connectedRemoteTargetPorts")
  public List<FibrePortLogin> getConnectedRemoteTargetPorts() {
    return connectedRemoteTargetPorts;
  }
  
  public void setConnectedRemoteTargetPorts(List<FibrePortLogin> connectedRemoteTargetPorts) {
    this.connectedRemoteTargetPorts = connectedRemoteTargetPorts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FibreRemoteTargetConnections fibreRemoteTargetConnections = (FibreRemoteTargetConnections) o;
    return Objects.equals(this.remoteNodeWWN, fibreRemoteTargetConnections.remoteNodeWWN) &&
        Objects.equals(this.associatedSwitchPorts, fibreRemoteTargetConnections.associatedSwitchPorts) &&
        Objects.equals(this.connectedRemoteTargetPorts, fibreRemoteTargetConnections.connectedRemoteTargetPorts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteNodeWWN, associatedSwitchPorts, connectedRemoteTargetPorts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FibreRemoteTargetConnections {\n");
    
    sb.append("    remoteNodeWWN: ").append(toIndentedString(remoteNodeWWN)).append("\n");
    sb.append("    associatedSwitchPorts: ").append(toIndentedString(associatedSwitchPorts)).append("\n");
    sb.append("    connectedRemoteTargetPorts: ").append(toIndentedString(connectedRemoteTargetPorts)).append("\n");
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

