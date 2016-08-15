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
 * DbmCheckRetrieveChunkDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DbmCheckRetrieveChunkDetails   {
  

  /**
   * If the consistency check is successful, this field will be set to DBM_VALIDATION_OK, otherwise it will contain a specific failure code. The returnCode field in RawDataRetrieveResult will always be set to RETCODE_OK.
   */
  public enum ValidationStatusEnum {
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

    ValidationStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ValidationStatusEnum validationStatus;

    private String blockData;


  /**
   * Specifies which storage device contains the image to be checked.
   */
  public enum SourceLocationEnum {
    unknown("unknown"),
    dacstoreDisks("dacstoreDisks"),
    onboardRpa("onboardRpa"),
    hostImage("hostImage"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SourceLocationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SourceLocationEnum sourceLocation;

  
  /**
   * If the consistency check is successful, this field will be set to DBM_VALIDATION_OK, otherwise it will contain a specific failure code. The returnCode field in RawDataRetrieveResult will always be set to RETCODE_OK.
   **/
  public DbmCheckRetrieveChunkDetails validationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If the consistency check is successful, this field will be set to DBM_VALIDATION_OK, otherwise it will contain a specific failure code. The returnCode field in RawDataRetrieveResult will always be set to RETCODE_OK.")
  @JsonProperty("validationStatus")
  public ValidationStatusEnum getValidationStatus() {
    return validationStatus;
  }
  
  public void setValidationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
  }

  
  /**
   * An array of opaque data fields will be returned.
   **/
  public DbmCheckRetrieveChunkDetails blockData(String blockData) {
    this.blockData = blockData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of opaque data fields will be returned.")
  @JsonProperty("blockData")
  public String getBlockData() {
    return blockData;
  }
  
  public void setBlockData(String blockData) {
    this.blockData = blockData;
  }

  
  /**
   * Specifies which storage device contains the image to be checked.
   **/
  public DbmCheckRetrieveChunkDetails sourceLocation(SourceLocationEnum sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies which storage device contains the image to be checked.")
  @JsonProperty("sourceLocation")
  public SourceLocationEnum getSourceLocation() {
    return sourceLocation;
  }
  
  public void setSourceLocation(SourceLocationEnum sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbmCheckRetrieveChunkDetails dbmCheckRetrieveChunkDetails = (DbmCheckRetrieveChunkDetails) o;
    return Objects.equals(this.validationStatus, dbmCheckRetrieveChunkDetails.validationStatus) &&
        Objects.equals(this.blockData, dbmCheckRetrieveChunkDetails.blockData) &&
        Objects.equals(this.sourceLocation, dbmCheckRetrieveChunkDetails.sourceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationStatus, blockData, sourceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbmCheckRetrieveChunkDetails {\n");
    
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    blockData: ").append(toIndentedString(blockData)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
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

