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
 * RawDataRetrieveContinueDesc
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RawDataRetrieveContinueDesc   {
  

  /**
   * The raw data transfer type (dq, dbm, or unknown).
   */
  public enum TypeEnum {
    unknown("unknown"),
    dq("dq"),
    dbmblk("dbmblk"),
    dbmrec("dbmrec"),
    dbmCheck("dbmCheck"),
    enclosureStateCapture("enclosureStateCapture"),
    dplCoreDumpBundle("dplCoreDumpBundle"),
    ioStatistics("ioStatistics"),
    fdiDemsLogs("fdiDemsLogs"),
    drivePerformanceHistory("drivePerformanceHistory"),
    iocDump("iocDump"),
    driveHealthLogs("driveHealthLogs"),
    ctrlPerfLogs("ctrlPerfLogs"),
    dom0SupportData("dom0SupportData"),
    retrieveWlcAnalytics("retrieveWlcAnalytics"),
    autoLoadBalanceStatisticsLog("autoLoadBalanceStatisticsLog"),
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

    private Integer sequenceNumber;

    private String controllerRef;

  
  /**
   * The raw data transfer type (dq, dbm, or unknown).
   **/
  public RawDataRetrieveContinueDesc type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The raw data transfer type (dq, dbm, or unknown).")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * sequence number of the next chunk of data to be retrieved.
   **/
  public RawDataRetrieveContinueDesc sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "sequence number of the next chunk of data to be retrieved.")
  @JsonProperty("sequenceNumber")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }
  
  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  
  /**
   * The controller running the retrieve.
   **/
  public RawDataRetrieveContinueDesc controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller running the retrieve.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawDataRetrieveContinueDesc rawDataRetrieveContinueDesc = (RawDataRetrieveContinueDesc) o;
    return Objects.equals(this.type, rawDataRetrieveContinueDesc.type) &&
        Objects.equals(this.sequenceNumber, rawDataRetrieveContinueDesc.sequenceNumber) &&
        Objects.equals(this.controllerRef, rawDataRetrieveContinueDesc.controllerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sequenceNumber, controllerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawDataRetrieveContinueDesc {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
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

