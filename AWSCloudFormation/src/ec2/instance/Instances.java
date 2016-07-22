package ec2.instance;

import resource.Resource;
import resource.Tagable;

/**
 * 
 * @author xenxui
 * 2016/7/21
 */
public class Instances extends Resource implements Tagable, SsmAssociationable,
	SecurityGroupable, SecurityGroupIdable, NetworkInterfaceable,
	BlockDeviceMappingable {
	
	private final Instance mInstance;
	private Instances(Instance component) {
		super(component);
		mInstance = component;
	}
	
	public static Instances getInstances() {
		final Instance instance = new Instance();
		final Instances instances = new Instances(instance);
		return instances;
	}
	
	public void setAffinity(String affinity) {
		mInstance.setAffinity(affinity);
	}

	public void setAvailabilityZone(String availabilityZone) {
		mInstance.setAvailabilityZone(availabilityZone);
	}

	public BlockDeviceMappingable addBlockDeviceMapping(String blockDeviceMapping) {
		mInstance.addBlockDeviceMapping(blockDeviceMapping);
		return this;
	}

	public void setDisableApiTermination(boolean disableApiTermination) {
		mInstance.setDisableApiTermination(disableApiTermination);
	}

	public void setEbsOptimized(boolean ebsOptimized) {
		mInstance.setEbsOptimized(ebsOptimized);
	}

	public void setHostId(String hostId) {
		mInstance.setHostId(hostId);
	}
	
	public void setIamInstanceProfile(String iamInstanceProfile) {
		mInstance.setIamInstanceProfile(iamInstanceProfile);
	}

	public void setImageId(String imageId) {
		mInstance.setImageId(imageId);
	}

	public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
		mInstance.setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
	}
	
	public void setInstanceType(String instanceType) {
		mInstance.setInstanceType(instanceType);
	}

	public void setKernelId(String kernelId) {
		mInstance.setKernelId(kernelId);
	}

	public void setKeyName(String keyName) {
		mInstance.setKeyName(keyName);
	}

	public void setMonitoring(Boolean monitoring) {
		mInstance.setMonitoring(monitoring);
	}

	public NetworkInterfaceable addNetworkInterface(String networkInterface) {
		mInstance.addNetworkInterface(networkInterface);
		return this;
	}

	public void setPlacementGroupName(String placementGroupName) {
		mInstance.setPlacementGroupName(placementGroupName);
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		mInstance.setPrivateIpAddress(privateIpAddress);
	}

	public void setRamdiskId(String ramdiskId) {
		mInstance.setRamdiskId(ramdiskId);
	}

	public SecurityGroupIdable addSecurityGroupId(String securityGroupId) {
		mInstance.addSecurityGroupId(securityGroupId);
		return this;
	}

	public SecurityGroupable addSecurityGroup(String securityGroup) {
		mInstance.addSecurityGroup(securityGroup);
		return this;
	}

	public void setSourceDestCheck(boolean sourceDestCheck) {
		mInstance.setSourceDestCheck(sourceDestCheck);
	}

	public SsmAssociationable addSsmAssociation(String ssmAssociation) {
		mInstance.addSsmAssociation(ssmAssociation);
		return this;
	}

	public void setSubnetId(String subnetId) {
		mInstance.setSubnetId(subnetId);
	}
	public Tagable addTag(String tags) {
		mInstance.addTag(tags);
		return this;
	}
	public void setTenancy(String tenancy) {
		mInstance.setTenancy(tenancy);
	}
	public void setUserData(String userData) {
		mInstance.setUserData(userData);
	}
	public void setVolumes(String volumes) {
		mInstance.setVolumes(volumes);
	}
	public void setAdditionalInfo(String additionalInfo) {
		mInstance.setAdditionalInfo(additionalInfo);
	}
}
