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
 * PITViewRepositoryUtilization
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PITViewRepositoryUtilization   {
  
    private Long viewBytesUsed;

    private Long viewBytesAvailable;

    private String viewRef;

  
  /**
   * The number of bytes used in the repository for the view metadata, copy-on-write indexes, and copy-on-write data.
   **/
  public PITViewRepositoryUtilization viewBytesUsed(Long viewBytesUsed) {
    this.viewBytesUsed = viewBytesUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes used in the repository for the view metadata, copy-on-write indexes, and copy-on-write data.")
  @JsonProperty("viewBytesUsed")
  public Long getViewBytesUsed() {
    return viewBytesUsed;
  }
  
  public void setViewBytesUsed(Long viewBytesUsed) {
    this.viewBytesUsed = viewBytesUsed;
  }

  
  /**
   * The total number of bytes available for ongoing copy-on-write operations.
   **/
  public PITViewRepositoryUtilization viewBytesAvailable(Long viewBytesAvailable) {
    this.viewBytesAvailable = viewBytesAvailable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of bytes available for ongoing copy-on-write operations.")
  @JsonProperty("viewBytesAvailable")
  public Long getViewBytesAvailable() {
    return viewBytesAvailable;
  }
  
  public void setViewBytesAvailable(Long viewBytesAvailable) {
    this.viewBytesAvailable = viewBytesAvailable;
  }

  
  /**
   * The ViewRef for which this utilization applies.
   **/
  public PITViewRepositoryUtilization viewRef(String viewRef) {
    this.viewRef = viewRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ViewRef for which this utilization applies.")
  @JsonProperty("viewRef")
  public String getViewRef() {
    return viewRef;
  }
  
  public void setViewRef(String viewRef) {
    this.viewRef = viewRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITViewRepositoryUtilization pITViewRepositoryUtilization = (PITViewRepositoryUtilization) o;
    return Objects.equals(this.viewBytesUsed, pITViewRepositoryUtilization.viewBytesUsed) &&
        Objects.equals(this.viewBytesAvailable, pITViewRepositoryUtilization.viewBytesAvailable) &&
        Objects.equals(this.viewRef, pITViewRepositoryUtilization.viewRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewBytesUsed, viewBytesAvailable, viewRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITViewRepositoryUtilization {\n");
    
    sb.append("    viewBytesUsed: ").append(toIndentedString(viewBytesUsed)).append("\n");
    sb.append("    viewBytesAvailable: ").append(toIndentedString(viewBytesAvailable)).append("\n");
    sb.append("    viewRef: ").append(toIndentedString(viewRef)).append("\n");
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

