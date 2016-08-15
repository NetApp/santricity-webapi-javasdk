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
 * VolumeCache
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class VolumeCache   {
  
    private Boolean cwob;

    private Boolean enterpriseCacheDump;

    private Boolean mirrorActive;

    private Boolean mirrorEnable;

    private Boolean readCacheActive;

    private Boolean readCacheEnable;

    private Boolean writeCacheActive;

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
   * A true value means that the controller is allowed to use write-back caching of dirty data even when the cache memory's battery-backup protection is not available or not operational. A false value means that any problems with the battery-backup protection of the write cache will cause the controller to suspend all write-back caching operations for the volume.
   **/
  public VolumeCache cwob(Boolean cwob) {
    this.cwob = cwob;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true value means that the controller is allowed to use write-back caching of dirty data even when the cache memory's battery-backup protection is not available or not operational. A false value means that any problems with the battery-backup protection of the write cache will cause the controller to suspend all write-back caching operations for the volume.")
  @JsonProperty("cwob")
  public Boolean getCwob() {
    return cwob;
  }
  
  public void setCwob(Boolean cwob) {
    this.cwob = cwob;
  }

  
  /**
   * A true value means that all dirty data in the write cache will be flushed immediately and further write-back caching will be disabled if the controller detects that a UPS unit has switched from standard power to battery backup. A false value means that write-back caching is not impacted by the state of the UPS.
   **/
  public VolumeCache enterpriseCacheDump(Boolean enterpriseCacheDump) {
    this.enterpriseCacheDump = enterpriseCacheDump;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true value means that all dirty data in the write cache will be flushed immediately and further write-back caching will be disabled if the controller detects that a UPS unit has switched from standard power to battery backup. A false value means that write-back caching is not impacted by the state of the UPS.")
  @JsonProperty("enterpriseCacheDump")
  public Boolean getEnterpriseCacheDump() {
    return enterpriseCacheDump;
  }
  
  public void setEnterpriseCacheDump(Boolean enterpriseCacheDump) {
    this.enterpriseCacheDump = enterpriseCacheDump;
  }

  
  /**
   * An indication of whether the cache mirroring option is active for the volume's data.
   **/
  public VolumeCache mirrorActive(Boolean mirrorActive) {
    this.mirrorActive = mirrorActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether the cache mirroring option is active for the volume's data.")
  @JsonProperty("mirrorActive")
  public Boolean getMirrorActive() {
    return mirrorActive;
  }
  
  public void setMirrorActive(Boolean mirrorActive) {
    this.mirrorActive = mirrorActive;
  }

  
  /**
   * An indication of whether the cache mirroring feature is currently enabled for this volume. It is possible that the mirrorEnable and mirrorActive values differ; this may occur, for example, if the alternate controller is removed or failed.
   **/
  public VolumeCache mirrorEnable(Boolean mirrorEnable) {
    this.mirrorEnable = mirrorEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether the cache mirroring feature is currently enabled for this volume. It is possible that the mirrorEnable and mirrorActive values differ; this may occur, for example, if the alternate controller is removed or failed.")
  @JsonProperty("mirrorEnable")
  public Boolean getMirrorEnable() {
    return mirrorEnable;
  }
  
  public void setMirrorEnable(Boolean mirrorEnable) {
    this.mirrorEnable = mirrorEnable;
  }

  
  /**
   * An indication of whether read caching is active for the volume.
   **/
  public VolumeCache readCacheActive(Boolean readCacheActive) {
    this.readCacheActive = readCacheActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether read caching is active for the volume.")
  @JsonProperty("readCacheActive")
  public Boolean getReadCacheActive() {
    return readCacheActive;
  }
  
  public void setReadCacheActive(Boolean readCacheActive) {
    this.readCacheActive = readCacheActive;
  }

  
  /**
   * An indication of whether read caching is enabled for the volume. Note that this value may not match the readCacheActive setting in cases where problems with the controller cache or its battery back-up have been detected.
   **/
  public VolumeCache readCacheEnable(Boolean readCacheEnable) {
    this.readCacheEnable = readCacheEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether read caching is enabled for the volume. Note that this value may not match the readCacheActive setting in cases where problems with the controller cache or its battery back-up have been detected.")
  @JsonProperty("readCacheEnable")
  public Boolean getReadCacheEnable() {
    return readCacheEnable;
  }
  
  public void setReadCacheEnable(Boolean readCacheEnable) {
    this.readCacheEnable = readCacheEnable;
  }

  
  /**
   * An indication of whether write-back caching is active for the volume.
   **/
  public VolumeCache writeCacheActive(Boolean writeCacheActive) {
    this.writeCacheActive = writeCacheActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether write-back caching is active for the volume.")
  @JsonProperty("writeCacheActive")
  public Boolean getWriteCacheActive() {
    return writeCacheActive;
  }
  
  public void setWriteCacheActive(Boolean writeCacheActive) {
    this.writeCacheActive = writeCacheActive;
  }

  
  /**
   * An indication of whether write-back caching is enabled for the volume. Note that this value may not match the writeCacheActive setting in cases where problems with the controller cache or its battery back-up have been detected.
   **/
  public VolumeCache writeCacheEnable(Boolean writeCacheEnable) {
    this.writeCacheEnable = writeCacheEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether write-back caching is enabled for the volume. Note that this value may not match the writeCacheActive setting in cases where problems with the controller cache or its battery back-up have been detected.")
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
  public VolumeCache cacheFlushModifier(CacheFlushModifierEnum cacheFlushModifier) {
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
  public VolumeCache readAheadMultiplier(Integer readAheadMultiplier) {
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
    VolumeCache volumeCache = (VolumeCache) o;
    return Objects.equals(this.cwob, volumeCache.cwob) &&
        Objects.equals(this.enterpriseCacheDump, volumeCache.enterpriseCacheDump) &&
        Objects.equals(this.mirrorActive, volumeCache.mirrorActive) &&
        Objects.equals(this.mirrorEnable, volumeCache.mirrorEnable) &&
        Objects.equals(this.readCacheActive, volumeCache.readCacheActive) &&
        Objects.equals(this.readCacheEnable, volumeCache.readCacheEnable) &&
        Objects.equals(this.writeCacheActive, volumeCache.writeCacheActive) &&
        Objects.equals(this.writeCacheEnable, volumeCache.writeCacheEnable) &&
        Objects.equals(this.cacheFlushModifier, volumeCache.cacheFlushModifier) &&
        Objects.equals(this.readAheadMultiplier, volumeCache.readAheadMultiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cwob, enterpriseCacheDump, mirrorActive, mirrorEnable, readCacheActive, readCacheEnable, writeCacheActive, writeCacheEnable, cacheFlushModifier, readAheadMultiplier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCache {\n");
    
    sb.append("    cwob: ").append(toIndentedString(cwob)).append("\n");
    sb.append("    enterpriseCacheDump: ").append(toIndentedString(enterpriseCacheDump)).append("\n");
    sb.append("    mirrorActive: ").append(toIndentedString(mirrorActive)).append("\n");
    sb.append("    mirrorEnable: ").append(toIndentedString(mirrorEnable)).append("\n");
    sb.append("    readCacheActive: ").append(toIndentedString(readCacheActive)).append("\n");
    sb.append("    readCacheEnable: ").append(toIndentedString(readCacheEnable)).append("\n");
    sb.append("    writeCacheActive: ").append(toIndentedString(writeCacheActive)).append("\n");
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

