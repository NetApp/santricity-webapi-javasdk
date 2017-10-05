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
 * IscsiSession
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IscsiSession   {
  

  /**
   * The type of session, discovery or normal.
   */
  public enum TypeEnum {
    discovery("discovery"),
    normal("normal"),
    __UNDEFINED("__UNDEFINED");
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

    private Integer tsih;

    private IscsiSessionEndpoints endpoints;

    private IscsiNegotiableSessionSettings negotiatedSettings;

    private List<IscsiConnection> connections;

  
  /**
   * The type of session, discovery or normal.
   **/
  public IscsiSession type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of session, discovery or normal.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * A target-assigned handle of unspecified format that uniquely identifies the session.
   **/
  public IscsiSession tsih(Integer tsih) {
    this.tsih = tsih;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A target-assigned handle of unspecified format that uniquely identifies the session.")
  @JsonProperty("tsih")
  public Integer getTsih() {
    return tsih;
  }
  
  public void setTsih(Integer tsih) {
    this.tsih = tsih;
  }

  
  /**
   * The SCSI protocol endpoints of the session.
   **/
  public IscsiSession endpoints(IscsiSessionEndpoints endpoints) {
    this.endpoints = endpoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SCSI protocol endpoints of the session.")
  @JsonProperty("endpoints")
  public IscsiSessionEndpoints getEndpoints() {
    return endpoints;
  }
  
  public void setEndpoints(IscsiSessionEndpoints endpoints) {
    this.endpoints = endpoints;
  }

  
  /**
   * A collection of session-level settings that are subject to initiator-target negotiation.
   **/
  public IscsiSession negotiatedSettings(IscsiNegotiableSessionSettings negotiatedSettings) {
    this.negotiatedSettings = negotiatedSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A collection of session-level settings that are subject to initiator-target negotiation.")
  @JsonProperty("negotiatedSettings")
  public IscsiNegotiableSessionSettings getNegotiatedSettings() {
    return negotiatedSettings;
  }
  
  public void setNegotiatedSettings(IscsiNegotiableSessionSettings negotiatedSettings) {
    this.negotiatedSettings = negotiatedSettings;
  }

  
  /**
   * The set of connections that are associated with this session.
   **/
  public IscsiSession connections(List<IscsiConnection> connections) {
    this.connections = connections;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of connections that are associated with this session.")
  @JsonProperty("connections")
  public List<IscsiConnection> getConnections() {
    return connections;
  }
  
  public void setConnections(List<IscsiConnection> connections) {
    this.connections = connections;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiSession iscsiSession = (IscsiSession) o;
    return Objects.equals(this.type, iscsiSession.type) &&
        Objects.equals(this.tsih, iscsiSession.tsih) &&
        Objects.equals(this.endpoints, iscsiSession.endpoints) &&
        Objects.equals(this.negotiatedSettings, iscsiSession.negotiatedSettings) &&
        Objects.equals(this.connections, iscsiSession.connections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, tsih, endpoints, negotiatedSettings, connections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiSession {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tsih: ").append(toIndentedString(tsih)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    negotiatedSettings: ").append(toIndentedString(negotiatedSettings)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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

