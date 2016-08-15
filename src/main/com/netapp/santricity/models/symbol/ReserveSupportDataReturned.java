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
 * ReserveSupportDataReturned
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ReserveSupportDataReturned   {
  

  /**
   * An enumeration used to determine the return status of a SYMbol function call.
   */
  public enum ReturnCodeEnum {
    uninitialized("uninitialized"),
    ok("ok"),
    error("error"),
    busy("busy"),
    illegalParam("illegalParam"),
    noHeap("noHeap"),
    driveNotExist("driveNotExist"),
    driveNotUnassigned("driveNotUnassigned"),
    noSparesAssigned("noSparesAssigned"),
    someSparesAssigned("someSparesAssigned"),
    volumeNotExist("volumeNotExist"),
    volumeReconfiguring("volumeReconfiguring"),
    notDualActive("notDualActive"),
    tryAlternate("tryAlternate"),
    background("background"),
    notImplemented("notImplemented"),
    reservationConflict("reservationConflict"),
    volumeDead("volumeDead"),
    internalError("internalError"),
    invalidRequest("invalidRequest"),
    iconFailure("iconFailure"),
    volumeFormatting("volumeFormatting"),
    altRemoved("altRemoved"),
    cacheSyncFailure("cacheSyncFailure"),
    invalidFile("invalidFile"),
    reconfigSmallDacstore("reconfigSmallDacstore"),
    reconfigFailure("reconfigFailure"),
    nvramError("nvramError"),
    flashError("flashError"),
    authFailParam("authFailParam"),
    authFailPassword("authFailPassword"),
    memParityError("memParityError"),
    invalidControllerref("invalidControllerref"),
    invalidVolumegroupref("invalidVolumegroupref"),
    invalidVolumeref("invalidVolumeref"),
    invalidDriveref("invalidDriveref"),
    invalidFreeextentref("invalidFreeextentref"),
    volumeOffline("volumeOffline"),
    volumeNotOptimal("volumeNotOptimal"),
    modesenseError("modesenseError"),
    invalidSegmentsize("invalidSegmentsize"),
    invalidCacheblksize("invalidCacheblksize"),
    invalidFlushThreshold("invalidFlushThreshold"),
    invalidFlushAmount("invalidFlushAmount"),
    invalidLabel("invalidLabel"),
    invalidCacheModifier("invalidCacheModifier"),
    invalidReadahead("invalidReadahead"),
    invalidReconpriority("invalidReconpriority"),
    invalidScanperiod("invalidScanperiod"),
    invalidTrayposLength("invalidTrayposLength"),
    invalidRegionid("invalidRegionid"),
    invalidFibreid("invalidFibreid"),
    invalidEncryption("invalidEncryption"),
    invalidRaidlevel("invalidRaidlevel"),
    invalidExpansionList("invalidExpansionList"),
    noSparesDeassigned("noSparesDeassigned"),
    someSparesDeassigned("someSparesDeassigned"),
    partDupId("partDupId"),
    partLabelInvalid("partLabelInvalid"),
    partNodeNonexistent("partNodeNonexistent"),
    partPortIdInvalid("partPortIdInvalid"),
    partVolumeNonexistent("partVolumeNonexistent"),
    partLunCollision("partLunCollision"),
    maxVolMappingExceeded("maxVolMappingExceeded"),
    partMappingNonexistent("partMappingNonexistent"),
    partNoHostports("partNoHostports"),
    imageTransferred("imageTransferred"),
    fileTooLarge("fileTooLarge"),
    invalidOffset("invalidOffset"),
    overrun("overrun"),
    invalidChunksize("invalidChunksize"),
    invalidTotalsize("invalidTotalsize"),
    downloadNotPermitted("downloadNotPermitted"),
    spawnError("spawnError"),
    voltransferError("voltransferError"),
    invalidDlstate("invalidDlstate"),
    cacheconfigError("cacheconfigError"),
    downloadInProgress("downloadInProgress"),
    driveNotOptimal("driveNotOptimal"),
    driveRemoved("driveRemoved"),
    duplicateDrives("duplicateDrives"),
    numdrivesAdditional("numdrivesAdditional"),
    numdrivesGroup("numdrivesGroup"),
    driveTooSmall("driveTooSmall"),
    capacityConstrained("capacityConstrained"),
    maxVolumesExceeded("maxVolumesExceeded"),
    partIsUtmLun("partIsUtmLun"),
    someSparesTooSmall("someSparesTooSmall"),
    sparesSmallUnassigned("sparesSmallUnassigned"),
    tooManyPartitions("tooManyPartitions"),
    parityScanInProgress("parityScanInProgress"),
    invalidSafeId("invalidSafeId"),
    invalidSafeKey("invalidSafeKey"),
    invalidSafeCapability("invalidSafeCapability"),
    invalidSafeVersion("invalidSafeVersion"),
    partitionsDisabled("partitionsDisabled"),
    driveDownloadFailed("driveDownloadFailed"),
    esmDownloadFailed("esmDownloadFailed"),
    esmPartialUpdate("esmPartialUpdate"),
    utmConflict("utmConflict"),
    noVolumes("noVolumes"),
    authFailReadpassword("authFailReadpassword"),
    partCrteFailTblFull("partCrteFailTblFull"),
    attemptToSetLocal("attemptToSetLocal"),
    invalidHostTypeIndex("invalidHostTypeIndex"),
    failVolumeVisible("failVolumeVisible"),
    noDeleteUtmInUse("noDeleteUtmInUse"),
    invalidLun("invalidLun"),
    utmTooManyMaps("utmTooManyMaps"),
    diagReadFailure("diagReadFailure"),
    diagSrcLinkDown("diagSrcLinkDown"),
    diagWriteFailure("diagWriteFailure"),
    diagLoopbackError("diagLoopbackError"),
    diagTimeout("diagTimeout"),
    diagInProgress("diagInProgress"),
    diagNoAlt("diagNoAlt"),
    diagIconSendErr("diagIconSendErr"),
    diagInitErr("diagInitErr"),
    diagModeErr("diagModeErr"),
    diagInvalidTestId("diagInvalidTestId"),
    diagDriveErr("diagDriveErr"),
    diagLockErr("diagLockErr"),
    diagConfigErr("diagConfigErr"),
    diagNoCacheMem("diagNoCacheMem"),
    diagNotQuiesced("diagNotQuiesced"),
    diagUtmNotEnabled("diagUtmNotEnabled"),
    invalidModeSwitch("invalidModeSwitch"),
    invalidPortname("invalidPortname"),
    duplicateVolMapping("duplicateVolMapping"),
    maxSnapsPerBaseExceeded("maxSnapsPerBaseExceeded"),
    maxSnapsExceeded("maxSnapsExceeded"),
    invalidBasevol("invalidBasevol"),
    snapNotAvailable("snapNotAvailable"),
    notDisabled("notDisabled"),
    snapshotFeatureDisabled("snapshotFeatureDisabled"),
    repositoryOffline("repositoryOffline"),
    repositoryReconfiguring("repositoryReconfiguring"),
    rollbackInProgress("rollbackInProgress"),
    numVolumesGroup("numVolumesGroup"),
    ghostVolume("ghostVolume"),
    repositoryMissing("repositoryMissing"),
    invalidRepositoryLabel("invalidRepositoryLabel"),
    invalidSnapLabel("invalidSnapLabel"),
    invalidRollbackPriority("invalidRollbackPriority"),
    invalidWarnThreshold("invalidWarnThreshold"),
    cannotMapVolume("cannotMapVolume"),
    cannotFormatVolume("cannotFormatVolume"),
    dstNotFibre("dstNotFibre"),
    repositoryTooSmall("repositoryTooSmall"),
    repositoryFailed("repositoryFailed"),
    baseVolumeFailed("baseVolumeFailed"),
    baseVolumeOffline("baseVolumeOffline"),
    baseVolumeFormatting("baseVolumeFormatting"),
    metadataVolNonexistent("metadataVolNonexistent"),
    rvmFeatureDisabled("rvmFeatureDisabled"),
    mirrorsPresent("mirrorsPresent"),
    rvmFeatureDeactivated("rvmFeatureDeactivated"),
    maxMirrorsExceeded("maxMirrorsExceeded"),
    invalidMirrorCandidateVol("invalidMirrorCandidateVol"),
    invalidMirrorvol("invalidMirrorvol"),
    metadataAlreadyExists("metadataAlreadyExists"),
    metadataMissing("metadataMissing"),
    metadataOffline("metadataOffline"),
    metadataReconfiguring("metadataReconfiguring"),
    localRoleChangeFailed("localRoleChangeFailed"),
    remoteRoleChangeFailed("remoteRoleChangeFailed"),
    localRoleChangeSuccessful("localRoleChangeSuccessful"),
    onlyLocalMirrorDeleted("onlyLocalMirrorDeleted"),
    noValidMirrorCandidate("noValidMirrorCandidate"),
    remoteMaxMirrorsExceeded("remoteMaxMirrorsExceeded"),
    remoteRvmFeatureDisabled("remoteRvmFeatureDisabled"),
    remoteMetadataVolNonexistent("remoteMetadataVolNonexistent"),
    notRegistered("notRegistered"),
    remoteInvalidCfgGen("remoteInvalidCfgGen"),
    localRoleChangedNotForced("localRoleChangedNotForced"),
    remoteRoleChangedLocalFailed("remoteRoleChangedLocalFailed"),
    rvmSpmError("rvmSpmError"),
    remoteAuthFailPassword("remoteAuthFailPassword"),
    rvmVersionMismatch("rvmVersionMismatch"),
    rvmRemoteArrayError("rvmRemoteArrayError"),
    rvmCommunicationError("rvmCommunicationError"),
    rvmFibreError("rvmFibreError"),
    mirrorVolNotPrimary("mirrorVolNotPrimary"),
    secNotPromoteable("secNotPromoteable"),
    priNotDemoteable("priNotDemoteable"),
    metadataChildDeletion("metadataChildDeletion"),
    rmtvolOrphanDeletion("rmtvolOrphanDeletion"),
    rvmActivateDisallowed("rvmActivateDisallowed"),
    invalidTrayref("invalidTrayref"),
    partialDeletion("partialDeletion"),
    defaultUtmCollision("defaultUtmCollision"),
    invalidCopyPriority("invalidCopyPriority"),
    invalidVolumecopyref("invalidVolumecopyref"),
    copyChangeFailed("copyChangeFailed"),
    copyActive("copyActive"),
    copyInactive("copyInactive"),
    copyIncompatibleSource("copyIncompatibleSource"),
    copyIncompatibleTarget("copyIncompatibleTarget"),
    copyGhostSource("copyGhostSource"),
    copyGhostTarget("copyGhostTarget"),
    copyInvalidSourceRef("copyInvalidSourceRef"),
    copyInvalidTargetRef("copyInvalidTargetRef"),
    copyInvalidSourceState("copyInvalidSourceState"),
    copyInvalidTargetState("copyInvalidTargetState"),
    copySourceReconfig("copySourceReconfig"),
    copyTargetReconfig("copyTargetReconfig"),
    copyTargetTooSmall("copyTargetTooSmall"),
    copyTargetLimit("copyTargetLimit"),
    maxVolumeCopysExceeded("maxVolumeCopysExceeded"),
    copySourceReservation("copySourceReservation"),
    copyTargetReservation("copyTargetReservation"),
    copySourceFormat("copySourceFormat"),
    copyTargetFormat("copyTargetFormat"),
    copyStartFailed("copyStartFailed"),
    copyStopFailed("copyStopFailed"),
    volcopyFeatureDisabled("volcopyFeatureDisabled"),
    writeLock("writeLock"),
    cannotReconfigure("cannotReconfigure"),
    authFailContLockout("authFailContLockout"),
    prReservationConflict("prReservationConflict"),
    regDeleteFailed("regDeleteFailed"),
    batteryNotInConfig("batteryNotInConfig"),
    batteryMissing("batteryMissing"),
    noChannel("noChannel"),
    rvmOperNotAllowedOnSec("rvmOperNotAllowedOnSec"),
    dataRedundancyRequired("dataRedundancyRequired"),
    copySourceZeroCapacity("copySourceZeroCapacity"),
    invHostlunDefineMapping("invHostlunDefineMapping"),
    invHostlunMoveMapping("invHostlunMoveMapping"),
    invHostlunDefineHosttype("invHostlunDefineHosttype"),
    invHostlunMoveHostport("invHostlunMoveHostport"),
    fwIncompatible("fwIncompatible"),
    mirrorAlreadySuspended("mirrorAlreadySuspended"),
    insuffLocalMirRepResources("insuffLocalMirRepResources"),
    insuffRemtMirRepResources("insuffRemtMirRepResources"),
    ghostHasUnreadableSectors("ghostHasUnreadableSectors"),
    rvmCommStatRecoveredTimeout("rvmCommStatRecoveredTimeout"),
    rvmCommStatRecoveredDelay("rvmCommStatRecoveredDelay"),
    rvmCommStatNotReady("rvmCommStatNotReady"),
    rvmCommStatTimeout("rvmCommStatTimeout"),
    rvmCommStatChannelFailure("rvmCommStatChannelFailure"),
    rvmCommStatNetworkFailure("rvmCommStatNetworkFailure"),
    rvmCommStatDeviceMissing("rvmCommStatDeviceMissing"),
    rvmCommStatLoginRejected("rvmCommStatLoginRejected"),
    rvmCommStatLoginFailure("rvmCommStatLoginFailure"),
    rvmCommStatInvNumSamplesReqd("rvmCommStatInvNumSamplesReqd"),
    rvmQuiescenceInProgress("rvmQuiescenceInProgress"),
    rvmInvalidRemotevol("rvmInvalidRemotevol"),
    sodInProgress("sodInProgress"),
    invalidDrives("invalidDrives"),
    invalidSetid("invalidSetid"),
    invalidSetsize("invalidSetsize"),
    missingData("missingData"),
    quiescenceFailed("quiescenceFailed"),
    validationError("validationError"),
    downloadHalted("downloadHalted"),
    allFailed("allFailed"),
    partialOk("partialOk"),
    obsolete("obsolete"),
    usmClearFailed("usmClearFailed"),
    controllerInServiceMode("controllerInServiceMode"),
    invalidDrive("invalidDrive"),
    databaseError("databaseError"),
    backgroundAutocfg("backgroundAutocfg"),
    autocfgInprogress("autocfgInprogress"),
    unsupportedLhaSataEsm("unsupportedLhaSataEsm"),
    parityScanFailed("parityScanFailed"),
    parityRepairFailed("parityRepairFailed"),
    mediaRepairFailed("mediaRepairFailed"),
    mirrorDegraded("mirrorDegraded"),
    prohibitedByMdtRestrictions("prohibitedByMdtRestrictions"),
    prohibitedByGoldKeyRestrictions("prohibitedByGoldKeyRestrictions"),
    safeControllerNotSubjectToGoldKey("safeControllerNotSubjectToGoldKey"),
    safeMdtNotPremiumFeature("safeMdtNotPremiumFeature"),
    alarmNotPresent("alarmNotPresent"),
    dltNotCompleted("dltNotCompleted"),
    dependancyError("dependancyError"),
    cdmDatabaseFull("cdmDatabaseFull"),
    requiredConditionNotPresent("requiredConditionNotPresent"),
    ddcUnavail("ddcUnavail"),
    ddcIllegalParam("ddcIllegalParam"),
    invalidDdcTag("invalidDdcTag"),
    hosttypeConflict("hosttypeConflict"),
    portConflict("portConflict"),
    invalidHosttypeString("invalidHosttypeString"),
    invalidProtocol("invalidProtocol"),
    portRemoved("portRemoved"),
    disableNotPermitted("disableNotPermitted"),
    prohibitedByDriveTrayLimit("prohibitedByDriveTrayLimit"),
    invalidEsmref("invalidEsmref"),
    invalidBundleMigration("invalidBundleMigration"),
    invalidBundleKey("invalidBundleKey"),
    noSparesNeeded("noSparesNeeded"),
    prohibitedByFeatureBundleViolation("prohibitedByFeatureBundleViolation"),
    invalidAuthMethod("invalidAuthMethod"),
    invalidSecret("invalidSecret"),
    secretAlreadyInUse("secretAlreadyInUse"),
    manualConfigModeSet("manualConfigModeSet"),
    noIscsiSessions("noIscsiSessions"),
    invalidInterfaceref("invalidInterfaceref"),
    initiatorConflict("initiatorConflict"),
    initiatorRemoved("initiatorRemoved"),
    basevolSizeChanged("basevolSizeChanged"),
    volumeGroupNotExist("volumeGroupNotExist"),
    volumeGroupNotOnline("volumeGroupNotOnline"),
    volumeGroupHasHotspare("volumeGroupHasHotspare"),
    volumeGroupReconfiguring("volumeGroupReconfiguring"),
    volumeGroupStateNotValid("volumeGroupStateNotValid"),
    controllerNotOptimal("controllerNotOptimal"),
    insufficientCapacity("insufficientCapacity"),
    volumeGroupExported("volumeGroupExported"),
    volumeNotConfigurable("volumeNotConfigurable"),
    volumeGroupNotConfigurable("volumeGroupNotConfigurable"),
    invalidDriveState("invalidDriveState"),
    volumeGroupReconstructing("volumeGroupReconstructing"),
    volumeGroupUndergoingCopyback("volumeGroupUndergoingCopyback"),
    volumeGroupNotComplete("volumeGroupNotComplete"),
    volumeGroupHasFailedDrives("volumeGroupHasFailedDrives"),
    volumeGroupHasNonOptimalVols("volumeGroupHasNonOptimalVols"),
    volumeGroupHasMirrorRelationship("volumeGroupHasMirrorRelationship"),
    volumeGroupHasVolcopyRelationship("volumeGroupHasVolcopyRelationship"),
    volumeGroupHasMirroringMetadata("volumeGroupHasMirroringMetadata"),
    volumeGroupHasMappedVols("volumeGroupHasMappedVols"),
    volumeGroupHasReservations("volumeGroupHasReservations"),
    volumeGroupHasIncompatibleDacstores("volumeGroupHasIncompatibleDacstores"),
    volumeLimitExceeded("volumeLimitExceeded"),
    volumeGroupHasUnknownRaidLevel("volumeGroupHasUnknownRaidLevel"),
    volumeGroupHasUnsupportedRaidLevel("volumeGroupHasUnsupportedRaidLevel"),
    volumeGroupHasCloneOpportunity("volumeGroupHasCloneOpportunity"),
    volumeGroupHasInsufficientDrives("volumeGroupHasInsufficientDrives"),
    volumeGroupHasFailedVols("volumeGroupHasFailedVols"),
    perfTierSafeUpgradeDisabled("perfTierSafeUpgradeDisabled"),
    raid6FeatureUnsupported("raid6FeatureUnsupported"),
    raid6FeatureDisabled("raid6FeatureDisabled"),
    safeControllerNotSubjectToRaid6("safeControllerNotSubjectToRaid6"),
    volumeGroupNotContingent("volumeGroupNotContingent"),
    channelDiagsRunning("channelDiagsRunning"),
    channelDiagsResultsPartial("channelDiagsResultsPartial"),
    volumeGroupHasSnapshotRelationship("volumeGroupHasSnapshotRelationship"),
    prohibitedBySafeViolation("prohibitedBySafeViolation"),
    legacyVg("legacyVg"),
    vgNotForceable("vgNotForceable"),
    channelDiagsLockErr("channelDiagsLockErr"),
    channelDiagsNotQuiesced("channelDiagsNotQuiesced"),
    channelDiagsAltCommFailed("channelDiagsAltCommFailed"),
    channelDiagsChanSetupFailed("channelDiagsChanSetupFailed"),
    channelDiagsDeviceBypassFailed("channelDiagsDeviceBypassFailed"),
    channelDiagsResultsNotAvailable("channelDiagsResultsNotAvailable"),
    driveSpinUpError("driveSpinUpError"),
    driveTypeMismatch("driveTypeMismatch"),
    localRemoteArrayHasSameWwn("localRemoteArrayHasSameWwn"),
    volumeGroupHasIncompatibleDrive("volumeGroupHasIncompatibleDrive"),
    volumeGroupVolumeEncroachesOnDacstore("volumeGroupVolumeEncroachesOnDacstore"),
    volumeGroupImportInProgress("volumeGroupImportInProgress"),
    drivesNeedToBeSpunUp("drivesNeedToBeSpunUp"),
    noNativeSstor("noNativeSstor"),
    noSuchDebugChunk("noSuchDebugChunk"),
    debugInfoConfigChanged("debugInfoConfigChanged"),
    lockdown("lockdown"),
    drivesDacstoresOverlap("drivesDacstoresOverlap"),
    volumeHasAsyncMirror("volumeHasAsyncMirror"),
    reconfigLogSpaceError("reconfigLogSpaceError"),
    volumeGroupInaccessible("volumeGroupInaccessible"),
    volumeInitializing("volumeInitializing"),
    insufficientCache("insufficientCache"),
    volumeInaccessible("volumeInaccessible"),
    noDrivesAdopted("noDrivesAdopted"),
    someDrivesAdopted("someDrivesAdopted"),
    exportingDrivesDatabaseResynchronizing("exportingDrivesDatabaseResynchronizing"),
    exportingDrivesDatabaseFailed("exportingDrivesDatabaseFailed"),
    exportingDrivesQuiesced("exportingDrivesQuiesced"),
    learnActiveTryLater("learnActiveTryLater"),
    noLockedDrives("noLockedDrives"),
    driveSecurityEnabledFailed("driveSecurityEnabledFailed"),
    lockkeyFailed("lockkeyFailed"),
    invalidSecurity("invalidSecurity"),
    noFdeDrives("noFdeDrives"),
    volumeGroupSecure("volumeGroupSecure"),
    invalidBlob("invalidBlob"),
    unlockFailed("unlockFailed"),
    noKeySet("noKeySet"),
    rekeyInProgress("rekeyInProgress"),
    defaultHostGroupMappingNotAllowed("defaultHostGroupMappingNotAllowed"),
    ssdMediaScanNotAllowed("ssdMediaScanNotAllowed"),
    premiumFeatureLimitExceedsMaximum("premiumFeatureLimitExceedsMaximum"),
    disableEvaluationFeatureNotPermitted("disableEvaluationFeatureNotPermitted"),
    requestFailedDueToLun0Restrictions("requestFailedDueToLun0Restrictions"),
    externalKmsEnabled("externalKmsEnabled"),
    externalKmsFailed("externalKmsFailed"),
    externalKmsNotEnabled("externalKmsNotEnabled"),
    keyNotNeeded("keyNotNeeded"),
    keyInvalidSequence("keyInvalidSequence"),
    diagNotRunning("diagNotRunning"),
    ctrlNotInServiceMode("ctrlNotInServiceMode"),
    invalidFeatureref("invalidFeatureref"),
    cacheBackupDevNotExist("cacheBackupDevNotExist"),
    noMatchingLockKeyIdFound("noMatchingLockKeyIdFound"),
    lockKeyValidationFailed("lockKeyValidationFailed"),
    lockKeyValidationDisabled("lockKeyValidationDisabled"),
    externalKmsNotCompliant("externalKmsNotCompliant"),
    externalKmsTimeout("externalKmsTimeout"),
    cannotDisableNoKey("cannotDisableNoKey"),
    previouslyEnabledForEval("previouslyEnabledForEval"),
    featureNotKeyable("featureNotKeyable"),
    evalNotSupported("evalNotSupported"),
    rawdataTransferBadType("rawdataTransferBadType"),
    rawdataTransferNotStarted("rawdataTransferNotStarted"),
    rawdataTransferAlreadyStarted("rawdataTransferAlreadyStarted"),
    rawdataTransferPreparing("rawdataTransferPreparing"),
    rawdataTransferReadError("rawdataTransferReadError"),
    rawdataTransferNoDrives("rawdataTransferNoDrives"),
    rawdataTransferInvalidImage("rawdataTransferInvalidImage"),
    rawdataTransferCrcError("rawdataTransferCrcError"),
    dbmRestoreWriteError("dbmRestoreWriteError"),
    dbmRestoreNoDrives("dbmRestoreNoDrives"),
    rawdataBadSeqNum("rawdataBadSeqNum"),
    invalidCapability("invalidCapability"),
    externalKeyNotInMemory("externalKeyNotInMemory"),
    invalidLockKeyId("invalidLockKeyId"),
    invalidProtection("invalidProtection"),
    volumeHasSnapshotRelationship("volumeHasSnapshotRelationship"),
    volumeHasMirrorRelationship("volumeHasMirrorRelationship"),
    externalKmsDisabledNoKey("externalKmsDisabledNoKey"),
    dbmRestoreAltCtlNotOffline("dbmRestoreAltCtlNotOffline"),
    copyApptagMismatch("copyApptagMismatch"),
    invalidRequestForEnclosure("invalidRequestForEnclosure"),
    dqRetrieveNothingToTransfer("dqRetrieveNothingToTransfer"),
    invalidIscsiConfiguration("invalidIscsiConfiguration"),
    volumeHasVolcopyRelationship("volumeHasVolcopyRelationship"),
    partPiIncapable("partPiIncapable"),
    requestFailedDueToPiRestrictions("requestFailedDueToPiRestrictions"),
    rawdataTransferUserCancelled("rawdataTransferUserCancelled"),
    duplicateIscsiIpAddress("duplicateIscsiIpAddress"),
    portSpeedConflict("portSpeedConflict"),
    factoryDefaultDownloadFailed("factoryDefaultDownloadFailed"),
    errorWritingToEeprom("errorWritingToEeprom"),
    factoryDefaultPartialUpdate("factoryDefaultPartialUpdate"),
    snapshotNotActive("snapshotNotActive"),
    cannotRollback("cannotRollback"),
    mirrorSyncNotPossible("mirrorSyncNotPossible"),
    psuFirmwareDownloadFailed("psuFirmwareDownloadFailed"),
    psuFirmwareUpdateMfgDeviceCodeMismatch("psuFirmwareUpdateMfgDeviceCodeMismatch"),
    psuFirmwareUpdateNotAllRedundant("psuFirmwareUpdateNotAllRedundant"),
    psuFirmwareUpdateNotAllOptimal("psuFirmwareUpdateNotAllOptimal"),
    insufficientRepositoryCapacity("insufficientRepositoryCapacity"),
    rollbackStartFailure("rollbackStartFailure"),
    csbReserveFailed("csbReserveFailed"),
    csbReleaseFailedNoLock("csbReleaseFailedNoLock"),
    csbReleaseFailedInvalidKey("csbReleaseFailedInvalidKey"),
    flashcacheAlreadyExists("flashcacheAlreadyExists"),
    flashcacheFeatureDisabled("flashcacheFeatureDisabled"),
    flashcacheAlreadySuspended("flashcacheAlreadySuspended"),
    flashcacheNotSuspended("flashcacheNotSuspended"),
    flashcacheInvalidConfigType("flashcacheInvalidConfigType"),
    invalidPitGroupLabel("invalidPitGroupLabel"),
    invalidPitConsistencyGroupLabel("invalidPitConsistencyGroupLabel"),
    invalidPitAutoDeleteLimit("invalidPitAutoDeleteLimit"),
    invalidPitRepositoryFullPolicy("invalidPitRepositoryFullPolicy"),
    invalidConcatVolMemberLabel("invalidConcatVolMemberLabel"),
    concatVolMemberTooSmall("concatVolMemberTooSmall"),
    invalidPitGroupRef("invalidPitGroupRef"),
    invalidPitRef("invalidPitRef"),
    dveNotAllowed("dveNotAllowed"),
    dssNotAllowed("dssNotAllowed"),
    dplCoreDumpInvalidTag("dplCoreDumpInvalidTag"),
    invalidPitViewLabel("invalidPitViewLabel"),
    invalidPitViewRef("invalidPitViewRef"),
    invalidConcatVolRef("invalidConcatVolRef"),
    notFlashcacheVol("notFlashcacheVol"),
    flashcacheDeleted("flashcacheDeleted"),
    flashcacheEnabled("flashcacheEnabled"),
    flashcacheNotEnabled("flashcacheNotEnabled"),
    noRepDeletion("noRepDeletion"),
    maxPitsPerGroupExceeded("maxPitsPerGroupExceeded"),
    maxPitsExceeded("maxPitsExceeded"),
    maxPitGroupsPerBaseExceeded("maxPitGroupsPerBaseExceeded"),
    maxPitGroupsExceeded("maxPitGroupsExceeded"),
    maxViewsPerPitExceeded("maxViewsPerPitExceeded"),
    maxViewsExceeded("maxViewsExceeded"),
    maxConsistencyGroupsExceeded("maxConsistencyGroupsExceeded"),
    maxConsistencyGroupMembersExceeded("maxConsistencyGroupMembersExceeded"),
    maxMappableVolumesExceeded("maxMappableVolumesExceeded"),
    notOldestPit("notOldestPit"),
    viewStopped("viewStopped"),
    concatMemberLimitExceeded("concatMemberLimitExceeded"),
    invalidMemberVol("invalidMemberVol"),
    memberVolMapped("memberVolMapped"),
    invalidMemberVolState("invalidMemberVolState"),
    invalidTrimCount("invalidTrimCount"),
    pitGroupInConsistencyGroup("pitGroupInConsistencyGroup"),
    pitInConsistencyGroup("pitInConsistencyGroup"),
    pitViewInConsistencyGroup("pitViewInConsistencyGroup"),
    incompatibleMemberVol("incompatibleMemberVol"),
    volumeInUse("volumeInUse"),
    rvmOverIscsiNotSupported("rvmOverIscsiNotSupported"),
    arvmGroupUserLabelExists("arvmGroupUserLabelExists"),
    arvmGroupDoesNotExist("arvmGroupDoesNotExist"),
    arvmGroupNotEmpty("arvmGroupNotEmpty"),
    concatVolumeFailed("concatVolumeFailed"),
    invalidPitConsistencyGroupRef("invalidPitConsistencyGroupRef"),
    invalidPitConsistencyGroupViewRef("invalidPitConsistencyGroupViewRef"),
    invalidPitConsistencyGroupViewLabel("invalidPitConsistencyGroupViewLabel"),
    alternateRequiredForOperation("alternateRequiredForOperation"),
    invalidPitForView("invalidPitForView"),
    consistencyGroupArvmBindingConflict("consistencyGroupArvmBindingConflict"),
    attributeFixedByArvm("attributeFixedByArvm"),
    operationFailedVolumeCopyClone("operationFailedVolumeCopyClone"),
    pitCreatePending("pitCreatePending"),
    dbmDbSourceUnavailable("dbmDbSourceUnavailable"),
    dbmRestoreSourceMismatch("dbmRestoreSourceMismatch"),
    invalidCriticalThreshold("invalidCriticalThreshold"),
    volumeGroupHasArvmRelationship("volumeGroupHasArvmRelationship"),
    arvmRecoveryPointDeletionRequired("arvmRecoveryPointDeletionRequired"),
    volumeGroupHasPitgroupRelationship("volumeGroupHasPitgroupRelationship"),
    volumeGroupHasPitviewRelationship("volumeGroupHasPitviewRelationship"),
    volumeGroupHasConcatRelationship("volumeGroupHasConcatRelationship"),
    flashcacheSuspended("flashcacheSuspended"),
    flashcacheAlreadyEnabled("flashcacheAlreadyEnabled"),
    dbmDbImageCorrupt("dbmDbImageCorrupt"),
    illegalVolume("illegalVolume"),
    invalidRepositoryCapacity("invalidRepositoryCapacity"),
    invalidProvisionedCapacityQuota("invalidProvisionedCapacityQuota"),
    invalidExpansionPolicy("invalidExpansionPolicy"),
    invalidVirtualCapacity("invalidVirtualCapacity"),
    cannotExpandConcatMember("cannotExpandConcatMember"),
    thresholdBelowUsedCapacity("thresholdBelowUsedCapacity"),
    invalidExpansionOperation("invalidExpansionOperation"),
    repositoryFull("repositoryFull"),
    insufficientExpansionSpace("insufficientExpansionSpace"),
    invalidExpansionSize("invalidExpansionSize"),
    invalidReinitAction("invalidReinitAction"),
    invalidReinitCapacity("invalidReinitCapacity"),
    invalidIncompleteMemberRef("invalidIncompleteMemberRef"),
    arvmGroupNotPrimary("arvmGroupNotPrimary"),
    arvmGroupNotSecondary("arvmGroupNotSecondary"),
    arvmMemberFailed("arvmMemberFailed"),
    arvmGroupNotSuspended("arvmGroupNotSuspended"),
    arvmInvalidMirrorState("arvmInvalidMirrorState"),
    arvmVolumeAlreadyInMirrorRelationship("arvmVolumeAlreadyInMirrorRelationship"),
    arvmMemberLimitExceeded("arvmMemberLimitExceeded"),
    arvmSuspendFailure("arvmSuspendFailure"),
    arvmResumeFailure("arvmResumeFailure"),
    arvmSynchronizeFailure("arvmSynchronizeFailure"),
    remoteTargetNotFound("remoteTargetNotFound"),
    arvmMirrorMemberDoesNotExist("arvmMirrorMemberDoesNotExist"),
    snapConversionTooManySnaps("snapConversionTooManySnaps"),
    snapConversionMissingLabel("snapConversionMissingLabel"),
    arvmFeatureDeactivated("arvmFeatureDeactivated"),
    incompatibleRepositorySecurity("incompatibleRepositorySecurity"),
    incompatibleSecondarySecurity("incompatibleSecondarySecurity"),
    mirrorProtocolMismatch("mirrorProtocolMismatch"),
    arvmAsyncMirrorGroupPresent("arvmAsyncMirrorGroupPresent"),
    cacheParametersNotChangeable("cacheParametersNotChangeable"),
    flashcacheMaxCapacityExceeded("flashcacheMaxCapacityExceeded"),
    flashcacheFailed("flashcacheFailed"),
    dplCoreDumpRestoreInProgress("dplCoreDumpRestoreInProgress"),
    arvmGroupHasIncompleteMember("arvmGroupHasIncompleteMember"),
    arvmConnectivityTestAlreadyInProgress("arvmConnectivityTestAlreadyInProgress"),
    arvmConnectivityTestNetworkError("arvmConnectivityTestNetworkError"),
    arvmConnectivityTestRemoteTimeout("arvmConnectivityTestRemoteTimeout"),
    arvmConnectivityTestLoginFailure("arvmConnectivityTestLoginFailure"),
    arvmConnectivityTestNameServiceError("arvmConnectivityTestNameServiceError"),
    arvmConnectivityTestTurError("arvmConnectivityTestTurError"),
    arvmConnectivityTestMissingRemoteAmg("arvmConnectivityTestMissingRemoteAmg"),
    arvmConnectivityTestAmgMemberMismatch("arvmConnectivityTestAmgMemberMismatch"),
    invalidSyncPriority("invalidSyncPriority"),
    invalidRecoveryPointAlertThreshold("invalidRecoveryPointAlertThreshold"),
    invalidSyncAlertThreshold("invalidSyncAlertThreshold"),
    mustSpecifyExistingVolumes("mustSpecifyExistingVolumes"),
    arvmConnectivityTestTimeoutExceeded("arvmConnectivityTestTimeoutExceeded"),
    flashcacheMaxLimitExceeded("flashcacheMaxLimitExceeded"),
    volsInVgUsingNonSecureCapableFlashcache("volsInVgUsingNonSecureCapableFlashcache"),
    volsInVgUsingSecureDisabledFlashcache("volsInVgUsingSecureDisabledFlashcache"),
    invalidSubmodelId("invalidSubmodelId"),
    premiumFeatureLimitMismatch("premiumFeatureLimitMismatch"),
    volumeGroupNotImportable("volumeGroupNotImportable"),
    primaryCacheSizeMismatch("primaryCacheSizeMismatch"),
    flashcacheUserLabelExists("flashcacheUserLabelExists"),
    maxThinVolumesExceeded("maxThinVolumesExceeded"),
    arvmInvalidSecondaryCapacity("arvmInvalidSecondaryCapacity"),
    arvmOnlyPrimaryMemberRemoved("arvmOnlyPrimaryMemberRemoved"),
    arvmOnlySecondaryMemberRemoved("arvmOnlySecondaryMemberRemoved"),
    arvmInvalidAmgRequestWhileSuspended("arvmInvalidAmgRequestWhileSuspended"),
    arvmManualSyncAlreadyInProgress("arvmManualSyncAlreadyInProgress"),
    arvmManualSyncRetryTooSoon("arvmManualSyncRetryTooSoon"),
    diskPoolNotEmpty("diskPoolNotEmpty"),
    flashCacheInvalidBaseVol("flashCacheInvalidBaseVol"),
    flashCacheFdeEnablementDisallowed("flashCacheFdeEnablementDisallowed"),
    remoteArvmFeatureDeactivated("remoteArvmFeatureDeactivated"),
    remoteArvmFeatureDisabled("remoteArvmFeatureDisabled"),
    arvmOrphanGroup("arvmOrphanGroup"),
    arvmOrphanMember("arvmOrphanMember"),
    volumeNotAvailable("volumeNotAvailable"),
    volumeHasUnreadableSectors("volumeHasUnreadableSectors"),
    thinProvisioningFeatureDisabled("thinProvisioningFeatureDisabled"),
    pitGroupsFeatureDisabled("pitGroupsFeatureDisabled"),
    exceedDiskPoolLimit("exceedDiskPoolLimit"),
    flashcacheDegradedState("flashcacheDegradedState"),
    flashcacheNonDaCapableDriveDisallowed("flashcacheNonDaCapableDriveDisallowed"),
    arvmMaxAsyncMirrorGroupsExceeded("arvmMaxAsyncMirrorGroupsExceeded"),
    arvmMaxMirrorsPerArrayExceeded("arvmMaxMirrorsPerArrayExceeded"),
    maxTotalMirrorsPerArrayExceeded("maxTotalMirrorsPerArrayExceeded"),
    exceedDiskPoolCapacity("exceedDiskPoolCapacity"),
    exceedMaxVolumeCapacity("exceedMaxVolumeCapacity"),
    arvmRemoteMaxAsyncMirrorGroupsExceeded("arvmRemoteMaxAsyncMirrorGroupsExceeded"),
    arvmRemoteMaxMirrorsPerArrayExceeded("arvmRemoteMaxMirrorsPerArrayExceeded"),
    remoteMaxTotalMirrorsPerArrayExceeded("remoteMaxTotalMirrorsPerArrayExceeded"),
    arvmInvalidSyncInterval("arvmInvalidSyncInterval"),
    remoteNoHeap("remoteNoHeap"),
    remoteInternalError("remoteInternalError"),
    remoteRvmSpmError("remoteRvmSpmError"),
    arvmRemoteMirrorMemberDoesNotExist("arvmRemoteMirrorMemberDoesNotExist"),
    arvmRemoteGroupUserLabelExists("arvmRemoteGroupUserLabelExists"),
    arvmRemoteGroupNotSecondary("arvmRemoteGroupNotSecondary"),
    arvmRemoteGroupDoesNotExist("arvmRemoteGroupDoesNotExist"),
    remoteInvalidProtection("remoteInvalidProtection"),
    remoteDatabaseError("remoteDatabaseError"),
    arvmRemoteGroupNotEmpty("arvmRemoteGroupNotEmpty"),
    arvmRemoteSuspendFailure("arvmRemoteSuspendFailure"),
    arvmRemoteResumeFailure("arvmRemoteResumeFailure"),
    arvmRemoteSynchronizeFailure("arvmRemoteSynchronizeFailure"),
    flashcacheInvalidAnalyticsState("flashcacheInvalidAnalyticsState"),
    arvmExpansionSynchronizationInProgress("arvmExpansionSynchronizationInProgress"),
    arvmRemoteExpansionSynchronizationInProgress("arvmRemoteExpansionSynchronizationInProgress"),
    faultConditionStillExists("faultConditionStillExists"),
    remoteTryAlternate("remoteTryAlternate"),
    arvmOnlyLocalAmgDeleted("arvmOnlyLocalAmgDeleted"),
    arvmRoleChangePending("arvmRoleChangePending"),
    arvmRoleChangeInProgress("arvmRoleChangeInProgress"),
    arvmMemberStopped("arvmMemberStopped"),
    reconstructionInProgress("reconstructionInProgress"),
    copybackInProgress("copybackInProgress"),
    adminPasswordNotSet("adminPasswordNotSet"),
    keyDoesNotExist("keyDoesNotExist"),
    takeRecoveryActionsFirst("takeRecoveryActionsFirst"),
    coredumpBackupInProgress("coredumpBackupInProgress"),
    legacyRvmAsyncModeUnsupported("legacyRvmAsyncModeUnsupported"),
    arvmIncorrectVolumeType("arvmIncorrectVolumeType"),
    thinVolumeParametersCannotBeModified("thinVolumeParametersCannotBeModified"),
    arvmRemoteThinNotSupported("arvmRemoteThinNotSupported"),
    snmpInvalidCommunityName("snmpInvalidCommunityName"),
    snmpInvalidCommunityPermission("snmpInvalidCommunityPermission"),
    snmpInvalidCommunityRef("snmpInvalidCommunityRef"),
    snmpInvalidTrapDestinationRef("snmpInvalidTrapDestinationRef"),
    invalidIpAddress("invalidIpAddress"),
    snmpMaxCommunitiesExceeded("snmpMaxCommunitiesExceeded"),
    snmpMaxTrapDestinationsExceeded("snmpMaxTrapDestinationsExceeded"),
    snmpCommunityNameInUse("snmpCommunityNameInUse"),
    snmpTrapDestinationAddressInUse("snmpTrapDestinationAddressInUse"),
    snmpUnknownSystemVariable("snmpUnknownSystemVariable"),
    snmpInvalidSystemVariableValue("snmpInvalidSystemVariableValue"),
    snmpIncompatibleFirmware("snmpIncompatibleFirmware"),
    snmpAgentDisabled("snmpAgentDisabled"),
    snmpAgentInitFailed("snmpAgentInitFailed"),
    arvmThinVolInitError("arvmThinVolInitError"),
    arvmRemoteThinVolInitError("arvmRemoteThinVolInitError"),
    snmpIncompatibleIpv4Address("snmpIncompatibleIpv4Address"),
    snmpIncompatibleIpv6Address("snmpIncompatibleIpv6Address"),
    drivesNotAvailableForRemoval("drivesNotAvailableForRemoval"),
    snmpCannotDisableIpv4("snmpCannotDisableIpv4"),
    snmpCannotDisableIpv6("snmpCannotDisableIpv6"),
    snmpIpv4ConfigError("snmpIpv4ConfigError"),
    iocDumpInProgress("iocDumpInProgress"),
    iocRestoreInProgress("iocRestoreInProgress"),
    iocDumpInvalidTag("iocDumpInvalidTag"),
    unsupportedEsmRequest("unsupportedEsmRequest"),
    isnsDhcpNotSupported("isnsDhcpNotSupported"),
    dpcVolumeGroupNotRedundant("dpcVolumeGroupNotRedundant"),
    dpcVolumeNotInitialized("dpcVolumeNotInitialized"),
    dpcExclusiveOperationActive("dpcExclusiveOperationActive"),
    dpcUnableToPowerUpDrive("dpcUnableToPowerUpDrive"),
    dpcFormatActive("dpcFormatActive"),
    dpcUnreadableSectorsPresent("dpcUnreadableSectorsPresent"),
    dpcPowerCycleAlreadyInProgress("dpcPowerCycleAlreadyInProgress"),
    dpcEnclosureHardwareUnsupported("dpcEnclosureHardwareUnsupported"),
    dpcEnclosureFwDownlevel("dpcEnclosureFwDownlevel"),
    evacInProgress("evacInProgress"),
    noEvacFound("noEvacFound"),
    noHotspareAvailable("noHotspareAvailable"),
    driveServiceInProgress("driveServiceInProgress"),
    hdd4kbSegmentsizeNotAllowed("hdd4kbSegmentsizeNotAllowed"),
    diskPoolNoSpareDrives("diskPoolNoSpareDrives"),
    diskPoolExceedSpareCapacity("diskPoolExceedSpareCapacity"),
    autoLoadBalanceUserDisabled("autoLoadBalanceUserDisabled"),
    autoLoadBalanceInsufficientStatistics("autoLoadBalanceInsufficientStatistics"),
    invalidLoadBalanceAction("invalidLoadBalanceAction"),
    invalidLoadBalanceDelay("invalidLoadBalanceDelay"),
    reservedAddress("reservedAddress"),
    volumeCreationInProgress("volumeCreationInProgress"),
    keyValueTagInvalidRef("keyValueTagInvalidRef"),
    keyValueTagInvalidDuplicate("keyValueTagInvalidDuplicate"),
    keyValueTagInUse("keyValueTagInUse"),
    workloadInvalidRef("workloadInvalidRef"),
    invalidKeyValueTagObjectReference("invalidKeyValueTagObjectReference"),
    mappingInvalidDuplicate("mappingInvalidDuplicate"),
    downloadCompleteNoReboot("downloadCompleteNoReboot"),
    downloadCompleteMswOnlyReboot("downloadCompleteMswOnlyReboot"),
    workloadInvalidDuplicate("workloadInvalidDuplicate"),
    mappingInvalidRef("mappingInvalidRef"),
    workloadInUse("workloadInUse"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    ReturnCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ReturnCodeEnum returnCode;

    private Integer supportDataLockKey;

    private Integer supportDataLockTimeRemaining;

  
  /**
   * An enumeration used to determine the return status of a SYMbol function call.
   **/
  public ReserveSupportDataReturned returnCode(ReturnCodeEnum returnCode) {
    this.returnCode = returnCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An enumeration used to determine the return status of a SYMbol function call.")
  @JsonProperty("returnCode")
  public ReturnCodeEnum getReturnCode() {
    return returnCode;
  }
  
  public void setReturnCode(ReturnCodeEnum returnCode) {
    this.returnCode = returnCode;
  }

  
  /**
   * This field is present only if the value of returnCode is equal to RETCODE_OK. It contains the lock key to be used when later releasing the reservation.
   **/
  public ReserveSupportDataReturned supportDataLockKey(Integer supportDataLockKey) {
    this.supportDataLockKey = supportDataLockKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of returnCode is equal to RETCODE_OK. It contains the lock key to be used when later releasing the reservation.")
  @JsonProperty("supportDataLockKey")
  public Integer getSupportDataLockKey() {
    return supportDataLockKey;
  }
  
  public void setSupportDataLockKey(Integer supportDataLockKey) {
    this.supportDataLockKey = supportDataLockKey;
  }

  
  /**
   * This field is present only if the value of returnCode is equal to RETCODE_CSB_RESERVE_FAILED. It is an integer indicating the suggested number of seconds to wait before retrying the reserve.
   **/
  public ReserveSupportDataReturned supportDataLockTimeRemaining(Integer supportDataLockTimeRemaining) {
    this.supportDataLockTimeRemaining = supportDataLockTimeRemaining;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of returnCode is equal to RETCODE_CSB_RESERVE_FAILED. It is an integer indicating the suggested number of seconds to wait before retrying the reserve.")
  @JsonProperty("supportDataLockTimeRemaining")
  public Integer getSupportDataLockTimeRemaining() {
    return supportDataLockTimeRemaining;
  }
  
  public void setSupportDataLockTimeRemaining(Integer supportDataLockTimeRemaining) {
    this.supportDataLockTimeRemaining = supportDataLockTimeRemaining;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReserveSupportDataReturned reserveSupportDataReturned = (ReserveSupportDataReturned) o;
    return Objects.equals(this.returnCode, reserveSupportDataReturned.returnCode) &&
        Objects.equals(this.supportDataLockKey, reserveSupportDataReturned.supportDataLockKey) &&
        Objects.equals(this.supportDataLockTimeRemaining, reserveSupportDataReturned.supportDataLockTimeRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnCode, supportDataLockKey, supportDataLockTimeRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReserveSupportDataReturned {\n");
    
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    supportDataLockKey: ").append(toIndentedString(supportDataLockKey)).append("\n");
    sb.append("    supportDataLockTimeRemaining: ").append(toIndentedString(supportDataLockTimeRemaining)).append("\n");
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

