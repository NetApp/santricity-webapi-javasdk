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
 * SATAInterface
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SATAInterface   {
  
    private Integer channel;


  /**
   * The current interface speed of the SATA interface.
   */
  public enum CurrentInterfaceSpeedEnum {
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
    speed25gig("speed25gig"),
    speed32gig("speed32gig"),
    speed100gig("speed100gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CurrentInterfaceSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentInterfaceSpeedEnum currentInterfaceSpeed;


  /**
   * The maximum interface speed of the SATA interface.
   */
  public enum MaximumInterfaceSpeedEnum {
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
    speed25gig("speed25gig"),
    speed32gig("speed32gig"),
    speed100gig("speed100gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MaximumInterfaceSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MaximumInterfaceSpeedEnum maximumInterfaceSpeed;


  /**
   * An indicator of how the device speed is controlled.
   */
  public enum SpeedControlEnum {
    unknown("unknown"),
    fixed("fixed"),
    switched("switched"),
    auto("auto"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SpeedControlEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SpeedControlEnum speedControl;

    private String part;

    private Integer revision;

    private String interfaceRef;

    private Location physicalLocation;

    private Boolean protectionInformationCapable;

    private String id;

  
  /**
   * The channel number of this channel
   **/
  public SATAInterface channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel number of this channel")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The current interface speed of the SATA interface.
   **/
  public SATAInterface currentInterfaceSpeed(CurrentInterfaceSpeedEnum currentInterfaceSpeed) {
    this.currentInterfaceSpeed = currentInterfaceSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current interface speed of the SATA interface.")
  @JsonProperty("currentInterfaceSpeed")
  public CurrentInterfaceSpeedEnum getCurrentInterfaceSpeed() {
    return currentInterfaceSpeed;
  }
  
  public void setCurrentInterfaceSpeed(CurrentInterfaceSpeedEnum currentInterfaceSpeed) {
    this.currentInterfaceSpeed = currentInterfaceSpeed;
  }

  
  /**
   * The maximum interface speed of the SATA interface.
   **/
  public SATAInterface maximumInterfaceSpeed(MaximumInterfaceSpeedEnum maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum interface speed of the SATA interface.")
  @JsonProperty("maximumInterfaceSpeed")
  public MaximumInterfaceSpeedEnum getMaximumInterfaceSpeed() {
    return maximumInterfaceSpeed;
  }
  
  public void setMaximumInterfaceSpeed(MaximumInterfaceSpeedEnum maximumInterfaceSpeed) {
    this.maximumInterfaceSpeed = maximumInterfaceSpeed;
  }

  
  /**
   * An indicator of how the device speed is controlled.
   **/
  public SATAInterface speedControl(SpeedControlEnum speedControl) {
    this.speedControl = speedControl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indicator of how the device speed is controlled.")
  @JsonProperty("speedControl")
  public SpeedControlEnum getSpeedControl() {
    return speedControl;
  }
  
  public void setSpeedControl(SpeedControlEnum speedControl) {
    this.speedControl = speedControl;
  }

  
  /**
   * A string indicating the chip type.
   **/
  public SATAInterface part(String part) {
    this.part = part;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A string indicating the chip type.")
  @JsonProperty("part")
  public String getPart() {
    return part;
  }
  
  public void setPart(String part) {
    this.part = part;
  }

  
  /**
   * The revision level of the SATA part.
   **/
  public SATAInterface revision(Integer revision) {
    this.revision = revision;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The revision level of the SATA part.")
  @JsonProperty("revision")
  public Integer getRevision() {
    return revision;
  }
  
  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  
  /**
   * The unique identifier for a given instance of this structure.
   **/
  public SATAInterface interfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier for a given instance of this structure.")
  @JsonProperty("interfaceRef")
  public String getInterfaceRef() {
    return interfaceRef;
  }
  
  public void setInterfaceRef(String interfaceRef) {
    this.interfaceRef = interfaceRef;
  }

  
  /**
   * The physical location of the SATA interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st SATA interface relative to the parent,\" \"2nd SATA interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.
   **/
  public SATAInterface physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the SATA interface. The parent reference in Location identifies the physical component (e.g., controller or host card) where the interface circuitry is located, and the position field is a firmware-assigned 1-relative number signifying \"1st SATA interface relative to the parent,\" \"2nd SATA interface relative to the parent,\" etc. This \"interface number\" is independent of the interface's channel association.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * This field indicates whether or not the I/O interface is PI capable.
   **/
  public SATAInterface protectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field indicates whether or not the I/O interface is PI capable.")
  @JsonProperty("protectionInformationCapable")
  public Boolean getProtectionInformationCapable() {
    return protectionInformationCapable;
  }
  
  public void setProtectionInformationCapable(Boolean protectionInformationCapable) {
    this.protectionInformationCapable = protectionInformationCapable;
  }

  
  /**
   **/
  public SATAInterface id(String id) {
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
    SATAInterface sATAInterface = (SATAInterface) o;
    return Objects.equals(this.channel, sATAInterface.channel) &&
        Objects.equals(this.currentInterfaceSpeed, sATAInterface.currentInterfaceSpeed) &&
        Objects.equals(this.maximumInterfaceSpeed, sATAInterface.maximumInterfaceSpeed) &&
        Objects.equals(this.speedControl, sATAInterface.speedControl) &&
        Objects.equals(this.part, sATAInterface.part) &&
        Objects.equals(this.revision, sATAInterface.revision) &&
        Objects.equals(this.interfaceRef, sATAInterface.interfaceRef) &&
        Objects.equals(this.physicalLocation, sATAInterface.physicalLocation) &&
        Objects.equals(this.protectionInformationCapable, sATAInterface.protectionInformationCapable) &&
        Objects.equals(this.id, sATAInterface.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, currentInterfaceSpeed, maximumInterfaceSpeed, speedControl, part, revision, interfaceRef, physicalLocation, protectionInformationCapable, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SATAInterface {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    currentInterfaceSpeed: ").append(toIndentedString(currentInterfaceSpeed)).append("\n");
    sb.append("    maximumInterfaceSpeed: ").append(toIndentedString(maximumInterfaceSpeed)).append("\n");
    sb.append("    speedControl: ").append(toIndentedString(speedControl)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    interfaceRef: ").append(toIndentedString(interfaceRef)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    protectionInformationCapable: ").append(toIndentedString(protectionInformationCapable)).append("\n");
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

