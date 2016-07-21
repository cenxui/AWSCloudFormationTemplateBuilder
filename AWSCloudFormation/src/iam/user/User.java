package iam.user;

import java.util.List;

import resource.Componentable;

public class User implements Componentable {
	public String Type = "AWS::IAM::User";
	private Properties Properties = new Properties();
	
	private class Properties {
		List<String> Groups;
		String LoginProfile;
		List<String> ManagedPolicyArns;
		String Path;
		List<String> Policies;
		String UserName;
	}

	@Override
	public String toComponent() {
		// TODO Auto-generated method stub
		return null;
	}

//	  "": ,
//	  "Properties": {
//	    "": [ String, ... ],
//	    "": LoginProfile Type,
//	    "ManagedPolicyArns": [ String, ... ],
//	    "Path": String,
//	    "": [ Policies, ... ],
//	    "": String
	
}
