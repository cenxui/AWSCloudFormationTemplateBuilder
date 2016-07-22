package iam.user;

import java.util.ArrayList;
import java.util.List;

import resource.Component;

class User extends Component {
	public String Type = "AWS::IAM::User";
	private Properties Properties = new Properties();
	
	private class Properties {
		List<String> Groups;
		@SuppressWarnings("unused")
		String LoginProfile;
		List<String> ManagedPolicyArns;
		@SuppressWarnings("unused")
		String Path;
		List<String> Policies;
		@SuppressWarnings("unused")
		String UserName;
	}
	
	public User addGroup(String group) {
		if (Properties.Groups == null) {
			Properties.Groups = new ArrayList<>();
		}
		Properties.Groups.add(group);
		return this;
	}
	
	public void setLoginProfile(String loginProfile) {
		Properties.LoginProfile = loginProfile;
	}
	
	public User addManagedPolicyArn(String managedPolicyArn) {
		if (Properties.ManagedPolicyArns == null) {
			Properties.ManagedPolicyArns = new ArrayList<>();
		}
		Properties.ManagedPolicyArns.add(managedPolicyArn);
		return this;
	}
	
	public void setPath(String path) {
		Properties.Path = path;
	}
	
	public User addPolicy(String policy) {
		if (Properties.Policies == null) {
			Properties.Policies = new ArrayList<>();
		}
		Properties.Policies.add(policy);
		return this;
	}
	
	public void setUserName(String userName) {
		Properties.UserName = userName;
	}
}
