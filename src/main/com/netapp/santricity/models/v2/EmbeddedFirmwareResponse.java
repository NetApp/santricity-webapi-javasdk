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
 * Class that holds details on the Firmware upgrade timestamps and logs.
 */
@ApiModel(description = "Class that holds details on the Firmware upgrade timestamps and logs.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class EmbeddedFirmwareResponse   {
  
    private Date cfwUpgradeTS;

    private Date iomUpgradeTS;

    private Date driveUpgradeTS;

    private Date nvsramUpgradeTS;

    private List<LogRecord> cfwLog;

    private List<LogRecord> iomLog;

    private List<LogRecord> driveLog;

    private List<LogRecord> nvsramLog;

  
  /**
   * Timestamp of the last successful controller firmware upgrade
   **/
  public EmbeddedFirmwareResponse cfwUpgradeTS(Date cfwUpgradeTS) {
    this.cfwUpgradeTS = cfwUpgradeTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp of the last successful controller firmware upgrade")
  @JsonProperty("cfwUpgradeTS")
  public Date getCfwUpgradeTS() {
    return cfwUpgradeTS;
  }
  
  public void setCfwUpgradeTS(Date cfwUpgradeTS) {
    this.cfwUpgradeTS = cfwUpgradeTS;
  }

  
  /**
   * Timestamp of the last successful iom firmware upgrade
   **/
  public EmbeddedFirmwareResponse iomUpgradeTS(Date iomUpgradeTS) {
    this.iomUpgradeTS = iomUpgradeTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp of the last successful iom firmware upgrade")
  @JsonProperty("iomUpgradeTS")
  public Date getIomUpgradeTS() {
    return iomUpgradeTS;
  }
  
  public void setIomUpgradeTS(Date iomUpgradeTS) {
    this.iomUpgradeTS = iomUpgradeTS;
  }

  
  /**
   * Timestamp of the last successful drive firmware upgrade
   **/
  public EmbeddedFirmwareResponse driveUpgradeTS(Date driveUpgradeTS) {
    this.driveUpgradeTS = driveUpgradeTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp of the last successful drive firmware upgrade")
  @JsonProperty("driveUpgradeTS")
  public Date getDriveUpgradeTS() {
    return driveUpgradeTS;
  }
  
  public void setDriveUpgradeTS(Date driveUpgradeTS) {
    this.driveUpgradeTS = driveUpgradeTS;
  }

  
  /**
   * Timestamp of the last successful NVSRAM upgrade
   **/
  public EmbeddedFirmwareResponse nvsramUpgradeTS(Date nvsramUpgradeTS) {
    this.nvsramUpgradeTS = nvsramUpgradeTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp of the last successful NVSRAM upgrade")
  @JsonProperty("nvsramUpgradeTS")
  public Date getNvsramUpgradeTS() {
    return nvsramUpgradeTS;
  }
  
  public void setNvsramUpgradeTS(Date nvsramUpgradeTS) {
    this.nvsramUpgradeTS = nvsramUpgradeTS;
  }

  
  /**
   * Array of log records of controller firmware upgrades
   **/
  public EmbeddedFirmwareResponse cfwLog(List<LogRecord> cfwLog) {
    this.cfwLog = cfwLog;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Array of log records of controller firmware upgrades")
  @JsonProperty("cfwLog")
  public List<LogRecord> getCfwLog() {
    return cfwLog;
  }
  
  public void setCfwLog(List<LogRecord> cfwLog) {
    this.cfwLog = cfwLog;
  }

  
  /**
   * Array of log records of iom firmware upgrades
   **/
  public EmbeddedFirmwareResponse iomLog(List<LogRecord> iomLog) {
    this.iomLog = iomLog;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Array of log records of iom firmware upgrades")
  @JsonProperty("iomLog")
  public List<LogRecord> getIomLog() {
    return iomLog;
  }
  
  public void setIomLog(List<LogRecord> iomLog) {
    this.iomLog = iomLog;
  }

  
  /**
   * Array of log records drive firmware upgrades
   **/
  public EmbeddedFirmwareResponse driveLog(List<LogRecord> driveLog) {
    this.driveLog = driveLog;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Array of log records drive firmware upgrades")
  @JsonProperty("driveLog")
  public List<LogRecord> getDriveLog() {
    return driveLog;
  }
  
  public void setDriveLog(List<LogRecord> driveLog) {
    this.driveLog = driveLog;
  }

  
  /**
   * Array of log records NVSRAM upgrades
   **/
  public EmbeddedFirmwareResponse nvsramLog(List<LogRecord> nvsramLog) {
    this.nvsramLog = nvsramLog;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Array of log records NVSRAM upgrades")
  @JsonProperty("nvsramLog")
  public List<LogRecord> getNvsramLog() {
    return nvsramLog;
  }
  
  public void setNvsramLog(List<LogRecord> nvsramLog) {
    this.nvsramLog = nvsramLog;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedFirmwareResponse embeddedFirmwareResponse = (EmbeddedFirmwareResponse) o;
    return Objects.equals(this.cfwUpgradeTS, embeddedFirmwareResponse.cfwUpgradeTS) &&
        Objects.equals(this.iomUpgradeTS, embeddedFirmwareResponse.iomUpgradeTS) &&
        Objects.equals(this.driveUpgradeTS, embeddedFirmwareResponse.driveUpgradeTS) &&
        Objects.equals(this.nvsramUpgradeTS, embeddedFirmwareResponse.nvsramUpgradeTS) &&
        Objects.equals(this.cfwLog, embeddedFirmwareResponse.cfwLog) &&
        Objects.equals(this.iomLog, embeddedFirmwareResponse.iomLog) &&
        Objects.equals(this.driveLog, embeddedFirmwareResponse.driveLog) &&
        Objects.equals(this.nvsramLog, embeddedFirmwareResponse.nvsramLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfwUpgradeTS, iomUpgradeTS, driveUpgradeTS, nvsramUpgradeTS, cfwLog, iomLog, driveLog, nvsramLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedFirmwareResponse {\n");
    
    sb.append("    cfwUpgradeTS: ").append(toIndentedString(cfwUpgradeTS)).append("\n");
    sb.append("    iomUpgradeTS: ").append(toIndentedString(iomUpgradeTS)).append("\n");
    sb.append("    driveUpgradeTS: ").append(toIndentedString(driveUpgradeTS)).append("\n");
    sb.append("    nvsramUpgradeTS: ").append(toIndentedString(nvsramUpgradeTS)).append("\n");
    sb.append("    cfwLog: ").append(toIndentedString(cfwLog)).append("\n");
    sb.append("    iomLog: ").append(toIndentedString(iomLog)).append("\n");
    sb.append("    driveLog: ").append(toIndentedString(driveLog)).append("\n");
    sb.append("    nvsramLog: ").append(toIndentedString(nvsramLog)).append("\n");
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

