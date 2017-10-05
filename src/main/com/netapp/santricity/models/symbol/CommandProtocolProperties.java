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
 * CommandProtocolProperties
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class CommandProtocolProperties   {
  

  /**
   * This enumeration describes the command protocol (e.g. SCSI vs. NVMe).
   */
  public enum CommandProtocolEnum {
    unknown("unknown"),
    scsi("scsi"),
    nvme("nvme"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CommandProtocolEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CommandProtocolEnum commandProtocol;

    private NVMeCommandProtocolProperties nvmeProperties;

  
  /**
   * This enumeration describes the command protocol (e.g. SCSI vs. NVMe).
   **/
  public CommandProtocolProperties commandProtocol(CommandProtocolEnum commandProtocol) {
    this.commandProtocol = commandProtocol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration describes the command protocol (e.g. SCSI vs. NVMe).")
  @JsonProperty("commandProtocol")
  public CommandProtocolEnum getCommandProtocol() {
    return commandProtocol;
  }
  
  public void setCommandProtocol(CommandProtocolEnum commandProtocol) {
    this.commandProtocol = commandProtocol;
  }

  
  /**
   * This field describes the NVMe command protocol properties.
   **/
  public CommandProtocolProperties nvmeProperties(NVMeCommandProtocolProperties nvmeProperties) {
    this.nvmeProperties = nvmeProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field describes the NVMe command protocol properties.")
  @JsonProperty("nvmeProperties")
  public NVMeCommandProtocolProperties getNvmeProperties() {
    return nvmeProperties;
  }
  
  public void setNvmeProperties(NVMeCommandProtocolProperties nvmeProperties) {
    this.nvmeProperties = nvmeProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandProtocolProperties commandProtocolProperties = (CommandProtocolProperties) o;
    return Objects.equals(this.commandProtocol, commandProtocolProperties.commandProtocol) &&
        Objects.equals(this.nvmeProperties, commandProtocolProperties.nvmeProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandProtocol, nvmeProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandProtocolProperties {\n");
    
    sb.append("    commandProtocol: ").append(toIndentedString(commandProtocol)).append("\n");
    sb.append("    nvmeProperties: ").append(toIndentedString(nvmeProperties)).append("\n");
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

