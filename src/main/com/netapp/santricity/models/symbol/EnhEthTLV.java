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
 * EnhEthTLV
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class EnhEthTLV   {
  

  /**
   * An enumeration that includes Time Length Value (TLV)Types for Enhanced Ethernet. Refer to the IEEE Std 802.1AB-2005
   */
  public enum EnhEthTLVTypeEnum {
    unknown("unknown"),
    chassisid("chassisid"),
    portid("portid"),
    timetolive("timetolive"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    EnhEthTLVTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private EnhEthTLVTypeEnum enhEthTLVType;

    private ChassisIDTLV chassisIDTLV;

    private PortIDTLV portIDTLV;

    private TimeToLiveTLV timeToLiveTLV;

  
  /**
   * An enumeration that includes Time Length Value (TLV)Types for Enhanced Ethernet. Refer to the IEEE Std 802.1AB-2005
   **/
  public EnhEthTLV enhEthTLVType(EnhEthTLVTypeEnum enhEthTLVType) {
    this.enhEthTLVType = enhEthTLVType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An enumeration that includes Time Length Value (TLV)Types for Enhanced Ethernet. Refer to the IEEE Std 802.1AB-2005")
  @JsonProperty("enhEthTLVType")
  public EnhEthTLVTypeEnum getEnhEthTLVType() {
    return enhEthTLVType;
  }
  
  public void setEnhEthTLVType(EnhEthTLVTypeEnum enhEthTLVType) {
    this.enhEthTLVType = enhEthTLVType;
  }

  
  /**
   * This field is mandatory and conveys its information when the enhEthTLVType is equal to ENH_ETH_TLV_CHASSISID.
   **/
  public EnhEthTLV chassisIDTLV(ChassisIDTLV chassisIDTLV) {
    this.chassisIDTLV = chassisIDTLV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is mandatory and conveys its information when the enhEthTLVType is equal to ENH_ETH_TLV_CHASSISID.")
  @JsonProperty("chassisIDTLV")
  public ChassisIDTLV getChassisIDTLV() {
    return chassisIDTLV;
  }
  
  public void setChassisIDTLV(ChassisIDTLV chassisIDTLV) {
    this.chassisIDTLV = chassisIDTLV;
  }

  
  /**
   * This field is mandatory and conveys its information when the enhEthTLVType is equal to ENH_ETH_TLV_PORTID.
   **/
  public EnhEthTLV portIDTLV(PortIDTLV portIDTLV) {
    this.portIDTLV = portIDTLV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is mandatory and conveys its information when the enhEthTLVType is equal to ENH_ETH_TLV_PORTID.")
  @JsonProperty("portIDTLV")
  public PortIDTLV getPortIDTLV() {
    return portIDTLV;
  }
  
  public void setPortIDTLV(PortIDTLV portIDTLV) {
    this.portIDTLV = portIDTLV;
  }

  
  /**
   * This field is mandatory and conveys its information when the enhEthTLVType is equal to ENH_ETH_TLV_TIMETOLIVE.
   **/
  public EnhEthTLV timeToLiveTLV(TimeToLiveTLV timeToLiveTLV) {
    this.timeToLiveTLV = timeToLiveTLV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is mandatory and conveys its information when the enhEthTLVType is equal to ENH_ETH_TLV_TIMETOLIVE.")
  @JsonProperty("timeToLiveTLV")
  public TimeToLiveTLV getTimeToLiveTLV() {
    return timeToLiveTLV;
  }
  
  public void setTimeToLiveTLV(TimeToLiveTLV timeToLiveTLV) {
    this.timeToLiveTLV = timeToLiveTLV;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhEthTLV enhEthTLV = (EnhEthTLV) o;
    return Objects.equals(this.enhEthTLVType, enhEthTLV.enhEthTLVType) &&
        Objects.equals(this.chassisIDTLV, enhEthTLV.chassisIDTLV) &&
        Objects.equals(this.portIDTLV, enhEthTLV.portIDTLV) &&
        Objects.equals(this.timeToLiveTLV, enhEthTLV.timeToLiveTLV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhEthTLVType, chassisIDTLV, portIDTLV, timeToLiveTLV);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhEthTLV {\n");
    
    sb.append("    enhEthTLVType: ").append(toIndentedString(enhEthTLVType)).append("\n");
    sb.append("    chassisIDTLV: ").append(toIndentedString(chassisIDTLV)).append("\n");
    sb.append("    portIDTLV: ").append(toIndentedString(portIDTLV)).append("\n");
    sb.append("    timeToLiveTLV: ").append(toIndentedString(timeToLiveTLV)).append("\n");
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

