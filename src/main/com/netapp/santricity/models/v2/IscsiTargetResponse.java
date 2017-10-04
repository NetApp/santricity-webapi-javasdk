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
 * Provides information for the iSCSI target.
 */
@ApiModel(description = "Provides information for the iSCSI target.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class IscsiTargetResponse   {
  

  /**
   * Authentication type (None or CHAP)
   */
  public enum AuthMethodEnum {
    none("none"),
    chap("chap"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    AuthMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private AuthMethodEnum authMethod;

    private String chapSecret;

    private String iqn;

    private String alias;

  
  /**
   * Authentication type (None or CHAP)
   **/
  public IscsiTargetResponse authMethod(AuthMethodEnum authMethod) {
    this.authMethod = authMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Authentication type (None or CHAP)")
  @JsonProperty("authMethod")
  public AuthMethodEnum getAuthMethod() {
    return authMethod;
  }
  
  public void setAuthMethod(AuthMethodEnum authMethod) {
    this.authMethod = authMethod;
  }

  
  /**
   * CHAP secret/password.
   **/
  public IscsiTargetResponse chapSecret(String chapSecret) {
    this.chapSecret = chapSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CHAP secret/password.")
  @JsonProperty("chapSecret")
  public String getChapSecret() {
    return chapSecret;
  }
  
  public void setChapSecret(String chapSecret) {
    this.chapSecret = chapSecret;
  }

  
  /**
   * iSCSI Qualified Name (iqn)
   **/
  public IscsiTargetResponse iqn(String iqn) {
    this.iqn = iqn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "iSCSI Qualified Name (iqn)")
  @JsonProperty("iqn")
  public String getIqn() {
    return iqn;
  }
  
  public void setIqn(String iqn) {
    this.iqn = iqn;
  }

  
  /**
   * The iSCSI target alias.
   **/
  public IscsiTargetResponse alias(String alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The iSCSI target alias.")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  
  public void setAlias(String alias) {
    this.alias = alias;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiTargetResponse iscsiTargetResponse = (IscsiTargetResponse) o;
    return Objects.equals(this.authMethod, iscsiTargetResponse.authMethod) &&
        Objects.equals(this.chapSecret, iscsiTargetResponse.chapSecret) &&
        Objects.equals(this.iqn, iscsiTargetResponse.iqn) &&
        Objects.equals(this.alias, iscsiTargetResponse.alias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethod, chapSecret, iqn, alias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiTargetResponse {\n");
    
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    chapSecret: ").append(toIndentedString(chapSecret)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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

