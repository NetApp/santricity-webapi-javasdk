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
 * API response object that includes basic information about asup.
 */
@ApiModel(description = "API response object that includes basic information about asup.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AsupResponse   {
  
    private Boolean enabled;

    private Integer scheduleType;

    private List<Integer> weekdays;

    private List<Integer> months;

    private List<Integer> scheduledDays;

    private Integer deliveryType;

    private String destinationHttpAddr;

    private String destinationSmtpAddr;

    private Integer httpDeliveryType;

    private String proxyHostAddr;

    private String proxyHostPort;

    private Boolean authRequired;

    private String authUserName;

    private String authPassword;

    private String proxyScript;

    private String mailServer;

    private String mailSenderAddr;

    private String mailReplyAddr;

    private String log;

    private Long sequence;

    private Boolean _default;

  
  /**
   * AutoSupport is enabled or disabled
   **/
  public AsupResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "AutoSupport is enabled or disabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The schedule frequency = ['0' is a daily schedule, '1' is a weekly schedule, '2' is a monthly schedule]
   **/
  public AsupResponse scheduleType(Integer scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule frequency = ['0' is a daily schedule, '1' is a weekly schedule, '2' is a monthly schedule]")
  @JsonProperty("scheduleType")
  public Integer getScheduleType() {
    return scheduleType;
  }
  
  public void setScheduleType(Integer scheduleType) {
    this.scheduleType = scheduleType;
  }

  
  /**
   * Days of the week
   **/
  public AsupResponse weekdays(List<Integer> weekdays) {
    this.weekdays = weekdays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Days of the week")
  @JsonProperty("weekdays")
  public List<Integer> getWeekdays() {
    return weekdays;
  }
  
  public void setWeekdays(List<Integer> weekdays) {
    this.weekdays = weekdays;
  }

  
  /**
   * Months
   **/
  public AsupResponse months(List<Integer> months) {
    this.months = months;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Months")
  @JsonProperty("months")
  public List<Integer> getMonths() {
    return months;
  }
  
  public void setMonths(List<Integer> months) {
    this.months = months;
  }

  
  /**
   * Days of the month
   **/
  public AsupResponse scheduledDays(List<Integer> scheduledDays) {
    this.scheduledDays = scheduledDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Days of the month")
  @JsonProperty("scheduledDays")
  public List<Integer> getScheduledDays() {
    return scheduledDays;
  }
  
  public void setScheduledDays(List<Integer> scheduledDays) {
    this.scheduledDays = scheduledDays;
  }

  
  /**
   * The Delivery method = ['0' is unknown, '1' is https (default), '2' is http, '3' is smtp]
   **/
  public AsupResponse deliveryType(Integer deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Delivery method = ['0' is unknown, '1' is https (default), '2' is http, '3' is smtp]")
  @JsonProperty("deliveryType")
  public Integer getDeliveryType() {
    return deliveryType;
  }
  
  public void setDeliveryType(Integer deliveryType) {
    this.deliveryType = deliveryType;
  }

  
  /**
   * Destination HTTP address
   **/
  public AsupResponse destinationHttpAddr(String destinationHttpAddr) {
    this.destinationHttpAddr = destinationHttpAddr;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Destination HTTP address")
  @JsonProperty("destinationHttpAddr")
  public String getDestinationHttpAddr() {
    return destinationHttpAddr;
  }
  
  public void setDestinationHttpAddr(String destinationHttpAddr) {
    this.destinationHttpAddr = destinationHttpAddr;
  }

  
  /**
   * Destination SMTP address
   **/
  public AsupResponse destinationSmtpAddr(String destinationSmtpAddr) {
    this.destinationSmtpAddr = destinationSmtpAddr;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Destination SMTP address")
  @JsonProperty("destinationSmtpAddr")
  public String getDestinationSmtpAddr() {
    return destinationSmtpAddr;
  }
  
  public void setDestinationSmtpAddr(String destinationSmtpAddr) {
    this.destinationSmtpAddr = destinationSmtpAddr;
  }

  
  /**
   * Http delivery method = ['0' is a unknown, '1' is direct (default), '2' is proxy server, '3' is proxy configuration script]
   **/
  public AsupResponse httpDeliveryType(Integer httpDeliveryType) {
    this.httpDeliveryType = httpDeliveryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Http delivery method = ['0' is a unknown, '1' is direct (default), '2' is proxy server, '3' is proxy configuration script]")
  @JsonProperty("httpDeliveryType")
  public Integer getHttpDeliveryType() {
    return httpDeliveryType;
  }
  
  public void setHttpDeliveryType(Integer httpDeliveryType) {
    this.httpDeliveryType = httpDeliveryType;
  }

  
  /**
   * Proxy server address
   **/
  public AsupResponse proxyHostAddr(String proxyHostAddr) {
    this.proxyHostAddr = proxyHostAddr;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proxy server address")
  @JsonProperty("proxyHostAddr")
  public String getProxyHostAddr() {
    return proxyHostAddr;
  }
  
  public void setProxyHostAddr(String proxyHostAddr) {
    this.proxyHostAddr = proxyHostAddr;
  }

  
  /**
   * Proxy server port
   **/
  public AsupResponse proxyHostPort(String proxyHostPort) {
    this.proxyHostPort = proxyHostPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proxy server port")
  @JsonProperty("proxyHostPort")
  public String getProxyHostPort() {
    return proxyHostPort;
  }
  
  public void setProxyHostPort(String proxyHostPort) {
    this.proxyHostPort = proxyHostPort;
  }

  
  /**
   * Authentication required
   **/
  public AsupResponse authRequired(Boolean authRequired) {
    this.authRequired = authRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Authentication required")
  @JsonProperty("authRequired")
  public Boolean getAuthRequired() {
    return authRequired;
  }
  
  public void setAuthRequired(Boolean authRequired) {
    this.authRequired = authRequired;
  }

  
  /**
   * Authentication username
   **/
  public AsupResponse authUserName(String authUserName) {
    this.authUserName = authUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Authentication username")
  @JsonProperty("authUserName")
  public String getAuthUserName() {
    return authUserName;
  }
  
  public void setAuthUserName(String authUserName) {
    this.authUserName = authUserName;
  }

  
  /**
   * Authentication password
   **/
  public AsupResponse authPassword(String authPassword) {
    this.authPassword = authPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Authentication password")
  @JsonProperty("authPassword")
  public String getAuthPassword() {
    return authPassword;
  }
  
  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }

  
  /**
   * Proxy configuration script
   **/
  public AsupResponse proxyScript(String proxyScript) {
    this.proxyScript = proxyScript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proxy configuration script")
  @JsonProperty("proxyScript")
  public String getProxyScript() {
    return proxyScript;
  }
  
  public void setProxyScript(String proxyScript) {
    this.proxyScript = proxyScript;
  }

  
  /**
   * SMTP mail server
   **/
  public AsupResponse mailServer(String mailServer) {
    this.mailServer = mailServer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SMTP mail server")
  @JsonProperty("mailServer")
  public String getMailServer() {
    return mailServer;
  }
  
  public void setMailServer(String mailServer) {
    this.mailServer = mailServer;
  }

  
  /**
   * Sender email address
   **/
  public AsupResponse mailSenderAddr(String mailSenderAddr) {
    this.mailSenderAddr = mailSenderAddr;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sender email address")
  @JsonProperty("mailSenderAddr")
  public String getMailSenderAddr() {
    return mailSenderAddr;
  }
  
  public void setMailSenderAddr(String mailSenderAddr) {
    this.mailSenderAddr = mailSenderAddr;
  }

  
  /**
   * Reply email address
   **/
  public AsupResponse mailReplyAddr(String mailReplyAddr) {
    this.mailReplyAddr = mailReplyAddr;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reply email address")
  @JsonProperty("mailReplyAddr")
  public String getMailReplyAddr() {
    return mailReplyAddr;
  }
  
  public void setMailReplyAddr(String mailReplyAddr) {
    this.mailReplyAddr = mailReplyAddr;
  }

  
  /**
   * Log entries
   **/
  public AsupResponse log(String log) {
    this.log = log;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Log entries")
  @JsonProperty("log")
  public String getLog() {
    return log;
  }
  
  public void setLog(String log) {
    this.log = log;
  }

  
  /**
   * Bundle sequence number
   **/
  public AsupResponse sequence(Long sequence) {
    this.sequence = sequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bundle sequence number")
  @JsonProperty("sequence")
  public Long getSequence() {
    return sequence;
  }
  
  public void setSequence(Long sequence) {
    this.sequence = sequence;
  }

  
  /**
   **/
  public AsupResponse _default(Boolean _default) {
    this._default = _default;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }
  
  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsupResponse asupResponse = (AsupResponse) o;
    return Objects.equals(this.enabled, asupResponse.enabled) &&
        Objects.equals(this.scheduleType, asupResponse.scheduleType) &&
        Objects.equals(this.weekdays, asupResponse.weekdays) &&
        Objects.equals(this.months, asupResponse.months) &&
        Objects.equals(this.scheduledDays, asupResponse.scheduledDays) &&
        Objects.equals(this.deliveryType, asupResponse.deliveryType) &&
        Objects.equals(this.destinationHttpAddr, asupResponse.destinationHttpAddr) &&
        Objects.equals(this.destinationSmtpAddr, asupResponse.destinationSmtpAddr) &&
        Objects.equals(this.httpDeliveryType, asupResponse.httpDeliveryType) &&
        Objects.equals(this.proxyHostAddr, asupResponse.proxyHostAddr) &&
        Objects.equals(this.proxyHostPort, asupResponse.proxyHostPort) &&
        Objects.equals(this.authRequired, asupResponse.authRequired) &&
        Objects.equals(this.authUserName, asupResponse.authUserName) &&
        Objects.equals(this.authPassword, asupResponse.authPassword) &&
        Objects.equals(this.proxyScript, asupResponse.proxyScript) &&
        Objects.equals(this.mailServer, asupResponse.mailServer) &&
        Objects.equals(this.mailSenderAddr, asupResponse.mailSenderAddr) &&
        Objects.equals(this.mailReplyAddr, asupResponse.mailReplyAddr) &&
        Objects.equals(this.log, asupResponse.log) &&
        Objects.equals(this.sequence, asupResponse.sequence) &&
        Objects.equals(this._default, asupResponse._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, scheduleType, weekdays, months, scheduledDays, deliveryType, destinationHttpAddr, destinationSmtpAddr, httpDeliveryType, proxyHostAddr, proxyHostPort, authRequired, authUserName, authPassword, proxyScript, mailServer, mailSenderAddr, mailReplyAddr, log, sequence, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsupResponse {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    weekdays: ").append(toIndentedString(weekdays)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    scheduledDays: ").append(toIndentedString(scheduledDays)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    destinationHttpAddr: ").append(toIndentedString(destinationHttpAddr)).append("\n");
    sb.append("    destinationSmtpAddr: ").append(toIndentedString(destinationSmtpAddr)).append("\n");
    sb.append("    httpDeliveryType: ").append(toIndentedString(httpDeliveryType)).append("\n");
    sb.append("    proxyHostAddr: ").append(toIndentedString(proxyHostAddr)).append("\n");
    sb.append("    proxyHostPort: ").append(toIndentedString(proxyHostPort)).append("\n");
    sb.append("    authRequired: ").append(toIndentedString(authRequired)).append("\n");
    sb.append("    authUserName: ").append(toIndentedString(authUserName)).append("\n");
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    proxyScript: ").append(toIndentedString(proxyScript)).append("\n");
    sb.append("    mailServer: ").append(toIndentedString(mailServer)).append("\n");
    sb.append("    mailSenderAddr: ").append(toIndentedString(mailSenderAddr)).append("\n");
    sb.append("    mailReplyAddr: ").append(toIndentedString(mailReplyAddr)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

