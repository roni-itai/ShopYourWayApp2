package User;
import com.restfb.FacebookClient;
import com.restfb.json.JsonArray;
import com.restfb.json.JsonObject;
import com.restfb.types.User;
import com.restfb.DefaultFacebookClient;


/**
 * This class holds the UserInfo
 * @author Itai Birenshtok
 *
 */
public class UserInfo {
	
	/**
	 * Class fields
	 */
	private String UserID;
	private FacebookClient facebookClient;
	
	/**
	 * Constructor
	 * @param MY_ACCESS_TOKEN
	 */
	public UserInfo (String MY_ACCESS_TOKEN) {
		FacebookClient facebookClient = new DefaultFacebookClient(MY_ACCESS_TOKEN);
		this.facebookClient = facebookClient;
		User user = facebookClient.fetchObject("me", User.class);
		this.UserID = user.getId();
	}
	
	/**
	 * This method returns all the pages that the user likes
	 * @return The likes as a JsonArray
	 */
	public JsonArray getLikesAsJson () {
		JsonObject photosConnection = facebookClient.fetchObject(this.UserID + "/likes", JsonObject.class);
		JsonArray likesArray = photosConnection.getJsonArray("data");
		return likesArray;
	}
}
