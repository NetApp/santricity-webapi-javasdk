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
 * DbmCheckRetrieveStartDetails
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DbmCheckRetrieveStartDetails   {
  
    private Boolean performLogicalConsistencyCheck;

    private Boolean performBlockConsistencyCheck;

    private Boolean performClientConsistencyCheck;


  /**
   * Specifies which storage device contains the image to be checked.
   */
  public enum SourceLocationEnum {
    unknown("unknown"),
    dacstoreDisks("dacstoreDisks"),
    onboardRpa("onboardRpa"),
    hostImage("hostImage"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SourceLocationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SourceLocationEnum sourceLocation;

  
  /**
   * When true, a logical consistency check will be performed.
   **/
  public DbmCheckRetrieveStartDetails performLogicalConsistencyCheck(Boolean performLogicalConsistencyCheck) {
    this.performLogicalConsistencyCheck = performLogicalConsistencyCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When true, a logical consistency check will be performed.")
  @JsonProperty("performLogicalConsistencyCheck")
  public Boolean getPerformLogicalConsistencyCheck() {
    return performLogicalConsistencyCheck;
  }
  
  public void setPerformLogicalConsistencyCheck(Boolean performLogicalConsistencyCheck) {
    this.performLogicalConsistencyCheck = performLogicalConsistencyCheck;
  }

  
  /**
   * When true, a block consistency check will be performed.
   **/
  public DbmCheckRetrieveStartDetails performBlockConsistencyCheck(Boolean performBlockConsistencyCheck) {
    this.performBlockConsistencyCheck = performBlockConsistencyCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When true, a block consistency check will be performed.")
  @JsonProperty("performBlockConsistencyCheck")
  public Boolean getPerformBlockConsistencyCheck() {
    return performBlockConsistencyCheck;
  }
  
  public void setPerformBlockConsistencyCheck(Boolean performBlockConsistencyCheck) {
    this.performBlockConsistencyCheck = performBlockConsistencyCheck;
  }

  
  /**
   * When true, a check of the record contents will be performed by the owner of the record type.
   **/
  public DbmCheckRetrieveStartDetails performClientConsistencyCheck(Boolean performClientConsistencyCheck) {
    this.performClientConsistencyCheck = performClientConsistencyCheck;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When true, a check of the record contents will be performed by the owner of the record type.")
  @JsonProperty("performClientConsistencyCheck")
  public Boolean getPerformClientConsistencyCheck() {
    return performClientConsistencyCheck;
  }
  
  public void setPerformClientConsistencyCheck(Boolean performClientConsistencyCheck) {
    this.performClientConsistencyCheck = performClientConsistencyCheck;
  }

  
  /**
   * Specifies which storage device contains the image to be checked.
   **/
  public DbmCheckRetrieveStartDetails sourceLocation(SourceLocationEnum sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies which storage device contains the image to be checked.")
  @JsonProperty("sourceLocation")
  public SourceLocationEnum getSourceLocation() {
    return sourceLocation;
  }
  
  public void setSourceLocation(SourceLocationEnum sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbmCheckRetrieveStartDetails dbmCheckRetrieveStartDetails = (DbmCheckRetrieveStartDetails) o;
    return Objects.equals(this.performLogicalConsistencyCheck, dbmCheckRetrieveStartDetails.performLogicalConsistencyCheck) &&
        Objects.equals(this.performBlockConsistencyCheck, dbmCheckRetrieveStartDetails.performBlockConsistencyCheck) &&
        Objects.equals(this.performClientConsistencyCheck, dbmCheckRetrieveStartDetails.performClientConsistencyCheck) &&
        Objects.equals(this.sourceLocation, dbmCheckRetrieveStartDetails.sourceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performLogicalConsistencyCheck, performBlockConsistencyCheck, performClientConsistencyCheck, sourceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbmCheckRetrieveStartDetails {\n");
    
    sb.append("    performLogicalConsistencyCheck: ").append(toIndentedString(performLogicalConsistencyCheck)).append("\n");
    sb.append("    performBlockConsistencyCheck: ").append(toIndentedString(performBlockConsistencyCheck)).append("\n");
    sb.append("    performClientConsistencyCheck: ").append(toIndentedString(performClientConsistencyCheck)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
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

