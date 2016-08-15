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
 * SasInterfacePort
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class SasInterfacePort   {
  
    private Integer channel;


  /**
   * The current interface speed of the SAS interface.
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
   * The maximum interface speed of the SAS interface.
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

    private String part;

    private Integer revision;

    private Boolean isDegraded;

    private SasPort iocPort;

    private String interfaceRef;

    private Location physicalLocation;

    private Boolean protectionInformationCapable;

    private Long oneWayMaxRate;

    private Long bidirectionalMaxRate;

    private String controllerId;

    private String interfaceId;

    private String addressId;

    private String niceAddressId;

    private String basePortAddress;

    private String id;

  
  /**
   * The number of the channel corresponding to this interface.
   **/
  public SasInterfacePort channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the channel corresponding to this interface.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The current interface speed of the SAS interface.
   **/
  public SasInterfacePort currentInterfaceSpeed(CurrentInterfaceSpeedEnum currentInterfaceSpeed) {
    this.currentInterfaceSpeed = currentInterfaceSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current interface speed of the SAS interface.")
  @JsonProperty("currentInterfaceSpeed")
  public CurrentInterfaceSpeedEnum getCurrentInterfaceSpeed() {
    return currentInterfaceSpeed;
  }
  
  public void setCurrentInterfaceSpeed(CurrentInterfaceSpeedEnum currentInterfaceSpeed) {
    this.currentInterfaceSpeed = currentInterfaceSpeed;
  }

  
  /**
   * The maximum interface speed of the SAS interface.
   **/
  public SasInterfacePort maximumInterfaceSpeed(MaximumInterfaceSpeedEnum maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum interface speed of the SAS interface.")
  @JsonProperty("maximumInterfaceSpeed")
  public MaximumInterfaceSpeedEnum getMaximumInterfaceSpeed() {
    return maximumInterfaceSpeed;
  }
  
  public void setMaximumInterfaceSpeed(MaximumInterfaceSpeedEnum maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
  }

  
  /**
   * A string indicating the chip type.
   **/
  public SasInterfacePort part(String part) {
    this.part = part;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A string indicating the chip type.")
  @JsonProperty("part")
  public String getPart() {
    return part;
  }
  
  public void setPart(String part) {
    this.part = part;
  }

  
  /**
   * The revision level of the firmware on the SAS I/O controller.
   **/
  public SasInterfacePort revision(Integer revision) {
    this.revision = revision;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The revision level of the firmware on the SAS I/O controller.")
  @JsonProperty("revision")
  public Integer getRevision() {
    return revision;
  }
  
  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  
  /**
   * True if the channel corresponding to this interface is degraded.
   **/
  public SasInterfacePort isDegraded(Boolean isDegraded) {
    this.isDegraded = isDegraded;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the channel corresponding to this interface is degraded.")
  @JsonProperty("isDegraded")
  public Boolean getIsDegraded() {
    return isDegraded;
  }
  
  public void setIsDegraded(Boolean isDegraded) {
    this.isDegraded = isDegraded;
  }

  
  /**
   * Information about the SAS I/O controller port corresponding to this interface.
   **/
  public SasInterfacePort iocPort(SasPort iocPort) {
    this.iocPort = iocPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the SAS I/O controller port corresponding to this interface.")
  @JsonProperty("iocPort")
  public SasPort getIocPort() {
    return iocPort;
  }
  
  public void setIocPort(SasPort iocPort) {
    this.iocPort = iocPort;
  }

  
  /**
   * The unique identifier for a given instance of this structure.
   **/
  public SasInterfacePort interfaceRef(String interfaceRef) {
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
   * The physical location of the SAS interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st SAS interface relative to the parent,\" \"2nd SAS interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.
   **/
  public SasInterfacePort physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the SAS interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st SAS interface relative to the parent,\" \"2nd SAS interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.")
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
  public SasInterfacePort protectionInformationCapable(Boolean protectionInformationCapable) {
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
   * Maximum one way data rate in B/s
   **/
  public SasInterfacePort oneWayMaxRate(Long oneWayMaxRate) {
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
  public SasInterfacePort bidirectionalMaxRate(Long bidirectionalMaxRate) {
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
  public SasInterfacePort controllerId(String controllerId) {
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
  public SasInterfacePort interfaceId(String interfaceId) {
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
  public SasInterfacePort addressId(String addressId) {
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
  public SasInterfacePort niceAddressId(String niceAddressId) {
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
  public SasInterfacePort basePortAddress(String basePortAddress) {
    this.basePortAddress = basePortAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("basePortAddress")
  public String getBasePortAddress() {
    return basePortAddress;
  }
  
  public void setBasePortAddress(String basePortAddress) {
    this.basePortAddress = basePortAddress;
  }

  
  /**
   **/
  public SasInterfacePort id(String id) {
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
    SasInterfacePort sasInterfacePort = (SasInterfacePort) o;
    return Objects.equals(this.channel, sasInterfacePort.channel) &&
        Objects.equals(this.currentInterfaceSpeed, sasInterfacePort.currentInterfaceSpeed) &&
        Objects.equals(this.maximumInterfaceSpeed, sasInterfacePort.maximumInterfaceSpeed) &&
        Objects.equals(this.part, sasInterfacePort.part) &&
        Objects.equals(this.revision, sasInterfacePort.revision) &&
        Objects.equals(this.isDegraded, sasInterfacePort.isDegraded) &&
        Objects.equals(this.iocPort, sasInterfacePort.iocPort) &&
        Objects.equals(this.interfaceRef, sasInterfacePort.interfaceRef) &&
        Objects.equals(this.physicalLocation, sasInterfacePort.physicalLocation) &&
        Objects.equals(this.protectionInformationCapable, sasInterfacePort.protectionInformationCapable) &&
        Objects.equals(this.oneWayMaxRate, sasInterfacePort.oneWayMaxRate) &&
        Objects.equals(this.bidirectionalMaxRate, sasInterfacePort.bidirectionalMaxRate) &&
        Objects.equals(this.controllerId, sasInterfacePort.controllerId) &&
        Objects.equals(this.interfaceId, sasInterfacePort.interfaceId) &&
        Objects.equals(this.addressId, sasInterfacePort.addressId) &&
        Objects.equals(this.niceAddressId, sasInterfacePort.niceAddressId) &&
        Objects.equals(this.basePortAddress, sasInterfacePort.basePortAddress) &&
        Objects.equals(this.id, sasInterfacePort.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, currentInterfaceSpeed, maximumInterfaceSpeed, part, revision, isDegraded, iocPort, interfaceRef, physicalLocation, protectionInformationCapable, oneWayMaxRate, bidirectionalMaxRate, controllerId, interfaceId, addressId, niceAddressId, basePortAddress, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasInterfacePort {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    currentInterfaceSpeed: ").append(toIndentedString(currentInterfaceSpeed)).append("\n");
    sb.append("    maximumInterfaceSpeed: ").append(toIndentedString(maximumInterfaceSpeed)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    isDegraded: ").append(toIndentedString(isDegraded)).append("\n");
    sb.append("    iocPort: ").append(toIndentedString(iocPort)).append("\n");
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    oneWayMaxRate: ").append(toIndentedString(oneWayMaxRate)).append("\n");
    sb.append("    bidirectionalMaxRate: ").append(toIndentedString(bidirectionalMaxRate)).append("\n");
    sb.append("    controllerId: ").append(toIndentedString(controllerId)).append("\n");
    sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    niceAddressId: ").append(toIndentedString(niceAddressId)).append("\n");
    sb.append("    basePortAddress: ").append(toIndentedString(basePortAddress)).append("\n");
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

