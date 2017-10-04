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
 * VolumeCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class VolumeCreationDescriptor   {
  
    private VolumeCandidate candidate;

    private String label;

    private String manager;

    private Long capacity;

    private Integer segmentSize;

    private Integer readAhead;

    private Boolean writeZeros;

    private Boolean noMapping;

    private String volumeGroupLabel;


  /**
   * This field specifies which protection type should be used for the volume being created.
   */
  public enum ProtectionTypeEnum {
    type0Protection("type0Protection"),
    type1Protection("type1Protection"),
    type2Protection("type2Protection"),
    type3Protection("type3Protection"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ProtectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ProtectionTypeEnum protectionType;

  
  /**
   * The volume candidate object that is to be used as the basis for the new volume.
   **/
  public VolumeCreationDescriptor candidate(VolumeCandidate candidate) {
    this.candidate = candidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume candidate object that is to be used as the basis for the new volume.")
  @JsonProperty("candidate")
  public VolumeCandidate getCandidate() {
    return candidate;
  }
  
  public void setCandidate(VolumeCandidate candidate) {
    this.candidate = candidate;
  }

  
  /**
   * The user-assigned label to be used as the name of the new volume.
   **/
  public VolumeCreationDescriptor label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned label to be used as the name of the new volume.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The controller reference value of the controller that will be assigned as the owner of the newly-created volume.
   **/
  public VolumeCreationDescriptor manager(String manager) {
    this.manager = manager;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller reference value of the controller that will be assigned as the owner of the newly-created volume.")
  @JsonProperty("manager")
  public String getManager() {
    return manager;
  }
  
  public void setManager(String manager) {
    this.manager = manager;
  }

  
  /**
   * The desired capacity of the new volume. Note that the controller may be forced to make the actual volume slightly larger than the requested size to account for arrangement of parity data, etc. If the resulting size is still smaller than the size of the volume candidate, then a new free extent will be created in addition to the new volume to account for the unused capacity.
   **/
  public VolumeCreationDescriptor capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The desired capacity of the new volume. Note that the controller may be forced to make the actual volume slightly larger than the requested size to account for arrangement of parity data, etc. If the resulting size is still smaller than the size of the volume candidate, then a new free extent will be created in addition to the new volume to account for the unused capacity.")
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }
  
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  
  /**
   * The desired segment size for the new volume in bytes. This must be one of the supported segment sizes, as specified in the FeatureParameters object returned by the controller. Alternatively, a value of zero can be specified to indicate that the controller should select a reasonable segment size based on the usage hint provided in the volume creation request.
   **/
  public VolumeCreationDescriptor segmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The desired segment size for the new volume in bytes. This must be one of the supported segment sizes, as specified in the FeatureParameters object returned by the controller. Alternatively, a value of zero can be specified to indicate that the controller should select a reasonable segment size based on the usage hint provided in the volume creation request.")
  @JsonProperty("segmentSize")
  public Integer getSegmentSize() {
    return segmentSize;
  }
  
  public void setSegmentSize(Integer segmentSize) {
    this.segmentSize = segmentSize;
  }

  
  /**
   * A true (non-zero) / false (zero) indicator of whether or not automatic cache read-ahead is enabled.
   **/
  public VolumeCreationDescriptor readAhead(Integer readAhead) {
    this.readAhead = readAhead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true (non-zero) / false (zero) indicator of whether or not automatic cache read-ahead is enabled.")
  @JsonProperty("readAhead")
  public Integer getReadAhead() {
    return readAhead;
  }
  
  public void setReadAhead(Integer readAhead) {
    this.readAhead = readAhead;
  }

  
  /**
   * A true value is an indication that the client wants the controller to initialize the new volume with all zeros. If this option is selected, the volume will be created and immediately transitioned to the formatting state. This operation can take an extended period of time to complete, and the volume will not be available during the process. A false value indicates that no zeroing is required; the volume will become available immediately, although a background initialization process will be running at the same time.
   **/
  public VolumeCreationDescriptor writeZeros(Boolean writeZeros) {
    this.writeZeros = writeZeros;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true value is an indication that the client wants the controller to initialize the new volume with all zeros. If this option is selected, the volume will be created and immediately transitioned to the formatting state. This operation can take an extended period of time to complete, and the volume will not be available during the process. A false value indicates that no zeroing is required; the volume will become available immediately, although a background initialization process will be running at the same time.")
  @JsonProperty("writeZeros")
  public Boolean getWriteZeros() {
    return writeZeros;
  }
  
  public void setWriteZeros(Boolean writeZeros) {
    this.writeZeros = writeZeros;
  }

  
  /**
   * A true value indicates that the volume should not have a LUN mapping automatically created for it. Rather, a subsequent Storage Partitions operation will be required to establish such a mapping and allow host I/O accesses to be conveyed to the new volume. A false value indicates that a default mapping should be created for the new volume.
   **/
  public VolumeCreationDescriptor noMapping(Boolean noMapping) {
    this.noMapping = noMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true value indicates that the volume should not have a LUN mapping automatically created for it. Rather, a subsequent Storage Partitions operation will be required to establish such a mapping and allow host I/O accesses to be conveyed to the new volume. A false value indicates that a default mapping should be created for the new volume.")
  @JsonProperty("noMapping")
  public Boolean getNoMapping() {
    return noMapping;
  }
  
  public void setNoMapping(Boolean noMapping) {
    this.noMapping = noMapping;
  }

  
  /**
   * The label to assign to the new volume group, if any. This field is only used when the candidate selection type is CANDIDATE_SEL_MANUAL or CANDIDATE_SEL_COUNT.
   **/
  public VolumeCreationDescriptor volumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The label to assign to the new volume group, if any. This field is only used when the candidate selection type is CANDIDATE_SEL_MANUAL or CANDIDATE_SEL_COUNT.")
  @JsonProperty("volumeGroupLabel")
  public String getVolumeGroupLabel() {
    return volumeGroupLabel;
  }
  
  public void setVolumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
  }

  
  /**
   * This field specifies which protection type should be used for the volume being created.
   **/
  public VolumeCreationDescriptor protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field specifies which protection type should be used for the volume being created.")
  @JsonProperty("protectionType")
  public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }
  
  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCreationDescriptor volumeCreationDescriptor = (VolumeCreationDescriptor) o;
    return Objects.equals(this.candidate, volumeCreationDescriptor.candidate) &&
        Objects.equals(this.label, volumeCreationDescriptor.label) &&
        Objects.equals(this.manager, volumeCreationDescriptor.manager) &&
        Objects.equals(this.capacity, volumeCreationDescriptor.capacity) &&
        Objects.equals(this.segmentSize, volumeCreationDescriptor.segmentSize) &&
        Objects.equals(this.readAhead, volumeCreationDescriptor.readAhead) &&
        Objects.equals(this.writeZeros, volumeCreationDescriptor.writeZeros) &&
        Objects.equals(this.noMapping, volumeCreationDescriptor.noMapping) &&
        Objects.equals(this.volumeGroupLabel, volumeCreationDescriptor.volumeGroupLabel) &&
        Objects.equals(this.protectionType, volumeCreationDescriptor.protectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidate, label, manager, capacity, segmentSize, readAhead, writeZeros, noMapping, volumeGroupLabel, protectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCreationDescriptor {\n");
    
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    segmentSize: ").append(toIndentedString(segmentSize)).append("\n");
    sb.append("    readAhead: ").append(toIndentedString(readAhead)).append("\n");
    sb.append("    writeZeros: ").append(toIndentedString(writeZeros)).append("\n");
    sb.append("    noMapping: ").append(toIndentedString(noMapping)).append("\n");
    sb.append("    volumeGroupLabel: ").append(toIndentedString(volumeGroupLabel)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
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

