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
 * EsmInterfaceAttributes
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class EsmInterfaceAttributes   {
  

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

    private FibreEsmAttributes fibreEsmAttributes;

    private SasEsmAttributes sasEsmAttributes;

  
  /**
   * This enumeration defines the different I/O interface types that may be reported as part of the configuration information associated with a controller.
   **/
  public EsmInterfaceAttributes ioInterfaceType(IoInterfaceTypeEnum ioInterfaceType) {
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
   * This field is only present if the ioInterfaceType value is IO_IF_FC. It contains attributes that are specific to fibre channel ESMs.
   **/
  public EsmInterfaceAttributes fibreEsmAttributes(FibreEsmAttributes fibreEsmAttributes) {
    this.fibreEsmAttributes = fibreEsmAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the ioInterfaceType value is IO_IF_FC. It contains attributes that are specific to fibre channel ESMs.")
  @JsonProperty("fibreEsmAttributes")
  public FibreEsmAttributes getFibreEsmAttributes() {
    return fibreEsmAttributes;
  }
  
  public void setFibreEsmAttributes(FibreEsmAttributes fibreEsmAttributes) {
    this.fibreEsmAttributes = fibreEsmAttributes;
  }

  
  /**
   * This field is only present if the ioInterfaceType value is IO_IF_SAS. It contains attributes that are specific serial-attached SCSI ESMs.
   **/
  public EsmInterfaceAttributes sasEsmAttributes(SasEsmAttributes sasEsmAttributes) {
    this.sasEsmAttributes = sasEsmAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the ioInterfaceType value is IO_IF_SAS. It contains attributes that are specific serial-attached SCSI ESMs.")
  @JsonProperty("sasEsmAttributes")
  public SasEsmAttributes getSasEsmAttributes() {
    return sasEsmAttributes;
  }
  
  public void setSasEsmAttributes(SasEsmAttributes sasEsmAttributes) {
    this.sasEsmAttributes = sasEsmAttributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsmInterfaceAttributes esmInterfaceAttributes = (EsmInterfaceAttributes) o;
    return Objects.equals(this.ioInterfaceType, esmInterfaceAttributes.ioInterfaceType) &&
        Objects.equals(this.fibreEsmAttributes, esmInterfaceAttributes.fibreEsmAttributes) &&
        Objects.equals(this.sasEsmAttributes, esmInterfaceAttributes.sasEsmAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ioInterfaceType, fibreEsmAttributes, sasEsmAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsmInterfaceAttributes {\n");
    
    sb.append("    ioInterfaceType: ").append(toIndentedString(ioInterfaceType)).append("\n");
    sb.append("    fibreEsmAttributes: ").append(toIndentedString(fibreEsmAttributes)).append("\n");
    sb.append("    sasEsmAttributes: ").append(toIndentedString(sasEsmAttributes)).append("\n");
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

