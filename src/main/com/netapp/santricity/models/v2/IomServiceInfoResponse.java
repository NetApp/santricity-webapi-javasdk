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
 * API object that includes information about the IOM service.
 */
@ApiModel(description = "API object that includes information about the IOM service.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class IomServiceInfoResponse   {
  
    private Boolean iomServiceEnabled;

    private Boolean disruptiveIomFirmwareUpdate;

  
  /**
   * Reports whether the IOM service is enabled.
   **/
  public IomServiceInfoResponse iomServiceEnabled(Boolean iomServiceEnabled) {
    this.iomServiceEnabled = iomServiceEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reports whether the IOM service is enabled.")
  @JsonProperty("iomServiceEnabled")
  public Boolean getIomServiceEnabled() {
    return iomServiceEnabled;
  }
  
  public void setIomServiceEnabled(Boolean iomServiceEnabled) {
    this.iomServiceEnabled = iomServiceEnabled;
  }

  
  /**
   * Reports whether there are any trays for which an IOM firmware update would be disruptive.
   **/
  public IomServiceInfoResponse disruptiveIomFirmwareUpdate(Boolean disruptiveIomFirmwareUpdate) {
    this.disruptiveIomFirmwareUpdate = disruptiveIomFirmwareUpdate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reports whether there are any trays for which an IOM firmware update would be disruptive.")
  @JsonProperty("disruptiveIomFirmwareUpdate")
  public Boolean getDisruptiveIomFirmwareUpdate() {
    return disruptiveIomFirmwareUpdate;
  }
  
  public void setDisruptiveIomFirmwareUpdate(Boolean disruptiveIomFirmwareUpdate) {
    this.disruptiveIomFirmwareUpdate = disruptiveIomFirmwareUpdate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IomServiceInfoResponse iomServiceInfoResponse = (IomServiceInfoResponse) o;
    return Objects.equals(this.iomServiceEnabled, iomServiceInfoResponse.iomServiceEnabled) &&
        Objects.equals(this.disruptiveIomFirmwareUpdate, iomServiceInfoResponse.disruptiveIomFirmwareUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iomServiceEnabled, disruptiveIomFirmwareUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IomServiceInfoResponse {\n");
    
    sb.append("    iomServiceEnabled: ").append(toIndentedString(iomServiceEnabled)).append("\n");
    sb.append("    disruptiveIomFirmwareUpdate: ").append(toIndentedString(disruptiveIomFirmwareUpdate)).append("\n");
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

