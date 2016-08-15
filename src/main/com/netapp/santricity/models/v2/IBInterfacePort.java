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


package com.netapp.santricity.models.v2;

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
 * IBInterfacePort
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class IBInterfacePort   {
  
    private String interfaceRef;

    private Integer channel;

    private String channelPortRef;

    private Integer localIdentifier;

    private String globalIdentifier;


  /**
   * The state of the InfiniBand link.
   */
  public enum LinkStateEnum {
    initialize("initialize"),
    linkArm("linkArm"),
    active("active"),
    defer("defer"),
    down("down"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    LinkStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LinkStateEnum linkState;


  /**
   * The state of the InfiniBand port.
   */
  public enum PortStateEnum {
    unknown("unknown"),
    initialize("initialize"),
    arm("arm"),
    active("active"),
    defer("defer"),
    down("down"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PortStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PortStateEnum portState;

    private Integer maximumTransmissionUnit;


  /**
   * The speed at which the interface is currently operating.
   */
  public enum CurrentSpeedEnum {
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

    CurrentSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentSpeedEnum currentSpeed;


  /**
   * Gets or Sets supportedSpeed
   */
  public enum SupportedSpeedEnum {
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

    SupportedSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SupportedSpeedEnum> supportedSpeed;


  /**
   * The width at which the link is currently operating, e.g., 1 means \"1X,\" 4 means \"4X,\".etc.
   */
  public enum CurrentLinkWidthEnum {
    width1x("width1x"),
    width4x("width4x"),
    width8x("width8x"),
    width12x("width12x"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CurrentLinkWidthEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentLinkWidthEnum currentLinkWidth;


  /**
   * Gets or Sets supportedLinkWidth
   */
  public enum SupportedLinkWidthEnum {
    width1x("width1x"),
    width4x("width4x"),
    width8x("width8x"),
    width12x("width12x"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SupportedLinkWidthEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SupportedLinkWidthEnum> supportedLinkWidth;

    private Integer currentDataVirtualLanes;

    private Integer maximumDataVirtualLanes;

    private Location physicalLocation;

    private Boolean protectionInformationCapable;

    private Boolean isSRPSupported;

    private Boolean isISERSupported;


  /**
   * This element contains the current state of the physical Infiniband port.
   */
  public enum PhysPortStateEnum {
    unknown("unknown"),
    sleep("sleep"),
    polling("polling"),
    disabled("disabled"),
    cfgTrain("cfgTrain"),
    linkUp("linkUp"),
    linkErrRec("linkErrRec"),
    phyTest("phyTest"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PhysPortStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PhysPortStateEnum physPortState;

    private Long oneWayMaxRate;

    private Long bidirectionalMaxRate;

    private String controllerId;

    private String interfaceId;

    private String addressId;

    private String niceAddressId;

    private String id;

  
  /**
   * The opaque data by which an instance of IbInterface is uniquely identified.
   **/
  public IBInterfacePort interfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The opaque data by which an instance of IbInterface is uniquely identified.")
  @JsonProperty("interfaceRef")
  public String getInterfaceRef() {
    return interfaceRef;
  }
  
  public void setInterfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
  }

  
  /**
   * The number of the host channel associated with this interface.
   **/
  public IBInterfacePort channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the host channel associated with this interface.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * A reference to the channel port for the channel associated with this interface.
   **/
  public IBInterfacePort channelPortRef(String channelPortRef) {
    this.channelPortRef = channelPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the channel port for the channel associated with this interface.")
  @JsonProperty("channelPortRef")
  public String getChannelPortRef() {
    return channelPortRef;
  }
  
  public void setChannelPortRef(String channelPortRef) {
    this.channelPortRef = channelPortRef;
  }

  
  /**
   * The InfiniBand local identifier associated with this interface.
   **/
  public IBInterfacePort localIdentifier(Integer localIdentifier) {
    this.localIdentifier = localIdentifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The InfiniBand local identifier associated with this interface.")
  @JsonProperty("localIdentifier")
  public Integer getLocalIdentifier() {
    return localIdentifier;
  }
  
  public void setLocalIdentifier(Integer localIdentifier) {
    this.localIdentifier = localIdentifier;
  }

  
  /**
   * The InfiniBand global identifier associated with this interface.
   **/
  public IBInterfacePort globalIdentifier(String globalIdentifier) {
    this.globalIdentifier = globalIdentifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The InfiniBand global identifier associated with this interface.")
  @JsonProperty("globalIdentifier")
  public String getGlobalIdentifier() {
    return globalIdentifier;
  }
  
  public void setGlobalIdentifier(String globalIdentifier) {
    this.globalIdentifier = globalIdentifier;
  }

  
  /**
   * The state of the InfiniBand link.
   **/
  public IBInterfacePort linkState(LinkStateEnum linkState) {
    this.linkState = linkState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the InfiniBand link.")
  @JsonProperty("linkState")
  public LinkStateEnum getLinkState() {
    return linkState;
  }
  
  public void setLinkState(LinkStateEnum linkState) {
    this.linkState = linkState;
  }

  
  /**
   * The state of the InfiniBand port.
   **/
  public IBInterfacePort portState(PortStateEnum portState) {
    this.portState = portState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the InfiniBand port.")
  @JsonProperty("portState")
  public PortStateEnum getPortState() {
    return portState;
  }
  
  public void setPortState(PortStateEnum portState) {
    this.portState = portState;
  }

  
  /**
   * The size in bytes of the largest packet that the interface can transmit.
   **/
  public IBInterfacePort maximumTransmissionUnit(Integer maximumTransmissionUnit) {
    this.maximumTransmissionUnit = maximumTransmissionUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size in bytes of the largest packet that the interface can transmit.")
  @JsonProperty("maximumTransmissionUnit")
  public Integer getMaximumTransmissionUnit() {
    return maximumTransmissionUnit;
  }
  
  public void setMaximumTransmissionUnit(Integer maximumTransmissionUnit) {
    this.maximumTransmissionUnit = maximumTransmissionUnit;
  }

  
  /**
   * The speed at which the interface is currently operating.
   **/
  public IBInterfacePort currentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The speed at which the interface is currently operating.")
  @JsonProperty("currentSpeed")
  public CurrentSpeedEnum getCurrentSpeed() {
    return currentSpeed;
  }
  
  public void setCurrentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  
  /**
   * An array containing the different speeds at which the interface is capable of operating.
   **/
  public IBInterfacePort supportedSpeed(List<SupportedSpeedEnum> supportedSpeed) {
    this.supportedSpeed = supportedSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array containing the different speeds at which the interface is capable of operating.")
  @JsonProperty("supportedSpeed")
  public List<SupportedSpeedEnum> getSupportedSpeed() {
    return supportedSpeed;
  }
  
  public void setSupportedSpeed(List<SupportedSpeedEnum> supportedSpeed) {
    this.supportedSpeed = supportedSpeed;
  }

  
  /**
   * The width at which the link is currently operating, e.g., 1 means \"1X,\" 4 means \"4X,\".etc.
   **/
  public IBInterfacePort currentLinkWidth(CurrentLinkWidthEnum currentLinkWidth) {
    this.currentLinkWidth = currentLinkWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The width at which the link is currently operating, e.g., 1 means \"1X,\" 4 means \"4X,\".etc.")
  @JsonProperty("currentLinkWidth")
  public CurrentLinkWidthEnum getCurrentLinkWidth() {
    return currentLinkWidth;
  }
  
  public void setCurrentLinkWidth(CurrentLinkWidthEnum currentLinkWidth) {
    this.currentLinkWidth = currentLinkWidth;
  }

  
  /**
   * An array containing the different link widths at which the link is capable of operating.
   **/
  public IBInterfacePort supportedLinkWidth(List<SupportedLinkWidthEnum> supportedLinkWidth) {
    this.supportedLinkWidth = supportedLinkWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array containing the different link widths at which the link is capable of operating.")
  @JsonProperty("supportedLinkWidth")
  public List<SupportedLinkWidthEnum> getSupportedLinkWidth() {
    return supportedLinkWidth;
  }
  
  public void setSupportedLinkWidth(List<SupportedLinkWidthEnum> supportedLinkWidth) {
    this.supportedLinkWidth = supportedLinkWidth;
  }

  
  /**
   * The number of data virtual lanes that are currently active for this interface.
   **/
  public IBInterfacePort currentDataVirtualLanes(Integer currentDataVirtualLanes) {
    this.currentDataVirtualLanes = currentDataVirtualLanes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of data virtual lanes that are currently active for this interface.")
  @JsonProperty("currentDataVirtualLanes")
  public Integer getCurrentDataVirtualLanes() {
    return currentDataVirtualLanes;
  }
  
  public void setCurrentDataVirtualLanes(Integer currentDataVirtualLanes) {
    this.currentDataVirtualLanes = currentDataVirtualLanes;
  }

  
  /**
   * The maximum number of data virtual lanes supported by the interface.
   **/
  public IBInterfacePort maximumDataVirtualLanes(Integer maximumDataVirtualLanes) {
    this.maximumDataVirtualLanes = maximumDataVirtualLanes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of data virtual lanes supported by the interface.")
  @JsonProperty("maximumDataVirtualLanes")
  public Integer getMaximumDataVirtualLanes() {
    return maximumDataVirtualLanes;
  }
  
  public void setMaximumDataVirtualLanes(Integer maximumDataVirtualLanes) {
    this.maximumDataVirtualLanes = maximumDataVirtualLanes;
  }

  
  /**
   * The physical location of the Infiniband interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st Infiniband interface relative to the parent,\" \"2nd Infiniband interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.
   **/
  public IBInterfacePort physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the Infiniband interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st Infiniband interface relative to the parent,\" \"2nd Infiniband interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * This field indicates whether or not the I/O interface is PI capable.
   **/
  public IBInterfacePort protectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field indicates whether or not the I/O interface is PI capable.")
  @JsonProperty("protectionInformationCapable")
  public Boolean getProtectionInformationCapable() {
    return protectionInformationCapable;
  }
  
  public void setProtectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
  }

  
  /**
   * This flag is true if SRP (SCSI RDMA Protocol) is currently supported.
   **/
  public IBInterfacePort isSRPSupported(Boolean isSRPSupported) {
    this.isSRPSupported = isSRPSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This flag is true if SRP (SCSI RDMA Protocol) is currently supported.")
  @JsonProperty("isSRPSupported")
  public Boolean getIsSRPSupported() {
    return isSRPSupported;
  }
  
  public void setIsSRPSupported(Boolean isSRPSupported) {
    this.isSRPSupported = isSRPSupported;
  }

  
  /**
   * This flag is true if iSER (iSCSI Extensions for RDMA) is currently supported.
   **/
  public IBInterfacePort isISERSupported(Boolean isISERSupported) {
    this.isISERSupported = isISERSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This flag is true if iSER (iSCSI Extensions for RDMA) is currently supported.")
  @JsonProperty("isISERSupported")
  public Boolean getIsISERSupported() {
    return isISERSupported;
  }
  
  public void setIsISERSupported(Boolean isISERSupported) {
    this.isISERSupported = isISERSupported;
  }

  
  /**
   * This element contains the current state of the physical Infiniband port.
   **/
  public IBInterfacePort physPortState(PhysPortStateEnum physPortState) {
    this.physPortState = physPortState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This element contains the current state of the physical Infiniband port.")
  @JsonProperty("physPortState")
  public PhysPortStateEnum getPhysPortState() {
    return physPortState;
  }
  
  public void setPhysPortState(PhysPortStateEnum physPortState) {
    this.physPortState = physPortState;
  }

  
  /**
   * Maximum one way data rate in B/s
   **/
  public IBInterfacePort oneWayMaxRate(Long oneWayMaxRate) {
    this.oneWayMaxRate = oneWayMaxRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum one way data rate in B/s")
  @JsonProperty("oneWayMaxRate")
  public Long getOneWayMaxRate() {
    return oneWayMaxRate;
  }
  
  public void setOneWayMaxRate(Long oneWayMaxRate) {
    this.oneWayMaxRate = oneWayMaxRate;
  }

  
  /**
   * Maximum bi-directional data rate in B/s
   **/
  public IBInterfacePort bidirectionalMaxRate(Long bidirectionalMaxRate) {
    this.bidirectionalMaxRate = bidirectionalMaxRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum bi-directional data rate in B/s")
  @JsonProperty("bidirectionalMaxRate")
  public Long getBidirectionalMaxRate() {
    return bidirectionalMaxRate;
  }
  
  public void setBidirectionalMaxRate(Long bidirectionalMaxRate) {
    this.bidirectionalMaxRate = bidirectionalMaxRate;
  }

  
  /**
   **/
  public IBInterfacePort controllerId(String controllerId) {
    this.controllerId = controllerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("controllerId")
  public String getControllerId() {
    return controllerId;
  }
  
  public void setControllerId(String controllerId) {
    this.controllerId = controllerId;
  }

  
  /**
   **/
  public IBInterfacePort interfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaceId")
  public String getInterfaceId() {
    return interfaceId;
  }
  
  public void setInterfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
  }

  
  /**
   **/
  public IBInterfacePort addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressId")
  public String getAddressId() {
    return addressId;
  }
  
  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  
  /**
   **/
  public IBInterfacePort niceAddressId(String niceAddressId) {
    this.niceAddressId = niceAddressId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("niceAddressId")
  public String getNiceAddressId() {
    return niceAddressId;
  }
  
  public void setNiceAddressId(String niceAddressId) {
    this.niceAddressId = niceAddressId;
  }

  
  /**
   **/
  public IBInterfacePort id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IBInterfacePort iBInterfacePort = (IBInterfacePort) o;
    return Objects.equals(this.interfaceRef, iBInterfacePort.interfaceRef) &&
        Objects.equals(this.channel, iBInterfacePort.channel) &&
        Objects.equals(this.channelPortRef, iBInterfacePort.channelPortRef) &&
        Objects.equals(this.localIdentifier, iBInterfacePort.localIdentifier) &&
        Objects.equals(this.globalIdentifier, iBInterfacePort.globalIdentifier) &&
        Objects.equals(this.linkState, iBInterfacePort.linkState) &&
        Objects.equals(this.portState, iBInterfacePort.portState) &&
        Objects.equals(this.maximumTransmissionUnit, iBInterfacePort.maximumTransmissionUnit) &&
        Objects.equals(this.currentSpeed, iBInterfacePort.currentSpeed) &&
        Objects.equals(this.supportedSpeed, iBInterfacePort.supportedSpeed) &&
        Objects.equals(this.currentLinkWidth, iBInterfacePort.currentLinkWidth) &&
        Objects.equals(this.supportedLinkWidth, iBInterfacePort.supportedLinkWidth) &&
        Objects.equals(this.currentDataVirtualLanes, iBInterfacePort.currentDataVirtualLanes) &&
        Objects.equals(this.maximumDataVirtualLanes, iBInterfacePort.maximumDataVirtualLanes) &&
        Objects.equals(this.physicalLocation, iBInterfacePort.physicalLocation) &&
        Objects.equals(this.protectionInformationCapable, iBInterfacePort.protectionInformationCapable) &&
        Objects.equals(this.isSRPSupported, iBInterfacePort.isSRPSupported) &&
        Objects.equals(this.isISERSupported, iBInterfacePort.isISERSupported) &&
        Objects.equals(this.physPortState, iBInterfacePort.physPortState) &&
        Objects.equals(this.oneWayMaxRate, iBInterfacePort.oneWayMaxRate) &&
        Objects.equals(this.bidirectionalMaxRate, iBInterfacePort.bidirectionalMaxRate) &&
        Objects.equals(this.controllerId, iBInterfacePort.controllerId) &&
        Objects.equals(this.interfaceId, iBInterfacePort.interfaceId) &&
        Objects.equals(this.addressId, iBInterfacePort.addressId) &&
        Objects.equals(this.niceAddressId, iBInterfacePort.niceAddressId) &&
        Objects.equals(this.id, iBInterfacePort.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceRef, channel, channelPortRef, localIdentifier, globalIdentifier, linkState, portState, maximumTransmissionUnit, currentSpeed, supportedSpeed, currentLinkWidth, supportedLinkWidth, currentDataVirtualLanes, maximumDataVirtualLanes, physicalLocation, protectionInformationCapable, isSRPSupported, isISERSupported, physPortState, oneWayMaxRate, bidirectionalMaxRate, controllerId, interfaceId, addressId, niceAddressId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IBInterfacePort {\n");
    
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    channelPortRef: ").append(toIndentedString(channelPortRef)).append("\n");
    sb.append("    localIdentifier: ").append(toIndentedString(localIdentifier)).append("\n");
    sb.append("    globalIdentifier: ").append(toIndentedString(globalIdentifier)).append("\n");
    sb.append("    linkState: ").append(toIndentedString(linkState)).append("\n");
    sb.append("    portState: ").append(toIndentedString(portState)).append("\n");
    sb.append("    maximumTransmissionUnit: ").append(toIndentedString(maximumTransmissionUnit)).append("\n");
    sb.append("    currentSpeed: ").append(toIndentedString(currentSpeed)).append("\n");
    sb.append("    supportedSpeed: ").append(toIndentedString(supportedSpeed)).append("\n");
    sb.append("    currentLinkWidth: ").append(toIndentedString(currentLinkWidth)).append("\n");
    sb.append("    supportedLinkWidth: ").append(toIndentedString(supportedLinkWidth)).append("\n");
    sb.append("    currentDataVirtualLanes: ").append(toIndentedString(currentDataVirtualLanes)).append("\n");
    sb.append("    maximumDataVirtualLanes: ").append(toIndentedString(maximumDataVirtualLanes)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    isSRPSupported: ").append(toIndentedString(isSRPSupported)).append("\n");
    sb.append("    isISERSupported: ").append(toIndentedString(isISERSupported)).append("\n");
    sb.append("    physPortState: ").append(toIndentedString(physPortState)).append("\n");
    sb.append("    oneWayMaxRate: ").append(toIndentedString(oneWayMaxRate)).append("\n");
    sb.append("    bidirectionalMaxRate: ").append(toIndentedString(bidirectionalMaxRate)).append("\n");
    sb.append("    controllerId: ").append(toIndentedString(controllerId)).append("\n");
    sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    niceAddressId: ").append(toIndentedString(niceAddressId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

