package com.ibaseit.learning.studentdetailsoperations;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class StudentDetailsOperBussinessLogic {

	List<StudentsDetails> list = new ArrayList<StudentsDetails>();
	/*final Logger logger = Logger.getLogger(StudentDetailsOperBussinessLogic.class);*/
	

	/*public List<StudentsDetails> getting(int i) {

		System.out.println(list.get(i));
		return list;
	}*/

	public List<StudentsDetails> removing(int i, List<StudentsDetails> list) {

		/*
		 * System.out.println(list.remove(i));
		 * System.out.println("After removing elements are:"+list); // list.remove(i);
		 * return list;
		 */
		/*
		 * try { list.remove(i);
		 * 
		 * 
		 * 
		 * } catch (ArrayIndexOutOfBoundsException e) { logger.
		 * error("The number is which you have gaven doesn't exists among index values",
		 * e); } return list;
		 *//*
			 * BasicConfigurator.configure();
			 * 
			 * try { list.remove(i); }catch (Exception e) { //throw new
			 * ArrayIndexOutOfBoundsException("**************"); System.out.println(new
			 * Exception("index size is out")); logger.debug("The give index is Invalid!");
			 * }
			 */
		/*if (list.size() < i) {
			// runtime exception
			excep.outOfBoundRemoveImpl(list, i);
		}*/

	

			System.out.println("This current element is removed " + list.remove(i));
			System.out.println("After Removing an element ");
			System.out.println(list);
			System.out.println("\n");

		return list;

	}

	public List<StudentsDetails> adding(StudentsDetails studentsDetails, List<StudentsDetails> list) {
		/*if (list.size() < 0) {
			// runtime exception
			excep. outOfBoundAddingImpl();
		}*/

		
			System.out.println("This current element is added " + list.add(studentsDetails));
			System.out.println("After Adding an element ");
			System.out.println(list);
			System.out.println("\n");
		

		return list;
		/*
		 * System.out.println("before adding elements in the list:"+list);
		 * System.out.println(list.add(studentsDetails)); return list;
		 */
	}

	/*
	 * public List<StudentsDetails> updating(StudentsDetails studentsDetails) {
	 * System.out.println(list.add(studentsDetails));
	 * 
	 * System.out.println(list); return list; }
	 */

	public List<StudentsDetails> updating(String name, int roll, String marks, List<StudentsDetails> list) {

		System.out.println("Before updating an element ");
		System.out.println(list);
		System.out.println("\n");

		List<StudentsDetails> load = new CopyOnWriteArrayList<StudentsDetails>(list);
		for (StudentsDetails b : list) {
			/*if (b.getRollnumber() != roll) {

				excep.listElementNotFoundImpl();

			}*/

			

				// for (StudentDetails b : stu) {
				if (b.getRollnumber() == roll) {
					load.remove(b);
					
					load.add(new StudentsDetails(name, roll, marks));
					System.out.println("After updating an element ");
					System.out.println(load);
				}
			}
		

		return load;
		
	}

}
