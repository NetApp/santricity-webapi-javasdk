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
 * Information discovered for a storage system during a discover process
 */
@ApiModel(description = "Information discovered for a storage system during a discover process")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DiscoveredStorageSystem   {
  
    private String serialNumber;

    private String wwn;

    private String label;

    private String firmware;

    private String nvsram;

    private List<String> ipAddresses;

    private Boolean needsAttention;

  
  /**
   * Serial number for the chassis
   **/
  public DiscoveredStorageSystem serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Serial number for the chassis")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * WWN for the storage system
   **/
  public DiscoveredStorageSystem wwn(String wwn) {
    this.wwn = wwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "WWN for the storage system")
  @JsonProperty("wwn")
  public String getWwn() {
    return wwn;
  }
  
  public void setWwn(String wwn) {
    this.wwn = wwn;
  }

  
  /**
   * Label for the storage system
   **/
  public DiscoveredStorageSystem label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Label for the storage system")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Firmware version for the storage system
   **/
  public DiscoveredStorageSystem firmware(String firmware) {
    this.firmware = firmware;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Firmware version for the storage system")
  @JsonProperty("firmware")
  public String getFirmware() {
    return firmware;
  }
  
  public void setFirmware(String firmware) {
    this.firmware = firmware;
  }

  
  /**
   * NVSRAM version for the storage system
   **/
  public DiscoveredStorageSystem nvsram(String nvsram) {
    this.nvsram = nvsram;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "NVSRAM version for the storage system")
  @JsonProperty("nvsram")
  public String getNvsram() {
    return nvsram;
  }
  
  public void setNvsram(String nvsram) {
    this.nvsram = nvsram;
  }

  
  /**
   * Discovered controller IP addresses for the storage system
   **/
  public DiscoveredStorageSystem ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Discovered controller IP addresses for the storage system")
  @JsonProperty("ipAddresses")
  public List<String> getIpAddresses() {
    return ipAddresses;
  }
  
  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  
  /**
   * Needs attention alert for the storage system
   **/
  public DiscoveredStorageSystem needsAttention(Boolean needsAttention) {
    this.needsAttention = needsAttention;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Needs attention alert for the storage system")
  @JsonProperty("needsAttention")
  public Boolean getNeedsAttention() {
    return needsAttention;
  }
  
  public void setNeedsAttention(Boolean needsAttention) {
    this.needsAttention = needsAttention;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveredStorageSystem discoveredStorageSystem = (DiscoveredStorageSystem) o;
    return Objects.equals(this.serialNumber, discoveredStorageSystem.serialNumber) &&
        Objects.equals(this.wwn, discoveredStorageSystem.wwn) &&
        Objects.equals(this.label, discoveredStorageSystem.label) &&
        Objects.equals(this.firmware, discoveredStorageSystem.firmware) &&
        Objects.equals(this.nvsram, discoveredStorageSystem.nvsram) &&
        Objects.equals(this.ipAddresses, discoveredStorageSystem.ipAddresses) &&
        Objects.equals(this.needsAttention, discoveredStorageSystem.needsAttention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, wwn, label, firmware, nvsram, ipAddresses, needsAttention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveredStorageSystem {\n");
    
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    nvsram: ").append(toIndentedString(nvsram)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    needsAttention: ").append(toIndentedString(needsAttention)).append("\n");
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

