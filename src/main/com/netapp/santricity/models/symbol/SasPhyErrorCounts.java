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
 * SasPhyErrorCounts
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SasPhyErrorCounts   {
  
    private Integer invalidDwordCount;

    private Integer runningDisparityErrorCount;

    private Integer lossOfDwordSyncCount;

    private Integer resetProblemCount;

  
  /**
   * The number of invalid dwords that have been received outside of PHY reset sequences.
   **/
  public SasPhyErrorCounts invalidDwordCount(Integer invalidDwordCount) {
    this.invalidDwordCount = invalidDwordCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of invalid dwords that have been received outside of PHY reset sequences.")
  @JsonProperty("invalidDwordCount")
  public Integer getInvalidDwordCount() {
    return invalidDwordCount;
  }
  
  public void setInvalidDwordCount(Integer invalidDwordCount) {
    this.invalidDwordCount = invalidDwordCount;
  }

  
  /**
   * The number of dwords containing running disparity errors that have been received outside of PHY reset sequences.
   **/
  public SasPhyErrorCounts runningDisparityErrorCount(Integer runningDisparityErrorCount) {
    this.runningDisparityErrorCount = runningDisparityErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of dwords containing running disparity errors that have been received outside of PHY reset sequences.")
  @JsonProperty("runningDisparityErrorCount")
  public Integer getRunningDisparityErrorCount() {
    return runningDisparityErrorCount;
  }
  
  public void setRunningDisparityErrorCount(Integer runningDisparityErrorCount) {
    this.runningDisparityErrorCount = runningDisparityErrorCount;
  }

  
  /**
   * The number of times the PHY has restarted the link reset sequence because it lost dword synchronization.
   **/
  public SasPhyErrorCounts lossOfDwordSyncCount(Integer lossOfDwordSyncCount) {
    this.lossOfDwordSyncCount = lossOfDwordSyncCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times the PHY has restarted the link reset sequence because it lost dword synchronization.")
  @JsonProperty("lossOfDwordSyncCount")
  public Integer getLossOfDwordSyncCount() {
    return lossOfDwordSyncCount;
  }
  
  public void setLossOfDwordSyncCount(Integer lossOfDwordSyncCount) {
    this.lossOfDwordSyncCount = lossOfDwordSyncCount;
  }

  
  /**
   * The number of times the PHY did not receive dword synchronization during the final SAS speed negotiation window.
   **/
  public SasPhyErrorCounts resetProblemCount(Integer resetProblemCount) {
    this.resetProblemCount = resetProblemCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times the PHY did not receive dword synchronization during the final SAS speed negotiation window.")
  @JsonProperty("resetProblemCount")
  public Integer getResetProblemCount() {
    return resetProblemCount;
  }
  
  public void setResetProblemCount(Integer resetProblemCount) {
    this.resetProblemCount = resetProblemCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasPhyErrorCounts sasPhyErrorCounts = (SasPhyErrorCounts) o;
    return Objects.equals(this.invalidDwordCount, sasPhyErrorCounts.invalidDwordCount) &&
        Objects.equals(this.runningDisparityErrorCount, sasPhyErrorCounts.runningDisparityErrorCount) &&
        Objects.equals(this.lossOfDwordSyncCount, sasPhyErrorCounts.lossOfDwordSyncCount) &&
        Objects.equals(this.resetProblemCount, sasPhyErrorCounts.resetProblemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidDwordCount, runningDisparityErrorCount, lossOfDwordSyncCount, resetProblemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasPhyErrorCounts {\n");
    
    sb.append("    invalidDwordCount: ").append(toIndentedString(invalidDwordCount)).append("\n");
    sb.append("    runningDisparityErrorCount: ").append(toIndentedString(runningDisparityErrorCount)).append("\n");
    sb.append("    lossOfDwordSyncCount: ").append(toIndentedString(lossOfDwordSyncCount)).append("\n");
    sb.append("    resetProblemCount: ").append(toIndentedString(resetProblemCount)).append("\n");
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

