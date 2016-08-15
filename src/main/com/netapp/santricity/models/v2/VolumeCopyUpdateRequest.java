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
 * Updates a Volume Copy.
 */
@ApiModel(description = "Updates a Volume Copy.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class VolumeCopyUpdateRequest   {
  

  /**
   * The priority of the copy job (0 is the lowest priority, 4 is the highest priority). Defaults to priority 2.
   */
  public enum CopyPriorityEnum {
    priority0("priority0"),
    priority1("priority1"),
    priority2("priority2"),
    priority3("priority3"),
    priority4("priority4"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CopyPriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CopyPriorityEnum copyPriority;

    private Boolean targetWriteProtected;

  
  /**
   * The priority of the copy job (0 is the lowest priority, 4 is the highest priority). Defaults to priority 2.
   **/
  public VolumeCopyUpdateRequest copyPriority(CopyPriorityEnum copyPriority) {
    this.copyPriority = copyPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority of the copy job (0 is the lowest priority, 4 is the highest priority). Defaults to priority 2.")
  @JsonProperty("copyPriority")
  public CopyPriorityEnum getCopyPriority() {
    return copyPriority;
  }
  
  public void setCopyPriority(CopyPriorityEnum copyPriority) {
    this.copyPriority = copyPriority;
  }

  
  /**
   * Specifies whether to block write I/O to the target volume while the       copy job exists.
   **/
  public VolumeCopyUpdateRequest targetWriteProtected(Boolean targetWriteProtected) {
    this.targetWriteProtected = targetWriteProtected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies whether to block write I/O to the target volume while the       copy job exists.")
  @JsonProperty("targetWriteProtected")
  public Boolean getTargetWriteProtected() {
    return targetWriteProtected;
  }
  
  public void setTargetWriteProtected(Boolean targetWriteProtected) {
    this.targetWriteProtected = targetWriteProtected;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCopyUpdateRequest volumeCopyUpdateRequest = (VolumeCopyUpdateRequest) o;
    return Objects.equals(this.copyPriority, volumeCopyUpdateRequest.copyPriority) &&
        Objects.equals(this.targetWriteProtected, volumeCopyUpdateRequest.targetWriteProtected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyPriority, targetWriteProtected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCopyUpdateRequest {\n");
    
    sb.append("    copyPriority: ").append(toIndentedString(copyPriority)).append("\n");
    sb.append("    targetWriteProtected: ").append(toIndentedString(targetWriteProtected)).append("\n");
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

