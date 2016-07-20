package resource;

import javax.management.RuntimeErrorException;

public class Resource implements Componentable{
	private String mResourceName;
	private Componentable mComponentable;
	public Resource(Componentable component) {
		mComponentable = component;
	}

	public String getResourceName() {
		if (mResourceName == null) {
			throw new RuntimeErrorException(null, "Please setName");
		}
		return mResourceName;
	}

	public void setResourceName(String resourceName) {
		if (resourceName == null || resourceName.length() == 0) {
			throw new RuntimeErrorException(null,"resourceName can not be empty");
		}		
		mResourceName = resourceName;
	}

	@Override
	public String toComponent() {
		return "{\"Resources\":{\"" + mResourceName + "\":" + mComponentable.toComponent() + "}}";
	}
	
	
	
//	if (SecurityGroupName == null || SecurityGroupName.length() == 0) {

//}
//"{\"Resources\":{\""+ SecurityGroupName + "\":" + new Gson().toJson(this)+"}}";
	
}