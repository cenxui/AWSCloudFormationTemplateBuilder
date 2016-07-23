package ec2.natgateway;

import resource.Resource;

/**
 * 
 * @author xenxui
 * 2016/7/22
 */
public class NatGateways extends Resource {
	private final NatGateway mNatGateway;

	public NatGateways(NatGateway component) {
		super(component);
		mNatGateway = component;
	}
	
	public void setSubnetId(String subnetId) {
		mNatGateway.setSubnetId(subnetId);
	}
	
	public void setSubnetIdRf(String subnetIdRf) {
		mNatGateway.setSubnetIdRf(subnetIdRf);
	}
	
	public void setAllocationId(String allocationId) {
		mNatGateway.setAllocationId(allocationId);
	}
	
	public void setAllocationIdRf(String allocationIdRf) {
		mNatGateway.setAllocationIdRf(allocationIdRf);
	}
}
