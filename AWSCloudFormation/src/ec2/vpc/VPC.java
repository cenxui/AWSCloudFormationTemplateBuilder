package ec2.vpc;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import resource.Component;

/**
 * 
 * @author xenxui
 * 2016/7/22
 */

final class VPC extends Component {
	public final String Type = "AWS::EC2::VPC";
	private final Properties Properties = new Properties();
	
	private class Properties {
		@SuppressWarnings("unused")
		String CidrBlock;
		@SuppressWarnings("unused")
		boolean EnableDnsSupport;
		@SuppressWarnings("unused")
		boolean EnableDnsHostnames;
		@SuppressWarnings("unused")
		String InstanceTenancy;
		List<String> Tags;
	}
	
	public void setCidrBlock(String cidrBlock) {
		if (cidrBlock == null) {
			throw new RuntimeErrorException(null, "cidrBlock can not be null");
		}
		Properties.CidrBlock = cidrBlock;
	}
	
	public void setEnableDnsHostnames(boolean enableDnsHostnames) {
		Properties.EnableDnsHostnames = enableDnsHostnames;
	}
	
	public void setEnableDnsSupport(boolean enableDnsSupport) {
		Properties.EnableDnsSupport = enableDnsSupport;
	}
	
	public void setInstanceTenancy(String instanceTenancy) {
		if (instanceTenancy.equals("default") == false && 
				instanceTenancy.equals("dedicated") == false) {
			throw new RuntimeErrorException(null, "istance tenancy must be default or dedicated");
		}
		Properties.InstanceTenancy = instanceTenancy;
	}
	
	public VPC setTag(String tag) {
		if (Properties.Tags == null) {
			Properties.Tags = new ArrayList<>();
		}
		Properties.Tags.add(tag);
		return this;
	}
}
