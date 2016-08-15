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
 * VolumeUsageHint
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class VolumeUsageHint   {
  

  /**
   * How the volume will be used (e.g. multimedia, transactional, file system).
   */
  public enum UsageHintEnum {
    multimedia("multimedia"),
    transactional("transactional"),
    filesystem("filesystem"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    UsageHintEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private UsageHintEnum usageHint;

    private Integer segmentSize;

    private Integer readAhead;

  
  /**
   * How the volume will be used (e.g. multimedia, transactional, file system).
   **/
  public VolumeUsageHint usageHint(UsageHintEnum usageHint) {
    this.usageHint = usageHint;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "How the volume will be used (e.g. multimedia, transactional, file system).")
  @JsonProperty("usageHint")
  public UsageHintEnum getUsageHint() {
    return usageHint;
  }
  
  public void setUsageHint(UsageHintEnum usageHint) {
    this.usageHint = usageHint;
  }

  
  /**
   * The volume segment size.
   **/
  public VolumeUsageHint segmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume segment size.")
  @JsonProperty("segmentSize")
  public Integer getSegmentSize() {
    return segmentSize;
  }
  
  public void setSegmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
  }

  
  /**
   * A true (non-zero) / false (zero) indicator of whether or not automatic cache read-ahead is enabled.
   **/
  public VolumeUsageHint readAhead(Integer readAhead) {
    this.readAhead = readAhead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true (non-zero) / false (zero) indicator of whether or not automatic cache read-ahead is enabled.")
  @JsonProperty("readAhead")
  public Integer getReadAhead() {
    return readAhead;
  }
  
  public void setReadAhead(Integer readAhead) {
    this.readAhead = readAhead;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeUsageHint volumeUsageHint = (VolumeUsageHint) o;
    return Objects.equals(this.usageHint, volumeUsageHint.usageHint) &&
        Objects.equals(this.segmentSize, volumeUsageHint.segmentSize) &&
        Objects.equals(this.readAhead, volumeUsageHint.readAhead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageHint, segmentSize, readAhead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeUsageHint {\n");
    
    sb.append("    usageHint: ").append(toIndentedString(usageHint)).append("\n");
    sb.append("    segmentSize: ").append(toIndentedString(segmentSize)).append("\n");
    sb.append("    readAhead: ").append(toIndentedString(readAhead)).append("\n");
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

