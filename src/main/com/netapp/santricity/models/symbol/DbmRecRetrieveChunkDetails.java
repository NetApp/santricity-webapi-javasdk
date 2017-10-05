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
 * DbmRecRetrieveChunkDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DbmRecRetrieveChunkDetails   {
  

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

    private Integer totalImageSize;

    private Integer timestamp;

    private Long configGen;

    private String chunkData;


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
   * Which record types to check.
   */
  public enum ConfigTypeEnum {
    configNone("configNone"),
    traditionalConfig("traditionalConfig"),
    configAll("configAll"),
    partialConfig("partialConfig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ConfigTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ConfigTypeEnum configType;

  
  /**
   * Indicates whether the overall image has a structural fault or if the integrity wasn't checked prior to retrieval.
   **/
  public DbmRecRetrieveChunkDetails structureIntegrityCheck(StructureIntegrityCheckEnum structureIntegrityCheck) {
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
   * The size of the image that will be retrieved.
   **/
  public DbmRecRetrieveChunkDetails totalImageSize(Integer totalImageSize) {
    this.totalImageSize = totalImageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the image that will be retrieved.")
  @JsonProperty("totalImageSize")
  public Integer getTotalImageSize() {
    return totalImageSize;
  }
  
  public void setTotalImageSize(Integer totalImageSize) {
    this.totalImageSize = totalImageSize;
  }

  
  /**
   * Indicates when the image was retrieved.
   **/
  public DbmRecRetrieveChunkDetails timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates when the image was retrieved.")
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * The value of the configuration gen number when the image was retrieved.
   **/
  public DbmRecRetrieveChunkDetails configGen(Long configGen) {
    this.configGen = configGen;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of the configuration gen number when the image was retrieved.")
  @JsonProperty("configGen")
  public Long getConfigGen() {
    return configGen;
  }
  
  public void setConfigGen(Long configGen) {
    this.configGen = configGen;
  }

  
  /**
   * The data chunk.
   **/
  public DbmRecRetrieveChunkDetails chunkData(String chunkData) {
    this.chunkData = chunkData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data chunk.")
  @JsonProperty("chunkData")
  public String getChunkData() {
    return chunkData;
  }
  
  public void setChunkData(String chunkData) {
    this.chunkData = chunkData;
  }

  
  /**
   * Defines which storage device to read the image from. Repeated here to ensure all chunks were read from the same place.
   **/
  public DbmRecRetrieveChunkDetails sourceLocation(SourceLocationEnum sourceLocation) {
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

  
  /**
   * Which record types to check.
   **/
  public DbmRecRetrieveChunkDetails configType(ConfigTypeEnum configType) {
    this.configType = configType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Which record types to check.")
  @JsonProperty("configType")
  public ConfigTypeEnum getConfigType() {
    return configType;
  }
  
  public void setConfigType(ConfigTypeEnum configType) {
    this.configType = configType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbmRecRetrieveChunkDetails dbmRecRetrieveChunkDetails = (DbmRecRetrieveChunkDetails) o;
    return Objects.equals(this.structureIntegrityCheck, dbmRecRetrieveChunkDetails.structureIntegrityCheck) &&
        Objects.equals(this.totalImageSize, dbmRecRetrieveChunkDetails.totalImageSize) &&
        Objects.equals(this.timestamp, dbmRecRetrieveChunkDetails.timestamp) &&
        Objects.equals(this.configGen, dbmRecRetrieveChunkDetails.configGen) &&
        Objects.equals(this.chunkData, dbmRecRetrieveChunkDetails.chunkData) &&
        Objects.equals(this.sourceLocation, dbmRecRetrieveChunkDetails.sourceLocation) &&
        Objects.equals(this.configType, dbmRecRetrieveChunkDetails.configType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(structureIntegrityCheck, totalImageSize, timestamp, configGen, chunkData, sourceLocation, configType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbmRecRetrieveChunkDetails {\n");
    
    sb.append("    structureIntegrityCheck: ").append(toIndentedString(structureIntegrityCheck)).append("\n");
    sb.append("    totalImageSize: ").append(toIndentedString(totalImageSize)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    configGen: ").append(toIndentedString(configGen)).append("\n");
    sb.append("    chunkData: ").append(toIndentedString(chunkData)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
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

