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
 * FdiDemsLogRetrieveStartDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class FdiDemsLogRetrieveStartDetails   {
  
    private Boolean allLogEntries;

    private Long oldestEntryTimestamp;

    private Boolean allDrives;

    private DriveRefList driveRefs;

  
  /**
   * If true, all log entries will be retrieved and the value of oldestEntryTimestamp will be ignored.
   **/
  public FdiDemsLogRetrieveStartDetails allLogEntries(Boolean allLogEntries) {
    this.allLogEntries = allLogEntries;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, all log entries will be retrieved and the value of oldestEntryTimestamp will be ignored.")
  @JsonProperty("allLogEntries")
  public Boolean getAllLogEntries() {
    return allLogEntries;
  }
  
  public void setAllLogEntries(Boolean allLogEntries) {
    this.allLogEntries = allLogEntries;
  }

  
  /**
   * If allLogEntries is false, log entries will be retrieved if their timestamp is equal to or more recent than this value (measured in seconds since midnight January 1, 1970).
   **/
  public FdiDemsLogRetrieveStartDetails oldestEntryTimestamp(Long oldestEntryTimestamp) {
    this.oldestEntryTimestamp = oldestEntryTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If allLogEntries is false, log entries will be retrieved if their timestamp is equal to or more recent than this value (measured in seconds since midnight January 1, 1970).")
  @JsonProperty("oldestEntryTimestamp")
  public Long getOldestEntryTimestamp() {
    return oldestEntryTimestamp;
  }
  
  public void setOldestEntryTimestamp(Long oldestEntryTimestamp) {
    this.oldestEntryTimestamp = oldestEntryTimestamp;
  }

  
  /**
   * If true, log entries will be retrieved for all drives and the values in driveRefs will be ignored.
   **/
  public FdiDemsLogRetrieveStartDetails allDrives(Boolean allDrives) {
    this.allDrives = allDrives;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, log entries will be retrieved for all drives and the values in driveRefs will be ignored.")
  @JsonProperty("allDrives")
  public Boolean getAllDrives() {
    return allDrives;
  }
  
  public void setAllDrives(Boolean allDrives) {
    this.allDrives = allDrives;
  }

  
  /**
   * If allDrives is false, log entries will be retrieved only for the drives in this list.
   **/
  public FdiDemsLogRetrieveStartDetails driveRefs(DriveRefList driveRefs) {
    this.driveRefs = driveRefs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If allDrives is false, log entries will be retrieved only for the drives in this list.")
  @JsonProperty("driveRefs")
  public DriveRefList getDriveRefs() {
    return driveRefs;
  }
  
  public void setDriveRefs(DriveRefList driveRefs) {
    this.driveRefs = driveRefs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FdiDemsLogRetrieveStartDetails fdiDemsLogRetrieveStartDetails = (FdiDemsLogRetrieveStartDetails) o;
    return Objects.equals(this.allLogEntries, fdiDemsLogRetrieveStartDetails.allLogEntries) &&
        Objects.equals(this.oldestEntryTimestamp, fdiDemsLogRetrieveStartDetails.oldestEntryTimestamp) &&
        Objects.equals(this.allDrives, fdiDemsLogRetrieveStartDetails.allDrives) &&
        Objects.equals(this.driveRefs, fdiDemsLogRetrieveStartDetails.driveRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allLogEntries, oldestEntryTimestamp, allDrives, driveRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FdiDemsLogRetrieveStartDetails {\n");
    
    sb.append("    allLogEntries: ").append(toIndentedString(allLogEntries)).append("\n");
    sb.append("    oldestEntryTimestamp: ").append(toIndentedString(oldestEntryTimestamp)).append("\n");
    sb.append("    allDrives: ").append(toIndentedString(allDrives)).append("\n");
    sb.append("    driveRefs: ").append(toIndentedString(driveRefs)).append("\n");
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

