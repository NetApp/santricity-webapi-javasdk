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
 * SpecificDatabaseMetadata
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SpecificDatabaseMetadata   {
  
    private String controllerRef;


  /**
   * The physical location of the database image.
   */
  public enum DbLocationEnum {
    unknown("unknown"),
    dacstoreDisks("dacstoreDisks"),
    onboardRpa("onboardRpa"),
    hostImage("hostImage"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DbLocationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DbLocationEnum dbLocation;

    private String dbRevision;

    private String dbID;

    private Long dbGenNumber;

    private String diskPoolID;


  /**
   * The database status.
   */
  public enum DbStatusEnum {
    unknown("unknown"),
    optimal("optimal"),
    stale("stale"),
    mismatch("mismatch"),
    invalid("invalid"),
    frozen("frozen"),
    empty("empty"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DbStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DbStatusEnum dbStatus;


  /**
   * The database accessibility mode.
   */
  public enum DbAccessEnum {
    unknown("unknown"),
    offline("offline"),
    readOnly("readOnly"),
    readWrite("readWrite"),
    recoveryMode("recoveryMode"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DbAccessEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DbAccessEnum dbAccess;

  
  /**
   * A reference to the controller. This is unused if the dbLocation field is DACSTORE_DISKS.
   **/
  public SpecificDatabaseMetadata controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the controller. This is unused if the dbLocation field is DACSTORE_DISKS.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * The physical location of the database image.
   **/
  public SpecificDatabaseMetadata dbLocation(DbLocationEnum dbLocation) {
    this.dbLocation = dbLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the database image.")
  @JsonProperty("dbLocation")
  public DbLocationEnum getDbLocation() {
    return dbLocation;
  }
  
  public void setDbLocation(DbLocationEnum dbLocation) {
    this.dbLocation = dbLocation;
  }

  
  /**
   * The database revision.
   **/
  public SpecificDatabaseMetadata dbRevision(String dbRevision) {
    this.dbRevision = dbRevision;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The database revision.")
  @JsonProperty("dbRevision")
  public String getDbRevision() {
    return dbRevision;
  }
  
  public void setDbRevision(String dbRevision) {
    this.dbRevision = dbRevision;
  }

  
  /**
   * The database ID.
   **/
  public SpecificDatabaseMetadata dbID(String dbID) {
    this.dbID = dbID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The database ID.")
  @JsonProperty("dbID")
  public String getDbID() {
    return dbID;
  }
  
  public void setDbID(String dbID) {
    this.dbID = dbID;
  }

  
  /**
   * The database gen number.
   **/
  public SpecificDatabaseMetadata dbGenNumber(Long dbGenNumber) {
    this.dbGenNumber = dbGenNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The database gen number.")
  @JsonProperty("dbGenNumber")
  public Long getDbGenNumber() {
    return dbGenNumber;
  }
  
  public void setDbGenNumber(Long dbGenNumber) {
    this.dbGenNumber = dbGenNumber;
  }

  
  /**
   * The disk pool ID (volume group WWN hash).
   **/
  public SpecificDatabaseMetadata diskPoolID(String diskPoolID) {
    this.diskPoolID = diskPoolID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The disk pool ID (volume group WWN hash).")
  @JsonProperty("diskPoolID")
  public String getDiskPoolID() {
    return diskPoolID;
  }
  
  public void setDiskPoolID(String diskPoolID) {
    this.diskPoolID = diskPoolID;
  }

  
  /**
   * The database status.
   **/
  public SpecificDatabaseMetadata dbStatus(DbStatusEnum dbStatus) {
    this.dbStatus = dbStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The database status.")
  @JsonProperty("dbStatus")
  public DbStatusEnum getDbStatus() {
    return dbStatus;
  }
  
  public void setDbStatus(DbStatusEnum dbStatus) {
    this.dbStatus = dbStatus;
  }

  
  /**
   * The database accessibility mode.
   **/
  public SpecificDatabaseMetadata dbAccess(DbAccessEnum dbAccess) {
    this.dbAccess = dbAccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The database accessibility mode.")
  @JsonProperty("dbAccess")
  public DbAccessEnum getDbAccess() {
    return dbAccess;
  }
  
  public void setDbAccess(DbAccessEnum dbAccess) {
    this.dbAccess = dbAccess;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificDatabaseMetadata specificDatabaseMetadata = (SpecificDatabaseMetadata) o;
    return Objects.equals(this.controllerRef, specificDatabaseMetadata.controllerRef) &&
        Objects.equals(this.dbLocation, specificDatabaseMetadata.dbLocation) &&
        Objects.equals(this.dbRevision, specificDatabaseMetadata.dbRevision) &&
        Objects.equals(this.dbID, specificDatabaseMetadata.dbID) &&
        Objects.equals(this.dbGenNumber, specificDatabaseMetadata.dbGenNumber) &&
        Objects.equals(this.diskPoolID, specificDatabaseMetadata.diskPoolID) &&
        Objects.equals(this.dbStatus, specificDatabaseMetadata.dbStatus) &&
        Objects.equals(this.dbAccess, specificDatabaseMetadata.dbAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, dbLocation, dbRevision, dbID, dbGenNumber, diskPoolID, dbStatus, dbAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificDatabaseMetadata {\n");
    
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    dbLocation: ").append(toIndentedString(dbLocation)).append("\n");
    sb.append("    dbRevision: ").append(toIndentedString(dbRevision)).append("\n");
    sb.append("    dbID: ").append(toIndentedString(dbID)).append("\n");
    sb.append("    dbGenNumber: ").append(toIndentedString(dbGenNumber)).append("\n");
    sb.append("    diskPoolID: ").append(toIndentedString(diskPoolID)).append("\n");
    sb.append("    dbStatus: ").append(toIndentedString(dbStatus)).append("\n");
    sb.append("    dbAccess: ").append(toIndentedString(dbAccess)).append("\n");
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

