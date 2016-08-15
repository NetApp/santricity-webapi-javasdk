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
 * ChannelPortParent
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ChannelPortParent   {
  

  /**
   * This enumeration object is used to specify the type of channel port parent.
   */
  public enum TypeEnum {
    unknown("unknown"),
    esm("esm"),
    minihub("minihub"),
    controller("controller"),
    hic("hic"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TypeEnum type;

    private String controllerRef;

    private String esmRef;

    private String minihubRef;

    private String hicRef;

  
  /**
   * This enumeration object is used to specify the type of channel port parent.
   **/
  public ChannelPortParent type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to specify the type of channel port parent.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * This field is present only if the type field is equal to CHANNEL_PORT_PARENT_CONTROLLER.
   **/
  public ChannelPortParent controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type field is equal to CHANNEL_PORT_PARENT_CONTROLLER.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * This field is present only if the type field is equal to CHANNEL_PORT_PARENT_ESM.
   **/
  public ChannelPortParent esmRef(String esmRef) {
    this.esmRef = esmRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type field is equal to CHANNEL_PORT_PARENT_ESM.")
  @JsonProperty("esmRef")
  public String getEsmRef() {
    return esmRef;
  }
  
  public void setEsmRef(String esmRef) {
    this.esmRef = esmRef;
  }

  
  /**
   * This field is present only if the type field is equal to CHANNEL_PORT_PARENT_MINIHUB.
   **/
  public ChannelPortParent minihubRef(String minihubRef) {
    this.minihubRef = minihubRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type field is equal to CHANNEL_PORT_PARENT_MINIHUB.")
  @JsonProperty("minihubRef")
  public String getMinihubRef() {
    return minihubRef;
  }
  
  public void setMinihubRef(String minihubRef) {
    this.minihubRef = minihubRef;
  }

  
  /**
   * This field is present only if the type field is equal to CHANNEL_PORT_PARENT_HIC.
   **/
  public ChannelPortParent hicRef(String hicRef) {
    this.hicRef = hicRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type field is equal to CHANNEL_PORT_PARENT_HIC.")
  @JsonProperty("hicRef")
  public String getHicRef() {
    return hicRef;
  }
  
  public void setHicRef(String hicRef) {
    this.hicRef = hicRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelPortParent channelPortParent = (ChannelPortParent) o;
    return Objects.equals(this.type, channelPortParent.type) &&
        Objects.equals(this.controllerRef, channelPortParent.controllerRef) &&
        Objects.equals(this.esmRef, channelPortParent.esmRef) &&
        Objects.equals(this.minihubRef, channelPortParent.minihubRef) &&
        Objects.equals(this.hicRef, channelPortParent.hicRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, controllerRef, esmRef, minihubRef, hicRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelPortParent {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    esmRef: ").append(toIndentedString(esmRef)).append("\n");
    sb.append("    minihubRef: ").append(toIndentedString(minihubRef)).append("\n");
    sb.append("    hicRef: ").append(toIndentedString(hicRef)).append("\n");
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

