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
 * SSDWearLife
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SSDWearLife   {
  
    private Integer averageEraseCountPercent;

    private Integer spareBlocksRemainingPercent;

    private Boolean isWearLifeMonitoringSupported;

    private Integer percentEnduranceUsed;

  
  /**
   * The percentage of average erase count.
   **/
  public SSDWearLife averageEraseCountPercent(Integer averageEraseCountPercent) {
    this.averageEraseCountPercent = averageEraseCountPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The percentage of average erase count.")
  @JsonProperty("averageEraseCountPercent")
  public Integer getAverageEraseCountPercent() {
    return averageEraseCountPercent;
  }
  
  public void setAverageEraseCountPercent(Integer averageEraseCountPercent) {
    this.averageEraseCountPercent = averageEraseCountPercent;
  }

  
  /**
   * The percentage of spare blocks remaining in the solid state drive. Controller firmware checks and updates this percentage approximately once per hour.
   **/
  public SSDWearLife spareBlocksRemainingPercent(Integer spareBlocksRemainingPercent) {
    this.spareBlocksRemainingPercent = spareBlocksRemainingPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The percentage of spare blocks remaining in the solid state drive. Controller firmware checks and updates this percentage approximately once per hour.")
  @JsonProperty("spareBlocksRemainingPercent")
  public Integer getSpareBlocksRemainingPercent() {
    return spareBlocksRemainingPercent;
  }
  
  public void setSpareBlocksRemainingPercent(Integer spareBlocksRemainingPercent) {
    this.spareBlocksRemainingPercent = spareBlocksRemainingPercent;
  }

  
  /**
   * This field is set to true if wear life monitoring is supported on the drive. If true then the values in the other fields in this structure are valid, otherwise they are not valid.
   **/
  public SSDWearLife isWearLifeMonitoringSupported(Boolean isWearLifeMonitoringSupported) {
    this.isWearLifeMonitoringSupported = isWearLifeMonitoringSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is set to true if wear life monitoring is supported on the drive. If true then the values in the other fields in this structure are valid, otherwise they are not valid.")
  @JsonProperty("isWearLifeMonitoringSupported")
  public Boolean getIsWearLifeMonitoringSupported() {
    return isWearLifeMonitoringSupported;
  }
  
  public void setIsWearLifeMonitoringSupported(Boolean isWearLifeMonitoringSupported) {
    this.isWearLifeMonitoringSupported = isWearLifeMonitoringSupported;
  }

  
  /**
   * The percentage of endurance used for this drive. The value is obtained from the Solid State Media log page. A value of PERCENTAGE_ENDURANCE_USED_UNKNOWN indicates that the information is inaccessible or not populated in this release.
   **/
  public SSDWearLife percentEnduranceUsed(Integer percentEnduranceUsed) {
    this.percentEnduranceUsed = percentEnduranceUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The percentage of endurance used for this drive. The value is obtained from the Solid State Media log page. A value of PERCENTAGE_ENDURANCE_USED_UNKNOWN indicates that the information is inaccessible or not populated in this release.")
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
    SSDWearLife sSDWearLife = (SSDWearLife) o;
    return Objects.equals(this.averageEraseCountPercent, sSDWearLife.averageEraseCountPercent) &&
        Objects.equals(this.spareBlocksRemainingPercent, sSDWearLife.spareBlocksRemainingPercent) &&
        Objects.equals(this.isWearLifeMonitoringSupported, sSDWearLife.isWearLifeMonitoringSupported) &&
        Objects.equals(this.percentEnduranceUsed, sSDWearLife.percentEnduranceUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageEraseCountPercent, spareBlocksRemainingPercent, isWearLifeMonitoringSupported, percentEnduranceUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSDWearLife {\n");
    
    sb.append("    averageEraseCountPercent: ").append(toIndentedString(averageEraseCountPercent)).append("\n");
    sb.append("    spareBlocksRemainingPercent: ").append(toIndentedString(spareBlocksRemainingPercent)).append("\n");
    sb.append("    isWearLifeMonitoringSupported: ").append(toIndentedString(isWearLifeMonitoringSupported)).append("\n");
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

