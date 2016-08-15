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
 * ThinVolumeDefaultAttributes
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ThinVolumeDefaultAttributes   {
  
    private Long minProvisionedCapacity;

    private Long maxProvisionedCapacity;

    private Long minVirtualCapacity;

    private Long maxVirtualCapacity;

    private Integer minAlertThreshold;

    private Integer defaultAlertThreshold;

  
  /**
   * The minimum provisioned capacity in bytes.
   **/
  public ThinVolumeDefaultAttributes minProvisionedCapacity(Long minProvisionedCapacity) {
    this.minProvisionedCapacity = minProvisionedCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum provisioned capacity in bytes.")
  @JsonProperty("minProvisionedCapacity")
  public Long getMinProvisionedCapacity() {
    return minProvisionedCapacity;
  }
  
  public void setMinProvisionedCapacity(Long minProvisionedCapacity) {
    this.minProvisionedCapacity = minProvisionedCapacity;
  }

  
  /**
   * The maximum provisioned capacity in bytes.
   **/
  public ThinVolumeDefaultAttributes maxProvisionedCapacity(Long maxProvisionedCapacity) {
    this.maxProvisionedCapacity = maxProvisionedCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum provisioned capacity in bytes.")
  @JsonProperty("maxProvisionedCapacity")
  public Long getMaxProvisionedCapacity() {
    return maxProvisionedCapacity;
  }
  
  public void setMaxProvisionedCapacity(Long maxProvisionedCapacity) {
    this.maxProvisionedCapacity = maxProvisionedCapacity;
  }

  
  /**
   * The minimum virtual capacity in bytes.
   **/
  public ThinVolumeDefaultAttributes minVirtualCapacity(Long minVirtualCapacity) {
    this.minVirtualCapacity = minVirtualCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum virtual capacity in bytes.")
  @JsonProperty("minVirtualCapacity")
  public Long getMinVirtualCapacity() {
    return minVirtualCapacity;
  }
  
  public void setMinVirtualCapacity(Long minVirtualCapacity) {
    this.minVirtualCapacity = minVirtualCapacity;
  }

  
  /**
   * The maximum virtual capacity in bytes.
   **/
  public ThinVolumeDefaultAttributes maxVirtualCapacity(Long maxVirtualCapacity) {
    this.maxVirtualCapacity = maxVirtualCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum virtual capacity in bytes.")
  @JsonProperty("maxVirtualCapacity")
  public Long getMaxVirtualCapacity() {
    return maxVirtualCapacity;
  }
  
  public void setMaxVirtualCapacity(Long maxVirtualCapacity) {
    this.maxVirtualCapacity = maxVirtualCapacity;
  }

  
  /**
   * The minimum alert threshold as a percentage.
   **/
  public ThinVolumeDefaultAttributes minAlertThreshold(Integer minAlertThreshold) {
    this.minAlertThreshold = minAlertThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum alert threshold as a percentage.")
  @JsonProperty("minAlertThreshold")
  public Integer getMinAlertThreshold() {
    return minAlertThreshold;
  }
  
  public void setMinAlertThreshold(Integer minAlertThreshold) {
    this.minAlertThreshold = minAlertThreshold;
  }

  
  /**
   * The default alert threshold as a percentage.
   **/
  public ThinVolumeDefaultAttributes defaultAlertThreshold(Integer defaultAlertThreshold) {
    this.defaultAlertThreshold = defaultAlertThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The default alert threshold as a percentage.")
  @JsonProperty("defaultAlertThreshold")
  public Integer getDefaultAlertThreshold() {
    return defaultAlertThreshold;
  }
  
  public void setDefaultAlertThreshold(Integer defaultAlertThreshold) {
    this.defaultAlertThreshold = defaultAlertThreshold;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThinVolumeDefaultAttributes thinVolumeDefaultAttributes = (ThinVolumeDefaultAttributes) o;
    return Objects.equals(this.minProvisionedCapacity, thinVolumeDefaultAttributes.minProvisionedCapacity) &&
        Objects.equals(this.maxProvisionedCapacity, thinVolumeDefaultAttributes.maxProvisionedCapacity) &&
        Objects.equals(this.minVirtualCapacity, thinVolumeDefaultAttributes.minVirtualCapacity) &&
        Objects.equals(this.maxVirtualCapacity, thinVolumeDefaultAttributes.maxVirtualCapacity) &&
        Objects.equals(this.minAlertThreshold, thinVolumeDefaultAttributes.minAlertThreshold) &&
        Objects.equals(this.defaultAlertThreshold, thinVolumeDefaultAttributes.defaultAlertThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minProvisionedCapacity, maxProvisionedCapacity, minVirtualCapacity, maxVirtualCapacity, minAlertThreshold, defaultAlertThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinVolumeDefaultAttributes {\n");
    
    sb.append("    minProvisionedCapacity: ").append(toIndentedString(minProvisionedCapacity)).append("\n");
    sb.append("    maxProvisionedCapacity: ").append(toIndentedString(maxProvisionedCapacity)).append("\n");
    sb.append("    minVirtualCapacity: ").append(toIndentedString(minVirtualCapacity)).append("\n");
    sb.append("    maxVirtualCapacity: ").append(toIndentedString(maxVirtualCapacity)).append("\n");
    sb.append("    minAlertThreshold: ").append(toIndentedString(minAlertThreshold)).append("\n");
    sb.append("    defaultAlertThreshold: ").append(toIndentedString(defaultAlertThreshold)).append("\n");
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

