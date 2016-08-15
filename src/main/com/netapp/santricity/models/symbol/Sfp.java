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
 * Sfp
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class Sfp   {
  
    private String sfpRef;


  /**
   * The operational status of the SFP.
   */
  public enum StatusEnum {
    optimal("optimal"),
    failed("failed"),
    removed("removed"),
    unknown("unknown"),
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

    private Location physicalLocation;

    private SFPType sfpType;


  /**
   * The port that the SFP is associated with.
   */
  public enum SfpPortEnum {
    portUnknown("portUnknown"),
    port1("port1"),
    port2("port2"),
    port3("port3"),
    port4("port4"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SfpPortEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SfpPortEnum sfpPort;

    private SFPParentTypeData parentData;

    private String reserved1;

    private String reserved2;

    private String sfpPortRef;

    private RepairPolicy repairPolicy;

    private String id;

  
  /**
   * The reference for this physical SFP.
   **/
  public Sfp sfpRef(String sfpRef) {
    this.sfpRef = sfpRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for this physical SFP.")
  @JsonProperty("sfpRef")
  public String getSfpRef() {
    return sfpRef;
  }
  
  public void setSfpRef(String sfpRef) {
    this.sfpRef = sfpRef;
  }

  
  /**
   * The operational status of the SFP.
   **/
  public Sfp status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status of the SFP.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The physical location of the SFP.
   **/
  public Sfp physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the SFP.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * The type of the SFP.
   **/
  public Sfp sfpType(SFPType sfpType) {
    this.sfpType = sfpType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the SFP.")
  @JsonProperty("sfpType")
  public SFPType getSfpType() {
    return sfpType;
  }
  
  public void setSfpType(SFPType sfpType) {
    this.sfpType = sfpType;
  }

  
  /**
   * The port that the SFP is associated with.
   **/
  public Sfp sfpPort(SfpPortEnum sfpPort) {
    this.sfpPort = sfpPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The port that the SFP is associated with.")
  @JsonProperty("sfpPort")
  public SfpPortEnum getSfpPort() {
    return sfpPort;
  }
  
  public void setSfpPort(SfpPortEnum sfpPort) {
    this.sfpPort = sfpPort;
  }

  
  /**
   * Data specific to SFP parent type.
   **/
  public Sfp parentData(SFPParentTypeData parentData) {
    this.parentData = parentData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Data specific to SFP parent type.")
  @JsonProperty("parentData")
  public SFPParentTypeData getParentData() {
    return parentData;
  }
  
  public void setParentData(SFPParentTypeData parentData) {
    this.parentData = parentData;
  }

  
  /**
   **/
  public Sfp reserved1(String reserved1) {
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

  
  /**
   **/
  public Sfp reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  
  /**
   * A reference identifying the channel port that the SFP is plugged into.
   **/
  public Sfp sfpPortRef(String sfpPortRef) {
    this.sfpPortRef = sfpPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference identifying the channel port that the SFP is plugged into.")
  @JsonProperty("sfpPortRef")
  public String getSfpPortRef() {
    return sfpPortRef;
  }
  
  public void setSfpPortRef(String sfpPortRef) {
    this.sfpPortRef = sfpPortRef;
  }

  
  /**
   * The repair policy for the SFP component.
   **/
  public Sfp repairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repair policy for the SFP component.")
  @JsonProperty("repairPolicy")
  public RepairPolicy getRepairPolicy() {
    return repairPolicy;
  }
  
  public void setRepairPolicy(RepairPolicy repairPolicy) {
    this.repairPolicy = repairPolicy;
  }

  
  /**
   **/
  public Sfp id(String id) {
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
    Sfp sfp = (Sfp) o;
    return Objects.equals(this.sfpRef, sfp.sfpRef) &&
        Objects.equals(this.status, sfp.status) &&
        Objects.equals(this.physicalLocation, sfp.physicalLocation) &&
        Objects.equals(this.sfpType, sfp.sfpType) &&
        Objects.equals(this.sfpPort, sfp.sfpPort) &&
        Objects.equals(this.parentData, sfp.parentData) &&
        Objects.equals(this.reserved1, sfp.reserved1) &&
        Objects.equals(this.reserved2, sfp.reserved2) &&
        Objects.equals(this.sfpPortRef, sfp.sfpPortRef) &&
        Objects.equals(this.repairPolicy, sfp.repairPolicy) &&
        Objects.equals(this.id, sfp.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sfpRef, status, physicalLocation, sfpType, sfpPort, parentData, reserved1, reserved2, sfpPortRef, repairPolicy, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sfp {\n");
    
    sb.append("    sfpRef: ").append(toIndentedString(sfpRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    sfpType: ").append(toIndentedString(sfpType)).append("\n");
    sb.append("    sfpPort: ").append(toIndentedString(sfpPort)).append("\n");
    sb.append("    parentData: ").append(toIndentedString(parentData)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    sfpPortRef: ").append(toIndentedString(sfpPortRef)).append("\n");
    sb.append("    repairPolicy: ").append(toIndentedString(repairPolicy)).append("\n");
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

