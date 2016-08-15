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
 * RLSCount
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RLSCount   {
  
    private Integer linkFailureCount;

    private Integer lossOfSyncCount;

    private Integer lossOfSignalCount;

    private Integer primSeqProtocolErr;

    private Integer invalidXmitWord;

    private Integer invalidCRCCount;

  
  /**
   * The number of link failures.
   **/
  public RLSCount linkFailureCount(Integer linkFailureCount) {
    this.linkFailureCount = linkFailureCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of link failures.")
  @JsonProperty("linkFailureCount")
  public Integer getLinkFailureCount() {
    return linkFailureCount;
  }
  
  public void setLinkFailureCount(Integer linkFailureCount) {
    this.linkFailureCount = linkFailureCount;
  }

  
  /**
   * The number of synchronization losses.
   **/
  public RLSCount lossOfSyncCount(Integer lossOfSyncCount) {
    this.lossOfSyncCount = lossOfSyncCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of synchronization losses.")
  @JsonProperty("lossOfSyncCount")
  public Integer getLossOfSyncCount() {
    return lossOfSyncCount;
  }
  
  public void setLossOfSyncCount(Integer lossOfSyncCount) {
    this.lossOfSyncCount = lossOfSyncCount;
  }

  
  /**
   * The number of signal losses.
   **/
  public RLSCount lossOfSignalCount(Integer lossOfSignalCount) {
    this.lossOfSignalCount = lossOfSignalCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of signal losses.")
  @JsonProperty("lossOfSignalCount")
  public Integer getLossOfSignalCount() {
    return lossOfSignalCount;
  }
  
  public void setLossOfSignalCount(Integer lossOfSignalCount) {
    this.lossOfSignalCount = lossOfSignalCount;
  }

  
  /**
   * The number of primary sequence protocol failures.
   **/
  public RLSCount primSeqProtocolErr(Integer primSeqProtocolErr) {
    this.primSeqProtocolErr = primSeqProtocolErr;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of primary sequence protocol failures.")
  @JsonProperty("primSeqProtocolErr")
  public Integer getPrimSeqProtocolErr() {
    return primSeqProtocolErr;
  }
  
  public void setPrimSeqProtocolErr(Integer primSeqProtocolErr) {
    this.primSeqProtocolErr = primSeqProtocolErr;
  }

  
  /**
   * The number of invalid transmit word failures.
   **/
  public RLSCount invalidXmitWord(Integer invalidXmitWord) {
    this.invalidXmitWord = invalidXmitWord;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of invalid transmit word failures.")
  @JsonProperty("invalidXmitWord")
  public Integer getInvalidXmitWord() {
    return invalidXmitWord;
  }
  
  public void setInvalidXmitWord(Integer invalidXmitWord) {
    this.invalidXmitWord = invalidXmitWord;
  }

  
  /**
   * The number of invalid CRC failures.
   **/
  public RLSCount invalidCRCCount(Integer invalidCRCCount) {
    this.invalidCRCCount = invalidCRCCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of invalid CRC failures.")
  @JsonProperty("invalidCRCCount")
  public Integer getInvalidCRCCount() {
    return invalidCRCCount;
  }
  
  public void setInvalidCRCCount(Integer invalidCRCCount) {
    this.invalidCRCCount = invalidCRCCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RLSCount rLSCount = (RLSCount) o;
    return Objects.equals(this.linkFailureCount, rLSCount.linkFailureCount) &&
        Objects.equals(this.lossOfSyncCount, rLSCount.lossOfSyncCount) &&
        Objects.equals(this.lossOfSignalCount, rLSCount.lossOfSignalCount) &&
        Objects.equals(this.primSeqProtocolErr, rLSCount.primSeqProtocolErr) &&
        Objects.equals(this.invalidXmitWord, rLSCount.invalidXmitWord) &&
        Objects.equals(this.invalidCRCCount, rLSCount.invalidCRCCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkFailureCount, lossOfSyncCount, lossOfSignalCount, primSeqProtocolErr, invalidXmitWord, invalidCRCCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RLSCount {\n");
    
    sb.append("    linkFailureCount: ").append(toIndentedString(linkFailureCount)).append("\n");
    sb.append("    lossOfSyncCount: ").append(toIndentedString(lossOfSyncCount)).append("\n");
    sb.append("    lossOfSignalCount: ").append(toIndentedString(lossOfSignalCount)).append("\n");
    sb.append("    primSeqProtocolErr: ").append(toIndentedString(primSeqProtocolErr)).append("\n");
    sb.append("    invalidXmitWord: ").append(toIndentedString(invalidXmitWord)).append("\n");
    sb.append("    invalidCRCCount: ").append(toIndentedString(invalidCRCCount)).append("\n");
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

