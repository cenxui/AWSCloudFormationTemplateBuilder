package iam.role;

import iam.Policiable;
import resource.Resource;

public class Roles extends Resource implements Policiable {
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
	
	/**
	 * set policy arns
	 * @param managedPolicyArns the policy arns
	 */
	
	public void setManagedPolicyArns(String managedPolicyArns) {
		mRole.setManagedPolicyArns(managedPolicyArns);
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
	public Policiable setPolicy(String policy) {
		mRole.setPolicies(policy);
		return this;
	}
}
