package Task18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	private Logger() {}
	
	private static final class loggerHolder{
		private static final Logger
		INSTANCE = new Logger();
	}
	
	public static Logger getINSTANCE() {
		return loggerHolder.INSTANCE;
	}

		public void log(String message) {
			String timestamp = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date());
			System.out.println("["+timestamp+"] "+message);
		}
		
		public static void main(String[] args) {
			Logger logger = Logger.getINSTANCE();
			logger.log("HEllo");
		}
}
