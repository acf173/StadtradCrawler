/*
 * Author: Andreas Loeffler
 * E-Mail: andreas.loeffler@haw-hamburg.de 
 */

package stadtradcrawl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;

public class App extends TimerTask {
	
	public static void main(String[] args) {
		
		/*Create Timer. Time will execute every hour.*/
		Timer timer = new Timer();
		timer.schedule(new App(), 1000, 3600000);

	}

	@Override
	public void run(){
		WebCrawler crawler;
		try {
			crawler = new WebCrawler("http://api.citybik.es/v2/networks/stadtrad?fields=stations");
			crawler.showData();	
		} catch (JSONException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
