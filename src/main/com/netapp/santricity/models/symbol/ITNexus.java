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
 * ITNexus
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ITNexus   {
  
    private SCSIInitiatorPortId initiatorPortId;

    private SCSITargetPortId targetPortId;

    private String hostLabel;

  
  /**
   * The TCP port of an iSCSI initiator.
   **/
  public ITNexus initiatorPortId(SCSIInitiatorPortId initiatorPortId) {
    this.initiatorPortId = initiatorPortId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The TCP port of an iSCSI initiator.")
  @JsonProperty("initiatorPortId")
  public SCSIInitiatorPortId getInitiatorPortId() {
    return initiatorPortId;
  }
  
  public void setInitiatorPortId(SCSIInitiatorPortId initiatorPortId) {
    this.initiatorPortId = initiatorPortId;
  }

  
  /**
   * The TCP port of an iSCSI target.
   **/
  public ITNexus targetPortId(SCSITargetPortId targetPortId) {
    this.targetPortId = targetPortId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The TCP port of an iSCSI target.")
  @JsonProperty("targetPortId")
  public SCSITargetPortId getTargetPortId() {
    return targetPortId;
  }
  
  public void setTargetPortId(SCSITargetPortId targetPortId) {
    this.targetPortId = targetPortId;
  }

  
  /**
   * The user label for a host port (iSCSI host initiator).
   **/
  public ITNexus hostLabel(String hostLabel) {
    this.hostLabel = hostLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user label for a host port (iSCSI host initiator).")
  @JsonProperty("hostLabel")
  public String getHostLabel() {
    return hostLabel;
  }
  
  public void setHostLabel(String hostLabel) {
    this.hostLabel = hostLabel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ITNexus iTNexus = (ITNexus) o;
    return Objects.equals(this.initiatorPortId, iTNexus.initiatorPortId) &&
        Objects.equals(this.targetPortId, iTNexus.targetPortId) &&
        Objects.equals(this.hostLabel, iTNexus.hostLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiatorPortId, targetPortId, hostLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ITNexus {\n");
    
    sb.append("    initiatorPortId: ").append(toIndentedString(initiatorPortId)).append("\n");
    sb.append("    targetPortId: ").append(toIndentedString(targetPortId)).append("\n");
    sb.append("    hostLabel: ").append(toIndentedString(hostLabel)).append("\n");
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

