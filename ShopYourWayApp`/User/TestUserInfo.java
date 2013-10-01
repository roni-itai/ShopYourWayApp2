package User;

import com.hp.gagawa.java.elements.Body;
import com.hp.gagawa.java.elements.H1;
import com.hp.gagawa.java.elements.Head;
import com.hp.gagawa.java.elements.Html;
import com.hp.gagawa.java.elements.Text;
import com.hp.gagawa.java.elements.Title;
import com.hp.gagawa.java.elements.Div;
//import com.hp.gagawa.java.attributes.*;

/**
 * This Class is for testing the UserInfo.getLikesAsJson method.
 * The Token is mine
 * @author Itai Birenshtok
 *
 */
public class TestUserInfo {

	public static void main(String[] args) {
		UserInfo user = new UserInfo("CAACEdEose0cBAFzLnbPLP1YKLR5q7oMQmN85YkcorDW000loFxEKrHdNYzCDrnFe5rVfzCNgEE6HJxaXN6OGMT940YpDUusN1VsNXlno37n1eUTHCiNvIblAGZC1VWn8tkOdszqKHTfqq4bhQmZBPSsbaxDWo3w9vCLBmlfv4995eFC8f90o8EmHRe7xsZD");
		//System.out.println(user.getLikesAsJson());
		System.out.println(user.getLikesAsJson());
		System.out.println(user.getCover());
	}
	
}


