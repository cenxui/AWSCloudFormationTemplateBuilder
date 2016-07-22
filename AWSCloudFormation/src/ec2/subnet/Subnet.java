package ec2.subnet;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import intrinsic.Ref;
import resource.Component;

final class Subnet extends Component{
	public final String Type = "AWS::EC2::Subnet";
	
	private final Properties Properties = new Properties();

	private class Properties {
		@SuppressWarnings("unused")
		String AvailabilityZone;
		@SuppressWarnings("unused")
		String CidrBlock;
		@SuppressWarnings("unused")
		boolean MapPublicIpOnLaunch;
		List<String> Tags;
		Object VpcId;
	}
	
	public void setVpcId(String id) {
		if (Properties.VpcId != null) {
			throw new RuntimeErrorException(null, "You can only either setVpcId or setVpcRf for once");
		}
		Properties.VpcId = id;
	}
	
	public void setVpcRf(String rf) {
		if (Properties.VpcId != null) {
			throw new RuntimeErrorException(null, "You can only either setVpcId or setVpcRf for once");
		}
		Properties.VpcId = new Ref(rf);
	}
	
	public void setAvailabilityZone(String availabilityZone) {
		Properties.AvailabilityZone = availabilityZone;
	}
	
	public void setCidrBlock(String cidrBlock) {
		Properties.CidrBlock = cidrBlock;
	}
	
	public void setMapPublicIpOnLaunch(boolean mapPublicIpOnLaunch) {
		Properties.MapPublicIpOnLaunch = mapPublicIpOnLaunch;
	}
	
	public Subnet setTags(String tag) {
		if (Properties.Tags == null) {
			Properties.Tags = new ArrayList<>(); 
		}
		Properties.Tags.add(tag);
		return this;
	}	
}
