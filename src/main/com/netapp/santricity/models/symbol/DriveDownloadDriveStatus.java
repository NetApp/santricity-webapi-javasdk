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
 * DriveDownloadDriveStatus
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DriveDownloadDriveStatus   {
  
    private String driveRef;


  /**
   * The drive download status.
   */
  public enum StatusEnum {
    okay("okay"),
    invalidDriveref("invalidDriveref"),
    duplicateDrive("duplicateDrive"),
    notAttempted("notAttempted"),
    invalidState("invalidState"),
    inProgress("inProgress"),
    partialUpdate("partialUpdate"),
    failedUpdate("failedUpdate"),
    inProgressRecon("inProgressRecon"),
    pending("pending"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;

    private Integer percentComplete;

  
  /**
   * The drive reference.
   **/
  public DriveDownloadDriveStatus driveRef(String driveRef) {
    this.driveRef = driveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The drive reference.")
  @JsonProperty("driveRef")
  public String getDriveRef() {
    return driveRef;
  }
  
  public void setDriveRef(String driveRef) {
    this.driveRef = driveRef;
  }

  
  /**
   * The drive download status.
   **/
  public DriveDownloadDriveStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The drive download status.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Will be set to zero unless the DriveDownloadStatus is equal to DRIVE_DL_STAT_IN_PROGRESS_RECON (meaning a reconstruction is in progress).
   **/
  public DriveDownloadDriveStatus percentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Will be set to zero unless the DriveDownloadStatus is equal to DRIVE_DL_STAT_IN_PROGRESS_RECON (meaning a reconstruction is in progress).")
  @JsonProperty("percentComplete")
  public Integer getPercentComplete() {
    return percentComplete;
  }
  
  public void setPercentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveDownloadDriveStatus driveDownloadDriveStatus = (DriveDownloadDriveStatus) o;
    return Objects.equals(this.driveRef, driveDownloadDriveStatus.driveRef) &&
        Objects.equals(this.status, driveDownloadDriveStatus.status) &&
        Objects.equals(this.percentComplete, driveDownloadDriveStatus.percentComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveRef, status, percentComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveDownloadDriveStatus {\n");
    
    sb.append("    driveRef: ").append(toIndentedString(driveRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
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

