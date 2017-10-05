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
 * IbIocAttributes
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class IbIocAttributes   {
  
    private String hostBoardRef;

    private IbIocProfile iocProfile;

    private List<IbServiceEntry> serviceEntries;

  
  /**
   * A reference to the host board (a.k.a., InfiniBand Target Channel Adapter) with which the I/O controller is associated.
   **/
  public IbIocAttributes hostBoardRef(String hostBoardRef) {
    this.hostBoardRef = hostBoardRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the host board (a.k.a., InfiniBand Target Channel Adapter) with which the I/O controller is associated.")
  @JsonProperty("hostBoardRef")
  public String getHostBoardRef() {
    return hostBoardRef;
  }
  
  public void setHostBoardRef(String hostBoardRef) {
    this.hostBoardRef = hostBoardRef;
  }

  
  /**
   * The I/O controller profile for the storage array controller.
   **/
  public IbIocAttributes iocProfile(IbIocProfile iocProfile) {
    this.iocProfile = iocProfile;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The I/O controller profile for the storage array controller.")
  @JsonProperty("iocProfile")
  public IbIocProfile getIocProfile() {
    return iocProfile;
  }
  
  public void setIocProfile(IbIocProfile iocProfile) {
    this.iocProfile = iocProfile;
  }

  
  /**
   * An array of structures indicating the services that are provided by the InfiniBand I/O controller.
   **/
  public IbIocAttributes serviceEntries(List<IbServiceEntry> serviceEntries) {
    this.serviceEntries = serviceEntries;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of structures indicating the services that are provided by the InfiniBand I/O controller.")
  @JsonProperty("serviceEntries")
  public List<IbServiceEntry> getServiceEntries() {
    return serviceEntries;
  }
  
  public void setServiceEntries(List<IbServiceEntry> serviceEntries) {
    this.serviceEntries = serviceEntries;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbIocAttributes ibIocAttributes = (IbIocAttributes) o;
    return Objects.equals(this.hostBoardRef, ibIocAttributes.hostBoardRef) &&
        Objects.equals(this.iocProfile, ibIocAttributes.iocProfile) &&
        Objects.equals(this.serviceEntries, ibIocAttributes.serviceEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostBoardRef, iocProfile, serviceEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbIocAttributes {\n");
    
    sb.append("    hostBoardRef: ").append(toIndentedString(hostBoardRef)).append("\n");
    sb.append("    iocProfile: ").append(toIndentedString(iocProfile)).append("\n");
    sb.append("    serviceEntries: ").append(toIndentedString(serviceEntries)).append("\n");
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

