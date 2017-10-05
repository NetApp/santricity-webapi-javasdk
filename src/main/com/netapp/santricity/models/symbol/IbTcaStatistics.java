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
 * IbTcaStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IbTcaStatistics   {
  
    private String hostBoardRef;

    private Long maximumQpairsUsedSimultaneously;

    private Long minimumQpairsUsedSimultaneously;

    private Long averageQpairsUsedSimultaneously;

    private Long maximumDepthOfAnyQpair;

    private Long minimumDepthOfAnyQpair;

    private Long averageDepthOfAnyQpair;

  
  /**
   * A reference to the host board for which the statistics apply.
   **/
  public IbTcaStatistics hostBoardRef(String hostBoardRef) {
    this.hostBoardRef = hostBoardRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the host board for which the statistics apply.")
  @JsonProperty("hostBoardRef")
  public String getHostBoardRef() {
    return hostBoardRef;
  }
  
  public void setHostBoardRef(String hostBoardRef) {
    this.hostBoardRef = hostBoardRef;
  }

  
  /**
   * The maximum number of queue pairs that were in use simultaneously.
   **/
  public IbTcaStatistics maximumQpairsUsedSimultaneously(Long maximumQpairsUsedSimultaneously) {
    this.maximumQpairsUsedSimultaneously = maximumQpairsUsedSimultaneously;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum number of queue pairs that were in use simultaneously.")
  @JsonProperty("maximumQpairsUsedSimultaneously")
  public Long getMaximumQpairsUsedSimultaneously() {
    return maximumQpairsUsedSimultaneously;
  }
  
  public void setMaximumQpairsUsedSimultaneously(Long maximumQpairsUsedSimultaneously) {
    this.maximumQpairsUsedSimultaneously = maximumQpairsUsedSimultaneously;
  }

  
  /**
   * The minimum number of queue pairs that were in use simultaneously.
   **/
  public IbTcaStatistics minimumQpairsUsedSimultaneously(Long minimumQpairsUsedSimultaneously) {
    this.minimumQpairsUsedSimultaneously = minimumQpairsUsedSimultaneously;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum number of queue pairs that were in use simultaneously.")
  @JsonProperty("minimumQpairsUsedSimultaneously")
  public Long getMinimumQpairsUsedSimultaneously() {
    return minimumQpairsUsedSimultaneously;
  }
  
  public void setMinimumQpairsUsedSimultaneously(Long minimumQpairsUsedSimultaneously) {
    this.minimumQpairsUsedSimultaneously = minimumQpairsUsedSimultaneously;
  }

  
  /**
   * The average number of queue pairs that were in use simultaneously.
   **/
  public IbTcaStatistics averageQpairsUsedSimultaneously(Long averageQpairsUsedSimultaneously) {
    this.averageQpairsUsedSimultaneously = averageQpairsUsedSimultaneously;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The average number of queue pairs that were in use simultaneously.")
  @JsonProperty("averageQpairsUsedSimultaneously")
  public Long getAverageQpairsUsedSimultaneously() {
    return averageQpairsUsedSimultaneously;
  }
  
  public void setAverageQpairsUsedSimultaneously(Long averageQpairsUsedSimultaneously) {
    this.averageQpairsUsedSimultaneously = averageQpairsUsedSimultaneously;
  }

  
  /**
   * The maximum depth attained by any queue pair of the TCA.
   **/
  public IbTcaStatistics maximumDepthOfAnyQpair(Long maximumDepthOfAnyQpair) {
    this.maximumDepthOfAnyQpair = maximumDepthOfAnyQpair;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum depth attained by any queue pair of the TCA.")
  @JsonProperty("maximumDepthOfAnyQpair")
  public Long getMaximumDepthOfAnyQpair() {
    return maximumDepthOfAnyQpair;
  }
  
  public void setMaximumDepthOfAnyQpair(Long maximumDepthOfAnyQpair) {
    this.maximumDepthOfAnyQpair = maximumDepthOfAnyQpair;
  }

  
  /**
   * The minimum depth attained by any queue pair of the TCA.
   **/
  public IbTcaStatistics minimumDepthOfAnyQpair(Long minimumDepthOfAnyQpair) {
    this.minimumDepthOfAnyQpair = minimumDepthOfAnyQpair;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum depth attained by any queue pair of the TCA.")
  @JsonProperty("minimumDepthOfAnyQpair")
  public Long getMinimumDepthOfAnyQpair() {
    return minimumDepthOfAnyQpair;
  }
  
  public void setMinimumDepthOfAnyQpair(Long minimumDepthOfAnyQpair) {
    this.minimumDepthOfAnyQpair = minimumDepthOfAnyQpair;
  }

  
  /**
   * The average depth attained across all queue pairs of the TCA.
   **/
  public IbTcaStatistics averageDepthOfAnyQpair(Long averageDepthOfAnyQpair) {
    this.averageDepthOfAnyQpair = averageDepthOfAnyQpair;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The average depth attained across all queue pairs of the TCA.")
  @JsonProperty("averageDepthOfAnyQpair")
  public Long getAverageDepthOfAnyQpair() {
    return averageDepthOfAnyQpair;
  }
  
  public void setAverageDepthOfAnyQpair(Long averageDepthOfAnyQpair) {
    this.averageDepthOfAnyQpair = averageDepthOfAnyQpair;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbTcaStatistics ibTcaStatistics = (IbTcaStatistics) o;
    return Objects.equals(this.hostBoardRef, ibTcaStatistics.hostBoardRef) &&
        Objects.equals(this.maximumQpairsUsedSimultaneously, ibTcaStatistics.maximumQpairsUsedSimultaneously) &&
        Objects.equals(this.minimumQpairsUsedSimultaneously, ibTcaStatistics.minimumQpairsUsedSimultaneously) &&
        Objects.equals(this.averageQpairsUsedSimultaneously, ibTcaStatistics.averageQpairsUsedSimultaneously) &&
        Objects.equals(this.maximumDepthOfAnyQpair, ibTcaStatistics.maximumDepthOfAnyQpair) &&
        Objects.equals(this.minimumDepthOfAnyQpair, ibTcaStatistics.minimumDepthOfAnyQpair) &&
        Objects.equals(this.averageDepthOfAnyQpair, ibTcaStatistics.averageDepthOfAnyQpair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostBoardRef, maximumQpairsUsedSimultaneously, minimumQpairsUsedSimultaneously, averageQpairsUsedSimultaneously, maximumDepthOfAnyQpair, minimumDepthOfAnyQpair, averageDepthOfAnyQpair);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbTcaStatistics {\n");
    
    sb.append("    hostBoardRef: ").append(toIndentedString(hostBoardRef)).append("\n");
    sb.append("    maximumQpairsUsedSimultaneously: ").append(toIndentedString(maximumQpairsUsedSimultaneously)).append("\n");
    sb.append("    minimumQpairsUsedSimultaneously: ").append(toIndentedString(minimumQpairsUsedSimultaneously)).append("\n");
    sb.append("    averageQpairsUsedSimultaneously: ").append(toIndentedString(averageQpairsUsedSimultaneously)).append("\n");
    sb.append("    maximumDepthOfAnyQpair: ").append(toIndentedString(maximumDepthOfAnyQpair)).append("\n");
    sb.append("    minimumDepthOfAnyQpair: ").append(toIndentedString(minimumDepthOfAnyQpair)).append("\n");
    sb.append("    averageDepthOfAnyQpair: ").append(toIndentedString(averageDepthOfAnyQpair)).append("\n");
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

