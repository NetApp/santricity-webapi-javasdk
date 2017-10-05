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
 * FirmwareUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class FirmwareUpdateDescriptor   {
  
    private String firmwareChunkImage;

    private String firmwareVersion;

    private Integer offset;

    private Integer totalSize;

    private Boolean stagedDownload;

    private Integer numberOfFiles;

    private Integer sizeOfStream;

  
  /**
   * A raw byte array that contains a segment, or chunk, of the firmware (or NVSRAM) image being downloaded to a controller. For firmware downloads, iterative operations are supported, where the overall firmware image can be iteratively transferred to the controller in multiple chunks. For NVSRAM downloads, however, the entire NVSRAM image must be provided in one call.
   **/
  public FirmwareUpdateDescriptor firmwareChunkImage(String firmwareChunkImage) {
    this.firmwareChunkImage = firmwareChunkImage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A raw byte array that contains a segment, or chunk, of the firmware (or NVSRAM) image being downloaded to a controller. For firmware downloads, iterative operations are supported, where the overall firmware image can be iteratively transferred to the controller in multiple chunks. For NVSRAM downloads, however, the entire NVSRAM image must be provided in one call.")
  @JsonProperty("firmwareChunkImage")
  public String getFirmwareChunkImage() {
    return firmwareChunkImage;
  }
  
  public void setFirmwareChunkImage(String firmwareChunkImage) {
    this.firmwareChunkImage = firmwareChunkImage;
  }

  
  /**
   * An ASCII character string that identifies the version of the firmware or NVSRAM being downloaded.
   **/
  public FirmwareUpdateDescriptor firmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII character string that identifies the version of the firmware or NVSRAM being downloaded.")
  @JsonProperty("firmwareVersion")
  public String getFirmwareVersion() {
    return firmwareVersion;
  }
  
  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  
  /**
   * The offset of this chunk from the beginning of the overall image.
   **/
  public FirmwareUpdateDescriptor offset(Integer offset) {
    this.offset = offset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The offset of this chunk from the beginning of the overall image.")
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }
  
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   * The total size of the overall firmware image.
   **/
  public FirmwareUpdateDescriptor totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total size of the overall firmware image.")
  @JsonProperty("totalSize")
  public Integer getTotalSize() {
    return totalSize;
  }
  
  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }

  
  /**
   * If false, activate firmware after download. If true, stage firmware for later activation.
   **/
  public FirmwareUpdateDescriptor stagedDownload(Boolean stagedDownload) {
    this.stagedDownload = stagedDownload;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If false, activate firmware after download. If true, stage firmware for later activation.")
  @JsonProperty("stagedDownload")
  public Boolean getStagedDownload() {
    return stagedDownload;
  }
  
  public void setStagedDownload(Boolean stagedDownload) {
    this.stagedDownload = stagedDownload;
  }

  
  /**
   * The number of files in this download stream.
   **/
  public FirmwareUpdateDescriptor numberOfFiles(Integer numberOfFiles) {
    this.numberOfFiles = numberOfFiles;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of files in this download stream.")
  @JsonProperty("numberOfFiles")
  public Integer getNumberOfFiles() {
    return numberOfFiles;
  }
  
  public void setNumberOfFiles(Integer numberOfFiles) {
    this.numberOfFiles = numberOfFiles;
  }

  
  /**
   * Total size (in bytes) of all files being downloaded in this download stream.
   **/
  public FirmwareUpdateDescriptor sizeOfStream(Integer sizeOfStream) {
    this.sizeOfStream = sizeOfStream;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total size (in bytes) of all files being downloaded in this download stream.")
  @JsonProperty("sizeOfStream")
  public Integer getSizeOfStream() {
    return sizeOfStream;
  }
  
  public void setSizeOfStream(Integer sizeOfStream) {
    this.sizeOfStream = sizeOfStream;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareUpdateDescriptor firmwareUpdateDescriptor = (FirmwareUpdateDescriptor) o;
    return Objects.equals(this.firmwareChunkImage, firmwareUpdateDescriptor.firmwareChunkImage) &&
        Objects.equals(this.firmwareVersion, firmwareUpdateDescriptor.firmwareVersion) &&
        Objects.equals(this.offset, firmwareUpdateDescriptor.offset) &&
        Objects.equals(this.totalSize, firmwareUpdateDescriptor.totalSize) &&
        Objects.equals(this.stagedDownload, firmwareUpdateDescriptor.stagedDownload) &&
        Objects.equals(this.numberOfFiles, firmwareUpdateDescriptor.numberOfFiles) &&
        Objects.equals(this.sizeOfStream, firmwareUpdateDescriptor.sizeOfStream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firmwareChunkImage, firmwareVersion, offset, totalSize, stagedDownload, numberOfFiles, sizeOfStream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareUpdateDescriptor {\n");
    
    sb.append("    firmwareChunkImage: ").append(toIndentedString(firmwareChunkImage)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    stagedDownload: ").append(toIndentedString(stagedDownload)).append("\n");
    sb.append("    numberOfFiles: ").append(toIndentedString(numberOfFiles)).append("\n");
    sb.append("    sizeOfStream: ").append(toIndentedString(sizeOfStream)).append("\n");
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

