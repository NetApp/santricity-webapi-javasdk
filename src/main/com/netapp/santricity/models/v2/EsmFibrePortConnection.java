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
 * Represents a Fibre connection between a Tray/Esm and another storageDevice component
 */
@ApiModel(description = "Represents a Fibre connection between a Tray/Esm and another storageDevice component")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class EsmFibrePortConnection   {
  
    private Tray tray;

    private Esm esm;

    private ChannelPort channelPort;

    private Controller attachedController;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    sas("sas"),
    fibre("fibre");
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

  
  /**
   * The tray that the connection originates from
   **/
  public EsmFibrePortConnection tray(Tray tray) {
    this.tray = tray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tray that the connection originates from")
  @JsonProperty("tray")
  public Tray getTray() {
    return tray;
  }
  
  public void setTray(Tray tray) {
    this.tray = tray;
  }

  
  /**
   * The esm that the connection originates from
   **/
  public EsmFibrePortConnection esm(Esm esm) {
    this.esm = esm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The esm that the connection originates from")
  @JsonProperty("esm")
  public Esm getEsm() {
    return esm;
  }
  
  public void setEsm(Esm esm) {
    this.esm = esm;
  }

  
  /**
   * The port that the Esm is connected to.
   **/
  public EsmFibrePortConnection channelPort(ChannelPort channelPort) {
    this.channelPort = channelPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The port that the Esm is connected to.")
  @JsonProperty("channelPort")
  public ChannelPort getChannelPort() {
    return channelPort;
  }
  
  public void setChannelPort(ChannelPort channelPort) {
    this.channelPort = channelPort;
  }

  
  /**
   * The controller (if applicable) that the Esm is connected to
   **/
  public EsmFibrePortConnection attachedController(Controller attachedController) {
    this.attachedController = attachedController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The controller (if applicable) that the Esm is connected to")
  @JsonProperty("attachedController")
  public Controller getAttachedController() {
    return attachedController;
  }
  
  public void setAttachedController(Controller attachedController) {
    this.attachedController = attachedController;
  }

  
  /**
   **/
  public EsmFibrePortConnection type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsmFibrePortConnection esmFibrePortConnection = (EsmFibrePortConnection) o;
    return Objects.equals(this.tray, esmFibrePortConnection.tray) &&
        Objects.equals(this.esm, esmFibrePortConnection.esm) &&
        Objects.equals(this.channelPort, esmFibrePortConnection.channelPort) &&
        Objects.equals(this.attachedController, esmFibrePortConnection.attachedController) &&
        Objects.equals(this.type, esmFibrePortConnection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tray, esm, channelPort, attachedController, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsmFibrePortConnection {\n");
    
    sb.append("    tray: ").append(toIndentedString(tray)).append("\n");
    sb.append("    esm: ").append(toIndentedString(esm)).append("\n");
    sb.append("    channelPort: ").append(toIndentedString(channelPort)).append("\n");
    sb.append("    attachedController: ").append(toIndentedString(attachedController)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

