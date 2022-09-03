package shrutiArora;
public class StudentInfo {
	String name;
	String midName;
	String surName;
	String birthDate;
	String address;
	int rollNo;
	void studentName(){
		name = "Shikha";
		midName = "Amit";
		surName = "Patel";
		System.out.println(name);
		System.out.println(midName);
		System.out.println(surName);
	}
	void studentOtherDetails(){
		birthDate = "10th Aug 1998";
		address = "G-809,Heaven Apartment, Baner,Pune";
		rollNo = 34;
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	public static void main(String[] arg){
		StudentInfo studentinfo =new StudentInfo();
		System.out.println("****************************StudentInformation******************************");
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}