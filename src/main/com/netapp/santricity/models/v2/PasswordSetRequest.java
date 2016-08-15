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
 * Passed in to set the passwords.  The security on this call is a little different.  If the admin password is &lt;n&gt;not&lt;/b&gt; set and adminPassword is true, than this call is allowed.  If the admin password is set, then the user must have a valid login session as admin
 */
@ApiModel(description = "Passed in to set the passwords.  The security on this call is a little different.  If the admin password is <n>not</b> set and adminPassword is true, than this call is allowed.  If the admin password is set, then the user must have a valid login session as admin")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class PasswordSetRequest   {
  
    private String currentAdminPassword;

    private Boolean adminPassword;

    private String newPassword;

  
  /**
   * The current admin password
   **/
  public PasswordSetRequest currentAdminPassword(String currentAdminPassword) {
    this.currentAdminPassword = currentAdminPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current admin password")
  @JsonProperty("currentAdminPassword")
  public String getCurrentAdminPassword() {
    return currentAdminPassword;
  }
  
  public void setCurrentAdminPassword(String currentAdminPassword) {
    this.currentAdminPassword = currentAdminPassword;
  }

  
  /**
   * If this is true, this call will set the admin password, if false, it sets the RO password
   **/
  public PasswordSetRequest adminPassword(Boolean adminPassword) {
    this.adminPassword = adminPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If this is true, this call will set the admin password, if false, it sets the RO password")
  @JsonProperty("adminPassword")
  public Boolean getAdminPassword() {
    return adminPassword;
  }
  
  public void setAdminPassword(Boolean adminPassword) {
    this.adminPassword = adminPassword;
  }

  
  /**
   * The new password
   **/
  public PasswordSetRequest newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new password")
  @JsonProperty("newPassword")
  public String getNewPassword() {
    return newPassword;
  }
  
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordSetRequest passwordSetRequest = (PasswordSetRequest) o;
    return Objects.equals(this.currentAdminPassword, passwordSetRequest.currentAdminPassword) &&
        Objects.equals(this.adminPassword, passwordSetRequest.adminPassword) &&
        Objects.equals(this.newPassword, passwordSetRequest.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAdminPassword, adminPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordSetRequest {\n");
    
    sb.append("    currentAdminPassword: ").append(toIndentedString(currentAdminPassword)).append("\n");
    sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

