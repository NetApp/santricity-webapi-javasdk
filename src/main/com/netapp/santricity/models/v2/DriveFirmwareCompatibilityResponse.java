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


package com.netapp.santricity.models.v2;

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
 * The list of drives compatible with the downloaded firmware files
 */
@ApiModel(description = "The list of drives compatible with the downloaded firmware files")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DriveFirmwareCompatibilityResponse   {
  
    private Boolean contollerOffline;

    private Boolean controllerMissing;

    private Boolean controllerServiceMode;

    private Boolean simplexMode;

    private List<DriveFirmwareCompatiblitySet> compatibilities;

  
  /**
   * Controller status
   **/
  public DriveFirmwareCompatibilityResponse contollerOffline(Boolean contollerOffline) {
    this.contollerOffline = contollerOffline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Controller status")
  @JsonProperty("contollerOffline")
  public Boolean getContollerOffline() {
    return contollerOffline;
  }
  
  public void setContollerOffline(Boolean contollerOffline) {
    this.contollerOffline = contollerOffline;
  }

  
  /**
   * Controller missing
   **/
  public DriveFirmwareCompatibilityResponse controllerMissing(Boolean controllerMissing) {
    this.controllerMissing = controllerMissing;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Controller missing")
  @JsonProperty("controllerMissing")
  public Boolean getControllerMissing() {
    return controllerMissing;
  }
  
  public void setControllerMissing(Boolean controllerMissing) {
    this.controllerMissing = controllerMissing;
  }

  
  /**
   * Indicates if a Controller is in service mode
   **/
  public DriveFirmwareCompatibilityResponse controllerServiceMode(Boolean controllerServiceMode) {
    this.controllerServiceMode = controllerServiceMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if a Controller is in service mode")
  @JsonProperty("controllerServiceMode")
  public Boolean getControllerServiceMode() {
    return controllerServiceMode;
  }
  
  public void setControllerServiceMode(Boolean controllerServiceMode) {
    this.controllerServiceMode = controllerServiceMode;
  }

  
  /**
   * Indicates if in simplex mode
   **/
  public DriveFirmwareCompatibilityResponse simplexMode(Boolean simplexMode) {
    this.simplexMode = simplexMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if in simplex mode")
  @JsonProperty("simplexMode")
  public Boolean getSimplexMode() {
    return simplexMode;
  }
  
  public void setSimplexMode(Boolean simplexMode) {
    this.simplexMode = simplexMode;
  }

  
  /**
   * The list of drive to firmware compatibility compatibilities
   **/
  public DriveFirmwareCompatibilityResponse compatibilities(List<DriveFirmwareCompatiblitySet> compatibilities) {
    this.compatibilities = compatibilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of drive to firmware compatibility compatibilities")
  @JsonProperty("compatibilities")
  public List<DriveFirmwareCompatiblitySet> getCompatibilities() {
    return compatibilities;
  }
  
  public void setCompatibilities(List<DriveFirmwareCompatiblitySet> compatibilities) {
    this.compatibilities = compatibilities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveFirmwareCompatibilityResponse driveFirmwareCompatibilityResponse = (DriveFirmwareCompatibilityResponse) o;
    return Objects.equals(this.contollerOffline, driveFirmwareCompatibilityResponse.contollerOffline) &&
        Objects.equals(this.controllerMissing, driveFirmwareCompatibilityResponse.controllerMissing) &&
        Objects.equals(this.controllerServiceMode, driveFirmwareCompatibilityResponse.controllerServiceMode) &&
        Objects.equals(this.simplexMode, driveFirmwareCompatibilityResponse.simplexMode) &&
        Objects.equals(this.compatibilities, driveFirmwareCompatibilityResponse.compatibilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contollerOffline, controllerMissing, controllerServiceMode, simplexMode, compatibilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveFirmwareCompatibilityResponse {\n");
    
    sb.append("    contollerOffline: ").append(toIndentedString(contollerOffline)).append("\n");
    sb.append("    controllerMissing: ").append(toIndentedString(controllerMissing)).append("\n");
    sb.append("    controllerServiceMode: ").append(toIndentedString(controllerServiceMode)).append("\n");
    sb.append("    simplexMode: ").append(toIndentedString(simplexMode)).append("\n");
    sb.append("    compatibilities: ").append(toIndentedString(compatibilities)).append("\n");
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

