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
 * IscsiTargetStatistics
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IscsiTargetStatistics   {
  
    private String target;

    private Long successfulLogins;

    private Long loginFailures;

    private Long successfulLoginAuthentications;

    private Long authenticationLoginFailures;

    private Long errorFreePdus;

    private Long protocolErrorPdus;

    private Long headerDigestErrors;

    private Long dataDigestErrors;

    private Long sessionFailures;

    private Long connectionFailures;

  
  /**
   * A reference to the target with which the statistics are associated.
   **/
  public IscsiTargetStatistics target(String target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the target with which the statistics are associated.")
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }
  
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   * The count of successful iSCSI logins to the target.
   **/
  public IscsiTargetStatistics successfulLogins(Long successfulLogins) {
    this.successfulLogins = successfulLogins;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of successful iSCSI logins to the target.")
  @JsonProperty("successfulLogins")
  public Long getSuccessfulLogins() {
    return successfulLogins;
  }
  
  public void setSuccessfulLogins(Long successfulLogins) {
    this.successfulLogins = successfulLogins;
  }

  
  /**
   * The number of times an iSCSI login attempt to or from the target failed.
   **/
  public IscsiTargetStatistics loginFailures(Long loginFailures) {
    this.loginFailures = loginFailures;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times an iSCSI login attempt to or from the target failed.")
  @JsonProperty("loginFailures")
  public Long getLoginFailures() {
    return loginFailures;
  }
  
  public void setLoginFailures(Long loginFailures) {
    this.loginFailures = loginFailures;
  }

  
  /**
   * The number of times an initiator login authentication attempt was accepted by the target.
   **/
  public IscsiTargetStatistics successfulLoginAuthentications(Long successfulLoginAuthentications) {
    this.successfulLoginAuthentications = successfulLoginAuthentications;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times an initiator login authentication attempt was accepted by the target.")
  @JsonProperty("successfulLoginAuthentications")
  public Long getSuccessfulLoginAuthentications() {
    return successfulLoginAuthentications;
  }
  
  public void setSuccessfulLoginAuthentications(Long successfulLoginAuthentications) {
    this.successfulLoginAuthentications = successfulLoginAuthentications;
  }

  
  /**
   * The number of times an initiator login authentication attempt was rejected by the target.
   **/
  public IscsiTargetStatistics authenticationLoginFailures(Long authenticationLoginFailures) {
    this.authenticationLoginFailures = authenticationLoginFailures;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times an initiator login authentication attempt was rejected by the target.")
  @JsonProperty("authenticationLoginFailures")
  public Long getAuthenticationLoginFailures() {
    return authenticationLoginFailures;
  }
  
  public void setAuthenticationLoginFailures(Long authenticationLoginFailures) {
    this.authenticationLoginFailures = authenticationLoginFailures;
  }

  
  /**
   * The number of iSCSI PDUs processed by the target that experienced no errors of any sort.
   **/
  public IscsiTargetStatistics errorFreePdus(Long errorFreePdus) {
    this.errorFreePdus = errorFreePdus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iSCSI PDUs processed by the target that experienced no errors of any sort.")
  @JsonProperty("errorFreePdus")
  public Long getErrorFreePdus() {
    return errorFreePdus;
  }
  
  public void setErrorFreePdus(Long errorFreePdus) {
    this.errorFreePdus = errorFreePdus;
  }

  
  /**
   * The number of iSCSI PDUs processed by the target that experienced protocol errors.
   **/
  public IscsiTargetStatistics protocolErrorPdus(Long protocolErrorPdus) {
    this.protocolErrorPdus = protocolErrorPdus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iSCSI PDUs processed by the target that experienced protocol errors.")
  @JsonProperty("protocolErrorPdus")
  public Long getProtocolErrorPdus() {
    return protocolErrorPdus;
  }
  
  public void setProtocolErrorPdus(Long protocolErrorPdus) {
    this.protocolErrorPdus = protocolErrorPdus;
  }

  
  /**
   * The number of iSCSI PDUs received by the target having header digest errors.
   **/
  public IscsiTargetStatistics headerDigestErrors(Long headerDigestErrors) {
    this.headerDigestErrors = headerDigestErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iSCSI PDUs received by the target having header digest errors.")
  @JsonProperty("headerDigestErrors")
  public Long getHeaderDigestErrors() {
    return headerDigestErrors;
  }
  
  public void setHeaderDigestErrors(Long headerDigestErrors) {
    this.headerDigestErrors = headerDigestErrors;
  }

  
  /**
   * The number of iSCSI PDUs received by the target having data digest errors.
   **/
  public IscsiTargetStatistics dataDigestErrors(Long dataDigestErrors) {
    this.dataDigestErrors = dataDigestErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iSCSI PDUs received by the target having data digest errors.")
  @JsonProperty("dataDigestErrors")
  public Long getDataDigestErrors() {
    return dataDigestErrors;
  }
  
  public void setDataDigestErrors(Long dataDigestErrors) {
    this.dataDigestErrors = dataDigestErrors;
  }

  
  /**
   * The number of iSCSI sessions for the target that terminated abnormally, either by administrative action or due to firmware-detected error.
   **/
  public IscsiTargetStatistics sessionFailures(Long sessionFailures) {
    this.sessionFailures = sessionFailures;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iSCSI sessions for the target that terminated abnormally, either by administrative action or due to firmware-detected error.")
  @JsonProperty("sessionFailures")
  public Long getSessionFailures() {
    return sessionFailures;
  }
  
  public void setSessionFailures(Long sessionFailures) {
    this.sessionFailures = sessionFailures;
  }

  
  /**
   * The number of iSCSI connections for the target that terminated abnormally, either by administrative action or due to firmware-detected error.
   **/
  public IscsiTargetStatistics connectionFailures(Long connectionFailures) {
    this.connectionFailures = connectionFailures;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iSCSI connections for the target that terminated abnormally, either by administrative action or due to firmware-detected error.")
  @JsonProperty("connectionFailures")
  public Long getConnectionFailures() {
    return connectionFailures;
  }
  
  public void setConnectionFailures(Long connectionFailures) {
    this.connectionFailures = connectionFailures;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiTargetStatistics iscsiTargetStatistics = (IscsiTargetStatistics) o;
    return Objects.equals(this.target, iscsiTargetStatistics.target) &&
        Objects.equals(this.successfulLogins, iscsiTargetStatistics.successfulLogins) &&
        Objects.equals(this.loginFailures, iscsiTargetStatistics.loginFailures) &&
        Objects.equals(this.successfulLoginAuthentications, iscsiTargetStatistics.successfulLoginAuthentications) &&
        Objects.equals(this.authenticationLoginFailures, iscsiTargetStatistics.authenticationLoginFailures) &&
        Objects.equals(this.errorFreePdus, iscsiTargetStatistics.errorFreePdus) &&
        Objects.equals(this.protocolErrorPdus, iscsiTargetStatistics.protocolErrorPdus) &&
        Objects.equals(this.headerDigestErrors, iscsiTargetStatistics.headerDigestErrors) &&
        Objects.equals(this.dataDigestErrors, iscsiTargetStatistics.dataDigestErrors) &&
        Objects.equals(this.sessionFailures, iscsiTargetStatistics.sessionFailures) &&
        Objects.equals(this.connectionFailures, iscsiTargetStatistics.connectionFailures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, successfulLogins, loginFailures, successfulLoginAuthentications, authenticationLoginFailures, errorFreePdus, protocolErrorPdus, headerDigestErrors, dataDigestErrors, sessionFailures, connectionFailures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiTargetStatistics {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    successfulLogins: ").append(toIndentedString(successfulLogins)).append("\n");
    sb.append("    loginFailures: ").append(toIndentedString(loginFailures)).append("\n");
    sb.append("    successfulLoginAuthentications: ").append(toIndentedString(successfulLoginAuthentications)).append("\n");
    sb.append("    authenticationLoginFailures: ").append(toIndentedString(authenticationLoginFailures)).append("\n");
    sb.append("    errorFreePdus: ").append(toIndentedString(errorFreePdus)).append("\n");
    sb.append("    protocolErrorPdus: ").append(toIndentedString(protocolErrorPdus)).append("\n");
    sb.append("    headerDigestErrors: ").append(toIndentedString(headerDigestErrors)).append("\n");
    sb.append("    dataDigestErrors: ").append(toIndentedString(dataDigestErrors)).append("\n");
    sb.append("    sessionFailures: ").append(toIndentedString(sessionFailures)).append("\n");
    sb.append("    connectionFailures: ").append(toIndentedString(connectionFailures)).append("\n");
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

