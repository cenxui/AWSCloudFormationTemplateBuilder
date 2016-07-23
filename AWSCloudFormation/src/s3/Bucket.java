package s3;

import java.util.List;

import resource.Component;

public class Bucket extends Component {
	
	public final String Type = "AWS::S3::Bucket";
	
	private class Properties {
		String AccessControl;
		String BucketName;
		String CorsConfiguration;
		String LifecycleConfiguration;
		String LoggingConfiguration;
		String NotificationConfiguration;
		String ReplicationConfiguration;
		List<String> Tags;
		String VersioningConfiguration;
		String WebsiteConfiguration;
	}
}
