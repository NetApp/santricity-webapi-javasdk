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
 * CfwUpgradeResponse
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class CfwUpgradeResponse   {
  
    private Long requestId;

    private FirmwareUpgradeHealthCheckResult healthCheck;

    private Date startTime;

    private Date uploadStartTime;

    private Date activationStartTime;

    private Date uploadCompletionTime;

    private Integer uploadCompletionPercentage;

    private Date activationCompletionTime;

    private Boolean running;

  
  /**
   * A unique value that identifies the request for later retrieval.
   **/
  public CfwUpgradeResponse requestId(Long requestId) {
    this.requestId = requestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique value that identifies the request for later retrieval.")
  @JsonProperty("requestId")
  public Long getRequestId() {
    return requestId;
  }
  
  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }

  
  /**
   **/
  public CfwUpgradeResponse healthCheck(FirmwareUpgradeHealthCheckResult healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("healthCheck")
  public FirmwareUpgradeHealthCheckResult getHealthCheck() {
    return healthCheck;
  }
  
  public void setHealthCheck(FirmwareUpgradeHealthCheckResult healthCheck) {
    this.healthCheck = healthCheck;
  }

  
  /**
   **/
  public CfwUpgradeResponse startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   **/
  public CfwUpgradeResponse uploadStartTime(Date uploadStartTime) {
    this.uploadStartTime = uploadStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("uploadStartTime")
  public Date getUploadStartTime() {
    return uploadStartTime;
  }
  
  public void setUploadStartTime(Date uploadStartTime) {
    this.uploadStartTime = uploadStartTime;
  }

  
  /**
   **/
  public CfwUpgradeResponse activationStartTime(Date activationStartTime) {
    this.activationStartTime = activationStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("activationStartTime")
  public Date getActivationStartTime() {
    return activationStartTime;
  }
  
  public void setActivationStartTime(Date activationStartTime) {
    this.activationStartTime = activationStartTime;
  }

  
  /**
   **/
  public CfwUpgradeResponse uploadCompletionTime(Date uploadCompletionTime) {
    this.uploadCompletionTime = uploadCompletionTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("uploadCompletionTime")
  public Date getUploadCompletionTime() {
    return uploadCompletionTime;
  }
  
  public void setUploadCompletionTime(Date uploadCompletionTime) {
    this.uploadCompletionTime = uploadCompletionTime;
  }

  
  /**
   **/
  public CfwUpgradeResponse uploadCompletionPercentage(Integer uploadCompletionPercentage) {
    this.uploadCompletionPercentage = uploadCompletionPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("uploadCompletionPercentage")
  public Integer getUploadCompletionPercentage() {
    return uploadCompletionPercentage;
  }
  
  public void setUploadCompletionPercentage(Integer uploadCompletionPercentage) {
    this.uploadCompletionPercentage = uploadCompletionPercentage;
  }

  
  /**
   **/
  public CfwUpgradeResponse activationCompletionTime(Date activationCompletionTime) {
    this.activationCompletionTime = activationCompletionTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("activationCompletionTime")
  public Date getActivationCompletionTime() {
    return activationCompletionTime;
  }
  
  public void setActivationCompletionTime(Date activationCompletionTime) {
    this.activationCompletionTime = activationCompletionTime;
  }

  
  /**
   **/
  public CfwUpgradeResponse running(Boolean running) {
    this.running = running;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("running")
  public Boolean getRunning() {
    return running;
  }
  
  public void setRunning(Boolean running) {
    this.running = running;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CfwUpgradeResponse cfwUpgradeResponse = (CfwUpgradeResponse) o;
    return Objects.equals(this.requestId, cfwUpgradeResponse.requestId) &&
        Objects.equals(this.healthCheck, cfwUpgradeResponse.healthCheck) &&
        Objects.equals(this.startTime, cfwUpgradeResponse.startTime) &&
        Objects.equals(this.uploadStartTime, cfwUpgradeResponse.uploadStartTime) &&
        Objects.equals(this.activationStartTime, cfwUpgradeResponse.activationStartTime) &&
        Objects.equals(this.uploadCompletionTime, cfwUpgradeResponse.uploadCompletionTime) &&
        Objects.equals(this.uploadCompletionPercentage, cfwUpgradeResponse.uploadCompletionPercentage) &&
        Objects.equals(this.activationCompletionTime, cfwUpgradeResponse.activationCompletionTime) &&
        Objects.equals(this.running, cfwUpgradeResponse.running);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, healthCheck, startTime, uploadStartTime, activationStartTime, uploadCompletionTime, uploadCompletionPercentage, activationCompletionTime, running);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CfwUpgradeResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    uploadStartTime: ").append(toIndentedString(uploadStartTime)).append("\n");
    sb.append("    activationStartTime: ").append(toIndentedString(activationStartTime)).append("\n");
    sb.append("    uploadCompletionTime: ").append(toIndentedString(uploadCompletionTime)).append("\n");
    sb.append("    uploadCompletionPercentage: ").append(toIndentedString(uploadCompletionPercentage)).append("\n");
    sb.append("    activationCompletionTime: ").append(toIndentedString(activationCompletionTime)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
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

