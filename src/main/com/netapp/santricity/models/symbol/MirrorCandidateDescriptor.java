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
 * MirrorCandidateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class MirrorCandidateDescriptor   {
  
    private String remoteNodeWWN;

    private String baseVolume;

    private ScsiNodeName remoteNodeName;

  
  /**
   * This field is deprecated. It will continue to be supported if remoteNodeName is NULL (IOInterfaceType == IO_IF_NOT_IMPLEMENTED). This will allow continued compatibility with clients still using this field.
   **/
  public MirrorCandidateDescriptor remoteNodeWWN(String remoteNodeWWN) {
    this.remoteNodeWWN = remoteNodeWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is deprecated. It will continue to be supported if remoteNodeName is NULL (IOInterfaceType == IO_IF_NOT_IMPLEMENTED). This will allow continued compatibility with clients still using this field.")
  @JsonProperty("remoteNodeWWN")
  public String getRemoteNodeWWN() {
    return remoteNodeWWN;
  }
  
  public void setRemoteNodeWWN(String remoteNodeWWN) {
    this.remoteNodeWWN = remoteNodeWWN;
  }

  
  /**
   * The local base volume - potential primary volume.
   **/
  public MirrorCandidateDescriptor baseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The local base volume - potential primary volume.")
  @JsonProperty("baseVolume")
  public String getBaseVolume() {
    return baseVolume;
  }
  
  public void setBaseVolume(String baseVolume) {
    this.baseVolume = baseVolume;
  }

  
  /**
   * The name of the RemoteVolume.
   **/
  public MirrorCandidateDescriptor remoteNodeName(ScsiNodeName remoteNodeName) {
    this.remoteNodeName = remoteNodeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the RemoteVolume.")
  @JsonProperty("remoteNodeName")
  public ScsiNodeName getRemoteNodeName() {
    return remoteNodeName;
  }
  
  public void setRemoteNodeName(ScsiNodeName remoteNodeName) {
    this.remoteNodeName = remoteNodeName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MirrorCandidateDescriptor mirrorCandidateDescriptor = (MirrorCandidateDescriptor) o;
    return Objects.equals(this.remoteNodeWWN, mirrorCandidateDescriptor.remoteNodeWWN) &&
        Objects.equals(this.baseVolume, mirrorCandidateDescriptor.baseVolume) &&
        Objects.equals(this.remoteNodeName, mirrorCandidateDescriptor.remoteNodeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteNodeWWN, baseVolume, remoteNodeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MirrorCandidateDescriptor {\n");
    
    sb.append("    remoteNodeWWN: ").append(toIndentedString(remoteNodeWWN)).append("\n");
    sb.append("    baseVolume: ").append(toIndentedString(baseVolume)).append("\n");
    sb.append("    remoteNodeName: ").append(toIndentedString(remoteNodeName)).append("\n");
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

