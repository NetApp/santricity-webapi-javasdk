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
 * TypedSYMbolReference
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class TypedSYMbolReference   {
  

  /**
   * An enumeration value indicating the type of component that the reference refers to.
   */
  public enum ComponentTypeEnum {
    unknown("unknown"),
    fan("fan"),
    battery("battery"),
    powerSupply("powerSupply"),
    thermalSensor("thermalSensor"),
    esm("esm"),
    ups("ups"),
    minihub("minihub"),
    gbic("gbic"),
    sfp("sfp"),
    interconnectCru("interconnectCru"),
    supportCru("supportCru"),
    alarm("alarm"),
    hostboard("hostboard"),
    icSasExpander("icSasExpander"),
    hostIoCard("hostIoCard"),
    cacheBackupDevice("cacheBackupDevice"),
    cacheMemDimm("cacheMemDimm"),
    procMemDimm("procMemDimm"),
    channelPort("channelPort"),
    drive("drive"),
    controller("controller"),
    ethernetInterface("ethernetInterface"),
    fibreInterface("fibreInterface"),
    ibInterface("ibInterface"),
    iscsiInterface("iscsiInterface"),
    sasInterface("sasInterface"),
    tray("tray"),
    storageArray("storageArray"),
    drawer("drawer"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ComponentTypeEnum componentType;

    private String symbolRef;

  
  /**
   * An enumeration value indicating the type of component that the reference refers to.
   **/
  public TypedSYMbolReference componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An enumeration value indicating the type of component that the reference refers to.")
  @JsonProperty("componentType")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }
  
  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  
  /**
   * A SYMbol reference that refers to an instance of an object of the type identified by componentType. If the component type is \"storage array,\" this field is a null reference. This is because an object graph describes a single instance of a storage array, so there is no need to uniquely identify instances.
   **/
  public TypedSYMbolReference symbolRef(String symbolRef) {
    this.symbolRef = symbolRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A SYMbol reference that refers to an instance of an object of the type identified by componentType. If the component type is \"storage array,\" this field is a null reference. This is because an object graph describes a single instance of a storage array, so there is no need to uniquely identify instances.")
  @JsonProperty("symbolRef")
  public String getSymbolRef() {
    return symbolRef;
  }
  
  public void setSymbolRef(String symbolRef) {
    this.symbolRef = symbolRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypedSYMbolReference typedSYMbolReference = (TypedSYMbolReference) o;
    return Objects.equals(this.componentType, typedSYMbolReference.componentType) &&
        Objects.equals(this.symbolRef, typedSYMbolReference.symbolRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentType, symbolRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypedSYMbolReference {\n");
    
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    symbolRef: ").append(toIndentedString(symbolRef)).append("\n");
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

