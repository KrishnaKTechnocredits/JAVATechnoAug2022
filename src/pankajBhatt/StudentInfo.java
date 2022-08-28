package pankajBhatt;

//Print all details of student, like: Name, Middle Name, Sir Name,
//	BirthDate, Address and rollNumber

class StudentInfo{

	String firstName = "Pankaj";
	String middleName = ".";
	String lastName = "Bhatt";
	String birthDate = "3rd May 1997";
	String address = "Sparrow Colony, Old Dhanmil, bareilly Road, talli Haldwani, Nainital, 263139";
	int rollNumber = 705113;
	
	void studentName(){
		System.out.println("Student's full Name : "+firstName+" "+middleName+" "+lastName);
	}
	
	void studentOtherDetails(){
		System.out.println("Student's Birthdate : "+birthDate);
		System.out.println("Student's address : "+address);
		System.out.println("Student's roll Number : "+rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo student1 = new StudentInfo();
		student1.studentName();
		student1.studentOtherDetails();
	}
}
