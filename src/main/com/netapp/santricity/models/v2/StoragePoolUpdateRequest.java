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
 * Updates a Storage Pool.
 */
@ApiModel(description = "Updates a Storage Pool.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class StoragePoolUpdateRequest   {
  
    private String name;

    private Boolean securePool;

    private Integer reservedDriveCount;

    private DiskPoolPriorityUpdateRequest poolPriority;

    private DiskPoolThresholdUpdateRequest poolThreshold;

  
  /**
   * The new user-label to assign to the storage pool.
   **/
  public StoragePoolUpdateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new user-label to assign to the storage pool.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Convert to a secure Storage Pool if all of the drives that constitute      the Pool are security capable
   **/
  public StoragePoolUpdateRequest securePool(Boolean securePool) {
    this.securePool = securePool;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Convert to a secure Storage Pool if all of the drives that constitute      the Pool are security capable")
  @JsonProperty("securePool")
  public Boolean getSecurePool() {
    return securePool;
  }
  
  public void setSecurePool(Boolean securePool) {
    this.securePool = securePool;
  }

  
  /**
   * Set the number of drives reserved by the storage pool for reconstruction operations      (only for RAID Type: raidDiskPool)
   **/
  public StoragePoolUpdateRequest reservedDriveCount(Integer reservedDriveCount) {
    this.reservedDriveCount = reservedDriveCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set the number of drives reserved by the storage pool for reconstruction operations      (only for RAID Type: raidDiskPool)")
  @JsonProperty("reservedDriveCount")
  public Integer getReservedDriveCount() {
    return reservedDriveCount;
  }
  
  public void setReservedDriveCount(Integer reservedDriveCount) {
    this.reservedDriveCount = reservedDriveCount;
  }

  
  /**
   * Set the reconstruction and background operation priorities (only for RAID Type: raidDiskPool)
   **/
  public StoragePoolUpdateRequest poolPriority(DiskPoolPriorityUpdateRequest poolPriority) {
    this.poolPriority = poolPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set the reconstruction and background operation priorities (only for RAID Type: raidDiskPool)")
  @JsonProperty("poolPriority")
  public DiskPoolPriorityUpdateRequest getPoolPriority() {
    return poolPriority;
  }
  
  public void setPoolPriority(DiskPoolPriorityUpdateRequest poolPriority) {
    this.poolPriority = poolPriority;
  }

  
  /**
   * Set the reconstruction and background operation priorities (only for RAID Type: raidDiskPool)
   **/
  public StoragePoolUpdateRequest poolThreshold(DiskPoolThresholdUpdateRequest poolThreshold) {
    this.poolThreshold = poolThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set the reconstruction and background operation priorities (only for RAID Type: raidDiskPool)")
  @JsonProperty("poolThreshold")
  public DiskPoolThresholdUpdateRequest getPoolThreshold() {
    return poolThreshold;
  }
  
  public void setPoolThreshold(DiskPoolThresholdUpdateRequest poolThreshold) {
    this.poolThreshold = poolThreshold;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragePoolUpdateRequest storagePoolUpdateRequest = (StoragePoolUpdateRequest) o;
    return Objects.equals(this.name, storagePoolUpdateRequest.name) &&
        Objects.equals(this.securePool, storagePoolUpdateRequest.securePool) &&
        Objects.equals(this.reservedDriveCount, storagePoolUpdateRequest.reservedDriveCount) &&
        Objects.equals(this.poolPriority, storagePoolUpdateRequest.poolPriority) &&
        Objects.equals(this.poolThreshold, storagePoolUpdateRequest.poolThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, securePool, reservedDriveCount, poolPriority, poolThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragePoolUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    securePool: ").append(toIndentedString(securePool)).append("\n");
    sb.append("    reservedDriveCount: ").append(toIndentedString(reservedDriveCount)).append("\n");
    sb.append("    poolPriority: ").append(toIndentedString(poolPriority)).append("\n");
    sb.append("    poolThreshold: ").append(toIndentedString(poolThreshold)).append("\n");
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

