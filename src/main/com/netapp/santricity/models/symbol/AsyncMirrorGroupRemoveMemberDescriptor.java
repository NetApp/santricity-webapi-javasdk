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
 * AsyncMirrorGroupRemoveMemberDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AsyncMirrorGroupRemoveMemberDescriptor   {
  
    private String groupRef;

    private String memberRef;

    private Boolean retainRepositoryMembers;

    private Boolean force;

  
  /**
   * The AMG from which the member is to be removed.
   **/
  public AsyncMirrorGroupRemoveMemberDescriptor groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The AMG from which the member is to be removed.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * The member to remove (must be a member of the mirror group specified above).
   **/
  public AsyncMirrorGroupRemoveMemberDescriptor memberRef(String memberRef) {
    this.memberRef = memberRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The member to remove (must be a member of the mirror group specified above).")
  @JsonProperty("memberRef")
  public String getMemberRef() {
    return memberRef;
  }
  
  public void setMemberRef(String memberRef) {
    this.memberRef = memberRef;
  }

  
  /**
   * If true, the REPOSITORY member volumes should be retained. If false, they will be deleted.
   **/
  public AsyncMirrorGroupRemoveMemberDescriptor retainRepositoryMembers(Boolean retainRepositoryMembers) {
    this.retainRepositoryMembers = retainRepositoryMembers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the REPOSITORY member volumes should be retained. If false, they will be deleted.")
  @JsonProperty("retainRepositoryMembers")
  public Boolean getRetainRepositoryMembers() {
    return retainRepositoryMembers;
  }
  
  public void setRetainRepositoryMembers(Boolean retainRepositoryMembers) {
    this.retainRepositoryMembers = retainRepositoryMembers;
  }

  
  /**
   * If true, the member removal should be forced. This is necessary when trying to remove an orphaned member or remove a member when the remote is unreachable (for example, when the remote array was physically destroyed so member deletion needs to be forced to allow for AMG deletion.
   **/
  public AsyncMirrorGroupRemoveMemberDescriptor force(Boolean force) {
    this.force = force;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the member removal should be forced. This is necessary when trying to remove an orphaned member or remove a member when the remote is unreachable (for example, when the remote array was physically destroyed so member deletion needs to be forced to allow for AMG deletion.")
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }
  
  public void setForce(Boolean force) {
    this.force = force;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupRemoveMemberDescriptor asyncMirrorGroupRemoveMemberDescriptor = (AsyncMirrorGroupRemoveMemberDescriptor) o;
    return Objects.equals(this.groupRef, asyncMirrorGroupRemoveMemberDescriptor.groupRef) &&
        Objects.equals(this.memberRef, asyncMirrorGroupRemoveMemberDescriptor.memberRef) &&
        Objects.equals(this.retainRepositoryMembers, asyncMirrorGroupRemoveMemberDescriptor.retainRepositoryMembers) &&
        Objects.equals(this.force, asyncMirrorGroupRemoveMemberDescriptor.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRef, memberRef, retainRepositoryMembers, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupRemoveMemberDescriptor {\n");
    
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    memberRef: ").append(toIndentedString(memberRef)).append("\n");
    sb.append("    retainRepositoryMembers: ").append(toIndentedString(retainRepositoryMembers)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

