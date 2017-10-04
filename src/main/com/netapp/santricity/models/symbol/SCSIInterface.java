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
 * SCSIInterface
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SCSIInterface   {
  
    private Integer channel;

    private Integer scsiID;

    private Integer speed;


  /**
   * The type of SCSI line driver (e.g. SE, LVD, etc.) being used.
   */
  public enum ScsiTypeEnum {
    se("se"),
    hvd("hvd"),
    lvd("lvd"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ScsiTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ScsiTypeEnum scsiType;

    private Integer width;

    private String part;

    private Integer revision;

    private String reserved1;

    private String reserved2;

  
  /**
   * The channel number of this interface.
   **/
  public SCSIInterface channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel number of this interface.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The SCSI ID value used by the controller on this interface.
   **/
  public SCSIInterface scsiID(Integer scsiID) {
    this.scsiID = scsiID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SCSI ID value used by the controller on this interface.")
  @JsonProperty("scsiID")
  public Integer getScsiID() {
    return scsiID;
  }
  
  public void setScsiID(Integer scsiID) {
    this.scsiID = scsiID;
  }

  
  /**
   * The speed of the interface in MB/sec.
   **/
  public SCSIInterface speed(Integer speed) {
    this.speed = speed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The speed of the interface in MB/sec.")
  @JsonProperty("speed")
  public Integer getSpeed() {
    return speed;
  }
  
  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  
  /**
   * The type of SCSI line driver (e.g. SE, LVD, etc.) being used.
   **/
  public SCSIInterface scsiType(ScsiTypeEnum scsiType) {
    this.scsiType = scsiType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of SCSI line driver (e.g. SE, LVD, etc.) being used.")
  @JsonProperty("scsiType")
  public ScsiTypeEnum getScsiType() {
    return scsiType;
  }
  
  public void setScsiType(ScsiTypeEnum scsiType) {
    this.scsiType = scsiType;
  }

  
  /**
   * The transfer width of the SCSI bus, in bits.
   **/
  public SCSIInterface width(Integer width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The transfer width of the SCSI bus, in bits.")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   * An ASCII text string that describes the SCSI controller chip type.
   **/
  public SCSIInterface part(String part) {
    this.part = part;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII text string that describes the SCSI controller chip type.")
  @JsonProperty("part")
  public String getPart() {
    return part;
  }
  
  public void setPart(String part) {
    this.part = part;
  }

  
  /**
   * The revision level of the SCSI controller chip.
   **/
  public SCSIInterface revision(Integer revision) {
    this.revision = revision;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The revision level of the SCSI controller chip.")
  @JsonProperty("revision")
  public Integer getRevision() {
    return revision;
  }
  
  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  
  /**
   **/
  public SCSIInterface reserved1(String reserved1) {
    this.reserved1 = reserved1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved1")
  public String getReserved1() {
    return reserved1;
  }
  
  public void setReserved1(String reserved1) {
    this.reserved1 = reserved1;
  }

  
  /**
   **/
  public SCSIInterface reserved2(String reserved2) {
    this.reserved2 = reserved2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved2")
  public String getReserved2() {
    return reserved2;
  }
  
  public void setReserved2(String reserved2) {
    this.reserved2 = reserved2;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCSIInterface sCSIInterface = (SCSIInterface) o;
    return Objects.equals(this.channel, sCSIInterface.channel) &&
        Objects.equals(this.scsiID, sCSIInterface.scsiID) &&
        Objects.equals(this.speed, sCSIInterface.speed) &&
        Objects.equals(this.scsiType, sCSIInterface.scsiType) &&
        Objects.equals(this.width, sCSIInterface.width) &&
        Objects.equals(this.part, sCSIInterface.part) &&
        Objects.equals(this.revision, sCSIInterface.revision) &&
        Objects.equals(this.reserved1, sCSIInterface.reserved1) &&
        Objects.equals(this.reserved2, sCSIInterface.reserved2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, scsiID, speed, scsiType, width, part, revision, reserved1, reserved2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCSIInterface {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    scsiID: ").append(toIndentedString(scsiID)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    scsiType: ").append(toIndentedString(scsiType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
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

