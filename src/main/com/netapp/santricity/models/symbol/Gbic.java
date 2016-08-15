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
 * Gbic
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class Gbic   {
  
    private String gbicRef;


  /**
   * The operational status of the GBIC.
   */
  public enum StatusEnum {
    optimal("optimal"),
    failed("failed"),
    removed("removed"),
    unknown("unknown"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;

    private Location physicalLocation;


  /**
   * This field is the discriminator value, which identifies the type of GBIC.
   */
  public enum GbicTypeEnum {
    notPresent("notPresent"),
    cs12Active("cs12Active"),
    cs12Passive("cs12Passive"),
    opticalLw("opticalLw"),
    serialModule("serialModule"),
    opticalSw("opticalSw"),
    opticalLwLxSingleMode("opticalLwLxSingleMode"),
    opticalSwSx("opticalSwSx"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    GbicTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private GbicTypeEnum gbicType;


  /**
   * This field provides information about the port that the GBIC is associated with.
   */
  public enum GbicPortEnum {
    port1("port1"),
    port2("port2"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    GbicPortEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private GbicPortEnum gbicPort;

    private GBICParentTypeData parentData;

    private String reserved1;

    private String reserved2;

  
  /**
   * The reference for this physical GBIC.
   **/
  public Gbic gbicRef(String gbicRef) {
    this.gbicRef = gbicRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for this physical GBIC.")
  @JsonProperty("gbicRef")
  public String getGbicRef() {
    return gbicRef;
  }
  
  public void setGbicRef(String gbicRef) {
    this.gbicRef = gbicRef;
  }

  
  /**
   * The operational status of the GBIC.
   **/
  public Gbic status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status of the GBIC.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The physical location of the GBIC. Note that the tray reference identifies the enclosure containing the GBIC, but the slot information does not apply to this component.
   **/
  public Gbic physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the GBIC. Note that the tray reference identifies the enclosure containing the GBIC, but the slot information does not apply to this component.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * This field is the discriminator value, which identifies the type of GBIC.
   **/
  public Gbic gbicType(GbicTypeEnum gbicType) {
    this.gbicType = gbicType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is the discriminator value, which identifies the type of GBIC.")
  @JsonProperty("gbicType")
  public GbicTypeEnum getGbicType() {
    return gbicType;
  }
  
  public void setGbicType(GbicTypeEnum gbicType) {
    this.gbicType = gbicType;
  }

  
  /**
   * This field provides information about the port that the GBIC is associated with.
   **/
  public Gbic gbicPort(GbicPortEnum gbicPort) {
    this.gbicPort = gbicPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field provides information about the port that the GBIC is associated with.")
  @JsonProperty("gbicPort")
  public GbicPortEnum getGbicPort() {
    return gbicPort;
  }
  
  public void setGbicPort(GbicPortEnum gbicPort) {
    this.gbicPort = gbicPort;
  }

  
  /**
   * Information returned is based on the type of the GBIC parent. The data returned describes the component or controller that is associated with the GBIC.
   **/
  public Gbic parentData(GBICParentTypeData parentData) {
    this.parentData = parentData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information returned is based on the type of the GBIC parent. The data returned describes the component or controller that is associated with the GBIC.")
  @JsonProperty("parentData")
  public GBICParentTypeData getParentData() {
    return parentData;
  }
  
  public void setParentData(GBICParentTypeData parentData) {
    this.parentData = parentData;
  }

  
  /**
   **/
  public Gbic reserved1(String reserved1) {
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
  public Gbic reserved2(String reserved2) {
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
    Gbic gbic = (Gbic) o;
    return Objects.equals(this.gbicRef, gbic.gbicRef) &&
        Objects.equals(this.status, gbic.status) &&
        Objects.equals(this.physicalLocation, gbic.physicalLocation) &&
        Objects.equals(this.gbicType, gbic.gbicType) &&
        Objects.equals(this.gbicPort, gbic.gbicPort) &&
        Objects.equals(this.parentData, gbic.parentData) &&
        Objects.equals(this.reserved1, gbic.reserved1) &&
        Objects.equals(this.reserved2, gbic.reserved2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gbicRef, status, physicalLocation, gbicType, gbicPort, parentData, reserved1, reserved2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gbic {\n");
    
    sb.append("    gbicRef: ").append(toIndentedString(gbicRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    gbicType: ").append(toIndentedString(gbicType)).append("\n");
    sb.append("    gbicPort: ").append(toIndentedString(gbicPort)).append("\n");
    sb.append("    parentData: ").append(toIndentedString(parentData)).append("\n");
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

