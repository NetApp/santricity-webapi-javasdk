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
 * FlashCacheCreateRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class FlashCacheCreateRequest   {
  
    private List<String> driveRefs;

    private String name;

    private Boolean enableExistingVolumes;

  
  /**
   * A list of one or more drive refs belonging to SSD drives that will be utilized in the FlashCache
   **/
  public FlashCacheCreateRequest driveRefs(List<String> driveRefs) {
    this.driveRefs = driveRefs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of one or more drive refs belonging to SSD drives that will be utilized in the FlashCache")
  @JsonProperty("driveRefs")
  public List<String> getDriveRefs() {
    return driveRefs;
  }
  
  public void setDriveRefs(List<String> driveRefs) {
    this.driveRefs = driveRefs;
  }

  
  /**
   * The user label for the FlashCache
   **/
  public FlashCacheCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user label for the FlashCache")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * If true, all existing volumes that are mapped will have flash cache enabled
   **/
  public FlashCacheCreateRequest enableExistingVolumes(Boolean enableExistingVolumes) {
    this.enableExistingVolumes = enableExistingVolumes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, all existing volumes that are mapped will have flash cache enabled")
  @JsonProperty("enableExistingVolumes")
  public Boolean getEnableExistingVolumes() {
    return enableExistingVolumes;
  }
  
  public void setEnableExistingVolumes(Boolean enableExistingVolumes) {
    this.enableExistingVolumes = enableExistingVolumes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlashCacheCreateRequest flashCacheCreateRequest = (FlashCacheCreateRequest) o;
    return Objects.equals(this.driveRefs, flashCacheCreateRequest.driveRefs) &&
        Objects.equals(this.name, flashCacheCreateRequest.name) &&
        Objects.equals(this.enableExistingVolumes, flashCacheCreateRequest.enableExistingVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveRefs, name, enableExistingVolumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashCacheCreateRequest {\n");
    
    sb.append("    driveRefs: ").append(toIndentedString(driveRefs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enableExistingVolumes: ").append(toIndentedString(enableExistingVolumes)).append("\n");
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

