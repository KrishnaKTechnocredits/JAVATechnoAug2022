package adittyThakare;

class StudentInfo{
	String name ="Aditty", middleName = "V", surname = "Thakare", birthdate= "10 April 1989", address = "204, Mantri Park, Kothrud - 411056";
	int rollNo= 20;
	
	void studentName(String name, String middleName, String surname){
		System.out.println("Name: "+name);
		System.out.println("Middle Name: "+middleName);
		System.out.println("Surname: "+surname);
	}
	
	void studentOtherDetails(String birthdate, String address, int rollNo){
		System.out.println("Birthdate: "+birthdate);
		System.out.println("Address: "+address);
		System.out.println("Roll Number: "+rollNo);
	}

	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName(studentInfo.name, studentInfo.middleName, studentInfo.surname);
		studentInfo.studentOtherDetails(studentInfo.birthdate, studentInfo.address, studentInfo.rollNo);
	}
}		
		