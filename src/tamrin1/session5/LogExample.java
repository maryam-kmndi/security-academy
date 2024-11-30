package tamrin1.session5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogExample {

	private static final Logger logger = Logger.getLogger(LogExample.class.getName());
	
	public static void main(String[] args) {
		//commonly put it any where we gonna take sth from user such as user name
		logger.warning("This is warning msg.");
		logger.setLevel(Level.SEVERE);
	}

}
