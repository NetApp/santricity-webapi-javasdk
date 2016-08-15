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
 * SFPParentTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SFPParentTypeData   {
  

  /**
   * This enumeration object is used to describe the parent type of a SFP.
   */
  public enum SfpParentTypeEnum {
    unknown("unknown"),
    esm("esm"),
    minihub("minihub"),
    controller("controller"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SfpParentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SfpParentTypeEnum sfpParentType;

    private ControllerSFP controllerSFP;

    private String parentEsm;

    private String parentMinihub;

  
  /**
   * This enumeration object is used to describe the parent type of a SFP.
   **/
  public SFPParentTypeData sfpParentType(SfpParentTypeEnum sfpParentType) {
    this.sfpParentType = sfpParentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to describe the parent type of a SFP.")
  @JsonProperty("sfpParentType")
  public SfpParentTypeEnum getSfpParentType() {
    return sfpParentType;
  }
  
  public void setSfpParentType(SfpParentTypeEnum sfpParentType) {
    this.sfpParentType = sfpParentType;
  }

  
  /**
   * This field is present only if the sfpParentType is equal to SFP_PARENT_TYPE_CONTROLLER. It contains the parent type of a SFP.
   **/
  public SFPParentTypeData controllerSFP(ControllerSFP controllerSFP) {
    this.controllerSFP = controllerSFP;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the sfpParentType is equal to SFP_PARENT_TYPE_CONTROLLER. It contains the parent type of a SFP.")
  @JsonProperty("controllerSFP")
  public ControllerSFP getControllerSFP() {
    return controllerSFP;
  }
  
  public void setControllerSFP(ControllerSFP controllerSFP) {
    this.controllerSFP = controllerSFP;
  }

  
  /**
   * No information is returned
   **/
  public SFPParentTypeData parentEsm(String parentEsm) {
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
   * This field is present only if the sfpParentType is equal to SFP_PARENT_TYPE_MINIHUB. It contains the parent type of a SFP.
   **/
  public SFPParentTypeData parentMinihub(String parentMinihub) {
    this.parentMinihub = parentMinihub;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the sfpParentType is equal to SFP_PARENT_TYPE_MINIHUB. It contains the parent type of a SFP.")
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
    SFPParentTypeData sFPParentTypeData = (SFPParentTypeData) o;
    return Objects.equals(this.sfpParentType, sFPParentTypeData.sfpParentType) &&
        Objects.equals(this.controllerSFP, sFPParentTypeData.controllerSFP) &&
        Objects.equals(this.parentEsm, sFPParentTypeData.parentEsm) &&
        Objects.equals(this.parentMinihub, sFPParentTypeData.parentMinihub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sfpParentType, controllerSFP, parentEsm, parentMinihub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SFPParentTypeData {\n");
    
    sb.append("    sfpParentType: ").append(toIndentedString(sfpParentType)).append("\n");
    sb.append("    controllerSFP: ").append(toIndentedString(controllerSFP)).append("\n");
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

