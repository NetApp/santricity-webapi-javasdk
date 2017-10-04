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
 * Used to create a storage system.
 */
@ApiModel(description = "Used to create a storage system.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class StorageSystemCreateRequest   {
  
    private String id;

    private List<String> controllerAddresses;

    private Boolean validate;

    private String password;

    private String wwn;

    private Boolean enableTrace;

    private List<KeyValue> metaTags;

  
  /**
   * ID to assign to the storage system.  This must be left null or be unique.  If null, a unique ID will be assigned
   **/
  public StorageSystemCreateRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID to assign to the storage system.  This must be left null or be unique.  If null, a unique ID will be assigned")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * A list of controller IP addresses or host names.
   **/
  public StorageSystemCreateRequest controllerAddresses(List<String> controllerAddresses) {
    this.controllerAddresses = controllerAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of controller IP addresses or host names.")
  @JsonProperty("controllerAddresses")
  public List<String> getControllerAddresses() {
    return controllerAddresses;
  }
  
  public void setControllerAddresses(List<String> controllerAddresses) {
    this.controllerAddresses = controllerAddresses;
  }

  
  /**
   * Enables validation of the added storage array. Returns errors if there are wwn mismatches or if the storage array cannot be contacted.
   **/
  public StorageSystemCreateRequest validate(Boolean validate) {
    this.validate = validate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Enables validation of the added storage array. Returns errors if there are wwn mismatches or if the storage array cannot be contacted.")
  @JsonProperty("validate")
  public Boolean getValidate() {
    return validate;
  }
  
  public void setValidate(Boolean validate) {
    this.validate = validate;
  }

  
  /**
   * The SYMbol password for the storage system.
   **/
  public StorageSystemCreateRequest password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The SYMbol password for the storage system.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * The world wide name for the storage system.  This is only needed for   in-band management with an in-band agent that is managing more than a single storage system.
   **/
  public StorageSystemCreateRequest wwn(String wwn) {
    this.wwn = wwn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The world wide name for the storage system.  This is only needed for   in-band management with an in-band agent that is managing more than a single storage system.")
  @JsonProperty("wwn")
  public String getWwn() {
    return wwn;
  }
  
  public void setWwn(String wwn) {
    this.wwn = wwn;
  }

  
  /**
   * Enable trace logging for SYMbol calls to the storage system.
   **/
  public StorageSystemCreateRequest enableTrace(Boolean enableTrace) {
    this.enableTrace = enableTrace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Enable trace logging for SYMbol calls to the storage system.")
  @JsonProperty("enableTrace")
  public Boolean getEnableTrace() {
    return enableTrace;
  }
  
  public void setEnableTrace(Boolean enableTrace) {
    this.enableTrace = enableTrace;
  }

  
  /**
   * Optional meta tags to associate to this storage system
   **/
  public StorageSystemCreateRequest metaTags(List<KeyValue> metaTags) {
    this.metaTags = metaTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional meta tags to associate to this storage system")
  @JsonProperty("metaTags")
  public List<KeyValue> getMetaTags() {
    return metaTags;
  }
  
  public void setMetaTags(List<KeyValue> metaTags) {
    this.metaTags = metaTags;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageSystemCreateRequest storageSystemCreateRequest = (StorageSystemCreateRequest) o;
    return Objects.equals(this.id, storageSystemCreateRequest.id) &&
        Objects.equals(this.controllerAddresses, storageSystemCreateRequest.controllerAddresses) &&
        Objects.equals(this.validate, storageSystemCreateRequest.validate) &&
        Objects.equals(this.password, storageSystemCreateRequest.password) &&
        Objects.equals(this.wwn, storageSystemCreateRequest.wwn) &&
        Objects.equals(this.enableTrace, storageSystemCreateRequest.enableTrace) &&
        Objects.equals(this.metaTags, storageSystemCreateRequest.metaTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, controllerAddresses, validate, password, wwn, enableTrace, metaTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageSystemCreateRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    controllerAddresses: ").append(toIndentedString(controllerAddresses)).append("\n");
    sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
    sb.append("    enableTrace: ").append(toIndentedString(enableTrace)).append("\n");
    sb.append("    metaTags: ").append(toIndentedString(metaTags)).append("\n");
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

