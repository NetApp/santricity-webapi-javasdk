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
 * GBICParentTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class GBICParentTypeData   {
  

  /**
   * This enumeration is used to identify the parent type of a GBIC component.
   */
  public enum GbicParentTypeEnum {
    esm("esm"),
    minihub("minihub"),
    controller("controller"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    GbicParentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private GbicParentTypeEnum gbicParentType;

    private ControllerGBIC controllerGBIC;

    private String parentEsm;

    private String parentMinihub;

  
  /**
   * This enumeration is used to identify the parent type of a GBIC component.
   **/
  public GBICParentTypeData gbicParentType(GbicParentTypeEnum gbicParentType) {
    this.gbicParentType = gbicParentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration is used to identify the parent type of a GBIC component.")
  @JsonProperty("gbicParentType")
  public GbicParentTypeEnum getGbicParentType() {
    return gbicParentType;
  }
  
  public void setGbicParentType(GbicParentTypeEnum gbicParentType) {
    this.gbicParentType = gbicParentType;
  }

  
  /**
   * This field is present only if the gbicParentType value is GBIC_PARENT_TYPE_CONTROLLER. It contains the detailed information about the controller channel.
   **/
  public GBICParentTypeData controllerGBIC(ControllerGBIC controllerGBIC) {
    this.controllerGBIC = controllerGBIC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the gbicParentType value is GBIC_PARENT_TYPE_CONTROLLER. It contains the detailed information about the controller channel.")
  @JsonProperty("controllerGBIC")
  public ControllerGBIC getControllerGBIC() {
    return controllerGBIC;
  }
  
  public void setControllerGBIC(ControllerGBIC controllerGBIC) {
    this.controllerGBIC = controllerGBIC;
  }

  
  /**
   * No information is returned
   **/
  public GBICParentTypeData parentEsm(String parentEsm) {
    this.parentEsm = parentEsm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "No information is returned")
  @JsonProperty("parentEsm")
  public String getParentEsm() {
    return parentEsm;
  }
  
  public void setParentEsm(String parentEsm) {
    this.parentEsm = parentEsm;
  }

  
  /**
   * This field is present only if the gbicParentType value is GBIC_PARENT_TYPE_MINIHUB. It contains the detailed information about the minihub the GBIC belongs to.
   **/
  public GBICParentTypeData parentMinihub(String parentMinihub) {
    this.parentMinihub = parentMinihub;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the gbicParentType value is GBIC_PARENT_TYPE_MINIHUB. It contains the detailed information about the minihub the GBIC belongs to.")
  @JsonProperty("parentMinihub")
  public String getParentMinihub() {
    return parentMinihub;
  }
  
  public void setParentMinihub(String parentMinihub) {
    this.parentMinihub = parentMinihub;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GBICParentTypeData gBICParentTypeData = (GBICParentTypeData) o;
    return Objects.equals(this.gbicParentType, gBICParentTypeData.gbicParentType) &&
        Objects.equals(this.controllerGBIC, gBICParentTypeData.controllerGBIC) &&
        Objects.equals(this.parentEsm, gBICParentTypeData.parentEsm) &&
        Objects.equals(this.parentMinihub, gBICParentTypeData.parentMinihub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gbicParentType, controllerGBIC, parentEsm, parentMinihub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GBICParentTypeData {\n");
    
    sb.append("    gbicParentType: ").append(toIndentedString(gbicParentType)).append("\n");
    sb.append("    controllerGBIC: ").append(toIndentedString(controllerGBIC)).append("\n");
    sb.append("    parentEsm: ").append(toIndentedString(parentEsm)).append("\n");
    sb.append("    parentMinihub: ").append(toIndentedString(parentMinihub)).append("\n");
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

