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
 * Creates a Volume Mapping - maps a Volume to a Host or Host Group.
 */
@ApiModel(description = "Creates a Volume Mapping - maps a Volume to a Host or Host Group.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class VolumeMappingCreateRequest   {
  
    private String mappableObjectId;

    private String targetId;

    private Integer lun;

  
  /**
   * The mappable object such as a volume or snapshot volume.
   **/
  public VolumeMappingCreateRequest mappableObjectId(String mappableObjectId) {
    this.mappableObjectId = mappableObjectId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The mappable object such as a volume or snapshot volume.")
  @JsonProperty("mappableObjectId")
  public String getMappableObjectId() {
    return mappableObjectId;
  }
  
  public void setMappableObjectId(String mappableObjectId) {
    this.mappableObjectId = mappableObjectId;
  }

  
  /**
   * The host group or a host for the volume mapping. If left null, the default host group will be used
   **/
  public VolumeMappingCreateRequest targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The host group or a host for the volume mapping. If left null, the default host group will be used")
  @JsonProperty("targetId")
  public String getTargetId() {
    return targetId;
  }
  
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  
  /**
   * The LUN for the volume mapping.
   **/
  public VolumeMappingCreateRequest lun(Integer lun) {
    this.lun = lun;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The LUN for the volume mapping.")
  @JsonProperty("lun")
  public Integer getLun() {
    return lun;
  }
  
  public void setLun(Integer lun) {
    this.lun = lun;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeMappingCreateRequest volumeMappingCreateRequest = (VolumeMappingCreateRequest) o;
    return Objects.equals(this.mappableObjectId, volumeMappingCreateRequest.mappableObjectId) &&
        Objects.equals(this.targetId, volumeMappingCreateRequest.targetId) &&
        Objects.equals(this.lun, volumeMappingCreateRequest.lun);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappableObjectId, targetId, lun);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeMappingCreateRequest {\n");
    
    sb.append("    mappableObjectId: ").append(toIndentedString(mappableObjectId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
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

