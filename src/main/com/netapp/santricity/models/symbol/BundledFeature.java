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
 * BundledFeature
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class BundledFeature   {
  

  /**
   * This field indicate what feature this instance of BundledFeature represents.
   */
  public enum FeatureIdEnum {
    volumesPerPartition("volumesPerPartition"),
    totalNumberOfVolumes("totalNumberOfVolumes"),
    storagePartitions("storagePartitions"),
    snapshot("snapshot"),
    volumeCopy("volumeCopy"),
    remoteMirroring("remoteMirroring"),
    driveTrayExpansion("driveTrayExpansion"),
    mixedDriveTypes("mixedDriveTypes"),
    mgmtApplication("mgmtApplication"),
    supportedDrives("supportedDrives"),
    supportedDriveTrays("supportedDriveTrays"),
    performanceTier("performanceTier"),
    totalNumberOfSnapshots("totalNumberOfSnapshots"),
    totalNumberOfVolCopies("totalNumberOfVolCopies"),
    goldKey("goldKey"),
    snapshotsPerVolume("snapshotsPerVolume"),
    totalNumberOfMirrors("totalNumberOfMirrors"),
    raid6("raid6"),
    stateCapture("stateCapture"),
    sataStrLen("sataStrLen"),
    secureVolume("secureVolume"),
    protectionInformation("protectionInformation"),
    solidStateDisk("solidStateDisk"),
    driveSlotLimit("driveSlotLimit"),
    fdeProxyKeyManagement("fdeProxyKeyManagement"),
    supportedInterposer("supportedInterposer"),
    vendorSupportedDrives("vendorSupportedDrives"),
    flashReadCache("flashReadCache"),
    totalNumberOfAsyncMirrorGroups("totalNumberOfAsyncMirrorGroups"),
    totalNumberOfAsyncMirrorsPerGroup("totalNumberOfAsyncMirrorsPerGroup"),
    totalNumberOfArvmMirrorsPerArray("totalNumberOfArvmMirrorsPerArray"),
    totalNumberOfPitsPerArray("totalNumberOfPitsPerArray"),
    pitGroupsPerVolume("pitGroupsPerVolume"),
    totalNumberOfPitGroups("totalNumberOfPitGroups"),
    pitsPerPitGroup("pitsPerPitGroup"),
    memberVolsPerPitConsistencyGroup("memberVolsPerPitConsistencyGroup"),
    totalNumberOfPitConsistencyGroups("totalNumberOfPitConsistencyGroups"),
    totalNumberOfPitViews("totalNumberOfPitViews"),
    totalNumberOfThinVolumesPerArray("totalNumberOfThinVolumesPerArray"),
    nativeSataDriveSupport("nativeSataDriveSupport"),
    solidStateDiskLimit("solidStateDiskLimit"),
    totalNumberOfRemoteMirrorsPerArray("totalNumberOfRemoteMirrorsPerArray"),
    asup("asup"),
    ectSelector("ectSelector"),
    embeddedSnmpOid("embeddedSnmpOid"),
    asupOnDemand("asupOnDemand"),
    dacstoreCompatId("dacstoreCompatId"),
    samoaHicProtocol("samoaHicProtocol"),
    targetPortLunMapping("targetPortLunMapping"),
    hildaBaseboardProtocol("hildaBaseboardProtocol"),
    denali2Protocol("denali2Protocol"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FeatureIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FeatureIdEnum featureId;

    private List<FeatureAttribute> featureAttribute;

  
  /**
   * This field indicate what feature this instance of BundledFeature represents.
   **/
  public BundledFeature featureId(FeatureIdEnum featureId) {
    this.featureId = featureId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field indicate what feature this instance of BundledFeature represents.")
  @JsonProperty("featureId")
  public FeatureIdEnum getFeatureId() {
    return featureId;
  }
  
  public void setFeatureId(FeatureIdEnum featureId) {
    this.featureId = featureId;
  }

  
  /**
   * This field is a variable-length array of FeatureAttribute instances representing the attributes that apply for this particular feature.
   **/
  public BundledFeature featureAttribute(List<FeatureAttribute> featureAttribute) {
    this.featureAttribute = featureAttribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field is a variable-length array of FeatureAttribute instances representing the attributes that apply for this particular feature.")
  @JsonProperty("featureAttribute")
  public List<FeatureAttribute> getFeatureAttribute() {
    return featureAttribute;
  }
  
  public void setFeatureAttribute(List<FeatureAttribute> featureAttribute) {
    this.featureAttribute = featureAttribute;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundledFeature bundledFeature = (BundledFeature) o;
    return Objects.equals(this.featureId, bundledFeature.featureId) &&
        Objects.equals(this.featureAttribute, bundledFeature.featureAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureId, featureAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledFeature {\n");
    
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    featureAttribute: ").append(toIndentedString(featureAttribute)).append("\n");
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

