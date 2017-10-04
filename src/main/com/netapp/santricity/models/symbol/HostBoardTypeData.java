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
 * HostBoardTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class HostBoardTypeData   {
  

  /**
   * This enumeration object is used to indicate the type of a controller's host board.
   */
  public enum TypeEnum {
    typeUnknown("typeUnknown"),
    type4portFc("type4portFc"),
    type20portSwitchedFc("type20portSwitchedFc"),
    type1portSas("type1portSas"),
    type2portFc("type2portFc"),
    type2portIscsi("type2portIscsi"),
    type2portSas("type2portSas"),
    type2portIb("type2portIb"),
    type8portFc("type8portFc"),
    type4portIscsi("type4portIscsi"),
    type4portSas("type4portSas"),
    type4portSasGlacier("type4portSasGlacier"),
    type2portFcIscsiSamoa("type2portFcIscsiSamoa"),
    type4portFcIscsiSamoa("type4portFcIscsiSamoa"),
    type2portIscsiZion("type2portIscsiZion"),
    type2portSasAcadia("type2portSasAcadia"),
    type4portSasAcadia("type4portSasAcadia"),
    type2portIbDenali("type2portIbDenali"),
    type2portFcSamoa("type2portFcSamoa"),
    type4portFcSamoa("type4portFcSamoa"),
    type2portIscsiSamoa("type2portIscsiSamoa"),
    type4portIscsiSamoa("type4portIscsiSamoa"),
    type4portSas3("type4portSas3"),
    type2portIb100gb("type2portIb100gb"),
    type4portEthernet25gb("type4portEthernet25gb"),
    type4portFc32gb("type4portFc32gb"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TypeEnum type;

    private HostBoard2PortIbTypeData dualPortIbTypeData;

    private HostBoard2PortIbTypeData dualPortDenaliIbTypeData;

  
  /**
   * This enumeration object is used to indicate the type of a controller's host board.
   **/
  public HostBoardTypeData type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to indicate the type of a controller's host board.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Host board data for two-port InfiniBand host board. This field is only present if type is equal to HB_TYPE_2PORT_IB.
   **/
  public HostBoardTypeData dualPortIbTypeData(HostBoard2PortIbTypeData dualPortIbTypeData) {
    this.dualPortIbTypeData = dualPortIbTypeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Host board data for two-port InfiniBand host board. This field is only present if type is equal to HB_TYPE_2PORT_IB.")
  @JsonProperty("dualPortIbTypeData")
  public HostBoard2PortIbTypeData getDualPortIbTypeData() {
    return dualPortIbTypeData;
  }
  
  public void setDualPortIbTypeData(HostBoard2PortIbTypeData dualPortIbTypeData) {
    this.dualPortIbTypeData = dualPortIbTypeData;
  }

  
  /**
   * If the host board type is denali with two port infiniband, return the two port ib type data struct.
   **/
  public HostBoardTypeData dualPortDenaliIbTypeData(HostBoard2PortIbTypeData dualPortDenaliIbTypeData) {
    this.dualPortDenaliIbTypeData = dualPortDenaliIbTypeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the host board type is denali with two port infiniband, return the two port ib type data struct.")
  @JsonProperty("dualPortDenaliIbTypeData")
  public HostBoard2PortIbTypeData getDualPortDenaliIbTypeData() {
    return dualPortDenaliIbTypeData;
  }
  
  public void setDualPortDenaliIbTypeData(HostBoard2PortIbTypeData dualPortDenaliIbTypeData) {
    this.dualPortDenaliIbTypeData = dualPortDenaliIbTypeData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostBoardTypeData hostBoardTypeData = (HostBoardTypeData) o;
    return Objects.equals(this.type, hostBoardTypeData.type) &&
        Objects.equals(this.dualPortIbTypeData, hostBoardTypeData.dualPortIbTypeData) &&
        Objects.equals(this.dualPortDenaliIbTypeData, hostBoardTypeData.dualPortDenaliIbTypeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dualPortIbTypeData, dualPortDenaliIbTypeData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostBoardTypeData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dualPortIbTypeData: ").append(toIndentedString(dualPortIbTypeData)).append("\n");
    sb.append("    dualPortDenaliIbTypeData: ").append(toIndentedString(dualPortDenaliIbTypeData)).append("\n");
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

