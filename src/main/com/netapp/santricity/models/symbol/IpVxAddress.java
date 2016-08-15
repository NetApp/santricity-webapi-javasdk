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
 * IpVxAddress
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IpVxAddress   {
  

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

    private String ipv4Address;

    private String ipv6Address;

  
  /**
   * This enumeration defines the different types of IP addresses, corresponding to different versions of the Internet protocol.
   **/
  public IpVxAddress addressType(AddressTypeEnum addressType) {
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
   * An IP address formatted according to version 4 of the Internet protocol. This field is only present if addressType is equal to IPV4.
   **/
  public IpVxAddress ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An IP address formatted according to version 4 of the Internet protocol. This field is only present if addressType is equal to IPV4.")
  @JsonProperty("ipv4Address")
  public String getIpv4Address() {
    return ipv4Address;
  }
  
  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  
  /**
   * An IP address formatted according to version 6 of the Internet protocol. This field is only present if addressType is equal to IPV6.
   **/
  public IpVxAddress ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An IP address formatted according to version 6 of the Internet protocol. This field is only present if addressType is equal to IPV6.")
  @JsonProperty("ipv6Address")
  public String getIpv6Address() {
    return ipv6Address;
  }
  
  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpVxAddress ipVxAddress = (IpVxAddress) o;
    return Objects.equals(this.addressType, ipVxAddress.addressType) &&
        Objects.equals(this.ipv4Address, ipVxAddress.ipv4Address) &&
        Objects.equals(this.ipv6Address, ipVxAddress.ipv6Address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, ipv4Address, ipv6Address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpVxAddress {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
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

