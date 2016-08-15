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
 * SAData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SAData   {
  
    private Boolean needsAttention;

    private Boolean fixing;

    private SAIdentifier saId;

    private String managementClassName;

    private String storageArrayLabel;

    private Long bootTime;

    private String fwVersion;

    private String appVersion;

    private String bootVersion;

    private String nvsramVersion;

    private String fwPrefix;

    private String chassisSerialNumber;

    private String eventConfigurationDataVersion;

    private List<Integer> arrayAttributes;

    private List<Integer> res4;

    private List<Integer> res5;

    private List<Integer> res6;

    private String res7;

    private ExtendedSAData extendedSAData;

  
  /**
   * An indication of whether the array needs attention. A value of true is returned if there are any components that have been marked failed for any reason. Otherwise, if all components are operating properly, a value of false is returned.
   **/
  public SAData needsAttention(Boolean needsAttention) {
    this.needsAttention = needsAttention;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether the array needs attention. A value of true is returned if there are any components that have been marked failed for any reason. Otherwise, if all components are operating properly, a value of false is returned.")
  @JsonProperty("needsAttention")
  public Boolean getNeedsAttention() {
    return needsAttention;
  }
  
  public void setNeedsAttention(Boolean needsAttention) {
    this.needsAttention = needsAttention;
  }

  
  /**
   * An indication of whether the array is in the process of recovering from a Needs Attention condition. A value of true indicates that no physical components are currently marked failed, but that some residual recovery activity (such as reconstruction, copyback, etc.) is still in progress.
   **/
  public SAData fixing(Boolean fixing) {
    this.fixing = fixing;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether the array is in the process of recovering from a Needs Attention condition. A value of true indicates that no physical components are currently marked failed, but that some residual recovery activity (such as reconstruction, copyback, etc.) is still in progress.")
  @JsonProperty("fixing")
  public Boolean getFixing() {
    return fixing;
  }
  
  public void setFixing(Boolean fixing) {
    this.fixing = fixing;
  }

  
  /**
   * The globally-unique identifier value for this storage array.
   **/
  public SAData saId(SAIdentifier saId) {
    this.saId = saId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally-unique identifier value for this storage array.")
  @JsonProperty("saId")
  public SAIdentifier getSaId() {
    return saId;
  }
  
  public void setSaId(SAIdentifier saId) {
    this.saId = saId;
  }

  
  /**
   * The name of the application-level entity required to manage configuration operations for the storage array.
   **/
  public SAData managementClassName(String managementClassName) {
    this.managementClassName = managementClassName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the application-level entity required to manage configuration operations for the storage array.")
  @JsonProperty("managementClassName")
  public String getManagementClassName() {
    return managementClassName;
  }
  
  public void setManagementClassName(String managementClassName) {
    this.managementClassName = managementClassName;
  }

  
  /**
   * The user-assigned label for the storage array.
   **/
  public SAData storageArrayLabel(String storageArrayLabel) {
    this.storageArrayLabel = storageArrayLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-assigned label for the storage array.")
  @JsonProperty("storageArrayLabel")
  public String getStorageArrayLabel() {
    return storageArrayLabel;
  }
  
  public void setStorageArrayLabel(String storageArrayLabel) {
    this.storageArrayLabel = storageArrayLabel;
  }

  
  /**
   * The timestamp value for the time at which the responding controller last booted. Note that this value may differ between the individual controllers of a storage array. This value is defined in terms of the number of seconds since midnight GMT on January 1, 1970.
   **/
  public SAData bootTime(Long bootTime) {
    this.bootTime = bootTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp value for the time at which the responding controller last booted. Note that this value may differ between the individual controllers of a storage array. This value is defined in terms of the number of seconds since midnight GMT on January 1, 1970.")
  @JsonProperty("bootTime")
  public Long getBootTime() {
    return bootTime;
  }
  
  public void setBootTime(Long bootTime) {
    this.bootTime = bootTime;
  }

  
  /**
   * The version identifier of the currently-installed array firmware.
   **/
  public SAData fwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version identifier of the currently-installed array firmware.")
  @JsonProperty("fwVersion")
  public String getFwVersion() {
    return fwVersion;
  }
  
  public void setFwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
  }

  
  /**
   * The version identifier of the \"application\" component of the currently-installed array firmware.
   **/
  public SAData appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version identifier of the \"application\" component of the currently-installed array firmware.")
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  
  /**
   * The version identifier of the \"boot\" component of the currently-installed array firmware.
   **/
  public SAData bootVersion(String bootVersion) {
    this.bootVersion = bootVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version identifier of the \"boot\" component of the currently-installed array firmware.")
  @JsonProperty("bootVersion")
  public String getBootVersion() {
    return bootVersion;
  }
  
  public void setBootVersion(String bootVersion) {
    this.bootVersion = bootVersion;
  }

  
  /**
   * An ASCII string that describes the currently-installed NVSRAM contents.
   **/
  public SAData nvsramVersion(String nvsramVersion) {
    this.nvsramVersion = nvsramVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII string that describes the currently-installed NVSRAM contents.")
  @JsonProperty("nvsramVersion")
  public String getNvsramVersion() {
    return nvsramVersion;
  }
  
  public void setNvsramVersion(String nvsramVersion) {
    this.nvsramVersion = nvsramVersion;
  }

  
  /**
   * An ASCII string that describes the firmware prefix.
   **/
  public SAData fwPrefix(String fwPrefix) {
    this.fwPrefix = fwPrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII string that describes the firmware prefix.")
  @JsonProperty("fwPrefix")
  public String getFwPrefix() {
    return fwPrefix;
  }
  
  public void setFwPrefix(String fwPrefix) {
    this.fwPrefix = fwPrefix;
  }

  
  /**
   * An ASCII string that describes the chassis serial number.
   **/
  public SAData chassisSerialNumber(String chassisSerialNumber) {
    this.chassisSerialNumber = chassisSerialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII string that describes the chassis serial number.")
  @JsonProperty("chassisSerialNumber")
  public String getChassisSerialNumber() {
    return chassisSerialNumber;
  }
  
  public void setChassisSerialNumber(String chassisSerialNumber) {
    this.chassisSerialNumber = chassisSerialNumber;
  }

  
  /**
   * An ASCII string that identifies the version of the MEL event configuration data. This is used for the event logging enhancements in Chessie 2.
   **/
  public SAData eventConfigurationDataVersion(String eventConfigurationDataVersion) {
    this.eventConfigurationDataVersion = eventConfigurationDataVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ASCII string that identifies the version of the MEL event configuration data. This is used for the event logging enhancements in Chessie 2.")
  @JsonProperty("eventConfigurationDataVersion")
  public String getEventConfigurationDataVersion() {
    return eventConfigurationDataVersion;
  }
  
  public void setEventConfigurationDataVersion(String eventConfigurationDataVersion) {
    this.eventConfigurationDataVersion = eventConfigurationDataVersion;
  }

  
  /**
   * SAAttributeID attribute-value pairs.
   **/
  public SAData arrayAttributes(List<Integer> arrayAttributes) {
    this.arrayAttributes = arrayAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "SAAttributeID attribute-value pairs.")
  @JsonProperty("arrayAttributes")
  public List<Integer> getArrayAttributes() {
    return arrayAttributes;
  }
  
  public void setArrayAttributes(List<Integer> arrayAttributes) {
    this.arrayAttributes = arrayAttributes;
  }

  
  /**
   **/
  public SAData res4(List<Integer> res4) {
    this.res4 = res4;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("res4")
  public List<Integer> getRes4() {
    return res4;
  }
  
  public void setRes4(List<Integer> res4) {
    this.res4 = res4;
  }

  
  /**
   **/
  public SAData res5(List<Integer> res5) {
    this.res5 = res5;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("res5")
  public List<Integer> getRes5() {
    return res5;
  }
  
  public void setRes5(List<Integer> res5) {
    this.res5 = res5;
  }

  
  /**
   **/
  public SAData res6(List<Integer> res6) {
    this.res6 = res6;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("res6")
  public List<Integer> getRes6() {
    return res6;
  }
  
  public void setRes6(List<Integer> res6) {
    this.res6 = res6;
  }

  
  /**
   **/
  public SAData res7(String res7) {
    this.res7 = res7;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("res7")
  public String getRes7() {
    return res7;
  }
  
  public void setRes7(String res7) {
    this.res7 = res7;
  }

  
  /**
   * This element allows additional content to be added to SAData with actually adding any new elements to the struct. The element replaces a reserved field that was of variable length.
   **/
  public SAData extendedSAData(ExtendedSAData extendedSAData) {
    this.extendedSAData = extendedSAData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This element allows additional content to be added to SAData with actually adding any new elements to the struct. The element replaces a reserved field that was of variable length.")
  @JsonProperty("extendedSAData")
  public ExtendedSAData getExtendedSAData() {
    return extendedSAData;
  }
  
  public void setExtendedSAData(ExtendedSAData extendedSAData) {
    this.extendedSAData = extendedSAData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAData sAData = (SAData) o;
    return Objects.equals(this.needsAttention, sAData.needsAttention) &&
        Objects.equals(this.fixing, sAData.fixing) &&
        Objects.equals(this.saId, sAData.saId) &&
        Objects.equals(this.managementClassName, sAData.managementClassName) &&
        Objects.equals(this.storageArrayLabel, sAData.storageArrayLabel) &&
        Objects.equals(this.bootTime, sAData.bootTime) &&
        Objects.equals(this.fwVersion, sAData.fwVersion) &&
        Objects.equals(this.appVersion, sAData.appVersion) &&
        Objects.equals(this.bootVersion, sAData.bootVersion) &&
        Objects.equals(this.nvsramVersion, sAData.nvsramVersion) &&
        Objects.equals(this.fwPrefix, sAData.fwPrefix) &&
        Objects.equals(this.chassisSerialNumber, sAData.chassisSerialNumber) &&
        Objects.equals(this.eventConfigurationDataVersion, sAData.eventConfigurationDataVersion) &&
        Objects.equals(this.arrayAttributes, sAData.arrayAttributes) &&
        Objects.equals(this.res4, sAData.res4) &&
        Objects.equals(this.res5, sAData.res5) &&
        Objects.equals(this.res6, sAData.res6) &&
        Objects.equals(this.res7, sAData.res7) &&
        Objects.equals(this.extendedSAData, sAData.extendedSAData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needsAttention, fixing, saId, managementClassName, storageArrayLabel, bootTime, fwVersion, appVersion, bootVersion, nvsramVersion, fwPrefix, chassisSerialNumber, eventConfigurationDataVersion, arrayAttributes, res4, res5, res6, res7, extendedSAData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAData {\n");
    
    sb.append("    needsAttention: ").append(toIndentedString(needsAttention)).append("\n");
    sb.append("    fixing: ").append(toIndentedString(fixing)).append("\n");
    sb.append("    saId: ").append(toIndentedString(saId)).append("\n");
    sb.append("    managementClassName: ").append(toIndentedString(managementClassName)).append("\n");
    sb.append("    storageArrayLabel: ").append(toIndentedString(storageArrayLabel)).append("\n");
    sb.append("    bootTime: ").append(toIndentedString(bootTime)).append("\n");
    sb.append("    fwVersion: ").append(toIndentedString(fwVersion)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    bootVersion: ").append(toIndentedString(bootVersion)).append("\n");
    sb.append("    nvsramVersion: ").append(toIndentedString(nvsramVersion)).append("\n");
    sb.append("    fwPrefix: ").append(toIndentedString(fwPrefix)).append("\n");
    sb.append("    chassisSerialNumber: ").append(toIndentedString(chassisSerialNumber)).append("\n");
    sb.append("    eventConfigurationDataVersion: ").append(toIndentedString(eventConfigurationDataVersion)).append("\n");
    sb.append("    arrayAttributes: ").append(toIndentedString(arrayAttributes)).append("\n");
    sb.append("    res4: ").append(toIndentedString(res4)).append("\n");
    sb.append("    res5: ").append(toIndentedString(res5)).append("\n");
    sb.append("    res6: ").append(toIndentedString(res6)).append("\n");
    sb.append("    res7: ").append(toIndentedString(res7)).append("\n");
    sb.append("    extendedSAData: ").append(toIndentedString(extendedSAData)).append("\n");
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

