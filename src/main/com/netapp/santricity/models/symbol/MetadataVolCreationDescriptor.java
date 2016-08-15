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
 * MetadataVolCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class MetadataVolCreationDescriptor   {
  

  /**
   * The metadata volume type to create.
   */
  public enum MetadataVolTypeEnum {
    allMdatTypes("allMdatTypes"),
    remoteMirror("remoteMirror"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MetadataVolTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MetadataVolTypeEnum metadataVolType;

    private String ctl0Label;

    private String ctl1Label;

    private VolumeCandidate candidate;

    private String volumeGroupLabel;


  /**
   * The protection type that should be used for the metadata volume being created
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
   * The metadata volume type to create.
   **/
  public MetadataVolCreationDescriptor metadataVolType(MetadataVolTypeEnum metadataVolType) {
    this.metadataVolType = metadataVolType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metadata volume type to create.")
  @JsonProperty("metadataVolType")
  public MetadataVolTypeEnum getMetadataVolType() {
    return metadataVolType;
  }
  
  public void setMetadataVolType(MetadataVolTypeEnum metadataVolType) {
    this.metadataVolType = metadataVolType;
  }

  
  /**
   * The user assigned label, as assigned by the firmware, for controller 0 volume.
   **/
  public MetadataVolCreationDescriptor ctl0Label(String ctl0Label) {
    this.ctl0Label = ctl0Label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned label, as assigned by the firmware, for controller 0 volume.")
  @JsonProperty("ctl0Label")
  public String getCtl0Label() {
    return ctl0Label;
  }
  
  public void setCtl0Label(String ctl0Label) {
    this.ctl0Label = ctl0Label;
  }

  
  /**
   * The user assigned label, as assigned by the firmware, for controller 1 volume.
   **/
  public MetadataVolCreationDescriptor ctl1Label(String ctl1Label) {
    this.ctl1Label = ctl1Label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned label, as assigned by the firmware, for controller 1 volume.")
  @JsonProperty("ctl1Label")
  public String getCtl1Label() {
    return ctl1Label;
  }
  
  public void setCtl1Label(String ctl1Label) {
    this.ctl1Label = ctl1Label;
  }

  
  /**
   * The volume candidate for the repository.
   **/
  public MetadataVolCreationDescriptor candidate(VolumeCandidate candidate) {
    this.candidate = candidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume candidate for the repository.")
  @JsonProperty("candidate")
  public VolumeCandidate getCandidate() {
    return candidate;
  }
  
  public void setCandidate(VolumeCandidate candidate) {
    this.candidate = candidate;
  }

  
  /**
   * The label to assign to the new volume group for the repository, if any. This field is only used when the repository candidate selection type is CANDIDATE_SEL_MANUAL or CANDIDATE_SEL_COUNT.
   **/
  public MetadataVolCreationDescriptor volumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The label to assign to the new volume group for the repository, if any. This field is only used when the repository candidate selection type is CANDIDATE_SEL_MANUAL or CANDIDATE_SEL_COUNT.")
  @JsonProperty("volumeGroupLabel")
  public String getVolumeGroupLabel() {
    return volumeGroupLabel;
  }
  
  public void setVolumeGroupLabel(String volumeGroupLabel) {
    this.volumeGroupLabel = volumeGroupLabel;
  }

  
  /**
   * The protection type that should be used for the metadata volume being created
   **/
  public MetadataVolCreationDescriptor protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The protection type that should be used for the metadata volume being created")
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
    MetadataVolCreationDescriptor metadataVolCreationDescriptor = (MetadataVolCreationDescriptor) o;
    return Objects.equals(this.metadataVolType, metadataVolCreationDescriptor.metadataVolType) &&
        Objects.equals(this.ctl0Label, metadataVolCreationDescriptor.ctl0Label) &&
        Objects.equals(this.ctl1Label, metadataVolCreationDescriptor.ctl1Label) &&
        Objects.equals(this.candidate, metadataVolCreationDescriptor.candidate) &&
        Objects.equals(this.volumeGroupLabel, metadataVolCreationDescriptor.volumeGroupLabel) &&
        Objects.equals(this.protectionType, metadataVolCreationDescriptor.protectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataVolType, ctl0Label, ctl1Label, candidate, volumeGroupLabel, protectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataVolCreationDescriptor {\n");
    
    sb.append("    metadataVolType: ").append(toIndentedString(metadataVolType)).append("\n");
    sb.append("    ctl0Label: ").append(toIndentedString(ctl0Label)).append("\n");
    sb.append("    ctl1Label: ").append(toIndentedString(ctl1Label)).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
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

