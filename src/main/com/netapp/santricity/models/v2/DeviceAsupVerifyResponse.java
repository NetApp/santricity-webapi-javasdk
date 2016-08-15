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
 * Used to return resuls of ASUP settings verification.
 */
@ApiModel(description = "Used to return resuls of ASUP settings verification.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class DeviceAsupVerifyResponse   {
  
    private Boolean successful;

    private String errorMessage;

    private Boolean aodAttempted;

    private Boolean aodSuccessful;

    private String aodErrorMessage;

  
  /**
   * Indicates if verification was successful
   **/
  public DeviceAsupVerifyResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if verification was successful")
  @JsonProperty("successful")
  public Boolean getSuccessful() {
    return successful;
  }
  
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  
  /**
   * Error message if verification failed
   **/
  public DeviceAsupVerifyResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error message if verification failed")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   * Indicates if AOD verification was attempted
   **/
  public DeviceAsupVerifyResponse aodAttempted(Boolean aodAttempted) {
    this.aodAttempted = aodAttempted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if AOD verification was attempted")
  @JsonProperty("aodAttempted")
  public Boolean getAodAttempted() {
    return aodAttempted;
  }
  
  public void setAodAttempted(Boolean aodAttempted) {
    this.aodAttempted = aodAttempted;
  }

  
  /**
   * Indicates if AOD verification was successful
   **/
  public DeviceAsupVerifyResponse aodSuccessful(Boolean aodSuccessful) {
    this.aodSuccessful = aodSuccessful;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if AOD verification was successful")
  @JsonProperty("aodSuccessful")
  public Boolean getAodSuccessful() {
    return aodSuccessful;
  }
  
  public void setAodSuccessful(Boolean aodSuccessful) {
    this.aodSuccessful = aodSuccessful;
  }

  
  /**
   * Error message if AOD verification failed
   **/
  public DeviceAsupVerifyResponse aodErrorMessage(String aodErrorMessage) {
    this.aodErrorMessage = aodErrorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error message if AOD verification failed")
  @JsonProperty("aodErrorMessage")
  public String getAodErrorMessage() {
    return aodErrorMessage;
  }
  
  public void setAodErrorMessage(String aodErrorMessage) {
    this.aodErrorMessage = aodErrorMessage;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAsupVerifyResponse deviceAsupVerifyResponse = (DeviceAsupVerifyResponse) o;
    return Objects.equals(this.successful, deviceAsupVerifyResponse.successful) &&
        Objects.equals(this.errorMessage, deviceAsupVerifyResponse.errorMessage) &&
        Objects.equals(this.aodAttempted, deviceAsupVerifyResponse.aodAttempted) &&
        Objects.equals(this.aodSuccessful, deviceAsupVerifyResponse.aodSuccessful) &&
        Objects.equals(this.aodErrorMessage, deviceAsupVerifyResponse.aodErrorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, errorMessage, aodAttempted, aodSuccessful, aodErrorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAsupVerifyResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    aodAttempted: ").append(toIndentedString(aodAttempted)).append("\n");
    sb.append("    aodSuccessful: ").append(toIndentedString(aodSuccessful)).append("\n");
    sb.append("    aodErrorMessage: ").append(toIndentedString(aodErrorMessage)).append("\n");
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

