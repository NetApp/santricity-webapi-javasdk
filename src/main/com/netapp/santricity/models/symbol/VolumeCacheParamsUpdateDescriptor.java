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
 * VolumeCacheParamsUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumeCacheParamsUpdateDescriptor   {
  
    private String volumeRef;

    private Boolean cwob;

    private Boolean mirrorEnable;

    private Boolean readCacheEnable;

    private Boolean writeCacheEnable;


  /**
   * The cache flush modifier value, which is used to specify the maximum amount of time that dirty data for this volume may be retained in the controller's write cache prior to being flushed to disk.
   */
  public enum CacheFlushModifierEnum {
    flushImmediate("flushImmediate"),
    flush250Msec("flush250Msec"),
    flush500Msec("flush500Msec"),
    flush750Msec("flush750Msec"),
    flush1Sec("flush1Sec"),
    flush1500Msec("flush1500Msec"),
    flush2Sec("flush2Sec"),
    flush5Sec("flush5Sec"),
    flush10Sec("flush10Sec"),
    flush20Sec("flush20Sec"),
    flush60Sec("flush60Sec"),
    flush120Sec("flush120Sec"),
    flush300Sec("flush300Sec"),
    flush1200Sec("flush1200Sec"),
    flush3600Sec("flush3600Sec"),
    flushInfinite("flushInfinite"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CacheFlushModifierEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CacheFlushModifierEnum cacheFlushModifier;

    private Integer readAheadMultiplier;

  
  /**
   * The reference value that identifies the volume whose cache parameters are to be updated.
   **/
  public VolumeCacheParamsUpdateDescriptor volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value that identifies the volume whose cache parameters are to be updated.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * A true/false indication of whether caching without batteries should be allowed for this volume. Note that setting this attribute to true may result in data loss if the array's cache hold-up battery fails, and then a disorderly power-down of the array occurs. This feature should be used only with extreme caution.
   **/
  public VolumeCacheParamsUpdateDescriptor cwob(Boolean cwob) {
    this.cwob = cwob;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true/false indication of whether caching without batteries should be allowed for this volume. Note that setting this attribute to true may result in data loss if the array's cache hold-up battery fails, and then a disorderly power-down of the array occurs. This feature should be used only with extreme caution.")
  @JsonProperty("cwob")
  public Boolean getCwob() {
    return cwob;
  }
  
  public void setCwob(Boolean cwob) {
    this.cwob = cwob;
  }

  
  /**
   * A true/false indication of whether cache mirroring should be enabled for this volume. If enabled, all cache data will be mirrored across controllers to provide increased resilience to potential controller failures.
   **/
  public VolumeCacheParamsUpdateDescriptor mirrorEnable(Boolean mirrorEnable) {
    this.mirrorEnable = mirrorEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true/false indication of whether cache mirroring should be enabled for this volume. If enabled, all cache data will be mirrored across controllers to provide increased resilience to potential controller failures.")
  @JsonProperty("mirrorEnable")
  public Boolean getMirrorEnable() {
    return mirrorEnable;
  }
  
  public void setMirrorEnable(Boolean mirrorEnable) {
    this.mirrorEnable = mirrorEnable;
  }

  
  /**
   * A true/false indication of whether read caching should be enabled for the volume.
   **/
  public VolumeCacheParamsUpdateDescriptor readCacheEnable(Boolean readCacheEnable) {
    this.readCacheEnable = readCacheEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true/false indication of whether read caching should be enabled for the volume.")
  @JsonProperty("readCacheEnable")
  public Boolean getReadCacheEnable() {
    return readCacheEnable;
  }
  
  public void setReadCacheEnable(Boolean readCacheEnable) {
    this.readCacheEnable = readCacheEnable;
  }

  
  /**
   * A true/false indication of whether write-back caching should be enabled for the volume.
   **/
  public VolumeCacheParamsUpdateDescriptor writeCacheEnable(Boolean writeCacheEnable) {
    this.writeCacheEnable = writeCacheEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true/false indication of whether write-back caching should be enabled for the volume.")
  @JsonProperty("writeCacheEnable")
  public Boolean getWriteCacheEnable() {
    return writeCacheEnable;
  }
  
  public void setWriteCacheEnable(Boolean writeCacheEnable) {
    this.writeCacheEnable = writeCacheEnable;
  }

  
  /**
   * The cache flush modifier value, which is used to specify the maximum amount of time that dirty data for this volume may be retained in the controller's write cache prior to being flushed to disk.
   **/
  public VolumeCacheParamsUpdateDescriptor cacheFlushModifier(CacheFlushModifierEnum cacheFlushModifier) {
    this.cacheFlushModifier = cacheFlushModifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The cache flush modifier value, which is used to specify the maximum amount of time that dirty data for this volume may be retained in the controller's write cache prior to being flushed to disk.")
  @JsonProperty("cacheFlushModifier")
  public CacheFlushModifierEnum getCacheFlushModifier() {
    return cacheFlushModifier;
  }
  
  public void setCacheFlushModifier(CacheFlushModifierEnum cacheFlushModifier) {
    this.cacheFlushModifier = cacheFlushModifier;
  }

  
  /**
   * A true (non-zero) / false (zero) indicator of whether or not automatic cache read-ahead is enabled.
   **/
  public VolumeCacheParamsUpdateDescriptor readAheadMultiplier(Integer readAheadMultiplier) {
    this.readAheadMultiplier = readAheadMultiplier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true (non-zero) / false (zero) indicator of whether or not automatic cache read-ahead is enabled.")
  @JsonProperty("readAheadMultiplier")
  public Integer getReadAheadMultiplier() {
    return readAheadMultiplier;
  }
  
  public void setReadAheadMultiplier(Integer readAheadMultiplier) {
    this.readAheadMultiplier = readAheadMultiplier;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCacheParamsUpdateDescriptor volumeCacheParamsUpdateDescriptor = (VolumeCacheParamsUpdateDescriptor) o;
    return Objects.equals(this.volumeRef, volumeCacheParamsUpdateDescriptor.volumeRef) &&
        Objects.equals(this.cwob, volumeCacheParamsUpdateDescriptor.cwob) &&
        Objects.equals(this.mirrorEnable, volumeCacheParamsUpdateDescriptor.mirrorEnable) &&
        Objects.equals(this.readCacheEnable, volumeCacheParamsUpdateDescriptor.readCacheEnable) &&
        Objects.equals(this.writeCacheEnable, volumeCacheParamsUpdateDescriptor.writeCacheEnable) &&
        Objects.equals(this.cacheFlushModifier, volumeCacheParamsUpdateDescriptor.cacheFlushModifier) &&
        Objects.equals(this.readAheadMultiplier, volumeCacheParamsUpdateDescriptor.readAheadMultiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeRef, cwob, mirrorEnable, readCacheEnable, writeCacheEnable, cacheFlushModifier, readAheadMultiplier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCacheParamsUpdateDescriptor {\n");
    
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    cwob: ").append(toIndentedString(cwob)).append("\n");
    sb.append("    mirrorEnable: ").append(toIndentedString(mirrorEnable)).append("\n");
    sb.append("    readCacheEnable: ").append(toIndentedString(readCacheEnable)).append("\n");
    sb.append("    writeCacheEnable: ").append(toIndentedString(writeCacheEnable)).append("\n");
    sb.append("    cacheFlushModifier: ").append(toIndentedString(cacheFlushModifier)).append("\n");
    sb.append("    readAheadMultiplier: ").append(toIndentedString(readAheadMultiplier)).append("\n");
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

