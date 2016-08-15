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
 * IoInterface
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IoInterface   {
  
    private String interfaceRef;


  /**
   * The type of channel (e.g., host-side, drive-side) that the interface is associated with.
   */
  public enum ChannelTypeEnum {
    hostside("hostside"),
    driveside("driveside"),
    management("management"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ChannelTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ChannelTypeEnum channelType;

    private IOInterfaceTypeData ioInterfaceTypeData;

    private String controllerRef;

  
  /**
   * The SYMbol array-wide unique name for the interface object.
   **/
  public IoInterface interfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SYMbol array-wide unique name for the interface object.")
  @JsonProperty("interfaceRef")
  public String getInterfaceRef() {
    return interfaceRef;
  }
  
  public void setInterfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
  }

  
  /**
   * The type of channel (e.g., host-side, drive-side) that the interface is associated with.
   **/
  public IoInterface channelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of channel (e.g., host-side, drive-side) that the interface is associated with.")
  @JsonProperty("channelType")
  public ChannelTypeEnum getChannelType() {
    return channelType;
  }
  
  public void setChannelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
  }

  
  /**
   * A field whose contents vary depending on the I/O protocol type of the interface.
   **/
  public IoInterface ioInterfaceTypeData(IOInterfaceTypeData ioInterfaceTypeData) {
    this.ioInterfaceTypeData = ioInterfaceTypeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A field whose contents vary depending on the I/O protocol type of the interface.")
  @JsonProperty("ioInterfaceTypeData")
  public IOInterfaceTypeData getIoInterfaceTypeData() {
    return ioInterfaceTypeData;
  }
  
  public void setIoInterfaceTypeData(IOInterfaceTypeData ioInterfaceTypeData) {
    this.ioInterfaceTypeData = ioInterfaceTypeData;
  }

  
  /**
   * Uniquely identifies a particular physical RAID controller within the storage array.
   **/
  public IoInterface controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Uniquely identifies a particular physical RAID controller within the storage array.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoInterface ioInterface = (IoInterface) o;
    return Objects.equals(this.interfaceRef, ioInterface.interfaceRef) &&
        Objects.equals(this.channelType, ioInterface.channelType) &&
        Objects.equals(this.ioInterfaceTypeData, ioInterface.ioInterfaceTypeData) &&
        Objects.equals(this.controllerRef, ioInterface.controllerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceRef, channelType, ioInterfaceTypeData, controllerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoInterface {\n");
    
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    ioInterfaceTypeData: ").append(toIndentedString(ioInterfaceTypeData)).append("\n");
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
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

