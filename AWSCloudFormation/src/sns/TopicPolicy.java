package sns;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.google.gson.Gson;

import resource.Component;

class TopicPolicy extends Component {
	
	public final String Type = "AWS::SNS::TopicPolicy";
	
	private Properties Properties = new Properties();
	
	private class Properties {
		String PolicyDocument;
		List<String> Topics;		
	}
	
	public void setPolicyDocument(String policyDocument) {
		new Gson().fromJson(policyDocument, Object.class);	
		Properties.PolicyDocument = policyDocument;
	}
	
	public TopicPolicy addTopic(String topic) {
		if (Properties.Topics == null) {
			Properties.Topics = new ArrayList<>();
		}
		Properties.Topics.add(topic);
		return this;
	}
	
	@Override
	public String toComponent() {
		if (Properties.PolicyDocument == null) {
			throw new RuntimeErrorException(null, "Policy document can not be null");
		}
		
		if (Properties.Topics == null) {
			throw new RuntimeErrorException(null, "Topics can not be null");
		}
		return super.toComponent();
	}
}
