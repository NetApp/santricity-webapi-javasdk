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
 * PKCS5EncryptionData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class PKCS5EncryptionData   {
  
    private Integer iterations;

    private String salt;

    private String cipherText;

  
  /**
   * The number of message digest iterations to be performed when generating the encryption key and initialization vector from the passphrase and salt values.
   **/
  public PKCS5EncryptionData iterations(Integer iterations) {
    this.iterations = iterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of message digest iterations to be performed when generating the encryption key and initialization vector from the passphrase and salt values.")
  @JsonProperty("iterations")
  public Integer getIterations() {
    return iterations;
  }
  
  public void setIterations(Integer iterations) {
    this.iterations = iterations;
  }

  
  /**
   * A byte array containing the salt, or random data, selected by the encryption code for this particular encryption operation.
   **/
  public PKCS5EncryptionData salt(String salt) {
    this.salt = salt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A byte array containing the salt, or random data, selected by the encryption code for this particular encryption operation.")
  @JsonProperty("salt")
  public String getSalt() {
    return salt;
  }
  
  public void setSalt(String salt) {
    this.salt = salt;
  }

  
  /**
   * A variable-length array containing the encrypted data, or cipher text. The length of this array must be a multiple of 8 in order to conform to the PKCS #5 standard. The standard specifies the appropriate technique for adding pad bytes to ensure that this constraint is met.
   **/
  public PKCS5EncryptionData cipherText(String cipherText) {
    this.cipherText = cipherText;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing the encrypted data, or cipher text. The length of this array must be a multiple of 8 in order to conform to the PKCS #5 standard. The standard specifies the appropriate technique for adding pad bytes to ensure that this constraint is met.")
  @JsonProperty("cipherText")
  public String getCipherText() {
    return cipherText;
  }
  
  public void setCipherText(String cipherText) {
    this.cipherText = cipherText;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PKCS5EncryptionData pKCS5EncryptionData = (PKCS5EncryptionData) o;
    return Objects.equals(this.iterations, pKCS5EncryptionData.iterations) &&
        Objects.equals(this.salt, pKCS5EncryptionData.salt) &&
        Objects.equals(this.cipherText, pKCS5EncryptionData.cipherText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iterations, salt, cipherText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PKCS5EncryptionData {\n");
    
    sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
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

