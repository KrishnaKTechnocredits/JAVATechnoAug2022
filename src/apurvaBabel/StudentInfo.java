package apurvaBabel;

class StudentInfo{
	String name = "Apurva";
	String middleName = "Rasik";
	String surname = "Babel";
	String birthdate = "17th Mar 2000";
	String address = "G-902,Heaven Apartment,Baner,Pune.";
	int rollNumber = 32;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}