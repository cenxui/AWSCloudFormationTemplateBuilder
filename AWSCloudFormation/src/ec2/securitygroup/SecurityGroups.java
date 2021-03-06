package ec2.securitygroup;

import ec2.EC2;
import ec2.securitygroup.SecurityGroup.InBoundRule;
import ec2.securitygroup.SecurityGroup.OutBoundRule;
import resource.Resource;
import resource.Tagable;

/**
 * 
 * @author xenxui
 * 2016/7/20
 */

public class SecurityGroups extends Resource implements Tagable, EC2{
	private final SecurityGroup mSecurityGroup;
	
	private SecurityGroups(SecurityGroup component) {
		super(component);
		mSecurityGroup = component;
	}
	
	/**
	 * It cannot be instantiated. So use static method
	 * get the security group, we can not new instance, 
	 * call this method instead.
	 * @return
	 */
	
	public static SecurityGroups getSecurityGroups() {
		final SecurityGroup securityGroup = new SecurityGroup();
		final SecurityGroups securityGroups = new SecurityGroups(securityGroup);
		return securityGroups;		 
	}
	
	/**
	 * set the description of group, can not be null
	 * @param description
	 */
	
	public void setGroupDescription(String description) {
		mSecurityGroup.setGroupDescription(description);
	}
	
	/**
	 * set the outbound of the port with the permit ip range or another security group
	 * @return
	 */
	public OutBoundRule setSecurityGroupEgress() {
		return mSecurityGroup.setSecurityGroupEgress();		
	}
	
	/**
	 * set the inbound of the port with the permit ip range or another security group
	 * @return
	 */
	
	public InBoundRule setSecurityGroupIngress() {
		return mSecurityGroup.setSecurityGroupIngress();
	}
	
	@Override
	public Tagable addTag(String tag) {
		mSecurityGroup.addTag(tag);
		return this;
	}
	
	/**
	 * set the vpc with its id
	 * @param id
	 */
	@Override
	public void setVpcId(String id) {
		mSecurityGroup.setVpcId(id);
	}
	
	/**
	 * set the vpc with the reference type
	 * @param rf
	 */
	@Override
	public void setVpcRf(String rf) {
		mSecurityGroup.setVpcRf(rf);
	}
}
