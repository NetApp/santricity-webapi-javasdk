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
 * LongLivedOperation
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class LongLivedOperation   {
  

  /**
   * This enumeration object is used to specify one of a set of volume actions that may be active for a volume. These volume actions represent \"long-running\" operations on a volume. Any time such an operation is active, the current progress can be determined using the getVolumeActionProgress procedure.
   */
  public enum VolActionEnum {
    none("none"),
    copyback("copyback"),
    initializing("initializing"),
    reconstructing("reconstructing"),
    remappingDce("remappingDce"),
    remappingDrm("remappingDrm"),
    remappingDcedrm("remappingDcedrm"),
    remappingDseg("remappingDseg"),
    remappingDve("remappingDve"),
    remappingDcedve("remappingDcedve"),
    remappingInternal("remappingInternal"),
    remappingDefrag("remappingDefrag"),
    formatting("formatting"),
    synchronizing("synchronizing"),
    parityScan("parityScan"),
    volumeCopy("volumeCopy"),
    snapshotRollback("snapshotRollback"),
    pitRollback("pitRollback"),
    asyncMirrorGroupInitialSync("asyncMirrorGroupInitialSync"),
    reconstructingCritical("reconstructingCritical"),
    rebalancing("rebalancing"),
    copyThenFail("copyThenFail"),
    copyThenFailPending("copyThenFailPending"),
    copyThenReplace("copyThenReplace"),
    copyThenReplaceAndFail("copyThenReplaceAndFail"),
    thinDefrag("thinDefrag"),
    creating("creating"),
    deleting("deleting"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    VolActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private VolActionEnum volAction;

    private VolumeGroupOperation copyback;

    private VolumeGroupOperation reconstruct;

    private VolumeGroupOperation capacityExpansion;

    private VolumeGroupOperation raidMigration;

    private VolumeGroupOperation raidMigrationandExpansion;

    private VolumeGroupOperation segSize;

    private VolumeGroupOperation volExpansion;

    private VolumeGroupOperation volAndCapExpansion;

    private VolumeGroupOperation defrag;

    private InitializationOperation init;

    private InitializationOperation format;

    private MirrorSyncOperation sync;

    private VolumeCopyOperation copy;

    private VolumeGroupOperation parityScan;

    private SnapshotRollbackOperation rollback;

    private PITRollbackOperation pitRollback;

    private AsyncMirrorGroupInitialSyncOperation initialSync;

    private VolumeGroupOperation rebalancing;

    private VolumeGroupOperation copyThenFail;

    private VolumeGroupOperation copyThenFailPending;

    private VolumeGroupOperation copyThenReplace;

    private VolumeGroupOperation copyThenReplaceAndFail;

    private VolumeGroupOperation reconstructCritical;

    private VolumeOperation thinDefrag;

    private VolumeOperation volCreation;

    private VolumeOperation volDeletion;

  
  /**
   * This enumeration object is used to specify one of a set of volume actions that may be active for a volume. These volume actions represent \"long-running\" operations on a volume. Any time such an operation is active, the current progress can be determined using the getVolumeActionProgress procedure.
   **/
  public LongLivedOperation volAction(VolActionEnum volAction) {
    this.volAction = volAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration object is used to specify one of a set of volume actions that may be active for a volume. These volume actions represent \"long-running\" operations on a volume. Any time such an operation is active, the current progress can be determined using the getVolumeActionProgress procedure.")
  @JsonProperty("volAction")
  public VolActionEnum getVolAction() {
    return volAction;
  }
  
  public void setVolAction(VolActionEnum volAction) {
    this.volAction = volAction;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_COPYBACK.
   **/
  public LongLivedOperation copyback(VolumeGroupOperation copyback) {
    this.copyback = copyback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_COPYBACK.")
  @JsonProperty("copyback")
  public VolumeGroupOperation getCopyback() {
    return copyback;
  }
  
  public void setCopyback(VolumeGroupOperation copyback) {
    this.copyback = copyback;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_RECONSTRUCTING.
   **/
  public LongLivedOperation reconstruct(VolumeGroupOperation reconstruct) {
    this.reconstruct = reconstruct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_RECONSTRUCTING.")
  @JsonProperty("reconstruct")
  public VolumeGroupOperation getReconstruct() {
    return reconstruct;
  }
  
  public void setReconstruct(VolumeGroupOperation reconstruct) {
    this.reconstruct = reconstruct;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DCE.
   **/
  public LongLivedOperation capacityExpansion(VolumeGroupOperation capacityExpansion) {
    this.capacityExpansion = capacityExpansion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DCE.")
  @JsonProperty("capacityExpansion")
  public VolumeGroupOperation getCapacityExpansion() {
    return capacityExpansion;
  }
  
  public void setCapacityExpansion(VolumeGroupOperation capacityExpansion) {
    this.capacityExpansion = capacityExpansion;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DRM.
   **/
  public LongLivedOperation raidMigration(VolumeGroupOperation raidMigration) {
    this.raidMigration = raidMigration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DRM.")
  @JsonProperty("raidMigration")
  public VolumeGroupOperation getRaidMigration() {
    return raidMigration;
  }
  
  public void setRaidMigration(VolumeGroupOperation raidMigration) {
    this.raidMigration = raidMigration;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DCEDRM.
   **/
  public LongLivedOperation raidMigrationandExpansion(VolumeGroupOperation raidMigrationandExpansion) {
    this.raidMigrationandExpansion = raidMigrationandExpansion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DCEDRM.")
  @JsonProperty("raidMigrationandExpansion")
  public VolumeGroupOperation getRaidMigrationandExpansion() {
    return raidMigrationandExpansion;
  }
  
  public void setRaidMigrationandExpansion(VolumeGroupOperation raidMigrationandExpansion) {
    this.raidMigrationandExpansion = raidMigrationandExpansion;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DSEG.
   **/
  public LongLivedOperation segSize(VolumeGroupOperation segSize) {
    this.segSize = segSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DSEG.")
  @JsonProperty("segSize")
  public VolumeGroupOperation getSegSize() {
    return segSize;
  }
  
  public void setSegSize(VolumeGroupOperation segSize) {
    this.segSize = segSize;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DVE.
   **/
  public LongLivedOperation volExpansion(VolumeGroupOperation volExpansion) {
    this.volExpansion = volExpansion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DVE.")
  @JsonProperty("volExpansion")
  public VolumeGroupOperation getVolExpansion() {
    return volExpansion;
  }
  
  public void setVolExpansion(VolumeGroupOperation volExpansion) {
    this.volExpansion = volExpansion;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DCEDVE.
   **/
  public LongLivedOperation volAndCapExpansion(VolumeGroupOperation volAndCapExpansion) {
    this.volAndCapExpansion = volAndCapExpansion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DCEDVE.")
  @JsonProperty("volAndCapExpansion")
  public VolumeGroupOperation getVolAndCapExpansion() {
    return volAndCapExpansion;
  }
  
  public void setVolAndCapExpansion(VolumeGroupOperation volAndCapExpansion) {
    this.volAndCapExpansion = volAndCapExpansion;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DEFRAG.
   **/
  public LongLivedOperation defrag(VolumeGroupOperation defrag) {
    this.defrag = defrag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_REMAPPING_DEFRAG.")
  @JsonProperty("defrag")
  public VolumeGroupOperation getDefrag() {
    return defrag;
  }
  
  public void setDefrag(VolumeGroupOperation defrag) {
    this.defrag = defrag;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_INITIALIZING.
   **/
  public LongLivedOperation init(InitializationOperation init) {
    this.init = init;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_INITIALIZING.")
  @JsonProperty("init")
  public InitializationOperation getInit() {
    return init;
  }
  
  public void setInit(InitializationOperation init) {
    this.init = init;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_FORMATTING.
   **/
  public LongLivedOperation format(InitializationOperation format) {
    this.format = format;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_FORMATTING.")
  @JsonProperty("format")
  public InitializationOperation getFormat() {
    return format;
  }
  
  public void setFormat(InitializationOperation format) {
    this.format = format;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_SYNCHRONIZING.
   **/
  public LongLivedOperation sync(MirrorSyncOperation sync) {
    this.sync = sync;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_SYNCHRONIZING.")
  @JsonProperty("sync")
  public MirrorSyncOperation getSync() {
    return sync;
  }
  
  public void setSync(MirrorSyncOperation sync) {
    this.sync = sync;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_VOLUME_COPY.
   **/
  public LongLivedOperation copy(VolumeCopyOperation copy) {
    this.copy = copy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_VOLUME_COPY.")
  @JsonProperty("copy")
  public VolumeCopyOperation getCopy() {
    return copy;
  }
  
  public void setCopy(VolumeCopyOperation copy) {
    this.copy = copy;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_PARITY_SCAN.
   **/
  public LongLivedOperation parityScan(VolumeGroupOperation parityScan) {
    this.parityScan = parityScan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_PARITY_SCAN.")
  @JsonProperty("parityScan")
  public VolumeGroupOperation getParityScan() {
    return parityScan;
  }
  
  public void setParityScan(VolumeGroupOperation parityScan) {
    this.parityScan = parityScan;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_SNAPSHOT_ROLLBACK.
   **/
  public LongLivedOperation rollback(SnapshotRollbackOperation rollback) {
    this.rollback = rollback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_SNAPSHOT_ROLLBACK.")
  @JsonProperty("rollback")
  public SnapshotRollbackOperation getRollback() {
    return rollback;
  }
  
  public void setRollback(SnapshotRollbackOperation rollback) {
    this.rollback = rollback;
  }

  
  /**
   * This field is present only if volAction is equal to VOL_ACTION_PIT_ROLLBACK.
   **/
  public LongLivedOperation pitRollback(PITRollbackOperation pitRollback) {
    this.pitRollback = pitRollback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if volAction is equal to VOL_ACTION_PIT_ROLLBACK.")
  @JsonProperty("pitRollback")
  public PITRollbackOperation getPitRollback() {
    return pitRollback;
  }
  
  public void setPitRollback(PITRollbackOperation pitRollback) {
    this.pitRollback = pitRollback;
  }

  
  /**
   * This field is present only if the value of volAction is equal to VOL_ACTION_ASYNC_MIRROR_GROUP_INITIAL_SYNC.
   **/
  public LongLivedOperation initialSync(AsyncMirrorGroupInitialSyncOperation initialSync) {
    this.initialSync = initialSync;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of volAction is equal to VOL_ACTION_ASYNC_MIRROR_GROUP_INITIAL_SYNC.")
  @JsonProperty("initialSync")
  public AsyncMirrorGroupInitialSyncOperation getInitialSync() {
    return initialSync;
  }
  
  public void setInitialSync(AsyncMirrorGroupInitialSyncOperation initialSync) {
    this.initialSync = initialSync;
  }

  
  /**
   * This field is present only if the value of volAction is equal to VOL_ACTION_REBALANCING.
   **/
  public LongLivedOperation rebalancing(VolumeGroupOperation rebalancing) {
    this.rebalancing = rebalancing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of volAction is equal to VOL_ACTION_REBALANCING.")
  @JsonProperty("rebalancing")
  public VolumeGroupOperation getRebalancing() {
    return rebalancing;
  }
  
  public void setRebalancing(VolumeGroupOperation rebalancing) {
    this.rebalancing = rebalancing;
  }

  
  /**
   * This field is present only if the value of volAction is equal to VOL_ACTION_COPY_THEN_FAIL.
   **/
  public LongLivedOperation copyThenFail(VolumeGroupOperation copyThenFail) {
    this.copyThenFail = copyThenFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of volAction is equal to VOL_ACTION_COPY_THEN_FAIL.")
  @JsonProperty("copyThenFail")
  public VolumeGroupOperation getCopyThenFail() {
    return copyThenFail;
  }
  
  public void setCopyThenFail(VolumeGroupOperation copyThenFail) {
    this.copyThenFail = copyThenFail;
  }

  
  /**
   * This field is present only if the value of volAction is equal to VOL_ACTION_COPY_THEN_FAIL_PENDING.
   **/
  public LongLivedOperation copyThenFailPending(VolumeGroupOperation copyThenFailPending) {
    this.copyThenFailPending = copyThenFailPending;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of volAction is equal to VOL_ACTION_COPY_THEN_FAIL_PENDING.")
  @JsonProperty("copyThenFailPending")
  public VolumeGroupOperation getCopyThenFailPending() {
    return copyThenFailPending;
  }
  
  public void setCopyThenFailPending(VolumeGroupOperation copyThenFailPending) {
    this.copyThenFailPending = copyThenFailPending;
  }

  
  /**
   * This field is present only if the value of volAction is equal to VOL_ACTION_COPY_THEN_REPLACE.
   **/
  public LongLivedOperation copyThenReplace(VolumeGroupOperation copyThenReplace) {
    this.copyThenReplace = copyThenReplace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of volAction is equal to VOL_ACTION_COPY_THEN_REPLACE.")
  @JsonProperty("copyThenReplace")
  public VolumeGroupOperation getCopyThenReplace() {
    return copyThenReplace;
  }
  
  public void setCopyThenReplace(VolumeGroupOperation copyThenReplace) {
    this.copyThenReplace = copyThenReplace;
  }

  
  /**
   * This field is present only if the value of volAction is equal to VOL_ACTION_COPY_THEN_REPLACE_AND_FAIL.
   **/
  public LongLivedOperation copyThenReplaceAndFail(VolumeGroupOperation copyThenReplaceAndFail) {
    this.copyThenReplaceAndFail = copyThenReplaceAndFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of volAction is equal to VOL_ACTION_COPY_THEN_REPLACE_AND_FAIL.")
  @JsonProperty("copyThenReplaceAndFail")
  public VolumeGroupOperation getCopyThenReplaceAndFail() {
    return copyThenReplaceAndFail;
  }
  
  public void setCopyThenReplaceAndFail(VolumeGroupOperation copyThenReplaceAndFail) {
    this.copyThenReplaceAndFail = copyThenReplaceAndFail;
  }

  
  /**
   * This field is present only if the DDP pool is critical due to two drive failures.
   **/
  public LongLivedOperation reconstructCritical(VolumeGroupOperation reconstructCritical) {
    this.reconstructCritical = reconstructCritical;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the DDP pool is critical due to two drive failures.")
  @JsonProperty("reconstructCritical")
  public VolumeGroupOperation getReconstructCritical() {
    return reconstructCritical;
  }
  
  public void setReconstructCritical(VolumeGroupOperation reconstructCritical) {
    this.reconstructCritical = reconstructCritical;
  }

  
  /**
   * Thin volume defrag operation
   **/
  public LongLivedOperation thinDefrag(VolumeOperation thinDefrag) {
    this.thinDefrag = thinDefrag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Thin volume defrag operation")
  @JsonProperty("thinDefrag")
  public VolumeOperation getThinDefrag() {
    return thinDefrag;
  }
  
  public void setThinDefrag(VolumeOperation thinDefrag) {
    this.thinDefrag = thinDefrag;
  }

  
  /**
   * A DDP Volume is in the creating state.
   **/
  public LongLivedOperation volCreation(VolumeOperation volCreation) {
    this.volCreation = volCreation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A DDP Volume is in the creating state.")
  @JsonProperty("volCreation")
  public VolumeOperation getVolCreation() {
    return volCreation;
  }
  
  public void setVolCreation(VolumeOperation volCreation) {
    this.volCreation = volCreation;
  }

  
  /**
   * A DDP Volume is in the deleting state.
   **/
  public LongLivedOperation volDeletion(VolumeOperation volDeletion) {
    this.volDeletion = volDeletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A DDP Volume is in the deleting state.")
  @JsonProperty("volDeletion")
  public VolumeOperation getVolDeletion() {
    return volDeletion;
  }
  
  public void setVolDeletion(VolumeOperation volDeletion) {
    this.volDeletion = volDeletion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongLivedOperation longLivedOperation = (LongLivedOperation) o;
    return Objects.equals(this.volAction, longLivedOperation.volAction) &&
        Objects.equals(this.copyback, longLivedOperation.copyback) &&
        Objects.equals(this.reconstruct, longLivedOperation.reconstruct) &&
        Objects.equals(this.capacityExpansion, longLivedOperation.capacityExpansion) &&
        Objects.equals(this.raidMigration, longLivedOperation.raidMigration) &&
        Objects.equals(this.raidMigrationandExpansion, longLivedOperation.raidMigrationandExpansion) &&
        Objects.equals(this.segSize, longLivedOperation.segSize) &&
        Objects.equals(this.volExpansion, longLivedOperation.volExpansion) &&
        Objects.equals(this.volAndCapExpansion, longLivedOperation.volAndCapExpansion) &&
        Objects.equals(this.defrag, longLivedOperation.defrag) &&
        Objects.equals(this.init, longLivedOperation.init) &&
        Objects.equals(this.format, longLivedOperation.format) &&
        Objects.equals(this.sync, longLivedOperation.sync) &&
        Objects.equals(this.copy, longLivedOperation.copy) &&
        Objects.equals(this.parityScan, longLivedOperation.parityScan) &&
        Objects.equals(this.rollback, longLivedOperation.rollback) &&
        Objects.equals(this.pitRollback, longLivedOperation.pitRollback) &&
        Objects.equals(this.initialSync, longLivedOperation.initialSync) &&
        Objects.equals(this.rebalancing, longLivedOperation.rebalancing) &&
        Objects.equals(this.copyThenFail, longLivedOperation.copyThenFail) &&
        Objects.equals(this.copyThenFailPending, longLivedOperation.copyThenFailPending) &&
        Objects.equals(this.copyThenReplace, longLivedOperation.copyThenReplace) &&
        Objects.equals(this.copyThenReplaceAndFail, longLivedOperation.copyThenReplaceAndFail) &&
        Objects.equals(this.reconstructCritical, longLivedOperation.reconstructCritical) &&
        Objects.equals(this.thinDefrag, longLivedOperation.thinDefrag) &&
        Objects.equals(this.volCreation, longLivedOperation.volCreation) &&
        Objects.equals(this.volDeletion, longLivedOperation.volDeletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volAction, copyback, reconstruct, capacityExpansion, raidMigration, raidMigrationandExpansion, segSize, volExpansion, volAndCapExpansion, defrag, init, format, sync, copy, parityScan, rollback, pitRollback, initialSync, rebalancing, copyThenFail, copyThenFailPending, copyThenReplace, copyThenReplaceAndFail, reconstructCritical, thinDefrag, volCreation, volDeletion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongLivedOperation {\n");
    
    sb.append("    volAction: ").append(toIndentedString(volAction)).append("\n");
    sb.append("    copyback: ").append(toIndentedString(copyback)).append("\n");
    sb.append("    reconstruct: ").append(toIndentedString(reconstruct)).append("\n");
    sb.append("    capacityExpansion: ").append(toIndentedString(capacityExpansion)).append("\n");
    sb.append("    raidMigration: ").append(toIndentedString(raidMigration)).append("\n");
    sb.append("    raidMigrationandExpansion: ").append(toIndentedString(raidMigrationandExpansion)).append("\n");
    sb.append("    segSize: ").append(toIndentedString(segSize)).append("\n");
    sb.append("    volExpansion: ").append(toIndentedString(volExpansion)).append("\n");
    sb.append("    volAndCapExpansion: ").append(toIndentedString(volAndCapExpansion)).append("\n");
    sb.append("    defrag: ").append(toIndentedString(defrag)).append("\n");
    sb.append("    init: ").append(toIndentedString(init)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
    sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
    sb.append("    parityScan: ").append(toIndentedString(parityScan)).append("\n");
    sb.append("    rollback: ").append(toIndentedString(rollback)).append("\n");
    sb.append("    pitRollback: ").append(toIndentedString(pitRollback)).append("\n");
    sb.append("    initialSync: ").append(toIndentedString(initialSync)).append("\n");
    sb.append("    rebalancing: ").append(toIndentedString(rebalancing)).append("\n");
    sb.append("    copyThenFail: ").append(toIndentedString(copyThenFail)).append("\n");
    sb.append("    copyThenFailPending: ").append(toIndentedString(copyThenFailPending)).append("\n");
    sb.append("    copyThenReplace: ").append(toIndentedString(copyThenReplace)).append("\n");
    sb.append("    copyThenReplaceAndFail: ").append(toIndentedString(copyThenReplaceAndFail)).append("\n");
    sb.append("    reconstructCritical: ").append(toIndentedString(reconstructCritical)).append("\n");
    sb.append("    thinDefrag: ").append(toIndentedString(thinDefrag)).append("\n");
    sb.append("    volCreation: ").append(toIndentedString(volCreation)).append("\n");
    sb.append("    volDeletion: ").append(toIndentedString(volDeletion)).append("\n");
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

