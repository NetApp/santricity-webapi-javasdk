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
 * Used to update a folder
 */
@ApiModel(description = "Used to update a folder")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class FolderUpdateRequest   {
  
    private String parentId;

    private String name;

    private List<Rule> rules;

    private List<String> storageSystemIds;

  
  /**
   * Optional Parent folder Id for nested folders.
   **/
  public FolderUpdateRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional Parent folder Id for nested folders.")
  @JsonProperty("parentId")
  public String getParentId() {
    return parentId;
  }
  
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  
  /**
   * Name of the folder
   **/
  public FolderUpdateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the folder")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Optional List of rules used to define the folder.  These rules are ANDed together      Usually either rules OR a list of Ids are supplied.      <br>This must be a complete list
   **/
  public FolderUpdateRequest rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional List of rules used to define the folder.  These rules are ANDed together      Usually either rules OR a list of Ids are supplied.      <br>This must be a complete list")
  @JsonProperty("rules")
  public List<Rule> getRules() {
    return rules;
  }
  
  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }

  
  /**
   * Option list of storage system to include in the folder.  Usually either rules OR a list of Ids are supplied.      <br>This must be a complete list
   **/
  public FolderUpdateRequest storageSystemIds(List<String> storageSystemIds) {
    this.storageSystemIds = storageSystemIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Option list of storage system to include in the folder.  Usually either rules OR a list of Ids are supplied.      <br>This must be a complete list")
  @JsonProperty("storageSystemIds")
  public List<String> getStorageSystemIds() {
    return storageSystemIds;
  }
  
  public void setStorageSystemIds(List<String> storageSystemIds) {
    this.storageSystemIds = storageSystemIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderUpdateRequest folderUpdateRequest = (FolderUpdateRequest) o;
    return Objects.equals(this.parentId, folderUpdateRequest.parentId) &&
        Objects.equals(this.name, folderUpdateRequest.name) &&
        Objects.equals(this.rules, folderUpdateRequest.rules) &&
        Objects.equals(this.storageSystemIds, folderUpdateRequest.storageSystemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, name, rules, storageSystemIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderUpdateRequest {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    storageSystemIds: ").append(toIndentedString(storageSystemIds)).append("\n");
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

