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
 * SystemAttributeDefaults
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SystemAttributeDefaults   {
  
    private DiskPoolDefaultAttributes diskPoolDefaultAttributes;

    private ThinVolumeDefaultAttributes thinVolDefaultAttributes;

    private PITGroupsDefaultAttributes pitGroupsDefaultAttributes;

    private ARVMDefaultAttributes arvmDefaultAttributes;

    private ConcatVolumeDefaultAttributes concatDefaultAttributes;

    private EmbeddedSNMPAgentDefaultAttributes snmpAgentDefaultAttributes;

    private CumulativeStatisticsDefaultAttributes statisticsDefaultAttributes;

    private TunnelingDefaultAttributes tunnelingDefaultAttributes;

  
  /**
   * Default Disk Pool feature attributes.
   **/
  public SystemAttributeDefaults diskPoolDefaultAttributes(DiskPoolDefaultAttributes diskPoolDefaultAttributes) {
    this.diskPoolDefaultAttributes = diskPoolDefaultAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default Disk Pool feature attributes.")
  @JsonProperty("diskPoolDefaultAttributes")
  public DiskPoolDefaultAttributes getDiskPoolDefaultAttributes() {
    return diskPoolDefaultAttributes;
  }
  
  public void setDiskPoolDefaultAttributes(DiskPoolDefaultAttributes diskPoolDefaultAttributes) {
    this.diskPoolDefaultAttributes = diskPoolDefaultAttributes;
  }

  
  /**
   * Default Thin Volume feature attributes.
   **/
  public SystemAttributeDefaults thinVolDefaultAttributes(ThinVolumeDefaultAttributes thinVolDefaultAttributes) {
    this.thinVolDefaultAttributes = thinVolDefaultAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default Thin Volume feature attributes.")
  @JsonProperty("thinVolDefaultAttributes")
  public ThinVolumeDefaultAttributes getThinVolDefaultAttributes() {
    return thinVolDefaultAttributes;
  }
  
  public void setThinVolDefaultAttributes(ThinVolumeDefaultAttributes thinVolDefaultAttributes) {
    this.thinVolDefaultAttributes = thinVolDefaultAttributes;
  }

  
  /**
   * Default PiT Groups feature attributes.
   **/
  public SystemAttributeDefaults pitGroupsDefaultAttributes(PITGroupsDefaultAttributes pitGroupsDefaultAttributes) {
    this.pitGroupsDefaultAttributes = pitGroupsDefaultAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default PiT Groups feature attributes.")
  @JsonProperty("pitGroupsDefaultAttributes")
  public PITGroupsDefaultAttributes getPitGroupsDefaultAttributes() {
    return pitGroupsDefaultAttributes;
  }
  
  public void setPitGroupsDefaultAttributes(PITGroupsDefaultAttributes pitGroupsDefaultAttributes) {
    this.pitGroupsDefaultAttributes = pitGroupsDefaultAttributes;
  }

  
  /**
   * Default ARVM feature attributes.
   **/
  public SystemAttributeDefaults arvmDefaultAttributes(ARVMDefaultAttributes arvmDefaultAttributes) {
    this.arvmDefaultAttributes = arvmDefaultAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default ARVM feature attributes.")
  @JsonProperty("arvmDefaultAttributes")
  public ARVMDefaultAttributes getArvmDefaultAttributes() {
    return arvmDefaultAttributes;
  }
  
  public void setArvmDefaultAttributes(ARVMDefaultAttributes arvmDefaultAttributes) {
    this.arvmDefaultAttributes = arvmDefaultAttributes;
  }

  
  /**
   * Default ConcatVolume feature attributes.
   **/
  public SystemAttributeDefaults concatDefaultAttributes(ConcatVolumeDefaultAttributes concatDefaultAttributes) {
    this.concatDefaultAttributes = concatDefaultAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default ConcatVolume feature attributes.")
  @JsonProperty("concatDefaultAttributes")
  public ConcatVolumeDefaultAttributes getConcatDefaultAttributes() {
    return concatDefaultAttributes;
  }
  
  public void setConcatDefaultAttributes(ConcatVolumeDefaultAttributes concatDefaultAttributes) {
    this.concatDefaultAttributes = concatDefaultAttributes;
  }

  
  /**
   * Default/maximum attributes for the embedded SNMP agent.
   **/
  public SystemAttributeDefaults snmpAgentDefaultAttributes(EmbeddedSNMPAgentDefaultAttributes snmpAgentDefaultAttributes) {
    this.snmpAgentDefaultAttributes = snmpAgentDefaultAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default/maximum attributes for the embedded SNMP agent.")
  @JsonProperty("snmpAgentDefaultAttributes")
  public EmbeddedSNMPAgentDefaultAttributes getSnmpAgentDefaultAttributes() {
    return snmpAgentDefaultAttributes;
  }
  
  public void setSnmpAgentDefaultAttributes(EmbeddedSNMPAgentDefaultAttributes snmpAgentDefaultAttributes) {
    this.snmpAgentDefaultAttributes = snmpAgentDefaultAttributes;
  }

  
  /**
   * Specifies the low and high statistical sampling attributes supported by this array.
   **/
  public SystemAttributeDefaults statisticsDefaultAttributes(CumulativeStatisticsDefaultAttributes statisticsDefaultAttributes) {
    this.statisticsDefaultAttributes = statisticsDefaultAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the low and high statistical sampling attributes supported by this array.")
  @JsonProperty("statisticsDefaultAttributes")
  public CumulativeStatisticsDefaultAttributes getStatisticsDefaultAttributes() {
    return statisticsDefaultAttributes;
  }
  
  public void setStatisticsDefaultAttributes(CumulativeStatisticsDefaultAttributes statisticsDefaultAttributes) {
    this.statisticsDefaultAttributes = statisticsDefaultAttributes;
  }

  
  /**
   * Supplies default attributes used for the HTTP UTM tunneling API.
   **/
  public SystemAttributeDefaults tunnelingDefaultAttributes(TunnelingDefaultAttributes tunnelingDefaultAttributes) {
    this.tunnelingDefaultAttributes = tunnelingDefaultAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Supplies default attributes used for the HTTP UTM tunneling API.")
  @JsonProperty("tunnelingDefaultAttributes")
  public TunnelingDefaultAttributes getTunnelingDefaultAttributes() {
    return tunnelingDefaultAttributes;
  }
  
  public void setTunnelingDefaultAttributes(TunnelingDefaultAttributes tunnelingDefaultAttributes) {
    this.tunnelingDefaultAttributes = tunnelingDefaultAttributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemAttributeDefaults systemAttributeDefaults = (SystemAttributeDefaults) o;
    return Objects.equals(this.diskPoolDefaultAttributes, systemAttributeDefaults.diskPoolDefaultAttributes) &&
        Objects.equals(this.thinVolDefaultAttributes, systemAttributeDefaults.thinVolDefaultAttributes) &&
        Objects.equals(this.pitGroupsDefaultAttributes, systemAttributeDefaults.pitGroupsDefaultAttributes) &&
        Objects.equals(this.arvmDefaultAttributes, systemAttributeDefaults.arvmDefaultAttributes) &&
        Objects.equals(this.concatDefaultAttributes, systemAttributeDefaults.concatDefaultAttributes) &&
        Objects.equals(this.snmpAgentDefaultAttributes, systemAttributeDefaults.snmpAgentDefaultAttributes) &&
        Objects.equals(this.statisticsDefaultAttributes, systemAttributeDefaults.statisticsDefaultAttributes) &&
        Objects.equals(this.tunnelingDefaultAttributes, systemAttributeDefaults.tunnelingDefaultAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskPoolDefaultAttributes, thinVolDefaultAttributes, pitGroupsDefaultAttributes, arvmDefaultAttributes, concatDefaultAttributes, snmpAgentDefaultAttributes, statisticsDefaultAttributes, tunnelingDefaultAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAttributeDefaults {\n");
    
    sb.append("    diskPoolDefaultAttributes: ").append(toIndentedString(diskPoolDefaultAttributes)).append("\n");
    sb.append("    thinVolDefaultAttributes: ").append(toIndentedString(thinVolDefaultAttributes)).append("\n");
    sb.append("    pitGroupsDefaultAttributes: ").append(toIndentedString(pitGroupsDefaultAttributes)).append("\n");
    sb.append("    arvmDefaultAttributes: ").append(toIndentedString(arvmDefaultAttributes)).append("\n");
    sb.append("    concatDefaultAttributes: ").append(toIndentedString(concatDefaultAttributes)).append("\n");
    sb.append("    snmpAgentDefaultAttributes: ").append(toIndentedString(snmpAgentDefaultAttributes)).append("\n");
    sb.append("    statisticsDefaultAttributes: ").append(toIndentedString(statisticsDefaultAttributes)).append("\n");
    sb.append("    tunnelingDefaultAttributes: ").append(toIndentedString(tunnelingDefaultAttributes)).append("\n");
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

