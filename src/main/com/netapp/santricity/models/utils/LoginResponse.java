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


package com.netapp.santricity.models.utils;

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
 * Response to a successful login
 */
@ApiModel(description = "Response to a successful login")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:52.213-05:00")
public class LoginResponse   {
  
    private String userId;

    private List<String> roles;

    private Long lastKnownEvent;

    private Long globalInventoryChangeCount;

  
  /**
   * The user Id
   **/
  public LoginResponse userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user Id")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Roles assigned to the user
   **/
  public LoginResponse roles(List<String> roles) {
    this.roles = roles;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Roles assigned to the user")
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }
  
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  
  /**
   **/
  public LoginResponse lastKnownEvent(Long lastKnownEvent) {
    this.lastKnownEvent = lastKnownEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lastKnownEvent")
  public Long getLastKnownEvent() {
    return lastKnownEvent;
  }
  
  public void setLastKnownEvent(Long lastKnownEvent) {
    this.lastKnownEvent = lastKnownEvent;
  }

  
  /**
   **/
  public LoginResponse globalInventoryChangeCount(Long globalInventoryChangeCount) {
    this.globalInventoryChangeCount = globalInventoryChangeCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("globalInventoryChangeCount")
  public Long getGlobalInventoryChangeCount() {
    return globalInventoryChangeCount;
  }
  
  public void setGlobalInventoryChangeCount(Long globalInventoryChangeCount) {
    this.globalInventoryChangeCount = globalInventoryChangeCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResponse loginResponse = (LoginResponse) o;
    return Objects.equals(this.userId, loginResponse.userId) &&
        Objects.equals(this.roles, loginResponse.roles) &&
        Objects.equals(this.lastKnownEvent, loginResponse.lastKnownEvent) &&
        Objects.equals(this.globalInventoryChangeCount, loginResponse.globalInventoryChangeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, roles, lastKnownEvent, globalInventoryChangeCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    lastKnownEvent: ").append(toIndentedString(lastKnownEvent)).append("\n");
    sb.append("    globalInventoryChangeCount: ").append(toIndentedString(globalInventoryChangeCount)).append("\n");
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

