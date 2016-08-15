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
 * LocalizedLogMessage
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class LocalizedLogMessage   {
  

  /**
   * Logger type of this message
   */
  public enum LoggerTypeEnum {
    cfwUpgradeLogger("cfwUpgradeLogger"),
    driveUpgradeLogger("driveUpgradeLogger"),
    iomServiceLogger("iomServiceLogger"),
    cfwUpgradeTimestamp("cfwUpgradeTimestamp"),
    driveUpgradeTimestamp("driveUpgradeTimestamp"),
    iomServiceTimestamp("iomServiceTimestamp");
;
    private String value;

    LoggerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LoggerTypeEnum loggerType;

    private Date timestamp;

    private String messageText;

    private String context;

    private Long recordId;

  
  /**
   * Logger type of this message
   **/
  public LocalizedLogMessage loggerType(LoggerTypeEnum loggerType) {
    this.loggerType = loggerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Logger type of this message")
  @JsonProperty("loggerType")
  public LoggerTypeEnum getLoggerType() {
    return loggerType;
  }
  
  public void setLoggerType(LoggerTypeEnum loggerType) {
    this.loggerType = loggerType;
  }

  
  /**
   * Timestamp for this log message
   **/
  public LocalizedLogMessage timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp for this log message")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * Localized message text
   **/
  public LocalizedLogMessage messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localized message text")
  @JsonProperty("messageText")
  public String getMessageText() {
    return messageText;
  }
  
  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  
  /**
   * Log message context
   **/
  public LocalizedLogMessage context(String context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Log message context")
  @JsonProperty("context")
  public String getContext() {
    return context;
  }
  
  public void setContext(String context) {
    this.context = context;
  }

  
  /**
   * ReplicatedRecord ID for this message
   **/
  public LocalizedLogMessage recordId(Long recordId) {
    this.recordId = recordId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ReplicatedRecord ID for this message")
  @JsonProperty("recordId")
  public Long getRecordId() {
    return recordId;
  }
  
  public void setRecordId(Long recordId) {
    this.recordId = recordId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalizedLogMessage localizedLogMessage = (LocalizedLogMessage) o;
    return Objects.equals(this.loggerType, localizedLogMessage.loggerType) &&
        Objects.equals(this.timestamp, localizedLogMessage.timestamp) &&
        Objects.equals(this.messageText, localizedLogMessage.messageText) &&
        Objects.equals(this.context, localizedLogMessage.context) &&
        Objects.equals(this.recordId, localizedLogMessage.recordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loggerType, timestamp, messageText, context, recordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizedLogMessage {\n");
    
    sb.append("    loggerType: ").append(toIndentedString(loggerType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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

