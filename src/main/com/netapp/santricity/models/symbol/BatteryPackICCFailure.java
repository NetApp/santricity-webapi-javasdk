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
 * BatteryPackICCFailure
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class BatteryPackICCFailure   {
  
    private String controllerARef;

    private String controllerBRef;

    private String supportCRUARef;

    private String supportCRUBRef;

    private String batteryPackRef;

  
  /**
   * This field is present when the voltage regulator has failed in the battery pack associated with controller A.
   **/
  public BatteryPackICCFailure controllerARef(String controllerARef) {
    this.controllerARef = controllerARef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is present when the voltage regulator has failed in the battery pack associated with controller A.")
  @JsonProperty("controllerARef")
  public String getControllerARef() {
    return controllerARef;
  }
  
  public void setControllerARef(String controllerARef) {
    this.controllerARef = controllerARef;
  }

  
  /**
   * This field is present when the voltage regulator has failed in the battery pack associated with controller B.
   **/
  public BatteryPackICCFailure controllerBRef(String controllerBRef) {
    this.controllerBRef = controllerBRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is present when the voltage regulator has failed in the battery pack associated with controller B.")
  @JsonProperty("controllerBRef")
  public String getControllerBRef() {
    return controllerBRef;
  }
  
  public void setControllerBRef(String controllerBRef) {
    this.controllerBRef = controllerBRef;
  }

  
  /**
   * This field is present when the charger has failed in the battery pack associated with support CRU A.
   **/
  public BatteryPackICCFailure supportCRUARef(String supportCRUARef) {
    this.supportCRUARef = supportCRUARef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is present when the charger has failed in the battery pack associated with support CRU A.")
  @JsonProperty("supportCRUARef")
  public String getSupportCRUARef() {
    return supportCRUARef;
  }
  
  public void setSupportCRUARef(String supportCRUARef) {
    this.supportCRUARef = supportCRUARef;
  }

  
  /**
   * This field is present when the charger has failed in the battery pack associated with support CRU B.
   **/
  public BatteryPackICCFailure supportCRUBRef(String supportCRUBRef) {
    this.supportCRUBRef = supportCRUBRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is present when the charger has failed in the battery pack associated with support CRU B.")
  @JsonProperty("supportCRUBRef")
  public String getSupportCRUBRef() {
    return supportCRUBRef;
  }
  
  public void setSupportCRUBRef(String supportCRUBRef) {
    this.supportCRUBRef = supportCRUBRef;
  }

  
  /**
   * This field is present for all battery pack failures except for a voltage regulator or charger failure. This field contains a reference to the battery pack that has failed.
   **/
  public BatteryPackICCFailure batteryPackRef(String batteryPackRef) {
    this.batteryPackRef = batteryPackRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is present for all battery pack failures except for a voltage regulator or charger failure. This field contains a reference to the battery pack that has failed.")
  @JsonProperty("batteryPackRef")
  public String getBatteryPackRef() {
    return batteryPackRef;
  }
  
  public void setBatteryPackRef(String batteryPackRef) {
    this.batteryPackRef = batteryPackRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatteryPackICCFailure batteryPackICCFailure = (BatteryPackICCFailure) o;
    return Objects.equals(this.controllerARef, batteryPackICCFailure.controllerARef) &&
        Objects.equals(this.controllerBRef, batteryPackICCFailure.controllerBRef) &&
        Objects.equals(this.supportCRUARef, batteryPackICCFailure.supportCRUARef) &&
        Objects.equals(this.supportCRUBRef, batteryPackICCFailure.supportCRUBRef) &&
        Objects.equals(this.batteryPackRef, batteryPackICCFailure.batteryPackRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerARef, controllerBRef, supportCRUARef, supportCRUBRef, batteryPackRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatteryPackICCFailure {\n");
    
    sb.append("    controllerARef: ").append(toIndentedString(controllerARef)).append("\n");
    sb.append("    controllerBRef: ").append(toIndentedString(controllerBRef)).append("\n");
    sb.append("    supportCRUARef: ").append(toIndentedString(supportCRUARef)).append("\n");
    sb.append("    supportCRUBRef: ").append(toIndentedString(supportCRUBRef)).append("\n");
    sb.append("    batteryPackRef: ").append(toIndentedString(batteryPackRef)).append("\n");
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

