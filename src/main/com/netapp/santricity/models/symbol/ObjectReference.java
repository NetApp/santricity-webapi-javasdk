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
 * ObjectReference
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ObjectReference   {
  

  /**
   * This enumeration identifies the different types of object references.
   */
  public enum RefTypeEnum {
    generic("generic"),
    controller("controller"),
    genericTyped("genericTyped"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RefTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RefTypeEnum refType;

    private String controllerRef;

    private String symbolRef;

    private TypedSYMbolReference typedReference;

  
  /**
   * This enumeration identifies the different types of object references.
   **/
  public ObjectReference refType(RefTypeEnum refType) {
    this.refType = refType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration identifies the different types of object references.")
  @JsonProperty("refType")
  public RefTypeEnum getRefType() {
    return refType;
  }
  
  public void setRefType(RefTypeEnum refType) {
    this.refType = refType;
  }

  
  /**
   * A ControllerRef that refers to the object. Controllers are identified separately from other SYMbol objects because their refs require special handling by the firmware. This field is only valid if refType is equal to OBJ_REF_CONTROLLER.
   **/
  public ObjectReference controllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A ControllerRef that refers to the object. Controllers are identified separately from other SYMbol objects because their refs require special handling by the firmware. This field is only valid if refType is equal to OBJ_REF_CONTROLLER.")
  @JsonProperty("controllerRef")
  public String getControllerRef() {
    return controllerRef;
  }
  
  public void setControllerRef(String controllerRef) {
    this.controllerRef = controllerRef;
  }

  
  /**
   * A SYMbolRef that refers to the object. All non-controller objects can be identified by an untyped SYMbol reference. This field is only present if refType is equal to OBJ_REF_GENERIC.
   **/
  public ObjectReference symbolRef(String symbolRef) {
    this.symbolRef = symbolRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A SYMbolRef that refers to the object. All non-controller objects can be identified by an untyped SYMbol reference. This field is only present if refType is equal to OBJ_REF_GENERIC.")
  @JsonProperty("symbolRef")
  public String getSymbolRef() {
    return symbolRef;
  }
  
  public void setSymbolRef(String symbolRef) {
    this.symbolRef = symbolRef;
  }

  
  /**
   * A reference to a SYMbol object that includes object type information. This value is only present if the discriminator refType is set to OBJ_REF_GENERIC_TYPED.
   **/
  public ObjectReference typedReference(TypedSYMbolReference typedReference) {
    this.typedReference = typedReference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to a SYMbol object that includes object type information. This value is only present if the discriminator refType is set to OBJ_REF_GENERIC_TYPED.")
  @JsonProperty("typedReference")
  public TypedSYMbolReference getTypedReference() {
    return typedReference;
  }
  
  public void setTypedReference(TypedSYMbolReference typedReference) {
    this.typedReference = typedReference;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectReference objectReference = (ObjectReference) o;
    return Objects.equals(this.refType, objectReference.refType) &&
        Objects.equals(this.controllerRef, objectReference.controllerRef) &&
        Objects.equals(this.symbolRef, objectReference.symbolRef) &&
        Objects.equals(this.typedReference, objectReference.typedReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refType, controllerRef, symbolRef, typedReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectReference {\n");
    
    sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    symbolRef: ").append(toIndentedString(symbolRef)).append("\n");
    sb.append("    typedReference: ").append(toIndentedString(typedReference)).append("\n");
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

