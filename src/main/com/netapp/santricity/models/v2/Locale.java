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
 * Locale
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2017-10-04T15:05:52.333-05:00")
public class Locale   {
  
    private String language;

    private String script;

    private String country;

    private String variant;

    private List<String> extensionKeys;

    private List<String> unicodeLocaleAttributes;

    private List<String> unicodeLocaleKeys;

    private String iso3Language;

    private String iso3Country;

    private String displayLanguage;

    private String displayScript;

    private String displayCountry;

    private String displayVariant;

    private String displayName;

  
  /**
   **/
  public Locale language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   **/
  public Locale script(String script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public String getScript() {
    return script;
  }
  
  public void setScript(String script) {
    this.script = script;
  }

  
  /**
   **/
  public Locale country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  public Locale variant(String variant) {
    this.variant = variant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("variant")
  public String getVariant() {
    return variant;
  }
  
  public void setVariant(String variant) {
    this.variant = variant;
  }

  
  /**
   **/
  public Locale extensionKeys(List<String> extensionKeys) {
    this.extensionKeys = extensionKeys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extensionKeys")
  public List<String> getExtensionKeys() {
    return extensionKeys;
  }
  
  public void setExtensionKeys(List<String> extensionKeys) {
    this.extensionKeys = extensionKeys;
  }

  
  /**
   **/
  public Locale unicodeLocaleAttributes(List<String> unicodeLocaleAttributes) {
    this.unicodeLocaleAttributes = unicodeLocaleAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unicodeLocaleAttributes")
  public List<String> getUnicodeLocaleAttributes() {
    return unicodeLocaleAttributes;
  }
  
  public void setUnicodeLocaleAttributes(List<String> unicodeLocaleAttributes) {
    this.unicodeLocaleAttributes = unicodeLocaleAttributes;
  }

  
  /**
   **/
  public Locale unicodeLocaleKeys(List<String> unicodeLocaleKeys) {
    this.unicodeLocaleKeys = unicodeLocaleKeys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unicodeLocaleKeys")
  public List<String> getUnicodeLocaleKeys() {
    return unicodeLocaleKeys;
  }
  
  public void setUnicodeLocaleKeys(List<String> unicodeLocaleKeys) {
    this.unicodeLocaleKeys = unicodeLocaleKeys;
  }

  
  /**
   **/
  public Locale iso3Language(String iso3Language) {
    this.iso3Language = iso3Language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("iso3Language")
  public String getIso3Language() {
    return iso3Language;
  }
  
  public void setIso3Language(String iso3Language) {
    this.iso3Language = iso3Language;
  }

  
  /**
   **/
  public Locale iso3Country(String iso3Country) {
    this.iso3Country = iso3Country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("iso3Country")
  public String getIso3Country() {
    return iso3Country;
  }
  
  public void setIso3Country(String iso3Country) {
    this.iso3Country = iso3Country;
  }

  
  /**
   **/
  public Locale displayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayLanguage")
  public String getDisplayLanguage() {
    return displayLanguage;
  }
  
  public void setDisplayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
  }

  
  /**
   **/
  public Locale displayScript(String displayScript) {
    this.displayScript = displayScript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayScript")
  public String getDisplayScript() {
    return displayScript;
  }
  
  public void setDisplayScript(String displayScript) {
    this.displayScript = displayScript;
  }

  
  /**
   **/
  public Locale displayCountry(String displayCountry) {
    this.displayCountry = displayCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayCountry")
  public String getDisplayCountry() {
    return displayCountry;
  }
  
  public void setDisplayCountry(String displayCountry) {
    this.displayCountry = displayCountry;
  }

  
  /**
   **/
  public Locale displayVariant(String displayVariant) {
    this.displayVariant = displayVariant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayVariant")
  public String getDisplayVariant() {
    return displayVariant;
  }
  
  public void setDisplayVariant(String displayVariant) {
    this.displayVariant = displayVariant;
  }

  
  /**
   **/
  public Locale displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Locale locale = (Locale) o;
    return Objects.equals(this.language, locale.language) &&
        Objects.equals(this.script, locale.script) &&
        Objects.equals(this.country, locale.country) &&
        Objects.equals(this.variant, locale.variant) &&
        Objects.equals(this.extensionKeys, locale.extensionKeys) &&
        Objects.equals(this.unicodeLocaleAttributes, locale.unicodeLocaleAttributes) &&
        Objects.equals(this.unicodeLocaleKeys, locale.unicodeLocaleKeys) &&
        Objects.equals(this.iso3Language, locale.iso3Language) &&
        Objects.equals(this.iso3Country, locale.iso3Country) &&
        Objects.equals(this.displayLanguage, locale.displayLanguage) &&
        Objects.equals(this.displayScript, locale.displayScript) &&
        Objects.equals(this.displayCountry, locale.displayCountry) &&
        Objects.equals(this.displayVariant, locale.displayVariant) &&
        Objects.equals(this.displayName, locale.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, script, country, variant, extensionKeys, unicodeLocaleAttributes, unicodeLocaleKeys, iso3Language, iso3Country, displayLanguage, displayScript, displayCountry, displayVariant, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Locale {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    extensionKeys: ").append(toIndentedString(extensionKeys)).append("\n");
    sb.append("    unicodeLocaleAttributes: ").append(toIndentedString(unicodeLocaleAttributes)).append("\n");
    sb.append("    unicodeLocaleKeys: ").append(toIndentedString(unicodeLocaleKeys)).append("\n");
    sb.append("    iso3Language: ").append(toIndentedString(iso3Language)).append("\n");
    sb.append("    iso3Country: ").append(toIndentedString(iso3Country)).append("\n");
    sb.append("    displayLanguage: ").append(toIndentedString(displayLanguage)).append("\n");
    sb.append("    displayScript: ").append(toIndentedString(displayScript)).append("\n");
    sb.append("    displayCountry: ").append(toIndentedString(displayCountry)).append("\n");
    sb.append("    displayVariant: ").append(toIndentedString(displayVariant)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

