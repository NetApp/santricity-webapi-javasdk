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
 * SNMPSystemVariables
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SNMPSystemVariables   {
  
    private String sysName;

    private String sysContact;

    private String sysLocation;

  
  /**
   * Value to be returned for system.sysName variable
   **/
  public SNMPSystemVariables sysName(String sysName) {
    this.sysName = sysName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value to be returned for system.sysName variable")
  @JsonProperty("sysName")
  public String getSysName() {
    return sysName;
  }
  
  public void setSysName(String sysName) {
    this.sysName = sysName;
  }

  
  /**
   * Value to be returned for system.sysContact variable
   **/
  public SNMPSystemVariables sysContact(String sysContact) {
    this.sysContact = sysContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value to be returned for system.sysContact variable")
  @JsonProperty("sysContact")
  public String getSysContact() {
    return sysContact;
  }
  
  public void setSysContact(String sysContact) {
    this.sysContact = sysContact;
  }

  
  /**
   * Value to be returned for system.sysLocation variable
   **/
  public SNMPSystemVariables sysLocation(String sysLocation) {
    this.sysLocation = sysLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value to be returned for system.sysLocation variable")
  @JsonProperty("sysLocation")
  public String getSysLocation() {
    return sysLocation;
  }
  
  public void setSysLocation(String sysLocation) {
    this.sysLocation = sysLocation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SNMPSystemVariables sNMPSystemVariables = (SNMPSystemVariables) o;
    return Objects.equals(this.sysName, sNMPSystemVariables.sysName) &&
        Objects.equals(this.sysContact, sNMPSystemVariables.sysContact) &&
        Objects.equals(this.sysLocation, sNMPSystemVariables.sysLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sysName, sysContact, sysLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SNMPSystemVariables {\n");
    
    sb.append("    sysName: ").append(toIndentedString(sysName)).append("\n");
    sb.append("    sysContact: ").append(toIndentedString(sysContact)).append("\n");
    sb.append("    sysLocation: ").append(toIndentedString(sysLocation)).append("\n");
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

