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
 * Registrant
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class Registrant   {
  
    private String hostPortRef;

    private String hostPortName;


  /**
   * Host port reserved for this target.
   */
  public enum ReservedPortEnum {
    none("none"),
    all("all"),
    a0("a0"),
    a1("a1"),
    b0("b0"),
    b1("b1"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ReservedPortEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ReservedPortEnum reservedPort;

    private RegisteredPorts registeredPorts;

  
  /**
   * The associated host port if mapped.
   **/
  public Registrant hostPortRef(String hostPortRef) {
    this.hostPortRef = hostPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The associated host port if mapped.")
  @JsonProperty("hostPortRef")
  public String getHostPortRef() {
    return hostPortRef;
  }
  
  public void setHostPortRef(String hostPortRef) {
    this.hostPortRef = hostPortRef;
  }

  
  /**
   * The host port name if not mapped.
   **/
  public Registrant hostPortName(String hostPortName) {
    this.hostPortName = hostPortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host port name if not mapped.")
  @JsonProperty("hostPortName")
  public String getHostPortName() {
    return hostPortName;
  }
  
  public void setHostPortName(String hostPortName) {
    this.hostPortName = hostPortName;
  }

  
  /**
   * Host port reserved for this target.
   **/
  public Registrant reservedPort(ReservedPortEnum reservedPort) {
    this.reservedPort = reservedPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Host port reserved for this target.")
  @JsonProperty("reservedPort")
  public ReservedPortEnum getReservedPort() {
    return reservedPort;
  }
  
  public void setReservedPort(ReservedPortEnum reservedPort) {
    this.reservedPort = reservedPort;
  }

  
  /**
   * Host port registered with these targets.
   **/
  public Registrant registeredPorts(RegisteredPorts registeredPorts) {
    this.registeredPorts = registeredPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Host port registered with these targets.")
  @JsonProperty("registeredPorts")
  public RegisteredPorts getRegisteredPorts() {
    return registeredPorts;
  }
  
  public void setRegisteredPorts(RegisteredPorts registeredPorts) {
    this.registeredPorts = registeredPorts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registrant registrant = (Registrant) o;
    return Objects.equals(this.hostPortRef, registrant.hostPortRef) &&
        Objects.equals(this.hostPortName, registrant.hostPortName) &&
        Objects.equals(this.reservedPort, registrant.reservedPort) &&
        Objects.equals(this.registeredPorts, registrant.registeredPorts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostPortRef, hostPortName, reservedPort, registeredPorts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registrant {\n");
    
    sb.append("    hostPortRef: ").append(toIndentedString(hostPortRef)).append("\n");
    sb.append("    hostPortName: ").append(toIndentedString(hostPortName)).append("\n");
    sb.append("    reservedPort: ").append(toIndentedString(reservedPort)).append("\n");
    sb.append("    registeredPorts: ").append(toIndentedString(registeredPorts)).append("\n");
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

