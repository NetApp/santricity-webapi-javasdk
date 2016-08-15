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
 * FruDiagReturnData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FruDiagReturnData   {
  
    private String serialNumber;

    private Integer slot;

    private Long startTime;

    private Long endTime;


  /**
   * The diagnostic test type.
   */
  public enum TestTypeEnum {
    none("none"),
    serviceModeBasic("serviceModeBasic"),
    serviceModeExtended("serviceModeExtended"),
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


  /**
   * The diagnostic test identifier.
   */
  public enum TestIdentifierEnum {
    none("none"),
    dimmByteEnable("dimmByteEnable"),
    dimmEcc("dimmEcc"),
    dimmMarchC("dimmMarchC"),
    dimmPatterns("dimmPatterns"),
    dimmPseudorandom("dimmPseudorandom"),
    dimmDmaCopy("dimmDmaCopy"),
    usbflashWriteProtect("usbflashWriteProtect"),
    usbflashWriteCycle("usbflashWriteCycle"),
    usbflashWritePatterns("usbflashWritePatterns"),
    usbflashRandom("usbflashRandom"),
    hicReadWrite("hicReadWrite"),
    hicDataLines("hicDataLines"),
    hicInterrupt("hicInterrupt"),
    hicLoopback("hicLoopback"),
    hicT10pi("hicT10pi"),
    hicDma("hicDma"),
    hicContextMemory("hicContextMemory"),
    hicExtMemory("hicExtMemory"),
    ctlrRegisterAddress("ctlrRegisterAddress"),
    ctlrDataLines("ctlrDataLines"),
    ctlrApcSram("ctlrApcSram"),
    ctlrApcFifo("ctlrApcFifo"),
    ctlrDataCopy("ctlrDataCopy"),
    ctlrRaid5("ctlrRaid5"),
    ctlrRaid6("ctlrRaid6"),
    hicRamReadWrite("hicRamReadWrite"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TestIdentifierEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TestIdentifierEnum testIdentifier;


  /**
   * The diagnostic test status.
   */
  public enum StatusEnum {
    none("none"),
    inProgress("inProgress"),
    successful("successful"),
    failed("failed"),
    stopByInitiator("stopByInitiator"),
    stopByReset("stopByReset"),
    notSupported("notSupported"),
    skipped("skipped"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;

    private Integer errorCode;

    private Integer percentComplete;

  
  /**
   * Variable-length ASCII text string that identifies the device serial number.
   **/
  public FruDiagReturnData serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Variable-length ASCII text string that identifies the device serial number.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * Device slot number (1-based).
   **/
  public FruDiagReturnData slot(Integer slot) {
    this.slot = slot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Device slot number (1-based).")
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }
  
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  
  /**
   * The time the diagnostic was started, represented in seconds since midnight GMT on January 1, 1970.
   **/
  public FruDiagReturnData startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time the diagnostic was started, represented in seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("startTime")
  public Long getStartTime() {
    return startTime;
  }
  
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  
  /**
   * If the diagnostic is not running this is the time the diagnostic was completed or interrupted. If the diagnostic is running this is the time the status was requested. The time is represented in seconds since midnight GMT on January 1, 1970.
   **/
  public FruDiagReturnData endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If the diagnostic is not running this is the time the diagnostic was completed or interrupted. If the diagnostic is running this is the time the status was requested. The time is represented in seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("endTime")
  public Long getEndTime() {
    return endTime;
  }
  
  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The diagnostic test type.
   **/
  public FruDiagReturnData testType(TestTypeEnum testType) {
    this.testType = testType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The diagnostic test type.")
  @JsonProperty("testType")
  public TestTypeEnum getTestType() {
    return testType;
  }
  
  public void setTestType(TestTypeEnum testType) {
    this.testType = testType;
  }

  
  /**
   * The diagnostic test identifier.
   **/
  public FruDiagReturnData testIdentifier(TestIdentifierEnum testIdentifier) {
    this.testIdentifier = testIdentifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The diagnostic test identifier.")
  @JsonProperty("testIdentifier")
  public TestIdentifierEnum getTestIdentifier() {
    return testIdentifier;
  }
  
  public void setTestIdentifier(TestIdentifierEnum testIdentifier) {
    this.testIdentifier = testIdentifier;
  }

  
  /**
   * The diagnostic test status.
   **/
  public FruDiagReturnData status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The diagnostic test status.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The diagnostic test error code.
   **/
  public FruDiagReturnData errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The diagnostic test error code.")
  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }
  
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  
  /**
   * This value is a number in the range 0 to 100 indicating the percent complete.
   **/
  public FruDiagReturnData percentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value is a number in the range 0 to 100 indicating the percent complete.")
  @JsonProperty("percentComplete")
  public Integer getPercentComplete() {
    return percentComplete;
  }
  
  public void setPercentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FruDiagReturnData fruDiagReturnData = (FruDiagReturnData) o;
    return Objects.equals(this.serialNumber, fruDiagReturnData.serialNumber) &&
        Objects.equals(this.slot, fruDiagReturnData.slot) &&
        Objects.equals(this.startTime, fruDiagReturnData.startTime) &&
        Objects.equals(this.endTime, fruDiagReturnData.endTime) &&
        Objects.equals(this.testType, fruDiagReturnData.testType) &&
        Objects.equals(this.testIdentifier, fruDiagReturnData.testIdentifier) &&
        Objects.equals(this.status, fruDiagReturnData.status) &&
        Objects.equals(this.errorCode, fruDiagReturnData.errorCode) &&
        Objects.equals(this.percentComplete, fruDiagReturnData.percentComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, slot, startTime, endTime, testType, testIdentifier, status, errorCode, percentComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FruDiagReturnData {\n");
    
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    testIdentifier: ").append(toIndentedString(testIdentifier)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
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

