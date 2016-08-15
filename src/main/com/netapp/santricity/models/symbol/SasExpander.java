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
 * SasExpander
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class SasExpander   {
  
    private String expanderRef;

    private SasExpanderParent parent;

    private Integer channel;

    private String deviceName;

    private String vendorId;

    private String productId;

    private String fwVersion;

    private List<SasPort> expanderPorts;

    private Integer domainNumber;

    private String id;

  
  /**
   * The reference value that uniquely identifies the SAS expander.
   **/
  public SasExpander expanderRef(String expanderRef) {
    this.expanderRef = expanderRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value that uniquely identifies the SAS expander.")
  @JsonProperty("expanderRef")
  public String getExpanderRef() {
    return expanderRef;
  }
  
  public void setExpanderRef(String expanderRef) {
    this.expanderRef = expanderRef;
  }

  
  /**
   * The reference value that uniquely identifies the parent (controller or ESM) of the SAS expander.
   **/
  public SasExpander parent(SasExpanderParent parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference value that uniquely identifies the parent (controller or ESM) of the SAS expander.")
  @JsonProperty("parent")
  public SasExpanderParent getParent() {
    return parent;
  }
  
  public void setParent(SasExpanderParent parent) {
    this.parent = parent;
  }

  
  /**
   * The drive channel location of the expander
   **/
  public SasExpander channel(Integer channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The drive channel location of the expander")
  @JsonProperty("channel")
  public Integer getChannel() {
    return channel;
  }
  
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  
  /**
   * The SAS address that is the expander device name
   **/
  public SasExpander deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SAS address that is the expander device name")
  @JsonProperty("deviceName")
  public String getDeviceName() {
    return deviceName;
  }
  
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  
  /**
   * The Inquiry vendor identification string for the SAS expander.
   **/
  public SasExpander vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Inquiry vendor identification string for the SAS expander.")
  @JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  
  /**
   * The Inquiry product identification string for the SAS expander.
   **/
  public SasExpander productId(String productId) {
    this.productId = productId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Inquiry product identification string for the SAS expander.")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   * The version of the firmware on the SAS expander.
   **/
  public SasExpander fwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version of the firmware on the SAS expander.")
  @JsonProperty("fwVersion")
  public String getFwVersion() {
    return fwVersion;
  }
  
  public void setFwVersion(String fwVersion) {
    this.fwVersion = fwVersion;
  }

  
  /**
   * List of ports that are part of this expander.
   **/
  public SasExpander expanderPorts(List<SasPort> expanderPorts) {
    this.expanderPorts = expanderPorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of ports that are part of this expander.")
  @JsonProperty("expanderPorts")
  public List<SasPort> getExpanderPorts() {
    return expanderPorts;
  }
  
  public void setExpanderPorts(List<SasPort> expanderPorts) {
    this.expanderPorts = expanderPorts;
  }

  
  /**
   * The domain number identifies which SAS domain this element is a part of. Domain numbers are arbitrarily assigned by the firmware and are consistent on a per controller basis -- but not across controllers. So, the contents of domains will be consistent across controllers but the number identifying a particular domain may not be.
   **/
  public SasExpander domainNumber(Integer domainNumber) {
    this.domainNumber = domainNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The domain number identifies which SAS domain this element is a part of. Domain numbers are arbitrarily assigned by the firmware and are consistent on a per controller basis -- but not across controllers. So, the contents of domains will be consistent across controllers but the number identifying a particular domain may not be.")
  @JsonProperty("domainNumber")
  public Integer getDomainNumber() {
    return domainNumber;
  }
  
  public void setDomainNumber(Integer domainNumber) {
    this.domainNumber = domainNumber;
  }

  
  /**
   **/
  public SasExpander id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasExpander sasExpander = (SasExpander) o;
    return Objects.equals(this.expanderRef, sasExpander.expanderRef) &&
        Objects.equals(this.parent, sasExpander.parent) &&
        Objects.equals(this.channel, sasExpander.channel) &&
        Objects.equals(this.deviceName, sasExpander.deviceName) &&
        Objects.equals(this.vendorId, sasExpander.vendorId) &&
        Objects.equals(this.productId, sasExpander.productId) &&
        Objects.equals(this.fwVersion, sasExpander.fwVersion) &&
        Objects.equals(this.expanderPorts, sasExpander.expanderPorts) &&
        Objects.equals(this.domainNumber, sasExpander.domainNumber) &&
        Objects.equals(this.id, sasExpander.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expanderRef, parent, channel, deviceName, vendorId, productId, fwVersion, expanderPorts, domainNumber, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasExpander {\n");
    
    sb.append("    expanderRef: ").append(toIndentedString(expanderRef)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    fwVersion: ").append(toIndentedString(fwVersion)).append("\n");
    sb.append("    expanderPorts: ").append(toIndentedString(expanderPorts)).append("\n");
    sb.append("    domainNumber: ").append(toIndentedString(domainNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

