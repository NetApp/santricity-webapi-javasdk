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
 * PITRepositoryUtilization
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PITRepositoryUtilization   {
  
    private String pitRef;

    private Long bytesUsed;

  
  /**
   * A reference to the specific PiT for which utilization is being reported.
   **/
  public PITRepositoryUtilization pitRef(String pitRef) {
    this.pitRef = pitRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the specific PiT for which utilization is being reported.")
  @JsonProperty("pitRef")
  public String getPitRef() {
    return pitRef;
  }
  
  public void setPitRef(String pitRef) {
    this.pitRef = pitRef;
  }

  
  /**
   * The total number of bytes in use in the repository for this specific PiTs metadata, copy-on-write indexes, and copy-on-write data.
   **/
  public PITRepositoryUtilization bytesUsed(Long bytesUsed) {
    this.bytesUsed = bytesUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of bytes in use in the repository for this specific PiTs metadata, copy-on-write indexes, and copy-on-write data.")
  @JsonProperty("bytesUsed")
  public Long getBytesUsed() {
    return bytesUsed;
  }
  
  public void setBytesUsed(Long bytesUsed) {
    this.bytesUsed = bytesUsed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PITRepositoryUtilization pITRepositoryUtilization = (PITRepositoryUtilization) o;
    return Objects.equals(this.pitRef, pITRepositoryUtilization.pitRef) &&
        Objects.equals(this.bytesUsed, pITRepositoryUtilization.bytesUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pitRef, bytesUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PITRepositoryUtilization {\n");
    
    sb.append("    pitRef: ").append(toIndentedString(pitRef)).append("\n");
    sb.append("    bytesUsed: ").append(toIndentedString(bytesUsed)).append("\n");
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

