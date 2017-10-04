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
 * ConcatVolumeExistingVolumeCandidate
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ConcatVolumeExistingVolumeCandidate   {
  

  /**
   * This enumeration is used to specify the Concatenated Volume Member reference type.
   */
  public enum RefTypeEnum {
    unknown("unknown"),
    volref("volref"),
    label("label"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RefTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RefTypeEnum refType;

    private List<String> memberVolumeRef;

    private List<String> memberLabel;

  
  /**
   * This enumeration is used to specify the Concatenated Volume Member reference type.
   **/
  public ConcatVolumeExistingVolumeCandidate refType(RefTypeEnum refType) {
    this.refType = refType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration is used to specify the Concatenated Volume Member reference type.")
  @JsonProperty("refType")
  public RefTypeEnum getRefType() {
    return refType;
  }
  
  public void setRefType(RefTypeEnum refType) {
    this.refType = refType;
  }

  
  /**
   * A list of member volumes specified using volume references. This field is present only if the value of refType is equal to CONCAT_VOL_MEMBER_REF_TYPE_VOLREF.
   **/
  public ConcatVolumeExistingVolumeCandidate memberVolumeRef(List<String> memberVolumeRef) {
    this.memberVolumeRef = memberVolumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of member volumes specified using volume references. This field is present only if the value of refType is equal to CONCAT_VOL_MEMBER_REF_TYPE_VOLREF.")
  @JsonProperty("memberVolumeRef")
  public List<String> getMemberVolumeRef() {
    return memberVolumeRef;
  }
  
  public void setMemberVolumeRef(List<String> memberVolumeRef) {
    this.memberVolumeRef = memberVolumeRef;
  }

  
  /**
   * A list of member volumes specified using volume labels. This field is present only if the value of refType is equal to CONCAT_VOL_MEMBER_REF_TYPE_LABEL.
   **/
  public ConcatVolumeExistingVolumeCandidate memberLabel(List<String> memberLabel) {
    this.memberLabel = memberLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of member volumes specified using volume labels. This field is present only if the value of refType is equal to CONCAT_VOL_MEMBER_REF_TYPE_LABEL.")
  @JsonProperty("memberLabel")
  public List<String> getMemberLabel() {
    return memberLabel;
  }
  
  public void setMemberLabel(List<String> memberLabel) {
    this.memberLabel = memberLabel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConcatVolumeExistingVolumeCandidate concatVolumeExistingVolumeCandidate = (ConcatVolumeExistingVolumeCandidate) o;
    return Objects.equals(this.refType, concatVolumeExistingVolumeCandidate.refType) &&
        Objects.equals(this.memberVolumeRef, concatVolumeExistingVolumeCandidate.memberVolumeRef) &&
        Objects.equals(this.memberLabel, concatVolumeExistingVolumeCandidate.memberLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refType, memberVolumeRef, memberLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatVolumeExistingVolumeCandidate {\n");
    
    sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
    sb.append("    memberVolumeRef: ").append(toIndentedString(memberVolumeRef)).append("\n");
    sb.append("    memberLabel: ").append(toIndentedString(memberLabel)).append("\n");
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

