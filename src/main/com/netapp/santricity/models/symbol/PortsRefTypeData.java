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
 * PortsRefTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PortsRefTypeData   {
  

  /**
   * This enumeration is used to specify whether the actions will be taken on ports residing on a host interface card or a base board.
   */
  public enum PortRefTypeEnum {
    unknown("unknown"),
    hic("hic"),
    baseBoard("baseBoard"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PortRefTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PortRefTypeEnum portRefType;

    private String hicRef;

    private String baseBoardRef;

  
  /**
   * This enumeration is used to specify whether the actions will be taken on ports residing on a host interface card or a base board.
   **/
  public PortsRefTypeData portRefType(PortRefTypeEnum portRefType) {
    this.portRefType = portRefType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration is used to specify whether the actions will be taken on ports residing on a host interface card or a base board.")
  @JsonProperty("portRefType")
  public PortRefTypeEnum getPortRefType() {
    return portRefType;
  }
  
  public void setPortRefType(PortRefTypeEnum portRefType) {
    this.portRefType = portRefType;
  }

  
  /**
   * Host Interface Card
   **/
  public PortsRefTypeData hicRef(String hicRef) {
    this.hicRef = hicRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Host Interface Card")
  @JsonProperty("hicRef")
  public String getHicRef() {
    return hicRef;
  }
  
  public void setHicRef(String hicRef) {
    this.hicRef = hicRef;
  }

  
  /**
   * Base Board Reference
   **/
  public PortsRefTypeData baseBoardRef(String baseBoardRef) {
    this.baseBoardRef = baseBoardRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Base Board Reference")
  @JsonProperty("baseBoardRef")
  public String getBaseBoardRef() {
    return baseBoardRef;
  }
  
  public void setBaseBoardRef(String baseBoardRef) {
    this.baseBoardRef = baseBoardRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortsRefTypeData portsRefTypeData = (PortsRefTypeData) o;
    return Objects.equals(this.portRefType, portsRefTypeData.portRefType) &&
        Objects.equals(this.hicRef, portsRefTypeData.hicRef) &&
        Objects.equals(this.baseBoardRef, portsRefTypeData.baseBoardRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portRefType, hicRef, baseBoardRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortsRefTypeData {\n");
    
    sb.append("    portRefType: ").append(toIndentedString(portRefType)).append("\n");
    sb.append("    hicRef: ").append(toIndentedString(hicRef)).append("\n");
    sb.append("    baseBoardRef: ").append(toIndentedString(baseBoardRef)).append("\n");
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

