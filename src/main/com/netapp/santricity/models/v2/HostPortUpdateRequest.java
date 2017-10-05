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
 * Update a HostPort
 */
@ApiModel(description = "Update a HostPort")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class HostPortUpdateRequest   {
  
    private String portRef;

    private String hostRef;

    private String port;

    private String label;

    private String iscsiChapSecret;

  
  /**
   * The ref/id of the HostPort or Initiator
   **/
  public HostPortUpdateRequest portRef(String portRef) {
    this.portRef = portRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ref/id of the HostPort or Initiator")
  @JsonProperty("portRef")
  public String getPortRef() {
    return portRef;
  }
  
  public void setPortRef(String portRef) {
    this.portRef = portRef;
  }

  
  /**
   * The new owning host.
   **/
  public HostPortUpdateRequest hostRef(String hostRef) {
    this.hostRef = hostRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new owning host.")
  @JsonProperty("hostRef")
  public String getHostRef() {
    return hostRef;
  }
  
  public void setHostRef(String hostRef) {
    this.hostRef = hostRef;
  }

  
  /**
   * The host port identifier such as the iSCSI IQN or fibre channel WWN
   **/
  public HostPortUpdateRequest port(String port) {
    this.port = port;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The host port identifier such as the iSCSI IQN or fibre channel WWN")
  @JsonProperty("port")
  public String getPort() {
    return port;
  }
  
  public void setPort(String port) {
    this.port = port;
  }

  
  /**
   * The user-label for the host port
   **/
  public HostPortUpdateRequest label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user-label for the host port")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Required password if host-side CHAP is enabled
   **/
  public HostPortUpdateRequest iscsiChapSecret(String iscsiChapSecret) {
    this.iscsiChapSecret = iscsiChapSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required password if host-side CHAP is enabled")
  @JsonProperty("iscsiChapSecret")
  public String getIscsiChapSecret() {
    return iscsiChapSecret;
  }
  
  public void setIscsiChapSecret(String iscsiChapSecret) {
    this.iscsiChapSecret = iscsiChapSecret;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostPortUpdateRequest hostPortUpdateRequest = (HostPortUpdateRequest) o;
    return Objects.equals(this.portRef, hostPortUpdateRequest.portRef) &&
        Objects.equals(this.hostRef, hostPortUpdateRequest.hostRef) &&
        Objects.equals(this.port, hostPortUpdateRequest.port) &&
        Objects.equals(this.label, hostPortUpdateRequest.label) &&
        Objects.equals(this.iscsiChapSecret, hostPortUpdateRequest.iscsiChapSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portRef, hostRef, port, label, iscsiChapSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostPortUpdateRequest {\n");
    
    sb.append("    portRef: ").append(toIndentedString(portRef)).append("\n");
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    iscsiChapSecret: ").append(toIndentedString(iscsiChapSecret)).append("\n");
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

