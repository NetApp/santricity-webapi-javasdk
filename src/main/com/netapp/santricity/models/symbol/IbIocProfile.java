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
 * IbIocProfile
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IbIocProfile   {
  
    private String iocGuid;

    private String vendorId;

    private Long ioDeviceId;

    private Integer deviceVersion;

    private String subsystemVendorId;

    private Long subsystemId;

    private Integer ioClass;

    private Integer ioSubclass;

    private Integer protocol;

    private Integer protocolVersion;

    private Integer sendMessageQueueDepth;

    private Integer rdmaReadQueueDepth;

    private Long sendMessageSize;

    private Long rdmaTransferSize;

    private Integer controllerOpsCapabilityMask;

    private Integer serviceEntries;

    private String idString;

  
  /**
   * The EUI-64 GUID used to uniquely identify the I/O controller.
   **/
  public IbIocProfile iocGuid(String iocGuid) {
    this.iocGuid = iocGuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The EUI-64 GUID used to uniquely identify the I/O controller.")
  @JsonProperty("iocGuid")
  public String getIocGuid() {
    return iocGuid;
  }
  
  public void setIocGuid(String iocGuid) {
    this.iocGuid = iocGuid;
  }

  
  /**
   * The I/O controller vendor ID in IEEE format.
   **/
  public IbIocProfile vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The I/O controller vendor ID in IEEE format.")
  @JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  
  /**
   * A number assigned by vendor to identify the type of I/O controller
   **/
  public IbIocProfile ioDeviceId(Long ioDeviceId) {
    this.ioDeviceId = ioDeviceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A number assigned by vendor to identify the type of I/O controller")
  @JsonProperty("ioDeviceId")
  public Long getIoDeviceId() {
    return ioDeviceId;
  }
  
  public void setIoDeviceId(Long ioDeviceId) {
    this.ioDeviceId = ioDeviceId;
  }

  
  /**
   * A number assigned by the vendor to identify the device version.
   **/
  public IbIocProfile deviceVersion(Integer deviceVersion) {
    this.deviceVersion = deviceVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A number assigned by the vendor to identify the device version.")
  @JsonProperty("deviceVersion")
  public Integer getDeviceVersion() {
    return deviceVersion;
  }
  
  public void setDeviceVersion(Integer deviceVersion) {
    this.deviceVersion = deviceVersion;
  }

  
  /**
   * The ID of the enclosure vendor in IEEE format, or else all zeros if there is no vendor ID.
   **/
  public IbIocProfile subsystemVendorId(String subsystemVendorId) {
    this.subsystemVendorId = subsystemVendorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the enclosure vendor in IEEE format, or else all zeros if there is no vendor ID.")
  @JsonProperty("subsystemVendorId")
  public String getSubsystemVendorId() {
    return subsystemVendorId;
  }
  
  public void setSubsystemVendorId(String subsystemVendorId) {
    this.subsystemVendorId = subsystemVendorId;
  }

  
  /**
   * A number identifying the subsystem where the I/O controller resides.
   **/
  public IbIocProfile subsystemId(Long subsystemId) {
    this.subsystemId = subsystemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A number identifying the subsystem where the I/O controller resides.")
  @JsonProperty("subsystemId")
  public Long getSubsystemId() {
    return subsystemId;
  }
  
  public void setSubsystemId(Long subsystemId) {
    this.subsystemId = subsystemId;
  }

  
  /**
   * The I/O class of the controller. 0x0000 -0xFFFE is reserved for I/O classes encompassed by the InfiniBand architecture. 0xFFFF is vendor-specific.
   **/
  public IbIocProfile ioClass(Integer ioClass) {
    this.ioClass = ioClass;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The I/O class of the controller. 0x0000 -0xFFFE is reserved for I/O classes encompassed by the InfiniBand architecture. 0xFFFF is vendor-specific.")
  @JsonProperty("ioClass")
  public Integer getIoClass() {
    return ioClass;
  }
  
  public void setIoClass(Integer ioClass) {
    this.ioClass = ioClass;
  }

  
  /**
   * The I/O sub-class of the controller. 0x0000 -0xFFFE is reserved for I/O sub-classes encompassed by the InfiniBand architecture. 0xFFFF is vendor-specific.
   **/
  public IbIocProfile ioSubclass(Integer ioSubclass) {
    this.ioSubclass = ioSubclass;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The I/O sub-class of the controller. 0x0000 -0xFFFE is reserved for I/O sub-classes encompassed by the InfiniBand architecture. 0xFFFF is vendor-specific.")
  @JsonProperty("ioSubclass")
  public Integer getIoSubclass() {
    return ioSubclass;
  }
  
  public void setIoSubclass(Integer ioSubclass) {
    this.ioSubclass = ioSubclass;
  }

  
  /**
   * The I/O protocol of the controller. 0x0000 -0xFFFE is reserved for I/O protocols encompassed by the InfiniBand architecture. 0xFFFF is vendor-specific.
   **/
  public IbIocProfile protocol(Integer protocol) {
    this.protocol = protocol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The I/O protocol of the controller. 0x0000 -0xFFFE is reserved for I/O protocols encompassed by the InfiniBand architecture. 0xFFFF is vendor-specific.")
  @JsonProperty("protocol")
  public Integer getProtocol() {
    return protocol;
  }
  
  public void setProtocol(Integer protocol) {
    this.protocol = protocol;
  }

  
  /**
   * The protocol version (protocol-specific).
   **/
  public IbIocProfile protocolVersion(Integer protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The protocol version (protocol-specific).")
  @JsonProperty("protocolVersion")
  public Integer getProtocolVersion() {
    return protocolVersion;
  }
  
  public void setProtocolVersion(Integer protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  
  /**
   * The maximum depth of the Send Message Queue.
   **/
  public IbIocProfile sendMessageQueueDepth(Integer sendMessageQueueDepth) {
    this.sendMessageQueueDepth = sendMessageQueueDepth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum depth of the Send Message Queue.")
  @JsonProperty("sendMessageQueueDepth")
  public Integer getSendMessageQueueDepth() {
    return sendMessageQueueDepth;
  }
  
  public void setSendMessageQueueDepth(Integer sendMessageQueueDepth) {
    this.sendMessageQueueDepth = sendMessageQueueDepth;
  }

  
  /**
   * The maximum depth of the per-channel RDMA Read Queue
   **/
  public IbIocProfile rdmaReadQueueDepth(Integer rdmaReadQueueDepth) {
    this.rdmaReadQueueDepth = rdmaReadQueueDepth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum depth of the per-channel RDMA Read Queue")
  @JsonProperty("rdmaReadQueueDepth")
  public Integer getRdmaReadQueueDepth() {
    return rdmaReadQueueDepth;
  }
  
  public void setRdmaReadQueueDepth(Integer rdmaReadQueueDepth) {
    this.rdmaReadQueueDepth = rdmaReadQueueDepth;
  }

  
  /**
   * The maximum size of Send Messages in bytes.
   **/
  public IbIocProfile sendMessageSize(Long sendMessageSize) {
    this.sendMessageSize = sendMessageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum size of Send Messages in bytes.")
  @JsonProperty("sendMessageSize")
  public Long getSendMessageSize() {
    return sendMessageSize;
  }
  
  public void setSendMessageSize(Long sendMessageSize) {
    this.sendMessageSize = sendMessageSize;
  }

  
  /**
   * The maximum size of outbound RDMA transfers initiated by the controller.
   **/
  public IbIocProfile rdmaTransferSize(Long rdmaTransferSize) {
    this.rdmaTransferSize = rdmaTransferSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum size of outbound RDMA transfers initiated by the controller.")
  @JsonProperty("rdmaTransferSize")
  public Long getRdmaTransferSize() {
    return rdmaTransferSize;
  }
  
  public void setRdmaTransferSize(Long rdmaTransferSize) {
    this.rdmaTransferSize = rdmaTransferSize;
  }

  
  /**
   * Supported operation types of this controller.: Bit 0 on = Send Messages to IOCs Bit 1 on = Send Messages from IOCs Bit 2 on = RDMA Read Requests to IOCs Bit 3 on = RDMA Read Requests from IOCs Bit 4 on = RDMA Write Requests to IOCs Bit 5 on = RDMA Write Requests from IOCs Bit 6 on = Atomic operations to IOCs Bit 7 on = Atomic operations from IOCs
   **/
  public IbIocProfile controllerOpsCapabilityMask(Integer controllerOpsCapabilityMask) {
    this.controllerOpsCapabilityMask = controllerOpsCapabilityMask;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Supported operation types of this controller.: Bit 0 on = Send Messages to IOCs Bit 1 on = Send Messages from IOCs Bit 2 on = RDMA Read Requests to IOCs Bit 3 on = RDMA Read Requests from IOCs Bit 4 on = RDMA Write Requests to IOCs Bit 5 on = RDMA Write Requests from IOCs Bit 6 on = Atomic operations to IOCs Bit 7 on = Atomic operations from IOCs")
  @JsonProperty("controllerOpsCapabilityMask")
  public Integer getControllerOpsCapabilityMask() {
    return controllerOpsCapabilityMask;
  }
  
  public void setControllerOpsCapabilityMask(Integer controllerOpsCapabilityMask) {
    this.controllerOpsCapabilityMask = controllerOpsCapabilityMask;
  }

  
  /**
   * The number of entries in the service entries table
   **/
  public IbIocProfile serviceEntries(Integer serviceEntries) {
    this.serviceEntries = serviceEntries;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of entries in the service entries table")
  @JsonProperty("serviceEntries")
  public Integer getServiceEntries() {
    return serviceEntries;
  }
  
  public void setServiceEntries(Integer serviceEntries) {
    this.serviceEntries = serviceEntries;
  }

  
  /**
   * A UTF-8 encoded string for identifying the controller to user.
   **/
  public IbIocProfile idString(String idString) {
    this.idString = idString;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A UTF-8 encoded string for identifying the controller to user.")
  @JsonProperty("idString")
  public String getIdString() {
    return idString;
  }
  
  public void setIdString(String idString) {
    this.idString = idString;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbIocProfile ibIocProfile = (IbIocProfile) o;
    return Objects.equals(this.iocGuid, ibIocProfile.iocGuid) &&
        Objects.equals(this.vendorId, ibIocProfile.vendorId) &&
        Objects.equals(this.ioDeviceId, ibIocProfile.ioDeviceId) &&
        Objects.equals(this.deviceVersion, ibIocProfile.deviceVersion) &&
        Objects.equals(this.subsystemVendorId, ibIocProfile.subsystemVendorId) &&
        Objects.equals(this.subsystemId, ibIocProfile.subsystemId) &&
        Objects.equals(this.ioClass, ibIocProfile.ioClass) &&
        Objects.equals(this.ioSubclass, ibIocProfile.ioSubclass) &&
        Objects.equals(this.protocol, ibIocProfile.protocol) &&
        Objects.equals(this.protocolVersion, ibIocProfile.protocolVersion) &&
        Objects.equals(this.sendMessageQueueDepth, ibIocProfile.sendMessageQueueDepth) &&
        Objects.equals(this.rdmaReadQueueDepth, ibIocProfile.rdmaReadQueueDepth) &&
        Objects.equals(this.sendMessageSize, ibIocProfile.sendMessageSize) &&
        Objects.equals(this.rdmaTransferSize, ibIocProfile.rdmaTransferSize) &&
        Objects.equals(this.controllerOpsCapabilityMask, ibIocProfile.controllerOpsCapabilityMask) &&
        Objects.equals(this.serviceEntries, ibIocProfile.serviceEntries) &&
        Objects.equals(this.idString, ibIocProfile.idString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iocGuid, vendorId, ioDeviceId, deviceVersion, subsystemVendorId, subsystemId, ioClass, ioSubclass, protocol, protocolVersion, sendMessageQueueDepth, rdmaReadQueueDepth, sendMessageSize, rdmaTransferSize, controllerOpsCapabilityMask, serviceEntries, idString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbIocProfile {\n");
    
    sb.append("    iocGuid: ").append(toIndentedString(iocGuid)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    ioDeviceId: ").append(toIndentedString(ioDeviceId)).append("\n");
    sb.append("    deviceVersion: ").append(toIndentedString(deviceVersion)).append("\n");
    sb.append("    subsystemVendorId: ").append(toIndentedString(subsystemVendorId)).append("\n");
    sb.append("    subsystemId: ").append(toIndentedString(subsystemId)).append("\n");
    sb.append("    ioClass: ").append(toIndentedString(ioClass)).append("\n");
    sb.append("    ioSubclass: ").append(toIndentedString(ioSubclass)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
    sb.append("    sendMessageQueueDepth: ").append(toIndentedString(sendMessageQueueDepth)).append("\n");
    sb.append("    rdmaReadQueueDepth: ").append(toIndentedString(rdmaReadQueueDepth)).append("\n");
    sb.append("    sendMessageSize: ").append(toIndentedString(sendMessageSize)).append("\n");
    sb.append("    rdmaTransferSize: ").append(toIndentedString(rdmaTransferSize)).append("\n");
    sb.append("    controllerOpsCapabilityMask: ").append(toIndentedString(controllerOpsCapabilityMask)).append("\n");
    sb.append("    serviceEntries: ").append(toIndentedString(serviceEntries)).append("\n");
    sb.append("    idString: ").append(toIndentedString(idString)).append("\n");
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

