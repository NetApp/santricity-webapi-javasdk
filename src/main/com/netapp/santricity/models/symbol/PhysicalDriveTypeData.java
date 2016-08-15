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
 * PhysicalDriveTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PhysicalDriveTypeData   {
  

  /**
   * This enumeration object is used to describe the physical interface of the drive. This is not necessarily the same as the I/O protocol interface used by the controller to communicate with the drive (DriveType). In addition, the supportedDriveTypes array in the FeatureParams structure will contain values from this enumeration identifying which drive types are supported on the storage array.
   */
  public enum PhyDriveTypeEnum {
    all("all"),
    scsi("scsi"),
    fibre("fibre"),
    sata("sata"),
    pata("pata"),
    fibre520b("fibre520b"),
    sas("sas"),
    unknown("unknown"),
    sas4k("sas4k"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PhyDriveTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PhyDriveTypeEnum phyDriveType;

    private SataDriveAttributes sataDriveAttributes;

  
  /**
   * This enumeration object is used to describe the physical interface of the drive. This is not necessarily the same as the I/O protocol interface used by the controller to communicate with the drive (DriveType). In addition, the supportedDriveTypes array in the FeatureParams structure will contain values from this enumeration identifying which drive types are supported on the storage array.
   **/
  public PhysicalDriveTypeData phyDriveType(PhyDriveTypeEnum phyDriveType) {
    this.phyDriveType = phyDriveType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to describe the physical interface of the drive. This is not necessarily the same as the I/O protocol interface used by the controller to communicate with the drive (DriveType). In addition, the supportedDriveTypes array in the FeatureParams structure will contain values from this enumeration identifying which drive types are supported on the storage array.")
  @JsonProperty("phyDriveType")
  public PhyDriveTypeEnum getPhyDriveType() {
    return phyDriveType;
  }
  
  public void setPhyDriveType(PhyDriveTypeEnum phyDriveType) {
    this.phyDriveType = phyDriveType;
  }

  
  /**
   * This field identifies the attributes of SATA drives It is only present if the phyDriveType field is equal to PHY_DRIVE_TYPE_SATA.
   **/
  public PhysicalDriveTypeData sataDriveAttributes(SataDriveAttributes sataDriveAttributes) {
    this.sataDriveAttributes = sataDriveAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field identifies the attributes of SATA drives It is only present if the phyDriveType field is equal to PHY_DRIVE_TYPE_SATA.")
  @JsonProperty("sataDriveAttributes")
  public SataDriveAttributes getSataDriveAttributes() {
    return sataDriveAttributes;
  }
  
  public void setSataDriveAttributes(SataDriveAttributes sataDriveAttributes) {
    this.sataDriveAttributes = sataDriveAttributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalDriveTypeData physicalDriveTypeData = (PhysicalDriveTypeData) o;
    return Objects.equals(this.phyDriveType, physicalDriveTypeData.phyDriveType) &&
        Objects.equals(this.sataDriveAttributes, physicalDriveTypeData.sataDriveAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phyDriveType, sataDriveAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalDriveTypeData {\n");
    
    sb.append("    phyDriveType: ").append(toIndentedString(phyDriveType)).append("\n");
    sb.append("    sataDriveAttributes: ").append(toIndentedString(sataDriveAttributes)).append("\n");
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

