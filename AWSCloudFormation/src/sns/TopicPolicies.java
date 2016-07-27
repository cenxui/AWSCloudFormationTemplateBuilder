package sns;

import resource.Resource;
/**
 * 
 * @author xenxui
 * 2016/7/23
 */
public class TopicPolicies extends Resource implements Topicable {

	private final TopicPolicy mTopicPolicy;
	
	private TopicPolicies(TopicPolicy component) {
		super(component);
		mTopicPolicy = component;
	}
	
	public static TopicPolicies geTopicPolicy() {
		TopicPolicy topicPolicy = new TopicPolicy();
		TopicPolicies topicPolicies = new TopicPolicies(topicPolicy);
		return topicPolicies;
	}
	
	public void setPolicyDocument(String policyDocument) {
		mTopicPolicy.setPolicyDocument(policyDocument);
	}
	

	@Override
	public Topicable addTopic(String topic) {
		mTopicPolicy.addTopic(topic);
		return this;
	}
}
