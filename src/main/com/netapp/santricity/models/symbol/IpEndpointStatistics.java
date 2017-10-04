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
 * IpEndpointStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IpEndpointStatistics   {
  
    private List<String> interfaces;

    private Long ipv4ReceivedPdus;

    private Long ipv4SentPdus;

    private Long ipv4ReassembledPackets;

    private Long ipv4Fragmentation;

    private Long ipv4FragmentedPdusCreates;

    private Long ipv4TxByteCount;

    private Long ipv4RxByteCount;

    private Long ipv4RxErrorCount;

    private Long ipv4OverlappedFragCount;

    private Long ipv4OutOfOrderFragCount;

    private Long ipv4TimeoutCount;

    private Long ipv6ReceivedPdus;

    private Long ipv6SentPdus;

    private Long ipv6ReassembledPackets;

    private Long ipv6Fragmentation;

    private Long ipv6FragmentedPdusCreates;

    private Long ipv6TxByteCount;

    private Long ipv6RxByteCount;

    private Long ipv6RxErrorCount;

    private Long ipv6OverlappedFragCount;

    private Long ipv6OutOfOrderFragCount;

    private Long ipv6TimeoutCount;

  
  /**
   * The interface(s) for which the statistics apply. In some cases, the statistics may be aggregated across multiple interfaces. Even though this is shown as an array, it will only be a single instance.
   **/
  public IpEndpointStatistics interfaces(List<String> interfaces) {
    this.interfaces = interfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The interface(s) for which the statistics apply. In some cases, the statistics may be aggregated across multiple interfaces. Even though this is shown as an array, it will only be a single instance.")
  @JsonProperty("interfaces")
  public List<String> getInterfaces() {
    return interfaces;
  }
  
  public void setInterfaces(List<String> interfaces) {
    this.interfaces = interfaces;
  }

  
  /**
   * The number of IPV4 input datagrams received.
   **/
  public IpEndpointStatistics ipv4ReceivedPdus(Long ipv4ReceivedPdus) {
    this.ipv4ReceivedPdus = ipv4ReceivedPdus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV4 input datagrams received.")
  @JsonProperty("ipv4ReceivedPdus")
  public Long getIpv4ReceivedPdus() {
    return ipv4ReceivedPdus;
  }
  
  public void setIpv4ReceivedPdus(Long ipv4ReceivedPdus) {
    this.ipv4ReceivedPdus = ipv4ReceivedPdus;
  }

  
  /**
   * The number of IPV4 output datagrams sent.
   **/
  public IpEndpointStatistics ipv4SentPdus(Long ipv4SentPdus) {
    this.ipv4SentPdus = ipv4SentPdus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV4 output datagrams sent.")
  @JsonProperty("ipv4SentPdus")
  public Long getIpv4SentPdus() {
    return ipv4SentPdus;
  }
  
  public void setIpv4SentPdus(Long ipv4SentPdus) {
    this.ipv4SentPdus = ipv4SentPdus;
  }

  
  /**
   * The number of IPV4 datagrams successfully reassembled.
   **/
  public IpEndpointStatistics ipv4ReassembledPackets(Long ipv4ReassembledPackets) {
    this.ipv4ReassembledPackets = ipv4ReassembledPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV4 datagrams successfully reassembled.")
  @JsonProperty("ipv4ReassembledPackets")
  public Long getIpv4ReassembledPackets() {
    return ipv4ReassembledPackets;
  }
  
  public void setIpv4ReassembledPackets(Long ipv4ReassembledPackets) {
    this.ipv4ReassembledPackets = ipv4ReassembledPackets;
  }

  
  /**
   * The number of IPV4 packet fragments received.
   **/
  public IpEndpointStatistics ipv4Fragmentation(Long ipv4Fragmentation) {
    this.ipv4Fragmentation = ipv4Fragmentation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV4 packet fragments received.")
  @JsonProperty("ipv4Fragmentation")
  public Long getIpv4Fragmentation() {
    return ipv4Fragmentation;
  }
  
  public void setIpv4Fragmentation(Long ipv4Fragmentation) {
    this.ipv4Fragmentation = ipv4Fragmentation;
  }

  
  /**
   * The number of IPV4 packet fragments transmitted.
   **/
  public IpEndpointStatistics ipv4FragmentedPdusCreates(Long ipv4FragmentedPdusCreates) {
    this.ipv4FragmentedPdusCreates = ipv4FragmentedPdusCreates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV4 packet fragments transmitted.")
  @JsonProperty("ipv4FragmentedPdusCreates")
  public Long getIpv4FragmentedPdusCreates() {
    return ipv4FragmentedPdusCreates;
  }
  
  public void setIpv4FragmentedPdusCreates(Long ipv4FragmentedPdusCreates) {
    this.ipv4FragmentedPdusCreates = ipv4FragmentedPdusCreates;
  }

  
  /**
   * The number of data payload bytes transmitted in IPV4 packets.
   **/
  public IpEndpointStatistics ipv4TxByteCount(Long ipv4TxByteCount) {
    this.ipv4TxByteCount = ipv4TxByteCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of data payload bytes transmitted in IPV4 packets.")
  @JsonProperty("ipv4TxByteCount")
  public Long getIpv4TxByteCount() {
    return ipv4TxByteCount;
  }
  
  public void setIpv4TxByteCount(Long ipv4TxByteCount) {
    this.ipv4TxByteCount = ipv4TxByteCount;
  }

  
  /**
   * The number of data payload bytes received in IPV4 packets.
   **/
  public IpEndpointStatistics ipv4RxByteCount(Long ipv4RxByteCount) {
    this.ipv4RxByteCount = ipv4RxByteCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of data payload bytes received in IPV4 packets.")
  @JsonProperty("ipv4RxByteCount")
  public Long getIpv4RxByteCount() {
    return ipv4RxByteCount;
  }
  
  public void setIpv4RxByteCount(Long ipv4RxByteCount) {
    this.ipv4RxByteCount = ipv4RxByteCount;
  }

  
  /**
   * # of IPV4 packets received with errors
   **/
  public IpEndpointStatistics ipv4RxErrorCount(Long ipv4RxErrorCount) {
    this.ipv4RxErrorCount = ipv4RxErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "# of IPV4 packets received with errors")
  @JsonProperty("ipv4RxErrorCount")
  public Long getIpv4RxErrorCount() {
    return ipv4RxErrorCount;
  }
  
  public void setIpv4RxErrorCount(Long ipv4RxErrorCount) {
    this.ipv4RxErrorCount = ipv4RxErrorCount;
  }

  
  /**
   * The number of IPV4 datagrams with fragments that overlapped.
   **/
  public IpEndpointStatistics ipv4OverlappedFragCount(Long ipv4OverlappedFragCount) {
    this.ipv4OverlappedFragCount = ipv4OverlappedFragCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV4 datagrams with fragments that overlapped.")
  @JsonProperty("ipv4OverlappedFragCount")
  public Long getIpv4OverlappedFragCount() {
    return ipv4OverlappedFragCount;
  }
  
  public void setIpv4OverlappedFragCount(Long ipv4OverlappedFragCount) {
    this.ipv4OverlappedFragCount = ipv4OverlappedFragCount;
  }

  
  /**
   * The number of IPV4 datagrams with fragments received that were out of order.
   **/
  public IpEndpointStatistics ipv4OutOfOrderFragCount(Long ipv4OutOfOrderFragCount) {
    this.ipv4OutOfOrderFragCount = ipv4OutOfOrderFragCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV4 datagrams with fragments received that were out of order.")
  @JsonProperty("ipv4OutOfOrderFragCount")
  public Long getIpv4OutOfOrderFragCount() {
    return ipv4OutOfOrderFragCount;
  }
  
  public void setIpv4OutOfOrderFragCount(Long ipv4OutOfOrderFragCount) {
    this.ipv4OutOfOrderFragCount = ipv4OutOfOrderFragCount;
  }

  
  /**
   * The number of timed-out IPV4 datagrams waiting for reassembly.
   **/
  public IpEndpointStatistics ipv4TimeoutCount(Long ipv4TimeoutCount) {
    this.ipv4TimeoutCount = ipv4TimeoutCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of timed-out IPV4 datagrams waiting for reassembly.")
  @JsonProperty("ipv4TimeoutCount")
  public Long getIpv4TimeoutCount() {
    return ipv4TimeoutCount;
  }
  
  public void setIpv4TimeoutCount(Long ipv4TimeoutCount) {
    this.ipv4TimeoutCount = ipv4TimeoutCount;
  }

  
  /**
   * The number of IPV6 input datagrams received.
   **/
  public IpEndpointStatistics ipv6ReceivedPdus(Long ipv6ReceivedPdus) {
    this.ipv6ReceivedPdus = ipv6ReceivedPdus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV6 input datagrams received.")
  @JsonProperty("ipv6ReceivedPdus")
  public Long getIpv6ReceivedPdus() {
    return ipv6ReceivedPdus;
  }
  
  public void setIpv6ReceivedPdus(Long ipv6ReceivedPdus) {
    this.ipv6ReceivedPdus = ipv6ReceivedPdus;
  }

  
  /**
   * The number of IPV6output datagrams sent.
   **/
  public IpEndpointStatistics ipv6SentPdus(Long ipv6SentPdus) {
    this.ipv6SentPdus = ipv6SentPdus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV6output datagrams sent.")
  @JsonProperty("ipv6SentPdus")
  public Long getIpv6SentPdus() {
    return ipv6SentPdus;
  }
  
  public void setIpv6SentPdus(Long ipv6SentPdus) {
    this.ipv6SentPdus = ipv6SentPdus;
  }

  
  /**
   * The number of IPV6 datagrams successfully reassembled.
   **/
  public IpEndpointStatistics ipv6ReassembledPackets(Long ipv6ReassembledPackets) {
    this.ipv6ReassembledPackets = ipv6ReassembledPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV6 datagrams successfully reassembled.")
  @JsonProperty("ipv6ReassembledPackets")
  public Long getIpv6ReassembledPackets() {
    return ipv6ReassembledPackets;
  }
  
  public void setIpv6ReassembledPackets(Long ipv6ReassembledPackets) {
    this.ipv6ReassembledPackets = ipv6ReassembledPackets;
  }

  
  /**
   * The number of IPV6packet fragments received.
   **/
  public IpEndpointStatistics ipv6Fragmentation(Long ipv6Fragmentation) {
    this.ipv6Fragmentation = ipv6Fragmentation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV6packet fragments received.")
  @JsonProperty("ipv6Fragmentation")
  public Long getIpv6Fragmentation() {
    return ipv6Fragmentation;
  }
  
  public void setIpv6Fragmentation(Long ipv6Fragmentation) {
    this.ipv6Fragmentation = ipv6Fragmentation;
  }

  
  /**
   * The number of IPV6 packet fragments transmitted.
   **/
  public IpEndpointStatistics ipv6FragmentedPdusCreates(Long ipv6FragmentedPdusCreates) {
    this.ipv6FragmentedPdusCreates = ipv6FragmentedPdusCreates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV6 packet fragments transmitted.")
  @JsonProperty("ipv6FragmentedPdusCreates")
  public Long getIpv6FragmentedPdusCreates() {
    return ipv6FragmentedPdusCreates;
  }
  
  public void setIpv6FragmentedPdusCreates(Long ipv6FragmentedPdusCreates) {
    this.ipv6FragmentedPdusCreates = ipv6FragmentedPdusCreates;
  }

  
  /**
   * The number of data payload bytes transmitted in IPV6 packets.
   **/
  public IpEndpointStatistics ipv6TxByteCount(Long ipv6TxByteCount) {
    this.ipv6TxByteCount = ipv6TxByteCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of data payload bytes transmitted in IPV6 packets.")
  @JsonProperty("ipv6TxByteCount")
  public Long getIpv6TxByteCount() {
    return ipv6TxByteCount;
  }
  
  public void setIpv6TxByteCount(Long ipv6TxByteCount) {
    this.ipv6TxByteCount = ipv6TxByteCount;
  }

  
  /**
   * The number of data payload bytes received in IPV6 packets.
   **/
  public IpEndpointStatistics ipv6RxByteCount(Long ipv6RxByteCount) {
    this.ipv6RxByteCount = ipv6RxByteCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of data payload bytes received in IPV6 packets.")
  @JsonProperty("ipv6RxByteCount")
  public Long getIpv6RxByteCount() {
    return ipv6RxByteCount;
  }
  
  public void setIpv6RxByteCount(Long ipv6RxByteCount) {
    this.ipv6RxByteCount = ipv6RxByteCount;
  }

  
  /**
   * The number of IPV6 packets received with errors.
   **/
  public IpEndpointStatistics ipv6RxErrorCount(Long ipv6RxErrorCount) {
    this.ipv6RxErrorCount = ipv6RxErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV6 packets received with errors.")
  @JsonProperty("ipv6RxErrorCount")
  public Long getIpv6RxErrorCount() {
    return ipv6RxErrorCount;
  }
  
  public void setIpv6RxErrorCount(Long ipv6RxErrorCount) {
    this.ipv6RxErrorCount = ipv6RxErrorCount;
  }

  
  /**
   * The number of IPV6 datagrams with fragments that overlapped.
   **/
  public IpEndpointStatistics ipv6OverlappedFragCount(Long ipv6OverlappedFragCount) {
    this.ipv6OverlappedFragCount = ipv6OverlappedFragCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV6 datagrams with fragments that overlapped.")
  @JsonProperty("ipv6OverlappedFragCount")
  public Long getIpv6OverlappedFragCount() {
    return ipv6OverlappedFragCount;
  }
  
  public void setIpv6OverlappedFragCount(Long ipv6OverlappedFragCount) {
    this.ipv6OverlappedFragCount = ipv6OverlappedFragCount;
  }

  
  /**
   * The number of IPV6 datagrams with fragments received that were out of order.
   **/
  public IpEndpointStatistics ipv6OutOfOrderFragCount(Long ipv6OutOfOrderFragCount) {
    this.ipv6OutOfOrderFragCount = ipv6OutOfOrderFragCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of IPV6 datagrams with fragments received that were out of order.")
  @JsonProperty("ipv6OutOfOrderFragCount")
  public Long getIpv6OutOfOrderFragCount() {
    return ipv6OutOfOrderFragCount;
  }
  
  public void setIpv6OutOfOrderFragCount(Long ipv6OutOfOrderFragCount) {
    this.ipv6OutOfOrderFragCount = ipv6OutOfOrderFragCount;
  }

  
  /**
   * The number of timed-out IPV6 datagrams waiting for reassembly.
   **/
  public IpEndpointStatistics ipv6TimeoutCount(Long ipv6TimeoutCount) {
    this.ipv6TimeoutCount = ipv6TimeoutCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of timed-out IPV6 datagrams waiting for reassembly.")
  @JsonProperty("ipv6TimeoutCount")
  public Long getIpv6TimeoutCount() {
    return ipv6TimeoutCount;
  }
  
  public void setIpv6TimeoutCount(Long ipv6TimeoutCount) {
    this.ipv6TimeoutCount = ipv6TimeoutCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpEndpointStatistics ipEndpointStatistics = (IpEndpointStatistics) o;
    return Objects.equals(this.interfaces, ipEndpointStatistics.interfaces) &&
        Objects.equals(this.ipv4ReceivedPdus, ipEndpointStatistics.ipv4ReceivedPdus) &&
        Objects.equals(this.ipv4SentPdus, ipEndpointStatistics.ipv4SentPdus) &&
        Objects.equals(this.ipv4ReassembledPackets, ipEndpointStatistics.ipv4ReassembledPackets) &&
        Objects.equals(this.ipv4Fragmentation, ipEndpointStatistics.ipv4Fragmentation) &&
        Objects.equals(this.ipv4FragmentedPdusCreates, ipEndpointStatistics.ipv4FragmentedPdusCreates) &&
        Objects.equals(this.ipv4TxByteCount, ipEndpointStatistics.ipv4TxByteCount) &&
        Objects.equals(this.ipv4RxByteCount, ipEndpointStatistics.ipv4RxByteCount) &&
        Objects.equals(this.ipv4RxErrorCount, ipEndpointStatistics.ipv4RxErrorCount) &&
        Objects.equals(this.ipv4OverlappedFragCount, ipEndpointStatistics.ipv4OverlappedFragCount) &&
        Objects.equals(this.ipv4OutOfOrderFragCount, ipEndpointStatistics.ipv4OutOfOrderFragCount) &&
        Objects.equals(this.ipv4TimeoutCount, ipEndpointStatistics.ipv4TimeoutCount) &&
        Objects.equals(this.ipv6ReceivedPdus, ipEndpointStatistics.ipv6ReceivedPdus) &&
        Objects.equals(this.ipv6SentPdus, ipEndpointStatistics.ipv6SentPdus) &&
        Objects.equals(this.ipv6ReassembledPackets, ipEndpointStatistics.ipv6ReassembledPackets) &&
        Objects.equals(this.ipv6Fragmentation, ipEndpointStatistics.ipv6Fragmentation) &&
        Objects.equals(this.ipv6FragmentedPdusCreates, ipEndpointStatistics.ipv6FragmentedPdusCreates) &&
        Objects.equals(this.ipv6TxByteCount, ipEndpointStatistics.ipv6TxByteCount) &&
        Objects.equals(this.ipv6RxByteCount, ipEndpointStatistics.ipv6RxByteCount) &&
        Objects.equals(this.ipv6RxErrorCount, ipEndpointStatistics.ipv6RxErrorCount) &&
        Objects.equals(this.ipv6OverlappedFragCount, ipEndpointStatistics.ipv6OverlappedFragCount) &&
        Objects.equals(this.ipv6OutOfOrderFragCount, ipEndpointStatistics.ipv6OutOfOrderFragCount) &&
        Objects.equals(this.ipv6TimeoutCount, ipEndpointStatistics.ipv6TimeoutCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaces, ipv4ReceivedPdus, ipv4SentPdus, ipv4ReassembledPackets, ipv4Fragmentation, ipv4FragmentedPdusCreates, ipv4TxByteCount, ipv4RxByteCount, ipv4RxErrorCount, ipv4OverlappedFragCount, ipv4OutOfOrderFragCount, ipv4TimeoutCount, ipv6ReceivedPdus, ipv6SentPdus, ipv6ReassembledPackets, ipv6Fragmentation, ipv6FragmentedPdusCreates, ipv6TxByteCount, ipv6RxByteCount, ipv6RxErrorCount, ipv6OverlappedFragCount, ipv6OutOfOrderFragCount, ipv6TimeoutCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpEndpointStatistics {\n");
    
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("    ipv4ReceivedPdus: ").append(toIndentedString(ipv4ReceivedPdus)).append("\n");
    sb.append("    ipv4SentPdus: ").append(toIndentedString(ipv4SentPdus)).append("\n");
    sb.append("    ipv4ReassembledPackets: ").append(toIndentedString(ipv4ReassembledPackets)).append("\n");
    sb.append("    ipv4Fragmentation: ").append(toIndentedString(ipv4Fragmentation)).append("\n");
    sb.append("    ipv4FragmentedPdusCreates: ").append(toIndentedString(ipv4FragmentedPdusCreates)).append("\n");
    sb.append("    ipv4TxByteCount: ").append(toIndentedString(ipv4TxByteCount)).append("\n");
    sb.append("    ipv4RxByteCount: ").append(toIndentedString(ipv4RxByteCount)).append("\n");
    sb.append("    ipv4RxErrorCount: ").append(toIndentedString(ipv4RxErrorCount)).append("\n");
    sb.append("    ipv4OverlappedFragCount: ").append(toIndentedString(ipv4OverlappedFragCount)).append("\n");
    sb.append("    ipv4OutOfOrderFragCount: ").append(toIndentedString(ipv4OutOfOrderFragCount)).append("\n");
    sb.append("    ipv4TimeoutCount: ").append(toIndentedString(ipv4TimeoutCount)).append("\n");
    sb.append("    ipv6ReceivedPdus: ").append(toIndentedString(ipv6ReceivedPdus)).append("\n");
    sb.append("    ipv6SentPdus: ").append(toIndentedString(ipv6SentPdus)).append("\n");
    sb.append("    ipv6ReassembledPackets: ").append(toIndentedString(ipv6ReassembledPackets)).append("\n");
    sb.append("    ipv6Fragmentation: ").append(toIndentedString(ipv6Fragmentation)).append("\n");
    sb.append("    ipv6FragmentedPdusCreates: ").append(toIndentedString(ipv6FragmentedPdusCreates)).append("\n");
    sb.append("    ipv6TxByteCount: ").append(toIndentedString(ipv6TxByteCount)).append("\n");
    sb.append("    ipv6RxByteCount: ").append(toIndentedString(ipv6RxByteCount)).append("\n");
    sb.append("    ipv6RxErrorCount: ").append(toIndentedString(ipv6RxErrorCount)).append("\n");
    sb.append("    ipv6OverlappedFragCount: ").append(toIndentedString(ipv6OverlappedFragCount)).append("\n");
    sb.append("    ipv6OutOfOrderFragCount: ").append(toIndentedString(ipv6OutOfOrderFragCount)).append("\n");
    sb.append("    ipv6TimeoutCount: ").append(toIndentedString(ipv6TimeoutCount)).append("\n");
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

