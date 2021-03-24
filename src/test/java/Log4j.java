import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger("Log4j");
		//DOMConfigurator.configure("log4j.xml");
		PropertyConfigurator.configure("log4j.properties");
		log.info("started");
		
		if(false)
		{
			log.info("true");
		}
		else
		{
			log.info("false");
		}
	}

}
