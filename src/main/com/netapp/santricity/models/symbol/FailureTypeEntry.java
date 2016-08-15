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
 * FailureTypeEntry
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class FailureTypeEntry   {
  

  /**
   * This enumeration defines the different recovery failure types that may be reported by a controller as part of the getRecoveryFailureList procedure.
   */
  public enum RecFailureTypeEnum {
    unknownFailure("unknownFailure"),
    failedFan("failedFan"),
    failedPowerSupply("failedPowerSupply"),
    failedMinihub("failedMinihub"),
    failedEsm("failedEsm"),
    batteryNearExpiration("batteryNearExpiration"),
    failedBattery("failedBattery"),
    nominalTempExceeded("nominalTempExceeded"),
    maxTempExceeded("maxTempExceeded"),
    upsOnBattery("upsOnBattery"),
    nonPreferredPath("nonPreferredPath"),
    memParityError("memParityError"),
    failedDriveScsiChannel("failedDriveScsiChannel"),
    degradedVolume("degradedVolume"),
    failedVolumeInterruptedWrite("failedVolumeInterruptedWrite"),
    failedModifyingVolume("failedModifyingVolume"),
    failedModifyingMultiRaid("failedModifyingMultiRaid"),
    failedVolume("failedVolume"),
    failedVolumeMultiRaid("failedVolumeMultiRaid"),
    impairedVolume("impairedVolume"),
    failedVolumeAwaitingInit("failedVolumeAwaitingInit"),
    volumeHotSpareInUse("volumeHotSpareInUse"),
    offlineVolumeGroup("offlineVolumeGroup"),
    failedDrive("failedDrive"),
    impendingDriveFailureRiskHigh("impendingDriveFailureRiskHigh"),
    impendingDriveFailureRiskMed("impendingDriveFailureRiskMed"),
    impendingDriveFailureRiskLow("impendingDriveFailureRiskLow"),
    uncertifiedDrive("uncertifiedDrive"),
    offlineCtl("offlineCtl"),
    passiveCtl("passiveCtl"),
    partitionsNotCompliant("partitionsNotCompliant"),
    esmCodeVersionMismatch("esmCodeVersionMismatch"),
    lostRedundancyDrive("lostRedundancyDrive"),
    lostRedundancyTray("lostRedundancyTray"),
    lostRedundancyEsm("lostRedundancyEsm"),
    trayidMismatch("trayidMismatch"),
    trayidConflict("trayidConflict"),
    failedTransceiverModule("failedTransceiverModule"),
    channelMiswire("channelMiswire"),
    nonFruBatteryNearExpiration("nonFruBatteryNearExpiration"),
    nonFruFailedBattery("nonFruFailedBattery"),
    rpaErrCtl("rpaErrCtl"),
    repositoryOverThreshold("repositoryOverThreshold"),
    repositoryFull("repositoryFull"),
    snapshotFailed("snapshotFailed"),
    unsupportedMinihub("unsupportedMinihub"),
    esmMiswire("esmMiswire"),
    ghostVolume("ghostVolume"),
    snapshotNotCompliant("snapshotNotCompliant"),
    rvmNotCompliant("rvmNotCompliant"),
    metadataOffline("metadataOffline"),
    mirrorDualPrimary("mirrorDualPrimary"),
    mirrorDualSecondary("mirrorDualSecondary"),
    mirrorUnsynchronized("mirrorUnsynchronized"),
    remoteNoLun("remoteNoLun"),
    remoteNoArray("remoteNoArray"),
    remoteNoFabric("remoteNoFabric"),
    remoteWwnChangeFailed("remoteWwnChangeFailed"),
    fanUnknownStat("fanUnknownStat"),
    powerSupplyUnknownStat("powerSupplyUnknownStat"),
    esmUnknownStat("esmUnknownStat"),
    tempSensorUnknownStat("tempSensorUnknownStat"),
    transModUnknownStat("transModUnknownStat"),
    driveBypassedSpeedMismatch("driveBypassedSpeedMismatch"),
    driveBypassedCauseUnknown("driveBypassedCauseUnknown"),
    minihubSpeedMismatch("minihubSpeedMismatch"),
    removedEsm("removedEsm"),
    removedBattery("removedBattery"),
    nonFruRemovedBattery("nonFruRemovedBattery"),
    volcopyFailed("volcopyFailed"),
    volcopyNotCompliant("volcopyNotCompliant"),
    channelDegraded("channelDegraded"),
    unsupportedTray("unsupportedTray"),
    speedNegError("speedNegError"),
    usmDatabaseFull("usmDatabaseFull"),
    usmUnreadableSectorsExist("usmUnreadableSectorsExist"),
    pathDegraded("pathDegraded"),
    netSetupError("netSetupError"),
    mismatchedDriveType("mismatchedDriveType"),
    ctlMismatch("ctlMismatch"),
    failedDiscreteLine("failedDiscreteLine"),
    channelFailed("channelFailed"),
    linkSpeedDetectionMismatch("linkSpeedDetectionMismatch"),
    uncertifiedEsm("uncertifiedEsm"),
    removedFan("removedFan"),
    removedPowerSupply("removedPowerSupply"),
    removedTempSensor("removedTempSensor"),
    removedIccCru("removedIccCru"),
    removedSupportCru("removedSupportCru"),
    failedIccCru("failedIccCru"),
    failedSupportCru("failedSupportCru"),
    batteryUnknownStat("batteryUnknownStat"),
    driveTraysNotGroupedTogether("driveTraysNotGroupedTogether"),
    goldKeyNotCompliant("goldKeyNotCompliant"),
    mismatchedMdtSettings("mismatchedMdtSettings"),
    mismatchedGoldKeySettings("mismatchedGoldKeySettings"),
    ctlMiswire("ctlMiswire"),
    supportCruNoinput("supportCruNoinput"),
    submodelNotSupported("submodelNotSupported"),
    submodelNotSet("submodelNotSet"),
    submodelMismatch("submodelMismatch"),
    failedBatterySystem("failedBatterySystem"),
    removedBatteryPack("removedBatteryPack"),
    batteryConfigMismatch("batteryConfigMismatch"),
    esmHardwareMismatch("esmHardwareMismatch"),
    hostBoardFault("hostBoardFault"),
    ddcAvailable("ddcAvailable"),
    replacedDriveWrongType("replacedDriveWrongType"),
    redundantPsRequired("redundantPsRequired"),
    driveTraysNotCompliant("driveTraysNotCompliant"),
    sasDeviceLimitExceeded("sasDeviceLimitExceeded"),
    sasPortMiswired("sasPortMiswired"),
    sasPortDegraded("sasPortDegraded"),
    sasPortFailed("sasPortFailed"),
    corruptVpdEeprom("corruptVpdEeprom"),
    failedI2cBus("failedI2cBus"),
    enclosureMisconfigured("enclosureMisconfigured"),
    featureBundleNotCompliant("featureBundleNotCompliant"),
    driveBypassedSinglePort("driveBypassedSinglePort"),
    esmFactoryDefaultsMismatch("esmFactoryDefaultsMismatch"),
    hostBoardUnknownStat("hostBoardUnknownStat"),
    failedHostIoCard("failedHostIoCard"),
    batteryWarn("batteryWarn"),
    volumeGroupPartiallyComplete("volumeGroupPartiallyComplete"),
    volumeGroupIncomplete("volumeGroupIncomplete"),
    volumeGroupMissing("volumeGroupMissing"),
    hotspareDriveMissing("hotspareDriveMissing"),
    driveIncompatibleUprevDacstore("driveIncompatibleUprevDacstore"),
    driveIncompatibleDownrevDacstore("driveIncompatibleDownrevDacstore"),
    iccCruUnknownStat("iccCruUnknownStat"),
    removedAlarm("removedAlarm"),
    supportCruUnknownStat("supportCruUnknownStat"),
    performanceTierNotCompliant("performanceTierNotCompliant"),
    raid6NotCompliant("raid6NotCompliant"),
    driveIncompatibleSectorSize("driveIncompatibleSectorSize"),
    foreignDriveInconsistent("foreignDriveInconsistent"),
    foreignDriveRefersToNativeDrive("foreignDriveRefersToNativeDrive"),
    nativeVgRefersToForeignDrive("nativeVgRefersToForeignDrive"),
    nativeVgForeignDriveMutualRef("nativeVgForeignDriveMutualRef"),
    vgCloned("vgCloned"),
    foreignDriveHasInconsistentRole("foreignDriveHasInconsistentRole"),
    vgDrivePartOfMultipleVgs("vgDrivePartOfMultipleVgs"),
    incompatibleFailedLegacyDrive("incompatibleFailedLegacyDrive"),
    unsupportedCacheMemorySize("unsupportedCacheMemorySize"),
    dedicatedMirrorChannelFailed("dedicatedMirrorChannelFailed"),
    vgHasDrivePartOfMultipleVgs("vgHasDrivePartOfMultipleVgs"),
    ddfDriveOtherVendor("ddfDriveOtherVendor"),
    multipleConfigDatabasesDetected("multipleConfigDatabasesDetected"),
    adoptionFailedRaidLevelUnsupported("adoptionFailedRaidLevelUnsupported"),
    dbAdoptionHardLimitExceeded("dbAdoptionHardLimitExceeded"),
    legacyVgNotOptimal("legacyVgNotOptimal"),
    cacheMemSizeMismatch("cacheMemSizeMismatch"),
    altCtlrBoardIdUnreadable("altCtlrBoardIdUnreadable"),
    cacheBackupDeviceFailed("cacheBackupDeviceFailed"),
    cacheBackupDeviceWriteProtected("cacheBackupDeviceWriteProtected"),
    cacheBackupDeviceInsufficientCapacity("cacheBackupDeviceInsufficientCapacity"),
    expiredBattery("expiredBattery"),
    expiredIntegratedBattery("expiredIntegratedBattery"),
    procMemTooSmallForCache("procMemTooSmallForCache"),
    batteryOvertemp("batteryOvertemp"),
    invalidHostTypeIndex("invalidHostTypeIndex"),
    insufficientProcMemory("insufficientProcMemory"),
    ctlFailedCacheBackupDev("ctlFailedCacheBackupDev"),
    removedController("removedController"),
    degradedHostIoCard("degradedHostIoCard"),
    ldFwVersionMismatch("ldFwVersionMismatch"),
    ldIncompatibleDatabase("ldIncompatibleDatabase"),
    hostBoardIdMismatch("hostBoardIdMismatch"),
    iccMissing("iccMissing"),
    linkSpeedMismatch("linkSpeedMismatch"),
    unsupportedHostBoard("unsupportedHostBoard"),
    writebackCachingDisabled("writebackCachingDisabled"),
    securityGetKey("securityGetKey"),
    securityKeyInconsistent("securityKeyInconsistent"),
    securityNotCompliant("securityNotCompliant"),
    mixedDriveEnclosureMiswire("mixedDriveEnclosureMiswire"),
    unsuccessIsolationRedunMismatch("unsuccessIsolationRedunMismatch"),
    thresExcdedMismatchCorrected("thresExcdedMismatchCorrected"),
    inactiveHostPort("inactiveHostPort"),
    inactiveInitiator("inactiveInitiator"),
    protectionInformationNotCompliant("protectionInformationNotCompliant"),
    protectionInformationNotSupported("protectionInformationNotSupported"),
    replacedInsufficientDriveCapacity("replacedInsufficientDriveCapacity"),
    drawerFailed("drawerFailed"),
    drawerOpened("drawerOpened"),
    ssdNotCompliant("ssdNotCompliant"),
    ssdAtEndOfLife("ssdAtEndOfLife"),
    fibreTrunkMiswire("fibreTrunkMiswire"),
    fibreTrunkIncompatibleEsm("fibreTrunkIncompatibleEsm"),
    driveSlotLimitNotCompliant("driveSlotLimitNotCompliant"),
    securityGetNewKey("securityGetNewKey"),
    externalKmsNotCompliant("externalKmsNotCompliant"),
    sbbValidationFailure("sbbValidationFailure"),
    invalidPowerSupply("invalidPowerSupply"),
    enclosureThermalShutdown("enclosureThermalShutdown"),
    wbCachingForciblyDisabled("wbCachingForciblyDisabled"),
    driveUnsupportedProtocolConnection("driveUnsupportedProtocolConnection"),
    failedTwiBus("failedTwiBus"),
    mismatchedMidplaneEeproms("mismatchedMidplaneEeproms"),
    driveUnsupportedCapacity("driveUnsupportedCapacity"),
    evaluationLicenseExpirationImminent("evaluationLicenseExpirationImminent"),
    externalKmsKeyInvalid("externalKmsKeyInvalid"),
    multipleMismatchedKeyIdsFound("multipleMismatchedKeyIdsFound"),
    securityKeyValidationLock("securityKeyValidationLock"),
    cacheDataLoss("cacheDataLoss"),
    baseControllerDiagFailed("baseControllerDiagFailed"),
    featureNotCompliant("featureNotCompliant"),
    driveIncompatiblePiType("driveIncompatiblePiType"),
    drawerDegraded("drawerDegraded"),
    offlineCtlIocFail("offlineCtlIocFail"),
    invalidSataFlashConfiguration("invalidSataFlashConfiguration"),
    iocDiagFail("iocDiagFail"),
    sasPhyDisabledLocalWidePortDegraded("sasPhyDisabledLocalWidePortDegraded"),
    sasPhyDisabledSharedWidePortDegraded("sasPhyDisabledSharedWidePortDegraded"),
    drawerInvalid("drawerInvalid"),
    drawerRemoved("drawerRemoved"),
    driveUnsupportedInterposerFwVersion("driveUnsupportedInterposerFwVersion"),
    redundancyGroupNotConsistentDuringReconfig("redundancyGroupNotConsistentDuringReconfig"),
    snapshotRollbackPaused("snapshotRollbackPaused"),
    pitRollbackPaused("pitRollbackPaused"),
    pitGroupRepositoryOverThreshold("pitGroupRepositoryOverThreshold"),
    pitViewRepositoryOverThreshold("pitViewRepositoryOverThreshold"),
    pitGroupRepositoryFull("pitGroupRepositoryFull"),
    pitViewRepositoryFull("pitViewRepositoryFull"),
    pitGroupFailed("pitGroupFailed"),
    pitViewFailed("pitViewFailed"),
    pitPurged("pitPurged"),
    arvmDegradedMirrorGroup("arvmDegradedMirrorGroup"),
    arvmFailedMirror("arvmFailedMirror"),
    arvmSyncIntervalTimeOverThreshold("arvmSyncIntervalTimeOverThreshold"),
    arvmRepositoryOverWarnThreshold("arvmRepositoryOverWarnThreshold"),
    arvmMirrorGroupRoleConflict("arvmMirrorGroupRoleConflict"),
    incompatibleVolumeGroupSecurity("incompatibleVolumeGroupSecurity"),
    arvmOrphanGroup("arvmOrphanGroup"),
    arvmOrphanMember("arvmOrphanMember"),
    arvmMirrorGroupRecoveryPointLost("arvmMirrorGroupRecoveryPointLost"),
    diskPoolPartiallyPresent("diskPoolPartiallyPresent"),
    diskPoolIncomplete("diskPoolIncomplete"),
    diskPoolMissing("diskPoolMissing"),
    diskPoolReconstructionDriveCountBelowThreshold("diskPoolReconstructionDriveCountBelowThreshold"),
    diskPoolUtilizationWarning("diskPoolUtilizationWarning"),
    diskPoolUtilizationCritical("diskPoolUtilizationCritical"),
    pendingPitCreationFailed("pendingPitCreationFailed"),
    pendingCgpitCreationFailed("pendingCgpitCreationFailed"),
    tpvRepositoryOverThreshold("tpvRepositoryOverThreshold"),
    tpvRepositoryFull("tpvRepositoryFull"),
    tpvFailed("tpvFailed"),
    arvmSecondaryRepositoryFull("arvmSecondaryRepositoryFull"),
    arvmSyncInternallySuspended("arvmSyncInternallySuspended"),
    databaseRecoveryMode("databaseRecoveryMode"),
    arvmPrimaryRepositoryFull("arvmPrimaryRepositoryFull"),
    incompatibleSataDrive("incompatibleSataDrive"),
    diskPoolCapacityDepleted("diskPoolCapacityDepleted"),
    driveIncompatibleModelNumberUnsupported("driveIncompatibleModelNumberUnsupported"),
    flashCacheNonOptimalDrives("flashCacheNonOptimalDrives"),
    flashCacheHotSpareInUse("flashCacheHotSpareInUse"),
    allDrivesBypassedIncompatibleNvsram("allDrivesBypassedIncompatibleNvsram"),
    diskPoolDriveFailure("diskPoolDriveFailure"),
    diskPoolInsufficientMemory("diskPoolInsufficientMemory"),
    arvmOrphanIncompleteMember("arvmOrphanIncompleteMember"),
    arvmSyncPausedAltState("arvmSyncPausedAltState"),
    arvmRoleChangePaused("arvmRoleChangePaused"),
    driveIncompatibleAlignmentForEmulationDrive("driveIncompatibleAlignmentForEmulationDrive"),
    lossOfExternalRedundancy("lossOfExternalRedundancy"),
    rvmWriteModeInconsistent("rvmWriteModeInconsistent"),
    sasHostMiswire("sasHostMiswire"),
    sasCrossMiswire("sasCrossMiswire"),
    sasLoopMiswire("sasLoopMiswire"),
    copyThenFailWaitingOnHotSpare("copyThenFailWaitingOnHotSpare"),
    missingDriveLockdown("missingDriveLockdown"),
    hicConfigurationOoc("hicConfigurationOoc"),
    copyThenFailWaitingOnDdpCapacity("copyThenFailWaitingOnDdpCapacity"),
    piErrorServiceMode("piErrorServiceMode"),
    piErrorLockdown("piErrorLockdown"),
    sasPortDiscoveryError("sasPortDiscoveryError"),
    netNtpResolutionFail("netNtpResolutionFail"),
    netNtpQueryFail("netNtpQueryFail"),
    netNtpServiceUnavailable("netNtpServiceUnavailable"),
    multipathConfigurationError("multipathConfigurationError"),
    hostRedundancyLost("hostRedundancyLost"),
    excessiveRebootsDetected("excessiveRebootsDetected"),
    cacheNotFlushedOnOnlyCtlr("cacheNotFlushedOnOnlyCtlr"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    RecFailureTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private RecFailureTypeEnum recFailureType;

    private String altCtlrBoardIdUnreadable;

    private String baseControllerDiagFailed;

    private String batteryConfigMismatch;

    private String batteryWarn;

    private String batteryTempWarn;

    private String batteryStatUnknown;

    private String batteryCapacityWarn;

    private String failedCacheBackupDevice;

    private String insufficientCacheBackupDeviceCapacity;

    private String writeProtectedCacheBackupDevice;

    private ChannelDegradedFailure channelDegradedFailure;

    private ChannelFailedFailure channelFailedFailure;

    private String chanMiswire;

    private String vpdEepromCorrupted;

    private String ctlMismatch;

    private ControllerMiswireError ctlMiswire;

    private String ddfDriveOtherVendor;

    private String failedDedicatedMirrorChannel;

    private String degradedHostBoard;

    private String volDegraded;

    private String drvBypassCauseUnknown;

    private String driveBypassedSinglePort;

    private String speedMismatchDrive;

    private String incompatibleDownRevDacstoreDriveRef;

    private List<MiswiredDriveChannelList> mixedDriveEnclosureMiswire;

    private String incompatibleSectorSizeDriveRef;

    private String incompatibleUpRevDacstoreDriveRef;

    private FeatureState driveTrayExpansionFeature;

    private TrayRefList driveTraysNotGroupedTogether;

    private String misconfiguredEnclosure;

    private String trayCodeMismatch;

    private String esmFactoryDefaultsMismatch;

    private String trayHardwareMismatch;

    private String esmMiswire;

    private String esmStatUnknown;

    private String batteryExpired;

    private String integratedBatteryExpired;

    private String batteryFail;

    private BatteryPackICCFailure batterySystemFail;

    private String discreteLineFail;

    private String driveFail;

    private String chFail;

    private String esmFail;

    private String fanFail;

    private String vpdI2cFailure;

    private String iccCruFail;

    private String miniHubFail;

    private String volFailDuringModifyMultiRaid;

    private String volFailDuringModify;

    private String powerSupplyFail;

    private String supportCruFail;

    private String transceiverModuleFailed;

    private String volFail;

    private String volFailAwaitingInit;

    private String volFailInterruptedWrite;

    private String volFailMultiRaid;

    private String fanStatUnknown;

    private PvgRecoveryData foreignDriveHasInconsistentRole;

    private String foreignDriveInconsistent;

    private String foreignDriveRefersToNativeDrive;

    private String ghostVolume;

    private FeatureState goldkeyFeature;

    private String failedHostBoard;

    private String hostBoardIdMismatch;

    private String hostBoardStatUnknown;

    private String missingHotSpareDriveRef;

    private String iccCruStatUnknown;

    private String iccMissing;

    private String volImpaired;

    private String driveFailImpendingHigh;

    private String driveFailImpendingLow;

    private String driveFailImpendingMed;

    private PvgRecoveryData incompatibleFailedLegacyDrive;

    private LockdownCtrlFwVersion ldFwVersionMismatch;

    private String legacyVgNotOptimal;

    private LinkSpeedDetectionError linkSpeedDetectionError;

    private String linkSpeedMismatch;

    private DriveLostRedundancyFailure driveRedundancyFailure;

    private EsmLostRedundancyFailure esmRedundancyFailure;

    private TrayLostRedundancyFailure trayRedundancyFailure;

    private String maxTempWarn;

    private String memParityError;

    private MetadataOffline metadataOffline;

    private String minihubRef;

    private DualMirrorPrimary dualMirrorPrimary;

    private DualMirrorSecondary dualMirrorSecondary;

    private MirrorUnsynchronized mirrorUnsynchronized;

    private FeatureState mixeddrivetypesFeature;

    private PvgRecoveryData nativeVgForeignDriveMutualRef;

    private PvgRecoveryData nativeVgRefersToForeignDrive;

    private String networkSetupError;

    private String nominalTempWarn;

    private String nonFruBatteryWarn;

    private String nonFruBatteryFail;

    private String nonFruBatteryRemoved;

    private NotOnPreferredPath nonPreferredPath;

    private String offlineCtl;

    private String volGroupOffline;

    private FeatureState spmFeature;

    private String passiveCtl;

    private PathDegradedFailure pathDegradedFailure;

    private FeatureState performanceTierFeature;

    private String powerSupplyStatUnknown;

    private String procMemTooSmallForCache;

    private FeatureState raid6Feature;

    private String incorrectSupportCru;

    private RemoteVolNoArray remoteVolNoArray;

    private RemoteVolNoFabric remoteVolNoFabric;

    private RemoteVolNoLUN remoteVolNoLUN;

    private RemoteVolWWNChangeFailed remoteVolWWNChangeFailed;

    private String alarmRemoved;

    private String batteryRemoved;

    private String batteryPackRemoved;

    private String esmRemoved;

    private String fanRemoved;

    private String iccCruRemoved;

    private String powerSupplyRemoved;

    private String supportCruRemoved;

    private String tempSensorRemoved;

    private String replacedDriveWrongType;

    private FullRepository repositoryFull;

    private String repositoryOverThreshold;

    private String rpaParityError;

    private FeatureState rvmFeature;

    private SasPort degradedSasPort;

    private SasPort failedSasPort;

    private SasPort miswiredSasPort;

    private SnapshotFailure snapFail;

    private FeatureState snapshotFeature;

    private SpeedNegError speedNegError;

    private String submodelMismatch;

    private String submodelNotSet;

    private String submodelNotSupported;

    private String supportCruNoInput;

    private String supportCruStatUnknown;

    private String tempSensorStatUnknown;

    private String transceiverModuleStatUnknown;

    private TrayRefList trayIDConflicts;

    private String trayIDMismatch;

    private String driveUncertified;

    private String esmUncertified;

    private String cacheMemorySizeUnsupported;

    private String unsupportedHostBoard;

    private String miniHubUnsupported;

    private String unsupportedTray;

    private String upsOnBattery;

    private UsmError usmDbFullError;

    private UsmError usmExistError;

    private String vgCloned;

    private PvgRecoveryData vgDrivePartOfMultipleVgs;

    private PvgRecoveryData vgHasDrivePartOfMultipleVgs;

    private String failedVolumeCopy;

    private FeatureState volcopyFeature;

    private String incompleteVolumeGroupRef;

    private String missingVolumeGroupRef;

    private String partialPresentVolumeGroupRef;

    private String volHotSpareInUse;

    private String hostRef;

    private SecurityKeyNeeded securityKeyNeeded;

    private FeatureState fdeFeature;

    private String removedCtrl;

    private String driveUnsuccessIsolationRedunMismatch;

    private String driveThresExcdedMismatchCorrected;

    private String inactiveHostPort;

    private String inactiveInitiator;

    private FeatureState protectionInformationFeature;

    private String protectionInformationNotSupported;

    private String driveCapacityInsufficient;

    private String openDrawerRef;

    private String failedDrawerRef;

    private String driveRef;

    private FeatureState solidStateDisksFeature;

    private FibreTrunkMiswire fibreTrunkMiswire;

    private String fibreTrunkIncompatibleEsm;

    private FeatureState driveSlotLimitFeature;

    private Integer newKeySequence;

    private FeatureState fdeProxyKeyMgmtFeature;

    private String sbbValidationFailure;

    private String powerSupplyInvalid;

    private String enclosureThermalShutdown;

    private String unsupportedProtocolConnection;

    private String twiBusFailed;

    private String mismatchedEepromContents;

    private String unsupportedCapacityDrive;

    private String evalExpirationImminent;

    private String keyInvalid;

    private String multipleMismatchedKeys;

    private String keyValidationLock;

    private ControllerVolumeList cacheDataLoss;

    private String featureOutOfCompliance;

    private String driveIncompatiblePItype;

    private String degradedDrawerRef;

    private String ctlrIocDiagFailed;

    private String invalidSataFlashConfig;

    private String offlineCtlrIocDiagFailed;

    private Integer chanSasPhyDisabledLocalWidePortDegraded;

    private Integer chanSasPhyDisabledSharedWidePortDegraded;

    private String drawerInvalid;

    private String drawerRemoved;

    private String driveUnsupportedInterposerFwVersion;

    private String volumeOfflineDuringReconfig;

    private String snapRollbackPaused;

    private String pitRollbackPaused;

    private String pitGroupOverWarnThreshold;

    private String pitViewOverWarnThreshold;

    private String pitGroupRepositoryFull;

    private String pitViewRepositoryFull;

    private String pitGroupFailed;

    private String pitViewFailed;

    private String pitPurged;

    private AsyncMirrorGroupFaultIndication degradedAsyncMirrorGroup;

    private AsyncMirrorGroupFaultIndication syncIntervalTimeExceeded;

    private String failedAsyncMirror;

    private AsyncMirrorGroupMemberFaultIndication asyncMirrorRepositoryOverWarnThreshold;

    private String roleConflictMirrorGroup;

    private String recoveryPointLostGroup;

    private String incompatibleVolumeGroupSecurity;

    private String orphanMirrorGroup;

    private String orphanMirrorMember;

    private String diskPoolStatePartial;

    private String diskPoolStateIncomplete;

    private String diskPoolStateMissing;

    private String diskPoolReconstruction;

    private String diskPoolUtilizationWarning;

    private String diskPoolUtilizationCritical;

    private String pitGroupPendingCreateFailed;

    private String cgPendingCreateFailed;

    private String thinVolumeOverThreshold;

    private String thinVolumeRepositoryFull;

    private String thinVolumeFailed;

    private String fullSecondaryRepositoryMirrorMember;

    private String suspendedMirrorGroup;

    private DatabaseMetadata databaseMetadata;

    private AsyncMirrorGroupMemberFaultIndication fullPrimaryRepositoryMirrorMember;

    private String sataSCTCmndUnsupported;

    private String diskPoolCapacityDepleted;

    private String driveModelNumberUnsupported;

    private FlashCacheRecoveryData flashCacheNonOptimalDrives;

    private FlashCacheRecoveryData flashCacheHotSpareInUse;

    private String nativeSATAIncompatibleNVSRAM;

    private String diskPoolDriveFailure;

    private String diskPoolInsufficientMemory;

    private String orphanIncompleteMember;

    private String pausedAltStateMirrorGroup;

    private String pausedRoleChangeGroup;

    private String driveEmulationIncompatibleAlignment;

    private ExternalRedundancyFailure redundancyFail;

    private String mirrorProxyRef;

    private SasPort miswiredSasHost;

    private SasPort miswiredSasCross;

    private SasPort miswiredSasLoop;

    private String volGroupWaitingOnHotSpare;

    private List<TraySlot> missingAssignedDrives;

    private String diskPoolWaitingOnHotSpare;

    private String controllerInServiceMode;

    private String controllerInLockdown;

    private SasPort discoveryErrorSasPort;

    private ControllerNtpErrorDetails ntpResolutionFailure;

    private ControllerNtpErrorDetails ntpQueryFailure;

    private String ntpServiceFailureController;

    private String misconfiguredHost;

    private HostRedundancyLossDetails hostRedundancyLossDetails;

    private ExcessiveRebootsDetected excessiveRebootsDetected;

    private ControllerWithDirtyCacheDetails ctlrWithDirtyCacheNotFlushed;

  
  /**
   * This enumeration defines the different recovery failure types that may be reported by a controller as part of the getRecoveryFailureList procedure.
   **/
  public FailureTypeEntry recFailureType(RecFailureTypeEnum recFailureType) {
    this.recFailureType = recFailureType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This enumeration defines the different recovery failure types that may be reported by a controller as part of the getRecoveryFailureList procedure.")
  @JsonProperty("recFailureType")
  public RecFailureTypeEnum getRecFailureType() {
    return recFailureType;
  }
  
  public void setRecFailureType(RecFailureTypeEnum recFailureType) {
    this.recFailureType = recFailureType;
  }

  
  /**
   * Identifies a controller that is unable to read the board ID of its alternate. The referenced controller is not necessarily the source of the problem.
   **/
  public FailureTypeEntry altCtlrBoardIdUnreadable(String altCtlrBoardIdUnreadable) {
    this.altCtlrBoardIdUnreadable = altCtlrBoardIdUnreadable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifies a controller that is unable to read the board ID of its alternate. The referenced controller is not necessarily the source of the problem.")
  @JsonProperty("altCtlrBoardIdUnreadable")
  public String getAltCtlrBoardIdUnreadable() {
    return altCtlrBoardIdUnreadable;
  }
  
  public void setAltCtlrBoardIdUnreadable(String altCtlrBoardIdUnreadable) {
    this.altCtlrBoardIdUnreadable = altCtlrBoardIdUnreadable;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_BASE_CONTROLLER_DIAG_FAILED. It contains the identification of the controller that failed diagnostic testing.
   **/
  public FailureTypeEntry baseControllerDiagFailed(String baseControllerDiagFailed) {
    this.baseControllerDiagFailed = baseControllerDiagFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_BASE_CONTROLLER_DIAG_FAILED. It contains the identification of the controller that failed diagnostic testing.")
  @JsonProperty("baseControllerDiagFailed")
  public String getBaseControllerDiagFailed() {
    return baseControllerDiagFailed;
  }
  
  public void setBaseControllerDiagFailed(String baseControllerDiagFailed) {
    this.baseControllerDiagFailed = baseControllerDiagFailed;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_BATTERY_CONFIG_MISMATCH
   **/
  public FailureTypeEntry batteryConfigMismatch(String batteryConfigMismatch) {
    this.batteryConfigMismatch = batteryConfigMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_BATTERY_CONFIG_MISMATCH")
  @JsonProperty("batteryConfigMismatch")
  public String getBatteryConfigMismatch() {
    return batteryConfigMismatch;
  }
  
  public void setBatteryConfigMismatch(String batteryConfigMismatch) {
    this.batteryConfigMismatch = batteryConfigMismatch;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_BATTERY_NEAR_EXPIRATION. It contains the identification of the battery component that is nearing its age limit.
   **/
  public FailureTypeEntry batteryWarn(String batteryWarn) {
    this.batteryWarn = batteryWarn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_BATTERY_NEAR_EXPIRATION. It contains the identification of the battery component that is nearing its age limit.")
  @JsonProperty("batteryWarn")
  public String getBatteryWarn() {
    return batteryWarn;
  }
  
  public void setBatteryWarn(String batteryWarn) {
    this.batteryWarn = batteryWarn;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_BATTERY_OVERTEMP. It is a reference to a battery component that is experiencing the over-temp condition.
   **/
  public FailureTypeEntry batteryTempWarn(String batteryTempWarn) {
    this.batteryTempWarn = batteryTempWarn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_BATTERY_OVERTEMP. It is a reference to a battery component that is experiencing the over-temp condition.")
  @JsonProperty("batteryTempWarn")
  public String getBatteryTempWarn() {
    return batteryTempWarn;
  }
  
  public void setBatteryTempWarn(String batteryTempWarn) {
    this.batteryTempWarn = batteryTempWarn;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_BATTERY_UNKNOWN_STAT.
   **/
  public FailureTypeEntry batteryStatUnknown(String batteryStatUnknown) {
    this.batteryStatUnknown = batteryStatUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_BATTERY_UNKNOWN_STAT.")
  @JsonProperty("batteryStatUnknown")
  public String getBatteryStatUnknown() {
    return batteryStatUnknown;
  }
  
  public void setBatteryStatUnknown(String batteryStatUnknown) {
    this.batteryStatUnknown = batteryStatUnknown;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_BATTERY_WARN. It is a reference to a battery component that has insufficient capacity to hold up the cache.
   **/
  public FailureTypeEntry batteryCapacityWarn(String batteryCapacityWarn) {
    this.batteryCapacityWarn = batteryCapacityWarn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_BATTERY_WARN. It is a reference to a battery component that has insufficient capacity to hold up the cache.")
  @JsonProperty("batteryCapacityWarn")
  public String getBatteryCapacityWarn() {
    return batteryCapacityWarn;
  }
  
  public void setBatteryCapacityWarn(String batteryCapacityWarn) {
    this.batteryCapacityWarn = batteryCapacityWarn;
  }

  
  /**
   * This field is present if the recFailuretype is equal to REC_CACHE_BACKUP_DEVICE_FAILED. It identifies a cache backup device that has failed.
   **/
  public FailureTypeEntry failedCacheBackupDevice(String failedCacheBackupDevice) {
    this.failedCacheBackupDevice = failedCacheBackupDevice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the recFailuretype is equal to REC_CACHE_BACKUP_DEVICE_FAILED. It identifies a cache backup device that has failed.")
  @JsonProperty("failedCacheBackupDevice")
  public String getFailedCacheBackupDevice() {
    return failedCacheBackupDevice;
  }
  
  public void setFailedCacheBackupDevice(String failedCacheBackupDevice) {
    this.failedCacheBackupDevice = failedCacheBackupDevice;
  }

  
  /**
   * This field is present if the recFailuretype is equal to REC_CACHE_BACKUP_DEVICE_INSUFFICIENT_CAPACITY. It identifies a controller whose cache backup device configuration is such that it does not have sufficient space for a full cache backup.
   **/
  public FailureTypeEntry insufficientCacheBackupDeviceCapacity(String insufficientCacheBackupDeviceCapacity) {
    this.insufficientCacheBackupDeviceCapacity = insufficientCacheBackupDeviceCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the recFailuretype is equal to REC_CACHE_BACKUP_DEVICE_INSUFFICIENT_CAPACITY. It identifies a controller whose cache backup device configuration is such that it does not have sufficient space for a full cache backup.")
  @JsonProperty("insufficientCacheBackupDeviceCapacity")
  public String getInsufficientCacheBackupDeviceCapacity() {
    return insufficientCacheBackupDeviceCapacity;
  }
  
  public void setInsufficientCacheBackupDeviceCapacity(String insufficientCacheBackupDeviceCapacity) {
    this.insufficientCacheBackupDeviceCapacity = insufficientCacheBackupDeviceCapacity;
  }

  
  /**
   * This field is present if the recFailuretype is equal to REC_CACHE_BACKUP_DEVICE_WRITE_PROTECTED. It identifies a cache backup device that is write-protected.
   **/
  public FailureTypeEntry writeProtectedCacheBackupDevice(String writeProtectedCacheBackupDevice) {
    this.writeProtectedCacheBackupDevice = writeProtectedCacheBackupDevice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the recFailuretype is equal to REC_CACHE_BACKUP_DEVICE_WRITE_PROTECTED. It identifies a cache backup device that is write-protected.")
  @JsonProperty("writeProtectedCacheBackupDevice")
  public String getWriteProtectedCacheBackupDevice() {
    return writeProtectedCacheBackupDevice;
  }
  
  public void setWriteProtectedCacheBackupDevice(String writeProtectedCacheBackupDevice) {
    this.writeProtectedCacheBackupDevice = writeProtectedCacheBackupDevice;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_CHANNEL_DEGRADED. The channel is in a degraded state.
   **/
  public FailureTypeEntry channelDegradedFailure(ChannelDegradedFailure channelDegradedFailure) {
    this.channelDegradedFailure = channelDegradedFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_CHANNEL_DEGRADED. The channel is in a degraded state.")
  @JsonProperty("channelDegradedFailure")
  public ChannelDegradedFailure getChannelDegradedFailure() {
    return channelDegradedFailure;
  }
  
  public void setChannelDegradedFailure(ChannelDegradedFailure channelDegradedFailure) {
    this.channelDegradedFailure = channelDegradedFailure;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_CHANNEL_FAILED.
   **/
  public FailureTypeEntry channelFailedFailure(ChannelFailedFailure channelFailedFailure) {
    this.channelFailedFailure = channelFailedFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_CHANNEL_FAILED.")
  @JsonProperty("channelFailedFailure")
  public ChannelFailedFailure getChannelFailedFailure() {
    return channelFailedFailure;
  }
  
  public void setChannelFailedFailure(ChannelFailedFailure channelFailedFailure) {
    this.channelFailedFailure = channelFailedFailure;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_CHANNEL_MISWIRE. It identifies the controller having the channel miswire information.
   **/
  public FailureTypeEntry chanMiswire(String chanMiswire) {
    this.chanMiswire = chanMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_CHANNEL_MISWIRE. It identifies the controller having the channel miswire information.")
  @JsonProperty("chanMiswire")
  public String getChanMiswire() {
    return chanMiswire;
  }
  
  public void setChanMiswire(String chanMiswire) {
    this.chanMiswire = chanMiswire;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_CORRUPT_VPD_EEPROM. It indicates a controller tray in which corruption of one of the redundant Storage Bridge Bay (SBB) EEPROMs has been detected.
   **/
  public FailureTypeEntry vpdEepromCorrupted(String vpdEepromCorrupted) {
    this.vpdEepromCorrupted = vpdEepromCorrupted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_CORRUPT_VPD_EEPROM. It indicates a controller tray in which corruption of one of the redundant Storage Bridge Bay (SBB) EEPROMs has been detected.")
  @JsonProperty("vpdEepromCorrupted")
  public String getVpdEepromCorrupted() {
    return vpdEepromCorrupted;
  }
  
  public void setVpdEepromCorrupted(String vpdEepromCorrupted) {
    this.vpdEepromCorrupted = vpdEepromCorrupted;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_CTL_MISMATCH.
   **/
  public FailureTypeEntry ctlMismatch(String ctlMismatch) {
    this.ctlMismatch = ctlMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_CTL_MISMATCH.")
  @JsonProperty("ctlMismatch")
  public String getCtlMismatch() {
    return ctlMismatch;
  }
  
  public void setCtlMismatch(String ctlMismatch) {
    this.ctlMismatch = ctlMismatch;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_CTL_MISWIRE.
   **/
  public FailureTypeEntry ctlMiswire(ControllerMiswireError ctlMiswire) {
    this.ctlMiswire = ctlMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_CTL_MISWIRE.")
  @JsonProperty("ctlMiswire")
  public ControllerMiswireError getCtlMiswire() {
    return ctlMiswire;
  }
  
  public void setCtlMiswire(ControllerMiswireError ctlMiswire) {
    this.ctlMiswire = ctlMiswire;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_DDF_DRIVE_OTHER_VENDOR. It identifies a drive that has a SNIA Disk Data Format (DDF) anchor indicating a vendor other than LSI-Engenio.
   **/
  public FailureTypeEntry ddfDriveOtherVendor(String ddfDriveOtherVendor) {
    this.ddfDriveOtherVendor = ddfDriveOtherVendor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_DDF_DRIVE_OTHER_VENDOR. It identifies a drive that has a SNIA Disk Data Format (DDF) anchor indicating a vendor other than LSI-Engenio.")
  @JsonProperty("ddfDriveOtherVendor")
  public String getDdfDriveOtherVendor() {
    return ddfDriveOtherVendor;
  }
  
  public void setDdfDriveOtherVendor(String ddfDriveOtherVendor) {
    this.ddfDriveOtherVendor = ddfDriveOtherVendor;
  }

  
  /**
   * This field is present if the value of recFailureType is equal to REC_DEDICATED_MIRROR_CHANNEL_FAILED. It identifies a degraded controller that is the root cause of the channel failure(s). If the channel failure root cause cannot be tied to a controller, the reference is null.
   **/
  public FailureTypeEntry failedDedicatedMirrorChannel(String failedDedicatedMirrorChannel) {
    this.failedDedicatedMirrorChannel = failedDedicatedMirrorChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the value of recFailureType is equal to REC_DEDICATED_MIRROR_CHANNEL_FAILED. It identifies a degraded controller that is the root cause of the channel failure(s). If the channel failure root cause cannot be tied to a controller, the reference is null.")
  @JsonProperty("failedDedicatedMirrorChannel")
  public String getFailedDedicatedMirrorChannel() {
    return failedDedicatedMirrorChannel;
  }
  
  public void setFailedDedicatedMirrorChannel(String failedDedicatedMirrorChannel) {
    this.failedDedicatedMirrorChannel = failedDedicatedMirrorChannel;
  }

  
  /**
   * This field is present only if the recFailureType is equal to REC_DEGRADED_HOST_IO_CARD. It identifies s host board, for which some, but not all, of its I/O ports are operational.
   **/
  public FailureTypeEntry degradedHostBoard(String degradedHostBoard) {
    this.degradedHostBoard = degradedHostBoard;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the recFailureType is equal to REC_DEGRADED_HOST_IO_CARD. It identifies s host board, for which some, but not all, of its I/O ports are operational.")
  @JsonProperty("degradedHostBoard")
  public String getDegradedHostBoard() {
    return degradedHostBoard;
  }
  
  public void setDegradedHostBoard(String degradedHostBoard) {
    this.degradedHostBoard = degradedHostBoard;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DEGRADED_VOLUME. It contains the identification of a volume group that has transitioned to the degraded state due to a drive failure.
   **/
  public FailureTypeEntry volDegraded(String volDegraded) {
    this.volDegraded = volDegraded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DEGRADED_VOLUME. It contains the identification of a volume group that has transitioned to the degraded state due to a drive failure.")
  @JsonProperty("volDegraded")
  public String getVolDegraded() {
    return volDegraded;
  }
  
  public void setVolDegraded(String volDegraded) {
    this.volDegraded = volDegraded;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DRIVE_BYPASSED_CAUSE_UNKNOWN. It contains the identification of the drive that was bypassed.
   **/
  public FailureTypeEntry drvBypassCauseUnknown(String drvBypassCauseUnknown) {
    this.drvBypassCauseUnknown = drvBypassCauseUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DRIVE_BYPASSED_CAUSE_UNKNOWN. It contains the identification of the drive that was bypassed.")
  @JsonProperty("drvBypassCauseUnknown")
  public String getDrvBypassCauseUnknown() {
    return drvBypassCauseUnknown;
  }
  
  public void setDrvBypassCauseUnknown(String drvBypassCauseUnknown) {
    this.drvBypassCauseUnknown = drvBypassCauseUnknown;
  }

  
  /**
   * This field is present only if the value of the recFailureType is equal to REC_DRIVE_BYPASSED_SINGLE_PORT. It is a reference to a drive that is bypassed on just one of its ports.
   **/
  public FailureTypeEntry driveBypassedSinglePort(String driveBypassedSinglePort) {
    this.driveBypassedSinglePort = driveBypassedSinglePort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of the recFailureType is equal to REC_DRIVE_BYPASSED_SINGLE_PORT. It is a reference to a drive that is bypassed on just one of its ports.")
  @JsonProperty("driveBypassedSinglePort")
  public String getDriveBypassedSinglePort() {
    return driveBypassedSinglePort;
  }
  
  public void setDriveBypassedSinglePort(String driveBypassedSinglePort) {
    this.driveBypassedSinglePort = driveBypassedSinglePort;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DRIVE_BYPASSED_SPEED_MISMATCH. It contains the identification of the drive that was bypassed.
   **/
  public FailureTypeEntry speedMismatchDrive(String speedMismatchDrive) {
    this.speedMismatchDrive = speedMismatchDrive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DRIVE_BYPASSED_SPEED_MISMATCH. It contains the identification of the drive that was bypassed.")
  @JsonProperty("speedMismatchDrive")
  public String getSpeedMismatchDrive() {
    return speedMismatchDrive;
  }
  
  public void setSpeedMismatchDrive(String speedMismatchDrive) {
    this.speedMismatchDrive = speedMismatchDrive;
  }

  
  /**
   * This field is only present if the value of recFailureType is equal to REC_DRIVE_INCOMPATIBLE_DOWNREV_DACSTORE. It is a reference to a drive that has an unrecognizable DACStore that was written by an earlier firmware version.
   **/
  public FailureTypeEntry incompatibleDownRevDacstoreDriveRef(String incompatibleDownRevDacstoreDriveRef) {
    this.incompatibleDownRevDacstoreDriveRef = incompatibleDownRevDacstoreDriveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the value of recFailureType is equal to REC_DRIVE_INCOMPATIBLE_DOWNREV_DACSTORE. It is a reference to a drive that has an unrecognizable DACStore that was written by an earlier firmware version.")
  @JsonProperty("incompatibleDownRevDacstoreDriveRef")
  public String getIncompatibleDownRevDacstoreDriveRef() {
    return incompatibleDownRevDacstoreDriveRef;
  }
  
  public void setIncompatibleDownRevDacstoreDriveRef(String incompatibleDownRevDacstoreDriveRef) {
    this.incompatibleDownRevDacstoreDriveRef = incompatibleDownRevDacstoreDriveRef;
  }

  
  /**
   * This field is only present if the value of recFailureType is equal to REC_MIXED_DRIVE_ENCLOSURE_MISWIRE. It identifies the drive channels with an unsupported combination of drive enclosures.
   **/
  public FailureTypeEntry mixedDriveEnclosureMiswire(List<MiswiredDriveChannelList> mixedDriveEnclosureMiswire) {
    this.mixedDriveEnclosureMiswire = mixedDriveEnclosureMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the value of recFailureType is equal to REC_MIXED_DRIVE_ENCLOSURE_MISWIRE. It identifies the drive channels with an unsupported combination of drive enclosures.")
  @JsonProperty("mixedDriveEnclosureMiswire")
  public List<MiswiredDriveChannelList> getMixedDriveEnclosureMiswire() {
    return mixedDriveEnclosureMiswire;
  }
  
  public void setMixedDriveEnclosureMiswire(List<MiswiredDriveChannelList> mixedDriveEnclosureMiswire) {
    this.mixedDriveEnclosureMiswire = mixedDriveEnclosureMiswire;
  }

  
  /**
   * This field is only present if the value of recFailureType is equal to REC_DRIVE_INCOMPATIBLE_SECTOR_SIZE. It is a reference to a drive that has a formatted sector size that is different from the other drives in the array.
   **/
  public FailureTypeEntry incompatibleSectorSizeDriveRef(String incompatibleSectorSizeDriveRef) {
    this.incompatibleSectorSizeDriveRef = incompatibleSectorSizeDriveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the value of recFailureType is equal to REC_DRIVE_INCOMPATIBLE_SECTOR_SIZE. It is a reference to a drive that has a formatted sector size that is different from the other drives in the array.")
  @JsonProperty("incompatibleSectorSizeDriveRef")
  public String getIncompatibleSectorSizeDriveRef() {
    return incompatibleSectorSizeDriveRef;
  }
  
  public void setIncompatibleSectorSizeDriveRef(String incompatibleSectorSizeDriveRef) {
    this.incompatibleSectorSizeDriveRef = incompatibleSectorSizeDriveRef;
  }

  
  /**
   * This field is only present if the value of recFailureType is equal to REC_DRIVE_INCOMPATIBLE_UPREV_DACSTORE. It is a reference to a drive that has an unrecognizable DACStore that was written by a later firmware version.
   **/
  public FailureTypeEntry incompatibleUpRevDacstoreDriveRef(String incompatibleUpRevDacstoreDriveRef) {
    this.incompatibleUpRevDacstoreDriveRef = incompatibleUpRevDacstoreDriveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the value of recFailureType is equal to REC_DRIVE_INCOMPATIBLE_UPREV_DACSTORE. It is a reference to a drive that has an unrecognizable DACStore that was written by a later firmware version.")
  @JsonProperty("incompatibleUpRevDacstoreDriveRef")
  public String getIncompatibleUpRevDacstoreDriveRef() {
    return incompatibleUpRevDacstoreDriveRef;
  }
  
  public void setIncompatibleUpRevDacstoreDriveRef(String incompatibleUpRevDacstoreDriveRef) {
    this.incompatibleUpRevDacstoreDriveRef = incompatibleUpRevDacstoreDriveRef;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DRIVE_TRAYS_NOT_COMPLIANT. It indicates that the drive tray feature is out of compliance.
   **/
  public FailureTypeEntry driveTrayExpansionFeature(FeatureState driveTrayExpansionFeature) {
    this.driveTrayExpansionFeature = driveTrayExpansionFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DRIVE_TRAYS_NOT_COMPLIANT. It indicates that the drive tray feature is out of compliance.")
  @JsonProperty("driveTrayExpansionFeature")
  public FeatureState getDriveTrayExpansionFeature() {
    return driveTrayExpansionFeature;
  }
  
  public void setDriveTrayExpansionFeature(FeatureState driveTrayExpansionFeature) {
    this.driveTrayExpansionFeature = driveTrayExpansionFeature;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_DRIVE_TRAYS_NOT_GROUPED_TOGETHER.
   **/
  public FailureTypeEntry driveTraysNotGroupedTogether(TrayRefList driveTraysNotGroupedTogether) {
    this.driveTraysNotGroupedTogether = driveTraysNotGroupedTogether;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_DRIVE_TRAYS_NOT_GROUPED_TOGETHER.")
  @JsonProperty("driveTraysNotGroupedTogether")
  public TrayRefList getDriveTraysNotGroupedTogether() {
    return driveTraysNotGroupedTogether;
  }
  
  public void setDriveTraysNotGroupedTogether(TrayRefList driveTraysNotGroupedTogether) {
    this.driveTraysNotGroupedTogether = driveTraysNotGroupedTogether;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ENCLOSURE_MISCONFIGURED. It indicates an enclosure has invalid configuration settings.
   **/
  public FailureTypeEntry misconfiguredEnclosure(String misconfiguredEnclosure) {
    this.misconfiguredEnclosure = misconfiguredEnclosure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ENCLOSURE_MISCONFIGURED. It indicates an enclosure has invalid configuration settings.")
  @JsonProperty("misconfiguredEnclosure")
  public String getMisconfiguredEnclosure() {
    return misconfiguredEnclosure;
  }
  
  public void setMisconfiguredEnclosure(String misconfiguredEnclosure) {
    this.misconfiguredEnclosure = misconfiguredEnclosure;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ESM_CODE_VERSION_MISMATCH. It contains the identification of the tray that has the ESM cards that have mismatching firmware versions.
   **/
  public FailureTypeEntry trayCodeMismatch(String trayCodeMismatch) {
    this.trayCodeMismatch = trayCodeMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ESM_CODE_VERSION_MISMATCH. It contains the identification of the tray that has the ESM cards that have mismatching firmware versions.")
  @JsonProperty("trayCodeMismatch")
  public String getTrayCodeMismatch() {
    return trayCodeMismatch;
  }
  
  public void setTrayCodeMismatch(String trayCodeMismatch) {
    this.trayCodeMismatch = trayCodeMismatch;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_ESM_FACTORY_DEFAULTS_MISMATCH. It is a reference to a tray in which the versions of the factory default settings reported by the two ESMs do not match.
   **/
  public FailureTypeEntry esmFactoryDefaultsMismatch(String esmFactoryDefaultsMismatch) {
    this.esmFactoryDefaultsMismatch = esmFactoryDefaultsMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_ESM_FACTORY_DEFAULTS_MISMATCH. It is a reference to a tray in which the versions of the factory default settings reported by the two ESMs do not match.")
  @JsonProperty("esmFactoryDefaultsMismatch")
  public String getEsmFactoryDefaultsMismatch() {
    return esmFactoryDefaultsMismatch;
  }
  
  public void setEsmFactoryDefaultsMismatch(String esmFactoryDefaultsMismatch) {
    this.esmFactoryDefaultsMismatch = esmFactoryDefaultsMismatch;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ESM_HARDWARE_MISMATCH. It contains the identification of the tray that has the mismatched ESM cards.
   **/
  public FailureTypeEntry trayHardwareMismatch(String trayHardwareMismatch) {
    this.trayHardwareMismatch = trayHardwareMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ESM_HARDWARE_MISMATCH. It contains the identification of the tray that has the mismatched ESM cards.")
  @JsonProperty("trayHardwareMismatch")
  public String getTrayHardwareMismatch() {
    return trayHardwareMismatch;
  }
  
  public void setTrayHardwareMismatch(String trayHardwareMismatch) {
    this.trayHardwareMismatch = trayHardwareMismatch;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ESM_MISWIRE. It contains the identification of the tray that has the ESM miswire.
   **/
  public FailureTypeEntry esmMiswire(String esmMiswire) {
    this.esmMiswire = esmMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ESM_MISWIRE. It contains the identification of the tray that has the ESM miswire.")
  @JsonProperty("esmMiswire")
  public String getEsmMiswire() {
    return esmMiswire;
  }
  
  public void setEsmMiswire(String esmMiswire) {
    this.esmMiswire = esmMiswire;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ESM_UNKNOWN_STAT. It contains the identification of the ESM that has failed with unknown status.
   **/
  public FailureTypeEntry esmStatUnknown(String esmStatUnknown) {
    this.esmStatUnknown = esmStatUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ESM_UNKNOWN_STAT. It contains the identification of the ESM that has failed with unknown status.")
  @JsonProperty("esmStatUnknown")
  public String getEsmStatUnknown() {
    return esmStatUnknown;
  }
  
  public void setEsmStatUnknown(String esmStatUnknown) {
    this.esmStatUnknown = esmStatUnknown;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_EXPIRED_BATTERY,. It contains the identification of the battery component that has expired.
   **/
  public FailureTypeEntry batteryExpired(String batteryExpired) {
    this.batteryExpired = batteryExpired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_EXPIRED_BATTERY,. It contains the identification of the battery component that has expired.")
  @JsonProperty("batteryExpired")
  public String getBatteryExpired() {
    return batteryExpired;
  }
  
  public void setBatteryExpired(String batteryExpired) {
    this.batteryExpired = batteryExpired;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_EXPIRED_INTEGRATED_BATTERY. It contains the identification of the integrated battery component that has expired.
   **/
  public FailureTypeEntry integratedBatteryExpired(String integratedBatteryExpired) {
    this.integratedBatteryExpired = integratedBatteryExpired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_EXPIRED_INTEGRATED_BATTERY. It contains the identification of the integrated battery component that has expired.")
  @JsonProperty("integratedBatteryExpired")
  public String getIntegratedBatteryExpired() {
    return integratedBatteryExpired;
  }
  
  public void setIntegratedBatteryExpired(String integratedBatteryExpired) {
    this.integratedBatteryExpired = integratedBatteryExpired;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_BATTERY. It contains the identification of the battery component that has failed.
   **/
  public FailureTypeEntry batteryFail(String batteryFail) {
    this.batteryFail = batteryFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_BATTERY. It contains the identification of the battery component that has failed.")
  @JsonProperty("batteryFail")
  public String getBatteryFail() {
    return batteryFail;
  }
  
  public void setBatteryFail(String batteryFail) {
    this.batteryFail = batteryFail;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_FAILED_BATTERY_SYSTEM.
   **/
  public FailureTypeEntry batterySystemFail(BatteryPackICCFailure batterySystemFail) {
    this.batterySystemFail = batterySystemFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_FAILED_BATTERY_SYSTEM.")
  @JsonProperty("batterySystemFail")
  public BatteryPackICCFailure getBatterySystemFail() {
    return batterySystemFail;
  }
  
  public void setBatterySystemFail(BatteryPackICCFailure batterySystemFail) {
    this.batterySystemFail = batterySystemFail;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_FAILED_DISCRETE_LINE.
   **/
  public FailureTypeEntry discreteLineFail(String discreteLineFail) {
    this.discreteLineFail = discreteLineFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_FAILED_DISCRETE_LINE.")
  @JsonProperty("discreteLineFail")
  public String getDiscreteLineFail() {
    return discreteLineFail;
  }
  
  public void setDiscreteLineFail(String discreteLineFail) {
    this.discreteLineFail = discreteLineFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_DRIVE. It contains the identification of a drive that has failed.
   **/
  public FailureTypeEntry driveFail(String driveFail) {
    this.driveFail = driveFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_DRIVE. It contains the identification of a drive that has failed.")
  @JsonProperty("driveFail")
  public String getDriveFail() {
    return driveFail;
  }
  
  public void setDriveFail(String driveFail) {
    this.driveFail = driveFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_DRIVE_SCSI_CHANNEL. It contains the identification of the controller that has experienced a failed drive-side I/O channel.
   **/
  public FailureTypeEntry chFail(String chFail) {
    this.chFail = chFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_DRIVE_SCSI_CHANNEL. It contains the identification of the controller that has experienced a failed drive-side I/O channel.")
  @JsonProperty("chFail")
  public String getChFail() {
    return chFail;
  }
  
  public void setChFail(String chFail) {
    this.chFail = chFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_ESM. It contains the identification of the ESM component that has failed.
   **/
  public FailureTypeEntry esmFail(String esmFail) {
    this.esmFail = esmFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_ESM. It contains the identification of the ESM component that has failed.")
  @JsonProperty("esmFail")
  public String getEsmFail() {
    return esmFail;
  }
  
  public void setEsmFail(String esmFail) {
    this.esmFail = esmFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_FAN. It contains the identification of the fan component that has failed.
   **/
  public FailureTypeEntry fanFail(String fanFail) {
    this.fanFail = fanFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_FAN. It contains the identification of the fan component that has failed.")
  @JsonProperty("fanFail")
  public String getFanFail() {
    return fanFail;
  }
  
  public void setFanFail(String fanFail) {
    this.fanFail = fanFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_I2C_BUS. It refers to a controller that has detected a failure of one of the I2C busses used to access the Storage Bridge Bay (SBB) vital product data stored in EEPROM. For a given I2C bus failure, the failure type list may contain an entry for one or both controllers.
   **/
  public FailureTypeEntry vpdI2cFailure(String vpdI2cFailure) {
    this.vpdI2cFailure = vpdI2cFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_I2C_BUS. It refers to a controller that has detected a failure of one of the I2C busses used to access the Storage Bridge Bay (SBB) vital product data stored in EEPROM. For a given I2C bus failure, the failure type list may contain an entry for one or both controllers.")
  @JsonProperty("vpdI2cFailure")
  public String getVpdI2cFailure() {
    return vpdI2cFailure;
  }
  
  public void setVpdI2cFailure(String vpdI2cFailure) {
    this.vpdI2cFailure = vpdI2cFailure;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_FAILED_ICC_CRU.
   **/
  public FailureTypeEntry iccCruFail(String iccCruFail) {
    this.iccCruFail = iccCruFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_FAILED_ICC_CRU.")
  @JsonProperty("iccCruFail")
  public String getIccCruFail() {
    return iccCruFail;
  }
  
  public void setIccCruFail(String iccCruFail) {
    this.iccCruFail = iccCruFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_MINIHUB. It contains the identification of the minihub component that has failed.
   **/
  public FailureTypeEntry miniHubFail(String miniHubFail) {
    this.miniHubFail = miniHubFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_MINIHUB. It contains the identification of the minihub component that has failed.")
  @JsonProperty("miniHubFail")
  public String getMiniHubFail() {
    return miniHubFail;
  }
  
  public void setMiniHubFail(String miniHubFail) {
    this.miniHubFail = miniHubFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_MODIFYING_MULTI_RAID. It contains the identification of a volume group that has experienced a failure during a modification operation (i.e. dynamic capacity expansion, RAID migration, segment resizing, initialization, etc.). This failure indication applies specifically to volume groups containing volumes of different RAID levels. It is not supported in the current release of the firmware.
   **/
  public FailureTypeEntry volFailDuringModifyMultiRaid(String volFailDuringModifyMultiRaid) {
    this.volFailDuringModifyMultiRaid = volFailDuringModifyMultiRaid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_MODIFYING_MULTI_RAID. It contains the identification of a volume group that has experienced a failure during a modification operation (i.e. dynamic capacity expansion, RAID migration, segment resizing, initialization, etc.). This failure indication applies specifically to volume groups containing volumes of different RAID levels. It is not supported in the current release of the firmware.")
  @JsonProperty("volFailDuringModifyMultiRaid")
  public String getVolFailDuringModifyMultiRaid() {
    return volFailDuringModifyMultiRaid;
  }
  
  public void setVolFailDuringModifyMultiRaid(String volFailDuringModifyMultiRaid) {
    this.volFailDuringModifyMultiRaid = volFailDuringModifyMultiRaid;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_MODIFYING_VOLUME. It contains the identification of a volume group that has experienced a failure during a modification operation (i.e. dynamic capacity expansion, RAID migration, segment resizing, initialization, etc.).
   **/
  public FailureTypeEntry volFailDuringModify(String volFailDuringModify) {
    this.volFailDuringModify = volFailDuringModify;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_MODIFYING_VOLUME. It contains the identification of a volume group that has experienced a failure during a modification operation (i.e. dynamic capacity expansion, RAID migration, segment resizing, initialization, etc.).")
  @JsonProperty("volFailDuringModify")
  public String getVolFailDuringModify() {
    return volFailDuringModify;
  }
  
  public void setVolFailDuringModify(String volFailDuringModify) {
    this.volFailDuringModify = volFailDuringModify;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_POWER_SUPPLY. It contains the identification of the power supply component that has failed.
   **/
  public FailureTypeEntry powerSupplyFail(String powerSupplyFail) {
    this.powerSupplyFail = powerSupplyFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_POWER_SUPPLY. It contains the identification of the power supply component that has failed.")
  @JsonProperty("powerSupplyFail")
  public String getPowerSupplyFail() {
    return powerSupplyFail;
  }
  
  public void setPowerSupplyFail(String powerSupplyFail) {
    this.powerSupplyFail = powerSupplyFail;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_FAILED_SUPPORT_CRU.
   **/
  public FailureTypeEntry supportCruFail(String supportCruFail) {
    this.supportCruFail = supportCruFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_FAILED_SUPPORT_CRU.")
  @JsonProperty("supportCruFail")
  public String getSupportCruFail() {
    return supportCruFail;
  }
  
  public void setSupportCruFail(String supportCruFail) {
    this.supportCruFail = supportCruFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_TRANSCEIVER_MODULE. It contains the identification of the transceiver module.
   **/
  public FailureTypeEntry transceiverModuleFailed(String transceiverModuleFailed) {
    this.transceiverModuleFailed = transceiverModuleFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_TRANSCEIVER_MODULE. It contains the identification of the transceiver module.")
  @JsonProperty("transceiverModuleFailed")
  public String getTransceiverModuleFailed() {
    return transceiverModuleFailed;
  }
  
  public void setTransceiverModuleFailed(String transceiverModuleFailed) {
    this.transceiverModuleFailed = transceiverModuleFailed;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_VOLUME_INTERRUPTED_WRITE. It contains the identification of a volume group that has experienced an interrupted write failure.
   **/
  public FailureTypeEntry volFail(String volFail) {
    this.volFail = volFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_VOLUME_INTERRUPTED_WRITE. It contains the identification of a volume group that has experienced an interrupted write failure.")
  @JsonProperty("volFail")
  public String getVolFail() {
    return volFail;
  }
  
  public void setVolFail(String volFail) {
    this.volFail = volFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_VOLUME_AWAITING_INIT. It contains the identification of a volume group that was failed due to excessive drive failures, but has since had all failed drives replaced. Since the volumes within the volume group are no longer usable, they must all be formatted/initialized to make them usable again.
   **/
  public FailureTypeEntry volFailAwaitingInit(String volFailAwaitingInit) {
    this.volFailAwaitingInit = volFailAwaitingInit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_VOLUME_AWAITING_INIT. It contains the identification of a volume group that was failed due to excessive drive failures, but has since had all failed drives replaced. Since the volumes within the volume group are no longer usable, they must all be formatted/initialized to make them usable again.")
  @JsonProperty("volFailAwaitingInit")
  public String getVolFailAwaitingInit() {
    return volFailAwaitingInit;
  }
  
  public void setVolFailAwaitingInit(String volFailAwaitingInit) {
    this.volFailAwaitingInit = volFailAwaitingInit;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_VOLUME_INTERRUPTED_WRITE. It contains the identification of a volume group that has experienced an interrupted write failure.
   **/
  public FailureTypeEntry volFailInterruptedWrite(String volFailInterruptedWrite) {
    this.volFailInterruptedWrite = volFailInterruptedWrite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_VOLUME_INTERRUPTED_WRITE. It contains the identification of a volume group that has experienced an interrupted write failure.")
  @JsonProperty("volFailInterruptedWrite")
  public String getVolFailInterruptedWrite() {
    return volFailInterruptedWrite;
  }
  
  public void setVolFailInterruptedWrite(String volFailInterruptedWrite) {
    this.volFailInterruptedWrite = volFailInterruptedWrite;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAILED_VOLUME_MULTI_RAID. It contains the identification of a volume group that has been marked failed due to an excessive number of drive failures. This failure indication applies specifically to volume groups containing volumes of different RAID levels. It is not supported in the current release of the firmware.
   **/
  public FailureTypeEntry volFailMultiRaid(String volFailMultiRaid) {
    this.volFailMultiRaid = volFailMultiRaid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAILED_VOLUME_MULTI_RAID. It contains the identification of a volume group that has been marked failed due to an excessive number of drive failures. This failure indication applies specifically to volume groups containing volumes of different RAID levels. It is not supported in the current release of the firmware.")
  @JsonProperty("volFailMultiRaid")
  public String getVolFailMultiRaid() {
    return volFailMultiRaid;
  }
  
  public void setVolFailMultiRaid(String volFailMultiRaid) {
    this.volFailMultiRaid = volFailMultiRaid;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_FAN_UNKNOWN_STAT. It contains the identification of the fan that has failed with unknown status.
   **/
  public FailureTypeEntry fanStatUnknown(String fanStatUnknown) {
    this.fanStatUnknown = fanStatUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_FAN_UNKNOWN_STAT. It contains the identification of the fan that has failed with unknown status.")
  @JsonProperty("fanStatUnknown")
  public String getFanStatUnknown() {
    return fanStatUnknown;
  }
  
  public void setFanStatUnknown(String fanStatUnknown) {
    this.fanStatUnknown = fanStatUnknown;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_FOREIGN_DRIVE_HAS_INCONSISTENT_ROLE. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the drive having the inconsistent role, and the volumeGroup field is a reference to the volume group referring to that drive.
   **/
  public FailureTypeEntry foreignDriveHasInconsistentRole(PvgRecoveryData foreignDriveHasInconsistentRole) {
    this.foreignDriveHasInconsistentRole = foreignDriveHasInconsistentRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_FOREIGN_DRIVE_HAS_INCONSISTENT_ROLE. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the drive having the inconsistent role, and the volumeGroup field is a reference to the volume group referring to that drive.")
  @JsonProperty("foreignDriveHasInconsistentRole")
  public PvgRecoveryData getForeignDriveHasInconsistentRole() {
    return foreignDriveHasInconsistentRole;
  }
  
  public void setForeignDriveHasInconsistentRole(PvgRecoveryData foreignDriveHasInconsistentRole) {
    this.foreignDriveHasInconsistentRole = foreignDriveHasInconsistentRole;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_FOREIGN_DRIVE_INCONSISTENT. It identifies the inconsistent foreign drive.
   **/
  public FailureTypeEntry foreignDriveInconsistent(String foreignDriveInconsistent) {
    this.foreignDriveInconsistent = foreignDriveInconsistent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_FOREIGN_DRIVE_INCONSISTENT. It identifies the inconsistent foreign drive.")
  @JsonProperty("foreignDriveInconsistent")
  public String getForeignDriveInconsistent() {
    return foreignDriveInconsistent;
  }
  
  public void setForeignDriveInconsistent(String foreignDriveInconsistent) {
    this.foreignDriveInconsistent = foreignDriveInconsistent;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_FOREIGN_DRIVE_REFERS_TO_NATIVE_DRIVE. It identifies the drive that caused the problem to be recognized (the first-inserted drive of what appears to be an incoming foreign volume group).
   **/
  public FailureTypeEntry foreignDriveRefersToNativeDrive(String foreignDriveRefersToNativeDrive) {
    this.foreignDriveRefersToNativeDrive = foreignDriveRefersToNativeDrive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_FOREIGN_DRIVE_REFERS_TO_NATIVE_DRIVE. It identifies the drive that caused the problem to be recognized (the first-inserted drive of what appears to be an incoming foreign volume group).")
  @JsonProperty("foreignDriveRefersToNativeDrive")
  public String getForeignDriveRefersToNativeDrive() {
    return foreignDriveRefersToNativeDrive;
  }
  
  public void setForeignDriveRefersToNativeDrive(String foreignDriveRefersToNativeDrive) {
    this.foreignDriveRefersToNativeDrive = foreignDriveRefersToNativeDrive;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_GHOST_VOLUME. It contains the identification of the missing volume.
   **/
  public FailureTypeEntry ghostVolume(String ghostVolume) {
    this.ghostVolume = ghostVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_GHOST_VOLUME. It contains the identification of the missing volume.")
  @JsonProperty("ghostVolume")
  public String getGhostVolume() {
    return ghostVolume;
  }
  
  public void setGhostVolume(String ghostVolume) {
    this.ghostVolume = ghostVolume;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_GOLD_KEY_NOT_COMPLIANT.
   **/
  public FailureTypeEntry goldkeyFeature(FeatureState goldkeyFeature) {
    this.goldkeyFeature = goldkeyFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_GOLD_KEY_NOT_COMPLIANT.")
  @JsonProperty("goldkeyFeature")
  public FeatureState getGoldkeyFeature() {
    return goldkeyFeature;
  }
  
  public void setGoldkeyFeature(FeatureState goldkeyFeature) {
    this.goldkeyFeature = goldkeyFeature;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_HOST_BOARD_FAULT (or the numerically-equivalent REC_FAILED_HOST_IO_CARD). It identifies the failed host board.
   **/
  public FailureTypeEntry failedHostBoard(String failedHostBoard) {
    this.failedHostBoard = failedHostBoard;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_HOST_BOARD_FAULT (or the numerically-equivalent REC_FAILED_HOST_IO_CARD). It identifies the failed host board.")
  @JsonProperty("failedHostBoard")
  public String getFailedHostBoard() {
    return failedHostBoard;
  }
  
  public void setFailedHostBoard(String failedHostBoard) {
    this.failedHostBoard = failedHostBoard;
  }

  
  /**
   * This field is present only if the recFailureType is equal to REC_HOST_BOARD_ID_MISMATCH. It identifies a host board on the other controller that has a mismatched identifier, and which caused the other controller to lock down.
   **/
  public FailureTypeEntry hostBoardIdMismatch(String hostBoardIdMismatch) {
    this.hostBoardIdMismatch = hostBoardIdMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the recFailureType is equal to REC_HOST_BOARD_ID_MISMATCH. It identifies a host board on the other controller that has a mismatched identifier, and which caused the other controller to lock down.")
  @JsonProperty("hostBoardIdMismatch")
  public String getHostBoardIdMismatch() {
    return hostBoardIdMismatch;
  }
  
  public void setHostBoardIdMismatch(String hostBoardIdMismatch) {
    this.hostBoardIdMismatch = hostBoardIdMismatch;
  }

  
  /**
   * This field is only present if the value of the recFailureType is equal to REC_HOST_BOARD_UNKNOWN_STAT. It is a reference to the host board for which the status is unknown.
   **/
  public FailureTypeEntry hostBoardStatUnknown(String hostBoardStatUnknown) {
    this.hostBoardStatUnknown = hostBoardStatUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the value of the recFailureType is equal to REC_HOST_BOARD_UNKNOWN_STAT. It is a reference to the host board for which the status is unknown.")
  @JsonProperty("hostBoardStatUnknown")
  public String getHostBoardStatUnknown() {
    return hostBoardStatUnknown;
  }
  
  public void setHostBoardStatUnknown(String hostBoardStatUnknown) {
    this.hostBoardStatUnknown = hostBoardStatUnknown;
  }

  
  /**
   * This field is only present if the value of recFailureType is equal to REC_HOTSPARE_DRIVE_MISSING. It is a reference to a standby hot spare drive that is missing from the configuration.
   **/
  public FailureTypeEntry missingHotSpareDriveRef(String missingHotSpareDriveRef) {
    this.missingHotSpareDriveRef = missingHotSpareDriveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the value of recFailureType is equal to REC_HOTSPARE_DRIVE_MISSING. It is a reference to a standby hot spare drive that is missing from the configuration.")
  @JsonProperty("missingHotSpareDriveRef")
  public String getMissingHotSpareDriveRef() {
    return missingHotSpareDriveRef;
  }
  
  public void setMissingHotSpareDriveRef(String missingHotSpareDriveRef) {
    this.missingHotSpareDriveRef = missingHotSpareDriveRef;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ICC_CRU_UNKNOWN_STAT. It contains the identification of the interconnect CRU that has unknown status.
   **/
  public FailureTypeEntry iccCruStatUnknown(String iccCruStatUnknown) {
    this.iccCruStatUnknown = iccCruStatUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ICC_CRU_UNKNOWN_STAT. It contains the identification of the interconnect CRU that has unknown status.")
  @JsonProperty("iccCruStatUnknown")
  public String getIccCruStatUnknown() {
    return iccCruStatUnknown;
  }
  
  public void setIccCruStatUnknown(String iccCruStatUnknown) {
    this.iccCruStatUnknown = iccCruStatUnknown;
  }

  
  /**
   * This field is present only if the recFailureType is equal to REC_ICC_MISSING. It identifies a controller enclosure having a missing interconnect cannister, which caused the other controller to lock down.
   **/
  public FailureTypeEntry iccMissing(String iccMissing) {
    this.iccMissing = iccMissing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the recFailureType is equal to REC_ICC_MISSING. It identifies a controller enclosure having a missing interconnect cannister, which caused the other controller to lock down.")
  @JsonProperty("iccMissing")
  public String getIccMissing() {
    return iccMissing;
  }
  
  public void setIccMissing(String iccMissing) {
    this.iccMissing = iccMissing;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_IMPAIRED_VOLUME. It contains the identification of a volume that has been marked impaired due to the detection of an internal consistency problem.
   **/
  public FailureTypeEntry volImpaired(String volImpaired) {
    this.volImpaired = volImpaired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_IMPAIRED_VOLUME. It contains the identification of a volume that has been marked impaired due to the detection of an internal consistency problem.")
  @JsonProperty("volImpaired")
  public String getVolImpaired() {
    return volImpaired;
  }
  
  public void setVolImpaired(String volImpaired) {
    this.volImpaired = volImpaired;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_IMPENDING_DRIVE_FAILURE_RISK_HIGH. It contains the identification of a volume group containing a drive for which the risk of impending failure is considered to be \"high\". Failure risk levels are determined by built-in drive algorithms for early failure detection.
   **/
  public FailureTypeEntry driveFailImpendingHigh(String driveFailImpendingHigh) {
    this.driveFailImpendingHigh = driveFailImpendingHigh;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_IMPENDING_DRIVE_FAILURE_RISK_HIGH. It contains the identification of a volume group containing a drive for which the risk of impending failure is considered to be \"high\". Failure risk levels are determined by built-in drive algorithms for early failure detection.")
  @JsonProperty("driveFailImpendingHigh")
  public String getDriveFailImpendingHigh() {
    return driveFailImpendingHigh;
  }
  
  public void setDriveFailImpendingHigh(String driveFailImpendingHigh) {
    this.driveFailImpendingHigh = driveFailImpendingHigh;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_IMPENDING_DRIVE_FAILURE_RISK_LOW. It contains the identification of a drive for which an impending failure condition has been detected. This failure type is only used for drives that are not assigned to any volume group.
   **/
  public FailureTypeEntry driveFailImpendingLow(String driveFailImpendingLow) {
    this.driveFailImpendingLow = driveFailImpendingLow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_IMPENDING_DRIVE_FAILURE_RISK_LOW. It contains the identification of a drive for which an impending failure condition has been detected. This failure type is only used for drives that are not assigned to any volume group.")
  @JsonProperty("driveFailImpendingLow")
  public String getDriveFailImpendingLow() {
    return driveFailImpendingLow;
  }
  
  public void setDriveFailImpendingLow(String driveFailImpendingLow) {
    this.driveFailImpendingLow = driveFailImpendingLow;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_IMPENDING_DRIVE_FAILURE_RISK_MED. It contains the identification of a volume group containing a drive for which the risk of impending failure is considered to be \"medium\".
   **/
  public FailureTypeEntry driveFailImpendingMed(String driveFailImpendingMed) {
    this.driveFailImpendingMed = driveFailImpendingMed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_IMPENDING_DRIVE_FAILURE_RISK_MED. It contains the identification of a volume group containing a drive for which the risk of impending failure is considered to be \"medium\".")
  @JsonProperty("driveFailImpendingMed")
  public String getDriveFailImpendingMed() {
    return driveFailImpendingMed;
  }
  
  public void setDriveFailImpendingMed(String driveFailImpendingMed) {
    this.driveFailImpendingMed = driveFailImpendingMed;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_INCOMPATIBLE_FAILED_LEGACY_DRIVE. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to a legacy failed or in-use hot spare drive; the volumeGroup field is a reference to the drive's parent volume group, or a null reference if the drive is unassigned. Also, it is safe to assume that the drives identified in the object graph as belonging to the volume group are valid.
   **/
  public FailureTypeEntry incompatibleFailedLegacyDrive(PvgRecoveryData incompatibleFailedLegacyDrive) {
    this.incompatibleFailedLegacyDrive = incompatibleFailedLegacyDrive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_INCOMPATIBLE_FAILED_LEGACY_DRIVE. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to a legacy failed or in-use hot spare drive; the volumeGroup field is a reference to the drive's parent volume group, or a null reference if the drive is unassigned. Also, it is safe to assume that the drives identified in the object graph as belonging to the volume group are valid.")
  @JsonProperty("incompatibleFailedLegacyDrive")
  public PvgRecoveryData getIncompatibleFailedLegacyDrive() {
    return incompatibleFailedLegacyDrive;
  }
  
  public void setIncompatibleFailedLegacyDrive(PvgRecoveryData incompatibleFailedLegacyDrive) {
    this.incompatibleFailedLegacyDrive = incompatibleFailedLegacyDrive;
  }

  
  /**
   * This field is present only if the recFailureType is equal to REC_LD_FW_VERSION_MISMATCH. It identifies the controller firmware version recorded on the drives (the native controller firmware version) when a newly inserted Simplex controller has been locked down due to a mismatch between it's reported controller firmware version and the native controller firmware version. Download the reported native controller firmware version to the locked down controller to recover from this failure.
   **/
  public FailureTypeEntry ldFwVersionMismatch(LockdownCtrlFwVersion ldFwVersionMismatch) {
    this.ldFwVersionMismatch = ldFwVersionMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the recFailureType is equal to REC_LD_FW_VERSION_MISMATCH. It identifies the controller firmware version recorded on the drives (the native controller firmware version) when a newly inserted Simplex controller has been locked down due to a mismatch between it's reported controller firmware version and the native controller firmware version. Download the reported native controller firmware version to the locked down controller to recover from this failure.")
  @JsonProperty("ldFwVersionMismatch")
  public LockdownCtrlFwVersion getLdFwVersionMismatch() {
    return ldFwVersionMismatch;
  }
  
  public void setLdFwVersionMismatch(LockdownCtrlFwVersion ldFwVersionMismatch) {
    this.ldFwVersionMismatch = ldFwVersionMismatch;
  }

  
  /**
   * This \"field\" is present if the recFailureType value has no associated reference. It means that, there is no data in the structure other than the failure type itself. This is true for the following recFailureType values:
   **/
  public FailureTypeEntry legacyVgNotOptimal(String legacyVgNotOptimal) {
    this.legacyVgNotOptimal = legacyVgNotOptimal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This \"field\" is present if the recFailureType value has no associated reference. It means that, there is no data in the structure other than the failure type itself. This is true for the following recFailureType values:")
  @JsonProperty("legacyVgNotOptimal")
  public String getLegacyVgNotOptimal() {
    return legacyVgNotOptimal;
  }
  
  public void setLegacyVgNotOptimal(String legacyVgNotOptimal) {
    this.legacyVgNotOptimal = legacyVgNotOptimal;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_LINK_SPEED_DETECTION_MISMATCH.
   **/
  public FailureTypeEntry linkSpeedDetectionError(LinkSpeedDetectionError linkSpeedDetectionError) {
    this.linkSpeedDetectionError = linkSpeedDetectionError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_LINK_SPEED_DETECTION_MISMATCH.")
  @JsonProperty("linkSpeedDetectionError")
  public LinkSpeedDetectionError getLinkSpeedDetectionError() {
    return linkSpeedDetectionError;
  }
  
  public void setLinkSpeedDetectionError(LinkSpeedDetectionError linkSpeedDetectionError) {
    this.linkSpeedDetectionError = linkSpeedDetectionError;
  }

  
  /**
   * This field is present only if the recFailureType is equal to REC_LINK_SPEED_MISMATCH. It identifies a controller that is locked down due to detection of a mismatch between an enclosure link speed setting and link speeds that the controller is able to support.
   **/
  public FailureTypeEntry linkSpeedMismatch(String linkSpeedMismatch) {
    this.linkSpeedMismatch = linkSpeedMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the recFailureType is equal to REC_LINK_SPEED_MISMATCH. It identifies a controller that is locked down due to detection of a mismatch between an enclosure link speed setting and link speeds that the controller is able to support.")
  @JsonProperty("linkSpeedMismatch")
  public String getLinkSpeedMismatch() {
    return linkSpeedMismatch;
  }
  
  public void setLinkSpeedMismatch(String linkSpeedMismatch) {
    this.linkSpeedMismatch = linkSpeedMismatch;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_LOST_REDUNDANCY_DRIVE. It contains the identification of the drive that has lost redundancy.
   **/
  public FailureTypeEntry driveRedundancyFailure(DriveLostRedundancyFailure driveRedundancyFailure) {
    this.driveRedundancyFailure = driveRedundancyFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_LOST_REDUNDANCY_DRIVE. It contains the identification of the drive that has lost redundancy.")
  @JsonProperty("driveRedundancyFailure")
  public DriveLostRedundancyFailure getDriveRedundancyFailure() {
    return driveRedundancyFailure;
  }
  
  public void setDriveRedundancyFailure(DriveLostRedundancyFailure driveRedundancyFailure) {
    this.driveRedundancyFailure = driveRedundancyFailure;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_LOST_REDUNDANCY_ESM. It contains the identification of the ESM card that has lost redundancy.
   **/
  public FailureTypeEntry esmRedundancyFailure(EsmLostRedundancyFailure esmRedundancyFailure) {
    this.esmRedundancyFailure = esmRedundancyFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_LOST_REDUNDANCY_ESM. It contains the identification of the ESM card that has lost redundancy.")
  @JsonProperty("esmRedundancyFailure")
  public EsmLostRedundancyFailure getEsmRedundancyFailure() {
    return esmRedundancyFailure;
  }
  
  public void setEsmRedundancyFailure(EsmLostRedundancyFailure esmRedundancyFailure) {
    this.esmRedundancyFailure = esmRedundancyFailure;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_LOST_REDUNDANCY_TRAY. It contains the identification of the tray that has lost redundancy.
   **/
  public FailureTypeEntry trayRedundancyFailure(TrayLostRedundancyFailure trayRedundancyFailure) {
    this.trayRedundancyFailure = trayRedundancyFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_LOST_REDUNDANCY_TRAY. It contains the identification of the tray that has lost redundancy.")
  @JsonProperty("trayRedundancyFailure")
  public TrayLostRedundancyFailure getTrayRedundancyFailure() {
    return trayRedundancyFailure;
  }
  
  public void setTrayRedundancyFailure(TrayLostRedundancyFailure trayRedundancyFailure) {
    this.trayRedundancyFailure = trayRedundancyFailure;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_MAX_TEMP_EXCEEDED. It contains the identification of the thermal sensor component that is reporting a temperature above the maximum level.
   **/
  public FailureTypeEntry maxTempWarn(String maxTempWarn) {
    this.maxTempWarn = maxTempWarn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_MAX_TEMP_EXCEEDED. It contains the identification of the thermal sensor component that is reporting a temperature above the maximum level.")
  @JsonProperty("maxTempWarn")
  public String getMaxTempWarn() {
    return maxTempWarn;
  }
  
  public void setMaxTempWarn(String maxTempWarn) {
    this.maxTempWarn = maxTempWarn;
  }

  
  /**
   * This field is equal to present only if the RecoveryFailureType value is equal to REC_MEM_PARITY_ERROR. It contains the identification of the controller that has failed due to a persistent memory parity error.
   **/
  public FailureTypeEntry memParityError(String memParityError) {
    this.memParityError = memParityError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is equal to present only if the RecoveryFailureType value is equal to REC_MEM_PARITY_ERROR. It contains the identification of the controller that has failed due to a persistent memory parity error.")
  @JsonProperty("memParityError")
  public String getMemParityError() {
    return memParityError;
  }
  
  public void setMemParityError(String memParityError) {
    this.memParityError = memParityError;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_METADATA_OFFLINE.
   **/
  public FailureTypeEntry metadataOffline(MetadataOffline metadataOffline) {
    this.metadataOffline = metadataOffline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_METADATA_OFFLINE.")
  @JsonProperty("metadataOffline")
  public MetadataOffline getMetadataOffline() {
    return metadataOffline;
  }
  
  public void setMetadataOffline(MetadataOffline metadataOffline) {
    this.metadataOffline = metadataOffline;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_MINIHUB_SPEED_MISMATCH. It contains the identification of the drive side minihub with the data rate mismatch.
   **/
  public FailureTypeEntry minihubRef(String minihubRef) {
    this.minihubRef = minihubRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_MINIHUB_SPEED_MISMATCH. It contains the identification of the drive side minihub with the data rate mismatch.")
  @JsonProperty("minihubRef")
  public String getMinihubRef() {
    return minihubRef;
  }
  
  public void setMinihubRef(String minihubRef) {
    this.minihubRef = minihubRef;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_MIRROR_DUAL_PRIMARY. It contains the identification of the mirror relationship.
   **/
  public FailureTypeEntry dualMirrorPrimary(DualMirrorPrimary dualMirrorPrimary) {
    this.dualMirrorPrimary = dualMirrorPrimary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_MIRROR_DUAL_PRIMARY. It contains the identification of the mirror relationship.")
  @JsonProperty("dualMirrorPrimary")
  public DualMirrorPrimary getDualMirrorPrimary() {
    return dualMirrorPrimary;
  }
  
  public void setDualMirrorPrimary(DualMirrorPrimary dualMirrorPrimary) {
    this.dualMirrorPrimary = dualMirrorPrimary;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_MIRROR_DUAL_SECONDARY. It contains the identification of the mirror relationship.
   **/
  public FailureTypeEntry dualMirrorSecondary(DualMirrorSecondary dualMirrorSecondary) {
    this.dualMirrorSecondary = dualMirrorSecondary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_MIRROR_DUAL_SECONDARY. It contains the identification of the mirror relationship.")
  @JsonProperty("dualMirrorSecondary")
  public DualMirrorSecondary getDualMirrorSecondary() {
    return dualMirrorSecondary;
  }
  
  public void setDualMirrorSecondary(DualMirrorSecondary dualMirrorSecondary) {
    this.dualMirrorSecondary = dualMirrorSecondary;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_MIRROR_UNSYNCHRONIZED. It contains the identification of the mirror relationship.
   **/
  public FailureTypeEntry mirrorUnsynchronized(MirrorUnsynchronized mirrorUnsynchronized) {
    this.mirrorUnsynchronized = mirrorUnsynchronized;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_MIRROR_UNSYNCHRONIZED. It contains the identification of the mirror relationship.")
  @JsonProperty("mirrorUnsynchronized")
  public MirrorUnsynchronized getMirrorUnsynchronized() {
    return mirrorUnsynchronized;
  }
  
  public void setMirrorUnsynchronized(MirrorUnsynchronized mirrorUnsynchronized) {
    this.mirrorUnsynchronized = mirrorUnsynchronized;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_MISMATCHED_DRIVE_TYPE.
   **/
  public FailureTypeEntry mixeddrivetypesFeature(FeatureState mixeddrivetypesFeature) {
    this.mixeddrivetypesFeature = mixeddrivetypesFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_MISMATCHED_DRIVE_TYPE.")
  @JsonProperty("mixeddrivetypesFeature")
  public FeatureState getMixeddrivetypesFeature() {
    return mixeddrivetypesFeature;
  }
  
  public void setMixeddrivetypesFeature(FeatureState mixeddrivetypesFeature) {
    this.mixeddrivetypesFeature = mixeddrivetypesFeature;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_NATIVE_VG_FOREIGN_DRIVE_MUTUAL_REF. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the foreign drive; the volumeGroup field is a reference to the native volume group.
   **/
  public FailureTypeEntry nativeVgForeignDriveMutualRef(PvgRecoveryData nativeVgForeignDriveMutualRef) {
    this.nativeVgForeignDriveMutualRef = nativeVgForeignDriveMutualRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_NATIVE_VG_FOREIGN_DRIVE_MUTUAL_REF. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the foreign drive; the volumeGroup field is a reference to the native volume group.")
  @JsonProperty("nativeVgForeignDriveMutualRef")
  public PvgRecoveryData getNativeVgForeignDriveMutualRef() {
    return nativeVgForeignDriveMutualRef;
  }
  
  public void setNativeVgForeignDriveMutualRef(PvgRecoveryData nativeVgForeignDriveMutualRef) {
    this.nativeVgForeignDriveMutualRef = nativeVgForeignDriveMutualRef;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_NATIVE_VG_REFERS_TO_FOREIGN_DRIVE. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the foreign drive, and the volumeGroup field is a reference to the native volume group.
   **/
  public FailureTypeEntry nativeVgRefersToForeignDrive(PvgRecoveryData nativeVgRefersToForeignDrive) {
    this.nativeVgRefersToForeignDrive = nativeVgRefersToForeignDrive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_NATIVE_VG_REFERS_TO_FOREIGN_DRIVE. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the foreign drive, and the volumeGroup field is a reference to the native volume group.")
  @JsonProperty("nativeVgRefersToForeignDrive")
  public PvgRecoveryData getNativeVgRefersToForeignDrive() {
    return nativeVgRefersToForeignDrive;
  }
  
  public void setNativeVgRefersToForeignDrive(PvgRecoveryData nativeVgRefersToForeignDrive) {
    this.nativeVgRefersToForeignDrive = nativeVgRefersToForeignDrive;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_NET_SETUP_ERROR.
   **/
  public FailureTypeEntry networkSetupError(String networkSetupError) {
    this.networkSetupError = networkSetupError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_NET_SETUP_ERROR.")
  @JsonProperty("networkSetupError")
  public String getNetworkSetupError() {
    return networkSetupError;
  }
  
  public void setNetworkSetupError(String networkSetupError) {
    this.networkSetupError = networkSetupError;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_NOMINAL_TEMP_EXCEEDED. It contains the identification of the thermal sensor component that is reporting a temperature above the nominal level.
   **/
  public FailureTypeEntry nominalTempWarn(String nominalTempWarn) {
    this.nominalTempWarn = nominalTempWarn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_NOMINAL_TEMP_EXCEEDED. It contains the identification of the thermal sensor component that is reporting a temperature above the nominal level.")
  @JsonProperty("nominalTempWarn")
  public String getNominalTempWarn() {
    return nominalTempWarn;
  }
  
  public void setNominalTempWarn(String nominalTempWarn) {
    this.nominalTempWarn = nominalTempWarn;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_NON_FRU_BATTERY_NEAR_EXPIRATION (or its equivalent REC_INTEGRATED_BATTERY_NEAR_EXPIRATION). It contains the identification of the controller with the battery warning. Note that the \"non-FRU\" terminology is really misleading since this case applies only when the battery is in a FRU (as opposed to a CRU).
   **/
  public FailureTypeEntry nonFruBatteryWarn(String nonFruBatteryWarn) {
    this.nonFruBatteryWarn = nonFruBatteryWarn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_NON_FRU_BATTERY_NEAR_EXPIRATION (or its equivalent REC_INTEGRATED_BATTERY_NEAR_EXPIRATION). It contains the identification of the controller with the battery warning. Note that the \"non-FRU\" terminology is really misleading since this case applies only when the battery is in a FRU (as opposed to a CRU).")
  @JsonProperty("nonFruBatteryWarn")
  public String getNonFruBatteryWarn() {
    return nonFruBatteryWarn;
  }
  
  public void setNonFruBatteryWarn(String nonFruBatteryWarn) {
    this.nonFruBatteryWarn = nonFruBatteryWarn;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_NON_FRU_FAILED_BATTERY (or its equivalent REC_FAILED_INTEGRATED_BATTERY). It contains the identification of the controller with the failed battery. Note that the \"non-FRU\" terminology is really misleading since this case applies only when the battery is in a FRU (as opposed to a CRU).
   **/
  public FailureTypeEntry nonFruBatteryFail(String nonFruBatteryFail) {
    this.nonFruBatteryFail = nonFruBatteryFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_NON_FRU_FAILED_BATTERY (or its equivalent REC_FAILED_INTEGRATED_BATTERY). It contains the identification of the controller with the failed battery. Note that the \"non-FRU\" terminology is really misleading since this case applies only when the battery is in a FRU (as opposed to a CRU).")
  @JsonProperty("nonFruBatteryFail")
  public String getNonFruBatteryFail() {
    return nonFruBatteryFail;
  }
  
  public void setNonFruBatteryFail(String nonFruBatteryFail) {
    this.nonFruBatteryFail = nonFruBatteryFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_NON_FRU_REMOVED_BATTERY (or its equivalent REC_REMOVED_INTEGRATED_BATTERY). It contains the identification of the FRU'd battery that was removed. Note that the \"non-FRU\" terminology is really misleading since this case applies only when the battery is in a FRU (as opposed to a CRU).
   **/
  public FailureTypeEntry nonFruBatteryRemoved(String nonFruBatteryRemoved) {
    this.nonFruBatteryRemoved = nonFruBatteryRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_NON_FRU_REMOVED_BATTERY (or its equivalent REC_REMOVED_INTEGRATED_BATTERY). It contains the identification of the FRU'd battery that was removed. Note that the \"non-FRU\" terminology is really misleading since this case applies only when the battery is in a FRU (as opposed to a CRU).")
  @JsonProperty("nonFruBatteryRemoved")
  public String getNonFruBatteryRemoved() {
    return nonFruBatteryRemoved;
  }
  
  public void setNonFruBatteryRemoved(String nonFruBatteryRemoved) {
    this.nonFruBatteryRemoved = nonFruBatteryRemoved;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_NON_PREFERRED_PATH. It contains the identification of the controller that is the preferred owner of the volume(s) that have been switched to the non-preferred owner due to some sort of I/O path error.
   **/
  public FailureTypeEntry nonPreferredPath(NotOnPreferredPath nonPreferredPath) {
    this.nonPreferredPath = nonPreferredPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_NON_PREFERRED_PATH. It contains the identification of the controller that is the preferred owner of the volume(s) that have been switched to the non-preferred owner due to some sort of I/O path error.")
  @JsonProperty("nonPreferredPath")
  public NotOnPreferredPath getNonPreferredPath() {
    return nonPreferredPath;
  }
  
  public void setNonPreferredPath(NotOnPreferredPath nonPreferredPath) {
    this.nonPreferredPath = nonPreferredPath;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_OFFLINE_CTL. It contains the identification of a controller that has been placed offline.
   **/
  public FailureTypeEntry offlineCtl(String offlineCtl) {
    this.offlineCtl = offlineCtl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_OFFLINE_CTL. It contains the identification of a controller that has been placed offline.")
  @JsonProperty("offlineCtl")
  public String getOfflineCtl() {
    return offlineCtl;
  }
  
  public void setOfflineCtl(String offlineCtl) {
    this.offlineCtl = offlineCtl;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_OFFLINE_VOLUME_GROUP. It contains the identification of a volume group that has been marked offline. This can occur due to either an explicit user request, or the physical insertion of drives from another storage array.
   **/
  public FailureTypeEntry volGroupOffline(String volGroupOffline) {
    this.volGroupOffline = volGroupOffline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_OFFLINE_VOLUME_GROUP. It contains the identification of a volume group that has been marked offline. This can occur due to either an explicit user request, or the physical insertion of drives from another storage array.")
  @JsonProperty("volGroupOffline")
  public String getVolGroupOffline() {
    return volGroupOffline;
  }
  
  public void setVolGroupOffline(String volGroupOffline) {
    this.volGroupOffline = volGroupOffline;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_PARTITIONS_NOT_COMPLIANT. It contains the identification of the storage partitions feature that is not in compliance.
   **/
  public FailureTypeEntry spmFeature(FeatureState spmFeature) {
    this.spmFeature = spmFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_PARTITIONS_NOT_COMPLIANT. It contains the identification of the storage partitions feature that is not in compliance.")
  @JsonProperty("spmFeature")
  public FeatureState getSpmFeature() {
    return spmFeature;
  }
  
  public void setSpmFeature(FeatureState spmFeature) {
    this.spmFeature = spmFeature;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_PASSIVE_CTL. It contains the identification of a controller that has been placed into the \"passive\" mode of operation.
   **/
  public FailureTypeEntry passiveCtl(String passiveCtl) {
    this.passiveCtl = passiveCtl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_PASSIVE_CTL. It contains the identification of a controller that has been placed into the \"passive\" mode of operation.")
  @JsonProperty("passiveCtl")
  public String getPassiveCtl() {
    return passiveCtl;
  }
  
  public void setPassiveCtl(String passiveCtl) {
    this.passiveCtl = passiveCtl;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_PATH_DEGRADED.
   **/
  public FailureTypeEntry pathDegradedFailure(PathDegradedFailure pathDegradedFailure) {
    this.pathDegradedFailure = pathDegradedFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_PATH_DEGRADED.")
  @JsonProperty("pathDegradedFailure")
  public PathDegradedFailure getPathDegradedFailure() {
    return pathDegradedFailure;
  }
  
  public void setPathDegradedFailure(PathDegradedFailure pathDegradedFailure) {
    this.pathDegradedFailure = pathDegradedFailure;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PERFORMANCE_TIER_NOT_COMPLIANT. It indicates that the performance tier feature is out of compliance.
   **/
  public FailureTypeEntry performanceTierFeature(FeatureState performanceTierFeature) {
    this.performanceTierFeature = performanceTierFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PERFORMANCE_TIER_NOT_COMPLIANT. It indicates that the performance tier feature is out of compliance.")
  @JsonProperty("performanceTierFeature")
  public FeatureState getPerformanceTierFeature() {
    return performanceTierFeature;
  }
  
  public void setPerformanceTierFeature(FeatureState performanceTierFeature) {
    this.performanceTierFeature = performanceTierFeature;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_POWER_SUPPLY_UNKNOWN_STAT. It contains the identification of the power supply that has failed with unknown status.
   **/
  public FailureTypeEntry powerSupplyStatUnknown(String powerSupplyStatUnknown) {
    this.powerSupplyStatUnknown = powerSupplyStatUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_POWER_SUPPLY_UNKNOWN_STAT. It contains the identification of the power supply that has failed with unknown status.")
  @JsonProperty("powerSupplyStatUnknown")
  public String getPowerSupplyStatUnknown() {
    return powerSupplyStatUnknown;
  }
  
  public void setPowerSupplyStatUnknown(String powerSupplyStatUnknown) {
    this.powerSupplyStatUnknown = powerSupplyStatUnknown;
  }

  
  /**
   * This field is present only if the recFailureType value is equal to REC_PROC_MEM_TOO_SMALL_FOR_CACHE. It identifies a controller that does not have enough processor memory for managing the amount of cache memory it has.
   **/
  public FailureTypeEntry procMemTooSmallForCache(String procMemTooSmallForCache) {
    this.procMemTooSmallForCache = procMemTooSmallForCache;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the recFailureType value is equal to REC_PROC_MEM_TOO_SMALL_FOR_CACHE. It identifies a controller that does not have enough processor memory for managing the amount of cache memory it has.")
  @JsonProperty("procMemTooSmallForCache")
  public String getProcMemTooSmallForCache() {
    return procMemTooSmallForCache;
  }
  
  public void setProcMemTooSmallForCache(String procMemTooSmallForCache) {
    this.procMemTooSmallForCache = procMemTooSmallForCache;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_RAID6_NOT_COMPLIANT. It is a FeatureState structure indicating that the RAID 6 feature is out of compliance.
   **/
  public FailureTypeEntry raid6Feature(FeatureState raid6Feature) {
    this.raid6Feature = raid6Feature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_RAID6_NOT_COMPLIANT. It is a FeatureState structure indicating that the RAID 6 feature is out of compliance.")
  @JsonProperty("raid6Feature")
  public FeatureState getRaid6Feature() {
    return raid6Feature;
  }
  
  public void setRaid6Feature(FeatureState raid6Feature) {
    this.raid6Feature = raid6Feature;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REDUNDANT_PS_REQUIRED. It contains the identification of the support CRU that is lacking a required power supply component.
   **/
  public FailureTypeEntry incorrectSupportCru(String incorrectSupportCru) {
    this.incorrectSupportCru = incorrectSupportCru;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REDUNDANT_PS_REQUIRED. It contains the identification of the support CRU that is lacking a required power supply component.")
  @JsonProperty("incorrectSupportCru")
  public String getIncorrectSupportCru() {
    return incorrectSupportCru;
  }
  
  public void setIncorrectSupportCru(String incorrectSupportCru) {
    this.incorrectSupportCru = incorrectSupportCru;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REMOTE_NO_ARRAY. It contains the identification of the remote volume.
   **/
  public FailureTypeEntry remoteVolNoArray(RemoteVolNoArray remoteVolNoArray) {
    this.remoteVolNoArray = remoteVolNoArray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REMOTE_NO_ARRAY. It contains the identification of the remote volume.")
  @JsonProperty("remoteVolNoArray")
  public RemoteVolNoArray getRemoteVolNoArray() {
    return remoteVolNoArray;
  }
  
  public void setRemoteVolNoArray(RemoteVolNoArray remoteVolNoArray) {
    this.remoteVolNoArray = remoteVolNoArray;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REMOTE_NO_FABRIC. It contains the identification of the remote volume.
   **/
  public FailureTypeEntry remoteVolNoFabric(RemoteVolNoFabric remoteVolNoFabric) {
    this.remoteVolNoFabric = remoteVolNoFabric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REMOTE_NO_FABRIC. It contains the identification of the remote volume.")
  @JsonProperty("remoteVolNoFabric")
  public RemoteVolNoFabric getRemoteVolNoFabric() {
    return remoteVolNoFabric;
  }
  
  public void setRemoteVolNoFabric(RemoteVolNoFabric remoteVolNoFabric) {
    this.remoteVolNoFabric = remoteVolNoFabric;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REMOTE_NO_LUN. It contains the identification of the remote volume.
   **/
  public FailureTypeEntry remoteVolNoLUN(RemoteVolNoLUN remoteVolNoLUN) {
    this.remoteVolNoLUN = remoteVolNoLUN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REMOTE_NO_LUN. It contains the identification of the remote volume.")
  @JsonProperty("remoteVolNoLUN")
  public RemoteVolNoLUN getRemoteVolNoLUN() {
    return remoteVolNoLUN;
  }
  
  public void setRemoteVolNoLUN(RemoteVolNoLUN remoteVolNoLUN) {
    this.remoteVolNoLUN = remoteVolNoLUN;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REMOTE_WWN_CHANGE_FAILED. It contains the identification of the remote volume.
   **/
  public FailureTypeEntry remoteVolWWNChangeFailed(RemoteVolWWNChangeFailed remoteVolWWNChangeFailed) {
    this.remoteVolWWNChangeFailed = remoteVolWWNChangeFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REMOTE_WWN_CHANGE_FAILED. It contains the identification of the remote volume.")
  @JsonProperty("remoteVolWWNChangeFailed")
  public RemoteVolWWNChangeFailed getRemoteVolWWNChangeFailed() {
    return remoteVolWWNChangeFailed;
  }
  
  public void setRemoteVolWWNChangeFailed(RemoteVolWWNChangeFailed remoteVolWWNChangeFailed) {
    this.remoteVolWWNChangeFailed = remoteVolWWNChangeFailed;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REMOVED_ALARM. It contains the identification of the alarm that was removed.
   **/
  public FailureTypeEntry alarmRemoved(String alarmRemoved) {
    this.alarmRemoved = alarmRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REMOVED_ALARM. It contains the identification of the alarm that was removed.")
  @JsonProperty("alarmRemoved")
  public String getAlarmRemoved() {
    return alarmRemoved;
  }
  
  public void setAlarmRemoved(String alarmRemoved) {
    this.alarmRemoved = alarmRemoved;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REMOVED_BATTERY. It contains the identification of the battery that was removed.
   **/
  public FailureTypeEntry batteryRemoved(String batteryRemoved) {
    this.batteryRemoved = batteryRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REMOVED_BATTERY. It contains the identification of the battery that was removed.")
  @JsonProperty("batteryRemoved")
  public String getBatteryRemoved() {
    return batteryRemoved;
  }
  
  public void setBatteryRemoved(String batteryRemoved) {
    this.batteryRemoved = batteryRemoved;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_REMOVED_BATTERY_PACK.
   **/
  public FailureTypeEntry batteryPackRemoved(String batteryPackRemoved) {
    this.batteryPackRemoved = batteryPackRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_REMOVED_BATTERY_PACK.")
  @JsonProperty("batteryPackRemoved")
  public String getBatteryPackRemoved() {
    return batteryPackRemoved;
  }
  
  public void setBatteryPackRemoved(String batteryPackRemoved) {
    this.batteryPackRemoved = batteryPackRemoved;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REMOVED_ESM. It contains the identification of the ESM canister that was removed.
   **/
  public FailureTypeEntry esmRemoved(String esmRemoved) {
    this.esmRemoved = esmRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REMOVED_ESM. It contains the identification of the ESM canister that was removed.")
  @JsonProperty("esmRemoved")
  public String getEsmRemoved() {
    return esmRemoved;
  }
  
  public void setEsmRemoved(String esmRemoved) {
    this.esmRemoved = esmRemoved;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_REMOVED_FAN.
   **/
  public FailureTypeEntry fanRemoved(String fanRemoved) {
    this.fanRemoved = fanRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_REMOVED_FAN.")
  @JsonProperty("fanRemoved")
  public String getFanRemoved() {
    return fanRemoved;
  }
  
  public void setFanRemoved(String fanRemoved) {
    this.fanRemoved = fanRemoved;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_REMOVED_ICC_CRU.
   **/
  public FailureTypeEntry iccCruRemoved(String iccCruRemoved) {
    this.iccCruRemoved = iccCruRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_REMOVED_ICC_CRU.")
  @JsonProperty("iccCruRemoved")
  public String getIccCruRemoved() {
    return iccCruRemoved;
  }
  
  public void setIccCruRemoved(String iccCruRemoved) {
    this.iccCruRemoved = iccCruRemoved;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_REMOVED_POWER_SUPPLY.
   **/
  public FailureTypeEntry powerSupplyRemoved(String powerSupplyRemoved) {
    this.powerSupplyRemoved = powerSupplyRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_REMOVED_POWER_SUPPLY.")
  @JsonProperty("powerSupplyRemoved")
  public String getPowerSupplyRemoved() {
    return powerSupplyRemoved;
  }
  
  public void setPowerSupplyRemoved(String powerSupplyRemoved) {
    this.powerSupplyRemoved = powerSupplyRemoved;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_REMOVED_SUPPORT_CRU.
   **/
  public FailureTypeEntry supportCruRemoved(String supportCruRemoved) {
    this.supportCruRemoved = supportCruRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_REMOVED_SUPPORT_CRU.")
  @JsonProperty("supportCruRemoved")
  public String getSupportCruRemoved() {
    return supportCruRemoved;
  }
  
  public void setSupportCruRemoved(String supportCruRemoved) {
    this.supportCruRemoved = supportCruRemoved;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_REMOVED_TEMP_SENSOR.
   **/
  public FailureTypeEntry tempSensorRemoved(String tempSensorRemoved) {
    this.tempSensorRemoved = tempSensorRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_REMOVED_TEMP_SENSOR.")
  @JsonProperty("tempSensorRemoved")
  public String getTempSensorRemoved() {
    return tempSensorRemoved;
  }
  
  public void setTempSensorRemoved(String tempSensorRemoved) {
    this.tempSensorRemoved = tempSensorRemoved;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REPLACED_DRIVE_WRONG_TYPE. It indicates that a failed drive has been replaced with a drive of the wrong type. The failure type list will contain one entry of this type for each wrong replacement drive in the storage array.
   **/
  public FailureTypeEntry replacedDriveWrongType(String replacedDriveWrongType) {
    this.replacedDriveWrongType = replacedDriveWrongType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REPLACED_DRIVE_WRONG_TYPE. It indicates that a failed drive has been replaced with a drive of the wrong type. The failure type list will contain one entry of this type for each wrong replacement drive in the storage array.")
  @JsonProperty("replacedDriveWrongType")
  public String getReplacedDriveWrongType() {
    return replacedDriveWrongType;
  }
  
  public void setReplacedDriveWrongType(String replacedDriveWrongType) {
    this.replacedDriveWrongType = replacedDriveWrongType;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REPOSITORY_FULL. It contains the identification of the repository that is full.
   **/
  public FailureTypeEntry repositoryFull(FullRepository repositoryFull) {
    this.repositoryFull = repositoryFull;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REPOSITORY_FULL. It contains the identification of the repository that is full.")
  @JsonProperty("repositoryFull")
  public FullRepository getRepositoryFull() {
    return repositoryFull;
  }
  
  public void setRepositoryFull(FullRepository repositoryFull) {
    this.repositoryFull = repositoryFull;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_REPOSITORY_OVER_THRESHOLD. It contains the identification of the repository volume that is over the threshold.
   **/
  public FailureTypeEntry repositoryOverThreshold(String repositoryOverThreshold) {
    this.repositoryOverThreshold = repositoryOverThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_REPOSITORY_OVER_THRESHOLD. It contains the identification of the repository volume that is over the threshold.")
  @JsonProperty("repositoryOverThreshold")
  public String getRepositoryOverThreshold() {
    return repositoryOverThreshold;
  }
  
  public void setRepositoryOverThreshold(String repositoryOverThreshold) {
    this.repositoryOverThreshold = repositoryOverThreshold;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_RPA_ERR_CTL. It contains the identification of the controller with the RPA parity error.
   **/
  public FailureTypeEntry rpaParityError(String rpaParityError) {
    this.rpaParityError = rpaParityError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_RPA_ERR_CTL. It contains the identification of the controller with the RPA parity error.")
  @JsonProperty("rpaParityError")
  public String getRpaParityError() {
    return rpaParityError;
  }
  
  public void setRpaParityError(String rpaParityError) {
    this.rpaParityError = rpaParityError;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_RVM_NOT_COMPLIANT.
   **/
  public FailureTypeEntry rvmFeature(FeatureState rvmFeature) {
    this.rvmFeature = rvmFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_RVM_NOT_COMPLIANT.")
  @JsonProperty("rvmFeature")
  public FeatureState getRvmFeature() {
    return rvmFeature;
  }
  
  public void setRvmFeature(FeatureState rvmFeature) {
    this.rvmFeature = rvmFeature;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SAS_PORT_DEGRADED. It supplies information about a degraded SAS port, including the parent device and the attached device. An entry of this type appears once in the failure type list for each degraded port in the array.
   **/
  public FailureTypeEntry degradedSasPort(SasPort degradedSasPort) {
    this.degradedSasPort = degradedSasPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SAS_PORT_DEGRADED. It supplies information about a degraded SAS port, including the parent device and the attached device. An entry of this type appears once in the failure type list for each degraded port in the array.")
  @JsonProperty("degradedSasPort")
  public SasPort getDegradedSasPort() {
    return degradedSasPort;
  }
  
  public void setDegradedSasPort(SasPort degradedSasPort) {
    this.degradedSasPort = degradedSasPort;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SAS_PORT_FAILED. It supplies information about a failed SAS port, including the parent device and the attached device. An entry of this type appears once in the failure type list for each failed port in the array.
   **/
  public FailureTypeEntry failedSasPort(SasPort failedSasPort) {
    this.failedSasPort = failedSasPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SAS_PORT_FAILED. It supplies information about a failed SAS port, including the parent device and the attached device. An entry of this type appears once in the failure type list for each failed port in the array.")
  @JsonProperty("failedSasPort")
  public SasPort getFailedSasPort() {
    return failedSasPort;
  }
  
  public void setFailedSasPort(SasPort failedSasPort) {
    this.failedSasPort = failedSasPort;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SAS_PORT_MISWIRED. It identifies the SAS port from which the miswire originates. The type of miswire is identified by a field in the SasPort structure.
   **/
  public FailureTypeEntry miswiredSasPort(SasPort miswiredSasPort) {
    this.miswiredSasPort = miswiredSasPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SAS_PORT_MISWIRED. It identifies the SAS port from which the miswire originates. The type of miswire is identified by a field in the SasPort structure.")
  @JsonProperty("miswiredSasPort")
  public SasPort getMiswiredSasPort() {
    return miswiredSasPort;
  }
  
  public void setMiswiredSasPort(SasPort miswiredSasPort) {
    this.miswiredSasPort = miswiredSasPort;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SNAPSHOT_FAILED. It contains the identification of the snapshot volume that failed.
   **/
  public FailureTypeEntry snapFail(SnapshotFailure snapFail) {
    this.snapFail = snapFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SNAPSHOT_FAILED. It contains the identification of the snapshot volume that failed.")
  @JsonProperty("snapFail")
  public SnapshotFailure getSnapFail() {
    return snapFail;
  }
  
  public void setSnapFail(SnapshotFailure snapFail) {
    this.snapFail = snapFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SNAPSHOT_NOT_COMPLIANT.
   **/
  public FailureTypeEntry snapshotFeature(FeatureState snapshotFeature) {
    this.snapshotFeature = snapshotFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SNAPSHOT_NOT_COMPLIANT.")
  @JsonProperty("snapshotFeature")
  public FeatureState getSnapshotFeature() {
    return snapshotFeature;
  }
  
  public void setSnapshotFeature(FeatureState snapshotFeature) {
    this.snapshotFeature = snapshotFeature;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SPEED_NEG_ERROR. It indicates that a Fibre Channel speed negotiation error has occurred.
   **/
  public FailureTypeEntry speedNegError(SpeedNegError speedNegError) {
    this.speedNegError = speedNegError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SPEED_NEG_ERROR. It indicates that a Fibre Channel speed negotiation error has occurred.")
  @JsonProperty("speedNegError")
  public SpeedNegError getSpeedNegError() {
    return speedNegError;
  }
  
  public void setSpeedNegError(SpeedNegError speedNegError) {
    this.speedNegError = speedNegError;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_SUBMODEL_MISMATCH.
   **/
  public FailureTypeEntry submodelMismatch(String submodelMismatch) {
    this.submodelMismatch = submodelMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_SUBMODEL_MISMATCH.")
  @JsonProperty("submodelMismatch")
  public String getSubmodelMismatch() {
    return submodelMismatch;
  }
  
  public void setSubmodelMismatch(String submodelMismatch) {
    this.submodelMismatch = submodelMismatch;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_SUBMODEL_NOT_SET.
   **/
  public FailureTypeEntry submodelNotSet(String submodelNotSet) {
    this.submodelNotSet = submodelNotSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_SUBMODEL_NOT_SET.")
  @JsonProperty("submodelNotSet")
  public String getSubmodelNotSet() {
    return submodelNotSet;
  }
  
  public void setSubmodelNotSet(String submodelNotSet) {
    this.submodelNotSet = submodelNotSet;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_SUBMODEL_NOT_SUPPORTED.
   **/
  public FailureTypeEntry submodelNotSupported(String submodelNotSupported) {
    this.submodelNotSupported = submodelNotSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_SUBMODEL_NOT_SUPPORTED.")
  @JsonProperty("submodelNotSupported")
  public String getSubmodelNotSupported() {
    return submodelNotSupported;
  }
  
  public void setSubmodelNotSupported(String submodelNotSupported) {
    this.submodelNotSupported = submodelNotSupported;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_SUPPORT_CRU_NOINPUT.
   **/
  public FailureTypeEntry supportCruNoInput(String supportCruNoInput) {
    this.supportCruNoInput = supportCruNoInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_SUPPORT_CRU_NOINPUT.")
  @JsonProperty("supportCruNoInput")
  public String getSupportCruNoInput() {
    return supportCruNoInput;
  }
  
  public void setSupportCruNoInput(String supportCruNoInput) {
    this.supportCruNoInput = supportCruNoInput;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SUPPORT_CRU_UNKNOWN_STAT. It contains the identification of the support CRU that has unknown status.
   **/
  public FailureTypeEntry supportCruStatUnknown(String supportCruStatUnknown) {
    this.supportCruStatUnknown = supportCruStatUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SUPPORT_CRU_UNKNOWN_STAT. It contains the identification of the support CRU that has unknown status.")
  @JsonProperty("supportCruStatUnknown")
  public String getSupportCruStatUnknown() {
    return supportCruStatUnknown;
  }
  
  public void setSupportCruStatUnknown(String supportCruStatUnknown) {
    this.supportCruStatUnknown = supportCruStatUnknown;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_TEMP_SENSOR_UNKNOWN_STAT. It contains the identification of the temperature sensor that has failed with unknown status.
   **/
  public FailureTypeEntry tempSensorStatUnknown(String tempSensorStatUnknown) {
    this.tempSensorStatUnknown = tempSensorStatUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_TEMP_SENSOR_UNKNOWN_STAT. It contains the identification of the temperature sensor that has failed with unknown status.")
  @JsonProperty("tempSensorStatUnknown")
  public String getTempSensorStatUnknown() {
    return tempSensorStatUnknown;
  }
  
  public void setTempSensorStatUnknown(String tempSensorStatUnknown) {
    this.tempSensorStatUnknown = tempSensorStatUnknown;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_TRANS_MOD_UNKNOWN_STAT. It contains the identification of the transceiver module that has failed with unknown status.
   **/
  public FailureTypeEntry transceiverModuleStatUnknown(String transceiverModuleStatUnknown) {
    this.transceiverModuleStatUnknown = transceiverModuleStatUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_TRANS_MOD_UNKNOWN_STAT. It contains the identification of the transceiver module that has failed with unknown status.")
  @JsonProperty("transceiverModuleStatUnknown")
  public String getTransceiverModuleStatUnknown() {
    return transceiverModuleStatUnknown;
  }
  
  public void setTransceiverModuleStatUnknown(String transceiverModuleStatUnknown) {
    this.transceiverModuleStatUnknown = transceiverModuleStatUnknown;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_TRAYID_CONFLICT. It contains the identification of the drive trays that have conflicting tray IDs.
   **/
  public FailureTypeEntry trayIDConflicts(TrayRefList trayIDConflicts) {
    this.trayIDConflicts = trayIDConflicts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_TRAYID_CONFLICT. It contains the identification of the drive trays that have conflicting tray IDs.")
  @JsonProperty("trayIDConflicts")
  public TrayRefList getTrayIDConflicts() {
    return trayIDConflicts;
  }
  
  public void setTrayIDConflicts(TrayRefList trayIDConflicts) {
    this.trayIDConflicts = trayIDConflicts;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_TRAYID_MISMATCH. It contains the identification of the tray that has IDs that do not match.
   **/
  public FailureTypeEntry trayIDMismatch(String trayIDMismatch) {
    this.trayIDMismatch = trayIDMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_TRAYID_MISMATCH. It contains the identification of the tray that has IDs that do not match.")
  @JsonProperty("trayIDMismatch")
  public String getTrayIDMismatch() {
    return trayIDMismatch;
  }
  
  public void setTrayIDMismatch(String trayIDMismatch) {
    this.trayIDMismatch = trayIDMismatch;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_UNCERTIFIED_DRIVE. It contains the identification of a drive whose type/model is not certified for use within the storage array.
   **/
  public FailureTypeEntry driveUncertified(String driveUncertified) {
    this.driveUncertified = driveUncertified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_UNCERTIFIED_DRIVE. It contains the identification of a drive whose type/model is not certified for use within the storage array.")
  @JsonProperty("driveUncertified")
  public String getDriveUncertified() {
    return driveUncertified;
  }
  
  public void setDriveUncertified(String driveUncertified) {
    this.driveUncertified = driveUncertified;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_UNCERTIFIED_ESM.
   **/
  public FailureTypeEntry esmUncertified(String esmUncertified) {
    this.esmUncertified = esmUncertified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_UNCERTIFIED_ESM.")
  @JsonProperty("esmUncertified")
  public String getEsmUncertified() {
    return esmUncertified;
  }
  
  public void setEsmUncertified(String esmUncertified) {
    this.esmUncertified = esmUncertified;
  }

  
  /**
   * This field is present if the value of recFailureType is equal to REC_UNSUPPORTED_CACHE_MEMORY_SIZE. It identifies a controller having a cache of unsupported size.
   **/
  public FailureTypeEntry cacheMemorySizeUnsupported(String cacheMemorySizeUnsupported) {
    this.cacheMemorySizeUnsupported = cacheMemorySizeUnsupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the value of recFailureType is equal to REC_UNSUPPORTED_CACHE_MEMORY_SIZE. It identifies a controller having a cache of unsupported size.")
  @JsonProperty("cacheMemorySizeUnsupported")
  public String getCacheMemorySizeUnsupported() {
    return cacheMemorySizeUnsupported;
  }
  
  public void setCacheMemorySizeUnsupported(String cacheMemorySizeUnsupported) {
    this.cacheMemorySizeUnsupported = cacheMemorySizeUnsupported;
  }

  
  /**
   * This field is present only if the recFailureType is equal to REC_UNSUPPORTED_HOST_BOARD. It identifies an unsupported host board that is responsible for the other controller locking down.
   **/
  public FailureTypeEntry unsupportedHostBoard(String unsupportedHostBoard) {
    this.unsupportedHostBoard = unsupportedHostBoard;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the recFailureType is equal to REC_UNSUPPORTED_HOST_BOARD. It identifies an unsupported host board that is responsible for the other controller locking down.")
  @JsonProperty("unsupportedHostBoard")
  public String getUnsupportedHostBoard() {
    return unsupportedHostBoard;
  }
  
  public void setUnsupportedHostBoard(String unsupportedHostBoard) {
    this.unsupportedHostBoard = unsupportedHostBoard;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_UNSUPPORTED_MINIHUB. It contains the identification of the unsupported minihub.
   **/
  public FailureTypeEntry miniHubUnsupported(String miniHubUnsupported) {
    this.miniHubUnsupported = miniHubUnsupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_UNSUPPORTED_MINIHUB. It contains the identification of the unsupported minihub.")
  @JsonProperty("miniHubUnsupported")
  public String getMiniHubUnsupported() {
    return miniHubUnsupported;
  }
  
  public void setMiniHubUnsupported(String miniHubUnsupported) {
    this.miniHubUnsupported = miniHubUnsupported;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_UNSUPPORTED_TRAY. It contains the identification of the unsupported tray.
   **/
  public FailureTypeEntry unsupportedTray(String unsupportedTray) {
    this.unsupportedTray = unsupportedTray;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_UNSUPPORTED_TRAY. It contains the identification of the unsupported tray.")
  @JsonProperty("unsupportedTray")
  public String getUnsupportedTray() {
    return unsupportedTray;
  }
  
  public void setUnsupportedTray(String unsupportedTray) {
    this.unsupportedTray = unsupportedTray;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_UPS_ON_BATTERY. It contains the identification of the UPS component that has switched to battery power.
   **/
  public FailureTypeEntry upsOnBattery(String upsOnBattery) {
    this.upsOnBattery = upsOnBattery;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_UPS_ON_BATTERY. It contains the identification of the UPS component that has switched to battery power.")
  @JsonProperty("upsOnBattery")
  public String getUpsOnBattery() {
    return upsOnBattery;
  }
  
  public void setUpsOnBattery(String upsOnBattery) {
    this.upsOnBattery = upsOnBattery;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_USM_DATABASE_FULL.
   **/
  public FailureTypeEntry usmDbFullError(UsmError usmDbFullError) {
    this.usmDbFullError = usmDbFullError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_USM_DATABASE_FULL.")
  @JsonProperty("usmDbFullError")
  public UsmError getUsmDbFullError() {
    return usmDbFullError;
  }
  
  public void setUsmDbFullError(UsmError usmDbFullError) {
    this.usmDbFullError = usmDbFullError;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_USM_UNREADABLE_SECTORS_EXIST.
   **/
  public FailureTypeEntry usmExistError(UsmError usmExistError) {
    this.usmExistError = usmExistError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_USM_UNREADABLE_SECTORS_EXIST.")
  @JsonProperty("usmExistError")
  public UsmError getUsmExistError() {
    return usmExistError;
  }
  
  public void setUsmExistError(UsmError usmExistError) {
    this.usmExistError = usmExistError;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_VG_CLONED. It identifies the cloned volume group. Also, it is safe to assume that the drives identified in the object graph as belonging to the volume group are valid.
   **/
  public FailureTypeEntry vgCloned(String vgCloned) {
    this.vgCloned = vgCloned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_VG_CLONED. It identifies the cloned volume group. Also, it is safe to assume that the drives identified in the object graph as belonging to the volume group are valid.")
  @JsonProperty("vgCloned")
  public String getVgCloned() {
    return vgCloned;
  }
  
  public void setVgCloned(String vgCloned) {
    this.vgCloned = vgCloned;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_VG_DRIVE_PART_OF_MULTIPLE_VGS. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the foreign drive; the volumeGroup field is a reference to the primary affected volume group (the one that needs to have its drives removed). Also, it is safe to assume that the drives identified in the object graph as belonging to the volume group are valid.
   **/
  public FailureTypeEntry vgDrivePartOfMultipleVgs(PvgRecoveryData vgDrivePartOfMultipleVgs) {
    this.vgDrivePartOfMultipleVgs = vgDrivePartOfMultipleVgs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_VG_DRIVE_PART_OF_MULTIPLE_VGS. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the foreign drive; the volumeGroup field is a reference to the primary affected volume group (the one that needs to have its drives removed). Also, it is safe to assume that the drives identified in the object graph as belonging to the volume group are valid.")
  @JsonProperty("vgDrivePartOfMultipleVgs")
  public PvgRecoveryData getVgDrivePartOfMultipleVgs() {
    return vgDrivePartOfMultipleVgs;
  }
  
  public void setVgDrivePartOfMultipleVgs(PvgRecoveryData vgDrivePartOfMultipleVgs) {
    this.vgDrivePartOfMultipleVgs = vgDrivePartOfMultipleVgs;
  }

  
  /**
   * This field is present only if recFailureType is equal to REC_VG_HAS_DRIVE_PART_OF_MULTIPLE_VGS. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the problem drive (the one having DriveStatusCause of DRIVE_CAUSE_INCOMPATIBLE_VG_HAS_DRIVE_PART_OF_MULTIPLE_VGS); the volumeGroup field is a reference to the foreign volume group. Also, it is safe to assume that the drives identified in the object graph as belonging to the foreign volume group are valid.
   **/
  public FailureTypeEntry vgHasDrivePartOfMultipleVgs(PvgRecoveryData vgHasDrivePartOfMultipleVgs) {
    this.vgHasDrivePartOfMultipleVgs = vgHasDrivePartOfMultipleVgs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if recFailureType is equal to REC_VG_HAS_DRIVE_PART_OF_MULTIPLE_VGS. It identifies the data that is pertinent to this recovery scenario. The drive field in this structure is a reference to the problem drive (the one having DriveStatusCause of DRIVE_CAUSE_INCOMPATIBLE_VG_HAS_DRIVE_PART_OF_MULTIPLE_VGS); the volumeGroup field is a reference to the foreign volume group. Also, it is safe to assume that the drives identified in the object graph as belonging to the foreign volume group are valid.")
  @JsonProperty("vgHasDrivePartOfMultipleVgs")
  public PvgRecoveryData getVgHasDrivePartOfMultipleVgs() {
    return vgHasDrivePartOfMultipleVgs;
  }
  
  public void setVgHasDrivePartOfMultipleVgs(PvgRecoveryData vgHasDrivePartOfMultipleVgs) {
    this.vgHasDrivePartOfMultipleVgs = vgHasDrivePartOfMultipleVgs;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_VOLCOPY_FAILED. It contains the identification of the failed volume copy.
   **/
  public FailureTypeEntry failedVolumeCopy(String failedVolumeCopy) {
    this.failedVolumeCopy = failedVolumeCopy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_VOLCOPY_FAILED. It contains the identification of the failed volume copy.")
  @JsonProperty("failedVolumeCopy")
  public String getFailedVolumeCopy() {
    return failedVolumeCopy;
  }
  
  public void setFailedVolumeCopy(String failedVolumeCopy) {
    this.failedVolumeCopy = failedVolumeCopy;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_VOLCOPY_NOT_COMPLIANT. The volume copy feature is out of compliance.
   **/
  public FailureTypeEntry volcopyFeature(FeatureState volcopyFeature) {
    this.volcopyFeature = volcopyFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_VOLCOPY_NOT_COMPLIANT. The volume copy feature is out of compliance.")
  @JsonProperty("volcopyFeature")
  public FeatureState getVolcopyFeature() {
    return volcopyFeature;
  }
  
  public void setVolcopyFeature(FeatureState volcopyFeature) {
    this.volcopyFeature = volcopyFeature;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_VOLUME_GROUP_INCOMPLETE. It is a reference to a volume group that has transitioned to \"incomplete\" state.
   **/
  public FailureTypeEntry incompleteVolumeGroupRef(String incompleteVolumeGroupRef) {
    this.incompleteVolumeGroupRef = incompleteVolumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_VOLUME_GROUP_INCOMPLETE. It is a reference to a volume group that has transitioned to \"incomplete\" state.")
  @JsonProperty("incompleteVolumeGroupRef")
  public String getIncompleteVolumeGroupRef() {
    return incompleteVolumeGroupRef;
  }
  
  public void setIncompleteVolumeGroupRef(String incompleteVolumeGroupRef) {
    this.incompleteVolumeGroupRef = incompleteVolumeGroupRef;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_VOLUME_GROUP_MISSING. It is a reference to a volume group that has transitioned to \"missing\" state.
   **/
  public FailureTypeEntry missingVolumeGroupRef(String missingVolumeGroupRef) {
    this.missingVolumeGroupRef = missingVolumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_VOLUME_GROUP_MISSING. It is a reference to a volume group that has transitioned to \"missing\" state.")
  @JsonProperty("missingVolumeGroupRef")
  public String getMissingVolumeGroupRef() {
    return missingVolumeGroupRef;
  }
  
  public void setMissingVolumeGroupRef(String missingVolumeGroupRef) {
    this.missingVolumeGroupRef = missingVolumeGroupRef;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_VOLUME_GROUP_PARTIALLY_COMPLETE. It is a reference to a volume group that has transitioned to \"partial\" state.
   **/
  public FailureTypeEntry partialPresentVolumeGroupRef(String partialPresentVolumeGroupRef) {
    this.partialPresentVolumeGroupRef = partialPresentVolumeGroupRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_VOLUME_GROUP_PARTIALLY_COMPLETE. It is a reference to a volume group that has transitioned to \"partial\" state.")
  @JsonProperty("partialPresentVolumeGroupRef")
  public String getPartialPresentVolumeGroupRef() {
    return partialPresentVolumeGroupRef;
  }
  
  public void setPartialPresentVolumeGroupRef(String partialPresentVolumeGroupRef) {
    this.partialPresentVolumeGroupRef = partialPresentVolumeGroupRef;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_VOLUME_HOT_SPARE_IN_USE. It contains the identification of a volume group that has experienced a drive failure, but has acquired a hot spare drive as a temporary replacement.
   **/
  public FailureTypeEntry volHotSpareInUse(String volHotSpareInUse) {
    this.volHotSpareInUse = volHotSpareInUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_VOLUME_HOT_SPARE_IN_USE. It contains the identification of a volume group that has experienced a drive failure, but has acquired a hot spare drive as a temporary replacement.")
  @JsonProperty("volHotSpareInUse")
  public String getVolHotSpareInUse() {
    return volHotSpareInUse;
  }
  
  public void setVolHotSpareInUse(String volHotSpareInUse) {
    this.volHotSpareInUse = volHotSpareInUse;
  }

  
  /**
   * This field is only valid when recFailureType is equal to REC_INVALID_HOST_TYPE_INDEX. It is a reference to a Host in the storage partitions topology that has an invalid host type index, or a null reference if the problem applies to the default host type.
   **/
  public FailureTypeEntry hostRef(String hostRef) {
    this.hostRef = hostRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only valid when recFailureType is equal to REC_INVALID_HOST_TYPE_INDEX. It is a reference to a Host in the storage partitions topology that has an invalid host type index, or a null reference if the problem applies to the default host type.")
  @JsonProperty("hostRef")
  public String getHostRef() {
    return hostRef;
  }
  
  public void setHostRef(String hostRef) {
    this.hostRef = hostRef;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_SECURITY_GET_KEY. It contains a list of drive references for the drives that are locked down and a lockKeyIDRef of the lockKey that is needed to unlock the drives.
   **/
  public FailureTypeEntry securityKeyNeeded(SecurityKeyNeeded securityKeyNeeded) {
    this.securityKeyNeeded = securityKeyNeeded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_SECURITY_GET_KEY. It contains a list of drive references for the drives that are locked down and a lockKeyIDRef of the lockKey that is needed to unlock the drives.")
  @JsonProperty("securityKeyNeeded")
  public SecurityKeyNeeded getSecurityKeyNeeded() {
    return securityKeyNeeded;
  }
  
  public void setSecurityKeyNeeded(SecurityKeyNeeded securityKeyNeeded) {
    this.securityKeyNeeded = securityKeyNeeded;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_SECURITY_NOT_COMPLIANT. The security feature is out of compliance.
   **/
  public FailureTypeEntry fdeFeature(FeatureState fdeFeature) {
    this.fdeFeature = fdeFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_SECURITY_NOT_COMPLIANT. The security feature is out of compliance.")
  @JsonProperty("fdeFeature")
  public FeatureState getFdeFeature() {
    return fdeFeature;
  }
  
  public void setFdeFeature(FeatureState fdeFeature) {
    this.fdeFeature = fdeFeature;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_REMOVED_CONTROLLER. The identification of the missing controller is returned.
   **/
  public FailureTypeEntry removedCtrl(String removedCtrl) {
    this.removedCtrl = removedCtrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_REMOVED_CONTROLLER. The identification of the missing controller is returned.")
  @JsonProperty("removedCtrl")
  public String getRemovedCtrl() {
    return removedCtrl;
  }
  
  public void setRemovedCtrl(String removedCtrl) {
    this.removedCtrl = removedCtrl;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_UNSUCCESS_ISOLATION_REDUN_MISMATCH. The identification of the drive for which the redundancy mismatch was unsuccessfully isolated is returned.
   **/
  public FailureTypeEntry driveUnsuccessIsolationRedunMismatch(String driveUnsuccessIsolationRedunMismatch) {
    this.driveUnsuccessIsolationRedunMismatch = driveUnsuccessIsolationRedunMismatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_UNSUCCESS_ISOLATION_REDUN_MISMATCH. The identification of the drive for which the redundancy mismatch was unsuccessfully isolated is returned.")
  @JsonProperty("driveUnsuccessIsolationRedunMismatch")
  public String getDriveUnsuccessIsolationRedunMismatch() {
    return driveUnsuccessIsolationRedunMismatch;
  }
  
  public void setDriveUnsuccessIsolationRedunMismatch(String driveUnsuccessIsolationRedunMismatch) {
    this.driveUnsuccessIsolationRedunMismatch = driveUnsuccessIsolationRedunMismatch;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_THRES_EXCDED_MISMATCH_CORRECTED. The identification of the drive for which the PFA threshold was exceeded but the redundancy mismatch corrected is returned.
   **/
  public FailureTypeEntry driveThresExcdedMismatchCorrected(String driveThresExcdedMismatchCorrected) {
    this.driveThresExcdedMismatchCorrected = driveThresExcdedMismatchCorrected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_THRES_EXCDED_MISMATCH_CORRECTED. The identification of the drive for which the PFA threshold was exceeded but the redundancy mismatch corrected is returned.")
  @JsonProperty("driveThresExcdedMismatchCorrected")
  public String getDriveThresExcdedMismatchCorrected() {
    return driveThresExcdedMismatchCorrected;
  }
  
  public void setDriveThresExcdedMismatchCorrected(String driveThresExcdedMismatchCorrected) {
    this.driveThresExcdedMismatchCorrected = driveThresExcdedMismatchCorrected;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_INACTIVE_HOST_PORT The identification of the inactive host port is returned.
   **/
  public FailureTypeEntry inactiveHostPort(String inactiveHostPort) {
    this.inactiveHostPort = inactiveHostPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_INACTIVE_HOST_PORT The identification of the inactive host port is returned.")
  @JsonProperty("inactiveHostPort")
  public String getInactiveHostPort() {
    return inactiveHostPort;
  }
  
  public void setInactiveHostPort(String inactiveHostPort) {
    this.inactiveHostPort = inactiveHostPort;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_INACTIVE_INITIATOR. The identification of the inactive initiator is returned.
   **/
  public FailureTypeEntry inactiveInitiator(String inactiveInitiator) {
    this.inactiveInitiator = inactiveInitiator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_INACTIVE_INITIATOR. The identification of the inactive initiator is returned.")
  @JsonProperty("inactiveInitiator")
  public String getInactiveInitiator() {
    return inactiveInitiator;
  }
  
  public void setInactiveInitiator(String inactiveInitiator) {
    this.inactiveInitiator = inactiveInitiator;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PROTECTION_INFORMATION_NOT_COMPLIANT. It indicates that the T10 Protection Information feature is out of compliance.
   **/
  public FailureTypeEntry protectionInformationFeature(FeatureState protectionInformationFeature) {
    this.protectionInformationFeature = protectionInformationFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PROTECTION_INFORMATION_NOT_COMPLIANT. It indicates that the T10 Protection Information feature is out of compliance.")
  @JsonProperty("protectionInformationFeature")
  public FeatureState getProtectionInformationFeature() {
    return protectionInformationFeature;
  }
  
  public void setProtectionInformationFeature(FeatureState protectionInformationFeature) {
    this.protectionInformationFeature = protectionInformationFeature;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PROTECTION_INFORMATION_NOT_SUPPORTED. The identification of the volume group with the protected volumes that cannot be supported by the storage array is returned.
   **/
  public FailureTypeEntry protectionInformationNotSupported(String protectionInformationNotSupported) {
    this.protectionInformationNotSupported = protectionInformationNotSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PROTECTION_INFORMATION_NOT_SUPPORTED. The identification of the volume group with the protected volumes that cannot be supported by the storage array is returned.")
  @JsonProperty("protectionInformationNotSupported")
  public String getProtectionInformationNotSupported() {
    return protectionInformationNotSupported;
  }
  
  public void setProtectionInformationNotSupported(String protectionInformationNotSupported) {
    this.protectionInformationNotSupported = protectionInformationNotSupported;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_REPLACED_INSUFFICIENT_DRIVE_CAPACITY. It is a reference to an inserted drive that has insufficient capacity for the user data of the drive it is replacing.
   **/
  public FailureTypeEntry driveCapacityInsufficient(String driveCapacityInsufficient) {
    this.driveCapacityInsufficient = driveCapacityInsufficient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_REPLACED_INSUFFICIENT_DRIVE_CAPACITY. It is a reference to an inserted drive that has insufficient capacity for the user data of the drive it is replacing.")
  @JsonProperty("driveCapacityInsufficient")
  public String getDriveCapacityInsufficient() {
    return driveCapacityInsufficient;
  }
  
  public void setDriveCapacityInsufficient(String driveCapacityInsufficient) {
    this.driveCapacityInsufficient = driveCapacityInsufficient;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_DRAWER_OPENED. It is a reference to the open or removed drawer.
   **/
  public FailureTypeEntry openDrawerRef(String openDrawerRef) {
    this.openDrawerRef = openDrawerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_DRAWER_OPENED. It is a reference to the open or removed drawer.")
  @JsonProperty("openDrawerRef")
  public String getOpenDrawerRef() {
    return openDrawerRef;
  }
  
  public void setOpenDrawerRef(String openDrawerRef) {
    this.openDrawerRef = openDrawerRef;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_DRAWER_FAILED. It is a reference to the failed drawer.
   **/
  public FailureTypeEntry failedDrawerRef(String failedDrawerRef) {
    this.failedDrawerRef = failedDrawerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_DRAWER_FAILED. It is a reference to the failed drawer.")
  @JsonProperty("failedDrawerRef")
  public String getFailedDrawerRef() {
    return failedDrawerRef;
  }
  
  public void setFailedDrawerRef(String failedDrawerRef) {
    this.failedDrawerRef = failedDrawerRef;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_SSD_AT_END_OF_LIFE. It is a reference to the SSD drive that is at end of life.
   **/
  public FailureTypeEntry driveRef(String driveRef) {
    this.driveRef = driveRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_SSD_AT_END_OF_LIFE. It is a reference to the SSD drive that is at end of life.")
  @JsonProperty("driveRef")
  public String getDriveRef() {
    return driveRef;
  }
  
  public void setDriveRef(String driveRef) {
    this.driveRef = driveRef;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_SSD_NOT_COMPLIANT. It indicates that the Solid State Disk Support feature is out of compliance.
   **/
  public FailureTypeEntry solidStateDisksFeature(FeatureState solidStateDisksFeature) {
    this.solidStateDisksFeature = solidStateDisksFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_SSD_NOT_COMPLIANT. It indicates that the Solid State Disk Support feature is out of compliance.")
  @JsonProperty("solidStateDisksFeature")
  public FeatureState getSolidStateDisksFeature() {
    return solidStateDisksFeature;
  }
  
  public void setSolidStateDisksFeature(FeatureState solidStateDisksFeature) {
    this.solidStateDisksFeature = solidStateDisksFeature;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_FIBRE_TRUNK_MISWIRE. It contains a structure that identifies both the incorrect and required cabling.
   **/
  public FailureTypeEntry fibreTrunkMiswire(FibreTrunkMiswire fibreTrunkMiswire) {
    this.fibreTrunkMiswire = fibreTrunkMiswire;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_FIBRE_TRUNK_MISWIRE. It contains a structure that identifies both the incorrect and required cabling.")
  @JsonProperty("fibreTrunkMiswire")
  public FibreTrunkMiswire getFibreTrunkMiswire() {
    return fibreTrunkMiswire;
  }
  
  public void setFibreTrunkMiswire(FibreTrunkMiswire fibreTrunkMiswire) {
    this.fibreTrunkMiswire = fibreTrunkMiswire;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_FIBRE_TRUNK_INCOMPATIBLE_ESM. It contains a reference to an ESM that does not support trunking.
   **/
  public FailureTypeEntry fibreTrunkIncompatibleEsm(String fibreTrunkIncompatibleEsm) {
    this.fibreTrunkIncompatibleEsm = fibreTrunkIncompatibleEsm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_FIBRE_TRUNK_INCOMPATIBLE_ESM. It contains a reference to an ESM that does not support trunking.")
  @JsonProperty("fibreTrunkIncompatibleEsm")
  public String getFibreTrunkIncompatibleEsm() {
    return fibreTrunkIncompatibleEsm;
  }
  
  public void setFibreTrunkIncompatibleEsm(String fibreTrunkIncompatibleEsm) {
    this.fibreTrunkIncompatibleEsm = fibreTrunkIncompatibleEsm;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_DRIVE_SLOT_LIMIT_NOT_COMPLIANT.
   **/
  public FailureTypeEntry driveSlotLimitFeature(FeatureState driveSlotLimitFeature) {
    this.driveSlotLimitFeature = driveSlotLimitFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_DRIVE_SLOT_LIMIT_NOT_COMPLIANT.")
  @JsonProperty("driveSlotLimitFeature")
  public FeatureState getDriveSlotLimitFeature() {
    return driveSlotLimitFeature;
  }
  
  public void setDriveSlotLimitFeature(FeatureState driveSlotLimitFeature) {
    this.driveSlotLimitFeature = driveSlotLimitFeature;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_SECURITY_GET_NEW_KEY.
   **/
  public FailureTypeEntry newKeySequence(Integer newKeySequence) {
    this.newKeySequence = newKeySequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_SECURITY_GET_NEW_KEY.")
  @JsonProperty("newKeySequence")
  public Integer getNewKeySequence() {
    return newKeySequence;
  }
  
  public void setNewKeySequence(Integer newKeySequence) {
    this.newKeySequence = newKeySequence;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_EXTERNAL_KMS_NOT_COMPLIANT.
   **/
  public FailureTypeEntry fdeProxyKeyMgmtFeature(FeatureState fdeProxyKeyMgmtFeature) {
    this.fdeProxyKeyMgmtFeature = fdeProxyKeyMgmtFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_EXTERNAL_KMS_NOT_COMPLIANT.")
  @JsonProperty("fdeProxyKeyMgmtFeature")
  public FeatureState getFdeProxyKeyMgmtFeature() {
    return fdeProxyKeyMgmtFeature;
  }
  
  public void setFdeProxyKeyMgmtFeature(FeatureState fdeProxyKeyMgmtFeature) {
    this.fdeProxyKeyMgmtFeature = fdeProxyKeyMgmtFeature;
  }

  
  /**
   * This field is present only if the value of the RecoveryFailureType entry is equal to REC_SBB_VALIDATION_FAILURE. It contains the identification of the component that failed validation.
   **/
  public FailureTypeEntry sbbValidationFailure(String sbbValidationFailure) {
    this.sbbValidationFailure = sbbValidationFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of the RecoveryFailureType entry is equal to REC_SBB_VALIDATION_FAILURE. It contains the identification of the component that failed validation.")
  @JsonProperty("sbbValidationFailure")
  public String getSbbValidationFailure() {
    return sbbValidationFailure;
  }
  
  public void setSbbValidationFailure(String sbbValidationFailure) {
    this.sbbValidationFailure = sbbValidationFailure;
  }

  
  /**
   * This field is present only if the value of the RecoveryFailureType entry is equal to REC_INVALID_POWER_SUPPLY. It is a reference to a power supply that has failed validation.
   **/
  public FailureTypeEntry powerSupplyInvalid(String powerSupplyInvalid) {
    this.powerSupplyInvalid = powerSupplyInvalid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of the RecoveryFailureType entry is equal to REC_INVALID_POWER_SUPPLY. It is a reference to a power supply that has failed validation.")
  @JsonProperty("powerSupplyInvalid")
  public String getPowerSupplyInvalid() {
    return powerSupplyInvalid;
  }
  
  public void setPowerSupplyInvalid(String powerSupplyInvalid) {
    this.powerSupplyInvalid = powerSupplyInvalid;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_ENCLOSURE_THERMAL_SHUTDOWN. It contains the identification of the tray that is powering down due to an over-temperature or under-temperature threshold condition.
   **/
  public FailureTypeEntry enclosureThermalShutdown(String enclosureThermalShutdown) {
    this.enclosureThermalShutdown = enclosureThermalShutdown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_ENCLOSURE_THERMAL_SHUTDOWN. It contains the identification of the tray that is powering down due to an over-temperature or under-temperature threshold condition.")
  @JsonProperty("enclosureThermalShutdown")
  public String getEnclosureThermalShutdown() {
    return enclosureThermalShutdown;
  }
  
  public void setEnclosureThermalShutdown(String enclosureThermalShutdown) {
    this.enclosureThermalShutdown = enclosureThermalShutdown;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_UNSUPPORTED_PROTOCOL_CONNECTION. It identifies the drive using an unsupported protocol connection.
   **/
  public FailureTypeEntry unsupportedProtocolConnection(String unsupportedProtocolConnection) {
    this.unsupportedProtocolConnection = unsupportedProtocolConnection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_UNSUPPORTED_PROTOCOL_CONNECTION. It identifies the drive using an unsupported protocol connection.")
  @JsonProperty("unsupportedProtocolConnection")
  public String getUnsupportedProtocolConnection() {
    return unsupportedProtocolConnection;
  }
  
  public void setUnsupportedProtocolConnection(String unsupportedProtocolConnection) {
    this.unsupportedProtocolConnection = unsupportedProtocolConnection;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_FAILED_TWI_BUS. It contains a reference to the tray with a failed TWI bus.
   **/
  public FailureTypeEntry twiBusFailed(String twiBusFailed) {
    this.twiBusFailed = twiBusFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_FAILED_TWI_BUS. It contains a reference to the tray with a failed TWI bus.")
  @JsonProperty("twiBusFailed")
  public String getTwiBusFailed() {
    return twiBusFailed;
  }
  
  public void setTwiBusFailed(String twiBusFailed) {
    this.twiBusFailed = twiBusFailed;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_MISMATCHED_MIDPLANE_EEPROMS. It contains a reference to the tray in which the midplane EEPROMs are mismatched.
   **/
  public FailureTypeEntry mismatchedEepromContents(String mismatchedEepromContents) {
    this.mismatchedEepromContents = mismatchedEepromContents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_MISMATCHED_MIDPLANE_EEPROMS. It contains a reference to the tray in which the midplane EEPROMs are mismatched.")
  @JsonProperty("mismatchedEepromContents")
  public String getMismatchedEepromContents() {
    return mismatchedEepromContents;
  }
  
  public void setMismatchedEepromContents(String mismatchedEepromContents) {
    this.mismatchedEepromContents = mismatchedEepromContents;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_UNSUPPORTED_CAPACITY. It contains a reference to the drive with an unsupported capacity.
   **/
  public FailureTypeEntry unsupportedCapacityDrive(String unsupportedCapacityDrive) {
    this.unsupportedCapacityDrive = unsupportedCapacityDrive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_UNSUPPORTED_CAPACITY. It contains a reference to the drive with an unsupported capacity.")
  @JsonProperty("unsupportedCapacityDrive")
  public String getUnsupportedCapacityDrive() {
    return unsupportedCapacityDrive;
  }
  
  public void setUnsupportedCapacityDrive(String unsupportedCapacityDrive) {
    this.unsupportedCapacityDrive = unsupportedCapacityDrive;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_EVALUATION_LICENSE_EXPIRATION_IMMINENT.
   **/
  public FailureTypeEntry evalExpirationImminent(String evalExpirationImminent) {
    this.evalExpirationImminent = evalExpirationImminent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_EVALUATION_LICENSE_EXPIRATION_IMMINENT.")
  @JsonProperty("evalExpirationImminent")
  public String getEvalExpirationImminent() {
    return evalExpirationImminent;
  }
  
  public void setEvalExpirationImminent(String evalExpirationImminent) {
    this.evalExpirationImminent = evalExpirationImminent;
  }

  
  /**
   * Obsolete. This field is present only if the value of RecoveryFailureType value is equal to REC_EXTERNAL_KMS_KEY_INVALID.
   **/
  public FailureTypeEntry keyInvalid(String keyInvalid) {
    this.keyInvalid = keyInvalid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Obsolete. This field is present only if the value of RecoveryFailureType value is equal to REC_EXTERNAL_KMS_KEY_INVALID.")
  @JsonProperty("keyInvalid")
  public String getKeyInvalid() {
    return keyInvalid;
  }
  
  public void setKeyInvalid(String keyInvalid) {
    this.keyInvalid = keyInvalid;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_MULTIPLE_MISMATCHED_KEY_IDS_FOUND.
   **/
  public FailureTypeEntry multipleMismatchedKeys(String multipleMismatchedKeys) {
    this.multipleMismatchedKeys = multipleMismatchedKeys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_MULTIPLE_MISMATCHED_KEY_IDS_FOUND.")
  @JsonProperty("multipleMismatchedKeys")
  public String getMultipleMismatchedKeys() {
    return multipleMismatchedKeys;
  }
  
  public void setMultipleMismatchedKeys(String multipleMismatchedKeys) {
    this.multipleMismatchedKeys = multipleMismatchedKeys;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_SECURITY_KEY_VALIDATION_LOCK. It identifies a controller that will no longer accept key validation requests.
   **/
  public FailureTypeEntry keyValidationLock(String keyValidationLock) {
    this.keyValidationLock = keyValidationLock;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_SECURITY_KEY_VALIDATION_LOCK. It identifies a controller that will no longer accept key validation requests.")
  @JsonProperty("keyValidationLock")
  public String getKeyValidationLock() {
    return keyValidationLock;
  }
  
  public void setKeyValidationLock(String keyValidationLock) {
    this.keyValidationLock = keyValidationLock;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_CACHE_DATA_LOSS. It identifies a controller that has lost data in cache; along with a list of volumes that are offline as a result.
   **/
  public FailureTypeEntry cacheDataLoss(ControllerVolumeList cacheDataLoss) {
    this.cacheDataLoss = cacheDataLoss;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_CACHE_DATA_LOSS. It identifies a controller that has lost data in cache; along with a list of volumes that are offline as a result.")
  @JsonProperty("cacheDataLoss")
  public ControllerVolumeList getCacheDataLoss() {
    return cacheDataLoss;
  }
  
  public void setCacheDataLoss(ControllerVolumeList cacheDataLoss) {
    this.cacheDataLoss = cacheDataLoss;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_FEATURE_NOT_COMPLIANT. It identifies the feature that is out of compliance..
   **/
  public FailureTypeEntry featureOutOfCompliance(String featureOutOfCompliance) {
    this.featureOutOfCompliance = featureOutOfCompliance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_FEATURE_NOT_COMPLIANT. It identifies the feature that is out of compliance..")
  @JsonProperty("featureOutOfCompliance")
  public String getFeatureOutOfCompliance() {
    return featureOutOfCompliance;
  }
  
  public void setFeatureOutOfCompliance(String featureOutOfCompliance) {
    this.featureOutOfCompliance = featureOutOfCompliance;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_INCOMPATIBLE_PI_TYPE. It identifies the drive that is incompatible.
   **/
  public FailureTypeEntry driveIncompatiblePItype(String driveIncompatiblePItype) {
    this.driveIncompatiblePItype = driveIncompatiblePItype;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_INCOMPATIBLE_PI_TYPE. It identifies the drive that is incompatible.")
  @JsonProperty("driveIncompatiblePItype")
  public String getDriveIncompatiblePItype() {
    return driveIncompatiblePItype;
  }
  
  public void setDriveIncompatiblePItype(String driveIncompatiblePItype) {
    this.driveIncompatiblePItype = driveIncompatiblePItype;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_DRAWER_DEGRADED. It identifies the degraded drawer.
   **/
  public FailureTypeEntry degradedDrawerRef(String degradedDrawerRef) {
    this.degradedDrawerRef = degradedDrawerRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_DRAWER_DEGRADED. It identifies the degraded drawer.")
  @JsonProperty("degradedDrawerRef")
  public String getDegradedDrawerRef() {
    return degradedDrawerRef;
  }
  
  public void setDegradedDrawerRef(String degradedDrawerRef) {
    this.degradedDrawerRef = degradedDrawerRef;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_IOC_DIAG_FAIL. It identifies the controller that failed IOC diagnostic testing.
   **/
  public FailureTypeEntry ctlrIocDiagFailed(String ctlrIocDiagFailed) {
    this.ctlrIocDiagFailed = ctlrIocDiagFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_IOC_DIAG_FAIL. It identifies the controller that failed IOC diagnostic testing.")
  @JsonProperty("ctlrIocDiagFailed")
  public String getCtlrIocDiagFailed() {
    return ctlrIocDiagFailed;
  }
  
  public void setCtlrIocDiagFailed(String ctlrIocDiagFailed) {
    this.ctlrIocDiagFailed = ctlrIocDiagFailed;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_INVALID_SATA_FLASH_CONFIGURATION. It identifies a controller with an invalid SATA flash drive configuration.
   **/
  public FailureTypeEntry invalidSataFlashConfig(String invalidSataFlashConfig) {
    this.invalidSataFlashConfig = invalidSataFlashConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_INVALID_SATA_FLASH_CONFIGURATION. It identifies a controller with an invalid SATA flash drive configuration.")
  @JsonProperty("invalidSataFlashConfig")
  public String getInvalidSataFlashConfig() {
    return invalidSataFlashConfig;
  }
  
  public void setInvalidSataFlashConfig(String invalidSataFlashConfig) {
    this.invalidSataFlashConfig = invalidSataFlashConfig;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_OFFLINE_CTL_IOC_FAIL. It identifies the controller that failed IOC diagnostic testing and which is now offline.
   **/
  public FailureTypeEntry offlineCtlrIocDiagFailed(String offlineCtlrIocDiagFailed) {
    this.offlineCtlrIocDiagFailed = offlineCtlrIocDiagFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_OFFLINE_CTL_IOC_FAIL. It identifies the controller that failed IOC diagnostic testing and which is now offline.")
  @JsonProperty("offlineCtlrIocDiagFailed")
  public String getOfflineCtlrIocDiagFailed() {
    return offlineCtlrIocDiagFailed;
  }
  
  public void setOfflineCtlrIocDiagFailed(String offlineCtlrIocDiagFailed) {
    this.offlineCtlrIocDiagFailed = offlineCtlrIocDiagFailed;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_SAS_PHY_DISABLED_LOCAL_WIDE_PORT_DEGRADED. It identifies the channel.
   **/
  public FailureTypeEntry chanSasPhyDisabledLocalWidePortDegraded(Integer chanSasPhyDisabledLocalWidePortDegraded) {
    this.chanSasPhyDisabledLocalWidePortDegraded = chanSasPhyDisabledLocalWidePortDegraded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_SAS_PHY_DISABLED_LOCAL_WIDE_PORT_DEGRADED. It identifies the channel.")
  @JsonProperty("chanSasPhyDisabledLocalWidePortDegraded")
  public Integer getChanSasPhyDisabledLocalWidePortDegraded() {
    return chanSasPhyDisabledLocalWidePortDegraded;
  }
  
  public void setChanSasPhyDisabledLocalWidePortDegraded(Integer chanSasPhyDisabledLocalWidePortDegraded) {
    this.chanSasPhyDisabledLocalWidePortDegraded = chanSasPhyDisabledLocalWidePortDegraded;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_SAS_PHY_DISABLED_SHARED_WIDE_PORT_DEGRADED. It identifies the channel.
   **/
  public FailureTypeEntry chanSasPhyDisabledSharedWidePortDegraded(Integer chanSasPhyDisabledSharedWidePortDegraded) {
    this.chanSasPhyDisabledSharedWidePortDegraded = chanSasPhyDisabledSharedWidePortDegraded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_SAS_PHY_DISABLED_SHARED_WIDE_PORT_DEGRADED. It identifies the channel.")
  @JsonProperty("chanSasPhyDisabledSharedWidePortDegraded")
  public Integer getChanSasPhyDisabledSharedWidePortDegraded() {
    return chanSasPhyDisabledSharedWidePortDegraded;
  }
  
  public void setChanSasPhyDisabledSharedWidePortDegraded(Integer chanSasPhyDisabledSharedWidePortDegraded) {
    this.chanSasPhyDisabledSharedWidePortDegraded = chanSasPhyDisabledSharedWidePortDegraded;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_DRAWER_INVALID. It identifies the invalid (unsupported) drawer.
   **/
  public FailureTypeEntry drawerInvalid(String drawerInvalid) {
    this.drawerInvalid = drawerInvalid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_DRAWER_INVALID. It identifies the invalid (unsupported) drawer.")
  @JsonProperty("drawerInvalid")
  public String getDrawerInvalid() {
    return drawerInvalid;
  }
  
  public void setDrawerInvalid(String drawerInvalid) {
    this.drawerInvalid = drawerInvalid;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_DRAWER_REMOVED. It identifies the drawer that has been removed.
   **/
  public FailureTypeEntry drawerRemoved(String drawerRemoved) {
    this.drawerRemoved = drawerRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_DRAWER_REMOVED. It identifies the drawer that has been removed.")
  @JsonProperty("drawerRemoved")
  public String getDrawerRemoved() {
    return drawerRemoved;
  }
  
  public void setDrawerRemoved(String drawerRemoved) {
    this.drawerRemoved = drawerRemoved;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_UNSUPPORTED_INTERPOSER_FW_VERSION. It identifies a drive that has an unsupported interposer firmware version.
   **/
  public FailureTypeEntry driveUnsupportedInterposerFwVersion(String driveUnsupportedInterposerFwVersion) {
    this.driveUnsupportedInterposerFwVersion = driveUnsupportedInterposerFwVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_UNSUPPORTED_INTERPOSER_FW_VERSION. It identifies a drive that has an unsupported interposer firmware version.")
  @JsonProperty("driveUnsupportedInterposerFwVersion")
  public String getDriveUnsupportedInterposerFwVersion() {
    return driveUnsupportedInterposerFwVersion;
  }
  
  public void setDriveUnsupportedInterposerFwVersion(String driveUnsupportedInterposerFwVersion) {
    this.driveUnsupportedInterposerFwVersion = driveUnsupportedInterposerFwVersion;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_REDUNDANCY_GROUP_NOT_CONSISTENT_DURING_RECONFIG. It identifies a volume that has been taken offline due to the detection of an internal consistency problem. After the reconfiguration completes the data will be consistent, but may be corrupt.
   **/
  public FailureTypeEntry volumeOfflineDuringReconfig(String volumeOfflineDuringReconfig) {
    this.volumeOfflineDuringReconfig = volumeOfflineDuringReconfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_REDUNDANCY_GROUP_NOT_CONSISTENT_DURING_RECONFIG. It identifies a volume that has been taken offline due to the detection of an internal consistency problem. After the reconfiguration completes the data will be consistent, but may be corrupt.")
  @JsonProperty("volumeOfflineDuringReconfig")
  public String getVolumeOfflineDuringReconfig() {
    return volumeOfflineDuringReconfig;
  }
  
  public void setVolumeOfflineDuringReconfig(String volumeOfflineDuringReconfig) {
    this.volumeOfflineDuringReconfig = volumeOfflineDuringReconfig;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_SNAPSHOT_ROLLBACK_PAUSED. It is a reference to a snapshot that is currently paused.
   **/
  public FailureTypeEntry snapRollbackPaused(String snapRollbackPaused) {
    this.snapRollbackPaused = snapRollbackPaused;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_SNAPSHOT_ROLLBACK_PAUSED. It is a reference to a snapshot that is currently paused.")
  @JsonProperty("snapRollbackPaused")
  public String getSnapRollbackPaused() {
    return snapRollbackPaused;
  }
  
  public void setSnapRollbackPaused(String snapRollbackPaused) {
    this.snapRollbackPaused = snapRollbackPaused;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PIT_ROLLBACK_PAUSED. It contains a reference to the PiT Group with a paused rollback operation.
   **/
  public FailureTypeEntry pitRollbackPaused(String pitRollbackPaused) {
    this.pitRollbackPaused = pitRollbackPaused;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PIT_ROLLBACK_PAUSED. It contains a reference to the PiT Group with a paused rollback operation.")
  @JsonProperty("pitRollbackPaused")
  public String getPitRollbackPaused() {
    return pitRollbackPaused;
  }
  
  public void setPitRollbackPaused(String pitRollbackPaused) {
    this.pitRollbackPaused = pitRollbackPaused;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PIT_GROUP_REPOSITORY_OVER_THRESHOLD. It contains a reference to a PiT Group with a repository capacity over the warning threshold.
   **/
  public FailureTypeEntry pitGroupOverWarnThreshold(String pitGroupOverWarnThreshold) {
    this.pitGroupOverWarnThreshold = pitGroupOverWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PIT_GROUP_REPOSITORY_OVER_THRESHOLD. It contains a reference to a PiT Group with a repository capacity over the warning threshold.")
  @JsonProperty("pitGroupOverWarnThreshold")
  public String getPitGroupOverWarnThreshold() {
    return pitGroupOverWarnThreshold;
  }
  
  public void setPitGroupOverWarnThreshold(String pitGroupOverWarnThreshold) {
    this.pitGroupOverWarnThreshold = pitGroupOverWarnThreshold;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PIT_VIEW_REPOSITORY_OVER_THRESHOLD. It contains a reference to a PiT View with a repository over the warning threshold.
   **/
  public FailureTypeEntry pitViewOverWarnThreshold(String pitViewOverWarnThreshold) {
    this.pitViewOverWarnThreshold = pitViewOverWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PIT_VIEW_REPOSITORY_OVER_THRESHOLD. It contains a reference to a PiT View with a repository over the warning threshold.")
  @JsonProperty("pitViewOverWarnThreshold")
  public String getPitViewOverWarnThreshold() {
    return pitViewOverWarnThreshold;
  }
  
  public void setPitViewOverWarnThreshold(String pitViewOverWarnThreshold) {
    this.pitViewOverWarnThreshold = pitViewOverWarnThreshold;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PIT_GROUP_REPOSITORY_FULL. It contains a reference to a PiT Group with a full repository.
   **/
  public FailureTypeEntry pitGroupRepositoryFull(String pitGroupRepositoryFull) {
    this.pitGroupRepositoryFull = pitGroupRepositoryFull;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PIT_GROUP_REPOSITORY_FULL. It contains a reference to a PiT Group with a full repository.")
  @JsonProperty("pitGroupRepositoryFull")
  public String getPitGroupRepositoryFull() {
    return pitGroupRepositoryFull;
  }
  
  public void setPitGroupRepositoryFull(String pitGroupRepositoryFull) {
    this.pitGroupRepositoryFull = pitGroupRepositoryFull;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PIT_VIEW_REPOSITORY_FULL. It contains a reference to a PiT View with a full repository.
   **/
  public FailureTypeEntry pitViewRepositoryFull(String pitViewRepositoryFull) {
    this.pitViewRepositoryFull = pitViewRepositoryFull;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PIT_VIEW_REPOSITORY_FULL. It contains a reference to a PiT View with a full repository.")
  @JsonProperty("pitViewRepositoryFull")
  public String getPitViewRepositoryFull() {
    return pitViewRepositoryFull;
  }
  
  public void setPitViewRepositoryFull(String pitViewRepositoryFull) {
    this.pitViewRepositoryFull = pitViewRepositoryFull;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PIT_GROUP_FAILED. It contains a reference to a PiT Group that has failed.
   **/
  public FailureTypeEntry pitGroupFailed(String pitGroupFailed) {
    this.pitGroupFailed = pitGroupFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PIT_GROUP_FAILED. It contains a reference to a PiT Group that has failed.")
  @JsonProperty("pitGroupFailed")
  public String getPitGroupFailed() {
    return pitGroupFailed;
  }
  
  public void setPitGroupFailed(String pitGroupFailed) {
    this.pitGroupFailed = pitGroupFailed;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PIT_VIEW_FAILED. It contains a reference to a PiT View that has failed.
   **/
  public FailureTypeEntry pitViewFailed(String pitViewFailed) {
    this.pitViewFailed = pitViewFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PIT_VIEW_FAILED. It contains a reference to a PiT View that has failed.")
  @JsonProperty("pitViewFailed")
  public String getPitViewFailed() {
    return pitViewFailed;
  }
  
  public void setPitViewFailed(String pitViewFailed) {
    this.pitViewFailed = pitViewFailed;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_PIT_PURGED. It contains a reference to a PiT that has been purged to free PiT group repository capacity.
   **/
  public FailureTypeEntry pitPurged(String pitPurged) {
    this.pitPurged = pitPurged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_PIT_PURGED. It contains a reference to a PiT that has been purged to free PiT group repository capacity.")
  @JsonProperty("pitPurged")
  public String getPitPurged() {
    return pitPurged;
  }
  
  public void setPitPurged(String pitPurged) {
    this.pitPurged = pitPurged;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_DEGRADED_MIRROR_GROUP. It contains information about a mirror group fault condition.
   **/
  public FailureTypeEntry degradedAsyncMirrorGroup(AsyncMirrorGroupFaultIndication degradedAsyncMirrorGroup) {
    this.degradedAsyncMirrorGroup = degradedAsyncMirrorGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_DEGRADED_MIRROR_GROUP. It contains information about a mirror group fault condition.")
  @JsonProperty("degradedAsyncMirrorGroup")
  public AsyncMirrorGroupFaultIndication getDegradedAsyncMirrorGroup() {
    return degradedAsyncMirrorGroup;
  }
  
  public void setDegradedAsyncMirrorGroup(AsyncMirrorGroupFaultIndication degradedAsyncMirrorGroup) {
    this.degradedAsyncMirrorGroup = degradedAsyncMirrorGroup;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_SYNC_INTERVAL_TIME_OVER_THRESHOLD. It contains information about a mirror group fault condition.
   **/
  public FailureTypeEntry syncIntervalTimeExceeded(AsyncMirrorGroupFaultIndication syncIntervalTimeExceeded) {
    this.syncIntervalTimeExceeded = syncIntervalTimeExceeded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_SYNC_INTERVAL_TIME_OVER_THRESHOLD. It contains information about a mirror group fault condition.")
  @JsonProperty("syncIntervalTimeExceeded")
  public AsyncMirrorGroupFaultIndication getSyncIntervalTimeExceeded() {
    return syncIntervalTimeExceeded;
  }
  
  public void setSyncIntervalTimeExceeded(AsyncMirrorGroupFaultIndication syncIntervalTimeExceeded) {
    this.syncIntervalTimeExceeded = syncIntervalTimeExceeded;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_FAILED_MIRROR. It identifies the Async Mirror Group member that failed.
   **/
  public FailureTypeEntry failedAsyncMirror(String failedAsyncMirror) {
    this.failedAsyncMirror = failedAsyncMirror;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_FAILED_MIRROR. It identifies the Async Mirror Group member that failed.")
  @JsonProperty("failedAsyncMirror")
  public String getFailedAsyncMirror() {
    return failedAsyncMirror;
  }
  
  public void setFailedAsyncMirror(String failedAsyncMirror) {
    this.failedAsyncMirror = failedAsyncMirror;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_REPOSITORY_OVER_WARN_THRESHOLD. It contains information about a mirror group member fault condition.
   **/
  public FailureTypeEntry asyncMirrorRepositoryOverWarnThreshold(AsyncMirrorGroupMemberFaultIndication asyncMirrorRepositoryOverWarnThreshold) {
    this.asyncMirrorRepositoryOverWarnThreshold = asyncMirrorRepositoryOverWarnThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_REPOSITORY_OVER_WARN_THRESHOLD. It contains information about a mirror group member fault condition.")
  @JsonProperty("asyncMirrorRepositoryOverWarnThreshold")
  public AsyncMirrorGroupMemberFaultIndication getAsyncMirrorRepositoryOverWarnThreshold() {
    return asyncMirrorRepositoryOverWarnThreshold;
  }
  
  public void setAsyncMirrorRepositoryOverWarnThreshold(AsyncMirrorGroupMemberFaultIndication asyncMirrorRepositoryOverWarnThreshold) {
    this.asyncMirrorRepositoryOverWarnThreshold = asyncMirrorRepositoryOverWarnThreshold;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_MIRROR_GROUP_ROLE_CONFLICT. It identifies the Async Mirror Group with a role conflict.
   **/
  public FailureTypeEntry roleConflictMirrorGroup(String roleConflictMirrorGroup) {
    this.roleConflictMirrorGroup = roleConflictMirrorGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_MIRROR_GROUP_ROLE_CONFLICT. It identifies the Async Mirror Group with a role conflict.")
  @JsonProperty("roleConflictMirrorGroup")
  public String getRoleConflictMirrorGroup() {
    return roleConflictMirrorGroup;
  }
  
  public void setRoleConflictMirrorGroup(String roleConflictMirrorGroup) {
    this.roleConflictMirrorGroup = roleConflictMirrorGroup;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_MIRROR_GROUP_RECOVERY_POINT_LOST. It identifies the Async Mirror Group that lost a recovery point.
   **/
  public FailureTypeEntry recoveryPointLostGroup(String recoveryPointLostGroup) {
    this.recoveryPointLostGroup = recoveryPointLostGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_MIRROR_GROUP_RECOVERY_POINT_LOST. It identifies the Async Mirror Group that lost a recovery point.")
  @JsonProperty("recoveryPointLostGroup")
  public String getRecoveryPointLostGroup() {
    return recoveryPointLostGroup;
  }
  
  public void setRecoveryPointLostGroup(String recoveryPointLostGroup) {
    this.recoveryPointLostGroup = recoveryPointLostGroup;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_INCOMPATIBLE_VOLUME_GROUP_SECURITY. It identifies the volume group with incompatible security.
   **/
  public FailureTypeEntry incompatibleVolumeGroupSecurity(String incompatibleVolumeGroupSecurity) {
    this.incompatibleVolumeGroupSecurity = incompatibleVolumeGroupSecurity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_INCOMPATIBLE_VOLUME_GROUP_SECURITY. It identifies the volume group with incompatible security.")
  @JsonProperty("incompatibleVolumeGroupSecurity")
  public String getIncompatibleVolumeGroupSecurity() {
    return incompatibleVolumeGroupSecurity;
  }
  
  public void setIncompatibleVolumeGroupSecurity(String incompatibleVolumeGroupSecurity) {
    this.incompatibleVolumeGroupSecurity = incompatibleVolumeGroupSecurity;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_ORPHAN_GROUP. It identifies the orphaned mirror group.
   **/
  public FailureTypeEntry orphanMirrorGroup(String orphanMirrorGroup) {
    this.orphanMirrorGroup = orphanMirrorGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_ORPHAN_GROUP. It identifies the orphaned mirror group.")
  @JsonProperty("orphanMirrorGroup")
  public String getOrphanMirrorGroup() {
    return orphanMirrorGroup;
  }
  
  public void setOrphanMirrorGroup(String orphanMirrorGroup) {
    this.orphanMirrorGroup = orphanMirrorGroup;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_ORPHAN_MEMBER. It identifies the orphaned member.
   **/
  public FailureTypeEntry orphanMirrorMember(String orphanMirrorMember) {
    this.orphanMirrorMember = orphanMirrorMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_ORPHAN_MEMBER. It identifies the orphaned member.")
  @JsonProperty("orphanMirrorMember")
  public String getOrphanMirrorMember() {
    return orphanMirrorMember;
  }
  
  public void setOrphanMirrorMember(String orphanMirrorMember) {
    this.orphanMirrorMember = orphanMirrorMember;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_PARTIALLY_PRESENT. It contains the identification of the Disk Pool that has transitioned to Partial state..
   **/
  public FailureTypeEntry diskPoolStatePartial(String diskPoolStatePartial) {
    this.diskPoolStatePartial = diskPoolStatePartial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_PARTIALLY_PRESENT. It contains the identification of the Disk Pool that has transitioned to Partial state..")
  @JsonProperty("diskPoolStatePartial")
  public String getDiskPoolStatePartial() {
    return diskPoolStatePartial;
  }
  
  public void setDiskPoolStatePartial(String diskPoolStatePartial) {
    this.diskPoolStatePartial = diskPoolStatePartial;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_INCOMPLETE. It contains the identification of the Disk Pool that has transitioned to Incomplete state.
   **/
  public FailureTypeEntry diskPoolStateIncomplete(String diskPoolStateIncomplete) {
    this.diskPoolStateIncomplete = diskPoolStateIncomplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_INCOMPLETE. It contains the identification of the Disk Pool that has transitioned to Incomplete state.")
  @JsonProperty("diskPoolStateIncomplete")
  public String getDiskPoolStateIncomplete() {
    return diskPoolStateIncomplete;
  }
  
  public void setDiskPoolStateIncomplete(String diskPoolStateIncomplete) {
    this.diskPoolStateIncomplete = diskPoolStateIncomplete;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_MISSING. It contains the identification of the Disk Pool that has transitioned to Missing state.
   **/
  public FailureTypeEntry diskPoolStateMissing(String diskPoolStateMissing) {
    this.diskPoolStateMissing = diskPoolStateMissing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_MISSING. It contains the identification of the Disk Pool that has transitioned to Missing state.")
  @JsonProperty("diskPoolStateMissing")
  public String getDiskPoolStateMissing() {
    return diskPoolStateMissing;
  }
  
  public void setDiskPoolStateMissing(String diskPoolStateMissing) {
    this.diskPoolStateMissing = diskPoolStateMissing;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_RECONSTRUCTION_DRIVE_COUNT_BELOW_THRESHOLD. It contains the identification of the Disk Pool with space reserved for reconstructions that has fallen below the reconstruction reserved disk count value.
   **/
  public FailureTypeEntry diskPoolReconstruction(String diskPoolReconstruction) {
    this.diskPoolReconstruction = diskPoolReconstruction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_RECONSTRUCTION_DRIVE_COUNT_BELOW_THRESHOLD. It contains the identification of the Disk Pool with space reserved for reconstructions that has fallen below the reconstruction reserved disk count value.")
  @JsonProperty("diskPoolReconstruction")
  public String getDiskPoolReconstruction() {
    return diskPoolReconstruction;
  }
  
  public void setDiskPoolReconstruction(String diskPoolReconstruction) {
    this.diskPoolReconstruction = diskPoolReconstruction;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_UTILIZATION_WARNING. It contains the identification of the Disk Pool that has exceeded the Utilization Threshold Warning attribute.
   **/
  public FailureTypeEntry diskPoolUtilizationWarning(String diskPoolUtilizationWarning) {
    this.diskPoolUtilizationWarning = diskPoolUtilizationWarning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_UTILIZATION_WARNING. It contains the identification of the Disk Pool that has exceeded the Utilization Threshold Warning attribute.")
  @JsonProperty("diskPoolUtilizationWarning")
  public String getDiskPoolUtilizationWarning() {
    return diskPoolUtilizationWarning;
  }
  
  public void setDiskPoolUtilizationWarning(String diskPoolUtilizationWarning) {
    this.diskPoolUtilizationWarning = diskPoolUtilizationWarning;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_UTILIZATION_CRITICAL. It contains the identification of the Disk Pool that has exceeded the Utilization Threshold Critical attribute.
   **/
  public FailureTypeEntry diskPoolUtilizationCritical(String diskPoolUtilizationCritical) {
    this.diskPoolUtilizationCritical = diskPoolUtilizationCritical;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_UTILIZATION_CRITICAL. It contains the identification of the Disk Pool that has exceeded the Utilization Threshold Critical attribute.")
  @JsonProperty("diskPoolUtilizationCritical")
  public String getDiskPoolUtilizationCritical() {
    return diskPoolUtilizationCritical;
  }
  
  public void setDiskPoolUtilizationCritical(String diskPoolUtilizationCritical) {
    this.diskPoolUtilizationCritical = diskPoolUtilizationCritical;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_PENDING_PIT_CREATION_FAILED. It contains a reference to the PiT Group.
   **/
  public FailureTypeEntry pitGroupPendingCreateFailed(String pitGroupPendingCreateFailed) {
    this.pitGroupPendingCreateFailed = pitGroupPendingCreateFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_PENDING_PIT_CREATION_FAILED. It contains a reference to the PiT Group.")
  @JsonProperty("pitGroupPendingCreateFailed")
  public String getPitGroupPendingCreateFailed() {
    return pitGroupPendingCreateFailed;
  }
  
  public void setPitGroupPendingCreateFailed(String pitGroupPendingCreateFailed) {
    this.pitGroupPendingCreateFailed = pitGroupPendingCreateFailed;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_PENDING_CGPIT_CREATION_FAILED. It contains a reference to the PiT Consistency Group.
   **/
  public FailureTypeEntry cgPendingCreateFailed(String cgPendingCreateFailed) {
    this.cgPendingCreateFailed = cgPendingCreateFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_PENDING_CGPIT_CREATION_FAILED. It contains a reference to the PiT Consistency Group.")
  @JsonProperty("cgPendingCreateFailed")
  public String getCgPendingCreateFailed() {
    return cgPendingCreateFailed;
  }
  
  public void setCgPendingCreateFailed(String cgPendingCreateFailed) {
    this.cgPendingCreateFailed = cgPendingCreateFailed;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_TPV_REPOSITORY_OVER_THRESHOLD. It identifies a thin volume with a repository over the threshold value.
   **/
  public FailureTypeEntry thinVolumeOverThreshold(String thinVolumeOverThreshold) {
    this.thinVolumeOverThreshold = thinVolumeOverThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_TPV_REPOSITORY_OVER_THRESHOLD. It identifies a thin volume with a repository over the threshold value.")
  @JsonProperty("thinVolumeOverThreshold")
  public String getThinVolumeOverThreshold() {
    return thinVolumeOverThreshold;
  }
  
  public void setThinVolumeOverThreshold(String thinVolumeOverThreshold) {
    this.thinVolumeOverThreshold = thinVolumeOverThreshold;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_TPV_REPOSITORY_FULL. It identifies a thin volume with a full repository.
   **/
  public FailureTypeEntry thinVolumeRepositoryFull(String thinVolumeRepositoryFull) {
    this.thinVolumeRepositoryFull = thinVolumeRepositoryFull;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_TPV_REPOSITORY_FULL. It identifies a thin volume with a full repository.")
  @JsonProperty("thinVolumeRepositoryFull")
  public String getThinVolumeRepositoryFull() {
    return thinVolumeRepositoryFull;
  }
  
  public void setThinVolumeRepositoryFull(String thinVolumeRepositoryFull) {
    this.thinVolumeRepositoryFull = thinVolumeRepositoryFull;
  }

  
  /**
   * This field is present only if the value of recFailureType is equal to REC_TPV_FAILED. It identifies a thin volume that is in a failed state.
   **/
  public FailureTypeEntry thinVolumeFailed(String thinVolumeFailed) {
    this.thinVolumeFailed = thinVolumeFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of recFailureType is equal to REC_TPV_FAILED. It identifies a thin volume that is in a failed state.")
  @JsonProperty("thinVolumeFailed")
  public String getThinVolumeFailed() {
    return thinVolumeFailed;
  }
  
  public void setThinVolumeFailed(String thinVolumeFailed) {
    this.thinVolumeFailed = thinVolumeFailed;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_SECONDARY_REPOSITORY_FULL. It contains a reference to the secondary repository mirror member that has reached the full point.
   **/
  public FailureTypeEntry fullSecondaryRepositoryMirrorMember(String fullSecondaryRepositoryMirrorMember) {
    this.fullSecondaryRepositoryMirrorMember = fullSecondaryRepositoryMirrorMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_SECONDARY_REPOSITORY_FULL. It contains a reference to the secondary repository mirror member that has reached the full point.")
  @JsonProperty("fullSecondaryRepositoryMirrorMember")
  public String getFullSecondaryRepositoryMirrorMember() {
    return fullSecondaryRepositoryMirrorMember;
  }
  
  public void setFullSecondaryRepositoryMirrorMember(String fullSecondaryRepositoryMirrorMember) {
    this.fullSecondaryRepositoryMirrorMember = fullSecondaryRepositoryMirrorMember;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_SYNC_INTERNALLY_SUSPENDED. It identifies an async mirror group that has been suspended by the controller due to an error condition.
   **/
  public FailureTypeEntry suspendedMirrorGroup(String suspendedMirrorGroup) {
    this.suspendedMirrorGroup = suspendedMirrorGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_SYNC_INTERNALLY_SUSPENDED. It identifies an async mirror group that has been suspended by the controller due to an error condition.")
  @JsonProperty("suspendedMirrorGroup")
  public String getSuspendedMirrorGroup() {
    return suspendedMirrorGroup;
  }
  
  public void setSuspendedMirrorGroup(String suspendedMirrorGroup) {
    this.suspendedMirrorGroup = suspendedMirrorGroup;
  }

  
  /**
   * It contains metadata for the stable store database backup that is in recovery mode.
   **/
  public FailureTypeEntry databaseMetadata(DatabaseMetadata databaseMetadata) {
    this.databaseMetadata = databaseMetadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "It contains metadata for the stable store database backup that is in recovery mode.")
  @JsonProperty("databaseMetadata")
  public DatabaseMetadata getDatabaseMetadata() {
    return databaseMetadata;
  }
  
  public void setDatabaseMetadata(DatabaseMetadata databaseMetadata) {
    this.databaseMetadata = databaseMetadata;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_PRIMARY_REPOSITORY_FULL. It contains information about the primary repository mirror member that has reached the full point.
   **/
  public FailureTypeEntry fullPrimaryRepositoryMirrorMember(AsyncMirrorGroupMemberFaultIndication fullPrimaryRepositoryMirrorMember) {
    this.fullPrimaryRepositoryMirrorMember = fullPrimaryRepositoryMirrorMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_PRIMARY_REPOSITORY_FULL. It contains information about the primary repository mirror member that has reached the full point.")
  @JsonProperty("fullPrimaryRepositoryMirrorMember")
  public AsyncMirrorGroupMemberFaultIndication getFullPrimaryRepositoryMirrorMember() {
    return fullPrimaryRepositoryMirrorMember;
  }
  
  public void setFullPrimaryRepositoryMirrorMember(AsyncMirrorGroupMemberFaultIndication fullPrimaryRepositoryMirrorMember) {
    this.fullPrimaryRepositoryMirrorMember = fullPrimaryRepositoryMirrorMember;
  }

  
  /**
   * This field is present only if the value of the recFailureType is equal to REC_INCOMPATIBLE_SATA_DRIVE. It is a reference to a SATA drive that is incompatible because it does not support SMART Command Transfer (SCT) commands.
   **/
  public FailureTypeEntry sataSCTCmndUnsupported(String sataSCTCmndUnsupported) {
    this.sataSCTCmndUnsupported = sataSCTCmndUnsupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of the recFailureType is equal to REC_INCOMPATIBLE_SATA_DRIVE. It is a reference to a SATA drive that is incompatible because it does not support SMART Command Transfer (SCT) commands.")
  @JsonProperty("sataSCTCmndUnsupported")
  public String getSataSCTCmndUnsupported() {
    return sataSCTCmndUnsupported;
  }
  
  public void setSataSCTCmndUnsupported(String sataSCTCmndUnsupported) {
    this.sataSCTCmndUnsupported = sataSCTCmndUnsupported;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_CAPACITY_DEPLETED. It identifies the Disk Pool with depleted capacity.
   **/
  public FailureTypeEntry diskPoolCapacityDepleted(String diskPoolCapacityDepleted) {
    this.diskPoolCapacityDepleted = diskPoolCapacityDepleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_CAPACITY_DEPLETED. It identifies the Disk Pool with depleted capacity.")
  @JsonProperty("diskPoolCapacityDepleted")
  public String getDiskPoolCapacityDepleted() {
    return diskPoolCapacityDepleted;
  }
  
  public void setDiskPoolCapacityDepleted(String diskPoolCapacityDepleted) {
    this.diskPoolCapacityDepleted = diskPoolCapacityDepleted;
  }

  
  /**
   * This field is present only if the value of the recFailureType is equal to REC_DRIVE_INCOMPATIBLE_MODEL_NUMBER_UNSUPPORTED. It is a reference to a SATA drive that is incompatible because of the model number.
   **/
  public FailureTypeEntry driveModelNumberUnsupported(String driveModelNumberUnsupported) {
    this.driveModelNumberUnsupported = driveModelNumberUnsupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of the recFailureType is equal to REC_DRIVE_INCOMPATIBLE_MODEL_NUMBER_UNSUPPORTED. It is a reference to a SATA drive that is incompatible because of the model number.")
  @JsonProperty("driveModelNumberUnsupported")
  public String getDriveModelNumberUnsupported() {
    return driveModelNumberUnsupported;
  }
  
  public void setDriveModelNumberUnsupported(String driveModelNumberUnsupported) {
    this.driveModelNumberUnsupported = driveModelNumberUnsupported;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_FLASH_CACHE_NON_OPTIMAL_DRIVES.
   **/
  public FailureTypeEntry flashCacheNonOptimalDrives(FlashCacheRecoveryData flashCacheNonOptimalDrives) {
    this.flashCacheNonOptimalDrives = flashCacheNonOptimalDrives;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_FLASH_CACHE_NON_OPTIMAL_DRIVES.")
  @JsonProperty("flashCacheNonOptimalDrives")
  public FlashCacheRecoveryData getFlashCacheNonOptimalDrives() {
    return flashCacheNonOptimalDrives;
  }
  
  public void setFlashCacheNonOptimalDrives(FlashCacheRecoveryData flashCacheNonOptimalDrives) {
    this.flashCacheNonOptimalDrives = flashCacheNonOptimalDrives;
  }

  
  /**
   * This field is present if the RecoveryFailureType value is equal to REC_FLASH_CACHE_HOT_SPARE_IN_USE.
   **/
  public FailureTypeEntry flashCacheHotSpareInUse(FlashCacheRecoveryData flashCacheHotSpareInUse) {
    this.flashCacheHotSpareInUse = flashCacheHotSpareInUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present if the RecoveryFailureType value is equal to REC_FLASH_CACHE_HOT_SPARE_IN_USE.")
  @JsonProperty("flashCacheHotSpareInUse")
  public FlashCacheRecoveryData getFlashCacheHotSpareInUse() {
    return flashCacheHotSpareInUse;
  }
  
  public void setFlashCacheHotSpareInUse(FlashCacheRecoveryData flashCacheHotSpareInUse) {
    this.flashCacheHotSpareInUse = flashCacheHotSpareInUse;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ALL_DRIVES_BYPASSED_INCOMPATIBLE_NVSRAM. It identifies the controller in a Native SATA array that has a duplex NVSRAM setting and all drives appear as bypassed.
   **/
  public FailureTypeEntry nativeSATAIncompatibleNVSRAM(String nativeSATAIncompatibleNVSRAM) {
    this.nativeSATAIncompatibleNVSRAM = nativeSATAIncompatibleNVSRAM;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ALL_DRIVES_BYPASSED_INCOMPATIBLE_NVSRAM. It identifies the controller in a Native SATA array that has a duplex NVSRAM setting and all drives appear as bypassed.")
  @JsonProperty("nativeSATAIncompatibleNVSRAM")
  public String getNativeSATAIncompatibleNVSRAM() {
    return nativeSATAIncompatibleNVSRAM;
  }
  
  public void setNativeSATAIncompatibleNVSRAM(String nativeSATAIncompatibleNVSRAM) {
    this.nativeSATAIncompatibleNVSRAM = nativeSATAIncompatibleNVSRAM;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_DRIVE_FAILURE. It identifies the Disk Pool with at least one failed drive.
   **/
  public FailureTypeEntry diskPoolDriveFailure(String diskPoolDriveFailure) {
    this.diskPoolDriveFailure = diskPoolDriveFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_DRIVE_FAILURE. It identifies the Disk Pool with at least one failed drive.")
  @JsonProperty("diskPoolDriveFailure")
  public String getDiskPoolDriveFailure() {
    return diskPoolDriveFailure;
  }
  
  public void setDiskPoolDriveFailure(String diskPoolDriveFailure) {
    this.diskPoolDriveFailure = diskPoolDriveFailure;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_INSUFFICIENT_MEMORY. It identifies the controller where access to disk pool volumes is prohibited because of insufficient memory.
   **/
  public FailureTypeEntry diskPoolInsufficientMemory(String diskPoolInsufficientMemory) {
    this.diskPoolInsufficientMemory = diskPoolInsufficientMemory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_DISK_POOL_INSUFFICIENT_MEMORY. It identifies the controller where access to disk pool volumes is prohibited because of insufficient memory.")
  @JsonProperty("diskPoolInsufficientMemory")
  public String getDiskPoolInsufficientMemory() {
    return diskPoolInsufficientMemory;
  }
  
  public void setDiskPoolInsufficientMemory(String diskPoolInsufficientMemory) {
    this.diskPoolInsufficientMemory = diskPoolInsufficientMemory;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_ORPHAN_INCOMPLETE_MEMBER. It identifies the orphan incomplete async mirror group member.
   **/
  public FailureTypeEntry orphanIncompleteMember(String orphanIncompleteMember) {
    this.orphanIncompleteMember = orphanIncompleteMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_ORPHAN_INCOMPLETE_MEMBER. It identifies the orphan incomplete async mirror group member.")
  @JsonProperty("orphanIncompleteMember")
  public String getOrphanIncompleteMember() {
    return orphanIncompleteMember;
  }
  
  public void setOrphanIncompleteMember(String orphanIncompleteMember) {
    this.orphanIncompleteMember = orphanIncompleteMember;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_ARVM_SYNC_PAUSED_ALT_STATE. It identifies the AsyncMirrorGroup whose synchronization has been paused.
   **/
  public FailureTypeEntry pausedAltStateMirrorGroup(String pausedAltStateMirrorGroup) {
    this.pausedAltStateMirrorGroup = pausedAltStateMirrorGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_ARVM_SYNC_PAUSED_ALT_STATE. It identifies the AsyncMirrorGroup whose synchronization has been paused.")
  @JsonProperty("pausedAltStateMirrorGroup")
  public String getPausedAltStateMirrorGroup() {
    return pausedAltStateMirrorGroup;
  }
  
  public void setPausedAltStateMirrorGroup(String pausedAltStateMirrorGroup) {
    this.pausedAltStateMirrorGroup = pausedAltStateMirrorGroup;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType is equal to REC_ARVM_ROLE_CHANGE_PAUSED. It identifies the async mirror group that has had a role change pause due to issues with required data synchronization.
   **/
  public FailureTypeEntry pausedRoleChangeGroup(String pausedRoleChangeGroup) {
    this.pausedRoleChangeGroup = pausedRoleChangeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType is equal to REC_ARVM_ROLE_CHANGE_PAUSED. It identifies the async mirror group that has had a role change pause due to issues with required data synchronization.")
  @JsonProperty("pausedRoleChangeGroup")
  public String getPausedRoleChangeGroup() {
    return pausedRoleChangeGroup;
  }
  
  public void setPausedRoleChangeGroup(String pausedRoleChangeGroup) {
    this.pausedRoleChangeGroup = pausedRoleChangeGroup;
  }

  
  /**
   * This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_INCOMPATIBLE_ALIGNMENT_FOR_EMULATION_DRIVE. It identifies an emulation drive with an incompatible alignment.
   **/
  public FailureTypeEntry driveEmulationIncompatibleAlignment(String driveEmulationIncompatibleAlignment) {
    this.driveEmulationIncompatibleAlignment = driveEmulationIncompatibleAlignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the value of RecoveryFailureType value is equal to REC_DRIVE_INCOMPATIBLE_ALIGNMENT_FOR_EMULATION_DRIVE. It identifies an emulation drive with an incompatible alignment.")
  @JsonProperty("driveEmulationIncompatibleAlignment")
  public String getDriveEmulationIncompatibleAlignment() {
    return driveEmulationIncompatibleAlignment;
  }
  
  public void setDriveEmulationIncompatibleAlignment(String driveEmulationIncompatibleAlignment) {
    this.driveEmulationIncompatibleAlignment = driveEmulationIncompatibleAlignment;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_LOSS_OF_EXTERNAL_REDUNDANCY. It identifies drive channels that are not externally connected..
   **/
  public FailureTypeEntry redundancyFail(ExternalRedundancyFailure redundancyFail) {
    this.redundancyFail = redundancyFail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_LOSS_OF_EXTERNAL_REDUNDANCY. It identifies drive channels that are not externally connected..")
  @JsonProperty("redundancyFail")
  public ExternalRedundancyFailure getRedundancyFail() {
    return redundancyFail;
  }
  
  public void setRedundancyFail(ExternalRedundancyFailure redundancyFail) {
    this.redundancyFail = redundancyFail;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_RVM_WRITE_MODE_INCONSISTENT.
   **/
  public FailureTypeEntry mirrorProxyRef(String mirrorProxyRef) {
    this.mirrorProxyRef = mirrorProxyRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_RVM_WRITE_MODE_INCONSISTENT.")
  @JsonProperty("mirrorProxyRef")
  public String getMirrorProxyRef() {
    return mirrorProxyRef;
  }
  
  public void setMirrorProxyRef(String mirrorProxyRef) {
    this.mirrorProxyRef = mirrorProxyRef;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SAS_HOST_MISWIRE. It identifies the SAS port from which the miswire originates.
   **/
  public FailureTypeEntry miswiredSasHost(SasPort miswiredSasHost) {
    this.miswiredSasHost = miswiredSasHost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SAS_HOST_MISWIRE. It identifies the SAS port from which the miswire originates.")
  @JsonProperty("miswiredSasHost")
  public SasPort getMiswiredSasHost() {
    return miswiredSasHost;
  }
  
  public void setMiswiredSasHost(SasPort miswiredSasHost) {
    this.miswiredSasHost = miswiredSasHost;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SAS_CROSS_MISWIRE. It identifies the SAS port that has been disabled.
   **/
  public FailureTypeEntry miswiredSasCross(SasPort miswiredSasCross) {
    this.miswiredSasCross = miswiredSasCross;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SAS_CROSS_MISWIRE. It identifies the SAS port that has been disabled.")
  @JsonProperty("miswiredSasCross")
  public SasPort getMiswiredSasCross() {
    return miswiredSasCross;
  }
  
  public void setMiswiredSasCross(SasPort miswiredSasCross) {
    this.miswiredSasCross = miswiredSasCross;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_SAS_LOOP_MISWIRE. It identifies the SAS port that has been disabled.
   **/
  public FailureTypeEntry miswiredSasLoop(SasPort miswiredSasLoop) {
    this.miswiredSasLoop = miswiredSasLoop;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_SAS_LOOP_MISWIRE. It identifies the SAS port that has been disabled.")
  @JsonProperty("miswiredSasLoop")
  public SasPort getMiswiredSasLoop() {
    return miswiredSasLoop;
  }
  
  public void setMiswiredSasLoop(SasPort miswiredSasLoop) {
    this.miswiredSasLoop = miswiredSasLoop;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_COPY_THEN_FAIL_WAITING_ON_HOT_SPARE: A copy then fail operation is waiting on the user to identify a suitable hot spare drive.
   **/
  public FailureTypeEntry volGroupWaitingOnHotSpare(String volGroupWaitingOnHotSpare) {
    this.volGroupWaitingOnHotSpare = volGroupWaitingOnHotSpare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_COPY_THEN_FAIL_WAITING_ON_HOT_SPARE: A copy then fail operation is waiting on the user to identify a suitable hot spare drive.")
  @JsonProperty("volGroupWaitingOnHotSpare")
  public String getVolGroupWaitingOnHotSpare() {
    return volGroupWaitingOnHotSpare;
  }
  
  public void setVolGroupWaitingOnHotSpare(String volGroupWaitingOnHotSpare) {
    this.volGroupWaitingOnHotSpare = volGroupWaitingOnHotSpare;
  }

  
  /**
   * This recovery failure type includes a list of the drives that have gone missing. The drives in the list are identified as a collection of tray/slot combinations.
   **/
  public FailureTypeEntry missingAssignedDrives(List<TraySlot> missingAssignedDrives) {
    this.missingAssignedDrives = missingAssignedDrives;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This recovery failure type includes a list of the drives that have gone missing. The drives in the list are identified as a collection of tray/slot combinations.")
  @JsonProperty("missingAssignedDrives")
  public List<TraySlot> getMissingAssignedDrives() {
    return missingAssignedDrives;
  }
  
  public void setMissingAssignedDrives(List<TraySlot> missingAssignedDrives) {
    this.missingAssignedDrives = missingAssignedDrives;
  }

  
  /**
   **/
  public FailureTypeEntry diskPoolWaitingOnHotSpare(String diskPoolWaitingOnHotSpare) {
    this.diskPoolWaitingOnHotSpare = diskPoolWaitingOnHotSpare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("diskPoolWaitingOnHotSpare")
  public String getDiskPoolWaitingOnHotSpare() {
    return diskPoolWaitingOnHotSpare;
  }
  
  public void setDiskPoolWaitingOnHotSpare(String diskPoolWaitingOnHotSpare) {
    this.diskPoolWaitingOnHotSpare = diskPoolWaitingOnHotSpare;
  }

  
  /**
   * The controller has automatically gone into service mode due to the detection of a PI error.
   **/
  public FailureTypeEntry controllerInServiceMode(String controllerInServiceMode) {
    this.controllerInServiceMode = controllerInServiceMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The controller has automatically gone into service mode due to the detection of a PI error.")
  @JsonProperty("controllerInServiceMode")
  public String getControllerInServiceMode() {
    return controllerInServiceMode;
  }
  
  public void setControllerInServiceMode(String controllerInServiceMode) {
    this.controllerInServiceMode = controllerInServiceMode;
  }

  
  /**
   * The controller has gone into lockdown mode due to the detection of PI errors on all controllers in the array.
   **/
  public FailureTypeEntry controllerInLockdown(String controllerInLockdown) {
    this.controllerInLockdown = controllerInLockdown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The controller has gone into lockdown mode due to the detection of PI errors on all controllers in the array.")
  @JsonProperty("controllerInLockdown")
  public String getControllerInLockdown() {
    return controllerInLockdown;
  }
  
  public void setControllerInLockdown(String controllerInLockdown) {
    this.controllerInLockdown = controllerInLockdown;
  }

  
  /**
   * This data associated with the backend SAS channel to help diagnose the discovery error.
   **/
  public FailureTypeEntry discoveryErrorSasPort(SasPort discoveryErrorSasPort) {
    this.discoveryErrorSasPort = discoveryErrorSasPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This data associated with the backend SAS channel to help diagnose the discovery error.")
  @JsonProperty("discoveryErrorSasPort")
  public SasPort getDiscoveryErrorSasPort() {
    return discoveryErrorSasPort;
  }
  
  public void setDiscoveryErrorSasPort(SasPort discoveryErrorSasPort) {
    this.discoveryErrorSasPort = discoveryErrorSasPort;
  }

  
  /**
   * Provides details regarding an NTP resolution failure that is preventing the controller from updating its software clock
   **/
  public FailureTypeEntry ntpResolutionFailure(ControllerNtpErrorDetails ntpResolutionFailure) {
    this.ntpResolutionFailure = ntpResolutionFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides details regarding an NTP resolution failure that is preventing the controller from updating its software clock")
  @JsonProperty("ntpResolutionFailure")
  public ControllerNtpErrorDetails getNtpResolutionFailure() {
    return ntpResolutionFailure;
  }
  
  public void setNtpResolutionFailure(ControllerNtpErrorDetails ntpResolutionFailure) {
    this.ntpResolutionFailure = ntpResolutionFailure;
  }

  
  /**
   * Provides details regarding an NTP query failure that is preventing the controller from updating its software clock
   **/
  public FailureTypeEntry ntpQueryFailure(ControllerNtpErrorDetails ntpQueryFailure) {
    this.ntpQueryFailure = ntpQueryFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides details regarding an NTP query failure that is preventing the controller from updating its software clock")
  @JsonProperty("ntpQueryFailure")
  public ControllerNtpErrorDetails getNtpQueryFailure() {
    return ntpQueryFailure;
  }
  
  public void setNtpQueryFailure(ControllerNtpErrorDetails ntpQueryFailure) {
    this.ntpQueryFailure = ntpQueryFailure;
  }

  
  /**
   * Controller reporting the NTP Service failure
   **/
  public FailureTypeEntry ntpServiceFailureController(String ntpServiceFailureController) {
    this.ntpServiceFailureController = ntpServiceFailureController;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Controller reporting the NTP Service failure")
  @JsonProperty("ntpServiceFailureController")
  public String getNtpServiceFailureController() {
    return ntpServiceFailureController;
  }
  
  public void setNtpServiceFailureController(String ntpServiceFailureController) {
    this.ntpServiceFailureController = ntpServiceFailureController;
  }

  
  /**
   * This field is only present if the RecoveryFailureType value is equal to REC_MULTIPATH_CONFIGURATION_ERROR. This field contains a reference to the Host in the storage partitions topology that has the multipath configuration issue.
   **/
  public FailureTypeEntry misconfiguredHost(String misconfiguredHost) {
    this.misconfiguredHost = misconfiguredHost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the RecoveryFailureType value is equal to REC_MULTIPATH_CONFIGURATION_ERROR. This field contains a reference to the Host in the storage partitions topology that has the multipath configuration issue.")
  @JsonProperty("misconfiguredHost")
  public String getMisconfiguredHost() {
    return misconfiguredHost;
  }
  
  public void setMisconfiguredHost(String misconfiguredHost) {
    this.misconfiguredHost = misconfiguredHost;
  }

  
  /**
   * This field is only present if the RecoveryFailureType value is equal to REC_HOST_REDUNDANCY_LOST. This field conveys details about the connectivity loss, including indications of the specific host and controller that are not connected.
   **/
  public FailureTypeEntry hostRedundancyLossDetails(HostRedundancyLossDetails hostRedundancyLossDetails) {
    this.hostRedundancyLossDetails = hostRedundancyLossDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is only present if the RecoveryFailureType value is equal to REC_HOST_REDUNDANCY_LOST. This field conveys details about the connectivity loss, including indications of the specific host and controller that are not connected.")
  @JsonProperty("hostRedundancyLossDetails")
  public HostRedundancyLossDetails getHostRedundancyLossDetails() {
    return hostRedundancyLossDetails;
  }
  
  public void setHostRedundancyLossDetails(HostRedundancyLossDetails hostRedundancyLossDetails) {
    this.hostRedundancyLossDetails = hostRedundancyLossDetails;
  }

  
  /**
   * Excessive reboots have been detected -- return the controller ref in the Failure Type Entry.
   **/
  public FailureTypeEntry excessiveRebootsDetected(ExcessiveRebootsDetected excessiveRebootsDetected) {
    this.excessiveRebootsDetected = excessiveRebootsDetected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Excessive reboots have been detected -- return the controller ref in the Failure Type Entry.")
  @JsonProperty("excessiveRebootsDetected")
  public ExcessiveRebootsDetected getExcessiveRebootsDetected() {
    return excessiveRebootsDetected;
  }
  
  public void setExcessiveRebootsDetected(ExcessiveRebootsDetected excessiveRebootsDetected) {
    this.excessiveRebootsDetected = excessiveRebootsDetected;
  }

  
  /**
   * This field is present only if the RecoveryFailureType value is equal to REC_CACHE_NOT_FLUSHED_ON_ONLY_CTLR. It contains the identification of the controller that fails to flush dirty cache data on failed volume(s) possibly due to offlined drives. The controller should not be replaced to avoid loss of data.
   **/
  public FailureTypeEntry ctlrWithDirtyCacheNotFlushed(ControllerWithDirtyCacheDetails ctlrWithDirtyCacheNotFlushed) {
    this.ctlrWithDirtyCacheNotFlushed = ctlrWithDirtyCacheNotFlushed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is present only if the RecoveryFailureType value is equal to REC_CACHE_NOT_FLUSHED_ON_ONLY_CTLR. It contains the identification of the controller that fails to flush dirty cache data on failed volume(s) possibly due to offlined drives. The controller should not be replaced to avoid loss of data.")
  @JsonProperty("ctlrWithDirtyCacheNotFlushed")
  public ControllerWithDirtyCacheDetails getCtlrWithDirtyCacheNotFlushed() {
    return ctlrWithDirtyCacheNotFlushed;
  }
  
  public void setCtlrWithDirtyCacheNotFlushed(ControllerWithDirtyCacheDetails ctlrWithDirtyCacheNotFlushed) {
    this.ctlrWithDirtyCacheNotFlushed = ctlrWithDirtyCacheNotFlushed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureTypeEntry failureTypeEntry = (FailureTypeEntry) o;
    return Objects.equals(this.recFailureType, failureTypeEntry.recFailureType) &&
        Objects.equals(this.altCtlrBoardIdUnreadable, failureTypeEntry.altCtlrBoardIdUnreadable) &&
        Objects.equals(this.baseControllerDiagFailed, failureTypeEntry.baseControllerDiagFailed) &&
        Objects.equals(this.batteryConfigMismatch, failureTypeEntry.batteryConfigMismatch) &&
        Objects.equals(this.batteryWarn, failureTypeEntry.batteryWarn) &&
        Objects.equals(this.batteryTempWarn, failureTypeEntry.batteryTempWarn) &&
        Objects.equals(this.batteryStatUnknown, failureTypeEntry.batteryStatUnknown) &&
        Objects.equals(this.batteryCapacityWarn, failureTypeEntry.batteryCapacityWarn) &&
        Objects.equals(this.failedCacheBackupDevice, failureTypeEntry.failedCacheBackupDevice) &&
        Objects.equals(this.insufficientCacheBackupDeviceCapacity, failureTypeEntry.insufficientCacheBackupDeviceCapacity) &&
        Objects.equals(this.writeProtectedCacheBackupDevice, failureTypeEntry.writeProtectedCacheBackupDevice) &&
        Objects.equals(this.channelDegradedFailure, failureTypeEntry.channelDegradedFailure) &&
        Objects.equals(this.channelFailedFailure, failureTypeEntry.channelFailedFailure) &&
        Objects.equals(this.chanMiswire, failureTypeEntry.chanMiswire) &&
        Objects.equals(this.vpdEepromCorrupted, failureTypeEntry.vpdEepromCorrupted) &&
        Objects.equals(this.ctlMismatch, failureTypeEntry.ctlMismatch) &&
        Objects.equals(this.ctlMiswire, failureTypeEntry.ctlMiswire) &&
        Objects.equals(this.ddfDriveOtherVendor, failureTypeEntry.ddfDriveOtherVendor) &&
        Objects.equals(this.failedDedicatedMirrorChannel, failureTypeEntry.failedDedicatedMirrorChannel) &&
        Objects.equals(this.degradedHostBoard, failureTypeEntry.degradedHostBoard) &&
        Objects.equals(this.volDegraded, failureTypeEntry.volDegraded) &&
        Objects.equals(this.drvBypassCauseUnknown, failureTypeEntry.drvBypassCauseUnknown) &&
        Objects.equals(this.driveBypassedSinglePort, failureTypeEntry.driveBypassedSinglePort) &&
        Objects.equals(this.speedMismatchDrive, failureTypeEntry.speedMismatchDrive) &&
        Objects.equals(this.incompatibleDownRevDacstoreDriveRef, failureTypeEntry.incompatibleDownRevDacstoreDriveRef) &&
        Objects.equals(this.mixedDriveEnclosureMiswire, failureTypeEntry.mixedDriveEnclosureMiswire) &&
        Objects.equals(this.incompatibleSectorSizeDriveRef, failureTypeEntry.incompatibleSectorSizeDriveRef) &&
        Objects.equals(this.incompatibleUpRevDacstoreDriveRef, failureTypeEntry.incompatibleUpRevDacstoreDriveRef) &&
        Objects.equals(this.driveTrayExpansionFeature, failureTypeEntry.driveTrayExpansionFeature) &&
        Objects.equals(this.driveTraysNotGroupedTogether, failureTypeEntry.driveTraysNotGroupedTogether) &&
        Objects.equals(this.misconfiguredEnclosure, failureTypeEntry.misconfiguredEnclosure) &&
        Objects.equals(this.trayCodeMismatch, failureTypeEntry.trayCodeMismatch) &&
        Objects.equals(this.esmFactoryDefaultsMismatch, failureTypeEntry.esmFactoryDefaultsMismatch) &&
        Objects.equals(this.trayHardwareMismatch, failureTypeEntry.trayHardwareMismatch) &&
        Objects.equals(this.esmMiswire, failureTypeEntry.esmMiswire) &&
        Objects.equals(this.esmStatUnknown, failureTypeEntry.esmStatUnknown) &&
        Objects.equals(this.batteryExpired, failureTypeEntry.batteryExpired) &&
        Objects.equals(this.integratedBatteryExpired, failureTypeEntry.integratedBatteryExpired) &&
        Objects.equals(this.batteryFail, failureTypeEntry.batteryFail) &&
        Objects.equals(this.batterySystemFail, failureTypeEntry.batterySystemFail) &&
        Objects.equals(this.discreteLineFail, failureTypeEntry.discreteLineFail) &&
        Objects.equals(this.driveFail, failureTypeEntry.driveFail) &&
        Objects.equals(this.chFail, failureTypeEntry.chFail) &&
        Objects.equals(this.esmFail, failureTypeEntry.esmFail) &&
        Objects.equals(this.fanFail, failureTypeEntry.fanFail) &&
        Objects.equals(this.vpdI2cFailure, failureTypeEntry.vpdI2cFailure) &&
        Objects.equals(this.iccCruFail, failureTypeEntry.iccCruFail) &&
        Objects.equals(this.miniHubFail, failureTypeEntry.miniHubFail) &&
        Objects.equals(this.volFailDuringModifyMultiRaid, failureTypeEntry.volFailDuringModifyMultiRaid) &&
        Objects.equals(this.volFailDuringModify, failureTypeEntry.volFailDuringModify) &&
        Objects.equals(this.powerSupplyFail, failureTypeEntry.powerSupplyFail) &&
        Objects.equals(this.supportCruFail, failureTypeEntry.supportCruFail) &&
        Objects.equals(this.transceiverModuleFailed, failureTypeEntry.transceiverModuleFailed) &&
        Objects.equals(this.volFail, failureTypeEntry.volFail) &&
        Objects.equals(this.volFailAwaitingInit, failureTypeEntry.volFailAwaitingInit) &&
        Objects.equals(this.volFailInterruptedWrite, failureTypeEntry.volFailInterruptedWrite) &&
        Objects.equals(this.volFailMultiRaid, failureTypeEntry.volFailMultiRaid) &&
        Objects.equals(this.fanStatUnknown, failureTypeEntry.fanStatUnknown) &&
        Objects.equals(this.foreignDriveHasInconsistentRole, failureTypeEntry.foreignDriveHasInconsistentRole) &&
        Objects.equals(this.foreignDriveInconsistent, failureTypeEntry.foreignDriveInconsistent) &&
        Objects.equals(this.foreignDriveRefersToNativeDrive, failureTypeEntry.foreignDriveRefersToNativeDrive) &&
        Objects.equals(this.ghostVolume, failureTypeEntry.ghostVolume) &&
        Objects.equals(this.goldkeyFeature, failureTypeEntry.goldkeyFeature) &&
        Objects.equals(this.failedHostBoard, failureTypeEntry.failedHostBoard) &&
        Objects.equals(this.hostBoardIdMismatch, failureTypeEntry.hostBoardIdMismatch) &&
        Objects.equals(this.hostBoardStatUnknown, failureTypeEntry.hostBoardStatUnknown) &&
        Objects.equals(this.missingHotSpareDriveRef, failureTypeEntry.missingHotSpareDriveRef) &&
        Objects.equals(this.iccCruStatUnknown, failureTypeEntry.iccCruStatUnknown) &&
        Objects.equals(this.iccMissing, failureTypeEntry.iccMissing) &&
        Objects.equals(this.volImpaired, failureTypeEntry.volImpaired) &&
        Objects.equals(this.driveFailImpendingHigh, failureTypeEntry.driveFailImpendingHigh) &&
        Objects.equals(this.driveFailImpendingLow, failureTypeEntry.driveFailImpendingLow) &&
        Objects.equals(this.driveFailImpendingMed, failureTypeEntry.driveFailImpendingMed) &&
        Objects.equals(this.incompatibleFailedLegacyDrive, failureTypeEntry.incompatibleFailedLegacyDrive) &&
        Objects.equals(this.ldFwVersionMismatch, failureTypeEntry.ldFwVersionMismatch) &&
        Objects.equals(this.legacyVgNotOptimal, failureTypeEntry.legacyVgNotOptimal) &&
        Objects.equals(this.linkSpeedDetectionError, failureTypeEntry.linkSpeedDetectionError) &&
        Objects.equals(this.linkSpeedMismatch, failureTypeEntry.linkSpeedMismatch) &&
        Objects.equals(this.driveRedundancyFailure, failureTypeEntry.driveRedundancyFailure) &&
        Objects.equals(this.esmRedundancyFailure, failureTypeEntry.esmRedundancyFailure) &&
        Objects.equals(this.trayRedundancyFailure, failureTypeEntry.trayRedundancyFailure) &&
        Objects.equals(this.maxTempWarn, failureTypeEntry.maxTempWarn) &&
        Objects.equals(this.memParityError, failureTypeEntry.memParityError) &&
        Objects.equals(this.metadataOffline, failureTypeEntry.metadataOffline) &&
        Objects.equals(this.minihubRef, failureTypeEntry.minihubRef) &&
        Objects.equals(this.dualMirrorPrimary, failureTypeEntry.dualMirrorPrimary) &&
        Objects.equals(this.dualMirrorSecondary, failureTypeEntry.dualMirrorSecondary) &&
        Objects.equals(this.mirrorUnsynchronized, failureTypeEntry.mirrorUnsynchronized) &&
        Objects.equals(this.mixeddrivetypesFeature, failureTypeEntry.mixeddrivetypesFeature) &&
        Objects.equals(this.nativeVgForeignDriveMutualRef, failureTypeEntry.nativeVgForeignDriveMutualRef) &&
        Objects.equals(this.nativeVgRefersToForeignDrive, failureTypeEntry.nativeVgRefersToForeignDrive) &&
        Objects.equals(this.networkSetupError, failureTypeEntry.networkSetupError) &&
        Objects.equals(this.nominalTempWarn, failureTypeEntry.nominalTempWarn) &&
        Objects.equals(this.nonFruBatteryWarn, failureTypeEntry.nonFruBatteryWarn) &&
        Objects.equals(this.nonFruBatteryFail, failureTypeEntry.nonFruBatteryFail) &&
        Objects.equals(this.nonFruBatteryRemoved, failureTypeEntry.nonFruBatteryRemoved) &&
        Objects.equals(this.nonPreferredPath, failureTypeEntry.nonPreferredPath) &&
        Objects.equals(this.offlineCtl, failureTypeEntry.offlineCtl) &&
        Objects.equals(this.volGroupOffline, failureTypeEntry.volGroupOffline) &&
        Objects.equals(this.spmFeature, failureTypeEntry.spmFeature) &&
        Objects.equals(this.passiveCtl, failureTypeEntry.passiveCtl) &&
        Objects.equals(this.pathDegradedFailure, failureTypeEntry.pathDegradedFailure) &&
        Objects.equals(this.performanceTierFeature, failureTypeEntry.performanceTierFeature) &&
        Objects.equals(this.powerSupplyStatUnknown, failureTypeEntry.powerSupplyStatUnknown) &&
        Objects.equals(this.procMemTooSmallForCache, failureTypeEntry.procMemTooSmallForCache) &&
        Objects.equals(this.raid6Feature, failureTypeEntry.raid6Feature) &&
        Objects.equals(this.incorrectSupportCru, failureTypeEntry.incorrectSupportCru) &&
        Objects.equals(this.remoteVolNoArray, failureTypeEntry.remoteVolNoArray) &&
        Objects.equals(this.remoteVolNoFabric, failureTypeEntry.remoteVolNoFabric) &&
        Objects.equals(this.remoteVolNoLUN, failureTypeEntry.remoteVolNoLUN) &&
        Objects.equals(this.remoteVolWWNChangeFailed, failureTypeEntry.remoteVolWWNChangeFailed) &&
        Objects.equals(this.alarmRemoved, failureTypeEntry.alarmRemoved) &&
        Objects.equals(this.batteryRemoved, failureTypeEntry.batteryRemoved) &&
        Objects.equals(this.batteryPackRemoved, failureTypeEntry.batteryPackRemoved) &&
        Objects.equals(this.esmRemoved, failureTypeEntry.esmRemoved) &&
        Objects.equals(this.fanRemoved, failureTypeEntry.fanRemoved) &&
        Objects.equals(this.iccCruRemoved, failureTypeEntry.iccCruRemoved) &&
        Objects.equals(this.powerSupplyRemoved, failureTypeEntry.powerSupplyRemoved) &&
        Objects.equals(this.supportCruRemoved, failureTypeEntry.supportCruRemoved) &&
        Objects.equals(this.tempSensorRemoved, failureTypeEntry.tempSensorRemoved) &&
        Objects.equals(this.replacedDriveWrongType, failureTypeEntry.replacedDriveWrongType) &&
        Objects.equals(this.repositoryFull, failureTypeEntry.repositoryFull) &&
        Objects.equals(this.repositoryOverThreshold, failureTypeEntry.repositoryOverThreshold) &&
        Objects.equals(this.rpaParityError, failureTypeEntry.rpaParityError) &&
        Objects.equals(this.rvmFeature, failureTypeEntry.rvmFeature) &&
        Objects.equals(this.degradedSasPort, failureTypeEntry.degradedSasPort) &&
        Objects.equals(this.failedSasPort, failureTypeEntry.failedSasPort) &&
        Objects.equals(this.miswiredSasPort, failureTypeEntry.miswiredSasPort) &&
        Objects.equals(this.snapFail, failureTypeEntry.snapFail) &&
        Objects.equals(this.snapshotFeature, failureTypeEntry.snapshotFeature) &&
        Objects.equals(this.speedNegError, failureTypeEntry.speedNegError) &&
        Objects.equals(this.submodelMismatch, failureTypeEntry.submodelMismatch) &&
        Objects.equals(this.submodelNotSet, failureTypeEntry.submodelNotSet) &&
        Objects.equals(this.submodelNotSupported, failureTypeEntry.submodelNotSupported) &&
        Objects.equals(this.supportCruNoInput, failureTypeEntry.supportCruNoInput) &&
        Objects.equals(this.supportCruStatUnknown, failureTypeEntry.supportCruStatUnknown) &&
        Objects.equals(this.tempSensorStatUnknown, failureTypeEntry.tempSensorStatUnknown) &&
        Objects.equals(this.transceiverModuleStatUnknown, failureTypeEntry.transceiverModuleStatUnknown) &&
        Objects.equals(this.trayIDConflicts, failureTypeEntry.trayIDConflicts) &&
        Objects.equals(this.trayIDMismatch, failureTypeEntry.trayIDMismatch) &&
        Objects.equals(this.driveUncertified, failureTypeEntry.driveUncertified) &&
        Objects.equals(this.esmUncertified, failureTypeEntry.esmUncertified) &&
        Objects.equals(this.cacheMemorySizeUnsupported, failureTypeEntry.cacheMemorySizeUnsupported) &&
        Objects.equals(this.unsupportedHostBoard, failureTypeEntry.unsupportedHostBoard) &&
        Objects.equals(this.miniHubUnsupported, failureTypeEntry.miniHubUnsupported) &&
        Objects.equals(this.unsupportedTray, failureTypeEntry.unsupportedTray) &&
        Objects.equals(this.upsOnBattery, failureTypeEntry.upsOnBattery) &&
        Objects.equals(this.usmDbFullError, failureTypeEntry.usmDbFullError) &&
        Objects.equals(this.usmExistError, failureTypeEntry.usmExistError) &&
        Objects.equals(this.vgCloned, failureTypeEntry.vgCloned) &&
        Objects.equals(this.vgDrivePartOfMultipleVgs, failureTypeEntry.vgDrivePartOfMultipleVgs) &&
        Objects.equals(this.vgHasDrivePartOfMultipleVgs, failureTypeEntry.vgHasDrivePartOfMultipleVgs) &&
        Objects.equals(this.failedVolumeCopy, failureTypeEntry.failedVolumeCopy) &&
        Objects.equals(this.volcopyFeature, failureTypeEntry.volcopyFeature) &&
        Objects.equals(this.incompleteVolumeGroupRef, failureTypeEntry.incompleteVolumeGroupRef) &&
        Objects.equals(this.missingVolumeGroupRef, failureTypeEntry.missingVolumeGroupRef) &&
        Objects.equals(this.partialPresentVolumeGroupRef, failureTypeEntry.partialPresentVolumeGroupRef) &&
        Objects.equals(this.volHotSpareInUse, failureTypeEntry.volHotSpareInUse) &&
        Objects.equals(this.hostRef, failureTypeEntry.hostRef) &&
        Objects.equals(this.securityKeyNeeded, failureTypeEntry.securityKeyNeeded) &&
        Objects.equals(this.fdeFeature, failureTypeEntry.fdeFeature) &&
        Objects.equals(this.removedCtrl, failureTypeEntry.removedCtrl) &&
        Objects.equals(this.driveUnsuccessIsolationRedunMismatch, failureTypeEntry.driveUnsuccessIsolationRedunMismatch) &&
        Objects.equals(this.driveThresExcdedMismatchCorrected, failureTypeEntry.driveThresExcdedMismatchCorrected) &&
        Objects.equals(this.inactiveHostPort, failureTypeEntry.inactiveHostPort) &&
        Objects.equals(this.inactiveInitiator, failureTypeEntry.inactiveInitiator) &&
        Objects.equals(this.protectionInformationFeature, failureTypeEntry.protectionInformationFeature) &&
        Objects.equals(this.protectionInformationNotSupported, failureTypeEntry.protectionInformationNotSupported) &&
        Objects.equals(this.driveCapacityInsufficient, failureTypeEntry.driveCapacityInsufficient) &&
        Objects.equals(this.openDrawerRef, failureTypeEntry.openDrawerRef) &&
        Objects.equals(this.failedDrawerRef, failureTypeEntry.failedDrawerRef) &&
        Objects.equals(this.driveRef, failureTypeEntry.driveRef) &&
        Objects.equals(this.solidStateDisksFeature, failureTypeEntry.solidStateDisksFeature) &&
        Objects.equals(this.fibreTrunkMiswire, failureTypeEntry.fibreTrunkMiswire) &&
        Objects.equals(this.fibreTrunkIncompatibleEsm, failureTypeEntry.fibreTrunkIncompatibleEsm) &&
        Objects.equals(this.driveSlotLimitFeature, failureTypeEntry.driveSlotLimitFeature) &&
        Objects.equals(this.newKeySequence, failureTypeEntry.newKeySequence) &&
        Objects.equals(this.fdeProxyKeyMgmtFeature, failureTypeEntry.fdeProxyKeyMgmtFeature) &&
        Objects.equals(this.sbbValidationFailure, failureTypeEntry.sbbValidationFailure) &&
        Objects.equals(this.powerSupplyInvalid, failureTypeEntry.powerSupplyInvalid) &&
        Objects.equals(this.enclosureThermalShutdown, failureTypeEntry.enclosureThermalShutdown) &&
        Objects.equals(this.unsupportedProtocolConnection, failureTypeEntry.unsupportedProtocolConnection) &&
        Objects.equals(this.twiBusFailed, failureTypeEntry.twiBusFailed) &&
        Objects.equals(this.mismatchedEepromContents, failureTypeEntry.mismatchedEepromContents) &&
        Objects.equals(this.unsupportedCapacityDrive, failureTypeEntry.unsupportedCapacityDrive) &&
        Objects.equals(this.evalExpirationImminent, failureTypeEntry.evalExpirationImminent) &&
        Objects.equals(this.keyInvalid, failureTypeEntry.keyInvalid) &&
        Objects.equals(this.multipleMismatchedKeys, failureTypeEntry.multipleMismatchedKeys) &&
        Objects.equals(this.keyValidationLock, failureTypeEntry.keyValidationLock) &&
        Objects.equals(this.cacheDataLoss, failureTypeEntry.cacheDataLoss) &&
        Objects.equals(this.featureOutOfCompliance, failureTypeEntry.featureOutOfCompliance) &&
        Objects.equals(this.driveIncompatiblePItype, failureTypeEntry.driveIncompatiblePItype) &&
        Objects.equals(this.degradedDrawerRef, failureTypeEntry.degradedDrawerRef) &&
        Objects.equals(this.ctlrIocDiagFailed, failureTypeEntry.ctlrIocDiagFailed) &&
        Objects.equals(this.invalidSataFlashConfig, failureTypeEntry.invalidSataFlashConfig) &&
        Objects.equals(this.offlineCtlrIocDiagFailed, failureTypeEntry.offlineCtlrIocDiagFailed) &&
        Objects.equals(this.chanSasPhyDisabledLocalWidePortDegraded, failureTypeEntry.chanSasPhyDisabledLocalWidePortDegraded) &&
        Objects.equals(this.chanSasPhyDisabledSharedWidePortDegraded, failureTypeEntry.chanSasPhyDisabledSharedWidePortDegraded) &&
        Objects.equals(this.drawerInvalid, failureTypeEntry.drawerInvalid) &&
        Objects.equals(this.drawerRemoved, failureTypeEntry.drawerRemoved) &&
        Objects.equals(this.driveUnsupportedInterposerFwVersion, failureTypeEntry.driveUnsupportedInterposerFwVersion) &&
        Objects.equals(this.volumeOfflineDuringReconfig, failureTypeEntry.volumeOfflineDuringReconfig) &&
        Objects.equals(this.snapRollbackPaused, failureTypeEntry.snapRollbackPaused) &&
        Objects.equals(this.pitRollbackPaused, failureTypeEntry.pitRollbackPaused) &&
        Objects.equals(this.pitGroupOverWarnThreshold, failureTypeEntry.pitGroupOverWarnThreshold) &&
        Objects.equals(this.pitViewOverWarnThreshold, failureTypeEntry.pitViewOverWarnThreshold) &&
        Objects.equals(this.pitGroupRepositoryFull, failureTypeEntry.pitGroupRepositoryFull) &&
        Objects.equals(this.pitViewRepositoryFull, failureTypeEntry.pitViewRepositoryFull) &&
        Objects.equals(this.pitGroupFailed, failureTypeEntry.pitGroupFailed) &&
        Objects.equals(this.pitViewFailed, failureTypeEntry.pitViewFailed) &&
        Objects.equals(this.pitPurged, failureTypeEntry.pitPurged) &&
        Objects.equals(this.degradedAsyncMirrorGroup, failureTypeEntry.degradedAsyncMirrorGroup) &&
        Objects.equals(this.syncIntervalTimeExceeded, failureTypeEntry.syncIntervalTimeExceeded) &&
        Objects.equals(this.failedAsyncMirror, failureTypeEntry.failedAsyncMirror) &&
        Objects.equals(this.asyncMirrorRepositoryOverWarnThreshold, failureTypeEntry.asyncMirrorRepositoryOverWarnThreshold) &&
        Objects.equals(this.roleConflictMirrorGroup, failureTypeEntry.roleConflictMirrorGroup) &&
        Objects.equals(this.recoveryPointLostGroup, failureTypeEntry.recoveryPointLostGroup) &&
        Objects.equals(this.incompatibleVolumeGroupSecurity, failureTypeEntry.incompatibleVolumeGroupSecurity) &&
        Objects.equals(this.orphanMirrorGroup, failureTypeEntry.orphanMirrorGroup) &&
        Objects.equals(this.orphanMirrorMember, failureTypeEntry.orphanMirrorMember) &&
        Objects.equals(this.diskPoolStatePartial, failureTypeEntry.diskPoolStatePartial) &&
        Objects.equals(this.diskPoolStateIncomplete, failureTypeEntry.diskPoolStateIncomplete) &&
        Objects.equals(this.diskPoolStateMissing, failureTypeEntry.diskPoolStateMissing) &&
        Objects.equals(this.diskPoolReconstruction, failureTypeEntry.diskPoolReconstruction) &&
        Objects.equals(this.diskPoolUtilizationWarning, failureTypeEntry.diskPoolUtilizationWarning) &&
        Objects.equals(this.diskPoolUtilizationCritical, failureTypeEntry.diskPoolUtilizationCritical) &&
        Objects.equals(this.pitGroupPendingCreateFailed, failureTypeEntry.pitGroupPendingCreateFailed) &&
        Objects.equals(this.cgPendingCreateFailed, failureTypeEntry.cgPendingCreateFailed) &&
        Objects.equals(this.thinVolumeOverThreshold, failureTypeEntry.thinVolumeOverThreshold) &&
        Objects.equals(this.thinVolumeRepositoryFull, failureTypeEntry.thinVolumeRepositoryFull) &&
        Objects.equals(this.thinVolumeFailed, failureTypeEntry.thinVolumeFailed) &&
        Objects.equals(this.fullSecondaryRepositoryMirrorMember, failureTypeEntry.fullSecondaryRepositoryMirrorMember) &&
        Objects.equals(this.suspendedMirrorGroup, failureTypeEntry.suspendedMirrorGroup) &&
        Objects.equals(this.databaseMetadata, failureTypeEntry.databaseMetadata) &&
        Objects.equals(this.fullPrimaryRepositoryMirrorMember, failureTypeEntry.fullPrimaryRepositoryMirrorMember) &&
        Objects.equals(this.sataSCTCmndUnsupported, failureTypeEntry.sataSCTCmndUnsupported) &&
        Objects.equals(this.diskPoolCapacityDepleted, failureTypeEntry.diskPoolCapacityDepleted) &&
        Objects.equals(this.driveModelNumberUnsupported, failureTypeEntry.driveModelNumberUnsupported) &&
        Objects.equals(this.flashCacheNonOptimalDrives, failureTypeEntry.flashCacheNonOptimalDrives) &&
        Objects.equals(this.flashCacheHotSpareInUse, failureTypeEntry.flashCacheHotSpareInUse) &&
        Objects.equals(this.nativeSATAIncompatibleNVSRAM, failureTypeEntry.nativeSATAIncompatibleNVSRAM) &&
        Objects.equals(this.diskPoolDriveFailure, failureTypeEntry.diskPoolDriveFailure) &&
        Objects.equals(this.diskPoolInsufficientMemory, failureTypeEntry.diskPoolInsufficientMemory) &&
        Objects.equals(this.orphanIncompleteMember, failureTypeEntry.orphanIncompleteMember) &&
        Objects.equals(this.pausedAltStateMirrorGroup, failureTypeEntry.pausedAltStateMirrorGroup) &&
        Objects.equals(this.pausedRoleChangeGroup, failureTypeEntry.pausedRoleChangeGroup) &&
        Objects.equals(this.driveEmulationIncompatibleAlignment, failureTypeEntry.driveEmulationIncompatibleAlignment) &&
        Objects.equals(this.redundancyFail, failureTypeEntry.redundancyFail) &&
        Objects.equals(this.mirrorProxyRef, failureTypeEntry.mirrorProxyRef) &&
        Objects.equals(this.miswiredSasHost, failureTypeEntry.miswiredSasHost) &&
        Objects.equals(this.miswiredSasCross, failureTypeEntry.miswiredSasCross) &&
        Objects.equals(this.miswiredSasLoop, failureTypeEntry.miswiredSasLoop) &&
        Objects.equals(this.volGroupWaitingOnHotSpare, failureTypeEntry.volGroupWaitingOnHotSpare) &&
        Objects.equals(this.missingAssignedDrives, failureTypeEntry.missingAssignedDrives) &&
        Objects.equals(this.diskPoolWaitingOnHotSpare, failureTypeEntry.diskPoolWaitingOnHotSpare) &&
        Objects.equals(this.controllerInServiceMode, failureTypeEntry.controllerInServiceMode) &&
        Objects.equals(this.controllerInLockdown, failureTypeEntry.controllerInLockdown) &&
        Objects.equals(this.discoveryErrorSasPort, failureTypeEntry.discoveryErrorSasPort) &&
        Objects.equals(this.ntpResolutionFailure, failureTypeEntry.ntpResolutionFailure) &&
        Objects.equals(this.ntpQueryFailure, failureTypeEntry.ntpQueryFailure) &&
        Objects.equals(this.ntpServiceFailureController, failureTypeEntry.ntpServiceFailureController) &&
        Objects.equals(this.misconfiguredHost, failureTypeEntry.misconfiguredHost) &&
        Objects.equals(this.hostRedundancyLossDetails, failureTypeEntry.hostRedundancyLossDetails) &&
        Objects.equals(this.excessiveRebootsDetected, failureTypeEntry.excessiveRebootsDetected) &&
        Objects.equals(this.ctlrWithDirtyCacheNotFlushed, failureTypeEntry.ctlrWithDirtyCacheNotFlushed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recFailureType, altCtlrBoardIdUnreadable, baseControllerDiagFailed, batteryConfigMismatch, batteryWarn, batteryTempWarn, batteryStatUnknown, batteryCapacityWarn, failedCacheBackupDevice, insufficientCacheBackupDeviceCapacity, writeProtectedCacheBackupDevice, channelDegradedFailure, channelFailedFailure, chanMiswire, vpdEepromCorrupted, ctlMismatch, ctlMiswire, ddfDriveOtherVendor, failedDedicatedMirrorChannel, degradedHostBoard, volDegraded, drvBypassCauseUnknown, driveBypassedSinglePort, speedMismatchDrive, incompatibleDownRevDacstoreDriveRef, mixedDriveEnclosureMiswire, incompatibleSectorSizeDriveRef, incompatibleUpRevDacstoreDriveRef, driveTrayExpansionFeature, driveTraysNotGroupedTogether, misconfiguredEnclosure, trayCodeMismatch, esmFactoryDefaultsMismatch, trayHardwareMismatch, esmMiswire, esmStatUnknown, batteryExpired, integratedBatteryExpired, batteryFail, batterySystemFail, discreteLineFail, driveFail, chFail, esmFail, fanFail, vpdI2cFailure, iccCruFail, miniHubFail, volFailDuringModifyMultiRaid, volFailDuringModify, powerSupplyFail, supportCruFail, transceiverModuleFailed, volFail, volFailAwaitingInit, volFailInterruptedWrite, volFailMultiRaid, fanStatUnknown, foreignDriveHasInconsistentRole, foreignDriveInconsistent, foreignDriveRefersToNativeDrive, ghostVolume, goldkeyFeature, failedHostBoard, hostBoardIdMismatch, hostBoardStatUnknown, missingHotSpareDriveRef, iccCruStatUnknown, iccMissing, volImpaired, driveFailImpendingHigh, driveFailImpendingLow, driveFailImpendingMed, incompatibleFailedLegacyDrive, ldFwVersionMismatch, legacyVgNotOptimal, linkSpeedDetectionError, linkSpeedMismatch, driveRedundancyFailure, esmRedundancyFailure, trayRedundancyFailure, maxTempWarn, memParityError, metadataOffline, minihubRef, dualMirrorPrimary, dualMirrorSecondary, mirrorUnsynchronized, mixeddrivetypesFeature, nativeVgForeignDriveMutualRef, nativeVgRefersToForeignDrive, networkSetupError, nominalTempWarn, nonFruBatteryWarn, nonFruBatteryFail, nonFruBatteryRemoved, nonPreferredPath, offlineCtl, volGroupOffline, spmFeature, passiveCtl, pathDegradedFailure, performanceTierFeature, powerSupplyStatUnknown, procMemTooSmallForCache, raid6Feature, incorrectSupportCru, remoteVolNoArray, remoteVolNoFabric, remoteVolNoLUN, remoteVolWWNChangeFailed, alarmRemoved, batteryRemoved, batteryPackRemoved, esmRemoved, fanRemoved, iccCruRemoved, powerSupplyRemoved, supportCruRemoved, tempSensorRemoved, replacedDriveWrongType, repositoryFull, repositoryOverThreshold, rpaParityError, rvmFeature, degradedSasPort, failedSasPort, miswiredSasPort, snapFail, snapshotFeature, speedNegError, submodelMismatch, submodelNotSet, submodelNotSupported, supportCruNoInput, supportCruStatUnknown, tempSensorStatUnknown, transceiverModuleStatUnknown, trayIDConflicts, trayIDMismatch, driveUncertified, esmUncertified, cacheMemorySizeUnsupported, unsupportedHostBoard, miniHubUnsupported, unsupportedTray, upsOnBattery, usmDbFullError, usmExistError, vgCloned, vgDrivePartOfMultipleVgs, vgHasDrivePartOfMultipleVgs, failedVolumeCopy, volcopyFeature, incompleteVolumeGroupRef, missingVolumeGroupRef, partialPresentVolumeGroupRef, volHotSpareInUse, hostRef, securityKeyNeeded, fdeFeature, removedCtrl, driveUnsuccessIsolationRedunMismatch, driveThresExcdedMismatchCorrected, inactiveHostPort, inactiveInitiator, protectionInformationFeature, protectionInformationNotSupported, driveCapacityInsufficient, openDrawerRef, failedDrawerRef, driveRef, solidStateDisksFeature, fibreTrunkMiswire, fibreTrunkIncompatibleEsm, driveSlotLimitFeature, newKeySequence, fdeProxyKeyMgmtFeature, sbbValidationFailure, powerSupplyInvalid, enclosureThermalShutdown, unsupportedProtocolConnection, twiBusFailed, mismatchedEepromContents, unsupportedCapacityDrive, evalExpirationImminent, keyInvalid, multipleMismatchedKeys, keyValidationLock, cacheDataLoss, featureOutOfCompliance, driveIncompatiblePItype, degradedDrawerRef, ctlrIocDiagFailed, invalidSataFlashConfig, offlineCtlrIocDiagFailed, chanSasPhyDisabledLocalWidePortDegraded, chanSasPhyDisabledSharedWidePortDegraded, drawerInvalid, drawerRemoved, driveUnsupportedInterposerFwVersion, volumeOfflineDuringReconfig, snapRollbackPaused, pitRollbackPaused, pitGroupOverWarnThreshold, pitViewOverWarnThreshold, pitGroupRepositoryFull, pitViewRepositoryFull, pitGroupFailed, pitViewFailed, pitPurged, degradedAsyncMirrorGroup, syncIntervalTimeExceeded, failedAsyncMirror, asyncMirrorRepositoryOverWarnThreshold, roleConflictMirrorGroup, recoveryPointLostGroup, incompatibleVolumeGroupSecurity, orphanMirrorGroup, orphanMirrorMember, diskPoolStatePartial, diskPoolStateIncomplete, diskPoolStateMissing, diskPoolReconstruction, diskPoolUtilizationWarning, diskPoolUtilizationCritical, pitGroupPendingCreateFailed, cgPendingCreateFailed, thinVolumeOverThreshold, thinVolumeRepositoryFull, thinVolumeFailed, fullSecondaryRepositoryMirrorMember, suspendedMirrorGroup, databaseMetadata, fullPrimaryRepositoryMirrorMember, sataSCTCmndUnsupported, diskPoolCapacityDepleted, driveModelNumberUnsupported, flashCacheNonOptimalDrives, flashCacheHotSpareInUse, nativeSATAIncompatibleNVSRAM, diskPoolDriveFailure, diskPoolInsufficientMemory, orphanIncompleteMember, pausedAltStateMirrorGroup, pausedRoleChangeGroup, driveEmulationIncompatibleAlignment, redundancyFail, mirrorProxyRef, miswiredSasHost, miswiredSasCross, miswiredSasLoop, volGroupWaitingOnHotSpare, missingAssignedDrives, diskPoolWaitingOnHotSpare, controllerInServiceMode, controllerInLockdown, discoveryErrorSasPort, ntpResolutionFailure, ntpQueryFailure, ntpServiceFailureController, misconfiguredHost, hostRedundancyLossDetails, excessiveRebootsDetected, ctlrWithDirtyCacheNotFlushed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureTypeEntry {\n");
    
    sb.append("    recFailureType: ").append(toIndentedString(recFailureType)).append("\n");
    sb.append("    altCtlrBoardIdUnreadable: ").append(toIndentedString(altCtlrBoardIdUnreadable)).append("\n");
    sb.append("    baseControllerDiagFailed: ").append(toIndentedString(baseControllerDiagFailed)).append("\n");
    sb.append("    batteryConfigMismatch: ").append(toIndentedString(batteryConfigMismatch)).append("\n");
    sb.append("    batteryWarn: ").append(toIndentedString(batteryWarn)).append("\n");
    sb.append("    batteryTempWarn: ").append(toIndentedString(batteryTempWarn)).append("\n");
    sb.append("    batteryStatUnknown: ").append(toIndentedString(batteryStatUnknown)).append("\n");
    sb.append("    batteryCapacityWarn: ").append(toIndentedString(batteryCapacityWarn)).append("\n");
    sb.append("    failedCacheBackupDevice: ").append(toIndentedString(failedCacheBackupDevice)).append("\n");
    sb.append("    insufficientCacheBackupDeviceCapacity: ").append(toIndentedString(insufficientCacheBackupDeviceCapacity)).append("\n");
    sb.append("    writeProtectedCacheBackupDevice: ").append(toIndentedString(writeProtectedCacheBackupDevice)).append("\n");
    sb.append("    channelDegradedFailure: ").append(toIndentedString(channelDegradedFailure)).append("\n");
    sb.append("    channelFailedFailure: ").append(toIndentedString(channelFailedFailure)).append("\n");
    sb.append("    chanMiswire: ").append(toIndentedString(chanMiswire)).append("\n");
    sb.append("    vpdEepromCorrupted: ").append(toIndentedString(vpdEepromCorrupted)).append("\n");
    sb.append("    ctlMismatch: ").append(toIndentedString(ctlMismatch)).append("\n");
    sb.append("    ctlMiswire: ").append(toIndentedString(ctlMiswire)).append("\n");
    sb.append("    ddfDriveOtherVendor: ").append(toIndentedString(ddfDriveOtherVendor)).append("\n");
    sb.append("    failedDedicatedMirrorChannel: ").append(toIndentedString(failedDedicatedMirrorChannel)).append("\n");
    sb.append("    degradedHostBoard: ").append(toIndentedString(degradedHostBoard)).append("\n");
    sb.append("    volDegraded: ").append(toIndentedString(volDegraded)).append("\n");
    sb.append("    drvBypassCauseUnknown: ").append(toIndentedString(drvBypassCauseUnknown)).append("\n");
    sb.append("    driveBypassedSinglePort: ").append(toIndentedString(driveBypassedSinglePort)).append("\n");
    sb.append("    speedMismatchDrive: ").append(toIndentedString(speedMismatchDrive)).append("\n");
    sb.append("    incompatibleDownRevDacstoreDriveRef: ").append(toIndentedString(incompatibleDownRevDacstoreDriveRef)).append("\n");
    sb.append("    mixedDriveEnclosureMiswire: ").append(toIndentedString(mixedDriveEnclosureMiswire)).append("\n");
    sb.append("    incompatibleSectorSizeDriveRef: ").append(toIndentedString(incompatibleSectorSizeDriveRef)).append("\n");
    sb.append("    incompatibleUpRevDacstoreDriveRef: ").append(toIndentedString(incompatibleUpRevDacstoreDriveRef)).append("\n");
    sb.append("    driveTrayExpansionFeature: ").append(toIndentedString(driveTrayExpansionFeature)).append("\n");
    sb.append("    driveTraysNotGroupedTogether: ").append(toIndentedString(driveTraysNotGroupedTogether)).append("\n");
    sb.append("    misconfiguredEnclosure: ").append(toIndentedString(misconfiguredEnclosure)).append("\n");
    sb.append("    trayCodeMismatch: ").append(toIndentedString(trayCodeMismatch)).append("\n");
    sb.append("    esmFactoryDefaultsMismatch: ").append(toIndentedString(esmFactoryDefaultsMismatch)).append("\n");
    sb.append("    trayHardwareMismatch: ").append(toIndentedString(trayHardwareMismatch)).append("\n");
    sb.append("    esmMiswire: ").append(toIndentedString(esmMiswire)).append("\n");
    sb.append("    esmStatUnknown: ").append(toIndentedString(esmStatUnknown)).append("\n");
    sb.append("    batteryExpired: ").append(toIndentedString(batteryExpired)).append("\n");
    sb.append("    integratedBatteryExpired: ").append(toIndentedString(integratedBatteryExpired)).append("\n");
    sb.append("    batteryFail: ").append(toIndentedString(batteryFail)).append("\n");
    sb.append("    batterySystemFail: ").append(toIndentedString(batterySystemFail)).append("\n");
    sb.append("    discreteLineFail: ").append(toIndentedString(discreteLineFail)).append("\n");
    sb.append("    driveFail: ").append(toIndentedString(driveFail)).append("\n");
    sb.append("    chFail: ").append(toIndentedString(chFail)).append("\n");
    sb.append("    esmFail: ").append(toIndentedString(esmFail)).append("\n");
    sb.append("    fanFail: ").append(toIndentedString(fanFail)).append("\n");
    sb.append("    vpdI2cFailure: ").append(toIndentedString(vpdI2cFailure)).append("\n");
    sb.append("    iccCruFail: ").append(toIndentedString(iccCruFail)).append("\n");
    sb.append("    miniHubFail: ").append(toIndentedString(miniHubFail)).append("\n");
    sb.append("    volFailDuringModifyMultiRaid: ").append(toIndentedString(volFailDuringModifyMultiRaid)).append("\n");
    sb.append("    volFailDuringModify: ").append(toIndentedString(volFailDuringModify)).append("\n");
    sb.append("    powerSupplyFail: ").append(toIndentedString(powerSupplyFail)).append("\n");
    sb.append("    supportCruFail: ").append(toIndentedString(supportCruFail)).append("\n");
    sb.append("    transceiverModuleFailed: ").append(toIndentedString(transceiverModuleFailed)).append("\n");
    sb.append("    volFail: ").append(toIndentedString(volFail)).append("\n");
    sb.append("    volFailAwaitingInit: ").append(toIndentedString(volFailAwaitingInit)).append("\n");
    sb.append("    volFailInterruptedWrite: ").append(toIndentedString(volFailInterruptedWrite)).append("\n");
    sb.append("    volFailMultiRaid: ").append(toIndentedString(volFailMultiRaid)).append("\n");
    sb.append("    fanStatUnknown: ").append(toIndentedString(fanStatUnknown)).append("\n");
    sb.append("    foreignDriveHasInconsistentRole: ").append(toIndentedString(foreignDriveHasInconsistentRole)).append("\n");
    sb.append("    foreignDriveInconsistent: ").append(toIndentedString(foreignDriveInconsistent)).append("\n");
    sb.append("    foreignDriveRefersToNativeDrive: ").append(toIndentedString(foreignDriveRefersToNativeDrive)).append("\n");
    sb.append("    ghostVolume: ").append(toIndentedString(ghostVolume)).append("\n");
    sb.append("    goldkeyFeature: ").append(toIndentedString(goldkeyFeature)).append("\n");
    sb.append("    failedHostBoard: ").append(toIndentedString(failedHostBoard)).append("\n");
    sb.append("    hostBoardIdMismatch: ").append(toIndentedString(hostBoardIdMismatch)).append("\n");
    sb.append("    hostBoardStatUnknown: ").append(toIndentedString(hostBoardStatUnknown)).append("\n");
    sb.append("    missingHotSpareDriveRef: ").append(toIndentedString(missingHotSpareDriveRef)).append("\n");
    sb.append("    iccCruStatUnknown: ").append(toIndentedString(iccCruStatUnknown)).append("\n");
    sb.append("    iccMissing: ").append(toIndentedString(iccMissing)).append("\n");
    sb.append("    volImpaired: ").append(toIndentedString(volImpaired)).append("\n");
    sb.append("    driveFailImpendingHigh: ").append(toIndentedString(driveFailImpendingHigh)).append("\n");
    sb.append("    driveFailImpendingLow: ").append(toIndentedString(driveFailImpendingLow)).append("\n");
    sb.append("    driveFailImpendingMed: ").append(toIndentedString(driveFailImpendingMed)).append("\n");
    sb.append("    incompatibleFailedLegacyDrive: ").append(toIndentedString(incompatibleFailedLegacyDrive)).append("\n");
    sb.append("    ldFwVersionMismatch: ").append(toIndentedString(ldFwVersionMismatch)).append("\n");
    sb.append("    legacyVgNotOptimal: ").append(toIndentedString(legacyVgNotOptimal)).append("\n");
    sb.append("    linkSpeedDetectionError: ").append(toIndentedString(linkSpeedDetectionError)).append("\n");
    sb.append("    linkSpeedMismatch: ").append(toIndentedString(linkSpeedMismatch)).append("\n");
    sb.append("    driveRedundancyFailure: ").append(toIndentedString(driveRedundancyFailure)).append("\n");
    sb.append("    esmRedundancyFailure: ").append(toIndentedString(esmRedundancyFailure)).append("\n");
    sb.append("    trayRedundancyFailure: ").append(toIndentedString(trayRedundancyFailure)).append("\n");
    sb.append("    maxTempWarn: ").append(toIndentedString(maxTempWarn)).append("\n");
    sb.append("    memParityError: ").append(toIndentedString(memParityError)).append("\n");
    sb.append("    metadataOffline: ").append(toIndentedString(metadataOffline)).append("\n");
    sb.append("    minihubRef: ").append(toIndentedString(minihubRef)).append("\n");
    sb.append("    dualMirrorPrimary: ").append(toIndentedString(dualMirrorPrimary)).append("\n");
    sb.append("    dualMirrorSecondary: ").append(toIndentedString(dualMirrorSecondary)).append("\n");
    sb.append("    mirrorUnsynchronized: ").append(toIndentedString(mirrorUnsynchronized)).append("\n");
    sb.append("    mixeddrivetypesFeature: ").append(toIndentedString(mixeddrivetypesFeature)).append("\n");
    sb.append("    nativeVgForeignDriveMutualRef: ").append(toIndentedString(nativeVgForeignDriveMutualRef)).append("\n");
    sb.append("    nativeVgRefersToForeignDrive: ").append(toIndentedString(nativeVgRefersToForeignDrive)).append("\n");
    sb.append("    networkSetupError: ").append(toIndentedString(networkSetupError)).append("\n");
    sb.append("    nominalTempWarn: ").append(toIndentedString(nominalTempWarn)).append("\n");
    sb.append("    nonFruBatteryWarn: ").append(toIndentedString(nonFruBatteryWarn)).append("\n");
    sb.append("    nonFruBatteryFail: ").append(toIndentedString(nonFruBatteryFail)).append("\n");
    sb.append("    nonFruBatteryRemoved: ").append(toIndentedString(nonFruBatteryRemoved)).append("\n");
    sb.append("    nonPreferredPath: ").append(toIndentedString(nonPreferredPath)).append("\n");
    sb.append("    offlineCtl: ").append(toIndentedString(offlineCtl)).append("\n");
    sb.append("    volGroupOffline: ").append(toIndentedString(volGroupOffline)).append("\n");
    sb.append("    spmFeature: ").append(toIndentedString(spmFeature)).append("\n");
    sb.append("    passiveCtl: ").append(toIndentedString(passiveCtl)).append("\n");
    sb.append("    pathDegradedFailure: ").append(toIndentedString(pathDegradedFailure)).append("\n");
    sb.append("    performanceTierFeature: ").append(toIndentedString(performanceTierFeature)).append("\n");
    sb.append("    powerSupplyStatUnknown: ").append(toIndentedString(powerSupplyStatUnknown)).append("\n");
    sb.append("    procMemTooSmallForCache: ").append(toIndentedString(procMemTooSmallForCache)).append("\n");
    sb.append("    raid6Feature: ").append(toIndentedString(raid6Feature)).append("\n");
    sb.append("    incorrectSupportCru: ").append(toIndentedString(incorrectSupportCru)).append("\n");
    sb.append("    remoteVolNoArray: ").append(toIndentedString(remoteVolNoArray)).append("\n");
    sb.append("    remoteVolNoFabric: ").append(toIndentedString(remoteVolNoFabric)).append("\n");
    sb.append("    remoteVolNoLUN: ").append(toIndentedString(remoteVolNoLUN)).append("\n");
    sb.append("    remoteVolWWNChangeFailed: ").append(toIndentedString(remoteVolWWNChangeFailed)).append("\n");
    sb.append("    alarmRemoved: ").append(toIndentedString(alarmRemoved)).append("\n");
    sb.append("    batteryRemoved: ").append(toIndentedString(batteryRemoved)).append("\n");
    sb.append("    batteryPackRemoved: ").append(toIndentedString(batteryPackRemoved)).append("\n");
    sb.append("    esmRemoved: ").append(toIndentedString(esmRemoved)).append("\n");
    sb.append("    fanRemoved: ").append(toIndentedString(fanRemoved)).append("\n");
    sb.append("    iccCruRemoved: ").append(toIndentedString(iccCruRemoved)).append("\n");
    sb.append("    powerSupplyRemoved: ").append(toIndentedString(powerSupplyRemoved)).append("\n");
    sb.append("    supportCruRemoved: ").append(toIndentedString(supportCruRemoved)).append("\n");
    sb.append("    tempSensorRemoved: ").append(toIndentedString(tempSensorRemoved)).append("\n");
    sb.append("    replacedDriveWrongType: ").append(toIndentedString(replacedDriveWrongType)).append("\n");
    sb.append("    repositoryFull: ").append(toIndentedString(repositoryFull)).append("\n");
    sb.append("    repositoryOverThreshold: ").append(toIndentedString(repositoryOverThreshold)).append("\n");
    sb.append("    rpaParityError: ").append(toIndentedString(rpaParityError)).append("\n");
    sb.append("    rvmFeature: ").append(toIndentedString(rvmFeature)).append("\n");
    sb.append("    degradedSasPort: ").append(toIndentedString(degradedSasPort)).append("\n");
    sb.append("    failedSasPort: ").append(toIndentedString(failedSasPort)).append("\n");
    sb.append("    miswiredSasPort: ").append(toIndentedString(miswiredSasPort)).append("\n");
    sb.append("    snapFail: ").append(toIndentedString(snapFail)).append("\n");
    sb.append("    snapshotFeature: ").append(toIndentedString(snapshotFeature)).append("\n");
    sb.append("    speedNegError: ").append(toIndentedString(speedNegError)).append("\n");
    sb.append("    submodelMismatch: ").append(toIndentedString(submodelMismatch)).append("\n");
    sb.append("    submodelNotSet: ").append(toIndentedString(submodelNotSet)).append("\n");
    sb.append("    submodelNotSupported: ").append(toIndentedString(submodelNotSupported)).append("\n");
    sb.append("    supportCruNoInput: ").append(toIndentedString(supportCruNoInput)).append("\n");
    sb.append("    supportCruStatUnknown: ").append(toIndentedString(supportCruStatUnknown)).append("\n");
    sb.append("    tempSensorStatUnknown: ").append(toIndentedString(tempSensorStatUnknown)).append("\n");
    sb.append("    transceiverModuleStatUnknown: ").append(toIndentedString(transceiverModuleStatUnknown)).append("\n");
    sb.append("    trayIDConflicts: ").append(toIndentedString(trayIDConflicts)).append("\n");
    sb.append("    trayIDMismatch: ").append(toIndentedString(trayIDMismatch)).append("\n");
    sb.append("    driveUncertified: ").append(toIndentedString(driveUncertified)).append("\n");
    sb.append("    esmUncertified: ").append(toIndentedString(esmUncertified)).append("\n");
    sb.append("    cacheMemorySizeUnsupported: ").append(toIndentedString(cacheMemorySizeUnsupported)).append("\n");
    sb.append("    unsupportedHostBoard: ").append(toIndentedString(unsupportedHostBoard)).append("\n");
    sb.append("    miniHubUnsupported: ").append(toIndentedString(miniHubUnsupported)).append("\n");
    sb.append("    unsupportedTray: ").append(toIndentedString(unsupportedTray)).append("\n");
    sb.append("    upsOnBattery: ").append(toIndentedString(upsOnBattery)).append("\n");
    sb.append("    usmDbFullError: ").append(toIndentedString(usmDbFullError)).append("\n");
    sb.append("    usmExistError: ").append(toIndentedString(usmExistError)).append("\n");
    sb.append("    vgCloned: ").append(toIndentedString(vgCloned)).append("\n");
    sb.append("    vgDrivePartOfMultipleVgs: ").append(toIndentedString(vgDrivePartOfMultipleVgs)).append("\n");
    sb.append("    vgHasDrivePartOfMultipleVgs: ").append(toIndentedString(vgHasDrivePartOfMultipleVgs)).append("\n");
    sb.append("    failedVolumeCopy: ").append(toIndentedString(failedVolumeCopy)).append("\n");
    sb.append("    volcopyFeature: ").append(toIndentedString(volcopyFeature)).append("\n");
    sb.append("    incompleteVolumeGroupRef: ").append(toIndentedString(incompleteVolumeGroupRef)).append("\n");
    sb.append("    missingVolumeGroupRef: ").append(toIndentedString(missingVolumeGroupRef)).append("\n");
    sb.append("    partialPresentVolumeGroupRef: ").append(toIndentedString(partialPresentVolumeGroupRef)).append("\n");
    sb.append("    volHotSpareInUse: ").append(toIndentedString(volHotSpareInUse)).append("\n");
    sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
    sb.append("    securityKeyNeeded: ").append(toIndentedString(securityKeyNeeded)).append("\n");
    sb.append("    fdeFeature: ").append(toIndentedString(fdeFeature)).append("\n");
    sb.append("    removedCtrl: ").append(toIndentedString(removedCtrl)).append("\n");
    sb.append("    driveUnsuccessIsolationRedunMismatch: ").append(toIndentedString(driveUnsuccessIsolationRedunMismatch)).append("\n");
    sb.append("    driveThresExcdedMismatchCorrected: ").append(toIndentedString(driveThresExcdedMismatchCorrected)).append("\n");
    sb.append("    inactiveHostPort: ").append(toIndentedString(inactiveHostPort)).append("\n");
    sb.append("    inactiveInitiator: ").append(toIndentedString(inactiveInitiator)).append("\n");
    sb.append("    protectionInformationFeature: ").append(toIndentedString(protectionInformationFeature)).append("\n");
    sb.append("    protectionInformationNotSupported: ").append(toIndentedString(protectionInformationNotSupported)).append("\n");
    sb.append("    driveCapacityInsufficient: ").append(toIndentedString(driveCapacityInsufficient)).append("\n");
    sb.append("    openDrawerRef: ").append(toIndentedString(openDrawerRef)).append("\n");
    sb.append("    failedDrawerRef: ").append(toIndentedString(failedDrawerRef)).append("\n");
    sb.append("    driveRef: ").append(toIndentedString(driveRef)).append("\n");
    sb.append("    solidStateDisksFeature: ").append(toIndentedString(solidStateDisksFeature)).append("\n");
    sb.append("    fibreTrunkMiswire: ").append(toIndentedString(fibreTrunkMiswire)).append("\n");
    sb.append("    fibreTrunkIncompatibleEsm: ").append(toIndentedString(fibreTrunkIncompatibleEsm)).append("\n");
    sb.append("    driveSlotLimitFeature: ").append(toIndentedString(driveSlotLimitFeature)).append("\n");
    sb.append("    newKeySequence: ").append(toIndentedString(newKeySequence)).append("\n");
    sb.append("    fdeProxyKeyMgmtFeature: ").append(toIndentedString(fdeProxyKeyMgmtFeature)).append("\n");
    sb.append("    sbbValidationFailure: ").append(toIndentedString(sbbValidationFailure)).append("\n");
    sb.append("    powerSupplyInvalid: ").append(toIndentedString(powerSupplyInvalid)).append("\n");
    sb.append("    enclosureThermalShutdown: ").append(toIndentedString(enclosureThermalShutdown)).append("\n");
    sb.append("    unsupportedProtocolConnection: ").append(toIndentedString(unsupportedProtocolConnection)).append("\n");
    sb.append("    twiBusFailed: ").append(toIndentedString(twiBusFailed)).append("\n");
    sb.append("    mismatchedEepromContents: ").append(toIndentedString(mismatchedEepromContents)).append("\n");
    sb.append("    unsupportedCapacityDrive: ").append(toIndentedString(unsupportedCapacityDrive)).append("\n");
    sb.append("    evalExpirationImminent: ").append(toIndentedString(evalExpirationImminent)).append("\n");
    sb.append("    keyInvalid: ").append(toIndentedString(keyInvalid)).append("\n");
    sb.append("    multipleMismatchedKeys: ").append(toIndentedString(multipleMismatchedKeys)).append("\n");
    sb.append("    keyValidationLock: ").append(toIndentedString(keyValidationLock)).append("\n");
    sb.append("    cacheDataLoss: ").append(toIndentedString(cacheDataLoss)).append("\n");
    sb.append("    featureOutOfCompliance: ").append(toIndentedString(featureOutOfCompliance)).append("\n");
    sb.append("    driveIncompatiblePItype: ").append(toIndentedString(driveIncompatiblePItype)).append("\n");
    sb.append("    degradedDrawerRef: ").append(toIndentedString(degradedDrawerRef)).append("\n");
    sb.append("    ctlrIocDiagFailed: ").append(toIndentedString(ctlrIocDiagFailed)).append("\n");
    sb.append("    invalidSataFlashConfig: ").append(toIndentedString(invalidSataFlashConfig)).append("\n");
    sb.append("    offlineCtlrIocDiagFailed: ").append(toIndentedString(offlineCtlrIocDiagFailed)).append("\n");
    sb.append("    chanSasPhyDisabledLocalWidePortDegraded: ").append(toIndentedString(chanSasPhyDisabledLocalWidePortDegraded)).append("\n");
    sb.append("    chanSasPhyDisabledSharedWidePortDegraded: ").append(toIndentedString(chanSasPhyDisabledSharedWidePortDegraded)).append("\n");
    sb.append("    drawerInvalid: ").append(toIndentedString(drawerInvalid)).append("\n");
    sb.append("    drawerRemoved: ").append(toIndentedString(drawerRemoved)).append("\n");
    sb.append("    driveUnsupportedInterposerFwVersion: ").append(toIndentedString(driveUnsupportedInterposerFwVersion)).append("\n");
    sb.append("    volumeOfflineDuringReconfig: ").append(toIndentedString(volumeOfflineDuringReconfig)).append("\n");
    sb.append("    snapRollbackPaused: ").append(toIndentedString(snapRollbackPaused)).append("\n");
    sb.append("    pitRollbackPaused: ").append(toIndentedString(pitRollbackPaused)).append("\n");
    sb.append("    pitGroupOverWarnThreshold: ").append(toIndentedString(pitGroupOverWarnThreshold)).append("\n");
    sb.append("    pitViewOverWarnThreshold: ").append(toIndentedString(pitViewOverWarnThreshold)).append("\n");
    sb.append("    pitGroupRepositoryFull: ").append(toIndentedString(pitGroupRepositoryFull)).append("\n");
    sb.append("    pitViewRepositoryFull: ").append(toIndentedString(pitViewRepositoryFull)).append("\n");
    sb.append("    pitGroupFailed: ").append(toIndentedString(pitGroupFailed)).append("\n");
    sb.append("    pitViewFailed: ").append(toIndentedString(pitViewFailed)).append("\n");
    sb.append("    pitPurged: ").append(toIndentedString(pitPurged)).append("\n");
    sb.append("    degradedAsyncMirrorGroup: ").append(toIndentedString(degradedAsyncMirrorGroup)).append("\n");
    sb.append("    syncIntervalTimeExceeded: ").append(toIndentedString(syncIntervalTimeExceeded)).append("\n");
    sb.append("    failedAsyncMirror: ").append(toIndentedString(failedAsyncMirror)).append("\n");
    sb.append("    asyncMirrorRepositoryOverWarnThreshold: ").append(toIndentedString(asyncMirrorRepositoryOverWarnThreshold)).append("\n");
    sb.append("    roleConflictMirrorGroup: ").append(toIndentedString(roleConflictMirrorGroup)).append("\n");
    sb.append("    recoveryPointLostGroup: ").append(toIndentedString(recoveryPointLostGroup)).append("\n");
    sb.append("    incompatibleVolumeGroupSecurity: ").append(toIndentedString(incompatibleVolumeGroupSecurity)).append("\n");
    sb.append("    orphanMirrorGroup: ").append(toIndentedString(orphanMirrorGroup)).append("\n");
    sb.append("    orphanMirrorMember: ").append(toIndentedString(orphanMirrorMember)).append("\n");
    sb.append("    diskPoolStatePartial: ").append(toIndentedString(diskPoolStatePartial)).append("\n");
    sb.append("    diskPoolStateIncomplete: ").append(toIndentedString(diskPoolStateIncomplete)).append("\n");
    sb.append("    diskPoolStateMissing: ").append(toIndentedString(diskPoolStateMissing)).append("\n");
    sb.append("    diskPoolReconstruction: ").append(toIndentedString(diskPoolReconstruction)).append("\n");
    sb.append("    diskPoolUtilizationWarning: ").append(toIndentedString(diskPoolUtilizationWarning)).append("\n");
    sb.append("    diskPoolUtilizationCritical: ").append(toIndentedString(diskPoolUtilizationCritical)).append("\n");
    sb.append("    pitGroupPendingCreateFailed: ").append(toIndentedString(pitGroupPendingCreateFailed)).append("\n");
    sb.append("    cgPendingCreateFailed: ").append(toIndentedString(cgPendingCreateFailed)).append("\n");
    sb.append("    thinVolumeOverThreshold: ").append(toIndentedString(thinVolumeOverThreshold)).append("\n");
    sb.append("    thinVolumeRepositoryFull: ").append(toIndentedString(thinVolumeRepositoryFull)).append("\n");
    sb.append("    thinVolumeFailed: ").append(toIndentedString(thinVolumeFailed)).append("\n");
    sb.append("    fullSecondaryRepositoryMirrorMember: ").append(toIndentedString(fullSecondaryRepositoryMirrorMember)).append("\n");
    sb.append("    suspendedMirrorGroup: ").append(toIndentedString(suspendedMirrorGroup)).append("\n");
    sb.append("    databaseMetadata: ").append(toIndentedString(databaseMetadata)).append("\n");
    sb.append("    fullPrimaryRepositoryMirrorMember: ").append(toIndentedString(fullPrimaryRepositoryMirrorMember)).append("\n");
    sb.append("    sataSCTCmndUnsupported: ").append(toIndentedString(sataSCTCmndUnsupported)).append("\n");
    sb.append("    diskPoolCapacityDepleted: ").append(toIndentedString(diskPoolCapacityDepleted)).append("\n");
    sb.append("    driveModelNumberUnsupported: ").append(toIndentedString(driveModelNumberUnsupported)).append("\n");
    sb.append("    flashCacheNonOptimalDrives: ").append(toIndentedString(flashCacheNonOptimalDrives)).append("\n");
    sb.append("    flashCacheHotSpareInUse: ").append(toIndentedString(flashCacheHotSpareInUse)).append("\n");
    sb.append("    nativeSATAIncompatibleNVSRAM: ").append(toIndentedString(nativeSATAIncompatibleNVSRAM)).append("\n");
    sb.append("    diskPoolDriveFailure: ").append(toIndentedString(diskPoolDriveFailure)).append("\n");
    sb.append("    diskPoolInsufficientMemory: ").append(toIndentedString(diskPoolInsufficientMemory)).append("\n");
    sb.append("    orphanIncompleteMember: ").append(toIndentedString(orphanIncompleteMember)).append("\n");
    sb.append("    pausedAltStateMirrorGroup: ").append(toIndentedString(pausedAltStateMirrorGroup)).append("\n");
    sb.append("    pausedRoleChangeGroup: ").append(toIndentedString(pausedRoleChangeGroup)).append("\n");
    sb.append("    driveEmulationIncompatibleAlignment: ").append(toIndentedString(driveEmulationIncompatibleAlignment)).append("\n");
    sb.append("    redundancyFail: ").append(toIndentedString(redundancyFail)).append("\n");
    sb.append("    mirrorProxyRef: ").append(toIndentedString(mirrorProxyRef)).append("\n");
    sb.append("    miswiredSasHost: ").append(toIndentedString(miswiredSasHost)).append("\n");
    sb.append("    miswiredSasCross: ").append(toIndentedString(miswiredSasCross)).append("\n");
    sb.append("    miswiredSasLoop: ").append(toIndentedString(miswiredSasLoop)).append("\n");
    sb.append("    volGroupWaitingOnHotSpare: ").append(toIndentedString(volGroupWaitingOnHotSpare)).append("\n");
    sb.append("    missingAssignedDrives: ").append(toIndentedString(missingAssignedDrives)).append("\n");
    sb.append("    diskPoolWaitingOnHotSpare: ").append(toIndentedString(diskPoolWaitingOnHotSpare)).append("\n");
    sb.append("    controllerInServiceMode: ").append(toIndentedString(controllerInServiceMode)).append("\n");
    sb.append("    controllerInLockdown: ").append(toIndentedString(controllerInLockdown)).append("\n");
    sb.append("    discoveryErrorSasPort: ").append(toIndentedString(discoveryErrorSasPort)).append("\n");
    sb.append("    ntpResolutionFailure: ").append(toIndentedString(ntpResolutionFailure)).append("\n");
    sb.append("    ntpQueryFailure: ").append(toIndentedString(ntpQueryFailure)).append("\n");
    sb.append("    ntpServiceFailureController: ").append(toIndentedString(ntpServiceFailureController)).append("\n");
    sb.append("    misconfiguredHost: ").append(toIndentedString(misconfiguredHost)).append("\n");
    sb.append("    hostRedundancyLossDetails: ").append(toIndentedString(hostRedundancyLossDetails)).append("\n");
    sb.append("    excessiveRebootsDetected: ").append(toIndentedString(excessiveRebootsDetected)).append("\n");
    sb.append("    ctlrWithDirtyCacheNotFlushed: ").append(toIndentedString(ctlrWithDirtyCacheNotFlushed)).append("\n");
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

