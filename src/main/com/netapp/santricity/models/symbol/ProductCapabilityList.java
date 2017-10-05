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
 * ProductCapabilityList
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ProductCapabilityList   {
  

  /**
   * Gets or Sets productCapabilities
   */
  public enum ProductCapabilitiesEnum {
    capabilityNone("capabilityNone"),
    capabilityCacheBackup("capabilityCacheBackup"),
    capabilityCoreIscsi("capabilityCoreIscsi"),
    capabilityDap520b("capabilityDap520b"),
    capabilityDualPortedSata("capabilityDualPortedSata"),
    capabilityFdeDriveSupport("capabilityFdeDriveSupport"),
    capabilityFieldRepCacheMem("capabilityFieldRepCacheMem"),
    capabilityGbEthMgmtPort("capabilityGbEthMgmtPort"),
    capabilityInfinibandSupport("capabilityInfinibandSupport"),
    capabilityIpv6MgmtPortIpv6("capabilityIpv6MgmtPortIpv6"),
    capabilityIscsiIpv6("capabilityIscsiIpv6"),
    capabilitySasSupport("capabilitySasSupport"),
    capabilitySimplex("capabilitySimplex"),
    capabilitySmartBatteryMgmt("capabilitySmartBatteryMgmt"),
    capabilityCal6141("capabilityCal6141"),
    capabilityCal6334("capabilityCal6334"),
    capabilityCfgDbAdoption("capabilityCfgDbAdoption"),
    capabilityCtrlLockdown("capabilityCtrlLockdown"),
    capabilityCtrlStateCapture("capabilityCtrlStateCapture"),
    capabilityDiagDataCapture("capabilityDiagDataCapture"),
    capabilityDriveDataRelocation("capabilityDriveDataRelocation"),
    capabilityDriveEnclosureMiswires("capabilityDriveEnclosureMiswires"),
    capabilityDriveMgmt("capabilityDriveMgmt"),
    capabilityDriveMixWithinTray("capabilityDriveMixWithinTray"),
    capabilityDrvChannelDiags("capabilityDrvChannelDiags"),
    capabilityFeatureBundles("capabilityFeatureBundles"),
    capabilityHostContextAgent("capabilityHostContextAgent"),
    capabilityImmediateHostTopology("capabilityImmediateHostTopology"),
    capabilityOnlineDrvFwDwnld("capabilityOnlineDrvFwDwnld"),
    capabilityParentRelativeLocation("capabilityParentRelativeLocation"),
    capabilityParentRelativeStatus("capabilityParentRelativeStatus"),
    capabilityPompanoSupport("capabilityPompanoSupport"),
    capabilityRaid6("capabilityRaid6"),
    capabilitySocStatistics("capabilitySocStatistics"),
    capabilitySupportsVirtualization("capabilitySupportsVirtualization"),
    capabilityT10("capabilityT10"),
    capabilityInfusion("capabilityInfusion"),
    capabilityDriveLimitManagement("capabilityDriveLimitManagement"),
    capabilitySfpPlus("capabilitySfpPlus"),
    capabilityIscsi10gbHostCard("capabilityIscsi10gbHostCard"),
    capabilityEnhancedLun0Support("capabilityEnhancedLun0Support"),
    capabilityEnhancedFormatUnitSupport("capabilityEnhancedFormatUnitSupport"),
    capabilityDriveSideTrunkSupport("capabilityDriveSideTrunkSupport"),
    capabilitySsdSupport("capabilitySsdSupport"),
    capabilityBaseControllerDiags("capabilityBaseControllerDiags"),
    capabilityCacheMemoryDiags("capabilityCacheMemoryDiags"),
    capabilityDriveSlotLimit("capabilityDriveSlotLimit"),
    capabilityFdeProxyKeyMgmt("capabilityFdeProxyKeyMgmt"),
    capabilityIosSupport("capabilityIosSupport"),
    capabilityLockout2tbDrives("capabilityLockout2tbDrives"),
    capabilityParentRelativeMel("capabilityParentRelativeMel"),
    capabilityRaid6PrereadRedCheck("capabilityRaid6PrereadRedCheck"),
    capabilitySataDriveLockout("capabilitySataDriveLockout"),
    capabilitySyslogMsgs("capabilitySyslogMsgs"),
    capabilityWembleyEnclosure("capabilityWembleyEnclosure"),
    capabilityCacheBackupDeviceDiags("capabilityCacheBackupDeviceDiags"),
    capabilityHicDiags("capabilityHicDiags"),
    capabilitySetTrayAttributes("capabilitySetTrayAttributes"),
    capabilityIscsiTarget("capabilityIscsiTarget"),
    capabilityIscsiInitiator("capabilityIscsiInitiator"),
    capabilityPsuFirmwareUpdate("capabilityPsuFirmwareUpdate"),
    capabilityDplCoreDump("capabilityDplCoreDump"),
    capabilityDiskPools("capabilityDiskPools"),
    capabilityAsupSupport("capabilityAsupSupport"),
    capabilityEmbeddedSnmpAgent("capabilityEmbeddedSnmpAgent"),
    capabilityFtdcTraceHistory("capabilityFtdcTraceHistory"),
    capabilityAdvancedFormatSupport("capabilityAdvancedFormatSupport"),
    capability4knativeAdvancedFormatSupport("capability4knativeAdvancedFormatSupport"),
    capabilityAsupOnDemandSupport("capabilityAsupOnDemandSupport"),
    capabilityIocDump("capabilityIocDump"),
    capabilityDrivePowerCycle("capabilityDrivePowerCycle"),
    capabilityLowAndHighSampling("capabilityLowAndHighSampling"),
    capabilityAutoLoadBalancing("capabilityAutoLoadBalancing"),
    capabilityWlcLogging("capabilityWlcLogging"),
    capabilityFipsDriveSupport("capabilityFipsDriveSupport"),
    capabilityApplicationAwareness("capabilityApplicationAwareness"),
    capabilityEmbeddedEkms("capabilityEmbeddedEkms"),
    capabilityCacheMirroringProtectionInformation("capabilityCacheMirroringProtectionInformation"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ProductCapabilitiesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<ProductCapabilitiesEnum> productCapabilities;

  
  /**
   * A variable length list of product capabilities.
   **/
  public ProductCapabilityList productCapabilities(List<ProductCapabilitiesEnum> productCapabilities) {
    this.productCapabilities = productCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable length list of product capabilities.")
  @JsonProperty("productCapabilities")
  public List<ProductCapabilitiesEnum> getProductCapabilities() {
    return productCapabilities;
  }
  
  public void setProductCapabilities(List<ProductCapabilitiesEnum> productCapabilities) {
    this.productCapabilities = productCapabilities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCapabilityList productCapabilityList = (ProductCapabilityList) o;
    return Objects.equals(this.productCapabilities, productCapabilityList.productCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCapabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCapabilityList {\n");
    
    sb.append("    productCapabilities: ").append(toIndentedString(productCapabilities)).append("\n");
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

