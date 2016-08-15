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
 * RawDataRetrieveChunkDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class RawDataRetrieveChunkDetails   {
  

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

    private DqRetrieveChunkDetails dq;

    private DbmRecRetrieveChunkDetails dbmRec;

    private DbmBlkRetrieveChunkDetails dbmBlk;

    private DbmCheckRetrieveChunkDetails dbmCheck;

    private EnclosureStateCaptureRetrieveChunkDetails enclosureStateCapture;

    private DPLCoreDumpRetrieveChunkDetails dplCoreDump;

    private IoStatisticsRetrieveChunkDetails ioStatistics;

    private FdiDemsLogRetrieveChunkDetails fdiDemsLog;

    private DrivePerformanceHistoryRetrieveChunkDetails drivePerformanceHistory;

    private IOCDumpRetrieveChunkDetails iocDump;

    private DriveHealthLogsChunkDetails driveHealthLogs;

    private PerformanceRingChunkDetails ctrlPerfStats;

    private Dom0SupportDataChunkDetails dom0DataChunkDetails;

    private WlcAnalyticsChunkDetails wlcAnalyticsChunkDetails;

    private AutoLoadBalanceStatsLogRetrieveChunkDetails autoLoadBalanceStatistics;

  
  /**
   * This enumeration lists the raw data transfer types.
   **/
  public RawDataRetrieveChunkDetails rawDataTransferType(RawDataTransferTypeEnum rawDataTransferType) {
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
  public RawDataRetrieveChunkDetails dq(DqRetrieveChunkDetails dq) {
    this.dq = dq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DQ.")
  @JsonProperty("dq")
  public DqRetrieveChunkDetails getDq() {
    return dq;
  }
  
  public void setDq(DqRetrieveChunkDetails dq) {
    this.dq = dq;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DBMREC.
   **/
  public RawDataRetrieveChunkDetails dbmRec(DbmRecRetrieveChunkDetails dbmRec) {
    this.dbmRec = dbmRec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DBMREC.")
  @JsonProperty("dbmRec")
  public DbmRecRetrieveChunkDetails getDbmRec() {
    return dbmRec;
  }
  
  public void setDbmRec(DbmRecRetrieveChunkDetails dbmRec) {
    this.dbmRec = dbmRec;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DBMBLK.
   **/
  public RawDataRetrieveChunkDetails dbmBlk(DbmBlkRetrieveChunkDetails dbmBlk) {
    this.dbmBlk = dbmBlk;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DBMBLK.")
  @JsonProperty("dbmBlk")
  public DbmBlkRetrieveChunkDetails getDbmBlk() {
    return dbmBlk;
  }
  
  public void setDbmBlk(DbmBlkRetrieveChunkDetails dbmBlk) {
    this.dbmBlk = dbmBlk;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DBM_CHECK.
   **/
  public RawDataRetrieveChunkDetails dbmCheck(DbmCheckRetrieveChunkDetails dbmCheck) {
    this.dbmCheck = dbmCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DBM_CHECK.")
  @JsonProperty("dbmCheck")
  public DbmCheckRetrieveChunkDetails getDbmCheck() {
    return dbmCheck;
  }
  
  public void setDbmCheck(DbmCheckRetrieveChunkDetails dbmCheck) {
    this.dbmCheck = dbmCheck;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_ENCLOSURE_STATE_CAPTURE.
   **/
  public RawDataRetrieveChunkDetails enclosureStateCapture(EnclosureStateCaptureRetrieveChunkDetails enclosureStateCapture) {
    this.enclosureStateCapture = enclosureStateCapture;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_ENCLOSURE_STATE_CAPTURE.")
  @JsonProperty("enclosureStateCapture")
  public EnclosureStateCaptureRetrieveChunkDetails getEnclosureStateCapture() {
    return enclosureStateCapture;
  }
  
  public void setEnclosureStateCapture(EnclosureStateCaptureRetrieveChunkDetails enclosureStateCapture) {
    this.enclosureStateCapture = enclosureStateCapture;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DPL_CORE_DUMP_BUNDLE.
   **/
  public RawDataRetrieveChunkDetails dplCoreDump(DPLCoreDumpRetrieveChunkDetails dplCoreDump) {
    this.dplCoreDump = dplCoreDump;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DPL_CORE_DUMP_BUNDLE.")
  @JsonProperty("dplCoreDump")
  public DPLCoreDumpRetrieveChunkDetails getDplCoreDump() {
    return dplCoreDump;
  }
  
  public void setDplCoreDump(DPLCoreDumpRetrieveChunkDetails dplCoreDump) {
    this.dplCoreDump = dplCoreDump;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_IO_STATISTICS.
   **/
  public RawDataRetrieveChunkDetails ioStatistics(IoStatisticsRetrieveChunkDetails ioStatistics) {
    this.ioStatistics = ioStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_IO_STATISTICS.")
  @JsonProperty("ioStatistics")
  public IoStatisticsRetrieveChunkDetails getIoStatistics() {
    return ioStatistics;
  }
  
  public void setIoStatistics(IoStatisticsRetrieveChunkDetails ioStatistics) {
    this.ioStatistics = ioStatistics;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_FDI_DEMS_LOGS.
   **/
  public RawDataRetrieveChunkDetails fdiDemsLog(FdiDemsLogRetrieveChunkDetails fdiDemsLog) {
    this.fdiDemsLog = fdiDemsLog;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_FDI_DEMS_LOGS.")
  @JsonProperty("fdiDemsLog")
  public FdiDemsLogRetrieveChunkDetails getFdiDemsLog() {
    return fdiDemsLog;
  }
  
  public void setFdiDemsLog(FdiDemsLogRetrieveChunkDetails fdiDemsLog) {
    this.fdiDemsLog = fdiDemsLog;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DRIVE_PERFORMANCE_HISTORY.
   **/
  public RawDataRetrieveChunkDetails drivePerformanceHistory(DrivePerformanceHistoryRetrieveChunkDetails drivePerformanceHistory) {
    this.drivePerformanceHistory = drivePerformanceHistory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DRIVE_PERFORMANCE_HISTORY.")
  @JsonProperty("drivePerformanceHistory")
  public DrivePerformanceHistoryRetrieveChunkDetails getDrivePerformanceHistory() {
    return drivePerformanceHistory;
  }
  
  public void setDrivePerformanceHistory(DrivePerformanceHistoryRetrieveChunkDetails drivePerformanceHistory) {
    this.drivePerformanceHistory = drivePerformanceHistory;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_IOC_DUMP.
   **/
  public RawDataRetrieveChunkDetails iocDump(IOCDumpRetrieveChunkDetails iocDump) {
    this.iocDump = iocDump;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_IOC_DUMP.")
  @JsonProperty("iocDump")
  public IOCDumpRetrieveChunkDetails getIocDump() {
    return iocDump;
  }
  
  public void setIocDump(IOCDumpRetrieveChunkDetails iocDump) {
    this.iocDump = iocDump;
  }

  
  /**
   * This is the case for when drive health logs are being returned in the raw data retrieve operation.
   **/
  public RawDataRetrieveChunkDetails driveHealthLogs(DriveHealthLogsChunkDetails driveHealthLogs) {
    this.driveHealthLogs = driveHealthLogs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the case for when drive health logs are being returned in the raw data retrieve operation.")
  @JsonProperty("driveHealthLogs")
  public DriveHealthLogsChunkDetails getDriveHealthLogs() {
    return driveHealthLogs;
  }
  
  public void setDriveHealthLogs(DriveHealthLogsChunkDetails driveHealthLogs) {
    this.driveHealthLogs = driveHealthLogs;
  }

  
  /**
   **/
  public RawDataRetrieveChunkDetails ctrlPerfStats(PerformanceRingChunkDetails ctrlPerfStats) {
    this.ctrlPerfStats = ctrlPerfStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ctrlPerfStats")
  public PerformanceRingChunkDetails getCtrlPerfStats() {
    return ctrlPerfStats;
  }
  
  public void setCtrlPerfStats(PerformanceRingChunkDetails ctrlPerfStats) {
    this.ctrlPerfStats = ctrlPerfStats;
  }

  
  /**
   * This field is present only if the type value is equal to RAWDATA_DOM0_SUPPORT_DATA.
   **/
  public RawDataRetrieveChunkDetails dom0DataChunkDetails(Dom0SupportDataChunkDetails dom0DataChunkDetails) {
    this.dom0DataChunkDetails = dom0DataChunkDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to RAWDATA_DOM0_SUPPORT_DATA.")
  @JsonProperty("dom0DataChunkDetails")
  public Dom0SupportDataChunkDetails getDom0DataChunkDetails() {
    return dom0DataChunkDetails;
  }
  
  public void setDom0DataChunkDetails(Dom0SupportDataChunkDetails dom0DataChunkDetails) {
    this.dom0DataChunkDetails = dom0DataChunkDetails;
  }

  
  /**
   * Data passed back to host application when workload capture data is retrieved.
   **/
  public RawDataRetrieveChunkDetails wlcAnalyticsChunkDetails(WlcAnalyticsChunkDetails wlcAnalyticsChunkDetails) {
    this.wlcAnalyticsChunkDetails = wlcAnalyticsChunkDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data passed back to host application when workload capture data is retrieved.")
  @JsonProperty("wlcAnalyticsChunkDetails")
  public WlcAnalyticsChunkDetails getWlcAnalyticsChunkDetails() {
    return wlcAnalyticsChunkDetails;
  }
  
  public void setWlcAnalyticsChunkDetails(WlcAnalyticsChunkDetails wlcAnalyticsChunkDetails) {
    this.wlcAnalyticsChunkDetails = wlcAnalyticsChunkDetails;
  }

  
  /**
   * Auto Load Balance statistics log data returned to the reqeustor.
   **/
  public RawDataRetrieveChunkDetails autoLoadBalanceStatistics(AutoLoadBalanceStatsLogRetrieveChunkDetails autoLoadBalanceStatistics) {
    this.autoLoadBalanceStatistics = autoLoadBalanceStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Auto Load Balance statistics log data returned to the reqeustor.")
  @JsonProperty("autoLoadBalanceStatistics")
  public AutoLoadBalanceStatsLogRetrieveChunkDetails getAutoLoadBalanceStatistics() {
    return autoLoadBalanceStatistics;
  }
  
  public void setAutoLoadBalanceStatistics(AutoLoadBalanceStatsLogRetrieveChunkDetails autoLoadBalanceStatistics) {
    this.autoLoadBalanceStatistics = autoLoadBalanceStatistics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawDataRetrieveChunkDetails rawDataRetrieveChunkDetails = (RawDataRetrieveChunkDetails) o;
    return Objects.equals(this.rawDataTransferType, rawDataRetrieveChunkDetails.rawDataTransferType) &&
        Objects.equals(this.dq, rawDataRetrieveChunkDetails.dq) &&
        Objects.equals(this.dbmRec, rawDataRetrieveChunkDetails.dbmRec) &&
        Objects.equals(this.dbmBlk, rawDataRetrieveChunkDetails.dbmBlk) &&
        Objects.equals(this.dbmCheck, rawDataRetrieveChunkDetails.dbmCheck) &&
        Objects.equals(this.enclosureStateCapture, rawDataRetrieveChunkDetails.enclosureStateCapture) &&
        Objects.equals(this.dplCoreDump, rawDataRetrieveChunkDetails.dplCoreDump) &&
        Objects.equals(this.ioStatistics, rawDataRetrieveChunkDetails.ioStatistics) &&
        Objects.equals(this.fdiDemsLog, rawDataRetrieveChunkDetails.fdiDemsLog) &&
        Objects.equals(this.drivePerformanceHistory, rawDataRetrieveChunkDetails.drivePerformanceHistory) &&
        Objects.equals(this.iocDump, rawDataRetrieveChunkDetails.iocDump) &&
        Objects.equals(this.driveHealthLogs, rawDataRetrieveChunkDetails.driveHealthLogs) &&
        Objects.equals(this.ctrlPerfStats, rawDataRetrieveChunkDetails.ctrlPerfStats) &&
        Objects.equals(this.dom0DataChunkDetails, rawDataRetrieveChunkDetails.dom0DataChunkDetails) &&
        Objects.equals(this.wlcAnalyticsChunkDetails, rawDataRetrieveChunkDetails.wlcAnalyticsChunkDetails) &&
        Objects.equals(this.autoLoadBalanceStatistics, rawDataRetrieveChunkDetails.autoLoadBalanceStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawDataTransferType, dq, dbmRec, dbmBlk, dbmCheck, enclosureStateCapture, dplCoreDump, ioStatistics, fdiDemsLog, drivePerformanceHistory, iocDump, driveHealthLogs, ctrlPerfStats, dom0DataChunkDetails, wlcAnalyticsChunkDetails, autoLoadBalanceStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawDataRetrieveChunkDetails {\n");
    
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
    sb.append("    ctrlPerfStats: ").append(toIndentedString(ctrlPerfStats)).append("\n");
    sb.append("    dom0DataChunkDetails: ").append(toIndentedString(dom0DataChunkDetails)).append("\n");
    sb.append("    wlcAnalyticsChunkDetails: ").append(toIndentedString(wlcAnalyticsChunkDetails)).append("\n");
    sb.append("    autoLoadBalanceStatistics: ").append(toIndentedString(autoLoadBalanceStatistics)).append("\n");
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

