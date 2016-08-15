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
 * SnapshotConversionLabel
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SnapshotConversionLabel   {
  
    private String snapRepositoryRef;

    private String newRepositoryLabel;

    private String newPITGroupLabel;

  
  /**
   * Reference to repository of snapshot being converted. This volume (old snapshot Repository, new PiT group repository) will be renamed using 'newRepositoryLabel' contained in this structure, and the associated PiT group created will be named using the \"newPITGroupLabel\" also contained in this structure. Note: The old snapshot label will be used for the read-only view that is created as part of the conversion process.
   **/
  public SnapshotConversionLabel snapRepositoryRef(String snapRepositoryRef) {
    this.snapRepositoryRef = snapRepositoryRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to repository of snapshot being converted. This volume (old snapshot Repository, new PiT group repository) will be renamed using 'newRepositoryLabel' contained in this structure, and the associated PiT group created will be named using the \"newPITGroupLabel\" also contained in this structure. Note: The old snapshot label will be used for the read-only view that is created as part of the conversion process.")
  @JsonProperty("snapRepositoryRef")
  public String getSnapRepositoryRef() {
    return snapRepositoryRef;
  }
  
  public void setSnapRepositoryRef(String snapRepositoryRef) {
    this.snapRepositoryRef = snapRepositoryRef;
  }

  
  /**
   * New label for repository volume being converted from a snapshot repository to a PiT group repository.
   **/
  public SnapshotConversionLabel newRepositoryLabel(String newRepositoryLabel) {
    this.newRepositoryLabel = newRepositoryLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "New label for repository volume being converted from a snapshot repository to a PiT group repository.")
  @JsonProperty("newRepositoryLabel")
  public String getNewRepositoryLabel() {
    return newRepositoryLabel;
  }
  
  public void setNewRepositoryLabel(String newRepositoryLabel) {
    this.newRepositoryLabel = newRepositoryLabel;
  }

  
  /**
   * Label for new PiT group being created.
   **/
  public SnapshotConversionLabel newPITGroupLabel(String newPITGroupLabel) {
    this.newPITGroupLabel = newPITGroupLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Label for new PiT group being created.")
  @JsonProperty("newPITGroupLabel")
  public String getNewPITGroupLabel() {
    return newPITGroupLabel;
  }
  
  public void setNewPITGroupLabel(String newPITGroupLabel) {
    this.newPITGroupLabel = newPITGroupLabel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotConversionLabel snapshotConversionLabel = (SnapshotConversionLabel) o;
    return Objects.equals(this.snapRepositoryRef, snapshotConversionLabel.snapRepositoryRef) &&
        Objects.equals(this.newRepositoryLabel, snapshotConversionLabel.newRepositoryLabel) &&
        Objects.equals(this.newPITGroupLabel, snapshotConversionLabel.newPITGroupLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapRepositoryRef, newRepositoryLabel, newPITGroupLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotConversionLabel {\n");
    
    sb.append("    snapRepositoryRef: ").append(toIndentedString(snapRepositoryRef)).append("\n");
    sb.append("    newRepositoryLabel: ").append(toIndentedString(newRepositoryLabel)).append("\n");
    sb.append("    newPITGroupLabel: ").append(toIndentedString(newPITGroupLabel)).append("\n");
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

