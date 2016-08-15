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
 * EthernetInterfaceData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class EthernetInterfaceData   {
  
    private VendorPartData partData;

    private String macAddress;

    private Boolean fullDuplex;

    private Integer maximumFramePayloadSize;


  /**
   * The speed of the interface, as currently configured.
   */
  public enum CurrentInterfaceSpeedEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CurrentInterfaceSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentInterfaceSpeedEnum currentInterfaceSpeed;


  /**
   * The maximum speed supported by the interface.
   */
  public enum MaximumInterfaceSpeedEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MaximumInterfaceSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MaximumInterfaceSpeedEnum maximumInterfaceSpeed;


  /**
   * The status of the network link for this interface.
   */
  public enum LinkStatusEnum {
    none("none"),
    up("up"),
    down("down"),
    failed("failed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    LinkStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LinkStatusEnum linkStatus;


  /**
   * Gets or Sets supportedInterfaceSpeeds
   */
  public enum SupportedInterfaceSpeedsEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SupportedInterfaceSpeedsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SupportedInterfaceSpeedsEnum> supportedInterfaceSpeeds;

    private Boolean autoconfigSupport;

    private Boolean copperCableDiagnosticsSupport;

  
  /**
   * Vendor-supplied about the physical part.
   **/
  public EthernetInterfaceData partData(VendorPartData partData) {
    this.partData = partData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Vendor-supplied about the physical part.")
  @JsonProperty("partData")
  public VendorPartData getPartData() {
    return partData;
  }
  
  public void setPartData(VendorPartData partData) {
    this.partData = partData;
  }

  
  /**
   * The Ethernet MAC address associated with the interface.
   **/
  public EthernetInterfaceData macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Ethernet MAC address associated with the interface.")
  @JsonProperty("macAddress")
  public String getMacAddress() {
    return macAddress;
  }
  
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  
  /**
   * If set to true, the interface is operating in full duplex mode; otherwise, it is operating in half-duplex mode.
   **/
  public EthernetInterfaceData fullDuplex(Boolean fullDuplex) {
    this.fullDuplex = fullDuplex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If set to true, the interface is operating in full duplex mode; otherwise, it is operating in half-duplex mode.")
  @JsonProperty("fullDuplex")
  public Boolean getFullDuplex() {
    return fullDuplex;
  }
  
  public void setFullDuplex(Boolean fullDuplex) {
    this.fullDuplex = fullDuplex;
  }

  
  /**
   * The maximum size of the payload section in an Ethernet frame.
   **/
  public EthernetInterfaceData maximumFramePayloadSize(Integer maximumFramePayloadSize) {
    this.maximumFramePayloadSize = maximumFramePayloadSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum size of the payload section in an Ethernet frame.")
  @JsonProperty("maximumFramePayloadSize")
  public Integer getMaximumFramePayloadSize() {
    return maximumFramePayloadSize;
  }
  
  public void setMaximumFramePayloadSize(Integer maximumFramePayloadSize) {
    this.maximumFramePayloadSize = maximumFramePayloadSize;
  }

  
  /**
   * The speed of the interface, as currently configured.
   **/
  public EthernetInterfaceData currentInterfaceSpeed(CurrentInterfaceSpeedEnum currentInterfaceSpeed) {
    this.currentInterfaceSpeed = currentInterfaceSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The speed of the interface, as currently configured.")
  @JsonProperty("currentInterfaceSpeed")
  public CurrentInterfaceSpeedEnum getCurrentInterfaceSpeed() {
    return currentInterfaceSpeed;
  }
  
  public void setCurrentInterfaceSpeed(CurrentInterfaceSpeedEnum currentInterfaceSpeed) {
    this.currentInterfaceSpeed = currentInterfaceSpeed;
  }

  
  /**
   * The maximum speed supported by the interface.
   **/
  public EthernetInterfaceData maximumInterfaceSpeed(MaximumInterfaceSpeedEnum maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum speed supported by the interface.")
  @JsonProperty("maximumInterfaceSpeed")
  public MaximumInterfaceSpeedEnum getMaximumInterfaceSpeed() {
    return maximumInterfaceSpeed;
  }
  
  public void setMaximumInterfaceSpeed(MaximumInterfaceSpeedEnum maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
  }

  
  /**
   * The status of the network link for this interface.
   **/
  public EthernetInterfaceData linkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the network link for this interface.")
  @JsonProperty("linkStatus")
  public LinkStatusEnum getLinkStatus() {
    return linkStatus;
  }
  
  public void setLinkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
  }

  
  /**
   * A list of speeds supported by the Ethernet interface.
   **/
  public EthernetInterfaceData supportedInterfaceSpeeds(List<SupportedInterfaceSpeedsEnum> supportedInterfaceSpeeds) {
    this.supportedInterfaceSpeeds = supportedInterfaceSpeeds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of speeds supported by the Ethernet interface.")
  @JsonProperty("supportedInterfaceSpeeds")
  public List<SupportedInterfaceSpeedsEnum> getSupportedInterfaceSpeeds() {
    return supportedInterfaceSpeeds;
  }
  
  public void setSupportedInterfaceSpeeds(List<SupportedInterfaceSpeedsEnum> supportedInterfaceSpeeds) {
    this.supportedInterfaceSpeeds = supportedInterfaceSpeeds;
  }

  
  /**
   * If set to true, autoconfiguration is supported.
   **/
  public EthernetInterfaceData autoconfigSupport(Boolean autoconfigSupport) {
    this.autoconfigSupport = autoconfigSupport;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If set to true, autoconfiguration is supported.")
  @JsonProperty("autoconfigSupport")
  public Boolean getAutoconfigSupport() {
    return autoconfigSupport;
  }
  
  public void setAutoconfigSupport(Boolean autoconfigSupport) {
    this.autoconfigSupport = autoconfigSupport;
  }

  
  /**
   * If true, support is provided for copper cable diagnostics.
   **/
  public EthernetInterfaceData copperCableDiagnosticsSupport(Boolean copperCableDiagnosticsSupport) {
    this.copperCableDiagnosticsSupport = copperCableDiagnosticsSupport;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, support is provided for copper cable diagnostics.")
  @JsonProperty("copperCableDiagnosticsSupport")
  public Boolean getCopperCableDiagnosticsSupport() {
    return copperCableDiagnosticsSupport;
  }
  
  public void setCopperCableDiagnosticsSupport(Boolean copperCableDiagnosticsSupport) {
    this.copperCableDiagnosticsSupport = copperCableDiagnosticsSupport;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthernetInterfaceData ethernetInterfaceData = (EthernetInterfaceData) o;
    return Objects.equals(this.partData, ethernetInterfaceData.partData) &&
        Objects.equals(this.macAddress, ethernetInterfaceData.macAddress) &&
        Objects.equals(this.fullDuplex, ethernetInterfaceData.fullDuplex) &&
        Objects.equals(this.maximumFramePayloadSize, ethernetInterfaceData.maximumFramePayloadSize) &&
        Objects.equals(this.currentInterfaceSpeed, ethernetInterfaceData.currentInterfaceSpeed) &&
        Objects.equals(this.maximumInterfaceSpeed, ethernetInterfaceData.maximumInterfaceSpeed) &&
        Objects.equals(this.linkStatus, ethernetInterfaceData.linkStatus) &&
        Objects.equals(this.supportedInterfaceSpeeds, ethernetInterfaceData.supportedInterfaceSpeeds) &&
        Objects.equals(this.autoconfigSupport, ethernetInterfaceData.autoconfigSupport) &&
        Objects.equals(this.copperCableDiagnosticsSupport, ethernetInterfaceData.copperCableDiagnosticsSupport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partData, macAddress, fullDuplex, maximumFramePayloadSize, currentInterfaceSpeed, maximumInterfaceSpeed, linkStatus, supportedInterfaceSpeeds, autoconfigSupport, copperCableDiagnosticsSupport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthernetInterfaceData {\n");
    
    sb.append("    partData: ").append(toIndentedString(partData)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    fullDuplex: ").append(toIndentedString(fullDuplex)).append("\n");
    sb.append("    maximumFramePayloadSize: ").append(toIndentedString(maximumFramePayloadSize)).append("\n");
    sb.append("    currentInterfaceSpeed: ").append(toIndentedString(currentInterfaceSpeed)).append("\n");
    sb.append("    maximumInterfaceSpeed: ").append(toIndentedString(maximumInterfaceSpeed)).append("\n");
    sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
    sb.append("    supportedInterfaceSpeeds: ").append(toIndentedString(supportedInterfaceSpeeds)).append("\n");
    sb.append("    autoconfigSupport: ").append(toIndentedString(autoconfigSupport)).append("\n");
    sb.append("    copperCableDiagnosticsSupport: ").append(toIndentedString(copperCableDiagnosticsSupport)).append("\n");
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

