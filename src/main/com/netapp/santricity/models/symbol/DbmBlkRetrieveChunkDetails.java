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
 * DbmBlkRetrieveChunkDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DbmBlkRetrieveChunkDetails   {
  
    private Integer chunkCRC;

    private Integer blockSize;


  /**
   * indicates whether the overall retrieval process is based on a DBM image containing one or more mirror consistency mismatches.
   */
  public enum BlockConsistencyCheckEnum {
    skipped("skipped"),
    passed("passed"),
    failed("failed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    BlockConsistencyCheckEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private BlockConsistencyCheckEnum blockConsistencyCheck;


  /**
   * Indicates whether the overall image has a structural fault or if the integrity wasn't checked prior to retrieval.
   */
  public enum StructureIntegrityCheckEnum {
    skipped("skipped"),
    passed("passed"),
    failed("failed"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StructureIntegrityCheckEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StructureIntegrityCheckEnum structureIntegrityCheck;

    private List<Integer> sstorLBA;

    private String blockData;


  /**
   * Defines which storage device to read the image from. Repeated here to ensure all chunks were read from the same place.
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
   * CRC data.
   **/
  public DbmBlkRetrieveChunkDetails chunkCRC(Integer chunkCRC) {
    this.chunkCRC = chunkCRC;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CRC data.")
  @JsonProperty("chunkCRC")
  public Integer getChunkCRC() {
    return chunkCRC;
  }
  
  public void setChunkCRC(Integer chunkCRC) {
    this.chunkCRC = chunkCRC;
  }

  
  /**
   * The size of each DBM block (sector).
   **/
  public DbmBlkRetrieveChunkDetails blockSize(Integer blockSize) {
    this.blockSize = blockSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of each DBM block (sector).")
  @JsonProperty("blockSize")
  public Integer getBlockSize() {
    return blockSize;
  }
  
  public void setBlockSize(Integer blockSize) {
    this.blockSize = blockSize;
  }

  
  /**
   * indicates whether the overall retrieval process is based on a DBM image containing one or more mirror consistency mismatches.
   **/
  public DbmBlkRetrieveChunkDetails blockConsistencyCheck(BlockConsistencyCheckEnum blockConsistencyCheck) {
    this.blockConsistencyCheck = blockConsistencyCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "indicates whether the overall retrieval process is based on a DBM image containing one or more mirror consistency mismatches.")
  @JsonProperty("blockConsistencyCheck")
  public BlockConsistencyCheckEnum getBlockConsistencyCheck() {
    return blockConsistencyCheck;
  }
  
  public void setBlockConsistencyCheck(BlockConsistencyCheckEnum blockConsistencyCheck) {
    this.blockConsistencyCheck = blockConsistencyCheck;
  }

  
  /**
   * Indicates whether the overall image has a structural fault or if the integrity wasn't checked prior to retrieval.
   **/
  public DbmBlkRetrieveChunkDetails structureIntegrityCheck(StructureIntegrityCheckEnum structureIntegrityCheck) {
    this.structureIntegrityCheck = structureIntegrityCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether the overall image has a structural fault or if the integrity wasn't checked prior to retrieval.")
  @JsonProperty("structureIntegrityCheck")
  public StructureIntegrityCheckEnum getStructureIntegrityCheck() {
    return structureIntegrityCheck;
  }
  
  public void setStructureIntegrityCheck(StructureIntegrityCheckEnum structureIntegrityCheck) {
    this.structureIntegrityCheck = structureIntegrityCheck;
  }

  
  /**
   * An array identifying the block addresses of the blocks whose data resides in the blockData array
   **/
  public DbmBlkRetrieveChunkDetails sstorLBA(List<Integer> sstorLBA) {
    this.sstorLBA = sstorLBA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array identifying the block addresses of the blocks whose data resides in the blockData array")
  @JsonProperty("sstorLBA")
  public List<Integer> getSstorLBA() {
    return sstorLBA;
  }
  
  public void setSstorLBA(List<Integer> sstorLBA) {
    this.sstorLBA = sstorLBA;
  }

  
  /**
   * An array of block data.
   **/
  public DbmBlkRetrieveChunkDetails blockData(String blockData) {
    this.blockData = blockData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of block data.")
  @JsonProperty("blockData")
  public String getBlockData() {
    return blockData;
  }
  
  public void setBlockData(String blockData) {
    this.blockData = blockData;
  }

  
  /**
   * Defines which storage device to read the image from. Repeated here to ensure all chunks were read from the same place.
   **/
  public DbmBlkRetrieveChunkDetails sourceLocation(SourceLocationEnum sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines which storage device to read the image from. Repeated here to ensure all chunks were read from the same place.")
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
    DbmBlkRetrieveChunkDetails dbmBlkRetrieveChunkDetails = (DbmBlkRetrieveChunkDetails) o;
    return Objects.equals(this.chunkCRC, dbmBlkRetrieveChunkDetails.chunkCRC) &&
        Objects.equals(this.blockSize, dbmBlkRetrieveChunkDetails.blockSize) &&
        Objects.equals(this.blockConsistencyCheck, dbmBlkRetrieveChunkDetails.blockConsistencyCheck) &&
        Objects.equals(this.structureIntegrityCheck, dbmBlkRetrieveChunkDetails.structureIntegrityCheck) &&
        Objects.equals(this.sstorLBA, dbmBlkRetrieveChunkDetails.sstorLBA) &&
        Objects.equals(this.blockData, dbmBlkRetrieveChunkDetails.blockData) &&
        Objects.equals(this.sourceLocation, dbmBlkRetrieveChunkDetails.sourceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkCRC, blockSize, blockConsistencyCheck, structureIntegrityCheck, sstorLBA, blockData, sourceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbmBlkRetrieveChunkDetails {\n");
    
    sb.append("    chunkCRC: ").append(toIndentedString(chunkCRC)).append("\n");
    sb.append("    blockSize: ").append(toIndentedString(blockSize)).append("\n");
    sb.append("    blockConsistencyCheck: ").append(toIndentedString(blockConsistencyCheck)).append("\n");
    sb.append("    structureIntegrityCheck: ").append(toIndentedString(structureIntegrityCheck)).append("\n");
    sb.append("    sstorLBA: ").append(toIndentedString(sstorLBA)).append("\n");
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

