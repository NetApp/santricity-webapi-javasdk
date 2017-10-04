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
 * ObjectChangeEvent
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ObjectChangeEvent extends Event  {
  
    private Date timestamp;

    private Long eventNumber;

    private List<EventObjectIdentifier> addedObjects;

    private List<EventObjectIdentifier> modifiedObjects;

    private List<EventObjectIdentifier> deletedObjects;

  
  /**
   **/
  public ObjectChangeEvent timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("timestamp")
  public Date getObjectChangeEventtimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  public ObjectChangeEvent eventNumber(Long eventNumber) {
    this.eventNumber = eventNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("eventNumber")
  public Long getObjectChangeEventeventNumber() {
    return eventNumber;
  }
  
  public void setEventNumber(Long eventNumber) {
    this.eventNumber = eventNumber;
  }

  
  /**
   * List of objects added.  Only certain objects that have rest endpoints will be represented in this list.      See Event ObjectTypes for types of objects that have events
   **/
  public ObjectChangeEvent addedObjects(List<EventObjectIdentifier> addedObjects) {
    this.addedObjects = addedObjects;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of objects added.  Only certain objects that have rest endpoints will be represented in this list.      See Event ObjectTypes for types of objects that have events")
  @JsonProperty("addedObjects")
  public List<EventObjectIdentifier> getObjectChangeEventaddedObjects() {
    return addedObjects;
  }
  
  public void setAddedObjects(List<EventObjectIdentifier> addedObjects) {
    this.addedObjects = addedObjects;
  }

  
  /**
   * List of objects updated.  Only certain objects that have rest endpoints will be represented in this list.      See Event ObjectTypes for types of objects that have events
   **/
  public ObjectChangeEvent modifiedObjects(List<EventObjectIdentifier> modifiedObjects) {
    this.modifiedObjects = modifiedObjects;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of objects updated.  Only certain objects that have rest endpoints will be represented in this list.      See Event ObjectTypes for types of objects that have events")
  @JsonProperty("modifiedObjects")
  public List<EventObjectIdentifier> getObjectChangeEventmodifiedObjects() {
    return modifiedObjects;
  }
  
  public void setModifiedObjects(List<EventObjectIdentifier> modifiedObjects) {
    this.modifiedObjects = modifiedObjects;
  }

  
  /**
   * List of objects deleted.  Only certain objects that have rest endpoints will be represented in this list.      See Event ObjectTypes for types of objects that have events
   **/
  public ObjectChangeEvent deletedObjects(List<EventObjectIdentifier> deletedObjects) {
    this.deletedObjects = deletedObjects;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of objects deleted.  Only certain objects that have rest endpoints will be represented in this list.      See Event ObjectTypes for types of objects that have events")
  @JsonProperty("deletedObjects")
  public List<EventObjectIdentifier> getObjectChangeEventdeletedObjects() {
    return deletedObjects;
  }
  
  public void setDeletedObjects(List<EventObjectIdentifier> deletedObjects) {
    this.deletedObjects = deletedObjects;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectChangeEvent objectChangeEvent = (ObjectChangeEvent) o;
    return Objects.equals(this.timestamp, objectChangeEvent.timestamp) &&
        Objects.equals(this.eventNumber, objectChangeEvent.eventNumber) &&
        Objects.equals(this.addedObjects, objectChangeEvent.addedObjects) &&
        Objects.equals(this.modifiedObjects, objectChangeEvent.modifiedObjects) &&
        Objects.equals(this.deletedObjects, objectChangeEvent.deletedObjects) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, eventNumber, addedObjects, modifiedObjects, deletedObjects, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectChangeEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    eventNumber: ").append(toIndentedString(eventNumber)).append("\n");
    sb.append("    addedObjects: ").append(toIndentedString(addedObjects)).append("\n");
    sb.append("    modifiedObjects: ").append(toIndentedString(modifiedObjects)).append("\n");
    sb.append("    deletedObjects: ").append(toIndentedString(deletedObjects)).append("\n");
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

