package hardikBhatia;

public class StudentInfo {
	void studentName(String name, String middleName, String surName){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
	}
	void studentOtherDetails(String birthdate, String address, int rollNumber){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Hardik","Dineshbhai","Bhatia");
		studentInfo.studentOtherDetails("11 March 1992","13/Sukhsanti Society,Madodhar road, Waghodia, Vadodara.",1);
	}
}
