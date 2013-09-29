import java.util.List;

import com.restfb.Connection;
import com.restfb.FacebookClient;
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.restfb.types.User;
import com.restfb.DefaultFacebookClient;


public class TestRestFB {

	public static void main(String[] args) {
		String MY_ACCESS_TOKEN = "CAACEdEose0cBANHx3onXVuqD6iyW0xcqDDvbcDZCnLbaZCkQBqplKG7dSwVy40qRQQlq6qRycZAwSZCFxk9DwXfNGV3dVcAysrDDVCunOMB1OEqZCv133jqx7xoXr8ZB8B0rUErdrbveoBMGZBUKT6Ieo0ZBgnLfwXzuxQqQFDN0dPTMnamgAJLLXvHZCn65S1xl9EZCSI6sQt7wZDZD";
		FacebookClient facebookClient = new DefaultFacebookClient(MY_ACCESS_TOKEN);
		User user = facebookClient.fetchObject("me", User.class);
		Page page = facebookClient.fetchObject("cocacola", Page.class);

		System.out.println("RelationshipStatus: " + user.getRelationshipStatus());

	}

}
