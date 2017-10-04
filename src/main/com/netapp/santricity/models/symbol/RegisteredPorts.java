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
 * RegisteredPorts
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class RegisteredPorts   {
  
    private Boolean portA0;

    private Boolean portA1;

    private Boolean portB0;

    private Boolean portB1;

  
  /**
   **/
  public RegisteredPorts portA0(Boolean portA0) {
    this.portA0 = portA0;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("portA0")
  public Boolean getPortA0() {
    return portA0;
  }
  
  public void setPortA0(Boolean portA0) {
    this.portA0 = portA0;
  }

  
  /**
   **/
  public RegisteredPorts portA1(Boolean portA1) {
    this.portA1 = portA1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("portA1")
  public Boolean getPortA1() {
    return portA1;
  }
  
  public void setPortA1(Boolean portA1) {
    this.portA1 = portA1;
  }

  
  /**
   **/
  public RegisteredPorts portB0(Boolean portB0) {
    this.portB0 = portB0;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("portB0")
  public Boolean getPortB0() {
    return portB0;
  }
  
  public void setPortB0(Boolean portB0) {
    this.portB0 = portB0;
  }

  
  /**
   **/
  public RegisteredPorts portB1(Boolean portB1) {
    this.portB1 = portB1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("portB1")
  public Boolean getPortB1() {
    return portB1;
  }
  
  public void setPortB1(Boolean portB1) {
    this.portB1 = portB1;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisteredPorts registeredPorts = (RegisteredPorts) o;
    return Objects.equals(this.portA0, registeredPorts.portA0) &&
        Objects.equals(this.portA1, registeredPorts.portA1) &&
        Objects.equals(this.portB0, registeredPorts.portB0) &&
        Objects.equals(this.portB1, registeredPorts.portB1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portA0, portA1, portB0, portB1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredPorts {\n");
    
    sb.append("    portA0: ").append(toIndentedString(portA0)).append("\n");
    sb.append("    portA1: ").append(toIndentedString(portA1)).append("\n");
    sb.append("    portB0: ").append(toIndentedString(portB0)).append("\n");
    sb.append("    portB1: ").append(toIndentedString(portB1)).append("\n");
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

