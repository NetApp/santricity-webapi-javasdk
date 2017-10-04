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
 * API response object that includes a Return Code that is dependent on the included API Error Code type.  It also includes invalid fields if they can be determined.
 */
@ApiModel(description = "API response object that includes a Return Code that is dependent on the included API Error Code type.  It also includes invalid fields if they can be determined.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class CallResponse   {
  
    private String errorMessage;

    private String localizedMessage;

    private String retcode;


  /**
   * Gets or Sets codeType
   */
  public enum CodeTypeEnum {
    symbol("symbol"),
    systemerror("systemerror"),
    devicemgrerror("devicemgrerror");
;
    private String value;

    CodeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CodeTypeEnum codeType;

    private List<String> invalidFieldsIfKnown;

  
  /**
   **/
  public CallResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   **/
  public CallResponse localizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("localizedMessage")
  public String getLocalizedMessage() {
    return localizedMessage;
  }
  
  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  
  /**
   * The value of retcode can vary by the code type.  To be unique, it must be combined with code type.      It is a string.  Even if the returned value looks like a number, don't assume its a number.      It is a short label that will not change based on Internationalization.
   **/
  public CallResponse retcode(String retcode) {
    this.retcode = retcode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of retcode can vary by the code type.  To be unique, it must be combined with code type.      It is a string.  Even if the returned value looks like a number, don't assume its a number.      It is a short label that will not change based on Internationalization.")
  @JsonProperty("retcode")
  public String getRetcode() {
    return retcode;
  }
  
  public void setRetcode(String retcode) {
    this.retcode = retcode;
  }

  
  /**
   **/
  public CallResponse codeType(CodeTypeEnum codeType) {
    this.codeType = codeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("codeType")
  public CodeTypeEnum getCodeType() {
    return codeType;
  }
  
  public void setCodeType(CodeTypeEnum codeType) {
    this.codeType = codeType;
  }

  
  /**
   **/
  public CallResponse invalidFieldsIfKnown(List<String> invalidFieldsIfKnown) {
    this.invalidFieldsIfKnown = invalidFieldsIfKnown;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("invalidFieldsIfKnown")
  public List<String> getInvalidFieldsIfKnown() {
    return invalidFieldsIfKnown;
  }
  
  public void setInvalidFieldsIfKnown(List<String> invalidFieldsIfKnown) {
    this.invalidFieldsIfKnown = invalidFieldsIfKnown;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallResponse callResponse = (CallResponse) o;
    return Objects.equals(this.errorMessage, callResponse.errorMessage) &&
        Objects.equals(this.localizedMessage, callResponse.localizedMessage) &&
        Objects.equals(this.retcode, callResponse.retcode) &&
        Objects.equals(this.codeType, callResponse.codeType) &&
        Objects.equals(this.invalidFieldsIfKnown, callResponse.invalidFieldsIfKnown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, localizedMessage, retcode, codeType, invalidFieldsIfKnown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallResponse {\n");
    
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    retcode: ").append(toIndentedString(retcode)).append("\n");
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    invalidFieldsIfKnown: ").append(toIndentedString(invalidFieldsIfKnown)).append("\n");
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

