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
 * RuntimeDiagDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RuntimeDiagDescriptor   {
  
    private String controllerRef;


  /**
   * The test or tests to run.
   */
  public enum RuntimeDiagTestIDEnum {
    all("all"),
    read("read"),
    loopbackData("loopbackData"),
    write("write"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RuntimeDiagTestIDEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RuntimeDiagTestIDEnum runtimeDiagTestID;

    private Integer channel;

    private Boolean usePattern;

    private String pattern;

  
  /**
   * The initiating (alternate) controller to the controller being tested. If the controller to be tested receives the request to run diagnostics, it will return a RETCODE_TRY_ALTERNATE error.
   **/
  public RuntimeDiagDescriptor controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The initiating (alternate) controller to the controller being tested. If the controller to be tested receives the request to run diagnostics, it will return a RETCODE_TRY_ALTERNATE error.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * The test or tests to run.
   **/
  public RuntimeDiagDescriptor runtimeDiagTestID(RuntimeDiagTestIDEnum runtimeDiagTestID) {
    this.runtimeDiagTestID = runtimeDiagTestID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The test or tests to run.")
  @JsonProperty("runtimeDiagTestID")
  public RuntimeDiagTestIDEnum getRuntimeDiagTestID() {
    return runtimeDiagTestID;
  }
  
  public void setRuntimeDiagTestID(RuntimeDiagTestIDEnum runtimeDiagTestID) {
    this.runtimeDiagTestID = runtimeDiagTestID;
  }

  
  /**
   * The channel to use for the loopback data test.
   **/
  public RuntimeDiagDescriptor channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel to use for the loopback data test.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * TRUE, if pattern should be used on loopback data test.
   **/
  public RuntimeDiagDescriptor usePattern(Boolean usePattern) {
    this.usePattern = usePattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "TRUE, if pattern should be used on loopback data test.")
  @JsonProperty("usePattern")
  public Boolean getUsePattern() {
    return usePattern;
  }
  
  public void setUsePattern(Boolean usePattern) {
    this.usePattern = usePattern;
  }

  
  /**
   * The loopback data test pattern.
   **/
  public RuntimeDiagDescriptor pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The loopback data test pattern.")
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }
  
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeDiagDescriptor runtimeDiagDescriptor = (RuntimeDiagDescriptor) o;
    return Objects.equals(this.controllerRef, runtimeDiagDescriptor.controllerRef) &&
        Objects.equals(this.runtimeDiagTestID, runtimeDiagDescriptor.runtimeDiagTestID) &&
        Objects.equals(this.channel, runtimeDiagDescriptor.channel) &&
        Objects.equals(this.usePattern, runtimeDiagDescriptor.usePattern) &&
        Objects.equals(this.pattern, runtimeDiagDescriptor.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, runtimeDiagTestID, channel, usePattern, pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeDiagDescriptor {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    runtimeDiagTestID: ").append(toIndentedString(runtimeDiagTestID)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    usePattern: ").append(toIndentedString(usePattern)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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

