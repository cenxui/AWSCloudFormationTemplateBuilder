package ec2.internetgateway;

import java.util.ArrayList;
import java.util.List;

import resource.Component;

class InternetGateway extends Component {
	public String Tag = "AWS::EC2::InternetGateway";

	private Properties Properties = new Properties();
	
	private class Properties {
		List<String> Tags;
	}
	
	public InternetGateway addTag(String tag) {
		if (Properties.Tags == null) {
			Properties.Tags = new ArrayList<>();
		}
		Properties.Tags.add(tag);
		return this;
	}
}
