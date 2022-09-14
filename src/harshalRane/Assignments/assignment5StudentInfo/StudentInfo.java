package harshalRane.Assignments.assignment5StudentInfo;

class StudentInfo{
	
	void studentName(String name, String middleName, String surname){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentDetails(String birthdate, String address, int rollNumber){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Harshal", "Dhiraj", "Rane");
		studentInfo.studentDetails("27th Aug 1989", "ABC, 10, Pune-411033", 10);
	}
}