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
 * Run a controller firmware upgrade operation
 */
@ApiModel(description = "Run a controller firmware upgrade operation")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class CfwUpgradeRequest   {
  
    private String cfwFile;

    private String nvsramFile;

    private Boolean stageFirmware;

    private Boolean skipMelCheck;

  
  /**
   **/
  public CfwUpgradeRequest cfwFile(String cfwFile) {
    this.cfwFile = cfwFile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cfwFile")
  public String getCfwFile() {
    return cfwFile;
  }
  
  public void setCfwFile(String cfwFile) {
    this.cfwFile = cfwFile;
  }

  
  /**
   **/
  public CfwUpgradeRequest nvsramFile(String nvsramFile) {
    this.nvsramFile = nvsramFile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nvsramFile")
  public String getNvsramFile() {
    return nvsramFile;
  }
  
  public void setNvsramFile(String nvsramFile) {
    this.nvsramFile = nvsramFile;
  }

  
  /**
   **/
  public CfwUpgradeRequest stageFirmware(Boolean stageFirmware) {
    this.stageFirmware = stageFirmware;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stageFirmware")
  public Boolean getStageFirmware() {
    return stageFirmware;
  }
  
  public void setStageFirmware(Boolean stageFirmware) {
    this.stageFirmware = stageFirmware;
  }

  
  /**
   * Skip check of the MEL events for issues with the storage-system.
   **/
  public CfwUpgradeRequest skipMelCheck(Boolean skipMelCheck) {
    this.skipMelCheck = skipMelCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Skip check of the MEL events for issues with the storage-system.")
  @JsonProperty("skipMelCheck")
  public Boolean getSkipMelCheck() {
    return skipMelCheck;
  }
  
  public void setSkipMelCheck(Boolean skipMelCheck) {
    this.skipMelCheck = skipMelCheck;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CfwUpgradeRequest cfwUpgradeRequest = (CfwUpgradeRequest) o;
    return Objects.equals(this.cfwFile, cfwUpgradeRequest.cfwFile) &&
        Objects.equals(this.nvsramFile, cfwUpgradeRequest.nvsramFile) &&
        Objects.equals(this.stageFirmware, cfwUpgradeRequest.stageFirmware) &&
        Objects.equals(this.skipMelCheck, cfwUpgradeRequest.skipMelCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfwFile, nvsramFile, stageFirmware, skipMelCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CfwUpgradeRequest {\n");
    
    sb.append("    cfwFile: ").append(toIndentedString(cfwFile)).append("\n");
    sb.append("    nvsramFile: ").append(toIndentedString(nvsramFile)).append("\n");
    sb.append("    stageFirmware: ").append(toIndentedString(stageFirmware)).append("\n");
    sb.append("    skipMelCheck: ").append(toIndentedString(skipMelCheck)).append("\n");
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

