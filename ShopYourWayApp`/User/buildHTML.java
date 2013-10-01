package User;
import User.TestUserInfo;
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
import com.hp.gagawa.java.elements.Img;
//import com.hp.gagawa.java.elements.Div;
public class buildHTML {
   	/**
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
            title.appendChild( new Text("Example Page Title") );
            head.appendChild( title );
            
            Body body = new Body();
            html.appendChild( body );
            H1 h1 = new H1();
            h1.appendChild( new Text("Example Page Header") );
            Img image = new Img( "left", "2013-08-07_1332.png" );
            h1.appendChild(image);
            body.appendChild( h1 );
            File file = new File("/Users/Roni/Sites/output.html");
    		FileOutputStream fos = new FileOutputStream(file);
    		PrintStream ps = new PrintStream(fos);
    		System.setOut(ps);
    		System.out.println("This goes to out.txt");
            System.out.println( html.write() );
            
    }

}
