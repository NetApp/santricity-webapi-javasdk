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
 * AsyncMirrorGroupMemberMismatchList
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class AsyncMirrorGroupMemberMismatchList   {
  
    private String groupRef;

    private List<String> membersLocalButNotRemote;

    private List<String> membersRemoteButNotLocal;

  
  /**
   * The Async Mirror Group.
   **/
  public AsyncMirrorGroupMemberMismatchList groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Async Mirror Group.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * A list of base volume labels for members that are present on the local array but not on the remote.
   **/
  public AsyncMirrorGroupMemberMismatchList membersLocalButNotRemote(List<String> membersLocalButNotRemote) {
    this.membersLocalButNotRemote = membersLocalButNotRemote;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of base volume labels for members that are present on the local array but not on the remote.")
  @JsonProperty("membersLocalButNotRemote")
  public List<String> getMembersLocalButNotRemote() {
    return membersLocalButNotRemote;
  }
  
  public void setMembersLocalButNotRemote(List<String> membersLocalButNotRemote) {
    this.membersLocalButNotRemote = membersLocalButNotRemote;
  }

  
  /**
   * A list of base volume labels for members that are present on the remote array but not on the local.
   **/
  public AsyncMirrorGroupMemberMismatchList membersRemoteButNotLocal(List<String> membersRemoteButNotLocal) {
    this.membersRemoteButNotLocal = membersRemoteButNotLocal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of base volume labels for members that are present on the remote array but not on the local.")
  @JsonProperty("membersRemoteButNotLocal")
  public List<String> getMembersRemoteButNotLocal() {
    return membersRemoteButNotLocal;
  }
  
  public void setMembersRemoteButNotLocal(List<String> membersRemoteButNotLocal) {
    this.membersRemoteButNotLocal = membersRemoteButNotLocal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupMemberMismatchList asyncMirrorGroupMemberMismatchList = (AsyncMirrorGroupMemberMismatchList) o;
    return Objects.equals(this.groupRef, asyncMirrorGroupMemberMismatchList.groupRef) &&
        Objects.equals(this.membersLocalButNotRemote, asyncMirrorGroupMemberMismatchList.membersLocalButNotRemote) &&
        Objects.equals(this.membersRemoteButNotLocal, asyncMirrorGroupMemberMismatchList.membersRemoteButNotLocal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRef, membersLocalButNotRemote, membersRemoteButNotLocal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupMemberMismatchList {\n");
    
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    membersLocalButNotRemote: ").append(toIndentedString(membersLocalButNotRemote)).append("\n");
    sb.append("    membersRemoteButNotLocal: ").append(toIndentedString(membersRemoteButNotLocal)).append("\n");
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

