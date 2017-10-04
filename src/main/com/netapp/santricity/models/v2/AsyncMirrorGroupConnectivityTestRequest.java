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
 * Request that a connectivity test be performed between the local and remote Amg&#39;s.
 */
@ApiModel(description = "Request that a connectivity test be performed between the local and remote Amg's.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class AsyncMirrorGroupConnectivityTestRequest   {
  

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
   * Type of test to perform.
   **/
  public AsyncMirrorGroupConnectivityTestRequest requestedTestType(RequestedTestTypeEnum requestedTestType) {
    this.requestedTestType = requestedTestType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of test to perform.")
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
  public AsyncMirrorGroupConnectivityTestRequest testIterations(Integer testIterations) {
    this.testIterations = testIterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of test iterations to run.")
  @JsonProperty("testIterations")
  public Integer getTestIterations() {
    return testIterations;
  }
  
  public void setTestIterations(Integer testIterations) {
    this.testIterations = testIterations;
  }

  
  /**
   * Timeout in seconds. For no timeout, this value should be set to -1.
   **/
  public AsyncMirrorGroupConnectivityTestRequest timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timeout in seconds. For no timeout, this value should be set to -1.")
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
    AsyncMirrorGroupConnectivityTestRequest asyncMirrorGroupConnectivityTestRequest = (AsyncMirrorGroupConnectivityTestRequest) o;
    return Objects.equals(this.requestedTestType, asyncMirrorGroupConnectivityTestRequest.requestedTestType) &&
        Objects.equals(this.testIterations, asyncMirrorGroupConnectivityTestRequest.testIterations) &&
        Objects.equals(this.timeout, asyncMirrorGroupConnectivityTestRequest.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedTestType, testIterations, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupConnectivityTestRequest {\n");
    
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

