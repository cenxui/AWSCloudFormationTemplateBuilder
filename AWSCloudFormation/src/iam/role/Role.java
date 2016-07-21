package iam.role;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.google.gson.Gson;

import resource.Componentable;

class Role implements Componentable{
	public final String Type = "AWS::IAM::Role";
	private final Properties Properties = new Properties();

	private class Properties {
		String AssumeRolePolicyDocument;
		@SuppressWarnings("unused")
		String ManagedPolicyArns;
		@SuppressWarnings("unused")
		String Path;
		List<String> Policies;
		@SuppressWarnings("unused")
		String RoleName;		
	}
	
	public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
		Properties.AssumeRolePolicyDocument = assumeRolePolicyDocument;
	}
	
	public void setManagedPolicyArns(String managedPolicyArns) {
		Properties.ManagedPolicyArns = managedPolicyArns;
	}
	
	public void setPath(String path) {
		Properties.Path = path;
	}
	
	public Role setPolicies(String policy) {
		if (Properties.Policies == null) {
			Properties.Policies = new ArrayList<>();
		}
		Properties.Policies.add(policy) ;
		return this;
	}
	
	public void setRoleName(String roleName) {
		Properties.RoleName = roleName;
	}
	
	@Override
	public String toComponent() {
		if (Properties.AssumeRolePolicyDocument == null) {
			throw new RuntimeErrorException(null, "AssumeRolePolicyDocument can not be null");
		}
		return new Gson().toJson(this);
	}
}
