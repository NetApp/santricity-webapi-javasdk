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
 * EnhEthFeaturesState
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class EnhEthFeaturesState   {
  
    private Boolean fipOperational;

    private Boolean fcoeOperational;

    private Boolean pfcOperational;

    private Boolean pgOperational;

    private Boolean fcoeBandwidth;

    private Boolean iscsiOperational;

    private Boolean fcoeFipMismatch;

  
  /**
   * This bool indicates the Operational mode of the FIP Application. .
   **/
  public EnhEthFeaturesState fipOperational(Boolean fipOperational) {
    this.fipOperational = fipOperational;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This bool indicates the Operational mode of the FIP Application. .")
  @JsonProperty("fipOperational")
  public Boolean getFipOperational() {
    return fipOperational;
  }
  
  public void setFipOperational(Boolean fipOperational) {
    this.fipOperational = fipOperational;
  }

  
  /**
   * This bool indicates the Operational mode of the FCoE Application.
   **/
  public EnhEthFeaturesState fcoeOperational(Boolean fcoeOperational) {
    this.fcoeOperational = fcoeOperational;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This bool indicates the Operational mode of the FCoE Application.")
  @JsonProperty("fcoeOperational")
  public Boolean getFcoeOperational() {
    return fcoeOperational;
  }
  
  public void setFcoeOperational(Boolean fcoeOperational) {
    this.fcoeOperational = fcoeOperational;
  }

  
  /**
   * This bool indicates the Operational mode of the PFC Feature.
   **/
  public EnhEthFeaturesState pfcOperational(Boolean pfcOperational) {
    this.pfcOperational = pfcOperational;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This bool indicates the Operational mode of the PFC Feature.")
  @JsonProperty("pfcOperational")
  public Boolean getPfcOperational() {
    return pfcOperational;
  }
  
  public void setPfcOperational(Boolean pfcOperational) {
    this.pfcOperational = pfcOperational;
  }

  
  /**
   * The bool indicates the Operational mode of the PG Feature.
   **/
  public EnhEthFeaturesState pgOperational(Boolean pgOperational) {
    this.pgOperational = pgOperational;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The bool indicates the Operational mode of the PG Feature.")
  @JsonProperty("pgOperational")
  public Boolean getPgOperational() {
    return pgOperational;
  }
  
  public void setPgOperational(Boolean pgOperational) {
    this.pgOperational = pgOperational;
  }

  
  /**
   * This bool indicates if this interface has the FCoE bandwidth.
   **/
  public EnhEthFeaturesState fcoeBandwidth(Boolean fcoeBandwidth) {
    this.fcoeBandwidth = fcoeBandwidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This bool indicates if this interface has the FCoE bandwidth.")
  @JsonProperty("fcoeBandwidth")
  public Boolean getFcoeBandwidth() {
    return fcoeBandwidth;
  }
  
  public void setFcoeBandwidth(Boolean fcoeBandwidth) {
    this.fcoeBandwidth = fcoeBandwidth;
  }

  
  /**
   * This bool indicates the Operational Mode of the iSCSI Application.
   **/
  public EnhEthFeaturesState iscsiOperational(Boolean iscsiOperational) {
    this.iscsiOperational = iscsiOperational;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This bool indicates the Operational Mode of the iSCSI Application.")
  @JsonProperty("iscsiOperational")
  public Boolean getIscsiOperational() {
    return iscsiOperational;
  }
  
  public void setIscsiOperational(Boolean iscsiOperational) {
    this.iscsiOperational = iscsiOperational;
  }

  
  /**
   * This bool indicates if this interface has a FCoE/FIP Application Map Mismatch.
   **/
  public EnhEthFeaturesState fcoeFipMismatch(Boolean fcoeFipMismatch) {
    this.fcoeFipMismatch = fcoeFipMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This bool indicates if this interface has a FCoE/FIP Application Map Mismatch.")
  @JsonProperty("fcoeFipMismatch")
  public Boolean getFcoeFipMismatch() {
    return fcoeFipMismatch;
  }
  
  public void setFcoeFipMismatch(Boolean fcoeFipMismatch) {
    this.fcoeFipMismatch = fcoeFipMismatch;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhEthFeaturesState enhEthFeaturesState = (EnhEthFeaturesState) o;
    return Objects.equals(this.fipOperational, enhEthFeaturesState.fipOperational) &&
        Objects.equals(this.fcoeOperational, enhEthFeaturesState.fcoeOperational) &&
        Objects.equals(this.pfcOperational, enhEthFeaturesState.pfcOperational) &&
        Objects.equals(this.pgOperational, enhEthFeaturesState.pgOperational) &&
        Objects.equals(this.fcoeBandwidth, enhEthFeaturesState.fcoeBandwidth) &&
        Objects.equals(this.iscsiOperational, enhEthFeaturesState.iscsiOperational) &&
        Objects.equals(this.fcoeFipMismatch, enhEthFeaturesState.fcoeFipMismatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fipOperational, fcoeOperational, pfcOperational, pgOperational, fcoeBandwidth, iscsiOperational, fcoeFipMismatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhEthFeaturesState {\n");
    
    sb.append("    fipOperational: ").append(toIndentedString(fipOperational)).append("\n");
    sb.append("    fcoeOperational: ").append(toIndentedString(fcoeOperational)).append("\n");
    sb.append("    pfcOperational: ").append(toIndentedString(pfcOperational)).append("\n");
    sb.append("    pgOperational: ").append(toIndentedString(pgOperational)).append("\n");
    sb.append("    fcoeBandwidth: ").append(toIndentedString(fcoeBandwidth)).append("\n");
    sb.append("    iscsiOperational: ").append(toIndentedString(iscsiOperational)).append("\n");
    sb.append("    fcoeFipMismatch: ").append(toIndentedString(fcoeFipMismatch)).append("\n");
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

