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
 * ExtendedComponentLocation
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ExtendedComponentLocation   {
  

  /**
   * This enumeration object contains a list of all possible extended component location types that can be returned in a MEL entry.
   */
  public enum ExtLocTypeEnum {
    unknown("unknown"),
    tray("tray"),
    trayslot("trayslot"),
    minihub("minihub"),
    channel("channel"),
    volume("volume"),
    pit("pit"),
    controller("controller"),
    ref("ref"),
    label("label"),
    volumeGrp("volumeGrp"),
    diskPool("diskPool"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ExtLocTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ExtLocTypeEnum extLocType;

    private ChannelLocation compChannelLoc;

    private MinihubLocation compMinihubLoc;

    private Integer compTray;

    private TraySlot compTraySlot;

    private String compLabel;

    private Long pitSequence;

    private String compReference;

    private String controllerReference;

    private String locationLabel;

    private String volumeGroupLabel;

    private String diskPoolLabel;

  
  /**
   * This enumeration object contains a list of all possible extended component location types that can be returned in a MEL entry.
   **/
  public ExtendedComponentLocation extLocType(ExtLocTypeEnum extLocType) {
    this.extLocType = extLocType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object contains a list of all possible extended component location types that can be returned in a MEL entry.")
  @JsonProperty("extLocType")
  public ExtLocTypeEnum getExtLocType() {
    return extLocType;
  }
  
  public void setExtLocType(ExtLocTypeEnum extLocType) {
    this.extLocType = extLocType;
  }

  
  /**
   * This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_CHANNEL. This field is deprecated.
   **/
  public ExtendedComponentLocation compChannelLoc(ChannelLocation compChannelLoc) {
    this.compChannelLoc = compChannelLoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_CHANNEL. This field is deprecated.")
  @JsonProperty("compChannelLoc")
  public ChannelLocation getCompChannelLoc() {
    return compChannelLoc;
  }
  
  public void setCompChannelLoc(ChannelLocation compChannelLoc) {
    this.compChannelLoc = compChannelLoc;
  }

  
  /**
   * This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_MINIHUB. This field is deprecated.
   **/
  public ExtendedComponentLocation compMinihubLoc(MinihubLocation compMinihubLoc) {
    this.compMinihubLoc = compMinihubLoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_MINIHUB. This field is deprecated.")
  @JsonProperty("compMinihubLoc")
  public MinihubLocation getCompMinihubLoc() {
    return compMinihubLoc;
  }
  
  public void setCompMinihubLoc(MinihubLocation compMinihubLoc) {
    this.compMinihubLoc = compMinihubLoc;
  }

  
  /**
   * This field is present only if the extLocType value is EXT_COMP_LOCTYPE_TRAY
   **/
  public ExtendedComponentLocation compTray(Integer compTray) {
    this.compTray = compTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the extLocType value is EXT_COMP_LOCTYPE_TRAY")
  @JsonProperty("compTray")
  public Integer getCompTray() {
    return compTray;
  }
  
  public void setCompTray(Integer compTray) {
    this.compTray = compTray;
  }

  
  /**
   * This field is present only if the extLocType value is EXT_COMP_LOCTYPE_TRAYSLOT
   **/
  public ExtendedComponentLocation compTraySlot(TraySlot compTraySlot) {
    this.compTraySlot = compTraySlot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the extLocType value is EXT_COMP_LOCTYPE_TRAYSLOT")
  @JsonProperty("compTraySlot")
  public TraySlot getCompTraySlot() {
    return compTraySlot;
  }
  
  public void setCompTraySlot(TraySlot compTraySlot) {
    this.compTraySlot = compTraySlot;
  }

  
  /**
   * This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_VOLUME. This field is deprecated.
   **/
  public ExtendedComponentLocation compLabel(String compLabel) {
    this.compLabel = compLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_VOLUME. This field is deprecated.")
  @JsonProperty("compLabel")
  public String getCompLabel() {
    return compLabel;
  }
  
  public void setCompLabel(String compLabel) {
    this.compLabel = compLabel;
  }

  
  /**
   * This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_PIT.
   **/
  public ExtendedComponentLocation pitSequence(Long pitSequence) {
    this.pitSequence = pitSequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_PIT.")
  @JsonProperty("pitSequence")
  public Long getPitSequence() {
    return pitSequence;
  }
  
  public void setPitSequence(Long pitSequence) {
    this.pitSequence = pitSequence;
  }

  
  /**
   * SYMbolRef of the component or channelPort
   **/
  public ExtendedComponentLocation compReference(String compReference) {
    this.compReference = compReference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SYMbolRef of the component or channelPort")
  @JsonProperty("compReference")
  public String getCompReference() {
    return compReference;
  }
  
  public void setCompReference(String compReference) {
    this.compReference = compReference;
  }

  
  /**
   * Controller Reference
   **/
  public ExtendedComponentLocation controllerReference(String controllerReference) {
    this.controllerReference = controllerReference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Controller Reference")
  @JsonProperty("controllerReference")
  public String getControllerReference() {
    return controllerReference;
  }
  
  public void setControllerReference(String controllerReference) {
    this.controllerReference = controllerReference;
  }

  
  /**
   * Label associated with the physical location of the component or port.
   **/
  public ExtendedComponentLocation locationLabel(String locationLabel) {
    this.locationLabel = locationLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Label associated with the physical location of the component or port.")
  @JsonProperty("locationLabel")
  public String getLocationLabel() {
    return locationLabel;
  }
  
  public void setLocationLabel(String locationLabel) {
    this.locationLabel = locationLabel;
  }

  
  /**
   * This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_VOLUME_GRP.
   **/
  public ExtendedComponentLocation volumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_VOLUME_GRP.")
  @JsonProperty("volumeGroupLabel")
  public String getVolumeGroupLabel() {
    return volumeGroupLabel;
  }
  
  public void setVolumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
  }

  
  /**
   * This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_DISK_POOL.
   **/
  public ExtendedComponentLocation diskPoolLabel(String diskPoolLabel) {
    this.diskPoolLabel = diskPoolLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the ExtendedComponentLocationType value is EXT_COMP_LOCTYPE_DISK_POOL.")
  @JsonProperty("diskPoolLabel")
  public String getDiskPoolLabel() {
    return diskPoolLabel;
  }
  
  public void setDiskPoolLabel(String diskPoolLabel) {
    this.diskPoolLabel = diskPoolLabel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedComponentLocation extendedComponentLocation = (ExtendedComponentLocation) o;
    return Objects.equals(this.extLocType, extendedComponentLocation.extLocType) &&
        Objects.equals(this.compChannelLoc, extendedComponentLocation.compChannelLoc) &&
        Objects.equals(this.compMinihubLoc, extendedComponentLocation.compMinihubLoc) &&
        Objects.equals(this.compTray, extendedComponentLocation.compTray) &&
        Objects.equals(this.compTraySlot, extendedComponentLocation.compTraySlot) &&
        Objects.equals(this.compLabel, extendedComponentLocation.compLabel) &&
        Objects.equals(this.pitSequence, extendedComponentLocation.pitSequence) &&
        Objects.equals(this.compReference, extendedComponentLocation.compReference) &&
        Objects.equals(this.controllerReference, extendedComponentLocation.controllerReference) &&
        Objects.equals(this.locationLabel, extendedComponentLocation.locationLabel) &&
        Objects.equals(this.volumeGroupLabel, extendedComponentLocation.volumeGroupLabel) &&
        Objects.equals(this.diskPoolLabel, extendedComponentLocation.diskPoolLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extLocType, compChannelLoc, compMinihubLoc, compTray, compTraySlot, compLabel, pitSequence, compReference, controllerReference, locationLabel, volumeGroupLabel, diskPoolLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedComponentLocation {\n");
    
    sb.append("    extLocType: ").append(toIndentedString(extLocType)).append("\n");
    sb.append("    compChannelLoc: ").append(toIndentedString(compChannelLoc)).append("\n");
    sb.append("    compMinihubLoc: ").append(toIndentedString(compMinihubLoc)).append("\n");
    sb.append("    compTray: ").append(toIndentedString(compTray)).append("\n");
    sb.append("    compTraySlot: ").append(toIndentedString(compTraySlot)).append("\n");
    sb.append("    compLabel: ").append(toIndentedString(compLabel)).append("\n");
    sb.append("    pitSequence: ").append(toIndentedString(pitSequence)).append("\n");
    sb.append("    compReference: ").append(toIndentedString(compReference)).append("\n");
    sb.append("    controllerReference: ").append(toIndentedString(controllerReference)).append("\n");
    sb.append("    locationLabel: ").append(toIndentedString(locationLabel)).append("\n");
    sb.append("    volumeGroupLabel: ").append(toIndentedString(volumeGroupLabel)).append("\n");
    sb.append("    diskPoolLabel: ").append(toIndentedString(diskPoolLabel)).append("\n");
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

