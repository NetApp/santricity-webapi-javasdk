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
 * IscsiConnection
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IscsiConnection   {
  
    private Integer connectionId;

    private String iscsiInterface;

    private Integer maxTransmitDataSegmentLength;

    private Boolean sendingMarkers;

    private String activeIscsiVersion;

    private Boolean mutualAuthentication;

    private IscsiNegotiableConnectionSettings negotiatedSettings;

    private IscsiConnectionEndpoints endpoints;

  
  /**
   * The unique identifier of the connection within the scope of the parent session.
   **/
  public IscsiConnection connectionId(Integer connectionId) {
    this.connectionId = connectionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the connection within the scope of the parent session.")
  @JsonProperty("connectionId")
  public Integer getConnectionId() {
    return connectionId;
  }
  
  public void setConnectionId(Integer connectionId) {
    this.connectionId = connectionId;
  }

  
  /**
   * A reference to the physical interface to which this connection is bound.
   **/
  public IscsiConnection iscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the physical interface to which this connection is bound.")
  @JsonProperty("iscsiInterface")
  public String getIscsiInterface() {
    return iscsiInterface;
  }
  
  public void setIscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
  }

  
  /**
   * The maximum data payload size supported for command or data PDUs to be sent on this connection.
   **/
  public IscsiConnection maxTransmitDataSegmentLength(Integer maxTransmitDataSegmentLength) {
    this.maxTransmitDataSegmentLength = maxTransmitDataSegmentLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum data payload size supported for command or data PDUs to be sent on this connection.")
  @JsonProperty("maxTransmitDataSegmentLength")
  public Integer getMaxTransmitDataSegmentLength() {
    return maxTransmitDataSegmentLength;
  }
  
  public void setMaxTransmitDataSegmentLength(Integer maxTransmitDataSegmentLength) {
    this.maxTransmitDataSegmentLength = maxTransmitDataSegmentLength;
  }

  
  /**
   * True if this connection is inserting markers in in its outgoing data stream.
   **/
  public IscsiConnection sendingMarkers(Boolean sendingMarkers) {
    this.sendingMarkers = sendingMarkers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if this connection is inserting markers in in its outgoing data stream.")
  @JsonProperty("sendingMarkers")
  public Boolean getSendingMarkers() {
    return sendingMarkers;
  }
  
  public void setSendingMarkers(Boolean sendingMarkers) {
    this.sendingMarkers = sendingMarkers;
  }

  
  /**
   * The active version number of the iSCSI specification negotiated on this connection.
   **/
  public IscsiConnection activeIscsiVersion(String activeIscsiVersion) {
    this.activeIscsiVersion = activeIscsiVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The active version number of the iSCSI specification negotiated on this connection.")
  @JsonProperty("activeIscsiVersion")
  public String getActiveIscsiVersion() {
    return activeIscsiVersion;
  }
  
  public void setActiveIscsiVersion(String activeIscsiVersion) {
    this.activeIscsiVersion = activeIscsiVersion;
  }

  
  /**
   * True if the target is required to authenticate itself to the Initiator, in addition to the Initiator authenticating itself to the target.
   **/
  public IscsiConnection mutualAuthentication(Boolean mutualAuthentication) {
    this.mutualAuthentication = mutualAuthentication;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the target is required to authenticate itself to the Initiator, in addition to the Initiator authenticating itself to the target.")
  @JsonProperty("mutualAuthentication")
  public Boolean getMutualAuthentication() {
    return mutualAuthentication;
  }
  
  public void setMutualAuthentication(Boolean mutualAuthentication) {
    this.mutualAuthentication = mutualAuthentication;
  }

  
  /**
   * A collection of connection-level settings that are subject to initiator-target negotiation.
   **/
  public IscsiConnection negotiatedSettings(IscsiNegotiableConnectionSettings negotiatedSettings) {
    this.negotiatedSettings = negotiatedSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A collection of connection-level settings that are subject to initiator-target negotiation.")
  @JsonProperty("negotiatedSettings")
  public IscsiNegotiableConnectionSettings getNegotiatedSettings() {
    return negotiatedSettings;
  }
  
  public void setNegotiatedSettings(IscsiNegotiableConnectionSettings negotiatedSettings) {
    this.negotiatedSettings = negotiatedSettings;
  }

  
  /**
   * The TCP protocol endpoints of the connection.
   **/
  public IscsiConnection endpoints(IscsiConnectionEndpoints endpoints) {
    this.endpoints = endpoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The TCP protocol endpoints of the connection.")
  @JsonProperty("endpoints")
  public IscsiConnectionEndpoints getEndpoints() {
    return endpoints;
  }
  
  public void setEndpoints(IscsiConnectionEndpoints endpoints) {
    this.endpoints = endpoints;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiConnection iscsiConnection = (IscsiConnection) o;
    return Objects.equals(this.connectionId, iscsiConnection.connectionId) &&
        Objects.equals(this.iscsiInterface, iscsiConnection.iscsiInterface) &&
        Objects.equals(this.maxTransmitDataSegmentLength, iscsiConnection.maxTransmitDataSegmentLength) &&
        Objects.equals(this.sendingMarkers, iscsiConnection.sendingMarkers) &&
        Objects.equals(this.activeIscsiVersion, iscsiConnection.activeIscsiVersion) &&
        Objects.equals(this.mutualAuthentication, iscsiConnection.mutualAuthentication) &&
        Objects.equals(this.negotiatedSettings, iscsiConnection.negotiatedSettings) &&
        Objects.equals(this.endpoints, iscsiConnection.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, iscsiInterface, maxTransmitDataSegmentLength, sendingMarkers, activeIscsiVersion, mutualAuthentication, negotiatedSettings, endpoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiConnection {\n");
    
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    iscsiInterface: ").append(toIndentedString(iscsiInterface)).append("\n");
    sb.append("    maxTransmitDataSegmentLength: ").append(toIndentedString(maxTransmitDataSegmentLength)).append("\n");
    sb.append("    sendingMarkers: ").append(toIndentedString(sendingMarkers)).append("\n");
    sb.append("    activeIscsiVersion: ").append(toIndentedString(activeIscsiVersion)).append("\n");
    sb.append("    mutualAuthentication: ").append(toIndentedString(mutualAuthentication)).append("\n");
    sb.append("    negotiatedSettings: ").append(toIndentedString(negotiatedSettings)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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

