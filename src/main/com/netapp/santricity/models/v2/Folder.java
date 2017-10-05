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
 * Folder used to represent storage system hierarchy.
 */
@ApiModel(description = "Folder used to represent storage system hierarchy.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class Folder   {
  
    private String folderId;

    private String parentFolderId;

    private String name;

    private Boolean reserved;

    private List<Rule> rules;

    private List<String> storageSystemIds;

  
  /**
   **/
  public Folder folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("folderId")
  public String getFolderId() {
    return folderId;
  }
  
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  
  /**
   **/
  public Folder parentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("parentFolderId")
  public String getParentFolderId() {
    return parentFolderId;
  }
  
  public void setParentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  
  /**
   **/
  public Folder name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Folder reserved(Boolean reserved) {
    this.reserved = reserved;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("reserved")
  public Boolean getReserved() {
    return reserved;
  }
  
  public void setReserved(Boolean reserved) {
    this.reserved = reserved;
  }

  
  /**
   * Rules for dynamic folders
   **/
  public Folder rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Rules for dynamic folders")
  @JsonProperty("rules")
  public List<Rule> getRules() {
    return rules;
  }
  
  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }

  
  /**
   * List of arrays for non-dynamic folders
   **/
  public Folder storageSystemIds(List<String> storageSystemIds) {
    this.storageSystemIds = storageSystemIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of arrays for non-dynamic folders")
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
    Folder folder = (Folder) o;
    return Objects.equals(this.folderId, folder.folderId) &&
        Objects.equals(this.parentFolderId, folder.parentFolderId) &&
        Objects.equals(this.name, folder.name) &&
        Objects.equals(this.reserved, folder.reserved) &&
        Objects.equals(this.rules, folder.rules) &&
        Objects.equals(this.storageSystemIds, folder.storageSystemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folderId, parentFolderId, name, reserved, rules, storageSystemIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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

