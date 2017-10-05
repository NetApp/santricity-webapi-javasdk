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
 * GroupMapping
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class GroupMapping   {
  
    private String groupRegex;

    private Boolean ignorecase;


  /**
   * Specifies the role of the group
   */
  public enum NameEnum {
    security_admin("security_admin"),
    storage_none("storage_none"),
    support_admin("support_admin"),
    storage_monitor("storage_monitor"),
    storage_admin("storage_admin");
;
    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private NameEnum name;

  
  /**
   * specifies the DN of the group. The wildcard .* can optionally be used to allow specifying only a partial DN.
   **/
  public GroupMapping groupRegex(String groupRegex) {
    this.groupRegex = groupRegex;
    return this;
  }
  
  @ApiModelProperty(example = ".*cn=data-admin.*", value = "specifies the DN of the group. The wildcard .* can optionally be used to allow specifying only a partial DN.")
  @JsonProperty("groupRegex")
  public String getGroupRegex() {
    return groupRegex;
  }
  
  public void setGroupRegex(String groupRegex) {
    this.groupRegex = groupRegex;
  }

  
  /**
   * Whether or not to ignore case for the group mappings
   **/
  public GroupMapping ignorecase(Boolean ignorecase) {
    this.ignorecase = ignorecase;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Whether or not to ignore case for the group mappings")
  @JsonProperty("ignorecase")
  public Boolean getIgnorecase() {
    return ignorecase;
  }
  
  public void setIgnorecase(Boolean ignorecase) {
    this.ignorecase = ignorecase;
  }

  
  /**
   * Specifies the role of the group
   **/
  public GroupMapping name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "storage.monitor", required = true, value = "Specifies the role of the group")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  
  public void setName(NameEnum name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMapping groupMapping = (GroupMapping) o;
    return Objects.equals(this.groupRegex, groupMapping.groupRegex) &&
        Objects.equals(this.ignorecase, groupMapping.ignorecase) &&
        Objects.equals(this.name, groupMapping.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRegex, ignorecase, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMapping {\n");
    
    sb.append("    groupRegex: ").append(toIndentedString(groupRegex)).append("\n");
    sb.append("    ignorecase: ").append(toIndentedString(ignorecase)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

