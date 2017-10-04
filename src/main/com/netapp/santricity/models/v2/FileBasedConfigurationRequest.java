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
 * Defines the parameters for a file based bulk configuration request
 */
@ApiModel(description = "Defines the parameters for a file based bulk configuration request")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class FileBasedConfigurationRequest   {
  
    private Boolean skipHeader;

    private String fileName;

    private List<FileConfigItem> configItems;

  
  /**
   * Indicates the first line of the file is a header line and should be skipped
   **/
  public FileBasedConfigurationRequest skipHeader(Boolean skipHeader) {
    this.skipHeader = skipHeader;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the first line of the file is a header line and should be skipped")
  @JsonProperty("skipHeader")
  public Boolean getSkipHeader() {
    return skipHeader;
  }
  
  public void setSkipHeader(Boolean skipHeader) {
    this.skipHeader = skipHeader;
  }

  
  /**
   * The name of a previously uploaded CSV file from which to pull configuration data
   **/
  public FileBasedConfigurationRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of a previously uploaded CSV file from which to pull configuration data")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   * A list of column to configuration items pairs
   **/
  public FileBasedConfigurationRequest configItems(List<FileConfigItem> configItems) {
    this.configItems = configItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of column to configuration items pairs")
  @JsonProperty("configItems")
  public List<FileConfigItem> getConfigItems() {
    return configItems;
  }
  
  public void setConfigItems(List<FileConfigItem> configItems) {
    this.configItems = configItems;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileBasedConfigurationRequest fileBasedConfigurationRequest = (FileBasedConfigurationRequest) o;
    return Objects.equals(this.skipHeader, fileBasedConfigurationRequest.skipHeader) &&
        Objects.equals(this.fileName, fileBasedConfigurationRequest.fileName) &&
        Objects.equals(this.configItems, fileBasedConfigurationRequest.configItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipHeader, fileName, configItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileBasedConfigurationRequest {\n");
    
    sb.append("    skipHeader: ").append(toIndentedString(skipHeader)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    configItems: ").append(toIndentedString(configItems)).append("\n");
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

