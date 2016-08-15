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
 * MirrorVolumeCandidate
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class MirrorVolumeCandidate   {
  
    private String remoteVolWWN;

    private String remoteVolLabel;

    private Long capacity;


  /**
   * The RAID level of the remote volume.
   */
  public enum RaidLevelEnum {
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

    RaidLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RaidLevelEnum raidLevel;


  /**
   * The protection type of the mirror volume candidate.
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
   * The WWN of the remote volume.
   **/
  public MirrorVolumeCandidate remoteVolWWN(String remoteVolWWN) {
    this.remoteVolWWN = remoteVolWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WWN of the remote volume.")
  @JsonProperty("remoteVolWWN")
  public String getRemoteVolWWN() {
    return remoteVolWWN;
  }
  
  public void setRemoteVolWWN(String remoteVolWWN) {
    this.remoteVolWWN = remoteVolWWN;
  }

  
  /**
   * The user assigned label of the remote volume.
   **/
  public MirrorVolumeCandidate remoteVolLabel(String remoteVolLabel) {
    this.remoteVolLabel = remoteVolLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user assigned label of the remote volume.")
  @JsonProperty("remoteVolLabel")
  public String getRemoteVolLabel() {
    return remoteVolLabel;
  }
  
  public void setRemoteVolLabel(String remoteVolLabel) {
    this.remoteVolLabel = remoteVolLabel;
  }

  
  /**
   * The capacity of the remote volume.
   **/
  public MirrorVolumeCandidate capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity of the remote volume.")
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }
  
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  
  /**
   * The RAID level of the remote volume.
   **/
  public MirrorVolumeCandidate raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The RAID level of the remote volume.")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * The protection type of the mirror volume candidate.
   **/
  public MirrorVolumeCandidate protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The protection type of the mirror volume candidate.")
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
    MirrorVolumeCandidate mirrorVolumeCandidate = (MirrorVolumeCandidate) o;
    return Objects.equals(this.remoteVolWWN, mirrorVolumeCandidate.remoteVolWWN) &&
        Objects.equals(this.remoteVolLabel, mirrorVolumeCandidate.remoteVolLabel) &&
        Objects.equals(this.capacity, mirrorVolumeCandidate.capacity) &&
        Objects.equals(this.raidLevel, mirrorVolumeCandidate.raidLevel) &&
        Objects.equals(this.protectionType, mirrorVolumeCandidate.protectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteVolWWN, remoteVolLabel, capacity, raidLevel, protectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MirrorVolumeCandidate {\n");
    
    sb.append("    remoteVolWWN: ").append(toIndentedString(remoteVolWWN)).append("\n");
    sb.append("    remoteVolLabel: ").append(toIndentedString(remoteVolLabel)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
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

