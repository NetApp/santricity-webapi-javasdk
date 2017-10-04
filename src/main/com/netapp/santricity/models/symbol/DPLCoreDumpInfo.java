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
 * DPLCoreDumpInfo
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DPLCoreDumpInfo   {
  
    private Integer dplCoreDumpTag;

    private Long captureTime;

    private Integer fullCaptureSize;

    private String fwVersion;

    private String platformType;

    private String fullCtlr;

    private String fullCtlrSerialNumber;

    private String altCtlr;

    private String altCtlrSerialNumber;

    private Integer triggerReason;

    private DPLCoreDumpDetail detail;

    private Integer dom0CaptureSize;

    private Integer dom0AltCaptureSize;

    private Long dom0CaptureTime;

    private Long dom0AltCaptureTime;

    private Integer altCaptureSize;

  
  /**
   * The DPL core dump tag. Each core dump has a unique tag value.
   **/
  public DPLCoreDumpInfo dplCoreDumpTag(Integer dplCoreDumpTag) {
    this.dplCoreDumpTag = dplCoreDumpTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The DPL core dump tag. Each core dump has a unique tag value.")
  @JsonProperty("dplCoreDumpTag")
  public Integer getDplCoreDumpTag() {
    return dplCoreDumpTag;
  }
  
  public void setDplCoreDumpTag(Integer dplCoreDumpTag) {
    this.dplCoreDumpTag = dplCoreDumpTag;
  }

  
  /**
   * The time that the DPL core dump was captured measured in seconds since January 1, 1970.
   **/
  public DPLCoreDumpInfo captureTime(Long captureTime) {
    this.captureTime = captureTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time that the DPL core dump was captured measured in seconds since January 1, 1970.")
  @JsonProperty("captureTime")
  public Long getCaptureTime() {
    return captureTime;
  }
  
  public void setCaptureTime(Long captureTime) {
    this.captureTime = captureTime;
  }

  
  /**
   * The size of the full core dump, in megabytes.
   **/
  public DPLCoreDumpInfo fullCaptureSize(Integer fullCaptureSize) {
    this.fullCaptureSize = fullCaptureSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the full core dump, in megabytes.")
  @JsonProperty("fullCaptureSize")
  public Integer getFullCaptureSize() {
    return fullCaptureSize;
  }
  
  public void setFullCaptureSize(Integer fullCaptureSize) {
    this.fullCaptureSize = fullCaptureSize;
  }

  
  /**
   * The controller firmware version at the time the core dump was captured.
   **/
  public DPLCoreDumpInfo fwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller firmware version at the time the core dump was captured.")
  @JsonProperty("fwVersion")
  public String getFwVersion() {
    return fwVersion;
  }
  
  public void setFwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
  }

  
  /**
   * The controller platform type.
   **/
  public DPLCoreDumpInfo platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller platform type.")
  @JsonProperty("platformType")
  public String getPlatformType() {
    return platformType;
  }
  
  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  
  /**
   * The controller with the full DPL core dump.
   **/
  public DPLCoreDumpInfo fullCtlr(String fullCtlr) {
    this.fullCtlr = fullCtlr;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller with the full DPL core dump.")
  @JsonProperty("fullCtlr")
  public String getFullCtlr() {
    return fullCtlr;
  }
  
  public void setFullCtlr(String fullCtlr) {
    this.fullCtlr = fullCtlr;
  }

  
  /**
   * The serial number of the controller with the full DPL core dump.
   **/
  public DPLCoreDumpInfo fullCtlrSerialNumber(String fullCtlrSerialNumber) {
    this.fullCtlrSerialNumber = fullCtlrSerialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The serial number of the controller with the full DPL core dump.")
  @JsonProperty("fullCtlrSerialNumber")
  public String getFullCtlrSerialNumber() {
    return fullCtlrSerialNumber;
  }
  
  public void setFullCtlrSerialNumber(String fullCtlrSerialNumber) {
    this.fullCtlrSerialNumber = fullCtlrSerialNumber;
  }

  
  /**
   * The controller with an alternate DPL core dump. May be none.
   **/
  public DPLCoreDumpInfo altCtlr(String altCtlr) {
    this.altCtlr = altCtlr;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller with an alternate DPL core dump. May be none.")
  @JsonProperty("altCtlr")
  public String getAltCtlr() {
    return altCtlr;
  }
  
  public void setAltCtlr(String altCtlr) {
    this.altCtlr = altCtlr;
  }

  
  /**
   * The serial number of the controller with an alternate DPL core dump.
   **/
  public DPLCoreDumpInfo altCtlrSerialNumber(String altCtlrSerialNumber) {
    this.altCtlrSerialNumber = altCtlrSerialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The serial number of the controller with an alternate DPL core dump.")
  @JsonProperty("altCtlrSerialNumber")
  public String getAltCtlrSerialNumber() {
    return altCtlrSerialNumber;
  }
  
  public void setAltCtlrSerialNumber(String altCtlrSerialNumber) {
    this.altCtlrSerialNumber = altCtlrSerialNumber;
  }

  
  /**
   * The type of trigger or reboot reason resulting in the DPL core dump. This information is for internal LSI use only.
   **/
  public DPLCoreDumpInfo triggerReason(Integer triggerReason) {
    this.triggerReason = triggerReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of trigger or reboot reason resulting in the DPL core dump. This information is for internal LSI use only.")
  @JsonProperty("triggerReason")
  public Integer getTriggerReason() {
    return triggerReason;
  }
  
  public void setTriggerReason(Integer triggerReason) {
    this.triggerReason = triggerReason;
  }

  
  /**
   * Additional detail about the DPL Core Dump.
   **/
  public DPLCoreDumpInfo detail(DPLCoreDumpDetail detail) {
    this.detail = detail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Additional detail about the DPL Core Dump.")
  @JsonProperty("detail")
  public DPLCoreDumpDetail getDetail() {
    return detail;
  }
  
  public void setDetail(DPLCoreDumpDetail detail) {
    this.detail = detail;
  }

  
  /**
   * This is the total size of the core dump data to be retrieved from this controller, in bytes.
   **/
  public DPLCoreDumpInfo dom0CaptureSize(Integer dom0CaptureSize) {
    this.dom0CaptureSize = dom0CaptureSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the total size of the core dump data to be retrieved from this controller, in bytes.")
  @JsonProperty("dom0CaptureSize")
  public Integer getDom0CaptureSize() {
    return dom0CaptureSize;
  }
  
  public void setDom0CaptureSize(Integer dom0CaptureSize) {
    this.dom0CaptureSize = dom0CaptureSize;
  }

  
  /**
   * This is the total size of the core dump data to be retrieved from the alternate controller, in bytes.
   **/
  public DPLCoreDumpInfo dom0AltCaptureSize(Integer dom0AltCaptureSize) {
    this.dom0AltCaptureSize = dom0AltCaptureSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the total size of the core dump data to be retrieved from the alternate controller, in bytes.")
  @JsonProperty("dom0AltCaptureSize")
  public Integer getDom0AltCaptureSize() {
    return dom0AltCaptureSize;
  }
  
  public void setDom0AltCaptureSize(Integer dom0AltCaptureSize) {
    this.dom0AltCaptureSize = dom0AltCaptureSize;
  }

  
  /**
   * This is the time stamp of the latest core dump file on this controller measured in seconds since January 1, 1970.
   **/
  public DPLCoreDumpInfo dom0CaptureTime(Long dom0CaptureTime) {
    this.dom0CaptureTime = dom0CaptureTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the time stamp of the latest core dump file on this controller measured in seconds since January 1, 1970.")
  @JsonProperty("dom0CaptureTime")
  public Long getDom0CaptureTime() {
    return dom0CaptureTime;
  }
  
  public void setDom0CaptureTime(Long dom0CaptureTime) {
    this.dom0CaptureTime = dom0CaptureTime;
  }

  
  /**
   * This is the time stamp of the latest core dump file on the alternate controller measured in seconds since January 1, 1970.
   **/
  public DPLCoreDumpInfo dom0AltCaptureTime(Long dom0AltCaptureTime) {
    this.dom0AltCaptureTime = dom0AltCaptureTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the time stamp of the latest core dump file on the alternate controller measured in seconds since January 1, 1970.")
  @JsonProperty("dom0AltCaptureTime")
  public Long getDom0AltCaptureTime() {
    return dom0AltCaptureTime;
  }
  
  public void setDom0AltCaptureTime(Long dom0AltCaptureTime) {
    this.dom0AltCaptureTime = dom0AltCaptureTime;
  }

  
  /**
   **/
  public DPLCoreDumpInfo altCaptureSize(Integer altCaptureSize) {
    this.altCaptureSize = altCaptureSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("altCaptureSize")
  public Integer getAltCaptureSize() {
    return altCaptureSize;
  }
  
  public void setAltCaptureSize(Integer altCaptureSize) {
    this.altCaptureSize = altCaptureSize;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DPLCoreDumpInfo dPLCoreDumpInfo = (DPLCoreDumpInfo) o;
    return Objects.equals(this.dplCoreDumpTag, dPLCoreDumpInfo.dplCoreDumpTag) &&
        Objects.equals(this.captureTime, dPLCoreDumpInfo.captureTime) &&
        Objects.equals(this.fullCaptureSize, dPLCoreDumpInfo.fullCaptureSize) &&
        Objects.equals(this.fwVersion, dPLCoreDumpInfo.fwVersion) &&
        Objects.equals(this.platformType, dPLCoreDumpInfo.platformType) &&
        Objects.equals(this.fullCtlr, dPLCoreDumpInfo.fullCtlr) &&
        Objects.equals(this.fullCtlrSerialNumber, dPLCoreDumpInfo.fullCtlrSerialNumber) &&
        Objects.equals(this.altCtlr, dPLCoreDumpInfo.altCtlr) &&
        Objects.equals(this.altCtlrSerialNumber, dPLCoreDumpInfo.altCtlrSerialNumber) &&
        Objects.equals(this.triggerReason, dPLCoreDumpInfo.triggerReason) &&
        Objects.equals(this.detail, dPLCoreDumpInfo.detail) &&
        Objects.equals(this.dom0CaptureSize, dPLCoreDumpInfo.dom0CaptureSize) &&
        Objects.equals(this.dom0AltCaptureSize, dPLCoreDumpInfo.dom0AltCaptureSize) &&
        Objects.equals(this.dom0CaptureTime, dPLCoreDumpInfo.dom0CaptureTime) &&
        Objects.equals(this.dom0AltCaptureTime, dPLCoreDumpInfo.dom0AltCaptureTime) &&
        Objects.equals(this.altCaptureSize, dPLCoreDumpInfo.altCaptureSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dplCoreDumpTag, captureTime, fullCaptureSize, fwVersion, platformType, fullCtlr, fullCtlrSerialNumber, altCtlr, altCtlrSerialNumber, triggerReason, detail, dom0CaptureSize, dom0AltCaptureSize, dom0CaptureTime, dom0AltCaptureTime, altCaptureSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DPLCoreDumpInfo {\n");
    
    sb.append("    dplCoreDumpTag: ").append(toIndentedString(dplCoreDumpTag)).append("\n");
    sb.append("    captureTime: ").append(toIndentedString(captureTime)).append("\n");
    sb.append("    fullCaptureSize: ").append(toIndentedString(fullCaptureSize)).append("\n");
    sb.append("    fwVersion: ").append(toIndentedString(fwVersion)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    fullCtlr: ").append(toIndentedString(fullCtlr)).append("\n");
    sb.append("    fullCtlrSerialNumber: ").append(toIndentedString(fullCtlrSerialNumber)).append("\n");
    sb.append("    altCtlr: ").append(toIndentedString(altCtlr)).append("\n");
    sb.append("    altCtlrSerialNumber: ").append(toIndentedString(altCtlrSerialNumber)).append("\n");
    sb.append("    triggerReason: ").append(toIndentedString(triggerReason)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    dom0CaptureSize: ").append(toIndentedString(dom0CaptureSize)).append("\n");
    sb.append("    dom0AltCaptureSize: ").append(toIndentedString(dom0AltCaptureSize)).append("\n");
    sb.append("    dom0CaptureTime: ").append(toIndentedString(dom0CaptureTime)).append("\n");
    sb.append("    dom0AltCaptureTime: ").append(toIndentedString(dom0AltCaptureTime)).append("\n");
    sb.append("    altCaptureSize: ").append(toIndentedString(altCaptureSize)).append("\n");
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

