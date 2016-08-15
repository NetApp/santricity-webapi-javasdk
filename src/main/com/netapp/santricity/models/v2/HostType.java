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


package com.netapp.santricity.models.v2;

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
 * A Host Type is a definition of the operating system of the Host computer  that accesses the storage system, for example VmWare, Windows, Solaris, Linux, etc.  The Host   Type is used by the storage system to customize the I/O protocol based on the implementation of   the host I/O drivers.
 */
@ApiModel(description = "A Host Type is a definition of the operating system of the Host computer  that accesses the storage system, for example VmWare, Windows, Solaris, Linux, etc.  The Host   Type is used by the storage system to customize the I/O protocol based on the implementation of   the host I/O drivers.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class HostType   {
  
    private String name;

    private Integer index;

    private String code;

    private Boolean used;

    private Boolean _default;

  
  /**
   **/
  public HostType name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public HostType index(Integer index) {
    this.index = index;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   **/
  public HostType code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  public HostType used(Boolean used) {
    this.used = used;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("used")
  public Boolean getUsed() {
    return used;
  }
  
  public void setUsed(Boolean used) {
    this.used = used;
  }

  
  /**
   **/
  public HostType _default(Boolean _default) {
    this._default = _default;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }
  
  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostType hostType = (HostType) o;
    return Objects.equals(this.name, hostType.name) &&
        Objects.equals(this.index, hostType.index) &&
        Objects.equals(this.code, hostType.code) &&
        Objects.equals(this.used, hostType.used) &&
        Objects.equals(this._default, hostType._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, index, code, used, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

