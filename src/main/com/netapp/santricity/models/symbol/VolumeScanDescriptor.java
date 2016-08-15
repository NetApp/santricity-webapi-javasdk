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
 * VolumeScanDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class VolumeScanDescriptor   {
  
    private String volumeRef;

    private Long startingLBA;

    private Long endingLBA;

    private Boolean repairMedia;

    private Boolean repairParity;


  /**
   * Scan priority
   */
  public enum PriorityEnum {
    priority0("priority0"),
    priority1("priority1"),
    priority2("priority2"),
    priority3("priority3"),
    priority4("priority4"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PriorityEnum priority;

    private Integer timeout;

  
  /**
   * The reference value that identifies the volume to be scanned/repaired.
   **/
  public VolumeScanDescriptor volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value that identifies the volume to be scanned/repaired.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * The starting LBA of the scan/repair.
   **/
  public VolumeScanDescriptor startingLBA(Long startingLBA) {
    this.startingLBA = startingLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The starting LBA of the scan/repair.")
  @JsonProperty("startingLBA")
  public Long getStartingLBA() {
    return startingLBA;
  }
  
  public void setStartingLBA(Long startingLBA) {
    this.startingLBA = startingLBA;
  }

  
  /**
   * The ending LBA of the scan/repair.
   **/
  public VolumeScanDescriptor endingLBA(Long endingLBA) {
    this.endingLBA = endingLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ending LBA of the scan/repair.")
  @JsonProperty("endingLBA")
  public Long getEndingLBA() {
    return endingLBA;
  }
  
  public void setEndingLBA(Long endingLBA) {
    this.endingLBA = endingLBA;
  }

  
  /**
   * When this parameter is set to true(1) the controller will automatically repair any media errors detected during the scan. When it is set to false(0) the scan will stop on any media error detected and report the error in the ParityScanResponse.
   **/
  public VolumeScanDescriptor repairMedia(Boolean repairMedia) {
    this.repairMedia = repairMedia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When this parameter is set to true(1) the controller will automatically repair any media errors detected during the scan. When it is set to false(0) the scan will stop on any media error detected and report the error in the ParityScanResponse.")
  @JsonProperty("repairMedia")
  public Boolean getRepairMedia() {
    return repairMedia;
  }
  
  public void setRepairMedia(Boolean repairMedia) {
    this.repairMedia = repairMedia;
  }

  
  /**
   * When this parameter is set to true(1) the parity for the data stripe containing startingLBA will be repaired. When this parameter is set to false(0) the controller performs a volume parity scan on the data from startingLBA to endingLBA.
   **/
  public VolumeScanDescriptor repairParity(Boolean repairParity) {
    this.repairParity = repairParity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When this parameter is set to true(1) the parity for the data stripe containing startingLBA will be repaired. When this parameter is set to false(0) the controller performs a volume parity scan on the data from startingLBA to endingLBA.")
  @JsonProperty("repairParity")
  public Boolean getRepairParity() {
    return repairParity;
  }
  
  public void setRepairParity(Boolean repairParity) {
    this.repairParity = repairParity;
  }

  
  /**
   * Scan priority
   **/
  public VolumeScanDescriptor priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Scan priority")
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }
  
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  
  /**
   * Volume scan timeout, in seconds.
   **/
  public VolumeScanDescriptor timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Volume scan timeout, in seconds.")
  @JsonProperty("timeout")
  public Integer getTimeout() {
    return timeout;
  }
  
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeScanDescriptor volumeScanDescriptor = (VolumeScanDescriptor) o;
    return Objects.equals(this.volumeRef, volumeScanDescriptor.volumeRef) &&
        Objects.equals(this.startingLBA, volumeScanDescriptor.startingLBA) &&
        Objects.equals(this.endingLBA, volumeScanDescriptor.endingLBA) &&
        Objects.equals(this.repairMedia, volumeScanDescriptor.repairMedia) &&
        Objects.equals(this.repairParity, volumeScanDescriptor.repairParity) &&
        Objects.equals(this.priority, volumeScanDescriptor.priority) &&
        Objects.equals(this.timeout, volumeScanDescriptor.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeRef, startingLBA, endingLBA, repairMedia, repairParity, priority, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeScanDescriptor {\n");
    
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    startingLBA: ").append(toIndentedString(startingLBA)).append("\n");
    sb.append("    endingLBA: ").append(toIndentedString(endingLBA)).append("\n");
    sb.append("    repairMedia: ").append(toIndentedString(repairMedia)).append("\n");
    sb.append("    repairParity: ").append(toIndentedString(repairParity)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

