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
 * IOCDumpData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IOCDumpData   {
  
    private Boolean iocDumpEnabled;

    private Boolean iocDumpNeedsRetrieved;

    private Integer iocDumpTag;

    private Long timeStamp;

  
  /**
   * If true, IOC Dump is enabled in the controller.
   **/
  public IOCDumpData iocDumpEnabled(Boolean iocDumpEnabled) {
    this.iocDumpEnabled = iocDumpEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, IOC Dump is enabled in the controller.")
  @JsonProperty("iocDumpEnabled")
  public Boolean getIocDumpEnabled() {
    return iocDumpEnabled;
  }
  
  public void setIocDumpEnabled(Boolean iocDumpEnabled) {
    this.iocDumpEnabled = iocDumpEnabled;
  }

  
  /**
   * If true, an IOC Dump currently exists in controller memory and has not been retrieved.
   **/
  public IOCDumpData iocDumpNeedsRetrieved(Boolean iocDumpNeedsRetrieved) {
    this.iocDumpNeedsRetrieved = iocDumpNeedsRetrieved;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, an IOC Dump currently exists in controller memory and has not been retrieved.")
  @JsonProperty("iocDumpNeedsRetrieved")
  public Boolean getIocDumpNeedsRetrieved() {
    return iocDumpNeedsRetrieved;
  }
  
  public void setIocDumpNeedsRetrieved(Boolean iocDumpNeedsRetrieved) {
    this.iocDumpNeedsRetrieved = iocDumpNeedsRetrieved;
  }

  
  /**
   * The tag value of the IOC Dump currently in controller memory. Each dump has a unique tag value. A value of IOC_DUMP_NULL_TAG indicates there is no IOC Dump to retrieve.
   **/
  public IOCDumpData iocDumpTag(Integer iocDumpTag) {
    this.iocDumpTag = iocDumpTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The tag value of the IOC Dump currently in controller memory. Each dump has a unique tag value. A value of IOC_DUMP_NULL_TAG indicates there is no IOC Dump to retrieve.")
  @JsonProperty("iocDumpTag")
  public Integer getIocDumpTag() {
    return iocDumpTag;
  }
  
  public void setIocDumpTag(Integer iocDumpTag) {
    this.iocDumpTag = iocDumpTag;
  }

  
  /**
   * The time that the dump was collected measured in seconds since midnight GMT on January 1, 1970.
   **/
  public IOCDumpData timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time that the dump was collected measured in seconds since midnight GMT on January 1, 1970.")
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
    IOCDumpData iOCDumpData = (IOCDumpData) o;
    return Objects.equals(this.iocDumpEnabled, iOCDumpData.iocDumpEnabled) &&
        Objects.equals(this.iocDumpNeedsRetrieved, iOCDumpData.iocDumpNeedsRetrieved) &&
        Objects.equals(this.iocDumpTag, iOCDumpData.iocDumpTag) &&
        Objects.equals(this.timeStamp, iOCDumpData.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iocDumpEnabled, iocDumpNeedsRetrieved, iocDumpTag, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IOCDumpData {\n");
    
    sb.append("    iocDumpEnabled: ").append(toIndentedString(iocDumpEnabled)).append("\n");
    sb.append("    iocDumpNeedsRetrieved: ").append(toIndentedString(iocDumpNeedsRetrieved)).append("\n");
    sb.append("    iocDumpTag: ").append(toIndentedString(iocDumpTag)).append("\n");
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

