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
 * ChannelDiagDataPatternTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ChannelDiagDataPatternTypeData   {
  

  /**
   * This enumeration data type identifies the types of data patterns that may be used in running the drive channel fault isolation diagnostics.
   */
  public enum TypeEnum {
    fixed("fixed"),
    random("random"),
    __UNDEFINED("__UNDEFINED");
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

    private Integer pattern;

    private Integer randomNumberSeed;

  
  /**
   * This enumeration data type identifies the types of data patterns that may be used in running the drive channel fault isolation diagnostics.
   **/
  public ChannelDiagDataPatternTypeData type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration data type identifies the types of data patterns that may be used in running the drive channel fault isolation diagnostics.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * A four-byte user-supplied data pattern. This field is valid only if type is equal to CHANNEL_DIAG_DATA_PATTERN_FIXED.
   **/
  public ChannelDiagDataPatternTypeData pattern(Integer pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A four-byte user-supplied data pattern. This field is valid only if type is equal to CHANNEL_DIAG_DATA_PATTERN_FIXED.")
  @JsonProperty("pattern")
  public Integer getPattern() {
    return pattern;
  }
  
  public void setPattern(Integer pattern) {
    this.pattern = pattern;
  }

  
  /**
   * A 32-bit value that is used as the seed for a pseudo-random sequence that is used to establish the data pattern. This field is valid only if type is equal to CHANNEL_DIAG_DATA_PATTERN_RANDOM.
   **/
  public ChannelDiagDataPatternTypeData randomNumberSeed(Integer randomNumberSeed) {
    this.randomNumberSeed = randomNumberSeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A 32-bit value that is used as the seed for a pseudo-random sequence that is used to establish the data pattern. This field is valid only if type is equal to CHANNEL_DIAG_DATA_PATTERN_RANDOM.")
  @JsonProperty("randomNumberSeed")
  public Integer getRandomNumberSeed() {
    return randomNumberSeed;
  }
  
  public void setRandomNumberSeed(Integer randomNumberSeed) {
    this.randomNumberSeed = randomNumberSeed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDiagDataPatternTypeData channelDiagDataPatternTypeData = (ChannelDiagDataPatternTypeData) o;
    return Objects.equals(this.type, channelDiagDataPatternTypeData.type) &&
        Objects.equals(this.pattern, channelDiagDataPatternTypeData.pattern) &&
        Objects.equals(this.randomNumberSeed, channelDiagDataPatternTypeData.randomNumberSeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pattern, randomNumberSeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDiagDataPatternTypeData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    randomNumberSeed: ").append(toIndentedString(randomNumberSeed)).append("\n");
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

