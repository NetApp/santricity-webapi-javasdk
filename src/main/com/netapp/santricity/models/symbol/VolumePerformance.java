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
 * VolumePerformance
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumePerformance   {
  
    private Long time;

    private Integer totalRequestsServiced;

    private Integer totalBlocksRequested;

    private Integer totalReadRequests;

    private Integer totalReadBlocksRequested;

    private Integer totalWriteRequests;

    private Integer totalWriteBlocksRequested;

    private Integer percentReadRequests;

    private Integer averageBlocksRequested;

    private Integer totalLargeReads;

    private Integer totalLargeReadBlocksRequested;

    private Integer totalLargeWrites;

    private Integer totalLargeWriteBlocksRequested;

    private Integer totalCacheReadChecks;

    private Integer totalCacheReadCheckHits;

    private Integer totalCacheWriteRequests;

    private String volumeRef;

    private Integer totalCacheWriteHits;

    private Integer totalFlashCacheReadHits;

  
  /**
   * Timestamp returned by controller with performance metrics.
   **/
  public VolumePerformance time(Long time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp returned by controller with performance metrics.")
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }
  
  public void setTime(Long time) {
    this.time = time;
  }

  
  /**
   * Total number of requests.
   **/
  public VolumePerformance totalRequestsServiced(Integer totalRequestsServiced) {
    this.totalRequestsServiced = totalRequestsServiced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of requests.")
  @JsonProperty("totalRequestsServiced")
  public Integer getTotalRequestsServiced() {
    return totalRequestsServiced;
  }
  
  public void setTotalRequestsServiced(Integer totalRequestsServiced) {
    this.totalRequestsServiced = totalRequestsServiced;
  }

  
  /**
   * Total number of blocks requested.
   **/
  public VolumePerformance totalBlocksRequested(Integer totalBlocksRequested) {
    this.totalBlocksRequested = totalBlocksRequested;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of blocks requested.")
  @JsonProperty("totalBlocksRequested")
  public Integer getTotalBlocksRequested() {
    return totalBlocksRequested;
  }
  
  public void setTotalBlocksRequested(Integer totalBlocksRequested) {
    this.totalBlocksRequested = totalBlocksRequested;
  }

  
  /**
   * Total number of read requests.
   **/
  public VolumePerformance totalReadRequests(Integer totalReadRequests) {
    this.totalReadRequests = totalReadRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of read requests.")
  @JsonProperty("totalReadRequests")
  public Integer getTotalReadRequests() {
    return totalReadRequests;
  }
  
  public void setTotalReadRequests(Integer totalReadRequests) {
    this.totalReadRequests = totalReadRequests;
  }

  
  /**
   * Total number of read blocks requested.
   **/
  public VolumePerformance totalReadBlocksRequested(Integer totalReadBlocksRequested) {
    this.totalReadBlocksRequested = totalReadBlocksRequested;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of read blocks requested.")
  @JsonProperty("totalReadBlocksRequested")
  public Integer getTotalReadBlocksRequested() {
    return totalReadBlocksRequested;
  }
  
  public void setTotalReadBlocksRequested(Integer totalReadBlocksRequested) {
    this.totalReadBlocksRequested = totalReadBlocksRequested;
  }

  
  /**
   * Total number of write requests.
   **/
  public VolumePerformance totalWriteRequests(Integer totalWriteRequests) {
    this.totalWriteRequests = totalWriteRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of write requests.")
  @JsonProperty("totalWriteRequests")
  public Integer getTotalWriteRequests() {
    return totalWriteRequests;
  }
  
  public void setTotalWriteRequests(Integer totalWriteRequests) {
    this.totalWriteRequests = totalWriteRequests;
  }

  
  /**
   * Total number of write blocks requested.
   **/
  public VolumePerformance totalWriteBlocksRequested(Integer totalWriteBlocksRequested) {
    this.totalWriteBlocksRequested = totalWriteBlocksRequested;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of write blocks requested.")
  @JsonProperty("totalWriteBlocksRequested")
  public Integer getTotalWriteBlocksRequested() {
    return totalWriteBlocksRequested;
  }
  
  public void setTotalWriteBlocksRequested(Integer totalWriteBlocksRequested) {
    this.totalWriteBlocksRequested = totalWriteBlocksRequested;
  }

  
  /**
   * The percentReadRequests is computed directly as: (totalReadRequests * 100) / totalRequests.
   **/
  public VolumePerformance percentReadRequests(Integer percentReadRequests) {
    this.percentReadRequests = percentReadRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The percentReadRequests is computed directly as: (totalReadRequests * 100) / totalRequests.")
  @JsonProperty("percentReadRequests")
  public Integer getPercentReadRequests() {
    return percentReadRequests;
  }
  
  public void setPercentReadRequests(Integer percentReadRequests) {
    this.percentReadRequests = percentReadRequests;
  }

  
  /**
   * Average number of blocks requested.
   **/
  public VolumePerformance averageBlocksRequested(Integer averageBlocksRequested) {
    this.averageBlocksRequested = averageBlocksRequested;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Average number of blocks requested.")
  @JsonProperty("averageBlocksRequested")
  public Integer getAverageBlocksRequested() {
    return averageBlocksRequested;
  }
  
  public void setAverageBlocksRequested(Integer averageBlocksRequested) {
    this.averageBlocksRequested = averageBlocksRequested;
  }

  
  /**
   * Total number of reads considered large.
   **/
  public VolumePerformance totalLargeReads(Integer totalLargeReads) {
    this.totalLargeReads = totalLargeReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of reads considered large.")
  @JsonProperty("totalLargeReads")
  public Integer getTotalLargeReads() {
    return totalLargeReads;
  }
  
  public void setTotalLargeReads(Integer totalLargeReads) {
    this.totalLargeReads = totalLargeReads;
  }

  
  /**
   * Total requested blocks for large reads.
   **/
  public VolumePerformance totalLargeReadBlocksRequested(Integer totalLargeReadBlocksRequested) {
    this.totalLargeReadBlocksRequested = totalLargeReadBlocksRequested;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total requested blocks for large reads.")
  @JsonProperty("totalLargeReadBlocksRequested")
  public Integer getTotalLargeReadBlocksRequested() {
    return totalLargeReadBlocksRequested;
  }
  
  public void setTotalLargeReadBlocksRequested(Integer totalLargeReadBlocksRequested) {
    this.totalLargeReadBlocksRequested = totalLargeReadBlocksRequested;
  }

  
  /**
   * Total number of writes considered large.
   **/
  public VolumePerformance totalLargeWrites(Integer totalLargeWrites) {
    this.totalLargeWrites = totalLargeWrites;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of writes considered large.")
  @JsonProperty("totalLargeWrites")
  public Integer getTotalLargeWrites() {
    return totalLargeWrites;
  }
  
  public void setTotalLargeWrites(Integer totalLargeWrites) {
    this.totalLargeWrites = totalLargeWrites;
  }

  
  /**
   * Total requested blocks for large writes.
   **/
  public VolumePerformance totalLargeWriteBlocksRequested(Integer totalLargeWriteBlocksRequested) {
    this.totalLargeWriteBlocksRequested = totalLargeWriteBlocksRequested;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total requested blocks for large writes.")
  @JsonProperty("totalLargeWriteBlocksRequested")
  public Integer getTotalLargeWriteBlocksRequested() {
    return totalLargeWriteBlocksRequested;
  }
  
  public void setTotalLargeWriteBlocksRequested(Integer totalLargeWriteBlocksRequested) {
    this.totalLargeWriteBlocksRequested = totalLargeWriteBlocksRequested;
  }

  
  /**
   * This field tracks the number of calls to the cache manager to check if a host-initiated read request can be fully satisfied out of cache.
   **/
  public VolumePerformance totalCacheReadChecks(Integer totalCacheReadChecks) {
    this.totalCacheReadChecks = totalCacheReadChecks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field tracks the number of calls to the cache manager to check if a host-initiated read request can be fully satisfied out of cache.")
  @JsonProperty("totalCacheReadChecks")
  public Integer getTotalCacheReadChecks() {
    return totalCacheReadChecks;
  }
  
  public void setTotalCacheReadChecks(Integer totalCacheReadChecks) {
    this.totalCacheReadChecks = totalCacheReadChecks;
  }

  
  /**
   * Number of cache read check hits.
   **/
  public VolumePerformance totalCacheReadCheckHits(Integer totalCacheReadCheckHits) {
    this.totalCacheReadCheckHits = totalCacheReadCheckHits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of cache read check hits.")
  @JsonProperty("totalCacheReadCheckHits")
  public Integer getTotalCacheReadCheckHits() {
    return totalCacheReadCheckHits;
  }
  
  public void setTotalCacheReadCheckHits(Integer totalCacheReadCheckHits) {
    this.totalCacheReadCheckHits = totalCacheReadCheckHits;
  }

  
  /**
   * Number of cache write requests. (This field is always set to zero by firmware releases prior to 7.10.)
   **/
  public VolumePerformance totalCacheWriteRequests(Integer totalCacheWriteRequests) {
    this.totalCacheWriteRequests = totalCacheWriteRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of cache write requests. (This field is always set to zero by firmware releases prior to 7.10.)")
  @JsonProperty("totalCacheWriteRequests")
  public Integer getTotalCacheWriteRequests() {
    return totalCacheWriteRequests;
  }
  
  public void setTotalCacheWriteRequests(Integer totalCacheWriteRequests) {
    this.totalCacheWriteRequests = totalCacheWriteRequests;
  }

  
  /**
   * The volume for which this information applies.
   **/
  public VolumePerformance volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume for which this information applies.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * The number of flash cache write hits.
   **/
  public VolumePerformance totalCacheWriteHits(Integer totalCacheWriteHits) {
    this.totalCacheWriteHits = totalCacheWriteHits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of flash cache write hits.")
  @JsonProperty("totalCacheWriteHits")
  public Integer getTotalCacheWriteHits() {
    return totalCacheWriteHits;
  }
  
  public void setTotalCacheWriteHits(Integer totalCacheWriteHits) {
    this.totalCacheWriteHits = totalCacheWriteHits;
  }

  
  /**
   * The total number of flash cache read hits.
   **/
  public VolumePerformance totalFlashCacheReadHits(Integer totalFlashCacheReadHits) {
    this.totalFlashCacheReadHits = totalFlashCacheReadHits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of flash cache read hits.")
  @JsonProperty("totalFlashCacheReadHits")
  public Integer getTotalFlashCacheReadHits() {
    return totalFlashCacheReadHits;
  }
  
  public void setTotalFlashCacheReadHits(Integer totalFlashCacheReadHits) {
    this.totalFlashCacheReadHits = totalFlashCacheReadHits;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumePerformance volumePerformance = (VolumePerformance) o;
    return Objects.equals(this.time, volumePerformance.time) &&
        Objects.equals(this.totalRequestsServiced, volumePerformance.totalRequestsServiced) &&
        Objects.equals(this.totalBlocksRequested, volumePerformance.totalBlocksRequested) &&
        Objects.equals(this.totalReadRequests, volumePerformance.totalReadRequests) &&
        Objects.equals(this.totalReadBlocksRequested, volumePerformance.totalReadBlocksRequested) &&
        Objects.equals(this.totalWriteRequests, volumePerformance.totalWriteRequests) &&
        Objects.equals(this.totalWriteBlocksRequested, volumePerformance.totalWriteBlocksRequested) &&
        Objects.equals(this.percentReadRequests, volumePerformance.percentReadRequests) &&
        Objects.equals(this.averageBlocksRequested, volumePerformance.averageBlocksRequested) &&
        Objects.equals(this.totalLargeReads, volumePerformance.totalLargeReads) &&
        Objects.equals(this.totalLargeReadBlocksRequested, volumePerformance.totalLargeReadBlocksRequested) &&
        Objects.equals(this.totalLargeWrites, volumePerformance.totalLargeWrites) &&
        Objects.equals(this.totalLargeWriteBlocksRequested, volumePerformance.totalLargeWriteBlocksRequested) &&
        Objects.equals(this.totalCacheReadChecks, volumePerformance.totalCacheReadChecks) &&
        Objects.equals(this.totalCacheReadCheckHits, volumePerformance.totalCacheReadCheckHits) &&
        Objects.equals(this.totalCacheWriteRequests, volumePerformance.totalCacheWriteRequests) &&
        Objects.equals(this.volumeRef, volumePerformance.volumeRef) &&
        Objects.equals(this.totalCacheWriteHits, volumePerformance.totalCacheWriteHits) &&
        Objects.equals(this.totalFlashCacheReadHits, volumePerformance.totalFlashCacheReadHits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, totalRequestsServiced, totalBlocksRequested, totalReadRequests, totalReadBlocksRequested, totalWriteRequests, totalWriteBlocksRequested, percentReadRequests, averageBlocksRequested, totalLargeReads, totalLargeReadBlocksRequested, totalLargeWrites, totalLargeWriteBlocksRequested, totalCacheReadChecks, totalCacheReadCheckHits, totalCacheWriteRequests, volumeRef, totalCacheWriteHits, totalFlashCacheReadHits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumePerformance {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    totalRequestsServiced: ").append(toIndentedString(totalRequestsServiced)).append("\n");
    sb.append("    totalBlocksRequested: ").append(toIndentedString(totalBlocksRequested)).append("\n");
    sb.append("    totalReadRequests: ").append(toIndentedString(totalReadRequests)).append("\n");
    sb.append("    totalReadBlocksRequested: ").append(toIndentedString(totalReadBlocksRequested)).append("\n");
    sb.append("    totalWriteRequests: ").append(toIndentedString(totalWriteRequests)).append("\n");
    sb.append("    totalWriteBlocksRequested: ").append(toIndentedString(totalWriteBlocksRequested)).append("\n");
    sb.append("    percentReadRequests: ").append(toIndentedString(percentReadRequests)).append("\n");
    sb.append("    averageBlocksRequested: ").append(toIndentedString(averageBlocksRequested)).append("\n");
    sb.append("    totalLargeReads: ").append(toIndentedString(totalLargeReads)).append("\n");
    sb.append("    totalLargeReadBlocksRequested: ").append(toIndentedString(totalLargeReadBlocksRequested)).append("\n");
    sb.append("    totalLargeWrites: ").append(toIndentedString(totalLargeWrites)).append("\n");
    sb.append("    totalLargeWriteBlocksRequested: ").append(toIndentedString(totalLargeWriteBlocksRequested)).append("\n");
    sb.append("    totalCacheReadChecks: ").append(toIndentedString(totalCacheReadChecks)).append("\n");
    sb.append("    totalCacheReadCheckHits: ").append(toIndentedString(totalCacheReadCheckHits)).append("\n");
    sb.append("    totalCacheWriteRequests: ").append(toIndentedString(totalCacheWriteRequests)).append("\n");
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    totalCacheWriteHits: ").append(toIndentedString(totalCacheWriteHits)).append("\n");
    sb.append("    totalFlashCacheReadHits: ").append(toIndentedString(totalFlashCacheReadHits)).append("\n");
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

