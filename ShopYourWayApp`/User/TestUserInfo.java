package User;

/**
 * This Class is for testing the UserInfo.getLikesAsJson method.
 * The Token is temporary
 * @author Itai Birenshtok
 *
 */
public class TestUserInfo {

	public static void main(String[] args) {
		UserInfo user = new UserInfo("CAACEdEose0cBAFzLnbPLP1YKLR5q7oMQmN85YkcorDW000loFxEKrHdNYzCDrnFe5rVfzCNgEE6HJxaXN6OGMT940YpDUusN1VsNXlno37n1eUTHCiNvIblAGZC1VWn8tkOdszqKHTfqq4bhQmZBPSsbaxDWo3w9vCLBmlfv4995eFC8f90o8EmHRe7xsZD");
		System.out.println(user.getLikesAsJson());
		
	}
	
}


