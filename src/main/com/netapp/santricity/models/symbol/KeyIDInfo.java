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
 * KeyIDInfo
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class KeyIDInfo   {
  
    private String lockKeyID;

    private String passPhrase;

  
  /**
   * This is the lock Key ID. Whenever a lock key is initialized or changed, a new lock key ID is generated. The lock key ID can be set to a value set by the user, or the controller can generate a lock key. The lock key ID is written to all security-enabled drives that use the referenced lock key. Note that the lock key ID can be read at any time from the disk drive, even if the drive is locked.
   **/
  public KeyIDInfo lockKeyID(String lockKeyID) {
    this.lockKeyID = lockKeyID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the lock Key ID. Whenever a lock key is initialized or changed, a new lock key ID is generated. The lock key ID can be set to a value set by the user, or the controller can generate a lock key. The lock key ID is written to all security-enabled drives that use the referenced lock key. Note that the lock key ID can be read at any time from the disk drive, even if the drive is locked.")
  @JsonProperty("lockKeyID")
  public String getLockKeyID() {
    return lockKeyID;
  }
  
  public void setLockKeyID(String lockKeyID) {
    this.lockKeyID = lockKeyID;
  }

  
  /**
   * The Pass Phrase is an alphanumeric string that is used to provide a human-compatible method of generating a lock key (for MegaRAID controllers) or for securely wrapping the lock key (external controllers). The controller firmware places no restrictions on the Pass Phrase, but for improved security, the management application will place the following requirements on a Pass Phrase used for any purpose:
   **/
  public KeyIDInfo passPhrase(String passPhrase) {
    this.passPhrase = passPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Pass Phrase is an alphanumeric string that is used to provide a human-compatible method of generating a lock key (for MegaRAID controllers) or for securely wrapping the lock key (external controllers). The controller firmware places no restrictions on the Pass Phrase, but for improved security, the management application will place the following requirements on a Pass Phrase used for any purpose:")
  @JsonProperty("passPhrase")
  public String getPassPhrase() {
    return passPhrase;
  }
  
  public void setPassPhrase(String passPhrase) {
    this.passPhrase = passPhrase;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyIDInfo keyIDInfo = (KeyIDInfo) o;
    return Objects.equals(this.lockKeyID, keyIDInfo.lockKeyID) &&
        Objects.equals(this.passPhrase, keyIDInfo.passPhrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockKeyID, passPhrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyIDInfo {\n");
    
    sb.append("    lockKeyID: ").append(toIndentedString(lockKeyID)).append("\n");
    sb.append("    passPhrase: ").append(toIndentedString(passPhrase)).append("\n");
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

