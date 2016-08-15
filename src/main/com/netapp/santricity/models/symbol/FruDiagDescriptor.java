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
 * FruDiagDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FruDiagDescriptor   {
  

  /**
   * The diagnostic test type.
   */
  public enum FruDiagTestTypeEnum {
    none("none"),
    serviceModeBasic("serviceModeBasic"),
    serviceModeExtended("serviceModeExtended"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FruDiagTestTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FruDiagTestTypeEnum fruDiagTestType;

    private Integer slot;


  /**
   * The diagnostic test to be performed.
   */
  public enum FruDiagTestIdentifierEnum {
    none("none"),
    dimmByteEnable("dimmByteEnable"),
    dimmEcc("dimmEcc"),
    dimmMarchC("dimmMarchC"),
    dimmPatterns("dimmPatterns"),
    dimmPseudorandom("dimmPseudorandom"),
    dimmDmaCopy("dimmDmaCopy"),
    usbflashWriteProtect("usbflashWriteProtect"),
    usbflashWriteCycle("usbflashWriteCycle"),
    usbflashWritePatterns("usbflashWritePatterns"),
    usbflashRandom("usbflashRandom"),
    hicReadWrite("hicReadWrite"),
    hicDataLines("hicDataLines"),
    hicInterrupt("hicInterrupt"),
    hicLoopback("hicLoopback"),
    hicT10pi("hicT10pi"),
    hicDma("hicDma"),
    hicContextMemory("hicContextMemory"),
    hicExtMemory("hicExtMemory"),
    ctlrRegisterAddress("ctlrRegisterAddress"),
    ctlrDataLines("ctlrDataLines"),
    ctlrApcSram("ctlrApcSram"),
    ctlrApcFifo("ctlrApcFifo"),
    ctlrDataCopy("ctlrDataCopy"),
    ctlrRaid5("ctlrRaid5"),
    ctlrRaid6("ctlrRaid6"),
    hicRamReadWrite("hicRamReadWrite"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FruDiagTestIdentifierEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FruDiagTestIdentifierEnum fruDiagTestIdentifier;

  
  /**
   * The diagnostic test type.
   **/
  public FruDiagDescriptor fruDiagTestType(FruDiagTestTypeEnum fruDiagTestType) {
    this.fruDiagTestType = fruDiagTestType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The diagnostic test type.")
  @JsonProperty("fruDiagTestType")
  public FruDiagTestTypeEnum getFruDiagTestType() {
    return fruDiagTestType;
  }
  
  public void setFruDiagTestType(FruDiagTestTypeEnum fruDiagTestType) {
    this.fruDiagTestType = fruDiagTestType;
  }

  
  /**
   * The slot number (1-based) of the device on which the test should be performed. If a slot number is not required by the diagnostic, this value will be ignored.
   **/
  public FruDiagDescriptor slot(Integer slot) {
    this.slot = slot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The slot number (1-based) of the device on which the test should be performed. If a slot number is not required by the diagnostic, this value will be ignored.")
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }
  
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  
  /**
   * The diagnostic test to be performed.
   **/
  public FruDiagDescriptor fruDiagTestIdentifier(FruDiagTestIdentifierEnum fruDiagTestIdentifier) {
    this.fruDiagTestIdentifier = fruDiagTestIdentifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The diagnostic test to be performed.")
  @JsonProperty("fruDiagTestIdentifier")
  public FruDiagTestIdentifierEnum getFruDiagTestIdentifier() {
    return fruDiagTestIdentifier;
  }
  
  public void setFruDiagTestIdentifier(FruDiagTestIdentifierEnum fruDiagTestIdentifier) {
    this.fruDiagTestIdentifier = fruDiagTestIdentifier;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FruDiagDescriptor fruDiagDescriptor = (FruDiagDescriptor) o;
    return Objects.equals(this.fruDiagTestType, fruDiagDescriptor.fruDiagTestType) &&
        Objects.equals(this.slot, fruDiagDescriptor.slot) &&
        Objects.equals(this.fruDiagTestIdentifier, fruDiagDescriptor.fruDiagTestIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fruDiagTestType, slot, fruDiagTestIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FruDiagDescriptor {\n");
    
    sb.append("    fruDiagTestType: ").append(toIndentedString(fruDiagTestType)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    fruDiagTestIdentifier: ").append(toIndentedString(fruDiagTestIdentifier)).append("\n");
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

