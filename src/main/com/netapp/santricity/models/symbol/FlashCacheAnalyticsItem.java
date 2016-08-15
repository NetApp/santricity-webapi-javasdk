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
 * FlashCacheAnalyticsItem
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FlashCacheAnalyticsItem   {
  
    private Integer cacheSize;

    private Integer cacheHitPct;

    private Long totalBaseWrites;

    private Long totalBaseWriteLatency;

    private Long totalBaseReadLatency;

    private Long totalBaseReads;

    private Long totalFlashCacheReads;

    private Long totalFlashCacheReadLatency;

  
  /**
   * The cache size in Gigabytes.
   **/
  public FlashCacheAnalyticsItem cacheSize(Integer cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cache size in Gigabytes.")
  @JsonProperty("cacheSize")
  public Integer getCacheSize() {
    return cacheSize;
  }
  
  public void setCacheSize(Integer cacheSize) {
    this.cacheSize = cacheSize;
  }

  
  /**
   * The flash cache hit percentage times 100. This is calculated using totalFlashCacheReads/(totalBaseWrites + totalBaseReads + totalFlashCacheReads).
   **/
  public FlashCacheAnalyticsItem cacheHitPct(Integer cacheHitPct) {
    this.cacheHitPct = cacheHitPct;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flash cache hit percentage times 100. This is calculated using totalFlashCacheReads/(totalBaseWrites + totalBaseReads + totalFlashCacheReads).")
  @JsonProperty("cacheHitPct")
  public Integer getCacheHitPct() {
    return cacheHitPct;
  }
  
  public void setCacheHitPct(Integer cacheHitPct) {
    this.cacheHitPct = cacheHitPct;
  }

  
  /**
   * Host writes sent to volume(s) enabled for flash cache and serviced from either HDD or Primary Cache.
   **/
  public FlashCacheAnalyticsItem totalBaseWrites(Long totalBaseWrites) {
    this.totalBaseWrites = totalBaseWrites;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Host writes sent to volume(s) enabled for flash cache and serviced from either HDD or Primary Cache.")
  @JsonProperty("totalBaseWrites")
  public Long getTotalBaseWrites() {
    return totalBaseWrites;
  }
  
  public void setTotalBaseWrites(Long totalBaseWrites) {
    this.totalBaseWrites = totalBaseWrites;
  }

  
  /**
   * Write latency associated with HDD or DRAM access (in micro-seconds) for the volume(s) enabled for flash cache.
   **/
  public FlashCacheAnalyticsItem totalBaseWriteLatency(Long totalBaseWriteLatency) {
    this.totalBaseWriteLatency = totalBaseWriteLatency;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Write latency associated with HDD or DRAM access (in micro-seconds) for the volume(s) enabled for flash cache.")
  @JsonProperty("totalBaseWriteLatency")
  public Long getTotalBaseWriteLatency() {
    return totalBaseWriteLatency;
  }
  
  public void setTotalBaseWriteLatency(Long totalBaseWriteLatency) {
    this.totalBaseWriteLatency = totalBaseWriteLatency;
  }

  
  /**
   * Read latency associated with HDD or DRAM access (in micro-seconds) for the volume(s) enabled for flash cache.
   **/
  public FlashCacheAnalyticsItem totalBaseReadLatency(Long totalBaseReadLatency) {
    this.totalBaseReadLatency = totalBaseReadLatency;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Read latency associated with HDD or DRAM access (in micro-seconds) for the volume(s) enabled for flash cache.")
  @JsonProperty("totalBaseReadLatency")
  public Long getTotalBaseReadLatency() {
    return totalBaseReadLatency;
  }
  
  public void setTotalBaseReadLatency(Long totalBaseReadLatency) {
    this.totalBaseReadLatency = totalBaseReadLatency;
  }

  
  /**
   * Host reads sent to volume(s) enabled for flash cache and serviced from either HDD or Primary Cache.
   **/
  public FlashCacheAnalyticsItem totalBaseReads(Long totalBaseReads) {
    this.totalBaseReads = totalBaseReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Host reads sent to volume(s) enabled for flash cache and serviced from either HDD or Primary Cache.")
  @JsonProperty("totalBaseReads")
  public Long getTotalBaseReads() {
    return totalBaseReads;
  }
  
  public void setTotalBaseReads(Long totalBaseReads) {
    this.totalBaseReads = totalBaseReads;
  }

  
  /**
   * Host reads sent to volume(s) enabled for flash cache and serviced from flash cache (SSD or Primary Cache).
   **/
  public FlashCacheAnalyticsItem totalFlashCacheReads(Long totalFlashCacheReads) {
    this.totalFlashCacheReads = totalFlashCacheReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Host reads sent to volume(s) enabled for flash cache and serviced from flash cache (SSD or Primary Cache).")
  @JsonProperty("totalFlashCacheReads")
  public Long getTotalFlashCacheReads() {
    return totalFlashCacheReads;
  }
  
  public void setTotalFlashCacheReads(Long totalFlashCacheReads) {
    this.totalFlashCacheReads = totalFlashCacheReads;
  }

  
  /**
   * Read latency associated with flash cache access (in micro-seconds) for the volume(s) enabled for flash cache.
   **/
  public FlashCacheAnalyticsItem totalFlashCacheReadLatency(Long totalFlashCacheReadLatency) {
    this.totalFlashCacheReadLatency = totalFlashCacheReadLatency;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Read latency associated with flash cache access (in micro-seconds) for the volume(s) enabled for flash cache.")
  @JsonProperty("totalFlashCacheReadLatency")
  public Long getTotalFlashCacheReadLatency() {
    return totalFlashCacheReadLatency;
  }
  
  public void setTotalFlashCacheReadLatency(Long totalFlashCacheReadLatency) {
    this.totalFlashCacheReadLatency = totalFlashCacheReadLatency;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlashCacheAnalyticsItem flashCacheAnalyticsItem = (FlashCacheAnalyticsItem) o;
    return Objects.equals(this.cacheSize, flashCacheAnalyticsItem.cacheSize) &&
        Objects.equals(this.cacheHitPct, flashCacheAnalyticsItem.cacheHitPct) &&
        Objects.equals(this.totalBaseWrites, flashCacheAnalyticsItem.totalBaseWrites) &&
        Objects.equals(this.totalBaseWriteLatency, flashCacheAnalyticsItem.totalBaseWriteLatency) &&
        Objects.equals(this.totalBaseReadLatency, flashCacheAnalyticsItem.totalBaseReadLatency) &&
        Objects.equals(this.totalBaseReads, flashCacheAnalyticsItem.totalBaseReads) &&
        Objects.equals(this.totalFlashCacheReads, flashCacheAnalyticsItem.totalFlashCacheReads) &&
        Objects.equals(this.totalFlashCacheReadLatency, flashCacheAnalyticsItem.totalFlashCacheReadLatency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheSize, cacheHitPct, totalBaseWrites, totalBaseWriteLatency, totalBaseReadLatency, totalBaseReads, totalFlashCacheReads, totalFlashCacheReadLatency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashCacheAnalyticsItem {\n");
    
    sb.append("    cacheSize: ").append(toIndentedString(cacheSize)).append("\n");
    sb.append("    cacheHitPct: ").append(toIndentedString(cacheHitPct)).append("\n");
    sb.append("    totalBaseWrites: ").append(toIndentedString(totalBaseWrites)).append("\n");
    sb.append("    totalBaseWriteLatency: ").append(toIndentedString(totalBaseWriteLatency)).append("\n");
    sb.append("    totalBaseReadLatency: ").append(toIndentedString(totalBaseReadLatency)).append("\n");
    sb.append("    totalBaseReads: ").append(toIndentedString(totalBaseReads)).append("\n");
    sb.append("    totalFlashCacheReads: ").append(toIndentedString(totalFlashCacheReads)).append("\n");
    sb.append("    totalFlashCacheReadLatency: ").append(toIndentedString(totalFlashCacheReadLatency)).append("\n");
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

