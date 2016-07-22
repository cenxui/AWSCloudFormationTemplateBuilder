package ec2.subnet;

import ec2.EC2;
import resource.Resource;
import resource.Tagable;

/**
 * @author xenxui
 * 2016/7/22
 */

public class Subnets extends Resource implements EC2, Tagable {
	private final Subnet mSubnet;

	private Subnets(Subnet component) {
		super(component);
		mSubnet = component;
	}
	
	public static Subnets getSubnet() {
		final Subnet subnet = new Subnet();
		final Subnets subnets = new Subnets(subnet);
		return subnets;
	}
	
	public void setAvailabilityZone(String availabilityZone) {
		mSubnet.setAvailabilityZone(availabilityZone);
	}
	
	public void setCidrBlock(String cidrBlock) {
		mSubnet.setCidrBlock(cidrBlock);
	}
	
	public void setMapPublicIpOnLaunch(boolean mapPublicIpOnLaunch) {
		mSubnet.setMapPublicIpOnLaunch(mapPublicIpOnLaunch);
	}

	@Override
	public void setVpcId(String id) {
		mSubnet.setVpcId(id);		
	}

	@Override
	public void setVpcRf(String rf) {
		mSubnet.setVpcRf(rf);
	}

	@Override
	public Tagable setTag(String tag) {
		mSubnet.setTags(tag);
		return this;
	}
}
