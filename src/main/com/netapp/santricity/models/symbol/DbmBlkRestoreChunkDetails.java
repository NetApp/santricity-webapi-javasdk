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
 * DbmBlkRestoreChunkDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DbmBlkRestoreChunkDetails   {
  
    private Integer chunkCRC;

    private Integer blockSize;

    private List<Integer> sstorLBA;

    private String blockData;

  
  /**
   * CRC data.
   **/
  public DbmBlkRestoreChunkDetails chunkCRC(Integer chunkCRC) {
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
   * The size of each dbm block (sector).
   **/
  public DbmBlkRestoreChunkDetails blockSize(Integer blockSize) {
    this.blockSize = blockSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of each dbm block (sector).")
  @JsonProperty("blockSize")
  public Integer getBlockSize() {
    return blockSize;
  }
  
  public void setBlockSize(Integer blockSize) {
    this.blockSize = blockSize;
  }

  
  /**
   * An array identifying the block addresses of the blocks whose data resides in the blockData array
   **/
  public DbmBlkRestoreChunkDetails sstorLBA(List<Integer> sstorLBA) {
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
  public DbmBlkRestoreChunkDetails blockData(String blockData) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbmBlkRestoreChunkDetails dbmBlkRestoreChunkDetails = (DbmBlkRestoreChunkDetails) o;
    return Objects.equals(this.chunkCRC, dbmBlkRestoreChunkDetails.chunkCRC) &&
        Objects.equals(this.blockSize, dbmBlkRestoreChunkDetails.blockSize) &&
        Objects.equals(this.sstorLBA, dbmBlkRestoreChunkDetails.sstorLBA) &&
        Objects.equals(this.blockData, dbmBlkRestoreChunkDetails.blockData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkCRC, blockSize, sstorLBA, blockData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbmBlkRestoreChunkDetails {\n");
    
    sb.append("    chunkCRC: ").append(toIndentedString(chunkCRC)).append("\n");
    sb.append("    blockSize: ").append(toIndentedString(blockSize)).append("\n");
    sb.append("    sstorLBA: ").append(toIndentedString(sstorLBA)).append("\n");
    sb.append("    blockData: ").append(toIndentedString(blockData)).append("\n");
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

