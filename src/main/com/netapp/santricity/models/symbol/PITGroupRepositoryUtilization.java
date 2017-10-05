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
 * PITGroupRepositoryUtilization
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PITGroupRepositoryUtilization   {
  
    private Long pitGroupBytesUsed;

    private Long pitGroupBytesAvailable;

    private String groupRef;

    private List<PITRepositoryUtilization> pitUtilization;

  
  /**
   * The total number of bytes used in the repository for all PiTs in the group.
   **/
  public PITGroupRepositoryUtilization pitGroupBytesUsed(Long pitGroupBytesUsed) {
    this.pitGroupBytesUsed = pitGroupBytesUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of bytes used in the repository for all PiTs in the group.")
  @JsonProperty("pitGroupBytesUsed")
  public Long getPitGroupBytesUsed() {
    return pitGroupBytesUsed;
  }
  
  public void setPitGroupBytesUsed(Long pitGroupBytesUsed) {
    this.pitGroupBytesUsed = pitGroupBytesUsed;
  }

  
  /**
   * The total number of bytes available for ongoing copy-on-write operations.
   **/
  public PITGroupRepositoryUtilization pitGroupBytesAvailable(Long pitGroupBytesAvailable) {
    this.pitGroupBytesAvailable = pitGroupBytesAvailable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of bytes available for ongoing copy-on-write operations.")
  @JsonProperty("pitGroupBytesAvailable")
  public Long getPitGroupBytesAvailable() {
    return pitGroupBytesAvailable;
  }
  
  public void setPitGroupBytesAvailable(Long pitGroupBytesAvailable) {
    this.pitGroupBytesAvailable = pitGroupBytesAvailable;
  }

  
  /**
   * The PiT Group for which this utilization information applies.
   **/
  public PITGroupRepositoryUtilization groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The PiT Group for which this utilization information applies.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * The repository utilization of each specific PiT in the PiT group.
   **/
  public PITGroupRepositoryUtilization pitUtilization(List<PITRepositoryUtilization> pitUtilization) {
    this.pitUtilization = pitUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization of each specific PiT in the PiT group.")
  @JsonProperty("pitUtilization")
  public List<PITRepositoryUtilization> getPitUtilization() {
    return pitUtilization;
  }
  
  public void setPitUtilization(List<PITRepositoryUtilization> pitUtilization) {
    this.pitUtilization = pitUtilization;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITGroupRepositoryUtilization pITGroupRepositoryUtilization = (PITGroupRepositoryUtilization) o;
    return Objects.equals(this.pitGroupBytesUsed, pITGroupRepositoryUtilization.pitGroupBytesUsed) &&
        Objects.equals(this.pitGroupBytesAvailable, pITGroupRepositoryUtilization.pitGroupBytesAvailable) &&
        Objects.equals(this.groupRef, pITGroupRepositoryUtilization.groupRef) &&
        Objects.equals(this.pitUtilization, pITGroupRepositoryUtilization.pitUtilization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pitGroupBytesUsed, pitGroupBytesAvailable, groupRef, pitUtilization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITGroupRepositoryUtilization {\n");
    
    sb.append("    pitGroupBytesUsed: ").append(toIndentedString(pitGroupBytesUsed)).append("\n");
    sb.append("    pitGroupBytesAvailable: ").append(toIndentedString(pitGroupBytesAvailable)).append("\n");
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    pitUtilization: ").append(toIndentedString(pitUtilization)).append("\n");
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

