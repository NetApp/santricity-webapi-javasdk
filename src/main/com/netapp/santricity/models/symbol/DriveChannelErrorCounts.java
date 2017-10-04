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
 * DriveChannelErrorCounts
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class DriveChannelErrorCounts   {
  
    private Integer nonChannelErrors;

    private Integer timeoutErrors;

    private Integer controllerDetectedErrors;

    private Integer driveDetectedErrors;

    private Integer linkDownErrors;

  
  /**
   * The number of non channel errors.
   **/
  public DriveChannelErrorCounts nonChannelErrors(Integer nonChannelErrors) {
    this.nonChannelErrors = nonChannelErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of non channel errors.")
  @JsonProperty("nonChannelErrors")
  public Integer getNonChannelErrors() {
    return nonChannelErrors;
  }
  
  public void setNonChannelErrors(Integer nonChannelErrors) {
    this.nonChannelErrors = nonChannelErrors;
  }

  
  /**
   * The number of timeout errors.
   **/
  public DriveChannelErrorCounts timeoutErrors(Integer timeoutErrors) {
    this.timeoutErrors = timeoutErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of timeout errors.")
  @JsonProperty("timeoutErrors")
  public Integer getTimeoutErrors() {
    return timeoutErrors;
  }
  
  public void setTimeoutErrors(Integer timeoutErrors) {
    this.timeoutErrors = timeoutErrors;
  }

  
  /**
   * The number of controller detected errors.
   **/
  public DriveChannelErrorCounts controllerDetectedErrors(Integer controllerDetectedErrors) {
    this.controllerDetectedErrors = controllerDetectedErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of controller detected errors.")
  @JsonProperty("controllerDetectedErrors")
  public Integer getControllerDetectedErrors() {
    return controllerDetectedErrors;
  }
  
  public void setControllerDetectedErrors(Integer controllerDetectedErrors) {
    this.controllerDetectedErrors = controllerDetectedErrors;
  }

  
  /**
   * The number of drive detected errors.
   **/
  public DriveChannelErrorCounts driveDetectedErrors(Integer driveDetectedErrors) {
    this.driveDetectedErrors = driveDetectedErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of drive detected errors.")
  @JsonProperty("driveDetectedErrors")
  public Integer getDriveDetectedErrors() {
    return driveDetectedErrors;
  }
  
  public void setDriveDetectedErrors(Integer driveDetectedErrors) {
    this.driveDetectedErrors = driveDetectedErrors;
  }

  
  /**
   * The number of link down errors.
   **/
  public DriveChannelErrorCounts linkDownErrors(Integer linkDownErrors) {
    this.linkDownErrors = linkDownErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of link down errors.")
  @JsonProperty("linkDownErrors")
  public Integer getLinkDownErrors() {
    return linkDownErrors;
  }
  
  public void setLinkDownErrors(Integer linkDownErrors) {
    this.linkDownErrors = linkDownErrors;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveChannelErrorCounts driveChannelErrorCounts = (DriveChannelErrorCounts) o;
    return Objects.equals(this.nonChannelErrors, driveChannelErrorCounts.nonChannelErrors) &&
        Objects.equals(this.timeoutErrors, driveChannelErrorCounts.timeoutErrors) &&
        Objects.equals(this.controllerDetectedErrors, driveChannelErrorCounts.controllerDetectedErrors) &&
        Objects.equals(this.driveDetectedErrors, driveChannelErrorCounts.driveDetectedErrors) &&
        Objects.equals(this.linkDownErrors, driveChannelErrorCounts.linkDownErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonChannelErrors, timeoutErrors, controllerDetectedErrors, driveDetectedErrors, linkDownErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveChannelErrorCounts {\n");
    
    sb.append("    nonChannelErrors: ").append(toIndentedString(nonChannelErrors)).append("\n");
    sb.append("    timeoutErrors: ").append(toIndentedString(timeoutErrors)).append("\n");
    sb.append("    controllerDetectedErrors: ").append(toIndentedString(controllerDetectedErrors)).append("\n");
    sb.append("    driveDetectedErrors: ").append(toIndentedString(driveDetectedErrors)).append("\n");
    sb.append("    linkDownErrors: ").append(toIndentedString(linkDownErrors)).append("\n");
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

