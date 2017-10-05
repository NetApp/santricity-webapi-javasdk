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
 * SAPort
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SAPort   {
  
    private String saPortRef;

    private String saPortGroupRef;

    private String controllerRef;

    private Integer portId;

  
  /**
   * This object uniquely identifies an SAPort.
   **/
  public SAPort saPortRef(String saPortRef) {
    this.saPortRef = saPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This object uniquely identifies an SAPort.")
  @JsonProperty("saPortRef")
  public String getSaPortRef() {
    return saPortRef;
  }
  
  public void setSaPortRef(String saPortRef) {
    this.saPortRef = saPortRef;
  }

  
  /**
   * This object uniquely identifies an SAPortGroup.
   **/
  public SAPort saPortGroupRef(String saPortGroupRef) {
    this.saPortGroupRef = saPortGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This object uniquely identifies an SAPortGroup.")
  @JsonProperty("saPortGroupRef")
  public String getSaPortGroupRef() {
    return saPortGroupRef;
  }
  
  public void setSaPortGroupRef(String saPortGroupRef) {
    this.saPortGroupRef = saPortGroupRef;
  }

  
  /**
   * The reference value of the controller.
   **/
  public SAPort controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value of the controller.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * The host-side I/O port identifier of the port on the controller.
   **/
  public SAPort portId(Integer portId) {
    this.portId = portId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host-side I/O port identifier of the port on the controller.")
  @JsonProperty("portId")
  public Integer getPortId() {
    return portId;
  }
  
  public void setPortId(Integer portId) {
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
    SAPort sAPort = (SAPort) o;
    return Objects.equals(this.saPortRef, sAPort.saPortRef) &&
        Objects.equals(this.saPortGroupRef, sAPort.saPortGroupRef) &&
        Objects.equals(this.controllerRef, sAPort.controllerRef) &&
        Objects.equals(this.portId, sAPort.portId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saPortRef, saPortGroupRef, controllerRef, portId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAPort {\n");
    
    sb.append("    saPortRef: ").append(toIndentedString(saPortRef)).append("\n");
    sb.append("    saPortGroupRef: ").append(toIndentedString(saPortGroupRef)).append("\n");
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
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

