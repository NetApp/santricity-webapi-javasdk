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
 * AsyncMirrorGroupConnectivityTestResults
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AsyncMirrorGroupConnectivityTestResults   {
  

  /**
   * Types of AMG connectivity tests.
   */
  public enum TestTypeEnum {
    connectivityTestUnknown("connectivityTestUnknown"),
    basicConnectivityTest("basicConnectivityTest"),
    linkLatencyTest("linkLatencyTest"),
    linkBandwidthTest("linkBandwidthTest"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TestTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TestTypeEnum testType;

    private AsyncMirrorGroupLinkLatencyTestResults linkTestResults;

    private AsyncMirrorGroupLinkBandwidthTestResults bandwidthTestResults;

  
  /**
   * Types of AMG connectivity tests.
   **/
  public AsyncMirrorGroupConnectivityTestResults testType(TestTypeEnum testType) {
    this.testType = testType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Types of AMG connectivity tests.")
  @JsonProperty("testType")
  public TestTypeEnum getTestType() {
    return testType;
  }
  
  public void setTestType(TestTypeEnum testType) {
    this.testType = testType;
  }

  
  /**
   * This field is returned if the testType is equal to ASYNC_MIRROR_GROUP_LINK_LATENCY_TEST.
   **/
  public AsyncMirrorGroupConnectivityTestResults linkTestResults(AsyncMirrorGroupLinkLatencyTestResults linkTestResults) {
    this.linkTestResults = linkTestResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is returned if the testType is equal to ASYNC_MIRROR_GROUP_LINK_LATENCY_TEST.")
  @JsonProperty("linkTestResults")
  public AsyncMirrorGroupLinkLatencyTestResults getLinkTestResults() {
    return linkTestResults;
  }
  
  public void setLinkTestResults(AsyncMirrorGroupLinkLatencyTestResults linkTestResults) {
    this.linkTestResults = linkTestResults;
  }

  
  /**
   * This field is returned if the testType is equal to ASYNC_MIRROR_GROUP_LINK_BANDWIDTH_TEST.
   **/
  public AsyncMirrorGroupConnectivityTestResults bandwidthTestResults(AsyncMirrorGroupLinkBandwidthTestResults bandwidthTestResults) {
    this.bandwidthTestResults = bandwidthTestResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is returned if the testType is equal to ASYNC_MIRROR_GROUP_LINK_BANDWIDTH_TEST.")
  @JsonProperty("bandwidthTestResults")
  public AsyncMirrorGroupLinkBandwidthTestResults getBandwidthTestResults() {
    return bandwidthTestResults;
  }
  
  public void setBandwidthTestResults(AsyncMirrorGroupLinkBandwidthTestResults bandwidthTestResults) {
    this.bandwidthTestResults = bandwidthTestResults;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorGroupConnectivityTestResults asyncMirrorGroupConnectivityTestResults = (AsyncMirrorGroupConnectivityTestResults) o;
    return Objects.equals(this.testType, asyncMirrorGroupConnectivityTestResults.testType) &&
        Objects.equals(this.linkTestResults, asyncMirrorGroupConnectivityTestResults.linkTestResults) &&
        Objects.equals(this.bandwidthTestResults, asyncMirrorGroupConnectivityTestResults.bandwidthTestResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testType, linkTestResults, bandwidthTestResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorGroupConnectivityTestResults {\n");
    
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    linkTestResults: ").append(toIndentedString(linkTestResults)).append("\n");
    sb.append("    bandwidthTestResults: ").append(toIndentedString(bandwidthTestResults)).append("\n");
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

