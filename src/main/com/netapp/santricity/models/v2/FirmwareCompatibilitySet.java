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
 * FirmwareCompatibilitySet
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class FirmwareCompatibilitySet   {
  
    private String storageDeviceId;

    private String storageDeviceWwn;

    private List<CFWPackageMetadata> cfwFiles;

    private List<NvsramPackageMetadata> nvsramFiles;

  
  /**
   **/
  public FirmwareCompatibilitySet storageDeviceId(String storageDeviceId) {
    this.storageDeviceId = storageDeviceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageDeviceId")
  public String getStorageDeviceId() {
    return storageDeviceId;
  }
  
  public void setStorageDeviceId(String storageDeviceId) {
    this.storageDeviceId = storageDeviceId;
  }

  
  /**
   **/
  public FirmwareCompatibilitySet storageDeviceWwn(String storageDeviceWwn) {
    this.storageDeviceWwn = storageDeviceWwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageDeviceWwn")
  public String getStorageDeviceWwn() {
    return storageDeviceWwn;
  }
  
  public void setStorageDeviceWwn(String storageDeviceWwn) {
    this.storageDeviceWwn = storageDeviceWwn;
  }

  
  /**
   * The list of compatible controller firmware files
   **/
  public FirmwareCompatibilitySet cfwFiles(List<CFWPackageMetadata> cfwFiles) {
    this.cfwFiles = cfwFiles;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of compatible controller firmware files")
  @JsonProperty("cfwFiles")
  public List<CFWPackageMetadata> getCfwFiles() {
    return cfwFiles;
  }
  
  public void setCfwFiles(List<CFWPackageMetadata> cfwFiles) {
    this.cfwFiles = cfwFiles;
  }

  
  /**
   * The list of compatible nvsram files
   **/
  public FirmwareCompatibilitySet nvsramFiles(List<NvsramPackageMetadata> nvsramFiles) {
    this.nvsramFiles = nvsramFiles;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of compatible nvsram files")
  @JsonProperty("nvsramFiles")
  public List<NvsramPackageMetadata> getNvsramFiles() {
    return nvsramFiles;
  }
  
  public void setNvsramFiles(List<NvsramPackageMetadata> nvsramFiles) {
    this.nvsramFiles = nvsramFiles;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareCompatibilitySet firmwareCompatibilitySet = (FirmwareCompatibilitySet) o;
    return Objects.equals(this.storageDeviceId, firmwareCompatibilitySet.storageDeviceId) &&
        Objects.equals(this.storageDeviceWwn, firmwareCompatibilitySet.storageDeviceWwn) &&
        Objects.equals(this.cfwFiles, firmwareCompatibilitySet.cfwFiles) &&
        Objects.equals(this.nvsramFiles, firmwareCompatibilitySet.nvsramFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageDeviceId, storageDeviceWwn, cfwFiles, nvsramFiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareCompatibilitySet {\n");
    
    sb.append("    storageDeviceId: ").append(toIndentedString(storageDeviceId)).append("\n");
    sb.append("    storageDeviceWwn: ").append(toIndentedString(storageDeviceWwn)).append("\n");
    sb.append("    cfwFiles: ").append(toIndentedString(cfwFiles)).append("\n");
    sb.append("    nvsramFiles: ").append(toIndentedString(nvsramFiles)).append("\n");
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

