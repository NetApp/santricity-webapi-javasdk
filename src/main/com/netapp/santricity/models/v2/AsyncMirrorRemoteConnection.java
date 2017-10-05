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
 * AsyncMirrorRemoteConnection
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AsyncMirrorRemoteConnection   {
  
    private String localPortName;

    private String remotePortName;

    private String remotePortId;

    private String localPortId;

    private Integer localPortNumber;

    private Integer remotePortNumber;

    private String controller;


  /**
   * Gets or Sets ioInterfaceType
   */
  public enum IoInterfaceTypeEnum {
    notImplemented("notImplemented"),
    scsi("scsi"),
    fc("fc"),
    sata("sata"),
    sas("sas"),
    iscsi("iscsi"),
    ib("ib"),
    fcoe("fcoe"),
    nvmeof("nvmeof"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    IoInterfaceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private IoInterfaceTypeEnum ioInterfaceType;

    private IscsiRemoteTargetConnections iscsiConnectionDetail;

    private FibreRemoteTargetConnections fibreConnectionDetail;

    private ScsiRemoteTargetConnections remoteTargetConnections;

    private String localPortRef;

  
  /**
   * The unique WWN of the local port. Only valid if the interface type is fc.
   **/
  public AsyncMirrorRemoteConnection localPortName(String localPortName) {
    this.localPortName = localPortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique WWN of the local port. Only valid if the interface type is fc.")
  @JsonProperty("localPortName")
  public String getLocalPortName() {
    return localPortName;
  }
  
  public void setLocalPortName(String localPortName) {
    this.localPortName = localPortName;
  }

  
  /**
   * The unique WWN of the remote port. Only valid if the interface type is fc.
   **/
  public AsyncMirrorRemoteConnection remotePortName(String remotePortName) {
    this.remotePortName = remotePortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique WWN of the remote port. Only valid if the interface type is fc.")
  @JsonProperty("remotePortName")
  public String getRemotePortName() {
    return remotePortName;
  }
  
  public void setRemotePortName(String remotePortName) {
    this.remotePortName = remotePortName;
  }

  
  /**
   * The switch port identifier for the remote port. Only valid if the interface type is fc.
   **/
  public AsyncMirrorRemoteConnection remotePortId(String remotePortId) {
    this.remotePortId = remotePortId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The switch port identifier for the remote port. Only valid if the interface type is fc.")
  @JsonProperty("remotePortId")
  public String getRemotePortId() {
    return remotePortId;
  }
  
  public void setRemotePortId(String remotePortId) {
    this.remotePortId = remotePortId;
  }

  
  /**
   * The switch port identifier for the local port. Only valid if the interface type is fc.
   **/
  public AsyncMirrorRemoteConnection localPortId(String localPortId) {
    this.localPortId = localPortId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The switch port identifier for the local port. Only valid if the interface type is fc.")
  @JsonProperty("localPortId")
  public String getLocalPortId() {
    return localPortId;
  }
  
  public void setLocalPortId(String localPortId) {
    this.localPortId = localPortId;
  }

  
  /**
   **/
  public AsyncMirrorRemoteConnection localPortNumber(Integer localPortNumber) {
    this.localPortNumber = localPortNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("localPortNumber")
  public Integer getLocalPortNumber() {
    return localPortNumber;
  }
  
  public void setLocalPortNumber(Integer localPortNumber) {
    this.localPortNumber = localPortNumber;
  }

  
  /**
   **/
  public AsyncMirrorRemoteConnection remotePortNumber(Integer remotePortNumber) {
    this.remotePortNumber = remotePortNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remotePortNumber")
  public Integer getRemotePortNumber() {
    return remotePortNumber;
  }
  
  public void setRemotePortNumber(Integer remotePortNumber) {
    this.remotePortNumber = remotePortNumber;
  }

  
  /**
   **/
  public AsyncMirrorRemoteConnection controller(String controller) {
    this.controller = controller;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("controller")
  public String getController() {
    return controller;
  }
  
  public void setController(String controller) {
    this.controller = controller;
  }

  
  /**
   **/
  public AsyncMirrorRemoteConnection ioInterfaceType(IoInterfaceTypeEnum ioInterfaceType) {
    this.ioInterfaceType = ioInterfaceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ioInterfaceType")
  public IoInterfaceTypeEnum getIoInterfaceType() {
    return ioInterfaceType;
  }
  
  public void setIoInterfaceType(IoInterfaceTypeEnum ioInterfaceType) {
    this.ioInterfaceType = ioInterfaceType;
  }

  
  /**
   **/
  public AsyncMirrorRemoteConnection iscsiConnectionDetail(IscsiRemoteTargetConnections iscsiConnectionDetail) {
    this.iscsiConnectionDetail = iscsiConnectionDetail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("iscsiConnectionDetail")
  public IscsiRemoteTargetConnections getIscsiConnectionDetail() {
    return iscsiConnectionDetail;
  }
  
  public void setIscsiConnectionDetail(IscsiRemoteTargetConnections iscsiConnectionDetail) {
    this.iscsiConnectionDetail = iscsiConnectionDetail;
  }

  
  /**
   **/
  public AsyncMirrorRemoteConnection fibreConnectionDetail(FibreRemoteTargetConnections fibreConnectionDetail) {
    this.fibreConnectionDetail = fibreConnectionDetail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fibreConnectionDetail")
  public FibreRemoteTargetConnections getFibreConnectionDetail() {
    return fibreConnectionDetail;
  }
  
  public void setFibreConnectionDetail(FibreRemoteTargetConnections fibreConnectionDetail) {
    this.fibreConnectionDetail = fibreConnectionDetail;
  }

  
  /**
   **/
  public AsyncMirrorRemoteConnection remoteTargetConnections(ScsiRemoteTargetConnections remoteTargetConnections) {
    this.remoteTargetConnections = remoteTargetConnections;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remoteTargetConnections")
  public ScsiRemoteTargetConnections getRemoteTargetConnections() {
    return remoteTargetConnections;
  }
  
  public void setRemoteTargetConnections(ScsiRemoteTargetConnections remoteTargetConnections) {
    this.remoteTargetConnections = remoteTargetConnections;
  }

  
  /**
   * Local initiator port for these connections.
   **/
  public AsyncMirrorRemoteConnection localPortRef(String localPortRef) {
    this.localPortRef = localPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Local initiator port for these connections.")
  @JsonProperty("localPortRef")
  public String getLocalPortRef() {
    return localPortRef;
  }
  
  public void setLocalPortRef(String localPortRef) {
    this.localPortRef = localPortRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorRemoteConnection asyncMirrorRemoteConnection = (AsyncMirrorRemoteConnection) o;
    return Objects.equals(this.localPortName, asyncMirrorRemoteConnection.localPortName) &&
        Objects.equals(this.remotePortName, asyncMirrorRemoteConnection.remotePortName) &&
        Objects.equals(this.remotePortId, asyncMirrorRemoteConnection.remotePortId) &&
        Objects.equals(this.localPortId, asyncMirrorRemoteConnection.localPortId) &&
        Objects.equals(this.localPortNumber, asyncMirrorRemoteConnection.localPortNumber) &&
        Objects.equals(this.remotePortNumber, asyncMirrorRemoteConnection.remotePortNumber) &&
        Objects.equals(this.controller, asyncMirrorRemoteConnection.controller) &&
        Objects.equals(this.ioInterfaceType, asyncMirrorRemoteConnection.ioInterfaceType) &&
        Objects.equals(this.iscsiConnectionDetail, asyncMirrorRemoteConnection.iscsiConnectionDetail) &&
        Objects.equals(this.fibreConnectionDetail, asyncMirrorRemoteConnection.fibreConnectionDetail) &&
        Objects.equals(this.remoteTargetConnections, asyncMirrorRemoteConnection.remoteTargetConnections) &&
        Objects.equals(this.localPortRef, asyncMirrorRemoteConnection.localPortRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localPortName, remotePortName, remotePortId, localPortId, localPortNumber, remotePortNumber, controller, ioInterfaceType, iscsiConnectionDetail, fibreConnectionDetail, remoteTargetConnections, localPortRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorRemoteConnection {\n");
    
    sb.append("    localPortName: ").append(toIndentedString(localPortName)).append("\n");
    sb.append("    remotePortName: ").append(toIndentedString(remotePortName)).append("\n");
    sb.append("    remotePortId: ").append(toIndentedString(remotePortId)).append("\n");
    sb.append("    localPortId: ").append(toIndentedString(localPortId)).append("\n");
    sb.append("    localPortNumber: ").append(toIndentedString(localPortNumber)).append("\n");
    sb.append("    remotePortNumber: ").append(toIndentedString(remotePortNumber)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    ioInterfaceType: ").append(toIndentedString(ioInterfaceType)).append("\n");
    sb.append("    iscsiConnectionDetail: ").append(toIndentedString(iscsiConnectionDetail)).append("\n");
    sb.append("    fibreConnectionDetail: ").append(toIndentedString(fibreConnectionDetail)).append("\n");
    sb.append("    remoteTargetConnections: ").append(toIndentedString(remoteTargetConnections)).append("\n");
    sb.append("    localPortRef: ").append(toIndentedString(localPortRef)).append("\n");
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

