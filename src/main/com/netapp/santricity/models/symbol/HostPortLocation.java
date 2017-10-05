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
 * HostPortLocation
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class HostPortLocation   {
  

  /**
   * This enumeration defines the different I/O interface types that may be reported as part of the configuration information associated with a controller.
   */
  public enum IoInterfaceTypeEnum {
    notImplemented("notImplemented"),
    scsi("scsi"),
    fc("fc"),
    sata("sata"),
    sas("sas"),
    iscsi("iscsi"),
    ib("ib"),
    fcoe("fcoe"),
    nvmeof("nvmeof"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    IoInterfaceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private IoInterfaceTypeEnum ioInterfaceType;

    private String fcPortName;

    private String ibPortName;

    private String sasPortName;

  
  /**
   * This enumeration defines the different I/O interface types that may be reported as part of the configuration information associated with a controller.
   **/
  public HostPortLocation ioInterfaceType(IoInterfaceTypeEnum ioInterfaceType) {
    this.ioInterfaceType = ioInterfaceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration defines the different I/O interface types that may be reported as part of the configuration information associated with a controller.")
  @JsonProperty("ioInterfaceType")
  public IoInterfaceTypeEnum getIoInterfaceType() {
    return ioInterfaceType;
  }
  
  public void setIoInterfaceType(IoInterfaceTypeEnum ioInterfaceType) {
    this.ioInterfaceType = ioInterfaceType;
  }

  
  /**
   * This field is present only if the type value is equal to IO_IF_FC.
   **/
  public HostPortLocation fcPortName(String fcPortName) {
    this.fcPortName = fcPortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to IO_IF_FC.")
  @JsonProperty("fcPortName")
  public String getFcPortName() {
    return fcPortName;
  }
  
  public void setFcPortName(String fcPortName) {
    this.fcPortName = fcPortName;
  }

  
  /**
   * This field is present only if the type value is equal to IO_IF_IB.
   **/
  public HostPortLocation ibPortName(String ibPortName) {
    this.ibPortName = ibPortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to IO_IF_IB.")
  @JsonProperty("ibPortName")
  public String getIbPortName() {
    return ibPortName;
  }
  
  public void setIbPortName(String ibPortName) {
    this.ibPortName = ibPortName;
  }

  
  /**
   * This field is present only if the type value is equal to IO_IF_SAS.
   **/
  public HostPortLocation sasPortName(String sasPortName) {
    this.sasPortName = sasPortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the type value is equal to IO_IF_SAS.")
  @JsonProperty("sasPortName")
  public String getSasPortName() {
    return sasPortName;
  }
  
  public void setSasPortName(String sasPortName) {
    this.sasPortName = sasPortName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostPortLocation hostPortLocation = (HostPortLocation) o;
    return Objects.equals(this.ioInterfaceType, hostPortLocation.ioInterfaceType) &&
        Objects.equals(this.fcPortName, hostPortLocation.fcPortName) &&
        Objects.equals(this.ibPortName, hostPortLocation.ibPortName) &&
        Objects.equals(this.sasPortName, hostPortLocation.sasPortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ioInterfaceType, fcPortName, ibPortName, sasPortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostPortLocation {\n");
    
    sb.append("    ioInterfaceType: ").append(toIndentedString(ioInterfaceType)).append("\n");
    sb.append("    fcPortName: ").append(toIndentedString(fcPortName)).append("\n");
    sb.append("    ibPortName: ").append(toIndentedString(ibPortName)).append("\n");
    sb.append("    sasPortName: ").append(toIndentedString(sasPortName)).append("\n");
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

