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
 * DPLCoreDumpData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DPLCoreDumpData   {
  
    private Integer dplCoreDumpTag;

    private Boolean dplCoreDumpNeedsRetrieved;

    private Boolean dplCoreDumpEnabled;

    private Long timeStamp;

  
  /**
   * The tag value of the DPL core dump currently in controller memory. Each core dump has a unique tag value. A value of DPL_CORE_DUMP_NULL_TAG indicates there is no DPL core dump to retrieve.
   **/
  public DPLCoreDumpData dplCoreDumpTag(Integer dplCoreDumpTag) {
    this.dplCoreDumpTag = dplCoreDumpTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The tag value of the DPL core dump currently in controller memory. Each core dump has a unique tag value. A value of DPL_CORE_DUMP_NULL_TAG indicates there is no DPL core dump to retrieve.")
  @JsonProperty("dplCoreDumpTag")
  public Integer getDplCoreDumpTag() {
    return dplCoreDumpTag;
  }
  
  public void setDplCoreDumpTag(Integer dplCoreDumpTag) {
    this.dplCoreDumpTag = dplCoreDumpTag;
  }

  
  /**
   * If true, a DPL core dump currently exists in controller memory and has not been retrieved.
   **/
  public DPLCoreDumpData dplCoreDumpNeedsRetrieved(Boolean dplCoreDumpNeedsRetrieved) {
    this.dplCoreDumpNeedsRetrieved = dplCoreDumpNeedsRetrieved;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, a DPL core dump currently exists in controller memory and has not been retrieved.")
  @JsonProperty("dplCoreDumpNeedsRetrieved")
  public Boolean getDplCoreDumpNeedsRetrieved() {
    return dplCoreDumpNeedsRetrieved;
  }
  
  public void setDplCoreDumpNeedsRetrieved(Boolean dplCoreDumpNeedsRetrieved) {
    this.dplCoreDumpNeedsRetrieved = dplCoreDumpNeedsRetrieved;
  }

  
  /**
   * If true, DPL Core Dump is enabled in the controller.
   **/
  public DPLCoreDumpData dplCoreDumpEnabled(Boolean dplCoreDumpEnabled) {
    this.dplCoreDumpEnabled = dplCoreDumpEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, DPL Core Dump is enabled in the controller.")
  @JsonProperty("dplCoreDumpEnabled")
  public Boolean getDplCoreDumpEnabled() {
    return dplCoreDumpEnabled;
  }
  
  public void setDplCoreDumpEnabled(Boolean dplCoreDumpEnabled) {
    this.dplCoreDumpEnabled = dplCoreDumpEnabled;
  }

  
  /**
   * The time that the core dump was collected measured in seconds since midnight GMT on January 1, 1970.
   **/
  public DPLCoreDumpData timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time that the core dump was collected measured in seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("timeStamp")
  public Long getTimeStamp() {
    return timeStamp;
  }
  
  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DPLCoreDumpData dPLCoreDumpData = (DPLCoreDumpData) o;
    return Objects.equals(this.dplCoreDumpTag, dPLCoreDumpData.dplCoreDumpTag) &&
        Objects.equals(this.dplCoreDumpNeedsRetrieved, dPLCoreDumpData.dplCoreDumpNeedsRetrieved) &&
        Objects.equals(this.dplCoreDumpEnabled, dPLCoreDumpData.dplCoreDumpEnabled) &&
        Objects.equals(this.timeStamp, dPLCoreDumpData.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dplCoreDumpTag, dplCoreDumpNeedsRetrieved, dplCoreDumpEnabled, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DPLCoreDumpData {\n");
    
    sb.append("    dplCoreDumpTag: ").append(toIndentedString(dplCoreDumpTag)).append("\n");
    sb.append("    dplCoreDumpNeedsRetrieved: ").append(toIndentedString(dplCoreDumpNeedsRetrieved)).append("\n");
    sb.append("    dplCoreDumpEnabled: ").append(toIndentedString(dplCoreDumpEnabled)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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

