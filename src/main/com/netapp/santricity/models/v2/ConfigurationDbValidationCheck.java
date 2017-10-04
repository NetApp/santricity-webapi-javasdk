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
 * ConfigurationDbValidationCheck
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ConfigurationDbValidationCheck   {
  

  /**
   * Gets or Sets result
   */
  public enum ResultEnum {
    ok("ok"),
    notCompleted("notCompleted"),
    failedDataRetrieval("failedDataRetrieval"),
    failed("failed");
;
    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ResultEnum result;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    melEventCheck("melEventCheck"),
    cntrlSyncCheck("cntrlSyncCheck"),
    storageDeviceAccessible("storageDeviceAccessible"),
    spmDatabaseVerification("spmDatabaseVerification"),
    validPassword("validPassword"),
    configurationDatabaseCheck("configurationDatabaseCheck"),
    objectGraphSyncCheck("objectGraphSyncCheck"),
    nvsramMatches("nvsramMatches"),
    volumeGroupsComplete("volumeGroupsComplete"),
    controllerStatusOptimal("controllerStatusOptimal"),
    hotSparesInUse("hotSparesInUse"),
    failedDrivesPresent("failedDrivesPresent"),
    driveCheck("driveCheck"),
    missingVolumes("missingVolumes"),
    exclusiveOperations("exclusiveOperations");
;
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TypeEnum type;


  /**
   * Gets or Sets severityLevel
   */
  public enum SeverityLevelEnum {
    unknown("unknown"),
    low("low"),
    medium("medium"),
    high("high"),
    fatal("fatal");
;
    private String value;

    SeverityLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SeverityLevelEnum severityLevel;


  /**
   * Status of the database validation check
   */
  public enum StatusEnum {
    ok("ok"),
    noHeap("noHeap"),
    ioError("ioError"),
    earlyExecution("earlyExecution"),
    fatalFsInvalid("fatalFsInvalid"),
    fatalRootOutOfBounds("fatalRootOutOfBounds"),
    fatalDupBlockPointers("fatalDupBlockPointers"),
    fatalDirOutOfBounds("fatalDirOutOfBounds"),
    fatalCorruptMetadata("fatalCorruptMetadata"),
    fatalMissingMetadata("fatalMissingMetadata"),
    fatalRecOutOfBounds("fatalRecOutOfBounds"),
    fatalDupRecPointers("fatalDupRecPointers"),
    fatalRecordUnallocated("fatalRecordUnallocated"),
    fatalOrphanBlock("fatalOrphanBlock"),
    fatalFsOffline("fatalFsOffline"),
    noDrives("noDrives"),
    lockError("lockError"),
    fatalMirrorMismatch("fatalMirrorMismatch"),
    mirrorNotReady("mirrorNotReady"),
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

    private Boolean successful;

  
  /**
   **/
  public ConfigurationDbValidationCheck result(ResultEnum result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("result")
  public ResultEnum getResult() {
    return result;
  }
  
  public void setResult(ResultEnum result) {
    this.result = result;
  }

  
  /**
   **/
  public ConfigurationDbValidationCheck type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public ConfigurationDbValidationCheck severityLevel(SeverityLevelEnum severityLevel) {
    this.severityLevel = severityLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("severityLevel")
  public SeverityLevelEnum getSeverityLevel() {
    return severityLevel;
  }
  
  public void setSeverityLevel(SeverityLevelEnum severityLevel) {
    this.severityLevel = severityLevel;
  }

  
  /**
   * Status of the database validation check
   **/
  public ConfigurationDbValidationCheck status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status of the database validation check")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public ConfigurationDbValidationCheck successful(Boolean successful) {
    this.successful = successful;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("successful")
  public Boolean getSuccessful() {
    return successful;
  }
  
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationDbValidationCheck configurationDbValidationCheck = (ConfigurationDbValidationCheck) o;
    return Objects.equals(this.result, configurationDbValidationCheck.result) &&
        Objects.equals(this.type, configurationDbValidationCheck.type) &&
        Objects.equals(this.severityLevel, configurationDbValidationCheck.severityLevel) &&
        Objects.equals(this.status, configurationDbValidationCheck.status) &&
        Objects.equals(this.successful, configurationDbValidationCheck.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, type, severityLevel, status, successful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationDbValidationCheck {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

