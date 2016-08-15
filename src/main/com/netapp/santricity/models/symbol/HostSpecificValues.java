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
 * HostSpecificValues
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class HostSpecificValues   {
  
    private Boolean waitForDownload;

    private Boolean notReadySenseForQuiescenceInProgress;

    private Boolean notReadySenseForQuiescenceInProgress2;

    private Boolean checkConditionForVendorUniqueUAConditions;

    private Boolean reportDeferredErrors;

    private Boolean ignoreForceUnitAccess;

    private Boolean ignoreWriteCacheDisable;

    private Boolean allowReservationOnUnownedLUNs;

    private Boolean worldWideNameInStandardInquiry;

    private Boolean propagateHostBusResets;

    private Boolean reportSCCDeviceEnable;

    private Boolean conditionalFCLogout;

    private Boolean forceSCSI2;

    private Boolean reportUnconfiguredLUNs;

    private Boolean ignoreSyncCache;

    private Boolean ignoreUTMLunOwnership;

    private Boolean reportLUNPreferredPathInStandardInquiry;

    private Boolean autoLUNTransfer;

    private String inquiryUnconfiguredDeviceType;

    private String inquiryUnownedDeviceType;

    private String unownedBlock0Read;

    private Boolean retainLogins;

    private String hostPortType;

    private Integer maxRestrictedLUNs;

    private String reserved1;

    private Boolean avtExclusionExtentsEnabled;

    private Boolean suppressVolOffPreferredPathAlert;

    private String hostType;

    private Boolean tpgsSupported;

    private Boolean volumeFormatOptions;

    private Boolean restrictedLun0;

    private Boolean usePage2CQuiescenceTimeout;

    private Boolean asymmetricLUAccess;

    private Boolean ignoreISCSISessionIDInITN;

    private Boolean enableLUCheckConditionParallelResponses;

    private Boolean disableExplicitTPGS;

    private Boolean unownedCheckConditionDuringFWActivation;

    private Boolean allowPreferredOwnerReportingSuppression;

    private Boolean enableTargetFailback;

    private Boolean enableAutoLoadBalance;

    private Integer quiescenceInProgressSenseKey;

    private Integer quiescenceInProgressASC;

    private Integer quiescenceInProgressASCQ;

    private Integer persistentID;

  
  /**
   * The download microcode status control.
   **/
  public HostSpecificValues waitForDownload(Boolean waitForDownload) {
    this.waitForDownload = waitForDownload;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The download microcode status control.")
  @JsonProperty("waitForDownload")
  public Boolean getWaitForDownload() {
    return waitForDownload;
  }
  
  public void setWaitForDownload(Boolean waitForDownload) {
    this.waitForDownload = waitForDownload;
  }

  
  /**
   * This value determines the response of the controller to commands received during the 'controller quiesced' state.
   **/
  public HostSpecificValues notReadySenseForQuiescenceInProgress(Boolean notReadySenseForQuiescenceInProgress) {
    this.notReadySenseForQuiescenceInProgress = notReadySenseForQuiescenceInProgress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value determines the response of the controller to commands received during the 'controller quiesced' state.")
  @JsonProperty("notReadySenseForQuiescenceInProgress")
  public Boolean getNotReadySenseForQuiescenceInProgress() {
    return notReadySenseForQuiescenceInProgress;
  }
  
  public void setNotReadySenseForQuiescenceInProgress(Boolean notReadySenseForQuiescenceInProgress) {
    this.notReadySenseForQuiescenceInProgress = notReadySenseForQuiescenceInProgress;
  }

  
  /**
   * This value determines the response of the controller to commands received during the 'controller quiesced' state.
   **/
  public HostSpecificValues notReadySenseForQuiescenceInProgress2(Boolean notReadySenseForQuiescenceInProgress2) {
    this.notReadySenseForQuiescenceInProgress2 = notReadySenseForQuiescenceInProgress2;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value determines the response of the controller to commands received during the 'controller quiesced' state.")
  @JsonProperty("notReadySenseForQuiescenceInProgress2")
  public Boolean getNotReadySenseForQuiescenceInProgress2() {
    return notReadySenseForQuiescenceInProgress2;
  }
  
  public void setNotReadySenseForQuiescenceInProgress2(Boolean notReadySenseForQuiescenceInProgress2) {
    this.notReadySenseForQuiescenceInProgress2 = notReadySenseForQuiescenceInProgress2;
  }

  
  /**
   * This value determines if the controller will report a vendor unique Unit Attention condition as a Check Condition status.
   **/
  public HostSpecificValues checkConditionForVendorUniqueUAConditions(Boolean checkConditionForVendorUniqueUAConditions) {
    this.checkConditionForVendorUniqueUAConditions = checkConditionForVendorUniqueUAConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value determines if the controller will report a vendor unique Unit Attention condition as a Check Condition status.")
  @JsonProperty("checkConditionForVendorUniqueUAConditions")
  public Boolean getCheckConditionForVendorUniqueUAConditions() {
    return checkConditionForVendorUniqueUAConditions;
  }
  
  public void setCheckConditionForVendorUniqueUAConditions(Boolean checkConditionForVendorUniqueUAConditions) {
    this.checkConditionForVendorUniqueUAConditions = checkConditionForVendorUniqueUAConditions;
  }

  
  /**
   * This value is used to determine how deferred errors are reported to the host.
   **/
  public HostSpecificValues reportDeferredErrors(Boolean reportDeferredErrors) {
    this.reportDeferredErrors = reportDeferredErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value is used to determine how deferred errors are reported to the host.")
  @JsonProperty("reportDeferredErrors")
  public Boolean getReportDeferredErrors() {
    return reportDeferredErrors;
  }
  
  public void setReportDeferredErrors(Boolean reportDeferredErrors) {
    this.reportDeferredErrors = reportDeferredErrors;
  }

  
  /**
   * This value determines controller treatment of the Force Unit Access Option in the SCSI Read(10) and Write(10) commands.
   **/
  public HostSpecificValues ignoreForceUnitAccess(Boolean ignoreForceUnitAccess) {
    this.ignoreForceUnitAccess = ignoreForceUnitAccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value determines controller treatment of the Force Unit Access Option in the SCSI Read(10) and Write(10) commands.")
  @JsonProperty("ignoreForceUnitAccess")
  public Boolean getIgnoreForceUnitAccess() {
    return ignoreForceUnitAccess;
  }
  
  public void setIgnoreForceUnitAccess(Boolean ignoreForceUnitAccess) {
    this.ignoreForceUnitAccess = ignoreForceUnitAccess;
  }

  
  /**
   * This value determines if the controller will allow the resetting of the WCE bit in the Mode Select Caching Page to disable write caching.
   **/
  public HostSpecificValues ignoreWriteCacheDisable(Boolean ignoreWriteCacheDisable) {
    this.ignoreWriteCacheDisable = ignoreWriteCacheDisable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value determines if the controller will allow the resetting of the WCE bit in the Mode Select Caching Page to disable write caching.")
  @JsonProperty("ignoreWriteCacheDisable")
  public Boolean getIgnoreWriteCacheDisable() {
    return ignoreWriteCacheDisable;
  }
  
  public void setIgnoreWriteCacheDisable(Boolean ignoreWriteCacheDisable) {
    this.ignoreWriteCacheDisable = ignoreWriteCacheDisable;
  }

  
  /**
   * This value determines the controller response to Reservation/Release commands that are received for LUNs that are not owned by the controller.
   **/
  public HostSpecificValues allowReservationOnUnownedLUNs(Boolean allowReservationOnUnownedLUNs) {
    this.allowReservationOnUnownedLUNs = allowReservationOnUnownedLUNs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value determines the controller response to Reservation/Release commands that are received for LUNs that are not owned by the controller.")
  @JsonProperty("allowReservationOnUnownedLUNs")
  public Boolean getAllowReservationOnUnownedLUNs() {
    return allowReservationOnUnownedLUNs;
  }
  
  public void setAllowReservationOnUnownedLUNs(Boolean allowReservationOnUnownedLUNs) {
    this.allowReservationOnUnownedLUNs = allowReservationOnUnownedLUNs;
  }

  
  /**
   * Set to true if the WWN is in the standard inquiry data.
   **/
  public HostSpecificValues worldWideNameInStandardInquiry(Boolean worldWideNameInStandardInquiry) {
    this.worldWideNameInStandardInquiry = worldWideNameInStandardInquiry;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set to true if the WWN is in the standard inquiry data.")
  @JsonProperty("worldWideNameInStandardInquiry")
  public Boolean getWorldWideNameInStandardInquiry() {
    return worldWideNameInStandardInquiry;
  }
  
  public void setWorldWideNameInStandardInquiry(Boolean worldWideNameInStandardInquiry) {
    this.worldWideNameInStandardInquiry = worldWideNameInStandardInquiry;
  }

  
  /**
   * This value determines whether the controller will propagate a Host Bus Reset/Target Reset/Logical Unit Reset to the other controller in a dual controller subsystem to support Microsoft Clustering Services.
   **/
  public HostSpecificValues propagateHostBusResets(Boolean propagateHostBusResets) {
    this.propagateHostBusResets = propagateHostBusResets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value determines whether the controller will propagate a Host Bus Reset/Target Reset/Logical Unit Reset to the other controller in a dual controller subsystem to support Microsoft Clustering Services.")
  @JsonProperty("propagateHostBusResets")
  public Boolean getPropagateHostBusResets() {
    return propagateHostBusResets;
  }
  
  public void setPropagateHostBusResets(Boolean propagateHostBusResets) {
    this.propagateHostBusResets = propagateHostBusResets;
  }

  
  /**
   * Report SCC Device Enable.
   **/
  public HostSpecificValues reportSCCDeviceEnable(Boolean reportSCCDeviceEnable) {
    this.reportSCCDeviceEnable = reportSCCDeviceEnable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Report SCC Device Enable.")
  @JsonProperty("reportSCCDeviceEnable")
  public Boolean getReportSCCDeviceEnable() {
    return reportSCCDeviceEnable;
  }
  
  public void setReportSCCDeviceEnable(Boolean reportSCCDeviceEnable) {
    this.reportSCCDeviceEnable = reportSCCDeviceEnable;
  }

  
  /**
   * Conditional Fibre Channel Logout.
   **/
  public HostSpecificValues conditionalFCLogout(Boolean conditionalFCLogout) {
    this.conditionalFCLogout = conditionalFCLogout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Conditional Fibre Channel Logout.")
  @JsonProperty("conditionalFCLogout")
  public Boolean getConditionalFCLogout() {
    return conditionalFCLogout;
  }
  
  public void setConditionalFCLogout(Boolean conditionalFCLogout) {
    this.conditionalFCLogout = conditionalFCLogout;
  }

  
  /**
   * Report SCSI-2 Through Fibre Channel Host Interface.
   **/
  public HostSpecificValues forceSCSI2(Boolean forceSCSI2) {
    this.forceSCSI2 = forceSCSI2;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Report SCSI-2 Through Fibre Channel Host Interface.")
  @JsonProperty("forceSCSI2")
  public Boolean getForceSCSI2() {
    return forceSCSI2;
  }
  
  public void setForceSCSI2(Boolean forceSCSI2) {
    this.forceSCSI2 = forceSCSI2;
  }

  
  /**
   * This value determines the LUN data returned by the Report LUNs command.
   **/
  public HostSpecificValues reportUnconfiguredLUNs(Boolean reportUnconfiguredLUNs) {
    this.reportUnconfiguredLUNs = reportUnconfiguredLUNs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value determines the LUN data returned by the Report LUNs command.")
  @JsonProperty("reportUnconfiguredLUNs")
  public Boolean getReportUnconfiguredLUNs() {
    return reportUnconfiguredLUNs;
  }
  
  public void setReportUnconfiguredLUNs(Boolean reportUnconfiguredLUNs) {
    this.reportUnconfiguredLUNs = reportUnconfiguredLUNs;
  }

  
  /**
   * Ignore Cache Sync Command.
   **/
  public HostSpecificValues ignoreSyncCache(Boolean ignoreSyncCache) {
    this.ignoreSyncCache = ignoreSyncCache;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Ignore Cache Sync Command.")
  @JsonProperty("ignoreSyncCache")
  public Boolean getIgnoreSyncCache() {
    return ignoreSyncCache;
  }
  
  public void setIgnoreSyncCache(Boolean ignoreSyncCache) {
    this.ignoreSyncCache = ignoreSyncCache;
  }

  
  /**
   * Ignore UTM LUN Ownership.
   **/
  public HostSpecificValues ignoreUTMLunOwnership(Boolean ignoreUTMLunOwnership) {
    this.ignoreUTMLunOwnership = ignoreUTMLunOwnership;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Ignore UTM LUN Ownership.")
  @JsonProperty("ignoreUTMLunOwnership")
  public Boolean getIgnoreUTMLunOwnership() {
    return ignoreUTMLunOwnership;
  }
  
  public void setIgnoreUTMLunOwnership(Boolean ignoreUTMLunOwnership) {
    this.ignoreUTMLunOwnership = ignoreUTMLunOwnership;
  }

  
  /**
   * Report LUN Preferred Path in Standard Inquiry Data.
   **/
  public HostSpecificValues reportLUNPreferredPathInStandardInquiry(Boolean reportLUNPreferredPathInStandardInquiry) {
    this.reportLUNPreferredPathInStandardInquiry = reportLUNPreferredPathInStandardInquiry;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Report LUN Preferred Path in Standard Inquiry Data.")
  @JsonProperty("reportLUNPreferredPathInStandardInquiry")
  public Boolean getReportLUNPreferredPathInStandardInquiry() {
    return reportLUNPreferredPathInStandardInquiry;
  }
  
  public void setReportLUNPreferredPathInStandardInquiry(Boolean reportLUNPreferredPathInStandardInquiry) {
    this.reportLUNPreferredPathInStandardInquiry = reportLUNPreferredPathInStandardInquiry;
  }

  
  /**
   * Auto Volume Transfer.
   **/
  public HostSpecificValues autoLUNTransfer(Boolean autoLUNTransfer) {
    this.autoLUNTransfer = autoLUNTransfer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Auto Volume Transfer.")
  @JsonProperty("autoLUNTransfer")
  public Boolean getAutoLUNTransfer() {
    return autoLUNTransfer;
  }
  
  public void setAutoLUNTransfer(Boolean autoLUNTransfer) {
    this.autoLUNTransfer = autoLUNTransfer;
  }

  
  /**
   * The value returned in the Inquiry Device Type Field when an unconfigured LUN is accessed.
   **/
  public HostSpecificValues inquiryUnconfiguredDeviceType(String inquiryUnconfiguredDeviceType) {
    this.inquiryUnconfiguredDeviceType = inquiryUnconfiguredDeviceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value returned in the Inquiry Device Type Field when an unconfigured LUN is accessed.")
  @JsonProperty("inquiryUnconfiguredDeviceType")
  public String getInquiryUnconfiguredDeviceType() {
    return inquiryUnconfiguredDeviceType;
  }
  
  public void setInquiryUnconfiguredDeviceType(String inquiryUnconfiguredDeviceType) {
    this.inquiryUnconfiguredDeviceType = inquiryUnconfiguredDeviceType;
  }

  
  /**
   * This value is used to define the device type the controller should return in the first byte of the Inquiry data, if the addressed logical unit is not owned by the addressed controller.
   **/
  public HostSpecificValues inquiryUnownedDeviceType(String inquiryUnownedDeviceType) {
    this.inquiryUnownedDeviceType = inquiryUnownedDeviceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value is used to define the device type the controller should return in the first byte of the Inquiry data, if the addressed logical unit is not owned by the addressed controller.")
  @JsonProperty("inquiryUnownedDeviceType")
  public String getInquiryUnownedDeviceType() {
    return inquiryUnownedDeviceType;
  }
  
  public void setInquiryUnownedDeviceType(String inquiryUnownedDeviceType) {
    this.inquiryUnownedDeviceType = inquiryUnownedDeviceType;
  }

  
  /**
   * This value is used to define how the controller handles a read request to Block 0 of an unowned volume. When this is enabled, the non-owning controller sends a request for the block 0 data to the owning controller and the owning controller sends the requested block 0 data back to the non-owning controller. If disabled, the controller will do a volume transfer (if AVT is enabled) and then a read of the now owned volume.
   **/
  public HostSpecificValues unownedBlock0Read(String unownedBlock0Read) {
    this.unownedBlock0Read = unownedBlock0Read;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value is used to define how the controller handles a read request to Block 0 of an unowned volume. When this is enabled, the non-owning controller sends a request for the block 0 data to the owning controller and the owning controller sends the requested block 0 data back to the non-owning controller. If disabled, the controller will do a volume transfer (if AVT is enabled) and then a read of the now owned volume.")
  @JsonProperty("unownedBlock0Read")
  public String getUnownedBlock0Read() {
    return unownedBlock0Read;
  }
  
  public void setUnownedBlock0Read(String unownedBlock0Read) {
    this.unownedBlock0Read = unownedBlock0Read;
  }

  
  /**
   * This field is deprecated.
   **/
  public HostSpecificValues retainLogins(Boolean retainLogins) {
    this.retainLogins = retainLogins;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is deprecated.")
  @JsonProperty("retainLogins")
  public Boolean getRetainLogins() {
    return retainLogins;
  }
  
  public void setRetainLogins(Boolean retainLogins) {
    this.retainLogins = retainLogins;
  }

  
  /**
   * The host type.
   **/
  public HostSpecificValues hostPortType(String hostPortType) {
    this.hostPortType = hostPortType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host type.")
  @JsonProperty("hostPortType")
  public String getHostPortType() {
    return hostPortType;
  }
  
  public void setHostPortType(String hostPortType) {
    this.hostPortType = hostPortType;
  }

  
  /**
   * Maximum number of LUNs allowed for host type.
   **/
  public HostSpecificValues maxRestrictedLUNs(Integer maxRestrictedLUNs) {
    this.maxRestrictedLUNs = maxRestrictedLUNs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum number of LUNs allowed for host type.")
  @JsonProperty("maxRestrictedLUNs")
  public Integer getMaxRestrictedLUNs() {
    return maxRestrictedLUNs;
  }
  
  public void setMaxRestrictedLUNs(Integer maxRestrictedLUNs) {
    this.maxRestrictedLUNs = maxRestrictedLUNs;
  }

  
  /**
   **/
  public HostSpecificValues reserved1(String reserved1) {
    this.reserved1 = reserved1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserved1")
  public String getReserved1() {
    return reserved1;
  }
  
  public void setReserved1(String reserved1) {
    this.reserved1 = reserved1;
  }

  
  /**
   * Enable the AVT exclusion extents for this heterogeneous host region.
   **/
  public HostSpecificValues avtExclusionExtentsEnabled(Boolean avtExclusionExtentsEnabled) {
    this.avtExclusionExtentsEnabled = avtExclusionExtentsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Enable the AVT exclusion extents for this heterogeneous host region.")
  @JsonProperty("avtExclusionExtentsEnabled")
  public Boolean getAvtExclusionExtentsEnabled() {
    return avtExclusionExtentsEnabled;
  }
  
  public void setAvtExclusionExtentsEnabled(Boolean avtExclusionExtentsEnabled) {
    this.avtExclusionExtentsEnabled = avtExclusionExtentsEnabled;
  }

  
  /**
   * If true, then volume-off-preferred events are not considered critical.
   **/
  public HostSpecificValues suppressVolOffPreferredPathAlert(Boolean suppressVolOffPreferredPathAlert) {
    this.suppressVolOffPreferredPathAlert = suppressVolOffPreferredPathAlert;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, then volume-off-preferred events are not considered critical.")
  @JsonProperty("suppressVolOffPreferredPathAlert")
  public Boolean getSuppressVolOffPreferredPathAlert() {
    return suppressVolOffPreferredPathAlert;
  }
  
  public void setSuppressVolOffPreferredPathAlert(Boolean suppressVolOffPreferredPathAlert) {
    this.suppressVolOffPreferredPathAlert = suppressVolOffPreferredPathAlert;
  }

  
  /**
   * The host type string. A zero-length string is allowed and indicates that the associated host-specific NVSRAM region has been cleared. This field should be used in place of the deprecated hostPortType field.
   **/
  public HostSpecificValues hostType(String hostType) {
    this.hostType = hostType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The host type string. A zero-length string is allowed and indicates that the associated host-specific NVSRAM region has been cleared. This field should be used in place of the deprecated hostPortType field.")
  @JsonProperty("hostType")
  public String getHostType() {
    return hostType;
  }
  
  public void setHostType(String hostType) {
    this.hostType = hostType;
  }

  
  /**
   * This field is set to true if Target Port Group Support is provided; otherwise it is false.
   **/
  public HostSpecificValues tpgsSupported(Boolean tpgsSupported) {
    this.tpgsSupported = tpgsSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is set to true if Target Port Group Support is provided; otherwise it is false.")
  @JsonProperty("tpgsSupported")
  public Boolean getTpgsSupported() {
    return tpgsSupported;
  }
  
  public void setTpgsSupported(Boolean tpgsSupported) {
    this.tpgsSupported = tpgsSupported;
  }

  
  /**
   * If true, a format unit request will interrupt any in-progress IAF and start a write-zeros initialization. If false, the format unit will be returned with no action.
   **/
  public HostSpecificValues volumeFormatOptions(Boolean volumeFormatOptions) {
    this.volumeFormatOptions = volumeFormatOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, a format unit request will interrupt any in-progress IAF and start a write-zeros initialization. If false, the format unit will be returned with no action.")
  @JsonProperty("volumeFormatOptions")
  public Boolean getVolumeFormatOptions() {
    return volumeFormatOptions;
  }
  
  public void setVolumeFormatOptions(Boolean volumeFormatOptions) {
    this.volumeFormatOptions = volumeFormatOptions;
  }

  
  /**
   * If true, LUN 0 is restricted and volume mapping to LUN 0 will not be allowed or be reported in the REPORT LUNS data. If false, a volume-to-LUN mapping can be created to LUN 0 and will be reported in a REPORT LUNS response.
   **/
  public HostSpecificValues restrictedLun0(Boolean restrictedLun0) {
    this.restrictedLun0 = restrictedLun0;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, LUN 0 is restricted and volume mapping to LUN 0 will not be allowed or be reported in the REPORT LUNS data. If false, a volume-to-LUN mapping can be created to LUN 0 and will be reported in a REPORT LUNS response.")
  @JsonProperty("restrictedLun0")
  public Boolean getRestrictedLun0() {
    return restrictedLun0;
  }
  
  public void setRestrictedLun0(Boolean restrictedLun0) {
    this.restrictedLun0 = restrictedLun0;
  }

  
  /**
   * The quiescence timeout is the amount of time the controller should wait to achieve a \"no I/Os active\" state before invoking a forced transfer of LUN ownership. When this field is set to true, the timeout parameter provided by the host initiator in a mode select Page 2C will be used. When this field is set to false, the timeout value applied will be calculated by the controller.
   **/
  public HostSpecificValues usePage2CQuiescenceTimeout(Boolean usePage2CQuiescenceTimeout) {
    this.usePage2CQuiescenceTimeout = usePage2CQuiescenceTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The quiescence timeout is the amount of time the controller should wait to achieve a \"no I/Os active\" state before invoking a forced transfer of LUN ownership. When this field is set to true, the timeout parameter provided by the host initiator in a mode select Page 2C will be used. When this field is set to false, the timeout value applied will be calculated by the controller.")
  @JsonProperty("usePage2CQuiescenceTimeout")
  public Boolean getUsePage2CQuiescenceTimeout() {
    return usePage2CQuiescenceTimeout;
  }
  
  public void setUsePage2CQuiescenceTimeout(Boolean usePage2CQuiescenceTimeout) {
    this.usePage2CQuiescenceTimeout = usePage2CQuiescenceTimeout;
  }

  
  /**
   * If true, Asymmetric Logical Unit Access is enabled.
   **/
  public HostSpecificValues asymmetricLUAccess(Boolean asymmetricLUAccess) {
    this.asymmetricLUAccess = asymmetricLUAccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, Asymmetric Logical Unit Access is enabled.")
  @JsonProperty("asymmetricLUAccess")
  public Boolean getAsymmetricLUAccess() {
    return asymmetricLUAccess;
  }
  
  public void setAsymmetricLUAccess(Boolean asymmetricLUAccess) {
    this.asymmetricLUAccess = asymmetricLUAccess;
  }

  
  /**
   * If true, the array iSCSI target driver will not use the session identifier as part of its internal I_T Nexus identifiers. This reduces churn in I_T Nexus identifiers if the initiator does not re-use iSCSI session identifiers when re-opening a session.
   **/
  public HostSpecificValues ignoreISCSISessionIDInITN(Boolean ignoreISCSISessionIDInITN) {
    this.ignoreISCSISessionIDInITN = ignoreISCSISessionIDInITN;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the array iSCSI target driver will not use the session identifier as part of its internal I_T Nexus identifiers. This reduces churn in I_T Nexus identifiers if the initiator does not re-use iSCSI session identifiers when re-opening a session.")
  @JsonProperty("ignoreISCSISessionIDInITN")
  public Boolean getIgnoreISCSISessionIDInITN() {
    return ignoreISCSISessionIDInITN;
  }
  
  public void setIgnoreISCSISessionIDInITN(Boolean ignoreISCSISessionIDInITN) {
    this.ignoreISCSISessionIDInITN = ignoreISCSISessionIDInITN;
  }

  
  /**
   * If true, array may return multiple CHECK CONDITION responses simultaneously on a given logical unit.
   **/
  public HostSpecificValues enableLUCheckConditionParallelResponses(Boolean enableLUCheckConditionParallelResponses) {
    this.enableLUCheckConditionParallelResponses = enableLUCheckConditionParallelResponses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, array may return multiple CHECK CONDITION responses simultaneously on a given logical unit.")
  @JsonProperty("enableLUCheckConditionParallelResponses")
  public Boolean getEnableLUCheckConditionParallelResponses() {
    return enableLUCheckConditionParallelResponses;
  }
  
  public void setEnableLUCheckConditionParallelResponses(Boolean enableLUCheckConditionParallelResponses) {
    this.enableLUCheckConditionParallelResponses = enableLUCheckConditionParallelResponses;
  }

  
  /**
   * If true, the standard INQUIRY data reporting TPGS support to the initiator will only indicate support for implicit mode (providing TPGS support is enabled, see tpgsSupported field).
   **/
  public HostSpecificValues disableExplicitTPGS(Boolean disableExplicitTPGS) {
    this.disableExplicitTPGS = disableExplicitTPGS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the standard INQUIRY data reporting TPGS support to the initiator will only indicate support for implicit mode (providing TPGS support is enabled, see tpgsSupported field).")
  @JsonProperty("disableExplicitTPGS")
  public Boolean getDisableExplicitTPGS() {
    return disableExplicitTPGS;
  }
  
  public void setDisableExplicitTPGS(Boolean disableExplicitTPGS) {
    this.disableExplicitTPGS = disableExplicitTPGS;
  }

  
  /**
   * If true, controller will return a LUN NOT OWNED (05h/94h/01h) CHECK CONDITION when unable to handle I/O during firmware activation.
   **/
  public HostSpecificValues unownedCheckConditionDuringFWActivation(Boolean unownedCheckConditionDuringFWActivation) {
    this.unownedCheckConditionDuringFWActivation = unownedCheckConditionDuringFWActivation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, controller will return a LUN NOT OWNED (05h/94h/01h) CHECK CONDITION when unable to handle I/O during firmware activation.")
  @JsonProperty("unownedCheckConditionDuringFWActivation")
  public Boolean getUnownedCheckConditionDuringFWActivation() {
    return unownedCheckConditionDuringFWActivation;
  }
  
  public void setUnownedCheckConditionDuringFWActivation(Boolean unownedCheckConditionDuringFWActivation) {
    this.unownedCheckConditionDuringFWActivation = unownedCheckConditionDuringFWActivation;
  }

  
  /**
   * If true, the controller will suppress reporting the preferred owner in REPORT TARGET PORT GROUPS or INQUIRY VPD data in conditions when the preferred controller cannot process I/O.
   **/
  public HostSpecificValues allowPreferredOwnerReportingSuppression(Boolean allowPreferredOwnerReportingSuppression) {
    this.allowPreferredOwnerReportingSuppression = allowPreferredOwnerReportingSuppression;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the controller will suppress reporting the preferred owner in REPORT TARGET PORT GROUPS or INQUIRY VPD data in conditions when the preferred controller cannot process I/O.")
  @JsonProperty("allowPreferredOwnerReportingSuppression")
  public Boolean getAllowPreferredOwnerReportingSuppression() {
    return allowPreferredOwnerReportingSuppression;
  }
  
  public void setAllowPreferredOwnerReportingSuppression(Boolean allowPreferredOwnerReportingSuppression) {
    this.allowPreferredOwnerReportingSuppression = allowPreferredOwnerReportingSuppression;
  }

  
  /**
   * If true, controller initiates fail-back of volumes to the preferred owner .
   **/
  public HostSpecificValues enableTargetFailback(Boolean enableTargetFailback) {
    this.enableTargetFailback = enableTargetFailback;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, controller initiates fail-back of volumes to the preferred owner .")
  @JsonProperty("enableTargetFailback")
  public Boolean getEnableTargetFailback() {
    return enableTargetFailback;
  }
  
  public void setEnableTargetFailback(Boolean enableTargetFailback) {
    this.enableTargetFailback = enableTargetFailback;
  }

  
  /**
   * If true, the controller may issue volume ownership changes to balance IO load between controllers.
   **/
  public HostSpecificValues enableAutoLoadBalance(Boolean enableAutoLoadBalance) {
    this.enableAutoLoadBalance = enableAutoLoadBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If true, the controller may issue volume ownership changes to balance IO load between controllers.")
  @JsonProperty("enableAutoLoadBalance")
  public Boolean getEnableAutoLoadBalance() {
    return enableAutoLoadBalance;
  }
  
  public void setEnableAutoLoadBalance(Boolean enableAutoLoadBalance) {
    this.enableAutoLoadBalance = enableAutoLoadBalance;
  }

  
  /**
   * Sense Key returned to host for Quiescence In Progress Check Conditions.
   **/
  public HostSpecificValues quiescenceInProgressSenseKey(Integer quiescenceInProgressSenseKey) {
    this.quiescenceInProgressSenseKey = quiescenceInProgressSenseKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sense Key returned to host for Quiescence In Progress Check Conditions.")
  @JsonProperty("quiescenceInProgressSenseKey")
  public Integer getQuiescenceInProgressSenseKey() {
    return quiescenceInProgressSenseKey;
  }
  
  public void setQuiescenceInProgressSenseKey(Integer quiescenceInProgressSenseKey) {
    this.quiescenceInProgressSenseKey = quiescenceInProgressSenseKey;
  }

  
  /**
   * Additional Sense Code returned to host for Quiescence In Progress Check Conditions.
   **/
  public HostSpecificValues quiescenceInProgressASC(Integer quiescenceInProgressASC) {
    this.quiescenceInProgressASC = quiescenceInProgressASC;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Additional Sense Code returned to host for Quiescence In Progress Check Conditions.")
  @JsonProperty("quiescenceInProgressASC")
  public Integer getQuiescenceInProgressASC() {
    return quiescenceInProgressASC;
  }
  
  public void setQuiescenceInProgressASC(Integer quiescenceInProgressASC) {
    this.quiescenceInProgressASC = quiescenceInProgressASC;
  }

  
  /**
   * Additional Sense Code Qualifier returned to host for Quiscence In Progress Check Conditions.
   **/
  public HostSpecificValues quiescenceInProgressASCQ(Integer quiescenceInProgressASCQ) {
    this.quiescenceInProgressASCQ = quiescenceInProgressASCQ;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Additional Sense Code Qualifier returned to host for Quiscence In Progress Check Conditions.")
  @JsonProperty("quiescenceInProgressASCQ")
  public Integer getQuiescenceInProgressASCQ() {
    return quiescenceInProgressASCQ;
  }
  
  public void setQuiescenceInProgressASCQ(Integer quiescenceInProgressASCQ) {
    this.quiescenceInProgressASCQ = quiescenceInProgressASCQ;
  }

  
  /**
   * Unique identifier for this specific host type. This value is stored in the controller configuration database when persisting Host objects in order to uniquely identify this specific host type across all NVSRAM builds.
   **/
  public HostSpecificValues persistentID(Integer persistentID) {
    this.persistentID = persistentID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for this specific host type. This value is stored in the controller configuration database when persisting Host objects in order to uniquely identify this specific host type across all NVSRAM builds.")
  @JsonProperty("persistentID")
  public Integer getPersistentID() {
    return persistentID;
  }
  
  public void setPersistentID(Integer persistentID) {
    this.persistentID = persistentID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostSpecificValues hostSpecificValues = (HostSpecificValues) o;
    return Objects.equals(this.waitForDownload, hostSpecificValues.waitForDownload) &&
        Objects.equals(this.notReadySenseForQuiescenceInProgress, hostSpecificValues.notReadySenseForQuiescenceInProgress) &&
        Objects.equals(this.notReadySenseForQuiescenceInProgress2, hostSpecificValues.notReadySenseForQuiescenceInProgress2) &&
        Objects.equals(this.checkConditionForVendorUniqueUAConditions, hostSpecificValues.checkConditionForVendorUniqueUAConditions) &&
        Objects.equals(this.reportDeferredErrors, hostSpecificValues.reportDeferredErrors) &&
        Objects.equals(this.ignoreForceUnitAccess, hostSpecificValues.ignoreForceUnitAccess) &&
        Objects.equals(this.ignoreWriteCacheDisable, hostSpecificValues.ignoreWriteCacheDisable) &&
        Objects.equals(this.allowReservationOnUnownedLUNs, hostSpecificValues.allowReservationOnUnownedLUNs) &&
        Objects.equals(this.worldWideNameInStandardInquiry, hostSpecificValues.worldWideNameInStandardInquiry) &&
        Objects.equals(this.propagateHostBusResets, hostSpecificValues.propagateHostBusResets) &&
        Objects.equals(this.reportSCCDeviceEnable, hostSpecificValues.reportSCCDeviceEnable) &&
        Objects.equals(this.conditionalFCLogout, hostSpecificValues.conditionalFCLogout) &&
        Objects.equals(this.forceSCSI2, hostSpecificValues.forceSCSI2) &&
        Objects.equals(this.reportUnconfiguredLUNs, hostSpecificValues.reportUnconfiguredLUNs) &&
        Objects.equals(this.ignoreSyncCache, hostSpecificValues.ignoreSyncCache) &&
        Objects.equals(this.ignoreUTMLunOwnership, hostSpecificValues.ignoreUTMLunOwnership) &&
        Objects.equals(this.reportLUNPreferredPathInStandardInquiry, hostSpecificValues.reportLUNPreferredPathInStandardInquiry) &&
        Objects.equals(this.autoLUNTransfer, hostSpecificValues.autoLUNTransfer) &&
        Objects.equals(this.inquiryUnconfiguredDeviceType, hostSpecificValues.inquiryUnconfiguredDeviceType) &&
        Objects.equals(this.inquiryUnownedDeviceType, hostSpecificValues.inquiryUnownedDeviceType) &&
        Objects.equals(this.unownedBlock0Read, hostSpecificValues.unownedBlock0Read) &&
        Objects.equals(this.retainLogins, hostSpecificValues.retainLogins) &&
        Objects.equals(this.hostPortType, hostSpecificValues.hostPortType) &&
        Objects.equals(this.maxRestrictedLUNs, hostSpecificValues.maxRestrictedLUNs) &&
        Objects.equals(this.reserved1, hostSpecificValues.reserved1) &&
        Objects.equals(this.avtExclusionExtentsEnabled, hostSpecificValues.avtExclusionExtentsEnabled) &&
        Objects.equals(this.suppressVolOffPreferredPathAlert, hostSpecificValues.suppressVolOffPreferredPathAlert) &&
        Objects.equals(this.hostType, hostSpecificValues.hostType) &&
        Objects.equals(this.tpgsSupported, hostSpecificValues.tpgsSupported) &&
        Objects.equals(this.volumeFormatOptions, hostSpecificValues.volumeFormatOptions) &&
        Objects.equals(this.restrictedLun0, hostSpecificValues.restrictedLun0) &&
        Objects.equals(this.usePage2CQuiescenceTimeout, hostSpecificValues.usePage2CQuiescenceTimeout) &&
        Objects.equals(this.asymmetricLUAccess, hostSpecificValues.asymmetricLUAccess) &&
        Objects.equals(this.ignoreISCSISessionIDInITN, hostSpecificValues.ignoreISCSISessionIDInITN) &&
        Objects.equals(this.enableLUCheckConditionParallelResponses, hostSpecificValues.enableLUCheckConditionParallelResponses) &&
        Objects.equals(this.disableExplicitTPGS, hostSpecificValues.disableExplicitTPGS) &&
        Objects.equals(this.unownedCheckConditionDuringFWActivation, hostSpecificValues.unownedCheckConditionDuringFWActivation) &&
        Objects.equals(this.allowPreferredOwnerReportingSuppression, hostSpecificValues.allowPreferredOwnerReportingSuppression) &&
        Objects.equals(this.enableTargetFailback, hostSpecificValues.enableTargetFailback) &&
        Objects.equals(this.enableAutoLoadBalance, hostSpecificValues.enableAutoLoadBalance) &&
        Objects.equals(this.quiescenceInProgressSenseKey, hostSpecificValues.quiescenceInProgressSenseKey) &&
        Objects.equals(this.quiescenceInProgressASC, hostSpecificValues.quiescenceInProgressASC) &&
        Objects.equals(this.quiescenceInProgressASCQ, hostSpecificValues.quiescenceInProgressASCQ) &&
        Objects.equals(this.persistentID, hostSpecificValues.persistentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waitForDownload, notReadySenseForQuiescenceInProgress, notReadySenseForQuiescenceInProgress2, checkConditionForVendorUniqueUAConditions, reportDeferredErrors, ignoreForceUnitAccess, ignoreWriteCacheDisable, allowReservationOnUnownedLUNs, worldWideNameInStandardInquiry, propagateHostBusResets, reportSCCDeviceEnable, conditionalFCLogout, forceSCSI2, reportUnconfiguredLUNs, ignoreSyncCache, ignoreUTMLunOwnership, reportLUNPreferredPathInStandardInquiry, autoLUNTransfer, inquiryUnconfiguredDeviceType, inquiryUnownedDeviceType, unownedBlock0Read, retainLogins, hostPortType, maxRestrictedLUNs, reserved1, avtExclusionExtentsEnabled, suppressVolOffPreferredPathAlert, hostType, tpgsSupported, volumeFormatOptions, restrictedLun0, usePage2CQuiescenceTimeout, asymmetricLUAccess, ignoreISCSISessionIDInITN, enableLUCheckConditionParallelResponses, disableExplicitTPGS, unownedCheckConditionDuringFWActivation, allowPreferredOwnerReportingSuppression, enableTargetFailback, enableAutoLoadBalance, quiescenceInProgressSenseKey, quiescenceInProgressASC, quiescenceInProgressASCQ, persistentID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostSpecificValues {\n");
    
    sb.append("    waitForDownload: ").append(toIndentedString(waitForDownload)).append("\n");
    sb.append("    notReadySenseForQuiescenceInProgress: ").append(toIndentedString(notReadySenseForQuiescenceInProgress)).append("\n");
    sb.append("    notReadySenseForQuiescenceInProgress2: ").append(toIndentedString(notReadySenseForQuiescenceInProgress2)).append("\n");
    sb.append("    checkConditionForVendorUniqueUAConditions: ").append(toIndentedString(checkConditionForVendorUniqueUAConditions)).append("\n");
    sb.append("    reportDeferredErrors: ").append(toIndentedString(reportDeferredErrors)).append("\n");
    sb.append("    ignoreForceUnitAccess: ").append(toIndentedString(ignoreForceUnitAccess)).append("\n");
    sb.append("    ignoreWriteCacheDisable: ").append(toIndentedString(ignoreWriteCacheDisable)).append("\n");
    sb.append("    allowReservationOnUnownedLUNs: ").append(toIndentedString(allowReservationOnUnownedLUNs)).append("\n");
    sb.append("    worldWideNameInStandardInquiry: ").append(toIndentedString(worldWideNameInStandardInquiry)).append("\n");
    sb.append("    propagateHostBusResets: ").append(toIndentedString(propagateHostBusResets)).append("\n");
    sb.append("    reportSCCDeviceEnable: ").append(toIndentedString(reportSCCDeviceEnable)).append("\n");
    sb.append("    conditionalFCLogout: ").append(toIndentedString(conditionalFCLogout)).append("\n");
    sb.append("    forceSCSI2: ").append(toIndentedString(forceSCSI2)).append("\n");
    sb.append("    reportUnconfiguredLUNs: ").append(toIndentedString(reportUnconfiguredLUNs)).append("\n");
    sb.append("    ignoreSyncCache: ").append(toIndentedString(ignoreSyncCache)).append("\n");
    sb.append("    ignoreUTMLunOwnership: ").append(toIndentedString(ignoreUTMLunOwnership)).append("\n");
    sb.append("    reportLUNPreferredPathInStandardInquiry: ").append(toIndentedString(reportLUNPreferredPathInStandardInquiry)).append("\n");
    sb.append("    autoLUNTransfer: ").append(toIndentedString(autoLUNTransfer)).append("\n");
    sb.append("    inquiryUnconfiguredDeviceType: ").append(toIndentedString(inquiryUnconfiguredDeviceType)).append("\n");
    sb.append("    inquiryUnownedDeviceType: ").append(toIndentedString(inquiryUnownedDeviceType)).append("\n");
    sb.append("    unownedBlock0Read: ").append(toIndentedString(unownedBlock0Read)).append("\n");
    sb.append("    retainLogins: ").append(toIndentedString(retainLogins)).append("\n");
    sb.append("    hostPortType: ").append(toIndentedString(hostPortType)).append("\n");
    sb.append("    maxRestrictedLUNs: ").append(toIndentedString(maxRestrictedLUNs)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    avtExclusionExtentsEnabled: ").append(toIndentedString(avtExclusionExtentsEnabled)).append("\n");
    sb.append("    suppressVolOffPreferredPathAlert: ").append(toIndentedString(suppressVolOffPreferredPathAlert)).append("\n");
    sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
    sb.append("    tpgsSupported: ").append(toIndentedString(tpgsSupported)).append("\n");
    sb.append("    volumeFormatOptions: ").append(toIndentedString(volumeFormatOptions)).append("\n");
    sb.append("    restrictedLun0: ").append(toIndentedString(restrictedLun0)).append("\n");
    sb.append("    usePage2CQuiescenceTimeout: ").append(toIndentedString(usePage2CQuiescenceTimeout)).append("\n");
    sb.append("    asymmetricLUAccess: ").append(toIndentedString(asymmetricLUAccess)).append("\n");
    sb.append("    ignoreISCSISessionIDInITN: ").append(toIndentedString(ignoreISCSISessionIDInITN)).append("\n");
    sb.append("    enableLUCheckConditionParallelResponses: ").append(toIndentedString(enableLUCheckConditionParallelResponses)).append("\n");
    sb.append("    disableExplicitTPGS: ").append(toIndentedString(disableExplicitTPGS)).append("\n");
    sb.append("    unownedCheckConditionDuringFWActivation: ").append(toIndentedString(unownedCheckConditionDuringFWActivation)).append("\n");
    sb.append("    allowPreferredOwnerReportingSuppression: ").append(toIndentedString(allowPreferredOwnerReportingSuppression)).append("\n");
    sb.append("    enableTargetFailback: ").append(toIndentedString(enableTargetFailback)).append("\n");
    sb.append("    enableAutoLoadBalance: ").append(toIndentedString(enableAutoLoadBalance)).append("\n");
    sb.append("    quiescenceInProgressSenseKey: ").append(toIndentedString(quiescenceInProgressSenseKey)).append("\n");
    sb.append("    quiescenceInProgressASC: ").append(toIndentedString(quiescenceInProgressASC)).append("\n");
    sb.append("    quiescenceInProgressASCQ: ").append(toIndentedString(quiescenceInProgressASCQ)).append("\n");
    sb.append("    persistentID: ").append(toIndentedString(persistentID)).append("\n");
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

