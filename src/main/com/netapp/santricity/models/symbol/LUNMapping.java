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
 * LUNMapping
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class LUNMapping   {
  
    private String lunMappingRef;

    private Integer lun;

    private Integer ssid;

    private Integer perms;

    private String volumeRef;


  /**
   * The type of the LUN mapping.
   */
  public enum TypeEnum {
    none("none"),
    hostport("hostport"),
    host("host"),
    cluster("cluster"),
    saport("saport"),
    saportgroup("saportgroup"),
    hostsaconnection("hostsaconnection"),
    all("all"),
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

    private String mapRef;

    private String id;

  
  /**
   * The unique identification value for this object. Other objects may use this reference value to refer to the mapping definition.
   **/
  public LUNMapping lunMappingRef(String lunMappingRef) {
    this.lunMappingRef = lunMappingRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value for this object. Other objects may use this reference value to refer to the mapping definition.")
  @JsonProperty("lunMappingRef")
  public String getLunMappingRef() {
    return lunMappingRef;
  }
  
  public void setLunMappingRef(String lunMappingRef) {
    this.lunMappingRef = lunMappingRef;
  }

  
  /**
   * The unique identification value for this object. Other objects may use this reference value to refer to the mapping definition.
   **/
  public LUNMapping lun(Integer lun) {
    this.lun = lun;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value for this object. Other objects may use this reference value to refer to the mapping definition.")
  @JsonProperty("lun")
  public Integer getLun() {
    return lun;
  }
  
  public void setLun(Integer lun) {
    this.lun = lun;
  }

  
  /**
   * An internal volume identifier value that is not meaningful outside the firmware environment.
   **/
  public LUNMapping ssid(Integer ssid) {
    this.ssid = ssid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An internal volume identifier value that is not meaningful outside the firmware environment.")
  @JsonProperty("ssid")
  public Integer getSsid() {
    return ssid;
  }
  
  public void setSsid(Integer ssid) {
    this.ssid = ssid;
  }

  
  /**
   * The permission values associated with this mapping definition. This field is not currently used, but is provided for future extensions.
   **/
  public LUNMapping perms(Integer perms) {
    this.perms = perms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The permission values associated with this mapping definition. This field is not currently used, but is provided for future extensions.")
  @JsonProperty("perms")
  public Integer getPerms() {
    return perms;
  }
  
  public void setPerms(Integer perms) {
    this.perms = perms;
  }

  
  /**
   * The unique identification value of the volume that is accessed via the LUN value associated with this mapping definition.
   **/
  public LUNMapping volumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identification value of the volume that is accessed via the LUN value associated with this mapping definition.")
  @JsonProperty("volumeRef")
  public String getVolumeRef() {
    return volumeRef;
  }
  
  public void setVolumeRef(String volumeRef) {
    this.volumeRef = volumeRef;
  }

  
  /**
   * The type of the LUN mapping.
   **/
  public LUNMapping type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the LUN mapping.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The unique identifier of the entity for which the mapping applies. The type of the entity, and thus of the SYMbol reference, depends on the mapping type. For example, if the LUNMapping object represents a cluster-wide mapping, this field will contain the ClusterRef of the cluster for which the mapping applies. Similarly, if the object represents a host-specific mapping, this field will contain the HostRef of the host for which the mapping applies. Note that if the object represents a default mapping, this field will contain a NULL SYMbolRef.
   **/
  public LUNMapping mapRef(String mapRef) {
    this.mapRef = mapRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the entity for which the mapping applies. The type of the entity, and thus of the SYMbol reference, depends on the mapping type. For example, if the LUNMapping object represents a cluster-wide mapping, this field will contain the ClusterRef of the cluster for which the mapping applies. Similarly, if the object represents a host-specific mapping, this field will contain the HostRef of the host for which the mapping applies. Note that if the object represents a default mapping, this field will contain a NULL SYMbolRef.")
  @JsonProperty("mapRef")
  public String getMapRef() {
    return mapRef;
  }
  
  public void setMapRef(String mapRef) {
    this.mapRef = mapRef;
  }

  
  /**
   **/
  public LUNMapping id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LUNMapping lUNMapping = (LUNMapping) o;
    return Objects.equals(this.lunMappingRef, lUNMapping.lunMappingRef) &&
        Objects.equals(this.lun, lUNMapping.lun) &&
        Objects.equals(this.ssid, lUNMapping.ssid) &&
        Objects.equals(this.perms, lUNMapping.perms) &&
        Objects.equals(this.volumeRef, lUNMapping.volumeRef) &&
        Objects.equals(this.type, lUNMapping.type) &&
        Objects.equals(this.mapRef, lUNMapping.mapRef) &&
        Objects.equals(this.id, lUNMapping.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lunMappingRef, lun, ssid, perms, volumeRef, type, mapRef, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LUNMapping {\n");
    
    sb.append("    lunMappingRef: ").append(toIndentedString(lunMappingRef)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    volumeRef: ").append(toIndentedString(volumeRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mapRef: ").append(toIndentedString(mapRef)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

