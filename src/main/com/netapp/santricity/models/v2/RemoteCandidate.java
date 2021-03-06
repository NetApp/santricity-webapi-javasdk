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
 * A storage-device candidate for use with ARVM.
 */
@ApiModel(description = "A storage-device candidate for use with ARVM.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class RemoteCandidate   {
  
    private String wwn;

    private String id;

    private String name;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    fibre("fibre"),
    iscsi("iscsi"),
    fibreAndIscsi("fibreAndIscsi"),
    none("none");
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


  /**
   * Gets or Sets fcMirroringState
   */
  public enum FcMirroringStateEnum {
    unknown("unknown"),
    disabled("disabled"),
    enabledLegacyRvm("enabledLegacyRvm"),
    enabledArvm("enabledArvm"),
    enabledAll("enabledAll"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FcMirroringStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FcMirroringStateEnum fcMirroringState;

  
  /**
   **/
  public RemoteCandidate wwn(String wwn) {
    this.wwn = wwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("wwn")
  public String getWwn() {
    return wwn;
  }
  
  public void setWwn(String wwn) {
    this.wwn = wwn;
  }

  
  /**
   **/
  public RemoteCandidate id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public RemoteCandidate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public RemoteCandidate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public RemoteCandidate fcMirroringState(FcMirroringStateEnum fcMirroringState) {
    this.fcMirroringState = fcMirroringState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fcMirroringState")
  public FcMirroringStateEnum getFcMirroringState() {
    return fcMirroringState;
  }
  
  public void setFcMirroringState(FcMirroringStateEnum fcMirroringState) {
    this.fcMirroringState = fcMirroringState;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteCandidate remoteCandidate = (RemoteCandidate) o;
    return Objects.equals(this.wwn, remoteCandidate.wwn) &&
        Objects.equals(this.id, remoteCandidate.id) &&
        Objects.equals(this.name, remoteCandidate.name) &&
        Objects.equals(this.type, remoteCandidate.type) &&
        Objects.equals(this.fcMirroringState, remoteCandidate.fcMirroringState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wwn, id, name, type, fcMirroringState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteCandidate {\n");
    
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fcMirroringState: ").append(toIndentedString(fcMirroringState)).append("\n");
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

