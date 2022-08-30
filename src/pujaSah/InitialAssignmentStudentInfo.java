package pujaSah;

public class InitialAssignmentStudentInfo {
	int rollNumber = 10;
	String name = "Shikha";
	String middleName = "Amit";
	String surName = "Patel";
	String birthDate = "10th August 1998";
	String address = "G-809, Heaven Apartment, Baner, Pune.";

	void studentName(String fName, String mName, String sName) {
		System.out.println(fName);
		System.out.println(mName);
		System.out.println(sName);
	}

	void studentOtherDetails(int rollNumber, String birthDate, String address) {
		System.out.println(rollNumber);
		System.out.println(birthDate);
		System.out.println(address);
	}

	public static void main(String[] args) {
		InitialAssignmentStudentInfo initialAssignmentStudentInfo = new InitialAssignmentStudentInfo();
		initialAssignmentStudentInfo.studentName(initialAssignmentStudentInfo.name,
				initialAssignmentStudentInfo.middleName, initialAssignmentStudentInfo.surName);
		initialAssignmentStudentInfo.studentOtherDetails(initialAssignmentStudentInfo.rollNumber,
				initialAssignmentStudentInfo.birthDate, initialAssignmentStudentInfo.address);
	}
}
