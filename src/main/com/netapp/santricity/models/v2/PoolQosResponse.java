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
 * PoolQosResponse
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class PoolQosResponse   {
  
    private String poolId;

    private String name;

    private VolumeGroupEx pool;

    private Boolean flashCacheCapable;

    private Boolean dataAssuranceCapable;

    private Boolean encrypted;

    private Boolean thinProvisioningCapable;


  /**
   * The normalized spindle speed for the drives on this pool
   */
  public enum SpindleSpeedEnum {
    spindleSpeedUnknown("spindleSpeedUnknown"),
    spindleSpeedSSD("spindleSpeedSSD"),
    spindleSpeed5400("spindleSpeed5400"),
    spindleSpeed7200("spindleSpeed7200"),
    spindleSpeed10k("spindleSpeed10k"),
    spindleSpeed15k("spindleSpeed15k");
;
    private String value;

    SpindleSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SpindleSpeedEnum spindleSpeed;


  /**
   * The normalized RAID Level
   */
  public enum RaidLevelEnum {
    raid0("raid0"),
    raid1("raid1"),
    raid5("raid5"),
    raid6("raid6"),
    raidDiskPool("raidDiskPool"),
    unknown("unknown");
;
    private String value;

    RaidLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RaidLevelEnum raidLevel;

    private List<Long> availableFreeExtentCapacities;

  
  /**
   * The pool unique identifier
   **/
  public PoolQosResponse poolId(String poolId) {
    this.poolId = poolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pool unique identifier")
  @JsonProperty("poolId")
  public String getPoolId() {
    return poolId;
  }
  
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  
  /**
   * The pool name
   **/
  public PoolQosResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pool name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public PoolQosResponse pool(VolumeGroupEx pool) {
    this.pool = pool;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pool")
  public VolumeGroupEx getPool() {
    return pool;
  }
  
  public void setPool(VolumeGroupEx pool) {
    this.pool = pool;
  }

  
  /**
   * True if the pool supports flashCaching created volumes
   **/
  public PoolQosResponse flashCacheCapable(Boolean flashCacheCapable) {
    this.flashCacheCapable = flashCacheCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the pool supports flashCaching created volumes")
  @JsonProperty("flashCacheCapable")
  public Boolean getFlashCacheCapable() {
    return flashCacheCapable;
  }
  
  public void setFlashCacheCapable(Boolean flashCacheCapable) {
    this.flashCacheCapable = flashCacheCapable;
  }

  
  /**
   * True if created volumes can have dataAssurance enabled
   **/
  public PoolQosResponse dataAssuranceCapable(Boolean dataAssuranceCapable) {
    this.dataAssuranceCapable = dataAssuranceCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if created volumes can have dataAssurance enabled")
  @JsonProperty("dataAssuranceCapable")
  public Boolean getDataAssuranceCapable() {
    return dataAssuranceCapable;
  }
  
  public void setDataAssuranceCapable(Boolean dataAssuranceCapable) {
    this.dataAssuranceCapable = dataAssuranceCapable;
  }

  
  /**
   * True if the pool supports encryption
   **/
  public PoolQosResponse encrypted(Boolean encrypted) {
    this.encrypted = encrypted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the pool supports encryption")
  @JsonProperty("encrypted")
  public Boolean getEncrypted() {
    return encrypted;
  }
  
  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }

  
  /**
   * True if thin provisioned volumes can be defined on this pool
   **/
  public PoolQosResponse thinProvisioningCapable(Boolean thinProvisioningCapable) {
    this.thinProvisioningCapable = thinProvisioningCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if thin provisioned volumes can be defined on this pool")
  @JsonProperty("thinProvisioningCapable")
  public Boolean getThinProvisioningCapable() {
    return thinProvisioningCapable;
  }
  
  public void setThinProvisioningCapable(Boolean thinProvisioningCapable) {
    this.thinProvisioningCapable = thinProvisioningCapable;
  }

  
  /**
   * The normalized spindle speed for the drives on this pool
   **/
  public PoolQosResponse spindleSpeed(SpindleSpeedEnum spindleSpeed) {
    this.spindleSpeed = spindleSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The normalized spindle speed for the drives on this pool")
  @JsonProperty("spindleSpeed")
  public SpindleSpeedEnum getSpindleSpeed() {
    return spindleSpeed;
  }
  
  public void setSpindleSpeed(SpindleSpeedEnum spindleSpeed) {
    this.spindleSpeed = spindleSpeed;
  }

  
  /**
   * The normalized RAID Level
   **/
  public PoolQosResponse raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The normalized RAID Level")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * The available sections of freeSpace available, in descending order
   **/
  public PoolQosResponse availableFreeExtentCapacities(List<Long> availableFreeExtentCapacities) {
    this.availableFreeExtentCapacities = availableFreeExtentCapacities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The available sections of freeSpace available, in descending order")
  @JsonProperty("availableFreeExtentCapacities")
  public List<Long> getAvailableFreeExtentCapacities() {
    return availableFreeExtentCapacities;
  }
  
  public void setAvailableFreeExtentCapacities(List<Long> availableFreeExtentCapacities) {
    this.availableFreeExtentCapacities = availableFreeExtentCapacities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolQosResponse poolQosResponse = (PoolQosResponse) o;
    return Objects.equals(this.poolId, poolQosResponse.poolId) &&
        Objects.equals(this.name, poolQosResponse.name) &&
        Objects.equals(this.pool, poolQosResponse.pool) &&
        Objects.equals(this.flashCacheCapable, poolQosResponse.flashCacheCapable) &&
        Objects.equals(this.dataAssuranceCapable, poolQosResponse.dataAssuranceCapable) &&
        Objects.equals(this.encrypted, poolQosResponse.encrypted) &&
        Objects.equals(this.thinProvisioningCapable, poolQosResponse.thinProvisioningCapable) &&
        Objects.equals(this.spindleSpeed, poolQosResponse.spindleSpeed) &&
        Objects.equals(this.raidLevel, poolQosResponse.raidLevel) &&
        Objects.equals(this.availableFreeExtentCapacities, poolQosResponse.availableFreeExtentCapacities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolId, name, pool, flashCacheCapable, dataAssuranceCapable, encrypted, thinProvisioningCapable, spindleSpeed, raidLevel, availableFreeExtentCapacities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolQosResponse {\n");
    
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    flashCacheCapable: ").append(toIndentedString(flashCacheCapable)).append("\n");
    sb.append("    dataAssuranceCapable: ").append(toIndentedString(dataAssuranceCapable)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    thinProvisioningCapable: ").append(toIndentedString(thinProvisioningCapable)).append("\n");
    sb.append("    spindleSpeed: ").append(toIndentedString(spindleSpeed)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    availableFreeExtentCapacities: ").append(toIndentedString(availableFreeExtentCapacities)).append("\n");
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

