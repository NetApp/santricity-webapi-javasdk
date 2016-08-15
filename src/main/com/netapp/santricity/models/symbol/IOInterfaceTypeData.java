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
 * IOInterfaceTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IOInterfaceTypeData   {
  

  /**
   * This enumeration defines the different I/O interface types that may be reported as part of the configuration information associated with a controller.
   */
  public enum InterfaceTypeEnum {
    notImplemented("notImplemented"),
    scsi("scsi"),
    fc("fc"),
    sata("sata"),
    sas("sas"),
    iscsi("iscsi"),
    ib("ib"),
    fcoe("fcoe"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    InterfaceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private InterfaceTypeEnum interfaceType;

    private FibreInterface fibre;

    private IbInterface ib;

    private IscsiInterface iscsi;

    private SasInterface sas;

    private SATAInterface sata;

    private SCSIInterface scsi;

  
  /**
   * This enumeration defines the different I/O interface types that may be reported as part of the configuration information associated with a controller.
   **/
  public IOInterfaceTypeData interfaceType(InterfaceTypeEnum interfaceType) {
    this.interfaceType = interfaceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration defines the different I/O interface types that may be reported as part of the configuration information associated with a controller.")
  @JsonProperty("interfaceType")
  public InterfaceTypeEnum getInterfaceType() {
    return interfaceType;
  }
  
  public void setInterfaceType(InterfaceTypeEnum interfaceType) {
    this.interfaceType = interfaceType;
  }

  
  /**
   * This field is present only if the interfaceType value is equal to IO_IF_FC. It contains the detailed interface information for a Fibre Channel I/O interface.
   **/
  public IOInterfaceTypeData fibre(FibreInterface fibre) {
    this.fibre = fibre;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the interfaceType value is equal to IO_IF_FC. It contains the detailed interface information for a Fibre Channel I/O interface.")
  @JsonProperty("fibre")
  public FibreInterface getFibre() {
    return fibre;
  }
  
  public void setFibre(FibreInterface fibre) {
    this.fibre = fibre;
  }

  
  /**
   * This field is present only if the interfaceType value is equal to IO_IF_IB. It contains the detailed interface information for an Infiniband interface.
   **/
  public IOInterfaceTypeData ib(IbInterface ib) {
    this.ib = ib;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the interfaceType value is equal to IO_IF_IB. It contains the detailed interface information for an Infiniband interface.")
  @JsonProperty("ib")
  public IbInterface getIb() {
    return ib;
  }
  
  public void setIb(IbInterface ib) {
    this.ib = ib;
  }

  
  /**
   * This field is present only if the interface type value is equal to IO_IF_ISCSI. It contains the detailed interface information for an iSCSI I/O interface.
   **/
  public IOInterfaceTypeData iscsi(IscsiInterface iscsi) {
    this.iscsi = iscsi;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the interface type value is equal to IO_IF_ISCSI. It contains the detailed interface information for an iSCSI I/O interface.")
  @JsonProperty("iscsi")
  public IscsiInterface getIscsi() {
    return iscsi;
  }
  
  public void setIscsi(IscsiInterface iscsi) {
    this.iscsi = iscsi;
  }

  
  /**
   * This field is present only if the interfaceType value is equal to IO_IF_SAS. It contains the detailed interface information for a serial-attached SCSI I/O interface.
   **/
  public IOInterfaceTypeData sas(SasInterface sas) {
    this.sas = sas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the interfaceType value is equal to IO_IF_SAS. It contains the detailed interface information for a serial-attached SCSI I/O interface.")
  @JsonProperty("sas")
  public SasInterface getSas() {
    return sas;
  }
  
  public void setSas(SasInterface sas) {
    this.sas = sas;
  }

  
  /**
   * This field is present only if the interfaceType value is equal to IO_IF_SATA. It contains the detailed interface information for a SATA I/O interface.
   **/
  public IOInterfaceTypeData sata(SATAInterface sata) {
    this.sata = sata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the interfaceType value is equal to IO_IF_SATA. It contains the detailed interface information for a SATA I/O interface.")
  @JsonProperty("sata")
  public SATAInterface getSata() {
    return sata;
  }
  
  public void setSata(SATAInterface sata) {
    this.sata = sata;
  }

  
  /**
   * This field is present only if the interfaceType value is equal to IO_IF_SCSI. It contains the detailed interface information for a SCSI I/O interface.
   **/
  public IOInterfaceTypeData scsi(SCSIInterface scsi) {
    this.scsi = scsi;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the interfaceType value is equal to IO_IF_SCSI. It contains the detailed interface information for a SCSI I/O interface.")
  @JsonProperty("scsi")
  public SCSIInterface getScsi() {
    return scsi;
  }
  
  public void setScsi(SCSIInterface scsi) {
    this.scsi = scsi;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IOInterfaceTypeData iOInterfaceTypeData = (IOInterfaceTypeData) o;
    return Objects.equals(this.interfaceType, iOInterfaceTypeData.interfaceType) &&
        Objects.equals(this.fibre, iOInterfaceTypeData.fibre) &&
        Objects.equals(this.ib, iOInterfaceTypeData.ib) &&
        Objects.equals(this.iscsi, iOInterfaceTypeData.iscsi) &&
        Objects.equals(this.sas, iOInterfaceTypeData.sas) &&
        Objects.equals(this.sata, iOInterfaceTypeData.sata) &&
        Objects.equals(this.scsi, iOInterfaceTypeData.scsi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceType, fibre, ib, iscsi, sas, sata, scsi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IOInterfaceTypeData {\n");
    
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
    sb.append("    fibre: ").append(toIndentedString(fibre)).append("\n");
    sb.append("    ib: ").append(toIndentedString(ib)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    sas: ").append(toIndentedString(sas)).append("\n");
    sb.append("    sata: ").append(toIndentedString(sata)).append("\n");
    sb.append("    scsi: ").append(toIndentedString(scsi)).append("\n");
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

