package iam.role;

import iam.Policiable;
import iam.PolicyArnable;
import resource.Resource;

/**
 * 
 * @author xenxui
 * 2016/7/22
 */
public class Roles extends Resource implements Policiable, PolicyArnable {
	private final Role mRole;

	private Roles(Role component) {
		super(component);
		mRole = component;
	}
	
	public static Roles getRole() {
		final Role role = new Role();
		final Roles roles = new Roles(role);
		return roles;
	}
	
	/**
	 * set the role policy. This role must be a json format.
	 * @param assumeRolePolicyDocument the policy in json
	 */
	
	public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
		mRole.setAssumeRolePolicyDocument(assumeRolePolicyDocument);
	}
	
	public void setPath(String path) {
		mRole.setPath(path);
	}
	
	/**
	 * set the name of the role
	 * @param roleName
	 */
	
	public void setRoleName(String roleName) {
		mRole.setRoleName(roleName);
	}
	
	@Override
	public Policiable addPolicy(String policy) {
		mRole.addPolicy(policy);
		return this;
	}

	@Override
	public PolicyArnable addManagedPolicyArn(String managedPolicyArn) {
		mRole.addManagedPolicyArns(managedPolicyArn);
		return this;
	}
}
