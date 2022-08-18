import com.linkall.source.aws.utils.AwsHelper;
import com.linkall.source.aws.utils.SNSUtil;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;

public class Test {
    public static void main(String[] args) {
        AwsHelper.checkCredentials();
        SnsClient snsClient = SnsClient.builder().region(Region.of("us-west-2")).build();
        SNSUtil.unSubHTTPS(snsClient, "arn:aws:sns:us-west-2:843378899134:TestTopic:724f067f-d1cd-4335-bc11-8701d0b97ac4");
    }
}
