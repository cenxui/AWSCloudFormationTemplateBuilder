package sns;

import resource.Resource;

/**
 * 
 * @author xenxui
 * 2016/7/23
 */
public class SNSS extends Resource implements Subscriptionable {
	private final SNS mSns;

	private SNSS(SNS component) {
		super(component);
		mSns = component;
	}
	
	
	/**
	 * 
	 * @return the SNSS instance
	 */
	public static SNSS getSNS() {
		SNS sns = new SNS();
		SNSS snss = new SNSS(sns);
		return snss;
	}
	
	public void setDisplayName(String displayName) {
		mSns.setDisplayName(displayName);
	}
	
	public void setTopicName(String topicName) {
		mSns.setTopicName(topicName);
	}

	@Override
	public Subscriptionable addSubscription(String subscription) {
		mSns.addSubscription(subscription);
		return this;
	}
}
