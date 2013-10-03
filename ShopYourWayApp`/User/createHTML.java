
package User;

import com.hp.gagawa.java.elements.Body;
import com.hp.gagawa.java.elements.H1;
import com.hp.gagawa.java.elements.Head;
import com.hp.gagawa.java.elements.Html;
import com.hp.gagawa.java.elements.Text;
import com.hp.gagawa.java.elements.Title;

/**
 * Uses Gagawa to build a very very simple web-page.
 * Demonstrates the usage of Html, Head, Title, Body,
 * and H1.
 * @author kolichko Mark Kolich
 *
 */
public class createHTML {

        /**
         * @param args
         */
        public static void main ( String [] args ) {
                
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
                body.appendChild( h1 );
                
                System.out.println( html.write() );

        }

}
