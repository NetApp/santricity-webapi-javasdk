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


package com.netapp.santricity.models.v2;

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
 * AuditLogGetResponse
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AuditLogGetResponse   {
  
    private Integer totalLogRecords;

    private List<AuditLogRecord> logRecords;

    private Integer firstRecordOrdinal;

    private Integer lastRecordOrdinal;

  
  /**
   * Total audit log records in the database
   **/
  public AuditLogGetResponse totalLogRecords(Integer totalLogRecords) {
    this.totalLogRecords = totalLogRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total audit log records in the database")
  @JsonProperty("totalLogRecords")
  public Integer getTotalLogRecords() {
    return totalLogRecords;
  }
  
  public void setTotalLogRecords(Integer totalLogRecords) {
    this.totalLogRecords = totalLogRecords;
  }

  
  /**
   * A list of log records requested
   **/
  public AuditLogGetResponse logRecords(List<AuditLogRecord> logRecords) {
    this.logRecords = logRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of log records requested")
  @JsonProperty("logRecords")
  public List<AuditLogRecord> getLogRecords() {
    return logRecords;
  }
  
  public void setLogRecords(List<AuditLogRecord> logRecords) {
    this.logRecords = logRecords;
  }

  
  /**
   * First record ordinal
   **/
  public AuditLogGetResponse firstRecordOrdinal(Integer firstRecordOrdinal) {
    this.firstRecordOrdinal = firstRecordOrdinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "First record ordinal")
  @JsonProperty("firstRecordOrdinal")
  public Integer getFirstRecordOrdinal() {
    return firstRecordOrdinal;
  }
  
  public void setFirstRecordOrdinal(Integer firstRecordOrdinal) {
    this.firstRecordOrdinal = firstRecordOrdinal;
  }

  
  /**
   * Last record ordinal
   **/
  public AuditLogGetResponse lastRecordOrdinal(Integer lastRecordOrdinal) {
    this.lastRecordOrdinal = lastRecordOrdinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last record ordinal")
  @JsonProperty("lastRecordOrdinal")
  public Integer getLastRecordOrdinal() {
    return lastRecordOrdinal;
  }
  
  public void setLastRecordOrdinal(Integer lastRecordOrdinal) {
    this.lastRecordOrdinal = lastRecordOrdinal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogGetResponse auditLogGetResponse = (AuditLogGetResponse) o;
    return Objects.equals(this.totalLogRecords, auditLogGetResponse.totalLogRecords) &&
        Objects.equals(this.logRecords, auditLogGetResponse.logRecords) &&
        Objects.equals(this.firstRecordOrdinal, auditLogGetResponse.firstRecordOrdinal) &&
        Objects.equals(this.lastRecordOrdinal, auditLogGetResponse.lastRecordOrdinal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalLogRecords, logRecords, firstRecordOrdinal, lastRecordOrdinal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogGetResponse {\n");
    
    sb.append("    totalLogRecords: ").append(toIndentedString(totalLogRecords)).append("\n");
    sb.append("    logRecords: ").append(toIndentedString(logRecords)).append("\n");
    sb.append("    firstRecordOrdinal: ").append(toIndentedString(firstRecordOrdinal)).append("\n");
    sb.append("    lastRecordOrdinal: ").append(toIndentedString(lastRecordOrdinal)).append("\n");
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

