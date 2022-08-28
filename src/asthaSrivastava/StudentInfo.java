package asthaSrivastava;

public class StudentInfo {   //Program 1 24Aug22
	void studentName(String name, String middleName, String surName){
		System.out.println("Name is "+ name);
		System.out.println("Middle name as "+ middleName);
		System.out.println("Surname is "+ surName);
		}
		
	void studentOtherDetails(String birthdate,String address, int rollNumber){
		System.out.println("Birthdate is "+birthdate);
		System.out.println("Address is "+address);
		System.out.println("RollNumber is "+rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		
		studentInfo.studentName("Shikha" ,"Kumari","Patel");
		studentInfo.studentOtherDetails("10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune", 34);
	}
}