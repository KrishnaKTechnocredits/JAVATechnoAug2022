package narendraD;

class StudentInfo{
	String name = "Akshay";
	String middleName = "Prakash";
	String surname = "Rathod";
	String birthdate = "21 Dec 1995";
	String address = "Flat No. A-29, Tower2, Amanora City, Hadapsar, Pune";
	int rollNumber = 3;
	
	void studentName(String firstName, String middleName, String surname) {
		
		System.out.println("First Name: "+firstName);
		System.out.println("Middle Name: "+middleName);
		System.out.println("Surname: "+surname);
		
	}
	
	void studentOtherDetails(String birthdate, String address, int rollNum) {
		
		System.out.println("Birthdate: "+birthdate );
		System.out.println("Address: "+address );
		System.out.println("Roll Number: "+rollNum );
		
	}
	
	public static void main (String[] args) {
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName(studentinfo.name, studentinfo.middleName, studentinfo.surname);
		studentinfo.studentOtherDetails(studentinfo.birthdate, studentinfo.address, studentinfo.rollNumber);
	}
	
	
}