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
 * ControllerSFP
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ControllerSFP   {
  

  /**
   * The interface (host/drive) to which the SFP belongs.
   */
  public enum ControllerSFPTypeEnum {
    hostside("hostside"),
    driveside("driveside"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ControllerSFPTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ControllerSFPTypeEnum controllerSFPType;

    private String parentController;

    private Integer channel;

    private String reserved1;

    private String reserved2;

  
  /**
   * The interface (host/drive) to which the SFP belongs.
   **/
  public ControllerSFP controllerSFPType(ControllerSFPTypeEnum controllerSFPType) {
    this.controllerSFPType = controllerSFPType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The interface (host/drive) to which the SFP belongs.")
  @JsonProperty("controllerSFPType")
  public ControllerSFPTypeEnum getControllerSFPType() {
    return controllerSFPType;
  }
  
  public void setControllerSFPType(ControllerSFPTypeEnum controllerSFPType) {
    this.controllerSFPType = controllerSFPType;
  }

  
  /**
   * The controller to which the SFP belongs.
   **/
  public ControllerSFP parentController(String parentController) {
    this.parentController = parentController;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller to which the SFP belongs.")
  @JsonProperty("parentController")
  public String getParentController() {
    return parentController;
  }
  
  public void setParentController(String parentController) {
    this.parentController = parentController;
  }

  
  /**
   * The channel the SFP is associated with.
   **/
  public ControllerSFP channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel the SFP is associated with.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   **/
  public ControllerSFP reserved1(String reserved1) {
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
  public ControllerSFP reserved2(String reserved2) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerSFP controllerSFP = (ControllerSFP) o;
    return Objects.equals(this.controllerSFPType, controllerSFP.controllerSFPType) &&
        Objects.equals(this.parentController, controllerSFP.parentController) &&
        Objects.equals(this.channel, controllerSFP.channel) &&
        Objects.equals(this.reserved1, controllerSFP.reserved1) &&
        Objects.equals(this.reserved2, controllerSFP.reserved2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerSFPType, parentController, channel, reserved1, reserved2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerSFP {\n");
    
    sb.append("    controllerSFPType: ").append(toIndentedString(controllerSFPType)).append("\n");
    sb.append("    parentController: ").append(toIndentedString(parentController)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
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

