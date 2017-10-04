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
 * StagedFirmware
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class StagedFirmware   {
  
    private Boolean stagedFwValid;

    private String fwVersion;

    private String appVersion;

    private String bootVersion;

    private String nvsramVersion;

    private Long timeStamp;

    private String nvsramVersionString;

    private List<VersionDescriptor> codeVersions;

  
  /**
   * False, staged FW areas on the controllers are not valid and cannot be activated. True, the staged FW areas on the controllers are valid and can be activated.
   **/
  public StagedFirmware stagedFwValid(Boolean stagedFwValid) {
    this.stagedFwValid = stagedFwValid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "False, staged FW areas on the controllers are not valid and cannot be activated. True, the staged FW areas on the controllers are valid and can be activated.")
  @JsonProperty("stagedFwValid")
  public Boolean getStagedFwValid() {
    return stagedFwValid;
  }
  
  public void setStagedFwValid(Boolean stagedFwValid) {
    this.stagedFwValid = stagedFwValid;
  }

  
  /**
   * The firmware package version identifier.
   **/
  public StagedFirmware fwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The firmware package version identifier.")
  @JsonProperty("fwVersion")
  public String getFwVersion() {
    return fwVersion;
  }
  
  public void setFwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
  }

  
  /**
   * The application code version number.
   **/
  public StagedFirmware appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The application code version number.")
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  
  /**
   * The boot code version number.
   **/
  public StagedFirmware bootVersion(String bootVersion) {
    this.bootVersion = bootVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The boot code version number.")
  @JsonProperty("bootVersion")
  public String getBootVersion() {
    return bootVersion;
  }
  
  public void setBootVersion(String bootVersion) {
    this.bootVersion = bootVersion;
  }

  
  /**
   * The NVSRAM version number.
   **/
  public StagedFirmware nvsramVersion(String nvsramVersion) {
    this.nvsramVersion = nvsramVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The NVSRAM version number.")
  @JsonProperty("nvsramVersion")
  public String getNvsramVersion() {
    return nvsramVersion;
  }
  
  public void setNvsramVersion(String nvsramVersion) {
    this.nvsramVersion = nvsramVersion;
  }

  
  /**
   * Timestamp when the staged FW was downloaded
   **/
  public StagedFirmware timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp when the staged FW was downloaded")
  @JsonProperty("timeStamp")
  public Long getTimeStamp() {
    return timeStamp;
  }
  
  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }

  
  /**
   * The field is deprecated. The nvsramVersion field should be used instead.
   **/
  public StagedFirmware nvsramVersionString(String nvsramVersionString) {
    this.nvsramVersionString = nvsramVersionString;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The field is deprecated. The nvsramVersion field should be used instead.")
  @JsonProperty("nvsramVersionString")
  public String getNvsramVersionString() {
    return nvsramVersionString;
  }
  
  public void setNvsramVersionString(String nvsramVersionString) {
    this.nvsramVersionString = nvsramVersionString;
  }

  
  /**
   * Version descriptors for staged code modules
   **/
  public StagedFirmware codeVersions(List<VersionDescriptor> codeVersions) {
    this.codeVersions = codeVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version descriptors for staged code modules")
  @JsonProperty("codeVersions")
  public List<VersionDescriptor> getCodeVersions() {
    return codeVersions;
  }
  
  public void setCodeVersions(List<VersionDescriptor> codeVersions) {
    this.codeVersions = codeVersions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StagedFirmware stagedFirmware = (StagedFirmware) o;
    return Objects.equals(this.stagedFwValid, stagedFirmware.stagedFwValid) &&
        Objects.equals(this.fwVersion, stagedFirmware.fwVersion) &&
        Objects.equals(this.appVersion, stagedFirmware.appVersion) &&
        Objects.equals(this.bootVersion, stagedFirmware.bootVersion) &&
        Objects.equals(this.nvsramVersion, stagedFirmware.nvsramVersion) &&
        Objects.equals(this.timeStamp, stagedFirmware.timeStamp) &&
        Objects.equals(this.nvsramVersionString, stagedFirmware.nvsramVersionString) &&
        Objects.equals(this.codeVersions, stagedFirmware.codeVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stagedFwValid, fwVersion, appVersion, bootVersion, nvsramVersion, timeStamp, nvsramVersionString, codeVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StagedFirmware {\n");
    
    sb.append("    stagedFwValid: ").append(toIndentedString(stagedFwValid)).append("\n");
    sb.append("    fwVersion: ").append(toIndentedString(fwVersion)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    bootVersion: ").append(toIndentedString(bootVersion)).append("\n");
    sb.append("    nvsramVersion: ").append(toIndentedString(nvsramVersion)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    nvsramVersionString: ").append(toIndentedString(nvsramVersionString)).append("\n");
    sb.append("    codeVersions: ").append(toIndentedString(codeVersions)).append("\n");
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

