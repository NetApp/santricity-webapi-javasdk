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
 * SaveConfigSpec
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class SaveConfigSpec   {
  
    private Boolean storageArraySettings;

    private Boolean volumeConfiguration;

    private Boolean hostConfiguration;

    private Boolean volumeMappings;

  
  /**
   * Set true to save general storage array settings.
   **/
  public SaveConfigSpec storageArraySettings(Boolean storageArraySettings) {
    this.storageArraySettings = storageArraySettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set true to save general storage array settings.")
  @JsonProperty("storageArraySettings")
  public Boolean getStorageArraySettings() {
    return storageArraySettings;
  }
  
  public void setStorageArraySettings(Boolean storageArraySettings) {
    this.storageArraySettings = storageArraySettings;
  }

  
  /**
   * Set true to save storage array volume configuration.
   **/
  public SaveConfigSpec volumeConfiguration(Boolean volumeConfiguration) {
    this.volumeConfiguration = volumeConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set true to save storage array volume configuration.")
  @JsonProperty("volumeConfiguration")
  public Boolean getVolumeConfiguration() {
    return volumeConfiguration;
  }
  
  public void setVolumeConfiguration(Boolean volumeConfiguration) {
    this.volumeConfiguration = volumeConfiguration;
  }

  
  /**
   * Set true to save host and host port configuration.
   **/
  public SaveConfigSpec hostConfiguration(Boolean hostConfiguration) {
    this.hostConfiguration = hostConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set true to save host and host port configuration.")
  @JsonProperty("hostConfiguration")
  public Boolean getHostConfiguration() {
    return hostConfiguration;
  }
  
  public void setHostConfiguration(Boolean hostConfiguration) {
    this.hostConfiguration = hostConfiguration;
  }

  
  /**
   * Set true to save volume mappings.
   **/
  public SaveConfigSpec volumeMappings(Boolean volumeMappings) {
    this.volumeMappings = volumeMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set true to save volume mappings.")
  @JsonProperty("volumeMappings")
  public Boolean getVolumeMappings() {
    return volumeMappings;
  }
  
  public void setVolumeMappings(Boolean volumeMappings) {
    this.volumeMappings = volumeMappings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveConfigSpec saveConfigSpec = (SaveConfigSpec) o;
    return Objects.equals(this.storageArraySettings, saveConfigSpec.storageArraySettings) &&
        Objects.equals(this.volumeConfiguration, saveConfigSpec.volumeConfiguration) &&
        Objects.equals(this.hostConfiguration, saveConfigSpec.hostConfiguration) &&
        Objects.equals(this.volumeMappings, saveConfigSpec.volumeMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageArraySettings, volumeConfiguration, hostConfiguration, volumeMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveConfigSpec {\n");
    
    sb.append("    storageArraySettings: ").append(toIndentedString(storageArraySettings)).append("\n");
    sb.append("    volumeConfiguration: ").append(toIndentedString(volumeConfiguration)).append("\n");
    sb.append("    hostConfiguration: ").append(toIndentedString(hostConfiguration)).append("\n");
    sb.append("    volumeMappings: ").append(toIndentedString(volumeMappings)).append("\n");
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

