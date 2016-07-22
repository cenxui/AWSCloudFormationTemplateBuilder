package ec2.subnet;

import javax.management.RuntimeErrorException;

import intrinsic.Ref;
import resource.Component;

/**
 * 
 * @author xenxui
 * 2016/7/22
 */
final class SubnetNetworkAclAssociation extends Component {
	public static final String Type = "AWS::EC2::SubnetNetworkAclAssociation";
	
	private final Properties Properties = new Properties();

	
	public void setSubnetId(String subnetId) {
		if (Properties.SubnetId != null) {
			throw new RuntimeErrorException(null, "You can only either setSubnetId or setSubnetIdRf once.");
		}
		Properties.SubnetId = subnetId;
	}
	
	public void setSubnetIdRef(String SubnetIdRef) {
		if (Properties.SubnetId != null) {
			throw new RuntimeErrorException(null, "You can only either setSubnetId or setSubnetIdRf once.");
		}
		Properties.SubnetId = new Ref(SubnetIdRef);	
	}
	
	public void setNetworkAclId(String networkAclId) {
		if (Properties.NetworkAclId != null) {
			throw new RuntimeErrorException(null, "You can only setNetworkAclId or setNetworkAclIdRf once.");
		}
		Properties.NetworkAclId = networkAclId;
	}
	
	public void setNetworkAclIdRf(String networkAclIdRf) {
		if (Properties.NetworkAclId != null) {
			throw new RuntimeErrorException(null, "You can only setNetworkAclId or setNetworkAclIdRf once.");
		}
		Properties.NetworkAclId = new Ref(networkAclIdRf);
	}
	
	private class Properties {
		Object SubnetId;
		Object NetworkAclId;		
	}	
}
