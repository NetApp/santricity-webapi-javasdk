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
 * CacheBackupDeviceVpd
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class CacheBackupDeviceVpd   {
  
    private String manufacturer;

    private Long manufactureDate;

    private String productId;

    private String productRevLevel;

    private String partNumber;

    private String serialNumber;

  
  /**
   * The variable-length ASCII text string that identifies the device manufacturer..
   **/
  public CacheBackupDeviceVpd manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string that identifies the device manufacturer..")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * The date of manufacture of the device, represented in seconds since midnight GMT on January 1, 1970.
   **/
  public CacheBackupDeviceVpd manufactureDate(Long manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date of manufacture of the device, represented in seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("manufactureDate")
  public Long getManufactureDate() {
    return manufactureDate;
  }
  
  public void setManufactureDate(Long manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  
  /**
   * The variable-length ASCII text string that identifies the device by name.
   **/
  public CacheBackupDeviceVpd productId(String productId) {
    this.productId = productId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string that identifies the device by name.")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   * The variable-length ASCII text string that identifies the device revision level.
   **/
  public CacheBackupDeviceVpd productRevLevel(String productRevLevel) {
    this.productRevLevel = productRevLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string that identifies the device revision level.")
  @JsonProperty("productRevLevel")
  public String getProductRevLevel() {
    return productRevLevel;
  }
  
  public void setProductRevLevel(String productRevLevel) {
    this.productRevLevel = productRevLevel;
  }

  
  /**
   * The variable-length ASCII text string that identifies the device part number.
   **/
  public CacheBackupDeviceVpd partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string that identifies the device part number.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * The variable-length ASCII text string that identifies the device serial number.
   **/
  public CacheBackupDeviceVpd serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variable-length ASCII text string that identifies the device serial number.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheBackupDeviceVpd cacheBackupDeviceVpd = (CacheBackupDeviceVpd) o;
    return Objects.equals(this.manufacturer, cacheBackupDeviceVpd.manufacturer) &&
        Objects.equals(this.manufactureDate, cacheBackupDeviceVpd.manufactureDate) &&
        Objects.equals(this.productId, cacheBackupDeviceVpd.productId) &&
        Objects.equals(this.productRevLevel, cacheBackupDeviceVpd.productRevLevel) &&
        Objects.equals(this.partNumber, cacheBackupDeviceVpd.partNumber) &&
        Objects.equals(this.serialNumber, cacheBackupDeviceVpd.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufacturer, manufactureDate, productId, productRevLevel, partNumber, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheBackupDeviceVpd {\n");
    
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufactureDate: ").append(toIndentedString(manufactureDate)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productRevLevel: ").append(toIndentedString(productRevLevel)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

