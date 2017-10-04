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
 * EncryptedPassword
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class EncryptedPassword   {
  

  /**
   * This enumeration object is used to identify the type of encryption used for a particular operation or object.
   */
  public enum TypeEnum {
    pkcs5Sha1Des("pkcs5Sha1Des"),
    unspecified("unspecified"),
    pkcs5Sha2Aes("pkcs5Sha2Aes"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TypeEnum type;

    private PKCS5EncryptionData pkcs5Data;

    private PKCS5EncryptionData pkcs5AesData;

  
  /**
   * This enumeration object is used to identify the type of encryption used for a particular operation or object.
   **/
  public EncryptedPassword type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to identify the type of encryption used for a particular operation or object.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The PKCS #5 data associated with the encrypted password. This field is valid only if the encryption type is ENCRYPT_PKCS5_SHA1_DES.
   **/
  public EncryptedPassword pkcs5Data(PKCS5EncryptionData pkcs5Data) {
    this.pkcs5Data = pkcs5Data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PKCS #5 data associated with the encrypted password. This field is valid only if the encryption type is ENCRYPT_PKCS5_SHA1_DES.")
  @JsonProperty("pkcs5Data")
  public PKCS5EncryptionData getPkcs5Data() {
    return pkcs5Data;
  }
  
  public void setPkcs5Data(PKCS5EncryptionData pkcs5Data) {
    this.pkcs5Data = pkcs5Data;
  }

  
  /**
   * The PKCS#5 data associated with an AES encrypted password. This field is valid only if the encryption type is ENCRYPT_PKCS5_SHA2_AES.
   **/
  public EncryptedPassword pkcs5AesData(PKCS5EncryptionData pkcs5AesData) {
    this.pkcs5AesData = pkcs5AesData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PKCS#5 data associated with an AES encrypted password. This field is valid only if the encryption type is ENCRYPT_PKCS5_SHA2_AES.")
  @JsonProperty("pkcs5AesData")
  public PKCS5EncryptionData getPkcs5AesData() {
    return pkcs5AesData;
  }
  
  public void setPkcs5AesData(PKCS5EncryptionData pkcs5AesData) {
    this.pkcs5AesData = pkcs5AesData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedPassword encryptedPassword = (EncryptedPassword) o;
    return Objects.equals(this.type, encryptedPassword.type) &&
        Objects.equals(this.pkcs5Data, encryptedPassword.pkcs5Data) &&
        Objects.equals(this.pkcs5AesData, encryptedPassword.pkcs5AesData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pkcs5Data, pkcs5AesData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedPassword {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pkcs5Data: ").append(toIndentedString(pkcs5Data)).append("\n");
    sb.append("    pkcs5AesData: ").append(toIndentedString(pkcs5AesData)).append("\n");
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

