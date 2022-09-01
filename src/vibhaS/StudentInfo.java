package vibhaS;
class StudentInfo{
	
	void studentName(String name,String middleName,String surname){
		System.out.println("Student Name is => "+name);
		System.out.println("Student middle Name is => "+middleName);
		System.out.println("Student Surname is =>"+surname);
	}
	
	void studentOtherDetails(String birthDate,String address,int rollNumber){
		System.out.println("Student Birthdate is => "+birthDate);
		System.out.println("Student Address is =>"+address);
		System.out.println("Student rollNumber is =>"+rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.studentName("Shikha","Amit","Patel");
		studentInfo.studentOtherDetails("10th Aug 1998","G-809,Heaven Apartment,Baner,Pune",34);
	}
}