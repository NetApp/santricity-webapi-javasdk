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
 * VolumeCopyCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class VolumeCopyCreationDescriptor   {
  
    private String sourceVolume;

    private String targetVolume;

    private Boolean idleTargetWriteProt;


  /**
   * Importance of copy operation.
   */
  public enum CopyPriorityEnum {
    priority0("priority0"),
    priority1("priority1"),
    priority2("priority2"),
    priority3("priority3"),
    priority4("priority4"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CopyPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CopyPriorityEnum copyPriority;

    private Boolean disableSnapshot;

    private String pgRef;

  
  /**
   * The source volume reference.
   **/
  public VolumeCopyCreationDescriptor sourceVolume(String sourceVolume) {
    this.sourceVolume = sourceVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The source volume reference.")
  @JsonProperty("sourceVolume")
  public String getSourceVolume() {
    return sourceVolume;
  }
  
  public void setSourceVolume(String sourceVolume) {
    this.sourceVolume = sourceVolume;
  }

  
  /**
   * The target volume reference.
   **/
  public VolumeCopyCreationDescriptor targetVolume(String targetVolume) {
    this.targetVolume = targetVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The target volume reference.")
  @JsonProperty("targetVolume")
  public String getTargetVolume() {
    return targetVolume;
  }
  
  public void setTargetVolume(String targetVolume) {
    this.targetVolume = targetVolume;
  }

  
  /**
   * Apply write protection to target volume when copy is idle (true/false).
   **/
  public VolumeCopyCreationDescriptor idleTargetWriteProt(Boolean idleTargetWriteProt) {
    this.idleTargetWriteProt = idleTargetWriteProt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apply write protection to target volume when copy is idle (true/false).")
  @JsonProperty("idleTargetWriteProt")
  public Boolean getIdleTargetWriteProt() {
    return idleTargetWriteProt;
  }
  
  public void setIdleTargetWriteProt(Boolean idleTargetWriteProt) {
    this.idleTargetWriteProt = idleTargetWriteProt;
  }

  
  /**
   * Importance of copy operation.
   **/
  public VolumeCopyCreationDescriptor copyPriority(CopyPriorityEnum copyPriority) {
    this.copyPriority = copyPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Importance of copy operation.")
  @JsonProperty("copyPriority")
  public CopyPriorityEnum getCopyPriority() {
    return copyPriority;
  }
  
  public void setCopyPriority(CopyPriorityEnum copyPriority) {
    this.copyPriority = copyPriority;
  }

  
  /**
   * When true, this indicates that the source snapshot should be disabled when the physical copy operation is complete. This field is only set to true when the volume copy is a clone.
   **/
  public VolumeCopyCreationDescriptor disableSnapshot(Boolean disableSnapshot) {
    this.disableSnapshot = disableSnapshot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When true, this indicates that the source snapshot should be disabled when the physical copy operation is complete. This field is only set to true when the volume copy is a clone.")
  @JsonProperty("disableSnapshot")
  public Boolean getDisableSnapshot() {
    return disableSnapshot;
  }
  
  public void setDisableSnapshot(Boolean disableSnapshot) {
    this.disableSnapshot = disableSnapshot;
  }

  
  /**
   * For clones based on PiT Groups, this will identify the PiT Group.
   **/
  public VolumeCopyCreationDescriptor pgRef(String pgRef) {
    this.pgRef = pgRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "For clones based on PiT Groups, this will identify the PiT Group.")
  @JsonProperty("pgRef")
  public String getPgRef() {
    return pgRef;
  }
  
  public void setPgRef(String pgRef) {
    this.pgRef = pgRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCopyCreationDescriptor volumeCopyCreationDescriptor = (VolumeCopyCreationDescriptor) o;
    return Objects.equals(this.sourceVolume, volumeCopyCreationDescriptor.sourceVolume) &&
        Objects.equals(this.targetVolume, volumeCopyCreationDescriptor.targetVolume) &&
        Objects.equals(this.idleTargetWriteProt, volumeCopyCreationDescriptor.idleTargetWriteProt) &&
        Objects.equals(this.copyPriority, volumeCopyCreationDescriptor.copyPriority) &&
        Objects.equals(this.disableSnapshot, volumeCopyCreationDescriptor.disableSnapshot) &&
        Objects.equals(this.pgRef, volumeCopyCreationDescriptor.pgRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceVolume, targetVolume, idleTargetWriteProt, copyPriority, disableSnapshot, pgRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCopyCreationDescriptor {\n");
    
    sb.append("    sourceVolume: ").append(toIndentedString(sourceVolume)).append("\n");
    sb.append("    targetVolume: ").append(toIndentedString(targetVolume)).append("\n");
    sb.append("    idleTargetWriteProt: ").append(toIndentedString(idleTargetWriteProt)).append("\n");
    sb.append("    copyPriority: ").append(toIndentedString(copyPriority)).append("\n");
    sb.append("    disableSnapshot: ").append(toIndentedString(disableSnapshot)).append("\n");
    sb.append("    pgRef: ").append(toIndentedString(pgRef)).append("\n");
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

