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


package com.netapp.santricity.api.v2;

import com.netapp.santricity.ApiException;
import com.netapp.santricity.ApiClient;
import com.netapp.santricity.models.symbol.*;
import com.netapp.santricity.models.utils.*;
import com.netapp.santricity.models.v2.*;
import static org.testng.AssertJUnit.*;
import org.testng.annotations.*;
import org.testng.Assert.*;
import org.testng.Reporter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.util.Date;
import java.util.Objects;


/**
* API tests for StatisticsApi
*/
public class StatisticsApiTest {
    private final StatisticsApi api = new StatisticsApi();
    
    /**
     * Get all analysed controller statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAnalysedControllerStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<AnalysedControllerStatistics> response = api.getAllAnalysedControllerStatistics(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all analysed disk statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAnalysedDriveStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<AnalysedDiskStatistics> response = api.getAllAnalysedDriveStatistics(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all analysed controller statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAnalysedInterfaceStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<AnalyzedInterfaceStatistics> response = api.getAllAnalysedInterfaceStatistics(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get all analysed volume statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAnalysedVolumeStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String idlist = null;
        
        try{
        List<AnalysedVolumeStatistics> response = api.getAllAnalysedVolumeStatistics(systemId, idlist);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get historical performance raw statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllHistoricalRawPerformanceStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String type = null;
        
        Long start = null;
        
        Long end = null;
        
        Long length = null;
        
        try{
        RawStatsResponse response = api.getAllHistoricalRawPerformanceStatistics(systemId, type, start, end, length);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get Live performance statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLivePerformanceStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String type = null;
        
        try{
        RawStatsResponse response = api.getAllLivePerformanceStatistics(systemId, type);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get raw disk statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRawDiskStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        Boolean usecache = null;
        
        try{
        List<DiskIOStats> response = api.getAllRawDiskStatistics(systemId, usecache);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get raw volume statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRawVolumeStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        Boolean usecache = null;
        
        try{
        List<VolumeIOStats> response = api.getAllRawVolumeStatistics(systemId, usecache);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a subset of analysed controller statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnalysedControllerStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        try{
        List<AnalysedControllerStatistics> response = api.getAnalysedControllerStatistics(systemId, idlist);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a subset of analysed disk statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnalysedDriveStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        try{
        List<AnalysedDiskStatistics> response = api.getAnalysedDriveStatistics(systemId, idlist);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a subset of the analysed volume statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnalysedVolumeStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<AnalysedVolumeStatistics> response = api.getAnalysedVolumeStatistics(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a subset of analysed controller statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnalyzedInterfaceStatsTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        try{
        List<AnalyzedInterfaceStatistics> response = api.getAnalyzedInterfaceStats(systemId, idlist);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list supported average analyzed statistics types
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAverageAnalyzedStatisticsTypesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<String> response = api.getAverageAnalyzedStatisticsTypes(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get historical performance statistics averaged over a time range.
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAveragedHistoricalPerformanceStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String type = null;
        
        Long length = null;
        
        try{
        AverageAnalysedStatsResponse response = api.getAveragedHistoricalPerformanceStatistics(systemId, type, length);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get historical performance statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricalPerformanceStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        String type = null;
        
        Long start = null;
        
        Long end = null;
        
        try{
        HistoricalStatsResponse response = api.getHistoricalPerformanceStatistics(systemId, type, start, end);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get selected historical performance raw statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricalRawPerformanceStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        String type = null;
        
        Long start = null;
        
        Long end = null;
        
        Long length = null;
        
        try{
        RawStatsResponse response = api.getHistoricalRawPerformanceStatistics(systemId, idlist, type, start, end, length);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get selected Live performance statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLivePerformanceStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        String type = null;
        
        try{
        RawStatsResponse response = api.getLivePerformanceStatistics(systemId, idlist, type);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get raw controller statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawControllerStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        Boolean usecache = null;
        
        try{
        List<ControllerStats> response = api.getRawControllerStatistics(systemId, usecache);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get raw controller statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawControllerStatisticsUsingListTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        Boolean usecache = null;
        
        try{
        List<ControllerStats> response = api.getRawControllerStatisticsUsingList(systemId, idlist, usecache);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get a subset of the raw disk statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawDiskStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        Boolean usecache = null;
        
        try{
        List<DiskIOStats> response = api.getRawDiskStatistics(systemId, idlist, usecache);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get raw interface statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawInterfaceStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        Boolean usecache = null;
        
        try{
        List<InterfaceStats> response = api.getRawInterfaceStatistics(systemId, usecache);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get raw controller statistics
     *
     * Mode: Embedded only. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawInterfaceStatisticsWithListTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        Boolean usecache = null;
        
        try{
        List<InterfaceStats> response = api.getRawInterfaceStatisticsWithList(systemId, idlist, usecache);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list supported raw statistics types
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawStatisticsTypesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<String> response = api.getRawStatisticsTypes(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get raw volume statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawVolumeStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        Boolean usecache = null;
        
        try{
        List<VolumeIOStats> response = api.getRawVolumeStatistics(systemId, idlist, usecache);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get selected historical performance statistics
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelectedHistoricalPerformanceStatisticsTest() throws ApiException {
        
        String systemId = null;
        
        List<String> idlist = null;
        
        String type = null;
        
        Long start = null;
        
        Long end = null;
        
        try{
        HistoricalStatsResponse response = api.getSelectedHistoricalPerformanceStatistics(systemId, idlist, type, start, end);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
    /**
     * Get the list supported statistics types
     *
     * Mode: Both Embedded and Proxy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedStatisticsTypesTest() throws ApiException {
        
        String systemId = null;
        
        try{
        List<String> response = api.getSupportedStatisticsTypes(systemId);
        }
        catch (ApiException ae) {
            // The API call went through but got an API exception.
        }
    }
    
}
