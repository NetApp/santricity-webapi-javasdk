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
 * EnhancedIbInterfaceStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class EnhancedIbInterfaceStatistics   {
  
    private String interfaceRef;

    private StatisticalContainer symbolErrors;

    private StatisticalContainer recoveredLinkErrors;

    private StatisticalContainer unrecoveredLinkErrors;

    private StatisticalContainer rxPacketErrors;

    private StatisticalContainer rxEbpDelimitedPackets;

    private StatisticalContainer txPortDownPacketDiscards;

    private StatisticalContainer txConstraintErrorPacketDiscards;

    private StatisticalContainer rxConstraintErrorPacketDiscards;

    private StatisticalContainer rxSubnetManagementDroppedPackets;

    private StatisticalContainer txTotalBytes;

    private StatisticalContainer rxTotalBytes;

    private StatisticalContainer txTotalPackets;

    private StatisticalContainer rxTotalPackets;

    private StatisticalContainer txWaitTime;

    private StatisticalContainer txUnicastTotalPackets;

    private StatisticalContainer rxUnicastTotalPackets;

    private StatisticalContainer txMulticastTotalPackets;

    private StatisticalContainer rxMulticastTotalPackets;

  
  /**
   * A reference to the interface for which the statistics apply.
   **/
  public EnhancedIbInterfaceStatistics interfaceRef(String interfaceRef) {
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
  public EnhancedIbInterfaceStatistics symbolErrors(StatisticalContainer symbolErrors) {
    this.symbolErrors = symbolErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of symbol errors.")
  @JsonProperty("symbolErrors")
  public StatisticalContainer getSymbolErrors() {
    return symbolErrors;
  }
  
  public void setSymbolErrors(StatisticalContainer symbolErrors) {
    this.symbolErrors = symbolErrors;
  }

  
  /**
   * The number of recovered link errors.
   **/
  public EnhancedIbInterfaceStatistics recoveredLinkErrors(StatisticalContainer recoveredLinkErrors) {
    this.recoveredLinkErrors = recoveredLinkErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of recovered link errors.")
  @JsonProperty("recoveredLinkErrors")
  public StatisticalContainer getRecoveredLinkErrors() {
    return recoveredLinkErrors;
  }
  
  public void setRecoveredLinkErrors(StatisticalContainer recoveredLinkErrors) {
    this.recoveredLinkErrors = recoveredLinkErrors;
  }

  
  /**
   * The number of unrecovered link errors.
   **/
  public EnhancedIbInterfaceStatistics unrecoveredLinkErrors(StatisticalContainer unrecoveredLinkErrors) {
    this.unrecoveredLinkErrors = unrecoveredLinkErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of unrecovered link errors.")
  @JsonProperty("unrecoveredLinkErrors")
  public StatisticalContainer getUnrecoveredLinkErrors() {
    return unrecoveredLinkErrors;
  }
  
  public void setUnrecoveredLinkErrors(StatisticalContainer unrecoveredLinkErrors) {
    this.unrecoveredLinkErrors = unrecoveredLinkErrors;
  }

  
  /**
   * The number of packets containing an error that have been received on the port.
   **/
  public EnhancedIbInterfaceStatistics rxPacketErrors(StatisticalContainer rxPacketErrors) {
    this.rxPacketErrors = rxPacketErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of packets containing an error that have been received on the port.")
  @JsonProperty("rxPacketErrors")
  public StatisticalContainer getRxPacketErrors() {
    return rxPacketErrors;
  }
  
  public void setRxPacketErrors(StatisticalContainer rxPacketErrors) {
    this.rxPacketErrors = rxPacketErrors;
  }

  
  /**
   * The total number of packets with End Bad Packet delimiter that have been received on the port.
   **/
  public EnhancedIbInterfaceStatistics rxEbpDelimitedPackets(StatisticalContainer rxEbpDelimitedPackets) {
    this.rxEbpDelimitedPackets = rxEbpDelimitedPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of packets with End Bad Packet delimiter that have been received on the port.")
  @JsonProperty("rxEbpDelimitedPackets")
  public StatisticalContainer getRxEbpDelimitedPackets() {
    return rxEbpDelimitedPackets;
  }
  
  public void setRxEbpDelimitedPackets(StatisticalContainer rxEbpDelimitedPackets) {
    this.rxEbpDelimitedPackets = rxEbpDelimitedPackets;
  }

  
  /**
   * The number of outbound packets discarded because the port is either down or congested.
   **/
  public EnhancedIbInterfaceStatistics txPortDownPacketDiscards(StatisticalContainer txPortDownPacketDiscards) {
    this.txPortDownPacketDiscards = txPortDownPacketDiscards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of outbound packets discarded because the port is either down or congested.")
  @JsonProperty("txPortDownPacketDiscards")
  public StatisticalContainer getTxPortDownPacketDiscards() {
    return txPortDownPacketDiscards;
  }
  
  public void setTxPortDownPacketDiscards(StatisticalContainer txPortDownPacketDiscards) {
    this.txPortDownPacketDiscards = txPortDownPacketDiscards;
  }

  
  /**
   * The number of outbound packets discarded because either (1) the packet is a raw datagram, (2) the packet has a wrong partition key, or (3) the packet has a bad transport header version.
   **/
  public EnhancedIbInterfaceStatistics txConstraintErrorPacketDiscards(StatisticalContainer txConstraintErrorPacketDiscards) {
    this.txConstraintErrorPacketDiscards = txConstraintErrorPacketDiscards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of outbound packets discarded because either (1) the packet is a raw datagram, (2) the packet has a wrong partition key, or (3) the packet has a bad transport header version.")
  @JsonProperty("txConstraintErrorPacketDiscards")
  public StatisticalContainer getTxConstraintErrorPacketDiscards() {
    return txConstraintErrorPacketDiscards;
  }
  
  public void setTxConstraintErrorPacketDiscards(StatisticalContainer txConstraintErrorPacketDiscards) {
    this.txConstraintErrorPacketDiscards = txConstraintErrorPacketDiscards;
  }

  
  /**
   * The number of inbound packets discarded because either (1) the packet is a raw datagram, (2) the packet has a wrong partition key, or (3) the packet has a bad transport header version.
   **/
  public EnhancedIbInterfaceStatistics rxConstraintErrorPacketDiscards(StatisticalContainer rxConstraintErrorPacketDiscards) {
    this.rxConstraintErrorPacketDiscards = rxConstraintErrorPacketDiscards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of inbound packets discarded because either (1) the packet is a raw datagram, (2) the packet has a wrong partition key, or (3) the packet has a bad transport header version.")
  @JsonProperty("rxConstraintErrorPacketDiscards")
  public StatisticalContainer getRxConstraintErrorPacketDiscards() {
    return rxConstraintErrorPacketDiscards;
  }
  
  public void setRxConstraintErrorPacketDiscards(StatisticalContainer rxConstraintErrorPacketDiscards) {
    this.rxConstraintErrorPacketDiscards = rxConstraintErrorPacketDiscards;
  }

  
  /**
   * The number of virtual lane 15 packets dropped due to resource limitations (e.g., lack of buffers) in the port.
   **/
  public EnhancedIbInterfaceStatistics rxSubnetManagementDroppedPackets(StatisticalContainer rxSubnetManagementDroppedPackets) {
    this.rxSubnetManagementDroppedPackets = rxSubnetManagementDroppedPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of virtual lane 15 packets dropped due to resource limitations (e.g., lack of buffers) in the port.")
  @JsonProperty("rxSubnetManagementDroppedPackets")
  public StatisticalContainer getRxSubnetManagementDroppedPackets() {
    return rxSubnetManagementDroppedPackets;
  }
  
  public void setRxSubnetManagementDroppedPackets(StatisticalContainer rxSubnetManagementDroppedPackets) {
    this.rxSubnetManagementDroppedPackets = rxSubnetManagementDroppedPackets;
  }

  
  /**
   * The number of bytes transmitted at the port on all virtual lanes.
   **/
  public EnhancedIbInterfaceStatistics txTotalBytes(StatisticalContainer txTotalBytes) {
    this.txTotalBytes = txTotalBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes transmitted at the port on all virtual lanes.")
  @JsonProperty("txTotalBytes")
  public StatisticalContainer getTxTotalBytes() {
    return txTotalBytes;
  }
  
  public void setTxTotalBytes(StatisticalContainer txTotalBytes) {
    this.txTotalBytes = txTotalBytes;
  }

  
  /**
   * The number of bytes received at the port on all virtual lanes.
   **/
  public EnhancedIbInterfaceStatistics rxTotalBytes(StatisticalContainer rxTotalBytes) {
    this.rxTotalBytes = rxTotalBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes received at the port on all virtual lanes.")
  @JsonProperty("rxTotalBytes")
  public StatisticalContainer getRxTotalBytes() {
    return rxTotalBytes;
  }
  
  public void setRxTotalBytes(StatisticalContainer rxTotalBytes) {
    this.rxTotalBytes = rxTotalBytes;
  }

  
  /**
   * The number of packets transmitted at the port on all virtual lanes.
   **/
  public EnhancedIbInterfaceStatistics txTotalPackets(StatisticalContainer txTotalPackets) {
    this.txTotalPackets = txTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of packets transmitted at the port on all virtual lanes.")
  @JsonProperty("txTotalPackets")
  public StatisticalContainer getTxTotalPackets() {
    return txTotalPackets;
  }
  
  public void setTxTotalPackets(StatisticalContainer txTotalPackets) {
    this.txTotalPackets = txTotalPackets;
  }

  
  /**
   * The number of packets received at the port on all virtual lanes.
   **/
  public EnhancedIbInterfaceStatistics rxTotalPackets(StatisticalContainer rxTotalPackets) {
    this.rxTotalPackets = rxTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of packets received at the port on all virtual lanes.")
  @JsonProperty("rxTotalPackets")
  public StatisticalContainer getRxTotalPackets() {
    return rxTotalPackets;
  }
  
  public void setRxTotalPackets(StatisticalContainer rxTotalPackets) {
    this.rxTotalPackets = rxTotalPackets;
  }

  
  /**
   * The number of microseconds during which the port had data to transmit, but none was sent because of insufficient credits or due to arbitration.
   **/
  public EnhancedIbInterfaceStatistics txWaitTime(StatisticalContainer txWaitTime) {
    this.txWaitTime = txWaitTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of microseconds during which the port had data to transmit, but none was sent because of insufficient credits or due to arbitration.")
  @JsonProperty("txWaitTime")
  public StatisticalContainer getTxWaitTime() {
    return txWaitTime;
  }
  
  public void setTxWaitTime(StatisticalContainer txWaitTime) {
    this.txWaitTime = txWaitTime;
  }

  
  /**
   * Total number of unicast packets transmitted on all VLs from the port. This may include unicast packets with errors and excludes link packets.
   **/
  public EnhancedIbInterfaceStatistics txUnicastTotalPackets(StatisticalContainer txUnicastTotalPackets) {
    this.txUnicastTotalPackets = txUnicastTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of unicast packets transmitted on all VLs from the port. This may include unicast packets with errors and excludes link packets.")
  @JsonProperty("txUnicastTotalPackets")
  public StatisticalContainer getTxUnicastTotalPackets() {
    return txUnicastTotalPackets;
  }
  
  public void setTxUnicastTotalPackets(StatisticalContainer txUnicastTotalPackets) {
    this.txUnicastTotalPackets = txUnicastTotalPackets;
  }

  
  /**
   * Total number of unicast packets, including unicast packets containing errors, and excluding link packets, received from all VLs on the port.
   **/
  public EnhancedIbInterfaceStatistics rxUnicastTotalPackets(StatisticalContainer rxUnicastTotalPackets) {
    this.rxUnicastTotalPackets = rxUnicastTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of unicast packets, including unicast packets containing errors, and excluding link packets, received from all VLs on the port.")
  @JsonProperty("rxUnicastTotalPackets")
  public StatisticalContainer getRxUnicastTotalPackets() {
    return rxUnicastTotalPackets;
  }
  
  public void setRxUnicastTotalPackets(StatisticalContainer rxUnicastTotalPackets) {
    this.rxUnicastTotalPackets = rxUnicastTotalPackets;
  }

  
  /**
   * Total number of multicast packets transmitted on all VLs from the port. This may include multicast packets with errors.
   **/
  public EnhancedIbInterfaceStatistics txMulticastTotalPackets(StatisticalContainer txMulticastTotalPackets) {
    this.txMulticastTotalPackets = txMulticastTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of multicast packets transmitted on all VLs from the port. This may include multicast packets with errors.")
  @JsonProperty("txMulticastTotalPackets")
  public StatisticalContainer getTxMulticastTotalPackets() {
    return txMulticastTotalPackets;
  }
  
  public void setTxMulticastTotalPackets(StatisticalContainer txMulticastTotalPackets) {
    this.txMulticastTotalPackets = txMulticastTotalPackets;
  }

  
  /**
   * Total number of multicast packets, including multicast packets containing errors received from all VLs on the port.
   **/
  public EnhancedIbInterfaceStatistics rxMulticastTotalPackets(StatisticalContainer rxMulticastTotalPackets) {
    this.rxMulticastTotalPackets = rxMulticastTotalPackets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of multicast packets, including multicast packets containing errors received from all VLs on the port.")
  @JsonProperty("rxMulticastTotalPackets")
  public StatisticalContainer getRxMulticastTotalPackets() {
    return rxMulticastTotalPackets;
  }
  
  public void setRxMulticastTotalPackets(StatisticalContainer rxMulticastTotalPackets) {
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
    EnhancedIbInterfaceStatistics enhancedIbInterfaceStatistics = (EnhancedIbInterfaceStatistics) o;
    return Objects.equals(this.interfaceRef, enhancedIbInterfaceStatistics.interfaceRef) &&
        Objects.equals(this.symbolErrors, enhancedIbInterfaceStatistics.symbolErrors) &&
        Objects.equals(this.recoveredLinkErrors, enhancedIbInterfaceStatistics.recoveredLinkErrors) &&
        Objects.equals(this.unrecoveredLinkErrors, enhancedIbInterfaceStatistics.unrecoveredLinkErrors) &&
        Objects.equals(this.rxPacketErrors, enhancedIbInterfaceStatistics.rxPacketErrors) &&
        Objects.equals(this.rxEbpDelimitedPackets, enhancedIbInterfaceStatistics.rxEbpDelimitedPackets) &&
        Objects.equals(this.txPortDownPacketDiscards, enhancedIbInterfaceStatistics.txPortDownPacketDiscards) &&
        Objects.equals(this.txConstraintErrorPacketDiscards, enhancedIbInterfaceStatistics.txConstraintErrorPacketDiscards) &&
        Objects.equals(this.rxConstraintErrorPacketDiscards, enhancedIbInterfaceStatistics.rxConstraintErrorPacketDiscards) &&
        Objects.equals(this.rxSubnetManagementDroppedPackets, enhancedIbInterfaceStatistics.rxSubnetManagementDroppedPackets) &&
        Objects.equals(this.txTotalBytes, enhancedIbInterfaceStatistics.txTotalBytes) &&
        Objects.equals(this.rxTotalBytes, enhancedIbInterfaceStatistics.rxTotalBytes) &&
        Objects.equals(this.txTotalPackets, enhancedIbInterfaceStatistics.txTotalPackets) &&
        Objects.equals(this.rxTotalPackets, enhancedIbInterfaceStatistics.rxTotalPackets) &&
        Objects.equals(this.txWaitTime, enhancedIbInterfaceStatistics.txWaitTime) &&
        Objects.equals(this.txUnicastTotalPackets, enhancedIbInterfaceStatistics.txUnicastTotalPackets) &&
        Objects.equals(this.rxUnicastTotalPackets, enhancedIbInterfaceStatistics.rxUnicastTotalPackets) &&
        Objects.equals(this.txMulticastTotalPackets, enhancedIbInterfaceStatistics.txMulticastTotalPackets) &&
        Objects.equals(this.rxMulticastTotalPackets, enhancedIbInterfaceStatistics.rxMulticastTotalPackets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceRef, symbolErrors, recoveredLinkErrors, unrecoveredLinkErrors, rxPacketErrors, rxEbpDelimitedPackets, txPortDownPacketDiscards, txConstraintErrorPacketDiscards, rxConstraintErrorPacketDiscards, rxSubnetManagementDroppedPackets, txTotalBytes, rxTotalBytes, txTotalPackets, rxTotalPackets, txWaitTime, txUnicastTotalPackets, rxUnicastTotalPackets, txMulticastTotalPackets, rxMulticastTotalPackets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedIbInterfaceStatistics {\n");
    
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

