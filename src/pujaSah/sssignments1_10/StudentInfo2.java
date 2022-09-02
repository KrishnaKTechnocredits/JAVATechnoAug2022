package pujaSah.sssignments1_10;

public class StudentInfo2 {
	int rollNumber = 10;
	String name = "Shikha";
	String middleName = "Amit";
	String surName = "Patel";
	String birthDate = "10th August 1998";
	String address = "G-809, Heaven Apartment, Baner, Pune.";

	void studentName() {
		System.out.println(this.name);
		System.out.println(this.middleName);
		System.out.println(this.surName);
	}

	void studentOtherDetails(int rollNumber, String birthDate) {
		System.out.println(rollNumber);
		System.out.println(birthDate);
		System.out.println(this.address);
	}

	public static void main(String[] args) {
		StudentInfo2 studentInfo2 = new StudentInfo2();
		studentInfo2.studentName();
		studentInfo2.studentOtherDetails(studentInfo2.rollNumber,studentInfo2.birthDate);
	}
}
