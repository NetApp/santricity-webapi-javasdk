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
 * Audit log record.
 */
@ApiModel(description = "Audit log record.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AuditLogRecord   {
  
    private String method;

    private String accessedUrl;

    private String clientIp;

    private String userId;

    private Integer httpStatus;

    private String httpReasonPhrase;

    private Boolean isFederated;

    private String loggingAgent;

    private String cliCommandExecuted;

    private String cliReturnStatus;

    private String symbolProcedure;


  /**
   * SSH login event type.
   */
  public enum SshEventTypeEnum {
    login("login"),
    logout("logout"),
    login_fail("login_fail");
;
    private String value;

    SshEventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SshEventTypeEnum sshEventType;

    private Integer sshSessionPid;

    private Integer sshSessionDuration;

    private Long timestamp;

    private Integer recordOrdinal;

  
  /**
   * HTTP method, for example GET and POST.
   **/
  public AuditLogRecord method(String method) {
    this.method = method;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "HTTP method, for example GET and POST.")
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }
  
  public void setMethod(String method) {
    this.method = method;
  }

  
  /**
   * Accessed URL.
   **/
  public AuditLogRecord accessedUrl(String accessedUrl) {
    this.accessedUrl = accessedUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Accessed URL.")
  @JsonProperty("accessedUrl")
  public String getAccessedUrl() {
    return accessedUrl;
  }
  
  public void setAccessedUrl(String accessedUrl) {
    this.accessedUrl = accessedUrl;
  }

  
  /**
   * IP address of client.
   **/
  public AuditLogRecord clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IP address of client.")
  @JsonProperty("clientIp")
  public String getClientIp() {
    return clientIp;
  }
  
  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  
  /**
   * Username of the user accessing the URL.
   **/
  public AuditLogRecord userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Username of the user accessing the URL.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * HTTP status code of the operation.
   **/
  public AuditLogRecord httpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "HTTP status code of the operation.")
  @JsonProperty("httpStatus")
  public Integer getHttpStatus() {
    return httpStatus;
  }
  
  public void setHttpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
  }

  
  /**
   * HTTP reason phrase.
   **/
  public AuditLogRecord httpReasonPhrase(String httpReasonPhrase) {
    this.httpReasonPhrase = httpReasonPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "HTTP reason phrase.")
  @JsonProperty("httpReasonPhrase")
  public String getHttpReasonPhrase() {
    return httpReasonPhrase;
  }
  
  public void setHttpReasonPhrase(String httpReasonPhrase) {
    this.httpReasonPhrase = httpReasonPhrase;
  }

  
  /**
   * Indicates if the user was authenticated by WSP in a federated security environment.
   **/
  public AuditLogRecord isFederated(Boolean isFederated) {
    this.isFederated = isFederated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if the user was authenticated by WSP in a federated security environment.")
  @JsonProperty("isFederated")
  public Boolean getIsFederated() {
    return isFederated;
  }
  
  public void setIsFederated(Boolean isFederated) {
    this.isFederated = isFederated;
  }

  
  /**
   * Logging agent.
   **/
  public AuditLogRecord loggingAgent(String loggingAgent) {
    this.loggingAgent = loggingAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Logging agent.")
  @JsonProperty("loggingAgent")
  public String getLoggingAgent() {
    return loggingAgent;
  }
  
  public void setLoggingAgent(String loggingAgent) {
    this.loggingAgent = loggingAgent;
  }

  
  /**
   * CLI command executed.
   **/
  public AuditLogRecord cliCommandExecuted(String cliCommandExecuted) {
    this.cliCommandExecuted = cliCommandExecuted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CLI command executed.")
  @JsonProperty("cliCommandExecuted")
  public String getCliCommandExecuted() {
    return cliCommandExecuted;
  }
  
  public void setCliCommandExecuted(String cliCommandExecuted) {
    this.cliCommandExecuted = cliCommandExecuted;
  }

  
  /**
   * CLI status code or request for input files.
   **/
  public AuditLogRecord cliReturnStatus(String cliReturnStatus) {
    this.cliReturnStatus = cliReturnStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CLI status code or request for input files.")
  @JsonProperty("cliReturnStatus")
  public String getCliReturnStatus() {
    return cliReturnStatus;
  }
  
  public void setCliReturnStatus(String cliReturnStatus) {
    this.cliReturnStatus = cliReturnStatus;
  }

  
  /**
   * Symbol procedure.
   **/
  public AuditLogRecord symbolProcedure(String symbolProcedure) {
    this.symbolProcedure = symbolProcedure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Symbol procedure.")
  @JsonProperty("symbolProcedure")
  public String getSymbolProcedure() {
    return symbolProcedure;
  }
  
  public void setSymbolProcedure(String symbolProcedure) {
    this.symbolProcedure = symbolProcedure;
  }

  
  /**
   * SSH login event type.
   **/
  public AuditLogRecord sshEventType(SshEventTypeEnum sshEventType) {
    this.sshEventType = sshEventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SSH login event type.")
  @JsonProperty("sshEventType")
  public SshEventTypeEnum getSshEventType() {
    return sshEventType;
  }
  
  public void setSshEventType(SshEventTypeEnum sshEventType) {
    this.sshEventType = sshEventType;
  }

  
  /**
   * SSH session process ID.
   **/
  public AuditLogRecord sshSessionPid(Integer sshSessionPid) {
    this.sshSessionPid = sshSessionPid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SSH session process ID.")
  @JsonProperty("sshSessionPid")
  public Integer getSshSessionPid() {
    return sshSessionPid;
  }
  
  public void setSshSessionPid(Integer sshSessionPid) {
    this.sshSessionPid = sshSessionPid;
  }

  
  /**
   * SSH session duration (in seconds).
   **/
  public AuditLogRecord sshSessionDuration(Integer sshSessionDuration) {
    this.sshSessionDuration = sshSessionDuration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SSH session duration (in seconds).")
  @JsonProperty("sshSessionDuration")
  public Integer getSshSessionDuration() {
    return sshSessionDuration;
  }
  
  public void setSshSessionDuration(Integer sshSessionDuration) {
    this.sshSessionDuration = sshSessionDuration;
  }

  
  /**
   * Date and time of accessed URL in seconds since midnight GMT on January 1, 1970.
   **/
  public AuditLogRecord timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date and time of accessed URL in seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * Record ordinal.
   **/
  public AuditLogRecord recordOrdinal(Integer recordOrdinal) {
    this.recordOrdinal = recordOrdinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Record ordinal.")
  @JsonProperty("recordOrdinal")
  public Integer getRecordOrdinal() {
    return recordOrdinal;
  }
  
  public void setRecordOrdinal(Integer recordOrdinal) {
    this.recordOrdinal = recordOrdinal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogRecord auditLogRecord = (AuditLogRecord) o;
    return Objects.equals(this.method, auditLogRecord.method) &&
        Objects.equals(this.accessedUrl, auditLogRecord.accessedUrl) &&
        Objects.equals(this.clientIp, auditLogRecord.clientIp) &&
        Objects.equals(this.userId, auditLogRecord.userId) &&
        Objects.equals(this.httpStatus, auditLogRecord.httpStatus) &&
        Objects.equals(this.httpReasonPhrase, auditLogRecord.httpReasonPhrase) &&
        Objects.equals(this.isFederated, auditLogRecord.isFederated) &&
        Objects.equals(this.loggingAgent, auditLogRecord.loggingAgent) &&
        Objects.equals(this.cliCommandExecuted, auditLogRecord.cliCommandExecuted) &&
        Objects.equals(this.cliReturnStatus, auditLogRecord.cliReturnStatus) &&
        Objects.equals(this.symbolProcedure, auditLogRecord.symbolProcedure) &&
        Objects.equals(this.sshEventType, auditLogRecord.sshEventType) &&
        Objects.equals(this.sshSessionPid, auditLogRecord.sshSessionPid) &&
        Objects.equals(this.sshSessionDuration, auditLogRecord.sshSessionDuration) &&
        Objects.equals(this.timestamp, auditLogRecord.timestamp) &&
        Objects.equals(this.recordOrdinal, auditLogRecord.recordOrdinal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, accessedUrl, clientIp, userId, httpStatus, httpReasonPhrase, isFederated, loggingAgent, cliCommandExecuted, cliReturnStatus, symbolProcedure, sshEventType, sshSessionPid, sshSessionDuration, timestamp, recordOrdinal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogRecord {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    accessedUrl: ").append(toIndentedString(accessedUrl)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    httpReasonPhrase: ").append(toIndentedString(httpReasonPhrase)).append("\n");
    sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
    sb.append("    loggingAgent: ").append(toIndentedString(loggingAgent)).append("\n");
    sb.append("    cliCommandExecuted: ").append(toIndentedString(cliCommandExecuted)).append("\n");
    sb.append("    cliReturnStatus: ").append(toIndentedString(cliReturnStatus)).append("\n");
    sb.append("    symbolProcedure: ").append(toIndentedString(symbolProcedure)).append("\n");
    sb.append("    sshEventType: ").append(toIndentedString(sshEventType)).append("\n");
    sb.append("    sshSessionPid: ").append(toIndentedString(sshSessionPid)).append("\n");
    sb.append("    sshSessionDuration: ").append(toIndentedString(sshSessionDuration)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    recordOrdinal: ").append(toIndentedString(recordOrdinal)).append("\n");
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

