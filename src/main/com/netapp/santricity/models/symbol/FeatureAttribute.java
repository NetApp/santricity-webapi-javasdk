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
 * FeatureAttribute
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FeatureAttribute   {
  

  /**
   * This enumeration identifies the defined feature attributes.
   */
  public enum FeatureAttrIdEnum {
    shippedEnabled("shippedEnabled"),
    shippedLimit("shippedLimit"),
    keyEnabled("keyEnabled"),
    keyLimit("keyLimit"),
    supportedValues("supportedValues"),
    subjectToGoldKey("subjectToGoldKey"),
    evalDuration("evalDuration"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FeatureAttrIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FeatureAttrIdEnum featureAttrId;

    private Boolean keyEnabled;

    private Integer keyLimit;

    private Boolean shippedEnabled;

    private Integer shippedLimit;

    private Boolean subjectToGoldKey;

    private List<String> supportedValues;

    private Integer evaluationDuration;

  
  /**
   * This enumeration identifies the defined feature attributes.
   **/
  public FeatureAttribute featureAttrId(FeatureAttrIdEnum featureAttrId) {
    this.featureAttrId = featureAttrId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration identifies the defined feature attributes.")
  @JsonProperty("featureAttrId")
  public FeatureAttrIdEnum getFeatureAttrId() {
    return featureAttrId;
  }
  
  public void setFeatureAttrId(FeatureAttrIdEnum featureAttrId) {
    this.featureAttrId = featureAttrId;
  }

  
  /**
   * The boolean value for a \"KEY ENABLED\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_KEY_ENABLED.
   **/
  public FeatureAttribute keyEnabled(Boolean keyEnabled) {
    this.keyEnabled = keyEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The boolean value for a \"KEY ENABLED\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_KEY_ENABLED.")
  @JsonProperty("keyEnabled")
  public Boolean getKeyEnabled() {
    return keyEnabled;
  }
  
  public void setKeyEnabled(Boolean keyEnabled) {
    this.keyEnabled = keyEnabled;
  }

  
  /**
   * The integer value for a \"KEY LIMIT\" attribute. This field is only present if featureAttrId is equal to FEAUTRE_ATTR_KEY_LIMIT.
   **/
  public FeatureAttribute keyLimit(Integer keyLimit) {
    this.keyLimit = keyLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The integer value for a \"KEY LIMIT\" attribute. This field is only present if featureAttrId is equal to FEAUTRE_ATTR_KEY_LIMIT.")
  @JsonProperty("keyLimit")
  public Integer getKeyLimit() {
    return keyLimit;
  }
  
  public void setKeyLimit(Integer keyLimit) {
    this.keyLimit = keyLimit;
  }

  
  /**
   * The boolean value for a \"SHIPPED ENABLED\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_SHIPPED_ENABLED.
   **/
  public FeatureAttribute shippedEnabled(Boolean shippedEnabled) {
    this.shippedEnabled = shippedEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The boolean value for a \"SHIPPED ENABLED\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_SHIPPED_ENABLED.")
  @JsonProperty("shippedEnabled")
  public Boolean getShippedEnabled() {
    return shippedEnabled;
  }
  
  public void setShippedEnabled(Boolean shippedEnabled) {
    this.shippedEnabled = shippedEnabled;
  }

  
  /**
   * The integer value for a \"SHIPPED LIMIT\" attribute. This field is only present if featurAttrId is equal to FEATURE_ATTR_SHIPPED_LIMIT.
   **/
  public FeatureAttribute shippedLimit(Integer shippedLimit) {
    this.shippedLimit = shippedLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The integer value for a \"SHIPPED LIMIT\" attribute. This field is only present if featurAttrId is equal to FEATURE_ATTR_SHIPPED_LIMIT.")
  @JsonProperty("shippedLimit")
  public Integer getShippedLimit() {
    return shippedLimit;
  }
  
  public void setShippedLimit(Integer shippedLimit) {
    this.shippedLimit = shippedLimit;
  }

  
  /**
   * The boolean value for a \"SUBJECT_TO_GOLD_KEY\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_SUBJECT_TO_GOLD_KEY.
   **/
  public FeatureAttribute subjectToGoldKey(Boolean subjectToGoldKey) {
    this.subjectToGoldKey = subjectToGoldKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The boolean value for a \"SUBJECT_TO_GOLD_KEY\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_SUBJECT_TO_GOLD_KEY.")
  @JsonProperty("subjectToGoldKey")
  public Boolean getSubjectToGoldKey() {
    return subjectToGoldKey;
  }
  
  public void setSubjectToGoldKey(Boolean subjectToGoldKey) {
    this.subjectToGoldKey = subjectToGoldKey;
  }

  
  /**
   * The set of string values for a \"SUPPORTED VALUES\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_SUPPORTED_VALUES.
   **/
  public FeatureAttribute supportedValues(List<String> supportedValues) {
    this.supportedValues = supportedValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of string values for a \"SUPPORTED VALUES\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_SUPPORTED_VALUES.")
  @JsonProperty("supportedValues")
  public List<String> getSupportedValues() {
    return supportedValues;
  }
  
  public void setSupportedValues(List<String> supportedValues) {
    this.supportedValues = supportedValues;
  }

  
  /**
   * An unsigned integer representing the number of days for the \"EVALUATION DURATION\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_EVAL_DURATION.
   **/
  public FeatureAttribute evaluationDuration(Integer evaluationDuration) {
    this.evaluationDuration = evaluationDuration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An unsigned integer representing the number of days for the \"EVALUATION DURATION\" attribute. This field is only present if featureAttrId is equal to FEATURE_ATTR_EVAL_DURATION.")
  @JsonProperty("evaluationDuration")
  public Integer getEvaluationDuration() {
    return evaluationDuration;
  }
  
  public void setEvaluationDuration(Integer evaluationDuration) {
    this.evaluationDuration = evaluationDuration;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureAttribute featureAttribute = (FeatureAttribute) o;
    return Objects.equals(this.featureAttrId, featureAttribute.featureAttrId) &&
        Objects.equals(this.keyEnabled, featureAttribute.keyEnabled) &&
        Objects.equals(this.keyLimit, featureAttribute.keyLimit) &&
        Objects.equals(this.shippedEnabled, featureAttribute.shippedEnabled) &&
        Objects.equals(this.shippedLimit, featureAttribute.shippedLimit) &&
        Objects.equals(this.subjectToGoldKey, featureAttribute.subjectToGoldKey) &&
        Objects.equals(this.supportedValues, featureAttribute.supportedValues) &&
        Objects.equals(this.evaluationDuration, featureAttribute.evaluationDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureAttrId, keyEnabled, keyLimit, shippedEnabled, shippedLimit, subjectToGoldKey, supportedValues, evaluationDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureAttribute {\n");
    
    sb.append("    featureAttrId: ").append(toIndentedString(featureAttrId)).append("\n");
    sb.append("    keyEnabled: ").append(toIndentedString(keyEnabled)).append("\n");
    sb.append("    keyLimit: ").append(toIndentedString(keyLimit)).append("\n");
    sb.append("    shippedEnabled: ").append(toIndentedString(shippedEnabled)).append("\n");
    sb.append("    shippedLimit: ").append(toIndentedString(shippedLimit)).append("\n");
    sb.append("    subjectToGoldKey: ").append(toIndentedString(subjectToGoldKey)).append("\n");
    sb.append("    supportedValues: ").append(toIndentedString(supportedValues)).append("\n");
    sb.append("    evaluationDuration: ").append(toIndentedString(evaluationDuration)).append("\n");
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

