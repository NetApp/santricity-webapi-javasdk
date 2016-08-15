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
 * PersistentRegistration
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PersistentRegistration   {
  
    private String volumeRef;

    private Integer lun;

    private String clusterRef;

    private String hostRef;


  /**
   * Reservation type.
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

    private RegistrantList registrantList;

    private Boolean ptplA;

  
  /**
   * The volume identifier.
   **/
  public PersistentRegistration volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The volume identifier.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * LUN (mapped).
   **/
  public PersistentRegistration lun(Integer lun) {
    this.lun = lun;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "LUN (mapped).")
  @JsonProperty("lun")
  public Integer getLun() {
    return lun;
  }
  
  public void setLun(Integer lun) {
    this.lun = lun;
  }

  
  /**
   * Group that volume is accessible by.
   **/
  public PersistentRegistration clusterRef(String clusterRef) {
    this.clusterRef = clusterRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Group that volume is accessible by.")
  @JsonProperty("clusterRef")
  public String getClusterRef() {
    return clusterRef;
  }
  
  public void setClusterRef(String clusterRef) {
    this.clusterRef = clusterRef;
  }

  
  /**
   * Host that volume is accessible by.
   **/
  public PersistentRegistration hostRef(String hostRef) {
    this.hostRef = hostRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Host that volume is accessible by.")
  @JsonProperty("hostRef")
  public String getHostRef() {
    return hostRef;
  }
  
  public void setHostRef(String hostRef) {
    this.hostRef = hostRef;
  }

  
  /**
   * Reservation type.
   **/
  public PersistentRegistration reservationTypeID(ReservationTypeIDEnum reservationTypeID) {
    this.reservationTypeID = reservationTypeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reservation type.")
  @JsonProperty("reservationTypeID")
  public ReservationTypeIDEnum getReservationTypeID() {
    return reservationTypeID;
  }
  
  public void setReservationTypeID(ReservationTypeIDEnum reservationTypeID) {
    this.reservationTypeID = reservationTypeID;
  }

  
  /**
   * List of registrants.
   **/
  public PersistentRegistration registrantList(RegistrantList registrantList) {
    this.registrantList = registrantList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of registrants.")
  @JsonProperty("registrantList")
  public RegistrantList getRegistrantList() {
    return registrantList;
  }
  
  public void setRegistrantList(RegistrantList registrantList) {
    this.registrantList = registrantList;
  }

  
  /**
   * Persist through power loss active.
   **/
  public PersistentRegistration ptplA(Boolean ptplA) {
    this.ptplA = ptplA;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Persist through power loss active.")
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
    PersistentRegistration persistentRegistration = (PersistentRegistration) o;
    return Objects.equals(this.volumeRef, persistentRegistration.volumeRef) &&
        Objects.equals(this.lun, persistentRegistration.lun) &&
        Objects.equals(this.clusterRef, persistentRegistration.clusterRef) &&
        Objects.equals(this.hostRef, persistentRegistration.hostRef) &&
        Objects.equals(this.reservationTypeID, persistentRegistration.reservationTypeID) &&
        Objects.equals(this.registrantList, persistentRegistration.registrantList) &&
        Objects.equals(this.ptplA, persistentRegistration.ptplA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeRef, lun, clusterRef, hostRef, reservationTypeID, registrantList, ptplA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistentRegistration {\n");
    
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    clusterRef: ").append(toIndentedString(clusterRef)).append("\n");
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
    sb.append("    reservationTypeID: ").append(toIndentedString(reservationTypeID)).append("\n");
    sb.append("    registrantList: ").append(toIndentedString(registrantList)).append("\n");
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

