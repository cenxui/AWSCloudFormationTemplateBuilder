package ec2;

import resource.Componentable;
import resource.Resource;
import resource.Tagable;

public class Instances extends Resource implements Tagable, SsmAssociationable,
	SecurityGroupable, SecurityGroupIdable, NetworkInterfaceable,
	BlockDeviceMappingable {
	
	private Instance instance;
	private Instances(Componentable component) {
		super(component);
	}
	
	public static Instances getInstances() {
		Instance instance = new Instance();
		Instances instances = new Instances(instance);
		instances.instance = instance;
		return instances;
	}
	
	public void setAffinity(String affinity) {
		instance.setAffinity(affinity);
	}

	public void setAvailabilityZone(String availabilityZone) {
		instance.setAvailabilityZone(availabilityZone);
	}

	public BlockDeviceMappingable setBlockDeviceMapping(String blockDeviceMapping) {
		instance.setBlockDeviceMapping(blockDeviceMapping);
		return this;
	}

	public void setDisableApiTermination(boolean disableApiTermination) {
		instance.setDisableApiTermination(disableApiTermination);
	}

	public void setEbsOptimized(boolean ebsOptimized) {
		instance.setEbsOptimized(ebsOptimized);
	}

	public void setHostId(String hostId) {
		instance.setHostId(hostId);
	}
	
	public void setIamInstanceProfile(String iamInstanceProfile) {
		instance.setIamInstanceProfile(iamInstanceProfile);
	}

	public void setImageId(String imageId) {
		instance.setImageId(imageId);
	}

	public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
		instance.setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
	}
	
	public void setInstanceType(String instanceType) {
		instance.setInstanceType(instanceType);
	}

	public void setKernelId(String kernelId) {
		instance.setKernelId(kernelId);
	}

	public void setKeyName(String keyName) {
		instance.setKeyName(keyName);
	}

	public void setMonitoring(Boolean monitoring) {
		instance.setMonitoring(monitoring);
	}

	public NetworkInterfaceable setNetworkInterface(String networkInterface) {
		instance.setNetworkInterface(networkInterface);
		return this;
	}

	public void setPlacementGroupName(String placementGroupName) {
		instance.setPlacementGroupName(placementGroupName);
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		instance.setPrivateIpAddress(privateIpAddress);
	}

	public void setRamdiskId(String ramdiskId) {
		instance.setRamdiskId(ramdiskId);
	}

	public SecurityGroupIdable setSecurityGroupId(String securityGroupId) {
		instance.setSecurityGroupId(securityGroupId);
		return this;
	}

	public SecurityGroupable setSecurityGroup(String securityGroup) {
		instance.setSecurityGroup(securityGroup);
		return this;
	}

	public void setSourceDestCheck(boolean sourceDestCheck) {
		instance.setSourceDestCheck(sourceDestCheck);
	}

	public SsmAssociationable setSsmAssociation(String ssmAssociation) {
		instance.setSsmAssociation(ssmAssociation);
		return this;
	}

	public void setSubnetId(String subnetId) {
		instance.setSubnetId(subnetId);
	}
	public Tagable setTag(String tags) {
		instance.setTag(tags);
		return this;
	}
	public void setTenancy(String tenancy) {
		instance.setTenancy(tenancy);
	}
	public void setUserData(String userData) {
		instance.setUserData(userData);
	}
	public void setVolumes(String volumes) {
		instance.setVolumes(volumes);
	}
	public void setAdditionalInfo(String additionalInfo) {
		instance.setAdditionalInfo(additionalInfo);
	}
}
