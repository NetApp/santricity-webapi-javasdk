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
 * IpV6AddressState
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IpV6AddressState   {
  

  /**
   * This enumeration defines the two different types of IPV6 addresses - interface or router.
   */
  public enum AddressTypeEnum {
    typeInterface("typeInterface"),
    typeRouter("typeRouter"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AddressTypeEnum addressType;


  /**
   * The interface address state. This field is only valid if addressType is equal to IPV6_ADDR_TYPE_INTERFACE.
   */
  public enum InterfaceAddressStateEnum {
    unconfigured("unconfigured"),
    acquiring("acquiring"),
    configured("configured"),
    invalid("invalid"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    InterfaceAddressStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private InterfaceAddressStateEnum interfaceAddressState;


  /**
   * The router address state. This field is only valid if addressType is equal to IPV6_ADDR_TYPE_ROUTER.
   */
  public enum RouterAddressStateEnum {
    unknown("unknown"),
    configured("configured"),
    advertised("advertised"),
    stale("stale"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RouterAddressStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RouterAddressStateEnum routerAddressState;

  
  /**
   * This enumeration defines the two different types of IPV6 addresses - interface or router.
   **/
  public IpV6AddressState addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration defines the two different types of IPV6 addresses - interface or router.")
  @JsonProperty("addressType")
  public AddressTypeEnum getAddressType() {
    return addressType;
  }
  
  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  
  /**
   * The interface address state. This field is only valid if addressType is equal to IPV6_ADDR_TYPE_INTERFACE.
   **/
  public IpV6AddressState interfaceAddressState(InterfaceAddressStateEnum interfaceAddressState) {
    this.interfaceAddressState = interfaceAddressState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The interface address state. This field is only valid if addressType is equal to IPV6_ADDR_TYPE_INTERFACE.")
  @JsonProperty("interfaceAddressState")
  public InterfaceAddressStateEnum getInterfaceAddressState() {
    return interfaceAddressState;
  }
  
  public void setInterfaceAddressState(InterfaceAddressStateEnum interfaceAddressState) {
    this.interfaceAddressState = interfaceAddressState;
  }

  
  /**
   * The router address state. This field is only valid if addressType is equal to IPV6_ADDR_TYPE_ROUTER.
   **/
  public IpV6AddressState routerAddressState(RouterAddressStateEnum routerAddressState) {
    this.routerAddressState = routerAddressState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The router address state. This field is only valid if addressType is equal to IPV6_ADDR_TYPE_ROUTER.")
  @JsonProperty("routerAddressState")
  public RouterAddressStateEnum getRouterAddressState() {
    return routerAddressState;
  }
  
  public void setRouterAddressState(RouterAddressStateEnum routerAddressState) {
    this.routerAddressState = routerAddressState;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpV6AddressState ipV6AddressState = (IpV6AddressState) o;
    return Objects.equals(this.addressType, ipV6AddressState.addressType) &&
        Objects.equals(this.interfaceAddressState, ipV6AddressState.interfaceAddressState) &&
        Objects.equals(this.routerAddressState, ipV6AddressState.routerAddressState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, interfaceAddressState, routerAddressState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpV6AddressState {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    interfaceAddressState: ").append(toIndentedString(interfaceAddressState)).append("\n");
    sb.append("    routerAddressState: ").append(toIndentedString(routerAddressState)).append("\n");
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

