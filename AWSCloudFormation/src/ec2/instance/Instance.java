package ec2.instance;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.google.gson.Gson;

import resource.Component;

/**
 * 
 * @author xenxui
 * 2016/7/21
 */
class Instance extends Component {
	
	public final String Type = "AWS::EC2::Instance";
	
	private Properties Properties = new Properties();
	
	private class Properties {
		@SuppressWarnings("unused")
		String Affinity;
		@SuppressWarnings("unused")
		String AvailabilityZone;
		List<String> BlockDeviceMappings;
		@SuppressWarnings("unused")
		boolean DisableApiTermination;
		@SuppressWarnings("unused")
		boolean EbsOptimized;
		@SuppressWarnings("unused")
		String HostId;
		@SuppressWarnings("unused")
		String IamInstanceProfile;
		String ImageId;
		@SuppressWarnings("unused")
		String InstanceInitiatedShutdownBehavior;
		@SuppressWarnings("unused")
		String InstanceType;
		@SuppressWarnings("unused")
		String KernelId;
		@SuppressWarnings("unused")
		String KeyName;
		@SuppressWarnings("unused")
		Boolean Monitoring;
		List<String> NetworkInterfaces;
		@SuppressWarnings("unused")
		String PlacementGroupName;
		@SuppressWarnings("unused")
		String PrivateIpAddress;
		@SuppressWarnings("unused")
		String RamdiskId;
		List<String> SecurityGroupIds;
		List<String> SecurityGroups;
		@SuppressWarnings("unused")
		boolean SourceDestCheck;
		List<String> SsmAssociations;
		@SuppressWarnings("unused")
		String SubnetId;
		List<String> Tags;
		@SuppressWarnings("unused")
		String Tenancy;
		@SuppressWarnings("unused")
		String UserData;
		@SuppressWarnings("unused")
		String Volumes;
		@SuppressWarnings("unused")
		String AdditionalInfo;		
	}
	
	public void setAffinity(String affinity) {
		Properties.Affinity = affinity;
	}

	public void setAvailabilityZone(String availabilityZone) {
		Properties.AvailabilityZone = availabilityZone;
	}

	public Instance addBlockDeviceMapping(String blockDeviceMapping) {
		if (Properties.BlockDeviceMappings == null) {
			Properties.BlockDeviceMappings = new ArrayList<>();
		}
		Properties.BlockDeviceMappings.add(blockDeviceMapping);		
		return this;
	}

	public void setDisableApiTermination(boolean disableApiTermination) {
		Properties.DisableApiTermination = disableApiTermination;
	}

	public void setEbsOptimized(boolean ebsOptimized) {
		Properties.EbsOptimized = ebsOptimized;
	}

	public void setHostId(String hostId) {
		Properties.HostId = hostId;
	}
	
	public void setIamInstanceProfile(String iamInstanceProfile) {
		Properties.IamInstanceProfile = iamInstanceProfile;
	}

	public void setImageId(String imageId) {
		Properties.ImageId = imageId;
	}

	public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
		Properties.InstanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
	}
	
	public void setInstanceType(String instanceType) {
		Properties.InstanceType = instanceType;
	}

	public void setKernelId(String kernelId) {
		Properties.KernelId = kernelId;
	}

	public void setKeyName(String keyName) {
		Properties.KeyName = keyName;
	}

	public void setMonitoring(Boolean monitoring) {
		Properties.Monitoring = monitoring;
	}

	public Instance addNetworkInterface(String networkInterface) {
		if (Properties.NetworkInterfaces == null) {
			Properties.NetworkInterfaces = new ArrayList<>();
		}
		Properties.NetworkInterfaces.add(networkInterface);
		return this;
	}

	public void setPlacementGroupName(String placementGroupName) {
		Properties.PlacementGroupName = placementGroupName;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		Properties.PrivateIpAddress = privateIpAddress;
	}

	public void setRamdiskId(String ramdiskId) {
		Properties.RamdiskId = ramdiskId;
	}

	public Instance addSecurityGroupId(String securityGroupId) {
		if (Properties.SecurityGroupIds == null) {
			Properties.SecurityGroupIds = new ArrayList<>();
		}
		Properties.SecurityGroupIds.add(securityGroupId);
		return this;
	}

	public Instance addSecurityGroup(String securityGroup) {
		if (Properties.SecurityGroups == null) {
			Properties.SecurityGroups = new ArrayList<>();
		}
		Properties.SecurityGroups.add(securityGroup);
		return this;
	}

	public void setSourceDestCheck(boolean sourceDestCheck) {
		Properties.SourceDestCheck = sourceDestCheck;
	}

	public Instance addSsmAssociation(String ssmAssociation) {
		if (Properties.SsmAssociations == null) {
			Properties.SsmAssociations = new ArrayList<>();
		}
		Properties.SsmAssociations.add(ssmAssociation);
		return this;
	}

	public void setSubnetId(String subnetId) {
		Properties.SubnetId = subnetId;
	}
	public Instance addTag(String tag) {
		if (Properties.Tags == null) {
			Properties.Tags = new ArrayList<>();
		}
		Properties.Tags.add(tag);
		return this;
	}
	public void setTenancy(String tenancy) {
		Properties.Tenancy = tenancy;
	}
	public void setUserData(String userData) {
		Properties.UserData = userData;
	}
	public void setVolumes(String volumes) {
		Properties.Volumes = volumes;
	}
	public void setAdditionalInfo(String additionalInfo) {
		Properties.AdditionalInfo = additionalInfo;
	}

	@Override
	public String toComponent() {
		if (Properties.ImageId ==  null) {
			throw new RuntimeErrorException(null, "ImageId can not be null");
		}
		return new Gson().toJson(this);
	}
	
}
