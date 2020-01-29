package com.ibaseit.learning.logger;

import java.util.logging.Logger;

import java.util.logging.Level;
import java.util.logging.LogManager;

public class MyLogger {
	private final static Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

	public void makeSomeLog() {

		LOGGER.log(Level.INFO, "My first Log Message");

		// A log of INFO level with the message "My First Log Message"
	}

	public static void main(String[] args) {
		MyLogger obj = new MyLogger();
		obj.makeSomeLog();

	/*	LogManager lgmngr = LogManager.getLogManager();

		Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
*/
		LOGGER.log(Level.INFO, "This is a log message");
	}

}
