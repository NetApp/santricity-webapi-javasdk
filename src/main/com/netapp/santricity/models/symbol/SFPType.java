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
 * SFPType
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SFPType   {
  

  /**
   * Information about the SFP type.
   */
  public enum SfpIdentTypeEnum {
    unknown("unknown"),
    gbic("gbic"),
    soldered("soldered"),
    sfp("sfp"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SfpIdentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SfpIdentTypeEnum sfpIdentType;


  /**
   * Information about the SFP connector type.
   */
  public enum SfpConnectTypeEnum {
    unknown("unknown"),
    sc("sc"),
    fcs1cc("fcs1cc"),
    fcs2cc("fcs2cc"),
    bncortnc("bncortnc"),
    fcCoax("fcCoax"),
    fJack("fJack"),
    lc("lc"),
    mtRj("mtRj"),
    mu("mu"),
    sg("sg"),
    optPigtail("optPigtail"),
    hssdcii("hssdcii"),
    copPigtail("copPigtail"),
    rj45("rj45"),
    noSeparableConnector("noSeparableConnector"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SfpConnectTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SfpConnectTypeEnum sfpConnectType;


  /**
   * Information about the SFP link length.
   */
  public enum SfpLinkLTypeEnum {
    typeUnknown("typeUnknown"),
    typeVlong("typeVlong"),
    typeShort("typeShort"),
    typeIntermediate("typeIntermediate"),
    typeLong("typeLong"),
    typeMedium("typeMedium"),
    typeNa("typeNa"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SfpLinkLTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SfpLinkLTypeEnum sfpLinkLType;


  /**
   * Information about the SFP transmitter type.
   */
  public enum SfpTransmitterTypeEnum {
    unknown("unknown"),
    lwlLc("lwlLc"),
    eiee("eiee"),
    eiae("eiae"),
    swlwoofc("swlwoofc"),
    swlwofc("swlwofc"),
    lwlLl("lwlLl"),
    na("na"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SfpTransmitterTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SfpTransmitterTypeEnum sfpTransmitterType;


  /**
   * Gets or Sets sfpSpeed
   */
  public enum SfpSpeedEnum {
    typeUnknown("typeUnknown"),
    type1gig("type1gig"),
    type2gig("type2gig"),
    type4gig("type4gig"),
    type8gig("type8gig"),
    type16gig("type16gig"),
    type10gig("type10gig"),
    type40gig("type40gig"),
    type56gig("type56gig"),
    type20gig("type20gig"),
    type25gig("type25gig"),
    type32gig("type32gig"),
    type100gig("type100gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SfpSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SfpSpeedEnum> sfpSpeed;


  /**
   * Gets or Sets sfpTransmissionMedia
   */
  public enum SfpTransmissionMediaEnum {
    unknown("unknown"),
    twinAxialPair("twinAxialPair"),
    tmShieldedTwistedPair("tmShieldedTwistedPair"),
    tmMiniatureCoax("tmMiniatureCoax"),
    tmVideoCoax("tmVideoCoax"),
    tmMultiModeM6("tmMultiModeM6"),
    tmMultiModeM5("tmMultiModeM5"),
    tmSingleMode("tmSingleMode"),
    na("na"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SfpTransmissionMediaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<SfpTransmissionMediaEnum> sfpTransmissionMedia;

    private Long manufacturerDate;

    private String vendorName;

    private String vendorPN;

    private String vendorRev;

    private String vendorSN;

    private String vendorOUI;

    private String reserved1;

    private String reserved2;

  
  /**
   * Information about the SFP type.
   **/
  public SFPType sfpIdentType(SfpIdentTypeEnum sfpIdentType) {
    this.sfpIdentType = sfpIdentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the SFP type.")
  @JsonProperty("sfpIdentType")
  public SfpIdentTypeEnum getSfpIdentType() {
    return sfpIdentType;
  }
  
  public void setSfpIdentType(SfpIdentTypeEnum sfpIdentType) {
    this.sfpIdentType = sfpIdentType;
  }

  
  /**
   * Information about the SFP connector type.
   **/
  public SFPType sfpConnectType(SfpConnectTypeEnum sfpConnectType) {
    this.sfpConnectType = sfpConnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the SFP connector type.")
  @JsonProperty("sfpConnectType")
  public SfpConnectTypeEnum getSfpConnectType() {
    return sfpConnectType;
  }
  
  public void setSfpConnectType(SfpConnectTypeEnum sfpConnectType) {
    this.sfpConnectType = sfpConnectType;
  }

  
  /**
   * Information about the SFP link length.
   **/
  public SFPType sfpLinkLType(SfpLinkLTypeEnum sfpLinkLType) {
    this.sfpLinkLType = sfpLinkLType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the SFP link length.")
  @JsonProperty("sfpLinkLType")
  public SfpLinkLTypeEnum getSfpLinkLType() {
    return sfpLinkLType;
  }
  
  public void setSfpLinkLType(SfpLinkLTypeEnum sfpLinkLType) {
    this.sfpLinkLType = sfpLinkLType;
  }

  
  /**
   * Information about the SFP transmitter type.
   **/
  public SFPType sfpTransmitterType(SfpTransmitterTypeEnum sfpTransmitterType) {
    this.sfpTransmitterType = sfpTransmitterType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the SFP transmitter type.")
  @JsonProperty("sfpTransmitterType")
  public SfpTransmitterTypeEnum getSfpTransmitterType() {
    return sfpTransmitterType;
  }
  
  public void setSfpTransmitterType(SfpTransmitterTypeEnum sfpTransmitterType) {
    this.sfpTransmitterType = sfpTransmitterType;
  }

  
  /**
   * Information about the SFP speed.
   **/
  public SFPType sfpSpeed(List<SfpSpeedEnum> sfpSpeed) {
    this.sfpSpeed = sfpSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the SFP speed.")
  @JsonProperty("sfpSpeed")
  public List<SfpSpeedEnum> getSfpSpeed() {
    return sfpSpeed;
  }
  
  public void setSfpSpeed(List<SfpSpeedEnum> sfpSpeed) {
    this.sfpSpeed = sfpSpeed;
  }

  
  /**
   * Information about the SFP transmission media.
   **/
  public SFPType sfpTransmissionMedia(List<SfpTransmissionMediaEnum> sfpTransmissionMedia) {
    this.sfpTransmissionMedia = sfpTransmissionMedia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the SFP transmission media.")
  @JsonProperty("sfpTransmissionMedia")
  public List<SfpTransmissionMediaEnum> getSfpTransmissionMedia() {
    return sfpTransmissionMedia;
  }
  
  public void setSfpTransmissionMedia(List<SfpTransmissionMediaEnum> sfpTransmissionMedia) {
    this.sfpTransmissionMedia = sfpTransmissionMedia;
  }

  
  /**
   * The date when the SFP was manufactured.
   **/
  public SFPType manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date when the SFP was manufactured.")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   * The vendor name of the SFP.
   **/
  public SFPType vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The vendor name of the SFP.")
  @JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  
  /**
   * The vendor part name of the SFP.
   **/
  public SFPType vendorPN(String vendorPN) {
    this.vendorPN = vendorPN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The vendor part name of the SFP.")
  @JsonProperty("vendorPN")
  public String getVendorPN() {
    return vendorPN;
  }
  
  public void setVendorPN(String vendorPN) {
    this.vendorPN = vendorPN;
  }

  
  /**
   * The vendor revision of the SFP
   **/
  public SFPType vendorRev(String vendorRev) {
    this.vendorRev = vendorRev;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The vendor revision of the SFP")
  @JsonProperty("vendorRev")
  public String getVendorRev() {
    return vendorRev;
  }
  
  public void setVendorRev(String vendorRev) {
    this.vendorRev = vendorRev;
  }

  
  /**
   * The vendor serial number of the SFP.
   **/
  public SFPType vendorSN(String vendorSN) {
    this.vendorSN = vendorSN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The vendor serial number of the SFP.")
  @JsonProperty("vendorSN")
  public String getVendorSN() {
    return vendorSN;
  }
  
  public void setVendorSN(String vendorSN) {
    this.vendorSN = vendorSN;
  }

  
  /**
   * The vendor unique OUI field of the SFP.
   **/
  public SFPType vendorOUI(String vendorOUI) {
    this.vendorOUI = vendorOUI;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The vendor unique OUI field of the SFP.")
  @JsonProperty("vendorOUI")
  public String getVendorOUI() {
    return vendorOUI;
  }
  
  public void setVendorOUI(String vendorOUI) {
    this.vendorOUI = vendorOUI;
  }

  
  /**
   **/
  public SFPType reserved1(String reserved1) {
    this.reserved1 = reserved1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved1")
  public String getReserved1() {
    return reserved1;
  }
  
  public void setReserved1(String reserved1) {
    this.reserved1 = reserved1;
  }

  
  /**
   **/
  public SFPType reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SFPType sFPType = (SFPType) o;
    return Objects.equals(this.sfpIdentType, sFPType.sfpIdentType) &&
        Objects.equals(this.sfpConnectType, sFPType.sfpConnectType) &&
        Objects.equals(this.sfpLinkLType, sFPType.sfpLinkLType) &&
        Objects.equals(this.sfpTransmitterType, sFPType.sfpTransmitterType) &&
        Objects.equals(this.sfpSpeed, sFPType.sfpSpeed) &&
        Objects.equals(this.sfpTransmissionMedia, sFPType.sfpTransmissionMedia) &&
        Objects.equals(this.manufacturerDate, sFPType.manufacturerDate) &&
        Objects.equals(this.vendorName, sFPType.vendorName) &&
        Objects.equals(this.vendorPN, sFPType.vendorPN) &&
        Objects.equals(this.vendorRev, sFPType.vendorRev) &&
        Objects.equals(this.vendorSN, sFPType.vendorSN) &&
        Objects.equals(this.vendorOUI, sFPType.vendorOUI) &&
        Objects.equals(this.reserved1, sFPType.reserved1) &&
        Objects.equals(this.reserved2, sFPType.reserved2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sfpIdentType, sfpConnectType, sfpLinkLType, sfpTransmitterType, sfpSpeed, sfpTransmissionMedia, manufacturerDate, vendorName, vendorPN, vendorRev, vendorSN, vendorOUI, reserved1, reserved2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SFPType {\n");
    
    sb.append("    sfpIdentType: ").append(toIndentedString(sfpIdentType)).append("\n");
    sb.append("    sfpConnectType: ").append(toIndentedString(sfpConnectType)).append("\n");
    sb.append("    sfpLinkLType: ").append(toIndentedString(sfpLinkLType)).append("\n");
    sb.append("    sfpTransmitterType: ").append(toIndentedString(sfpTransmitterType)).append("\n");
    sb.append("    sfpSpeed: ").append(toIndentedString(sfpSpeed)).append("\n");
    sb.append("    sfpTransmissionMedia: ").append(toIndentedString(sfpTransmissionMedia)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorPN: ").append(toIndentedString(vendorPN)).append("\n");
    sb.append("    vendorRev: ").append(toIndentedString(vendorRev)).append("\n");
    sb.append("    vendorSN: ").append(toIndentedString(vendorSN)).append("\n");
    sb.append("    vendorOUI: ").append(toIndentedString(vendorOUI)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
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

