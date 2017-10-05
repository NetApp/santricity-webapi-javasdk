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
 * ChassisIDTLV
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ChassisIDTLV   {
  

  /**
   * This field contains the ID for the subtype.
   */
  public enum SubtypeEnum {
    unk("unk"),
    component("component"),
    intfAlias("intfAlias"),
    portComp("portComp"),
    macAddr("macAddr"),
    ntwkAddr("ntwkAddr"),
    intfName("intfName"),
    local("local"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SubtypeEnum subtype;

    private String chassisID;

  
  /**
   * This field contains the ID for the subtype.
   **/
  public ChassisIDTLV subtype(SubtypeEnum subtype) {
    this.subtype = subtype;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the ID for the subtype.")
  @JsonProperty("subtype")
  public SubtypeEnum getSubtype() {
    return subtype;
  }
  
  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }

  
  /**
   * This field contains an octet string indicating the specific identifier for the chassis.
   **/
  public ChassisIDTLV chassisID(String chassisID) {
    this.chassisID = chassisID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains an octet string indicating the specific identifier for the chassis.")
  @JsonProperty("chassisID")
  public String getChassisID() {
    return chassisID;
  }
  
  public void setChassisID(String chassisID) {
    this.chassisID = chassisID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChassisIDTLV chassisIDTLV = (ChassisIDTLV) o;
    return Objects.equals(this.subtype, chassisIDTLV.subtype) &&
        Objects.equals(this.chassisID, chassisIDTLV.chassisID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subtype, chassisID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChassisIDTLV {\n");
    
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    chassisID: ").append(toIndentedString(chassisID)).append("\n");
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

