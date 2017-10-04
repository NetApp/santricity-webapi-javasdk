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
 * Structure used to pass update information for the storage system
 */
@ApiModel(description = "Structure used to pass update information for the storage system")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class StorageSystemUpdateRequest   {
  
    private String storedPassword;

    private List<KeyValue> metaTags;

    private Boolean removeAllTags;

    private Boolean enableTrace;

    private List<String> controllerAddresses;

  
  /**
   * The new password for the storage system stored.      Note, this only updates the password stored on the proxy.      To update the password on the storage system itself (as well as the stored password) the use the passwords URL
   **/
  public StorageSystemUpdateRequest storedPassword(String storedPassword) {
    this.storedPassword = storedPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new password for the storage system stored.      Note, this only updates the password stored on the proxy.      To update the password on the storage system itself (as well as the stored password) the use the passwords URL")
  @JsonProperty("storedPassword")
  public String getStoredPassword() {
    return storedPassword;
  }
  
  public void setStoredPassword(String storedPassword) {
    this.storedPassword = storedPassword;
  }

  
  /**
   * Optional meta tags to associate to this storage system.      This must be a complete list.  If the list is empty or null, no action is taken.      If you want to just remove all tags, just set the removeAllTags boolean to true/      The removeAllTags will be processed before this new list is processed
   **/
  public StorageSystemUpdateRequest metaTags(List<KeyValue> metaTags) {
    this.metaTags = metaTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional meta tags to associate to this storage system.      This must be a complete list.  If the list is empty or null, no action is taken.      If you want to just remove all tags, just set the removeAllTags boolean to true/      The removeAllTags will be processed before this new list is processed")
  @JsonProperty("metaTags")
  public List<KeyValue> getMetaTags() {
    return metaTags;
  }
  
  public void setMetaTags(List<KeyValue> metaTags) {
    this.metaTags = metaTags;
  }

  
  /**
   * See the description for metaTags
   **/
  public StorageSystemUpdateRequest removeAllTags(Boolean removeAllTags) {
    this.removeAllTags = removeAllTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "See the description for metaTags")
  @JsonProperty("removeAllTags")
  public Boolean getRemoveAllTags() {
    return removeAllTags;
  }
  
  public void setRemoveAllTags(Boolean removeAllTags) {
    this.removeAllTags = removeAllTags;
  }

  
  /**
   * Enable trace logging for SYMbol calls to the storage system.
   **/
  public StorageSystemUpdateRequest enableTrace(Boolean enableTrace) {
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
   * Replacement list of controller IP addresses or host names.
   **/
  public StorageSystemUpdateRequest controllerAddresses(List<String> controllerAddresses) {
    this.controllerAddresses = controllerAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Replacement list of controller IP addresses or host names.")
  @JsonProperty("controllerAddresses")
  public List<String> getControllerAddresses() {
    return controllerAddresses;
  }
  
  public void setControllerAddresses(List<String> controllerAddresses) {
    this.controllerAddresses = controllerAddresses;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageSystemUpdateRequest storageSystemUpdateRequest = (StorageSystemUpdateRequest) o;
    return Objects.equals(this.storedPassword, storageSystemUpdateRequest.storedPassword) &&
        Objects.equals(this.metaTags, storageSystemUpdateRequest.metaTags) &&
        Objects.equals(this.removeAllTags, storageSystemUpdateRequest.removeAllTags) &&
        Objects.equals(this.enableTrace, storageSystemUpdateRequest.enableTrace) &&
        Objects.equals(this.controllerAddresses, storageSystemUpdateRequest.controllerAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storedPassword, metaTags, removeAllTags, enableTrace, controllerAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageSystemUpdateRequest {\n");
    
    sb.append("    storedPassword: ").append(toIndentedString(storedPassword)).append("\n");
    sb.append("    metaTags: ").append(toIndentedString(metaTags)).append("\n");
    sb.append("    removeAllTags: ").append(toIndentedString(removeAllTags)).append("\n");
    sb.append("    enableTrace: ").append(toIndentedString(enableTrace)).append("\n");
    sb.append("    controllerAddresses: ").append(toIndentedString(controllerAddresses)).append("\n");
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

