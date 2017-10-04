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
 * DCBXSummaryData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DCBXSummaryData   {
  

  /**
   * This enumeration contains the known Ethernet Protocol types currently negotiated via DCBX.
   */
  public enum ProtocolTypeEnum {
    unk("unk"),
    fcoe("fcoe"),
    fip("fip"),
    iscsi("iscsi"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ProtocolTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ProtocolTypeEnum protocolType;

    private Integer priority;

    private Integer priorityGroupId;

    private Integer linkBandwidthPercentage;

    private Boolean enabled;

  
  /**
   * This enumeration contains the known Ethernet Protocol types currently negotiated via DCBX.
   **/
  public DCBXSummaryData protocolType(ProtocolTypeEnum protocolType) {
    this.protocolType = protocolType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration contains the known Ethernet Protocol types currently negotiated via DCBX.")
  @JsonProperty("protocolType")
  public ProtocolTypeEnum getProtocolType() {
    return protocolType;
  }
  
  public void setProtocolType(ProtocolTypeEnum protocolType) {
    this.protocolType = protocolType;
  }

  
  /**
   * This object contains a priority number (0 - TLV_MAX_PROTOCOL_ENTRIES) assigned to the given protocol type.
   **/
  public DCBXSummaryData priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This object contains a priority number (0 - TLV_MAX_PROTOCOL_ENTRIES) assigned to the given protocol type.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * This object contains a priority group ID assigned to the given priority number.
   **/
  public DCBXSummaryData priorityGroupId(Integer priorityGroupId) {
    this.priorityGroupId = priorityGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This object contains a priority group ID assigned to the given priority number.")
  @JsonProperty("priorityGroupId")
  public Integer getPriorityGroupId() {
    return priorityGroupId;
  }
  
  public void setPriorityGroupId(Integer priorityGroupId) {
    this.priorityGroupId = priorityGroupId;
  }

  
  /**
   * This object contains the percentage of the link band-width assigned to the given priority group ID.
   **/
  public DCBXSummaryData linkBandwidthPercentage(Integer linkBandwidthPercentage) {
    this.linkBandwidthPercentage = linkBandwidthPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This object contains the percentage of the link band-width assigned to the given priority group ID.")
  @JsonProperty("linkBandwidthPercentage")
  public Integer getLinkBandwidthPercentage() {
    return linkBandwidthPercentage;
  }
  
  public void setLinkBandwidthPercentage(Integer linkBandwidthPercentage) {
    this.linkBandwidthPercentage = linkBandwidthPercentage;
  }

  
  /**
   * This is the status of the given priority number.
   **/
  public DCBXSummaryData enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the status of the given priority number.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DCBXSummaryData dCBXSummaryData = (DCBXSummaryData) o;
    return Objects.equals(this.protocolType, dCBXSummaryData.protocolType) &&
        Objects.equals(this.priority, dCBXSummaryData.priority) &&
        Objects.equals(this.priorityGroupId, dCBXSummaryData.priorityGroupId) &&
        Objects.equals(this.linkBandwidthPercentage, dCBXSummaryData.linkBandwidthPercentage) &&
        Objects.equals(this.enabled, dCBXSummaryData.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocolType, priority, priorityGroupId, linkBandwidthPercentage, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DCBXSummaryData {\n");
    
    sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityGroupId: ").append(toIndentedString(priorityGroupId)).append("\n");
    sb.append("    linkBandwidthPercentage: ").append(toIndentedString(linkBandwidthPercentage)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

