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
 * SACache
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SACache   {
  
    private Integer cacheBlkSize;

    private Integer demandFlushAmount;

    private Integer demandFlushThreshold;

    private String reserved1;

    private String reserved2;

    private Boolean cacheMirroringProtectionInformation;

  
  /**
   * The characteristic size, in bytes, of a cache block.
   **/
  public SACache cacheBlkSize(Integer cacheBlkSize) {
    this.cacheBlkSize = cacheBlkSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The characteristic size, in bytes, of a cache block.")
  @JsonProperty("cacheBlkSize")
  public Integer getCacheBlkSize() {
    return cacheBlkSize;
  }
  
  public void setCacheBlkSize(Integer cacheBlkSize) {
    this.cacheBlkSize = cacheBlkSize;
  }

  
  /**
   * Specifies the amount of cache data that will be flushed to disk when a cache flush operation is initiated. This value is specified as an integer in the range 0-100 that represents the percentage of the controller's write cache data that can remain in the \"dirty\", or unflushed state. When demand flush operations are started, data will be flushed from cache to disk until the overall amount of dirty data drops to or below the percentage specified by this value.
   **/
  public SACache demandFlushAmount(Integer demandFlushAmount) {
    this.demandFlushAmount = demandFlushAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the amount of cache data that will be flushed to disk when a cache flush operation is initiated. This value is specified as an integer in the range 0-100 that represents the percentage of the controller's write cache data that can remain in the \"dirty\", or unflushed state. When demand flush operations are started, data will be flushed from cache to disk until the overall amount of dirty data drops to or below the percentage specified by this value.")
  @JsonProperty("demandFlushAmount")
  public Integer getDemandFlushAmount() {
    return demandFlushAmount;
  }
  
  public void setDemandFlushAmount(Integer demandFlushAmount) {
    this.demandFlushAmount = demandFlushAmount;
  }

  
  /**
   * Specifies the \"level of fullness\" of \"dirty\" data in the controller's write cache which, when reached, will cause the controller to begin flushing data from cache to disk. This value is specified as a percentage, in the range 0-100, of the overall write cache capacity of the controller. After flushing begins, it will continue until enough data has been flushed to drop the percentage of dirty data to or below the value specified in the demandFlushAmount parameter described above.
   **/
  public SACache demandFlushThreshold(Integer demandFlushThreshold) {
    this.demandFlushThreshold = demandFlushThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the \"level of fullness\" of \"dirty\" data in the controller's write cache which, when reached, will cause the controller to begin flushing data from cache to disk. This value is specified as a percentage, in the range 0-100, of the overall write cache capacity of the controller. After flushing begins, it will continue until enough data has been flushed to drop the percentage of dirty data to or below the value specified in the demandFlushAmount parameter described above.")
  @JsonProperty("demandFlushThreshold")
  public Integer getDemandFlushThreshold() {
    return demandFlushThreshold;
  }
  
  public void setDemandFlushThreshold(Integer demandFlushThreshold) {
    this.demandFlushThreshold = demandFlushThreshold;
  }

  
  /**
   **/
  public SACache reserved1(String reserved1) {
    this.reserved1 = reserved1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved1")
  public String getReserved1() {
    return reserved1;
  }
  
  public void setReserved1(String reserved1) {
    this.reserved1 = reserved1;
  }

  
  /**
   **/
  public SACache reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  
  /**
   * True if checking of protection information during cache mirroring is enabled, false otherwise.
   **/
  public SACache cacheMirroringProtectionInformation(Boolean cacheMirroringProtectionInformation) {
    this.cacheMirroringProtectionInformation = cacheMirroringProtectionInformation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if checking of protection information during cache mirroring is enabled, false otherwise.")
  @JsonProperty("cacheMirroringProtectionInformation")
  public Boolean getCacheMirroringProtectionInformation() {
    return cacheMirroringProtectionInformation;
  }
  
  public void setCacheMirroringProtectionInformation(Boolean cacheMirroringProtectionInformation) {
    this.cacheMirroringProtectionInformation = cacheMirroringProtectionInformation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SACache sACache = (SACache) o;
    return Objects.equals(this.cacheBlkSize, sACache.cacheBlkSize) &&
        Objects.equals(this.demandFlushAmount, sACache.demandFlushAmount) &&
        Objects.equals(this.demandFlushThreshold, sACache.demandFlushThreshold) &&
        Objects.equals(this.reserved1, sACache.reserved1) &&
        Objects.equals(this.reserved2, sACache.reserved2) &&
        Objects.equals(this.cacheMirroringProtectionInformation, sACache.cacheMirroringProtectionInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheBlkSize, demandFlushAmount, demandFlushThreshold, reserved1, reserved2, cacheMirroringProtectionInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SACache {\n");
    
    sb.append("    cacheBlkSize: ").append(toIndentedString(cacheBlkSize)).append("\n");
    sb.append("    demandFlushAmount: ").append(toIndentedString(demandFlushAmount)).append("\n");
    sb.append("    demandFlushThreshold: ").append(toIndentedString(demandFlushThreshold)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    cacheMirroringProtectionInformation: ").append(toIndentedString(cacheMirroringProtectionInformation)).append("\n");
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

