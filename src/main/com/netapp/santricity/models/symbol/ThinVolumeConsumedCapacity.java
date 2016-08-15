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
 * ThinVolumeConsumedCapacity
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ThinVolumeConsumedCapacity   {
  
    private String volumeRef;

    private Long repositoryProvisionedCapacity;

    private Long repositoryConsumedCapacity;

  
  /**
   * The reference for this thin volume.
   **/
  public ThinVolumeConsumedCapacity volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for this thin volume.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * The total capacity of the repository.
   **/
  public ThinVolumeConsumedCapacity repositoryProvisionedCapacity(Long repositoryProvisionedCapacity) {
    this.repositoryProvisionedCapacity = repositoryProvisionedCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total capacity of the repository.")
  @JsonProperty("repositoryProvisionedCapacity")
  public Long getRepositoryProvisionedCapacity() {
    return repositoryProvisionedCapacity;
  }
  
  public void setRepositoryProvisionedCapacity(Long repositoryProvisionedCapacity) {
    this.repositoryProvisionedCapacity = repositoryProvisionedCapacity;
  }

  
  /**
   * The capacity that is consumed.
   **/
  public ThinVolumeConsumedCapacity repositoryConsumedCapacity(Long repositoryConsumedCapacity) {
    this.repositoryConsumedCapacity = repositoryConsumedCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity that is consumed.")
  @JsonProperty("repositoryConsumedCapacity")
  public Long getRepositoryConsumedCapacity() {
    return repositoryConsumedCapacity;
  }
  
  public void setRepositoryConsumedCapacity(Long repositoryConsumedCapacity) {
    this.repositoryConsumedCapacity = repositoryConsumedCapacity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThinVolumeConsumedCapacity thinVolumeConsumedCapacity = (ThinVolumeConsumedCapacity) o;
    return Objects.equals(this.volumeRef, thinVolumeConsumedCapacity.volumeRef) &&
        Objects.equals(this.repositoryProvisionedCapacity, thinVolumeConsumedCapacity.repositoryProvisionedCapacity) &&
        Objects.equals(this.repositoryConsumedCapacity, thinVolumeConsumedCapacity.repositoryConsumedCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeRef, repositoryProvisionedCapacity, repositoryConsumedCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinVolumeConsumedCapacity {\n");
    
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    repositoryProvisionedCapacity: ").append(toIndentedString(repositoryProvisionedCapacity)).append("\n");
    sb.append("    repositoryConsumedCapacity: ").append(toIndentedString(repositoryConsumedCapacity)).append("\n");
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

