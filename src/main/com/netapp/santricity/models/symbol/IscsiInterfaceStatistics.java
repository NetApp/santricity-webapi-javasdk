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
 * IscsiInterfaceStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IscsiInterfaceStatistics   {
  
    private List<EthernetPortStatistics> ethernetPortStats;

    private List<TcpStatisticalData> tcpStats;

    private List<IpEndpointStatistics> ipStats;

    private List<EnhancedEthernetStatistics> enhStats;

  
  /**
   * Statistics related to the physical Ethernet port.
   **/
  public IscsiInterfaceStatistics ethernetPortStats(List<EthernetPortStatistics> ethernetPortStats) {
    this.ethernetPortStats = ethernetPortStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Statistics related to the physical Ethernet port.")
  @JsonProperty("ethernetPortStats")
  public List<EthernetPortStatistics> getEthernetPortStats() {
    return ethernetPortStats;
  }
  
  public void setEthernetPortStats(List<EthernetPortStatistics> ethernetPortStats) {
    this.ethernetPortStats = ethernetPortStats;
  }

  
  /**
   * Statistics related to the TCP protocol.
   **/
  public IscsiInterfaceStatistics tcpStats(List<TcpStatisticalData> tcpStats) {
    this.tcpStats = tcpStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Statistics related to the TCP protocol.")
  @JsonProperty("tcpStats")
  public List<TcpStatisticalData> getTcpStats() {
    return tcpStats;
  }
  
  public void setTcpStats(List<TcpStatisticalData> tcpStats) {
    this.tcpStats = tcpStats;
  }

  
  /**
   * Statistics related to the IP protocol.
   **/
  public IscsiInterfaceStatistics ipStats(List<IpEndpointStatistics> ipStats) {
    this.ipStats = ipStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Statistics related to the IP protocol.")
  @JsonProperty("ipStats")
  public List<IpEndpointStatistics> getIpStats() {
    return ipStats;
  }
  
  public void setIpStats(List<IpEndpointStatistics> ipStats) {
    this.ipStats = ipStats;
  }

  
  /**
   * This member is used to report statistical data related to Enhanced Ethernet features.
   **/
  public IscsiInterfaceStatistics enhStats(List<EnhancedEthernetStatistics> enhStats) {
    this.enhStats = enhStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This member is used to report statistical data related to Enhanced Ethernet features.")
  @JsonProperty("enhStats")
  public List<EnhancedEthernetStatistics> getEnhStats() {
    return enhStats;
  }
  
  public void setEnhStats(List<EnhancedEthernetStatistics> enhStats) {
    this.enhStats = enhStats;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiInterfaceStatistics iscsiInterfaceStatistics = (IscsiInterfaceStatistics) o;
    return Objects.equals(this.ethernetPortStats, iscsiInterfaceStatistics.ethernetPortStats) &&
        Objects.equals(this.tcpStats, iscsiInterfaceStatistics.tcpStats) &&
        Objects.equals(this.ipStats, iscsiInterfaceStatistics.ipStats) &&
        Objects.equals(this.enhStats, iscsiInterfaceStatistics.enhStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethernetPortStats, tcpStats, ipStats, enhStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiInterfaceStatistics {\n");
    
    sb.append("    ethernetPortStats: ").append(toIndentedString(ethernetPortStats)).append("\n");
    sb.append("    tcpStats: ").append(toIndentedString(tcpStats)).append("\n");
    sb.append("    ipStats: ").append(toIndentedString(ipStats)).append("\n");
    sb.append("    enhStats: ").append(toIndentedString(enhStats)).append("\n");
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

