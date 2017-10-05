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
 * VolumeChangeableProperties
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumeChangeableProperties   {
  
    private List<Integer> reconPriority;

    private List<Boolean> preReadRedundancyCheckEnabled;

  
  /**
   * The new reconstruction priority value to be set for the volume. This value must be in the range 0-4, with 0 indicating that reconstruction is favored over any I/O, and 4 indicating that reconstruction should be performed with minimal impact to I/O. Intermediate values indicate various levels of compromise between these two extremes.
   **/
  public VolumeChangeableProperties reconPriority(List<Integer> reconPriority) {
    this.reconPriority = reconPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new reconstruction priority value to be set for the volume. This value must be in the range 0-4, with 0 indicating that reconstruction is favored over any I/O, and 4 indicating that reconstruction should be performed with minimal impact to I/O. Intermediate values indicate various levels of compromise between these two extremes.")
  @JsonProperty("reconPriority")
  public List<Integer> getReconPriority() {
    return reconPriority;
  }
  
  public void setReconPriority(List<Integer> reconPriority) {
    this.reconPriority = reconPriority;
  }

  
  /**
   * The new value of the preReadRedundancyCheckEnabled property to set for the volume. If set to true, the storage controller will, on READ operations, verify RAID redundancy data for the stripe(s) containing the READ data.
   **/
  public VolumeChangeableProperties preReadRedundancyCheckEnabled(List<Boolean> preReadRedundancyCheckEnabled) {
    this.preReadRedundancyCheckEnabled = preReadRedundancyCheckEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new value of the preReadRedundancyCheckEnabled property to set for the volume. If set to true, the storage controller will, on READ operations, verify RAID redundancy data for the stripe(s) containing the READ data.")
  @JsonProperty("preReadRedundancyCheckEnabled")
  public List<Boolean> getPreReadRedundancyCheckEnabled() {
    return preReadRedundancyCheckEnabled;
  }
  
  public void setPreReadRedundancyCheckEnabled(List<Boolean> preReadRedundancyCheckEnabled) {
    this.preReadRedundancyCheckEnabled = preReadRedundancyCheckEnabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeChangeableProperties volumeChangeableProperties = (VolumeChangeableProperties) o;
    return Objects.equals(this.reconPriority, volumeChangeableProperties.reconPriority) &&
        Objects.equals(this.preReadRedundancyCheckEnabled, volumeChangeableProperties.preReadRedundancyCheckEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reconPriority, preReadRedundancyCheckEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeChangeableProperties {\n");
    
    sb.append("    reconPriority: ").append(toIndentedString(reconPriority)).append("\n");
    sb.append("    preReadRedundancyCheckEnabled: ").append(toIndentedString(preReadRedundancyCheckEnabled)).append("\n");
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

