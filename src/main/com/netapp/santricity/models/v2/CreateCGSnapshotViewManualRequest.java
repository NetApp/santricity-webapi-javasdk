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
 * CreateCGSnapshotViewManualRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class CreateCGSnapshotViewManualRequest   {
  
    private String name;

    private Long pitSequenceNumber;

    private List<CGSnapshotViewRequest> requests;

  
  /**
   **/
  public CreateCGSnapshotViewManualRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The sequence number of the PITs to create Views for. All provided PITs/Snapshots must have a matching sequenceNumber
   **/
  public CreateCGSnapshotViewManualRequest pitSequenceNumber(Long pitSequenceNumber) {
    this.pitSequenceNumber = pitSequenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sequence number of the PITs to create Views for. All provided PITs/Snapshots must have a matching sequenceNumber")
  @JsonProperty("pitSequenceNumber")
  public Long getPitSequenceNumber() {
    return pitSequenceNumber;
  }
  
  public void setPitSequenceNumber(Long pitSequenceNumber) {
    this.pitSequenceNumber = pitSequenceNumber;
  }

  
  /**
   * A list of Snapshots to include in the view.
   **/
  public CreateCGSnapshotViewManualRequest requests(List<CGSnapshotViewRequest> requests) {
    this.requests = requests;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of Snapshots to include in the view.")
  @JsonProperty("requests")
  public List<CGSnapshotViewRequest> getRequests() {
    return requests;
  }
  
  public void setRequests(List<CGSnapshotViewRequest> requests) {
    this.requests = requests;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCGSnapshotViewManualRequest createCGSnapshotViewManualRequest = (CreateCGSnapshotViewManualRequest) o;
    return Objects.equals(this.name, createCGSnapshotViewManualRequest.name) &&
        Objects.equals(this.pitSequenceNumber, createCGSnapshotViewManualRequest.pitSequenceNumber) &&
        Objects.equals(this.requests, createCGSnapshotViewManualRequest.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pitSequenceNumber, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCGSnapshotViewManualRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pitSequenceNumber: ").append(toIndentedString(pitSequenceNumber)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

