package User;
/**
 * This Class is for testing the UserInfo.getLikesAsJson method.
 * The Token is mine
 * @author Itai Birenshtok
 *
 */
public class TestUserInfo {

	public static void main(String[] args) {
		UserInfo user = new UserInfo("CAACEdEose0cBAHtF88mfbztfUbeUFqJGZA8pKTPC3GSI4tu1UEDnrmxMp6DUsHCn9CZCuePJZCniJgYwvwzcfsU3P4pSfUWsAsN2s6Ir7WJtqi4eE9STcCQeFnSknhZAqHC7v3iTPwMZASZAQDXV5MxshfWqaZC2DEbtjeiNfLBqHXKYqNGVdmyfMDWCwuMqS0ZD");
		System.out.println(user.getLikesAsJson());
	}
}
