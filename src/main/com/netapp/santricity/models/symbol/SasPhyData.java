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
 * SasPhyData
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:55.769-05:00")
public class SasPhyData   {
  
    private Integer phyIdentifier;

    private Boolean isValid;


  /**
   * The current negotiated physical link rate for the PHY.
   */
  public enum CurrentSpeedEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    speed25gig("speed25gig"),
    speed32gig("speed32gig"),
    speed100gig("speed100gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    CurrentSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private CurrentSpeedEnum currentSpeed;


  /**
   * The hardware maximum physical link rate for the PHY.
   */
  public enum MaximumSpeedEnum {
    speedUnknown("speedUnknown"),
    speed1gig("speed1gig"),
    speed2gig("speed2gig"),
    speed4gig("speed4gig"),
    speed10gig("speed10gig"),
    speed15gig("speed15gig"),
    speed3gig("speed3gig"),
    speed10meg("speed10meg"),
    speed100meg("speed100meg"),
    speed2pt5Gig("speed2pt5Gig"),
    speed5gig("speed5gig"),
    speed20gig("speed20gig"),
    speed30gig("speed30gig"),
    speed60gig("speed60gig"),
    speed8gig("speed8gig"),
    speed6gig("speed6gig"),
    speed40gig("speed40gig"),
    speed16gig("speed16gig"),
    speed56gig("speed56gig"),
    speed12gig("speed12gig"),
    speed25gig("speed25gig"),
    speed32gig("speed32gig"),
    speed100gig("speed100gig"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MaximumSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MaximumSpeedEnum maximumSpeed;

    private SasPhyErrorCounts errorCounts;

  
  /**
   * A number in the range 0 - 127 that is the PHY identifier.
   **/
  public SasPhyData phyIdentifier(Integer phyIdentifier) {
    this.phyIdentifier = phyIdentifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A number in the range 0 - 127 that is the PHY identifier.")
  @JsonProperty("phyIdentifier")
  public Integer getPhyIdentifier() {
    return phyIdentifier;
  }
  
  public void setPhyIdentifier(Integer phyIdentifier) {
    this.phyIdentifier = phyIdentifier;
  }

  
  /**
   * When false, an indication that, though the associated attached device exists, the rest of the data in the structure could not be obtained.
   **/
  public SasPhyData isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When false, an indication that, though the associated attached device exists, the rest of the data in the structure could not be obtained.")
  @JsonProperty("isValid")
  public Boolean getIsValid() {
    return isValid;
  }
  
  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  
  /**
   * The current negotiated physical link rate for the PHY.
   **/
  public SasPhyData currentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current negotiated physical link rate for the PHY.")
  @JsonProperty("currentSpeed")
  public CurrentSpeedEnum getCurrentSpeed() {
    return currentSpeed;
  }
  
  public void setCurrentSpeed(CurrentSpeedEnum currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  
  /**
   * The hardware maximum physical link rate for the PHY.
   **/
  public SasPhyData maximumSpeed(MaximumSpeedEnum maximumSpeed) {
    this.maximumSpeed = maximumSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The hardware maximum physical link rate for the PHY.")
  @JsonProperty("maximumSpeed")
  public MaximumSpeedEnum getMaximumSpeed() {
    return maximumSpeed;
  }
  
  public void setMaximumSpeed(MaximumSpeedEnum maximumSpeed) {
    this.maximumSpeed = maximumSpeed;
  }

  
  /**
   * A collection of PHY error count values.
   **/
  public SasPhyData errorCounts(SasPhyErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A collection of PHY error count values.")
  @JsonProperty("errorCounts")
  public SasPhyErrorCounts getErrorCounts() {
    return errorCounts;
  }
  
  public void setErrorCounts(SasPhyErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasPhyData sasPhyData = (SasPhyData) o;
    return Objects.equals(this.phyIdentifier, sasPhyData.phyIdentifier) &&
        Objects.equals(this.isValid, sasPhyData.isValid) &&
        Objects.equals(this.currentSpeed, sasPhyData.currentSpeed) &&
        Objects.equals(this.maximumSpeed, sasPhyData.maximumSpeed) &&
        Objects.equals(this.errorCounts, sasPhyData.errorCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phyIdentifier, isValid, currentSpeed, maximumSpeed, errorCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasPhyData {\n");
    
    sb.append("    phyIdentifier: ").append(toIndentedString(phyIdentifier)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    currentSpeed: ").append(toIndentedString(currentSpeed)).append("\n");
    sb.append("    maximumSpeed: ").append(toIndentedString(maximumSpeed)).append("\n");
    sb.append("    errorCounts: ").append(toIndentedString(errorCounts)).append("\n");
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

