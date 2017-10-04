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
 * SecureVolumeExternalKeyResponse
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class SecureVolumeExternalKeyResponse   {
  
    private Long fileSize;

    private String fileID;

    private String fileURL;

    private String lockKeyId;

  
  /**
   * The size of the file
   **/
  public SecureVolumeExternalKeyResponse fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the file")
  @JsonProperty("fileSize")
  public Long getFileSize() {
    return fileSize;
  }
  
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  
  /**
   * The GUID for the file
   **/
  public SecureVolumeExternalKeyResponse fileID(String fileID) {
    this.fileID = fileID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The GUID for the file")
  @JsonProperty("fileID")
  public String getFileID() {
    return fileID;
  }
  
  public void setFileID(String fileID) {
    this.fileID = fileID;
  }

  
  /**
   * The URL for the file
   **/
  public SecureVolumeExternalKeyResponse fileURL(String fileURL) {
    this.fileURL = fileURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The URL for the file")
  @JsonProperty("fileURL")
  public String getFileURL() {
    return fileURL;
  }
  
  public void setFileURL(String fileURL) {
    this.fileURL = fileURL;
  }

  
  /**
   * The id of the lock key.
   **/
  public SecureVolumeExternalKeyResponse lockKeyId(String lockKeyId) {
    this.lockKeyId = lockKeyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the lock key.")
  @JsonProperty("lockKeyId")
  public String getLockKeyId() {
    return lockKeyId;
  }
  
  public void setLockKeyId(String lockKeyId) {
    this.lockKeyId = lockKeyId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureVolumeExternalKeyResponse secureVolumeExternalKeyResponse = (SecureVolumeExternalKeyResponse) o;
    return Objects.equals(this.fileSize, secureVolumeExternalKeyResponse.fileSize) &&
        Objects.equals(this.fileID, secureVolumeExternalKeyResponse.fileID) &&
        Objects.equals(this.fileURL, secureVolumeExternalKeyResponse.fileURL) &&
        Objects.equals(this.lockKeyId, secureVolumeExternalKeyResponse.lockKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, fileID, fileURL, lockKeyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureVolumeExternalKeyResponse {\n");
    
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileID: ").append(toIndentedString(fileID)).append("\n");
    sb.append("    fileURL: ").append(toIndentedString(fileURL)).append("\n");
    sb.append("    lockKeyId: ").append(toIndentedString(lockKeyId)).append("\n");
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

