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
 * FlashCache
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class FlashCache   {
  
    private String wwn;

    private String flashCacheRef;

    private FlashCacheBase flashCacheBase;

    private FlashCacheDriveInfo fcDriveInfo;

    private String id;

  
  /**
   * The WWN of the high level flash cache volume.
   **/
  public FlashCache wwn(String wwn) {
    this.wwn = wwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the high level flash cache volume.")
  @JsonProperty("wwn")
  public String getWwn() {
    return wwn;
  }
  
  public void setWwn(String wwn) {
    this.wwn = wwn;
  }

  
  /**
   * A reference to the high level flash cache volume.
   **/
  public FlashCache flashCacheRef(String flashCacheRef) {
    this.flashCacheRef = flashCacheRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the high level flash cache volume.")
  @JsonProperty("flashCacheRef")
  public String getFlashCacheRef() {
    return flashCacheRef;
  }
  
  public void setFlashCacheRef(String flashCacheRef) {
    this.flashCacheRef = flashCacheRef;
  }

  
  /**
   * Contains the base-level Flash Cache attributes pertaining to all types of Flash Caches.
   **/
  public FlashCache flashCacheBase(FlashCacheBase flashCacheBase) {
    this.flashCacheBase = flashCacheBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains the base-level Flash Cache attributes pertaining to all types of Flash Caches.")
  @JsonProperty("flashCacheBase")
  public FlashCacheBase getFlashCacheBase() {
    return flashCacheBase;
  }
  
  public void setFlashCacheBase(FlashCacheBase flashCacheBase) {
    this.flashCacheBase = flashCacheBase;
  }

  
  /**
   * Drive information for the flash cache.
   **/
  public FlashCache fcDriveInfo(FlashCacheDriveInfo fcDriveInfo) {
    this.fcDriveInfo = fcDriveInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Drive information for the flash cache.")
  @JsonProperty("fcDriveInfo")
  public FlashCacheDriveInfo getFcDriveInfo() {
    return fcDriveInfo;
  }
  
  public void setFcDriveInfo(FlashCacheDriveInfo fcDriveInfo) {
    this.fcDriveInfo = fcDriveInfo;
  }

  
  /**
   **/
  public FlashCache id(String id) {
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
    FlashCache flashCache = (FlashCache) o;
    return Objects.equals(this.wwn, flashCache.wwn) &&
        Objects.equals(this.flashCacheRef, flashCache.flashCacheRef) &&
        Objects.equals(this.flashCacheBase, flashCache.flashCacheBase) &&
        Objects.equals(this.fcDriveInfo, flashCache.fcDriveInfo) &&
        Objects.equals(this.id, flashCache.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wwn, flashCacheRef, flashCacheBase, fcDriveInfo, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashCache {\n");
    
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    flashCacheRef: ").append(toIndentedString(flashCacheRef)).append("\n");
    sb.append("    flashCacheBase: ").append(toIndentedString(flashCacheBase)).append("\n");
    sb.append("    fcDriveInfo: ").append(toIndentedString(fcDriveInfo)).append("\n");
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

