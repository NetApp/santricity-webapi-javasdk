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
 * FibreInterface
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FibreInterface   {
  
    private Integer channel;

    private Integer loopID;

    private Integer speed;

    private Integer hardAddress;

    private String nodeName;

    private String portName;

    private String portId;


  /**
   * The Fibre Channel topology type being used.
   */
  public enum TopologyEnum {
    unknown("unknown"),
    ptp("ptp"),
    fabric("fabric"),
    arbLoop("arbLoop"),
    fabLoop("fabLoop"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TopologyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TopologyEnum topology;

    private String part;

    private Integer revision;

    private Boolean chanMiswire;

    private Boolean esmMiswire;


  /**
   * The status of the fibre channel link for this interface.
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

    private Boolean isDegraded;


  /**
   * The speed of the interface in MB per sec. This field is deprecated. The fieldcurrentInterfaceSpeed should be used instead.
   */
  public enum SpeedControlEnum {
    unknown("unknown"),
    fixed("fixed"),
    switched("switched"),
    auto("auto"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SpeedControlEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SpeedControlEnum speedControl;

    private Integer maxSpeed;

    private Boolean speedNegError;

    private String reserved1;

    private String reserved2;

    private Integer ddsChannelState;

    private Integer ddsStateReason;

    private Integer ddsStateWho;

    private Boolean isLocal;

    private List<ChannelPorts> channelPorts;


  /**
   * The current interface speed of the Fibre Channel interface.
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
   * The maximum interface speed of the Fibre Channel interface.
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

    private String interfaceRef;

    private Location physicalLocation;

    private Boolean isTrunkCapable;

    private Boolean trunkMiswire;

    private Boolean protectionInformationCapable;

    private Long oneWayMaxRate;

    private Long bidirectionalMaxRate;

    private String id;

  
  /**
   * The channel number of this interface.
   **/
  public FibreInterface channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel number of this interface.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The FC loop ID value used by the controller on this channel.
   **/
  public FibreInterface loopID(Integer loopID) {
    this.loopID = loopID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The FC loop ID value used by the controller on this channel.")
  @JsonProperty("loopID")
  public Integer getLoopID() {
    return loopID;
  }
  
  public void setLoopID(Integer loopID) {
    this.loopID = loopID;
  }

  
  /**
   * The speed of the interface in MB/sec. This field is deprecated. The field currentInterfaceSpeed should be used instead.
   **/
  public FibreInterface speed(Integer speed) {
    this.speed = speed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The speed of the interface in MB/sec. This field is deprecated. The field currentInterfaceSpeed should be used instead.")
  @JsonProperty("speed")
  public Integer getSpeed() {
    return speed;
  }
  
  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  
  /**
   * The hard (preferred) address of the interface, in loop ID format.
   **/
  public FibreInterface hardAddress(Integer hardAddress) {
    this.hardAddress = hardAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The hard (preferred) address of the interface, in loop ID format.")
  @JsonProperty("hardAddress")
  public Integer getHardAddress() {
    return hardAddress;
  }
  
  public void setHardAddress(Integer hardAddress) {
    this.hardAddress = hardAddress;
  }

  
  /**
   * The unique identifier of the storage array node associated with this interface.
   **/
  public FibreInterface nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the storage array node associated with this interface.")
  @JsonProperty("nodeName")
  public String getNodeName() {
    return nodeName;
  }
  
  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  
  /**
   * The unique identifier of the Fibre Channel port associated with this interface.
   **/
  public FibreInterface portName(String portName) {
    this.portName = portName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the Fibre Channel port associated with this interface.")
  @JsonProperty("portName")
  public String getPortName() {
    return portName;
  }
  
  public void setPortName(String portName) {
    this.portName = portName;
  }

  
  /**
   * The NL_Port identifier assigned to this interface.
   **/
  public FibreInterface portId(String portId) {
    this.portId = portId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The NL_Port identifier assigned to this interface.")
  @JsonProperty("portId")
  public String getPortId() {
    return portId;
  }
  
  public void setPortId(String portId) {
    this.portId = portId;
  }

  
  /**
   * The Fibre Channel topology type being used.
   **/
  public FibreInterface topology(TopologyEnum topology) {
    this.topology = topology;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Fibre Channel topology type being used.")
  @JsonProperty("topology")
  public TopologyEnum getTopology() {
    return topology;
  }
  
  public void setTopology(TopologyEnum topology) {
    this.topology = topology;
  }

  
  /**
   * An ASCII text string that describes the Fibre Channel controller chip type.
   **/
  public FibreInterface part(String part) {
    this.part = part;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII text string that describes the Fibre Channel controller chip type.")
  @JsonProperty("part")
  public String getPart() {
    return part;
  }
  
  public void setPart(String part) {
    this.part = part;
  }

  
  /**
   * The revision level of the Fibre Channel controller chip.
   **/
  public FibreInterface revision(Integer revision) {
    this.revision = revision;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The revision level of the Fibre Channel controller chip.")
  @JsonProperty("revision")
  public Integer getRevision() {
    return revision;
  }
  
  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  
  /**
   * True, if this channel is joined with another one.
   **/
  public FibreInterface chanMiswire(Boolean chanMiswire) {
    this.chanMiswire = chanMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if this channel is joined with another one.")
  @JsonProperty("chanMiswire")
  public Boolean getChanMiswire() {
    return chanMiswire;
  }
  
  public void setChanMiswire(Boolean chanMiswire) {
    this.chanMiswire = chanMiswire;
  }

  
  /**
   * True, if an ESM miswire condition exists somewhere on this channel.
   **/
  public FibreInterface esmMiswire(Boolean esmMiswire) {
    this.esmMiswire = esmMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if an ESM miswire condition exists somewhere on this channel.")
  @JsonProperty("esmMiswire")
  public Boolean getEsmMiswire() {
    return esmMiswire;
  }
  
  public void setEsmMiswire(Boolean esmMiswire) {
    this.esmMiswire = esmMiswire;
  }

  
  /**
   * The status of the fibre channel link for this interface.
   **/
  public FibreInterface linkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the fibre channel link for this interface.")
  @JsonProperty("linkStatus")
  public LinkStatusEnum getLinkStatus() {
    return linkStatus;
  }
  
  public void setLinkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
  }

  
  /**
   * True if the channel associated with this interface is degraded.
   **/
  public FibreInterface isDegraded(Boolean isDegraded) {
    this.isDegraded = isDegraded;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the channel associated with this interface is degraded.")
  @JsonProperty("isDegraded")
  public Boolean getIsDegraded() {
    return isDegraded;
  }
  
  public void setIsDegraded(Boolean isDegraded) {
    this.isDegraded = isDegraded;
  }

  
  /**
   * The speed of the interface in MB per sec. This field is deprecated. The fieldcurrentInterfaceSpeed should be used instead.
   **/
  public FibreInterface speedControl(SpeedControlEnum speedControl) {
    this.speedControl = speedControl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The speed of the interface in MB per sec. This field is deprecated. The fieldcurrentInterfaceSpeed should be used instead.")
  @JsonProperty("speedControl")
  public SpeedControlEnum getSpeedControl() {
    return speedControl;
  }
  
  public void setSpeedControl(SpeedControlEnum speedControl) {
    this.speedControl = speedControl;
  }

  
  /**
   * The maximum speed in MB/s the interface can run. This field is deprecated. The field maximumInterfaceSpeed should be used instead.
   **/
  public FibreInterface maxSpeed(Integer maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum speed in MB/s the interface can run. This field is deprecated. The field maximumInterfaceSpeed should be used instead.")
  @JsonProperty("maxSpeed")
  public Integer getMaxSpeed() {
    return maxSpeed;
  }
  
  public void setMaxSpeed(Integer maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  
  /**
   * True if speed negotiation could not complete.
   **/
  public FibreInterface speedNegError(Boolean speedNegError) {
    this.speedNegError = speedNegError;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if speed negotiation could not complete.")
  @JsonProperty("speedNegError")
  public Boolean getSpeedNegError() {
    return speedNegError;
  }
  
  public void setSpeedNegError(Boolean speedNegError) {
    this.speedNegError = speedNegError;
  }

  
  /**
   **/
  public FibreInterface reserved1(String reserved1) {
    this.reserved1 = reserved1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved1")
  public String getReserved1() {
    return reserved1;
  }
  
  public void setReserved1(String reserved1) {
    this.reserved1 = reserved1;
  }

  
  /**
   **/
  public FibreInterface reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  
  /**
   * The DDS state of this drive side channel: optimal, degraded, or failed.
   **/
  public FibreInterface ddsChannelState(Integer ddsChannelState) {
    this.ddsChannelState = ddsChannelState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The DDS state of this drive side channel: optimal, degraded, or failed.")
  @JsonProperty("ddsChannelState")
  public Integer getDdsChannelState() {
    return ddsChannelState;
  }
  
  public void setDdsChannelState(Integer ddsChannelState) {
    this.ddsChannelState = ddsChannelState;
  }

  
  /**
   * DDS state reason.
   **/
  public FibreInterface ddsStateReason(Integer ddsStateReason) {
    this.ddsStateReason = ddsStateReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "DDS state reason.")
  @JsonProperty("ddsStateReason")
  public Integer getDdsStateReason() {
    return ddsStateReason;
  }
  
  public void setDdsStateReason(Integer ddsStateReason) {
    this.ddsStateReason = ddsStateReason;
  }

  
  /**
   * Which controller placed the drive side channel in this DDS state.
   **/
  public FibreInterface ddsStateWho(Integer ddsStateWho) {
    this.ddsStateWho = ddsStateWho;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Which controller placed the drive side channel in this DDS state.")
  @JsonProperty("ddsStateWho")
  public Integer getDdsStateWho() {
    return ddsStateWho;
  }
  
  public void setDdsStateWho(Integer ddsStateWho) {
    this.ddsStateWho = ddsStateWho;
  }

  
  /**
   * Set to True if there are channel ports physically attached to this controller.
   **/
  public FibreInterface isLocal(Boolean isLocal) {
    this.isLocal = isLocal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to True if there are channel ports physically attached to this controller.")
  @JsonProperty("isLocal")
  public Boolean getIsLocal() {
    return isLocal;
  }
  
  public void setIsLocal(Boolean isLocal) {
    this.isLocal = isLocal;
  }

  
  /**
   * Channel port speed information. This field is deprecated. The same information is available in the LinkSpeedDetectionError structure.
   **/
  public FibreInterface channelPorts(List<ChannelPorts> channelPorts) {
    this.channelPorts = channelPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Channel port speed information. This field is deprecated. The same information is available in the LinkSpeedDetectionError structure.")
  @JsonProperty("channelPorts")
  public List<ChannelPorts> getChannelPorts() {
    return channelPorts;
  }
  
  public void setChannelPorts(List<ChannelPorts> channelPorts) {
    this.channelPorts = channelPorts;
  }

  
  /**
   * The current interface speed of the Fibre Channel interface.
   **/
  public FibreInterface currentInterfaceSpeed(CurrentInterfaceSpeedEnum currentInterfaceSpeed) {
    this.currentInterfaceSpeed = currentInterfaceSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current interface speed of the Fibre Channel interface.")
  @JsonProperty("currentInterfaceSpeed")
  public CurrentInterfaceSpeedEnum getCurrentInterfaceSpeed() {
    return currentInterfaceSpeed;
  }
  
  public void setCurrentInterfaceSpeed(CurrentInterfaceSpeedEnum currentInterfaceSpeed) {
    this.currentInterfaceSpeed = currentInterfaceSpeed;
  }

  
  /**
   * The maximum interface speed of the Fibre Channel interface.
   **/
  public FibreInterface maximumInterfaceSpeed(MaximumInterfaceSpeedEnum maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum interface speed of the Fibre Channel interface.")
  @JsonProperty("maximumInterfaceSpeed")
  public MaximumInterfaceSpeedEnum getMaximumInterfaceSpeed() {
    return maximumInterfaceSpeed;
  }
  
  public void setMaximumInterfaceSpeed(MaximumInterfaceSpeedEnum maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
  }

  
  /**
   * The unique identifier for a given instance of this structure.
   **/
  public FibreInterface interfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier for a given instance of this structure.")
  @JsonProperty("interfaceRef")
  public String getInterfaceRef() {
    return interfaceRef;
  }
  
  public void setInterfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
  }

  
  /**
   * The physical location of the Fibre Channel interface. The parent reference in location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st Fibre Channel interface relative to the parent,\" \"2nd Fibre Channel interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.
   **/
  public FibreInterface physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the Fibre Channel interface. The parent reference in location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st Fibre Channel interface relative to the parent,\" \"2nd Fibre Channel interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * This field is true if the Fibre interface on the controller board is trunk capable. This field is always false for host-side interfaces.
   **/
  public FibreInterface isTrunkCapable(Boolean isTrunkCapable) {
    this.isTrunkCapable = isTrunkCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is true if the Fibre interface on the controller board is trunk capable. This field is always false for host-side interfaces.")
  @JsonProperty("isTrunkCapable")
  public Boolean getIsTrunkCapable() {
    return isTrunkCapable;
  }
  
  public void setIsTrunkCapable(Boolean isTrunkCapable) {
    this.isTrunkCapable = isTrunkCapable;
  }

  
  /**
   * True only when ESM is trunk capable and cabled incorrectly, or not trunk capable but connected in trunk mode.
   **/
  public FibreInterface trunkMiswire(Boolean trunkMiswire) {
    this.trunkMiswire = trunkMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True only when ESM is trunk capable and cabled incorrectly, or not trunk capable but connected in trunk mode.")
  @JsonProperty("trunkMiswire")
  public Boolean getTrunkMiswire() {
    return trunkMiswire;
  }
  
  public void setTrunkMiswire(Boolean trunkMiswire) {
    this.trunkMiswire = trunkMiswire;
  }

  
  /**
   **/
  public FibreInterface protectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("protectionInformationCapable")
  public Boolean getProtectionInformationCapable() {
    return protectionInformationCapable;
  }
  
  public void setProtectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
  }

  
  /**
   * Maximum one way data rate in B/s
   **/
  public FibreInterface oneWayMaxRate(Long oneWayMaxRate) {
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
  public FibreInterface bidirectionalMaxRate(Long bidirectionalMaxRate) {
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
  public FibreInterface id(String id) {
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
    FibreInterface fibreInterface = (FibreInterface) o;
    return Objects.equals(this.channel, fibreInterface.channel) &&
        Objects.equals(this.loopID, fibreInterface.loopID) &&
        Objects.equals(this.speed, fibreInterface.speed) &&
        Objects.equals(this.hardAddress, fibreInterface.hardAddress) &&
        Objects.equals(this.nodeName, fibreInterface.nodeName) &&
        Objects.equals(this.portName, fibreInterface.portName) &&
        Objects.equals(this.portId, fibreInterface.portId) &&
        Objects.equals(this.topology, fibreInterface.topology) &&
        Objects.equals(this.part, fibreInterface.part) &&
        Objects.equals(this.revision, fibreInterface.revision) &&
        Objects.equals(this.chanMiswire, fibreInterface.chanMiswire) &&
        Objects.equals(this.esmMiswire, fibreInterface.esmMiswire) &&
        Objects.equals(this.linkStatus, fibreInterface.linkStatus) &&
        Objects.equals(this.isDegraded, fibreInterface.isDegraded) &&
        Objects.equals(this.speedControl, fibreInterface.speedControl) &&
        Objects.equals(this.maxSpeed, fibreInterface.maxSpeed) &&
        Objects.equals(this.speedNegError, fibreInterface.speedNegError) &&
        Objects.equals(this.reserved1, fibreInterface.reserved1) &&
        Objects.equals(this.reserved2, fibreInterface.reserved2) &&
        Objects.equals(this.ddsChannelState, fibreInterface.ddsChannelState) &&
        Objects.equals(this.ddsStateReason, fibreInterface.ddsStateReason) &&
        Objects.equals(this.ddsStateWho, fibreInterface.ddsStateWho) &&
        Objects.equals(this.isLocal, fibreInterface.isLocal) &&
        Objects.equals(this.channelPorts, fibreInterface.channelPorts) &&
        Objects.equals(this.currentInterfaceSpeed, fibreInterface.currentInterfaceSpeed) &&
        Objects.equals(this.maximumInterfaceSpeed, fibreInterface.maximumInterfaceSpeed) &&
        Objects.equals(this.interfaceRef, fibreInterface.interfaceRef) &&
        Objects.equals(this.physicalLocation, fibreInterface.physicalLocation) &&
        Objects.equals(this.isTrunkCapable, fibreInterface.isTrunkCapable) &&
        Objects.equals(this.trunkMiswire, fibreInterface.trunkMiswire) &&
        Objects.equals(this.protectionInformationCapable, fibreInterface.protectionInformationCapable) &&
        Objects.equals(this.oneWayMaxRate, fibreInterface.oneWayMaxRate) &&
        Objects.equals(this.bidirectionalMaxRate, fibreInterface.bidirectionalMaxRate) &&
        Objects.equals(this.id, fibreInterface.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, loopID, speed, hardAddress, nodeName, portName, portId, topology, part, revision, chanMiswire, esmMiswire, linkStatus, isDegraded, speedControl, maxSpeed, speedNegError, reserved1, reserved2, ddsChannelState, ddsStateReason, ddsStateWho, isLocal, channelPorts, currentInterfaceSpeed, maximumInterfaceSpeed, interfaceRef, physicalLocation, isTrunkCapable, trunkMiswire, protectionInformationCapable, oneWayMaxRate, bidirectionalMaxRate, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FibreInterface {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    loopID: ").append(toIndentedString(loopID)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    hardAddress: ").append(toIndentedString(hardAddress)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    portName: ").append(toIndentedString(portName)).append("\n");
    sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    chanMiswire: ").append(toIndentedString(chanMiswire)).append("\n");
    sb.append("    esmMiswire: ").append(toIndentedString(esmMiswire)).append("\n");
    sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
    sb.append("    isDegraded: ").append(toIndentedString(isDegraded)).append("\n");
    sb.append("    speedControl: ").append(toIndentedString(speedControl)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    speedNegError: ").append(toIndentedString(speedNegError)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    ddsChannelState: ").append(toIndentedString(ddsChannelState)).append("\n");
    sb.append("    ddsStateReason: ").append(toIndentedString(ddsStateReason)).append("\n");
    sb.append("    ddsStateWho: ").append(toIndentedString(ddsStateWho)).append("\n");
    sb.append("    isLocal: ").append(toIndentedString(isLocal)).append("\n");
    sb.append("    channelPorts: ").append(toIndentedString(channelPorts)).append("\n");
    sb.append("    currentInterfaceSpeed: ").append(toIndentedString(currentInterfaceSpeed)).append("\n");
    sb.append("    maximumInterfaceSpeed: ").append(toIndentedString(maximumInterfaceSpeed)).append("\n");
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    isTrunkCapable: ").append(toIndentedString(isTrunkCapable)).append("\n");
    sb.append("    trunkMiswire: ").append(toIndentedString(trunkMiswire)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    oneWayMaxRate: ").append(toIndentedString(oneWayMaxRate)).append("\n");
    sb.append("    bidirectionalMaxRate: ").append(toIndentedString(bidirectionalMaxRate)).append("\n");
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

