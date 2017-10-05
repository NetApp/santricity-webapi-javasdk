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
 * StorageArrayChangeableProperties
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class StorageArrayChangeableProperties   {
  
    private List<Integer> defaultHostTypeIndex;

    private List<Long> nextBatteryLearnCycle;

    private List<Boolean> syslogEnabled;

    private List<IpVxAddress> syslogServerIpAddress;

    private List<Integer> syslogServerPortNumber;

  
  /**
   * The new value to set for the storage array default host type index.
   **/
  public StorageArrayChangeableProperties defaultHostTypeIndex(List<Integer> defaultHostTypeIndex) {
    this.defaultHostTypeIndex = defaultHostTypeIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new value to set for the storage array default host type index.")
  @JsonProperty("defaultHostTypeIndex")
  public List<Integer> getDefaultHostTypeIndex() {
    return defaultHostTypeIndex;
  }
  
  public void setDefaultHostTypeIndex(List<Integer> defaultHostTypeIndex) {
    this.defaultHostTypeIndex = defaultHostTypeIndex;
  }

  
  /**
   * The new value to apply for the nextBatteryLearnCycle property in the StorageArray structure. This value is expressed as seconds since midnight GMT, January 1, 1970. This field is only applicable if the smartBatteryTechnology Boolean in FeatureParams is set to true. The array will return an error if an attempt is made to set this time more than seven days later than the current scheduled time.
   **/
  public StorageArrayChangeableProperties nextBatteryLearnCycle(List<Long> nextBatteryLearnCycle) {
    this.nextBatteryLearnCycle = nextBatteryLearnCycle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new value to apply for the nextBatteryLearnCycle property in the StorageArray structure. This value is expressed as seconds since midnight GMT, January 1, 1970. This field is only applicable if the smartBatteryTechnology Boolean in FeatureParams is set to true. The array will return an error if an attempt is made to set this time more than seven days later than the current scheduled time.")
  @JsonProperty("nextBatteryLearnCycle")
  public List<Long> getNextBatteryLearnCycle() {
    return nextBatteryLearnCycle;
  }
  
  public void setNextBatteryLearnCycle(List<Long> nextBatteryLearnCycle) {
    this.nextBatteryLearnCycle = nextBatteryLearnCycle;
  }

  
  /**
   * The new value for the storage array setting that controls whether or not syslog server notification of MEL events is enabled or not.
   **/
  public StorageArrayChangeableProperties syslogEnabled(List<Boolean> syslogEnabled) {
    this.syslogEnabled = syslogEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new value for the storage array setting that controls whether or not syslog server notification of MEL events is enabled or not.")
  @JsonProperty("syslogEnabled")
  public List<Boolean> getSyslogEnabled() {
    return syslogEnabled;
  }
  
  public void setSyslogEnabled(List<Boolean> syslogEnabled) {
    this.syslogEnabled = syslogEnabled;
  }

  
  /**
   * The new value to set for the IP address of the syslog server.
   **/
  public StorageArrayChangeableProperties syslogServerIpAddress(List<IpVxAddress> syslogServerIpAddress) {
    this.syslogServerIpAddress = syslogServerIpAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new value to set for the IP address of the syslog server.")
  @JsonProperty("syslogServerIpAddress")
  public List<IpVxAddress> getSyslogServerIpAddress() {
    return syslogServerIpAddress;
  }
  
  public void setSyslogServerIpAddress(List<IpVxAddress> syslogServerIpAddress) {
    this.syslogServerIpAddress = syslogServerIpAddress;
  }

  
  /**
   * The new value to set for the UDP port number of the syslog server..
   **/
  public StorageArrayChangeableProperties syslogServerPortNumber(List<Integer> syslogServerPortNumber) {
    this.syslogServerPortNumber = syslogServerPortNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new value to set for the UDP port number of the syslog server..")
  @JsonProperty("syslogServerPortNumber")
  public List<Integer> getSyslogServerPortNumber() {
    return syslogServerPortNumber;
  }
  
  public void setSyslogServerPortNumber(List<Integer> syslogServerPortNumber) {
    this.syslogServerPortNumber = syslogServerPortNumber;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageArrayChangeableProperties storageArrayChangeableProperties = (StorageArrayChangeableProperties) o;
    return Objects.equals(this.defaultHostTypeIndex, storageArrayChangeableProperties.defaultHostTypeIndex) &&
        Objects.equals(this.nextBatteryLearnCycle, storageArrayChangeableProperties.nextBatteryLearnCycle) &&
        Objects.equals(this.syslogEnabled, storageArrayChangeableProperties.syslogEnabled) &&
        Objects.equals(this.syslogServerIpAddress, storageArrayChangeableProperties.syslogServerIpAddress) &&
        Objects.equals(this.syslogServerPortNumber, storageArrayChangeableProperties.syslogServerPortNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultHostTypeIndex, nextBatteryLearnCycle, syslogEnabled, syslogServerIpAddress, syslogServerPortNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageArrayChangeableProperties {\n");
    
    sb.append("    defaultHostTypeIndex: ").append(toIndentedString(defaultHostTypeIndex)).append("\n");
    sb.append("    nextBatteryLearnCycle: ").append(toIndentedString(nextBatteryLearnCycle)).append("\n");
    sb.append("    syslogEnabled: ").append(toIndentedString(syslogEnabled)).append("\n");
    sb.append("    syslogServerIpAddress: ").append(toIndentedString(syslogServerIpAddress)).append("\n");
    sb.append("    syslogServerPortNumber: ").append(toIndentedString(syslogServerPortNumber)).append("\n");
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

