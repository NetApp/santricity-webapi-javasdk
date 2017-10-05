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
 * PRegistration
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class PRegistration   {
  
    private String volumeRef;

    private Integer lun;


  /**
   * Reservation Type
   */
  public enum ReservationTypeIDEnum {
    noReservation("noReservation"),
    writeExcl("writeExcl"),
    exclAccess("exclAccess"),
    writeExclRegOnly("writeExclRegOnly"),
    exclAccessRegOnly("exclAccessRegOnly"),
    writeExclAllReg("writeExclAllReg"),
    exclAccessAllReg("exclAccessAllReg"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ReservationTypeIDEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ReservationTypeIDEnum reservationTypeID;

    private PRegistrantList registrantList;

    private ITNexus holdingITNexus;

    private Boolean ptplA;

  
  /**
   * The volume identifier
   **/
  public PRegistration volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume identifier")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * LUN (mapped)
   **/
  public PRegistration lun(Integer lun) {
    this.lun = lun;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "LUN (mapped)")
  @JsonProperty("lun")
  public Integer getLun() {
    return lun;
  }
  
  public void setLun(Integer lun) {
    this.lun = lun;
  }

  
  /**
   * Reservation Type
   **/
  public PRegistration reservationTypeID(ReservationTypeIDEnum reservationTypeID) {
    this.reservationTypeID = reservationTypeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reservation Type")
  @JsonProperty("reservationTypeID")
  public ReservationTypeIDEnum getReservationTypeID() {
    return reservationTypeID;
  }
  
  public void setReservationTypeID(ReservationTypeIDEnum reservationTypeID) {
    this.reservationTypeID = reservationTypeID;
  }

  
  /**
   * List of registrants
   **/
  public PRegistration registrantList(PRegistrantList registrantList) {
    this.registrantList = registrantList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of registrants")
  @JsonProperty("registrantList")
  public PRegistrantList getRegistrantList() {
    return registrantList;
  }
  
  public void setRegistrantList(PRegistrantList registrantList) {
    this.registrantList = registrantList;
  }

  
  /**
   * Invalid if Type = ALL_REG
   **/
  public PRegistration holdingITNexus(ITNexus holdingITNexus) {
    this.holdingITNexus = holdingITNexus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Invalid if Type = ALL_REG")
  @JsonProperty("holdingITNexus")
  public ITNexus getHoldingITNexus() {
    return holdingITNexus;
  }
  
  public void setHoldingITNexus(ITNexus holdingITNexus) {
    this.holdingITNexus = holdingITNexus;
  }

  
  /**
   * Persist through power loss
   **/
  public PRegistration ptplA(Boolean ptplA) {
    this.ptplA = ptplA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Persist through power loss")
  @JsonProperty("ptpl_A")
  public Boolean getPtplA() {
    return ptplA;
  }
  
  public void setPtplA(Boolean ptplA) {
    this.ptplA = ptplA;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PRegistration pRegistration = (PRegistration) o;
    return Objects.equals(this.volumeRef, pRegistration.volumeRef) &&
        Objects.equals(this.lun, pRegistration.lun) &&
        Objects.equals(this.reservationTypeID, pRegistration.reservationTypeID) &&
        Objects.equals(this.registrantList, pRegistration.registrantList) &&
        Objects.equals(this.holdingITNexus, pRegistration.holdingITNexus) &&
        Objects.equals(this.ptplA, pRegistration.ptplA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeRef, lun, reservationTypeID, registrantList, holdingITNexus, ptplA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PRegistration {\n");
    
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    reservationTypeID: ").append(toIndentedString(reservationTypeID)).append("\n");
    sb.append("    registrantList: ").append(toIndentedString(registrantList)).append("\n");
    sb.append("    holdingITNexus: ").append(toIndentedString(holdingITNexus)).append("\n");
    sb.append("    ptplA: ").append(toIndentedString(ptplA)).append("\n");
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

