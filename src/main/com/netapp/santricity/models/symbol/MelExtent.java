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
 * MelExtent
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class MelExtent   {
  
    private Long startingSeqNum;

    private Long endingSeqNum;

  
  /**
   * This is the sequence number of the entry at the low end of the extent. So, when this value is returned in getMelExtents, it is the sequence number of the first MEL event that can be returned in getMelEntries. When specified as an input to getMelEntries, it is the sequence number of the first MEL event to be returned.
   **/
  public MelExtent startingSeqNum(Long startingSeqNum) {
    this.startingSeqNum = startingSeqNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the sequence number of the entry at the low end of the extent. So, when this value is returned in getMelExtents, it is the sequence number of the first MEL event that can be returned in getMelEntries. When specified as an input to getMelEntries, it is the sequence number of the first MEL event to be returned.")
  @JsonProperty("startingSeqNum")
  public Long getStartingSeqNum() {
    return startingSeqNum;
  }
  
  public void setStartingSeqNum(Long startingSeqNum) {
    this.startingSeqNum = startingSeqNum;
  }

  
  /**
   * When this value is returned by getMelExtents, it is the sequence number that is one beyond the entry at the high end of the extent. For example, if the ending sequence number is 3232, then MEL entries up to sequence 3231 are retrievable. When this value is input to getMelEntries, it is the sequence number of the last MEL event to be returned.
   **/
  public MelExtent endingSeqNum(Long endingSeqNum) {
    this.endingSeqNum = endingSeqNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When this value is returned by getMelExtents, it is the sequence number that is one beyond the entry at the high end of the extent. For example, if the ending sequence number is 3232, then MEL entries up to sequence 3231 are retrievable. When this value is input to getMelEntries, it is the sequence number of the last MEL event to be returned.")
  @JsonProperty("endingSeqNum")
  public Long getEndingSeqNum() {
    return endingSeqNum;
  }
  
  public void setEndingSeqNum(Long endingSeqNum) {
    this.endingSeqNum = endingSeqNum;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MelExtent melExtent = (MelExtent) o;
    return Objects.equals(this.startingSeqNum, melExtent.startingSeqNum) &&
        Objects.equals(this.endingSeqNum, melExtent.endingSeqNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startingSeqNum, endingSeqNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MelExtent {\n");
    
    sb.append("    startingSeqNum: ").append(toIndentedString(startingSeqNum)).append("\n");
    sb.append("    endingSeqNum: ").append(toIndentedString(endingSeqNum)).append("\n");
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

