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
 * Object that contains definitions for on board and bundled code module versions
 */
@ApiModel(description = "Object that contains definitions for on board and bundled code module versions")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class VersionContent   {
  

  /**
   * The code module described
   */
  public enum ModuleEnum {
    unspecified("unspecified"),
    raid("raid"),
    hypervisor("hypervisor"),
    management("management"),
    iom("iom"),
    nvsram("nvsram"),
    bundle("bundle"),
    bundleDisplay("bundleDisplay"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ModuleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ModuleEnum module;

    private String bundledVersion;

    private String onboardVersion;

  
  /**
   * The code module described
   **/
  public VersionContent module(ModuleEnum module) {
    this.module = module;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The code module described")
  @JsonProperty("module")
  public ModuleEnum getModule() {
    return module;
  }
  
  public void setModule(ModuleEnum module) {
    this.module = module;
  }

  
  /**
   *  Code bundled with firmware file
   **/
  public VersionContent bundledVersion(String bundledVersion) {
    this.bundledVersion = bundledVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = " Code bundled with firmware file")
  @JsonProperty("bundledVersion")
  public String getBundledVersion() {
    return bundledVersion;
  }
  
  public void setBundledVersion(String bundledVersion) {
    this.bundledVersion = bundledVersion;
  }

  
  /**
   *  Code active on storage system
   **/
  public VersionContent onboardVersion(String onboardVersion) {
    this.onboardVersion = onboardVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = " Code active on storage system")
  @JsonProperty("onboardVersion")
  public String getOnboardVersion() {
    return onboardVersion;
  }
  
  public void setOnboardVersion(String onboardVersion) {
    this.onboardVersion = onboardVersion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionContent versionContent = (VersionContent) o;
    return Objects.equals(this.module, versionContent.module) &&
        Objects.equals(this.bundledVersion, versionContent.bundledVersion) &&
        Objects.equals(this.onboardVersion, versionContent.onboardVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, bundledVersion, onboardVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionContent {\n");
    
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    bundledVersion: ").append(toIndentedString(bundledVersion)).append("\n");
    sb.append("    onboardVersion: ").append(toIndentedString(onboardVersion)).append("\n");
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

