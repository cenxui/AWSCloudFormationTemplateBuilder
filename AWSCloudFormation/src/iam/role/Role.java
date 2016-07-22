package iam.role;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import resource.Component;

/**
 * 
 * @author xenxui
 * 2016/7/22
 */
final class Role extends Component {
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
		return super.toComponent();
	}
}
