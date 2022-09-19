package aditiIngle;
class StudentInfo{
	void studentName(String name, String middleName, String lastName){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(lastName);
	}
	void studentOtherDetails(String birthdate, String address, int rollno){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
	}
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shikha","Amit","Patel");
		studentInfo.studentName("10th Aug 1998","G-809, Heaven Apparment, Baner, Pune","34");		
	}
}