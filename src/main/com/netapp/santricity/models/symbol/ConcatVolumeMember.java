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
 * ConcatVolumeMember
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ConcatVolumeMember   {
  
    private String memberRef;

    private String concatVolRef;

    private String storageVolumeRef;

    private Integer parentIndex;

  
  /**
   * A reference (key) for ConcatVolumeMember.
   **/
  public ConcatVolumeMember memberRef(String memberRef) {
    this.memberRef = memberRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference (key) for ConcatVolumeMember.")
  @JsonProperty("memberRef")
  public String getMemberRef() {
    return memberRef;
  }
  
  public void setMemberRef(String memberRef) {
    this.memberRef = memberRef;
  }

  
  /**
   * A reference to the parent ConcatVolume.
   **/
  public ConcatVolumeMember concatVolRef(String concatVolRef) {
    this.concatVolRef = concatVolRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the parent ConcatVolume.")
  @JsonProperty("concatVolRef")
  public String getConcatVolRef() {
    return concatVolRef;
  }
  
  public void setConcatVolRef(String concatVolRef) {
    this.concatVolRef = concatVolRef;
  }

  
  /**
   * A reference to the member RAID volume providing storage capacity.
   **/
  public ConcatVolumeMember storageVolumeRef(String storageVolumeRef) {
    this.storageVolumeRef = storageVolumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the member RAID volume providing storage capacity.")
  @JsonProperty("storageVolumeRef")
  public String getStorageVolumeRef() {
    return storageVolumeRef;
  }
  
  public void setStorageVolumeRef(String storageVolumeRef) {
    this.storageVolumeRef = storageVolumeRef;
  }

  
  /**
   * The index (order) of the member in the aggregated parent volume capacity.
   **/
  public ConcatVolumeMember parentIndex(Integer parentIndex) {
    this.parentIndex = parentIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The index (order) of the member in the aggregated parent volume capacity.")
  @JsonProperty("parentIndex")
  public Integer getParentIndex() {
    return parentIndex;
  }
  
  public void setParentIndex(Integer parentIndex) {
    this.parentIndex = parentIndex;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConcatVolumeMember concatVolumeMember = (ConcatVolumeMember) o;
    return Objects.equals(this.memberRef, concatVolumeMember.memberRef) &&
        Objects.equals(this.concatVolRef, concatVolumeMember.concatVolRef) &&
        Objects.equals(this.storageVolumeRef, concatVolumeMember.storageVolumeRef) &&
        Objects.equals(this.parentIndex, concatVolumeMember.parentIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberRef, concatVolRef, storageVolumeRef, parentIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatVolumeMember {\n");
    
    sb.append("    memberRef: ").append(toIndentedString(memberRef)).append("\n");
    sb.append("    concatVolRef: ").append(toIndentedString(concatVolRef)).append("\n");
    sb.append("    storageVolumeRef: ").append(toIndentedString(storageVolumeRef)).append("\n");
    sb.append("    parentIndex: ").append(toIndentedString(parentIndex)).append("\n");
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

