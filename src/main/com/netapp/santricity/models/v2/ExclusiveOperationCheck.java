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
 * ExclusiveOperationCheck
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class ExclusiveOperationCheck   {
  

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
   * Gets or Sets inner
   */
  public enum InnerEnum {
    none("none"),
    copyback("copyback"),
    initializing("initializing"),
    reconstructing("reconstructing"),
    remappingDce("remappingDce"),
    remappingDrm("remappingDrm"),
    remappingDcedrm("remappingDcedrm"),
    remappingDseg("remappingDseg"),
    remappingDve("remappingDve"),
    remappingDcedve("remappingDcedve"),
    remappingInternal("remappingInternal"),
    remappingDefrag("remappingDefrag"),
    formatting("formatting"),
    synchronizing("synchronizing"),
    parityScan("parityScan"),
    volumeCopy("volumeCopy"),
    snapshotRollback("snapshotRollback"),
    pitRollback("pitRollback"),
    asyncMirrorGroupInitialSync("asyncMirrorGroupInitialSync"),
    reconstructingCritical("reconstructingCritical"),
    rebalancing("rebalancing"),
    copyThenFail("copyThenFail"),
    copyThenFailPending("copyThenFailPending"),
    copyThenReplace("copyThenReplace"),
    copyThenReplaceAndFail("copyThenReplaceAndFail"),
    thinDefrag("thinDefrag"),
    creating("creating"),
    deleting("deleting"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    InnerEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private Map<String, String> volumeRefToAction;

    private Boolean successful;

  
  /**
   **/
  public ExclusiveOperationCheck result(ResultEnum result) {
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
  public ExclusiveOperationCheck type(TypeEnum type) {
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
  public ExclusiveOperationCheck severityLevel(SeverityLevelEnum severityLevel) {
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
   **/
  public ExclusiveOperationCheck volumeRefToAction(Map<String, String> volumeRefToAction) {
    this.volumeRefToAction = volumeRefToAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("volumeRefToAction")
  public Map<String, String> getVolumeRefToAction() {
    return volumeRefToAction;
  }
  
  public void setVolumeRefToAction(Map<String, String> volumeRefToAction) {
    this.volumeRefToAction = volumeRefToAction;
  }

  
  /**
   **/
  public ExclusiveOperationCheck successful(Boolean successful) {
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
    ExclusiveOperationCheck exclusiveOperationCheck = (ExclusiveOperationCheck) o;
    return Objects.equals(this.result, exclusiveOperationCheck.result) &&
        Objects.equals(this.type, exclusiveOperationCheck.type) &&
        Objects.equals(this.severityLevel, exclusiveOperationCheck.severityLevel) &&
        Objects.equals(this.volumeRefToAction, exclusiveOperationCheck.volumeRefToAction) &&
        Objects.equals(this.successful, exclusiveOperationCheck.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, type, severityLevel, volumeRefToAction, successful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExclusiveOperationCheck {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
    sb.append("    volumeRefToAction: ").append(toIndentedString(volumeRefToAction)).append("\n");
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

