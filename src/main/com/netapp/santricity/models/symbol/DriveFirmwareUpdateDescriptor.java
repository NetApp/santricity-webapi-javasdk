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
 * DriveFirmwareUpdateDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DriveFirmwareUpdateDescriptor   {
  
    private String driveRef;

    private Boolean modeSelectFile;

    private FirmwareUpdateDescriptor firmwareUpdateDescriptor;

  
  /**
   * This object uniquely identifies the particular drive within the storage array that will receive the new firmware.
   **/
  public DriveFirmwareUpdateDescriptor driveRef(String driveRef) {
    this.driveRef = driveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This object uniquely identifies the particular drive within the storage array that will receive the new firmware.")
  @JsonProperty("driveRef")
  public String getDriveRef() {
    return driveRef;
  }
  
  public void setDriveRef(String driveRef) {
    this.driveRef = driveRef;
  }

  
  /**
   * True if the image is a mode select file.
   **/
  public DriveFirmwareUpdateDescriptor modeSelectFile(Boolean modeSelectFile) {
    this.modeSelectFile = modeSelectFile;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the image is a mode select file.")
  @JsonProperty("modeSelectFile")
  public Boolean getModeSelectFile() {
    return modeSelectFile;
  }
  
  public void setModeSelectFile(Boolean modeSelectFile) {
    this.modeSelectFile = modeSelectFile;
  }

  
  /**
   * The chunk of firmware to download to the drive.
   **/
  public DriveFirmwareUpdateDescriptor firmwareUpdateDescriptor(FirmwareUpdateDescriptor firmwareUpdateDescriptor) {
    this.firmwareUpdateDescriptor = firmwareUpdateDescriptor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The chunk of firmware to download to the drive.")
  @JsonProperty("firmwareUpdateDescriptor")
  public FirmwareUpdateDescriptor getFirmwareUpdateDescriptor() {
    return firmwareUpdateDescriptor;
  }
  
  public void setFirmwareUpdateDescriptor(FirmwareUpdateDescriptor firmwareUpdateDescriptor) {
    this.firmwareUpdateDescriptor = firmwareUpdateDescriptor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveFirmwareUpdateDescriptor driveFirmwareUpdateDescriptor = (DriveFirmwareUpdateDescriptor) o;
    return Objects.equals(this.driveRef, driveFirmwareUpdateDescriptor.driveRef) &&
        Objects.equals(this.modeSelectFile, driveFirmwareUpdateDescriptor.modeSelectFile) &&
        Objects.equals(this.firmwareUpdateDescriptor, driveFirmwareUpdateDescriptor.firmwareUpdateDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveRef, modeSelectFile, firmwareUpdateDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveFirmwareUpdateDescriptor {\n");
    
    sb.append("    driveRef: ").append(toIndentedString(driveRef)).append("\n");
    sb.append("    modeSelectFile: ").append(toIndentedString(modeSelectFile)).append("\n");
    sb.append("    firmwareUpdateDescriptor: ").append(toIndentedString(firmwareUpdateDescriptor)).append("\n");
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

