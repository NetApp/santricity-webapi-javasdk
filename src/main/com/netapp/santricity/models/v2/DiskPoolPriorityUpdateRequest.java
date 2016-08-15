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
 * DiskPoolPriorityUpdateRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DiskPoolPriorityUpdateRequest   {
  

  /**
   * Pool operation priority
   */
  public enum PriorityEnum {
    invalid("invalid"),
    lowest("lowest"),
    low("low"),
    medium("medium"),
    high("high"),
    highest("highest"),
    useDefault("useDefault"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PriorityEnum priority;


  /**
   * The priority type
   */
  public enum PriorityTypeEnum {
    invalid("invalid"),
    degraded("degraded"),
    critical("critical"),
    background("background"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PriorityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PriorityTypeEnum priorityType;

  
  /**
   * Pool operation priority
   **/
  public DiskPoolPriorityUpdateRequest priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Pool operation priority")
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }
  
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  
  /**
   * The priority type
   **/
  public DiskPoolPriorityUpdateRequest priorityType(PriorityTypeEnum priorityType) {
    this.priorityType = priorityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The priority type")
  @JsonProperty("priorityType")
  public PriorityTypeEnum getPriorityType() {
    return priorityType;
  }
  
  public void setPriorityType(PriorityTypeEnum priorityType) {
    this.priorityType = priorityType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskPoolPriorityUpdateRequest diskPoolPriorityUpdateRequest = (DiskPoolPriorityUpdateRequest) o;
    return Objects.equals(this.priority, diskPoolPriorityUpdateRequest.priority) &&
        Objects.equals(this.priorityType, diskPoolPriorityUpdateRequest.priorityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, priorityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskPoolPriorityUpdateRequest {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityType: ").append(toIndentedString(priorityType)).append("\n");
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

