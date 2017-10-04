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
 * SSDBlockAllocationScanData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SSDBlockAllocationScanData   {
  
    private String driveRef;

    private Boolean allBlocks;

    private Long allocatedMappedBlocks;

    private Long allocatedUnmappedBlocks;

    private Long freeUnmappedBlocks;

    private List<BlockExtent> freeMappedExtents;

    private Long freeMappedBlocks;

  
  /**
   * The drive reference the statistics are about.
   **/
  public SSDBlockAllocationScanData driveRef(String driveRef) {
    this.driveRef = driveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The drive reference the statistics are about.")
  @JsonProperty("driveRef")
  public String getDriveRef() {
    return driveRef;
  }
  
  public void setDriveRef(String driveRef) {
    this.driveRef = driveRef;
  }

  
  /**
   * Boolean indication that determined what blocks to scan, was given at time the scan was request. If false, only free (not in use) blocks are scanned, if true, both free and allocated blocks are scanned. The allocatedMappedBlocks is estimated if allBlocks is false.
   **/
  public SSDBlockAllocationScanData allBlocks(Boolean allBlocks) {
    this.allBlocks = allBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Boolean indication that determined what blocks to scan, was given at time the scan was request. If false, only free (not in use) blocks are scanned, if true, both free and allocated blocks are scanned. The allocatedMappedBlocks is estimated if allBlocks is false.")
  @JsonProperty("allBlocks")
  public Boolean getAllBlocks() {
    return allBlocks;
  }
  
  public void setAllBlocks(Boolean allBlocks) {
    this.allBlocks = allBlocks;
  }

  
  /**
   * Count of blocks found that are allocated (in use) and mapped by the device.
   **/
  public SSDBlockAllocationScanData allocatedMappedBlocks(Long allocatedMappedBlocks) {
    this.allocatedMappedBlocks = allocatedMappedBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Count of blocks found that are allocated (in use) and mapped by the device.")
  @JsonProperty("allocatedMappedBlocks")
  public Long getAllocatedMappedBlocks() {
    return allocatedMappedBlocks;
  }
  
  public void setAllocatedMappedBlocks(Long allocatedMappedBlocks) {
    this.allocatedMappedBlocks = allocatedMappedBlocks;
  }

  
  /**
   * Count of blocks found that are allocated (in use) and ummapped by the device.
   **/
  public SSDBlockAllocationScanData allocatedUnmappedBlocks(Long allocatedUnmappedBlocks) {
    this.allocatedUnmappedBlocks = allocatedUnmappedBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Count of blocks found that are allocated (in use) and ummapped by the device.")
  @JsonProperty("allocatedUnmappedBlocks")
  public Long getAllocatedUnmappedBlocks() {
    return allocatedUnmappedBlocks;
  }
  
  public void setAllocatedUnmappedBlocks(Long allocatedUnmappedBlocks) {
    this.allocatedUnmappedBlocks = allocatedUnmappedBlocks;
  }

  
  /**
   * Count of blocks found that are free (not in use) and ummapped by the device.
   **/
  public SSDBlockAllocationScanData freeUnmappedBlocks(Long freeUnmappedBlocks) {
    this.freeUnmappedBlocks = freeUnmappedBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Count of blocks found that are free (not in use) and ummapped by the device.")
  @JsonProperty("freeUnmappedBlocks")
  public Long getFreeUnmappedBlocks() {
    return freeUnmappedBlocks;
  }
  
  public void setFreeUnmappedBlocks(Long freeUnmappedBlocks) {
    this.freeUnmappedBlocks = freeUnmappedBlocks;
  }

  
  /**
   * Block extents found that are free (not in use) and mapped by the device. List may be truncated for if too long.
   **/
  public SSDBlockAllocationScanData freeMappedExtents(List<BlockExtent> freeMappedExtents) {
    this.freeMappedExtents = freeMappedExtents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Block extents found that are free (not in use) and mapped by the device. List may be truncated for if too long.")
  @JsonProperty("freeMappedExtents")
  public List<BlockExtent> getFreeMappedExtents() {
    return freeMappedExtents;
  }
  
  public void setFreeMappedExtents(List<BlockExtent> freeMappedExtents) {
    this.freeMappedExtents = freeMappedExtents;
  }

  
  /**
   * Count of blocks found that are free (not in use) and mapped by the device.
   **/
  public SSDBlockAllocationScanData freeMappedBlocks(Long freeMappedBlocks) {
    this.freeMappedBlocks = freeMappedBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Count of blocks found that are free (not in use) and mapped by the device.")
  @JsonProperty("freeMappedBlocks")
  public Long getFreeMappedBlocks() {
    return freeMappedBlocks;
  }
  
  public void setFreeMappedBlocks(Long freeMappedBlocks) {
    this.freeMappedBlocks = freeMappedBlocks;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSDBlockAllocationScanData sSDBlockAllocationScanData = (SSDBlockAllocationScanData) o;
    return Objects.equals(this.driveRef, sSDBlockAllocationScanData.driveRef) &&
        Objects.equals(this.allBlocks, sSDBlockAllocationScanData.allBlocks) &&
        Objects.equals(this.allocatedMappedBlocks, sSDBlockAllocationScanData.allocatedMappedBlocks) &&
        Objects.equals(this.allocatedUnmappedBlocks, sSDBlockAllocationScanData.allocatedUnmappedBlocks) &&
        Objects.equals(this.freeUnmappedBlocks, sSDBlockAllocationScanData.freeUnmappedBlocks) &&
        Objects.equals(this.freeMappedExtents, sSDBlockAllocationScanData.freeMappedExtents) &&
        Objects.equals(this.freeMappedBlocks, sSDBlockAllocationScanData.freeMappedBlocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveRef, allBlocks, allocatedMappedBlocks, allocatedUnmappedBlocks, freeUnmappedBlocks, freeMappedExtents, freeMappedBlocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSDBlockAllocationScanData {\n");
    
    sb.append("    driveRef: ").append(toIndentedString(driveRef)).append("\n");
    sb.append("    allBlocks: ").append(toIndentedString(allBlocks)).append("\n");
    sb.append("    allocatedMappedBlocks: ").append(toIndentedString(allocatedMappedBlocks)).append("\n");
    sb.append("    allocatedUnmappedBlocks: ").append(toIndentedString(allocatedUnmappedBlocks)).append("\n");
    sb.append("    freeUnmappedBlocks: ").append(toIndentedString(freeUnmappedBlocks)).append("\n");
    sb.append("    freeMappedExtents: ").append(toIndentedString(freeMappedExtents)).append("\n");
    sb.append("    freeMappedBlocks: ").append(toIndentedString(freeMappedBlocks)).append("\n");
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

