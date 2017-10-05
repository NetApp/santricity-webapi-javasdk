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
 * HostBoard2PortIbTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class HostBoard2PortIbTypeData   {
  
    private String tcaGuid;

    private Integer queuePairsSupported;

    private Integer completionQueuesSupported;

    private Integer sharedReceiveQueuesSupported;

  
  /**
   * The globally unique identifier (GUID) assigned to the host board.
   **/
  public HostBoard2PortIbTypeData tcaGuid(String tcaGuid) {
    this.tcaGuid = tcaGuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier (GUID) assigned to the host board.")
  @JsonProperty("tcaGuid")
  public String getTcaGuid() {
    return tcaGuid;
  }
  
  public void setTcaGuid(String tcaGuid) {
    this.tcaGuid = tcaGuid;
  }

  
  /**
   * The number of queue pairs supported by the host board.
   **/
  public HostBoard2PortIbTypeData queuePairsSupported(Integer queuePairsSupported) {
    this.queuePairsSupported = queuePairsSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of queue pairs supported by the host board.")
  @JsonProperty("queuePairsSupported")
  public Integer getQueuePairsSupported() {
    return queuePairsSupported;
  }
  
  public void setQueuePairsSupported(Integer queuePairsSupported) {
    this.queuePairsSupported = queuePairsSupported;
  }

  
  /**
   * The number of completion queues supported by the host board.
   **/
  public HostBoard2PortIbTypeData completionQueuesSupported(Integer completionQueuesSupported) {
    this.completionQueuesSupported = completionQueuesSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of completion queues supported by the host board.")
  @JsonProperty("completionQueuesSupported")
  public Integer getCompletionQueuesSupported() {
    return completionQueuesSupported;
  }
  
  public void setCompletionQueuesSupported(Integer completionQueuesSupported) {
    this.completionQueuesSupported = completionQueuesSupported;
  }

  
  /**
   * The number of shared receive queues supported by the host board.
   **/
  public HostBoard2PortIbTypeData sharedReceiveQueuesSupported(Integer sharedReceiveQueuesSupported) {
    this.sharedReceiveQueuesSupported = sharedReceiveQueuesSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of shared receive queues supported by the host board.")
  @JsonProperty("sharedReceiveQueuesSupported")
  public Integer getSharedReceiveQueuesSupported() {
    return sharedReceiveQueuesSupported;
  }
  
  public void setSharedReceiveQueuesSupported(Integer sharedReceiveQueuesSupported) {
    this.sharedReceiveQueuesSupported = sharedReceiveQueuesSupported;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostBoard2PortIbTypeData hostBoard2PortIbTypeData = (HostBoard2PortIbTypeData) o;
    return Objects.equals(this.tcaGuid, hostBoard2PortIbTypeData.tcaGuid) &&
        Objects.equals(this.queuePairsSupported, hostBoard2PortIbTypeData.queuePairsSupported) &&
        Objects.equals(this.completionQueuesSupported, hostBoard2PortIbTypeData.completionQueuesSupported) &&
        Objects.equals(this.sharedReceiveQueuesSupported, hostBoard2PortIbTypeData.sharedReceiveQueuesSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcaGuid, queuePairsSupported, completionQueuesSupported, sharedReceiveQueuesSupported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostBoard2PortIbTypeData {\n");
    
    sb.append("    tcaGuid: ").append(toIndentedString(tcaGuid)).append("\n");
    sb.append("    queuePairsSupported: ").append(toIndentedString(queuePairsSupported)).append("\n");
    sb.append("    completionQueuesSupported: ").append(toIndentedString(completionQueuesSupported)).append("\n");
    sb.append("    sharedReceiveQueuesSupported: ").append(toIndentedString(sharedReceiveQueuesSupported)).append("\n");
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

