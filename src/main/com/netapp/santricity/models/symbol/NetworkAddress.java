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
 * NetworkAddress
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class NetworkAddress   {
  

  /**
   * This enum defines the possible network address types.
   */
  public enum AddrTypeEnum {
    none("none"),
    domainName("domainName"),
    ipvx("ipvx"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    AddrTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AddrTypeEnum addrType;

    private String domainName;

    private IpVxAddress ipvxAddress;

  
  /**
   * This enum defines the possible network address types.
   **/
  public NetworkAddress addrType(AddrTypeEnum addrType) {
    this.addrType = addrType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enum defines the possible network address types.")
  @JsonProperty("addrType")
  public AddrTypeEnum getAddrType() {
    return addrType;
  }
  
  public void setAddrType(AddrTypeEnum addrType) {
    this.addrType = addrType;
  }

  
  /**
   * Fully qualified domain name. This should be considered an IDN-unaware domain name slot as per RFC3490.
   **/
  public NetworkAddress domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fully qualified domain name. This should be considered an IDN-unaware domain name slot as per RFC3490.")
  @JsonProperty("domainName")
  public String getDomainName() {
    return domainName;
  }
  
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  
  /**
   * IPv4 or IPv6 address
   **/
  public NetworkAddress ipvxAddress(IpVxAddress ipvxAddress) {
    this.ipvxAddress = ipvxAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IPv4 or IPv6 address")
  @JsonProperty("ipvxAddress")
  public IpVxAddress getIpvxAddress() {
    return ipvxAddress;
  }
  
  public void setIpvxAddress(IpVxAddress ipvxAddress) {
    this.ipvxAddress = ipvxAddress;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkAddress networkAddress = (NetworkAddress) o;
    return Objects.equals(this.addrType, networkAddress.addrType) &&
        Objects.equals(this.domainName, networkAddress.domainName) &&
        Objects.equals(this.ipvxAddress, networkAddress.ipvxAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrType, domainName, ipvxAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkAddress {\n");
    
    sb.append("    addrType: ").append(toIndentedString(addrType)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    ipvxAddress: ").append(toIndentedString(ipvxAddress)).append("\n");
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

