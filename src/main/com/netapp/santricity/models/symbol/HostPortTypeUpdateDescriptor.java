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
 * HostPortTypeUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class HostPortTypeUpdateDescriptor   {
  
    private String hostPortRef;

    private Integer hostPortTypeIndex;

  
  /**
   * The unique identification value that identifies the HostPort to be modified.
   **/
  public HostPortTypeUpdateDescriptor hostPortRef(String hostPortRef) {
    this.hostPortRef = hostPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value that identifies the HostPort to be modified.")
  @JsonProperty("hostPortRef")
  public String getHostPortRef() {
    return hostPortRef;
  }
  
  public void setHostPortRef(String hostPortRef) {
    this.hostPortRef = hostPortRef;
  }

  
  /**
   * The new index value that is to be used to identify the type of the HostPort object.
   **/
  public HostPortTypeUpdateDescriptor hostPortTypeIndex(Integer hostPortTypeIndex) {
    this.hostPortTypeIndex = hostPortTypeIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new index value that is to be used to identify the type of the HostPort object.")
  @JsonProperty("hostPortTypeIndex")
  public Integer getHostPortTypeIndex() {
    return hostPortTypeIndex;
  }
  
  public void setHostPortTypeIndex(Integer hostPortTypeIndex) {
    this.hostPortTypeIndex = hostPortTypeIndex;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostPortTypeUpdateDescriptor hostPortTypeUpdateDescriptor = (HostPortTypeUpdateDescriptor) o;
    return Objects.equals(this.hostPortRef, hostPortTypeUpdateDescriptor.hostPortRef) &&
        Objects.equals(this.hostPortTypeIndex, hostPortTypeUpdateDescriptor.hostPortTypeIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostPortRef, hostPortTypeIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostPortTypeUpdateDescriptor {\n");
    
    sb.append("    hostPortRef: ").append(toIndentedString(hostPortRef)).append("\n");
    sb.append("    hostPortTypeIndex: ").append(toIndentedString(hostPortTypeIndex)).append("\n");
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

