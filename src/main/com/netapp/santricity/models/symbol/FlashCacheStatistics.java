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
 * FlashCacheStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class FlashCacheStatistics   {
  
    private Long timestamp;

    private Long reads;

    private Long readBlocks;

    private Long writes;

    private Long writeBlocks;

    private Long fullCacheHits;

    private Long fullCacheHitBlocks;

    private Long partialCacheHits;

    private Long partialCacheHitBlocks;

    private Long completeCacheMiss;

    private Long completeCacheMissBlocks;

    private Long populateOnReads;

    private Long populateOnReadBlocks;

    private Long populateOnWrites;

    private Long populateOnWriteBlocks;

    private Long invalidates;

    private Long recycles;

    private Long availableBytes;

    private Long allocatedBytes;

    private Long populatedCleanBytes;

    private Long populatedDirtyBytes;

  
  /**
   * The time these statistics were recorded measured in seconds since midnight January 1, 1970.
   **/
  public FlashCacheStatistics timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time these statistics were recorded measured in seconds since midnight January 1, 1970.")
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * The number of read operations.
   **/
  public FlashCacheStatistics reads(Long reads) {
    this.reads = reads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of read operations.")
  @JsonProperty("reads")
  public Long getReads() {
    return reads;
  }
  
  public void setReads(Long reads) {
    this.reads = reads;
  }

  
  /**
   * The number of block read operations.
   **/
  public FlashCacheStatistics readBlocks(Long readBlocks) {
    this.readBlocks = readBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of block read operations.")
  @JsonProperty("readBlocks")
  public Long getReadBlocks() {
    return readBlocks;
  }
  
  public void setReadBlocks(Long readBlocks) {
    this.readBlocks = readBlocks;
  }

  
  /**
   * The number of write operations.
   **/
  public FlashCacheStatistics writes(Long writes) {
    this.writes = writes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of write operations.")
  @JsonProperty("writes")
  public Long getWrites() {
    return writes;
  }
  
  public void setWrites(Long writes) {
    this.writes = writes;
  }

  
  /**
   * The number of block write operations.
   **/
  public FlashCacheStatistics writeBlocks(Long writeBlocks) {
    this.writeBlocks = writeBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of block write operations.")
  @JsonProperty("writeBlocks")
  public Long getWriteBlocks() {
    return writeBlocks;
  }
  
  public void setWriteBlocks(Long writeBlocks) {
    this.writeBlocks = writeBlocks;
  }

  
  /**
   * The number of full cache hits.
   **/
  public FlashCacheStatistics fullCacheHits(Long fullCacheHits) {
    this.fullCacheHits = fullCacheHits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of full cache hits.")
  @JsonProperty("fullCacheHits")
  public Long getFullCacheHits() {
    return fullCacheHits;
  }
  
  public void setFullCacheHits(Long fullCacheHits) {
    this.fullCacheHits = fullCacheHits;
  }

  
  /**
   * The number of full cache hit blocks.
   **/
  public FlashCacheStatistics fullCacheHitBlocks(Long fullCacheHitBlocks) {
    this.fullCacheHitBlocks = fullCacheHitBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of full cache hit blocks.")
  @JsonProperty("fullCacheHitBlocks")
  public Long getFullCacheHitBlocks() {
    return fullCacheHitBlocks;
  }
  
  public void setFullCacheHitBlocks(Long fullCacheHitBlocks) {
    this.fullCacheHitBlocks = fullCacheHitBlocks;
  }

  
  /**
   * The number of partial cache hits.
   **/
  public FlashCacheStatistics partialCacheHits(Long partialCacheHits) {
    this.partialCacheHits = partialCacheHits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of partial cache hits.")
  @JsonProperty("partialCacheHits")
  public Long getPartialCacheHits() {
    return partialCacheHits;
  }
  
  public void setPartialCacheHits(Long partialCacheHits) {
    this.partialCacheHits = partialCacheHits;
  }

  
  /**
   * The number of partial cache hit blocks.
   **/
  public FlashCacheStatistics partialCacheHitBlocks(Long partialCacheHitBlocks) {
    this.partialCacheHitBlocks = partialCacheHitBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of partial cache hit blocks.")
  @JsonProperty("partialCacheHitBlocks")
  public Long getPartialCacheHitBlocks() {
    return partialCacheHitBlocks;
  }
  
  public void setPartialCacheHitBlocks(Long partialCacheHitBlocks) {
    this.partialCacheHitBlocks = partialCacheHitBlocks;
  }

  
  /**
   * The number of complete cache misses.
   **/
  public FlashCacheStatistics completeCacheMiss(Long completeCacheMiss) {
    this.completeCacheMiss = completeCacheMiss;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of complete cache misses.")
  @JsonProperty("completeCacheMiss")
  public Long getCompleteCacheMiss() {
    return completeCacheMiss;
  }
  
  public void setCompleteCacheMiss(Long completeCacheMiss) {
    this.completeCacheMiss = completeCacheMiss;
  }

  
  /**
   * The number of complete cache miss blocks.
   **/
  public FlashCacheStatistics completeCacheMissBlocks(Long completeCacheMissBlocks) {
    this.completeCacheMissBlocks = completeCacheMissBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of complete cache miss blocks.")
  @JsonProperty("completeCacheMissBlocks")
  public Long getCompleteCacheMissBlocks() {
    return completeCacheMissBlocks;
  }
  
  public void setCompleteCacheMissBlocks(Long completeCacheMissBlocks) {
    this.completeCacheMissBlocks = completeCacheMissBlocks;
  }

  
  /**
   * The number of populate on reads.
   **/
  public FlashCacheStatistics populateOnReads(Long populateOnReads) {
    this.populateOnReads = populateOnReads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of populate on reads.")
  @JsonProperty("populateOnReads")
  public Long getPopulateOnReads() {
    return populateOnReads;
  }
  
  public void setPopulateOnReads(Long populateOnReads) {
    this.populateOnReads = populateOnReads;
  }

  
  /**
   * The number of populate on read blocks.
   **/
  public FlashCacheStatistics populateOnReadBlocks(Long populateOnReadBlocks) {
    this.populateOnReadBlocks = populateOnReadBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of populate on read blocks.")
  @JsonProperty("populateOnReadBlocks")
  public Long getPopulateOnReadBlocks() {
    return populateOnReadBlocks;
  }
  
  public void setPopulateOnReadBlocks(Long populateOnReadBlocks) {
    this.populateOnReadBlocks = populateOnReadBlocks;
  }

  
  /**
   * The number of populate on writes.
   **/
  public FlashCacheStatistics populateOnWrites(Long populateOnWrites) {
    this.populateOnWrites = populateOnWrites;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of populate on writes.")
  @JsonProperty("populateOnWrites")
  public Long getPopulateOnWrites() {
    return populateOnWrites;
  }
  
  public void setPopulateOnWrites(Long populateOnWrites) {
    this.populateOnWrites = populateOnWrites;
  }

  
  /**
   * The number of populate on write blocks.
   **/
  public FlashCacheStatistics populateOnWriteBlocks(Long populateOnWriteBlocks) {
    this.populateOnWriteBlocks = populateOnWriteBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of populate on write blocks.")
  @JsonProperty("populateOnWriteBlocks")
  public Long getPopulateOnWriteBlocks() {
    return populateOnWriteBlocks;
  }
  
  public void setPopulateOnWriteBlocks(Long populateOnWriteBlocks) {
    this.populateOnWriteBlocks = populateOnWriteBlocks;
  }

  
  /**
   * The number of invalidates on host writes.
   **/
  public FlashCacheStatistics invalidates(Long invalidates) {
    this.invalidates = invalidates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of invalidates on host writes.")
  @JsonProperty("invalidates")
  public Long getInvalidates() {
    return invalidates;
  }
  
  public void setInvalidates(Long invalidates) {
    this.invalidates = invalidates;
  }

  
  /**
   * The number of times data is removed from the LRU.
   **/
  public FlashCacheStatistics recycles(Long recycles) {
    this.recycles = recycles;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times data is removed from the LRU.")
  @JsonProperty("recycles")
  public Long getRecycles() {
    return recycles;
  }
  
  public void setRecycles(Long recycles) {
    this.recycles = recycles;
  }

  
  /**
   * The number of available bytes.
   **/
  public FlashCacheStatistics availableBytes(Long availableBytes) {
    this.availableBytes = availableBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of available bytes.")
  @JsonProperty("availableBytes")
  public Long getAvailableBytes() {
    return availableBytes;
  }
  
  public void setAvailableBytes(Long availableBytes) {
    this.availableBytes = availableBytes;
  }

  
  /**
   * The number of allocated bytes.
   **/
  public FlashCacheStatistics allocatedBytes(Long allocatedBytes) {
    this.allocatedBytes = allocatedBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of allocated bytes.")
  @JsonProperty("allocatedBytes")
  public Long getAllocatedBytes() {
    return allocatedBytes;
  }
  
  public void setAllocatedBytes(Long allocatedBytes) {
    this.allocatedBytes = allocatedBytes;
  }

  
  /**
   * The number of populated clean bytes.
   **/
  public FlashCacheStatistics populatedCleanBytes(Long populatedCleanBytes) {
    this.populatedCleanBytes = populatedCleanBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of populated clean bytes.")
  @JsonProperty("populatedCleanBytes")
  public Long getPopulatedCleanBytes() {
    return populatedCleanBytes;
  }
  
  public void setPopulatedCleanBytes(Long populatedCleanBytes) {
    this.populatedCleanBytes = populatedCleanBytes;
  }

  
  /**
   * The number of populated dirty bytes.
   **/
  public FlashCacheStatistics populatedDirtyBytes(Long populatedDirtyBytes) {
    this.populatedDirtyBytes = populatedDirtyBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of populated dirty bytes.")
  @JsonProperty("populatedDirtyBytes")
  public Long getPopulatedDirtyBytes() {
    return populatedDirtyBytes;
  }
  
  public void setPopulatedDirtyBytes(Long populatedDirtyBytes) {
    this.populatedDirtyBytes = populatedDirtyBytes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlashCacheStatistics flashCacheStatistics = (FlashCacheStatistics) o;
    return Objects.equals(this.timestamp, flashCacheStatistics.timestamp) &&
        Objects.equals(this.reads, flashCacheStatistics.reads) &&
        Objects.equals(this.readBlocks, flashCacheStatistics.readBlocks) &&
        Objects.equals(this.writes, flashCacheStatistics.writes) &&
        Objects.equals(this.writeBlocks, flashCacheStatistics.writeBlocks) &&
        Objects.equals(this.fullCacheHits, flashCacheStatistics.fullCacheHits) &&
        Objects.equals(this.fullCacheHitBlocks, flashCacheStatistics.fullCacheHitBlocks) &&
        Objects.equals(this.partialCacheHits, flashCacheStatistics.partialCacheHits) &&
        Objects.equals(this.partialCacheHitBlocks, flashCacheStatistics.partialCacheHitBlocks) &&
        Objects.equals(this.completeCacheMiss, flashCacheStatistics.completeCacheMiss) &&
        Objects.equals(this.completeCacheMissBlocks, flashCacheStatistics.completeCacheMissBlocks) &&
        Objects.equals(this.populateOnReads, flashCacheStatistics.populateOnReads) &&
        Objects.equals(this.populateOnReadBlocks, flashCacheStatistics.populateOnReadBlocks) &&
        Objects.equals(this.populateOnWrites, flashCacheStatistics.populateOnWrites) &&
        Objects.equals(this.populateOnWriteBlocks, flashCacheStatistics.populateOnWriteBlocks) &&
        Objects.equals(this.invalidates, flashCacheStatistics.invalidates) &&
        Objects.equals(this.recycles, flashCacheStatistics.recycles) &&
        Objects.equals(this.availableBytes, flashCacheStatistics.availableBytes) &&
        Objects.equals(this.allocatedBytes, flashCacheStatistics.allocatedBytes) &&
        Objects.equals(this.populatedCleanBytes, flashCacheStatistics.populatedCleanBytes) &&
        Objects.equals(this.populatedDirtyBytes, flashCacheStatistics.populatedDirtyBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, reads, readBlocks, writes, writeBlocks, fullCacheHits, fullCacheHitBlocks, partialCacheHits, partialCacheHitBlocks, completeCacheMiss, completeCacheMissBlocks, populateOnReads, populateOnReadBlocks, populateOnWrites, populateOnWriteBlocks, invalidates, recycles, availableBytes, allocatedBytes, populatedCleanBytes, populatedDirtyBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashCacheStatistics {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    reads: ").append(toIndentedString(reads)).append("\n");
    sb.append("    readBlocks: ").append(toIndentedString(readBlocks)).append("\n");
    sb.append("    writes: ").append(toIndentedString(writes)).append("\n");
    sb.append("    writeBlocks: ").append(toIndentedString(writeBlocks)).append("\n");
    sb.append("    fullCacheHits: ").append(toIndentedString(fullCacheHits)).append("\n");
    sb.append("    fullCacheHitBlocks: ").append(toIndentedString(fullCacheHitBlocks)).append("\n");
    sb.append("    partialCacheHits: ").append(toIndentedString(partialCacheHits)).append("\n");
    sb.append("    partialCacheHitBlocks: ").append(toIndentedString(partialCacheHitBlocks)).append("\n");
    sb.append("    completeCacheMiss: ").append(toIndentedString(completeCacheMiss)).append("\n");
    sb.append("    completeCacheMissBlocks: ").append(toIndentedString(completeCacheMissBlocks)).append("\n");
    sb.append("    populateOnReads: ").append(toIndentedString(populateOnReads)).append("\n");
    sb.append("    populateOnReadBlocks: ").append(toIndentedString(populateOnReadBlocks)).append("\n");
    sb.append("    populateOnWrites: ").append(toIndentedString(populateOnWrites)).append("\n");
    sb.append("    populateOnWriteBlocks: ").append(toIndentedString(populateOnWriteBlocks)).append("\n");
    sb.append("    invalidates: ").append(toIndentedString(invalidates)).append("\n");
    sb.append("    recycles: ").append(toIndentedString(recycles)).append("\n");
    sb.append("    availableBytes: ").append(toIndentedString(availableBytes)).append("\n");
    sb.append("    allocatedBytes: ").append(toIndentedString(allocatedBytes)).append("\n");
    sb.append("    populatedCleanBytes: ").append(toIndentedString(populatedCleanBytes)).append("\n");
    sb.append("    populatedDirtyBytes: ").append(toIndentedString(populatedDirtyBytes)).append("\n");
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

