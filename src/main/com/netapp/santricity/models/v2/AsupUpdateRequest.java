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
 * Used to update asup settings.
 */
@ApiModel(description = "Used to update asup settings.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AsupUpdateRequest   {
  
    private Boolean enable;

    private Integer scheduleTypeReq;

    private List<Integer> weekDaysReq;

    private List<Integer> monthsReq;

    private List<Integer> scheduledDaysReq;

    private Integer deliveryType;

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

  
  /**
   * Enable or disable AutoSupport
   **/
  public AsupUpdateRequest enable(Boolean enable) {
    this.enable = enable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Enable or disable AutoSupport")
  @JsonProperty("enable")
  public Boolean getEnable() {
    return enable;
  }
  
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  /**
   * The schedule type = ['0' is a daily schedule, '1' is a weekly schedule, '2' is a monthly schedule]
   **/
  public AsupUpdateRequest scheduleTypeReq(Integer scheduleTypeReq) {
    this.scheduleTypeReq = scheduleTypeReq;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule type = ['0' is a daily schedule, '1' is a weekly schedule, '2' is a monthly schedule]")
  @JsonProperty("scheduleTypeReq")
  public Integer getScheduleTypeReq() {
    return scheduleTypeReq;
  }
  
  public void setScheduleTypeReq(Integer scheduleTypeReq) {
    this.scheduleTypeReq = scheduleTypeReq;
  }

  
  /**
   * Days of the week
   **/
  public AsupUpdateRequest weekDaysReq(List<Integer> weekDaysReq) {
    this.weekDaysReq = weekDaysReq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Days of the week")
  @JsonProperty("weekDaysReq")
  public List<Integer> getWeekDaysReq() {
    return weekDaysReq;
  }
  
  public void setWeekDaysReq(List<Integer> weekDaysReq) {
    this.weekDaysReq = weekDaysReq;
  }

  
  /**
   * Months
   **/
  public AsupUpdateRequest monthsReq(List<Integer> monthsReq) {
    this.monthsReq = monthsReq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Months")
  @JsonProperty("monthsReq")
  public List<Integer> getMonthsReq() {
    return monthsReq;
  }
  
  public void setMonthsReq(List<Integer> monthsReq) {
    this.monthsReq = monthsReq;
  }

  
  /**
   * Days of the month
   **/
  public AsupUpdateRequest scheduledDaysReq(List<Integer> scheduledDaysReq) {
    this.scheduledDaysReq = scheduledDaysReq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Days of the month")
  @JsonProperty("scheduledDaysReq")
  public List<Integer> getScheduledDaysReq() {
    return scheduledDaysReq;
  }
  
  public void setScheduledDaysReq(List<Integer> scheduledDaysReq) {
    this.scheduledDaysReq = scheduledDaysReq;
  }

  
  /**
   * The Delivery method = ['0' is unknown, '1' is https (default), '2' is http, '3' is smtp]
   **/
  public AsupUpdateRequest deliveryType(Integer deliveryType) {
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
   * Http delivery method = ['0' is a unknown, '1' is direct (default), '2' is proxy server, '3' is proxy configuration script]
   **/
  public AsupUpdateRequest httpDeliveryType(Integer httpDeliveryType) {
    this.httpDeliveryType = httpDeliveryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Http delivery method = ['0' is a unknown, '1' is direct (default), '2' is proxy server, '3' is proxy configuration script]")
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
  public AsupUpdateRequest proxyHostAddr(String proxyHostAddr) {
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
  public AsupUpdateRequest proxyHostPort(String proxyHostPort) {
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
  public AsupUpdateRequest authRequired(Boolean authRequired) {
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
  public AsupUpdateRequest authUserName(String authUserName) {
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
  public AsupUpdateRequest authPassword(String authPassword) {
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
  public AsupUpdateRequest proxyScript(String proxyScript) {
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
  public AsupUpdateRequest mailServer(String mailServer) {
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
  public AsupUpdateRequest mailSenderAddr(String mailSenderAddr) {
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
  public AsupUpdateRequest mailReplyAddr(String mailReplyAddr) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsupUpdateRequest asupUpdateRequest = (AsupUpdateRequest) o;
    return Objects.equals(this.enable, asupUpdateRequest.enable) &&
        Objects.equals(this.scheduleTypeReq, asupUpdateRequest.scheduleTypeReq) &&
        Objects.equals(this.weekDaysReq, asupUpdateRequest.weekDaysReq) &&
        Objects.equals(this.monthsReq, asupUpdateRequest.monthsReq) &&
        Objects.equals(this.scheduledDaysReq, asupUpdateRequest.scheduledDaysReq) &&
        Objects.equals(this.deliveryType, asupUpdateRequest.deliveryType) &&
        Objects.equals(this.httpDeliveryType, asupUpdateRequest.httpDeliveryType) &&
        Objects.equals(this.proxyHostAddr, asupUpdateRequest.proxyHostAddr) &&
        Objects.equals(this.proxyHostPort, asupUpdateRequest.proxyHostPort) &&
        Objects.equals(this.authRequired, asupUpdateRequest.authRequired) &&
        Objects.equals(this.authUserName, asupUpdateRequest.authUserName) &&
        Objects.equals(this.authPassword, asupUpdateRequest.authPassword) &&
        Objects.equals(this.proxyScript, asupUpdateRequest.proxyScript) &&
        Objects.equals(this.mailServer, asupUpdateRequest.mailServer) &&
        Objects.equals(this.mailSenderAddr, asupUpdateRequest.mailSenderAddr) &&
        Objects.equals(this.mailReplyAddr, asupUpdateRequest.mailReplyAddr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, scheduleTypeReq, weekDaysReq, monthsReq, scheduledDaysReq, deliveryType, httpDeliveryType, proxyHostAddr, proxyHostPort, authRequired, authUserName, authPassword, proxyScript, mailServer, mailSenderAddr, mailReplyAddr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsupUpdateRequest {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    scheduleTypeReq: ").append(toIndentedString(scheduleTypeReq)).append("\n");
    sb.append("    weekDaysReq: ").append(toIndentedString(weekDaysReq)).append("\n");
    sb.append("    monthsReq: ").append(toIndentedString(monthsReq)).append("\n");
    sb.append("    scheduledDaysReq: ").append(toIndentedString(scheduledDaysReq)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
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

