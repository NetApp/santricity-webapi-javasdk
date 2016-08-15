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
 * AsyncMirrorRepositoryUtilization
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AsyncMirrorRepositoryUtilization   {
  
    private Long pitDataBytes;

    private Long deltaLogBytes;

    private Long bytesAvailable;

    private String mirrorRef;

    private String id;

  
  /**
   * The total number of bytes used in the repository for copy-on-write data and related metadata.
   **/
  public AsyncMirrorRepositoryUtilization pitDataBytes(Long pitDataBytes) {
    this.pitDataBytes = pitDataBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of bytes used in the repository for copy-on-write data and related metadata.")
  @JsonProperty("pitDataBytes")
  public Long getPitDataBytes() {
    return pitDataBytes;
  }
  
  public void setPitDataBytes(Long pitDataBytes) {
    this.pitDataBytes = pitDataBytes;
  }

  
  /**
   * The total number of bytes used for the delta logs (bitmaps).
   **/
  public AsyncMirrorRepositoryUtilization deltaLogBytes(Long deltaLogBytes) {
    this.deltaLogBytes = deltaLogBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of bytes used for the delta logs (bitmaps).")
  @JsonProperty("deltaLogBytes")
  public Long getDeltaLogBytes() {
    return deltaLogBytes;
  }
  
  public void setDeltaLogBytes(Long deltaLogBytes) {
    this.deltaLogBytes = deltaLogBytes;
  }

  
  /**
   * The total number of bytes available for ongoing copy-on-write operations.
   **/
  public AsyncMirrorRepositoryUtilization bytesAvailable(Long bytesAvailable) {
    this.bytesAvailable = bytesAvailable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of bytes available for ongoing copy-on-write operations.")
  @JsonProperty("bytesAvailable")
  public Long getBytesAvailable() {
    return bytesAvailable;
  }
  
  public void setBytesAvailable(Long bytesAvailable) {
    this.bytesAvailable = bytesAvailable;
  }

  
  /**
   * The mirror group member for which this utilization information applies.
   **/
  public AsyncMirrorRepositoryUtilization mirrorRef(String mirrorRef) {
    this.mirrorRef = mirrorRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The mirror group member for which this utilization information applies.")
  @JsonProperty("mirrorRef")
  public String getMirrorRef() {
    return mirrorRef;
  }
  
  public void setMirrorRef(String mirrorRef) {
    this.mirrorRef = mirrorRef;
  }

  
  /**
   **/
  public AsyncMirrorRepositoryUtilization id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorRepositoryUtilization asyncMirrorRepositoryUtilization = (AsyncMirrorRepositoryUtilization) o;
    return Objects.equals(this.pitDataBytes, asyncMirrorRepositoryUtilization.pitDataBytes) &&
        Objects.equals(this.deltaLogBytes, asyncMirrorRepositoryUtilization.deltaLogBytes) &&
        Objects.equals(this.bytesAvailable, asyncMirrorRepositoryUtilization.bytesAvailable) &&
        Objects.equals(this.mirrorRef, asyncMirrorRepositoryUtilization.mirrorRef) &&
        Objects.equals(this.id, asyncMirrorRepositoryUtilization.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pitDataBytes, deltaLogBytes, bytesAvailable, mirrorRef, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorRepositoryUtilization {\n");
    
    sb.append("    pitDataBytes: ").append(toIndentedString(pitDataBytes)).append("\n");
    sb.append("    deltaLogBytes: ").append(toIndentedString(deltaLogBytes)).append("\n");
    sb.append("    bytesAvailable: ").append(toIndentedString(bytesAvailable)).append("\n");
    sb.append("    mirrorRef: ").append(toIndentedString(mirrorRef)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

