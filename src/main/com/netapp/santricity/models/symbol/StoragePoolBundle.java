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
 * StoragePoolBundle
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class StoragePoolBundle   {
  
    private List<SAPortGroup> saPortGroup;

    private List<SAPort> saPort;

    private List<Cluster> cluster;

    private List<Host> host;

    private List<HostPort> hostPort;

    private List<LUNMapping> lunMapping;

    private List<Initiator> initiator;

    private List<Target> target;

    private List<RemoteTarget> remoteTarget;

  
  /**
   * A variable-length array containing all SAPortGroup objects that are currently configured and available.
   **/
  public StoragePoolBundle saPortGroup(List<SAPortGroup> saPortGroup) {
    this.saPortGroup = saPortGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing all SAPortGroup objects that are currently configured and available.")
  @JsonProperty("saPortGroup")
  public List<SAPortGroup> getSaPortGroup() {
    return saPortGroup;
  }
  
  public void setSaPortGroup(List<SAPortGroup> saPortGroup) {
    this.saPortGroup = saPortGroup;
  }

  
  /**
   * A variable-length array containing all SAPortGroup objects that are currently configured and available.
   **/
  public StoragePoolBundle saPort(List<SAPort> saPort) {
    this.saPort = saPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing all SAPortGroup objects that are currently configured and available.")
  @JsonProperty("saPort")
  public List<SAPort> getSaPort() {
    return saPort;
  }
  
  public void setSaPort(List<SAPort> saPort) {
    this.saPort = saPort;
  }

  
  /**
   * A variable-length array containing all defined Cluster objects for the storage array configuration.
   **/
  public StoragePoolBundle cluster(List<Cluster> cluster) {
    this.cluster = cluster;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing all defined Cluster objects for the storage array configuration.")
  @JsonProperty("cluster")
  public List<Cluster> getCluster() {
    return cluster;
  }
  
  public void setCluster(List<Cluster> cluster) {
    this.cluster = cluster;
  }

  
  /**
   * A variable-length array containing all defined Host objects for the storage array configuration.
   **/
  public StoragePoolBundle host(List<Host> host) {
    this.host = host;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing all defined Host objects for the storage array configuration.")
  @JsonProperty("host")
  public List<Host> getHost() {
    return host;
  }
  
  public void setHost(List<Host> host) {
    this.host = host;
  }

  
  /**
   * A variable-length array containing all defined HostPort objects for the storage array configuration.
   **/
  public StoragePoolBundle hostPort(List<HostPort> hostPort) {
    this.hostPort = hostPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing all defined HostPort objects for the storage array configuration.")
  @JsonProperty("hostPort")
  public List<HostPort> getHostPort() {
    return hostPort;
  }
  
  public void setHostPort(List<HostPort> hostPort) {
    this.hostPort = hostPort;
  }

  
  /**
   * A variable-length array containing all defined LUNMapping objects for the storage array configuration.
   **/
  public StoragePoolBundle lunMapping(List<LUNMapping> lunMapping) {
    this.lunMapping = lunMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing all defined LUNMapping objects for the storage array configuration.")
  @JsonProperty("lunMapping")
  public List<LUNMapping> getLunMapping() {
    return lunMapping;
  }
  
  public void setLunMapping(List<LUNMapping> lunMapping) {
    this.lunMapping = lunMapping;
  }

  
  /**
   * A variable-length array containing all Initiator objects defined in the storage array configuration.
   **/
  public StoragePoolBundle initiator(List<Initiator> initiator) {
    this.initiator = initiator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing all Initiator objects defined in the storage array configuration.")
  @JsonProperty("initiator")
  public List<Initiator> getInitiator() {
    return initiator;
  }
  
  public void setInitiator(List<Initiator> initiator) {
    this.initiator = initiator;
  }

  
  /**
   * A variable-length array containing all Target objects defined in the storage array configuration.
   **/
  public StoragePoolBundle target(List<Target> target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing all Target objects defined in the storage array configuration.")
  @JsonProperty("target")
  public List<Target> getTarget() {
    return target;
  }
  
  public void setTarget(List<Target> target) {
    this.target = target;
  }

  
  /**
   * A variable-length array containing all Remote Target objects defined in the storage array configuration. Remote Target objects define the initiator/target on a remote array.
   **/
  public StoragePoolBundle remoteTarget(List<RemoteTarget> remoteTarget) {
    this.remoteTarget = remoteTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A variable-length array containing all Remote Target objects defined in the storage array configuration. Remote Target objects define the initiator/target on a remote array.")
  @JsonProperty("remoteTarget")
  public List<RemoteTarget> getRemoteTarget() {
    return remoteTarget;
  }
  
  public void setRemoteTarget(List<RemoteTarget> remoteTarget) {
    this.remoteTarget = remoteTarget;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragePoolBundle storagePoolBundle = (StoragePoolBundle) o;
    return Objects.equals(this.saPortGroup, storagePoolBundle.saPortGroup) &&
        Objects.equals(this.saPort, storagePoolBundle.saPort) &&
        Objects.equals(this.cluster, storagePoolBundle.cluster) &&
        Objects.equals(this.host, storagePoolBundle.host) &&
        Objects.equals(this.hostPort, storagePoolBundle.hostPort) &&
        Objects.equals(this.lunMapping, storagePoolBundle.lunMapping) &&
        Objects.equals(this.initiator, storagePoolBundle.initiator) &&
        Objects.equals(this.target, storagePoolBundle.target) &&
        Objects.equals(this.remoteTarget, storagePoolBundle.remoteTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saPortGroup, saPort, cluster, host, hostPort, lunMapping, initiator, target, remoteTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragePoolBundle {\n");
    
    sb.append("    saPortGroup: ").append(toIndentedString(saPortGroup)).append("\n");
    sb.append("    saPort: ").append(toIndentedString(saPort)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    lunMapping: ").append(toIndentedString(lunMapping)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    remoteTarget: ").append(toIndentedString(remoteTarget)).append("\n");
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

