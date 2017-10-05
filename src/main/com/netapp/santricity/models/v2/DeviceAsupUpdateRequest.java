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


package com.netapp.santricity.models.v2;

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
 * Used to update asup settings.
 */
@ApiModel(description = "Used to update asup settings.")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class DeviceAsupUpdateRequest   {
  
    private Boolean asupEnabled;

    private Boolean onDemandEnabled;

    private Boolean remoteDiagsEnabled;

    private DeviceAsupDelivery delivery;

    private DeviceAsupSchedule schedule;

  
  /**
   * AutoSupoprt enabled or disabled
   **/
  public DeviceAsupUpdateRequest asupEnabled(Boolean asupEnabled) {
    this.asupEnabled = asupEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AutoSupoprt enabled or disabled")
  @JsonProperty("asupEnabled")
  public Boolean getAsupEnabled() {
    return asupEnabled;
  }
  
  public void setAsupEnabled(Boolean asupEnabled) {
    this.asupEnabled = asupEnabled;
  }

  
  /**
   * ASUP OnDemand is enabled or disabled
   **/
  public DeviceAsupUpdateRequest onDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP OnDemand is enabled or disabled")
  @JsonProperty("onDemandEnabled")
  public Boolean getOnDemandEnabled() {
    return onDemandEnabled;
  }
  
  public void setOnDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
  }

  
  /**
   * ASUP RemoteDiags is enabled or disabled
   **/
  public DeviceAsupUpdateRequest remoteDiagsEnabled(Boolean remoteDiagsEnabled) {
    this.remoteDiagsEnabled = remoteDiagsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP RemoteDiags is enabled or disabled")
  @JsonProperty("remoteDiagsEnabled")
  public Boolean getRemoteDiagsEnabled() {
    return remoteDiagsEnabled;
  }
  
  public void setRemoteDiagsEnabled(Boolean remoteDiagsEnabled) {
    this.remoteDiagsEnabled = remoteDiagsEnabled;
  }

  
  /**
   * ASUP delivery configuration
   **/
  public DeviceAsupUpdateRequest delivery(DeviceAsupDelivery delivery) {
    this.delivery = delivery;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP delivery configuration")
  @JsonProperty("delivery")
  public DeviceAsupDelivery getDelivery() {
    return delivery;
  }
  
  public void setDelivery(DeviceAsupDelivery delivery) {
    this.delivery = delivery;
  }

  
  /**
   * ASUP schedule configuration
   **/
  public DeviceAsupUpdateRequest schedule(DeviceAsupSchedule schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ASUP schedule configuration")
  @JsonProperty("schedule")
  public DeviceAsupSchedule getSchedule() {
    return schedule;
  }
  
  public void setSchedule(DeviceAsupSchedule schedule) {
    this.schedule = schedule;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAsupUpdateRequest deviceAsupUpdateRequest = (DeviceAsupUpdateRequest) o;
    return Objects.equals(this.asupEnabled, deviceAsupUpdateRequest.asupEnabled) &&
        Objects.equals(this.onDemandEnabled, deviceAsupUpdateRequest.onDemandEnabled) &&
        Objects.equals(this.remoteDiagsEnabled, deviceAsupUpdateRequest.remoteDiagsEnabled) &&
        Objects.equals(this.delivery, deviceAsupUpdateRequest.delivery) &&
        Objects.equals(this.schedule, deviceAsupUpdateRequest.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asupEnabled, onDemandEnabled, remoteDiagsEnabled, delivery, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAsupUpdateRequest {\n");
    
    sb.append("    asupEnabled: ").append(toIndentedString(asupEnabled)).append("\n");
    sb.append("    onDemandEnabled: ").append(toIndentedString(onDemandEnabled)).append("\n");
    sb.append("    remoteDiagsEnabled: ").append(toIndentedString(remoteDiagsEnabled)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

