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


package com.netapp.santricity.models.utils;

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
 * API response object that includes basic information about the system.
 */
@ApiModel(description = "API response object that includes basic information about the system.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:52.213-05:00")
public class AboutResponse   {
  
    private Boolean runningAsProxy;

    private String version;

    private String systemId;

    private Integer controllerPosition;

  
  /**
   * True if the REST API is running as a proxy, false if it is embedded on a storage system
   **/
  public AboutResponse runningAsProxy(Boolean runningAsProxy) {
    this.runningAsProxy = runningAsProxy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the REST API is running as a proxy, false if it is embedded on a storage system")
  @JsonProperty("runningAsProxy")
  public Boolean getRunningAsProxy() {
    return runningAsProxy;
  }
  
  public void setRunningAsProxy(Boolean runningAsProxy) {
    this.runningAsProxy = runningAsProxy;
  }

  
  /**
   * Product Version
   **/
  public AboutResponse version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Product Version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   * A unique id of this REST API install
   **/
  public AboutResponse systemId(String systemId) {
    this.systemId = systemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique id of this REST API install")
  @JsonProperty("systemId")
  public String getSystemId() {
    return systemId;
  }
  
  public void setSystemId(String systemId) {
    this.systemId = systemId;
  }

  
  /**
   * Managing controller position
   **/
  public AboutResponse controllerPosition(Integer controllerPosition) {
    this.controllerPosition = controllerPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Managing controller position")
  @JsonProperty("controllerPosition")
  public Integer getControllerPosition() {
    return controllerPosition;
  }
  
  public void setControllerPosition(Integer controllerPosition) {
    this.controllerPosition = controllerPosition;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AboutResponse aboutResponse = (AboutResponse) o;
    return Objects.equals(this.runningAsProxy, aboutResponse.runningAsProxy) &&
        Objects.equals(this.version, aboutResponse.version) &&
        Objects.equals(this.systemId, aboutResponse.systemId) &&
        Objects.equals(this.controllerPosition, aboutResponse.controllerPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runningAsProxy, version, systemId, controllerPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AboutResponse {\n");
    
    sb.append("    runningAsProxy: ").append(toIndentedString(runningAsProxy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    controllerPosition: ").append(toIndentedString(controllerPosition)).append("\n");
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

