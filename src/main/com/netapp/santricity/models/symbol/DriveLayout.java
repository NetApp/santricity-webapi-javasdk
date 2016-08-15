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
 * DriveLayout
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class DriveLayout   {
  

  /**
   * The drive orientation in the drawer or tray.
   */
  public enum DriveOrientationEnum {
    none("none"),
    horizontal("horizontal"),
    vertical("vertical"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DriveOrientationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private DriveOrientationEnum driveOrientation;

    private Integer numRows;

    private Integer numColumns;


  /**
   * The primary traversal method for the drawer or tray. If driveOrientation field is set to \"None\", the value of this field should be TRAVERSAL_NONE
   */
  public enum PrimaryTraversalEnum {
    none("none"),
    leftToRight("leftToRight"),
    rightToLeft("rightToLeft"),
    topToBottom("topToBottom"),
    frontToBack("frontToBack"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    PrimaryTraversalEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private PrimaryTraversalEnum primaryTraversal;


  /**
   * The secondary traversal method for the drawer or tray. If driveOrientation field is set to \"None\", the value of this field should be TRAVERSAL_NONE
   */
  public enum SecondaryTraversalEnum {
    none("none"),
    leftToRight("leftToRight"),
    rightToLeft("rightToLeft"),
    topToBottom("topToBottom"),
    frontToBack("frontToBack"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    SecondaryTraversalEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private SecondaryTraversalEnum secondaryTraversal;

  
  /**
   * The drive orientation in the drawer or tray.
   **/
  public DriveLayout driveOrientation(DriveOrientationEnum driveOrientation) {
    this.driveOrientation = driveOrientation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The drive orientation in the drawer or tray.")
  @JsonProperty("driveOrientation")
  public DriveOrientationEnum getDriveOrientation() {
    return driveOrientation;
  }
  
  public void setDriveOrientation(DriveOrientationEnum driveOrientation) {
    this.driveOrientation = driveOrientation;
  }

  
  /**
   * The number of rows in the drive layout. If driveOrientation field is set to \"None\", the value of this field should be zero.
   **/
  public DriveLayout numRows(Integer numRows) {
    this.numRows = numRows;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of rows in the drive layout. If driveOrientation field is set to \"None\", the value of this field should be zero.")
  @JsonProperty("numRows")
  public Integer getNumRows() {
    return numRows;
  }
  
  public void setNumRows(Integer numRows) {
    this.numRows = numRows;
  }

  
  /**
   * The number of columns in the drive layout. If driveOrientation field is set to \"None\", the value of this field should be zero.
   **/
  public DriveLayout numColumns(Integer numColumns) {
    this.numColumns = numColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of columns in the drive layout. If driveOrientation field is set to \"None\", the value of this field should be zero.")
  @JsonProperty("numColumns")
  public Integer getNumColumns() {
    return numColumns;
  }
  
  public void setNumColumns(Integer numColumns) {
    this.numColumns = numColumns;
  }

  
  /**
   * The primary traversal method for the drawer or tray. If driveOrientation field is set to \"None\", the value of this field should be TRAVERSAL_NONE
   **/
  public DriveLayout primaryTraversal(PrimaryTraversalEnum primaryTraversal) {
    this.primaryTraversal = primaryTraversal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The primary traversal method for the drawer or tray. If driveOrientation field is set to \"None\", the value of this field should be TRAVERSAL_NONE")
  @JsonProperty("primaryTraversal")
  public PrimaryTraversalEnum getPrimaryTraversal() {
    return primaryTraversal;
  }
  
  public void setPrimaryTraversal(PrimaryTraversalEnum primaryTraversal) {
    this.primaryTraversal = primaryTraversal;
  }

  
  /**
   * The secondary traversal method for the drawer or tray. If driveOrientation field is set to \"None\", the value of this field should be TRAVERSAL_NONE
   **/
  public DriveLayout secondaryTraversal(SecondaryTraversalEnum secondaryTraversal) {
    this.secondaryTraversal = secondaryTraversal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The secondary traversal method for the drawer or tray. If driveOrientation field is set to \"None\", the value of this field should be TRAVERSAL_NONE")
  @JsonProperty("secondaryTraversal")
  public SecondaryTraversalEnum getSecondaryTraversal() {
    return secondaryTraversal;
  }
  
  public void setSecondaryTraversal(SecondaryTraversalEnum secondaryTraversal) {
    this.secondaryTraversal = secondaryTraversal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveLayout driveLayout = (DriveLayout) o;
    return Objects.equals(this.driveOrientation, driveLayout.driveOrientation) &&
        Objects.equals(this.numRows, driveLayout.numRows) &&
        Objects.equals(this.numColumns, driveLayout.numColumns) &&
        Objects.equals(this.primaryTraversal, driveLayout.primaryTraversal) &&
        Objects.equals(this.secondaryTraversal, driveLayout.secondaryTraversal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveOrientation, numRows, numColumns, primaryTraversal, secondaryTraversal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveLayout {\n");
    
    sb.append("    driveOrientation: ").append(toIndentedString(driveOrientation)).append("\n");
    sb.append("    numRows: ").append(toIndentedString(numRows)).append("\n");
    sb.append("    numColumns: ").append(toIndentedString(numColumns)).append("\n");
    sb.append("    primaryTraversal: ").append(toIndentedString(primaryTraversal)).append("\n");
    sb.append("    secondaryTraversal: ").append(toIndentedString(secondaryTraversal)).append("\n");
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

