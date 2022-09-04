package pujaSah;

public class InitialAssignmentStudentInfo2 {
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
		InitialAssignmentStudentInfo2 initialAssignmentStudentInfo2 = new InitialAssignmentStudentInfo2();
		initialAssignmentStudentInfo2.studentName();
		initialAssignmentStudentInfo2.studentOtherDetails(initialAssignmentStudentInfo2.rollNumber,
				initialAssignmentStudentInfo2.birthDate);
	}
}
