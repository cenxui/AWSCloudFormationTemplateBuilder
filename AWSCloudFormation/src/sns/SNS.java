package sns;

import java.util.ArrayList;
import java.util.List;

import resource.Component;

public class SNS extends Component {
	public final String Type = "AWS::SNS::Topic";
	
	private final Properties Properties = new Properties();
	
	private class Properties {
		@SuppressWarnings("unused")
		String DisplayName;
		List<String> Subscription;
		@SuppressWarnings("unused")
		String TopicName;
	}
	
	public void setDisplayName(String displayName) {
		Properties.DisplayName =  displayName;
	}
	
	public SNS addSubscription(String subscription) {
		if (Properties.Subscription == null) {
			Properties.Subscription  = new ArrayList<>();
		}
		Properties.Subscription.add(subscription);
		return this;
	}
	
	public void setTopicName(String topicName) {
		Properties.TopicName = topicName;
	}
}
