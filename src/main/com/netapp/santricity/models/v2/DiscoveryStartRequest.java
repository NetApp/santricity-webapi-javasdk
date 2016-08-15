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
 * Used to to start a storage system discover cycle
 */
@ApiModel(description = "Used to to start a storage system discover cycle")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DiscoveryStartRequest   {
  
    private String startIP;

    private String endIP;

    private Boolean useAgents;

    private Integer connectionTimeout;

    private Integer maxPortsToUse;

  
  /**
   * Starting IP address
   **/
  public DiscoveryStartRequest startIP(String startIP) {
    this.startIP = startIP;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Starting IP address")
  @JsonProperty("startIP")
  public String getStartIP() {
    return startIP;
  }
  
  public void setStartIP(String startIP) {
    this.startIP = startIP;
  }

  
  /**
   * Ending IP Address
   **/
  public DiscoveryStartRequest endIP(String endIP) {
    this.endIP = endIP;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Ending IP Address")
  @JsonProperty("endIP")
  public String getEndIP() {
    return endIP;
  }
  
  public void setEndIP(String endIP) {
    this.endIP = endIP;
  }

  
  /**
   * In-band management agents will be queried if this value is true.      If you are not sure, its best to leave this as default
   **/
  public DiscoveryStartRequest useAgents(Boolean useAgents) {
    this.useAgents = useAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "In-band management agents will be queried if this value is true.      If you are not sure, its best to leave this as default")
  @JsonProperty("useAgents")
  public Boolean getUseAgents() {
    return useAgents;
  }
  
  public void setUseAgents(Boolean useAgents) {
    this.useAgents = useAgents;
  }

  
  /**
   * Optional parameter.  This defaults to 30 seconds.  Longer times may be needed for      WAN discoveries, but will slow down the whole process.  Shorter times speed up the process.      This is only the timeout value for the initial TCP connection
   **/
  public DiscoveryStartRequest connectionTimeout(Integer connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional parameter.  This defaults to 30 seconds.  Longer times may be needed for      WAN discoveries, but will slow down the whole process.  Shorter times speed up the process.      This is only the timeout value for the initial TCP connection")
  @JsonProperty("connectionTimeout")
  public Integer getConnectionTimeout() {
    return connectionTimeout;
  }
  
  public void setConnectionTimeout(Integer connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  
  /**
   * Number of ports to use for discovery.  A port is a file handler in most operating systems.      Watch your ULimits.  More ports the faster discovery goes. But, for example, windows only has a      few thousand available ports.  If file handlers are exceeded, then this process will adjust down but      other processes on the server may be affected as well as client connections
   **/
  public DiscoveryStartRequest maxPortsToUse(Integer maxPortsToUse) {
    this.maxPortsToUse = maxPortsToUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of ports to use for discovery.  A port is a file handler in most operating systems.      Watch your ULimits.  More ports the faster discovery goes. But, for example, windows only has a      few thousand available ports.  If file handlers are exceeded, then this process will adjust down but      other processes on the server may be affected as well as client connections")
  @JsonProperty("maxPortsToUse")
  public Integer getMaxPortsToUse() {
    return maxPortsToUse;
  }
  
  public void setMaxPortsToUse(Integer maxPortsToUse) {
    this.maxPortsToUse = maxPortsToUse;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveryStartRequest discoveryStartRequest = (DiscoveryStartRequest) o;
    return Objects.equals(this.startIP, discoveryStartRequest.startIP) &&
        Objects.equals(this.endIP, discoveryStartRequest.endIP) &&
        Objects.equals(this.useAgents, discoveryStartRequest.useAgents) &&
        Objects.equals(this.connectionTimeout, discoveryStartRequest.connectionTimeout) &&
        Objects.equals(this.maxPortsToUse, discoveryStartRequest.maxPortsToUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startIP, endIP, useAgents, connectionTimeout, maxPortsToUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryStartRequest {\n");
    
    sb.append("    startIP: ").append(toIndentedString(startIP)).append("\n");
    sb.append("    endIP: ").append(toIndentedString(endIP)).append("\n");
    sb.append("    useAgents: ").append(toIndentedString(useAgents)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("    maxPortsToUse: ").append(toIndentedString(maxPortsToUse)).append("\n");
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

