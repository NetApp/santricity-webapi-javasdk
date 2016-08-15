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
 * InterposerTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class InterposerTypeData   {
  

  /**
   * This enumeration defines the different interposer types.
   */
  public enum InterposerTypeEnum {
    unknown("unknown"),
    fcToSas("fcToSas"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    InterposerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private InterposerTypeEnum interposerType;

    private InterposerData fcSasInterposer;

    private String reserved;

  
  /**
   * This enumeration defines the different interposer types.
   **/
  public InterposerTypeData interposerType(InterposerTypeEnum interposerType) {
    this.interposerType = interposerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration defines the different interposer types.")
  @JsonProperty("interposerType")
  public InterposerTypeEnum getInterposerType() {
    return interposerType;
  }
  
  public void setInterposerType(InterposerTypeEnum interposerType) {
    this.interposerType = interposerType;
  }

  
  /**
   * This field is available when the interfaceTypeData is equal to INTERPOSER_TYPE_FC_TO_SAS
   **/
  public InterposerTypeData fcSasInterposer(InterposerData fcSasInterposer) {
    this.fcSasInterposer = fcSasInterposer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is available when the interfaceTypeData is equal to INTERPOSER_TYPE_FC_TO_SAS")
  @JsonProperty("fcSasInterposer")
  public InterposerData getFcSasInterposer() {
    return fcSasInterposer;
  }
  
  public void setFcSasInterposer(InterposerData fcSasInterposer) {
    this.fcSasInterposer = fcSasInterposer;
  }

  
  /**
   * Reserved.
   **/
  public InterposerTypeData reserved(String reserved) {
    this.reserved = reserved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved.")
  @JsonProperty("reserved")
  public String getReserved() {
    return reserved;
  }
  
  public void setReserved(String reserved) {
    this.reserved = reserved;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterposerTypeData interposerTypeData = (InterposerTypeData) o;
    return Objects.equals(this.interposerType, interposerTypeData.interposerType) &&
        Objects.equals(this.fcSasInterposer, interposerTypeData.fcSasInterposer) &&
        Objects.equals(this.reserved, interposerTypeData.reserved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interposerType, fcSasInterposer, reserved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterposerTypeData {\n");
    
    sb.append("    interposerType: ").append(toIndentedString(interposerType)).append("\n");
    sb.append("    fcSasInterposer: ").append(toIndentedString(fcSasInterposer)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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

