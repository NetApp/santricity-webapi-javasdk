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
 * SasAttachedDeviceTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SasAttachedDeviceTypeData   {
  

  /**
   * This enumeration specifies the different kinds of devices that may be attached to a SAS port.
   */
  public enum TypeEnum {
    unknown("unknown"),
    drive("drive"),
    expander("expander"),
    localController("localController"),
    alternateController("alternateController"),
    host("host"),
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

    private String drive;

    private String expander;

    private String remoteHostPortAddress;

    private String localController;

    private Location physicalLocation;

  
  /**
   * This enumeration specifies the different kinds of devices that may be attached to a SAS port.
   **/
  public SasAttachedDeviceTypeData type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration specifies the different kinds of devices that may be attached to a SAS port.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * A reference to the alternate controller that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_ALTERNATE_CONTROLLER.
   **/
  public SasAttachedDeviceTypeData alternateController(String alternateController) {
    this.alternateController = alternateController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the alternate controller that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_ALTERNATE_CONTROLLER.")
  @JsonProperty("alternateController")
  public String getAlternateController() {
    return alternateController;
  }
  
  public void setAlternateController(String alternateController) {
    this.alternateController = alternateController;
  }

  
  /**
   * A reference to a drive that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_DRIVE.
   **/
  public SasAttachedDeviceTypeData drive(String drive) {
    this.drive = drive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to a drive that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_DRIVE.")
  @JsonProperty("drive")
  public String getDrive() {
    return drive;
  }
  
  public void setDrive(String drive) {
    this.drive = drive;
  }

  
  /**
   * A reference to the SAS expander that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_EXPANDER.
   **/
  public SasAttachedDeviceTypeData expander(String expander) {
    this.expander = expander;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the SAS expander that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_EXPANDER.")
  @JsonProperty("expander")
  public String getExpander() {
    return expander;
  }
  
  public void setExpander(String expander) {
    this.expander = expander;
  }

  
  /**
   * The SAS address of the port in the host computer that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_HOST.
   **/
  public SasAttachedDeviceTypeData remoteHostPortAddress(String remoteHostPortAddress) {
    this.remoteHostPortAddress = remoteHostPortAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The SAS address of the port in the host computer that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_HOST.")
  @JsonProperty("remoteHostPortAddress")
  public String getRemoteHostPortAddress() {
    return remoteHostPortAddress;
  }
  
  public void setRemoteHostPortAddress(String remoteHostPortAddress) {
    this.remoteHostPortAddress = remoteHostPortAddress;
  }

  
  /**
   * A reference to the local controller that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_LOCAL_CONTROLLER.
   **/
  public SasAttachedDeviceTypeData localController(String localController) {
    this.localController = localController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the local controller that is the attached device. This field is only present if type equals SAS_ATTACHED_DEV_LOCAL_CONTROLLER.")
  @JsonProperty("localController")
  public String getLocalController() {
    return localController;
  }
  
  public void setLocalController(String localController) {
    this.localController = localController;
  }

  
  /**
   * The tray-slot location of a device of unknown type. This field is only present if type equals SAS_ATTACHED_DEV_UNKNOWN.
   **/
  public SasAttachedDeviceTypeData physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tray-slot location of a device of unknown type. This field is only present if type equals SAS_ATTACHED_DEV_UNKNOWN.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasAttachedDeviceTypeData sasAttachedDeviceTypeData = (SasAttachedDeviceTypeData) o;
    return Objects.equals(this.type, sasAttachedDeviceTypeData.type) &&
        Objects.equals(this.alternateController, sasAttachedDeviceTypeData.alternateController) &&
        Objects.equals(this.drive, sasAttachedDeviceTypeData.drive) &&
        Objects.equals(this.expander, sasAttachedDeviceTypeData.expander) &&
        Objects.equals(this.remoteHostPortAddress, sasAttachedDeviceTypeData.remoteHostPortAddress) &&
        Objects.equals(this.localController, sasAttachedDeviceTypeData.localController) &&
        Objects.equals(this.physicalLocation, sasAttachedDeviceTypeData.physicalLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, alternateController, drive, expander, remoteHostPortAddress, localController, physicalLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasAttachedDeviceTypeData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alternateController: ").append(toIndentedString(alternateController)).append("\n");
    sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
    sb.append("    expander: ").append(toIndentedString(expander)).append("\n");
    sb.append("    remoteHostPortAddress: ").append(toIndentedString(remoteHostPortAddress)).append("\n");
    sb.append("    localController: ").append(toIndentedString(localController)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
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

