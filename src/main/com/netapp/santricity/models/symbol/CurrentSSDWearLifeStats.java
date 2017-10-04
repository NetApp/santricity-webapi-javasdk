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
 * CurrentSSDWearLifeStats
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class CurrentSSDWearLifeStats   {
  
    private String driveRef;

    private Long availableBlockMappings;

    private Long usedBlockMappings;

    private Integer percentAvailableProvisioning;

    private Long hostWriteBlocks;

    private Long totalNANDWriteBlocks;

    private Integer powerOnHours;

    private Integer percentEnduranceRemaining;

    private Integer percentEnduranceUsed;

  
  /**
   * Drive reference the statuses are for.
   **/
  public CurrentSSDWearLifeStats driveRef(String driveRef) {
    this.driveRef = driveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Drive reference the statuses are for.")
  @JsonProperty("driveRef")
  public String getDriveRef() {
    return driveRef;
  }
  
  public void setDriveRef(String driveRef) {
    this.driveRef = driveRef;
  }

  
  /**
   * The available block mappings for the device.
   **/
  public CurrentSSDWearLifeStats availableBlockMappings(Long availableBlockMappings) {
    this.availableBlockMappings = availableBlockMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The available block mappings for the device.")
  @JsonProperty("availableBlockMappings")
  public Long getAvailableBlockMappings() {
    return availableBlockMappings;
  }
  
  public void setAvailableBlockMappings(Long availableBlockMappings) {
    this.availableBlockMappings = availableBlockMappings;
  }

  
  /**
   * The used block mappings for the device.
   **/
  public CurrentSSDWearLifeStats usedBlockMappings(Long usedBlockMappings) {
    this.usedBlockMappings = usedBlockMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The used block mappings for the device.")
  @JsonProperty("usedBlockMappings")
  public Long getUsedBlockMappings() {
    return usedBlockMappings;
  }
  
  public void setUsedBlockMappings(Long usedBlockMappings) {
    this.usedBlockMappings = usedBlockMappings;
  }

  
  /**
   * Percent of provisioning that is still available.
   **/
  public CurrentSSDWearLifeStats percentAvailableProvisioning(Integer percentAvailableProvisioning) {
    this.percentAvailableProvisioning = percentAvailableProvisioning;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Percent of provisioning that is still available.")
  @JsonProperty("percentAvailableProvisioning")
  public Integer getPercentAvailableProvisioning() {
    return percentAvailableProvisioning;
  }
  
  public void setPercentAvailableProvisioning(Integer percentAvailableProvisioning) {
    this.percentAvailableProvisioning = percentAvailableProvisioning;
  }

  
  /**
   * Total count of all Host Write Blocks processed.
   **/
  public CurrentSSDWearLifeStats hostWriteBlocks(Long hostWriteBlocks) {
    this.hostWriteBlocks = hostWriteBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total count of all Host Write Blocks processed.")
  @JsonProperty("hostWriteBlocks")
  public Long getHostWriteBlocks() {
    return hostWriteBlocks;
  }
  
  public void setHostWriteBlocks(Long hostWriteBlocks) {
    this.hostWriteBlocks = hostWriteBlocks;
  }

  
  /**
   * The total NAND Write Blocks received by the device.
   **/
  public CurrentSSDWearLifeStats totalNANDWriteBlocks(Long totalNANDWriteBlocks) {
    this.totalNANDWriteBlocks = totalNANDWriteBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total NAND Write Blocks received by the device.")
  @JsonProperty("totalNANDWriteBlocks")
  public Long getTotalNANDWriteBlocks() {
    return totalNANDWriteBlocks;
  }
  
  public void setTotalNANDWriteBlocks(Long totalNANDWriteBlocks) {
    this.totalNANDWriteBlocks = totalNANDWriteBlocks;
  }

  
  /**
   * Total hours the device has been powered on.
   **/
  public CurrentSSDWearLifeStats powerOnHours(Integer powerOnHours) {
    this.powerOnHours = powerOnHours;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total hours the device has been powered on.")
  @JsonProperty("powerOnHours")
  public Integer getPowerOnHours() {
    return powerOnHours;
  }
  
  public void setPowerOnHours(Integer powerOnHours) {
    this.powerOnHours = powerOnHours;
  }

  
  /**
   * Percent of endurance remaining.
   **/
  public CurrentSSDWearLifeStats percentEnduranceRemaining(Integer percentEnduranceRemaining) {
    this.percentEnduranceRemaining = percentEnduranceRemaining;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Percent of endurance remaining.")
  @JsonProperty("percentEnduranceRemaining")
  public Integer getPercentEnduranceRemaining() {
    return percentEnduranceRemaining;
  }
  
  public void setPercentEnduranceRemaining(Integer percentEnduranceRemaining) {
    this.percentEnduranceRemaining = percentEnduranceRemaining;
  }

  
  /**
   * Percent indicating an estimate of the life that has been used.
   **/
  public CurrentSSDWearLifeStats percentEnduranceUsed(Integer percentEnduranceUsed) {
    this.percentEnduranceUsed = percentEnduranceUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Percent indicating an estimate of the life that has been used.")
  @JsonProperty("percentEnduranceUsed")
  public Integer getPercentEnduranceUsed() {
    return percentEnduranceUsed;
  }
  
  public void setPercentEnduranceUsed(Integer percentEnduranceUsed) {
    this.percentEnduranceUsed = percentEnduranceUsed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentSSDWearLifeStats currentSSDWearLifeStats = (CurrentSSDWearLifeStats) o;
    return Objects.equals(this.driveRef, currentSSDWearLifeStats.driveRef) &&
        Objects.equals(this.availableBlockMappings, currentSSDWearLifeStats.availableBlockMappings) &&
        Objects.equals(this.usedBlockMappings, currentSSDWearLifeStats.usedBlockMappings) &&
        Objects.equals(this.percentAvailableProvisioning, currentSSDWearLifeStats.percentAvailableProvisioning) &&
        Objects.equals(this.hostWriteBlocks, currentSSDWearLifeStats.hostWriteBlocks) &&
        Objects.equals(this.totalNANDWriteBlocks, currentSSDWearLifeStats.totalNANDWriteBlocks) &&
        Objects.equals(this.powerOnHours, currentSSDWearLifeStats.powerOnHours) &&
        Objects.equals(this.percentEnduranceRemaining, currentSSDWearLifeStats.percentEnduranceRemaining) &&
        Objects.equals(this.percentEnduranceUsed, currentSSDWearLifeStats.percentEnduranceUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveRef, availableBlockMappings, usedBlockMappings, percentAvailableProvisioning, hostWriteBlocks, totalNANDWriteBlocks, powerOnHours, percentEnduranceRemaining, percentEnduranceUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentSSDWearLifeStats {\n");
    
    sb.append("    driveRef: ").append(toIndentedString(driveRef)).append("\n");
    sb.append("    availableBlockMappings: ").append(toIndentedString(availableBlockMappings)).append("\n");
    sb.append("    usedBlockMappings: ").append(toIndentedString(usedBlockMappings)).append("\n");
    sb.append("    percentAvailableProvisioning: ").append(toIndentedString(percentAvailableProvisioning)).append("\n");
    sb.append("    hostWriteBlocks: ").append(toIndentedString(hostWriteBlocks)).append("\n");
    sb.append("    totalNANDWriteBlocks: ").append(toIndentedString(totalNANDWriteBlocks)).append("\n");
    sb.append("    powerOnHours: ").append(toIndentedString(powerOnHours)).append("\n");
    sb.append("    percentEnduranceRemaining: ").append(toIndentedString(percentEnduranceRemaining)).append("\n");
    sb.append("    percentEnduranceUsed: ").append(toIndentedString(percentEnduranceUsed)).append("\n");
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

