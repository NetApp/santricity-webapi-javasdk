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
 * ChannelDiagWrRdVfyResults
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class ChannelDiagWrRdVfyResults   {
  
    private ChannelDiagDevice device;


  /**
   * A status code providing general information about the outcome of the diagnostic test.
   */
  public enum StatusEnum {
    complete("complete"),
    incomplete("incomplete"),
    cancelled("cancelled"),
    timeExpired("timeExpired"),
    notStarted("notStarted"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private StatusEnum status;

    private Integer actualTimeInterval;

    private Integer iterationsAttempted;

    private Integer channelResetsDetected;

    private Integer iterationsPassed;

    private Integer iterationsFailedWithMiscompares;

    private Integer iterationsFailedWithSetupErrors;

    private Integer iterationsFailedWithOutboundTimeouts;

    private Integer iterationsFailedWithOutboundResets;

    private Integer iterationsFailedWithOutboundMiscErrors;

    private Integer iterationsFailedWithInboundTimeouts;

    private Integer iterationsFailedWithInboundResets;

    private Integer iterationsFailedWithInboundMiscErrors;

    private Integer averageElapsedTimeForOutboundPhases;

    private Integer varianceInElapsedTimeForOutboundPhases;

    private Integer averageElapsedTimeForInboundPhases;

    private Integer varianceInElapsedTimeForInboundPhases;

    private ChannelDiagInterfaceDepResults interfaceDependentResults;

    private Integer driveChannel;

  
  /**
   * The device on which the channel diagnostic test was performed
   **/
  public ChannelDiagWrRdVfyResults device(ChannelDiagDevice device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The device on which the channel diagnostic test was performed")
  @JsonProperty("device")
  public ChannelDiagDevice getDevice() {
    return device;
  }
  
  public void setDevice(ChannelDiagDevice device) {
    this.device = device;
  }

  
  /**
   * A status code providing general information about the outcome of the diagnostic test.
   **/
  public ChannelDiagWrRdVfyResults status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A status code providing general information about the outcome of the diagnostic test.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The number of seconds the diagnostic test actually ran.
   **/
  public ChannelDiagWrRdVfyResults actualTimeInterval(Integer actualTimeInterval) {
    this.actualTimeInterval = actualTimeInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of seconds the diagnostic test actually ran.")
  @JsonProperty("actualTimeInterval")
  public Integer getActualTimeInterval() {
    return actualTimeInterval;
  }
  
  public void setActualTimeInterval(Integer actualTimeInterval) {
    this.actualTimeInterval = actualTimeInterval;
  }

  
  /**
   * The total number of iterations attempted
   **/
  public ChannelDiagWrRdVfyResults iterationsAttempted(Integer iterationsAttempted) {
    this.iterationsAttempted = iterationsAttempted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of iterations attempted")
  @JsonProperty("iterationsAttempted")
  public Integer getIterationsAttempted() {
    return iterationsAttempted;
  }
  
  public void setIterationsAttempted(Integer iterationsAttempted) {
    this.iterationsAttempted = iterationsAttempted;
  }

  
  /**
   * The device on which the tests were performed.
   **/
  public ChannelDiagWrRdVfyResults channelResetsDetected(Integer channelResetsDetected) {
    this.channelResetsDetected = channelResetsDetected;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The device on which the tests were performed.")
  @JsonProperty("channelResetsDetected")
  public Integer getChannelResetsDetected() {
    return channelResetsDetected;
  }
  
  public void setChannelResetsDetected(Integer channelResetsDetected) {
    this.channelResetsDetected = channelResetsDetected;
  }

  
  /**
   * The number of iterations that completed successfully/
   **/
  public ChannelDiagWrRdVfyResults iterationsPassed(Integer iterationsPassed) {
    this.iterationsPassed = iterationsPassed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iterations that completed successfully/")
  @JsonProperty("iterationsPassed")
  public Integer getIterationsPassed() {
    return iterationsPassed;
  }
  
  public void setIterationsPassed(Integer iterationsPassed) {
    this.iterationsPassed = iterationsPassed;
  }

  
  /**
   * The number of iterations that failed due to data miscompares.
   **/
  public ChannelDiagWrRdVfyResults iterationsFailedWithMiscompares(Integer iterationsFailedWithMiscompares) {
    this.iterationsFailedWithMiscompares = iterationsFailedWithMiscompares;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iterations that failed due to data miscompares.")
  @JsonProperty("iterationsFailedWithMiscompares")
  public Integer getIterationsFailedWithMiscompares() {
    return iterationsFailedWithMiscompares;
  }
  
  public void setIterationsFailedWithMiscompares(Integer iterationsFailedWithMiscompares) {
    this.iterationsFailedWithMiscompares = iterationsFailedWithMiscompares;
  }

  
  /**
   * The number of iterations that failed due to setup errors prior to starting the iteration.
   **/
  public ChannelDiagWrRdVfyResults iterationsFailedWithSetupErrors(Integer iterationsFailedWithSetupErrors) {
    this.iterationsFailedWithSetupErrors = iterationsFailedWithSetupErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iterations that failed due to setup errors prior to starting the iteration.")
  @JsonProperty("iterationsFailedWithSetupErrors")
  public Integer getIterationsFailedWithSetupErrors() {
    return iterationsFailedWithSetupErrors;
  }
  
  public void setIterationsFailedWithSetupErrors(Integer iterationsFailedWithSetupErrors) {
    this.iterationsFailedWithSetupErrors = iterationsFailedWithSetupErrors;
  }

  
  /**
   * The number of iterations that failed due I/O timeouts on outbound-data commands.
   **/
  public ChannelDiagWrRdVfyResults iterationsFailedWithOutboundTimeouts(Integer iterationsFailedWithOutboundTimeouts) {
    this.iterationsFailedWithOutboundTimeouts = iterationsFailedWithOutboundTimeouts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iterations that failed due I/O timeouts on outbound-data commands.")
  @JsonProperty("iterationsFailedWithOutboundTimeouts")
  public Integer getIterationsFailedWithOutboundTimeouts() {
    return iterationsFailedWithOutboundTimeouts;
  }
  
  public void setIterationsFailedWithOutboundTimeouts(Integer iterationsFailedWithOutboundTimeouts) {
    this.iterationsFailedWithOutboundTimeouts = iterationsFailedWithOutboundTimeouts;
  }

  
  /**
   * The number of iterations that failed due to channel-level resets that occurred during outbound-data commands.
   **/
  public ChannelDiagWrRdVfyResults iterationsFailedWithOutboundResets(Integer iterationsFailedWithOutboundResets) {
    this.iterationsFailedWithOutboundResets = iterationsFailedWithOutboundResets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iterations that failed due to channel-level resets that occurred during outbound-data commands.")
  @JsonProperty("iterationsFailedWithOutboundResets")
  public Integer getIterationsFailedWithOutboundResets() {
    return iterationsFailedWithOutboundResets;
  }
  
  public void setIterationsFailedWithOutboundResets(Integer iterationsFailedWithOutboundResets) {
    this.iterationsFailedWithOutboundResets = iterationsFailedWithOutboundResets;
  }

  
  /**
   * The number of iterations that failed due to other command failures (e.g., check conditions, aborted commands, channel-level resets, etc.) on outbound data commands.
   **/
  public ChannelDiagWrRdVfyResults iterationsFailedWithOutboundMiscErrors(Integer iterationsFailedWithOutboundMiscErrors) {
    this.iterationsFailedWithOutboundMiscErrors = iterationsFailedWithOutboundMiscErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iterations that failed due to other command failures (e.g., check conditions, aborted commands, channel-level resets, etc.) on outbound data commands.")
  @JsonProperty("iterationsFailedWithOutboundMiscErrors")
  public Integer getIterationsFailedWithOutboundMiscErrors() {
    return iterationsFailedWithOutboundMiscErrors;
  }
  
  public void setIterationsFailedWithOutboundMiscErrors(Integer iterationsFailedWithOutboundMiscErrors) {
    this.iterationsFailedWithOutboundMiscErrors = iterationsFailedWithOutboundMiscErrors;
  }

  
  /**
   * The number of iterations that failed due I/O timeouts on inbound-data commands.
   **/
  public ChannelDiagWrRdVfyResults iterationsFailedWithInboundTimeouts(Integer iterationsFailedWithInboundTimeouts) {
    this.iterationsFailedWithInboundTimeouts = iterationsFailedWithInboundTimeouts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iterations that failed due I/O timeouts on inbound-data commands.")
  @JsonProperty("iterationsFailedWithInboundTimeouts")
  public Integer getIterationsFailedWithInboundTimeouts() {
    return iterationsFailedWithInboundTimeouts;
  }
  
  public void setIterationsFailedWithInboundTimeouts(Integer iterationsFailedWithInboundTimeouts) {
    this.iterationsFailedWithInboundTimeouts = iterationsFailedWithInboundTimeouts;
  }

  
  /**
   * The number of iterations that failed due to channel-level resets that occurred during inbound-data commands.
   **/
  public ChannelDiagWrRdVfyResults iterationsFailedWithInboundResets(Integer iterationsFailedWithInboundResets) {
    this.iterationsFailedWithInboundResets = iterationsFailedWithInboundResets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iterations that failed due to channel-level resets that occurred during inbound-data commands.")
  @JsonProperty("iterationsFailedWithInboundResets")
  public Integer getIterationsFailedWithInboundResets() {
    return iterationsFailedWithInboundResets;
  }
  
  public void setIterationsFailedWithInboundResets(Integer iterationsFailedWithInboundResets) {
    this.iterationsFailedWithInboundResets = iterationsFailedWithInboundResets;
  }

  
  /**
   * The number of iterations that failed due to other command failures (e.g., check conditions, aborted commands, channel-level resets, etc.) on inbound-data commands.
   **/
  public ChannelDiagWrRdVfyResults iterationsFailedWithInboundMiscErrors(Integer iterationsFailedWithInboundMiscErrors) {
    this.iterationsFailedWithInboundMiscErrors = iterationsFailedWithInboundMiscErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of iterations that failed due to other command failures (e.g., check conditions, aborted commands, channel-level resets, etc.) on inbound-data commands.")
  @JsonProperty("iterationsFailedWithInboundMiscErrors")
  public Integer getIterationsFailedWithInboundMiscErrors() {
    return iterationsFailedWithInboundMiscErrors;
  }
  
  public void setIterationsFailedWithInboundMiscErrors(Integer iterationsFailedWithInboundMiscErrors) {
    this.iterationsFailedWithInboundMiscErrors = iterationsFailedWithInboundMiscErrors;
  }

  
  /**
   * The average elapsed command-processing time, in microseconds) for the outbound-data phases of all successful iterations.
   **/
  public ChannelDiagWrRdVfyResults averageElapsedTimeForOutboundPhases(Integer averageElapsedTimeForOutboundPhases) {
    this.averageElapsedTimeForOutboundPhases = averageElapsedTimeForOutboundPhases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The average elapsed command-processing time, in microseconds) for the outbound-data phases of all successful iterations.")
  @JsonProperty("averageElapsedTimeForOutboundPhases")
  public Integer getAverageElapsedTimeForOutboundPhases() {
    return averageElapsedTimeForOutboundPhases;
  }
  
  public void setAverageElapsedTimeForOutboundPhases(Integer averageElapsedTimeForOutboundPhases) {
    this.averageElapsedTimeForOutboundPhases = averageElapsedTimeForOutboundPhases;
  }

  
  /**
   * The statistical variance of the elapsed command-processing time for the outbound-data phases of all successful variations.
   **/
  public ChannelDiagWrRdVfyResults varianceInElapsedTimeForOutboundPhases(Integer varianceInElapsedTimeForOutboundPhases) {
    this.varianceInElapsedTimeForOutboundPhases = varianceInElapsedTimeForOutboundPhases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The statistical variance of the elapsed command-processing time for the outbound-data phases of all successful variations.")
  @JsonProperty("varianceInElapsedTimeForOutboundPhases")
  public Integer getVarianceInElapsedTimeForOutboundPhases() {
    return varianceInElapsedTimeForOutboundPhases;
  }
  
  public void setVarianceInElapsedTimeForOutboundPhases(Integer varianceInElapsedTimeForOutboundPhases) {
    this.varianceInElapsedTimeForOutboundPhases = varianceInElapsedTimeForOutboundPhases;
  }

  
  /**
   * The average elapsed command-processing time, in microseconds) for the inbound-data phases of all successful iterations.
   **/
  public ChannelDiagWrRdVfyResults averageElapsedTimeForInboundPhases(Integer averageElapsedTimeForInboundPhases) {
    this.averageElapsedTimeForInboundPhases = averageElapsedTimeForInboundPhases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The average elapsed command-processing time, in microseconds) for the inbound-data phases of all successful iterations.")
  @JsonProperty("averageElapsedTimeForInboundPhases")
  public Integer getAverageElapsedTimeForInboundPhases() {
    return averageElapsedTimeForInboundPhases;
  }
  
  public void setAverageElapsedTimeForInboundPhases(Integer averageElapsedTimeForInboundPhases) {
    this.averageElapsedTimeForInboundPhases = averageElapsedTimeForInboundPhases;
  }

  
  /**
   * The statistical variance of the elapsed command-processing time for the inbound-data phases of all successful variations.
   **/
  public ChannelDiagWrRdVfyResults varianceInElapsedTimeForInboundPhases(Integer varianceInElapsedTimeForInboundPhases) {
    this.varianceInElapsedTimeForInboundPhases = varianceInElapsedTimeForInboundPhases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The statistical variance of the elapsed command-processing time for the inbound-data phases of all successful variations.")
  @JsonProperty("varianceInElapsedTimeForInboundPhases")
  public Integer getVarianceInElapsedTimeForInboundPhases() {
    return varianceInElapsedTimeForInboundPhases;
  }
  
  public void setVarianceInElapsedTimeForInboundPhases(Integer varianceInElapsedTimeForInboundPhases) {
    this.varianceInElapsedTimeForInboundPhases = varianceInElapsedTimeForInboundPhases;
  }

  
  /**
   * A set of channel diagnostic test results that depend on the particular I/O interface technology of the tested channel.
   **/
  public ChannelDiagWrRdVfyResults interfaceDependentResults(ChannelDiagInterfaceDepResults interfaceDependentResults) {
    this.interfaceDependentResults = interfaceDependentResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A set of channel diagnostic test results that depend on the particular I/O interface technology of the tested channel.")
  @JsonProperty("interfaceDependentResults")
  public ChannelDiagInterfaceDepResults getInterfaceDependentResults() {
    return interfaceDependentResults;
  }
  
  public void setInterfaceDependentResults(ChannelDiagInterfaceDepResults interfaceDependentResults) {
    this.interfaceDependentResults = interfaceDependentResults;
  }

  
  /**
   * The number of the drive channel on which testing was performed.
   **/
  public ChannelDiagWrRdVfyResults driveChannel(Integer driveChannel) {
    this.driveChannel = driveChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of the drive channel on which testing was performed.")
  @JsonProperty("driveChannel")
  public Integer getDriveChannel() {
    return driveChannel;
  }
  
  public void setDriveChannel(Integer driveChannel) {
    this.driveChannel = driveChannel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDiagWrRdVfyResults channelDiagWrRdVfyResults = (ChannelDiagWrRdVfyResults) o;
    return Objects.equals(this.device, channelDiagWrRdVfyResults.device) &&
        Objects.equals(this.status, channelDiagWrRdVfyResults.status) &&
        Objects.equals(this.actualTimeInterval, channelDiagWrRdVfyResults.actualTimeInterval) &&
        Objects.equals(this.iterationsAttempted, channelDiagWrRdVfyResults.iterationsAttempted) &&
        Objects.equals(this.channelResetsDetected, channelDiagWrRdVfyResults.channelResetsDetected) &&
        Objects.equals(this.iterationsPassed, channelDiagWrRdVfyResults.iterationsPassed) &&
        Objects.equals(this.iterationsFailedWithMiscompares, channelDiagWrRdVfyResults.iterationsFailedWithMiscompares) &&
        Objects.equals(this.iterationsFailedWithSetupErrors, channelDiagWrRdVfyResults.iterationsFailedWithSetupErrors) &&
        Objects.equals(this.iterationsFailedWithOutboundTimeouts, channelDiagWrRdVfyResults.iterationsFailedWithOutboundTimeouts) &&
        Objects.equals(this.iterationsFailedWithOutboundResets, channelDiagWrRdVfyResults.iterationsFailedWithOutboundResets) &&
        Objects.equals(this.iterationsFailedWithOutboundMiscErrors, channelDiagWrRdVfyResults.iterationsFailedWithOutboundMiscErrors) &&
        Objects.equals(this.iterationsFailedWithInboundTimeouts, channelDiagWrRdVfyResults.iterationsFailedWithInboundTimeouts) &&
        Objects.equals(this.iterationsFailedWithInboundResets, channelDiagWrRdVfyResults.iterationsFailedWithInboundResets) &&
        Objects.equals(this.iterationsFailedWithInboundMiscErrors, channelDiagWrRdVfyResults.iterationsFailedWithInboundMiscErrors) &&
        Objects.equals(this.averageElapsedTimeForOutboundPhases, channelDiagWrRdVfyResults.averageElapsedTimeForOutboundPhases) &&
        Objects.equals(this.varianceInElapsedTimeForOutboundPhases, channelDiagWrRdVfyResults.varianceInElapsedTimeForOutboundPhases) &&
        Objects.equals(this.averageElapsedTimeForInboundPhases, channelDiagWrRdVfyResults.averageElapsedTimeForInboundPhases) &&
        Objects.equals(this.varianceInElapsedTimeForInboundPhases, channelDiagWrRdVfyResults.varianceInElapsedTimeForInboundPhases) &&
        Objects.equals(this.interfaceDependentResults, channelDiagWrRdVfyResults.interfaceDependentResults) &&
        Objects.equals(this.driveChannel, channelDiagWrRdVfyResults.driveChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, status, actualTimeInterval, iterationsAttempted, channelResetsDetected, iterationsPassed, iterationsFailedWithMiscompares, iterationsFailedWithSetupErrors, iterationsFailedWithOutboundTimeouts, iterationsFailedWithOutboundResets, iterationsFailedWithOutboundMiscErrors, iterationsFailedWithInboundTimeouts, iterationsFailedWithInboundResets, iterationsFailedWithInboundMiscErrors, averageElapsedTimeForOutboundPhases, varianceInElapsedTimeForOutboundPhases, averageElapsedTimeForInboundPhases, varianceInElapsedTimeForInboundPhases, interfaceDependentResults, driveChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDiagWrRdVfyResults {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    actualTimeInterval: ").append(toIndentedString(actualTimeInterval)).append("\n");
    sb.append("    iterationsAttempted: ").append(toIndentedString(iterationsAttempted)).append("\n");
    sb.append("    channelResetsDetected: ").append(toIndentedString(channelResetsDetected)).append("\n");
    sb.append("    iterationsPassed: ").append(toIndentedString(iterationsPassed)).append("\n");
    sb.append("    iterationsFailedWithMiscompares: ").append(toIndentedString(iterationsFailedWithMiscompares)).append("\n");
    sb.append("    iterationsFailedWithSetupErrors: ").append(toIndentedString(iterationsFailedWithSetupErrors)).append("\n");
    sb.append("    iterationsFailedWithOutboundTimeouts: ").append(toIndentedString(iterationsFailedWithOutboundTimeouts)).append("\n");
    sb.append("    iterationsFailedWithOutboundResets: ").append(toIndentedString(iterationsFailedWithOutboundResets)).append("\n");
    sb.append("    iterationsFailedWithOutboundMiscErrors: ").append(toIndentedString(iterationsFailedWithOutboundMiscErrors)).append("\n");
    sb.append("    iterationsFailedWithInboundTimeouts: ").append(toIndentedString(iterationsFailedWithInboundTimeouts)).append("\n");
    sb.append("    iterationsFailedWithInboundResets: ").append(toIndentedString(iterationsFailedWithInboundResets)).append("\n");
    sb.append("    iterationsFailedWithInboundMiscErrors: ").append(toIndentedString(iterationsFailedWithInboundMiscErrors)).append("\n");
    sb.append("    averageElapsedTimeForOutboundPhases: ").append(toIndentedString(averageElapsedTimeForOutboundPhases)).append("\n");
    sb.append("    varianceInElapsedTimeForOutboundPhases: ").append(toIndentedString(varianceInElapsedTimeForOutboundPhases)).append("\n");
    sb.append("    averageElapsedTimeForInboundPhases: ").append(toIndentedString(averageElapsedTimeForInboundPhases)).append("\n");
    sb.append("    varianceInElapsedTimeForInboundPhases: ").append(toIndentedString(varianceInElapsedTimeForInboundPhases)).append("\n");
    sb.append("    interfaceDependentResults: ").append(toIndentedString(interfaceDependentResults)).append("\n");
    sb.append("    driveChannel: ").append(toIndentedString(driveChannel)).append("\n");
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

