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
 * CVCandidateResponse
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class CVCandidateResponse   {
  
    private Boolean raidLevelMatch;

    private Boolean samePool;

    private ConcatVolumeCandidate candidate;

    private String volumeGroupId;

    private Boolean capacityMatch;

    private Boolean qosMatch;

    private Boolean diskPool;

    private Long capacity;

    private String baseMappableObjectId;


  /**
   * Gets or Sets candidateType
   */
  public enum CandidateTypeEnum {
    unknown("unknown"),
    newVol("newVol"),
    existingVols("existingVols"),
    expansion("expansion"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CandidateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CandidateTypeEnum candidateType;

    private Boolean securityMatch;

    private Boolean daMatch;

    private Boolean driveTypeMatch;

    private Boolean existingCandidate;

  
  /**
   **/
  public CVCandidateResponse raidLevelMatch(Boolean raidLevelMatch) {
    this.raidLevelMatch = raidLevelMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("raidLevelMatch")
  public Boolean getRaidLevelMatch() {
    return raidLevelMatch;
  }
  
  public void setRaidLevelMatch(Boolean raidLevelMatch) {
    this.raidLevelMatch = raidLevelMatch;
  }

  
  /**
   **/
  public CVCandidateResponse samePool(Boolean samePool) {
    this.samePool = samePool;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("samePool")
  public Boolean getSamePool() {
    return samePool;
  }
  
  public void setSamePool(Boolean samePool) {
    this.samePool = samePool;
  }

  
  /**
   **/
  public CVCandidateResponse candidate(ConcatVolumeCandidate candidate) {
    this.candidate = candidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("candidate")
  public ConcatVolumeCandidate getCandidate() {
    return candidate;
  }
  
  public void setCandidate(ConcatVolumeCandidate candidate) {
    this.candidate = candidate;
  }

  
  /**
   **/
  public CVCandidateResponse volumeGroupId(String volumeGroupId) {
    this.volumeGroupId = volumeGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumeGroupId")
  public String getVolumeGroupId() {
    return volumeGroupId;
  }
  
  public void setVolumeGroupId(String volumeGroupId) {
    this.volumeGroupId = volumeGroupId;
  }

  
  /**
   **/
  public CVCandidateResponse capacityMatch(Boolean capacityMatch) {
    this.capacityMatch = capacityMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("capacityMatch")
  public Boolean getCapacityMatch() {
    return capacityMatch;
  }
  
  public void setCapacityMatch(Boolean capacityMatch) {
    this.capacityMatch = capacityMatch;
  }

  
  /**
   **/
  public CVCandidateResponse qosMatch(Boolean qosMatch) {
    this.qosMatch = qosMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("qosMatch")
  public Boolean getQosMatch() {
    return qosMatch;
  }
  
  public void setQosMatch(Boolean qosMatch) {
    this.qosMatch = qosMatch;
  }

  
  /**
   **/
  public CVCandidateResponse diskPool(Boolean diskPool) {
    this.diskPool = diskPool;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("diskPool")
  public Boolean getDiskPool() {
    return diskPool;
  }
  
  public void setDiskPool(Boolean diskPool) {
    this.diskPool = diskPool;
  }

  
  /**
   **/
  public CVCandidateResponse capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }
  
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  
  /**
   **/
  public CVCandidateResponse baseMappableObjectId(String baseMappableObjectId) {
    this.baseMappableObjectId = baseMappableObjectId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("baseMappableObjectId")
  public String getBaseMappableObjectId() {
    return baseMappableObjectId;
  }
  
  public void setBaseMappableObjectId(String baseMappableObjectId) {
    this.baseMappableObjectId = baseMappableObjectId;
  }

  
  /**
   **/
  public CVCandidateResponse candidateType(CandidateTypeEnum candidateType) {
    this.candidateType = candidateType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("candidateType")
  public CandidateTypeEnum getCandidateType() {
    return candidateType;
  }
  
  public void setCandidateType(CandidateTypeEnum candidateType) {
    this.candidateType = candidateType;
  }

  
  /**
   * True if the drive security settings for the base pool and the candidate's pool match.
   **/
  public CVCandidateResponse securityMatch(Boolean securityMatch) {
    this.securityMatch = securityMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the drive security settings for the base pool and the candidate's pool match.")
  @JsonProperty("securityMatch")
  public Boolean getSecurityMatch() {
    return securityMatch;
  }
  
  public void setSecurityMatch(Boolean securityMatch) {
    this.securityMatch = securityMatch;
  }

  
  /**
   * True if the DataAssurance settings for the base and the candidate match.
   **/
  public CVCandidateResponse daMatch(Boolean daMatch) {
    this.daMatch = daMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the DataAssurance settings for the base and the candidate match.")
  @JsonProperty("daMatch")
  public Boolean getDaMatch() {
    return daMatch;
  }
  
  public void setDaMatch(Boolean daMatch) {
    this.daMatch = daMatch;
  }

  
  /**
   * True if the drives for the base pool and the candidate's pool match.
   **/
  public CVCandidateResponse driveTypeMatch(Boolean driveTypeMatch) {
    this.driveTypeMatch = driveTypeMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the drives for the base pool and the candidate's pool match.")
  @JsonProperty("driveTypeMatch")
  public Boolean getDriveTypeMatch() {
    return driveTypeMatch;
  }
  
  public void setDriveTypeMatch(Boolean driveTypeMatch) {
    this.driveTypeMatch = driveTypeMatch;
  }

  
  /**
   * True if the repository candidate is based on an existing volume and does not require a volume creation to occur.
   **/
  public CVCandidateResponse existingCandidate(Boolean existingCandidate) {
    this.existingCandidate = existingCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the repository candidate is based on an existing volume and does not require a volume creation to occur.")
  @JsonProperty("existingCandidate")
  public Boolean getExistingCandidate() {
    return existingCandidate;
  }
  
  public void setExistingCandidate(Boolean existingCandidate) {
    this.existingCandidate = existingCandidate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CVCandidateResponse cVCandidateResponse = (CVCandidateResponse) o;
    return Objects.equals(this.raidLevelMatch, cVCandidateResponse.raidLevelMatch) &&
        Objects.equals(this.samePool, cVCandidateResponse.samePool) &&
        Objects.equals(this.candidate, cVCandidateResponse.candidate) &&
        Objects.equals(this.volumeGroupId, cVCandidateResponse.volumeGroupId) &&
        Objects.equals(this.capacityMatch, cVCandidateResponse.capacityMatch) &&
        Objects.equals(this.qosMatch, cVCandidateResponse.qosMatch) &&
        Objects.equals(this.diskPool, cVCandidateResponse.diskPool) &&
        Objects.equals(this.capacity, cVCandidateResponse.capacity) &&
        Objects.equals(this.baseMappableObjectId, cVCandidateResponse.baseMappableObjectId) &&
        Objects.equals(this.candidateType, cVCandidateResponse.candidateType) &&
        Objects.equals(this.securityMatch, cVCandidateResponse.securityMatch) &&
        Objects.equals(this.daMatch, cVCandidateResponse.daMatch) &&
        Objects.equals(this.driveTypeMatch, cVCandidateResponse.driveTypeMatch) &&
        Objects.equals(this.existingCandidate, cVCandidateResponse.existingCandidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raidLevelMatch, samePool, candidate, volumeGroupId, capacityMatch, qosMatch, diskPool, capacity, baseMappableObjectId, candidateType, securityMatch, daMatch, driveTypeMatch, existingCandidate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CVCandidateResponse {\n");
    
    sb.append("    raidLevelMatch: ").append(toIndentedString(raidLevelMatch)).append("\n");
    sb.append("    samePool: ").append(toIndentedString(samePool)).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
    sb.append("    volumeGroupId: ").append(toIndentedString(volumeGroupId)).append("\n");
    sb.append("    capacityMatch: ").append(toIndentedString(capacityMatch)).append("\n");
    sb.append("    qosMatch: ").append(toIndentedString(qosMatch)).append("\n");
    sb.append("    diskPool: ").append(toIndentedString(diskPool)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    baseMappableObjectId: ").append(toIndentedString(baseMappableObjectId)).append("\n");
    sb.append("    candidateType: ").append(toIndentedString(candidateType)).append("\n");
    sb.append("    securityMatch: ").append(toIndentedString(securityMatch)).append("\n");
    sb.append("    daMatch: ").append(toIndentedString(daMatch)).append("\n");
    sb.append("    driveTypeMatch: ").append(toIndentedString(driveTypeMatch)).append("\n");
    sb.append("    existingCandidate: ").append(toIndentedString(existingCandidate)).append("\n");
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

