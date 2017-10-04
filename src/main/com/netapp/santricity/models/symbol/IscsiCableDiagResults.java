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
 * IscsiCableDiagResults
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IscsiCableDiagResults   {
  
    private Long timeStamp;

    private String interfaceRef;


  /**
   * The completion status for the diagnostics.
   */
  public enum CompletionStatusEnum {
    unknown("unknown"),
    complete("complete"),
    startFailed("startFailed"),
    unsupported("unsupported"),
    timeout("timeout"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CompletionStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CompletionStatusEnum completionStatus;

    private List<IscsiCableDiagChannelResults> channelResults;

  
  /**
   * The time the diagnostics were performed, represented in seconds since midnight GMT on January 1, 1970.
   **/
  public IscsiCableDiagResults timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time the diagnostics were performed, represented in seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("timeStamp")
  public Long getTimeStamp() {
    return timeStamp;
  }
  
  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }

  
  /**
   * A reference to the interface on which the diagnostics were performed.
   **/
  public IscsiCableDiagResults interfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the interface on which the diagnostics were performed.")
  @JsonProperty("interfaceRef")
  public String getInterfaceRef() {
    return interfaceRef;
  }
  
  public void setInterfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
  }

  
  /**
   * The completion status for the diagnostics.
   **/
  public IscsiCableDiagResults completionStatus(CompletionStatusEnum completionStatus) {
    this.completionStatus = completionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The completion status for the diagnostics.")
  @JsonProperty("completionStatus")
  public CompletionStatusEnum getCompletionStatus() {
    return completionStatus;
  }
  
  public void setCompletionStatus(CompletionStatusEnum completionStatus) {
    this.completionStatus = completionStatus;
  }

  
  /**
   * The diagnostic results for each channel. This array will be empty unless the diagnostics completed, i.e., completionStatus is equal to ISCSI_DIAG_STATUS_COMPLETE.
   **/
  public IscsiCableDiagResults channelResults(List<IscsiCableDiagChannelResults> channelResults) {
    this.channelResults = channelResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The diagnostic results for each channel. This array will be empty unless the diagnostics completed, i.e., completionStatus is equal to ISCSI_DIAG_STATUS_COMPLETE.")
  @JsonProperty("channelResults")
  public List<IscsiCableDiagChannelResults> getChannelResults() {
    return channelResults;
  }
  
  public void setChannelResults(List<IscsiCableDiagChannelResults> channelResults) {
    this.channelResults = channelResults;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiCableDiagResults iscsiCableDiagResults = (IscsiCableDiagResults) o;
    return Objects.equals(this.timeStamp, iscsiCableDiagResults.timeStamp) &&
        Objects.equals(this.interfaceRef, iscsiCableDiagResults.interfaceRef) &&
        Objects.equals(this.completionStatus, iscsiCableDiagResults.completionStatus) &&
        Objects.equals(this.channelResults, iscsiCableDiagResults.channelResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeStamp, interfaceRef, completionStatus, channelResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiCableDiagResults {\n");
    
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    channelResults: ").append(toIndentedString(channelResults)).append("\n");
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

