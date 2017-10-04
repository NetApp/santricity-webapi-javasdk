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
 * API response object that includes data for the current discover process
 */
@ApiModel(description = "API response object that includes data for the current discover process")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class DiscoverResponse   {
  
    private Long requestId;

    private Integer currentCount;

    private Integer total;

    private Date lastStart;

    private Boolean discoverProcessRunning;

    private List<DiscoveredStorageSystem> storageSystems;

  
  /**
   * Unique request id
   **/
  public DiscoverResponse requestId(Long requestId) {
    this.requestId = requestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique request id")
  @JsonProperty("requestId")
  public Long getRequestId() {
    return requestId;
  }
  
  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }

  
  /**
   * The number of addresses checked
   **/
  public DiscoverResponse currentCount(Integer currentCount) {
    this.currentCount = currentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of addresses checked")
  @JsonProperty("currentCount")
  public Integer getCurrentCount() {
    return currentCount;
  }
  
  public void setCurrentCount(Integer currentCount) {
    this.currentCount = currentCount;
  }

  
  /**
   * total number of addresses to check
   **/
  public DiscoverResponse total(Integer total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "total number of addresses to check")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   * Time when the last discovery was started null if a process has never been started
   **/
  public DiscoverResponse lastStart(Date lastStart) {
    this.lastStart = lastStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time when the last discovery was started null if a process has never been started")
  @JsonProperty("lastStart")
  public Date getLastStart() {
    return lastStart;
  }
  
  public void setLastStart(Date lastStart) {
    this.lastStart = lastStart;
  }

  
  /**
   * Indicates if a discovery process is running
   **/
  public DiscoverResponse discoverProcessRunning(Boolean discoverProcessRunning) {
    this.discoverProcessRunning = discoverProcessRunning;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if a discovery process is running")
  @JsonProperty("discoverProcessRunning")
  public Boolean getDiscoverProcessRunning() {
    return discoverProcessRunning;
  }
  
  public void setDiscoverProcessRunning(Boolean discoverProcessRunning) {
    this.discoverProcessRunning = discoverProcessRunning;
  }

  
  /**
   * List of storage systems discovered so far
   **/
  public DiscoverResponse storageSystems(List<DiscoveredStorageSystem> storageSystems) {
    this.storageSystems = storageSystems;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of storage systems discovered so far")
  @JsonProperty("storageSystems")
  public List<DiscoveredStorageSystem> getStorageSystems() {
    return storageSystems;
  }
  
  public void setStorageSystems(List<DiscoveredStorageSystem> storageSystems) {
    this.storageSystems = storageSystems;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoverResponse discoverResponse = (DiscoverResponse) o;
    return Objects.equals(this.requestId, discoverResponse.requestId) &&
        Objects.equals(this.currentCount, discoverResponse.currentCount) &&
        Objects.equals(this.total, discoverResponse.total) &&
        Objects.equals(this.lastStart, discoverResponse.lastStart) &&
        Objects.equals(this.discoverProcessRunning, discoverResponse.discoverProcessRunning) &&
        Objects.equals(this.storageSystems, discoverResponse.storageSystems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, currentCount, total, lastStart, discoverProcessRunning, storageSystems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoverResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    lastStart: ").append(toIndentedString(lastStart)).append("\n");
    sb.append("    discoverProcessRunning: ").append(toIndentedString(discoverProcessRunning)).append("\n");
    sb.append("    storageSystems: ").append(toIndentedString(storageSystems)).append("\n");
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

