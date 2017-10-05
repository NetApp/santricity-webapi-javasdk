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
 * IOCDumpInfo
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IOCDumpInfo   {
  
    private Integer iocDumpTag;

    private Long captureTime;

    private Integer channel;

    private Integer captureSize;

    private String fwVersion;


  /**
   * The reason for the IOC Dump.
   */
  public enum IocDumpReasonEnum {
    unknown("unknown"),
    userInitiated("userInitiated"),
    reboot("reboot"),
    other("other"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    IocDumpReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private IocDumpReasonEnum iocDumpReason;

  
  /**
   * The IOC Dump Tag. Each IOC Dump has a unique tag value.
   **/
  public IOCDumpInfo iocDumpTag(Integer iocDumpTag) {
    this.iocDumpTag = iocDumpTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IOC Dump Tag. Each IOC Dump has a unique tag value.")
  @JsonProperty("iocDumpTag")
  public Integer getIocDumpTag() {
    return iocDumpTag;
  }
  
  public void setIocDumpTag(Integer iocDumpTag) {
    this.iocDumpTag = iocDumpTag;
  }

  
  /**
   * The time that the IOC Dump was captured measured in seconds since January 1, 1970.
   **/
  public IOCDumpInfo captureTime(Long captureTime) {
    this.captureTime = captureTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time that the IOC Dump was captured measured in seconds since January 1, 1970.")
  @JsonProperty("captureTime")
  public Long getCaptureTime() {
    return captureTime;
  }
  
  public void setCaptureTime(Long captureTime) {
    this.captureTime = captureTime;
  }

  
  /**
   * The channel number.
   **/
  public IOCDumpInfo channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel number.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The size of the IOC Dump in megabytes.
   **/
  public IOCDumpInfo captureSize(Integer captureSize) {
    this.captureSize = captureSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the IOC Dump in megabytes.")
  @JsonProperty("captureSize")
  public Integer getCaptureSize() {
    return captureSize;
  }
  
  public void setCaptureSize(Integer captureSize) {
    this.captureSize = captureSize;
  }

  
  /**
   * The controller firmware version at the time the IOC Dump was captured.
   **/
  public IOCDumpInfo fwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller firmware version at the time the IOC Dump was captured.")
  @JsonProperty("fwVersion")
  public String getFwVersion() {
    return fwVersion;
  }
  
  public void setFwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
  }

  
  /**
   * The reason for the IOC Dump.
   **/
  public IOCDumpInfo iocDumpReason(IocDumpReasonEnum iocDumpReason) {
    this.iocDumpReason = iocDumpReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reason for the IOC Dump.")
  @JsonProperty("iocDumpReason")
  public IocDumpReasonEnum getIocDumpReason() {
    return iocDumpReason;
  }
  
  public void setIocDumpReason(IocDumpReasonEnum iocDumpReason) {
    this.iocDumpReason = iocDumpReason;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IOCDumpInfo iOCDumpInfo = (IOCDumpInfo) o;
    return Objects.equals(this.iocDumpTag, iOCDumpInfo.iocDumpTag) &&
        Objects.equals(this.captureTime, iOCDumpInfo.captureTime) &&
        Objects.equals(this.channel, iOCDumpInfo.channel) &&
        Objects.equals(this.captureSize, iOCDumpInfo.captureSize) &&
        Objects.equals(this.fwVersion, iOCDumpInfo.fwVersion) &&
        Objects.equals(this.iocDumpReason, iOCDumpInfo.iocDumpReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iocDumpTag, captureTime, channel, captureSize, fwVersion, iocDumpReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IOCDumpInfo {\n");
    
    sb.append("    iocDumpTag: ").append(toIndentedString(iocDumpTag)).append("\n");
    sb.append("    captureTime: ").append(toIndentedString(captureTime)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    captureSize: ").append(toIndentedString(captureSize)).append("\n");
    sb.append("    fwVersion: ").append(toIndentedString(fwVersion)).append("\n");
    sb.append("    iocDumpReason: ").append(toIndentedString(iocDumpReason)).append("\n");
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

