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
 * TimeZoneDescription
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class TimeZoneDescription   {
  
    private String tzLabel;

    private Integer tzOffset;

    private DaylightSavingsTime dstStart;

    private DaylightSavingsTime dstEnd;

    private Integer dstAdjust;

  
  /**
   * The time zone identifier (ASCII).
   **/
  public TimeZoneDescription tzLabel(String tzLabel) {
    this.tzLabel = tzLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time zone identifier (ASCII).")
  @JsonProperty("tzLabel")
  public String getTzLabel() {
    return tzLabel;
  }
  
  public void setTzLabel(String tzLabel) {
    this.tzLabel = tzLabel;
  }

  
  /**
   * The time zone offset measured in seconds +/- from GMT.
   **/
  public TimeZoneDescription tzOffset(Integer tzOffset) {
    this.tzOffset = tzOffset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time zone offset measured in seconds +/- from GMT.")
  @JsonProperty("tzOffset")
  public Integer getTzOffset() {
    return tzOffset;
  }
  
  public void setTzOffset(Integer tzOffset) {
    this.tzOffset = tzOffset;
  }

  
  /**
   * The DST start date and time.
   **/
  public TimeZoneDescription dstStart(DaylightSavingsTime dstStart) {
    this.dstStart = dstStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The DST start date and time.")
  @JsonProperty("dstStart")
  public DaylightSavingsTime getDstStart() {
    return dstStart;
  }
  
  public void setDstStart(DaylightSavingsTime dstStart) {
    this.dstStart = dstStart;
  }

  
  /**
   * The DST end date and time.
   **/
  public TimeZoneDescription dstEnd(DaylightSavingsTime dstEnd) {
    this.dstEnd = dstEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The DST end date and time.")
  @JsonProperty("dstEnd")
  public DaylightSavingsTime getDstEnd() {
    return dstEnd;
  }
  
  public void setDstEnd(DaylightSavingsTime dstEnd) {
    this.dstEnd = dstEnd;
  }

  
  /**
   * The number of seconds to adjust the clock during DST
   **/
  public TimeZoneDescription dstAdjust(Integer dstAdjust) {
    this.dstAdjust = dstAdjust;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of seconds to adjust the clock during DST")
  @JsonProperty("dstAdjust")
  public Integer getDstAdjust() {
    return dstAdjust;
  }
  
  public void setDstAdjust(Integer dstAdjust) {
    this.dstAdjust = dstAdjust;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeZoneDescription timeZoneDescription = (TimeZoneDescription) o;
    return Objects.equals(this.tzLabel, timeZoneDescription.tzLabel) &&
        Objects.equals(this.tzOffset, timeZoneDescription.tzOffset) &&
        Objects.equals(this.dstStart, timeZoneDescription.dstStart) &&
        Objects.equals(this.dstEnd, timeZoneDescription.dstEnd) &&
        Objects.equals(this.dstAdjust, timeZoneDescription.dstAdjust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tzLabel, tzOffset, dstStart, dstEnd, dstAdjust);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZoneDescription {\n");
    
    sb.append("    tzLabel: ").append(toIndentedString(tzLabel)).append("\n");
    sb.append("    tzOffset: ").append(toIndentedString(tzOffset)).append("\n");
    sb.append("    dstStart: ").append(toIndentedString(dstStart)).append("\n");
    sb.append("    dstEnd: ").append(toIndentedString(dstEnd)).append("\n");
    sb.append("    dstAdjust: ").append(toIndentedString(dstAdjust)).append("\n");
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

