package User;
//import User.TestUserInfo;
//import com.hp.gagawa.java.Document;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import com.hp.gagawa.java.elements.Body;
import com.hp.gagawa.java.elements.H1;
import com.hp.gagawa.java.elements.Head;
import com.hp.gagawa.java.elements.Html;
import com.hp.gagawa.java.elements.Text;
import com.hp.gagawa.java.elements.Title;
//import com.hp.gagawa.java.elements.Img;
import com.hp.gagawa.java.elements.Div;
import com.hp.gagawa.java.elements.Br;
import com.restfb.json.JsonArray;
import com.restfb.json.JsonObject;
public class buildHTML {
   	/**
	import com.hp.gagawa.java.elements.H1;
   	 * This class is a temporary class for building static HTML pages
     * @param args
   	 * @throws FileNotFoundException
   	 * @author Roni 
     */
    public static void main ( String [] args ) throws FileNotFoundException {
            Html html = new Html();
            Head head = new Head();
            
            html.appendChild( head );            
            
            Title title = new Title();
            title.appendChild( new Text("Page Title") );
            head.appendChild( title );
            //Img headImage = new Img( "top", "2013-08-07_1332.png" );
            //head.appendChild(headImage);
            Body body = new Body();             
            body.setBgcolor("#F4F2FA");
            html.appendChild( body );
            H1 h1 = new H1();
            UserInfo userInformation = new UserInfo("CAACEdEose0cBAOIGc59QJQeTlkhZCXLU7mZBg9ayvrpmh0xpsqxyx8l8jdi6LMeCZBIHbfBJhA3M5BCbpwm1ZBnACNyJDupHBcfF050jTGNOfhAd0bDBK2STbkNqbgb2GID3bcNhKwoMftdXfrFTyul4DLAi8o9hCBNGHWGZCN9qCpYslOpgm4WZCPIGekM44ZD"); 
            JsonArray user = userInformation.getLikesAsJson();
            h1.appendChild( new Text("Page Likes of " + userInformation) );
            //Img image = new Img( "left", "2013-08-07_1332.png" );
            //h1.appendChild(image);
            body.appendChild( h1 );
            for (int i=0; i < user.length(); i++){
            	JsonObject pageData = user.getJsonObject(i);
            	//System.out.println("Curr page: \n" + pageData);
            	String pageName = pageData.getString("name");
            	String pageCategory = pageData.getString("category");
            	String pageId = pageData.getString("id");
            	String pageCreateDate = pageData.getString("created_time");
            	            	
            	Div pageDiv = new Div();
            	//Img pageImg = new Img("some alt", "fbPageImg.jpg");            	
            	//pageImg.setAlign("absmiddle");
            	//pageDiv.appendChild(pageImg);             	            	           
            	pageDiv.appendText("Page ID: " + pageId);
            	pageDiv.appendChild( new Br() );            	
            	pageDiv.appendText("Page name: " + pageName);
            	pageDiv.appendChild( new Br() );                     	            	            	
            	pageDiv.appendText("Category: " + pageCategory);
            	pageDiv.appendChild( new Br() );
            	pageDiv.appendText("Page Creation Date: " + pageCreateDate);
            	pageDiv.appendChild( new Br() ).appendChild( new Br() ).appendChild( new Br() );
            	body.appendChild(pageDiv);
            }
            //System.out.println(user);
            
            File file = new File("/Users/Roni/Sites/output.html");
    		FileOutputStream fos = new FileOutputStream(file);
    		PrintStream ps = new PrintStream(fos);
    		System.setOut(ps);
    		//System.out.println("OUT TXT");
            System.out.println( html.write() );
            
    }

}
