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
 * AuthMethodTypeData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AuthMethodTypeData   {
  

  /**
   * This enumeration type identifies the available iSCSIauthentication methods. The supportedAuthMethods array in the FeatureParams structure will contain values from this enumeration identifying which iSCSI authentication methods are supported on the storage array.
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

    private List<EncryptedPassword> chapSecret;

  
  /**
   * This enumeration type identifies the available iSCSIauthentication methods. The supportedAuthMethods array in the FeatureParams structure will contain values from this enumeration identifying which iSCSI authentication methods are supported on the storage array.
   **/
  public AuthMethodTypeData authMethod(AuthMethodEnum authMethod) {
    this.authMethod = authMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration type identifies the available iSCSIauthentication methods. The supportedAuthMethods array in the FeatureParams structure will contain values from this enumeration identifying which iSCSI authentication methods are supported on the storage array.")
  @JsonProperty("authMethod")
  public AuthMethodEnum getAuthMethod() {
    return authMethod;
  }
  
  public void setAuthMethod(AuthMethodEnum authMethod) {
    this.authMethod = authMethod;
  }

  
  /**
   * This field is present only if the authentication method is AUTH_METHOD_CHAP. If the field length indicator is zero, there is no associated secret; otherwise there is a secret and it may or may not be specified, depending on the usage context for this data type. If the client is using this structure to set a secret, the length indicator should be one and the secret should be filled in; if the client is using this structure to set an authentication method with no secret, the length indicator should be zero. If the array is reporting this data, it sets the length indicator according to whether or not there is a secret. (The actual secret is never reported by the array; instead it uses the ENCRYPT_UNSPECIFIED case of EncryptedPassword.) Finally, because CHAP secrets are, by definition, limited to the ASCII character set, the clear text submitted for encryption must be ASCII, not Unicode.
   **/
  public AuthMethodTypeData chapSecret(List<EncryptedPassword> chapSecret) {
    this.chapSecret = chapSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the authentication method is AUTH_METHOD_CHAP. If the field length indicator is zero, there is no associated secret; otherwise there is a secret and it may or may not be specified, depending on the usage context for this data type. If the client is using this structure to set a secret, the length indicator should be one and the secret should be filled in; if the client is using this structure to set an authentication method with no secret, the length indicator should be zero. If the array is reporting this data, it sets the length indicator according to whether or not there is a secret. (The actual secret is never reported by the array; instead it uses the ENCRYPT_UNSPECIFIED case of EncryptedPassword.) Finally, because CHAP secrets are, by definition, limited to the ASCII character set, the clear text submitted for encryption must be ASCII, not Unicode.")
  @JsonProperty("chapSecret")
  public List<EncryptedPassword> getChapSecret() {
    return chapSecret;
  }
  
  public void setChapSecret(List<EncryptedPassword> chapSecret) {
    this.chapSecret = chapSecret;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMethodTypeData authMethodTypeData = (AuthMethodTypeData) o;
    return Objects.equals(this.authMethod, authMethodTypeData.authMethod) &&
        Objects.equals(this.chapSecret, authMethodTypeData.chapSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethod, chapSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodTypeData {\n");
    
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    chapSecret: ").append(toIndentedString(chapSecret)).append("\n");
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

