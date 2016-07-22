package ec2.vpc;

import resource.Resource;
import resource.Tagable;

public class VPCS extends Resource implements Tagable {	
	public static final String DEFAULT = "default";
	public static final String DEDICATE = "dedicate";
	
	private final VPC mVPC; 

	public VPCS(VPC component) {
		super(component);
		mVPC = component;
	}
	
	public static final VPCS getVPC() {
		VPC vpc = new VPC();
		VPCS vpcs = new VPCS(vpc);
		return vpcs;
	}
	
	public void setCidrBlock(String cidrBlock) {
		mVPC.setCidrBlock(cidrBlock);
	}
	
	public void setEnableDnsHostnames(boolean enableDnsHostnames) {
		mVPC.setEnableDnsHostnames(enableDnsHostnames);
	}
	
	public void setEnableDnsSupport(boolean enableDnsSupport) {
		mVPC.setEnableDnsSupport(enableDnsSupport);
	}
	
	public void setInstanceTenancy(String instanceTenancy) {
		mVPC.setInstanceTenancy(instanceTenancy);
	}
	
	@Override
	public Tagable setTag(String tag) {
		mVPC.setTag(tag);
		return this;
	}
}
