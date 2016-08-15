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
 * FlashCacheParamsUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FlashCacheParamsUpdateDescriptor   {
  
    private String flashCacheRef;


  /**
   * The flash cache configuration type. This identifies how the flash cache is to be used.
   */
  public enum ConfigTypeEnum {
    unknown("unknown"),
    filesystem("filesystem"),
    database("database"),
    multimedia("multimedia"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ConfigTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ConfigTypeEnum configType;

    private String userLabel;

  
  /**
   * The flash cache to which the parameters should be applied.
   **/
  public FlashCacheParamsUpdateDescriptor flashCacheRef(String flashCacheRef) {
    this.flashCacheRef = flashCacheRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flash cache to which the parameters should be applied.")
  @JsonProperty("flashCacheRef")
  public String getFlashCacheRef() {
    return flashCacheRef;
  }
  
  public void setFlashCacheRef(String flashCacheRef) {
    this.flashCacheRef = flashCacheRef;
  }

  
  /**
   * The flash cache configuration type. This identifies how the flash cache is to be used.
   **/
  public FlashCacheParamsUpdateDescriptor configType(ConfigTypeEnum configType) {
    this.configType = configType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flash cache configuration type. This identifies how the flash cache is to be used.")
  @JsonProperty("configType")
  public ConfigTypeEnum getConfigType() {
    return configType;
  }
  
  public void setConfigType(ConfigTypeEnum configType) {
    this.configType = configType;
  }

  
  /**
   * The user assigned label of the flash cache.
   **/
  public FlashCacheParamsUpdateDescriptor userLabel(String userLabel) {
    this.userLabel = userLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned label of the flash cache.")
  @JsonProperty("userLabel")
  public String getUserLabel() {
    return userLabel;
  }
  
  public void setUserLabel(String userLabel) {
    this.userLabel = userLabel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlashCacheParamsUpdateDescriptor flashCacheParamsUpdateDescriptor = (FlashCacheParamsUpdateDescriptor) o;
    return Objects.equals(this.flashCacheRef, flashCacheParamsUpdateDescriptor.flashCacheRef) &&
        Objects.equals(this.configType, flashCacheParamsUpdateDescriptor.configType) &&
        Objects.equals(this.userLabel, flashCacheParamsUpdateDescriptor.userLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flashCacheRef, configType, userLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashCacheParamsUpdateDescriptor {\n");
    
    sb.append("    flashCacheRef: ").append(toIndentedString(flashCacheRef)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    userLabel: ").append(toIndentedString(userLabel)).append("\n");
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

