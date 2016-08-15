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
 * A list of requested health check results
 */
@ApiModel(description = "A list of requested health check results")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class HealthCheckResponse   {
  
    private Long requestId;

    private Boolean healthCheckRunning;

    private Boolean cancelled;

    private Integer remaining;

    private List<FirmwareUpgradeHealthCheckResult> results;

    private Date start;

  
  /**
   * The unique request id
   **/
  public HealthCheckResponse requestId(Long requestId) {
    this.requestId = requestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique request id")
  @JsonProperty("requestId")
  public Long getRequestId() {
    return requestId;
  }
  
  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }

  
  /**
   * Indicates if a health check is currently running
   **/
  public HealthCheckResponse healthCheckRunning(Boolean healthCheckRunning) {
    this.healthCheckRunning = healthCheckRunning;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if a health check is currently running")
  @JsonProperty("healthCheckRunning")
  public Boolean getHealthCheckRunning() {
    return healthCheckRunning;
  }
  
  public void setHealthCheckRunning(Boolean healthCheckRunning) {
    this.healthCheckRunning = healthCheckRunning;
  }

  
  /**
   * The operation was cancelled while performing the pre-flight checks.
   **/
  public HealthCheckResponse cancelled(Boolean cancelled) {
    this.cancelled = cancelled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operation was cancelled while performing the pre-flight checks.")
  @JsonProperty("cancelled")
  public Boolean getCancelled() {
    return cancelled;
  }
  
  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  
  /**
   * Approximate number of devices that are still processing the health checks.
   **/
  public HealthCheckResponse remaining(Integer remaining) {
    this.remaining = remaining;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Approximate number of devices that are still processing the health checks.")
  @JsonProperty("remaining")
  public Integer getRemaining() {
    return remaining;
  }
  
  public void setRemaining(Integer remaining) {
    this.remaining = remaining;
  }

  
  /**
   **/
  public HealthCheckResponse results(List<FirmwareUpgradeHealthCheckResult> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("results")
  public List<FirmwareUpgradeHealthCheckResult> getResults() {
    return results;
  }
  
  public void setResults(List<FirmwareUpgradeHealthCheckResult> results) {
    this.results = results;
  }

  
  /**
   * The time that this operation was started.
   **/
  public HealthCheckResponse start(Date start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time that this operation was started.")
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }
  
  public void setStart(Date start) {
    this.start = start;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResponse healthCheckResponse = (HealthCheckResponse) o;
    return Objects.equals(this.requestId, healthCheckResponse.requestId) &&
        Objects.equals(this.healthCheckRunning, healthCheckResponse.healthCheckRunning) &&
        Objects.equals(this.cancelled, healthCheckResponse.cancelled) &&
        Objects.equals(this.remaining, healthCheckResponse.remaining) &&
        Objects.equals(this.results, healthCheckResponse.results) &&
        Objects.equals(this.start, healthCheckResponse.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, healthCheckRunning, cancelled, remaining, results, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    healthCheckRunning: ").append(toIndentedString(healthCheckRunning)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

