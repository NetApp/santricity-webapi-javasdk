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
 * ScsiToAtaTranslatorData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ScsiToAtaTranslatorData   {
  
    private String vendorId;

    private String productId;

    private String productRevLevel;


  /**
   * This field identifies the type of the SCSI-to-ATA translation hardware. Note that if this field is set to SAT_TYPE_UNKNOWN, the string in the productId field will have zero length, and the string in the productRevLevel field will be set to \"----\" (four dashes).
   */
  public enum SatTypeEnum {
    unknown("unknown"),
    driveCruResident("driveCruResident"),
    controllerResident("controllerResident"),
    enclosureSlotResident("enclosureSlotResident"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SatTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SatTypeEnum satType;

  
  /**
   * The vendor identification string.
   **/
  public ScsiToAtaTranslatorData vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The vendor identification string.")
  @JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  
  /**
   * The product identification string.
   **/
  public ScsiToAtaTranslatorData productId(String productId) {
    this.productId = productId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The product identification string.")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   * The product revision level string. When no interposer card is available, this string is set to \"----\" (four dashes).
   **/
  public ScsiToAtaTranslatorData productRevLevel(String productRevLevel) {
    this.productRevLevel = productRevLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The product revision level string. When no interposer card is available, this string is set to \"----\" (four dashes).")
  @JsonProperty("productRevLevel")
  public String getProductRevLevel() {
    return productRevLevel;
  }
  
  public void setProductRevLevel(String productRevLevel) {
    this.productRevLevel = productRevLevel;
  }

  
  /**
   * This field identifies the type of the SCSI-to-ATA translation hardware. Note that if this field is set to SAT_TYPE_UNKNOWN, the string in the productId field will have zero length, and the string in the productRevLevel field will be set to \"----\" (four dashes).
   **/
  public ScsiToAtaTranslatorData satType(SatTypeEnum satType) {
    this.satType = satType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field identifies the type of the SCSI-to-ATA translation hardware. Note that if this field is set to SAT_TYPE_UNKNOWN, the string in the productId field will have zero length, and the string in the productRevLevel field will be set to \"----\" (four dashes).")
  @JsonProperty("satType")
  public SatTypeEnum getSatType() {
    return satType;
  }
  
  public void setSatType(SatTypeEnum satType) {
    this.satType = satType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScsiToAtaTranslatorData scsiToAtaTranslatorData = (ScsiToAtaTranslatorData) o;
    return Objects.equals(this.vendorId, scsiToAtaTranslatorData.vendorId) &&
        Objects.equals(this.productId, scsiToAtaTranslatorData.productId) &&
        Objects.equals(this.productRevLevel, scsiToAtaTranslatorData.productRevLevel) &&
        Objects.equals(this.satType, scsiToAtaTranslatorData.satType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, productId, productRevLevel, satType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScsiToAtaTranslatorData {\n");
    
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productRevLevel: ").append(toIndentedString(productRevLevel)).append("\n");
    sb.append("    satType: ").append(toIndentedString(satType)).append("\n");
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

