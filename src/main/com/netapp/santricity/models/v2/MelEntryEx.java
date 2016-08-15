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
 * MelEntryEx
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class MelEntryEx   {
  
    private Long sequenceNumber;

    private Integer eventType;

    private Long timeStamp;


  /**
   * The category into which this event falls. This value identifies the general type of activity or event that occurred and caused the entry to be generated.
   */
  public enum CategoryEnum {
    error("error"),
    failure("failure"),
    command("command"),
    notification("notification"),
    stateChange("stateChange"),
    hostEntry("hostEntry"),
    general("general"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CategoryEnum category;


  /**
   * The type of component that is associated with this entry.
   */
  public enum ComponentTypeEnum {
    unknown("unknown"),
    drive("drive"),
    powerSply("powerSply"),
    fan("fan"),
    minihub("minihub"),
    tempSensor("tempSensor"),
    channel("channel"),
    esm("esm"),
    controller("controller"),
    battery("battery"),
    enclosure("enclosure"),
    ups("ups"),
    chip("chip"),
    volume("volume"),
    volumeGrp("volumeGrp"),
    portCru("portCru"),
    interconnectCru("interconnectCru"),
    supportCru("supportCru"),
    alarm("alarm"),
    channelPort("channelPort"),
    sfpPort("sfpPort"),
    hostBoard("hostBoard"),
    newFormat("newFormat"),
    ctlrSfp("ctlrSfp"),
    ctlrSoc("ctlrSoc"),
    initiator("initiator"),
    target("target"),
    isnsServer("isnsServer"),
    hostIoCard("hostIoCard"),
    cacheBackupDevice("cacheBackupDevice"),
    cacheMemDimm("cacheMemDimm"),
    host("host"),
    hostPort("hostPort"),
    drawer("drawer"),
    relative("relative"),
    schedule("schedule"),
    asyncMirrorGroup("asyncMirrorGroup"),
    diskPool("diskPool"),
    pit("pit"),
    pitConsistencyGroup("pitConsistencyGroup"),
    cgpit("cgpit"),
    cgview("cgview"),
    flashCache("flashCache"),
    snmpCommunity("snmpCommunity"),
    snmpTrapDestination("snmpTrapDestination"),
    fcTarget("fcTarget"),
    fanOnlyCru("fanOnlyCru"),
    psuCru("psuCru"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ComponentTypeEnum componentType;

    private ComponentLocation componentLocation;

    private Boolean locationValid;


  /**
   * The priority code associated with this event.
   */
  public enum PriorityEnum {
    priorityDefault("priorityDefault"),
    priorityCritical("priorityCritical"),
    priorityInfo("priorityInfo"),
    priorityEmergency("priorityEmergency"),
    priorityAlert("priorityAlert"),
    priorityError("priorityError"),
    priorityWarning("priorityWarning"),
    priorityNotice("priorityNotice"),
    priorityDebug("priorityDebug"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PriorityEnum priority;

    private Integer eventSourceController;

    private Integer senseKey;

    private String rawData;

    private ExtendedComponentLocation extComponentLocation;

    private EventControl controlParams;

    private String description;

    private String location;

    private String id;

    private Boolean critical;

    private Integer asc;

    private Integer ascq;

  
  /**
   * The sequence number of the MEL entry. The controller maintains a unique, monotonically increasing 64-bit sequence number value and stamps each MEL entry with the next value of this counter.
   **/
  public MelEntryEx sequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sequence number of the MEL entry. The controller maintains a unique, monotonically increasing 64-bit sequence number value and stamps each MEL entry with the next value of this counter.")
  @JsonProperty("sequenceNumber")
  public Long getSequenceNumber() {
    return sequenceNumber;
  }
  
  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  
  /**
   * An integer value that indicates the specific type of event being reported.
   **/
  public MelEntryEx eventType(Integer eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An integer value that indicates the specific type of event being reported.")
  @JsonProperty("eventType")
  public Integer getEventType() {
    return eventType;
  }
  
  public void setEventType(Integer eventType) {
    this.eventType = eventType;
  }

  
  /**
   * The time at which the MEL entry was generated. This value is defined in terms of the number of seconds since midnight GMT on January 1, 1970.
   **/
  public MelEntryEx timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time at which the MEL entry was generated. This value is defined in terms of the number of seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("timeStamp")
  public Long getTimeStamp() {
    return timeStamp;
  }
  
  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }

  
  /**
   * The category into which this event falls. This value identifies the general type of activity or event that occurred and caused the entry to be generated.
   **/
  public MelEntryEx category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The category into which this event falls. This value identifies the general type of activity or event that occurred and caused the entry to be generated.")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  
  /**
   * The type of component that is associated with this entry.
   **/
  public MelEntryEx componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of component that is associated with this entry.")
  @JsonProperty("componentType")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }
  
  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  
  /**
   * The location, or other identifying value, of the component associated with this entry.
   **/
  public MelEntryEx componentLocation(ComponentLocation componentLocation) {
    this.componentLocation = componentLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The location, or other identifying value, of the component associated with this entry.")
  @JsonProperty("componentLocation")
  public ComponentLocation getComponentLocation() {
    return componentLocation;
  }
  
  public void setComponentLocation(ComponentLocation componentLocation) {
    this.componentLocation = componentLocation;
  }

  
  /**
   * A true/false indication of whether the ComponentLocation field is valid for this entry.
   **/
  public MelEntryEx locationValid(Boolean locationValid) {
    this.locationValid = locationValid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A true/false indication of whether the ComponentLocation field is valid for this entry.")
  @JsonProperty("locationValid")
  public Boolean getLocationValid() {
    return locationValid;
  }
  
  public void setLocationValid(Boolean locationValid) {
    this.locationValid = locationValid;
  }

  
  /**
   * The priority code associated with this event.
   **/
  public MelEntryEx priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The priority code associated with this event.")
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }
  
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  
  /**
   * The controller that is the source of the event (Controller 1 or 2).
   **/
  public MelEntryEx eventSourceController(Integer eventSourceController) {
    this.eventSourceController = eventSourceController;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The controller that is the source of the event (Controller 1 or 2).")
  @JsonProperty("eventSourceController")
  public Integer getEventSourceController() {
    return eventSourceController;
  }
  
  public void setEventSourceController(Integer eventSourceController) {
    this.eventSourceController = eventSourceController;
  }

  
  /**
   * The Sense Key value associated with this event, or zero if no key is applicable.
   **/
  public MelEntryEx senseKey(Integer senseKey) {
    this.senseKey = senseKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Sense Key value associated with this event, or zero if no key is applicable.")
  @JsonProperty("senseKey")
  public Integer getSenseKey() {
    return senseKey;
  }
  
  public void setSenseKey(Integer senseKey) {
    this.senseKey = senseKey;
  }

  
  /**
   * The raw data stored for this event. This information may be useful for debugging or troubleshooting problems with the assistance of a field support or development representative.
   **/
  public MelEntryEx rawData(String rawData) {
    this.rawData = rawData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The raw data stored for this event. This information may be useful for debugging or troubleshooting problems with the assistance of a field support or development representative.")
  @JsonProperty("rawData")
  public String getRawData() {
    return rawData;
  }
  
  public void setRawData(String rawData) {
    this.rawData = rawData;
  }

  
  /**
   * Extended component location information for this entry. This data type of this field is a union with discriminator extLocType. If the discriminator is set to something other than EXT_COMP_LOCTYPE_UNKNOWN, then the location information in this field overrides what is in the componentLocation field.
   **/
  public MelEntryEx extComponentLocation(ExtendedComponentLocation extComponentLocation) {
    this.extComponentLocation = extComponentLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Extended component location information for this entry. This data type of this field is a union with discriminator extLocType. If the discriminator is set to something other than EXT_COMP_LOCTYPE_UNKNOWN, then the location information in this field overrides what is in the componentLocation field.")
  @JsonProperty("extComponentLocation")
  public ExtendedComponentLocation getExtComponentLocation() {
    return extComponentLocation;
  }
  
  public void setExtComponentLocation(ExtendedComponentLocation extComponentLocation) {
    this.extComponentLocation = extComponentLocation;
  }

  
  /**
   * This field allows customized control over the handling of MEL events.
   **/
  public MelEntryEx controlParams(EventControl controlParams) {
    this.controlParams = controlParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field allows customized control over the handling of MEL events.")
  @JsonProperty("controlParams")
  public EventControl getControlParams() {
    return controlParams;
  }
  
  public void setControlParams(EventControl controlParams) {
    this.controlParams = controlParams;
  }

  
  /**
   **/
  public MelEntryEx description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public MelEntryEx location(String location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   **/
  public MelEntryEx id(String id) {
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

  
  /**
   **/
  public MelEntryEx critical(Boolean critical) {
    this.critical = critical;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("critical")
  public Boolean getCritical() {
    return critical;
  }
  
  public void setCritical(Boolean critical) {
    this.critical = critical;
  }

  
  /**
   **/
  public MelEntryEx asc(Integer asc) {
    this.asc = asc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("asc")
  public Integer getAsc() {
    return asc;
  }
  
  public void setAsc(Integer asc) {
    this.asc = asc;
  }

  
  /**
   **/
  public MelEntryEx ascq(Integer ascq) {
    this.ascq = ascq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ascq")
  public Integer getAscq() {
    return ascq;
  }
  
  public void setAscq(Integer ascq) {
    this.ascq = ascq;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MelEntryEx melEntryEx = (MelEntryEx) o;
    return Objects.equals(this.sequenceNumber, melEntryEx.sequenceNumber) &&
        Objects.equals(this.eventType, melEntryEx.eventType) &&
        Objects.equals(this.timeStamp, melEntryEx.timeStamp) &&
        Objects.equals(this.category, melEntryEx.category) &&
        Objects.equals(this.componentType, melEntryEx.componentType) &&
        Objects.equals(this.componentLocation, melEntryEx.componentLocation) &&
        Objects.equals(this.locationValid, melEntryEx.locationValid) &&
        Objects.equals(this.priority, melEntryEx.priority) &&
        Objects.equals(this.eventSourceController, melEntryEx.eventSourceController) &&
        Objects.equals(this.senseKey, melEntryEx.senseKey) &&
        Objects.equals(this.rawData, melEntryEx.rawData) &&
        Objects.equals(this.extComponentLocation, melEntryEx.extComponentLocation) &&
        Objects.equals(this.controlParams, melEntryEx.controlParams) &&
        Objects.equals(this.description, melEntryEx.description) &&
        Objects.equals(this.location, melEntryEx.location) &&
        Objects.equals(this.id, melEntryEx.id) &&
        Objects.equals(this.critical, melEntryEx.critical) &&
        Objects.equals(this.asc, melEntryEx.asc) &&
        Objects.equals(this.ascq, melEntryEx.ascq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceNumber, eventType, timeStamp, category, componentType, componentLocation, locationValid, priority, eventSourceController, senseKey, rawData, extComponentLocation, controlParams, description, location, id, critical, asc, ascq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MelEntryEx {\n");
    
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    componentLocation: ").append(toIndentedString(componentLocation)).append("\n");
    sb.append("    locationValid: ").append(toIndentedString(locationValid)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    eventSourceController: ").append(toIndentedString(eventSourceController)).append("\n");
    sb.append("    senseKey: ").append(toIndentedString(senseKey)).append("\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    extComponentLocation: ").append(toIndentedString(extComponentLocation)).append("\n");
    sb.append("    controlParams: ").append(toIndentedString(controlParams)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
    sb.append("    ascq: ").append(toIndentedString(ascq)).append("\n");
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

