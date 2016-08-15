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
 * LoggerRecordResponse
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class LoggerRecordResponse   {
  

  /**
   * Type of log records returned
   */
  public enum RecordTypeEnum {
    cfwUpgradeLogger("cfwUpgradeLogger"),
    driveUpgradeLogger("driveUpgradeLogger"),
    iomServiceLogger("iomServiceLogger"),
    cfwUpgradeTimestamp("cfwUpgradeTimestamp"),
    driveUpgradeTimestamp("driveUpgradeTimestamp"),
    iomServiceTimestamp("iomServiceTimestamp");
;
    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RecordTypeEnum recordType;

    private List<LocalizedLogMessage> logRecords;

    private Map<String, Date> timeStamps;

  
  /**
   * Type of log records returned
   **/
  public LoggerRecordResponse recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of log records returned")
  @JsonProperty("recordType")
  public RecordTypeEnum getRecordType() {
    return recordType;
  }
  
  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }

  
  /**
   * A Map of log records requested
   **/
  public LoggerRecordResponse logRecords(List<LocalizedLogMessage> logRecords) {
    this.logRecords = logRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A Map of log records requested")
  @JsonProperty("logRecords")
  public List<LocalizedLogMessage> getLogRecords() {
    return logRecords;
  }
  
  public void setLogRecords(List<LocalizedLogMessage> logRecords) {
    this.logRecords = logRecords;
  }

  
  /**
   * A Map of timestamps for each logger type
   **/
  public LoggerRecordResponse timeStamps(Map<String, Date> timeStamps) {
    this.timeStamps = timeStamps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A Map of timestamps for each logger type")
  @JsonProperty("timeStamps")
  public Map<String, Date> getTimeStamps() {
    return timeStamps;
  }
  
  public void setTimeStamps(Map<String, Date> timeStamps) {
    this.timeStamps = timeStamps;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoggerRecordResponse loggerRecordResponse = (LoggerRecordResponse) o;
    return Objects.equals(this.recordType, loggerRecordResponse.recordType) &&
        Objects.equals(this.logRecords, loggerRecordResponse.logRecords) &&
        Objects.equals(this.timeStamps, loggerRecordResponse.timeStamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, logRecords, timeStamps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoggerRecordResponse {\n");
    
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    logRecords: ").append(toIndentedString(logRecords)).append("\n");
    sb.append("    timeStamps: ").append(toIndentedString(timeStamps)).append("\n");
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

