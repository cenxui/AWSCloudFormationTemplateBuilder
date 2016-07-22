package ec2.internetgateway;

import resource.Resource;
import resource.Tagable;

/**
 * 
 * @author xenxui
 * 2016/7/22
 */
public class InternetGateways extends Resource implements Tagable {
	private final InternetGateway mInternetGateway;

	private InternetGateways(InternetGateway component) {
		super(component);
		mInternetGateway = component;
	}
	
	public static InternetGateways getInternetGateway() {
		InternetGateway internetGateway = new InternetGateway();
		InternetGateways internetGateways = new InternetGateways(internetGateway);
		return internetGateways;
	}

	@Override
	public Tagable addTag(String tag) {
		mInternetGateway.addTag(tag);
		return this;
	}

}
