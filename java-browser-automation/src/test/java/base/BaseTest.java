package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;

/**
 * TODO update the comments to describe the class
 *
 */

public class BaseTest {
	
	protected static Logger logger; 
	
	@BeforeTest
	public void initialize() {
		/* Set the path of log4j configuration file */
		System.setProperty("log4j.configurationFile", System.getProperty("user.dir") + 
				"\\src\\test\\resources\\properties\\log4j2.properties");	
		logger = LogManager.getLogger(BaseTest.class);
		
		logger.info("Logger initialized");
		
	}
	

}
