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
 * UnmatchedPendingHost
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class UnmatchedPendingHost   {
  
    private PendingHost pendingHost;

    private List<SCSIInitiatorPortId> unconfiguredPorts;

    private List<String> conflictingPorts;

    private List<String> conflictingInitiators;

  
  /**
   * A description of the pending host as it was submitted by the host context agent.
   **/
  public UnmatchedPendingHost pendingHost(PendingHost pendingHost) {
    this.pendingHost = pendingHost;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A description of the pending host as it was submitted by the host context agent.")
  @JsonProperty("pendingHost")
  public PendingHost getPendingHost() {
    return pendingHost;
  }
  
  public void setPendingHost(PendingHost pendingHost) {
    this.pendingHost = pendingHost;
  }

  
  /**
   * yet been created in the configured topology
   **/
  public UnmatchedPendingHost unconfiguredPorts(List<SCSIInitiatorPortId> unconfiguredPorts) {
    this.unconfiguredPorts = unconfiguredPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "yet been created in the configured topology")
  @JsonProperty("unconfiguredPorts")
  public List<SCSIInitiatorPortId> getUnconfiguredPorts() {
    return unconfiguredPorts;
  }
  
  public void setUnconfiguredPorts(List<SCSIInitiatorPortId> unconfiguredPorts) {
    this.unconfiguredPorts = unconfiguredPorts;
  }

  
  /**
   * A list of HostPortRef structures representing ports belonging to the pending host that conflict with ports in the configured topology. The definition of a conflict for an unmatched pending host is any port belonging to the pending host that matches a port in the configured topology.
   **/
  public UnmatchedPendingHost conflictingPorts(List<String> conflictingPorts) {
    this.conflictingPorts = conflictingPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of HostPortRef structures representing ports belonging to the pending host that conflict with ports in the configured topology. The definition of a conflict for an unmatched pending host is any port belonging to the pending host that matches a port in the configured topology.")
  @JsonProperty("conflictingPorts")
  public List<String> getConflictingPorts() {
    return conflictingPorts;
  }
  
  public void setConflictingPorts(List<String> conflictingPorts) {
    this.conflictingPorts = conflictingPorts;
  }

  
  /**
   * A list of ScsiNodeRef elements representing initiators belonging to the pending host that conflict with initiators in the configured topology. The definition of an initiator conflict for an unmatched pending host is any initiator belonging to the pending host that matches an initiator in the configured topology.
   **/
  public UnmatchedPendingHost conflictingInitiators(List<String> conflictingInitiators) {
    this.conflictingInitiators = conflictingInitiators;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of ScsiNodeRef elements representing initiators belonging to the pending host that conflict with initiators in the configured topology. The definition of an initiator conflict for an unmatched pending host is any initiator belonging to the pending host that matches an initiator in the configured topology.")
  @JsonProperty("conflictingInitiators")
  public List<String> getConflictingInitiators() {
    return conflictingInitiators;
  }
  
  public void setConflictingInitiators(List<String> conflictingInitiators) {
    this.conflictingInitiators = conflictingInitiators;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnmatchedPendingHost unmatchedPendingHost = (UnmatchedPendingHost) o;
    return Objects.equals(this.pendingHost, unmatchedPendingHost.pendingHost) &&
        Objects.equals(this.unconfiguredPorts, unmatchedPendingHost.unconfiguredPorts) &&
        Objects.equals(this.conflictingPorts, unmatchedPendingHost.conflictingPorts) &&
        Objects.equals(this.conflictingInitiators, unmatchedPendingHost.conflictingInitiators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingHost, unconfiguredPorts, conflictingPorts, conflictingInitiators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnmatchedPendingHost {\n");
    
    sb.append("    pendingHost: ").append(toIndentedString(pendingHost)).append("\n");
    sb.append("    unconfiguredPorts: ").append(toIndentedString(unconfiguredPorts)).append("\n");
    sb.append("    conflictingPorts: ").append(toIndentedString(conflictingPorts)).append("\n");
    sb.append("    conflictingInitiators: ").append(toIndentedString(conflictingInitiators)).append("\n");
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

