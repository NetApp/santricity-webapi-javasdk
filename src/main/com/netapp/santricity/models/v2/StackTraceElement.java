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
 * StackTraceElement
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class StackTraceElement   {
  
    private String methodName;

    private String fileName;

    private Integer lineNumber;

    private String className;

    private Boolean nativeMethod;

  
  /**
   **/
  public StackTraceElement methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("methodName")
  public String getMethodName() {
    return methodName;
  }
  
  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  
  /**
   **/
  public StackTraceElement fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   **/
  public StackTraceElement lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineNumber")
  public Integer getLineNumber() {
    return lineNumber;
  }
  
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  
  /**
   **/
  public StackTraceElement className(String className) {
    this.className = className;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("className")
  public String getClassName() {
    return className;
  }
  
  public void setClassName(String className) {
    this.className = className;
  }

  
  /**
   **/
  public StackTraceElement nativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nativeMethod")
  public Boolean getNativeMethod() {
    return nativeMethod;
  }
  
  public void setNativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackTraceElement stackTraceElement = (StackTraceElement) o;
    return Objects.equals(this.methodName, stackTraceElement.methodName) &&
        Objects.equals(this.fileName, stackTraceElement.fileName) &&
        Objects.equals(this.lineNumber, stackTraceElement.lineNumber) &&
        Objects.equals(this.className, stackTraceElement.className) &&
        Objects.equals(this.nativeMethod, stackTraceElement.nativeMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodName, fileName, lineNumber, className, nativeMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackTraceElement {\n");
    
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
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

