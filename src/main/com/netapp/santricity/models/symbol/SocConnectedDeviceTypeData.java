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
 * SocConnectedDeviceTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SocConnectedDeviceTypeData   {
  

  /**
   * This enumeration object is used to identify the type of device attached to a SOC port.
   */
  public enum TypeEnum {
    controllerLocal("controllerLocal"),
    controllerAlternate("controllerAlternate"),
    drive("drive"),
    esm("esm"),
    sfp("sfp"),
    unknownDevice("unknownDevice"),
    drawer("drawer"),
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

    private String alternateController;

    private String localController;

    private String drive;

    private String esm;

    private String sfp;

    private Location physicalLocation;

    private String drawer;

  
  /**
   * This enumeration object is used to identify the type of device attached to a SOC port.
   **/
  public SocConnectedDeviceTypeData type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to identify the type of device attached to a SOC port.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * This field identifies the alternate controller. It is present only if type is equal to SOC_PORT_CONTROLLER_ALTERNATE.
   **/
  public SocConnectedDeviceTypeData alternateController(String alternateController) {
    this.alternateController = alternateController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field identifies the alternate controller. It is present only if type is equal to SOC_PORT_CONTROLLER_ALTERNATE.")
  @JsonProperty("alternateController")
  public String getAlternateController() {
    return alternateController;
  }
  
  public void setAlternateController(String alternateController) {
    this.alternateController = alternateController;
  }

  
  /**
   * This field identifies the local controller. It is present only if type is equal to SOC_PORT_CONTROLLER_LOCAL.
   **/
  public SocConnectedDeviceTypeData localController(String localController) {
    this.localController = localController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field identifies the local controller. It is present only if type is equal to SOC_PORT_CONTROLLER_LOCAL.")
  @JsonProperty("localController")
  public String getLocalController() {
    return localController;
  }
  
  public void setLocalController(String localController) {
    this.localController = localController;
  }

  
  /**
   * This field identifies a drive. It is present only if type is equal to SOC_PORT_DRIVE.
   **/
  public SocConnectedDeviceTypeData drive(String drive) {
    this.drive = drive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field identifies a drive. It is present only if type is equal to SOC_PORT_DRIVE.")
  @JsonProperty("drive")
  public String getDrive() {
    return drive;
  }
  
  public void setDrive(String drive) {
    this.drive = drive;
  }

  
  /**
   * This field identifies an ESM. It is only present if type is equal to SOC_PORT_ESM.
   **/
  public SocConnectedDeviceTypeData esm(String esm) {
    this.esm = esm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field identifies an ESM. It is only present if type is equal to SOC_PORT_ESM.")
  @JsonProperty("esm")
  public String getEsm() {
    return esm;
  }
  
  public void setEsm(String esm) {
    this.esm = esm;
  }

  
  /**
   * This field identifies an SFP. It is only present if type is equal to SOC_PORT_SFP.
   **/
  public SocConnectedDeviceTypeData sfp(String sfp) {
    this.sfp = sfp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field identifies an SFP. It is only present if type is equal to SOC_PORT_SFP.")
  @JsonProperty("sfp")
  public String getSfp() {
    return sfp;
  }
  
  public void setSfp(String sfp) {
    this.sfp = sfp;
  }

  
  /**
   * This field identifies the location of an unknown device. It is only present if the type is set to SOC_PORT_UNKNOWN_DEVICE.
   **/
  public SocConnectedDeviceTypeData physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field identifies the location of an unknown device. It is only present if the type is set to SOC_PORT_UNKNOWN_DEVICE.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * This field identifies the location of the drawer. It is only present if the type is set to SOC_PORT_DRAWER.
   **/
  public SocConnectedDeviceTypeData drawer(String drawer) {
    this.drawer = drawer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field identifies the location of the drawer. It is only present if the type is set to SOC_PORT_DRAWER.")
  @JsonProperty("drawer")
  public String getDrawer() {
    return drawer;
  }
  
  public void setDrawer(String drawer) {
    this.drawer = drawer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocConnectedDeviceTypeData socConnectedDeviceTypeData = (SocConnectedDeviceTypeData) o;
    return Objects.equals(this.type, socConnectedDeviceTypeData.type) &&
        Objects.equals(this.alternateController, socConnectedDeviceTypeData.alternateController) &&
        Objects.equals(this.localController, socConnectedDeviceTypeData.localController) &&
        Objects.equals(this.drive, socConnectedDeviceTypeData.drive) &&
        Objects.equals(this.esm, socConnectedDeviceTypeData.esm) &&
        Objects.equals(this.sfp, socConnectedDeviceTypeData.sfp) &&
        Objects.equals(this.physicalLocation, socConnectedDeviceTypeData.physicalLocation) &&
        Objects.equals(this.drawer, socConnectedDeviceTypeData.drawer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, alternateController, localController, drive, esm, sfp, physicalLocation, drawer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocConnectedDeviceTypeData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alternateController: ").append(toIndentedString(alternateController)).append("\n");
    sb.append("    localController: ").append(toIndentedString(localController)).append("\n");
    sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
    sb.append("    esm: ").append(toIndentedString(esm)).append("\n");
    sb.append("    sfp: ").append(toIndentedString(sfp)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    drawer: ").append(toIndentedString(drawer)).append("\n");
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

