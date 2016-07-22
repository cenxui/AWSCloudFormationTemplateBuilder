package ec2.natgateway;

import javax.management.RuntimeErrorException;

import intrinsic.Ref;
import resource.Component;

class NatGateway extends Component {
	public final String Tag = "AWS::EC2::NatGateway";
	
	private final Properties Properties = new Properties();
	
	private class Properties {
		Object AllocationId;
		Object SubnetId;
	}
	
	public void setSubnetId(String subnetId) {
		if (Properties.SubnetId != null) {
			throw new RuntimeErrorException(null,"You can only either setSubnetId or setSubnetIdRf once.");
		}
		Properties.SubnetId = subnetId;
	}
	
	public void setSubnetIdRf(String subnetIdRf) {
		if (Properties.SubnetId != null) {
			throw new RuntimeErrorException(null,"You can only either setSubnetId or setSubnetIdRf once.");
		}
		Properties.SubnetId = new Ref(subnetIdRf);
	}
	
	public void setAllocationId(String allocationId) {
		if (Properties.AllocationId != null) {
			throw new RuntimeErrorException(null,"You can only either setAllocationId or setAllocationIdRf once.");
		}
		Properties.AllocationId = allocationId;
	}
	
	public void setAllocationIdRf(String allocationIdRf) {
		if (Properties.AllocationId != null) {
			throw new RuntimeErrorException(null,"You can only either setAllocationId or setAllocationIdRf once.");
		}
		Properties.AllocationId = new Ref(allocationIdRf);
	}
}
