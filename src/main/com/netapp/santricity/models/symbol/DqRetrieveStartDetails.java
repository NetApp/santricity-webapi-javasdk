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
 * DqRetrieveStartDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DqRetrieveStartDetails   {
  
    private Boolean compress;


  /**
   * set to the type of trace buffers to retrieve
   */
  public enum TraceIDEnum {
    dqtraceCurrent("dqtraceCurrent"),
    rawdataFlushed("rawdataFlushed"),
    rawdataAll("rawdataAll"),
    rawdataAllIncludePlatform("rawdataAllIncludePlatform"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TraceIDEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TraceIDEnum traceID;

    private Boolean flushCurrent;

  
  /**
   * When set to true, the data is compressed for the retrieval.
   **/
  public DqRetrieveStartDetails compress(Boolean compress) {
    this.compress = compress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When set to true, the data is compressed for the retrieval.")
  @JsonProperty("compress")
  public Boolean getCompress() {
    return compress;
  }
  
  public void setCompress(Boolean compress) {
    this.compress = compress;
  }

  
  /**
   * set to the type of trace buffers to retrieve
   **/
  public DqRetrieveStartDetails traceID(TraceIDEnum traceID) {
    this.traceID = traceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "set to the type of trace buffers to retrieve")
  @JsonProperty("traceID")
  public TraceIDEnum getTraceID() {
    return traceID;
  }
  
  public void setTraceID(TraceIDEnum traceID) {
    this.traceID = traceID;
  }

  
  /**
   * indicates whether the retrieved buffer is to be flushed
   **/
  public DqRetrieveStartDetails flushCurrent(Boolean flushCurrent) {
    this.flushCurrent = flushCurrent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "indicates whether the retrieved buffer is to be flushed")
  @JsonProperty("flushCurrent")
  public Boolean getFlushCurrent() {
    return flushCurrent;
  }
  
  public void setFlushCurrent(Boolean flushCurrent) {
    this.flushCurrent = flushCurrent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DqRetrieveStartDetails dqRetrieveStartDetails = (DqRetrieveStartDetails) o;
    return Objects.equals(this.compress, dqRetrieveStartDetails.compress) &&
        Objects.equals(this.traceID, dqRetrieveStartDetails.traceID) &&
        Objects.equals(this.flushCurrent, dqRetrieveStartDetails.flushCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compress, traceID, flushCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DqRetrieveStartDetails {\n");
    
    sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
    sb.append("    traceID: ").append(toIndentedString(traceID)).append("\n");
    sb.append("    flushCurrent: ").append(toIndentedString(flushCurrent)).append("\n");
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

