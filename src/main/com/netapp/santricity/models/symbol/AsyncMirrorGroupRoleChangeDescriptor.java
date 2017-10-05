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
 * AsyncMirrorGroupRoleChangeDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class AsyncMirrorGroupRoleChangeDescriptor   {
  
    private String groupRef;

    private Boolean force;


  /**
   * The role for the local AMG.
   */
  public enum ToRoleEnum {
    unknown("unknown"),
    primary("primary"),
    secondary("secondary"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ToRoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ToRoleEnum toRole;

    private Boolean noSync;

  
  /**
   * The reference of the AMG on which the change is to be made.
   **/
  public AsyncMirrorGroupRoleChangeDescriptor groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference of the AMG on which the change is to be made.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * Force flag. If true, ignore if the remote array role change fails.
   **/
  public AsyncMirrorGroupRoleChangeDescriptor force(Boolean force) {
    this.force = force;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Force flag. If true, ignore if the remote array role change fails.")
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }
  
  public void setForce(Boolean force) {
    this.force = force;
  }

  
  /**
   * The role for the local AMG.
   **/
  public AsyncMirrorGroupRoleChangeDescriptor toRole(ToRoleEnum toRole) {
    this.toRole = toRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The role for the local AMG.")
  @JsonProperty("toRole")
  public ToRoleEnum getToRole() {
    return toRole;
  }
  
  public void setToRole(ToRoleEnum toRole) {
    this.toRole = toRole;
  }

  
  /**
   * If true, changed data will not be synchronized before completing the role change. This will revert secondary (new primary) content to last recovery point.
   **/
  public AsyncMirrorGroupRoleChangeDescriptor noSync(Boolean noSync) {
    this.noSync = noSync;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, changed data will not be synchronized before completing the role change. This will revert secondary (new primary) content to last recovery point.")
  @JsonProperty("noSync")
  public Boolean getNoSync() {
    return noSync;
  }
  
  public void setNoSync(Boolean noSync) {
    this.noSync = noSync;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupRoleChangeDescriptor asyncMirrorGroupRoleChangeDescriptor = (AsyncMirrorGroupRoleChangeDescriptor) o;
    return Objects.equals(this.groupRef, asyncMirrorGroupRoleChangeDescriptor.groupRef) &&
        Objects.equals(this.force, asyncMirrorGroupRoleChangeDescriptor.force) &&
        Objects.equals(this.toRole, asyncMirrorGroupRoleChangeDescriptor.toRole) &&
        Objects.equals(this.noSync, asyncMirrorGroupRoleChangeDescriptor.noSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRef, force, toRole, noSync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupRoleChangeDescriptor {\n");
    
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    toRole: ").append(toIndentedString(toRole)).append("\n");
    sb.append("    noSync: ").append(toIndentedString(noSync)).append("\n");
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

