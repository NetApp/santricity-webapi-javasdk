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
 * ApplicationAwarenessBundle
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ApplicationAwarenessBundle   {
  
    private List<KeyValueTag> keyValueTag;

    private List<KeyValueTagMapping> keyValueTagMapping;

    private List<Workload> workload;

    private List<WorkloadVolumeMapping> workloadVolumeMapping;

  
  /**
   * This is an array of elements that report the a key-value tag and its reference.
   **/
  public ApplicationAwarenessBundle keyValueTag(List<KeyValueTag> keyValueTag) {
    this.keyValueTag = keyValueTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is an array of elements that report the a key-value tag and its reference.")
  @JsonProperty("keyValueTag")
  public List<KeyValueTag> getKeyValueTag() {
    return keyValueTag;
  }
  
  public void setKeyValueTag(List<KeyValueTag> keyValueTag) {
    this.keyValueTag = keyValueTag;
  }

  
  /**
   * This element is an array of the mappings (using references) between a key-value tag and a volume.
   **/
  public ApplicationAwarenessBundle keyValueTagMapping(List<KeyValueTagMapping> keyValueTagMapping) {
    this.keyValueTagMapping = keyValueTagMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This element is an array of the mappings (using references) between a key-value tag and a volume.")
  @JsonProperty("keyValueTagMapping")
  public List<KeyValueTagMapping> getKeyValueTagMapping() {
    return keyValueTagMapping;
  }
  
  public void setKeyValueTagMapping(List<KeyValueTagMapping> keyValueTagMapping) {
    this.keyValueTagMapping = keyValueTagMapping;
  }

  
  /**
   * This is an array of elements that reports Workload references.
   **/
  public ApplicationAwarenessBundle workload(List<Workload> workload) {
    this.workload = workload;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is an array of elements that reports Workload references.")
  @JsonProperty("workload")
  public List<Workload> getWorkload() {
    return workload;
  }
  
  public void setWorkload(List<Workload> workload) {
    this.workload = workload;
  }

  
  /**
   * This is an array of elements that report the mapping between workloads and volumes.
   **/
  public ApplicationAwarenessBundle workloadVolumeMapping(List<WorkloadVolumeMapping> workloadVolumeMapping) {
    this.workloadVolumeMapping = workloadVolumeMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is an array of elements that report the mapping between workloads and volumes.")
  @JsonProperty("workloadVolumeMapping")
  public List<WorkloadVolumeMapping> getWorkloadVolumeMapping() {
    return workloadVolumeMapping;
  }
  
  public void setWorkloadVolumeMapping(List<WorkloadVolumeMapping> workloadVolumeMapping) {
    this.workloadVolumeMapping = workloadVolumeMapping;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationAwarenessBundle applicationAwarenessBundle = (ApplicationAwarenessBundle) o;
    return Objects.equals(this.keyValueTag, applicationAwarenessBundle.keyValueTag) &&
        Objects.equals(this.keyValueTagMapping, applicationAwarenessBundle.keyValueTagMapping) &&
        Objects.equals(this.workload, applicationAwarenessBundle.workload) &&
        Objects.equals(this.workloadVolumeMapping, applicationAwarenessBundle.workloadVolumeMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyValueTag, keyValueTagMapping, workload, workloadVolumeMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationAwarenessBundle {\n");
    
    sb.append("    keyValueTag: ").append(toIndentedString(keyValueTag)).append("\n");
    sb.append("    keyValueTagMapping: ").append(toIndentedString(keyValueTagMapping)).append("\n");
    sb.append("    workload: ").append(toIndentedString(workload)).append("\n");
    sb.append("    workloadVolumeMapping: ").append(toIndentedString(workloadVolumeMapping)).append("\n");
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

