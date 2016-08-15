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
 * IbPortPartitionTable
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IbPortPartitionTable   {
  
    private String controllerRef;

    private Integer portNumber;

    private String portGuid;

    private String tcaGuid;

    private List<Integer> pkeys;

  
  /**
   * A reference to the controller that is associated with the port described by this structure.
   **/
  public IbPortPartitionTable controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the controller that is associated with the port described by this structure.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * The controller-relative number of the port for which the table applies.
   **/
  public IbPortPartitionTable portNumber(Integer portNumber) {
    this.portNumber = portNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller-relative number of the port for which the table applies.")
  @JsonProperty("portNumber")
  public Integer getPortNumber() {
    return portNumber;
  }
  
  public void setPortNumber(Integer portNumber) {
    this.portNumber = portNumber;
  }

  
  /**
   * The globally-unique identifier associated with the port.
   **/
  public IbPortPartitionTable portGuid(String portGuid) {
    this.portGuid = portGuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally-unique identifier associated with the port.")
  @JsonProperty("portGuid")
  public String getPortGuid() {
    return portGuid;
  }
  
  public void setPortGuid(String portGuid) {
    this.portGuid = portGuid;
  }

  
  /**
   * The globally-unique identifier of the Target Channel Adapter that controls the port.
   **/
  public IbPortPartitionTable tcaGuid(String tcaGuid) {
    this.tcaGuid = tcaGuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally-unique identifier of the Target Channel Adapter that controls the port.")
  @JsonProperty("tcaGuid")
  public String getTcaGuid() {
    return tcaGuid;
  }
  
  public void setTcaGuid(String tcaGuid) {
    this.tcaGuid = tcaGuid;
  }

  
  /**
   * An array containing the partition keys for the port.
   **/
  public IbPortPartitionTable pkeys(List<Integer> pkeys) {
    this.pkeys = pkeys;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array containing the partition keys for the port.")
  @JsonProperty("pkeys")
  public List<Integer> getPkeys() {
    return pkeys;
  }
  
  public void setPkeys(List<Integer> pkeys) {
    this.pkeys = pkeys;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbPortPartitionTable ibPortPartitionTable = (IbPortPartitionTable) o;
    return Objects.equals(this.controllerRef, ibPortPartitionTable.controllerRef) &&
        Objects.equals(this.portNumber, ibPortPartitionTable.portNumber) &&
        Objects.equals(this.portGuid, ibPortPartitionTable.portGuid) &&
        Objects.equals(this.tcaGuid, ibPortPartitionTable.tcaGuid) &&
        Objects.equals(this.pkeys, ibPortPartitionTable.pkeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, portNumber, portGuid, tcaGuid, pkeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbPortPartitionTable {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    portNumber: ").append(toIndentedString(portNumber)).append("\n");
    sb.append("    portGuid: ").append(toIndentedString(portGuid)).append("\n");
    sb.append("    tcaGuid: ").append(toIndentedString(tcaGuid)).append("\n");
    sb.append("    pkeys: ").append(toIndentedString(pkeys)).append("\n");
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

