package ec2.subnet;

import com.google.gson.Gson;

import resource.Componentable;

class Subnet implements Componentable {

	@Override
	public String toComponent() {
		return new Gson().toJson(this);
	}
	
}
