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
 * AsyncMirrorPrimarySyncStatisticsSample
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class AsyncMirrorPrimarySyncStatisticsSample   {
  

  /**
   * The type of synchronization being performed during this sample period.
   */
  public enum SyncTypeEnum {
    unknown("unknown"),
    periodic("periodic"),
    manual("manual"),
    initialSync("initialSync"),
    roleChange("roleChange"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SyncTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SyncTypeEnum syncType;

    private Long syncStartTimestamp;

    private AsyncMirrorSyncCompletionDetail completionDetail;

    private String owner;

    private Long sampleStartTimeSeconds;

    private Long sampleEndTimeSeconds;


  /**
   * Last known state of the mirror member as of the sample end time.
   */
  public enum MemberStateEnum {
    unknown("unknown"),
    initialSync("initialSync"),
    optimal("optimal"),
    failed("failed"),
    incomplete("incomplete"),
    orphan("orphan"),
    stopped("stopped"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MemberStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MemberStateEnum memberState;

    private Integer repositoryUtilizationWarnThreshold;

    private Integer repositoryUtilizationPercentage;

    private Integer syncIntervalMinutes;

    private Integer syncDurationMinutes;

    private Integer syncCompletionTimeAlertThresholdMinutes;

    private Integer recoveryPointAgeAlertThresholdMinutes;

    private Integer recoveryPointAgeMinutes;

    private Long cumulativeBytesSent;

    private Long cumulativeIOTime;

    private Integer totalIOCount;

    private Integer longestResponseTimeMicroSeconds;

    private Integer longestResponseTimeBytes;

    private Integer shortestResponseTimeMicroSeconds;

    private Integer shortestResponseTimeBytes;

    private Long highestThroughputInBytesPerSecond;

    private Long lowestThroughputInBytesPerSecond;

  
  /**
   * The type of synchronization being performed during this sample period.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample syncType(SyncTypeEnum syncType) {
    this.syncType = syncType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of synchronization being performed during this sample period.")
  @JsonProperty("syncType")
  public SyncTypeEnum getSyncType() {
    return syncType;
  }
  
  public void setSyncType(SyncTypeEnum syncType) {
    this.syncType = syncType;
  }

  
  /**
   * The synchronization start timestamp represented in seconds since midnight GMT on January 1, 1970. This can be used to correlate statistics between the primary and secondary for the same interval (time recorded here is driven from the primary). This can also be used to correlate multiple samples for the same synchronization period.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample syncStartTimestamp(Long syncStartTimestamp) {
    this.syncStartTimestamp = syncStartTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The synchronization start timestamp represented in seconds since midnight GMT on January 1, 1970. This can be used to correlate statistics between the primary and secondary for the same interval (time recorded here is driven from the primary). This can also be used to correlate multiple samples for the same synchronization period.")
  @JsonProperty("syncStartTimestamp")
  public Long getSyncStartTimestamp() {
    return syncStartTimestamp;
  }
  
  public void setSyncStartTimestamp(Long syncStartTimestamp) {
    this.syncStartTimestamp = syncStartTimestamp;
  }

  
  /**
   * Indication of whether synchronization failed or completed normally.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample completionDetail(AsyncMirrorSyncCompletionDetail completionDetail) {
    this.completionDetail = completionDetail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indication of whether synchronization failed or completed normally.")
  @JsonProperty("completionDetail")
  public AsyncMirrorSyncCompletionDetail getCompletionDetail() {
    return completionDetail;
  }
  
  public void setCompletionDetail(AsyncMirrorSyncCompletionDetail completionDetail) {
    this.completionDetail = completionDetail;
  }

  
  /**
   * Owning controller for the duration of this sample.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample owner(String owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Owning controller for the duration of this sample.")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   * When this sample started: > = synchronization start time. Time is expressed in seconds since midnight January 1, 1970 GMT.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample sampleStartTimeSeconds(Long sampleStartTimeSeconds) {
    this.sampleStartTimeSeconds = sampleStartTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When this sample started: > = synchronization start time. Time is expressed in seconds since midnight January 1, 1970 GMT.")
  @JsonProperty("sampleStartTimeSeconds")
  public Long getSampleStartTimeSeconds() {
    return sampleStartTimeSeconds;
  }
  
  public void setSampleStartTimeSeconds(Long sampleStartTimeSeconds) {
    this.sampleStartTimeSeconds = sampleStartTimeSeconds;
  }

  
  /**
   * When this sample ended: synchronization completion time, or time of last update before disruption. Time is expressed in seconds since midnight January 1, 1970 GMT.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample sampleEndTimeSeconds(Long sampleEndTimeSeconds) {
    this.sampleEndTimeSeconds = sampleEndTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When this sample ended: synchronization completion time, or time of last update before disruption. Time is expressed in seconds since midnight January 1, 1970 GMT.")
  @JsonProperty("sampleEndTimeSeconds")
  public Long getSampleEndTimeSeconds() {
    return sampleEndTimeSeconds;
  }
  
  public void setSampleEndTimeSeconds(Long sampleEndTimeSeconds) {
    this.sampleEndTimeSeconds = sampleEndTimeSeconds;
  }

  
  /**
   * Last known state of the mirror member as of the sample end time.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample memberState(MemberStateEnum memberState) {
    this.memberState = memberState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last known state of the mirror member as of the sample end time.")
  @JsonProperty("memberState")
  public MemberStateEnum getMemberState() {
    return memberState;
  }
  
  public void setMemberState(MemberStateEnum memberState) {
    this.memberState = memberState;
  }

  
  /**
   * The repository utilization warning threshold percentage as of the sample end time.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample repositoryUtilizationWarnThreshold(Integer repositoryUtilizationWarnThreshold) {
    this.repositoryUtilizationWarnThreshold = repositoryUtilizationWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization warning threshold percentage as of the sample end time.")
  @JsonProperty("repositoryUtilizationWarnThreshold")
  public Integer getRepositoryUtilizationWarnThreshold() {
    return repositoryUtilizationWarnThreshold;
  }
  
  public void setRepositoryUtilizationWarnThreshold(Integer repositoryUtilizationWarnThreshold) {
    this.repositoryUtilizationWarnThreshold = repositoryUtilizationWarnThreshold;
  }

  
  /**
   * The repository utilization percentage as of the sample end time (0-100).
   **/
  public AsyncMirrorPrimarySyncStatisticsSample repositoryUtilizationPercentage(Integer repositoryUtilizationPercentage) {
    this.repositoryUtilizationPercentage = repositoryUtilizationPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The repository utilization percentage as of the sample end time (0-100).")
  @JsonProperty("repositoryUtilizationPercentage")
  public Integer getRepositoryUtilizationPercentage() {
    return repositoryUtilizationPercentage;
  }
  
  public void setRepositoryUtilizationPercentage(Integer repositoryUtilizationPercentage) {
    this.repositoryUtilizationPercentage = repositoryUtilizationPercentage;
  }

  
  /**
   * Synchronization interval configured (in minutes), as of the sample end time.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample syncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Synchronization interval configured (in minutes), as of the sample end time.")
  @JsonProperty("syncIntervalMinutes")
  public Integer getSyncIntervalMinutes() {
    return syncIntervalMinutes;
  }
  
  public void setSyncIntervalMinutes(Integer syncIntervalMinutes) {
    this.syncIntervalMinutes = syncIntervalMinutes;
  }

  
  /**
   * Time spent thus far in the synchronization as of the sample end time.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample syncDurationMinutes(Integer syncDurationMinutes) {
    this.syncDurationMinutes = syncDurationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time spent thus far in the synchronization as of the sample end time.")
  @JsonProperty("syncDurationMinutes")
  public Integer getSyncDurationMinutes() {
    return syncDurationMinutes;
  }
  
  public void setSyncDurationMinutes(Integer syncDurationMinutes) {
    this.syncDurationMinutes = syncDurationMinutes;
  }

  
  /**
   * Configured time allowed for the synchronization as of the sample end time.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample syncCompletionTimeAlertThresholdMinutes(Integer syncCompletionTimeAlertThresholdMinutes) {
    this.syncCompletionTimeAlertThresholdMinutes = syncCompletionTimeAlertThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configured time allowed for the synchronization as of the sample end time.")
  @JsonProperty("syncCompletionTimeAlertThresholdMinutes")
  public Integer getSyncCompletionTimeAlertThresholdMinutes() {
    return syncCompletionTimeAlertThresholdMinutes;
  }
  
  public void setSyncCompletionTimeAlertThresholdMinutes(Integer syncCompletionTimeAlertThresholdMinutes) {
    this.syncCompletionTimeAlertThresholdMinutes = syncCompletionTimeAlertThresholdMinutes;
  }

  
  /**
   * The recovery point age warning threshold as of the sample end time.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample recoveryPointAgeAlertThresholdMinutes(Integer recoveryPointAgeAlertThresholdMinutes) {
    this.recoveryPointAgeAlertThresholdMinutes = recoveryPointAgeAlertThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recovery point age warning threshold as of the sample end time.")
  @JsonProperty("recoveryPointAgeAlertThresholdMinutes")
  public Integer getRecoveryPointAgeAlertThresholdMinutes() {
    return recoveryPointAgeAlertThresholdMinutes;
  }
  
  public void setRecoveryPointAgeAlertThresholdMinutes(Integer recoveryPointAgeAlertThresholdMinutes) {
    this.recoveryPointAgeAlertThresholdMinutes = recoveryPointAgeAlertThresholdMinutes;
  }

  
  /**
   * The recovery point age (in minutes) as of the sample end time.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample recoveryPointAgeMinutes(Integer recoveryPointAgeMinutes) {
    this.recoveryPointAgeMinutes = recoveryPointAgeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recovery point age (in minutes) as of the sample end time.")
  @JsonProperty("recoveryPointAgeMinutes")
  public Integer getRecoveryPointAgeMinutes() {
    return recoveryPointAgeMinutes;
  }
  
  public void setRecoveryPointAgeMinutes(Integer recoveryPointAgeMinutes) {
    this.recoveryPointAgeMinutes = recoveryPointAgeMinutes;
  }

  
  /**
   * The total bytes transferred during the time covered by this sample.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample cumulativeBytesSent(Long cumulativeBytesSent) {
    this.cumulativeBytesSent = cumulativeBytesSent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total bytes transferred during the time covered by this sample.")
  @JsonProperty("cumulativeBytesSent")
  public Long getCumulativeBytesSent() {
    return cumulativeBytesSent;
  }
  
  public void setCumulativeBytesSent(Long cumulativeBytesSent) {
    this.cumulativeBytesSent = cumulativeBytesSent;
  }

  
  /**
   * The total time spent sending data to the secondary for the duration of this sample (in microseconds). This is measured from the time each I/O is sent to the secondary until the response is received.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample cumulativeIOTime(Long cumulativeIOTime) {
    this.cumulativeIOTime = cumulativeIOTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total time spent sending data to the secondary for the duration of this sample (in microseconds). This is measured from the time each I/O is sent to the secondary until the response is received.")
  @JsonProperty("cumulativeIOTime")
  public Long getCumulativeIOTime() {
    return cumulativeIOTime;
  }
  
  public void setCumulativeIOTime(Long cumulativeIOTime) {
    this.cumulativeIOTime = cumulativeIOTime;
  }

  
  /**
   * The total count of I/O requests to the secondary in this sample.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample totalIOCount(Integer totalIOCount) {
    this.totalIOCount = totalIOCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total count of I/O requests to the secondary in this sample.")
  @JsonProperty("totalIOCount")
  public Integer getTotalIOCount() {
    return totalIOCount;
  }
  
  public void setTotalIOCount(Integer totalIOCount) {
    this.totalIOCount = totalIOCount;
  }

  
  /**
   * The longest response time from the secondary array observed for one request during the time covered by this sample (in microseconds).
   **/
  public AsyncMirrorPrimarySyncStatisticsSample longestResponseTimeMicroSeconds(Integer longestResponseTimeMicroSeconds) {
    this.longestResponseTimeMicroSeconds = longestResponseTimeMicroSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The longest response time from the secondary array observed for one request during the time covered by this sample (in microseconds).")
  @JsonProperty("longestResponseTimeMicroSeconds")
  public Integer getLongestResponseTimeMicroSeconds() {
    return longestResponseTimeMicroSeconds;
  }
  
  public void setLongestResponseTimeMicroSeconds(Integer longestResponseTimeMicroSeconds) {
    this.longestResponseTimeMicroSeconds = longestResponseTimeMicroSeconds;
  }

  
  /**
   * The number of bytes transferred on the longest request.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample longestResponseTimeBytes(Integer longestResponseTimeBytes) {
    this.longestResponseTimeBytes = longestResponseTimeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes transferred on the longest request.")
  @JsonProperty("longestResponseTimeBytes")
  public Integer getLongestResponseTimeBytes() {
    return longestResponseTimeBytes;
  }
  
  public void setLongestResponseTimeBytes(Integer longestResponseTimeBytes) {
    this.longestResponseTimeBytes = longestResponseTimeBytes;
  }

  
  /**
   * The shortest response time from the secondary array observed for one request during the time covered by this sample (in microseconds).
   **/
  public AsyncMirrorPrimarySyncStatisticsSample shortestResponseTimeMicroSeconds(Integer shortestResponseTimeMicroSeconds) {
    this.shortestResponseTimeMicroSeconds = shortestResponseTimeMicroSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shortest response time from the secondary array observed for one request during the time covered by this sample (in microseconds).")
  @JsonProperty("shortestResponseTimeMicroSeconds")
  public Integer getShortestResponseTimeMicroSeconds() {
    return shortestResponseTimeMicroSeconds;
  }
  
  public void setShortestResponseTimeMicroSeconds(Integer shortestResponseTimeMicroSeconds) {
    this.shortestResponseTimeMicroSeconds = shortestResponseTimeMicroSeconds;
  }

  
  /**
   * The number of bytes sent on shortest request.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample shortestResponseTimeBytes(Integer shortestResponseTimeBytes) {
    this.shortestResponseTimeBytes = shortestResponseTimeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of bytes sent on shortest request.")
  @JsonProperty("shortestResponseTimeBytes")
  public Integer getShortestResponseTimeBytes() {
    return shortestResponseTimeBytes;
  }
  
  public void setShortestResponseTimeBytes(Integer shortestResponseTimeBytes) {
    this.shortestResponseTimeBytes = shortestResponseTimeBytes;
  }

  
  /**
   * The highest recorded throughput (in bytes/second) to the remote array for this mirror during this sample period.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample highestThroughputInBytesPerSecond(Long highestThroughputInBytesPerSecond) {
    this.highestThroughputInBytesPerSecond = highestThroughputInBytesPerSecond;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The highest recorded throughput (in bytes/second) to the remote array for this mirror during this sample period.")
  @JsonProperty("highestThroughputInBytesPerSecond")
  public Long getHighestThroughputInBytesPerSecond() {
    return highestThroughputInBytesPerSecond;
  }
  
  public void setHighestThroughputInBytesPerSecond(Long highestThroughputInBytesPerSecond) {
    this.highestThroughputInBytesPerSecond = highestThroughputInBytesPerSecond;
  }

  
  /**
   * The lowest recorded throughput (in bytes/second) to the remote array for this mirror during this sample period.
   **/
  public AsyncMirrorPrimarySyncStatisticsSample lowestThroughputInBytesPerSecond(Long lowestThroughputInBytesPerSecond) {
    this.lowestThroughputInBytesPerSecond = lowestThroughputInBytesPerSecond;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The lowest recorded throughput (in bytes/second) to the remote array for this mirror during this sample period.")
  @JsonProperty("lowestThroughputInBytesPerSecond")
  public Long getLowestThroughputInBytesPerSecond() {
    return lowestThroughputInBytesPerSecond;
  }
  
  public void setLowestThroughputInBytesPerSecond(Long lowestThroughputInBytesPerSecond) {
    this.lowestThroughputInBytesPerSecond = lowestThroughputInBytesPerSecond;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncMirrorPrimarySyncStatisticsSample asyncMirrorPrimarySyncStatisticsSample = (AsyncMirrorPrimarySyncStatisticsSample) o;
    return Objects.equals(this.syncType, asyncMirrorPrimarySyncStatisticsSample.syncType) &&
        Objects.equals(this.syncStartTimestamp, asyncMirrorPrimarySyncStatisticsSample.syncStartTimestamp) &&
        Objects.equals(this.completionDetail, asyncMirrorPrimarySyncStatisticsSample.completionDetail) &&
        Objects.equals(this.owner, asyncMirrorPrimarySyncStatisticsSample.owner) &&
        Objects.equals(this.sampleStartTimeSeconds, asyncMirrorPrimarySyncStatisticsSample.sampleStartTimeSeconds) &&
        Objects.equals(this.sampleEndTimeSeconds, asyncMirrorPrimarySyncStatisticsSample.sampleEndTimeSeconds) &&
        Objects.equals(this.memberState, asyncMirrorPrimarySyncStatisticsSample.memberState) &&
        Objects.equals(this.repositoryUtilizationWarnThreshold, asyncMirrorPrimarySyncStatisticsSample.repositoryUtilizationWarnThreshold) &&
        Objects.equals(this.repositoryUtilizationPercentage, asyncMirrorPrimarySyncStatisticsSample.repositoryUtilizationPercentage) &&
        Objects.equals(this.syncIntervalMinutes, asyncMirrorPrimarySyncStatisticsSample.syncIntervalMinutes) &&
        Objects.equals(this.syncDurationMinutes, asyncMirrorPrimarySyncStatisticsSample.syncDurationMinutes) &&
        Objects.equals(this.syncCompletionTimeAlertThresholdMinutes, asyncMirrorPrimarySyncStatisticsSample.syncCompletionTimeAlertThresholdMinutes) &&
        Objects.equals(this.recoveryPointAgeAlertThresholdMinutes, asyncMirrorPrimarySyncStatisticsSample.recoveryPointAgeAlertThresholdMinutes) &&
        Objects.equals(this.recoveryPointAgeMinutes, asyncMirrorPrimarySyncStatisticsSample.recoveryPointAgeMinutes) &&
        Objects.equals(this.cumulativeBytesSent, asyncMirrorPrimarySyncStatisticsSample.cumulativeBytesSent) &&
        Objects.equals(this.cumulativeIOTime, asyncMirrorPrimarySyncStatisticsSample.cumulativeIOTime) &&
        Objects.equals(this.totalIOCount, asyncMirrorPrimarySyncStatisticsSample.totalIOCount) &&
        Objects.equals(this.longestResponseTimeMicroSeconds, asyncMirrorPrimarySyncStatisticsSample.longestResponseTimeMicroSeconds) &&
        Objects.equals(this.longestResponseTimeBytes, asyncMirrorPrimarySyncStatisticsSample.longestResponseTimeBytes) &&
        Objects.equals(this.shortestResponseTimeMicroSeconds, asyncMirrorPrimarySyncStatisticsSample.shortestResponseTimeMicroSeconds) &&
        Objects.equals(this.shortestResponseTimeBytes, asyncMirrorPrimarySyncStatisticsSample.shortestResponseTimeBytes) &&
        Objects.equals(this.highestThroughputInBytesPerSecond, asyncMirrorPrimarySyncStatisticsSample.highestThroughputInBytesPerSecond) &&
        Objects.equals(this.lowestThroughputInBytesPerSecond, asyncMirrorPrimarySyncStatisticsSample.lowestThroughputInBytesPerSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncType, syncStartTimestamp, completionDetail, owner, sampleStartTimeSeconds, sampleEndTimeSeconds, memberState, repositoryUtilizationWarnThreshold, repositoryUtilizationPercentage, syncIntervalMinutes, syncDurationMinutes, syncCompletionTimeAlertThresholdMinutes, recoveryPointAgeAlertThresholdMinutes, recoveryPointAgeMinutes, cumulativeBytesSent, cumulativeIOTime, totalIOCount, longestResponseTimeMicroSeconds, longestResponseTimeBytes, shortestResponseTimeMicroSeconds, shortestResponseTimeBytes, highestThroughputInBytesPerSecond, lowestThroughputInBytesPerSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncMirrorPrimarySyncStatisticsSample {\n");
    
    sb.append("    syncType: ").append(toIndentedString(syncType)).append("\n");
    sb.append("    syncStartTimestamp: ").append(toIndentedString(syncStartTimestamp)).append("\n");
    sb.append("    completionDetail: ").append(toIndentedString(completionDetail)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    sampleStartTimeSeconds: ").append(toIndentedString(sampleStartTimeSeconds)).append("\n");
    sb.append("    sampleEndTimeSeconds: ").append(toIndentedString(sampleEndTimeSeconds)).append("\n");
    sb.append("    memberState: ").append(toIndentedString(memberState)).append("\n");
    sb.append("    repositoryUtilizationWarnThreshold: ").append(toIndentedString(repositoryUtilizationWarnThreshold)).append("\n");
    sb.append("    repositoryUtilizationPercentage: ").append(toIndentedString(repositoryUtilizationPercentage)).append("\n");
    sb.append("    syncIntervalMinutes: ").append(toIndentedString(syncIntervalMinutes)).append("\n");
    sb.append("    syncDurationMinutes: ").append(toIndentedString(syncDurationMinutes)).append("\n");
    sb.append("    syncCompletionTimeAlertThresholdMinutes: ").append(toIndentedString(syncCompletionTimeAlertThresholdMinutes)).append("\n");
    sb.append("    recoveryPointAgeAlertThresholdMinutes: ").append(toIndentedString(recoveryPointAgeAlertThresholdMinutes)).append("\n");
    sb.append("    recoveryPointAgeMinutes: ").append(toIndentedString(recoveryPointAgeMinutes)).append("\n");
    sb.append("    cumulativeBytesSent: ").append(toIndentedString(cumulativeBytesSent)).append("\n");
    sb.append("    cumulativeIOTime: ").append(toIndentedString(cumulativeIOTime)).append("\n");
    sb.append("    totalIOCount: ").append(toIndentedString(totalIOCount)).append("\n");
    sb.append("    longestResponseTimeMicroSeconds: ").append(toIndentedString(longestResponseTimeMicroSeconds)).append("\n");
    sb.append("    longestResponseTimeBytes: ").append(toIndentedString(longestResponseTimeBytes)).append("\n");
    sb.append("    shortestResponseTimeMicroSeconds: ").append(toIndentedString(shortestResponseTimeMicroSeconds)).append("\n");
    sb.append("    shortestResponseTimeBytes: ").append(toIndentedString(shortestResponseTimeBytes)).append("\n");
    sb.append("    highestThroughputInBytesPerSecond: ").append(toIndentedString(highestThroughputInBytesPerSecond)).append("\n");
    sb.append("    lowestThroughputInBytesPerSecond: ").append(toIndentedString(lowestThroughputInBytesPerSecond)).append("\n");
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

