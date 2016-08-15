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
 * ControllerDNSProperties
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ControllerDNSProperties   {
  
    private DnsAcquisitionDescriptor acquisitionProperties;

    private List<IpVxAddress> dhcpAcquiredDnsServers;

  
  /**
   * DNS server acquisition properties
   **/
  public ControllerDNSProperties acquisitionProperties(DnsAcquisitionDescriptor acquisitionProperties) {
    this.acquisitionProperties = acquisitionProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "DNS server acquisition properties")
  @JsonProperty("acquisitionProperties")
  public DnsAcquisitionDescriptor getAcquisitionProperties() {
    return acquisitionProperties;
  }
  
  public void setAcquisitionProperties(DnsAcquisitionDescriptor acquisitionProperties) {
    this.acquisitionProperties = acquisitionProperties;
  }

  
  /**
   * DNS servers provided by the DHCP responses. Will be non-empty only if at least one of the Controller's network ports is set to acquire its address via DHCP and the DHCP response included one or more DNS servers to use. The presence of these servers does not imply their use. These DNS servers will only be used if the acquisition type is set to DHCP.
   **/
  public ControllerDNSProperties dhcpAcquiredDnsServers(List<IpVxAddress> dhcpAcquiredDnsServers) {
    this.dhcpAcquiredDnsServers = dhcpAcquiredDnsServers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "DNS servers provided by the DHCP responses. Will be non-empty only if at least one of the Controller's network ports is set to acquire its address via DHCP and the DHCP response included one or more DNS servers to use. The presence of these servers does not imply their use. These DNS servers will only be used if the acquisition type is set to DHCP.")
  @JsonProperty("dhcpAcquiredDnsServers")
  public List<IpVxAddress> getDhcpAcquiredDnsServers() {
    return dhcpAcquiredDnsServers;
  }
  
  public void setDhcpAcquiredDnsServers(List<IpVxAddress> dhcpAcquiredDnsServers) {
    this.dhcpAcquiredDnsServers = dhcpAcquiredDnsServers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerDNSProperties controllerDNSProperties = (ControllerDNSProperties) o;
    return Objects.equals(this.acquisitionProperties, controllerDNSProperties.acquisitionProperties) &&
        Objects.equals(this.dhcpAcquiredDnsServers, controllerDNSProperties.dhcpAcquiredDnsServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquisitionProperties, dhcpAcquiredDnsServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerDNSProperties {\n");
    
    sb.append("    acquisitionProperties: ").append(toIndentedString(acquisitionProperties)).append("\n");
    sb.append("    dhcpAcquiredDnsServers: ").append(toIndentedString(dhcpAcquiredDnsServers)).append("\n");
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

