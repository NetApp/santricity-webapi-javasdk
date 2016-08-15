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
 * InterposerData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class InterposerData   {
  
    private String vendorID;

    private String productID;

    private String revision;

    private String deviceWWN;

    private String serialNumber;

    private String partNumber;

    private String driveFwVersion;

  
  /**
   * This data is a variable length ASCII text string containing the vendor identification of the interposer.
   **/
  public InterposerData vendorID(String vendorID) {
    this.vendorID = vendorID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string containing the vendor identification of the interposer.")
  @JsonProperty("vendorID")
  public String getVendorID() {
    return vendorID;
  }
  
  public void setVendorID(String vendorID) {
    this.vendorID = vendorID;
  }

  
  /**
   * This data is a variable length ASCII text string containing the product identification of the interposer.
   **/
  public InterposerData productID(String productID) {
    this.productID = productID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string containing the product identification of the interposer.")
  @JsonProperty("productID")
  public String getProductID() {
    return productID;
  }
  
  public void setProductID(String productID) {
    this.productID = productID;
  }

  
  /**
   * This data is a variable length ASCII text string that represents the current version, or revision level, of the interposer.
   **/
  public InterposerData revision(String revision) {
    this.revision = revision;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string that represents the current version, or revision level, of the interposer.")
  @JsonProperty("revision")
  public String getRevision() {
    return revision;
  }
  
  public void setRevision(String revision) {
    this.revision = revision;
  }

  
  /**
   * This data represents the device name of the interposer.
   **/
  public InterposerData deviceWWN(String deviceWWN) {
    this.deviceWWN = deviceWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data represents the device name of the interposer.")
  @JsonProperty("deviceWWN")
  public String getDeviceWWN() {
    return deviceWWN;
  }
  
  public void setDeviceWWN(String deviceWWN) {
    this.deviceWWN = deviceWWN;
  }

  
  /**
   * This data is a variable length ASCII text string that represents the serial number of the interposer.
   **/
  public InterposerData serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string that represents the serial number of the interposer.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * This data is a variable length ASCII text string that represents the part number of the interposer.
   **/
  public InterposerData partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This data is a variable length ASCII text string that represents the part number of the interposer.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * 4 bytes left-justified ASCII drive firmware version as retrieved from the drive's standard INQUIRY data, followed by 4 blank bytes.
   **/
  public InterposerData driveFwVersion(String driveFwVersion) {
    this.driveFwVersion = driveFwVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "4 bytes left-justified ASCII drive firmware version as retrieved from the drive's standard INQUIRY data, followed by 4 blank bytes.")
  @JsonProperty("driveFwVersion")
  public String getDriveFwVersion() {
    return driveFwVersion;
  }
  
  public void setDriveFwVersion(String driveFwVersion) {
    this.driveFwVersion = driveFwVersion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterposerData interposerData = (InterposerData) o;
    return Objects.equals(this.vendorID, interposerData.vendorID) &&
        Objects.equals(this.productID, interposerData.productID) &&
        Objects.equals(this.revision, interposerData.revision) &&
        Objects.equals(this.deviceWWN, interposerData.deviceWWN) &&
        Objects.equals(this.serialNumber, interposerData.serialNumber) &&
        Objects.equals(this.partNumber, interposerData.partNumber) &&
        Objects.equals(this.driveFwVersion, interposerData.driveFwVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorID, productID, revision, deviceWWN, serialNumber, partNumber, driveFwVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterposerData {\n");
    
    sb.append("    vendorID: ").append(toIndentedString(vendorID)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    deviceWWN: ").append(toIndentedString(deviceWWN)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    driveFwVersion: ").append(toIndentedString(driveFwVersion)).append("\n");
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

