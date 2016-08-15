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
 * TrayPower
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class TrayPower   {
  
    private Integer trayID;

    private Integer numberOfPowerSupplies;

    private List<Integer> inputPower;

  
  /**
   * The tray ID.
   **/
  public TrayPower trayID(Integer trayID) {
    this.trayID = trayID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The tray ID.")
  @JsonProperty("trayID")
  public Integer getTrayID() {
    return trayID;
  }
  
  public void setTrayID(Integer trayID) {
    this.trayID = trayID;
  }

  
  /**
   * The number of power supplies in the tray.
   **/
  public TrayPower numberOfPowerSupplies(Integer numberOfPowerSupplies) {
    this.numberOfPowerSupplies = numberOfPowerSupplies;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of power supplies in the tray.")
  @JsonProperty("numberOfPowerSupplies")
  public Integer getNumberOfPowerSupplies() {
    return numberOfPowerSupplies;
  }
  
  public void setNumberOfPowerSupplies(Integer numberOfPowerSupplies) {
    this.numberOfPowerSupplies = numberOfPowerSupplies;
  }

  
  /**
   * List of power measurements for each power supply measured in watts.
   **/
  public TrayPower inputPower(List<Integer> inputPower) {
    this.inputPower = inputPower;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of power measurements for each power supply measured in watts.")
  @JsonProperty("inputPower")
  public List<Integer> getInputPower() {
    return inputPower;
  }
  
  public void setInputPower(List<Integer> inputPower) {
    this.inputPower = inputPower;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrayPower trayPower = (TrayPower) o;
    return Objects.equals(this.trayID, trayPower.trayID) &&
        Objects.equals(this.numberOfPowerSupplies, trayPower.numberOfPowerSupplies) &&
        Objects.equals(this.inputPower, trayPower.inputPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trayID, numberOfPowerSupplies, inputPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrayPower {\n");
    
    sb.append("    trayID: ").append(toIndentedString(trayID)).append("\n");
    sb.append("    numberOfPowerSupplies: ").append(toIndentedString(numberOfPowerSupplies)).append("\n");
    sb.append("    inputPower: ").append(toIndentedString(inputPower)).append("\n");
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

