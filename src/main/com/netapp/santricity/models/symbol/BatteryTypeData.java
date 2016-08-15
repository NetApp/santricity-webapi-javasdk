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
 * BatteryTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class BatteryTypeData   {
  

  /**
   * This enumeration object is used to specify the battery configurations present on a controller.
   */
  public enum BatteryTypeEnum {
    singleSharedCru("singleSharedCru"),
    dualIndividualFrus("dualIndividualFrus"),
    dualSharedCrus("dualSharedCrus"),
    dualIndividualCrus("dualIndividualCrus"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    BatteryTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private BatteryTypeEnum batteryType;

    private String cruParentController;

    private String parentController;

  
  /**
   * This enumeration object is used to specify the battery configurations present on a controller.
   **/
  public BatteryTypeData batteryType(BatteryTypeEnum batteryType) {
    this.batteryType = batteryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to specify the battery configurations present on a controller.")
  @JsonProperty("batteryType")
  public BatteryTypeEnum getBatteryType() {
    return batteryType;
  }
  
  public void setBatteryType(BatteryTypeEnum batteryType) {
    this.batteryType = batteryType;
  }

  
  /**
   * This field is present only if the batteryType value is equal to BATTERY_TYPE_DUAL_INDIVIDUAL_CRUS. It is a reference to the controller that the battery CRU is associated with.
   **/
  public BatteryTypeData cruParentController(String cruParentController) {
    this.cruParentController = cruParentController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the batteryType value is equal to BATTERY_TYPE_DUAL_INDIVIDUAL_CRUS. It is a reference to the controller that the battery CRU is associated with.")
  @JsonProperty("cruParentController")
  public String getCruParentController() {
    return cruParentController;
  }
  
  public void setCruParentController(String cruParentController) {
    this.cruParentController = cruParentController;
  }

  
  /**
   * This field is present only if the batteryType value is equal to BATTERY_TYPE_DUAL_INDIVIDUAL_FRUS. It is a reference to the the controller that the battery FRU is associated with.
   **/
  public BatteryTypeData parentController(String parentController) {
    this.parentController = parentController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the batteryType value is equal to BATTERY_TYPE_DUAL_INDIVIDUAL_FRUS. It is a reference to the the controller that the battery FRU is associated with.")
  @JsonProperty("parentController")
  public String getParentController() {
    return parentController;
  }
  
  public void setParentController(String parentController) {
    this.parentController = parentController;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatteryTypeData batteryTypeData = (BatteryTypeData) o;
    return Objects.equals(this.batteryType, batteryTypeData.batteryType) &&
        Objects.equals(this.cruParentController, batteryTypeData.cruParentController) &&
        Objects.equals(this.parentController, batteryTypeData.parentController);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryType, cruParentController, parentController);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatteryTypeData {\n");
    
    sb.append("    batteryType: ").append(toIndentedString(batteryType)).append("\n");
    sb.append("    cruParentController: ").append(toIndentedString(cruParentController)).append("\n");
    sb.append("    parentController: ").append(toIndentedString(parentController)).append("\n");
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

