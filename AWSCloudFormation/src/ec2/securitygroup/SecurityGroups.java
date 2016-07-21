package ec2.securitygroup;

import ec2.securitygroup.SecurityGroup.InBoundRule;
import ec2.securitygroup.SecurityGroup.OutBoundRule;
import resource.Componentable;
import resource.Resource;
import resource.Tagable;

/**
 * 
 * @author xenxui
 *
 */

public class SecurityGroups extends Resource implements Tagable{
	private SecurityGroup mSecurityGroup;
	
	private SecurityGroups(Componentable component) {
		super(component);
	}
	
	public static SecurityGroups getSecurityGroups() {
		SecurityGroup securityGroup = new SecurityGroup();
		SecurityGroups securityGroups = new SecurityGroups(securityGroup);
		securityGroups.mSecurityGroup = securityGroup;
		return securityGroups;		 
	}
	
	/**
	 * set the description of group, can not be null
	 * @param description
	 */
	
	public void setGroupDescription(String description) {
		mSecurityGroup.setGroupDescription(description);
	}
	
	public OutBoundRule setSecurityGroupEgress() {
		return mSecurityGroup.setSecurityGroupEgress();		
	}
	
	public InBoundRule setSecurityGroupIngress() {
		return mSecurityGroup.setSecurityGroupIngress();
	}
	
	public Tagable setTag(String tag) {
		mSecurityGroup.setTag(tag);
		return this;
	}
	
	public void setVpcId(String id) {
		mSecurityGroup.setVpcId(id);
	}
	
	public void setVpcRf(String rf) {
		mSecurityGroup.setVpcRf(rf);
	}
}
