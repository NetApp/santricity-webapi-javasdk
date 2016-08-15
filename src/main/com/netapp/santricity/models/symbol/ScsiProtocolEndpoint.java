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
 * ScsiProtocolEndpoint
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ScsiProtocolEndpoint   {
  

  /**
   * This enumeration object is used to indicate the role of a SCSI protocol endpoint, either initiator or target.
   */
  public enum EndpointRoleEnum {
    unknown("unknown"),
    initiator("initiator"),
    target("target"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    EndpointRoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private EndpointRoleEnum endpointRole;

    private SCSIInitiatorPortId initiatorId;

    private SCSITargetPortId targetId;

  
  /**
   * This enumeration object is used to indicate the role of a SCSI protocol endpoint, either initiator or target.
   **/
  public ScsiProtocolEndpoint endpointRole(EndpointRoleEnum endpointRole) {
    this.endpointRole = endpointRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to indicate the role of a SCSI protocol endpoint, either initiator or target.")
  @JsonProperty("endpointRole")
  public EndpointRoleEnum getEndpointRole() {
    return endpointRole;
  }
  
  public void setEndpointRole(EndpointRoleEnum endpointRole) {
    this.endpointRole = endpointRole;
  }

  
  /**
   * A SCSI initiator port identifier. This field is only valid if the endpointRole field is equal to SCSI_ROLE_INITIATOR.
   **/
  public ScsiProtocolEndpoint initiatorId(SCSIInitiatorPortId initiatorId) {
    this.initiatorId = initiatorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A SCSI initiator port identifier. This field is only valid if the endpointRole field is equal to SCSI_ROLE_INITIATOR.")
  @JsonProperty("initiatorId")
  public SCSIInitiatorPortId getInitiatorId() {
    return initiatorId;
  }
  
  public void setInitiatorId(SCSIInitiatorPortId initiatorId) {
    this.initiatorId = initiatorId;
  }

  
  /**
   * A SCSI target port identifier. This field is only valid if the endpointRole field is equal to SCSI_ROLE_TARGET.
   **/
  public ScsiProtocolEndpoint targetId(SCSITargetPortId targetId) {
    this.targetId = targetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A SCSI target port identifier. This field is only valid if the endpointRole field is equal to SCSI_ROLE_TARGET.")
  @JsonProperty("targetId")
  public SCSITargetPortId getTargetId() {
    return targetId;
  }
  
  public void setTargetId(SCSITargetPortId targetId) {
    this.targetId = targetId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScsiProtocolEndpoint scsiProtocolEndpoint = (ScsiProtocolEndpoint) o;
    return Objects.equals(this.endpointRole, scsiProtocolEndpoint.endpointRole) &&
        Objects.equals(this.initiatorId, scsiProtocolEndpoint.initiatorId) &&
        Objects.equals(this.targetId, scsiProtocolEndpoint.targetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointRole, initiatorId, targetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScsiProtocolEndpoint {\n");
    
    sb.append("    endpointRole: ").append(toIndentedString(endpointRole)).append("\n");
    sb.append("    initiatorId: ").append(toIndentedString(initiatorId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

