package com.ibaseit.learning.logger;
/*package com.ibaseit.learning.studentdetailsoperations;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

@SuppressWarnings("serial")
public class OutOfBound extends Exception {

	final Logger logger = Logger.getLogger(OutOfBound.class);
	FileAppender fileAppender = new FileAppender();
	String conversionPattern = "%-7p %d [%t] %c %x - %m%n";
	PatternLayout layout = new PatternLayout();

	public void outOfBoundRemoveImpl(List<StudentsDetails> stu, int i) {
		BasicConfigurator.configure();
		try {
			stu.remove(i);

		} catch (Exception e) {

			System.out.println(new Exception("index size is out"));

			fileAppender.setFile("D://ExceptionFileStoreforRemoving.txt");
			fileAppender.setLayout(layout);
			layout.setConversionPattern(conversionPattern);
			fileAppender.activateOptions();
			logger.addAppender(fileAppender);
			logger.setLevel(Level.DEBUG);
			logger.debug("The give index is Invalid!");

		}
	}

	public void outOfBoundAddingImpl() {
		BasicConfigurator.configure();
		try {
			// stu.add(new StudentsDetails(studentname, rollnumber, result));
			throw new Exception("list is empty");

		} catch (Exception e) {

			  System.out.println("The List is Empty");
	            fileAppender.setFile("D://ExceptionFileStoreforAdding.txt");
	            fileAppender.setLayout(layout);
	            layout.setConversionPattern(conversionPattern);
	            fileAppender.activateOptions();
	            logger.addAppender(fileAppender);
	            logger.setLevel(Level.FATAL);
	            logger.fatal("The give index is Invalid!");

	 
		}

	}

	public void listElementNotFoundImpl() {
		BasicConfigurator.configure();
		try {
			throw new Exception("List Item not found empty");

		} catch (Exception e) {

			System.out.println("The Roll is not found");
			fileAppender.setFile("D://ExceptionFileStoreforupdating.txt");
			fileAppender.setLayout(layout);
			layout.setConversionPattern(conversionPattern);
			fileAppender.activateOptions();
			logger.addAppender(fileAppender);
			logger.setLevel(Level.INFO);
			logger.info("The give index is Invalid!");
		}
	}
	

	 

}
*/