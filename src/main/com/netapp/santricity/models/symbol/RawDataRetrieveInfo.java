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
 * RawDataRetrieveInfo
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class RawDataRetrieveInfo   {
  

  /**
   * The data transfer type.
   */
  public enum TypeEnum {
    unknown("unknown"),
    dq("dq"),
    dbmblk("dbmblk"),
    dbmrec("dbmrec"),
    dbmCheck("dbmCheck"),
    enclosureStateCapture("enclosureStateCapture"),
    dplCoreDumpBundle("dplCoreDumpBundle"),
    ioStatistics("ioStatistics"),
    fdiDemsLogs("fdiDemsLogs"),
    drivePerformanceHistory("drivePerformanceHistory"),
    iocDump("iocDump"),
    driveHealthLogs("driveHealthLogs"),
    ctrlPerfLogs("ctrlPerfLogs"),
    dom0SupportData("dom0SupportData"),
    retrieveWlcAnalytics("retrieveWlcAnalytics"),
    autoLoadBalanceStatisticsLog("autoLoadBalanceStatisticsLog"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TypeEnum type;

    private Boolean lastChunk;

    private Integer thisSequenceNumber;

    private RawDataRetrieveChunkDetails details;

    private Integer percentComplete;

  
  /**
   * The data transfer type.
   **/
  public RawDataRetrieveInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data transfer type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * True for the last chunk of data; otherwise false.
   **/
  public RawDataRetrieveInfo lastChunk(Boolean lastChunk) {
    this.lastChunk = lastChunk;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True for the last chunk of data; otherwise false.")
  @JsonProperty("lastChunk")
  public Boolean getLastChunk() {
    return lastChunk;
  }
  
  public void setLastChunk(Boolean lastChunk) {
    this.lastChunk = lastChunk;
  }

  
  /**
   * The sequence number of the current chunk of data being delivered to the controller.
   **/
  public RawDataRetrieveInfo thisSequenceNumber(Integer thisSequenceNumber) {
    this.thisSequenceNumber = thisSequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sequence number of the current chunk of data being delivered to the controller.")
  @JsonProperty("thisSequenceNumber")
  public Integer getThisSequenceNumber() {
    return thisSequenceNumber;
  }
  
  public void setThisSequenceNumber(Integer thisSequenceNumber) {
    this.thisSequenceNumber = thisSequenceNumber;
  }

  
  /**
   * The transfer type-specific details.
   **/
  public RawDataRetrieveInfo details(RawDataRetrieveChunkDetails details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The transfer type-specific details.")
  @JsonProperty("details")
  public RawDataRetrieveChunkDetails getDetails() {
    return details;
  }
  
  public void setDetails(RawDataRetrieveChunkDetails details) {
    this.details = details;
  }

  
  /**
   * This value is a number in the range of 0 to 100 indicating the percent complete.
   **/
  public RawDataRetrieveInfo percentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value is a number in the range of 0 to 100 indicating the percent complete.")
  @JsonProperty("percentComplete")
  public Integer getPercentComplete() {
    return percentComplete;
  }
  
  public void setPercentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawDataRetrieveInfo rawDataRetrieveInfo = (RawDataRetrieveInfo) o;
    return Objects.equals(this.type, rawDataRetrieveInfo.type) &&
        Objects.equals(this.lastChunk, rawDataRetrieveInfo.lastChunk) &&
        Objects.equals(this.thisSequenceNumber, rawDataRetrieveInfo.thisSequenceNumber) &&
        Objects.equals(this.details, rawDataRetrieveInfo.details) &&
        Objects.equals(this.percentComplete, rawDataRetrieveInfo.percentComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, lastChunk, thisSequenceNumber, details, percentComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawDataRetrieveInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lastChunk: ").append(toIndentedString(lastChunk)).append("\n");
    sb.append("    thisSequenceNumber: ").append(toIndentedString(thisSequenceNumber)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
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

