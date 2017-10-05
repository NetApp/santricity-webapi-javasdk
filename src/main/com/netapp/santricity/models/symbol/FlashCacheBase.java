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
 * FlashCacheBase
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class FlashCacheBase   {
  
    private String label;


  /**
   * The status of the flash cache.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    degraded("degraded"),
    failed("failed"),
    suspended("suspended"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;


  /**
   * The flash cache configuration type.
   */
  public enum ConfigTypeEnum {
    unknown("unknown"),
    filesystem("filesystem"),
    database("database"),
    multimedia("multimedia"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ConfigTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ConfigTypeEnum configType;


  /**
   * The flash cache analytics status.
   */
  public enum AnalyticsStatusEnum {
    unknown("unknown"),
    stopped("stopped"),
    started("started"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    AnalyticsStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AnalyticsStatusEnum analyticsStatus;


  /**
   * The flash cache analytics status cause.
   */
  public enum AnalyticsCauseEnum {
    none("none"),
    userStopped("userStopped"),
    userFcChanges("userFcChanges"),
    internalCtlrRebooted("internalCtlrRebooted"),
    internalCfgChanges("internalCfgChanges"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    AnalyticsCauseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AnalyticsCauseEnum analyticsCause;


  /**
   * The flash cache status cause.
   */
  public enum StatusCauseEnum {
    none("none"),
    hotspareInuse("hotspareInuse"),
    drivesInaccessible("drivesInaccessible"),
    cacheSizeMismatch("cacheSizeMismatch"),
    missingDrives("missingDrives"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusCauseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusCauseEnum statusCause;

  
  /**
   * The user-assigned label of the flash cache.
   **/
  public FlashCacheBase label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned label of the flash cache.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The status of the flash cache.
   **/
  public FlashCacheBase status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the flash cache.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The flash cache configuration type.
   **/
  public FlashCacheBase configType(ConfigTypeEnum configType) {
    this.configType = configType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flash cache configuration type.")
  @JsonProperty("configType")
  public ConfigTypeEnum getConfigType() {
    return configType;
  }
  
  public void setConfigType(ConfigTypeEnum configType) {
    this.configType = configType;
  }

  
  /**
   * The flash cache analytics status.
   **/
  public FlashCacheBase analyticsStatus(AnalyticsStatusEnum analyticsStatus) {
    this.analyticsStatus = analyticsStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flash cache analytics status.")
  @JsonProperty("analyticsStatus")
  public AnalyticsStatusEnum getAnalyticsStatus() {
    return analyticsStatus;
  }
  
  public void setAnalyticsStatus(AnalyticsStatusEnum analyticsStatus) {
    this.analyticsStatus = analyticsStatus;
  }

  
  /**
   * The flash cache analytics status cause.
   **/
  public FlashCacheBase analyticsCause(AnalyticsCauseEnum analyticsCause) {
    this.analyticsCause = analyticsCause;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flash cache analytics status cause.")
  @JsonProperty("analyticsCause")
  public AnalyticsCauseEnum getAnalyticsCause() {
    return analyticsCause;
  }
  
  public void setAnalyticsCause(AnalyticsCauseEnum analyticsCause) {
    this.analyticsCause = analyticsCause;
  }

  
  /**
   * The flash cache status cause.
   **/
  public FlashCacheBase statusCause(StatusCauseEnum statusCause) {
    this.statusCause = statusCause;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flash cache status cause.")
  @JsonProperty("statusCause")
  public StatusCauseEnum getStatusCause() {
    return statusCause;
  }
  
  public void setStatusCause(StatusCauseEnum statusCause) {
    this.statusCause = statusCause;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlashCacheBase flashCacheBase = (FlashCacheBase) o;
    return Objects.equals(this.label, flashCacheBase.label) &&
        Objects.equals(this.status, flashCacheBase.status) &&
        Objects.equals(this.configType, flashCacheBase.configType) &&
        Objects.equals(this.analyticsStatus, flashCacheBase.analyticsStatus) &&
        Objects.equals(this.analyticsCause, flashCacheBase.analyticsCause) &&
        Objects.equals(this.statusCause, flashCacheBase.statusCause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, status, configType, analyticsStatus, analyticsCause, statusCause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashCacheBase {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    analyticsStatus: ").append(toIndentedString(analyticsStatus)).append("\n");
    sb.append("    analyticsCause: ").append(toIndentedString(analyticsCause)).append("\n");
    sb.append("    statusCause: ").append(toIndentedString(statusCause)).append("\n");
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

