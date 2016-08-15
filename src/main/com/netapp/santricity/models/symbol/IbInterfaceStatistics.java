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
 * IbInterfaceStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IbInterfaceStatistics   {
  
    private String interfaceRef;

    private Long symbolErrors;

    private Long recoveredLinkErrors;

    private Long unrecoveredLinkErrors;

    private Long rxPacketErrors;

    private Long rxEbpDelimitedPackets;

    private Long txPortDownPacketDiscards;

    private Long txConstraintErrorPacketDiscards;

    private Long rxConstraintErrorPacketDiscards;

    private Long rxSubnetManagementDroppedPackets;

    private Long txTotalBytes;

    private Long rxTotalBytes;

    private Long txTotalPackets;

    private Long rxTotalPackets;

    private Long txWaitTime;

    private Long txUnicastTotalPackets;

    private Long rxUnicastTotalPackets;

    private Long txMulticastTotalPackets;

    private Long rxMulticastTotalPackets;

  
  /**
   * A reference to the interface for which the statistics apply.
   **/
  public IbInterfaceStatistics interfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the interface for which the statistics apply.")
  @JsonProperty("interfaceRef")
  public String getInterfaceRef() {
    return interfaceRef;
  }
  
  public void setInterfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
  }

  
  /**
   * The number of symbol errors.
   **/
  public IbInterfaceStatistics symbolErrors(Long symbolErrors) {
    this.symbolErrors = symbolErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of symbol errors.")
  @JsonProperty("symbolErrors")
  public Long getSymbolErrors() {
    return symbolErrors;
  }
  
  public void setSymbolErrors(Long symbolErrors) {
    this.symbolErrors = symbolErrors;
  }

  
  /**
   * The number of recovered link errors.
   **/
  public IbInterfaceStatistics recoveredLinkErrors(Long recoveredLinkErrors) {
    this.recoveredLinkErrors = recoveredLinkErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of recovered link errors.")
  @JsonProperty("recoveredLinkErrors")
  public Long getRecoveredLinkErrors() {
    return recoveredLinkErrors;
  }
  
  public void setRecoveredLinkErrors(Long recoveredLinkErrors) {
    this.recoveredLinkErrors = recoveredLinkErrors;
  }

  
  /**
   * The number of unrecovered link errors.
   **/
  public IbInterfaceStatistics unrecoveredLinkErrors(Long unrecoveredLinkErrors) {
    this.unrecoveredLinkErrors = unrecoveredLinkErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of unrecovered link errors.")
  @JsonProperty("unrecoveredLinkErrors")
  public Long getUnrecoveredLinkErrors() {
    return unrecoveredLinkErrors;
  }
  
  public void setUnrecoveredLinkErrors(Long unrecoveredLinkErrors) {
    this.unrecoveredLinkErrors = unrecoveredLinkErrors;
  }

  
  /**
   * The number of packets containing an error that have been received on the port.
   **/
  public IbInterfaceStatistics rxPacketErrors(Long rxPacketErrors) {
    this.rxPacketErrors = rxPacketErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of packets containing an error that have been received on the port.")
  @JsonProperty("rxPacketErrors")
  public Long getRxPacketErrors() {
    return rxPacketErrors;
  }
  
  public void setRxPacketErrors(Long rxPacketErrors) {
    this.rxPacketErrors = rxPacketErrors;
  }

  
  /**
   * The total number of packets with End Bad Packet delimiter that have been received on the port.
   **/
  public IbInterfaceStatistics rxEbpDelimitedPackets(Long rxEbpDelimitedPackets) {
    this.rxEbpDelimitedPackets = rxEbpDelimitedPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of packets with End Bad Packet delimiter that have been received on the port.")
  @JsonProperty("rxEbpDelimitedPackets")
  public Long getRxEbpDelimitedPackets() {
    return rxEbpDelimitedPackets;
  }
  
  public void setRxEbpDelimitedPackets(Long rxEbpDelimitedPackets) {
    this.rxEbpDelimitedPackets = rxEbpDelimitedPackets;
  }

  
  /**
   * The number of outbound packets discarded because the port is either down or congested.
   **/
  public IbInterfaceStatistics txPortDownPacketDiscards(Long txPortDownPacketDiscards) {
    this.txPortDownPacketDiscards = txPortDownPacketDiscards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of outbound packets discarded because the port is either down or congested.")
  @JsonProperty("txPortDownPacketDiscards")
  public Long getTxPortDownPacketDiscards() {
    return txPortDownPacketDiscards;
  }
  
  public void setTxPortDownPacketDiscards(Long txPortDownPacketDiscards) {
    this.txPortDownPacketDiscards = txPortDownPacketDiscards;
  }

  
  /**
   * The number of outbound packets discarded because either (1) the packet is a raw datagram, (2) the packet has a wrong partition key, or (3) the packet has a bad transport header version.
   **/
  public IbInterfaceStatistics txConstraintErrorPacketDiscards(Long txConstraintErrorPacketDiscards) {
    this.txConstraintErrorPacketDiscards = txConstraintErrorPacketDiscards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of outbound packets discarded because either (1) the packet is a raw datagram, (2) the packet has a wrong partition key, or (3) the packet has a bad transport header version.")
  @JsonProperty("txConstraintErrorPacketDiscards")
  public Long getTxConstraintErrorPacketDiscards() {
    return txConstraintErrorPacketDiscards;
  }
  
  public void setTxConstraintErrorPacketDiscards(Long txConstraintErrorPacketDiscards) {
    this.txConstraintErrorPacketDiscards = txConstraintErrorPacketDiscards;
  }

  
  /**
   * The number of inbound packets discarded because either (1) the packet is a raw datagram, (2) the packet has a wrong partition key, or (3) the packet has a bad transport header version.
   **/
  public IbInterfaceStatistics rxConstraintErrorPacketDiscards(Long rxConstraintErrorPacketDiscards) {
    this.rxConstraintErrorPacketDiscards = rxConstraintErrorPacketDiscards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of inbound packets discarded because either (1) the packet is a raw datagram, (2) the packet has a wrong partition key, or (3) the packet has a bad transport header version.")
  @JsonProperty("rxConstraintErrorPacketDiscards")
  public Long getRxConstraintErrorPacketDiscards() {
    return rxConstraintErrorPacketDiscards;
  }
  
  public void setRxConstraintErrorPacketDiscards(Long rxConstraintErrorPacketDiscards) {
    this.rxConstraintErrorPacketDiscards = rxConstraintErrorPacketDiscards;
  }

  
  /**
   * The number of virtual lane 15 packets dropped due to resource limitations (e.g., lack of buffers) in the port.
   **/
  public IbInterfaceStatistics rxSubnetManagementDroppedPackets(Long rxSubnetManagementDroppedPackets) {
    this.rxSubnetManagementDroppedPackets = rxSubnetManagementDroppedPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of virtual lane 15 packets dropped due to resource limitations (e.g., lack of buffers) in the port.")
  @JsonProperty("rxSubnetManagementDroppedPackets")
  public Long getRxSubnetManagementDroppedPackets() {
    return rxSubnetManagementDroppedPackets;
  }
  
  public void setRxSubnetManagementDroppedPackets(Long rxSubnetManagementDroppedPackets) {
    this.rxSubnetManagementDroppedPackets = rxSubnetManagementDroppedPackets;
  }

  
  /**
   * The number of bytes transmitted at the port on all virtual lanes.
   **/
  public IbInterfaceStatistics txTotalBytes(Long txTotalBytes) {
    this.txTotalBytes = txTotalBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes transmitted at the port on all virtual lanes.")
  @JsonProperty("txTotalBytes")
  public Long getTxTotalBytes() {
    return txTotalBytes;
  }
  
  public void setTxTotalBytes(Long txTotalBytes) {
    this.txTotalBytes = txTotalBytes;
  }

  
  /**
   * The number of bytes received at the port on all virtual lanes.
   **/
  public IbInterfaceStatistics rxTotalBytes(Long rxTotalBytes) {
    this.rxTotalBytes = rxTotalBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes received at the port on all virtual lanes.")
  @JsonProperty("rxTotalBytes")
  public Long getRxTotalBytes() {
    return rxTotalBytes;
  }
  
  public void setRxTotalBytes(Long rxTotalBytes) {
    this.rxTotalBytes = rxTotalBytes;
  }

  
  /**
   * The number of packets transmitted at the port on all virtual lanes.
   **/
  public IbInterfaceStatistics txTotalPackets(Long txTotalPackets) {
    this.txTotalPackets = txTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of packets transmitted at the port on all virtual lanes.")
  @JsonProperty("txTotalPackets")
  public Long getTxTotalPackets() {
    return txTotalPackets;
  }
  
  public void setTxTotalPackets(Long txTotalPackets) {
    this.txTotalPackets = txTotalPackets;
  }

  
  /**
   * The number of packets received at the port on all virtual lanes.
   **/
  public IbInterfaceStatistics rxTotalPackets(Long rxTotalPackets) {
    this.rxTotalPackets = rxTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of packets received at the port on all virtual lanes.")
  @JsonProperty("rxTotalPackets")
  public Long getRxTotalPackets() {
    return rxTotalPackets;
  }
  
  public void setRxTotalPackets(Long rxTotalPackets) {
    this.rxTotalPackets = rxTotalPackets;
  }

  
  /**
   * The number of microseconds during which the port had data to transmit, but none was sent because of insufficient credits or due to arbitration.
   **/
  public IbInterfaceStatistics txWaitTime(Long txWaitTime) {
    this.txWaitTime = txWaitTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of microseconds during which the port had data to transmit, but none was sent because of insufficient credits or due to arbitration.")
  @JsonProperty("txWaitTime")
  public Long getTxWaitTime() {
    return txWaitTime;
  }
  
  public void setTxWaitTime(Long txWaitTime) {
    this.txWaitTime = txWaitTime;
  }

  
  /**
   * Total number of unicast packets transmitted on all VLs from the port. This may include unicast packets with errors and excludes link packets.
   **/
  public IbInterfaceStatistics txUnicastTotalPackets(Long txUnicastTotalPackets) {
    this.txUnicastTotalPackets = txUnicastTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of unicast packets transmitted on all VLs from the port. This may include unicast packets with errors and excludes link packets.")
  @JsonProperty("txUnicastTotalPackets")
  public Long getTxUnicastTotalPackets() {
    return txUnicastTotalPackets;
  }
  
  public void setTxUnicastTotalPackets(Long txUnicastTotalPackets) {
    this.txUnicastTotalPackets = txUnicastTotalPackets;
  }

  
  /**
   * Total number of unicast packets, including unicast packets containing errors, and excluding link packets, received from all VLs on the port.
   **/
  public IbInterfaceStatistics rxUnicastTotalPackets(Long rxUnicastTotalPackets) {
    this.rxUnicastTotalPackets = rxUnicastTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of unicast packets, including unicast packets containing errors, and excluding link packets, received from all VLs on the port.")
  @JsonProperty("rxUnicastTotalPackets")
  public Long getRxUnicastTotalPackets() {
    return rxUnicastTotalPackets;
  }
  
  public void setRxUnicastTotalPackets(Long rxUnicastTotalPackets) {
    this.rxUnicastTotalPackets = rxUnicastTotalPackets;
  }

  
  /**
   * Total number of multicast packets transmitted on all VLs from the port. This may include multicast packets with errors.
   **/
  public IbInterfaceStatistics txMulticastTotalPackets(Long txMulticastTotalPackets) {
    this.txMulticastTotalPackets = txMulticastTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of multicast packets transmitted on all VLs from the port. This may include multicast packets with errors.")
  @JsonProperty("txMulticastTotalPackets")
  public Long getTxMulticastTotalPackets() {
    return txMulticastTotalPackets;
  }
  
  public void setTxMulticastTotalPackets(Long txMulticastTotalPackets) {
    this.txMulticastTotalPackets = txMulticastTotalPackets;
  }

  
  /**
   * Total number of multicast packets, including multicast packets containing errors received from all VLs on the port.
   **/
  public IbInterfaceStatistics rxMulticastTotalPackets(Long rxMulticastTotalPackets) {
    this.rxMulticastTotalPackets = rxMulticastTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of multicast packets, including multicast packets containing errors received from all VLs on the port.")
  @JsonProperty("rxMulticastTotalPackets")
  public Long getRxMulticastTotalPackets() {
    return rxMulticastTotalPackets;
  }
  
  public void setRxMulticastTotalPackets(Long rxMulticastTotalPackets) {
    this.rxMulticastTotalPackets = rxMulticastTotalPackets;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbInterfaceStatistics ibInterfaceStatistics = (IbInterfaceStatistics) o;
    return Objects.equals(this.interfaceRef, ibInterfaceStatistics.interfaceRef) &&
        Objects.equals(this.symbolErrors, ibInterfaceStatistics.symbolErrors) &&
        Objects.equals(this.recoveredLinkErrors, ibInterfaceStatistics.recoveredLinkErrors) &&
        Objects.equals(this.unrecoveredLinkErrors, ibInterfaceStatistics.unrecoveredLinkErrors) &&
        Objects.equals(this.rxPacketErrors, ibInterfaceStatistics.rxPacketErrors) &&
        Objects.equals(this.rxEbpDelimitedPackets, ibInterfaceStatistics.rxEbpDelimitedPackets) &&
        Objects.equals(this.txPortDownPacketDiscards, ibInterfaceStatistics.txPortDownPacketDiscards) &&
        Objects.equals(this.txConstraintErrorPacketDiscards, ibInterfaceStatistics.txConstraintErrorPacketDiscards) &&
        Objects.equals(this.rxConstraintErrorPacketDiscards, ibInterfaceStatistics.rxConstraintErrorPacketDiscards) &&
        Objects.equals(this.rxSubnetManagementDroppedPackets, ibInterfaceStatistics.rxSubnetManagementDroppedPackets) &&
        Objects.equals(this.txTotalBytes, ibInterfaceStatistics.txTotalBytes) &&
        Objects.equals(this.rxTotalBytes, ibInterfaceStatistics.rxTotalBytes) &&
        Objects.equals(this.txTotalPackets, ibInterfaceStatistics.txTotalPackets) &&
        Objects.equals(this.rxTotalPackets, ibInterfaceStatistics.rxTotalPackets) &&
        Objects.equals(this.txWaitTime, ibInterfaceStatistics.txWaitTime) &&
        Objects.equals(this.txUnicastTotalPackets, ibInterfaceStatistics.txUnicastTotalPackets) &&
        Objects.equals(this.rxUnicastTotalPackets, ibInterfaceStatistics.rxUnicastTotalPackets) &&
        Objects.equals(this.txMulticastTotalPackets, ibInterfaceStatistics.txMulticastTotalPackets) &&
        Objects.equals(this.rxMulticastTotalPackets, ibInterfaceStatistics.rxMulticastTotalPackets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceRef, symbolErrors, recoveredLinkErrors, unrecoveredLinkErrors, rxPacketErrors, rxEbpDelimitedPackets, txPortDownPacketDiscards, txConstraintErrorPacketDiscards, rxConstraintErrorPacketDiscards, rxSubnetManagementDroppedPackets, txTotalBytes, rxTotalBytes, txTotalPackets, rxTotalPackets, txWaitTime, txUnicastTotalPackets, rxUnicastTotalPackets, txMulticastTotalPackets, rxMulticastTotalPackets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbInterfaceStatistics {\n");
    
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    symbolErrors: ").append(toIndentedString(symbolErrors)).append("\n");
    sb.append("    recoveredLinkErrors: ").append(toIndentedString(recoveredLinkErrors)).append("\n");
    sb.append("    unrecoveredLinkErrors: ").append(toIndentedString(unrecoveredLinkErrors)).append("\n");
    sb.append("    rxPacketErrors: ").append(toIndentedString(rxPacketErrors)).append("\n");
    sb.append("    rxEbpDelimitedPackets: ").append(toIndentedString(rxEbpDelimitedPackets)).append("\n");
    sb.append("    txPortDownPacketDiscards: ").append(toIndentedString(txPortDownPacketDiscards)).append("\n");
    sb.append("    txConstraintErrorPacketDiscards: ").append(toIndentedString(txConstraintErrorPacketDiscards)).append("\n");
    sb.append("    rxConstraintErrorPacketDiscards: ").append(toIndentedString(rxConstraintErrorPacketDiscards)).append("\n");
    sb.append("    rxSubnetManagementDroppedPackets: ").append(toIndentedString(rxSubnetManagementDroppedPackets)).append("\n");
    sb.append("    txTotalBytes: ").append(toIndentedString(txTotalBytes)).append("\n");
    sb.append("    rxTotalBytes: ").append(toIndentedString(rxTotalBytes)).append("\n");
    sb.append("    txTotalPackets: ").append(toIndentedString(txTotalPackets)).append("\n");
    sb.append("    rxTotalPackets: ").append(toIndentedString(rxTotalPackets)).append("\n");
    sb.append("    txWaitTime: ").append(toIndentedString(txWaitTime)).append("\n");
    sb.append("    txUnicastTotalPackets: ").append(toIndentedString(txUnicastTotalPackets)).append("\n");
    sb.append("    rxUnicastTotalPackets: ").append(toIndentedString(rxUnicastTotalPackets)).append("\n");
    sb.append("    txMulticastTotalPackets: ").append(toIndentedString(txMulticastTotalPackets)).append("\n");
    sb.append("    rxMulticastTotalPackets: ").append(toIndentedString(rxMulticastTotalPackets)).append("\n");
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

