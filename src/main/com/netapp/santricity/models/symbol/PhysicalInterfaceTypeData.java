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
 * PhysicalInterfaceTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PhysicalInterfaceTypeData   {
  

  /**
   * This enumeration object is used to indicate the physical type of an I/O interface, in contrast to the logical protocol used by the interface (iSCSI is a logical protocol; Ethernet is a physical interface).
   */
  public enum TypeEnum {
    unknown("unknown"),
    ethernet("ethernet"),
    infiniband("infiniband"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TypeEnum type;

    private EthernetInterfaceData ethernetData;

    private InfinibandInterfaceData infinibandData;

  
  /**
   * This enumeration object is used to indicate the physical type of an I/O interface, in contrast to the logical protocol used by the interface (iSCSI is a logical protocol; Ethernet is a physical interface).
   **/
  public PhysicalInterfaceTypeData type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to indicate the physical type of an I/O interface, in contrast to the logical protocol used by the interface (iSCSI is a logical protocol; Ethernet is a physical interface).")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * This field contains information about an Ethernet physical interface It is only present if the type field is equal to PHYSICAL_INTERFACE_ETHERNET.
   **/
  public PhysicalInterfaceTypeData ethernetData(EthernetInterfaceData ethernetData) {
    this.ethernetData = ethernetData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field contains information about an Ethernet physical interface It is only present if the type field is equal to PHYSICAL_INTERFACE_ETHERNET.")
  @JsonProperty("ethernetData")
  public EthernetInterfaceData getEthernetData() {
    return ethernetData;
  }
  
  public void setEthernetData(EthernetInterfaceData ethernetData) {
    this.ethernetData = ethernetData;
  }

  
  /**
   * This field indicates iSCSI/iSER interface.
   **/
  public PhysicalInterfaceTypeData infinibandData(InfinibandInterfaceData infinibandData) {
    this.infinibandData = infinibandData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field indicates iSCSI/iSER interface.")
  @JsonProperty("infinibandData")
  public InfinibandInterfaceData getInfinibandData() {
    return infinibandData;
  }
  
  public void setInfinibandData(InfinibandInterfaceData infinibandData) {
    this.infinibandData = infinibandData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalInterfaceTypeData physicalInterfaceTypeData = (PhysicalInterfaceTypeData) o;
    return Objects.equals(this.type, physicalInterfaceTypeData.type) &&
        Objects.equals(this.ethernetData, physicalInterfaceTypeData.ethernetData) &&
        Objects.equals(this.infinibandData, physicalInterfaceTypeData.infinibandData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ethernetData, infinibandData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalInterfaceTypeData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ethernetData: ").append(toIndentedString(ethernetData)).append("\n");
    sb.append("    infinibandData: ").append(toIndentedString(infinibandData)).append("\n");
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

