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
 * Change configured cache settings for a volume.
 */
@ApiModel(description = "Change configured cache settings for a volume.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class VolumeCacheSettings   {
  
    private Boolean readCacheEnable;

    private Boolean writeCacheEnable;

    private Boolean readAheadEnable;


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

    private Boolean mirrorEnable;

    private Boolean cacheWithoutBatteries;

  
  /**
   * Indicates whether read caching should be enabled for the volume.
   **/
  public VolumeCacheSettings readCacheEnable(Boolean readCacheEnable) {
    this.readCacheEnable = readCacheEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether read caching should be enabled for the volume.")
  @JsonProperty("readCacheEnable")
  public Boolean getReadCacheEnable() {
    return readCacheEnable;
  }
  
  public void setReadCacheEnable(Boolean readCacheEnable) {
    this.readCacheEnable = readCacheEnable;
  }

  
  /**
   * Indicates whether write-back caching should be enabled for the volume.
   **/
  public VolumeCacheSettings writeCacheEnable(Boolean writeCacheEnable) {
    this.writeCacheEnable = writeCacheEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether write-back caching should be enabled for the volume.")
  @JsonProperty("writeCacheEnable")
  public Boolean getWriteCacheEnable() {
    return writeCacheEnable;
  }
  
  public void setWriteCacheEnable(Boolean writeCacheEnable) {
    this.writeCacheEnable = writeCacheEnable;
  }

  
  /**
   * Indicates whether or not automatic cache read-ahead is enabled
   **/
  public VolumeCacheSettings readAheadEnable(Boolean readAheadEnable) {
    this.readAheadEnable = readAheadEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not automatic cache read-ahead is enabled")
  @JsonProperty("readAheadEnable")
  public Boolean getReadAheadEnable() {
    return readAheadEnable;
  }
  
  public void setReadAheadEnable(Boolean readAheadEnable) {
    this.readAheadEnable = readAheadEnable;
  }

  
  /**
   * The cache flush modifier value, which is used to specify the maximum amount of time that dirty data for this volume may be retained in the controller's write cache prior to being flushed to disk.
   **/
  public VolumeCacheSettings cacheFlushModifier(CacheFlushModifierEnum cacheFlushModifier) {
    this.cacheFlushModifier = cacheFlushModifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The cache flush modifier value, which is used to specify the maximum amount of time that dirty data for this volume may be retained in the controller's write cache prior to being flushed to disk.")
  @JsonProperty("cacheFlushModifier")
  public CacheFlushModifierEnum getCacheFlushModifier() {
    return cacheFlushModifier;
  }
  
  public void setCacheFlushModifier(CacheFlushModifierEnum cacheFlushModifier) {
    this.cacheFlushModifier = cacheFlushModifier;
  }

  
  /**
   * Indicates whether cache mirroring should be enabled for this volume. If enabled, all cache data will be mirrored across controllers to provide increased resilience to potential controller failures.
   **/
  public VolumeCacheSettings mirrorEnable(Boolean mirrorEnable) {
    this.mirrorEnable = mirrorEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether cache mirroring should be enabled for this volume. If enabled, all cache data will be mirrored across controllers to provide increased resilience to potential controller failures.")
  @JsonProperty("mirrorEnable")
  public Boolean getMirrorEnable() {
    return mirrorEnable;
  }
  
  public void setMirrorEnable(Boolean mirrorEnable) {
    this.mirrorEnable = mirrorEnable;
  }

  
  /**
   * Indicates whether caching without batteries should be allowed for this volume. Note that setting this attribute to true may result in data loss if the array's cache hold-up battery fails, and then a disorderly power-down of the array occurs. This feature should be used only with extreme caution. 
   **/
  public VolumeCacheSettings cacheWithoutBatteries(Boolean cacheWithoutBatteries) {
    this.cacheWithoutBatteries = cacheWithoutBatteries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether caching without batteries should be allowed for this volume. Note that setting this attribute to true may result in data loss if the array's cache hold-up battery fails, and then a disorderly power-down of the array occurs. This feature should be used only with extreme caution. ")
  @JsonProperty("cacheWithoutBatteries")
  public Boolean getCacheWithoutBatteries() {
    return cacheWithoutBatteries;
  }
  
  public void setCacheWithoutBatteries(Boolean cacheWithoutBatteries) {
    this.cacheWithoutBatteries = cacheWithoutBatteries;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCacheSettings volumeCacheSettings = (VolumeCacheSettings) o;
    return Objects.equals(this.readCacheEnable, volumeCacheSettings.readCacheEnable) &&
        Objects.equals(this.writeCacheEnable, volumeCacheSettings.writeCacheEnable) &&
        Objects.equals(this.readAheadEnable, volumeCacheSettings.readAheadEnable) &&
        Objects.equals(this.cacheFlushModifier, volumeCacheSettings.cacheFlushModifier) &&
        Objects.equals(this.mirrorEnable, volumeCacheSettings.mirrorEnable) &&
        Objects.equals(this.cacheWithoutBatteries, volumeCacheSettings.cacheWithoutBatteries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readCacheEnable, writeCacheEnable, readAheadEnable, cacheFlushModifier, mirrorEnable, cacheWithoutBatteries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCacheSettings {\n");
    
    sb.append("    readCacheEnable: ").append(toIndentedString(readCacheEnable)).append("\n");
    sb.append("    writeCacheEnable: ").append(toIndentedString(writeCacheEnable)).append("\n");
    sb.append("    readAheadEnable: ").append(toIndentedString(readAheadEnable)).append("\n");
    sb.append("    cacheFlushModifier: ").append(toIndentedString(cacheFlushModifier)).append("\n");
    sb.append("    mirrorEnable: ").append(toIndentedString(mirrorEnable)).append("\n");
    sb.append("    cacheWithoutBatteries: ").append(toIndentedString(cacheWithoutBatteries)).append("\n");
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

