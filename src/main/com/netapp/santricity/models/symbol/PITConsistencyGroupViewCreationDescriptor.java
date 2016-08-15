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
 * PITConsistencyGroupViewCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PITConsistencyGroupViewCreationDescriptor   {
  
    private String cgRef;

    private Long pitSequenceNumber;

    private List<PITViewCreationDescriptor> viewCreationDescriptor;

    private String label;

  
  /**
   * The Consistency Group on which views are to be created. All PiTs referenced in the view creation descriptors must be part of this consistency group.
   **/
  public PITConsistencyGroupViewCreationDescriptor cgRef(String cgRef) {
    this.cgRef = cgRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Consistency Group on which views are to be created. All PiTs referenced in the view creation descriptors must be part of this consistency group.")
  @JsonProperty("cgRef")
  public String getCgRef() {
    return cgRef;
  }
  
  public void setCgRef(String cgRef) {
    this.cgRef = cgRef;
  }

  
  /**
   * The sequence number of PiTs for which views are to be created. PITRefs in the view creation descriptors provided must have this sequence number (this is just for cross-checking the list of PiTs).
   **/
  public PITConsistencyGroupViewCreationDescriptor pitSequenceNumber(Long pitSequenceNumber) {
    this.pitSequenceNumber = pitSequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sequence number of PiTs for which views are to be created. PITRefs in the view creation descriptors provided must have this sequence number (this is just for cross-checking the list of PiTs).")
  @JsonProperty("pitSequenceNumber")
  public Long getPitSequenceNumber() {
    return pitSequenceNumber;
  }
  
  public void setPitSequenceNumber(Long pitSequenceNumber) {
    this.pitSequenceNumber = pitSequenceNumber;
  }

  
  /**
   * A list of creation descriptors for the views to be created.
   **/
  public PITConsistencyGroupViewCreationDescriptor viewCreationDescriptor(List<PITViewCreationDescriptor> viewCreationDescriptor) {
    this.viewCreationDescriptor = viewCreationDescriptor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of creation descriptors for the views to be created.")
  @JsonProperty("viewCreationDescriptor")
  public List<PITViewCreationDescriptor> getViewCreationDescriptor() {
    return viewCreationDescriptor;
  }
  
  public void setViewCreationDescriptor(List<PITViewCreationDescriptor> viewCreationDescriptor) {
    this.viewCreationDescriptor = viewCreationDescriptor;
  }

  
  /**
   * The name of the new Consistency Group View.
   **/
  public PITConsistencyGroupViewCreationDescriptor label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the new Consistency Group View.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITConsistencyGroupViewCreationDescriptor pITConsistencyGroupViewCreationDescriptor = (PITConsistencyGroupViewCreationDescriptor) o;
    return Objects.equals(this.cgRef, pITConsistencyGroupViewCreationDescriptor.cgRef) &&
        Objects.equals(this.pitSequenceNumber, pITConsistencyGroupViewCreationDescriptor.pitSequenceNumber) &&
        Objects.equals(this.viewCreationDescriptor, pITConsistencyGroupViewCreationDescriptor.viewCreationDescriptor) &&
        Objects.equals(this.label, pITConsistencyGroupViewCreationDescriptor.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgRef, pitSequenceNumber, viewCreationDescriptor, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITConsistencyGroupViewCreationDescriptor {\n");
    
    sb.append("    cgRef: ").append(toIndentedString(cgRef)).append("\n");
    sb.append("    pitSequenceNumber: ").append(toIndentedString(pitSequenceNumber)).append("\n");
    sb.append("    viewCreationDescriptor: ").append(toIndentedString(viewCreationDescriptor)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

