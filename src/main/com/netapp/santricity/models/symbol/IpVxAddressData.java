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
 * IpVxAddressData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IpVxAddressData   {
  

  /**
   * This enumeration defines the different types of IP addresses, corresponding to different versions of the Internet protocol.
   */
  public enum AddressTypeEnum {
    ipv4("ipv4"),
    ipv6("ipv6"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AddressTypeEnum addressType;

    private IpV4AddressData ipv4Data;

    private IpV6AddressData ipv6Data;

  
  /**
   * This enumeration defines the different types of IP addresses, corresponding to different versions of the Internet protocol.
   **/
  public IpVxAddressData addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration defines the different types of IP addresses, corresponding to different versions of the Internet protocol.")
  @JsonProperty("addressType")
  public AddressTypeEnum getAddressType() {
    return addressType;
  }
  
  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  
  /**
   * Contains the various IPV4 address elements.
   **/
  public IpVxAddressData ipv4Data(IpV4AddressData ipv4Data) {
    this.ipv4Data = ipv4Data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains the various IPV4 address elements.")
  @JsonProperty("ipv4Data")
  public IpV4AddressData getIpv4Data() {
    return ipv4Data;
  }
  
  public void setIpv4Data(IpV4AddressData ipv4Data) {
    this.ipv4Data = ipv4Data;
  }

  
  /**
   * contains the various IPV6 address elements.
   **/
  public IpVxAddressData ipv6Data(IpV6AddressData ipv6Data) {
    this.ipv6Data = ipv6Data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "contains the various IPV6 address elements.")
  @JsonProperty("ipv6Data")
  public IpV6AddressData getIpv6Data() {
    return ipv6Data;
  }
  
  public void setIpv6Data(IpV6AddressData ipv6Data) {
    this.ipv6Data = ipv6Data;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpVxAddressData ipVxAddressData = (IpVxAddressData) o;
    return Objects.equals(this.addressType, ipVxAddressData.addressType) &&
        Objects.equals(this.ipv4Data, ipVxAddressData.ipv4Data) &&
        Objects.equals(this.ipv6Data, ipVxAddressData.ipv6Data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, ipv4Data, ipv6Data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpVxAddressData {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    ipv4Data: ").append(toIndentedString(ipv4Data)).append("\n");
    sb.append("    ipv6Data: ").append(toIndentedString(ipv6Data)).append("\n");
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

