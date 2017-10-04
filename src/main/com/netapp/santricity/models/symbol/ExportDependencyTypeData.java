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
 * ExportDependencyTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ExportDependencyTypeData   {
  

  /**
   * This enumeration specifies the types of dependencies that may be identified for a volume belonging to a group that is a candidate to be exported.
   */
  public enum TypeEnum {
    snapshot("snapshot"),
    volumeCopy("volumeCopy"),
    metadata("metadata"),
    mirrorPair("mirrorPair"),
    hostMapping("hostMapping"),
    persistentReservation("persistentReservation"),
    raid6Support("raid6Support"),
    asyncMirrorGroupMember("asyncMirrorGroupMember"),
    concatMember("concatMember"),
    pitGroup("pitGroup"),
    pitView("pitView"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TypeEnum type;

    private String metadataRef;

    private String mirrorRef;

    private String snapshotRef;

    private String volcopyRef;

    private String amgMember;

    private String concatVol;

    private String pitGroup;

    private String pitView;

  
  /**
   * This enumeration specifies the types of dependencies that may be identified for a volume belonging to a group that is a candidate to be exported.
   **/
  public ExportDependencyTypeData type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration specifies the types of dependencies that may be identified for a volume belonging to a group that is a candidate to be exported.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The identification of a metadata volume that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_METADATA.
   **/
  public ExportDependencyTypeData metadataRef(String metadataRef) {
    this.metadataRef = metadataRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identification of a metadata volume that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_METADATA.")
  @JsonProperty("metadataRef")
  public String getMetadataRef() {
    return metadataRef;
  }
  
  public void setMetadataRef(String metadataRef) {
    this.metadataRef = metadataRef;
  }

  
  /**
   * The identification of the mirror pair that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_MIRROR_PAIR.
   **/
  public ExportDependencyTypeData mirrorRef(String mirrorRef) {
    this.mirrorRef = mirrorRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identification of the mirror pair that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_MIRROR_PAIR.")
  @JsonProperty("mirrorRef")
  public String getMirrorRef() {
    return mirrorRef;
  }
  
  public void setMirrorRef(String mirrorRef) {
    this.mirrorRef = mirrorRef;
  }

  
  /**
   * The identification of a snapshot volume that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_SNAPSHOT.
   **/
  public ExportDependencyTypeData snapshotRef(String snapshotRef) {
    this.snapshotRef = snapshotRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identification of a snapshot volume that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_SNAPSHOT.")
  @JsonProperty("snapshotRef")
  public String getSnapshotRef() {
    return snapshotRef;
  }
  
  public void setSnapshotRef(String snapshotRef) {
    this.snapshotRef = snapshotRef;
  }

  
  /**
   * The identification of a volume copy relationship that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_VOLUME_COPY.
   **/
  public ExportDependencyTypeData volcopyRef(String volcopyRef) {
    this.volcopyRef = volcopyRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identification of a volume copy relationship that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_VOLUME_COPY.")
  @JsonProperty("volcopyRef")
  public String getVolcopyRef() {
    return volcopyRef;
  }
  
  public void setVolcopyRef(String volcopyRef) {
    this.volcopyRef = volcopyRef;
  }

  
  /**
   * The identification of an Async Mirror Group member that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_ASYNC_MIRROR_GROUP_MEMBER.
   **/
  public ExportDependencyTypeData amgMember(String amgMember) {
    this.amgMember = amgMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identification of an Async Mirror Group member that is associated with the dependent volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_ASYNC_MIRROR_GROUP_MEMBER.")
  @JsonProperty("amgMember")
  public String getAmgMember() {
    return amgMember;
  }
  
  public void setAmgMember(String amgMember) {
    this.amgMember = amgMember;
  }

  
  /**
   * This field contains an identification of the Concat Volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_CONCAT_MEMBER.
   **/
  public ExportDependencyTypeData concatVol(String concatVol) {
    this.concatVol = concatVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains an identification of the Concat Volume. This field is only present if the type field is set to EXPORT_DEPENDENCY_CONCAT_MEMBER.")
  @JsonProperty("concatVol")
  public String getConcatVol() {
    return concatVol;
  }
  
  public void setConcatVol(String concatVol) {
    this.concatVol = concatVol;
  }

  
  /**
   * This field contains an identification of the PiT Group. This field is only present if the type field is set to EXPORT_DEPENDENCY_PIT_GROUP.
   **/
  public ExportDependencyTypeData pitGroup(String pitGroup) {
    this.pitGroup = pitGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains an identification of the PiT Group. This field is only present if the type field is set to EXPORT_DEPENDENCY_PIT_GROUP.")
  @JsonProperty("pitGroup")
  public String getPitGroup() {
    return pitGroup;
  }
  
  public void setPitGroup(String pitGroup) {
    this.pitGroup = pitGroup;
  }

  
  /**
   * This field contains an identification of the PiT View. This field is only present if the type field is set to EXPORT_DEPENDENCY_PIT_VIEW.
   **/
  public ExportDependencyTypeData pitView(String pitView) {
    this.pitView = pitView;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains an identification of the PiT View. This field is only present if the type field is set to EXPORT_DEPENDENCY_PIT_VIEW.")
  @JsonProperty("pitView")
  public String getPitView() {
    return pitView;
  }
  
  public void setPitView(String pitView) {
    this.pitView = pitView;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportDependencyTypeData exportDependencyTypeData = (ExportDependencyTypeData) o;
    return Objects.equals(this.type, exportDependencyTypeData.type) &&
        Objects.equals(this.metadataRef, exportDependencyTypeData.metadataRef) &&
        Objects.equals(this.mirrorRef, exportDependencyTypeData.mirrorRef) &&
        Objects.equals(this.snapshotRef, exportDependencyTypeData.snapshotRef) &&
        Objects.equals(this.volcopyRef, exportDependencyTypeData.volcopyRef) &&
        Objects.equals(this.amgMember, exportDependencyTypeData.amgMember) &&
        Objects.equals(this.concatVol, exportDependencyTypeData.concatVol) &&
        Objects.equals(this.pitGroup, exportDependencyTypeData.pitGroup) &&
        Objects.equals(this.pitView, exportDependencyTypeData.pitView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, metadataRef, mirrorRef, snapshotRef, volcopyRef, amgMember, concatVol, pitGroup, pitView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportDependencyTypeData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadataRef: ").append(toIndentedString(metadataRef)).append("\n");
    sb.append("    mirrorRef: ").append(toIndentedString(mirrorRef)).append("\n");
    sb.append("    snapshotRef: ").append(toIndentedString(snapshotRef)).append("\n");
    sb.append("    volcopyRef: ").append(toIndentedString(volcopyRef)).append("\n");
    sb.append("    amgMember: ").append(toIndentedString(amgMember)).append("\n");
    sb.append("    concatVol: ").append(toIndentedString(concatVol)).append("\n");
    sb.append("    pitGroup: ").append(toIndentedString(pitGroup)).append("\n");
    sb.append("    pitView: ").append(toIndentedString(pitView)).append("\n");
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

