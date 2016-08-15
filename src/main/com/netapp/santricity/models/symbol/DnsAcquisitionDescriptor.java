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
 * DnsAcquisitionDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DnsAcquisitionDescriptor   {
  

  /**
   * How the DNS addresses were acquired.
   */
  public enum DnsAcquisitionTypeEnum {
    unknown("unknown"),
    stat("stat"),
    dhcp("dhcp"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DnsAcquisitionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DnsAcquisitionTypeEnum dnsAcquisitionType;

    private List<IpVxAddress> dnsServers;

  
  /**
   * How the DNS addresses were acquired.
   **/
  public DnsAcquisitionDescriptor dnsAcquisitionType(DnsAcquisitionTypeEnum dnsAcquisitionType) {
    this.dnsAcquisitionType = dnsAcquisitionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "How the DNS addresses were acquired.")
  @JsonProperty("dnsAcquisitionType")
  public DnsAcquisitionTypeEnum getDnsAcquisitionType() {
    return dnsAcquisitionType;
  }
  
  public void setDnsAcquisitionType(DnsAcquisitionTypeEnum dnsAcquisitionType) {
    this.dnsAcquisitionType = dnsAcquisitionType;
  }

  
  /**
   * This field is used if the method is set to DNS_ACQUISITION_METHOD_STATIC. If more than one address is specified, the first (lowest index) item is given highest precedence and the last item (highest index) is given the lowest precedence.
   **/
  public DnsAcquisitionDescriptor dnsServers(List<IpVxAddress> dnsServers) {
    this.dnsServers = dnsServers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is used if the method is set to DNS_ACQUISITION_METHOD_STATIC. If more than one address is specified, the first (lowest index) item is given highest precedence and the last item (highest index) is given the lowest precedence.")
  @JsonProperty("dnsServers")
  public List<IpVxAddress> getDnsServers() {
    return dnsServers;
  }
  
  public void setDnsServers(List<IpVxAddress> dnsServers) {
    this.dnsServers = dnsServers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsAcquisitionDescriptor dnsAcquisitionDescriptor = (DnsAcquisitionDescriptor) o;
    return Objects.equals(this.dnsAcquisitionType, dnsAcquisitionDescriptor.dnsAcquisitionType) &&
        Objects.equals(this.dnsServers, dnsAcquisitionDescriptor.dnsServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsAcquisitionType, dnsServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsAcquisitionDescriptor {\n");
    
    sb.append("    dnsAcquisitionType: ").append(toIndentedString(dnsAcquisitionType)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
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

