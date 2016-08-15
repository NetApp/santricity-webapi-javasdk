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
 * PIT
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PIT   {
  
    private String pitRef;

    private String pitGroupRef;


  /**
   * The PiT creation method.
   */
  public enum CreationMethodEnum {
    unknown("unknown"),
    user("user"),
    schedule("schedule"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CreationMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CreationMethodEnum creationMethod;

    private Long pitTimestamp;

    private Long pitSequenceNumber;


  /**
   * The state of this PiT.
   */
  public enum StatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    failed("failed"),
    purged("purged"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;

    private Boolean activeCOW;

    private Boolean isRollbackSource;

    private Long pitCapacity;

    private Long repositoryCapacityUtilization;

    private String id;

  
  /**
   * The reference (key) for this PiT.
   **/
  public PIT pitRef(String pitRef) {
    this.pitRef = pitRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for this PiT.")
  @JsonProperty("pitRef")
  public String getPitRef() {
    return pitRef;
  }
  
  public void setPitRef(String pitRef) {
    this.pitRef = pitRef;
  }

  
  /**
   * A reference to the associated PiT Group.
   **/
  public PIT pitGroupRef(String pitGroupRef) {
    this.pitGroupRef = pitGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the associated PiT Group.")
  @JsonProperty("pitGroupRef")
  public String getPitGroupRef() {
    return pitGroupRef;
  }
  
  public void setPitGroupRef(String pitGroupRef) {
    this.pitGroupRef = pitGroupRef;
  }

  
  /**
   * The PiT creation method.
   **/
  public PIT creationMethod(CreationMethodEnum creationMethod) {
    this.creationMethod = creationMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The PiT creation method.")
  @JsonProperty("creationMethod")
  public CreationMethodEnum getCreationMethod() {
    return creationMethod;
  }
  
  public void setCreationMethod(CreationMethodEnum creationMethod) {
    this.creationMethod = creationMethod;
  }

  
  /**
   * The controller-time (measured in seconds since January 1, 1970) when the PiT was created.
   **/
  public PIT pitTimestamp(Long pitTimestamp) {
    this.pitTimestamp = pitTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller-time (measured in seconds since January 1, 1970) when the PiT was created.")
  @JsonProperty("pitTimestamp")
  public Long getPitTimestamp() {
    return pitTimestamp;
  }
  
  public void setPitTimestamp(Long pitTimestamp) {
    this.pitTimestamp = pitTimestamp;
  }

  
  /**
   * The sequence number within PITGroup. This is a monotonically increasing sequence value that can be used to determine the absolute order of the PiTs within a PiT group. Using this sequence number avoids issues with timestamps when real-time clocks are changed. Note that this sequence number will be the same on all PiTs taken in multiple PITGroups at the same time under a single IO suspension, either as part of a consistency group operation (createCGPIT) or when a list of PITGroups is passed to createPIT.
   **/
  public PIT pitSequenceNumber(Long pitSequenceNumber) {
    this.pitSequenceNumber = pitSequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sequence number within PITGroup. This is a monotonically increasing sequence value that can be used to determine the absolute order of the PiTs within a PiT group. Using this sequence number avoids issues with timestamps when real-time clocks are changed. Note that this sequence number will be the same on all PiTs taken in multiple PITGroups at the same time under a single IO suspension, either as part of a consistency group operation (createCGPIT) or when a list of PITGroups is passed to createPIT.")
  @JsonProperty("pitSequenceNumber")
  public Long getPitSequenceNumber() {
    return pitSequenceNumber;
  }
  
  public void setPitSequenceNumber(Long pitSequenceNumber) {
    this.pitSequenceNumber = pitSequenceNumber;
  }

  
  /**
   * The state of this PiT.
   **/
  public PIT status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of this PiT.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * If true, the PiT is actively recording copy-on-write data.
   **/
  public PIT activeCOW(Boolean activeCOW) {
    this.activeCOW = activeCOW;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the PiT is actively recording copy-on-write data.")
  @JsonProperty("activeCOW")
  public Boolean getActiveCOW() {
    return activeCOW;
  }
  
  public void setActiveCOW(Boolean activeCOW) {
    this.activeCOW = activeCOW;
  }

  
  /**
   * If true, the PiT is a rollback source.
   **/
  public PIT isRollbackSource(Boolean isRollbackSource) {
    this.isRollbackSource = isRollbackSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the PiT is a rollback source.")
  @JsonProperty("isRollbackSource")
  public Boolean getIsRollbackSource() {
    return isRollbackSource;
  }
  
  public void setIsRollbackSource(Boolean isRollbackSource) {
    this.isRollbackSource = isRollbackSource;
  }

  
  /**
   * The capacity in bytes of this PiT (capacity of the base at the time the PiT was created).
   **/
  public PIT pitCapacity(Long pitCapacity) {
    this.pitCapacity = pitCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity in bytes of this PiT (capacity of the base at the time the PiT was created).")
  @JsonProperty("pitCapacity")
  public Long getPitCapacity() {
    return pitCapacity;
  }
  
  public void setPitCapacity(Long pitCapacity) {
    this.pitCapacity = pitCapacity;
  }

  
  /**
   * Repository utilization in bytes (only reported if activeCOW = false).
   **/
  public PIT repositoryCapacityUtilization(Long repositoryCapacityUtilization) {
    this.repositoryCapacityUtilization = repositoryCapacityUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Repository utilization in bytes (only reported if activeCOW = false).")
  @JsonProperty("repositoryCapacityUtilization")
  public Long getRepositoryCapacityUtilization() {
    return repositoryCapacityUtilization;
  }
  
  public void setRepositoryCapacityUtilization(Long repositoryCapacityUtilization) {
    this.repositoryCapacityUtilization = repositoryCapacityUtilization;
  }

  
  /**
   **/
  public PIT id(String id) {
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
    PIT PIT = (PIT) o;
    return Objects.equals(this.pitRef, PIT.pitRef) &&
        Objects.equals(this.pitGroupRef, PIT.pitGroupRef) &&
        Objects.equals(this.creationMethod, PIT.creationMethod) &&
        Objects.equals(this.pitTimestamp, PIT.pitTimestamp) &&
        Objects.equals(this.pitSequenceNumber, PIT.pitSequenceNumber) &&
        Objects.equals(this.status, PIT.status) &&
        Objects.equals(this.activeCOW, PIT.activeCOW) &&
        Objects.equals(this.isRollbackSource, PIT.isRollbackSource) &&
        Objects.equals(this.pitCapacity, PIT.pitCapacity) &&
        Objects.equals(this.repositoryCapacityUtilization, PIT.repositoryCapacityUtilization) &&
        Objects.equals(this.id, PIT.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pitRef, pitGroupRef, creationMethod, pitTimestamp, pitSequenceNumber, status, activeCOW, isRollbackSource, pitCapacity, repositoryCapacityUtilization, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PIT {\n");
    
    sb.append("    pitRef: ").append(toIndentedString(pitRef)).append("\n");
    sb.append("    pitGroupRef: ").append(toIndentedString(pitGroupRef)).append("\n");
    sb.append("    creationMethod: ").append(toIndentedString(creationMethod)).append("\n");
    sb.append("    pitTimestamp: ").append(toIndentedString(pitTimestamp)).append("\n");
    sb.append("    pitSequenceNumber: ").append(toIndentedString(pitSequenceNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activeCOW: ").append(toIndentedString(activeCOW)).append("\n");
    sb.append("    isRollbackSource: ").append(toIndentedString(isRollbackSource)).append("\n");
    sb.append("    pitCapacity: ").append(toIndentedString(pitCapacity)).append("\n");
    sb.append("    repositoryCapacityUtilization: ").append(toIndentedString(repositoryCapacityUtilization)).append("\n");
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

