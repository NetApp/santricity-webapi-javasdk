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
 * ScsiNodeName
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ScsiNodeName   {
  

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

    private String iscsiNodeName;

    private String remoteNodeWWN;

  
  /**
   * This enumeration defines the different I/O interface types that may be reported as part of the configuration information associated with a controller.
   **/
  public ScsiNodeName ioInterfaceType(IoInterfaceTypeEnum ioInterfaceType) {
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
   * The SCSI node name as defined under iSCSI. This field is only valid if the I/O interface type is equal to IO_IF_ISCSI.
   **/
  public ScsiNodeName iscsiNodeName(String iscsiNodeName) {
    this.iscsiNodeName = iscsiNodeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The SCSI node name as defined under iSCSI. This field is only valid if the I/O interface type is equal to IO_IF_ISCSI.")
  @JsonProperty("iscsiNodeName")
  public String getIscsiNodeName() {
    return iscsiNodeName;
  }
  
  public void setIscsiNodeName(String iscsiNodeName) {
    this.iscsiNodeName = iscsiNodeName;
  }

  
  /**
   * The FC WWN for the remote node. This field is only valid if the I/O interface type is equal to IO_IF_FC.
   **/
  public ScsiNodeName remoteNodeWWN(String remoteNodeWWN) {
    this.remoteNodeWWN = remoteNodeWWN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The FC WWN for the remote node. This field is only valid if the I/O interface type is equal to IO_IF_FC.")
  @JsonProperty("remoteNodeWWN")
  public String getRemoteNodeWWN() {
    return remoteNodeWWN;
  }
  
  public void setRemoteNodeWWN(String remoteNodeWWN) {
    this.remoteNodeWWN = remoteNodeWWN;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScsiNodeName scsiNodeName = (ScsiNodeName) o;
    return Objects.equals(this.ioInterfaceType, scsiNodeName.ioInterfaceType) &&
        Objects.equals(this.iscsiNodeName, scsiNodeName.iscsiNodeName) &&
        Objects.equals(this.remoteNodeWWN, scsiNodeName.remoteNodeWWN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ioInterfaceType, iscsiNodeName, remoteNodeWWN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScsiNodeName {\n");
    
    sb.append("    ioInterfaceType: ").append(toIndentedString(ioInterfaceType)).append("\n");
    sb.append("    iscsiNodeName: ").append(toIndentedString(iscsiNodeName)).append("\n");
    sb.append("    remoteNodeWWN: ").append(toIndentedString(remoteNodeWWN)).append("\n");
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

