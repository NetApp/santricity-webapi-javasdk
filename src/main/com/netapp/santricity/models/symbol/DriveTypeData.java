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
 * DriveTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DriveTypeData   {
  

  /**
   * This enumeration type is used to distinguish between the different I/O protocols used by the controller to communicate with drives. This is not necessarily the same as the physical drive interface type (PhysicalDriveType).
   */
  public enum DriveTypeEnum {
    scsi("scsi"),
    fibre("fibre"),
    unknown("unknown"),
    sas("sas"),
    sata("sata"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DriveTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DriveTypeEnum driveType;

    private List<FibreDriveAddress> fibre;

    private SasDriveAddress sas;

    private SCSIDriveAddress scsi;

  
  /**
   * This enumeration type is used to distinguish between the different I/O protocols used by the controller to communicate with drives. This is not necessarily the same as the physical drive interface type (PhysicalDriveType).
   **/
  public DriveTypeData driveType(DriveTypeEnum driveType) {
    this.driveType = driveType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration type is used to distinguish between the different I/O protocols used by the controller to communicate with drives. This is not necessarily the same as the physical drive interface type (PhysicalDriveType).")
  @JsonProperty("driveType")
  public DriveTypeEnum getDriveType() {
    return driveType;
  }
  
  public void setDriveType(DriveTypeEnum driveType) {
    this.driveType = driveType;
  }

  
  /**
   * This field is present only if the driveType value is DRIVE_TYPE_FIBRE. It contains the address information for a Fibre Channel drive. Such drives are typically multi-ported, so there will be one element in this variable-length array for each I/O port on the drive. The first element in the array is the drive address on the preferred channel, and the second element is the drive address on the redundant channel.
   **/
  public DriveTypeData fibre(List<FibreDriveAddress> fibre) {
    this.fibre = fibre;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the driveType value is DRIVE_TYPE_FIBRE. It contains the address information for a Fibre Channel drive. Such drives are typically multi-ported, so there will be one element in this variable-length array for each I/O port on the drive. The first element in the array is the drive address on the preferred channel, and the second element is the drive address on the redundant channel.")
  @JsonProperty("fibre")
  public List<FibreDriveAddress> getFibre() {
    return fibre;
  }
  
  public void setFibre(List<FibreDriveAddress> fibre) {
    this.fibre = fibre;
  }

  
  /**
   * This field is present only if the driveType value is DRIVE_TYPE_SAS. It contains the address information for a serial-attached SCSI drive.
   **/
  public DriveTypeData sas(SasDriveAddress sas) {
    this.sas = sas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the driveType value is DRIVE_TYPE_SAS. It contains the address information for a serial-attached SCSI drive.")
  @JsonProperty("sas")
  public SasDriveAddress getSas() {
    return sas;
  }
  
  public void setSas(SasDriveAddress sas) {
    this.sas = sas;
  }

  
  /**
   * This field is present only if the driveType value is DRIVE_TYPE_SCSI. It contains the address information for a SCSI drive.
   **/
  public DriveTypeData scsi(SCSIDriveAddress scsi) {
    this.scsi = scsi;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the driveType value is DRIVE_TYPE_SCSI. It contains the address information for a SCSI drive.")
  @JsonProperty("scsi")
  public SCSIDriveAddress getScsi() {
    return scsi;
  }
  
  public void setScsi(SCSIDriveAddress scsi) {
    this.scsi = scsi;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveTypeData driveTypeData = (DriveTypeData) o;
    return Objects.equals(this.driveType, driveTypeData.driveType) &&
        Objects.equals(this.fibre, driveTypeData.fibre) &&
        Objects.equals(this.sas, driveTypeData.sas) &&
        Objects.equals(this.scsi, driveTypeData.scsi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveType, fibre, sas, scsi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveTypeData {\n");
    
    sb.append("    driveType: ").append(toIndentedString(driveType)).append("\n");
    sb.append("    fibre: ").append(toIndentedString(fibre)).append("\n");
    sb.append("    sas: ").append(toIndentedString(sas)).append("\n");
    sb.append("    scsi: ").append(toIndentedString(scsi)).append("\n");
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

