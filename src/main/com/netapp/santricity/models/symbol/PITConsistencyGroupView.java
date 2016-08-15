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
 * PITConsistencyGroupView
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PITConsistencyGroupView   {
  
    private String cgViewRef;

    private String groupRef;

    private String label;

    private Long viewTime;

    private Long viewSequenceNumber;

    private String name;

    private String id;

  
  /**
   * The reference (key) for this PITConsistencyGroupView.
   **/
  public PITConsistencyGroupView cgViewRef(String cgViewRef) {
    this.cgViewRef = cgViewRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference (key) for this PITConsistencyGroupView.")
  @JsonProperty("cgViewRef")
  public String getCgViewRef() {
    return cgViewRef;
  }
  
  public void setCgViewRef(String cgViewRef) {
    this.cgViewRef = cgViewRef;
  }

  
  /**
   * The PiT Consistency Group to which the Consistency Group View belongs.
   **/
  public PITConsistencyGroupView groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The PiT Consistency Group to which the Consistency Group View belongs.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * The name of the Consistency Group View.
   **/
  public PITConsistencyGroupView label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Consistency Group View.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The controller-time (measured in seconds since January 1, 1970) when the Consistency Group View was created or re-attached to another PiT. All member Views that are part of this Consistency Group View have this value in their corresponding fields.
   **/
  public PITConsistencyGroupView viewTime(Long viewTime) {
    this.viewTime = viewTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller-time (measured in seconds since January 1, 1970) when the Consistency Group View was created or re-attached to another PiT. All member Views that are part of this Consistency Group View have this value in their corresponding fields.")
  @JsonProperty("viewTime")
  public Long getViewTime() {
    return viewTime;
  }
  
  public void setViewTime(Long viewTime) {
    this.viewTime = viewTime;
  }

  
  /**
   * The view sequence number. This is a monotonically increasing sequence value that is common across all member Views that are part of this Consistency Group View.
   **/
  public PITConsistencyGroupView viewSequenceNumber(Long viewSequenceNumber) {
    this.viewSequenceNumber = viewSequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The view sequence number. This is a monotonically increasing sequence value that is common across all member Views that are part of this Consistency Group View.")
  @JsonProperty("viewSequenceNumber")
  public Long getViewSequenceNumber() {
    return viewSequenceNumber;
  }
  
  public void setViewSequenceNumber(Long viewSequenceNumber) {
    this.viewSequenceNumber = viewSequenceNumber;
  }

  
  /**
   **/
  public PITConsistencyGroupView name(String name) {
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

  
  /**
   **/
  public PITConsistencyGroupView id(String id) {
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
    PITConsistencyGroupView pITConsistencyGroupView = (PITConsistencyGroupView) o;
    return Objects.equals(this.cgViewRef, pITConsistencyGroupView.cgViewRef) &&
        Objects.equals(this.groupRef, pITConsistencyGroupView.groupRef) &&
        Objects.equals(this.label, pITConsistencyGroupView.label) &&
        Objects.equals(this.viewTime, pITConsistencyGroupView.viewTime) &&
        Objects.equals(this.viewSequenceNumber, pITConsistencyGroupView.viewSequenceNumber) &&
        Objects.equals(this.name, pITConsistencyGroupView.name) &&
        Objects.equals(this.id, pITConsistencyGroupView.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgViewRef, groupRef, label, viewTime, viewSequenceNumber, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITConsistencyGroupView {\n");
    
    sb.append("    cgViewRef: ").append(toIndentedString(cgViewRef)).append("\n");
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    viewTime: ").append(toIndentedString(viewTime)).append("\n");
    sb.append("    viewSequenceNumber: ").append(toIndentedString(viewSequenceNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

