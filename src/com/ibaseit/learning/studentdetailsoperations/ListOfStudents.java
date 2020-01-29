package com.ibaseit.learning.studentdetailsoperations;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudents {
	static List<StudentsDetails> list = new ArrayList<StudentsDetails>();

	public static void main(String[] args) {

		StudentDetailsOperBussinessLogic sdetails = new StudentDetailsOperBussinessLogic();
		list = new ArrayList<StudentsDetails>();
		list.add(new StudentsDetails("ramu", 1, "fail"));
		list.add(new StudentsDetails("rajesh", 2, "pass"));
		list.add(new StudentsDetails("raj", 3, "pass"));

		sdetails.adding(new StudentsDetails("rakesh", 6, "fail"), list);
		sdetails.removing(1, list);
        sdetails.updating("rakesh", 6, "pass", list);

	}

}
