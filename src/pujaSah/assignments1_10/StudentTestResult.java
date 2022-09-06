package pujaSah.assignments1_10;

public class StudentTestResult {

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
		StudentTestResult studentTestResult = new StudentTestResult();
		studentTestResult.processResult("Rahul", 7);
		studentTestResult.processResult("Kavita", 99);
		studentTestResult.processResult("Priya", 30);
		studentTestResult.processResult("Anjali", 200);
		studentTestResult.processResult("Nikita", -67);
	}
}
