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
 * SasExpanderParent
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SasExpanderParent   {
  

  /**
   * This enumeration specifies the different types of parent elements a SAS expander may have.
   */
  public enum ExpanderParentTypeEnum {
    unknown("unknown"),
    controller("controller"),
    esm("esm"),
    drawer("drawer"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ExpanderParentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ExpanderParentTypeEnum expanderParentType;

    private String parentController;

    private String parentEsm;

    private String parentDrawer;

  
  /**
   * This enumeration specifies the different types of parent elements a SAS expander may have.
   **/
  public SasExpanderParent expanderParentType(ExpanderParentTypeEnum expanderParentType) {
    this.expanderParentType = expanderParentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration specifies the different types of parent elements a SAS expander may have.")
  @JsonProperty("expanderParentType")
  public ExpanderParentTypeEnum getExpanderParentType() {
    return expanderParentType;
  }
  
  public void setExpanderParentType(ExpanderParentTypeEnum expanderParentType) {
    this.expanderParentType = expanderParentType;
  }

  
  /**
   * A reference to the parent controller of the SAS expander. This field is present only if the expanderParentType value is SAS_EXPANDER_PARENT_CONTROLLER.
   **/
  public SasExpanderParent parentController(String parentController) {
    this.parentController = parentController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the parent controller of the SAS expander. This field is present only if the expanderParentType value is SAS_EXPANDER_PARENT_CONTROLLER.")
  @JsonProperty("parentController")
  public String getParentController() {
    return parentController;
  }
  
  public void setParentController(String parentController) {
    this.parentController = parentController;
  }

  
  /**
   * A reference to the parent ESM of the SAS expander. This field is present only if the expanderParentType value is SAS_EXPANDER_PARENT_ESM.
   **/
  public SasExpanderParent parentEsm(String parentEsm) {
    this.parentEsm = parentEsm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the parent ESM of the SAS expander. This field is present only if the expanderParentType value is SAS_EXPANDER_PARENT_ESM.")
  @JsonProperty("parentEsm")
  public String getParentEsm() {
    return parentEsm;
  }
  
  public void setParentEsm(String parentEsm) {
    this.parentEsm = parentEsm;
  }

  
  /**
   * A reference to the parent drawer of the SAS expander. This field is present only if the expanderParentType value is SAS_EXPANDER_PARENT_DRAWER.
   **/
  public SasExpanderParent parentDrawer(String parentDrawer) {
    this.parentDrawer = parentDrawer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the parent drawer of the SAS expander. This field is present only if the expanderParentType value is SAS_EXPANDER_PARENT_DRAWER.")
  @JsonProperty("parentDrawer")
  public String getParentDrawer() {
    return parentDrawer;
  }
  
  public void setParentDrawer(String parentDrawer) {
    this.parentDrawer = parentDrawer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasExpanderParent sasExpanderParent = (SasExpanderParent) o;
    return Objects.equals(this.expanderParentType, sasExpanderParent.expanderParentType) &&
        Objects.equals(this.parentController, sasExpanderParent.parentController) &&
        Objects.equals(this.parentEsm, sasExpanderParent.parentEsm) &&
        Objects.equals(this.parentDrawer, sasExpanderParent.parentDrawer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expanderParentType, parentController, parentEsm, parentDrawer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasExpanderParent {\n");
    
    sb.append("    expanderParentType: ").append(toIndentedString(expanderParentType)).append("\n");
    sb.append("    parentController: ").append(toIndentedString(parentController)).append("\n");
    sb.append("    parentEsm: ").append(toIndentedString(parentEsm)).append("\n");
    sb.append("    parentDrawer: ").append(toIndentedString(parentDrawer)).append("\n");
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

