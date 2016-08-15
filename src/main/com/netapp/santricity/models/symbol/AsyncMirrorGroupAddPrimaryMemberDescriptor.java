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
 * AsyncMirrorGroupAddPrimaryMemberDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AsyncMirrorGroupAddPrimaryMemberDescriptor   {
  
    private String groupRef;

    private String localVolume;

    private RemoteArrayAuthenticator remotePassword;

    private ConcatVolumeCreationDescriptor repositoryCandidate;

  
  /**
   * The AMG to which the member will be added.
   **/
  public AsyncMirrorGroupAddPrimaryMemberDescriptor groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The AMG to which the member will be added.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * The member local volume to add to the AMG.
   **/
  public AsyncMirrorGroupAddPrimaryMemberDescriptor localVolume(String localVolume) {
    this.localVolume = localVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The member local volume to add to the AMG.")
  @JsonProperty("localVolume")
  public String getLocalVolume() {
    return localVolume;
  }
  
  public void setLocalVolume(String localVolume) {
    this.localVolume = localVolume;
  }

  
  /**
   * The password for remote array. This is required to make sure the SYMbol client has authenticated the users access privileges to both the primary and secondary array.
   **/
  public AsyncMirrorGroupAddPrimaryMemberDescriptor remotePassword(RemoteArrayAuthenticator remotePassword) {
    this.remotePassword = remotePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The password for remote array. This is required to make sure the SYMbol client has authenticated the users access privileges to both the primary and secondary array.")
  @JsonProperty("remotePassword")
  public RemoteArrayAuthenticator getRemotePassword() {
    return remotePassword;
  }
  
  public void setRemotePassword(RemoteArrayAuthenticator remotePassword) {
    this.remotePassword = remotePassword;
  }

  
  /**
   * The repository volume candidate for the mirror repository on the primary array.
   **/
  public AsyncMirrorGroupAddPrimaryMemberDescriptor repositoryCandidate(ConcatVolumeCreationDescriptor repositoryCandidate) {
    this.repositoryCandidate = repositoryCandidate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository volume candidate for the mirror repository on the primary array.")
  @JsonProperty("repositoryCandidate")
  public ConcatVolumeCreationDescriptor getRepositoryCandidate() {
    return repositoryCandidate;
  }
  
  public void setRepositoryCandidate(ConcatVolumeCreationDescriptor repositoryCandidate) {
    this.repositoryCandidate = repositoryCandidate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupAddPrimaryMemberDescriptor asyncMirrorGroupAddPrimaryMemberDescriptor = (AsyncMirrorGroupAddPrimaryMemberDescriptor) o;
    return Objects.equals(this.groupRef, asyncMirrorGroupAddPrimaryMemberDescriptor.groupRef) &&
        Objects.equals(this.localVolume, asyncMirrorGroupAddPrimaryMemberDescriptor.localVolume) &&
        Objects.equals(this.remotePassword, asyncMirrorGroupAddPrimaryMemberDescriptor.remotePassword) &&
        Objects.equals(this.repositoryCandidate, asyncMirrorGroupAddPrimaryMemberDescriptor.repositoryCandidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRef, localVolume, remotePassword, repositoryCandidate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupAddPrimaryMemberDescriptor {\n");
    
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    localVolume: ").append(toIndentedString(localVolume)).append("\n");
    sb.append("    remotePassword: ").append(toIndentedString(remotePassword)).append("\n");
    sb.append("    repositoryCandidate: ").append(toIndentedString(repositoryCandidate)).append("\n");
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

