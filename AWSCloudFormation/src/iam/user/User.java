package iam.user;

import java.util.List;

import resource.Component;

public class User extends Component {
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


//	  "": ,
//	  "Properties": {
//	    "": [ String, ... ],
//	    "": LoginProfile Type,
//	    "ManagedPolicyArns": [ String, ... ],
//	    "Path": String,
//	    "": [ Policies, ... ],
//	    "": String
	
}
