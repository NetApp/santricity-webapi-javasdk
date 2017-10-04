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
 * CandidateSelectionTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class CandidateSelectionTypeData   {
  

  /**
   * This enumeration object is used to specify the type of volume candidate that the client wishes to obtain in a getVolumeCandidates procedure call.
   */
  public enum CandidateSelectionTypeEnum {
    freeExtent("freeExtent"),
    manual("manual"),
    count("count"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CandidateSelectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CandidateSelectionTypeEnum candidateSelectionType;

    private DriveRefList driveRefList;

  
  /**
   * This enumeration object is used to specify the type of volume candidate that the client wishes to obtain in a getVolumeCandidates procedure call.
   **/
  public CandidateSelectionTypeData candidateSelectionType(CandidateSelectionTypeEnum candidateSelectionType) {
    this.candidateSelectionType = candidateSelectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to specify the type of volume candidate that the client wishes to obtain in a getVolumeCandidates procedure call.")
  @JsonProperty("candidateSelectionType")
  public CandidateSelectionTypeEnum getCandidateSelectionType() {
    return candidateSelectionType;
  }
  
  public void setCandidateSelectionType(CandidateSelectionTypeEnum candidateSelectionType) {
    this.candidateSelectionType = candidateSelectionType;
  }

  
  /**
   * This field is present only if the candidateSelectionType value is equal to CANDIDATE_SEL_MANUAL. It contains the reference values for the drives on which a new volume group (and volume) are to be created.
   **/
  public CandidateSelectionTypeData driveRefList(DriveRefList driveRefList) {
    this.driveRefList = driveRefList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the candidateSelectionType value is equal to CANDIDATE_SEL_MANUAL. It contains the reference values for the drives on which a new volume group (and volume) are to be created.")
  @JsonProperty("driveRefList")
  public DriveRefList getDriveRefList() {
    return driveRefList;
  }
  
  public void setDriveRefList(DriveRefList driveRefList) {
    this.driveRefList = driveRefList;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateSelectionTypeData candidateSelectionTypeData = (CandidateSelectionTypeData) o;
    return Objects.equals(this.candidateSelectionType, candidateSelectionTypeData.candidateSelectionType) &&
        Objects.equals(this.driveRefList, candidateSelectionTypeData.driveRefList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateSelectionType, driveRefList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateSelectionTypeData {\n");
    
    sb.append("    candidateSelectionType: ").append(toIndentedString(candidateSelectionType)).append("\n");
    sb.append("    driveRefList: ").append(toIndentedString(driveRefList)).append("\n");
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

