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
 * MatchedPendingHost
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class MatchedPendingHost   {
  
    private PendingHost pendingHost;

    private String matchingConfiguredHost;


  /**
   * An indication of the host properties on which the match is based.
   */
  public enum MatchTypeEnum {
    nameOnly("nameOnly"),
    portsOnly("portsOnly"),
    nameAndPorts("nameAndPorts"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MatchTypeEnum matchType;

    private Boolean hostNameChange;

    private Boolean hostTypeChange;

    private List<SCSIInitiatorPortId> unconfiguredPorts;

    private List<String> matchingPorts;

    private List<String> conflictingPorts;

    private List<String> missingPorts;

    private List<String> matchingInitiators;

    private List<String> conflictingInitiators;

    private List<String> missingInitiators;

  
  /**
   * A description of the pending host as it was submitted by the host context agent.
   **/
  public MatchedPendingHost pendingHost(PendingHost pendingHost) {
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
   * A reference to the configured host with which the pending host is matched.
   **/
  public MatchedPendingHost matchingConfiguredHost(String matchingConfiguredHost) {
    this.matchingConfiguredHost = matchingConfiguredHost;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the configured host with which the pending host is matched.")
  @JsonProperty("matchingConfiguredHost")
  public String getMatchingConfiguredHost() {
    return matchingConfiguredHost;
  }
  
  public void setMatchingConfiguredHost(String matchingConfiguredHost) {
    this.matchingConfiguredHost = matchingConfiguredHost;
  }

  
  /**
   * An indication of the host properties on which the match is based.
   **/
  public MatchedPendingHost matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of the host properties on which the match is based.")
  @JsonProperty("matchType")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }
  
  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }

  
  /**
   * True if the name of the pending host is different than the configured host.
   **/
  public MatchedPendingHost hostNameChange(Boolean hostNameChange) {
    this.hostNameChange = hostNameChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the name of the pending host is different than the configured host.")
  @JsonProperty("hostNameChange")
  public Boolean getHostNameChange() {
    return hostNameChange;
  }
  
  public void setHostNameChange(Boolean hostNameChange) {
    this.hostNameChange = hostNameChange;
  }

  
  /**
   * True if the type of the pending host is different than the configured host.
   **/
  public MatchedPendingHost hostTypeChange(Boolean hostTypeChange) {
    this.hostTypeChange = hostTypeChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the type of the pending host is different than the configured host.")
  @JsonProperty("hostTypeChange")
  public Boolean getHostTypeChange() {
    return hostTypeChange;
  }
  
  public void setHostTypeChange(Boolean hostTypeChange) {
    this.hostTypeChange = hostTypeChange;
  }

  
  /**
   * yet been created in the configured topology.
   **/
  public MatchedPendingHost unconfiguredPorts(List<SCSIInitiatorPortId> unconfiguredPorts) {
    this.unconfiguredPorts = unconfiguredPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "yet been created in the configured topology.")
  @JsonProperty("unconfiguredPorts")
  public List<SCSIInitiatorPortId> getUnconfiguredPorts() {
    return unconfiguredPorts;
  }
  
  public void setUnconfiguredPorts(List<SCSIInitiatorPortId> unconfiguredPorts) {
    this.unconfiguredPorts = unconfiguredPorts;
  }

  
  /**
   * A list of HostPortRef structures representing configured ports that are common between this pending host and the configured host identified by the matchingConfiguredHost field.
   **/
  public MatchedPendingHost matchingPorts(List<String> matchingPorts) {
    this.matchingPorts = matchingPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of HostPortRef structures representing configured ports that are common between this pending host and the configured host identified by the matchingConfiguredHost field.")
  @JsonProperty("matchingPorts")
  public List<String> getMatchingPorts() {
    return matchingPorts;
  }
  
  public void setMatchingPorts(List<String> matchingPorts) {
    this.matchingPorts = matchingPorts;
  }

  
  /**
   * A list of HostPortRef structures representing configured ports belonging to the pending host that conflict with ports in the configured topology. The definition of a port conflict for a matched pending host is any port belonging to the pending host that (1) is not identified in matchingPorts and (2) matches a port in the configured topology.
   **/
  public MatchedPendingHost conflictingPorts(List<String> conflictingPorts) {
    this.conflictingPorts = conflictingPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of HostPortRef structures representing configured ports belonging to the pending host that conflict with ports in the configured topology. The definition of a port conflict for a matched pending host is any port belonging to the pending host that (1) is not identified in matchingPorts and (2) matches a port in the configured topology.")
  @JsonProperty("conflictingPorts")
  public List<String> getConflictingPorts() {
    return conflictingPorts;
  }
  
  public void setConflictingPorts(List<String> conflictingPorts) {
    this.conflictingPorts = conflictingPorts;
  }

  
  /**
   * A list of HostPortRef structures representing configured ports belonging to the host identified by matchingConfiguredHost, which are not present in the pending host ports.
   **/
  public MatchedPendingHost missingPorts(List<String> missingPorts) {
    this.missingPorts = missingPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of HostPortRef structures representing configured ports belonging to the host identified by matchingConfiguredHost, which are not present in the pending host ports.")
  @JsonProperty("missingPorts")
  public List<String> getMissingPorts() {
    return missingPorts;
  }
  
  public void setMissingPorts(List<String> missingPorts) {
    this.missingPorts = missingPorts;
  }

  
  /**
   * A list of ScsiNodeRef elements representing configured initiators that are common between this pending host and the configured host identified by the matchingConfiguredHost field.
   **/
  public MatchedPendingHost matchingInitiators(List<String> matchingInitiators) {
    this.matchingInitiators = matchingInitiators;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of ScsiNodeRef elements representing configured initiators that are common between this pending host and the configured host identified by the matchingConfiguredHost field.")
  @JsonProperty("matchingInitiators")
  public List<String> getMatchingInitiators() {
    return matchingInitiators;
  }
  
  public void setMatchingInitiators(List<String> matchingInitiators) {
    this.matchingInitiators = matchingInitiators;
  }

  
  /**
   * A list of ScsiNodeRef elements representing configured initiators belonging to the pending host that conflict with ports or initiators in the configured topology. The definition of an initiator conflict for a matched pending host is any initiator belonging to the pending host that (1) is not identified in matching Initiators and (2) matches an initiator in the configured topology.
   **/
  public MatchedPendingHost conflictingInitiators(List<String> conflictingInitiators) {
    this.conflictingInitiators = conflictingInitiators;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of ScsiNodeRef elements representing configured initiators belonging to the pending host that conflict with ports or initiators in the configured topology. The definition of an initiator conflict for a matched pending host is any initiator belonging to the pending host that (1) is not identified in matching Initiators and (2) matches an initiator in the configured topology.")
  @JsonProperty("conflictingInitiators")
  public List<String> getConflictingInitiators() {
    return conflictingInitiators;
  }
  
  public void setConflictingInitiators(List<String> conflictingInitiators) {
    this.conflictingInitiators = conflictingInitiators;
  }

  
  /**
   * A list of ScsiNodeRef elements representing configured initiators belonging to the host identified by matchingConfiguredHost, which are not present in the pending host initiators.
   **/
  public MatchedPendingHost missingInitiators(List<String> missingInitiators) {
    this.missingInitiators = missingInitiators;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of ScsiNodeRef elements representing configured initiators belonging to the host identified by matchingConfiguredHost, which are not present in the pending host initiators.")
  @JsonProperty("missingInitiators")
  public List<String> getMissingInitiators() {
    return missingInitiators;
  }
  
  public void setMissingInitiators(List<String> missingInitiators) {
    this.missingInitiators = missingInitiators;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchedPendingHost matchedPendingHost = (MatchedPendingHost) o;
    return Objects.equals(this.pendingHost, matchedPendingHost.pendingHost) &&
        Objects.equals(this.matchingConfiguredHost, matchedPendingHost.matchingConfiguredHost) &&
        Objects.equals(this.matchType, matchedPendingHost.matchType) &&
        Objects.equals(this.hostNameChange, matchedPendingHost.hostNameChange) &&
        Objects.equals(this.hostTypeChange, matchedPendingHost.hostTypeChange) &&
        Objects.equals(this.unconfiguredPorts, matchedPendingHost.unconfiguredPorts) &&
        Objects.equals(this.matchingPorts, matchedPendingHost.matchingPorts) &&
        Objects.equals(this.conflictingPorts, matchedPendingHost.conflictingPorts) &&
        Objects.equals(this.missingPorts, matchedPendingHost.missingPorts) &&
        Objects.equals(this.matchingInitiators, matchedPendingHost.matchingInitiators) &&
        Objects.equals(this.conflictingInitiators, matchedPendingHost.conflictingInitiators) &&
        Objects.equals(this.missingInitiators, matchedPendingHost.missingInitiators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingHost, matchingConfiguredHost, matchType, hostNameChange, hostTypeChange, unconfiguredPorts, matchingPorts, conflictingPorts, missingPorts, matchingInitiators, conflictingInitiators, missingInitiators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchedPendingHost {\n");
    
    sb.append("    pendingHost: ").append(toIndentedString(pendingHost)).append("\n");
    sb.append("    matchingConfiguredHost: ").append(toIndentedString(matchingConfiguredHost)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    hostNameChange: ").append(toIndentedString(hostNameChange)).append("\n");
    sb.append("    hostTypeChange: ").append(toIndentedString(hostTypeChange)).append("\n");
    sb.append("    unconfiguredPorts: ").append(toIndentedString(unconfiguredPorts)).append("\n");
    sb.append("    matchingPorts: ").append(toIndentedString(matchingPorts)).append("\n");
    sb.append("    conflictingPorts: ").append(toIndentedString(conflictingPorts)).append("\n");
    sb.append("    missingPorts: ").append(toIndentedString(missingPorts)).append("\n");
    sb.append("    matchingInitiators: ").append(toIndentedString(matchingInitiators)).append("\n");
    sb.append("    conflictingInitiators: ").append(toIndentedString(conflictingInitiators)).append("\n");
    sb.append("    missingInitiators: ").append(toIndentedString(missingInitiators)).append("\n");
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

