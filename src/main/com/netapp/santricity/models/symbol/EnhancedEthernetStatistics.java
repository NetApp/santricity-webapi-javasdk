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
 * EnhancedEthernetStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class EnhancedEthernetStatistics   {
  
    private List<String> interfaces;


  /**
   * This is the port/interface priority-based flow control state
   */
  public enum EnhancedEthernetFlowControlStatusEnum {
    unk("unk"),
    disabled("disabled"),
    standard("standard"),
    perPriority("perPriority"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    EnhancedEthernetFlowControlStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private EnhancedEthernetFlowControlStatusEnum enhancedEthernetFlowControlStatus;

    private EnhEthFeaturesState enhEthFeaturesState;

    private EnhEthTLVSet localTLVs;

    private EnhEthTLVSet operationalTLVs;

    private EnhEthTLVSet remoteTLVs;

  
  /**
   * This is the Interface(s) to which the Enhanced Ethernet Statistics apply. Even though this is shown as an array, it will only be a single instance.
   **/
  public EnhancedEthernetStatistics interfaces(List<String> interfaces) {
    this.interfaces = interfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the Interface(s) to which the Enhanced Ethernet Statistics apply. Even though this is shown as an array, it will only be a single instance.")
  @JsonProperty("interfaces")
  public List<String> getInterfaces() {
    return interfaces;
  }
  
  public void setInterfaces(List<String> interfaces) {
    this.interfaces = interfaces;
  }

  
  /**
   * This is the port/interface priority-based flow control state
   **/
  public EnhancedEthernetStatistics enhancedEthernetFlowControlStatus(EnhancedEthernetFlowControlStatusEnum enhancedEthernetFlowControlStatus) {
    this.enhancedEthernetFlowControlStatus = enhancedEthernetFlowControlStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the port/interface priority-based flow control state")
  @JsonProperty("enhancedEthernetFlowControlStatus")
  public EnhancedEthernetFlowControlStatusEnum getEnhancedEthernetFlowControlStatus() {
    return enhancedEthernetFlowControlStatus;
  }
  
  public void setEnhancedEthernetFlowControlStatus(EnhancedEthernetFlowControlStatusEnum enhancedEthernetFlowControlStatus) {
    this.enhancedEthernetFlowControlStatus = enhancedEthernetFlowControlStatus;
  }

  
  /**
   * This structure contains the operational state of the given DCBX features for Enhanced Ethernet.
   **/
  public EnhancedEthernetStatistics enhEthFeaturesState(EnhEthFeaturesState enhEthFeaturesState) {
    this.enhEthFeaturesState = enhEthFeaturesState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure contains the operational state of the given DCBX features for Enhanced Ethernet.")
  @JsonProperty("enhEthFeaturesState")
  public EnhEthFeaturesState getEnhEthFeaturesState() {
    return enhEthFeaturesState;
  }
  
  public void setEnhEthFeaturesState(EnhEthFeaturesState enhEthFeaturesState) {
    this.enhEthFeaturesState = enhEthFeaturesState;
  }

  
  /**
   * This structure contains the TLV set for the Local Node.
   **/
  public EnhancedEthernetStatistics localTLVs(EnhEthTLVSet localTLVs) {
    this.localTLVs = localTLVs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure contains the TLV set for the Local Node.")
  @JsonProperty("localTLVs")
  public EnhEthTLVSet getLocalTLVs() {
    return localTLVs;
  }
  
  public void setLocalTLVs(EnhEthTLVSet localTLVs) {
    this.localTLVs = localTLVs;
  }

  
  /**
   * This structure contains the Operational (Negotiated) TLV set.
   **/
  public EnhancedEthernetStatistics operationalTLVs(EnhEthTLVSet operationalTLVs) {
    this.operationalTLVs = operationalTLVs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure contains the Operational (Negotiated) TLV set.")
  @JsonProperty("operationalTLVs")
  public EnhEthTLVSet getOperationalTLVs() {
    return operationalTLVs;
  }
  
  public void setOperationalTLVs(EnhEthTLVSet operationalTLVs) {
    this.operationalTLVs = operationalTLVs;
  }

  
  /**
   * This structure contains the TLVs sent from the Remote Node.
   **/
  public EnhancedEthernetStatistics remoteTLVs(EnhEthTLVSet remoteTLVs) {
    this.remoteTLVs = remoteTLVs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This structure contains the TLVs sent from the Remote Node.")
  @JsonProperty("remoteTLVs")
  public EnhEthTLVSet getRemoteTLVs() {
    return remoteTLVs;
  }
  
  public void setRemoteTLVs(EnhEthTLVSet remoteTLVs) {
    this.remoteTLVs = remoteTLVs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedEthernetStatistics enhancedEthernetStatistics = (EnhancedEthernetStatistics) o;
    return Objects.equals(this.interfaces, enhancedEthernetStatistics.interfaces) &&
        Objects.equals(this.enhancedEthernetFlowControlStatus, enhancedEthernetStatistics.enhancedEthernetFlowControlStatus) &&
        Objects.equals(this.enhEthFeaturesState, enhancedEthernetStatistics.enhEthFeaturesState) &&
        Objects.equals(this.localTLVs, enhancedEthernetStatistics.localTLVs) &&
        Objects.equals(this.operationalTLVs, enhancedEthernetStatistics.operationalTLVs) &&
        Objects.equals(this.remoteTLVs, enhancedEthernetStatistics.remoteTLVs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaces, enhancedEthernetFlowControlStatus, enhEthFeaturesState, localTLVs, operationalTLVs, remoteTLVs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedEthernetStatistics {\n");
    
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("    enhancedEthernetFlowControlStatus: ").append(toIndentedString(enhancedEthernetFlowControlStatus)).append("\n");
    sb.append("    enhEthFeaturesState: ").append(toIndentedString(enhEthFeaturesState)).append("\n");
    sb.append("    localTLVs: ").append(toIndentedString(localTLVs)).append("\n");
    sb.append("    operationalTLVs: ").append(toIndentedString(operationalTLVs)).append("\n");
    sb.append("    remoteTLVs: ").append(toIndentedString(remoteTLVs)).append("\n");
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

