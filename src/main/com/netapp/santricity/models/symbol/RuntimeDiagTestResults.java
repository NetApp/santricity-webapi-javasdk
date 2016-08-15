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
 * RuntimeDiagTestResults
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RuntimeDiagTestResults   {
  

  /**
   * Identifies the test the results are for.
   */
  public enum TestIDEnum {
    all("all"),
    read("read"),
    loopbackData("loopbackData"),
    write("write"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TestIDEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TestIDEnum testID;

    private Integer channel;


  /**
   * Identifies the status of the test.
   */
  public enum TestStatusEnum {
    none("none"),
    success("success"),
    failure("failure"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TestStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TestStatusEnum testStatus;


  /**
   * Identifies the level of the test run.
   */
  public enum TestLevelEnum {
    internal("internal"),
    external("external"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TestLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TestLevelEnum testLevel;

  
  /**
   * Identifies the test the results are for.
   **/
  public RuntimeDiagTestResults testID(TestIDEnum testID) {
    this.testID = testID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifies the test the results are for.")
  @JsonProperty("testID")
  public TestIDEnum getTestID() {
    return testID;
  }
  
  public void setTestID(TestIDEnum testID) {
    this.testID = testID;
  }

  
  /**
   * Identifies the channel the test was run on.
   **/
  public RuntimeDiagTestResults channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifies the channel the test was run on.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * Identifies the status of the test.
   **/
  public RuntimeDiagTestResults testStatus(TestStatusEnum testStatus) {
    this.testStatus = testStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifies the status of the test.")
  @JsonProperty("testStatus")
  public TestStatusEnum getTestStatus() {
    return testStatus;
  }
  
  public void setTestStatus(TestStatusEnum testStatus) {
    this.testStatus = testStatus;
  }

  
  /**
   * Identifies the level of the test run.
   **/
  public RuntimeDiagTestResults testLevel(TestLevelEnum testLevel) {
    this.testLevel = testLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifies the level of the test run.")
  @JsonProperty("testLevel")
  public TestLevelEnum getTestLevel() {
    return testLevel;
  }
  
  public void setTestLevel(TestLevelEnum testLevel) {
    this.testLevel = testLevel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeDiagTestResults runtimeDiagTestResults = (RuntimeDiagTestResults) o;
    return Objects.equals(this.testID, runtimeDiagTestResults.testID) &&
        Objects.equals(this.channel, runtimeDiagTestResults.channel) &&
        Objects.equals(this.testStatus, runtimeDiagTestResults.testStatus) &&
        Objects.equals(this.testLevel, runtimeDiagTestResults.testLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testID, channel, testStatus, testLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeDiagTestResults {\n");
    
    sb.append("    testID: ").append(toIndentedString(testID)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    testStatus: ").append(toIndentedString(testStatus)).append("\n");
    sb.append("    testLevel: ").append(toIndentedString(testLevel)).append("\n");
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

