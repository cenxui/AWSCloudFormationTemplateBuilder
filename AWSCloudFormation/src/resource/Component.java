package resource;

import com.google.gson.Gson;

public class Component implements Componentable {

	@Override
	public String toComponent() {
		return new Gson().toJson(this);
	}

}
