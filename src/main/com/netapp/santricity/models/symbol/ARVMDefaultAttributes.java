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
 * ARVMDefaultAttributes
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ARVMDefaultAttributes   {
  
    private Long minimumRepositoryCapacityInBytes;

    private Integer maxRepositoryCapacityAsPercentOfMirroredCapacity;

    private Integer defaultRepositoryCapacityAsPercentOfMirroredCapacity;

    private Integer defaultRepositoryUtilizationWarningThreshold;

    private Integer minimumSyncIntervalInMinutes;

    private Integer defaultSyncIntervalInMinutes;

    private Integer defaultSyncCompletionTimeAlertThresholdInMinutes;

    private Integer defaultRecoveryPointAgeAlertThresholdInMinutes;

    private Integer maximumConnectivityTestTimeout;

    private Integer maximumLinkLatencyTestIterations;

    private Integer maximumLinkBandwidthTestIterations;

    private Integer minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity;

    private Integer defaultLinkLatencyTestIterations;

    private Integer defaultLinkBandwidthTestIterations;

    private Integer defaultRecentStatisticsListLength;

    private Integer maxRecentStatisticsListLength;

    private Integer defaultLongestStatisticsListLength;

    private Integer maxLongestStatisticsListLength;

    private Integer defaultErrorStatisticsListLength;

    private Integer maxErrorStatisticsListLength;

    private Integer maxAllowedLinkLatencyInMicroseconds;

  
  /**
   * The minimum repository size (in bytes) for a mirror repository.
   **/
  public ARVMDefaultAttributes minimumRepositoryCapacityInBytes(Long minimumRepositoryCapacityInBytes) {
    this.minimumRepositoryCapacityInBytes = minimumRepositoryCapacityInBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum repository size (in bytes) for a mirror repository.")
  @JsonProperty("minimumRepositoryCapacityInBytes")
  public Long getMinimumRepositoryCapacityInBytes() {
    return minimumRepositoryCapacityInBytes;
  }
  
  public void setMinimumRepositoryCapacityInBytes(Long minimumRepositoryCapacityInBytes) {
    this.minimumRepositoryCapacityInBytes = minimumRepositoryCapacityInBytes;
  }

  
  /**
   * Maximum repository capacity as a percentage of the mirror capacity..
   **/
  public ARVMDefaultAttributes maxRepositoryCapacityAsPercentOfMirroredCapacity(Integer maxRepositoryCapacityAsPercentOfMirroredCapacity) {
    this.maxRepositoryCapacityAsPercentOfMirroredCapacity = maxRepositoryCapacityAsPercentOfMirroredCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum repository capacity as a percentage of the mirror capacity..")
  @JsonProperty("maxRepositoryCapacityAsPercentOfMirroredCapacity")
  public Integer getMaxRepositoryCapacityAsPercentOfMirroredCapacity() {
    return maxRepositoryCapacityAsPercentOfMirroredCapacity;
  }
  
  public void setMaxRepositoryCapacityAsPercentOfMirroredCapacity(Integer maxRepositoryCapacityAsPercentOfMirroredCapacity) {
    this.maxRepositoryCapacityAsPercentOfMirroredCapacity = maxRepositoryCapacityAsPercentOfMirroredCapacity;
  }

  
  /**
   * Default repository capacity as a percentage of the mirror capacity..
   **/
  public ARVMDefaultAttributes defaultRepositoryCapacityAsPercentOfMirroredCapacity(Integer defaultRepositoryCapacityAsPercentOfMirroredCapacity) {
    this.defaultRepositoryCapacityAsPercentOfMirroredCapacity = defaultRepositoryCapacityAsPercentOfMirroredCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default repository capacity as a percentage of the mirror capacity..")
  @JsonProperty("defaultRepositoryCapacityAsPercentOfMirroredCapacity")
  public Integer getDefaultRepositoryCapacityAsPercentOfMirroredCapacity() {
    return defaultRepositoryCapacityAsPercentOfMirroredCapacity;
  }
  
  public void setDefaultRepositoryCapacityAsPercentOfMirroredCapacity(Integer defaultRepositoryCapacityAsPercentOfMirroredCapacity) {
    this.defaultRepositoryCapacityAsPercentOfMirroredCapacity = defaultRepositoryCapacityAsPercentOfMirroredCapacity;
  }

  
  /**
   * Default repository utilization warning threshold percentage.
   **/
  public ARVMDefaultAttributes defaultRepositoryUtilizationWarningThreshold(Integer defaultRepositoryUtilizationWarningThreshold) {
    this.defaultRepositoryUtilizationWarningThreshold = defaultRepositoryUtilizationWarningThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default repository utilization warning threshold percentage.")
  @JsonProperty("defaultRepositoryUtilizationWarningThreshold")
  public Integer getDefaultRepositoryUtilizationWarningThreshold() {
    return defaultRepositoryUtilizationWarningThreshold;
  }
  
  public void setDefaultRepositoryUtilizationWarningThreshold(Integer defaultRepositoryUtilizationWarningThreshold) {
    this.defaultRepositoryUtilizationWarningThreshold = defaultRepositoryUtilizationWarningThreshold;
  }

  
  /**
   * Minimum sync interval in minutes.
   **/
  public ARVMDefaultAttributes minimumSyncIntervalInMinutes(Integer minimumSyncIntervalInMinutes) {
    this.minimumSyncIntervalInMinutes = minimumSyncIntervalInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum sync interval in minutes.")
  @JsonProperty("minimumSyncIntervalInMinutes")
  public Integer getMinimumSyncIntervalInMinutes() {
    return minimumSyncIntervalInMinutes;
  }
  
  public void setMinimumSyncIntervalInMinutes(Integer minimumSyncIntervalInMinutes) {
    this.minimumSyncIntervalInMinutes = minimumSyncIntervalInMinutes;
  }

  
  /**
   * Default sync interval in minutes.
   **/
  public ARVMDefaultAttributes defaultSyncIntervalInMinutes(Integer defaultSyncIntervalInMinutes) {
    this.defaultSyncIntervalInMinutes = defaultSyncIntervalInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default sync interval in minutes.")
  @JsonProperty("defaultSyncIntervalInMinutes")
  public Integer getDefaultSyncIntervalInMinutes() {
    return defaultSyncIntervalInMinutes;
  }
  
  public void setDefaultSyncIntervalInMinutes(Integer defaultSyncIntervalInMinutes) {
    this.defaultSyncIntervalInMinutes = defaultSyncIntervalInMinutes;
  }

  
  /**
   * Default sync completion time alert threshold.
   **/
  public ARVMDefaultAttributes defaultSyncCompletionTimeAlertThresholdInMinutes(Integer defaultSyncCompletionTimeAlertThresholdInMinutes) {
    this.defaultSyncCompletionTimeAlertThresholdInMinutes = defaultSyncCompletionTimeAlertThresholdInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default sync completion time alert threshold.")
  @JsonProperty("defaultSyncCompletionTimeAlertThresholdInMinutes")
  public Integer getDefaultSyncCompletionTimeAlertThresholdInMinutes() {
    return defaultSyncCompletionTimeAlertThresholdInMinutes;
  }
  
  public void setDefaultSyncCompletionTimeAlertThresholdInMinutes(Integer defaultSyncCompletionTimeAlertThresholdInMinutes) {
    this.defaultSyncCompletionTimeAlertThresholdInMinutes = defaultSyncCompletionTimeAlertThresholdInMinutes;
  }

  
  /**
   * Default recovery point age alert threshold.
   **/
  public ARVMDefaultAttributes defaultRecoveryPointAgeAlertThresholdInMinutes(Integer defaultRecoveryPointAgeAlertThresholdInMinutes) {
    this.defaultRecoveryPointAgeAlertThresholdInMinutes = defaultRecoveryPointAgeAlertThresholdInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default recovery point age alert threshold.")
  @JsonProperty("defaultRecoveryPointAgeAlertThresholdInMinutes")
  public Integer getDefaultRecoveryPointAgeAlertThresholdInMinutes() {
    return defaultRecoveryPointAgeAlertThresholdInMinutes;
  }
  
  public void setDefaultRecoveryPointAgeAlertThresholdInMinutes(Integer defaultRecoveryPointAgeAlertThresholdInMinutes) {
    this.defaultRecoveryPointAgeAlertThresholdInMinutes = defaultRecoveryPointAgeAlertThresholdInMinutes;
  }

  
  /**
   * Maximum timeout (in seconds) allowed for AMG connectivity test (specified in AsyncMirrorGroupConnectivityTestDescriptor).
   **/
  public ARVMDefaultAttributes maximumConnectivityTestTimeout(Integer maximumConnectivityTestTimeout) {
    this.maximumConnectivityTestTimeout = maximumConnectivityTestTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum timeout (in seconds) allowed for AMG connectivity test (specified in AsyncMirrorGroupConnectivityTestDescriptor).")
  @JsonProperty("maximumConnectivityTestTimeout")
  public Integer getMaximumConnectivityTestTimeout() {
    return maximumConnectivityTestTimeout;
  }
  
  public void setMaximumConnectivityTestTimeout(Integer maximumConnectivityTestTimeout) {
    this.maximumConnectivityTestTimeout = maximumConnectivityTestTimeout;
  }

  
  /**
   * Maximum number of test iterations allowed for link latency test (specified in AsyncMirrorGroupConnectivityTestDescriptor when AsyncMirrorGroupConnectivityTestType is ASYNC_MIRROR_GROUP_LINK_LATENCY_TEST).
   **/
  public ARVMDefaultAttributes maximumLinkLatencyTestIterations(Integer maximumLinkLatencyTestIterations) {
    this.maximumLinkLatencyTestIterations = maximumLinkLatencyTestIterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum number of test iterations allowed for link latency test (specified in AsyncMirrorGroupConnectivityTestDescriptor when AsyncMirrorGroupConnectivityTestType is ASYNC_MIRROR_GROUP_LINK_LATENCY_TEST).")
  @JsonProperty("maximumLinkLatencyTestIterations")
  public Integer getMaximumLinkLatencyTestIterations() {
    return maximumLinkLatencyTestIterations;
  }
  
  public void setMaximumLinkLatencyTestIterations(Integer maximumLinkLatencyTestIterations) {
    this.maximumLinkLatencyTestIterations = maximumLinkLatencyTestIterations;
  }

  
  /**
   * Maximum number of test iterations allowed for bandwidth test (specified in AsyncMirrorGroupConnectivityTestDescriptor when AsyncMirrorGroupConnectivityTestType is ASYNC_MIRROR_GROUP_LINK_BANDWIDTH_TEST).
   **/
  public ARVMDefaultAttributes maximumLinkBandwidthTestIterations(Integer maximumLinkBandwidthTestIterations) {
    this.maximumLinkBandwidthTestIterations = maximumLinkBandwidthTestIterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum number of test iterations allowed for bandwidth test (specified in AsyncMirrorGroupConnectivityTestDescriptor when AsyncMirrorGroupConnectivityTestType is ASYNC_MIRROR_GROUP_LINK_BANDWIDTH_TEST).")
  @JsonProperty("maximumLinkBandwidthTestIterations")
  public Integer getMaximumLinkBandwidthTestIterations() {
    return maximumLinkBandwidthTestIterations;
  }
  
  public void setMaximumLinkBandwidthTestIterations(Integer maximumLinkBandwidthTestIterations) {
    this.maximumLinkBandwidthTestIterations = maximumLinkBandwidthTestIterations;
  }

  
  /**
   * The minimum repository size as 1/100ths of a percent of mirror capacity.
   **/
  public ARVMDefaultAttributes minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity(Integer minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity) {
    this.minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity = minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum repository size as 1/100ths of a percent of mirror capacity.")
  @JsonProperty("minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity")
  public Integer getMinimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity() {
    return minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity;
  }
  
  public void setMinimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity(Integer minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity) {
    this.minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity = minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity;
  }

  
  /**
   * The default number of test iterations for a link latency test (specified in AsyncMirrorGroupConnectivityTestDesscriptor when AsyncMirrorGroupConnectivityTestType is ASYNC_MIRROR_GROUP_LINK_LATENCY_TEST).
   **/
  public ARVMDefaultAttributes defaultLinkLatencyTestIterations(Integer defaultLinkLatencyTestIterations) {
    this.defaultLinkLatencyTestIterations = defaultLinkLatencyTestIterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The default number of test iterations for a link latency test (specified in AsyncMirrorGroupConnectivityTestDesscriptor when AsyncMirrorGroupConnectivityTestType is ASYNC_MIRROR_GROUP_LINK_LATENCY_TEST).")
  @JsonProperty("defaultLinkLatencyTestIterations")
  public Integer getDefaultLinkLatencyTestIterations() {
    return defaultLinkLatencyTestIterations;
  }
  
  public void setDefaultLinkLatencyTestIterations(Integer defaultLinkLatencyTestIterations) {
    this.defaultLinkLatencyTestIterations = defaultLinkLatencyTestIterations;
  }

  
  /**
   * The default number of test iterations for a bandwidth test (specified in AsyncMirrorGroupConnectivityTestDescriptor when AsyncMirrorGroupConnectivityTestType is ASYNC_MIRROR_GROUP_LINK_BANDWIDTH_TEST).
   **/
  public ARVMDefaultAttributes defaultLinkBandwidthTestIterations(Integer defaultLinkBandwidthTestIterations) {
    this.defaultLinkBandwidthTestIterations = defaultLinkBandwidthTestIterations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The default number of test iterations for a bandwidth test (specified in AsyncMirrorGroupConnectivityTestDescriptor when AsyncMirrorGroupConnectivityTestType is ASYNC_MIRROR_GROUP_LINK_BANDWIDTH_TEST).")
  @JsonProperty("defaultLinkBandwidthTestIterations")
  public Integer getDefaultLinkBandwidthTestIterations() {
    return defaultLinkBandwidthTestIterations;
  }
  
  public void setDefaultLinkBandwidthTestIterations(Integer defaultLinkBandwidthTestIterations) {
    this.defaultLinkBandwidthTestIterations = defaultLinkBandwidthTestIterations;
  }

  
  /**
   * Recommended default sample list length limit to pass to getAsyncMirrorSyncStatistics for a RECENT statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)
   **/
  public ARVMDefaultAttributes defaultRecentStatisticsListLength(Integer defaultRecentStatisticsListLength) {
    this.defaultRecentStatisticsListLength = defaultRecentStatisticsListLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Recommended default sample list length limit to pass to getAsyncMirrorSyncStatistics for a RECENT statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)")
  @JsonProperty("defaultRecentStatisticsListLength")
  public Integer getDefaultRecentStatisticsListLength() {
    return defaultRecentStatisticsListLength;
  }
  
  public void setDefaultRecentStatisticsListLength(Integer defaultRecentStatisticsListLength) {
    this.defaultRecentStatisticsListLength = defaultRecentStatisticsListLength;
  }

  
  /**
   * Maximum sample list length limit allowed in a call to getAsyncMirrorSyncStatistics for a RECENT statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)
   **/
  public ARVMDefaultAttributes maxRecentStatisticsListLength(Integer maxRecentStatisticsListLength) {
    this.maxRecentStatisticsListLength = maxRecentStatisticsListLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum sample list length limit allowed in a call to getAsyncMirrorSyncStatistics for a RECENT statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)")
  @JsonProperty("maxRecentStatisticsListLength")
  public Integer getMaxRecentStatisticsListLength() {
    return maxRecentStatisticsListLength;
  }
  
  public void setMaxRecentStatisticsListLength(Integer maxRecentStatisticsListLength) {
    this.maxRecentStatisticsListLength = maxRecentStatisticsListLength;
  }

  
  /**
   * Recommended default sample list length limit to pass to getAsyncMirrorSyncStatistics for a LONGEST statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)
   **/
  public ARVMDefaultAttributes defaultLongestStatisticsListLength(Integer defaultLongestStatisticsListLength) {
    this.defaultLongestStatisticsListLength = defaultLongestStatisticsListLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Recommended default sample list length limit to pass to getAsyncMirrorSyncStatistics for a LONGEST statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)")
  @JsonProperty("defaultLongestStatisticsListLength")
  public Integer getDefaultLongestStatisticsListLength() {
    return defaultLongestStatisticsListLength;
  }
  
  public void setDefaultLongestStatisticsListLength(Integer defaultLongestStatisticsListLength) {
    this.defaultLongestStatisticsListLength = defaultLongestStatisticsListLength;
  }

  
  /**
   * Maximum sample list length limit allowed in a call to getAsyncMirrorSyncStatistics for a LONGEST statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)
   **/
  public ARVMDefaultAttributes maxLongestStatisticsListLength(Integer maxLongestStatisticsListLength) {
    this.maxLongestStatisticsListLength = maxLongestStatisticsListLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum sample list length limit allowed in a call to getAsyncMirrorSyncStatistics for a LONGEST statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)")
  @JsonProperty("maxLongestStatisticsListLength")
  public Integer getMaxLongestStatisticsListLength() {
    return maxLongestStatisticsListLength;
  }
  
  public void setMaxLongestStatisticsListLength(Integer maxLongestStatisticsListLength) {
    this.maxLongestStatisticsListLength = maxLongestStatisticsListLength;
  }

  
  /**
   * Recommended default sample list length limit to pass to getAsyncMirrorSyncStatistics for an ERROR statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)
   **/
  public ARVMDefaultAttributes defaultErrorStatisticsListLength(Integer defaultErrorStatisticsListLength) {
    this.defaultErrorStatisticsListLength = defaultErrorStatisticsListLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Recommended default sample list length limit to pass to getAsyncMirrorSyncStatistics for an ERROR statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)")
  @JsonProperty("defaultErrorStatisticsListLength")
  public Integer getDefaultErrorStatisticsListLength() {
    return defaultErrorStatisticsListLength;
  }
  
  public void setDefaultErrorStatisticsListLength(Integer defaultErrorStatisticsListLength) {
    this.defaultErrorStatisticsListLength = defaultErrorStatisticsListLength;
  }

  
  /**
   * Maximum sample list length limit allowed in a call to getAsyncMirrorSyncStatistics for an ERROR statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)
   **/
  public ARVMDefaultAttributes maxErrorStatisticsListLength(Integer maxErrorStatisticsListLength) {
    this.maxErrorStatisticsListLength = maxErrorStatisticsListLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum sample list length limit allowed in a call to getAsyncMirrorSyncStatistics for an ERROR statistics request (AsyncMirrorSyncStatisticsRequestDescriptor::sampleLimit field)")
  @JsonProperty("maxErrorStatisticsListLength")
  public Integer getMaxErrorStatisticsListLength() {
    return maxErrorStatisticsListLength;
  }
  
  public void setMaxErrorStatisticsListLength(Integer maxErrorStatisticsListLength) {
    this.maxErrorStatisticsListLength = maxErrorStatisticsListLength;
  }

  
  /**
   * Indicates the max allowed link latency between two RVM arrays.
   **/
  public ARVMDefaultAttributes maxAllowedLinkLatencyInMicroseconds(Integer maxAllowedLinkLatencyInMicroseconds) {
    this.maxAllowedLinkLatencyInMicroseconds = maxAllowedLinkLatencyInMicroseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the max allowed link latency between two RVM arrays.")
  @JsonProperty("maxAllowedLinkLatencyInMicroseconds")
  public Integer getMaxAllowedLinkLatencyInMicroseconds() {
    return maxAllowedLinkLatencyInMicroseconds;
  }
  
  public void setMaxAllowedLinkLatencyInMicroseconds(Integer maxAllowedLinkLatencyInMicroseconds) {
    this.maxAllowedLinkLatencyInMicroseconds = maxAllowedLinkLatencyInMicroseconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ARVMDefaultAttributes aRVMDefaultAttributes = (ARVMDefaultAttributes) o;
    return Objects.equals(this.minimumRepositoryCapacityInBytes, aRVMDefaultAttributes.minimumRepositoryCapacityInBytes) &&
        Objects.equals(this.maxRepositoryCapacityAsPercentOfMirroredCapacity, aRVMDefaultAttributes.maxRepositoryCapacityAsPercentOfMirroredCapacity) &&
        Objects.equals(this.defaultRepositoryCapacityAsPercentOfMirroredCapacity, aRVMDefaultAttributes.defaultRepositoryCapacityAsPercentOfMirroredCapacity) &&
        Objects.equals(this.defaultRepositoryUtilizationWarningThreshold, aRVMDefaultAttributes.defaultRepositoryUtilizationWarningThreshold) &&
        Objects.equals(this.minimumSyncIntervalInMinutes, aRVMDefaultAttributes.minimumSyncIntervalInMinutes) &&
        Objects.equals(this.defaultSyncIntervalInMinutes, aRVMDefaultAttributes.defaultSyncIntervalInMinutes) &&
        Objects.equals(this.defaultSyncCompletionTimeAlertThresholdInMinutes, aRVMDefaultAttributes.defaultSyncCompletionTimeAlertThresholdInMinutes) &&
        Objects.equals(this.defaultRecoveryPointAgeAlertThresholdInMinutes, aRVMDefaultAttributes.defaultRecoveryPointAgeAlertThresholdInMinutes) &&
        Objects.equals(this.maximumConnectivityTestTimeout, aRVMDefaultAttributes.maximumConnectivityTestTimeout) &&
        Objects.equals(this.maximumLinkLatencyTestIterations, aRVMDefaultAttributes.maximumLinkLatencyTestIterations) &&
        Objects.equals(this.maximumLinkBandwidthTestIterations, aRVMDefaultAttributes.maximumLinkBandwidthTestIterations) &&
        Objects.equals(this.minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity, aRVMDefaultAttributes.minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity) &&
        Objects.equals(this.defaultLinkLatencyTestIterations, aRVMDefaultAttributes.defaultLinkLatencyTestIterations) &&
        Objects.equals(this.defaultLinkBandwidthTestIterations, aRVMDefaultAttributes.defaultLinkBandwidthTestIterations) &&
        Objects.equals(this.defaultRecentStatisticsListLength, aRVMDefaultAttributes.defaultRecentStatisticsListLength) &&
        Objects.equals(this.maxRecentStatisticsListLength, aRVMDefaultAttributes.maxRecentStatisticsListLength) &&
        Objects.equals(this.defaultLongestStatisticsListLength, aRVMDefaultAttributes.defaultLongestStatisticsListLength) &&
        Objects.equals(this.maxLongestStatisticsListLength, aRVMDefaultAttributes.maxLongestStatisticsListLength) &&
        Objects.equals(this.defaultErrorStatisticsListLength, aRVMDefaultAttributes.defaultErrorStatisticsListLength) &&
        Objects.equals(this.maxErrorStatisticsListLength, aRVMDefaultAttributes.maxErrorStatisticsListLength) &&
        Objects.equals(this.maxAllowedLinkLatencyInMicroseconds, aRVMDefaultAttributes.maxAllowedLinkLatencyInMicroseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumRepositoryCapacityInBytes, maxRepositoryCapacityAsPercentOfMirroredCapacity, defaultRepositoryCapacityAsPercentOfMirroredCapacity, defaultRepositoryUtilizationWarningThreshold, minimumSyncIntervalInMinutes, defaultSyncIntervalInMinutes, defaultSyncCompletionTimeAlertThresholdInMinutes, defaultRecoveryPointAgeAlertThresholdInMinutes, maximumConnectivityTestTimeout, maximumLinkLatencyTestIterations, maximumLinkBandwidthTestIterations, minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity, defaultLinkLatencyTestIterations, defaultLinkBandwidthTestIterations, defaultRecentStatisticsListLength, maxRecentStatisticsListLength, defaultLongestStatisticsListLength, maxLongestStatisticsListLength, defaultErrorStatisticsListLength, maxErrorStatisticsListLength, maxAllowedLinkLatencyInMicroseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARVMDefaultAttributes {\n");
    
    sb.append("    minimumRepositoryCapacityInBytes: ").append(toIndentedString(minimumRepositoryCapacityInBytes)).append("\n");
    sb.append("    maxRepositoryCapacityAsPercentOfMirroredCapacity: ").append(toIndentedString(maxRepositoryCapacityAsPercentOfMirroredCapacity)).append("\n");
    sb.append("    defaultRepositoryCapacityAsPercentOfMirroredCapacity: ").append(toIndentedString(defaultRepositoryCapacityAsPercentOfMirroredCapacity)).append("\n");
    sb.append("    defaultRepositoryUtilizationWarningThreshold: ").append(toIndentedString(defaultRepositoryUtilizationWarningThreshold)).append("\n");
    sb.append("    minimumSyncIntervalInMinutes: ").append(toIndentedString(minimumSyncIntervalInMinutes)).append("\n");
    sb.append("    defaultSyncIntervalInMinutes: ").append(toIndentedString(defaultSyncIntervalInMinutes)).append("\n");
    sb.append("    defaultSyncCompletionTimeAlertThresholdInMinutes: ").append(toIndentedString(defaultSyncCompletionTimeAlertThresholdInMinutes)).append("\n");
    sb.append("    defaultRecoveryPointAgeAlertThresholdInMinutes: ").append(toIndentedString(defaultRecoveryPointAgeAlertThresholdInMinutes)).append("\n");
    sb.append("    maximumConnectivityTestTimeout: ").append(toIndentedString(maximumConnectivityTestTimeout)).append("\n");
    sb.append("    maximumLinkLatencyTestIterations: ").append(toIndentedString(maximumLinkLatencyTestIterations)).append("\n");
    sb.append("    maximumLinkBandwidthTestIterations: ").append(toIndentedString(maximumLinkBandwidthTestIterations)).append("\n");
    sb.append("    minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity: ").append(toIndentedString(minimumRepositoryCapacityInHundredthsOfPercentOfMirroredCapacity)).append("\n");
    sb.append("    defaultLinkLatencyTestIterations: ").append(toIndentedString(defaultLinkLatencyTestIterations)).append("\n");
    sb.append("    defaultLinkBandwidthTestIterations: ").append(toIndentedString(defaultLinkBandwidthTestIterations)).append("\n");
    sb.append("    defaultRecentStatisticsListLength: ").append(toIndentedString(defaultRecentStatisticsListLength)).append("\n");
    sb.append("    maxRecentStatisticsListLength: ").append(toIndentedString(maxRecentStatisticsListLength)).append("\n");
    sb.append("    defaultLongestStatisticsListLength: ").append(toIndentedString(defaultLongestStatisticsListLength)).append("\n");
    sb.append("    maxLongestStatisticsListLength: ").append(toIndentedString(maxLongestStatisticsListLength)).append("\n");
    sb.append("    defaultErrorStatisticsListLength: ").append(toIndentedString(defaultErrorStatisticsListLength)).append("\n");
    sb.append("    maxErrorStatisticsListLength: ").append(toIndentedString(maxErrorStatisticsListLength)).append("\n");
    sb.append("    maxAllowedLinkLatencyInMicroseconds: ").append(toIndentedString(maxAllowedLinkLatencyInMicroseconds)).append("\n");
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

