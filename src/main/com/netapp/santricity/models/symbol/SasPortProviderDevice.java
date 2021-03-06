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
 * SasPortProviderDevice
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SasPortProviderDevice   {
  

  /**
   * This enumeration object is used to identify the specific type of \"port provider\" device.
   */
  public enum TypeEnum {
    controller("controller"),
    drive("drive"),
    expander("expander"),
    hostboard("hostboard"),
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

    private String controller;

    private String drive;

    private String expander;

    private String hostBoardRef;

  
  /**
   * This enumeration object is used to identify the specific type of \"port provider\" device.
   **/
  public SasPortProviderDevice type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to identify the specific type of \"port provider\" device.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * A reference to a controller that is the port provider. This field is present only if the type field is equal to SAS_PORT_PROVIDER_CONTROLLER.
   **/
  public SasPortProviderDevice controller(String controller) {
    this.controller = controller;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to a controller that is the port provider. This field is present only if the type field is equal to SAS_PORT_PROVIDER_CONTROLLER.")
  @JsonProperty("controller")
  public String getController() {
    return controller;
  }
  
  public void setController(String controller) {
    this.controller = controller;
  }

  
  /**
   * A reference to a drive that is the port provider. This field is present only if the type field is equal to SAS_PORT_PROVIDER_DRIVE.
   **/
  public SasPortProviderDevice drive(String drive) {
    this.drive = drive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to a drive that is the port provider. This field is present only if the type field is equal to SAS_PORT_PROVIDER_DRIVE.")
  @JsonProperty("drive")
  public String getDrive() {
    return drive;
  }
  
  public void setDrive(String drive) {
    this.drive = drive;
  }

  
  /**
   * A reference to a SAS expander that is the port provider. This field is present only if the type field is equal to SAS_PORT_PROVIDER_EXPANDER.
   **/
  public SasPortProviderDevice expander(String expander) {
    this.expander = expander;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to a SAS expander that is the port provider. This field is present only if the type field is equal to SAS_PORT_PROVIDER_EXPANDER.")
  @JsonProperty("expander")
  public String getExpander() {
    return expander;
  }
  
  public void setExpander(String expander) {
    this.expander = expander;
  }

  
  /**
   * A reference to a SAS host board that is the port provider. This field is present only if the type field is equal to SAS_PORT_PROVIDER_HOSTBOARD.
   **/
  public SasPortProviderDevice hostBoardRef(String hostBoardRef) {
    this.hostBoardRef = hostBoardRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to a SAS host board that is the port provider. This field is present only if the type field is equal to SAS_PORT_PROVIDER_HOSTBOARD.")
  @JsonProperty("hostBoardRef")
  public String getHostBoardRef() {
    return hostBoardRef;
  }
  
  public void setHostBoardRef(String hostBoardRef) {
    this.hostBoardRef = hostBoardRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasPortProviderDevice sasPortProviderDevice = (SasPortProviderDevice) o;
    return Objects.equals(this.type, sasPortProviderDevice.type) &&
        Objects.equals(this.controller, sasPortProviderDevice.controller) &&
        Objects.equals(this.drive, sasPortProviderDevice.drive) &&
        Objects.equals(this.expander, sasPortProviderDevice.expander) &&
        Objects.equals(this.hostBoardRef, sasPortProviderDevice.hostBoardRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, controller, drive, expander, hostBoardRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasPortProviderDevice {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
    sb.append("    expander: ").append(toIndentedString(expander)).append("\n");
    sb.append("    hostBoardRef: ").append(toIndentedString(hostBoardRef)).append("\n");
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

