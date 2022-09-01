package pujaSah;

public class InitialAssignmentStudentTestResult {

	void processResult(String name, int marks) {
		if (marks >= 0 && marks <= 49) {
			System.out.println(name + ":Score is " + marks + ",failed");
		} else if (marks >= 50 && marks <= 100) {
			System.out.println(name + ":Score is " + marks + ",passed");
			if (marks >= 50 && marks <= 60) {
				System.out.println("Grade is C");
			}
			if (marks >= 61 && marks <= 70) {
				System.out.println("Grade is B");
			}
			if (marks >= 71 && marks <= 80) {
				System.out.println("Grade is B+");
			}
			if (marks >= 81 && marks <= 90) {
				System.out.println("Grade is A");
			}
			if (marks >= 91 && marks <= 100) {
				System.out.println("Grade is A+");
			}
		} else {
			System.out.println(name + ":Invalid score:  " + marks);
		}
	}

	public static void main(String[] args) {
		InitialAssignmentStudentTestResult initialAssignmentStudentTestResult = new InitialAssignmentStudentTestResult();
		initialAssignmentStudentTestResult.processResult("Rahul", 7);
		initialAssignmentStudentTestResult.processResult("Kavita", 99);
		initialAssignmentStudentTestResult.processResult("Priya", 30);
		initialAssignmentStudentTestResult.processResult("Anjali", 200);
		initialAssignmentStudentTestResult.processResult("Nikita", -67);
	}
}
