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
 * TcpStatisticalData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class TcpStatisticalData   {
  
    private List<String> interfaces;

    private Long receivedSegments;

    private Long sentSegments;

    private Long receivedSegmentsInError;

    private Long txByteCount;

    private Long rxByteCount;

    private Long retransmitTimerExpiredCount;

    private Long rxDuplicateAckCount;

    private Long rxAckCount;

    private Long txDelayedAckCount;

    private Long txAckCount;

    private Long rxSegmentOutOfOrderCount;

    private Long rxWindowProbeCount;

    private Long rxWindowUpdateCount;

  
  /**
   * The interface(s) for which the statistics apply. In some cases, the statistics may be aggregated across multiple interfaces. Even though this is shown as an array, it will only be a single instance.
   **/
  public TcpStatisticalData interfaces(List<String> interfaces) {
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
   * The total number of segments received.
   **/
  public TcpStatisticalData receivedSegments(Long receivedSegments) {
    this.receivedSegments = receivedSegments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of segments received.")
  @JsonProperty("receivedSegments")
  public Long getReceivedSegments() {
    return receivedSegments;
  }
  
  public void setReceivedSegments(Long receivedSegments) {
    this.receivedSegments = receivedSegments;
  }

  
  /**
   * The total number of segments sent.
   **/
  public TcpStatisticalData sentSegments(Long sentSegments) {
    this.sentSegments = sentSegments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of segments sent.")
  @JsonProperty("sentSegments")
  public Long getSentSegments() {
    return sentSegments;
  }
  
  public void setSentSegments(Long sentSegments) {
    this.sentSegments = sentSegments;
  }

  
  /**
   * The total number of segments received in error.
   **/
  public TcpStatisticalData receivedSegmentsInError(Long receivedSegmentsInError) {
    this.receivedSegmentsInError = receivedSegmentsInError;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of segments received in error.")
  @JsonProperty("receivedSegmentsInError")
  public Long getReceivedSegmentsInError() {
    return receivedSegmentsInError;
  }
  
  public void setReceivedSegmentsInError(Long receivedSegmentsInError) {
    this.receivedSegmentsInError = receivedSegmentsInError;
  }

  
  /**
   * The number of data payload bytes transmitted in TCP segments.
   **/
  public TcpStatisticalData txByteCount(Long txByteCount) {
    this.txByteCount = txByteCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of data payload bytes transmitted in TCP segments.")
  @JsonProperty("txByteCount")
  public Long getTxByteCount() {
    return txByteCount;
  }
  
  public void setTxByteCount(Long txByteCount) {
    this.txByteCount = txByteCount;
  }

  
  /**
   * The number of data payload bytes received in TCP segments.
   **/
  public TcpStatisticalData rxByteCount(Long rxByteCount) {
    this.rxByteCount = rxByteCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of data payload bytes received in TCP segments.")
  @JsonProperty("rxByteCount")
  public Long getRxByteCount() {
    return rxByteCount;
  }
  
  public void setRxByteCount(Long rxByteCount) {
    this.rxByteCount = rxByteCount;
  }

  
  /**
   * The number of times the retransmit timer expired and a frame was retransmitted.
   **/
  public TcpStatisticalData retransmitTimerExpiredCount(Long retransmitTimerExpiredCount) {
    this.retransmitTimerExpiredCount = retransmitTimerExpiredCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times the retransmit timer expired and a frame was retransmitted.")
  @JsonProperty("retransmitTimerExpiredCount")
  public Long getRetransmitTimerExpiredCount() {
    return retransmitTimerExpiredCount;
  }
  
  public void setRetransmitTimerExpiredCount(Long retransmitTimerExpiredCount) {
    this.retransmitTimerExpiredCount = retransmitTimerExpiredCount;
  }

  
  /**
   * The number of duplicate ACKs received.
   **/
  public TcpStatisticalData rxDuplicateAckCount(Long rxDuplicateAckCount) {
    this.rxDuplicateAckCount = rxDuplicateAckCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of duplicate ACKs received.")
  @JsonProperty("rxDuplicateAckCount")
  public Long getRxDuplicateAckCount() {
    return rxDuplicateAckCount;
  }
  
  public void setRxDuplicateAckCount(Long rxDuplicateAckCount) {
    this.rxDuplicateAckCount = rxDuplicateAckCount;
  }

  
  /**
   * The number of pure ACKs received.
   **/
  public TcpStatisticalData rxAckCount(Long rxAckCount) {
    this.rxAckCount = rxAckCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of pure ACKs received.")
  @JsonProperty("rxAckCount")
  public Long getRxAckCount() {
    return rxAckCount;
  }
  
  public void setRxAckCount(Long rxAckCount) {
    this.rxAckCount = rxAckCount;
  }

  
  /**
   * The number of delayed ACKs transmitted.
   **/
  public TcpStatisticalData txDelayedAckCount(Long txDelayedAckCount) {
    this.txDelayedAckCount = txDelayedAckCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of delayed ACKs transmitted.")
  @JsonProperty("txDelayedAckCount")
  public Long getTxDelayedAckCount() {
    return txDelayedAckCount;
  }
  
  public void setTxDelayedAckCount(Long txDelayedAckCount) {
    this.txDelayedAckCount = txDelayedAckCount;
  }

  
  /**
   * The number of pure ACKs transmitted.
   **/
  public TcpStatisticalData txAckCount(Long txAckCount) {
    this.txAckCount = txAckCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of pure ACKs transmitted.")
  @JsonProperty("txAckCount")
  public Long getTxAckCount() {
    return txAckCount;
  }
  
  public void setTxAckCount(Long txAckCount) {
    this.txAckCount = txAckCount;
  }

  
  /**
   * The number of TCP segments received that were out of order.
   **/
  public TcpStatisticalData rxSegmentOutOfOrderCount(Long rxSegmentOutOfOrderCount) {
    this.rxSegmentOutOfOrderCount = rxSegmentOutOfOrderCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of TCP segments received that were out of order.")
  @JsonProperty("rxSegmentOutOfOrderCount")
  public Long getRxSegmentOutOfOrderCount() {
    return rxSegmentOutOfOrderCount;
  }
  
  public void setRxSegmentOutOfOrderCount(Long rxSegmentOutOfOrderCount) {
    this.rxSegmentOutOfOrderCount = rxSegmentOutOfOrderCount;
  }

  
  /**
   * The number of window probes received.
   **/
  public TcpStatisticalData rxWindowProbeCount(Long rxWindowProbeCount) {
    this.rxWindowProbeCount = rxWindowProbeCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of window probes received.")
  @JsonProperty("rxWindowProbeCount")
  public Long getRxWindowProbeCount() {
    return rxWindowProbeCount;
  }
  
  public void setRxWindowProbeCount(Long rxWindowProbeCount) {
    this.rxWindowProbeCount = rxWindowProbeCount;
  }

  
  /**
   * The number of window updates received.
   **/
  public TcpStatisticalData rxWindowUpdateCount(Long rxWindowUpdateCount) {
    this.rxWindowUpdateCount = rxWindowUpdateCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of window updates received.")
  @JsonProperty("rxWindowUpdateCount")
  public Long getRxWindowUpdateCount() {
    return rxWindowUpdateCount;
  }
  
  public void setRxWindowUpdateCount(Long rxWindowUpdateCount) {
    this.rxWindowUpdateCount = rxWindowUpdateCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TcpStatisticalData tcpStatisticalData = (TcpStatisticalData) o;
    return Objects.equals(this.interfaces, tcpStatisticalData.interfaces) &&
        Objects.equals(this.receivedSegments, tcpStatisticalData.receivedSegments) &&
        Objects.equals(this.sentSegments, tcpStatisticalData.sentSegments) &&
        Objects.equals(this.receivedSegmentsInError, tcpStatisticalData.receivedSegmentsInError) &&
        Objects.equals(this.txByteCount, tcpStatisticalData.txByteCount) &&
        Objects.equals(this.rxByteCount, tcpStatisticalData.rxByteCount) &&
        Objects.equals(this.retransmitTimerExpiredCount, tcpStatisticalData.retransmitTimerExpiredCount) &&
        Objects.equals(this.rxDuplicateAckCount, tcpStatisticalData.rxDuplicateAckCount) &&
        Objects.equals(this.rxAckCount, tcpStatisticalData.rxAckCount) &&
        Objects.equals(this.txDelayedAckCount, tcpStatisticalData.txDelayedAckCount) &&
        Objects.equals(this.txAckCount, tcpStatisticalData.txAckCount) &&
        Objects.equals(this.rxSegmentOutOfOrderCount, tcpStatisticalData.rxSegmentOutOfOrderCount) &&
        Objects.equals(this.rxWindowProbeCount, tcpStatisticalData.rxWindowProbeCount) &&
        Objects.equals(this.rxWindowUpdateCount, tcpStatisticalData.rxWindowUpdateCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaces, receivedSegments, sentSegments, receivedSegmentsInError, txByteCount, rxByteCount, retransmitTimerExpiredCount, rxDuplicateAckCount, rxAckCount, txDelayedAckCount, txAckCount, rxSegmentOutOfOrderCount, rxWindowProbeCount, rxWindowUpdateCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TcpStatisticalData {\n");
    
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("    receivedSegments: ").append(toIndentedString(receivedSegments)).append("\n");
    sb.append("    sentSegments: ").append(toIndentedString(sentSegments)).append("\n");
    sb.append("    receivedSegmentsInError: ").append(toIndentedString(receivedSegmentsInError)).append("\n");
    sb.append("    txByteCount: ").append(toIndentedString(txByteCount)).append("\n");
    sb.append("    rxByteCount: ").append(toIndentedString(rxByteCount)).append("\n");
    sb.append("    retransmitTimerExpiredCount: ").append(toIndentedString(retransmitTimerExpiredCount)).append("\n");
    sb.append("    rxDuplicateAckCount: ").append(toIndentedString(rxDuplicateAckCount)).append("\n");
    sb.append("    rxAckCount: ").append(toIndentedString(rxAckCount)).append("\n");
    sb.append("    txDelayedAckCount: ").append(toIndentedString(txDelayedAckCount)).append("\n");
    sb.append("    txAckCount: ").append(toIndentedString(txAckCount)).append("\n");
    sb.append("    rxSegmentOutOfOrderCount: ").append(toIndentedString(rxSegmentOutOfOrderCount)).append("\n");
    sb.append("    rxWindowProbeCount: ").append(toIndentedString(rxWindowProbeCount)).append("\n");
    sb.append("    rxWindowUpdateCount: ").append(toIndentedString(rxWindowUpdateCount)).append("\n");
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

