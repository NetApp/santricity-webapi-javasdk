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
 * AsupRegistrationRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class AsupRegistrationRequest   {
  
    private List<AsupEntry> entries;

    private String id;

    private String modelName;

    private String subjectName;

  
  /**
   * The bundle entries
   **/
  public AsupRegistrationRequest entries(List<AsupEntry> entries) {
    this.entries = entries;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The bundle entries")
  @JsonProperty("entries")
  public List<AsupEntry> getEntries() {
    return entries;
  }
  
  public void setEntries(List<AsupEntry> entries) {
    this.entries = entries;
  }

  
  /**
   * Id of bundle to be registered
   **/
  public AsupRegistrationRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of bundle to be registered")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Model name of bundle to be registered
   **/
  public AsupRegistrationRequest modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Model name of bundle to be registered")
  @JsonProperty("modelName")
  public String getModelName() {
    return modelName;
  }
  
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  
  /**
   * Subject name of bundle to be registered
   **/
  public AsupRegistrationRequest subjectName(String subjectName) {
    this.subjectName = subjectName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Subject name of bundle to be registered")
  @JsonProperty("subjectName")
  public String getSubjectName() {
    return subjectName;
  }
  
  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsupRegistrationRequest asupRegistrationRequest = (AsupRegistrationRequest) o;
    return Objects.equals(this.entries, asupRegistrationRequest.entries) &&
        Objects.equals(this.id, asupRegistrationRequest.id) &&
        Objects.equals(this.modelName, asupRegistrationRequest.modelName) &&
        Objects.equals(this.subjectName, asupRegistrationRequest.subjectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, id, modelName, subjectName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsupRegistrationRequest {\n");
    
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
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

