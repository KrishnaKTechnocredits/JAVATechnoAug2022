package saroj;
class StudentInfo{

	void studentName(String name, String middleName, String surname){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthDate, String address, int rollNumber){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Saroj", "Kumari", "Maurya");
		studentInfo.studentOtherDetails("3rd June 1986","Bangalore", 1);
	}
}