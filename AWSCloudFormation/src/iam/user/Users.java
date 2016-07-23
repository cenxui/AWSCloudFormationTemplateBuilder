package iam.user;

import iam.Policiable;
import iam.PolicyArnable;
import resource.Resource;

public class Users extends Resource implements Groupable, PolicyArnable, Policiable {
	private final User mUser;
	public Users(User component) {
		super(component);
		mUser = component;
	}
	
	public Groupable addGroup(String group) {
		mUser.addGroup(group);
		return this;
	}
	
	public void setLoginProfile(String loginProfile) {
		mUser.setLoginProfile(loginProfile);
	}
	
	public PolicyArnable addManagedPolicyArn(String managedPolicyArn) {
		mUser.addManagedPolicyArn(managedPolicyArn);
		return null;
	}
	
	public void setPath(String path) {
		mUser.setPath(path);
	}
	
	public Policiable addPolicy(String policy) {
		mUser.addPolicy(policy);
		return this;
	}
	
	public void setUserName(String userName) {
		mUser.setUserName(userName);
	}
}
