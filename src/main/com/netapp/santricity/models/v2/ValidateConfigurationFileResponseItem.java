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


package com.netapp.santricity.models.v2;

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
 * This object contains the results of a spread sheet parse to allow the user to test without configuring systems
 */
@ApiModel(description = "This object contains the results of a spread sheet parse to allow the user to test without configuring systems")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class ValidateConfigurationFileResponseItem   {
  
    private Integer row;


  /**
   * The configuration item type
   */
  public enum TypeEnum {
    systemSerialNumber("systemSerialNumber"),
    controllerAPort1IP4("controllerAPort1IP4"),
    controllerAPort2IP4("controllerAPort2IP4"),
    controllerBPort1IP4("controllerBPort1IP4"),
    controllerBPort2IP4("controllerBPort2IP4"),
    controllerAPort1IP6("controllerAPort1IP6"),
    controllerAPort2IP6("controllerAPort2IP6"),
    controllerBPort1IP6("controllerBPort1IP6"),
    controllerBPort2IP6("controllerBPort2IP6"),
    controllerAPort1Netmask4("controllerAPort1Netmask4"),
    controllerAPort2Netmask4("controllerAPort2Netmask4"),
    controllerBPort1Netmask4("controllerBPort1Netmask4"),
    controllerBPort2Netmask4("controllerBPort2Netmask4"),
    controllerAPort1Netmask6("controllerAPort1Netmask6"),
    controllerAPort2Netmask6("controllerAPort2Netmask6"),
    controllerBPort1Netmask6("controllerBPort1Netmask6"),
    controllerBPort2Netmask6("controllerBPort2Netmask6"),
    controllerAIPv4GW("controllerAIPv4GW"),
    controllerAIPv6GW("controllerAIPv6GW"),
    controllerBIPv4GW("controllerBIPv4GW"),
    controllerBIPv6GW("controllerBIPv6GW"),
    systemLabel("systemLabel"),
    saPassword("saPassword"),
    systemKey("systemKey"),
    metaData("metaData");
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

    private String value;

  
  /**
   * The 1 based row identifier.  Row 0 is the header row and is not returned
   **/
  public ValidateConfigurationFileResponseItem row(Integer row) {
    this.row = row;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The 1 based row identifier.  Row 0 is the header row and is not returned")
  @JsonProperty("row")
  public Integer getRow() {
    return row;
  }
  
  public void setRow(Integer row) {
    this.row = row;
  }

  
  /**
   * The configuration item type
   **/
  public ValidateConfigurationFileResponseItem type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration item type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The data found for the row
   **/
  public ValidateConfigurationFileResponseItem value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data found for the row")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateConfigurationFileResponseItem validateConfigurationFileResponseItem = (ValidateConfigurationFileResponseItem) o;
    return Objects.equals(this.row, validateConfigurationFileResponseItem.row) &&
        Objects.equals(this.type, validateConfigurationFileResponseItem.type) &&
        Objects.equals(this.value, validateConfigurationFileResponseItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateConfigurationFileResponseItem {\n");
    
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

