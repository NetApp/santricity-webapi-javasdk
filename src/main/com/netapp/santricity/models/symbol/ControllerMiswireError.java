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
 * ControllerMiswireError
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ControllerMiswireError   {
  
    private String portRefA;

    private String portRefB;

    private List<String> portRefs;

  
  /**
   * A reference to one of the drive channel ports involved in a controller miswire.
   **/
  public ControllerMiswireError portRefA(String portRefA) {
    this.portRefA = portRefA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to one of the drive channel ports involved in a controller miswire.")
  @JsonProperty("portRefA")
  public String getPortRefA() {
    return portRefA;
  }
  
  public void setPortRefA(String portRefA) {
    this.portRefA = portRefA;
  }

  
  /**
   * A reference to one of the drive channel ports involved in a controller miswire.
   **/
  public ControllerMiswireError portRefB(String portRefB) {
    this.portRefB = portRefB;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to one of the drive channel ports involved in a controller miswire.")
  @JsonProperty("portRefB")
  public String getPortRefB() {
    return portRefB;
  }
  
  public void setPortRefB(String portRefB) {
    this.portRefB = portRefB;
  }

  
  /**
   * The two drive channel ports on one controller that are participating in the miswire condition.
   **/
  public ControllerMiswireError portRefs(List<String> portRefs) {
    this.portRefs = portRefs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The two drive channel ports on one controller that are participating in the miswire condition.")
  @JsonProperty("portRefs")
  public List<String> getPortRefs() {
    return portRefs;
  }
  
  public void setPortRefs(List<String> portRefs) {
    this.portRefs = portRefs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerMiswireError controllerMiswireError = (ControllerMiswireError) o;
    return Objects.equals(this.portRefA, controllerMiswireError.portRefA) &&
        Objects.equals(this.portRefB, controllerMiswireError.portRefB) &&
        Objects.equals(this.portRefs, controllerMiswireError.portRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portRefA, portRefB, portRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerMiswireError {\n");
    
    sb.append("    portRefA: ").append(toIndentedString(portRefA)).append("\n");
    sb.append("    portRefB: ").append(toIndentedString(portRefB)).append("\n");
    sb.append("    portRefs: ").append(toIndentedString(portRefs)).append("\n");
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

