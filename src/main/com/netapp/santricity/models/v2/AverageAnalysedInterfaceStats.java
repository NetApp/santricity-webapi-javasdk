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
 * The statistics for an interface averaged over a time range.
 */
@ApiModel(description = "The statistics for an interface averaged over a time range.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class AverageAnalysedInterfaceStats   {
  
    private String id;

    private AverageAnalysedValue latencyRead;

    private AverageAnalysedValue latencyWrite;

    private AverageAnalysedValue iopsRead;

    private AverageAnalysedValue iopsWrite;

    private AverageAnalysedValue throughputRead;

    private AverageAnalysedValue throughputWrite;

    private AverageAnalysedValue headroomPct;

  
  /**
   **/
  public AverageAnalysedInterfaceStats id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public AverageAnalysedInterfaceStats latencyRead(AverageAnalysedValue latencyRead) {
    this.latencyRead = latencyRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("latencyRead")
  public AverageAnalysedValue getLatencyRead() {
    return latencyRead;
  }
  
  public void setLatencyRead(AverageAnalysedValue latencyRead) {
    this.latencyRead = latencyRead;
  }

  
  /**
   **/
  public AverageAnalysedInterfaceStats latencyWrite(AverageAnalysedValue latencyWrite) {
    this.latencyWrite = latencyWrite;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("latencyWrite")
  public AverageAnalysedValue getLatencyWrite() {
    return latencyWrite;
  }
  
  public void setLatencyWrite(AverageAnalysedValue latencyWrite) {
    this.latencyWrite = latencyWrite;
  }

  
  /**
   **/
  public AverageAnalysedInterfaceStats iopsRead(AverageAnalysedValue iopsRead) {
    this.iopsRead = iopsRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("iopsRead")
  public AverageAnalysedValue getIopsRead() {
    return iopsRead;
  }
  
  public void setIopsRead(AverageAnalysedValue iopsRead) {
    this.iopsRead = iopsRead;
  }

  
  /**
   **/
  public AverageAnalysedInterfaceStats iopsWrite(AverageAnalysedValue iopsWrite) {
    this.iopsWrite = iopsWrite;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("iopsWrite")
  public AverageAnalysedValue getIopsWrite() {
    return iopsWrite;
  }
  
  public void setIopsWrite(AverageAnalysedValue iopsWrite) {
    this.iopsWrite = iopsWrite;
  }

  
  /**
   **/
  public AverageAnalysedInterfaceStats throughputRead(AverageAnalysedValue throughputRead) {
    this.throughputRead = throughputRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("throughputRead")
  public AverageAnalysedValue getThroughputRead() {
    return throughputRead;
  }
  
  public void setThroughputRead(AverageAnalysedValue throughputRead) {
    this.throughputRead = throughputRead;
  }

  
  /**
   **/
  public AverageAnalysedInterfaceStats throughputWrite(AverageAnalysedValue throughputWrite) {
    this.throughputWrite = throughputWrite;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("throughputWrite")
  public AverageAnalysedValue getThroughputWrite() {
    return throughputWrite;
  }
  
  public void setThroughputWrite(AverageAnalysedValue throughputWrite) {
    this.throughputWrite = throughputWrite;
  }

  
  /**
   **/
  public AverageAnalysedInterfaceStats headroomPct(AverageAnalysedValue headroomPct) {
    this.headroomPct = headroomPct;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("headroomPct")
  public AverageAnalysedValue getHeadroomPct() {
    return headroomPct;
  }
  
  public void setHeadroomPct(AverageAnalysedValue headroomPct) {
    this.headroomPct = headroomPct;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AverageAnalysedInterfaceStats averageAnalysedInterfaceStats = (AverageAnalysedInterfaceStats) o;
    return Objects.equals(this.id, averageAnalysedInterfaceStats.id) &&
        Objects.equals(this.latencyRead, averageAnalysedInterfaceStats.latencyRead) &&
        Objects.equals(this.latencyWrite, averageAnalysedInterfaceStats.latencyWrite) &&
        Objects.equals(this.iopsRead, averageAnalysedInterfaceStats.iopsRead) &&
        Objects.equals(this.iopsWrite, averageAnalysedInterfaceStats.iopsWrite) &&
        Objects.equals(this.throughputRead, averageAnalysedInterfaceStats.throughputRead) &&
        Objects.equals(this.throughputWrite, averageAnalysedInterfaceStats.throughputWrite) &&
        Objects.equals(this.headroomPct, averageAnalysedInterfaceStats.headroomPct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, latencyRead, latencyWrite, iopsRead, iopsWrite, throughputRead, throughputWrite, headroomPct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AverageAnalysedInterfaceStats {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latencyRead: ").append(toIndentedString(latencyRead)).append("\n");
    sb.append("    latencyWrite: ").append(toIndentedString(latencyWrite)).append("\n");
    sb.append("    iopsRead: ").append(toIndentedString(iopsRead)).append("\n");
    sb.append("    iopsWrite: ").append(toIndentedString(iopsWrite)).append("\n");
    sb.append("    throughputRead: ").append(toIndentedString(throughputRead)).append("\n");
    sb.append("    throughputWrite: ").append(toIndentedString(throughputWrite)).append("\n");
    sb.append("    headroomPct: ").append(toIndentedString(headroomPct)).append("\n");
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

