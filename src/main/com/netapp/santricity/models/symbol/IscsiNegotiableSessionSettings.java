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
 * IscsiNegotiableSessionSettings
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IscsiNegotiableSessionSettings   {
  
    private Boolean initialR2t;

    private Boolean immediateData;

    private Integer maxOutstandingR2t;

    private Integer maxUnsolicitedFirstDataBurstLength;

    private Integer maxDataBurstLength;

    private Boolean dataSequenceInOrder;

    private Boolean dataPduInOrder;

    private Integer errorRecoveryLevel;

    private Integer maxConnectionsPerSession;

    private Integer defaultTimeToWait;

    private Integer defaultTimeToRetain;

  
  /**
   * True indicates that the initiator must wait for an R2T before sending to the target. False indicates the initiator may send data immediately.
   **/
  public IscsiNegotiableSessionSettings initialR2t(Boolean initialR2t) {
    this.initialR2t = initialR2t;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True indicates that the initiator must wait for an R2T before sending to the target. False indicates the initiator may send data immediately.")
  @JsonProperty("initialR2t")
  public Boolean getInitialR2t() {
    return initialR2t;
  }
  
  public void setInitialR2t(Boolean initialR2t) {
    this.initialR2t = initialR2t;
  }

  
  /**
   * True indicates that the initiator and target have agreed to support immediate data on this session.
   **/
  public IscsiNegotiableSessionSettings immediateData(Boolean immediateData) {
    this.immediateData = immediateData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True indicates that the initiator and target have agreed to support immediate data on this session.")
  @JsonProperty("immediateData")
  public Boolean getImmediateData() {
    return immediateData;
  }
  
  public void setImmediateData(Boolean immediateData) {
    this.immediateData = immediateData;
  }

  
  /**
   * The maximum number of outstanding request-to-transmit (R2T)s per iSCSI task within this session.
   **/
  public IscsiNegotiableSessionSettings maxOutstandingR2t(Integer maxOutstandingR2t) {
    this.maxOutstandingR2t = maxOutstandingR2t;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of outstanding request-to-transmit (R2T)s per iSCSI task within this session.")
  @JsonProperty("maxOutstandingR2t")
  public Integer getMaxOutstandingR2t() {
    return maxOutstandingR2t;
  }
  
  public void setMaxOutstandingR2t(Integer maxOutstandingR2t) {
    this.maxOutstandingR2t = maxOutstandingR2t;
  }

  
  /**
   * The maximum length supported for unsolicited data sent within this session.
   **/
  public IscsiNegotiableSessionSettings maxUnsolicitedFirstDataBurstLength(Integer maxUnsolicitedFirstDataBurstLength) {
    this.maxUnsolicitedFirstDataBurstLength = maxUnsolicitedFirstDataBurstLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum length supported for unsolicited data sent within this session.")
  @JsonProperty("maxUnsolicitedFirstDataBurstLength")
  public Integer getMaxUnsolicitedFirstDataBurstLength() {
    return maxUnsolicitedFirstDataBurstLength;
  }
  
  public void setMaxUnsolicitedFirstDataBurstLength(Integer maxUnsolicitedFirstDataBurstLength) {
    this.maxUnsolicitedFirstDataBurstLength = maxUnsolicitedFirstDataBurstLength;
  }

  
  /**
   * The maximum number of bytes which can be sent within a single sequence of Data-In or Data-Out PDUs.
   **/
  public IscsiNegotiableSessionSettings maxDataBurstLength(Integer maxDataBurstLength) {
    this.maxDataBurstLength = maxDataBurstLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of bytes which can be sent within a single sequence of Data-In or Data-Out PDUs.")
  @JsonProperty("maxDataBurstLength")
  public Integer getMaxDataBurstLength() {
    return maxDataBurstLength;
  }
  
  public void setMaxDataBurstLength(Integer maxDataBurstLength) {
    this.maxDataBurstLength = maxDataBurstLength;
  }

  
  /**
   * True indicates that data PDU sequences must be transferred using continuously increasing offsets, except during error recovery False indicates that iSCSI data PDU sequences may be transferred in any order.
   **/
  public IscsiNegotiableSessionSettings dataSequenceInOrder(Boolean dataSequenceInOrder) {
    this.dataSequenceInOrder = dataSequenceInOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True indicates that data PDU sequences must be transferred using continuously increasing offsets, except during error recovery False indicates that iSCSI data PDU sequences may be transferred in any order.")
  @JsonProperty("dataSequenceInOrder")
  public Boolean getDataSequenceInOrder() {
    return dataSequenceInOrder;
  }
  
  public void setDataSequenceInOrder(Boolean dataSequenceInOrder) {
    this.dataSequenceInOrder = dataSequenceInOrder;
  }

  
  /**
   * True indicates that data PDUs within sequences must be at continuously increasing addresses, with no gaps or overlay between PDUs. False indicates that iSCSI data PDUs within sequences may be in any order.
   **/
  public IscsiNegotiableSessionSettings dataPduInOrder(Boolean dataPduInOrder) {
    this.dataPduInOrder = dataPduInOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True indicates that data PDUs within sequences must be at continuously increasing addresses, with no gaps or overlay between PDUs. False indicates that iSCSI data PDUs within sequences may be in any order.")
  @JsonProperty("dataPduInOrder")
  public Boolean getDataPduInOrder() {
    return dataPduInOrder;
  }
  
  public void setDataPduInOrder(Boolean dataPduInOrder) {
    this.dataPduInOrder = dataPduInOrder;
  }

  
  /**
   * The level of error recovery negotiated between the initiator and the target.
   **/
  public IscsiNegotiableSessionSettings errorRecoveryLevel(Integer errorRecoveryLevel) {
    this.errorRecoveryLevel = errorRecoveryLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The level of error recovery negotiated between the initiator and the target.")
  @JsonProperty("errorRecoveryLevel")
  public Integer getErrorRecoveryLevel() {
    return errorRecoveryLevel;
  }
  
  public void setErrorRecoveryLevel(Integer errorRecoveryLevel) {
    this.errorRecoveryLevel = errorRecoveryLevel;
  }

  
  /**
   * The maximum number of connections allowed in this session.
   **/
  public IscsiNegotiableSessionSettings maxConnectionsPerSession(Integer maxConnectionsPerSession) {
    this.maxConnectionsPerSession = maxConnectionsPerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of connections allowed in this session.")
  @JsonProperty("maxConnectionsPerSession")
  public Integer getMaxConnectionsPerSession() {
    return maxConnectionsPerSession;
  }
  
  public void setMaxConnectionsPerSession(Integer maxConnectionsPerSession) {
    this.maxConnectionsPerSession = maxConnectionsPerSession;
  }

  
  /**
   * The minimum time, in seconds, to wait before attempting an explicit/implicit logout or active iSCSI task reassignment after an unexpected connection termination or a connection reset.
   **/
  public IscsiNegotiableSessionSettings defaultTimeToWait(Integer defaultTimeToWait) {
    this.defaultTimeToWait = defaultTimeToWait;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum time, in seconds, to wait before attempting an explicit/implicit logout or active iSCSI task reassignment after an unexpected connection termination or a connection reset.")
  @JsonProperty("defaultTimeToWait")
  public Integer getDefaultTimeToWait() {
    return defaultTimeToWait;
  }
  
  public void setDefaultTimeToWait(Integer defaultTimeToWait) {
    this.defaultTimeToWait = defaultTimeToWait;
  }

  
  /**
   * The maximum time, in seconds after an initial wait, before which an active iSCSI task reassignment is still possible after an unexpected connection.
   **/
  public IscsiNegotiableSessionSettings defaultTimeToRetain(Integer defaultTimeToRetain) {
    this.defaultTimeToRetain = defaultTimeToRetain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum time, in seconds after an initial wait, before which an active iSCSI task reassignment is still possible after an unexpected connection.")
  @JsonProperty("defaultTimeToRetain")
  public Integer getDefaultTimeToRetain() {
    return defaultTimeToRetain;
  }
  
  public void setDefaultTimeToRetain(Integer defaultTimeToRetain) {
    this.defaultTimeToRetain = defaultTimeToRetain;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiNegotiableSessionSettings iscsiNegotiableSessionSettings = (IscsiNegotiableSessionSettings) o;
    return Objects.equals(this.initialR2t, iscsiNegotiableSessionSettings.initialR2t) &&
        Objects.equals(this.immediateData, iscsiNegotiableSessionSettings.immediateData) &&
        Objects.equals(this.maxOutstandingR2t, iscsiNegotiableSessionSettings.maxOutstandingR2t) &&
        Objects.equals(this.maxUnsolicitedFirstDataBurstLength, iscsiNegotiableSessionSettings.maxUnsolicitedFirstDataBurstLength) &&
        Objects.equals(this.maxDataBurstLength, iscsiNegotiableSessionSettings.maxDataBurstLength) &&
        Objects.equals(this.dataSequenceInOrder, iscsiNegotiableSessionSettings.dataSequenceInOrder) &&
        Objects.equals(this.dataPduInOrder, iscsiNegotiableSessionSettings.dataPduInOrder) &&
        Objects.equals(this.errorRecoveryLevel, iscsiNegotiableSessionSettings.errorRecoveryLevel) &&
        Objects.equals(this.maxConnectionsPerSession, iscsiNegotiableSessionSettings.maxConnectionsPerSession) &&
        Objects.equals(this.defaultTimeToWait, iscsiNegotiableSessionSettings.defaultTimeToWait) &&
        Objects.equals(this.defaultTimeToRetain, iscsiNegotiableSessionSettings.defaultTimeToRetain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialR2t, immediateData, maxOutstandingR2t, maxUnsolicitedFirstDataBurstLength, maxDataBurstLength, dataSequenceInOrder, dataPduInOrder, errorRecoveryLevel, maxConnectionsPerSession, defaultTimeToWait, defaultTimeToRetain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiNegotiableSessionSettings {\n");
    
    sb.append("    initialR2t: ").append(toIndentedString(initialR2t)).append("\n");
    sb.append("    immediateData: ").append(toIndentedString(immediateData)).append("\n");
    sb.append("    maxOutstandingR2t: ").append(toIndentedString(maxOutstandingR2t)).append("\n");
    sb.append("    maxUnsolicitedFirstDataBurstLength: ").append(toIndentedString(maxUnsolicitedFirstDataBurstLength)).append("\n");
    sb.append("    maxDataBurstLength: ").append(toIndentedString(maxDataBurstLength)).append("\n");
    sb.append("    dataSequenceInOrder: ").append(toIndentedString(dataSequenceInOrder)).append("\n");
    sb.append("    dataPduInOrder: ").append(toIndentedString(dataPduInOrder)).append("\n");
    sb.append("    errorRecoveryLevel: ").append(toIndentedString(errorRecoveryLevel)).append("\n");
    sb.append("    maxConnectionsPerSession: ").append(toIndentedString(maxConnectionsPerSession)).append("\n");
    sb.append("    defaultTimeToWait: ").append(toIndentedString(defaultTimeToWait)).append("\n");
    sb.append("    defaultTimeToRetain: ").append(toIndentedString(defaultTimeToRetain)).append("\n");
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

