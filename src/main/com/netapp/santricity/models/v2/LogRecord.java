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
 * LogRecord
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class LogRecord   {
  
    private Level level;

    private Long sequenceNumber;

    private String sourceClassName;

    private String sourceMethodName;

    private String message;

    private Integer threadID;

    private Long millis;

    private Throwable thrown;

    private String loggerName;

    private String resourceBundleName;

    private List<Object> parameters;

    private ResourceBundle resourceBundle;

  
  /**
   **/
  public LogRecord level(Level level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("level")
  public Level getLevel() {
    return level;
  }
  
  public void setLevel(Level level) {
    this.level = level;
  }

  
  /**
   **/
  public LogRecord sequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sequenceNumber")
  public Long getSequenceNumber() {
    return sequenceNumber;
  }
  
  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  
  /**
   **/
  public LogRecord sourceClassName(String sourceClassName) {
    this.sourceClassName = sourceClassName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceClassName")
  public String getSourceClassName() {
    return sourceClassName;
  }
  
  public void setSourceClassName(String sourceClassName) {
    this.sourceClassName = sourceClassName;
  }

  
  /**
   **/
  public LogRecord sourceMethodName(String sourceMethodName) {
    this.sourceMethodName = sourceMethodName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceMethodName")
  public String getSourceMethodName() {
    return sourceMethodName;
  }
  
  public void setSourceMethodName(String sourceMethodName) {
    this.sourceMethodName = sourceMethodName;
  }

  
  /**
   **/
  public LogRecord message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  public LogRecord threadID(Integer threadID) {
    this.threadID = threadID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("threadID")
  public Integer getThreadID() {
    return threadID;
  }
  
  public void setThreadID(Integer threadID) {
    this.threadID = threadID;
  }

  
  /**
   **/
  public LogRecord millis(Long millis) {
    this.millis = millis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("millis")
  public Long getMillis() {
    return millis;
  }
  
  public void setMillis(Long millis) {
    this.millis = millis;
  }

  
  /**
   **/
  public LogRecord thrown(Throwable thrown) {
    this.thrown = thrown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thrown")
  public Throwable getThrown() {
    return thrown;
  }
  
  public void setThrown(Throwable thrown) {
    this.thrown = thrown;
  }

  
  /**
   **/
  public LogRecord loggerName(String loggerName) {
    this.loggerName = loggerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("loggerName")
  public String getLoggerName() {
    return loggerName;
  }
  
  public void setLoggerName(String loggerName) {
    this.loggerName = loggerName;
  }

  
  /**
   **/
  public LogRecord resourceBundleName(String resourceBundleName) {
    this.resourceBundleName = resourceBundleName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceBundleName")
  public String getResourceBundleName() {
    return resourceBundleName;
  }
  
  public void setResourceBundleName(String resourceBundleName) {
    this.resourceBundleName = resourceBundleName;
  }

  
  /**
   **/
  public LogRecord parameters(List<Object> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parameters")
  public List<Object> getParameters() {
    return parameters;
  }
  
  public void setParameters(List<Object> parameters) {
    this.parameters = parameters;
  }

  
  /**
   **/
  public LogRecord resourceBundle(ResourceBundle resourceBundle) {
    this.resourceBundle = resourceBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceBundle")
  public ResourceBundle getResourceBundle() {
    return resourceBundle;
  }
  
  public void setResourceBundle(ResourceBundle resourceBundle) {
    this.resourceBundle = resourceBundle;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogRecord logRecord = (LogRecord) o;
    return Objects.equals(this.level, logRecord.level) &&
        Objects.equals(this.sequenceNumber, logRecord.sequenceNumber) &&
        Objects.equals(this.sourceClassName, logRecord.sourceClassName) &&
        Objects.equals(this.sourceMethodName, logRecord.sourceMethodName) &&
        Objects.equals(this.message, logRecord.message) &&
        Objects.equals(this.threadID, logRecord.threadID) &&
        Objects.equals(this.millis, logRecord.millis) &&
        Objects.equals(this.thrown, logRecord.thrown) &&
        Objects.equals(this.loggerName, logRecord.loggerName) &&
        Objects.equals(this.resourceBundleName, logRecord.resourceBundleName) &&
        Objects.equals(this.parameters, logRecord.parameters) &&
        Objects.equals(this.resourceBundle, logRecord.resourceBundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, sequenceNumber, sourceClassName, sourceMethodName, message, threadID, millis, thrown, loggerName, resourceBundleName, parameters, resourceBundle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogRecord {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    sourceClassName: ").append(toIndentedString(sourceClassName)).append("\n");
    sb.append("    sourceMethodName: ").append(toIndentedString(sourceMethodName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    threadID: ").append(toIndentedString(threadID)).append("\n");
    sb.append("    millis: ").append(toIndentedString(millis)).append("\n");
    sb.append("    thrown: ").append(toIndentedString(thrown)).append("\n");
    sb.append("    loggerName: ").append(toIndentedString(loggerName)).append("\n");
    sb.append("    resourceBundleName: ").append(toIndentedString(resourceBundleName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    resourceBundle: ").append(toIndentedString(resourceBundle)).append("\n");
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

