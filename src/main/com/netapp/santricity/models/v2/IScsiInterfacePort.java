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
 * IScsiInterfacePort
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class IScsiInterfacePort   {
  
    private Integer channel;

    private String channelPortRef;

    private Integer tcpListenPort;

    private Boolean ipv4Enabled;

    private InternetProtocolV4Data ipv4Data;

    private PhysicalInterfaceTypeData interfaceData;

    private String interfaceRef;

    private Boolean ipv6Enabled;

    private InternetProtocolV6Data ipv6Data;

    private Location physicalLocation;

    private Boolean protectionInformationCapable;

    private Boolean isIPv6Capable;

    private Long oneWayMaxRate;

    private Long bidirectionalMaxRate;

    private String iqn;

    private String controllerId;

    private String interfaceId;

    private String addressId;

    private String niceAddressId;

    private String id;

  
  /**
   * The number of the channel controlled by this interface.
   **/
  public IScsiInterfacePort channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the channel controlled by this interface.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * A reference to the channel port object associated with the channel controlled by this interface.
   **/
  public IScsiInterfacePort channelPortRef(String channelPortRef) {
    this.channelPortRef = channelPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the channel port object associated with the channel controlled by this interface.")
  @JsonProperty("channelPortRef")
  public String getChannelPortRef() {
    return channelPortRef;
  }
  
  public void setChannelPortRef(String channelPortRef) {
    this.channelPortRef = channelPortRef;
  }

  
  /**
   * The number of the TCP port on which the target listens for incoming connections.
   **/
  public IScsiInterfacePort tcpListenPort(Integer tcpListenPort) {
    this.tcpListenPort = tcpListenPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the TCP port on which the target listens for incoming connections.")
  @JsonProperty("tcpListenPort")
  public Integer getTcpListenPort() {
    return tcpListenPort;
  }
  
  public void setTcpListenPort(Integer tcpListenPort) {
    this.tcpListenPort = tcpListenPort;
  }

  
  /**
   * True if IPV4 is enabled for this interface; always true for iSER interface.
   **/
  public IScsiInterfacePort ipv4Enabled(Boolean ipv4Enabled) {
    this.ipv4Enabled = ipv4Enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if IPV4 is enabled for this interface; always true for iSER interface.")
  @JsonProperty("ipv4Enabled")
  public Boolean getIpv4Enabled() {
    return ipv4Enabled;
  }
  
  public void setIpv4Enabled(Boolean ipv4Enabled) {
    this.ipv4Enabled = ipv4Enabled;
  }

  
  /**
   * IPV4-related information for the interface.
   **/
  public IScsiInterfacePort ipv4Data(InternetProtocolV4Data ipv4Data) {
    this.ipv4Data = ipv4Data;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IPV4-related information for the interface.")
  @JsonProperty("ipv4Data")
  public InternetProtocolV4Data getIpv4Data() {
    return ipv4Data;
  }
  
  public void setIpv4Data(InternetProtocolV4Data ipv4Data) {
    this.ipv4Data = ipv4Data;
  }

  
  /**
   * Information about the physical interface (e.g., Ethernet).
   **/
  public IScsiInterfacePort interfaceData(PhysicalInterfaceTypeData interfaceData) {
    this.interfaceData = interfaceData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the physical interface (e.g., Ethernet).")
  @JsonProperty("interfaceData")
  public PhysicalInterfaceTypeData getInterfaceData() {
    return interfaceData;
  }
  
  public void setInterfaceData(PhysicalInterfaceTypeData interfaceData) {
    this.interfaceData = interfaceData;
  }

  
  /**
   * The unique identifier for a given instance of this structure.
   **/
  public IScsiInterfacePort interfaceRef(String interfaceRef) {
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
   * True if IPV6 is enabled for this interface; otherwise false.
   **/
  public IScsiInterfacePort ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if IPV6 is enabled for this interface; otherwise false.")
  @JsonProperty("ipv6Enabled")
  public Boolean getIpv6Enabled() {
    return ipv6Enabled;
  }
  
  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }

  
  /**
   * IPV6-related information for the interface.
   **/
  public IScsiInterfacePort ipv6Data(InternetProtocolV6Data ipv6Data) {
    this.ipv6Data = ipv6Data;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IPV6-related information for the interface.")
  @JsonProperty("ipv6Data")
  public InternetProtocolV6Data getIpv6Data() {
    return ipv6Data;
  }
  
  public void setIpv6Data(InternetProtocolV6Data ipv6Data) {
    this.ipv6Data = ipv6Data;
  }

  
  /**
   * The physical location of the iSCSI interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st iSCSI interface relative to the parent,\" \"2nd iSCSI interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.
   **/
  public IScsiInterfacePort physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the iSCSI interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st iSCSI interface relative to the parent,\" \"2nd iSCSI interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.")
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
  public IScsiInterfacePort protectionInformationCapable(Boolean protectionInformationCapable) {
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
   * This flag is true if the interface is capable of IPv6 functionality.
   **/
  public IScsiInterfacePort isIPv6Capable(Boolean isIPv6Capable) {
    this.isIPv6Capable = isIPv6Capable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This flag is true if the interface is capable of IPv6 functionality.")
  @JsonProperty("isIPv6Capable")
  public Boolean getIsIPv6Capable() {
    return isIPv6Capable;
  }
  
  public void setIsIPv6Capable(Boolean isIPv6Capable) {
    this.isIPv6Capable = isIPv6Capable;
  }

  
  /**
   * Maximum one way data rate in B/s
   **/
  public IScsiInterfacePort oneWayMaxRate(Long oneWayMaxRate) {
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
  public IScsiInterfacePort bidirectionalMaxRate(Long bidirectionalMaxRate) {
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
  public IScsiInterfacePort iqn(String iqn) {
    this.iqn = iqn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("iqn")
  public String getIqn() {
    return iqn;
  }
  
  public void setIqn(String iqn) {
    this.iqn = iqn;
  }

  
  /**
   **/
  public IScsiInterfacePort controllerId(String controllerId) {
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
  public IScsiInterfacePort interfaceId(String interfaceId) {
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
  public IScsiInterfacePort addressId(String addressId) {
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
  public IScsiInterfacePort niceAddressId(String niceAddressId) {
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
  public IScsiInterfacePort id(String id) {
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
    IScsiInterfacePort iScsiInterfacePort = (IScsiInterfacePort) o;
    return Objects.equals(this.channel, iScsiInterfacePort.channel) &&
        Objects.equals(this.channelPortRef, iScsiInterfacePort.channelPortRef) &&
        Objects.equals(this.tcpListenPort, iScsiInterfacePort.tcpListenPort) &&
        Objects.equals(this.ipv4Enabled, iScsiInterfacePort.ipv4Enabled) &&
        Objects.equals(this.ipv4Data, iScsiInterfacePort.ipv4Data) &&
        Objects.equals(this.interfaceData, iScsiInterfacePort.interfaceData) &&
        Objects.equals(this.interfaceRef, iScsiInterfacePort.interfaceRef) &&
        Objects.equals(this.ipv6Enabled, iScsiInterfacePort.ipv6Enabled) &&
        Objects.equals(this.ipv6Data, iScsiInterfacePort.ipv6Data) &&
        Objects.equals(this.physicalLocation, iScsiInterfacePort.physicalLocation) &&
        Objects.equals(this.protectionInformationCapable, iScsiInterfacePort.protectionInformationCapable) &&
        Objects.equals(this.isIPv6Capable, iScsiInterfacePort.isIPv6Capable) &&
        Objects.equals(this.oneWayMaxRate, iScsiInterfacePort.oneWayMaxRate) &&
        Objects.equals(this.bidirectionalMaxRate, iScsiInterfacePort.bidirectionalMaxRate) &&
        Objects.equals(this.iqn, iScsiInterfacePort.iqn) &&
        Objects.equals(this.controllerId, iScsiInterfacePort.controllerId) &&
        Objects.equals(this.interfaceId, iScsiInterfacePort.interfaceId) &&
        Objects.equals(this.addressId, iScsiInterfacePort.addressId) &&
        Objects.equals(this.niceAddressId, iScsiInterfacePort.niceAddressId) &&
        Objects.equals(this.id, iScsiInterfacePort.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, channelPortRef, tcpListenPort, ipv4Enabled, ipv4Data, interfaceData, interfaceRef, ipv6Enabled, ipv6Data, physicalLocation, protectionInformationCapable, isIPv6Capable, oneWayMaxRate, bidirectionalMaxRate, iqn, controllerId, interfaceId, addressId, niceAddressId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IScsiInterfacePort {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    channelPortRef: ").append(toIndentedString(channelPortRef)).append("\n");
    sb.append("    tcpListenPort: ").append(toIndentedString(tcpListenPort)).append("\n");
    sb.append("    ipv4Enabled: ").append(toIndentedString(ipv4Enabled)).append("\n");
    sb.append("    ipv4Data: ").append(toIndentedString(ipv4Data)).append("\n");
    sb.append("    interfaceData: ").append(toIndentedString(interfaceData)).append("\n");
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    ipv6Data: ").append(toIndentedString(ipv6Data)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
    sb.append("    isIPv6Capable: ").append(toIndentedString(isIPv6Capable)).append("\n");
    sb.append("    oneWayMaxRate: ").append(toIndentedString(oneWayMaxRate)).append("\n");
    sb.append("    bidirectionalMaxRate: ").append(toIndentedString(bidirectionalMaxRate)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
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

