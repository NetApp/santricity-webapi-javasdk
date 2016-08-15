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
 * SocData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SocData   {
  
    private Boolean valid;

    private SocDeviceData socDeviceData;

    private List<SocPortData> socPortData;

  
  /**
   * Set to true if the information in this structure is valid.
   **/
  public SocData valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if the information in this structure is valid.")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  
  /**
   * Port-independent data about the SOC device.
   **/
  public SocData socDeviceData(SocDeviceData socDeviceData) {
    this.socDeviceData = socDeviceData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Port-independent data about the SOC device.")
  @JsonProperty("socDeviceData")
  public SocDeviceData getSocDeviceData() {
    return socDeviceData;
  }
  
  public void setSocDeviceData(SocDeviceData socDeviceData) {
    this.socDeviceData = socDeviceData;
  }

  
  /**
   * An array in which each element (one per port) contains port-dependent SOC device data.
   **/
  public SocData socPortData(List<SocPortData> socPortData) {
    this.socPortData = socPortData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array in which each element (one per port) contains port-dependent SOC device data.")
  @JsonProperty("socPortData")
  public List<SocPortData> getSocPortData() {
    return socPortData;
  }
  
  public void setSocPortData(List<SocPortData> socPortData) {
    this.socPortData = socPortData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocData socData = (SocData) o;
    return Objects.equals(this.valid, socData.valid) &&
        Objects.equals(this.socDeviceData, socData.socDeviceData) &&
        Objects.equals(this.socPortData, socData.socPortData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, socDeviceData, socPortData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocData {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    socDeviceData: ").append(toIndentedString(socDeviceData)).append("\n");
    sb.append("    socPortData: ").append(toIndentedString(socPortData)).append("\n");
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

