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


package com.netapp.santricity.models.v2;

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
 * AmgIncompleteMember
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AmgIncompleteMember   {
  
    private String memberRef;

    private String groupRef;

    private String primaryVolWWN;

    private Long primaryVolCapacity;


  /**
   * RAID level of the primary volume.
   */
  public enum PrimaryVolRAIDLevelEnum {
    raidUnsupported("raidUnsupported"),
    raidAll("raidAll"),
    raid0("raid0"),
    raid1("raid1"),
    raid3("raid3"),
    raid5("raid5"),
    raid6("raid6"),
    raidDiskPool("raidDiskPool"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PrimaryVolRAIDLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PrimaryVolRAIDLevelEnum primaryVolRAIDLevel;


  /**
   * The protection type of the primary volume.
   */
  public enum PrimaryVolProtectionTypeEnum {
    type0Protection("type0Protection"),
    type1Protection("type1Protection"),
    type2Protection("type2Protection"),
    type3Protection("type3Protection"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PrimaryVolProtectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PrimaryVolProtectionTypeEnum primaryVolProtectionType;


  /**
   * Security type of the primary volume.
   */
  public enum PrimaryVolSecurityTypeEnum {
    unknown("unknown"),
    none("none"),
    capable("capable"),
    enabled("enabled"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PrimaryVolSecurityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PrimaryVolSecurityTypeEnum primaryVolSecurityType;

    private String primaryVolUserLabel;

    private Boolean orphanIncompleteMember;

    private VolumeTypeParameters primaryVolumeParameters;


  /**
   * Refines the information in the securityType field to describe the set of drives.
   */
  public enum PrimaryVolSecurityLevelEnum {
    unknown("unknown"),
    none("none"),
    mixed("mixed"),
    fde("fde"),
    fips("fips"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PrimaryVolSecurityLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PrimaryVolSecurityLevelEnum primaryVolSecurityLevel;

    private String remoteTargetWwn;

    private String remoteTargetName;

    private String remoteTargetId;

    private String id;

  
  /**
   * The reference (key) for the group member.
   **/
  public AmgIncompleteMember memberRef(String memberRef) {
    this.memberRef = memberRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for the group member.")
  @JsonProperty("memberRef")
  public String getMemberRef() {
    return memberRef;
  }
  
  public void setMemberRef(String memberRef) {
    this.memberRef = memberRef;
  }

  
  /**
   * The associated Async Mirror Group.
   **/
  public AmgIncompleteMember groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The associated Async Mirror Group.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * The WWN of the primary volume on the remote array.
   **/
  public AmgIncompleteMember primaryVolWWN(String primaryVolWWN) {
    this.primaryVolWWN = primaryVolWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the primary volume on the remote array.")
  @JsonProperty("primaryVolWWN")
  public String getPrimaryVolWWN() {
    return primaryVolWWN;
  }
  
  public void setPrimaryVolWWN(String primaryVolWWN) {
    this.primaryVolWWN = primaryVolWWN;
  }

  
  /**
   * Capacity of the primary (used to aid in selection of mirror secondary volume).
   **/
  public AmgIncompleteMember primaryVolCapacity(Long primaryVolCapacity) {
    this.primaryVolCapacity = primaryVolCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Capacity of the primary (used to aid in selection of mirror secondary volume).")
  @JsonProperty("primaryVolCapacity")
  public Long getPrimaryVolCapacity() {
    return primaryVolCapacity;
  }
  
  public void setPrimaryVolCapacity(Long primaryVolCapacity) {
    this.primaryVolCapacity = primaryVolCapacity;
  }

  
  /**
   * RAID level of the primary volume.
   **/
  public AmgIncompleteMember primaryVolRAIDLevel(PrimaryVolRAIDLevelEnum primaryVolRAIDLevel) {
    this.primaryVolRAIDLevel = primaryVolRAIDLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "RAID level of the primary volume.")
  @JsonProperty("primaryVolRAIDLevel")
  public PrimaryVolRAIDLevelEnum getPrimaryVolRAIDLevel() {
    return primaryVolRAIDLevel;
  }
  
  public void setPrimaryVolRAIDLevel(PrimaryVolRAIDLevelEnum primaryVolRAIDLevel) {
    this.primaryVolRAIDLevel = primaryVolRAIDLevel;
  }

  
  /**
   * The protection type of the primary volume.
   **/
  public AmgIncompleteMember primaryVolProtectionType(PrimaryVolProtectionTypeEnum primaryVolProtectionType) {
    this.primaryVolProtectionType = primaryVolProtectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The protection type of the primary volume.")
  @JsonProperty("primaryVolProtectionType")
  public PrimaryVolProtectionTypeEnum getPrimaryVolProtectionType() {
    return primaryVolProtectionType;
  }
  
  public void setPrimaryVolProtectionType(PrimaryVolProtectionTypeEnum primaryVolProtectionType) {
    this.primaryVolProtectionType = primaryVolProtectionType;
  }

  
  /**
   * Security type of the primary volume.
   **/
  public AmgIncompleteMember primaryVolSecurityType(PrimaryVolSecurityTypeEnum primaryVolSecurityType) {
    this.primaryVolSecurityType = primaryVolSecurityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Security type of the primary volume.")
  @JsonProperty("primaryVolSecurityType")
  public PrimaryVolSecurityTypeEnum getPrimaryVolSecurityType() {
    return primaryVolSecurityType;
  }
  
  public void setPrimaryVolSecurityType(PrimaryVolSecurityTypeEnum primaryVolSecurityType) {
    this.primaryVolSecurityType = primaryVolSecurityType;
  }

  
  /**
   * User label of the primary volume.
   **/
  public AmgIncompleteMember primaryVolUserLabel(String primaryVolUserLabel) {
    this.primaryVolUserLabel = primaryVolUserLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User label of the primary volume.")
  @JsonProperty("primaryVolUserLabel")
  public String getPrimaryVolUserLabel() {
    return primaryVolUserLabel;
  }
  
  public void setPrimaryVolUserLabel(String primaryVolUserLabel) {
    this.primaryVolUserLabel = primaryVolUserLabel;
  }

  
  /**
   * If true, the incomplete member is an orphan.
   **/
  public AmgIncompleteMember orphanIncompleteMember(Boolean orphanIncompleteMember) {
    this.orphanIncompleteMember = orphanIncompleteMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the incomplete member is an orphan.")
  @JsonProperty("orphanIncompleteMember")
  public Boolean getOrphanIncompleteMember() {
    return orphanIncompleteMember;
  }
  
  public void setOrphanIncompleteMember(Boolean orphanIncompleteMember) {
    this.orphanIncompleteMember = orphanIncompleteMember;
  }

  
  /**
   * The capacity provisioning parameters for the primary volume.
   **/
  public AmgIncompleteMember primaryVolumeParameters(VolumeTypeParameters primaryVolumeParameters) {
    this.primaryVolumeParameters = primaryVolumeParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity provisioning parameters for the primary volume.")
  @JsonProperty("primaryVolumeParameters")
  public VolumeTypeParameters getPrimaryVolumeParameters() {
    return primaryVolumeParameters;
  }
  
  public void setPrimaryVolumeParameters(VolumeTypeParameters primaryVolumeParameters) {
    this.primaryVolumeParameters = primaryVolumeParameters;
  }

  
  /**
   * Refines the information in the securityType field to describe the set of drives.
   **/
  public AmgIncompleteMember primaryVolSecurityLevel(PrimaryVolSecurityLevelEnum primaryVolSecurityLevel) {
    this.primaryVolSecurityLevel = primaryVolSecurityLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Refines the information in the securityType field to describe the set of drives.")
  @JsonProperty("primaryVolSecurityLevel")
  public PrimaryVolSecurityLevelEnum getPrimaryVolSecurityLevel() {
    return primaryVolSecurityLevel;
  }
  
  public void setPrimaryVolSecurityLevel(PrimaryVolSecurityLevelEnum primaryVolSecurityLevel) {
    this.primaryVolSecurityLevel = primaryVolSecurityLevel;
  }

  
  /**
   * The WWN of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created.
   **/
  public AmgIncompleteMember remoteTargetWwn(String remoteTargetWwn) {
    this.remoteTargetWwn = remoteTargetWwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The WWN of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created.")
  @JsonProperty("remoteTargetWwn")
  public String getRemoteTargetWwn() {
    return remoteTargetWwn;
  }
  
  public void setRemoteTargetWwn(String remoteTargetWwn) {
    this.remoteTargetWwn = remoteTargetWwn;
  }

  
  /**
   * The user label of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created, and will not be available in embedded mode.
   **/
  public AmgIncompleteMember remoteTargetName(String remoteTargetName) {
    this.remoteTargetName = remoteTargetName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user label of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created, and will not be available in embedded mode.")
  @JsonProperty("remoteTargetName")
  public String getRemoteTargetName() {
    return remoteTargetName;
  }
  
  public void setRemoteTargetName(String remoteTargetName) {
    this.remoteTargetName = remoteTargetName;
  }

  
  /**
   * The id of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created, and will not be available in embedded mode.
   **/
  public AmgIncompleteMember remoteTargetId(String remoteTargetId) {
    this.remoteTargetId = remoteTargetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the target array in the mirroring relationship. This field may not be immediately available after an AMG is created, and will not be available in embedded mode.")
  @JsonProperty("remoteTargetId")
  public String getRemoteTargetId() {
    return remoteTargetId;
  }
  
  public void setRemoteTargetId(String remoteTargetId) {
    this.remoteTargetId = remoteTargetId;
  }

  
  /**
   **/
  public AmgIncompleteMember id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmgIncompleteMember amgIncompleteMember = (AmgIncompleteMember) o;
    return Objects.equals(this.memberRef, amgIncompleteMember.memberRef) &&
        Objects.equals(this.groupRef, amgIncompleteMember.groupRef) &&
        Objects.equals(this.primaryVolWWN, amgIncompleteMember.primaryVolWWN) &&
        Objects.equals(this.primaryVolCapacity, amgIncompleteMember.primaryVolCapacity) &&
        Objects.equals(this.primaryVolRAIDLevel, amgIncompleteMember.primaryVolRAIDLevel) &&
        Objects.equals(this.primaryVolProtectionType, amgIncompleteMember.primaryVolProtectionType) &&
        Objects.equals(this.primaryVolSecurityType, amgIncompleteMember.primaryVolSecurityType) &&
        Objects.equals(this.primaryVolUserLabel, amgIncompleteMember.primaryVolUserLabel) &&
        Objects.equals(this.orphanIncompleteMember, amgIncompleteMember.orphanIncompleteMember) &&
        Objects.equals(this.primaryVolumeParameters, amgIncompleteMember.primaryVolumeParameters) &&
        Objects.equals(this.primaryVolSecurityLevel, amgIncompleteMember.primaryVolSecurityLevel) &&
        Objects.equals(this.remoteTargetWwn, amgIncompleteMember.remoteTargetWwn) &&
        Objects.equals(this.remoteTargetName, amgIncompleteMember.remoteTargetName) &&
        Objects.equals(this.remoteTargetId, amgIncompleteMember.remoteTargetId) &&
        Objects.equals(this.id, amgIncompleteMember.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberRef, groupRef, primaryVolWWN, primaryVolCapacity, primaryVolRAIDLevel, primaryVolProtectionType, primaryVolSecurityType, primaryVolUserLabel, orphanIncompleteMember, primaryVolumeParameters, primaryVolSecurityLevel, remoteTargetWwn, remoteTargetName, remoteTargetId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmgIncompleteMember {\n");
    
    sb.append("    memberRef: ").append(toIndentedString(memberRef)).append("\n");
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    primaryVolWWN: ").append(toIndentedString(primaryVolWWN)).append("\n");
    sb.append("    primaryVolCapacity: ").append(toIndentedString(primaryVolCapacity)).append("\n");
    sb.append("    primaryVolRAIDLevel: ").append(toIndentedString(primaryVolRAIDLevel)).append("\n");
    sb.append("    primaryVolProtectionType: ").append(toIndentedString(primaryVolProtectionType)).append("\n");
    sb.append("    primaryVolSecurityType: ").append(toIndentedString(primaryVolSecurityType)).append("\n");
    sb.append("    primaryVolUserLabel: ").append(toIndentedString(primaryVolUserLabel)).append("\n");
    sb.append("    orphanIncompleteMember: ").append(toIndentedString(orphanIncompleteMember)).append("\n");
    sb.append("    primaryVolumeParameters: ").append(toIndentedString(primaryVolumeParameters)).append("\n");
    sb.append("    primaryVolSecurityLevel: ").append(toIndentedString(primaryVolSecurityLevel)).append("\n");
    sb.append("    remoteTargetWwn: ").append(toIndentedString(remoteTargetWwn)).append("\n");
    sb.append("    remoteTargetName: ").append(toIndentedString(remoteTargetName)).append("\n");
    sb.append("    remoteTargetId: ").append(toIndentedString(remoteTargetId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

