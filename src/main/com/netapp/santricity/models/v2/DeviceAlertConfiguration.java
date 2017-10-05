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
 * API object that includes information about the Alert configuration for the system.
 */
@ApiModel(description = "API object that includes information about the Alert configuration for the system.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class DeviceAlertConfiguration   {
  
    private Boolean alertingEnabled;

    private String emailServerAddress;

    private String emailSenderAddress;

    private Boolean sendAdditionalContactInformation;

    private String additionalContactInformation;

    private List<String> recipientEmailAddresses;

  
  /**
   * Alerting is enabled
   **/
  public DeviceAlertConfiguration alertingEnabled(Boolean alertingEnabled) {
    this.alertingEnabled = alertingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Alerting is enabled")
  @JsonProperty("alertingEnabled")
  public Boolean getAlertingEnabled() {
    return alertingEnabled;
  }
  
  public void setAlertingEnabled(Boolean alertingEnabled) {
    this.alertingEnabled = alertingEnabled;
  }

  
  /**
   * The Alert email server address
   **/
  public DeviceAlertConfiguration emailServerAddress(String emailServerAddress) {
    this.emailServerAddress = emailServerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Alert email server address")
  @JsonProperty("emailServerAddress")
  public String getEmailServerAddress() {
    return emailServerAddress;
  }
  
  public void setEmailServerAddress(String emailServerAddress) {
    this.emailServerAddress = emailServerAddress;
  }

  
  /**
   * The Alert email senders address
   **/
  public DeviceAlertConfiguration emailSenderAddress(String emailSenderAddress) {
    this.emailSenderAddress = emailSenderAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Alert email senders address")
  @JsonProperty("emailSenderAddress")
  public String getEmailSenderAddress() {
    return emailSenderAddress;
  }
  
  public void setEmailSenderAddress(String emailSenderAddress) {
    this.emailSenderAddress = emailSenderAddress;
  }

  
  /**
   * Flag to send additional contact information with emails
   **/
  public DeviceAlertConfiguration sendAdditionalContactInformation(Boolean sendAdditionalContactInformation) {
    this.sendAdditionalContactInformation = sendAdditionalContactInformation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Flag to send additional contact information with emails")
  @JsonProperty("sendAdditionalContactInformation")
  public Boolean getSendAdditionalContactInformation() {
    return sendAdditionalContactInformation;
  }
  
  public void setSendAdditionalContactInformation(Boolean sendAdditionalContactInformation) {
    this.sendAdditionalContactInformation = sendAdditionalContactInformation;
  }

  
  /**
   * Alert email additional contact information
   **/
  public DeviceAlertConfiguration additionalContactInformation(String additionalContactInformation) {
    this.additionalContactInformation = additionalContactInformation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Alert email additional contact information")
  @JsonProperty("additionalContactInformation")
  public String getAdditionalContactInformation() {
    return additionalContactInformation;
  }
  
  public void setAdditionalContactInformation(String additionalContactInformation) {
    this.additionalContactInformation = additionalContactInformation;
  }

  
  /**
   * Alert email recipient addresses
   **/
  public DeviceAlertConfiguration recipientEmailAddresses(List<String> recipientEmailAddresses) {
    this.recipientEmailAddresses = recipientEmailAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Alert email recipient addresses")
  @JsonProperty("recipientEmailAddresses")
  public List<String> getRecipientEmailAddresses() {
    return recipientEmailAddresses;
  }
  
  public void setRecipientEmailAddresses(List<String> recipientEmailAddresses) {
    this.recipientEmailAddresses = recipientEmailAddresses;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAlertConfiguration deviceAlertConfiguration = (DeviceAlertConfiguration) o;
    return Objects.equals(this.alertingEnabled, deviceAlertConfiguration.alertingEnabled) &&
        Objects.equals(this.emailServerAddress, deviceAlertConfiguration.emailServerAddress) &&
        Objects.equals(this.emailSenderAddress, deviceAlertConfiguration.emailSenderAddress) &&
        Objects.equals(this.sendAdditionalContactInformation, deviceAlertConfiguration.sendAdditionalContactInformation) &&
        Objects.equals(this.additionalContactInformation, deviceAlertConfiguration.additionalContactInformation) &&
        Objects.equals(this.recipientEmailAddresses, deviceAlertConfiguration.recipientEmailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertingEnabled, emailServerAddress, emailSenderAddress, sendAdditionalContactInformation, additionalContactInformation, recipientEmailAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAlertConfiguration {\n");
    
    sb.append("    alertingEnabled: ").append(toIndentedString(alertingEnabled)).append("\n");
    sb.append("    emailServerAddress: ").append(toIndentedString(emailServerAddress)).append("\n");
    sb.append("    emailSenderAddress: ").append(toIndentedString(emailSenderAddress)).append("\n");
    sb.append("    sendAdditionalContactInformation: ").append(toIndentedString(sendAdditionalContactInformation)).append("\n");
    sb.append("    additionalContactInformation: ").append(toIndentedString(additionalContactInformation)).append("\n");
    sb.append("    recipientEmailAddresses: ").append(toIndentedString(recipientEmailAddresses)).append("\n");
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

