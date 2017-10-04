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
 * ControllerNetworkSettings
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ControllerNetworkSettings   {
  
    private String ipv4DefaultRouterAddress;

    private IpV6AddressData ipv6DefaultRouterAddress;

    private List<IpV6AddressData> ipv6CandidateDefaultRouterAddresses;

    private Boolean remoteAccessEnabled;

    private ControllerDNSProperties dnsProperties;

    private ControllerNTPProperties ntpProperties;

  
  /**
   * The IPV4 static default router address for the controller (sometimes referred to as the \"gateway address\").
   **/
  public ControllerNetworkSettings ipv4DefaultRouterAddress(String ipv4DefaultRouterAddress) {
    this.ipv4DefaultRouterAddress = ipv4DefaultRouterAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV4 static default router address for the controller (sometimes referred to as the \"gateway address\").")
  @JsonProperty("ipv4DefaultRouterAddress")
  public String getIpv4DefaultRouterAddress() {
    return ipv4DefaultRouterAddress;
  }
  
  public void setIpv4DefaultRouterAddress(String ipv4DefaultRouterAddress) {
    this.ipv4DefaultRouterAddress = ipv4DefaultRouterAddress;
  }

  
  /**
   * The IPV6 static default router address and associated data for the controller.
   **/
  public ControllerNetworkSettings ipv6DefaultRouterAddress(IpV6AddressData ipv6DefaultRouterAddress) {
    this.ipv6DefaultRouterAddress = ipv6DefaultRouterAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IPV6 static default router address and associated data for the controller.")
  @JsonProperty("ipv6DefaultRouterAddress")
  public IpV6AddressData getIpv6DefaultRouterAddress() {
    return ipv6DefaultRouterAddress;
  }
  
  public void setIpv6DefaultRouterAddress(IpV6AddressData ipv6DefaultRouterAddress) {
    this.ipv6DefaultRouterAddress = ipv6DefaultRouterAddress;
  }

  
  /**
   * The set of IPV6 candidate default router addresses for the controller.
   **/
  public ControllerNetworkSettings ipv6CandidateDefaultRouterAddresses(List<IpV6AddressData> ipv6CandidateDefaultRouterAddresses) {
    this.ipv6CandidateDefaultRouterAddresses = ipv6CandidateDefaultRouterAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of IPV6 candidate default router addresses for the controller.")
  @JsonProperty("ipv6CandidateDefaultRouterAddresses")
  public List<IpV6AddressData> getIpv6CandidateDefaultRouterAddresses() {
    return ipv6CandidateDefaultRouterAddresses;
  }
  
  public void setIpv6CandidateDefaultRouterAddresses(List<IpV6AddressData> ipv6CandidateDefaultRouterAddresses) {
    this.ipv6CandidateDefaultRouterAddresses = ipv6CandidateDefaultRouterAddresses;
  }

  
  /**
   * True if enabled for remote access
   **/
  public ControllerNetworkSettings remoteAccessEnabled(Boolean remoteAccessEnabled) {
    this.remoteAccessEnabled = remoteAccessEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if enabled for remote access")
  @JsonProperty("remoteAccessEnabled")
  public Boolean getRemoteAccessEnabled() {
    return remoteAccessEnabled;
  }
  
  public void setRemoteAccessEnabled(Boolean remoteAccessEnabled) {
    this.remoteAccessEnabled = remoteAccessEnabled;
  }

  
  /**
   * DNS configuration information.
   **/
  public ControllerNetworkSettings dnsProperties(ControllerDNSProperties dnsProperties) {
    this.dnsProperties = dnsProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "DNS configuration information.")
  @JsonProperty("dnsProperties")
  public ControllerDNSProperties getDnsProperties() {
    return dnsProperties;
  }
  
  public void setDnsProperties(ControllerDNSProperties dnsProperties) {
    this.dnsProperties = dnsProperties;
  }

  
  /**
   * NTP configuration information.
   **/
  public ControllerNetworkSettings ntpProperties(ControllerNTPProperties ntpProperties) {
    this.ntpProperties = ntpProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "NTP configuration information.")
  @JsonProperty("ntpProperties")
  public ControllerNTPProperties getNtpProperties() {
    return ntpProperties;
  }
  
  public void setNtpProperties(ControllerNTPProperties ntpProperties) {
    this.ntpProperties = ntpProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerNetworkSettings controllerNetworkSettings = (ControllerNetworkSettings) o;
    return Objects.equals(this.ipv4DefaultRouterAddress, controllerNetworkSettings.ipv4DefaultRouterAddress) &&
        Objects.equals(this.ipv6DefaultRouterAddress, controllerNetworkSettings.ipv6DefaultRouterAddress) &&
        Objects.equals(this.ipv6CandidateDefaultRouterAddresses, controllerNetworkSettings.ipv6CandidateDefaultRouterAddresses) &&
        Objects.equals(this.remoteAccessEnabled, controllerNetworkSettings.remoteAccessEnabled) &&
        Objects.equals(this.dnsProperties, controllerNetworkSettings.dnsProperties) &&
        Objects.equals(this.ntpProperties, controllerNetworkSettings.ntpProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4DefaultRouterAddress, ipv6DefaultRouterAddress, ipv6CandidateDefaultRouterAddresses, remoteAccessEnabled, dnsProperties, ntpProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerNetworkSettings {\n");
    
    sb.append("    ipv4DefaultRouterAddress: ").append(toIndentedString(ipv4DefaultRouterAddress)).append("\n");
    sb.append("    ipv6DefaultRouterAddress: ").append(toIndentedString(ipv6DefaultRouterAddress)).append("\n");
    sb.append("    ipv6CandidateDefaultRouterAddresses: ").append(toIndentedString(ipv6CandidateDefaultRouterAddresses)).append("\n");
    sb.append("    remoteAccessEnabled: ").append(toIndentedString(remoteAccessEnabled)).append("\n");
    sb.append("    dnsProperties: ").append(toIndentedString(dnsProperties)).append("\n");
    sb.append("    ntpProperties: ").append(toIndentedString(ntpProperties)).append("\n");
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

