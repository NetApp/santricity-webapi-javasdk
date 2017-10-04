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
 * IbRdmaChannelStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IbRdmaChannelStatistics   {
  
    private IbRdmaChannelEndpoints endpoints;

    private Long activeMessages;

    private Long queuedMessages;

    private Long txMessages;

    private Long rxMessages;

    private Long rdmaOpsStarted;

    private Long rdmaOpsCompleted;

    private Long messagesCompletedWithError;

    private Long maximumObservedMessageSize;

    private Long maximumObservedQueueDepth;

  
  /**
   * A structure that identifies the RDMA channel by identifying its endpoints.
   **/
  public IbRdmaChannelStatistics endpoints(IbRdmaChannelEndpoints endpoints) {
    this.endpoints = endpoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A structure that identifies the RDMA channel by identifying its endpoints.")
  @JsonProperty("endpoints")
  public IbRdmaChannelEndpoints getEndpoints() {
    return endpoints;
  }
  
  public void setEndpoints(IbRdmaChannelEndpoints endpoints) {
    this.endpoints = endpoints;
  }

  
  /**
   * The number of messages in-flight on the channel.
   **/
  public IbRdmaChannelStatistics activeMessages(Long activeMessages) {
    this.activeMessages = activeMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of messages in-flight on the channel.")
  @JsonProperty("activeMessages")
  public Long getActiveMessages() {
    return activeMessages;
  }
  
  public void setActiveMessages(Long activeMessages) {
    this.activeMessages = activeMessages;
  }

  
  /**
   * The number of messages queued on the channel.
   **/
  public IbRdmaChannelStatistics queuedMessages(Long queuedMessages) {
    this.queuedMessages = queuedMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of messages queued on the channel.")
  @JsonProperty("queuedMessages")
  public Long getQueuedMessages() {
    return queuedMessages;
  }
  
  public void setQueuedMessages(Long queuedMessages) {
    this.queuedMessages = queuedMessages;
  }

  
  /**
   * The number of messages transmitted on the channel.
   **/
  public IbRdmaChannelStatistics txMessages(Long txMessages) {
    this.txMessages = txMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of messages transmitted on the channel.")
  @JsonProperty("txMessages")
  public Long getTxMessages() {
    return txMessages;
  }
  
  public void setTxMessages(Long txMessages) {
    this.txMessages = txMessages;
  }

  
  /**
   * The number of messages received on the channel.
   **/
  public IbRdmaChannelStatistics rxMessages(Long rxMessages) {
    this.rxMessages = rxMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of messages received on the channel.")
  @JsonProperty("rxMessages")
  public Long getRxMessages() {
    return rxMessages;
  }
  
  public void setRxMessages(Long rxMessages) {
    this.rxMessages = rxMessages;
  }

  
  /**
   * The number of RDMA operations started on the channel.
   **/
  public IbRdmaChannelStatistics rdmaOpsStarted(Long rdmaOpsStarted) {
    this.rdmaOpsStarted = rdmaOpsStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of RDMA operations started on the channel.")
  @JsonProperty("rdmaOpsStarted")
  public Long getRdmaOpsStarted() {
    return rdmaOpsStarted;
  }
  
  public void setRdmaOpsStarted(Long rdmaOpsStarted) {
    this.rdmaOpsStarted = rdmaOpsStarted;
  }

  
  /**
   * The number of RDMA operations completed on the channel.
   **/
  public IbRdmaChannelStatistics rdmaOpsCompleted(Long rdmaOpsCompleted) {
    this.rdmaOpsCompleted = rdmaOpsCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of RDMA operations completed on the channel.")
  @JsonProperty("rdmaOpsCompleted")
  public Long getRdmaOpsCompleted() {
    return rdmaOpsCompleted;
  }
  
  public void setRdmaOpsCompleted(Long rdmaOpsCompleted) {
    this.rdmaOpsCompleted = rdmaOpsCompleted;
  }

  
  /**
   * The number of RDMA completed with error on the channel.
   **/
  public IbRdmaChannelStatistics messagesCompletedWithError(Long messagesCompletedWithError) {
    this.messagesCompletedWithError = messagesCompletedWithError;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of RDMA completed with error on the channel.")
  @JsonProperty("messagesCompletedWithError")
  public Long getMessagesCompletedWithError() {
    return messagesCompletedWithError;
  }
  
  public void setMessagesCompletedWithError(Long messagesCompletedWithError) {
    this.messagesCompletedWithError = messagesCompletedWithError;
  }

  
  /**
   * The maximum message size observed since the baseline time.
   **/
  public IbRdmaChannelStatistics maximumObservedMessageSize(Long maximumObservedMessageSize) {
    this.maximumObservedMessageSize = maximumObservedMessageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum message size observed since the baseline time.")
  @JsonProperty("maximumObservedMessageSize")
  public Long getMaximumObservedMessageSize() {
    return maximumObservedMessageSize;
  }
  
  public void setMaximumObservedMessageSize(Long maximumObservedMessageSize) {
    this.maximumObservedMessageSize = maximumObservedMessageSize;
  }

  
  /**
   * The maximum queue depth observed since the baseline time.
   **/
  public IbRdmaChannelStatistics maximumObservedQueueDepth(Long maximumObservedQueueDepth) {
    this.maximumObservedQueueDepth = maximumObservedQueueDepth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum queue depth observed since the baseline time.")
  @JsonProperty("maximumObservedQueueDepth")
  public Long getMaximumObservedQueueDepth() {
    return maximumObservedQueueDepth;
  }
  
  public void setMaximumObservedQueueDepth(Long maximumObservedQueueDepth) {
    this.maximumObservedQueueDepth = maximumObservedQueueDepth;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbRdmaChannelStatistics ibRdmaChannelStatistics = (IbRdmaChannelStatistics) o;
    return Objects.equals(this.endpoints, ibRdmaChannelStatistics.endpoints) &&
        Objects.equals(this.activeMessages, ibRdmaChannelStatistics.activeMessages) &&
        Objects.equals(this.queuedMessages, ibRdmaChannelStatistics.queuedMessages) &&
        Objects.equals(this.txMessages, ibRdmaChannelStatistics.txMessages) &&
        Objects.equals(this.rxMessages, ibRdmaChannelStatistics.rxMessages) &&
        Objects.equals(this.rdmaOpsStarted, ibRdmaChannelStatistics.rdmaOpsStarted) &&
        Objects.equals(this.rdmaOpsCompleted, ibRdmaChannelStatistics.rdmaOpsCompleted) &&
        Objects.equals(this.messagesCompletedWithError, ibRdmaChannelStatistics.messagesCompletedWithError) &&
        Objects.equals(this.maximumObservedMessageSize, ibRdmaChannelStatistics.maximumObservedMessageSize) &&
        Objects.equals(this.maximumObservedQueueDepth, ibRdmaChannelStatistics.maximumObservedQueueDepth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, activeMessages, queuedMessages, txMessages, rxMessages, rdmaOpsStarted, rdmaOpsCompleted, messagesCompletedWithError, maximumObservedMessageSize, maximumObservedQueueDepth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbRdmaChannelStatistics {\n");
    
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    activeMessages: ").append(toIndentedString(activeMessages)).append("\n");
    sb.append("    queuedMessages: ").append(toIndentedString(queuedMessages)).append("\n");
    sb.append("    txMessages: ").append(toIndentedString(txMessages)).append("\n");
    sb.append("    rxMessages: ").append(toIndentedString(rxMessages)).append("\n");
    sb.append("    rdmaOpsStarted: ").append(toIndentedString(rdmaOpsStarted)).append("\n");
    sb.append("    rdmaOpsCompleted: ").append(toIndentedString(rdmaOpsCompleted)).append("\n");
    sb.append("    messagesCompletedWithError: ").append(toIndentedString(messagesCompletedWithError)).append("\n");
    sb.append("    maximumObservedMessageSize: ").append(toIndentedString(maximumObservedMessageSize)).append("\n");
    sb.append("    maximumObservedQueueDepth: ").append(toIndentedString(maximumObservedQueueDepth)).append("\n");
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

