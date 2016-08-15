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
 * DiskPoolThresholdUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DiskPoolThresholdUpdateDescriptor   {
  
    private String volumeGroupRef;


  /**
   * The type of threshold to set.
   */
  public enum ThresholdTypeEnum {
    invalid("invalid"),
    warning("warning"),
    critical("critical"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ThresholdTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ThresholdTypeEnum thresholdType;

    private Integer newThresholdValue;

  
  /**
   * A reference to the Disk Pool.
   **/
  public DiskPoolThresholdUpdateDescriptor volumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the Disk Pool.")
  @JsonProperty("volumeGroupRef")
  public String getVolumeGroupRef() {
    return volumeGroupRef;
  }
  
  public void setVolumeGroupRef(String volumeGroupRef) {
    this.volumeGroupRef = volumeGroupRef;
  }

  
  /**
   * The type of threshold to set.
   **/
  public DiskPoolThresholdUpdateDescriptor thresholdType(ThresholdTypeEnum thresholdType) {
    this.thresholdType = thresholdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of threshold to set.")
  @JsonProperty("thresholdType")
  public ThresholdTypeEnum getThresholdType() {
    return thresholdType;
  }
  
  public void setThresholdType(ThresholdTypeEnum thresholdType) {
    this.thresholdType = thresholdType;
  }

  
  /**
   * The new threshold value.
   **/
  public DiskPoolThresholdUpdateDescriptor newThresholdValue(Integer newThresholdValue) {
    this.newThresholdValue = newThresholdValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new threshold value.")
  @JsonProperty("newThresholdValue")
  public Integer getNewThresholdValue() {
    return newThresholdValue;
  }
  
  public void setNewThresholdValue(Integer newThresholdValue) {
    this.newThresholdValue = newThresholdValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskPoolThresholdUpdateDescriptor diskPoolThresholdUpdateDescriptor = (DiskPoolThresholdUpdateDescriptor) o;
    return Objects.equals(this.volumeGroupRef, diskPoolThresholdUpdateDescriptor.volumeGroupRef) &&
        Objects.equals(this.thresholdType, diskPoolThresholdUpdateDescriptor.thresholdType) &&
        Objects.equals(this.newThresholdValue, diskPoolThresholdUpdateDescriptor.newThresholdValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeGroupRef, thresholdType, newThresholdValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskPoolThresholdUpdateDescriptor {\n");
    
    sb.append("    volumeGroupRef: ").append(toIndentedString(volumeGroupRef)).append("\n");
    sb.append("    thresholdType: ").append(toIndentedString(thresholdType)).append("\n");
    sb.append("    newThresholdValue: ").append(toIndentedString(newThresholdValue)).append("\n");
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

