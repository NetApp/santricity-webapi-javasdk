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
 * EventControl
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class EventControl   {
  

  /**
   * If this value if equal to EVENT_DEFAULT_PRIORITY then the management client should use the priority value from the MelEntry structure when filtering events for display, otherwise this value should be used.
   */
  public enum OemPriorityEnum {
    priorityDefault("priorityDefault"),
    priorityCritical("priorityCritical"),
    priorityInfo("priorityInfo"),
    priorityEmergency("priorityEmergency"),
    priorityAlert("priorityAlert"),
    priorityError("priorityError"),
    priorityWarning("priorityWarning"),
    priorityNotice("priorityNotice"),
    priorityDebug("priorityDebug"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    OemPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private OemPriorityEnum oemPriority;

    private Boolean defaultNeedsAttention;

    private Boolean defaultSendAlert;

    private Boolean defaultVisibility;


  /**
   * If this value is equal to EVENT_CONTROL_ACCEPT_DEFAULT then the value of defaultNeedsAttention determines whether Needs Attention is set on the array. Otherwise, this field determines whether Needs Attention is set on the array.
   */
  public enum OemNeedsAttentionEnum {
    unknown("unknown"),
    acceptDefault("acceptDefault"),
    overrideToTrue("overrideToTrue"),
    overrideToFalse("overrideToFalse"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    OemNeedsAttentionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private OemNeedsAttentionEnum oemNeedsAttention;


  /**
   * If this value is equal to EVENT_CONTROL_ACCEPT_DEFAULT then the value of defaultSendAlert determines whether an alert will be sent. Otherwise this field determines whether an alert will be sent.
   */
  public enum OemSendAlertEnum {
    unknown("unknown"),
    acceptDefault("acceptDefault"),
    overrideToTrue("overrideToTrue"),
    overrideToFalse("overrideToFalse"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    OemSendAlertEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private OemSendAlertEnum oemSendAlert;


  /**
   * If this value is equal to EVENT_CONTROL_ACCEPT_DEFAULT then the value of defaultVisibility determines whether the event will be displayed. Otherwise, this field determines whether the event will be displayed.
   */
  public enum OemVisibilityEnum {
    unknown("unknown"),
    acceptDefault("acceptDefault"),
    overrideToTrue("overrideToTrue"),
    overrideToFalse("overrideToFalse"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    OemVisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private OemVisibilityEnum oemVisibility;

    private Boolean collectSupportBundle;

    private Boolean priorityCaseCreationTrigger;

  
  /**
   * If this value if equal to EVENT_DEFAULT_PRIORITY then the management client should use the priority value from the MelEntry structure when filtering events for display, otherwise this value should be used.
   **/
  public EventControl oemPriority(OemPriorityEnum oemPriority) {
    this.oemPriority = oemPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If this value if equal to EVENT_DEFAULT_PRIORITY then the management client should use the priority value from the MelEntry structure when filtering events for display, otherwise this value should be used.")
  @JsonProperty("oemPriority")
  public OemPriorityEnum getOemPriority() {
    return oemPriority;
  }
  
  public void setOemPriority(OemPriorityEnum oemPriority) {
    this.oemPriority = oemPriority;
  }

  
  /**
   * This is the default value for needs attention. Its value can be overridden by oemNeedsAttention.
   **/
  public EventControl defaultNeedsAttention(Boolean defaultNeedsAttention) {
    this.defaultNeedsAttention = defaultNeedsAttention;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the default value for needs attention. Its value can be overridden by oemNeedsAttention.")
  @JsonProperty("defaultNeedsAttention")
  public Boolean getDefaultNeedsAttention() {
    return defaultNeedsAttention;
  }
  
  public void setDefaultNeedsAttention(Boolean defaultNeedsAttention) {
    this.defaultNeedsAttention = defaultNeedsAttention;
  }

  
  /**
   * This is the default value for sending an alert. Its value can be overridden by oemSendAlert.
   **/
  public EventControl defaultSendAlert(Boolean defaultSendAlert) {
    this.defaultSendAlert = defaultSendAlert;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the default value for sending an alert. Its value can be overridden by oemSendAlert.")
  @JsonProperty("defaultSendAlert")
  public Boolean getDefaultSendAlert() {
    return defaultSendAlert;
  }
  
  public void setDefaultSendAlert(Boolean defaultSendAlert) {
    this.defaultSendAlert = defaultSendAlert;
  }

  
  /**
   * This is the default value for visibility. Its value can be overridden by oemVisibility.
   **/
  public EventControl defaultVisibility(Boolean defaultVisibility) {
    this.defaultVisibility = defaultVisibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the default value for visibility. Its value can be overridden by oemVisibility.")
  @JsonProperty("defaultVisibility")
  public Boolean getDefaultVisibility() {
    return defaultVisibility;
  }
  
  public void setDefaultVisibility(Boolean defaultVisibility) {
    this.defaultVisibility = defaultVisibility;
  }

  
  /**
   * If this value is equal to EVENT_CONTROL_ACCEPT_DEFAULT then the value of defaultNeedsAttention determines whether Needs Attention is set on the array. Otherwise, this field determines whether Needs Attention is set on the array.
   **/
  public EventControl oemNeedsAttention(OemNeedsAttentionEnum oemNeedsAttention) {
    this.oemNeedsAttention = oemNeedsAttention;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If this value is equal to EVENT_CONTROL_ACCEPT_DEFAULT then the value of defaultNeedsAttention determines whether Needs Attention is set on the array. Otherwise, this field determines whether Needs Attention is set on the array.")
  @JsonProperty("oemNeedsAttention")
  public OemNeedsAttentionEnum getOemNeedsAttention() {
    return oemNeedsAttention;
  }
  
  public void setOemNeedsAttention(OemNeedsAttentionEnum oemNeedsAttention) {
    this.oemNeedsAttention = oemNeedsAttention;
  }

  
  /**
   * If this value is equal to EVENT_CONTROL_ACCEPT_DEFAULT then the value of defaultSendAlert determines whether an alert will be sent. Otherwise this field determines whether an alert will be sent.
   **/
  public EventControl oemSendAlert(OemSendAlertEnum oemSendAlert) {
    this.oemSendAlert = oemSendAlert;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If this value is equal to EVENT_CONTROL_ACCEPT_DEFAULT then the value of defaultSendAlert determines whether an alert will be sent. Otherwise this field determines whether an alert will be sent.")
  @JsonProperty("oemSendAlert")
  public OemSendAlertEnum getOemSendAlert() {
    return oemSendAlert;
  }
  
  public void setOemSendAlert(OemSendAlertEnum oemSendAlert) {
    this.oemSendAlert = oemSendAlert;
  }

  
  /**
   * If this value is equal to EVENT_CONTROL_ACCEPT_DEFAULT then the value of defaultVisibility determines whether the event will be displayed. Otherwise, this field determines whether the event will be displayed.
   **/
  public EventControl oemVisibility(OemVisibilityEnum oemVisibility) {
    this.oemVisibility = oemVisibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If this value is equal to EVENT_CONTROL_ACCEPT_DEFAULT then the value of defaultVisibility determines whether the event will be displayed. Otherwise, this field determines whether the event will be displayed.")
  @JsonProperty("oemVisibility")
  public OemVisibilityEnum getOemVisibility() {
    return oemVisibility;
  }
  
  public void setOemVisibility(OemVisibilityEnum oemVisibility) {
    this.oemVisibility = oemVisibility;
  }

  
  /**
   * If this value is true, a support bundle will be collected.
   **/
  public EventControl collectSupportBundle(Boolean collectSupportBundle) {
    this.collectSupportBundle = collectSupportBundle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If this value is true, a support bundle will be collected.")
  @JsonProperty("collectSupportBundle")
  public Boolean getCollectSupportBundle() {
    return collectSupportBundle;
  }
  
  public void setCollectSupportBundle(Boolean collectSupportBundle) {
    this.collectSupportBundle = collectSupportBundle;
  }

  
  /**
   * This flag indicates whether or not this MEL event should be marked as the reason a customer case was automatically created. It's possible that multiple MEL events could be present in the MEL log that would trigger case creation. But the first MEL event in the log that has this flag set will be tagged as the event that caused the case to be created.
   **/
  public EventControl priorityCaseCreationTrigger(Boolean priorityCaseCreationTrigger) {
    this.priorityCaseCreationTrigger = priorityCaseCreationTrigger;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This flag indicates whether or not this MEL event should be marked as the reason a customer case was automatically created. It's possible that multiple MEL events could be present in the MEL log that would trigger case creation. But the first MEL event in the log that has this flag set will be tagged as the event that caused the case to be created.")
  @JsonProperty("priorityCaseCreationTrigger")
  public Boolean getPriorityCaseCreationTrigger() {
    return priorityCaseCreationTrigger;
  }
  
  public void setPriorityCaseCreationTrigger(Boolean priorityCaseCreationTrigger) {
    this.priorityCaseCreationTrigger = priorityCaseCreationTrigger;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventControl eventControl = (EventControl) o;
    return Objects.equals(this.oemPriority, eventControl.oemPriority) &&
        Objects.equals(this.defaultNeedsAttention, eventControl.defaultNeedsAttention) &&
        Objects.equals(this.defaultSendAlert, eventControl.defaultSendAlert) &&
        Objects.equals(this.defaultVisibility, eventControl.defaultVisibility) &&
        Objects.equals(this.oemNeedsAttention, eventControl.oemNeedsAttention) &&
        Objects.equals(this.oemSendAlert, eventControl.oemSendAlert) &&
        Objects.equals(this.oemVisibility, eventControl.oemVisibility) &&
        Objects.equals(this.collectSupportBundle, eventControl.collectSupportBundle) &&
        Objects.equals(this.priorityCaseCreationTrigger, eventControl.priorityCaseCreationTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oemPriority, defaultNeedsAttention, defaultSendAlert, defaultVisibility, oemNeedsAttention, oemSendAlert, oemVisibility, collectSupportBundle, priorityCaseCreationTrigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventControl {\n");
    
    sb.append("    oemPriority: ").append(toIndentedString(oemPriority)).append("\n");
    sb.append("    defaultNeedsAttention: ").append(toIndentedString(defaultNeedsAttention)).append("\n");
    sb.append("    defaultSendAlert: ").append(toIndentedString(defaultSendAlert)).append("\n");
    sb.append("    defaultVisibility: ").append(toIndentedString(defaultVisibility)).append("\n");
    sb.append("    oemNeedsAttention: ").append(toIndentedString(oemNeedsAttention)).append("\n");
    sb.append("    oemSendAlert: ").append(toIndentedString(oemSendAlert)).append("\n");
    sb.append("    oemVisibility: ").append(toIndentedString(oemVisibility)).append("\n");
    sb.append("    collectSupportBundle: ").append(toIndentedString(collectSupportBundle)).append("\n");
    sb.append("    priorityCaseCreationTrigger: ").append(toIndentedString(priorityCaseCreationTrigger)).append("\n");
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

