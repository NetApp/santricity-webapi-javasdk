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
 * DbmRecRestoreStartDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DbmRecRestoreStartDetails   {
  
    private Integer totalImageSize;

    private String validator;


  /**
   * Which record type to restore.
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
   * The storage medium containing the restore source image.
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

    private Boolean skipMismatchCheck;

  
  /**
   * Contains the size of the entire restore image.
   **/
  public DbmRecRestoreStartDetails totalImageSize(Integer totalImageSize) {
    this.totalImageSize = totalImageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains the size of the entire restore image.")
  @JsonProperty("totalImageSize")
  public Integer getTotalImageSize() {
    return totalImageSize;
  }
  
  public void setTotalImageSize(Integer totalImageSize) {
    this.totalImageSize = totalImageSize;
  }

  
  /**
   * A hash of the controller serial numbers.
   **/
  public DbmRecRestoreStartDetails validator(String validator) {
    this.validator = validator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A hash of the controller serial numbers.")
  @JsonProperty("validator")
  public String getValidator() {
    return validator;
  }
  
  public void setValidator(String validator) {
    this.validator = validator;
  }

  
  /**
   * Which record type to restore.
   **/
  public DbmRecRestoreStartDetails configType(ConfigTypeEnum configType) {
    this.configType = configType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Which record type to restore.")
  @JsonProperty("configType")
  public ConfigTypeEnum getConfigType() {
    return configType;
  }
  
  public void setConfigType(ConfigTypeEnum configType) {
    this.configType = configType;
  }

  
  /**
   * The storage medium containing the restore source image.
   **/
  public DbmRecRestoreStartDetails sourceLocation(SourceLocationEnum sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The storage medium containing the restore source image.")
  @JsonProperty("sourceLocation")
  public SourceLocationEnum getSourceLocation() {
    return sourceLocation;
  }
  
  public void setSourceLocation(SourceLocationEnum sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  
  /**
   * If true, then skip any checks to certify that the image being restored from matches this array.
   **/
  public DbmRecRestoreStartDetails skipMismatchCheck(Boolean skipMismatchCheck) {
    this.skipMismatchCheck = skipMismatchCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, then skip any checks to certify that the image being restored from matches this array.")
  @JsonProperty("skipMismatchCheck")
  public Boolean getSkipMismatchCheck() {
    return skipMismatchCheck;
  }
  
  public void setSkipMismatchCheck(Boolean skipMismatchCheck) {
    this.skipMismatchCheck = skipMismatchCheck;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbmRecRestoreStartDetails dbmRecRestoreStartDetails = (DbmRecRestoreStartDetails) o;
    return Objects.equals(this.totalImageSize, dbmRecRestoreStartDetails.totalImageSize) &&
        Objects.equals(this.validator, dbmRecRestoreStartDetails.validator) &&
        Objects.equals(this.configType, dbmRecRestoreStartDetails.configType) &&
        Objects.equals(this.sourceLocation, dbmRecRestoreStartDetails.sourceLocation) &&
        Objects.equals(this.skipMismatchCheck, dbmRecRestoreStartDetails.skipMismatchCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalImageSize, validator, configType, sourceLocation, skipMismatchCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbmRecRestoreStartDetails {\n");
    
    sb.append("    totalImageSize: ").append(toIndentedString(totalImageSize)).append("\n");
    sb.append("    validator: ").append(toIndentedString(validator)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
    sb.append("    skipMismatchCheck: ").append(toIndentedString(skipMismatchCheck)).append("\n");
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

