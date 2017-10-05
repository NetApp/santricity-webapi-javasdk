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
 * ParentCru
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ParentCru   {
  

  /**
   * This enumeration object is used to specify the type of reference that is contained in a ParentCru union.
   */
  public enum TypeEnum {
    controller("controller"),
    esm("esm"),
    fan("fan"),
    iccCru("iccCru"),
    supportCru("supportCru"),
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

    private String parentController;

    private String parentEsm;

    private String parentFan;

    private String parentInterconnectCru;

    private String parentSupportCru;

    private String parentDrawer;

  
  /**
   * This enumeration object is used to specify the type of reference that is contained in a ParentCru union.
   **/
  public ParentCru type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to specify the type of reference that is contained in a ParentCru union.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * This field contains a reference to the parent controller. It is only valid if the type field is equal to PARENT_CRU_TYPE_CONTROLLER.
   **/
  public ParentCru parentController(String parentController) {
    this.parentController = parentController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains a reference to the parent controller. It is only valid if the type field is equal to PARENT_CRU_TYPE_CONTROLLER.")
  @JsonProperty("parentController")
  public String getParentController() {
    return parentController;
  }
  
  public void setParentController(String parentController) {
    this.parentController = parentController;
  }

  
  /**
   * This field contains a reference to the parent ESM. It is only valid if the type field is equal to PARENT_CRU_TYPE_ESM.
   **/
  public ParentCru parentEsm(String parentEsm) {
    this.parentEsm = parentEsm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains a reference to the parent ESM. It is only valid if the type field is equal to PARENT_CRU_TYPE_ESM.")
  @JsonProperty("parentEsm")
  public String getParentEsm() {
    return parentEsm;
  }
  
  public void setParentEsm(String parentEsm) {
    this.parentEsm = parentEsm;
  }

  
  /**
   * This field contains a reference to the parent Fan. It is only valid if the type field is equal to PARENT_CRU_TYPE_FAN.
   **/
  public ParentCru parentFan(String parentFan) {
    this.parentFan = parentFan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains a reference to the parent Fan. It is only valid if the type field is equal to PARENT_CRU_TYPE_FAN.")
  @JsonProperty("parentFan")
  public String getParentFan() {
    return parentFan;
  }
  
  public void setParentFan(String parentFan) {
    this.parentFan = parentFan;
  }

  
  /**
   * This field contains a reference to the parent interconnect CRU. It is only valid if the type field is equal to PARENT_CRU_TYPE_ICC_CRU.
   **/
  public ParentCru parentInterconnectCru(String parentInterconnectCru) {
    this.parentInterconnectCru = parentInterconnectCru;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains a reference to the parent interconnect CRU. It is only valid if the type field is equal to PARENT_CRU_TYPE_ICC_CRU.")
  @JsonProperty("parentInterconnectCru")
  public String getParentInterconnectCru() {
    return parentInterconnectCru;
  }
  
  public void setParentInterconnectCru(String parentInterconnectCru) {
    this.parentInterconnectCru = parentInterconnectCru;
  }

  
  /**
   * This field contains a reference to the parent support CRU. It is only valid if the type field is equal to PARENT_CRU_TYPE_SUPPORT_CRU.
   **/
  public ParentCru parentSupportCru(String parentSupportCru) {
    this.parentSupportCru = parentSupportCru;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains a reference to the parent support CRU. It is only valid if the type field is equal to PARENT_CRU_TYPE_SUPPORT_CRU.")
  @JsonProperty("parentSupportCru")
  public String getParentSupportCru() {
    return parentSupportCru;
  }
  
  public void setParentSupportCru(String parentSupportCru) {
    this.parentSupportCru = parentSupportCru;
  }

  
  /**
   * This field contains a reference to the parent drawer. It is only valid if the type field is equal to PARENT_CRU_TYPE_DRAWER.
   **/
  public ParentCru parentDrawer(String parentDrawer) {
    this.parentDrawer = parentDrawer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains a reference to the parent drawer. It is only valid if the type field is equal to PARENT_CRU_TYPE_DRAWER.")
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
    ParentCru parentCru = (ParentCru) o;
    return Objects.equals(this.type, parentCru.type) &&
        Objects.equals(this.parentController, parentCru.parentController) &&
        Objects.equals(this.parentEsm, parentCru.parentEsm) &&
        Objects.equals(this.parentFan, parentCru.parentFan) &&
        Objects.equals(this.parentInterconnectCru, parentCru.parentInterconnectCru) &&
        Objects.equals(this.parentSupportCru, parentCru.parentSupportCru) &&
        Objects.equals(this.parentDrawer, parentCru.parentDrawer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parentController, parentEsm, parentFan, parentInterconnectCru, parentSupportCru, parentDrawer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParentCru {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parentController: ").append(toIndentedString(parentController)).append("\n");
    sb.append("    parentEsm: ").append(toIndentedString(parentEsm)).append("\n");
    sb.append("    parentFan: ").append(toIndentedString(parentFan)).append("\n");
    sb.append("    parentInterconnectCru: ").append(toIndentedString(parentInterconnectCru)).append("\n");
    sb.append("    parentSupportCru: ").append(toIndentedString(parentSupportCru)).append("\n");
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

