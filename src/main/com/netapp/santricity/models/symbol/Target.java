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
 * Target
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class Target   {
  
    private String targetRef;

    private ScsiNodeName nodeName;

    private ScsiAlias alias;

    private AuthenticationBundle configuredAuthMethods;

    private List<TargetPortal> portals;

  
  /**
   * The reference that uniquely identifies an instance of this object.
   **/
  public Target targetRef(String targetRef) {
    this.targetRef = targetRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference that uniquely identifies an instance of this object.")
  @JsonProperty("targetRef")
  public String getTargetRef() {
    return targetRef;
  }
  
  public void setTargetRef(String targetRef) {
    this.targetRef = targetRef;
  }

  
  /**
   * The unique node name associated with the target.
   **/
  public Target nodeName(ScsiNodeName nodeName) {
    this.nodeName = nodeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique node name associated with the target.")
  @JsonProperty("nodeName")
  public ScsiNodeName getNodeName() {
    return nodeName;
  }
  
  public void setNodeName(ScsiNodeName nodeName) {
    this.nodeName = nodeName;
  }

  
  /**
   * An additional name that can be assigned to a target, which is usually \"friendlier\" than the node name.
   **/
  public Target alias(ScsiAlias alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An additional name that can be assigned to a target, which is usually \"friendlier\" than the node name.")
  @JsonProperty("alias")
  public ScsiAlias getAlias() {
    return alias;
  }
  
  public void setAlias(ScsiAlias alias) {
    this.alias = alias;
  }

  
  /**
   * The authentication methods that have been configured for the target. Associated secrets are not exposed. instead the type field of the EncryptedPassword is set to ENCRYPT_UNSPECIFIED.
   **/
  public Target configuredAuthMethods(AuthenticationBundle configuredAuthMethods) {
    this.configuredAuthMethods = configuredAuthMethods;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The authentication methods that have been configured for the target. Associated secrets are not exposed. instead the type field of the EncryptedPassword is set to ENCRYPT_UNSPECIFIED.")
  @JsonProperty("configuredAuthMethods")
  public AuthenticationBundle getConfiguredAuthMethods() {
    return configuredAuthMethods;
  }
  
  public void setConfiguredAuthMethods(AuthenticationBundle configuredAuthMethods) {
    this.configuredAuthMethods = configuredAuthMethods;
  }

  
  /**
   * The set of configured (i.e., either in-use or listening for connections) portals associated with this target.
   **/
  public Target portals(List<TargetPortal> portals) {
    this.portals = portals;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of configured (i.e., either in-use or listening for connections) portals associated with this target.")
  @JsonProperty("portals")
  public List<TargetPortal> getPortals() {
    return portals;
  }
  
  public void setPortals(List<TargetPortal> portals) {
    this.portals = portals;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Target target = (Target) o;
    return Objects.equals(this.targetRef, target.targetRef) &&
        Objects.equals(this.nodeName, target.nodeName) &&
        Objects.equals(this.alias, target.alias) &&
        Objects.equals(this.configuredAuthMethods, target.configuredAuthMethods) &&
        Objects.equals(this.portals, target.portals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetRef, nodeName, alias, configuredAuthMethods, portals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Target {\n");
    
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    configuredAuthMethods: ").append(toIndentedString(configuredAuthMethods)).append("\n");
    sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
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

