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
 * Minihub
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class Minihub   {
  
    private String minihubRef;


  /**
   * The operational status of the minihub.
   */
  public enum StatusEnum {
    optimal("optimal"),
    failed("failed"),
    unsupported("unsupported"),
    unknown("unknown"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;

    private Location physicalLocation;

    private MinihubTypeData minihubData;


  /**
   * The current speed of the minihub.
   */
  public enum CurrentSpeedEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CurrentSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentSpeedEnum currentSpeed;


  /**
   * The maximum speed of the minihub.
   */
  public enum MaxSpeedEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MaxSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MaxSpeedEnum maxSpeed;

    private Integer channel;

    private PortList portList;

    private String vendorName;

    private String partNumber;

    private String serialNumber;

    private String fruType;

    private Long manufacturerDate;

    private String reserved1;

    private String reserved2;

    private RTRAttributes rtrAttributes;

  
  /**
   * The reference for this physical minihub.
   **/
  public Minihub minihubRef(String minihubRef) {
    this.minihubRef = minihubRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference for this physical minihub.")
  @JsonProperty("minihubRef")
  public String getMinihubRef() {
    return minihubRef;
  }
  
  public void setMinihubRef(String minihubRef) {
    this.minihubRef = minihubRef;
  }

  
  /**
   * The operational status of the minihub.
   **/
  public Minihub status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operational status of the minihub.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The physical location of the minihub. Note that the tray reference identifies the enclosure containing the minihub, but the slot information does not apply to this component.
   **/
  public Minihub physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the minihub. Note that the tray reference identifies the enclosure containing the minihub, but the slot information does not apply to this component.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * Information returned is based on the minihub type.
   **/
  public Minihub minihubData(MinihubTypeData minihubData) {
    this.minihubData = minihubData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information returned is based on the minihub type.")
  @JsonProperty("minihubData")
  public MinihubTypeData getMinihubData() {
    return minihubData;
  }
  
  public void setMinihubData(MinihubTypeData minihubData) {
    this.minihubData = minihubData;
  }

  
  /**
   * The current speed of the minihub.
   **/
  public Minihub currentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current speed of the minihub.")
  @JsonProperty("currentSpeed")
  public CurrentSpeedEnum getCurrentSpeed() {
    return currentSpeed;
  }
  
  public void setCurrentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  
  /**
   * The maximum speed of the minihub.
   **/
  public Minihub maxSpeed(MaxSpeedEnum maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum speed of the minihub.")
  @JsonProperty("maxSpeed")
  public MaxSpeedEnum getMaxSpeed() {
    return maxSpeed;
  }
  
  public void setMaxSpeed(MaxSpeedEnum maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  
  /**
   * The channel number that this minihub is associated with.
   **/
  public Minihub channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel number that this minihub is associated with.")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * Detailed information for each port of the minihub. This field is deprecated.
   **/
  public Minihub portList(PortList portList) {
    this.portList = portList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Detailed information for each port of the minihub. This field is deprecated.")
  @JsonProperty("portList")
  public PortList getPortList() {
    return portList;
  }
  
  public void setPortList(PortList portList) {
    this.portList = portList;
  }

  
  /**
   * The vendor name of the minihub.
   **/
  public Minihub vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The vendor name of the minihub.")
  @JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  
  /**
   * The part number of the minihub.
   **/
  public Minihub partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The part number of the minihub.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * The serial number of the minihub.
   **/
  public Minihub serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The serial number of the minihub.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * The field replaceable unit type of the minihub.
   **/
  public Minihub fruType(String fruType) {
    this.fruType = fruType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The field replaceable unit type of the minihub.")
  @JsonProperty("fruType")
  public String getFruType() {
    return fruType;
  }
  
  public void setFruType(String fruType) {
    this.fruType = fruType;
  }

  
  /**
   * The date the minihub was manufactured.
   **/
  public Minihub manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the minihub was manufactured.")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   **/
  public Minihub reserved1(String reserved1) {
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
  public Minihub reserved2(String reserved2) {
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

  
  /**
   * The CRU type of the minihub plus its ready-to-remove attributes, which are based on the CRU type
   **/
  public Minihub rtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The CRU type of the minihub plus its ready-to-remove attributes, which are based on the CRU type")
  @JsonProperty("rtrAttributes")
  public RTRAttributes getRtrAttributes() {
    return rtrAttributes;
  }
  
  public void setRtrAttributes(RTRAttributes rtrAttributes) {
    this.rtrAttributes = rtrAttributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Minihub minihub = (Minihub) o;
    return Objects.equals(this.minihubRef, minihub.minihubRef) &&
        Objects.equals(this.status, minihub.status) &&
        Objects.equals(this.physicalLocation, minihub.physicalLocation) &&
        Objects.equals(this.minihubData, minihub.minihubData) &&
        Objects.equals(this.currentSpeed, minihub.currentSpeed) &&
        Objects.equals(this.maxSpeed, minihub.maxSpeed) &&
        Objects.equals(this.channel, minihub.channel) &&
        Objects.equals(this.portList, minihub.portList) &&
        Objects.equals(this.vendorName, minihub.vendorName) &&
        Objects.equals(this.partNumber, minihub.partNumber) &&
        Objects.equals(this.serialNumber, minihub.serialNumber) &&
        Objects.equals(this.fruType, minihub.fruType) &&
        Objects.equals(this.manufacturerDate, minihub.manufacturerDate) &&
        Objects.equals(this.reserved1, minihub.reserved1) &&
        Objects.equals(this.reserved2, minihub.reserved2) &&
        Objects.equals(this.rtrAttributes, minihub.rtrAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minihubRef, status, physicalLocation, minihubData, currentSpeed, maxSpeed, channel, portList, vendorName, partNumber, serialNumber, fruType, manufacturerDate, reserved1, reserved2, rtrAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Minihub {\n");
    
    sb.append("    minihubRef: ").append(toIndentedString(minihubRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    minihubData: ").append(toIndentedString(minihubData)).append("\n");
    sb.append("    currentSpeed: ").append(toIndentedString(currentSpeed)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    portList: ").append(toIndentedString(portList)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    fruType: ").append(toIndentedString(fruType)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    rtrAttributes: ").append(toIndentedString(rtrAttributes)).append("\n");
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

