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
 * EmbeddedSNMPAgentDefaultAttributes
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class EmbeddedSNMPAgentDefaultAttributes   {
  
    private Integer maxCommunities;

    private Integer maxTrapDestinations;

    private Integer maxCommunityNameStringLength;

    private Integer maxSystemVariableStringLength;

    private String defaultSystemVariableValue;

  
  /**
   * Maximum number of communities that can be added with the addSNMPCommunity procedure.
   **/
  public EmbeddedSNMPAgentDefaultAttributes maxCommunities(Integer maxCommunities) {
    this.maxCommunities = maxCommunities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum number of communities that can be added with the addSNMPCommunity procedure.")
  @JsonProperty("maxCommunities")
  public Integer getMaxCommunities() {
    return maxCommunities;
  }
  
  public void setMaxCommunities(Integer maxCommunities) {
    this.maxCommunities = maxCommunities;
  }

  
  /**
   * Maximum number of trap destinations that can be added with the addSNMPTrapDestination procedure.
   **/
  public EmbeddedSNMPAgentDefaultAttributes maxTrapDestinations(Integer maxTrapDestinations) {
    this.maxTrapDestinations = maxTrapDestinations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum number of trap destinations that can be added with the addSNMPTrapDestination procedure.")
  @JsonProperty("maxTrapDestinations")
  public Integer getMaxTrapDestinations() {
    return maxTrapDestinations;
  }
  
  public void setMaxTrapDestinations(Integer maxTrapDestinations) {
    this.maxTrapDestinations = maxTrapDestinations;
  }

  
  /**
   * Maximum length of a community name.
   **/
  public EmbeddedSNMPAgentDefaultAttributes maxCommunityNameStringLength(Integer maxCommunityNameStringLength) {
    this.maxCommunityNameStringLength = maxCommunityNameStringLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum length of a community name.")
  @JsonProperty("maxCommunityNameStringLength")
  public Integer getMaxCommunityNameStringLength() {
    return maxCommunityNameStringLength;
  }
  
  public void setMaxCommunityNameStringLength(Integer maxCommunityNameStringLength) {
    this.maxCommunityNameStringLength = maxCommunityNameStringLength;
  }

  
  /**
   * Maximum length of the user-settable system variables.
   **/
  public EmbeddedSNMPAgentDefaultAttributes maxSystemVariableStringLength(Integer maxSystemVariableStringLength) {
    this.maxSystemVariableStringLength = maxSystemVariableStringLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum length of the user-settable system variables.")
  @JsonProperty("maxSystemVariableStringLength")
  public Integer getMaxSystemVariableStringLength() {
    return maxSystemVariableStringLength;
  }
  
  public void setMaxSystemVariableStringLength(Integer maxSystemVariableStringLength) {
    this.maxSystemVariableStringLength = maxSystemVariableStringLength;
  }

  
  /**
   * Default value for system variables that are settable via SYMbol.
   **/
  public EmbeddedSNMPAgentDefaultAttributes defaultSystemVariableValue(String defaultSystemVariableValue) {
    this.defaultSystemVariableValue = defaultSystemVariableValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default value for system variables that are settable via SYMbol.")
  @JsonProperty("defaultSystemVariableValue")
  public String getDefaultSystemVariableValue() {
    return defaultSystemVariableValue;
  }
  
  public void setDefaultSystemVariableValue(String defaultSystemVariableValue) {
    this.defaultSystemVariableValue = defaultSystemVariableValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedSNMPAgentDefaultAttributes embeddedSNMPAgentDefaultAttributes = (EmbeddedSNMPAgentDefaultAttributes) o;
    return Objects.equals(this.maxCommunities, embeddedSNMPAgentDefaultAttributes.maxCommunities) &&
        Objects.equals(this.maxTrapDestinations, embeddedSNMPAgentDefaultAttributes.maxTrapDestinations) &&
        Objects.equals(this.maxCommunityNameStringLength, embeddedSNMPAgentDefaultAttributes.maxCommunityNameStringLength) &&
        Objects.equals(this.maxSystemVariableStringLength, embeddedSNMPAgentDefaultAttributes.maxSystemVariableStringLength) &&
        Objects.equals(this.defaultSystemVariableValue, embeddedSNMPAgentDefaultAttributes.defaultSystemVariableValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCommunities, maxTrapDestinations, maxCommunityNameStringLength, maxSystemVariableStringLength, defaultSystemVariableValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedSNMPAgentDefaultAttributes {\n");
    
    sb.append("    maxCommunities: ").append(toIndentedString(maxCommunities)).append("\n");
    sb.append("    maxTrapDestinations: ").append(toIndentedString(maxTrapDestinations)).append("\n");
    sb.append("    maxCommunityNameStringLength: ").append(toIndentedString(maxCommunityNameStringLength)).append("\n");
    sb.append("    maxSystemVariableStringLength: ").append(toIndentedString(maxSystemVariableStringLength)).append("\n");
    sb.append("    defaultSystemVariableValue: ").append(toIndentedString(defaultSystemVariableValue)).append("\n");
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

