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
 * RawDataRetrieveStartDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RawDataRetrieveStartDetails   {
  

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

    private DqRetrieveStartDetails dq;

    private DbmRecRetrieveStartDetails dbmRec;

    private DbmBlkRetrieveStartDetails dbmBlk;

    private DbmCheckRetrieveStartDetails dbmCheck;

    private EnclosureStateCaptureRetrieveStartDetails enclosureStateCapture;

    private DPLCoreDumpRetrieveStartDetails dplCoreDump;

    private IoStatisticsRetrieveStartDetails ioStatistics;

    private FdiDemsLogRetrieveStartDetails fdiDemsLog;

    private DrivePerformanceHistoryRetrieveStartDetails drivePerformanceHistory;

    private IOCDumpRetrieveStartDetails iocDump;

    private DriveHealthLogsStartDetails driveHealthLogs;

    private PerformanceRingStartDetails ctrlPerformanceParms;

    private Dom0SupportDataStartDetails dom0SupportDataStartDetails;

    private WlcAnalyticsStartDetails wlcAnalyticsStartDetails;

    private AutoLoadBalanceStatsLogRetrieveStartDetails autoLoadBalanceStatisticsLog;

  
  /**
   * This enumeration lists the raw data transfer types.
   **/
  public RawDataRetrieveStartDetails rawDataTransferType(RawDataTransferTypeEnum rawDataTransferType) {
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
   * This field is present only if the type value is equal to RAWDATA_DQ.
   **/
  public RawDataRetrieveStartDetails dq(DqRetrieveStartDetails dq) {
    this.dq = dq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DQ.")
  @JsonProperty("dq")
  public DqRetrieveStartDetails getDq() {
    return dq;
  }
  
  public void setDq(DqRetrieveStartDetails dq) {
    this.dq = dq;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DBMREC.
   **/
  public RawDataRetrieveStartDetails dbmRec(DbmRecRetrieveStartDetails dbmRec) {
    this.dbmRec = dbmRec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DBMREC.")
  @JsonProperty("dbmRec")
  public DbmRecRetrieveStartDetails getDbmRec() {
    return dbmRec;
  }
  
  public void setDbmRec(DbmRecRetrieveStartDetails dbmRec) {
    this.dbmRec = dbmRec;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DBMBLK.
   **/
  public RawDataRetrieveStartDetails dbmBlk(DbmBlkRetrieveStartDetails dbmBlk) {
    this.dbmBlk = dbmBlk;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DBMBLK.")
  @JsonProperty("dbmBlk")
  public DbmBlkRetrieveStartDetails getDbmBlk() {
    return dbmBlk;
  }
  
  public void setDbmBlk(DbmBlkRetrieveStartDetails dbmBlk) {
    this.dbmBlk = dbmBlk;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DBM_CHECK.
   **/
  public RawDataRetrieveStartDetails dbmCheck(DbmCheckRetrieveStartDetails dbmCheck) {
    this.dbmCheck = dbmCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DBM_CHECK.")
  @JsonProperty("dbmCheck")
  public DbmCheckRetrieveStartDetails getDbmCheck() {
    return dbmCheck;
  }
  
  public void setDbmCheck(DbmCheckRetrieveStartDetails dbmCheck) {
    this.dbmCheck = dbmCheck;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_ENCLOSURE_STATE_CAPTURE.
   **/
  public RawDataRetrieveStartDetails enclosureStateCapture(EnclosureStateCaptureRetrieveStartDetails enclosureStateCapture) {
    this.enclosureStateCapture = enclosureStateCapture;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_ENCLOSURE_STATE_CAPTURE.")
  @JsonProperty("enclosureStateCapture")
  public EnclosureStateCaptureRetrieveStartDetails getEnclosureStateCapture() {
    return enclosureStateCapture;
  }
  
  public void setEnclosureStateCapture(EnclosureStateCaptureRetrieveStartDetails enclosureStateCapture) {
    this.enclosureStateCapture = enclosureStateCapture;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DPL_CORE_DUMP_BUNDLE.
   **/
  public RawDataRetrieveStartDetails dplCoreDump(DPLCoreDumpRetrieveStartDetails dplCoreDump) {
    this.dplCoreDump = dplCoreDump;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DPL_CORE_DUMP_BUNDLE.")
  @JsonProperty("dplCoreDump")
  public DPLCoreDumpRetrieveStartDetails getDplCoreDump() {
    return dplCoreDump;
  }
  
  public void setDplCoreDump(DPLCoreDumpRetrieveStartDetails dplCoreDump) {
    this.dplCoreDump = dplCoreDump;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_IO_STATISTICS.
   **/
  public RawDataRetrieveStartDetails ioStatistics(IoStatisticsRetrieveStartDetails ioStatistics) {
    this.ioStatistics = ioStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_IO_STATISTICS.")
  @JsonProperty("ioStatistics")
  public IoStatisticsRetrieveStartDetails getIoStatistics() {
    return ioStatistics;
  }
  
  public void setIoStatistics(IoStatisticsRetrieveStartDetails ioStatistics) {
    this.ioStatistics = ioStatistics;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_FDI_DEMS_LOGS.
   **/
  public RawDataRetrieveStartDetails fdiDemsLog(FdiDemsLogRetrieveStartDetails fdiDemsLog) {
    this.fdiDemsLog = fdiDemsLog;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_FDI_DEMS_LOGS.")
  @JsonProperty("fdiDemsLog")
  public FdiDemsLogRetrieveStartDetails getFdiDemsLog() {
    return fdiDemsLog;
  }
  
  public void setFdiDemsLog(FdiDemsLogRetrieveStartDetails fdiDemsLog) {
    this.fdiDemsLog = fdiDemsLog;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DRIVE_PERFORMANCE_HISTORY.
   **/
  public RawDataRetrieveStartDetails drivePerformanceHistory(DrivePerformanceHistoryRetrieveStartDetails drivePerformanceHistory) {
    this.drivePerformanceHistory = drivePerformanceHistory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DRIVE_PERFORMANCE_HISTORY.")
  @JsonProperty("drivePerformanceHistory")
  public DrivePerformanceHistoryRetrieveStartDetails getDrivePerformanceHistory() {
    return drivePerformanceHistory;
  }
  
  public void setDrivePerformanceHistory(DrivePerformanceHistoryRetrieveStartDetails drivePerformanceHistory) {
    this.drivePerformanceHistory = drivePerformanceHistory;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_IOC_DUMP.
   **/
  public RawDataRetrieveStartDetails iocDump(IOCDumpRetrieveStartDetails iocDump) {
    this.iocDump = iocDump;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_IOC_DUMP.")
  @JsonProperty("iocDump")
  public IOCDumpRetrieveStartDetails getIocDump() {
    return iocDump;
  }
  
  public void setIocDump(IOCDumpRetrieveStartDetails iocDump) {
    this.iocDump = iocDump;
  }

  
  /**
   * This is the case for when drive health logs are being returned in the raw data retrieve operation.
   **/
  public RawDataRetrieveStartDetails driveHealthLogs(DriveHealthLogsStartDetails driveHealthLogs) {
    this.driveHealthLogs = driveHealthLogs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the case for when drive health logs are being returned in the raw data retrieve operation.")
  @JsonProperty("driveHealthLogs")
  public DriveHealthLogsStartDetails getDriveHealthLogs() {
    return driveHealthLogs;
  }
  
  public void setDriveHealthLogs(DriveHealthLogsStartDetails driveHealthLogs) {
    this.driveHealthLogs = driveHealthLogs;
  }

  
  /**
   **/
  public RawDataRetrieveStartDetails ctrlPerformanceParms(PerformanceRingStartDetails ctrlPerformanceParms) {
    this.ctrlPerformanceParms = ctrlPerformanceParms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ctrlPerformanceParms")
  public PerformanceRingStartDetails getCtrlPerformanceParms() {
    return ctrlPerformanceParms;
  }
  
  public void setCtrlPerformanceParms(PerformanceRingStartDetails ctrlPerformanceParms) {
    this.ctrlPerformanceParms = ctrlPerformanceParms;
  }

  
  /**
   * Specifies the details required to start Dom0 support data retrieval for each data type.
   **/
  public RawDataRetrieveStartDetails dom0SupportDataStartDetails(Dom0SupportDataStartDetails dom0SupportDataStartDetails) {
    this.dom0SupportDataStartDetails = dom0SupportDataStartDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the details required to start Dom0 support data retrieval for each data type.")
  @JsonProperty("dom0SupportDataStartDetails")
  public Dom0SupportDataStartDetails getDom0SupportDataStartDetails() {
    return dom0SupportDataStartDetails;
  }
  
  public void setDom0SupportDataStartDetails(Dom0SupportDataStartDetails dom0SupportDataStartDetails) {
    this.dom0SupportDataStartDetails = dom0SupportDataStartDetails;
  }

  
  /**
   * Data to be used for the start of workload analytics data retrieve.
   **/
  public RawDataRetrieveStartDetails wlcAnalyticsStartDetails(WlcAnalyticsStartDetails wlcAnalyticsStartDetails) {
    this.wlcAnalyticsStartDetails = wlcAnalyticsStartDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data to be used for the start of workload analytics data retrieve.")
  @JsonProperty("wlcAnalyticsStartDetails")
  public WlcAnalyticsStartDetails getWlcAnalyticsStartDetails() {
    return wlcAnalyticsStartDetails;
  }
  
  public void setWlcAnalyticsStartDetails(WlcAnalyticsStartDetails wlcAnalyticsStartDetails) {
    this.wlcAnalyticsStartDetails = wlcAnalyticsStartDetails;
  }

  
  /**
   * Specifies the details to start an Auto Load Balance statistics log data retrieval.
   **/
  public RawDataRetrieveStartDetails autoLoadBalanceStatisticsLog(AutoLoadBalanceStatsLogRetrieveStartDetails autoLoadBalanceStatisticsLog) {
    this.autoLoadBalanceStatisticsLog = autoLoadBalanceStatisticsLog;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the details to start an Auto Load Balance statistics log data retrieval.")
  @JsonProperty("autoLoadBalanceStatisticsLog")
  public AutoLoadBalanceStatsLogRetrieveStartDetails getAutoLoadBalanceStatisticsLog() {
    return autoLoadBalanceStatisticsLog;
  }
  
  public void setAutoLoadBalanceStatisticsLog(AutoLoadBalanceStatsLogRetrieveStartDetails autoLoadBalanceStatisticsLog) {
    this.autoLoadBalanceStatisticsLog = autoLoadBalanceStatisticsLog;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawDataRetrieveStartDetails rawDataRetrieveStartDetails = (RawDataRetrieveStartDetails) o;
    return Objects.equals(this.rawDataTransferType, rawDataRetrieveStartDetails.rawDataTransferType) &&
        Objects.equals(this.dq, rawDataRetrieveStartDetails.dq) &&
        Objects.equals(this.dbmRec, rawDataRetrieveStartDetails.dbmRec) &&
        Objects.equals(this.dbmBlk, rawDataRetrieveStartDetails.dbmBlk) &&
        Objects.equals(this.dbmCheck, rawDataRetrieveStartDetails.dbmCheck) &&
        Objects.equals(this.enclosureStateCapture, rawDataRetrieveStartDetails.enclosureStateCapture) &&
        Objects.equals(this.dplCoreDump, rawDataRetrieveStartDetails.dplCoreDump) &&
        Objects.equals(this.ioStatistics, rawDataRetrieveStartDetails.ioStatistics) &&
        Objects.equals(this.fdiDemsLog, rawDataRetrieveStartDetails.fdiDemsLog) &&
        Objects.equals(this.drivePerformanceHistory, rawDataRetrieveStartDetails.drivePerformanceHistory) &&
        Objects.equals(this.iocDump, rawDataRetrieveStartDetails.iocDump) &&
        Objects.equals(this.driveHealthLogs, rawDataRetrieveStartDetails.driveHealthLogs) &&
        Objects.equals(this.ctrlPerformanceParms, rawDataRetrieveStartDetails.ctrlPerformanceParms) &&
        Objects.equals(this.dom0SupportDataStartDetails, rawDataRetrieveStartDetails.dom0SupportDataStartDetails) &&
        Objects.equals(this.wlcAnalyticsStartDetails, rawDataRetrieveStartDetails.wlcAnalyticsStartDetails) &&
        Objects.equals(this.autoLoadBalanceStatisticsLog, rawDataRetrieveStartDetails.autoLoadBalanceStatisticsLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawDataTransferType, dq, dbmRec, dbmBlk, dbmCheck, enclosureStateCapture, dplCoreDump, ioStatistics, fdiDemsLog, drivePerformanceHistory, iocDump, driveHealthLogs, ctrlPerformanceParms, dom0SupportDataStartDetails, wlcAnalyticsStartDetails, autoLoadBalanceStatisticsLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawDataRetrieveStartDetails {\n");
    
    sb.append("    rawDataTransferType: ").append(toIndentedString(rawDataTransferType)).append("\n");
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    dbmRec: ").append(toIndentedString(dbmRec)).append("\n");
    sb.append("    dbmBlk: ").append(toIndentedString(dbmBlk)).append("\n");
    sb.append("    dbmCheck: ").append(toIndentedString(dbmCheck)).append("\n");
    sb.append("    enclosureStateCapture: ").append(toIndentedString(enclosureStateCapture)).append("\n");
    sb.append("    dplCoreDump: ").append(toIndentedString(dplCoreDump)).append("\n");
    sb.append("    ioStatistics: ").append(toIndentedString(ioStatistics)).append("\n");
    sb.append("    fdiDemsLog: ").append(toIndentedString(fdiDemsLog)).append("\n");
    sb.append("    drivePerformanceHistory: ").append(toIndentedString(drivePerformanceHistory)).append("\n");
    sb.append("    iocDump: ").append(toIndentedString(iocDump)).append("\n");
    sb.append("    driveHealthLogs: ").append(toIndentedString(driveHealthLogs)).append("\n");
    sb.append("    ctrlPerformanceParms: ").append(toIndentedString(ctrlPerformanceParms)).append("\n");
    sb.append("    dom0SupportDataStartDetails: ").append(toIndentedString(dom0SupportDataStartDetails)).append("\n");
    sb.append("    wlcAnalyticsStartDetails: ").append(toIndentedString(wlcAnalyticsStartDetails)).append("\n");
    sb.append("    autoLoadBalanceStatisticsLog: ").append(toIndentedString(autoLoadBalanceStatisticsLog)).append("\n");
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

