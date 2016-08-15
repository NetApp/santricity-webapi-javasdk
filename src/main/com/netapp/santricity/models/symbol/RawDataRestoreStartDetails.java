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
 * RawDataRestoreStartDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RawDataRestoreStartDetails   {
  

  /**
   * This enumeration lists the raw data transfer types.
   */
  public enum RawDataTransferTypeEnum {
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

    RawDataTransferTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RawDataTransferTypeEnum rawDataTransferType;

    private DbmBlkRestoreStartDetails dbmBlk;

    private DbmRecRestoreStartDetails dbmRec;

  
  /**
   * This enumeration lists the raw data transfer types.
   **/
  public RawDataRestoreStartDetails rawDataTransferType(RawDataTransferTypeEnum rawDataTransferType) {
    this.rawDataTransferType = rawDataTransferType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration lists the raw data transfer types.")
  @JsonProperty("rawDataTransferType")
  public RawDataTransferTypeEnum getRawDataTransferType() {
    return rawDataTransferType;
  }
  
  public void setRawDataTransferType(RawDataTransferTypeEnum rawDataTransferType) {
    this.rawDataTransferType = rawDataTransferType;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DBMBLK.
   **/
  public RawDataRestoreStartDetails dbmBlk(DbmBlkRestoreStartDetails dbmBlk) {
    this.dbmBlk = dbmBlk;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DBMBLK.")
  @JsonProperty("dbmBlk")
  public DbmBlkRestoreStartDetails getDbmBlk() {
    return dbmBlk;
  }
  
  public void setDbmBlk(DbmBlkRestoreStartDetails dbmBlk) {
    this.dbmBlk = dbmBlk;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DBMREC.
   **/
  public RawDataRestoreStartDetails dbmRec(DbmRecRestoreStartDetails dbmRec) {
    this.dbmRec = dbmRec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DBMREC.")
  @JsonProperty("dbmRec")
  public DbmRecRestoreStartDetails getDbmRec() {
    return dbmRec;
  }
  
  public void setDbmRec(DbmRecRestoreStartDetails dbmRec) {
    this.dbmRec = dbmRec;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawDataRestoreStartDetails rawDataRestoreStartDetails = (RawDataRestoreStartDetails) o;
    return Objects.equals(this.rawDataTransferType, rawDataRestoreStartDetails.rawDataTransferType) &&
        Objects.equals(this.dbmBlk, rawDataRestoreStartDetails.dbmBlk) &&
        Objects.equals(this.dbmRec, rawDataRestoreStartDetails.dbmRec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawDataTransferType, dbmBlk, dbmRec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawDataRestoreStartDetails {\n");
    
    sb.append("    rawDataTransferType: ").append(toIndentedString(rawDataTransferType)).append("\n");
    sb.append("    dbmBlk: ").append(toIndentedString(dbmBlk)).append("\n");
    sb.append("    dbmRec: ").append(toIndentedString(dbmRec)).append("\n");
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

