package rohanNaik.basicPrograms;

class StudentInfo{
	
	int rollNumber;
	String name;
	String middlename;
	String surname;
	String birthdate;
	String address;
	
	void studentName(String name, String middlename, String surname){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails(int rollNumber, String birthdate, String address){
		System.out.println(rollNumber);
		System.out.println(birthdate);
		System.out.println(address);
	}	
	
	public static void main(String[] args){
		StudentInfo student = new StudentInfo();
		System.out.println("------------------------------------------------");
		student.studentName("Shikha","Amit","Patel");
		student.studentOtherDetails(34,"10th Aug 1998","G-809, Heaven Apartment, Baner, Pune.");	
		System.out.println("------------------------------------------------");		
	}
}