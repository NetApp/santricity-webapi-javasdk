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
 * SupportDataRequest
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class SupportDataRequest   {
  

  /**
   * The name of the file to be retrieved.
   */
  public enum TypeEnum {
    driveData("driveData"),
    traceBuffers("traceBuffers"),
    ioPathStatistics("ioPathStatistics"),
    supportBundle("supportBundle"),
    coreDump("coreDump"),
    storageArrayConfiguration("storageArrayConfiguration"),
    deviceProfile("deviceProfile"),
    firmwareInventory("firmwareInventory"),
    unreadableSectors("unreadableSectors"),
    iscsiSessionsConnections("iscsiSessionsConnections");
;
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TypeEnum type;

    private String filename;

    private TraceBufferSpec traceSpec;

    private DriveRefList driveSpec;

    private SaveConfigSpec saveConfigSpec;

  
  /**
   * The name of the file to be retrieved.
   **/
  public SupportDataRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the file to be retrieved.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Specify the name of the file, which will be utilized if it doesn't already exist.
   **/
  public SupportDataRequest filename(String filename) {
    this.filename = filename;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specify the name of the file, which will be utilized if it doesn't already exist.")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  
  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  /**
   * Specifies the controllers to retrieve data from for type=traceBuffers
   **/
  public SupportDataRequest traceSpec(TraceBufferSpec traceSpec) {
    this.traceSpec = traceSpec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the controllers to retrieve data from for type=traceBuffers")
  @JsonProperty("traceSpec")
  public TraceBufferSpec getTraceSpec() {
    return traceSpec;
  }
  
  public void setTraceSpec(TraceBufferSpec traceSpec) {
    this.traceSpec = traceSpec;
  }

  
  /**
   * Specifies the drives to retrieve logs for for type=driveData
   **/
  public SupportDataRequest driveSpec(DriveRefList driveSpec) {
    this.driveSpec = driveSpec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the drives to retrieve logs for for type=driveData")
  @JsonProperty("driveSpec")
  public DriveRefList getDriveSpec() {
    return driveSpec;
  }
  
  public void setDriveSpec(DriveRefList driveSpec) {
    this.driveSpec = driveSpec;
  }

  
  /**
   * Specifies the settings for type=storageArrayConfiguration
   **/
  public SupportDataRequest saveConfigSpec(SaveConfigSpec saveConfigSpec) {
    this.saveConfigSpec = saveConfigSpec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the settings for type=storageArrayConfiguration")
  @JsonProperty("saveConfigSpec")
  public SaveConfigSpec getSaveConfigSpec() {
    return saveConfigSpec;
  }
  
  public void setSaveConfigSpec(SaveConfigSpec saveConfigSpec) {
    this.saveConfigSpec = saveConfigSpec;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportDataRequest supportDataRequest = (SupportDataRequest) o;
    return Objects.equals(this.type, supportDataRequest.type) &&
        Objects.equals(this.filename, supportDataRequest.filename) &&
        Objects.equals(this.traceSpec, supportDataRequest.traceSpec) &&
        Objects.equals(this.driveSpec, supportDataRequest.driveSpec) &&
        Objects.equals(this.saveConfigSpec, supportDataRequest.saveConfigSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, filename, traceSpec, driveSpec, saveConfigSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportDataRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    traceSpec: ").append(toIndentedString(traceSpec)).append("\n");
    sb.append("    driveSpec: ").append(toIndentedString(driveSpec)).append("\n");
    sb.append("    saveConfigSpec: ").append(toIndentedString(saveConfigSpec)).append("\n");
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

