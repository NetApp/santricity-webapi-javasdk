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
 * DbmBlkRetrieveStartDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DbmBlkRetrieveStartDetails   {
  
    private Boolean omitUnallocatedBlocks;

    private Boolean skipBlockCoherencyCheck;

    private Boolean skipStructureIntegrityCheck;


  /**
   * Defines which storage device to read the image from.
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
   * When true, unallocated blocks are omitted from the retrieved data.
   **/
  public DbmBlkRetrieveStartDetails omitUnallocatedBlocks(Boolean omitUnallocatedBlocks) {
    this.omitUnallocatedBlocks = omitUnallocatedBlocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When true, unallocated blocks are omitted from the retrieved data.")
  @JsonProperty("omitUnallocatedBlocks")
  public Boolean getOmitUnallocatedBlocks() {
    return omitUnallocatedBlocks;
  }
  
  public void setOmitUnallocatedBlocks(Boolean omitUnallocatedBlocks) {
    this.omitUnallocatedBlocks = omitUnallocatedBlocks;
  }

  
  /**
   * When true, the block coherency check is not performed during the preparation phase of the data transfer.
   **/
  public DbmBlkRetrieveStartDetails skipBlockCoherencyCheck(Boolean skipBlockCoherencyCheck) {
    this.skipBlockCoherencyCheck = skipBlockCoherencyCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When true, the block coherency check is not performed during the preparation phase of the data transfer.")
  @JsonProperty("skipBlockCoherencyCheck")
  public Boolean getSkipBlockCoherencyCheck() {
    return skipBlockCoherencyCheck;
  }
  
  public void setSkipBlockCoherencyCheck(Boolean skipBlockCoherencyCheck) {
    this.skipBlockCoherencyCheck = skipBlockCoherencyCheck;
  }

  
  /**
   * When true, the structure integrity check is not performed during the preparation phase of the data transfer.
   **/
  public DbmBlkRetrieveStartDetails skipStructureIntegrityCheck(Boolean skipStructureIntegrityCheck) {
    this.skipStructureIntegrityCheck = skipStructureIntegrityCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When true, the structure integrity check is not performed during the preparation phase of the data transfer.")
  @JsonProperty("skipStructureIntegrityCheck")
  public Boolean getSkipStructureIntegrityCheck() {
    return skipStructureIntegrityCheck;
  }
  
  public void setSkipStructureIntegrityCheck(Boolean skipStructureIntegrityCheck) {
    this.skipStructureIntegrityCheck = skipStructureIntegrityCheck;
  }

  
  /**
   * Defines which storage device to read the image from.
   **/
  public DbmBlkRetrieveStartDetails sourceLocation(SourceLocationEnum sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines which storage device to read the image from.")
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
    DbmBlkRetrieveStartDetails dbmBlkRetrieveStartDetails = (DbmBlkRetrieveStartDetails) o;
    return Objects.equals(this.omitUnallocatedBlocks, dbmBlkRetrieveStartDetails.omitUnallocatedBlocks) &&
        Objects.equals(this.skipBlockCoherencyCheck, dbmBlkRetrieveStartDetails.skipBlockCoherencyCheck) &&
        Objects.equals(this.skipStructureIntegrityCheck, dbmBlkRetrieveStartDetails.skipStructureIntegrityCheck) &&
        Objects.equals(this.sourceLocation, dbmBlkRetrieveStartDetails.sourceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(omitUnallocatedBlocks, skipBlockCoherencyCheck, skipStructureIntegrityCheck, sourceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbmBlkRetrieveStartDetails {\n");
    
    sb.append("    omitUnallocatedBlocks: ").append(toIndentedString(omitUnallocatedBlocks)).append("\n");
    sb.append("    skipBlockCoherencyCheck: ").append(toIndentedString(skipBlockCoherencyCheck)).append("\n");
    sb.append("    skipStructureIntegrityCheck: ").append(toIndentedString(skipStructureIntegrityCheck)).append("\n");
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

