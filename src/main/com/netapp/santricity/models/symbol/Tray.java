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
 * Tray
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class Tray   {
  

  /**
   * An indication of the type of the tray.
   */
  public enum TypeEnum {
    sym1000("sym1000"),
    sym2000("sym2000"),
    sym2772("sym2772"),
    pciraid("pciraid"),
    generic("generic"),
    sym2200("sym2200"),
    sym1200("sym1200"),
    sym2882("sym2882"),
    sym1500("sym1500"),
    fc4600("fc4600"),
    ss3600("ss3600"),
    md1000("md1000"),
    md3000("md3000"),
    xbb2("xbb2"),
    fc6900("fc6900"),
    md1200("md1200"),
    md1220("md1220"),
    de1600("de1600"),
    de5600("de5600"),
    de6600("de6600"),
    de7600("de7600"),
    de6650("de6650"),
    sc12("sc12"),
    sc24("sc24"),
    de212c("de212c"),
    de224c("de224c"),
    de460c("de460c"),
    __UNDEFINED("__UNDEFINED");
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


  /**
   * An indication of the physical orientation (horizontal or vertical) of the tray.
   */
  public enum OrientationEnum {
    horizontal("horizontal"),
    vertical("vertical"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    OrientationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private OrientationEnum orientation;

    private Integer numControllerSlots;

    private Integer numDriveSlots;

    private Integer trayId;

    private String trayRef;

    private Boolean nonRedundantAccess;

    private String partNumber;

    private String serialNumber;

    private String vendorName;

    private Long manufacturerDate;

    private String fruType;

    private Boolean trayIDMismatch;

    private Boolean trayIDConflict;

    private Boolean esmVersionMismatch;

    private Boolean esmMiswire;

    private Boolean drvMHSpeedMismatch;

    private Boolean unsupportedTray;

    private Integer workingChannel;


  /**
   * The maximum speed of the drive channels,
   */
  public enum MaxSpeedEnum {
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
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    MaxSpeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private MaxSpeedEnum maxSpeed;


  /**
   * The interface technology. This field is deprecated. Equivalent information is available in the driveTechnologies and frontEndInterfaceTechnology fields.
   */
  public enum TrayTechnologyTypeEnum {
    unknown("unknown"),
    scsiScsi("scsiScsi"),
    fibreFibre("fibreFibre"),
    fibreSata("fibreSata"),
    fibrePata("fibrePata"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    TrayTechnologyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private TrayTechnologyTypeEnum trayTechnologyType;

    private Boolean esmGroupError;

    private Boolean uncertifiedTray;

    private Boolean locateTray;

    private Boolean esmHardwareMismatch;

    private Boolean hasConfigurableTrayId;


  /**
   * The front-end I/O interface technology of the tray.
   */
  public enum FrontEndInterfaceTechnologyEnum {
    notImplemented("notImplemented"),
    scsi("scsi"),
    fc("fc"),
    sata("sata"),
    sas("sas"),
    iscsi("iscsi"),
    ib("ib"),
    fcoe("fcoe"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FrontEndInterfaceTechnologyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FrontEndInterfaceTechnologyEnum frontEndInterfaceTechnology;


  /**
   * Gets or Sets driveTechnologies
   */
  public enum DriveTechnologiesEnum {
    all("all"),
    scsi("scsi"),
    fibre("fibre"),
    sata("sata"),
    pata("pata"),
    fibre520b("fibre520b"),
    sas("sas"),
    unknown("unknown"),
    sas4k("sas4k"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    DriveTechnologiesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private List<DriveTechnologiesEnum> driveTechnologies;

    private Integer numDriveCompartments;

    private Integer numDriveSlotsPerCompartment;

    private List<TrayAttribute> trayAttributes;

    private Boolean isMisconfigured;

    private Boolean esmFactoryDefaultsMismatch;

    private Location physicalLocation;

    private Integer numDrawers;

    private DriveLayout driveLayout;

    private FactoryDefaultsVersionData factoryDefaultsData;

    private Boolean locateInProgress;

    private Boolean hasTrayIdentityIndicator;

    private String id;

  
  /**
   * An indication of the type of the tray.
   **/
  public Tray type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of the type of the tray.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * An indication of the physical orientation (horizontal or vertical) of the tray.
   **/
  public Tray orientation(OrientationEnum orientation) {
    this.orientation = orientation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of the physical orientation (horizontal or vertical) of the tray.")
  @JsonProperty("orientation")
  public OrientationEnum getOrientation() {
    return orientation;
  }
  
  public void setOrientation(OrientationEnum orientation) {
    this.orientation = orientation;
  }

  
  /**
   * The number of slots available for holding RAID controller boards (i.e., set to zero for a drive-only tray).
   **/
  public Tray numControllerSlots(Integer numControllerSlots) {
    this.numControllerSlots = numControllerSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of slots available for holding RAID controller boards (i.e., set to zero for a drive-only tray).")
  @JsonProperty("numControllerSlots")
  public Integer getNumControllerSlots() {
    return numControllerSlots;
  }
  
  public void setNumControllerSlots(Integer numControllerSlots) {
    this.numControllerSlots = numControllerSlots;
  }

  
  /**
   * The total number of slots available for holding disk drives.
   **/
  public Tray numDriveSlots(Integer numDriveSlots) {
    this.numDriveSlots = numDriveSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of slots available for holding disk drives.")
  @JsonProperty("numDriveSlots")
  public Integer getNumDriveSlots() {
    return numDriveSlots;
  }
  
  public void setNumDriveSlots(Integer numDriveSlots) {
    this.numDriveSlots = numDriveSlots;
  }

  
  /**
   * The tray identifier value, which is typically set using physical switches on the tray itself.
   **/
  public Tray trayId(Integer trayId) {
    this.trayId = trayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The tray identifier value, which is typically set using physical switches on the tray itself.")
  @JsonProperty("trayId")
  public Integer getTrayId() {
    return trayId;
  }
  
  public void setTrayId(Integer trayId) {
    this.trayId = trayId;
  }

  
  /**
   * The identifier value for this tray. Other objects may use this reference value to refer to the tray.
   **/
  public Tray trayRef(String trayRef) {
    this.trayRef = trayRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier value for this tray. Other objects may use this reference value to refer to the tray.")
  @JsonProperty("trayRef")
  public String getTrayRef() {
    return trayRef;
  }
  
  public void setTrayRef(String trayRef) {
    this.trayRef = trayRef;
  }

  
  /**
   * True, if the tray does not have redundant access.
   **/
  public Tray nonRedundantAccess(Boolean nonRedundantAccess) {
    this.nonRedundantAccess = nonRedundantAccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if the tray does not have redundant access.")
  @JsonProperty("nonRedundantAccess")
  public Boolean getNonRedundantAccess() {
    return nonRedundantAccess;
  }
  
  public void setNonRedundantAccess(Boolean nonRedundantAccess) {
    this.nonRedundantAccess = nonRedundantAccess;
  }

  
  /**
   * The part number of the tray from VPD data.
   **/
  public Tray partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The part number of the tray from VPD data.")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * The serial number of the tray.
   **/
  public Tray serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The serial number of the tray.")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * The name of the manufacturer of the tray.
   **/
  public Tray vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the manufacturer of the tray.")
  @JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  
  /**
   * The date the tray was manufactured.
   **/
  public Tray manufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the tray was manufactured.")
  @JsonProperty("manufacturerDate")
  public Long getManufacturerDate() {
    return manufacturerDate;
  }
  
  public void setManufacturerDate(Long manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  
  /**
   * The field replaceable unit type of the tray.
   **/
  public Tray fruType(String fruType) {
    this.fruType = fruType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The field replaceable unit type of the tray.")
  @JsonProperty("fruType")
  public String getFruType() {
    return fruType;
  }
  
  public void setFruType(String fruType) {
    this.fruType = fruType;
  }

  
  /**
   * True if the IDs on the ESMs do not match.
   **/
  public Tray trayIDMismatch(Boolean trayIDMismatch) {
    this.trayIDMismatch = trayIDMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the IDs on the ESMs do not match.")
  @JsonProperty("trayIDMismatch")
  public Boolean getTrayIDMismatch() {
    return trayIDMismatch;
  }
  
  public void setTrayIDMismatch(Boolean trayIDMismatch) {
    this.trayIDMismatch = trayIDMismatch;
  }

  
  /**
   * True if this tray ID conflicts with that of another tray.
   **/
  public Tray trayIDConflict(Boolean trayIDConflict) {
    this.trayIDConflict = trayIDConflict;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if this tray ID conflicts with that of another tray.")
  @JsonProperty("trayIDConflict")
  public Boolean getTrayIDConflict() {
    return trayIDConflict;
  }
  
  public void setTrayIDConflict(Boolean trayIDConflict) {
    this.trayIDConflict = trayIDConflict;
  }

  
  /**
   * True if the ESM firmware versions do not match.
   **/
  public Tray esmVersionMismatch(Boolean esmVersionMismatch) {
    this.esmVersionMismatch = esmVersionMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the ESM firmware versions do not match.")
  @JsonProperty("esmVersionMismatch")
  public Boolean getEsmVersionMismatch() {
    return esmVersionMismatch;
  }
  
  public void setEsmVersionMismatch(Boolean esmVersionMismatch) {
    this.esmVersionMismatch = esmVersionMismatch;
  }

  
  /**
   * True if this tray has an ESM join miswire.
   **/
  public Tray esmMiswire(Boolean esmMiswire) {
    this.esmMiswire = esmMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if this tray has an ESM join miswire.")
  @JsonProperty("esmMiswire")
  public Boolean getEsmMiswire() {
    return esmMiswire;
  }
  
  public void setEsmMiswire(Boolean esmMiswire) {
    this.esmMiswire = esmMiswire;
  }

  
  /**
   * True if this tray has a drive-side minihub speed mismatch.
   **/
  public Tray drvMHSpeedMismatch(Boolean drvMHSpeedMismatch) {
    this.drvMHSpeedMismatch = drvMHSpeedMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if this tray has a drive-side minihub speed mismatch.")
  @JsonProperty("drvMHSpeedMismatch")
  public Boolean getDrvMHSpeedMismatch() {
    return drvMHSpeedMismatch;
  }
  
  public void setDrvMHSpeedMismatch(Boolean drvMHSpeedMismatch) {
    this.drvMHSpeedMismatch = drvMHSpeedMismatch;
  }

  
  /**
   * True if this tray is an unrecognized/unsupported hardware type.
   **/
  public Tray unsupportedTray(Boolean unsupportedTray) {
    this.unsupportedTray = unsupportedTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if this tray is an unrecognized/unsupported hardware type.")
  @JsonProperty("unsupportedTray")
  public Boolean getUnsupportedTray() {
    return unsupportedTray;
  }
  
  public void setUnsupportedTray(Boolean unsupportedTray) {
    this.unsupportedTray = unsupportedTray;
  }

  
  /**
   * The channel to the tray that is still operational (if nonRedundantAccess is True).
   **/
  public Tray workingChannel(Integer workingChannel) {
    this.workingChannel = workingChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel to the tray that is still operational (if nonRedundantAccess is True).")
  @JsonProperty("workingChannel")
  public Integer getWorkingChannel() {
    return workingChannel;
  }
  
  public void setWorkingChannel(Integer workingChannel) {
    this.workingChannel = workingChannel;
  }

  
  /**
   * The maximum speed of the drive channels,
   **/
  public Tray maxSpeed(MaxSpeedEnum maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum speed of the drive channels,")
  @JsonProperty("maxSpeed")
  public MaxSpeedEnum getMaxSpeed() {
    return maxSpeed;
  }
  
  public void setMaxSpeed(MaxSpeedEnum maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  
  /**
   * The interface technology. This field is deprecated. Equivalent information is available in the driveTechnologies and frontEndInterfaceTechnology fields.
   **/
  public Tray trayTechnologyType(TrayTechnologyTypeEnum trayTechnologyType) {
    this.trayTechnologyType = trayTechnologyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The interface technology. This field is deprecated. Equivalent information is available in the driveTechnologies and frontEndInterfaceTechnology fields.")
  @JsonProperty("trayTechnologyType")
  public TrayTechnologyTypeEnum getTrayTechnologyType() {
    return trayTechnologyType;
  }
  
  public void setTrayTechnologyType(TrayTechnologyTypeEnum trayTechnologyType) {
    this.trayTechnologyType = trayTechnologyType;
  }

  
  /**
   * True if SBOD ESM trays are not properly clustered.
   **/
  public Tray esmGroupError(Boolean esmGroupError) {
    this.esmGroupError = esmGroupError;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if SBOD ESM trays are not properly clustered.")
  @JsonProperty("esmGroupError")
  public Boolean getEsmGroupError() {
    return esmGroupError;
  }
  
  public void setEsmGroupError(Boolean esmGroupError) {
    this.esmGroupError = esmGroupError;
  }

  
  /**
   * True if this tray is an uncertified hardware type.
   **/
  public Tray uncertifiedTray(Boolean uncertifiedTray) {
    this.uncertifiedTray = uncertifiedTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if this tray is an uncertified hardware type.")
  @JsonProperty("uncertifiedTray")
  public Boolean getUncertifiedTray() {
    return uncertifiedTray;
  }
  
  public void setUncertifiedTray(Boolean uncertifiedTray) {
    this.uncertifiedTray = uncertifiedTray;
  }

  
  /**
   * True if this tray supports a locate operation.
   **/
  public Tray locateTray(Boolean locateTray) {
    this.locateTray = locateTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if this tray supports a locate operation.")
  @JsonProperty("locateTray")
  public Boolean getLocateTray() {
    return locateTray;
  }
  
  public void setLocateTray(Boolean locateTray) {
    this.locateTray = locateTray;
  }

  
  /**
   * True if the ESM hardware components in the tray are mismatched.
   **/
  public Tray esmHardwareMismatch(Boolean esmHardwareMismatch) {
    this.esmHardwareMismatch = esmHardwareMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the ESM hardware components in the tray are mismatched.")
  @JsonProperty("esmHardwareMismatch")
  public Boolean getEsmHardwareMismatch() {
    return esmHardwareMismatch;
  }
  
  public void setEsmHardwareMismatch(Boolean esmHardwareMismatch) {
    this.esmHardwareMismatch = esmHardwareMismatch;
  }

  
  /**
   * True if the tray ID can be set using the updateTray procedure.
   **/
  public Tray hasConfigurableTrayId(Boolean hasConfigurableTrayId) {
    this.hasConfigurableTrayId = hasConfigurableTrayId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the tray ID can be set using the updateTray procedure.")
  @JsonProperty("hasConfigurableTrayId")
  public Boolean getHasConfigurableTrayId() {
    return hasConfigurableTrayId;
  }
  
  public void setHasConfigurableTrayId(Boolean hasConfigurableTrayId) {
    this.hasConfigurableTrayId = hasConfigurableTrayId;
  }

  
  /**
   * The front-end I/O interface technology of the tray.
   **/
  public Tray frontEndInterfaceTechnology(FrontEndInterfaceTechnologyEnum frontEndInterfaceTechnology) {
    this.frontEndInterfaceTechnology = frontEndInterfaceTechnology;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The front-end I/O interface technology of the tray.")
  @JsonProperty("frontEndInterfaceTechnology")
  public FrontEndInterfaceTechnologyEnum getFrontEndInterfaceTechnology() {
    return frontEndInterfaceTechnology;
  }
  
  public void setFrontEndInterfaceTechnology(FrontEndInterfaceTechnologyEnum frontEndInterfaceTechnology) {
    this.frontEndInterfaceTechnology = frontEndInterfaceTechnology;
  }

  
  /**
   * A list of drive technologies that are present in the tray.
   **/
  public Tray driveTechnologies(List<DriveTechnologiesEnum> driveTechnologies) {
    this.driveTechnologies = driveTechnologies;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of drive technologies that are present in the tray.")
  @JsonProperty("driveTechnologies")
  public List<DriveTechnologiesEnum> getDriveTechnologies() {
    return driveTechnologies;
  }
  
  public void setDriveTechnologies(List<DriveTechnologiesEnum> driveTechnologies) {
    this.driveTechnologies = driveTechnologies;
  }

  
  /**
   * The number of drive compartments in the tray. Some drive trays are subdivided into \"compartments,\" each having the same number of drive slots. Looking at the front of such an enclosure, multiple compartments are arranged side by side along one dimension, while drives within a compartment are arranged side by side along the other dimension, allowing for greater overall drive density within the constraints of a given enclosure form factor. (Even when arranged as a series of compartments, drive slot numbering is still relative to the entire tray.)
   **/
  public Tray numDriveCompartments(Integer numDriveCompartments) {
    this.numDriveCompartments = numDriveCompartments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of drive compartments in the tray. Some drive trays are subdivided into \"compartments,\" each having the same number of drive slots. Looking at the front of such an enclosure, multiple compartments are arranged side by side along one dimension, while drives within a compartment are arranged side by side along the other dimension, allowing for greater overall drive density within the constraints of a given enclosure form factor. (Even when arranged as a series of compartments, drive slot numbering is still relative to the entire tray.)")
  @JsonProperty("numDriveCompartments")
  public Integer getNumDriveCompartments() {
    return numDriveCompartments;
  }
  
  public void setNumDriveCompartments(Integer numDriveCompartments) {
    this.numDriveCompartments = numDriveCompartments;
  }

  
  /**
   * The number of drive slots within an individual drive compartment.
   **/
  public Tray numDriveSlotsPerCompartment(Integer numDriveSlotsPerCompartment) {
    this.numDriveSlotsPerCompartment = numDriveSlotsPerCompartment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of drive slots within an individual drive compartment.")
  @JsonProperty("numDriveSlotsPerCompartment")
  public Integer getNumDriveSlotsPerCompartment() {
    return numDriveSlotsPerCompartment;
  }
  
  public void setNumDriveSlotsPerCompartment(Integer numDriveSlotsPerCompartment) {
    this.numDriveSlotsPerCompartment = numDriveSlotsPerCompartment;
  }

  
  /**
   * The tray attribute data (see setTrayAttributes procedure).
   **/
  public Tray trayAttributes(List<TrayAttribute> trayAttributes) {
    this.trayAttributes = trayAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The tray attribute data (see setTrayAttributes procedure).")
  @JsonProperty("trayAttributes")
  public List<TrayAttribute> getTrayAttributes() {
    return trayAttributes;
  }
  
  public void setTrayAttributes(List<TrayAttribute> trayAttributes) {
    this.trayAttributes = trayAttributes;
  }

  
  /**
   * True, if the tray has invalid configuration settings.
   **/
  public Tray isMisconfigured(Boolean isMisconfigured) {
    this.isMisconfigured = isMisconfigured;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if the tray has invalid configuration settings.")
  @JsonProperty("isMisconfigured")
  public Boolean getIsMisconfigured() {
    return isMisconfigured;
  }
  
  public void setIsMisconfigured(Boolean isMisconfigured) {
    this.isMisconfigured = isMisconfigured;
  }

  
  /**
   * True, if the two ESMs in the tray are reporting different version information for their factory default settings.
   **/
  public Tray esmFactoryDefaultsMismatch(Boolean esmFactoryDefaultsMismatch) {
    this.esmFactoryDefaultsMismatch = esmFactoryDefaultsMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if the two ESMs in the tray are reporting different version information for their factory default settings.")
  @JsonProperty("esmFactoryDefaultsMismatch")
  public Boolean getEsmFactoryDefaultsMismatch() {
    return esmFactoryDefaultsMismatch;
  }
  
  public void setEsmFactoryDefaultsMismatch(Boolean esmFactoryDefaultsMismatch) {
    this.esmFactoryDefaultsMismatch = esmFactoryDefaultsMismatch;
  }

  
  /**
   * The physical location of the tray. The parent reference in Location identifies the storage array itself, and the position field is the tray position number as identified in setSATrayPositions procedure call, or the constant TRAY_POSITION_UNKNOWN.
   **/
  public Tray physicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The physical location of the tray. The parent reference in Location identifies the storage array itself, and the position field is the tray position number as identified in setSATrayPositions procedure call, or the constant TRAY_POSITION_UNKNOWN.")
  @JsonProperty("physicalLocation")
  public Location getPhysicalLocation() {
    return physicalLocation;
  }
  
  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  /**
   * The total number of drawers available in the tray.
   **/
  public Tray numDrawers(Integer numDrawers) {
    this.numDrawers = numDrawers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of drawers available in the tray.")
  @JsonProperty("numDrawers")
  public Integer getNumDrawers() {
    return numDrawers;
  }
  
  public void setNumDrawers(Integer numDrawers) {
    this.numDrawers = numDrawers;
  }

  
  /**
   * If the tray contains drawers, this field specifies the layout within the drawer. Otherwise, this field specifies the layout for the tray.
   **/
  public Tray driveLayout(DriveLayout driveLayout) {
    this.driveLayout = driveLayout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If the tray contains drawers, this field specifies the layout within the drawer. Otherwise, this field specifies the layout for the tray.")
  @JsonProperty("driveLayout")
  public DriveLayout getDriveLayout() {
    return driveLayout;
  }
  
  public void setDriveLayout(DriveLayout driveLayout) {
    this.driveLayout = driveLayout;
  }

  
  /**
   * This field contains information about the version of the tray's factory default settings.
   **/
  public Tray factoryDefaultsData(FactoryDefaultsVersionData factoryDefaultsData) {
    this.factoryDefaultsData = factoryDefaultsData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This field contains information about the version of the tray's factory default settings.")
  @JsonProperty("factoryDefaultsData")
  public FactoryDefaultsVersionData getFactoryDefaultsData() {
    return factoryDefaultsData;
  }
  
  public void setFactoryDefaultsData(FactoryDefaultsVersionData factoryDefaultsData) {
    this.factoryDefaultsData = factoryDefaultsData;
  }

  
  /**
   * Indicates that a locate operation for the device is currently active. The device will show a visual indication to aid an operator in locating the tray.
   **/
  public Tray locateInProgress(Boolean locateInProgress) {
    this.locateInProgress = locateInProgress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates that a locate operation for the device is currently active. The device will show a visual indication to aid an operator in locating the tray.")
  @JsonProperty("locateInProgress")
  public Boolean getLocateInProgress() {
    return locateInProgress;
  }
  
  public void setLocateInProgress(Boolean locateInProgress) {
    this.locateInProgress = locateInProgress;
  }

  
  /**
   * The device contains 7-segment indicators used to display the Tray Identity.
   **/
  public Tray hasTrayIdentityIndicator(Boolean hasTrayIdentityIndicator) {
    this.hasTrayIdentityIndicator = hasTrayIdentityIndicator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The device contains 7-segment indicators used to display the Tray Identity.")
  @JsonProperty("hasTrayIdentityIndicator")
  public Boolean getHasTrayIdentityIndicator() {
    return hasTrayIdentityIndicator;
  }
  
  public void setHasTrayIdentityIndicator(Boolean hasTrayIdentityIndicator) {
    this.hasTrayIdentityIndicator = hasTrayIdentityIndicator;
  }

  
  /**
   **/
  public Tray id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tray tray = (Tray) o;
    return Objects.equals(this.type, tray.type) &&
        Objects.equals(this.orientation, tray.orientation) &&
        Objects.equals(this.numControllerSlots, tray.numControllerSlots) &&
        Objects.equals(this.numDriveSlots, tray.numDriveSlots) &&
        Objects.equals(this.trayId, tray.trayId) &&
        Objects.equals(this.trayRef, tray.trayRef) &&
        Objects.equals(this.nonRedundantAccess, tray.nonRedundantAccess) &&
        Objects.equals(this.partNumber, tray.partNumber) &&
        Objects.equals(this.serialNumber, tray.serialNumber) &&
        Objects.equals(this.vendorName, tray.vendorName) &&
        Objects.equals(this.manufacturerDate, tray.manufacturerDate) &&
        Objects.equals(this.fruType, tray.fruType) &&
        Objects.equals(this.trayIDMismatch, tray.trayIDMismatch) &&
        Objects.equals(this.trayIDConflict, tray.trayIDConflict) &&
        Objects.equals(this.esmVersionMismatch, tray.esmVersionMismatch) &&
        Objects.equals(this.esmMiswire, tray.esmMiswire) &&
        Objects.equals(this.drvMHSpeedMismatch, tray.drvMHSpeedMismatch) &&
        Objects.equals(this.unsupportedTray, tray.unsupportedTray) &&
        Objects.equals(this.workingChannel, tray.workingChannel) &&
        Objects.equals(this.maxSpeed, tray.maxSpeed) &&
        Objects.equals(this.trayTechnologyType, tray.trayTechnologyType) &&
        Objects.equals(this.esmGroupError, tray.esmGroupError) &&
        Objects.equals(this.uncertifiedTray, tray.uncertifiedTray) &&
        Objects.equals(this.locateTray, tray.locateTray) &&
        Objects.equals(this.esmHardwareMismatch, tray.esmHardwareMismatch) &&
        Objects.equals(this.hasConfigurableTrayId, tray.hasConfigurableTrayId) &&
        Objects.equals(this.frontEndInterfaceTechnology, tray.frontEndInterfaceTechnology) &&
        Objects.equals(this.driveTechnologies, tray.driveTechnologies) &&
        Objects.equals(this.numDriveCompartments, tray.numDriveCompartments) &&
        Objects.equals(this.numDriveSlotsPerCompartment, tray.numDriveSlotsPerCompartment) &&
        Objects.equals(this.trayAttributes, tray.trayAttributes) &&
        Objects.equals(this.isMisconfigured, tray.isMisconfigured) &&
        Objects.equals(this.esmFactoryDefaultsMismatch, tray.esmFactoryDefaultsMismatch) &&
        Objects.equals(this.physicalLocation, tray.physicalLocation) &&
        Objects.equals(this.numDrawers, tray.numDrawers) &&
        Objects.equals(this.driveLayout, tray.driveLayout) &&
        Objects.equals(this.factoryDefaultsData, tray.factoryDefaultsData) &&
        Objects.equals(this.locateInProgress, tray.locateInProgress) &&
        Objects.equals(this.hasTrayIdentityIndicator, tray.hasTrayIdentityIndicator) &&
        Objects.equals(this.id, tray.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, orientation, numControllerSlots, numDriveSlots, trayId, trayRef, nonRedundantAccess, partNumber, serialNumber, vendorName, manufacturerDate, fruType, trayIDMismatch, trayIDConflict, esmVersionMismatch, esmMiswire, drvMHSpeedMismatch, unsupportedTray, workingChannel, maxSpeed, trayTechnologyType, esmGroupError, uncertifiedTray, locateTray, esmHardwareMismatch, hasConfigurableTrayId, frontEndInterfaceTechnology, driveTechnologies, numDriveCompartments, numDriveSlotsPerCompartment, trayAttributes, isMisconfigured, esmFactoryDefaultsMismatch, physicalLocation, numDrawers, driveLayout, factoryDefaultsData, locateInProgress, hasTrayIdentityIndicator, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tray {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    numControllerSlots: ").append(toIndentedString(numControllerSlots)).append("\n");
    sb.append("    numDriveSlots: ").append(toIndentedString(numDriveSlots)).append("\n");
    sb.append("    trayId: ").append(toIndentedString(trayId)).append("\n");
    sb.append("    trayRef: ").append(toIndentedString(trayRef)).append("\n");
    sb.append("    nonRedundantAccess: ").append(toIndentedString(nonRedundantAccess)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    fruType: ").append(toIndentedString(fruType)).append("\n");
    sb.append("    trayIDMismatch: ").append(toIndentedString(trayIDMismatch)).append("\n");
    sb.append("    trayIDConflict: ").append(toIndentedString(trayIDConflict)).append("\n");
    sb.append("    esmVersionMismatch: ").append(toIndentedString(esmVersionMismatch)).append("\n");
    sb.append("    esmMiswire: ").append(toIndentedString(esmMiswire)).append("\n");
    sb.append("    drvMHSpeedMismatch: ").append(toIndentedString(drvMHSpeedMismatch)).append("\n");
    sb.append("    unsupportedTray: ").append(toIndentedString(unsupportedTray)).append("\n");
    sb.append("    workingChannel: ").append(toIndentedString(workingChannel)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    trayTechnologyType: ").append(toIndentedString(trayTechnologyType)).append("\n");
    sb.append("    esmGroupError: ").append(toIndentedString(esmGroupError)).append("\n");
    sb.append("    uncertifiedTray: ").append(toIndentedString(uncertifiedTray)).append("\n");
    sb.append("    locateTray: ").append(toIndentedString(locateTray)).append("\n");
    sb.append("    esmHardwareMismatch: ").append(toIndentedString(esmHardwareMismatch)).append("\n");
    sb.append("    hasConfigurableTrayId: ").append(toIndentedString(hasConfigurableTrayId)).append("\n");
    sb.append("    frontEndInterfaceTechnology: ").append(toIndentedString(frontEndInterfaceTechnology)).append("\n");
    sb.append("    driveTechnologies: ").append(toIndentedString(driveTechnologies)).append("\n");
    sb.append("    numDriveCompartments: ").append(toIndentedString(numDriveCompartments)).append("\n");
    sb.append("    numDriveSlotsPerCompartment: ").append(toIndentedString(numDriveSlotsPerCompartment)).append("\n");
    sb.append("    trayAttributes: ").append(toIndentedString(trayAttributes)).append("\n");
    sb.append("    isMisconfigured: ").append(toIndentedString(isMisconfigured)).append("\n");
    sb.append("    esmFactoryDefaultsMismatch: ").append(toIndentedString(esmFactoryDefaultsMismatch)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    numDrawers: ").append(toIndentedString(numDrawers)).append("\n");
    sb.append("    driveLayout: ").append(toIndentedString(driveLayout)).append("\n");
    sb.append("    factoryDefaultsData: ").append(toIndentedString(factoryDefaultsData)).append("\n");
    sb.append("    locateInProgress: ").append(toIndentedString(locateInProgress)).append("\n");
    sb.append("    hasTrayIdentityIndicator: ").append(toIndentedString(hasTrayIdentityIndicator)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

