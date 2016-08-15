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
 * RemoteArray
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RemoteArray   {
  
    private String remoteArrayRef;

    private SAIdentifier saId;

    private List<String> remoteTargets;

  
  /**
   * A unique identifier for this RemoteArray object.
   **/
  public RemoteArray remoteArrayRef(String remoteArrayRef) {
    this.remoteArrayRef = remoteArrayRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique identifier for this RemoteArray object.")
  @JsonProperty("remoteArrayRef")
  public String getRemoteArrayRef() {
    return remoteArrayRef;
  }
  
  public void setRemoteArrayRef(String remoteArrayRef) {
    this.remoteArrayRef = remoteArrayRef;
  }

  
  /**
   * The storage array ID of the remote array.
   **/
  public RemoteArray saId(SAIdentifier saId) {
    this.saId = saId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The storage array ID of the remote array.")
  @JsonProperty("saId")
  public SAIdentifier getSaId() {
    return saId;
  }
  
  public void setSaId(SAIdentifier saId) {
    this.saId = saId;
  }

  
  /**
   * One or more paths to the remote array. Note these could be differing protocols.
   **/
  public RemoteArray remoteTargets(List<String> remoteTargets) {
    this.remoteTargets = remoteTargets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "One or more paths to the remote array. Note these could be differing protocols.")
  @JsonProperty("remoteTargets")
  public List<String> getRemoteTargets() {
    return remoteTargets;
  }
  
  public void setRemoteTargets(List<String> remoteTargets) {
    this.remoteTargets = remoteTargets;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteArray remoteArray = (RemoteArray) o;
    return Objects.equals(this.remoteArrayRef, remoteArray.remoteArrayRef) &&
        Objects.equals(this.saId, remoteArray.saId) &&
        Objects.equals(this.remoteTargets, remoteArray.remoteTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteArrayRef, saId, remoteTargets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteArray {\n");
    
    sb.append("    remoteArrayRef: ").append(toIndentedString(remoteArrayRef)).append("\n");
    sb.append("    saId: ").append(toIndentedString(saId)).append("\n");
    sb.append("    remoteTargets: ").append(toIndentedString(remoteTargets)).append("\n");
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

