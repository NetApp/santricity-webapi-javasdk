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
 * AccessVolume
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AccessVolume   {
  
    private Boolean enabled;

    private Integer volumeHandle;

    private Long capacity;

    private String accessVolumeRef;

    private String reserved1;

  
  /**
   * True if the access volume feature (and thus the UTM command transfer capability) is enabled, or false if it is disabled.
   **/
  public AccessVolume enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the access volume feature (and thus the UTM command transfer capability) is enabled, or false if it is disabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * An identifier value for the AccessVolume object. This will generally correspond to the logical unit number (LUN) that is used to access the volume for UTM protocol command transactions.
   **/
  public AccessVolume volumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An identifier value for the AccessVolume object. This will generally correspond to the logical unit number (LUN) that is used to access the volume for UTM protocol command transactions.")
  @JsonProperty("volumeHandle")
  public Integer getVolumeHandle() {
    return volumeHandle;
  }
  
  public void setVolumeHandle(Integer volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  
  /**
   * The (simulated) capacity of the AccessVolume maintained by the controller. Since there is essentially no true data storage capacity present for an AccessVolume, this value is used to determine the block addressing limit of the unit, which is an important aspect of the UTM command transfer protocol.
   **/
  public AccessVolume capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The (simulated) capacity of the AccessVolume maintained by the controller. Since there is essentially no true data storage capacity present for an AccessVolume, this value is used to determine the block addressing limit of the unit, which is an important aspect of the UTM command transfer protocol.")
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }
  
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  
  /**
   * The identifier value for this AccessVolume. Other objects may use this reference value to refer to the AccessVolume.
   **/
  public AccessVolume accessVolumeRef(String accessVolumeRef) {
    this.accessVolumeRef = accessVolumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier value for this AccessVolume. Other objects may use this reference value to refer to the AccessVolume.")
  @JsonProperty("accessVolumeRef")
  public String getAccessVolumeRef() {
    return accessVolumeRef;
  }
  
  public void setAccessVolumeRef(String accessVolumeRef) {
    this.accessVolumeRef = accessVolumeRef;
  }

  
  /**
   **/
  public AccessVolume reserved1(String reserved1) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessVolume accessVolume = (AccessVolume) o;
    return Objects.equals(this.enabled, accessVolume.enabled) &&
        Objects.equals(this.volumeHandle, accessVolume.volumeHandle) &&
        Objects.equals(this.capacity, accessVolume.capacity) &&
        Objects.equals(this.accessVolumeRef, accessVolume.accessVolumeRef) &&
        Objects.equals(this.reserved1, accessVolume.reserved1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, volumeHandle, capacity, accessVolumeRef, reserved1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessVolume {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    accessVolumeRef: ").append(toIndentedString(accessVolumeRef)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
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

