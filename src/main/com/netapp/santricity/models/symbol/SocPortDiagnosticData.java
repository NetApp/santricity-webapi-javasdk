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
 * SocPortDiagnosticData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SocPortDiagnosticData   {
  

  /**
   * The current state of the port.
   */
  public enum PortStateEnum {
    unknown("unknown"),
    inserted("inserted"),
    insertedManual("insertedManual"),
    loopback("loopback"),
    diagXmit("diagXmit"),
    bypassed("bypassed"),
    bypNoFru("bypNoFru"),
    bypTxFault("bypTxFault"),
    bypLipF8("bypLipF8"),
    bypDataTimeout("bypDataTimeout"),
    bypRxLos("bypRxLos"),
    bypSyncLoss("bypSyncLoss"),
    bypLipIsol("bypLipIsol"),
    bypPtbi("bypPtbi"),
    bypManual("bypManual"),
    bypRedundant("bypRedundant"),
    bypSnoop("bypSnoop"),
    bypCrcThresh("bypCrcThresh"),
    bypInvalidOsThresh("bypInvalidOsThresh"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PortStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PortStateEnum portState;

    private Integer portInsertionCount;


  /**
   * The state of the loop
   */
  public enum LoopStateEnum {
    down("down"),
    init("init"),
    openInit("openInit"),
    up("up"),
    active("active"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    LoopStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private LoopStateEnum loopState;

    private Integer loopUpCount;

    private Integer crcErrorCount;

    private Integer relativeFrequencyDriftErrorAverage;

    private Integer loopCycleCount;

    private Integer osErrorCount;

    private Integer portConnectionsAttemptedCount;

    private Integer portConnectionsHeldOffCount;

    private Integer portUtilization;

  
  /**
   * The current state of the port.
   **/
  public SocPortDiagnosticData portState(PortStateEnum portState) {
    this.portState = portState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current state of the port.")
  @JsonProperty("portState")
  public PortStateEnum getPortState() {
    return portState;
  }
  
  public void setPortState(PortStateEnum portState) {
    this.portState = portState;
  }

  
  /**
   * The number of times the port has been inserted.
   **/
  public SocPortDiagnosticData portInsertionCount(Integer portInsertionCount) {
    this.portInsertionCount = portInsertionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times the port has been inserted.")
  @JsonProperty("portInsertionCount")
  public Integer getPortInsertionCount() {
    return portInsertionCount;
  }
  
  public void setPortInsertionCount(Integer portInsertionCount) {
    this.portInsertionCount = portInsertionCount;
  }

  
  /**
   * The state of the loop
   **/
  public SocPortDiagnosticData loopState(LoopStateEnum loopState) {
    this.loopState = loopState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the loop")
  @JsonProperty("loopState")
  public LoopStateEnum getLoopState() {
    return loopState;
  }
  
  public void setLoopState(LoopStateEnum loopState) {
    this.loopState = loopState;
  }

  
  /**
   * The number of times the referenced port has seen a loop-up event.
   **/
  public SocPortDiagnosticData loopUpCount(Integer loopUpCount) {
    this.loopUpCount = loopUpCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times the referenced port has seen a loop-up event.")
  @JsonProperty("loopUpCount")
  public Integer getLoopUpCount() {
    return loopUpCount;
  }
  
  public void setLoopUpCount(Integer loopUpCount) {
    this.loopUpCount = loopUpCount;
  }

  
  /**
   * The count of CRC errors.
   **/
  public SocPortDiagnosticData crcErrorCount(Integer crcErrorCount) {
    this.crcErrorCount = crcErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of CRC errors.")
  @JsonProperty("crcErrorCount")
  public Integer getCrcErrorCount() {
    return crcErrorCount;
  }
  
  public void setCrcErrorCount(Integer crcErrorCount) {
    this.crcErrorCount = crcErrorCount;
  }

  
  /**
   * The difference, in PPM, between the port received data rate and the internal clock of the SOC.
   **/
  public SocPortDiagnosticData relativeFrequencyDriftErrorAverage(Integer relativeFrequencyDriftErrorAverage) {
    this.relativeFrequencyDriftErrorAverage = relativeFrequencyDriftErrorAverage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The difference, in PPM, between the port received data rate and the internal clock of the SOC.")
  @JsonProperty("relativeFrequencyDriftErrorAverage")
  public Integer getRelativeFrequencyDriftErrorAverage() {
    return relativeFrequencyDriftErrorAverage;
  }
  
  public void setRelativeFrequencyDriftErrorAverage(Integer relativeFrequencyDriftErrorAverage) {
    this.relativeFrequencyDriftErrorAverage = relativeFrequencyDriftErrorAverage;
  }

  
  /**
   * The number of LIPs seen by the referenced port. (valid in segmenting mode only)
   **/
  public SocPortDiagnosticData loopCycleCount(Integer loopCycleCount) {
    this.loopCycleCount = loopCycleCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of LIPs seen by the referenced port. (valid in segmenting mode only)")
  @JsonProperty("loopCycleCount")
  public Integer getLoopCycleCount() {
    return loopCycleCount;
  }
  
  public void setLoopCycleCount(Integer loopCycleCount) {
    this.loopCycleCount = loopCycleCount;
  }

  
  /**
   * The count of invalid FC transmit words seen at the receiver of the referenced port.
   **/
  public SocPortDiagnosticData osErrorCount(Integer osErrorCount) {
    this.osErrorCount = osErrorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of invalid FC transmit words seen at the receiver of the referenced port.")
  @JsonProperty("osErrorCount")
  public Integer getOsErrorCount() {
    return osErrorCount;
  }
  
  public void setOsErrorCount(Integer osErrorCount) {
    this.osErrorCount = osErrorCount;
  }

  
  /**
   * The number of times a port has attempted make a connection due to ARB connection requests. (valid in segmenting mode only)
   **/
  public SocPortDiagnosticData portConnectionsAttemptedCount(Integer portConnectionsAttemptedCount) {
    this.portConnectionsAttemptedCount = portConnectionsAttemptedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of times a port has attempted make a connection due to ARB connection requests. (valid in segmenting mode only)")
  @JsonProperty("portConnectionsAttemptedCount")
  public Integer getPortConnectionsAttemptedCount() {
    return portConnectionsAttemptedCount;
  }
  
  public void setPortConnectionsAttemptedCount(Integer portConnectionsAttemptedCount) {
    this.portConnectionsAttemptedCount = portConnectionsAttemptedCount;
  }

  
  /**
   * The count of times this port has attempted to make a connection and was held off by a busy port. (valid in segmenting mode only)
   **/
  public SocPortDiagnosticData portConnectionsHeldOffCount(Integer portConnectionsHeldOffCount) {
    this.portConnectionsHeldOffCount = portConnectionsHeldOffCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of times this port has attempted to make a connection and was held off by a busy port. (valid in segmenting mode only)")
  @JsonProperty("portConnectionsHeldOffCount")
  public Integer getPortConnectionsHeldOffCount() {
    return portConnectionsHeldOffCount;
  }
  
  public void setPortConnectionsHeldOffCount(Integer portConnectionsHeldOffCount) {
    this.portConnectionsHeldOffCount = portConnectionsHeldOffCount;
  }

  
  /**
   * The port utilization seen on the referenced port. The value returned is either the percent of time that frames are seen on the port, or the percent of time that a port is used during switching mode operation when the SOC is operating in the switching mode. Range 0 to 200, 0.5% per bit scale. (valid in segmenting mode only)
   **/
  public SocPortDiagnosticData portUtilization(Integer portUtilization) {
    this.portUtilization = portUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The port utilization seen on the referenced port. The value returned is either the percent of time that frames are seen on the port, or the percent of time that a port is used during switching mode operation when the SOC is operating in the switching mode. Range 0 to 200, 0.5% per bit scale. (valid in segmenting mode only)")
  @JsonProperty("portUtilization")
  public Integer getPortUtilization() {
    return portUtilization;
  }
  
  public void setPortUtilization(Integer portUtilization) {
    this.portUtilization = portUtilization;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocPortDiagnosticData socPortDiagnosticData = (SocPortDiagnosticData) o;
    return Objects.equals(this.portState, socPortDiagnosticData.portState) &&
        Objects.equals(this.portInsertionCount, socPortDiagnosticData.portInsertionCount) &&
        Objects.equals(this.loopState, socPortDiagnosticData.loopState) &&
        Objects.equals(this.loopUpCount, socPortDiagnosticData.loopUpCount) &&
        Objects.equals(this.crcErrorCount, socPortDiagnosticData.crcErrorCount) &&
        Objects.equals(this.relativeFrequencyDriftErrorAverage, socPortDiagnosticData.relativeFrequencyDriftErrorAverage) &&
        Objects.equals(this.loopCycleCount, socPortDiagnosticData.loopCycleCount) &&
        Objects.equals(this.osErrorCount, socPortDiagnosticData.osErrorCount) &&
        Objects.equals(this.portConnectionsAttemptedCount, socPortDiagnosticData.portConnectionsAttemptedCount) &&
        Objects.equals(this.portConnectionsHeldOffCount, socPortDiagnosticData.portConnectionsHeldOffCount) &&
        Objects.equals(this.portUtilization, socPortDiagnosticData.portUtilization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portState, portInsertionCount, loopState, loopUpCount, crcErrorCount, relativeFrequencyDriftErrorAverage, loopCycleCount, osErrorCount, portConnectionsAttemptedCount, portConnectionsHeldOffCount, portUtilization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocPortDiagnosticData {\n");
    
    sb.append("    portState: ").append(toIndentedString(portState)).append("\n");
    sb.append("    portInsertionCount: ").append(toIndentedString(portInsertionCount)).append("\n");
    sb.append("    loopState: ").append(toIndentedString(loopState)).append("\n");
    sb.append("    loopUpCount: ").append(toIndentedString(loopUpCount)).append("\n");
    sb.append("    crcErrorCount: ").append(toIndentedString(crcErrorCount)).append("\n");
    sb.append("    relativeFrequencyDriftErrorAverage: ").append(toIndentedString(relativeFrequencyDriftErrorAverage)).append("\n");
    sb.append("    loopCycleCount: ").append(toIndentedString(loopCycleCount)).append("\n");
    sb.append("    osErrorCount: ").append(toIndentedString(osErrorCount)).append("\n");
    sb.append("    portConnectionsAttemptedCount: ").append(toIndentedString(portConnectionsAttemptedCount)).append("\n");
    sb.append("    portConnectionsHeldOffCount: ").append(toIndentedString(portConnectionsHeldOffCount)).append("\n");
    sb.append("    portUtilization: ").append(toIndentedString(portUtilization)).append("\n");
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

