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
 * LinkSpeedDetectionError
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class LinkSpeedDetectionError   {
  
    private String parentRef;

    private Integer channel;

    private Integer channelPort;


  /**
   * Connector type from VPD data.
   */
  public enum ConnectorEnum {
    unknown("unknown"),
    sc("sc"),
    fcs1cc("fcs1cc"),
    fcs2cc("fcs2cc"),
    bncortnc("bncortnc"),
    fcCoax("fcCoax"),
    fJack("fJack"),
    lc("lc"),
    mtRj("mtRj"),
    mu("mu"),
    sg("sg"),
    optPigtail("optPigtail"),
    hssdcii("hssdcii"),
    copPigtail("copPigtail"),
    rj45("rj45"),
    noSeparableConnector("noSeparableConnector"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ConnectorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ConnectorEnum connector;


  /**
   * Gets or Sets supportedLinkSpeeds
   */
  public enum SupportedLinkSpeedsEnum {
    typeUnknown("typeUnknown"),
    type1gig("type1gig"),
    type2gig("type2gig"),
    type4gig("type4gig"),
    type8gig("type8gig"),
    type16gig("type16gig"),
    type10gig("type10gig"),
    type40gig("type40gig"),
    type56gig("type56gig"),
    type20gig("type20gig"),
    type25gig("type25gig"),
    type32gig("type32gig"),
    type100gig("type100gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SupportedLinkSpeedsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SupportedLinkSpeedsEnum> supportedLinkSpeeds;

    private Integer currentLinkSpeed;

    private Boolean manuallyBypassed;

    private Boolean supportsSpeed;

    private String channelPortRef;

  
  /**
   * The reference for the controller.
   **/
  public LinkSpeedDetectionError parentRef(String parentRef) {
    this.parentRef = parentRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for the controller.")
  @JsonProperty("parentRef")
  public String getParentRef() {
    return parentRef;
  }
  
  public void setParentRef(String parentRef) {
    this.parentRef = parentRef;
  }

  
  /**
   * The drive channel identifier.
   **/
  public LinkSpeedDetectionError channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The drive channel identifier.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The channel port identifier.
   **/
  public LinkSpeedDetectionError channelPort(Integer channelPort) {
    this.channelPort = channelPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel port identifier.")
  @JsonProperty("channelPort")
  public Integer getChannelPort() {
    return channelPort;
  }
  
  public void setChannelPort(Integer channelPort) {
    this.channelPort = channelPort;
  }

  
  /**
   * Connector type from VPD data.
   **/
  public LinkSpeedDetectionError connector(ConnectorEnum connector) {
    this.connector = connector;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Connector type from VPD data.")
  @JsonProperty("connector")
  public ConnectorEnum getConnector() {
    return connector;
  }
  
  public void setConnector(ConnectorEnum connector) {
    this.connector = connector;
  }

  
  /**
   * Link speeds supported by device.
   **/
  public LinkSpeedDetectionError supportedLinkSpeeds(List<SupportedLinkSpeedsEnum> supportedLinkSpeeds) {
    this.supportedLinkSpeeds = supportedLinkSpeeds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Link speeds supported by device.")
  @JsonProperty("supportedLinkSpeeds")
  public List<SupportedLinkSpeedsEnum> getSupportedLinkSpeeds() {
    return supportedLinkSpeeds;
  }
  
  public void setSupportedLinkSpeeds(List<SupportedLinkSpeedsEnum> supportedLinkSpeeds) {
    this.supportedLinkSpeeds = supportedLinkSpeeds;
  }

  
  /**
   * Actual link speed.
   **/
  public LinkSpeedDetectionError currentLinkSpeed(Integer currentLinkSpeed) {
    this.currentLinkSpeed = currentLinkSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Actual link speed.")
  @JsonProperty("currentLinkSpeed")
  public Integer getCurrentLinkSpeed() {
    return currentLinkSpeed;
  }
  
  public void setCurrentLinkSpeed(Integer currentLinkSpeed) {
    this.currentLinkSpeed = currentLinkSpeed;
  }

  
  /**
   * True if manually bypassed.
   **/
  public LinkSpeedDetectionError manuallyBypassed(Boolean manuallyBypassed) {
    this.manuallyBypassed = manuallyBypassed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if manually bypassed.")
  @JsonProperty("manuallyBypassed")
  public Boolean getManuallyBypassed() {
    return manuallyBypassed;
  }
  
  public void setManuallyBypassed(Boolean manuallyBypassed) {
    this.manuallyBypassed = manuallyBypassed;
  }

  
  /**
   * True if currentLinkSpeed is also supported
   **/
  public LinkSpeedDetectionError supportsSpeed(Boolean supportsSpeed) {
    this.supportsSpeed = supportsSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if currentLinkSpeed is also supported")
  @JsonProperty("supportsSpeed")
  public Boolean getSupportsSpeed() {
    return supportsSpeed;
  }
  
  public void setSupportsSpeed(Boolean supportsSpeed) {
    this.supportsSpeed = supportsSpeed;
  }

  
  /**
   * A reference to the channel port object identifying where the link speed detection occurred. This field is currently not used.
   **/
  public LinkSpeedDetectionError channelPortRef(String channelPortRef) {
    this.channelPortRef = channelPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the channel port object identifying where the link speed detection occurred. This field is currently not used.")
  @JsonProperty("channelPortRef")
  public String getChannelPortRef() {
    return channelPortRef;
  }
  
  public void setChannelPortRef(String channelPortRef) {
    this.channelPortRef = channelPortRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSpeedDetectionError linkSpeedDetectionError = (LinkSpeedDetectionError) o;
    return Objects.equals(this.parentRef, linkSpeedDetectionError.parentRef) &&
        Objects.equals(this.channel, linkSpeedDetectionError.channel) &&
        Objects.equals(this.channelPort, linkSpeedDetectionError.channelPort) &&
        Objects.equals(this.connector, linkSpeedDetectionError.connector) &&
        Objects.equals(this.supportedLinkSpeeds, linkSpeedDetectionError.supportedLinkSpeeds) &&
        Objects.equals(this.currentLinkSpeed, linkSpeedDetectionError.currentLinkSpeed) &&
        Objects.equals(this.manuallyBypassed, linkSpeedDetectionError.manuallyBypassed) &&
        Objects.equals(this.supportsSpeed, linkSpeedDetectionError.supportsSpeed) &&
        Objects.equals(this.channelPortRef, linkSpeedDetectionError.channelPortRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentRef, channel, channelPort, connector, supportedLinkSpeeds, currentLinkSpeed, manuallyBypassed, supportsSpeed, channelPortRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSpeedDetectionError {\n");
    
    sb.append("    parentRef: ").append(toIndentedString(parentRef)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    channelPort: ").append(toIndentedString(channelPort)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    supportedLinkSpeeds: ").append(toIndentedString(supportedLinkSpeeds)).append("\n");
    sb.append("    currentLinkSpeed: ").append(toIndentedString(currentLinkSpeed)).append("\n");
    sb.append("    manuallyBypassed: ").append(toIndentedString(manuallyBypassed)).append("\n");
    sb.append("    supportsSpeed: ").append(toIndentedString(supportsSpeed)).append("\n");
    sb.append("    channelPortRef: ").append(toIndentedString(channelPortRef)).append("\n");
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

