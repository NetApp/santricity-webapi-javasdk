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
 * IdentificationRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class IdentificationRequest   {
  
    private List<Integer> channels;

    private List<String> trays;

    private List<String> drives;

    private List<String> pools;

    private List<String> volumes;

    private Boolean storageSystem;

  
  /**
   * A list of channel ids.
   **/
  public IdentificationRequest channels(List<Integer> channels) {
    this.channels = channels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of channel ids.")
  @JsonProperty("channels")
  public List<Integer> getChannels() {
    return channels;
  }
  
  public void setChannels(List<Integer> channels) {
    this.channels = channels;
  }

  
  /**
   * A list of tray ids.
   **/
  public IdentificationRequest trays(List<String> trays) {
    this.trays = trays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of tray ids.")
  @JsonProperty("trays")
  public List<String> getTrays() {
    return trays;
  }
  
  public void setTrays(List<String> trays) {
    this.trays = trays;
  }

  
  /**
   * A list of drive ids.
   **/
  public IdentificationRequest drives(List<String> drives) {
    this.drives = drives;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of drive ids.")
  @JsonProperty("drives")
  public List<String> getDrives() {
    return drives;
  }
  
  public void setDrives(List<String> drives) {
    this.drives = drives;
  }

  
  /**
   * A list of storage pool ids. Associated, optimal drives will be identified.
   **/
  public IdentificationRequest pools(List<String> pools) {
    this.pools = pools;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of storage pool ids. Associated, optimal drives will be identified.")
  @JsonProperty("pools")
  public List<String> getPools() {
    return pools;
  }
  
  public void setPools(List<String> pools) {
    this.pools = pools;
  }

  
  /**
   * A list of volume ids. Associated, optimal drives will be identified.
   **/
  public IdentificationRequest volumes(List<String> volumes) {
    this.volumes = volumes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of volume ids. Associated, optimal drives will be identified.")
  @JsonProperty("volumes")
  public List<String> getVolumes() {
    return volumes;
  }
  
  public void setVolumes(List<String> volumes) {
    this.volumes = volumes;
  }

  
  /**
   * Set to \"true\" to identify the StorageSystem.
   **/
  public IdentificationRequest storageSystem(Boolean storageSystem) {
    this.storageSystem = storageSystem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set to \"true\" to identify the StorageSystem.")
  @JsonProperty("storageSystem")
  public Boolean getStorageSystem() {
    return storageSystem;
  }
  
  public void setStorageSystem(Boolean storageSystem) {
    this.storageSystem = storageSystem;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationRequest identificationRequest = (IdentificationRequest) o;
    return Objects.equals(this.channels, identificationRequest.channels) &&
        Objects.equals(this.trays, identificationRequest.trays) &&
        Objects.equals(this.drives, identificationRequest.drives) &&
        Objects.equals(this.pools, identificationRequest.pools) &&
        Objects.equals(this.volumes, identificationRequest.volumes) &&
        Objects.equals(this.storageSystem, identificationRequest.storageSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, trays, drives, pools, volumes, storageSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationRequest {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    trays: ").append(toIndentedString(trays)).append("\n");
    sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
    sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    storageSystem: ").append(toIndentedString(storageSystem)).append("\n");
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

