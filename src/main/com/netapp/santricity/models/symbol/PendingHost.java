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
 * PendingHost
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PendingHost   {
  
    private String hostLabel;

    private String hostType;

    private List<SCSIInitiatorPortId> hostPortId;

  
  /**
   * The official node name of the host to which the pending topology host port belongs.
   **/
  public PendingHost hostLabel(String hostLabel) {
    this.hostLabel = hostLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The official node name of the host to which the pending topology host port belongs.")
  @JsonProperty("hostLabel")
  public String getHostLabel() {
    return hostLabel;
  }
  
  public void setHostLabel(String hostLabel) {
    this.hostLabel = hostLabel;
  }

  
  /**
   * A string representing the host type of the pending topology host port. The contents of this field is the \"short form\" of the host type label used in the controller firmware.
   **/
  public PendingHost hostType(String hostType) {
    this.hostType = hostType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A string representing the host type of the pending topology host port. The contents of this field is the \"short form\" of the host type label used in the controller firmware.")
  @JsonProperty("hostType")
  public String getHostType() {
    return hostType;
  }
  
  public void setHostType(String hostType) {
    this.hostType = hostType;
  }

  
  /**
   * This field is a variable-length list of SCSIInitiatorPortId objects representing the ports associated with the host.
   **/
  public PendingHost hostPortId(List<SCSIInitiatorPortId> hostPortId) {
    this.hostPortId = hostPortId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is a variable-length list of SCSIInitiatorPortId objects representing the ports associated with the host.")
  @JsonProperty("hostPortId")
  public List<SCSIInitiatorPortId> getHostPortId() {
    return hostPortId;
  }
  
  public void setHostPortId(List<SCSIInitiatorPortId> hostPortId) {
    this.hostPortId = hostPortId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingHost pendingHost = (PendingHost) o;
    return Objects.equals(this.hostLabel, pendingHost.hostLabel) &&
        Objects.equals(this.hostType, pendingHost.hostType) &&
        Objects.equals(this.hostPortId, pendingHost.hostPortId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostLabel, hostType, hostPortId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingHost {\n");
    
    sb.append("    hostLabel: ").append(toIndentedString(hostLabel)).append("\n");
    sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
    sb.append("    hostPortId: ").append(toIndentedString(hostPortId)).append("\n");
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

