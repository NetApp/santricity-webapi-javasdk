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
 * Initiator
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class Initiator   {
  
    private String initiatorRef;

    private ScsiNodeName nodeName;

    private ScsiAlias alias;

    private String label;

    private AuthenticationBundle configuredAuthMethods;

    private String hostRef;

    private Boolean initiatorInactive;

    private String id;

  
  /**
   * The reference that uniquely identifies an instance of this object.
   **/
  public Initiator initiatorRef(String initiatorRef) {
    this.initiatorRef = initiatorRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference that uniquely identifies an instance of this object.")
  @JsonProperty("initiatorRef")
  public String getInitiatorRef() {
    return initiatorRef;
  }
  
  public void setInitiatorRef(String initiatorRef) {
    this.initiatorRef = initiatorRef;
  }

  
  /**
   * The unique node name associated with the initiator.
   **/
  public Initiator nodeName(ScsiNodeName nodeName) {
    this.nodeName = nodeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique node name associated with the initiator.")
  @JsonProperty("nodeName")
  public ScsiNodeName getNodeName() {
    return nodeName;
  }
  
  public void setNodeName(ScsiNodeName nodeName) {
    this.nodeName = nodeName;
  }

  
  /**
   * An additional name that can be assigned to an initiator, which is usually \"friendlier\" than the node name.
   **/
  public Initiator alias(ScsiAlias alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An additional name that can be assigned to an initiator, which is usually \"friendlier\" than the node name.")
  @JsonProperty("alias")
  public ScsiAlias getAlias() {
    return alias;
  }
  
  public void setAlias(ScsiAlias alias) {
    this.alias = alias;
  }

  
  /**
   * An additional \"friendly\" name that can be assigned to an initiator through the Storage Manager application.
   **/
  public Initiator label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An additional \"friendly\" name that can be assigned to an initiator through the Storage Manager application.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The authentication methods that have been configured for the initiator. Associated secrets are not exposed. instead the type field of the EncryptedPassword is set to ENCRYPT_UNSPECIFIED.
   **/
  public Initiator configuredAuthMethods(AuthenticationBundle configuredAuthMethods) {
    this.configuredAuthMethods = configuredAuthMethods;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The authentication methods that have been configured for the initiator. Associated secrets are not exposed. instead the type field of the EncryptedPassword is set to ENCRYPT_UNSPECIFIED.")
  @JsonProperty("configuredAuthMethods")
  public AuthenticationBundle getConfiguredAuthMethods() {
    return configuredAuthMethods;
  }
  
  public void setConfiguredAuthMethods(AuthenticationBundle configuredAuthMethods) {
    this.configuredAuthMethods = configuredAuthMethods;
  }

  
  /**
   * A reference to the Host object to which the initiator belongs.
   **/
  public Initiator hostRef(String hostRef) {
    this.hostRef = hostRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the Host object to which the initiator belongs.")
  @JsonProperty("hostRef")
  public String getHostRef() {
    return hostRef;
  }
  
  public void setHostRef(String hostRef) {
    this.hostRef = hostRef;
  }

  
  /**
   * The initiator is marked inactive.
   **/
  public Initiator initiatorInactive(Boolean initiatorInactive) {
    this.initiatorInactive = initiatorInactive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The initiator is marked inactive.")
  @JsonProperty("initiatorInactive")
  public Boolean getInitiatorInactive() {
    return initiatorInactive;
  }
  
  public void setInitiatorInactive(Boolean initiatorInactive) {
    this.initiatorInactive = initiatorInactive;
  }

  
  /**
   **/
  public Initiator id(String id) {
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
    Initiator initiator = (Initiator) o;
    return Objects.equals(this.initiatorRef, initiator.initiatorRef) &&
        Objects.equals(this.nodeName, initiator.nodeName) &&
        Objects.equals(this.alias, initiator.alias) &&
        Objects.equals(this.label, initiator.label) &&
        Objects.equals(this.configuredAuthMethods, initiator.configuredAuthMethods) &&
        Objects.equals(this.hostRef, initiator.hostRef) &&
        Objects.equals(this.initiatorInactive, initiator.initiatorInactive) &&
        Objects.equals(this.id, initiator.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiatorRef, nodeName, alias, label, configuredAuthMethods, hostRef, initiatorInactive, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Initiator {\n");
    
    sb.append("    initiatorRef: ").append(toIndentedString(initiatorRef)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    configuredAuthMethods: ").append(toIndentedString(configuredAuthMethods)).append("\n");
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
    sb.append("    initiatorInactive: ").append(toIndentedString(initiatorInactive)).append("\n");
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

