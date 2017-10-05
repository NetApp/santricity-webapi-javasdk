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
 * DriveChannelStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DriveChannelStatistics   {
  
    private Long startTimeStamp;

    private Long endTimeStamp;

    private Integer totalIoCount;

    private Integer totalIoErrorCount;


  /**
   * The status of the link - up, down, failed
   */
  public enum LinkStatusEnum {
    none("none"),
    up("up"),
    down("down"),
    failed("failed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    LinkStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LinkStatusEnum linkStatus;

    private DriveChannelErrorCounts errorCounts;

  
  /**
   * The time stamp of when the error tracking began.
   **/
  public DriveChannelStatistics startTimeStamp(Long startTimeStamp) {
    this.startTimeStamp = startTimeStamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time stamp of when the error tracking began.")
  @JsonProperty("startTimeStamp")
  public Long getStartTimeStamp() {
    return startTimeStamp;
  }
  
  public void setStartTimeStamp(Long startTimeStamp) {
    this.startTimeStamp = startTimeStamp;
  }

  
  /**
   * The time stamp of when the error tracking ended.
   **/
  public DriveChannelStatistics endTimeStamp(Long endTimeStamp) {
    this.endTimeStamp = endTimeStamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time stamp of when the error tracking ended.")
  @JsonProperty("endTimeStamp")
  public Long getEndTimeStamp() {
    return endTimeStamp;
  }
  
  public void setEndTimeStamp(Long endTimeStamp) {
    this.endTimeStamp = endTimeStamp;
  }

  
  /**
   * The total number of I/Os.
   **/
  public DriveChannelStatistics totalIoCount(Integer totalIoCount) {
    this.totalIoCount = totalIoCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of I/Os.")
  @JsonProperty("totalIoCount")
  public Integer getTotalIoCount() {
    return totalIoCount;
  }
  
  public void setTotalIoCount(Integer totalIoCount) {
    this.totalIoCount = totalIoCount;
  }

  
  /**
   * The total number of I/O errors.
   **/
  public DriveChannelStatistics totalIoErrorCount(Integer totalIoErrorCount) {
    this.totalIoErrorCount = totalIoErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of I/O errors.")
  @JsonProperty("totalIoErrorCount")
  public Integer getTotalIoErrorCount() {
    return totalIoErrorCount;
  }
  
  public void setTotalIoErrorCount(Integer totalIoErrorCount) {
    this.totalIoErrorCount = totalIoErrorCount;
  }

  
  /**
   * The status of the link - up, down, failed
   **/
  public DriveChannelStatistics linkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the link - up, down, failed")
  @JsonProperty("linkStatus")
  public LinkStatusEnum getLinkStatus() {
    return linkStatus;
  }
  
  public void setLinkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
  }

  
  /**
   * The error category counts.
   **/
  public DriveChannelStatistics errorCounts(DriveChannelErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The error category counts.")
  @JsonProperty("errorCounts")
  public DriveChannelErrorCounts getErrorCounts() {
    return errorCounts;
  }
  
  public void setErrorCounts(DriveChannelErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveChannelStatistics driveChannelStatistics = (DriveChannelStatistics) o;
    return Objects.equals(this.startTimeStamp, driveChannelStatistics.startTimeStamp) &&
        Objects.equals(this.endTimeStamp, driveChannelStatistics.endTimeStamp) &&
        Objects.equals(this.totalIoCount, driveChannelStatistics.totalIoCount) &&
        Objects.equals(this.totalIoErrorCount, driveChannelStatistics.totalIoErrorCount) &&
        Objects.equals(this.linkStatus, driveChannelStatistics.linkStatus) &&
        Objects.equals(this.errorCounts, driveChannelStatistics.errorCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeStamp, endTimeStamp, totalIoCount, totalIoErrorCount, linkStatus, errorCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveChannelStatistics {\n");
    
    sb.append("    startTimeStamp: ").append(toIndentedString(startTimeStamp)).append("\n");
    sb.append("    endTimeStamp: ").append(toIndentedString(endTimeStamp)).append("\n");
    sb.append("    totalIoCount: ").append(toIndentedString(totalIoCount)).append("\n");
    sb.append("    totalIoErrorCount: ").append(toIndentedString(totalIoErrorCount)).append("\n");
    sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
    sb.append("    errorCounts: ").append(toIndentedString(errorCounts)).append("\n");
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

