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
 * AuditLogConfiguration
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AuditLogConfiguration   {
  
    private Integer auditLogMaxRecords;


  /**
   * Log level.
   */
  public enum AuditLogLevelEnum {
    all("all"),
    writeOnly("writeOnly");
;
    private String value;

    AuditLogLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AuditLogLevelEnum auditLogLevel;


  /**
   * Full policy.
   */
  public enum AuditLogFullPolicyEnum {
    overWrite("overWrite"),
    preventSystemAccess("preventSystemAccess");
;
    private String value;

    AuditLogFullPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AuditLogFullPolicyEnum auditLogFullPolicy;

    private Integer auditLogWarningThresholdPct;

  
  /**
   * Maximum number of records.
   **/
  public AuditLogConfiguration auditLogMaxRecords(Integer auditLogMaxRecords) {
    this.auditLogMaxRecords = auditLogMaxRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum number of records.")
  @JsonProperty("auditLogMaxRecords")
  public Integer getAuditLogMaxRecords() {
    return auditLogMaxRecords;
  }
  
  public void setAuditLogMaxRecords(Integer auditLogMaxRecords) {
    this.auditLogMaxRecords = auditLogMaxRecords;
  }

  
  /**
   * Log level.
   **/
  public AuditLogConfiguration auditLogLevel(AuditLogLevelEnum auditLogLevel) {
    this.auditLogLevel = auditLogLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Log level.")
  @JsonProperty("auditLogLevel")
  public AuditLogLevelEnum getAuditLogLevel() {
    return auditLogLevel;
  }
  
  public void setAuditLogLevel(AuditLogLevelEnum auditLogLevel) {
    this.auditLogLevel = auditLogLevel;
  }

  
  /**
   * Full policy.
   **/
  public AuditLogConfiguration auditLogFullPolicy(AuditLogFullPolicyEnum auditLogFullPolicy) {
    this.auditLogFullPolicy = auditLogFullPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Full policy.")
  @JsonProperty("auditLogFullPolicy")
  public AuditLogFullPolicyEnum getAuditLogFullPolicy() {
    return auditLogFullPolicy;
  }
  
  public void setAuditLogFullPolicy(AuditLogFullPolicyEnum auditLogFullPolicy) {
    this.auditLogFullPolicy = auditLogFullPolicy;
  }

  
  /**
   * Warning threshold percentage.
   **/
  public AuditLogConfiguration auditLogWarningThresholdPct(Integer auditLogWarningThresholdPct) {
    this.auditLogWarningThresholdPct = auditLogWarningThresholdPct;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Warning threshold percentage.")
  @JsonProperty("auditLogWarningThresholdPct")
  public Integer getAuditLogWarningThresholdPct() {
    return auditLogWarningThresholdPct;
  }
  
  public void setAuditLogWarningThresholdPct(Integer auditLogWarningThresholdPct) {
    this.auditLogWarningThresholdPct = auditLogWarningThresholdPct;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogConfiguration auditLogConfiguration = (AuditLogConfiguration) o;
    return Objects.equals(this.auditLogMaxRecords, auditLogConfiguration.auditLogMaxRecords) &&
        Objects.equals(this.auditLogLevel, auditLogConfiguration.auditLogLevel) &&
        Objects.equals(this.auditLogFullPolicy, auditLogConfiguration.auditLogFullPolicy) &&
        Objects.equals(this.auditLogWarningThresholdPct, auditLogConfiguration.auditLogWarningThresholdPct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditLogMaxRecords, auditLogLevel, auditLogFullPolicy, auditLogWarningThresholdPct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogConfiguration {\n");
    
    sb.append("    auditLogMaxRecords: ").append(toIndentedString(auditLogMaxRecords)).append("\n");
    sb.append("    auditLogLevel: ").append(toIndentedString(auditLogLevel)).append("\n");
    sb.append("    auditLogFullPolicy: ").append(toIndentedString(auditLogFullPolicy)).append("\n");
    sb.append("    auditLogWarningThresholdPct: ").append(toIndentedString(auditLogWarningThresholdPct)).append("\n");
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

