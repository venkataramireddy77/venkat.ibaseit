package com.ibaseit.learning.logger;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLoggerException {
	private final static Logger LOGGER = Logger.getLogger(MyLoggerException.class.getName());

	public void arrayBoundException() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of int array:");
		int size = sc.nextInt();
		int[] intArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter int value at index " + i + ":");
			intArray[i] = sc.nextInt();
		}
		System.out.println("Enter array index to get the value:");
		int index = sc.nextInt();
		sc.close();
		try {
			// obj.arrayBoundException();
			System.out.println("Value at " + index + " = " + intArray[index]);
		} catch (ArrayIndexOutOfBoundsException a) {
			// log.log(Level.INFO, "This is a log message");
			LOGGER.log(Level.SEVERE, "Exception occur", a);

		}

	}

	public static void main(String[] args) {
		MyLoggerException obj = new MyLoggerException();
		LOGGER.info("Logger Name: " + LOGGER.getName());

		LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
		obj.arrayBoundException();
	}
}