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
 * TargetPortal
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class TargetPortal   {
  
    private Integer groupTag;

    private IpVxAddress ipAddress;

    private Integer tcpListenPort;

  
  /**
   * A value identifying the portal group to which this portal belongs.
   **/
  public TargetPortal groupTag(Integer groupTag) {
    this.groupTag = groupTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A value identifying the portal group to which this portal belongs.")
  @JsonProperty("groupTag")
  public Integer getGroupTag() {
    return groupTag;
  }
  
  public void setGroupTag(Integer groupTag) {
    this.groupTag = groupTag;
  }

  
  /**
   * The IP address of the portal.
   **/
  public TargetPortal ipAddress(IpVxAddress ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IP address of the portal.")
  @JsonProperty("ipAddress")
  public IpVxAddress getIpAddress() {
    return ipAddress;
  }
  
  public void setIpAddress(IpVxAddress ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   * The number of the TCP port on which the target listens for incoming connections.
   **/
  public TargetPortal tcpListenPort(Integer tcpListenPort) {
    this.tcpListenPort = tcpListenPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the TCP port on which the target listens for incoming connections.")
  @JsonProperty("tcpListenPort")
  public Integer getTcpListenPort() {
    return tcpListenPort;
  }
  
  public void setTcpListenPort(Integer tcpListenPort) {
    this.tcpListenPort = tcpListenPort;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetPortal targetPortal = (TargetPortal) o;
    return Objects.equals(this.groupTag, targetPortal.groupTag) &&
        Objects.equals(this.ipAddress, targetPortal.ipAddress) &&
        Objects.equals(this.tcpListenPort, targetPortal.tcpListenPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupTag, ipAddress, tcpListenPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetPortal {\n");
    
    sb.append("    groupTag: ").append(toIndentedString(groupTag)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    tcpListenPort: ").append(toIndentedString(tcpListenPort)).append("\n");
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

