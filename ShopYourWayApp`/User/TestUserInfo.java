package User;
/**
 * This Class is for testing the UserInfo.getLikesAsJson method.
 * The Token is mine
 * @author Itai Birenshtok
 *
 */
public class TestUserInfo {

	public static void main(String[] args) {
		UserInfo user = new UserInfo("CAACEdEose0cBAChXmIHdw0BQZBfzvLLPb6KF8bZAOQYKVkNyrc7lYQLmWUi3DKt707VxMo1K5a2T3FmUPpBpqbNDwrhCKZBugDAkG6bSfUHTaMZCob2DB6g5NZCVRukGFDiRy08pgxRuV6EiJYfLjbZBZBEHgr6EfwdCIZCSWIqcXb5TPqhPqnZCZAjwkztiXBq5qVKnHmZAej5lgZDZD");
		System.out.println(user.getLikesAsJson());
	}
}
