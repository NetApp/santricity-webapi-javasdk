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
 * MgmtClientRecordReadDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class MgmtClientRecordReadDescriptor   {
  
    private MgmtClientRecordId rangeBegin;

    private MgmtClientRecordId rangeEnd;

  
  /**
   * This field contains the database ID of the first record of a range of records to read. Note that the read operation reads all records in the range, inclusive of this record.
   **/
  public MgmtClientRecordReadDescriptor rangeBegin(MgmtClientRecordId rangeBegin) {
    this.rangeBegin = rangeBegin;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the database ID of the first record of a range of records to read. Note that the read operation reads all records in the range, inclusive of this record.")
  @JsonProperty("rangeBegin")
  public MgmtClientRecordId getRangeBegin() {
    return rangeBegin;
  }
  
  public void setRangeBegin(MgmtClientRecordId rangeBegin) {
    this.rangeBegin = rangeBegin;
  }

  
  /**
   * This field contains the database ID of the last record of a range of records to read. Note that the read operation reads all records in the range, inclusive of this record.
   **/
  public MgmtClientRecordReadDescriptor rangeEnd(MgmtClientRecordId rangeEnd) {
    this.rangeEnd = rangeEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains the database ID of the last record of a range of records to read. Note that the read operation reads all records in the range, inclusive of this record.")
  @JsonProperty("rangeEnd")
  public MgmtClientRecordId getRangeEnd() {
    return rangeEnd;
  }
  
  public void setRangeEnd(MgmtClientRecordId rangeEnd) {
    this.rangeEnd = rangeEnd;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MgmtClientRecordReadDescriptor mgmtClientRecordReadDescriptor = (MgmtClientRecordReadDescriptor) o;
    return Objects.equals(this.rangeBegin, mgmtClientRecordReadDescriptor.rangeBegin) &&
        Objects.equals(this.rangeEnd, mgmtClientRecordReadDescriptor.rangeEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rangeBegin, rangeEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MgmtClientRecordReadDescriptor {\n");
    
    sb.append("    rangeBegin: ").append(toIndentedString(rangeBegin)).append("\n");
    sb.append("    rangeEnd: ").append(toIndentedString(rangeEnd)).append("\n");
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

