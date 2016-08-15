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
 * EthernetPortStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class EthernetPortStatistics   {
  
    private List<String> interfaces;

    private Long bytesTransmitted;

    private Long bytesReceived;

    private Long packetsTransmitted;

    private Long packetsReceived;

    private Long carrierSenseErrors;

    private Long singleCollisionFrames;

    private Long multipleCollisionFrames;

    private Long lateCollisions;

    private Long deferredTransmissions;

    private Long frameTooLongs;

    private Long txMulticastFrameCount;

    private Long txBroadcastFrameCount;

    private Long txPauseFrameCount;

    private Long txControlFrameCount;

    private Long txFrameExcessDeferralCount;

    private Long txFrameAbortCount;

    private Long txFrameCollisionCount;

    private Long txFrameDroppedCount;

    private Long txJumboFrameCount;

    private Long rxUnknownControlFrameCount;

    private Long rxPauseFrameCount;

    private Long rxControlFrameCount;

    private Long rxFrameLengthErrorCount;

    private Long rxJabberCount;

    private Long rxFrameDropedCount;

    private Long rxFrameCrcErrorCount;

    private Long rxFrameEncodingErrorCount;

    private Long rxSmallFrameErrorCount;

    private Long rxMulticastFrameCount;

    private Long rxBroadcastFrameCount;

  
  /**
   * The interface(s) for which the statistics apply. In some cases, the statistics may be aggregated across multiple interfaces. Even though this is shown as an array, it will only be a single instance.
   **/
  public EthernetPortStatistics interfaces(List<String> interfaces) {
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
   * The total number of bytes transmitted.
   **/
  public EthernetPortStatistics bytesTransmitted(Long bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of bytes transmitted.")
  @JsonProperty("bytesTransmitted")
  public Long getBytesTransmitted() {
    return bytesTransmitted;
  }
  
  public void setBytesTransmitted(Long bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
  }

  
  /**
   * The total number of bytes received.
   **/
  public EthernetPortStatistics bytesReceived(Long bytesReceived) {
    this.bytesReceived = bytesReceived;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of bytes received.")
  @JsonProperty("bytesReceived")
  public Long getBytesReceived() {
    return bytesReceived;
  }
  
  public void setBytesReceived(Long bytesReceived) {
    this.bytesReceived = bytesReceived;
  }

  
  /**
   * Total number of packets transmitted.
   **/
  public EthernetPortStatistics packetsTransmitted(Long packetsTransmitted) {
    this.packetsTransmitted = packetsTransmitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of packets transmitted.")
  @JsonProperty("packetsTransmitted")
  public Long getPacketsTransmitted() {
    return packetsTransmitted;
  }
  
  public void setPacketsTransmitted(Long packetsTransmitted) {
    this.packetsTransmitted = packetsTransmitted;
  }

  
  /**
   * Total number of packets received.
   **/
  public EthernetPortStatistics packetsReceived(Long packetsReceived) {
    this.packetsReceived = packetsReceived;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of packets received.")
  @JsonProperty("packetsReceived")
  public Long getPacketsReceived() {
    return packetsReceived;
  }
  
  public void setPacketsReceived(Long packetsReceived) {
    this.packetsReceived = packetsReceived;
  }

  
  /**
   * The number of times the carrier sense condition was lost or never asserted when attempting to transmit a frame.
   **/
  public EthernetPortStatistics carrierSenseErrors(Long carrierSenseErrors) {
    this.carrierSenseErrors = carrierSenseErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times the carrier sense condition was lost or never asserted when attempting to transmit a frame.")
  @JsonProperty("carrierSenseErrors")
  public Long getCarrierSenseErrors() {
    return carrierSenseErrors;
  }
  
  public void setCarrierSenseErrors(Long carrierSenseErrors) {
    this.carrierSenseErrors = carrierSenseErrors;
  }

  
  /**
   * The number of successfully-transmitted frames for which transmission is inhibited by a single collision.
   **/
  public EthernetPortStatistics singleCollisionFrames(Long singleCollisionFrames) {
    this.singleCollisionFrames = singleCollisionFrames;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of successfully-transmitted frames for which transmission is inhibited by a single collision.")
  @JsonProperty("singleCollisionFrames")
  public Long getSingleCollisionFrames() {
    return singleCollisionFrames;
  }
  
  public void setSingleCollisionFrames(Long singleCollisionFrames) {
    this.singleCollisionFrames = singleCollisionFrames;
  }

  
  /**
   * The number of successfully-transmitted frames for which transmission is inhibited by multiple collisions.
   **/
  public EthernetPortStatistics multipleCollisionFrames(Long multipleCollisionFrames) {
    this.multipleCollisionFrames = multipleCollisionFrames;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of successfully-transmitted frames for which transmission is inhibited by multiple collisions.")
  @JsonProperty("multipleCollisionFrames")
  public Long getMultipleCollisionFrames() {
    return multipleCollisionFrames;
  }
  
  public void setMultipleCollisionFrames(Long multipleCollisionFrames) {
    this.multipleCollisionFrames = multipleCollisionFrames;
  }

  
  /**
   * The number of times a collision is detected later than 512 bit-times into the transmission of a packet.
   **/
  public EthernetPortStatistics lateCollisions(Long lateCollisions) {
    this.lateCollisions = lateCollisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times a collision is detected later than 512 bit-times into the transmission of a packet.")
  @JsonProperty("lateCollisions")
  public Long getLateCollisions() {
    return lateCollisions;
  }
  
  public void setLateCollisions(Long lateCollisions) {
    this.lateCollisions = lateCollisions;
  }

  
  /**
   * The number of frames for which the first transmission attempt is delayed because the medium is busy.
   **/
  public EthernetPortStatistics deferredTransmissions(Long deferredTransmissions) {
    this.deferredTransmissions = deferredTransmissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of frames for which the first transmission attempt is delayed because the medium is busy.")
  @JsonProperty("deferredTransmissions")
  public Long getDeferredTransmissions() {
    return deferredTransmissions;
  }
  
  public void setDeferredTransmissions(Long deferredTransmissions) {
    this.deferredTransmissions = deferredTransmissions;
  }

  
  /**
   * The number of received frames that exceed the maximum permitted frame size.
   **/
  public EthernetPortStatistics frameTooLongs(Long frameTooLongs) {
    this.frameTooLongs = frameTooLongs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of received frames that exceed the maximum permitted frame size.")
  @JsonProperty("frameTooLongs")
  public Long getFrameTooLongs() {
    return frameTooLongs;
  }
  
  public void setFrameTooLongs(Long frameTooLongs) {
    this.frameTooLongs = frameTooLongs;
  }

  
  /**
   * The number of multicast frames transmitted over the interface.
   **/
  public EthernetPortStatistics txMulticastFrameCount(Long txMulticastFrameCount) {
    this.txMulticastFrameCount = txMulticastFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of multicast frames transmitted over the interface.")
  @JsonProperty("txMulticastFrameCount")
  public Long getTxMulticastFrameCount() {
    return txMulticastFrameCount;
  }
  
  public void setTxMulticastFrameCount(Long txMulticastFrameCount) {
    this.txMulticastFrameCount = txMulticastFrameCount;
  }

  
  /**
   * The number of broadcast frames transmitted over the interface.
   **/
  public EthernetPortStatistics txBroadcastFrameCount(Long txBroadcastFrameCount) {
    this.txBroadcastFrameCount = txBroadcastFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of broadcast frames transmitted over the interface.")
  @JsonProperty("txBroadcastFrameCount")
  public Long getTxBroadcastFrameCount() {
    return txBroadcastFrameCount;
  }
  
  public void setTxBroadcastFrameCount(Long txBroadcastFrameCount) {
    this.txBroadcastFrameCount = txBroadcastFrameCount;
  }

  
  /**
   * The number of pause frames transmitted over the interface.
   **/
  public EthernetPortStatistics txPauseFrameCount(Long txPauseFrameCount) {
    this.txPauseFrameCount = txPauseFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of pause frames transmitted over the interface.")
  @JsonProperty("txPauseFrameCount")
  public Long getTxPauseFrameCount() {
    return txPauseFrameCount;
  }
  
  public void setTxPauseFrameCount(Long txPauseFrameCount) {
    this.txPauseFrameCount = txPauseFrameCount;
  }

  
  /**
   * The number of control frames transmitted over the interface.
   **/
  public EthernetPortStatistics txControlFrameCount(Long txControlFrameCount) {
    this.txControlFrameCount = txControlFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of control frames transmitted over the interface.")
  @JsonProperty("txControlFrameCount")
  public Long getTxControlFrameCount() {
    return txControlFrameCount;
  }
  
  public void setTxControlFrameCount(Long txControlFrameCount) {
    this.txControlFrameCount = txControlFrameCount;
  }

  
  /**
   * The number of frames which experienced deferred transmission for an excessive period of time.
   **/
  public EthernetPortStatistics txFrameExcessDeferralCount(Long txFrameExcessDeferralCount) {
    this.txFrameExcessDeferralCount = txFrameExcessDeferralCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of frames which experienced deferred transmission for an excessive period of time.")
  @JsonProperty("txFrameExcessDeferralCount")
  public Long getTxFrameExcessDeferralCount() {
    return txFrameExcessDeferralCount;
  }
  
  public void setTxFrameExcessDeferralCount(Long txFrameExcessDeferralCount) {
    this.txFrameExcessDeferralCount = txFrameExcessDeferralCount;
  }

  
  /**
   * The number of aborts that occurred while transmitting.
   **/
  public EthernetPortStatistics txFrameAbortCount(Long txFrameAbortCount) {
    this.txFrameAbortCount = txFrameAbortCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of aborts that occurred while transmitting.")
  @JsonProperty("txFrameAbortCount")
  public Long getTxFrameAbortCount() {
    return txFrameAbortCount;
  }
  
  public void setTxFrameAbortCount(Long txFrameAbortCount) {
    this.txFrameAbortCount = txFrameAbortCount;
  }

  
  /**
   * The number of frames that could not be sent due to a single or multiple collisions.
   **/
  public EthernetPortStatistics txFrameCollisionCount(Long txFrameCollisionCount) {
    this.txFrameCollisionCount = txFrameCollisionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of frames that could not be sent due to a single or multiple collisions.")
  @JsonProperty("txFrameCollisionCount")
  public Long getTxFrameCollisionCount() {
    return txFrameCollisionCount;
  }
  
  public void setTxFrameCollisionCount(Long txFrameCollisionCount) {
    this.txFrameCollisionCount = txFrameCollisionCount;
  }

  
  /**
   * The number of frames that were dropped because the transmit FIFO was full.
   **/
  public EthernetPortStatistics txFrameDroppedCount(Long txFrameDroppedCount) {
    this.txFrameDroppedCount = txFrameDroppedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of frames that were dropped because the transmit FIFO was full.")
  @JsonProperty("txFrameDroppedCount")
  public Long getTxFrameDroppedCount() {
    return txFrameDroppedCount;
  }
  
  public void setTxFrameDroppedCount(Long txFrameDroppedCount) {
    this.txFrameDroppedCount = txFrameDroppedCount;
  }

  
  /**
   * The number of jumbo frames transmitted over the interface.
   **/
  public EthernetPortStatistics txJumboFrameCount(Long txJumboFrameCount) {
    this.txJumboFrameCount = txJumboFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of jumbo frames transmitted over the interface.")
  @JsonProperty("txJumboFrameCount")
  public Long getTxJumboFrameCount() {
    return txJumboFrameCount;
  }
  
  public void setTxJumboFrameCount(Long txJumboFrameCount) {
    this.txJumboFrameCount = txJumboFrameCount;
  }

  
  /**
   * The number of control frames received with unknown op codes.
   **/
  public EthernetPortStatistics rxUnknownControlFrameCount(Long rxUnknownControlFrameCount) {
    this.rxUnknownControlFrameCount = rxUnknownControlFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of control frames received with unknown op codes.")
  @JsonProperty("rxUnknownControlFrameCount")
  public Long getRxUnknownControlFrameCount() {
    return rxUnknownControlFrameCount;
  }
  
  public void setRxUnknownControlFrameCount(Long rxUnknownControlFrameCount) {
    this.rxUnknownControlFrameCount = rxUnknownControlFrameCount;
  }

  
  /**
   * The number of pause frames received over the interface.
   **/
  public EthernetPortStatistics rxPauseFrameCount(Long rxPauseFrameCount) {
    this.rxPauseFrameCount = rxPauseFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of pause frames received over the interface.")
  @JsonProperty("rxPauseFrameCount")
  public Long getRxPauseFrameCount() {
    return rxPauseFrameCount;
  }
  
  public void setRxPauseFrameCount(Long rxPauseFrameCount) {
    this.rxPauseFrameCount = rxPauseFrameCount;
  }

  
  /**
   * The number of control frames received over the interface.
   **/
  public EthernetPortStatistics rxControlFrameCount(Long rxControlFrameCount) {
    this.rxControlFrameCount = rxControlFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of control frames received over the interface.")
  @JsonProperty("rxControlFrameCount")
  public Long getRxControlFrameCount() {
    return rxControlFrameCount;
  }
  
  public void setRxControlFrameCount(Long rxControlFrameCount) {
    this.rxControlFrameCount = rxControlFrameCount;
  }

  
  /**
   * The number of frames received with 802.3 frame length errors.
   **/
  public EthernetPortStatistics rxFrameLengthErrorCount(Long rxFrameLengthErrorCount) {
    this.rxFrameLengthErrorCount = rxFrameLengthErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of frames received with 802.3 frame length errors.")
  @JsonProperty("rxFrameLengthErrorCount")
  public Long getRxFrameLengthErrorCount() {
    return rxFrameLengthErrorCount;
  }
  
  public void setRxFrameLengthErrorCount(Long rxFrameLengthErrorCount) {
    this.rxFrameLengthErrorCount = rxFrameLengthErrorCount;
  }

  
  /**
   * The number of jabber errors detected.
   **/
  public EthernetPortStatistics rxJabberCount(Long rxJabberCount) {
    this.rxJabberCount = rxJabberCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of jabber errors detected.")
  @JsonProperty("rxJabberCount")
  public Long getRxJabberCount() {
    return rxJabberCount;
  }
  
  public void setRxJabberCount(Long rxJabberCount) {
    this.rxJabberCount = rxJabberCount;
  }

  
  /**
   * Received frames that were dropped.
   **/
  public EthernetPortStatistics rxFrameDropedCount(Long rxFrameDropedCount) {
    this.rxFrameDropedCount = rxFrameDropedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Received frames that were dropped.")
  @JsonProperty("rxFrameDropedCount")
  public Long getRxFrameDropedCount() {
    return rxFrameDropedCount;
  }
  
  public void setRxFrameDropedCount(Long rxFrameDropedCount) {
    this.rxFrameDropedCount = rxFrameDropedCount;
  }

  
  /**
   * The number of frames received and discarded with a CRC error.
   **/
  public EthernetPortStatistics rxFrameCrcErrorCount(Long rxFrameCrcErrorCount) {
    this.rxFrameCrcErrorCount = rxFrameCrcErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of frames received and discarded with a CRC error.")
  @JsonProperty("rxFrameCrcErrorCount")
  public Long getRxFrameCrcErrorCount() {
    return rxFrameCrcErrorCount;
  }
  
  public void setRxFrameCrcErrorCount(Long rxFrameCrcErrorCount) {
    this.rxFrameCrcErrorCount = rxFrameCrcErrorCount;
  }

  
  /**
   * The number of frames received with encoding errors.
   **/
  public EthernetPortStatistics rxFrameEncodingErrorCount(Long rxFrameEncodingErrorCount) {
    this.rxFrameEncodingErrorCount = rxFrameEncodingErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of frames received with encoding errors.")
  @JsonProperty("rxFrameEncodingErrorCount")
  public Long getRxFrameEncodingErrorCount() {
    return rxFrameEncodingErrorCount;
  }
  
  public void setRxFrameEncodingErrorCount(Long rxFrameEncodingErrorCount) {
    this.rxFrameEncodingErrorCount = rxFrameEncodingErrorCount;
  }

  
  /**
   * The number of frames received that are smaller than the minimum size allowed (64 bytes).
   **/
  public EthernetPortStatistics rxSmallFrameErrorCount(Long rxSmallFrameErrorCount) {
    this.rxSmallFrameErrorCount = rxSmallFrameErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of frames received that are smaller than the minimum size allowed (64 bytes).")
  @JsonProperty("rxSmallFrameErrorCount")
  public Long getRxSmallFrameErrorCount() {
    return rxSmallFrameErrorCount;
  }
  
  public void setRxSmallFrameErrorCount(Long rxSmallFrameErrorCount) {
    this.rxSmallFrameErrorCount = rxSmallFrameErrorCount;
  }

  
  /**
   * The number of multicast frames received over the interface.
   **/
  public EthernetPortStatistics rxMulticastFrameCount(Long rxMulticastFrameCount) {
    this.rxMulticastFrameCount = rxMulticastFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of multicast frames received over the interface.")
  @JsonProperty("rxMulticastFrameCount")
  public Long getRxMulticastFrameCount() {
    return rxMulticastFrameCount;
  }
  
  public void setRxMulticastFrameCount(Long rxMulticastFrameCount) {
    this.rxMulticastFrameCount = rxMulticastFrameCount;
  }

  
  /**
   * The number of broadcast frames received over the interface.
   **/
  public EthernetPortStatistics rxBroadcastFrameCount(Long rxBroadcastFrameCount) {
    this.rxBroadcastFrameCount = rxBroadcastFrameCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of broadcast frames received over the interface.")
  @JsonProperty("rxBroadcastFrameCount")
  public Long getRxBroadcastFrameCount() {
    return rxBroadcastFrameCount;
  }
  
  public void setRxBroadcastFrameCount(Long rxBroadcastFrameCount) {
    this.rxBroadcastFrameCount = rxBroadcastFrameCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthernetPortStatistics ethernetPortStatistics = (EthernetPortStatistics) o;
    return Objects.equals(this.interfaces, ethernetPortStatistics.interfaces) &&
        Objects.equals(this.bytesTransmitted, ethernetPortStatistics.bytesTransmitted) &&
        Objects.equals(this.bytesReceived, ethernetPortStatistics.bytesReceived) &&
        Objects.equals(this.packetsTransmitted, ethernetPortStatistics.packetsTransmitted) &&
        Objects.equals(this.packetsReceived, ethernetPortStatistics.packetsReceived) &&
        Objects.equals(this.carrierSenseErrors, ethernetPortStatistics.carrierSenseErrors) &&
        Objects.equals(this.singleCollisionFrames, ethernetPortStatistics.singleCollisionFrames) &&
        Objects.equals(this.multipleCollisionFrames, ethernetPortStatistics.multipleCollisionFrames) &&
        Objects.equals(this.lateCollisions, ethernetPortStatistics.lateCollisions) &&
        Objects.equals(this.deferredTransmissions, ethernetPortStatistics.deferredTransmissions) &&
        Objects.equals(this.frameTooLongs, ethernetPortStatistics.frameTooLongs) &&
        Objects.equals(this.txMulticastFrameCount, ethernetPortStatistics.txMulticastFrameCount) &&
        Objects.equals(this.txBroadcastFrameCount, ethernetPortStatistics.txBroadcastFrameCount) &&
        Objects.equals(this.txPauseFrameCount, ethernetPortStatistics.txPauseFrameCount) &&
        Objects.equals(this.txControlFrameCount, ethernetPortStatistics.txControlFrameCount) &&
        Objects.equals(this.txFrameExcessDeferralCount, ethernetPortStatistics.txFrameExcessDeferralCount) &&
        Objects.equals(this.txFrameAbortCount, ethernetPortStatistics.txFrameAbortCount) &&
        Objects.equals(this.txFrameCollisionCount, ethernetPortStatistics.txFrameCollisionCount) &&
        Objects.equals(this.txFrameDroppedCount, ethernetPortStatistics.txFrameDroppedCount) &&
        Objects.equals(this.txJumboFrameCount, ethernetPortStatistics.txJumboFrameCount) &&
        Objects.equals(this.rxUnknownControlFrameCount, ethernetPortStatistics.rxUnknownControlFrameCount) &&
        Objects.equals(this.rxPauseFrameCount, ethernetPortStatistics.rxPauseFrameCount) &&
        Objects.equals(this.rxControlFrameCount, ethernetPortStatistics.rxControlFrameCount) &&
        Objects.equals(this.rxFrameLengthErrorCount, ethernetPortStatistics.rxFrameLengthErrorCount) &&
        Objects.equals(this.rxJabberCount, ethernetPortStatistics.rxJabberCount) &&
        Objects.equals(this.rxFrameDropedCount, ethernetPortStatistics.rxFrameDropedCount) &&
        Objects.equals(this.rxFrameCrcErrorCount, ethernetPortStatistics.rxFrameCrcErrorCount) &&
        Objects.equals(this.rxFrameEncodingErrorCount, ethernetPortStatistics.rxFrameEncodingErrorCount) &&
        Objects.equals(this.rxSmallFrameErrorCount, ethernetPortStatistics.rxSmallFrameErrorCount) &&
        Objects.equals(this.rxMulticastFrameCount, ethernetPortStatistics.rxMulticastFrameCount) &&
        Objects.equals(this.rxBroadcastFrameCount, ethernetPortStatistics.rxBroadcastFrameCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaces, bytesTransmitted, bytesReceived, packetsTransmitted, packetsReceived, carrierSenseErrors, singleCollisionFrames, multipleCollisionFrames, lateCollisions, deferredTransmissions, frameTooLongs, txMulticastFrameCount, txBroadcastFrameCount, txPauseFrameCount, txControlFrameCount, txFrameExcessDeferralCount, txFrameAbortCount, txFrameCollisionCount, txFrameDroppedCount, txJumboFrameCount, rxUnknownControlFrameCount, rxPauseFrameCount, rxControlFrameCount, rxFrameLengthErrorCount, rxJabberCount, rxFrameDropedCount, rxFrameCrcErrorCount, rxFrameEncodingErrorCount, rxSmallFrameErrorCount, rxMulticastFrameCount, rxBroadcastFrameCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthernetPortStatistics {\n");
    
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("    bytesTransmitted: ").append(toIndentedString(bytesTransmitted)).append("\n");
    sb.append("    bytesReceived: ").append(toIndentedString(bytesReceived)).append("\n");
    sb.append("    packetsTransmitted: ").append(toIndentedString(packetsTransmitted)).append("\n");
    sb.append("    packetsReceived: ").append(toIndentedString(packetsReceived)).append("\n");
    sb.append("    carrierSenseErrors: ").append(toIndentedString(carrierSenseErrors)).append("\n");
    sb.append("    singleCollisionFrames: ").append(toIndentedString(singleCollisionFrames)).append("\n");
    sb.append("    multipleCollisionFrames: ").append(toIndentedString(multipleCollisionFrames)).append("\n");
    sb.append("    lateCollisions: ").append(toIndentedString(lateCollisions)).append("\n");
    sb.append("    deferredTransmissions: ").append(toIndentedString(deferredTransmissions)).append("\n");
    sb.append("    frameTooLongs: ").append(toIndentedString(frameTooLongs)).append("\n");
    sb.append("    txMulticastFrameCount: ").append(toIndentedString(txMulticastFrameCount)).append("\n");
    sb.append("    txBroadcastFrameCount: ").append(toIndentedString(txBroadcastFrameCount)).append("\n");
    sb.append("    txPauseFrameCount: ").append(toIndentedString(txPauseFrameCount)).append("\n");
    sb.append("    txControlFrameCount: ").append(toIndentedString(txControlFrameCount)).append("\n");
    sb.append("    txFrameExcessDeferralCount: ").append(toIndentedString(txFrameExcessDeferralCount)).append("\n");
    sb.append("    txFrameAbortCount: ").append(toIndentedString(txFrameAbortCount)).append("\n");
    sb.append("    txFrameCollisionCount: ").append(toIndentedString(txFrameCollisionCount)).append("\n");
    sb.append("    txFrameDroppedCount: ").append(toIndentedString(txFrameDroppedCount)).append("\n");
    sb.append("    txJumboFrameCount: ").append(toIndentedString(txJumboFrameCount)).append("\n");
    sb.append("    rxUnknownControlFrameCount: ").append(toIndentedString(rxUnknownControlFrameCount)).append("\n");
    sb.append("    rxPauseFrameCount: ").append(toIndentedString(rxPauseFrameCount)).append("\n");
    sb.append("    rxControlFrameCount: ").append(toIndentedString(rxControlFrameCount)).append("\n");
    sb.append("    rxFrameLengthErrorCount: ").append(toIndentedString(rxFrameLengthErrorCount)).append("\n");
    sb.append("    rxJabberCount: ").append(toIndentedString(rxJabberCount)).append("\n");
    sb.append("    rxFrameDropedCount: ").append(toIndentedString(rxFrameDropedCount)).append("\n");
    sb.append("    rxFrameCrcErrorCount: ").append(toIndentedString(rxFrameCrcErrorCount)).append("\n");
    sb.append("    rxFrameEncodingErrorCount: ").append(toIndentedString(rxFrameEncodingErrorCount)).append("\n");
    sb.append("    rxSmallFrameErrorCount: ").append(toIndentedString(rxSmallFrameErrorCount)).append("\n");
    sb.append("    rxMulticastFrameCount: ").append(toIndentedString(rxMulticastFrameCount)).append("\n");
    sb.append("    rxBroadcastFrameCount: ").append(toIndentedString(rxBroadcastFrameCount)).append("\n");
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

