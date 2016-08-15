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
 * ConcatVolumeCandidate
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ConcatVolumeCandidate   {
  

  /**
   * This enumeration is used to specify the Concatenated Volume candidate type.
   */
  public enum CandTypeEnum {
    unknown("unknown"),
    newVol("newVol"),
    existingVols("existingVols"),
    expansion("expansion"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CandTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CandTypeEnum candType;

    private ConcatVolumeNewVolumeCandidate newVolCandidate;

    private ConcatVolumeExistingVolumeCandidate existVolCandidate;

    private ConcatVolumeDirectExpansionDescriptor expansionDescriptor;

  
  /**
   * This enumeration is used to specify the Concatenated Volume candidate type.
   **/
  public ConcatVolumeCandidate candType(CandTypeEnum candType) {
    this.candType = candType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration is used to specify the Concatenated Volume candidate type.")
  @JsonProperty("candType")
  public CandTypeEnum getCandType() {
    return candType;
  }
  
  public void setCandType(CandTypeEnum candType) {
    this.candType = candType;
  }

  
  /**
   * This field is present only if the ConcatVolumeCandidateType value is equal to CONCAT_VOL_CANDIDATE_TYPE_NEW_VOL.
   **/
  public ConcatVolumeCandidate newVolCandidate(ConcatVolumeNewVolumeCandidate newVolCandidate) {
    this.newVolCandidate = newVolCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the ConcatVolumeCandidateType value is equal to CONCAT_VOL_CANDIDATE_TYPE_NEW_VOL.")
  @JsonProperty("newVolCandidate")
  public ConcatVolumeNewVolumeCandidate getNewVolCandidate() {
    return newVolCandidate;
  }
  
  public void setNewVolCandidate(ConcatVolumeNewVolumeCandidate newVolCandidate) {
    this.newVolCandidate = newVolCandidate;
  }

  
  /**
   * This field is present only if the ConcatVolumeCandidateType value is equal to CONCAT_VOL_CANDIDATE_TYPE_EXISTING_VOLS.
   **/
  public ConcatVolumeCandidate existVolCandidate(ConcatVolumeExistingVolumeCandidate existVolCandidate) {
    this.existVolCandidate = existVolCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the ConcatVolumeCandidateType value is equal to CONCAT_VOL_CANDIDATE_TYPE_EXISTING_VOLS.")
  @JsonProperty("existVolCandidate")
  public ConcatVolumeExistingVolumeCandidate getExistVolCandidate() {
    return existVolCandidate;
  }
  
  public void setExistVolCandidate(ConcatVolumeExistingVolumeCandidate existVolCandidate) {
    this.existVolCandidate = existVolCandidate;
  }

  
  /**
   * This field is present only if the ConcatVolumeCandidateType value is equal to CONCAT_VOL_CANDIDATE_TYPE_EXPANSION.
   **/
  public ConcatVolumeCandidate expansionDescriptor(ConcatVolumeDirectExpansionDescriptor expansionDescriptor) {
    this.expansionDescriptor = expansionDescriptor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the ConcatVolumeCandidateType value is equal to CONCAT_VOL_CANDIDATE_TYPE_EXPANSION.")
  @JsonProperty("expansionDescriptor")
  public ConcatVolumeDirectExpansionDescriptor getExpansionDescriptor() {
    return expansionDescriptor;
  }
  
  public void setExpansionDescriptor(ConcatVolumeDirectExpansionDescriptor expansionDescriptor) {
    this.expansionDescriptor = expansionDescriptor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConcatVolumeCandidate concatVolumeCandidate = (ConcatVolumeCandidate) o;
    return Objects.equals(this.candType, concatVolumeCandidate.candType) &&
        Objects.equals(this.newVolCandidate, concatVolumeCandidate.newVolCandidate) &&
        Objects.equals(this.existVolCandidate, concatVolumeCandidate.existVolCandidate) &&
        Objects.equals(this.expansionDescriptor, concatVolumeCandidate.expansionDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candType, newVolCandidate, existVolCandidate, expansionDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatVolumeCandidate {\n");
    
    sb.append("    candType: ").append(toIndentedString(candType)).append("\n");
    sb.append("    newVolCandidate: ").append(toIndentedString(newVolCandidate)).append("\n");
    sb.append("    existVolCandidate: ").append(toIndentedString(existVolCandidate)).append("\n");
    sb.append("    expansionDescriptor: ").append(toIndentedString(expansionDescriptor)).append("\n");
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

