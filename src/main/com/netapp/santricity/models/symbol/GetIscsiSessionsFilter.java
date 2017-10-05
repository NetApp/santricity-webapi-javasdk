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
 * GetIscsiSessionsFilter
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class GetIscsiSessionsFilter   {
  

  /**
   * This enumeration type identifies the different filter options for the getIscsiSessions procedure.
   */
  public enum TypeEnum {
    all("all"),
    byTarget("byTarget"),
    byInitiator("byInitiator"),
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

    private String initiatorRef;

    private String targetRef;

  
  /**
   * This enumeration type identifies the different filter options for the getIscsiSessions procedure.
   **/
  public GetIscsiSessionsFilter type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration type identifies the different filter options for the getIscsiSessions procedure.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * A reference to an initiator instance. This field is present only if type is GET_ISCSI_SESSIONS_BY_INITIATOR.
   **/
  public GetIscsiSessionsFilter initiatorRef(String initiatorRef) {
    this.initiatorRef = initiatorRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to an initiator instance. This field is present only if type is GET_ISCSI_SESSIONS_BY_INITIATOR.")
  @JsonProperty("initiatorRef")
  public String getInitiatorRef() {
    return initiatorRef;
  }
  
  public void setInitiatorRef(String initiatorRef) {
    this.initiatorRef = initiatorRef;
  }

  
  /**
   * A reference to a target instance. This field is present only if type is GET_ISCSI_SESSIONS_BY_TARGET.
   **/
  public GetIscsiSessionsFilter targetRef(String targetRef) {
    this.targetRef = targetRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to a target instance. This field is present only if type is GET_ISCSI_SESSIONS_BY_TARGET.")
  @JsonProperty("targetRef")
  public String getTargetRef() {
    return targetRef;
  }
  
  public void setTargetRef(String targetRef) {
    this.targetRef = targetRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIscsiSessionsFilter getIscsiSessionsFilter = (GetIscsiSessionsFilter) o;
    return Objects.equals(this.type, getIscsiSessionsFilter.type) &&
        Objects.equals(this.initiatorRef, getIscsiSessionsFilter.initiatorRef) &&
        Objects.equals(this.targetRef, getIscsiSessionsFilter.targetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, initiatorRef, targetRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIscsiSessionsFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    initiatorRef: ").append(toIndentedString(initiatorRef)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
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

