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
 * Holds the result of the configuration actiopn for a single storage system
 */
@ApiModel(description = "Holds the result of the configuration actiopn for a single storage system")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class ConfigurationResultItem   {
  
    private String systemKey;

    private Boolean success;

    private CallResponse response;

  
  /**
   * The key from the csv file  for the storage system
   **/
  public ConfigurationResultItem systemKey(String systemKey) {
    this.systemKey = systemKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The key from the csv file  for the storage system")
  @JsonProperty("systemKey")
  public String getSystemKey() {
    return systemKey;
  }
  
  public void setSystemKey(String systemKey) {
    this.systemKey = systemKey;
  }

  
  /**
   * True if the configuration did not have any reported errors
   **/
  public ConfigurationResultItem success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the configuration did not have any reported errors")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   * If the operation did not succeed, this properties has the error information
   **/
  public ConfigurationResultItem response(CallResponse response) {
    this.response = response;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the operation did not succeed, this properties has the error information")
  @JsonProperty("response")
  public CallResponse getResponse() {
    return response;
  }
  
  public void setResponse(CallResponse response) {
    this.response = response;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationResultItem configurationResultItem = (ConfigurationResultItem) o;
    return Objects.equals(this.systemKey, configurationResultItem.systemKey) &&
        Objects.equals(this.success, configurationResultItem.success) &&
        Objects.equals(this.response, configurationResultItem.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemKey, success, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationResultItem {\n");
    
    sb.append("    systemKey: ").append(toIndentedString(systemKey)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

