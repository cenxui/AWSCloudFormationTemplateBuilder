package test;

import ec2.securitygroup.SecurityGroups;

public class TestSecurityGroup {

	public static void main(String[] args) {
		SecurityGroups securityGroups = SecurityGroups.getSecurityGroups();
		securityGroups.setResourceName("MyWebSG");
		securityGroups.setVpcId("vpc-1d744878");
		securityGroups.setGroupDescription("test security group");
		securityGroups.setSecurityGroupEgress().setDefaultHttp().setCidrIp("0.0.0.0/0");
		securityGroups.setSecurityGroupIngress().setDefaultHttp().setCidrIp("0.0.0.0/0");
		
		System.out.println(securityGroups.toComponent());
	}

}
