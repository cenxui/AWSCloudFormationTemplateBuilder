package test;

import ec2.securitygroup.SecurityGroups;

public class TestTemp {

	public static void main(String[] args) {
		SecurityGroups securityGroups = SecurityGroups.getSecurityGroups();
		securityGroups.addTag("name").addTag("key");
		securityGroups.setGroupDescription("hi");
		securityGroups.setSecurityGroupEgress().addMoreRule()
		.setDefaultHttp().addMoreRule().setDefaultHttps();
		securityGroups.setVpcId("My VPC");
		System.out.println(securityGroups.toComponent());
		
		
		}

}
