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
 * Creates a Storage Pool.
 */
@ApiModel(description = "Creates a Storage Pool.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class StoragePoolCreateRequest   {
  

  /**
   * The RAID configuration for the new storage pool.
   */
  public enum RaidLevelEnum {
    raidUnsupported("raidUnsupported"),
    raidAll("raidAll"),
    raid0("raid0"),
    raid1("raid1"),
    raid3("raid3"),
    raid5("raid5"),
    raid6("raid6"),
    raidDiskPool("raidDiskPool"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RaidLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RaidLevelEnum raidLevel;

    private List<String> diskDriveIds;

    private Boolean eraseSecuredDrives;

    private String name;

  
  /**
   * The RAID configuration for the new storage pool.
   **/
  public StoragePoolCreateRequest raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The RAID configuration for the new storage pool.")
  @JsonProperty("raidLevel")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }
  
  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  
  /**
   * The identifiers of the disk drives to use for creating the storage pool.
   **/
  public StoragePoolCreateRequest diskDriveIds(List<String> diskDriveIds) {
    this.diskDriveIds = diskDriveIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifiers of the disk drives to use for creating the storage pool.")
  @JsonProperty("diskDriveIds")
  public List<String> getDiskDriveIds() {
    return diskDriveIds;
  }
  
  public void setDiskDriveIds(List<String> diskDriveIds) {
    this.diskDriveIds = diskDriveIds;
  }

  
  /**
   * Security-enabled drives that were previously part of a secured storage pool must be erased before they can be re-used. Enable to automatically erase such drives.
   **/
  public StoragePoolCreateRequest eraseSecuredDrives(Boolean eraseSecuredDrives) {
    this.eraseSecuredDrives = eraseSecuredDrives;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Security-enabled drives that were previously part of a secured storage pool must be erased before they can be re-used. Enable to automatically erase such drives.")
  @JsonProperty("eraseSecuredDrives")
  public Boolean getEraseSecuredDrives() {
    return eraseSecuredDrives;
  }
  
  public void setEraseSecuredDrives(Boolean eraseSecuredDrives) {
    this.eraseSecuredDrives = eraseSecuredDrives;
  }

  
  /**
   * The user-label to assign to the new storage pool.
   **/
  public StoragePoolCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-label to assign to the new storage pool.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragePoolCreateRequest storagePoolCreateRequest = (StoragePoolCreateRequest) o;
    return Objects.equals(this.raidLevel, storagePoolCreateRequest.raidLevel) &&
        Objects.equals(this.diskDriveIds, storagePoolCreateRequest.diskDriveIds) &&
        Objects.equals(this.eraseSecuredDrives, storagePoolCreateRequest.eraseSecuredDrives) &&
        Objects.equals(this.name, storagePoolCreateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raidLevel, diskDriveIds, eraseSecuredDrives, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragePoolCreateRequest {\n");
    
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    diskDriveIds: ").append(toIndentedString(diskDriveIds)).append("\n");
    sb.append("    eraseSecuredDrives: ").append(toIndentedString(eraseSecuredDrives)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

