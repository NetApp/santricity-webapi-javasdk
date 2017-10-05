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
 * The results of the last configuration operation
 */
@ApiModel(description = "The results of the last configuration operation")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class ConfigurationResult   {
  
    private Date startDate;

    private Date endDate;

    private List<ConfigurationResultItem> currentResults;

    private Integer totalSystems;

    private Integer numberDone;

    private Boolean operationDone;

  
  /**
   * The time the configuration operation started
   **/
  public ConfigurationResult startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the configuration operation started")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The time the operation finished.  Null if an operation is in progress
   **/
  public ConfigurationResult endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the operation finished.  Null if an operation is in progress")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * The list of results for each system being configured.  The size of this list will be < total until the operation is finished
   **/
  public ConfigurationResult currentResults(List<ConfigurationResultItem> currentResults) {
    this.currentResults = currentResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of results for each system being configured.  The size of this list will be < total until the operation is finished")
  @JsonProperty("currentResults")
  public List<ConfigurationResultItem> getCurrentResults() {
    return currentResults;
  }
  
  public void setCurrentResults(List<ConfigurationResultItem> currentResults) {
    this.currentResults = currentResults;
  }

  
  /**
   * the total number of systems requested to be configured
   **/
  public ConfigurationResult totalSystems(Integer totalSystems) {
    this.totalSystems = totalSystems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the total number of systems requested to be configured")
  @JsonProperty("totalSystems")
  public Integer getTotalSystems() {
    return totalSystems;
  }
  
  public void setTotalSystems(Integer totalSystems) {
    this.totalSystems = totalSystems;
  }

  
  /**
   * the number of system currently attempted
   **/
  public ConfigurationResult numberDone(Integer numberDone) {
    this.numberDone = numberDone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the number of system currently attempted")
  @JsonProperty("numberDone")
  public Integer getNumberDone() {
    return numberDone;
  }
  
  public void setNumberDone(Integer numberDone) {
    this.numberDone = numberDone;
  }

  
  /**
   * true when the configuration operation is finished
   **/
  public ConfigurationResult operationDone(Boolean operationDone) {
    this.operationDone = operationDone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true when the configuration operation is finished")
  @JsonProperty("operationDone")
  public Boolean getOperationDone() {
    return operationDone;
  }
  
  public void setOperationDone(Boolean operationDone) {
    this.operationDone = operationDone;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationResult configurationResult = (ConfigurationResult) o;
    return Objects.equals(this.startDate, configurationResult.startDate) &&
        Objects.equals(this.endDate, configurationResult.endDate) &&
        Objects.equals(this.currentResults, configurationResult.currentResults) &&
        Objects.equals(this.totalSystems, configurationResult.totalSystems) &&
        Objects.equals(this.numberDone, configurationResult.numberDone) &&
        Objects.equals(this.operationDone, configurationResult.operationDone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, currentResults, totalSystems, numberDone, operationDone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationResult {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    currentResults: ").append(toIndentedString(currentResults)).append("\n");
    sb.append("    totalSystems: ").append(toIndentedString(totalSystems)).append("\n");
    sb.append("    numberDone: ").append(toIndentedString(numberDone)).append("\n");
    sb.append("    operationDone: ").append(toIndentedString(operationDone)).append("\n");
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

