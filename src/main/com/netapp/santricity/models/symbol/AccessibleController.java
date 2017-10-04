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
 * AccessibleController
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class AccessibleController   {
  
    private Integer trayId;

    private Integer slot;

    private SAIdentifier saId;

    private String thisController;

    private List<String> allControllers;

  
  /**
   * The ID value of the tray in which this controller resides.
   **/
  public AccessibleController trayId(Integer trayId) {
    this.trayId = trayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID value of the tray in which this controller resides.")
  @JsonProperty("trayId")
  public Integer getTrayId() {
    return trayId;
  }
  
  public void setTrayId(Integer trayId) {
    this.trayId = trayId;
  }

  
  /**
   * The slot within its tray where this controller resides.
   **/
  public AccessibleController slot(Integer slot) {
    this.slot = slot;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The slot within its tray where this controller resides.")
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }
  
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  
  /**
   * The world-wide unique identifier of the storage array in which this controller resides.
   **/
  public AccessibleController saId(SAIdentifier saId) {
    this.saId = saId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The world-wide unique identifier of the storage array in which this controller resides.")
  @JsonProperty("saId")
  public SAIdentifier getSaId() {
    return saId;
  }
  
  public void setSaId(SAIdentifier saId) {
    this.saId = saId;
  }

  
  /**
   * The SYMbol reference value that uniquely identifies this controller.
   **/
  public AccessibleController thisController(String thisController) {
    this.thisController = thisController;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SYMbol reference value that uniquely identifies this controller.")
  @JsonProperty("thisController")
  public String getThisController() {
    return thisController;
  }
  
  public void setThisController(String thisController) {
    this.thisController = thisController;
  }

  
  /**
   * An array of SYMbol reference values for all of the controllers that are present in the storage array where this controller resides.
   **/
  public AccessibleController allControllers(List<String> allControllers) {
    this.allControllers = allControllers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of SYMbol reference values for all of the controllers that are present in the storage array where this controller resides.")
  @JsonProperty("allControllers")
  public List<String> getAllControllers() {
    return allControllers;
  }
  
  public void setAllControllers(List<String> allControllers) {
    this.allControllers = allControllers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessibleController accessibleController = (AccessibleController) o;
    return Objects.equals(this.trayId, accessibleController.trayId) &&
        Objects.equals(this.slot, accessibleController.slot) &&
        Objects.equals(this.saId, accessibleController.saId) &&
        Objects.equals(this.thisController, accessibleController.thisController) &&
        Objects.equals(this.allControllers, accessibleController.allControllers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trayId, slot, saId, thisController, allControllers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessibleController {\n");
    
    sb.append("    trayId: ").append(toIndentedString(trayId)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    saId: ").append(toIndentedString(saId)).append("\n");
    sb.append("    thisController: ").append(toIndentedString(thisController)).append("\n");
    sb.append("    allControllers: ").append(toIndentedString(allControllers)).append("\n");
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

