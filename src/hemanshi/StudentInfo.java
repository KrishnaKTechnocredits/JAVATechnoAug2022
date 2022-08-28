package hemanshi;
class StudentInfo{
	void studentName(String name ,String middleName ,String surename){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surename);
		
	}
	
	void studentDetails(String birthdate ,String address ,int rollNo){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNo);
		
	}
	public static void main(String args[]){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Shikha","Amit","Patel");
		studentinfo.studentDetails("10th Aug 1998","Heaven Apartment",34);
		
	}
	
}