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
 * ThinVolumeCacheSettings
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ThinVolumeCacheSettings   {
  
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

  
  /**
   * Indicates whether read caching should be enabled for the volume.
   **/
  public ThinVolumeCacheSettings readCacheEnable(Boolean readCacheEnable) {
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
  public ThinVolumeCacheSettings writeCacheEnable(Boolean writeCacheEnable) {
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
   * The cache flush modifier value, which is used to specify the maximum amount of time that dirty data for this volume may be retained in the controller's write cache prior to being flushed to disk.
   **/
  public ThinVolumeCacheSettings cacheFlushModifier(CacheFlushModifierEnum cacheFlushModifier) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThinVolumeCacheSettings thinVolumeCacheSettings = (ThinVolumeCacheSettings) o;
    return Objects.equals(this.readCacheEnable, thinVolumeCacheSettings.readCacheEnable) &&
        Objects.equals(this.writeCacheEnable, thinVolumeCacheSettings.writeCacheEnable) &&
        Objects.equals(this.cacheFlushModifier, thinVolumeCacheSettings.cacheFlushModifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readCacheEnable, writeCacheEnable, cacheFlushModifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinVolumeCacheSettings {\n");
    
    sb.append("    readCacheEnable: ").append(toIndentedString(readCacheEnable)).append("\n");
    sb.append("    writeCacheEnable: ").append(toIndentedString(writeCacheEnable)).append("\n");
    sb.append("    cacheFlushModifier: ").append(toIndentedString(cacheFlushModifier)).append("\n");
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

