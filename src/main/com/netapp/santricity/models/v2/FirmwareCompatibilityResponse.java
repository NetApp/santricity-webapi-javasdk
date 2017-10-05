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
 * FirmwareCompatibilityResponse
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class FirmwareCompatibilityResponse   {
  
    private Boolean checkRunning;

    private Boolean cancelled;

    private Date lastStart;

    private List<String> inaccessibleStorageDevices;

    private List<FirmwareCompatibilitySet> results;

    private Long requestId;

    private List<String> failedStorageDevices;

  
  /**
   * True if the compatibility check is currently running
   **/
  public FirmwareCompatibilityResponse checkRunning(Boolean checkRunning) {
    this.checkRunning = checkRunning;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the compatibility check is currently running")
  @JsonProperty("checkRunning")
  public Boolean getCheckRunning() {
    return checkRunning;
  }
  
  public void setCheckRunning(Boolean checkRunning) {
    this.checkRunning = checkRunning;
  }

  
  /**
   * True if the check was cancelled by a user
   **/
  public FirmwareCompatibilityResponse cancelled(Boolean cancelled) {
    this.cancelled = cancelled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the check was cancelled by a user")
  @JsonProperty("cancelled")
  public Boolean getCancelled() {
    return cancelled;
  }
  
  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  
  /**
   * The last time that a compatibility check was started, null if it has not been initiated yet
   **/
  public FirmwareCompatibilityResponse lastStart(Date lastStart) {
    this.lastStart = lastStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The last time that a compatibility check was started, null if it has not been initiated yet")
  @JsonProperty("lastStart")
  public Date getLastStart() {
    return lastStart;
  }
  
  public void setLastStart(Date lastStart) {
    this.lastStart = lastStart;
  }

  
  /**
   * The list of devices that could not be contacted
   **/
  public FirmwareCompatibilityResponse inaccessibleStorageDevices(List<String> inaccessibleStorageDevices) {
    this.inaccessibleStorageDevices = inaccessibleStorageDevices;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of devices that could not be contacted")
  @JsonProperty("inaccessibleStorageDevices")
  public List<String> getInaccessibleStorageDevices() {
    return inaccessibleStorageDevices;
  }
  
  public void setInaccessibleStorageDevices(List<String> inaccessibleStorageDevices) {
    this.inaccessibleStorageDevices = inaccessibleStorageDevices;
  }

  
  /**
   * The list of results
   **/
  public FirmwareCompatibilityResponse results(List<FirmwareCompatibilitySet> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of results")
  @JsonProperty("results")
  public List<FirmwareCompatibilitySet> getResults() {
    return results;
  }
  
  public void setResults(List<FirmwareCompatibilitySet> results) {
    this.results = results;
  }

  
  /**
   * The unique identifier for this request
   **/
  public FirmwareCompatibilityResponse requestId(Long requestId) {
    this.requestId = requestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier for this request")
  @JsonProperty("requestId")
  public Long getRequestId() {
    return requestId;
  }
  
  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }

  
  /**
   * The list of devices that the call failed on
   **/
  public FirmwareCompatibilityResponse failedStorageDevices(List<String> failedStorageDevices) {
    this.failedStorageDevices = failedStorageDevices;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of devices that the call failed on")
  @JsonProperty("failedStorageDevices")
  public List<String> getFailedStorageDevices() {
    return failedStorageDevices;
  }
  
  public void setFailedStorageDevices(List<String> failedStorageDevices) {
    this.failedStorageDevices = failedStorageDevices;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareCompatibilityResponse firmwareCompatibilityResponse = (FirmwareCompatibilityResponse) o;
    return Objects.equals(this.checkRunning, firmwareCompatibilityResponse.checkRunning) &&
        Objects.equals(this.cancelled, firmwareCompatibilityResponse.cancelled) &&
        Objects.equals(this.lastStart, firmwareCompatibilityResponse.lastStart) &&
        Objects.equals(this.inaccessibleStorageDevices, firmwareCompatibilityResponse.inaccessibleStorageDevices) &&
        Objects.equals(this.results, firmwareCompatibilityResponse.results) &&
        Objects.equals(this.requestId, firmwareCompatibilityResponse.requestId) &&
        Objects.equals(this.failedStorageDevices, firmwareCompatibilityResponse.failedStorageDevices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkRunning, cancelled, lastStart, inaccessibleStorageDevices, results, requestId, failedStorageDevices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareCompatibilityResponse {\n");
    
    sb.append("    checkRunning: ").append(toIndentedString(checkRunning)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    lastStart: ").append(toIndentedString(lastStart)).append("\n");
    sb.append("    inaccessibleStorageDevices: ").append(toIndentedString(inaccessibleStorageDevices)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    failedStorageDevices: ").append(toIndentedString(failedStorageDevices)).append("\n");
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

