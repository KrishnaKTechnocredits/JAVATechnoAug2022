// Komal Shrivastava
// Assignment 5 - Program 1
package komalShrivastava;

class StudentDetails {

	String name; String middleName; String lastName; String address;
	int rollNo;
	
	void studentName(String name, String middleName, String surname) {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthDate, String address, int rollNo) {
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main(String[] args) {
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.studentName("Komal", "Krishnakumar", "Shrivastava");
		studentDetails.studentOtherDetails("08-Nov-92", "36, Downtown Street, Pune-99", 01);
	}
}	
		