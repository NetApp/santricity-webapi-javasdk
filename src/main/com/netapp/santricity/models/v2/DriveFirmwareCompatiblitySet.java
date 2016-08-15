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


package com.netapp.santricity.models.v2;

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
 * Drive firmware file to drive compatibility
 */
@ApiModel(description = "Drive firmware file to drive compatibility")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DriveFirmwareCompatiblitySet   {
  
    private String filename;

    private String firmwareVersion;

    private List<String> supportedFirmwareVersions;

    private List<DriveFirmwareCompatabilityEntry> compatibleDrives;

  
  /**
   **/
  public DriveFirmwareCompatiblitySet filename(String filename) {
    this.filename = filename;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  
  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  /**
   * The version of firmware in file
   **/
  public DriveFirmwareCompatiblitySet firmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version of firmware in file")
  @JsonProperty("firmwareVersion")
  public String getFirmwareVersion() {
    return firmwareVersion;
  }
  
  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  
  /**
   * Drive firmware versions supported by firmware file
   **/
  public DriveFirmwareCompatiblitySet supportedFirmwareVersions(List<String> supportedFirmwareVersions) {
    this.supportedFirmwareVersions = supportedFirmwareVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Drive firmware versions supported by firmware file")
  @JsonProperty("supportedFirmwareVersions")
  public List<String> getSupportedFirmwareVersions() {
    return supportedFirmwareVersions;
  }
  
  public void setSupportedFirmwareVersions(List<String> supportedFirmwareVersions) {
    this.supportedFirmwareVersions = supportedFirmwareVersions;
  }

  
  /**
   * List of drives that are compatible with firmware file
   **/
  public DriveFirmwareCompatiblitySet compatibleDrives(List<DriveFirmwareCompatabilityEntry> compatibleDrives) {
    this.compatibleDrives = compatibleDrives;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of drives that are compatible with firmware file")
  @JsonProperty("compatibleDrives")
  public List<DriveFirmwareCompatabilityEntry> getCompatibleDrives() {
    return compatibleDrives;
  }
  
  public void setCompatibleDrives(List<DriveFirmwareCompatabilityEntry> compatibleDrives) {
    this.compatibleDrives = compatibleDrives;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveFirmwareCompatiblitySet driveFirmwareCompatiblitySet = (DriveFirmwareCompatiblitySet) o;
    return Objects.equals(this.filename, driveFirmwareCompatiblitySet.filename) &&
        Objects.equals(this.firmwareVersion, driveFirmwareCompatiblitySet.firmwareVersion) &&
        Objects.equals(this.supportedFirmwareVersions, driveFirmwareCompatiblitySet.supportedFirmwareVersions) &&
        Objects.equals(this.compatibleDrives, driveFirmwareCompatiblitySet.compatibleDrives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, firmwareVersion, supportedFirmwareVersions, compatibleDrives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveFirmwareCompatiblitySet {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    supportedFirmwareVersions: ").append(toIndentedString(supportedFirmwareVersions)).append("\n");
    sb.append("    compatibleDrives: ").append(toIndentedString(compatibleDrives)).append("\n");
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

