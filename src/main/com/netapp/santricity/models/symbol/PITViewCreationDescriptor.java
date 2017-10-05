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
 * PITViewCreationDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PITViewCreationDescriptor   {
  
    private String basePIT;

    private String viewLabel;

    private PITViewRepositoryCreationDescriptor repositoryDescriptor;

    private Integer fullWarnThreshold;

  
  /**
   * A reference to the base PiT.
   **/
  public PITViewCreationDescriptor basePIT(String basePIT) {
    this.basePIT = basePIT;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the base PiT.")
  @JsonProperty("basePIT")
  public String getBasePIT() {
    return basePIT;
  }
  
  public void setBasePIT(String basePIT) {
    this.basePIT = basePIT;
  }

  
  /**
   * The name of the view.
   **/
  public PITViewCreationDescriptor viewLabel(String viewLabel) {
    this.viewLabel = viewLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the view.")
  @JsonProperty("viewLabel")
  public String getViewLabel() {
    return viewLabel;
  }
  
  public void setViewLabel(String viewLabel) {
    this.viewLabel = viewLabel;
  }

  
  /**
   * The copy-on-write repository for this view.
   **/
  public PITViewCreationDescriptor repositoryDescriptor(PITViewRepositoryCreationDescriptor repositoryDescriptor) {
    this.repositoryDescriptor = repositoryDescriptor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The copy-on-write repository for this view.")
  @JsonProperty("repositoryDescriptor")
  public PITViewRepositoryCreationDescriptor getRepositoryDescriptor() {
    return repositoryDescriptor;
  }
  
  public void setRepositoryDescriptor(PITViewRepositoryCreationDescriptor repositoryDescriptor) {
    this.repositoryDescriptor = repositoryDescriptor;
  }

  
  /**
   * The repository utilization warning threshold percentage.
   **/
  public PITViewCreationDescriptor fullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold percentage.")
  @JsonProperty("fullWarnThreshold")
  public Integer getFullWarnThreshold() {
    return fullWarnThreshold;
  }
  
  public void setFullWarnThreshold(Integer fullWarnThreshold) {
    this.fullWarnThreshold = fullWarnThreshold;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITViewCreationDescriptor pITViewCreationDescriptor = (PITViewCreationDescriptor) o;
    return Objects.equals(this.basePIT, pITViewCreationDescriptor.basePIT) &&
        Objects.equals(this.viewLabel, pITViewCreationDescriptor.viewLabel) &&
        Objects.equals(this.repositoryDescriptor, pITViewCreationDescriptor.repositoryDescriptor) &&
        Objects.equals(this.fullWarnThreshold, pITViewCreationDescriptor.fullWarnThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basePIT, viewLabel, repositoryDescriptor, fullWarnThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITViewCreationDescriptor {\n");
    
    sb.append("    basePIT: ").append(toIndentedString(basePIT)).append("\n");
    sb.append("    viewLabel: ").append(toIndentedString(viewLabel)).append("\n");
    sb.append("    repositoryDescriptor: ").append(toIndentedString(repositoryDescriptor)).append("\n");
    sb.append("    fullWarnThreshold: ").append(toIndentedString(fullWarnThreshold)).append("\n");
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

