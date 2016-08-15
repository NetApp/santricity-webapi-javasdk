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
 * ConcatVolumeNewVolumeCandidate
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ConcatVolumeNewVolumeCandidate   {
  
    private String memberVolumeLabel;

    private String memberVolumeGroupLabel;

    private VolumeCandidate memberCandidate;

    private Long memberCapacity;

  
  /**
   * The label for the new member volume.
   **/
  public ConcatVolumeNewVolumeCandidate memberVolumeLabel(String memberVolumeLabel) {
    this.memberVolumeLabel = memberVolumeLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The label for the new member volume.")
  @JsonProperty("memberVolumeLabel")
  public String getMemberVolumeLabel() {
    return memberVolumeLabel;
  }
  
  public void setMemberVolumeLabel(String memberVolumeLabel) {
    this.memberVolumeLabel = memberVolumeLabel;
  }

  
  /**
   * An optional volume group label if creating a new volume group.
   **/
  public ConcatVolumeNewVolumeCandidate memberVolumeGroupLabel(String memberVolumeGroupLabel) {
    this.memberVolumeGroupLabel = memberVolumeGroupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An optional volume group label if creating a new volume group.")
  @JsonProperty("memberVolumeGroupLabel")
  public String getMemberVolumeGroupLabel() {
    return memberVolumeGroupLabel;
  }
  
  public void setMemberVolumeGroupLabel(String memberVolumeGroupLabel) {
    this.memberVolumeGroupLabel = memberVolumeGroupLabel;
  }

  
  /**
   * The candidate to be used to create the member volume.
   **/
  public ConcatVolumeNewVolumeCandidate memberCandidate(VolumeCandidate memberCandidate) {
    this.memberCandidate = memberCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The candidate to be used to create the member volume.")
  @JsonProperty("memberCandidate")
  public VolumeCandidate getMemberCandidate() {
    return memberCandidate;
  }
  
  public void setMemberCandidate(VolumeCandidate memberCandidate) {
    this.memberCandidate = memberCandidate;
  }

  
  /**
   * The capacity of the new volume to create, in bytes.
   **/
  public ConcatVolumeNewVolumeCandidate memberCapacity(Long memberCapacity) {
    this.memberCapacity = memberCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity of the new volume to create, in bytes.")
  @JsonProperty("memberCapacity")
  public Long getMemberCapacity() {
    return memberCapacity;
  }
  
  public void setMemberCapacity(Long memberCapacity) {
    this.memberCapacity = memberCapacity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConcatVolumeNewVolumeCandidate concatVolumeNewVolumeCandidate = (ConcatVolumeNewVolumeCandidate) o;
    return Objects.equals(this.memberVolumeLabel, concatVolumeNewVolumeCandidate.memberVolumeLabel) &&
        Objects.equals(this.memberVolumeGroupLabel, concatVolumeNewVolumeCandidate.memberVolumeGroupLabel) &&
        Objects.equals(this.memberCandidate, concatVolumeNewVolumeCandidate.memberCandidate) &&
        Objects.equals(this.memberCapacity, concatVolumeNewVolumeCandidate.memberCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberVolumeLabel, memberVolumeGroupLabel, memberCandidate, memberCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatVolumeNewVolumeCandidate {\n");
    
    sb.append("    memberVolumeLabel: ").append(toIndentedString(memberVolumeLabel)).append("\n");
    sb.append("    memberVolumeGroupLabel: ").append(toIndentedString(memberVolumeGroupLabel)).append("\n");
    sb.append("    memberCandidate: ").append(toIndentedString(memberCandidate)).append("\n");
    sb.append("    memberCapacity: ").append(toIndentedString(memberCapacity)).append("\n");
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

