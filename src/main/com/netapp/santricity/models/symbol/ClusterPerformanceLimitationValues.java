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
 * ClusterPerformanceLimitationValues
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ClusterPerformanceLimitationValues   {
  
    private String clusterRef;

    private Long maxIopsPermittedOnCluster;

    private Long maxMBsPermittedOnCluster;

    private Long iopsImpactedByLimitationsOnThisCluster;

  
  /**
   * This is a reference to the cluster for which the parameters apply.
   **/
  public ClusterPerformanceLimitationValues clusterRef(String clusterRef) {
    this.clusterRef = clusterRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is a reference to the cluster for which the parameters apply.")
  @JsonProperty("clusterRef")
  public String getClusterRef() {
    return clusterRef;
  }
  
  public void setClusterRef(String clusterRef) {
    this.clusterRef = clusterRef;
  }

  
  /**
   * This is the maximum number of IOPs permitted on this cluster.
   **/
  public ClusterPerformanceLimitationValues maxIopsPermittedOnCluster(Long maxIopsPermittedOnCluster) {
    this.maxIopsPermittedOnCluster = maxIopsPermittedOnCluster;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the maximum number of IOPs permitted on this cluster.")
  @JsonProperty("maxIopsPermittedOnCluster")
  public Long getMaxIopsPermittedOnCluster() {
    return maxIopsPermittedOnCluster;
  }
  
  public void setMaxIopsPermittedOnCluster(Long maxIopsPermittedOnCluster) {
    this.maxIopsPermittedOnCluster = maxIopsPermittedOnCluster;
  }

  
  /**
   * This is the maximum number of MB per second permitted on this cluster.
   **/
  public ClusterPerformanceLimitationValues maxMBsPermittedOnCluster(Long maxMBsPermittedOnCluster) {
    this.maxMBsPermittedOnCluster = maxMBsPermittedOnCluster;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the maximum number of MB per second permitted on this cluster.")
  @JsonProperty("maxMBsPermittedOnCluster")
  public Long getMaxMBsPermittedOnCluster() {
    return maxMBsPermittedOnCluster;
  }
  
  public void setMaxMBsPermittedOnCluster(Long maxMBsPermittedOnCluster) {
    this.maxMBsPermittedOnCluster = maxMBsPermittedOnCluster;
  }

  
  /**
   * This is a count of the number of IOPs that have been impacted by the performance limitations set on this cluster.
   **/
  public ClusterPerformanceLimitationValues iopsImpactedByLimitationsOnThisCluster(Long iopsImpactedByLimitationsOnThisCluster) {
    this.iopsImpactedByLimitationsOnThisCluster = iopsImpactedByLimitationsOnThisCluster;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is a count of the number of IOPs that have been impacted by the performance limitations set on this cluster.")
  @JsonProperty("iopsImpactedByLimitationsOnThisCluster")
  public Long getIopsImpactedByLimitationsOnThisCluster() {
    return iopsImpactedByLimitationsOnThisCluster;
  }
  
  public void setIopsImpactedByLimitationsOnThisCluster(Long iopsImpactedByLimitationsOnThisCluster) {
    this.iopsImpactedByLimitationsOnThisCluster = iopsImpactedByLimitationsOnThisCluster;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterPerformanceLimitationValues clusterPerformanceLimitationValues = (ClusterPerformanceLimitationValues) o;
    return Objects.equals(this.clusterRef, clusterPerformanceLimitationValues.clusterRef) &&
        Objects.equals(this.maxIopsPermittedOnCluster, clusterPerformanceLimitationValues.maxIopsPermittedOnCluster) &&
        Objects.equals(this.maxMBsPermittedOnCluster, clusterPerformanceLimitationValues.maxMBsPermittedOnCluster) &&
        Objects.equals(this.iopsImpactedByLimitationsOnThisCluster, clusterPerformanceLimitationValues.iopsImpactedByLimitationsOnThisCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRef, maxIopsPermittedOnCluster, maxMBsPermittedOnCluster, iopsImpactedByLimitationsOnThisCluster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterPerformanceLimitationValues {\n");
    
    sb.append("    clusterRef: ").append(toIndentedString(clusterRef)).append("\n");
    sb.append("    maxIopsPermittedOnCluster: ").append(toIndentedString(maxIopsPermittedOnCluster)).append("\n");
    sb.append("    maxMBsPermittedOnCluster: ").append(toIndentedString(maxMBsPermittedOnCluster)).append("\n");
    sb.append("    iopsImpactedByLimitationsOnThisCluster: ").append(toIndentedString(iopsImpactedByLimitationsOnThisCluster)).append("\n");
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

