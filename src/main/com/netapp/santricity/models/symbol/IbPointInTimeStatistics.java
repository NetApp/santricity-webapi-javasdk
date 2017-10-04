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
 * IbPointInTimeStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IbPointInTimeStatistics   {
  
    private Long timeOfReading;

    private List<IbTcaStatistics> ibTcaStatistics;

    private List<IbRdmaChannelStatistics> ibRdmaChannelStatistics;

  
  /**
   * A timestamp, expressed as number of seconds since midnight GMT on January 1, 1970, which is the time at which the statistics were read by the controller firmware.
   **/
  public IbPointInTimeStatistics timeOfReading(Long timeOfReading) {
    this.timeOfReading = timeOfReading;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A timestamp, expressed as number of seconds since midnight GMT on January 1, 1970, which is the time at which the statistics were read by the controller firmware.")
  @JsonProperty("timeOfReading")
  public Long getTimeOfReading() {
    return timeOfReading;
  }
  
  public void setTimeOfReading(Long timeOfReading) {
    this.timeOfReading = timeOfReading;
  }

  
  /**
   * An array of structures containing the IB TCA statistics, one structure per TCA (i.e., InfiniBand host board).
   **/
  public IbPointInTimeStatistics ibTcaStatistics(List<IbTcaStatistics> ibTcaStatistics) {
    this.ibTcaStatistics = ibTcaStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of structures containing the IB TCA statistics, one structure per TCA (i.e., InfiniBand host board).")
  @JsonProperty("ibTcaStatistics")
  public List<IbTcaStatistics> getIbTcaStatistics() {
    return ibTcaStatistics;
  }
  
  public void setIbTcaStatistics(List<IbTcaStatistics> ibTcaStatistics) {
    this.ibTcaStatistics = ibTcaStatistics;
  }

  
  /**
   * An array of structures containing the IB RDMA channel statistics, one structure per RDMA channel.
   **/
  public IbPointInTimeStatistics ibRdmaChannelStatistics(List<IbRdmaChannelStatistics> ibRdmaChannelStatistics) {
    this.ibRdmaChannelStatistics = ibRdmaChannelStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of structures containing the IB RDMA channel statistics, one structure per RDMA channel.")
  @JsonProperty("ibRdmaChannelStatistics")
  public List<IbRdmaChannelStatistics> getIbRdmaChannelStatistics() {
    return ibRdmaChannelStatistics;
  }
  
  public void setIbRdmaChannelStatistics(List<IbRdmaChannelStatistics> ibRdmaChannelStatistics) {
    this.ibRdmaChannelStatistics = ibRdmaChannelStatistics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbPointInTimeStatistics ibPointInTimeStatistics = (IbPointInTimeStatistics) o;
    return Objects.equals(this.timeOfReading, ibPointInTimeStatistics.timeOfReading) &&
        Objects.equals(this.ibTcaStatistics, ibPointInTimeStatistics.ibTcaStatistics) &&
        Objects.equals(this.ibRdmaChannelStatistics, ibPointInTimeStatistics.ibRdmaChannelStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOfReading, ibTcaStatistics, ibRdmaChannelStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbPointInTimeStatistics {\n");
    
    sb.append("    timeOfReading: ").append(toIndentedString(timeOfReading)).append("\n");
    sb.append("    ibTcaStatistics: ").append(toIndentedString(ibTcaStatistics)).append("\n");
    sb.append("    ibRdmaChannelStatistics: ").append(toIndentedString(ibRdmaChannelStatistics)).append("\n");
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

