package com.ibaseit.learning.studentdetailsoperations;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestListOfStudents {

	ListOfStudents obj1 = new ListOfStudents();
	StudentsDetails details;
	StudentDetailsOperBussinessLogic sdetails = new StudentDetailsOperBussinessLogic();
	// List<StudentDetailsOperations> list2 = new
	// ArrayList<StudentDetailsOperations>();
	List<StudentsDetails> list2 = new ArrayList<StudentsDetails>();

	@Test
	public void testAdd() {
		List<StudentsDetails> ex = sdetails.adding(new StudentsDetails("danni", 4, "pass"), list2);

		list2.add(new StudentsDetails("danni", 4, "pass"));
		
		// obj1.add(new StudentDetails("danni", 8, "pass"));
		assertNotEquals(list2, ex);
		sdetails.adding(new StudentsDetails("cortex", 7, "fail"), list2);
	
		
	}

	@Test
	public void testRemove() {
		List<StudentsDetails> ex = sdetails.adding(new StudentsDetails("danni", 4, "pass"), list2);

		assertEquals(list2, ex);

		List<StudentsDetails> ex1 = sdetails.removing(0, list2);
		assertEquals(list2, ex1);

		sdetails.adding(new StudentsDetails("danni", 4, "pass"), list2);
		
	}

	@Test
	public void testUpdate() {
		List<StudentsDetails> ex1 = sdetails.updating("danni", 4, "fail", list2);
		list2.add(new StudentsDetails("danni", 4, "fail"));
		assertNotEquals(list2, ex1);
	
	
	}
	

}