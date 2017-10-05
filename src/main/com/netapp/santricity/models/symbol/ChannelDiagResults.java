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
 * ChannelDiagResults
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ChannelDiagResults   {
  

  /**
   * This enumeration identifies the different types of drive channel fault isolation diagnostic tests.
   */
  public enum TypeEnum {
    verify("verify"),
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

    private List<ChannelDiagWrRdVfyResults> writeReadVerifyData;

  
  /**
   * This enumeration identifies the different types of drive channel fault isolation diagnostic tests.
   **/
  public ChannelDiagResults type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration identifies the different types of drive channel fault isolation diagnostic tests.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The result data for the Write-Read-Verify channel diagnostic test as a variable-length array, one element per selected device. This field is only valid if type is equal to CHANNEL_DIAG_WRITE_READ_VERIFY.
   **/
  public ChannelDiagResults writeReadVerifyData(List<ChannelDiagWrRdVfyResults> writeReadVerifyData) {
    this.writeReadVerifyData = writeReadVerifyData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result data for the Write-Read-Verify channel diagnostic test as a variable-length array, one element per selected device. This field is only valid if type is equal to CHANNEL_DIAG_WRITE_READ_VERIFY.")
  @JsonProperty("writeReadVerifyData")
  public List<ChannelDiagWrRdVfyResults> getWriteReadVerifyData() {
    return writeReadVerifyData;
  }
  
  public void setWriteReadVerifyData(List<ChannelDiagWrRdVfyResults> writeReadVerifyData) {
    this.writeReadVerifyData = writeReadVerifyData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDiagResults channelDiagResults = (ChannelDiagResults) o;
    return Objects.equals(this.type, channelDiagResults.type) &&
        Objects.equals(this.writeReadVerifyData, channelDiagResults.writeReadVerifyData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, writeReadVerifyData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDiagResults {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    writeReadVerifyData: ").append(toIndentedString(writeReadVerifyData)).append("\n");
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

