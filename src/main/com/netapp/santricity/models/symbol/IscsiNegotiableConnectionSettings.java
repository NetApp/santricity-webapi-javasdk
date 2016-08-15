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
 * IscsiNegotiableConnectionSettings
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class IscsiNegotiableConnectionSettings   {
  
    private Integer maxReceiveDataSegmentLength;


  /**
   * Gets or Sets headerDigestMethod
   */
  public enum HeaderDigestMethodEnum {
    none("none"),
    crc32c("crc32c"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    HeaderDigestMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<HeaderDigestMethodEnum> headerDigestMethod;


  /**
   * Gets or Sets dataDigestMethod
   */
  public enum DataDigestMethodEnum {
    none("none"),
    crc32c("crc32c"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DataDigestMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<DataDigestMethodEnum> dataDigestMethod;

    private Boolean receivingMarkers;


  /**
   * Gets or Sets authMethod
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

    private List<AuthMethodEnum> authMethod;

  
  /**
   * The maximum data payload size supported for command or data PDUs able to be received on this connection.
   **/
  public IscsiNegotiableConnectionSettings maxReceiveDataSegmentLength(Integer maxReceiveDataSegmentLength) {
    this.maxReceiveDataSegmentLength = maxReceiveDataSegmentLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum data payload size supported for command or data PDUs able to be received on this connection.")
  @JsonProperty("maxReceiveDataSegmentLength")
  public Integer getMaxReceiveDataSegmentLength() {
    return maxReceiveDataSegmentLength;
  }
  
  public void setMaxReceiveDataSegmentLength(Integer maxReceiveDataSegmentLength) {
    this.maxReceiveDataSegmentLength = maxReceiveDataSegmentLength;
  }

  
  /**
   * The iSCSI header digest scheme in use within this connection. This field is an array of at most two elements so that, when reporting default settings, both primary and secondary methods can be reported, which are at array indexes 0 and 1 respectively. When used to report current settings, the array is sized at one.
   **/
  public IscsiNegotiableConnectionSettings headerDigestMethod(List<HeaderDigestMethodEnum> headerDigestMethod) {
    this.headerDigestMethod = headerDigestMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The iSCSI header digest scheme in use within this connection. This field is an array of at most two elements so that, when reporting default settings, both primary and secondary methods can be reported, which are at array indexes 0 and 1 respectively. When used to report current settings, the array is sized at one.")
  @JsonProperty("headerDigestMethod")
  public List<HeaderDigestMethodEnum> getHeaderDigestMethod() {
    return headerDigestMethod;
  }
  
  public void setHeaderDigestMethod(List<HeaderDigestMethodEnum> headerDigestMethod) {
    this.headerDigestMethod = headerDigestMethod;
  }

  
  /**
   * The iSCSI data digest scheme in use within this connection. The same method is followed as for header digest in reporting default versus current settings.
   **/
  public IscsiNegotiableConnectionSettings dataDigestMethod(List<DataDigestMethodEnum> dataDigestMethod) {
    this.dataDigestMethod = dataDigestMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The iSCSI data digest scheme in use within this connection. The same method is followed as for header digest in reporting default versus current settings.")
  @JsonProperty("dataDigestMethod")
  public List<DataDigestMethodEnum> getDataDigestMethod() {
    return dataDigestMethod;
  }
  
  public void setDataDigestMethod(List<DataDigestMethodEnum> dataDigestMethod) {
    this.dataDigestMethod = dataDigestMethod;
  }

  
  /**
   * True if this connection is receiving markers in in its incoming data stream.
   **/
  public IscsiNegotiableConnectionSettings receivingMarkers(Boolean receivingMarkers) {
    this.receivingMarkers = receivingMarkers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if this connection is receiving markers in in its incoming data stream.")
  @JsonProperty("receivingMarkers")
  public Boolean getReceivingMarkers() {
    return receivingMarkers;
  }
  
  public void setReceivingMarkers(Boolean receivingMarkers) {
    this.receivingMarkers = receivingMarkers;
  }

  
  /**
   * The authentication method being used on this connection, as communicated during the login phase. The same method is followed as for header digest in reporting default versus current settings.
   **/
  public IscsiNegotiableConnectionSettings authMethod(List<AuthMethodEnum> authMethod) {
    this.authMethod = authMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The authentication method being used on this connection, as communicated during the login phase. The same method is followed as for header digest in reporting default versus current settings.")
  @JsonProperty("authMethod")
  public List<AuthMethodEnum> getAuthMethod() {
    return authMethod;
  }
  
  public void setAuthMethod(List<AuthMethodEnum> authMethod) {
    this.authMethod = authMethod;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiNegotiableConnectionSettings iscsiNegotiableConnectionSettings = (IscsiNegotiableConnectionSettings) o;
    return Objects.equals(this.maxReceiveDataSegmentLength, iscsiNegotiableConnectionSettings.maxReceiveDataSegmentLength) &&
        Objects.equals(this.headerDigestMethod, iscsiNegotiableConnectionSettings.headerDigestMethod) &&
        Objects.equals(this.dataDigestMethod, iscsiNegotiableConnectionSettings.dataDigestMethod) &&
        Objects.equals(this.receivingMarkers, iscsiNegotiableConnectionSettings.receivingMarkers) &&
        Objects.equals(this.authMethod, iscsiNegotiableConnectionSettings.authMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReceiveDataSegmentLength, headerDigestMethod, dataDigestMethod, receivingMarkers, authMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiNegotiableConnectionSettings {\n");
    
    sb.append("    maxReceiveDataSegmentLength: ").append(toIndentedString(maxReceiveDataSegmentLength)).append("\n");
    sb.append("    headerDigestMethod: ").append(toIndentedString(headerDigestMethod)).append("\n");
    sb.append("    dataDigestMethod: ").append(toIndentedString(dataDigestMethod)).append("\n");
    sb.append("    receivingMarkers: ").append(toIndentedString(receivingMarkers)).append("\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
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

