// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.containerservice.implementation;

import com.azure.resourcemanager.containerservice.fluent.models.AgentPoolInner;
import com.azure.resourcemanager.containerservice.models.AgentPoolMode;
import com.azure.resourcemanager.containerservice.models.AgentPoolType;
import com.azure.resourcemanager.containerservice.models.ContainerServiceVMSizeTypes;
import com.azure.resourcemanager.containerservice.models.KubeletDiskType;
import com.azure.resourcemanager.containerservice.models.KubernetesCluster;
import com.azure.resourcemanager.containerservice.models.KubernetesClusterAgentPool;
import com.azure.resourcemanager.containerservice.models.ManagedClusterAgentPoolProfile;
import com.azure.resourcemanager.containerservice.models.OSDiskType;
import com.azure.resourcemanager.containerservice.models.OSType;
import com.azure.resourcemanager.containerservice.models.PowerState;
import com.azure.resourcemanager.containerservice.models.ScaleSetEvictionPolicy;
import com.azure.resourcemanager.containerservice.models.ScaleSetPriority;
import com.azure.resourcemanager.resources.fluentcore.arm.ResourceUtils;
import com.azure.resourcemanager.resources.fluentcore.arm.models.implementation.ChildResourceImpl;
import com.azure.resourcemanager.resources.fluentcore.utils.ResourceManagerUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/** The implementation for KubernetesClusterAgentPool and its create and update interfaces. */
public class KubernetesClusterAgentPoolImpl
    extends ChildResourceImpl<ManagedClusterAgentPoolProfile, KubernetesClusterImpl, KubernetesCluster>
    implements KubernetesClusterAgentPool, KubernetesClusterAgentPool.Definition<KubernetesClusterImpl>,
    KubernetesClusterAgentPool.Update<KubernetesClusterImpl> {

    private String subnetName;

    KubernetesClusterAgentPoolImpl(ManagedClusterAgentPoolProfile inner, KubernetesClusterImpl parent) {
        super(inner, parent);
        String subnetId = (inner != null) ? this.innerModel().vnetSubnetId() : null;
        this.subnetName = ResourceUtils.nameFromResourceId(subnetId);
    }

    @Override
    public String name() {
        return this.innerModel().name();
    }

    @Override
    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    @Override
    public int count() {
        return ResourceManagerUtils.toPrimitiveInt(this.innerModel().count());
    }

    @Override
    public ContainerServiceVMSizeTypes vmSize() {
        return ContainerServiceVMSizeTypes.fromString(this.innerModel().vmSize());
    }

    @Override
    public int osDiskSizeInGB() {
        return ResourceManagerUtils.toPrimitiveInt(this.innerModel().osDiskSizeGB());
    }

    @Override
    public OSType osType() {
        return this.innerModel().osType();
    }

    @Override
    public AgentPoolType type() {
        return this.innerModel().type();
    }

    @Override
    public AgentPoolMode mode() {
        return this.innerModel().mode();
    }

    @Override
    public String subnetName() {
        if (this.subnetName != null) {
            return this.subnetName;
        } else {
            return ResourceUtils.nameFromResourceId(this.innerModel().vnetSubnetId());
        }
    }

    @Override
    public String networkId() {
        String subnetId = (this.innerModel() != null) ? this.innerModel().vnetSubnetId() : null;
        return (subnetId != null) ? ResourceUtils.parentResourceIdFromResourceId(subnetId) : null;
    }

    @Override
    public List<String> availabilityZones() {
        return innerModel().availabilityZones();
    }

    @Override
    public Map<String, String> nodeLabels() {
        return innerModel().nodeLabels() == null ? null : Collections.unmodifiableMap(innerModel().nodeLabels());
    }

    @Override
    public List<String> nodeTaints() {
        return innerModel().nodeTaints() == null ? null : Collections.unmodifiableList(innerModel().nodeTaints());
    }

    @Override
    public PowerState powerState() {
        return innerModel().powerState();
    }

    @Override
    public boolean isAutoScalingEnabled() {
        return ResourceManagerUtils.toPrimitiveBoolean(innerModel().enableAutoScaling());
    }

    @Override
    public int nodeSize() {
        return ResourceManagerUtils.toPrimitiveInt(innerModel().count());
    }

    @Override
    public int maximumPodsPerNode() {
        return ResourceManagerUtils.toPrimitiveInt(innerModel().maxPods());
    }

    @Override
    public int minimumNodeSize() {
        return ResourceManagerUtils.toPrimitiveInt(innerModel().minCount());
    }

    @Override
    public int maximumNodeSize() {
        return ResourceManagerUtils.toPrimitiveInt(innerModel().maxCount());
    }

    @Override
    public ScaleSetPriority virtualMachinePriority() {
        return innerModel().scaleSetPriority();
    }

    @Override
    public ScaleSetEvictionPolicy virtualMachineEvictionPolicy() {
        return innerModel().scaleSetEvictionPolicy();
    }

    @Override
    public Double virtualMachineMaximumPrice() {
        return innerModel().spotMaxPrice().doubleValue();
    }

    @Override
    public OSDiskType osDiskType() {
        return innerModel().osDiskType();
    }

    @Override
    public KubeletDiskType kubeletDiskType() {
        return innerModel().kubeletDiskType();
    }

    @Override
    public Map<String, String> tags() {
        return innerModel().tags() == null ? Collections.emptyMap() : Collections.unmodifiableMap(innerModel().tags());
    }

    @Override
    public boolean isFipsEnabled() {
        return ResourceManagerUtils.toPrimitiveBoolean(innerModel().enableFips());
    }

    //    @Override
    //    public void start() {
    //        startAsync().block();
    //    }
    //
    //    @Override
    //    public Mono<Void> startAsync() {
    //        AgentPoolInner innerModel = this.getAgentPoolInner();
    //        PowerState powerState = innerModel.powerState();
    //        if (powerState == null) {
    //            powerState = new PowerState();
    //            innerModel.withPowerState(powerState);
    //        }
    //        powerState.withCode(Code.RUNNING);
    //        return parent().manager().serviceClient().getAgentPools()
    //            .createOrUpdateAsync(parent().resourceGroupName(), parent().name(), this.name(), innerModel)
    //            .map(inner -> {
    //                this.innerModel().withPowerState(inner.powerState());
    //                return inner;
    //            }).then();
    //    }
    //
    //    @Override
    //    public void stop() {
    //        stopAsync().block();
    //    }
    //
    //    @Override
    //    public Mono<Void> stopAsync() {
    //        AgentPoolInner innerModel = this.getAgentPoolInner();
    //        PowerState powerState = innerModel.powerState();
    //        if (powerState == null) {
    //            powerState = new PowerState();
    //            innerModel.withPowerState(powerState);
    //        }
    //        powerState.withCode(Code.STOPPED);
    //        return parent().manager().serviceClient().getAgentPools()
    //            .createOrUpdateAsync(parent().resourceGroupName(), parent().name(), this.name(), innerModel)
    //            .map(inner -> {
    //                this.innerModel().withPowerState(inner.powerState());
    //                return inner;
    //            }).then();
    //    }

    @Override
    public KubernetesClusterAgentPoolImpl withVirtualMachineSize(ContainerServiceVMSizeTypes vmSize) {
        this.innerModel().withVmSize(vmSize.toString());
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withOSType(OSType osType) {
        this.innerModel().withOsType(osType);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withOSDiskSizeInGB(int osDiskSizeInGB) {
        this.innerModel().withOsDiskSizeGB(osDiskSizeInGB);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withAgentPoolType(AgentPoolType agentPoolType) {
        this.innerModel().withType(agentPoolType);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withAgentPoolTypeName(String agentPoolTypeName) {
        this.innerModel().withType(AgentPoolType.fromString(agentPoolTypeName));
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withAgentPoolVirtualMachineCount(int count) {
        this.innerModel().withCount(count);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withMaxPodsCount(int podsCount) {
        this.innerModel().withMaxPods(podsCount);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withVirtualNetwork(String virtualNetworkId, String subnetName) {
        String vnetSubnetId = virtualNetworkId + "/subnets/" + subnetName;
        this.subnetName = subnetName;
        this.innerModel().withVnetSubnetId(vnetSubnetId);
        return this;
    }

    @Override
    public KubernetesClusterImpl attach() {
        return this.parent().addNewAgentPool(this);
    }

    AgentPoolInner getAgentPoolInner() {
        AgentPoolInner agentPoolInner = new AgentPoolInner();
        agentPoolInner.withCount(innerModel().count());
        agentPoolInner.withVmSize(innerModel().vmSize());
        agentPoolInner.withOsDiskSizeGB(innerModel().osDiskSizeGB());
        agentPoolInner.withOsDiskType(innerModel().osDiskType());
        agentPoolInner.withKubeletDiskType(innerModel().kubeletDiskType());
        agentPoolInner.withWorkloadRuntime(innerModel().workloadRuntime());
        agentPoolInner.withVnetSubnetId(innerModel().vnetSubnetId());
        agentPoolInner.withPodSubnetId(innerModel().podSubnetId());
        agentPoolInner.withMaxPods(innerModel().maxPods());
        agentPoolInner.withOsType(innerModel().osType());
        agentPoolInner.withOsSku(innerModel().osSku());
        agentPoolInner.withMaxCount(innerModel().maxCount());
        agentPoolInner.withMinCount(innerModel().minCount());
        agentPoolInner.withEnableAutoScaling(innerModel().enableAutoScaling());
        agentPoolInner.withScaleDownMode(innerModel().scaleDownMode());
        agentPoolInner.withTypePropertiesType(innerModel().type());
        agentPoolInner.withMode(innerModel().mode());
        agentPoolInner.withOrchestratorVersion(innerModel().orchestratorVersion());
        //        agentPoolInner.withNodeImageVersion(innerModel().nodeImageVersion());     // nodeImageVersion is readOnly now
        agentPoolInner.withUpgradeSettings(innerModel().upgradeSettings());
        agentPoolInner.withPowerState(innerModel().powerState());
        agentPoolInner.withAvailabilityZones(innerModel().availabilityZones());
        agentPoolInner.withEnableNodePublicIp(innerModel().enableNodePublicIp());
        agentPoolInner.withNodePublicIpPrefixId(innerModel().nodePublicIpPrefixId());
        agentPoolInner.withScaleSetPriority(innerModel().scaleSetPriority());
        agentPoolInner.withScaleSetEvictionPolicy(innerModel().scaleSetEvictionPolicy());
        agentPoolInner.withSpotMaxPrice(innerModel().spotMaxPrice());
        agentPoolInner.withTags(innerModel().tags());
        agentPoolInner.withNodeLabels(innerModel().nodeLabels());
        agentPoolInner.withNodeTaints(innerModel().nodeTaints());
        agentPoolInner.withProximityPlacementGroupId(innerModel().proximityPlacementGroupId());
        agentPoolInner.withKubeletConfig(innerModel().kubeletConfig());
        agentPoolInner.withLinuxOSConfig(innerModel().linuxOSConfig());
        agentPoolInner.withEnableEncryptionAtHost(innerModel().enableEncryptionAtHost());
        agentPoolInner.withEnableUltraSsd(innerModel().enableUltraSsd());
        agentPoolInner.withEnableFips(innerModel().enableFips());
        agentPoolInner.withGpuInstanceProfile(innerModel().gpuInstanceProfile());
        agentPoolInner.withHostGroupId(innerModel().hostGroupId());
        agentPoolInner.withCapacityReservationGroupId(innerModel().capacityReservationGroupId());
        agentPoolInner.withNetworkProfile(innerModel().networkProfile());
        agentPoolInner.withWindowsProfile(innerModel().windowsProfile());
        agentPoolInner.withSecurityProfile(innerModel().securityProfile());
        agentPoolInner.withMessageOfTheDay(innerModel().messageOfTheDay());
        agentPoolInner.withPodIpAllocationMode(innerModel().podIpAllocationMode());
        agentPoolInner.withGatewayProfile(innerModel().gatewayProfile());
        agentPoolInner.withVirtualMachinesProfile(innerModel().virtualMachinesProfile());
        agentPoolInner.withVirtualMachineNodesStatus(innerModel().virtualMachineNodesStatus());
        agentPoolInner.withStatus(innerModel().status());
        return agentPoolInner;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withAgentPoolMode(AgentPoolMode agentPoolMode) {
        innerModel().withMode(agentPoolMode);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withAutoScaling(int minimumNodeSize, int maximumNodeSize) {
        innerModel().withEnableAutoScaling(true);
        innerModel().withMinCount(minimumNodeSize);
        innerModel().withMaxCount(maximumNodeSize);
        return this;
    }

    @Override
    public Update<KubernetesClusterImpl> withoutAutoScaling() {
        innerModel().withEnableAutoScaling(false);
        innerModel().withMinCount(null);
        innerModel().withMaxCount(null);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withAvailabilityZones(Integer... zones) {
        innerModel().withAvailabilityZones(Arrays.stream(zones).map(String::valueOf).collect(Collectors.toList()));
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withNodeLabels(Map<String, String> nodeLabels) {
        innerModel().withNodeLabels(nodeLabels == null ? null : new TreeMap<>(nodeLabels));
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withNodeTaints(List<String> nodeTaints) {
        innerModel().withNodeTaints(nodeTaints);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withVirtualMachinePriority(ScaleSetPriority priority) {
        innerModel().withScaleSetPriority(priority);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withSpotPriorityVirtualMachine() {
        innerModel().withScaleSetPriority(ScaleSetPriority.SPOT);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withSpotPriorityVirtualMachine(ScaleSetEvictionPolicy policy) {
        innerModel().withScaleSetPriority(ScaleSetPriority.SPOT);
        innerModel().withScaleSetEvictionPolicy(policy);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withVirtualMachineMaximumPrice(Double maxPriceInUsDollars) {
        innerModel().withSpotMaxPrice(maxPriceInUsDollars.floatValue());
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withOSDiskType(OSDiskType osDiskType) {
        innerModel().withOsDiskType(osDiskType);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withKubeletDiskType(KubeletDiskType kubeletDiskType) {
        innerModel().withKubeletDiskType(kubeletDiskType);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withTags(Map<String, String> tags) {
        innerModel().withTags(tags);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withTag(String key, String value) {
        if (innerModel().tags() == null) {
            innerModel().withTags(new TreeMap<>());
        }
        innerModel().tags().put(key, value);
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withoutTag(String key) {
        if (innerModel().tags() != null) {
            innerModel().tags().remove(key);
        }
        return this;
    }

    @Override
    public KubernetesClusterAgentPoolImpl withFipsEnabled() {
        innerModel().withEnableFips(true);
        return this;
    }
}
