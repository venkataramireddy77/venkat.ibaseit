package com.ibaseit.learning.studentdetailsoperations;

public class StudentsDetails {
	private String studentname;
	private int rollnumber;
	private String result;

	public StudentsDetails(String studentname, int rollnumber, String result) {
		super();
		this.studentname = studentname;
		this.rollnumber = rollnumber;
		this.result = result;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentname=" + studentname + ", rollnumber=" + rollnumber + ", result=" + result + "]";
	}

/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		

		// it checks if the argument is of the type Customer by comparing the classes
		// of the passed argument and this object.
		// if(!(obj instanceof Customer)) return false; ---> avoid.
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		

		// type casting of the argument.
		StudentsDetails customer = (StudentsDetails) obj;
		if (customer.getStudentname().equals(this.studentname) && (customer.getRollnumber() == this.rollnumber))
			return true;

		return false;
	}*/

/*	public String getStudentname() {
		return studentname;
	}
*/
	

	public int getRollnumber() {
		return rollnumber;
	}

	
	/*public String getResult() {
		return result;
	}*/

	
}