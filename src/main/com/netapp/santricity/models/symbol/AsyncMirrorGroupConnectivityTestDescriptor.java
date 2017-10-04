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
 * AsyncMirrorGroupConnectivityTestDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class AsyncMirrorGroupConnectivityTestDescriptor   {
  
    private String groupRef;


  /**
   * Type of test to perform.
   */
  public enum RequestedTestTypeEnum {
    connectivityTestUnknown("connectivityTestUnknown"),
    basicConnectivityTest("basicConnectivityTest"),
    linkLatencyTest("linkLatencyTest"),
    linkBandwidthTest("linkBandwidthTest"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RequestedTestTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RequestedTestTypeEnum requestedTestType;

    private Integer testIterations;

    private Integer timeout;

  
  /**
   * The Async Mirror Group on which the connectivity test is to be performed.
   **/
  public AsyncMirrorGroupConnectivityTestDescriptor groupRef(String groupRef) {
    this.groupRef = groupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Async Mirror Group on which the connectivity test is to be performed.")
  @JsonProperty("groupRef")
  public String getGroupRef() {
    return groupRef;
  }
  
  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  
  /**
   * Type of test to perform.
   **/
  public AsyncMirrorGroupConnectivityTestDescriptor requestedTestType(RequestedTestTypeEnum requestedTestType) {
    this.requestedTestType = requestedTestType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of test to perform.")
  @JsonProperty("requestedTestType")
  public RequestedTestTypeEnum getRequestedTestType() {
    return requestedTestType;
  }
  
  public void setRequestedTestType(RequestedTestTypeEnum requestedTestType) {
    this.requestedTestType = requestedTestType;
  }

  
  /**
   * Number of test iterations to run.
   **/
  public AsyncMirrorGroupConnectivityTestDescriptor testIterations(Integer testIterations) {
    this.testIterations = testIterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of test iterations to run.")
  @JsonProperty("testIterations")
  public Integer getTestIterations() {
    return testIterations;
  }
  
  public void setTestIterations(Integer testIterations) {
    this.testIterations = testIterations;
  }

  
  /**
   * Timeout in seconds. For no timeout, this value should be set to ARVM_CONNECTIVITY_TEST_NO_TIMEOUT.
   **/
  public AsyncMirrorGroupConnectivityTestDescriptor timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timeout in seconds. For no timeout, this value should be set to ARVM_CONNECTIVITY_TEST_NO_TIMEOUT.")
  @JsonProperty("timeout")
  public Integer getTimeout() {
    return timeout;
  }
  
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupConnectivityTestDescriptor asyncMirrorGroupConnectivityTestDescriptor = (AsyncMirrorGroupConnectivityTestDescriptor) o;
    return Objects.equals(this.groupRef, asyncMirrorGroupConnectivityTestDescriptor.groupRef) &&
        Objects.equals(this.requestedTestType, asyncMirrorGroupConnectivityTestDescriptor.requestedTestType) &&
        Objects.equals(this.testIterations, asyncMirrorGroupConnectivityTestDescriptor.testIterations) &&
        Objects.equals(this.timeout, asyncMirrorGroupConnectivityTestDescriptor.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRef, requestedTestType, testIterations, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupConnectivityTestDescriptor {\n");
    
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    requestedTestType: ").append(toIndentedString(requestedTestType)).append("\n");
    sb.append("    testIterations: ").append(toIndentedString(testIterations)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

