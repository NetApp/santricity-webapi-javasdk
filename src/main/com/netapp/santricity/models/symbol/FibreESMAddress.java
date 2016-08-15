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
 * FibreESMAddress
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FibreESMAddress   {
  
    private String esmPortRef;

    private Integer loopID;

    private String portRef;

  
  /**
   * The esmPortRef identifies the drive port.
   **/
  public FibreESMAddress esmPortRef(String esmPortRef) {
    this.esmPortRef = esmPortRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The esmPortRef identifies the drive port.")
  @JsonProperty("esmPortRef")
  public String getEsmPortRef() {
    return esmPortRef;
  }
  
  public void setEsmPortRef(String esmPortRef) {
    this.esmPortRef = esmPortRef;
  }

  
  /**
   * The loop ID of the ESM.
   **/
  public FibreESMAddress loopID(Integer loopID) {
    this.loopID = loopID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The loop ID of the ESM.")
  @JsonProperty("loopID")
  public Integer getLoopID() {
    return loopID;
  }
  
  public void setLoopID(Integer loopID) {
    this.loopID = loopID;
  }

  
  /**
   * A reference to the controller drive side channel port associated with this ESM.
   **/
  public FibreESMAddress portRef(String portRef) {
    this.portRef = portRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the controller drive side channel port associated with this ESM.")
  @JsonProperty("portRef")
  public String getPortRef() {
    return portRef;
  }
  
  public void setPortRef(String portRef) {
    this.portRef = portRef;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FibreESMAddress fibreESMAddress = (FibreESMAddress) o;
    return Objects.equals(this.esmPortRef, fibreESMAddress.esmPortRef) &&
        Objects.equals(this.loopID, fibreESMAddress.loopID) &&
        Objects.equals(this.portRef, fibreESMAddress.portRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esmPortRef, loopID, portRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FibreESMAddress {\n");
    
    sb.append("    esmPortRef: ").append(toIndentedString(esmPortRef)).append("\n");
    sb.append("    loopID: ").append(toIndentedString(loopID)).append("\n");
    sb.append("    portRef: ").append(toIndentedString(portRef)).append("\n");
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

