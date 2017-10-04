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
 * HostGroup
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class HostGroup   {
  
    private String clusterRef;

    private String label;

    private Boolean isSAControlled;

    private Boolean confirmLUNMappingCreation;

    private Boolean protectionInformationCapableAccessMethod;

    private Boolean isLun0Restricted;

    private String id;

    private String name;

  
  /**
   * The unique identification value for this object. Other objects may use this reference value to refer to the cluster.
   **/
  public HostGroup clusterRef(String clusterRef) {
    this.clusterRef = clusterRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value for this object. Other objects may use this reference value to refer to the cluster.")
  @JsonProperty("clusterRef")
  public String getClusterRef() {
    return clusterRef;
  }
  
  public void setClusterRef(String clusterRef) {
    this.clusterRef = clusterRef;
  }

  
  /**
   * The user-assigned, descriptive label string for the cluster.
   **/
  public HostGroup label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned, descriptive label string for the cluster.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * If true, indicates that I/O accesses from this cluster are subject to the storage array's default LUN-to-volume mappings. If false, indicates that I/O accesses from the cluster are subject to cluster-specific LUN-to-volume mappings.
   **/
  public HostGroup isSAControlled(Boolean isSAControlled) {
    this.isSAControlled = isSAControlled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, indicates that I/O accesses from this cluster are subject to the storage array's default LUN-to-volume mappings. If false, indicates that I/O accesses from the cluster are subject to cluster-specific LUN-to-volume mappings.")
  @JsonProperty("isSAControlled")
  public Boolean getIsSAControlled() {
    return isSAControlled;
  }
  
  public void setIsSAControlled(Boolean isSAControlled) {
    this.isSAControlled = isSAControlled;
  }

  
  /**
   * If true, indicates that creation of LUN-to-volume mappings should require careful confirmation from the end-user, since such a mapping will alter the volume access rights of other clusters, in addition to this one.
   **/
  public HostGroup confirmLUNMappingCreation(Boolean confirmLUNMappingCreation) {
    this.confirmLUNMappingCreation = confirmLUNMappingCreation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, indicates that creation of LUN-to-volume mappings should require careful confirmation from the end-user, since such a mapping will alter the volume access rights of other clusters, in addition to this one.")
  @JsonProperty("confirmLUNMappingCreation")
  public Boolean getConfirmLUNMappingCreation() {
    return confirmLUNMappingCreation;
  }
  
  public void setConfirmLUNMappingCreation(Boolean confirmLUNMappingCreation) {
    this.confirmLUNMappingCreation = confirmLUNMappingCreation;
  }

  
  /**
   * This field is true if the host has a PI capable access method.
   **/
  public HostGroup protectionInformationCapableAccessMethod(Boolean protectionInformationCapableAccessMethod) {
    this.protectionInformationCapableAccessMethod = protectionInformationCapableAccessMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is true if the host has a PI capable access method.")
  @JsonProperty("protectionInformationCapableAccessMethod")
  public Boolean getProtectionInformationCapableAccessMethod() {
    return protectionInformationCapableAccessMethod;
  }
  
  public void setProtectionInformationCapableAccessMethod(Boolean protectionInformationCapableAccessMethod) {
    this.protectionInformationCapableAccessMethod = protectionInformationCapableAccessMethod;
  }

  
  /**
   * Provides an indication as to whether LUN 0 is restricted (i.e., disallowed) for the associated cluster.
   **/
  public HostGroup isLun0Restricted(Boolean isLun0Restricted) {
    this.isLun0Restricted = isLun0Restricted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Provides an indication as to whether LUN 0 is restricted (i.e., disallowed) for the associated cluster.")
  @JsonProperty("isLun0Restricted")
  public Boolean getIsLun0Restricted() {
    return isLun0Restricted;
  }
  
  public void setIsLun0Restricted(Boolean isLun0Restricted) {
    this.isLun0Restricted = isLun0Restricted;
  }

  
  /**
   **/
  public HostGroup id(String id) {
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

  
  /**
   **/
  public HostGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostGroup hostGroup = (HostGroup) o;
    return Objects.equals(this.clusterRef, hostGroup.clusterRef) &&
        Objects.equals(this.label, hostGroup.label) &&
        Objects.equals(this.isSAControlled, hostGroup.isSAControlled) &&
        Objects.equals(this.confirmLUNMappingCreation, hostGroup.confirmLUNMappingCreation) &&
        Objects.equals(this.protectionInformationCapableAccessMethod, hostGroup.protectionInformationCapableAccessMethod) &&
        Objects.equals(this.isLun0Restricted, hostGroup.isLun0Restricted) &&
        Objects.equals(this.id, hostGroup.id) &&
        Objects.equals(this.name, hostGroup.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRef, label, isSAControlled, confirmLUNMappingCreation, protectionInformationCapableAccessMethod, isLun0Restricted, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostGroup {\n");
    
    sb.append("    clusterRef: ").append(toIndentedString(clusterRef)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    isSAControlled: ").append(toIndentedString(isSAControlled)).append("\n");
    sb.append("    confirmLUNMappingCreation: ").append(toIndentedString(confirmLUNMappingCreation)).append("\n");
    sb.append("    protectionInformationCapableAccessMethod: ").append(toIndentedString(protectionInformationCapableAccessMethod)).append("\n");
    sb.append("    isLun0Restricted: ").append(toIndentedString(isLun0Restricted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

