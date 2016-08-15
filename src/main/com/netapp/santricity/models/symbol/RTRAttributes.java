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
 * RTRAttributes
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RTRAttributes   {
  

  /**
   * This enumeration identifies the type of CRU a component has.
   */
  public enum CruTypeEnum {
    unknown("unknown"),
    dedicated("dedicated"),
    shared("shared"),
    aggregate("aggregate"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CruTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CruTypeEnum cruType;

    private ParentCru parentCru;

    private RTRAttributeData rtrAttributeData;

  
  /**
   * This enumeration identifies the type of CRU a component has.
   **/
  public RTRAttributes cruType(CruTypeEnum cruType) {
    this.cruType = cruType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration identifies the type of CRU a component has.")
  @JsonProperty("cruType")
  public CruTypeEnum getCruType() {
    return cruType;
  }
  
  public void setCruType(CruTypeEnum cruType) {
    this.cruType = cruType;
  }

  
  /**
   * This field identifies the CRU that is the parent of this component, i.e., the CRU that it is sharing with other components. It is only present when the cruType field is set to CRU_TYPE_AGGREGATE.
   **/
  public RTRAttributes parentCru(ParentCru parentCru) {
    this.parentCru = parentCru;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field identifies the CRU that is the parent of this component, i.e., the CRU that it is sharing with other components. It is only present when the cruType field is set to CRU_TYPE_AGGREGATE.")
  @JsonProperty("parentCru")
  public ParentCru getParentCru() {
    return parentCru;
  }
  
  public void setParentCru(ParentCru parentCru) {
    this.parentCru = parentCru;
  }

  
  /**
   * This field contains the actual settings for the ready-to-remove data. It is only present when the cruType field is set to CRU_TYPE_DEDICATED.
   **/
  public RTRAttributes rtrAttributeData(RTRAttributeData rtrAttributeData) {
    this.rtrAttributeData = rtrAttributeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains the actual settings for the ready-to-remove data. It is only present when the cruType field is set to CRU_TYPE_DEDICATED.")
  @JsonProperty("rtrAttributeData")
  public RTRAttributeData getRtrAttributeData() {
    return rtrAttributeData;
  }
  
  public void setRtrAttributeData(RTRAttributeData rtrAttributeData) {
    this.rtrAttributeData = rtrAttributeData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTRAttributes rTRAttributes = (RTRAttributes) o;
    return Objects.equals(this.cruType, rTRAttributes.cruType) &&
        Objects.equals(this.parentCru, rTRAttributes.parentCru) &&
        Objects.equals(this.rtrAttributeData, rTRAttributes.rtrAttributeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cruType, parentCru, rtrAttributeData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTRAttributes {\n");
    
    sb.append("    cruType: ").append(toIndentedString(cruType)).append("\n");
    sb.append("    parentCru: ").append(toIndentedString(parentCru)).append("\n");
    sb.append("    rtrAttributeData: ").append(toIndentedString(rtrAttributeData)).append("\n");
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

